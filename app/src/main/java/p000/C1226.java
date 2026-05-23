package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1226 implements InterfaceC2558, InterfaceC2554 {

    public final Object f4440;

    public final InterfaceC2558 f4441;

    public volatile InterfaceC2554 f4442;

    public volatile InterfaceC2554 f4443;

    public int f4444 = 3;

    public int f4445 = 3;

    public C1226(Object obj, InterfaceC2558 interfaceC2558) {
        this.f4440 = obj;
        this.f4441 = interfaceC2558;
    }

    @Override // p000.InterfaceC2554
    public final void clear() {
        synchronized (this.f4440) {
            try {
                this.f4444 = 3;
                this.f4442.clear();
                if (this.f4445 != 3) {
                    this.f4445 = 3;
                    this.f4443.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2558
    public final InterfaceC2558 getRoot() {
        InterfaceC2558 root;
        synchronized (this.f4440) {
            try {
                InterfaceC2558 interfaceC2558 = this.f4441;
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
        synchronized (this.f4440) {
            try {
                z = true;
                if (this.f4444 != 1 && this.f4445 != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2558, p000.InterfaceC2554
    public final boolean mo2848() {
        boolean z;
        synchronized (this.f4440) {
            try {
                z = this.f4442.mo2848() || this.f4443.mo2848();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2554
    public final boolean mo2849(InterfaceC2554 interfaceC2554) {
        if (interfaceC2554 instanceof C1226) {
            C1226 c1226 = (C1226) interfaceC2554;
            if (this.f4442.mo2849(c1226.f4442) && this.f4443.mo2849(c1226.f4443)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC2558
    public final void mo2850(InterfaceC2554 interfaceC2554) {
        synchronized (this.f4440) {
            try {
                if (interfaceC2554.equals(this.f4443)) {
                    this.f4445 = 5;
                    InterfaceC2558 interfaceC2558 = this.f4441;
                    if (interfaceC2558 != null) {
                        interfaceC2558.mo2850(this);
                    }
                    return;
                }
                this.f4444 = 5;
                if (this.f4445 != 1) {
                    this.f4445 = 1;
                    this.f4443.mo2857();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2558
    public final void mo2851(InterfaceC2554 interfaceC2554) {
        synchronized (this.f4440) {
            try {
                if (interfaceC2554.equals(this.f4442)) {
                    this.f4444 = 4;
                } else if (interfaceC2554.equals(this.f4443)) {
                    this.f4445 = 4;
                }
                InterfaceC2558 interfaceC2558 = this.f4441;
                if (interfaceC2558 != null) {
                    interfaceC2558.mo2851(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2554
    public final void mo2852() {
        synchronized (this.f4440) {
            try {
                if (this.f4444 == 1) {
                    this.f4444 = 2;
                    this.f4442.mo2852();
                }
                if (this.f4445 == 1) {
                    this.f4445 = 2;
                    this.f4443.mo2852();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2558
    public final boolean mo2853(InterfaceC2554 interfaceC2554) {
        boolean z;
        synchronized (this.f4440) {
            InterfaceC2558 interfaceC2558 = this.f4441;
            z = (interfaceC2558 == null || interfaceC2558.mo2853(this)) && interfaceC2554.equals(this.f4442);
        }
        return z;
    }

    @Override // p000.InterfaceC2558
    public final boolean mo2854(InterfaceC2554 interfaceC2554) {
        boolean z;
        boolean zEquals;
        int i;
        synchronized (this.f4440) {
            InterfaceC2558 interfaceC2558 = this.f4441;
            z = false;
            if (interfaceC2558 == null || interfaceC2558.mo2854(this)) {
                if (this.f4444 != 5) {
                    zEquals = interfaceC2554.equals(this.f4442);
                } else {
                    zEquals = interfaceC2554.equals(this.f4443) && ((i = this.f4445) == 4 || i == 5);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2558
    public final boolean mo2855(InterfaceC2554 interfaceC2554) {
        boolean z;
        synchronized (this.f4440) {
            InterfaceC2558 interfaceC2558 = this.f4441;
            z = interfaceC2558 == null || interfaceC2558.mo2855(this);
        }
        return z;
    }

    @Override // p000.InterfaceC2554
    public final boolean mo2856() {
        boolean z;
        synchronized (this.f4440) {
            try {
                z = this.f4444 == 3 && this.f4445 == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2554
    public final void mo2857() {
        synchronized (this.f4440) {
            try {
                if (this.f4444 != 1) {
                    this.f4444 = 1;
                    this.f4442.mo2857();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2554
    public final boolean mo2858() {
        boolean z;
        synchronized (this.f4440) {
            try {
                z = this.f4444 == 4 || this.f4445 == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
