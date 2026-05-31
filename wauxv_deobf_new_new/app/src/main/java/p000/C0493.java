package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᤞᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0493 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public byte[] f2146;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f2147;

    public C0493() {
        this.f2146 = new byte[64];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m1904(int i, int i2) {
        int i3 = this.f2147;
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IllegalArgumentException("bad range: " + i + ".." + i2 + "; actual size " + i3);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m1905(int i) {
        byte[] bArr = this.f2146;
        int length = bArr.length * 2;
        int i2 = this.f2147;
        int i3 = i + i2;
        if (length <= i3) {
            length = i3;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f2146 = bArr2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int m1906(int i) {
        m1904(i, i + 4);
        return m1910(i + 3) | (this.f2146[i] << 24) | (m1910(i + 1) << 16) | (m1910(i + 2) << 8);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public long m1907(int i) {
        m1904(i, i + 8);
        byte[] bArr = this.f2146;
        int iM1910 = (bArr[i] << 24) | (m1910(i + 1) << 16) | (m1910(i + 2) << 8) | m1910(i + 3);
        return (((long) iM1910) << 32) | (((long) (m1910(i + 7) | (bArr[i + 4] << 24) | (m1910(i + 5) << 16) | (m1910(i + 6) << 8))) & 4294967295L);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int m1908(int i) {
        m1904(i, i + 2);
        return m1910(i + 1) | (this.f2146[i] << 8);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int m1909(int i) {
        m1904(i, i + 1);
        return m1910(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int m1910(int i) {
        return this.f2146[i] & 255;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int m1911(int i) {
        m1904(i, i + 2);
        return m1910(i + 1) | (m1910(i) << 8);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void m1912(int i, int i2) {
        int i3 = this.f2147;
        int i4 = i3 + 2;
        if (i4 > this.f2146.length) {
            m1905(2);
        }
        byte[] bArr = this.f2146;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) i2;
        this.f2147 = i4;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void m1913(int i, int i2) {
        int i3 = this.f2147;
        int i4 = i3 + 3;
        if (i4 > this.f2146.length) {
            m1905(3);
        }
        byte[] bArr = this.f2146;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) i2;
        this.f2147 = i4;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m1914(int i, int i2, int i3) {
        int i4 = this.f2147;
        int i5 = i4 + 5;
        if (i5 > this.f2146.length) {
            m1905(5);
        }
        byte[] bArr = this.f2146;
        bArr[i4] = (byte) i;
        bArr[i4 + 1] = (byte) (i2 >>> 8);
        bArr[i4 + 2] = (byte) i2;
        bArr[i4 + 3] = (byte) (i3 >>> 8);
        bArr[i4 + 4] = (byte) i3;
        this.f2147 = i5;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void m1915(int i) {
        int i2 = this.f2147;
        int i3 = i2 + 1;
        if (i3 > this.f2146.length) {
            m1905(1);
        }
        this.f2146[i2] = (byte) i;
        this.f2147 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public void m1916(int i, byte[] bArr) {
        if (this.f2147 + i > this.f2146.length) {
            m1905(i);
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f2146, this.f2147, i);
        }
        this.f2147 += i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public void m1917(int i) {
        int i2 = this.f2147;
        int i3 = i2 + 4;
        if (i3 > this.f2146.length) {
            m1905(4);
        }
        byte[] bArr = this.f2146;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        this.f2147 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m1918(int i) {
        int i2 = this.f2147;
        int i3 = i2 + 2;
        if (i3 > this.f2146.length) {
            m1905(2);
        }
        byte[] bArr = this.f2146;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        this.f2147 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public C0493 m1919(int i, int i2) {
        m1904(i, i2);
        return new C0493(Arrays.copyOfRange(this.f2146, i, i2));
    }

    public C0493(byte[] bArr) {
        int length = bArr.length;
        if (length >= 0) {
            if (length <= bArr.length) {
                this.f2146 = bArr;
                this.f2147 = length;
                return;
            }
            throw new IllegalArgumentException("end > bytes.length");
        }
        throw new IllegalArgumentException("end < start");
    }
}
