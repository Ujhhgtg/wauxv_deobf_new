package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲁᛸᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2507 extends AbstractC2927 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2507 f7940;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f7941;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f7942;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f7943;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final boolean f7944;

    /* JADX WARN: Code duplicated, block: B:11:0x005c  */
    static {
        boolean z;
        String[] strArr = AbstractC1471.f5234;
        f7940 = new C2507("QuoteClickToPosHook");
        f7941 = "聊天";
        f7942 = "引用消息直达";
        f7943 = "点击引用消息内容直接定位到原文位置";
        EnumC3737 enumC3737 = EnumC3737.f11687;
        C1576 c1576 = C1576.f5470;
        c1576.getClass();
        if (C1576.m3458() > enumC3737.f11695 || C1576.m3460()) {
            EnumC3734 enumC3734 = EnumC3734.f11652;
            c1576.getClass();
            if (C1576.m3458() > enumC3734.f11662 || !C1576.m3460()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        f7944 = z;
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        if (f7944) {
            AbstractC0972.m2592(C2505.f7938, dexKitBridge, new C2382(26));
            AbstractC0972.m2592(C2506.f7939, dexKitBridge, new C2382(27));
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        if (f7944) {
            List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C2505.f7938));
            C2507 c2507 = f7940;
            C3752 c3752M4301 = C2342.m4301(c2507, listSingletonList);
            c2507.m3444(c3752M4301, new C2382(28));
            c3752M4301.m5360();
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f7943;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f7942;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f7941;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ */
    public final boolean mo4271() {
        return f7944;
    }
}
