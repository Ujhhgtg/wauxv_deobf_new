package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2926 implements InterfaceC2558, InterfaceC2554 {

    public final InterfaceC2558 f9385;

    public final Object f9386;

    public volatile C2708 f9387;

    public volatile InterfaceC2554 f9388;

    public int f9389 = 3;

    public int f9390 = 3;

    public boolean f9391;

    public C2926(Object obj, InterfaceC2558 interfaceC2558) {
        this.f9386 = obj;
        this.f9385 = interfaceC2558;
    }

    @Override // p000.InterfaceC2554
    public final void clear() {
        synchronized (this.f9386) {
            this.f9391 = false;
            this.f9389 = 3;
            this.f9390 = 3;
            this.f9388.clear();
            this.f9387.clear();
        }
    }

    @Override // p000.InterfaceC2558
    public final InterfaceC2558 getRoot() {
        InterfaceC2558 root;
        synchronized (this.f9386) {
            try {
                InterfaceC2558 interfaceC2558 = this.f9385;
                root = interfaceC2558 != null ? interfaceC2558.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // p000.InterfaceC2554
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f9386) {
            z = true;
            if (this.f9389 != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2558, p000.InterfaceC2554
    public final boolean mo2848() {
        boolean z;
        synchronized (this.f9386) {
            try {
                z = this.f9388.mo2848() || this.f9387.mo2848();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2554
    public final boolean mo2849(InterfaceC2554 interfaceC2554) {
        if (!(interfaceC2554 instanceof C2926)) {
            return false;
        }
        C2926 c2926 = (C2926) interfaceC2554;
        if (this.f9387 == null) {
            if (c2926.f9387 != null) {
                return false;
            }
        } else if (!this.f9387.mo2849(c2926.f9387)) {
            return false;
        }
        if (this.f9388 == null) {
            return c2926.f9388 == null;
        }
        return this.f9388.mo2849(c2926.f9388);
    }

    @Override // p000.InterfaceC2558
    public final void mo2850(InterfaceC2554 interfaceC2554) {
        synchronized (this.f9386) {
            try {
                if (!interfaceC2554.equals(this.f9387)) {
                    this.f9390 = 5;
                    return;
                }
                this.f9389 = 5;
                InterfaceC2558 interfaceC2558 = this.f9385;
                if (interfaceC2558 != null) {
                    interfaceC2558.mo2850(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2558
    public final void mo2851(InterfaceC2554 interfaceC2554) {
        synchronized (this.f9386) {
            try {
                if (interfaceC2554.equals(this.f9388)) {
                    this.f9390 = 4;
                    return;
                }
                this.f9389 = 4;
                InterfaceC2558 interfaceC2558 = this.f9385;
                if (interfaceC2558 != null) {
                    interfaceC2558.mo2851(this);
                }
                if (!AbstractC1194.m2773(this.f9390)) {
                    this.f9388.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2554
    public final void mo2852() {
        synchronized (this.f9386) {
            try {
                if (!AbstractC1194.m2773(this.f9390)) {
                    this.f9390 = 2;
                    this.f9388.mo2852();
                }
                if (!AbstractC1194.m2773(this.f9389)) {
                    this.f9389 = 2;
                    this.f9387.mo2852();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2558
    public final boolean mo2853(InterfaceC2554 interfaceC2554) {
        boolean z;
        synchronized (this.f9386) {
            try {
                InterfaceC2558 interfaceC2558 = this.f9385;
                z = (interfaceC2558 == null || interfaceC2558.mo2853(this)) && interfaceC2554.equals(this.f9387) && this.f9389 != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2558
    public final boolean mo2854(InterfaceC2554 interfaceC2554) {
        boolean z;
        synchronized (this.f9386) {
            try {
                InterfaceC2558 interfaceC2558 = this.f9385;
                z = (interfaceC2558 == null || interfaceC2558.mo2854(this)) && interfaceC2554.equals(this.f9387) && !mo2848();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2558
    public final boolean mo2855(InterfaceC2554 interfaceC2554) {
        boolean z;
        synchronized (this.f9386) {
            try {
                InterfaceC2558 interfaceC2558 = this.f9385;
                z = (interfaceC2558 == null || interfaceC2558.mo2855(this)) && (interfaceC2554.equals(this.f9387) || this.f9389 != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2554
    public final boolean mo2856() {
        boolean z;
        synchronized (this.f9386) {
            z = this.f9389 == 3;
        }
        return z;
    }

    @Override // p000.InterfaceC2554
    public final void mo2857() {
        synchronized (this.f9386) {
            try {
                this.f9391 = true;
                try {
                    if (this.f9389 != 4 && this.f9390 != 1) {
                        this.f9390 = 1;
                        this.f9388.mo2857();
                    }
                    if (this.f9391 && this.f9389 != 1) {
                        this.f9389 = 1;
                        this.f9387.mo2857();
                    }
                    this.f9391 = false;
                } catch (Throwable th) {
                    this.f9391 = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC2554
    public final boolean mo2858() {
        boolean z;
        synchronized (this.f9386) {
            z = this.f9389 == 4;
        }
        return z;
    }
}
