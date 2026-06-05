package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱ能不能ᛴᛱfeyxiexzfᛱᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3152Ujhhgtgfeyxiexzf extends AbstractC1774Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3057Ujhhgtgfeyxiexzf f9760Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3155Ujhhgtgfeyxiexzf f9761Ujhhgtgfeyxiexzf;

    public AbstractC3152Ujhhgtgfeyxiexzf(C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf, C3155Ujhhgtgfeyxiexzf c3155Ujhhgtgfeyxiexzf) {
        if (c3057Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c3155Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("nat == null");
        }
        this.f9760Ujhhgtgfeyxiexzf = c3057Ujhhgtgfeyxiexzf;
        this.f9761Ujhhgtgfeyxiexzf = c3155Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC3152Ujhhgtgfeyxiexzf abstractC3152Ujhhgtgfeyxiexzf = (AbstractC3152Ujhhgtgfeyxiexzf) obj;
            if (this.f9760Ujhhgtgfeyxiexzf.equals(abstractC3152Ujhhgtgfeyxiexzf.f9760Ujhhgtgfeyxiexzf) && this.f9761Ujhhgtgfeyxiexzf.equals(abstractC3152Ujhhgtgfeyxiexzf.f9761Ujhhgtgfeyxiexzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9760Ujhhgtgfeyxiexzf.hashCode() * 31) ^ this.f9761Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        return mo4533Ujhhgtgfeyxiexzf() + '{' + mo1392Ujhhgtgfeyxiexzf() + '}';
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        return this.f9760Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf() + '.' + this.f9761Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC3638Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public int mo4535Ujhhgtgfeyxiexzf(AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        AbstractC3152Ujhhgtgfeyxiexzf abstractC3152Ujhhgtgfeyxiexzf = (AbstractC3152Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf;
        int iCompareTo = this.f9760Ujhhgtgfeyxiexzf.compareTo(abstractC3152Ujhhgtgfeyxiexzf.f9760Ujhhgtgfeyxiexzf);
        return iCompareTo != 0 ? iCompareTo : this.f9761Ujhhgtgfeyxiexzf.f9766Ujhhgtgfeyxiexzf.compareTo(abstractC3152Ujhhgtgfeyxiexzf.f9761Ujhhgtgfeyxiexzf.f9766Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC3638Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final boolean mo4536Ujhhgtgfeyxiexzf() {
        return false;
    }
}
