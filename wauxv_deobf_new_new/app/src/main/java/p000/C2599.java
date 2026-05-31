package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᛸᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2599 extends AbstractC2927 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2599 f8249;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f8250;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8251;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8252;

    static {
        String[] strArr = AbstractC1471.f5234;
        f8249 = new C2599("RemoveVoipLimitHook");
        f8250 = "限制";
        f8251 = "移除通话限制";
        f8252 = "将通话中无法使用部分功能的限制移除";
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        C2597 c2597 = C2597.f8247;
        String[] strArr = AbstractC1471.f5234;
        AbstractC0972.m2592(c2597, dexKitBridge, new C2594(0, "com.tencent.mm.plugin.multitalk.model", "Lcom/tencent/mm/autogen/events/MultiTalkActionEvent;"));
        AbstractC0972.m2592(C2598.f8248, dexKitBridge, new C2594(0, "com.tencent.mm.plugin.voip.model", "Lcom/tencent/mm/autogen/events/VoipCheckIsDeviceUsingEvent;"));
        AbstractC0972.m2592(C2596.f8246, dexKitBridge, new C2594(0, "com.tencent.mm.plugin.ipcall", "Lcom/tencent/mm/autogen/events/VoipCheckIsDeviceUsingEvent;"));
        AbstractC0972.m2592(C2595.f8245, dexKitBridge, new C2594(0, (AbstractC0972.m2596(EnumC3737.f11682) || AbstractC0972.m2597(EnumC3734.f11647)) ? "com.tencent.mm.voipmp.helper" : "com.tencent.mm.plugin_flutter_ilinkvoip.helper", "Lcom/tencent/mm/autogen/events/VoipCheckIsDeviceUsingEvent;"));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        Iterator it = AbstractC0740.m2311(C2597.f8247, C2598.f8248, C2596.f8246, C2595.f8245).iterator();
        while (it.hasNext()) {
            List listSingletonList = Collections.singletonList(AbstractC0972.m2610((AbstractC1024) it.next()));
            C2599 c2599 = f8249;
            C3752 c3752M4301 = C2342.m4301(c2599, listSingletonList);
            c2599.m3444(c3752M4301, new C2504(20));
            c3752M4301.m5360();
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f8252;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f8251;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f8250;
    }
}
