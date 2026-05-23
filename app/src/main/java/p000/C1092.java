package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᲁᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1092 extends AbstractC2396 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C1092 f4102 = new C1092(C1093.f4103);

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo928(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // p000.AbstractC0739, p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        C1091 c1091 = (C1091) obj;
        double dMo2231 = interfaceC0766.mo2231(this.f7659, i);
        c1091.mo1640(c1091.mo1641() + 1);
        double[] dArr = c1091.f4100;
        int i2 = c1091.f4101;
        c1091.f4101 = i2 + 1;
        dArr[i2] = dMo2231;
    }

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo931(Object obj) {
        double[] dArr = (double[]) obj;
        C1091 c1091 = new C1091();
        c1091.f4100 = dArr;
        c1091.f4101 = dArr.length;
        c1091.mo1640(10);
        return c1091;
    }

    @Override // p000.AbstractC2396
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Object mo1642() {
        return new double[0];
    }

    @Override // p000.AbstractC2396
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1643(InterfaceC0767 interfaceC0767, Object obj, int i) {
        double[] dArr = (double[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0767.mo2243(this.f7659, i2, dArr[i2]);
        }
    }
}
