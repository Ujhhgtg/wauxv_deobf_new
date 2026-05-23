package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤝᲇᤞᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2220 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f7208;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f7209;

    public C2220(int i, int i2) {
        this.f7208 = i;
        this.f7209 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2220)) {
            return false;
        }
        C2220 c2220 = (C2220) obj;
        return this.f7208 == c2220.f7208 && this.f7209 == c2220.f7209;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7209) + (Integer.hashCode(this.f7208) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("Range(start=");
        sb.append(this.f7208);
        sb.append(", end=");
        return AbstractC2784.m4750(sb, this.f7209, ')');
    }
}
