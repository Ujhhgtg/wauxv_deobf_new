package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᛸᲁᤝᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2099 extends AbstractC1351 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final AbstractC0777[] f6917;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int[] f6918;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f6919;

    public C2099(C1089 c1089, C2788 c2788, C2526 c2526, AbstractC0777[] abstractC0777Arr) {
        super(c1089, c2788, c2526);
        this.f6917 = abstractC0777Arr;
        this.f6918 = new int[abstractC0777Arr.length];
        int i = 0;
        while (true) {
            int[] iArr = this.f6918;
            if (i >= iArr.length) {
                this.f6919 = -1;
                return;
            } else {
                if (abstractC0777Arr[i] == null) {
                    throw new NullPointerException("constants[i] == null");
                }
                iArr[i] = -1;
                i++;
            }
        }
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1343() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC0777[] abstractC0777Arr = this.f6917;
            if (i >= abstractC0777Arr.length) {
                return sb.toString();
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(abstractC0777Arr[i].mo1214());
            i++;
        }
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final String mo2414() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC0777[] abstractC0777Arr = this.f6917;
            if (i >= abstractC0777Arr.length) {
                return sb.toString();
            }
            if (this.f6918[i] == -1) {
                return "";
            }
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(abstractC0777Arr[i].mo2269());
            sb.append('@');
            int iM3891 = m3891(i);
            if (iM3891 < 65536) {
                sb.append(AbstractC1460.m3223(iM3891));
            } else {
                sb.append(AbstractC1460.m3224(iM3891));
            }
            i++;
        }
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final String mo2415() {
        return mo1343();
    }

    @Override // p000.AbstractC1351, p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final AbstractC0950 mo2416(C1089 c1089) {
        return new C2099(c1089, this.f3469, this.f3470, this.f6917, this.f6918, this.f6919);
    }

    @Override // p000.AbstractC0950
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final AbstractC0950 mo1346(C2526 c2526) {
        return new C2099(this.f3468, this.f3469, c2526, this.f6917, this.f6918, this.f6919);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int m3891(int i) {
        int i2 = this.f6918[i];
        if (i2 != -1) {
            return i2;
        }
        StringBuilder sbM2787 = AbstractC1194.m2787(i, "index not yet set for constant ", " value = ");
        sbM2787.append(this.f6917[i]);
        throw new IllegalStateException(sbM2787.toString());
    }

    public C2099(C1089 c1089, C2788 c2788, C2526 c2526, AbstractC0777[] abstractC0777Arr, int[] iArr, int i) {
        super(c1089, c2788, c2526);
        this.f6917 = abstractC0777Arr;
        this.f6918 = iArr;
        this.f6919 = i;
    }
}
