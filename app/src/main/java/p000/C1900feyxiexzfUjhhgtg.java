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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛳᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1900feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final InterpolatorC0700Ujhhgtgfeyxiexzf f6333Ujhhgtgfeyxiexzf = new InterpolatorC0700Ujhhgtgfeyxiexzf(3);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f6334Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f6335Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public float[] f6337Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public float[] f6338Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public float[] f6339Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public float[] f6340Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int[] f6341Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int[] f6342Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int[] f6343Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f6344Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public VelocityTracker f6345Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final float f6346Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final float f6347Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int f6348Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final OverScroller f6349Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final AbstractC1243feyxiexzfUjhhgtg f6350Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public View f6351Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public boolean f6352Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final CoordinatorLayout f6353Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f6336Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final RunnableC3012feyxiexzfUjhhgtg f6354Ujhhgtgfeyxiexzf = new RunnableC3012feyxiexzfUjhhgtg(18, this);

    public C1900feyxiexzfUjhhgtg(Context context, CoordinatorLayout coordinatorLayout, AbstractC1243feyxiexzfUjhhgtg abstractC1243feyxiexzfUjhhgtg) {
        if (abstractC1243feyxiexzfUjhhgtg == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f6353Ujhhgtgfeyxiexzf = coordinatorLayout;
        this.f6350Ujhhgtgfeyxiexzf = abstractC1243feyxiexzfUjhhgtg;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6348Ujhhgtgfeyxiexzf = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f6335Ujhhgtgfeyxiexzf = viewConfiguration.getScaledTouchSlop();
        this.f6346Ujhhgtgfeyxiexzf = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6347Ujhhgtgfeyxiexzf = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6349Ujhhgtgfeyxiexzf = new OverScroller(context, f6333Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3238Ujhhgtgfeyxiexzf() {
        this.f6336Ujhhgtgfeyxiexzf = -1;
        float[] fArr = this.f6337Ujhhgtgfeyxiexzf;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f6338Ujhhgtgfeyxiexzf, 0.0f);
            Arrays.fill(this.f6339Ujhhgtgfeyxiexzf, 0.0f);
            Arrays.fill(this.f6340Ujhhgtgfeyxiexzf, 0.0f);
            Arrays.fill(this.f6341Ujhhgtgfeyxiexzf, 0);
            Arrays.fill(this.f6342Ujhhgtgfeyxiexzf, 0);
            Arrays.fill(this.f6343Ujhhgtgfeyxiexzf, 0);
            this.f6344Ujhhgtgfeyxiexzf = 0;
        }
        VelocityTracker velocityTracker = this.f6345Ujhhgtgfeyxiexzf;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6345Ujhhgtgfeyxiexzf = null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3239Ujhhgtgfeyxiexzf(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f6353Ujhhgtgfeyxiexzf;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f6351Ujhhgtgfeyxiexzf = view;
        this.f6336Ujhhgtgfeyxiexzf = i;
        this.f6350Ujhhgtgfeyxiexzf.mo2667Ujhhgtgfeyxiexzf(view, i);
        m3251Ujhhgtgfeyxiexzf(1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean m3240Ujhhgtgfeyxiexzf(View view, float f, float f2) {
        if (view != null) {
            AbstractC1243feyxiexzfUjhhgtg abstractC1243feyxiexzfUjhhgtg = this.f6350Ujhhgtgfeyxiexzf;
            boolean z = abstractC1243feyxiexzfUjhhgtg.mo2666Ujhhgtgfeyxiexzf(view) > 0;
            boolean z2 = abstractC1243feyxiexzfUjhhgtg.mo2745Ujhhgtgfeyxiexzf() > 0;
            if (z && z2) {
                float f3 = (f2 * f2) + (f * f);
                int i = this.f6335Ujhhgtgfeyxiexzf;
                if (f3 > i * i) {
                    return true;
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= this.f6335Ujhhgtgfeyxiexzf) : Math.abs(f) > this.f6335Ujhhgtgfeyxiexzf) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m3241Ujhhgtgfeyxiexzf(int i) {
        float[] fArr = this.f6337Ujhhgtgfeyxiexzf;
        if (fArr != null) {
            int i2 = this.f6344Ujhhgtgfeyxiexzf;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f6338Ujhhgtgfeyxiexzf[i] = 0.0f;
                this.f6339Ujhhgtgfeyxiexzf[i] = 0.0f;
                this.f6340Ujhhgtgfeyxiexzf[i] = 0.0f;
                this.f6341Ujhhgtgfeyxiexzf[i] = 0;
                this.f6342Ujhhgtgfeyxiexzf[i] = 0;
                this.f6343Ujhhgtgfeyxiexzf[i] = 0;
                this.f6344Ujhhgtgfeyxiexzf = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m3242Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f6353Ujhhgtgfeyxiexzf.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m3243Ujhhgtgfeyxiexzf() {
        if (this.f6334Ujhhgtgfeyxiexzf == 2) {
            OverScroller overScroller = this.f6349Ujhhgtgfeyxiexzf;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f6351Ujhhgtgfeyxiexzf.getLeft();
            int top = currY - this.f6351Ujhhgtgfeyxiexzf.getTop();
            if (left != 0) {
                View view = this.f6351Ujhhgtgfeyxiexzf;
                Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f6351Ujhhgtgfeyxiexzf;
                Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f6350Ujhhgtgfeyxiexzf.mo2669Ujhhgtgfeyxiexzf(this.f6351Ujhhgtgfeyxiexzf, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f6353Ujhhgtgfeyxiexzf.post(this.f6354Ujhhgtgfeyxiexzf);
            }
        }
        return this.f6334Ujhhgtgfeyxiexzf == 2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final View m3244Ujhhgtgfeyxiexzf(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f6353Ujhhgtgfeyxiexzf;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f6350Ujhhgtgfeyxiexzf.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean m3245Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f6351Ujhhgtgfeyxiexzf.getLeft();
        int top = this.f6351Ujhhgtgfeyxiexzf.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f6349Ujhhgtgfeyxiexzf;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m3251Ujhhgtgfeyxiexzf(0);
            return false;
        }
        View view = this.f6351Ujhhgtgfeyxiexzf;
        int i7 = (int) this.f6347Ujhhgtgfeyxiexzf;
        int i8 = (int) this.f6346Ujhhgtgfeyxiexzf;
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
        AbstractC1243feyxiexzfUjhhgtg abstractC1243feyxiexzfUjhhgtg = this.f6350Ujhhgtgfeyxiexzf;
        overScroller.startScroll(left, top, i5, i6, (int) ((m3242Ujhhgtgfeyxiexzf(i6, i4, abstractC1243feyxiexzfUjhhgtg.mo2745Ujhhgtgfeyxiexzf()) * f6) + (m3242Ujhhgtgfeyxiexzf(i5, i3, abstractC1243feyxiexzfUjhhgtg.mo2666Ujhhgtgfeyxiexzf(view)) * f5)));
        m3251Ujhhgtgfeyxiexzf(2);
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean m3246Ujhhgtgfeyxiexzf(int i) {
        if ((this.f6344Ujhhgtgfeyxiexzf & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3247Ujhhgtgfeyxiexzf(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m3238Ujhhgtgfeyxiexzf();
        }
        if (this.f6345Ujhhgtgfeyxiexzf == null) {
            this.f6345Ujhhgtgfeyxiexzf = VelocityTracker.obtain();
        }
        this.f6345Ujhhgtgfeyxiexzf.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM3244Ujhhgtgfeyxiexzf = m3244Ujhhgtgfeyxiexzf((int) x, (int) y);
            m3249Ujhhgtgfeyxiexzf(x, y, pointerId);
            m3254Ujhhgtgfeyxiexzf(viewM3244Ujhhgtgfeyxiexzf, pointerId);
            int i3 = this.f6341Ujhhgtgfeyxiexzf[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f6334Ujhhgtgfeyxiexzf == 1) {
                m3248Ujhhgtgfeyxiexzf();
            }
            m3238Ujhhgtgfeyxiexzf();
            return;
        }
        AbstractC1243feyxiexzfUjhhgtg abstractC1243feyxiexzfUjhhgtg = this.f6350Ujhhgtgfeyxiexzf;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f6334Ujhhgtgfeyxiexzf == 1) {
                    this.f6352Ujhhgtgfeyxiexzf = true;
                    abstractC1243feyxiexzfUjhhgtg.mo2670Ujhhgtgfeyxiexzf(this.f6351Ujhhgtgfeyxiexzf, 0.0f, 0.0f);
                    this.f6352Ujhhgtgfeyxiexzf = false;
                    if (this.f6334Ujhhgtgfeyxiexzf == 1) {
                        m3251Ujhhgtgfeyxiexzf(0);
                    }
                }
                m3238Ujhhgtgfeyxiexzf();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m3249Ujhhgtgfeyxiexzf(x2, y2, pointerId2);
                if (this.f6334Ujhhgtgfeyxiexzf == 0) {
                    m3254Ujhhgtgfeyxiexzf(m3244Ujhhgtgfeyxiexzf((int) x2, (int) y2), pointerId2);
                    int i4 = this.f6341Ujhhgtgfeyxiexzf[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.f6351Ujhhgtgfeyxiexzf;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    m3254Ujhhgtgfeyxiexzf(this.f6351Ujhhgtgfeyxiexzf, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f6334Ujhhgtgfeyxiexzf == 1 && pointerId3 == this.f6336Ujhhgtgfeyxiexzf) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f6336Ujhhgtgfeyxiexzf) {
                        View viewM3244Ujhhgtgfeyxiexzf2 = m3244Ujhhgtgfeyxiexzf((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f6351Ujhhgtgfeyxiexzf;
                        if (viewM3244Ujhhgtgfeyxiexzf2 == view2 && m3254Ujhhgtgfeyxiexzf(view2, pointerId4)) {
                            i = this.f6336Ujhhgtgfeyxiexzf;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m3248Ujhhgtgfeyxiexzf();
                }
            }
            m3241Ujhhgtgfeyxiexzf(pointerId3);
            return;
        }
        if (this.f6334Ujhhgtgfeyxiexzf == 1) {
            if (m3246Ujhhgtgfeyxiexzf(this.f6336Ujhhgtgfeyxiexzf)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f6336Ujhhgtgfeyxiexzf);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f6339Ujhhgtgfeyxiexzf;
                int i7 = this.f6336Ujhhgtgfeyxiexzf;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y3 - this.f6340Ujhhgtgfeyxiexzf[i7]);
                int left = this.f6351Ujhhgtgfeyxiexzf.getLeft() + i8;
                int top = this.f6351Ujhhgtgfeyxiexzf.getTop() + i9;
                int left2 = this.f6351Ujhhgtgfeyxiexzf.getLeft();
                int top2 = this.f6351Ujhhgtgfeyxiexzf.getTop();
                if (i8 != 0) {
                    left = abstractC1243feyxiexzfUjhhgtg.mo2664Ujhhgtgfeyxiexzf(this.f6351Ujhhgtgfeyxiexzf, left);
                    Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                    this.f6351Ujhhgtgfeyxiexzf.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = abstractC1243feyxiexzfUjhhgtg.mo2665Ujhhgtgfeyxiexzf(this.f6351Ujhhgtgfeyxiexzf, top);
                    Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                    this.f6351Ujhhgtgfeyxiexzf.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    abstractC1243feyxiexzfUjhhgtg.mo2669Ujhhgtgfeyxiexzf(this.f6351Ujhhgtgfeyxiexzf, left, top);
                }
                m3250Ujhhgtgfeyxiexzf(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (m3246Ujhhgtgfeyxiexzf(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y4 = motionEvent.getY(i2);
                float f = x4 - this.f6337Ujhhgtgfeyxiexzf[pointerId5];
                float f2 = y4 - this.f6338Ujhhgtgfeyxiexzf[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i10 = this.f6341Ujhhgtgfeyxiexzf[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i11 = this.f6341Ujhhgtgfeyxiexzf[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.f6341Ujhhgtgfeyxiexzf[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.f6341Ujhhgtgfeyxiexzf[pointerId5];
                if (this.f6334Ujhhgtgfeyxiexzf != 1) {
                    View viewM3244Ujhhgtgfeyxiexzf3 = m3244Ujhhgtgfeyxiexzf((int) x4, (int) y4);
                    if (m3240Ujhhgtgfeyxiexzf(viewM3244Ujhhgtgfeyxiexzf3, f, f2) && m3254Ujhhgtgfeyxiexzf(viewM3244Ujhhgtgfeyxiexzf3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m3250Ujhhgtgfeyxiexzf(motionEvent);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m3248Ujhhgtgfeyxiexzf() {
        VelocityTracker velocityTracker = this.f6345Ujhhgtgfeyxiexzf;
        float f = this.f6346Ujhhgtgfeyxiexzf;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f6345Ujhhgtgfeyxiexzf.getXVelocity(this.f6336Ujhhgtgfeyxiexzf);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.f6347Ujhhgtgfeyxiexzf;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f6345Ujhhgtgfeyxiexzf.getYVelocity(this.f6336Ujhhgtgfeyxiexzf);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f6352Ujhhgtgfeyxiexzf = true;
        this.f6350Ujhhgtgfeyxiexzf.mo2670Ujhhgtgfeyxiexzf(this.f6351Ujhhgtgfeyxiexzf, xVelocity, f);
        this.f6352Ujhhgtgfeyxiexzf = false;
        if (this.f6334Ujhhgtgfeyxiexzf == 1) {
            m3251Ujhhgtgfeyxiexzf(0);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3249Ujhhgtgfeyxiexzf(float f, float f2, int i) {
        float[] fArr = this.f6337Ujhhgtgfeyxiexzf;
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
                float[] fArr6 = this.f6338Ujhhgtgfeyxiexzf;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f6339Ujhhgtgfeyxiexzf;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f6340Ujhhgtgfeyxiexzf;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f6341Ujhhgtgfeyxiexzf;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f6342Ujhhgtgfeyxiexzf;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f6343Ujhhgtgfeyxiexzf;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f6337Ujhhgtgfeyxiexzf = fArr2;
            this.f6338Ujhhgtgfeyxiexzf = fArr3;
            this.f6339Ujhhgtgfeyxiexzf = fArr4;
            this.f6340Ujhhgtgfeyxiexzf = fArr5;
            this.f6341Ujhhgtgfeyxiexzf = iArr;
            this.f6342Ujhhgtgfeyxiexzf = iArr2;
            this.f6343Ujhhgtgfeyxiexzf = iArr3;
        }
        float[] fArr9 = this.f6337Ujhhgtgfeyxiexzf;
        this.f6339Ujhhgtgfeyxiexzf[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f6338Ujhhgtgfeyxiexzf;
        this.f6340Ujhhgtgfeyxiexzf[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f6341Ujhhgtgfeyxiexzf;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f6353Ujhhgtgfeyxiexzf;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f6348Ujhhgtgfeyxiexzf;
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
        this.f6344Ujhhgtgfeyxiexzf |= 1 << i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m3250Ujhhgtgfeyxiexzf(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m3246Ujhhgtgfeyxiexzf(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f6339Ujhhgtgfeyxiexzf[pointerId] = x;
                this.f6340Ujhhgtgfeyxiexzf[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m3251Ujhhgtgfeyxiexzf(int i) {
        this.f6353Ujhhgtgfeyxiexzf.removeCallbacks(this.f6354Ujhhgtgfeyxiexzf);
        if (this.f6334Ujhhgtgfeyxiexzf != i) {
            this.f6334Ujhhgtgfeyxiexzf = i;
            this.f6350Ujhhgtgfeyxiexzf.mo2668Ujhhgtgfeyxiexzf(i);
            if (this.f6334Ujhhgtgfeyxiexzf == 0) {
                this.f6351Ujhhgtgfeyxiexzf = null;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean m3252Ujhhgtgfeyxiexzf(int i, int i2) {
        if (this.f6352Ujhhgtgfeyxiexzf) {
            return m3245Ujhhgtgfeyxiexzf(i, i2, (int) this.f6345Ujhhgtgfeyxiexzf.getXVelocity(this.f6336Ujhhgtgfeyxiexzf), (int) this.f6345Ujhhgtgfeyxiexzf.getYVelocity(this.f6336Ujhhgtgfeyxiexzf));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m3253Ujhhgtgfeyxiexzf(MotionEvent motionEvent) {
        View viewM3244Ujhhgtgfeyxiexzf;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m3238Ujhhgtgfeyxiexzf();
        }
        if (this.f6345Ujhhgtgfeyxiexzf == null) {
            this.f6345Ujhhgtgfeyxiexzf = VelocityTracker.obtain();
        }
        this.f6345Ujhhgtgfeyxiexzf.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m3249Ujhhgtgfeyxiexzf(x, y, pointerId);
            View viewM3244Ujhhgtgfeyxiexzf2 = m3244Ujhhgtgfeyxiexzf((int) x, (int) y);
            if (viewM3244Ujhhgtgfeyxiexzf2 == this.f6351Ujhhgtgfeyxiexzf && this.f6334Ujhhgtgfeyxiexzf == 2) {
                m3254Ujhhgtgfeyxiexzf(viewM3244Ujhhgtgfeyxiexzf2, pointerId);
            }
            int i = this.f6341Ujhhgtgfeyxiexzf[pointerId];
        } else if (actionMasked == 1) {
            m3238Ujhhgtgfeyxiexzf();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m3238Ujhhgtgfeyxiexzf();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m3249Ujhhgtgfeyxiexzf(x2, y2, pointerId2);
                int i2 = this.f6334Ujhhgtgfeyxiexzf;
                if (i2 == 0) {
                    int i3 = this.f6341Ujhhgtgfeyxiexzf[pointerId2];
                } else if (i2 == 2 && (viewM3244Ujhhgtgfeyxiexzf = m3244Ujhhgtgfeyxiexzf((int) x2, (int) y2)) == this.f6351Ujhhgtgfeyxiexzf) {
                    m3254Ujhhgtgfeyxiexzf(viewM3244Ujhhgtgfeyxiexzf, pointerId2);
                }
            } else if (actionMasked == 6) {
                m3241Ujhhgtgfeyxiexzf(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f6337Ujhhgtgfeyxiexzf != null && this.f6338Ujhhgtgfeyxiexzf != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if (m3246Ujhhgtgfeyxiexzf(pointerId3)) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.f6337Ujhhgtgfeyxiexzf[pointerId3];
                    float f2 = y3 - this.f6338Ujhhgtgfeyxiexzf[pointerId3];
                    View viewM3244Ujhhgtgfeyxiexzf3 = m3244Ujhhgtgfeyxiexzf((int) x3, (int) y3);
                    boolean z = viewM3244Ujhhgtgfeyxiexzf3 != null && m3240Ujhhgtgfeyxiexzf(viewM3244Ujhhgtgfeyxiexzf3, f, f2);
                    if (!z) {
                        Math.abs(f);
                        Math.abs(f2);
                        int i5 = this.f6341Ujhhgtgfeyxiexzf[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i6 = this.f6341Ujhhgtgfeyxiexzf[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i7 = this.f6341Ujhhgtgfeyxiexzf[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i8 = this.f6341Ujhhgtgfeyxiexzf[pointerId3];
                        if (this.f6334Ujhhgtgfeyxiexzf != 1) {
                            break;
                        }
                    } else {
                        int left = viewM3244Ujhhgtgfeyxiexzf3.getLeft();
                        AbstractC1243feyxiexzfUjhhgtg abstractC1243feyxiexzfUjhhgtg = this.f6350Ujhhgtgfeyxiexzf;
                        int iMo2664Ujhhgtgfeyxiexzf = abstractC1243feyxiexzfUjhhgtg.mo2664Ujhhgtgfeyxiexzf(viewM3244Ujhhgtgfeyxiexzf3, ((int) f) + left);
                        int top = viewM3244Ujhhgtgfeyxiexzf3.getTop();
                        int iMo2665Ujhhgtgfeyxiexzf = abstractC1243feyxiexzfUjhhgtg.mo2665Ujhhgtgfeyxiexzf(viewM3244Ujhhgtgfeyxiexzf3, ((int) f2) + top);
                        int iMo2666Ujhhgtgfeyxiexzf = abstractC1243feyxiexzfUjhhgtg.mo2666Ujhhgtgfeyxiexzf(viewM3244Ujhhgtgfeyxiexzf3);
                        int iMo2745Ujhhgtgfeyxiexzf = abstractC1243feyxiexzfUjhhgtg.mo2745Ujhhgtgfeyxiexzf();
                        if ((iMo2666Ujhhgtgfeyxiexzf == 0 || (iMo2666Ujhhgtgfeyxiexzf > 0 && iMo2664Ujhhgtgfeyxiexzf == left)) && (iMo2745Ujhhgtgfeyxiexzf == 0 || (iMo2745Ujhhgtgfeyxiexzf > 0 && iMo2665Ujhhgtgfeyxiexzf == top))) {
                            break;
                        }
                        Math.abs(f);
                        Math.abs(f2);
                        int i9 = this.f6341Ujhhgtgfeyxiexzf[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i10 = this.f6341Ujhhgtgfeyxiexzf[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i11 = this.f6341Ujhhgtgfeyxiexzf[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i12 = this.f6341Ujhhgtgfeyxiexzf[pointerId3];
                        if (this.f6334Ujhhgtgfeyxiexzf != 1 || (z && m3254Ujhhgtgfeyxiexzf(viewM3244Ujhhgtgfeyxiexzf3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m3250Ujhhgtgfeyxiexzf(motionEvent);
        }
        return this.f6334Ujhhgtgfeyxiexzf == 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final boolean m3254Ujhhgtgfeyxiexzf(View view, int i) {
        if (view == this.f6351Ujhhgtgfeyxiexzf && this.f6336Ujhhgtgfeyxiexzf == i) {
            return true;
        }
        if (view == null || !this.f6350Ujhhgtgfeyxiexzf.mo2671feyxiexzfUjhhgtg(view, i)) {
            return false;
        }
        this.f6336Ujhhgtgfeyxiexzf = i;
        m3239Ujhhgtgfeyxiexzf(view, i);
        return true;
    }
}
