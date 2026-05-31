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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᲈᛸᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2667 extends AbstractC0401 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final byte[] f8641 = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC1772.f5911);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f8642;

    public C2667(int i) {
        AbstractC2727.m4691("roundingRadius must be greater than 0.", i > 0);
        this.f8642 = i;
    }

    @Override // p000.InterfaceC1772
    public final boolean equals(Object obj) {
        return (obj instanceof C2667) && this.f8642 == ((C2667) obj).f8642;
    }

    @Override // p000.InterfaceC1772
    public final int hashCode() {
        return AbstractC3580.m5122(-569625254, AbstractC3580.m5122(this.f8642, 17));
    }

    @Override // p000.InterfaceC1772
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2098(MessageDigest messageDigest) {
        messageDigest.update(f8641);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f8642).array());
    }

    @Override // p000.AbstractC0401
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final Bitmap mo1737(InterfaceC0399 interfaceC0399, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapMo1618;
        Paint paint = AbstractC3486.f10961;
        int i3 = this.f8642;
        AbstractC2727.m4691("roundingRadius must be greater than 0.", i3 > 0);
        Lock lock = AbstractC3486.f10962;
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            bitmapMo1618 = bitmap;
        } else {
            bitmapMo1618 = interfaceC0399.mo1618(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(bitmapMo1618).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapMo1619 = interfaceC0399.mo1618(bitmapMo1618.getWidth(), bitmapMo1618.getHeight(), config2);
        bitmapMo1619.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapMo1618, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo1619.getWidth(), bitmapMo1619.getHeight());
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo1619);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapMo1618.equals(bitmap)) {
                interfaceC0399.mo1609(bitmapMo1618);
            }
            return bitmapMo1619;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
