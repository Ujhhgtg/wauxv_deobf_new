package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᤞᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0728 extends AbstractC2867 implements InterfaceC1598 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0728 f2755;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2756;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f2757;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f2758;

    static {
        String[] strArr = AbstractC1574.f5469;
        f2755 = new C0728("ClearUserInfoHook");
        f2756 = "杂项";
        f2757 = "清空用户信息";
        f2758 = "清空用户的性别及国家省份等相关信息";
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f2758;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f2757;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f2756;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final void m2157(C1563 c1563, int i, byte[] bArr) {
        if (mo3264() && i == 1) {
            C2427 c2427 = C2427.f7718;
            
            C1991 c1991 = C1992.Companion;
            C1992 c1992 = (C1992) c2427.m4387(c1991.serializer(), bArr);
            c1992.f6624 = 0;
            String[] strArr = AbstractC1574.f5469;
            c1992.f6625 = "";
            c1992.f6626 = "";
            c1992.f6652 = "";
            InterfaceC1743 interfaceC1743Serializer = c1991.serializer();
            C0523 c0523 = new C0523();
            new C2438(c2427, new C1744(c0523), interfaceC1743Serializer.mo1363()).mo2798(interfaceC1743Serializer, c1992);
            int i2 = c0523.f2210;
            byte[] bArr2 = new byte[i2];
            AbstractC0270.m1382(c0523.f2209, 0, i2, bArr2, 2);
            c1563.m3272(bArr2);
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
