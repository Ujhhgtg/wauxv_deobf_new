package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᛸᤞᲇᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2827 extends AbstractC2927 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2827 f9018;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final Object f9019;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f9020;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f9021;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final String f9022;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C2801 f9023;

    static {
        AbstractC1471.m3394(-628980780628611L);
        AbstractC1471.m3394(-629062385007235L);
        String[] strArr = AbstractC1471.f5234;
        f9018 = new C2827("SnsUploadAppInfoHook");
        f9019 = AbstractC1924.m3873(new C2348("仇家多不方便透漏名字", new C2348("wx528bc3d4b664d037", "仇家多不方便透漏名字")), new C2348("来自一位陌生的透明人", new C2348("wxaf048e83e0ab3f08", "来自一位陌生的透明人")), new C2348("好友已设置小可爱可见", new C2348("wx281a70a3d390bdf2", "好友已设置小可爱可见")), new C2348("仅限长比我丑的人可见", new C2348("wxe6f1e2780ae2a481", "仅限长比我丑的人可见")), new C2348("一杯敬明天一杯敬过往", new C2348("wx77909ff94ab8b236", "一杯敬明天一杯敬过往")), new C2348("上瘾的东西不会是甜的", new C2348("wx6d9823e75d12ae61", "上瘾的东西不会是甜的")), new C2348("我能对你笑便能对你哭", new C2348("wx9ad15554b19159ee", "我能对你笑便能对你哭")), new C2348("主动久了便会累了", new C2348("wx7395b7ea7ae1cab7", "主动久了便会累了")), new C2348("先放手的人最心痛", new C2348("wxff725ddb21b2e1f7", "先放手的人最心痛")), new C2348("你若安好我便不扰", new C2348("wxcd3130c3a4ae2177", "你若安好我便不扰")), new C2348("像我这样的一个人", new C2348("wxb09d381947fc1678", "像我这样的一个人")), new C2348("已关闭评论功能", new C2348("wxe0d515767e6c3e1e", "已关闭评论功能")), new C2348("祝自己生日快乐", new C2348("wxe299f0e6b1f956e2", "祝自己生日快乐")), new C2348("今日还钱打99折", new C2348("wx367b267970d4cff8", "今日还钱打99折")), new C2348("同时提到了你", new C2348("wx5ce6035a51a71c8d", "同时提到了你")), new C2348("仅限渣女可见", new C2348("wx115bcff956fd0905", "仅限渣女可见")), new C2348("仅限渣男可见", new C2348("wx3f4266934f0e29fb", "仅限渣男可见")), new C2348("叙利亚打工中", new C2348("wx934ec697e72a2fe1", "叙利亚打工中")), new C2348("国家反诈中心", new C2348("wxb0eef1f67b7a2949", "国家反诈中心")), new C2348("看到请还钱", new C2348("wxd5a171b821e04a1e", "看到请还钱")), new C2348("Moon月球", new C2348("wx288c5706af4794ee", "Moon月球")), new C2348("原神", new C2348("wx1c37343fc2a86bc4", "原神")));
        f9020 = "朋友圈";
        f9021 = "朋友圈上传尾巴";
        f9022 = "自定义发表朋友圈显示的应用渠道来源";
        f9023 = new C2801(20);
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C2824.f9015, dexKitBridge, new C2801(21));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        List listSingletonList = Collections.singletonList(AbstractC0972.m2610(C2824.f9015));
        C2827 c2827 = f9018;
        C3752 c3752M4301 = C2342.m4301(c2827, listSingletonList);
        c2827.m3444(c3752M4301, new C2801(23));
        c3752M4301.m5360();
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f9022;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f9021;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f9020;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f9023;
    }
}
