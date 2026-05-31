package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤝᤞᲁᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0656 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0656 f2539 = new C0656();

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        Object c2641;
        int iM3308;
        String[] strArr = AbstractC1471.f5234;
        try {
            C1576.f5470.getClass();
            if (C1576.m3460()) {
                dexKitBridge.getClass();
                C1335 c1335 = new C1335();
                C2012 c2012 = new C2012();
                C2012.m4012(c2012, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter");
                c2012.f6662 = new C2897("getBarGroupHeight", 5, false);
                c1335.f4794 = c2012;
                Method methodM3996 = ((C2005) dexKitBridge.m1048(c1335).m1598()).m3996(C1576.m3455());
                ArrayList arrayListM3477 = AbstractC1586.m3477(AbstractC1578.m3462(methodM3996.getDeclaringClass()), new C1029(methodM3996), "Landroid/view/View;->findViewById(I)Landroid/view/View;");
                C0655 c0655 = C0655.f2538;
                if (arrayListM3477.size() == 1) {
                    iM3308 = ((Number) arrayListM3477.get(0)).intValue();
                } else {
                    ArrayList arrayList = C3741.f11709;
                    C3741.m5315("chatView hostId use Default", null, 14);
                    iM3308 = AbstractC1468.m3308(AbstractC0972.m2596(EnumC3737.f11678) ? "bl9" : "b4u");
                }
                c0655.m2669(iM3308);
            }
            c2641 = C3554.UNIT;
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        if (C2642.m4616(c2641) != null) {
            ArrayList arrayList2 = C3741.f11709;
            C3741.m5315("chatView hostId find Failed", null, 14);
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
