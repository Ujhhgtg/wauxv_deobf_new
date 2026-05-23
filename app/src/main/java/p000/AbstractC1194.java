package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1194 {
    public static /* synthetic */ boolean m2773(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ String m2774(int i) {
        if (i == 1) {
            return "debug";
        }
        if (i == 2) {
            return "info";
        }
        if (i == 3) {
            return "warn";
        }
        if (i == 4) {
            return "error";
        }
        if (i == 5) {
            return "off";
        }
        throw null;
    }

    public static int m2775(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static C2332 m2776(C2334 c2334, int i) {
        c2334.m4291(i);
        return new C2332();
    }

    public static ClassCastException m2777(Iterator it) {
        
        return new ClassCastException();
    }

    public static Object m2778(MethodResolver c1973) {
        c1973.m2887();
        return AbstractC0744.firstInList(c1973.resolve());
    }

    public static String m2779(int i, String str) {
        return str + i;
    }

    public static String m2780(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String m2781(int i, StringBuilder sb) {
        sb.append(Integer.toString(i));
        return sb.toString();
    }

    public static String m2782(Class cls, String str) {
        return str + cls;
    }

    public static String m2783(Object obj, StringBuilder sb) {
        sb.append(obj.getClass());
        return sb.toString();
    }

    public static String m2784(Object obj, StringBuilder sb, String str) {
        sb.append(obj.getClass());
        sb.append(str);
        return sb.toString();
    }

    public static String m2785(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m2786(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder m2787(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m2788(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void m2789(C0408 c0408, C0408 c0409, C0408 c04010, C0408 c04011, C0408 c04012) {
        AbstractC2295.m4160(c0408);
        AbstractC2295.m4160(c0409);
        AbstractC2295.m4160(c04010);
        AbstractC2295.m4160(c04011);
        AbstractC2295.m4160(c04012);
    }

    public static void m2790(C2360 c2360, String str, boolean z, int i) {
        c2360.m4338(str, z);
        c2360.m4339(new C0380(i, 7));
    }

    public static /* synthetic */ void m2791(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void m2792(StringBuilder sb, String str, Exception exc, int i) {
        sb.append(str);
        C3678.m5306(sb.toString(), exc, i);
    }

    public static /* synthetic */ String m2793(int i) {
        switch (i) {
            case 1:
                return "GET";
            case 2:
                return "HEAD";
            case 3:
                return "OPTIONS";
            case 4:
                return "TRACE";
            case 5:
                return "POST";
            case 6:
                return "DELETE";
            case 7:
                return "PUT";
            case 8:
                return "PATCH";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String m2794(int i) {
        if (i == 1) {
            return "ZYGOTE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "RESOURCES";
        }
        return "PACKAGE";
    }
}
