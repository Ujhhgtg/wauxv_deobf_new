package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2106 {

    public boolean f6944;

    public AbstractC2106() {
        this.f6944 = true;
    }

    public final boolean m3924() {
        return this.f6944;
    }

    public void mo2894() {
        this.f6944 = false;
    }

    public final void m3925() {
        if (!this.f6944) {
            throw new C1022("immutable instance", null);
        }
    }

    public final void m3926() {
        if (this.f6944) {
            throw new C1022("mutable instance", null);
        }
    }

    public AbstractC2106(boolean z) {
        this.f6944 = z;
    }
}
