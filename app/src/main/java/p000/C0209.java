package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0209 extends AbstractC2867 implements InterfaceC1580 {

    public static final C0209 f1302;

    public static final String f1303;

    public static final String f1304;

    public static final String f1305;

    public static final boolean f1306;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1302 = new C0209("AppBrandForceShareHook");
        f1303 = "小程序";
        f1304 = "程序强制分享";
        f1305 = "程序强制可转发给朋友或分享到朋友圈";
        f1306 = true;
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1305;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1304;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1303;
    }

    @Override // p000.AbstractC2867
    public final boolean mo1131() {
        return f1306;
    }

    public final void m1239(C1563 c1563, CharSequence charSequence, boolean z) {
        if (mo3264() && z) {
            String[] strArr = AbstractC1574.f5469;
            boolean z2 = true;
            boolean z3 = AbstractC2207.m4087(charSequence, "转发给朋友") || AbstractC2207.m4087(charSequence, "分享到朋友圈");
            boolean z4 = AbstractC2207.m4087(charSequence, "轉發給朋友") || AbstractC2207.m4087(charSequence, "分享到朋友圈");
            if (!AbstractC2207.m4087(charSequence, "Send to Chat") && !AbstractC2207.m4087(charSequence, "Share on Moments")) {
                z2 = false;
            }
            if (z3 || z4 || z2) {
                
                new C0408(4, 6, c1563).m1608(Boolean.FALSE);
            }
        }
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
