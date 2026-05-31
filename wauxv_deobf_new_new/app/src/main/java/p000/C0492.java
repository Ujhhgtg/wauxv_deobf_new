package p000;

import java.io.InputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᤞᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0492 extends InputStream {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f2143 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f2144 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0493 f2145;

    public C0492(C0493 c0493) {
        this.f2145 = c0493;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f2145.f2147 - this.f2143;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f2144 = this.f2143;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f2143;
        C0493 c0493 = this.f2145;
        if (i >= c0493.f2147) {
            return -1;
        }
        int iM1910 = c0493.m1910(i);
        this.f2143++;
        return iM1910;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f2143 = this.f2144;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        C0493 c0493 = this.f2145;
        int i3 = c0493.f2147;
        int i4 = this.f2143;
        int i5 = i3 - i4;
        if (i2 > i5) {
            i2 = i5;
        }
        System.arraycopy(c0493.f2146, i4, bArr, i, i2);
        this.f2143 += i2;
        return i2;
    }
}
