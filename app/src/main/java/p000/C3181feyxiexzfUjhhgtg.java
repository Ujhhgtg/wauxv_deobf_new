package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3181feyxiexzfUjhhgtg extends C2565Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static C3181feyxiexzfUjhhgtg f9829Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public C3182feyxiexzfUjhhgtg f9830Ujhhgtgfeyxiexzf;

    @Override // p000.C2565Ujhhgtgfeyxiexzf, java.net.URLClassLoader, java.lang.ClassLoader
    public final Class findClass(String str) {
        AbstractC2601feyxiexzfUjhhgtg abstractC2601feyxiexzfUjhhgtgM4677Ujhhgtgfeyxiexzf = this.f9830Ujhhgtgfeyxiexzf.m4677Ujhhgtgfeyxiexzf(str);
        if (abstractC2601feyxiexzfUjhhgtgM4677Ujhhgtgfeyxiexzf == null) {
            return super.findClass(str);
        }
        byte[] bArrMo3879Ujhhgtgfeyxiexzf = abstractC2601feyxiexzfUjhhgtgM4677Ujhhgtgfeyxiexzf.mo3879Ujhhgtgfeyxiexzf(str);
        C2809Ujhhgtgfeyxiexzf c2809Ujhhgtgfeyxiexzf = this.f8309Ujhhgtgfeyxiexzf;
        Class clsM3850Ujhhgtgfeyxiexzf = AbstractC2592feyxiexzfUjhhgtg.m3850Ujhhgtgfeyxiexzf(str, bArrMo3879Ujhhgtgfeyxiexzf, c2809Ujhhgtgfeyxiexzf.f8934Ujhhgtgfeyxiexzf);
        ((ConcurrentHashMap) c2809Ujhhgtgfeyxiexzf.f8934Ujhhgtgfeyxiexzf.f1736Ujhhgtgfeyxiexzf).put(str, clsM3850Ujhhgtgfeyxiexzf);
        return clsM3850Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        return super.toString() + "for files: " + this.f9830Ujhhgtgfeyxiexzf;
    }
}
