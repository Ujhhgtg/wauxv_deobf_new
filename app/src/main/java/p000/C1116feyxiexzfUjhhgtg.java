package p000;

import com.umeng.analytics.pro.ek;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ要点脸能不能ᛱUjhhgtgᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1116feyxiexzfUjhhgtg extends C2633Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final transient byte[][] f4218Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final transient int[] f4219Ujhhgtgfeyxiexzf;

    public C1116feyxiexzfUjhhgtg(byte[][] bArr, int[] iArr) {
        super(C2633Ujhhgtgfeyxiexzf.f8466Ujhhgtgfeyxiexzf.f8467Ujhhgtgfeyxiexzf);
        this.f4218Ujhhgtgfeyxiexzf = bArr;
        this.f4219Ujhhgtgfeyxiexzf = iArr;
    }

    private final Object writeReplace() {
        return new C2633Ujhhgtgfeyxiexzf(m2586Ujhhgtgfeyxiexzf());
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2633Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf = (C2633Ujhhgtgfeyxiexzf) obj;
        return c2633Ujhhgtgfeyxiexzf.mo2578Ujhhgtgfeyxiexzf() == mo2578Ujhhgtgfeyxiexzf() && mo2582Ujhhgtgfeyxiexzf(c2633Ujhhgtgfeyxiexzf, mo2578Ujhhgtgfeyxiexzf());
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    public final int hashCode() {
        int i = this.f8468Ujhhgtgfeyxiexzf;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f4218Ujhhgtgfeyxiexzf;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f4219Ujhhgtgfeyxiexzf;
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
        this.f8468Ujhhgtgfeyxiexzf = i3;
        return i3;
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    public final String toString() {
        return new C2633Ujhhgtgfeyxiexzf(m2586Ujhhgtgfeyxiexzf()).toString();
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String mo2576Ujhhgtgfeyxiexzf() {
        return new C2633Ujhhgtgfeyxiexzf(m2586Ujhhgtgfeyxiexzf()).mo2576Ujhhgtgfeyxiexzf();
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2633Ujhhgtgfeyxiexzf mo2577Ujhhgtgfeyxiexzf(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f4218Ujhhgtgfeyxiexzf;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f4219Ujhhgtgfeyxiexzf;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new C2633Ujhhgtgfeyxiexzf(messageDigest.digest());
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int mo2578Ujhhgtgfeyxiexzf() {
        return this.f4219Ujhhgtgfeyxiexzf[this.f4218Ujhhgtgfeyxiexzf.length - 1];
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String mo2579Ujhhgtgfeyxiexzf() {
        byte[] bArrM2586Ujhhgtgfeyxiexzf = m2586Ujhhgtgfeyxiexzf();
        char[] cArr = new char[bArrM2586Ujhhgtgfeyxiexzf.length * 2];
        int i = 0;
        for (byte b : bArrM2586Ujhhgtgfeyxiexzf) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC2855feyxiexzfUjhhgtg.f9109Ujhhgtgfeyxiexzf;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & ek.m];
        }
        return new String(cArr);
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final byte[] mo2580Ujhhgtgfeyxiexzf() {
        return m2586Ujhhgtgfeyxiexzf();
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final byte mo2581Ujhhgtgfeyxiexzf(int i) {
        byte[][] bArr = this.f4218Ujhhgtgfeyxiexzf;
        int length = bArr.length - 1;
        int[] iArr = this.f4219Ujhhgtgfeyxiexzf;
        AbstractC3085Ujhhgtgfeyxiexzf.m4552Ujhhgtgfeyxiexzf(iArr[length], i, 1L);
        int iM4530Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4530Ujhhgtgfeyxiexzf(this, i);
        return bArr[iM4530Ujhhgtgfeyxiexzf][(i - (iM4530Ujhhgtgfeyxiexzf == 0 ? 0 : iArr[iM4530Ujhhgtgfeyxiexzf - 1])) + iArr[bArr.length + iM4530Ujhhgtgfeyxiexzf]];
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final boolean mo2582Ujhhgtgfeyxiexzf(C2633Ujhhgtgfeyxiexzf c2633Ujhhgtgfeyxiexzf, int i) {
        if (mo2578Ujhhgtgfeyxiexzf() - i >= 0) {
            int iM4530Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4530Ujhhgtgfeyxiexzf(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.f4219Ujhhgtgfeyxiexzf;
                int i4 = iM4530Ujhhgtgfeyxiexzf == 0 ? 0 : iArr[iM4530Ujhhgtgfeyxiexzf - 1];
                int i5 = iArr[iM4530Ujhhgtgfeyxiexzf] - i4;
                byte[][] bArr = this.f4218Ujhhgtgfeyxiexzf;
                int i6 = iArr[bArr.length + iM4530Ujhhgtgfeyxiexzf];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (c2633Ujhhgtgfeyxiexzf.mo2583Ujhhgtgfeyxiexzf(bArr[iM4530Ujhhgtgfeyxiexzf], i3, (i2 - i4) + i6, iMin)) {
                    i3 += iMin;
                    i2 += iMin;
                    iM4530Ujhhgtgfeyxiexzf++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean mo2583Ujhhgtgfeyxiexzf(byte[] bArr, int i, int i2, int i3) {
        if (i >= 0 && i <= mo2578Ujhhgtgfeyxiexzf() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iM4530Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4530Ujhhgtgfeyxiexzf(this, i);
            while (i < i4) {
                int[] iArr = this.f4219Ujhhgtgfeyxiexzf;
                int i5 = iM4530Ujhhgtgfeyxiexzf == 0 ? 0 : iArr[iM4530Ujhhgtgfeyxiexzf - 1];
                int i6 = iArr[iM4530Ujhhgtgfeyxiexzf] - i5;
                byte[][] bArr2 = this.f4218Ujhhgtgfeyxiexzf;
                int i7 = iArr[bArr2.length + iM4530Ujhhgtgfeyxiexzf];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iM4530Ujhhgtgfeyxiexzf];
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iM4530Ujhhgtgfeyxiexzf++;
            }
            return true;
        }
        return false;
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C2633Ujhhgtgfeyxiexzf mo2584Ujhhgtgfeyxiexzf() {
        return new C2633Ujhhgtgfeyxiexzf(m2586Ujhhgtgfeyxiexzf()).mo2584Ujhhgtgfeyxiexzf();
    }

    @Override // p000.C2633Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void mo2585Ujhhgtgfeyxiexzf(int i, C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg) {
        int iM4530Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4530Ujhhgtgfeyxiexzf(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f4219Ujhhgtgfeyxiexzf;
            int i3 = iM4530Ujhhgtgfeyxiexzf == 0 ? 0 : iArr[iM4530Ujhhgtgfeyxiexzf - 1];
            int i4 = iArr[iM4530Ujhhgtgfeyxiexzf] - i3;
            byte[][] bArr = this.f4218Ujhhgtgfeyxiexzf;
            int i5 = iArr[bArr.length + iM4530Ujhhgtgfeyxiexzf];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = new C1086feyxiexzfUjhhgtg(bArr[iM4530Ujhhgtgfeyxiexzf], i6, i6 + iMin, true, false);
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2 = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf;
            if (c1086feyxiexzfUjhhgtg2 == null) {
                c1086feyxiexzfUjhhgtg.f4165Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg;
                c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg;
                c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg;
            } else {
                c1086feyxiexzfUjhhgtg2.f4165Ujhhgtgfeyxiexzf.m2556Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
            }
            i2 += iMin;
            iM4530Ujhhgtgfeyxiexzf++;
        }
        c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf += (long) i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final byte[] m2586Ujhhgtgfeyxiexzf() {
        byte[] bArr = new byte[mo2578Ujhhgtgfeyxiexzf()];
        byte[][] bArr2 = this.f4218Ujhhgtgfeyxiexzf;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f4219Ujhhgtgfeyxiexzf;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC2391Ujhhgtgfeyxiexzf.m3642Ujhhgtgfeyxiexzf(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }
}
