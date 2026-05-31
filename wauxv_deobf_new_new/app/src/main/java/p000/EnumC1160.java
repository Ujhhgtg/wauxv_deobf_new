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
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᤞᛸᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1160 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1160[] f4276;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final /* synthetic */ C1227 f4277;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f4278;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f4279;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1160 EF23;

    static {
        String[] strArr = AbstractC1471.f5234;
        EnumC1160[] enumC1160Arr = {new EnumC1160(0, "SCISSORS", "剪刀", 0), new EnumC1160(1, "STONE", "石头", 1), new EnumC1160(2, "PAPER", "布", 2)};
        f4276 = enumC1160Arr;
        f4277 = new C1227(enumC1160Arr);
    }

    public EnumC1160(int i, String str, String str2, int i2) {
        super(str, i);
        this.f4278 = i2;
        this.f4279 = str2;
    }

    public static EnumC1160 valueOf(String str) {
        return (EnumC1160) Enum.valueOf(EnumC1160.class, str);
    }

    public static EnumC1160[] values() {
        return (EnumC1160[]) f4276.clone();
    }
}
