package p000;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3638 extends AbstractC1823 {

    public static final C3638 f11378 = new C3638();

    public static final List f11379;

    static {
        String[] strArr = AbstractC1574.f5469;
        f11379 = Collections.singletonList(new C3637("WAuxiliary_setting_pref", "WAuxiliary", new C3618(17)));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        int i = 0;
        String[] strArr = AbstractC1574.f5469;
        C1744 c1744M2483 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.plugin.setting.ui.setting.SettingsUI"));
        MethodResolver c1973M3492 = c1744M2483.m3492();
        c1973M3492.name = "onCreate";
        C1982 c1982 = (C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(Bundle.class)}, 1, c1973M3492);
        C3638 c3638 = f11378;
        C3689 c3689M4174 = c3638.m4174(c1982, 3);
        c3689M4174.m5350(new C3618(18));
        c3689M4174.applyHook();
        MethodResolver c1973M3493 = c1744M2483.m3492();
        c1973M3493.name = "onPreferenceTreeClick";
        C3689 c3689M4175 = c3638.m4174((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{C3529.f11042, C2391.f7652.m4369()}, 2, c1973M3493), 1);
        c3689M4175.m5351(new C3618(19));
        c3689M4175.applyHook();
    }
}
