package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.widget.Toast;
import com.bumptech.glide.ComponentCallbacks2C0027;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲇᤞᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1467 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final float[][] f5211 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final float[][] f5212 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final float[] f5213 = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final float[][] f5214 = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0348 f5215 = new C0348(18);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m3261(AbstractC1351 abstractC1351) {
        int iM4965 = ((C2955) abstractC1351).m4965();
        return iM4965 == ((short) iM4965) ? AbstractC2902.m4900(iM4965) : AbstractC2902.m4901(iM4965);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m3262(AbstractC1351 abstractC1351) {
        int iM2561 = ((C2955) abstractC1351).f9480.m2561();
        return iM2561 == ((char) iM2561) ? AbstractC2902.m4906(iM2561) : AbstractC2902.m4907(iM2561);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static String m3263(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final byte m3264(char c) {
        if (c < '~') {
            return C0575.f2369[c];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static void m3265(int[] iArr, int i) {
        int i2 = i >> 5;
        iArr[i2] = (~(1 << (i & 31))) & iArr[i2];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static short m3266(int i, int i2) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((i2 & 255) == i2) {
            return (short) (i | (i2 << 8));
        }
        throw new IllegalArgumentException("high out of range 0..255");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static short m3267(int i, int i2, int i3, int i4) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("n0 out of range 0..15");
        }
        if ((i2 & 15) != i2) {
            throw new IllegalArgumentException("n1 out of range 0..15");
        }
        if ((i3 & 15) != i3) {
            throw new IllegalArgumentException("n2 out of range 0..15");
        }
        if ((i4 & 15) == i4) {
            return (short) (i | (i2 << 4) | (i3 << 8) | (i4 << 12));
        }
        throw new IllegalArgumentException("n3 out of range 0..15");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static long[] m3268(Serializable serializable) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static C2585 m3269(ComponentCallbacks2C0027 componentCallbacks2C0027, ArrayList arrayList) {
        InterfaceC2627 c0394;
        InterfaceC2627 c0505;
        Class cls;
        InterfaceC0399 interfaceC0399 = componentCallbacks2C0027.f589;
        C1893 c1893 = componentCallbacks2C0027.f592;
        C1472 c1472 = componentCallbacks2C0027.f591;
        Context applicationContext = c1472.getApplicationContext();
        C1477 c1477 = c1472.f5244;
        C2585 c2585 = new C2585();
        C0993 c0993 = new C0993();
        C1210 c1210 = c2585.f8217;
        synchronized (c1210) {
            c1210.f4345.add(c0993);
        }
        int i = Build.VERSION.SDK_INT;
        C1254 c1254 = new C1254();
        C1210 c1211 = c2585.f8217;
        synchronized (c1211) {
            c1211.f4345.add(c1254);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListM4580 = c2585.m4580();
        C0508 c0508 = new C0508(applicationContext, arrayListM4580, interfaceC0399, c1893);
        C3612 c3612 = new C3612(interfaceC0399, new C3610());
        C1104 c1104 = new C1104(c2585.m4580(), resources.getDisplayMetrics(), interfaceC0399, c1893);
        if (i < 28 || !c1477.f5263.containsKey(AbstractC1467.class)) {
            C0504 c0504 = new C0504(c1104, 0);
            c0394 = new C0394(c1104, 2, c1893);
            c0505 = c0504;
        } else {
            C0505 c0506 = new C0505(1);
            c0505 = new C0505(0);
            c0394 = c0506;
        }
        if (i >= 28) {
            int i2 = 1;
            c2585.m4579("Animation", InputStream.class, Drawable.class, new C0167(new C0519(arrayListM4580, i2, c1893), i2));
            c2585.m4579("Animation", ByteBuffer.class, Drawable.class, new C0167(new C0519(arrayListM4580, 1, c1893), 0));
        }
        C2629 c2629 = new C2629(applicationContext);
        C0396 c0396 = new C0396(c1893);
        C0383 c0383 = new C0383((byte) 0, 1);
        C1224 c1224 = new C1224(13);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        c2585.m4576(ByteBuffer.class, new C0348(10));
        c2585.m4576(InputStream.class, new C1681(c1893));
        c2585.m4579("Bitmap", ByteBuffer.class, Bitmap.class, c0505);
        c2585.m4579("Bitmap", InputStream.class, Bitmap.class, c0394);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls = ParcelFileDescriptor.class;
        } else {
            cls = ParcelFileDescriptor.class;
            c2585.m4579("Bitmap", cls, Bitmap.class, new C0504(c1104, 1));
        }
        c2585.m4579("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C3612(interfaceC0399, new C2135(27)));
        c2585.m4579("Bitmap", cls, Bitmap.class, c3612);
        C1139 c1139 = C1139.f4228;
        c2585.m4578(Bitmap.class, Bitmap.class, c1139);
        c2585.m4579("Bitmap", Bitmap.class, Bitmap.class, new C1320(1));
        c2585.m4577(Bitmap.class, c0396);
        c2585.m4579("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0394(resources, c0505));
        c2585.m4579("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0394(resources, c0394));
        c2585.m4579("BitmapDrawable", cls, BitmapDrawable.class, new C0394(resources, c3612));
        c2585.m4577(BitmapDrawable.class, new C0519(interfaceC0399, 5, c0396));
        c2585.m4579("Animation", InputStream.class, C1454.class, new C2886(arrayListM4580, c0508, c1893));
        c2585.m4579("Animation", ByteBuffer.class, C1454.class, c0508);
        c2585.m4577(C1454.class, new C1224(14));
        c2585.m4578(C2866.class, C2866.class, c1139);
        c2585.m4579("Bitmap", C2866.class, Bitmap.class, new C0397(interfaceC0399));
        c2585.m4579("legacy_append", Uri.class, Drawable.class, c2629);
        c2585.m4579("legacy_append", Uri.class, Bitmap.class, new C0394(c2629, 1, interfaceC0399));
        c2585.m4583(new C0509(0));
        c2585.m4578(File.class, ByteBuffer.class, new C0348(11));
        c2585.m4578(File.class, InputStream.class, new C1327(new C1224(8)));
        c2585.m4579("legacy_append", File.class, File.class, new C1320(0));
        c2585.m4578(File.class, cls, new C1327(new C1224(7)));
        c2585.m4578(File.class, File.class, c1139);
        c2585.m4583(new C1658(c1893));
        if (!"robolectric".equals(str)) {
            c2585.m4583(new C0509(2));
        }
        C1047 c1047 = new C1047(applicationContext, 2);
        C1047 c1048 = new C1047(applicationContext, 0);
        C1047 c1049 = new C1047(applicationContext, 1);
        Class cls2 = Integer.TYPE;
        c2585.m4578(cls2, InputStream.class, c1047);
        c2585.m4578(Integer.class, InputStream.class, c1047);
        c2585.m4578(cls2, AssetFileDescriptor.class, c1048);
        c2585.m4578(Integer.class, AssetFileDescriptor.class, c1048);
        c2585.m4578(cls2, Drawable.class, c1049);
        c2585.m4578(Integer.class, Drawable.class, c1049);
        c2585.m4578(Uri.class, InputStream.class, new C1047(applicationContext, 9));
        c2585.m4578(Uri.class, AssetFileDescriptor.class, new C1047(applicationContext, 8));
        C0395 c0395 = new C0395(resources, 3);
        C0395 c0397 = new C0395(resources, 1);
        C0395 c0398 = new C0395(resources, 2);
        c2585.m4578(Integer.class, Uri.class, c0395);
        c2585.m4578(cls2, Uri.class, c0395);
        c2585.m4578(Integer.class, AssetFileDescriptor.class, c0397);
        c2585.m4578(cls2, AssetFileDescriptor.class, c0397);
        c2585.m4578(Integer.class, InputStream.class, c0398);
        c2585.m4578(cls2, InputStream.class, c0398);
        c2585.m4578(String.class, InputStream.class, new C0102(13));
        c2585.m4578(Uri.class, InputStream.class, new C0102(13));
        c2585.m4578(String.class, InputStream.class, new C2135(18));
        c2585.m4578(String.class, cls, new C2135(17));
        c2585.m4578(String.class, AssetFileDescriptor.class, new C2135(16));
        c2585.m4578(Uri.class, InputStream.class, new C0283(applicationContext.getAssets(), 1));
        c2585.m4578(Uri.class, AssetFileDescriptor.class, new C0283(applicationContext.getAssets(), 0));
        c2585.m4578(Uri.class, InputStream.class, new C1047(applicationContext, 6));
        c2585.m4578(Uri.class, InputStream.class, new C1047(applicationContext, 7));
        if (i >= 29) {
            c2585.m4578(Uri.class, InputStream.class, new C2493(applicationContext, InputStream.class));
            c2585.m4578(Uri.class, cls, new C2493(applicationContext, cls));
        }
        boolean zContainsKey = c1477.f5263.containsKey(AbstractC1471.class);
        c2585.m4578(Uri.class, InputStream.class, new C3571(contentResolver, zContainsKey, 2));
        c2585.m4578(Uri.class, cls, new C3571(contentResolver, zContainsKey, 1));
        c2585.m4578(Uri.class, AssetFileDescriptor.class, new C3571(contentResolver, zContainsKey, 0));
        c2585.m4578(Uri.class, InputStream.class, new C2135(24));
        c2585.m4578(URL.class, InputStream.class, new C2135(23));
        c2585.m4578(Uri.class, File.class, new C1047(applicationContext, 5));
        c2585.m4578(C1479.class, InputStream.class, new C0102(26));
        c2585.m4578(byte[].class, ByteBuffer.class, new C0348(7));
        c2585.m4578(byte[].class, InputStream.class, new C0348(9));
        c2585.m4578(Uri.class, Uri.class, c1139);
        c2585.m4578(Drawable.class, Drawable.class, c1139);
        c2585.m4579("legacy_append", Drawable.class, Drawable.class, new C1320(2));
        c2585.m4584(Bitmap.class, BitmapDrawable.class, new C0395(resources, 0));
        c2585.m4584(Bitmap.class, byte[].class, c0383);
        c2585.m4584(Drawable.class, byte[].class, new C0253(interfaceC0399, c0383, c1224, 7));
        c2585.m4584(C1454.class, byte[].class, c1224);
        C3612 c3613 = new C3612(interfaceC0399, new C2135(28));
        c2585.m4579("legacy_append", ByteBuffer.class, Bitmap.class, c3613);
        c2585.m4579("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0394(resources, c3613));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC1095.m2792(it);
        }
        return c2585;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static int m3270(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = i & 31;
        int i3 = i >> 5;
        while (true) {
            if (i3 >= length) {
                return -1;
            }
            int i4 = iArr[i3];
            if (i4 != 0) {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros((~((1 << i2) - 1)) & i4);
                int i5 = iNumberOfTrailingZeros != 32 ? iNumberOfTrailingZeros : -1;
                if (i5 >= 0) {
                    return (i3 << 5) + i5;
                }
            }
            i3++;
            i2 = 0;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static boolean m3271(int[] iArr, int i) {
        return (iArr[i >> 5] & (1 << (i & 31))) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final int m3272(InterfaceC2715 interfaceC2715, AbstractC1725 abstractC1725, String str) {
        C1732 c1732 = abstractC1725.f5842;
        m3281(abstractC1725, interfaceC2715);
        int iMo3639 = interfaceC2715.mo3639(str);
        if (iMo3639 != -3 || !abstractC1725.f5842.f5865) {
            return iMo3639;
        }
        C0102 c0102 = abstractC1725.f5844;
        C0310 c0310 = new C0310(interfaceC2715, 3, abstractC1725);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0102.f1117;
        Map map = (Map) concurrentHashMap.get(interfaceC2715);
        C0348 c0348 = f5215;
        Object obj = map != null ? map.get(c0348) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = c0310.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC2715);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC2715, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c0348, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final boolean m3273(AbstractC1725 abstractC1725, InterfaceC2715 interfaceC2715) {
        if (abstractC1725.f5842.f5860) {
            return true;
        }
        List annotations = interfaceC2715.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC1742) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static int m3274(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f5213;
        return AbstractC0747.m2322(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static boolean m3275(C2582 c2582) {
        int length = c2582.f4833.length;
        if (length < 2) {
            return true;
        }
        int iM4562 = ((C2581) c2582.m3165(0)).f8205;
        for (int i = 0; i < length; i++) {
            C2581 c2581 = (C2581) c2582.m3165(i);
            if (c2581.f8205 != iM4562) {
                return false;
            }
            iM4562 += c2581.m4562();
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static float m3276(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static String m3277(AbstractC0908 abstractC0908, int i) {
        StringBuilder sb = new StringBuilder(20);
        sb.append("#");
        long jMo2541 = abstractC0908 instanceof AbstractC0907 ? ((AbstractC0907) abstractC0908).f3372 : abstractC0908.mo2541();
        if (i == 4) {
            sb.append(new String(new char[]{Character.forDigit(((int) jMo2541) & 15, 16)}));
        } else if (i == 8) {
            sb.append(AbstractC2902.m4905((int) jMo2541));
        } else if (i == 16) {
            sb.append(AbstractC2902.m4906((int) jMo2541));
        } else if (i == 32) {
            sb.append(AbstractC2902.m4907((int) jMo2541));
        } else {
            if (i != 64) {
                throw new RuntimeException("shouldn't happen");
            }
            sb.append(AbstractC2902.m4908(jMo2541));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static String m3278(AbstractC0908 abstractC0908) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (abstractC0908 instanceof C0905) {
            sb.append("null");
        } else {
            sb.append(abstractC0908.mo2371());
            sb.append(' ');
            sb.append(abstractC0908.mo1360());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static int[] m3279(int i) {
        return new int[(i + 31) >> 5];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static int m3280(int i, int i2) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("low out of range 0..15");
        }
        if ((i2 & 15) == i2) {
            return i | (i2 << 4);
        }
        throw new IllegalArgumentException("high out of range 0..15");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static final void m3281(AbstractC1725 abstractC1725, InterfaceC2715 interfaceC2715) {
        if (AbstractC1469.m3322(interfaceC2715.mo3640(), C2911.f9280)) {
            C1732 c1732 = abstractC1725.f5842;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static short m3282(AbstractC0953 abstractC0953, int i) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("arg out of range 0..255");
        }
        int i2 = abstractC0953.f3483.f3937;
        if ((i2 & 255) == i2) {
            return (short) (i2 | (i << 8));
        }
        throw new IllegalArgumentException("opcode out of range 0..255");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static void m3283(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                m3292(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                m3292(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m3292(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m3292(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static final Object m3284(Object obj) {
        return obj instanceof C0757 ? new C2641(((C0757) obj).f2861) : obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public static String m3285(C2582 c2582) {
        int length = c2582.f4833.length;
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        sb.append('{');
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(((C2581) c2582.m3165(i)).m4564());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public static String m3286(C2582 c2582) {
        int length = c2582.f4833.length;
        StringBuilder sb = new StringBuilder(30);
        sb.append("{");
        if (length != 0) {
            if (length != 1) {
                C2581 c2581M4566 = (C2581) c2582.m3165(length - 1);
                if (c2581M4566.m4562() == 2) {
                    c2581M4566 = c2581M4566.m4566(c2581M4566.f8205 + 1);
                }
                sb.append(((C2581) c2582.m3165(0)).m4564());
                sb.append("..");
                sb.append(c2581M4566.m4564());
            } else {
                sb.append(((C2581) c2582.m3165(0)).m4564());
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public static void m3287(int[] iArr, int i) {
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public static void m3288(Context context, int i, String str) {
        if (!AbstractC1469.m3322(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("Not allowed to show a toast from non-main thread, if you must do this, please set allowBackground to true.");
        }
        Toast.makeText(context, str, 0).show();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public static final InterfaceC2774 m3289(Socket socket) {
        Logger logger = AbstractC2305.f7492;
        C2842 c2842 = new C2842(socket);
        return c2842.sink(new C0288(socket.getOutputStream(), 1, c2842));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public static C0288 m3290(File file) {
        Logger logger = AbstractC2305.f7492;
        return new C0288(new FileOutputStream(file, false), 1, new C3459());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public static final InterfaceC2846 m3291(Socket socket) {
        Logger logger = AbstractC2305.f7492;
        C2842 c2842 = new C2842(socket);
        return c2842.source(new C0289(socket.getInputStream(), 1, c2842));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public static void m3292(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(AbstractC1095.m2797(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public static final String m3293(byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        return b == 127 ? "invalid token" : "valid token";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public static boolean m3294(int i) {
        return i == (i & 255);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public static boolean m3295(int i) {
        return i == (i & 15);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public static boolean m3296(int i) {
        return i == (65535 & i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public static float m3297() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public boolean mo3216(C2955 c2955) {
        return this instanceof C1405;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract int mo1791(View view, int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public abstract int mo1792(View view, int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public abstract int mo3217();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public BitSet mo3218(AbstractC0953 abstractC0953) {
        return new BitSet();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public int mo1793(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public int mo1794() {
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public abstract String mo3219(AbstractC1351 abstractC1351);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public abstract String mo3220(AbstractC1351 abstractC1351);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public abstract boolean mo3221(AbstractC0953 abstractC0953);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public abstract void mo2551();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public abstract void mo2552();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public abstract void mo1795(int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public abstract void mo1796(View view, int i, int i2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ */
    public abstract void mo1797(View view, float f, float f2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public abstract boolean mo1798(View view, int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ */
    public abstract void mo3222(C0496 c0496, AbstractC1351 abstractC1351);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public void mo3298(View view, int i) {
    }
}
