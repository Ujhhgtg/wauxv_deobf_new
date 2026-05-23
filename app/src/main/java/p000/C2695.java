package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᤞᤝᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2695 extends AbstractC2867 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2695 f8691;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8692;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8693;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8694;

    static {
        AbstractC1574.m3300(-642548582316724L);
        String[] strArr = AbstractC1574.f5469;
        f8691 = new C2695("ShowChatroomInfoHook");
        f8692 = "界面";
        f8693 = "显示群聊详情";
        f8694 = "在对应的群聊界面中显示 群聊详情ID";
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        int i = 0;
        String[] strArr = AbstractC1574.f5469;
        C1744 c1744M2483 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.chatroom.ui.ChatroomInfoUI"));
        MethodResolver c1973M3492 = c1744M2483.m3492();
        c1973M3492.f6370 = "initView";
        C1982 c1982 = (C1982) AbstractC0744.firstInList(c1973M3492.m3799());
        C2695 c2695 = f8691;
        C3689 c3689M4174 = c2695.m4174(c1982, 1);
        c2695.m3262(c3689M4174, new C2659(10));
        c3689M4174.m5352();
        MethodResolver c1973M3493 = c1744M2483.m3492();
        c1973M3493.f6370 = "onPreferenceTreeClick";
        C3689 c3689M4175 = c2695.m4174((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{C3529.f11042, C2391.f7652.m4369()}, 2, c1973M3493), 1);
        c2695.m3263(c3689M4175, new C2659(11));
        c3689M4175.m5352();
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f8694;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f8693;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f8692;
    }
}
