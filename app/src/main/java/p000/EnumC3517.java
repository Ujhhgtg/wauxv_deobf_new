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
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3517 {

    public static final EnumC3517 f11022;

    public static final EnumC3517 f11023;

    public static final EnumC3517 f11024;

    public static final EnumC3517 f11025;

    public static final /* synthetic */ EnumC3517[] f11026;

    public final int f11027;

    static {
        String[] strArr = AbstractC1574.f5469;
        String str = "WXID";
        "微信ID";
        EnumC3517 enumC3517 = new EnumC3517("WXID", 0, 2);
        f11022 = enumC3517;
        String str2 = "NAME";
        "名字";
        EnumC3517 enumC3518 = new EnumC3517("NAME", 1, 4);
        f11023 = enumC3518;
        String str3 = "EMAIL";
        "邮箱";
        EnumC3517 enumC3519 = new EnumC3517("EMAIL", 2, 5);
        String str4 = "PHONE";
        "手机";
        EnumC3517 enumC35110 = new EnumC3517("PHONE", 3, 6);
        String str5 = "QQ";
        "QQ";
        EnumC3517 enumC35111 = new EnumC3517("QQ", 4, 9);
        String str6 = "ALIAS";
        "微信号";
        EnumC3517 enumC35112 = new EnumC3517("ALIAS", 5, 42);
        f11024 = enumC35112;
        String str7 = "SEX";
        "性别";
        EnumC3517 enumC35113 = new EnumC3517("SEX", 6, 12290);
        String str8 = "SIGN";
        "签名";
        EnumC3517 enumC35114 = new EnumC3517("SIGN", 7, 12291);
        f11025 = enumC35114;
        String str9 = "CITY";
        "城市";
        EnumC3517 enumC35115 = new EnumC3517("CITY", 8, 12292);
        String str10 = "PROVINCE";
        "省份";
        f11026 = new EnumC3517[]{enumC3517, enumC3518, enumC3519, enumC35110, enumC35111, enumC35112, enumC35113, enumC35114, enumC35115, new EnumC3517("PROVINCE", 9, 12293)};
    }

    public EnumC3517(String str, int i, int i2) {
        super(str, i);
        this.f11027 = i2;
    }

    public static EnumC3517 valueOf(String str) {
        return (EnumC3517) Enum.valueOf(EnumC3517.class, str);
    }

    public static EnumC3517[] values() {
        return (EnumC3517[]) f11026.clone();
    }
}
