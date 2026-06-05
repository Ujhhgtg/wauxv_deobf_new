package p000;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱfeyxiexzfᛱ能不能ᛳᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3322feyxiexzfUjhhgtg extends AbstractC1246feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3321feyxiexzfUjhhgtg f10359Ujhhgtgfeyxiexzf;

    public C3322feyxiexzfUjhhgtg(TextView textView) {
        this.f10359Ujhhgtgfeyxiexzf = new C3321feyxiexzfUjhhgtg(textView);
    }

    @Override // p000.AbstractC1246feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final InputFilter[] mo2775Ujhhgtgfeyxiexzf(InputFilter[] inputFilterArr) {
        return !(C3391Ujhhgtgfeyxiexzf.f10590Ujhhgtgfeyxiexzf != null) ? inputFilterArr : this.f10359Ujhhgtgfeyxiexzf.mo2775Ujhhgtgfeyxiexzf(inputFilterArr);
    }

    @Override // p000.AbstractC1246feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final boolean mo2776Ujhhgtgfeyxiexzf() {
        return this.f10359Ujhhgtgfeyxiexzf.f10358Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1246feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final void mo2777Ujhhgtgfeyxiexzf(boolean z) {
        if (C3391Ujhhgtgfeyxiexzf.f10590Ujhhgtgfeyxiexzf != null) {
            this.f10359Ujhhgtgfeyxiexzf.mo2777Ujhhgtgfeyxiexzf(z);
        }
    }

    @Override // p000.AbstractC1246feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo2778Ujhhgtgfeyxiexzf(boolean z) {
        C3321feyxiexzfUjhhgtg c3321feyxiexzfUjhhgtg = this.f10359Ujhhgtgfeyxiexzf;
        if (C3391Ujhhgtgfeyxiexzf.f10590Ujhhgtgfeyxiexzf != null) {
            c3321feyxiexzfUjhhgtg.mo2778Ujhhgtgfeyxiexzf(z);
        } else {
            c3321feyxiexzfUjhhgtg.f10358Ujhhgtgfeyxiexzf = z;
        }
    }

    @Override // p000.AbstractC1246feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final TransformationMethod mo2779Ujhhgtgfeyxiexzf(TransformationMethod transformationMethod) {
        return !(C3391Ujhhgtgfeyxiexzf.f10590Ujhhgtgfeyxiexzf != null) ? transformationMethod : this.f10359Ujhhgtgfeyxiexzf.mo2779Ujhhgtgfeyxiexzf(transformationMethod);
    }
}
