package p000;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.data.bean.MsgInfoBean;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0636 extends AbstractC2867 implements InterfaceC1582, InterfaceC1593 {

    public static final C0636 f2474;

    public static final List f2475;

    public static final String f2476;

    public static final String f2477;

    public static final String f2478;

    public static final C0605 f2479;

    static {
        AbstractC1574.m3300(-483231065438900L);
        String[] strArr = AbstractC1574.f5469;
        f2474 = new C0636("ChatInputHintHook");
        f2475 = AbstractC0745.listOf("${totalMsg}", "${textMsg}", "${textWord}", "${emojiMsg}", "${transferMsg}", "${redBagMsg}", "${fileMsg}");
        f2476 = "美化";
        f2477 = "输入框提示";
        f2478 = "自定义聊天输入框默认提示的文本内容";
        f2479 = new C0605(6);
    }

    public static String m2038(String str) {
        String[] strArr = AbstractC1574.f5469;
        return AbstractC2849.m4857(AbstractC2849.m4857(AbstractC2849.m4857(AbstractC2849.m4857(AbstractC2849.m4857(AbstractC2849.m4857(AbstractC2849.m4857(str, "${totalMsg}", String.valueOf(C0632.f2467.m2538())), "${textMsg}", String.valueOf(C0630.f2465.m2538())), "${textWord}", String.valueOf(C0631.f2466.m2538())), "${emojiMsg}", String.valueOf(C0625.f2460.m2538())), "${transferMsg}", String.valueOf(C0633.f2468.m2538())), "${redBagMsg}", String.valueOf(C0629.f2464.m2538())), "${fileMsg}", String.valueOf(C0626.f2461.m2538()));
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0623.f2458, dexKitBridge, new C0605(7));
    }

    @Override // p000.InterfaceC1593
    public final void mo2039(MsgInfoBean msgInfoBean) {
        if (mo3264() && C0627.f2462.m2536() && msgInfoBean.isSend()) {
            int i = 0;
            int dayOfMonth = LocalDate.now().getDayOfMonth();
            C0624 c0624 = C0624.f2459;
            if (c0624.m2538() != dayOfMonth) {
                c0624.m2545(dayOfMonth);
                C0632.f2467.m2545(0);
                C0630.f2465.m2545(0);
                C0631.f2466.m2545(0);
                C0625.f2460.m2545(0);
                C0633.f2468.m2545(0);
                C0629.f2464.m2545(0);
                C0626.f2461.m2545(0);
            }
            C0632 c0632 = C0632.f2467;
            c0632.m2545(c0632.m2538() + 1);
            if (msgInfoBean.isText()) {
                C0630 c0630 = C0630.f2465;
                c0630.m2545(c0630.m2538() + 1);
                C0631 c0631 = C0631.f2466;
                c0631.m2545(msgInfoBean.getContent().length() + c0631.m2538());
                return;
            }
            if (msgInfoBean.isEmoji()) {
                C0625 c0625 = C0625.f2460;
                c0625.m2545(c0625.m2538() + 1);
                return;
            }
            if (msgInfoBean.isTransfer()) {
                C0633 c0633 = C0633.f2468;
                c0633.m2545(c0633.m2538() + 1);
            } else if (msgInfoBean.isRedBag()) {
                C0629 c0629 = C0629.f2464;
                c0629.m2545(c0629.m2538() + 1);
            } else if (msgInfoBean.isFile()) {
                C0626 c0626 = C0626.f2461;
                c0626.m2545(c0626.m2538() + 1);
            }
        }
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C0623.f2458));
        C0636 c0636 = f2474;
        C3689 c3689M4172 = C2309.createHook(c0636, listSingletonList);
        c0636.m3262(c3689M4172, new C0605(9));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f2478;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f2477;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f2476;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f2479;
    }
}
