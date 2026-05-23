package com.bumptech.glide.manager;

import java.util.Iterator;
import p000.AbstractC3522;
import p000.EnumC1769;
import p000.InterfaceC1771;
import p000.InterfaceC1775;
import p000.InterfaceC1776;
import p000.InterfaceC1777;
import p000.InterfaceC2282;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements InterfaceC1771, InterfaceC1776 {
    @InterfaceC2282(EnumC1769.ON_DESTROY)
    public void onDestroy(InterfaceC1777 interfaceC1777) {
        Iterator it = AbstractC3522.m5108(null).iterator();
        while (it.hasNext()) {
            ((InterfaceC1775) it.next()).mo1620();
        }
        interfaceC1777.mo750().m102(this);
    }

    @InterfaceC2282(EnumC1769.ON_START)
    public void onStart(InterfaceC1777 interfaceC1777) {
        Iterator it = AbstractC3522.m5108(null).iterator();
        while (it.hasNext()) {
            ((InterfaceC1775) it.next()).mo1626();
        }
    }

    @InterfaceC2282(EnumC1769.ON_STOP)
    public void onStop(InterfaceC1777 interfaceC1777) {
        Iterator it = AbstractC3522.m5108(null).iterator();
        while (it.hasNext()) {
            ((InterfaceC1775) it.next()).mo1622();
        }
    }

    @Override // p000.InterfaceC1771
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo612(InterfaceC1775 interfaceC1775) {
        throw null;
    }

    @Override // p000.InterfaceC1771
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo613(InterfaceC1775 interfaceC1775) {
        throw null;
    }
}
