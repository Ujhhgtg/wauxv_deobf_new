package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2426 extends AbstractC0552 implements InterfaceC1742 {

    public final boolean f7717;

    public AbstractC2426(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f7717 = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2426) {
            AbstractC2426 abstractC2426 = (AbstractC2426) obj;
            return m1932().equals(abstractC2426.m1932()) && this.f2270.equals(abstractC2426.f2270) && this.f2271.equals(abstractC2426.f2271) && AbstractC2207.m4087(this.f2268, abstractC2426.f2268);
        }
        if (obj instanceof InterfaceC1742) {
            return obj.equals(mo1930());
        }
        return false;
    }

    public final int hashCode() {
        return this.f2271.hashCode() + AbstractC1194.m2775(m1932().hashCode() * 31, 31, this.f2270);
    }

    public final String toString() {
        InterfaceC1735 interfaceC1735Mo1930 = mo1930();
        return interfaceC1735Mo1930 != this ? interfaceC1735Mo1930.toString() : AbstractC2784.m4752(new StringBuilder("property "), this.f2270, " (Kotlin reflection is not available)");
    }

    @Override // p000.AbstractC0552
    public final InterfaceC1735 mo1930() {
        return this.f7717 ? this : super.mo1930();
    }

    public final InterfaceC1742 m4386() {
        if (this.f7717) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC1735 interfaceC1735Mo1930 = mo1930();
        if (interfaceC1735Mo1930 != this) {
            return (InterfaceC1742) interfaceC1735Mo1930;
        }
        throw new C0886();
    }
}
