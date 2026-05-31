package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲀᲁᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3719 extends C3718 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public C1660 f11593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public C1660 f11594;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public C1660 f11595;

    public C3719(C3729 c3729, WindowInsets windowInsets) {
        super(c3729, windowInsets);
        this.f11593 = null;
        this.f11594 = null;
        this.f11595 = null;
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C1660 mo5295() {
        if (this.f11594 == null) {
            this.f11594 = C1660.m3540(this.f11582.getMandatorySystemGestureInsets());
        }
        return this.f11594;
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C1660 mo5296() {
        if (this.f11593 == null) {
            this.f11593 = C1660.m3540(this.f11582.getSystemGestureInsets());
        }
        return this.f11593;
    }

    @Override // p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C1660 mo5297() {
        if (this.f11595 == null) {
            this.f11595 = C1660.m3540(this.f11582.getTappableElementInsets());
        }
        return this.f11595;
    }

    @Override // p000.AbstractC3716, p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public C3729 mo5275(int i, int i2, int i3, int i4) {
        return C3729.m5305(null, this.f11582.inset(i, i2, i3, i4));
    }

    @Override // p000.C3717, p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public void mo5292(C1660 c1660) {
    }
}
