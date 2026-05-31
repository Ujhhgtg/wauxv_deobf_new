package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᤞᲈᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0377 implements InterfaceC1776 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f1869;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0417 f1870;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1676 f1871;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f1872;

    public C0377(int i, C0417 c0417, C1676 c1676, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        try {
            c0417.m4110();
            int length = c0417.f4833.length;
            if (length == 0) {
                throw new IllegalArgumentException("insns.size() == 0");
            }
            int i3 = length - 2;
            while (true) {
                if (i3 < 0) {
                    if (((AbstractC1663) c0417.m3165(length - 1)).f5623.f8360 == 1) {
                        throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
                    }
                    try {
                        c1676.m4110();
                        if (i2 < -1) {
                            throw new IllegalArgumentException("primarySuccessor < -1");
                        }
                        if (i2 >= 0) {
                            int iM3547 = c1676.m3547(i2);
                            if (!((iM3547 >= 0 ? iM3547 : -1) >= 0)) {
                                throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + c1676);
                            }
                        }
                        this.f1869 = i;
                        this.f1870 = c0417;
                        this.f1871 = c1676;
                        this.f1872 = i2;
                        return;
                    } catch (NullPointerException unused) {
                        throw new NullPointerException("successors == null");
                    }
                }
                if (((AbstractC1663) c0417.m3165(i3)).f5623.f8360 != 1) {
                    throw new IllegalArgumentException(AbstractC1095.m2795(i3, "insns[", "] is a branch or can throw"));
                }
                i3--;
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("insns == null");
        }
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "{" + AbstractC2902.m4906(this.f1869) + '}';
    }

    @Override // p000.InterfaceC1776
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int mo1682() {
        return this.f1869;
    }
}
