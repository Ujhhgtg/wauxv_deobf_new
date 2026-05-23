package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0403 implements InterfaceC1648, InterfaceC0541 {

    public int f1901;

    @Override // p000.InterfaceC1648
    public void mo1579(C2923 c2923) {
        m1595(c2923);
    }

    @Override // p000.InterfaceC1648
    public void mo1581(C2351 c2351) {
        m1595(c2351);
    }

    @Override // p000.InterfaceC1648
    public void mo1582(C1329 c1329) {
        m1595(c1329);
    }

    @Override // p000.InterfaceC1648
    public void mo1583(C2350 c2350) {
        m1595(c2350);
    }

    @Override // p000.InterfaceC1648
    public void mo1584(C1674 c1674) {
        m1595(c1674);
    }

    @Override // p000.InterfaceC0541
    public int mo1587() {
        return this.f1901;
    }

    @Override // p000.InterfaceC1648
    public void mo1588(C2868 c2868) {
        m1595(c2868);
    }

    @Override // p000.InterfaceC1648
    public void mo1589(C2868 c2868) {
        m1595(c2868);
    }

    public byte[] m1592(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf((byte) (b ^ ((byte) this.f1901))));
        }
        return AbstractC0744.m2203(arrayList);
    }

    public byte[] m1593(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf((byte) (b ^ ((byte) this.f1901))));
        }
        return AbstractC0744.m2203(arrayList);
    }

    public int mo1594() {
        int i = this.f1901;
        this.f1901 = i + 1;
        return i;
    }

    public void m1595(AbstractC1649 abstractC1649) {
        C2525 c2525 = abstractC1649.f5590;
        if (c2525 != null) {
            int iM4540 = c2525.m4540() + c2525.f8055;
            if (iM4540 > this.f1901) {
                this.f1901 = iM4540;
            }
        }
        C2526 c2526 = abstractC1649.f5591;
        int length = c2526.f4836.length;
        for (int i = 0; i < length; i++) {
            C2525 c2527 = (C2525) c2526.m3062(i);
            int iM4541 = c2527.m4540() + c2527.f8055;
            if (iM4541 > this.f1901) {
                this.f1901 = iM4541;
            }
        }
    }

    public C0403() {
        this.f1901 = -1;
    }

    @Override // p000.InterfaceC0541
    public void mo1585(int i, int i2) {
    }

    @Override // p000.InterfaceC0541
    public void mo1591(int i, int i2, C3448 c3448) {
    }

    @Override // p000.InterfaceC0541
    public void mo1577(int i, int i2, C0918 c0918, ArrayList arrayList) {
    }

    @Override // p000.InterfaceC0541
    public void mo1586(int i, int i2, C1242 c1242, int i3) {
    }

    @Override // p000.InterfaceC0541
    public void mo1590(int i, int i2, int i3, int i4) {
    }

    @Override // p000.InterfaceC0541
    public void mo1580(int i, int i2, int i3, AbstractC0777 abstractC0777, int i4) {
    }

    @Override // p000.InterfaceC0541
    public void mo1578(int i, int i2, int i3, int i4, C3448 c3448, int i5) {
    }
}
