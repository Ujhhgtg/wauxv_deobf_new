package p000;

import android.graphics.Insets;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲇᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1646 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1646 f5579 = new C1646(0, 0, 0, 0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f5580;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f5581;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f5582;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f5583;

    public C1646(int i, int i2, int i3, int i4) {
        this.f5580 = i;
        this.f5581 = i2;
        this.f5582 = i3;
        this.f5583 = i4;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1646 m3374(C1646 c1646, C1646 c1647) {
        return m3375(Math.max(c1646.f5580, c1647.f5580), Math.max(c1646.f5581, c1647.f5581), Math.max(c1646.f5582, c1647.f5582), Math.max(c1646.f5583, c1647.f5583));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C1646 m3375(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f5579 : new C1646(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C1646 m3376(Insets insets) {
        return m3375(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1646.class != obj.getClass()) {
            return false;
        }
        C1646 c1646 = (C1646) obj;
        return this.f5583 == c1646.f5583 && this.f5580 == c1646.f5580 && this.f5582 == c1646.f5582 && this.f5581 == c1646.f5581;
    }

    public final int hashCode() {
        return (((((this.f5580 * 31) + this.f5581) * 31) + this.f5582) * 31) + this.f5583;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f5580);
        sb.append(", top=");
        sb.append(this.f5581);
        sb.append(", right=");
        sb.append(this.f5582);
        sb.append(", bottom=");
        return AbstractC2784.m4750(sb, this.f5583, '}');
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Insets m3377() {
        return AbstractC1645.m3371(this.f5580, this.f5581, this.f5582, this.f5583);
    }
}
