package p000;

import android.graphics.Point;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᤞᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2665 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f8638;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f8639;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Point f8640;

    public C2665(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f8638 = i;
        this.f8639 = i2;
        this.f8640 = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2665) {
            C2665 c2665 = (C2665) obj;
            if (this.f8638 == c2665.f8638 && this.f8639 == c2665.f8639 && this.f8640.equals(c2665.f8640)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8640.hashCode() + (((this.f8638 * 31) + this.f8639) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f8638;
        if (i == 0) {
            str = "TopLeft";
        } else if (i == 1) {
            str = "TopRight";
        } else if (i != 2) {
            str = i != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.f8639);
        sb.append(", center=");
        sb.append(this.f8640);
        sb.append('}');
        return sb.toString();
    }
}
