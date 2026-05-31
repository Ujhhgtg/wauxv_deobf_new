package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲀᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0276 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0267 f1539;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C2845 f1536 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public float f1537 = 0.0f;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ArrayList f1538 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f1540 = false;

    public C0276(C0253 c0253) {
        this.f1539 = new C0267(this, c0253);
    }

    public String toString() {
        boolean z;
        String strM4782 = AbstractC2844.m4782(this.f1536 == null ? "0" : "" + this.f1536, " = ");
        if (this.f1537 != 0.0f) {
            StringBuilder sbM4787 = AbstractC2844.m4787(strM4782);
            sbM4787.append(this.f1537);
            strM4782 = sbM4787.toString();
            z = true;
        } else {
            z = false;
        }
        int iM1504 = this.f1539.m1504();
        for (int i = 0; i < iM1504; i++) {
            C2845 c2845M1505 = this.f1539.m1505(i);
            if (c2845M1505 != null) {
                float fM1506 = this.f1539.m1506(i);
                if (fM1506 != 0.0f) {
                    String string = c2845M1505.toString();
                    if (z) {
                        if (fM1506 > 0.0f) {
                            strM4782 = AbstractC2844.m4782(strM4782, " + ");
                        } else {
                            strM4782 = AbstractC2844.m4782(strM4782, " - ");
                            fM1506 *= -1.0f;
                        }
                    } else if (fM1506 < 0.0f) {
                        strM4782 = AbstractC2844.m4782(strM4782, "- ");
                        fM1506 *= -1.0f;
                    }
                    strM4782 = fM1506 == 1.0f ? AbstractC2844.m4782(strM4782, string) : strM4782 + fM1506 + " " + string;
                    z = true;
                }
            }
        }
        return !z ? AbstractC2844.m4782(strM4782, "0.0") : strM4782;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1513(C1814 c1814, int i) {
        this.f1539.m1507(c1814.m3711(i), 1.0f);
        this.f1539.m1507(c1814.m3711(i), -1.0f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1514(C2845 c2845, C2845 c2846, C2845 c2847, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1537 = i;
        }
        if (z) {
            this.f1539.m1507(c2845, 1.0f);
            this.f1539.m1507(c2846, -1.0f);
            this.f1539.m1507(c2847, -1.0f);
        } else {
            this.f1539.m1507(c2845, -1.0f);
            this.f1539.m1507(c2846, 1.0f);
            this.f1539.m1507(c2847, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m1515(C2845 c2845, C2845 c2846, C2845 c2847, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1537 = i;
        }
        if (z) {
            this.f1539.m1507(c2845, 1.0f);
            this.f1539.m1507(c2846, -1.0f);
            this.f1539.m1507(c2847, 1.0f);
        } else {
            this.f1539.m1507(c2845, -1.0f);
            this.f1539.m1507(c2846, 1.0f);
            this.f1539.m1507(c2847, -1.0f);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C2845 mo1516(boolean[] zArr) {
        return m1518(zArr, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean mo1517() {
        return this.f1536 == null && this.f1537 == 0.0f && this.f1539.m1504() == 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2845 m1518(boolean[] zArr, C2845 c2845) {
        int i;
        int iM1504 = this.f1539.m1504();
        C2845 c2846 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iM1504; i2++) {
            float fM1506 = this.f1539.m1506(i2);
            if (fM1506 < 0.0f) {
                C2845 c2845M1505 = this.f1539.m1505(i2);
                if ((zArr == null || !zArr[c2845M1505.f9048]) && c2845M1505 != c2845 && (((i = c2845M1505.f9058) == 3 || i == 4) && fM1506 < f)) {
                    f = fM1506;
                    c2846 = c2845M1505;
                }
            }
        }
        return c2846;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m1519(C2845 c2845) {
        C2845 c2846 = this.f1536;
        if (c2846 != null) {
            this.f1539.m1507(c2846, -1.0f);
            this.f1536.f9049 = -1;
            this.f1536 = null;
        }
        float fM1508 = this.f1539.m1508(c2845, true) * (-1.0f);
        this.f1536 = c2845;
        if (fM1508 == 1.0f) {
            return;
        }
        this.f1537 /= fM1508;
        C0267 c0267 = this.f1539;
        int i = c0267.f1515;
        for (int i2 = 0; i != -1 && i2 < c0267.f1508; i2++) {
            float[] fArr = c0267.f1514;
            fArr[i] = fArr[i] / fM1508;
            i = c0267.f1513[i];
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m1520(C1814 c1814, C2845 c2845, boolean z) {
        if (c2845.f9052) {
            float fM1503 = this.f1539.m1503(c2845);
            this.f1537 = (c2845.f9051 * fM1503) + this.f1537;
            this.f1539.m1508(c2845, z);
            if (z) {
                c2845.m4796(this);
            }
            if (this.f1539.m1504() == 0) {
                this.f1540 = true;
                c1814.f6026 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void mo1521(C1814 c1814, C0276 c0276, boolean z) {
        C0267 c0267 = this.f1539;
        c0267.getClass();
        float fM1503 = c0267.m1503(c0276.f1536);
        c0267.m1508(c0276.f1536, z);
        C0267 c0268 = c0276.f1539;
        int iM1504 = c0268.m1504();
        for (int i = 0; i < iM1504; i++) {
            C2845 c2845M1505 = c0268.m1505(i);
            c0267.m1501(c2845M1505, c0268.m1503(c2845M1505) * fM1503, z);
        }
        this.f1537 = (c0276.f1537 * fM1503) + this.f1537;
        if (z) {
            c0276.f1536.m4796(this);
        }
        if (this.f1536 == null || this.f1539.m1504() != 0) {
            return;
        }
        this.f1540 = true;
        c1814.f6026 = true;
    }
}
