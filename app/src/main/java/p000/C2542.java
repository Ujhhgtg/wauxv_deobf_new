package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᲈᲁᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2542 extends AbstractC2867 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2542 f8095;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8096;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8097;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8098;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8095 = new C2542("RemoveVoipLimitHook");
        f8096 = "限制";
        f8097 = "移除通话限制";
        f8098 = "将通话中无法使用部分功能的限制移除";
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        C2540 c2540 = C2540.f8093;
        String[] strArr = AbstractC1574.f5469;
        AbstractC1574.m3295(c2540, dexKitBridge, new C2537(0, "com.tencent.mm.plugin.multitalk.model", "Lcom/tencent/mm/autogen/events/MultiTalkActionEvent;"));
        AbstractC1574.m3295(C2541.f8094, dexKitBridge, new C2537(0, "com.tencent.mm.plugin.voip.model", "Lcom/tencent/mm/autogen/events/VoipCheckIsDeviceUsingEvent;"));
        AbstractC1574.m3295(C2539.f8092, dexKitBridge, new C2537(0, "com.tencent.mm.plugin.ipcall", "Lcom/tencent/mm/autogen/events/VoipCheckIsDeviceUsingEvent;"));
        AbstractC1574.m3295(C2538.f8091, dexKitBridge, new C2537(0, (AbstractC3471.m5079(EnumC3677.f11534) || AbstractC3471.m5080(EnumC3674.f11498)) ? "com.tencent.mm.voipmp.helper" : "com.tencent.mm.plugin_flutter_ilinkvoip.helper", "Lcom/tencent/mm/autogen/events/VoipCheckIsDeviceUsingEvent;"));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        Iterator it = AbstractC0745.m2212(C2540.f8093, C2541.f8094, C2539.f8092, C2538.f8091).iterator();
        while (it.hasNext()) {
            List listSingletonList = Collections.singletonList(AbstractC1574.m3315((AbstractC1021) it.next()));
            C2542 c2542 = f8095;
            C3689 c3689M4172 = C2309.m4172(c2542, listSingletonList);
            c2542.m3263(c3689M4172, new C2444(28));
            c3689M4172.m5352();
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f8098;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f8097;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f8096;
    }
}
