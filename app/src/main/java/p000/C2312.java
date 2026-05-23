package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᤞᲁᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2312 extends C2436 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f7444;

    @Override // p000.C2436, p000.InterfaceC0974
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC0766 mo2512(InterfaceC2654 interfaceC2654) {
        throw new C1653("Packing only supports primitive number types. The input type however was a struct: " + interfaceC2654);
    }

    @Override // p000.C2436, p000.InterfaceC0766
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final int mo2230(InterfaceC2654 interfaceC2654) {
        C2439 c2439 = this.f7737;
        if (!c2439.f7751) {
            C0521 c0521 = c2439.f7748;
            if (c0521.f2203 - c0521.f2204 == 0) {
                return -1;
            }
        }
        int i = this.f7444;
        this.f7444 = i + 1;
        return i;
    }

    @Override // p000.C2436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ */
    public final String mo4159(long j) {
        throw new C1653("Packing only supports primitive number types. The actual reading is for string.");
    }

    @Override // p000.C2436
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ */
    public final long mo3689(InterfaceC2654 interfaceC2654, int i) {
        return 19500L;
    }
}
