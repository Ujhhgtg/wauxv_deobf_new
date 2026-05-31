package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲇᲀᲁᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0766 implements InterfaceC2002 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2002 f2867;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1046 f2868;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0293 f2869;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1806 f2870;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1860 f2871;

    public C0766(InterfaceC2002 interfaceC2002, C1046 c1046) {
        AbstractC0344 abstractC0344;
        this.f2867 = interfaceC2002;
        this.f2868 = c1046;
        C0293 c0293 = (C0293) interfaceC2002.getAttributes().m1750("Code");
        this.f2869 = c0293;
        C0417 c0417 = c0293.f1571;
        C1806 c1806 = C1806.f5968;
        C0299 c0299 = (C0299) c0417.m1750("LineNumberTable");
        while (c0299 != null) {
            C1806 c1807 = c0299.f1578;
            if (c1806 == C1806.f5968) {
                c1806 = c1807;
            } else {
                int length = c1806.f4833.length;
                int length2 = c1807.f4833.length;
                C1806 c1808 = new C1806(length + length2);
                for (int i = 0; i < length; i++) {
                    c1808.m3166(i, (C1805) c1806.m3165(i));
                }
                for (int i2 = 0; i2 < length2; i2++) {
                    c1808.m3166(length + i2, (C1805) c1807.m3165(i2));
                }
                c1806 = c1808;
            }
            int length3 = c0417.f4833.length;
            int i3 = 0;
            while (true) {
                if (i3 < length3) {
                    if (((AbstractC0344) c0417.m3165(i3)) == c0299) {
                        String str = c0299.f1721;
                        do {
                            i3++;
                            if (i3 < length3) {
                                abstractC0344 = (AbstractC0344) c0417.m3165(i3);
                            }
                        } while (!abstractC0344.f1721.equals(str));
                    } else {
                        i3++;
                    }
                }
                abstractC0344 = null;
                break;
            }
            c0299 = (C0299) abstractC0344;
        }
        this.f2870 = c1806;
        this.f2871 = C1860.f6200;
    }

    @Override // p000.InterfaceC1957
    public final C0417 getAttributes() {
        return this.f2867.getAttributes();
    }

    @Override // p000.InterfaceC1957
    public final C0916 getName() {
        return this.f2867.getName();
    }

    @Override // p000.InterfaceC1957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0916 mo2357() {
        return this.f2867.mo2357();
    }

    @Override // p000.InterfaceC2002
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2492 mo2358() {
        return this.f2867.mo2358();
    }

    @Override // p000.InterfaceC1957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0917 mo2359() {
        return this.f2867.mo2359();
    }

    @Override // p000.InterfaceC1957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int mo2360() {
        return this.f2867.mo2360();
    }

    @Override // p000.InterfaceC1957
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0913 mo2361() {
        return this.f2867.mo2361();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2848 m2362(int i) {
        C1046 c1046 = this.f2868;
        c1046.m2736();
        AbstractC0344 abstractC0344M1750 = c1046.f3812.m1750("SourceFile");
        C0916 c0916 = abstractC0344M1750 instanceof C0307 ? ((C0307) abstractC0344M1750).f1582 : null;
        C1806 c1806 = this.f2870;
        int length = c1806.f4833.length;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            C1805 c1805 = (C1805) c1806.m3165(i4);
            int i5 = c1805.f5966;
            if (i5 <= i && i5 > i2) {
                i3 = c1805.f5967;
                if (i5 == i) {
                    break;
                }
                i2 = i5;
            }
        }
        return new C2848(c0916, i, i3);
    }
}
