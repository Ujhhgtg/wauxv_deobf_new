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
import com.bumptech.glide.load.data.C0019;
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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᲈᛸᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1098 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2301 f4115 = C2301.m4164(EnumC0969.f3519, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2301 f4116 = new C2301("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C2301.f7412);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C2301 f4117;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C2301 f4118;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0373 f4119;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final ArrayDeque f4120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC0424 f4121;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final DisplayMetrics f4122;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1867 f4123;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ArrayList f4124;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1519 f4125 = C1519.m3252();

    static {
        C1096 c1096 = C1096.f4107;
        Boolean bool = Boolean.FALSE;
        f4117 = C2301.m4164(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f4118 = C2301.m4164(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f4119 = new C0373(20);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC3522.f11032;
        f4120 = new ArrayDeque(0);
    }

    public C1098(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC0424 interfaceC0424, C1867 c1867) {
        this.f4124 = arrayList;
        AbstractC1460.m3210(displayMetrics, "Argument must not be null");
        this.f4122 = displayMetrics;
        AbstractC1460.m3210(interfaceC0424, "Argument must not be null");
        this.f4121 = interfaceC0424;
        AbstractC1460.m3210(c1867, "Argument must not be null");
        this.f4123 = c1867;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r1;
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m2665(C0243 c0243, BitmapFactory.Options options, InterfaceC1097 interfaceC1097, InterfaceC0424 interfaceC0424) {
        if (!options.inJustDecodeBounds) {
            interfaceC1097.mo1508();
            switch (c0243.f1403) {
                case 15:
                    C2479 c2479 = (C2479) ((C0094) c0243.f1404).f1049;
                    synchronized (c2479) {
                        c2479.f7919 = c2479.f7917.length;
                        break;
                    }
                    break;
            }
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = AbstractC3429.f10802;
        lock.lock();
        try {
            try {
                Bitmap bitmapM1316 = c0243.m1316(options);
                lock.unlock();
                return bitmapM1316;
            } catch (IllegalArgumentException e) {
                IOException iOExceptionM2667 = m2667(e, i, i2, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionM2667);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionM2667;
                }
                try {
                    interfaceC0424.mo1504(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapM2665 = m2665(c0243, options, interfaceC1097, interfaceC0424);
                    AbstractC3429.f10802.unlock();
                    return bitmapM2665;
                } catch (IOException unused) {
                    throw iOExceptionM2667;
                }
            }
        } catch (Throwable th) {
            AbstractC3429.f10802.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static String m2666(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static IOException m2667(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m2666(options.inBitmap), illegalArgumentException);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m2668(BitmapFactory.Options options) {
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
    public final C0425 m2669(C0243 c0243, int i, int i2, C2303 c2303, InterfaceC1097 interfaceC1097) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f4123.m3640(65536, byte[].class);
        synchronized (C1098.class) {
            arrayDeque = f4120;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m2668(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC0969 enumC0969 = (EnumC0969) c2303.m4165(f4115);
        EnumC2392 enumC2392 = (EnumC2392) c2303.m4165(f4116);
        C1096 c1096 = (C1096) c2303.m4165(C1096.f4112);
        boolean zBooleanValue = ((Boolean) c2303.m4165(f4117)).booleanValue();
        C2301 c2301 = f4118;
        try {
            C0425 c0425M1628 = C0425.m1628(this.f4121, m2670(c0243, options, c1096, enumC0969, enumC2392, c2303.m4165(c2301) != null && ((Boolean) c2303.m4165(c2301)).booleanValue(), i, i2, zBooleanValue, interfaceC1097));
            m2668(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            return c0425M1628;
        } finally {
            m2668(options);
            ArrayDeque arrayDeque2 = f4120;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f4123.m3645(bArr);
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
    public final Bitmap m2670(C0243 c0243, BitmapFactory.Options options, C1096 c1096, EnumC0969 enumC0969, EnumC2392 enumC2392, boolean z, int i, int i2, boolean z2, InterfaceC1097 interfaceC1097) throws Throwable {
        long j;
        String str;
        int iMo2560;
        int iM3970;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM1322;
        int i7;
        String str2;
        InterfaceC0424 interfaceC0424;
        String str3;
        int i8;
        boolean zM3254;
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
        InterfaceC0424 interfaceC0425;
        Bitmap bitmapM2665;
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
        int i15 = 0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC0424 interfaceC0426 = this.f4121;
        m2665(c0243, options, interfaceC1097, interfaceC0426);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i16 = iArr[0];
        int i17 = iArr[1];
        String str4 = options.outMimeType;
        boolean z8 = (i16 == -1 || i17 == -1) ? false : z;
        C2479 c2479 = null;
        switch (c0243.f1403) {
            case 14 /* 14 */:
                j = jElapsedRealtimeNanos;
                str = str4;
                List list = (List) c0243.f1405;
                ByteBuffer byteBufferM1865 = AbstractC0534.m1865((ByteBuffer) c0243.f1404);
                C1867 c1867 = (C1867) c0243.f1406;
                if (byteBufferM1865 != null) {
                    int size = list.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size) {
                            List list2 = list;
                            try {
                                iMo2560 = ((InterfaceC1607) list.get(i18)).mo2560(byteBufferM1865, c1867);
                                C1867 c1868 = c1867;
                                if (iMo2560 != -1) {
                                    iM3970 = iMo2560;
                                    switch (iM3970) {
                                        case 3:
                                        case 4:
                                            i3 = 180;
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
                                    switch (iM3970) {
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
                                    if (i == -2147483648) {
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
                                    if (i2 == -2147483648) {
                                        i6 = i2;
                                    } else if (i3 != 90 || i3 == i4) {
                                        i6 = i16;
                                    } else {
                                        i6 = i17;
                                    }
                                    imageHeaderParser$ImageTypeM1322 = c0243.m1322();
                                    i7 = iM3970;
                                    boolean z9 = z3;
                                    if (i16 > 0 || i17 <= 0) {
                                        str2 = ", density: ";
                                        interfaceC0424 = interfaceC0426;
                                        str3 = ", target density: ";
                                        i8 = i5;
                                        if (Log.isLoggable("Downsampler", 3)) {
                                            Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1322 + " with target [" + i8 + "x" + i6 + "]");
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
                                        float fM2664 = c1096.m2664(i13, i14, i8, i6);
                                        if (fM2664 <= 0.0f) {
                                            throw new IllegalArgumentException("Cannot scale with factor: " + fM2664 + " from: " + c1096 + ", source: [" + i16 + "x" + i17 + "], target: [" + i8 + "x" + i6 + "]");
                                        }
                                        int iM2663 = c1096.m2663(i13, i14, i8, i6);
                                        if (iM2663 == 0) {
                                            throw new IllegalArgumentException("Cannot round with null rounding");
                                        }
                                        int i19 = i3;
                                        float f2 = i13;
                                        int i20 = i13;
                                        float f3 = i14;
                                        int i21 = i14;
                                        int i22 = (int) (((double) (fM2664 * f3)) + 0.5d);
                                        int i23 = i20 / ((int) (((double) (fM2664 * f2)) + 0.5d));
                                        int i24 = i21 / i22;
                                        int iMax = Math.max(1, Integer.highestOneBit(iM2663 == 1 ? Math.max(i23, i24) : Math.min(i23, i24)));
                                        if (iM2663 == 1 && iMax < 1.0f / fM2664) {
                                            iMax <<= 1;
                                        }
                                        options.inSampleSize = iMax;
                                        if (imageHeaderParser$ImageTypeM1322 == ImageHeaderParser$ImageType.JPEG) {
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
                                            if (imageHeaderParser$ImageTypeM1322 == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeM1322 == ImageHeaderParser$ImageType.PNG_A) {
                                                float f4 = iMax;
                                                iFloor = (int) Math.floor(f2 / f4);
                                                iFloor2 = (int) Math.floor(f3 / f4);
                                            } else if (imageHeaderParser$ImageTypeM1322.isWebp()) {
                                                float f5 = iMax;
                                                iRound3 = Math.round(f2 / f5);
                                                iFloor2 = Math.round(f3 / f5);
                                            } else if (i20 % iMax == 0 && i21 % iMax == 0) {
                                                iRound3 = i20 / iMax;
                                                iFloor2 = i21 / iMax;
                                            } else {
                                                options.inJustDecodeBounds = true;
                                                m2665(c0243, options, interfaceC1097, interfaceC0426);
                                                options.inJustDecodeBounds = false;
                                                int[] iArr2 = {options.outWidth, options.outHeight};
                                                iFloor = iArr2[0];
                                                iFloor2 = iArr2[1];
                                            }
                                            iRound3 = iFloor;
                                        }
                                        double dM2664 = c1096.m2664(iRound3, iFloor2, i8, i6);
                                        int iRound4 = (int) Math.round((dM2664 <= 1.0d ? dM2664 : 1.0d / dM2664) * 2.147483647E9d);
                                        interfaceC0424 = interfaceC0426;
                                        int i26 = (int) ((((double) iRound4) * dM2664) + 0.5d);
                                        float f6 = i26 / iRound4;
                                        int i27 = iMax;
                                        options.inTargetDensity = (int) (((dM2664 / ((double) f6)) * ((double) i26)) + 0.5d);
                                        int iRound5 = (int) Math.round((dM2664 <= 1.0d ? dM2664 : 1.0d / dM2664) * 2.147483647E9d);
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
                                            sb.append(fM2664);
                                            sb.append(", power of 2 sample size: ");
                                            sb.append(i27);
                                            sb.append(", adjusted scale factor: ");
                                            sb.append(dM2664);
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
                                    zM3254 = this.f4125.m3254(i8, i6, z8, z9);
                                    if (zM3254) {
                                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                        z4 = false;
                                        options.inMutable = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (zM3254) {
                                        if (enumC0969 != EnumC0969.f3517) {
                                            try {
                                                zHasAlpha = c0243.m1322().hasAlpha();
                                            } catch (IOException e) {
                                                if (Log.isLoggable("Downsampler", 3)) {
                                                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC0969, e);
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
                                        interfaceC0425 = interfaceC0424;
                                    } else {
                                        Bitmap.Config config3 = options.outConfig;
                                        if (config3 != null) {
                                            config2 = config3;
                                        }
                                        interfaceC0425 = interfaceC0424;
                                        options.inBitmap = interfaceC0425.mo1503(iRound, i6, config2);
                                    }
                                    if (enumC2392 != null) {
                                        if (i9 >= 28) {
                                            if (enumC2392 == EnumC2392.f7653 || (colorSpace = options.outColorSpace) == null || !colorSpace.isWideGamut()) {
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
                                    bitmapM2665 = m2665(c0243, options, interfaceC1097, interfaceC0425);
                                    interfaceC1097.mo1512(interfaceC0425, bitmapM2665);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                        Log.v("Downsampler", "Decoded " + m2666(bitmapM2665) + " from [" + i16 + "x" + i17 + "] " + str + " with inBitmap " + m2666(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC1853.m3620(j));
                                    }
                                    if (bitmapM2665 != null) {
                                        return null;
                                    }
                                    bitmapM2665.setDensity(this.f4122.densityDpi);
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
                                            bitmapM2665 = Bitmap.createBitmap(bitmapM2665, 0, 0, bitmapM2665.getWidth(), bitmapM2665.getHeight(), matrix, true);
                                            bitmap = bitmapM2665;
                                            break;
                                        default:
                                            bitmap = bitmapM2665;
                                            break;
                                    }
                                    if (!bitmap.equals(bitmapM2665)) {
                                        interfaceC0425.mo1504(bitmap);
                                    }
                                    return bitmapM2665;
                                }
                                i18++;
                                list = list2;
                                c1867 = c1868;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                iM3970 = -1;
                switch (iM3970) {
                    case 3:
                    case 4:
                        i3 = 180;
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
                switch (iM3970) {
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
                if (i == -2147483648) {
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
                if (i2 == -2147483648) {
                    i6 = i2;
                } else if (i3 != 90) {
                    i6 = i16;
                } else {
                    i6 = i16;
                }
                imageHeaderParser$ImageTypeM1322 = c0243.m1322();
                i7 = iM3970;
                boolean z10 = z3;
                if (i16 > 0) {
                    str2 = ", density: ";
                    interfaceC0424 = interfaceC0426;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1322 + " with target [" + i8 + "x" + i6 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    interfaceC0424 = interfaceC0426;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1322 + " with target [" + i8 + "x" + i6 + "]");
                    }
                }
                zM3254 = this.f4125.m3254(i8, i6, z8, z10);
                if (zM3254) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (zM3254) {
                    z5 = true;
                } else if (enumC0969 != EnumC0969.f3517) {
                    zHasAlpha = c0243.m1322().hasAlpha();
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
                    interfaceC0425 = interfaceC0424;
                } else {
                    interfaceC0425 = interfaceC0424;
                }
                if (enumC2392 != null) {
                    if (i9 >= 28) {
                        if (enumC2392 == EnumC2392.f7653) {
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
                bitmapM2665 = m2665(c0243, options, interfaceC1097, interfaceC0425);
                interfaceC1097.mo1512(interfaceC0425, bitmapM2665);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + m2666(bitmapM2665) + " from [" + i16 + "x" + i17 + "] " + str + " with inBitmap " + m2666(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC1853.m3620(j));
                }
                if (bitmapM2665 != null) {
                    return null;
                }
                bitmapM2665.setDensity(this.f4122.densityDpi);
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
                        bitmapM2665 = Bitmap.createBitmap(bitmapM2665, 0, 0, bitmapM2665.getWidth(), bitmapM2665.getHeight(), matrix, true);
                        bitmap = bitmapM2665;
                        break;
                    default:
                        bitmap = bitmapM2665;
                        break;
                }
                if (!bitmap.equals(bitmapM2665)) {
                    interfaceC0425.mo1504(bitmap);
                }
                return bitmapM2665;
            case 15:
                j = jElapsedRealtimeNanos;
                str = str4;
                List list3 = (List) c0243.f1406;
                C2479 c24710 = (C2479) ((C0094) c0243.f1404).f1049;
                c24710.reset();
                iM3970 = AbstractC2201.m3970(list3, c24710, (C1867) c0243.f1405);
                switch (iM3970) {
                    case 3:
                    case 4:
                        i3 = 180;
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
                switch (iM3970) {
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
                if (i == -2147483648) {
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
                if (i2 == -2147483648) {
                    i6 = i2;
                } else if (i3 != 90) {
                    i6 = i16;
                } else {
                    i6 = i16;
                }
                imageHeaderParser$ImageTypeM1322 = c0243.m1322();
                i7 = iM3970;
                boolean z11 = z3;
                if (i16 > 0) {
                    str2 = ", density: ";
                    interfaceC0424 = interfaceC0426;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1322 + " with target [" + i8 + "x" + i6 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    interfaceC0424 = interfaceC0426;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1322 + " with target [" + i8 + "x" + i6 + "]");
                    }
                }
                zM3254 = this.f4125.m3254(i8, i6, z8, z11);
                if (zM3254) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (zM3254) {
                    z5 = true;
                } else if (enumC0969 != EnumC0969.f3517) {
                    zHasAlpha = c0243.m1322().hasAlpha();
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
                    interfaceC0425 = interfaceC0424;
                } else {
                    interfaceC0425 = interfaceC0424;
                }
                if (enumC2392 != null) {
                    if (i9 >= 28) {
                        if (enumC2392 == EnumC2392.f7653) {
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
                bitmapM2665 = m2665(c0243, options, interfaceC1097, interfaceC0425);
                interfaceC1097.mo1512(interfaceC0425, bitmapM2665);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + m2666(bitmapM2665) + " from [" + i16 + "x" + i17 + "] " + str + " with inBitmap " + m2666(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC1853.m3620(j));
                }
                if (bitmapM2665 != null) {
                    return null;
                }
                bitmapM2665.setDensity(this.f4122.densityDpi);
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
                        bitmapM2665 = Bitmap.createBitmap(bitmapM2665, 0, 0, bitmapM2665.getWidth(), bitmapM2665.getHeight(), matrix, true);
                        bitmap = bitmapM2665;
                        break;
                    default:
                        bitmap = bitmapM2665;
                        break;
                }
                if (!bitmap.equals(bitmapM2665)) {
                    interfaceC0425.mo1504(bitmap);
                }
                return bitmapM2665;
            default:
                List list4 = (List) c0243.f1405;
                j = jElapsedRealtimeNanos;
                C0019 c0019 = (C0019) c0243.f1406;
                C1867 c1869 = (C1867) c0243.f1404;
                int size2 = list4.size();
                str = str4;
                int i29 = 0;
                while (true) {
                    if (i29 < size2) {
                        int i30 = size2;
                        InterfaceC1607 interfaceC1607 = (InterfaceC1607) list4.get(i29);
                        int i31 = i29;
                        try {
                            List list5 = list4;
                            C2479 c24711 = new C2479(new FileInputStream(c0019.m609().getFileDescriptor()), c1869);
                            try {
                                iMo2560 = interfaceC1607.mo2562(c24711, c1869);
                                c24711.m4432();
                                c0019.m609();
                                if (iMo2560 != -1) {
                                    iM3970 = iMo2560;
                                } else {
                                    i29 = i31 + 1;
                                    size2 = i30;
                                    list4 = list5;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                c2479 = c24711;
                                if (c2479 != null) {
                                    c2479.m4432();
                                }
                                c0019.m609();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        iM3970 = -1;
                    }
                }
                switch (iM3970) {
                    case 3:
                    case 4:
                        i3 = 180;
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
                switch (iM3970) {
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
                if (i == -2147483648) {
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
                if (i2 == -2147483648) {
                    i6 = i2;
                } else if (i3 != 90) {
                    i6 = i16;
                } else {
                    i6 = i16;
                }
                imageHeaderParser$ImageTypeM1322 = c0243.m1322();
                i7 = iM3970;
                boolean z12 = z3;
                if (i16 > 0) {
                    str2 = ", density: ";
                    interfaceC0424 = interfaceC0426;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1322 + " with target [" + i8 + "x" + i6 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    interfaceC0424 = interfaceC0426;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM1322 + " with target [" + i8 + "x" + i6 + "]");
                    }
                }
                zM3254 = this.f4125.m3254(i8, i6, z8, z12);
                if (zM3254) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (zM3254) {
                    z5 = true;
                } else if (enumC0969 != EnumC0969.f3517) {
                    zHasAlpha = c0243.m1322().hasAlpha();
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
                    interfaceC0425 = interfaceC0424;
                } else {
                    interfaceC0425 = interfaceC0424;
                }
                if (enumC2392 != null) {
                    if (i9 >= 28) {
                        if (enumC2392 == EnumC2392.f7653) {
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
                bitmapM2665 = m2665(c0243, options, interfaceC1097, interfaceC0425);
                interfaceC1097.mo1512(interfaceC0425, bitmapM2665);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + m2666(bitmapM2665) + " from [" + i16 + "x" + i17 + "] " + str + " with inBitmap " + m2666(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC1853.m3620(j));
                }
                if (bitmapM2665 != null) {
                    return null;
                }
                bitmapM2665.setDensity(this.f4122.densityDpi);
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
                        bitmapM2665 = Bitmap.createBitmap(bitmapM2665, 0, 0, bitmapM2665.getWidth(), bitmapM2665.getHeight(), matrix, true);
                        bitmap = bitmapM2665;
                        break;
                    default:
                        bitmap = bitmapM2665;
                        break;
                }
                if (!bitmap.equals(bitmapM2665)) {
                    interfaceC0425.mo1504(bitmap);
                }
                return bitmapM2665;
        }
    }
}
