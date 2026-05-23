package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲁᲀᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0822 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC0822 f3214;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC0822 f3215;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final EnumC0822 f3216;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0822[] f3217;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String[] f3218;

    static {
        String[] strArr = AbstractC1574.f5469;
        String str = "GROUPS";
        "所有群聊";
        EnumC0822 enumC0822 = new EnumC0822("GROUPS", 0, new String[]{"contact.username LIKE '%@chatroom'"});
        f3214 = enumC0822;
        String str2 = "FRIENDS";
        "所有好友";
        EnumC0822 enumC0823 = new EnumC0822("FRIENDS", 1, new String[]{"contact.type & 1 != 0", "contact.type & 32 = 0", "contact.type & 8 = 0", "contact.verifyFlag & 8 = 0", "(contact.usernameFlag IN (0))"});
        f3215 = enumC0823;
        String str3 = "OFFICIALS";
        "所有公众号";
        EnumC0822 enumC0824 = new EnumC0822("OFFICIALS", 2, new String[]{"contact.verifyFlag & 8 != 0"});
        f3216 = enumC0824;
        f3217 = new EnumC0822[]{enumC0822, enumC0823, enumC0824};
    }

    public EnumC0822(String str, int i, String[] strArr) {
        super(str, i);
        this.f3218 = strArr;
    }

    public static EnumC0822 valueOf(String str) {
        return (EnumC0822) Enum.valueOf(EnumC0822.class, str);
    }

    public static EnumC0822[] values() {
        return (EnumC0822[]) f3217.clone();
    }
}
