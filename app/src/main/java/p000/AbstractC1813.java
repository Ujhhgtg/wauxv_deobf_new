package p000;

import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1813 implements InterfaceC2654 {

    public final InterfaceC2654 f6051;

    public AbstractC1813(InterfaceC2654 interfaceC2654) {
        this.f6051 = interfaceC2654;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1813)) {
            return false;
        }
        AbstractC1813 abstractC1813 = (AbstractC1813) obj;
        return AbstractC2207.m4087(this.f6051, abstractC1813.f6051) && AbstractC2207.m4087(mo1342(), abstractC1813.mo1342());
    }

    public final int hashCode() {
        return mo1342().hashCode() + (this.f6051.hashCode() * 31);
    }

    public final String toString() {
        return mo1342() + '(' + this.f6051 + ')';
    }

    @Override // p000.InterfaceC2654
    public final int mo3471(String str) {
        Integer numM4853 = AbstractC2848.m4853(str);
        if (numM4853 != null) {
            return numM4853.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // p000.InterfaceC2654
    public final AbstractC1460 mo3472() {
        return C2851.f9112;
    }

    @Override // p000.InterfaceC2654
    public final int mo3473() {
        return 1;
    }

    @Override // p000.InterfaceC2654
    public final String mo3474(int i) {
        return String.valueOf(i);
    }

    @Override // p000.InterfaceC2654
    public final List mo3475(int i) {
        if (i >= 0) {
            return C1189.f4329;
        }
        StringBuilder sbM2787 = AbstractC1194.m2787(i, "Illegal index ", ", ");
        sbM2787.append(mo1342());
        sbM2787.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM2787.toString().toString());
    }

    @Override // p000.InterfaceC2654
    public final InterfaceC2654 mo3476(int i) {
        if (i >= 0) {
            return this.f6051;
        }
        StringBuilder sbM2787 = AbstractC1194.m2787(i, "Illegal index ", ", ");
        sbM2787.append(mo1342());
        sbM2787.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM2787.toString().toString());
    }

    @Override // p000.InterfaceC2654
    public final boolean mo3477(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbM2787 = AbstractC1194.m2787(i, "Illegal index ", ", ");
        sbM2787.append(mo1342());
        sbM2787.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM2787.toString().toString());
    }
}
