package p000;

import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2784 {

    public static final /* synthetic */ int[] f8884 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};

    public static /* synthetic */ String m4734(int i) {
        if (i == 1) {
            return "runtime";
        }
        if (i == 2) {
            return "build";
        }
        if (i == 3) {
            return "system";
        }
        if (i == 4) {
            return "embedded";
        }
        throw null;
    }

    public static /* synthetic */ byte m4735(int i) {
        switch (i) {
            case 1:
                return (byte) 1;
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 4;
            case 5:
                return (byte) 5;
            case 6:
                return (byte) 6;
            case 7:
                return (byte) 7;
            case 8:
                return (byte) 8;
            case 9:
                return (byte) 9;
            case 10:
                return (byte) 10;
            case 11:
                return (byte) 11;
            case 12 /* 12 */:
                return (byte) 12;
            case 13:
                return 13;
            case 14 /* 14 */:
                return 14;
            case 15:
                return 15;
            default:
                throw null;
        }
    }

    public static int m4736(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    public static long m4737(long j, long j2, long j3, long j4) {
        return j4 - ((j / j2) + j3);
    }

    public static C1299 m4738(C1563 c1563) {
        return AbstractC0968.startMethodResolution_(c1563.m3268()).m3490();
    }

    public static C1981 m4739(C1333 c1333) {
        
        return new C1981(4);
    }

    public static Class m4740(C1981 c1981, Class cls, Class cls2) {
        c1981.m3824(cls);
        return AbstractC0743.m2183(AbstractC2519.classToKClass(cls2));
    }

    public static Object m4741(C1299 c1299) {
        c1299.superclass();
        return AbstractC0744.firstInList(c1299.resolve());
    }

    public static Object m4742(MethodResolver c1973) {
        c1973.superclass();
        return AbstractC0744.firstInList(c1973.resolve());
    }

    public static Object setParamsAndResolveFirstMethod(Object[] objArr, int i, MethodResolver c1973) {
        c1973.paramTypes(Arrays.copyOf(objArr, i));
        return AbstractC0744.firstInList(c1973.resolve());
    }

    public static String m4744(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String m4745(int i, String str, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String m4746(long j, String str) {
        return str + j;
    }

    public static String m4747(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.m223());
        return sb.toString();
    }

    public static String m4748(String str, String str2) {
        return str + str2;
    }

    public static String m4749(String str, String str2, char c) {
        return str + str2 + c;
    }

    public static String m4750(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String m4751(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String m4752(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder m4753(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static void m4754(C1089 c1089, C1089 c10810, C1089 c10811, C1089 c10812, C1089 c10813) {
        AbstractC1090.m2662(c1089);
        AbstractC1090.m2662(c10810);
        AbstractC1090.m2662(c10811);
        AbstractC1090.m2662(c10812);
        AbstractC1090.m2662(c10813);
    }

    public static void m4755(C2007 c2007, C3561 c3561, int i) {
        C2007.m3866(c2007, c3561, i);
        c2007.m3868().m3791();
    }

    public static int m4756(int i, int i2, int i3, int i4) {
        return ((i - i2) * i3) + i4;
    }

    public static String m4757(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String m4758(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int m4759(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String m4760(int i) {
        if (i == 1) {
            return "LOCAL";
        }
        if (i == 2) {
            return "REMOTE";
        }
        if (i == 3) {
            return "DATA_DISK_CACHE";
        }
        if (i != 4) {
            return i != 5 ? "null" : "MEMORY_CACHE";
        }
        return "RESOURCE_DISK_CACHE";
    }

    public static /* synthetic */ String m4761(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }
}
