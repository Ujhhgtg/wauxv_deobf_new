package p000;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲈᤝᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3698 extends AbstractC1850 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C3698 f11527 = new C3698();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final List f11528;

    static {
        String[] strArr = AbstractC1471.f5234;
        f11528 = Collections.singletonList(new C3697("WAuxiliary_setting_pref", "WAuxiliary", new C3681(9)));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        int i = AbstractC1768.f5906;
        String[] strArr = AbstractC1471.f5234;
        C1681 c1681M4712 = AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.mm.plugin.setting.ui.setting.SettingsUI"));
        C2004 c2004M3560 = c1681M4712.m3560();
        c2004M3560.f6475 = "onCreate";
        C2013 c2013 = (C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(Bundle.class)}, 1, c2004M3560);
        C3698 c3698 = f11527;
        C3752 c3752M4303 = c3698.m4303(c2013, 3);
        c3752M4303.m5358(new C3681(10));
        c3752M4303.m5360();
        C2004 c2004M3561 = c1681M4712.m3560();
        c2004M3561.f6475 = "onPreferenceTreeClick";
        C3752 c3752M4304 = c3698.m4303((C2013) AbstractC2844.m4777(new Object[]{C3588.f11197, C2444.f7796.m4390()}, 2, c2004M3561), 1);
        c3752M4304.m5359(new C3681(11));
        c3752M4304.m5360();
    }
}
