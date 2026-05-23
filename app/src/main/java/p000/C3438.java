package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᛸᲈᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3438 extends AbstractC3437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0264 f10844;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC3439 f10845;

    public C3438(ViewTreeObserverOnPreDrawListenerC3439 viewTreeObserverOnPreDrawListenerC3439, C0264 c0264) {
        this.f10845 = viewTreeObserverOnPreDrawListenerC3439;
        this.f10844 = c0264;
    }

    @Override // p000.AbstractC3437, p000.InterfaceC3435
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2012(AbstractC3436 abstractC3436) {
        ((ArrayList) this.f10844.get(this.f10845.f10847)).remove(abstractC3436);
        abstractC3436.mo1417(this);
    }
}
