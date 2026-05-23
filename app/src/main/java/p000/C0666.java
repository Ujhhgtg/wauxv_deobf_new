package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤝᲇᤞᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0666 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0666 f2546 = new C0666();

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
                C1981.m3818(c1981, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter");
                c1981.f6557 = new C2837("getBarGroupHeight", 5, false);
                c1333.f4794 = c1981;
                Method methodM3802 = ((C1974) dexKitBridge.m904(c1333).m1493()).m3802(C1565.m3275());
                ArrayList arrayListM3974 = AbstractC2201.m3974(AbstractC1567.m3282(methodM3802.getDeclaringClass()), new C1026(methodM3802), "Landroid/view/View;->findViewById(I)Landroid/view/View;");
                C0665 c0665 = C0665.f2545;
                if (arrayListM3974.size() == 1) {
                    iM2475 = ((Number) arrayListM3974.get(0)).intValue();
                } else {
                    ArrayList arrayList = C3678.f11549;
                    C3678.m5306("chatView hostId use Default", null, 14);
                    iM2475 = AbstractC0968.m2475(AbstractC3471.m5079(EnumC3677.f11529) ? "bl9" : "b4u");
                }
                c0665.m2545(iM2475);
            }
            c2585 = C3497.f10997;
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        if (C2586.m4594(c2585) != null) {
            ArrayList arrayList2 = C3678.f11549;
            C3678.m5306("chatView hostId find Failed", null, 14);
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
