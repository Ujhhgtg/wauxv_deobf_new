package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲀᲁᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0566 extends AbstractC3494 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean f2340 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ViewGroup f2341;

    public C0566(ViewGroup viewGroup) {
        this.f2341 = viewGroup;
    }

    @Override // p000.AbstractC3494, p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo2108() {
        AbstractC1469.m3351(this.f2341, false);
    }

    @Override // p000.AbstractC3494, p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo2109(AbstractC3493 abstractC3493) {
        if (!this.f2340) {
            AbstractC1469.m3351(this.f2341, false);
        }
        abstractC3493.mo1563(this);
    }

    @Override // p000.AbstractC3494, p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo2110() {
        AbstractC1469.m3351(this.f2341, true);
    }

    @Override // p000.AbstractC3494, p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo2111(AbstractC3493 abstractC3493) {
        AbstractC1469.m3351(this.f2341, false);
        this.f2340 = true;
    }
}
