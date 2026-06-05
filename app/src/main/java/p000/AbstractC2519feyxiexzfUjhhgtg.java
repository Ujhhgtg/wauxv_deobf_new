package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Ujhhgtgfeyxiexzf;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴᛲ要点脸ᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2519feyxiexzfUjhhgtg implements InterfaceC1765feyxiexzfUjhhgtg {
    @Override // p000.InterfaceC1765feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC0901feyxiexzfUjhhgtg mo3060Ujhhgtgfeyxiexzf(Context context, InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg, int i, int i2) {
        if (!AbstractC1860Ujhhgtgfeyxiexzf.m3200Ujhhgtgfeyxiexzf(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg = Ujhhgtgfeyxiexzf.m756Ujhhgtgfeyxiexzf(context).f603Ujhhgtgfeyxiexzf;
        Bitmap bitmap = (Bitmap) interfaceC0901feyxiexzfUjhhgtg.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo2435Ujhhgtgfeyxiexzf = mo2435Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg, bitmap, i, i2);
        return bitmap.equals(bitmapMo2435Ujhhgtgfeyxiexzf) ? interfaceC0901feyxiexzfUjhhgtg : C2511feyxiexzfUjhhgtg.m3790Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg, bitmapMo2435Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public abstract Bitmap mo2435Ujhhgtgfeyxiexzf(InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg, Bitmap bitmap, int i, int i2);
}
