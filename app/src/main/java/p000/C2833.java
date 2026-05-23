package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᛸᤞᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2833 extends AbstractC2270 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0917 f9098;

    public C2833(C0917 c0917) {
        super(1, AbstractC1459.m3199(c0917.f3378.length()) + c0917.f3379.f2191 + 1);
        this.f9098 = c0917;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1683 mo1222() {
        return EnumC1683.f5728;
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1223(AbstractC2270 abstractC2270) {
        return this.f9098.compareTo(((C2833) abstractC2270).f9098);
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1225(C1023 c1023, C0519 c0519) {
        C0917 c0917 = this.f9098;
        C0516 c0516 = c0917.f3379;
        int length = c0917.f3378.length();
        if (c0519.m1833()) {
            c0519.m1831(AbstractC1459.m3199(length), "utf16_size: ".concat(AbstractC1460.m3224(length)));
            c0519.m1831(c0516.f2191 + 1, c0917.m2430());
        }
        c0519.m1842(length);
        int i = c0516.f2191;
        int i2 = c0519.f2196;
        int i3 = i + i2;
        if (c0519.f2194) {
            c0519.m1835(i3);
        } else if (i3 > c0519.f2195.length) {
            C0519.m1829();
            throw null;
        }
        byte[] bArr = c0519.f2195;
        int length2 = bArr.length - i2;
        int i4 = c0516.f2191;
        if (length2 < i4) {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        }
        System.arraycopy(c0516.f2190, 0, bArr, i2, i4);
        c0519.f2196 = i3;
        c0519.m1838(0);
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1221(C1023 c1023) {
    }
}
