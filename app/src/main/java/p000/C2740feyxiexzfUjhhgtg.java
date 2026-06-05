package p000;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛲᛴᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2740feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0598Ujhhgtgfeyxiexzf, InterfaceC0607Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C2740feyxiexzfUjhhgtg f8706Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final List f8707Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f8708Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f8709Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final String f8710Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final C2692Ujhhgtgfeyxiexzf f8711Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928366730394207626L);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f8706Ujhhgtgfeyxiexzf = new C2740feyxiexzfUjhhgtg("ChatInputHintHook");
        f8707Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf("${totalMsg}", "${textMsg}", "${textWord}", "${emojiMsg}", "${transferMsg}", "${redBagMsg}", "${fileMsg}");
        f8708Ujhhgtgfeyxiexzf = "美化";
        f8709Ujhhgtgfeyxiexzf = "输入框提示";
        f8710Ujhhgtgfeyxiexzf = "自定义聊天输入框默认提示的文本内容";
        f8711Ujhhgtgfeyxiexzf = new C2692Ujhhgtgfeyxiexzf(17);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static String m4046feyxiexzfUjhhgtg(String str) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        return AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(str, "${totalMsg}", String.valueOf(C2741Ujhhgtgfeyxiexzf.f8712Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf())), "${textMsg}", String.valueOf(C2734feyxiexzfUjhhgtg.f8696Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf())), "${textWord}", String.valueOf(C2733feyxiexzfUjhhgtg.f8695Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf())), "${emojiMsg}", String.valueOf(C2727Ujhhgtgfeyxiexzf.f8688Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf())), "${transferMsg}", String.valueOf(C2742feyxiexzfUjhhgtg.f8713Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf())), "${redBagMsg}", String.valueOf(C2731feyxiexzfUjhhgtg.f8693Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf())), "${fileMsg}", String.valueOf(C2735feyxiexzfUjhhgtg.f8697Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C2725Ujhhgtgfeyxiexzf.f8679Ujhhgtgfeyxiexzf, dexKitBridge, new C2692Ujhhgtgfeyxiexzf(18));
    }

    @Override // p000.InterfaceC0607Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public final void mo1872Ujhhgtgfeyxiexzf(MsgInfoBean msgInfoBean) {
        if (mo1424feyxiexzfUjhhgtg() && C2736feyxiexzfUjhhgtg.f8698Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf() && msgInfoBean.isSend()) {
            int i = AbstractC1997feyxiexzfUjhhgtg.f6583Ujhhgtgfeyxiexzf;
            int dayOfMonth = LocalDate.now().getDayOfMonth();
            C2728Ujhhgtgfeyxiexzf c2728Ujhhgtgfeyxiexzf = C2728Ujhhgtgfeyxiexzf.f8689Ujhhgtgfeyxiexzf;
            if (c2728Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() != dayOfMonth) {
                c2728Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(dayOfMonth);
                C2741Ujhhgtgfeyxiexzf.f8712Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(0);
                C2734feyxiexzfUjhhgtg.f8696Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(0);
                C2733feyxiexzfUjhhgtg.f8695Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(0);
                C2727Ujhhgtgfeyxiexzf.f8688Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(0);
                C2742feyxiexzfUjhhgtg.f8713Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(0);
                C2731feyxiexzfUjhhgtg.f8693Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(0);
                C2735feyxiexzfUjhhgtg.f8697Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(0);
            }
            C2741Ujhhgtgfeyxiexzf c2741Ujhhgtgfeyxiexzf = C2741Ujhhgtgfeyxiexzf.f8712Ujhhgtgfeyxiexzf;
            c2741Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(c2741Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() + 1);
            if (msgInfoBean.isText()) {
                C2734feyxiexzfUjhhgtg c2734feyxiexzfUjhhgtg = C2734feyxiexzfUjhhgtg.f8696Ujhhgtgfeyxiexzf;
                c2734feyxiexzfUjhhgtg.m4626Ujhhgtgfeyxiexzf(c2734feyxiexzfUjhhgtg.m4619Ujhhgtgfeyxiexzf() + 1);
                C2733feyxiexzfUjhhgtg c2733feyxiexzfUjhhgtg = C2733feyxiexzfUjhhgtg.f8695Ujhhgtgfeyxiexzf;
                c2733feyxiexzfUjhhgtg.m4626Ujhhgtgfeyxiexzf(msgInfoBean.getContent().length() + c2733feyxiexzfUjhhgtg.m4619Ujhhgtgfeyxiexzf());
                return;
            }
            if (msgInfoBean.isEmoji()) {
                C2727Ujhhgtgfeyxiexzf c2727Ujhhgtgfeyxiexzf = C2727Ujhhgtgfeyxiexzf.f8688Ujhhgtgfeyxiexzf;
                c2727Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(c2727Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() + 1);
                return;
            }
            if (msgInfoBean.isTransfer()) {
                C2742feyxiexzfUjhhgtg c2742feyxiexzfUjhhgtg = C2742feyxiexzfUjhhgtg.f8713Ujhhgtgfeyxiexzf;
                c2742feyxiexzfUjhhgtg.m4626Ujhhgtgfeyxiexzf(c2742feyxiexzfUjhhgtg.m4619Ujhhgtgfeyxiexzf() + 1);
            } else if (msgInfoBean.isRedBag()) {
                C2731feyxiexzfUjhhgtg c2731feyxiexzfUjhhgtg = C2731feyxiexzfUjhhgtg.f8693Ujhhgtgfeyxiexzf;
                c2731feyxiexzfUjhhgtg.m4626Ujhhgtgfeyxiexzf(c2731feyxiexzfUjhhgtg.m4619Ujhhgtgfeyxiexzf() + 1);
            } else if (msgInfoBean.isFile()) {
                C2735feyxiexzfUjhhgtg c2735feyxiexzfUjhhgtg = C2735feyxiexzfUjhhgtg.f8697Ujhhgtgfeyxiexzf;
                c2735feyxiexzfUjhhgtg.m4626Ujhhgtgfeyxiexzf(c2735feyxiexzfUjhhgtg.m4619Ujhhgtgfeyxiexzf() + 1);
            }
        }
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
        List listSingletonList = Collections.singletonList(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C2725Ujhhgtgfeyxiexzf.f8679Ujhhgtgfeyxiexzf));
        C2740feyxiexzfUjhhgtg c2740feyxiexzfUjhhgtg = f8706Ujhhgtgfeyxiexzf;
        C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf = C1477feyxiexzfUjhhgtg.m2994Ujhhgtgfeyxiexzf(c2740feyxiexzfUjhhgtg, listSingletonList);
        c2740feyxiexzfUjhhgtg.m1844feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf, new C2692Ujhhgtgfeyxiexzf(20));
        c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f8710Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f8709Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f8708Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ */
    public final InterfaceC3549feyxiexzfUjhhgtg mo1481feyxiexzfUjhhgtg() {
        return f8711Ujhhgtgfeyxiexzf;
    }
}
