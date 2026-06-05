package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3751Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Class f11826Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ArrayList f11827Ujhhgtgfeyxiexzf;

    public C3751Ujhhgtgfeyxiexzf(Class cls, ArrayList arrayList) {
        this.f11826Ujhhgtgfeyxiexzf = cls;
        this.f11827Ujhhgtgfeyxiexzf = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3751Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C3751Ujhhgtgfeyxiexzf c3751Ujhhgtgfeyxiexzf = (C3751Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f11826Ujhhgtgfeyxiexzf, c3751Ujhhgtgfeyxiexzf.f11826Ujhhgtgfeyxiexzf) && this.f11827Ujhhgtgfeyxiexzf.equals(c3751Ujhhgtgfeyxiexzf.f11827Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f11827Ujhhgtgfeyxiexzf.hashCode() + (this.f11826Ujhhgtgfeyxiexzf.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CreateInstanceConstructorCacheKey(targetClass=" + this.f11826Ujhhgtgfeyxiexzf + ", parameterTypes=" + this.f11827Ujhhgtgfeyxiexzf + ", isPublic=true)";
    }
}
