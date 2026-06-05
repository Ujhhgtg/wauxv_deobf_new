package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛲ要点脸ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2495feyxiexzfUjhhgtg implements InterfaceC0059Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f8152Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2657Ujhhgtgfeyxiexzf f8153Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0684Ujhhgtgfeyxiexzf f8154Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f8155Ujhhgtgfeyxiexzf;

    public C2495feyxiexzfUjhhgtg(int i, C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf, C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        try {
            c2657Ujhhgtgfeyxiexzf.m1730Ujhhgtgfeyxiexzf();
            int length = c2657Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
            if (length == 0) {
                throw new IllegalArgumentException("insns.size() == 0");
            }
            int i3 = length - 2;
            while (true) {
                if (i3 < 0) {
                    if (((AbstractC0671Ujhhgtgfeyxiexzf) c2657Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(length - 1)).f2786Ujhhgtgfeyxiexzf.f3754Ujhhgtgfeyxiexzf == 1) {
                        throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
                    }
                    try {
                        c0684Ujhhgtgfeyxiexzf.m1730Ujhhgtgfeyxiexzf();
                        if (i2 < -1) {
                            throw new IllegalArgumentException("primarySuccessor < -1");
                        }
                        if (i2 >= 0) {
                            int iM1943Ujhhgtgfeyxiexzf = c0684Ujhhgtgfeyxiexzf.m1943Ujhhgtgfeyxiexzf(i2);
                            if (!((iM1943Ujhhgtgfeyxiexzf >= 0 ? iM1943Ujhhgtgfeyxiexzf : -1) >= 0)) {
                                throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + c0684Ujhhgtgfeyxiexzf);
                            }
                        }
                        this.f8152Ujhhgtgfeyxiexzf = i;
                        this.f8153Ujhhgtgfeyxiexzf = c2657Ujhhgtgfeyxiexzf;
                        this.f8154Ujhhgtgfeyxiexzf = c0684Ujhhgtgfeyxiexzf;
                        this.f8155Ujhhgtgfeyxiexzf = i2;
                        return;
                    } catch (NullPointerException unused) {
                        throw new NullPointerException("successors == null");
                    }
                }
                if (((AbstractC0671Ujhhgtgfeyxiexzf) c2657Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i3)).f2786Ujhhgtgfeyxiexzf.f3754Ujhhgtgfeyxiexzf != 1) {
                    throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i3, "insns[", "] is a branch or can throw"));
                }
                i3--;
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("insns == null");
        }
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "{" + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(this.f8152Ujhhgtgfeyxiexzf) + '}';
    }

    @Override // p000.InterfaceC0059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo1055Ujhhgtgfeyxiexzf() {
        return this.f8152Ujhhgtgfeyxiexzf;
    }
}
