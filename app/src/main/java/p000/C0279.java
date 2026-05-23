package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲁᲇᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0279 implements InterfaceC2786 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1486;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f1487;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f1488;

    public /* synthetic */ C0279(Object obj, int i, Object obj2) {
        this.f1486 = i;
        this.f1487 = obj;
        this.f1488 = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1486) {
            case 0:
                C0280 c0280 = (C0280) this.f1487;
                InterfaceC2786 interfaceC2786 = (InterfaceC2786) this.f1488;
                c0280.enter();
                try {
                    try {
                        interfaceC2786.close();
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
                ((InputStream) this.f1487).close();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    @Override // p000.InterfaceC2786
    public final long read(C0504 c0504, long j) throws IOException {
        boolean z;
        int i = this.f1486;
        Object obj = this.f1487;
        Object obj2 = this.f1488;
        switch (i) {
            case 0:
                C0280 c0280 = (C0280) obj;
                InterfaceC2786 interfaceC2786 = (InterfaceC2786) obj2;
                c0280.enter();
                try {
                    try {
                        long j2 = interfaceC2786.read(c0504, j);
                        if (c0280.exit()) {
                            throw c0280.access$newTimeoutException(null);
                        }
                        return j2;
                    } catch (IOException e) {
                        if (c0280.exit()) {
                            throw c0280.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    c0280.exit();
                    throw th;
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(AbstractC2784.m4746(j, "byteCount < 0: ").toString());
                }
                try {
                    ((C3400) obj2).throwIfReached();
                    C2646 c2646M1794 = c0504.m1794(1);
                    int i2 = ((InputStream) obj).read(c2646M1794.f8539, c2646M1794.f8541, (int) Math.min(j, 8192 - c2646M1794.f8541));
                    if (i2 == -1) {
                        if (c2646M1794.f8540 == c2646M1794.f8541) {
                            c0504.f2171 = c2646M1794.m4645();
                            AbstractC2648.m4649(c2646M1794);
                        }
                        return -1L;
                    }
                    c2646M1794.f8541 += i2;
                    long j3 = i2;
                    c0504.f2172 += j3;
                    return j3;
                } catch (AssertionError e2) {
                    Logger logger = AbstractC2273.f7371;
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        z = message != null ? AbstractC2841.m4828(message, "getsockname failed", false) : false;
                    }
                    if (z) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // p000.InterfaceC2786
    public final C3400 timeout() {
        switch (this.f1486) {
            case 0:
                return (C0280) this.f1487;
            default:
                return (C3400) this.f1488;
        }
    }

    public final String toString() {
        switch (this.f1486) {
            case 0:
                return "AsyncTimeout.source(" + ((InterfaceC2786) this.f1488) + ')';
            default:
                return "source(" + ((InputStream) this.f1487) + ')';
        }
    }
}
