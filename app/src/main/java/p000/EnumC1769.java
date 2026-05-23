package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᛸᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1769 {
    private static final /* synthetic */ EnumC1769[] $VALUES;
    public static final C1767 Companion;
    public static final EnumC1769 ON_ANY;
    public static final EnumC1769 ON_CREATE;
    public static final EnumC1769 ON_DESTROY;
    public static final EnumC1769 ON_PAUSE;
    public static final EnumC1769 ON_RESUME;
    public static final EnumC1769 ON_START;
    public static final EnumC1769 ON_STOP;

    static {
        EnumC1769 enumC1769 = new EnumC1769("ON_CREATE", 0);
        ON_CREATE = enumC1769;
        EnumC1769 enumC17610 = new EnumC1769("ON_START", 1);
        ON_START = enumC17610;
        EnumC1769 enumC17611 = new EnumC1769("ON_RESUME", 2);
        ON_RESUME = enumC17611;
        EnumC1769 enumC17612 = new EnumC1769("ON_PAUSE", 3);
        ON_PAUSE = enumC17612;
        EnumC1769 enumC17613 = new EnumC1769("ON_STOP", 4);
        ON_STOP = enumC17613;
        EnumC1769 enumC17614 = new EnumC1769("ON_DESTROY", 5);
        ON_DESTROY = enumC17614;
        EnumC1769 enumC17615 = new EnumC1769("ON_ANY", 6);
        ON_ANY = enumC17615;
        $VALUES = new EnumC1769[]{enumC1769, enumC17610, enumC17611, enumC17612, enumC17613, enumC17614, enumC17615};
        Companion = new C1767();
    }

    public static EnumC1769 valueOf(String str) {
        return (EnumC1769) Enum.valueOf(EnumC1769.class, str);
    }

    public static EnumC1769[] values() {
        return (EnumC1769[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final EnumC1770 m3510() {
        switch (AbstractC1768.f5890[ordinal()]) {
            case 1:
            case 2:
                return EnumC1770.f5893;
            case 3:
            case 4:
                return EnumC1770.f5894;
            case 5:
                return EnumC1770.f5895;
            case 6:
                return EnumC1770.f5891;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
