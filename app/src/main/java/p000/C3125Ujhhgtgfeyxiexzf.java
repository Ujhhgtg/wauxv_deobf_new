package p000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛴᛳ能不能ᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3125Ujhhgtgfeyxiexzf implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C0540Ujhhgtgfeyxiexzf f9711Ujhhgtgfeyxiexzf = C0540Ujhhgtgfeyxiexzf.m1832Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f9712Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f9713Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final EnumC3088Ujhhgtgfeyxiexzf f9714Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C3218feyxiexzfUjhhgtg f9715Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f9716Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final EnumC0855feyxiexzfUjhhgtg f9717Ujhhgtgfeyxiexzf;

    public C3125Ujhhgtgfeyxiexzf(int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        this.f9712Ujhhgtgfeyxiexzf = i;
        this.f9713Ujhhgtgfeyxiexzf = i2;
        this.f9714Ujhhgtgfeyxiexzf = (EnumC3088Ujhhgtgfeyxiexzf) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(C3220feyxiexzfUjhhgtg.f10112Ujhhgtgfeyxiexzf);
        this.f9715Ujhhgtgfeyxiexzf = (C3218feyxiexzfUjhhgtg) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(C3218feyxiexzfUjhhgtg.f10109Ujhhgtgfeyxiexzf);
        C1469feyxiexzfUjhhgtg c1469feyxiexzfUjhhgtg = C3220feyxiexzfUjhhgtg.f10115Ujhhgtgfeyxiexzf;
        this.f9716Ujhhgtgfeyxiexzf = c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(c1469feyxiexzfUjhhgtg) != null && ((Boolean) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(c1469feyxiexzfUjhhgtg)).booleanValue();
        this.f9717Ujhhgtgfeyxiexzf = (EnumC0855feyxiexzfUjhhgtg) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(C3220feyxiexzfUjhhgtg.f10113Ujhhgtgfeyxiexzf);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f9711Ujhhgtgfeyxiexzf.m1834Ujhhgtgfeyxiexzf(this.f9712Ujhhgtgfeyxiexzf, this.f9713Ujhhgtgfeyxiexzf, this.f9716Ujhhgtgfeyxiexzf, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f9714Ujhhgtgfeyxiexzf == EnumC3088Ujhhgtgfeyxiexzf.f9566Ujhhgtgfeyxiexzf) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C3117Ujhhgtgfeyxiexzf());
        Size size = imageInfo.getSize();
        int width = this.f9712Ujhhgtgfeyxiexzf;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f9713Ujhhgtgfeyxiexzf;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fM4714Ujhhgtgfeyxiexzf = this.f9715Ujhhgtgfeyxiexzf.m4714Ujhhgtgfeyxiexzf(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fM4714Ujhhgtgfeyxiexzf);
        int iRound2 = Math.round(size.getHeight() * fM4714Ujhhgtgfeyxiexzf);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fM4714Ujhhgtgfeyxiexzf);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC0855feyxiexzfUjhhgtg enumC0855feyxiexzfUjhhgtg = this.f9717Ujhhgtgfeyxiexzf;
        if (enumC0855feyxiexzfUjhhgtg != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((enumC0855feyxiexzfUjhhgtg == EnumC0855feyxiexzfUjhhgtg.f3347Ujhhgtgfeyxiexzf && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
