package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᤝᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2985 implements InterfaceC2614, InterfaceC2610 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2614 f9552;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f9553;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile C2769 f9554;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public volatile InterfaceC2610 f9555;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f9556 = 3;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f9557 = 3;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f9558;

    public C2985(Object obj, InterfaceC2614 interfaceC2614) {
        this.f9553 = obj;
        this.f9552 = interfaceC2614;
    }

    @Override // p000.InterfaceC2610
    public final void clear() {
        synchronized (this.f9553) {
            this.f9558 = false;
            this.f9556 = 3;
            this.f9557 = 3;
            this.f9555.clear();
            this.f9554.clear();
        }
    }

    @Override // p000.InterfaceC2614
    public final InterfaceC2614 getRoot() {
        InterfaceC2614 root;
        synchronized (this.f9553) {
            try {
                InterfaceC2614 interfaceC2614 = this.f9552;
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
        synchronized (this.f9553) {
            z = true;
            if (this.f9556 != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2614, p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo2974() {
        boolean z;
        synchronized (this.f9553) {
            try {
                z = this.f9555.mo2974() || this.f9554.mo2974();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo2975(InterfaceC2610 interfaceC2610) {
        if (!(interfaceC2610 instanceof C2985)) {
            return false;
        }
        C2985 c2985 = (C2985) interfaceC2610;
        if (this.f9554 == null) {
            if (c2985.f9554 != null) {
                return false;
            }
        } else if (!this.f9554.mo2975(c2985.f9554)) {
            return false;
        }
        if (this.f9555 == null) {
            return c2985.f9555 == null;
        }
        return this.f9555.mo2975(c2985.f9555);
    }

    @Override // p000.InterfaceC2614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2976(InterfaceC2610 interfaceC2610) {
        synchronized (this.f9553) {
            try {
                if (!interfaceC2610.equals(this.f9554)) {
                    this.f9557 = 5;
                    return;
                }
                this.f9556 = 5;
                InterfaceC2614 interfaceC2614 = this.f9552;
                if (interfaceC2614 != null) {
                    interfaceC2614.mo2976(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2977(InterfaceC2610 interfaceC2610) {
        synchronized (this.f9553) {
            try {
                if (interfaceC2610.equals(this.f9555)) {
                    this.f9557 = 4;
                    return;
                }
                this.f9556 = 4;
                InterfaceC2614 interfaceC2614 = this.f9552;
                if (interfaceC2614 != null) {
                    interfaceC2614.mo2977(this);
                }
                if (!AbstractC1095.m2788(this.f9557)) {
                    this.f9555.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2978() {
        synchronized (this.f9553) {
            try {
                if (!AbstractC1095.m2788(this.f9557)) {
                    this.f9557 = 2;
                    this.f9555.mo2978();
                }
                if (!AbstractC1095.m2788(this.f9556)) {
                    this.f9556 = 2;
                    this.f9554.mo2978();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo2979(InterfaceC2610 interfaceC2610) {
        boolean z;
        synchronized (this.f9553) {
            try {
                InterfaceC2614 interfaceC2614 = this.f9552;
                z = (interfaceC2614 == null || interfaceC2614.mo2979(this)) && interfaceC2610.equals(this.f9554) && this.f9556 != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo2980(InterfaceC2610 interfaceC2610) {
        boolean z;
        synchronized (this.f9553) {
            try {
                InterfaceC2614 interfaceC2614 = this.f9552;
                z = (interfaceC2614 == null || interfaceC2614.mo2980(this)) && interfaceC2610.equals(this.f9554) && !mo2974();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2614
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo2981(InterfaceC2610 interfaceC2610) {
        boolean z;
        synchronized (this.f9553) {
            try {
                InterfaceC2614 interfaceC2614 = this.f9552;
                z = (interfaceC2614 == null || interfaceC2614.mo2981(this)) && (interfaceC2610.equals(this.f9554) || this.f9556 != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final boolean mo2982() {
        boolean z;
        synchronized (this.f9553) {
            z = this.f9556 == 3;
        }
        return z;
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo2983() {
        synchronized (this.f9553) {
            try {
                this.f9558 = true;
                try {
                    if (this.f9556 != 4 && this.f9557 != 1) {
                        this.f9557 = 1;
                        this.f9555.mo2983();
                    }
                    if (this.f9558 && this.f9556 != 1) {
                        this.f9556 = 1;
                        this.f9554.mo2983();
                    }
                    this.f9558 = false;
                } catch (Throwable th) {
                    this.f9558 = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo2984() {
        boolean z;
        synchronized (this.f9553) {
            z = this.f9556 == 4;
        }
        return z;
    }
}
