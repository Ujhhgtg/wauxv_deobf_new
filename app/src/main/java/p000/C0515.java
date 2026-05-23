package p000;

import java.io.InputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲀᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0515 extends InputStream {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f2187 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f2188 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0516 f2189;

    public C0515(C0516 c0516) {
        this.f2189 = c0516;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f2189.f2191 - this.f2187;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f2188 = this.f2187;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f2187;
        C0516 c0516 = this.f2189;
        if (i >= c0516.f2191) {
            return -1;
        }
        int iM1816 = c0516.m1816(i);
        this.f2187++;
        return iM1816;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f2187 = this.f2188;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        C0516 c0516 = this.f2189;
        int i3 = c0516.f2191;
        int i4 = this.f2187;
        int i5 = i3 - i4;
        if (i2 > i5) {
            i2 = i5;
        }
        System.arraycopy(c0516.f2190, i4, bArr, i, i2);
        this.f2187 += i2;
        return i2;
    }
}
