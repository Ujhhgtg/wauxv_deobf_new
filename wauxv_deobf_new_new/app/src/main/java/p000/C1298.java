package p000;

import bsh.Primitive;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᲈᲀᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1298 extends AbstractC1687 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Field f4718;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Class f4719;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public MethodHandle f4720;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f4721;

    public C1298(Field field) {
        super(field);
        this.f4721 = false;
        this.f4719 = field.getType();
        this.f4718 = field;
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo3008() {
        return 1;
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Class[] mo3009() {
        return new Class[]{this.f4719};
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final Class mo2461() {
        return this.f4719;
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final synchronized Object mo3115(Object obj, Object... objArr) {
        try {
            if (objArr.length == 0) {
                if (this.f5668) {
                    return Primitive.wrap((Object) m3565().invoke(), (Class<?>) this.f4719);
                }
                return Primitive.wrap((Object) m3565().invoke(obj), (Class<?>) this.f4719);
            }
            if (this.f5668) {
                return (Object) m3116().invoke(AbstractC1687.m3564(new Class[]{this.f4719}[0], objArr[0]));
            }
            return (Object) m3116().invoke(obj, AbstractC1687.m3564(new Class[]{this.f4719}[0], objArr[0]));
        } catch (Throwable th) {
            throw new InvocationTargetException(th.getCause());
        }
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final MethodHandle mo2464(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(this.f4718);
                this.f4721 = true;
                if (this.f4720 != null) {
                    this.f4718 = null;
                }
                return methodHandleUnreflectGetter;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            this.f4721 = true;
            if (this.f4720 != null) {
                this.f4718 = null;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final MethodHandle m3116() {
        if (this.f4720 == null) {
            try {
                try {
                    MethodHandle methodHandleUnreflectSetter = MethodHandles.lookup().unreflectSetter(this.f4718);
                    if (this.f4721) {
                        this.f4718 = null;
                    }
                    this.f4720 = methodHandleUnreflectSetter;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                if (this.f4721) {
                    this.f4718 = null;
                }
                throw th;
            }
        }
        return this.f4720;
    }
}
