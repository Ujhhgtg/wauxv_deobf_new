package p000;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᲈᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1028 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final LinkedHashMap f3771;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final LinkedHashMap f3772;

    static {
        C2315[] c2315Arr = {new C2315("boolean", "Z"), new C2315("byte", "B"), new C2315("char", "C"), new C2315("short", "S"), new C2315("int", "I"), new C2315("float", "F"), new C2315("long", "J"), new C2315("double", "D"), new C2315("void", "V")};
        int iM3693 = AbstractC1898.m3693(9);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM3693);
        AbstractC1898.m3695(linkedHashMap, c2315Arr);
        f3771 = linkedHashMap;
        C2315[] c2315Arr2 = {new C2315("Z", "boolean"), new C2315("B", "byte"), new C2315("C", "char"), new C2315("S", "short"), new C2315("I", "int"), new C2315("F", "float"), new C2315("J", "long"), new C2315("D", "double"), new C2315("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM3693);
        AbstractC1898.m3695(linkedHashMap2, c2315Arr2);
        f3772 = linkedHashMap2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final String m2600(Method method) {
        return "(" + AbstractC0270.m1387(method.getParameterTypes(), "", null, null, new C0853(28), 30) + ")" + m2603(method.getReturnType());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String m2601(Class cls) {
        if (cls.isArray()) {
            return AbstractC2784.m4748(m2601(cls.getComponentType()), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
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
        throw new IllegalStateException(AbstractC1194.m2782(cls, "Unknown primitive type: "));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final String m2602(String str) {
        if (str.charAt(0) == '[') {
            return AbstractC2784.m4748(m2602(str.substring(1)), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        if (str.length() == 1) {
            String str2 = (String) f3772.get(str);
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
    public static final String m2603(Class cls) {
        if (!cls.isPrimitive()) {
            return cls.isArray() ? AbstractC2784.m4757("[", m2603(cls.getComponentType())) : AbstractC1194.m2785("L", cls.getName().replace('.', '/'), ";");
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
        throw new IllegalStateException(AbstractC1194.m2782(cls, "Unknown primitive type: "));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final String m2604(String str) {
        if (str.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return AbstractC2784.m4757("[", m2604(str.substring(0, str.length() - 2)));
        }
        String str2 = (String) f3771.get(str);
        return str2 == null ? AbstractC1194.m2785("L", str.replace('.', '/'), ";") : str2;
    }
}
