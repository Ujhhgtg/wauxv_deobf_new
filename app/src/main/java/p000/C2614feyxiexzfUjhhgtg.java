package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛱfeyxiexzfᛱᛴ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2614feyxiexzfUjhhgtg implements InterfaceC0059Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f8427Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f8428Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f8429Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0684Ujhhgtgfeyxiexzf f8430Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2650feyxiexzfUjhhgtg f8431Ujhhgtgfeyxiexzf;

    public C2614feyxiexzfUjhhgtg(int i, int i2, int i3, C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf, C2650feyxiexzfUjhhgtg c2650feyxiexzfUjhhgtg) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        int i4 = c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf;
        for (int i5 = 0; i5 < i4; i5++) {
            if (c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(i5) < 0) {
                StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i5, "successors[", "] == ");
                sbM4804Ujhhgtgfeyxiexzf.append(c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(i5));
                throw new IllegalArgumentException(sbM4804Ujhhgtgfeyxiexzf.toString());
            }
        }
        if (c2650feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("catches == null");
        }
        this.f8427Ujhhgtgfeyxiexzf = i;
        this.f8428Ujhhgtgfeyxiexzf = i2;
        this.f8429Ujhhgtgfeyxiexzf = i3;
        this.f8430Ujhhgtgfeyxiexzf = c0684Ujhhgtgfeyxiexzf;
        this.f8431Ujhhgtgfeyxiexzf = c2650feyxiexzfUjhhgtg;
    }

    public final String toString() {
        return "{" + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(this.f8427Ujhhgtgfeyxiexzf) + ": " + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(this.f8428Ujhhgtgfeyxiexzf) + ".." + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(this.f8429Ujhhgtgfeyxiexzf) + '}';
    }

    @Override // p000.InterfaceC0059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo1055Ujhhgtgfeyxiexzf() {
        return this.f8427Ujhhgtgfeyxiexzf;
    }
}
