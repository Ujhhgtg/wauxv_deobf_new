package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲀᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0973 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final EnumC0973 f3533;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final EnumC0973 f3534;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC0973 f3535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0973[] f3536;

    static {
        EnumC0973 enumC0973 = new EnumC0973("PREFER_ARGB_8888", 0);
        f3533 = enumC0973;
        EnumC0973 enumC0974 = new EnumC0973("PREFER_RGB_565", 1);
        f3534 = enumC0974;
        f3536 = new EnumC0973[]{enumC0973, enumC0974};
        f3535 = enumC0973;
    }

    public static EnumC0973 valueOf(String str) {
        return (EnumC0973) Enum.valueOf(EnumC0973.class, str);
    }

    public static EnumC0973[] values() {
        return (EnumC0973[]) f3536.clone();
    }
}
