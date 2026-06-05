package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ要点脸ᛱfeyxiexzfᛱ能不能ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0263Ujhhgtgfeyxiexzf implements InterfaceC0901feyxiexzfUjhhgtg, InterfaceC3508feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C2366Ujhhgtgfeyxiexzf f1644Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.m2791Ujhhgtgfeyxiexzf(20, new C3339feyxiexzfUjhhgtg(25));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1131feyxiexzfUjhhgtg f1645Ujhhgtgfeyxiexzf = new C1131feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public InterfaceC0901feyxiexzfUjhhgtg f1646Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f1647Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f1648Ujhhgtgfeyxiexzf;

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    public final Object get() {
        return this.f1646Ujhhgtgfeyxiexzf.get();
    }

    @Override // p000.InterfaceC3508feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1131feyxiexzfUjhhgtg mo1443Ujhhgtgfeyxiexzf() {
        return this.f1645Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final synchronized void mo1444Ujhhgtgfeyxiexzf() {
        this.f1645Ujhhgtgfeyxiexzf.m2600Ujhhgtgfeyxiexzf();
        this.f1648Ujhhgtgfeyxiexzf = true;
        if (!this.f1647Ujhhgtgfeyxiexzf) {
            this.f1646Ujhhgtgfeyxiexzf.mo1444Ujhhgtgfeyxiexzf();
            this.f1646Ujhhgtgfeyxiexzf = null;
            f1644Ujhhgtgfeyxiexzf.mo2932Ujhhgtgfeyxiexzf(this);
        }
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int mo1445Ujhhgtgfeyxiexzf() {
        return this.f1646Ujhhgtgfeyxiexzf.mo1445Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Class mo1446Ujhhgtgfeyxiexzf() {
        return this.f1646Ujhhgtgfeyxiexzf.mo1446Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final synchronized void m1447Ujhhgtgfeyxiexzf() {
        this.f1645Ujhhgtgfeyxiexzf.m2600Ujhhgtgfeyxiexzf();
        if (!this.f1647Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f1647Ujhhgtgfeyxiexzf = false;
        if (this.f1648Ujhhgtgfeyxiexzf) {
            mo1444Ujhhgtgfeyxiexzf();
        }
    }
}
