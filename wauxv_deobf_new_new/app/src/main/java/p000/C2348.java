package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᲇᲁᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2348 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f7567;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f7568;

    public C2348(Object obj, Object obj2) {
        this.f7567 = obj;
        this.f7568 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2348)) {
            return false;
        }
        C2348 c2348 = (C2348) obj;
        return AbstractC1469.m3322(this.f7567, c2348.f7567) && AbstractC1469.m3322(this.f7568, c2348.f7568);
    }

    public final int hashCode() {
        Object obj = this.f7567;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f7568;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f7567 + ", " + this.f7568 + ')';
    }
}
