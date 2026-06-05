package p000;

import java.util.Objects;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛳ能不能ᛲᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3225feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f10126Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f10127Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f10128Ujhhgtgfeyxiexzf;

    public C3225feyxiexzfUjhhgtg(String str, int i, int i2) {
        this.f10126Ujhhgtgfeyxiexzf = str;
        this.f10127Ujhhgtgfeyxiexzf = i;
        this.f10128Ujhhgtgfeyxiexzf = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3225feyxiexzfUjhhgtg)) {
            return false;
        }
        C3225feyxiexzfUjhhgtg c3225feyxiexzfUjhhgtg = (C3225feyxiexzfUjhhgtg) obj;
        return Objects.equals(this.f10126Ujhhgtgfeyxiexzf, c3225feyxiexzfUjhhgtg.f10126Ujhhgtgfeyxiexzf) && this.f10127Ujhhgtgfeyxiexzf == c3225feyxiexzfUjhhgtg.f10127Ujhhgtgfeyxiexzf && this.f10128Ujhhgtgfeyxiexzf == c3225feyxiexzfUjhhgtg.f10128Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f10127Ujhhgtgfeyxiexzf);
        Integer numValueOf2 = Integer.valueOf(this.f10128Ujhhgtgfeyxiexzf);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f10126Ujhhgtgfeyxiexzf, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.f10126Ujhhgtgfeyxiexzf;
        sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb.append(" displayWidth=");
        sb.append(this.f10127Ujhhgtgfeyxiexzf);
        sb.append(" displayHeight=");
        return AbstractC1225feyxiexzfUjhhgtg.m2705Ujhhgtgfeyxiexzf(sb, this.f10128Ujhhgtgfeyxiexzf, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
    }
}
