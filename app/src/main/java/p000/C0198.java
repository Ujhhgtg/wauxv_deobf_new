package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0198 extends AbstractC2867 {

    public static final C0198 f1271;

    public static final String f1272;

    public static final String f1273;

    public static final String f1274;

    public static final boolean f1275;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1271 = new C0198("AntiSnsAdInfo");
        f1272 = "朋友圈";
        f1273 = "拦截朋友圈广告";
        f1274 = "拦截浏览朋友圈出现各种碍眼广告项目";
        f1275 = true;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        int i = 0;
        C0796 c0796M3486 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.plugin.sns.storage.ADInfo")).m3486();
        c0796M3486.paramTypes(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(String.class)}, 1));
        C0798 c0798 = (C0798) AbstractC0744.firstInList(c0796M3486.m2344());
        C0198 c0198 = f1271;
        C3689 c3689M4174 = c0198.m4174(c0798, 1);
        c0198.hookBefore(c3689M4174, new C0105(29));
        c3689M4174.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1274;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1273;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1272;
    }

    @Override // p000.AbstractC2867
    public final boolean mo1131() {
        return f1275;
    }
}
