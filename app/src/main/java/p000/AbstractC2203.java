package p000;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲇᲁᤝᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2203 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1172 f7166 = new C1172("UNDEFINED", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C1172 f7167 = new C1172("REUSABLE_CLAIMED", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C2102 f7168 = new C2102(7);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1637 m4023(String str, InterfaceC1743 interfaceC1743) {
        return new C1637(str, new C1638(interfaceC1743));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m4024(StringBuilder sb, Object obj, InterfaceC1425 interfaceC1425) {
        if (interfaceC1425 != null) {
            sb.append((CharSequence) interfaceC1425.invoke(obj));
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C1004 m4025(InterfaceC0883 interfaceC0883, InterfaceC0877 interfaceC0877, InterfaceC1429 interfaceC1429) {
        boolean z = true;
        InterfaceC0877 interfaceC0877M4992 = AbstractC3453.m4992(interfaceC0883.mo96(), interfaceC0877, true);
        C1002 c1002 = AbstractC1075.f3893;
        if (interfaceC0877M4992 != c1002 && interfaceC0877M4992.mo942(C1133.f4202) == null) {
            interfaceC0877M4992 = interfaceC0877M4992.mo941(c1002);
        }
        C1004 c1004 = new C1004(interfaceC0877M4992, true, 0);
        c1004.m938(1, c1004, interfaceC1429);
        return c1004;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static String m4026(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static int m4027(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC1194.m2780(i2, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        if (i < 0) {
            return 0;
        }
        return i > i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static long m4028(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static long[] m4029(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static ColorStateList m4030(Context context, int i) {
        ColorStateList colorStateListM2220;
        ColorStateList colorStateList;
        C2579 c2579;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C2580 c2580 = new C2580(resources, theme);
        synchronized (AbstractC2582.f8189) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC2582.f8188.get(c2580);
                colorStateListM2220 = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c2579 = (C2579) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (c2579.f8180.equals(resources.getConfiguration())) {
                        if (theme != null || c2579.f8181 != 0) {
                            if (theme == null || c2579.f8181 != theme.hashCode()) {
                            }
                        }
                        colorStateList = c2579.f8179;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (false) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC2582.f8187;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM2220 = AbstractC0751.m2220(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListM2220 == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (AbstractC2582.f8189) {
            try {
                WeakHashMap weakHashMap = AbstractC2582.f8188;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(c2580);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(c2580, sparseArray2);
                }
                sparseArray2.append(i, new C2579(colorStateListM2220, c2580.f8182.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListM2220;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static ArrayList m4031() throws IOException {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM4041 = m4041(new EnumC0822[]{EnumC0822.f3215});
        if (cursorM4041 == null) {
            return arrayList;
        }
        while (cursorM4041.moveToNext()) {
            try {
                FriendInfo friendInfoM2176 = AbstractC0743.m2176(cursorM4041);
                Object objM2263 = C0772.m2263(C0772.f2872, EnumC3517.f11022.f11027);
                if (!AbstractC2207.m4087((String) objM2263, friendInfoM2176.getWxid())) {
                    arrayList.add(friendInfoM2176);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1458.m3154(cursorM4041, th);
                    throw th2;
                }
            }
        }
        cursorM4041.close();
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static ArrayList m4032() throws IOException {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM4041 = m4041(new EnumC0822[]{EnumC0822.f3214});
        if (cursorM4041 == null) {
            return arrayList;
        }
        while (cursorM4041.moveToNext()) {
            try {
                GroupInfo groupInfoM2177 = AbstractC0743.m2177(cursorM4041);
                if (groupInfoM2177.getGroupData().getMemberCount() > 0) {
                    arrayList.add(groupInfoM2177);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1458.m3154(cursorM4041, th);
                    throw th2;
                }
            }
        }
        cursorM4041.close();
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static Activity m4033() {
        String[] strArr = AbstractC1574.f5469;
        try {
            int i = 0;
            C1744 c1744M2483 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("android.app.ActivityThread"));
            C2873 c2873 = C0152.f1159;
            ((C1927) c1744M2483.f5843).f6366 = AbstractC2205.m4054();
            MethodResolver c1973M3492 = c1744M2483.m3492();
            c1973M3492.f6370 = "currentActivityThread";
            C1299 c1299M3490 = AbstractC0968.startFieldResolution(((C1982) AbstractC0744.firstInList(c1973M3492.m3799())).m3831(new Object[0])).m3490();
            c1299M3490.f6370 = "mActivities";
            for (Object obj : ((Map) ((C1315) AbstractC0744.firstInList(c1299M3490.resolve())).m3024()).values()) {
                int i2 = 0;
                C1299 c1299M3491 = AbstractC0968.startFieldResolution(obj).m3490();
                c1299M3491.f6370 = "paused";
                if (!((Boolean) ((C1315) AbstractC0744.firstInList(c1299M3491.resolve())).m3024()).booleanValue()) {
                    C1299 c1299M3492 = AbstractC0968.startFieldResolution(obj).m3490();
                    c1299M3492.f6370 = "activity";
                    return (Activity) ((C1315) AbstractC0744.firstInList(c1299M3492.resolve())).m3024();
                }
            }
            return null;
        } catch (Exception e) {
            ArrayList arrayList = C3678.f11549;
            C3678.m5306("getCurrentActivity Failed", e, 12);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static boolean m4034(byte[] bArr) {
        int iNextInt;
        String[] strArr = AbstractC1574.f5469;
        byte[] bytes = "wxgf".getBytes(AbstractC0599.f2413);
        "getBytes(...)";
        if (bArr.length >= bytes.length) {
            Iterable c1664 = new C1664(0, bytes.length - 1, 1);
            if (true) {
                Iterator it = c1664.iterator();
                do {
                    C1662 c1662 = (C1662) it;
                    if (c1662.f5617) {
                        iNextInt = c1662.nextInt();
                    }
                } while (bArr[iNextInt] == bytes[iNextInt]);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static C1004 m4035(InterfaceC0883 interfaceC0883, InterfaceC0877 interfaceC0877, InterfaceC1429 interfaceC1429) {
        boolean z = true;
        InterfaceC0877 interfaceC0877M4992 = AbstractC3453.m4992(interfaceC0883.mo96(), interfaceC0877, true);
        C1002 c1002 = AbstractC1075.f3893;
        if (interfaceC0877M4992 != c1002 && interfaceC0877M4992.mo942(C1133.f4202) == null) {
            interfaceC0877M4992 = interfaceC0877M4992.mo941(c1002);
        }
        C1004 c1004 = new C1004(interfaceC0877M4992, true, 1);
        c1004.m938(1, c1004, interfaceC1429);
        return c1004;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static void m4036(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static void m4037(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                m4043(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                m4043(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m4043(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m4043(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final void m4038(InterfaceC0842 interfaceC0842, Object obj) throws C1071 {
        if (!(interfaceC0842 instanceof C1072)) {
            interfaceC0842.mo933(obj);
            return;
        }
        C1072 c1072 = (C1072) interfaceC0842;
        AbstractC0878 abstractC0878 = c1072.f3887;
        AbstractC0843 abstractC0843 = c1072.f3888;
        InterfaceC0877 interfaceC0877 = abstractC0843.f3249;
        Throwable thM4594 = C2586.m4594(obj);
        Object c0760 = thM4594 == null ? obj : new C0760(thM4594, false);
        try {
            if (abstractC0878.mo2393(interfaceC0877)) {
                c1072.f3889 = c0760;
                c1072.f3892 = 1;
                m4039(abstractC0878, interfaceC0877, c1072);
                return;
            }
            AbstractC1235 abstractC1235M4921 = AbstractC2920.m4921();
            if (abstractC1235M4921.f4463 >= 4294967296L) {
                c1072.f3889 = c0760;
                c1072.f3892 = 1;
                C0256 c0256 = abstractC1235M4921.f4465;
                if (c0256 == null) {
                    c0256 = new C0256();
                    abstractC1235M4921.f4465 = c0256;
                }
                c0256.addLast(c1072);
                return;
            }
            abstractC1235M4921.m2874(true);
            try {
                InterfaceC1698 interfaceC1698 = (InterfaceC1698) interfaceC0877.mo942(C1133.f4207);
                if (interfaceC1698 == null || interfaceC1698.mo3437()) {
                    Object objM5341 = AbstractC3681.m5341(interfaceC0877, c1072.f3890);
                    C3493 c3493M5012 = objM5341 != AbstractC3681.f11562 ? AbstractC3453.m5012(abstractC0843, interfaceC0877, objM5341) : null;
                    try {
                        abstractC0843.mo933(obj);
                        if (c3493M5012 == null || c3493M5012.m5092()) {
                            AbstractC3681.m5337(interfaceC0877, objM5341);
                        }
                    } catch (Throwable th) {
                        if (c3493M5012 == null || c3493M5012.m5092()) {
                            AbstractC3681.m5337(interfaceC0877, objM5341);
                        }
                        throw th;
                    }
                } else {
                    c1072.mo933(new C2585(interfaceC1698.mo3440()));
                }
                while (abstractC1235M4921.m2875()) {
                }
            } catch (Throwable th2) {
                try {
                    c1072.m2637(th2);
                } finally {
                    abstractC1235M4921.m2873();
                }
            }
        } catch (Throwable th3) {
            throw new C1071(th3, abstractC0878, interfaceC0877);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final void m4039(AbstractC0878 abstractC0878, InterfaceC0877 interfaceC0877, Runnable runnable) throws C1071 {
        try {
            abstractC0878.mo2392(interfaceC0877, runnable);
        } catch (Throwable th) {
            throw new C1071(th, abstractC0878, interfaceC0877);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static ArrayList m4040(Bitmap bitmap, boolean z) {
        int width = z ? bitmap.getWidth() : bitmap.getHeight();
        ArrayList arrayList = new ArrayList();
        int i = width - 1;
        int i2 = -1;
        for (int i3 = 1; i3 < i; i3++) {
            int pixel = z ? bitmap.getPixel(i3, 0) : bitmap.getPixel(0, i3);
            int iAlpha = Color.alpha(pixel);
            int iRed = Color.red(pixel);
            int iGreen = Color.green(pixel);
            int iBlue = Color.blue(pixel);
            if (iAlpha == 255 && iRed == 0 && iGreen == 0 && iBlue == 0) {
                if (i2 == -1) {
                    i2 = i3 - 1;
                }
            } else if (i2 != -1) {
                arrayList.add(new C2220(i2, i3 - 1));
                i2 = -1;
            }
        }
        if (i2 != -1) {
            arrayList.add(new C2220(i2, width - 2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static Cursor m4041(EnumC0822[] enumC0822Arr) {
        String[] strArr = AbstractC1574.f5469;
        if (enumC0822Arr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT contact.*\nFROM rcontact contact\nLEFT JOIN rconversation conversation ON contact.username = conversation.username\nWHERE ");
        int length = enumC0822Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            EnumC0822 enumC0822 = enumC0822Arr[i];
            int i3 = i2 + 1;
            String[] strArr2 = enumC0822.f3218;
            int length2 = strArr2.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length2) {
                int i6 = i5 + 1;
                sb.append(strArr2[i4]);
                if (i5 != enumC0822.f3218.length - 1) {
                    sb.append("\nAND ");
                }
                i4++;
                i5 = i6;
            }
            if (i2 != enumC0822Arr.length - 1) {
                sb.append("\nOR ");
            }
            if (i2 == enumC0822Arr.length - 1) {
                sb.append("\n");
            }
            i++;
            i2 = i3;
        }
        sb.append("ORDER BY\nCASE WHEN conversation.username IS NOT NULL THEN 0 ELSE 1 END,\nCOALESCE(conversation.conversationTime, 0) DESC,\ncontact.username");
        return C1133.m2715(sb.toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static C1661 m4042(C1664 c1664, int i) {
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = c1664.f5612;
        int i3 = c1664.f5613;
        if (c1664.f5614 <= 0) {
            i = -i;
        }
        return new C1661(i2, i3, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static void m4043(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(AbstractC1194.m2782(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static C1664 m4044(int i, int i2) {
        if (i2 > -2147483648) {
            return new C1664(i, i2 - 1, 1);
        }
        C1664 c1664 = C1664.f5621;
        return C1664.f5621;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final Object m4045(AbstractC0878 abstractC0878, InterfaceC1429 interfaceC1429, AbstractC2862 abstractC2862) throws Throwable {
        InterfaceC0877 interfaceC0877 = abstractC2862.f3249;
        
        InterfaceC0877 interfaceC0877Mo941 = interfaceC0877.mo941(abstractC0878);
        AbstractC3453.m4991(interfaceC0877Mo941);
        if (interfaceC0877Mo941 == interfaceC0877) {
            C2636 c2636 = new C2636(interfaceC0877Mo941, abstractC2862);
            return AbstractC2202.m4017(c2636, c2636, interfaceC1429);
        }
        C1133 c1133 = C1133.f4202;
        if (AbstractC2207.m4087(interfaceC0877Mo941.mo942(c1133), interfaceC0877.mo942(c1133))) {
            C3493 c3493 = new C3493(interfaceC0877Mo941, abstractC2862);
            InterfaceC0877 interfaceC0878 = c3493.f990;
            Object objM5341 = AbstractC3681.m5341(interfaceC0878, null);
            try {
                return AbstractC2202.m4017(c3493, c3493, interfaceC1429);
            } finally {
                AbstractC3681.m5337(interfaceC0878, objM5341);
            }
        }
        C1073 c1073 = new C1073(interfaceC0877Mo941, abstractC2862);
        try {
            m4038(AbstractC2209.m4135(((AbstractC0370) interfaceC1429).mo1197(c1073, c1073)), Unit.INSTANCE);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1073.f3891;
            do {
                int i = atomicIntegerFieldUpdater.get(c1073);
                if (i != 0) {
                    if (i != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objM3171 = AbstractC1458.m3171(C1705.f5796.get(c1073));
                    if (objM3171 instanceof C0760) {
                        throw ((C0760) objM3171).f2861;
                    }
                    return objM3171;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c1073, 0, 1));
            return EnumC0884.f3325;
        } catch (Throwable th) {
            AbstractC2209.m4127(c1073, th);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01c8 A[Catch: all -> 0x01d6, TRY_LEAVE, TryCatch #30 {all -> 0x01d6, blocks: (B:124:0x01bc, B:126:0x01c8, B:135:0x01d9), top: B:249:0x01bc, outer: #29 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01d9 A[Catch: all -> 0x01d6, TRY_ENTER, TRY_LEAVE, TryCatch #30 {all -> 0x01d6, blocks: (B:124:0x01bc, B:126:0x01c8, B:135:0x01d9), top: B:249:0x01bc, outer: #29 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:150:0x0200  */
    /* JADX WARN: Code duplicated, block: B:151:0x0204  */
    /* JADX WARN: Code duplicated, block: B:159:0x021e A[Catch: all -> 0x0240, TRY_LEAVE, TryCatch #16 {all -> 0x0240, blocks: (B:156:0x0216, B:157:0x0218, B:159:0x021e), top: B:227:0x0216 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x026d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0277  */
    /* JADX WARN: Code duplicated, block: B:209:0x0284 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x0288  */
    /* JADX WARN: Code duplicated, block: B:251:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static void m4046(Context context, Executor executor, InterfaceC2409 interfaceC2409, boolean z) {
        char c;
        FileInputStream fileInputStreamM2592;
        C1027[] c1027ArrM4071;
        InterfaceC2409 interfaceC24010;
        C1027[] c1027Arr;
        byte[] bArr;
        byte[] bArr2;
        boolean z2;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i;
        boolean z3;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        C1018 c1018;
        boolean z4;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j == packageInfo.lastUpdateTime;
                            if (z5) {
                                interfaceC2409.mo3485(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    AbstractC2415.m4383(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = AbstractC2205.f7171;
            int i3 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C1018 c1019 = new C1018(assets, executor, interfaceC2409, name, file2);
            byte[] bArr5 = c1019.f3724;
            if (bArr5 == null) {
                c1019.m2593(3, Integer.valueOf(i3));
            } else {
                try {
                    try {
                        if (file2.exists()) {
                            if (!file2.canWrite()) {
                                c1019.m2593(4, null);
                            }
                            if (z3 || !z) {
                                z4 = 0;
                            } else {
                                z4 = c;
                            }
                            AbstractC2415.m4383(context, z4);
                        }
                        try {
                            file2.createNewFile();
                        } catch (IOException unused2) {
                            c = 1;
                            c1019.m2593(4, null);
                            z3 = false;
                        }
                        fileInputStreamM2592 = c1019.m2592(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        interfaceC2409.mo3485(6, e);
                        fileInputStreamM2592 = null;
                    } catch (IOException e2) {
                        interfaceC2409.mo3485(7, e2);
                        fileInputStreamM2592 = null;
                    }
                    if (fileInputStreamM2592 != null) {
                        try {
                            if (!Arrays.equals(bArr4, AbstractC1574.m3303(fileInputStreamM2592, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c1027ArrM4071 = AbstractC2205.m4071(fileInputStreamM2592, AbstractC1574.m3303(fileInputStreamM2592, 4), c1019.f3726);
                            try {
                                fileInputStreamM2592.close();
                            } catch (IOException e3) {
                                interfaceC2409.mo3485(7, e3);
                            }
                            c1019.f3728 = c1027ArrM4071;
                        } catch (IOException e4) {
                            interfaceC2409.mo3485(7, e4);
                            try {
                                fileInputStreamM2592.close();
                            } catch (IOException e5) {
                                interfaceC2409.mo3485(7, e5);
                            }
                            c1027ArrM4071 = null;
                        } catch (IllegalStateException e6) {
                            interfaceC2409.mo3485(8, e6);
                            fileInputStreamM2592.close();
                            c1027ArrM4071 = null;
                        }
                    }
                    C1027[] c1027Arr2 = c1019.f3728;
                    if (c1027Arr2 != null && (i2 = Build.VERSION.SDK_INT) <= 34) {
                        switch (i2) {
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                                try {
                                    FileInputStream fileInputStreamM2593 = c1019.m2592(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamM2593 != null) {
                                        try {
                                            if (!Arrays.equals(AbstractC2205.f7172, AbstractC1574.m3303(fileInputStreamM2593, 4))) {
                                                throw new IllegalStateException("Invalid magic");
                                            }
                                            c1019.f3728 = AbstractC2205.m4068(fileInputStreamM2593, AbstractC1574.m3303(fileInputStreamM2593, 4), bArr5, c1027Arr2);
                                            fileInputStreamM2593.close();
                                            c1018 = c1019;
                                        } catch (Throwable th4) {
                                            try {
                                                fileInputStreamM2593.close();
                                                throw th4;
                                            } catch (Throwable th5) {
                                                th4.addSuppressed(th5);
                                                throw th4;
                                            }
                                        }
                                    } else {
                                        if (false) {
                                            fileInputStreamM2593.close();
                                        }
                                        c1018 = null;
                                    }
                                } catch (FileNotFoundException e7) {
                                    interfaceC2409.mo3485(9, e7);
                                } catch (IOException e8) {
                                    interfaceC2409.mo3485(7, e8);
                                } catch (IllegalStateException e9) {
                                    c1019.f3728 = null;
                                    interfaceC2409.mo3485(8, e9);
                                }
                                if (c1018 != null) {
                                    c1019 = c1018;
                                    break;
                                }
                            default:
                                interfaceC24010 = c1019.f3723;
                                c1027Arr = c1019.f3728;
                                bArr = c1019.f3724;
                                if (c1027Arr != null && true) {
                                    if (c1019.f3727) {
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byteArrayOutputStream.write(bArr4);
                                            byteArrayOutputStream.write(bArr);
                                            if (AbstractC2205.m4079(byteArrayOutputStream, bArr, c1027Arr)) {
                                                c1019.f3729 = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                c1019.f3728 = null;
                                            } else {
                                                interfaceC24010.mo3485(5, null);
                                                c1019.f3728 = null;
                                                byteArrayOutputStream.close();
                                            }
                                        } catch (Throwable th6) {
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th6;
                                            } catch (Throwable th7) {
                                                th6.addSuppressed(th7);
                                                throw th6;
                                            }
                                        }
                                    } catch (IOException e10) {
                                        interfaceC24010.mo3485(7, e10);
                                    } catch (IllegalStateException e11) {
                                        interfaceC24010.mo3485(8, e11);
                                    }
                                }
                                bArr2 = c1019.f3729;
                                if (bArr2 != null) {
                                    z2 = false;
                                    c = 1;
                                } else {
                                    try {
                                        if (c1019.f3727) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                try {
                                                    fileOutputStream = new FileOutputStream(c1019.f3725);
                                                    try {
                                                        try {
                                                            bArr3 = new byte[512];
                                                            while (true) {
                                                                i = byteArrayInputStream.read(bArr3);
                                                                if (i > 0) {
                                                                    fileOutputStream.write(bArr3, 0, i);
                                                                } else {
                                                                    c = 1;
                                                                    try {
                                                                        c1019.m2593(1, null);
                                                                        fileOutputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        c1019.f3729 = null;
                                                                        c1019.f3728 = null;
                                                                        z2 = true;
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                    }
                                                                }
                                                                th = th;
                                                                try {
                                                                    fileOutputStream.close();
                                                                    throw th;
                                                                } catch (Throwable th9) {
                                                                    th.addSuppressed(th9);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            Throwable th11 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th11;
                                                            } catch (Throwable th12) {
                                                                th11.addSuppressed(th12);
                                                                throw th11;
                                                            }
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                }
                                            } catch (FileNotFoundException e12) {
                                                e = e12;
                                                c1019.m2593(6, e);
                                                c1019.f3729 = null;
                                                c1019.f3728 = null;
                                                z2 = false;
                                            } catch (IOException e13) {
                                                e = e13;
                                                c1019.m2593(7, e);
                                                c1019.f3729 = null;
                                                c1019.f3728 = null;
                                                z2 = false;
                                            }
                                        } catch (FileNotFoundException e14) {
                                            e = e14;
                                            c = 1;
                                            c1019.m2593(6, e);
                                            c1019.f3729 = null;
                                            c1019.f3728 = null;
                                            z2 = false;
                                        } catch (IOException e15) {
                                            e = e15;
                                            c = 1;
                                            c1019.m2593(7, e);
                                            c1019.f3729 = null;
                                            c1019.f3728 = null;
                                            z2 = false;
                                        }
                                    } catch (Throwable th15) {
                                        c1019.f3729 = null;
                                        c1019.f3728 = null;
                                        throw th15;
                                    }
                                }
                                if (z2) {
                                    m4036(packageInfo, filesDir);
                                }
                                z3 = z2;
                                if (z3) {
                                    z4 = 0;
                                } else {
                                    z4 = 0;
                                }
                                AbstractC2415.m4383(context, z4);
                        }
                    }
                    interfaceC24010 = c1019.f3723;
                    c1027Arr = c1019.f3728;
                    bArr = c1019.f3724;
                    if (c1027Arr != null) {
                        if (c1019.f3727) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr4);
                        byteArrayOutputStream.write(bArr);
                        if (AbstractC2205.m4079(byteArrayOutputStream, bArr, c1027Arr)) {
                            interfaceC24010.mo3485(5, null);
                            c1019.f3728 = null;
                            byteArrayOutputStream.close();
                        } else {
                            c1019.f3729 = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            c1019.f3728 = null;
                        }
                    }
                    bArr2 = c1019.f3729;
                    if (bArr2 != null) {
                        if (c1019.f3727) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                        fileOutputStream = new FileOutputStream(c1019.f3725);
                        bArr3 = new byte[512];
                        while (true) {
                            i = byteArrayInputStream.read(bArr3);
                            if (i > 0) {
                                fileOutputStream.write(bArr3, 0, i);
                            } else {
                                c = 1;
                                c1019.m2593(1, null);
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                c1019.f3729 = null;
                                c1019.f3728 = null;
                                z2 = true;
                            }
                            th = th;
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    z2 = false;
                    c = 1;
                    if (false) {
                        m4036(packageInfo, filesDir);
                    }
                    z3 = false;
                    if (false) {
                        z4 = 0;
                    } else {
                        z4 = 0;
                    }
                    AbstractC2415.m4383(context, z4);
                } catch (Throwable th16) {
                    try {
                        fileInputStreamM2592.close();
                        throw th16;
                    } catch (IOException e16) {
                        interfaceC2409.mo3485(7, e16);
                        throw th16;
                    }
                }
                c1019.f3727 = true;
                c = '\b';
            }
            c = 1;
            z3 = false;
            if (false) {
                z4 = 0;
            } else {
                z4 = 0;
            }
            AbstractC2415.m4383(context, z4);
        } catch (PackageManager.NameNotFoundException e17) {
            interfaceC2409.mo3485(7, e17);
            AbstractC2415.m4383(context, false);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public abstract int mo3722(boolean z);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public abstract int mo3723(boolean z);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public abstract int mo3724(boolean z);
}
