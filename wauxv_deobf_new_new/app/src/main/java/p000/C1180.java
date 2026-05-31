package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᲈᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1180 extends AbstractC3528 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final TextView f4312;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1169 f4313;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f4314 = true;

    public C1180(TextView textView) {
        this.f4312 = textView;
        this.f4313 = new C1169(textView);
    }

    @Override // p000.AbstractC3528
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final InputFilter[] mo2909(InputFilter[] inputFilterArr) {
        if (!this.f4314) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C1169) {
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
            C1169 c1169 = this.f4313;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c1169;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c1169) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // p000.AbstractC3528
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final boolean mo2910() {
        return this.f4314;
    }

    @Override // p000.AbstractC3528
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void mo2911(boolean z) {
        if (z) {
            TextView textView = this.f4312;
            textView.setTransformationMethod(mo2913(textView.getTransformationMethod()));
        }
    }

    @Override // p000.AbstractC3528
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void mo2912(boolean z) {
        this.f4314 = z;
        TextView textView = this.f4312;
        textView.setTransformationMethod(mo2913(textView.getTransformationMethod()));
        textView.setFilters(mo2909(textView.getFilters()));
    }

    @Override // p000.AbstractC3528
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final TransformationMethod mo2913(TransformationMethod transformationMethod) {
        if (this.f4314) {
            return ((transformationMethod instanceof C1184) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C1184(transformationMethod);
        }
        return transformationMethod instanceof C1184 ? ((C1184) transformationMethod).f4321 : transformationMethod;
    }
}
