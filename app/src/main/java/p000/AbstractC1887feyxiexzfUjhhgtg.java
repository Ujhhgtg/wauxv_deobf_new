package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱfeyxiexzfᛱ要点脸ᛳ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1887feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2412Ujhhgtgfeyxiexzf f6318Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2412Ujhhgtgfeyxiexzf f6319Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2412Ujhhgtgfeyxiexzf f6320Ujhhgtgfeyxiexzf;

    public AbstractC1887feyxiexzfUjhhgtg(C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf, C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf2, C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf3) {
        this.f6318Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf;
        this.f6319Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf2;
        this.f6320Ujhhgtgfeyxiexzf = c2412Ujhhgtgfeyxiexzf3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public abstract C1886feyxiexzfUjhhgtg mo3208Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Class m3211Ujhhgtgfeyxiexzf(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f6320Ujhhgtgfeyxiexzf;
        Class cls2 = (Class) c2412Ujhhgtgfeyxiexzf.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c2412Ujhhgtgfeyxiexzf.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Method m3212Ujhhgtgfeyxiexzf(String str) throws NoSuchMethodException {
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f6318Ujhhgtgfeyxiexzf;
        Method method = (Method) c2412Ujhhgtgfeyxiexzf.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1887feyxiexzfUjhhgtg.class.getClassLoader()).getDeclaredMethod("read", AbstractC1887feyxiexzfUjhhgtg.class);
        c2412Ujhhgtgfeyxiexzf.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Method m3213Ujhhgtgfeyxiexzf(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C2412Ujhhgtgfeyxiexzf c2412Ujhhgtgfeyxiexzf = this.f6319Ujhhgtgfeyxiexzf;
        Method method = (Method) c2412Ujhhgtgfeyxiexzf.get(name);
        if (method != null) {
            return method;
        }
        Class clsM3211Ujhhgtgfeyxiexzf = m3211Ujhhgtgfeyxiexzf(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM3211Ujhhgtgfeyxiexzf.getDeclaredMethod("write", cls, AbstractC1887feyxiexzfUjhhgtg.class);
        c2412Ujhhgtgfeyxiexzf.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public abstract boolean mo3209Ujhhgtgfeyxiexzf(int i);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Parcelable m3214Ujhhgtgfeyxiexzf(Parcelable parcelable, int i) {
        if (!mo3209Ujhhgtgfeyxiexzf(i)) {
            return parcelable;
        }
        return ((C1886feyxiexzfUjhhgtg) this).f6311Ujhhgtgfeyxiexzf.readParcelable(C1886feyxiexzfUjhhgtg.class.getClassLoader());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final InterfaceC1869feyxiexzfUjhhgtg m3215Ujhhgtgfeyxiexzf() {
        String string = ((C1886feyxiexzfUjhhgtg) this).f6311Ujhhgtgfeyxiexzf.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC1869feyxiexzfUjhhgtg) m3212Ujhhgtgfeyxiexzf(string).invoke(null, mo3208Ujhhgtgfeyxiexzf());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public abstract void mo3210Ujhhgtgfeyxiexzf(int i);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m3216Ujhhgtgfeyxiexzf(InterfaceC1869feyxiexzfUjhhgtg interfaceC1869feyxiexzfUjhhgtg) {
        if (interfaceC1869feyxiexzfUjhhgtg == null) {
            ((C1886feyxiexzfUjhhgtg) this).f6311Ujhhgtgfeyxiexzf.writeString(null);
            return;
        }
        try {
            ((C1886feyxiexzfUjhhgtg) this).f6311Ujhhgtgfeyxiexzf.writeString(m3211Ujhhgtgfeyxiexzf(interfaceC1869feyxiexzfUjhhgtg.getClass()).getName());
            C1886feyxiexzfUjhhgtg c1886feyxiexzfUjhhgtgMo3208Ujhhgtgfeyxiexzf = mo3208Ujhhgtgfeyxiexzf();
            try {
                m3213Ujhhgtgfeyxiexzf(interfaceC1869feyxiexzfUjhhgtg.getClass()).invoke(null, interfaceC1869feyxiexzfUjhhgtg, c1886feyxiexzfUjhhgtgMo3208Ujhhgtgfeyxiexzf);
                Parcel parcel = c1886feyxiexzfUjhhgtgMo3208Ujhhgtgfeyxiexzf.f6311Ujhhgtgfeyxiexzf;
                int i = c1886feyxiexzfUjhhgtgMo3208Ujhhgtgfeyxiexzf.f6315Ujhhgtgfeyxiexzf;
                if (i >= 0) {
                    int i2 = c1886feyxiexzfUjhhgtgMo3208Ujhhgtgfeyxiexzf.f6310Ujhhgtgfeyxiexzf.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC1869feyxiexzfUjhhgtg.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
