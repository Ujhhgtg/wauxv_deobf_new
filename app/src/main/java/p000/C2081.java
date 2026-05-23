package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲈᲁᛸᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2081 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2081 f6883 = new C2081();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static String m3884() {
        String[] strArr = AbstractC1574.f5469;
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11511)) {
            return "c37";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11510)) {
            return "c0g";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11509)) {
            return "bzy";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11507)) {
            return "byw";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11506)) {
            return "bxy";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11505)) {
            return "bx_";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11504)) {
            return "bw0";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11503)) {
            return "bvg";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11502)) {
            return "buz";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11501)) {
            return "bu9";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11500)) {
            return "btr";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11499)) {
            return "bvm";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11498)) {
            return "bv7";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11497)) {
            return "br2";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11496)) {
            return "bqh";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11495)) {
            return "bm8";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11494)) {
            return "bi0";
        }
        if (AbstractC3471.m5080(WeChatVersionsPlay.f11493)) {
            return "bdv";
        }
        return AbstractC3471.m5079(WeChatVersions.f11529) ? "bkj" : "b4_";
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        Object c2585;
        int iM2475;
        String[] strArr = AbstractC1574.f5469;
        try {
            
            if (C1565.m3280()) {
                
                C1333 c1333 = new C1333(4);
                c1333.m3053("com.tencent.mm.ui.chatting.adapter");
                C1981 c1981 = new C1981(4);
                c1981.m3827("MicroMsg.ChattingDataAdapterV3", "_onBindViewHolder[");
                c1333.f4794 = c1981;
                Method methodM3802 = ((C1974) dexKitBridge.m904(c1333).m1493()).m3802(C1565.m3275());
                Class<?> declaringClass = methodM3802.getDeclaringClass();
                ArrayList arrayListM3974 = AbstractC2201.m3974(AbstractC1567.m3282(declaringClass), new C1026(methodM3802), "Landroid/view/View;->findViewById(I)Landroid/view/View;");
                C2080 c2080 = C2080.f6882;
                if (arrayListM3974.size() == 1) {
                    iM2475 = ((Number) arrayListM3974.get(0)).intValue();
                } else {
                    ArrayList arrayList = C3678.f11549;
                    C3678.m5306("msgLayout hostId use Default", null, 14);
                    iM2475 = AbstractC0968.m2475(m3884());
                }
                c2080.m2545(iM2475);
            }
            c2585 = Unit.INSTANCE;
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        if (C2586.m4594(c2585) != null) {
            ArrayList arrayList2 = C3678.f11549;
            C3678.m5306("msgLayout hostId find Failed", null, 14);
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
