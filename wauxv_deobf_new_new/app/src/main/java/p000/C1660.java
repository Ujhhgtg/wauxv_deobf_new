package p000;

import android.graphics.Insets;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲈᲇᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1660 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1660 f5614 = new C1660(0, 0, 0, 0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f5615;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f5616;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f5617;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f5618;

    public C1660(int i, int i2, int i3, int i4) {
        this.f5615 = i;
        this.f5616 = i2;
        this.f5617 = i3;
        this.f5618 = i4;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1660 m3538(C1660 c1660, C1660 c1661) {
        return m3539(Math.max(c1660.f5615, c1661.f5615), Math.max(c1660.f5616, c1661.f5616), Math.max(c1660.f5617, c1661.f5617), Math.max(c1660.f5618, c1661.f5618));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C1660 m3539(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f5614 : new C1660(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C1660 m3540(Insets insets) {
        return m3539(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1660.class != obj.getClass()) {
            return false;
        }
        C1660 c1660 = (C1660) obj;
        return this.f5618 == c1660.f5618 && this.f5615 == c1660.f5615 && this.f5617 == c1660.f5617 && this.f5616 == c1660.f5616;
    }

    public final int hashCode() {
        return (((((this.f5615 * 31) + this.f5616) * 31) + this.f5617) * 31) + this.f5618;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f5615);
        sb.append(", top=");
        sb.append(this.f5616);
        sb.append(", right=");
        sb.append(this.f5617);
        sb.append(", bottom=");
        return AbstractC2844.m4784(sb, this.f5618, '}');
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Insets m3541() {
        return AbstractC1659.m3535(this.f5615, this.f5616, this.f5617, this.f5618);
    }
}
