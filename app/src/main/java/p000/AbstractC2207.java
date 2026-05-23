package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤝᤞᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2207 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final String[] f7175 = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f7176 = {JSONB.Constants.BC_INT32_BYTE_MIN, 49, 53, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final byte[] f7177 = {JSONB.Constants.BC_INT32_BYTE_MIN, 49, JSONB.Constants.BC_INT32_BYTE_MIN, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final byte[] f7178 = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 57, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final byte[] f7179 = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 53, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final byte[] f7180 = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 49, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final byte[] f7181 = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 49, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final byte[] f7182 = {JSONB.Constants.BC_INT32_BYTE_MIN, JSONB.Constants.BC_INT32_BYTE_MIN, 50, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2009 m4086(Context context) {
        Resources resources;
        int i = C2009.f6692;
        if (context instanceof C2009) {
            throw new IllegalStateException("ModuleContextThemeWrapper already loaded");
        }
        C2009 c2009 = new C2009(context, R.style.AppTheme);
        boolean z = C3692.f11601;
        if (C3692.m5357() && (resources = c2009.getResources()) != null) {
            m4099(resources);
        }
        return c2009;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static boolean m4087(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static void m4088(SharedPreferencesC1269 sharedPreferencesC1269) {
        if (sharedPreferencesC1269.f4631 == 0) {
            try {
                m4107(sharedPreferencesC1269, sharedPreferencesC1269.f4628);
                m4107(sharedPreferencesC1269, sharedPreferencesC1269.f4629);
            } catch (Exception unused) {
                m4119(sharedPreferencesC1269);
            }
        }
        m4108(sharedPreferencesC1269);
        AbstractC2209.m4125(new File(sharedPreferencesC1269.f4608 + sharedPreferencesC1269.f4609));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static int m4089(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static Object[] m4090(Object[]... objArr) {
        if (objArr.length == 0) {
            throw new NullPointerException("There is no arrays to concat!");
        }
        if (objArr.length == 1) {
            return objArr[0];
        }
        int length = 0;
        for (Object[] objArr2 : objArr) {
            length += objArr2.length;
        }
        Object[] objArr3 = (Object[]) Array.newInstance(objArr[0].getClass().getComponentType(), length);
        int length2 = 0;
        for (Object[] objArr4 : objArr) {
            System.arraycopy(objArr4, 0, objArr3, length2, objArr4.length);
            length2 += objArr4.length;
        }
        return objArr3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m4091(SharedPreferencesC1269 sharedPreferencesC1269, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            MappedByteBuffer mappedByteBufferM4106 = m4106(mappedByteBuffer2 == sharedPreferencesC1269.f4629 ? sharedPreferencesC1269.f4627 : sharedPreferencesC1269.f4626, mappedByteBuffer.capacity());
            if (mappedByteBufferM4106 == null) {
                Log.e("FastKV", sharedPreferencesC1269.f4609, new Exception("map failed"));
                m4119(sharedPreferencesC1269);
                return;
            } else {
                if (mappedByteBuffer2 == sharedPreferencesC1269.f4629) {
                    sharedPreferencesC1269.f4629 = mappedByteBufferM4106;
                } else {
                    sharedPreferencesC1269.f4628 = mappedByteBufferM4106;
                }
                mappedByteBuffer2 = mappedByteBufferM4106;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m4092(SharedPreferencesC1269 sharedPreferencesC1269) {
        String str = sharedPreferencesC1269.f4609;
        String str2 = sharedPreferencesC1269.f4608;
        try {
            AbstractC2209.m4125(new File(str2, str + ".kvc"));
            AbstractC2209.m4125(new File(str2, str + ".tmp"));
        } catch (Exception e) {
            Log.e("FastKV", str, e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final AbstractC1557[] m4093() {
        return new AbstractC1557[]{C0608.f2432, C0641.f2488, C0644.f2492, C0647.f2496, C0821.f3212, C0840.f3240, C0852.f3266, C1130.f4200, C1260.f4591, C1290.f4703, C1294.f4709, C1337.f4801, C1342.f4810, C1554.f5420, C1886.f6232, C2030.f6787, C2061.f6856, C2075.f6876, C2233.f7230, C2294.f7389, C2546.f8102, C2747.f8827, C2801.f8931, C2809.f8998, C2872.f9209, C1050.f3822, C2052.f6839, C3636.f11374, C3638.f11378, C0920.f3404, C0847.f3254, C1162.f4289, C2060.f6855, C0607.f2431, C0676.f2559, C0652.f2504, C0669.f2550, C0672.f2555, C0204.f1288, C0678.f2561, C0681.f2564, C0683.f2566, C3426.f10800, C0803.f3165, C1875.f6222, C1878.f6225, C1880.f6227, C2391.f7652, C2610.f8489, C0873.f3303, C2800.f8930, C1152.f4259, C1164.f4291, C1170.f4301, C1177.f4314, C2893.f9310, C0242.f1400, C0321.f1572, C1095.f4106, C0855.f3270, C0247.f1410, C0774.f2874, C0845.f3252, C3624.f11326, C3528.f11041, C0245.f1408, C2157.f7117, C2160.f7120, C2162.f7122, C2164.f7124, C2167.f7128, C2169.f7130, C2171.f7132, C2173.f7134, C2176.f7137, C2180.f7141, C2182.f7143, C2184.f7145, C2186.f7147, C2188.f7149, C2190.f7151, C2192.f7153, C2195.f7156, C2197.f7158, C2200.f7161, C0323.f1574, C0806.f3168, C1150.f4257, C1394.f5015, C1612.f5483, C1618.f5489, C2340.f7526, C2634.f8528, C2663.f8577, C2724.f8788, C2824.f9070, C3555.f11159, C3628.f11335, C1764.f5887, C2726.f8790, C2757.f8846, C2763.f8852, C2774.f8875, C2779.f8880, C2781.f8882, C3512.f11014, C0325.f1576, C0674.f2557, C0772.f2872, C0811.f3173, C0819.f3207, C0860.f3275, C1614.f5485, C1616.f5487, C2079.f6881, C2661.f8575, C2743.f8821, C2759.f8848, C3558.f11162, C1873.f6220, C1622.f5495, C2280.f7375, C2281.f7376, C2283.f7377, C2284.f7378, C0206.f1290, C0208.f1296, C0209.f1302, C0210.f1307, C0121.f1070, C0463.f2038, C0465.f2052, C0473.f2064, C0636.f2474, C0932.f3421, C0935.f3428, C2090.f6898, C2041.f6815, C2051.f6834, C2096.f6907, C2603.f8467, C0188.f1249, C0194.f1259, C0197.f1266, C0306.f1528, C0312.f1549, C0314.f1554, C0319.f1567, C0664.f2541, C1052.f3824, C1054.f3829, C1058.f3836, C1060.f3842, C2081.f6883, C2056.f6843, C2073.f6869, C2082.f6884, C2321.f7452, C2446.f7775, C2455.f7796, C2459.f7804, C2700.f8706, C2719.f8775, C1401.f5057, C1537.f5378, C1541.f5387, C1542.f5392, C1545.f5398, C1547.f5404, C1549.f5409, C2361.f7579, C0186.f1243, C0946.f3459, C1323.f4772, C3446.f10858, C0603.f2421, C0604.f2425, C2112.f6958, C2113.f6962, C0183.f1237, C2213.f7188, C1500.f5295, C1513.f5334, C1160.f4283, C1846.f6140, C3621.f11319, C2797.f8923, C2532.f8073, C2534.f8078, C2535.f8082, C2542.f8095, C1175.f4307, C2057.f6849, C2091.f6899, C3616.f11309, C3626.f11328, C2349.f7541, C2451.f7789, C0723.f2734, C2084.f6889, C2298.f7405, C2448.f7781, C2031.f6789, C2032.f6793, C2034.f6800, RunnableC0304.f1522, C0310.f1535, C0728.f2755, C1048.f3817, C1989.f6610, C2105.f6940, C2632.f8521, C2691.f8682, C2882.f9230, C2512.f8030, C2513.f8034, C2514.f8038, C0198.f1271, C0200.f1277, C0202.f1282, C2761.f8850, C2722.f8781, C2727.f8791, C2732.f8799, C2733.f8803, C2741.f8814, C2755.f8841, C2768.f8857, C2772.f8869, C0663.f2533, C0666.f2546, C1362.f4862, C0622.f2452, C2695.f8691, C2696.f8695, C2697.f8699, C3611.f11291, C3613.f11298, C1469.f5239, C1471.f5242, C2109.f6949, C3617.f11313, C0670.f2551, C2307.f7427, C0649.f2499, C0181.f1231, C1016.f3715, C0755.f2846};
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static byte[] m4094(SharedPreferencesC1269 sharedPreferencesC1269, C0823 c0823, C0403 c0403) {
        String str = sharedPreferencesC1269.f4609;
        try {
            byte[] bArrM4129 = AbstractC2209.m4129(new File(sharedPreferencesC1269.f4608 + str, (String) c0823.f3226));
            if (bArrM4129 != null) {
                return c0403 != null ? c0403.m1592(bArrM4129) : bArrM4129;
            }
            return null;
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static int m4095(int i, int i2) {
        if (i2 >= 268435456) {
            throw new IllegalStateException("data size out of limit");
        }
        int i3 = SharedPreferencesC1269.f4607;
        if (i2 <= i3) {
            return i3;
        }
        while (i < i2) {
            i <<= 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static LinkedHashSet m4096(SharedPreferencesC1269 sharedPreferencesC1269, C0830 c0830, C0403 c0403) {
        String str = sharedPreferencesC1269.f4609;
        try {
            byte[] bArrM4129 = AbstractC2209.m4129(new File(sharedPreferencesC1269.f4608 + str, (String) c0830.f3226));
            if (bArrM4129 == null) {
                Log.w("FastKV", str, new Exception("Read object data failed"));
                return null;
            }
            if (c0403 != null) {
                bArrM4129 = c0403.m1592(bArrM4129);
            }
            int i = bArrM4129[0] & 255;
            String strM1259 = sharedPreferencesC1269.f4616.m1259(1, i, bArrM4129);
            C2840 c2840 = (C2840) sharedPreferencesC1269.f4610.get(strM1259);
            if (c2840 == null) {
                Log.w("FastKV", str, new Exception("No encoder for tag:".concat(strM1259)));
                return null;
            }
            c0830.f3225 = c2840;
            int i2 = i + 1;
            return c2840.m4826(i2, bArrM4129.length - i2, bArrM4129);
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static String m4097(SharedPreferencesC1269 sharedPreferencesC1269, C0831 c0831, C0403 c0403) {
        String str = sharedPreferencesC1269.f4609;
        try {
            byte[] bArrM4129 = AbstractC2209.m4129(new File(sharedPreferencesC1269.f4608 + str, (String) c0831.f3226));
            if (bArrM4129 == null) {
                return null;
            }
            if (c0403 != null) {
                bArrM4129 = c0403.m1592(bArrM4129);
            }
            return new String(bArrM4129, StandardCharsets.UTF_8);
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final void m4098(Context context) {
        Resources resources = context.getResources();
        if (resources != null) {
            m4099(resources);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final void m4099(Resources resources) {
        Object c2585;
        C0251.f1415.getClass();
        boolean z = C3692.f11601;
        if (!C3692.m5357()) {
            C3678.m5309("You can only inject module resources in Xposed Environment");
            return;
        }
        try {
            c2585 = null;
            if (C0251.m1338().equals(C3692.f11608)) {
                C3678.m5308(6, "You cannot inject module resources into yourself", null);
                return;
            }
            int i = AbstractC1745.f5844;
            C1744 c1744M2484 = AbstractC0968.m2484(resources.getAssets());
            C2873 c2873 = C0152.f1159;
            ((C1927) c1744M2484.f5843).f6366 = AbstractC2205.m4054();
            c1744M2484.m3493(true);
            C1973 c1973M3492 = c1744M2484.m3492();
            c1973M3492.f6370 = "addAssetPath";
            c1973M3492.m2888(Arrays.copyOf(new Object[]{AbstractC2519.m4527(String.class)}, 1));
            C1982 c1982 = (C1982) AbstractC0744.m2192(c1973M3492.m3799());
            if (c1982 != null) {
                c2585 = c1982.m3831(C3692.f11609);
            }
            Throwable thM4594 = C2586.m4594(c2585);
            if (thM4594 != null) {
                ArrayList arrayList = C3678.f11549;
                C3678.m5308(4, "Failed to inject module resources into [" + resources + "]", thM4594);
            }
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static final void m4100(C0558 c0558, C0555 c0555) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0558.f2285;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c0558);
            if (obj instanceof C0140) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c0558, obj, c0555)) {
                    if (atomicReferenceFieldUpdater.get(c0558) != obj) {
                    }
                }
                return;
            }
            Throwable th = null;
            if (obj instanceof C0555) {
                C0558.m1938(c0555, obj);
                throw null;
            }
            if (obj instanceof C0760) {
                C0760 c0760 = (C0760) obj;
                if (!C0760.f2860.compareAndSet(c0760, 0, 1)) {
                    C0558.m1938(c0555, obj);
                    throw null;
                }
                if (obj instanceof C0559) {
                    c0558.m1945(c0555, c0760.f2861);
                    return;
                }
                return;
            }
            if (!(obj instanceof C0758)) {
                C0758 c0758 = new C0758(obj, c0555, th, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(c0558, obj, c0758)) {
                    if (atomicReferenceFieldUpdater.get(c0558) != obj) {
                    }
                }
                return;
            }
            C0758 c0759 = (C0758) obj;
            if (c0759.f2855 != null) {
                C0558.m1938(c0555, obj);
                throw null;
            }
            Throwable th2 = c0759.f2858;
            if (th2 != null) {
                c0558.m1945(c0555, th2);
                return;
            }
            C0758 c0758M2227 = C0758.m2227(c0759, c0555, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(c0558, obj, c0758M2227)) {
                if (atomicReferenceFieldUpdater.get(c0558) != obj) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static void m4101(SharedPreferencesC1269 sharedPreferencesC1269) {
        long j;
        String str = sharedPreferencesC1269.f4608;
        StringBuilder sb = new StringBuilder();
        String str2 = sharedPreferencesC1269.f4609;
        File file = new File(str, AbstractC2784.m4752(sb, str2, ".kva"));
        File file2 = new File(str, AbstractC2784.m4748(str2, ".kvb"));
        try {
            if (AbstractC2209.m4138(file) && AbstractC2209.m4138(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                sharedPreferencesC1269.f4626 = randomAccessFile.getChannel();
                sharedPreferencesC1269.f4627 = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = sharedPreferencesC1269.f4626;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : SharedPreferencesC1269.f4607);
                    sharedPreferencesC1269.f4628 = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    FileChannel fileChannel2 = sharedPreferencesC1269.f4627;
                    if (length2 > 0) {
                        j = length2;
                    } else {
                        j = SharedPreferencesC1269.f4607;
                        fileChannel2 = fileChannel2;
                    }
                    MappedByteBuffer map2 = fileChannel2.map(mapMode, 0L, j);
                    sharedPreferencesC1269.f4629 = map2;
                    map2.order(byteOrder);
                    sharedPreferencesC1269.f4616 = new C0221(sharedPreferencesC1269.f4628.capacity());
                    if (length == 0 && length2 == 0) {
                        sharedPreferencesC1269.f4612 = 12;
                        return;
                    } else {
                        m4105(sharedPreferencesC1269, length, length2);
                        return;
                    }
                } catch (IOException e) {
                    Log.e("FastKV", str2, e);
                    m4119(sharedPreferencesC1269);
                    m4120(sharedPreferencesC1269, file, file2);
                    return;
                }
            }
            Log.e("FastKV", str2, new Exception("open file failed"));
            m4119(sharedPreferencesC1269);
        } catch (Exception e2) {
            Log.e("FastKV", str2, e2);
            m4108(sharedPreferencesC1269);
            m4119(sharedPreferencesC1269);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static boolean m4102(SharedPreferencesC1269 sharedPreferencesC1269) {
        String str = sharedPreferencesC1269.f4608;
        StringBuilder sb = new StringBuilder();
        String str2 = sharedPreferencesC1269.f4609;
        File file = new File(str, AbstractC2784.m4752(sb, str2, ".kvc"));
        File file2 = new File(str, AbstractC2784.m4748(str2, ".tmp"));
        boolean z = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!m4103(sharedPreferencesC1269, file)) {
                    m4108(sharedPreferencesC1269);
                    m4092(sharedPreferencesC1269);
                    return false;
                }
                if (sharedPreferencesC1269.f4631 == 0) {
                    if (!m4121(sharedPreferencesC1269, sharedPreferencesC1269.f4616)) {
                        sharedPreferencesC1269.f4631 = 1;
                        return false;
                    }
                    AbstractC2202.m4009(sharedPreferencesC1269, "recover from c file");
                    try {
                        m4092(sharedPreferencesC1269);
                        return true;
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        Log.e("FastKV", str2, e);
                        return z;
                    }
                }
            } else if (sharedPreferencesC1269.f4631 != 0) {
                File file3 = new File(str, str2 + ".kva");
                File file4 = new File(str, str2 + ".kvb");
                if (file3.exists() && file4.exists()) {
                    m4120(sharedPreferencesC1269, file3, file4);
                }
            }
            return false;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static boolean m4103(SharedPreferencesC1269 sharedPreferencesC1269, File file) {
        long length = file.length();
        if (length != 0 && length < JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN) {
            int i = (int) length;
            int iM4095 = m4095(SharedPreferencesC1269.f4607, i);
            C0221 c0221 = sharedPreferencesC1269.f4616;
            if (c0221 == null || ((byte[]) c0221.f1353).length != iM4095) {
                c0221 = new C0221(0, new byte[iM4095]);
                sharedPreferencesC1269.f4616 = c0221;
            } else {
                c0221.f1351 = 0;
            }
            AbstractC2209.m4141(file, (byte[]) c0221.f1353, i);
            int iM1263 = c0221.m1263();
            if (iM1263 >= 0) {
                int i2 = (-1073741825) & iM1263;
                boolean z = (iM1263 & 1073741824) != 0;
                long jM1265 = c0221.m1265(c0221.f1351);
                c0221.f1351 += 8;
                sharedPreferencesC1269.f4612 = i2 + 12;
                if (i2 >= 0 && i2 <= i - 12 && jM1265 == c0221.m1261(12, i2) && AbstractC0968.m2481(sharedPreferencesC1269, z)) {
                    sharedPreferencesC1269.f4613 = jM1265;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static String m4104(int i) {
        switch (i) {
            case 1:
                return "nop";
            case 2:
                return "move";
            case 3:
                return "move-param";
            case 4:
                return "move-exception";
            case 5:
                return "const";
            case 6:
                return "goto";
            case 7:
                return "if-eq";
            case 8:
                return "if-ne";
            case 9:
                return "if-lt";
            case 10:
                return "if-ge";
            case 11:
                return "if-le";
            case Opcodes.FCONST_1 /* 12 */:
                return "if-gt";
            case 13:
                return "switch";
            case Opcodes.DCONST_0 /* 14 */:
                return "add";
            case 15:
                return "sub";
            case 16:
                return "mul";
            case Opcodes.SIPUSH /* 17 */:
                return "div";
            case Opcodes.LDC /* 18 */:
                return "rem";
            case 19:
                return "neg";
            case 20:
                return "and";
            case Opcodes.ILOAD /* 21 */:
                return "or";
            case Opcodes.LLOAD /* 22 */:
                return "xor";
            case Opcodes.FLOAD /* 23 */:
                return "shl";
            case Opcodes.DLOAD /* 24 */:
                return "shr";
            case Opcodes.ALOAD /* 25 */:
                return "ushr";
            case 26:
                return "not";
            case 27:
                return "cmpl";
            case 28:
                return "cmpg";
            case 29:
                return "conv";
            case 30:
                return "to-byte";
            case 31:
                return "to-char";
            case 32:
                return "to-short";
            case 33:
                return "return";
            case 34:
                return "array-length";
            case 35:
                return "throw";
            case 36:
                return "monitor-enter";
            case 37:
                return "monitor-exit";
            case 38:
                return "aget";
            case 39:
                return "aput";
            case 40:
                return "new-instance";
            case 41:
                return "new-array";
            case 42:
                return "filled-new-array";
            case 43:
                return "check-cast";
            case 44:
                return "instance-of";
            case 45:
                return "get-field";
            case Opcodes.IALOAD /* 46 */:
                return "get-static";
            case 47:
                return "put-field";
            case 48:
                return "put-static";
            case 49:
                return "invoke-static";
            case Opcodes.AALOAD /* 50 */:
                return "invoke-virtual";
            case Opcodes.BALOAD /* 51 */:
                return "invoke-super";
            case 52:
                return "invoke-direct";
            case Opcodes.SALOAD /* 53 */:
                return "invoke-interface";
            case Opcodes.ISTORE /* 54 */:
            default:
                return "unknown-".concat(AbstractC1460.m3222(i));
            case Opcodes.LSTORE /* 55 */:
                return "move-result";
            case Opcodes.FSTORE /* 56 */:
                return "move-result-pseudo";
            case Opcodes.DSTORE /* 57 */:
                return "fill-array-data";
            case Opcodes.ASTORE /* 58 */:
                return "invoke-polymorphic";
            case 59:
                return "invoke-custom";
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static void m4105(SharedPreferencesC1269 sharedPreferencesC1269, long j, long j2) {
        long j3;
        MappedByteBuffer mappedByteBuffer = sharedPreferencesC1269.f4628;
        String str = sharedPreferencesC1269.f4609;
        int i = mappedByteBuffer.getInt();
        int i2 = i & (-1073741825);
        boolean z = (i & 1073741824) != 0;
        long j4 = sharedPreferencesC1269.f4628.getLong();
        int i3 = sharedPreferencesC1269.f4629.getInt();
        int i4 = (-1073741825) & i3;
        boolean z2 = (1073741824 & i3) != 0;
        long j5 = sharedPreferencesC1269.f4629.getLong();
        if (i2 < 0) {
            j3 = 12;
        } else if (i2 <= j - 12) {
            sharedPreferencesC1269.f4612 = i2 + 12;
            sharedPreferencesC1269.f4628.rewind();
            j3 = 12;
            sharedPreferencesC1269.f4628.get((byte[]) sharedPreferencesC1269.f4616.f1353, 0, sharedPreferencesC1269.f4612);
            if (j4 == sharedPreferencesC1269.f4616.m1261(12, i2) && AbstractC0968.m2481(sharedPreferencesC1269, z)) {
                sharedPreferencesC1269.f4613 = j4;
                if (j == j2) {
                    byte[] bArr = new byte[sharedPreferencesC1269.f4612];
                    sharedPreferencesC1269.f4629.rewind();
                    sharedPreferencesC1269.f4629.get(bArr, 0, sharedPreferencesC1269.f4612);
                    byte[] bArr2 = (byte[]) sharedPreferencesC1269.f4616.f1353;
                    for (int i5 = 0; i5 < sharedPreferencesC1269.f4612; i5++) {
                        if (bArr2[i5] == bArr[i5]) {
                        }
                    }
                    return;
                }
                Log.w("FastKV", str, new Exception("B file error"));
                m4091(sharedPreferencesC1269, sharedPreferencesC1269.f4628, sharedPreferencesC1269.f4629, sharedPreferencesC1269.f4612);
                return;
            }
        } else {
            j3 = 12;
        }
        if (i4 >= 0 && i4 <= j2 - j3) {
            sharedPreferencesC1269.f4614.clear();
            sharedPreferencesC1269.f4622 = 0;
            sharedPreferencesC1269.f4623.clear();
            sharedPreferencesC1269.f4612 = i4 + 12;
            if (((byte[]) sharedPreferencesC1269.f4616.f1353).length != sharedPreferencesC1269.f4629.capacity()) {
                sharedPreferencesC1269.f4616 = new C0221(sharedPreferencesC1269.f4629.capacity());
            }
            sharedPreferencesC1269.f4629.rewind();
            sharedPreferencesC1269.f4629.get((byte[]) sharedPreferencesC1269.f4616.f1353, 0, sharedPreferencesC1269.f4612);
            if (j5 == sharedPreferencesC1269.f4616.m1261(12, i4) && AbstractC0968.m2481(sharedPreferencesC1269, z2)) {
                Log.w("FastKV", str, new Exception("A file error"));
                m4091(sharedPreferencesC1269, sharedPreferencesC1269.f4629, sharedPreferencesC1269.f4628, sharedPreferencesC1269.f4612);
                sharedPreferencesC1269.f4613 = j5;
                return;
            }
        }
        AbstractC2202.m4003(sharedPreferencesC1269, "both files error");
        m4088(sharedPreferencesC1269);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static MappedByteBuffer m4106(FileChannel fileChannel, int i) {
        try {
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
            map.order(ByteOrder.LITTLE_ENDIAN);
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static void m4107(SharedPreferencesC1269 sharedPreferencesC1269, MappedByteBuffer mappedByteBuffer) throws IOException {
        MappedByteBuffer mappedByteBufferM4106;
        int iCapacity = mappedByteBuffer.capacity();
        int i = SharedPreferencesC1269.f4607;
        if (iCapacity != i) {
            FileChannel fileChannel = mappedByteBuffer == sharedPreferencesC1269.f4628 ? sharedPreferencesC1269.f4626 : sharedPreferencesC1269.f4627;
            try {
                fileChannel.truncate(i);
                mappedByteBufferM4106 = m4106(fileChannel, i);
            } catch (IOException unused) {
                mappedByteBufferM4106 = null;
            }
            if (mappedByteBufferM4106 == null) {
                throw new IOException("Failed to truncate and remap buffer");
            }
            if (mappedByteBuffer == sharedPreferencesC1269.f4628) {
                sharedPreferencesC1269.f4628 = mappedByteBufferM4106;
            } else {
                sharedPreferencesC1269.f4629 = mappedByteBufferM4106;
            }
            mappedByteBuffer = mappedByteBufferM4106;
        }
        mappedByteBuffer.putInt(0, sharedPreferencesC1269.f4611 != null ? 1073741824 : 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static void m4108(SharedPreferencesC1269 sharedPreferencesC1269) {
        sharedPreferencesC1269.f4612 = 12;
        sharedPreferencesC1269.f4613 = 0L;
        sharedPreferencesC1269.f4614.clear();
        sharedPreferencesC1269.f4622 = 0;
        sharedPreferencesC1269.f4623.clear();
        C0221 c0221 = sharedPreferencesC1269.f4616;
        if (c0221 == null || ((byte[]) c0221.f1353).length != SharedPreferencesC1269.f4607) {
            sharedPreferencesC1269.f4616 = new C0221(SharedPreferencesC1269.f4607);
        } else {
            c0221.m1275(4, 0L);
        }
        sharedPreferencesC1269.f4616.m1274(0, sharedPreferencesC1269.f4611 != null ? 1073741824 : 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static TypedValue m4109(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static boolean m4110(Context context, int i, boolean z) {
        TypedValue typedValueM4109 = m4109(context, i);
        if (typedValueM4109 == null || typedValueM4109.type != 18) {
            return z;
        }
        return typedValueM4109.data != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static TypedValue m4111(Context context, int i, String str) {
        TypedValue typedValueM4109 = m4109(context, i);
        if (typedValueM4109 != null) {
            return typedValueM4109;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final void m4112(C0558 c0558, InterfaceC0842 interfaceC0842, boolean z) {
        Object obj = C0558.f2285.get(c0558);
        Throwable thMo1942 = c0558.mo1942(obj);
        Object c2585 = thMo1942 != null ? new C2585(thMo1942) : c0558.mo1943(obj);
        if (!z) {
            interfaceC0842.mo933(c2585);
            return;
        }
        C1072 c1072 = (C1072) interfaceC0842;
        AbstractC0843 abstractC0843 = c1072.f3888;
        Object obj2 = c1072.f3890;
        InterfaceC0877 interfaceC0877 = abstractC0843.f3249;
        Object objM5341 = AbstractC3681.m5341(interfaceC0877, obj2);
        C3493 c3493M5012 = objM5341 != AbstractC3681.f11562 ? AbstractC3453.m5012(abstractC0843, interfaceC0877, objM5341) : null;
        try {
            c1072.f3888.mo933(c2585);
        } finally {
            if (c3493M5012 == null || c3493M5012.m5092()) {
                AbstractC3681.m5337(interfaceC0877, objM5341);
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00cf */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00d0, code lost:
    
        r0 = th;
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4113(SharedPreferencesC1269 sharedPreferencesC1269) throws Throwable {
        File[] fileArrListFiles;
        MappedByteBuffer mappedByteBuffer;
        C2840 c2840;
        C2840[] c2840Arr = (C2840[]) sharedPreferencesC1269.f4610.values().toArray(new C2840[sharedPreferencesC1269.f4610.size()]);
        String str = "temp_" + sharedPreferencesC1269.f4609;
        SharedPreferencesC1269 sharedPreferencesC12610 = new SharedPreferencesC1269(sharedPreferencesC1269.f4608, str, c2840Arr, sharedPreferencesC1269.f4611, 2);
        synchronized (sharedPreferencesC12610) {
            sharedPreferencesC12610.f4632 = false;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : sharedPreferencesC1269.f4614.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            AbstractC0824 abstractC0824 = null;
            if (value instanceof C0831) {
                C0831 c0831 = (C0831) value;
                if (c0831.f3229) {
                    arrayList.add((String) c0831.f3226);
                    String strM4097 = m4097(sharedPreferencesC1269, c0831, null);
                    if (strM4097 != null) {
                        sharedPreferencesC12610.putString(str2, strM4097);
                    }
                } else {
                    sharedPreferencesC12610.putString(str2, (String) c0831.f3226);
                }
            } else if (value instanceof C0825) {
                sharedPreferencesC12610.putBoolean(str2, ((C0825) value).f3220);
            } else if (value instanceof C0828) {
                sharedPreferencesC12610.putInt(str2, ((C0828) value).f3223);
            } else if (value instanceof C0829) {
                sharedPreferencesC12610.putLong(str2, ((C0829) value).f3224);
            } else if (value instanceof C0827) {
                sharedPreferencesC12610.putFloat(str2, ((C0827) value).f3222);
            } else if (value instanceof C0826) {
                double d = ((C0826) value).f3221;
                synchronized (sharedPreferencesC12610) {
                    SharedPreferencesC1269.m2956(str2);
                    AbstractC0824 abstractC0825 = (AbstractC0824) sharedPreferencesC12610.f4614.get(str2);
                    if (abstractC0825 == null || abstractC0825.mo2372() == 5) {
                        abstractC0824 = abstractC0825;
                    } else {
                        sharedPreferencesC12610.remove(str2);
                    }
                    C0826 c0826 = (C0826) abstractC0824;
                    if (c0826 == null) {
                        sharedPreferencesC12610.m2972(str2, (byte) 5, SharedPreferencesC1269.f4606[5]);
                        C0221 c0221 = sharedPreferencesC12610.f4616;
                        int i = c0221.f1351;
                        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
                        C0403 c0403 = sharedPreferencesC12610.f4611;
                        if (c0403 != null) {
                            jDoubleToRawLongBits ^= (long) c0403.f1901;
                        }
                        c0221.m1275(c0221.f1351, jDoubleToRawLongBits);
                        c0221.f1351 += 8;
                        sharedPreferencesC12610.m2968();
                        sharedPreferencesC12610.f4614.put(str2, new C0826(i, d));
                        sharedPreferencesC12610.m2960(str2);
                    } else if (c0826.f3221 != d) {
                        long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(d);
                        C0403 c0404 = sharedPreferencesC12610.f4611;
                        if (c0404 != null) {
                            jDoubleToRawLongBits2 ^= (long) c0404.f1901;
                        }
                        long jM1265 = sharedPreferencesC12610.f4616.m1265(c0826.f3219) ^ jDoubleToRawLongBits2;
                        c0826.f3221 = d;
                        SharedPreferencesC1269 sharedPreferencesC12611 = sharedPreferencesC12610;
                        try {
                            sharedPreferencesC12611.m2970(jDoubleToRawLongBits2, jM1265, c0826.f3219);
                            sharedPreferencesC12610 = sharedPreferencesC12611;
                            sharedPreferencesC12610.m2960(str2);
                        } catch (Throwable th) {
                            th = th;
                            sharedPreferencesC12610 = sharedPreferencesC12611;
                            while (true) {
                                Throwable th2 = th;
                                throw th2;
                            }
                        }
                    }
                }
            } else if (value instanceof C0823) {
                C0823 c0823 = (C0823) value;
                if (c0823.f3229) {
                    arrayList.add((String) c0823.f3226);
                    byte[] bArrM4094 = m4094(sharedPreferencesC1269, c0823, null);
                    if (bArrM4094 != null) {
                        sharedPreferencesC12610.m2963(str2, bArrM4094);
                    }
                } else {
                    sharedPreferencesC12610.m2963(str2, (byte[]) c0823.f3226);
                }
            } else if (value instanceof C0830) {
                C0830 c0830 = (C0830) value;
                if (c0830.f3229) {
                    arrayList.add((String) c0830.f3226);
                    LinkedHashSet linkedHashSetM4096 = m4096(sharedPreferencesC1269, c0830, null);
                    if (linkedHashSetM4096 != null && (c2840 = c0830.f3225) != null) {
                        sharedPreferencesC12610.m2964(str2, linkedHashSetM4096, c2840);
                    }
                } else {
                    C2840 c2841 = c0830.f3225;
                    if (c2841 != null) {
                        sharedPreferencesC12610.m2964(str2, c0830.f3226, c2841);
                    }
                }
            }
        }
        sharedPreferencesC12610.contains("");
        sharedPreferencesC1269.f4616 = sharedPreferencesC12610.f4616;
        sharedPreferencesC1269.f4613 = sharedPreferencesC12610.f4613;
        sharedPreferencesC1269.f4612 = sharedPreferencesC12610.f4612;
        sharedPreferencesC1269.f4622 = 0;
        sharedPreferencesC1269.f4623.clear();
        sharedPreferencesC1269.f4614.clear();
        sharedPreferencesC1269.f4614.putAll(sharedPreferencesC12610.f4614);
        C0221 c0222 = sharedPreferencesC12610.f4616;
        if (sharedPreferencesC1269.f4631 == 0) {
            int length = ((byte[]) c0222.f1353).length;
            MappedByteBuffer mappedByteBuffer2 = sharedPreferencesC1269.f4628;
            if (mappedByteBuffer2 != null && mappedByteBuffer2.capacity() == length && (mappedByteBuffer = sharedPreferencesC1269.f4629) != null && mappedByteBuffer.capacity() == length) {
                sharedPreferencesC1269.f4628.position(0);
                sharedPreferencesC1269.f4628.put((byte[]) c0222.f1353, 0, sharedPreferencesC1269.f4612);
                sharedPreferencesC1269.f4629.position(0);
                sharedPreferencesC1269.f4629.put((byte[]) c0222.f1353, 0, sharedPreferencesC1269.f4612);
            } else if (!m4121(sharedPreferencesC1269, c0222)) {
                sharedPreferencesC1269.f4631 = 1;
            }
        }
        if (sharedPreferencesC1269.f4631 != 0) {
            m4122(sharedPreferencesC1269);
        }
        File file = new File(sharedPreferencesC1269.f4608, str);
        String str3 = sharedPreferencesC1269.f4608 + sharedPreferencesC1269.f4609;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    AbstractC2209.m4139(file2, new File(str3, file2.getName()));
                } catch (Exception unused) {
                }
            }
        }
        AbstractC2209.m4125(file);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC2209.m4125(new File(str3, (String) it.next()));
        }
        sharedPreferencesC1269.f4620 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static void m4114(RuntimeException runtimeException, String str) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static long m4115(int i, long j) {
        int i2 = (i & 7) << 3;
        return (j >>> (64 - i2)) | (j << i2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static final InterfaceC2713 m4116(Socket socket) {
        Logger logger = AbstractC2273.f7371;
        C2782 c2782 = new C2782(socket);
        return c2782.sink(new C0278(socket.getOutputStream(), 1, c2782));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static C0278 m4117(File file) {
        Logger logger = AbstractC2273.f7371;
        return new C0278(new FileOutputStream(file, false), 1, new C3400());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static final InterfaceC2786 m4118(Socket socket) {
        Logger logger = AbstractC2273.f7371;
        C2782 c2782 = new C2782(socket);
        return c2782.source(new C0279(socket.getInputStream(), 1, c2782));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static void m4119(SharedPreferencesC1269 sharedPreferencesC1269) {
        sharedPreferencesC1269.f4631 = 1;
        AbstractC2209.m4124(sharedPreferencesC1269.f4626);
        AbstractC2209.m4124(sharedPreferencesC1269.f4627);
        sharedPreferencesC1269.f4626 = null;
        sharedPreferencesC1269.f4627 = null;
        sharedPreferencesC1269.f4628 = null;
        sharedPreferencesC1269.f4629 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static void m4120(SharedPreferencesC1269 sharedPreferencesC1269, File file, File file2) {
        String str = sharedPreferencesC1269.f4609;
        try {
            if (m4103(sharedPreferencesC1269, file)) {
                return;
            }
        } catch (IOException e) {
            Log.w("FastKV", str, e);
        }
        m4108(sharedPreferencesC1269);
        try {
            if (m4103(sharedPreferencesC1269, file2)) {
                return;
            }
        } catch (IOException e2) {
            Log.w("FastKV", str, e2);
        }
        m4108(sharedPreferencesC1269);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static boolean m4121(SharedPreferencesC1269 sharedPreferencesC1269, C0221 c0221) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        String str = sharedPreferencesC1269.f4609;
        String str2 = sharedPreferencesC1269.f4608;
        try {
            int length = ((byte[]) c0221.f1353).length;
            File file = new File(str2, str + ".kva");
            File file2 = new File(str2, str + ".kvb");
            if (!AbstractC2209.m4138(file) || !AbstractC2209.m4138(file2)) {
                throw new Exception("open file failed");
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            long j = length;
            try {
                randomAccessFile.setLength(j);
                FileChannel channel = randomAccessFile.getChannel();
                sharedPreferencesC1269.f4626 = channel;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = channel.map(mapMode, 0L, j);
                sharedPreferencesC1269.f4628 = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                sharedPreferencesC1269.f4628.put((byte[]) c0221.f1353, 0, sharedPreferencesC1269.f4612);
                randomAccessFile2 = new RandomAccessFile(file2, "rw");
                try {
                    randomAccessFile2.setLength(j);
                    FileChannel channel2 = randomAccessFile2.getChannel();
                    sharedPreferencesC1269.f4627 = channel2;
                    MappedByteBuffer map2 = channel2.map(mapMode, 0L, j);
                    sharedPreferencesC1269.f4629 = map2;
                    map2.order(byteOrder);
                    sharedPreferencesC1269.f4629.put((byte[]) c0221.f1353, 0, sharedPreferencesC1269.f4612);
                    return true;
                } catch (Exception e) {
                    e = e;
                    AbstractC2209.m4124(randomAccessFile);
                    AbstractC2209.m4124(randomAccessFile2);
                    sharedPreferencesC1269.f4626 = null;
                    sharedPreferencesC1269.f4627 = null;
                    sharedPreferencesC1269.f4628 = null;
                    sharedPreferencesC1269.f4629 = null;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static boolean m4122(SharedPreferencesC1269 sharedPreferencesC1269) {
        String str = sharedPreferencesC1269.f4609;
        String str2 = sharedPreferencesC1269.f4608;
        try {
            File file = new File(str2, str + ".tmp");
            if (!AbstractC2209.m4138(file)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.setLength(sharedPreferencesC1269.f4612);
                randomAccessFile.write((byte[]) sharedPreferencesC1269.f4616.f1353, 0, sharedPreferencesC1269.f4612);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                File file2 = new File(str2, str + ".kvc");
                if (!(file.renameTo(file2) || ((!file2.exists() || file2.delete()) && file.renameTo(file2)))) {
                    Log.w("FastKV", str, new Exception("rename failed"));
                    return false;
                }
                ArrayList arrayList = sharedPreferencesC1269.f4619;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC1270.m2982().execute(new RunnableC1324(sharedPreferencesC1269, 0, (String) it.next()));
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public abstract void mo2438(C2687 c2687, float f, float f2);
}
