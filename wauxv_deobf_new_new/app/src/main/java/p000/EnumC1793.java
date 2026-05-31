package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᤝᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1793 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final EnumC1793 f5947;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final EnumC1793 f5948;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC1793 f5949;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC1793 f5950;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final EnumC1793 f5951;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1793[] f5952;

    static {
        EnumC1793 enumC1793 = new EnumC1793("DESTROYED", 0);
        f5947 = enumC1793;
        EnumC1793 enumC1794 = new EnumC1793("INITIALIZED", 1);
        f5948 = enumC1794;
        EnumC1793 enumC1795 = new EnumC1793("CREATED", 2);
        f5949 = enumC1795;
        EnumC1793 enumC1796 = new EnumC1793("STARTED", 3);
        f5950 = enumC1796;
        EnumC1793 enumC1797 = new EnumC1793("RESUMED", 4);
        f5951 = enumC1797;
        f5952 = new EnumC1793[]{enumC1793, enumC1794, enumC1795, enumC1796, enumC1797};
    }

    public static EnumC1793 valueOf(String str) {
        return (EnumC1793) Enum.valueOf(EnumC1793.class, str);
    }

    public static EnumC1793[] values() {
        return (EnumC1793[]) f5952.clone();
    }
}
