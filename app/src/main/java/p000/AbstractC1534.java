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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1534 {

    public static final Unsafe f5371;

    public static final long f5372;

    public static final long f5373;

    public static final long f5374;

    public static final long f5375;

    static {
        long jObjectFieldOffset;
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
            f5371 = unsafe;
            C0867 c0867 = new C0867(System.getProperty("java.boot.class.path", "").split(":", 2)[0], null);
            Class clsLoadClass = c0867.loadClass(Executable.class.getName());
            Class clsLoadClass2 = c0867.loadClass(MethodHandle.class.getName());
            Class clsLoadClass3 = c0867.loadClass(Class.class.getName());
            unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("artMethod"));
            unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("declaringClass"));
            f5372 = unsafe.objectFieldOffset(clsLoadClass2.getDeclaredField("artFieldOrMethod"));
            try {
                jObjectFieldOffset = unsafe.objectFieldOffset(clsLoadClass3.getDeclaredField("fields"));
            } catch (NoSuchFieldException unused) {
                Unsafe unsafe2 = f5371;
                jObjectFieldOffset = unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("iFields"));
                unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("sFields"));
            }
            Unsafe unsafe3 = f5371;
            long jObjectFieldOffset2 = unsafe3.objectFieldOffset(clsLoadClass3.getDeclaredField("methods"));
            f5373 = jObjectFieldOffset2;
            Method declaredMethod = C1530.class.getDeclaredMethod("a", null);
            Method declaredMethod2 = C1530.class.getDeclaredMethod("b", null);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j = f5372;
            long j2 = unsafe3.getLong(methodHandleUnreflect, j);
            long j3 = unsafe3.getLong(methodHandleUnreflect2, j);
            long j4 = unsafe3.getLong(C1530.class, jObjectFieldOffset2);
            long j5 = j3 - j2;
            f5374 = j5;
            f5375 = (j2 - j4) - j5;
            Field declaredField = C1530.class.getDeclaredField("i");
            Field declaredField2 = C1530.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            unsafe3.getLong(methodHandleUnreflectGetter, j);
            unsafe3.getLong(methodHandleUnreflectGetter2, j);
            unsafe3.getLong(C1530.class, jObjectFieldOffset);
        } catch (ReflectiveOperationException e) {
            Log.e("HiddenApiBypass", "Initialize error", e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static List m3259(Class cls) {
        if (cls.isPrimitive() || cls.isArray()) {
            return Collections.EMPTY_LIST;
        }
        try {
            Method declaredMethod = C1530.class.getDeclaredMethod("a", null);
            declaredMethod.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            Unsafe unsafe = f5371;
            long j = unsafe.getLong(cls, f5373);
            if (j == 0) {
                return Collections.EMPTY_LIST;
            }
            int i = unsafe.getInt(j);
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                f5371.putLong(methodHandleUnreflect, f5372, f5375 + (((long) i2) * f5374) + j);
                arrayList.add((Executable) MethodHandles.reflectAs(Executable.class, methodHandleUnreflect));
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            return Collections.EMPTY_LIST;
        }
    }
}
