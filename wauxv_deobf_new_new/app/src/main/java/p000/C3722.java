package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲀᲈᤝᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3722 extends C3721 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static final C3729 f11597 = C3729.m5305(null, WindowInsets.CONSUMED);

    public C3722(C3729 c3729, WindowInsets windowInsets) {
        super(c3729, windowInsets);
    }

    @Override // p000.C3720, p000.AbstractC3716, p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public C1660 mo5271(int i) {
        return C1660.m3540(this.f11582.getInsets(AbstractC3728.m5303(i)));
    }

    @Override // p000.C3720, p000.AbstractC3716, p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public boolean mo5277(int i) {
        return this.f11582.isVisible(AbstractC3728.m5303(i));
    }

    @Override // p000.C3720, p000.AbstractC3716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public C1660 mo5285(int i) {
        return C1660.m3540(this.f11582.getInsetsIgnoringVisibility(AbstractC3728.m5303(i)));
    }

    @Override // p000.AbstractC3716, p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public void mo5273(View view) {
    }
}
