package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᤞᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2782 extends AbstractC2927 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2782 f8943;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f8944;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8945;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8946;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8947;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C2751 f8948;

    static {
        String[] strArr = AbstractC1471.f5234;
        f8943 = new C2782("SnsBackPreviewSaveHook");
        C2933 c2933 = AbstractC2381.f7642;
        f8944 = AbstractC2381.m4344("Download", "Sns");
        f8945 = "朋友圈";
        f8946 = "朋友圈封面保存";
        f8947 = "支持长按朋友圈封面保存到本地存储中";
        f8948 = new C2751(11);
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        String[] strArr = AbstractC1471.f5234;
        for (String str : AbstractC0740.m2311("com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview", "com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview")) {
            int i = AbstractC1768.f5906;
            C2004 c2004M3560 = AbstractC2727.m4712(AbstractC0972.m2606(str)).m3560();
            c2004M3560.f6475 = "loadCover";
            C2013 c2013 = (C2013) AbstractC0739.m2290(c2004M3560.m3993());
            C2782 c2782 = f8943;
            C3752 c3752M4303 = c2782.m4303(c2013, 1);
            c2782.m3443(c3752M4303, new C2751(12));
            c3752M4303.m5360();
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f8947;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f8946;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f8945;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f8948;
    }
}
