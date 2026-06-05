package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3218feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C3218feyxiexzfUjhhgtg f10104Ujhhgtgfeyxiexzf = new C3218feyxiexzfUjhhgtg(2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C3218feyxiexzfUjhhgtg f10105Ujhhgtgfeyxiexzf = new C3218feyxiexzfUjhhgtg(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C3218feyxiexzfUjhhgtg f10106Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C3218feyxiexzfUjhhgtg f10107Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C3218feyxiexzfUjhhgtg f10108Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C1469feyxiexzfUjhhgtg f10109Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final boolean f10110Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10111Ujhhgtgfeyxiexzf;

    static {
        C3218feyxiexzfUjhhgtg c3218feyxiexzfUjhhgtg = new C3218feyxiexzfUjhhgtg(1);
        f10106Ujhhgtgfeyxiexzf = c3218feyxiexzfUjhhgtg;
        f10107Ujhhgtgfeyxiexzf = new C3218feyxiexzfUjhhgtg(3);
        f10108Ujhhgtgfeyxiexzf = c3218feyxiexzfUjhhgtg;
        f10109Ujhhgtgfeyxiexzf = C1469feyxiexzfUjhhgtg.m2972Ujhhgtgfeyxiexzf(c3218feyxiexzfUjhhgtg, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f10110Ujhhgtgfeyxiexzf = true;
    }

    public /* synthetic */ C3218feyxiexzfUjhhgtg(int i) {
        this.f10111Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m4713Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        switch (this.f10111Ujhhgtgfeyxiexzf) {
            case 0:
                if (m4714Ujhhgtgfeyxiexzf(i, i2, i3, i4) == 1.0f) {
                    return 2;
                }
                return f10104Ujhhgtgfeyxiexzf.m4713Ujhhgtgfeyxiexzf(i, i2, i3, i4);
            case 1:
                return 2;
            case 2:
                return f10110Ujhhgtgfeyxiexzf ? 2 : 1;
            default:
                return 2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final float m4714Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        switch (this.f10111Ujhhgtgfeyxiexzf) {
            case 0:
                return Math.min(1.0f, f10104Ujhhgtgfeyxiexzf.m4714Ujhhgtgfeyxiexzf(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (f10110Ujhhgtgfeyxiexzf) {
                    return Math.min(i3 / i, i4 / i2);
                }
                int iMax = Math.max(i2 / i4, i / i3);
                if (iMax == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(iMax);
            default:
                return 1.0f;
        }
    }
}
