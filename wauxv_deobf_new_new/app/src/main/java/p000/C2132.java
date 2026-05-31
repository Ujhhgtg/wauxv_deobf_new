package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲁᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2132 extends AbstractC1351 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final AbstractC0775[] f7041;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int[] f7042;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f7043;

    public C2132(C1094 c1094, C2848 c2848, C2582 c2582, AbstractC0775[] abstractC0775Arr) {
        super(c1094, c2848, c2582);
        this.f7041 = abstractC0775Arr;
        this.f7042 = new int[abstractC0775Arr.length];
        int i = 0;
        while (true) {
            int[] iArr = this.f7042;
            if (i >= iArr.length) {
                this.f7043 = -1;
                return;
            } else {
                if (abstractC0775Arr[i] == null) {
                    throw new NullPointerException("constants[i] == null");
                }
                iArr[i] = -1;
                i++;
            }
        }
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1489() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC0775[] abstractC0775Arr = this.f7041;
            if (i >= abstractC0775Arr.length) {
                return sb.toString();
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(abstractC0775Arr[i].mo1360());
            i++;
        }
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final String mo2531() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC0775[] abstractC0775Arr = this.f7041;
            if (i >= abstractC0775Arr.length) {
                return sb.toString();
            }
            if (this.f7042[i] == -1) {
                return "";
            }
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(abstractC0775Arr[i].mo2371());
            sb.append('@');
            int iM4074 = m4074(i);
            if (iM4074 < 65536) {
                sb.append(AbstractC2902.m4906(iM4074));
            } else {
                sb.append(AbstractC2902.m4907(iM4074));
            }
            i++;
        }
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final String mo2532() {
        return mo1489();
    }

    @Override // p000.AbstractC1351, p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final AbstractC0953 mo2533(C1094 c1094) {
        return new C2132(c1094, this.f3484, this.f3485, this.f7041, this.f7042, this.f7043);
    }

    @Override // p000.AbstractC0953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final AbstractC0953 mo1492(C2582 c2582) {
        return new C2132(this.f3483, this.f3484, c2582, this.f7041, this.f7042, this.f7043);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int m4074(int i) {
        int i2 = this.f7042[i];
        if (i2 != -1) {
            return i2;
        }
        StringBuilder sbM2802 = AbstractC1095.m2802(i, "index not yet set for constant ", " value = ");
        sbM2802.append(this.f7041[i]);
        throw new IllegalStateException(sbM2802.toString());
    }

    public C2132(C1094 c1094, C2848 c2848, C2582 c2582, AbstractC0775[] abstractC0775Arr, int[] iArr, int i) {
        super(c1094, c2848, c2582);
        this.f7041 = abstractC0775Arr;
        this.f7042 = iArr;
        this.f7043 = i;
    }
}
