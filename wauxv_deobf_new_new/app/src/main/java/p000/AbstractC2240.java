package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.BaseAdapter;
import bsh.AbstractC0016;
import bsh.AbstractC0017;
import bsh.BshMethod;
import bsh.Primitive;
import bsh.Variable;
import com.alibaba.fastjson2.JSONWriter;
import com.umeng.analytics.pro.bv;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᤝᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2240 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final ExecutorC1246 f7301 = new ExecutorC1246(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final ExecutorC1246 f7302 = new ExecutorC1246(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f7303 = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f7304 = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static boolean f7305 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m4239(BaseAdapter baseAdapter, Object obj, int i) throws IllegalAccessException, InvocationTargetException {
        int i2 = AbstractC1768.f5906;
        C1681 c1681M4713 = AbstractC2727.m4713(baseAdapter);
        c1681M4713.m3561(false);
        C2004 c2004M3560 = c1681M4713.m3560();
        AbstractC0745.m2317(c2004M3560.f6478, (EnumC2030[]) Arrays.copyOf(new EnumC2030[]{EnumC2030.FINAL}, 1));
        c2004M3560.m3007(Arrays.copyOf(new Object[]{C2444.f7796.m4390(), AbstractC2574.m4549(Integer.TYPE)}, 2));
        c2004M3560.m3926();
        C2013 c2013 = (C2013) AbstractC0739.m2291(c2004M3560.m3993());
        if (c2013 != null) {
            c2013.m4025(obj, Integer.valueOf(i));
        } else {
            C1907.f6302.getClass();
            AbstractC0972.m2610(C1906.f6301).invoke(baseAdapter, obj, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static String m4240(byte[] bArr) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m4241(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2521.f8022, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m4244(context, f7304, "Theme.MaterialComponents");
            }
        }
        m4244(context, f7303, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final void m4242(int i, int i2, InterfaceC2715 interfaceC2715) {
        if (i > 0) {
            return;
        }
        throw new C1667(i + " is not allowed in ProtoNumber for property '" + interfaceC2715.mo3642(i2) + "' of '" + interfaceC2715.mo1488() + "', because protobuf supports field numbers in range 1..2147483647");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m4243(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2521.f8022, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m4244(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC1095.m2800("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static String m4245(Class cls) {
        if (AbstractC0016.m546(cls)) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0016.m527(cls).toString().substring(11));
            sb.append(cls.isInterface() ? " interface" : " class");
            sb.append(" ");
            sb.append(cls.getSimpleName());
            sb.append(cls.isInterface() ? "" : " extends ".concat(m4256(cls.getSuperclass())));
            sb.append(m4255(cls));
            sb.append(" {");
            return sb.toString().trim();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Modifier.toString(cls.getModifiers()));
        sb2.append(cls.isInterface() ? "" : " class");
        sb2.append(" ");
        sb2.append(cls.getSimpleName());
        sb2.append(cls.isInterface() ? "" : " extends ".concat(m4256(cls.getSuperclass())));
        sb2.append(m4255(cls));
        sb2.append(" {");
        return sb2.toString().trim();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final long m4246(InterfaceC2715 interfaceC2715, int i) {
        List listMo3643 = interfaceC2715.mo3643(i);
        int i2 = i + 1;
        int size = listMo3643.size();
        EnumC2482 enumC2482Type = EnumC2482.DEFAULT;
        int iNumber = i2;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            Annotation annotation = (Annotation) listMo3643.get(i3);
            if (annotation instanceof InterfaceC2483) {
                iNumber = ((InterfaceC2483) annotation).number();
                m4242(iNumber, i3, interfaceC2715);
            } else if (annotation instanceof InterfaceC2486) {
                enumC2482Type = ((InterfaceC2486) annotation).type();
            } else if (annotation instanceof InterfaceC2485) {
                z2 = true;
            } else if (annotation instanceof InterfaceC2484) {
                z = true;
            }
        }
        if (!z) {
            i2 = iNumber;
        }
        return ((long) i2) | (z ? JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL : 0L) | (z2 ? JSONWriter.MASK_IGNORE_NON_FIELD_GETTER : 0L) | enumC2482Type.f7870;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final int m4247(InterfaceC2715 interfaceC2715, int i) {
        List listMo3643 = interfaceC2715.mo3643(i);
        int iNumber = i + 1;
        int size = listMo3643.size();
        for (int i2 = 0; i2 < size; i2++) {
            Annotation annotation = (Annotation) listMo3643.get(i2);
            if (annotation instanceof InterfaceC2484) {
                return -2;
            }
            if (annotation instanceof InterfaceC2483) {
                iNumber = ((InterfaceC2483) annotation).number();
                m4242(iNumber, i2, interfaceC2715);
            }
        }
        return iNumber;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static C2005 m4248(DexKitBridge dexKitBridge, C0056 c0056) {
        int iM1054 = c0056.m1054(10);
        int i = iM1054 != 0 ? c0056.f1045.getInt(iM1054 + c0056.f1044) : 0;
        if ((i & 131072) > 0) {
            i = (i ^ 131072) | 32;
        }
        int i2 = i;
        int iM1055 = c0056.m1054(4);
        int i3 = iM1055 != 0 ? c0056.f1045.getInt(iM1055 + c0056.f1044) : 0;
        int iM1056 = c0056.m1054(6);
        int i4 = iM1056 != 0 ? c0056.f1045.getInt(iM1056 + c0056.f1044) : 0;
        int iM1057 = c0056.m1054(8);
        int i5 = iM1057 != 0 ? c0056.f1045.getInt(iM1057 + c0056.f1044) : 0;
        int iM1058 = c0056.m1054(12);
        String strM1056 = iM1058 != 0 ? c0056.m1056(iM1058 + c0056.f1044) : null;
        if (strM1056 == null) {
            strM1056 = "";
        }
        String str = strM1056;
        int iM1059 = c0056.m1054(14);
        int i6 = iM1059 != 0 ? c0056.f1045.getInt(iM1059 + c0056.f1044) : 0;
        ArrayList arrayList = new ArrayList();
        int iM10510 = c0056.m1054(16);
        int iM10511 = iM10510 != 0 ? c0056.m1058(iM10510) : 0;
        for (int i7 = 0; i7 < iM10511; i7++) {
            int iM10512 = c0056.m1054(16);
            arrayList.add(Integer.valueOf(iM10512 != 0 ? c0056.f1045.getInt((i7 * 4) + c0056.m1057(iM10512)) : 0));
        }
        return new C2005(dexKitBridge, i3, i4, i5, i2, str, i6, arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final List m4249(InterfaceC2715 interfaceC2715) {
        List<InterfaceC2715> listM2305;
        AbstractC2236 abstractC2236Mo3640 = interfaceC2715.mo3640();
        if (AbstractC1469.m3322(abstractC2236Mo3640, C2427.f7774)) {
            InterfaceC1760 interfaceC1760M3306 = AbstractC1468.m3306(interfaceC2715);
            listM2305 = C1191.f4326;
            if (interfaceC1760M3306 != null) {
                listM2305 = new ArrayList(AbstractC0741.m2313(listM2305, 10));
            }
        } else {
            if (!AbstractC1469.m3322(abstractC2236Mo3640, C2427.f7775)) {
                throw new IllegalArgumentException("Class " + interfaceC2715.mo1488() + " should be abstract or sealed or interface to be used as @ProtoOneOf property.");
            }
            listM2305 = AbstractC0739.m2305(new C1643(interfaceC2715.mo3644(1), 2));
        }
        for (InterfaceC2715 interfaceC2716 : listM2305) {
            List listMo3643 = interfaceC2716.mo3643(0);
            if (listMo3643 == null || !listMo3643.isEmpty()) {
                Iterator it = listMo3643.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!(((Annotation) it.next()) instanceof InterfaceC2483));
            }
            throw new IllegalArgumentException(interfaceC2716.mo1488() + " implementing oneOf type " + interfaceC2715.mo1488() + " should have @ProtoNumber annotation in its single property.");
        }
        return listM2305;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static ArrayList m4250() throws IOException {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM4265 = m4265(new EnumC0821[]{EnumC0821.f3222});
        if (cursorM4265 == null) {
            return arrayList;
        }
        while (cursorM4265.moveToNext()) {
            try {
                FriendInfo friendInfoM4697 = AbstractC2727.m4697(cursorM4265);
                String wxid = friendInfoM4697.getWxid();
                Object objM2364 = C0770.m2364(C0770.f2874, EnumC3575.f11175.f11180);
                "null cannot be cast to non-null type kotlin.String";
                if (!AbstractC1469.m3322(wxid, (String) objM2364)) {
                    arrayList.add(friendInfoM4697);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3528.m5090(cursorM4265, th);
                    throw th2;
                }
            }
        }
        cursorM4265.close();
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static ArrayList m4251() throws IOException {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM4265 = m4265(new EnumC0821[]{EnumC0821.f3221});
        if (cursorM4265 == null) {
            return arrayList;
        }
        while (cursorM4265.moveToNext()) {
            try {
                GroupInfo groupInfoM4698 = AbstractC2727.m4698(cursorM4265);
                if (groupInfoM4698.getGroupData().getMemberCount() > 0) {
                    arrayList.add(groupInfoM4698);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3528.m5090(cursorM4265, th);
                    throw th2;
                }
            }
        }
        cursorM4265.close();
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final EnumC2482 m4252(long j) {
        long j2 = j & 25769803776L;
        if (j2 == 0) {
            return EnumC2482.DEFAULT;
        }
        return j2 == 8589934592L ? EnumC2482.SIGNED : EnumC2482.FIXED;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static String m4253(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        String strM4240 = m4240(messageDigest.digest());
                        fileInputStream.close();
                        return strM4240;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static Object m4254(Context context, String str, String str2) throws IllegalAccessException, InvocationTargetException {
        Object objM2224 = AbstractC0705.m2224(C2444.f7796.m4390(), new Object[]{context});
        AbstractC0972.m2610(C2440.f7793).invoke(objM2224, str);
        AbstractC0972.m2610(C2442.f7795).invoke(objM2224, str2);
        return objM2224;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static String m4255(Class cls) {
        StringBuilder sb = new StringBuilder();
        if (cls.getInterfaces().length > 0) {
            sb.append(cls.isInterface() ? " extends " : " implements ");
            sb.append(String.join(", ", (List) Stream.of((Object[]) cls.getInterfaces()).map(new C2289(24)).collect(Collectors.toList())));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static String m4256(Class cls) {
        return cls == null ? "Object" : cls.getSimpleName();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final boolean m4257(long j) {
        return (j & JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final boolean m4258(InterfaceC2715 interfaceC2715) {
        return !interfaceC2715.mo3522() ? !(interfaceC2715.mo3640() instanceof AbstractC2451) || AbstractC1469.m3322(interfaceC2715.mo3640(), C2450.f7812) : !(interfaceC2715.mo3641() == 1 && m4258(interfaceC2715.mo3644(0)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static InterfaceC1780 m4259(InterfaceC1422 interfaceC1422) {
        C1139 c1139 = C1139.f4227;
        int iM4792 = AbstractC2844.m4792(2);
        if (iM4792 == 0) {
            return new C2933(interfaceC1422);
        }
        if (iM4792 == 1) {
            C2684 c2684 = new C2684();
            c2684.f8676 = interfaceC1422;
            c2684.f8677 = c1139;
            return c2684;
        }
        if (iM4792 != 2) {
            throw new C0758();
        }
        C3562 c3562 = new C3562();
        c3562.f11158 = interfaceC1422;
        c3562.f11159 = c1139;
        return c3562;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static String m4260(BshMethod bshMethod) {
        String strSubstring = bshMethod.getModifiers().toString().substring(11);
        StringBuilder sbM2803 = AbstractC1095.m2803(strSubstring, " ");
        sbM2803.append(m4256(bshMethod.getReturnType()));
        sbM2803.append(" ");
        sbM2803.append(m4262(bshMethod.getName(), (String[]) Stream.of((Object[]) bshMethod.getParameterTypes()).map(new C2289(24)).map(new C2286(Stream.of((Object[]) bshMethod.getParameterNames()).iterator(), 5)).toArray(new C0461(12))));
        sbM2803.append(strSubstring.contains("abstract") ? ";" : " {}");
        return sbM2803.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static String m4261(String str, Class[] clsArr) {
        return m4262(str, (String[]) Stream.of((Object[]) clsArr).map(new C2289(24)).toArray(new C0461(13)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static String m4262(String str, String[] strArr) {
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
    public static TypedArray m4263(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m4241(context, attributeSet, i, i2);
        m4243(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static C0253 m4264(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m4241(context, attributeSet, i, i2);
        m4243(context, attributeSet, iArr, i, i2, iArr2);
        return new C0253(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static Cursor m4265(EnumC0821[] enumC0821Arr) {
        String[] strArr = AbstractC1471.f5234;
        if (enumC0821Arr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT contact.*\nFROM rcontact contact\nLEFT JOIN rconversation conversation ON contact.username = conversation.username\nWHERE ");
        int length = enumC0821Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            EnumC0821 enumC0821 = enumC0821Arr[i];
            int i3 = i2 + 1;
            String[] strArr2 = enumC0821.f3225;
            int length2 = strArr2.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length2) {
                int i6 = i5 + 1;
                sb.append(strArr2[i4]);
                if (i5 != enumC0821.f3225.length - 1) {
                    sb.append("\nAND ");
                }
                i4++;
                i5 = i6;
            }
            if (i2 != enumC0821Arr.length - 1) {
                sb.append("\nOR ");
            }
            if (i2 == enumC0821Arr.length - 1) {
                sb.append("\n");
            }
            i++;
            i2 = i3;
        }
        sb.append("ORDER BY\nCASE WHEN conversation.username IS NOT NULL THEN 0 ELSE 1 END,\nCOALESCE(conversation.conversationTime, 0) DESC,\ncontact.username");
        return C1139.m2863(sb.toString());
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static String m4266(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008 A[PHI: r0
      0x0008: PHI (r0v9 java.lang.Class) = (r0v0 java.lang.Class), (r0v2 java.lang.Class), (r0v3 java.lang.Class), (r0v4 java.lang.Class), (r0v1 java.lang.Class) binds: [B:3:0x0006, B:11:0x0022, B:14:0x002b, B:17:0x0034, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static String m4267(Class cls) {
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
        return m4267(cls.getComponentType()) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static String m4268(Object obj) {
        if (obj == null || Primitive.NULL == obj) {
            return "null";
        }
        return obj instanceof Primitive ? ((Primitive) obj).getType().getSimpleName() : m4267(AbstractC0017.m563(obj, false));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static String m4269(Object obj) {
        StringBuilder sb = new StringBuilder("" + obj);
        if (obj != null && obj.getClass().isArray()) {
            StringBuilder sb2 = new StringBuilder("{");
            for (int i = 0; i < Array.getLength(obj); i++) {
                sb2.append(m4269(Array.get(obj, i)));
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
                sb3.append(m4269(it.next()));
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
                sb4.append(m4269(entry.getKey()));
                sb4.append("=");
                sb4.append(m4269(entry.getValue()));
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
            return m4269(entry2.getKey()) + "=" + m4269(entry2.getValue());
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static String m4270(Variable variable) {
        return variable.getModifiers().toString().substring(11) + " " + m4256(variable.getType()) + " " + variable.getName() + ";";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public abstract void mo2878(Throwable th);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ */
    public abstract void mo2879(C2136 c2136);
}
