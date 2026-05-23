package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1770 {

    public static final EnumC1770 f5891;

    public static final EnumC1770 f5892;

    public static final EnumC1770 f5893;

    public static final EnumC1770 f5894;

    public static final EnumC1770 f5895;

    public static final /* synthetic */ EnumC1770[] f5896;

    static {
        EnumC1770 enumC1770 = new EnumC1770("DESTROYED", 0);
        f5891 = enumC1770;
        EnumC1770 enumC1771 = new EnumC1770("INITIALIZED", 1);
        f5892 = enumC1771;
        EnumC1770 enumC1772 = new EnumC1770("CREATED", 2);
        f5893 = enumC1772;
        EnumC1770 enumC1773 = new EnumC1770("STARTED", 3);
        f5894 = enumC1773;
        EnumC1770 enumC1774 = new EnumC1770("RESUMED", 4);
        f5895 = enumC1774;
        f5896 = new EnumC1770[]{enumC1770, enumC1771, enumC1772, enumC1773, enumC1774};
    }

    public static EnumC1770 valueOf(String str) {
        return (EnumC1770) Enum.valueOf(EnumC1770.class, str);
    }

    public static EnumC1770[] values() {
        return (EnumC1770[]) f5896.clone();
    }
}
