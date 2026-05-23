package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲀᲁᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0200 extends AbstractC2867 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0200 f1277;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f1278;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f1279;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f1280;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1277 = new C0200("AntiSnsAutoPlayHook");
        f1278 = "朋友圈";
        f1279 = "拦截朋友圈播放";
        f1280 = "拦截朋友圈上下滑动时会自动播放视频";
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        int i = AbstractC1745.f5844;
        String[] strArr = AbstractC1574.f5469;
        C1973 c1973M3492 = AbstractC0968.m2483(AbstractC2201.m3988("com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC")).m3492();
        c1973M3492.f6370 = "onScrollStateChangedInMain";
        c1973M3492.f4485 = 3;
        C1982 c1982 = (C1982) AbstractC0744.m2191(c1973M3492.m3799());
        C0200 c0200 = f1277;
        C3689 c3689M4174 = c0200.m4174(c1982, 1);
        c0200.m3263(c3689M4174, new C0199(0));
        c3689M4174.m5352();
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f1280;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f1279;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f1278;
    }
}
