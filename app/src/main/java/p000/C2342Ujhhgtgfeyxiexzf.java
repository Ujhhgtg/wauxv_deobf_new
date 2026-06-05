package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2342Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final TextView f7643Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2965Ujhhgtgfeyxiexzf f7644Ujhhgtgfeyxiexzf;

    public C2342Ujhhgtgfeyxiexzf(TextView textView) {
        this.f7643Ujhhgtgfeyxiexzf = textView;
        this.f7644Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(textView);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3532Ujhhgtgfeyxiexzf(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f7643Ujhhgtgfeyxiexzf.getContext().obtainStyledAttributes(attributeSet, AbstractC0801feyxiexzfUjhhgtg.f3164Ujhhgtgfeyxiexzf, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m3533Ujhhgtgfeyxiexzf(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3533Ujhhgtgfeyxiexzf(boolean z) {
        ((AbstractC1246feyxiexzfUjhhgtg) this.f7644Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf).mo2778Ujhhgtgfeyxiexzf(z);
    }
}
