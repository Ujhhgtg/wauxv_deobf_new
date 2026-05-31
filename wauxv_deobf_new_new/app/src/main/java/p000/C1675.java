package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲇᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1675 extends AbstractC2449 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C1675 f5645 = new C1675(C1680.f5658);

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo1072(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // p000.AbstractC0734, p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1074(InterfaceC0764 interfaceC0764, int i, Object obj) {
        C1674 c1674 = (C1674) obj;
        int iMo2339 = interfaceC0764.mo2339(this.f7803, i);
        c1674.mo1746(c1674.mo1747() + 1);
        int[] iArr = c1674.f5643;
        int i2 = c1674.f5644;
        c1674.f5644 = i2 + 1;
        iArr[i2] = iMo2339;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo1075(Object obj) {
        int[] iArr = (int[]) obj;
        C1674 c1674 = new C1674();
        c1674.f5643 = iArr;
        c1674.f5644 = iArr.length;
        c1674.mo1746(10);
        return c1674;
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Object mo1748() {
        return new int[0];
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1749(InterfaceC0765 interfaceC0765, Object obj, int i) {
        int[] iArr = (int[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0765.mo2350(i2, iArr[i2], this.f7803);
        }
    }
}
