package p000;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2715 implements InterfaceC2376 {

    public final C1866 f8763;

    public int f8764;

    public Bitmap.Config f8765;

    public C2715(C1866 c1866) {
        this.f8763 = c1866;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2715) {
            C2715 c2715 = (C2715) obj;
            if (this.f8764 == c2715.f8764 && AbstractC3522.m5105(this.f8765, c2715.f8765)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f8764 * 31;
        Bitmap.Config config = this.f8765;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C2716.m4722(this.f8764, this.f8765);
    }

    @Override // p000.InterfaceC2376
    public final void mo3636() {
        this.f8763.m1519(this);
    }
}
