package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᲈᲀᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3480 extends AbstractC2396 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C3480 f10976 = new C3480(C3481.f10977);

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo928(Object obj) {
        return ((C3478) obj).f10973.length;
    }

    @Override // p000.AbstractC0739, p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        C3479 c3479 = (C3479) obj;
        int iMo2516 = interfaceC0766.mo2229(this.f7659, i).mo2516();
        c3479.mo1640(c3479.mo1641() + 1);
        int[] iArr = c3479.f10974;
        int i2 = c3479.f10975;
        c3479.f10975 = i2 + 1;
        iArr[i2] = iMo2516;
    }

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo931(Object obj) {
        int[] iArr = ((C3478) obj).f10973;
        C3479 c3479 = new C3479();
        c3479.f10974 = iArr;
        c3479.f10975 = iArr.length;
        c3479.mo1640(10);
        return c3479;
    }

    @Override // p000.AbstractC2396
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Object mo1642() {
        return new C3478(new int[0]);
    }

    @Override // p000.AbstractC2396
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1643(InterfaceC0767 interfaceC0767, Object obj, int i) {
        int[] iArr = ((C3478) obj).f10973;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0767.mo2255(this.f7659, i2).mo2806(iArr[i2]);
        }
    }
}
