package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᲇᤝᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0402 implements InterfaceC1754 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int f1897;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0442 f1898;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1660 f1899;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f1900;

    public C0402(int i, C0442 c0442, C1660 c1660, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        try {
            c0442.m3926();
            int length = c0442.f4836.length;
            if (length == 0) {
                throw new IllegalArgumentException("insns.size() == 0");
            }
            int i3 = length - 2;
            while (true) {
                if (i3 < 0) {
                    if (((AbstractC1649) c0442.m3062(length - 1)).f5588.f8208 == 1) {
                        throw new IllegalArgumentException("insns does not end with a branch or throwing instruction");
                    }
                    try {
                        c1660.m3926();
                        if (i2 < -1) {
                            throw new IllegalArgumentException("primarySuccessor < -1");
                        }
                        if (i2 >= 0) {
                            int iM3383 = c1660.m3383(i2);
                            if (!((iM3383 >= 0 ? iM3383 : -1) >= 0)) {
                                throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + c1660);
                            }
                        }
                        this.f1897 = i;
                        this.f1898 = c0442;
                        this.f1899 = c1660;
                        this.f1900 = i2;
                        return;
                    } catch (NullPointerException unused) {
                        throw new NullPointerException("successors == null");
                    }
                }
                if (((AbstractC1649) c0442.m3062(i3)).f5588.f8208 != 1) {
                    throw new IllegalArgumentException(AbstractC1194.m2780(i3, "insns[", "] is a branch or can throw"));
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
        return "{" + AbstractC1460.m3223(this.f1897) + '}';
    }

    @Override // p000.InterfaceC1754
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int mo1576() {
        return this.f1897;
    }
}
