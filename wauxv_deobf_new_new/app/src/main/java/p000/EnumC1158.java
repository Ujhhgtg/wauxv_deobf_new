package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF23' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᛸᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1158 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1158[] f4271;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final /* synthetic */ C1227 f4272;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f4273;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f4274;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1158 EF23;

    static {
        String[] strArr = AbstractC1471.f5234;
        EnumC1158[] enumC1158Arr = {new EnumC1158(0, "ONE", "一", 0), new EnumC1158(1, "TWO", "二", 1), new EnumC1158(2, "THREE", "三", 2), new EnumC1158(3, "FOUR", "四", 3), new EnumC1158(4, "FIVE", "五", 4), new EnumC1158(5, "SIX", "六", 5)};
        f4271 = enumC1158Arr;
        f4272 = new C1227(enumC1158Arr);
    }

    public EnumC1158(int i, String str, String str2, int i2) {
        super(str, i);
        this.f4273 = i2;
        this.f4274 = str2;
    }

    public static EnumC1158 valueOf(String str) {
        return (EnumC1158) Enum.valueOf(EnumC1158.class, str);
    }

    public static EnumC1158[] values() {
        return (EnumC1158[]) f4271.clone();
    }
}
