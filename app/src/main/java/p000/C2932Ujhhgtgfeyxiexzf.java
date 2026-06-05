package p000;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2932Ujhhgtgfeyxiexzf extends AbstractC2933Ujhhgtgfeyxiexzf implements RandomAccess {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final AbstractC2933Ujhhgtgfeyxiexzf f9220Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f9221Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f9222Ujhhgtgfeyxiexzf;

    public C2932Ujhhgtgfeyxiexzf(AbstractC2933Ujhhgtgfeyxiexzf abstractC2933Ujhhgtgfeyxiexzf, int i, int i2) {
        this.f9220Ujhhgtgfeyxiexzf = abstractC2933Ujhhgtgfeyxiexzf;
        this.f9221Ujhhgtgfeyxiexzf = i;
        AbstractC3516feyxiexzfUjhhgtg.m5053Ujhhgtgfeyxiexzf(i, i2, abstractC2933Ujhhgtgfeyxiexzf.mo1287Ujhhgtgfeyxiexzf());
        this.f9222Ujhhgtgfeyxiexzf = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f9222Ujhhgtgfeyxiexzf;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "index: ", ", size: ", i2));
        }
        return this.f9220Ujhhgtgfeyxiexzf.get(this.f9221Ujhhgtgfeyxiexzf + i);
    }

    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf, java.util.List
    public final List subList(int i, int i2) {
        AbstractC3516feyxiexzfUjhhgtg.m5053Ujhhgtgfeyxiexzf(i, i2, this.f9222Ujhhgtgfeyxiexzf);
        int i3 = this.f9221Ujhhgtgfeyxiexzf;
        return new C2932Ujhhgtgfeyxiexzf(this.f9220Ujhhgtgfeyxiexzf, i + i3, i3 + i2);
    }

    @Override // p000.AbstractC2933Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo1287Ujhhgtgfeyxiexzf() {
        return this.f9222Ujhhgtgfeyxiexzf;
    }
}
