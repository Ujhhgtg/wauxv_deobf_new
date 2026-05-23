package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2605 extends AbstractC2207 {
    @Override // p000.AbstractC2207
    public final void mo2438(C2687 c2687, float f, float f2) {
        c2687.m4700(0.0f, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C2683 c2683 = new C2683(0.0f, 0.0f, f3, f3);
        c2683.f8664 = 180.0f;
        c2683.f8665 = 90.0f;
        c2687.f8677.add(c2683);
        C2681 c2681 = new C2681(c2683);
        c2687.m4697(180.0f);
        c2687.f8678.add(c2681);
        c2687.f8675 = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        c2687.f8673 = (((float) Math.cos(Math.toRadians(270.0))) * f5) + f4;
        c2687.f8674 = (f5 * ((float) Math.sin(Math.toRadians(270.0)))) + f4;
    }
}
