package p000;

import android.graphics.Point;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2604 {

    public final int f8473;

    public final int f8474;

    public final Point f8475;

    public C2604(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f8473 = i;
        this.f8474 = i2;
        this.f8475 = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2604) {
            C2604 c2604 = (C2604) obj;
            if (this.f8473 == c2604.f8473 && this.f8474 == c2604.f8474 && this.f8475.equals(c2604.f8475)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8475.hashCode() + (((this.f8473 * 31) + this.f8474) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f8473;
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
        sb.append(this.f8474);
        sb.append(", center=");
        sb.append(this.f8475);
        sb.append('}');
        return sb.toString();
    }
}
