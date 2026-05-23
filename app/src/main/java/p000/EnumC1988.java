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
public final class EnumC1988 {

    public static final EnumC1988 f6603;

    public static final EnumC1988 f6604;

    public static final EnumC1988 f6605;

    public static final /* synthetic */ EnumC1988[] f6606;

    public static final /* synthetic */ C1225 f6607;

    public final int f6608;

    public final int f6609;

    static {
        String[] strArr = AbstractC1574.f5469;
        EnumC1988 enumC1988 = new EnumC1988(0, "WECHAT_SCAN", 0, 4);
        f6603 = enumC1988;
        EnumC1988 enumC1989 = new EnumC1988(1, "ALBUM_SCAN", 1, 34);
        f6604 = enumC1989;
        EnumC1988 enumC19810 = new EnumC1988(2, "LONG_PRESS_SCAN", 4, 37);
        f6605 = enumC19810;
        EnumC1988[] enumC1988Arr = {enumC1988, enumC1989, enumC19810};
        f6606 = enumC1988Arr;
        f6607 = new C1225(enumC1988Arr);
    }

    public EnumC1988(int i, String str, int i2, int i3) {
        super(str, i);
        this.f6608 = i2;
        this.f6609 = i3;
    }

    public static EnumC1988 valueOf(String str) {
        return (EnumC1988) Enum.valueOf(EnumC1988.class, str);
    }

    public static EnumC1988[] values() {
        return (EnumC1988[]) f6606.clone();
    }
}
