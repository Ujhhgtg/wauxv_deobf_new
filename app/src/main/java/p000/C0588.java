package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᲁᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0588 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f2389;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f2390;

    public C0588(Object obj, String str) {
        this.f2389 = str;
        this.f2390 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0588)) {
            return false;
        }
        C0588 c0588 = (C0588) obj;
        return AbstractC2207.m4087(this.f2389, c0588.f2389) && AbstractC2207.m4087(this.f2390, c0588.f2390);
    }

    public final int hashCode() {
        int iHashCode = this.f2389.hashCode() * 31;
        Object obj = this.f2390;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ChannelData(key=" + this.f2389 + ", value=" + this.f2390 + ")";
    }
}
