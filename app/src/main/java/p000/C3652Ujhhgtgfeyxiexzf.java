package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3652Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f11548Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f11549Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public float f11550Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public float f11551Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m5311Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0773feyxiexzfUjhhgtg.f3061Ujhhgtgfeyxiexzf);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f11550Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, this.f11550Ujhhgtgfeyxiexzf);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f11548Ujhhgtgfeyxiexzf);
                this.f11548Ujhhgtgfeyxiexzf = i2;
                this.f11548Ujhhgtgfeyxiexzf = C3654Ujhhgtgfeyxiexzf.f11565Ujhhgtgfeyxiexzf[i2];
            } else if (index == 4) {
                this.f11549Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, this.f11549Ujhhgtgfeyxiexzf);
            } else if (index == 3) {
                this.f11551Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, this.f11551Ujhhgtgfeyxiexzf);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
