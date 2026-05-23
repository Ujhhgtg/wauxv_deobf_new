package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᲁᤞᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3662 extends C3661 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static final C3669 f11448 = C3669.m5299(null, WindowInsets.CONSUMED);

    public C3662(C3669 c3669, WindowInsets windowInsets) {
        super(c3669, windowInsets);
    }

    @Override // p000.C3660, p000.AbstractC3656, p000.C3665
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public C1646 mo5265(int i) {
        return C1646.m3376(this.f11433.getInsets(AbstractC3668.m5297(i)));
    }

    @Override // p000.C3660, p000.AbstractC3656, p000.C3665
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public boolean mo5271(int i) {
        return this.f11433.isVisible(AbstractC3668.m5297(i));
    }

    @Override // p000.C3660, p000.AbstractC3656
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public C1646 mo5279(int i) {
        return C1646.m3376(this.f11433.getInsetsIgnoringVisibility(AbstractC3668.m5297(i)));
    }

    @Override // p000.AbstractC3656, p000.C3665
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public void mo5267(View view) {
    }
}
