package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᤞᲈᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2700 extends AbstractC2867 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C2700 f8706;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f8707;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f8708;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f8709;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final List f8710;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8706 = new C2700("ShowHideEmojiHook");
        f8707 = "聊天";
        f8708 = "显示隐藏表情";
        f8709 = "显示微信所有表情中被隐藏掉的旧表情";
        f8710 = AbstractC0745.listOf(new C2698("[酷]", "/::+"), new C2698("[饥饿]", "/::g"), new C2698("[流汗]", "/::L"), new C2698("[奋斗]", "/:,@f"), new C2698("[疯了]", "/::8"), new C2698("[糗大了]", "/:&-("), new C2698("[哈欠]", "/::-O"), new C2698("[吓]", "/:@x"), new C2698("[西瓜]", "/:<W>"), new C2698("[篮球]", "/:basketb"), new C2698("[乒乓]", "/:oo"), new C2698("[饭]", "/:eat"), new C2698("[闪电]", "/:li"), new C2698("[刀]", "/:kn"), new C2698("[足球]", "/:footb"), new C2698("[瓢虫]", "/:ladybug"), new C2698("[差劲]", "/:bad"), new C2698("[爱你]", "/:lvu"), new C2698("[NO]", "/:no"), new C2698("[爱情]", "/:love"), new C2698("[飞吻]", "/:<L>"), new C2698("[怄火]", "/:<O>"), new C2698("[磕头]", "/:kotow"), new C2698("[回头]", "/:turn"), new C2698("[跳绳]", "/:skip"), new C2698("[投降]", "/:oY"), new C2698("[激动]", "/:#-0"), new C2698("[乱舞]", "/:hiphot"), new C2698("[献吻]", "/:kiss"), new C2698("[左太极]", "/:<&"), new C2698("[右太极]", "/:&>"));
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2699.f8705, dexKitBridge, new C2659(12));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2699.f8705));
        C2700 c2700 = f8706;
        C3689 c3689M4172 = C2309.createHook(c2700, listSingletonList);
        c2700.m3262(c3689M4172, new C2659(14));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1127() {
        return f8709;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1128() {
        return f8708;
    }

    @Override // p000.AbstractC2867
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1129() {
        return f8707;
    }
}
