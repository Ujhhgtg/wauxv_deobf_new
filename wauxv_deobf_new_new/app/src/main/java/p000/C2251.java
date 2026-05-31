package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᲇᤝᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2251 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f7328;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f7329;

    public C2251(int i, int i2) {
        this.f7328 = i;
        this.f7329 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2251)) {
            return false;
        }
        C2251 c2251 = (C2251) obj;
        return this.f7328 == c2251.f7328 && this.f7329 == c2251.f7329;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7329) + (Integer.hashCode(this.f7328) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("Range(start=");
        sb.append(this.f7328);
        sb.append(", end=");
        return AbstractC2844.m4784(sb, this.f7329, ')');
    }
}
