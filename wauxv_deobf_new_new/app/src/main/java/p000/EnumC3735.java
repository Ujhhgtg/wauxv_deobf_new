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
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᤞᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3735 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final EnumC3735 f11663;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC3735 f11664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC3735 f11665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3735[] f11666;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f11667;

    static {
        String[] strArr = AbstractC1471.f5234;
        String str = "MAIN_PROCESS";
        C1576.f5470.getClass();
        EnumC3735 enumC3735 = new EnumC3735(str, 0, C1576.m3457());
        f11663 = enumC3735;
        EnumC3735 enumC3736 = new EnumC3735("APP_BRAND_0", 1, C1576.m3457() + ":appbrand0");
        f11664 = enumC3736;
        EnumC3735 enumC3737 = new EnumC3735("APP_BRAND_1", 2, C1576.m3457() + ":appbrand1");
        f11665 = enumC3737;
        f11666 = new EnumC3735[]{enumC3735, enumC3736, enumC3737, new EnumC3735("APP_BRAND_2", 3, C1576.m3457() + ":appbrand2"), new EnumC3735("APP_BRAND_3", 4, C1576.m3457() + ":appbrand3"), new EnumC3735("APP_BRAND_4", 5, C1576.m3457() + ":appbrand4")};
    }

    public EnumC3735(String str, int i, String str2) {
        super(str, i);
        this.f11667 = str2;
    }

    public static EnumC3735 valueOf(String str) {
        return (EnumC3735) Enum.valueOf(EnumC3735.class, str);
    }

    public static EnumC3735[] values() {
        return (EnumC3735[]) f11666.clone();
    }
}
