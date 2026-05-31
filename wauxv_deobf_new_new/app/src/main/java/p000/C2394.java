package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᲇᛸᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2394 extends AbstractC2927 implements InterfaceC1593, InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2394 f7671;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f7672;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f7673;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f7674;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C2382 f7675;

    static {
        String[] strArr = AbstractC1471.f5234;
        f7671 = new C2394("PlacedSortProHook");
        f7672 = "菜单";
        f7673 = "列表排序";
        f7674 = "为聊天列表菜单添加列表排序聊天功能";
        f7675 = new C2382(3);
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C2390.f7667, dexKitBridge, new C2382(9));
    }

    @Override // p000.InterfaceC1593
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final List mo3501(ConversationBean conversationBean) {
        String[] strArr = AbstractC1471.f5234;
        if (!mo3445()) {
            return C1191.f4326;
        }
        ArrayList arrayList = new ArrayList();
        if (C2393.f7670.m2660()) {
            if (C1139.m2860(conversationBean.getFlag(), C0848.f3264) == 0) {
                long flag = conversationBean.getFlag();
                if (0 <= flag && flag < 1152921504606846977L) {
                    arrayList.add(new C0849(R.id.MenuItem_Conversation_SetPlacedTopPro, "列表置顶", new C2382(4)));
                }
            } else {
                long flag2 = conversationBean.getFlag();
                if (6917529027641081856L <= flag2 && flag2 < 8070450532247928833L) {
                    arrayList.add(new C0849(R.id.MenuItem_Conversation_UnSetPlacedTopPro, "取消列表置顶", new C2382(5)));
                }
            }
        }
        if (C2392.f7669.m2660()) {
            arrayList.add(new C0849(R.id.MenuItem_Conversation_ResetPlaced, "还原排序", new C2382(6)));
        }
        if (C2391.f7668.m2660()) {
            if (C1139.m2860(conversationBean.getFlag(), C0848.f3263) == 0) {
                long flag3 = conversationBean.getFlag();
                if (0 <= flag3 && flag3 < 1152921504606846977L) {
                    arrayList.add(new C0849(R.id.MenuItem_Conversation_SetPlacedBottomPro, "列表置底", new C2382(7)));
                    return arrayList;
                }
            } else {
                long flag4 = conversationBean.getFlag();
                if (-6917529027641081856L <= flag4 && flag4 < -5764607523034234879L) {
                    arrayList.add(new C0849(R.id.MenuItem_Conversation_UnSetPlacedBottomPro, "取消列表置底", new C2382(8)));
                }
            }
        }
        return arrayList;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C2390.f7667));
        C2394 c2394 = f7671;
        C3752 c3752M4301 = C2342.m4301(c2394, listSingletonList);
        c2394.m3443(c3752M4301, new C2382(10));
        c3752M4301.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f7674;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f7673;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f7672;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f7675;
    }
}
