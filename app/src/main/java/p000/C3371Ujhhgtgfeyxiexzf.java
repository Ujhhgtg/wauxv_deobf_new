package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴ能不能ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3371Ujhhgtgfeyxiexzf implements InterfaceC0993feyxiexzfUjhhgtg, InterfaceC0994feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object f10538Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC0993feyxiexzfUjhhgtg f10539Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public volatile InterfaceC0994feyxiexzfUjhhgtg f10540Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public volatile InterfaceC0994feyxiexzfUjhhgtg f10541Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f10542Ujhhgtgfeyxiexzf = 3;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f10543Ujhhgtgfeyxiexzf = 3;

    public C3371Ujhhgtgfeyxiexzf(Object obj, InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg) {
        this.f10538Ujhhgtgfeyxiexzf = obj;
        this.f10539Ujhhgtgfeyxiexzf = interfaceC0993feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    public final void clear() {
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            try {
                this.f10542Ujhhgtgfeyxiexzf = 3;
                this.f10540Ujhhgtgfeyxiexzf.clear();
                if (this.f10543Ujhhgtgfeyxiexzf != 3) {
                    this.f10543Ujhhgtgfeyxiexzf = 3;
                    this.f10541Ujhhgtgfeyxiexzf.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg
    public final InterfaceC0993feyxiexzfUjhhgtg getRoot() {
        InterfaceC0993feyxiexzfUjhhgtg root;
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            try {
                InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg = this.f10539Ujhhgtgfeyxiexzf;
                root = interfaceC0993feyxiexzfUjhhgtg != null ? interfaceC0993feyxiexzfUjhhgtg.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            try {
                z = true;
                if (this.f10542Ujhhgtgfeyxiexzf != 1 && this.f10543Ujhhgtgfeyxiexzf != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg, p000.InterfaceC0994feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo2490Ujhhgtgfeyxiexzf() {
        boolean z;
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            try {
                z = this.f10540Ujhhgtgfeyxiexzf.mo2490Ujhhgtgfeyxiexzf() || this.f10541Ujhhgtgfeyxiexzf.mo2490Ujhhgtgfeyxiexzf();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final boolean mo2496Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        if (interfaceC0994feyxiexzfUjhhgtg instanceof C3371Ujhhgtgfeyxiexzf) {
            C3371Ujhhgtgfeyxiexzf c3371Ujhhgtgfeyxiexzf = (C3371Ujhhgtgfeyxiexzf) interfaceC0994feyxiexzfUjhhgtg;
            if (this.f10540Ujhhgtgfeyxiexzf.mo2496Ujhhgtgfeyxiexzf(c3371Ujhhgtgfeyxiexzf.f10540Ujhhgtgfeyxiexzf) && this.f10541Ujhhgtgfeyxiexzf.mo2496Ujhhgtgfeyxiexzf(c3371Ujhhgtgfeyxiexzf.f10541Ujhhgtgfeyxiexzf)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo2491Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            try {
                if (interfaceC0994feyxiexzfUjhhgtg.equals(this.f10541Ujhhgtgfeyxiexzf)) {
                    this.f10543Ujhhgtgfeyxiexzf = 5;
                    InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg = this.f10539Ujhhgtgfeyxiexzf;
                    if (interfaceC0993feyxiexzfUjhhgtg != null) {
                        interfaceC0993feyxiexzfUjhhgtg.mo2491Ujhhgtgfeyxiexzf(this);
                    }
                    return;
                }
                this.f10542Ujhhgtgfeyxiexzf = 5;
                if (this.f10543Ujhhgtgfeyxiexzf != 1) {
                    this.f10543Ujhhgtgfeyxiexzf = 1;
                    this.f10541Ujhhgtgfeyxiexzf.mo2499Ujhhgtgfeyxiexzf();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo2492Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            try {
                if (interfaceC0994feyxiexzfUjhhgtg.equals(this.f10540Ujhhgtgfeyxiexzf)) {
                    this.f10542Ujhhgtgfeyxiexzf = 4;
                } else if (interfaceC0994feyxiexzfUjhhgtg.equals(this.f10541Ujhhgtgfeyxiexzf)) {
                    this.f10543Ujhhgtgfeyxiexzf = 4;
                }
                InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg = this.f10539Ujhhgtgfeyxiexzf;
                if (interfaceC0993feyxiexzfUjhhgtg != null) {
                    interfaceC0993feyxiexzfUjhhgtg.mo2492Ujhhgtgfeyxiexzf(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo2497Ujhhgtgfeyxiexzf() {
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            try {
                if (this.f10542Ujhhgtgfeyxiexzf == 1) {
                    this.f10542Ujhhgtgfeyxiexzf = 2;
                    this.f10540Ujhhgtgfeyxiexzf.mo2497Ujhhgtgfeyxiexzf();
                }
                if (this.f10543Ujhhgtgfeyxiexzf == 1) {
                    this.f10543Ujhhgtgfeyxiexzf = 2;
                    this.f10541Ujhhgtgfeyxiexzf.mo2497Ujhhgtgfeyxiexzf();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final boolean mo2493Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        boolean z;
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg = this.f10539Ujhhgtgfeyxiexzf;
            z = (interfaceC0993feyxiexzfUjhhgtg == null || interfaceC0993feyxiexzfUjhhgtg.mo2493Ujhhgtgfeyxiexzf(this)) && interfaceC0994feyxiexzfUjhhgtg.equals(this.f10540Ujhhgtgfeyxiexzf);
        }
        return z;
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final boolean mo2494Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        boolean z;
        boolean zEquals;
        int i;
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg = this.f10539Ujhhgtgfeyxiexzf;
            z = false;
            if (interfaceC0993feyxiexzfUjhhgtg == null || interfaceC0993feyxiexzfUjhhgtg.mo2494Ujhhgtgfeyxiexzf(this)) {
                if (this.f10542Ujhhgtgfeyxiexzf != 5) {
                    zEquals = interfaceC0994feyxiexzfUjhhgtg.equals(this.f10540Ujhhgtgfeyxiexzf);
                } else {
                    zEquals = interfaceC0994feyxiexzfUjhhgtg.equals(this.f10541Ujhhgtgfeyxiexzf) && ((i = this.f10543Ujhhgtgfeyxiexzf) == 4 || i == 5);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final boolean mo2495Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        boolean z;
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg = this.f10539Ujhhgtgfeyxiexzf;
            z = interfaceC0993feyxiexzfUjhhgtg == null || interfaceC0993feyxiexzfUjhhgtg.mo2495Ujhhgtgfeyxiexzf(this);
        }
        return z;
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final boolean mo2498Ujhhgtgfeyxiexzf() {
        boolean z;
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            try {
                z = this.f10542Ujhhgtgfeyxiexzf == 3 && this.f10543Ujhhgtgfeyxiexzf == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo2499Ujhhgtgfeyxiexzf() {
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            try {
                if (this.f10542Ujhhgtgfeyxiexzf != 1) {
                    this.f10542Ujhhgtgfeyxiexzf = 1;
                    this.f10540Ujhhgtgfeyxiexzf.mo2499Ujhhgtgfeyxiexzf();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final boolean mo2500Ujhhgtgfeyxiexzf() {
        boolean z;
        synchronized (this.f10538Ujhhgtgfeyxiexzf) {
            try {
                z = this.f10542Ujhhgtgfeyxiexzf == 4 || this.f10543Ujhhgtgfeyxiexzf == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
