package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2695Ujhhgtgfeyxiexzf extends AbstractC2519feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final byte[] f8595Ujhhgtgfeyxiexzf = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC0156Ujhhgtgfeyxiexzf.f1329Ujhhgtgfeyxiexzf);

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final boolean equals(Object obj) {
        return obj instanceof C2695Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final int hashCode() {
        return -599754482;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1203Ujhhgtgfeyxiexzf(MessageDigest messageDigest) {
        messageDigest.update(f8595Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC2519feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final Bitmap mo2435Ujhhgtgfeyxiexzf(InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC1767feyxiexzfUjhhgtg.f5940Ujhhgtgfeyxiexzf;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo1474Ujhhgtgfeyxiexzf = interfaceC2512feyxiexzfUjhhgtg.mo1474Ujhhgtgfeyxiexzf(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo1474Ujhhgtgfeyxiexzf.setHasAlpha(bitmap.hasAlpha());
        AbstractC1767feyxiexzfUjhhgtg.m3061Ujhhgtgfeyxiexzf(bitmap, bitmapMo1474Ujhhgtgfeyxiexzf, matrix);
        return bitmapMo1474Ujhhgtgfeyxiexzf;
    }
}
