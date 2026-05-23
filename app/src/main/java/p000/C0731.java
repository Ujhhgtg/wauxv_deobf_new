package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0731 implements InterfaceC0732 {

    public final float f2759;

    public final float f2760;

    public C0731(float f, float f2) {
        this.f2759 = f;
        this.f2760 = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0731)) {
            return false;
        }
        float f = this.f2759;
        float f2 = this.f2760;
        if (f > f2) {
            C0731 c0731 = (C0731) obj;
            if (c0731.f2759 > c0731.f2760) {
                return true;
            }
        }
        C0731 c0732 = (C0731) obj;
        return f == c0732.f2759 && f2 == c0732.f2760;
    }

    public final int hashCode() {
        float f = this.f2759;
        float f2 = this.f2760;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.f2759 + ".." + this.f2760;
    }
}
