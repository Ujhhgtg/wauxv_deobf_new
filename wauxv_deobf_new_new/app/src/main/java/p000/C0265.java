package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲈᤝᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0265 extends AbstractC1351 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0729 f1499;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f1500;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC0775 f1501;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f1502;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int f1503;

    public C0265(C2848 c2848, C0729 c0729, ArrayList arrayList, AbstractC0775 abstractC0775) {
        super(c2848, C2582.f8208);
        if (c0729 == null) {
            throw new NullPointerException("user == null");
        }
        if (arrayList == null) {
            throw new NullPointerException("values == null");
        }
        if (arrayList.size() <= 0) {
            throw new IllegalArgumentException("Illegal number of init values");
        }
        this.f1501 = abstractC0775;
        if (abstractC0775 == C0917.f3399 || abstractC0775 == C0917.f3398) {
            this.f1502 = 1;
        } else if (abstractC0775 == C0917.f3405 || abstractC0775 == C0917.f3400) {
            this.f1502 = 2;
        } else if (abstractC0775 == C0917.f3404 || abstractC0775 == C0917.f3402) {
            this.f1502 = 4;
        } else {
            if (abstractC0775 != C0917.f3403 && abstractC0775 != C0917.f3401) {
                throw new IllegalArgumentException("Unexpected constant type");
            }
            this.f1502 = 8;
        }
        this.f1499 = c0729;
        this.f1500 = arrayList;
        this.f1503 = arrayList.size();
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String mo1489() {
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f1500;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\n    ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC0775) arrayList.get(i)).mo1360());
        }
        return sb.toString();
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int mo1490() {
        return (((this.f1503 * this.f1502) + 1) / 2) + 4;
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String mo1491() {
        int iM2561 = this.f1499.m2561();
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f1500;
        int size = arrayList.size();
        sb.append("fill-array-data-payload // for fill-array-data @ ");
        sb.append(AbstractC2902.m4906(iM2561));
        for (int i = 0; i < size; i++) {
            sb.append("\n  ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC0775) arrayList.get(i)).mo1360());
        }
        return sb.toString();
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final AbstractC0953 mo1492(C2582 c2582) {
        return new C0265(this.f3484, this.f1499, this.f1500, this.f1501);
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void mo1493(C0496 c0496) {
        ArrayList arrayList = this.f1500;
        int size = arrayList.size();
        c0496.m1934(768);
        int i = this.f1502;
        c0496.m1934(i);
        c0496.m1933(this.f1503);
        char c = 2;
        if (i == 1) {
            for (int i2 = 0; i2 < size; i2++) {
                c0496.m1932((byte) ((AbstractC0906) ((AbstractC0775) arrayList.get(i2))).f3371);
            }
        } else if (i == 2) {
            for (int i3 = 0; i3 < size; i3++) {
                c0496.m1934((short) ((AbstractC0906) ((AbstractC0775) arrayList.get(i3))).f3371);
            }
        } else if (i == 4) {
            for (int i4 = 0; i4 < size; i4++) {
                c0496.m1933(((AbstractC0906) ((AbstractC0775) arrayList.get(i4))).f3371);
            }
        } else if (i == 8) {
            int i5 = 0;
            while (i5 < size) {
                long j = ((AbstractC0907) ((AbstractC0775) arrayList.get(i5))).f3372;
                int i6 = c0496.f2152;
                int i7 = i6 + 8;
                if (c0496.f2150) {
                    c0496.m1929(i7);
                } else if (i7 > c0496.f2151.length) {
                    C0496.m1923();
                    throw null;
                }
                int i8 = (int) j;
                byte[] bArr = c0496.f2151;
                bArr[i6] = (byte) i8;
                char c2 = c;
                bArr[i6 + 1] = (byte) (i8 >> 8);
                bArr[i6 + 2] = (byte) (i8 >> 16);
                bArr[i6 + 3] = (byte) (i8 >> 24);
                int i9 = (int) (j >> 32);
                bArr[i6 + 4] = (byte) i9;
                bArr[i6 + 5] = (byte) (i9 >> 8);
                bArr[i6 + 6] = (byte) (i9 >> 16);
                bArr[i6 + 7] = (byte) (i9 >> 24);
                c0496.f2152 = i7;
                i5++;
                c = c2;
            }
        }
        if (i != 1 || size % 2 == 0) {
            return;
        }
        c0496.m1932(0);
    }
}
