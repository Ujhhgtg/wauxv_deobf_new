package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲀᲁᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3717 extends AbstractC3716 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public C1660 f11592;

    public C3717(C3729 c3729, WindowInsets windowInsets) {
        super(c3729, windowInsets);
        this.f11592 = null;
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C3729 mo5288() {
        return C3729.m5305(null, this.f11582.consumeStableInsets());
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C3729 mo5289() {
        return C3729.m5305(null, this.f11582.consumeSystemWindowInsets());
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C1660 mo5290() {
        if (this.f11592 == null) {
            WindowInsets windowInsets = this.f11582;
            this.f11592 = C1660.m3539(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f11592;
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean mo5291() {
        return this.f11582.isConsumed();
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public void mo5292(C1660 c1660) {
        this.f11592 = c1660;
    }
}
