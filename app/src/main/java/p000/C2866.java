package p000;

import com.umeng.analytics.pro.bc;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᤝᲁᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2866 extends AbstractC1351 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0734 f9181;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1660 f9182;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0734[] f9183;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean f9184;

    public C2866(C2788 c2788, C0734 c0734, C1660 c1660, C0734[] c0734Arr) {
        super(c2788, C2526.f8058);
        if (c0734 == null) {
            throw new NullPointerException("user == null");
        }
        if (c1660 == null) {
            throw new NullPointerException("cases == null");
        }
        if (c0734Arr == null) {
            throw new NullPointerException("targets == null");
        }
        int i = c1660.f5610;
        if (i != c0734Arr.length) {
            throw new IllegalArgumentException("cases / targets mismatch");
        }
        if (i > 65535) {
            throw new IllegalArgumentException("too many cases");
        }
        this.f9181 = c0734;
        this.f9182 = c1660;
        this.f9183 = c0734Arr;
        boolean z = true;
        if (i >= 2) {
            long jM4865 = m4865(c1660);
            long j = (((long) c1660.f5610) * 4) + 2;
            if (jM4865 < 0 || jM4865 > (j * 5) / 4) {
                z = false;
            }
        }
        this.f9184 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static long m4865(C1660 c1660) {
        long jM3384 = (((((long) c1660.m3384(c1660.f5610 - 1)) - ((long) c1660.m3384(0))) + 1) * 2) + 4;
        if (jM3384 <= 2147483647L) {
            return jM3384;
        }
        return -1L;
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1343() {
        StringBuilder sb = new StringBuilder(100);
        C0734[] c0734Arr = this.f9183;
        int length = c0734Arr.length;
        for (int i = 0; i < length; i++) {
            sb.append("\n    ");
            sb.append(this.f9182.m3384(i));
            sb.append(": ");
            sb.append(c0734Arr[i]);
        }
        return sb.toString();
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final int mo1344() {
        boolean z = this.f9184;
        C1660 c1660 = this.f9182;
        return (int) (z ? m4865(c1660) : (((long) c1660.f5610) * 4) + 2);
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final String mo1345() {
        int iM2442 = this.f9181.m2442();
        StringBuilder sb = new StringBuilder(100);
        C0734[] c0734Arr = this.f9183;
        int length = c0734Arr.length;
        sb.append(this.f9184 ? "packed" : "sparse");
        sb.append("-switch-payload // for switch @ ");
        sb.append(AbstractC1460.m3223(iM2442));
        for (int i = 0; i < length; i++) {
            int iM2443 = c0734Arr[i].m2442();
            sb.append("\n  ");
            sb.append(this.f9182.m3384(i));
            sb.append(": ");
            sb.append(AbstractC1460.m3224(iM2443));
            sb.append(" // ");
            sb.append(AbstractC1460.m3220(iM2443 - iM2442));
        }
        return sb.toString();
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final AbstractC0950 mo1346(C2526 c2526) {
        return new C2866(this.f3469, this.f9181, this.f9182, this.f9183);
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo1347(C0519 c0519) {
        int iM2442;
        int iM2443 = this.f9181.m2442();
        int iMo3109 = AbstractC1090.f3966.f3929.mo3109();
        C0734[] c0734Arr = this.f9183;
        int length = c0734Arr.length;
        boolean z = this.f9184;
        C1660 c1660 = this.f9182;
        int i = 0;
        if (!z) {
            c0519.m1840(512);
            c0519.m1840(length);
            for (int i2 = 0; i2 < length; i2++) {
                c0519.m1839(c1660.m3384(i2));
            }
            while (i < length) {
                c0519.m1839(c0734Arr[i].m2442() - iM2443);
                i++;
            }
            return;
        }
        int iM3384 = length == 0 ? 0 : c1660.m3384(0);
        int iM3385 = ((length == 0 ? 0 : c1660.m3384(length - 1)) - iM3384) + 1;
        c0519.m1840(256);
        c0519.m1840(iM3385);
        c0519.m1839(iM3384);
        int i3 = 0;
        while (i < iM3385) {
            if (c1660.m3384(i3) > iM3384 + i) {
                iM2442 = iMo3109;
            } else {
                iM2442 = c0734Arr[i3].m2442() - iM2443;
                i3++;
            }
            c0519.m1839(iM2442);
            i++;
        }
    }
}
