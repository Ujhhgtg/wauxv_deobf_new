package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᲀᤝᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3532 extends AbstractC2449 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C3532 f11121 = new C3532(C3533.f11122);

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo1072(Object obj) {
        return ((C3530) obj).f11118.length;
    }

    @Override // p000.AbstractC0734, p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1074(InterfaceC0764 interfaceC0764, int i, Object obj) {
        C3531 c3531 = (C3531) obj;
        byte bMo2645 = interfaceC0764.mo2330(this.f7803, i).mo2645();
        c3531.mo1746(c3531.mo1747() + 1);
        byte[] bArr = c3531.f11119;
        int i2 = c3531.f11120;
        c3531.f11120 = i2 + 1;
        bArr[i2] = bMo2645;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo1075(Object obj) {
        byte[] bArr = ((C3530) obj).f11118;
        C3531 c3531 = new C3531();
        c3531.f11119 = bArr;
        c3531.f11120 = bArr.length;
        c3531.mo1746(10);
        return c3531;
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Object mo1748() {
        return new C3530(new byte[0]);
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1749(InterfaceC0765 interfaceC0765, Object obj, int i) {
        byte[] bArr = ((C3530) obj).f11118;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0765.mo2356(this.f7803, i2).mo2923(bArr[i2]);
        }
    }
}
