package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᲁᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2439 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0521 f7748;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f7749 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public EnumC2434 f7750 = EnumC2434.INVALID;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f7751;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f7752;

    public C2439(C0521 c0521) {
        this.f7748 = c0521;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m4402(int i) {
        if (i < 0) {
            throw new C2437(AbstractC1194.m2779(i, "Unexpected negative length: "), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[LOOP:0: B:22:0x003c->B:29:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x004c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m4403(EnumC2429 enumC2429) {
        int i;
        int iM1845;
        int iOrdinal = enumC2429.ordinal();
        C0521 c0521 = this.f7748;
        if (iOrdinal == 0) {
            return (int) c0521.m1846(false);
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return m4412();
            }
            throw new C0761();
        }
        int i2 = c0521.f2204;
        int i3 = c0521.f2203;
        if (i2 == i3) {
            throw new C1653("Unexpected EOF");
        }
        byte[] bArr = c0521.f2205;
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 >= 0) {
            c0521.f2204 = i4;
        } else {
            if (i3 - i2 <= 1) {
                i = 0;
                for (int i6 = 0; i6 < 32; i6 += 7) {
                    iM1845 = c0521.m1845();
                    i |= (iM1845 & 127) << i6;
                    if ((iM1845 & 128) == 0) {
                        i5 = i;
                    }
                }
                throw new C1653("Input stream is malformed: Varint too long (exceeded 32 bits)");
            }
            int i7 = i2 + 2;
            int i8 = (bArr[i4] << 7) ^ i5;
            if (i8 >= 0) {
                i = 0;
                while (i6 < 32) {
                    iM1845 = c0521.m1845();
                    i |= (iM1845 & 127) << i6;
                    if ((iM1845 & 128) == 0) {
                        i5 = i;
                    }
                }
                throw new C1653("Input stream is malformed: Varint too long (exceeded 32 bits)");
            }
            c0521.f2204 = i7;
            i5 = -128;
        }
        return (0) ^ (-2147483648 & i5);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final long m4404(EnumC2429 enumC2429) {
        int iOrdinal = enumC2429.ordinal();
        C0521 c0521 = this.f7748;
        if (iOrdinal == 0) {
            return c0521.m1846(false);
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return m4414();
            }
            throw new C0761();
        }
        long jM1846 = c0521.m1846(false);
        return (jM1846 & -9223372036854775808L) ^ ((((jM1846 << 63) >> 63) ^ jM1846) >> 1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0521 m4405() {
        EnumC2434 enumC2434 = EnumC2434.SIZE_DELIMITED;
        if (this.f7750 == enumC2434) {
            return m4406();
        }
        throw new C2437("Expected wire type " + enumC2434 + ", but found " + this.f7750, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0521 m4406() {
        int iM4403 = m4403(EnumC2429.DEFAULT);
        m4402(iM4403);
        C0521 c0521 = this.f7748;
        c0521.m1844(iM4403);
        byte[] bArr = c0521.f2205;
        int i = c0521.f2204;
        C0521 c0522 = new C0521(i + iM4403, bArr);
        c0522.f2204 = i;
        c0521.f2204 += iM4403;
        return c0522;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final byte[] m4407() {
        EnumC2434 enumC2434 = EnumC2434.SIZE_DELIMITED;
        if (this.f7750 == enumC2434) {
            return m4408();
        }
        throw new C2437("Expected wire type " + enumC2434 + ", but found " + this.f7750, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final byte[] m4408() {
        int iM4403 = m4403(EnumC2429.DEFAULT);
        m4402(iM4403);
        C0521 c0521 = this.f7748;
        c0521.m1844(iM4403);
        byte[] bArr = new byte[iM4403];
        int i = c0521.f2203;
        int i2 = c0521.f2204;
        int i3 = i - i2;
        if (i3 < iM4403) {
            iM4403 = i3;
        }
        AbstractC0270.m1378(c0521.f2205, 0, i2, bArr, i2 + iM4403);
        c0521.f2204 += iM4403;
        return bArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final double m4409() {
        EnumC2434 enumC2434 = EnumC2434.i64;
        if (this.f7750 == enumC2434) {
            return Double.longBitsToDouble(m4414());
        }
        throw new C2437("Expected wire type " + enumC2434 + ", but found " + this.f7750, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final float m4410() {
        EnumC2434 enumC2434 = EnumC2434.i32;
        if (this.f7750 == enumC2434) {
            return Float.intBitsToFloat(m4412());
        }
        throw new C2437("Expected wire type " + enumC2434 + ", but found " + this.f7750, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int m4411(EnumC2429 enumC2429) {
        EnumC2434 enumC2434 = enumC2429 == EnumC2429.FIXED ? EnumC2434.i32 : EnumC2434.VARINT;
        if (this.f7750 == enumC2434) {
            return m4403(enumC2429);
        }
        throw new C2437("Expected wire type " + enumC2434 + ", but found " + this.f7750, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int m4412() {
        int iM1845 = 0;
        for (int i = 0; i < 4; i++) {
            iM1845 |= (this.f7748.m1845() & 255) << (i * 8);
        }
        return iM1845;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final long m4413(EnumC2429 enumC2429) {
        EnumC2434 enumC2434 = enumC2429 == EnumC2429.FIXED ? EnumC2434.i64 : EnumC2434.VARINT;
        if (this.f7750 == enumC2434) {
            return m4404(enumC2429);
        }
        throw new C2437("Expected wire type " + enumC2434 + ", but found " + this.f7750, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final long m4414() {
        long jM1845 = 0;
        for (int i = 0; i < 8; i++) {
            jM1845 |= ((long) (this.f7748.m1845() & 255)) << (i * 8);
        }
        return jM1845;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final String m4415() {
        EnumC2434 enumC2434 = EnumC2434.SIZE_DELIMITED;
        if (this.f7750 != enumC2434) {
            throw new C2437("Expected wire type " + enumC2434 + ", but found " + this.f7750, null);
        }
        int iM4403 = m4403(EnumC2429.DEFAULT);
        m4402(iM4403);
        C0521 c0521 = this.f7748;
        byte[] bArr = c0521.f2205;
        int i = c0521.f2204;
        int i2 = i + iM4403;
        AbstractC2665.m4660(i, i2, bArr.length);
        String str = new String(bArr, i, i2 - i, AbstractC0599.f2413);
        c0521.f2204 += iM4403;
        return str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final int m4416() {
        if (!this.f7751) {
            this.f7752 = (this.f7749 << 3) | this.f7750.f7735;
            return m4418((int) this.f7748.m1846(true));
        }
        this.f7751 = false;
        int i = (this.f7749 << 3) | this.f7750.f7735;
        int iM4418 = m4418(this.f7752);
        this.f7752 = i;
        return iM4418;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m4417() {
        int iOrdinal = this.f7750.ordinal();
        EnumC2429 enumC2429 = EnumC2429.DEFAULT;
        if (iOrdinal == 1) {
            m4411(EnumC2429.DEFAULT);
            return;
        }
        EnumC2429 enumC24210 = EnumC2429.FIXED;
        if (iOrdinal == 2) {
            m4413(EnumC2429.FIXED);
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                m4411(EnumC2429.FIXED);
                return;
            } else {
                throw new C2437("Unsupported start group or end group wire type: " + this.f7750, null);
            }
        }
        EnumC2434 enumC2434 = EnumC2434.SIZE_DELIMITED;
        if (this.f7750 != enumC2434) {
            throw new C2437("Expected wire type " + enumC2434 + ", but found " + this.f7750, null);
        }
        int iM4403 = m4403(EnumC2429.DEFAULT);
        m4402(iM4403);
        C0521 c0521 = this.f7748;
        c0521.m1844(iM4403);
        c0521.f2204 += iM4403;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final int m4418(int i) {
        if (i == -1) {
            this.f7749 = -1;
            this.f7750 = EnumC2434.INVALID;
            return -1;
        }
        int i2 = i >>> 3;
        this.f7749 = i2;
        EnumC2434[] enumC2434Arr = EnumC2434.f7727;
        this.f7750 = EnumC2434.f7727[i & 7];
        return i2;
    }
}
