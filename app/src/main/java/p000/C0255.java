package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲁᲈᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0255 extends AbstractC1351 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0734 f1425;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f1426;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC0777 f1427;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f1428;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int f1429;

    public C0255(C2788 c2788, C0734 c0734, ArrayList arrayList, AbstractC0777 abstractC0777) {
        super(c2788, C2526.f8058);
        if (c0734 == null) {
            throw new NullPointerException("user == null");
        }
        if (arrayList == null) {
            throw new NullPointerException("values == null");
        }
        if (arrayList.size() <= 0) {
            throw new IllegalArgumentException("Illegal number of init values");
        }
        this.f1427 = abstractC0777;
        if (abstractC0777 == C0918.f3392 || abstractC0777 == C0918.f3391) {
            this.f1428 = 1;
        } else if (abstractC0777 == C0918.f3398 || abstractC0777 == C0918.f3393) {
            this.f1428 = 2;
        } else if (abstractC0777 == C0918.f3397 || abstractC0777 == C0918.f3395) {
            this.f1428 = 4;
        } else {
            if (abstractC0777 != C0918.f3396 && abstractC0777 != C0918.f3394) {
                throw new IllegalArgumentException("Unexpected constant type");
            }
            this.f1428 = 8;
        }
        this.f1425 = c0734;
        this.f1426 = arrayList;
        this.f1429 = arrayList.size();
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String mo1343() {
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f1426;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\n    ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC0777) arrayList.get(i)).mo1214());
        }
        return sb.toString();
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int mo1344() {
        return (((this.f1429 * this.f1428) + 1) / 2) + 4;
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String mo1345() {
        int iM2442 = this.f1425.m2442();
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f1426;
        int size = arrayList.size();
        sb.append("fill-array-data-payload // for fill-array-data @ ");
        sb.append(AbstractC1460.m3223(iM2442));
        for (int i = 0; i < size; i++) {
            sb.append("\n  ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC0777) arrayList.get(i)).mo1214());
        }
        return sb.toString();
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final AbstractC0950 mo1346(C2526 c2526) {
        return new C0255(this.f3469, this.f1425, this.f1426, this.f1427);
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void mo1347(C0519 c0519) {
        ArrayList arrayList = this.f1426;
        int size = arrayList.size();
        c0519.m1840(768);
        int i = this.f1428;
        c0519.m1840(i);
        c0519.m1839(this.f1429);
        char c = 2;
        if (i == 1) {
            for (int i2 = 0; i2 < size; i2++) {
                c0519.m1838((byte) ((AbstractC0907) ((AbstractC0777) arrayList.get(i2))).f3364);
            }
        } else if (i == 2) {
            for (int i3 = 0; i3 < size; i3++) {
                c0519.m1840((short) ((AbstractC0907) ((AbstractC0777) arrayList.get(i3))).f3364);
            }
        } else if (i == 4) {
            for (int i4 = 0; i4 < size; i4++) {
                c0519.m1839(((AbstractC0907) ((AbstractC0777) arrayList.get(i4))).f3364);
            }
        } else if (i == 8) {
            int i5 = 0;
            while (i5 < size) {
                long j = ((AbstractC0908) ((AbstractC0777) arrayList.get(i5))).f3365;
                int i6 = c0519.f2196;
                int i7 = i6 + 8;
                if (c0519.f2194) {
                    c0519.m1835(i7);
                } else if (i7 > c0519.f2195.length) {
                    C0519.m1829();
                    throw null;
                }
                int i8 = (int) j;
                byte[] bArr = c0519.f2195;
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
                c0519.f2196 = i7;
                i5++;
                c = c2;
            }
        }
        if (i != 1 || size % 2 == 0) {
            return;
        }
        c0519.m1838(0);
    }
}
