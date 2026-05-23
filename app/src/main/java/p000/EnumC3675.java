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
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᤝᲁᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3675 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC3675 f11514;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC3675 f11515;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final EnumC3675 f11516;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3675[] f11517;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f11518;

    static {
        String[] strArr = AbstractC1574.f5469;
        String str = "MAIN_PROCESS";
        
        EnumC3675 enumC3675 = new EnumC3675("MAIN_PROCESS", 0, C1565.m3277());
        f11514 = enumC3675;
        EnumC3675 enumC3676 = new EnumC3675("APP_BRAND_0", 1, C1565.m3277() + ":appbrand0");
        f11515 = enumC3676;
        EnumC3675 enumC3677 = new EnumC3675("APP_BRAND_1", 2, C1565.m3277() + ":appbrand1");
        f11516 = enumC3677;
        f11517 = new EnumC3675[]{enumC3675, enumC3676, enumC3677, new EnumC3675("APP_BRAND_2", 3, C1565.m3277() + ":appbrand2"), new EnumC3675("APP_BRAND_3", 4, C1565.m3277() + ":appbrand3"), new EnumC3675("APP_BRAND_4", 5, C1565.m3277() + ":appbrand4")};
    }

    public EnumC3675(String str, int i, String str2) {
        super(str, i);
        this.f11518 = str2;
    }

    public static EnumC3675 valueOf(String str) {
        return (EnumC3675) Enum.valueOf(EnumC3675.class, str);
    }

    public static EnumC3675[] values() {
        return (EnumC3675[]) f11517.clone();
    }
}
