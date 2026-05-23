package p000;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᛸᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1179 extends AbstractC1460 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C1178 f4318;

    public C1179(TextView textView) {
        super(7);
        this.f4318 = new C1178(textView);
    }

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final InputFilter[] mo2765(InputFilter[] inputFilterArr) {
        return !(C1142.f4236 != null) ? inputFilterArr : this.f4318.mo2765(inputFilterArr);
    }

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final boolean mo2766() {
        return this.f4318.f4317;
    }

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public final void mo2767(boolean z) {
        if (C1142.f4236 != null) {
            this.f4318.mo2767(z);
        }
    }

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public final void mo2768(boolean z) {
        C1178 c1178 = this.f4318;
        if (C1142.f4236 != null) {
            c1178.mo2768(z);
        } else {
            c1178.f4317 = z;
        }
    }

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final TransformationMethod mo2769(TransformationMethod transformationMethod) {
        return !(C1142.f4236 != null) ? transformationMethod : this.f4318.mo2769(transformationMethod);
    }
}
