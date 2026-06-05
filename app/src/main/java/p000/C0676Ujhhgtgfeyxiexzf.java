package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛳᛴ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0676Ujhhgtgfeyxiexzf implements InterfaceC0146Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C0676Ujhhgtgfeyxiexzf f2795Ujhhgtgfeyxiexzf = new C0676Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C0834feyxiexzfUjhhgtg f2796Ujhhgtgfeyxiexzf = new C0834feyxiexzfUjhhgtg("kotlin.time.Instant", C0839feyxiexzfUjhhgtg.f3317Ujhhgtgfeyxiexzf);

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC1121feyxiexzfUjhhgtg mo1106Ujhhgtgfeyxiexzf() {
        return f2796Ujhhgtgfeyxiexzf;
    }

    /* JADX WARN: Code duplicated, block: B:194:0x0481  */
    /* JADX WARN: Code duplicated, block: B:195:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00df A[PHI: r2
      0x00df: PHI (r2v45 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛳ能不能ᛱfeyxiexzfᛱᛴ) = 
      (r2v4 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛳ能不能ᛱfeyxiexzfᛱᛴ)
      (r2v6 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛳ能不能ᛱfeyxiexzfᛱᛴ)
      (r2v8 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛳ能不能ᛱfeyxiexzfᛱᛴ)
      (r2v10 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛳ能不能ᛱfeyxiexzfᛱᛴ)
      (r2v12 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛳ能不能ᛱfeyxiexzfᛱᛴ)
     binds: [B:39:0x00dd, B:42:0x00ee, B:45:0x00ff, B:48:0x0111, B:51:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:194:0x0481, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:195:0x04a4, please report this as an issue */
    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final Object mo1180Ujhhgtgfeyxiexzf(InterfaceC3091Ujhhgtgfeyxiexzf interfaceC3091Ujhhgtgfeyxiexzf) {
        int i;
        int i2;
        int iM2691Ujhhgtgfeyxiexzf;
        InterfaceC0674Ujhhgtgfeyxiexzf interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg;
        int i3;
        char cCharAt;
        char cCharAt2;
        C0667Ujhhgtgfeyxiexzf c0667Ujhhgtgfeyxiexzf = C0667Ujhhgtgfeyxiexzf.f2779Ujhhgtgfeyxiexzf;
        String strMo2281feyxiexzfUjhhgtg = interfaceC3091Ujhhgtgfeyxiexzf.mo2281feyxiexzfUjhhgtg();
        if (strMo2281feyxiexzfUjhhgtg.length() == 0) {
            interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = new C0677Ujhhgtgfeyxiexzf("An empty string is not a valid Instant", strMo2281feyxiexzfUjhhgtg);
        } else {
            char cCharAt3 = strMo2281feyxiexzfUjhhgtg.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i4 = i;
            while (i4 < strMo2281feyxiexzfUjhhgtg.length() && '0' <= (cCharAt2 = strMo2281feyxiexzfUjhhgtg.charAt(i4)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strMo2281feyxiexzfUjhhgtg.charAt(i4) - '0');
                i4++;
            }
            int i5 = i4 - i;
            if (i5 > 10) {
                interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected at most 10 digits for the year number, got " + i5 + " digits");
            } else if (i5 == 10 && C3052Ujhhgtgfeyxiexzf.m4514Ujhhgtgfeyxiexzf(strMo2281feyxiexzfUjhhgtg.charAt(i), 50) >= 0) {
                interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected at most 9 digits for the year number or year 1000000000, got " + i5 + " digits");
            } else if (i5 < 4) {
                interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "The year number must be padded to 4 digits, got " + i5 + " digits");
            } else if (cCharAt3 == '+' && i5 == 4) {
                interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i5 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i6 = i4 + 16;
                if (strMo2281feyxiexzfUjhhgtg.length() < i6) {
                    interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "The input string is too short");
                } else {
                    C0677Ujhhgtgfeyxiexzf c0677UjhhgtgfeyxiexzfM4220feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4220feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "'-'", i4, new C0760Ujhhgtgfeyxiexzf(5));
                    if (c0677UjhhgtgfeyxiexzfM4220feyxiexzfUjhhgtg == null && (c0677UjhhgtgfeyxiexzfM4220feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4220feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "'-'", i4 + 3, new C0760Ujhhgtgfeyxiexzf(6))) == null && (c0677UjhhgtgfeyxiexzfM4220feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4220feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "'T' or 't'", i4 + 6, new C0760Ujhhgtgfeyxiexzf(7))) == null && (c0677UjhhgtgfeyxiexzfM4220feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4220feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "':'", i4 + 9, new C0760Ujhhgtgfeyxiexzf(8))) == null) {
                        int i7 = 9;
                        c0677UjhhgtgfeyxiexzfM4220feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4220feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "':'", i4 + 12, new C0760Ujhhgtgfeyxiexzf(9));
                        if (c0677UjhhgtgfeyxiexzfM4220feyxiexzfUjhhgtg != null) {
                            interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = c0677UjhhgtgfeyxiexzfM4220feyxiexzfUjhhgtg;
                        } else {
                            int[] iArr = AbstractC2855feyxiexzfUjhhgtg.f9111Ujhhgtgfeyxiexzf;
                            int i8 = 0;
                            while (i8 < 10) {
                                int i9 = i7;
                                interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4220feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "an ASCII digit", iArr[i8] + i4, new C0760Ujhhgtgfeyxiexzf(10));
                                if (interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg == null) {
                                    i8++;
                                    i7 = i9;
                                }
                            }
                            int i10 = i7;
                            int iM4222Ujhhgtgfeyxiexzf = AbstractC2855feyxiexzfUjhhgtg.m4222Ujhhgtgfeyxiexzf(i4 + 1, strMo2281feyxiexzfUjhhgtg);
                            int iM4222Ujhhgtgfeyxiexzf2 = AbstractC2855feyxiexzfUjhhgtg.m4222Ujhhgtgfeyxiexzf(i4 + 4, strMo2281feyxiexzfUjhhgtg);
                            int iM4222Ujhhgtgfeyxiexzf3 = AbstractC2855feyxiexzfUjhhgtg.m4222Ujhhgtgfeyxiexzf(i4 + 7, strMo2281feyxiexzfUjhhgtg);
                            int iM4222Ujhhgtgfeyxiexzf4 = AbstractC2855feyxiexzfUjhhgtg.m4222Ujhhgtgfeyxiexzf(i4 + 10, strMo2281feyxiexzfUjhhgtg);
                            int iM4222Ujhhgtgfeyxiexzf5 = AbstractC2855feyxiexzfUjhhgtg.m4222Ujhhgtgfeyxiexzf(i4 + 13, strMo2281feyxiexzfUjhhgtg);
                            int i11 = i4 + 15;
                            if (strMo2281feyxiexzfUjhhgtg.charAt(i11) == '.') {
                                i11 = i6;
                                int iCharAt2 = 0;
                                while (i11 < strMo2281feyxiexzfUjhhgtg.length() && '0' <= (cCharAt = strMo2281feyxiexzfUjhhgtg.charAt(i11)) && cCharAt < ':') {
                                    iCharAt2 = (iCharAt2 * 10) + (strMo2281feyxiexzfUjhhgtg.charAt(i11) - '0');
                                    i11++;
                                }
                                int i12 = i11 - i6;
                                if (1 > i12 || i12 >= 10) {
                                    interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "1..9 digits are supported for the fraction of the second, got " + i12 + " digits");
                                } else {
                                    i2 = iCharAt2 * AbstractC2855feyxiexzfUjhhgtg.f9110Ujhhgtgfeyxiexzf[9 - i12];
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i11 >= strMo2281feyxiexzfUjhhgtg.length()) {
                                interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "The UTC offset at the end of the string is missing");
                            } else {
                                char cCharAt4 = strMo2281feyxiexzfUjhhgtg.charAt(i11);
                                if (cCharAt4 == '+' || cCharAt4 == '-') {
                                    int length = strMo2281feyxiexzfUjhhgtg.length() - i11;
                                    if (length > i10) {
                                        interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "The UTC offset string \"" + AbstractC2855feyxiexzfUjhhgtg.m4230Ujhhgtgfeyxiexzf(16, strMo2281feyxiexzfUjhhgtg.subSequence(i11, strMo2281feyxiexzfUjhhgtg.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Invalid UTC offset string \"" + strMo2281feyxiexzfUjhhgtg.subSequence(i11, strMo2281feyxiexzfUjhhgtg.length()).toString() + '\"');
                                    } else {
                                        int[] iArr2 = AbstractC2855feyxiexzfUjhhgtg.f9112Ujhhgtgfeyxiexzf;
                                        int i13 = 0;
                                        for (int i14 = 2; i13 < i14; i14 = 2) {
                                            int i15 = i11 + iArr2[i13];
                                            if (i15 >= strMo2281feyxiexzfUjhhgtg.length()) {
                                                break;
                                            }
                                            int[] iArr3 = iArr2;
                                            if (strMo2281feyxiexzfUjhhgtg.charAt(i15) != ':') {
                                                StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i15, "Expected ':' at index ", ", got '");
                                                sbM4804Ujhhgtgfeyxiexzf.append(strMo2281feyxiexzfUjhhgtg.charAt(i15));
                                                sbM4804Ujhhgtgfeyxiexzf.append('\'');
                                                interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, sbM4804Ujhhgtgfeyxiexzf.toString());
                                            } else {
                                                i13++;
                                                iArr2 = iArr3;
                                            }
                                        }
                                        int[] iArr4 = AbstractC2855feyxiexzfUjhhgtg.f9113Ujhhgtgfeyxiexzf;
                                        int i16 = 0;
                                        while (i16 < 6 && (i3 = iArr4[i16] + i11) < strMo2281feyxiexzfUjhhgtg.length()) {
                                            char cCharAt5 = strMo2281feyxiexzfUjhhgtg.charAt(i3);
                                            int[] iArr5 = iArr4;
                                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                StringBuilder sbM4804Ujhhgtgfeyxiexzf2 = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i3, "Expected an ASCII digit at index ", ", got '");
                                                sbM4804Ujhhgtgfeyxiexzf2.append(strMo2281feyxiexzfUjhhgtg.charAt(i3));
                                                sbM4804Ujhhgtgfeyxiexzf2.append('\'');
                                                interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, sbM4804Ujhhgtgfeyxiexzf2.toString());
                                            } else {
                                                i16++;
                                                iArr4 = iArr5;
                                            }
                                        }
                                        int iM4222Ujhhgtgfeyxiexzf6 = AbstractC2855feyxiexzfUjhhgtg.m4222Ujhhgtgfeyxiexzf(i11 + 1, strMo2281feyxiexzfUjhhgtg);
                                        int iM4222Ujhhgtgfeyxiexzf7 = length > 3 ? AbstractC2855feyxiexzfUjhhgtg.m4222Ujhhgtgfeyxiexzf(i11 + 4, strMo2281feyxiexzfUjhhgtg) : 0;
                                        int iM4222Ujhhgtgfeyxiexzf8 = length > 6 ? AbstractC2855feyxiexzfUjhhgtg.m4222Ujhhgtgfeyxiexzf(i11 + 7, strMo2281feyxiexzfUjhhgtg) : 0;
                                        if (iM4222Ujhhgtgfeyxiexzf7 > 59) {
                                            interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected offset-minute-of-hour in 0..59, got " + iM4222Ujhhgtgfeyxiexzf7);
                                        } else if (iM4222Ujhhgtgfeyxiexzf8 > 59) {
                                            interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected offset-second-of-minute in 0..59, got " + iM4222Ujhhgtgfeyxiexzf8);
                                        } else if (iM4222Ujhhgtgfeyxiexzf6 <= 17 || (iM4222Ujhhgtgfeyxiexzf6 == 18 && iM4222Ujhhgtgfeyxiexzf7 == 0 && iM4222Ujhhgtgfeyxiexzf8 == 0)) {
                                            iM2691Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(iM4222Ujhhgtgfeyxiexzf7, 60, iM4222Ujhhgtgfeyxiexzf6 * 3600, iM4222Ujhhgtgfeyxiexzf8) * (cCharAt4 == '-' ? -1 : 1);
                                            if (1 <= iM4222Ujhhgtgfeyxiexzf || iM4222Ujhhgtgfeyxiexzf >= 13) {
                                                interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected a month number in 1..12, got " + iM4222Ujhhgtgfeyxiexzf);
                                            } else if (1 > iM4222Ujhhgtgfeyxiexzf2) {
                                                interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected a valid day-of-month for month " + iM4222Ujhhgtgfeyxiexzf + " of year " + iCharAt + ", got " + iM4222Ujhhgtgfeyxiexzf2);
                                            } else {
                                                int i17 = iCharAt & 3;
                                                if (iM4222Ujhhgtgfeyxiexzf2 > (iM4222Ujhhgtgfeyxiexzf != 2 ? (iM4222Ujhhgtgfeyxiexzf == 4 || iM4222Ujhhgtgfeyxiexzf == 6 || iM4222Ujhhgtgfeyxiexzf == 9 || iM4222Ujhhgtgfeyxiexzf == 11) ? 30 : 31 : i17 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                    interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected a valid day-of-month for month " + iM4222Ujhhgtgfeyxiexzf + " of year " + iCharAt + ", got " + iM4222Ujhhgtgfeyxiexzf2);
                                                } else if (iM4222Ujhhgtgfeyxiexzf3 > 23) {
                                                    interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected hour in 0..23, got " + iM4222Ujhhgtgfeyxiexzf3);
                                                } else if (iM4222Ujhhgtgfeyxiexzf4 > 59) {
                                                    interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected minute-of-hour in 0..59, got " + iM4222Ujhhgtgfeyxiexzf4);
                                                } else if (iM4222Ujhhgtgfeyxiexzf5 > 59) {
                                                    interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected second-of-minute in 0..59, got " + iM4222Ujhhgtgfeyxiexzf5);
                                                } else {
                                                    long j = iCharAt;
                                                    long j2 = ((long) 365) * j;
                                                    long jM2692Ujhhgtgfeyxiexzf = (j >= 0 ? ((j + ((long) 399)) / ((long) 400)) + (((((long) 3) + j) / ((long) 4)) - ((((long) 99) + j) / ((long) 100))) + j2 : AbstractC1225feyxiexzfUjhhgtg.m2692Ujhhgtgfeyxiexzf(j, -400, (j / ((long) (-4))) - (j / ((long) (-100))), j2)) + ((long) (((iM4222Ujhhgtgfeyxiexzf * 367) - 362) / 12)) + ((long) (iM4222Ujhhgtgfeyxiexzf2 - 1));
                                                    if (iM4222Ujhhgtgfeyxiexzf > 2) {
                                                        jM2692Ujhhgtgfeyxiexzf = (i17 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? jM2692Ujhhgtgfeyxiexzf - 2 : (-1) + jM2692Ujhhgtgfeyxiexzf;
                                                    }
                                                    interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = new C0678Ujhhgtgfeyxiexzf((((jM2692Ujhhgtgfeyxiexzf - ((long) 719528)) * ((long) 86400)) + ((long) AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(iM4222Ujhhgtgfeyxiexzf4, 60, iM4222Ujhhgtgfeyxiexzf3 * 3600, iM4222Ujhhgtgfeyxiexzf5))) - ((long) iM2691Ujhhgtgfeyxiexzf), i2);
                                                }
                                            }
                                        } else {
                                            interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected an offset in -18:00..+18:00, got " + strMo2281feyxiexzfUjhhgtg.subSequence(i11, strMo2281feyxiexzfUjhhgtg.length()).toString());
                                        }
                                    }
                                } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                    int i18 = i11 + 1;
                                    if (strMo2281feyxiexzfUjhhgtg.length() == i18) {
                                        iM2691Ujhhgtgfeyxiexzf = 0;
                                        if (1 <= iM4222Ujhhgtgfeyxiexzf) {
                                            interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected a month number in 1..12, got " + iM4222Ujhhgtgfeyxiexzf);
                                        } else {
                                            interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected a month number in 1..12, got " + iM4222Ujhhgtgfeyxiexzf);
                                        }
                                    } else {
                                        interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Extra text after the instant at position " + i18);
                                    }
                                } else {
                                    interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "Expected the UTC offset at position " + i11 + ", got '" + cCharAt4 + '\'');
                                }
                            }
                        }
                    } else {
                        interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = c0677UjhhgtgfeyxiexzfM4220feyxiexzfUjhhgtg;
                    }
                }
            } else {
                interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4221feyxiexzfUjhhgtg(strMo2281feyxiexzfUjhhgtg, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return interfaceC0674UjhhgtgfeyxiexzfM4221feyxiexzfUjhhgtg.toInstant();
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1107Ujhhgtgfeyxiexzf(InterfaceC3329Ujhhgtgfeyxiexzf interfaceC3329Ujhhgtgfeyxiexzf, Object obj) {
        interfaceC3329Ujhhgtgfeyxiexzf.mo2348Ujhhgtgfeyxiexzf(((C0667Ujhhgtgfeyxiexzf) obj).toString());
    }
}
