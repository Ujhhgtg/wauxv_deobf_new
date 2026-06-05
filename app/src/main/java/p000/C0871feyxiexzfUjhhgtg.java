package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛴᛲ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0871feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2615feyxiexzfUjhhgtg f3384Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f3385Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public EnumC0867feyxiexzfUjhhgtg f3386Ujhhgtgfeyxiexzf = EnumC0867feyxiexzfUjhhgtg.INVALID;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f3387Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f3388Ujhhgtgfeyxiexzf;

    public C0871feyxiexzfUjhhgtg(C2615feyxiexzfUjhhgtg c2615feyxiexzfUjhhgtg) {
        this.f3384Ujhhgtgfeyxiexzf = c2615feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m2304Ujhhgtgfeyxiexzf(int i) {
        if (i < 0) {
            throw new C0874feyxiexzfUjhhgtg(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "Unexpected negative length: "), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[LOOP:0: B:22:0x003c->B:29:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x004c A[SYNTHETIC] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m2305Ujhhgtgfeyxiexzf(EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtg) {
        int i;
        int iM3920Ujhhgtgfeyxiexzf;
        int iOrdinal = enumC0860feyxiexzfUjhhgtg.ordinal();
        C2615feyxiexzfUjhhgtg c2615feyxiexzfUjhhgtg = this.f3384Ujhhgtgfeyxiexzf;
        if (iOrdinal == 0) {
            return (int) c2615feyxiexzfUjhhgtg.m3921Ujhhgtgfeyxiexzf(false);
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return m2314Ujhhgtgfeyxiexzf();
            }
            throw new C2870Ujhhgtgfeyxiexzf();
        }
        int i2 = c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf;
        int i3 = c2615feyxiexzfUjhhgtg.f8432Ujhhgtgfeyxiexzf;
        if (i2 == i3) {
            throw new C0670Ujhhgtgfeyxiexzf("Unexpected EOF");
        }
        byte[] bArr = c2615feyxiexzfUjhhgtg.f8434Ujhhgtgfeyxiexzf;
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 >= 0) {
            c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf = i4;
        } else {
            if (i3 - i2 <= 1) {
                i = 0;
                for (int i6 = 0; i6 < 32; i6 += 7) {
                    iM3920Ujhhgtgfeyxiexzf = c2615feyxiexzfUjhhgtg.m3920Ujhhgtgfeyxiexzf();
                    i |= (iM3920Ujhhgtgfeyxiexzf & 127) << i6;
                    if ((iM3920Ujhhgtgfeyxiexzf & 128) == 0) {
                        i5 = i;
                    }
                }
                throw new C0670Ujhhgtgfeyxiexzf("Input stream is malformed: Varint too long (exceeded 32 bits)");
            }
            int i7 = i2 + 2;
            int i8 = (bArr[i4] << 7) ^ i5;
            if (i8 >= 0) {
                i = 0;
                while (i6 < 32) {
                    iM3920Ujhhgtgfeyxiexzf = c2615feyxiexzfUjhhgtg.m3920Ujhhgtgfeyxiexzf();
                    i |= (iM3920Ujhhgtgfeyxiexzf & 127) << i6;
                    if ((iM3920Ujhhgtgfeyxiexzf & 128) == 0) {
                        i5 = i;
                    }
                }
                throw new C0670Ujhhgtgfeyxiexzf("Input stream is malformed: Varint too long (exceeded 32 bits)");
            }
            c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf = i7;
            i5 = (i8 == true ? 1 : 0) ^ (-128);
        }
        return (((((i5 << 31) >> 31) ^ i5) == true ? 1 : 0) >> 1) ^ (Integer.MIN_VALUE & i5);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final long m2306Ujhhgtgfeyxiexzf(EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtg) {
        int iOrdinal = enumC0860feyxiexzfUjhhgtg.ordinal();
        C2615feyxiexzfUjhhgtg c2615feyxiexzfUjhhgtg = this.f3384Ujhhgtgfeyxiexzf;
        if (iOrdinal == 0) {
            return c2615feyxiexzfUjhhgtg.m3921Ujhhgtgfeyxiexzf(false);
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return m2316Ujhhgtgfeyxiexzf();
            }
            throw new C2870Ujhhgtgfeyxiexzf();
        }
        long jM3921Ujhhgtgfeyxiexzf = c2615feyxiexzfUjhhgtg.m3921Ujhhgtgfeyxiexzf(false);
        return (jM3921Ujhhgtgfeyxiexzf & Long.MIN_VALUE) ^ ((((jM3921Ujhhgtgfeyxiexzf << 63) >> 63) ^ jM3921Ujhhgtgfeyxiexzf) >> 1);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2615feyxiexzfUjhhgtg m2307Ujhhgtgfeyxiexzf() {
        EnumC0867feyxiexzfUjhhgtg enumC0867feyxiexzfUjhhgtg = EnumC0867feyxiexzfUjhhgtg.SIZE_DELIMITED;
        if (this.f3386Ujhhgtgfeyxiexzf == enumC0867feyxiexzfUjhhgtg) {
            return m2308Ujhhgtgfeyxiexzf();
        }
        throw new C0874feyxiexzfUjhhgtg("Expected wire type " + enumC0867feyxiexzfUjhhgtg + ", but found " + this.f3386Ujhhgtgfeyxiexzf, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2615feyxiexzfUjhhgtg m2308Ujhhgtgfeyxiexzf() {
        int iM2305Ujhhgtgfeyxiexzf = m2305Ujhhgtgfeyxiexzf(EnumC0860feyxiexzfUjhhgtg.DEFAULT);
        m2304Ujhhgtgfeyxiexzf(iM2305Ujhhgtgfeyxiexzf);
        C2615feyxiexzfUjhhgtg c2615feyxiexzfUjhhgtg = this.f3384Ujhhgtgfeyxiexzf;
        c2615feyxiexzfUjhhgtg.m3919Ujhhgtgfeyxiexzf(iM2305Ujhhgtgfeyxiexzf);
        byte[] bArr = c2615feyxiexzfUjhhgtg.f8434Ujhhgtgfeyxiexzf;
        int i = c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf;
        C2615feyxiexzfUjhhgtg c2615feyxiexzfUjhhgtg2 = new C2615feyxiexzfUjhhgtg(i + iM2305Ujhhgtgfeyxiexzf, bArr);
        c2615feyxiexzfUjhhgtg2.f8433Ujhhgtgfeyxiexzf = i;
        c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf += iM2305Ujhhgtgfeyxiexzf;
        return c2615feyxiexzfUjhhgtg2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final byte[] m2309Ujhhgtgfeyxiexzf() {
        EnumC0867feyxiexzfUjhhgtg enumC0867feyxiexzfUjhhgtg = EnumC0867feyxiexzfUjhhgtg.SIZE_DELIMITED;
        if (this.f3386Ujhhgtgfeyxiexzf == enumC0867feyxiexzfUjhhgtg) {
            return m2310Ujhhgtgfeyxiexzf();
        }
        throw new C0874feyxiexzfUjhhgtg("Expected wire type " + enumC0867feyxiexzfUjhhgtg + ", but found " + this.f3386Ujhhgtgfeyxiexzf, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final byte[] m2310Ujhhgtgfeyxiexzf() {
        int iM2305Ujhhgtgfeyxiexzf = m2305Ujhhgtgfeyxiexzf(EnumC0860feyxiexzfUjhhgtg.DEFAULT);
        m2304Ujhhgtgfeyxiexzf(iM2305Ujhhgtgfeyxiexzf);
        C2615feyxiexzfUjhhgtg c2615feyxiexzfUjhhgtg = this.f3384Ujhhgtgfeyxiexzf;
        c2615feyxiexzfUjhhgtg.m3919Ujhhgtgfeyxiexzf(iM2305Ujhhgtgfeyxiexzf);
        byte[] bArr = new byte[iM2305Ujhhgtgfeyxiexzf];
        int i = c2615feyxiexzfUjhhgtg.f8432Ujhhgtgfeyxiexzf;
        int i2 = c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf;
        int i3 = i - i2;
        if (i3 < iM2305Ujhhgtgfeyxiexzf) {
            iM2305Ujhhgtgfeyxiexzf = i3;
        }
        AbstractC2391Ujhhgtgfeyxiexzf.m3642Ujhhgtgfeyxiexzf(c2615feyxiexzfUjhhgtg.f8434Ujhhgtgfeyxiexzf, 0, i2, bArr, i2 + iM2305Ujhhgtgfeyxiexzf);
        c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf += iM2305Ujhhgtgfeyxiexzf;
        return bArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final double m2311Ujhhgtgfeyxiexzf() {
        EnumC0867feyxiexzfUjhhgtg enumC0867feyxiexzfUjhhgtg = EnumC0867feyxiexzfUjhhgtg.i64;
        if (this.f3386Ujhhgtgfeyxiexzf == enumC0867feyxiexzfUjhhgtg) {
            return Double.longBitsToDouble(m2316Ujhhgtgfeyxiexzf());
        }
        throw new C0874feyxiexzfUjhhgtg("Expected wire type " + enumC0867feyxiexzfUjhhgtg + ", but found " + this.f3386Ujhhgtgfeyxiexzf, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final float m2312Ujhhgtgfeyxiexzf() {
        EnumC0867feyxiexzfUjhhgtg enumC0867feyxiexzfUjhhgtg = EnumC0867feyxiexzfUjhhgtg.i32;
        if (this.f3386Ujhhgtgfeyxiexzf == enumC0867feyxiexzfUjhhgtg) {
            return Float.intBitsToFloat(m2314Ujhhgtgfeyxiexzf());
        }
        throw new C0874feyxiexzfUjhhgtg("Expected wire type " + enumC0867feyxiexzfUjhhgtg + ", but found " + this.f3386Ujhhgtgfeyxiexzf, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m2313Ujhhgtgfeyxiexzf(EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtg) {
        EnumC0867feyxiexzfUjhhgtg enumC0867feyxiexzfUjhhgtg = enumC0860feyxiexzfUjhhgtg == EnumC0860feyxiexzfUjhhgtg.FIXED ? EnumC0867feyxiexzfUjhhgtg.i32 : EnumC0867feyxiexzfUjhhgtg.VARINT;
        if (this.f3386Ujhhgtgfeyxiexzf == enumC0867feyxiexzfUjhhgtg) {
            return m2305Ujhhgtgfeyxiexzf(enumC0860feyxiexzfUjhhgtg);
        }
        throw new C0874feyxiexzfUjhhgtg("Expected wire type " + enumC0867feyxiexzfUjhhgtg + ", but found " + this.f3386Ujhhgtgfeyxiexzf, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int m2314Ujhhgtgfeyxiexzf() {
        int iM3920Ujhhgtgfeyxiexzf = 0;
        for (int i = 0; i < 4; i++) {
            iM3920Ujhhgtgfeyxiexzf |= (this.f3384Ujhhgtgfeyxiexzf.m3920Ujhhgtgfeyxiexzf() & 255) << (i * 8);
        }
        return iM3920Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final long m2315Ujhhgtgfeyxiexzf(EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtg) {
        EnumC0867feyxiexzfUjhhgtg enumC0867feyxiexzfUjhhgtg = enumC0860feyxiexzfUjhhgtg == EnumC0860feyxiexzfUjhhgtg.FIXED ? EnumC0867feyxiexzfUjhhgtg.i64 : EnumC0867feyxiexzfUjhhgtg.VARINT;
        if (this.f3386Ujhhgtgfeyxiexzf == enumC0867feyxiexzfUjhhgtg) {
            return m2306Ujhhgtgfeyxiexzf(enumC0860feyxiexzfUjhhgtg);
        }
        throw new C0874feyxiexzfUjhhgtg("Expected wire type " + enumC0867feyxiexzfUjhhgtg + ", but found " + this.f3386Ujhhgtgfeyxiexzf, null);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final long m2316Ujhhgtgfeyxiexzf() {
        long jM3920Ujhhgtgfeyxiexzf = 0;
        for (int i = 0; i < 8; i++) {
            jM3920Ujhhgtgfeyxiexzf |= ((long) (this.f3384Ujhhgtgfeyxiexzf.m3920Ujhhgtgfeyxiexzf() & 255)) << (i * 8);
        }
        return jM3920Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final String m2317Ujhhgtgfeyxiexzf() {
        EnumC0867feyxiexzfUjhhgtg enumC0867feyxiexzfUjhhgtg = EnumC0867feyxiexzfUjhhgtg.SIZE_DELIMITED;
        if (this.f3386Ujhhgtgfeyxiexzf != enumC0867feyxiexzfUjhhgtg) {
            throw new C0874feyxiexzfUjhhgtg("Expected wire type " + enumC0867feyxiexzfUjhhgtg + ", but found " + this.f3386Ujhhgtgfeyxiexzf, null);
        }
        int iM2305Ujhhgtgfeyxiexzf = m2305Ujhhgtgfeyxiexzf(EnumC0860feyxiexzfUjhhgtg.DEFAULT);
        m2304Ujhhgtgfeyxiexzf(iM2305Ujhhgtgfeyxiexzf);
        C2615feyxiexzfUjhhgtg c2615feyxiexzfUjhhgtg = this.f3384Ujhhgtgfeyxiexzf;
        byte[] bArr = c2615feyxiexzfUjhhgtg.f8434Ujhhgtgfeyxiexzf;
        int i = c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf;
        int i2 = i + iM2305Ujhhgtgfeyxiexzf;
        AbstractC3516feyxiexzfUjhhgtg.m5052Ujhhgtgfeyxiexzf(i, i2, bArr.length);
        String str = new String(bArr, i, i2 - i, AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
        c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf += iM2305Ujhhgtgfeyxiexzf;
        return str;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int m2318Ujhhgtgfeyxiexzf() {
        if (!this.f3387Ujhhgtgfeyxiexzf) {
            this.f3388Ujhhgtgfeyxiexzf = (this.f3385Ujhhgtgfeyxiexzf << 3) | this.f3386Ujhhgtgfeyxiexzf.f3378Ujhhgtgfeyxiexzf;
            return m2320Ujhhgtgfeyxiexzf((int) this.f3384Ujhhgtgfeyxiexzf.m3921Ujhhgtgfeyxiexzf(true));
        }
        this.f3387Ujhhgtgfeyxiexzf = false;
        int i = (this.f3385Ujhhgtgfeyxiexzf << 3) | this.f3386Ujhhgtgfeyxiexzf.f3378Ujhhgtgfeyxiexzf;
        int iM2320Ujhhgtgfeyxiexzf = m2320Ujhhgtgfeyxiexzf(this.f3388Ujhhgtgfeyxiexzf);
        this.f3388Ujhhgtgfeyxiexzf = i;
        return iM2320Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2319Ujhhgtgfeyxiexzf() {
        int iOrdinal = this.f3386Ujhhgtgfeyxiexzf.ordinal();
        EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtg = EnumC0860feyxiexzfUjhhgtg.DEFAULT;
        if (iOrdinal == 1) {
            m2313Ujhhgtgfeyxiexzf(enumC0860feyxiexzfUjhhgtg);
            return;
        }
        EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtg2 = EnumC0860feyxiexzfUjhhgtg.FIXED;
        if (iOrdinal == 2) {
            m2315Ujhhgtgfeyxiexzf(enumC0860feyxiexzfUjhhgtg2);
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                m2313Ujhhgtgfeyxiexzf(enumC0860feyxiexzfUjhhgtg2);
                return;
            } else {
                throw new C0874feyxiexzfUjhhgtg("Unsupported start group or end group wire type: " + this.f3386Ujhhgtgfeyxiexzf, null);
            }
        }
        EnumC0867feyxiexzfUjhhgtg enumC0867feyxiexzfUjhhgtg = EnumC0867feyxiexzfUjhhgtg.SIZE_DELIMITED;
        if (this.f3386Ujhhgtgfeyxiexzf != enumC0867feyxiexzfUjhhgtg) {
            throw new C0874feyxiexzfUjhhgtg("Expected wire type " + enumC0867feyxiexzfUjhhgtg + ", but found " + this.f3386Ujhhgtgfeyxiexzf, null);
        }
        int iM2305Ujhhgtgfeyxiexzf = m2305Ujhhgtgfeyxiexzf(enumC0860feyxiexzfUjhhgtg);
        m2304Ujhhgtgfeyxiexzf(iM2305Ujhhgtgfeyxiexzf);
        C2615feyxiexzfUjhhgtg c2615feyxiexzfUjhhgtg = this.f3384Ujhhgtgfeyxiexzf;
        c2615feyxiexzfUjhhgtg.m3919Ujhhgtgfeyxiexzf(iM2305Ujhhgtgfeyxiexzf);
        c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf += iM2305Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int m2320Ujhhgtgfeyxiexzf(int i) {
        if (i == -1) {
            this.f3385Ujhhgtgfeyxiexzf = -1;
            this.f3386Ujhhgtgfeyxiexzf = EnumC0867feyxiexzfUjhhgtg.INVALID;
            return -1;
        }
        int i2 = i >>> 3;
        this.f3385Ujhhgtgfeyxiexzf = i2;
        EnumC0867feyxiexzfUjhhgtg[] enumC0867feyxiexzfUjhhgtgArr = EnumC0867feyxiexzfUjhhgtg.f3370Ujhhgtgfeyxiexzf;
        this.f3386Ujhhgtgfeyxiexzf = EnumC0867feyxiexzfUjhhgtg.f3370Ujhhgtgfeyxiexzf[i & 7];
        return i2;
    }
}
