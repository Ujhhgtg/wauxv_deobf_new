package okhttp3;

import com.alibaba.fastjson2.JSONWriter;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.HeadersReader;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC1937feyxiexzfUjhhgtg;
import p000.AbstractC2689Ujhhgtgfeyxiexzf;
import p000.AbstractC2918Ujhhgtgfeyxiexzf;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.C0789feyxiexzfUjhhgtg;
import p000.C1086feyxiexzfUjhhgtg;
import p000.C1470feyxiexzfUjhhgtg;
import p000.C1736Ujhhgtgfeyxiexzf;
import p000.C1744Ujhhgtgfeyxiexzf;
import p000.C2598feyxiexzfUjhhgtg;
import p000.C2633Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;
import p000.InterfaceC1227feyxiexzfUjhhgtg;
import p000.InterfaceC2595feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final C1470feyxiexzfUjhhgtg afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final C2633Ujhhgtgfeyxiexzf crlfDashDashBoundary;
    private PartSource currentPart;
    private final C2633Ujhhgtgfeyxiexzf dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final InterfaceC2595feyxiexzfUjhhgtg source;

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
            this();
        }

        public final C1470feyxiexzfUjhhgtg getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Part implements Closeable {
        private final InterfaceC2595feyxiexzfUjhhgtg body;
        private final Headers headers;

        public Part(Headers headers, InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg) {
            this.headers = headers;
            this.body = interfaceC2595feyxiexzfUjhhgtg;
        }

        public final InterfaceC2595feyxiexzfUjhhgtg body() {
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
    public final class PartSource implements InterfaceC1227feyxiexzfUjhhgtg {
        private final C1744Ujhhgtgfeyxiexzf timeout = new C1744Ujhhgtgfeyxiexzf();

        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
        public long read(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "byteCount < 0: ").toString());
            }
            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            C1744Ujhhgtgfeyxiexzf c1744UjhhgtgfeyxiexzfTimeout = MultipartReader.this.source.timeout();
            C1744Ujhhgtgfeyxiexzf c1744Ujhhgtgfeyxiexzf = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long jTimeoutNanos = c1744UjhhgtgfeyxiexzfTimeout.timeoutNanos();
            C1736Ujhhgtgfeyxiexzf c1736Ujhhgtgfeyxiexzf = C1744Ujhhgtgfeyxiexzf.Companion;
            long jTimeoutNanos2 = c1744Ujhhgtgfeyxiexzf.timeoutNanos();
            long jTimeoutNanos3 = c1744UjhhgtgfeyxiexzfTimeout.timeoutNanos();
            c1736Ujhhgtgfeyxiexzf.getClass();
            if (jTimeoutNanos2 == 0 || (jTimeoutNanos3 != 0 && jTimeoutNanos2 >= jTimeoutNanos3)) {
                jTimeoutNanos2 = jTimeoutNanos3;
            }
            c1744UjhhgtgfeyxiexzfTimeout.timeout(jTimeoutNanos2, TimeUnit.NANOSECONDS);
            if (!c1744UjhhgtgfeyxiexzfTimeout.hasDeadline()) {
                if (c1744Ujhhgtgfeyxiexzf.hasDeadline()) {
                    c1744UjhhgtgfeyxiexzfTimeout.deadlineNanoTime(c1744Ujhhgtgfeyxiexzf.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j);
                    return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(c2598feyxiexzfUjhhgtg, jCurrentPartBytesRemaining);
                } finally {
                    c1744UjhhgtgfeyxiexzfTimeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                    if (c1744Ujhhgtgfeyxiexzf.hasDeadline()) {
                        c1744UjhhgtgfeyxiexzfTimeout.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = c1744UjhhgtgfeyxiexzfTimeout.deadlineNanoTime();
            if (c1744Ujhhgtgfeyxiexzf.hasDeadline()) {
                c1744UjhhgtgfeyxiexzfTimeout.deadlineNanoTime(Math.min(c1744UjhhgtgfeyxiexzfTimeout.deadlineNanoTime(), c1744Ujhhgtgfeyxiexzf.deadlineNanoTime()));
            }
            try {
                long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j);
                return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(c2598feyxiexzfUjhhgtg, jCurrentPartBytesRemaining2);
            } finally {
                c1744UjhhgtgfeyxiexzfTimeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (c1744Ujhhgtgfeyxiexzf.hasDeadline()) {
                    c1744UjhhgtgfeyxiexzfTimeout.deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }

        @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
        public C1744Ujhhgtgfeyxiexzf timeout() {
            return this.timeout;
        }
    }

    static {
        Charset charset = AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf;
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = new C2633Ujhhgtgfeyxiexzf("\r\n".getBytes(charset));
        c2633Ujhhgtgfeyxiexzf.f8469Ujhhgtgfeyxiexzf = "\r\n";
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf2 = new C2633Ujhhgtgfeyxiexzf("--".getBytes(charset));
        c2633Ujhhgtgfeyxiexzf2.f8469Ujhhgtgfeyxiexzf = "--";
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf3 = new C2633Ujhhgtgfeyxiexzf(" ".getBytes(charset));
        c2633Ujhhgtgfeyxiexzf3.f8469Ujhhgtgfeyxiexzf = " ";
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf4 = new C2633Ujhhgtgfeyxiexzf("\t".getBytes(charset));
        c2633Ujhhgtgfeyxiexzf4.f8469Ujhhgtgfeyxiexzf = "\t";
        afterBoundaryOptions = AbstractC1937feyxiexzfUjhhgtg.m3283Ujhhgtgfeyxiexzf(c2633Ujhhgtgfeyxiexzf, c2633Ujhhgtgfeyxiexzf2, c2633Ujhhgtgfeyxiexzf3, c2633Ujhhgtgfeyxiexzf4);
    }

    public MultipartReader(InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtg, String str) {
        this.source = interfaceC2595feyxiexzfUjhhgtg;
        this.boundary = str;
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
        c2598feyxiexzfUjhhgtg.m3876feyxiexzfUjhhgtg(0, 2, "--");
        c2598feyxiexzfUjhhgtg.m3877feyxiexzfUjhhgtg(str);
        this.dashDashBoundary = c2598feyxiexzfUjhhgtg.mo2106Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf);
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg2 = new C2598feyxiexzfUjhhgtg();
        c2598feyxiexzfUjhhgtg2.m3876feyxiexzfUjhhgtg(0, 4, "\r\n--");
        c2598feyxiexzfUjhhgtg2.m3876feyxiexzfUjhhgtg(0, str.length(), str);
        this.crlfDashDashBoundary = c2598feyxiexzfUjhhgtg2.mo2106Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg2.f8401Ujhhgtgfeyxiexzf);
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
        this.source.mo2118feyxiexzfUjhhgtg(this.crlfDashDashBoundary.mo2578Ujhhgtgfeyxiexzf());
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtgMo2104Ujhhgtgfeyxiexzf = this.source.mo2104Ujhhgtgfeyxiexzf();
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = this.crlfDashDashBoundary;
        c2598feyxiexzfUjhhgtgMo2104Ujhhgtgfeyxiexzf.getClass();
        if (c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtgMo2104Ujhhgtgfeyxiexzf.f8400Ujhhgtgfeyxiexzf;
        if (c1086feyxiexzfUjhhgtg != null) {
            long j7 = c2598feyxiexzfUjhhgtgMo2104Ujhhgtgfeyxiexzf.f8401Ujhhgtgfeyxiexzf;
            long j8 = 0;
            if (j7 < 0) {
                while (j7 > 0) {
                    c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4165Ujhhgtgfeyxiexzf;
                    j7 -= (long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
                }
                j2 = 1;
                byte[] bArrMo2580Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf.mo2580Ujhhgtgfeyxiexzf();
                byte b = bArrMo2580Ujhhgtgfeyxiexzf[0];
                int iMo2578Ujhhgtgfeyxiexzf = c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf();
                j3 = -1;
                long j9 = (c2598feyxiexzfUjhhgtgMo2104Ujhhgtgfeyxiexzf.f8401Ujhhgtgfeyxiexzf - ((long) iMo2578Ujhhgtgfeyxiexzf)) + 1;
                while (true) {
                    if (j7 < j9) {
                        byte[] bArr = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
                        j4 = j7;
                        int iMin = (int) Math.min(c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf, (((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j9) - j4);
                        int i = (int) ((((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j8) - j4);
                        while (true) {
                            if (i >= iMin) {
                                j8 = j4 + ((long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf));
                                c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
                                j7 = j8;
                            } else if (bArr[i] == b && AbstractC2918Ujhhgtgfeyxiexzf.m4285Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg, i + 1, bArrMo2580Ujhhgtgfeyxiexzf, iMo2578Ujhhgtgfeyxiexzf)) {
                                j5 = i - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
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
                    long j11 = ((long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf)) + j10;
                    if (j11 > 0) {
                        break;
                    }
                    c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
                    j10 = j11;
                }
                byte[] bArrMo2580Ujhhgtgfeyxiexzf2 = c2633Ujhhgtgfeyxiexzf.mo2580Ujhhgtgfeyxiexzf();
                byte b2 = bArrMo2580Ujhhgtgfeyxiexzf2[0];
                int iMo2578Ujhhgtgfeyxiexzf2 = c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf();
                long j12 = (c2598feyxiexzfUjhhgtgMo2104Ujhhgtgfeyxiexzf.f8401Ujhhgtgfeyxiexzf - ((long) iMo2578Ujhhgtgfeyxiexzf2)) + 1;
                while (true) {
                    if (j10 < j12) {
                        byte[] bArr2 = c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
                        j4 = j10;
                        int iMin2 = (int) Math.min(c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf, (((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j12) - j4);
                        int i2 = (int) ((((long) c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf) + j8) - j4);
                        while (true) {
                            if (i2 >= iMin2) {
                                j8 = j4 + ((long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf));
                                c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
                                j10 = j8;
                            } else if (bArr2[i2] == b2 && AbstractC2918Ujhhgtgfeyxiexzf.m4285Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg, i2 + 1, bArrMo2580Ujhhgtgfeyxiexzf2, iMo2578Ujhhgtgfeyxiexzf2)) {
                                j5 = i2 - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
                                j6 = j5 + j4;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
            return j6 == j3 ? Math.min(j, (this.source.mo2104Ujhhgtgfeyxiexzf().f8401Ujhhgtgfeyxiexzf - ((long) this.crlfDashDashBoundary.mo2578Ujhhgtgfeyxiexzf())) + j2) : Math.min(j, j6);
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
        if (this.partCount == 0 && this.source.mo2117feyxiexzfUjhhgtg(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.mo2578Ujhhgtgfeyxiexzf());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(jCurrentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.mo2578Ujhhgtgfeyxiexzf());
        }
        boolean z = false;
        while (true) {
            int iMo2110Ujhhgtgfeyxiexzf = this.source.mo2110Ujhhgtgfeyxiexzf(afterBoundaryOptions);
            if (iMo2110Ujhhgtgfeyxiexzf == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iMo2110Ujhhgtgfeyxiexzf == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, new C0789feyxiexzfUjhhgtg(partSource));
            }
            if (iMo2110Ujhhgtgfeyxiexzf == 1) {
                if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iMo2110Ujhhgtgfeyxiexzf == 2 || iMo2110Ujhhgtgfeyxiexzf == 3) {
                z = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(ResponseBody responseBody) throws ProtocolException {
        String strParameter;
        InterfaceC2595feyxiexzfUjhhgtg interfaceC2595feyxiexzfUjhhgtgSource = responseBody.source();
        MediaType mediaTypeContentType = responseBody.contentType();
        if (mediaTypeContentType != null && (strParameter = mediaTypeContentType.parameter("boundary")) != null) {
            this(interfaceC2595feyxiexzfUjhhgtgSource, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
