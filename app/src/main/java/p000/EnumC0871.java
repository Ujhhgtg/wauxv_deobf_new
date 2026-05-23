package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0871 {

    public static final EnumC0871 f3299;

    public static final EnumC0871 f3300;

    public static final /* synthetic */ EnumC0871[] f3301;

    static {
        EnumC0871 enumC0871 = new EnumC0871("BULLET", 0);
        f3299 = enumC0871;
        EnumC0871 enumC0872 = new EnumC0871("ORDERED", 1);
        f3300 = enumC0872;
        f3301 = new EnumC0871[]{enumC0871, enumC0872};
    }

    public static EnumC0871 valueOf(String str) {
        return (EnumC0871) Enum.valueOf(EnumC0871.class, str);
    }

    public static EnumC0871[] values() {
        return (EnumC0871[]) f3301.clone();
    }
}
