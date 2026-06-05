package p000;

import java.util.Iterator;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛳᛴ能不能ᛲ[], still in use, count: 1, list:
  (r0v1 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛳᛴ能不能ᛲ[]) from 0x003c: CONSTRUCTOR (r0v1 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛳᛴ能不能ᛲ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:61) call: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛳᛴ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0867feyxiexzfUjhhgtg {
    INVALID(-1),
    VARINT(0),
    i64(1),
    SIZE_DELIMITED(2),
    i32(5);


    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final EnumC0867feyxiexzfUjhhgtg[] f3370Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final /* synthetic */ C3369feyxiexzfUjhhgtg f3377Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f3378Ujhhgtgfeyxiexzf;

    static {
        Object next;
        f3377Ujhhgtgfeyxiexzf = new C3369feyxiexzfUjhhgtg(enumC0867feyxiexzfUjhhgtgArr);
        EnumC0867feyxiexzfUjhhgtg[] enumC0867feyxiexzfUjhhgtgArr = new EnumC0867feyxiexzfUjhhgtg[8];
        for (int i = 0; i < 8; i++) {
            Iterator it = f3377Ujhhgtgfeyxiexzf.iterator();
            do {
                C2930Ujhhgtgfeyxiexzf c2930Ujhhgtgfeyxiexzf = (C2930Ujhhgtgfeyxiexzf) it;
                if (!c2930Ujhhgtgfeyxiexzf.hasNext()) {
                    next = null;
                    break;
                }
                next = c2930Ujhhgtgfeyxiexzf.next();
            } while (((EnumC0867feyxiexzfUjhhgtg) next).f3378Ujhhgtgfeyxiexzf != i);
            EnumC0867feyxiexzfUjhhgtg enumC0867feyxiexzfUjhhgtg = (EnumC0867feyxiexzfUjhhgtg) next;
            if (enumC0867feyxiexzfUjhhgtg == null) {
                enumC0867feyxiexzfUjhhgtg = INVALID;
            }
            enumC0867feyxiexzfUjhhgtgArr[i] = enumC0867feyxiexzfUjhhgtg;
        }
        f3370Ujhhgtgfeyxiexzf = enumC0867feyxiexzfUjhhgtgArr;
    }

    public EnumC0867feyxiexzfUjhhgtg(int i) {
        super(str, i);
        this.f3378Ujhhgtgfeyxiexzf = i;
    }

    public static EnumC0867feyxiexzfUjhhgtg valueOf(String str) {
        return (EnumC0867feyxiexzfUjhhgtg) Enum.valueOf(EnumC0867feyxiexzfUjhhgtg.class, str);
    }

    public static EnumC0867feyxiexzfUjhhgtg[] values() {
        return (EnumC0867feyxiexzfUjhhgtg[]) f3376Ujhhgtgfeyxiexzf.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('(');
        return AbstractC3317feyxiexzfUjhhgtg.m4802Ujhhgtgfeyxiexzf(sb, this.f3378Ujhhgtgfeyxiexzf, ')');
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m2298Ujhhgtgfeyxiexzf(int i) {
        return (i << 3) | this.f3378Ujhhgtgfeyxiexzf;
    }
}
