package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.alibaba.fastjson2.JSONB;
import com.umeng.analytics.pro.ek;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᤞᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2902 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1224 f9273 = new C1224(4);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C1174 f9274 = new C1174("NO_THREAD_ELEMENTS", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C1964 f9275 = new C1964(21);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C1964 f9276 = new C1964(22);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1964 f9277 = new C1964(23);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static C0519 f9278 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static String f9279 = "";

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m4883(StringBuilder sb, Object obj, InterfaceC1433 interfaceC1433) {
        if (interfaceC1433 != null) {
            sb.append((CharSequence) interfaceC1433.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C2039 m4884(Context context) {
        Resources resources;
        int i = C2039.f6793;
        if (context instanceof C2039) {
            throw new IllegalStateException("ModuleContextThemeWrapper already loaded");
        }
        C2039 c2039 = new C2039(context, R.style.AppTheme);
        boolean z = C3755.f11758;
        if (C3755.m5365() && (resources = c2039.getResources()) != null) {
            m4897(resources);
        }
        return c2039;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static List m4885(Object obj) {
        if ((obj instanceof InterfaceC1761) && !(obj instanceof InterfaceC1762)) {
            m4903(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            AbstractC1469.m3349(e, AbstractC2902.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m4886(int i, Object obj) {
        int arity;
        if (obj != null) {
            if (obj instanceof InterfaceC1444) {
                if (obj instanceof InterfaceC1445) {
                    arity = ((InterfaceC1445) obj).getArity();
                } else if (obj instanceof InterfaceC1422) {
                    arity = 0;
                } else if (obj instanceof InterfaceC1433) {
                    arity = 1;
                } else if (obj instanceof InterfaceC1437) {
                    arity = 2;
                } else if (obj instanceof InterfaceC1438) {
                    arity = 3;
                } else {
                    arity = obj instanceof C2198 ? 4 : -1;
                }
                if (arity == i) {
                    return;
                }
            }
            m4903(obj, "kotlin.jvm.functions.Function" + i);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static boolean m4887(File file) {
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (m4887(file2)) {
                }
            }
            if (file.delete()) {
                return true;
            }
        } else if (file.delete()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static long m4888(File file) {
        long jM4888 = 0;
        if (file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    jM4888 += m4888(file2);
                }
            }
        }
        return jM4888;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static Set m4889() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static LayoutInflater m4890(Context context) {
        return LayoutInflater.from(context).cloneInContext(new C2038(context));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final int m4891(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static void m4892(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m4898(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m4898(b3) && !m4898(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & JSONB.Constants.BC_INT32_BYTE_MAX) << 12) | ((b3 & JSONB.Constants.BC_INT32_BYTE_MAX) << 6) | (b4 & JSONB.Constants.BC_INT32_BYTE_MAX);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static void m4893(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m4898(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m4898(b3)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i] = (char) (((b & ek.m) << 12) | ((b2 & JSONB.Constants.BC_INT32_BYTE_MAX) << 6) | (b3 & JSONB.Constants.BC_INT32_BYTE_MAX));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static void m4894(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (m4898(b2)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & JSONB.Constants.BC_INT32_BYTE_MAX));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final int m4895(C0279 c0279, Object obj, int i) {
        int i2 = c0279.f1546;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM3323 = AbstractC1469.m3323(i2, i, c0279.f1544);
            if (iM3323 < 0 || AbstractC1469.m3322(obj, c0279.f1545[iM3323])) {
                return iM3323;
            }
            int i3 = iM3323 + 1;
            while (i3 < i2 && c0279.f1544[i3] == i) {
                if (AbstractC1469.m3322(obj, c0279.f1545[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM3323 - 1; i4 >= 0 && c0279.f1544[i4] == i; i4--) {
                if (AbstractC1469.m3322(obj, c0279.f1545[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final void m4896(Context context) {
        Resources resources = context.getResources();
        if (resources != null) {
            m4897(resources);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final void m4897(Resources resources) {
        Object c2641;
        C0261.f1489.getClass();
        boolean z = C3755.f11758;
        if (!C3755.m5365()) {
            C3741.m5318("You can only inject module resources in Xposed Environment");
            return;
        }
        try {
            c2641 = null;
            if (C0261.m1484().equals(C3755.f11765)) {
                C3741.m5317(6, "You cannot inject module resources into yourself", null);
                return;
            }
            int i = AbstractC1768.f5906;
            C1681 c1681M4713 = AbstractC2727.m4713(resources.getAssets());
            C2933 c2933 = C0160.f1227;
            ((C1958) c1681M4713.f5660).f6471 = AbstractC2234.m4168();
            c1681M4713.m3561(true);
            C2004 c2004M3560 = c1681M4713.m3560();
            c2004M3560.f6475 = "addAssetPath";
            c2004M3560.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(String.class)}, 1));
            C2013 c2013 = (C2013) AbstractC0739.m2291(c2004M3560.m3993());
            if (c2013 != null) {
                c2641 = c2013.m4025(C3755.f11766);
            }
            Throwable thM4616 = C2642.m4616(c2641);
            if (thM4616 != null) {
                ArrayList arrayList = C3741.f11709;
                C3741.m5317(4, "Failed to inject module resources into [" + resources + "]", thM4616);
            }
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static boolean m4898(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final void m4899(InterfaceC0876 interfaceC0876, Object obj) {
        if (obj == f9274) {
            return;
        }
        if (!(obj instanceof C2981)) {
            AbstractC1095.m2807(interfaceC0876.mo1084(null, f9276));
            throw null;
        }
        C2981 c2981 = (C2981) obj;
        InterfaceC2978[] interfaceC2978Arr = c2981.f9546;
        int length = interfaceC2978Arr.length - 1;
        if (length < 0) {
            return;
        }
        InterfaceC2978 interfaceC2978 = interfaceC2978Arr[length];
        Object obj2 = c2981.f9545[length];
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static String m4900(int i) {
        char[] cArr = new char[5];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[4 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static String m4901(int i) {
        char[] cArr = new char[9];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[8 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static C0253 m4902(int i, InterfaceC1263 interfaceC1263) {
        return new C0253(new C2433(i), interfaceC1263, f9273);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static void m4903(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC1469.m3349(classCastException, AbstractC2902.class.getName());
        throw classCastException;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static String m4904(String str) {
        if (AbstractC2901.m4869("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM4872 = AbstractC2901.m4872(str);
        int length = str.length();
        listM4872.size();
        int iM2310 = AbstractC0740.m2310(listM4872);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM4872) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iM2310) || !AbstractC2901.m4869(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!AbstractC2727.m4704(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && str2.startsWith("|", i3)) {
                    strSubstring = str2.substring("|".length() + i3);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC0739.m2293(arrayList, sb, "\n", "", "", null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static String m4905(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static String m4906(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static String m4907(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static String m4908(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static int m4909(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final Object m4910(InterfaceC0876 interfaceC0876, Object obj) {
        if (obj == null) {
            obj = interfaceC0876.mo1084(0, f9275);
        }
        if (obj == 0) {
            return f9274;
        }
        if (obj instanceof Integer) {
            return interfaceC0876.mo1084(new C2981(interfaceC0876, ((Number) obj).intValue()), f9277);
        }
        AbstractC1095.m2807(obj);
        throw null;
    }
}
