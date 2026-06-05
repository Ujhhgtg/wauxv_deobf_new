package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲ能不能ᛴ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1041feyxiexzfUjhhgtg extends AbstractC2059Ujhhgtgfeyxiexzf implements InterfaceC0598Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1041feyxiexzfUjhhgtg f4054Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4055Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f4056Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f4057Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final List f4058Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        f4054Ujhhgtgfeyxiexzf = new C1041feyxiexzfUjhhgtg("ShowHideEmojiHook");
        f4055Ujhhgtgfeyxiexzf = "聊天";
        f4056Ujhhgtgfeyxiexzf = "显示隐藏表情";
        f4057Ujhhgtgfeyxiexzf = "显示微信所有表情中被隐藏掉的旧表情";
        f4058Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(new C1039feyxiexzfUjhhgtg("[酷]", "/::+"), new C1039feyxiexzfUjhhgtg("[饥饿]", "/::g"), new C1039feyxiexzfUjhhgtg("[流汗]", "/::L"), new C1039feyxiexzfUjhhgtg("[奋斗]", "/:,@f"), new C1039feyxiexzfUjhhgtg("[疯了]", "/::8"), new C1039feyxiexzfUjhhgtg("[糗大了]", "/:&-("), new C1039feyxiexzfUjhhgtg("[哈欠]", "/::-O"), new C1039feyxiexzfUjhhgtg("[吓]", "/:@x"), new C1039feyxiexzfUjhhgtg("[西瓜]", "/:<W>"), new C1039feyxiexzfUjhhgtg("[篮球]", "/:basketb"), new C1039feyxiexzfUjhhgtg("[乒乓]", "/:oo"), new C1039feyxiexzfUjhhgtg("[饭]", "/:eat"), new C1039feyxiexzfUjhhgtg("[闪电]", "/:li"), new C1039feyxiexzfUjhhgtg("[刀]", "/:kn"), new C1039feyxiexzfUjhhgtg("[足球]", "/:footb"), new C1039feyxiexzfUjhhgtg("[瓢虫]", "/:ladybug"), new C1039feyxiexzfUjhhgtg("[差劲]", "/:bad"), new C1039feyxiexzfUjhhgtg("[爱你]", "/:lvu"), new C1039feyxiexzfUjhhgtg("[NO]", "/:no"), new C1039feyxiexzfUjhhgtg("[爱情]", "/:love"), new C1039feyxiexzfUjhhgtg("[飞吻]", "/:<L>"), new C1039feyxiexzfUjhhgtg("[怄火]", "/:<O>"), new C1039feyxiexzfUjhhgtg("[磕头]", "/:kotow"), new C1039feyxiexzfUjhhgtg("[回头]", "/:turn"), new C1039feyxiexzfUjhhgtg("[跳绳]", "/:skip"), new C1039feyxiexzfUjhhgtg("[投降]", "/:oY"), new C1039feyxiexzfUjhhgtg("[激动]", "/:#-0"), new C1039feyxiexzfUjhhgtg("[乱舞]", "/:hiphot"), new C1039feyxiexzfUjhhgtg("[献吻]", "/:kiss"), new C1039feyxiexzfUjhhgtg("[左太极]", "/:<&"), new C1039feyxiexzfUjhhgtg("[右太极]", "/:&>"));
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C1038feyxiexzfUjhhgtg.f4051Ujhhgtgfeyxiexzf, dexKitBridge, new C1003feyxiexzfUjhhgtg(4));
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
        List listSingletonList = Collections.singletonList(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C1038feyxiexzfUjhhgtg.f4051Ujhhgtgfeyxiexzf));
        C1041feyxiexzfUjhhgtg c1041feyxiexzfUjhhgtg = f4054Ujhhgtgfeyxiexzf;
        C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf = C1477feyxiexzfUjhhgtg.m2994Ujhhgtgfeyxiexzf(c1041feyxiexzfUjhhgtg, listSingletonList);
        c1041feyxiexzfUjhhgtg.m1844feyxiexzfUjhhgtg(c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf, new C1003feyxiexzfUjhhgtg(6));
        c2285feyxiexzfUjhhgtgM2994Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final String mo1478feyxiexzfUjhhgtg() {
        return f4057Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ */
    public final String mo1479feyxiexzfUjhhgtg() {
        return f4056Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2059Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ */
    public final String mo1480feyxiexzfUjhhgtg() {
        return f4055Ujhhgtgfeyxiexzf;
    }
}
