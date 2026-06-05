package p000;

import android.util.SparseArray;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ要点脸ᛱfeyxiexzfᛱᛴᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0381Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final SparseArray f2091Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public C1776feyxiexzfUjhhgtg f2092Ujhhgtgfeyxiexzf;

    public C0381Ujhhgtgfeyxiexzf(int i) {
        this.f2091Ujhhgtgfeyxiexzf = new SparseArray(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m1625Ujhhgtgfeyxiexzf(C1776feyxiexzfUjhhgtg c1776feyxiexzfUjhhgtg, int i, int i2) {
        int iM3097Ujhhgtgfeyxiexzf = c1776feyxiexzfUjhhgtg.m3097Ujhhgtgfeyxiexzf(i);
        SparseArray sparseArray = this.f2091Ujhhgtgfeyxiexzf;
        C0381Ujhhgtgfeyxiexzf c0381Ujhhgtgfeyxiexzf = sparseArray == null ? null : (C0381Ujhhgtgfeyxiexzf) sparseArray.get(iM3097Ujhhgtgfeyxiexzf);
        if (c0381Ujhhgtgfeyxiexzf == null) {
            c0381Ujhhgtgfeyxiexzf = new C0381Ujhhgtgfeyxiexzf(1);
            sparseArray.put(c1776feyxiexzfUjhhgtg.m3097Ujhhgtgfeyxiexzf(i), c0381Ujhhgtgfeyxiexzf);
        }
        if (i2 > i) {
            c0381Ujhhgtgfeyxiexzf.m1625Ujhhgtgfeyxiexzf(c1776feyxiexzfUjhhgtg, i + 1, i2);
        } else {
            c0381Ujhhgtgfeyxiexzf.f2092Ujhhgtgfeyxiexzf = c1776feyxiexzfUjhhgtg;
        }
    }
}
