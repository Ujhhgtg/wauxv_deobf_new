package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1914Ujhhgtgfeyxiexzf extends AbstractC0838feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C1914Ujhhgtgfeyxiexzf f6381Ujhhgtgfeyxiexzf = new C1914Ujhhgtgfeyxiexzf(C1917Ujhhgtgfeyxiexzf.f6385Ujhhgtgfeyxiexzf);

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final int mo1111Ujhhgtgfeyxiexzf(Object obj) {
        return ((C1919Ujhhgtgfeyxiexzf) obj).f6388Ujhhgtgfeyxiexzf.length;
    }

    @Override // p000.AbstractC2846Ujhhgtgfeyxiexzf, p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo1112Ujhhgtgfeyxiexzf(InterfaceC2876feyxiexzfUjhhgtg interfaceC2876feyxiexzfUjhhgtg, int i, Object obj) {
        C1915Ujhhgtgfeyxiexzf c1915Ujhhgtgfeyxiexzf = (C1915Ujhhgtgfeyxiexzf) obj;
        byte bMo1188feyxiexzfUjhhgtg = interfaceC2876feyxiexzfUjhhgtg.mo2268Ujhhgtgfeyxiexzf(this.f3308Ujhhgtgfeyxiexzf, i).mo1188feyxiexzfUjhhgtg();
        c1915Ujhhgtgfeyxiexzf.mo1456Ujhhgtgfeyxiexzf(c1915Ujhhgtgfeyxiexzf.mo1457Ujhhgtgfeyxiexzf() + 1);
        byte[] bArr = c1915Ujhhgtgfeyxiexzf.f6382Ujhhgtgfeyxiexzf;
        int i2 = c1915Ujhhgtgfeyxiexzf.f6383Ujhhgtgfeyxiexzf;
        c1915Ujhhgtgfeyxiexzf.f6383Ujhhgtgfeyxiexzf = i2 + 1;
        bArr[i2] = bMo1188feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final Object mo1113Ujhhgtgfeyxiexzf(Object obj) {
        byte[] bArr = ((C1919Ujhhgtgfeyxiexzf) obj).f6388Ujhhgtgfeyxiexzf;
        C1915Ujhhgtgfeyxiexzf c1915Ujhhgtgfeyxiexzf = new C1915Ujhhgtgfeyxiexzf();
        c1915Ujhhgtgfeyxiexzf.f6382Ujhhgtgfeyxiexzf = bArr;
        c1915Ujhhgtgfeyxiexzf.f6383Ujhhgtgfeyxiexzf = bArr.length;
        c1915Ujhhgtgfeyxiexzf.mo1456Ujhhgtgfeyxiexzf(10);
        return c1915Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0838feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final Object mo1458Ujhhgtgfeyxiexzf() {
        return new C1919Ujhhgtgfeyxiexzf(new byte[0]);
    }

    @Override // p000.AbstractC0838feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo1459Ujhhgtgfeyxiexzf(InterfaceC2875feyxiexzfUjhhgtg interfaceC2875feyxiexzfUjhhgtg, Object obj, int i) {
        byte[] bArr = ((C1919Ujhhgtgfeyxiexzf) obj).f6388Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC2875feyxiexzfUjhhgtg.mo2347Ujhhgtgfeyxiexzf(this.f3308Ujhhgtgfeyxiexzf, i2).mo2329Ujhhgtgfeyxiexzf(bArr[i2]);
        }
    }
}
