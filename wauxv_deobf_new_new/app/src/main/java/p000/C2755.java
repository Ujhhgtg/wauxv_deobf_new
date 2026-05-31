package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᤝᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2755 extends AbstractC2449 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C2755 f8859 = new C2755(C2756.f8860);

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo1072(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // p000.AbstractC0734, p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1074(InterfaceC0764 interfaceC0764, int i, Object obj) {
        C2754 c2754 = (C2754) obj;
        short sMo2337 = interfaceC0764.mo2337(this.f7803, i);
        c2754.mo1746(c2754.mo1747() + 1);
        short[] sArr = c2754.f8857;
        int i2 = c2754.f8858;
        c2754.f8858 = i2 + 1;
        sArr[i2] = sMo2337;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo1075(Object obj) {
        short[] sArr = (short[]) obj;
        C2754 c2754 = new C2754();
        c2754.f8857 = sArr;
        c2754.f8858 = sArr.length;
        c2754.mo1746(10);
        return c2754;
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Object mo1748() {
        return new short[0];
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1749(InterfaceC0765 interfaceC0765, Object obj, int i) {
        short[] sArr = (short[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0765.mo2349(this.f7803, i2, sArr[i2]);
        }
    }
}
