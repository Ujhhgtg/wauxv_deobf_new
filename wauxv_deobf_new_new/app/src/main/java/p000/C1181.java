package p000;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᲈᲇᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1181 extends AbstractC3528 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1180 f4315;

    public C1181(TextView textView) {
        this.f4315 = new C1180(textView);
    }

    @Override // p000.AbstractC3528
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final InputFilter[] mo2909(InputFilter[] inputFilterArr) {
        return !(C1148.f4248 != null) ? inputFilterArr : this.f4315.mo2909(inputFilterArr);
    }

    @Override // p000.AbstractC3528
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final boolean mo2910() {
        return this.f4315.f4314;
    }

    @Override // p000.AbstractC3528
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo2911(boolean z) {
        if (C1148.f4248 != null) {
            this.f4315.mo2911(z);
        }
    }

    @Override // p000.AbstractC3528
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo2912(boolean z) {
        C1180 c1180 = this.f4315;
        if (C1148.f4248 != null) {
            c1180.mo2912(z);
        } else {
            c1180.f4314 = z;
        }
    }

    @Override // p000.AbstractC3528
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public final TransformationMethod mo2913(TransformationMethod transformationMethod) {
        return !(C1148.f4248 != null) ? transformationMethod : this.f4315.mo2913(transformationMethod);
    }
}
