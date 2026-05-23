package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0703 {

    public static final EnumC0703 f2678;

    public static final EnumC0703 f2679;

    public static final EnumC0703 f2680;

    public static final /* synthetic */ EnumC0703[] f2681;

    static {
        EnumC0703 enumC0703 = new EnumC0703("CLASS", 0);
        f2678 = enumC0703;
        EnumC0703 enumC0704 = new EnumC0703("INTERFACE", 1);
        f2679 = enumC0704;
        EnumC0703 enumC0705 = new EnumC0703("ENUM", 2);
        f2680 = enumC0705;
        f2681 = new EnumC0703[]{enumC0703, enumC0704, enumC0705};
    }

    public static EnumC0703 valueOf(String str) {
        return (EnumC0703) Enum.valueOf(EnumC0703.class, str);
    }

    public static EnumC0703[] values() {
        return (EnumC0703[]) f2681.clone();
    }
}
