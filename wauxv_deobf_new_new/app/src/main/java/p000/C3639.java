package p000;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᤝᛸᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3639 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static final InterpolatorC1697 f11338 = new InterpolatorC1697(3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f11339;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f11340;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public float[] f11342;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float[] f11343;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public float[] f11344;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public float[] f11345;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int[] f11346;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int[] f11347;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int[] f11348;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f11349;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public VelocityTracker f11350;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final float f11351;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final float f11352;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final int f11353;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final OverScroller f11354;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final AbstractC1467 f11355;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public View f11356;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public boolean f11357;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final CoordinatorLayout f11358;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f11341 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final RunnableC0149 f11359 = new RunnableC0149(this, 18);

    public C3639(Context context, CoordinatorLayout coordinatorLayout, AbstractC1467 abstractC1467) {
        if (abstractC1467 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f11358 = coordinatorLayout;
        this.f11355 = abstractC1467;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f11353 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f11340 = viewConfiguration.getScaledTouchSlop();
        this.f11351 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f11352 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11354 = new OverScroller(context, f11338);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m5186() {
        this.f11341 = -1;
        float[] fArr = this.f11342;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f11343, 0.0f);
            Arrays.fill(this.f11344, 0.0f);
            Arrays.fill(this.f11345, 0.0f);
            Arrays.fill(this.f11346, 0);
            Arrays.fill(this.f11347, 0);
            Arrays.fill(this.f11348, 0);
            this.f11349 = 0;
        }
        VelocityTracker velocityTracker = this.f11350;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11350 = null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m5187(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f11358;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f11356 = view;
        this.f11341 = i;
        this.f11355.mo3298(view, i);
        m5199(1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean m5188(View view, float f, float f2) {
        if (view != null) {
            AbstractC1467 abstractC1467 = this.f11355;
            boolean z = abstractC1467.mo1793(view) > 0;
            boolean z2 = abstractC1467.mo1794() > 0;
            if (z && z2) {
                float f3 = (f2 * f2) + (f * f);
                int i = this.f11340;
                if (f3 > i * i) {
                    return true;
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= this.f11340) : Math.abs(f) > this.f11340) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m5189(int i) {
        float[] fArr = this.f11342;
        if (fArr != null) {
            int i2 = this.f11349;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f11343[i] = 0.0f;
                this.f11344[i] = 0.0f;
                this.f11345[i] = 0.0f;
                this.f11346[i] = 0;
                this.f11347[i] = 0;
                this.f11348[i] = 0;
                this.f11349 = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m5190(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f11358.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m5191() {
        if (this.f11339 == 2) {
            OverScroller overScroller = this.f11354;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f11356.getLeft();
            int top = currY - this.f11356.getTop();
            if (left != 0) {
                View view = this.f11356;
                Field field = AbstractC3638.f11333;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f11356;
                Field field2 = AbstractC3638.f11333;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f11355.mo1796(this.f11356, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f11358.post(this.f11359);
            }
        }
        return this.f11339 == 2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final View m5192(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f11358;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f11355.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean m5193(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f11356.getLeft();
        int top = this.f11356.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f11354;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m5199(0);
            return false;
        }
        View view = this.f11356;
        int i7 = (int) this.f11352;
        int i8 = (int) this.f11351;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i9;
        } else {
            f = iAbs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i9;
        } else {
            f3 = iAbs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        AbstractC1467 abstractC1467 = this.f11355;
        overScroller.startScroll(left, top, i5, i6, (int) ((m5190(i6, i4, abstractC1467.mo1794()) * f6) + (m5190(i5, i3, abstractC1467.mo1793(view)) * f5)));
        m5199(2);
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean m5194(int i) {
        if ((this.f11349 & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m5195(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m5186();
        }
        if (this.f11350 == null) {
            this.f11350 = VelocityTracker.obtain();
        }
        this.f11350.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM5192 = m5192((int) x, (int) y);
            m5197(x, y, pointerId);
            m5202(viewM5192, pointerId);
            int i3 = this.f11346[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f11339 == 1) {
                m5196();
            }
            m5186();
            return;
        }
        AbstractC1467 abstractC1467 = this.f11355;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f11339 == 1) {
                    this.f11357 = true;
                    abstractC1467.mo1797(this.f11356, 0.0f, 0.0f);
                    this.f11357 = false;
                    if (this.f11339 == 1) {
                        m5199(0);
                    }
                }
                m5186();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m5197(x2, y2, pointerId2);
                if (this.f11339 == 0) {
                    m5202(m5192((int) x2, (int) y2), pointerId2);
                    int i4 = this.f11346[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.f11356;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    m5202(this.f11356, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f11339 == 1 && pointerId3 == this.f11341) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f11341) {
                        View viewM5193 = m5192((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f11356;
                        if (viewM5193 == view2 && m5202(view2, pointerId4)) {
                            i = this.f11341;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m5196();
                }
            }
            m5189(pointerId3);
            return;
        }
        if (this.f11339 == 1) {
            if (m5194(this.f11341)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f11341);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f11344;
                int i7 = this.f11341;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y3 - this.f11345[i7]);
                int left = this.f11356.getLeft() + i8;
                int top = this.f11356.getTop() + i9;
                int left2 = this.f11356.getLeft();
                int top2 = this.f11356.getTop();
                if (i8 != 0) {
                    left = abstractC1467.mo1791(this.f11356, left);
                    Field field = AbstractC3638.f11333;
                    this.f11356.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = abstractC1467.mo1792(this.f11356, top);
                    Field field2 = AbstractC3638.f11333;
                    this.f11356.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    abstractC1467.mo1796(this.f11356, left, top);
                }
                m5198(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (m5194(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y4 = motionEvent.getY(i2);
                float f = x4 - this.f11342[pointerId5];
                float f2 = y4 - this.f11343[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i10 = this.f11346[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i11 = this.f11346[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.f11346[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.f11346[pointerId5];
                if (this.f11339 != 1) {
                    View viewM5194 = m5192((int) x4, (int) y4);
                    if (m5188(viewM5194, f, f2) && m5202(viewM5194, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m5198(motionEvent);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m5196() {
        VelocityTracker velocityTracker = this.f11350;
        float f = this.f11351;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f11350.getXVelocity(this.f11341);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.f11352;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f11350.getYVelocity(this.f11341);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f11357 = true;
        this.f11355.mo1797(this.f11356, xVelocity, f);
        this.f11357 = false;
        if (this.f11339 == 1) {
            m5199(0);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m5197(float f, float f2, int i) {
        float[] fArr = this.f11342;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f11343;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f11344;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f11345;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f11346;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f11347;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f11348;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f11342 = fArr2;
            this.f11343 = fArr3;
            this.f11344 = fArr4;
            this.f11345 = fArr5;
            this.f11346 = iArr;
            this.f11347 = iArr2;
            this.f11348 = iArr3;
        }
        float[] fArr9 = this.f11342;
        this.f11344[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f11343;
        this.f11345[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f11346;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f11358;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f11353;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.f11349 |= 1 << i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m5198(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m5194(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f11344[pointerId] = x;
                this.f11345[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m5199(int i) {
        this.f11358.removeCallbacks(this.f11359);
        if (this.f11339 != i) {
            this.f11339 = i;
            this.f11355.mo1795(i);
            if (this.f11339 == 0) {
                this.f11356 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final boolean m5200(int i, int i2) {
        if (this.f11357) {
            return m5193(i, i2, (int) this.f11350.getXVelocity(this.f11341), (int) this.f11350.getYVelocity(this.f11341));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final boolean m5201(MotionEvent motionEvent) {
        View viewM5192;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m5186();
        }
        if (this.f11350 == null) {
            this.f11350 = VelocityTracker.obtain();
        }
        this.f11350.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m5197(x, y, pointerId);
            View viewM5193 = m5192((int) x, (int) y);
            if (viewM5193 == this.f11356 && this.f11339 == 2) {
                m5202(viewM5193, pointerId);
            }
            int i = this.f11346[pointerId];
        } else if (actionMasked == 1) {
            m5186();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m5186();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m5197(x2, y2, pointerId2);
                int i2 = this.f11339;
                if (i2 == 0) {
                    int i3 = this.f11346[pointerId2];
                } else if (i2 == 2 && (viewM5192 = m5192((int) x2, (int) y2)) == this.f11356) {
                    m5202(viewM5192, pointerId2);
                }
            } else if (actionMasked == 6) {
                m5189(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f11342 != null && this.f11343 != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if (m5194(pointerId3)) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.f11342[pointerId3];
                    float f2 = y3 - this.f11343[pointerId3];
                    View viewM5194 = m5192((int) x3, (int) y3);
                    boolean z = viewM5194 != null && m5188(viewM5194, f, f2);
                    if (!z) {
                        Math.abs(f);
                        Math.abs(f2);
                        int i5 = this.f11346[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i6 = this.f11346[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i7 = this.f11346[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i8 = this.f11346[pointerId3];
                        if (this.f11339 != 1) {
                            break;
                        }
                    } else {
                        int left = viewM5194.getLeft();
                        AbstractC1467 abstractC1467 = this.f11355;
                        int iMo1791 = abstractC1467.mo1791(viewM5194, ((int) f) + left);
                        int top = viewM5194.getTop();
                        int iMo1792 = abstractC1467.mo1792(viewM5194, ((int) f2) + top);
                        int iMo1793 = abstractC1467.mo1793(viewM5194);
                        int iMo1794 = abstractC1467.mo1794();
                        if ((iMo1793 == 0 || (iMo1793 > 0 && iMo1791 == left)) && (iMo1794 == 0 || (iMo1794 > 0 && iMo1792 == top))) {
                            break;
                        }
                        Math.abs(f);
                        Math.abs(f2);
                        int i9 = this.f11346[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i10 = this.f11346[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i11 = this.f11346[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i12 = this.f11346[pointerId3];
                        if (this.f11339 != 1 || (z && m5202(viewM5194, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m5198(motionEvent);
        }
        return this.f11339 == 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final boolean m5202(View view, int i) {
        if (view == this.f11356 && this.f11341 == i) {
            return true;
        }
        if (view == null || !this.f11355.mo1798(view, i)) {
            return false;
        }
        this.f11341 = i;
        m5187(view, i);
        return true;
    }
}
