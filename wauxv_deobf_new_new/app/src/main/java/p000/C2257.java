package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᲈᤝᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2257 extends AbstractC0065 implements InterfaceC1716 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C2257 f7343 = new C2257(C1139.f4219);

    @Override // p000.InterfaceC1716
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo3605() {
        return true;
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final InterfaceC0678 mo3606(C1723 c1723) {
        return C2258.f7344;
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final InterfaceC1085 mo3607(boolean z, boolean z2, C1718 c1718) {
        return C2258.f7344;
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final CancellationException mo3608() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo3609(CancellationException cancellationException) {
    }
}
