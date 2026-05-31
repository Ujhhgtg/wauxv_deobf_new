package p000;

import bsh.AbstractC0016;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᤞᲈᲇᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0796 extends AbstractC1243 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public Constructor f3162;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final boolean f3163;

    public C0796(Constructor constructor) {
        super(constructor);
        this.f3162 = constructor;
        Class cls = this.f5673;
        Object[] objArr = AbstractC0016.f568;
        this.f3163 = Modifier.isStatic(cls.getModifiers());
    }

    @Override // p000.AbstractC1243, p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0427 mo2460(Object obj, Object[] objArr) {
        if (this.f5673.isMemberClass() && !this.f3163) {
            objArr = Stream.concat(Stream.of(obj), Stream.of(objArr)).toArray();
        }
        return super.mo2460(obj, objArr);
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Class mo2461() {
        return this.f5673;
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final boolean mo2462() {
        return this.f5673.isMemberClass();
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final boolean mo2463() {
        return this.f3163;
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final MethodHandle mo2464(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleUnreflectConstructor = MethodHandles.lookup().unreflectConstructor(this.f3162);
                if (this.f4504 && methodHandleUnreflectConstructor != null) {
                    methodHandleUnreflectConstructor = methodHandleUnreflectConstructor.asVarargsCollector(this.f4501);
                }
                this.f3162 = null;
                return methodHandleUnreflectConstructor;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            this.f3162 = null;
            throw th;
        }
    }
}
