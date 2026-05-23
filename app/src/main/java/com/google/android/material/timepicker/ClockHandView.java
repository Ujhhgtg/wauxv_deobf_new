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
import p000.AbstractC0164;
import p000.AbstractC1459;
import p000.AbstractC1574;
import p000.AbstractC2467;
import p000.AbstractC3578;
import p000.InterfaceC0729;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    public final ValueAnimator f880;

    public boolean f881;

    public final ArrayList f882;

    public final int f883;

    public final float f884;

    public final Paint f885;

    public final RectF f886;

    public final int f887;

    public float f888;

    public boolean f889;

    public double f890;

    public int f891;

    public int f892;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f880 = new ValueAnimator();
        this.f882 = new ArrayList();
        Paint paint = new Paint();
        this.f885 = paint;
        this.f886 = new RectF();
        this.f892 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2467.f7845, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC1574.m3308(context, R.attr.motionDurationLong2, 200);
        AbstractC1574.m3309(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0164.f1186);
        this.f891 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f883 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f887 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f884 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m721(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        Field field = AbstractC3578.f11184;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iM720 = m720(this.f892);
        float f = width;
        float f2 = iM720;
        float fCos = (((float) Math.cos(this.f890)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.f890))) + f3;
        Paint paint = this.f885;
        paint.setStrokeWidth(0.0f);
        int i = this.f883;
        canvas.drawCircle(fCos, fSin, i, paint);
        double dSin = Math.sin(this.f890);
        double d = iM720 - i;
        paint.setStrokeWidth(this.f887);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.f890) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.f884, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f880.isRunning()) {
            return;
        }
        m721(this.f888);
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
            this.f889 = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f889;
            if (this.f881) {
                this.f892 = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) m720(2)) + AbstractC1459.m3180(getContext(), 12) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f889;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f888 != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            m721(f);
            z3 = true;
        }
        this.f889 = z4 | z3;
        return true;
    }

    public final int m720(int i) {
        return i == 2 ? Math.round(this.f891 * 0.66f) : this.f891;
    }

    public final void m721(float f) {
        ValueAnimator valueAnimator = this.f880;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.f888 = f2;
        this.f890 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM720 = m720(this.f892);
        float fCos = (((float) Math.cos(this.f890)) * fM720) + width;
        float fSin = (fM720 * ((float) Math.sin(this.f890))) + height;
        float f3 = this.f883;
        this.f886.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.f882.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0729) it.next());
            if (Math.abs(clockFaceView.f878 - f2) > 0.001f) {
                clockFaceView.f878 = f2;
                clockFaceView.m719();
            }
        }
        invalidate();
    }
}
