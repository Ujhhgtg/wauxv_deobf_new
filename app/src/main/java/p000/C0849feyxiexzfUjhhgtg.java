package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛴᛳ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0849feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f3342Ujhhgtgfeyxiexzf;

    public C0849feyxiexzfUjhhgtg(String str) {
        this.f3342Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0849feyxiexzfUjhhgtg.class != obj.getClass()) {
            return false;
        }
        return this.f3342Ujhhgtgfeyxiexzf.equals(((C0849feyxiexzfUjhhgtg) obj).f3342Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f3342Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("Prop{name='"), this.f3342Ujhhgtgfeyxiexzf, "'}");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object m2258Ujhhgtgfeyxiexzf(C3107Ujhhgtgfeyxiexzf c3107Ujhhgtgfeyxiexzf) {
        Object obj = c3107Ujhhgtgfeyxiexzf.f9652Ujhhgtgfeyxiexzf.get(this);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(this.f3342Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2259Ujhhgtgfeyxiexzf(C3107Ujhhgtgfeyxiexzf c3107Ujhhgtgfeyxiexzf, Object obj) {
        HashMap map = c3107Ujhhgtgfeyxiexzf.f9652Ujhhgtgfeyxiexzf;
        if (obj == null) {
            map.remove(this);
        } else {
            map.put(this, obj);
        }
    }
}
