package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2244feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f7291Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f7292Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final float f7293Ujhhgtgfeyxiexzf = 32.0f;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final float f7294Ujhhgtgfeyxiexzf = -40.0f;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final float f7295Ujhhgtgfeyxiexzf = 120.0f;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final float f7296Ujhhgtgfeyxiexzf = 120.0f;

    public C2244feyxiexzfUjhhgtg(String str, int i) {
        this.f7291Ujhhgtgfeyxiexzf = str;
        this.f7292Ujhhgtgfeyxiexzf = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2244feyxiexzfUjhhgtg)) {
            return false;
        }
        C2244feyxiexzfUjhhgtg c2244feyxiexzfUjhhgtg = (C2244feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7291Ujhhgtgfeyxiexzf, c2244feyxiexzfUjhhgtg.f7291Ujhhgtgfeyxiexzf) && this.f7292Ujhhgtgfeyxiexzf == c2244feyxiexzfUjhhgtg.f7292Ujhhgtgfeyxiexzf && Float.compare(this.f7293Ujhhgtgfeyxiexzf, c2244feyxiexzfUjhhgtg.f7293Ujhhgtgfeyxiexzf) == 0 && Float.compare(this.f7294Ujhhgtgfeyxiexzf, c2244feyxiexzfUjhhgtg.f7294Ujhhgtgfeyxiexzf) == 0 && Float.compare(this.f7295Ujhhgtgfeyxiexzf, c2244feyxiexzfUjhhgtg.f7295Ujhhgtgfeyxiexzf) == 0 && Float.compare(this.f7296Ujhhgtgfeyxiexzf, c2244feyxiexzfUjhhgtg.f7296Ujhhgtgfeyxiexzf) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7296Ujhhgtgfeyxiexzf) + ((Float.hashCode(this.f7295Ujhhgtgfeyxiexzf) + ((Float.hashCode(this.f7294Ujhhgtgfeyxiexzf) + ((Float.hashCode(this.f7293Ujhhgtgfeyxiexzf) + ((Integer.hashCode(this.f7292Ujhhgtgfeyxiexzf) + (this.f7291Ujhhgtgfeyxiexzf.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("WatermarkConfig(text=");
        sb.append(this.f7291Ujhhgtgfeyxiexzf);
        sb.append(", textColor=");
        sb.append(this.f7292Ujhhgtgfeyxiexzf);
        sb.append(", textSize=");
        sb.append(this.f7293Ujhhgtgfeyxiexzf);
        sb.append(", rotationAngle=");
        sb.append(this.f7294Ujhhgtgfeyxiexzf);
        sb.append(", horizontalSpacing=");
        sb.append(this.f7295Ujhhgtgfeyxiexzf);
        sb.append(", verticalSpacing=");
        sb.append(this.f7296Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
