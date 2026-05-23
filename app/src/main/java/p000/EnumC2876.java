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
public final class EnumC2876 {

    public static final EnumC2876 f9220;

    public static final EnumC2876 f9221;

    public static final /* synthetic */ EnumC2876[] f9222;

    public final int f9223;

    static {
        String[] strArr = AbstractC1574.f5469;
        EnumC2876 enumC2876 = new EnumC2876("WHITE", 0, 0);
        f9220 = enumC2876;
        EnumC2876 enumC2877 = new EnumC2876("BLACK", 1, 1);
        f9221 = enumC2877;
        f9222 = new EnumC2876[]{enumC2876, enumC2877};
    }

    public EnumC2876(String str, int i, int i2) {
        super(str, i);
        this.f9223 = i2;
    }

    public static EnumC2876 valueOf(String str) {
        return (EnumC2876) Enum.valueOf(EnumC2876.class, str);
    }

    public static EnumC2876[] values() {
        return (EnumC2876[]) f9222.clone();
    }
}
