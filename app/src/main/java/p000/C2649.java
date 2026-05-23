package p000;

import com.umeng.analytics.pro.ek;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᤝᤞᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2649 extends C0539 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final transient byte[][] f8551;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final transient int[] f8552;

    public C2649(byte[][] bArr, int[] iArr) {
        super(C0539.f2244.f2245);
        this.f8551 = bArr;
        this.f8552 = iArr;
    }

    @Override // p000.C0539
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0539)) {
            return false;
        }
        C0539 c0539 = (C0539) obj;
        return c0539.mo1870() == mo1870() && mo1874(c0539, mo1870());
    }

    @Override // p000.C0539
    public final int hashCode() {
        int i = this.f2246;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f8551;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f8552;
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
        this.f2246 = i3;
        return i3;
    }

    @Override // p000.C0539
    public final String toString() {
        return new C0539(m4651()).toString();
    }

    @Override // p000.C0539
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1868() {
        return new C0539(m4651()).mo1868();
    }

    @Override // p000.C0539
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C0539 mo1869(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f8551;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f8552;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new C0539(messageDigest.digest());
    }

    @Override // p000.C0539
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1870() {
        return this.f8552[this.f8551.length - 1];
    }

    @Override // p000.C0539
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final String mo1871() {
        byte[] bArrM4651 = m4651();
        char[] cArr = new char[bArrM4651.length * 2];
        int i = 0;
        for (byte b : bArrM4651) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC0743.f2837;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & ek.m];
        }
        return new String(cArr);
    }

    @Override // p000.C0539
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final byte[] mo1872() {
        return m4651();
    }

    @Override // p000.C0539
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final byte mo1873(int i) {
        byte[][] bArr = this.f8551;
        int length = bArr.length - 1;
        int[] iArr = this.f8552;
        AbstractC0968.m2469(iArr[length], i, 1L);
        int iM3168 = AbstractC1458.m3168(this, i);
        return bArr[iM3168][(i - (iM3168 == 0 ? 0 : iArr[iM3168 - 1])) + iArr[bArr.length + iM3168]];
    }

    @Override // p000.C0539
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final boolean mo1874(C0539 c0539, int i) {
        if (mo1870() - i >= 0) {
            int iM3168 = AbstractC1458.m3168(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.f8552;
                int i4 = iM3168 == 0 ? 0 : iArr[iM3168 - 1];
                int i5 = iArr[iM3168] - i4;
                byte[][] bArr = this.f8551;
                int i6 = iArr[bArr.length + iM3168];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (c0539.mo1875(bArr[iM3168], i3, (i2 - i4) + i6, iMin)) {
                    i3 += iMin;
                    i2 += iMin;
                    iM3168++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C0539
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo1875(byte[] bArr, int i, int i2, int i3) {
        if (i >= 0 && i <= mo1870() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iM3168 = AbstractC1458.m3168(this, i);
            while (i < i4) {
                int[] iArr = this.f8552;
                int i5 = iM3168 == 0 ? 0 : iArr[iM3168 - 1];
                int i6 = iArr[iM3168] - i5;
                byte[][] bArr2 = this.f8551;
                int i7 = iArr[bArr2.length + iM3168];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iM3168];
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iM3168++;
            }
            return true;
        }
        return false;
    }

    @Override // p000.C0539
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final C0539 mo1876() {
        return new C0539(m4651()).mo1876();
    }

    @Override // p000.C0539
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1878(int i, C0504 c0504) {
        int iM3168 = AbstractC1458.m3168(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f8552;
            int i3 = iM3168 == 0 ? 0 : iArr[iM3168 - 1];
            int i4 = iArr[iM3168] - i3;
            byte[][] bArr = this.f8551;
            int i5 = iArr[bArr.length + iM3168];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            C2646 c2646 = new C2646(bArr[iM3168], i6, i6 + iMin, true, false);
            C2646 c2647 = c0504.f2171;
            if (c2647 == null) {
                c2646.f8545 = c2646;
                c2646.f8544 = c2646;
                c0504.f2171 = c2646;
            } else {
                c2647.f8545.m4646(c2646);
            }
            i2 += iMin;
            iM3168++;
        }
        c0504.f2172 += (long) i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final byte[] m4651() {
        byte[] bArr = new byte[mo1870()];
        byte[][] bArr2 = this.f8551;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f8552;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC0270.m1378(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }
}
