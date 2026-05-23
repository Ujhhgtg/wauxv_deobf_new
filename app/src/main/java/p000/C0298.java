package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0298 {

    public int f1509;

    public int f1510;

    public int f1511;

    public final Object f1512;

    public Object f1513;

    public Object f1514;

    public C0298(C1043 c1043, int i, int i2, C1133 c1133) {
        if (c1043 == null) {
            throw new NullPointerException("cf == null");
        }
        if (c1133 == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        int iM1817 = c1043.f3796.m1817(i2);
        this.f1512 = c1043;
        this.f1509 = i;
        this.f1510 = i2;
        this.f1513 = c1133;
        this.f1514 = new C0442(iM1817);
        this.f1511 = -1;
    }

    public void m1403() {
        if (this.f1511 < 0) {
            C0442 c0442 = (C0442) this.f1514;
            int length = c0442.f4836.length;
            int iMo1402 = this.f1510 + 2;
            C1043 c1043 = (C1043) this.f1512;
            C0516 c0516 = c1043.f3796;
            for (int i = 0; i < length; i++) {
                try {
                    AbstractC0369 abstractC0369M2730 = ((C1133) this.f1513).m2730(c1043, this.f1509, iMo1402);
                    iMo1402 += abstractC0369M2730.mo1402();
                    c0442.m3063(i, abstractC0369M2730);
                } catch (C2331 e) {
                    e.m2885("...while parsing attributes[" + i + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C2331 c2331 = new C2331(null, e2);
                    c2331.m2885("...while parsing attributes[" + i + "]");
                    throw c2331;
                }
            }
            this.f1511 = iMo1402;
        }
    }

    public void m1404() {
        this.f1509 = 1;
        this.f1513 = (C1970) this.f1512;
        this.f1511 = 0;
    }

    public boolean m1405() {
        C1968 c1968M5061 = ((C1970) this.f1513).f6540.m5061();
        int iM3671 = c1968M5061.m3671(6);
        return !(iM3671 == 0 || ((ByteBuffer) c1968M5061.f6241).get(iM3671 + c1968M5061.f6238) == 0) || this.f1510 == 65039;
    }

    public C0298(C1970 c1970) {
        this.f1509 = 1;
        this.f1512 = c1970;
        this.f1513 = c1970;
    }
}
