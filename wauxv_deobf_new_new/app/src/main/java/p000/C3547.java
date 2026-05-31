package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᤞᲇᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3547 extends AbstractC2449 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C3547 f11142 = new C3547(C3548.f11143);

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo1072(Object obj) {
        return ((C3545) obj).f11139.length;
    }

    @Override // p000.AbstractC0734, p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1074(InterfaceC0764 interfaceC0764, int i, Object obj) {
        C3546 c3546 = (C3546) obj;
        short sMo2646 = interfaceC0764.mo2330(this.f7803, i).mo2646();
        c3546.mo1746(c3546.mo1747() + 1);
        short[] sArr = c3546.f11140;
        int i2 = c3546.f11141;
        c3546.f11141 = i2 + 1;
        sArr[i2] = sMo2646;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo1075(Object obj) {
        short[] sArr = ((C3545) obj).f11139;
        C3546 c3546 = new C3546();
        c3546.f11140 = sArr;
        c3546.f11141 = sArr.length;
        c3546.mo1746(10);
        return c3546;
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Object mo1748() {
        return new C3545(new short[0]);
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1749(InterfaceC0765 interfaceC0765, Object obj, int i) {
        short[] sArr = ((C3545) obj).f11139;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0765.mo2356(this.f7803, i2).mo2922(sArr[i2]);
        }
    }
}
