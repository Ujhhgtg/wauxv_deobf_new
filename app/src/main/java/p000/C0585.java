package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᤞᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0585 extends AbstractC3437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean f2374 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ViewGroup f2375;

    public C0585(ViewGroup viewGroup) {
        this.f2375 = viewGroup;
    }

    @Override // p000.AbstractC3437, p000.InterfaceC3435
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo2011() {
        AbstractC1270.m2995(this.f2375, false);
    }

    @Override // p000.AbstractC3437, p000.InterfaceC3435
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo2012(AbstractC3436 abstractC3436) {
        if (!this.f2374) {
            AbstractC1270.m2995(this.f2375, false);
        }
        abstractC3436.mo1417(this);
    }

    @Override // p000.AbstractC3437, p000.InterfaceC3435
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo2013() {
        AbstractC1270.m2995(this.f2375, true);
    }

    @Override // p000.AbstractC3437, p000.InterfaceC3435
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo2014(AbstractC3436 abstractC3436) {
        AbstractC1270.m2995(this.f2375, false);
        this.f2374 = true;
    }
}
