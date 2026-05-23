package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1986 extends AbstractC2643 {

    public static final C0171 f6597 = new C0171(10);

    public final ArrayList f6598;

    public final HashMap f6599;

    public final int f6600;

    public int f6601;

    public C1986(String str, C1023 c1023, int i, int i2) {
        super(str, c1023, i);
        this.f6598 = new ArrayList(100);
        this.f6599 = new HashMap(100);
        this.f6600 = i2;
        this.f6601 = -1;
    }

    @Override // p000.AbstractC2643
    public final int mo3850(AbstractC1675 abstractC1675) {
        return ((AbstractC2270) abstractC1675).m4150();
    }

    @Override // p000.AbstractC2643
    public final Collection mo1923() {
        return this.f6598;
    }

    @Override // p000.AbstractC2643
    public final void mo3851() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6598;
            int size = arrayList.size();
            if (i >= size) {
                return;
            }
            while (i < size) {
                ((AbstractC2270) arrayList.get(i)).mo1221(this.f8534);
                i++;
            }
        }
    }

    @Override // p000.AbstractC2643
    public final int mo3852() {
        m4637();
        return this.f6601;
    }

    @Override // p000.AbstractC2643
    public final void mo3853(C0519 c0519) {
        boolean zM1833 = c0519.m1833();
        boolean z = true;
        int iMo1921 = 0;
        for (AbstractC2270 abstractC2270 : this.f6598) {
            if (zM1833) {
                if (z) {
                    z = false;
                } else {
                    c0519.m1831(0, "\n");
                }
            }
            int i = abstractC2270.f7367 - 1;
            int i2 = (~i) & (iMo1921 + i);
            if (iMo1921 != i2) {
                c0519.m1843(i2 - iMo1921);
                iMo1921 = i2;
            }
            abstractC2270.mo1922(this.f8534, c0519);
            iMo1921 += abstractC2270.mo1921();
        }
        if (iMo1921 != this.f6601) {
            throw new RuntimeException("output size mismatch");
        }
    }

    public final void m3854(AbstractC2270 abstractC2270) {
        m4638();
        try {
            if (abstractC2270.f7367 > this.f8535) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f6598.add(abstractC2270);
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    public final synchronized AbstractC2270 m3855(AbstractC2270 abstractC2270) {
        m4638();
        AbstractC2270 abstractC2271 = (AbstractC2270) this.f6599.get(abstractC2270);
        if (abstractC2271 != null) {
            return abstractC2271;
        }
        m3854(abstractC2270);
        this.f6599.put(abstractC2270, abstractC2270);
        return abstractC2270;
    }

    public final void m3856() {
        m4637();
        int iM4759 = AbstractC2784.m4759(this.f6600);
        ArrayList arrayList = this.f6598;
        if (iM4759 == 1) {
            Collections.sort(arrayList, f6597);
        } else if (iM4759 == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int iMo1921 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC2270 abstractC2270 = (AbstractC2270) arrayList.get(i);
            try {
                int iM4152 = abstractC2270.m4152(this, iMo1921);
                if (iM4152 < iMo1921) {
                    throw new RuntimeException("bogus place() result for " + abstractC2270);
                }
                iMo1921 = abstractC2270.mo1921() + iM4152;
            } catch (RuntimeException e) {
                throw C1238.m2884("...while placing " + abstractC2270, e);
            }
        }
        this.f6601 = iMo1921;
    }
}
