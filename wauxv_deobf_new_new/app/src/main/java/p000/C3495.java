package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲀᤝᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3495 extends AbstractC3494 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0274 f11004;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC3496 f11005;

    public C3495(ViewTreeObserverOnPreDrawListenerC3496 viewTreeObserverOnPreDrawListenerC3496, C0274 c0274) {
        this.f11005 = viewTreeObserverOnPreDrawListenerC3496;
        this.f11004 = c0274;
    }

    @Override // p000.AbstractC3494, p000.InterfaceC3492
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2109(AbstractC3493 abstractC3493) {
        ((ArrayList) this.f11004.get(this.f11005.f11007)).remove(abstractC3493);
        abstractC3493.mo1563(this);
    }
}
