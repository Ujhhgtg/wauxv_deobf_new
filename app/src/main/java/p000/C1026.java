package p000;

import java.io.Serializable;
import java.lang.reflect.Method;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1026 implements Serializable {

    public final String f3759;

    public final String f3760;

    public final String f3761;

    public C1026(Method method) {
        this.f3759 = m2599(method.getDeclaringClass());
        this.f3760 = method.getName();
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("(");
        for (Class<?> cls : method.getParameterTypes()) {
            sb.append(m2599(cls));
        }
        sb.append(")");
        sb.append(m2599(method.getReturnType()));
        this.f3761 = sb.toString();
    }

    public static String m2599(Class cls) {
        String[] strArr = AbstractC1574.f5469;
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return "[" + m2599(cls.getComponentType());
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
        if (obj == null || C1026.class != obj.getClass()) {
            return false;
        }
        return toString().equals(obj.toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return this.f3759 + "->" + this.f3760 + this.f3761;
    }
}
