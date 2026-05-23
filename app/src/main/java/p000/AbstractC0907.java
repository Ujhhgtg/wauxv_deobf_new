package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0907 extends AbstractC0909 {

    public final int f3364;

    public AbstractC0907(int i) {
        this.f3364 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f3364 == ((AbstractC0907) obj).f3364;
    }

    public final int hashCode() {
        return this.f3364;
    }

    @Override // p000.AbstractC0777
    public final int mo2267(AbstractC0777 abstractC0777) {
        int i = ((AbstractC0907) abstractC0777).f3364;
        int i2 = this.f3364;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    @Override // p000.AbstractC0777
    public final boolean mo2268() {
        return false;
    }

    @Override // p000.AbstractC0909
    public final boolean mo2423() {
        return true;
    }

    @Override // p000.AbstractC0909
    public final int mo2424() {
        return this.f3364;
    }

    @Override // p000.AbstractC0909
    public final long mo2425() {
        return this.f3364;
    }
}
