package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲇᤝᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0288 implements InterfaceC2774 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f1558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f1559;

    public /* synthetic */ C0288(Object obj, int i, Object obj2) {
        this.f1557 = i;
        this.f1558 = obj;
        this.f1559 = obj2;
    }

    @Override // p000.InterfaceC2774, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f1557) {
            case 0:
                C0290 c0290 = (C0290) this.f1558;
                InterfaceC2774 interfaceC2774 = (InterfaceC2774) this.f1559;
                c0290.enter();
                try {
                    try {
                        interfaceC2774.close();
                        if (c0290.exit()) {
                            throw c0290.access$newTimeoutException(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!c0290.exit()) {
                            throw e;
                        }
                        throw c0290.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    c0290.exit();
                    throw th;
                }
            default:
                ((OutputStream) this.f1558).close();
                return;
        }
    }

    @Override // p000.InterfaceC2774, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f1557) {
            case 0:
                C0290 c0290 = (C0290) this.f1558;
                InterfaceC2774 interfaceC2774 = (InterfaceC2774) this.f1559;
                c0290.enter();
                try {
                    try {
                        interfaceC2774.flush();
                        if (c0290.exit()) {
                            throw c0290.access$newTimeoutException(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!c0290.exit()) {
                            throw e;
                        }
                        throw c0290.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    c0290.exit();
                    throw th;
                }
            default:
                ((OutputStream) this.f1558).flush();
                return;
        }
    }

    @Override // p000.InterfaceC2774
    public final C3459 timeout() {
        switch (this.f1557) {
            case 0:
                return (C0290) this.f1558;
            default:
                return (C3459) this.f1559;
        }
    }

    public final String toString() {
        switch (this.f1557) {
            case 0:
                return "AsyncTimeout.sink(" + ((InterfaceC2774) this.f1559) + ')';
            default:
                return "sink(" + ((OutputStream) this.f1558) + ')';
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a A[LOOP:1: B:12:0x0057->B:25:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[SYNTHETIC] */
    @Override // p000.InterfaceC2774
    public final void write(C0481 c0481, long j) throws IOException {
        C0290 c0290;
        switch (this.f1557) {
            case 0:
                AbstractC0972.m2590(c0481.f2128, 0L, j);
                long j2 = j;
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    C2707 c2707 = c0481.f2127;
                    try {
                        try {
                            while (j3 < JSONWriter.MASK_PRETTY_FORMAT) {
                                j3 += (long) (c2707.f8706 - c2707.f8705);
                                if (j3 >= j2) {
                                    j3 = j2;
                                    c0290 = (C0290) this.f1558;
                                    InterfaceC2774 interfaceC2774 = (InterfaceC2774) this.f1559;
                                    c0290.enter();
                                    interfaceC2774.write(c0481, j3);
                                    if (!c0290.exit()) {
                                        throw c0290.access$newTimeoutException(null);
                                    }
                                    j2 -= j3;
                                } else {
                                    c2707 = c2707.f8709;
                                }
                            }
                            interfaceC2774.write(c0481, j3);
                            if (!c0290.exit()) {
                                throw c0290.access$newTimeoutException(null);
                            }
                            j2 -= j3;
                        } catch (IOException e) {
                            if (!c0290.exit()) {
                                throw e;
                            }
                            throw c0290.access$newTimeoutException(e);
                        }
                    } catch (Throwable th) {
                        c0290.exit();
                        throw th;
                    }
                    c0290 = (C0290) this.f1558;
                    InterfaceC2774 interfaceC2775 = (InterfaceC2774) this.f1559;
                    c0290.enter();
                }
                break;
            default:
                AbstractC0972.m2590(c0481.f2128, 0L, j);
                while (j > 0) {
                    ((C3459) this.f1559).throwIfReached();
                    C2707 c2708 = c0481.f2127;
                    int iMin = (int) Math.min(j, c2708.f8706 - c2708.f8705);
                    ((OutputStream) this.f1558).write(c2708.f8704, c2708.f8705, iMin);
                    int i = c2708.f8705 + iMin;
                    c2708.f8705 = i;
                    long j4 = iMin;
                    j -= j4;
                    c0481.f2128 -= j4;
                    if (i == c2708.f8706) {
                        c0481.f2127 = c2708.m4679();
                        AbstractC2709.m4683(c2708);
                    }
                }
                return;
        }
    }
}
