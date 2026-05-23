package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1438 extends AbstractC0552 implements InterfaceC1437, InterfaceC1735, InterfaceC1436 {

    public final int f5094;

    public AbstractC1438(Class cls, String str, String str2, int i) {
        this(1, C0551.f2266, cls, str, str2, i, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1438) {
            AbstractC1438 abstractC1438 = (AbstractC1438) obj;
            return this.f2270.equals(abstractC1438.f2270) && this.f2271.equals(abstractC1438.f2271) && AbstractC2207.m4087(this.f2268, abstractC1438.f2268) && m1932().equals(abstractC1438.m1932());
        }
        if (false) {
            return obj.equals(mo1930());
        }
        return false;
    }

    @Override // p000.InterfaceC1437
    public final int getArity() {
        return this.f5094;
    }

    public final int hashCode() {
        m1932();
        return this.f2271.hashCode() + AbstractC1194.m2775(m1932().hashCode() * 31, 31, this.f2270);
    }

    public final String toString() {
        InterfaceC1735 interfaceC1735Mo1930 = mo1930();
        if (interfaceC1735Mo1930 != this) {
            return interfaceC1735Mo1930.toString();
        }
        String str = this.f2270;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC1194.m2785("function ", str, " (Kotlin reflection is not available)");
    }

    @Override // p000.AbstractC0552
    public final InterfaceC1735 mo1931() {
        
        return this;
    }

    public AbstractC1438(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f5094 = i;
    }
}
