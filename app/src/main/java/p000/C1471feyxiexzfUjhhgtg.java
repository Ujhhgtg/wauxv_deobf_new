package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸能不能ᛳᛱUjhhgtgᛱᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1471feyxiexzfUjhhgtg implements InterfaceC0156Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2639feyxiexzfUjhhgtg f5110Ujhhgtgfeyxiexzf = new C2639feyxiexzfUjhhgtg(0);

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final boolean equals(Object obj) {
        if (obj instanceof C1471feyxiexzfUjhhgtg) {
            return this.f5110Ujhhgtgfeyxiexzf.equals(((C1471feyxiexzfUjhhgtg) obj).f5110Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final int hashCode() {
        return this.f5110Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f5110Ujhhgtgfeyxiexzf + '}';
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1203Ujhhgtgfeyxiexzf(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C2639feyxiexzfUjhhgtg c2639feyxiexzfUjhhgtg = this.f5110Ujhhgtgfeyxiexzf;
            if (i >= c2639feyxiexzfUjhhgtg.f4069Ujhhgtgfeyxiexzf) {
                return;
            }
            C1469feyxiexzfUjhhgtg c1469feyxiexzfUjhhgtg = (C1469feyxiexzfUjhhgtg) c2639feyxiexzfUjhhgtg.m2536Ujhhgtgfeyxiexzf(i);
            Object objM2540Ujhhgtgfeyxiexzf = this.f5110Ujhhgtgfeyxiexzf.m2540Ujhhgtgfeyxiexzf(i);
            InterfaceC1468feyxiexzfUjhhgtg interfaceC1468feyxiexzfUjhhgtg = c1469feyxiexzfUjhhgtg.f5105Ujhhgtgfeyxiexzf;
            if (c1469feyxiexzfUjhhgtg.f5107Ujhhgtgfeyxiexzf == null) {
                c1469feyxiexzfUjhhgtg.f5107Ujhhgtgfeyxiexzf = c1469feyxiexzfUjhhgtg.f5106Ujhhgtgfeyxiexzf.getBytes(InterfaceC0156Ujhhgtgfeyxiexzf.f1329Ujhhgtgfeyxiexzf);
            }
            interfaceC1468feyxiexzfUjhhgtg.mo1736Ujhhgtgfeyxiexzf(c1469feyxiexzfUjhhgtg.f5107Ujhhgtgfeyxiexzf, objM2540Ujhhgtgfeyxiexzf, messageDigest);
            i++;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object m2973Ujhhgtgfeyxiexzf(C1469feyxiexzfUjhhgtg c1469feyxiexzfUjhhgtg) {
        C2639feyxiexzfUjhhgtg c2639feyxiexzfUjhhgtg = this.f5110Ujhhgtgfeyxiexzf;
        return c2639feyxiexzfUjhhgtg.containsKey(c1469feyxiexzfUjhhgtg) ? c2639feyxiexzfUjhhgtg.get(c1469feyxiexzfUjhhgtg) : c1469feyxiexzfUjhhgtg.f5104Ujhhgtgfeyxiexzf;
    }
}
