package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ要点脸ᛴᛲᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0393Ujhhgtgfeyxiexzf extends AbstractC0672Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Method f2132Ujhhgtgfeyxiexzf;

    public C0393Ujhhgtgfeyxiexzf(Method method) {
        this.f2132Ujhhgtgfeyxiexzf = method;
    }

    @Override // p000.AbstractC0375Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Member mo1621Ujhhgtgfeyxiexzf() {
        return this.f2132Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0672Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final AbstractC0672Ujhhgtgfeyxiexzf mo1647Ujhhgtgfeyxiexzf(Object obj) {
        m1940Ujhhgtgfeyxiexzf(obj);
        return this;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0393Ujhhgtgfeyxiexzf m1648Ujhhgtgfeyxiexzf() {
        return new C0393Ujhhgtgfeyxiexzf(this.f2132Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Object m1649Ujhhgtgfeyxiexzf(Object... objArr) {
        m1622Ujhhgtgfeyxiexzf();
        return this.f2132Ujhhgtgfeyxiexzf.invoke(this.f2790Ujhhgtgfeyxiexzf, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Object m1650Ujhhgtgfeyxiexzf(Object... objArr) throws IllegalAccessException, InvocationTargetException {
        m1622Ujhhgtgfeyxiexzf();
        Object objInvoke = this.f2132Ujhhgtgfeyxiexzf.invoke(this.f2790Ujhhgtgfeyxiexzf, Arrays.copyOf(objArr, objArr.length));
        if (objInvoke == null) {
            return null;
        }
        return objInvoke;
    }
}
