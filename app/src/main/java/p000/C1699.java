package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1699 extends CancellationException {

    public final transient InterfaceC1698 f5785;

    public C1699(String str, Throwable th, C1705 c1705) {
        super(str);
        this.f5785 = c1705;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1699)) {
            return false;
        }
        C1699 c1699 = (C1699) obj;
        if (!AbstractC2207.m4087(c1699.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = c1699.f5785;
        if (obj2 == null) {
            obj2 = C2227.f7224;
        }
        Object obj3 = this.f5785;
        if (obj3 == null) {
            obj3 = C2227.f7224;
        }
        return obj2.equals(obj3) && AbstractC2207.m4087(c1699.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Object obj = this.f5785;
        if (obj == null) {
            obj = C2227.f7224;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f5785;
        if (obj == null) {
            obj = C2227.f7224;
        }
        sb.append(obj);
        return sb.toString();
    }
}
