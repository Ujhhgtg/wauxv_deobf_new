package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲀᲈᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0969 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final EnumC0969 f3517;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC0969 f3518;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC0969 f3519;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0969[] f3520;

    static {
        EnumC0969 enumC0969 = new EnumC0969("PREFER_ARGB_8888", 0);
        f3517 = enumC0969;
        EnumC0969 enumC09610 = new EnumC0969("PREFER_RGB_565", 1);
        f3518 = enumC09610;
        f3520 = new EnumC0969[]{enumC0969, enumC09610};
        f3519 = enumC0969;
    }

    public static EnumC0969 valueOf(String str) {
        return (EnumC0969) Enum.valueOf(EnumC0969.class, str);
    }

    public static EnumC0969[] values() {
        return (EnumC0969[]) f3520.clone();
    }
}
