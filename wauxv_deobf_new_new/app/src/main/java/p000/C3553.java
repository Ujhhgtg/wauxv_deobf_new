package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᲀᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3553 extends AbstractC2302 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final EnumC1701 f11147;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final ArrayList f11148;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3553(EnumC1701 enumC1701, ArrayList arrayList) {
        int iM5107 = m5107(arrayList);
        AbstractC2302 abstractC2302 = (AbstractC2302) arrayList.get(0);
        super(iM5107, m5107(arrayList) + (abstractC2302.mo2016() * arrayList.size()));
        if (enumC1701 == null) {
            throw new NullPointerException("itemType == null");
        }
        this.f11148 = arrayList;
        this.f11147 = enumC1701;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static int m5107(ArrayList arrayList) {
        try {
            return Math.max(4, ((AbstractC2302) arrayList.get(0)).f7488);
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C3553.class.getName());
        sb.append(this.f11148);
        return sb.toString();
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        Iterator it = this.f11148.iterator();
        while (it.hasNext()) {
            ((AbstractC2302) it.next()).mo1367(c1026);
        }
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return this.f11147;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1370(C2017 c2017, int i) {
        int iM4281 = i + this.f7488;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        for (AbstractC2302 abstractC2302 : this.f11148) {
            int iMo2016 = abstractC2302.mo2016();
            int i4 = abstractC2302.f7488;
            if (z) {
                z = false;
                i2 = iMo2016;
                i3 = i4;
            } else {
                if (iMo2016 != i2) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (i4 != i3) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            }
            iM4281 = abstractC2302.m4281(c2017, iM4281) + iMo2016;
        }
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1371(C1026 c1026, C0496 c0496) {
        ArrayList arrayList = this.f11148;
        int size = arrayList.size();
        if (c0496.m1927()) {
            c0496.m1925(0, m4280() + " " + this.f11147.f5781);
            c0496.m1925(4, "  size: ".concat(AbstractC2902.m4907(size)));
        }
        c0496.m1933(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2302) it.next()).mo2017(c1026, c0496);
        }
    }
}
