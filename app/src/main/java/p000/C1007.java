package p000;

import bsh.C0007;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1007 extends C0501 {

    public final String f3668;

    public final C0352 f3669;

    public final String[] f3670;

    public final C0340 f3671;

    public final transient C0550 f3672;

    public final transient RunnableC1668 f3673;

    public C0327 f3674;

    public AbstractC1672 f3675;

    public Object[] f3676;

    public C1007(String str, String str2, C0352 c0352, String[] strArr, String[] strArr2, C0340 c0340, C0333 c0333, C0007 c0007, C2000 c2000, boolean z, C0550 c0550, RunnableC1668 runnableC1668) {
        super(str, null, strArr, null, null, c0333, c0007, c2000, z);
        this.f3674 = null;
        this.f3675 = null;
        this.f3676 = null;
        this.f3668 = str2;
        this.f3669 = c0352;
        this.f3670 = strArr2;
        this.f3671 = c0340;
        this.f3672 = c0550;
        this.f3673 = runnableC1668;
    }

    @Override // p000.C0501
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj != null) {
            if (obj != this) {
                if (obj.getClass() == C1007.class) {
                    C1007 c1007 = (C1007) obj;
                    if (m1748().equals(c1007.m1748()) && m1749() == c1007.m1749()) {
                        int i = 0;
                        while (true) {
                            String[] strArr = this.f3670;
                            if (i < strArr.length) {
                                String str = strArr[i];
                                String str2 = c1007.f3670[i];
                                if (str == null) {
                                    zEquals = str2 == null;
                                } else {
                                    zEquals = str.equals(str2);
                                }
                                if (zEquals) {
                                    i++;
                                }
                            } else if (this.f2159 != c1007.f2159) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C0501
    public final int hashCode() {
        int iHashCode = C1007.class.hashCode() + m1748().hashCode();
        String[] strArr = this.f3670;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            iHashCode += (str == null ? 0 : str.hashCode()) + 3;
        }
        return m1749() + iHashCode;
    }

    @Override // p000.C0501
    public final Class[] mo1751() {
        AbstractC1672 abstractC1672 = this.f3675;
        if (abstractC1672 != null) {
            return abstractC1672.mo2890();
        }
        try {
            return this.f3671.mo306(this.f3672, this.f3673);
        } catch (C1229 e) {
            throw new C1669("can't eval param types: " + e, e);
        }
    }

    @Override // p000.C0501
    public final Class mo1752() {
        C0352 c0352 = this.f3669;
        if (c0352 == null) {
            return null;
        }
        try {
            return c0352.f1662 ? Void.TYPE : ((C0356) c0352.f8721[0]).m1467(this.f3672, this.f3673);
        } catch (C1229 e) {
            throw new C1669("can't eval return type: " + e, e);
        }
    }
}
