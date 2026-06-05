package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛲᛳ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0859feyxiexzfUjhhgtg extends AbstractC2646feyxiexzfUjhhgtg implements InterfaceC0150Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean f3351Ujhhgtgfeyxiexzf;

    public AbstractC0859feyxiexzfUjhhgtg(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f3351Ujhhgtgfeyxiexzf = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0859feyxiexzfUjhhgtg) {
            AbstractC0859feyxiexzfUjhhgtg abstractC0859feyxiexzfUjhhgtg = (AbstractC0859feyxiexzfUjhhgtg) obj;
            return m3977Ujhhgtgfeyxiexzf().equals(abstractC0859feyxiexzfUjhhgtg.m3977Ujhhgtgfeyxiexzf()) && this.f8497Ujhhgtgfeyxiexzf.equals(abstractC0859feyxiexzfUjhhgtg.f8497Ujhhgtgfeyxiexzf) && this.f8498Ujhhgtgfeyxiexzf.equals(abstractC0859feyxiexzfUjhhgtg.f8498Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8495Ujhhgtgfeyxiexzf, abstractC0859feyxiexzfUjhhgtg.f8495Ujhhgtgfeyxiexzf);
        }
        if (obj instanceof InterfaceC0150Ujhhgtgfeyxiexzf) {
            return obj.equals(mo2264Ujhhgtgfeyxiexzf());
        }
        return false;
    }

    public final int hashCode() {
        return this.f8498Ujhhgtgfeyxiexzf.hashCode() + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(m3977Ujhhgtgfeyxiexzf().hashCode() * 31, 31, this.f8497Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        InterfaceC0143Ujhhgtgfeyxiexzf interfaceC0143UjhhgtgfeyxiexzfMo2264Ujhhgtgfeyxiexzf = mo2264Ujhhgtgfeyxiexzf();
        return interfaceC0143UjhhgtgfeyxiexzfMo2264Ujhhgtgfeyxiexzf != this ? interfaceC0143UjhhgtgfeyxiexzfMo2264Ujhhgtgfeyxiexzf.toString() : AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("property "), this.f8497Ujhhgtgfeyxiexzf, " (Kotlin reflection is not available)");
    }

    @Override // p000.AbstractC2646feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC0143Ujhhgtgfeyxiexzf mo2264Ujhhgtgfeyxiexzf() {
        return this.f3351Ujhhgtgfeyxiexzf ? this : super.mo2264Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final InterfaceC0150Ujhhgtgfeyxiexzf m2265Ujhhgtgfeyxiexzf() {
        if (this.f3351Ujhhgtgfeyxiexzf) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC0143Ujhhgtgfeyxiexzf interfaceC0143UjhhgtgfeyxiexzfMo2264Ujhhgtgfeyxiexzf = mo2264Ujhhgtgfeyxiexzf();
        if (interfaceC0143UjhhgtgfeyxiexzfMo2264Ujhhgtgfeyxiexzf != this) {
            return (InterfaceC0150Ujhhgtgfeyxiexzf) interfaceC0143UjhhgtgfeyxiexzfMo2264Ujhhgtgfeyxiexzf;
        }
        throw new C3748feyxiexzfUjhhgtg();
    }
}
