package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3069Ujhhgtgfeyxiexzf implements InterfaceC0156Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC0156Ujhhgtgfeyxiexzf f9501Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC0156Ujhhgtgfeyxiexzf f9502Ujhhgtgfeyxiexzf;

    public C3069Ujhhgtgfeyxiexzf(InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf2) {
        this.f9501Ujhhgtgfeyxiexzf = interfaceC0156Ujhhgtgfeyxiexzf;
        this.f9502Ujhhgtgfeyxiexzf = interfaceC0156Ujhhgtgfeyxiexzf2;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final boolean equals(Object obj) {
        if (obj instanceof C3069Ujhhgtgfeyxiexzf) {
            C3069Ujhhgtgfeyxiexzf c3069Ujhhgtgfeyxiexzf = (C3069Ujhhgtgfeyxiexzf) obj;
            if (this.f9501Ujhhgtgfeyxiexzf.equals(c3069Ujhhgtgfeyxiexzf.f9501Ujhhgtgfeyxiexzf) && this.f9502Ujhhgtgfeyxiexzf.equals(c3069Ujhhgtgfeyxiexzf.f9502Ujhhgtgfeyxiexzf)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final int hashCode() {
        return this.f9502Ujhhgtgfeyxiexzf.hashCode() + (this.f9501Ujhhgtgfeyxiexzf.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f9501Ujhhgtgfeyxiexzf + ", signature=" + this.f9502Ujhhgtgfeyxiexzf + '}';
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1203Ujhhgtgfeyxiexzf(MessageDigest messageDigest) {
        this.f9501Ujhhgtgfeyxiexzf.mo1203Ujhhgtgfeyxiexzf(messageDigest);
        this.f9502Ujhhgtgfeyxiexzf.mo1203Ujhhgtgfeyxiexzf(messageDigest);
    }
}
