package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1845Ujhhgtgfeyxiexzf implements Comparable, Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C1845Ujhhgtgfeyxiexzf f6185Ujhhgtgfeyxiexzf = new C1845Ujhhgtgfeyxiexzf(0, 0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final long f6186Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final long f6187Ujhhgtgfeyxiexzf;

    public C1845Ujhhgtgfeyxiexzf(long j, long j2) {
        this.f6186Ujhhgtgfeyxiexzf = j;
        this.f6187Ujhhgtgfeyxiexzf = j2;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        C1844Ujhhgtgfeyxiexzf c1844Ujhhgtgfeyxiexzf = new C1844Ujhhgtgfeyxiexzf();
        c1844Ujhhgtgfeyxiexzf.f6183Ujhhgtgfeyxiexzf = this.f6186Ujhhgtgfeyxiexzf;
        c1844Ujhhgtgfeyxiexzf.f6184Ujhhgtgfeyxiexzf = this.f6187Ujhhgtgfeyxiexzf;
        return c1844Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1845Ujhhgtgfeyxiexzf c1845Ujhhgtgfeyxiexzf = (C1845Ujhhgtgfeyxiexzf) obj;
        long j = c1845Ujhhgtgfeyxiexzf.f6186Ujhhgtgfeyxiexzf;
        long j2 = this.f6186Ujhhgtgfeyxiexzf;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.f6187Ujhhgtgfeyxiexzf, c1845Ujhhgtgfeyxiexzf.f6187Ujhhgtgfeyxiexzf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1845Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1845Ujhhgtgfeyxiexzf c1845Ujhhgtgfeyxiexzf = (C1845Ujhhgtgfeyxiexzf) obj;
        return this.f6186Ujhhgtgfeyxiexzf == c1845Ujhhgtgfeyxiexzf.f6186Ujhhgtgfeyxiexzf && this.f6187Ujhhgtgfeyxiexzf == c1845Ujhhgtgfeyxiexzf.f6187Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6186Ujhhgtgfeyxiexzf ^ this.f6187Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC1264feyxiexzfUjhhgtg.m2796Ujhhgtgfeyxiexzf(this.f6186Ujhhgtgfeyxiexzf, 0, 0, bArr, 4);
        bArr[8] = 45;
        AbstractC1264feyxiexzfUjhhgtg.m2796Ujhhgtgfeyxiexzf(this.f6186Ujhhgtgfeyxiexzf, 9, 4, bArr, 6);
        bArr[13] = 45;
        AbstractC1264feyxiexzfUjhhgtg.m2796Ujhhgtgfeyxiexzf(this.f6186Ujhhgtgfeyxiexzf, 14, 6, bArr, 8);
        bArr[18] = 45;
        AbstractC1264feyxiexzfUjhhgtg.m2796Ujhhgtgfeyxiexzf(this.f6187Ujhhgtgfeyxiexzf, 19, 0, bArr, 2);
        bArr[23] = 45;
        AbstractC1264feyxiexzfUjhhgtg.m2796Ujhhgtgfeyxiexzf(this.f6187Ujhhgtgfeyxiexzf, 24, 2, bArr, 8);
        return new String(bArr, AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
    }
}
