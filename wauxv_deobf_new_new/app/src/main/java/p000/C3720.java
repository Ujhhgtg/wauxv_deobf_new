package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲀᲁᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3720 extends C3719 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final C3729 f11596 = C3729.m5305(null, WindowInsets.CONSUMED);

    public C3720(C3729 c3729, WindowInsets windowInsets) {
        super(c3729, windowInsets);
    }

    @Override // p000.AbstractC3716, p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public C1660 mo5271(int i) {
        return C1660.m3540(this.f11582.getInsets(AbstractC3727.m5302(i)));
    }

    @Override // p000.AbstractC3716, p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public boolean mo5277(int i) {
        return this.f11582.isVisible(AbstractC3727.m5302(i));
    }

    @Override // p000.AbstractC3716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public C1660 mo5285(int i) {
        return C1660.m3540(this.f11582.getInsetsIgnoringVisibility(AbstractC3727.m5302(i)));
    }

    @Override // p000.AbstractC3716, p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo5268(View view) {
    }
}
