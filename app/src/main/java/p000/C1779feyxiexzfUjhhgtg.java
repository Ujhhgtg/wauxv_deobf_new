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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛴᛱfeyxiexzfᛱ能不能要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1779feyxiexzfUjhhgtg extends AbstractC2855feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static Class f5961Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Constructor f5962Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static Method f5963Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static Method f5964Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static boolean f5965Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Class f5966Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final Constructor f5967Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Method f5968Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final Method f5969Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final Method f5970Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Method f5971Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Method f5972Ujhhgtgfeyxiexzf;

    public C1779feyxiexzfUjhhgtg() throws NoSuchMethodException {
        Method methodMo3100Ujhhgtgfeyxiexzf;
        Constructor<?> constructor;
        Method methodM3103feyxiexzfUjhhgtg;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM3103feyxiexzfUjhhgtg = m3103feyxiexzfUjhhgtg(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo3100Ujhhgtgfeyxiexzf = mo3100Ujhhgtgfeyxiexzf(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodMo3100Ujhhgtgfeyxiexzf = null;
            constructor = null;
            methodM3103feyxiexzfUjhhgtg = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f5966Ujhhgtgfeyxiexzf = cls;
        this.f5967Ujhhgtgfeyxiexzf = constructor;
        this.f5968Ujhhgtgfeyxiexzf = methodM3103feyxiexzfUjhhgtg;
        this.f5969Ujhhgtgfeyxiexzf = method;
        this.f5970Ujhhgtgfeyxiexzf = method2;
        this.f5971Ujhhgtgfeyxiexzf = method3;
        this.f5972Ujhhgtgfeyxiexzf = methodMo3100Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public static boolean m3101feyxiexzfUjhhgtg(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m3102feyxiexzfUjhhgtg();
        try {
            return ((Boolean) f5963Ujhhgtgfeyxiexzf.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public static void m3102feyxiexzfUjhhgtg() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f5965Ujhhgtgfeyxiexzf) {
            return;
        }
        f5965Ujhhgtgfeyxiexzf = true;
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
        f5962Ujhhgtgfeyxiexzf = constructor;
        f5961Ujhhgtgfeyxiexzf = cls;
        f5963Ujhhgtgfeyxiexzf = method2;
        f5964Ujhhgtgfeyxiexzf = method;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static Method m3103feyxiexzfUjhhgtg(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // p000.AbstractC2855feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final Typeface mo3104Ujhhgtgfeyxiexzf(Context context, C3632Ujhhgtgfeyxiexzf c3632Ujhhgtgfeyxiexzf, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f5968Ujhhgtgfeyxiexzf;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f5967Ujhhgtgfeyxiexzf.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                C3633feyxiexzfUjhhgtg[] c3633feyxiexzfUjhhgtgArr = c3632Ujhhgtgfeyxiexzf.f11349Ujhhgtgfeyxiexzf;
                int length = c3633feyxiexzfUjhhgtgArr.length;
                int i2 = 0;
                while (i2 < length) {
                    C3633feyxiexzfUjhhgtg c3633feyxiexzfUjhhgtg = c3633feyxiexzfUjhhgtgArr[i2];
                    Context context2 = context;
                    if (m3107feyxiexzfUjhhgtg(context2, objNewInstance, c3633feyxiexzfUjhhgtg.f11350Ujhhgtgfeyxiexzf, c3633feyxiexzfUjhhgtg.f11354Ujhhgtgfeyxiexzf, c3633feyxiexzfUjhhgtg.f11351Ujhhgtgfeyxiexzf, c3633feyxiexzfUjhhgtg.f11352Ujhhgtgfeyxiexzf ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c3633feyxiexzfUjhhgtg.f11353Ujhhgtgfeyxiexzf))) {
                        i2++;
                        context = context2;
                    } else {
                        try {
                            this.f5971Ujhhgtgfeyxiexzf.invoke(objNewInstance, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
                if (m3108feyxiexzfUjhhgtg(objNewInstance)) {
                    return mo3099feyxiexzfUjhhgtg(objNewInstance);
                }
            }
            return null;
        }
        m3102feyxiexzfUjhhgtg();
        try {
            Object objNewInstance2 = f5962Ujhhgtgfeyxiexzf.newInstance(null);
            for (C3633feyxiexzfUjhhgtg c3633feyxiexzfUjhhgtg2 : c3632Ujhhgtgfeyxiexzf.f11349Ujhhgtgfeyxiexzf) {
                File fileM4564Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4564Ujhhgtgfeyxiexzf(context);
                if (fileM4564Ujhhgtgfeyxiexzf == null) {
                    return null;
                }
                try {
                    if (!AbstractC3085Ujhhgtgfeyxiexzf.m4554Ujhhgtgfeyxiexzf(fileM4564Ujhhgtgfeyxiexzf, resources, c3633feyxiexzfUjhhgtg2.f11355Ujhhgtgfeyxiexzf) || !m3101feyxiexzfUjhhgtg(objNewInstance2, fileM4564Ujhhgtgfeyxiexzf.getPath(), c3633feyxiexzfUjhhgtg2.f11351Ujhhgtgfeyxiexzf, c3633feyxiexzfUjhhgtg2.f11352Ujhhgtgfeyxiexzf)) {
                        return null;
                    }
                    fileM4564Ujhhgtgfeyxiexzf.delete();
                } catch (RuntimeException unused3) {
                } finally {
                    fileM4564Ujhhgtgfeyxiexzf.delete();
                }
            }
            m3102feyxiexzfUjhhgtg();
            try {
                Object objNewInstance3 = Array.newInstance((Class<?>) f5961Ujhhgtgfeyxiexzf, 1);
                Array.set(objNewInstance3, 0, objNewInstance2);
                return (Typeface) f5964Ujhhgtgfeyxiexzf.invoke(null, objNewInstance3);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000.AbstractC2855feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final Typeface mo3105Ujhhgtgfeyxiexzf(Context context, C3635Ujhhgtgfeyxiexzf[] c3635UjhhgtgfeyxiexzfArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceMo3099feyxiexzfUjhhgtg;
        boolean zBooleanValue;
        if (c3635UjhhgtgfeyxiexzfArr.length >= 1) {
            Method method = this.f5968Ujhhgtgfeyxiexzf;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (C3635Ujhhgtgfeyxiexzf c3635Ujhhgtgfeyxiexzf : c3635UjhhgtgfeyxiexzfArr) {
                        if (c3635Ujhhgtgfeyxiexzf.f11365Ujhhgtgfeyxiexzf == 0) {
                            Uri uri = c3635Ujhhgtgfeyxiexzf.f11360Ujhhgtgfeyxiexzf;
                            if (!map.containsKey(uri)) {
                                map.put(uri, AbstractC3085Ujhhgtgfeyxiexzf.m4569Ujhhgtgfeyxiexzf(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f5967Ujhhgtgfeyxiexzf.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c3635UjhhgtgfeyxiexzfArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.f5971Ujhhgtgfeyxiexzf;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!m3108feyxiexzfUjhhgtg(objNewInstance) || (typefaceMo3099feyxiexzfUjhhgtg = mo3099feyxiexzfUjhhgtg(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceMo3099feyxiexzfUjhhgtg, i);
                            }
                            C3635Ujhhgtgfeyxiexzf c3635Ujhhgtgfeyxiexzf2 = c3635UjhhgtgfeyxiexzfArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c3635Ujhhgtgfeyxiexzf2.f11360Ujhhgtgfeyxiexzf);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f5969Ujhhgtgfeyxiexzf.invoke(objNewInstance, byteBuffer, Integer.valueOf(c3635Ujhhgtgfeyxiexzf2.f11361Ujhhgtgfeyxiexzf), null, Integer.valueOf(c3635Ujhhgtgfeyxiexzf2.f11362Ujhhgtgfeyxiexzf), Integer.valueOf(c3635Ujhhgtgfeyxiexzf2.f11363Ujhhgtgfeyxiexzf ? 1 : 0))).booleanValue();
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
                    C3635Ujhhgtgfeyxiexzf c3635Ujhhgtgfeyxiexzf3 = null;
                    int i4 = Integer.MAX_VALUE;
                    for (C3635Ujhhgtgfeyxiexzf c3635Ujhhgtgfeyxiexzf4 : c3635UjhhgtgfeyxiexzfArr) {
                        int iAbs = (Math.abs(c3635Ujhhgtgfeyxiexzf4.f11362Ujhhgtgfeyxiexzf - i3) * 2) + (c3635Ujhhgtgfeyxiexzf4.f11363Ujhhgtgfeyxiexzf == z2 ? 0 : 1);
                        if (c3635Ujhhgtgfeyxiexzf3 == null || i4 > iAbs) {
                            c3635Ujhhgtgfeyxiexzf3 = c3635Ujhhgtgfeyxiexzf4;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c3635Ujhhgtgfeyxiexzf3.f11360Ujhhgtgfeyxiexzf, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c3635Ujhhgtgfeyxiexzf3.f11362Ujhhgtgfeyxiexzf).setItalic(c3635Ujhhgtgfeyxiexzf3.f11363Ujhhgtgfeyxiexzf).build();
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
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // p000.AbstractC2855feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Typeface mo3106feyxiexzfUjhhgtg(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f5968Ujhhgtgfeyxiexzf;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo3106feyxiexzfUjhhgtg(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.f5967Ujhhgtgfeyxiexzf.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!m3107feyxiexzfUjhhgtg(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f5971Ujhhgtgfeyxiexzf.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (m3108feyxiexzfUjhhgtg(objNewInstance)) {
                return mo3099feyxiexzfUjhhgtg(objNewInstance);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final boolean m3107feyxiexzfUjhhgtg(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f5968Ujhhgtgfeyxiexzf.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ */
    public Typeface mo3099feyxiexzfUjhhgtg(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f5966Ujhhgtgfeyxiexzf, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f5972Ujhhgtgfeyxiexzf.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final boolean m3108feyxiexzfUjhhgtg(Object obj) {
        try {
            return ((Boolean) this.f5970Ujhhgtgfeyxiexzf.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛳᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ */
    public Method mo3100Ujhhgtgfeyxiexzf(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
