package p000;

import android.content.ComponentName;
import android.content.Intent;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᲁᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2244 extends AbstractC2927 implements InterfaceC1615 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2244 f7308;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f7309;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f7310;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f7311;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final boolean f7312;

    /* JADX WARN: Code duplicated, block: B:11:0x005c  */
    static {
        boolean z;
        String[] strArr = AbstractC1471.f5234;
        f7308 = new C2244("NewBizListHook");
        f7309 = "订阅号";
        f7310 = "订阅消息列表";
        f7311 = "订阅号消息从瀑布流模式改为列表模式";
        EnumC3737 enumC3737 = EnumC3737.f11689;
        C1576 c1576 = C1576.f5470;
        c1576.getClass();
        if (C1576.m3458() > enumC3737.f11695 || C1576.m3460()) {
            EnumC3734 enumC3734 = EnumC3734.f11657;
            c1576.getClass();
            if (C1576.m3458() > enumC3734.f11662 || !C1576.m3460()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        f7312 = z;
    }

    @Override // p000.InterfaceC1615
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1553(C1574 c1574, Intent intent) {
        String[] strArr = AbstractC1471.f5234;
        if (mo3445() && f7312) {
            ComponentName component = intent.getComponent();
            String className = component != null ? component.getClassName() : null;
            if (className != null) {
                int iHashCode = className.hashCode();
                if (iHashCode != -1870020680) {
                    if (iHashCode != 510348960 || !className.equals("com.tencent.mm.plugin.brandservice.ui.flutter.BizFlutterTLFlutterViewActivity")) {
                        return;
                    }
                } else if (!className.equals("com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI")) {
                    return;
                }
                C1576.f5470.getClass();
                intent.setComponent(new ComponentName(C1576.m3457(), "com.tencent.mm.ui.conversation.NewBizConversationUI"));
            }
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f7311;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f7310;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f7309;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final boolean mo4271() {
        return f7312;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
