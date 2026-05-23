package p000;

import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2632 extends AbstractC2867 {

    public static final C2632 f8521;

    public static final List f8522;

    public static final String f8523;

    public static final String f8524;

    public static final String f8525;

    public static final C2544 f8526;

    static {
        AbstractC1574.m3300(-578721073330868L);
        AbstractC1574.m3300(-578789792807604L);
        String[] strArr = AbstractC1574.f5469;
        f8521 = new C2632("SayHiAutoRemarkNameHook");
        f8522 = AbstractC0745.listOf("${nick}", "${time}");
        f8523 = "杂项";
        f8524 = "添加自动备注";
        f8525 = "添加好友时将备注进行自定义格式处理";
        f8526 = new C2544(24);
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        int i = 0;
        String[] strArr = AbstractC1574.f5469;
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI")).m3492();
        c1973M3492.name = "initView";
        C1982 c1982 = (C1982) AbstractC1194.m2778(c1973M3492);
        C2632 c2632 = f8521;
        C3689 c3689M4174 = c2632.m4174(c1982, 1);
        c2632.hookBefore(c3689M4174, new C2544(25));
        c3689M4174.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f8525;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f8524;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f8523;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f8526;
    }
}
