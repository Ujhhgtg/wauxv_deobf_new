package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ能不能ᛳᛱfeyxiexzfᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0242Ujhhgtgfeyxiexzf extends AbstractC0246Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C1326feyxiexzfUjhhgtg f1573Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final ArrayList f1574Ujhhgtgfeyxiexzf;

    public C0242Ujhhgtgfeyxiexzf(int i) {
        super(i != 0);
        this.f1573Ujhhgtgfeyxiexzf = new C1326feyxiexzfUjhhgtg(i);
        this.f1574Ujhhgtgfeyxiexzf = new ArrayList();
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        StringBuilder sb = new StringBuilder("(locals array set; primary)\n");
        sb.append(this.f1573Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
        sb.append('\n');
        ArrayList arrayList = this.f1574Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf = (AbstractC0246Ujhhgtgfeyxiexzf) arrayList.get(i);
            if (abstractC0246Ujhhgtgfeyxiexzf != null) {
                sb.append("(locals array set: primary for caller " + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i) + ")\n");
                sb.append(abstractC0246Ujhhgtgfeyxiexzf.mo1397Ujhhgtgfeyxiexzf().mo1392Ujhhgtgfeyxiexzf());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    @Override // p000.AbstractC0417Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void mo1393Ujhhgtgfeyxiexzf() {
        this.f1573Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
        for (AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf : this.f1574Ujhhgtgfeyxiexzf) {
            if (abstractC0246Ujhhgtgfeyxiexzf != null) {
                abstractC0246Ujhhgtgfeyxiexzf.mo1393Ujhhgtgfeyxiexzf();
            }
        }
        this.f2247Ujhhgtgfeyxiexzf = false;
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void mo1394Ujhhgtgfeyxiexzf(C1045feyxiexzfUjhhgtg c1045feyxiexzfUjhhgtg) {
        c1045feyxiexzfUjhhgtg.m4861Ujhhgtgfeyxiexzf("(locals array set; primary)");
        this.f1573Ujhhgtgfeyxiexzf.mo1394Ujhhgtgfeyxiexzf(c1045feyxiexzfUjhhgtg);
        ArrayList arrayList = this.f1574Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf = (AbstractC0246Ujhhgtgfeyxiexzf) arrayList.get(i);
            if (abstractC0246Ujhhgtgfeyxiexzf != null) {
                c1045feyxiexzfUjhhgtg.m4861Ujhhgtgfeyxiexzf("(locals array set: primary for caller " + AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i) + ')');
                abstractC0246Ujhhgtgfeyxiexzf.mo1397Ujhhgtgfeyxiexzf().mo1394Ujhhgtgfeyxiexzf(c1045feyxiexzfUjhhgtg);
            }
        }
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final AbstractC0246Ujhhgtgfeyxiexzf mo1395Ujhhgtgfeyxiexzf() {
        return new C0242Ujhhgtgfeyxiexzf(this);
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final InterfaceC1793feyxiexzfUjhhgtg mo1396Ujhhgtgfeyxiexzf(int i) {
        return this.f1573Ujhhgtgfeyxiexzf.mo1396Ujhhgtgfeyxiexzf(i);
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final C1326feyxiexzfUjhhgtg mo1397Ujhhgtgfeyxiexzf() {
        return this.f1573Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void mo1398Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg = this.f1573Ujhhgtgfeyxiexzf;
        if (c1326feyxiexzfUjhhgtg.f4804Ujhhgtgfeyxiexzf.length == 0) {
            return;
        }
        m1729Ujhhgtgfeyxiexzf();
        c1326feyxiexzfUjhhgtg.mo1398Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtg);
        for (AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf : this.f1574Ujhhgtgfeyxiexzf) {
            if (abstractC0246Ujhhgtgfeyxiexzf != null) {
                abstractC0246Ujhhgtgfeyxiexzf.mo1398Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtg);
            }
        }
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final AbstractC0246Ujhhgtgfeyxiexzf mo1399Ujhhgtgfeyxiexzf(AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf) {
        try {
            C0242Ujhhgtgfeyxiexzf c0242UjhhgtgfeyxiexzfM1404Ujhhgtgfeyxiexzf = abstractC0246Ujhhgtgfeyxiexzf instanceof C0242Ujhhgtgfeyxiexzf ? m1404Ujhhgtgfeyxiexzf((C0242Ujhhgtgfeyxiexzf) abstractC0246Ujhhgtgfeyxiexzf) : m1403Ujhhgtgfeyxiexzf((C1326feyxiexzfUjhhgtg) abstractC0246Ujhhgtgfeyxiexzf);
            c0242UjhhgtgfeyxiexzfM1404Ujhhgtgfeyxiexzf.mo1393Ujhhgtgfeyxiexzf();
            return c0242UjhhgtgfeyxiexzfM1404Ujhhgtgfeyxiexzf;
        } catch (C1045feyxiexzfUjhhgtg e) {
            e.m4861Ujhhgtgfeyxiexzf("underlay locals:");
            mo1394Ujhhgtgfeyxiexzf(e);
            e.m4861Ujhhgtgfeyxiexzf("overlay locals:");
            abstractC0246Ujhhgtgfeyxiexzf.mo1394Ujhhgtgfeyxiexzf(e);
            throw e;
        }
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final C0242Ujhhgtgfeyxiexzf mo1400Ujhhgtgfeyxiexzf(AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf, int i) {
        AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf2;
        ArrayList arrayList = this.f1574Ujhhgtgfeyxiexzf;
        AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf3 = i >= arrayList.size() ? null : (AbstractC0246Ujhhgtgfeyxiexzf) arrayList.get(i);
        C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtgMo1397Ujhhgtgfeyxiexzf = abstractC0246Ujhhgtgfeyxiexzf.mo1397Ujhhgtgfeyxiexzf();
        C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg = this.f1573Ujhhgtgfeyxiexzf;
        C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtgM2854Ujhhgtgfeyxiexzf = c1326feyxiexzfUjhhgtg.m2854Ujhhgtgfeyxiexzf(c1326feyxiexzfUjhhgtgMo1397Ujhhgtgfeyxiexzf);
        if (abstractC0246Ujhhgtgfeyxiexzf3 == abstractC0246Ujhhgtgfeyxiexzf) {
            abstractC0246Ujhhgtgfeyxiexzf = abstractC0246Ujhhgtgfeyxiexzf3;
        } else if (abstractC0246Ujhhgtgfeyxiexzf3 != null) {
            abstractC0246Ujhhgtgfeyxiexzf = abstractC0246Ujhhgtgfeyxiexzf3.mo1399Ujhhgtgfeyxiexzf(abstractC0246Ujhhgtgfeyxiexzf);
        }
        if (abstractC0246Ujhhgtgfeyxiexzf == abstractC0246Ujhhgtgfeyxiexzf3 && c1326feyxiexzfUjhhgtgM2854Ujhhgtgfeyxiexzf == c1326feyxiexzfUjhhgtg) {
            return this;
        }
        int size = arrayList.size();
        int iMax = Math.max(i + 1, size);
        ArrayList arrayList2 = new ArrayList(iMax);
        int i2 = 0;
        C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtgMo1397Ujhhgtgfeyxiexzf2 = null;
        while (i2 < iMax) {
            if (i2 == i) {
                abstractC0246Ujhhgtgfeyxiexzf2 = abstractC0246Ujhhgtgfeyxiexzf;
            } else {
                abstractC0246Ujhhgtgfeyxiexzf2 = i2 < size ? (AbstractC0246Ujhhgtgfeyxiexzf) arrayList.get(i2) : null;
            }
            if (abstractC0246Ujhhgtgfeyxiexzf2 != null) {
                c1326feyxiexzfUjhhgtgMo1397Ujhhgtgfeyxiexzf2 = c1326feyxiexzfUjhhgtgMo1397Ujhhgtgfeyxiexzf2 == null ? abstractC0246Ujhhgtgfeyxiexzf2.mo1397Ujhhgtgfeyxiexzf() : c1326feyxiexzfUjhhgtgMo1397Ujhhgtgfeyxiexzf2.m2854Ujhhgtgfeyxiexzf(abstractC0246Ujhhgtgfeyxiexzf2.mo1397Ujhhgtgfeyxiexzf());
            }
            arrayList2.add(abstractC0246Ujhhgtgfeyxiexzf2);
            i2++;
        }
        C0242Ujhhgtgfeyxiexzf c0242Ujhhgtgfeyxiexzf = new C0242Ujhhgtgfeyxiexzf(c1326feyxiexzfUjhhgtgMo1397Ujhhgtgfeyxiexzf2, arrayList2);
        c0242Ujhhgtgfeyxiexzf.mo1393Ujhhgtgfeyxiexzf();
        return c0242Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo1401Ujhhgtgfeyxiexzf(int i, InterfaceC1793feyxiexzfUjhhgtg interfaceC1793feyxiexzfUjhhgtg) {
        m1729Ujhhgtgfeyxiexzf();
        this.f1573Ujhhgtgfeyxiexzf.mo1401Ujhhgtgfeyxiexzf(i, interfaceC1793feyxiexzfUjhhgtg);
        for (AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf : this.f1574Ujhhgtgfeyxiexzf) {
            if (abstractC0246Ujhhgtgfeyxiexzf != null) {
                abstractC0246Ujhhgtgfeyxiexzf.mo1401Ujhhgtgfeyxiexzf(i, interfaceC1793feyxiexzfUjhhgtg);
            }
        }
    }

    @Override // p000.AbstractC0246Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void mo1402Ujhhgtgfeyxiexzf(C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg) {
        mo1401Ujhhgtgfeyxiexzf(c0961feyxiexzfUjhhgtg.f3830Ujhhgtgfeyxiexzf, c0961feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final C0242Ujhhgtgfeyxiexzf m1403Ujhhgtgfeyxiexzf(C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg) {
        AbstractC0246Ujhhgtgfeyxiexzf abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf;
        c1326feyxiexzfUjhhgtg.getClass();
        C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg2 = this.f1573Ujhhgtgfeyxiexzf;
        C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtgM2854Ujhhgtgfeyxiexzf = c1326feyxiexzfUjhhgtg2.m2854Ujhhgtgfeyxiexzf(c1326feyxiexzfUjhhgtg);
        ArrayList arrayList = this.f1574Ujhhgtgfeyxiexzf;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf = (AbstractC0246Ujhhgtgfeyxiexzf) arrayList.get(i);
            if (abstractC0246Ujhhgtgfeyxiexzf != null) {
                try {
                    abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf = abstractC0246Ujhhgtgfeyxiexzf.mo1399Ujhhgtgfeyxiexzf(c1326feyxiexzfUjhhgtg);
                } catch (C1045feyxiexzfUjhhgtg e) {
                    e.m4861Ujhhgtgfeyxiexzf("Merging one locals against caller block ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i)));
                    abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf = null;
                }
            } else {
                abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf = null;
            }
            z = z || abstractC0246Ujhhgtgfeyxiexzf != abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf;
            arrayList2.add(abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf);
        }
        return (c1326feyxiexzfUjhhgtg2 != c1326feyxiexzfUjhhgtgM2854Ujhhgtgfeyxiexzf || z) ? new C0242Ujhhgtgfeyxiexzf(c1326feyxiexzfUjhhgtgM2854Ujhhgtgfeyxiexzf, arrayList2) : this;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final C0242Ujhhgtgfeyxiexzf m1404Ujhhgtgfeyxiexzf(C0242Ujhhgtgfeyxiexzf c0242Ujhhgtgfeyxiexzf) {
        C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg = c0242Ujhhgtgfeyxiexzf.f1573Ujhhgtgfeyxiexzf;
        C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg2 = this.f1573Ujhhgtgfeyxiexzf;
        C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtgM2854Ujhhgtgfeyxiexzf = c1326feyxiexzfUjhhgtg2.m2854Ujhhgtgfeyxiexzf(c1326feyxiexzfUjhhgtg);
        ArrayList arrayList = this.f1574Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        ArrayList arrayList2 = c0242Ujhhgtgfeyxiexzf.f1574Ujhhgtgfeyxiexzf;
        int size2 = arrayList2.size();
        int iMax = Math.max(size, size2);
        ArrayList arrayList3 = new ArrayList(iMax);
        int i = 0;
        boolean z = false;
        while (i < iMax) {
            AbstractC0246Ujhhgtgfeyxiexzf abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf = null;
            AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf = i < size ? (AbstractC0246Ujhhgtgfeyxiexzf) arrayList.get(i) : null;
            AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf2 = i < size2 ? (AbstractC0246Ujhhgtgfeyxiexzf) arrayList2.get(i) : null;
            if (abstractC0246Ujhhgtgfeyxiexzf == abstractC0246Ujhhgtgfeyxiexzf2) {
                abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf = abstractC0246Ujhhgtgfeyxiexzf;
            } else if (abstractC0246Ujhhgtgfeyxiexzf == null) {
                abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf = abstractC0246Ujhhgtgfeyxiexzf2;
            } else if (abstractC0246Ujhhgtgfeyxiexzf2 == null) {
                abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf = abstractC0246Ujhhgtgfeyxiexzf;
            } else {
                try {
                    abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf = abstractC0246Ujhhgtgfeyxiexzf.mo1399Ujhhgtgfeyxiexzf(abstractC0246Ujhhgtgfeyxiexzf2);
                } catch (C1045feyxiexzfUjhhgtg e) {
                    e.m4861Ujhhgtgfeyxiexzf("Merging locals set for caller block ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i)));
                }
            }
            z = z || abstractC0246Ujhhgtgfeyxiexzf != abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf;
            arrayList3.add(abstractC0246UjhhgtgfeyxiexzfMo1399Ujhhgtgfeyxiexzf);
            i++;
        }
        return (c1326feyxiexzfUjhhgtg2 != c1326feyxiexzfUjhhgtgM2854Ujhhgtgfeyxiexzf || z) ? new C0242Ujhhgtgfeyxiexzf(c1326feyxiexzfUjhhgtgM2854Ujhhgtgfeyxiexzf, arrayList3) : this;
    }

    public C0242Ujhhgtgfeyxiexzf(C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg, ArrayList arrayList) {
        super(c1326feyxiexzfUjhhgtg.f4804Ujhhgtgfeyxiexzf.length > 0);
        this.f1573Ujhhgtgfeyxiexzf = c1326feyxiexzfUjhhgtg;
        this.f1574Ujhhgtgfeyxiexzf = arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0242Ujhhgtgfeyxiexzf(C0242Ujhhgtgfeyxiexzf c0242Ujhhgtgfeyxiexzf) {
        InterfaceC1793feyxiexzfUjhhgtg[] interfaceC1793feyxiexzfUjhhgtgArr = c0242Ujhhgtgfeyxiexzf.f1573Ujhhgtgfeyxiexzf.f4804Ujhhgtgfeyxiexzf;
        super(interfaceC1793feyxiexzfUjhhgtgArr.length > 0);
        C1326feyxiexzfUjhhgtg c1326feyxiexzfUjhhgtg = new C1326feyxiexzfUjhhgtg(interfaceC1793feyxiexzfUjhhgtgArr.length);
        System.arraycopy(interfaceC1793feyxiexzfUjhhgtgArr, 0, c1326feyxiexzfUjhhgtg.f4804Ujhhgtgfeyxiexzf, 0, interfaceC1793feyxiexzfUjhhgtgArr.length);
        this.f1573Ujhhgtgfeyxiexzf = c1326feyxiexzfUjhhgtg;
        this.f1574Ujhhgtgfeyxiexzf = new ArrayList(c0242Ujhhgtgfeyxiexzf.f1574Ujhhgtgfeyxiexzf.size());
        int size = c0242Ujhhgtgfeyxiexzf.f1574Ujhhgtgfeyxiexzf.size();
        for (int i = 0; i < size; i++) {
            AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf = (AbstractC0246Ujhhgtgfeyxiexzf) c0242Ujhhgtgfeyxiexzf.f1574Ujhhgtgfeyxiexzf.get(i);
            if (abstractC0246Ujhhgtgfeyxiexzf == null) {
                this.f1574Ujhhgtgfeyxiexzf.add(null);
            } else {
                this.f1574Ujhhgtgfeyxiexzf.add(abstractC0246Ujhhgtgfeyxiexzf.mo1395Ujhhgtgfeyxiexzf());
            }
        }
    }
}
