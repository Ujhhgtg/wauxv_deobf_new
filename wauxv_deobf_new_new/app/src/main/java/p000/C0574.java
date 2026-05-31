package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲁᲈᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0574 extends AbstractC2449 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0574 f2367 = new C0574(C0579.f2377);

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo1072(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // p000.AbstractC0734, p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1074(InterfaceC0764 interfaceC0764, int i, Object obj) {
        C0571 c0571 = (C0571) obj;
        char cMo2333 = interfaceC0764.mo2333(this.f7803, i);
        c0571.mo1746(c0571.mo1747() + 1);
        char[] cArr = c0571.f2362;
        int i2 = c0571.f2363;
        c0571.f2363 = i2 + 1;
        cArr[i2] = cMo2333;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo1075(Object obj) {
        char[] cArr = (char[]) obj;
        C0571 c0571 = new C0571();
        c0571.f2362 = cArr;
        c0571.f2363 = cArr.length;
        c0571.mo1746(10);
        return c0571;
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Object mo1748() {
        return new char[0];
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1749(InterfaceC0765 interfaceC0765, Object obj, int i) {
        char[] cArr = (char[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0765.mo2352(this.f7803, i2, cArr[i2]);
        }
    }
}
