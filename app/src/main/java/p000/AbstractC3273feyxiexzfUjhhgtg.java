package p000;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱ能不能ᛴᛲᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3273feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final LinkedHashMap f10294Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final LinkedHashMap f10295Ujhhgtgfeyxiexzf;

    static {
        C1381feyxiexzfUjhhgtg[] c1381feyxiexzfUjhhgtgArr = {new C1381feyxiexzfUjhhgtg("boolean", "Z"), new C1381feyxiexzfUjhhgtg("byte", "B"), new C1381feyxiexzfUjhhgtg("char", "C"), new C1381feyxiexzfUjhhgtg("short", "S"), new C1381feyxiexzfUjhhgtg("int", "I"), new C1381feyxiexzfUjhhgtg("float", "F"), new C1381feyxiexzfUjhhgtg("long", "J"), new C1381feyxiexzfUjhhgtg("double", "D"), new C1381feyxiexzfUjhhgtg("void", "V")};
        int iM1280Ujhhgtgfeyxiexzf = AbstractC0202Ujhhgtgfeyxiexzf.m1280Ujhhgtgfeyxiexzf(9);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM1280Ujhhgtgfeyxiexzf);
        AbstractC0202Ujhhgtgfeyxiexzf.m1282Ujhhgtgfeyxiexzf(linkedHashMap, c1381feyxiexzfUjhhgtgArr);
        f10294Ujhhgtgfeyxiexzf = linkedHashMap;
        C1381feyxiexzfUjhhgtg[] c1381feyxiexzfUjhhgtgArr2 = {new C1381feyxiexzfUjhhgtg("Z", "boolean"), new C1381feyxiexzfUjhhgtg("B", "byte"), new C1381feyxiexzfUjhhgtg("C", "char"), new C1381feyxiexzfUjhhgtg("S", "short"), new C1381feyxiexzfUjhhgtg("I", "int"), new C1381feyxiexzfUjhhgtg("F", "float"), new C1381feyxiexzfUjhhgtg("J", "long"), new C1381feyxiexzfUjhhgtg("D", "double"), new C1381feyxiexzfUjhhgtg("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM1280Ujhhgtgfeyxiexzf);
        AbstractC0202Ujhhgtgfeyxiexzf.m1282Ujhhgtgfeyxiexzf(linkedHashMap2, c1381feyxiexzfUjhhgtgArr2);
        f10295Ujhhgtgfeyxiexzf = linkedHashMap2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final String m4779Ujhhgtgfeyxiexzf(Method method) {
        return "(" + AbstractC2391Ujhhgtgfeyxiexzf.m3651feyxiexzfUjhhgtg(method.getParameterTypes(), "", null, null, new C3083Ujhhgtgfeyxiexzf(13), 30) + ")" + m4782Ujhhgtgfeyxiexzf(method.getReturnType());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final String m4780Ujhhgtgfeyxiexzf(Class cls) {
        if (cls.isArray()) {
            return AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(m4780Ujhhgtgfeyxiexzf(cls.getComponentType()), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        if (!cls.isPrimitive()) {
            return cls.getName();
        }
        if (cls.equals(Boolean.TYPE)) {
            return "boolean";
        }
        if (cls.equals(Byte.TYPE)) {
            return "byte";
        }
        if (cls.equals(Character.TYPE)) {
            return "char";
        }
        if (cls.equals(Short.TYPE)) {
            return "short";
        }
        if (cls.equals(Integer.TYPE)) {
            return "int";
        }
        if (cls.equals(Float.TYPE)) {
            return "float";
        }
        if (cls.equals(Long.TYPE)) {
            return "long";
        }
        if (cls.equals(Double.TYPE)) {
            return "double";
        }
        if (cls.equals(Void.TYPE)) {
            return "void";
        }
        throw new IllegalStateException(AbstractC3317feyxiexzfUjhhgtg.m4798Ujhhgtgfeyxiexzf(cls, "Unknown primitive type: "));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final String m4781Ujhhgtgfeyxiexzf(String str) {
        if (str.charAt(0) == '[') {
            return AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(m4781Ujhhgtgfeyxiexzf(str.substring(1)), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        if (str.length() == 1) {
            String str2 = (String) f10295Ujhhgtgfeyxiexzf.get(str);
            if (str2 != null) {
                return str2;
            }
            throw new IllegalArgumentException("Unknown primitive typeSign: ".concat(str));
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            return str.substring(1, str.length() - 1).replace('/', '.');
        }
        throw new IllegalStateException("Unknown class sign: ".concat(str));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final String m4782Ujhhgtgfeyxiexzf(Class cls) {
        if (!cls.isPrimitive()) {
            return cls.isArray() ? AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("[", m4782Ujhhgtgfeyxiexzf(cls.getComponentType())) : AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("L", cls.getName().replace('.', '/'), ";");
        }
        if (cls.equals(Boolean.TYPE)) {
            return "Z";
        }
        if (cls.equals(Byte.TYPE)) {
            return "B";
        }
        if (cls.equals(Character.TYPE)) {
            return "C";
        }
        if (cls.equals(Short.TYPE)) {
            return "S";
        }
        if (cls.equals(Integer.TYPE)) {
            return "I";
        }
        if (cls.equals(Float.TYPE)) {
            return "F";
        }
        if (cls.equals(Long.TYPE)) {
            return "J";
        }
        if (cls.equals(Double.TYPE)) {
            return "D";
        }
        if (cls.equals(Void.TYPE)) {
            return "V";
        }
        throw new IllegalStateException(AbstractC3317feyxiexzfUjhhgtg.m4798Ujhhgtgfeyxiexzf(cls, "Unknown primitive type: "));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final String m4783Ujhhgtgfeyxiexzf(String str) {
        if (str.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("[", m4783Ujhhgtgfeyxiexzf(str.substring(0, str.length() - 2)));
        }
        String str2 = (String) f10294Ujhhgtgfeyxiexzf.get(str);
        return str2 == null ? AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("L", str.replace('.', '/'), ";") : str2;
    }
}
