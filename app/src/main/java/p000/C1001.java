package p000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1001 implements ImageDecoder$OnHeaderDecodedListener {

    public final C1519 f3655 = C1519.m3252();

    public final int f3656;

    public final int f3657;

    public final EnumC0969 f3658;

    public final C1096 f3659;

    public final boolean f3660;

    public final EnumC2392 f3661;

    public C1001(int i, int i2, C2303 c2303) {
        this.f3656 = i;
        this.f3657 = i2;
        this.f3658 = (EnumC0969) c2303.m4165(C1098.f4115);
        this.f3659 = (C1096) c2303.m4165(C1096.f4112);
        C2301 c2301 = C1098.f4118;
        this.f3660 = c2303.m4165(c2301) != null && ((Boolean) c2303.m4165(c2301)).booleanValue();
        this.f3661 = (EnumC2392) c2303.m4165(C1098.f4116);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f3655.m3254(this.f3656, this.f3657, this.f3660, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f3658 == EnumC0969.f3518) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C1000());
        Size size = imageInfo.getSize();
        int width = this.f3656;
        if (width == -2147483648) {
            width = size.getWidth();
        }
        int height = this.f3657;
        if (height == -2147483648) {
            height = size.getHeight();
        }
        float fM2664 = this.f3659.m2664(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fM2664);
        int iRound2 = Math.round(size.getHeight() * fM2664);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fM2664);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC2392 enumC2392 = this.f3661;
        if (enumC2392 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((enumC2392 == EnumC2392.f7653 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
