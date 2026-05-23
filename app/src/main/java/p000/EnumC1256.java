package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲀᲁᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1256 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final EnumC1256 f4573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC1256 f4574;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1256[] f4575;

    static {
        EnumC1256 enumC1256 = new EnumC1256("EXPAND_DIRECTION_HORIZONTAL", 0);
        f4573 = enumC1256;
        EnumC1256 enumC1257 = new EnumC1256("EXPAND_DIRECTION_VERTICAL", 1);
        f4574 = enumC1257;
        f4575 = new EnumC1256[]{enumC1256, enumC1257};
    }

    public static EnumC1256 valueOf(String str) {
        return (EnumC1256) Enum.valueOf(EnumC1256.class, str);
    }

    public static EnumC1256[] values() {
        return (EnumC1256[]) f4575.clone();
    }
}
