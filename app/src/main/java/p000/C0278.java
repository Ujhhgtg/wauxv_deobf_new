package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲁᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0278 implements InterfaceC2713 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1483;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f1484;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f1485;

    public /* synthetic */ C0278(Object obj, int i, Object obj2) {
        this.f1483 = i;
        this.f1484 = obj;
        this.f1485 = obj2;
    }

    @Override // p000.InterfaceC2713, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f1483) {
            case 0:
                C0280 c0280 = (C0280) this.f1484;
                InterfaceC2713 interfaceC2713 = (InterfaceC2713) this.f1485;
                c0280.enter();
                try {
                    try {
                        interfaceC2713.close();
                        if (c0280.exit()) {
                            throw c0280.access$newTimeoutException(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!c0280.exit()) {
                            throw e;
                        }
                        throw c0280.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    c0280.exit();
                    throw th;
                }
            default:
                ((OutputStream) this.f1484).close();
                return;
        }
    }

    @Override // p000.InterfaceC2713, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f1483) {
            case 0:
                C0280 c0280 = (C0280) this.f1484;
                InterfaceC2713 interfaceC2713 = (InterfaceC2713) this.f1485;
                c0280.enter();
                try {
                    try {
                        interfaceC2713.flush();
                        if (c0280.exit()) {
                            throw c0280.access$newTimeoutException(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!c0280.exit()) {
                            throw e;
                        }
                        throw c0280.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    c0280.exit();
                    throw th;
                }
            default:
                ((OutputStream) this.f1484).flush();
                return;
        }
    }

    @Override // p000.InterfaceC2713
    public final C3400 timeout() {
        switch (this.f1483) {
            case 0:
                return (C0280) this.f1484;
            default:
                return (C3400) this.f1485;
        }
    }

    public final String toString() {
        switch (this.f1483) {
            case 0:
                return "AsyncTimeout.sink(" + ((InterfaceC2713) this.f1485) + ')';
            default:
                return "sink(" + ((OutputStream) this.f1484) + ')';
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a A[LOOP:1: B:12:0x0057->B:25:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[SYNTHETIC] */
    @Override // p000.InterfaceC2713
    public final void write(C0504 c0504, long j) throws IOException {
        C0280 c0280;
        switch (this.f1483) {
            case 0:
                AbstractC0968.m2469(c0504.f2172, 0L, j);
                long j2 = j;
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    C2646 c2646 = c0504.f2171;
                    try {
                        try {
                            while (j3 < JSONWriter.MASK_PRETTY_FORMAT) {
                                j3 += (long) (c2646.f8541 - c2646.f8540);
                                if (j3 >= j2) {
                                    j3 = j2;
                                    c0280 = (C0280) this.f1484;
                                    InterfaceC2713 interfaceC2713 = (InterfaceC2713) this.f1485;
                                    c0280.enter();
                                    interfaceC2713.write(c0504, j3);
                                    if (!c0280.exit()) {
                                        throw c0280.access$newTimeoutException(null);
                                    }
                                    j2 -= j3;
                                } else {
                                    c2646 = c2646.f8544;
                                }
                            }
                            interfaceC2713.write(c0504, j3);
                            if (!c0280.exit()) {
                                throw c0280.access$newTimeoutException(null);
                            }
                            j2 -= j3;
                        } catch (IOException e) {
                            if (!c0280.exit()) {
                                throw e;
                            }
                            throw c0280.access$newTimeoutException(e);
                        }
                    } catch (Throwable th) {
                        c0280.exit();
                        throw th;
                    }
                    c0280 = (C0280) this.f1484;
                    InterfaceC2713 interfaceC2714 = (InterfaceC2713) this.f1485;
                    c0280.enter();
                }
                break;
            default:
                AbstractC0968.m2469(c0504.f2172, 0L, j);
                while (j > 0) {
                    ((C3400) this.f1485).throwIfReached();
                    C2646 c2647 = c0504.f2171;
                    int iMin = (int) Math.min(j, c2647.f8541 - c2647.f8540);
                    ((OutputStream) this.f1484).write(c2647.f8539, c2647.f8540, iMin);
                    int i = c2647.f8540 + iMin;
                    c2647.f8540 = i;
                    long j4 = iMin;
                    j -= j4;
                    c0504.f2172 -= j4;
                    if (i == c2647.f8541) {
                        c0504.f2171 = c2647.m4645();
                        AbstractC2648.m4649(c2647);
                    }
                }
                return;
        }
    }
}
