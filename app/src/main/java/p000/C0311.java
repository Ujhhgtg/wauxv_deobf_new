package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0311 {

    public int f1540;

    public int f1541;

    public float f1542;

    public float f1543;

    public long f1544;

    public long f1545;

    public long f1546;

    public float f1547;

    public int f1548;

    public final float m1406(long j) {
        long j2 = this.f1544;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f1546;
        if (j3 < 0 || j < j3) {
            return ViewOnTouchListenerC1822.m3577((j - j2) / this.f1540, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f1547;
        return (ViewOnTouchListenerC1822.m3577((j - j3) / this.f1548, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
