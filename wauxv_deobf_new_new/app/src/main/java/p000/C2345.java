package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᲁᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2345 extends C2488 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f7566;

    @Override // p000.C2488, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC0764 mo2636(InterfaceC2715 interfaceC2715) {
        throw new C1667("Packing only supports primitive number types. The input type however was a struct: " + interfaceC2715);
    }

    @Override // p000.C2488, p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final int mo2331(InterfaceC2715 interfaceC2715) {
        C2491 c2491 = this.f7881;
        if (!c2491.f7895) {
            C0498 c0498 = c2491.f7892;
            if (c0498.f2159 - c0498.f2160 == 0) {
                return -1;
            }
        }
        int i = this.f7566;
        this.f7566 = i + 1;
        return i;
    }

    @Override // p000.C2488
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ */
    public final String mo4288(long j) {
        throw new C1667("Packing only supports primitive number types. The actual reading is for string.");
    }

    @Override // p000.C2488
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ */
    public final long mo3868(InterfaceC2715 interfaceC2715, int i) {
        return 19500L;
    }
}
