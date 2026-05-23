package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᲈᲁᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1531 extends AbstractC3640 {
    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2003(InterfaceC1012 interfaceC1012) {
        C0367 c0367 = (C0367) this.f11387;
        int i = c0367.f1743;
        C1014 c1014 = this.f11393;
        Iterator it = c1014.f3712.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C1014) it.next()).f3707;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c1014.mo2588(i3 + c0367.f1745);
        } else {
            c1014.mo2588(i2 + c0367.f1745);
        }
    }

    @Override // p000.AbstractC3640
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2004() {
        C0793 c0793 = this.f11387;
        if (c0793 instanceof C0367) {
            C1014 c1014 = this.f11393;
            c1014.f3702 = true;
            ArrayList arrayList = c1014.f3712;
            C0367 c0367 = (C0367) c0793;
            int i = c0367.f1743;
            boolean z = c0367.f1744;
            int i2 = 0;
            if (i == 0) {
                c1014.f3705 = 4;
                while (i2 < c0367.f5368) {
                    C0793 c0794 = c0367.f5367[i2];
                    if (z || c0794.f3125 != 8) {
                        C1014 c1015 = c0794.f3076.f11393;
                        c1015.f3711.add(c1014);
                        arrayList.add(c1015);
                    }
                    i2++;
                }
                m3257(this.f11387.f3076.f11393);
                m3257(this.f11387.f3076.f11394);
                return;
            }
            if (i == 1) {
                c1014.f3705 = 5;
                while (i2 < c0367.f5368) {
                    C0793 c0795 = c0367.f5367[i2];
                    if (z || c0795.f3125 != 8) {
                        C1014 c1016 = c0795.f3076.f11394;
                        c1016.f3711.add(c1014);
                        arrayList.add(c1016);
                    }
                    i2++;
                }
                m3257(this.f11387.f3076.f11393);
                m3257(this.f11387.f3076.f11394);
                return;
            }
            if (i == 2) {
                c1014.f3705 = 6;
                while (i2 < c0367.f5368) {
                    C0793 c0796 = c0367.f5367[i2];
                    if (z || c0796.f3125 != 8) {
                        C1014 c1017 = c0796.f3077.f11393;
                        c1017.f3711.add(c1014);
                        arrayList.add(c1017);
                    }
                    i2++;
                }
                m3257(this.f11387.f3077.f11393);
                m3257(this.f11387.f3077.f11394);
                return;
            }
            if (i != 3) {
                return;
            }
            c1014.f3705 = 7;
            while (i2 < c0367.f5368) {
                C0793 c0797 = c0367.f5367[i2];
                if (z || c0797.f3125 != 8) {
                    C1014 c1018 = c0797.f3077.f11394;
                    c1018.f3711.add(c1014);
                    arrayList.add(c1018);
                }
                i2++;
            }
            m3257(this.f11387.f3077.f11393);
            m3257(this.f11387.f3077.f11394);
        }
    }

    @Override // p000.AbstractC3640
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2005() {
        C0793 c0793 = this.f11387;
        if (c0793 instanceof C0367) {
            int i = ((C0367) c0793).f1743;
            C1014 c1014 = this.f11393;
            if (i == 0 || i == 1) {
                c0793.f3117 = c1014.f3707;
            } else {
                c0793.f3118 = c1014.f3707;
            }
        }
    }

    @Override // p000.AbstractC3640
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2006() {
        this.f11388 = null;
        this.f11393.m2587();
    }

    @Override // p000.AbstractC3640
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo2008() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m3257(C1014 c1014) {
        C1014 c1015 = this.f11393;
        c1015.f3711.add(c1014);
        c1014.f3712.add(c1015);
    }
}
