package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱ能不能ᛴᛲᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3153Ujhhgtgfeyxiexzf extends AbstractC1774Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final String[] f9762Ujhhgtgfeyxiexzf = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f9763Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final AbstractC3638Ujhhgtgfeyxiexzf f9764Ujhhgtgfeyxiexzf;

    public C3153Ujhhgtgfeyxiexzf(int i, AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        this.f9763Ujhhgtgfeyxiexzf = i;
        this.f9764Ujhhgtgfeyxiexzf = abstractC3638Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m4666Ujhhgtgfeyxiexzf(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static C3153Ujhhgtgfeyxiexzf m4667Ujhhgtgfeyxiexzf(int i, AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        if (!m4666Ujhhgtgfeyxiexzf(i)) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    if (!(abstractC3638Ujhhgtgfeyxiexzf instanceof AbstractC3756feyxiexzfUjhhgtg)) {
                        throw new IllegalArgumentException("ref has wrong type: " + abstractC3638Ujhhgtgfeyxiexzf.getClass());
                    }
                    break;
                default:
                    throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "type is out of range: "));
            }
        } else if (!(abstractC3638Ujhhgtgfeyxiexzf instanceof C3140Ujhhgtgfeyxiexzf)) {
            throw new IllegalArgumentException("ref has wrong type: " + abstractC3638Ujhhgtgfeyxiexzf.getClass());
        }
        return new C3153Ujhhgtgfeyxiexzf(i, abstractC3638Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC1793feyxiexzfUjhhgtg
    public final C1784feyxiexzfUjhhgtg getType() {
        return C1784feyxiexzfUjhhgtg.f5992Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        return "method-handle{" + mo1392Ujhhgtgfeyxiexzf() + "}";
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        return f9762Ujhhgtgfeyxiexzf[this.f9763Ujhhgtgfeyxiexzf] + "," + this.f9764Ujhhgtgfeyxiexzf.toString();
    }

    @Override // p000.AbstractC3638Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final int mo4535Ujhhgtgfeyxiexzf(AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        C3153Ujhhgtgfeyxiexzf c3153Ujhhgtgfeyxiexzf = (C3153Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf;
        int i = c3153Ujhhgtgfeyxiexzf.f9763Ujhhgtgfeyxiexzf;
        int i2 = this.f9763Ujhhgtgfeyxiexzf;
        return i2 == i ? this.f9764Ujhhgtgfeyxiexzf.compareTo(c3153Ujhhgtgfeyxiexzf.f9764Ujhhgtgfeyxiexzf) : Integer.compare(i2, i);
    }

    @Override // p000.AbstractC3638Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final boolean mo4536Ujhhgtgfeyxiexzf() {
        return false;
    }

    @Override // p000.AbstractC3638Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final String mo4533Ujhhgtgfeyxiexzf() {
        return "method handle";
    }
}
