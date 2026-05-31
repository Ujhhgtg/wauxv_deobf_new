package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲇᛸᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2491 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0498 f7892;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f7893 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public EnumC2487 f7894 = EnumC2487.INVALID;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f7895;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f7896;

    public C2491(C0498 c0498) {
        this.f7892 = c0498;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m4423(int i) {
        if (i < 0) {
            throw new C2489(AbstractC1095.m2794(i, "Unexpected negative length: "), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[LOOP:0: B:22:0x003c->B:29:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x004c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m4424(EnumC2482 enumC2482) {
        int i;
        int iM1939;
        int iOrdinal = enumC2482.ordinal();
        C0498 c0498 = this.f7892;
        if (iOrdinal == 0) {
            return (int) c0498.m1940(false);
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return m4433();
            }
            throw new C0758();
        }
        int i2 = c0498.f2160;
        int i3 = c0498.f2159;
        if (i2 == i3) {
            throw new C1667("Unexpected EOF");
        }
        byte[] bArr = c0498.f2161;
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 >= 0) {
            c0498.f2160 = i4;
        } else {
            if (i3 - i2 <= 1) {
                i = 0;
                for (int i6 = 0; i6 < 32; i6 += 7) {
                    iM1939 = c0498.m1939();
                    i |= (iM1939 & 127) << i6;
                    if ((iM1939 & 128) == 0) {
                        i5 = i;
                    }
                }
                throw new C1667("Input stream is malformed: Varint too long (exceeded 32 bits)");
            }
            int i7 = i2 + 2;
            int i8 = (bArr[i4] << 7) ^ i5;
            if (i8 >= 0) {
                i = 0;
                while (i6 < 32) {
                    iM1939 = c0498.m1939();
                    i |= (iM1939 & 127) << i6;
                    if ((iM1939 & 128) == 0) {
                        i5 = i;
                    }
                }
                throw new C1667("Input stream is malformed: Varint too long (exceeded 32 bits)");
            }
            c0498.f2160 = i7;
            i5 = (i8 == true ? 1 : 0) ^ (-128);
        }
        return (((((i5 << 31) >> 31) ^ i5) == true ? 1 : 0) >> 1) ^ (Integer.MIN_VALUE & i5);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final long m4425(EnumC2482 enumC2482) {
        int iOrdinal = enumC2482.ordinal();
        C0498 c0498 = this.f7892;
        if (iOrdinal == 0) {
            return c0498.m1940(false);
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return m4435();
            }
            throw new C0758();
        }
        long jM1940 = c0498.m1940(false);
        return (jM1940 & Long.MIN_VALUE) ^ ((((jM1940 << 63) >> 63) ^ jM1940) >> 1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0498 m4426() {
        EnumC2487 enumC2487 = EnumC2487.SIZE_DELIMITED;
        if (this.f7894 == enumC2487) {
            return m4427();
        }
        throw new C2489("Expected wire type " + enumC2487 + ", but found " + this.f7894, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0498 m4427() {
        int iM4424 = m4424(EnumC2482.DEFAULT);
        m4423(iM4424);
        C0498 c0498 = this.f7892;
        c0498.m1938(iM4424);
        byte[] bArr = c0498.f2161;
        int i = c0498.f2160;
        C0498 c0499 = new C0498(i + iM4424, bArr);
        c0499.f2160 = i;
        c0498.f2160 += iM4424;
        return c0499;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final byte[] m4428() {
        EnumC2487 enumC2487 = EnumC2487.SIZE_DELIMITED;
        if (this.f7894 == enumC2487) {
            return m4429();
        }
        throw new C2489("Expected wire type " + enumC2487 + ", but found " + this.f7894, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final byte[] m4429() {
        int iM4424 = m4424(EnumC2482.DEFAULT);
        m4423(iM4424);
        C0498 c0498 = this.f7892;
        c0498.m1938(iM4424);
        byte[] bArr = new byte[iM4424];
        int i = c0498.f2159;
        int i2 = c0498.f2160;
        int i3 = i - i2;
        if (i3 < iM4424) {
            iM4424 = i3;
        }
        AbstractC0280.m1524(c0498.f2161, 0, i2, bArr, i2 + iM4424);
        c0498.f2160 += iM4424;
        return bArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final double m4430() {
        EnumC2487 enumC2487 = EnumC2487.i64;
        if (this.f7894 == enumC2487) {
            return Double.longBitsToDouble(m4435());
        }
        throw new C2489("Expected wire type " + enumC2487 + ", but found " + this.f7894, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final float m4431() {
        EnumC2487 enumC2487 = EnumC2487.i32;
        if (this.f7894 == enumC2487) {
            return Float.intBitsToFloat(m4433());
        }
        throw new C2489("Expected wire type " + enumC2487 + ", but found " + this.f7894, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int m4432(EnumC2482 enumC2482) {
        EnumC2487 enumC2487 = enumC2482 == EnumC2482.FIXED ? EnumC2487.i32 : EnumC2487.VARINT;
        if (this.f7894 == enumC2487) {
            return m4424(enumC2482);
        }
        throw new C2489("Expected wire type " + enumC2487 + ", but found " + this.f7894, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int m4433() {
        int iM1939 = 0;
        for (int i = 0; i < 4; i++) {
            iM1939 |= (this.f7892.m1939() & 255) << (i * 8);
        }
        return iM1939;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final long m4434(EnumC2482 enumC2482) {
        EnumC2487 enumC2487 = enumC2482 == EnumC2482.FIXED ? EnumC2487.i64 : EnumC2487.VARINT;
        if (this.f7894 == enumC2487) {
            return m4425(enumC2482);
        }
        throw new C2489("Expected wire type " + enumC2487 + ", but found " + this.f7894, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final long m4435() {
        long jM1939 = 0;
        for (int i = 0; i < 8; i++) {
            jM1939 |= ((long) (this.f7892.m1939() & 255)) << (i * 8);
        }
        return jM1939;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final String m4436() {
        EnumC2487 enumC2487 = EnumC2487.SIZE_DELIMITED;
        if (this.f7894 != enumC2487) {
            throw new C2489("Expected wire type " + enumC2487 + ", but found " + this.f7894, null);
        }
        int iM4424 = m4424(EnumC2482.DEFAULT);
        m4423(iM4424);
        C0498 c0498 = this.f7892;
        byte[] bArr = c0498.f2161;
        int i = c0498.f2160;
        int i2 = i + iM4424;
        AbstractC1468.m3300(i, i2, bArr.length);
        String str = new String(bArr, i, i2 - i, AbstractC0580.UTF_8);
        c0498.f2160 += iM4424;
        return str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final int m4437() {
        if (!this.f7895) {
            this.f7896 = (this.f7893 << 3) | this.f7894.f7879;
            return m4439((int) this.f7892.m1940(true));
        }
        this.f7895 = false;
        int i = (this.f7893 << 3) | this.f7894.f7879;
        int iM4439 = m4439(this.f7896);
        this.f7896 = i;
        return iM4439;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m4438() {
        int iOrdinal = this.f7894.ordinal();
        EnumC2482 enumC2482 = EnumC2482.DEFAULT;
        if (iOrdinal == 1) {
            m4432(enumC2482);
            return;
        }
        EnumC2482 enumC2483 = EnumC2482.FIXED;
        if (iOrdinal == 2) {
            m4434(enumC2483);
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                m4432(enumC2483);
                return;
            } else {
                throw new C2489("Unsupported start group or end group wire type: " + this.f7894, null);
            }
        }
        EnumC2487 enumC2487 = EnumC2487.SIZE_DELIMITED;
        if (this.f7894 != enumC2487) {
            throw new C2489("Expected wire type " + enumC2487 + ", but found " + this.f7894, null);
        }
        int iM4424 = m4424(enumC2482);
        m4423(iM4424);
        C0498 c0498 = this.f7892;
        c0498.m1938(iM4424);
        c0498.f2160 += iM4424;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final int m4439(int i) {
        if (i == -1) {
            this.f7893 = -1;
            this.f7894 = EnumC2487.INVALID;
            return -1;
        }
        int i2 = i >>> 3;
        this.f7893 = i2;
        EnumC2487[] enumC2487Arr = EnumC2487.f7871;
        this.f7894 = EnumC2487.f7871[i & 7];
        return i2;
    }
}
