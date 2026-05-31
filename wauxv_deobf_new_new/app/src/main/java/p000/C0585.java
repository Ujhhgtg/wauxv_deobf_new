package p000;

import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᤝᲁᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0585 extends AbstractC2927 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0585 f2388;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f2389;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2390;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f2391;

    static {
        String[] strArr = AbstractC1471.f5234;
        f2388 = new C0585("ChatFavVoiceFilterForwardHook");
        f2389 = "收藏";
        f2390 = "聊天收藏语音过滤转发";
        f2391 = "在我的收藏搜索列表中不过滤语音消息";
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C0584.f2387, dexKitBridge, new C0316(27));
        AbstractC0972.m2592(C0583.f2386, dexKitBridge, new C0316(29));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        int i = AbstractC1768.f5906;
        String[] strArr = AbstractC1471.f5234;
        C2004 c2004M3560 = AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.mm.plugin.fav.ui.FavSelectUI")).m3560();
        c2004M3560.f6475 = "onCreate";
        C2013 c2013 = (C2013) AbstractC0739.m2290(c2004M3560.m3993());
        C0585 c0585 = f2388;
        C3752 c3752M4303 = c0585.m4303(c2013, 1);
        c0585.m3444(c3752M4303, new C0581(0));
        c3752M4303.m5360();
        AbstractC0972.m2611(C0584.f2387, new C0581(1));
        AbstractC0972.m2611(C0583.f2386, new C0581(2));
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f2391;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f2390;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f2389;
    }
}
