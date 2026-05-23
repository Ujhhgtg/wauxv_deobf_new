package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.AbstractC3588;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC3588 {

    public boolean f545;

    public int f547;

    public VelocityTracker f549;

    public int f546 = -1;

    public int f548 = -1;

    public AppBarLayout$BaseBehavior() {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    @Override // p000.AbstractC0861
    public final boolean mo619(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int iFindPointerIndex;
        if (this.f548 < 0) {
            this.f548 = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f545) {
            int i = this.f546;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y - this.f547) > this.f548) {
                    this.f547 = y;
                    return true;
                }
                if (motionEvent.getActionMasked() != 0) {
                    this.f546 = -1;
                    motionEvent.getX();
                    motionEvent.getY();
                    throw new ClassCastException();
                }
                velocityTracker = this.f549;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() != 0) {
                this.f546 = -1;
                motionEvent.getX();
                motionEvent.getY();
                throw new ClassCastException();
            }
            velocityTracker = this.f549;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    @Override // p000.AbstractC3588, p000.AbstractC0861
    public final boolean mo620(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0861
    public final boolean mo621(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0861
    public final /* synthetic */ void mo622(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0861
    public final void mo623(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0861
    public final void mo624(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0861
    public final Parcelable mo625(View view) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0861
    public final boolean mo626(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0861
    public final void mo627(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064 A[RETURN] */
    @Override // p000.AbstractC0861
    public final boolean mo628(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                        this.f546 = motionEvent.getPointerId(i);
                        this.f547 = (int) (motionEvent.getY(i) + 0.5f);
                    }
                }
                velocityTracker = this.f549;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (this.f545) {
                    return true;
                }
            } else {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f546);
                if (iFindPointerIndex != -1) {
                    this.f547 = (int) motionEvent.getY(iFindPointerIndex);
                    
                    throw new ClassCastException();
                }
            }
            return false;
        }
        VelocityTracker velocityTracker2 = this.f549;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f549.computeCurrentVelocity(1000);
            this.f549.getYVelocity(this.f546);
            
            throw new ClassCastException();
        }
        this.f545 = false;
        this.f546 = -1;
        VelocityTracker velocityTracker3 = this.f549;
        if (false) {
            velocityTracker3.recycle();
            this.f549 = null;
        }
        velocityTracker = this.f549;
        if (false) {
            velocityTracker.addMovement(motionEvent);
        }
        if (false) {
            return false;
        }
        return true;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
