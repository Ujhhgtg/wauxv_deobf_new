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
import p000.AbstractC0172;
import p000.AbstractC1471;
import p000.AbstractC2521;
import p000.AbstractC3638;
import p000.AbstractC3744;
import p000.InterfaceC0724;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ValueAnimator f946;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f947;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ArrayList f948;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f949;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final float f950;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Paint f951;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final RectF f952;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int f953;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f954;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f955;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public double f956;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f957;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f958;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f946 = new ValueAnimator();
        this.f948 = new ArrayList();
        Paint paint = new Paint();
        this.f951 = paint;
        this.f952 = new RectF();
        this.f958 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2521.f7993, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC3744.m5341(context, R.attr.motionDurationLong2, 200);
        AbstractC3744.m5342(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0172.f1254);
        this.f957 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f949 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f953 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f950 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m865(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        Field field = AbstractC3638.f11333;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iM864 = m864(this.f958);
        float f = width;
        float f2 = iM864;
        float fCos = (((float) Math.cos(this.f956)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.f956))) + f3;
        Paint paint = this.f951;
        paint.setStrokeWidth(0.0f);
        int i = this.f949;
        canvas.drawCircle(fCos, fSin, i, paint);
        double dSin = Math.sin(this.f956);
        double d = iM864 - i;
        paint.setStrokeWidth(this.f953);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.f956) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.f950, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f946.isRunning()) {
            return;
        }
        m865(this.f954);
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
            this.f955 = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f955;
            if (this.f947) {
                this.f958 = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) m864(2)) + AbstractC1471.m3383(getContext(), 12) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f955;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f954 != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            m865(f);
            z3 = true;
        }
        this.f955 = z4 | z3;
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m864(int i) {
        return i == 2 ? Math.round(this.f957 * 0.66f) : this.f957;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m865(float f) {
        ValueAnimator valueAnimator = this.f946;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.f954 = f2;
        this.f956 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM864 = m864(this.f958);
        float fCos = (((float) Math.cos(this.f956)) * fM864) + width;
        float fSin = (fM864 * ((float) Math.sin(this.f956))) + height;
        float f3 = this.f949;
        this.f952.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.f948.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0724) it.next());
            if (Math.abs(clockFaceView.f944 - f2) > 0.001f) {
                clockFaceView.f944 = f2;
                clockFaceView.m863();
            }
        }
        invalidate();
    }
}
