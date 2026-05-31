package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᲀᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1717 extends CancellationException {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final transient InterfaceC1716 f5828;

    public C1717(String str, Throwable th, C1723 c1723) {
        super(str);
        this.f5828 = c1723;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1717)) {
            return false;
        }
        C1717 c1717 = (C1717) obj;
        if (!AbstractC1469.m3322(c1717.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = c1717.f5828;
        if (obj2 == null) {
            obj2 = C2257.f7343;
        }
        Object obj3 = this.f5828;
        if (obj3 == null) {
            obj3 = C2257.f7343;
        }
        return obj2.equals(obj3) && AbstractC1469.m3322(c1717.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Object obj = this.f5828;
        if (obj == null) {
            obj = C2257.f7343;
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
        Object obj = this.f5828;
        if (obj == null) {
            obj = C2257.f7343;
        }
        sb.append(obj);
        return sb.toString();
    }
}
