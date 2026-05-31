package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲇᤞᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0723 extends AbstractC2927 implements InterfaceC1610 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0723 f2749;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f2750;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2751;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f2752;

    static {
        String[] strArr = AbstractC1471.f5234;
        f2749 = new C0723("ClearUserInfoHook");
        f2750 = "杂项";
        f2751 = "清空用户信息";
        f2752 = "清空用户的性别及国家省份等相关信息";
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f2752;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f2751;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f2750;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m2249(C1574 c1574, int i, byte[] bArr) {
        if (mo3445() && i == 1) {
            C2480 c2480 = C2480.f7862;
            c2480.getClass();
            C2022 c2022 = C2023.Companion;
            C2023 c2023 = (C2023) c2480.m4408(c2022.serializer(), bArr);
            c2023.f6729 = 0;
            String[] strArr = AbstractC1471.f5234;
            c2023.f6730 = "";
            c2023.f6731 = "";
            c2023.f6757 = "";
            InterfaceC1767 interfaceC1767Serializer = c2022.serializer();
            C0500 c0500 = new C0500();
            new C2490(c2480, new C1681(c0500), interfaceC1767Serializer.mo1509()).mo2920(interfaceC1767Serializer, c2023);
            int i2 = c0500.f2166;
            byte[] bArr2 = new byte[i2];
            AbstractC0280.m1528(c0500.f2165, 0, i2, bArr2, 2);
            c1574.m3452(bArr2);
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
