package p000;

import android.content.ContentValues;
import bsh.AbstractC0010;
import bsh.Primitive;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2201 {

    public static final byte[] f7162 = {1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 2, 3, 5, 2, 2, 3, 2, 1, 1, 2, 2, 1, 2, 2, 3, 3, 3, 1, 1, 2, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 1, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 3, 3, 2, 2};

    public static final boolean[] f7163 = new boolean[3];

    public static final C0146 m3963(C1706 c1706, String str) {
        C1227 c1227 = c1706.f5799;
        
        return new C0146(str, c1227);
    }

    public static final InterfaceC2654 m3964(InterfaceC2654 interfaceC2654, C2102 c2102) {
        if (!AbstractC2207.m4087(interfaceC2654.mo3472(), C2657.f8571)) {
            return interfaceC2654.mo3358() ? m3964(interfaceC2654.mo3476(0), c2102) : interfaceC2654;
        }
        AbstractC2202.m4004(interfaceC2654);
        return interfaceC2654;
    }

    public static void m3965(C0794 c0794, C1791 c1791, C0793 c0793) {
        c0793.f3082 = -1;
        C0779 c0779 = c0793.f3105;
        int[] iArr = c0793.f3134;
        C0779 c07710 = c0793.f3104;
        C0779 c07711 = c0793.f3102;
        C0779 c07712 = c0793.f3103;
        C0779 c07713 = c0793.f3101;
        c0793.f3083 = -1;
        int[] iArr2 = c0794.f3134;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = c07713.f2882;
            int iM2316 = c0794.m2316() - c07712.f2882;
            c07713.f2884 = c1791.m3540(c07713);
            c07712.f2884 = c1791.m3540(c07712);
            c1791.m3533(c07713.f2884, i);
            c1791.m3533(c07712.f2884, iM2316);
            c0793.f3082 = 2;
            c0793.f3117 = i;
            int i2 = iM2316 - i;
            c0793.f3113 = i2;
            int i3 = c0793.f3120;
            if (i2 < i3) {
                c0793.f3113 = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = c07711.f2882;
        int iM2313 = c0794.m2313() - c07710.f2882;
        c07711.f2884 = c1791.m3540(c07711);
        c07710.f2884 = c1791.m3540(c07710);
        c1791.m3533(c07711.f2884, i4);
        c1791.m3533(c07710.f2884, iM2313);
        if (c0793.f3119 > 0 || c0793.f3125 == 8) {
            C2785 c2785M3540 = c1791.m3540(c0779);
            c0779.f2884 = c2785M3540;
            c1791.m3533(c2785M3540, c0793.f3119 + i4);
        }
        c0793.f3083 = 2;
        c0793.f3118 = i4;
        int i5 = iM2313 - i4;
        c0793.f3114 = i5;
        int i6 = c0793.f3121;
        if (i5 < i6) {
            c0793.f3114 = i6;
        }
    }

    public static void m3966(Class cls, Object obj, Object... objArr) {
        int i;
        int i2;
        int length = Array.getLength(objArr[0]);
        int length2 = objArr.length > 1 ? Array.getLength(obj) : length;
        if (AbstractC0010.m411(obj.getClass()) != 1) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length2) {
                if (length < length2 && i4 == length && (i = i5 + 1) < objArr.length) {
                    length = Array.getLength(objArr[i]);
                    i4 = 0;
                    i5 = i;
                }
                int i6 = i4 + 1;
                Object obj2 = Array.get(objArr[i5], i4);
                if (obj2 == null) {
                    Array.set(obj, i3, null);
                } else {
                    Object objNewInstance = Array.get(obj, i3);
                    if (Array.getLength(obj2) != Array.getLength(objNewInstance)) {
                        objNewInstance = Array.newInstance((Class<?>) cls, m3967(obj2));
                        Array.set(obj, i3, objNewInstance);
                    }
                    m3966(cls, objNewInstance, obj2);
                }
                i3++;
                i4 = i6;
            }
            return;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length2; i9++) {
            int i10 = i8 + 1;
            Object objUnwrap = Array.get(objArr[i7], i8);
            try {
                objUnwrap = Primitive.unwrap(AbstractC0010.m414(0, cls, objUnwrap));
            } catch (C3523 unused) {
            }
            if (Byte.TYPE == cls) {
                Array.setByte(obj, i9, ((Byte) objUnwrap).byteValue());
            } else if (Short.TYPE == cls) {
                Array.setShort(obj, i9, ((Short) objUnwrap).shortValue());
            } else if (Integer.TYPE == cls) {
                Array.setInt(obj, i9, ((Integer) objUnwrap).intValue());
            } else if (Long.TYPE == cls) {
                Array.setLong(obj, i9, ((Long) objUnwrap).longValue());
            } else if (Float.TYPE == cls) {
                Array.setFloat(obj, i9, ((Float) objUnwrap).floatValue());
            } else if (Double.TYPE == cls) {
                Array.setDouble(obj, i9, ((Double) objUnwrap).doubleValue());
            } else if (Character.TYPE == cls) {
                Array.setChar(obj, i9, ((Character) objUnwrap).charValue());
            } else if (Boolean.TYPE == cls) {
                Array.setBoolean(obj, i9, ((Boolean) objUnwrap).booleanValue());
            } else {
                Array.set(obj, i9, objUnwrap);
            }
            if (length >= length2 || i10 != length || (i2 = i7 + 1) >= objArr.length) {
                i8 = i10;
            } else {
                length = Array.getLength(objArr[i2]);
                i7 = i2;
                i8 = 0;
            }
        }
    }

    public static int[] m3967(Object obj) {
        int iM411 = AbstractC0010.m411(obj.getClass());
        int[] iArr = new int[iM411];
        if (iM411 != 0) {
            int length = Array.getLength(obj);
            iArr[0] = length;
            if (length != 0) {
                for (int i = 1; i < iM411; i++) {
                    obj = Array.get(obj, 0);
                    if (obj == null) {
                        break;
                    }
                    iArr[i] = Array.getLength(obj);
                }
            }
        }
        return iArr;
    }

    public static final boolean m3968(int i, int i2) {
        return (i & i2) == i2;
    }

    public static Object m3969(int i, Object obj) throws C3524 {
        RunnableC1668.m3389("getIndex: ", obj, ", index=", Integer.valueOf(i));
        try {
            return obj instanceof List ? ((List) obj).get(i) : Primitive.wrap(Array.get(obj, i), (Class<?>) AbstractC0010.m412(obj.getClass()));
        } catch (IndexOutOfBoundsException e) {
            throw new C3524(AbstractC2784.m4745(i, "Index ", " out-of-bounds for length ", obj instanceof List ? ((List) obj).size() : Array.getLength(obj)), e);
        }
    }

    public static int m3970(List list, InputStream inputStream, C1867 c1867) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2479(inputStream, c1867);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iMo2562 = ((InterfaceC1607) list.get(i)).mo2562(inputStream, c1867);
                inputStream.reset();
                if (iMo2562 != -1) {
                    return iMo2562;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    public static final int m3971(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static ImageHeaderParser$ImageType m3972(List list, InputStream inputStream, C1867 c1867) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2479(inputStream, c1867);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2561 = ((InterfaceC1607) list.get(i)).mo2561(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeMo2561 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo2561;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType m3973(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2558 = ((InterfaceC1607) list.get(i)).mo2558(byteBuffer);
                AtomicReference atomicReference = AbstractC0534.f2234;
                if (imageHeaderParser$ImageTypeMo2558 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeMo2558;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = AbstractC0534.f2234;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ArrayList m3974(byte[] bArr, C1026 c1026, String str) throws NoSuchMethodException {
        int iM3982;
        Integer num;
        String[] strArr = AbstractC1574.f5469;
        "buf == null";
        "method == null";
        m3978(88, bArr);
        int iM3978 = m3978(92, bArr);
        int iM3979 = m3978(96, bArr);
        int iM39710 = m3978(100, bArr);
        int i = 0;
        loop0: while (true) {
            if (i >= iM3979) {
                iM3982 = 0;
                break;
            }
            int i2 = (i * 32) + iM39710;
            int iM39711 = m3978(i2, bArr);
            int iM39712 = m3978(i2 + 24, bArr);
            String str2 = c1026.f3759;
            String str3 = c1026.f3761;
            String str4 = c1026.f3760;
            if (str2.equals(m3981(iM39711, bArr))) {
                int[] iArr = {iM39712};
                if (iM39712 == 0) {
                    continue;
                } else {
                    int iM3983 = m3982(bArr, iArr);
                    int iM3984 = m3982(bArr, iArr);
                    int iM3985 = m3982(bArr, iArr);
                    int iM3986 = m3982(bArr, iArr);
                    for (int i3 = 0; i3 < iM3983 + iM3984; i3++) {
                        m3982(bArr, iArr);
                        m3982(bArr, iArr);
                    }
                    int iM3987 = 0;
                    for (int i4 = 0; i4 < iM3985; i4++) {
                        iM3987 += m3982(bArr, iArr);
                        m3982(bArr, iArr);
                        iM3982 = m3982(bArr, iArr);
                        if (iM3982 != 0) {
                            int i5 = (iM3987 * 8) + iM3978;
                            String strM3980 = m3980(m3978(i5 + 4, bArr), bArr);
                            String strM3979 = m3979(m3977(i5 + 2, bArr), bArr);
                            if (str4.equals(strM3980) && str3.equals(strM3979)) {
                                break loop0;
                            }
                        }
                    }
                    int iM3988 = 0;
                    for (int i6 = 0; i6 < iM3986; i6++) {
                        iM3988 += m3982(bArr, iArr);
                        m3982(bArr, iArr);
                        iM3982 = m3982(bArr, iArr);
                        if (iM3982 != 0) {
                            int i7 = (iM3988 * 8) + iM3978;
                            String strM3981 = m3980(m3978(i7 + 4, bArr), bArr);
                            String strM39710 = m3979(m3977(i7 + 2, bArr), bArr);
                            if (str4.equals(strM3981) && str3.equals(strM39710)) {
                                break loop0;
                            }
                        }
                    }
                }
            }
            i++;
        }
        if (iM3982 == 0) {
            throw new NoSuchMethodException(c1026.toString());
        }
        int iM3977 = m3977(iM3982, bArr);
        m3977(iM3982 + 2, bArr);
        m3977(iM3982 + 4, bArr);
        m3977(iM3982 + 6, bArr);
        int iM39713 = m3977(iM3982 + 12, bArr);
        int i8 = iM3982 + 16;
        Integer[] numArr = new Integer[iM3977];
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < iM39713) {
            int i10 = (i9 * 2) + i8;
            int i11 = bArr[i10] & 255;
            byte b = f7162[i11];
            if (b == 0) {
                throw new RuntimeException(String.format(Locale.ROOT, "Unrecognized opcode = 0x%02x", Integer.valueOf(i11)));
            }
            if (i11 == 20) {
                numArr[bArr[i10 + 1] & 255] = Integer.valueOf(((m3977(i10 + 4, bArr) << 16) & (-65536)) | m3977(i10 + 2, bArr));
            } else {
                if (i11 == 110) {
                    int iM39714 = (m3977(i10 + 2, bArr) * 8) + m3978(92, bArr);
                    String strM3982 = m3981(m3977(iM39714, bArr), bArr);
                    String strM39711 = m3979(m3977(iM39714 + 2, bArr), bArr);
                    String strM3983 = m3980(m3978(iM39714 + 4, bArr), bArr);
                    
                    StringBuilder sbM4753 = AbstractC2784.m4753(strM3982);
                    sbM4753.append("->");
                    sbM4753.append(strM3983);
                    sbM4753.append(strM39711);
                    if (sbM4753.toString().equals(str) && (num = numArr[(m3977(i10 + 4, bArr) >> 4) & 15]) != null) {
                        arrayList.add(num);
                    }
                }
                i9 += b;
            }
            i9 += b;
        }
        return arrayList;
    }

    public static String m3975(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(80);
        int i4 = (~i2) & i;
        int i5 = i & i2;
        if ((i5 & 1) != 0) {
            sb.append("|public");
        }
        if ((i5 & 2) != 0) {
            sb.append("|private");
        }
        if ((i5 & 4) != 0) {
            sb.append("|protected");
        }
        if ((i5 & 8) != 0) {
            sb.append("|static");
        }
        if ((i5 & 16) != 0) {
            sb.append("|final");
        }
        if ((i5 & 32) != 0) {
            if (i3 == 1) {
                sb.append("|super");
            } else {
                sb.append("|synchronized");
            }
        }
        if ((i5 & 64) != 0) {
            if (i3 == 3) {
                sb.append("|bridge");
            } else {
                sb.append("|volatile");
            }
        }
        if ((i5 & 128) != 0) {
            if (i3 == 3) {
                sb.append("|varargs");
            } else {
                sb.append("|transient");
            }
        }
        if ((i5 & 256) != 0) {
            sb.append("|native");
        }
        if ((i5 & 512) != 0) {
            sb.append("|interface");
        }
        if ((i5 & 1024) != 0) {
            sb.append("|abstract");
        }
        if ((i5 & 2048) != 0) {
            sb.append("|strictfp");
        }
        if ((i5 & 4096) != 0) {
            sb.append("|synthetic");
        }
        if ((i5 & 8192) != 0) {
            sb.append("|annotation");
        }
        if ((i5 & 16384) != 0) {
            sb.append("|enum");
        }
        if ((65536 & i5) != 0) {
            sb.append("|constructor");
        }
        if ((i5 & 131072) != 0) {
            sb.append("|declared_synchronized");
        }
        if (i4 != 0 || sb.length() == 0) {
            sb.append('|');
            sb.append(AbstractC1460.m3223(i4));
        }
        return sb.substring(1);
    }

    public static long m3976(int type, String talker, String content, long msgSvrId) throws IllegalAccessException, InvocationTargetException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("msgid", 0);
        contentValues.put("msgSvrId", Long.valueOf(((long) AbstractC2474.f7908.mo948()) + msgSvrId));
        contentValues.put("type", Integer.valueOf(type));
        contentValues.put("status", (Integer) 3);
        contentValues.put("createTime", Long.valueOf(msgSvrId));
        contentValues.put("talker", talker);
        contentValues.put("content", content);
        
        Object objM2131 = AbstractC0710.m2131(AbstractC1574.dexToClass(C2059.f6854), new Object[0]);
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(objM2131).m3492();
        c1973M3492.name = "convertFrom";
        c1973M3492.paramTypes(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(ContentValues.class), AbstractC2519.classToKClass(Boolean.TYPE)}, 2));
        c1973M3492.superclass();
        ((C1982) AbstractC0744.firstInList(c1973M3492.resolve())).m3831(contentValues, Boolean.TRUE);
        Method methodM3315 = AbstractC1574.dexToMethod(C2077.f6879);
        MethodResolver c1973M3493 = AbstractC0968.startMethodResolution_(C2663.m4656(AbstractC1574.dexToClass(C2823.f9069))).m3492();
        c1973M3493.returnType = AbstractC1574.dexToClass(C2076.f6878);
        Object objInvoke = methodM3315.invoke(((C1982) AbstractC1194.m2778(c1973M3493)).m3831(new Object[0]), objM2131);
        return ((Long) objInvoke).longValue();
    }

    public static int m3977(int i, byte[] bArr) {
        return ((bArr[i + 1] << 8) & 65280) | (bArr[i] & 255);
    }

    public static int m3978(int i, byte[] bArr) {
        return ((bArr[i + 3] << 24) & (-16777216)) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | ((bArr[i + 2] << 16) & 16711680);
    }

    public static String m3979(int i, byte[] bArr) {
        int iM3978 = (i * 12) + m3978(76, bArr);
        int iM3979 = m3978(iM3978 + 4, bArr);
        int iM39710 = m3978(iM3978 + 8, bArr);
        String[] strArr = AbstractC1574.f5469;
        StringBuilder sb = new StringBuilder("(");
        if (iM39710 != 0) {
            int iM39711 = m3978(iM39710, bArr);
            for (int i2 = 0; i2 < iM39711; i2++) {
                sb.append(m3981(m3977((i2 * 2) + iM39710 + 4, bArr), bArr));
            }
        }
        sb.append(")");
        sb.append(m3981(iM3979, bArr));
        return sb.toString();
    }

    public static String m3980(int i, byte[] bArr) {
        int[] iArr = {m3978((i * 4) + m3978(60, bArr), bArr)};
        return new String(bArr, iArr[0], m3982(bArr, iArr));
    }

    public static String m3981(int i, byte[] bArr) {
        return m3980(m3978((i * 4) + m3978(68, bArr), bArr), bArr);
    }

    public static int m3982(byte[] bArr, int[] iArr) {
        int i = 0;
        int i2 = 0;
        do {
            int i3 = iArr[0];
            byte b = bArr[i3];
            i |= (b & 127) << (i2 * 7);
            i2++;
            iArr[0] = i3 + 1;
            if ((b & 128) != 128) {
                break;
            }
        } while (i2 < 5);
        return i;
    }

    public static final Object m3983(Object obj) {
        return obj instanceof C0760 ? new C2585(((C0760) obj).f2861) : obj;
    }

    public static Object m3984(int i, Object obj) {
        Class clsM412 = AbstractC0010.m412(obj.getClass());
        if (i < 1) {
            return Array.newInstance((Class<?>) clsM412, 0);
        }
        int[] iArrM3967 = m3967(obj);
        int i2 = iArrM3967[0];
        int i3 = i * i2;
        iArrM3967[0] = i3;
        Object objNewInstance = Array.newInstance((Class<?>) clsM412, iArrM3967);
        for (int i4 = 0; i4 < i3; i4 += i2) {
            System.arraycopy(obj, 0, objNewInstance, i4, i2);
        }
        return objNewInstance;
    }

    public static AbstractList m3985(int i, List list) {
        if (i < 1) {
            return list instanceof Queue ? new LinkedList() : new ArrayList(0);
        }
        AbstractList linkedList = list instanceof Queue ? new LinkedList(list) : new ArrayList(list);
        if (i != 1) {
            while (true) {
                int i2 = i - 1;
                if (i <= 1) {
                    break;
                }
                linkedList.addAll(list);
                i = i2;
            }
        }
        return linkedList;
    }

    public static void m3986(Object obj, int i, Object obj2) throws C3524 {
        try {
            Object objUnwrap = Primitive.unwrap(obj2);
            if (obj instanceof List) {
                ((List) obj).set(i, objUnwrap);
            } else {
                Array.set(obj, i, objUnwrap);
            }
        } catch (IllegalArgumentException e) {
            ArrayStoreException arrayStoreException = new ArrayStoreException(e.getMessage());
            throw new C3524(arrayStoreException.getMessage(), arrayStoreException);
        } catch (IndexOutOfBoundsException e2) {
            throw new C3524(AbstractC2784.m4745(i, "Index ", " out-of-bounds for length ", obj instanceof List ? ((List) obj).size() : Array.getLength(obj)), e2);
        }
    }

    public static final EnumC3672 m3987(C1706 c1706, InterfaceC2654 interfaceC2654) {
        AbstractC1460 abstractC1460Mo3472 = interfaceC2654.mo3472();
        if (abstractC1460Mo3472 instanceof AbstractC2375) {
            return EnumC3672.POLY_OBJ;
        }
        if (AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9112)) {
            return EnumC3672.LIST;
        }
        if (!AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9113)) {
            return EnumC3672.OBJ;
        }
        InterfaceC2654 interfaceC2654M3964 = m3964(interfaceC2654.mo3476(0), c1706.f5800);
        AbstractC1460 abstractC1460Mo3473 = interfaceC2654M3964.mo3472();
        if ((abstractC1460Mo3473 instanceof AbstractC2398) || AbstractC2207.m4087(abstractC1460Mo3473, C2658.f8572)) {
            return EnumC3672.MAP;
        }
        
        throw AbstractC3681.m5314(interfaceC2654M3964);
    }

    public static final Class m3988(String str) {
        
        return AbstractC0710.m2130(C1565.m3275(), str);
    }

    public static final C3477 m3989(String str) {
        int i;
        AbstractC3681.m5317(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC2207.m4089(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new C3477(i2);
    }

    public static final C3482 m3990(String str) {
        AbstractC3681.m5317(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC2207.m4089(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 10;
        long j2 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j3 = j2 * 10L;
            long j4 = (((long) iDigit) & 4294967295L) + j3;
            if (Long.compareUnsigned(j4, j3) < 0) {
                return null;
            }
            i++;
            j2 = j4;
        }
        return new C3482(j2);
    }
}
