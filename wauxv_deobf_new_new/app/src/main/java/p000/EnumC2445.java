package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᲁᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2445 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final EnumC2445 f7797;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2445[] f7798;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2445 EF0;

    static {
        EnumC2445 enumC2445 = new EnumC2445("SRGB", 0);
        EnumC2445 enumC2446 = new EnumC2445("DISPLAY_P3", 1);
        f7797 = enumC2446;
        f7798 = new EnumC2445[]{enumC2445, enumC2446};
    }

    public static EnumC2445 valueOf(String str) {
        return (EnumC2445) Enum.valueOf(EnumC2445.class, str);
    }

    public static EnumC2445[] values() {
        return (EnumC2445[]) f7798.clone();
    }
}
