package p000;

import com.umeng.analytics.pro.ek;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᲁᤞᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2710 extends C0516 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final transient byte[][] f8716;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final transient int[] f8717;

    public C2710(byte[][] bArr, int[] iArr) {
        super(C0516.f2200.f2201);
        this.f8716 = bArr;
        this.f8717 = iArr;
    }

    private final Object writeReplace() {
        return new C0516(m4685());
    }

    @Override // p000.C0516
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0516)) {
            return false;
        }
        C0516 c0516 = (C0516) obj;
        return c0516.mo1964() == mo1964() && mo1968(c0516, mo1964());
    }

    @Override // p000.C0516
    public final int hashCode() {
        int i = this.f2202;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f8716;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f8717;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f2202 = i3;
        return i3;
    }

    @Override // p000.C0516
    public final String toString() {
        return new C0516(m4685()).toString();
    }

    @Override // p000.C0516
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1962() {
        return new C0516(m4685()).mo1962();
    }

    @Override // p000.C0516
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C0516 mo1963(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f8716;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f8717;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new C0516(messageDigest.digest());
    }

    @Override // p000.C0516
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1964() {
        return this.f8717[this.f8716.length - 1];
    }

    @Override // p000.C0516
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final String mo1965() {
        byte[] bArrM4685 = m4685();
        char[] cArr = new char[bArrM4685.length * 2];
        int i = 0;
        for (byte b : bArrM4685) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC0738.f2831;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & ek.m];
        }
        return new String(cArr);
    }

    @Override // p000.C0516
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final byte[] mo1966() {
        return m4685();
    }

    @Override // p000.C0516
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final byte mo1967(int i) {
        byte[][] bArr = this.f8716;
        int length = bArr.length - 1;
        int[] iArr = this.f8717;
        AbstractC0972.m2590(iArr[length], i, 1L);
        int iM2602 = AbstractC0972.m2602(this, i);
        return bArr[iM2602][(i - (iM2602 == 0 ? 0 : iArr[iM2602 - 1])) + iArr[bArr.length + iM2602]];
    }

    @Override // p000.C0516
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo1968(C0516 c0516, int i) {
        if (mo1964() - i >= 0) {
            int iM2602 = AbstractC0972.m2602(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.f8717;
                int i4 = iM2602 == 0 ? 0 : iArr[iM2602 - 1];
                int i5 = iArr[iM2602] - i4;
                byte[][] bArr = this.f8716;
                int i6 = iArr[bArr.length + iM2602];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (c0516.mo1969(bArr[iM2602], i3, (i2 - i4) + i6, iMin)) {
                    i3 += iMin;
                    i2 += iMin;
                    iM2602++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C0516
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo1969(byte[] bArr, int i, int i2, int i3) {
        if (i >= 0 && i <= mo1964() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iM2602 = AbstractC0972.m2602(this, i);
            while (i < i4) {
                int[] iArr = this.f8717;
                int i5 = iM2602 == 0 ? 0 : iArr[iM2602 - 1];
                int i6 = iArr[iM2602] - i5;
                byte[][] bArr2 = this.f8716;
                int i7 = iArr[bArr2.length + iM2602];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iM2602];
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iM2602++;
            }
            return true;
        }
        return false;
    }

    @Override // p000.C0516
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final C0516 mo1970() {
        return new C0516(m4685()).mo1970();
    }

    @Override // p000.C0516
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1972(int i, C0481 c0481) {
        int iM2602 = AbstractC0972.m2602(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f8717;
            int i3 = iM2602 == 0 ? 0 : iArr[iM2602 - 1];
            int i4 = iArr[iM2602] - i3;
            byte[][] bArr = this.f8716;
            int i5 = iArr[bArr.length + iM2602];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            C2707 c2707 = new C2707(bArr[iM2602], i6, i6 + iMin, true, false);
            C2707 c2708 = c0481.f2127;
            if (c2708 == null) {
                c2707.f8710 = c2707;
                c2707.f8709 = c2707;
                c0481.f2127 = c2707;
            } else {
                c2708.f8710.m4680(c2707);
            }
            i2 += iMin;
            iM2602++;
        }
        c0481.f2128 += (long) i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final byte[] m4685() {
        byte[] bArr = new byte[mo1964()];
        byte[][] bArr2 = this.f8716;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f8717;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC0280.m1524(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }
}
