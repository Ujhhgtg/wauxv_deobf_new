package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ能不能ᛳ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1931feyxiexzfUjhhgtg extends AbstractC0838feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C1931feyxiexzfUjhhgtg f6405Ujhhgtgfeyxiexzf = new C1931feyxiexzfUjhhgtg(C1927Ujhhgtgfeyxiexzf.f6398Ujhhgtgfeyxiexzf);

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final int mo1111Ujhhgtgfeyxiexzf(Object obj) {
        return ((C1922feyxiexzfUjhhgtg) obj).f6392Ujhhgtgfeyxiexzf.length;
    }

    @Override // p000.AbstractC2846Ujhhgtgfeyxiexzf, p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo1112Ujhhgtgfeyxiexzf(InterfaceC2876feyxiexzfUjhhgtg interfaceC2876feyxiexzfUjhhgtg, int i, Object obj) {
        C1930Ujhhgtgfeyxiexzf c1930Ujhhgtgfeyxiexzf = (C1930Ujhhgtgfeyxiexzf) obj;
        long jMo1187feyxiexzfUjhhgtg = interfaceC2876feyxiexzfUjhhgtg.mo2268Ujhhgtgfeyxiexzf(this.f3308Ujhhgtgfeyxiexzf, i).mo1187feyxiexzfUjhhgtg();
        c1930Ujhhgtgfeyxiexzf.mo1456Ujhhgtgfeyxiexzf(c1930Ujhhgtgfeyxiexzf.mo1457Ujhhgtgfeyxiexzf() + 1);
        long[] jArr = c1930Ujhhgtgfeyxiexzf.f6403Ujhhgtgfeyxiexzf;
        int i2 = c1930Ujhhgtgfeyxiexzf.f6404Ujhhgtgfeyxiexzf;
        c1930Ujhhgtgfeyxiexzf.f6404Ujhhgtgfeyxiexzf = i2 + 1;
        jArr[i2] = jMo1187feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final Object mo1113Ujhhgtgfeyxiexzf(Object obj) {
        long[] jArr = ((C1922feyxiexzfUjhhgtg) obj).f6392Ujhhgtgfeyxiexzf;
        C1930Ujhhgtgfeyxiexzf c1930Ujhhgtgfeyxiexzf = new C1930Ujhhgtgfeyxiexzf();
        c1930Ujhhgtgfeyxiexzf.f6403Ujhhgtgfeyxiexzf = jArr;
        c1930Ujhhgtgfeyxiexzf.f6404Ujhhgtgfeyxiexzf = jArr.length;
        c1930Ujhhgtgfeyxiexzf.mo1456Ujhhgtgfeyxiexzf(10);
        return c1930Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0838feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final Object mo1458Ujhhgtgfeyxiexzf() {
        return new C1922feyxiexzfUjhhgtg(new long[0]);
    }

    @Override // p000.AbstractC0838feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo1459Ujhhgtgfeyxiexzf(InterfaceC2875feyxiexzfUjhhgtg interfaceC2875feyxiexzfUjhhgtg, Object obj, int i) {
        long[] jArr = ((C1922feyxiexzfUjhhgtg) obj).f6392Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC2875feyxiexzfUjhhgtg.mo2347Ujhhgtgfeyxiexzf(this.f3308Ujhhgtgfeyxiexzf, i2).mo2345feyxiexzfUjhhgtg(jArr[i2]);
        }
    }
}
