package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0266 {

    public final C0257 f1465;

    public C2785 f1462 = null;

    public float f1463 = 0.0f;

    public final ArrayList f1464 = new ArrayList();

    public boolean f1466 = false;

    public C0266(C0243 c0243) {
        this.f1465 = new C0257(this, c0243);
    }

    public String toString() {
        boolean z;
        String strM4748 = AbstractC2784.m4748(this.f1462 == null ? "0" : "" + this.f1462, " = ");
        if (this.f1463 != 0.0f) {
            StringBuilder sbM4753 = AbstractC2784.m4753(strM4748);
            sbM4753.append(this.f1463);
            strM4748 = sbM4753.toString();
            z = true;
        } else {
            z = false;
        }
        int iM1358 = this.f1465.m1358();
        for (int i = 0; i < iM1358; i++) {
            C2785 c2785M1359 = this.f1465.m1359(i);
            if (c2785M1359 != null) {
                float fM1360 = this.f1465.m1360(i);
                if (fM1360 != 0.0f) {
                    String string = c2785M1359.toString();
                    if (z) {
                        if (fM1360 > 0.0f) {
                            strM4748 = AbstractC2784.m4748(strM4748, " + ");
                        } else {
                            strM4748 = AbstractC2784.m4748(strM4748, " - ");
                            fM1360 *= -1.0f;
                        }
                    } else if (fM1360 < 0.0f) {
                        strM4748 = AbstractC2784.m4748(strM4748, "- ");
                        fM1360 *= -1.0f;
                    }
                    strM4748 = fM1360 == 1.0f ? AbstractC2784.m4748(strM4748, string) : strM4748 + fM1360 + " " + string;
                    z = true;
                }
            }
        }
        return !z ? AbstractC2784.m4748(strM4748, "0.0") : strM4748;
    }

    public final void m1367(C1791 c1791, int i) {
        this.f1465.m1361(c1791.m3539(i), 1.0f);
        this.f1465.m1361(c1791.m3539(i), -1.0f);
    }

    public final void m1368(C2785 c2785, C2785 c2786, C2785 c2787, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1463 = i;
        }
        if (z) {
            this.f1465.m1361(c2785, 1.0f);
            this.f1465.m1361(c2786, -1.0f);
            this.f1465.m1361(c2787, -1.0f);
        } else {
            this.f1465.m1361(c2785, -1.0f);
            this.f1465.m1361(c2786, 1.0f);
            this.f1465.m1361(c2787, 1.0f);
        }
    }

    public final void m1369(C2785 c2785, C2785 c2786, C2785 c2787, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1463 = i;
        }
        if (z) {
            this.f1465.m1361(c2785, 1.0f);
            this.f1465.m1361(c2786, -1.0f);
            this.f1465.m1361(c2787, 1.0f);
        } else {
            this.f1465.m1361(c2785, -1.0f);
            this.f1465.m1361(c2786, 1.0f);
            this.f1465.m1361(c2787, -1.0f);
        }
    }

    public C2785 mo1370(boolean[] zArr) {
        return m1372(zArr, null);
    }

    public boolean mo1371() {
        return this.f1462 == null && this.f1463 == 0.0f && this.f1465.m1358() == 0;
    }

    public final C2785 m1372(boolean[] zArr, C2785 c2785) {
        int i;
        int iM1358 = this.f1465.m1358();
        C2785 c2786 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iM1358; i2++) {
            float fM1360 = this.f1465.m1360(i2);
            if (fM1360 < 0.0f) {
                C2785 c2785M1359 = this.f1465.m1359(i2);
                if ((zArr == null || !zArr[c2785M1359.f8886]) && c2785M1359 != c2785 && (((i = c2785M1359.f8896) == 3 || i == 4) && fM1360 < f)) {
                    f = fM1360;
                    c2786 = c2785M1359;
                }
            }
        }
        return c2786;
    }

    public final void m1373(C2785 c2785) {
        C2785 c2786 = this.f1462;
        if (c2786 != null) {
            this.f1465.m1361(c2786, -1.0f);
            this.f1462.f8887 = -1;
            this.f1462 = null;
        }
        float fM1362 = this.f1465.m1362(c2785, true) * (-1.0f);
        this.f1462 = c2785;
        if (fM1362 == 1.0f) {
            return;
        }
        this.f1463 /= fM1362;
        C0257 c0257 = this.f1465;
        int i = c0257.f1441;
        for (int i2 = 0; i != -1 && i2 < c0257.f1434; i2++) {
            float[] fArr = c0257.f1440;
            fArr[i] = fArr[i] / fM1362;
            i = c0257.f1439[i];
        }
    }

    public final void m1374(C1791 c1791, C2785 c2785, boolean z) {
        if (c2785.f8890) {
            float fM1357 = this.f1465.m1357(c2785);
            this.f1463 = (c2785.f8889 * fM1357) + this.f1463;
            this.f1465.m1362(c2785, z);
            if (z) {
                c2785.m4763(this);
            }
            if (this.f1465.m1358() == 0) {
                this.f1466 = true;
                c1791.f5970 = true;
            }
        }
    }

    public void mo1375(C1791 c1791, C0266 c0266, boolean z) {
        C0257 c0257 = this.f1465;
        
        float fM1357 = c0257.m1357(c0266.f1462);
        c0257.m1362(c0266.f1462, z);
        C0257 c0258 = c0266.f1465;
        int iM1358 = c0258.m1358();
        for (int i = 0; i < iM1358; i++) {
            C2785 c2785M1359 = c0258.m1359(i);
            c0257.m1355(c2785M1359, c0258.m1357(c2785M1359) * fM1357, z);
        }
        this.f1463 = (c0266.f1463 * fM1357) + this.f1463;
        if (z) {
            c0266.f1462.m4763(this);
        }
        if (this.f1462 == null || this.f1465.m1358() != 0) {
            return;
        }
        this.f1466 = true;
        c1791.f5970 = true;
    }
}
