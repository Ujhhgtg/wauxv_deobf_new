package p000;

import bsh.C0015;
import com.umeng.analytics.pro.g;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᤞᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1095 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2788(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static /* synthetic */ String m2789(int i) {
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
            return g.U;
        }
        if (i == 5) {
            return "off";
        }
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static /* synthetic */ byte m2790(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C2372 m2791(C0015 c0015, int i) {
        c0015.m515(i);
        return new C2372();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static ClassCastException m2792(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static Object m2793(C2004 c2004) {
        c2004.m3006();
        return AbstractC0739.m2290(c2004.m3993());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static String m2794(int i, String str) {
        return str + i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static String m2795(int i, String str, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static String m2796(int i, StringBuilder sb) {
        sb.append(Integer.toString(i));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static String m2797(Class cls, String str) {
        return str + cls;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static String m2798(Object obj, StringBuilder sb) {
        sb.append(obj.getClass());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static String m2799(Object obj, StringBuilder sb, String str) {
        sb.append(obj.getClass());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static String m2800(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static String m2801(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static StringBuilder m2802(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static StringBuilder m2803(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static void m2804(C0383 c0383, C0383 c0384, C0383 c0385, C0383 c0386, C0383 c0387) {
        AbstractC2328.m4289(c0383);
        AbstractC2328.m4289(c0384);
        AbstractC2328.m4289(c0385);
        AbstractC2328.m4289(c0386);
        AbstractC2328.m4289(c0387);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static void m2805(C1094 c1094, C1094 c1095, C1094 c1096, C1094 c1097, C1094 c1098) {
        AbstractC1096.m2811(c1094);
        AbstractC1096.m2811(c1095);
        AbstractC1096.m2811(c1096);
        AbstractC1096.m2811(c1097);
        AbstractC1096.m2811(c1098);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static void m2806(C2405 c2405, String str, boolean z, int i) {
        c2405.m4350(str, z);
        c2405.m4351(new C0355(i, 7));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static /* synthetic */ void m2807(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static void m2808(StringBuilder sb, String str, Exception exc, int i) {
        sb.append(str);
        C3741.m5315(sb.toString(), exc, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static /* synthetic */ String m2809(int i) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static /* synthetic */ String m2810(int i) {
        if (i == 1) {
            return "ZYGOTE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "RESOURCES";
        }
        return "PACKAGE";
    }
}
