package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3569Ujhhgtgfeyxiexzf extends AbstractC2646feyxiexzfUjhhgtg implements InterfaceC3588feyxiexzfUjhhgtg, InterfaceC0143Ujhhgtgfeyxiexzf, InterfaceC3587Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int f11090Ujhhgtgfeyxiexzf;

    public AbstractC3569Ujhhgtgfeyxiexzf(int i, Class cls, String str, String str2, int i2) {
        this(i, C2645Ujhhgtgfeyxiexzf.f8493Ujhhgtgfeyxiexzf, cls, str, str2, i2, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3569Ujhhgtgfeyxiexzf) {
            AbstractC3569Ujhhgtgfeyxiexzf abstractC3569Ujhhgtgfeyxiexzf = (AbstractC3569Ujhhgtgfeyxiexzf) obj;
            return this.f8497Ujhhgtgfeyxiexzf.equals(abstractC3569Ujhhgtgfeyxiexzf.f8497Ujhhgtgfeyxiexzf) && this.f8498Ujhhgtgfeyxiexzf.equals(abstractC3569Ujhhgtgfeyxiexzf.f8498Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8495Ujhhgtgfeyxiexzf, abstractC3569Ujhhgtgfeyxiexzf.f8495Ujhhgtgfeyxiexzf) && m3977Ujhhgtgfeyxiexzf().equals(abstractC3569Ujhhgtgfeyxiexzf.m3977Ujhhgtgfeyxiexzf());
        }
        if (obj instanceof AbstractC3569Ujhhgtgfeyxiexzf) {
            return obj.equals(mo2264Ujhhgtgfeyxiexzf());
        }
        return false;
    }

    @Override // p000.InterfaceC3588feyxiexzfUjhhgtg
    public final int getArity() {
        return this.f11090Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        m3977Ujhhgtgfeyxiexzf();
        return this.f8498Ujhhgtgfeyxiexzf.hashCode() + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(m3977Ujhhgtgfeyxiexzf().hashCode() * 31, 31, this.f8497Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        InterfaceC0143Ujhhgtgfeyxiexzf interfaceC0143UjhhgtgfeyxiexzfMo2264Ujhhgtgfeyxiexzf = mo2264Ujhhgtgfeyxiexzf();
        if (interfaceC0143UjhhgtgfeyxiexzfMo2264Ujhhgtgfeyxiexzf != this) {
            return interfaceC0143UjhhgtgfeyxiexzfMo2264Ujhhgtgfeyxiexzf.toString();
        }
        String str = this.f8497Ujhhgtgfeyxiexzf;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("function ", str, " (Kotlin reflection is not available)");
    }

    @Override // p000.AbstractC2646feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final InterfaceC0143Ujhhgtgfeyxiexzf mo1483Ujhhgtgfeyxiexzf() {
        AbstractC0959feyxiexzfUjhhgtg.f3826Ujhhgtgfeyxiexzf.getClass();
        return this;
    }

    public AbstractC3569Ujhhgtgfeyxiexzf(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f11090Ujhhgtgfeyxiexzf = i;
    }
}
