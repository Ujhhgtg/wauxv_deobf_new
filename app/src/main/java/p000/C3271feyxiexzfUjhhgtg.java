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
        sb.append(MagicFactory.get(4928807926614721930L, strArr));
        for (Class<?> cls : method.getParameterTypes()) {
            sb.append(m4778Ujhhgtgfeyxiexzf(cls));
        }
        sb.append(MagicFactory.get(4928807918024787338L, strArr));
        sb.append(m4778Ujhhgtgfeyxiexzf(method.getReturnType()));
        this.f10284Ujhhgtgfeyxiexzf = sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m4778Ujhhgtgfeyxiexzf(Class cls) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return MagicFactory.get(4928808218672498058L, strArr) + m4778Ujhhgtgfeyxiexzf(cls.getComponentType());
            }
            return MagicFactory.get(4928808210082563466L, strArr) + cls.getName().replace('.', '/') + MagicFactory.get(4928808201492628874L, strArr);
        }
        if (Integer.TYPE.equals(cls)) {
            return MagicFactory.get(4928808021104002442L, strArr);
        }
        if (Void.TYPE.equals(cls)) {
            return MagicFactory.get(4928808012514067850L, strArr);
        }
        if (Boolean.TYPE.equals(cls)) {
            return MagicFactory.get(4928808003924133258L, strArr);
        }
        if (Character.TYPE.equals(cls)) {
            return MagicFactory.get(4928807995334198666L, strArr);
        }
        if (Byte.TYPE.equals(cls)) {
            return MagicFactory.get(4928807986744264074L, strArr);
        }
        if (Short.TYPE.equals(cls)) {
            return MagicFactory.get(4928808115593282954L, strArr);
        }
        if (Float.TYPE.equals(cls)) {
            return MagicFactory.get(4928808107003348362L, strArr);
        }
        if (Long.TYPE.equals(cls)) {
            return MagicFactory.get(4928808098413413770L, strArr);
        }
        if (Double.TYPE.equals(cls)) {
            return MagicFactory.get(4928808089823479178L, strArr);
        }
        throw new IllegalStateException(MagicFactory.get(4928808081233544586L, strArr) + cls.getName() + MagicFactory.get(4928808188607726986L, strArr));
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
        return this.f10282Ujhhgtgfeyxiexzf + MagicFactory.get(4928808192902694282L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf) + this.f10283Ujhhgtgfeyxiexzf + this.f10284Ujhhgtgfeyxiexzf;
    }
}
