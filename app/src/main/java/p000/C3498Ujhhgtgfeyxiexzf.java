package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3498Ujhhgtgfeyxiexzf implements InterfaceC0751Ujhhgtgfeyxiexzf {
    @Override // p000.InterfaceC0751Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final ImageHeaderParser$ImageType mo2087Ujhhgtgfeyxiexzf(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.InterfaceC0751Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final boolean mo2088Ujhhgtgfeyxiexzf(ByteBuffer byteBuffer, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        return false;
    }

    @Override // p000.InterfaceC0751Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo2089Ujhhgtgfeyxiexzf(ByteBuffer byteBuffer, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        AtomicReference atomicReference = AbstractC2648Ujhhgtgfeyxiexzf.f8502Ujhhgtgfeyxiexzf;
        return mo2091Ujhhgtgfeyxiexzf(new C2647Ujhhgtgfeyxiexzf(byteBuffer), c0271Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0751Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final ImageHeaderParser$ImageType mo2090Ujhhgtgfeyxiexzf(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p000.InterfaceC0751Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo2091Ujhhgtgfeyxiexzf(InputStream inputStream, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) throws Throwable {
        int iM4985Ujhhgtgfeyxiexzf;
        C3497Ujhhgtgfeyxiexzf c3497Ujhhgtgfeyxiexzf = new C3497Ujhhgtgfeyxiexzf(inputStream);
        C3493Ujhhgtgfeyxiexzf c3493UjhhgtgfeyxiexzfM4992Ujhhgtgfeyxiexzf = c3497Ujhhgtgfeyxiexzf.m4992Ujhhgtgfeyxiexzf("Orientation");
        if (c3493UjhhgtgfeyxiexzfM4992Ujhhgtgfeyxiexzf == null) {
            iM4985Ujhhgtgfeyxiexzf = 1;
        } else {
            try {
                iM4985Ujhhgtgfeyxiexzf = c3493UjhhgtgfeyxiexzfM4992Ujhhgtgfeyxiexzf.m4985Ujhhgtgfeyxiexzf(c3497Ujhhgtgfeyxiexzf.f10891Ujhhgtgfeyxiexzf);
            } catch (NumberFormatException unused) {
                iM4985Ujhhgtgfeyxiexzf = 1;
            }
        }
        if (iM4985Ujhhgtgfeyxiexzf == 0) {
            return -1;
        }
        return iM4985Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0751Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final boolean mo2092Ujhhgtgfeyxiexzf(InputStream inputStream, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        return false;
    }
}
