package p000;

import java.util.Collections;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᤞᤝᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2662 extends AbstractC2927 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2662 f8620;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f8621;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8622;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8623;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C2657 f8624;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final boolean f8625;

    static {
        String[] strArr = AbstractC1471.f5234;
        f8620 = new C2662("RoundAvatarHook");
        f8621 = "美化";
        f8622 = "圆形头像";
        f8623 = "可自定义微信全局头像渲染的圆形弧度";
        f8624 = new C2657(6);
        f8625 = true;
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C2660.f8618, dexKitBridge, new C2657(7));
        AbstractC0972.m2592(C2658.f8616, dexKitBridge, new C2657(8));
        if (AbstractC0972.m2596(EnumC3737.f11685) || AbstractC0972.m2597(EnumC3734.f11649)) {
            AbstractC0972.m2592(C2659.f8617, dexKitBridge, new C2657(9));
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        AbstractC0972.m2611(C2660.f8618, new C2657(10));
        C3752 c3752M4301 = C2342.m4301(this, Collections.singletonList(AbstractC0972.m2609(C2658.f8616)));
        C2657 c2657 = new C2657(11);
        C2662 c2662 = f8620;
        c2662.m3444(c3752M4301, c2657);
        c3752M4301.m5360();
        if (AbstractC0972.m2596(EnumC3737.f11685) || AbstractC0972.m2597(EnumC3734.f11649)) {
            C3752 c3752M4302 = C2342.m4301(this, Collections.singletonList(AbstractC0972.m2610(C2659.f8617)));
            c2662.m3444(c3752M4302, new C2657(12));
            c3752M4302.m5360();
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f8623;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f8622;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f8621;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f8624;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final boolean mo1277() {
        return f8625;
    }
}
