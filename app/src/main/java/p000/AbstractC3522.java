package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3522 {

    public static final char[] f11032 = "0123456789abcdef".toCharArray();

    public static final char[] f11033 = new char[64];

    public static volatile Handler f11034;

    public static void m5104() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean m5105(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int m5106(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int m5107(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = AbstractC3520.f11030[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    public static ArrayList m5108(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler m5109() {
        if (f11034 == null) {
            synchronized (AbstractC3522.class) {
                try {
                    if (f11034 == null) {
                        f11034 = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11034;
    }

    public static int m5110(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int m5111(int i, Object obj) {
        return m5110(obj == null ? 0 : obj.hashCode(), i);
    }

    public static boolean m5112(int i, int i2) {
        if (i > 0 || i == -2147483648) {
            return i2 > 0 || i2 == -2147483648;
        }
        return false;
    }
}
