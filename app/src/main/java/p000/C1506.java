package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᤝᲈᲀᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1506 extends C0793 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public float f5317 = -1.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public int f5318 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public int f5319 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public C0779 f5320 = this.f3102;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public int f5321 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public boolean f5322;

    public C1506() {
        this.f3110.clear();
        this.f3110.add(this.f5320);
        int length = this.f3109.length;
        for (int i = 0; i < length; i++) {
            this.f3109[i] = this.f5320;
        }
    }

    @Override // p000.C0793
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1485(C1791 c1791, boolean z) {
        C0794 c0794 = (C0794) this.f3112;
        if (c0794 == null) {
            return;
        }
        Object objMo2311 = c0794.mo2311(2);
        Object objMo2312 = c0794.mo2311(4);
        C0793 c0793 = this.f3112;
        boolean z2 = c0793 != null && c0793.f3134[0] == 2;
        if (this.f5321 == 0) {
            objMo2311 = c0794.mo2311(3);
            objMo2312 = c0794.mo2311(5);
            C0793 c0795 = this.f3112;
            z2 = c0795 != null && c0795.f3134[1] == 2;
        }
        if (this.f5322) {
            C0779 c0779 = this.f5320;
            if (c0779.f2878) {
                C2785 c2785M3540 = c1791.m3540(c0779);
                c1791.m3533(c2785M3540, this.f5320.m2273());
                if (this.f5318 != -1) {
                    if (z2) {
                        c1791.m3535(c1791.m3540(objMo2312), c2785M3540, 0, 5);
                    }
                } else if (this.f5319 != -1 && z2) {
                    C2785 c2785M3541 = c1791.m3540(objMo2312);
                    c1791.m3535(c2785M3540, c1791.m3540(objMo2311), 0, 5);
                    c1791.m3535(c2785M3541, c2785M3540, 0, 5);
                }
                this.f5322 = false;
                return;
            }
        }
        if (this.f5318 != -1) {
            C2785 c2785M3542 = c1791.m3540(this.f5320);
            c1791.m3534(c2785M3542, c1791.m3540(objMo2311), this.f5318, 8);
            if (z2) {
                c1791.m3535(c1791.m3540(objMo2312), c2785M3542, 0, 5);
                return;
            }
            return;
        }
        if (this.f5319 != -1) {
            C2785 c2785M3543 = c1791.m3540(this.f5320);
            C2785 c2785M3544 = c1791.m3540(objMo2312);
            c1791.m3534(c2785M3543, c2785M3544, -this.f5319, 8);
            if (z2) {
                c1791.m3535(c2785M3543, c1791.m3540(objMo2311), 0, 5);
                c1791.m3535(c2785M3544, c2785M3543, 0, 5);
                return;
            }
            return;
        }
        if (this.f5317 != -1.0f) {
            C2785 c2785M3545 = c1791.m3540(this.f5320);
            C2785 c2785M3546 = c1791.m3540(objMo2312);
            float f = this.f5317;
            C0266 c0266M3541 = c1791.m3541();
            c0266M3541.f1465.m1361(c2785M3545, -1.0f);
            c0266M3541.f1465.m1361(c2785M3546, f);
            c1791.m3532(c0266M3541);
        }
    }

    @Override // p000.C0793
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final boolean mo1486() {
        return true;
    }

    @Override // p000.C0793
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final C0779 mo2311(int i) {
        switch (AbstractC2784.m4759(i)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f5321 == 1) {
                    return this.f5320;
                }
                break;
            case 2:
            case 4:
                if (this.f5321 == 0) {
                    return this.f5320;
                }
                break;
        }
        throw new AssertionError(AbstractC2784.m4758(i));
    }

    @Override // p000.C0793
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final boolean mo1487() {
        return this.f5322;
    }

    @Override // p000.C0793
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public final boolean mo1488() {
        return this.f5322;
    }

    @Override // p000.C0793
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public final void mo2336(C1791 c1791, boolean z) {
        if (this.f3112 == null) {
            return;
        }
        C0779 c0779 = this.f5320;
        c1791.getClass();
        int iM3529 = C1791.m3529(c0779);
        if (this.f5321 == 1) {
            this.f3117 = iM3529;
            this.f3118 = 0;
            m2331(this.f3112.m2313());
            m2334(0);
            return;
        }
        this.f3117 = 0;
        this.f3118 = iM3529;
        m2334(this.f3112.m2316());
        m2331(0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m3244(int i) {
        this.f5320.m2281(i);
        this.f5322 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m3245(int i) {
        if (this.f5321 == i) {
            return;
        }
        this.f5321 = i;
        ArrayList arrayList = this.f3110;
        arrayList.clear();
        if (this.f5321 == 1) {
            this.f5320 = this.f3101;
        } else {
            this.f5320 = this.f3102;
        }
        arrayList.add(this.f5320);
        C0779[] c0779Arr = this.f3109;
        int length = c0779Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0779Arr[i2] = this.f5320;
        }
    }
}
