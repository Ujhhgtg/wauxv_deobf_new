package p000;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3031Ujhhgtgfeyxiexzf implements InterfaceC0902feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9398Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f9399Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3031Ujhhgtgfeyxiexzf(C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf, int i) {
        this.f9398Ujhhgtgfeyxiexzf = i;
        this.f9399Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo2362Ujhhgtgfeyxiexzf(Object obj, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) throws IOException {
        switch (this.f9398Ujhhgtgfeyxiexzf) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM2738Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2738Ujhhgtgfeyxiexzf((ArrayList) this.f9399Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf, (ByteBuffer) obj);
                return imageHeaderParser$ImageTypeM2738Ujhhgtgfeyxiexzf == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM2738Ujhhgtgfeyxiexzf == ImageHeaderParser$ImageType.ANIMATED_AVIF);
            default:
                C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = this.f9399Ujhhgtgfeyxiexzf;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM2737Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2737Ujhhgtgfeyxiexzf((ArrayList) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf, (InputStream) obj, (C0271Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf);
                return imageHeaderParser$ImageTypeM2737Ujhhgtgfeyxiexzf == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM2737Ujhhgtgfeyxiexzf == ImageHeaderParser$ImageType.ANIMATED_AVIF);
        }
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final InterfaceC0901feyxiexzfUjhhgtg mo2363Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        switch (this.f9398Ujhhgtgfeyxiexzf) {
            case 0:
                return C2629Ujhhgtgfeyxiexzf.m3931Ujhhgtgfeyxiexzf(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c1471feyxiexzfUjhhgtg);
            default:
                return C2629Ujhhgtgfeyxiexzf.m3931Ujhhgtgfeyxiexzf(ImageDecoder.createSource(AbstractC2648Ujhhgtgfeyxiexzf.m3979Ujhhgtgfeyxiexzf((InputStream) obj)), i, i2, c1471feyxiexzfUjhhgtg);
        }
    }
}
