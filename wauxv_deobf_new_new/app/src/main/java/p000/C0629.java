package p000;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᲈᲀᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0629 extends AbstractC2927 implements InterfaceC1594, InterfaceC1605 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0629 f2480;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final List f2481;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f2482;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f2483;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f2484;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C0581 f2485;

    static {
        AbstractC1471.m3394(-504856225774211L);
        String[] strArr = AbstractC1471.f5234;
        f2480 = new C0629("ChatInputHintHook");
        f2481 = AbstractC0740.m2311("${totalMsg}", "${textMsg}", "${textWord}", "${emojiMsg}", "${transferMsg}", "${redBagMsg}", "${fileMsg}");
        f2482 = "美化";
        f2483 = "输入框提示";
        f2484 = "自定义聊天输入框默认提示的文本内容";
        f2485 = new C0581(19);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static String m2149(String str) {
        String[] strArr = AbstractC1471.f5234;
        return AbstractC2909.m4918(AbstractC2909.m4918(AbstractC2909.m4918(AbstractC2909.m4918(AbstractC2909.m4918(AbstractC2909.m4918(AbstractC2909.m4918(str, "${totalMsg}", String.valueOf(C0625.f2473.m2662())), "${textMsg}", String.valueOf(C0623.f2471.m2662())), "${textWord}", String.valueOf(C0624.f2472.m2662())), "${emojiMsg}", String.valueOf(C0618.f2466.m2662())), "${transferMsg}", String.valueOf(C0626.f2474.m2662())), "${redBagMsg}", String.valueOf(C0622.f2470.m2662())), "${fileMsg}", String.valueOf(C0619.f2467.m2662()));
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C0616.f2464, dexKitBridge, new C0581(20));
    }

    @Override // p000.InterfaceC1605
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void mo2150(MsgInfoBean msgInfoBean) {
        if (mo3445() && C0620.f2468.m2660() && msgInfoBean.isSend()) {
            int i = AbstractC2986.f9559;
            int dayOfMonth = LocalDate.now().getDayOfMonth();
            C0617 c0617 = C0617.f2465;
            if (c0617.m2662() != dayOfMonth) {
                c0617.m2669(dayOfMonth);
                C0625.f2473.m2669(0);
                C0623.f2471.m2669(0);
                C0624.f2472.m2669(0);
                C0618.f2466.m2669(0);
                C0626.f2474.m2669(0);
                C0622.f2470.m2669(0);
                C0619.f2467.m2669(0);
            }
            C0625 c0625 = C0625.f2473;
            c0625.m2669(c0625.m2662() + 1);
            if (msgInfoBean.isText()) {
                C0623 c0623 = C0623.f2471;
                c0623.m2669(c0623.m2662() + 1);
                C0624 c0624 = C0624.f2472;
                c0624.m2669(msgInfoBean.getContent().length() + c0624.m2662());
                return;
            }
            if (msgInfoBean.isEmoji()) {
                C0618 c0618 = C0618.f2466;
                c0618.m2669(c0618.m2662() + 1);
                return;
            }
            if (msgInfoBean.isTransfer()) {
                C0626 c0626 = C0626.f2474;
                c0626.m2669(c0626.m2662() + 1);
            } else if (msgInfoBean.isRedBag()) {
                C0622 c0622 = C0622.f2470;
                c0622.m2669(c0622.m2662() + 1);
            } else if (msgInfoBean.isFile()) {
                C0619 c0619 = C0619.f2467;
                c0619.m2669(c0619.m2662() + 1);
            }
        }
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C0616.f2464));
        C0629 c0629 = f2480;
        C3752 c3752M4301 = C2342.m4301(c0629, listSingletonList);
        c0629.m3443(c3752M4301, new C0581(22));
        c3752M4301.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f2484;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f2483;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f2482;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f2485;
    }
}
