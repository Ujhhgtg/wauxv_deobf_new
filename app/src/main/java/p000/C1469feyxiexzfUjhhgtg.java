package p000;

import android.text.TextUtils;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸能不能ᛲᛴᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1469feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C0420Ujhhgtgfeyxiexzf f5103Ujhhgtgfeyxiexzf = new C0420Ujhhgtgfeyxiexzf(5);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object f5104Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC1468feyxiexzfUjhhgtg f5105Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5106Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public volatile byte[] f5107Ujhhgtgfeyxiexzf;

    public C1469feyxiexzfUjhhgtg(String str, Object obj, InterfaceC1468feyxiexzfUjhhgtg interfaceC1468feyxiexzfUjhhgtg) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f5106Ujhhgtgfeyxiexzf = str;
        this.f5104Ujhhgtgfeyxiexzf = obj;
        this.f5105Ujhhgtgfeyxiexzf = interfaceC1468feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C1469feyxiexzfUjhhgtg m2972Ujhhgtgfeyxiexzf(Object obj, String str) {
        return new C1469feyxiexzfUjhhgtg(str, obj, f5103Ujhhgtgfeyxiexzf);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1469feyxiexzfUjhhgtg) {
            return this.f5106Ujhhgtgfeyxiexzf.equals(((C1469feyxiexzfUjhhgtg) obj).f5106Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5106Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("Option{key='"), this.f5106Ujhhgtgfeyxiexzf, "'}");
    }
}
