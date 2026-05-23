package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2768 extends AbstractC2867 implements InterfaceC1582 {

    public static final C2768 f8857;

    public static final Object f8858;

    public static final String f8859;

    public static final String f8860;

    public static final String f8861;

    public static final C2734 f8862;

    static {
        AbstractC1574.m3300(-604624021093044L);
        AbstractC1574.m3300(-604705625471668L);
        String[] strArr = AbstractC1574.f5469;
        f8857 = new C2768("SnsUploadAppInfoHook");
        f8858 = AbstractC1898.m3694(new C2315("仇家多不方便透漏名字", new C2315("wx528bc3d4b664d037", "仇家多不方便透漏名字")), new C2315("来自一位陌生的透明人", new C2315("wxaf048e83e0ab3f08", "来自一位陌生的透明人")), new C2315("好友已设置小可爱可见", new C2315("wx281a70a3d390bdf2", "好友已设置小可爱可见")), new C2315("仅限长比我丑的人可见", new C2315("wxe6f1e2780ae2a481", "仅限长比我丑的人可见")), new C2315("一杯敬明天一杯敬过往", new C2315("wx77909ff94ab8b236", "一杯敬明天一杯敬过往")), new C2315("上瘾的东西不会是甜的", new C2315("wx6d9823e75d12ae61", "上瘾的东西不会是甜的")), new C2315("我能对你笑便能对你哭", new C2315("wx9ad15554b19159ee", "我能对你笑便能对你哭")), new C2315("主动久了便会累了", new C2315("wx7395b7ea7ae1cab7", "主动久了便会累了")), new C2315("先放手的人最心痛", new C2315("wxff725ddb21b2e1f7", "先放手的人最心痛")), new C2315("你若安好我便不扰", new C2315("wxcd3130c3a4ae2177", "你若安好我便不扰")), new C2315("像我这样的一个人", new C2315("wxb09d381947fc1678", "像我这样的一个人")), new C2315("已关闭评论功能", new C2315("wxe0d515767e6c3e1e", "已关闭评论功能")), new C2315("祝自己生日快乐", new C2315("wxe299f0e6b1f956e2", "祝自己生日快乐")), new C2315("今日还钱打99折", new C2315("wx367b267970d4cff8", "今日还钱打99折")), new C2315("同时提到了你", new C2315("wx5ce6035a51a71c8d", "同时提到了你")), new C2315("仅限渣女可见", new C2315("wx115bcff956fd0905", "仅限渣女可见")), new C2315("仅限渣男可见", new C2315("wx3f4266934f0e29fb", "仅限渣男可见")), new C2315("叙利亚打工中", new C2315("wx934ec697e72a2fe1", "叙利亚打工中")), new C2315("国家反诈中心", new C2315("wxb0eef1f67b7a2949", "国家反诈中心")), new C2315("看到请还钱", new C2315("wxd5a171b821e04a1e", "看到请还钱")), new C2315("Moon月球", new C2315("wx288c5706af4794ee", "Moon月球")), new C2315("原神", new C2315("wx1c37343fc2a86bc4", "原神")));
        f8859 = "朋友圈";
        f8860 = "朋友圈上传尾巴";
        f8861 = "自定义发表朋友圈显示的应用渠道来源";
        f8862 = new C2734(28);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2765.f8854, dexKitBridge, new C2734(29));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2765.f8854));
        C2768 c2768 = f8857;
        C3689 c3689M4172 = C2309.createHook(c2768, listSingletonList);
        c2768.hookBefore(c3689M4172, new C2764(1));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f8861;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f8860;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f8859;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f8862;
    }
}
