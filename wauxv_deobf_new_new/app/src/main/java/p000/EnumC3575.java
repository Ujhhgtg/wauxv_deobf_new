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
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲀᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3575 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final EnumC3575 f11175;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC3575 f11176;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC3575 f11177;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final EnumC3575 f11178;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3575[] f11179;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f11180;

    static {
        String[] strArr = AbstractC1471.f5234;
        String str = "WXID";
        "微信ID";
        EnumC3575 enumC3575 = new EnumC3575(str, 0, 2);
        f11175 = enumC3575;
        String str2 = "NAME";
        "名字";
        EnumC3575 enumC3576 = new EnumC3575(str2, 1, 4);
        f11176 = enumC3576;
        String str3 = "EMAIL";
        "邮箱";
        EnumC3575 enumC3577 = new EnumC3575(str3, 2, 5);
        String str4 = "PHONE";
        "手机";
        EnumC3575 enumC3578 = new EnumC3575(str4, 3, 6);
        String str5 = "QQ";
        "QQ";
        EnumC3575 enumC3579 = new EnumC3575(str5, 4, 9);
        String str6 = "ALIAS";
        "微信号";
        EnumC3575 enumC35710 = new EnumC3575(str6, 5, 42);
        f11177 = enumC35710;
        String str7 = "SEX";
        "性别";
        EnumC3575 enumC35711 = new EnumC3575(str7, 6, 12290);
        String str8 = "SIGN";
        "签名";
        EnumC3575 enumC35712 = new EnumC3575(str8, 7, 12291);
        f11178 = enumC35712;
        String str9 = "CITY";
        "城市";
        EnumC3575 enumC35713 = new EnumC3575(str9, 8, 12292);
        String str10 = "PROVINCE";
        "省份";
        f11179 = new EnumC3575[]{enumC3575, enumC3576, enumC3577, enumC3578, enumC3579, enumC35710, enumC35711, enumC35712, enumC35713, new EnumC3575(str10, 9, 12293)};
    }

    public EnumC3575(String str, int i, int i2) {
        super(str, i);
        this.f11180 = i2;
    }

    public static EnumC3575 valueOf(String str) {
        return (EnumC3575) Enum.valueOf(EnumC3575.class, str);
    }

    public static EnumC3575[] values() {
        return (EnumC3575[]) f11179.clone();
    }
}
