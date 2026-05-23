package p000;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2213 extends AbstractC2867 implements InterfaceC1602 {

    public static final C2213 f7188;

    public static final String f7189;

    public static final String f7190;

    public static final String f7191;

    public static final boolean f7192;

    /* JADX WARN: Code duplicated, block: B:11:0x005c  */
    static {
        boolean z;
        String[] strArr = AbstractC1574.f5469;
        f7188 = new C2213("NewBizListHook");
        f7189 = "订阅号";
        f7190 = "订阅消息列表";
        f7191 = "订阅号消息从瀑布流模式改为列表模式";
        WeChatVersions enumC3677 = WeChatVersions.f11542;
        C1565 c1565 = C1565.f5440;
        
        if (C1565.m3278() > enumC3677.f11548 || C1565.m3280()) {
            WeChatVersionsPlay enumC3674 = WeChatVersionsPlay.f11508;
            
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
                
                intent.setComponent(new ComponentName(C1565.m3277(), "com.tencent.mm.ui.conversation.NewBizConversationUI"));
            }
        }
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f7191;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f7190;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f7189;
    }

    @Override // p000.AbstractC2867
    public final boolean mo4142() {
        return f7192;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
