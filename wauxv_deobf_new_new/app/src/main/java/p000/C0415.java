package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᤞᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0415 extends AbstractC2449 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0415 f1979 = new C0415(C0416.f1980);

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo1072(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // p000.AbstractC0734, p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1074(InterfaceC0764 interfaceC0764, int i, Object obj) {
        C0414 c0414 = (C0414) obj;
        boolean zMo2342 = interfaceC0764.mo2342(this.f7803, i);
        c0414.mo1746(c0414.mo1747() + 1);
        boolean[] zArr = c0414.f1977;
        int i2 = c0414.f1978;
        c0414.f1978 = i2 + 1;
        zArr[i2] = zMo2342;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo1075(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        C0414 c0414 = new C0414();
        c0414.f1977 = zArr;
        c0414.f1978 = zArr.length;
        c0414.mo1746(10);
        return c0414;
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Object mo1748() {
        return new boolean[0];
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void mo1749(InterfaceC0765 interfaceC0765, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0765.mo2345(this.f7803, i2, zArr[i2]);
        }
    }
}
