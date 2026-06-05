package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴ能不能ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3368Ujhhgtgfeyxiexzf implements InterfaceC0901feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean f10529Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean f10530Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final InterfaceC0901feyxiexzfUjhhgtg f10531Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC3367Ujhhgtgfeyxiexzf f10532Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final InterfaceC0156Ujhhgtgfeyxiexzf f10533Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f10534Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f10535Ujhhgtgfeyxiexzf;

    public C3368Ujhhgtgfeyxiexzf(InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg, boolean z, boolean z2, InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, InterfaceC3367Ujhhgtgfeyxiexzf interfaceC3367Ujhhgtgfeyxiexzf) {
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(interfaceC0901feyxiexzfUjhhgtg, "Argument must not be null");
        this.f10531Ujhhgtgfeyxiexzf = interfaceC0901feyxiexzfUjhhgtg;
        this.f10529Ujhhgtgfeyxiexzf = z;
        this.f10530Ujhhgtgfeyxiexzf = z2;
        this.f10533Ujhhgtgfeyxiexzf = interfaceC0156Ujhhgtgfeyxiexzf;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(interfaceC3367Ujhhgtgfeyxiexzf, "Argument must not be null");
        this.f10532Ujhhgtgfeyxiexzf = interfaceC3367Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    public final Object get() {
        return this.f10531Ujhhgtgfeyxiexzf.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f10529Ujhhgtgfeyxiexzf + ", listener=" + this.f10532Ujhhgtgfeyxiexzf + ", key=" + this.f10533Ujhhgtgfeyxiexzf + ", acquired=" + this.f10534Ujhhgtgfeyxiexzf + ", isRecycled=" + this.f10535Ujhhgtgfeyxiexzf + ", resource=" + this.f10531Ujhhgtgfeyxiexzf + '}';
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final synchronized void m4877Ujhhgtgfeyxiexzf() {
        if (this.f10535Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f10534Ujhhgtgfeyxiexzf++;
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final synchronized void mo1444Ujhhgtgfeyxiexzf() {
        if (this.f10534Ujhhgtgfeyxiexzf > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f10535Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f10535Ujhhgtgfeyxiexzf = true;
        if (this.f10530Ujhhgtgfeyxiexzf) {
            this.f10531Ujhhgtgfeyxiexzf.mo1444Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo1445Ujhhgtgfeyxiexzf() {
        return this.f10531Ujhhgtgfeyxiexzf.mo1445Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final Class mo1446Ujhhgtgfeyxiexzf() {
        return this.f10531Ujhhgtgfeyxiexzf.mo1446Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m4878Ujhhgtgfeyxiexzf() {
        boolean z;
        synchronized (this) {
            int i = this.f10534Ujhhgtgfeyxiexzf;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f10534Ujhhgtgfeyxiexzf = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            ((C3334feyxiexzfUjhhgtg) this.f10532Ujhhgtgfeyxiexzf).m4824Ujhhgtgfeyxiexzf(this.f10533Ujhhgtgfeyxiexzf, this);
        }
    }
}
