package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᲁᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0378 implements InterfaceC1662, InterfaceC0518 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f1873;

    public /* synthetic */ C0378(int i) {
        this.f1873 = i;
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void mo1685(C2982 c2982) {
        m1701(c2982);
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public void mo1687(C2396 c2396) {
        m1701(c2396);
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public void mo1688(C1331 c1331) {
        m1701(c1331);
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public void mo1689(C2395 c2395) {
        m1701(c2395);
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public void mo1690(C1689 c1689) {
        m1701(c1689);
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int mo1693() {
        return this.f1873;
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public void mo1694(C2928 c2928) {
        m1701(c2928);
    }

    @Override // p000.InterfaceC1662
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public void mo1695(C2928 c2928) {
        m1701(c2928);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public byte[] m1698(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf((byte) (b ^ ((byte) this.f1873))));
        }
        return AbstractC0739.m2302(arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public byte[] m1699(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf((byte) (b ^ ((byte) this.f1873))));
        }
        return AbstractC0739.m2302(arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public int mo1700() {
        int i = this.f1873;
        this.f1873 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public void m1701(AbstractC1663 abstractC1663) {
        C2581 c2581 = abstractC1663.f5625;
        if (c2581 != null) {
            int iM4562 = c2581.m4562() + c2581.f8205;
            if (iM4562 > this.f1873) {
                this.f1873 = iM4562;
            }
        }
        C2582 c2582 = abstractC1663.f5626;
        int length = c2582.f4833.length;
        for (int i = 0; i < length; i++) {
            C2581 c2583 = (C2581) c2582.m3165(i);
            int iM4563 = c2583.m4562() + c2583.f8205;
            if (iM4563 > this.f1873) {
                this.f1873 = iM4563;
            }
        }
    }

    public C0378() {
        this.f1873 = -1;
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void mo1691(int i, int i2) {
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void mo1697(int i, int i2, C3505 c3505) {
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void mo1683(int i, int i2, C0917 c0917, ArrayList arrayList) {
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void mo1692(int i, int i2, C1244 c1244, int i3) {
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public void mo1696(int i, int i2, int i3, int i4) {
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public void mo1686(int i, int i2, int i3, AbstractC0775 abstractC0775, int i4) {
    }

    @Override // p000.InterfaceC0518
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void mo1684(int i, int i2, int i3, int i4, C3505 c3505, int i5) {
    }
}
