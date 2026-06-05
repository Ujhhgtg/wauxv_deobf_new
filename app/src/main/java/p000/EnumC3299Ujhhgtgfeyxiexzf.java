package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF23' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛱUjhhgtgᛱ能不能ᛴᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3299Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3299Ujhhgtgfeyxiexzf[] f10335Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final /* synthetic */ C3369feyxiexzfUjhhgtg f10336Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f10337Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f10338Ujhhgtgfeyxiexzf;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3299Ujhhgtgfeyxiexzf EF23;

    static {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        EnumC3299Ujhhgtgfeyxiexzf[] enumC3299UjhhgtgfeyxiexzfArr = {new EnumC3299Ujhhgtgfeyxiexzf(0, "ONE", "一", 0), new EnumC3299Ujhhgtgfeyxiexzf(1, "TWO", "二", 1), new EnumC3299Ujhhgtgfeyxiexzf(2, "THREE", "三", 2), new EnumC3299Ujhhgtgfeyxiexzf(3, "FOUR", "四", 3), new EnumC3299Ujhhgtgfeyxiexzf(4, "FIVE", "五", 4), new EnumC3299Ujhhgtgfeyxiexzf(5, "SIX", "六", 5)};
        f10335Ujhhgtgfeyxiexzf = enumC3299UjhhgtgfeyxiexzfArr;
        f10336Ujhhgtgfeyxiexzf = new C3369feyxiexzfUjhhgtg(enumC3299UjhhgtgfeyxiexzfArr);
    }

    public EnumC3299Ujhhgtgfeyxiexzf(int i, String str, String str2, int i2) {
        super(str, i);
        this.f10337Ujhhgtgfeyxiexzf = i2;
        this.f10338Ujhhgtgfeyxiexzf = str2;
    }

    public static EnumC3299Ujhhgtgfeyxiexzf valueOf(String str) {
        return (EnumC3299Ujhhgtgfeyxiexzf) Enum.valueOf(EnumC3299Ujhhgtgfeyxiexzf.class, str);
    }

    public static EnumC3299Ujhhgtgfeyxiexzf[] values() {
        return (EnumC3299Ujhhgtgfeyxiexzf[]) f10335Ujhhgtgfeyxiexzf.clone();
    }
}
