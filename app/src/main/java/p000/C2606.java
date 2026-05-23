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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᲇᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2606 extends AbstractC0426 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final byte[] f8476 = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC1749.f5849);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f8477;

    public C2606(int i) {
        AbstractC1460.m3208("roundingRadius must be greater than 0.", i > 0);
        this.f8477 = i;
    }

    @Override // p000.InterfaceC1749
    public final boolean equals(Object obj) {
        return (obj instanceof C2606) && this.f8477 == ((C2606) obj).f8477;
    }

    @Override // p000.InterfaceC1749
    public final int hashCode() {
        return AbstractC3522.m5110(-569625254, AbstractC3522.m5110(this.f8477, 17));
    }

    @Override // p000.InterfaceC1749
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2001(MessageDigest messageDigest) {
        messageDigest.update(f8476);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f8477).array());
    }

    @Override // p000.AbstractC0426
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Bitmap mo1631(InterfaceC0424 interfaceC0424, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapMo1513;
        Paint paint = AbstractC3429.f10801;
        int i3 = this.f8477;
        AbstractC1460.m3208("roundingRadius must be greater than 0.", i3 > 0);
        Lock lock = AbstractC3429.f10802;
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16.equals(bitmap.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        if (!Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            bitmapMo1513 = bitmap;
        } else {
            bitmapMo1513 = interfaceC0424.mo1513(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(bitmapMo1513).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapMo1514 = interfaceC0424.mo1513(bitmapMo1513.getWidth(), bitmapMo1513.getHeight(), config2);
        bitmapMo1514.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapMo1513, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo1514.getWidth(), bitmapMo1514.getHeight());
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo1514);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapMo1513.equals(bitmap)) {
                interfaceC0424.mo1504(bitmapMo1513);
            }
            return bitmapMo1514;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
