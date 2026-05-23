package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1900 extends C1133 {

    public final float f6269;

    public C1900(float f) {
        this.f6269 = f - 0.001f;
    }

    @Override // p000.C1133
    public final void mo2729(float f, float f2, float f3, C2687 c2687) {
        double d = this.f6269;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        c2687.m4700(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
        c2687.m4699(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        c2687.m4699(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}
