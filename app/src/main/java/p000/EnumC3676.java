package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᤝᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3676 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC3676 f11519;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC3676 f11520;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final EnumC3676 f11521;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final EnumC3676 f11522;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final EnumC3676 f11523;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final EnumC3676 f11524;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3676[] f11525;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f11526;

    static {
        String[] strArr = AbstractC1574.f5469;
        String str = "IMG";
        "图文";
        EnumC3676 enumC3676 = new EnumC3676("IMG", 0, 1);
        f11519 = enumC3676;
        String str2 = "TEXT";
        "文字";
        EnumC3676 enumC3677 = new EnumC3676("TEXT", 1, 2);
        f11520 = enumC3677;
        String str3 = "LINK";
        "链接";
        EnumC3676 enumC3678 = new EnumC3676("LINK", 2, 3);
        f11521 = enumC3678;
        String str4 = "MUSIC";
        "音乐";
        EnumC3676 enumC3679 = new EnumC3676("MUSIC", 3, 4);
        String str5 = "VIDEO";
        "视频";
        EnumC3676 enumC36710 = new EnumC3676("VIDEO", 4, 5);
        String str6 = "COMMODITY";
        "商品";
        EnumC3676 enumC36711 = new EnumC3676("COMMODITY", 5, 9);
        String str7 = "STICKER";
        "表情包";
        EnumC3676 enumC36712 = new EnumC3676("STICKER", 6, 10);
        String str8 = "COMMODITY12";
        "商品12";
        EnumC3676 enumC36713 = new EnumC3676("COMMODITY12", 7, 12);
        String str9 = "COUPON";
        "优惠券";
        EnumC3676 enumC36714 = new EnumC3676("COUPON", 8, 13);
        String str10 = "TV_SHOW";
        "电视剧";
        EnumC3676 enumC36715 = new EnumC3676("TV_SHOW", 9, 14);
        String str11 = "LITTLE_VIDEO";
        "小视频";
        EnumC3676 enumC36716 = new EnumC3676("LITTLE_VIDEO", 10, 15);
        f11522 = enumC36716;
        String str12 = "STREAM_VIDEO";
        "视频流";
        EnumC3676 enumC36717 = new EnumC3676("STREAM_VIDEO", 11, 18);
        String str13 = "ARTICLE_VIDEO";
        "文章视频";
        EnumC3676 enumC36718 = new EnumC3676("ARTICLE_VIDEO", 12, 19);
        String str14 = "NOTE";
        "笔记";
        EnumC3676 enumC36719 = new EnumC3676("NOTE", 13, 26);
        String str15 = "FINDER_VIDEO";
        "视频号";
        EnumC3676 enumC36720 = new EnumC3676("FINDER_VIDEO", 14, 28);
        f11523 = enumC36720;
        String str16 = "WE_APP_SINGLE_PAGE";
        "小程序";
        EnumC3676 enumC36721 = new EnumC3676("WE_APP_SINGLE_PAGE", 15, 30);
        String str17 = "LIVE";
        "直播";
        EnumC3676 enumC36722 = new EnumC3676("LIVE", 16, 34);
        String str18 = "FINDER_LONG_VIDEO";
        "长视频号";
        EnumC3676 enumC36723 = new EnumC3676("FINDER_LONG_VIDEO", 17, 36);
        String str19 = "LITE_APP";
        "轻应用";
        EnumC3676 enumC36724 = new EnumC3676("LITE_APP", 18, 41);
        String str20 = "RICH_MUSIC";
        "富音乐";
        EnumC3676 enumC36725 = new EnumC3676("RICH_MUSIC", 19, 42);
        String str21 = "TING_AUDIO";
        "听音频";
        EnumC3676 enumC36726 = new EnumC3676("TING_AUDIO", 20, 47);
        String str22 = "LIVE_PHOTO";
        "实况";
        EnumC3676 enumC36727 = new EnumC3676("LIVE_PHOTO", 21, 54);
        f11524 = enumC36727;
        f11525 = new EnumC3676[]{enumC3676, enumC3677, enumC3678, enumC3679, enumC36710, enumC36711, enumC36712, enumC36713, enumC36714, enumC36715, enumC36716, enumC36717, enumC36718, enumC36719, enumC36720, enumC36721, enumC36722, enumC36723, enumC36724, enumC36725, enumC36726, enumC36727};
    }

    public EnumC3676(String str, int i, int i2) {
        super(str, i);
        this.f11526 = i2;
    }

    public static EnumC3676 valueOf(String str) {
        return (EnumC3676) Enum.valueOf(EnumC3676.class, str);
    }

    public static EnumC3676[] values() {
        return (EnumC3676[]) f11525.clone();
    }
}
