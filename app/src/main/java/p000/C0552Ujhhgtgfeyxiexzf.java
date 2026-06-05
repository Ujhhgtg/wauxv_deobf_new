package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛲᛱfeyxiexzfᛱ要点脸ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0552Ujhhgtgfeyxiexzf extends AbstractC2229feyxiexzfUjhhgtg {
    @Override // p000.InterfaceC3257feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1820Ujhhgtgfeyxiexzf(InterfaceC3257feyxiexzfUjhhgtg interfaceC3257feyxiexzfUjhhgtg) {
        C2480feyxiexzfUjhhgtg c2480feyxiexzfUjhhgtg = (C2480feyxiexzfUjhhgtg) this.f7255Ujhhgtgfeyxiexzf;
        int i = c2480feyxiexzfUjhhgtg.f8107Ujhhgtgfeyxiexzf;
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg = this.f7261Ujhhgtgfeyxiexzf;
        Iterator it = c3259feyxiexzfUjhhgtg.f10235Ujhhgtgfeyxiexzf.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C3259feyxiexzfUjhhgtg) it.next()).f10230Ujhhgtgfeyxiexzf;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c3259feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(i3 + c2480feyxiexzfUjhhgtg.f8109Ujhhgtgfeyxiexzf);
        } else {
            c3259feyxiexzfUjhhgtg.mo4674Ujhhgtgfeyxiexzf(i2 + c2480feyxiexzfUjhhgtg.f8109Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1821Ujhhgtgfeyxiexzf() {
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = this.f7255Ujhhgtgfeyxiexzf;
        if (c3655Ujhhgtgfeyxiexzf instanceof C2480feyxiexzfUjhhgtg) {
            C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg = this.f7261Ujhhgtgfeyxiexzf;
            c3259feyxiexzfUjhhgtg.f10225Ujhhgtgfeyxiexzf = true;
            ArrayList arrayList = c3259feyxiexzfUjhhgtg.f10235Ujhhgtgfeyxiexzf;
            C2480feyxiexzfUjhhgtg c2480feyxiexzfUjhhgtg = (C2480feyxiexzfUjhhgtg) c3655Ujhhgtgfeyxiexzf;
            int i = c2480feyxiexzfUjhhgtg.f8107Ujhhgtgfeyxiexzf;
            boolean z = c2480feyxiexzfUjhhgtg.f8108feyxiexzfUjhhgtg;
            int i2 = 0;
            if (i == 0) {
                c3259feyxiexzfUjhhgtg.f10228Ujhhgtgfeyxiexzf = 4;
                while (i2 < c2480feyxiexzfUjhhgtg.f2540feyxiexzfUjhhgtg) {
                    C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2 = c2480feyxiexzfUjhhgtg.f2539feyxiexzfUjhhgtg[i2];
                    if (z || c3655Ujhhgtgfeyxiexzf2.f11622Ujhhgtgfeyxiexzf != 8) {
                        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg2 = c3655Ujhhgtgfeyxiexzf2.f11573Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf;
                        c3259feyxiexzfUjhhgtg2.f10234Ujhhgtgfeyxiexzf.add(c3259feyxiexzfUjhhgtg);
                        arrayList.add(c3259feyxiexzfUjhhgtg2);
                    }
                    i2++;
                }
                m1838Ujhhgtgfeyxiexzf(this.f7255Ujhhgtgfeyxiexzf.f11573Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf);
                m1838Ujhhgtgfeyxiexzf(this.f7255Ujhhgtgfeyxiexzf.f11573Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf);
                return;
            }
            if (i == 1) {
                c3259feyxiexzfUjhhgtg.f10228Ujhhgtgfeyxiexzf = 5;
                while (i2 < c2480feyxiexzfUjhhgtg.f2540feyxiexzfUjhhgtg) {
                    C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf3 = c2480feyxiexzfUjhhgtg.f2539feyxiexzfUjhhgtg[i2];
                    if (z || c3655Ujhhgtgfeyxiexzf3.f11622Ujhhgtgfeyxiexzf != 8) {
                        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg3 = c3655Ujhhgtgfeyxiexzf3.f11573Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf;
                        c3259feyxiexzfUjhhgtg3.f10234Ujhhgtgfeyxiexzf.add(c3259feyxiexzfUjhhgtg);
                        arrayList.add(c3259feyxiexzfUjhhgtg3);
                    }
                    i2++;
                }
                m1838Ujhhgtgfeyxiexzf(this.f7255Ujhhgtgfeyxiexzf.f11573Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf);
                m1838Ujhhgtgfeyxiexzf(this.f7255Ujhhgtgfeyxiexzf.f11573Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf);
                return;
            }
            if (i == 2) {
                c3259feyxiexzfUjhhgtg.f10228Ujhhgtgfeyxiexzf = 6;
                while (i2 < c2480feyxiexzfUjhhgtg.f2540feyxiexzfUjhhgtg) {
                    C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf4 = c2480feyxiexzfUjhhgtg.f2539feyxiexzfUjhhgtg[i2];
                    if (z || c3655Ujhhgtgfeyxiexzf4.f11622Ujhhgtgfeyxiexzf != 8) {
                        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg4 = c3655Ujhhgtgfeyxiexzf4.f11574Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf;
                        c3259feyxiexzfUjhhgtg4.f10234Ujhhgtgfeyxiexzf.add(c3259feyxiexzfUjhhgtg);
                        arrayList.add(c3259feyxiexzfUjhhgtg4);
                    }
                    i2++;
                }
                m1838Ujhhgtgfeyxiexzf(this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf);
                m1838Ujhhgtgfeyxiexzf(this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf);
                return;
            }
            if (i != 3) {
                return;
            }
            c3259feyxiexzfUjhhgtg.f10228Ujhhgtgfeyxiexzf = 7;
            while (i2 < c2480feyxiexzfUjhhgtg.f2540feyxiexzfUjhhgtg) {
                C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf5 = c2480feyxiexzfUjhhgtg.f2539feyxiexzfUjhhgtg[i2];
                if (z || c3655Ujhhgtgfeyxiexzf5.f11622Ujhhgtgfeyxiexzf != 8) {
                    C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg5 = c3655Ujhhgtgfeyxiexzf5.f11574Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf;
                    c3259feyxiexzfUjhhgtg5.f10234Ujhhgtgfeyxiexzf.add(c3259feyxiexzfUjhhgtg);
                    arrayList.add(c3259feyxiexzfUjhhgtg5);
                }
                i2++;
            }
            m1838Ujhhgtgfeyxiexzf(this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7261Ujhhgtgfeyxiexzf);
            m1838Ujhhgtgfeyxiexzf(this.f7255Ujhhgtgfeyxiexzf.f11574Ujhhgtgfeyxiexzf.f7262Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo1822Ujhhgtgfeyxiexzf() {
        C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = this.f7255Ujhhgtgfeyxiexzf;
        if (c3655Ujhhgtgfeyxiexzf instanceof C2480feyxiexzfUjhhgtg) {
            int i = ((C2480feyxiexzfUjhhgtg) c3655Ujhhgtgfeyxiexzf).f8107Ujhhgtgfeyxiexzf;
            C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg = this.f7261Ujhhgtgfeyxiexzf;
            if (i == 0 || i == 1) {
                c3655Ujhhgtgfeyxiexzf.f11614feyxiexzfUjhhgtg = c3259feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf;
            } else {
                c3655Ujhhgtgfeyxiexzf.f11615feyxiexzfUjhhgtg = c3259feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf;
            }
        }
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo1823Ujhhgtgfeyxiexzf() {
        this.f7256Ujhhgtgfeyxiexzf = null;
        this.f7261Ujhhgtgfeyxiexzf.m4768Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC2229feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final boolean mo1824Ujhhgtgfeyxiexzf() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m1838Ujhhgtgfeyxiexzf(C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg) {
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg2 = this.f7261Ujhhgtgfeyxiexzf;
        c3259feyxiexzfUjhhgtg2.f10234Ujhhgtgfeyxiexzf.add(c3259feyxiexzfUjhhgtg);
        c3259feyxiexzfUjhhgtg.f10235Ujhhgtgfeyxiexzf.add(c3259feyxiexzfUjhhgtg2);
    }
}
