package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲇᲀᤝᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0762 extends C0427 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean f2864;

    public C0762(C0383 c0383, boolean z) {
        super(c0383);
        this.f2864 = z;
    }

    @Override // p000.C0427
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final void mo1781(byte b) {
        if (this.f2864) {
            mo1787(String.valueOf(b & 255));
        } else {
            m1785(String.valueOf(b & 255));
        }
    }

    @Override // p000.C0427
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1783(int i) {
        boolean z = this.f2864;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            mo1787(unsignedString);
        } else {
            m1785(unsignedString);
        }
    }

    @Override // p000.C0427
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1784(long j) {
        boolean z = this.f2864;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            mo1787(unsignedString);
        } else {
            m1785(unsignedString);
        }
    }

    @Override // p000.C0427
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo1786(short s) {
        if (this.f2864) {
            mo1787(String.valueOf(s & 65535));
        } else {
            m1785(String.valueOf(s & 65535));
        }
    }
}
