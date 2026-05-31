package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲇᤝᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0289 implements InterfaceC2846 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1560;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f1561;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f1562;

    public /* synthetic */ C0289(Object obj, int i, Object obj2) {
        this.f1560 = i;
        this.f1561 = obj;
        this.f1562 = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1560) {
            case 0:
                C0290 c0290 = (C0290) this.f1561;
                InterfaceC2846 interfaceC2846 = (InterfaceC2846) this.f1562;
                c0290.enter();
                try {
                    try {
                        interfaceC2846.close();
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
                ((InputStream) this.f1561).close();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    @Override // p000.InterfaceC2846
    public final long read(C0481 c0481, long j) throws IOException {
        boolean z;
        int i = this.f1560;
        Object obj = this.f1561;
        Object obj2 = this.f1562;
        switch (i) {
            case 0:
                C0290 c0290 = (C0290) obj;
                InterfaceC2846 interfaceC2846 = (InterfaceC2846) obj2;
                c0290.enter();
                try {
                    try {
                        long j2 = interfaceC2846.read(c0481, j);
                        if (c0290.exit()) {
                            throw c0290.access$newTimeoutException(null);
                        }
                        return j2;
                    } catch (IOException e) {
                        if (c0290.exit()) {
                            throw c0290.access$newTimeoutException(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    c0290.exit();
                    throw th;
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(AbstractC2844.m4780(j, "byteCount < 0: ").toString());
                }
                try {
                    ((C3459) obj2).throwIfReached();
                    C2707 c2707M1888 = c0481.m1888(1);
                    int i2 = ((InputStream) obj).read(c2707M1888.f8704, c2707M1888.f8706, (int) Math.min(j, 8192 - c2707M1888.f8706));
                    if (i2 == -1) {
                        if (c2707M1888.f8705 == c2707M1888.f8706) {
                            c0481.f2127 = c2707M1888.m4679();
                            AbstractC2709.m4683(c2707M1888);
                        }
                        return -1L;
                    }
                    c2707M1888.f8706 += i2;
                    long j3 = i2;
                    c0481.f2128 += j3;
                    return j3;
                } catch (AssertionError e2) {
                    Logger logger = AbstractC2305.f7492;
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        z = message != null ? AbstractC2901.m4861(message, "getsockname failed", false) : false;
                    }
                    if (z) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // p000.InterfaceC2846
    public final C3459 timeout() {
        switch (this.f1560) {
            case 0:
                return (C0290) this.f1561;
            default:
                return (C3459) this.f1562;
        }
    }

    public final String toString() {
        switch (this.f1560) {
            case 0:
                return "AsyncTimeout.source(" + ((InterfaceC2846) this.f1562) + ')';
            default:
                return "source(" + ((InputStream) this.f1561) + ')';
        }
    }
}
