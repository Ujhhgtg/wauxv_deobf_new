package p000;

import java.io.Serializable;
import java.lang.reflect.Method;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱ能不能ᛴᛱUjhhgtgᛱᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3271feyxiexzfUjhhgtg implements Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f10282Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f10283Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String f10284Ujhhgtgfeyxiexzf;

    public C3271feyxiexzfUjhhgtg(Method method) {
        this.f10282Ujhhgtgfeyxiexzf = m4778Ujhhgtgfeyxiexzf(method.getDeclaringClass());
        this.f10283Ujhhgtgfeyxiexzf = method.getName();
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("(");
        for (Class<?> cls : method.getParameterTypes()) {
            sb.append(m4778Ujhhgtgfeyxiexzf(cls));
        }
        sb.append(")");
        sb.append(m4778Ujhhgtgfeyxiexzf(method.getReturnType()));
        this.f10284Ujhhgtgfeyxiexzf = sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m4778Ujhhgtgfeyxiexzf(Class cls) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return "[" + m4778Ujhhgtgfeyxiexzf(cls.getComponentType());
            }
            return "L" + cls.getName().replace('.', '/') + ";";
        }
        if (Integer.TYPE.equals(cls)) {
            return "I";
        }
        if (Void.TYPE.equals(cls)) {
            return "V";
        }
        if (Boolean.TYPE.equals(cls)) {
            return "Z";
        }
        if (Character.TYPE.equals(cls)) {
            return "C";
        }
        if (Byte.TYPE.equals(cls)) {
            return "B";
        }
        if (Short.TYPE.equals(cls)) {
            return "S";
        }
        if (Float.TYPE.equals(cls)) {
            return "F";
        }
        if (Long.TYPE.equals(cls)) {
            return "J";
        }
        if (Double.TYPE.equals(cls)) {
            return "D";
        }
        throw new IllegalStateException("Type: " + cls.getName() + " is not a primitive type");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3271feyxiexzfUjhhgtg.class != obj.getClass()) {
            return false;
        }
        return toString().equals(obj.toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return this.f10282Ujhhgtgfeyxiexzf + "->" + this.f10283Ujhhgtgfeyxiexzf + this.f10284Ujhhgtgfeyxiexzf;
    }
}
