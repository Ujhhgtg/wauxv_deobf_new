package com.bumptech.glide.load;

import p000.AbstractC0750Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean f598Ujhhgtgfeyxiexzf;

    ImageHeaderParser$ImageType(boolean z) {
        this.f598Ujhhgtgfeyxiexzf = z;
    }

    public boolean hasAlpha() {
        return this.f598Ujhhgtgfeyxiexzf;
    }

    public boolean isWebp() {
        int i = AbstractC0750Ujhhgtgfeyxiexzf.f3020Ujhhgtgfeyxiexzf[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
