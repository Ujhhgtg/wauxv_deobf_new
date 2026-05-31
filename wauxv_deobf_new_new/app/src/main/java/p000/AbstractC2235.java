package p000;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import com.umeng.analytics.pro.bc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤝᲈᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2235 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1174 f7286 = new C1174("UNDEFINED", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C1174 f7287 = new C1174("REUSABLE_CLAIMED", 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final byte[] f7288 = {112, 114, 111, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final byte[] f7289 = {112, 114, JSONB.Constants.BC_STR_ASCII_FIX_36, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1743 m4192(InterfaceC1433 interfaceC1433) {
        C1724 c1724 = AbstractC1725.f5841;
        C1730 c1730 = new C1730();
        C1732 c1732 = c1724.f5842;
        c1730.f5851 = c1732.f5862;
        c1730.f5852 = c1732.f5860;
        c1730.f5853 = c1732.f5861;
        String str = c1732.f5863;
        c1730.f5854 = str;
        c1730.f5855 = c1732.f5864;
        c1730.f5856 = c1732.f5866;
        c1730.f5857 = c1732.f5865;
        c1730.f5858 = c1724.f5843;
        c1730.f5859 = c1732.f5867;
        interfaceC1433.invoke(c1730);
        if (c1730.f5853) {
            if (!AbstractC1469.m3322(str, "    ")) {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                    }
                }
            }
        } else if (!AbstractC1469.m3322(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        C1732 c1733 = new C1732(c1730.f5852, c1730.f5853, c1730.f5851, c1730.f5854, c1730.f5855, c1730.f5857, c1730.f5856, c1730.f5859);
        C2135 c2135 = c1730.f5858;
        C1743 c1743 = new C1743(c1733, c2135);
        AbstractC1469.m3322(c2135, AbstractC2727.f8748);
        return c1743;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final long m4193(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : AbstractC3744.m5329(j + j2);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C2717 m4194(String str, AbstractC2236 abstractC2236, InterfaceC2715[] interfaceC2715Arr, InterfaceC1433 interfaceC1433) {
        if (AbstractC2901.m4869(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC2236.equals(C2911.f9280)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C0703 c0703 = new C0703(str);
        interfaceC1433.invoke(c0703);
        return new C2717(str, abstractC2236, c0703.f2685.size(), AbstractC0280.m1535(interfaceC2715Arr), c0703);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static AbstractC3514 m4195(AbstractC3514 abstractC3514, C3505 c3505) {
        if (abstractC3514.getType().equals(c3505)) {
            return abstractC3514;
        }
        int i = c3505.f11065;
        if (i == 1) {
            return C0891.m2528(((C0902) abstractC3514).f3371);
        }
        if (i == 2) {
            int i2 = ((C0902) abstractC3514).f3371;
            byte b = (byte) i2;
            if (b == i2) {
                return new C0892(b);
            }
            throw new IllegalArgumentException(AbstractC1095.m2794(i2, "bogus byte value: "));
        }
        if (i == 3) {
            int i3 = ((C0902) abstractC3514).f3371;
            char c = (char) i3;
            if (c == i3) {
                return new C0895(c);
            }
            throw new IllegalArgumentException(AbstractC1095.m2794(i3, "bogus char value: "));
        }
        if (i == 8) {
            int i4 = ((C0902) abstractC3514).f3371;
            short s = (short) i4;
            if (s == i4) {
                return new C0915(s);
            }
            throw new IllegalArgumentException(AbstractC1095.m2794(i4, "bogus short value: "));
        }
        throw new UnsupportedOperationException("can't coerce " + abstractC3514 + " to " + c3505);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static byte[] m4196(C1030[] c1030Arr, byte[] bArr) throws IOException {
        int length = 0;
        for (C1030 c1030 : c1030Arr) {
            length += ((((c1030.f3775 * 2) + 7) & (-8)) / 8) + (c1030.f3773 * 2) + m4200(c1030.f3769, c1030.f3770, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c1030.f3774;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, AbstractC2236.f7293)) {
            for (C1030 c1031 : c1030Arr) {
                m4220(byteArrayOutputStream, c1031, m4200(c1031.f3769, c1031.f3770, bArr));
                m4222(byteArrayOutputStream, c1031);
                int[] iArr = c1031.f3776;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    AbstractC0738.m2285(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                m4221(byteArrayOutputStream, c1031);
            }
        } else {
            for (C1030 c1032 : c1030Arr) {
                m4220(byteArrayOutputStream, c1032, m4200(c1032.f3769, c1032.f3770, bArr));
            }
            for (C1030 c1033 : c1030Arr) {
                m4222(byteArrayOutputStream, c1033);
                int[] iArr2 = c1033.f3776;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    AbstractC0738.m2285(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                m4221(byteArrayOutputStream, c1033);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m4197(View view) {
        AbstractC0034 abstractC0034 = (AbstractC0034) view.getTag();
        if (abstractC0034 == null || abstractC0034.m898() == null) {
            return;
        }
        ((WindowManager) abstractC0034.m898().getSystemService("window")).removeViewImmediate((View) view.getParent());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final long m4198(long j) {
        long j2 = (j << 1) + 1;
        C1125.f4190.getClass();
        int i = AbstractC1126.f4195;
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0167  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static void m4199(SharedPreferencesC1271 sharedPreferencesC1271, int i) {
        int i2;
        MappedByteBuffer mappedByteBufferM3342;
        ArrayList arrayList = sharedPreferencesC1271.f4622;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            C2708 c2708 = (C2708) arrayList.get(0);
            int size = arrayList.size();
            int i3 = 0;
            for (int i4 = 1; i4 < size; i4++) {
                C2708 c2709 = (C2708) arrayList.get(i4);
                if (c2709.f8711 == c2708.f8712) {
                    c2708.f8712 = c2709.f8712;
                } else {
                    i3++;
                    if (i3 != i4) {
                        arrayList.set(i3, c2709);
                    }
                    c2708 = c2709;
                }
            }
            int i5 = i3 + 1;
            if (size > i5) {
                arrayList.subList(i5, size).clear();
            }
        }
        C2708 c27010 = (C2708) arrayList.get(0);
        int i6 = c27010.f8711;
        int i7 = sharedPreferencesC1271.f4611;
        int i8 = i7 - sharedPreferencesC1271.f4621;
        int i9 = i8 - 12;
        int i10 = i8 - i6;
        int i11 = i7 - i6;
        boolean z = i9 < i11 + i10;
        if (!z) {
            sharedPreferencesC1271.f4612 ^= sharedPreferencesC1271.f4615.m1407(i6, i11);
        }
        int size2 = arrayList.size();
        int i12 = size2 - 1;
        int i13 = sharedPreferencesC1271.f4611 - ((C2708) arrayList.get(i12)).f8712;
        int i14 = i13 > 0 ? size2 : i12;
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        int i15 = c27010.f8711;
        int i16 = c27010.f8712;
        int i17 = 1;
        while (i17 < size2) {
            ArrayList arrayList2 = arrayList;
            C2708 c27011 = (C2708) arrayList.get(i17);
            int i18 = i17;
            int i19 = c27011.f8711 - i16;
            int i20 = size2;
            byte[] bArr = (byte[]) sharedPreferencesC1271.f4615.f1427;
            System.arraycopy(bArr, i16, bArr, i15, i19);
            int i21 = i18 - 1;
            iArr[i21] = i16;
            iArr2[i21] = i16 - i15;
            i15 += i19;
            i16 = c27011.f8712;
            i17 = i18 + 1;
            arrayList = arrayList2;
            size2 = i20;
        }
        ArrayList arrayList3 = arrayList;
        if (i13 > 0) {
            byte[] bArr2 = (byte[]) sharedPreferencesC1271.f4615.f1427;
            System.arraycopy(bArr2, i16, bArr2, i15, i13);
            iArr[i12] = i16;
            iArr2[i12] = i16 - i15;
        }
        sharedPreferencesC1271.f4621 = 0;
        arrayList3.clear();
        if (z) {
            sharedPreferencesC1271.f4612 = sharedPreferencesC1271.f4615.m1407(12, i9);
        } else {
            sharedPreferencesC1271.f4612 ^= sharedPreferencesC1271.f4615.m1407(i6, i10);
        }
        sharedPreferencesC1271.f4611 = i8;
        if (sharedPreferencesC1271.f4610 != null) {
            i9 |= 1073741824;
        }
        if (sharedPreferencesC1271.f4630 == 0) {
            sharedPreferencesC1271.f4627.putInt(0, -1);
            sharedPreferencesC1271.f4627.putLong(4, sharedPreferencesC1271.f4612);
            sharedPreferencesC1271.f4627.position(i6);
            sharedPreferencesC1271.f4627.put((byte[]) sharedPreferencesC1271.f4615.f1427, i6, i10);
            sharedPreferencesC1271.f4627.putInt(0, i9);
            sharedPreferencesC1271.f4628.putInt(0, i9);
            sharedPreferencesC1271.f4628.putLong(4, sharedPreferencesC1271.f4612);
            sharedPreferencesC1271.f4628.position(i6);
            sharedPreferencesC1271.f4628.put((byte[]) sharedPreferencesC1271.f4615.f1427, i6, i10);
        } else {
            sharedPreferencesC1271.f4615.m1420(0, i9);
            sharedPreferencesC1271.f4615.m1421(4, sharedPreferencesC1271.f4612);
        }
        int i22 = sharedPreferencesC1271.f4611 + i;
        if (((byte[]) sharedPreferencesC1271.f4615.f1427).length - i22 > 32768) {
            int i23 = SharedPreferencesC1271.f4606;
            int iM3334 = AbstractC1469.m3334(i23, i22 + i23);
            byte[] bArr3 = (byte[]) sharedPreferencesC1271.f4615.f1427;
            if (iM3334 >= bArr3.length) {
                i2 = 0;
            } else {
                byte[] bArr4 = new byte[iM3334];
                i2 = 0;
                System.arraycopy(bArr3, 0, bArr4, 0, sharedPreferencesC1271.f4611);
                sharedPreferencesC1271.f4615.f1427 = bArr4;
                if (sharedPreferencesC1271.f4630 == 0) {
                    FileChannel fileChannel = sharedPreferencesC1271.f4625;
                    long j = iM3334;
                    MappedByteBuffer mappedByteBufferM3343 = null;
                    try {
                        fileChannel.truncate(j);
                        mappedByteBufferM3342 = AbstractC1469.m3342(fileChannel, iM3334);
                    } catch (IOException unused) {
                        mappedByteBufferM3342 = null;
                    }
                    FileChannel fileChannel2 = sharedPreferencesC1271.f4626;
                    try {
                        fileChannel2.truncate(j);
                        mappedByteBufferM3343 = AbstractC1469.m3342(fileChannel2, iM3334);
                    } catch (IOException unused2) {
                    }
                    if (mappedByteBufferM3342 == null || mappedByteBufferM3343 == null) {
                        Log.e("FastKV", sharedPreferencesC1271.f4608, new Exception("map failed"));
                        AbstractC1469.m3352(sharedPreferencesC1271);
                    } else {
                        sharedPreferencesC1271.f4627 = mappedByteBufferM3342;
                        sharedPreferencesC1271.f4628 = mappedByteBufferM3343;
                    }
                }
                AbstractC1272.m3100(sharedPreferencesC1271, "truncate finish");
            }
        } else {
            i2 = 0;
        }
        for (AbstractC0823 abstractC0823 : sharedPreferencesC1271.f4613.values()) {
            int i24 = abstractC0823.f3226;
            if (i24 > i6) {
                int i25 = i14 - 1;
                int i26 = i2;
                while (i26 <= i25) {
                    int i27 = (i26 + i25) >>> 1;
                    int i28 = iArr[i27];
                    if (i28 >= i24) {
                        if (i28 <= i24) {
                            i25 = i27;
                            break;
                        }
                        i25 = i27 - 1;
                    } else {
                        i26 = i27 + 1;
                    }
                }
                int i29 = iArr2[i25];
                abstractC0823.f3226 -= i29;
                if (abstractC0823.mo2489() >= 6) {
                    ((AbstractC0831) abstractC0823).f3234 -= i29;
                }
            }
        }
        AbstractC1272.m3100(sharedPreferencesC1271, "gc finish");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static String m4200(String str, String str2, byte[] bArr) {
        byte[] bArr2 = AbstractC2236.f7294;
        byte[] bArr3 = AbstractC2236.f7295;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC2844.m4786(AbstractC2844.m4787(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final AbstractC1569[] m4201() {
        return new AbstractC1569[]{C0589.f2398, C0634.f2494, C0638.f2499, C0640.f2502, C0820.f3219, C0839.f3247, C0852.f3274, C1136.f4211, C1262.f4590, C1291.f4702, C1295.f4708, C1339.f4801, C1343.f4809, C1566.f5451, C1912.f6306, C2063.f6911, C2093.f6979, C2095.f6982, C2264.f7350, C2327.f7511, C2384.f7646, C2602.f8255, C2807.f8989, C2860.f9092, C2869.f9160, C2932.f9379, C1052.f3828, C2085.f6963, C3696.f11523, C3698.f11527, C0919.f3411, C0847.f3262, C1163.f4285, C2092.f6978, C0588.f2397, C0667.f2553, C0643.f2506, C0659.f2543, C0663.f2549, C0212.f1356, C0669.f2555, C0671.f2557, C0673.f2559, C3483.f10960, C0803.f3173, C1902.f6297, C1905.f6300, C1907.f6302, C2444.f7796, C2671.f8654, C0872.f3310, C2859.f9091, C1157.f4270, C1166.f4288, C1172.f4298, C1179.f4311, C2952.f9477, C0252.f1474, C0332.f1647, C1101.f4117, C0854.f3277, C0257.f1484, C0772.f2876, C0844.f3259, C3684.f11475, C3587.f11196, C0255.f1482, C2191.f7241, C2193.f7243, C2195.f7245, C2197.f7247, C2202.f7252, C2204.f7254, C2206.f7256, C2208.f7258, C2210.f7260, C2213.f7263, C2215.f7265, C2217.f7267, C2220.f7270, C2222.f7272, C2224.f7274, C2226.f7276, C2228.f7278, C2230.f7280, C2233.f7283, C0334.f1649, C0556.f2314, C0558.f2316, C0806.f3176, C1155.f4268, C1402.f5044, C1624.f5516, C1630.f5522, C2379.f7639, C2695.f8693, C2725.f8744, C2784.f8950, C2884.f9232, C3614.f11308, C3688.f11484, C1786.f5940, C2786.f8952, C2817.f9008, C2823.f9014, C2834.f9037, C2839.f9042, C2841.f9044, C3570.f11167, C0336.f1651, C0665.f2551, C0770.f2874, C0810.f3180, C0818.f3214, C0859.f3282, C1626.f5518, C1628.f5520, C2112.f7005, C2723.f8742, C2803.f8983, C2819.f9010, C3617.f11311, C1900.f6295, C1635.f5529, C2312.f7496, C2313.f7497, C2315.f7498, C2316.f7499, C2318.f7500, C0214.f1358, C0216.f1364, C0218.f1371, C0219.f1376, C0220.f1381, C0129.f1138, C0438.f2010, C0440.f2024, C0448.f2036, C0629.f2480, C0931.f3428, C0934.f3435, C2123.f7022, C2075.f6941, C2084.f6958, C2129.f7031, C2662.f8620, C0196.f1317, C0202.f1327, C0205.f1334, C0318.f1604, C0324.f1625, C0326.f1630, C0330.f1642, C0654.f2534, C1054.f3830, C1057.f3836, C1061.f3843, C1063.f3849, C2114.f7007, C2089.f6967, C2108.f6996, C2115.f7008, C2361.f7587, C2497.f7918, C2507.f7940, C2511.f7948, C2762.f8877, C2780.f8938, C1409.f5086, C1549.f5409, C1552.f5417, C1553.f5422, C1556.f5428, C1558.f5434, C1561.f5440, C2406.f7709, C0194.f1311, C0946.f3467, C0949.f3474, C1325.f4772, C3503.f11018, C0585.f2388, C0586.f2392, C2145.f7082, C2146.f7086, C0191.f1305, C2244.f7308, C1512.f5328, C1525.f5365, C1161.f4280, C1872.f6214, C3680.f11467, C2857.f9085, C2587.f8222, C2589.f8227, C2591.f8232, C2592.f8236, C2599.f8249, C1177.f4304, C2090.f6973, C2124.f7023, C3676.f11458, C3686.f11477, C2394.f7671, C2502.f7932, C0718.f2728, C2116.f7012, C2331.f7527, C2499.f7924, C2064.f6913, C2065.f6917, C2067.f6924, RunnableC0315.f1597, C0322.f1611, C0723.f2749, C1050.f3823, C2020.f6715, C2138.f7064, C2693.f8686, C2753.f8853, C2941.f9397, C2567.f8181, C2568.f8185, C0206.f1339, C0208.f1345, C0210.f1350, C2821.f9012, C2782.f8943, C2787.f8953, C2792.f8961, C2793.f8965, C2800.f8975, C2815.f9003, C2827.f9018, C2831.f9030, C0653.f2528, C0656.f2539, C1369.f4885, C0615.f2456, C2757.f8862, C2758.f8866, C2759.f8870, C3671.f11440, C3673.f11447, C1480.f5271, C1482.f5274, C2142.f7073, C3677.f11462, C0660.f2544, C2340.f7549, C0189.f1299, C1019.f3722, C1064.f3853, C0752.f2846, C3739.f11697};
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final void m4202(InterfaceC0876 interfaceC0876, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC0879.f3311.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0878) it.next()).mo1339(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC1272.m3094(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC1272.m3094(th, new C1032(interfaceC0876));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final int m4203(InterfaceC2715 interfaceC2715, InterfaceC2715[] interfaceC2715Arr) {
        int iHashCode = (interfaceC2715.mo1488().hashCode() * 31) + Arrays.hashCode(interfaceC2715Arr);
        C0067 c0067 = new C0067(interfaceC2715);
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!c0067.hasNext()) {
                break;
            }
            int i2 = i * 31;
            String strMo1488 = ((InterfaceC2715) c0067.next()).mo1488();
            if (strMo1488 != null) {
                iHashCode3 = strMo1488.hashCode();
            }
            i = i2 + iHashCode3;
        }
        C0067 c0068 = new C0067(interfaceC2715);
        while (c0068.hasNext()) {
            int i3 = iHashCode2 * 31;
            AbstractC2236 abstractC2236Mo3640 = ((InterfaceC2715) c0068.next()).mo3640();
            iHashCode2 = i3 + (abstractC2236Mo3640 != null ? abstractC2236Mo3640.hashCode() : 0);
        }
        return (((iHashCode * 31) + i) * 31) + iHashCode2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static Typeface m4204(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC2234.m4158(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0179  */
    /* JADX WARN: Code duplicated, block: B:109:0x0194 A[LOOP:7: B:108:0x0192->B:109:0x0194, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:141:0x0232  */
    /* JADX WARN: Code duplicated, block: B:144:0x023c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0240  */
    /* JADX WARN: Code duplicated, block: B:148:0x0244  */
    /* JADX WARN: Code duplicated, block: B:150:0x0248  */
    /* JADX WARN: Code duplicated, block: B:151:0x024a  */
    /* JADX WARN: Code duplicated, block: B:152:0x024d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0250  */
    /* JADX WARN: Code duplicated, block: B:154:0x0253  */
    /* JADX WARN: Code duplicated, block: B:156:0x0257  */
    /* JADX WARN: Code duplicated, block: B:164:0x026c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x026e  */
    /* JADX WARN: Code duplicated, block: B:168:0x027c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x027e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0291  */
    /* JADX WARN: Code duplicated, block: B:206:0x022c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x018d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:89:0x0128  */
    /* JADX WARN: Code duplicated, block: B:91:0x0138  */
    /* JADX WARN: Code duplicated, block: B:98:0x0157 A[LOOP:5: B:97:0x0155->B:98:0x0157, LOOP_END] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static long m4205(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        char cCharAt;
        EnumC1128 enumC1128;
        long jM4193;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        double d;
        char cCharAt2;
        char cCharAt3;
        int i15;
        char cCharAt4;
        char cCharAt5;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        char cCharAt6 = str.charAt(0);
        char c = '-';
        char c2 = '+';
        if (cCharAt6 != '+') {
            i2 = cCharAt6 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i2) != 'P') {
            throw new IllegalArgumentException("");
        }
        int i16 = i2 + 1;
        if (i16 == str.length()) {
            throw new IllegalArgumentException("");
        }
        boolean z = false;
        EnumC1128 enumC1129 = null;
        long jM4227 = 0;
        long jRound = 0;
        while (i16 < str.length()) {
            char cCharAt7 = str.charAt(i16);
            if (cCharAt7 != 'T') {
                C1886 c1886 = C1886.f6254;
                if (c1886.f6256) {
                    char cCharAt8 = str.charAt(i16);
                    if (cCharAt8 == c2) {
                        i3 = i16 + 1;
                        i4 = 1;
                    } else if (cCharAt8 != c) {
                        i3 = i16;
                        i4 = 1;
                    } else {
                        i3 = i16 + 1;
                        i4 = -1;
                    }
                } else {
                    i3 = i16;
                    i4 = 1;
                }
                while (i3 < str.length() && str.charAt(i3) == '0') {
                    i3++;
                }
                long j2 = 0;
                while (true) {
                    if (i3 < str.length()) {
                        char cCharAt9 = str.charAt(i3);
                        i5 = i16;
                        if ('0' <= cCharAt9 && cCharAt9 < ':') {
                            int i17 = cCharAt9 - '0';
                            i6 = i;
                            long j3 = c1886.f6257;
                            if (j2 > j3 || (j2 == j3 && i17 > c1886.f6258)) {
                                while (i3 < str.length() && '0' <= (cCharAt5 = str.charAt(i3)) && cCharAt5 < ':') {
                                    i3++;
                                }
                                if (i3 != str.length()) {
                                    if (i3 != i5 + ((cCharAt7 == '+' || cCharAt7 == '-') ? 1 : 0)) {
                                        j = c1886.f6255;
                                    }
                                }
                                throw new IllegalArgumentException("");
                            }
                            j2 = (j2 << 3) + (j2 << 1) + ((long) i17);
                            i3++;
                            i = i6;
                            i16 = i5;
                        }
                        if (str.charAt(i3) == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            for (i9 = i8; i9 < iMin; i9++) {
                                cCharAt4 = str.charAt(i9);
                                if ('0' <= cCharAt4 || cCharAt4 >= ':') {
                                    for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        i7 = i6;
                                        if (i12 < iMin2) {
                                            cCharAt3 = str.charAt(i12);
                                            i15 = iMin2;
                                            if ('0' > cCharAt3 && cCharAt3 < ':') {
                                                i13 = (cCharAt3 - '0') + (i13 << 3) + (i13 << 1);
                                                i12++;
                                                i6 = i7;
                                                iMin2 = i15;
                                            }
                                        }
                                    }
                                    for (i14 = 0; i14 < 9 - (i12 - i9); i14++) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i12;
                                    while (i3 < str.length() && '0' <= (cCharAt2 = str.charAt(i3)) && cCharAt2 < ':') {
                                        i3++;
                                    }
                                    if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                        throw new IllegalArgumentException("");
                                    }
                                    long j4 = (((long) i10) * ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + ((long) i13);
                                    long j5 = i4;
                                    EnumC1128 enumC11210 = EnumC1128.SECONDS;
                                    double d2 = j4;
                                    switch (enumC11210.ordinal()) {
                                        case 0:
                                            d = 1.0E-15d;
                                            break;
                                        case 1:
                                            d = 1.0E-12d;
                                            break;
                                        case 2:
                                            d = 1.0E-9d;
                                            break;
                                        case 3:
                                            d = 1.0E-6d;
                                            break;
                                        case 4:
                                            d = 6.0E-5d;
                                            break;
                                        case 5:
                                            d = 0.0036d;
                                            break;
                                        case 6:
                                            d = 0.0864d;
                                            break;
                                        default:
                                            throw new IllegalStateException(("Unknown unit: " + enumC11210).toString());
                                    }
                                    double d3 = d2 * d;
                                    if (Double.isNaN(d3)) {
                                        throw new IllegalArgumentException("Cannot round NaN value.");
                                    }
                                    jRound = Math.round(d3) * j5;
                                } else {
                                    i10 = (cCharAt4 - '0') + (i10 << 3) + (i10 << 1);
                                }
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i12 = i9;
                            i13 = 0;
                            while (true) {
                                i7 = i6;
                                if (i12 < iMin2) {
                                    cCharAt3 = str.charAt(i12);
                                    i15 = iMin2;
                                    if ('0' > cCharAt3) {
                                    }
                                }
                                i13 = (cCharAt3 - '0') + (i13 << 3) + (i13 << 1);
                                i12++;
                                i6 = i7;
                                iMin2 = i15;
                            }
                            while (i14 < 9 - (i12 - i9)) {
                                i13 = (i13 << 1) + (i13 << 3);
                            }
                            i3 = i12;
                            while (i3 < str.length()) {
                                i3++;
                            }
                            if (i3 != i8) {
                            }
                            throw new IllegalArgumentException("");
                        }
                        i7 = i6;
                        cCharAt = str.charAt(i3);
                        if (cCharAt != 'D') {
                            enumC1128 = EnumC1128.DAYS;
                        } else if (cCharAt != 'H') {
                            enumC1128 = EnumC1128.HOURS;
                        } else if (cCharAt != 'M') {
                            enumC1128 = EnumC1128.MINUTES;
                        } else if (cCharAt != 'S') {
                            enumC1128 = null;
                        } else {
                            enumC1128 = EnumC1128.SECONDS;
                        }
                        if (enumC1128 != null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (enumC1129 == null && enumC1129.compareTo(enumC1128) <= 0) {
                            throw new IllegalArgumentException("Unexpected order of duration components");
                        }
                        if (enumC1128 == EnumC1128.DAYS) {
                            if (!z) {
                                throw new IllegalArgumentException("");
                            }
                            jM4227 = AbstractC2236.m4227(j, enumC1128) * ((long) i4);
                        } else {
                            if (z) {
                                throw new IllegalArgumentException("");
                            }
                            jM4193 = m4193(jM4227, AbstractC2236.m4227(j, enumC1128) * ((long) i4));
                            if (jM4193 != 9223372036854759646L) {
                                throw new IllegalArgumentException("");
                            }
                            jM4227 = jM4193;
                        }
                        EnumC1128 enumC11211 = enumC1128;
                        i16 = i3 + 1;
                        enumC1129 = enumC11211;
                        i = i7;
                        c = '-';
                        c2 = '+';
                    } else {
                        i5 = i16;
                    }
                    i6 = i;
                    if (i3 != str.length()) {
                        if (i3 != i5 + ((cCharAt7 == '+' || cCharAt7 == '-') ? 1 : 0)) {
                            j = j2;
                            if (str.charAt(i3) == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt4 = str.charAt(i9);
                                    if ('0' <= cCharAt4) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        i7 = i6;
                                        if (i12 < iMin2) {
                                            cCharAt3 = str.charAt(i12);
                                            i15 = iMin2;
                                            if ('0' > cCharAt3) {
                                            }
                                        }
                                        i13 = (cCharAt3 - '0') + (i13 << 3) + (i13 << 1);
                                        i12++;
                                        i6 = i7;
                                        iMin2 = i15;
                                    }
                                    while (i14 < 9 - (i12 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i12;
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    throw new IllegalArgumentException("");
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    i7 = i6;
                                    if (i12 < iMin2) {
                                        cCharAt3 = str.charAt(i12);
                                        i15 = iMin2;
                                        if ('0' > cCharAt3) {
                                        }
                                    }
                                    i13 = (cCharAt3 - '0') + (i13 << 3) + (i13 << 1);
                                    i12++;
                                    i6 = i7;
                                    iMin2 = i15;
                                }
                                while (i14 < 9 - (i12 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i12;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                throw new IllegalArgumentException("");
                            }
                            i7 = i6;
                            cCharAt = str.charAt(i3);
                            if (cCharAt != 'D') {
                                enumC1128 = EnumC1128.DAYS;
                            } else if (cCharAt != 'H') {
                                enumC1128 = EnumC1128.HOURS;
                            } else if (cCharAt != 'M') {
                                enumC1128 = EnumC1128.MINUTES;
                            } else if (cCharAt != 'S') {
                                enumC1128 = null;
                            } else {
                                enumC1128 = EnumC1128.SECONDS;
                            }
                            if (enumC1128 != null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (enumC1129 == null) {
                            }
                            if (enumC1128 == EnumC1128.DAYS) {
                                if (!z) {
                                    throw new IllegalArgumentException("");
                                }
                                jM4227 = AbstractC2236.m4227(j, enumC1128) * ((long) i4);
                            } else {
                                if (z) {
                                    throw new IllegalArgumentException("");
                                }
                                jM4193 = m4193(jM4227, AbstractC2236.m4227(j, enumC1128) * ((long) i4));
                                if (jM4193 != 9223372036854759646L) {
                                    throw new IllegalArgumentException("");
                                }
                                jM4227 = jM4193;
                            }
                            EnumC1128 enumC11212 = enumC1128;
                            i16 = i3 + 1;
                            enumC1129 = enumC11212;
                            i = i7;
                            c = '-';
                            c2 = '+';
                        }
                    }
                    throw new IllegalArgumentException("");
                }
            }
            if (z || (i16 = i16 + 1) == str.length()) {
                throw new IllegalArgumentException("");
            }
            z = true;
        }
        int i18 = i;
        long jM2847 = C1125.m2847(m4216(jM4227, EnumC1128.MILLISECONDS), m4216(jRound, EnumC1128.NANOSECONDS));
        if (i18 == 0 || jM2847 == C1125.f4193) {
            return jM2847;
        }
        long j6 = ((-(jM2847 >> 1)) << 1) + ((long) (((int) jM2847) & 1));
        int i19 = AbstractC1126.f4195;
        return j6;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static int[] m4206(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM2278 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM2278 += (int) AbstractC0738.m2278(byteArrayInputStream, 2);
            iArr[i2] = iM2278;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static C1030[] m4207(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C1030[] c1030Arr) throws IOException {
        byte[] bArr3 = AbstractC2236.f7296;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, AbstractC2236.f7297)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM2278 = (int) AbstractC0738.m2278(fileInputStream, 2);
            byte[] bArrM2277 = AbstractC0738.m2277(fileInputStream, (int) AbstractC0738.m2278(fileInputStream, 4), (int) AbstractC0738.m2278(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2277);
            try {
                C1030[] c1030ArrM4209 = m4209(byteArrayInputStream, bArr2, iM2278, c1030Arr);
                byteArrayInputStream.close();
                return c1030ArrM4209;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(AbstractC2236.f7291, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2279 = (int) AbstractC0738.m2278(fileInputStream, 1);
        byte[] bArrM2278 = AbstractC0738.m2277(fileInputStream, (int) AbstractC0738.m2278(fileInputStream, 4), (int) AbstractC0738.m2278(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM2278);
        try {
            C1030[] c1030ArrM4208 = m4208(byteArrayInputStream2, iM2279, c1030Arr);
            byteArrayInputStream2.close();
            return c1030ArrM4208;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static C1030[] m4208(ByteArrayInputStream byteArrayInputStream, int i, C1030[] c1030Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1030[0];
        }
        if (i != c1030Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM2278 = (int) AbstractC0738.m2278(byteArrayInputStream, 2);
            iArr[i2] = (int) AbstractC0738.m2278(byteArrayInputStream, 2);
            strArr[i2] = new String(AbstractC0738.m2276(byteArrayInputStream, iM2278), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C1030 c1030 = c1030Arr[i3];
            if (!c1030.f3770.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c1030.f3773 = i4;
            c1030.f3776 = m4206(byteArrayInputStream, i4);
        }
        return c1030Arr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static C1030[] m4209(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C1030[] c1030Arr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C1030[0];
        }
        if (i != c1030Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC0738.m2278(byteArrayInputStream, 2);
            String str = new String(AbstractC0738.m2276(byteArrayInputStream, (int) AbstractC0738.m2278(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM2278 = AbstractC0738.m2278(byteArrayInputStream, 4);
            int iM2278 = (int) AbstractC0738.m2278(byteArrayInputStream, 2);
            C1030 c1030 = null;
            if (c1030Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < c1030Arr.length; i3++) {
                    if (c1030Arr[i3].f3770.equals(strSubstring)) {
                        c1030 = c1030Arr[i3];
                        break;
                    }
                }
            }
            if (c1030 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c1030.f3772 = jM2278;
            int[] iArrM4206 = m4206(byteArrayInputStream, iM2278);
            if (Arrays.equals(bArr, AbstractC2236.f7295)) {
                c1030.f3773 = iM2278;
                c1030.f3776 = iArrM4206;
            }
        }
        return c1030Arr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static C1030[] m4210(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC2236.f7292)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM2278 = (int) AbstractC0738.m2278(fileInputStream, 1);
        byte[] bArrM2277 = AbstractC0738.m2277(fileInputStream, (int) AbstractC0738.m2278(fileInputStream, 4), (int) AbstractC0738.m2278(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2277);
        try {
            C1030[] c1030ArrM4211 = m4211(byteArrayInputStream, str, iM2278);
            byteArrayInputStream.close();
            return c1030ArrM4211;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static C1030[] m4211(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C1030[0];
        }
        C1030[] c1030Arr = new C1030[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM2278 = (int) AbstractC0738.m2278(byteArrayInputStream, 2);
            int iM2279 = (int) AbstractC0738.m2278(byteArrayInputStream, 2);
            c1030Arr[i3] = new C1030(str, new String(AbstractC0738.m2276(byteArrayInputStream, iM2278), StandardCharsets.UTF_8), AbstractC0738.m2278(byteArrayInputStream, 4), iM2279, (int) AbstractC0738.m2278(byteArrayInputStream, 4), (int) AbstractC0738.m2278(byteArrayInputStream, 4), new int[iM2279], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C1030 c1030 = c1030Arr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c1030.f3774;
            int i6 = c1030.f3775;
            TreeMap treeMap = c1030.f3777;
            int i7 = iAvailable - i5;
            int iM22710 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM22710 += (int) AbstractC0738.m2278(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM22710), 1);
                int iM22711 = (int) AbstractC0738.m2278(byteArrayInputStream, 2);
                while (iM22711 > 0) {
                    AbstractC0738.m2278(byteArrayInputStream, 2);
                    int iM22712 = (int) AbstractC0738.m2278(byteArrayInputStream, 1);
                    if (iM22712 != 6 && iM22712 != 7) {
                        while (iM22712 > 0) {
                            AbstractC0738.m2278(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM22713 = (int) AbstractC0738.m2278(byteArrayInputStream, 1); iM22713 > 0; iM22713--) {
                                AbstractC0738.m2278(byteArrayInputStream, 2);
                            }
                            iM22712--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM22711--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c1030.f3776 = m4206(byteArrayInputStream, c1030.f3773);
            BitSet bitSetValueOf = BitSet.valueOf(AbstractC0738.m2276(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return c1030Arr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final void m4212(InterfaceC0841 interfaceC0841, Object obj) throws C1076 {
        if (!(interfaceC0841 instanceof C1077)) {
            interfaceC0841.mo1077(obj);
            return;
        }
        C1077 c1077 = (C1077) interfaceC0841;
        AbstractC0877 abstractC0877 = c1077.f3898;
        AbstractC0842 abstractC0842 = c1077.f3899;
        InterfaceC0876 interfaceC0876 = abstractC0842.f3256;
        Throwable thM4616 = C2642.m4616(obj);
        Object c0757 = thM4616 == null ? obj : new C0757(thM4616, false);
        try {
            if (abstractC0877.mo2510(interfaceC0876)) {
                c1077.f3900 = c0757;
                c1077.f3903 = 1;
                m4213(abstractC0877, interfaceC0876, c1077);
                return;
            }
            AbstractC1237 abstractC1237M4983 = AbstractC2979.m4983();
            if (abstractC1237M4983.f4461 >= JSONWriter.MASK_IGNORE_NON_FIELD_GETTER) {
                c1077.f3900 = c0757;
                c1077.f3903 = 1;
                C0266 c0266 = abstractC1237M4983.f4463;
                if (c0266 == null) {
                    c0266 = new C0266();
                    abstractC1237M4983.f4463 = c0266;
                }
                c0266.addLast(c1077);
                return;
            }
            abstractC1237M4983.m2996(true);
            try {
                InterfaceC1716 interfaceC1716 = (InterfaceC1716) interfaceC0876.mo1086(C1139.f4219);
                if (interfaceC1716 == null || interfaceC1716.mo3605()) {
                    Object objM4910 = AbstractC2902.m4910(interfaceC0876, c1077.f3901);
                    C3550 c3550M4189 = objM4910 != AbstractC2902.f9274 ? AbstractC2234.m4189(abstractC0842, interfaceC0876, objM4910) : null;
                    try {
                        abstractC0842.mo1077(obj);
                        if (c3550M4189 == null || c3550M4189.m5104()) {
                            AbstractC2902.m4899(interfaceC0876, objM4910);
                        }
                    } catch (Throwable th) {
                        if (c3550M4189 == null || c3550M4189.m5104()) {
                            AbstractC2902.m4899(interfaceC0876, objM4910);
                        }
                        throw th;
                    }
                } else {
                    c1077.mo1077(new C2641(interfaceC1716.mo3608()));
                }
                while (abstractC1237M4983.m2997()) {
                }
            } catch (Throwable th2) {
                try {
                    c1077.m2763(th2);
                } finally {
                    abstractC1237M4983.m2995();
                }
            }
        } catch (Throwable th3) {
            throw new C1076(th3, abstractC0877, interfaceC0876);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final void m4213(AbstractC0877 abstractC0877, InterfaceC0876 interfaceC0876, Runnable runnable) {
        try {
            abstractC0877.mo2509(interfaceC0876, runnable);
        } catch (Throwable th) {
            throw new C1076(th, abstractC0877, interfaceC0876);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static void m4214(String str, String str2, Object obj) {
        C0257.f1484.getClass();
        int i = AbstractC1768.f5906;
        C2004 c2004M3560 = AbstractC2727.m4712(AbstractC0972.m2610(C0256.f1483).getDeclaringClass()).m3560();
        c2004M3560.m3994(EnumC2030.STATIC);
        Class cls = Integer.TYPE;
        c2004M3560.f6648 = AbstractC2574.m4549(cls);
        String[] strArr = AbstractC1471.f5234;
        ((C2013) AbstractC2844.m4777(new Object[]{"com.tencent.mm.opensdk.modelmsg.WXMediaMessage", AbstractC2574.m4549(String.class), AbstractC2574.m4549(String.class), AbstractC2574.m4549(String.class), AbstractC2574.m4549(cls), AbstractC2574.m4549(String.class)}, 6, c2004M3560)).m4025(obj, str2, "", str, 2, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static void m4215(Activity activity, View view) {
        AbstractC1469 abstractC1469 = AbstractC1037.f3785;
        FrameLayout frameLayout = new FrameLayout(activity);
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 16;
        layoutParams.format = -2;
        layoutParams.type = 1003;
        layoutParams.flags = 201327872;
        layoutParams.softInputMode = 16;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        windowManager.addView(frameLayout, layoutParams);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static final long m4216(long j, EnumC1128 enumC1128) {
        EnumC1128 enumC1129 = EnumC1128.NANOSECONDS;
        TimeUnit timeUnit = enumC1128.f4205;
        TimeUnit timeUnit2 = enumC1128.f4205;
        long jConvert = timeUnit.convert(4611686018426999999L, enumC1129.f4205);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = enumC1129.f4205.convert(j, timeUnit2);
            C0348 c0348 = C1125.f4190;
            long j2 = jConvert2 << 1;
            int i = AbstractC1126.f4195;
            return j2;
        }
        EnumC1128 enumC11210 = EnumC1128.MILLISECONDS;
        if (enumC1128.compareTo(enumC11210) < 0) {
            return m4198(AbstractC3744.m5329(enumC11210.f4205.convert(j, timeUnit2)));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return m4198(AbstractC2236.m4227(Math.abs(j), enumC1128) * jSignum);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static final String m4217(InterfaceC2715 interfaceC2715) {
        return AbstractC0739.m2295(AbstractC3744.m5348(0, interfaceC2715.mo3641()), ", ", interfaceC2715.mo1488() + '(', ")", new C0439(interfaceC2715, 1), 24);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static boolean m4218(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C1030[] c1030Arr) throws IOException {
        long j;
        int length;
        byte[] bArr2 = AbstractC2236.f7295;
        byte[] bArr3 = AbstractC2236.f7294;
        byte[] bArr4 = AbstractC2236.f7291;
        int i = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                AbstractC0738.m2285(byteArrayOutputStream2, c1030Arr.length);
                int i2 = 2;
                int i3 = 2;
                for (C1030 c1030 : c1030Arr) {
                    AbstractC0738.m2284(byteArrayOutputStream2, c1030.f3771, 4);
                    AbstractC0738.m2284(byteArrayOutputStream2, c1030.f3772, 4);
                    AbstractC0738.m2284(byteArrayOutputStream2, c1030.f3775, 4);
                    String strM4200 = m4200(c1030.f3769, c1030.f3770, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strM4200.getBytes(charset).length;
                    AbstractC0738.m2285(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(strM4200.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
                }
                C3731 c3731 = new C3731(byteArray, 1, false);
                byteArrayOutputStream2.close();
                arrayList.add(c3731);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i4 = 0;
                int i5 = 0;
                while (i4 < c1030Arr.length) {
                    try {
                        C1030 c1031 = c1030Arr[i4];
                        AbstractC0738.m2285(byteArrayOutputStream3, i4);
                        AbstractC0738.m2285(byteArrayOutputStream3, c1031.f3773);
                        i5 = i5 + 4 + (c1031.f3773 * i2);
                        int[] iArr = c1031.f3776;
                        int length3 = iArr.length;
                        int i6 = i;
                        int i7 = i2;
                        int i8 = i6;
                        while (i8 < length3) {
                            int i9 = iArr[i8];
                            AbstractC0738.m2285(byteArrayOutputStream3, i9 - i6);
                            i8++;
                            i6 = i9;
                        }
                        i4++;
                        i2 = i7;
                        i = 0;
                    } catch (Throwable th) {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i5 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                C3731 c3732 = new C3731(byteArray2, 3, true);
                byteArrayOutputStream3.close();
                arrayList.add(c3732);
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < c1030Arr.length) {
                    try {
                        C1030 c1032 = c1030Arr[i10];
                        Iterator it = c1032.f3777.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                        try {
                            m4221(byteArrayOutputStream5, c1032);
                            byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                            byteArrayOutputStream5.close();
                            ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                            try {
                                m4222(byteArrayOutputStream6, c1032);
                                byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                                byteArrayOutputStream6.close();
                                AbstractC0738.m2285(byteArrayOutputStream4, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i11 + 6;
                                int i13 = i10;
                                AbstractC0738.m2284(byteArrayOutputStream4, length4, 4);
                                AbstractC0738.m2285(byteArrayOutputStream4, iIntValue);
                                byteArrayOutputStream4.write(byteArray3);
                                byteArrayOutputStream4.write(byteArray4);
                                i11 = i12 + length4;
                                i10 = i13 + 1;
                            } catch (Throwable th3) {
                                try {
                                    byteArrayOutputStream6.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                byteArrayOutputStream5.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            byteArrayOutputStream4.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
                if (i11 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                }
                C3731 c3733 = new C3731(byteArray5, 4, true);
                byteArrayOutputStream4.close();
                arrayList.add(c3733);
                long j2 = 4;
                long size = j2 + j2 + 4 + ((long) (arrayList.size() * 16));
                AbstractC0738.m2284(byteArrayOutputStream, arrayList.size(), 4);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    C3731 c3734 = (C3731) arrayList.get(i14);
                    int i15 = c3734.f11607;
                    byte[] bArr5 = c3734.f11608;
                    if (i15 == 1) {
                        j = 0;
                    } else if (i15 == 2) {
                        j = 1;
                    } else if (i15 == 3) {
                        j = 2;
                    } else if (i15 == 4) {
                        j = 3;
                    } else {
                        if (i15 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                    AbstractC0738.m2284(byteArrayOutputStream, j, 4);
                    AbstractC0738.m2284(byteArrayOutputStream, size, 4);
                    if (c3734.f11609) {
                        long length5 = bArr5.length;
                        byte[] bArrM2265 = AbstractC0738.m2265(bArr5);
                        arrayList2.add(bArrM2265);
                        AbstractC0738.m2284(byteArrayOutputStream, bArrM2265.length, 4);
                        AbstractC0738.m2284(byteArrayOutputStream, length5, 4);
                        length = bArrM2265.length;
                    } else {
                        arrayList2.add(bArr5);
                        AbstractC0738.m2284(byteArrayOutputStream, bArr5.length, 4);
                        AbstractC0738.m2284(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += (long) length;
                }
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i16));
                }
            } catch (Throwable th9) {
                try {
                    byteArrayOutputStream2.close();
                    throw th9;
                } catch (Throwable th10) {
                    th9.addSuppressed(th10);
                    throw th9;
                }
            }
        } else {
            byte[] bArr6 = AbstractC2236.f7292;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM4196 = m4196(c1030Arr, bArr6);
                AbstractC0738.m2284(byteArrayOutputStream, c1030Arr.length, 1);
                AbstractC0738.m2284(byteArrayOutputStream, bArrM4196.length, 4);
                byte[] bArrM2266 = AbstractC0738.m2265(bArrM4196);
                AbstractC0738.m2284(byteArrayOutputStream, bArrM2266.length, 4);
                byteArrayOutputStream.write(bArrM2266);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                AbstractC0738.m2284(byteArrayOutputStream, c1030Arr.length, 1);
                for (C1030 c1033 : c1030Arr) {
                    int size2 = c1033.f3777.size() * 4;
                    String strM4201 = m4200(c1033.f3769, c1033.f3770, bArr3);
                    Charset charset2 = StandardCharsets.UTF_8;
                    AbstractC0738.m2285(byteArrayOutputStream, strM4201.getBytes(charset2).length);
                    AbstractC0738.m2285(byteArrayOutputStream, c1033.f3776.length);
                    AbstractC0738.m2284(byteArrayOutputStream, size2, 4);
                    AbstractC0738.m2284(byteArrayOutputStream, c1033.f3771, 4);
                    byteArrayOutputStream.write(strM4201.getBytes(charset2));
                    Iterator it2 = c1033.f3777.keySet().iterator();
                    while (it2.hasNext()) {
                        AbstractC0738.m2285(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        AbstractC0738.m2285(byteArrayOutputStream, 0);
                    }
                    for (int i17 : c1033.f3776) {
                        AbstractC0738.m2285(byteArrayOutputStream, i17);
                    }
                }
            } else {
                byte[] bArr7 = AbstractC2236.f7293;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrM4197 = m4196(c1030Arr, bArr7);
                    AbstractC0738.m2284(byteArrayOutputStream, c1030Arr.length, 1);
                    AbstractC0738.m2284(byteArrayOutputStream, bArrM4197.length, 4);
                    byte[] bArrM2267 = AbstractC0738.m2265(bArrM4197);
                    AbstractC0738.m2284(byteArrayOutputStream, bArrM2267.length, 4);
                    byteArrayOutputStream.write(bArrM2267);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                AbstractC0738.m2285(byteArrayOutputStream, c1030Arr.length);
                for (C1030 c1034 : c1030Arr) {
                    String str = c1034.f3769;
                    TreeMap treeMap = c1034.f3777;
                    String strM4202 = m4200(str, c1034.f3770, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    AbstractC0738.m2285(byteArrayOutputStream, strM4202.getBytes(charset3).length);
                    AbstractC0738.m2285(byteArrayOutputStream, treeMap.size());
                    AbstractC0738.m2285(byteArrayOutputStream, c1034.f3776.length);
                    AbstractC0738.m2284(byteArrayOutputStream, c1034.f3771, 4);
                    byteArrayOutputStream.write(strM4202.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        AbstractC0738.m2285(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i18 : c1034.f3776) {
                        AbstractC0738.m2285(byteArrayOutputStream, i18);
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static C0697 m4219(C0102 c0102, C1046 c1046, C0561 c0561, C0561 c0562, C1026 c1026) {
        C0173 c0173;
        C0225 c0225M4632;
        C0173 c0174;
        C2332 c2332 = (C2332) c0102.f1117;
        if (!c2332.f7533) {
            c2332.f7533 = true;
        }
        c1046.m2737();
        C0917 c0917 = c1046.f3807;
        c1046.m2737();
        int i = c1046.f3806 & (-33);
        c1046.m2736();
        AbstractC0344 abstractC0344M1750 = c1046.f3812.m1750("SourceFile");
        C0916 c0916 = abstractC0344M1750 instanceof C0307 ? ((C0307) abstractC0344M1750).f1582 : null;
        c1046.m2737();
        C0917 c0918 = c1046.f3808;
        c1046.m2737();
        C0697 c0697 = new C0697(c0917, i, c0918, c1046.f3809, c0916);
        c1046.m2737();
        C0917 c0919 = c1046.f3807;
        c1046.m2736();
        C0417 c0417 = c1046.f3812;
        C0185 c0185M2268 = AbstractC0738.m2268(c0417);
        C0296 c0296 = (C0296) c0417.m1750("EnclosingMethod");
        char c = 3;
        if (c0296 == null) {
            c0173 = null;
        } else {
            C0917 c09110 = c0296.f1574;
            C0913 c0913 = c0296.f1575;
            if (c0913 == null) {
                c0173 = new C0173(AbstractC0184.f1281, 3);
                c0173.m1363(new C2152(AbstractC0184.f1290, c09110));
                c0173.f7068 = false;
            } else {
                C0912 c0912 = new C0912(c09110, c0913);
                c0173 = new C0173(AbstractC0184.f1282, 3);
                c0173.m1363(new C2152(AbstractC0184.f1290, c0912));
                c0173.f7068 = false;
            }
        }
        try {
            C0185 c0185M2282 = AbstractC0738.m2282(c0919, c0417, c0173 == null);
            if (c0185M2282 != null) {
                C0185 c0185 = new C0185();
                c0185.m1375(c0185M2268);
                c0185.m1375(c0185M2282);
                c0185.f7068 = false;
                c0185M2268 = c0185;
            }
        } catch (C3689 e) {
            c0561.f2319.println("warning: " + e.getMessage());
        }
        if (c0173 != null) {
            c0185M2268 = C0185.m1373(c0185M2268, c0173);
        }
        c1046.m2737();
        if ((c1046.f3806 & 8192) != 0) {
            c1046.m2737();
            C0917 c09111 = c1046.f3807;
            c1046.m2736();
            C0417 c0418 = c1046.f3811;
            int length = c0418.f4833.length;
            C0173 c0175 = new C0173(c09111, 4);
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                InterfaceC2002 interfaceC2002 = (InterfaceC2002) c0418.m3165(i2);
                C0291 c0291 = (C0291) interfaceC2002.getAttributes().m1750("AnnotationDefault");
                if (c0291 != null) {
                    c0175.m1361(new C2152(interfaceC2002.mo2361().f3381, c0291.f1563));
                    z = true;
                }
            }
            if (z) {
                c0175.f7068 = false;
                c0174 = new C0173(AbstractC0184.f1280, 3);
                c0174.m1363(new C2152(AbstractC0184.f1290, new C0887(c0175)));
                c0174.f7068 = false;
            } else {
                c0174 = null;
            }
            if (c0174 != null) {
                c0185M2268 = C0185.m1373(c0185M2268, c0174);
            }
        }
        if (c0185M2268.f1292.size() != 0) {
            C0186 c0186 = c0697.f2671;
            if (c0186.f1293 != null) {
                throw new UnsupportedOperationException("class annotations already set");
            }
            c0186.f1293 = new C0182(c0185M2268, c1026);
        }
        C1302 c1302 = c1026.f3751;
        C2010 c2010 = c1026.f3752;
        C2008 c2008 = c1026.f3756;
        C0525 c0525 = c1026.f3755;
        c1046.m2737();
        C0917 c09112 = c1046.f3807;
        c1046.m2736();
        C0417 c0419 = c1046.f3810;
        int length2 = c0419.f4833.length;
        int i3 = 0;
        while (i3 < length2) {
            C2876 c2876 = (C2876) c0419.m3165(i3);
            char c2 = c;
            C0417 c04110 = c2876.f9190;
            C0913 c0914 = c2876.f9189;
            try {
                C0898 c0898 = new C0898(c09112, c0914);
                int i4 = c2876.f9188;
                if ((i4 & 8) != 0) {
                    C0294 c0294 = (C0294) c04110.m1750("ConstantValue");
                    AbstractC3514 abstractC3514M4195 = c0294 == null ? null : c0294.f1572;
                    C1204 c1204 = new C1204(c0898, i4);
                    if (abstractC3514M4195 != null) {
                        abstractC3514M4195 = m4195(abstractC3514M4195, c0914.m2545());
                    }
                    C0695 c0695 = c0697.f2669;
                    if (c0695.f2662 != null) {
                        throw new UnsupportedOperationException("static fields already sorted");
                    }
                    c0695.f2657.add(c1204);
                    c0695.f2658.put(c1204, abstractC3514M4195);
                } else {
                    c0697.f2669.f2659.add(new C1204(c0898, i4));
                }
                C0185 c0185M2269 = AbstractC0738.m2268(c04110);
                if (c0185M2269.f1292.size() != 0) {
                    C0186 c0187 = c0697.f2671;
                    if (c0187.f1294 == null) {
                        c0187.f1294 = new ArrayList();
                    }
                    c0187.f1294.add(new C1299(c0898, new C0182(c0185M2269, c1026)));
                }
                c1026.f3751.m3121(c0898);
                i3++;
                c = c2;
                c09112 = c09112;
                c0419 = c0419;
            } catch (RuntimeException e2) {
                throw C1240.m3003("...while processing " + c0914.f3381.mo1360() + " " + c0914.f3382.mo1360(), e2);
            }
        }
        c1046.m2737();
        C0917 c09113 = c1046.f3807;
        c1046.m2736();
        C0417 c04111 = c1046.f3811;
        int length3 = c04111.f4833.length;
        int i5 = 0;
        while (i5 < length3) {
            InterfaceC2002 interfaceC2003 = (InterfaceC2002) c04111.m3165(i5);
            try {
                C0913 c0913Mo2361 = interfaceC2003.mo2361();
                C0912 c0915 = new C0912(c09113, c0913Mo2361);
                int iMo2360 = interfaceC2003.mo2360();
                boolean z2 = (iMo2360 & 8) != 0;
                boolean z3 = (iMo2360 & 2) != 0;
                int i6 = length3;
                boolean z4 = (iMo2360 & bc.e) != 0;
                boolean z5 = (iMo2360 & 1024) != 0;
                int i7 = i5;
                boolean z6 = c0913Mo2361.f3381.f3385.equals("<init>") || c0913Mo2361.f3381.f3385.equals("<clinit>");
                if (z4 || z5) {
                    z6 = z6;
                    c0225M4632 = null;
                } else {
                    C0776 c0776M4635 = C2654.m4635(new C0766(interfaceC2003, c1046), c04111, c0562);
                    C2492 c2492 = c0915.f3337;
                    if (!z2) {
                        if (c0915.f3338 == null) {
                            c0915.f3338 = c2492.m4444(c09113.f3408);
                        }
                        c2492 = c0915.f3338;
                    }
                    int iM4830 = c2492.f7900.m4830();
                    String str = c09113.f3408.f11064;
                    String str2 = interfaceC2003.getName().f3385;
                    c0225M4632 = C2650.m4632(c0776M4635, iM4830, c0562);
                }
                if ((iMo2360 & 32) != 0) {
                    iMo2360 |= 131072;
                    if (!z4) {
                        iMo2360 &= -33;
                    }
                }
                if (z6) {
                    iMo2360 |= 65536;
                }
                C0297 c0297 = (C0297) interfaceC2003.getAttributes().m1750("Exceptions");
                C1206 c1206 = new C1206(c0915, iMo2360, c0225M4632, c0297 == null ? C2879.f9192 : c0297.f1576);
                if (c0913Mo2361.f3381.f3385.equals("<init>") || c0913Mo2361.f3381.f3385.equals("<clinit>") || z2 || z3) {
                    c0697.f2669.f2660.add(c1206);
                } else {
                    c0697.f2669.f2661.add(c1206);
                }
                C0185 c0185M2270 = AbstractC0738.m2270(interfaceC2003);
                if (c0185M2270.f1292.size() != 0) {
                    C0186 c0188 = c0697.f2671;
                    if (c0188.f1295 == null) {
                        c0188.f1295 = new ArrayList();
                    }
                    c0188.f1295.add(new C2003(c0915, new C0182(c0185M2270, c1026)));
                }
                C0187 c0187M2272 = AbstractC0738.m2272(interfaceC2003);
                if (c0187M2272.f4833.length != 0) {
                    C0186 c0189 = c0697.f2671;
                    if (c0189.f1296 == null) {
                        c0189.f1296 = new ArrayList();
                    }
                    c0189.f1296.add(new C2364(c0915, c0187M2272, c1026));
                }
                c1026.f3752.m4009(c0915);
                i5 = i7 + 1;
                length3 = i6;
                c04111 = c04111;
            } catch (RuntimeException e3) {
                throw C1240.m3003("...while processing " + interfaceC2003.getName().mo1360() + " " + interfaceC2003.mo2357().mo1360(), e3);
            }
        }
        c1046.m2737();
        C2875 c2875 = c1046.f3805;
        int length4 = c2875.f9186.length;
        for (int i8 = 0; i8 < length4; i8++) {
            try {
                AbstractC0775 abstractC0775 = c2875.f9186[i8];
                if (abstractC0775 instanceof C0912) {
                    c2010.m4009((AbstractC0890) abstractC0775);
                } else if (abstractC0775 instanceof C0903) {
                    c2010.m4009(((C0903) abstractC0775).m2539());
                } else if (abstractC0775 instanceof C0898) {
                    c1302.m3121((C0898) abstractC0775);
                } else if (abstractC0775 instanceof C0897) {
                    c1302.m3121(((C0897) abstractC0775).m2529());
                } else if (abstractC0775 instanceof C0911) {
                    c2008.m4004((C0911) abstractC0775);
                } else {
                    if (abstractC0775 instanceof C0904) {
                        C0904 c0904 = (C0904) abstractC0775;
                        int i9 = c0904.f3364;
                        c1046.m2736();
                        C0292 c0292 = (C0292) c1046.f3812.m1750("BootstrapMethods");
                        C0418 c04112 = (C0418) (c0292 != null ? c0292.f1565 : C0419.f1984).m3165(i9);
                        C0911 c0911 = c04112.f1983;
                        C0913 c09114 = c0904.f3365;
                        C0417 c04113 = c04112.f1982;
                        if (c0911 == null) {
                            throw new NullPointerException("bootstrapMethodHandle == null");
                        }
                        if (c09114 == null) {
                            throw new NullPointerException("nat == null");
                        }
                        C0888 c0888 = new C0888(c04113.f4833.length + 3);
                        c0888.m3166(0, c0911);
                        c0888.m3166(1, c09114.f3381);
                        c0888.m3166(2, new C0914(C2492.m4440(c09114.f3382.f3385)));
                        for (int i10 = 0; i10 < c04113.f4833.length; i10++) {
                            c0888.m3166(i10 + 3, (AbstractC0775) c04113.m3165(i10));
                        }
                        c0888.f7068 = false;
                        C0893 c0893 = new C0893(c0888);
                        c1046.m2737();
                        C0917 c09115 = c1046.f3807;
                        if (c0904.f3367 != null) {
                            throw new IllegalArgumentException("already added declaring class");
                        }
                        if (c09115 == null) {
                            throw new NullPointerException("declaringClass == null");
                        }
                        c0904.f3367 = c09115;
                        if (c0904.f3368 != null) {
                            throw new IllegalArgumentException("already added call site");
                        }
                        c0904.f3368 = c0893;
                        for (C0894 c0894 : c0904.f3369) {
                            synchronized (c0525) {
                                if (c0894 == null) {
                                    throw new NullPointerException("cstRef");
                                }
                                c0525.m4672();
                                if (((C0524) c0525.f2217.get(c0894)) == null) {
                                    c0525.f2217.put(c0894, new C0524(c0894));
                                }
                                throw th;
                            }
                        }
                    }
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new C1240("invalid constant pool index ".concat(AbstractC2902.m4906(i8)), null);
            }
        }
        return c0697;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static void m4220(ByteArrayOutputStream byteArrayOutputStream, C1030 c1030, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC0738.m2285(byteArrayOutputStream, str.getBytes(charset).length);
        AbstractC0738.m2285(byteArrayOutputStream, c1030.f3773);
        AbstractC0738.m2284(byteArrayOutputStream, c1030.f3774, 4);
        AbstractC0738.m2284(byteArrayOutputStream, c1030.f3771, 4);
        AbstractC0738.m2284(byteArrayOutputStream, c1030.f3775, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static void m4221(ByteArrayOutputStream byteArrayOutputStream, C1030 c1030) throws IOException {
        byte[] bArr = new byte[(((c1030.f3775 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c1030.f3777.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + c1030.f3775;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static void m4222(ByteArrayOutputStream byteArrayOutputStream, C1030 c1030) throws IOException {
        int i = 0;
        for (Map.Entry entry : c1030.f3777.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC0738.m2285(byteArrayOutputStream, iIntValue - i);
                AbstractC0738.m2285(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
