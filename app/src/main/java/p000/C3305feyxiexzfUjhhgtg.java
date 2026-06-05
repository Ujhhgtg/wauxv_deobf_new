package p000;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3305feyxiexzfUjhhgtg implements TransformationMethod {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final TransformationMethod f10343Ujhhgtgfeyxiexzf;

    public C3305feyxiexzfUjhhgtg(TransformationMethod transformationMethod) {
        this.f10343Ujhhgtgfeyxiexzf = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f10343Ujhhgtgfeyxiexzf;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf().m4908Ujhhgtgfeyxiexzf() != 1) {
            return charSequence;
        }
        C3391Ujhhgtgfeyxiexzf c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf = C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf();
        c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.getClass();
        return c3391UjhhgtgfeyxiexzfM4907Ujhhgtgfeyxiexzf.m4911Ujhhgtgfeyxiexzf(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f10343Ujhhgtgfeyxiexzf;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
