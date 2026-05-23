package p000;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᤞᛸᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3638 extends AbstractC1823 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C3638 f11378 = new C3638();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final List f11379;

    static {
        String[] strArr = AbstractC1574.f5469;
        f11379 = Collections.singletonList(new C3637("WAuxiliary_setting_pref", "WAuxiliary", new C3618(17)));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        int i = AbstractC1745.f5844;
        String[] strArr = AbstractC1574.f5469;
        C1744 c1744M2483 = AbstractC0968.m2483(AbstractC2201.m3988("com.tencent.mm.plugin.setting.ui.setting.SettingsUI"));
        C1973 c1973M3492 = c1744M2483.m3492();
        c1973M3492.f6370 = "onCreate";
        C1982 c1982 = (C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(Bundle.class)}, 1, c1973M3492);
        C3638 c3638 = f11378;
        C3689 c3689M4174 = c3638.m4174(c1982, 3);
        c3689M4174.m5350(new C3618(18));
        c3689M4174.m5352();
        C1973 c1973M3493 = c1744M2483.m3492();
        c1973M3493.f6370 = "onPreferenceTreeClick";
        C3689 c3689M4175 = c3638.m4174((C1982) AbstractC2784.m4743(new Object[]{C3529.f11042, C2391.f7652.m4369()}, 2, c1973M3493), 1);
        c3689M4175.m5351(new C3618(19));
        c3689M4175.m5352();
    }
}
