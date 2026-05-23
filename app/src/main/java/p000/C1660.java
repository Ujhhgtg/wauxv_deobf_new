package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᛸᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1660 extends AbstractC2106 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C1660 f5608;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int[] f5609;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f5610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f5611;

    static {
        C1660 c1660 = new C1660(0);
        f5608 = c1660;
        c1660.f6944 = false;
    }

    public C1660(int i) {
        super(true);
        try {
            this.f5609 = new int[i];
            this.f5610 = 0;
            this.f5611 = true;
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static C1660 m3381(int i) {
        C1660 c1660 = new C1660(1);
        c1660.m3382(i);
        c1660.f6944 = false;
        return c1660;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1660)) {
            return false;
        }
        C1660 c1660 = (C1660) obj;
        if (this.f5611 != c1660.f5611 || this.f5610 != c1660.f5610) {
            return false;
        }
        for (int i = 0; i < this.f5610; i++) {
            if (this.f5609[i] != c1660.f5609[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.f5610; i2++) {
            i = (i * 31) + this.f5609[i2];
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f5610 * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.f5610; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.f5609[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3382(int i) {
        m3925();
        int i2 = this.f5610;
        int[] iArr = this.f5609;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 10];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f5609 = iArr2;
        }
        int[] iArr3 = this.f5609;
        int i3 = this.f5610;
        int i4 = i3 + 1;
        this.f5610 = i4;
        iArr3[i3] = i;
        if (!this.f5611 || i4 <= 1) {
            return;
        }
        this.f5611 = i >= iArr3[i3 + (-1)];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int m3383(int i) {
        int i2;
        int i3 = this.f5610;
        if (!this.f5611) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (this.f5609[i4] == i) {
                    return i4;
                }
            }
            return -i3;
        }
        int i5 = -1;
        int i6 = i3;
        while (i6 > i5 + 1) {
            int i7 = ((i6 - i5) >> 1) + i5;
            if (i <= this.f5609[i7]) {
                i6 = i7;
            } else {
                i5 = i7;
            }
        }
        if (i6 == i3) {
            i2 = -i3;
        } else {
            if (i == this.f5609[i6]) {
                return i6;
            }
            i2 = -i6;
        }
        return i2 - 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int m3384(int i) {
        if (i >= this.f5610) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.f5609[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C1660 m3385() {
        int i = this.f5610;
        C1660 c1660 = new C1660(i);
        for (int i2 = 0; i2 < i; i2++) {
            c1660.m3382(this.f5609[i2]);
        }
        return c1660;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m3386(int i, int i2) {
        m3925();
        if (i >= this.f5610) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.f5609[i] = i2;
            this.f5611 = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IllegalArgumentException("n < 0");
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void m3387(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > this.f5610) {
            throw new IllegalArgumentException("newSize > size");
        }
        m3925();
        this.f5610 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m3388() {
        m3925();
        if (this.f5611) {
            return;
        }
        Arrays.sort(this.f5609, 0, this.f5610);
        this.f5611 = true;
    }
}
