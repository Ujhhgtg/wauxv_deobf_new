package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᛸᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1154 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC1154 f4262;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final EnumC1154 f4263;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final EnumC1154 f4264;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final EnumC1154 f4265;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final EnumC1154 f4266;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final EnumC1154 f4267;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1154[] f4268;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ C1225 f4269;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f4270;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f4271;

    static {
        String[] strArr = AbstractC1574.f5469;
        EnumC1154 enumC1154 = new EnumC1154(0, "ONE", "一", 0);
        f4262 = enumC1154;
        EnumC1154 enumC1155 = new EnumC1154(1, "TWO", "二", 1);
        f4263 = enumC1155;
        EnumC1154 enumC1156 = new EnumC1154(2, "THREE", "三", 2);
        f4264 = enumC1156;
        EnumC1154 enumC1157 = new EnumC1154(3, "FOUR", "四", 3);
        f4265 = enumC1157;
        EnumC1154 enumC1158 = new EnumC1154(4, "FIVE", "五", 4);
        f4266 = enumC1158;
        EnumC1154 enumC1159 = new EnumC1154(5, "SIX", "六", 5);
        f4267 = enumC1159;
        EnumC1154[] enumC1154Arr = {enumC1154, enumC1155, enumC1156, enumC1157, enumC1158, enumC1159};
        f4268 = enumC1154Arr;
        f4269 = new C1225(enumC1154Arr);
    }

    public EnumC1154(int i, String str, String str2, int i2) {
        super(str, i);
        this.f4270 = i2;
        this.f4271 = str2;
    }

    public static EnumC1154 valueOf(String str) {
        return (EnumC1154) Enum.valueOf(EnumC1154.class, str);
    }

    public static EnumC1154[] values() {
        return (EnumC1154[]) f4268.clone();
    }
}
