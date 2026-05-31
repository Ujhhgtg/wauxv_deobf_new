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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᲇᤝᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2329 extends Drawable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Drawable f7514;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Paint f7515;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final RectF f7516;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Rect f7517;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f7518;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public float f7519;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public ValueAnimator f7520;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final PathInterpolator f7521;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final PathInterpolator f7522;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final PathInterpolator f7523;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f7524;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public float f7525;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public float f7526;

    public C2329(int i, Context context, Drawable drawable) {
        this.f7514 = drawable;
        Paint paint = new Paint();
        this.f7515 = paint;
        this.f7516 = new RectF();
        this.f7517 = new Rect();
        this.f7519 = 45.0f;
        this.f7521 = new PathInterpolator(0.66f, 0.01f, 1.0f, 0.7f);
        this.f7522 = new PathInterpolator(0.0f, 0.53f, 0.4f, 1.0f);
        this.f7523 = new PathInterpolator(0.0f, 0.67f, 0.17f, 1.0f);
        this.f7525 = 1.0f;
        paint.setColor(i);
        this.f7518 = context.getResources().getDimension(R.dimen.close_line_stroke);
        Drawable drawable2 = this.f7514;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        m4291(canvas, this.f7519);
        m4291(canvas, -this.f7519);
        Drawable drawable = this.f7514;
        if (drawable != null) {
            float fWidth = getBounds().width() / 2.0f;
            float fWidth2 = getBounds().width() / 2.0f;
            float f = this.f7525;
            float f2 = fWidth * f;
            float f3 = f * fWidth2;
            int i = (int) (f3 + fWidth2);
            Rect rect = this.f7517;
            rect.set((int) (fWidth - f2), (int) (fWidth2 - f3), (int) (f2 + fWidth), i);
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f7514;
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
        this.f7515.setAlpha(i);
        Drawable drawable = this.f7514;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7515.setColorFilter(colorFilter);
        Drawable drawable = this.f7514;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4290(float f) {
        ValueAnimator valueAnimator = this.f7520;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.f7526, f).setDuration(600L);
        this.f7520 = duration;
        duration.addUpdateListener(new C1121(this, 3));
        ValueAnimator valueAnimator2 = this.f7520;
        if (valueAnimator2 == null) {
            valueAnimator2 = null;
        }
        valueAnimator2.start();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4291(Canvas canvas, float f) {
        float fWidth = getBounds().width() / 2.0f;
        float fWidth2 = getBounds().width() / 2.0f;
        canvas.save();
        canvas.rotate(f, fWidth, fWidth2);
        float fWidth3 = getBounds().width() / 2.0f;
        float fWidth4 = getBounds().width() / 2.0f;
        float f2 = this.f7524 * fWidth3;
        float f3 = this.f7518;
        float f4 = f3 / 2.0f;
        RectF rectF = this.f7516;
        rectF.set(fWidth3 - f2, fWidth4 - f4, f2 + fWidth3, f4 + fWidth4);
        canvas.drawRoundRect(rectF, f3, f3, this.f7515);
        canvas.restore();
    }
}
