package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᤞᲈᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0496 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean f2150;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public byte[] f2151;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f2152;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f2153;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ArrayList f2154;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f2155;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f2156;

    public C0496() {
        this(new byte[1000], true);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m1923() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1924(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (this.f2152 + i2) & (~i2);
        if (this.f2150) {
            m1929(i3);
        } else if (i3 > this.f2151.length) {
            m1923();
            throw null;
        }
        Arrays.fill(this.f2151, this.f2152, i3, (byte) 0);
        this.f2152 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1925(int i, String str) {
        int i2;
        if (this.f2154 == null) {
            return;
        }
        m1928();
        int size = this.f2154.size();
        if (size == 0) {
            i2 = 0;
        } else {
            i2 = ((C0495) this.f2154.get(size - 1)).f2149;
        }
        int i3 = this.f2152;
        if (i2 <= i3) {
            i2 = i3;
        }
        this.f2154.add(new C0495(i2, i + i2, str));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m1926(String str) {
        if (this.f2154 == null) {
            return;
        }
        m1928();
        this.f2154.add(new C0495(this.f2152, Integer.MAX_VALUE, str));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m1927() {
        return this.f2154 != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m1928() {
        int size;
        ArrayList arrayList = this.f2154;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        C0495 c0495 = (C0495) this.f2154.get(size - 1);
        int i = this.f2152;
        if (c0495.f2149 == Integer.MAX_VALUE) {
            c0495.f2149 = i;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m1929(int i) {
        byte[] bArr = this.f2151;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.f2152);
            this.f2151 = bArr2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final byte[] m1930() {
        int i = this.f2152;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f2151, 0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1931(byte[] bArr) {
        int length = bArr.length;
        int i = this.f2152;
        int i2 = i + length;
        if ((length | i2) < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i2);
        }
        if (this.f2150) {
            m1929(i2);
        } else if (i2 > this.f2151.length) {
            m1923();
            throw null;
        }
        System.arraycopy(bArr, 0, this.f2151, i, length);
        this.f2152 = i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m1932(int i) {
        int i2 = this.f2152;
        int i3 = i2 + 1;
        if (this.f2150) {
            m1929(i3);
        } else if (i3 > this.f2151.length) {
            m1923();
            throw null;
        }
        this.f2151[i2] = (byte) i;
        this.f2152 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m1933(int i) {
        int i2 = this.f2152;
        int i3 = i2 + 4;
        if (this.f2150) {
            m1929(i3);
        } else if (i3 > this.f2151.length) {
            m1923();
            throw null;
        }
        byte[] bArr = this.f2151;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f2152 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m1934(int i) {
        int i2 = this.f2152;
        int i3 = i2 + 2;
        if (this.f2150) {
            m1929(i3);
        } else if (i3 > this.f2151.length) {
            m1923();
            throw null;
        }
        byte[] bArr = this.f2151;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.f2152 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m1935(int i) {
        if (this.f2150) {
            m1929(this.f2152 + 5);
        }
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        int i4 = i;
        int i5 = i2;
        boolean z = true;
        while (z) {
            z = (i5 == i3 && (i5 & 1) == ((i4 >> 6) & 1)) ? false : true;
            m1932((byte) ((i4 & 127) | (z ? 128 : 0)));
            i4 = i5;
            i5 >>= 7;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final int m1936(int i) {
        if (this.f2150) {
            m1929(this.f2152 + 5);
        }
        int i2 = this.f2152;
        while (true) {
            int i3 = i;
            i >>>= 7;
            if (i == 0) {
                m1932((byte) (i3 & 127));
                return this.f2152 - i2;
            }
            m1932((byte) ((i3 & 127) | 128));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m1937(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        int i2 = this.f2152 + i;
        if (this.f2150) {
            m1929(i2);
        } else if (i2 > this.f2151.length) {
            m1923();
            throw null;
        }
        Arrays.fill(this.f2151, this.f2152, i2, (byte) 0);
        this.f2152 = i2;
    }

    public C0496(byte[] bArr, boolean z) {
        this.f2150 = z;
        this.f2151 = bArr;
        this.f2152 = 0;
        this.f2153 = false;
        this.f2154 = null;
        this.f2155 = 0;
        this.f2156 = 0;
    }
}
