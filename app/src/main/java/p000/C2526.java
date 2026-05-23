package p000;

import java.util.BitSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2526 extends AbstractC1352 implements InterfaceC3454 {

    public static final C2526 f8058 = new C2526(0);

    public static C2526 m4546(C2525 c2525) {
        C2526 c2526 = new C2526(1);
        c2526.m3063(0, c2525);
        return c2526;
    }

    public static C2526 m4547(C2525 c2525, C2525 c2526) {
        C2526 c2527 = new C2526(2);
        c2527.m3063(0, c2525);
        c2527.m3063(1, c2526);
        return c2527;
    }

    @Override // p000.AbstractC1352, p000.InterfaceC3454
    public final C3448 getType(int i) {
        C3448 type = ((C2525) m3062(i)).f8056.getType();
        
        return type;
    }

    @Override // p000.InterfaceC3454
    public final InterfaceC3454 mo1262(C3448 c3448) {
        throw new UnsupportedOperationException("unsupported");
    }

    public final int m4548() {
        int length = this.f4836.length;
        int iM4966 = 0;
        for (int i = 0; i < length; i++) {
            iM4966 += getType(i).m4966();
        }
        return iM4966;
    }

    public final C2526 m4549(boolean z, BitSet bitSet) {
        Object[] objArr = this.f4836;
        int length = objArr.length;
        if (length == 0) {
            return this;
        }
        C2526 c2526 = new C2526(objArr.length);
        int i = 0;
        int iM4540 = 0;
        while (i < length) {
            C2525 c2525M4544 = (C2525) m3062(i);
            if (bitSet == null || !bitSet.get(i)) {
                c2525M4544 = c2525M4544.m4544(iM4540);
                if (!z) {
                    iM4540 += c2525M4544.m4540();
                }
            }
            c2526.m3063(i, c2525M4544);
            i++;
            z = false;
        }
        if (!this.f6944) {
            c2526.f6944 = false;
        }
        return c2526;
    }

    public final C2526 m4550(int i) {
        int length = this.f4836.length;
        if (length == 0) {
            return this;
        }
        C2526 c2526 = new C2526(length);
        for (int i2 = 0; i2 < length; i2++) {
            C2525 c2525M4544 = (C2525) m3062(i2);
            if (i != 0) {
                c2525M4544 = c2525M4544.m4544(c2525M4544.f8055 + i);
            }
            c2526.m3063(i2, c2525M4544);
        }
        if (!this.f6944) {
            c2526.f6944 = false;
        }
        return c2526;
    }
}
