package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᛸᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2761 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2761 f8850 = new C2761();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static String m4733() {
        String[] strArr = AbstractC1574.f5469;
        if (AbstractC3471.m5080(EnumC3674.f11509)) {
            return "j90";
        }
        if (AbstractC3471.m5080(EnumC3674.f11507)) {
            return "j44";
        }
        if (AbstractC3471.m5080(EnumC3674.f11506)) {
            return "j17";
        }
        if (AbstractC3471.m5080(EnumC3674.f11505)) {
            return "j0_";
        }
        if (AbstractC3471.m5080(EnumC3674.f11504)) {
            return "iw_";
        }
        if (AbstractC3471.m5080(EnumC3674.f11503)) {
            return "ite";
        }
        if (AbstractC3471.m5080(EnumC3674.f11502)) {
            return "irm";
        }
        if (AbstractC3471.m5080(EnumC3674.f11501)) {
            return "iok";
        }
        if (AbstractC3471.m5080(EnumC3674.f11500)) {
            return "im3";
        }
        if (AbstractC3471.m5080(EnumC3674.f11499)) {
            return "iir";
        }
        if (AbstractC3471.m5080(EnumC3674.f11498)) {
            return "ifd";
        }
        if (AbstractC3471.m5080(EnumC3674.f11497)) {
            return "i0z";
        }
        if (AbstractC3471.m5080(EnumC3674.f11496)) {
            return "hzd";
        }
        if (AbstractC3471.m5080(EnumC3674.f11495)) {
            return "hk5";
        }
        if (AbstractC3471.m5080(EnumC3674.f11494)) {
            return "h1_";
        }
        if (AbstractC3471.m5080(EnumC3674.f11493)) {
            return "gmh";
        }
        return AbstractC3471.m5079(EnumC3677.f11529) ? "hbs" : "oez";
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        Object c2585;
        int iM2475;
        String[] strArr = AbstractC1574.f5469;
        try {
            C1565.f5440.getClass();
            if (C1565.m3280()) {
                dexKitBridge.getClass();
                C1333 c1333 = new C1333(4);
                C1981 c1981 = new C1981(4);
                c1981.m3827("com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$recycleView$2");
                c1333.f4794 = c1981;
                Method methodM3802 = ((C1974) dexKitBridge.m904(c1333).m1493()).m3802(C1565.m3275());
                Class<?> declaringClass = methodM3802.getDeclaringClass();
                ArrayList arrayListM3974 = AbstractC2201.m3974(AbstractC1567.m3282(declaringClass), new C1026(methodM3802), "Lcom/tencent/mm/ui/vas/VASActivityJava;->findViewById(I)Landroid/view/View;");
                C2760 c2760 = C2760.f8849;
                if (arrayListM3974.size() == 1) {
                    iM2475 = ((Number) arrayListM3974.get(0)).intValue();
                } else {
                    ArrayList arrayList = C3678.f11549;
                    C3678.m5306("snsRvLayout hostId use Default", null, 14);
                    iM2475 = AbstractC0968.m2475(m4733());
                }
                c2760.m2545(iM2475);
            }
            c2585 = C3497.f10997;
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        if (C2586.m4594(c2585) != null) {
            ArrayList arrayList2 = C3678.f11549;
            C3678.m5306("snsRvLayout hostId find Failed", null, 14);
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
