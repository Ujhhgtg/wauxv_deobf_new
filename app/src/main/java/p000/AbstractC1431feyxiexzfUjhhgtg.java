package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛳ能不能ᛲᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1431feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final Method f5027Ujhhgtgfeyxiexzf;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f5027Ujhhgtgfeyxiexzf = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
