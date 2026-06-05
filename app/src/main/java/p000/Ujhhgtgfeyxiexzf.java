package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ能不能要点脸, reason: invalid class name */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Ujhhgtgfeyxiexzf {
    private static final /* synthetic */ Ujhhgtgfeyxiexzf[] $VALUES;
    public static final C0048Ujhhgtgfeyxiexzf Companion;
    public static final Ujhhgtgfeyxiexzf ON_ANY;
    public static final Ujhhgtgfeyxiexzf ON_CREATE;
    public static final Ujhhgtgfeyxiexzf ON_DESTROY;
    public static final Ujhhgtgfeyxiexzf ON_PAUSE;
    public static final Ujhhgtgfeyxiexzf ON_RESUME;
    public static final Ujhhgtgfeyxiexzf ON_START;
    public static final Ujhhgtgfeyxiexzf ON_STOP;

    static {
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = new Ujhhgtgfeyxiexzf("ON_CREATE", 0);
        ON_CREATE = ujhhgtgfeyxiexzf;
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf2 = new Ujhhgtgfeyxiexzf("ON_START", 1);
        ON_START = ujhhgtgfeyxiexzf2;
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf3 = new Ujhhgtgfeyxiexzf("ON_RESUME", 2);
        ON_RESUME = ujhhgtgfeyxiexzf3;
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf4 = new Ujhhgtgfeyxiexzf("ON_PAUSE", 3);
        ON_PAUSE = ujhhgtgfeyxiexzf4;
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf5 = new Ujhhgtgfeyxiexzf("ON_STOP", 4);
        ON_STOP = ujhhgtgfeyxiexzf5;
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf6 = new Ujhhgtgfeyxiexzf("ON_DESTROY", 5);
        ON_DESTROY = ujhhgtgfeyxiexzf6;
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf7 = new Ujhhgtgfeyxiexzf("ON_ANY", 6);
        ON_ANY = ujhhgtgfeyxiexzf7;
        $VALUES = new Ujhhgtgfeyxiexzf[]{ujhhgtgfeyxiexzf, ujhhgtgfeyxiexzf2, ujhhgtgfeyxiexzf3, ujhhgtgfeyxiexzf4, ujhhgtgfeyxiexzf5, ujhhgtgfeyxiexzf6, ujhhgtgfeyxiexzf7};
        Companion = new C0048Ujhhgtgfeyxiexzf();
    }

    public static Ujhhgtgfeyxiexzf valueOf(String str) {
        return (Ujhhgtgfeyxiexzf) Enum.valueOf(Ujhhgtgfeyxiexzf.class, str);
    }

    public static Ujhhgtgfeyxiexzf[] values() {
        return (Ujhhgtgfeyxiexzf[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final EnumC0044Ujhhgtgfeyxiexzf m1051Ujhhgtgfeyxiexzf() {
        switch (AbstractC0047Ujhhgtgfeyxiexzf.f1062Ujhhgtgfeyxiexzf[ordinal()]) {
            case 1:
            case 2:
                return EnumC0044Ujhhgtgfeyxiexzf.f1058Ujhhgtgfeyxiexzf;
            case 3:
            case 4:
                return EnumC0044Ujhhgtgfeyxiexzf.f1059Ujhhgtgfeyxiexzf;
            case 5:
                return EnumC0044Ujhhgtgfeyxiexzf.f1060Ujhhgtgfeyxiexzf;
            case 6:
                return EnumC0044Ujhhgtgfeyxiexzf.f1056Ujhhgtgfeyxiexzf;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
