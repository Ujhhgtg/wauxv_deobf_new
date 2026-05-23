package androidx.lifecycle;

import p000.EnumC1769;
import p000.InterfaceC1774;
import p000.InterfaceC1777;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC1774 {

    public boolean f297;

    @Override // p000.InterfaceC1774
    public final void mo0(InterfaceC1777 interfaceC1777, EnumC1769 enumC1769) {
        if (enumC1769 == EnumC1769.ON_DESTROY) {
            this.f297 = false;
            interfaceC1777.mo750().m102(this);
        }
    }
}
