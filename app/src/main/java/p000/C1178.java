package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1178 extends AbstractC1460 {

    public final TextView f4315;

    public final C1167 f4316;

    public boolean f4317;

    public C1178(TextView textView) {
        super(7);
        this.f4315 = textView;
        this.f4317 = true;
        this.f4316 = new C1167(textView);
    }

    @Override // p000.AbstractC1460
    public final InputFilter[] mo2765(InputFilter[] inputFilterArr) {
        if (!this.f4317) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C1167) {
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
            C1167 c1167 = this.f4316;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c1167;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c1167) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // p000.AbstractC1460
    public final boolean mo2766() {
        return this.f4317;
    }

    @Override // p000.AbstractC1460
    public final void mo2767(boolean z) {
        if (z) {
            TextView textView = this.f4315;
            textView.setTransformationMethod(mo2769(textView.getTransformationMethod()));
        }
    }

    @Override // p000.AbstractC1460
    public final void mo2768(boolean z) {
        this.f4317 = z;
        TextView textView = this.f4315;
        textView.setTransformationMethod(mo2769(textView.getTransformationMethod()));
        textView.setFilters(mo2765(textView.getFilters()));
    }

    @Override // p000.AbstractC1460
    public final TransformationMethod mo2769(TransformationMethod transformationMethod) {
        if (this.f4317) {
            return ((transformationMethod instanceof C1182) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C1182(transformationMethod);
        }
        return transformationMethod instanceof C1182 ? ((C1182) transformationMethod).f4324 : transformationMethod;
    }
}
