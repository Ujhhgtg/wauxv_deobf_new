package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲈᲀᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1229 implements InterfaceC2614, InterfaceC2610 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object f4440;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC2614 f4441;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile InterfaceC2610 f4442;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public volatile InterfaceC2610 f4443;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f4444 = 3;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f4445 = 3;

    public C1229(Object obj, InterfaceC2614 interfaceC2614) {
        this.f4440 = obj;
        this.f4441 = interfaceC2614;
    }

    @Override // p000.InterfaceC2610
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

    @Override // p000.InterfaceC2614
    public final InterfaceC2614 getRoot() {
        InterfaceC2614 root;
        synchronized (this.f4440) {
            try {
                InterfaceC2614 interfaceC2614 = this.f4441;
                root = interfaceC2614 != null ? interfaceC2614.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // p000.InterfaceC2610
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

    @Override // p000.InterfaceC2614, p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo2974() {
        boolean z;
        synchronized (this.f4440) {
            try {
                z = this.f4442.mo2974() || this.f4443.mo2974();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean mo2975(InterfaceC2610 interfaceC2610) {
        if (interfaceC2610 instanceof C1229) {
            C1229 c1229 = (C1229) interfaceC2610;
            if (this.f4442.mo2975(c1229.f4442) && this.f4443.mo2975(c1229.f4443)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC2614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo2976(InterfaceC2610 interfaceC2610) {
        synchronized (this.f4440) {
            try {
                if (interfaceC2610.equals(this.f4443)) {
                    this.f4445 = 5;
                    InterfaceC2614 interfaceC2614 = this.f4441;
                    if (interfaceC2614 != null) {
                        interfaceC2614.mo2976(this);
                    }
                    return;
                }
                this.f4444 = 5;
                if (this.f4445 != 1) {
                    this.f4445 = 1;
                    this.f4443.mo2983();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo2977(InterfaceC2610 interfaceC2610) {
        synchronized (this.f4440) {
            try {
                if (interfaceC2610.equals(this.f4442)) {
                    this.f4444 = 4;
                } else if (interfaceC2610.equals(this.f4443)) {
                    this.f4445 = 4;
                }
                InterfaceC2614 interfaceC2614 = this.f4441;
                if (interfaceC2614 != null) {
                    interfaceC2614.mo2977(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo2978() {
        synchronized (this.f4440) {
            try {
                if (this.f4444 == 1) {
                    this.f4444 = 2;
                    this.f4442.mo2978();
                }
                if (this.f4445 == 1) {
                    this.f4445 = 2;
                    this.f4443.mo2978();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean mo2979(InterfaceC2610 interfaceC2610) {
        boolean z;
        synchronized (this.f4440) {
            InterfaceC2614 interfaceC2614 = this.f4441;
            z = (interfaceC2614 == null || interfaceC2614.mo2979(this)) && interfaceC2610.equals(this.f4442);
        }
        return z;
    }

    @Override // p000.InterfaceC2614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean mo2980(InterfaceC2610 interfaceC2610) {
        boolean z;
        boolean zEquals;
        int i;
        synchronized (this.f4440) {
            InterfaceC2614 interfaceC2614 = this.f4441;
            z = false;
            if (interfaceC2614 == null || interfaceC2614.mo2980(this)) {
                if (this.f4444 != 5) {
                    zEquals = interfaceC2610.equals(this.f4442);
                } else {
                    zEquals = interfaceC2610.equals(this.f4443) && ((i = this.f4445) == 4 || i == 5);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean mo2981(InterfaceC2610 interfaceC2610) {
        boolean z;
        synchronized (this.f4440) {
            InterfaceC2614 interfaceC2614 = this.f4441;
            z = interfaceC2614 == null || interfaceC2614.mo2981(this);
        }
        return z;
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean mo2982() {
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

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void mo2983() {
        synchronized (this.f4440) {
            try {
                if (this.f4444 != 1) {
                    this.f4444 = 1;
                    this.f4442.mo2983();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean mo2984() {
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
