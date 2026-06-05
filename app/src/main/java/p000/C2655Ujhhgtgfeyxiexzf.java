package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲ要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2655Ujhhgtgfeyxiexzf extends AbstractC0838feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C2655Ujhhgtgfeyxiexzf f8519Ujhhgtgfeyxiexzf = new C2655Ujhhgtgfeyxiexzf(C2656Ujhhgtgfeyxiexzf.f8520Ujhhgtgfeyxiexzf);

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final int mo1111Ujhhgtgfeyxiexzf(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // p000.AbstractC2846Ujhhgtgfeyxiexzf, p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo1112Ujhhgtgfeyxiexzf(InterfaceC2876feyxiexzfUjhhgtg interfaceC2876feyxiexzfUjhhgtg, int i, Object obj) {
        C2654Ujhhgtgfeyxiexzf c2654Ujhhgtgfeyxiexzf = (C2654Ujhhgtgfeyxiexzf) obj;
        boolean zMo2285feyxiexzfUjhhgtg = interfaceC2876feyxiexzfUjhhgtg.mo2285feyxiexzfUjhhgtg(this.f3308Ujhhgtgfeyxiexzf, i);
        c2654Ujhhgtgfeyxiexzf.mo1456Ujhhgtgfeyxiexzf(c2654Ujhhgtgfeyxiexzf.mo1457Ujhhgtgfeyxiexzf() + 1);
        boolean[] zArr = c2654Ujhhgtgfeyxiexzf.f8517Ujhhgtgfeyxiexzf;
        int i2 = c2654Ujhhgtgfeyxiexzf.f8518Ujhhgtgfeyxiexzf;
        c2654Ujhhgtgfeyxiexzf.f8518Ujhhgtgfeyxiexzf = i2 + 1;
        zArr[i2] = zMo2285feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final Object mo1113Ujhhgtgfeyxiexzf(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        C2654Ujhhgtgfeyxiexzf c2654Ujhhgtgfeyxiexzf = new C2654Ujhhgtgfeyxiexzf();
        c2654Ujhhgtgfeyxiexzf.f8517Ujhhgtgfeyxiexzf = zArr;
        c2654Ujhhgtgfeyxiexzf.f8518Ujhhgtgfeyxiexzf = zArr.length;
        c2654Ujhhgtgfeyxiexzf.mo1456Ujhhgtgfeyxiexzf(10);
        return c2654Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0838feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final Object mo1458Ujhhgtgfeyxiexzf() {
        return new boolean[0];
    }

    @Override // p000.AbstractC0838feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo1459Ujhhgtgfeyxiexzf(InterfaceC2875feyxiexzfUjhhgtg interfaceC2875feyxiexzfUjhhgtg, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC2875feyxiexzfUjhhgtg.mo2332Ujhhgtgfeyxiexzf(this.f3308Ujhhgtgfeyxiexzf, i2, zArr[i2]);
        }
    }
}
