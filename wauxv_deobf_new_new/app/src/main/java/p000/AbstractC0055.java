package p000;

import java.io.EOFException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0055 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final byte[] f1043 = "0123456789abcdef".getBytes(AbstractC0580.UTF_8);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final boolean m1050(C2707 c2707, int i, byte[] bArr, int i2) {
        int i3 = c2707.f8706;
        byte[] bArr2 = c2707.f8704;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                c2707 = c2707.f8709;
                bArr2 = c2707.f8704;
                i = c2707.f8705;
                i3 = c2707.f8706;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String m1051(C0481 c0481, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c0481.m1866(j2) == 13) {
                String strM1879 = c0481.m1879(j2, AbstractC0580.UTF_8);
                c0481.skip(2L);
                return strM1879;
            }
        }
        String strM18710 = c0481.m1879(j, AbstractC0580.UTF_8);
        c0481.skip(1L);
        return strM18710;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[LOOP:0: B:8:0x0019->B:49:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int m1052(C0481 c0481, C2335 c2335, boolean z) {
        int i;
        int i2;
        int i3;
        C2707 c2707;
        int i4;
        C2707 c2708 = c0481.f2127;
        if (c2708 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = c2708.f8704;
        int i5 = c2708.f8705;
        int i6 = c2708.f8706;
        int[] iArr = c2335.f7540;
        C2707 c2709 = c2708;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (c2709 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            c2709 = c2709.f8709;
                            int i16 = c2709.f8705;
                            byte[] bArr2 = c2709.f8704;
                            i2 = c2709.f8706;
                            if (c2709 == c2708) {
                                i3 = i16;
                                bArr = bArr2;
                                c2709 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        C2707 c27010 = c2709.f8709;
                        i3 = c27010.f8705;
                        byte[] bArr3 = c27010.f8704;
                        i4 = c27010.f8706;
                        if (c27010 != c2708) {
                            c2707 = c27010;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            c2707 = null;
                        }
                    } else {
                        c2707 = c2709;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        c2709 = c2707;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    c2709 = c2707;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
