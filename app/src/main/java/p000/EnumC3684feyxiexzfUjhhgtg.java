package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3684feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final EnumC3684feyxiexzfUjhhgtg f11711Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final EnumC3684feyxiexzfUjhhgtg f11712Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final EnumC3684feyxiexzfUjhhgtg f11713Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3684feyxiexzfUjhhgtg[] f11714Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String[] f11715Ujhhgtgfeyxiexzf;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        String str = "GROUPS";
        "所有群聊";
        EnumC3684feyxiexzfUjhhgtg enumC3684feyxiexzfUjhhgtg = new EnumC3684feyxiexzfUjhhgtg(str, 0, new String[]{"contact.username LIKE '%@chatroom'"});
        f11711Ujhhgtgfeyxiexzf = enumC3684feyxiexzfUjhhgtg;
        String str2 = "FRIENDS";
        "所有好友";
        EnumC3684feyxiexzfUjhhgtg enumC3684feyxiexzfUjhhgtg2 = new EnumC3684feyxiexzfUjhhgtg(str2, 1, new String[]{"contact.type & 1 != 0", "contact.type & 32 = 0", "contact.type & 8 = 0", "contact.verifyFlag & 8 = 0", "(contact.usernameFlag IN (0))"});
        f11712Ujhhgtgfeyxiexzf = enumC3684feyxiexzfUjhhgtg2;
        String str3 = "OFFICIALS";
        "所有公众号";
        EnumC3684feyxiexzfUjhhgtg enumC3684feyxiexzfUjhhgtg3 = new EnumC3684feyxiexzfUjhhgtg(str3, 2, new String[]{"contact.verifyFlag & 8 != 0"});
        f11713Ujhhgtgfeyxiexzf = enumC3684feyxiexzfUjhhgtg3;
        f11714Ujhhgtgfeyxiexzf = new EnumC3684feyxiexzfUjhhgtg[]{enumC3684feyxiexzfUjhhgtg, enumC3684feyxiexzfUjhhgtg2, enumC3684feyxiexzfUjhhgtg3};
    }

    public EnumC3684feyxiexzfUjhhgtg(String str, int i, String[] strArr) {
        super(str, i);
        this.f11715Ujhhgtgfeyxiexzf = strArr;
    }

    public static EnumC3684feyxiexzfUjhhgtg valueOf(String str) {
        return (EnumC3684feyxiexzfUjhhgtg) Enum.valueOf(EnumC3684feyxiexzfUjhhgtg.class, str);
    }

    public static EnumC3684feyxiexzfUjhhgtg[] values() {
        return (EnumC3684feyxiexzfUjhhgtg[]) f11714Ujhhgtgfeyxiexzf.clone();
    }
}
