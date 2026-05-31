package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲇᤝᤞᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0750 implements InterfaceC0876, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC0876 f2843;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0874 f2844;

    public C0750(InterfaceC0876 interfaceC0876, InterfaceC0874 interfaceC0874) {
        this.f2843 = interfaceC0876;
        this.f2844 = interfaceC0874;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iM2327 = m2327();
        InterfaceC0876[] interfaceC0876Arr = new InterfaceC0876[iM2327];
        C2570 c2570 = new C2570();
        mo1084(C3554.UNIT, new C0748(interfaceC0876Arr, c2570, 0));
        if (c2570.f8190 == iM2327) {
            return new C0749(interfaceC0876Arr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        boolean zM3322;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0750) {
            C0750 c0750 = (C0750) obj;
            if (c0750.m2327() == m2327()) {
                C0750 c0751 = this;
                while (true) {
                    InterfaceC0874 interfaceC0874 = c0751.f2844;
                    if (!AbstractC1469.m3322(c0750.mo1086(interfaceC0874.getKey()), interfaceC0874)) {
                        zM3322 = false;
                        break;
                    }
                    InterfaceC0876 interfaceC0876 = c0751.f2843;
                    if (!(interfaceC0876 instanceof C0750)) {
                        InterfaceC0874 interfaceC0875 = (InterfaceC0874) interfaceC0876;
                        zM3322 = AbstractC1469.m3322(c0750.mo1086(interfaceC0875.getKey()), interfaceC0875);
                        break;
                    }
                    c0751 = (C0750) interfaceC0876;
                }
                if (zM3322) {
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
        return AbstractC1095.m2801(new StringBuilder("["), (String) mo1084("", new C0192(1)), ']');
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m2327() {
        int i = 2;
        C0750 c0750 = this;
        while (true) {
            InterfaceC0876 interfaceC0876 = c0750.f2843;
            c0750 = interfaceC0876 instanceof C0750 ? (C0750) interfaceC0876 : null;
            if (c0750 == null) {
                return i;
            }
            i++;
        }
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final InterfaceC0876 mo1083(InterfaceC0875 interfaceC0875) {
        InterfaceC0874 interfaceC0874 = this.f2844;
        InterfaceC0874 interfaceC0874Mo1086 = interfaceC0874.mo1086(interfaceC0875);
        InterfaceC0876 interfaceC0876 = this.f2843;
        if (interfaceC0874Mo1086 != null) {
            return interfaceC0876;
        }
        InterfaceC0876 interfaceC0876Mo1083 = interfaceC0876.mo1083(interfaceC0875);
        if (interfaceC0876Mo1083 == interfaceC0876) {
            return this;
        }
        return interfaceC0876Mo1083 == C1189.f4324 ? interfaceC0874 : new C0750(interfaceC0876Mo1083, interfaceC0874);
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public final Object mo1084(Object obj, InterfaceC1437 interfaceC1437) {
        return interfaceC1437.mo1342(this.f2843.mo1084(obj, interfaceC1437), this.f2844);
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final /* bridge */ InterfaceC0876 mo1085(InterfaceC0876 interfaceC0876) {
        return AbstractC1586.m3481(this, interfaceC0876);
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final InterfaceC0874 mo1086(InterfaceC0875 interfaceC0875) {
        C0750 c0750 = this;
        while (true) {
            InterfaceC0874 interfaceC0874Mo1086 = c0750.f2844.mo1086(interfaceC0875);
            if (interfaceC0874Mo1086 != null) {
                return interfaceC0874Mo1086;
            }
            InterfaceC0876 interfaceC0876 = c0750.f2843;
            if (!(interfaceC0876 instanceof C0750)) {
                return interfaceC0876.mo1086(interfaceC0875);
            }
            c0750 = (C0750) interfaceC0876;
        }
    }
}
