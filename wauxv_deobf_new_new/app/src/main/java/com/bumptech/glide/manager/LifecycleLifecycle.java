package com.bumptech.glide.manager;

import java.util.Iterator;
import p000.AbstractC3580;
import p000.EnumC1792;
import p000.InterfaceC1794;
import p000.InterfaceC1798;
import p000.InterfaceC1799;
import p000.InterfaceC1800;
import p000.InterfaceC2314;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements InterfaceC1794, InterfaceC1799 {
    @InterfaceC2314(EnumC1792.ON_DESTROY)
    public void onDestroy(InterfaceC1800 interfaceC1800) {
        Iterator it = AbstractC3580.m5120(null).iterator();
        while (it.hasNext()) {
            ((InterfaceC1798) it.next()).mo1726();
        }
        interfaceC1800.mo894().m102(this);
    }

    @InterfaceC2314(EnumC1792.ON_START)
    public void onStart(InterfaceC1800 interfaceC1800) {
        Iterator it = AbstractC3580.m5120(null).iterator();
        while (it.hasNext()) {
            ((InterfaceC1798) it.next()).mo1732();
        }
    }

    @InterfaceC2314(EnumC1792.ON_STOP)
    public void onStop(InterfaceC1800 interfaceC1800) {
        Iterator it = AbstractC3580.m5120(null).iterator();
        while (it.hasNext()) {
            ((InterfaceC1798) it.next()).mo1728();
        }
    }

    @Override // p000.InterfaceC1794
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo755(InterfaceC1798 interfaceC1798) {
        throw null;
    }

    @Override // p000.InterfaceC1794
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo756(InterfaceC1798 interfaceC1798) {
        throw null;
    }
}
