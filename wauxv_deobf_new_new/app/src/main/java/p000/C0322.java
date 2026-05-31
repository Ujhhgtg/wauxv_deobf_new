package p000;

import android.os.Bundle;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᤝᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0322 extends AbstractC2927 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0322 f1611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f1612;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f1613;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f1614;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C0316 f1615;

    static {
        String[] strArr = AbstractC1471.f5234;
        f1611 = new C0322("AutoLoginWinHook");
        f1612 = "杂项";
        f1613 = "自动点击登录";
        f1614 = "微信请求登录时自动勾选项及点击按钮";
        f1615 = new C0316(2);
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        int i = AbstractC1768.f5906;
        String[] strArr = AbstractC1471.f5234;
        C1681 c1681M4712 = AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI"));
        C2004 c2004M3560 = c1681M4712.m3560();
        c2004M3560.f6475 = "onCreate";
        C2013 c2013 = (C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(Bundle.class)}, 1, c2004M3560);
        C0322 c0322 = f1611;
        C3752 c3752M4303 = c0322.m4303(c2013, 1);
        c0322.m3444(c3752M4303, new C0316(3));
        c3752M4303.m5360();
        C2004 c2004M3561 = c1681M4712.m3560();
        c2004M3561.f6475 = "initView";
        C3752 c3752M4304 = c0322.m4303((C2013) AbstractC1095.m2793(c2004M3561), 1);
        c0322.m3443(c3752M4304, new C0316(4));
        c3752M4304.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f1614;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f1613;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f1612;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f1615;
    }
}
