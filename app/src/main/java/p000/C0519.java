package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲀᲇᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0519 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean f2194;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public byte[] f2195;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f2196;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f2197;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ArrayList f2198;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f2199;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f2200;

    public C0519() {
        this(new byte[1000], true);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m1829() {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1830(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            throw new IllegalArgumentException("bogus alignment");
        }
        int i3 = (this.f2196 + i2) & (~i2);
        if (this.f2194) {
            m1835(i3);
        } else if (i3 > this.f2195.length) {
            m1829();
            throw null;
        }
        Arrays.fill(this.f2195, this.f2196, i3, (byte) 0);
        this.f2196 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1831(int i, String str) {
        int i2;
        if (this.f2198 == null) {
            return;
        }
        m1834();
        int size = this.f2198.size();
        if (size == 0) {
            i2 = 0;
        } else {
            i2 = ((C0518) this.f2198.get(size - 1)).f2193;
        }
        int i3 = this.f2196;
        if (i2 <= i3) {
            i2 = i3;
        }
        this.f2198.add(new C0518(i2, i + i2, str));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m1832(String str) {
        if (this.f2198 == null) {
            return;
        }
        m1834();
        this.f2198.add(new C0518(this.f2196, 2147483647, str));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m1833() {
        return this.f2198 != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m1834() {
        int size;
        ArrayList arrayList = this.f2198;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        C0518 c0518 = (C0518) this.f2198.get(size - 1);
        int i = this.f2196;
        if (c0518.f2193 == 2147483647) {
            c0518.f2193 = i;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m1835(int i) {
        byte[] bArr = this.f2195;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i * 2) + 1000];
            System.arraycopy(bArr, 0, bArr2, 0, this.f2196);
            this.f2195 = bArr2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final byte[] m1836() {
        int i = this.f2196;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f2195, 0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1837(byte[] bArr) {
        int length = bArr.length;
        int i = this.f2196;
        int i2 = i + length;
        if ((length | i2) < 0 || false) {
            throw new IndexOutOfBoundsException("bytes.length " + bArr.length + "; 0..!" + i2);
        }
        if (this.f2194) {
            m1835(i2);
        } else if (i2 > this.f2195.length) {
            m1829();
            throw null;
        }
        System.arraycopy(bArr, 0, this.f2195, i, length);
        this.f2196 = i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m1838(int i) {
        int i2 = this.f2196;
        int i3 = i2 + 1;
        if (this.f2194) {
            m1835(i3);
        } else if (i3 > this.f2195.length) {
            m1829();
            throw null;
        }
        this.f2195[i2] = (byte) i;
        this.f2196 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m1839(int i) {
        int i2 = this.f2196;
        int i3 = i2 + 4;
        if (this.f2194) {
            m1835(i3);
        } else if (i3 > this.f2195.length) {
            m1829();
            throw null;
        }
        byte[] bArr = this.f2195;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f2196 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m1840(int i) {
        int i2 = this.f2196;
        int i3 = i2 + 2;
        if (this.f2194) {
            m1835(i3);
        } else if (i3 > this.f2195.length) {
            m1829();
            throw null;
        }
        byte[] bArr = this.f2195;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.f2196 = i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m1841(int i) {
        if (this.f2194) {
            m1835(this.f2196 + 5);
        }
        int i2 = i >> 7;
        int i3 = (-2147483648 & i) == 0 ? 0 : -1;
        int i4 = i;
        int i5 = i2;
        boolean z = true;
        while (z) {
            z = (i5 == i3 && (i5 & 1) == ((i4 >> 6) & 1)) ? false : true;
            m1838((byte) ((i4 & 127) | (z ? 128 : 0)));
            i4 = i5;
            i5 >>= 7;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final int m1842(int i) {
        if (this.f2194) {
            m1835(this.f2196 + 5);
        }
        int i2 = this.f2196;
        while (true) {
            int i3 = i;
            i >>>= 7;
            if (i == 0) {
                m1838((byte) (i3 & 127));
                return this.f2196 - i2;
            }
            m1838((byte) ((i3 & 127) | 128));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m1843(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        int i2 = this.f2196 + i;
        if (this.f2194) {
            m1835(i2);
        } else if (i2 > this.f2195.length) {
            m1829();
            throw null;
        }
        Arrays.fill(this.f2195, this.f2196, i2, (byte) 0);
        this.f2196 = i2;
    }

    public C0519(byte[] bArr, boolean z) {
        this.f2194 = z;
        this.f2195 = bArr;
        this.f2196 = 0;
        this.f2197 = false;
        this.f2198 = null;
        this.f2199 = 0;
        this.f2200 = 0;
    }
}
