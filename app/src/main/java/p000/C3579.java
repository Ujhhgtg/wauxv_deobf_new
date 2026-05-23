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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3579 {

    public static final InterpolatorC1680 f11189 = new InterpolatorC1680(3);

    public int f11190;

    public final int f11191;

    public float[] f11193;

    public float[] f11194;

    public float[] f11195;

    public float[] f11196;

    public int[] f11197;

    public int[] f11198;

    public int[] f11199;

    public int f11200;

    public VelocityTracker f11201;

    public final float f11202;

    public final float f11203;

    public final int f11204;

    public final OverScroller f11205;

    public final AbstractC0743 f11206;

    public View f11207;

    public boolean f11208;

    public final CoordinatorLayout f11209;

    public int f11192 = -1;

    public final RunnableC0141 f11210 = new RunnableC0141(18, this);

    public C3579(Context context, CoordinatorLayout coordinatorLayout, AbstractC0743 abstractC0743) {
        if (abstractC0743 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f11209 = coordinatorLayout;
        this.f11206 = abstractC0743;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f11204 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f11191 = viewConfiguration.getScaledTouchSlop();
        this.f11202 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f11203 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11205 = new OverScroller(context, f11189);
    }

    public final void m5180() {
        this.f11192 = -1;
        float[] fArr = this.f11193;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f11194, 0.0f);
            Arrays.fill(this.f11195, 0.0f);
            Arrays.fill(this.f11196, 0.0f);
            Arrays.fill(this.f11197, 0);
            Arrays.fill(this.f11198, 0);
            Arrays.fill(this.f11199, 0);
            this.f11200 = 0;
        }
        VelocityTracker velocityTracker = this.f11201;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11201 = null;
        }
    }

    public final void m5181(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f11209;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f11207 = view;
        this.f11192 = i;
        this.f11206.mo2189(view, i);
        m5193(1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    public final boolean m5182(View view, float f, float f2) {
        if (view != null) {
            AbstractC0743 abstractC0743 = this.f11206;
            boolean z = abstractC0743.mo1685(view) > 0;
            boolean z2 = abstractC0743.mo1686() > 0;
            if (z && z2) {
                float f3 = (f2 * f2) + (f * f);
                int i = this.f11191;
                if (f3 > i * i) {
                    return true;
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= this.f11191) : Math.abs(f) > this.f11191) {
                return true;
            }
        }
        return false;
    }

    public final void m5183(int i) {
        float[] fArr = this.f11193;
        if (fArr != null) {
            int i2 = this.f11200;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f11194[i] = 0.0f;
                this.f11195[i] = 0.0f;
                this.f11196[i] = 0.0f;
                this.f11197[i] = 0;
                this.f11198[i] = 0;
                this.f11199[i] = 0;
                this.f11200 = (~i3) & i2;
            }
        }
    }

    public final int m5184(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f11209.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean m5185() {
        if (this.f11190 == 2) {
            OverScroller overScroller = this.f11205;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f11207.getLeft();
            int top = currY - this.f11207.getTop();
            if (left != 0) {
                View view = this.f11207;
                Field field = AbstractC3578.f11184;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f11207;
                Field field2 = AbstractC3578.f11184;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f11206.mo1688(this.f11207, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f11209.post(this.f11210);
            }
        }
        return this.f11190 == 2;
    }

    public final View m5186(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f11209;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean m5187(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f11207.getLeft();
        int top = this.f11207.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f11205;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m5193(0);
            return false;
        }
        View view = this.f11207;
        int i7 = (int) this.f11203;
        int i8 = (int) this.f11202;
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
        AbstractC0743 abstractC0743 = this.f11206;
        overScroller.startScroll(left, top, i5, i6, (int) ((m5184(i6, i4, abstractC0743.mo1686()) * f6) + (m5184(i5, i3, abstractC0743.mo1685(view)) * f5)));
        m5193(2);
        return true;
    }

    public final boolean m5188(int i) {
        if ((this.f11200 & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void m5189(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m5180();
        }
        if (this.f11201 == null) {
            this.f11201 = VelocityTracker.obtain();
        }
        this.f11201.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM5186 = m5186((int) x, (int) y);
            m5191(x, y, pointerId);
            m5196(viewM5186, pointerId);
            int i3 = this.f11197[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f11190 == 1) {
                m5190();
            }
            m5180();
            return;
        }
        AbstractC0743 abstractC0743 = this.f11206;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f11190 == 1) {
                    this.f11208 = true;
                    abstractC0743.mo1689(this.f11207, 0.0f, 0.0f);
                    this.f11208 = false;
                    if (this.f11190 == 1) {
                        m5193(0);
                    }
                }
                m5180();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m5191(x2, y2, pointerId2);
                if (this.f11190 == 0) {
                    m5196(m5186((int) x2, (int) y2), pointerId2);
                    int i4 = this.f11197[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.f11207;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    m5196(this.f11207, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f11190 == 1 && pointerId3 == this.f11192) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f11192) {
                        View viewM5187 = m5186((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f11207;
                        if (viewM5187 == view2 && m5196(view2, pointerId4)) {
                            i = this.f11192;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m5190();
                }
            }
            m5183(pointerId3);
            return;
        }
        if (this.f11190 == 1) {
            if (m5188(this.f11192)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f11192);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f11195;
                int i7 = this.f11192;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y3 - this.f11196[i7]);
                int left = this.f11207.getLeft() + i8;
                int top = this.f11207.getTop() + i9;
                int left2 = this.f11207.getLeft();
                int top2 = this.f11207.getTop();
                if (i8 != 0) {
                    left = abstractC0743.mo1683(this.f11207, left);
                    Field field = AbstractC3578.f11184;
                    this.f11207.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = abstractC0743.mo1684(this.f11207, top);
                    Field field2 = AbstractC3578.f11184;
                    this.f11207.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    abstractC0743.mo1688(this.f11207, left, top);
                }
                m5192(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (m5188(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y4 = motionEvent.getY(i2);
                float f = x4 - this.f11193[pointerId5];
                float f2 = y4 - this.f11194[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i10 = this.f11197[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i11 = this.f11197[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.f11197[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.f11197[pointerId5];
                if (this.f11190 != 1) {
                    View viewM5188 = m5186((int) x4, (int) y4);
                    if (m5182(viewM5188, f, f2) && m5196(viewM5188, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m5192(motionEvent);
    }

    public final void m5190() {
        VelocityTracker velocityTracker = this.f11201;
        float f = this.f11202;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f11201.getXVelocity(this.f11192);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.f11203;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f11201.getYVelocity(this.f11192);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f11208 = true;
        this.f11206.mo1689(this.f11207, xVelocity, f);
        this.f11208 = false;
        if (this.f11190 == 1) {
            m5193(0);
        }
    }

    public final void m5191(float f, float f2, int i) {
        float[] fArr = this.f11193;
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
                float[] fArr6 = this.f11194;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f11195;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f11196;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f11197;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f11198;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f11199;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f11193 = fArr2;
            this.f11194 = fArr3;
            this.f11195 = fArr4;
            this.f11196 = fArr5;
            this.f11197 = iArr;
            this.f11198 = iArr2;
            this.f11199 = iArr3;
        }
        float[] fArr9 = this.f11193;
        this.f11195[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f11194;
        this.f11196[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f11197;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f11209;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f11204;
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
        this.f11200 |= 1 << i;
    }

    public final void m5192(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m5188(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f11195[pointerId] = x;
                this.f11196[pointerId] = y;
            }
        }
    }

    public final void m5193(int i) {
        this.f11209.removeCallbacks(this.f11210);
        if (this.f11190 != i) {
            this.f11190 = i;
            this.f11206.mo1687(i);
            if (this.f11190 == 0) {
                this.f11207 = null;
            }
        }
    }

    public final boolean m5194(int i, int i2) {
        if (this.f11208) {
            return m5187(i, i2, (int) this.f11201.getXVelocity(this.f11192), (int) this.f11201.getYVelocity(this.f11192));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    public final boolean m5195(MotionEvent motionEvent) {
        View viewM5186;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m5180();
        }
        if (this.f11201 == null) {
            this.f11201 = VelocityTracker.obtain();
        }
        this.f11201.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m5191(x, y, pointerId);
            View viewM5187 = m5186((int) x, (int) y);
            if (viewM5187 == this.f11207 && this.f11190 == 2) {
                m5196(viewM5187, pointerId);
            }
            int i = this.f11197[pointerId];
        } else if (actionMasked == 1) {
            m5180();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m5180();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m5191(x2, y2, pointerId2);
                int i2 = this.f11190;
                if (i2 == 0) {
                    int i3 = this.f11197[pointerId2];
                } else if (i2 == 2 && (viewM5186 = m5186((int) x2, (int) y2)) == this.f11207) {
                    m5196(viewM5186, pointerId2);
                }
            } else if (actionMasked == 6) {
                m5183(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f11193 != null && this.f11194 != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if (m5188(pointerId3)) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.f11193[pointerId3];
                    float f2 = y3 - this.f11194[pointerId3];
                    View viewM5188 = m5186((int) x3, (int) y3);
                    boolean z = viewM5188 != null && m5182(viewM5188, f, f2);
                    if (!z) {
                        Math.abs(f);
                        Math.abs(f2);
                        int i5 = this.f11197[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i6 = this.f11197[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i7 = this.f11197[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i8 = this.f11197[pointerId3];
                        if (this.f11190 != 1) {
                            break;
                        }
                    } else {
                        int left = viewM5188.getLeft();
                        AbstractC0743 abstractC0743 = this.f11206;
                        int iMo1683 = abstractC0743.mo1683(viewM5188, ((int) f) + left);
                        int top = viewM5188.getTop();
                        int iMo1684 = abstractC0743.mo1684(viewM5188, ((int) f2) + top);
                        int iMo1685 = abstractC0743.mo1685(viewM5188);
                        int iMo1686 = abstractC0743.mo1686();
                        if ((iMo1685 == 0 || (iMo1685 > 0 && iMo1683 == left)) && (iMo1686 == 0 || (iMo1686 > 0 && iMo1684 == top))) {
                            break;
                        }
                        Math.abs(f);
                        Math.abs(f2);
                        int i9 = this.f11197[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i10 = this.f11197[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i11 = this.f11197[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i12 = this.f11197[pointerId3];
                        if (this.f11190 != 1 || (true && m5196(viewM5188, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m5192(motionEvent);
        }
        return this.f11190 == 1;
    }

    public final boolean m5196(View view, int i) {
        if (view == this.f11207 && this.f11192 == i) {
            return true;
        }
        if (view == null || !this.f11206.mo1690(view, i)) {
            return false;
        }
        this.f11192 = i;
        m5181(view, i);
        return true;
    }
}
