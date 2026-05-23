package okhttp3;

import com.alibaba.fastjson2.JSONWriter;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.HeadersReader;
import p000.AbstractC0048;
import p000.AbstractC0599;
import p000.AbstractC0981;
import p000.AbstractC2207;
import p000.AbstractC2784;
import p000.AbstractC3453;
import p000.C0504;
import p000.C0539;
import p000.C2302;
import p000.C2477;
import p000.C2646;
import p000.C3399;
import p000.C3400;
import p000.InterfaceC0508;
import p000.InterfaceC2786;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final C2302 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final C0539 crlfDashDashBoundary;
    private PartSource currentPart;
    private final C0539 dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final InterfaceC0508 source;

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0981 abstractC0981) {
            this();
        }

        public final C2302 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Part implements Closeable {
        private final InterfaceC0508 body;
        private final Headers headers;

        public Part(Headers headers, InterfaceC0508 interfaceC0508) {
            this.headers = headers;
            this.body = interfaceC0508;
        }

        public final InterfaceC0508 body() {
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
    public final class PartSource implements InterfaceC2786 {
        private final C3400 timeout = new C3400();

        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (AbstractC2207.m4087(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // p000.InterfaceC2786
        public long read(C0504 c0504, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC2784.m4746(j, "byteCount < 0: ").toString());
            }
            if (!AbstractC2207.m4087(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            C3400 c3400Timeout = MultipartReader.this.source.timeout();
            C3400 c3400 = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long jTimeoutNanos = c3400Timeout.timeoutNanos();
            C3399 c3399 = C3400.Companion;
            long jTimeoutNanos2 = c3400.timeoutNanos();
            long jTimeoutNanos3 = c3400Timeout.timeoutNanos();
            c3399.getClass();
            if (jTimeoutNanos2 == 0 || (jTimeoutNanos3 != 0 && jTimeoutNanos2 >= jTimeoutNanos3)) {
                jTimeoutNanos2 = jTimeoutNanos3;
            }
            c3400Timeout.timeout(jTimeoutNanos2, TimeUnit.NANOSECONDS);
            if (!c3400Timeout.hasDeadline()) {
                if (c3400.hasDeadline()) {
                    c3400Timeout.deadlineNanoTime(c3400.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j);
                    return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(c0504, jCurrentPartBytesRemaining);
                } finally {
                    c3400Timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                    if (c3400.hasDeadline()) {
                        c3400Timeout.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = c3400Timeout.deadlineNanoTime();
            if (c3400.hasDeadline()) {
                c3400Timeout.deadlineNanoTime(Math.min(c3400Timeout.deadlineNanoTime(), c3400.deadlineNanoTime()));
            }
            try {
                long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j);
                return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(c0504, jCurrentPartBytesRemaining2);
            } finally {
                c3400Timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (c3400.hasDeadline()) {
                    c3400Timeout.deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }

        @Override // p000.InterfaceC2786
        public C3400 timeout() {
            return this.timeout;
        }
    }

    static {
        Charset charset = AbstractC0599.f2413;
        C0539 c0539 = new C0539("\r\n".getBytes(charset));
        c0539.f2247 = "\r\n";
        C0539 c05310 = new C0539("--".getBytes(charset));
        c05310.f2247 = "--";
        C0539 c05311 = new C0539(" ".getBytes(charset));
        c05311.f2247 = " ";
        C0539 c05312 = new C0539("\t".getBytes(charset));
        c05312.f2247 = "\t";
        afterBoundaryOptions = AbstractC3453.m5005(c0539, c05310, c05311, c05312);
    }

    public MultipartReader(InterfaceC0508 interfaceC0508, String str) {
        this.source = interfaceC0508;
        this.boundary = str;
        C0504 c0504 = new C0504();
        c0504.m1803(0, 2, "--");
        c0504.m1804(str);
        this.dashDashBoundary = c0504.mo1762(c0504.f2172);
        C0504 c0505 = new C0504();
        c0505.m1803(0, 4, "\r\n--");
        c0505.m1803(0, str.length(), str);
        this.crlfDashDashBoundary = c0505.mo1762(c0505.f2172);
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
        this.source.mo1790(this.crlfDashDashBoundary.mo1870());
        C0504 c0504Mo1760 = this.source.mo1760();
        C0539 c0539 = this.crlfDashDashBoundary;
        c0504Mo1760.getClass();
        if (c0539.mo1870() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        C2646 c2646 = c0504Mo1760.f2171;
        if (c2646 != null) {
            long j7 = c0504Mo1760.f2172;
            long j8 = 0;
            if (j7 < 0) {
                while (j7 > 0) {
                    c2646 = c2646.f8545;
                    j7 -= (long) (c2646.f8541 - c2646.f8540);
                }
                j2 = 1;
                byte[] bArrMo1872 = c0539.mo1872();
                byte b = bArrMo1872[0];
                int iMo1870 = c0539.mo1870();
                j3 = -1;
                long j9 = (c0504Mo1760.f2172 - ((long) iMo1870)) + 1;
                while (true) {
                    if (j7 < j9) {
                        byte[] bArr = c2646.f8539;
                        j4 = j7;
                        int iMin = (int) Math.min(c2646.f8541, (((long) c2646.f8540) + j9) - j4);
                        int i = (int) ((((long) c2646.f8540) + j8) - j4);
                        while (true) {
                            if (i >= iMin) {
                                j8 = j4 + ((long) (c2646.f8541 - c2646.f8540));
                                c2646 = c2646.f8544;
                                j7 = j8;
                            } else if (bArr[i] == b && AbstractC0048.m906(c2646, i + 1, bArrMo1872, iMo1870)) {
                                j5 = i - c2646.f8540;
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
                    long j11 = ((long) (c2646.f8541 - c2646.f8540)) + j10;
                    if (j11 > 0) {
                        break;
                    }
                    c2646 = c2646.f8544;
                    j10 = j11;
                }
                byte[] bArrMo1873 = c0539.mo1872();
                byte b2 = bArrMo1873[0];
                int iMo1871 = c0539.mo1870();
                long j12 = (c0504Mo1760.f2172 - ((long) iMo1871)) + 1;
                while (true) {
                    if (j10 < j12) {
                        byte[] bArr2 = c2646.f8539;
                        j4 = j10;
                        int iMin2 = (int) Math.min(c2646.f8541, (((long) c2646.f8540) + j12) - j4);
                        int i2 = (int) ((((long) c2646.f8540) + j8) - j4);
                        while (true) {
                            if (i2 >= iMin2) {
                                j8 = j4 + ((long) (c2646.f8541 - c2646.f8540));
                                c2646 = c2646.f8544;
                                j10 = j8;
                            } else if (bArr2[i2] == b2 && AbstractC0048.m906(c2646, i2 + 1, bArrMo1873, iMo1871)) {
                                j5 = i2 - c2646.f8540;
                                j6 = j5 + j4;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
            return j6 == j3 ? Math.min(j, (this.source.mo1760().f2172 - ((long) this.crlfDashDashBoundary.mo1870())) + j2) : Math.min(j, j6);
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
        if (this.partCount == 0 && this.source.mo1787(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.mo1870());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(jCurrentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.mo1870());
        }
        boolean z = false;
        while (true) {
            int iMo1767 = this.source.mo1767(afterBoundaryOptions);
            if (iMo1767 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iMo1767 == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, new C2477(partSource));
            }
            if (iMo1767 == 1) {
                if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iMo1767 == 2 || iMo1767 == 3) {
                z = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(ResponseBody responseBody) throws ProtocolException {
        String strParameter;
        InterfaceC0508 interfaceC0508Source = responseBody.source();
        MediaType mediaTypeContentType = responseBody.contentType();
        if (mediaTypeContentType != null && (strParameter = mediaTypeContentType.parameter("boundary")) != null) {
            this(interfaceC0508Source, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
