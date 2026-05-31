package androidx.activity;

import p000.C2307;
import p000.EnumC1792;
import p000.InterfaceC0534;
import p000.InterfaceC1797;
import p000.InterfaceC1800;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC1797, InterfaceC0534 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C2307 f0;

    @Override // p000.InterfaceC0534
    public final void cancel() {
        throw null;
    }

    @Override // p000.InterfaceC1797
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo0(InterfaceC1800 interfaceC1800, EnumC1792 enumC1792) {
        if (enumC1792 == EnumC1792.ON_START) {
            throw null;
        }
        if (enumC1792 != EnumC1792.ON_STOP) {
            if (enumC1792 == EnumC1792.ON_DESTROY) {
                cancel();
            }
        } else {
            C2307 c2307 = this.f0;
            if (c2307 != null) {
                c2307.cancel();
            }
        }
    }
}
