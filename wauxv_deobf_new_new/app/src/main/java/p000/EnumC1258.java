package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᤞᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1258 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final EnumC1258 f4572;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final EnumC1258 f4573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1258[] f4574;

    static {
        EnumC1258 enumC1258 = new EnumC1258("EXPAND_DIRECTION_HORIZONTAL", 0);
        f4572 = enumC1258;
        EnumC1258 enumC1259 = new EnumC1258("EXPAND_DIRECTION_VERTICAL", 1);
        f4573 = enumC1259;
        f4574 = new EnumC1258[]{enumC1258, enumC1259};
    }

    public static EnumC1258 valueOf(String str) {
        return (EnumC1258) Enum.valueOf(EnumC1258.class, str);
    }

    public static EnumC1258[] values() {
        return (EnumC1258[]) f4574.clone();
    }
}
