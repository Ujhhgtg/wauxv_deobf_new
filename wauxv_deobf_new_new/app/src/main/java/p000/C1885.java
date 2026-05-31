package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲀᛸᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1885 extends AbstractC2449 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C1885 f6253 = new C1885(C1888.f6259);

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo1072(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // p000.AbstractC0734, p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1074(InterfaceC0764 interfaceC0764, int i, Object obj) {
        C1884 c1884 = (C1884) obj;
        long jMo2341 = interfaceC0764.mo2341(this.f7803, i);
        c1884.mo1746(c1884.mo1747() + 1);
        long[] jArr = c1884.f6251;
        int i2 = c1884.f6252;
        c1884.f6252 = i2 + 1;
        jArr[i2] = jMo2341;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo1075(Object obj) {
        long[] jArr = (long[]) obj;
        C1884 c1884 = new C1884();
        c1884.f6251 = jArr;
        c1884.f6252 = jArr.length;
        c1884.mo1746(10);
        return c1884;
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Object mo1748() {
        return new long[0];
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1749(InterfaceC0765 interfaceC0765, Object obj, int i) {
        long[] jArr = (long[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0765.mo2353(this.f7803, i2, jArr[i2]);
        }
    }
}
