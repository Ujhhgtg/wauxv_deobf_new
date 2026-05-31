package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᤞᤝᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3542 extends AbstractC2449 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C3542 f11135 = new C3542(C3543.f11136);

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo1072(Object obj) {
        return ((C3540) obj).f11132.length;
    }

    @Override // p000.AbstractC0734, p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo1074(InterfaceC0764 interfaceC0764, int i, Object obj) {
        C3541 c3541 = (C3541) obj;
        long jMo2643 = interfaceC0764.mo2330(this.f7803, i).mo2643();
        c3541.mo1746(c3541.mo1747() + 1);
        long[] jArr = c3541.f11133;
        int i2 = c3541.f11134;
        c3541.f11134 = i2 + 1;
        jArr[i2] = jMo2643;
    }

    @Override // p000.AbstractC0063
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final Object mo1075(Object obj) {
        long[] jArr = ((C3540) obj).f11132;
        C3541 c3541 = new C3541();
        c3541.f11133 = jArr;
        c3541.f11134 = jArr.length;
        c3541.mo1746(10);
        return c3541;
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final Object mo1748() {
        return new C3540(new long[0]);
    }

    @Override // p000.AbstractC2449
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo1749(InterfaceC0765 interfaceC0765, Object obj, int i) {
        long[] jArr = ((C3540) obj).f11132;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC0765.mo2356(this.f7803, i2).mo2929(jArr[i2]);
        }
    }
}
