package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᤝᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0435 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1994;

    public /* synthetic */ C0435(int i) {
        this.f1994 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m1637(C1676 c1676, C0963 c0963) {
        switch (this.f1994) {
            case 0:
                return new C0434((C1901) c1676.f5658, 0);
            case 1:
                return new C0735((C1901) c1676.f5658);
            case 2:
                return new C0737((C1901) c1676.f5658);
            case 3:
                return new C1184(0);
            case 4:
                return new C1525((C1901) c1676.f5658, ((Integer) AbstractC2665.f8583.m4384(c0963)).intValue());
            case 5:
                return new C1797((C1901) c1676.f5658, (String) AbstractC2665.f8584.m4384(c0963), (InterfaceC1796) c1676.f5662);
            case 6:
                C1901 c1901 = (C1901) c1676.f5658;
                return EnumC0871.f3299 == AbstractC2665.f8580.m4384(c0963) ? new C0513(c1901, ((Integer) AbstractC2665.f8581.m4384(c0963)).intValue()) : new C2305(c1901, String.valueOf(AbstractC2665.f8582.m4384(c0963)).concat(". "));
            case 7:
                return new C1184(1);
            default:
                return new C0434((C1901) c1676.f5658, 1);
        }
    }
}
