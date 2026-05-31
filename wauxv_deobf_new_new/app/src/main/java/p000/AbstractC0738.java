package p000;

import android.content.ContentValues;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import bsh.AbstractC0016;
import bsh.Primitive;
import bsh.Variable;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.r;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᲀᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0738 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static String f2835 = "YukiHookAPI";

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static C0519 f2837;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final int[] f2830 = {48, 58, 65, 91, 97, Opcodes.LSHR, Opcodes.LOR, bc.e, 384, 592, 688, 768, 880, 1024, 1329, 1425, 1536, 1792, 1872, 1920, 1984, 2048, 2112, 2144, 2208, 2304, 2432, 2561, 2689, 2817, 2946, 3072, 3200, 3328, 3458, 3584, 3712, 3840, 4096, 2256, r.a.k, 4608, 5024, 5120, 5760, 5792, 5888, 5920, 5952, 5984, 6016, 6144, 6320, 6400, 6480, 6528, 6624, 6656, 6688, 6832, 6912, 7040, 7104, 7168, 7248, 7296, 7360, 7376, 7424, 7616, 7680, 7936, 8192, 8304, 8352, 8400, 8448, 8528, 8592, 8704, 8960, 9216, 9280, 9312, 9472, 9600, 9632, 9728, 9984, 10176, 10224, 10240, 10496, 10624, 10752, 11008, 11264, 11360, 11392, 11520, 11568, 11648, 11744, 11776, 11904, 12032, 12272, 12288, 12352, 12448, 12544, 12592, 12688, 12704, 12736, 12784, 12800, 13056, 13312, 19904, 19968, 40960, 42128, 42192, 42240, 42560, 42656, 42752, 42784, 43008, 43056, 43072, 43136, 43232, 43264, 43312, 43360, 43392, 43488, 43520, 43616, 43648, 43744, 43776, 43824, 43888, 43968, 44032, 55216, 55296, 56320, 57344, 63744, 64256, 64336, 65024, 65040, 65056, 65072, 65104, 65136, 65280, 65520, 65536, 65664, 65792, 65856, 65936, 66000, 66176, 66208, 66272, 66304, 66352, 66384, 66432, 66464, 66560, 66640, 66688, 66736, 66816, 66864, 67072, 67584, 67648, 67680, 67712, 67808, 67840, 67872, 67968, 68000, 68096, 68192, 68224, 68288, 68352, 68416, 68448, 68480, 68608, 68736, 69216, 69632, 69760, 69840, 69888, 69968, 70016, 70112, 70144, 70272, 70320, 70400, 70656, 70784, 71040, 71168, 71264, 71296, 71424, 71840, 72192, 72272, 72384, 72704, 72816, 72960, 73728, 74752, 74880, 77824, 82944, 92160, 92736, 92880, 92928, 93952, 94176, 94208, 100352, 110592, 110848, 110960, 113664, 113824, 118784, 119040, 119296, 119552, 119648, 119808, 120832, 122880, 124928, 125184, 126464, 126976, 127024, 127136, 127232, 127488, 127744, 128512, 128592, 128640, 128768, 128896, 129024, 129280, 131072, 173824, 177984, 178208, 183984, 194560, 917504, 917760, 983040, 1048576};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final char[] f2831 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C2469 f2832 = new C2469("image-destination");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C2469 f2833 = new C2469("image-replacement-text-is-link");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2469 f2834 = new C2469("image-size");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final Integer[] f2836 = {1000, Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), 1002, 1003};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final int m2263(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final String m2264(Object[] objArr, int i, int i2, AbstractC0072 abstractC0072) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC0072) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static byte[] m2265(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final ColorStateList m2266(int i) {
        C2348[] c2348Arr = {new C2348(0, Integer.valueOf(i))};
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C2348 c2348 = c2348Arr[0];
        for (Map.Entry entry : Collections.singletonMap(c2348.f7567, c2348.f7568).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            if (iIntValue == 0) {
                arrayList.add(new int[0]);
            } else {
                arrayList.add(new int[]{iIntValue});
            }
            arrayList2.add(Integer.valueOf(iIntValue2));
        }
        return new ColorStateList((int[][]) arrayList.toArray(new int[0][]), AbstractC0739.m2304(arrayList2));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final void m2267(long j, int i, int i2, byte[] bArr, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = AbstractC1545.f5400[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static C0185 m2268(C0417 c0417) {
        C0185 c0185M1373;
        C0173 c0173;
        C0303 c0303 = (C0303) c0417.m1750("RuntimeVisibleAnnotations");
        C0301 c0301 = (C0301) c0417.m1750("RuntimeInvisibleAnnotations");
        if (c0303 == null) {
            c0185M1373 = c0301 == null ? C0185.f1291 : (C0185) c0301.f1720;
        } else {
            c0185M1373 = (C0185) c0303.f1720;
            if (c0301 != null) {
                C0185 c0185 = (C0185) c0301.f1720;
                C0185 c0186 = new C0185();
                c0186.m1375(c0185M1373);
                c0186.m1375(c0185);
                c0186.f7068 = false;
                c0185M1373 = c0186;
            }
        }
        C0305 c0305 = (C0305) c0417.m1750("Signature");
        C0173 c0174 = null;
        if (c0305 == null) {
            c0173 = null;
        } else {
            C0916 c0916 = c0305.f1580;
            c0173 = new C0173(AbstractC0184.f1285, 3);
            String str = c0916.f3385;
            int length = str.length();
            ArrayList arrayList = new ArrayList(20);
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (str.charAt(i) == 'L') {
                    while (i2 < length) {
                        char cCharAt = str.charAt(i2);
                        if (cCharAt == ';') {
                            i2++;
                            break;
                        }
                        if (cCharAt == '<') {
                            break;
                        }
                        i2++;
                    }
                } else {
                    while (i2 < length && str.charAt(i2) != 'L') {
                        i2++;
                    }
                }
                arrayList.add(str.substring(i, i2));
                i = i2;
            }
            int size = arrayList.size();
            C0888 c0888 = new C0888(size);
            for (int i3 = 0; i3 < size; i3++) {
                c0888.m3166(i3, new C0916((String) arrayList.get(i3)));
            }
            c0888.f7068 = false;
            c0173.m1363(new C2152(AbstractC0184.f1290, new C0889(c0888)));
            c0173.f7068 = false;
        }
        C0306 c0306 = (C0306) c0417.m1750("SourceDebugExtension");
        if (c0306 != null) {
            C0916 c0917 = c0306.f1581;
            c0174 = new C0173(AbstractC0184.f1286, 3);
            c0174.m1363(new C2152(AbstractC0184.f1290, c0917));
            c0174.f7068 = false;
        }
        if (c0173 != null) {
            c0185M1373 = C0185.m1373(c0185M1373, c0173);
        }
        return c0174 != null ? C0185.m1373(c0185M1373, c0174) : c0185M1373;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static Iterator m2269(Object obj) {
        Stream streamConcat;
        Variable[] variableArrM541;
        if (obj == null) {
            return new C0736();
        }
        if (obj instanceof Primitive) {
            return m2269(Primitive.unwrap(obj));
        }
        if (obj.getClass().isArray()) {
            return new C0737(obj);
        }
        if (obj instanceof Iterable) {
            return ((Iterable) obj).iterator();
        }
        if (obj instanceof Iterator) {
            return (Iterator) obj;
        }
        if (obj instanceof Enumeration) {
            return Collections.list((Enumeration) obj).iterator();
        }
        if (obj instanceof CharSequence) {
            return new C0737(((CharSequence) obj).toString().toCharArray());
        }
        int i = 0;
        if (obj instanceof Number) {
            final int iIntValue = ((Number) obj).intValue();
            if (iIntValue == 0) {
                return new C0736();
            }
            return iIntValue > 0 ? IntStream.rangeClosed(0, iIntValue).iterator() : IntStream.rangeClosed(iIntValue, 0).map(new IntUnaryOperator() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᤞᲀᲇᤝ
                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i2) {
                    return iIntValue - i2;
                }
            }).iterator();
        }
        if (obj instanceof Character) {
            char cCharValue = ((Character) obj).charValue();
            int i2 = 33;
            int i3 = 0;
            while (i < 281) {
                int i4 = f2830[i];
                if (i2 > cCharValue) {
                    break;
                }
                i++;
                i3 = i2;
                i2 = i4;
            }
            return IntStream.rangeClosed(i3, cCharValue).boxed().map(new C0278(11)).map(new C0278(12)).iterator();
        }
        if (obj instanceof String) {
            return new C0737(((String) obj).toCharArray());
        }
        Class<?> cls = obj.getClass();
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        if (obj instanceof C0699) {
            cls = ((C0699) obj).f2676;
        }
        if (AbstractC0016.m546(cls)) {
            Stream streamOf = Stream.of(AbstractC2240.m4245(cls));
            if (AbstractC0016.m546(cls)) {
                variableArrM541 = cls.isInterface() ? AbstractC0016.m541(AbstractC0016.m539(cls)) : AbstractC0016.m541(AbstractC0016.m540(AbstractC0016.m535(cls)));
            } else {
                variableArrM541 = new Variable[0];
            }
            streamConcat = Stream.concat(Stream.concat(streamOf, Stream.concat(Stream.of((Object[]) variableArrM541).map(new C0278(6)).map(new C0278(7)), Stream.of((Object[]) AbstractC0016.m529(cls)).map(new C0278(8)).map(new C0278(7)))), Stream.of("}"));
        } else {
            streamConcat = Stream.concat(Stream.concat(Stream.of(AbstractC2240.m4245(cls)), Stream.concat(Stream.of((Object[]) cls.getFields()).map(new C0278(9)).map(new C0278(7)), Stream.of((Object[]) cls.getMethods()).map(new C0278(10)).map(new C0278(7)))), Stream.of("}"));
        }
        return streamConcat.iterator();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static C0185 m2270(InterfaceC2002 interfaceC2002) {
        C0185 c0185M2268 = m2268(interfaceC2002.getAttributes());
        C0297 c0297 = (C0297) interfaceC2002.getAttributes().m1750("Exceptions");
        InterfaceC3510 interfaceC3510 = c0297 == null ? C2879.f9192 : c0297.f1576;
        if (interfaceC3510.size() == 0) {
            return c0185M2268;
        }
        C0889 c0889M1372 = AbstractC0184.m1372(interfaceC3510);
        C0173 c0173 = new C0173(AbstractC0184.f1287, 3);
        c0173.m1363(new C2152(AbstractC0184.f1290, c0889M1372));
        c0173.f7068 = false;
        return C0185.m1373(c0185M2268, c0173);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static int m2271(List list, InputStream inputStream, C1893 c1893) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2534(inputStream, c1893);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iMo2686 = ((InterfaceC1620) list.get(i)).mo2686(inputStream, c1893);
                inputStream.reset();
                if (iMo2686 != -1) {
                    return iMo2686;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static C0187 m2272(InterfaceC2002 interfaceC2002) {
        C0417 attributes = interfaceC2002.getAttributes();
        C0304 c0304 = (C0304) attributes.m1750("RuntimeVisibleParameterAnnotations");
        C0302 c0302 = (C0302) attributes.m1750("RuntimeInvisibleParameterAnnotations");
        if (c0304 == null) {
            return c0302 == null ? C0187.f1297 : (C0187) c0302.f1720;
        }
        C0187 c0187 = (C0187) c0304.f1720;
        if (c0302 == null) {
            return c0187;
        }
        C0187 c0188 = (C0187) c0302.f1720;
        C0187 c0189 = C0187.f1297;
        int length = c0187.f4833.length;
        if (length != c0188.f4833.length) {
            throw new IllegalArgumentException("list1.size() != list2.size()");
        }
        C0187 c01810 = new C0187(length);
        for (int i = 0; i < length; i++) {
            C0185 c0185 = (C0185) c0187.m3165(i);
            C0185 c0186 = (C0185) c0188.m3165(i);
            C0185 c01811 = new C0185();
            c01811.m1375(c0185);
            c01811.m1375(c0186);
            c01811.f7068 = false;
            c01811.m4110();
            c01810.m3166(i, c01811);
        }
        c01810.f7068 = false;
        return c01810;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m2273(List list, InputStream inputStream, C1893 c1893) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2534(inputStream, c1893);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2685 = ((InterfaceC1620) list.get(i)).mo2685(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeMo2685 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo2685;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static ImageHeaderParser$ImageType m2274(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2682 = ((InterfaceC1620) list.get(i)).mo2682(byteBuffer);
                AtomicReference atomicReference = AbstractC0511.f2190;
                if (imageHeaderParser$ImageTypeMo2682 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo2682;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = AbstractC0511.f2190;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static long m2275(int i, String str, String str2, long j) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        C2092 c2092 = C2092.f6978;
        ContentValues contentValues = new ContentValues();
        String[] strArr = AbstractC1471.f5234;
        contentValues.put("msgid", (Integer) 0);
        String str3 = "msgSvrId";
        C2527 c2527 = AbstractC2528.f8058;
        contentValues.put(str3, Long.valueOf(((long) AbstractC2528.f8059.mo1094().nextInt()) + j));
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("status", (Integer) 3);
        contentValues.put("createTime", Long.valueOf(j));
        contentValues.put("talker", str);
        contentValues.put("content", str2);
        c2092.getClass();
        Object objM2224 = AbstractC0705.m2224(AbstractC0972.m2608(C2091.f6977), new Object[0]);
        int i2 = AbstractC1768.f5906;
        C2004 c2004M3560 = AbstractC2727.m4713(objM2224).m3560();
        c2004M3560.f6475 = "convertFrom";
        c2004M3560.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(ContentValues.class), AbstractC2574.m4549(Boolean.TYPE)}, 2));
        c2004M3560.m3926();
        ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4025(contentValues, Boolean.TRUE);
        C2112.f7005.getClass();
        Method methodM2610 = AbstractC0972.m2610(C2110.f7003);
        C2884 c2884 = C2884.f9232;
        c2884.getClass();
        C2725.f8744.getClass();
        c2884.getClass();
        C2004 c2004M3561 = AbstractC2727.m4713(C2725.m4690(AbstractC0972.m2608(C2883.f9231))).m3560();
        c2004M3561.f6648 = AbstractC0972.m2608(C2109.f7002);
        Object objInvoke = methodM2610.invoke(((C2013) AbstractC1095.m2793(c2004M3561)).m4025(new Object[0]), objM2224);
        "null cannot be cast to non-null type kotlin.Long";
        return ((Long) objInvoke).longValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static byte[] m2276(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(AbstractC1095.m2794(i, "Not enough bytes to read: "));
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static byte[] m2277(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static long m2278(InputStream inputStream, int i) throws IOException {
        byte[] bArrM2276 = m2276(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM2276[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static final void m2279(Object[] objArr, int i, int i2) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static Class m2280(String str) {
        Object c2641;
        String str2 = "[" + str + "][" + ((Object) null) + "]";
        LinkedHashMap linkedHashMap = AbstractC2576.f8195;
        Class cls = (Class) linkedHashMap.get(str2);
        if (cls != null) {
            return cls;
        }
        try {
            C0261.f1489.getClass();
            c2641 = Class.forName(str, false, C0261.m1482());
            linkedHashMap.put(str2, c2641);
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        Class cls2 = (Class) (c2641 instanceof C2641 ? null : c2641);
        if (cls2 != null) {
            return cls2;
        }
        C0261.f1489.getClass();
        ClassLoader classLoaderM1482 = C0261.m1482();
        String[] strArr = {AbstractC1095.m2800("name:[", str, "]")};
        String str3 = "";
        String strM4782 = "";
        int i = 0;
        while (true) {
            strM4782 = AbstractC2844.m4782(strM4782, " ");
            if (i == 30) {
                break;
            }
            i++;
        }
        String strM4783 = AbstractC2844.m4782(strM4782, " -> ");
        String str4 = strArr[0];
        if (!AbstractC2901.m4869(str4)) {
            str3 = "" + strM4783 + str4 + "\n";
        }
        throw new NoClassDefFoundError("Can't find this Class in [" + classLoaderM1482 + "]:\n" + ((Object) str3) + "Generated by YukiHookAPI#ReflectionTool");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static final Class m2281(Class cls) {
        boolean zM3322 = AbstractC1469.m3322(cls, C3554.class);
        Class cls2 = Void.TYPE;
        if (!zM3322 && !AbstractC1469.m3322(cls, Void.class)) {
            if (!AbstractC1469.m3322(cls, cls2 == null ? m2280("void") : cls2)) {
                boolean zM3323 = AbstractC1469.m3322(cls, Boolean.class);
                Class cls3 = Boolean.TYPE;
                if (!zM3323) {
                    if (!AbstractC1469.m3322(cls, cls3 == null ? m2280("boolean") : cls3)) {
                        boolean zM3324 = AbstractC1469.m3322(cls, Integer.class);
                        Class cls4 = Integer.TYPE;
                        if (!zM3324) {
                            if (!AbstractC1469.m3322(cls, cls4 == null ? m2280("int") : cls4)) {
                                boolean zM3325 = AbstractC1469.m3322(cls, Float.class);
                                Class cls5 = Float.TYPE;
                                if (!zM3325) {
                                    if (!AbstractC1469.m3322(cls, cls5 == null ? m2280("float") : cls5)) {
                                        boolean zM3326 = AbstractC1469.m3322(cls, Double.class);
                                        Class cls6 = Double.TYPE;
                                        if (!zM3326) {
                                            if (!AbstractC1469.m3322(cls, cls6 == null ? m2280("double") : cls6)) {
                                                boolean zM3327 = AbstractC1469.m3322(cls, Long.class);
                                                Class cls7 = Long.TYPE;
                                                if (!zM3327) {
                                                    if (!AbstractC1469.m3322(cls, cls7 == null ? m2280("long") : cls7)) {
                                                        boolean zM3328 = AbstractC1469.m3322(cls, Short.class);
                                                        Class cls8 = Short.TYPE;
                                                        if (!zM3328) {
                                                            if (!AbstractC1469.m3322(cls, cls8 == null ? m2280("short") : cls8)) {
                                                                boolean zM3329 = AbstractC1469.m3322(cls, Character.class);
                                                                Class cls9 = Character.TYPE;
                                                                if (!zM3329) {
                                                                    if (!AbstractC1469.m3322(cls, cls9 == null ? m2280("char") : cls9)) {
                                                                        boolean zM33210 = AbstractC1469.m3322(cls, Byte.class);
                                                                        Class cls10 = Byte.TYPE;
                                                                        if (!zM33210) {
                                                                            if (!AbstractC1469.m3322(cls, cls10 == null ? m2280("byte") : cls10)) {
                                                                                return cls;
                                                                            }
                                                                        }
                                                                        return cls10 == null ? m2280("byte") : cls10;
                                                                    }
                                                                }
                                                                return cls9 == null ? m2280("char") : cls9;
                                                            }
                                                        }
                                                        return cls8 == null ? m2280("short") : cls8;
                                                    }
                                                }
                                                return cls7 == null ? m2280("long") : cls7;
                                            }
                                        }
                                        return cls6 == null ? m2280("double") : cls6;
                                    }
                                }
                                return cls5 == null ? m2280("float") : cls5;
                            }
                        }
                        return cls4 == null ? m2280("int") : cls4;
                    }
                }
                return cls3 == null ? m2280("boolean") : cls3;
            }
        }
        return cls2 == null ? m2280("void") : cls2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static C0185 m2282(C0917 c0917, C0417 c0417, boolean z) {
        C0298 c0298 = (C0298) c0417.m1750("InnerClasses");
        if (c0298 != null) {
            C0417 c0418 = c0298.f1577;
            int length = c0418.f4833.length;
            ArrayList arrayList = new ArrayList();
            C1655 c1655 = null;
            for (int i = 0; i < length; i++) {
                C1655 c1656 = (C1655) c0418.m3165(i);
                C0917 c0918 = c1656.f5608;
                if (c0918.equals(c0917)) {
                    c1655 = c1656;
                } else if (c0917.equals(c1656.f5609)) {
                    arrayList.add(c0918.f3408);
                }
            }
            int size = arrayList.size();
            if (c1655 != null || size != 0) {
                C0185 c0185 = new C0185();
                if (c1655 != null) {
                    AbstractC0775 abstractC0775 = c1655.f5610;
                    int i2 = c1655.f5611;
                    C0173 c0173 = new C0173(AbstractC0184.f1283, 3);
                    if (abstractC0775 == null) {
                        abstractC0775 = C0905.f3370;
                    }
                    c0173.m1363(new C2152(AbstractC0184.f1289, abstractC0775));
                    c0173.m1363(new C2152(AbstractC0184.f1288, C0902.m2537(i2)));
                    c0173.f7068 = false;
                    c0185.m1374(c0173);
                    if (z) {
                        C0917 c0919 = c1655.f5609;
                        if (c0919 == null) {
                            throw new C3689("Ignoring InnerClasses attribute for an anonymous inner class\n(" + c0917.f3408.mo1360() + ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class.");
                        }
                        C0173 c0174 = new C0173(AbstractC0184.f1281, 3);
                        c0174.m1363(new C2152(AbstractC0184.f1290, c0919));
                        c0174.f7068 = false;
                        c0185.m1374(c0174);
                    }
                }
                if (size != 0) {
                    C2879 c2879 = new C2879(size);
                    for (int i3 = 0; i3 < size; i3++) {
                        c2879.m3166(i3, (C3505) arrayList.get(i3));
                    }
                    c2879.f7068 = false;
                    C0889 c0889M1372 = AbstractC0184.m1372(c2879);
                    C0173 c0175 = new C0173(AbstractC0184.f1284, 3);
                    c0175.m1363(new C2152(AbstractC0184.f1290, c0889M1372));
                    c0175.f7068 = false;
                    c0185.m1374(c0175);
                }
                c0185.f7068 = false;
                return c0185;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static final void m2283(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static void m2284(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static void m2285(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m2284(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static AbstractC0908 m2286(C3505 c3505) {
        switch (c3505.f11065) {
            case 1:
                return C0891.f3339;
            case 2:
                return C0892.f3341;
            case 3:
                return C0895.f3344;
            case 4:
                return C0896.f3345;
            case 5:
                return C0899.f3348;
            case 6:
                return C0902.f3357;
            case 7:
                return C0909.f3373;
            case 8:
                return C0915.f3384;
            case 9:
                return C0905.f3370;
            default:
                throw new UnsupportedOperationException("no zero for type: " + c3505.mo1360());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public abstract void mo2031(int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public abstract void mo2032(Typeface typeface, boolean z);
}
