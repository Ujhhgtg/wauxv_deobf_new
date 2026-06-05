package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛳ能不能ᛱUjhhgtgᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0919feyxiexzfUjhhgtg implements Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Throwable f3736Ujhhgtgfeyxiexzf;

    public C0919feyxiexzfUjhhgtg(Throwable th) {
        this.f3736Ujhhgtgfeyxiexzf = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0919feyxiexzfUjhhgtg) {
            return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f3736Ujhhgtgfeyxiexzf, ((C0919feyxiexzfUjhhgtg) obj).f3736Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3736Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f3736Ujhhgtgfeyxiexzf + ')';
    }
}
