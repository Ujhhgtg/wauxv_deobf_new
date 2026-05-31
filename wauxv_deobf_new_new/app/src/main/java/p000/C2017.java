package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲈᛸᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2017 extends AbstractC2704 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0179 f6702 = new C0179(14);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ArrayList f6703;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final HashMap f6704;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f6705;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f6706;

    public C2017(String str, C1026 c1026, int i, int i2) {
        super(str, c1026, i);
        this.f6703 = new ArrayList(100);
        this.f6704 = new HashMap(100);
        this.f6705 = i2;
        this.f6706 = -1;
    }

    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int mo4044(AbstractC1690 abstractC1690) {
        return ((AbstractC2302) abstractC1690).m4279();
    }

    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Collection mo2018() {
        return this.f6703;
    }

    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo4045() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6703;
            int size = arrayList.size();
            if (i >= size) {
                return;
            }
            while (i < size) {
                ((AbstractC2302) arrayList.get(i)).mo1367(this.f8699);
                i++;
            }
        }
    }

    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int mo4046() {
        m4671();
        return this.f6706;
    }

    @Override // p000.AbstractC2704
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void mo4047(C0496 c0496) {
        boolean zM1927 = c0496.m1927();
        boolean z = true;
        int iMo2016 = 0;
        for (AbstractC2302 abstractC2302 : this.f6703) {
            if (zM1927) {
                if (z) {
                    z = false;
                } else {
                    c0496.m1925(0, "\n");
                }
            }
            int i = abstractC2302.f7488 - 1;
            int i2 = (~i) & (iMo2016 + i);
            if (iMo2016 != i2) {
                c0496.m1937(i2 - iMo2016);
                iMo2016 = i2;
            }
            abstractC2302.mo2017(this.f8699, c0496);
            iMo2016 += abstractC2302.mo2016();
        }
        if (iMo2016 != this.f6706) {
            throw new RuntimeException("output size mismatch");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m4048(AbstractC2302 abstractC2302) {
        m4672();
        try {
            if (abstractC2302.f7488 > this.f8700) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f6703.add(abstractC2302);
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final synchronized AbstractC2302 m4049(AbstractC2302 abstractC2302) {
        m4672();
        AbstractC2302 abstractC2303 = (AbstractC2302) this.f6704.get(abstractC2302);
        if (abstractC2303 != null) {
            return abstractC2303;
        }
        m4048(abstractC2302);
        this.f6704.put(abstractC2302, abstractC2302);
        return abstractC2302;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m4050() {
        m4671();
        int iM4792 = AbstractC2844.m4792(this.f6705);
        ArrayList arrayList = this.f6703;
        if (iM4792 == 1) {
            Collections.sort(arrayList, f6702);
        } else if (iM4792 == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int iMo2016 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC2302 abstractC2302 = (AbstractC2302) arrayList.get(i);
            try {
                int iM4281 = abstractC2302.m4281(this, iMo2016);
                if (iM4281 < iMo2016) {
                    throw new RuntimeException("bogus place() result for " + abstractC2302);
                }
                iMo2016 = abstractC2302.mo2016() + iM4281;
            } catch (RuntimeException e) {
                throw C1240.m3003("...while placing " + abstractC2302, e);
            }
        }
        this.f6706 = iMo2016;
    }
}
