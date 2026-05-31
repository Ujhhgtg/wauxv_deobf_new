package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲀᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1860 extends AbstractC1352 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1860 f6200 = new C1860(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final C1859 m3764(int i, int i2) {
        int i3;
        int length = this.f4833.length;
        for (int i4 = 0; i4 < length; i4++) {
            C1859 c1859 = (C1859) m3165(i4);
            if (i2 == c1859.f6199 && i >= (i3 = c1859.f6194) && i < i3 + c1859.f6195) {
                return c1859;
            }
        }
        return null;
    }
}
