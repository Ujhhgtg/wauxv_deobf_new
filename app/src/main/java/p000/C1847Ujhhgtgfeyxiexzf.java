package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1847Ujhhgtgfeyxiexzf implements InterfaceC0146Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C1847Ujhhgtgfeyxiexzf f6189Ujhhgtgfeyxiexzf = new C1847Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C0834feyxiexzfUjhhgtg f6190Ujhhgtgfeyxiexzf = new C0834feyxiexzfUjhhgtg("kotlin.uuid.Uuid", C0839feyxiexzfUjhhgtg.f3317Ujhhgtgfeyxiexzf);

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC1121feyxiexzfUjhhgtg mo1106Ujhhgtgfeyxiexzf() {
        return f6190Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo1180Ujhhgtgfeyxiexzf(InterfaceC3091Ujhhgtgfeyxiexzf interfaceC3091Ujhhgtgfeyxiexzf) {
        String strMo2281feyxiexzfUjhhgtg = interfaceC3091Ujhhgtgfeyxiexzf.mo2281feyxiexzfUjhhgtg();
        int length = strMo2281feyxiexzfUjhhgtg.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strMo2281feyxiexzfUjhhgtg.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = AbstractC0547Ujhhgtgfeyxiexzf.f2538Ujhhgtgfeyxiexzf[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                AbstractC1264feyxiexzfUjhhgtg.m2814feyxiexzfUjhhgtg(i, strMo2281feyxiexzfUjhhgtg, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strMo2281feyxiexzfUjhhgtg.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = AbstractC0547Ujhhgtgfeyxiexzf.f2538Ujhhgtgfeyxiexzf[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                AbstractC1264feyxiexzfUjhhgtg.m2814feyxiexzfUjhhgtg(i2, strMo2281feyxiexzfUjhhgtg, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new C1845Ujhhgtgfeyxiexzf(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strMo2281feyxiexzfUjhhgtg.length() <= 64 ? strMo2281feyxiexzfUjhhgtg : strMo2281feyxiexzfUjhhgtg.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strMo2281feyxiexzfUjhhgtg.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strMo2281feyxiexzfUjhhgtg.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = AbstractC0547Ujhhgtgfeyxiexzf.f2538Ujhhgtgfeyxiexzf[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                AbstractC1264feyxiexzfUjhhgtg.m2814feyxiexzfUjhhgtg(i, strMo2281feyxiexzfUjhhgtg, "a hexadecimal digit");
                throw null;
            }
            if (strMo2281feyxiexzfUjhhgtg.charAt(8) != '-') {
                AbstractC1264feyxiexzfUjhhgtg.m2814feyxiexzfUjhhgtg(8, strMo2281feyxiexzfUjhhgtg, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strMo2281feyxiexzfUjhhgtg.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = AbstractC0547Ujhhgtgfeyxiexzf.f2538Ujhhgtgfeyxiexzf[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                AbstractC1264feyxiexzfUjhhgtg.m2814feyxiexzfUjhhgtg(i3, strMo2281feyxiexzfUjhhgtg, "a hexadecimal digit");
                throw null;
            }
            if (strMo2281feyxiexzfUjhhgtg.charAt(13) != '-') {
                AbstractC1264feyxiexzfUjhhgtg.m2814feyxiexzfUjhhgtg(13, strMo2281feyxiexzfUjhhgtg, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strMo2281feyxiexzfUjhhgtg.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = AbstractC0547Ujhhgtgfeyxiexzf.f2538Ujhhgtgfeyxiexzf[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                AbstractC1264feyxiexzfUjhhgtg.m2814feyxiexzfUjhhgtg(i4, strMo2281feyxiexzfUjhhgtg, "a hexadecimal digit");
                throw null;
            }
            if (strMo2281feyxiexzfUjhhgtg.charAt(18) != '-') {
                AbstractC1264feyxiexzfUjhhgtg.m2814feyxiexzfUjhhgtg(18, strMo2281feyxiexzfUjhhgtg, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strMo2281feyxiexzfUjhhgtg.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = AbstractC0547Ujhhgtgfeyxiexzf.f2538Ujhhgtgfeyxiexzf[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                AbstractC1264feyxiexzfUjhhgtg.m2814feyxiexzfUjhhgtg(i5, strMo2281feyxiexzfUjhhgtg, "a hexadecimal digit");
                throw null;
            }
            if (strMo2281feyxiexzfUjhhgtg.charAt(23) != '-') {
                AbstractC1264feyxiexzfUjhhgtg.m2814feyxiexzfUjhhgtg(23, strMo2281feyxiexzfUjhhgtg, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strMo2281feyxiexzfUjhhgtg.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = AbstractC0547Ujhhgtgfeyxiexzf.f2538Ujhhgtgfeyxiexzf[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                AbstractC1264feyxiexzfUjhhgtg.m2814feyxiexzfUjhhgtg(i6, strMo2281feyxiexzfUjhhgtg, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new C1845Ujhhgtgfeyxiexzf(j22, j23);
            }
        }
        return C1845Ujhhgtgfeyxiexzf.f6185Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1107Ujhhgtgfeyxiexzf(InterfaceC3329Ujhhgtgfeyxiexzf interfaceC3329Ujhhgtgfeyxiexzf, Object obj) {
        interfaceC3329Ujhhgtgfeyxiexzf.mo2348Ujhhgtgfeyxiexzf(((C1845Ujhhgtgfeyxiexzf) obj).toString());
    }
}
