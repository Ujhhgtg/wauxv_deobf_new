package p000;

import java.util.Collections;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᲁᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2567 extends AbstractC2927 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2567 f8181;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f8182;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8183;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8184;

    static {
        String[] strArr = AbstractC1471.f5234;
        f8181 = new C2567("RedPacketDetailHook");
        f8182 = "红包";
        f8183 = "红包页面详情";
        f8184 = "红包领取页面显示更加详细的领取情况";
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C2566.f8180, dexKitBridge, new C2504(9));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        C3752 c3752M4301 = C2342.m4301(this, Collections.singletonList(AbstractC0972.m2610(C2566.f8180)));
        C2504 c2504 = new C2504(7);
        C2567 c2567 = f8181;
        c2567.m3443(c3752M4301, c2504);
        c3752M4301.m5360();
        C2210.f7260.getClass();
        Class declaringClass = AbstractC0972.m2609(C2209.f7259).getDeclaringClass();
        C2197.f7247.getClass();
        for (Class cls : AbstractC0740.m2311(declaringClass, AbstractC0972.m2609(C2196.f7246).getDeclaringClass())) {
            int i = AbstractC1768.f5906;
            C2004 c2004M3560 = AbstractC2727.m4713(cls).m3560();
            c2004M3560.f6475 = "onGYNetEnd";
            C3752 c3752M4303 = c2567.m4303((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(Integer.TYPE), AbstractC2574.m4549(String.class), AbstractC2574.m4549(JSONObject.class)}, 3, c2004M3560), 1);
            c2567.m3444(c3752M4303, new C2504(8));
            c3752M4303.m5360();
        }
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f8184;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f8183;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f8182;
    }
}
