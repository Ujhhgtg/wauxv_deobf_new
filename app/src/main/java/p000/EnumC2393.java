package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2393 {

    public static final EnumC2393 f7655;

    public static final EnumC2393 f7656;

    public static final /* synthetic */ EnumC2393[] f7657;

    static {
        EnumC2393 enumC2393 = new EnumC2393("NULL_VALUE", 0);
        f7655 = enumC2393;
        EnumC2393 enumC2394 = new EnumC2393("VOID_TYPE", 1);
        f7656 = enumC2394;
        f7657 = new EnumC2393[]{enumC2393, enumC2394};
    }

    public static EnumC2393 valueOf(String str) {
        return (EnumC2393) Enum.valueOf(EnumC2393.class, str);
    }

    public static EnumC2393[] values() {
        return (EnumC2393[]) f7657.clone();
    }
}
