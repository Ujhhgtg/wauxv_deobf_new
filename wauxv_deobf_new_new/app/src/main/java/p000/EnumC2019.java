package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲈᲀᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2019 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC2019 f6708;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC2019 f6709;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final EnumC2019 f6710;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2019[] f6711;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final /* synthetic */ C1227 f6712;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f6713;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f6714;

    static {
        String[] strArr = AbstractC1471.f5234;
        EnumC2019 enumC2019 = new EnumC2019(0, "WECHAT_SCAN", 0, 4);
        f6708 = enumC2019;
        EnumC2019 enumC20110 = new EnumC2019(1, "ALBUM_SCAN", 1, 34);
        f6709 = enumC20110;
        EnumC2019 enumC20111 = new EnumC2019(2, "LONG_PRESS_SCAN", 4, 37);
        f6710 = enumC20111;
        EnumC2019[] enumC2019Arr = {enumC2019, enumC20110, enumC20111};
        f6711 = enumC2019Arr;
        f6712 = new C1227(enumC2019Arr);
    }

    public EnumC2019(int i, String str, int i2, int i3) {
        super(str, i);
        this.f6713 = i2;
        this.f6714 = i3;
    }

    public static EnumC2019 valueOf(String str) {
        return (EnumC2019) Enum.valueOf(EnumC2019.class, str);
    }

    public static EnumC2019[] values() {
        return (EnumC2019[]) f6711.clone();
    }
}
