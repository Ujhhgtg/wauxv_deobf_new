package p000;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2854 implements InterfaceC1855 {

    public volatile InterfaceC1855 f9117;

    public Boolean f9118;

    public Method f9119;

    public C1236 f9120;

    public final Queue f9121;

    public final boolean f9122;

    public C2854(LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f9121 = linkedBlockingQueue;
        this.f9122 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2854.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 732274226;
    }

    @Override // p000.InterfaceC1855
    public final void mo2876(String str) {
        m4858().mo2876(str);
    }

    @Override // p000.InterfaceC1855
    public final boolean mo2877() {
        return m4858().mo2877();
    }

    @Override // p000.InterfaceC1855
    public final boolean mo2878() {
        return m4858().mo2878();
    }

    @Override // p000.InterfaceC1855
    public final boolean mo2879() {
        return m4858().mo2879();
    }

    @Override // p000.InterfaceC1855
    public final boolean mo2880() {
        return m4858().mo2880();
    }

    @Override // p000.InterfaceC1855
    public final boolean mo2881() {
        return m4858().mo2881();
    }

    @Override // p000.InterfaceC1855
    public final void mo2882(String str, Throwable th) {
        m4858().mo2882(str, th);
    }

    @Override // p000.InterfaceC1855
    public final boolean mo3622(int i) {
        return m4858().mo3622(i);
    }

    public final InterfaceC1855 m4858() {
        if (this.f9117 != null) {
            return this.f9117;
        }
        if (this.f9122) {
            return C2114.f6966;
        }
        if (this.f9120 == null) {
            Queue queue = this.f9121;
            C1236 c1236 = new C1236();
            c1236.f4466 = this;
            c1236.f4467 = queue;
            this.f9120 = c1236;
        }
        return this.f9120;
    }

    public final boolean m4859() {
        Boolean bool = this.f9118;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f9119 = this.f9117.getClass().getMethod("log", C2856.class);
            this.f9118 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f9118 = Boolean.FALSE;
        }
        return this.f9118.booleanValue();
    }
}
