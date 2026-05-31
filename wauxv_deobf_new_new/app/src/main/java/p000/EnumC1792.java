package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᤝᲈᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1792 {
    private static final /* synthetic */ EnumC1792[] $VALUES;
    public static final C1790 Companion;
    public static final EnumC1792 ON_ANY;
    public static final EnumC1792 ON_CREATE;
    public static final EnumC1792 ON_DESTROY;
    public static final EnumC1792 ON_PAUSE;
    public static final EnumC1792 ON_RESUME;
    public static final EnumC1792 ON_START;
    public static final EnumC1792 ON_STOP;

    static {
        EnumC1792 enumC1792 = new EnumC1792("ON_CREATE", 0);
        ON_CREATE = enumC1792;
        EnumC1792 enumC1793 = new EnumC1792("ON_START", 1);
        ON_START = enumC1793;
        EnumC1792 enumC1794 = new EnumC1792("ON_RESUME", 2);
        ON_RESUME = enumC1794;
        EnumC1792 enumC1795 = new EnumC1792("ON_PAUSE", 3);
        ON_PAUSE = enumC1795;
        EnumC1792 enumC1796 = new EnumC1792("ON_STOP", 4);
        ON_STOP = enumC1796;
        EnumC1792 enumC1797 = new EnumC1792("ON_DESTROY", 5);
        ON_DESTROY = enumC1797;
        EnumC1792 enumC1798 = new EnumC1792("ON_ANY", 6);
        ON_ANY = enumC1798;
        $VALUES = new EnumC1792[]{enumC1792, enumC1793, enumC1794, enumC1795, enumC1796, enumC1797, enumC1798};
        Companion = new C1790();
    }

    public static EnumC1792 valueOf(String str) {
        return (EnumC1792) Enum.valueOf(EnumC1792.class, str);
    }

    public static EnumC1792[] values() {
        return (EnumC1792[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final EnumC1793 m3682() {
        switch (AbstractC1791.f5946[ordinal()]) {
            case 1:
            case 2:
                return EnumC1793.f5949;
            case 3:
            case 4:
                return EnumC1793.f5950;
            case 5:
                return EnumC1793.f5951;
            case 6:
                return EnumC1793.f5947;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
