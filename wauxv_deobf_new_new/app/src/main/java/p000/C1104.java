package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0026;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᲈᛸᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1104 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2334 f4126 = C2334.m4293(EnumC0973.f3535, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2334 f4127 = new C2334("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C2334.f7534);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C2334 f4128;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2334 f4129;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0348 f4130;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final ArrayDeque f4131;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC0399 f4132;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final DisplayMetrics f4133;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1893 f4134;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ArrayList f4135;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1531 f4136 = C1531.m3433();

    static {
        C1102 c1102 = C1102.f4118;
        Boolean bool = Boolean.FALSE;
        f4128 = C2334.m4293(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f4129 = C2334.m4293(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f4130 = new C0348(21);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC3580.f11185;
        f4131 = new ArrayDeque(0);
    }

    public C1104(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC0399 interfaceC0399, C1893 c1893) {
        this.f4135 = arrayList;
        AbstractC2727.m4693(displayMetrics, "Argument must not be null");
        this.f4133 = displayMetrics;
        AbstractC2727.m4693(interfaceC0399, "Argument must not be null");
        this.f4132 = interfaceC0399;
        AbstractC2727.m4693(c1893, "Argument must not be null");
        this.f4134 = c1893;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r1;
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m2814(C0253 c0253, BitmapFactory.Options options, InterfaceC1103 interfaceC1103, InterfaceC0399 interfaceC0399) {
        if (!options.inJustDecodeBounds) {
            interfaceC1103.mo1613();
            switch (c0253.f1477) {
                case 15:
                    C2534 c2534 = (C2534) ((C0102) c0253.f1478).f1117;
                    synchronized (c2534) {
                        c2534.f8070 = c2534.f8068.length;
                        break;
                    }
                    break;
            }
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = AbstractC3486.f10962;
        lock.lock();
        try {
            try {
                Bitmap bitmapM1462 = c0253.m1462(options);
                lock.unlock();
                return bitmapM1462;
            } catch (IllegalArgumentException e) {
                IOException iOExceptionM2816 = m2816(e, i, i2, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionM2816);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionM2816;
                }
                try {
                    interfaceC0399.mo1609(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapM2814 = m2814(c0253, options, interfaceC1103, interfaceC0399);
                    AbstractC3486.f10962.unlock();
                    return bitmapM2814;
                } catch (IOException unused) {
                    throw iOExceptionM2816;
                }
            }
        } catch (Throwable th) {
            AbstractC3486.f10962.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static String m2815(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static IOException m2816(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m2815(options.inBitmap), illegalArgumentException);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m2817(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0400 m2818(C0253 c0253, int i, int i2, C2336 c2336, InterfaceC1103 interfaceC1103) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f4134.m3818(65536, byte[].class);
        synchronized (C1104.class) {
            arrayDeque = f4131;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m2817(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC0973 enumC0973 = (EnumC0973) c2336.m4294(f4126);
        EnumC2445 enumC2445 = (EnumC2445) c2336.m4294(f4127);
        C1102 c1102 = (C1102) c2336.m4294(C1102.f4123);
        boolean zBooleanValue = ((Boolean) c2336.m4294(f4128)).booleanValue();
        C2334 c2334 = f4129;
        try {
            C0400 c0400M1734 = C0400.m1734(this.f4132, m2819(c0253, options, c1102, enumC0973, enumC2445, c2336.m4294(c2334) != null && ((Boolean) c2336.m4294(c2334)).booleanValue(), i, i2, zBooleanValue, interfaceC1103));
            m2817(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            return c0400M1734;
        } finally {
            m2817(options);
            ArrayDeque arrayDeque2 = f4131;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f4134.m3823(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0369  */
    /* JADX WARN: Code duplicated, block: B:146:0x0398  */
    /* JADX WARN: Code duplicated, block: B:147:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:149:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:150:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:161:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:164:0x03db  */
    /* JADX WARN: Code duplicated, block: B:165:0x03df  */
    /* JADX WARN: Code duplicated, block: B:168:0x03e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:173:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:177:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:179:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:180:0x0404  */
    /* JADX WARN: Code duplicated, block: B:183:0x042c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0476 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x048f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0493  */
    /* JADX WARN: Code duplicated, block: B:199:0x0497  */
    /* JADX WARN: Code duplicated, block: B:201:0x049d  */
    /* JADX WARN: Code duplicated, block: B:206:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:208:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:209:0x04af  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:215:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:217:0x0556  */
    /* JADX WARN: Code duplicated, block: B:219:0x0560  */
    /* JADX WARN: Code duplicated, block: B:220:0x0562  */
    /* JADX WARN: Code duplicated, block: B:223:0x0573  */
    /* JADX WARN: Code duplicated, block: B:224:0x0577  */
    /* JADX WARN: Code duplicated, block: B:225:0x0580  */
    /* JADX WARN: Code duplicated, block: B:226:0x0584  */
    /* JADX WARN: Code duplicated, block: B:227:0x058d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0596  */
    /* JADX WARN: Code duplicated, block: B:229:0x059a  */
    /* JADX WARN: Code duplicated, block: B:233:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:238:0x03ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x0157  */
    /* JADX WARN: Instruction removed from duplicated block: B:143:0x0369, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:183:0x042c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:215:0x04d1, please report this as an issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Bitmap m2819(C0253 c0253, BitmapFactory.Options options, C1102 c1102, EnumC0973 enumC0973, EnumC2445 enumC2445, boolean z, int i, int i2, boolean z2, InterfaceC1103 interfaceC1103) throws Throwable {
        long j;
        String str;
        int iMo2684;
        int iM2271;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM1468;
        int i7;
        String str2;
        InterfaceC0399 interfaceC0399;
        String str3;
        int i8;
        boolean zM3435;
        boolean z4;
        boolean zHasAlpha;
        Bitmap.Config config;
        boolean z5;
        int i9;
        int i10;
        boolean z6;
        float f;
        int i11;
        int iRound;
        int iRound2;
        int i12;
        InterfaceC0399 interfaceC03910;
        Bitmap bitmapM2814;
        Matrix matrix;
        Bitmap bitmap;
        boolean z7;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap.Config config2;
        int i13;
        int i14;
        int iFloor;
        int iFloor2;
        int iRound3;
        int i15 = AbstractC1879.f6242;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC0399 interfaceC03911 = this.f4132;
        m2814(c0253, options, interfaceC1103, interfaceC03911);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i16 = iArr[0];
        int i17 = iArr[1];
        String str4 = options.outMimeType;
        boolean z8 = (i16 == -1 || i17 == -1) ? false : z;
        C2534 c2534 = null;
        switch (c0253.f1477) {
            case Opcodes.DCONST_0 /* 14 */:
                j = jElapsedRealtimeNanos;
                str = str4;
                List list = (List) c0253.f1479;
                ByteBuffer byteBufferM1959 = AbstractC0511.m1959((ByteBuffer) c0253.f1478);
                C1893 c1893 = (C1893) c0253.f1480;
                if (byteBufferM1959 != null) {
                    int size = list.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size) {
                            List list2 = list;
                            try {
                                iMo2684 = ((InterfaceC1620) list.get(i18)).mo2684(byteBufferM1959, c1893);
                                C1893 c1894 = c1893;
                                if (iMo2684 != -1) {
                                    iM2271 = iMo2684;
                                    switch (iM2271) {
                                        case 3:
                                        case 4:
                                            i3 = Opcodes.GETFIELD;
                                            break;
                                        case 5:
                                        case 6:
                                            i3 = 90;
                                            break;
                                        case 7:
                                        case 8:
                                            i3 = 270;
                                            break;
                                        default:
                                            i3 = 0;
                                            break;
                                    }
                                    switch (iM2271) {
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z3 = true;
                                            break;
                                        default:
                                            z3 = false;
                                            break;
                                    }
                                    if (i == Integer.MIN_VALUE) {
                                        if (i3 != 90) {
                                            i4 = 270;
                                            if (i3 == 270) {
                                                i5 = i16;
                                            }
                                        } else {
                                            i4 = 270;
                                        }
                                        i5 = i17;
                                    } else {
                                        i4 = 270;
                                        i5 = i;
                                    }
                                    if (i2 == Integer.MIN_VALUE) {
                                        i6 = i2;
                                    } else if (i3 != 90 || i3 == i4) {
                                        i6 = i16;
                                    } else {
                                        i6 = i17;
                                    }
                                    imageHeaderParser$ImageTypeM1468 = c0253.m1468();
                                    i7 = iM2271;
                                    boolean z9 = z3;
                                    if (i16 > 0 || i17 <= 0) {
                                        str2 = ", density: ";
                                        interfaceC0399 = interfaceC03911;
                                        str3 = ", target density: ";
                                        i8 = i5;
                                        if (Log.isLoggable("Downsampler", 3)) {
                                            Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1468 + " with target [" + i8 + "x" + i6 + "]");
                                        }
                                    } else {
                                        if (i3 == 90 || i3 == 270) {
                                            i13 = i17;
                                            i14 = i16;
                                        } else {
                                            i14 = i17;
                                            i13 = i16;
                                        }
                                        i8 = i5;
                                        float fM2813 = c1102.m2813(i13, i14, i8, i6);
                                        if (fM2813 <= 0.0f) {
                                            throw new IllegalArgumentException("Cannot scale with factor: " + fM2813 + " from: " + c1102 + ", source: [" + i16 + "x" + i17 + "], target: [" + i8 + "x" + i6 + "]");
                                        }
                                        int iM2812 = c1102.m2812(i13, i14, i8, i6);
                                        if (iM2812 == 0) {
                                            throw new IllegalArgumentException("Cannot round with null rounding");
                                        }
                                        int i19 = i3;
                                        float f2 = i13;
                                        int i20 = i13;
                                        float f3 = i14;
                                        int i21 = i14;
                                        int i22 = (int) (((double) (fM2813 * f3)) + 0.5d);
                                        int i23 = i20 / ((int) (((double) (fM2813 * f2)) + 0.5d));
                                        int i24 = i21 / i22;
                                        int iMax = Math.max(1, Integer.highestOneBit(iM2812 == 1 ? Math.max(i23, i24) : Math.min(i23, i24)));
                                        if (iM2812 == 1 && iMax < 1.0f / fM2813) {
                                            iMax <<= 1;
                                        }
                                        options.inSampleSize = iMax;
                                        if (imageHeaderParser$ImageTypeM1468 == ImageHeaderParser$ImageType.JPEG) {
                                            float fMin = Math.min(iMax, 8);
                                            iFloor = (int) Math.ceil(f2 / fMin);
                                            iFloor2 = (int) Math.ceil(f3 / fMin);
                                            int i25 = iMax / 8;
                                            if (i25 > 0) {
                                                iFloor2 /= i25;
                                                iRound3 = iFloor / i25;
                                            } else {
                                                iRound3 = iFloor;
                                            }
                                        } else {
                                            if (imageHeaderParser$ImageTypeM1468 == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeM1468 == ImageHeaderParser$ImageType.PNG_A) {
                                                float f4 = iMax;
                                                iFloor = (int) Math.floor(f2 / f4);
                                                iFloor2 = (int) Math.floor(f3 / f4);
                                            } else if (imageHeaderParser$ImageTypeM1468.isWebp()) {
                                                float f5 = iMax;
                                                iRound3 = Math.round(f2 / f5);
                                                iFloor2 = Math.round(f3 / f5);
                                            } else if (i20 % iMax == 0 && i21 % iMax == 0) {
                                                iRound3 = i20 / iMax;
                                                iFloor2 = i21 / iMax;
                                            } else {
                                                options.inJustDecodeBounds = true;
                                                m2814(c0253, options, interfaceC1103, interfaceC03911);
                                                options.inJustDecodeBounds = false;
                                                int[] iArr2 = {options.outWidth, options.outHeight};
                                                iFloor = iArr2[0];
                                                iFloor2 = iArr2[1];
                                            }
                                            iRound3 = iFloor;
                                        }
                                        double dM2813 = c1102.m2813(iRound3, iFloor2, i8, i6);
                                        int iRound4 = (int) Math.round((dM2813 <= 1.0d ? dM2813 : 1.0d / dM2813) * 2.147483647E9d);
                                        interfaceC0399 = interfaceC03911;
                                        int i26 = (int) ((((double) iRound4) * dM2813) + 0.5d);
                                        float f6 = i26 / iRound4;
                                        int i27 = iMax;
                                        options.inTargetDensity = (int) (((dM2813 / ((double) f6)) * ((double) i26)) + 0.5d);
                                        int iRound5 = (int) Math.round((dM2813 <= 1.0d ? dM2813 : 1.0d / dM2813) * 2.147483647E9d);
                                        options.inDensity = iRound5;
                                        int i28 = options.inTargetDensity;
                                        if (i28 <= 0 || iRound5 <= 0 || i28 == iRound5) {
                                            options.inTargetDensity = 0;
                                            options.inDensity = 0;
                                        } else {
                                            options.inScaled = true;
                                        }
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            StringBuilder sb = new StringBuilder("Calculate scaling, source: [");
                                            sb.append(i16);
                                            sb.append("x");
                                            sb.append(i17);
                                            sb.append("], degreesToRotate: ");
                                            sb.append(i19);
                                            sb.append(", target: [");
                                            sb.append(i8);
                                            sb.append("x");
                                            sb.append(i6);
                                            sb.append("], power of two scaled: [");
                                            sb.append(iRound3);
                                            sb.append("x");
                                            sb.append(iFloor2);
                                            sb.append("], exact scale factor: ");
                                            sb.append(fM2813);
                                            sb.append(", power of 2 sample size: ");
                                            sb.append(i27);
                                            sb.append(", adjusted scale factor: ");
                                            sb.append(dM2813);
                                            str3 = ", target density: ";
                                            sb.append(str3);
                                            sb.append(options.inTargetDensity);
                                            str2 = ", density: ";
                                            sb.append(str2);
                                            sb.append(options.inDensity);
                                            Log.v("Downsampler", sb.toString());
                                        } else {
                                            str2 = r7;
                                            str3 = ", target density: ";
                                        }
                                    }
                                    zM3435 = this.f4136.m3435(i8, i6, z8, z9);
                                    if (zM3435) {
                                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                        z4 = false;
                                        options.inMutable = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (zM3435) {
                                        if (enumC0973 != EnumC0973.f3533) {
                                            try {
                                                zHasAlpha = c0253.m1468().hasAlpha();
                                            } catch (IOException e) {
                                                if (Log.isLoggable("Downsampler", 3)) {
                                                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC0973, e);
                                                }
                                                zHasAlpha = z4;
                                            }
                                            if (zHasAlpha) {
                                                config = Bitmap.Config.ARGB_8888;
                                            } else {
                                                config = Bitmap.Config.RGB_565;
                                            }
                                            options.inPreferredConfig = config;
                                            if (config == Bitmap.Config.RGB_565) {
                                                z5 = true;
                                                options.inDither = true;
                                            } else {
                                                z5 = true;
                                            }
                                        } else {
                                            z5 = true;
                                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        }
                                        break;
                                    } else {
                                        z5 = true;
                                    }
                                    i9 = Build.VERSION.SDK_INT;
                                    if (i16 >= 0 || i17 < 0 || !z2) {
                                        i10 = options.inTargetDensity;
                                        if (i10 > 0 || (i12 = options.inDensity) <= 0 || i10 == i12) {
                                            z6 = z4;
                                        } else {
                                            z6 = z5;
                                        }
                                        if (z6) {
                                            f = i10 / options.inDensity;
                                        } else {
                                            f = 1.0f;
                                        }
                                        i11 = options.inSampleSize;
                                        float f7 = i11;
                                        int iCeil = (int) Math.ceil(i16 / f7);
                                        int iCeil2 = (int) Math.ceil(i17 / f7);
                                        iRound = Math.round(iCeil * f);
                                        iRound2 = Math.round(iCeil2 * f);
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i16 + "x" + i17 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                                        }
                                        i6 = iRound2;
                                    } else {
                                        iRound = i8;
                                    }
                                    if (iRound > 0 || i6 <= 0 || (config2 = options.inPreferredConfig) == Bitmap.Config.HARDWARE) {
                                        interfaceC03910 = interfaceC0399;
                                    } else {
                                        Bitmap.Config config3 = options.outConfig;
                                        if (config3 != null) {
                                            config2 = config3;
                                        }
                                        interfaceC03910 = interfaceC0399;
                                        options.inBitmap = interfaceC03910.mo1608(iRound, i6, config2);
                                    }
                                    if (enumC2445 != null) {
                                        if (i9 >= 28) {
                                            if (enumC2445 == EnumC2445.f7797 || (colorSpace = options.outColorSpace) == null || !colorSpace.isWideGamut()) {
                                                z7 = false;
                                            } else {
                                                z7 = true;
                                            }
                                            if (z7) {
                                                named = ColorSpace.Named.DISPLAY_P3;
                                            } else {
                                                named = ColorSpace.Named.SRGB;
                                            }
                                            options.inPreferredColorSpace = ColorSpace.get(named);
                                        } else {
                                            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                                        }
                                    }
                                    bitmapM2814 = m2814(c0253, options, interfaceC1103, interfaceC03910);
                                    interfaceC1103.mo1617(interfaceC03910, bitmapM2814);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                        Log.v("Downsampler", "Decoded " + m2815(bitmapM2814) + " from [" + i16 + "x" + i17 + "] " + str + " with inBitmap " + m2815(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC1879.m3798(j));
                                    }
                                    if (bitmapM2814 != null) {
                                        return null;
                                    }
                                    bitmapM2814.setDensity(this.f4133.densityDpi);
                                    switch (i7) {
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            matrix = new Matrix();
                                            switch (i7) {
                                                case 2:
                                                    matrix.setScale(-1.0f, 1.0f);
                                                    break;
                                                case 3:
                                                    matrix.setRotate(180.0f);
                                                    break;
                                                case 4:
                                                    matrix.setRotate(180.0f);
                                                    matrix.postScale(-1.0f, 1.0f);
                                                    break;
                                                case 5:
                                                    matrix.setRotate(90.0f);
                                                    matrix.postScale(-1.0f, 1.0f);
                                                    break;
                                                case 6:
                                                    matrix.setRotate(90.0f);
                                                    break;
                                                case 7:
                                                    matrix.setRotate(-90.0f);
                                                    matrix.postScale(-1.0f, 1.0f);
                                                    break;
                                                case 8:
                                                    matrix.setRotate(-90.0f);
                                                    break;
                                            }
                                            bitmapM2814 = Bitmap.createBitmap(bitmapM2814, 0, 0, bitmapM2814.getWidth(), bitmapM2814.getHeight(), matrix, true);
                                            bitmap = bitmapM2814;
                                            break;
                                        default:
                                            bitmap = bitmapM2814;
                                            break;
                                    }
                                    if (!bitmap.equals(bitmapM2814)) {
                                        interfaceC03910.mo1609(bitmap);
                                    }
                                    return bitmapM2814;
                                }
                                i18++;
                                list = list2;
                                c1893 = c1894;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                iM2271 = -1;
                switch (iM2271) {
                    case 3:
                    case 4:
                        i3 = Opcodes.GETFIELD;
                        break;
                    case 5:
                    case 6:
                        i3 = 90;
                        break;
                    case 7:
                    case 8:
                        i3 = 270;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                switch (iM2271) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        z3 = true;
                        break;
                    default:
                        z3 = false;
                        break;
                }
                if (i == Integer.MIN_VALUE) {
                    if (i3 != 90) {
                        i4 = 270;
                        if (i3 == 270) {
                            i5 = i16;
                        }
                    } else {
                        i4 = 270;
                    }
                    i5 = i17;
                } else {
                    i4 = 270;
                    i5 = i;
                }
                if (i2 == Integer.MIN_VALUE) {
                    i6 = i2;
                } else if (i3 != 90) {
                    i6 = i16;
                } else {
                    i6 = i16;
                }
                imageHeaderParser$ImageTypeM1468 = c0253.m1468();
                i7 = iM2271;
                boolean z10 = z3;
                if (i16 > 0) {
                    str2 = ", density: ";
                    interfaceC0399 = interfaceC03911;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1468 + " with target [" + i8 + "x" + i6 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    interfaceC0399 = interfaceC03911;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1468 + " with target [" + i8 + "x" + i6 + "]");
                    }
                }
                zM3435 = this.f4136.m3435(i8, i6, z8, z10);
                if (zM3435) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (zM3435) {
                    z5 = true;
                } else if (enumC0973 != EnumC0973.f3533) {
                    zHasAlpha = c0253.m1468().hasAlpha();
                    if (zHasAlpha) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = Bitmap.Config.RGB_565;
                    }
                    options.inPreferredConfig = config;
                    if (config == Bitmap.Config.RGB_565) {
                        z5 = true;
                        options.inDither = true;
                    } else {
                        z5 = true;
                    }
                } else {
                    z5 = true;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
                i9 = Build.VERSION.SDK_INT;
                if (i16 >= 0) {
                    i10 = options.inTargetDensity;
                    if (i10 > 0) {
                        z6 = z4;
                    } else {
                        z6 = z4;
                    }
                    if (z6) {
                        f = i10 / options.inDensity;
                    } else {
                        f = 1.0f;
                    }
                    i11 = options.inSampleSize;
                    float f8 = i11;
                    int iCeil3 = (int) Math.ceil(i16 / f8);
                    int iCeil4 = (int) Math.ceil(i17 / f8);
                    iRound = Math.round(iCeil3 * f);
                    iRound2 = Math.round(iCeil4 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i16 + "x" + i17 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                    }
                    i6 = iRound2;
                } else {
                    i10 = options.inTargetDensity;
                    if (i10 > 0) {
                        z6 = z4;
                    } else {
                        z6 = z4;
                    }
                    if (z6) {
                        f = i10 / options.inDensity;
                    } else {
                        f = 1.0f;
                    }
                    i11 = options.inSampleSize;
                    float f9 = i11;
                    int iCeil5 = (int) Math.ceil(i16 / f9);
                    int iCeil6 = (int) Math.ceil(i17 / f9);
                    iRound = Math.round(iCeil5 * f);
                    iRound2 = Math.round(iCeil6 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i16 + "x" + i17 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                    }
                    i6 = iRound2;
                }
                if (iRound > 0) {
                    interfaceC03910 = interfaceC0399;
                } else {
                    interfaceC03910 = interfaceC0399;
                }
                if (enumC2445 != null) {
                    if (i9 >= 28) {
                        if (enumC2445 == EnumC2445.f7797) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            named = ColorSpace.Named.DISPLAY_P3;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else {
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                bitmapM2814 = m2814(c0253, options, interfaceC1103, interfaceC03910);
                interfaceC1103.mo1617(interfaceC03910, bitmapM2814);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + m2815(bitmapM2814) + " from [" + i16 + "x" + i17 + "] " + str + " with inBitmap " + m2815(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC1879.m3798(j));
                }
                if (bitmapM2814 != null) {
                    return null;
                }
                bitmapM2814.setDensity(this.f4133.densityDpi);
                switch (i7) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
                        switch (i7) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        bitmapM2814 = Bitmap.createBitmap(bitmapM2814, 0, 0, bitmapM2814.getWidth(), bitmapM2814.getHeight(), matrix, true);
                        bitmap = bitmapM2814;
                        break;
                    default:
                        bitmap = bitmapM2814;
                        break;
                }
                if (!bitmap.equals(bitmapM2814)) {
                    interfaceC03910.mo1609(bitmap);
                }
                return bitmapM2814;
            case 15:
                j = jElapsedRealtimeNanos;
                str = str4;
                List list3 = (List) c0253.f1480;
                C2534 c2535 = (C2534) ((C0102) c0253.f1478).f1117;
                c2535.reset();
                iM2271 = AbstractC0738.m2271(list3, c2535, (C1893) c0253.f1479);
                switch (iM2271) {
                    case 3:
                    case 4:
                        i3 = Opcodes.GETFIELD;
                        break;
                    case 5:
                    case 6:
                        i3 = 90;
                        break;
                    case 7:
                    case 8:
                        i3 = 270;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                switch (iM2271) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        z3 = true;
                        break;
                    default:
                        z3 = false;
                        break;
                }
                if (i == Integer.MIN_VALUE) {
                    if (i3 != 90) {
                        i4 = 270;
                        if (i3 == 270) {
                            i5 = i16;
                        }
                    } else {
                        i4 = 270;
                    }
                    i5 = i17;
                } else {
                    i4 = 270;
                    i5 = i;
                }
                if (i2 == Integer.MIN_VALUE) {
                    i6 = i2;
                } else if (i3 != 90) {
                    i6 = i16;
                } else {
                    i6 = i16;
                }
                imageHeaderParser$ImageTypeM1468 = c0253.m1468();
                i7 = iM2271;
                boolean z11 = z3;
                if (i16 > 0) {
                    str2 = ", density: ";
                    interfaceC0399 = interfaceC03911;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1468 + " with target [" + i8 + "x" + i6 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    interfaceC0399 = interfaceC03911;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1468 + " with target [" + i8 + "x" + i6 + "]");
                    }
                }
                zM3435 = this.f4136.m3435(i8, i6, z8, z11);
                if (zM3435) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (zM3435) {
                    z5 = true;
                } else if (enumC0973 != EnumC0973.f3533) {
                    zHasAlpha = c0253.m1468().hasAlpha();
                    if (zHasAlpha) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = Bitmap.Config.RGB_565;
                    }
                    options.inPreferredConfig = config;
                    if (config == Bitmap.Config.RGB_565) {
                        z5 = true;
                        options.inDither = true;
                    } else {
                        z5 = true;
                    }
                } else {
                    z5 = true;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
                i9 = Build.VERSION.SDK_INT;
                if (i16 >= 0) {
                    i10 = options.inTargetDensity;
                    if (i10 > 0) {
                        z6 = z4;
                    } else {
                        z6 = z4;
                    }
                    if (z6) {
                        f = i10 / options.inDensity;
                    } else {
                        f = 1.0f;
                    }
                    i11 = options.inSampleSize;
                    float f10 = i11;
                    int iCeil7 = (int) Math.ceil(i16 / f10);
                    int iCeil8 = (int) Math.ceil(i17 / f10);
                    iRound = Math.round(iCeil7 * f);
                    iRound2 = Math.round(iCeil8 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i16 + "x" + i17 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                    }
                    i6 = iRound2;
                } else {
                    i10 = options.inTargetDensity;
                    if (i10 > 0) {
                        z6 = z4;
                    } else {
                        z6 = z4;
                    }
                    if (z6) {
                        f = i10 / options.inDensity;
                    } else {
                        f = 1.0f;
                    }
                    i11 = options.inSampleSize;
                    float f11 = i11;
                    int iCeil9 = (int) Math.ceil(i16 / f11);
                    int iCeil10 = (int) Math.ceil(i17 / f11);
                    iRound = Math.round(iCeil9 * f);
                    iRound2 = Math.round(iCeil10 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i16 + "x" + i17 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                    }
                    i6 = iRound2;
                }
                if (iRound > 0) {
                    interfaceC03910 = interfaceC0399;
                } else {
                    interfaceC03910 = interfaceC0399;
                }
                if (enumC2445 != null) {
                    if (i9 >= 28) {
                        if (enumC2445 == EnumC2445.f7797) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            named = ColorSpace.Named.DISPLAY_P3;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else {
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                bitmapM2814 = m2814(c0253, options, interfaceC1103, interfaceC03910);
                interfaceC1103.mo1617(interfaceC03910, bitmapM2814);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + m2815(bitmapM2814) + " from [" + i16 + "x" + i17 + "] " + str + " with inBitmap " + m2815(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC1879.m3798(j));
                }
                if (bitmapM2814 != null) {
                    return null;
                }
                bitmapM2814.setDensity(this.f4133.densityDpi);
                switch (i7) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
                        switch (i7) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        bitmapM2814 = Bitmap.createBitmap(bitmapM2814, 0, 0, bitmapM2814.getWidth(), bitmapM2814.getHeight(), matrix, true);
                        bitmap = bitmapM2814;
                        break;
                    default:
                        bitmap = bitmapM2814;
                        break;
                }
                if (!bitmap.equals(bitmapM2814)) {
                    interfaceC03910.mo1609(bitmap);
                }
                return bitmapM2814;
            default:
                List list4 = (List) c0253.f1479;
                j = jElapsedRealtimeNanos;
                C0026 c0026 = (C0026) c0253.f1480;
                C1893 c1895 = (C1893) c0253.f1478;
                int size2 = list4.size();
                str = str4;
                int i29 = 0;
                while (true) {
                    if (i29 < size2) {
                        int i30 = size2;
                        InterfaceC1620 interfaceC1620 = (InterfaceC1620) list4.get(i29);
                        int i31 = i29;
                        try {
                            List list5 = list4;
                            C2534 c2536 = new C2534(new FileInputStream(c0026.m752().getFileDescriptor()), c1895);
                            try {
                                iMo2684 = interfaceC1620.mo2686(c2536, c1895);
                                c2536.m4453();
                                c0026.m752();
                                if (iMo2684 != -1) {
                                    iM2271 = iMo2684;
                                } else {
                                    i29 = i31 + 1;
                                    size2 = i30;
                                    list4 = list5;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                c2534 = c2536;
                                if (c2534 != null) {
                                    c2534.m4453();
                                }
                                c0026.m752();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        iM2271 = -1;
                    }
                }
                switch (iM2271) {
                    case 3:
                    case 4:
                        i3 = Opcodes.GETFIELD;
                        break;
                    case 5:
                    case 6:
                        i3 = 90;
                        break;
                    case 7:
                    case 8:
                        i3 = 270;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                switch (iM2271) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        z3 = true;
                        break;
                    default:
                        z3 = false;
                        break;
                }
                if (i == Integer.MIN_VALUE) {
                    if (i3 != 90) {
                        i4 = 270;
                        if (i3 == 270) {
                            i5 = i16;
                        }
                    } else {
                        i4 = 270;
                    }
                    i5 = i17;
                } else {
                    i4 = 270;
                    i5 = i;
                }
                if (i2 == Integer.MIN_VALUE) {
                    i6 = i2;
                } else if (i3 != 90) {
                    i6 = i16;
                } else {
                    i6 = i16;
                }
                imageHeaderParser$ImageTypeM1468 = c0253.m1468();
                i7 = iM2271;
                boolean z12 = z3;
                if (i16 > 0) {
                    str2 = ", density: ";
                    interfaceC0399 = interfaceC03911;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1468 + " with target [" + i8 + "x" + i6 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    interfaceC0399 = interfaceC03911;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1468 + " with target [" + i8 + "x" + i6 + "]");
                    }
                }
                zM3435 = this.f4136.m3435(i8, i6, z8, z12);
                if (zM3435) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (zM3435) {
                    z5 = true;
                } else if (enumC0973 != EnumC0973.f3533) {
                    zHasAlpha = c0253.m1468().hasAlpha();
                    if (zHasAlpha) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = Bitmap.Config.RGB_565;
                    }
                    options.inPreferredConfig = config;
                    if (config == Bitmap.Config.RGB_565) {
                        z5 = true;
                        options.inDither = true;
                    } else {
                        z5 = true;
                    }
                } else {
                    z5 = true;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
                i9 = Build.VERSION.SDK_INT;
                if (i16 >= 0) {
                    i10 = options.inTargetDensity;
                    if (i10 > 0) {
                        z6 = z4;
                    } else {
                        z6 = z4;
                    }
                    if (z6) {
                        f = i10 / options.inDensity;
                    } else {
                        f = 1.0f;
                    }
                    i11 = options.inSampleSize;
                    float f12 = i11;
                    int iCeil11 = (int) Math.ceil(i16 / f12);
                    int iCeil12 = (int) Math.ceil(i17 / f12);
                    iRound = Math.round(iCeil11 * f);
                    iRound2 = Math.round(iCeil12 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i16 + "x" + i17 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                    }
                    i6 = iRound2;
                } else {
                    i10 = options.inTargetDensity;
                    if (i10 > 0) {
                        z6 = z4;
                    } else {
                        z6 = z4;
                    }
                    if (z6) {
                        f = i10 / options.inDensity;
                    } else {
                        f = 1.0f;
                    }
                    i11 = options.inSampleSize;
                    float f13 = i11;
                    int iCeil13 = (int) Math.ceil(i16 / f13);
                    int iCeil14 = (int) Math.ceil(i17 / f13);
                    iRound = Math.round(iCeil13 * f);
                    iRound2 = Math.round(iCeil14 * f);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i16 + "x" + i17 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f);
                    }
                    i6 = iRound2;
                }
                if (iRound > 0) {
                    interfaceC03910 = interfaceC0399;
                } else {
                    interfaceC03910 = interfaceC0399;
                }
                if (enumC2445 != null) {
                    if (i9 >= 28) {
                        if (enumC2445 == EnumC2445.f7797) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            named = ColorSpace.Named.DISPLAY_P3;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else {
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                bitmapM2814 = m2814(c0253, options, interfaceC1103, interfaceC03910);
                interfaceC1103.mo1617(interfaceC03910, bitmapM2814);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + m2815(bitmapM2814) + " from [" + i16 + "x" + i17 + "] " + str + " with inBitmap " + m2815(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC1879.m3798(j));
                }
                if (bitmapM2814 != null) {
                    return null;
                }
                bitmapM2814.setDensity(this.f4133.densityDpi);
                switch (i7) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
                        switch (i7) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        bitmapM2814 = Bitmap.createBitmap(bitmapM2814, 0, 0, bitmapM2814.getWidth(), bitmapM2814.getHeight(), matrix, true);
                        bitmap = bitmapM2814;
                        break;
                    default:
                        bitmap = bitmapM2814;
                        break;
                }
                if (!bitmap.equals(bitmapM2814)) {
                    interfaceC03910.mo1609(bitmap);
                }
                return bitmapM2814;
        }
    }
}
