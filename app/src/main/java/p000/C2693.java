package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᤝᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2693 extends AbstractC2396 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C2693 f8688 = new C2693(C2694.f8689);

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo928(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // p000.AbstractC0739, p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        C2692 c2692 = (C2692) obj;
        short sMo2236 = interfaceC0766.mo2236(this.f7659, i);
        c2692.mo1640(c2692.mo1641() + 1);
        short[] sArr = c2692.f8686;
        int i2 = c2692.f8687;
        c2692.f8687 = i2 + 1;
        sArr[i2] = sMo2236;
    }

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo931(Object obj) {
        short[] sArr = (short[]) obj;
        C2692 c2692 = new C2692();
        c2692.f8686 = sArr;
        c2692.f8687 = sArr.length;
        c2692.mo1640(10);
        return c2692;
    }

    @Override // p000.AbstractC2396
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Object mo1642() {
        return new short[0];
    }

    @Override // p000.AbstractC2396
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1643(InterfaceC0767 interfaceC0767, Object obj, int i) {
        short[] sArr = (short[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0767.mo2248(this.f7659, i2, sArr[i2]);
        }
    }
}
