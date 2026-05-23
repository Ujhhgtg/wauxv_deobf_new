package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᤞᲀᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0768 implements InterfaceC1971 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC1971 f2865;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1043 f2866;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0283 f2867;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1783 f2868;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1833 f2869;

    public C0768(InterfaceC1971 interfaceC1971, C1043 c1043) {
        AbstractC0369 abstractC0369;
        this.f2865 = interfaceC1971;
        this.f2866 = c1043;
        C0283 c0283 = (C0283) interfaceC1971.getAttributes().m1644("Code");
        this.f2867 = c0283;
        C0442 c0442 = c0283.f1497;
        C1783 c1783 = C1783.f5912;
        C0289 c0289 = (C0289) c0442.m1644("LineNumberTable");
        while (c0289 != null) {
            C1783 c1784 = c0289.f1504;
            if (true) {
                c1783 = c1784;
            } else {
                int length = c1783.f4836.length;
                int length2 = c1784.f4836.length;
                C1783 c1785 = new C1783(length + length2);
                for (int i = 0; i < length; i++) {
                    c1785.m3063(i, (C1782) c1783.m3062(i));
                }
                for (int i2 = 0; i2 < length2; i2++) {
                    c1785.m3063(length + i2, (C1782) c1784.m3062(i2));
                }
                c1783 = c1785;
            }
            int length3 = c0442.f4836.length;
            int i3 = 0;
            while (true) {
                if (0 < length3) {
                    if (((AbstractC0369) c0442.m3062(0)) == c0289) {
                        String str = c0289.f1750;
                        do {
                            i3++;
                            if (i3 < length3) {
                                abstractC0369 = (AbstractC0369) c0442.m3062(i3);
                            }
                        } while (!abstractC0369.f1750.equals(str));
                    } else {
                        0++;
                    }
                }
                abstractC0369 = null;
                break;
            }
            c0289 = (C0289) abstractC0369;
        }
        this.f2868 = c1783;
        this.f2869 = C1833.f6125;
    }

    @Override // p000.InterfaceC1926
    public final C0442 getAttributes() {
        return this.f2865.getAttributes();
    }

    @Override // p000.InterfaceC1926
    public final C0917 getName() {
        return this.f2865.getName();
    }

    @Override // p000.InterfaceC1926
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0917 mo2256() {
        return this.f2865.mo2256();
    }

    @Override // p000.InterfaceC1971
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2440 mo2257() {
        return this.f2865.mo2257();
    }

    @Override // p000.InterfaceC1926
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0918 mo2258() {
        return this.f2865.mo2258();
    }

    @Override // p000.InterfaceC1926
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int mo2259() {
        return this.f2865.mo2259();
    }

    @Override // p000.InterfaceC1926
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0914 mo2260() {
        return this.f2865.mo2260();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2788 m2261(int i) {
        C1043 c1043 = this.f2866;
        c1043.m2612();
        AbstractC0369 abstractC0369M1644 = c1043.f3805.m1644("SourceFile");
        C0917 c0917 = abstractC0369M1644 instanceof C0297 ? ((C0297) abstractC0369M1644).f1508 : null;
        C1783 c1783 = this.f2868;
        int length = c1783.f4836.length;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            C1782 c1782 = (C1782) c1783.m3062(i4);
            int i5 = c1782.f5910;
            if (i5 <= i && i5 > i2) {
                i3 = c1782.f5911;
                if (i5 == i) {
                    break;
                }
                i2 = i5;
            }
        }
        return new C2788(c0917, i, i3);
    }
}
