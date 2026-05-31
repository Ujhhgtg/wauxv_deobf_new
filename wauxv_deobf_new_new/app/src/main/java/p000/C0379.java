package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᲁᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0379 extends AbstractC1777 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f1874;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final int m1702() {
        if (this.f1874 == -1) {
            C0378 c0378 = new C0378();
            c0378.f1873 = 0;
            int length = this.f4833.length;
            for (int i = 0; i < length; i++) {
                C0417 c0417 = ((C0377) m3165(i)).f1870;
                int length2 = c0417.f4833.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    ((AbstractC1663) c0417.m3165(i2)).mo3149(c0378);
                }
            }
            this.f1874 = c0378.f1873;
        }
        return this.f1874;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C0377 m1703(int i) {
        int iM3659 = m3659(i);
        if (iM3659 >= 0) {
            return (C0377) m3165(iM3659);
        }
        throw new IllegalArgumentException("no such label: ".concat(AbstractC2902.m4906(i)));
    }
}
