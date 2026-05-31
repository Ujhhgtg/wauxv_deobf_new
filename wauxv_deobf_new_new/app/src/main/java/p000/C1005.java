package p000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲁᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1005 implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1531 f3671 = C1531.m3433();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f3672;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f3673;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final EnumC0973 f3674;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1102 f3675;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean f3676;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final EnumC2445 f3677;

    public C1005(int i, int i2, C2336 c2336) {
        this.f3672 = i;
        this.f3673 = i2;
        this.f3674 = (EnumC0973) c2336.m4294(C1104.f4126);
        this.f3675 = (C1102) c2336.m4294(C1102.f4123);
        C2334 c2334 = C1104.f4129;
        this.f3676 = c2336.m4294(c2334) != null && ((Boolean) c2336.m4294(c2334)).booleanValue();
        this.f3677 = (EnumC2445) c2336.m4294(C1104.f4127);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f3671.m3435(this.f3672, this.f3673, this.f3676, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f3674 == EnumC0973.f3534) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C1004());
        Size size = imageInfo.getSize();
        int width = this.f3672;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f3673;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fM2813 = this.f3675.m2813(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fM2813);
        int iRound2 = Math.round(size.getHeight() * fM2813);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fM2813);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC2445 enumC2445 = this.f3677;
        if (enumC2445 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((enumC2445 == EnumC2445.f7797 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
