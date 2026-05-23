package p000;

import android.content.ComponentName;
import android.content.Intent;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2513 extends AbstractC2867 implements InterfaceC1602 {

    public static final C2513 f8034;

    public static final String f8035;

    public static final String f8036;

    public static final String f8037;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8034 = new C2513("RedPacketPrivateReceiveHook");
        f8035 = "红包";
        f8036 = "红包私聊领取";
        f8037 = "可在私聊发送自己可领取的拼手气红包";
    }

    @Override // p000.InterfaceC1602
    public final void mo1407(C1563 c1563, Intent intent) {
        String[] strArr = AbstractC1574.f5469;
        if (mo3264()) {
            ComponentName component = intent.getComponent();
            String className = component != null ? component.getClassName() : null;
            if (className != null) {
                int iHashCode = className.hashCode();
                if (iHashCode != -1765744774) {
                    if (iHashCode != 1306075868 || !className.equals("com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI")) {
                        return;
                    }
                } else if (!className.equals("com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI")) {
                    return;
                }
                intent.putExtra("key_type", 1);
            }
        }
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f8037;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f8036;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f8035;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
