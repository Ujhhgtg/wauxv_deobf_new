package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲ要点脸ᛳᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2481feyxiexzfUjhhgtg extends AbstractC2482feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f8111Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f8112Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final AbstractC0417Ujhhgtgfeyxiexzf f8113Ujhhgtgfeyxiexzf;

    public AbstractC2481feyxiexzfUjhhgtg(String str, C2425Ujhhgtgfeyxiexzf c2425Ujhhgtgfeyxiexzf, int i) {
        super(str);
        try {
            if (c2425Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf) {
                throw new C3267feyxiexzfUjhhgtg("annotations.isMutable()", null);
            }
            this.f8113Ujhhgtgfeyxiexzf = c2425Ujhhgtgfeyxiexzf;
            this.f8112Ujhhgtgfeyxiexzf = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("annotations == null");
        }
    }

    @Override // p000.AbstractC2482feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo2154Ujhhgtgfeyxiexzf() {
        int i;
        switch (this.f8111Ujhhgtgfeyxiexzf) {
            case 0:
                i = this.f8112Ujhhgtgfeyxiexzf;
                break;
            default:
                i = this.f8112Ujhhgtgfeyxiexzf;
                break;
        }
        return i + 6;
    }

    public AbstractC2481feyxiexzfUjhhgtg(String str, C2427Ujhhgtgfeyxiexzf c2427Ujhhgtgfeyxiexzf, int i) {
        super(str);
        try {
            if (!c2427Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf) {
                this.f8113Ujhhgtgfeyxiexzf = c2427Ujhhgtgfeyxiexzf;
                this.f8112Ujhhgtgfeyxiexzf = i;
                return;
            }
            throw new C3267feyxiexzfUjhhgtg("parameterAnnotations.isMutable()", null);
        } catch (NullPointerException unused) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }
}
