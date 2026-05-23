package p000;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2352 {

    public static final Method f7546;

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
            if (AbstractC2207.m4087(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (AbstractC2207.m4087(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f7546 = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !AbstractC2207.m4087(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
