package p000;

import java.util.Collections;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲁᲇᲈᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2512 extends AbstractC2867 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2512 f8030;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8031;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8032;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8033;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8030 = new C2512("RedPacketDetailHook");
        f8031 = "红包";
        f8032 = "红包页面详情";
        f8033 = "红包领取页面显示更加详细的领取情况";
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.m3295(C2511.f8029, dexKitBridge, new C2444(17));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        C3689 c3689M4172 = C2309.m4172(this, Collections.singletonList(AbstractC1574.m3315(C2511.f8029)));
        C2444 c2444 = new C2444(15);
        C2512 c2512 = f8030;
        c2512.m3262(c3689M4172, c2444);
        c3689M4172.m5352();
        C2176.f7137.getClass();
        Class declaringClass = AbstractC1574.m3314(C2175.f7136).getDeclaringClass();
        C2164.f7124.getClass();
        for (Class cls : AbstractC0745.m2212(declaringClass, AbstractC1574.m3314(C2163.f7123).getDeclaringClass())) {
            int i = AbstractC1745.f5844;
            C1973 c1973M3492 = AbstractC0968.m2484(cls).m3492();
            c1973M3492.f6370 = "onGYNetEnd";
            C3689 c3689M4174 = c2512.m4174((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(Integer.TYPE), AbstractC2519.m4527(String.class), AbstractC2519.m4527(JSONObject.class)}, 3, c1973M3492), 1);
            c2512.m3263(c3689M4174, new C2444(16));
            c3689M4174.m5352();
        }
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f8033;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f8032;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f8031;
    }
}
