package com.bumptech.glide.load;

import p000.AbstractC1619;

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


    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f584;

    ImageHeaderParser$ImageType(boolean z) {
        this.f584 = z;
    }

    public boolean hasAlpha() {
        return this.f584;
    }

    public boolean isWebp() {
        int i = AbstractC1619.f5512[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
