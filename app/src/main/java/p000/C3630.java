package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᛸᲀᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3630 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f11336;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f11337;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final float f11338 = 32.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float f11339 = -40.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f11340 = 120.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
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
        return AbstractC2207.m4087(this.f11336, c3630.f11336) && this.f11337 == c3630.f11337 && Float.compare(this.f11338, c3630.f11338) == 0 && Float.compare(this.f11339, c3630.f11339) == 0 && Float.compare(this.f11340, c3630.f11340) == 0 && Float.compare(this.f11341, c3630.f11341) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11341) + ((Float.hashCode(this.f11340) + ((Float.hashCode(this.f11339) + ((Float.hashCode(this.f11338) + ((Integer.hashCode(this.f11337) + (this.f11336.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("WatermarkConfig(text=");
        sb.append(this.f11336);
        sb.append(", textColor=");
        sb.append(this.f11337);
        sb.append(", textSize=");
        sb.append(this.f11338);
        sb.append(", rotationAngle=");
        sb.append(this.f11339);
        sb.append(", horizontalSpacing=");
        sb.append(this.f11340);
        sb.append(", verticalSpacing=");
        sb.append(this.f11341);
        sb.append(')');
        return sb.toString();
    }
}
