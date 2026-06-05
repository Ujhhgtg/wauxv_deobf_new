package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ要点脸能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1151feyxiexzfUjhhgtg extends AbstractC1335feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C3056Ujhhgtgfeyxiexzf f4345Ujhhgtgfeyxiexzf;

    public C1151feyxiexzfUjhhgtg(C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf) {
        super(1, AbstractC1264feyxiexzfUjhhgtg.m2812Ujhhgtgfeyxiexzf(c3056Ujhhgtgfeyxiexzf.f9450Ujhhgtgfeyxiexzf.length()) + c3056Ujhhgtgfeyxiexzf.f9451Ujhhgtgfeyxiexzf.f8422Ujhhgtgfeyxiexzf + 1);
        this.f4345Ujhhgtgfeyxiexzf = c3056Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final EnumC0704Ujhhgtgfeyxiexzf mo1275Ujhhgtgfeyxiexzf() {
        return EnumC0704Ujhhgtgfeyxiexzf.f2901Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int mo2622Ujhhgtgfeyxiexzf(AbstractC1335feyxiexzfUjhhgtg abstractC1335feyxiexzfUjhhgtg) {
        return this.f4345Ujhhgtgfeyxiexzf.compareTo(((C1151feyxiexzfUjhhgtg) abstractC1335feyxiexzfUjhhgtg).f4345Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC1335feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1276Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf = this.f4345Ujhhgtgfeyxiexzf;
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = c3056Ujhhgtgfeyxiexzf.f9451Ujhhgtgfeyxiexzf;
        int length = c3056Ujhhgtgfeyxiexzf.f9450Ujhhgtgfeyxiexzf.length();
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2812Ujhhgtgfeyxiexzf(length), "utf16_size: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(length)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf.f8422Ujhhgtgfeyxiexzf + 1, c3056Ujhhgtgfeyxiexzf.m4537Ujhhgtgfeyxiexzf());
        }
        c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(length);
        int i = c2610Ujhhgtgfeyxiexzf.f8422Ujhhgtgfeyxiexzf;
        int i2 = c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf;
        int i3 = i + i2;
        if (c2608Ujhhgtgfeyxiexzf.f8411Ujhhgtgfeyxiexzf) {
            c2608Ujhhgtgfeyxiexzf.m3890Ujhhgtgfeyxiexzf(i3);
        } else if (i3 > c2608Ujhhgtgfeyxiexzf.f8412Ujhhgtgfeyxiexzf.length) {
            C2608Ujhhgtgfeyxiexzf.m3884Ujhhgtgfeyxiexzf();
            throw null;
        }
        byte[] bArr = c2608Ujhhgtgfeyxiexzf.f8412Ujhhgtgfeyxiexzf;
        int length2 = bArr.length - i2;
        int i4 = c2610Ujhhgtgfeyxiexzf.f8422Ujhhgtgfeyxiexzf;
        if (length2 < i4) {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        }
        System.arraycopy(c2610Ujhhgtgfeyxiexzf.f8421Ujhhgtgfeyxiexzf, 0, bArr, i2, i4);
        c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf = i3;
        c2608Ujhhgtgfeyxiexzf.m3893Ujhhgtgfeyxiexzf(0);
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1274Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
    }
}
