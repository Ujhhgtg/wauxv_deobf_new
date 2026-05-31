package p000;

import android.content.Context;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᲇᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1172 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1172 f4298 = new C1172();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static String m2906(String str) {
        int i = AbstractC1768.f5906;
        C1155.f4268.getClass();
        C2004 c2004M3560 = AbstractC2727.m4713(C1155.m2904()).m3560();
        c2004M3560.f6648 = AbstractC2574.m4549(String.class);
        return (String) ((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(Context.class), AbstractC2574.m4549(String.class)}, 2, c2004M3560)).m4026(null, str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static void m2907(C1172 c1172, String str, Object obj) {
        c1172.getClass();
        int i = AbstractC1768.f5906;
        C1155.f4268.getClass();
        C2004 c2004M3560 = AbstractC2727.m4713(C1155.m2904()).m3560();
        c2004M3560.f6648 = Void.TYPE;
        c2004M3560.f4481 = new C1164(4);
        C2013 c2013 = (C2013) AbstractC0739.m2290(c2004M3560.m3993());
        int parameterCount = c2013.f6671.getParameterCount();
        if (parameterCount == 4) {
            c2013.m4025(str, obj, null, null);
        } else if (parameterCount != 5) {
            c2013.m4025(str, obj, null);
        } else {
            c2013.m4025(str, obj, null, null, 0);
        }
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C1171.f4297, dexKitBridge, new C1164(2));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
