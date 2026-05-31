package p000;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᲇᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1031 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final LinkedHashMap f3778;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final LinkedHashMap f3779;

    static {
        C2348[] c2348Arr = {new C2348("boolean", "Z"), new C2348("byte", "B"), new C2348("char", "C"), new C2348("short", "S"), new C2348("int", "I"), new C2348("float", "F"), new C2348("long", "J"), new C2348("double", "D"), new C2348("void", "V")};
        int iM3872 = AbstractC1924.m3872(9);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM3872);
        AbstractC1924.m3874(linkedHashMap, c2348Arr);
        f3778 = linkedHashMap;
        C2348[] c2348Arr2 = {new C2348("Z", "boolean"), new C2348("B", "byte"), new C2348("C", "char"), new C2348("S", "short"), new C2348("I", "int"), new C2348("F", "float"), new C2348("J", "long"), new C2348("D", "double"), new C2348("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM3872);
        AbstractC1924.m3874(linkedHashMap2, c2348Arr2);
        f3779 = linkedHashMap2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final String m2724(Method method) {
        return "(" + AbstractC0280.m1533(method.getParameterTypes(), "", null, null, new C0943(15), 30) + ")" + m2727(method.getReturnType());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String m2725(Class cls) {
        if (cls.isArray()) {
            return AbstractC2844.m4782(m2725(cls.getComponentType()), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
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
        throw new IllegalStateException(AbstractC1095.m2797(cls, "Unknown primitive type: "));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final String m2726(String str) {
        if (str.charAt(0) == '[') {
            return AbstractC2844.m4782(m2726(str.substring(1)), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        if (str.length() == 1) {
            String str2 = (String) f3779.get(str);
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final String m2727(Class cls) {
        if (!cls.isPrimitive()) {
            return cls.isArray() ? AbstractC2844.m4790("[", m2727(cls.getComponentType())) : AbstractC1095.m2800("L", cls.getName().replace('.', '/'), ";");
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
        throw new IllegalStateException(AbstractC1095.m2797(cls, "Unknown primitive type: "));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final String m2728(String str) {
        if (str.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return AbstractC2844.m4790("[", m2728(str.substring(0, str.length() - 2)));
        }
        String str2 = (String) f3778.get(str);
        return str2 == null ? AbstractC1095.m2800("L", str.replace('.', '/'), ";") : str2;
    }
}
