package p000;

import android.content.SharedPreferences;
import android.util.Log;
import bsh.AbstractC0009;
import bsh.AbstractC0010;
import bsh.Primitive;
import com.umeng.analytics.pro.bv;
import dalvik.system.InMemoryDexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲇᲁᛸᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2202 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C0407 f7164 = new C0407();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC2654[] f7165 = new InterfaceC2654[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2439 m3991(C2439 c2439, long j) {
        return new C2439(j == 19500 ? c2439.m4406() : c2439.m4405());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m3992(Throwable th, Throwable th2) {
        if (th != th2) {
            Integer num = AbstractC1684.f5739;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC2352.f7546;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m3993(C0094 c0094, C0580 c0580, C0580 c0581, C1023 c1023, String str, byte[] bArr) {
        C1043 c1043 = new C1043(str, bArr);
        c1043.f3806 = C1133.f4213;
        try {
            C0701 c0701M5011 = AbstractC3453.m5011(c0094, c1043, c0580, c0581, c1023);
            C0548 c0548 = c1023.f3746;
            TreeMap treeMap = c0548.f2261;
            try {
                C3448 c3448 = c0701M5011.f2663.f3401;
                c0548.m4638();
                if (treeMap.get(c3448) == null) {
                    treeMap.put(c3448, c0701M5011);
                } else {
                    throw new IllegalArgumentException("already added: " + c3448);
                }
            } catch (NullPointerException unused) {
                throw new NullPointerException("clazz == null");
            }
        } catch (RuntimeException e) {
            throw C1238.m2884("...while processing " + c1043.f3795, e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static int m3994(C0094 c0094, C0580 c0580, C0580 c0581, C1023 c1023, FileInputStream fileInputStream) throws IOException {
        C0094 c0095;
        C0580 c0582;
        C0580 c0583;
        C1023 c1024;
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        int i = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return i;
                }
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    if (!name.endsWith(".class") || name.startsWith("META-INF/")) {
                        c0095 = c0094;
                        c0582 = c0580;
                        c0583 = c0581;
                        c1024 = c1023;
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i2 = zipInputStream.read(bArr);
                            if (i2 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i2);
                        }
                        c0095 = c0094;
                        c0582 = c0580;
                        c0583 = c0581;
                        c1024 = c1023;
                        m3993(c0095, c0582, c0583, c1024, name, byteArrayOutputStream.toByteArray());
                        i++;
                    }
                    c0094 = c0095;
                    c0580 = c0582;
                    c0581 = c0583;
                    c1023 = c1024;
                }
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final Set m3995(InterfaceC2654 interfaceC2654) {
        if (interfaceC2654 instanceof InterfaceC0546) {
            return ((InterfaceC0546) interfaceC2654).mo1920();
        }
        HashSet hashSet = new HashSet(interfaceC2654.mo3473());
        int iMo3473 = interfaceC2654.mo3473();
        for (int i = 0; i < iMo3473; i++) {
            hashSet.add(interfaceC2654.mo3474(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static boolean m3996(C0793 c0793) {
        int[] iArr = c0793.f3134;
        int i = iArr[0];
        int i2 = iArr[1];
        C0793 c0794 = c0793.f3112;
        C0794 c0795 = c0794 != null ? (C0794) c0794 : null;
        if (c0795 != null) {
            int i3 = c0795.f3134[0];
        }
        if (c0795 != null) {
            int i4 = c0795.f3134[1];
        }
        boolean z = i == 1 || i == 2 || (i == 3 && c0793.f3084 == 0 && c0793.f3115 == 0.0f && c0793.m2319(0)) || c0793.mo1487();
        boolean z2 = i2 == 1 || i2 == 2 || (i2 == 3 && c0793.f3085 == 0 && c0793.f3115 == 0.0f && c0793.m2319(1)) || c0793.mo1488();
        return (c0793.f3115 > 0.0f && (z || z2)) || (z && z2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final void m3997(InterfaceC0875 interfaceC0875) {
        if (interfaceC0875 == null) {
            return;
        }
        Iterator it = AbstractC2140.f7083.iterator();
        while (it.hasNext()) {
            Call call = (Call) ((WeakReference) it.next()).get();
            if (call == null) {
                it.remove();
            } else {
                C2210 c2210 = (C2210) call.request().tag(C2210.class);
                Object obj = c2210 != null ? c2210.f7186 : null;
                if (interfaceC0875.equals(obj != null ? obj : null)) {
                    call.cancel();
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static String m3998(Class cls) {
        if (AbstractC0009.m401(cls)) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0009.m382(cls).toString().substring(11));
            sb.append(cls.isInterface() ? " interface" : " class");
            sb.append(" ");
            sb.append(cls.getSimpleName());
            sb.append(cls.isInterface() ? "" : " extends ".concat(m4007(cls.getSuperclass())));
            sb.append(m4006(cls));
            sb.append(" {");
            return sb.toString().trim();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Modifier.toString(cls.getModifiers()));
        sb2.append(cls.isInterface() ? "" : " class");
        sb2.append(" ");
        sb2.append(cls.getSimpleName());
        sb2.append(cls.isInterface() ? "" : " extends ".concat(m4007(cls.getSuperclass())));
        sb2.append(m4006(cls));
        sb2.append(" {");
        return sb2.toString().trim();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final InterfaceC2654[] m3999(List list) {
        InterfaceC2654[] interfaceC2654Arr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC2654Arr = (InterfaceC2654[]) list.toArray(new InterfaceC2654[0])) == null) ? f7165 : interfaceC2654Arr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static InMemoryDexClassLoader m4000(String str, byte[] bArr, ClassLoader classLoader) throws IOException {
        C0580 c0580 = new C0580(1);
        C0580 c0581 = new C0580(0);
        C0094 c0094 = new C0094(18);
        String strM4748 = AbstractC2784.m4748(str.replace('.', '/'), ".class");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C1023 c1023 = new C1023(c0580);
            m3993(c0094, c0581, c0580, c1023, strM4748, bArr);
            c1023.m2596(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return new InMemoryDexClassLoader(ByteBuffer.wrap(byteArray), classLoader);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static InMemoryDexClassLoader m4001(ClassLoader classLoader, String str) throws IOException {
        C0580 c0580 = new C0580(1);
        C0580 c0581 = new C0580(0);
        C0094 c0094 = new C0094(18);
        C1023 c1023 = new C1023(c0580);
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            int iM3994 = m3994(c0094, c0581, c0580, c1023, fileInputStream);
            fileInputStream.close();
            if (iM3994 == 0) {
                throw new IOException(AbstractC2784.m4757("No class file found in jar ", str));
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c1023.m2596(byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return new InMemoryDexClassLoader(ByteBuffer.wrap(byteArray), classLoader);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final void m4002(Throwable th) {
        String str;
        String string;
        if (AbstractC2140.f7081) {
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                string = stringWriter.toString();
            } else {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                StackTraceElement stackTraceElement = 1 < stackTrace.length ? stackTrace[1] : null;
                if (stackTraceElement != null) {
                    str = " (" + stackTraceElement.getFileName() + ':' + stackTraceElement.getLineNumber() + ')';
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                string = th + str;
            }
            Log.d(AbstractC2140.f7082, string);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static void m4003(SharedPreferencesC1269 sharedPreferencesC1269, String str) {
        Log.e("FastKV", sharedPreferencesC1269.f4609 + " " + str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final InterfaceC1736 m4004(InterfaceC2654 interfaceC2654) {
        if (interfaceC2654 instanceof C2655) {
            return m4004(((C2655) interfaceC2654).f8557);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static String m4005() {
        Integer numValueOf;
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("mm");
        String str = "system_config_prefs";
        String str2 = "default_uin";
        C1565.f5440.getClass();
        SharedPreferences sharedPreferences = C1565.m3276().getSharedPreferences(str, 0);
        C0707 c0707M4527 = AbstractC2519.m4527(Integer.class);
        String string = null;
        if (c0707M4527.equals(AbstractC2519.m4527(String.class))) {
            Object string2 = sharedPreferences.getString(str2, null);
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            numValueOf = (Integer) string2;
        } else if (c0707M4527.equals(AbstractC2519.m4527(Integer.TYPE))) {
            numValueOf = Integer.valueOf(sharedPreferences.getInt(str2, 0));
        } else if (c0707M4527.equals(AbstractC2519.m4527(Boolean.TYPE))) {
            numValueOf = (Integer) Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
        } else if (c0707M4527.equals(AbstractC2519.m4527(Float.TYPE))) {
            numValueOf = (Integer) Float.valueOf(sharedPreferences.getFloat(str2, 0.0f));
        } else {
            if (!c0707M4527.equals(AbstractC2519.m4527(Long.TYPE))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            numValueOf = (Integer) Long.valueOf(sharedPreferences.getLong(str2, 0L));
        }
        sb.append(numValueOf.intValue());
        byte[] bytes = sb.toString().getBytes(AbstractC0599.f2413);
        "getBytes(...)";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.getDefault());
                "toUpperCase(...)";
                if (upperCase.length() < 2) {
                    stringBuffer.append(0);
                }
                stringBuffer.append(upperCase);
            }
            string = stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        "toLowerCase(...)";
        StringBuilder sb2 = new StringBuilder();
        C1565.f5440.getClass();
        sb2.append(C1565.m3276().getDataDir().getAbsolutePath());
        sb2.append("/MicroMsg/");
        sb2.append(lowerCase);
        sb2.append('/');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static String m4006(Class cls) {
        StringBuilder sb = new StringBuilder();
        if (cls.getInterfaces().length > 0) {
            sb.append(cls.isInterface() ? " extends " : " implements ");
            sb.append(String.join(", ", (List) Stream.of((Object[]) cls.getInterfaces()).map(new C2257(28)).collect(Collectors.toList())));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static String m4007(Class cls) {
        return cls == null ? "Object" : cls.getSimpleName();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static void m4008(C0784 c0784, C0793 c0793, boolean z) {
        HashSet<C0779> hashSet;
        C0779 c0779;
        C0779 c07710;
        float f;
        C0779 c07711;
        C0779 c07712;
        C0779 c07713;
        if (!(c0793 instanceof C0794) && c0793.m2324() && m3996(c0793)) {
            C0794.m2337(c0793, c0784, new C0407());
        }
        C0779 c0779Mo2311 = c0793.mo2311(2);
        C0779 c0779Mo2312 = c0793.mo2311(4);
        int iM2273 = c0779Mo2311.m2273();
        int iM2274 = c0779Mo2312.m2273();
        HashSet<C0779> hashSet2 = c0779Mo2311.f2876;
        if (hashSet2 != null && c0779Mo2311.f2878) {
            for (C0779 c07714 : hashSet2) {
                C0793 c0794 = c07714.f2879;
                boolean zM3996 = m3996(c0794);
                C0779 c07715 = c0794.f3101;
                C0779 c07716 = c0794.f3103;
                if (c0794.m2324() && zM3996) {
                    f = 0.0f;
                    C0794.m2337(c0794, c0784, new C0407());
                } else {
                    f = 0.0f;
                }
                int i = c0794.f3134[0];
                if (i != 3 || zM3996) {
                    if (!c0794.m2324()) {
                        if (c07714 == c07715 && c07716.f2881 == null) {
                            int iM2275 = c07715.m2274() + iM2273;
                            c0794.m2329(iM2275, c0794.m2316() + iM2275);
                            m4008(c0784, c0794, z);
                        } else if (c07714 == c07716 && c07715.f2881 == null) {
                            int iM2276 = iM2273 - c07716.m2274();
                            c0794.m2329(iM2276 - c0794.m2316(), iM2276);
                            m4008(c0784, c0794, z);
                        } else if (c07714 == c07715 && (c07711 = c07716.f2881) != null && c07711.f2878 && !c0794.m2322()) {
                            m4013(c0784, c0794, z);
                        }
                    }
                } else if (i == 3 && c0794.f3088 >= 0 && c0794.f3087 >= 0 && (c0794.f3125 == 8 || (c0794.f3084 == 0 && c0794.f3115 == f))) {
                    if (!c0794.m2322() && !c0794.f3098 && ((c07714 == c07715 && (c07713 = c07716.f2881) != null && c07713.f2878) || (c07714 == c07716 && (c07712 = c07715.f2881) != null && c07712.f2878))) {
                        if (!c0794.m2322()) {
                            m4014(c0793, c0784, c0794, z);
                        }
                    }
                }
            }
        }
        if ((c0793 instanceof C1506) || (hashSet = c0779Mo2312.f2876) == null || !c0779Mo2312.f2878) {
            return;
        }
        for (C0779 c07717 : hashSet) {
            C0793 c0795 = c07717.f2879;
            boolean zM3997 = m3996(c0795);
            C0779 c07718 = c0795.f3101;
            C0779 c07719 = c0795.f3103;
            if (c0795.m2324() && zM3997) {
                C0794.m2337(c0795, c0784, new C0407());
            }
            boolean z2 = (c07717 == c07718 && (c07710 = c07719.f2881) != null && c07710.f2878) || (c07717 == c07719 && (c0779 = c07718.f2881) != null && c0779.f2878);
            int i2 = c0795.f3134[0];
            if (i2 != 3 || zM3997) {
                if (!c0795.m2324()) {
                    if (c07717 == c07718 && c07719.f2881 == null) {
                        int iM2277 = c07718.m2274() + iM2274;
                        c0795.m2329(iM2277, c0795.m2316() + iM2277);
                        m4008(c0784, c0795, z);
                    } else if (c07717 == c07719 && c07718.f2881 == null) {
                        int iM2278 = iM2274 - c07719.m2274();
                        c0795.m2329(iM2278 - c0795.m2316(), iM2278);
                        m4008(c0784, c0795, z);
                    } else if (z2 && !c0795.m2322()) {
                        m4013(c0784, c0795, z);
                    }
                }
            } else if (i2 == 3 && c0795.f3088 >= 0 && c0795.f3087 >= 0 && (c0795.f3125 == 8 || (c0795.f3084 == 0 && c0795.f3115 == 0.0f))) {
                if (!c0795.m2322() && !c0795.f3098 && z2 && !c0795.m2322()) {
                    m4014(c0793, c0784, c0795, z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static void m4009(SharedPreferencesC1269 sharedPreferencesC1269, String str) {
        Log.i("FastKV", sharedPreferencesC1269.f4609 + " " + str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static String m4010(C0501 c0501) {
        String strSubstring = c0501.m1747().toString().substring(11);
        StringBuilder sbM2788 = AbstractC1194.m2788(strSubstring, " ");
        sbM2788.append(m4007(c0501.mo1752()));
        sbM2788.append(" ");
        sbM2788.append(m4012(c0501.m1748(), (String[]) Stream.of((Object[]) c0501.mo1751()).map(new C2257(28)).map(new C2255(5, Stream.of((Object[]) c0501.m1750()).iterator())).toArray(new C0484(12))));
        sbM2788.append(strSubstring.contains("abstract") ? ";" : " {}");
        return sbM2788.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static String m4011(String str, Class[] clsArr) {
        return m4012(str, (String[]) Stream.of((Object[]) clsArr).map(new C2257(28)).toArray(new C0484(13)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static String m4012(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(strArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static void m4013(C0784 c0784, C0793 c0793, boolean z) {
        float f = c0793.f3122;
        C0779 c0779 = c0793.f3101;
        int iM2273 = c0779.f2881.m2273();
        C0779 c07710 = c0793.f3103;
        int iM2274 = c07710.f2881.m2273();
        int iM2275 = c0779.m2274() + iM2273;
        int iM2276 = iM2274 - c07710.m2274();
        if (iM2273 == iM2274) {
            f = 0.5f;
        } else {
            iM2273 = iM2275;
            iM2274 = iM2276;
        }
        int iM2316 = c0793.m2316();
        int i = (iM2274 - iM2273) - iM2316;
        if (iM2273 > iM2274) {
            i = (iM2273 - iM2274) - iM2316;
        }
        int i2 = ((int) ((f * i) + 0.5f)) + iM2273;
        int i3 = i2 + iM2316;
        if (iM2273 > iM2274) {
            i3 = i2 - iM2316;
        }
        c0793.m2329(i2, i3);
        m4008(c0784, c0793, z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static void m4014(C0793 c0793, C0784 c0784, C0793 c0794, boolean z) {
        float f = c0794.f3122;
        C0779 c0779 = c0794.f3101;
        int iM2274 = c0779.m2274() + c0779.f2881.m2273();
        C0779 c07710 = c0794.f3103;
        int iM2273 = c07710.f2881.m2273() - c07710.m2274();
        if (iM2273 >= iM2274) {
            int iM2316 = c0794.m2316();
            if (c0794.f3125 != 8) {
                int i = c0794.f3084;
                if (i == 2) {
                    iM2316 = (int) (c0794.f3122 * 0.5f * (c0793 instanceof C0794 ? c0793.m2316() : c0793.f3112.m2316()));
                } else if (i == 0) {
                    iM2316 = iM2273 - iM2274;
                }
                iM2316 = Math.max(c0794.f3087, iM2316);
                int i2 = c0794.f3088;
                if (i2 > 0) {
                    iM2316 = Math.min(i2, iM2316);
                }
            }
            int i3 = iM2274 + ((int) ((f * ((iM2273 - iM2274) - iM2316)) + 0.5f));
            c0794.m2329(i3, iM2316 + i3);
            m4008(c0784, c0794, z);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static void m4015(C0784 c0784, C0793 c0793) {
        float f = c0793.f3123;
        C0779 c0779 = c0793.f3102;
        int iM2273 = c0779.f2881.m2273();
        C0779 c07710 = c0793.f3104;
        int iM2274 = c07710.f2881.m2273();
        int iM2275 = c0779.m2274() + iM2273;
        int iM2276 = iM2274 - c07710.m2274();
        if (iM2273 == iM2274) {
            f = 0.5f;
        } else {
            iM2273 = iM2275;
            iM2274 = iM2276;
        }
        int iM2313 = c0793.m2313();
        int i = (iM2274 - iM2273) - iM2313;
        if (iM2273 > iM2274) {
            i = (iM2273 - iM2274) - iM2313;
        }
        int i2 = (int) ((f * i) + 0.5f);
        int i3 = iM2273 + i2;
        int i4 = i3 + iM2313;
        if (iM2273 > iM2274) {
            i3 = iM2273 - i2;
            i4 = i3 - iM2313;
        }
        c0793.m2330(i3, i4);
        m4022(c0784, c0793);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static void m4016(C0793 c0793, C0784 c0784, C0793 c0794) {
        float f = c0794.f3123;
        C0779 c0779 = c0794.f3102;
        int iM2274 = c0779.m2274() + c0779.f2881.m2273();
        C0779 c07710 = c0794.f3104;
        int iM2273 = c07710.f2881.m2273() - c07710.m2274();
        if (iM2273 >= iM2274) {
            int iM2313 = c0794.m2313();
            if (c0794.f3125 != 8) {
                int i = c0794.f3085;
                if (i == 2) {
                    iM2313 = (int) (f * 0.5f * (c0793 instanceof C0794 ? c0793.m2313() : c0793.f3112.m2313()));
                } else if (i == 0) {
                    iM2313 = iM2273 - iM2274;
                }
                iM2313 = Math.max(c0794.f3090, iM2313);
                int i2 = c0794.f3091;
                if (i2 > 0) {
                    iM2313 = Math.min(i2, iM2313);
                }
            }
            int i3 = iM2274 + ((int) ((f * ((iM2273 - iM2274) - iM2313)) + 0.5f));
            c0794.m2330(i3, iM2313 + i3);
            m4022(c0784, c0794);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static final Object m4017(C2636 c2636, C2636 c2637, InterfaceC1429 interfaceC1429) throws Throwable {
        Object c0760;
        Object objM3466;
        Object objM3460;
        C1172 c1172 = AbstractC1458.f5186;
        try {
            AbstractC3453.m4986(2, interfaceC1429);
            c0760 = interfaceC1429.mo1196(c2637, c2636);
        } catch (C1071 e) {
            Throwable th = e.f3885;
            C0760 c0761 = new C0760(th, false);
            do {
                objM3466 = c2636.m3466(C1705.f5796.get(c2636), c0761);
                if (objM3466 == AbstractC1458.f5185 || objM3466 == c1172) {
                }
                throw th;
            } while (objM3466 == AbstractC1458.f5187);
            c2636.mo2635(objM3466);
            throw th;
        } catch (Throwable th2) {
            c0760 = new C0760(th2, false);
        }
        EnumC0884 enumC0884 = EnumC0884.f3325;
        if (c0760 == enumC0884 || (objM3460 = c2636.m3460(c0760)) == c1172) {
            return enumC0884;
        }
        c2636.mo4634();
        if (objM3460 instanceof C0760) {
            throw ((C0760) objM3460).f2861;
        }
        return AbstractC1458.m3171(objM3460);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008 A[PHI: r0
      0x0008: PHI (r0v9 java.lang.Class) = (r0v0 java.lang.Class), (r0v2 java.lang.Class), (r0v3 java.lang.Class), (r0v4 java.lang.Class), (r0v1 java.lang.Class) binds: [B:3:0x0006, B:11:0x0022, B:14:0x002b, B:17:0x0034, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static String m4018(Class cls) {
        Class cls2 = Map.class;
        if (cls2.isAssignableFrom(cls)) {
            cls = cls2;
        } else {
            cls2 = List.class;
            if (!cls2.isAssignableFrom(cls)) {
                cls2 = Deque.class;
                if (cls2.isAssignableFrom(cls)) {
                    cls = cls2;
                } else {
                    cls2 = Set.class;
                    if (cls2.isAssignableFrom(cls)) {
                        cls = cls2;
                    } else {
                        cls2 = Map.Entry.class;
                        if (cls2.isAssignableFrom(cls)) {
                            cls = cls2;
                        }
                    }
                }
            } else if (Queue.class.isAssignableFrom(cls)) {
                cls = Queue.class;
            } else {
                cls = cls2;
            }
        }
        if (!cls.isArray()) {
            return cls.getName().startsWith("java") ? cls.getSimpleName() : cls.getName();
        }
        return m4018(cls.getComponentType()) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static String m4019(Object obj) {
        if (obj == null || Primitive.NULL == obj) {
            return "null";
        }
        return obj instanceof Primitive ? ((Primitive) obj).getType().getSimpleName() : m4018(AbstractC0010.m419(obj, false));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static String m4020(Object obj) {
        StringBuilder sb = new StringBuilder("" + obj);
        if (obj != null && obj.getClass().isArray()) {
            StringBuilder sb2 = new StringBuilder("{");
            for (int i = 0; i < Array.getLength(obj); i++) {
                sb2.append(m4020(Array.get(obj, i)));
                sb2.append(", ");
            }
            if (sb2.reverse().charAt(0) == ' ') {
                sb2.delete(0, 2);
            }
            StringBuilder sbReverse = sb2.reverse();
            sbReverse.append("}");
            return sbReverse.toString();
        }
        if (obj instanceof Collection) {
            StringBuilder sb3 = new StringBuilder("[");
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                sb3.append(m4020(it.next()));
                sb3.append(", ");
            }
            if (sb3.reverse().charAt(0) == ' ') {
                sb3.delete(0, 2);
            }
            StringBuilder sbReverse2 = sb3.reverse();
            sbReverse2.append("]");
            return sbReverse2.toString();
        }
        if (obj instanceof Map) {
            StringBuilder sb4 = new StringBuilder("{");
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                sb4.append(m4020(entry.getKey()));
                sb4.append("=");
                sb4.append(m4020(entry.getValue()));
                sb4.append(", ");
            }
            if (sb4.reverse().charAt(0) == ' ') {
                sb4.delete(0, 2);
            }
            StringBuilder sbReverse3 = sb4.reverse();
            sbReverse3.append("}");
            return sbReverse3.toString();
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry2 = (Map.Entry) obj;
            return m4020(entry2.getKey()) + "=" + m4020(entry2.getValue());
        }
        if (obj instanceof String) {
            StringBuilder sbInsert = sb.insert(0, "\"");
            sbInsert.append("\"");
            return sbInsert.toString();
        }
        if (Primitive.unwrap(obj) instanceof Character) {
            StringBuilder sbInsert2 = sb.insert(0, "'");
            sbInsert2.append("'");
            return sbInsert2.toString();
        }
        if (Primitive.unwrap(obj) instanceof Number) {
            if (Primitive.unwrap(obj) instanceof Byte) {
                sb.append("o");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Short) {
                sb.append(bv.aB);
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Integer) {
                sb.append("I");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Long) {
                sb.append("L");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof BigInteger) {
                sb.append("W");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Float) {
                sb.append("f");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Double) {
                sb.append("d");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof BigDecimal) {
                sb.append("w");
                return sb.toString();
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static String m4021(C3532 c3532) {
        StringBuilder sb = new StringBuilder();
        sb.append(c3532.m5123().toString().substring(11));
        sb.append(" ");
        sb.append(m4007(c3532.f11061));
        sb.append(" ");
        return AbstractC2784.m4752(sb, c3532.f11060, ";");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static void m4022(C0784 c0784, C0793 c0793) {
        C0779 c0779;
        C0779 c07710;
        C0779 c07711;
        C0779 c07712;
        C0779 c07713;
        if (!(c0793 instanceof C0794) && c0793.m2324() && m3996(c0793)) {
            C0794.m2337(c0793, c0784, new C0407());
        }
        C0779 c0779Mo2311 = c0793.mo2311(3);
        C0779 c0779Mo2312 = c0793.mo2311(5);
        int iM2273 = c0779Mo2311.m2273();
        int iM2274 = c0779Mo2312.m2273();
        HashSet<C0779> hashSet = c0779Mo2311.f2876;
        if (hashSet != null && c0779Mo2311.f2878) {
            for (C0779 c07714 : hashSet) {
                C0793 c0794 = c07714.f2879;
                boolean zM3996 = m3996(c0794);
                C0779 c07715 = c0794.f3102;
                C0779 c07716 = c0794.f3104;
                if (c0794.m2324() && zM3996) {
                    C0794.m2337(c0794, c0784, new C0407());
                }
                int i = c0794.f3134[1];
                if (i != 3 || zM3996) {
                    if (!c0794.m2324()) {
                        if (c07714 == c07715 && c07716.f2881 == null) {
                            int iM2275 = c07715.m2274() + iM2273;
                            c0794.m2330(iM2275, c0794.m2313() + iM2275);
                            m4022(c0784, c0794);
                        } else if (c07714 == c07716 && c07716.f2881 == null) {
                            int iM2276 = iM2273 - c07716.m2274();
                            c0794.m2330(iM2276 - c0794.m2313(), iM2276);
                            m4022(c0784, c0794);
                        } else if (c07714 == c07715 && (c07711 = c07716.f2881) != null && c07711.f2878) {
                            m4015(c0784, c0794);
                        }
                    }
                } else if (i == 3 && c0794.f3091 >= 0 && c0794.f3090 >= 0 && (c0794.f3125 == 8 || (c0794.f3085 == 0 && c0794.f3115 == 0.0f))) {
                    if (!c0794.m2323() && !c0794.f3098 && ((c07714 == c07715 && (c07713 = c07716.f2881) != null && c07713.f2878) || (c07714 == c07716 && (c07712 = c07715.f2881) != null && c07712.f2878))) {
                        if (!c0794.m2323()) {
                            m4016(c0793, c0784, c0794);
                        }
                    }
                }
            }
        }
        if (c0793 instanceof C1506) {
            return;
        }
        HashSet<C0779> hashSet2 = c0779Mo2312.f2876;
        if (hashSet2 != null && c0779Mo2312.f2878) {
            for (C0779 c07717 : hashSet2) {
                C0793 c0795 = c07717.f2879;
                boolean zM3997 = m3996(c0795);
                C0779 c07718 = c0795.f3102;
                C0779 c07719 = c0795.f3104;
                if (c0795.m2324() && zM3997) {
                    C0794.m2337(c0795, c0784, new C0407());
                }
                boolean z = (c07717 == c07718 && (c07710 = c07719.f2881) != null && c07710.f2878) || (c07717 == c07719 && (c0779 = c07718.f2881) != null && c0779.f2878);
                int i2 = c0795.f3134[1];
                if (i2 != 3 || zM3997) {
                    if (!c0795.m2324()) {
                        if (c07717 == c07718 && c07719.f2881 == null) {
                            int iM2277 = c07718.m2274() + iM2274;
                            c0795.m2330(iM2277, c0795.m2313() + iM2277);
                            m4022(c0784, c0795);
                        } else if (c07717 == c07719 && c07718.f2881 == null) {
                            int iM2278 = iM2274 - c07719.m2274();
                            c0795.m2330(iM2278 - c0795.m2313(), iM2278);
                            m4022(c0784, c0795);
                        } else if (z && !c0795.m2323()) {
                            m4015(c0784, c0795);
                        }
                    }
                } else if (i2 == 3 && c0795.f3091 >= 0 && c0795.f3090 >= 0 && (c0795.f3125 == 8 || (c0795.f3085 == 0 && c0795.f3115 == 0.0f))) {
                    if (!c0795.m2323() && !c0795.f3098 && z && !c0795.m2323()) {
                        m4016(c0793, c0784, c0795);
                    }
                }
            }
        }
        C0779 c0779Mo2313 = c0793.mo2311(6);
        if (c0779Mo2313.f2876 == null || !c0779Mo2313.f2878) {
            return;
        }
        int iM2279 = c0779Mo2313.m2273();
        for (C0779 c07720 : c0779Mo2313.f2876) {
            C0793 c0796 = c07720.f2879;
            boolean zM3998 = m3996(c0796);
            C0779 c07721 = c0796.f3105;
            if (c0796.m2324() && zM3998) {
                C0794.m2337(c0796, c0784, new C0407());
            }
            if (c0796.f3134[1] != 3 || zM3998) {
                if (!c0796.m2324() && c07720 == c07721) {
                    if (c0796.f3097) {
                        int i3 = iM2279 - c0796.f3119;
                        int i4 = c0796.f3114 + i3;
                        c0796.f3118 = i3;
                        c0796.f3102.m2281(i3);
                        c0796.f3104.m2281(i4);
                        c07721.m2281(iM2279);
                        c0796.f3081 = true;
                    }
                    m4022(c0784, c0796);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public abstract void mo2434();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public abstract void mo2435();
}
