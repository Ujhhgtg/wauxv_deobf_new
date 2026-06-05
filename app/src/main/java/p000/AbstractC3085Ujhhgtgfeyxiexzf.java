package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3085Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C2589feyxiexzfUjhhgtg f9538Ujhhgtgfeyxiexzf = new C2589feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C3290Ujhhgtgfeyxiexzf f9539Ujhhgtgfeyxiexzf = new C3290Ujhhgtgfeyxiexzf("COMPLETING_ALREADY", 1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C3290Ujhhgtgfeyxiexzf f9540Ujhhgtgfeyxiexzf = new C3290Ujhhgtgfeyxiexzf("COMPLETING_WAITING_CHILDREN", 1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C3290Ujhhgtgfeyxiexzf f9541Ujhhgtgfeyxiexzf = new C3290Ujhhgtgfeyxiexzf("COMPLETING_RETRY", 1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C3290Ujhhgtgfeyxiexzf f9542Ujhhgtgfeyxiexzf = new C3290Ujhhgtgfeyxiexzf("TOO_LATE_TO_CANCEL", 1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C3290Ujhhgtgfeyxiexzf f9543Ujhhgtgfeyxiexzf = new C3290Ujhhgtgfeyxiexzf("SEALED", 1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C3301feyxiexzfUjhhgtg f9544Ujhhgtgfeyxiexzf = new C3301feyxiexzfUjhhgtg(false);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final C3301feyxiexzfUjhhgtg f9545Ujhhgtgfeyxiexzf = new C3301feyxiexzfUjhhgtg(true);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static C2629Ujhhgtgfeyxiexzf f9546Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final byte m4551Ujhhgtgfeyxiexzf(char c) {
        if (c < '~') {
            return C2686Ujhhgtgfeyxiexzf.f8577Ujhhgtgfeyxiexzf[c];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final void m4552Ujhhgtgfeyxiexzf(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m4553Ujhhgtgfeyxiexzf(int[] iArr, int i) {
        int i2 = i >> 5;
        iArr[i2] = (~(1 << (i & 31))) & iArr[i2];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static boolean m4554Ujhhgtgfeyxiexzf(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zM4555Ujhhgtgfeyxiexzf = m4555Ujhhgtgfeyxiexzf(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zM4555Ujhhgtgfeyxiexzf;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static boolean m4555Ujhhgtgfeyxiexzf(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final void m4556Ujhhgtgfeyxiexzf(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg) {
        InterfaceC0717Ujhhgtgfeyxiexzf interfaceC0717Ujhhgtgfeyxiexzf = (InterfaceC0717Ujhhgtgfeyxiexzf) interfaceC3739feyxiexzfUjhhgtg.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10561Ujhhgtgfeyxiexzf);
        if (interfaceC0717Ujhhgtgfeyxiexzf != null && !interfaceC0717Ujhhgtgfeyxiexzf.mo1758Ujhhgtgfeyxiexzf()) {
            throw interfaceC0717Ujhhgtgfeyxiexzf.mo1761Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static int m4557Ujhhgtgfeyxiexzf(int[] iArr, int i) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static boolean m4558Ujhhgtgfeyxiexzf(int[] iArr, int i) {
        return (iArr[i >> 5] & (1 << (i & 31))) != 0;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static ColorStateList m4559Ujhhgtgfeyxiexzf(Context context, int i) {
        ColorStateList colorStateListM4263Ujhhgtgfeyxiexzf;
        ColorStateList colorStateList;
        C0890feyxiexzfUjhhgtg c0890feyxiexzfUjhhgtg;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C0893feyxiexzfUjhhgtg c0893feyxiexzfUjhhgtg = new C0893feyxiexzfUjhhgtg(resources, theme);
        synchronized (AbstractC0888feyxiexzfUjhhgtg.f3432Ujhhgtgfeyxiexzf) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC0888feyxiexzfUjhhgtg.f3431Ujhhgtgfeyxiexzf.get(c0893feyxiexzfUjhhgtg);
                colorStateListM4263Ujhhgtgfeyxiexzf = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (c0890feyxiexzfUjhhgtg = (C0890feyxiexzfUjhhgtg) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (c0890feyxiexzfUjhhgtg.f3434Ujhhgtgfeyxiexzf.equals(resources.getConfiguration())) {
                        if (theme != null || c0890feyxiexzfUjhhgtg.f3435Ujhhgtgfeyxiexzf != 0) {
                            if (theme == null || c0890feyxiexzfUjhhgtg.f3435Ujhhgtgfeyxiexzf != theme.hashCode()) {
                            }
                        }
                        colorStateList = c0890feyxiexzfUjhhgtg.f3433Ujhhgtgfeyxiexzf;
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
        ThreadLocal threadLocal = AbstractC0888feyxiexzfUjhhgtg.f3430Ujhhgtgfeyxiexzf;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM4263Ujhhgtgfeyxiexzf = AbstractC2858Ujhhgtgfeyxiexzf.m4263Ujhhgtgfeyxiexzf(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListM4263Ujhhgtgfeyxiexzf == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (AbstractC0888feyxiexzfUjhhgtg.f3432Ujhhgtgfeyxiexzf) {
            try {
                WeakHashMap weakHashMap = AbstractC0888feyxiexzfUjhhgtg.f3431Ujhhgtgfeyxiexzf;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(c0893feyxiexzfUjhhgtg);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(c0893feyxiexzfUjhhgtg, sparseArray2);
                }
                sparseArray2.append(i, new C0890feyxiexzfUjhhgtg(colorStateListM4263Ujhhgtgfeyxiexzf, c0893feyxiexzfUjhhgtg.f3439Ujhhgtgfeyxiexzf.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListM4263Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static ColorStateList m4560Ujhhgtgfeyxiexzf(Context context, C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf, int i) {
        int resourceId;
        ColorStateList colorStateListM4559Ujhhgtgfeyxiexzf;
        TypedArray typedArray = (TypedArray) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM4559Ujhhgtgfeyxiexzf = m4559Ujhhgtgfeyxiexzf(context, resourceId)) == null) ? c2366Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(i) : colorStateListM4559Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static ColorStateList m4561Ujhhgtgfeyxiexzf(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM4559Ujhhgtgfeyxiexzf;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM4559Ujhhgtgfeyxiexzf = m4559Ujhhgtgfeyxiexzf(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM4559Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Drawable m4562Ujhhgtgfeyxiexzf(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM2824Ujhhgtgfeyxiexzf;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM2824Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM2824Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final String m4563Ujhhgtgfeyxiexzf(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static File m4564Ujhhgtgfeyxiexzf(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int m4565Ujhhgtgfeyxiexzf(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final InterfaceC3227feyxiexzfUjhhgtg m4566Ujhhgtgfeyxiexzf(InterfaceC0717Ujhhgtgfeyxiexzf interfaceC0717Ujhhgtgfeyxiexzf, boolean z, AbstractC0722Ujhhgtgfeyxiexzf abstractC0722Ujhhgtgfeyxiexzf) {
        return interfaceC0717Ujhhgtgfeyxiexzf instanceof C0731Ujhhgtgfeyxiexzf ? ((C0731Ujhhgtgfeyxiexzf) interfaceC0717Ujhhgtgfeyxiexzf).m2063feyxiexzfUjhhgtg(z, abstractC0722Ujhhgtgfeyxiexzf) : interfaceC0717Ujhhgtgfeyxiexzf.mo1760Ujhhgtgfeyxiexzf(abstractC0722Ujhhgtgfeyxiexzf.mo1974Ujhhgtgfeyxiexzf(), z, new C0726Ujhhgtgfeyxiexzf(1, abstractC0722Ujhhgtgfeyxiexzf, AbstractC0722Ujhhgtgfeyxiexzf.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m4567Ujhhgtgfeyxiexzf(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static int[] m4568Ujhhgtgfeyxiexzf(int i) {
        return new int[(i + 31) >> 5];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static MappedByteBuffer m4569Ujhhgtgfeyxiexzf(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static void m4570Ujhhgtgfeyxiexzf(int[] iArr, int i) {
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String m4571Ujhhgtgfeyxiexzf(InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf) {
        Object c0919feyxiexzfUjhhgtg;
        if (interfaceC3704Ujhhgtgfeyxiexzf instanceof C3194feyxiexzfUjhhgtg) {
            return ((C3194feyxiexzfUjhhgtg) interfaceC3704Ujhhgtgfeyxiexzf).toString();
        }
        try {
            c0919feyxiexzfUjhhgtg = interfaceC3704Ujhhgtgfeyxiexzf + '@' + m4563Ujhhgtgfeyxiexzf(interfaceC3704Ujhhgtgfeyxiexzf);
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        if (C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg) != null) {
            c0919feyxiexzfUjhhgtg = interfaceC3704Ujhhgtgfeyxiexzf.getClass().getName() + '@' + m4563Ujhhgtgfeyxiexzf(interfaceC3704Ujhhgtgfeyxiexzf);
        }
        return (String) c0919feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final String m4572feyxiexzfUjhhgtg(byte b) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Object m4573feyxiexzfUjhhgtg(Object obj) {
        InterfaceC0665Ujhhgtgfeyxiexzf interfaceC0665Ujhhgtgfeyxiexzf;
        C0666Ujhhgtgfeyxiexzf c0666Ujhhgtgfeyxiexzf = obj instanceof C0666Ujhhgtgfeyxiexzf ? (C0666Ujhhgtgfeyxiexzf) obj : null;
        return (c0666Ujhhgtgfeyxiexzf == null || (interfaceC0665Ujhhgtgfeyxiexzf = c0666Ujhhgtgfeyxiexzf.f2778Ujhhgtgfeyxiexzf) == null) ? obj : interfaceC0665Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public abstract int[] mo1385Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ */
    public abstract int mo1386Ujhhgtgfeyxiexzf(boolean z);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ */
    public abstract AbstractC2855feyxiexzfUjhhgtg mo1387Ujhhgtgfeyxiexzf();
}
