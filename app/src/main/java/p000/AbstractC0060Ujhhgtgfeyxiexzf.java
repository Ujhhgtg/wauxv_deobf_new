package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ能不能要点脸ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0060Ujhhgtgfeyxiexzf extends AbstractC3474Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0684Ujhhgtgfeyxiexzf f1074Ujhhgtgfeyxiexzf;

    public AbstractC0060Ujhhgtgfeyxiexzf(int i) {
        super(i);
        this.f1074Ujhhgtgfeyxiexzf = new C0684Ujhhgtgfeyxiexzf(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final int m1056Ujhhgtgfeyxiexzf() {
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = this.f1074Ujhhgtgfeyxiexzf;
        int i = c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf - 1;
        while (i >= 0 && c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(i) < 0) {
            i--;
        }
        int i2 = i + 1;
        c0684Ujhhgtgfeyxiexzf.m1947Ujhhgtgfeyxiexzf(i2);
        return i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int m1057Ujhhgtgfeyxiexzf(int i) {
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = this.f1074Ujhhgtgfeyxiexzf;
        if (i >= c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf) {
            return -1;
        }
        return c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m1058Ujhhgtgfeyxiexzf(int i, InterfaceC0059Ujhhgtgfeyxiexzf interfaceC0059Ujhhgtgfeyxiexzf) {
        InterfaceC0059Ujhhgtgfeyxiexzf interfaceC0059Ujhhgtgfeyxiexzf2 = (InterfaceC0059Ujhhgtgfeyxiexzf) this.f10801Ujhhgtgfeyxiexzf[i];
        m4970Ujhhgtgfeyxiexzf(i, interfaceC0059Ujhhgtgfeyxiexzf);
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = this.f1074Ujhhgtgfeyxiexzf;
        if (interfaceC0059Ujhhgtgfeyxiexzf2 != null) {
            c0684Ujhhgtgfeyxiexzf.m1946Ujhhgtgfeyxiexzf(interfaceC0059Ujhhgtgfeyxiexzf2.mo1055Ujhhgtgfeyxiexzf(), -1);
        }
        if (interfaceC0059Ujhhgtgfeyxiexzf != null) {
            int iMo1055Ujhhgtgfeyxiexzf = interfaceC0059Ujhhgtgfeyxiexzf.mo1055Ujhhgtgfeyxiexzf();
            int i2 = c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf;
            for (int i3 = 0; i3 <= iMo1055Ujhhgtgfeyxiexzf - i2; i3++) {
                c0684Ujhhgtgfeyxiexzf.m1942Ujhhgtgfeyxiexzf(-1);
            }
            c0684Ujhhgtgfeyxiexzf.m1946Ujhhgtgfeyxiexzf(iMo1055Ujhhgtgfeyxiexzf, i);
        }
    }
}
