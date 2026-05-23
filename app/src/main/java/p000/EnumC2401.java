package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᛸᲁᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2401 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final EnumC2401 f7672;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC2401 f7673;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC2401 f7674;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final EnumC2401 f7675;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2401[] f7676;

    static {
        EnumC2401 enumC2401 = new EnumC2401("IMMEDIATE", 0);
        f7672 = enumC2401;
        EnumC2401 enumC2402 = new EnumC2401("HIGH", 1);
        f7673 = enumC2402;
        EnumC2401 enumC2403 = new EnumC2401("NORMAL", 2);
        f7674 = enumC2403;
        EnumC2401 enumC2404 = new EnumC2401("LOW", 3);
        f7675 = enumC2404;
        f7676 = new EnumC2401[]{enumC2401, enumC2402, enumC2403, enumC2404};
    }

    public static EnumC2401 valueOf(String str) {
        return (EnumC2401) Enum.valueOf(EnumC2401.class, str);
    }

    public static EnumC2401[] values() {
        return (EnumC2401[]) f7676.clone();
    }
}
