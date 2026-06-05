package p000;

import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0930feyxiexzfUjhhgtg implements Map.Entry {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f3760Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f3761Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C0930feyxiexzfUjhhgtg f3762Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C0930feyxiexzfUjhhgtg f3763Ujhhgtgfeyxiexzf;

    public C0930feyxiexzfUjhhgtg(Object obj, Object obj2) {
        this.f3760Ujhhgtgfeyxiexzf = obj;
        this.f3761Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0930feyxiexzfUjhhgtg)) {
            return false;
        }
        C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg = (C0930feyxiexzfUjhhgtg) obj;
        return this.f3760Ujhhgtgfeyxiexzf.equals(c0930feyxiexzfUjhhgtg.f3760Ujhhgtgfeyxiexzf) && this.f3761Ujhhgtgfeyxiexzf.equals(c0930feyxiexzfUjhhgtg.f3761Ujhhgtgfeyxiexzf);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3760Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3761Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f3760Ujhhgtgfeyxiexzf.hashCode() ^ this.f3761Ujhhgtgfeyxiexzf.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f3760Ujhhgtgfeyxiexzf + "=" + this.f3761Ujhhgtgfeyxiexzf;
    }
}
