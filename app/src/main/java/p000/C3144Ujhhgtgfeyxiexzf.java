package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱ能不能ᛲᛴᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3144Ujhhgtgfeyxiexzf extends AbstractC3148Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C3144Ujhhgtgfeyxiexzf[] f9740Ujhhgtgfeyxiexzf = new C3144Ujhhgtgfeyxiexzf[511];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C3144Ujhhgtgfeyxiexzf f9741Ujhhgtgfeyxiexzf = m4660Ujhhgtgfeyxiexzf(-1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C3144Ujhhgtgfeyxiexzf f9742Ujhhgtgfeyxiexzf = m4660Ujhhgtgfeyxiexzf(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C3144Ujhhgtgfeyxiexzf f9743Ujhhgtgfeyxiexzf = m4660Ujhhgtgfeyxiexzf(1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final C3144Ujhhgtgfeyxiexzf f9744Ujhhgtgfeyxiexzf = m4660Ujhhgtgfeyxiexzf(2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C3144Ujhhgtgfeyxiexzf f9745Ujhhgtgfeyxiexzf = m4660Ujhhgtgfeyxiexzf(3);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C3144Ujhhgtgfeyxiexzf f9746Ujhhgtgfeyxiexzf = m4660Ujhhgtgfeyxiexzf(4);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final C3144Ujhhgtgfeyxiexzf f9747Ujhhgtgfeyxiexzf = m4660Ujhhgtgfeyxiexzf(5);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static C3144Ujhhgtgfeyxiexzf m4660Ujhhgtgfeyxiexzf(int i) {
        C3144Ujhhgtgfeyxiexzf[] c3144UjhhgtgfeyxiexzfArr = f9740Ujhhgtgfeyxiexzf;
        int length = (Integer.MAX_VALUE & i) % c3144UjhhgtgfeyxiexzfArr.length;
        C3144Ujhhgtgfeyxiexzf c3144Ujhhgtgfeyxiexzf = c3144UjhhgtgfeyxiexzfArr[length];
        if (c3144Ujhhgtgfeyxiexzf != null && c3144Ujhhgtgfeyxiexzf.f9756Ujhhgtgfeyxiexzf == i) {
            return c3144Ujhhgtgfeyxiexzf;
        }
        C3144Ujhhgtgfeyxiexzf c3144Ujhhgtgfeyxiexzf2 = new C3144Ujhhgtgfeyxiexzf(i);
        c3144UjhhgtgfeyxiexzfArr[length] = c3144Ujhhgtgfeyxiexzf2;
        return c3144Ujhhgtgfeyxiexzf2;
    }

    @Override // p000.InterfaceC1793feyxiexzfUjhhgtg
    public final C1784feyxiexzfUjhhgtg getType() {
        return C1784feyxiexzfUjhhgtg.f5984Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("int{0x");
        int i = this.f9756Ujhhgtgfeyxiexzf;
        sb.append(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i));
        sb.append(" / ");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        return Integer.toString(this.f9756Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC3638Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final String mo4533Ujhhgtgfeyxiexzf() {
        return "int";
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final int m4661Ujhhgtgfeyxiexzf() {
        return this.f9756Ujhhgtgfeyxiexzf;
    }
}
