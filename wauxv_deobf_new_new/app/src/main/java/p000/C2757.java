package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲁᛸᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2757 extends AbstractC2927 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2757 f8862;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f8863;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8864;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8865;

    static {
        AbstractC1471.m3394(-670272596212355L);
        String[] strArr = AbstractC1471.f5234;
        f8862 = new C2757("ShowChatroomInfoHook");
        f8863 = "界面";
        f8864 = "显示群聊详情";
        f8865 = "在对应的群聊界面中显示 群聊详情ID";
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        int i = AbstractC1768.f5906;
        String[] strArr = AbstractC1471.f5234;
        C1681 c1681M4712 = AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.mm.chatroom.ui.ChatroomInfoUI"));
        C2004 c2004M3560 = c1681M4712.m3560();
        c2004M3560.f6475 = "initView";
        C2013 c2013 = (C2013) AbstractC0739.m2290(c2004M3560.m3993());
        C2757 c2757 = f8862;
        C3752 c3752M4303 = c2757.m4303(c2013, 1);
        c2757.m3443(c3752M4303, new C2751(2));
        c3752M4303.m5360();
        C2004 c2004M3561 = c1681M4712.m3560();
        c2004M3561.f6475 = "onPreferenceTreeClick";
        C3752 c3752M4304 = c2757.m4303((C2013) AbstractC2844.m4777(new Object[]{C3588.f11197, C2444.f7796.m4390()}, 2, c2004M3561), 1);
        c2757.m3444(c3752M4304, new C2751(3));
        c3752M4304.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f8865;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f8864;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f8863;
    }
}
