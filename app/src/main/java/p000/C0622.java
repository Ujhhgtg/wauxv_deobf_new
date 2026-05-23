package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᲈᲀᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0622 extends AbstractC2867 implements InterfaceC1582, InterfaceC1601, InterfaceC1583 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0622 f2452;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2453;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f2454;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f2455;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C0605 f2456;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final boolean f2457;

    static {
        AbstractC1574.m3300(-626146102213300L);
        AbstractC1574.m3300(-626189051886260L);
        AbstractC1574.m3300(-626232001559220L);
        AbstractC1574.m3300(-626274951232180L);
        AbstractC1574.m3300(-626317900905140L);
        AbstractC1574.m3300(-626360850578100L);
        AbstractC1574.m3300(-626403800251060L);
        AbstractC1574.m3300(-626446749924020L);
        String[] strArr = AbstractC1574.f5469;
        f2452 = new C0622("ChatGroupTabHook");
        f2453 = "界面";
        f2454 = "聊天分组标签";
        f2455 = "添加分组顶部标签栏，顶部栏无法固定";
        f2456 = new C0605(2);
        f2457 = true;
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.m3295(C0611.f2440, dexKitBridge, new C0605(3));
    }

    @Override // p000.InterfaceC1601
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void mo2031(C1563 c1563, String str) {
        if (mo3264()) {
            String[] strArr = AbstractC1574.f5469;
            if (str.startsWith("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, hasTodo, hbMarkRed, remitMarkRed, parentRef from rconversation where ")) {
                C1486.f5275.getClass();
                C1484 c1484 = (C1484) AbstractC0744.m2193(C0618.f2447.m2538(), C1486.m3243());
                if ((c1484 == null && (c1484 = (C1484) AbstractC0744.m2192(C1486.m3243())) == null) || AbstractC2849.m4855(c1484.f5259, EnumC1485.f5265.f5273)) {
                    return;
                }
                c1563.getClass();
                new C0408(1, 6, c1563).m1608("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, hasTodo, hbMarkRed, remitMarkRed, parentRef from rconversation " + c1484.m3242());
            }
            if (str.startsWith("select unReadCount, status, isSend, conversationTime, username, content, msgType,flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, editingQuoteMsgId, hasTodo, hbMarkRed, remitMarkRed, hasSpecialFollow, parentRef from rconversation where ")) {
                C1486.f5275.getClass();
                C1484 c1485 = (C1484) AbstractC0744.m2193(C0618.f2447.m2538(), C1486.m3243());
                if ((c1485 == null && (c1485 = (C1484) AbstractC0744.m2192(C1486.m3243())) == null) || AbstractC2849.m4855(c1485.f5259, EnumC1485.f5265.f5273)) {
                    return;
                }
                c1563.getClass();
                new C0408(1, 6, c1563).m1608("select unReadCount, status, isSend, conversationTime, username, content, msgType,flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, editingQuoteMsgId, hasTodo, hbMarkRed, remitMarkRed, hasSpecialFollow, parentRef from rconversation " + c1485.m3242());
            }
        }
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.m3315(C0611.f2440));
        C0622 c0622 = f2452;
        C3689 c3689M4172 = C2309.m4172(c0622, listSingletonList);
        c0622.m3262(c3689M4172, new C0605(4));
        c3689M4172.m5352();
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f2455;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f2454;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f2453;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1425 mo1130() {
        return f2456;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ */
    public final boolean mo1131() {
        return f2457;
    }
}
