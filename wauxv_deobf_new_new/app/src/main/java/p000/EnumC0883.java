package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲁᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0883 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final EnumC0883 f3332;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0883[] f3333;

    static {
        EnumC0883 enumC0883 = new EnumC0883("COROUTINE_SUSPENDED", 0);
        f3332 = enumC0883;
        f3333 = new EnumC0883[]{enumC0883, new EnumC0883("UNDECIDED", 1), new EnumC0883("RESUMED", 2)};
    }

    public static EnumC0883 valueOf(String str) {
        return (EnumC0883) Enum.valueOf(EnumC0883.class, str);
    }

    public static EnumC0883[] values() {
        return (EnumC0883[]) f3333.clone();
    }
}
