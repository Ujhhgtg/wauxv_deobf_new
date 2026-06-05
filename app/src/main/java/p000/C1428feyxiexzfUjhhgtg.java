package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛳ能不能ᛱUjhhgtgᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1428feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0595Ujhhgtgfeyxiexzf, InterfaceC0598Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1428feyxiexzfUjhhgtg f5022Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f5023Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f5024Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f5025Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final C1388feyxiexzfUjhhgtg f5026Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f5022Ujhhgtgfeyxiexzf = new C1428feyxiexzfUjhhgtg(MagicFactory.get(4928840628495713674L, strArr));
        f5023Ujhhgtgfeyxiexzf = MagicFactory.get(4928843884080924042L, strArr);
        f5024Ujhhgtgfeyxiexzf = MagicFactory.get(4928843871196022154L, strArr);
        f5025Ujhhgtgfeyxiexzf = MagicFactory.get(4928843987160139146L, strArr);
        f5026Ujhhgtgfeyxiexzf = new C1388feyxiexzfUjhhgtg(4);
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C1399feyxiexzfUjhhgtg.f4915Ujhhgtgfeyxiexzf, dexKitBridge, new C1388feyxiexzfUjhhgtg(10));
    }

    @Override // p000.InterfaceC0595Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final List mo1869Ujhhgtgfeyxiexzf(ConversationBean conversationBean) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (!mo1424feyxiexzfUjhhgtg()) {
            return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        }
        ArrayList arrayList = new ArrayList();
        if (C1400feyxiexzfUjhhgtg.f4916Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) {
            if (C3382feyxiexzfUjhhgtg.m4891Ujhhgtgfeyxiexzf(conversationBean.getFlag(), C3710Ujhhgtgfeyxiexzf.f11753Ujhhgtgfeyxiexzf) == 0) {
                long flag = conversationBean.getFlag();
                if (0 <= flag && flag < 1152921504606846977L) {
                    arrayList.add(new C3712Ujhhgtgfeyxiexzf(R.id.MenuItem_Conversation_SetPlacedTopPro, MagicFactory.get(4928844124599092618L, strArr), new C1388feyxiexzfUjhhgtg(5)));
                }
            } else {
                long flag2 = conversationBean.getFlag();
                if (6917529027641081856L <= flag2 && flag2 < 8070450532247928833L) {
                    arrayList.add(new C3712Ujhhgtgfeyxiexzf(R.id.MenuItem_Conversation_UnSetPlacedTopPro, MagicFactory.get(4928844103124256138L, strArr), new C1388feyxiexzfUjhhgtg(6)));
                }
            }
        }
        if (C1401feyxiexzfUjhhgtg.f4917Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) {
            arrayList.add(new C3712Ujhhgtgfeyxiexzf(R.id.MenuItem_Conversation_ResetPlaced, MagicFactory.get(4928844073059485066L, strArr), new C1388feyxiexzfUjhhgtg(7)));
        }
        if (C1398feyxiexzfUjhhgtg.f4914Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) {
            if (C3382feyxiexzfUjhhgtg.m4891Ujhhgtgfeyxiexzf(conversationBean.getFlag(), C3710Ujhhgtgfeyxiexzf.f11752Ujhhgtgfeyxiexzf) == 0) {
                long flag3 = conversationBean.getFlag();
                if (0 <= flag3 && flag3 < 1152921504606846977L) {
                    arrayList.add(new C3712Ujhhgtgfeyxiexzf(R.id.MenuItem_Conversation_SetPlacedBottomPro, MagicFactory.get(4928844189023602058L, strArr), new C1388feyxiexzfUjhhgtg(8)));
                    return arrayList;
                }
            } else {
                long flag4 = conversationBean.getFlag();
                if (-6917529027641081856L <= flag4 && flag4 < -5764607523034234879L) {
                    arrayList.add(new C3712Ujhhgtgfeyxiexzf(R.id.MenuItem_Conversation_UnSetPlacedBottomPro, MagicFactory.get(4928844167548765578L, strArr), new C1388feyxiexzfUjhhgtg(9)));
                }
            }
        }
        return arrayList;
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
        List listSingletonList = Collections.singletonList(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1399feyxiexzfUjhhgtg.f4915Ujhhgtgfeyxiexzf));
        C1428feyxiexzfUjhhgtg c1428feyxiexzfUjhhgtg = f5022Ujhhgtgfeyxiexzf;
        C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf = C1477feyxiexzfUjhhgtg.m2994Ujhhgtgfeyxiexzf(c1428feyxiexzfUjhhgtg, listSingletonList);
        c1428feyxiexzfUjhhgtg.m1844feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf, new C1388feyxiexzfUjhhgtg(11));
        c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f5025Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f5024Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f5023Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f5026Ujhhgtgfeyxiexzf;
    }
}
