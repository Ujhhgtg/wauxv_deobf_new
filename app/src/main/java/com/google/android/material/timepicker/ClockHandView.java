package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import me.hd.wauxv.R;
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC1937feyxiexzfUjhhgtg;
import p000.AbstractC3036feyxiexzfUjhhgtg;
import p000.InterfaceC2836feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ValueAnimator f960Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f961Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final ArrayList f962Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f963Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final float f964Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Paint f965Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final RectF f966Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f967Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public float f968Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f969Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public double f970Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public int f971Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f972Ujhhgtgfeyxiexzf;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f960Ujhhgtgfeyxiexzf = new ValueAnimator();
        this.f962Ujhhgtgfeyxiexzf = new ArrayList();
        Paint paint = new Paint();
        this.f965Ujhhgtgfeyxiexzf = paint;
        this.f966Ujhhgtgfeyxiexzf = new RectF();
        this.f972Ujhhgtgfeyxiexzf = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3124Ujhhgtgfeyxiexzf, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(context, R.attr.motionDurationLong2, 200);
        AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9413Ujhhgtgfeyxiexzf);
        this.f971Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f963Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f967Ujhhgtgfeyxiexzf = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f964Ujhhgtgfeyxiexzf = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m864Ujhhgtgfeyxiexzf(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iM863Ujhhgtgfeyxiexzf = m863Ujhhgtgfeyxiexzf(this.f972Ujhhgtgfeyxiexzf);
        float f = width;
        float f2 = iM863Ujhhgtgfeyxiexzf;
        float fCos = (((float) Math.cos(this.f970Ujhhgtgfeyxiexzf)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.f970Ujhhgtgfeyxiexzf))) + f3;
        Paint paint = this.f965Ujhhgtgfeyxiexzf;
        paint.setStrokeWidth(0.0f);
        int i = this.f963Ujhhgtgfeyxiexzf;
        canvas.drawCircle(fCos, fSin, i, paint);
        double dSin = Math.sin(this.f970Ujhhgtgfeyxiexzf);
        double d = iM863Ujhhgtgfeyxiexzf - i;
        paint.setStrokeWidth(this.f967Ujhhgtgfeyxiexzf);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.f970Ujhhgtgfeyxiexzf) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.f964Ujhhgtgfeyxiexzf, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f960Ujhhgtgfeyxiexzf.isRunning()) {
            return;
        }
        m864Ujhhgtgfeyxiexzf(this.f968Ujhhgtgfeyxiexzf);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f969Ujhhgtgfeyxiexzf = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f969Ujhhgtgfeyxiexzf;
            if (this.f961Ujhhgtgfeyxiexzf) {
                this.f972Ujhhgtgfeyxiexzf = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) m863Ujhhgtgfeyxiexzf(2)) + AbstractC1937feyxiexzfUjhhgtg.m3278Ujhhgtgfeyxiexzf(getContext(), 12) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f969Ujhhgtgfeyxiexzf;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f968Ujhhgtgfeyxiexzf != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            m864Ujhhgtgfeyxiexzf(f);
            z3 = true;
        }
        this.f969Ujhhgtgfeyxiexzf = z4 | z3;
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m863Ujhhgtgfeyxiexzf(int i) {
        return i == 2 ? Math.round(this.f971Ujhhgtgfeyxiexzf * 0.66f) : this.f971Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m864Ujhhgtgfeyxiexzf(float f) {
        ValueAnimator valueAnimator = this.f960Ujhhgtgfeyxiexzf;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.f968Ujhhgtgfeyxiexzf = f2;
        this.f970Ujhhgtgfeyxiexzf = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM863Ujhhgtgfeyxiexzf = m863Ujhhgtgfeyxiexzf(this.f972Ujhhgtgfeyxiexzf);
        float fCos = (((float) Math.cos(this.f970Ujhhgtgfeyxiexzf)) * fM863Ujhhgtgfeyxiexzf) + width;
        float fSin = (fM863Ujhhgtgfeyxiexzf * ((float) Math.sin(this.f970Ujhhgtgfeyxiexzf))) + height;
        float f3 = this.f963Ujhhgtgfeyxiexzf;
        this.f966Ujhhgtgfeyxiexzf.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.f962Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC2836feyxiexzfUjhhgtg) it.next());
            if (Math.abs(clockFaceView.f958feyxiexzfUjhhgtg - f2) > 0.001f) {
                clockFaceView.f958feyxiexzfUjhhgtg = f2;
                clockFaceView.m862Ujhhgtgfeyxiexzf();
            }
        }
        invalidate();
    }
}
