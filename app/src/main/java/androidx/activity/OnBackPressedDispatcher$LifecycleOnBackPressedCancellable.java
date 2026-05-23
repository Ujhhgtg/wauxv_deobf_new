package androidx.activity;

import p000.C2275;
import p000.EnumC1769;
import p000.InterfaceC0557;
import p000.InterfaceC1774;
import p000.InterfaceC1777;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC1774, InterfaceC0557 {

    public C2275 f0;

    @Override // p000.InterfaceC0557
    public final void cancel() {
        throw null;
    }

    @Override // p000.InterfaceC1774
    public final void mo0(InterfaceC1777 interfaceC1777, EnumC1769 enumC1769) {
        if (enumC1769 == EnumC1769.ON_START) {
            throw null;
        }
        if (enumC1769 != EnumC1769.ON_STOP) {
            if (enumC1769 == EnumC1769.ON_DESTROY) {
                cancel();
            }
        } else {
            C2275 c2275 = this.f0;
            if (c2275 != null) {
                c2275.cancel();
            }
        }
    }
}
