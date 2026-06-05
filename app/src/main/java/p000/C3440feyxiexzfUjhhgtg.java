package p000;

import bsh.Primitive;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3440feyxiexzfUjhhgtg extends AbstractC0695Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Field f10718Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final Class f10719Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public MethodHandle f10720Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f10721Ujhhgtgfeyxiexzf;

    public C3440feyxiexzfUjhhgtg(Field field) {
        super(field);
        this.f10721Ujhhgtgfeyxiexzf = false;
        this.f10719Ujhhgtgfeyxiexzf = field.getType();
        this.f10718Ujhhgtgfeyxiexzf = field;
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo1966Ujhhgtgfeyxiexzf() {
        return 1;
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Class[] mo1967Ujhhgtgfeyxiexzf() {
        return new Class[]{this.f10719Ujhhgtgfeyxiexzf};
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final Class mo1641Ujhhgtgfeyxiexzf() {
        return this.f10719Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final synchronized Object mo1969Ujhhgtgfeyxiexzf(Object obj, Object... objArr) {
        try {
            if (objArr.length == 0) {
                if (this.f2843Ujhhgtgfeyxiexzf) {
                    return Primitive.wrap((Object) m1964Ujhhgtgfeyxiexzf().invoke(), (Class<?>) this.f10719Ujhhgtgfeyxiexzf);
                }
                return Primitive.wrap((Object) m1964Ujhhgtgfeyxiexzf().invoke(obj), (Class<?>) this.f10719Ujhhgtgfeyxiexzf);
            }
            if (this.f2843Ujhhgtgfeyxiexzf) {
                return (Object) m4941Ujhhgtgfeyxiexzf().invoke(AbstractC0695Ujhhgtgfeyxiexzf.m1963Ujhhgtgfeyxiexzf(new Class[]{this.f10719Ujhhgtgfeyxiexzf}[0], objArr[0]));
            }
            return (Object) m4941Ujhhgtgfeyxiexzf().invoke(obj, AbstractC0695Ujhhgtgfeyxiexzf.m1963Ujhhgtgfeyxiexzf(new Class[]{this.f10719Ujhhgtgfeyxiexzf}[0], objArr[0]));
        } catch (Throwable th) {
            throw new InvocationTargetException(th.getCause());
        }
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final MethodHandle mo1644Ujhhgtgfeyxiexzf(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(this.f10718Ujhhgtgfeyxiexzf);
                this.f10721Ujhhgtgfeyxiexzf = true;
                if (this.f10720Ujhhgtgfeyxiexzf != null) {
                    this.f10718Ujhhgtgfeyxiexzf = null;
                }
                return methodHandleUnreflectGetter;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            this.f10721Ujhhgtgfeyxiexzf = true;
            if (this.f10720Ujhhgtgfeyxiexzf != null) {
                this.f10718Ujhhgtgfeyxiexzf = null;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final MethodHandle m4941Ujhhgtgfeyxiexzf() {
        if (this.f10720Ujhhgtgfeyxiexzf == null) {
            try {
                try {
                    MethodHandle methodHandleUnreflectSetter = MethodHandles.lookup().unreflectSetter(this.f10718Ujhhgtgfeyxiexzf);
                    if (this.f10721Ujhhgtgfeyxiexzf) {
                        this.f10718Ujhhgtgfeyxiexzf = null;
                    }
                    this.f10720Ujhhgtgfeyxiexzf = methodHandleUnreflectSetter;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                if (this.f10721Ujhhgtgfeyxiexzf) {
                    this.f10718Ujhhgtgfeyxiexzf = null;
                }
                throw th;
            }
        }
        return this.f10720Ujhhgtgfeyxiexzf;
    }
}
