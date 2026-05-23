package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲀᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0516 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public byte[] f2190;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f2191;

    public C0516() {
        this.f2190 = new byte[64];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m1810(int i, int i2) {
        int i3 = this.f2191;
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IllegalArgumentException("bad range: " + i + ".." + i2 + "; actual size " + i3);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m1811(int i) {
        byte[] bArr = this.f2190;
        int length = bArr.length * 2;
        int i2 = this.f2191;
        int i3 = i + i2;
        if (length <= i3) {
            length = i3;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f2190 = bArr2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int m1812(int i) {
        m1810(i, i + 4);
        return m1816(i + 3) | (this.f2190[i] << 24) | (m1816(i + 1) << 16) | (m1816(i + 2) << 8);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public long m1813(int i) {
        m1810(i, i + 8);
        byte[] bArr = this.f2190;
        int iM1816 = (bArr[i] << 24) | (m1816(i + 1) << 16) | (m1816(i + 2) << 8) | m1816(i + 3);
        return (((long) iM1816) << 32) | (((long) (m1816(i + 7) | (bArr[i + 4] << 24) | (m1816(i + 5) << 16) | (m1816(i + 6) << 8))) & 4294967295L);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int m1814(int i) {
        m1810(i, i + 2);
        return m1816(i + 1) | (this.f2190[i] << 8);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int m1815(int i) {
        m1810(i, i + 1);
        return m1816(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int m1816(int i) {
        return this.f2190[i] & 255;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int m1817(int i) {
        m1810(i, i + 2);
        return m1816(i + 1) | (m1816(i) << 8);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void m1818(int i, int i2) {
        int i3 = this.f2191;
        int i4 = i3 + 2;
        if (i4 > this.f2190.length) {
            m1811(2);
        }
        byte[] bArr = this.f2190;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) i2;
        this.f2191 = i4;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void m1819(int i, int i2) {
        int i3 = this.f2191;
        int i4 = i3 + 3;
        if (i4 > this.f2190.length) {
            m1811(3);
        }
        byte[] bArr = this.f2190;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) i2;
        this.f2191 = i4;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public void m1820(int i, int i2, int i3) {
        int i4 = this.f2191;
        int i5 = i4 + 5;
        if (i5 > this.f2190.length) {
            m1811(5);
        }
        byte[] bArr = this.f2190;
        bArr[i4] = (byte) i;
        bArr[i4 + 1] = (byte) (i2 >>> 8);
        bArr[i4 + 2] = (byte) i2;
        bArr[i4 + 3] = (byte) (i3 >>> 8);
        bArr[i4 + 4] = (byte) i3;
        this.f2191 = i5;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void m1821(int i) {
        int i2 = this.f2191;
        int i3 = i2 + 1;
        if (i3 > this.f2190.length) {
            m1811(1);
        }
        this.f2190[i2] = (byte) i;
        this.f2191 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public void m1822(int i, byte[] bArr) {
        if (this.f2191 + i > this.f2190.length) {
            m1811(i);
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f2190, this.f2191, i);
        }
        this.f2191 += i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public void m1823(int i) {
        int i2 = this.f2191;
        int i3 = i2 + 4;
        if (i3 > this.f2190.length) {
            m1811(4);
        }
        byte[] bArr = this.f2190;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        this.f2191 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m1824(int i) {
        int i2 = this.f2191;
        int i3 = i2 + 2;
        if (i3 > this.f2190.length) {
            m1811(2);
        }
        byte[] bArr = this.f2190;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        this.f2191 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public C0516 m1825(int i, int i2) {
        m1810(i, i2);
        return new C0516(Arrays.copyOfRange(this.f2190, i, i2));
    }

    public C0516(byte[] bArr) {
        int length = bArr.length;
        if (true) {
            if (true) {
                this.f2190 = bArr;
                this.f2191 = length;
                return;
            }
            throw new IllegalArgumentException("end > bytes.length");
        }
        throw new IllegalArgumentException("end < start");
    }
}
