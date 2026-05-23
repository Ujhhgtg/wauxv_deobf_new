package p000;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲁᲀᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0821 extends AbstractC1823 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0821 f3212 = new C0821();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final LinkedHashSet f3213 = new LinkedHashSet();

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        int i = 0;
        String[] strArr = AbstractC1574.f5469;
        C1744 c1744M2483 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.plugin.profile.ui.ContactInfoUI"));
        MethodResolver c1973M3492 = c1744M2483.m3492();
        c1973M3492.name = "initView";
        C1982 c1982 = (C1982) AbstractC0744.firstInList(c1973M3492.resolve());
        C0821 c0821 = f3212;
        C3689 c3689M4174 = c0821.m4174(c1982, 1);
        c3689M4174.m5350(new C0807(12));
        c3689M4174.applyHook();
        MethodResolver c1973M3493 = c1744M2483.m3492();
        c1973M3493.name = "onPreferenceTreeClick";
        C3689 c3689M4175 = c0821.m4174((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{C3529.f11042, C2391.f7652.m4369()}, 2, c1973M3493), 1);
        c3689M4175.m5351(new C0807(13));
        c3689M4175.applyHook();
    }
}
