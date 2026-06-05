package p000;

import java.security.MessageDigest;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛳ要点脸ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2592feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final ConcurrentHashMap f8390Ujhhgtgfeyxiexzf = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final ConcurrentHashMap f8391Ujhhgtgfeyxiexzf = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m3849Ujhhgtgfeyxiexzf(String str, String str2, ClassLoader classLoader) {
        return str + "#" + str2 + "#" + System.identityHashCode(classLoader);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static Class m3850Ujhhgtgfeyxiexzf(final String str, final byte[] bArr, final ClassLoader classLoader) {
        String strM2820Ujhhgtgfeyxiexzf;
        try {
            strM2820Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2820Ujhhgtgfeyxiexzf(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Exception e) {
            System.err.println("[BeanShell] GetMd5ByBytes: " + e);
            strM2820Ujhhgtgfeyxiexzf = null;
        }
        if (strM2820Ujhhgtgfeyxiexzf == null) {
            return null;
        }
        return (Class) f8390Ujhhgtgfeyxiexzf.computeIfAbsent(m3849Ujhhgtgfeyxiexzf(str, strM2820Ujhhgtgfeyxiexzf, classLoader), new Function() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ要点脸
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = str;
                try {
                    return AbstractC3611Ujhhgtgfeyxiexzf.m5213Ujhhgtgfeyxiexzf(str2, bArr, classLoader).loadClass(str2);
                } catch (Exception e2) {
                    System.err.println("[BeanShell] getClassByCode: " + e2);
                    return null;
                }
            }
        });
    }
}
