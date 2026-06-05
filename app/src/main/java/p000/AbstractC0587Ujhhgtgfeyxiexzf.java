package p000;

import java.util.HashMap;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛳᛴ要点脸ᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0587Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final HashMap f2623Ujhhgtgfeyxiexzf = new HashMap(32);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static byte[] m1862Ujhhgtgfeyxiexzf(Class cls) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        MagicFactory.get(4928811126365357450L, strArr);
        String name = cls.getName();
        if (name.isEmpty()) {
            throw new IllegalArgumentException(MagicFactory.get(4928807686096553354L, strArr));
        }
        C0579Ujhhgtgfeyxiexzf c0579Ujhhgtgfeyxiexzf = new C0579Ujhhgtgfeyxiexzf();
        c0579Ujhhgtgfeyxiexzf.f2599Ujhhgtgfeyxiexzf = 1;
        while (c0579Ujhhgtgfeyxiexzf.hasNext()) {
            byte[] bArr = (byte[]) c0579Ujhhgtgfeyxiexzf.next();
            String str = name.endsWith(MagicFactory.get(4928807737636160906L, strArr)) ? name : MagicFactory.get(4928807729046226314L, strArr) + name.replace('.', '/') + MagicFactory.get(4928807720456291722L, strArr);
            int iM1891Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1891Ujhhgtgfeyxiexzf(96, bArr);
            int iM1891Ujhhgtgfeyxiexzf2 = AbstractC0615Ujhhgtgfeyxiexzf.m1891Ujhhgtgfeyxiexzf(100, bArr);
            for (int i = 0; i < iM1891Ujhhgtgfeyxiexzf; i++) {
                if (str.equals(AbstractC0615Ujhhgtgfeyxiexzf.m1894Ujhhgtgfeyxiexzf(AbstractC0615Ujhhgtgfeyxiexzf.m1891Ujhhgtgfeyxiexzf((i * 32) + iM1891Ujhhgtgfeyxiexzf2, bArr), bArr))) {
                    return bArr;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static String m1863Ujhhgtgfeyxiexzf(int i) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (i <= 1) {
            return MagicFactory.get(4928807518592828810L, strArr);
        }
        return MagicFactory.get(4928807604492174730L, strArr) + i + MagicFactory.get(4928807707571389834L, strArr);
    }
}
