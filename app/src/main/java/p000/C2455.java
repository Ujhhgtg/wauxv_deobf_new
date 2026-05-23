package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᛸᲁᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2455 extends AbstractC2867 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2455 f7796;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f7797;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f7798;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f7799;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final boolean f7800;

    /* JADX WARN: Code duplicated, block: B:11:0x005c  */
    static {
        boolean z;
        String[] strArr = AbstractC1574.f5469;
        f7796 = new C2455("QuoteClickToPosHook");
        f7797 = "聊天";
        f7798 = "引用消息直达";
        f7799 = "点击引用消息内容直接定位到原文位置";
        EnumC3677 enumC3677 = EnumC3677.f11540;
        C1565 c1565 = C1565.f5440;
        c1565.getClass();
        if (C1565.m3278() > enumC3677.f11548 || C1565.m3280()) {
            EnumC3674 enumC3674 = EnumC3674.f11503;
            c1565.getClass();
            if (C1565.m3278() > enumC3674.f11513 || !C1565.m3280()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        f7800 = z;
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        if (f7800) {
            AbstractC1574.m3295(C2453.f7794, dexKitBridge, new C2444(4));
            AbstractC1574.m3295(C2454.f7795, dexKitBridge, new C2444(5));
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        if (f7800) {
            List listSingletonList = Collections.singletonList(AbstractC1574.m3315(C2453.f7794));
            C2455 c2455 = f7796;
            C3689 c3689M4172 = C2309.m4172(c2455, listSingletonList);
            c2455.m3263(c3689M4172, new C2444(6));
            c3689M4172.m5352();
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f7799;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f7798;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f7797;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public final boolean mo4142() {
        return f7800;
    }
}
