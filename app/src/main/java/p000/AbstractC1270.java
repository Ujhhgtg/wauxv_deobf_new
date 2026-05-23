package p000;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᛸᲈᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1270 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static volatile ExecutorService f4633 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static String f4644 = "YukiHookAPI";

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static boolean f4646 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final int[] f4634 = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f4635 = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f4636 = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final int[] f4637 = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final int[] f4638 = {R.attr.drawable};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final int[] f4639 = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final int[] f4640 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final int[] f4641 = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final int[] f4642 = {3, 6};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final int[] f4643 = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final Integer[] f4645 = {1000, Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), 1002, 1003};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m2973(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static int m2974(C2504 c2504, AbstractC1138 abstractC1138, View view, View view2, AbstractC2491 abstractC2491, boolean z) {
        if (abstractC2491.m4467() == 0 || c2504.m4505() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC2491.m4460(view) - AbstractC2491.m4460(view2)) + 1;
        }
        return Math.min(abstractC1138.mo2747(), abstractC1138.mo2737(view2) - abstractC1138.mo2740(view));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static int m2975(C2504 c2504, AbstractC1138 abstractC1138, View view, View view2, AbstractC2491 abstractC2491, boolean z, boolean z2) {
        if (abstractC2491.m4467() == 0 || c2504.m4505() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c2504.m4505() - Math.max(AbstractC2491.m4460(view), AbstractC2491.m4460(view2))) - 1) : Math.max(0, Math.min(AbstractC2491.m4460(view), AbstractC2491.m4460(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC1138.mo2737(view2) - abstractC1138.mo2740(view)) / (Math.abs(AbstractC2491.m4460(view) - AbstractC2491.m4460(view2)) + 1))) + (abstractC1138.mo2746() - abstractC1138.mo2740(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static int m2976(C2504 c2504, AbstractC1138 abstractC1138, View view, View view2, AbstractC2491 abstractC2491, boolean z) {
        if (abstractC2491.m4467() == 0 || c2504.m4505() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c2504.m4505();
        }
        return (int) (((abstractC1138.mo2737(view2) - abstractC1138.mo2740(view)) / (Math.abs(AbstractC2491.m4460(view) - AbstractC2491.m4460(view2)) + 1)) * c2504.m4505());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static boolean m2977(File file) {
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (m2977(file2)) {
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
    public static int m2978(int i, String str) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                i++;
            } else {
                if (cCharAt == '\'') {
                    return i;
                }
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static C3639 m2979(C0793 c0793, int i, ArrayList arrayList, C3639 c3639) {
        int i2;
        int i3 = i == 0 ? c0793.f3132 : c0793.f3133;
        if (i3 != -1 && (c3639 == null || i3 != c3639.f11382)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C3639 c36310 = (C3639) arrayList.get(i4);
                if (c36310.f11382 == i3) {
                    if (c3639 != null) {
                        c3639.m5226(i, c36310);
                        arrayList.remove(c3639);
                    }
                    c3639 = c36310;
                    break;
                }
            }
        } else if (i3 != -1) {
            return c3639;
        }
        if (c3639 == null) {
            if (c0793 instanceof AbstractC1532) {
                AbstractC1532 abstractC1532 = (AbstractC1532) c0793;
                int i5 = 0;
                while (true) {
                    if (i5 >= abstractC1532.f5368) {
                        i2 = -1;
                        break;
                    }
                    C0793 c0794 = abstractC1532.f5367[i5];
                    if ((i == 0 && (i2 = c0794.f3132) != -1) || (i == 1 && (i2 = c0794.f3133) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        C3639 c36311 = (C3639) arrayList.get(i6);
                        if (c36311.f11382 == i2) {
                            c3639 = c36311;
                            break;
                        }
                    }
                }
            }
            if (c3639 == null) {
                c3639 = new C3639();
                c3639.f11381 = new ArrayList();
                c3639.f11384 = null;
                c3639.f11385 = -1;
                int i7 = C3639.f11380;
                C3639.f11380 = i7 + 1;
                c3639.f11382 = i7;
                c3639.f11383 = i;
            }
            arrayList.add(c3639);
        }
        int i8 = c3639.f11382;
        ArrayList arrayList2 = c3639.f11381;
        if (arrayList2.contains(c0793)) {
            return c3639;
        }
        arrayList2.add(c0793);
        if (c0793 instanceof C1506) {
            C1506 c1506 = (C1506) c0793;
            c1506.f5320.m2272(c1506.f5321 == 0 ? 1 : 0, c3639, arrayList);
        }
        if (i == 0) {
            c0793.f3132 = i8;
            c0793.f3101.m2272(i, c3639, arrayList);
            c0793.f3103.m2272(i, c3639, arrayList);
        } else {
            c0793.f3133 = i8;
            c0793.f3102.m2272(i, c3639, arrayList);
            c0793.f3105.m2272(i, c3639, arrayList);
            c0793.f3104.m2272(i, c3639, arrayList);
        }
        c0793.f3108.m2272(i, c3639, arrayList);
        return c3639;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final void m2980(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static long m2981(File file) {
        long jM2981 = 0;
        if (file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    jM2981 += m2981(file2);
                }
            }
        }
        return jM2981;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static Executor m2982() {
        if (f4633 == null) {
            synchronized (AbstractC1270.class) {
                try {
                    if (f4633 == null) {
                        f4633 = Executors.newCachedThreadPool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4633;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static String m2983(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        String strM2973 = m2973(messageDigest.digest());
                        fileInputStream.close();
                        return strM2973;
                    }
                    messageDigest.update(bArr, 0, i);
                    System.err.println("[BeanShell] GetMd5ByFilePath: " + e);
                    return null;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            System.err.println("[BeanShell] GetMd5ByFilePath: " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static boolean m2984(InterfaceC3450 interfaceC3450, InterfaceC3450 interfaceC3451) {
        C3448 type = interfaceC3450.getType();
        C3448 type2 = interfaceC3451.getType();
        if (type.equals(type2)) {
            return true;
        }
        int i = type.f10905;
        int i2 = type2.f10905;
        if (i == 10) {
            type = C3448.f10882;
            i = 9;
        }
        if (i2 == 10) {
            type2 = C3448.f10882;
            i2 = 9;
        }
        if (i != 9 || i2 != 9) {
            return type.m4973() && type2.m4973();
        }
        C3448 c3448 = C3448.f10875;
        if (type == c3448) {
            return false;
        }
        if (type2 == c3448 || type == C3448.f10882) {
            return true;
        }
        if (!type.m4970()) {
            return !type2.m4970() || type == C3448.f10883 || type == C3448.f10878;
        }
        if (!type2.m4970()) {
            return false;
        }
        do {
            type = type.m4968();
            type2 = type2.m4968();
            if (!type.m4970()) {
                break;
            }
        } while (type2.m4970());
        return m2984(type, type2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static boolean m2985(int i, String str) {
        int i2 = i + 2;
        return i2 < str.length() && str.charAt(i) == '\"' && str.charAt(i + 1) == '\"' && str.charAt(i2) == '\"';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static C2287 m2986(C2287 c2287, C2287 c2288) {
        InterfaceC3450[] interfaceC3450Arr = c2287.f7379;
        if (c2287 != c2288) {
            int length = interfaceC3450Arr.length;
            if (c2288.f7379.length != length) {
                throw new C2704("mismatched maxLocals values", null);
            }
            C2287 c2289 = null;
            for (int i = 0; i < length; i++) {
                InterfaceC3450 interfaceC3450 = interfaceC3450Arr[i];
                InterfaceC3450 interfaceC3450M2988 = m2988(interfaceC3450, c2288.f7379[i]);
                if (interfaceC3450M2988 != interfaceC3450) {
                    if (c2289 == null) {
                        c2289 = new C2287(interfaceC3450Arr.length);
                        System.arraycopy(interfaceC3450Arr, 0, c2289.f7379, 0, interfaceC3450Arr.length);
                    }
                    if (interfaceC3450M2988 == null) {
                        c2289.m3925();
                        c2289.f7379[i] = null;
                    } else {
                        c2289.mo3594(i, interfaceC3450M2988);
                    }
                }
            }
            if (c2289 != null) {
                c2289.f6944 = false;
                return c2289;
            }
        }
        return c2287;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static C1242 m2987(C1242 c1242, C1242 c1243) {
        if (c1242 == c1243) {
            return c1242;
        }
        int i = c1242.f4507;
        if (c1243.f4507 != i) {
            throw new C2704("mismatched stack depths", null);
        }
        C1242 c1242M2897 = null;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC3450 interfaceC3450M2898 = c1242.m2898(i2);
            InterfaceC3450 interfaceC3450M2899 = c1243.m2898(i2);
            InterfaceC3450 interfaceC3450M2988 = m2988(interfaceC3450M2898, interfaceC3450M2899);
            if (interfaceC3450M2988 != interfaceC3450M2898) {
                if (c1242M2897 == null) {
                    c1242M2897 = c1242.m2897();
                }
                if (interfaceC3450M2988 == null) {
                    throw new C2704("incompatible: " + interfaceC3450M2898 + ", " + interfaceC3450M2899, null);
                }
                try {
                    c1242M2897.m2896(i2, interfaceC3450M2988);
                } catch (C2704 e) {
                    e.m2885("...while merging stack[" + AbstractC1460.m3223(i2) + "]");
                    throw e;
                }
                e.m2885("...while merging stack[" + AbstractC1460.m3223(i2) + "]");
                throw e;
            }
        }
        if (c1242M2897 == null) {
            return c1242;
        }
        c1242M2897.f6944 = false;
        return c1242M2897;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static InterfaceC3450 m2988(InterfaceC3450 interfaceC3450, InterfaceC3450 interfaceC3451) {
        if (interfaceC3450 == null || interfaceC3450.equals(interfaceC3451)) {
            return interfaceC3450;
        }
        if (interfaceC3451 == null) {
            return null;
        }
        C3448 type = interfaceC3450.getType();
        C3448 type2 = interfaceC3451.getType();
        if (type == type2) {
            return type;
        }
        if (!type.m4974() || !type2.m4974()) {
            if (type.m4973() && type2.m4973()) {
                return C3448.f10871;
            }
            return null;
        }
        C3448 c3448 = C3448.f10875;
        if (type == c3448) {
            return type2;
        }
        if (type2 == c3448) {
            return type;
        }
        if (!type.m4970() || !type2.m4970()) {
            return C3448.f10882;
        }
        InterfaceC3450 interfaceC3450M2988 = m2988(type.m4968(), type2.m4968());
        return interfaceC3450M2988 == null ? C3448.f10882 : ((C3448) interfaceC3450M2988).m4965();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final C1654 m2989(String str, String str2, int i, InterfaceC1425 interfaceC1425) {
        char cCharAt = str.charAt(i);
        if (((Boolean) interfaceC1425.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return m2990(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final C1654 m2990(String str, String str2) {
        StringBuilder sbM2788 = AbstractC1194.m2788(str2, " when parsing an Instant from \"");
        sbM2788.append(m2999(64, str));
        sbM2788.append('\"');
        return new C1654(sbM2788.toString(), str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final int m2991(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static String m2992(String str, boolean z) {
        if (!z) {
            return AbstractC1194.m2785("\"", str, "\"");
        }
        StringBuilder sb = new StringBuilder("\"");
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                sb2.append("\\f");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb2.append("\\b");
                        break;
                    case '\t':
                        sb2.append("\\t");
                        break;
                    case '\n':
                        sb2.append("\\n");
                        break;
                    default:
                        sb2.append(cCharAt);
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        sb.append(sb2.toString());
        sb.append("\"");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static String m2993(String str, boolean z) {
        int i;
        char c = '$';
        if (str.indexOf(36) < 0) {
            return m2992(str, z);
        }
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (i2 < length) {
            if (str.charAt(i2) == c) {
                char c2 = '\\';
                if (!z) {
                    int i4 = 0;
                    for (int i5 = i2 - 1; i5 >= 0 && str.charAt(i5) == '\\'; i5--) {
                        i4++;
                    }
                    if ((i4 & 1) == 1) {
                    }
                }
                int i6 = i2 + 1;
                if (i6 < length) {
                    char cCharAt = str.charAt(i6);
                    if (cCharAt == '{') {
                        int i7 = i2 + 2;
                        int length2 = str.length();
                        int i8 = 1;
                        int i9 = i7;
                        while (true) {
                            if (i9 < length2) {
                                char cCharAt2 = str.charAt(i9);
                                if (cCharAt2 == '\"') {
                                    while (true) {
                                        i9++;
                                        if (i9 >= str.length()) {
                                            i9 = -1;
                                            break;
                                        }
                                        char cCharAt3 = str.charAt(i9);
                                        if (cCharAt3 != c2) {
                                            if (cCharAt3 == '\"') {
                                                break;
                                            }
                                        } else {
                                            i9++;
                                        }
                                    }
                                    if (i9 >= 0) {
                                        i9++;
                                    }
                                } else if (cCharAt2 == '\'') {
                                    int iM2978 = m2978(i9 + 1, str);
                                    if (iM2978 >= 0) {
                                        i9 = iM2978 + 1;
                                    }
                                } else {
                                    if (cCharAt2 == '/' && (i = i9 + 1) < length2) {
                                        char cCharAt4 = str.charAt(i);
                                        if (cCharAt4 == '/') {
                                            i9 += 2;
                                            while (i9 < length2) {
                                                char cCharAt5 = str.charAt(i9);
                                                if (cCharAt5 == '\n' || cCharAt5 == '\r') {
                                                    break;
                                                }
                                                i9++;
                                            }
                                        } else {
                                            char c3 = '*';
                                            if (cCharAt4 == '*') {
                                                int i10 = i9 + 2;
                                                while (true) {
                                                    int i11 = i10 + 1;
                                                    if (i11 >= str.length()) {
                                                        i10 = -1;
                                                        break;
                                                    }
                                                    if (str.charAt(i10) == c3 && str.charAt(i11) == '/') {
                                                        break;
                                                    }
                                                    i10 = i11;
                                                    c3 = '*';
                                                }
                                                if (i10 >= 0) {
                                                    i9 = i10 + 2;
                                                }
                                            }
                                        }
                                        c2 = '\\';
                                    }
                                    if (cCharAt2 == '{') {
                                        i8++;
                                    } else if (cCharAt2 == '}' && (i8 = i8 - 1) == 0) {
                                        break;
                                    }
                                    i9++;
                                    c2 = '\\';
                                }
                            }
                            i9 = -1;
                            break;
                        }
                        if (i9 < 0) {
                            i2 = i6;
                        } else {
                            String strSubstring = str.substring(i3, i2);
                            if (!strSubstring.isEmpty()) {
                                arrayList.add(m2992(strSubstring, z));
                            }
                            arrayList.add("String.valueOf(" + str.substring(i7, i9).trim() + ")");
                            i3 = i9 + 1;
                            i2 = i3;
                            z2 = true;
                        }
                        c = '$';
                    } else if (cCharAt != c && Character.isJavaIdentifierStart(cCharAt)) {
                        int i12 = i2 + 2;
                        while (i12 < length) {
                            char cCharAt6 = str.charAt(i12);
                            if (cCharAt6 == c || !Character.isJavaIdentifierPart(cCharAt6)) {
                                break;
                            }
                            i12++;
                        }
                        String strSubstring2 = str.substring(i3, i2);
                        if (!strSubstring2.isEmpty()) {
                            arrayList.add(m2992(strSubstring2, z));
                        }
                        arrayList.add("String.valueOf(" + str.substring(i6, i12) + ")");
                        i2 = i12;
                        i3 = i2;
                        z2 = true;
                    }
                }
                i2 = i6;
            }
            i2++;
        }
        if (!z2) {
            return m2992(str, z);
        }
        String strSubstring3 = str.substring(i3);
        if (!strSubstring3.isEmpty()) {
            arrayList.add(m2992(strSubstring3, z));
        }
        if (arrayList.isEmpty()) {
            return "\"\"";
        }
        StringBuilder sb = new StringBuilder();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (i13 > 0) {
                sb.append(" + ");
            }
            sb.append((String) arrayList.get(i13));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static void m2994(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static void m2995(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3582.m5200(viewGroup, z);
        } else if (f4646) {
            try {
                AbstractC3582.m5200(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f4646 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static final void m2996(int[] iArr, int[] iArr2, InterfaceC2654 interfaceC2654) {
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr2[i] & (~iArr[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(interfaceC2654.mo3474((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new C1985(interfaceC2654.mo1342(), arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final void m2997(int i, int i2, InterfaceC2654 interfaceC2654) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(interfaceC2654.mo3474(i4));
            }
            i3 >>>= 1;
        }
        throw new C1985(interfaceC2654.mo1342(), arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final Class m2998(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m2998(((ParameterizedType) type).getRawType());
        }
        throw new C3451("Cannot cast type " + type + " to java.lang.Class object.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static final String m2999(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static boolean m3000(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
