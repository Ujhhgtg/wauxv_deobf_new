package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲀᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0440 extends AbstractC2396 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0440 f2007 = new C0440(C0441.f2008);

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo928(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // p000.AbstractC0739, p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo930(InterfaceC0766 interfaceC0766, int i, Object obj) {
        C0439 c0439 = (C0439) obj;
        boolean zMo2241 = interfaceC0766.mo2241(this.f7659, i);
        c0439.mo1640(c0439.mo1641() + 1);
        boolean[] zArr = c0439.f2005;
        int i2 = c0439.f2006;
        c0439.f2006 = i2 + 1;
        zArr[i2] = zMo2241;
    }

    @Override // p000.AbstractC0056
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo931(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        C0439 c0439 = new C0439();
        c0439.f2005 = zArr;
        c0439.f2006 = zArr.length;
        c0439.mo1640(10);
        return c0439;
    }

    @Override // p000.AbstractC2396
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Object mo1642() {
        return new boolean[0];
    }

    @Override // p000.AbstractC2396
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void mo1643(InterfaceC0767 interfaceC0767, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0767.mo2244(this.f7659, i2, zArr[i2]);
        }
    }
}
