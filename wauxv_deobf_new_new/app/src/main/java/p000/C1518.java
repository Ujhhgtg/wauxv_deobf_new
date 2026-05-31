package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲀᤝᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1518 extends C0792 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public float f5348 = -1.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public int f5349 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public int f5350 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public C0778 f5351 = this.f3109;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public int f5352 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public boolean f5353;

    public C1518() {
        this.f3117.clear();
        this.f3117.add(this.f5351);
        int length = this.f3116.length;
        for (int i = 0; i < length; i++) {
            this.f3116[i] = this.f5351;
        }
    }

    @Override // p000.C0792
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1590(C1814 c1814, boolean z) {
        C0793 c0793 = (C0793) this.f3119;
        if (c0793 == null) {
            return;
        }
        Object objMo2426 = c0793.mo2426(2);
        Object objMo2427 = c0793.mo2426(4);
        C0792 c0792 = this.f3119;
        boolean z2 = c0792 != null && c0792.f3141[0] == 2;
        if (this.f5352 == 0) {
            objMo2426 = c0793.mo2426(3);
            objMo2427 = c0793.mo2426(5);
            C0792 c0794 = this.f3119;
            z2 = c0794 != null && c0794.f3141[1] == 2;
        }
        if (this.f5353) {
            C0778 c0778 = this.f5351;
            if (c0778.f2885) {
                C2845 c2845M3712 = c1814.m3712(c0778);
                c1814.m3705(c2845M3712, this.f5351.m2388());
                if (this.f5349 != -1) {
                    if (z2) {
                        c1814.m3707(c1814.m3712(objMo2427), c2845M3712, 0, 5);
                    }
                } else if (this.f5350 != -1 && z2) {
                    C2845 c2845M3713 = c1814.m3712(objMo2427);
                    c1814.m3707(c2845M3712, c1814.m3712(objMo2426), 0, 5);
                    c1814.m3707(c2845M3713, c2845M3712, 0, 5);
                }
                this.f5353 = false;
                return;
            }
        }
        if (this.f5349 != -1) {
            C2845 c2845M3714 = c1814.m3712(this.f5351);
            c1814.m3706(c2845M3714, c1814.m3712(objMo2426), this.f5349, 8);
            if (z2) {
                c1814.m3707(c1814.m3712(objMo2427), c2845M3714, 0, 5);
                return;
            }
            return;
        }
        if (this.f5350 != -1) {
            C2845 c2845M3715 = c1814.m3712(this.f5351);
            C2845 c2845M3716 = c1814.m3712(objMo2427);
            c1814.m3706(c2845M3715, c2845M3716, -this.f5350, 8);
            if (z2) {
                c1814.m3707(c2845M3715, c1814.m3712(objMo2426), 0, 5);
                c1814.m3707(c2845M3716, c2845M3715, 0, 5);
                return;
            }
            return;
        }
        if (this.f5348 != -1.0f) {
            C2845 c2845M3717 = c1814.m3712(this.f5351);
            C2845 c2845M3718 = c1814.m3712(objMo2427);
            float f = this.f5348;
            C0276 c0276M3713 = c1814.m3713();
            c0276M3713.f1539.m1507(c2845M3717, -1.0f);
            c0276M3713.f1539.m1507(c2845M3718, f);
            c1814.m3704(c0276M3713);
        }
    }

    @Override // p000.C0792
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final boolean mo1591() {
        return true;
    }

    @Override // p000.C0792
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final C0778 mo2426(int i) {
        switch (AbstractC2844.m4792(i)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f5352 == 1) {
                    return this.f5351;
                }
                break;
            case 2:
            case 4:
                if (this.f5352 == 0) {
                    return this.f5351;
                }
                break;
        }
        throw new AssertionError(AbstractC2844.m4791(i));
    }

    @Override // p000.C0792
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final boolean mo1592() {
        return this.f5353;
    }

    @Override // p000.C0792
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public final boolean mo1593() {
        return this.f5353;
    }

    @Override // p000.C0792
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public final void mo2451(C1814 c1814, boolean z) {
        if (this.f3119 == null) {
            return;
        }
        C0778 c0778 = this.f5351;
        c1814.getClass();
        int iM3701 = C1814.m3701(c0778);
        if (this.f5352 == 1) {
            this.f3124 = iM3701;
            this.f3125 = 0;
            m2446(this.f3119.m2428());
            m2449(0);
            return;
        }
        this.f3124 = 0;
        this.f3125 = iM3701;
        m2449(this.f3119.m2431());
        m2446(0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m3425(int i) {
        this.f5351.m2396(i);
        this.f5353 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m3426(int i) {
        if (this.f5352 == i) {
            return;
        }
        this.f5352 = i;
        ArrayList arrayList = this.f3117;
        arrayList.clear();
        if (this.f5352 == 1) {
            this.f5351 = this.f3108;
        } else {
            this.f5351 = this.f3109;
        }
        arrayList.add(this.f5351);
        C0778[] c0778Arr = this.f3116;
        int length = c0778Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0778Arr[i2] = this.f5351;
        }
    }
}
