package p000;

import bsh.AbstractC0033Ujhhgtgfeyxiexzf;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.stream.Stream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3659Ujhhgtgfeyxiexzf extends AbstractC3365Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Constructor f11652Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final boolean f11653Ujhhgtgfeyxiexzf;

    public C3659Ujhhgtgfeyxiexzf(Constructor constructor) {
        super(constructor);
        this.f11652Ujhhgtgfeyxiexzf = constructor;
        Class cls = this.f2848Ujhhgtgfeyxiexzf;
        Object[] objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
        this.f11653Ujhhgtgfeyxiexzf = Modifier.isStatic(cls.getModifiers());
    }

    @Override // p000.AbstractC3365Ujhhgtgfeyxiexzf, p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final C2667feyxiexzfUjhhgtg mo1640Ujhhgtgfeyxiexzf(Object obj, Object[] objArr) {
        if (this.f2848Ujhhgtgfeyxiexzf.isMemberClass() && !this.f11653Ujhhgtgfeyxiexzf) {
            objArr = Stream.concat(Stream.of(obj), Stream.of(objArr)).toArray();
        }
        return super.mo1640Ujhhgtgfeyxiexzf(obj, objArr);
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final Class mo1641Ujhhgtgfeyxiexzf() {
        return this.f2848Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public final boolean mo1971Ujhhgtgfeyxiexzf() {
        return this.f2848Ujhhgtgfeyxiexzf.isMemberClass();
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ */
    public final boolean mo1972Ujhhgtgfeyxiexzf() {
        return this.f11653Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final MethodHandle mo1644Ujhhgtgfeyxiexzf(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleUnreflectConstructor = MethodHandles.lookup().unreflectConstructor(this.f11652Ujhhgtgfeyxiexzf);
                if (this.f10524Ujhhgtgfeyxiexzf && methodHandleUnreflectConstructor != null) {
                    methodHandleUnreflectConstructor = methodHandleUnreflectConstructor.asVarargsCollector(this.f10521Ujhhgtgfeyxiexzf);
                }
                this.f11652Ujhhgtgfeyxiexzf = null;
                return methodHandleUnreflectConstructor;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            this.f11652Ujhhgtgfeyxiexzf = null;
            throw th;
        }
    }
}
