package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲀᲈᲁᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0219 extends AbstractC2927 implements InterfaceC1592 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0219 f1376;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f1377;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f1378;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f1379;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final boolean f1380;

    static {
        String[] strArr = AbstractC1471.f5234;
        f1376 = new C0219("AppBrandForceShareHook");
        f1377 = "小程序";
        f1378 = "程序强制分享";
        f1379 = "程序强制可转发给朋友或分享到朋友圈";
        f1380 = true;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f1379;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f1378;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f1377;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final boolean mo1277() {
        return f1380;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m1385(C1574 c1574, CharSequence charSequence, boolean z) {
        if (mo3445() && z) {
            String[] strArr = AbstractC1471.f5234;
            boolean z2 = true;
            boolean z3 = AbstractC1469.m3322(charSequence, "转发给朋友") || AbstractC1469.m3322(charSequence, "分享到朋友圈");
            boolean z4 = AbstractC1469.m3322(charSequence, "轉發給朋友") || AbstractC1469.m3322(charSequence, "分享到朋友圈");
            if (!AbstractC1469.m3322(charSequence, "Send to Chat") && !AbstractC1469.m3322(charSequence, "Share on Moments")) {
                z2 = false;
            }
            if (z3 || z4 || z2) {
                c1574.getClass();
                new C0383(4, 6, c1574).m1714(Boolean.FALSE);
            }
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
