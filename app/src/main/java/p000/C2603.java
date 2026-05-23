package p000;

import java.util.Collections;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᤞᲈᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2603 extends AbstractC2867 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2603 f8467;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8468;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8469;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8470;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C2544 f8471;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final boolean f8472;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8467 = new C2603("RoundAvatarHook");
        f8468 = "美化";
        f8469 = "圆形头像";
        f8470 = "可自定义微信全局头像渲染的圆形弧度";
        f8471 = new C2544(14);
        f8472 = true;
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2601.f8465, dexKitBridge, new C2544(15));
        AbstractC1574.findMethod(C2599.f8463, dexKitBridge, new C2544(16));
        if (AbstractC3471.m5079(WeChatVersions.f11538) || AbstractC3471.m5080(WeChatVersionsPlay.f11500)) {
            AbstractC1574.findMethod(C2600.f8464, dexKitBridge, new C2544(17));
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        AbstractC1574.m3316(C2601.f8465, new C2544(18));
        C3689 c3689M4172 = C2309.m4172(this, Collections.singletonList(AbstractC1574.dexToCtor(C2599.f8463)));
        C2544 c2544 = new C2544(19);
        C2603 c2603 = f8467;
        c2603.m3263(c3689M4172, c2544);
        c3689M4172.m5352();
        if (AbstractC3471.m5079(WeChatVersions.f11538) || AbstractC3471.m5080(WeChatVersionsPlay.f11500)) {
            C3689 c3689M4173 = C2309.m4172(this, Collections.singletonList(AbstractC1574.dexToMethod(C2600.f8464)));
            c2603.m3263(c3689M4173, new C2544(20));
            c3689M4173.m5352();
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f8470;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f8469;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f8468;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f8471;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ */
    public final boolean mo1131() {
        return f8472;
    }
}
