package p000;

import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ要点脸ᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0077Ujhhgtgfeyxiexzf implements InterfaceC1121feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC1121feyxiexzfUjhhgtg f1141Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC1121feyxiexzfUjhhgtg f1142Ujhhgtgfeyxiexzf;

    public C0077Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg2) {
        this.f1141Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg;
        this.f1142Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0077Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0077Ujhhgtgfeyxiexzf c0077Ujhhgtgfeyxiexzf = (C0077Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1141Ujhhgtgfeyxiexzf, c0077Ujhhgtgfeyxiexzf.f1141Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1142Ujhhgtgfeyxiexzf, c0077Ujhhgtgfeyxiexzf.f1142Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f1142Ujhhgtgfeyxiexzf.hashCode() + ((this.f1141Ujhhgtgfeyxiexzf.hashCode() + 710441009) * 31);
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f1141Ujhhgtgfeyxiexzf + ", " + this.f1142Ujhhgtgfeyxiexzf + ')';
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String mo1117Ujhhgtgfeyxiexzf() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int mo1118Ujhhgtgfeyxiexzf(String str) {
        Integer numM2673feyxiexzfUjhhgtg = AbstractC1184feyxiexzfUjhhgtg.m2673feyxiexzfUjhhgtg(str);
        if (numM2673feyxiexzfUjhhgtg != null) {
            return numM2673feyxiexzfUjhhgtg.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final AbstractC3611Ujhhgtgfeyxiexzf mo1119Ujhhgtgfeyxiexzf() {
        return C1189feyxiexzfUjhhgtg.f4476Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int mo1120Ujhhgtgfeyxiexzf() {
        return 2;
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final String mo1121Ujhhgtgfeyxiexzf(int i) {
        return String.valueOf(i);
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final List mo1122Ujhhgtgfeyxiexzf(int i) {
        if (i >= 0) {
            return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        }
        throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final InterfaceC1121feyxiexzfUjhhgtg mo1123Ujhhgtgfeyxiexzf(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f1141Ujhhgtgfeyxiexzf;
        }
        if (i2 == 1) {
            return this.f1142Ujhhgtgfeyxiexzf;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final boolean mo1124Ujhhgtgfeyxiexzf(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }
}
