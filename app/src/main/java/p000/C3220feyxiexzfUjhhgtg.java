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
import com.bumptech.glide.load.data.Ujhhgtgfeyxiexzf;
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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛳᛴᛲ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3220feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C1469feyxiexzfUjhhgtg f10112Ujhhgtgfeyxiexzf = C1469feyxiexzfUjhhgtg.m2972Ujhhgtgfeyxiexzf(EnumC3088Ujhhgtgfeyxiexzf.f9567Ujhhgtgfeyxiexzf, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C1469feyxiexzfUjhhgtg f10113Ujhhgtgfeyxiexzf = new C1469feyxiexzfUjhhgtg("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C1469feyxiexzfUjhhgtg.f5103Ujhhgtgfeyxiexzf);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final C1469feyxiexzfUjhhgtg f10114Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final C1469feyxiexzfUjhhgtg f10115Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C2466feyxiexzfUjhhgtg f10116Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final ArrayDeque f10117Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC2512feyxiexzfUjhhgtg f10118Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final DisplayMetrics f10119Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0271Ujhhgtgfeyxiexzf f10120Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ArrayList f10121Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0540Ujhhgtgfeyxiexzf f10122Ujhhgtgfeyxiexzf = C0540Ujhhgtgfeyxiexzf.m1832Ujhhgtgfeyxiexzf();

    static {
        C3218feyxiexzfUjhhgtg c3218feyxiexzfUjhhgtg = C3218feyxiexzfUjhhgtg.f10104Ujhhgtgfeyxiexzf;
        Boolean bool = Boolean.FALSE;
        f10114Ujhhgtgfeyxiexzf = C1469feyxiexzfUjhhgtg.m2972Ujhhgtgfeyxiexzf(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f10115Ujhhgtgfeyxiexzf = C1469feyxiexzfUjhhgtg.m2972Ujhhgtgfeyxiexzf(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f10116Ujhhgtgfeyxiexzf = new C2466feyxiexzfUjhhgtg(21);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC1860Ujhhgtgfeyxiexzf.f6239Ujhhgtgfeyxiexzf;
        f10117Ujhhgtgfeyxiexzf = new ArrayDeque(0);
    }

    public C3220feyxiexzfUjhhgtg(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        this.f10121Ujhhgtgfeyxiexzf = arrayList;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(displayMetrics, "Argument must not be null");
        this.f10119Ujhhgtgfeyxiexzf = displayMetrics;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg, "Argument must not be null");
        this.f10118Ujhhgtgfeyxiexzf = interfaceC2512feyxiexzfUjhhgtg;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(c0271Ujhhgtgfeyxiexzf, "Argument must not be null");
        this.f10120Ujhhgtgfeyxiexzf = c0271Ujhhgtgfeyxiexzf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r1;
     */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m4715Ujhhgtgfeyxiexzf(C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf, BitmapFactory.Options options, InterfaceC3217feyxiexzfUjhhgtg interfaceC3217feyxiexzfUjhhgtg, InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg) {
        if (!options.inJustDecodeBounds) {
            interfaceC3217feyxiexzfUjhhgtg.mo3703Ujhhgtgfeyxiexzf();
            switch (c2366Ujhhgtgfeyxiexzf.f7713Ujhhgtgfeyxiexzf) {
                case 15:
                    C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg = (C0790feyxiexzfUjhhgtg) ((C2965Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf).f9276Ujhhgtgfeyxiexzf;
                    synchronized (c0790feyxiexzfUjhhgtg) {
                        c0790feyxiexzfUjhhgtg.f3101Ujhhgtgfeyxiexzf = c0790feyxiexzfUjhhgtg.f3099Ujhhgtgfeyxiexzf.length;
                        break;
                    }
                    break;
            }
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = AbstractC1767feyxiexzfUjhhgtg.f5941Ujhhgtgfeyxiexzf;
        lock.lock();
        try {
            try {
                Bitmap bitmapM3598Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf.m3598Ujhhgtgfeyxiexzf(options);
                lock.unlock();
                return bitmapM3598Ujhhgtgfeyxiexzf;
            } catch (IllegalArgumentException e) {
                IOException iOExceptionM4717Ujhhgtgfeyxiexzf = m4717Ujhhgtgfeyxiexzf(e, i, i2, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionM4717Ujhhgtgfeyxiexzf);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionM4717Ujhhgtgfeyxiexzf;
                }
                try {
                    interfaceC2512feyxiexzfUjhhgtg.mo1472Ujhhgtgfeyxiexzf(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapM4715Ujhhgtgfeyxiexzf = m4715Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, options, interfaceC3217feyxiexzfUjhhgtg, interfaceC2512feyxiexzfUjhhgtg);
                    AbstractC1767feyxiexzfUjhhgtg.f5941Ujhhgtgfeyxiexzf.unlock();
                    return bitmapM4715Ujhhgtgfeyxiexzf;
                } catch (IOException unused) {
                    throw iOExceptionM4717Ujhhgtgfeyxiexzf;
                }
            }
        } catch (Throwable th) {
            AbstractC1767feyxiexzfUjhhgtg.f5941Ujhhgtgfeyxiexzf.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static String m4716Ujhhgtgfeyxiexzf(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static IOException m4717Ujhhgtgfeyxiexzf(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m4716Ujhhgtgfeyxiexzf(options.inBitmap), illegalArgumentException);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m4718Ujhhgtgfeyxiexzf(BitmapFactory.Options options) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2511feyxiexzfUjhhgtg m4719Ujhhgtgfeyxiexzf(C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg, InterfaceC3217feyxiexzfUjhhgtg interfaceC3217feyxiexzfUjhhgtg) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f10120Ujhhgtgfeyxiexzf.m1462Ujhhgtgfeyxiexzf(65536, byte[].class);
        synchronized (C3220feyxiexzfUjhhgtg.class) {
            arrayDeque = f10117Ujhhgtgfeyxiexzf;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m4718Ujhhgtgfeyxiexzf(options);
            }
        }
        options.inTempStorage = bArr;
        EnumC3088Ujhhgtgfeyxiexzf enumC3088Ujhhgtgfeyxiexzf = (EnumC3088Ujhhgtgfeyxiexzf) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(f10112Ujhhgtgfeyxiexzf);
        EnumC0855feyxiexzfUjhhgtg enumC0855feyxiexzfUjhhgtg = (EnumC0855feyxiexzfUjhhgtg) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(f10113Ujhhgtgfeyxiexzf);
        C3218feyxiexzfUjhhgtg c3218feyxiexzfUjhhgtg = (C3218feyxiexzfUjhhgtg) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(C3218feyxiexzfUjhhgtg.f10109Ujhhgtgfeyxiexzf);
        boolean zBooleanValue = ((Boolean) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(f10114Ujhhgtgfeyxiexzf)).booleanValue();
        C1469feyxiexzfUjhhgtg c1469feyxiexzfUjhhgtg = f10115Ujhhgtgfeyxiexzf;
        try {
            C2511feyxiexzfUjhhgtg c2511feyxiexzfUjhhgtgM3790Ujhhgtgfeyxiexzf = C2511feyxiexzfUjhhgtg.m3790Ujhhgtgfeyxiexzf(this.f10118Ujhhgtgfeyxiexzf, m4720Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, options, c3218feyxiexzfUjhhgtg, enumC3088Ujhhgtgfeyxiexzf, enumC0855feyxiexzfUjhhgtg, c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(c1469feyxiexzfUjhhgtg) != null && ((Boolean) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(c1469feyxiexzfUjhhgtg)).booleanValue(), i, i2, zBooleanValue, interfaceC3217feyxiexzfUjhhgtg));
            m4718Ujhhgtgfeyxiexzf(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            return c2511feyxiexzfUjhhgtgM3790Ujhhgtgfeyxiexzf;
        } finally {
            m4718Ujhhgtgfeyxiexzf(options);
            ArrayDeque arrayDeque2 = f10117Ujhhgtgfeyxiexzf;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f10120Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(bArr);
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Bitmap m4720Ujhhgtgfeyxiexzf(C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf, BitmapFactory.Options options, C3218feyxiexzfUjhhgtg c3218feyxiexzfUjhhgtg, EnumC3088Ujhhgtgfeyxiexzf enumC3088Ujhhgtgfeyxiexzf, EnumC0855feyxiexzfUjhhgtg enumC0855feyxiexzfUjhhgtg, boolean z, int i, int i2, boolean z2, InterfaceC3217feyxiexzfUjhhgtg interfaceC3217feyxiexzfUjhhgtg) throws Throwable {
        long j;
        String str;
        int iMo2089Ujhhgtgfeyxiexzf;
        int iM2736Ujhhgtgfeyxiexzf;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf;
        int i7;
        String str2;
        InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg;
        String str3;
        int i8;
        boolean zM1834Ujhhgtgfeyxiexzf;
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
        InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg2;
        Bitmap bitmapM4715Ujhhgtgfeyxiexzf;
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
        int i15 = AbstractC0264Ujhhgtgfeyxiexzf.f1650Ujhhgtgfeyxiexzf;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg3 = this.f10118Ujhhgtgfeyxiexzf;
        m4715Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, options, interfaceC3217feyxiexzfUjhhgtg, interfaceC2512feyxiexzfUjhhgtg3);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i16 = iArr[0];
        int i17 = iArr[1];
        String str4 = options.outMimeType;
        boolean z8 = (i16 == -1 || i17 == -1) ? false : z;
        C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg = null;
        switch (c2366Ujhhgtgfeyxiexzf.f7713Ujhhgtgfeyxiexzf) {
            case Opcodes.DCONST_0 /* 14 */:
                j = jElapsedRealtimeNanos;
                str = str4;
                List list = (List) c2366Ujhhgtgfeyxiexzf.f7715Ujhhgtgfeyxiexzf;
                ByteBuffer byteBufferM3980Ujhhgtgfeyxiexzf = AbstractC2648Ujhhgtgfeyxiexzf.m3980Ujhhgtgfeyxiexzf((ByteBuffer) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf);
                C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = (C0271Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf;
                if (byteBufferM3980Ujhhgtgfeyxiexzf != null) {
                    int size = list.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size) {
                            List list2 = list;
                            try {
                                iMo2089Ujhhgtgfeyxiexzf = ((InterfaceC0751Ujhhgtgfeyxiexzf) list.get(i18)).mo2089Ujhhgtgfeyxiexzf(byteBufferM3980Ujhhgtgfeyxiexzf, c0271Ujhhgtgfeyxiexzf);
                                C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf2 = c0271Ujhhgtgfeyxiexzf;
                                if (iMo2089Ujhhgtgfeyxiexzf != -1) {
                                    iM2736Ujhhgtgfeyxiexzf = iMo2089Ujhhgtgfeyxiexzf;
                                    switch (iM2736Ujhhgtgfeyxiexzf) {
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
                                    switch (iM2736Ujhhgtgfeyxiexzf) {
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
                                    imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf.m3604Ujhhgtgfeyxiexzf();
                                    i7 = iM2736Ujhhgtgfeyxiexzf;
                                    boolean z9 = z3;
                                    if (i16 > 0 || i17 <= 0) {
                                        str2 = ", density: ";
                                        interfaceC2512feyxiexzfUjhhgtg = interfaceC2512feyxiexzfUjhhgtg3;
                                        str3 = ", target density: ";
                                        i8 = i5;
                                        if (Log.isLoggable("Downsampler", 3)) {
                                            Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf + " with target [" + i8 + "x" + i6 + "]");
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
                                        float fM4714Ujhhgtgfeyxiexzf = c3218feyxiexzfUjhhgtg.m4714Ujhhgtgfeyxiexzf(i13, i14, i8, i6);
                                        if (fM4714Ujhhgtgfeyxiexzf <= 0.0f) {
                                            throw new IllegalArgumentException("Cannot scale with factor: " + fM4714Ujhhgtgfeyxiexzf + " from: " + c3218feyxiexzfUjhhgtg + ", source: [" + i16 + "x" + i17 + "], target: [" + i8 + "x" + i6 + "]");
                                        }
                                        int iM4713Ujhhgtgfeyxiexzf = c3218feyxiexzfUjhhgtg.m4713Ujhhgtgfeyxiexzf(i13, i14, i8, i6);
                                        if (iM4713Ujhhgtgfeyxiexzf == 0) {
                                            throw new IllegalArgumentException("Cannot round with null rounding");
                                        }
                                        int i19 = i3;
                                        float f2 = i13;
                                        int i20 = i13;
                                        float f3 = i14;
                                        int i21 = i14;
                                        int i22 = (int) (((double) (fM4714Ujhhgtgfeyxiexzf * f3)) + 0.5d);
                                        int i23 = i20 / ((int) (((double) (fM4714Ujhhgtgfeyxiexzf * f2)) + 0.5d));
                                        int i24 = i21 / i22;
                                        int iMax = Math.max(1, Integer.highestOneBit(iM4713Ujhhgtgfeyxiexzf == 1 ? Math.max(i23, i24) : Math.min(i23, i24)));
                                        if (iM4713Ujhhgtgfeyxiexzf == 1 && iMax < 1.0f / fM4714Ujhhgtgfeyxiexzf) {
                                            iMax <<= 1;
                                        }
                                        options.inSampleSize = iMax;
                                        if (imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf == ImageHeaderParser$ImageType.JPEG) {
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
                                            if (imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf == ImageHeaderParser$ImageType.PNG_A) {
                                                float f4 = iMax;
                                                iFloor = (int) Math.floor(f2 / f4);
                                                iFloor2 = (int) Math.floor(f3 / f4);
                                            } else if (imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf.isWebp()) {
                                                float f5 = iMax;
                                                iRound3 = Math.round(f2 / f5);
                                                iFloor2 = Math.round(f3 / f5);
                                            } else if (i20 % iMax == 0 && i21 % iMax == 0) {
                                                iRound3 = i20 / iMax;
                                                iFloor2 = i21 / iMax;
                                            } else {
                                                options.inJustDecodeBounds = true;
                                                m4715Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, options, interfaceC3217feyxiexzfUjhhgtg, interfaceC2512feyxiexzfUjhhgtg3);
                                                options.inJustDecodeBounds = false;
                                                int[] iArr2 = {options.outWidth, options.outHeight};
                                                iFloor = iArr2[0];
                                                iFloor2 = iArr2[1];
                                            }
                                            iRound3 = iFloor;
                                        }
                                        double dM4714Ujhhgtgfeyxiexzf = c3218feyxiexzfUjhhgtg.m4714Ujhhgtgfeyxiexzf(iRound3, iFloor2, i8, i6);
                                        int iRound4 = (int) Math.round((dM4714Ujhhgtgfeyxiexzf <= 1.0d ? dM4714Ujhhgtgfeyxiexzf : 1.0d / dM4714Ujhhgtgfeyxiexzf) * 2.147483647E9d);
                                        interfaceC2512feyxiexzfUjhhgtg = interfaceC2512feyxiexzfUjhhgtg3;
                                        int i26 = (int) ((((double) iRound4) * dM4714Ujhhgtgfeyxiexzf) + 0.5d);
                                        float f6 = i26 / iRound4;
                                        int i27 = iMax;
                                        options.inTargetDensity = (int) (((dM4714Ujhhgtgfeyxiexzf / ((double) f6)) * ((double) i26)) + 0.5d);
                                        int iRound5 = (int) Math.round((dM4714Ujhhgtgfeyxiexzf <= 1.0d ? dM4714Ujhhgtgfeyxiexzf : 1.0d / dM4714Ujhhgtgfeyxiexzf) * 2.147483647E9d);
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
                                            sb.append(fM4714Ujhhgtgfeyxiexzf);
                                            sb.append(", power of 2 sample size: ");
                                            sb.append(i27);
                                            sb.append(", adjusted scale factor: ");
                                            sb.append(dM4714Ujhhgtgfeyxiexzf);
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
                                    zM1834Ujhhgtgfeyxiexzf = this.f10122Ujhhgtgfeyxiexzf.m1834Ujhhgtgfeyxiexzf(i8, i6, z8, z9);
                                    if (zM1834Ujhhgtgfeyxiexzf) {
                                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                        z4 = false;
                                        options.inMutable = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (zM1834Ujhhgtgfeyxiexzf) {
                                        if (enumC3088Ujhhgtgfeyxiexzf != EnumC3088Ujhhgtgfeyxiexzf.f9565Ujhhgtgfeyxiexzf) {
                                            try {
                                                zHasAlpha = c2366Ujhhgtgfeyxiexzf.m3604Ujhhgtgfeyxiexzf().hasAlpha();
                                            } catch (IOException e) {
                                                if (Log.isLoggable("Downsampler", 3)) {
                                                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC3088Ujhhgtgfeyxiexzf, e);
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
                                        interfaceC2512feyxiexzfUjhhgtg2 = interfaceC2512feyxiexzfUjhhgtg;
                                    } else {
                                        Bitmap.Config config3 = options.outConfig;
                                        if (config3 != null) {
                                            config2 = config3;
                                        }
                                        interfaceC2512feyxiexzfUjhhgtg2 = interfaceC2512feyxiexzfUjhhgtg;
                                        options.inBitmap = interfaceC2512feyxiexzfUjhhgtg2.mo1471Ujhhgtgfeyxiexzf(iRound, i6, config2);
                                    }
                                    if (enumC0855feyxiexzfUjhhgtg != null) {
                                        if (i9 >= 28) {
                                            if (enumC0855feyxiexzfUjhhgtg == EnumC0855feyxiexzfUjhhgtg.f3347Ujhhgtgfeyxiexzf || (colorSpace = options.outColorSpace) == null || !colorSpace.isWideGamut()) {
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
                                    bitmapM4715Ujhhgtgfeyxiexzf = m4715Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, options, interfaceC3217feyxiexzfUjhhgtg, interfaceC2512feyxiexzfUjhhgtg2);
                                    interfaceC3217feyxiexzfUjhhgtg.mo3705Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg2, bitmapM4715Ujhhgtgfeyxiexzf);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                        Log.v("Downsampler", "Decoded " + m4716Ujhhgtgfeyxiexzf(bitmapM4715Ujhhgtgfeyxiexzf) + " from [" + i16 + "x" + i17 + "] " + str + " with inBitmap " + m4716Ujhhgtgfeyxiexzf(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(j));
                                    }
                                    if (bitmapM4715Ujhhgtgfeyxiexzf != null) {
                                        return null;
                                    }
                                    bitmapM4715Ujhhgtgfeyxiexzf.setDensity(this.f10119Ujhhgtgfeyxiexzf.densityDpi);
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
                                            bitmapM4715Ujhhgtgfeyxiexzf = Bitmap.createBitmap(bitmapM4715Ujhhgtgfeyxiexzf, 0, 0, bitmapM4715Ujhhgtgfeyxiexzf.getWidth(), bitmapM4715Ujhhgtgfeyxiexzf.getHeight(), matrix, true);
                                            bitmap = bitmapM4715Ujhhgtgfeyxiexzf;
                                            break;
                                        default:
                                            bitmap = bitmapM4715Ujhhgtgfeyxiexzf;
                                            break;
                                    }
                                    if (!bitmap.equals(bitmapM4715Ujhhgtgfeyxiexzf)) {
                                        interfaceC2512feyxiexzfUjhhgtg2.mo1472Ujhhgtgfeyxiexzf(bitmap);
                                    }
                                    return bitmapM4715Ujhhgtgfeyxiexzf;
                                }
                                i18++;
                                list = list2;
                                c0271Ujhhgtgfeyxiexzf = c0271Ujhhgtgfeyxiexzf2;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                iM2736Ujhhgtgfeyxiexzf = -1;
                switch (iM2736Ujhhgtgfeyxiexzf) {
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
                switch (iM2736Ujhhgtgfeyxiexzf) {
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
                imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf.m3604Ujhhgtgfeyxiexzf();
                i7 = iM2736Ujhhgtgfeyxiexzf;
                boolean z10 = z3;
                if (i16 > 0) {
                    str2 = ", density: ";
                    interfaceC2512feyxiexzfUjhhgtg = interfaceC2512feyxiexzfUjhhgtg3;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf + " with target [" + i8 + "x" + i6 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    interfaceC2512feyxiexzfUjhhgtg = interfaceC2512feyxiexzfUjhhgtg3;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf + " with target [" + i8 + "x" + i6 + "]");
                    }
                }
                zM1834Ujhhgtgfeyxiexzf = this.f10122Ujhhgtgfeyxiexzf.m1834Ujhhgtgfeyxiexzf(i8, i6, z8, z10);
                if (zM1834Ujhhgtgfeyxiexzf) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (zM1834Ujhhgtgfeyxiexzf) {
                    z5 = true;
                } else if (enumC3088Ujhhgtgfeyxiexzf != EnumC3088Ujhhgtgfeyxiexzf.f9565Ujhhgtgfeyxiexzf) {
                    zHasAlpha = c2366Ujhhgtgfeyxiexzf.m3604Ujhhgtgfeyxiexzf().hasAlpha();
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
                    interfaceC2512feyxiexzfUjhhgtg2 = interfaceC2512feyxiexzfUjhhgtg;
                } else {
                    interfaceC2512feyxiexzfUjhhgtg2 = interfaceC2512feyxiexzfUjhhgtg;
                }
                if (enumC0855feyxiexzfUjhhgtg != null) {
                    if (i9 >= 28) {
                        if (enumC0855feyxiexzfUjhhgtg == EnumC0855feyxiexzfUjhhgtg.f3347Ujhhgtgfeyxiexzf) {
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
                bitmapM4715Ujhhgtgfeyxiexzf = m4715Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, options, interfaceC3217feyxiexzfUjhhgtg, interfaceC2512feyxiexzfUjhhgtg2);
                interfaceC3217feyxiexzfUjhhgtg.mo3705Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg2, bitmapM4715Ujhhgtgfeyxiexzf);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + m4716Ujhhgtgfeyxiexzf(bitmapM4715Ujhhgtgfeyxiexzf) + " from [" + i16 + "x" + i17 + "] " + str + " with inBitmap " + m4716Ujhhgtgfeyxiexzf(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(j));
                }
                if (bitmapM4715Ujhhgtgfeyxiexzf != null) {
                    return null;
                }
                bitmapM4715Ujhhgtgfeyxiexzf.setDensity(this.f10119Ujhhgtgfeyxiexzf.densityDpi);
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
                        bitmapM4715Ujhhgtgfeyxiexzf = Bitmap.createBitmap(bitmapM4715Ujhhgtgfeyxiexzf, 0, 0, bitmapM4715Ujhhgtgfeyxiexzf.getWidth(), bitmapM4715Ujhhgtgfeyxiexzf.getHeight(), matrix, true);
                        bitmap = bitmapM4715Ujhhgtgfeyxiexzf;
                        break;
                    default:
                        bitmap = bitmapM4715Ujhhgtgfeyxiexzf;
                        break;
                }
                if (!bitmap.equals(bitmapM4715Ujhhgtgfeyxiexzf)) {
                    interfaceC2512feyxiexzfUjhhgtg2.mo1472Ujhhgtgfeyxiexzf(bitmap);
                }
                return bitmapM4715Ujhhgtgfeyxiexzf;
            case 15:
                j = jElapsedRealtimeNanos;
                str = str4;
                List list3 = (List) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf;
                C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg2 = (C0790feyxiexzfUjhhgtg) ((C2965Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf).f9276Ujhhgtgfeyxiexzf;
                c0790feyxiexzfUjhhgtg2.reset();
                iM2736Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2736Ujhhgtgfeyxiexzf(list3, c0790feyxiexzfUjhhgtg2, (C0271Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7715Ujhhgtgfeyxiexzf);
                switch (iM2736Ujhhgtgfeyxiexzf) {
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
                switch (iM2736Ujhhgtgfeyxiexzf) {
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
                imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf.m3604Ujhhgtgfeyxiexzf();
                i7 = iM2736Ujhhgtgfeyxiexzf;
                boolean z11 = z3;
                if (i16 > 0) {
                    str2 = ", density: ";
                    interfaceC2512feyxiexzfUjhhgtg = interfaceC2512feyxiexzfUjhhgtg3;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf + " with target [" + i8 + "x" + i6 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    interfaceC2512feyxiexzfUjhhgtg = interfaceC2512feyxiexzfUjhhgtg3;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf + " with target [" + i8 + "x" + i6 + "]");
                    }
                }
                zM1834Ujhhgtgfeyxiexzf = this.f10122Ujhhgtgfeyxiexzf.m1834Ujhhgtgfeyxiexzf(i8, i6, z8, z11);
                if (zM1834Ujhhgtgfeyxiexzf) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (zM1834Ujhhgtgfeyxiexzf) {
                    z5 = true;
                } else if (enumC3088Ujhhgtgfeyxiexzf != EnumC3088Ujhhgtgfeyxiexzf.f9565Ujhhgtgfeyxiexzf) {
                    zHasAlpha = c2366Ujhhgtgfeyxiexzf.m3604Ujhhgtgfeyxiexzf().hasAlpha();
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
                    interfaceC2512feyxiexzfUjhhgtg2 = interfaceC2512feyxiexzfUjhhgtg;
                } else {
                    interfaceC2512feyxiexzfUjhhgtg2 = interfaceC2512feyxiexzfUjhhgtg;
                }
                if (enumC0855feyxiexzfUjhhgtg != null) {
                    if (i9 >= 28) {
                        if (enumC0855feyxiexzfUjhhgtg == EnumC0855feyxiexzfUjhhgtg.f3347Ujhhgtgfeyxiexzf) {
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
                bitmapM4715Ujhhgtgfeyxiexzf = m4715Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, options, interfaceC3217feyxiexzfUjhhgtg, interfaceC2512feyxiexzfUjhhgtg2);
                interfaceC3217feyxiexzfUjhhgtg.mo3705Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg2, bitmapM4715Ujhhgtgfeyxiexzf);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + m4716Ujhhgtgfeyxiexzf(bitmapM4715Ujhhgtgfeyxiexzf) + " from [" + i16 + "x" + i17 + "] " + str + " with inBitmap " + m4716Ujhhgtgfeyxiexzf(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(j));
                }
                if (bitmapM4715Ujhhgtgfeyxiexzf != null) {
                    return null;
                }
                bitmapM4715Ujhhgtgfeyxiexzf.setDensity(this.f10119Ujhhgtgfeyxiexzf.densityDpi);
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
                        bitmapM4715Ujhhgtgfeyxiexzf = Bitmap.createBitmap(bitmapM4715Ujhhgtgfeyxiexzf, 0, 0, bitmapM4715Ujhhgtgfeyxiexzf.getWidth(), bitmapM4715Ujhhgtgfeyxiexzf.getHeight(), matrix, true);
                        bitmap = bitmapM4715Ujhhgtgfeyxiexzf;
                        break;
                    default:
                        bitmap = bitmapM4715Ujhhgtgfeyxiexzf;
                        break;
                }
                if (!bitmap.equals(bitmapM4715Ujhhgtgfeyxiexzf)) {
                    interfaceC2512feyxiexzfUjhhgtg2.mo1472Ujhhgtgfeyxiexzf(bitmap);
                }
                return bitmapM4715Ujhhgtgfeyxiexzf;
            default:
                List list4 = (List) c2366Ujhhgtgfeyxiexzf.f7715Ujhhgtgfeyxiexzf;
                j = jElapsedRealtimeNanos;
                Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = (Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf;
                C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf3 = (C0271Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
                int size2 = list4.size();
                str = str4;
                int i29 = 0;
                while (true) {
                    if (i29 < size2) {
                        int i30 = size2;
                        InterfaceC0751Ujhhgtgfeyxiexzf interfaceC0751Ujhhgtgfeyxiexzf = (InterfaceC0751Ujhhgtgfeyxiexzf) list4.get(i29);
                        int i31 = i29;
                        try {
                            List list5 = list4;
                            C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg3 = new C0790feyxiexzfUjhhgtg(new FileInputStream(ujhhgtgfeyxiexzf.m751Ujhhgtgfeyxiexzf().getFileDescriptor()), c0271Ujhhgtgfeyxiexzf3);
                            try {
                                iMo2089Ujhhgtgfeyxiexzf = interfaceC0751Ujhhgtgfeyxiexzf.mo2091Ujhhgtgfeyxiexzf(c0790feyxiexzfUjhhgtg3, c0271Ujhhgtgfeyxiexzf3);
                                c0790feyxiexzfUjhhgtg3.m2123Ujhhgtgfeyxiexzf();
                                ujhhgtgfeyxiexzf.m751Ujhhgtgfeyxiexzf();
                                if (iMo2089Ujhhgtgfeyxiexzf != -1) {
                                    iM2736Ujhhgtgfeyxiexzf = iMo2089Ujhhgtgfeyxiexzf;
                                } else {
                                    i29 = i31 + 1;
                                    size2 = i30;
                                    list4 = list5;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                c0790feyxiexzfUjhhgtg = c0790feyxiexzfUjhhgtg3;
                                if (c0790feyxiexzfUjhhgtg != null) {
                                    c0790feyxiexzfUjhhgtg.m2123Ujhhgtgfeyxiexzf();
                                }
                                ujhhgtgfeyxiexzf.m751Ujhhgtgfeyxiexzf();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        iM2736Ujhhgtgfeyxiexzf = -1;
                    }
                }
                switch (iM2736Ujhhgtgfeyxiexzf) {
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
                switch (iM2736Ujhhgtgfeyxiexzf) {
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
                imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf.m3604Ujhhgtgfeyxiexzf();
                i7 = iM2736Ujhhgtgfeyxiexzf;
                boolean z12 = z3;
                if (i16 > 0) {
                    str2 = ", density: ";
                    interfaceC2512feyxiexzfUjhhgtg = interfaceC2512feyxiexzfUjhhgtg3;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf + " with target [" + i8 + "x" + i6 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    interfaceC2512feyxiexzfUjhhgtg = interfaceC2512feyxiexzfUjhhgtg3;
                    str3 = ", target density: ";
                    i8 = i5;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeM3604Ujhhgtgfeyxiexzf + " with target [" + i8 + "x" + i6 + "]");
                    }
                }
                zM1834Ujhhgtgfeyxiexzf = this.f10122Ujhhgtgfeyxiexzf.m1834Ujhhgtgfeyxiexzf(i8, i6, z8, z12);
                if (zM1834Ujhhgtgfeyxiexzf) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (zM1834Ujhhgtgfeyxiexzf) {
                    z5 = true;
                } else if (enumC3088Ujhhgtgfeyxiexzf != EnumC3088Ujhhgtgfeyxiexzf.f9565Ujhhgtgfeyxiexzf) {
                    zHasAlpha = c2366Ujhhgtgfeyxiexzf.m3604Ujhhgtgfeyxiexzf().hasAlpha();
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
                    interfaceC2512feyxiexzfUjhhgtg2 = interfaceC2512feyxiexzfUjhhgtg;
                } else {
                    interfaceC2512feyxiexzfUjhhgtg2 = interfaceC2512feyxiexzfUjhhgtg;
                }
                if (enumC0855feyxiexzfUjhhgtg != null) {
                    if (i9 >= 28) {
                        if (enumC0855feyxiexzfUjhhgtg == EnumC0855feyxiexzfUjhhgtg.f3347Ujhhgtgfeyxiexzf) {
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
                bitmapM4715Ujhhgtgfeyxiexzf = m4715Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, options, interfaceC3217feyxiexzfUjhhgtg, interfaceC2512feyxiexzfUjhhgtg2);
                interfaceC3217feyxiexzfUjhhgtg.mo3705Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg2, bitmapM4715Ujhhgtgfeyxiexzf);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + m4716Ujhhgtgfeyxiexzf(bitmapM4715Ujhhgtgfeyxiexzf) + " from [" + i16 + "x" + i17 + "] " + str + " with inBitmap " + m4716Ujhhgtgfeyxiexzf(options.inBitmap) + " for [" + i + "x" + i2 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(j));
                }
                if (bitmapM4715Ujhhgtgfeyxiexzf != null) {
                    return null;
                }
                bitmapM4715Ujhhgtgfeyxiexzf.setDensity(this.f10119Ujhhgtgfeyxiexzf.densityDpi);
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
                        bitmapM4715Ujhhgtgfeyxiexzf = Bitmap.createBitmap(bitmapM4715Ujhhgtgfeyxiexzf, 0, 0, bitmapM4715Ujhhgtgfeyxiexzf.getWidth(), bitmapM4715Ujhhgtgfeyxiexzf.getHeight(), matrix, true);
                        bitmap = bitmapM4715Ujhhgtgfeyxiexzf;
                        break;
                    default:
                        bitmap = bitmapM4715Ujhhgtgfeyxiexzf;
                        break;
                }
                if (!bitmap.equals(bitmapM4715Ujhhgtgfeyxiexzf)) {
                    interfaceC2512feyxiexzfUjhhgtg2.mo1472Ujhhgtgfeyxiexzf(bitmap);
                }
                return bitmapM4715Ujhhgtgfeyxiexzf;
        }
    }
}
