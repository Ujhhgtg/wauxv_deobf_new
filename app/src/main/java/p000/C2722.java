package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤝᤞᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2722 extends AbstractC2867 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2722 f8781;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8782;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8783;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8784;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final String f8785;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C2659 f8786;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8781 = new C2722("SnsBackPreviewSaveHook");
        C2873 c2873 = AbstractC2342.f7529;
        f8782 = AbstractC2342.m4330("Download", "Sns");
        f8783 = "朋友圈";
        f8784 = "朋友圈封面保存";
        f8785 = "支持长按朋友圈封面保存到本地存储中";
        f8786 = new C2659(19);
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        String[] strArr = AbstractC1574.f5469;
        for (String str : AbstractC0745.listOf("com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview", "com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview")) {
            int i = 0;
            MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC2201.m3988(str)).m3492();
            c1973M3492.name = "loadCover";
            C1982 c1982 = (C1982) AbstractC0744.firstInList(c1973M3492.resolve());
            C2722 c2722 = f8781;
            C3689 c3689M4174 = c2722.m4174(c1982, 1);
            c2722.m3262(c3689M4174, new C2659(20));
            c3689M4174.applyHook();
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f8785;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f8784;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f8783;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f8786;
    }
}
