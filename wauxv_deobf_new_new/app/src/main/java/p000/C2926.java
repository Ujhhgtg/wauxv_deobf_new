package p000;

import com.umeng.analytics.pro.bc;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᤞᤝᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2926 extends AbstractC1351 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0729 f9351;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1676 f9352;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0729[] f9353;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean f9354;

    public C2926(C2848 c2848, C0729 c0729, C1676 c1676, C0729[] c0729Arr) {
        super(c2848, C2582.f8208);
        if (c0729 == null) {
            throw new NullPointerException("user == null");
        }
        if (c1676 == null) {
            throw new NullPointerException("cases == null");
        }
        if (c0729Arr == null) {
            throw new NullPointerException("targets == null");
        }
        int i = c1676.f5648;
        if (i != c0729Arr.length) {
            throw new IllegalArgumentException("cases / targets mismatch");
        }
        if (i > 65535) {
            throw new IllegalArgumentException("too many cases");
        }
        this.f9351 = c0729;
        this.f9352 = c1676;
        this.f9353 = c0729Arr;
        boolean z = true;
        if (i >= 2) {
            long jM4926 = m4926(c1676);
            long j = (((long) c1676.f5648) * 4) + 2;
            if (jM4926 < 0 || jM4926 > (j * 5) / 4) {
                z = false;
            }
        }
        this.f9354 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static long m4926(C1676 c1676) {
        long jM3548 = (((((long) c1676.m3548(c1676.f5648 - 1)) - ((long) c1676.m3548(0))) + 1) * 2) + 4;
        if (jM3548 <= 2147483647L) {
            return jM3548;
        }
        return -1L;
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1489() {
        StringBuilder sb = new StringBuilder(100);
        C0729[] c0729Arr = this.f9353;
        int length = c0729Arr.length;
        for (int i = 0; i < length; i++) {
            sb.append("\n    ");
            sb.append(this.f9352.m3548(i));
            sb.append(": ");
            sb.append(c0729Arr[i]);
        }
        return sb.toString();
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final int mo1490() {
        boolean z = this.f9354;
        C1676 c1676 = this.f9352;
        return (int) (z ? m4926(c1676) : (((long) c1676.f5648) * 4) + 2);
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final String mo1491() {
        int iM2561 = this.f9351.m2561();
        StringBuilder sb = new StringBuilder(100);
        C0729[] c0729Arr = this.f9353;
        int length = c0729Arr.length;
        sb.append(this.f9354 ? "packed" : "sparse");
        sb.append("-switch-payload // for switch @ ");
        sb.append(AbstractC2902.m4906(iM2561));
        for (int i = 0; i < length; i++) {
            int iM2562 = c0729Arr[i].m2561();
            sb.append("\n  ");
            sb.append(this.f9352.m3548(i));
            sb.append(": ");
            sb.append(AbstractC2902.m4907(iM2562));
            sb.append(" // ");
            sb.append(AbstractC2902.m4901(iM2562 - iM2561));
        }
        return sb.toString();
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final AbstractC0953 mo1492(C2582 c2582) {
        return new C2926(this.f3484, this.f9351, this.f9352, this.f9353);
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo1493(C0496 c0496) {
        int iM2561;
        int iM2562 = this.f9351.m2561();
        int iMo3217 = AbstractC1096.f3977.f3940.mo3217();
        C0729[] c0729Arr = this.f9353;
        int length = c0729Arr.length;
        boolean z = this.f9354;
        C1676 c1676 = this.f9352;
        int i = 0;
        if (!z) {
            c0496.m1934(512);
            c0496.m1934(length);
            for (int i2 = 0; i2 < length; i2++) {
                c0496.m1933(c1676.m3548(i2));
            }
            while (i < length) {
                c0496.m1933(c0729Arr[i].m2561() - iM2562);
                i++;
            }
            return;
        }
        int iM3548 = length == 0 ? 0 : c1676.m3548(0);
        int iM3549 = ((length == 0 ? 0 : c1676.m3548(length - 1)) - iM3548) + 1;
        c0496.m1934(bc.e);
        c0496.m1934(iM3549);
        c0496.m1933(iM3548);
        int i3 = 0;
        while (i < iM3549) {
            if (c1676.m3548(i3) > iM3548 + i) {
                iM2561 = iMo3217;
            } else {
                iM2561 = c0729Arr[i3].m2561() - iM2562;
                i3++;
            }
            c0496.m1933(iM2561);
            i++;
        }
    }
}
