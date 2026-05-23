package androidx.activity;

import p000.C1619;
import p000.C2873;
import p000.EnumC1769;
import p000.InterfaceC1774;
import p000.InterfaceC1777;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC1774 {
    static {
        new C2873(C1619.f5490);
    }

    @Override // p000.InterfaceC1774
    public final void mo0(InterfaceC1777 interfaceC1777, EnumC1769 enumC1769) {
        if (enumC1769 == EnumC1769.ON_DESTROY) {
            throw null;
        }
    }
}
