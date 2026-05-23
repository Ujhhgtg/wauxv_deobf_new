package p000;

import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1798 implements InterfaceC2654 {

    public final InterfaceC2654 f6007;

    public final InterfaceC2654 f6008;

    public C1798(InterfaceC2654 interfaceC2654, InterfaceC2654 interfaceC2655) {
        this.f6007 = interfaceC2654;
        this.f6008 = interfaceC2655;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1798)) {
            return false;
        }
        C1798 c1798 = (C1798) obj;
        return AbstractC2207.m4087(this.f6007, c1798.f6007) && AbstractC2207.m4087(this.f6008, c1798.f6008);
    }

    public final int hashCode() {
        return this.f6008.hashCode() + ((this.f6007.hashCode() + 710441009) * 31);
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f6007 + ", " + this.f6008 + ')';
    }

    @Override // p000.InterfaceC2654
    public final String mo1342() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // p000.InterfaceC2654
    public final int mo3471(String str) {
        Integer numM4853 = AbstractC2848.m4853(str);
        if (numM4853 != null) {
            return numM4853.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // p000.InterfaceC2654
    public final AbstractC1460 mo3472() {
        return C2851.f9113;
    }

    @Override // p000.InterfaceC2654
    public final int mo3473() {
        return 2;
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
        throw new IllegalArgumentException(AbstractC1194.m2780(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // p000.InterfaceC2654
    public final InterfaceC2654 mo3476(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1194.m2780(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f6007;
        }
        if (true) {
            return this.f6008;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // p000.InterfaceC2654
    public final boolean mo3477(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC1194.m2780(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }
}
