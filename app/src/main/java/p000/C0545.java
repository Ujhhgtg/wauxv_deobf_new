package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0545 extends C0264 {

    public int f2257;

    @Override // p000.C2705, java.util.Map
    public final void clear() {
        this.f2257 = 0;
        super.clear();
    }

    @Override // p000.C2705, java.util.Map
    public final int hashCode() {
        if (this.f2257 == 0) {
            this.f2257 = super.hashCode();
        }
        return this.f2257;
    }

    @Override // p000.C2705, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f2257 = 0;
        return super.put(obj, obj2);
    }

    @Override // p000.C2705
    public final void mo1917(C0264 c0264) {
        this.f2257 = 0;
        super.mo1917(c0264);
    }

    @Override // p000.C2705
    public final Object mo1918(int i) {
        this.f2257 = 0;
        return super.mo1918(i);
    }

    @Override // p000.C2705
    public final Object mo1919(int i, Object obj) {
        this.f2257 = 0;
        return super.mo1919(i, obj);
    }
}
