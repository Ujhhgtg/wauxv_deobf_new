package p000;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᤞᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1139 implements InterfaceC0875, InterfaceC2028, InterfaceC2634, InterfaceC1985, InterfaceC1794 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ C1139 f4214 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ C1139 f4215 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1139 f4216 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1139 f4217 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C1139 f4218 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ C1139 f4219 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C1139 f4220 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C1139 f4221 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C1139 f4222 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final /* synthetic */ C1139 f4223 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ C1139 f4224 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final C1139 f4225 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final C1139 f4226 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final C1139 f4227 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final C1139 f4228 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final C1139 f4229 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final C1139 f4230 = new C1139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C1927 m2854(XC_MethodHook.MethodHookParam methodHookParam) {
        return new C1927(new C1571(methodHookParam, 0), new C1571(methodHookParam, 1), new C1571(methodHookParam, 2), new C1572(methodHookParam, 0), new C1572(methodHookParam, 1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static String m2855() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            C2527 c2527 = AbstractC2528.f8058;
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(AbstractC2528.f8059.m1095(62)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m2856(byte[] bArr, BigInteger bigInteger) {
        if (bArr.length == 0 || bArr.length < 131072) {
            return;
        }
        C2525 c2525 = new C2525(bigInteger);
        int i = 0;
        C1677 c1677M5347 = AbstractC3744.m5347(AbstractC3744.m5348(0, 131072), 8);
        int i2 = c1677M5347.f5650;
        int i3 = c1677M5347.f5651;
        int i4 = c1677M5347.f5652;
        if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
            return;
        }
        while (true) {
            int i5 = c2525.f8056;
            BigInteger bigInteger2 = c2525.f8053[i5];
            int i6 = 255;
            if (i5 == 0) {
                c2525.m4448();
                c2525.f8056 = 255;
            } else {
                c2525.f8056 = i5 - 1;
            }
            byte[] bArr2 = new byte[8];
            int i7 = i;
            while (i7 < 8) {
                BigInteger bigIntegerShiftRight = bigInteger2.shiftRight(i7 * 8);
                String[] strArr = AbstractC1471.f5234;
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
    public static void m2857(String str, String str2, BigInteger bigInteger) throws IOException {
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
                        m2856(bArr, bigInteger);
                        fileOutputStream.write(bArr, 0, i);
                    }
                    try {
                        throw th;
                    } catch (Throwable th) {
                        AbstractC3528.m5090(fileInputStream, th);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC3528.m5090(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static Object m2858(String str, String str2, byte[] bArr, Object obj) throws IllegalAccessException {
        String[] strArr = AbstractC1471.f5234;
        Object objM2224 = AbstractC0705.m2224(AbstractC0972.m2606("com.tencent.mm.opensdk.modelmsg.WXMediaMessage"), new Object[0]);
        int i = AbstractC1768.f5906;
        C1681 c1681M4713 = AbstractC2727.m4713(objM2224);
        C1300 c1300M3558 = c1681M4713.m3558();
        c1300M3558.f6475 = "title";
        ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3128(str);
        C1300 c1300M3559 = c1681M4713.m3558();
        c1300M3559.f6475 = "description";
        ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3128(str2);
        C1300 c1300M35510 = c1681M4713.m3558();
        c1300M35510.f6475 = "thumbData";
        ((C1316) AbstractC0739.m2290(c1300M35510.m3117())).m3128(bArr);
        C1300 c1300M35511 = c1681M4713.m3558();
        c1300M35511.f6475 = "mediaObject";
        ((C1316) AbstractC0739.m2290(c1300M35511.m3117())).m3128(obj);
        return objM2224;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static Object m2859(String str, String str2, Object obj, int i) {
        String[] strArr = AbstractC1471.f5234;
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return m2858(str, str2, null, obj);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static long m2860(long j, AbstractC1470 abstractC1470) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (abstractC1470.equals(C0848.f3268)) {
            return m2861(j, jCurrentTimeMillis) | 6917529027641081856L;
        }
        if (abstractC1470.equals(C0848.f3266)) {
            return m2861(j, jCurrentTimeMillis) & (-6917529027641081857L);
        }
        if (abstractC1470.equals(C0848.f3264)) {
            return m2861(j, jCurrentTimeMillis) & 6917529027641081856L;
        }
        if (abstractC1470.equals(C0848.f3267)) {
            return m2861(j, jCurrentTimeMillis) | (-6917529027641081856L);
        }
        if (abstractC1470.equals(C0848.f3265)) {
            return m2861(j, jCurrentTimeMillis) & 6917529027641081855L;
        }
        if (abstractC1470.equals(C0848.f3263)) {
            return m2861(j, jCurrentTimeMillis) & (-6917529027641081856L);
        }
        throw new C0758();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static long m2861(long j, long j2) {
        return (j & (-72057594037927936L)) | (j2 & 72057594037927935L);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static C1860 m2862(C0493 c0493, C2875 c2875, int i, boolean z) {
        C0916 c0916;
        C0916 c0917;
        int i2 = i * 10;
        if (c0493.f2147 != i2) {
            m2868(i2 + 2);
            throw null;
        }
        C0491 c0491 = new C0491(new C0492(c0493));
        C1860 c1860 = new C1860(i);
        for (int i3 = 0; i3 < i; i3++) {
            try {
                int unsignedShort = c0491.readUnsignedShort();
                int unsignedShort2 = c0491.readUnsignedShort();
                int unsignedShort3 = c0491.readUnsignedShort();
                int unsignedShort4 = c0491.readUnsignedShort();
                int unsignedShort5 = c0491.readUnsignedShort();
                C0916 c0918 = (C0916) c2875.m4826(unsignedShort3);
                C0916 c0919 = (C0916) c2875.m4826(unsignedShort4);
                if (z) {
                    c0917 = null;
                    c0916 = c0919;
                } else {
                    c0916 = null;
                    c0917 = c0919;
                }
                c1860.m3166(i3, new C1859(unsignedShort, unsignedShort2, c0918, c0917, c0916, unsignedShort5));
            } catch (IOException e) {
                throw new RuntimeException("shouldn't happen", e);
            }
        }
        c1860.f7068 = false;
        return c1860;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static Cursor m2863(String str) {
        int i = AbstractC1768.f5906;
        C2859.f9091.getClass();
        C2004 c2004M3560 = AbstractC2727.m4713(C2859.m4812()).m3560();
        c2004M3560.f6475 = "rawQuery";
        return (Cursor) ((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(String.class), AbstractC2574.m4549(Object[].class)}, 2, c2004M3560)).m4026(str, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static C0301 m2864(C1046 c1046, int i, int i2) {
        if (i2 >= 2) {
            return new C0301("RuntimeInvisibleAnnotations", new C0519(c1046, i, i2).m1996(2), i2);
        }
        m2869();
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static C0303 m2865(C1046 c1046, int i, int i2) {
        if (i2 >= 2) {
            return new C0303("RuntimeVisibleAnnotations", new C0519(c1046, i, i2).m1996(1), i2);
        }
        m2869();
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static ArrayList m2866(Bitmap bitmap, boolean z, boolean z2) {
        int pixel;
        int width = z ? bitmap.getWidth() : bitmap.getHeight();
        ArrayList arrayList = new ArrayList();
        int i = width - 1;
        int i2 = -1;
        for (int i3 = 1; i3 < i; i3++) {
            if (z && z2) {
                pixel = bitmap.getPixel(i3, bitmap.getHeight() - 1);
            } else if (z) {
                pixel = bitmap.getPixel(i3, 0);
            } else {
                pixel = z2 ? bitmap.getPixel(bitmap.getWidth() - 1, i3) : bitmap.getPixel(0, i3);
            }
            int iAlpha = Color.alpha(pixel);
            int iRed = Color.red(pixel);
            int iGreen = Color.green(pixel);
            int iBlue = Color.blue(pixel);
            if (iAlpha == 255 && iRed == 0 && iGreen == 0 && iBlue == 0) {
                if (i2 == -1) {
                    i2 = i3 - 1;
                }
            } else if (i2 != -1) {
                arrayList.add(new C2251(i2, i3 - 1));
                i2 = -1;
            }
        }
        if (i2 != -1) {
            arrayList.add(new C2251(i2, width - 2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static C0305 m2867(C1046 c1046, int i, int i2) {
        if (i2 != 2) {
            m2868(2);
            throw null;
        }
        C0493 c0493 = c1046.f3803;
        c1046.m2737();
        return new C0305((C0916) c1046.f3805.m4826(c0493.m1911(i)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static void m2868(int i) {
        throw new C2371("bad attribute length; expected length ".concat(AbstractC2902.m4907(i)), null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static void m2869() {
        throw new C2371("severely truncated attribute", null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static void m2870(String str, List list, String str2, String str3) throws IllegalAccessException, InvocationTargetException {
        Object objM5110 = C3570.m5110(C3570.f11167, EnumC3736.f11668.f11675);
        C3570.m5111(objM5110, str);
        ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            C2817.f9008.getClass();
            arrayList.add(AbstractC0972.m2609(C2816.f9007).newInstance(str4, 2));
        }
        AbstractC0972.m2610(C3569.f11166).invoke(objM5110, arrayList);
        if (str2 != null) {
            if (str2.length() == 0) {
                str2 = null;
            }
            if (str2 != null) {
                C3570.f11167.getClass();
                C3570.m5113(objM5110, str2);
            }
        }
        if (str3 != null) {
            if (str3.length() == 0) {
                str3 = null;
            }
            if (str3 != null) {
                C3570.f11167.getClass();
                C3570.m5112(objM5110, str3);
            }
        }
        C3570.f11167.getClass();
        C3570.m5109(objM5110);
    }

    @Override // p000.InterfaceC1794
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo756(InterfaceC1798 interfaceC1798) {
        interfaceC1798.mo1732();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean mo2871() {
        return this instanceof C1926;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void mo2872(float f, float f2, float f3, C2748 c2748) {
        c2748.m4736(f, 0.0f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public AbstractC0344 m2873(C1046 c1046, int i, int i2) {
        C2371 c2371;
        String str;
        if (c1046 == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("bad context");
        }
        C0916 c0916 = null;
        try {
            C0493 c0493 = c1046.f3803;
            c1046.m2737();
            C2875 c2875 = c1046.f3805;
            int iM1911 = c0493.m1911(i2);
            int iM1906 = c0493.m1906(i2 + 2);
            C0916 c0917 = (C0916) c2875.m4826(iM1911);
            try {
                return m2874(c1046, i, c0917.f3385, i2 + 6, iM1906);
            } catch (C2371 e) {
                c2371 = e;
                c0916 = c0917;
                StringBuilder sb = new StringBuilder("...while parsing ");
                if (c0916 != null) {
                    str = c0916.mo1360() + " ";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append("attribute at offset ");
                sb.append(AbstractC2902.m4907(i2));
                c2371.m3004(sb.toString());
                throw c2371;
            }
        } catch (C2371 e2) {
            c2371 = e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [int] */
    /* JADX WARN: Type inference failed for: r18v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᤞᲇᲈᲀ, ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᛸᲀᤞᲁ, ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲇᲀᲁᛸ] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public AbstractC0344 m2874(C1046 c1046, int i, String str, int i2, int i3) {
        InterfaceC3510 c0231;
        boolean z = false;
        AbstractC0775 abstractC0775 = null;
        if (i == 0) {
            int i4 = 4;
            if (str == "BootstrapMethods") {
                if (i3 < 2) {
                    m2869();
                    throw null;
                }
                C0493 c0493 = c1046.f3803;
                int iM1911 = c0493.m1911(i2);
                int i5 = i2 + 2;
                int i6 = i3 - 2;
                c1046.m2737();
                C2875 c2875 = c1046.f3805;
                c1046.m2737();
                C0917 c0917 = c1046.f3807;
                C0419 c0419 = new C0419(iM1911);
                int i7 = 0;
                while (i7 < iM1911) {
                    int i8 = i4;
                    if (i6 < i8) {
                        throw new C2371("truncated attribute", null);
                    }
                    int iM1912 = c0493.m1911(i5);
                    int iM1913 = c0493.m1911(i5 + 2);
                    i5 += i8;
                    i6 -= 4;
                    if (i6 < iM1913 * 2) {
                        throw new C2371("truncated attribute", null);
                    }
                    ?? c0417 = new C0417(iM1913);
                    for (?? r14 = z; r14 < iM1913; r14++) {
                        AbstractC0775 abstractC0775M4826 = c2875.m4826(c0493.m1911(i5));
                        if (!(abstractC0775M4826 instanceof C0916) && !(abstractC0775M4826 instanceof C0917) && !(abstractC0775M4826 instanceof C0902) && !(abstractC0775M4826 instanceof C0909) && !(abstractC0775M4826 instanceof C0899) && !(abstractC0775M4826 instanceof C0896) && !(abstractC0775M4826 instanceof C0911) && !(abstractC0775M4826 instanceof C0914)) {
                            throw new IllegalArgumentException(AbstractC1095.m2797(abstractC0775M4826.getClass(), "bad type for bootstrap argument: "));
                        }
                        c0417.m3166(r14, abstractC0775M4826);
                        i5 += 2;
                        i6 -= 2;
                        z = false;
                    }
                    c0417.f7068 = z;
                    c0419.m3166(i7, new C0418(c0917, (C0911) c2875.m4826(iM1912), c0417));
                    i7++;
                    z = false;
                    i4 = 4;
                }
                c0419.f7068 = z;
                if (i6 == 0) {
                    return new C0292(c0419);
                }
                m2868(i6);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C0295("Deprecated", 0);
                }
                m2868(0);
                throw null;
            }
            if (str == "EnclosingMethod") {
                if (i3 != 4) {
                    m2868(4);
                    throw null;
                }
                C0493 c0494 = c1046.f3803;
                c1046.m2737();
                C2875 c2876 = c1046.f3805;
                C0917 c0918 = (C0917) c2876.m4826(c0494.m1911(i2));
                int iM1914 = c0494.m1911(i2 + 2);
                return new C0296(c0918, (C0913) (iM1914 == 0 ? null : c2876.m4826(iM1914)));
            }
            if (str == "InnerClasses") {
                if (i3 < 2) {
                    m2869();
                    throw null;
                }
                C0493 c0495 = c1046.f3803;
                c1046.m2737();
                C2875 c2877 = c1046.f3805;
                int iM1915 = c0495.m1911(i2);
                int i9 = i2 + 2;
                int i10 = iM1915 * 8;
                if (i3 - 2 != i10) {
                    m2868(i10 + 2);
                    throw null;
                }
                C0417 c0418 = new C0417(iM1915);
                for (int i11 = 0; i11 < iM1915; i11++) {
                    int iM1916 = c0495.m1911(i9);
                    int iM1917 = c0495.m1911(i9 + 2);
                    int iM1918 = c0495.m1911(i9 + 4);
                    c0418.m3166(i11, new C1655((C0917) c2877.m4826(iM1916), (C0917) (iM1917 == 0 ? null : c2877.m4826(iM1917)), (C0916) (iM1918 == 0 ? null : c2877.m4826(iM1918)), c0495.m1911(i9 + 6)));
                    i9 += 8;
                }
                c0418.f7068 = false;
                return new C0298(c0418);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m2864(c1046, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m2865(c1046, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C0295("Synthetic", 1);
                }
                m2868(0);
                throw null;
            }
            if (str == "Signature") {
                return m2867(c1046, i2, i3);
            }
            if (str == "SourceDebugExtension") {
                return new C0306(new C0916(c1046.f3803.m1919(i2, i2 + i3)));
            }
            if (str == "SourceFile") {
                if (i3 != 2) {
                    m2868(2);
                    throw null;
                }
                C0493 c0496 = c1046.f3803;
                c1046.m2737();
                return new C0307((C0916) c1046.f3805.m4826(c0496.m1911(i2)));
            }
        } else if (i == 1) {
            if (str == "ConstantValue") {
                if (i3 != 2) {
                    m2868(2);
                    throw null;
                }
                C0493 c0497 = c1046.f3803;
                c1046.m2737();
                return new C0294((AbstractC3514) c1046.f3805.m4826(c0497.m1911(i2)));
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C0295("Deprecated", 0);
                }
                m2868(0);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m2864(c1046, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m2865(c1046, i2, i3);
            }
            if (str == "Signature") {
                return m2867(c1046, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C0295("Synthetic", 1);
                }
                m2868(0);
                throw null;
            }
        } else if (i == 2) {
            if (str == "AnnotationDefault") {
                if (i3 < 2) {
                    m2869();
                    throw null;
                }
                C0519 c0519 = new C0519(c1046, i2, i3);
                try {
                    AbstractC0775 abstractC0775M2004 = c0519.m2004();
                    if (((C0491) c0519.f2208).available() == 0) {
                        return new C0291(i3, abstractC0775M2004);
                    }
                    throw new C2371("extra data in attribute", null);
                } catch (IOException e) {
                    throw new RuntimeException("shouldn't happen", e);
                }
            }
            if (str == "Code") {
                if (i3 < 12) {
                    m2869();
                    throw null;
                }
                C0493 c0498 = c1046.f3803;
                c1046.m2737();
                C2875 c2878 = c1046.f3805;
                int iM1919 = c0498.m1911(i2);
                int iM19110 = c0498.m1911(i2 + 2);
                int iM1906 = c0498.m1906(i2 + 4);
                int i12 = i2 + 8;
                int i13 = i3 - 8;
                if (i13 < iM1906 + 4) {
                    throw new C2371("truncated attribute", null);
                }
                int i14 = i12 + iM1906;
                int i15 = i13 - iM1906;
                C0519 c05110 = new C0519(c0498.m1919(i12, i14), c2878);
                int iM19111 = c0498.m1911(i14);
                C0513 c0513 = iM19111 == 0 ? C0513.f2195 : new C0513(iM19111);
                int i16 = i14 + 2;
                int i17 = i15 - 2;
                if (i17 < (iM19111 * 8) + 2) {
                    throw new C2371("truncated attribute", null);
                }
                int i18 = 0;
                while (i18 < iM19111) {
                    int iM19112 = c0498.m1911(i16);
                    int iM19113 = c0498.m1911(i16 + 2);
                    int iM19114 = c0498.m1911(i16 + 4);
                    AbstractC0775 abstractC0776 = abstractC0775;
                    int iM19115 = c0498.m1911(i16 + 6);
                    AbstractC0775 abstractC0775M4827 = iM19115 == 0 ? abstractC0776 : c2878.m4826(iM19115);
                    c0513.getClass();
                    c0513.m3166(i18, new C0512(iM19112, iM19113, iM19114, (C0917) abstractC0775M4827));
                    i16 += 8;
                    i17 -= 8;
                    i18++;
                    abstractC0775 = abstractC0776;
                }
                ?? r18 = abstractC0775;
                c0513.f7068 = false;
                C0308 c0308 = new C0308(c1046, 3, i16, this);
                c0308.m1549();
                C0417 c04110 = (C0417) c0308.f1588;
                c04110.f7068 = false;
                c0308.m1549();
                int i19 = c0308.f1585 - i16;
                if (i19 == i17) {
                    return new C0293(iM1919, iM19110, c05110, c0513, c04110);
                }
                m2868((i16 - i2) + i19);
                throw r18;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C0295("Deprecated", 0);
                }
                m2868(0);
                throw null;
            }
            if (str == "Exceptions") {
                if (i3 < 2) {
                    m2869();
                    throw null;
                }
                int iM19116 = c1046.f3803.m1911(i2);
                int i20 = i2 + 2;
                int i21 = iM19116 * 2;
                if (i3 - 2 != i21) {
                    m2868(i21 + 2);
                    throw null;
                }
                if (iM19116 == 0) {
                    c0231 = C2879.f9192;
                } else {
                    C2875 c2879 = c1046.f3805;
                    if (c2879 == null) {
                        throw new IllegalStateException("pool not yet initialized");
                    }
                    c0231 = new C0231(c1046.f3803, i20, iM19116, c2879);
                }
                return new C0297(c0231);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m2864(c1046, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m2865(c1046, i2, i3);
            }
            if (str == "RuntimeInvisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C0302("RuntimeInvisibleParameterAnnotations", new C0519(c1046, i2, i3).m2002(2), i3);
                }
                m2869();
                throw null;
            }
            if (str == "RuntimeVisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C0304("RuntimeVisibleParameterAnnotations", new C0519(c1046, i2, i3).m2002(1), i3);
                }
                m2869();
                throw null;
            }
            if (str == "Signature") {
                return m2867(c1046, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C0295("Synthetic", 1);
                }
                m2868(0);
                throw null;
            }
        } else if (i == 3) {
            if (str == "LineNumberTable") {
                if (i3 < 2) {
                    m2869();
                    throw null;
                }
                C0493 c0499 = c1046.f3803;
                int iM19117 = c0499.m1911(i2);
                int i22 = i2 + 2;
                int i23 = iM19117 * 4;
                if (i3 - 2 != i23) {
                    m2868(i23 + 2);
                    throw null;
                }
                C1806 c1806 = new C1806(iM19117);
                for (int i24 = 0; i24 < iM19117; i24++) {
                    c1806.m3166(i24, new C1805(c0499.m1911(i22), c0499.m1911(i22 + 2)));
                    i22 += 4;
                }
                c1806.f7068 = false;
                return new C0299(c1806);
            }
            if (str == "LocalVariableTable") {
                if (i3 < 2) {
                    m2869();
                    throw null;
                }
                C0493 c04910 = c1046.f3803;
                int iM19118 = c04910.m1911(i2);
                C0493 c0493M1919 = c04910.m1919(i2 + 2, i2 + i3);
                c1046.m2737();
                return new C0300("LocalVariableTable", m2862(c0493M1919, c1046.f3805, iM19118, false));
            }
            if (str == "LocalVariableTypeTable") {
                if (i3 < 2) {
                    m2869();
                    throw null;
                }
                C0493 c04911 = c1046.f3803;
                int iM19119 = c04911.m1911(i2);
                C0493 c0493M19110 = c04911.m1919(i2 + 2, i2 + i3);
                c1046.m2737();
                return new C0300("LocalVariableTypeTable", m2862(c0493M19110, c1046.f3805, iM19119, true));
            }
        }
        C0493 c04912 = c1046.f3803;
        c1046.m2737();
        return new C2529(str, c04912, i2, i3);
    }

    @Override // p000.InterfaceC2028
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public InterfaceC2027 mo1261(C2136 c2136) {
        return C3555.f11150;
    }

    @Override // p000.InterfaceC1985
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public boolean mo1264(MenuC1975 menuC1975) {
        return false;
    }

    @Override // p000.InterfaceC1794
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo755(InterfaceC1798 interfaceC1798) {
    }

    @Override // p000.InterfaceC1985
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo1243(MenuC1975 menuC1975, boolean z) {
    }

    @Override // p000.InterfaceC2634
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public InterfaceC2624 mo1460(InterfaceC2624 interfaceC2624, C2336 c2336) {
        return interfaceC2624;
    }
}
