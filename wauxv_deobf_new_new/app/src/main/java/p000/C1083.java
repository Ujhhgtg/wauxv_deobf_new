package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᲈᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1083 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f3906;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f3907;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f3908;

    public C1083(String str, int i, int i2) {
        this.f3906 = str;
        this.f3907 = i;
        this.f3908 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1083)) {
            return false;
        }
        C1083 c1083 = (C1083) obj;
        return Objects.equals(this.f3906, c1083.f3906) && this.f3907 == c1083.f3907 && this.f3908 == c1083.f3908;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f3907);
        Integer numValueOf2 = Integer.valueOf(this.f3908);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f3906, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.f3906;
        sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb.append(" displayWidth=");
        sb.append(this.f3907);
        sb.append(" displayHeight=");
        return AbstractC2844.m4785(sb, this.f3908, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
    }
}
