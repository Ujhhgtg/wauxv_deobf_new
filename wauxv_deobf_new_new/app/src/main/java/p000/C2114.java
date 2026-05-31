package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᛸᲇᲀᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2114 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2114 f7007 = new C2114();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static String m4067() {
        String[] strArr = AbstractC1471.f5234;
        if (AbstractC0972.m2597(EnumC3734.f11660)) {
            return "c37";
        }
        if (AbstractC0972.m2597(EnumC3734.f11659)) {
            return "c0g";
        }
        if (AbstractC0972.m2597(EnumC3734.f11658)) {
            return "bzy";
        }
        if (AbstractC0972.m2597(EnumC3734.f11656)) {
            return "byw";
        }
        if (AbstractC0972.m2597(EnumC3734.f11655)) {
            return "bxy";
        }
        if (AbstractC0972.m2597(EnumC3734.f11654)) {
            return "bx_";
        }
        if (AbstractC0972.m2597(EnumC3734.f11653)) {
            return "bw0";
        }
        if (AbstractC0972.m2597(EnumC3734.f11652)) {
            return "bvg";
        }
        if (AbstractC0972.m2597(EnumC3734.f11651)) {
            return "buz";
        }
        if (AbstractC0972.m2597(EnumC3734.f11650)) {
            return "bu9";
        }
        if (AbstractC0972.m2597(EnumC3734.f11649)) {
            return "btr";
        }
        if (AbstractC0972.m2597(EnumC3734.f11648)) {
            return "bvm";
        }
        if (AbstractC0972.m2597(EnumC3734.f11647)) {
            return "bv7";
        }
        if (AbstractC0972.m2597(EnumC3734.f11646)) {
            return "br2";
        }
        if (AbstractC0972.m2597(EnumC3734.f11645)) {
            return "bqh";
        }
        if (AbstractC0972.m2597(EnumC3734.f11644)) {
            return "bm8";
        }
        if (AbstractC0972.m2597(EnumC3734.f11643)) {
            return "bi0";
        }
        if (AbstractC0972.m2597(EnumC3734.f11642)) {
            return "bdv";
        }
        return AbstractC0972.m2596(EnumC3737.f11678) ? "bkj" : "b4_";
    }

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
                c1335.m3156("com.tencent.mm.ui.chatting.adapter");
                C2012 c2012 = new C2012();
                c2012.m4021("MicroMsg.ChattingDataAdapterV3", "_onBindViewHolder[");
                c1335.f4794 = c2012;
                Method methodM3996 = ((C2005) dexKitBridge.m1048(c1335).m1598()).m3996(C1576.m3455());
                Class<?> declaringClass = methodM3996.getDeclaringClass();
                ArrayList arrayListM3477 = AbstractC1586.m3477(AbstractC1578.m3462(declaringClass), new C1029(methodM3996), "Landroid/view/View;->findViewById(I)Landroid/view/View;");
                C2113 c2113 = C2113.f7006;
                if (arrayListM3477.size() == 1) {
                    iM3308 = ((Number) arrayListM3477.get(0)).intValue();
                } else {
                    ArrayList arrayList = C3741.f11709;
                    C3741.m5315("msgLayout hostId use Default", null, 14);
                    iM3308 = AbstractC1468.m3308(m4067());
                }
                c2113.m2669(iM3308);
            }
            c2641 = C3554.UNIT;
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        if (C2642.m4616(c2641) != null) {
            ArrayList arrayList2 = C3741.f11709;
            C3741.m5315("msgLayout hostId find Failed", null, 14);
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
