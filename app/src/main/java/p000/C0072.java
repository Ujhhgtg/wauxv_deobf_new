package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0072 extends AbstractC1574 {
    @Override // p000.AbstractC1574
    public final boolean mo951(AbstractFutureC0074 abstractFutureC0074, C0070 c0070) {
        C0070 c0071 = C0070.f1002;
        synchronized (abstractFutureC0074) {
            try {
                if (abstractFutureC0074.f1017 != c0070) {
                    return false;
                }
                abstractFutureC0074.f1017 = c0071;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC1574
    public final boolean mo952(AbstractFutureC0074 abstractFutureC0074, Object obj, Object obj2) {
        synchronized (abstractFutureC0074) {
            try {
                if (abstractFutureC0074.f1016 != obj) {
                    return false;
                }
                abstractFutureC0074.f1016 = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC1574
    public final boolean mo953(AbstractFutureC0074 abstractFutureC0074, C0073 c0073, C0073 c0074) {
        synchronized (abstractFutureC0074) {
            try {
                if (abstractFutureC0074.f1018 != c0073) {
                    return false;
                }
                abstractFutureC0074.f1018 = c0074;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC1574
    public final void mo954(C0073 c0073, C0073 c0074) {
        c0073.f1011 = c0074;
    }

    @Override // p000.AbstractC1574
    public final void mo955(C0073 c0073, Thread thread) {
        c0073.f1010 = thread;
    }
}
