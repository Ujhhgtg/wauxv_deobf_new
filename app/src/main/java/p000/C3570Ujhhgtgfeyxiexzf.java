package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛱUjhhgtgᛱ能不能ᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3570Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f11091Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f11092Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int[] f11093Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f11094Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m5105Ujhhgtgfeyxiexzf(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f11094Ujhhgtgfeyxiexzf;
        int i4 = i3 * 2;
        int[] iArr = this.f11093Ujhhgtgfeyxiexzf;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f11093Ujhhgtgfeyxiexzf = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f11093Ujhhgtgfeyxiexzf = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f11093Ujhhgtgfeyxiexzf;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f11094Ujhhgtgfeyxiexzf++;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m5106Ujhhgtgfeyxiexzf(RecyclerView recyclerView, boolean z) {
        this.f11094Ujhhgtgfeyxiexzf = 0;
        int[] iArr = this.f11093Ujhhgtgfeyxiexzf;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0822feyxiexzfUjhhgtg abstractC0822feyxiexzfUjhhgtg = recyclerView.f370Ujhhgtgfeyxiexzf;
        if (recyclerView.f369Ujhhgtgfeyxiexzf == null || abstractC0822feyxiexzfUjhhgtg == null || !abstractC0822feyxiexzfUjhhgtg.f3268Ujhhgtgfeyxiexzf) {
            return;
        }
        if (z) {
            if (!recyclerView.f361Ujhhgtgfeyxiexzf.m4484Ujhhgtgfeyxiexzf()) {
                abstractC0822feyxiexzfUjhhgtg.mo155Ujhhgtgfeyxiexzf(recyclerView.f369Ujhhgtgfeyxiexzf.mo2134Ujhhgtgfeyxiexzf(), this);
            }
        } else if (!recyclerView.m234feyxiexzfUjhhgtg()) {
            abstractC0822feyxiexzfUjhhgtg.mo154Ujhhgtgfeyxiexzf(this.f11091Ujhhgtgfeyxiexzf, this.f11092Ujhhgtgfeyxiexzf, recyclerView.f412feyxiexzfUjhhgtg, this);
        }
        int i = this.f11094Ujhhgtgfeyxiexzf;
        if (i > abstractC0822feyxiexzfUjhhgtg.f3269Ujhhgtgfeyxiexzf) {
            abstractC0822feyxiexzfUjhhgtg.f3269Ujhhgtgfeyxiexzf = i;
            abstractC0822feyxiexzfUjhhgtg.f3270Ujhhgtgfeyxiexzf = z;
            recyclerView.f359Ujhhgtgfeyxiexzf.m2241Ujhhgtgfeyxiexzf();
        }
    }
}
