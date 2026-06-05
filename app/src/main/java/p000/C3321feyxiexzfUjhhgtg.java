package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱfeyxiexzfᛱ能不能ᛳᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3321feyxiexzfUjhhgtg extends AbstractC1246feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final TextView f10356Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C3283Ujhhgtgfeyxiexzf f10357Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f10358Ujhhgtgfeyxiexzf = true;

    public C3321feyxiexzfUjhhgtg(TextView textView) {
        this.f10356Ujhhgtgfeyxiexzf = textView;
        this.f10357Ujhhgtgfeyxiexzf = new C3283Ujhhgtgfeyxiexzf(textView);
    }

    @Override // p000.AbstractC1246feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final InputFilter[] mo2775Ujhhgtgfeyxiexzf(InputFilter[] inputFilterArr) {
        if (!this.f10358Ujhhgtgfeyxiexzf) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C3283Ujhhgtgfeyxiexzf) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C3283Ujhhgtgfeyxiexzf c3283Ujhhgtgfeyxiexzf = this.f10357Ujhhgtgfeyxiexzf;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c3283Ujhhgtgfeyxiexzf;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c3283Ujhhgtgfeyxiexzf) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // p000.AbstractC1246feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final boolean mo2776Ujhhgtgfeyxiexzf() {
        return this.f10358Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC1246feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final void mo2777Ujhhgtgfeyxiexzf(boolean z) {
        if (z) {
            TextView textView = this.f10356Ujhhgtgfeyxiexzf;
            textView.setTransformationMethod(mo2779Ujhhgtgfeyxiexzf(textView.getTransformationMethod()));
        }
    }

    @Override // p000.AbstractC1246feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo2778Ujhhgtgfeyxiexzf(boolean z) {
        this.f10358Ujhhgtgfeyxiexzf = z;
        TextView textView = this.f10356Ujhhgtgfeyxiexzf;
        textView.setTransformationMethod(mo2779Ujhhgtgfeyxiexzf(textView.getTransformationMethod()));
        textView.setFilters(mo2775Ujhhgtgfeyxiexzf(textView.getFilters()));
    }

    @Override // p000.AbstractC1246feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ */
    public final TransformationMethod mo2779Ujhhgtgfeyxiexzf(TransformationMethod transformationMethod) {
        if (this.f10358Ujhhgtgfeyxiexzf) {
            return ((transformationMethod instanceof C3305feyxiexzfUjhhgtg) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C3305feyxiexzfUjhhgtg(transformationMethod);
        }
        return transformationMethod instanceof C3305feyxiexzfUjhhgtg ? ((C3305feyxiexzfUjhhgtg) transformationMethod).f10343Ujhhgtgfeyxiexzf : transformationMethod;
    }
}
