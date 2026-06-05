package p000;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1725Ujhhgtgfeyxiexzf extends FrameLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static WeakReference f5782Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Paint f5783Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Path f5784Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public float f5785Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public float f5786Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public float f5787Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public float f5788Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public float f5789Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f5790Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public float f5791Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f5792Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean f5793Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public ImageView f5794Ujhhgtgfeyxiexzf;

    public C1725Ujhhgtgfeyxiexzf(Activity activity) {
        super(activity, null, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-1224624);
        this.f5783Ujhhgtgfeyxiexzf = paint;
        this.f5784Ujhhgtgfeyxiexzf = new Path();
        this.f5789Ujhhgtgfeyxiexzf = 500.0f;
        this.f5790Ujhhgtgfeyxiexzf = 100.0f;
        this.f5791Ujhhgtgfeyxiexzf = 16.0f;
        setBackgroundColor(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        double d = 2;
        float f = ((-((float) Math.sqrt(((float) Math.pow(this.f5786Ujhhgtgfeyxiexzf - this.f5790Ujhhgtgfeyxiexzf, d)) + ((float) Math.pow(this.f5785Ujhhgtgfeyxiexzf - this.f5789Ujhhgtgfeyxiexzf, d))))) / 15) + 16.0f;
        this.f5791Ujhhgtgfeyxiexzf = f;
        this.f5792Ujhhgtgfeyxiexzf = f < 5.0f;
        double dAtan = (float) Math.atan((this.f5786Ujhhgtgfeyxiexzf - this.f5790Ujhhgtgfeyxiexzf) / (this.f5785Ujhhgtgfeyxiexzf - this.f5789Ujhhgtgfeyxiexzf));
        float fSin = this.f5791Ujhhgtgfeyxiexzf * ((float) Math.sin(dAtan));
        float fCos = this.f5791Ujhhgtgfeyxiexzf * ((float) Math.cos(dAtan));
        Path path = this.f5784Ujhhgtgfeyxiexzf;
        path.reset();
        path.moveTo(this.f5789Ujhhgtgfeyxiexzf - fSin, this.f5790Ujhhgtgfeyxiexzf + fCos);
        path.quadTo(this.f5787Ujhhgtgfeyxiexzf, this.f5788Ujhhgtgfeyxiexzf, this.f5785Ujhhgtgfeyxiexzf - fSin, this.f5786Ujhhgtgfeyxiexzf + fCos);
        path.lineTo(this.f5785Ujhhgtgfeyxiexzf + fSin, this.f5786Ujhhgtgfeyxiexzf - fCos);
        path.quadTo(this.f5787Ujhhgtgfeyxiexzf, this.f5788Ujhhgtgfeyxiexzf, this.f5789Ujhhgtgfeyxiexzf + fSin, this.f5790Ujhhgtgfeyxiexzf - fCos);
        path.close();
        if (!this.f5792Ujhhgtgfeyxiexzf && this.f5793Ujhhgtgfeyxiexzf && this.f5794Ujhhgtgfeyxiexzf != null) {
            Paint paint = this.f5783Ujhhgtgfeyxiexzf;
            canvas.drawPath(path, paint);
            canvas.drawCircle(this.f5789Ujhhgtgfeyxiexzf, this.f5790Ujhhgtgfeyxiexzf, this.f5791Ujhhgtgfeyxiexzf, paint);
            canvas.drawCircle(this.f5785Ujhhgtgfeyxiexzf, this.f5786Ujhhgtgfeyxiexzf, this.f5791Ujhhgtgfeyxiexzf, paint);
        }
        super.onDraw(canvas);
    }
}
