package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲇᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1676 extends AbstractC2139 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C1676 f5646;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int[] f5647;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f5648;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f5649;

    static {
        C1676 c1676 = new C1676(0);
        f5646 = c1676;
        c1676.f7068 = false;
    }

    public C1676(int i) {
        super(true);
        try {
            this.f5647 = new int[i];
            this.f5648 = 0;
            this.f5649 = true;
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static C1676 m3545(int i) {
        C1676 c1676 = new C1676(1);
        c1676.m3546(i);
        c1676.f7068 = false;
        return c1676;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1676)) {
            return false;
        }
        C1676 c1676 = (C1676) obj;
        if (this.f5649 != c1676.f5649 || this.f5648 != c1676.f5648) {
            return false;
        }
        for (int i = 0; i < this.f5648; i++) {
            if (this.f5647[i] != c1676.f5647[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.f5648; i2++) {
            i = (i * 31) + this.f5647[i2];
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f5648 * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.f5648; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.f5647[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3546(int i) {
        m4109();
        int i2 = this.f5648;
        int[] iArr = this.f5647;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 10];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f5647 = iArr2;
        }
        int[] iArr3 = this.f5647;
        int i3 = this.f5648;
        int i4 = i3 + 1;
        this.f5648 = i4;
        iArr3[i3] = i;
        if (!this.f5649 || i4 <= 1) {
            return;
        }
        this.f5649 = i >= iArr3[i3 + (-1)];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int m3547(int i) {
        int i2;
        int i3 = this.f5648;
        if (!this.f5649) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (this.f5647[i4] == i) {
                    return i4;
                }
            }
            return -i3;
        }
        int i5 = -1;
        int i6 = i3;
        while (i6 > i5 + 1) {
            int i7 = ((i6 - i5) >> 1) + i5;
            if (i <= this.f5647[i7]) {
                i6 = i7;
            } else {
                i5 = i7;
            }
        }
        if (i6 == i3) {
            i2 = -i3;
        } else {
            if (i == this.f5647[i6]) {
                return i6;
            }
            i2 = -i6;
        }
        return i2 - 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int m3548(int i) {
        if (i >= this.f5648) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.f5647[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C1676 m3549() {
        int i = this.f5648;
        C1676 c1676 = new C1676(i);
        for (int i2 = 0; i2 < i; i2++) {
            c1676.m3546(this.f5647[i2]);
        }
        return c1676;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m3550(int i, int i2) {
        m4109();
        if (i >= this.f5648) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.f5647[i] = i2;
            this.f5649 = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IllegalArgumentException("n < 0");
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void m3551(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > this.f5648) {
            throw new IllegalArgumentException("newSize > size");
        }
        m4109();
        this.f5648 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m3552() {
        m4109();
        if (this.f5649) {
            return;
        }
        Arrays.sort(this.f5647, 0, this.f5648);
        this.f5649 = true;
    }
}
