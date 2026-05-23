package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1460 {

    public static final int[] f5196 = new int[0];

    public static final Object[] f5197 = new Object[0];

    public static final Object f5198 = new Object();

    public static String f5199 = "";

    public static boolean f5200 = true;

    public static Field f5201;

    public static boolean f5202;

    public final /* synthetic */ int f5203;

    public /* synthetic */ AbstractC1460(int i) {
        this.f5203 = i;
    }

    public static final int m3205(int i, int i2, int[] iArr) {
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

    public static final int m3206(long[] jArr, int i, long j) {
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

    public static final byte m3207(char c) {
        if (c < '~') {
            return C0594.f2403[c];
        }
        return (byte) 0;
    }

    public static void m3208(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void m3209(Object obj) {
        m3210(obj, "Argument must not be null");
    }

    public static void m3210(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void m3211(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final ColorStateList m3212(int i) {
        C2315[] c2315Arr = {new C2315(0, Integer.valueOf(i))};
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C2315 c2315 = c2315Arr[0];
        for (Map.Entry entry : Collections.singletonMap(c2315.f7445, c2315.f7446).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            if (iIntValue == 0) {
                arrayList.add(new int[0]);
            } else {
                arrayList.add(new int[]{iIntValue});
            }
            arrayList2.add(Integer.valueOf(iIntValue2));
        }
        return new ColorStateList((int[][]) arrayList.toArray(new int[0][]), AbstractC0744.m2205(arrayList2));
    }

    public static boolean m3213(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zM3214 = m3214(file, inputStreamOpenRawResource);
                if (true) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zM3214;
            } catch (Throwable th) {
                th = th;
                if (true) {
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

    public static boolean m3214(File file, InputStream inputStream) throws Throwable {
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
                    if (true) {
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
                    if (true) {
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

    public static final Object m3215(long j, AbstractC2862 abstractC2862) {
        if (j > 0) {
            C0558 c0558 = new C0558(AbstractC2209.m4135(abstractC2862));
            InterfaceC1080 interfaceC1080M1950 = c0558.m1950();
            if (interfaceC1080M1950 != null && !(C0558.f2285.get(c0558) instanceof InterfaceC2229)) {
                interfaceC1080M1950.mo2648();
                C0558.f2286.set(c0558, C2228.f7225);
            }
            if (j < 9223372036854775807L) {
                InterfaceC0875 interfaceC0875Mo942 = c0558.f2288.mo942(C1133.f4202);
                InterfaceC1006 interfaceC1006 = interfaceC0875Mo942 instanceof InterfaceC1006 ? (InterfaceC1006) interfaceC0875Mo942 : null;
                if (interfaceC1006 == null) {
                    interfaceC1006 = AbstractC0985.f3603;
                }
                interfaceC1006.mo2577(j, c0558);
            }
            Object objM1949 = c0558.m1949();
            if (objM1949 == EnumC0884.f3325) {
                return objM1949;
            }
        }
        return Unit.INSTANCE;
    }

    public static LayoutInflater m3216(Context context) {
        return LayoutInflater.from(context).cloneInContext(new C2008(context));
    }

    public static File m3217(Context context) {
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

    public static MappedByteBuffer m3218(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (false) {
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

    public static String m3219(int i) {
        char[] cArr = new char[5];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[4 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String m3220(int i) {
        char[] cArr = new char[9];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[8 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static final String m3221(byte b) {
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

    public static String m3222(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String m3223(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String m3224(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String m3225(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    public int hashCode() {
        switch (this.f5203) {
            case 12 /* 12 */:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f5203) {
            case 12 /* 12 */:
                return AbstractC2519.classToKClass(getClass()).m2128();
            default:
                return super.toString();
        }
    }

    public abstract InputFilter[] mo2765(InputFilter[] inputFilterArr);

    public float mo3226(View view) {
        if (f5200) {
            try {
                return AbstractC3596.m5206(view);
            } catch (NoSuchMethodError unused) {
                f5200 = false;
            }
        }
        return view.getAlpha();
    }

    public abstract int mo961(C1353 c1353);

    public abstract boolean mo2766();

    public abstract void mo2767(boolean z);

    public abstract void mo2768(boolean z);

    public void mo3227(View view, float f) {
        if (f5200) {
            try {
                AbstractC3596.m5207(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f5200 = false;
            }
        }
        view.setAlpha(f);
    }

    public void mo3228(View view, int i) {
        if (!f5202) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f5201 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f5202 = true;
        }
        Field field = f5201;
        if (field != null) {
            try {
                f5201.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract TransformationMethod mo2769(TransformationMethod transformationMethod);
}
