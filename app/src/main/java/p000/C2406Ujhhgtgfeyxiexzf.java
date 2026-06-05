package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛳ要点脸ᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2406Ujhhgtgfeyxiexzf implements InterfaceC1026feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7802Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f7803Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f7804Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2406Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2) {
        this.f7802Ujhhgtgfeyxiexzf = i;
        this.f7803Ujhhgtgfeyxiexzf = obj;
        this.f7804Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f7802Ujhhgtgfeyxiexzf) {
            case 0:
                C2401Ujhhgtgfeyxiexzf c2401Ujhhgtgfeyxiexzf = (C2401Ujhhgtgfeyxiexzf) this.f7803Ujhhgtgfeyxiexzf;
                InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtg = (InterfaceC1026feyxiexzfUjhhgtg) this.f7804Ujhhgtgfeyxiexzf;
                c2401Ujhhgtgfeyxiexzf.enter();
                try {
                    try {
                        interfaceC1026feyxiexzfUjhhgtg.close();
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
                ((OutputStream) this.f7803Ujhhgtgfeyxiexzf).close();
                return;
        }
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f7802Ujhhgtgfeyxiexzf) {
            case 0:
                C2401Ujhhgtgfeyxiexzf c2401Ujhhgtgfeyxiexzf = (C2401Ujhhgtgfeyxiexzf) this.f7803Ujhhgtgfeyxiexzf;
                InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtg = (InterfaceC1026feyxiexzfUjhhgtg) this.f7804Ujhhgtgfeyxiexzf;
                c2401Ujhhgtgfeyxiexzf.enter();
                try {
                    try {
                        interfaceC1026feyxiexzfUjhhgtg.flush();
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
                ((OutputStream) this.f7803Ujhhgtgfeyxiexzf).flush();
                return;
        }
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg
    public final C1744Ujhhgtgfeyxiexzf timeout() {
        switch (this.f7802Ujhhgtgfeyxiexzf) {
            case 0:
                return (C2401Ujhhgtgfeyxiexzf) this.f7803Ujhhgtgfeyxiexzf;
            default:
                return (C1744Ujhhgtgfeyxiexzf) this.f7804Ujhhgtgfeyxiexzf;
        }
    }

    public final String toString() {
        switch (this.f7802Ujhhgtgfeyxiexzf) {
            case 0:
                return "AsyncTimeout.sink(" + ((InterfaceC1026feyxiexzfUjhhgtg) this.f7804Ujhhgtgfeyxiexzf) + ')';
            default:
                return "sink(" + ((OutputStream) this.f7803Ujhhgtgfeyxiexzf) + ')';
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a A[LOOP:1: B:12:0x0057->B:25:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[SYNTHETIC] */
    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg
    public final void write(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws IOException {
        C2401Ujhhgtgfeyxiexzf c2401Ujhhgtgfeyxiexzf;
        switch (this.f7802Ujhhgtgfeyxiexzf) {
            case 0:
                AbstractC3085Ujhhgtgfeyxiexzf.m4552Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf, 0L, j);
                long j2 = j;
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf;
                    try {
                        try {
                            while (j3 < JSONWriter.MASK_PRETTY_FORMAT) {
                                j3 += (long) (c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
                                if (j3 >= j2) {
                                    j3 = j2;
                                    c2401Ujhhgtgfeyxiexzf = (C2401Ujhhgtgfeyxiexzf) this.f7803Ujhhgtgfeyxiexzf;
                                    InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtg = (InterfaceC1026feyxiexzfUjhhgtg) this.f7804Ujhhgtgfeyxiexzf;
                                    c2401Ujhhgtgfeyxiexzf.enter();
                                    interfaceC1026feyxiexzfUjhhgtg.write(c2598feyxiexzfUjhhgtg, j3);
                                    if (!c2401Ujhhgtgfeyxiexzf.exit()) {
                                        throw c2401Ujhhgtgfeyxiexzf.access$newTimeoutException(null);
                                    }
                                    j2 -= j3;
                                } else {
                                    c1086feyxiexzfUjhhgtg = c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf;
                                }
                            }
                            interfaceC1026feyxiexzfUjhhgtg.write(c2598feyxiexzfUjhhgtg, j3);
                            if (!c2401Ujhhgtgfeyxiexzf.exit()) {
                                throw c2401Ujhhgtgfeyxiexzf.access$newTimeoutException(null);
                            }
                            j2 -= j3;
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
                    c2401Ujhhgtgfeyxiexzf = (C2401Ujhhgtgfeyxiexzf) this.f7803Ujhhgtgfeyxiexzf;
                    InterfaceC1026feyxiexzfUjhhgtg interfaceC1026feyxiexzfUjhhgtg2 = (InterfaceC1026feyxiexzfUjhhgtg) this.f7804Ujhhgtgfeyxiexzf;
                    c2401Ujhhgtgfeyxiexzf.enter();
                }
                break;
            default:
                AbstractC3085Ujhhgtgfeyxiexzf.m4552Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf, 0L, j);
                while (j > 0) {
                    ((C1744Ujhhgtgfeyxiexzf) this.f7804Ujhhgtgfeyxiexzf).throwIfReached();
                    C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2 = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf;
                    int iMin = (int) Math.min(j, c1086feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf);
                    ((OutputStream) this.f7803Ujhhgtgfeyxiexzf).write(c1086feyxiexzfUjhhgtg2.f4159Ujhhgtgfeyxiexzf, c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf, iMin);
                    int i = c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf + iMin;
                    c1086feyxiexzfUjhhgtg2.f4160Ujhhgtgfeyxiexzf = i;
                    long j4 = iMin;
                    j -= j4;
                    c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf -= j4;
                    if (i == c1086feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf) {
                        c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg2.m2555Ujhhgtgfeyxiexzf();
                        AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg2);
                    }
                }
                return;
        }
    }
}
