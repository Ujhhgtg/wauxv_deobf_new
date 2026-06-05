package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.PathInterpolator;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸能不能ᛲᛱUjhhgtgᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1464feyxiexzfUjhhgtg extends Drawable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public Drawable f5083Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Paint f5084Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final RectF f5085Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Rect f5086Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final float f5087Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public float f5088Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public ValueAnimator f5089Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final PathInterpolator f5090Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final PathInterpolator f5091Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final PathInterpolator f5092Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public float f5093Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f5094Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public float f5095Ujhhgtgfeyxiexzf;

    public C1464feyxiexzfUjhhgtg(int i, Context context, Drawable drawable) {
        this.f5083Ujhhgtgfeyxiexzf = drawable;
        Paint paint = new Paint();
        this.f5084Ujhhgtgfeyxiexzf = paint;
        this.f5085Ujhhgtgfeyxiexzf = new RectF();
        this.f5086Ujhhgtgfeyxiexzf = new Rect();
        this.f5088Ujhhgtgfeyxiexzf = 45.0f;
        this.f5090Ujhhgtgfeyxiexzf = new PathInterpolator(0.66f, 0.01f, 1.0f, 0.7f);
        this.f5091Ujhhgtgfeyxiexzf = new PathInterpolator(0.0f, 0.53f, 0.4f, 1.0f);
        this.f5092Ujhhgtgfeyxiexzf = new PathInterpolator(0.0f, 0.67f, 0.17f, 1.0f);
        this.f5094Ujhhgtgfeyxiexzf = 1.0f;
        paint.setColor(i);
        this.f5087Ujhhgtgfeyxiexzf = context.getResources().getDimension(R.dimen.close_line_stroke);
        Drawable drawable2 = this.f5083Ujhhgtgfeyxiexzf;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        m2970Ujhhgtgfeyxiexzf(canvas, this.f5088Ujhhgtgfeyxiexzf);
        m2970Ujhhgtgfeyxiexzf(canvas, -this.f5088Ujhhgtgfeyxiexzf);
        Drawable drawable = this.f5083Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            float fWidth = getBounds().width() / 2.0f;
            float fWidth2 = getBounds().width() / 2.0f;
            float f = this.f5094Ujhhgtgfeyxiexzf;
            float f2 = fWidth * f;
            float f3 = f * fWidth2;
            int i = (int) (f3 + fWidth2);
            Rect rect = this.f5086Ujhhgtgfeyxiexzf;
            rect.set((int) (fWidth - f2), (int) (fWidth2 - f3), (int) (f2 + fWidth), i);
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f5083Ujhhgtgfeyxiexzf;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f5084Ujhhgtgfeyxiexzf.setAlpha(i);
        Drawable drawable = this.f5083Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5084Ujhhgtgfeyxiexzf.setColorFilter(colorFilter);
        Drawable drawable = this.f5083Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2969Ujhhgtgfeyxiexzf(float f) {
        ValueAnimator valueAnimator = this.f5089Ujhhgtgfeyxiexzf;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.f5095Ujhhgtgfeyxiexzf, f).setDuration(600L);
        this.f5089Ujhhgtgfeyxiexzf = duration;
        duration.addUpdateListener(new C3235feyxiexzfUjhhgtg(3, this));
        ValueAnimator valueAnimator2 = this.f5089Ujhhgtgfeyxiexzf;
        if (valueAnimator2 == null) {
            valueAnimator2 = null;
        }
        valueAnimator2.start();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2970Ujhhgtgfeyxiexzf(Canvas canvas, float f) {
        float fWidth = getBounds().width() / 2.0f;
        float fWidth2 = getBounds().width() / 2.0f;
        canvas.save();
        canvas.rotate(f, fWidth, fWidth2);
        float fWidth3 = getBounds().width() / 2.0f;
        float fWidth4 = getBounds().width() / 2.0f;
        float f2 = this.f5093Ujhhgtgfeyxiexzf * fWidth3;
        float f3 = this.f5087Ujhhgtgfeyxiexzf;
        float f4 = f3 / 2.0f;
        RectF rectF = this.f5085Ujhhgtgfeyxiexzf;
        rectF.set(fWidth3 - f2, fWidth4 - f4, f2 + fWidth3, f4 + fWidth4);
        canvas.drawRoundRect(rectF, f3, f3, this.f5084Ujhhgtgfeyxiexzf);
        canvas.restore();
    }
}
