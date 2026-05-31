package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲀᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3690 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f11485;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f11486;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final float f11487 = 32.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float f11488 = -40.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f11489 = 120.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final float f11490 = 120.0f;

    public C3690(String str, int i) {
        this.f11485 = str;
        this.f11486 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3690)) {
            return false;
        }
        C3690 c3690 = (C3690) obj;
        return AbstractC1469.m3322(this.f11485, c3690.f11485) && this.f11486 == c3690.f11486 && Float.compare(this.f11487, c3690.f11487) == 0 && Float.compare(this.f11488, c3690.f11488) == 0 && Float.compare(this.f11489, c3690.f11489) == 0 && Float.compare(this.f11490, c3690.f11490) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11490) + ((Float.hashCode(this.f11489) + ((Float.hashCode(this.f11488) + ((Float.hashCode(this.f11487) + ((Integer.hashCode(this.f11486) + (this.f11485.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("WatermarkConfig(text=");
        sb.append(this.f11485);
        sb.append(", textColor=");
        sb.append(this.f11486);
        sb.append(", textSize=");
        sb.append(this.f11487);
        sb.append(", rotationAngle=");
        sb.append(this.f11488);
        sb.append(", horizontalSpacing=");
        sb.append(this.f11489);
        sb.append(", verticalSpacing=");
        sb.append(this.f11490);
        sb.append(')');
        return sb.toString();
    }
}
