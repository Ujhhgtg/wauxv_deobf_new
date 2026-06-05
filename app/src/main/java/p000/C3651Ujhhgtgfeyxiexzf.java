package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3651Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final SparseIntArray f11543Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f11544Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f11545Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public float f11546Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public float f11547Ujhhgtgfeyxiexzf;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11543Ujhhgtgfeyxiexzf = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m5310Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0773feyxiexzfUjhhgtg.f3060Ujhhgtgfeyxiexzf);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f11543Ujhhgtgfeyxiexzf.get(index)) {
                case 1:
                    this.f11547Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, this.f11547Ujhhgtgfeyxiexzf);
                    break;
                case 2:
                    this.f11545Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, this.f11545Ujhhgtgfeyxiexzf);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = AbstractC1246feyxiexzfUjhhgtg.f4591Ujhhgtgfeyxiexzf[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f11544Ujhhgtgfeyxiexzf = C3654Ujhhgtgfeyxiexzf.m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, this.f11544Ujhhgtgfeyxiexzf);
                    break;
                case 6:
                    this.f11546Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, this.f11546Ujhhgtgfeyxiexzf);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
