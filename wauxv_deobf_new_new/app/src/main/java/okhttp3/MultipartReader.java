package okhttp3;

import com.alibaba.fastjson2.JSONWriter;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.HeadersReader;
import p000.AbstractC0055;
import p000.AbstractC0580;
import p000.AbstractC0985;
import p000.AbstractC1469;
import p000.AbstractC2844;
import p000.C0481;
import p000.C0516;
import p000.C2335;
import p000.C2531;
import p000.C2707;
import p000.C3458;
import p000.C3459;
import p000.InterfaceC0485;
import p000.InterfaceC2846;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final C2335 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final C0516 crlfDashDashBoundary;
    private PartSource currentPart;
    private final C0516 dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final InterfaceC0485 source;

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0985 abstractC0985) {
            this();
        }

        public final C2335 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Part implements Closeable {
        private final InterfaceC0485 body;
        private final Headers headers;

        public Part(Headers headers, InterfaceC0485 interfaceC0485) {
            this.headers = headers;
            this.body = interfaceC0485;
        }

        public final InterfaceC0485 body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    /* JADX INFO: compiled from: obf */
    public final class PartSource implements InterfaceC2846 {
        private final C3459 timeout = new C3459();

        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (AbstractC1469.m3322(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // p000.InterfaceC2846
        public long read(C0481 c0481, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount < 0: ").toString());
            }
            if (!AbstractC1469.m3322(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            C3459 c3459Timeout = MultipartReader.this.source.timeout();
            C3459 c3459 = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long jTimeoutNanos = c3459Timeout.timeoutNanos();
            C3458 c3458 = C3459.Companion;
            long jTimeoutNanos2 = c3459.timeoutNanos();
            long jTimeoutNanos3 = c3459Timeout.timeoutNanos();
            c3458.getClass();
            if (jTimeoutNanos2 == 0 || (jTimeoutNanos3 != 0 && jTimeoutNanos2 >= jTimeoutNanos3)) {
                jTimeoutNanos2 = jTimeoutNanos3;
            }
            c3459Timeout.timeout(jTimeoutNanos2, TimeUnit.NANOSECONDS);
            if (!c3459Timeout.hasDeadline()) {
                if (c3459.hasDeadline()) {
                    c3459Timeout.deadlineNanoTime(c3459.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j);
                    return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(c0481, jCurrentPartBytesRemaining);
                } finally {
                    c3459Timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                    if (c3459.hasDeadline()) {
                        c3459Timeout.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = c3459Timeout.deadlineNanoTime();
            if (c3459.hasDeadline()) {
                c3459Timeout.deadlineNanoTime(Math.min(c3459Timeout.deadlineNanoTime(), c3459.deadlineNanoTime()));
            }
            try {
                long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j);
                return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(c0481, jCurrentPartBytesRemaining2);
            } finally {
                c3459Timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (c3459.hasDeadline()) {
                    c3459Timeout.deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }

        @Override // p000.InterfaceC2846
        public C3459 timeout() {
            return this.timeout;
        }
    }

    static {
        Charset charset = AbstractC0580.UTF_8;
        C0516 c0516 = new C0516("\r\n".getBytes(charset));
        c0516.f2203 = "\r\n";
        C0516 c0517 = new C0516("--".getBytes(charset));
        c0517.f2203 = "--";
        C0516 c0518 = new C0516(" ".getBytes(charset));
        c0518.f2203 = " ";
        C0516 c0519 = new C0516("\t".getBytes(charset));
        c0519.f2203 = "\t";
        afterBoundaryOptions = AbstractC1469.m3340(c0516, c0517, c0518, c0519);
    }

    public MultipartReader(InterfaceC0485 interfaceC0485, String str) {
        this.source = interfaceC0485;
        this.boundary = str;
        C0481 c0481 = new C0481();
        c0481.m1897(0, 2, "--");
        c0481.m1898(str);
        this.dashDashBoundary = c0481.mo1856(c0481.f2128);
        C0481 c0482 = new C0481();
        c0482.m1897(0, 4, "\r\n--");
        c0482.m1897(0, str.length(), str);
        this.crlfDashDashBoundary = c0482.mo1856(c0482.f2128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x0106  */
    /* JADX WARN: Code duplicated, block: B:46:0x011d  */
    public final long currentPartBytesRemaining(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        this.source.mo1884(this.crlfDashDashBoundary.mo1964());
        C0481 c0481Mo1854 = this.source.mo1854();
        C0516 c0516 = this.crlfDashDashBoundary;
        c0481Mo1854.getClass();
        if (c0516.mo1964() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        C2707 c2707 = c0481Mo1854.f2127;
        if (c2707 != null) {
            long j7 = c0481Mo1854.f2128;
            long j8 = 0;
            if (j7 < 0) {
                while (j7 > 0) {
                    c2707 = c2707.f8710;
                    j7 -= (long) (c2707.f8706 - c2707.f8705);
                }
                j2 = 1;
                byte[] bArrMo1966 = c0516.mo1966();
                byte b = bArrMo1966[0];
                int iMo1964 = c0516.mo1964();
                j3 = -1;
                long j9 = (c0481Mo1854.f2128 - ((long) iMo1964)) + 1;
                while (true) {
                    if (j7 < j9) {
                        byte[] bArr = c2707.f8704;
                        j4 = j7;
                        int iMin = (int) Math.min(c2707.f8706, (((long) c2707.f8705) + j9) - j4);
                        int i = (int) ((((long) c2707.f8705) + j8) - j4);
                        while (true) {
                            if (i >= iMin) {
                                j8 = j4 + ((long) (c2707.f8706 - c2707.f8705));
                                c2707 = c2707.f8709;
                                j7 = j8;
                            } else if (bArr[i] == b && AbstractC0055.m1050(c2707, i + 1, bArrMo1966, iMo1964)) {
                                j5 = i - c2707.f8705;
                                j6 = j5 + j4;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            } else {
                j2 = 1;
                j3 = -1;
                long j10 = 0;
                while (true) {
                    long j11 = ((long) (c2707.f8706 - c2707.f8705)) + j10;
                    if (j11 > 0) {
                        break;
                    }
                    c2707 = c2707.f8709;
                    j10 = j11;
                }
                byte[] bArrMo1967 = c0516.mo1966();
                byte b2 = bArrMo1967[0];
                int iMo1965 = c0516.mo1964();
                long j12 = (c0481Mo1854.f2128 - ((long) iMo1965)) + 1;
                while (true) {
                    if (j10 < j12) {
                        byte[] bArr2 = c2707.f8704;
                        j4 = j10;
                        int iMin2 = (int) Math.min(c2707.f8706, (((long) c2707.f8705) + j12) - j4);
                        int i2 = (int) ((((long) c2707.f8705) + j8) - j4);
                        while (true) {
                            if (i2 >= iMin2) {
                                j8 = j4 + ((long) (c2707.f8706 - c2707.f8705));
                                c2707 = c2707.f8709;
                                j10 = j8;
                            } else if (bArr2[i2] == b2 && AbstractC0055.m1050(c2707, i2 + 1, bArrMo1967, iMo1965)) {
                                j5 = i2 - c2707.f8705;
                                j6 = j5 + j4;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
            return j6 == j3 ? Math.min(j, (this.source.mo1854().f2128 - ((long) this.crlfDashDashBoundary.mo1964())) + j2) : Math.min(j, j6);
        }
        j2 = 1;
        j3 = -1;
        j6 = j3;
        if (j6 == j3) {
        }
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws ProtocolException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.mo1881(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.mo1964());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(jCurrentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.mo1964());
        }
        boolean z = false;
        while (true) {
            int iMo1861 = this.source.mo1861(afterBoundaryOptions);
            if (iMo1861 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iMo1861 == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, new C2531(partSource));
            }
            if (iMo1861 == 1) {
                if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iMo1861 == 2 || iMo1861 == 3) {
                z = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(ResponseBody responseBody) throws ProtocolException {
        String strParameter;
        InterfaceC0485 interfaceC0485Source = responseBody.source();
        MediaType mediaTypeContentType = responseBody.contentType();
        if (mediaTypeContentType != null && (strParameter = mediaTypeContentType.parameter("boundary")) != null) {
            this(interfaceC0485Source, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
