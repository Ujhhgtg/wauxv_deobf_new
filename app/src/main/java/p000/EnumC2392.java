package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2392 {

    public static final EnumC2392 f7653;

    public static final /* synthetic */ EnumC2392[] f7654;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2392 EF0;

    static {
        EnumC2392 enumC2392 = new EnumC2392("SRGB", 0);
        EnumC2392 enumC2393 = new EnumC2392("DISPLAY_P3", 1);
        f7653 = enumC2393;
        f7654 = new EnumC2392[]{enumC2392, enumC2393};
    }

    public static EnumC2392 valueOf(String str) {
        return (EnumC2392) Enum.valueOf(EnumC2392.class, str);
    }

    public static EnumC2392[] values() {
        return (EnumC2392[]) f7654.clone();
    }
}
