package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᲇᲁᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0308 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f1583;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f1584;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f1585;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f1586;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f1587;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f1588;

    public C0308(C1046 c1046, int i, int i2, C1139 c1139) {
        if (c1046 == null) {
            throw new NullPointerException("cf == null");
        }
        if (c1139 == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        int iM1911 = c1046.f3803.m1911(i2);
        this.f1586 = c1046;
        this.f1583 = i;
        this.f1584 = i2;
        this.f1587 = c1139;
        this.f1588 = new C0417(iM1911);
        this.f1585 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m1549() {
        if (this.f1585 < 0) {
            C0417 c0417 = (C0417) this.f1588;
            int length = c0417.f4833.length;
            int iMo1548 = this.f1584 + 2;
            C1046 c1046 = (C1046) this.f1586;
            C0493 c0493 = c1046.f3803;
            for (int i = 0; i < length; i++) {
                try {
                    AbstractC0344 abstractC0344M2873 = ((C1139) this.f1587).m2873(c1046, this.f1583, iMo1548);
                    iMo1548 += abstractC0344M2873.mo1548();
                    c0417.m3166(i, abstractC0344M2873);
                } catch (C2371 e) {
                    e.m3004("...while parsing attributes[" + i + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C2371 c2371 = new C2371(null, e2);
                    c2371.m3004("...while parsing attributes[" + i + "]");
                    throw c2371;
                }
            }
            this.f1585 = iMo1548;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m1550() {
        this.f1583 = 1;
        this.f1587 = (C2001) this.f1586;
        this.f1585 = 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean m1551() {
        C1999 c1999M5086 = ((C2001) this.f1587).f6645.m5086();
        int iM3849 = c1999M5086.m3849(6);
        return !(iM3849 == 0 || ((ByteBuffer) c1999M5086.f6315).get(iM3849 + c1999M5086.f6312) == 0) || this.f1584 == 65039;
    }

    public C0308(C2001 c2001) {
        this.f1583 = 1;
        this.f1586 = c2001;
        this.f1587 = c2001;
    }
}
