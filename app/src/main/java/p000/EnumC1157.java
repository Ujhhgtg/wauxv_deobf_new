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
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1157 {

    public static final EnumC1157 f4274;

    public static final EnumC1157 f4275;

    public static final EnumC1157 f4276;

    public static final /* synthetic */ EnumC1157[] f4277;

    public static final /* synthetic */ C1225 f4278;

    public final int f4279;

    public final String f4280;

    static {
        String[] strArr = AbstractC1574.f5469;
        EnumC1157 enumC1157 = new EnumC1157(0, "SCISSORS", "剪刀", 0);
        f4274 = enumC1157;
        EnumC1157 enumC1158 = new EnumC1157(1, "STONE", "石头", 1);
        f4275 = enumC1158;
        EnumC1157 enumC1159 = new EnumC1157(2, "PAPER", "布", 2);
        f4276 = enumC1159;
        EnumC1157[] enumC1157Arr = {enumC1157, enumC1158, enumC1159};
        f4277 = enumC1157Arr;
        f4278 = new C1225(enumC1157Arr);
    }

    public EnumC1157(int i, String str, String str2, int i2) {
        super(str, i);
        this.f4279 = i2;
        this.f4280 = str2;
    }

    public static EnumC1157 valueOf(String str) {
        return (EnumC1157) Enum.valueOf(EnumC1157.class, str);
    }

    public static EnumC1157[] values() {
        return (EnumC1157[]) f4277.clone();
    }
}
