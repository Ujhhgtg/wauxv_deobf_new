package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.ConversationBean;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2349 extends AbstractC2867 implements InterfaceC1581, InterfaceC1582 {

    public static final C2349 f7541;

    public static final String f7542;

    public static final String f7543;

    public static final String f7544;

    public static final C2316 f7545;

    static {
        String[] strArr = AbstractC1574.f5469;
        f7541 = new C2349("PlacedSortProHook");
        f7542 = "菜单";
        f7543 = "列表排序";
        f7544 = "为聊天列表菜单添加列表排序聊天功能";
        f7545 = new C2316(11);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2345.f7537, dexKitBridge, new C2316(17));
    }

    @Override // p000.InterfaceC1581
    public final List mo3337(ConversationBean conversationBean) {
        String[] strArr = AbstractC1574.f5469;
        if (!mo3264()) {
            return C1189.f4329;
        }
        ArrayList arrayList = new ArrayList();
        if (C2348.f7540.m2536()) {
            if (C1133.m2710(conversationBean.getFlag(), C0848.f3256) == 0) {
                long flag = conversationBean.getFlag();
                if (0 <= flag && flag < 1152921504606846977L) {
                    arrayList.add(new C0849(R.id.MenuItem_Conversation_SetPlacedTopPro, "列表置顶", new C2316(12)));
                }
            } else {
                long flag2 = conversationBean.getFlag();
                if (6917529027641081856L <= flag2 && flag2 < 8070450532247928833L) {
                    arrayList.add(new C0849(R.id.MenuItem_Conversation_UnSetPlacedTopPro, "取消列表置顶", new C2316(13)));
                }
            }
        }
        if (C2347.f7539.m2536()) {
            arrayList.add(new C0849(R.id.MenuItem_Conversation_ResetPlaced, "还原排序", new C2316(14)));
        }
        if (C2346.f7538.m2536()) {
            if (C1133.m2710(conversationBean.getFlag(), C0848.f3255) == 0) {
                long flag3 = conversationBean.getFlag();
                if (0 <= flag3 && flag3 < 1152921504606846977L) {
                    arrayList.add(new C0849(R.id.MenuItem_Conversation_SetPlacedBottomPro, "列表置底", new C2316(15)));
                    return arrayList;
                }
            } else {
                long flag4 = conversationBean.getFlag();
                if (-6917529027641081856L <= flag4 && flag4 < -5764607523034234879L) {
                    arrayList.add(new C0849(R.id.MenuItem_Conversation_UnSetPlacedBottomPro, "取消列表置底", new C2316(16)));
                }
            }
        }
        return arrayList;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2345.f7537));
        C2349 c2349 = f7541;
        C3689 c3689M4172 = C2309.createHook(c2349, listSingletonList);
        c2349.m3262(c3689M4172, new C2316(18));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f7544;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f7543;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f7542;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f7545;
    }
}
