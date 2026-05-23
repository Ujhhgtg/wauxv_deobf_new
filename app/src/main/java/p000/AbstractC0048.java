package p000;

import java.io.EOFException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0048 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final byte[] f978 = "0123456789abcdef".getBytes(AbstractC0599.f2413);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final boolean m906(C2646 c2646, int i, byte[] bArr, int i2) {
        int i3 = c2646.f8541;
        byte[] bArr2 = c2646.f8539;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                c2646 = c2646.f8544;
                bArr2 = c2646.f8539;
                i = c2646.f8540;
                i3 = c2646.f8541;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String m907(C0504 c0504, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c0504.m1772(j2) == 13) {
                String strM1785 = c0504.m1785(j2, AbstractC0599.f2413);
                c0504.skip(2L);
                return strM1785;
            }
        }
        String strM1786 = c0504.m1785(j, AbstractC0599.f2413);
        c0504.skip(1L);
        return strM1786;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[LOOP:0: B:8:0x0019->B:49:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int m908(C0504 c0504, C2302 c2302, boolean z) {
        int i;
        int i2;
        int i3;
        C2646 c2646;
        int i4;
        C2646 c2647 = c0504.f2171;
        if (c2647 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = c2647.f8539;
        int i5 = c2647.f8540;
        int i6 = c2647.f8541;
        int[] iArr = c2302.f7418;
        C2646 c2648 = c2647;
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
            if (c2648 == null) {
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
                            c2648 = c2648.f8544;
                            int i16 = c2648.f8540;
                            byte[] bArr2 = c2648.f8539;
                            i2 = c2648.f8541;
                            if (c2648 == c2647) {
                                i3 = i16;
                                bArr = bArr2;
                                c2648 = null;
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
                        C2646 c2649 = c2648.f8544;
                        i3 = c2649.f8540;
                        byte[] bArr3 = c2649.f8539;
                        i4 = c2649.f8541;
                        if (c2649 != c2647) {
                            c2646 = c2649;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            c2646 = null;
                        }
                    } else {
                        c2646 = c2648;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        c2648 = c2646;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    c2648 = c2646;
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
