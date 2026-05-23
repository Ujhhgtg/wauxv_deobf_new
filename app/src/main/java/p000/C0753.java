package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲇᤞᲁᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0753 implements InterfaceC0877, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0877 f2843;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC0875 f2844;

    public C0753(InterfaceC0877 interfaceC0877, InterfaceC0875 interfaceC0875) {
        this.f2843 = interfaceC0877;
        this.f2844 = interfaceC0875;
    }

    public final boolean equals(Object obj) {
        boolean zM4087;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0753) {
            C0753 c0753 = (C0753) obj;
            int i = 2;
            C0753 c0754 = c0753;
            int i2 = 2;
            while (true) {
                InterfaceC0877 interfaceC0877 = c0754.f2843;
                c0754 = interfaceC0877 instanceof C0753 ? (C0753) interfaceC0877 : null;
                if (c0754 == null) {
                    break;
                }
                i2++;
            }
            C0753 c0755 = this;
            while (true) {
                InterfaceC0877 interfaceC0878 = c0755.f2843;
                c0755 = interfaceC0878 instanceof C0753 ? (C0753) interfaceC0878 : null;
                if (c0755 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                C0753 c0756 = this;
                while (true) {
                    InterfaceC0875 interfaceC0875 = c0756.f2844;
                    if (!AbstractC2207.m4087(c0753.mo942(interfaceC0875.getKey()), interfaceC0875)) {
                        zM4087 = false;
                        break;
                    }
                    InterfaceC0877 interfaceC0879 = c0756.f2843;
                    if (!(interfaceC0879 instanceof C0753)) {
                        InterfaceC0875 interfaceC0876 = (InterfaceC0875) interfaceC0879;
                        zM4087 = AbstractC2207.m4087(c0753.mo942(interfaceC0876.getKey()), interfaceC0876);
                        break;
                    }
                    c0756 = (C0753) interfaceC0879;
                }
                if (zM4087) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2844.hashCode() + this.f2843.hashCode();
    }

    public final String toString() {
        return AbstractC1194.m2786(new StringBuilder("["), (String) mo940("", new C0184(1)), ']');
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final InterfaceC0877 mo939(InterfaceC0876 interfaceC0876) {
        InterfaceC0875 interfaceC0875 = this.f2844;
        InterfaceC0875 interfaceC0875Mo942 = interfaceC0875.mo942(interfaceC0876);
        InterfaceC0877 interfaceC0877 = this.f2843;
        if (interfaceC0875Mo942 != null) {
            return interfaceC0877;
        }
        InterfaceC0877 interfaceC0877Mo939 = interfaceC0877.mo939(interfaceC0876);
        if (interfaceC0877Mo939 == interfaceC0877) {
            return this;
        }
        return interfaceC0877Mo939 == C1187.f4327 ? interfaceC0875 : new C0753(interfaceC0877Mo939, interfaceC0875);
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public final Object mo940(Object obj, InterfaceC1429 interfaceC1429) {
        return interfaceC1429.mo1196(this.f2843.mo940(obj, interfaceC1429), this.f2844);
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final /* bridge */ InterfaceC0877 mo941(InterfaceC0877 interfaceC0877) {
        return AbstractC2209.m4140(this, interfaceC0877);
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final InterfaceC0875 mo942(InterfaceC0876 interfaceC0876) {
        C0753 c0753 = this;
        while (true) {
            InterfaceC0875 interfaceC0875Mo942 = c0753.f2844.mo942(interfaceC0876);
            if (interfaceC0875Mo942 != null) {
                return interfaceC0875Mo942;
            }
            InterfaceC0877 interfaceC0877 = c0753.f2843;
            if (!(interfaceC0877 instanceof C0753)) {
                return interfaceC0877.mo942(interfaceC0876);
            }
            c0753 = (C0753) interfaceC0877;
        }
    }
}
