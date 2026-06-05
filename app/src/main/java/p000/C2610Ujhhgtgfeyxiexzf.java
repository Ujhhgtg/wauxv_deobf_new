package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛱUjhhgtgᛱ要点脸ᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2610Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public byte[] f8421Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f8422Ujhhgtgfeyxiexzf;

    public C2610Ujhhgtgfeyxiexzf() {
        this.f8421Ujhhgtgfeyxiexzf = new byte[64];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m3899Ujhhgtgfeyxiexzf(int i, int i2) {
        int i3 = this.f8422Ujhhgtgfeyxiexzf;
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IllegalArgumentException("bad range: " + i + ".." + i2 + "; actual size " + i3);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public void m3900Ujhhgtgfeyxiexzf(int i) {
        byte[] bArr = this.f8421Ujhhgtgfeyxiexzf;
        int length = bArr.length * 2;
        int i2 = this.f8422Ujhhgtgfeyxiexzf;
        int i3 = i + i2;
        if (length <= i3) {
            length = i3;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f8421Ujhhgtgfeyxiexzf = bArr2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int m3901Ujhhgtgfeyxiexzf(int i) {
        m3899Ujhhgtgfeyxiexzf(i, i + 4);
        return m3905Ujhhgtgfeyxiexzf(i + 3) | (this.f8421Ujhhgtgfeyxiexzf[i] << 24) | (m3905Ujhhgtgfeyxiexzf(i + 1) << 16) | (m3905Ujhhgtgfeyxiexzf(i + 2) << 8);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public long m3902Ujhhgtgfeyxiexzf(int i) {
        m3899Ujhhgtgfeyxiexzf(i, i + 8);
        byte[] bArr = this.f8421Ujhhgtgfeyxiexzf;
        int iM3905Ujhhgtgfeyxiexzf = (bArr[i] << 24) | (m3905Ujhhgtgfeyxiexzf(i + 1) << 16) | (m3905Ujhhgtgfeyxiexzf(i + 2) << 8) | m3905Ujhhgtgfeyxiexzf(i + 3);
        return (((long) iM3905Ujhhgtgfeyxiexzf) << 32) | (((long) (m3905Ujhhgtgfeyxiexzf(i + 7) | (bArr[i + 4] << 24) | (m3905Ujhhgtgfeyxiexzf(i + 5) << 16) | (m3905Ujhhgtgfeyxiexzf(i + 6) << 8))) & 4294967295L);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int m3903Ujhhgtgfeyxiexzf(int i) {
        m3899Ujhhgtgfeyxiexzf(i, i + 2);
        return m3905Ujhhgtgfeyxiexzf(i + 1) | (this.f8421Ujhhgtgfeyxiexzf[i] << 8);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int m3904Ujhhgtgfeyxiexzf(int i) {
        m3899Ujhhgtgfeyxiexzf(i, i + 1);
        return m3905Ujhhgtgfeyxiexzf(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int m3905Ujhhgtgfeyxiexzf(int i) {
        return this.f8421Ujhhgtgfeyxiexzf[i] & 255;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int m3906Ujhhgtgfeyxiexzf(int i) {
        m3899Ujhhgtgfeyxiexzf(i, i + 2);
        return m3905Ujhhgtgfeyxiexzf(i + 1) | (m3905Ujhhgtgfeyxiexzf(i) << 8);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void m3907Ujhhgtgfeyxiexzf(int i, int i2) {
        int i3 = this.f8422Ujhhgtgfeyxiexzf;
        int i4 = i3 + 2;
        if (i4 > this.f8421Ujhhgtgfeyxiexzf.length) {
            m3900Ujhhgtgfeyxiexzf(2);
        }
        byte[] bArr = this.f8421Ujhhgtgfeyxiexzf;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) i2;
        this.f8422Ujhhgtgfeyxiexzf = i4;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m3908Ujhhgtgfeyxiexzf(int i, int i2) {
        int i3 = this.f8422Ujhhgtgfeyxiexzf;
        int i4 = i3 + 3;
        if (i4 > this.f8421Ujhhgtgfeyxiexzf.length) {
            m3900Ujhhgtgfeyxiexzf(3);
        }
        byte[] bArr = this.f8421Ujhhgtgfeyxiexzf;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) i2;
        this.f8422Ujhhgtgfeyxiexzf = i4;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public void m3909Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        int i4 = this.f8422Ujhhgtgfeyxiexzf;
        int i5 = i4 + 5;
        if (i5 > this.f8421Ujhhgtgfeyxiexzf.length) {
            m3900Ujhhgtgfeyxiexzf(5);
        }
        byte[] bArr = this.f8421Ujhhgtgfeyxiexzf;
        bArr[i4] = (byte) i;
        bArr[i4 + 1] = (byte) (i2 >>> 8);
        bArr[i4 + 2] = (byte) i2;
        bArr[i4 + 3] = (byte) (i3 >>> 8);
        bArr[i4 + 4] = (byte) i3;
        this.f8422Ujhhgtgfeyxiexzf = i5;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m3910Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f8422Ujhhgtgfeyxiexzf;
        int i3 = i2 + 1;
        if (i3 > this.f8421Ujhhgtgfeyxiexzf.length) {
            m3900Ujhhgtgfeyxiexzf(1);
        }
        this.f8421Ujhhgtgfeyxiexzf[i2] = (byte) i;
        this.f8422Ujhhgtgfeyxiexzf = i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public void m3911Ujhhgtgfeyxiexzf(int i, byte[] bArr) {
        if (this.f8422Ujhhgtgfeyxiexzf + i > this.f8421Ujhhgtgfeyxiexzf.length) {
            m3900Ujhhgtgfeyxiexzf(i);
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f8421Ujhhgtgfeyxiexzf, this.f8422Ujhhgtgfeyxiexzf, i);
        }
        this.f8422Ujhhgtgfeyxiexzf += i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public void m3912Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f8422Ujhhgtgfeyxiexzf;
        int i3 = i2 + 4;
        if (i3 > this.f8421Ujhhgtgfeyxiexzf.length) {
            m3900Ujhhgtgfeyxiexzf(4);
        }
        byte[] bArr = this.f8421Ujhhgtgfeyxiexzf;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        this.f8422Ujhhgtgfeyxiexzf = i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void m3913Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f8422Ujhhgtgfeyxiexzf;
        int i3 = i2 + 2;
        if (i3 > this.f8421Ujhhgtgfeyxiexzf.length) {
            m3900Ujhhgtgfeyxiexzf(2);
        }
        byte[] bArr = this.f8421Ujhhgtgfeyxiexzf;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        this.f8422Ujhhgtgfeyxiexzf = i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public C2610Ujhhgtgfeyxiexzf m3914Ujhhgtgfeyxiexzf(int i, int i2) {
        m3899Ujhhgtgfeyxiexzf(i, i2);
        return new C2610Ujhhgtgfeyxiexzf(Arrays.copyOfRange(this.f8421Ujhhgtgfeyxiexzf, i, i2));
    }

    public C2610Ujhhgtgfeyxiexzf(byte[] bArr) {
        int length = bArr.length;
        if (length >= 0) {
            if (length <= bArr.length) {
                this.f8421Ujhhgtgfeyxiexzf = bArr;
                this.f8422Ujhhgtgfeyxiexzf = length;
                return;
            }
            throw new IllegalArgumentException("end > bytes.length");
        }
        throw new IllegalArgumentException("end < start");
    }
}
