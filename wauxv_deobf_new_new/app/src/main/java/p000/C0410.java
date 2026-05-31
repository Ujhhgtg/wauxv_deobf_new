package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᲇᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0410 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1966;

    public /* synthetic */ C0410(int i) {
        this.f1966 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object m1743(C1927 c1927, C0967 c0967) {
        switch (this.f1966) {
            case 0:
                return new C0409((C1928) c1927.f6344, 0);
            case 1:
                return new C0730((C1928) c1927.f6344);
            case 2:
                return new C0732((C1928) c1927.f6344);
            case 3:
                return new C1186(0);
            case 4:
                return new C1537((C1928) c1927.f6344, ((Integer) AbstractC1470.f5228.m4405(c0967)).intValue());
            case 5:
                return new C1820((C1928) c1927.f6344, (String) AbstractC1470.f5229.m4405(c0967), (InterfaceC1819) c1927.f6346);
            case 6:
                C1928 c1928 = (C1928) c1927.f6344;
                return EnumC0870.f3306 == AbstractC1470.f5225.m4405(c0967) ? new C0490(c1928, ((Integer) AbstractC1470.f5226.m4405(c0967)).intValue()) : new C2338(c1928, String.valueOf(AbstractC1470.f5227.m4405(c0967)).concat(". "));
            case 7:
                return new C1186(1);
            default:
                return new C0409((C1928) c1927.f6344, 1);
        }
    }
}
