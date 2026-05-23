package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲇᤞᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0524 extends AbstractC2396 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0524 f2211 = new C0524(C0538.f2242);

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo928(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // p000.AbstractC0739, p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        C0520 c0520 = (C0520) obj;
        byte bMo2234 = interfaceC0766.mo2234(this.f7659, i);
        c0520.mo1640(c0520.mo1641() + 1);
        byte[] bArr = c0520.f2201;
        int i2 = c0520.f2202;
        c0520.f2202 = i2 + 1;
        bArr[i2] = bMo2234;
    }

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo931(Object obj) {
        byte[] bArr = (byte[]) obj;
        C0520 c0520 = new C0520();
        c0520.f2201 = bArr;
        c0520.f2202 = bArr.length;
        c0520.mo1640(10);
        return c0520;
    }

    @Override // p000.AbstractC2396
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Object mo1642() {
        return new byte[0];
    }

    @Override // p000.AbstractC2396
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1643(InterfaceC0767 interfaceC0767, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0767.mo2246(this.f7659, i2, bArr[i2]);
        }
    }
}
