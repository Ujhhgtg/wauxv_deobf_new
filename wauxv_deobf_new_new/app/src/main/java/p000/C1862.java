package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲀᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1862 extends AbstractC1861 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2320 f6201;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ArrayList f6202;

    public C1862(int i) {
        super(i != 0);
        this.f6201 = new C2320(i);
        this.f6202 = new ArrayList();
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        StringBuilder sb = new StringBuilder("(locals array set; primary)\n");
        sb.append(this.f6201.mo1360());
        sb.append('\n');
        ArrayList arrayList = this.f6202;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1861 abstractC1861 = (AbstractC1861) arrayList.get(i);
            if (abstractC1861 != null) {
                sb.append("(locals array set: primary for caller " + AbstractC2902.m4906(i) + ")\n");
                sb.append(abstractC1861.mo3768().mo1360());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    @Override // p000.AbstractC2139
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo3013() {
        this.f6201.f7068 = false;
        for (AbstractC1861 abstractC1861 : this.f6202) {
            if (abstractC1861 != null) {
                abstractC1861.mo3013();
            }
        }
        this.f7068 = false;
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo3765(C2766 c2766) {
        c2766.m3004("(locals array set; primary)");
        this.f6201.mo3765(c2766);
        ArrayList arrayList = this.f6202;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1861 abstractC1861 = (AbstractC1861) arrayList.get(i);
            if (abstractC1861 != null) {
                c2766.m3004("(locals array set: primary for caller " + AbstractC2902.m4906(i) + ')');
                abstractC1861.mo3768().mo3765(c2766);
            }
        }
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final AbstractC1861 mo3766() {
        return new C1862(this);
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final InterfaceC3507 mo3767(int i) {
        return this.f6201.mo3767(i);
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final C2320 mo3768() {
        return this.f6201;
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo3769(C3505 c3505) {
        C2320 c2320 = this.f6201;
        if (c2320.f7501.length == 0) {
            return;
        }
        m4109();
        c2320.mo3769(c3505);
        for (AbstractC1861 abstractC1861 : this.f6202) {
            if (abstractC1861 != null) {
                abstractC1861.mo3769(c3505);
            }
        }
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final AbstractC1861 mo3770(AbstractC1861 abstractC1861) {
        try {
            C1862 c1862M3775 = abstractC1861 instanceof C1862 ? m3775((C1862) abstractC1861) : m3774((C2320) abstractC1861);
            c1862M3775.mo3013();
            return c1862M3775;
        } catch (C2766 e) {
            e.m3004("underlay locals:");
            mo3765(e);
            e.m3004("overlay locals:");
            abstractC1861.mo3765(e);
            throw e;
        }
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final C1862 mo3771(AbstractC1861 abstractC1861, int i) {
        AbstractC1861 abstractC1862;
        ArrayList arrayList = this.f6202;
        AbstractC1861 abstractC1863 = i >= arrayList.size() ? null : (AbstractC1861) arrayList.get(i);
        C2320 c2320Mo3768 = abstractC1861.mo3768();
        C2320 c2320 = this.f6201;
        C2320 c2320M4286 = c2320.m4286(c2320Mo3768);
        if (abstractC1863 == abstractC1861) {
            abstractC1861 = abstractC1863;
        } else if (abstractC1863 != null) {
            abstractC1861 = abstractC1863.mo3770(abstractC1861);
        }
        if (abstractC1861 == abstractC1863 && c2320M4286 == c2320) {
            return this;
        }
        int size = arrayList.size();
        int iMax = Math.max(i + 1, size);
        ArrayList arrayList2 = new ArrayList(iMax);
        int i2 = 0;
        C2320 c2320Mo3769 = null;
        while (i2 < iMax) {
            if (i2 == i) {
                abstractC1862 = abstractC1861;
            } else {
                abstractC1862 = i2 < size ? (AbstractC1861) arrayList.get(i2) : null;
            }
            if (abstractC1862 != null) {
                c2320Mo3769 = c2320Mo3769 == null ? abstractC1862.mo3768() : c2320Mo3769.m4286(abstractC1862.mo3768());
            }
            arrayList2.add(abstractC1862);
            i2++;
        }
        C1862 c1862 = new C1862(c2320Mo3769, arrayList2);
        c1862.mo3013();
        return c1862;
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo3772(int i, InterfaceC3507 interfaceC3507) {
        m4109();
        this.f6201.mo3772(i, interfaceC3507);
        for (AbstractC1861 abstractC1861 : this.f6202) {
            if (abstractC1861 != null) {
                abstractC1861.mo3772(i, interfaceC3507);
            }
        }
    }

    @Override // p000.AbstractC1861
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo3773(C2581 c2581) {
        mo3772(c2581.f8205, c2581);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final C1862 m3774(C2320 c2320) {
        AbstractC1861 abstractC1861Mo3770;
        c2320.getClass();
        C2320 c2321 = this.f6201;
        C2320 c2320M4286 = c2321.m4286(c2320);
        ArrayList arrayList = this.f6202;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AbstractC1861 abstractC1861 = (AbstractC1861) arrayList.get(i);
            if (abstractC1861 != null) {
                try {
                    abstractC1861Mo3770 = abstractC1861.mo3770(c2320);
                } catch (C2766 e) {
                    e.m3004("Merging one locals against caller block ".concat(AbstractC2902.m4906(i)));
                    abstractC1861Mo3770 = null;
                }
            } else {
                abstractC1861Mo3770 = null;
            }
            z = z || abstractC1861 != abstractC1861Mo3770;
            arrayList2.add(abstractC1861Mo3770);
        }
        return (c2321 != c2320M4286 || z) ? new C1862(c2320M4286, arrayList2) : this;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final C1862 m3775(C1862 c1862) {
        C2320 c2320 = c1862.f6201;
        C2320 c2321 = this.f6201;
        C2320 c2320M4286 = c2321.m4286(c2320);
        ArrayList arrayList = this.f6202;
        int size = arrayList.size();
        ArrayList arrayList2 = c1862.f6202;
        int size2 = arrayList2.size();
        int iMax = Math.max(size, size2);
        ArrayList arrayList3 = new ArrayList(iMax);
        int i = 0;
        boolean z = false;
        while (i < iMax) {
            AbstractC1861 abstractC1861Mo3770 = null;
            AbstractC1861 abstractC1861 = i < size ? (AbstractC1861) arrayList.get(i) : null;
            AbstractC1861 abstractC1862 = i < size2 ? (AbstractC1861) arrayList2.get(i) : null;
            if (abstractC1861 == abstractC1862) {
                abstractC1861Mo3770 = abstractC1861;
            } else if (abstractC1861 == null) {
                abstractC1861Mo3770 = abstractC1862;
            } else if (abstractC1862 == null) {
                abstractC1861Mo3770 = abstractC1861;
            } else {
                try {
                    abstractC1861Mo3770 = abstractC1861.mo3770(abstractC1862);
                } catch (C2766 e) {
                    e.m3004("Merging locals set for caller block ".concat(AbstractC2902.m4906(i)));
                }
            }
            z = z || abstractC1861 != abstractC1861Mo3770;
            arrayList3.add(abstractC1861Mo3770);
            i++;
        }
        return (c2321 != c2320M4286 || z) ? new C1862(c2320M4286, arrayList3) : this;
    }

    public C1862(C2320 c2320, ArrayList arrayList) {
        super(c2320.f7501.length > 0);
        this.f6201 = c2320;
        this.f6202 = arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1862(C1862 c1862) {
        InterfaceC3507[] interfaceC3507Arr = c1862.f6201.f7501;
        super(interfaceC3507Arr.length > 0);
        C2320 c2320 = new C2320(interfaceC3507Arr.length);
        System.arraycopy(interfaceC3507Arr, 0, c2320.f7501, 0, interfaceC3507Arr.length);
        this.f6201 = c2320;
        this.f6202 = new ArrayList(c1862.f6202.size());
        int size = c1862.f6202.size();
        for (int i = 0; i < size; i++) {
            AbstractC1861 abstractC1861 = (AbstractC1861) c1862.f6202.get(i);
            if (abstractC1861 == null) {
                this.f6202.add(null);
            } else {
                this.f6202.add(abstractC1861.mo3766());
            }
        }
    }
}
