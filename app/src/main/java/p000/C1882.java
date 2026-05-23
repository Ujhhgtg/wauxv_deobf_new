package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1882 implements InterfaceC2645 {
    @Override // p000.InterfaceC2645
    public final boolean mo3657(Class cls) {
        return cls != InterfaceC2645.class;
    }

    @Override // p000.InterfaceC2645
    public final boolean mo3658(Class cls, String str) {
        return (cls == RunnableC1668.class && str.equals("mainSecurityGuard")) ? false : true;
    }

    @Override // p000.InterfaceC2645
    public final boolean mo3659(Class cls) {
        return (C1883.class.isAssignableFrom(cls) || InterfaceC2645.class.isAssignableFrom(cls)) ? false : true;
    }

    @Override // p000.InterfaceC2645
    public final boolean mo3660(Object obj) {
        return !(obj instanceof C1883);
    }

    @Override // p000.InterfaceC2645
    public final boolean mo3661(Class cls, String str) {
        return (cls == RunnableC1668.class && str.equals("mainSecurityGuard")) ? false : true;
    }

    @Override // p000.InterfaceC2645
    public final boolean mo3662(Object obj) {
        return !(obj instanceof C1883);
    }
}
