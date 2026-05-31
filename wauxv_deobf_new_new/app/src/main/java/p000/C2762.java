package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᲈᛸᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2762 extends AbstractC2927 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2762 f8877;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f8878;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8879;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8880;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final List f8881;

    static {
        String[] strArr = AbstractC1471.f5234;
        f8877 = new C2762("ShowHideEmojiHook");
        f8878 = "聊天";
        f8879 = "显示隐藏表情";
        f8880 = "显示微信所有表情中被隐藏掉的旧表情";
        f8881 = AbstractC0740.m2311(new C2760("[酷]", "/::+"), new C2760("[饥饿]", "/::g"), new C2760("[流汗]", "/::L"), new C2760("[奋斗]", "/:,@f"), new C2760("[疯了]", "/::8"), new C2760("[糗大了]", "/:&-("), new C2760("[哈欠]", "/::-O"), new C2760("[吓]", "/:@x"), new C2760("[西瓜]", "/:<W>"), new C2760("[篮球]", "/:basketb"), new C2760("[乒乓]", "/:oo"), new C2760("[饭]", "/:eat"), new C2760("[闪电]", "/:li"), new C2760("[刀]", "/:kn"), new C2760("[足球]", "/:footb"), new C2760("[瓢虫]", "/:ladybug"), new C2760("[差劲]", "/:bad"), new C2760("[爱你]", "/:lvu"), new C2760("[NO]", "/:no"), new C2760("[爱情]", "/:love"), new C2760("[飞吻]", "/:<L>"), new C2760("[怄火]", "/:<O>"), new C2760("[磕头]", "/:kotow"), new C2760("[回头]", "/:turn"), new C2760("[跳绳]", "/:skip"), new C2760("[投降]", "/:oY"), new C2760("[激动]", "/:#-0"), new C2760("[乱舞]", "/:hiphot"), new C2760("[献吻]", "/:kiss"), new C2760("[左太极]", "/:<&"), new C2760("[右太极]", "/:&>"));
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C2761.f8876, dexKitBridge, new C2751(4));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C2761.f8876));
        C2762 c2762 = f8877;
        C3752 c3752M4301 = C2342.m4301(c2762, listSingletonList);
        c2762.m3443(c3752M4301, new C2751(6));
        c3752M4301.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f8880;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f8879;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f8878;
    }
}
