package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ要点脸ᛴᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1022feyxiexzfUjhhgtg extends AbstractC1005feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public float f4001Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public float f4002Ujhhgtgfeyxiexzf;

    @Override // p000.AbstractC1005feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo2502Ujhhgtgfeyxiexzf(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3925Ujhhgtgfeyxiexzf;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f4001Ujhhgtgfeyxiexzf, this.f4002Ujhhgtgfeyxiexzf);
        path.transform(matrix);
    }
}
