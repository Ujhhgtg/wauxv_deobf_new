package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0884 {

    public static final EnumC0884 f3325;

    public static final /* synthetic */ EnumC0884[] f3326;

    static {
        EnumC0884 enumC0884 = new EnumC0884("COROUTINE_SUSPENDED", 0);
        f3325 = enumC0884;
        f3326 = new EnumC0884[]{enumC0884, new EnumC0884("UNDECIDED", 1), new EnumC0884("RESUMED", 2)};
    }

    public static EnumC0884 valueOf(String str) {
        return (EnumC0884) Enum.valueOf(EnumC0884.class, str);
    }

    public static EnumC0884[] values() {
        return (EnumC0884[]) f3326.clone();
    }
}
