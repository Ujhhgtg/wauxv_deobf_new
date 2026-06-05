package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1921feyxiexzfUjhhgtg extends AbstractC0838feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C1921feyxiexzfUjhhgtg f6391Ujhhgtgfeyxiexzf = new C1921feyxiexzfUjhhgtg(C1920feyxiexzfUjhhgtg.f6389Ujhhgtgfeyxiexzf);

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final int mo1111Ujhhgtgfeyxiexzf(Object obj) {
        return ((C1924feyxiexzfUjhhgtg) obj).f6394Ujhhgtgfeyxiexzf.length;
    }

    @Override // p000.AbstractC2846Ujhhgtgfeyxiexzf, p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo1112Ujhhgtgfeyxiexzf(InterfaceC2876feyxiexzfUjhhgtg interfaceC2876feyxiexzfUjhhgtg, int i, Object obj) {
        C1925feyxiexzfUjhhgtg c1925feyxiexzfUjhhgtg = (C1925feyxiexzfUjhhgtg) obj;
        int iMo1186Ujhhgtgfeyxiexzf = interfaceC2876feyxiexzfUjhhgtg.mo2268Ujhhgtgfeyxiexzf(this.f3308Ujhhgtgfeyxiexzf, i).mo1186Ujhhgtgfeyxiexzf();
        c1925feyxiexzfUjhhgtg.mo1456Ujhhgtgfeyxiexzf(c1925feyxiexzfUjhhgtg.mo1457Ujhhgtgfeyxiexzf() + 1);
        int[] iArr = c1925feyxiexzfUjhhgtg.f6395Ujhhgtgfeyxiexzf;
        int i2 = c1925feyxiexzfUjhhgtg.f6396Ujhhgtgfeyxiexzf;
        c1925feyxiexzfUjhhgtg.f6396Ujhhgtgfeyxiexzf = i2 + 1;
        iArr[i2] = iMo1186Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final Object mo1113Ujhhgtgfeyxiexzf(Object obj) {
        int[] iArr = ((C1924feyxiexzfUjhhgtg) obj).f6394Ujhhgtgfeyxiexzf;
        C1925feyxiexzfUjhhgtg c1925feyxiexzfUjhhgtg = new C1925feyxiexzfUjhhgtg();
        c1925feyxiexzfUjhhgtg.f6395Ujhhgtgfeyxiexzf = iArr;
        c1925feyxiexzfUjhhgtg.f6396Ujhhgtgfeyxiexzf = iArr.length;
        c1925feyxiexzfUjhhgtg.mo1456Ujhhgtgfeyxiexzf(10);
        return c1925feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC0838feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final Object mo1458Ujhhgtgfeyxiexzf() {
        return new C1924feyxiexzfUjhhgtg(new int[0]);
    }

    @Override // p000.AbstractC0838feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo1459Ujhhgtgfeyxiexzf(InterfaceC2875feyxiexzfUjhhgtg interfaceC2875feyxiexzfUjhhgtg, Object obj, int i) {
        int[] iArr = ((C1924feyxiexzfUjhhgtg) obj).f6394Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC2875feyxiexzfUjhhgtg.mo2347Ujhhgtgfeyxiexzf(this.f3308Ujhhgtgfeyxiexzf, i2).mo2342feyxiexzfUjhhgtg(iArr[i2]);
        }
    }
}
