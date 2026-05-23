package p000;

import android.database.Cursor;
import android.util.Pair;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲀᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1133 implements InterfaceC0876, InterfaceC1997, InterfaceC2578, InterfaceC1954, InterfaceC1771 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ C1133 f4202 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ C1133 f4203 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1133 f4204 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C1133 f4205 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C1133 f4206 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final /* synthetic */ C1133 f4207 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C1133 f4208 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C1133 f4209 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C1133 f4210 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ C1133 f4211 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ C1133 f4212 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C1133 f4213 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C1133 f4214 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final C1133 f4215 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final C1133 f4216 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final C1133 f4217 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final C1133 f4218 = new C1133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1676 m2704(XC_MethodHook.MethodHookParam methodHookParam) {
        return new C1676(new C1559(methodHookParam, 0), new C1559(methodHookParam, 1), new C1559(methodHookParam, 2), new C1560(methodHookParam, 0), new C1560(methodHookParam, 1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static String m2705() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            AbstractC0066 abstractC0066 = AbstractC2474.f7908;
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(AbstractC2474.f7908.m950(62)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m2706(byte[] bArr, BigInteger bigInteger) {
        if (bArr.length == 0 || bArr.length < 131072) {
            return;
        }
        C2472 c2472 = new C2472(bigInteger);
        int i = 0;
        C1661 c1661M4042 = AbstractC2203.m4042(AbstractC2203.m4044(0, 131072), 8);
        int i2 = c1661M4042.f5612;
        int i3 = c1661M4042.f5613;
        int i4 = c1661M4042.f5614;
        if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
            return;
        }
        while (true) {
            int i5 = c2472.f7907;
            BigInteger bigInteger2 = c2472.f7904[i5];
            int i6 = 255;
            if (i5 == 0) {
                c2472.m4427();
                c2472.f7907 = 255;
            } else {
                c2472.f7907 = i5 - 1;
            }
            byte[] bArr2 = new byte[8];
            int i7 = i;
            while (i7 < 8) {
                BigInteger bigIntegerShiftRight = bigInteger2.shiftRight(i7 * 8);
                String[] strArr = AbstractC1574.f5469;
                "shiftRight(...)";
                BigInteger bigIntegerValueOf = BigInteger.valueOf(i6);
                "valueOf(...)";
                bArr2[7 - i7] = bigIntegerShiftRight.and(bigIntegerValueOf).byteValue();
                i7++;
                i4 = i4;
                i6 = 255;
            }
            int i8 = i4;
            for (int i9 = 0; i9 < 8; i9++) {
                int i10 = i2 + i9;
                if (i10 >= 131072) {
                    return;
                }
                bArr[i10] = (byte) (bArr[i10] ^ bArr2[i9]);
            }
            if (i2 == i3) {
                return;
            }
            i2 += i8;
            i4 = i8;
            i = 0;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static void m2707(String str, String str2, BigInteger bigInteger) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
            try {
                byte[] bArr = new byte[33554432];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    } else {
                        m2706(bArr, bigInteger);
                        fileOutputStream.write(bArr, 0, i);
                    }
                    try {
                        throw th;
                    } catch (Throwable th) {
                        AbstractC1458.m3154(fileInputStream, th);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC1458.m3154(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static Object m2708(String str, String str2, byte[] bArr, Object obj) throws IllegalAccessException {
        String[] strArr = AbstractC1574.f5469;
        Object objM2131 = AbstractC0710.m2131(AbstractC2201.m3988("com.tencent.mm.opensdk.modelmsg.WXMediaMessage"), new Object[0]);
        int i = AbstractC1745.f5844;
        C1744 c1744M2484 = AbstractC0968.m2484(objM2131);
        C1299 c1299M3490 = c1744M2484.m3490();
        c1299M3490.f6370 = "title";
        ((C1315) AbstractC0744.m2191(c1299M3490.m3014())).m3025(str);
        C1299 c1299M3491 = c1744M2484.m3490();
        c1299M3491.f6370 = "description";
        ((C1315) AbstractC0744.m2191(c1299M3491.m3014())).m3025(str2);
        C1299 c1299M3492 = c1744M2484.m3490();
        c1299M3492.f6370 = "thumbData";
        ((C1315) AbstractC0744.m2191(c1299M3492.m3014())).m3025(bArr);
        C1299 c1299M3493 = c1744M2484.m3490();
        c1299M3493.f6370 = "mediaObject";
        ((C1315) AbstractC0744.m2191(c1299M3493.m3014())).m3025(obj);
        return objM2131;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static Object m2709(String str, String str2, Object obj, int i) {
        String[] strArr = AbstractC1574.f5469;
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return m2708(str, str2, null, obj);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static long m2710(long j, AbstractC2205 abstractC2205) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (abstractC2205.equals(C0848.f3260)) {
            return m2712(j, jCurrentTimeMillis) | 6917529027641081856L;
        }
        if (abstractC2205.equals(C0848.f3258)) {
            return m2712(j, jCurrentTimeMillis) & (-6917529027641081857L);
        }
        if (abstractC2205.equals(C0848.f3256)) {
            return m2712(j, jCurrentTimeMillis) & 6917529027641081856L;
        }
        if (abstractC2205.equals(C0848.f3259)) {
            return m2712(j, jCurrentTimeMillis) | (-6917529027641081856L);
        }
        if (abstractC2205.equals(C0848.f3257)) {
            return m2712(j, jCurrentTimeMillis) & 6917529027641081855L;
        }
        if (abstractC2205.equals(C0848.f3255)) {
            return m2712(j, jCurrentTimeMillis) & (-6917529027641081856L);
        }
        throw new C0761();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static Object m2711(Member member, Object obj, Object[] objArr) {
        Object c2585;
        boolean zBooleanValue = false;
        int i = AbstractC0743.f2838[0];
        if (AbstractC1555.f5422[AbstractC2784.m4759(i)] == 1) {
            try {
                XposedBridge.getXposedVersion();
                c2585 = Boolean.TRUE;
            } catch (Throwable th) {
                c2585 = new C2585(th);
            }
            if (c2585 instanceof C2585) {
                c2585 = null;
            }
            Boolean bool = (Boolean) c2585;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (!zBooleanValue) {
            i = 2;
        }
        int iM4759 = AbstractC2784.m4759(i);
        if (iM4759 == 0) {
            return XposedBridge.invokeOriginalMethod(member, obj, objArr);
        }
        if (iM4759 != 1) {
            throw new C0761();
        }
        throw new IllegalStateException("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static long m2712(long j, long j2) {
        return (j & (-72057594037927936L)) | (j2 & 72057594037927935L);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static void m2713(String str, List list) throws IllegalAccessException, InvocationTargetException {
        C2171 c2171 = C2171.f7132;
        LinkedList linkedList = new LinkedList();
        C0803.f3165.getClass();
        Object objM2131 = AbstractC0710.m2131(AbstractC1574.m3313(C0802.f3164), new Object[0]);
        int i = AbstractC1745.f5844;
        C1299 c1299M3490 = AbstractC0968.m2484(objM2131).m3490();
        String[] strArr = AbstractC1574.f5469;
        c1299M3490.f6370 = "d";
        ((C1315) AbstractC0744.m2191(c1299M3490.m3014())).m3025(str);
        ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C0811.f3173.getClass();
            Method methodM3315 = AbstractC1574.m3315(C0809.f3171);
            C0806.f3168.getClass();
            Object objInvoke = methodM3315.invoke(C0806.m2359(), str2);
            "null cannot be cast to non-null type kotlin.String";
            arrayList.add((String) objInvoke);
        }
        String strM2196 = !arrayList.isEmpty() ? AbstractC0744.m2196(arrayList, ",", null, " ", null, 58) : "";
        int i2 = AbstractC1745.f5844;
        C1299 c1299M3491 = AbstractC0968.m2484(objM2131).m3490();
        c1299M3491.f6370 = "e";
        ((C1315) AbstractC0744.m2191(c1299M3491.m3014())).m3025(strM2196);
        linkedList.push(objM2131);
        c2171.getClass();
        C2180.m3960(C2180.f7141, AbstractC1574.m3314(C2170.f7131).newInstance(linkedList));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static C1833 m2714(C0516 c0516, C2815 c2815, int i, boolean z) {
        C0917 c0917;
        C0917 c0918;
        int i2 = i * 10;
        if (c0516.f2191 != i2) {
            m2724(i2 + 2);
            throw null;
        }
        C0514 c0514 = new C0514(new C0515(c0516));
        C1833 c1833 = new C1833(i);
        for (int i3 = 0; i3 < i; i3++) {
            try {
                int unsignedShort = c0514.readUnsignedShort();
                int unsignedShort2 = c0514.readUnsignedShort();
                int unsignedShort3 = c0514.readUnsignedShort();
                int unsignedShort4 = c0514.readUnsignedShort();
                int unsignedShort5 = c0514.readUnsignedShort();
                C0917 c0919 = (C0917) c2815.m4793(unsignedShort3);
                C0917 c09110 = (C0917) c2815.m4793(unsignedShort4);
                if (z) {
                    c0918 = null;
                    c0917 = c09110;
                } else {
                    c0917 = null;
                    c0918 = c09110;
                }
                c1833.m3063(i3, new C1832(unsignedShort, unsignedShort2, c0919, c0918, c0917, unsignedShort5));
            } catch (IOException e) {
                throw new RuntimeException("shouldn't happen", e);
            }
        }
        c1833.f6944 = false;
        return c1833;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static Cursor m2715(String str) {
        int i = AbstractC1745.f5844;
        C2800.f8930.getClass();
        C1973 c1973M3492 = AbstractC0968.m2484(C2800.m4779()).m3492();
        c1973M3492.f6370 = "rawQuery";
        return (Cursor) ((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(String.class), AbstractC2519.m4527(Object[].class)}, 2, c1973M3492)).m3832(str, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static C0291 m2716(C1043 c1043, int i, int i2) {
        if (i2 >= 2) {
            return new C0291("RuntimeInvisibleAnnotations", new C0542(c1043, i, i2).m1902(2), i2);
        }
        m2725();
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static C0293 m2717(C1043 c1043, int i, int i2) {
        if (i2 >= 2) {
            return new C0293("RuntimeVisibleAnnotations", new C0542(c1043, i, i2).m1902(1), i2);
        }
        m2725();
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static void m2718(String str, String str2, String str3) throws JSONException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String string;
        String[] strArr = AbstractC1574.f5469;
        if (AbstractC3471.m5079(EnumC3677.f11545) || AbstractC3471.m5080(EnumC3674.f11510)) {
            C1618 c1618 = C1618.f5489;
            C0774.f2874.getClass();
            String strM2264 = C0774.m2264();
            c1618.getClass();
            C1617 c1617 = C1617.f5488;
            Method methodM3315 = AbstractC1574.m3315(c1617);
            Class<?> cls = methodM3315.getParameterTypes()[0];
            int i = AbstractC1745.f5844;
            C0796 c0796M3486 = AbstractC0968.m2483(cls).m3486();
            c0796M3486.f4485 = 5;
            Class<?>[] parameterTypes = ((C0798) AbstractC0744.m2191(c0796M3486.m2344())).f3157.getParameterTypes();
            if (parameterTypes.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            Object objM2131 = AbstractC0710.m2131(parameterTypes[parameterTypes.length - 1], new Object[0]);
            if (str3 != null) {
                C0242.f1400.getClass();
                C0241 c0241 = C0241.f1399;
                Object objM2132 = AbstractC0710.m2131(AbstractC1574.m3315(c0241).getDeclaringClass(), new Object[0]);
                AbstractC1574.m3315(c0241).invoke(objM2132, str3);
                C1299 c1299M3490 = AbstractC0968.m2484(objM2131).m3490();
                c1299M3490.f4725 = AbstractC1574.m3315(c0241).getDeclaringClass();
                ((C1315) AbstractC0744.m2191(c1299M3490.m3014())).m3025(objM2132);
            }
            Object objM2133 = AbstractC0710.m2131(cls, new Object[]{str2, 1, strM2264, str, objM2131});
            C2663.f8577.getClass();
            methodM3315.invoke(C2663.m4656(AbstractC1574.m3315(c1617).getDeclaringClass()), objM2133);
            return;
        }
        C2195 c2195 = C2195.f7156;
        C0774.f2874.getClass();
        String strM2265 = C0774.m2264();
        if (str3 != null) {
            JSONObject jSONObject = new JSONObject();
            String str4 = "msg";
            JSONObject jSONObject2 = new JSONObject();
            String str5 = "appinfo";
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("appid", str3);
            jSONObject2.put(str5, jSONObject3);
            jSONObject.put(str4, jSONObject2);
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            C1732 c1732 = new C1732();
            c1732.f5829 = jSONObject;
            c1732.f5830 = hashSet;
            c1732.f5831 = hashSet2;
            string = c1732.toString();
        } else {
            string = null;
        }
        String str6 = string;
        String str7 = "";
        c2195.getClass();
        C2180.m3960(C2180.f7141, AbstractC1574.m3314(C2194.f7155).newInstance(4, strM2265, str, str2, 1, null, 0, str6, str7, Boolean.TRUE, 0));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static void m2719(String str, String str2, String str3, String str4, String str5, String str6) throws JSONException {
        C2173 c2173 = C2173.f7134;
        JSONObject jSONObject = new JSONObject();
        String[] strArr = AbstractC1574.f5469;
        String str7 = "msg";
        JSONObject jSONObject2 = new JSONObject();
        String str8 = "location";
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("poiname", str2);
        jSONObject3.put("label", str3);
        jSONObject3.put("x", str4);
        jSONObject3.put("y", str5);
        jSONObject3.put("scale", str6);
        jSONObject2.put(str8, jSONObject3);
        jSONObject.put(str7, jSONObject2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet.add("/msg/location/poiname");
        hashSet.add("/msg/location/label");
        hashSet.add("/msg/location/x");
        hashSet.add("/msg/location/y");
        hashSet.add("/msg/location/scale");
        C1732 c1732 = new C1732();
        c1732.f5829 = jSONObject;
        c1732.f5830 = hashSet;
        c1732.f5831 = hashSet2;
        C2180.m3960(C2180.f7141, C2173.m3959(c2173, str, c1732.toString(), EnumC3673.f11475.f11492));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static void m2720(String str, String str2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        C1622.f5495.getClass();
        Constructor constructorM3314 = AbstractC1574.m3314(C1621.f5494);
        C1565.f5440.getClass();
        Object objNewInstance = constructorM3314.newInstance(C1565.m3276(), Collections.singletonList(str2), null, str, 2, null, Boolean.TRUE);
        String[] strArr = AbstractC1574.f5469;
        "null cannot be cast to non-null type java.lang.Thread";
        Thread thread = (Thread) objNewInstance;
        C2610 c2610 = C2610.f8489;
        String str3 = "ChattingUI_importMultiVideo";
        c2610.getClass();
        C2609 c2609 = C2609.f8488;
        Method methodM3315 = AbstractC1574.m3315(c2609);
        if (Modifier.isStatic(methodM3315.getModifiers())) {
            methodM3315.invoke(null, thread, str3);
            return;
        }
        int i = AbstractC1745.f5844;
        C1299 c1299M3490 = AbstractC0968.m2483(AbstractC1574.m3315(c2609).getDeclaringClass()).m3490();
        AbstractC0750.m2218(c1299M3490.f6372, (EnumC1999[]) Arrays.copyOf(new EnumC1999[]{EnumC1999.STATIC}, 1));
        c1299M3490.f4725 = AbstractC0270.m1385(AbstractC1574.m3315(c2609).getDeclaringClass().getInterfaces());
        methodM3315.invoke(((C1315) AbstractC0744.m2191(c1299M3490.m3014())).m3023(), thread, str3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static void m2721(int i, String str, String str2) throws IllegalAccessException, InvocationTargetException {
        C3624 c3624 = C3624.f11326;
        String str3 = "amr_";
        c3624.getClass();
        int i2 = AbstractC1745.f5844;
        C3622 c3622 = C3622.f11324;
        C1973 c1973M3492 = AbstractC0968.m2483(AbstractC1574.m3313(c3622)).m3492();
        c1973M3492.f6543 = AbstractC2519.m4527(String.class);
        String str4 = (String) ((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(String.class), AbstractC2519.m4527(String.class)}, 2, c1973M3492)).m3832(str, str3);
        AbstractC1328.m3042(new File(str2), new File(C3624.m5220(c3624, str4)));
        if (i > 60000) {
            i = 60000;
        }
        C1973 c1973M3493 = AbstractC0968.m2483(AbstractC1574.m3313(c3622)).m3492();
        c1973M3493.f6543 = AbstractC2519.m4527(Boolean.TYPE);
        c1973M3493.f4482 = new C3618(10);
        C1982 c1982 = (C1982) AbstractC0744.m2191(c1973M3493.m3799());
        if (c1982.f6566.getParameterCount() == 4) {
            c1982.m3831(str4, Integer.valueOf(i), 0, null);
        } else {
            c1982.m3831(str4, Integer.valueOf(i), 0);
        }
        C3628.f11335.getClass();
        C3627 c3627 = C3627.f11334;
        Method methodM3315 = AbstractC1574.m3315(c3627);
        C2634.f8528.getClass();
        C1973 c1973M3494 = AbstractC0968.m2483(AbstractC1574.m3313(C2633.f8527)).m3492();
        c1973M3494.m3800(EnumC1999.STATIC);
        c1973M3494.f6543 = AbstractC1574.m3315(c3627).getDeclaringClass();
        methodM3315.invoke(null, ((C1982) AbstractC1194.m2778(c1973M3494)).m3831(new Object[0]));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static void m2722(String str, String str2) {
        C0245.f1408.getClass();
        int i = AbstractC1745.f5844;
        C0244 c0244 = C0244.f1407;
        C1973 c1973M3492 = AbstractC0968.m2483(AbstractC1574.m3313(c0244)).m3492();
        EnumC1999 enumC1999 = EnumC1999.STATIC;
        c1973M3492.m3800(enumC1999);
        c1973M3492.f6543 = AbstractC1574.m3313(c0244);
        Object objM3831 = ((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(String.class)}, 1, c1973M3492)).m3831(str2);
        C0247 c0247 = C0247.f1410;
        String[] strArr = AbstractC1574.f5469;
        String str3 = "";
        String str4 = "";
        String str5 = "";
        c0247.getClass();
        C1973 c1973M3493 = AbstractC0968.m2483(AbstractC1574.m3315(C0246.f1409).getDeclaringClass()).m3492();
        c1973M3493.m3800(enumC1999);
        c1973M3493.f6543 = AbstractC2519.m4527(Pair.class);
        ((C1982) AbstractC2784.m4743(new Object[]{AbstractC1574.m3313(c0244), AbstractC2519.m4527(String.class), AbstractC2519.m4527(String.class), AbstractC2519.m4527(String.class), AbstractC2519.m4527(String.class), AbstractC2519.m4527(byte[].class)}, 6, c1973M3493)).m3831(objM3831, str3, str4, str, str5, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static C0295 m2723(C1043 c1043, int i, int i2) {
        if (i2 != 2) {
            m2724(2);
            throw null;
        }
        C0516 c0516 = c1043.f3796;
        c1043.m2613();
        return new C0295((C0917) c1043.f3798.m4793(c0516.m1817(i)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static void m2724(int i) {
        throw new C2331("bad attribute length; expected length ".concat(AbstractC1460.m3224(i)), null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static void m2725() {
        throw new C2331("severely truncated attribute", null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static void m2726(String str, List list, String str2, String str3) throws IllegalAccessException, InvocationTargetException {
        Object objM5098 = C3512.m5098(C3512.f11014, EnumC3676.f11519.f11526);
        C3512.m5099(objM5098, str);
        ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            C2757.f8846.getClass();
            arrayList.add(AbstractC1574.m3314(C2756.f8845).newInstance(str4, 2));
        }
        AbstractC1574.m3315(C3511.f11013).invoke(objM5098, arrayList);
        if (str2 != null) {
            if (str2.length() == 0) {
                str2 = null;
            }
            if (str2 != null) {
                C3512.f11014.getClass();
                C3512.m5101(objM5098, str2);
            }
        }
        if (str3 != null) {
            if (str3.length() == 0) {
                str3 = null;
            }
            if (str3 != null) {
                C3512.f11014.getClass();
                C3512.m5100(objM5098, str3);
            }
        }
        C3512.f11014.getClass();
        C3512.m5097(objM5098);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static void m2727(int i, String str, String str2, int i2) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        C2200 c2200 = C2200.f7161;
        String[] strArr = AbstractC1574.f5469;
        String str3 = "";
        c2200.getClass();
        Constructor constructorM3314 = AbstractC1574.m3314(C2198.f7159);
        int parameterCount = constructorM3314.getParameterCount();
        if (parameterCount == 6) {
            objNewInstance = constructorM3314.newInstance(3, str, str2, Integer.valueOf(i), str3, Integer.valueOf(i2));
        } else if (parameterCount == 7) {
            objNewInstance = constructorM3314.newInstance(3, str, str2, Integer.valueOf(i), str3, Integer.valueOf(i2), null);
        } else {
            if (parameterCount != 8) {
                throw new NoSuchMethodException("With " + constructorM3314.getParameterCount() + " parameters not supported");
            }
            objNewInstance = constructorM3314.newInstance(3, str, str2, Integer.valueOf(i), str3, Integer.valueOf(i2), null, null);
        }
        C2180.m3960(C2180.f7141, objNewInstance);
    }

    @Override // p000.InterfaceC1771
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo613(InterfaceC1775 interfaceC1775) {
        interfaceC1775.mo1626();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean mo2728() {
        return this instanceof C1900;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void mo2729(float f, float f2, float f3, C2687 c2687) {
        c2687.m4699(f, 0.0f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public AbstractC0369 m2730(C1043 c1043, int i, int i2) {
        C2331 c2331;
        String str;
        if (c1043 == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("bad context");
        }
        C0917 c0917 = null;
        try {
            C0516 c0516 = c1043.f3796;
            c1043.m2613();
            C2815 c2815 = c1043.f3798;
            int iM1817 = c0516.m1817(i2);
            int iM1812 = c0516.m1812(i2 + 2);
            C0917 c0918 = (C0917) c2815.m4793(iM1817);
            try {
                return m2731(c1043, i, c0918.f3378, i2 + 6, iM1812);
            } catch (C2331 e) {
                c2331 = e;
                c0917 = c0918;
                StringBuilder sb = new StringBuilder("...while parsing ");
                if (c0917 != null) {
                    str = c0917.mo1214() + " ";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append("attribute at offset ");
                sb.append(AbstractC1460.m3224(i2));
                c2331.m2885(sb.toString());
                throw c2331;
            }
        } catch (C2331 e2) {
            c2331 = e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [int] */
    /* JADX WARN: Type inference failed for: r18v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲀᲈᲇᤝ, ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᲀᲁᛸ, ᛱᛲᛳᛴᛵᛶᛷᤞᲈᛸᲇᤝᲁᲀ] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public AbstractC0369 m2731(C1043 c1043, int i, String str, int i2, int i3) {
        InterfaceC3454 c0221;
        boolean z = false;
        AbstractC0777 abstractC0777 = null;
        if (i == 0) {
            int i4 = 4;
            if (str == "BootstrapMethods") {
                if (i3 < 2) {
                    m2725();
                    throw null;
                }
                C0516 c0516 = c1043.f3796;
                int iM1817 = c0516.m1817(i2);
                int i5 = i2 + 2;
                int i6 = i3 - 2;
                c1043.m2613();
                C2815 c2815 = c1043.f3798;
                c1043.m2613();
                C0918 c0918 = c1043.f3800;
                C0444 c0444 = new C0444(iM1817);
                int i7 = 0;
                while (i7 < iM1817) {
                    int i8 = i4;
                    if (i6 < i8) {
                        throw new C2331("truncated attribute", null);
                    }
                    int iM1818 = c0516.m1817(i5);
                    int iM1819 = c0516.m1817(i5 + 2);
                    i5 += i8;
                    i6 -= 4;
                    if (i6 < iM1819 * 2) {
                        throw new C2331("truncated attribute", null);
                    }
                    ?? c0442 = new C0442(iM1819);
                    for (?? r14 = z; r14 < iM1819; r14++) {
                        AbstractC0777 abstractC0777M4793 = c2815.m4793(c0516.m1817(i5));
                        if (!(abstractC0777M4793 instanceof C0917) && !(abstractC0777M4793 instanceof C0918) && !(abstractC0777M4793 instanceof C0903) && !(abstractC0777M4793 instanceof C0910) && !(abstractC0777M4793 instanceof C0900) && !(abstractC0777M4793 instanceof C0897) && !(abstractC0777M4793 instanceof C0912) && !(abstractC0777M4793 instanceof C0915)) {
                            throw new IllegalArgumentException(AbstractC1194.m2782(abstractC0777M4793.getClass(), "bad type for bootstrap argument: "));
                        }
                        c0442.m3063(r14, abstractC0777M4793);
                        i5 += 2;
                        i6 -= 2;
                        z = false;
                    }
                    c0442.f6944 = z;
                    c0444.m3063(i7, new C0443(c0918, (C0912) c2815.m4793(iM1818), c0442));
                    i7++;
                    z = false;
                    i4 = 4;
                }
                c0444.f6944 = z;
                if (i6 == 0) {
                    return new C0282(c0444);
                }
                m2724(i6);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C0285("Deprecated", 0);
                }
                m2724(0);
                throw null;
            }
            if (str == "EnclosingMethod") {
                if (i3 != 4) {
                    m2724(4);
                    throw null;
                }
                C0516 c0517 = c1043.f3796;
                c1043.m2613();
                C2815 c2816 = c1043.f3798;
                C0918 c0919 = (C0918) c2816.m4793(c0517.m1817(i2));
                int iM18110 = c0517.m1817(i2 + 2);
                return new C0286(c0919, (C0914) (iM18110 == 0 ? null : c2816.m4793(iM18110)));
            }
            if (str == "InnerClasses") {
                if (i3 < 2) {
                    m2725();
                    throw null;
                }
                C0516 c0518 = c1043.f3796;
                c1043.m2613();
                C2815 c2817 = c1043.f3798;
                int iM18111 = c0518.m1817(i2);
                int i9 = i2 + 2;
                int i10 = iM18111 * 8;
                if (i3 - 2 != i10) {
                    m2724(i10 + 2);
                    throw null;
                }
                C0442 c0443 = new C0442(iM18111);
                for (int i11 = 0; i11 < iM18111; i11++) {
                    int iM18112 = c0518.m1817(i9);
                    int iM18113 = c0518.m1817(i9 + 2);
                    int iM18114 = c0518.m1817(i9 + 4);
                    c0443.m3063(i11, new C1641((C0918) c2817.m4793(iM18112), (C0918) (iM18113 == 0 ? null : c2817.m4793(iM18113)), (C0917) (iM18114 == 0 ? null : c2817.m4793(iM18114)), c0518.m1817(i9 + 6)));
                    i9 += 8;
                }
                c0443.f6944 = false;
                return new C0288(c0443);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m2716(c1043, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m2717(c1043, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C0285("Synthetic", 1);
                }
                m2724(0);
                throw null;
            }
            if (str == "Signature") {
                return m2723(c1043, i2, i3);
            }
            if (str == "SourceDebugExtension") {
                return new C0296(new C0917(c1043.f3796.m1825(i2, i2 + i3)));
            }
            if (str == "SourceFile") {
                if (i3 != 2) {
                    m2724(2);
                    throw null;
                }
                C0516 c0519 = c1043.f3796;
                c1043.m2613();
                return new C0297((C0917) c1043.f3798.m4793(c0519.m1817(i2)));
            }
        } else if (i == 1) {
            if (str == "ConstantValue") {
                if (i3 != 2) {
                    m2724(2);
                    throw null;
                }
                C0516 c05110 = c1043.f3796;
                c1043.m2613();
                return new C0284((AbstractC3458) c1043.f3798.m4793(c05110.m1817(i2)));
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C0285("Deprecated", 0);
                }
                m2724(0);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m2716(c1043, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m2717(c1043, i2, i3);
            }
            if (str == "Signature") {
                return m2723(c1043, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C0285("Synthetic", 1);
                }
                m2724(0);
                throw null;
            }
        } else if (i == 2) {
            if (str == "AnnotationDefault") {
                if (i3 < 2) {
                    m2725();
                    throw null;
                }
                C0542 c0542 = new C0542(c1043, i2, i3);
                try {
                    AbstractC0777 abstractC0777M1910 = c0542.m1910();
                    if (((C0514) c0542.f2252).available() == 0) {
                        return new C0281(i3, abstractC0777M1910);
                    }
                    throw new C2331("extra data in attribute", null);
                } catch (IOException e) {
                    throw new RuntimeException("shouldn't happen", e);
                }
            }
            if (str == "Code") {
                if (i3 < 12) {
                    m2725();
                    throw null;
                }
                C0516 c05111 = c1043.f3796;
                c1043.m2613();
                C2815 c2818 = c1043.f3798;
                int iM18115 = c05111.m1817(i2);
                int iM18116 = c05111.m1817(i2 + 2);
                int iM1812 = c05111.m1812(i2 + 4);
                int i12 = i2 + 8;
                int i13 = i3 - 8;
                if (i13 < iM1812 + 4) {
                    throw new C2331("truncated attribute", null);
                }
                int i14 = i12 + iM1812;
                int i15 = i13 - iM1812;
                C0542 c0543 = new C0542(c05111.m1825(i12, i14), c2818);
                int iM18117 = c05111.m1817(i14);
                C0536 c0536 = iM18117 == 0 ? C0536.f2239 : new C0536(iM18117);
                int i16 = i14 + 2;
                int i17 = i15 - 2;
                if (i17 < (iM18117 * 8) + 2) {
                    throw new C2331("truncated attribute", null);
                }
                int i18 = 0;
                while (i18 < iM18117) {
                    int iM18118 = c05111.m1817(i16);
                    int iM18119 = c05111.m1817(i16 + 2);
                    int iM18120 = c05111.m1817(i16 + 4);
                    AbstractC0777 abstractC0778 = abstractC0777;
                    int iM18121 = c05111.m1817(i16 + 6);
                    AbstractC0777 abstractC0777M4794 = iM18121 == 0 ? abstractC0778 : c2818.m4793(iM18121);
                    c0536.getClass();
                    c0536.m3063(i18, new C0535(iM18118, iM18119, iM18120, (C0918) abstractC0777M4794));
                    i16 += 8;
                    i17 -= 8;
                    i18++;
                    abstractC0777 = abstractC0778;
                }
                ?? r18 = abstractC0777;
                c0536.f6944 = false;
                C0298 c0298 = new C0298(c1043, 3, i16, this);
                c0298.m1403();
                C0442 c0445 = (C0442) c0298.f1514;
                c0445.f6944 = false;
                c0298.m1403();
                int i19 = c0298.f1511 - i16;
                if (i19 == i17) {
                    return new C0283(iM18115, iM18116, c0543, c0536, c0445);
                }
                m2724((i16 - i2) + i19);
                throw r18;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C0285("Deprecated", 0);
                }
                m2724(0);
                throw null;
            }
            if (str == "Exceptions") {
                if (i3 < 2) {
                    m2725();
                    throw null;
                }
                int iM18122 = c1043.f3796.m1817(i2);
                int i20 = i2 + 2;
                int i21 = iM18122 * 2;
                if (i3 - 2 != i21) {
                    m2724(i21 + 2);
                    throw null;
                }
                if (iM18122 == 0) {
                    c0221 = C2819.f9030;
                } else {
                    C2815 c2819 = c1043.f3798;
                    if (c2819 == null) {
                        throw new IllegalStateException("pool not yet initialized");
                    }
                    c0221 = new C0221(c1043.f3796, i20, iM18122, c2819);
                }
                return new C0287(c0221);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m2716(c1043, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m2717(c1043, i2, i3);
            }
            if (str == "RuntimeInvisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C0292("RuntimeInvisibleParameterAnnotations", new C0542(c1043, i2, i3).m1908(2), i3);
                }
                m2725();
                throw null;
            }
            if (str == "RuntimeVisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C0294("RuntimeVisibleParameterAnnotations", new C0542(c1043, i2, i3).m1908(1), i3);
                }
                m2725();
                throw null;
            }
            if (str == "Signature") {
                return m2723(c1043, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C0285("Synthetic", 1);
                }
                m2724(0);
                throw null;
            }
        } else if (i == 3) {
            if (str == "LineNumberTable") {
                if (i3 < 2) {
                    m2725();
                    throw null;
                }
                C0516 c05112 = c1043.f3796;
                int iM18123 = c05112.m1817(i2);
                int i22 = i2 + 2;
                int i23 = iM18123 * 4;
                if (i3 - 2 != i23) {
                    m2724(i23 + 2);
                    throw null;
                }
                C1783 c1783 = new C1783(iM18123);
                for (int i24 = 0; i24 < iM18123; i24++) {
                    c1783.m3063(i24, new C1782(c05112.m1817(i22), c05112.m1817(i22 + 2)));
                    i22 += 4;
                }
                c1783.f6944 = false;
                return new C0289(c1783);
            }
            if (str == "LocalVariableTable") {
                if (i3 < 2) {
                    m2725();
                    throw null;
                }
                C0516 c05113 = c1043.f3796;
                int iM18124 = c05113.m1817(i2);
                C0516 c0516M1825 = c05113.m1825(i2 + 2, i2 + i3);
                c1043.m2613();
                return new C0290("LocalVariableTable", m2714(c0516M1825, c1043.f3798, iM18124, false));
            }
            if (str == "LocalVariableTypeTable") {
                if (i3 < 2) {
                    m2725();
                    throw null;
                }
                C0516 c05114 = c1043.f3796;
                int iM18125 = c05114.m1817(i2);
                C0516 c0516M1826 = c05114.m1825(i2 + 2, i2 + i3);
                c1043.m2613();
                return new C0290("LocalVariableTypeTable", m2714(c0516M1826, c1043.f3798, iM18125, true));
            }
        }
        C0516 c05115 = c1043.f3796;
        c1043.m2613();
        return new C2475(str, c05115, i2, i3);
    }

    @Override // p000.InterfaceC1997
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public InterfaceC1996 mo1115(C2103 c2103) {
        return C3498.f10998;
    }

    @Override // p000.InterfaceC1954
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public boolean mo1118(MenuC1944 menuC1944) {
        return false;
    }

    @Override // p000.InterfaceC1771
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo612(InterfaceC1775 interfaceC1775) {
    }

    @Override // p000.InterfaceC1954
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo1097(MenuC1944 menuC1944, boolean z) {
    }

    @Override // p000.InterfaceC2578
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public InterfaceC2568 mo1314(InterfaceC2568 interfaceC2568, C2303 c2303) {
        return interfaceC2568;
    }
}
