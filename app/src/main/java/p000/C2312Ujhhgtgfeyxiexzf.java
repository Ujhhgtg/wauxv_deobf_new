package p000;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能要点脸ᛴᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2312Ujhhgtgfeyxiexzf extends C2311Ujhhgtgfeyxiexzf {
    @Override // p000.AbstractC2855feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final float mo3523Ujhhgtgfeyxiexzf(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p000.AbstractC2855feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo3524Ujhhgtgfeyxiexzf(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000.C2311Ujhhgtgfeyxiexzf, p000.AbstractC2855feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ */
    public final void mo3519feyxiexzfUjhhgtg(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000.C2311Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ */
    public final void mo3520feyxiexzfUjhhgtg(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000.C2311Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲ */
    public final void mo3521feyxiexzfUjhhgtg(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000.C2311Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ */
    public final void mo3522feyxiexzfUjhhgtg(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
