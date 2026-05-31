package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᤝᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3537 extends AbstractC2449 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C3537 f11128 = new C3537(C3538.f11129);

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo1072(Object obj) {
        return ((C3535) obj).f11125.length;
    }

    @Override // p000.AbstractC0734, p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1074(InterfaceC0764 interfaceC0764, int i, Object obj) {
        C3536 c3536 = (C3536) obj;
        int iMo2640 = interfaceC0764.mo2330(this.f7803, i).mo2640();
        c3536.mo1746(c3536.mo1747() + 1);
        int[] iArr = c3536.f11126;
        int i2 = c3536.f11127;
        c3536.f11127 = i2 + 1;
        iArr[i2] = iMo2640;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo1075(Object obj) {
        int[] iArr = ((C3535) obj).f11125;
        C3536 c3536 = new C3536();
        c3536.f11126 = iArr;
        c3536.f11127 = iArr.length;
        c3536.mo1746(10);
        return c3536;
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Object mo1748() {
        return new C3535(new int[0]);
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1749(InterfaceC0765 interfaceC0765, Object obj, int i) {
        int[] iArr = ((C3535) obj).f11125;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0765.mo2356(this.f7803, i2).mo2928(iArr[i2]);
        }
    }
}
