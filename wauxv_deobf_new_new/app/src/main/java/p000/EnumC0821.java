package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲇᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0821 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final EnumC0821 f3221;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC0821 f3222;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final EnumC0821 f3223;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0821[] f3224;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String[] f3225;

    static {
        String[] strArr = AbstractC1471.f5234;
        String str = "GROUPS";
        "所有群聊";
        EnumC0821 enumC0821 = new EnumC0821(str, 0, new String[]{"contact.username LIKE '%@chatroom'"});
        f3221 = enumC0821;
        String str2 = "FRIENDS";
        "所有好友";
        EnumC0821 enumC0822 = new EnumC0821(str2, 1, new String[]{"contact.type & 1 != 0", "contact.type & 32 = 0", "contact.type & 8 = 0", "contact.verifyFlag & 8 = 0", "(contact.usernameFlag IN (0))"});
        f3222 = enumC0822;
        String str3 = "OFFICIALS";
        "所有公众号";
        EnumC0821 enumC0823 = new EnumC0821(str3, 2, new String[]{"contact.verifyFlag & 8 != 0"});
        f3223 = enumC0823;
        f3224 = new EnumC0821[]{enumC0821, enumC0822, enumC0823};
    }

    public EnumC0821(String str, int i, String[] strArr) {
        super(str, i);
        this.f3225 = strArr;
    }

    public static EnumC0821 valueOf(String str) {
        return (EnumC0821) Enum.valueOf(EnumC0821.class, str);
    }

    public static EnumC0821[] values() {
        return (EnumC0821[]) f3224.clone();
    }
}
