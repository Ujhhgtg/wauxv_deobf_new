package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1833 extends AbstractC1352 {

    public static final C1833 f6125 = new C1833(0);

    public final C1832 m3586(int i, int i2) {
        int i3;
        int length = this.f4836.length;
        for (int i4 = 0; i4 < length; i4++) {
            C1832 c1832 = (C1832) m3062(i4);
            if (i2 == c1832.f6124 && i >= (i3 = c1832.f6119) && i < i3 + c1832.f6120) {
                return c1832;
            }
        }
        return null;
    }
}
