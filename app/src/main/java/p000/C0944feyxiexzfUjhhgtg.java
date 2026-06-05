package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛴ能不能ᛳᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0944feyxiexzfUjhhgtg extends AbstractC2519feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final byte[] f3790Ujhhgtgfeyxiexzf = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC0156Ujhhgtgfeyxiexzf.f1329Ujhhgtgfeyxiexzf);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f3791Ujhhgtgfeyxiexzf;

    public C0944feyxiexzfUjhhgtg(int i) {
        AbstractC3593Ujhhgtgfeyxiexzf.m5149Ujhhgtgfeyxiexzf("roundingRadius must be greater than 0.", i > 0);
        this.f3791Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final boolean equals(Object obj) {
        return (obj instanceof C0944feyxiexzfUjhhgtg) && this.f3791Ujhhgtgfeyxiexzf == ((C0944feyxiexzfUjhhgtg) obj).f3791Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final int hashCode() {
        return AbstractC1860Ujhhgtgfeyxiexzf.m3198Ujhhgtgfeyxiexzf(-569625254, AbstractC1860Ujhhgtgfeyxiexzf.m3198Ujhhgtgfeyxiexzf(this.f3791Ujhhgtgfeyxiexzf, 17));
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1203Ujhhgtgfeyxiexzf(MessageDigest messageDigest) {
        messageDigest.update(f3790Ujhhgtgfeyxiexzf);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f3791Ujhhgtgfeyxiexzf).array());
    }

    @Override // p000.AbstractC2519feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Bitmap mo2435Ujhhgtgfeyxiexzf(InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapMo1474Ujhhgtgfeyxiexzf;
        Paint paint = AbstractC1767feyxiexzfUjhhgtg.f5940Ujhhgtgfeyxiexzf;
        int i3 = this.f3791Ujhhgtgfeyxiexzf;
        AbstractC3593Ujhhgtgfeyxiexzf.m5149Ujhhgtgfeyxiexzf("roundingRadius must be greater than 0.", i3 > 0);
        Lock lock = AbstractC1767feyxiexzfUjhhgtg.f5941Ujhhgtgfeyxiexzf;
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            bitmapMo1474Ujhhgtgfeyxiexzf = bitmap;
        } else {
            bitmapMo1474Ujhhgtgfeyxiexzf = interfaceC2512feyxiexzfUjhhgtg.mo1474Ujhhgtgfeyxiexzf(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(bitmapMo1474Ujhhgtgfeyxiexzf).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapMo1474Ujhhgtgfeyxiexzf2 = interfaceC2512feyxiexzfUjhhgtg.mo1474Ujhhgtgfeyxiexzf(bitmapMo1474Ujhhgtgfeyxiexzf.getWidth(), bitmapMo1474Ujhhgtgfeyxiexzf.getHeight(), config2);
        bitmapMo1474Ujhhgtgfeyxiexzf2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapMo1474Ujhhgtgfeyxiexzf, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo1474Ujhhgtgfeyxiexzf2.getWidth(), bitmapMo1474Ujhhgtgfeyxiexzf2.getHeight());
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo1474Ujhhgtgfeyxiexzf2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapMo1474Ujhhgtgfeyxiexzf.equals(bitmap)) {
                interfaceC2512feyxiexzfUjhhgtg.mo1472Ujhhgtgfeyxiexzf(bitmapMo1474Ujhhgtgfeyxiexzf);
            }
            return bitmapMo1474Ujhhgtgfeyxiexzf2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
