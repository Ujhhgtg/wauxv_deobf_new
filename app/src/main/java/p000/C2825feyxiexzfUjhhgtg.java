package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2825feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f8983Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Method f8984Ujhhgtgfeyxiexzf;

    public C2825feyxiexzfUjhhgtg(int i, Method method) {
        this.f8983Ujhhgtgfeyxiexzf = i;
        this.f8984Ujhhgtgfeyxiexzf = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2825feyxiexzfUjhhgtg)) {
            return false;
        }
        C2825feyxiexzfUjhhgtg c2825feyxiexzfUjhhgtg = (C2825feyxiexzfUjhhgtg) obj;
        return this.f8983Ujhhgtgfeyxiexzf == c2825feyxiexzfUjhhgtg.f8983Ujhhgtgfeyxiexzf && this.f8984Ujhhgtgfeyxiexzf.getName().equals(c2825feyxiexzfUjhhgtg.f8984Ujhhgtgfeyxiexzf.getName());
    }

    public final int hashCode() {
        return this.f8984Ujhhgtgfeyxiexzf.getName().hashCode() + (this.f8983Ujhhgtgfeyxiexzf * 31);
    }
}
