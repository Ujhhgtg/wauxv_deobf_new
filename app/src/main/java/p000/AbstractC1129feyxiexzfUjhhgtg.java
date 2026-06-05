package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1129feyxiexzfUjhhgtg implements InterfaceC0213Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C3057Ujhhgtgfeyxiexzf f4278Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f4279Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3155Ujhhgtgfeyxiexzf f4280Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2657Ujhhgtgfeyxiexzf f4281Ujhhgtgfeyxiexzf;

    public AbstractC1129feyxiexzfUjhhgtg(C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf, int i, C3155Ujhhgtgfeyxiexzf c3155Ujhhgtgfeyxiexzf, C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf) {
        if (c3057Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (c2657Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("attributes == null");
        }
        this.f4278Ujhhgtgfeyxiexzf = c3057Ujhhgtgfeyxiexzf;
        this.f4279Ujhhgtgfeyxiexzf = i;
        this.f4280Ujhhgtgfeyxiexzf = c3155Ujhhgtgfeyxiexzf;
        this.f4281Ujhhgtgfeyxiexzf = c2657Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0213Ujhhgtgfeyxiexzf
    public final C2657Ujhhgtgfeyxiexzf getAttributes() {
        return this.f4281Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0213Ujhhgtgfeyxiexzf
    public final C3056Ujhhgtgfeyxiexzf getName() {
        return this.f4280Ujhhgtgfeyxiexzf.f9766Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(this.f4280Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC0213Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final C3056Ujhhgtgfeyxiexzf mo1299Ujhhgtgfeyxiexzf() {
        return this.f4280Ujhhgtgfeyxiexzf.f9767Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0213Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final C3057Ujhhgtgfeyxiexzf mo1300Ujhhgtgfeyxiexzf() {
        return this.f4278Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0213Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final int mo1301Ujhhgtgfeyxiexzf() {
        return this.f4279Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0213Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final C3155Ujhhgtgfeyxiexzf mo1302Ujhhgtgfeyxiexzf() {
        return this.f4280Ujhhgtgfeyxiexzf;
    }
}
