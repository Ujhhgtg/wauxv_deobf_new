package p000;

import java.io.Serializable;
import java.util.Queue;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1236 implements InterfaceC1855, Serializable {

    public C2854 f4466;

    public Queue f4467;

    @Override // p000.InterfaceC1855
    public final void mo2876(String str) {
        m2883(4);
    }

    @Override // p000.InterfaceC1855
    public final boolean mo2877() {
        return true;
    }

    @Override // p000.InterfaceC1855
    public final boolean mo2878() {
        return true;
    }

    @Override // p000.InterfaceC1855
    public final boolean mo2879() {
        return true;
    }

    @Override // p000.InterfaceC1855
    public final boolean mo2880() {
        return true;
    }

    @Override // p000.InterfaceC1855
    public final boolean mo2881() {
        return true;
    }

    @Override // p000.InterfaceC1855
    public final void mo2882(String str, Throwable th) {
        m2883(2);
    }

    public final void m2883(int i) {
        C2856 c2856 = new C2856();
        System.currentTimeMillis();
        c2856.f9126 = i;
        c2856.f9127 = this.f4466;
        Thread.currentThread().getName();
        this.f4467.add(c2856);
    }
}
