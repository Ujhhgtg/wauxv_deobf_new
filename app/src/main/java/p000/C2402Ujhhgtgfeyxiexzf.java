package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2402Ujhhgtgfeyxiexzf implements InterfaceC1227feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7794Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f7795Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f7796Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2402Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2) {
        this.f7794Ujhhgtgfeyxiexzf = i;
        this.f7795Ujhhgtgfeyxiexzf = obj;
        this.f7796Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f7794Ujhhgtgfeyxiexzf) {
            case 0:
                C2401Ujhhgtgfeyxiexzf c2401Ujhhgtgfeyxiexzf = (C2401Ujhhgtgfeyxiexzf) this.f7795Ujhhgtgfeyxiexzf;
                InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg = (InterfaceC1227feyxiexzfUjhhgtg) this.f7796Ujhhgtgfeyxiexzf;
                c2401Ujhhgtgfeyxiexzf.enter();
                try {
                    try {
                        interfaceC1227feyxiexzfUjhhgtg.close();
                        if (c2401Ujhhgtgfeyxiexzf.exit()) {
                            throw c2401Ujhhgtgfeyxiexzf.access$newTimeoutException(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!c2401Ujhhgtgfeyxiexzf.exit()) {
                            throw e;
                        }
                        throw c2401Ujhhgtgfeyxiexzf.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    c2401Ujhhgtgfeyxiexzf.exit();
                    throw th;
                }
            default:
                ((InputStream) this.f7795Ujhhgtgfeyxiexzf).close();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final long read(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws IOException {
        boolean z;
        int i = this.f7794Ujhhgtgfeyxiexzf;
        Object obj = this.f7795Ujhhgtgfeyxiexzf;
        Object obj2 = this.f7796Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C2401Ujhhgtgfeyxiexzf c2401Ujhhgtgfeyxiexzf = (C2401Ujhhgtgfeyxiexzf) obj;
                InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg = (InterfaceC1227feyxiexzfUjhhgtg) obj2;
                c2401Ujhhgtgfeyxiexzf.enter();
                try {
                    try {
                        long j2 = interfaceC1227feyxiexzfUjhhgtg.read(c2598feyxiexzfUjhhgtg, j);
                        if (c2401Ujhhgtgfeyxiexzf.exit()) {
                            throw c2401Ujhhgtgfeyxiexzf.access$newTimeoutException(null);
                        }
                        return j2;
                    } catch (IOException e) {
                        if (c2401Ujhhgtgfeyxiexzf.exit()) {
                            throw c2401Ujhhgtgfeyxiexzf.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    c2401Ujhhgtgfeyxiexzf.exit();
                    throw th;
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "byteCount < 0: ").toString());
                }
                try {
                    ((C1744Ujhhgtgfeyxiexzf) obj2).throwIfReached();
                    C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg.m3867feyxiexzfUjhhgtg(1);
                    int i2 = ((InputStream) obj).read(c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf, c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf, (int) Math.min(j, 8192 - c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf));
                    if (i2 == -1) {
                        if (c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf == c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf) {
                            c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
                            AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg);
                        }
                        return -1L;
                    }
                    c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf += i2;
                    long j3 = i2;
                    c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf += j3;
                    return j3;
                } catch (AssertionError e2) {
                    Logger logger = AbstractC1318feyxiexzfUjhhgtg.f4798Ujhhgtgfeyxiexzf;
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        z = message != null ? AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(message, "getsockname failed", false) : false;
                    }
                    if (z) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final C1744Ujhhgtgfeyxiexzf timeout() {
        switch (this.f7794Ujhhgtgfeyxiexzf) {
            case 0:
                return (C2401Ujhhgtgfeyxiexzf) this.f7795Ujhhgtgfeyxiexzf;
            default:
                return (C1744Ujhhgtgfeyxiexzf) this.f7796Ujhhgtgfeyxiexzf;
        }
    }

    public final String toString() {
        switch (this.f7794Ujhhgtgfeyxiexzf) {
            case 0:
                return "AsyncTimeout.source(" + ((InterfaceC1227feyxiexzfUjhhgtg) this.f7796Ujhhgtgfeyxiexzf) + ')';
            default:
                return "source(" + ((InputStream) this.f7795Ujhhgtgfeyxiexzf) + ')';
        }
    }
}
