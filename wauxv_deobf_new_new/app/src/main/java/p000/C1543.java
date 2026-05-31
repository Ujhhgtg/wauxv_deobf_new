package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲁᤝᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1543 extends AbstractC3700 {
    @Override // p000.InterfaceC1015
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2100(InterfaceC1015 interfaceC1015) {
        C0342 c0342 = (C0342) this.f11536;
        int i = c0342.f1714;
        C1017 c1017 = this.f11542;
        Iterator it = c1017.f3719.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C1017) it.next()).f3714;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c1017.mo2712(i3 + c0342.f1716);
        } else {
            c1017.mo2712(i2 + c0342.f1716);
        }
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2101() {
        C0792 c0792 = this.f11536;
        if (c0792 instanceof C0342) {
            C1017 c1017 = this.f11542;
            c1017.f3709 = true;
            ArrayList arrayList = c1017.f3719;
            C0342 c0342 = (C0342) c0792;
            int i = c0342.f1714;
            boolean z = c0342.f1715;
            int i2 = 0;
            if (i == 0) {
                c1017.f3712 = 4;
                while (i2 < c0342.f5399) {
                    C0792 c0793 = c0342.f5398[i2];
                    if (z || c0793.f3132 != 8) {
                        C1017 c1018 = c0793.f3083.f11542;
                        c1018.f3718.add(c1017);
                        arrayList.add(c1018);
                    }
                    i2++;
                }
                m3438(this.f11536.f3083.f11542);
                m3438(this.f11536.f3083.f11543);
                return;
            }
            if (i == 1) {
                c1017.f3712 = 5;
                while (i2 < c0342.f5399) {
                    C0792 c0794 = c0342.f5398[i2];
                    if (z || c0794.f3132 != 8) {
                        C1017 c1019 = c0794.f3083.f11543;
                        c1019.f3718.add(c1017);
                        arrayList.add(c1019);
                    }
                    i2++;
                }
                m3438(this.f11536.f3083.f11542);
                m3438(this.f11536.f3083.f11543);
                return;
            }
            if (i == 2) {
                c1017.f3712 = 6;
                while (i2 < c0342.f5399) {
                    C0792 c0795 = c0342.f5398[i2];
                    if (z || c0795.f3132 != 8) {
                        C1017 c10110 = c0795.f3084.f11542;
                        c10110.f3718.add(c1017);
                        arrayList.add(c10110);
                    }
                    i2++;
                }
                m3438(this.f11536.f3084.f11542);
                m3438(this.f11536.f3084.f11543);
                return;
            }
            if (i != 3) {
                return;
            }
            c1017.f3712 = 7;
            while (i2 < c0342.f5399) {
                C0792 c0796 = c0342.f5398[i2];
                if (z || c0796.f3132 != 8) {
                    C1017 c10111 = c0796.f3084.f11543;
                    c10111.f3718.add(c1017);
                    arrayList.add(c10111);
                }
                i2++;
            }
            m3438(this.f11536.f3084.f11542);
            m3438(this.f11536.f3084.f11543);
        }
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2102() {
        C0792 c0792 = this.f11536;
        if (c0792 instanceof C0342) {
            int i = ((C0342) c0792).f1714;
            C1017 c1017 = this.f11542;
            if (i == 0 || i == 1) {
                c0792.f3124 = c1017.f3714;
            } else {
                c0792.f3125 = c1017.f3714;
            }
        }
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2103() {
        this.f11537 = null;
        this.f11542.m2711();
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo2105() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3438(C1017 c1017) {
        C1017 c1018 = this.f11542;
        c1018.f3718.add(c1017);
        c1017.f3719.add(c1018);
    }
}
