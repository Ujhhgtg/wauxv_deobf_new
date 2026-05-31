package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᛸᤝᲇᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2821 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2821 f9012 = new C2821();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static String m4767() {
        String[] strArr = AbstractC1471.f5234;
        if (AbstractC0972.m2597(EnumC3734.f11658)) {
            return "j90";
        }
        if (AbstractC0972.m2597(EnumC3734.f11656)) {
            return "j44";
        }
        if (AbstractC0972.m2597(EnumC3734.f11655)) {
            return "j17";
        }
        if (AbstractC0972.m2597(EnumC3734.f11654)) {
            return "j0_";
        }
        if (AbstractC0972.m2597(EnumC3734.f11653)) {
            return "iw_";
        }
        if (AbstractC0972.m2597(EnumC3734.f11652)) {
            return "ite";
        }
        if (AbstractC0972.m2597(EnumC3734.f11651)) {
            return "irm";
        }
        if (AbstractC0972.m2597(EnumC3734.f11650)) {
            return "iok";
        }
        if (AbstractC0972.m2597(EnumC3734.f11649)) {
            return "im3";
        }
        if (AbstractC0972.m2597(EnumC3734.f11648)) {
            return "iir";
        }
        if (AbstractC0972.m2597(EnumC3734.f11647)) {
            return "ifd";
        }
        if (AbstractC0972.m2597(EnumC3734.f11646)) {
            return "i0z";
        }
        if (AbstractC0972.m2597(EnumC3734.f11645)) {
            return "hzd";
        }
        if (AbstractC0972.m2597(EnumC3734.f11644)) {
            return "hk5";
        }
        if (AbstractC0972.m2597(EnumC3734.f11643)) {
            return "h1_";
        }
        if (AbstractC0972.m2597(EnumC3734.f11642)) {
            return "gmh";
        }
        return AbstractC0972.m2596(EnumC3737.f11678) ? "hbs" : "oez";
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
                C2012 c2012 = new C2012();
                c2012.m4021("com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$recycleView$2");
                c1335.f4794 = c2012;
                Method methodM3996 = ((C2005) dexKitBridge.m1048(c1335).m1598()).m3996(C1576.m3455());
                Class<?> declaringClass = methodM3996.getDeclaringClass();
                ArrayList arrayListM3477 = AbstractC1586.m3477(AbstractC1578.m3462(declaringClass), new C1029(methodM3996), "Lcom/tencent/mm/ui/vas/VASActivityJava;->findViewById(I)Landroid/view/View;");
                C2820 c2820 = C2820.f9011;
                if (arrayListM3477.size() == 1) {
                    iM3308 = ((Number) arrayListM3477.get(0)).intValue();
                } else {
                    ArrayList arrayList = C3741.f11709;
                    C3741.m5315("snsRvLayout hostId use Default", null, 14);
                    iM3308 = AbstractC1468.m3308(m4767());
                }
                c2820.m2669(iM3308);
            }
            c2641 = C3554.UNIT;
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        if (C2642.m4616(c2641) != null) {
            ArrayList arrayList2 = C3741.f11709;
            C3741.m5315("snsRvLayout hostId find Failed", null, 14);
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
