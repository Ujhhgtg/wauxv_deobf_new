package p000;

import java.util.Map;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲇᲁᲀᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0772 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0772 f2876 = new C0772();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static String m2365() {
        Object objInvoke = AbstractC0972.m2610(C0771.f2875).invoke(null, null);
        String[] strArr = AbstractC1471.f5234;
        "null cannot be cast to non-null type kotlin.collections.Map<*, *>";
        Object obj = ((Map) objInvoke).get("last_login_alias");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static String m2366() {
        Object objInvoke = AbstractC0972.m2610(C0771.f2875).invoke(null, null);
        String[] strArr = AbstractC1471.f5234;
        "null cannot be cast to non-null type kotlin.collections.Map<*, *>";
        Object obj = ((Map) objInvoke).get("login_weixin_username");
        "null cannot be cast to non-null type kotlin.String";
        return (String) obj;
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C0771.f2875, dexKitBridge, new C0661(22));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
