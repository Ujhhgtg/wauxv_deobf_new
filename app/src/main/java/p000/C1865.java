package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1865 implements InterfaceC2376 {

    public final C1866 f6193;

    public int f6194;

    public Class f6195;

    public C1865(C1866 c1866) {
        this.f6193 = c1866;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1865) {
            C1865 c1865 = (C1865) obj;
            if (this.f6194 == c1865.f6194 && this.f6195 == c1865.f6195) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f6194 * 31;
        Class cls = this.f6195;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f6194 + "array=" + this.f6195 + '}';
    }

    @Override // p000.InterfaceC2376
    public final void mo3636() {
        this.f6193.m1519(this);
    }
}
