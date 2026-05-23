package p000;

import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1712 extends AbstractC1459 {

    public final C0146 f5808;

    public C1712(C0146 c0146) {
        this.f5808 = c0146;
    }

    @Override // p000.InterfaceC0766
    public final int mo2230(InterfaceC2654 interfaceC2654) {
        throw new IllegalStateException("unsupported");
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final int mo2516() {
        C0146 c0146 = this.f5808;
        String strM1165 = c0146.m1165();
        try {
            C3477 c3477M3989 = AbstractC2201.m3989(strM1165);
            if (c3477M3989 != null) {
                return c3477M3989.f10972;
            }
            AbstractC2848.m4852(strM1165);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0146.m1152(c0146, AbstractC2784.m4749("Failed to parse type 'UInt' for input '", strM1165, '\''), 0, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final long mo2519() {
        C0146 c0146 = this.f5808;
        String strM1165 = c0146.m1165();
        try {
            C3482 c3482M3990 = AbstractC2201.m3990(strM1165);
            if (c3482M3990 != null) {
                return c3482M3990.f10979;
            }
            AbstractC2848.m4852(strM1165);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0146.m1152(c0146, AbstractC2784.m4749("Failed to parse type 'ULong' for input '", strM1165, '\''), 0, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final byte mo2521() {
        C3472 c3472;
        C0146 c0146 = this.f5808;
        String strM1165 = c0146.m1165();
        try {
            C3477 c3477M3989 = AbstractC2201.m3989(strM1165);
            if (c3477M3989 != null) {
                int i = c3477M3989.f10972;
                c3472 = Integer.compareUnsigned(i, 255) > 0 ? null : new C3472((byte) i);
            }
            if (c3472 != null) {
                return c3472.f10965;
            }
            AbstractC2848.m4852(strM1165);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0146.m1152(c0146, AbstractC2784.m4749("Failed to parse type 'UByte' for input '", strM1165, '\''), 0, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final short mo2522() {
        C3487 c3487;
        C0146 c0146 = this.f5808;
        String strM1165 = c0146.m1165();
        try {
            C3477 c3477M3989 = AbstractC2201.m3989(strM1165);
            if (c3477M3989 != null) {
                int i = c3477M3989.f10972;
                c3487 = Integer.compareUnsigned(i, 65535) > 0 ? null : new C3487((short) i);
            }
            if (c3487 != null) {
                return c3487.f10986;
            }
            AbstractC2848.m4852(strM1165);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0146.m1152(c0146, AbstractC2784.m4749("Failed to parse type 'UShort' for input '", strM1165, '\''), 0, 6);
            throw null;
        }
    }
}
