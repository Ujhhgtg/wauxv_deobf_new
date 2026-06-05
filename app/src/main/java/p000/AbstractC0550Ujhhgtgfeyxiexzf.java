package p000;

import android.util.Log;
import com.umeng.analytics.pro.bv;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛲᛱfeyxiexzfᛱᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0550Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final Unsafe f2542Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final long f2543Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final long f2544Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final long f2545Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final long f2546Ujhhgtgfeyxiexzf;

    static {
        long jObjectFieldOffset;
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
            f2542Ujhhgtgfeyxiexzf = unsafe;
            C3729feyxiexzfUjhhgtg c3729feyxiexzfUjhhgtg = new C3729feyxiexzfUjhhgtg(System.getProperty("java.boot.class.path", "").split(":", 2)[0], null);
            Class clsLoadClass = c3729feyxiexzfUjhhgtg.loadClass(Executable.class.getName());
            Class clsLoadClass2 = c3729feyxiexzfUjhhgtg.loadClass(MethodHandle.class.getName());
            Class clsLoadClass3 = c3729feyxiexzfUjhhgtg.loadClass(Class.class.getName());
            unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("artMethod"));
            unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("declaringClass"));
            f2543Ujhhgtgfeyxiexzf = unsafe.objectFieldOffset(clsLoadClass2.getDeclaredField("artFieldOrMethod"));
            try {
                jObjectFieldOffset = unsafe.objectFieldOffset(clsLoadClass3.getDeclaredField("fields"));
            } catch (NoSuchFieldException unused) {
                Unsafe unsafe2 = f2542Ujhhgtgfeyxiexzf;
                jObjectFieldOffset = unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("iFields"));
                unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("sFields"));
            }
            Unsafe unsafe3 = f2542Ujhhgtgfeyxiexzf;
            long jObjectFieldOffset2 = unsafe3.objectFieldOffset(clsLoadClass3.getDeclaredField("methods"));
            f2544Ujhhgtgfeyxiexzf = jObjectFieldOffset2;
            Method declaredMethod = C0551Ujhhgtgfeyxiexzf.class.getDeclaredMethod(bv.av, null);
            Method declaredMethod2 = C0551Ujhhgtgfeyxiexzf.class.getDeclaredMethod("b", null);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j = f2543Ujhhgtgfeyxiexzf;
            long j2 = unsafe3.getLong(methodHandleUnreflect, j);
            long j3 = unsafe3.getLong(methodHandleUnreflect2, j);
            long j4 = unsafe3.getLong(C0551Ujhhgtgfeyxiexzf.class, jObjectFieldOffset2);
            long j5 = j3 - j2;
            f2545Ujhhgtgfeyxiexzf = j5;
            f2546Ujhhgtgfeyxiexzf = (j2 - j4) - j5;
            Field declaredField = C0551Ujhhgtgfeyxiexzf.class.getDeclaredField(bv.aC);
            Field declaredField2 = C0551Ujhhgtgfeyxiexzf.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            unsafe3.getLong(methodHandleUnreflectGetter, j);
            unsafe3.getLong(methodHandleUnreflectGetter2, j);
            unsafe3.getLong(C0551Ujhhgtgfeyxiexzf.class, jObjectFieldOffset);
        } catch (ReflectiveOperationException e) {
            Log.e("HiddenApiBypass", "Initialize error", e);
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static List m1837Ujhhgtgfeyxiexzf(Class cls) {
        if (cls.isPrimitive() || cls.isArray()) {
            return Collections.EMPTY_LIST;
        }
        try {
            Method declaredMethod = C0551Ujhhgtgfeyxiexzf.class.getDeclaredMethod(bv.av, null);
            declaredMethod.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            Unsafe unsafe = f2542Ujhhgtgfeyxiexzf;
            long j = unsafe.getLong(cls, f2544Ujhhgtgfeyxiexzf);
            if (j == 0) {
                return Collections.EMPTY_LIST;
            }
            int i = unsafe.getInt(j);
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                f2542Ujhhgtgfeyxiexzf.putLong(methodHandleUnreflect, f2543Ujhhgtgfeyxiexzf, f2546Ujhhgtgfeyxiexzf + (((long) i2) * f2545Ujhhgtgfeyxiexzf) + j);
                arrayList.add((Executable) MethodHandles.reflectAs(Executable.class, methodHandleUnreflect));
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            return Collections.EMPTY_LIST;
        }
    }
}
