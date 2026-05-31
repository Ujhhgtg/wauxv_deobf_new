package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᲁᲈᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1102 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C1102 f4118 = new C1102(2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C1102 f4119 = new C1102(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C1102 f4120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1102 f4121;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1102 f4122;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2334 f4123;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final boolean f4124;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4125;

    static {
        C1102 c1102 = new C1102(1);
        f4120 = c1102;
        f4121 = new C1102(3);
        f4122 = c1102;
        f4123 = C2334.m4293(c1102, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f4124 = true;
    }

    public /* synthetic */ C1102(int i) {
        this.f4125 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m2812(int i, int i2, int i3, int i4) {
        switch (this.f4125) {
            case 0:
                if (m2813(i, i2, i3, i4) == 1.0f) {
                    return 2;
                }
                return f4118.m2812(i, i2, i3, i4);
            case 1:
                return 2;
            case 2:
                return f4124 ? 2 : 1;
            default:
                return 2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final float m2813(int i, int i2, int i3, int i4) {
        switch (this.f4125) {
            case 0:
                return Math.min(1.0f, f4118.m2813(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (f4124) {
                    return Math.min(i3 / i, i4 / i2);
                }
                int iMax = Math.max(i2 / i4, i / i3);
                if (iMax == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(iMax);
            default:
                return 1.0f;
        }
    }
}
