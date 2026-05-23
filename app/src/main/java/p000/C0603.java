package p000;

import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᤝᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0603 extends AbstractC2867 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0603 f2421;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2422;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f2423;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f2424;

    static {
        String[] strArr = AbstractC1574.f5469;
        f2421 = new C0603("ChatFavVoiceFilterForwardHook");
        f2422 = "收藏";
        f2423 = "聊天收藏语音过滤转发";
        f2424 = "在我的收藏搜索列表中不过滤语音消息";
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.m3295(C0602.f2420, dexKitBridge, new C0316(16));
        AbstractC1574.m3295(C0601.f2419, dexKitBridge, new C0316(18));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        int i = AbstractC1745.f5844;
        String[] strArr = AbstractC1574.f5469;
        C1973 c1973M3492 = AbstractC0968.m2483(AbstractC2201.m3988("com.tencent.mm.plugin.fav.ui.FavSelectUI")).m3492();
        c1973M3492.f6370 = "onCreate";
        C1982 c1982 = (C1982) AbstractC0744.m2191(c1973M3492.m3799());
        C0603 c0603 = f2421;
        C3689 c3689M4174 = c0603.m4174(c1982, 1);
        c0603.m3263(c3689M4174, new C0316(19));
        c3689M4174.m5352();
        AbstractC1574.m3316(C0602.f2420, new C0316(20));
        AbstractC1574.m3316(C0601.f2419, new C0316(21));
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f2424;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f2423;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f2422;
    }
}
