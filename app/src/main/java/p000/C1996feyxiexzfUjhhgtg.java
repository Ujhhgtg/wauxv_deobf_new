package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱfeyxiexzfᛱᛳ要点脸ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1996feyxiexzfUjhhgtg implements InterfaceC0993feyxiexzfUjhhgtg, InterfaceC0994feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC0993feyxiexzfUjhhgtg f6576Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object f6577Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public volatile C1046feyxiexzfUjhhgtg f6578Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public volatile InterfaceC0994feyxiexzfUjhhgtg f6579Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f6580Ujhhgtgfeyxiexzf = 3;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f6581Ujhhgtgfeyxiexzf = 3;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f6582Ujhhgtgfeyxiexzf;

    public C1996feyxiexzfUjhhgtg(Object obj, InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg) {
        this.f6577Ujhhgtgfeyxiexzf = obj;
        this.f6576Ujhhgtgfeyxiexzf = interfaceC0993feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    public final void clear() {
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            this.f6582Ujhhgtgfeyxiexzf = false;
            this.f6580Ujhhgtgfeyxiexzf = 3;
            this.f6581Ujhhgtgfeyxiexzf = 3;
            this.f6579Ujhhgtgfeyxiexzf.clear();
            this.f6578Ujhhgtgfeyxiexzf.clear();
        }
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg
    public final InterfaceC0993feyxiexzfUjhhgtg getRoot() {
        InterfaceC0993feyxiexzfUjhhgtg root;
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            try {
                InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg = this.f6576Ujhhgtgfeyxiexzf;
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
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            z = true;
            if (this.f6580Ujhhgtgfeyxiexzf != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg, p000.InterfaceC0994feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo2490Ujhhgtgfeyxiexzf() {
        boolean z;
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            try {
                z = this.f6579Ujhhgtgfeyxiexzf.mo2490Ujhhgtgfeyxiexzf() || this.f6578Ujhhgtgfeyxiexzf.mo2490Ujhhgtgfeyxiexzf();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final boolean mo2496Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        if (!(interfaceC0994feyxiexzfUjhhgtg instanceof C1996feyxiexzfUjhhgtg)) {
            return false;
        }
        C1996feyxiexzfUjhhgtg c1996feyxiexzfUjhhgtg = (C1996feyxiexzfUjhhgtg) interfaceC0994feyxiexzfUjhhgtg;
        if (this.f6578Ujhhgtgfeyxiexzf == null) {
            if (c1996feyxiexzfUjhhgtg.f6578Ujhhgtgfeyxiexzf != null) {
                return false;
            }
        } else if (!this.f6578Ujhhgtgfeyxiexzf.mo2496Ujhhgtgfeyxiexzf(c1996feyxiexzfUjhhgtg.f6578Ujhhgtgfeyxiexzf)) {
            return false;
        }
        if (this.f6579Ujhhgtgfeyxiexzf == null) {
            return c1996feyxiexzfUjhhgtg.f6579Ujhhgtgfeyxiexzf == null;
        }
        return this.f6579Ujhhgtgfeyxiexzf.mo2496Ujhhgtgfeyxiexzf(c1996feyxiexzfUjhhgtg.f6579Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo2491Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            try {
                if (!interfaceC0994feyxiexzfUjhhgtg.equals(this.f6578Ujhhgtgfeyxiexzf)) {
                    this.f6581Ujhhgtgfeyxiexzf = 5;
                    return;
                }
                this.f6580Ujhhgtgfeyxiexzf = 5;
                InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg = this.f6576Ujhhgtgfeyxiexzf;
                if (interfaceC0993feyxiexzfUjhhgtg != null) {
                    interfaceC0993feyxiexzfUjhhgtg.mo2491Ujhhgtgfeyxiexzf(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo2492Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            try {
                if (interfaceC0994feyxiexzfUjhhgtg.equals(this.f6579Ujhhgtgfeyxiexzf)) {
                    this.f6581Ujhhgtgfeyxiexzf = 4;
                    return;
                }
                this.f6580Ujhhgtgfeyxiexzf = 4;
                InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg = this.f6576Ujhhgtgfeyxiexzf;
                if (interfaceC0993feyxiexzfUjhhgtg != null) {
                    interfaceC0993feyxiexzfUjhhgtg.mo2492Ujhhgtgfeyxiexzf(this);
                }
                if (!AbstractC3317feyxiexzfUjhhgtg.m4789Ujhhgtgfeyxiexzf(this.f6581Ujhhgtgfeyxiexzf)) {
                    this.f6579Ujhhgtgfeyxiexzf.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo2497Ujhhgtgfeyxiexzf() {
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            try {
                if (!AbstractC3317feyxiexzfUjhhgtg.m4789Ujhhgtgfeyxiexzf(this.f6581Ujhhgtgfeyxiexzf)) {
                    this.f6581Ujhhgtgfeyxiexzf = 2;
                    this.f6579Ujhhgtgfeyxiexzf.mo2497Ujhhgtgfeyxiexzf();
                }
                if (!AbstractC3317feyxiexzfUjhhgtg.m4789Ujhhgtgfeyxiexzf(this.f6580Ujhhgtgfeyxiexzf)) {
                    this.f6580Ujhhgtgfeyxiexzf = 2;
                    this.f6578Ujhhgtgfeyxiexzf.mo2497Ujhhgtgfeyxiexzf();
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
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            try {
                InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg = this.f6576Ujhhgtgfeyxiexzf;
                z = (interfaceC0993feyxiexzfUjhhgtg == null || interfaceC0993feyxiexzfUjhhgtg.mo2493Ujhhgtgfeyxiexzf(this)) && interfaceC0994feyxiexzfUjhhgtg.equals(this.f6578Ujhhgtgfeyxiexzf) && this.f6580Ujhhgtgfeyxiexzf != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final boolean mo2494Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        boolean z;
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            try {
                InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg = this.f6576Ujhhgtgfeyxiexzf;
                z = (interfaceC0993feyxiexzfUjhhgtg == null || interfaceC0993feyxiexzfUjhhgtg.mo2494Ujhhgtgfeyxiexzf(this)) && interfaceC0994feyxiexzfUjhhgtg.equals(this.f6578Ujhhgtgfeyxiexzf) && !mo2490Ujhhgtgfeyxiexzf();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC0993feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final boolean mo2495Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        boolean z;
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            try {
                InterfaceC0993feyxiexzfUjhhgtg interfaceC0993feyxiexzfUjhhgtg = this.f6576Ujhhgtgfeyxiexzf;
                z = (interfaceC0993feyxiexzfUjhhgtg == null || interfaceC0993feyxiexzfUjhhgtg.mo2495Ujhhgtgfeyxiexzf(this)) && (interfaceC0994feyxiexzfUjhhgtg.equals(this.f6578Ujhhgtgfeyxiexzf) || this.f6580Ujhhgtgfeyxiexzf != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final boolean mo2498Ujhhgtgfeyxiexzf() {
        boolean z;
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            z = this.f6580Ujhhgtgfeyxiexzf == 3;
        }
        return z;
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo2499Ujhhgtgfeyxiexzf() {
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            try {
                this.f6582Ujhhgtgfeyxiexzf = true;
                try {
                    if (this.f6580Ujhhgtgfeyxiexzf != 4 && this.f6581Ujhhgtgfeyxiexzf != 1) {
                        this.f6581Ujhhgtgfeyxiexzf = 1;
                        this.f6579Ujhhgtgfeyxiexzf.mo2499Ujhhgtgfeyxiexzf();
                    }
                    if (this.f6582Ujhhgtgfeyxiexzf && this.f6580Ujhhgtgfeyxiexzf != 1) {
                        this.f6580Ujhhgtgfeyxiexzf = 1;
                        this.f6578Ujhhgtgfeyxiexzf.mo2499Ujhhgtgfeyxiexzf();
                    }
                    this.f6582Ujhhgtgfeyxiexzf = false;
                } catch (Throwable th) {
                    this.f6582Ujhhgtgfeyxiexzf = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC0994feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final boolean mo2500Ujhhgtgfeyxiexzf() {
        boolean z;
        synchronized (this.f6577Ujhhgtgfeyxiexzf) {
            z = this.f6580Ujhhgtgfeyxiexzf == 4;
        }
        return z;
    }
}
