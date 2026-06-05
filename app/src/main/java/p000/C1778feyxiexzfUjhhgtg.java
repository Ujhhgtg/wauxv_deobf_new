package p000;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛴᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1778feyxiexzfUjhhgtg extends C1779feyxiexzfUjhhgtg {
    @Override // p000.C1779feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final Typeface mo3099feyxiexzfUjhhgtg(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f5966Ujhhgtgfeyxiexzf, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f5972Ujhhgtgfeyxiexzf.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.C1779feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Method mo3100Ujhhgtgfeyxiexzf(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
