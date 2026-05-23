package p000;

import bsh.Primitive;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1297 extends AbstractC1672 {

    public Field f4719;

    public final Class f4720;

    public MethodHandle f4721;

    public boolean f4722;

    public C1297(Field field) {
        super(field);
        this.f4722 = false;
        this.f4720 = field.getType();
        this.f4719 = field;
    }

    @Override // p000.AbstractC1672
    public final int mo2889() {
        return 1;
    }

    @Override // p000.AbstractC1672
    public final Class[] mo2890() {
        return new Class[]{this.f4720};
    }

    @Override // p000.AbstractC1672
    public final Class mo2346() {
        return this.f4720;
    }

    @Override // p000.AbstractC1672
    public final synchronized Object mo3012(Object obj, Object... objArr) {
        try {
            if (objArr.length == 0) {
                if (this.f5641) {
                    return Primitive.wrap((Object) m3398().invoke(), (Class<?>) this.f4720);
                }
                return Primitive.wrap((Object) m3398().invoke(obj), (Class<?>) this.f4720);
            }
            if (this.f5641) {
                return (Object) m3013().invoke(AbstractC1672.m3397(new Class[]{this.f4720}[0], objArr[0]));
            }
            return (Object) m3013().invoke(obj, AbstractC1672.m3397(new Class[]{this.f4720}[0], objArr[0]));
        } catch (Throwable th) {
            throw new InvocationTargetException(th.getCause());
        }
    }

    @Override // p000.AbstractC1672
    public final MethodHandle mo2349(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(this.f4719);
                this.f4722 = true;
                if (this.f4721 != null) {
                    this.f4719 = null;
                }
                return methodHandleUnreflectGetter;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            this.f4722 = true;
            if (this.f4721 != null) {
                this.f4719 = null;
            }
            throw th;
        }
    }

    public final MethodHandle m3013() {
        if (this.f4721 == null) {
            try {
                try {
                    MethodHandle methodHandleUnreflectSetter = MethodHandles.lookup().unreflectSetter(this.f4719);
                    if (this.f4722) {
                        this.f4719 = null;
                    }
                    this.f4721 = methodHandleUnreflectSetter;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                if (this.f4722) {
                    this.f4719 = null;
                }
                throw th;
            }
        }
        return this.f4721;
    }
}
