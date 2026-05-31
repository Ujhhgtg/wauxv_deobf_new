package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᲁᲇᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2446 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final EnumC2446 f7799;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final EnumC2446 f7800;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2446[] f7801;

    static {
        EnumC2446 enumC2446 = new EnumC2446("NULL_VALUE", 0);
        f7799 = enumC2446;
        EnumC2446 enumC2447 = new EnumC2446("VOID_TYPE", 1);
        f7800 = enumC2447;
        f7801 = new EnumC2446[]{enumC2446, enumC2447};
    }

    public static EnumC2446 valueOf(String str) {
        return (EnumC2446) Enum.valueOf(EnumC2446.class, str);
    }

    public static EnumC2446[] values() {
        return (EnumC2446[]) f7801.clone();
    }
}
