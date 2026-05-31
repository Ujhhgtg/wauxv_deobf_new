package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᤞᲀᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3736 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final EnumC3736 f11668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC3736 f11669;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC3736 f11670;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final EnumC3736 f11671;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final EnumC3736 f11672;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final EnumC3736 f11673;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3736[] f11674;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f11675;

    static {
        String[] strArr = AbstractC1471.f5234;
        String str = "IMG";
        "图文";
        EnumC3736 enumC3736 = new EnumC3736(str, 0, 1);
        f11668 = enumC3736;
        String str2 = "TEXT";
        "文字";
        EnumC3736 enumC3737 = new EnumC3736(str2, 1, 2);
        f11669 = enumC3737;
        String str3 = "LINK";
        "链接";
        EnumC3736 enumC3738 = new EnumC3736(str3, 2, 3);
        f11670 = enumC3738;
        String str4 = "MUSIC";
        "音乐";
        EnumC3736 enumC3739 = new EnumC3736(str4, 3, 4);
        String str5 = "VIDEO";
        "视频";
        EnumC3736 enumC37310 = new EnumC3736(str5, 4, 5);
        String str6 = "COMMODITY";
        "商品";
        EnumC3736 enumC37311 = new EnumC3736(str6, 5, 9);
        String str7 = "STICKER";
        "表情包";
        EnumC3736 enumC37312 = new EnumC3736(str7, 6, 10);
        String str8 = "COMMODITY12";
        "商品12";
        EnumC3736 enumC37313 = new EnumC3736(str8, 7, 12);
        String str9 = "COUPON";
        "优惠券";
        EnumC3736 enumC37314 = new EnumC3736(str9, 8, 13);
        String str10 = "TV_SHOW";
        "电视剧";
        EnumC3736 enumC37315 = new EnumC3736(str10, 9, 14);
        String str11 = "LITTLE_VIDEO";
        "小视频";
        EnumC3736 enumC37316 = new EnumC3736(str11, 10, 15);
        f11671 = enumC37316;
        String str12 = "STREAM_VIDEO";
        "视频流";
        EnumC3736 enumC37317 = new EnumC3736(str12, 11, 18);
        String str13 = "ARTICLE_VIDEO";
        "文章视频";
        EnumC3736 enumC37318 = new EnumC3736(str13, 12, 19);
        String str14 = "NOTE";
        "笔记";
        EnumC3736 enumC37319 = new EnumC3736(str14, 13, 26);
        String str15 = "FINDER_VIDEO";
        "视频号";
        EnumC3736 enumC37320 = new EnumC3736(str15, 14, 28);
        f11672 = enumC37320;
        String str16 = "WE_APP_SINGLE_PAGE";
        "小程序";
        EnumC3736 enumC37321 = new EnumC3736(str16, 15, 30);
        String str17 = "LIVE";
        "直播";
        EnumC3736 enumC37322 = new EnumC3736(str17, 16, 34);
        String str18 = "FINDER_LONG_VIDEO";
        "长视频号";
        EnumC3736 enumC37323 = new EnumC3736(str18, 17, 36);
        String str19 = "LITE_APP";
        "轻应用";
        EnumC3736 enumC37324 = new EnumC3736(str19, 18, 41);
        String str20 = "RICH_MUSIC";
        "富音乐";
        EnumC3736 enumC37325 = new EnumC3736(str20, 19, 42);
        String str21 = "TING_AUDIO";
        "听音频";
        EnumC3736 enumC37326 = new EnumC3736(str21, 20, 47);
        String str22 = "LIVE_PHOTO";
        "实况";
        EnumC3736 enumC37327 = new EnumC3736(str22, 21, 54);
        f11673 = enumC37327;
        f11674 = new EnumC3736[]{enumC3736, enumC3737, enumC3738, enumC3739, enumC37310, enumC37311, enumC37312, enumC37313, enumC37314, enumC37315, enumC37316, enumC37317, enumC37318, enumC37319, enumC37320, enumC37321, enumC37322, enumC37323, enumC37324, enumC37325, enumC37326, enumC37327};
    }

    public EnumC3736(String str, int i, int i2) {
        super(str, i);
        this.f11675 = i2;
    }

    public static EnumC3736 valueOf(String str) {
        return (EnumC3736) Enum.valueOf(EnumC3736.class, str);
    }

    public static EnumC3736[] values() {
        return (EnumC3736[]) f11674.clone();
    }
}
