package p000;

import android.content.ComponentName;
import android.content.Intent;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤝᲁᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2213 extends AbstractC2867 implements InterfaceC1602 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2213 f7188;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f7189;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f7190;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f7191;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final boolean f7192;

    /* JADX WARN: Code duplicated, block: B:11:0x005c  */
    static {
        boolean z;
        String[] strArr = AbstractC1574.f5469;
        f7188 = new C2213("NewBizListHook");
        f7189 = "订阅号";
        f7190 = "订阅消息列表";
        f7191 = "订阅号消息从瀑布流模式改为列表模式";
        EnumC3677 enumC3677 = EnumC3677.f11542;
        C1565 c1565 = C1565.f5440;
        c1565.getClass();
        if (C1565.m3278() > enumC3677.f11548 || C1565.m3280()) {
            EnumC3674 enumC3674 = EnumC3674.f11508;
            c1565.getClass();
            if (C1565.m3278() > enumC3674.f11513 || !C1565.m3280()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        f7192 = z;
    }

    @Override // p000.InterfaceC1602
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1407(C1563 c1563, Intent intent) {
        String[] strArr = AbstractC1574.f5469;
        if (mo3264() && f7192) {
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
                C1565.f5440.getClass();
                intent.setComponent(new ComponentName(C1565.m3277(), "com.tencent.mm.ui.conversation.NewBizConversationUI"));
            }
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f7191;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f7190;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f7189;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final boolean mo4142() {
        return f7192;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
