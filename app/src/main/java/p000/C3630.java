package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3630 {

    public final String f11336;

    public final int f11337;

    public final float f11338 = 32.0f;

    public final float f11339 = -40.0f;

    public final float f11340 = 120.0f;

    public final float f11341 = 120.0f;

    public C3630(String str, int i) {
        this.f11336 = str;
        this.f11337 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3630)) {
            return false;
        }
        C3630 c3630 = (C3630) obj;
        return AbstractC2207.m4087(this.f11336, c3630.f11336) && this.f11337 == c3630.f11337 && Float.compare(32.0f, 32.0f) == 0 && Float.compare(-40.0f, -40.0f) == 0 && Float.compare(120.0f, 120.0f) == 0 && Float.compare(120.0f, 120.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(120.0f) + ((Float.hashCode(120.0f) + ((Float.hashCode(-40.0f) + ((Float.hashCode(32.0f) + ((Integer.hashCode(this.f11337) + (this.f11336.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("WatermarkConfig(text=");
        sb.append(this.f11336);
        sb.append(", textColor=");
        sb.append(this.f11337);
        sb.append(", textSize=");
        sb.append(32.0f);
        sb.append(", rotationAngle=");
        sb.append(-40.0f);
        sb.append(", horizontalSpacing=");
        sb.append(120.0f);
        sb.append(", verticalSpacing=");
        sb.append(120.0f);
        sb.append(')');
        return sb.toString();
    }
}
