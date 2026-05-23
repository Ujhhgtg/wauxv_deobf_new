package p000;

import android.os.Bundle;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᤝᲀᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3636 extends AbstractC1823 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C3636 f11374 = new C3636();

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        if (AbstractC3471.m5079(WeChatVersions.f11544) || AbstractC3471.m5080(WeChatVersionsPlay.f11510)) {
            int i = 0;
            String[] strArr = AbstractC1574.f5469;
            MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI")).m3492();
            c1973M3492.f6370 = "onCreate";
            C3689 c3689M4174 = f11374.m4174((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(Bundle.class)}, 1, c1973M3492), 2);
            c3689M4174.m5350(new C3618(16));
            c3689M4174.m5352();
        }
    }
}
