package p000;

import java.util.Objects;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1078 {

    public final String f3895;

    public final int f3896;

    public final int f3897;

    public C1078(String str, int i, int i2) {
        this.f3895 = str;
        this.f3896 = i;
        this.f3897 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1078)) {
            return false;
        }
        C1078 c1078 = (C1078) obj;
        return Objects.equals(this.f3895, c1078.f3895) && this.f3896 == c1078.f3896 && this.f3897 == c1078.f3897;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f3896);
        Integer numValueOf2 = Integer.valueOf(this.f3897);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f3895, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.f3895;
        sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb.append(" displayWidth=");
        sb.append(this.f3896);
        sb.append(" displayHeight=");
        return AbstractC2784.m4751(sb, this.f3897, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
    }
}
