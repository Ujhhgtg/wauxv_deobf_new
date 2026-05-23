package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲁᛸᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1835 extends AbstractC1834 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2287 f6126;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ArrayList f6127;

    public C1835(int i) {
        super(i != 0);
        this.f6126 = new C2287(i);
        this.f6127 = new ArrayList();
    }

    @Override // p000.InterfaceC3407
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1214() {
        StringBuilder sb = new StringBuilder("(locals array set; primary)\n");
        sb.append(this.f6126.mo1214());
        sb.append('\n');
        ArrayList arrayList = this.f6127;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1834 abstractC1834 = (AbstractC1834) arrayList.get(i);
            if (abstractC1834 != null) {
                sb.append("(locals array set: primary for caller " + AbstractC1460.m3223(i) + ")\n");
                sb.append(abstractC1834.mo3590().mo1214());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    @Override // p000.AbstractC2106
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo2894() {
        this.f6126.f6944 = false;
        for (AbstractC1834 abstractC1834 : this.f6127) {
            if (abstractC1834 != null) {
                abstractC1834.mo2894();
            }
        }
        this.f6944 = false;
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo3587(C2704 c2704) {
        c2704.m2885("(locals array set; primary)");
        this.f6126.mo3587(c2704);
        ArrayList arrayList = this.f6127;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1834 abstractC1834 = (AbstractC1834) arrayList.get(i);
            if (abstractC1834 != null) {
                c2704.m2885("(locals array set: primary for caller " + AbstractC1460.m3223(i) + ')');
                abstractC1834.mo3590().mo3587(c2704);
            }
        }
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final AbstractC1834 mo3588() {
        return new C1835(this);
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final InterfaceC3450 mo3589(int i) {
        return this.f6126.mo3589(i);
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final C2287 mo3590() {
        return this.f6126;
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo3591(C3448 c3448) {
        C2287 c2287 = this.f6126;
        if (c2287.f7379.length == 0) {
            return;
        }
        m3925();
        c2287.mo3591(c3448);
        for (AbstractC1834 abstractC1834 : this.f6127) {
            if (abstractC1834 != null) {
                abstractC1834.mo3591(c3448);
            }
        }
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final AbstractC1834 mo3592(AbstractC1834 abstractC1834) {
        try {
            C1835 c1835M3597 = abstractC1834 instanceof C1835 ? m3597((C1835) abstractC1834) : m3596((C2287) abstractC1834);
            c1835M3597.mo2894();
            return c1835M3597;
        } catch (C2704 e) {
            e.m2885("underlay locals:");
            mo3587(e);
            e.m2885("overlay locals:");
            abstractC1834.mo3587(e);
            throw e;
        }
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final C1835 mo3593(AbstractC1834 abstractC1834, int i) {
        AbstractC1834 abstractC1835;
        ArrayList arrayList = this.f6127;
        AbstractC1834 abstractC1836 = i >= arrayList.size() ? null : (AbstractC1834) arrayList.get(i);
        C2287 c2287Mo3590 = abstractC1834.mo3590();
        C2287 c2287 = this.f6126;
        C2287 c2287M4157 = c2287.m4157(c2287Mo3590);
        if (abstractC1836 == abstractC1834) {
            abstractC1834 = abstractC1836;
        } else if (abstractC1836 != null) {
            abstractC1834 = abstractC1836.mo3592(abstractC1834);
        }
        if (abstractC1834 == abstractC1836 && c2287M4157 == c2287) {
            return this;
        }
        int size = arrayList.size();
        int iMax = Math.max(i + 1, size);
        ArrayList arrayList2 = new ArrayList(iMax);
        int i2 = 0;
        C2287 c2287Mo3591 = null;
        while (i2 < iMax) {
            if (i2 == i) {
                abstractC1835 = abstractC1834;
            } else {
                abstractC1835 = i2 < size ? (AbstractC1834) arrayList.get(i2) : null;
            }
            if (abstractC1835 != null) {
                c2287Mo3591 = c2287Mo3591 == null ? abstractC1835.mo3590() : c2287Mo3591.m4157(abstractC1835.mo3590());
            }
            arrayList2.add(abstractC1835);
            i2++;
        }
        C1835 c1835 = new C1835(c2287Mo3591, arrayList2);
        c1835.mo2894();
        return c1835;
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final void mo3594(int i, InterfaceC3450 interfaceC3450) {
        m3925();
        this.f6126.mo3594(i, interfaceC3450);
        for (AbstractC1834 abstractC1834 : this.f6127) {
            if (abstractC1834 != null) {
                abstractC1834.mo3594(i, interfaceC3450);
            }
        }
    }

    @Override // p000.AbstractC1834
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo3595(C2525 c2525) {
        mo3594(c2525.f8055, c2525);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final C1835 m3596(C2287 c2287) {
        AbstractC1834 abstractC1834Mo3592;
        c2287.getClass();
        C2287 c2288 = this.f6126;
        C2287 c2287M4157 = c2288.m4157(c2287);
        ArrayList arrayList = this.f6127;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AbstractC1834 abstractC1834 = (AbstractC1834) arrayList.get(i);
            if (abstractC1834 != null) {
                try {
                    abstractC1834Mo3592 = abstractC1834.mo3592(c2287);
                } catch (C2704 e) {
                    e.m2885("Merging one locals against caller block ".concat(AbstractC1460.m3223(i)));
                    abstractC1834Mo3592 = null;
                }
            } else {
                abstractC1834Mo3592 = null;
            }
            z = z || abstractC1834 != abstractC1834Mo3592;
            arrayList2.add(abstractC1834Mo3592);
        }
        return (c2288 != c2287M4157 || z) ? new C1835(c2287M4157, arrayList2) : this;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final C1835 m3597(C1835 c1835) {
        C2287 c2287 = c1835.f6126;
        C2287 c2288 = this.f6126;
        C2287 c2287M4157 = c2288.m4157(c2287);
        ArrayList arrayList = this.f6127;
        int size = arrayList.size();
        ArrayList arrayList2 = c1835.f6127;
        int size2 = arrayList2.size();
        int iMax = Math.max(size, size2);
        ArrayList arrayList3 = new ArrayList(iMax);
        int i = 0;
        boolean z = false;
        while (i < iMax) {
            AbstractC1834 abstractC1834Mo3592 = null;
            AbstractC1834 abstractC1834 = i < size ? (AbstractC1834) arrayList.get(i) : null;
            AbstractC1834 abstractC1835 = i < size2 ? (AbstractC1834) arrayList2.get(i) : null;
            if (abstractC1834 == abstractC1835) {
                abstractC1834Mo3592 = abstractC1834;
            } else if (abstractC1834 == null) {
                abstractC1834Mo3592 = abstractC1835;
            } else if (abstractC1835 == null) {
                abstractC1834Mo3592 = abstractC1834;
            } else {
                try {
                    abstractC1834Mo3592 = abstractC1834.mo3592(abstractC1835);
                } catch (C2704 e) {
                    e.m2885("Merging locals set for caller block ".concat(AbstractC1460.m3223(i)));
                }
            }
            z = z || abstractC1834 != abstractC1834Mo3592;
            arrayList3.add(abstractC1834Mo3592);
            i++;
        }
        return (c2288 != c2287M4157 || z) ? new C1835(c2287M4157, arrayList3) : this;
    }

    public C1835(C2287 c2287, ArrayList arrayList) {
        super(c2287.f7379.length > 0);
        this.f6126 = c2287;
        this.f6127 = arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1835(C1835 c1835) {
        InterfaceC3450[] interfaceC3450Arr = c1835.f6126.f7379;
        super(interfaceC3450Arr.length > 0);
        C2287 c2287 = new C2287(interfaceC3450Arr.length);
        System.arraycopy(interfaceC3450Arr, 0, c2287.f7379, 0, interfaceC3450Arr.length);
        this.f6126 = c2287;
        this.f6127 = new ArrayList(c1835.f6127.size());
        int size = c1835.f6127.size();
        for (int i = 0; i < size; i++) {
            AbstractC1834 abstractC1834 = (AbstractC1834) c1835.f6127.get(i);
            if (abstractC1834 == null) {
                this.f6127.add(null);
            } else {
                this.f6127.add(abstractC1834.mo3588());
            }
        }
    }
}
