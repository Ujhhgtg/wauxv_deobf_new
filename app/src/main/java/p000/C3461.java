package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3461 extends AbstractC1459 {

    public static Class f10936 = null;

    public static Constructor f10937 = null;

    public static Method f10938 = null;

    public static Method f10939 = null;

    public static boolean f10940 = false;

    public final Class f10941;

    public final Constructor f10942;

    public final Method f10943;

    public final Method f10944;

    public final Method f10945;

    public final Method f10946;

    public final Method f10947;

    public C3461() throws NoSuchMethodException {
        Method methodMo5055;
        Constructor<?> constructor;
        Method methodM5051;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM5051 = m5051(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo5055 = mo5055(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodMo5055 = null;
            constructor = null;
            methodM5051 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f10941 = cls;
        this.f10942 = constructor;
        this.f10943 = methodM5051;
        this.f10944 = method;
        this.f10945 = method2;
        this.f10946 = method3;
        this.f10947 = methodMo5055;
    }

    public static boolean m5049(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m5050();
        try {
            return ((Boolean) f10938.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void m5050() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f10940) {
            return;
        }
        f10940 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f10937 = constructor;
        f10936 = cls;
        f10938 = method2;
        f10939 = method;
    }

    public static Method m5051(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // p000.AbstractC1459
    public final Typeface mo3200(Context context, C1380 c1380, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f10943;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f10942.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                C1381[] c1381Arr = c1380.f4967;
                int length = c1381Arr.length;
                int i2 = 0;
                while (i2 < length) {
                    C1381 c1381 = c1381Arr[i2];
                    Context context2 = context;
                    if (m5052(context2, objNewInstance, c1381.f4968, c1381.f4972, c1381.f4969, c1381.f4970 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c1381.f4971))) {
                        i2++;
                        context = context2;
                    } else {
                        try {
                            this.f10946.invoke(objNewInstance, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
                if (m5054(objNewInstance)) {
                    return mo5053(objNewInstance);
                }
            }
            return null;
        }
        m5050();
        try {
            Object objNewInstance2 = f10937.newInstance(null);
            for (C1381 c1382 : c1380.f4967) {
                File fileM3217 = AbstractC1460.m3217(context);
                if (fileM3217 == null) {
                    return null;
                }
                try {
                    if (!AbstractC1460.m3213(fileM3217, resources, c1382.f4973) || !m5049(objNewInstance2, fileM3217.getPath(), c1382.f4969, c1382.f4970)) {
                        return null;
                    }
                    fileM3217.delete();
                } catch (RuntimeException unused3) {
                } finally {
                    fileM3217.delete();
                }
            }
            m5050();
            try {
                Object objNewInstance3 = Array.newInstance((Class<?>) f10936, 1);
                Array.set(objNewInstance3, 0, objNewInstance2);
                return (Typeface) f10939.invoke(null, objNewInstance3);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000.AbstractC1459
    public final Typeface mo3201(Context context, C1383[] c1383Arr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceMo5053;
        boolean zBooleanValue;
        if (c1383Arr.length >= 1) {
            Method method = this.f10943;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (C1383 c1383 : c1383Arr) {
                        if (c1383.f4983 == 0) {
                            Uri uri = c1383.f4978;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC1460.m3218(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f10942.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c1383Arr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.f10946;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!m5054(objNewInstance) || (typefaceMo5053 = mo5053(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceMo5053, i);
                            }
                            C1383 c1384 = c1383Arr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c1384.f4978);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f10944.invoke(objNewInstance, byteBuffer, Integer.valueOf(c1384.f4979), null, Integer.valueOf(c1384.f4980), Integer.valueOf(c1384.f4981 ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z2 = (i & 2) != 0;
                    C1383 c1385 = null;
                    int i4 = 2147483647;
                    for (C1383 c1386 : c1383Arr) {
                        int iAbs = (Math.abs(c1386.f4980 - i3) * 2) + (c1386.f4981 == z2 ? 0 : 1);
                        if (c1385 == null || i4 > iAbs) {
                            c1385 = c1386;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c1385.f4978, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c1385.f4980).setItalic(c1385.f4981).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (false) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // p000.AbstractC1459
    public final Typeface mo3203(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f10943;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo3203(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.f10942.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!m5052(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f10946.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (m5054(objNewInstance)) {
                return mo5053(objNewInstance);
            }
        }
        return null;
    }

    public final boolean m5052(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f10943.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface mo5053(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f10941, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f10947.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean m5054(Object obj) {
        try {
            return ((Boolean) this.f10945.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method mo5055(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
