package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.alibaba.fastjson2.JSONWriter;
import dalvik.system.InMemoryDexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲇᲀᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1469 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final int[] f5220 = new int[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Object[] f5221 = new Object[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final int[] f5222 = {R.attr.theme, me.hd.wauxv.R.attr.theme};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f5223 = {me.hd.wauxv.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static boolean f5224 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m3320(C0102 c0102, C0561 c0561, C0561 c0562, C1026 c1026, String str, byte[] bArr) {
        C1046 c1046 = new C1046(str, bArr);
        c1046.f3813 = C1139.f4225;
        try {
            C0697 c0697M4219 = AbstractC2235.m4219(c0102, c1046, c0561, c0562, c1026);
            C0525 c0525 = c1026.f3753;
            TreeMap treeMap = c0525.f2217;
            try {
                C3505 c3505 = c0697M4219.f2664.f3408;
                c0525.m4672();
                if (treeMap.get(c3505) == null) {
                    treeMap.put(c3505, c0697M4219);
                } else {
                    throw new IllegalArgumentException("already added: " + c3505);
                }
            } catch (NullPointerException unused) {
                throw new NullPointerException("clazz == null");
            }
        } catch (RuntimeException e) {
            throw C1240.m3003("...while processing " + c1046.f3802, e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static int m3321(C0102 c0102, C0561 c0561, C0561 c0562, C1026 c1026, FileInputStream fileInputStream) throws IOException {
        C0102 c0103;
        C0561 c0563;
        C0561 c0564;
        C1026 c1027;
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
                        c0103 = c0102;
                        c0563 = c0561;
                        c0564 = c0562;
                        c1027 = c1026;
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
                        c0103 = c0102;
                        c0563 = c0561;
                        c0564 = c0562;
                        c1027 = c1026;
                        m3320(c0103, c0563, c0564, c1027, name, byteArrayOutputStream.toByteArray());
                        i++;
                    }
                    c0102 = c0103;
                    c0561 = c0563;
                    c0562 = c0564;
                    c1026 = c1027;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean m3322(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final int m3323(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final int m3324(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m3325(long j, C0481 c0481, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((C0516) arrayList4.get(i8)).mo1964() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0516 c0516 = (C0516) arrayList.get(i2);
        C0516 c0517 = (C0516) arrayList4.get(i3 - 1);
        if (i7 == c0516.mo1964()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            C0516 c0518 = (C0516) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            c0516 = c0518;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c0516.mo1967(i7) == c0517.mo1967(i7)) {
            int iMin = Math.min(c0516.mo1964(), c0517.mo1964());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && c0516.mo1967(i11) == c0517.mo1967(i11); i11++) {
                i10++;
            }
            long j3 = 4;
            long j4 = (c0481.f2128 / j3) + j + ((long) 2) + ((long) i10) + 1;
            c0481.m1893(-i10);
            c0481.m1893(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                c0481.m1893(c0516.mo1967(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 != ((C0516) arrayList4.get(i4)).mo1964()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0481.m1893(((Number) arrayList5.get(i4)).intValue());
                return;
            } else {
                C0481 c0482 = new C0481();
                c0481.m1893(((int) ((c0482.f2128 / j3) + j4)) * (-1));
                m3325(j4, c0482, i12, arrayList4, i4, i3, arrayList5);
                c0481.mo1863(c0482);
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((C0516) arrayList4.get(i14 - 1)).mo1967(i7) != ((C0516) arrayList4.get(i14)).mo1967(i7)) {
                i13++;
            }
        }
        long j5 = 4;
        long j6 = (c0481.f2128 / j5) + j + ((long) 2) + ((long) (i13 * 2));
        c0481.m1893(i13);
        c0481.m1893(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iMo1967 = ((C0516) arrayList4.get(i15)).mo1967(i7);
            if (i15 == i4 || iMo1967 != ((C0516) arrayList4.get(i15 - 1)).mo1967(i7)) {
                c0481.m1893(iMo1967 & 255);
            }
        }
        C0481 c0483 = new C0481();
        int i16 = i4;
        while (i16 < i3) {
            byte bMo1967 = ((C0516) arrayList4.get(i16)).mo1967(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bMo1967 != ((C0516) arrayList4.get(i18)).mo1967(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((C0516) arrayList4.get(i16)).mo1964()) {
                c0481.m1893(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
            } else {
                c0481.m1893(((int) ((c0483.f2128 / j5) + j6)) * (-1));
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
                m3325(j2, c0483, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j6 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        c0481.mo1863(c0483);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static void m3326(SharedPreferencesC1271 sharedPreferencesC1271) {
        if (sharedPreferencesC1271.f4630 == 0) {
            try {
                m3343(sharedPreferencesC1271, sharedPreferencesC1271.f4627);
                m3343(sharedPreferencesC1271, sharedPreferencesC1271.f4628);
            } catch (Exception unused) {
                m3352(sharedPreferencesC1271);
            }
        }
        m3344(sharedPreferencesC1271);
        AbstractC3744.m5332(new File(sharedPreferencesC1271.f4607 + sharedPreferencesC1271.f4608));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static int m3327(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static InMemoryDexClassLoader m3328(String str, byte[] bArr, ClassLoader classLoader) throws IOException {
        C0561 c0561 = new C0561(1);
        C0561 c0562 = new C0561(0);
        C0102 c0102 = new C0102(19);
        String strM4782 = AbstractC2844.m4782(str.replace('.', '/'), ".class");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C1026 c1026 = new C1026(c0561);
            m3320(c0102, c0562, c0561, c1026, strM4782, bArr);
            c1026.m2720(byteArrayOutputStream);
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static InMemoryDexClassLoader m3329(ClassLoader classLoader, String str) throws IOException {
        C0561 c0561 = new C0561(1);
        C0561 c0562 = new C0561(0);
        C0102 c0102 = new C0102(19);
        C1026 c1026 = new C1026(c0561);
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            int iM3321 = m3321(c0102, c0562, c0561, c1026, fileInputStream);
            fileInputStream.close();
            if (iM3321 == 0) {
                throw new IOException(AbstractC2844.m4790("No class file found in jar ", str));
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c1026.m2720(byteArrayOutputStream);
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static void m3330(SharedPreferencesC1271 sharedPreferencesC1271, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            MappedByteBuffer mappedByteBufferM3342 = m3342(mappedByteBuffer2 == sharedPreferencesC1271.f4628 ? sharedPreferencesC1271.f4626 : sharedPreferencesC1271.f4625, mappedByteBuffer.capacity());
            if (mappedByteBufferM3342 == null) {
                Log.e("FastKV", sharedPreferencesC1271.f4608, new Exception("map failed"));
                m3352(sharedPreferencesC1271);
                return;
            } else {
                if (mappedByteBuffer2 == sharedPreferencesC1271.f4628) {
                    sharedPreferencesC1271.f4628 = mappedByteBufferM3342;
                } else {
                    sharedPreferencesC1271.f4627 = mappedByteBufferM3342;
                }
                mappedByteBuffer2 = mappedByteBufferM3342;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static void m3331(SharedPreferencesC1271 sharedPreferencesC1271) {
        String str = sharedPreferencesC1271.f4608;
        String str2 = sharedPreferencesC1271.f4607;
        try {
            AbstractC3744.m5332(new File(str2, str + ".kvc"));
            AbstractC3744.m5332(new File(str2, str + ".tmp"));
        } catch (Exception e) {
            Log.e("FastKV", str, e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static byte[] m3332(SharedPreferencesC1271 sharedPreferencesC1271, C0822 c0822, C0378 c0378) {
        String str = sharedPreferencesC1271.f4608;
        try {
            byte[] bArrM5334 = AbstractC3744.m5334(new File(sharedPreferencesC1271.f4607 + str, (String) c0822.f3233));
            if (bArrM5334 != null) {
                return c0378 != null ? c0378.m1698(bArrM5334) : bArrM5334;
            }
            return null;
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static ColorStateList m3333(Context context, int i) {
        ColorStateList colorStateListM2320;
        ColorStateList colorStateList;
        C2635 c2635;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C2636 c2636 = new C2636(resources, theme);
        synchronized (AbstractC2638.f8342) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC2638.f8341.get(c2636);
                colorStateListM2320 = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c2635 = (C2635) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (c2635.f8333.equals(resources.getConfiguration())) {
                        if (theme != null || c2635.f8334 != 0) {
                            if (theme == null || c2635.f8334 != theme.hashCode()) {
                            }
                        }
                        colorStateList = c2635.f8332;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC2638.f8340;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM2320 = AbstractC0746.m2320(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListM2320 == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (AbstractC2638.f8342) {
            try {
                WeakHashMap weakHashMap = AbstractC2638.f8341;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(c2636);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(c2636, sparseArray2);
                }
                sparseArray2.append(i, new C2635(colorStateListM2320, c2636.f8335.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListM2320;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static int m3334(int i, int i2) {
        if (i2 >= 268435456) {
            throw new IllegalStateException("data size out of limit");
        }
        int i3 = SharedPreferencesC1271.f4606;
        if (i2 <= i3) {
            return i3;
        }
        while (i < i2) {
            i <<= 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static LinkedHashSet m3335(SharedPreferencesC1271 sharedPreferencesC1271, C0829 c0829, C0378 c0378) {
        String str = sharedPreferencesC1271.f4608;
        try {
            byte[] bArrM5334 = AbstractC3744.m5334(new File(sharedPreferencesC1271.f4607 + str, (String) c0829.f3233));
            if (bArrM5334 == null) {
                Log.w("FastKV", str, new Exception("Read object data failed"));
                return null;
            }
            if (c0378 != null) {
                bArrM5334 = c0378.m1698(bArrM5334);
            }
            int i = bArrM5334[0] & 255;
            String strM1405 = sharedPreferencesC1271.f4615.m1405(1, i, bArrM5334);
            C2900 c2900 = (C2900) sharedPreferencesC1271.f4609.get(strM1405);
            if (c2900 == null) {
                Log.w("FastKV", str, new Exception("No encoder for tag:".concat(strM1405)));
                return null;
            }
            c0829.f3232 = c2900;
            int i2 = i + 1;
            return c2900.m4859(i2, bArrM5334.length - i2, bArrM5334);
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static String m3336(SharedPreferencesC1271 sharedPreferencesC1271, C0830 c0830, C0378 c0378) {
        String str = sharedPreferencesC1271.f4608;
        try {
            byte[] bArrM5334 = AbstractC3744.m5334(new File(sharedPreferencesC1271.f4607 + str, (String) c0830.f3233));
            if (bArrM5334 == null) {
                return null;
            }
            if (c0378 != null) {
                bArrM5334 = c0378.m1698(bArrM5334);
            }
            return new String(bArrM5334, StandardCharsets.UTF_8);
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static void m3337(SharedPreferencesC1271 sharedPreferencesC1271) {
        long j;
        String str = sharedPreferencesC1271.f4607;
        StringBuilder sb = new StringBuilder();
        String str2 = sharedPreferencesC1271.f4608;
        File file = new File(str, AbstractC2844.m4786(sb, str2, ".kva"));
        File file2 = new File(str, AbstractC2844.m4782(str2, ".kvb"));
        try {
            if (AbstractC3744.m5337(file) && AbstractC3744.m5337(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                sharedPreferencesC1271.f4625 = randomAccessFile.getChannel();
                sharedPreferencesC1271.f4626 = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = sharedPreferencesC1271.f4625;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : SharedPreferencesC1271.f4606);
                    sharedPreferencesC1271.f4627 = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    FileChannel fileChannel2 = sharedPreferencesC1271.f4626;
                    if (length2 > 0) {
                        j = length2;
                    } else {
                        j = SharedPreferencesC1271.f4606;
                        fileChannel2 = fileChannel2;
                    }
                    MappedByteBuffer map2 = fileChannel2.map(mapMode, 0L, j);
                    sharedPreferencesC1271.f4628 = map2;
                    map2.order(byteOrder);
                    sharedPreferencesC1271.f4615 = new C0231(sharedPreferencesC1271.f4627.capacity());
                    if (length == 0 && length2 == 0) {
                        sharedPreferencesC1271.f4611 = 12;
                        return;
                    } else {
                        m3341(sharedPreferencesC1271, length, length2);
                        return;
                    }
                } catch (IOException e) {
                    Log.e("FastKV", str2, e);
                    m3352(sharedPreferencesC1271);
                    m3353(sharedPreferencesC1271, file, file2);
                    return;
                }
            }
            Log.e("FastKV", str2, new Exception("open file failed"));
            m3352(sharedPreferencesC1271);
        } catch (Exception e2) {
            Log.e("FastKV", str2, e2);
            m3344(sharedPreferencesC1271);
            m3352(sharedPreferencesC1271);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static boolean m3338(SharedPreferencesC1271 sharedPreferencesC1271) {
        String str = sharedPreferencesC1271.f4607;
        StringBuilder sb = new StringBuilder();
        String str2 = sharedPreferencesC1271.f4608;
        File file = new File(str, AbstractC2844.m4786(sb, str2, ".kvc"));
        File file2 = new File(str, AbstractC2844.m4782(str2, ".tmp"));
        boolean z = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!m3339(sharedPreferencesC1271, file)) {
                    m3344(sharedPreferencesC1271);
                    m3331(sharedPreferencesC1271);
                    return false;
                }
                if (sharedPreferencesC1271.f4630 == 0) {
                    if (!m3355(sharedPreferencesC1271, sharedPreferencesC1271.f4615)) {
                        sharedPreferencesC1271.f4630 = 1;
                        return false;
                    }
                    AbstractC1272.m3100(sharedPreferencesC1271, "recover from c file");
                    try {
                        m3331(sharedPreferencesC1271);
                        return true;
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        Log.e("FastKV", str2, e);
                        return z;
                    }
                }
            } else if (sharedPreferencesC1271.f4630 != 0) {
                File file3 = new File(str, str2 + ".kva");
                File file4 = new File(str, str2 + ".kvb");
                if (file3.exists() && file4.exists()) {
                    m3353(sharedPreferencesC1271, file3, file4);
                }
            }
            return false;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static boolean m3339(SharedPreferencesC1271 sharedPreferencesC1271, File file) {
        long length = file.length();
        if (length != 0 && length < JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN) {
            int i = (int) length;
            int iM3334 = m3334(SharedPreferencesC1271.f4606, i);
            C0231 c0231 = sharedPreferencesC1271.f4615;
            if (c0231 == null || ((byte[]) c0231.f1427).length != iM3334) {
                c0231 = new C0231(0, new byte[iM3334]);
                sharedPreferencesC1271.f4615 = c0231;
            } else {
                c0231.f1425 = 0;
            }
            AbstractC3744.m5339(file, (byte[]) c0231.f1427, i);
            int iM1409 = c0231.m1409();
            if (iM1409 >= 0) {
                int i2 = (-1073741825) & iM1409;
                boolean z = (iM1409 & 1073741824) != 0;
                long jM1411 = c0231.m1411(c0231.f1425);
                c0231.f1425 += 8;
                sharedPreferencesC1271.f4611 = i2 + 12;
                if (i2 >= 0 && i2 <= i - 12 && jM1411 == c0231.m1407(12, i2) && C1787.m3672(sharedPreferencesC1271, z)) {
                    sharedPreferencesC1271.f4612 = jM1411;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static C2335 m3340(C0516... c0516Arr) {
        int i;
        int i2 = 0;
        if (c0516Arr.length == 0) {
            return new C2335(new C0516[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new C0263(c0516Arr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(c0516Arr.length);
        for (C0516 c0516 : c0516Arr) {
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] objArrCopyOf = Arrays.copyOf(numArr, numArr.length);
        ArrayList arrayList3 = objArrCopyOf.length == 0 ? new ArrayList() : new ArrayList(new C0263(objArrCopyOf, true));
        int length = c0516Arr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            C0516 c0517 = c0516Arr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException(AbstractC1095.m2795(size, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i6 = size - 1;
            int i7 = 0;
            while (true) {
                if (i7 > i6) {
                    i = -(i7 + 1);
                    break;
                }
                i = (i7 + i6) >>> 1;
                int iM3095 = AbstractC1272.m3095((Comparable) arrayList.get(i), c0517);
                if (iM3095 >= 0) {
                    if (iM3095 <= 0) {
                        break;
                    }
                    i6 = i - 1;
                } else {
                    i7 = i + 1;
                }
            }
            arrayList3.set(i, Integer.valueOf(i4));
            i3++;
            i4 = i5;
        }
        if (((C0516) arrayList.get(0)).mo1964() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            C0516 c0518 = (C0516) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                C0516 c0519 = (C0516) arrayList.get(i10);
                c0519.getClass();
                if (!c0519.mo1968(c0518, c0518.mo1964())) {
                    break;
                }
                if (c0519.mo1964() == c0518.mo1964()) {
                    throw new IllegalArgumentException(("duplicate option: " + c0519).toString());
                }
                if (((Number) arrayList3.get(i10)).intValue() > ((Number) arrayList3.get(i8)).intValue()) {
                    arrayList.remove(i10);
                    arrayList3.remove(i10);
                } else {
                    i10++;
                }
            }
            i8 = i9;
        }
        C0481 c0481 = new C0481();
        m3325(0L, c0481, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (c0481.f2128 / ((long) 4))];
        while (!c0481.mo1860()) {
            iArr[i2] = c0481.readInt();
            i2++;
        }
        return new C2335((C0516[]) Arrays.copyOf(c0516Arr, c0516Arr.length), iArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static void m3341(SharedPreferencesC1271 sharedPreferencesC1271, long j, long j2) {
        long j3;
        MappedByteBuffer mappedByteBuffer = sharedPreferencesC1271.f4627;
        String str = sharedPreferencesC1271.f4608;
        int i = mappedByteBuffer.getInt();
        int i2 = i & (-1073741825);
        boolean z = (i & 1073741824) != 0;
        long j4 = sharedPreferencesC1271.f4627.getLong();
        int i3 = sharedPreferencesC1271.f4628.getInt();
        int i4 = (-1073741825) & i3;
        boolean z2 = (1073741824 & i3) != 0;
        long j5 = sharedPreferencesC1271.f4628.getLong();
        if (i2 < 0) {
            j3 = 12;
        } else if (i2 <= j - 12) {
            sharedPreferencesC1271.f4611 = i2 + 12;
            sharedPreferencesC1271.f4627.rewind();
            j3 = 12;
            sharedPreferencesC1271.f4627.get((byte[]) sharedPreferencesC1271.f4615.f1427, 0, sharedPreferencesC1271.f4611);
            if (j4 == sharedPreferencesC1271.f4615.m1407(12, i2) && C1787.m3672(sharedPreferencesC1271, z)) {
                sharedPreferencesC1271.f4612 = j4;
                if (j == j2) {
                    byte[] bArr = new byte[sharedPreferencesC1271.f4611];
                    sharedPreferencesC1271.f4628.rewind();
                    sharedPreferencesC1271.f4628.get(bArr, 0, sharedPreferencesC1271.f4611);
                    byte[] bArr2 = (byte[]) sharedPreferencesC1271.f4615.f1427;
                    for (int i5 = 0; i5 < sharedPreferencesC1271.f4611; i5++) {
                        if (bArr2[i5] == bArr[i5]) {
                        }
                    }
                    return;
                }
                Log.w("FastKV", str, new Exception("B file error"));
                m3330(sharedPreferencesC1271, sharedPreferencesC1271.f4627, sharedPreferencesC1271.f4628, sharedPreferencesC1271.f4611);
                return;
            }
        } else {
            j3 = 12;
        }
        if (i4 >= 0 && i4 <= j2 - j3) {
            sharedPreferencesC1271.f4613.clear();
            sharedPreferencesC1271.f4621 = 0;
            sharedPreferencesC1271.f4622.clear();
            sharedPreferencesC1271.f4611 = i4 + 12;
            if (((byte[]) sharedPreferencesC1271.f4615.f1427).length != sharedPreferencesC1271.f4628.capacity()) {
                sharedPreferencesC1271.f4615 = new C0231(sharedPreferencesC1271.f4628.capacity());
            }
            sharedPreferencesC1271.f4628.rewind();
            sharedPreferencesC1271.f4628.get((byte[]) sharedPreferencesC1271.f4615.f1427, 0, sharedPreferencesC1271.f4611);
            if (j5 == sharedPreferencesC1271.f4615.m1407(12, i4) && C1787.m3672(sharedPreferencesC1271, z2)) {
                Log.w("FastKV", str, new Exception("A file error"));
                m3330(sharedPreferencesC1271, sharedPreferencesC1271.f4628, sharedPreferencesC1271.f4627, sharedPreferencesC1271.f4611);
                sharedPreferencesC1271.f4612 = j5;
                return;
            }
        }
        AbstractC1272.m3097(sharedPreferencesC1271, "both files error");
        m3326(sharedPreferencesC1271);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static MappedByteBuffer m3342(FileChannel fileChannel, int i) {
        try {
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
            map.order(ByteOrder.LITTLE_ENDIAN);
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static void m3343(SharedPreferencesC1271 sharedPreferencesC1271, MappedByteBuffer mappedByteBuffer) throws IOException {
        MappedByteBuffer mappedByteBufferM3342;
        int iCapacity = mappedByteBuffer.capacity();
        int i = SharedPreferencesC1271.f4606;
        if (iCapacity != i) {
            FileChannel fileChannel = mappedByteBuffer == sharedPreferencesC1271.f4627 ? sharedPreferencesC1271.f4625 : sharedPreferencesC1271.f4626;
            try {
                fileChannel.truncate(i);
                mappedByteBufferM3342 = m3342(fileChannel, i);
            } catch (IOException unused) {
                mappedByteBufferM3342 = null;
            }
            if (mappedByteBufferM3342 == null) {
                throw new IOException("Failed to truncate and remap buffer");
            }
            if (mappedByteBuffer == sharedPreferencesC1271.f4627) {
                sharedPreferencesC1271.f4627 = mappedByteBufferM3342;
            } else {
                sharedPreferencesC1271.f4628 = mappedByteBufferM3342;
            }
            mappedByteBuffer = mappedByteBufferM3342;
        }
        mappedByteBuffer.putInt(0, sharedPreferencesC1271.f4610 != null ? 1073741824 : 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static void m3344(SharedPreferencesC1271 sharedPreferencesC1271) {
        sharedPreferencesC1271.f4611 = 12;
        sharedPreferencesC1271.f4612 = 0L;
        sharedPreferencesC1271.f4613.clear();
        sharedPreferencesC1271.f4621 = 0;
        sharedPreferencesC1271.f4622.clear();
        C0231 c0231 = sharedPreferencesC1271.f4615;
        if (c0231 == null || ((byte[]) c0231.f1427).length != SharedPreferencesC1271.f4606) {
            sharedPreferencesC1271.f4615 = new C0231(SharedPreferencesC1271.f4606);
        } else {
            c0231.m1421(4, 0L);
        }
        sharedPreferencesC1271.f4615.m1420(0, sharedPreferencesC1271.f4610 != null ? 1073741824 : 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static TypedValue m3345(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static boolean m3346(Context context, int i, boolean z) {
        TypedValue typedValueM3345 = m3345(context, i);
        if (typedValueM3345 == null || typedValueM3345.type != 18) {
            return z;
        }
        return typedValueM3345.data != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static TypedValue m3347(Context context, int i, String str) {
        TypedValue typedValueM3345 = m3345(context, i);
        if (typedValueM3345 != null) {
            return typedValueM3345;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00cf */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00d0, code lost:
    
        r0 = th;
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3348(SharedPreferencesC1271 sharedPreferencesC1271) throws Throwable {
        File[] fileArrListFiles;
        MappedByteBuffer mappedByteBuffer;
        C2900 c2900;
        C2900[] c2900Arr = (C2900[]) sharedPreferencesC1271.f4609.values().toArray(new C2900[sharedPreferencesC1271.f4609.size()]);
        String str = "temp_" + sharedPreferencesC1271.f4608;
        SharedPreferencesC1271 sharedPreferencesC1272 = new SharedPreferencesC1271(sharedPreferencesC1271.f4607, str, c2900Arr, sharedPreferencesC1271.f4610, 2);
        synchronized (sharedPreferencesC1272) {
            sharedPreferencesC1272.f4631 = false;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : sharedPreferencesC1271.f4613.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            AbstractC0823 abstractC0823 = null;
            if (value instanceof C0830) {
                C0830 c0830 = (C0830) value;
                if (c0830.f3236) {
                    arrayList.add((String) c0830.f3233);
                    String strM3336 = m3336(sharedPreferencesC1271, c0830, null);
                    if (strM3336 != null) {
                        sharedPreferencesC1272.putString(str2, strM3336);
                    }
                } else {
                    sharedPreferencesC1272.putString(str2, (String) c0830.f3233);
                }
            } else if (value instanceof C0824) {
                sharedPreferencesC1272.putBoolean(str2, ((C0824) value).f3227);
            } else if (value instanceof C0827) {
                sharedPreferencesC1272.putInt(str2, ((C0827) value).f3230);
            } else if (value instanceof C0828) {
                sharedPreferencesC1272.putLong(str2, ((C0828) value).f3231);
            } else if (value instanceof C0826) {
                sharedPreferencesC1272.putFloat(str2, ((C0826) value).f3229);
            } else if (value instanceof C0825) {
                double d = ((C0825) value).f3228;
                synchronized (sharedPreferencesC1272) {
                    SharedPreferencesC1271.m3075(str2);
                    AbstractC0823 abstractC0824 = (AbstractC0823) sharedPreferencesC1272.f4613.get(str2);
                    if (abstractC0824 == null || abstractC0824.mo2489() == 5) {
                        abstractC0823 = abstractC0824;
                    } else {
                        sharedPreferencesC1272.remove(str2);
                    }
                    C0825 c0825 = (C0825) abstractC0823;
                    if (c0825 == null) {
                        sharedPreferencesC1272.m3091(str2, (byte) 5, SharedPreferencesC1271.f4605[5]);
                        C0231 c0231 = sharedPreferencesC1272.f4615;
                        int i = c0231.f1425;
                        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
                        C0378 c0378 = sharedPreferencesC1272.f4610;
                        if (c0378 != null) {
                            jDoubleToRawLongBits ^= (long) c0378.f1873;
                        }
                        c0231.m1421(c0231.f1425, jDoubleToRawLongBits);
                        c0231.f1425 += 8;
                        sharedPreferencesC1272.m3087();
                        sharedPreferencesC1272.f4613.put(str2, new C0825(i, d));
                        sharedPreferencesC1272.m3079(str2);
                    } else if (c0825.f3228 != d) {
                        long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(d);
                        C0378 c0379 = sharedPreferencesC1272.f4610;
                        if (c0379 != null) {
                            jDoubleToRawLongBits2 ^= (long) c0379.f1873;
                        }
                        long jM1411 = sharedPreferencesC1272.f4615.m1411(c0825.f3226) ^ jDoubleToRawLongBits2;
                        c0825.f3228 = d;
                        SharedPreferencesC1271 sharedPreferencesC1273 = sharedPreferencesC1272;
                        try {
                            sharedPreferencesC1273.m3089(jDoubleToRawLongBits2, jM1411, c0825.f3226);
                            sharedPreferencesC1272 = sharedPreferencesC1273;
                            sharedPreferencesC1272.m3079(str2);
                        } catch (Throwable th) {
                            th = th;
                            sharedPreferencesC1272 = sharedPreferencesC1273;
                            while (true) {
                                Throwable th2 = th;
                                throw th2;
                            }
                        }
                    }
                }
            } else if (value instanceof C0822) {
                C0822 c0822 = (C0822) value;
                if (c0822.f3236) {
                    arrayList.add((String) c0822.f3233);
                    byte[] bArrM3332 = m3332(sharedPreferencesC1271, c0822, null);
                    if (bArrM3332 != null) {
                        sharedPreferencesC1272.m3082(str2, bArrM3332);
                    }
                } else {
                    sharedPreferencesC1272.m3082(str2, (byte[]) c0822.f3233);
                }
            } else if (value instanceof C0829) {
                C0829 c0829 = (C0829) value;
                if (c0829.f3236) {
                    arrayList.add((String) c0829.f3233);
                    LinkedHashSet linkedHashSetM3335 = m3335(sharedPreferencesC1271, c0829, null);
                    if (linkedHashSetM3335 != null && (c2900 = c0829.f3232) != null) {
                        sharedPreferencesC1272.m3083(str2, linkedHashSetM3335, c2900);
                    }
                } else {
                    C2900 c2901 = c0829.f3232;
                    if (c2901 != null) {
                        sharedPreferencesC1272.m3083(str2, c0829.f3233, c2901);
                    }
                }
            }
        }
        sharedPreferencesC1272.contains("");
        sharedPreferencesC1271.f4615 = sharedPreferencesC1272.f4615;
        sharedPreferencesC1271.f4612 = sharedPreferencesC1272.f4612;
        sharedPreferencesC1271.f4611 = sharedPreferencesC1272.f4611;
        sharedPreferencesC1271.f4621 = 0;
        sharedPreferencesC1271.f4622.clear();
        sharedPreferencesC1271.f4613.clear();
        sharedPreferencesC1271.f4613.putAll(sharedPreferencesC1272.f4613);
        C0231 c0232 = sharedPreferencesC1272.f4615;
        if (sharedPreferencesC1271.f4630 == 0) {
            int length = ((byte[]) c0232.f1427).length;
            MappedByteBuffer mappedByteBuffer2 = sharedPreferencesC1271.f4627;
            if (mappedByteBuffer2 != null && mappedByteBuffer2.capacity() == length && (mappedByteBuffer = sharedPreferencesC1271.f4628) != null && mappedByteBuffer.capacity() == length) {
                sharedPreferencesC1271.f4627.position(0);
                sharedPreferencesC1271.f4627.put((byte[]) c0232.f1427, 0, sharedPreferencesC1271.f4611);
                sharedPreferencesC1271.f4628.position(0);
                sharedPreferencesC1271.f4628.put((byte[]) c0232.f1427, 0, sharedPreferencesC1271.f4611);
            } else if (!m3355(sharedPreferencesC1271, c0232)) {
                sharedPreferencesC1271.f4630 = 1;
            }
        }
        if (sharedPreferencesC1271.f4630 != 0) {
            m3356(sharedPreferencesC1271);
        }
        File file = new File(sharedPreferencesC1271.f4607, str);
        String str3 = sharedPreferencesC1271.f4607 + sharedPreferencesC1271.f4608;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    AbstractC3744.m5338(file2, new File(str3, file2.getName()));
                } catch (Exception unused) {
                }
            }
        }
        AbstractC3744.m5332(file);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC3744.m5332(new File(str3, (String) it.next()));
        }
        sharedPreferencesC1271.f4619 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public static void m3349(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public static long m3350(int i, long j) {
        int i2 = (i & 7) << 3;
        return (j >>> (64 - i2)) | (j << i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public static void m3351(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3642.m5206(viewGroup, z);
        } else if (f5224) {
            try {
                AbstractC3642.m5206(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f5224 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public static void m3352(SharedPreferencesC1271 sharedPreferencesC1271) {
        sharedPreferencesC1271.f4630 = 1;
        AbstractC3744.m5326(sharedPreferencesC1271.f4625);
        AbstractC3744.m5326(sharedPreferencesC1271.f4626);
        sharedPreferencesC1271.f4625 = null;
        sharedPreferencesC1271.f4626 = null;
        sharedPreferencesC1271.f4627 = null;
        sharedPreferencesC1271.f4628 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public static void m3353(SharedPreferencesC1271 sharedPreferencesC1271, File file, File file2) {
        String str = sharedPreferencesC1271.f4608;
        try {
            if (m3339(sharedPreferencesC1271, file)) {
                return;
            }
        } catch (IOException e) {
            Log.w("FastKV", str, e);
        }
        m3344(sharedPreferencesC1271);
        try {
            if (m3339(sharedPreferencesC1271, file2)) {
                return;
            }
        } catch (IOException e2) {
            Log.w("FastKV", str, e2);
        }
        m3344(sharedPreferencesC1271);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public static Context m3354(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5223, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C0840) && ((C0840) context).f3251 == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0840 c0840 = new C0840(context);
        c0840.f3251 = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f5222);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0840.getTheme().applyStyle(resourceId2, true);
        }
        return c0840;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public static boolean m3355(SharedPreferencesC1271 sharedPreferencesC1271, C0231 c0231) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        String str = sharedPreferencesC1271.f4608;
        String str2 = sharedPreferencesC1271.f4607;
        try {
            int length = ((byte[]) c0231.f1427).length;
            File file = new File(str2, str + ".kva");
            File file2 = new File(str2, str + ".kvb");
            if (!AbstractC3744.m5337(file) || !AbstractC3744.m5337(file2)) {
                throw new Exception("open file failed");
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            long j = length;
            try {
                randomAccessFile.setLength(j);
                FileChannel channel = randomAccessFile.getChannel();
                sharedPreferencesC1271.f4625 = channel;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = channel.map(mapMode, 0L, j);
                sharedPreferencesC1271.f4627 = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                sharedPreferencesC1271.f4627.put((byte[]) c0231.f1427, 0, sharedPreferencesC1271.f4611);
                randomAccessFile2 = new RandomAccessFile(file2, "rw");
                try {
                    randomAccessFile2.setLength(j);
                    FileChannel channel2 = randomAccessFile2.getChannel();
                    sharedPreferencesC1271.f4626 = channel2;
                    MappedByteBuffer map2 = channel2.map(mapMode, 0L, j);
                    sharedPreferencesC1271.f4628 = map2;
                    map2.order(byteOrder);
                    sharedPreferencesC1271.f4628.put((byte[]) c0231.f1427, 0, sharedPreferencesC1271.f4611);
                    return true;
                } catch (Exception e) {
                    e = e;
                    AbstractC3744.m5326(randomAccessFile);
                    AbstractC3744.m5326(randomAccessFile2);
                    sharedPreferencesC1271.f4625 = null;
                    sharedPreferencesC1271.f4626 = null;
                    sharedPreferencesC1271.f4627 = null;
                    sharedPreferencesC1271.f4628 = null;
                    Log.e("FastKV", str, e);
                    return false;
                }
            } catch (Exception e2) {
                e = e2;
                randomAccessFile2 = null;
            }
        } catch (Exception e3) {
            e = e3;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public static boolean m3356(SharedPreferencesC1271 sharedPreferencesC1271) {
        String str = sharedPreferencesC1271.f4608;
        String str2 = sharedPreferencesC1271.f4607;
        try {
            File file = new File(str2, str + ".tmp");
            if (!AbstractC3744.m5337(file)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.setLength(sharedPreferencesC1271.f4611);
                randomAccessFile.write((byte[]) sharedPreferencesC1271.f4615.f1427, 0, sharedPreferencesC1271.f4611);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                File file2 = new File(str2, str + ".kvc");
                if (!(file.renameTo(file2) || ((!file2.exists() || file2.delete()) && file.renameTo(file2)))) {
                    Log.w("FastKV", str, new Exception("rename failed"));
                    return false;
                }
                ArrayList arrayList = sharedPreferencesC1271.f4618;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC1272.m3099().execute(new RunnableC1326(sharedPreferencesC1271, 0, (String) it.next()));
                    }
                    arrayList.clear();
                }
                return true;
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public void m3357(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC2637(i, 0, this));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public abstract boolean mo1096(AbstractFutureC0082 abstractFutureC0082, C0078 c0078);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public abstract boolean mo1097(AbstractFutureC0082 abstractFutureC0082, Object obj, Object obj2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public abstract boolean mo1098(AbstractFutureC0082 abstractFutureC0082, C0081 c0081, C0081 c0082);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public abstract int[] mo3358();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public abstract int mo3359(boolean z);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ */
    public abstract void mo1426(int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public abstract void mo1427(Typeface typeface);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public abstract AbstractC1468 mo3360();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public abstract void mo1099(C0081 c0081, C0081 c0082);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public abstract void mo1100(C0081 c0081, Thread thread);
}
