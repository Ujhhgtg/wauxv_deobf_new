package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ要点脸能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1956Ujhhgtgfeyxiexzf extends AbstractC0838feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C1956Ujhhgtgfeyxiexzf f6432Ujhhgtgfeyxiexzf = new C1956Ujhhgtgfeyxiexzf(C1957Ujhhgtgfeyxiexzf.f6433Ujhhgtgfeyxiexzf);

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final int mo1111Ujhhgtgfeyxiexzf(Object obj) {
        return ((C1929feyxiexzfUjhhgtg) obj).f6402Ujhhgtgfeyxiexzf.length;
    }

    @Override // p000.AbstractC2846Ujhhgtgfeyxiexzf, p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo1112Ujhhgtgfeyxiexzf(InterfaceC2876feyxiexzfUjhhgtg interfaceC2876feyxiexzfUjhhgtg, int i, Object obj) {
        C1928feyxiexzfUjhhgtg c1928feyxiexzfUjhhgtg = (C1928feyxiexzfUjhhgtg) obj;
        short sMo1189feyxiexzfUjhhgtg = interfaceC2876feyxiexzfUjhhgtg.mo2268Ujhhgtgfeyxiexzf(this.f3308Ujhhgtgfeyxiexzf, i).mo1189feyxiexzfUjhhgtg();
        c1928feyxiexzfUjhhgtg.mo1456Ujhhgtgfeyxiexzf(c1928feyxiexzfUjhhgtg.mo1457Ujhhgtgfeyxiexzf() + 1);
        short[] sArr = c1928feyxiexzfUjhhgtg.f6400Ujhhgtgfeyxiexzf;
        int i2 = c1928feyxiexzfUjhhgtg.f6401Ujhhgtgfeyxiexzf;
        c1928feyxiexzfUjhhgtg.f6401Ujhhgtgfeyxiexzf = i2 + 1;
        sArr[i2] = sMo1189feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final Object mo1113Ujhhgtgfeyxiexzf(Object obj) {
        short[] sArr = ((C1929feyxiexzfUjhhgtg) obj).f6402Ujhhgtgfeyxiexzf;
        C1928feyxiexzfUjhhgtg c1928feyxiexzfUjhhgtg = new C1928feyxiexzfUjhhgtg();
        c1928feyxiexzfUjhhgtg.f6400Ujhhgtgfeyxiexzf = sArr;
        c1928feyxiexzfUjhhgtg.f6401Ujhhgtgfeyxiexzf = sArr.length;
        c1928feyxiexzfUjhhgtg.mo1456Ujhhgtgfeyxiexzf(10);
        return c1928feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC0838feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final Object mo1458Ujhhgtgfeyxiexzf() {
        return new C1929feyxiexzfUjhhgtg(new short[0]);
    }

    @Override // p000.AbstractC0838feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo1459Ujhhgtgfeyxiexzf(InterfaceC2875feyxiexzfUjhhgtg interfaceC2875feyxiexzfUjhhgtg, Object obj, int i) {
        short[] sArr = ((C1929feyxiexzfUjhhgtg) obj).f6402Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC2875feyxiexzfUjhhgtg.mo2347Ujhhgtgfeyxiexzf(this.f3308Ujhhgtgfeyxiexzf, i2).mo2328Ujhhgtgfeyxiexzf(sArr[i2]);
        }
    }
}
