package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲀᲈᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0569 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f2355;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f2356;

    public C0569(Object obj, String str) {
        this.f2355 = str;
        this.f2356 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0569)) {
            return false;
        }
        C0569 c0569 = (C0569) obj;
        return AbstractC1469.m3322(this.f2355, c0569.f2355) && AbstractC1469.m3322(this.f2356, c0569.f2356);
    }

    public final int hashCode() {
        int iHashCode = this.f2355.hashCode() * 31;
        Object obj = this.f2356;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ChannelData(key=" + this.f2355 + ", value=" + this.f2356 + ")";
    }
}
