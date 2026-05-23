package p000;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲁᤝᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2507 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f7998;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f7999;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public OverScroller f8000;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Interpolator f8001;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f8002;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean f8003;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f8004;

    public RunnableC2507(RecyclerView recyclerView) {
        this.f8004 = recyclerView;
        InterpolatorC1680 interpolatorC1680 = RecyclerView.f354;
        this.f8001 = interpolatorC1680;
        this.f8002 = false;
        this.f8003 = false;
        this.f8000 = new OverScroller(recyclerView.getContext(), interpolatorC1680);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.f8004;
        int[] iArr = recyclerView.f423;
        if (recyclerView.f369 == null) {
            recyclerView.removeCallbacks(this);
            this.f8000.abortAnimation();
            return;
        }
        this.f8003 = false;
        this.f8002 = true;
        recyclerView.m210();
        OverScroller overScroller = this.f8000;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f7998;
            int i7 = currY - this.f7999;
            this.f7998 = currX;
            this.f7999 = currY;
            int iM202 = RecyclerView.m202(i6, recyclerView.f390, recyclerView.f392, recyclerView.getWidth());
            int iM203 = RecyclerView.m202(i7, recyclerView.f391, recyclerView.f393, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f423;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.m216(iArr2, iM202, iM203, 1, null)) {
                iM202 -= iArr[0];
                iM203 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m209(iM202, iM203);
            }
            if (recyclerView.f368 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.m252(iM202, iM203, iArr);
                i2 = iArr[0];
                int i8 = iArr[1];
                int i9 = iM202 - i2;
                int i10 = iM203 - i8;
                C1790 c1790 = recyclerView.f369.f7945;
                if (c1790 != null && !c1790.f5955 && c1790.f5956) {
                    int iM4505 = recyclerView.f411.m4505();
                    if (iM4505 == 0) {
                        c1790.m3528();
                    } else if (c1790.f5952 >= iM4505) {
                        c1790.f5952 = iM4505 - 1;
                        c1790.m3527(i2, i8);
                    } else {
                        c1790.m3527(i2, i8);
                    }
                }
                i3 = i9;
                i4 = i8;
                i = i10;
            } else {
                i = iM203;
                i2 = 0;
                i3 = iM202;
                i4 = 0;
            }
            if (!recyclerView.f371.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f423;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m217(i2, i4, i3, i, null, 1, iArr3);
            int i11 = i3 - iArr[0];
            int i12 = i - iArr[1];
            if (i2 != 0 || i4 != 0) {
                recyclerView.m218(i2, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            C1790 c1791 = recyclerView.f369.f7945;
            if ((c1791 == null || !c1791.f5955) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i11 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i11 > 0 ? currVelocity : 0;
                    }
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.m220();
                        if (recyclerView.f390.isFinished()) {
                            recyclerView.f390.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.m221();
                        if (recyclerView.f392.isFinished()) {
                            recyclerView.f392.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m222();
                        if (recyclerView.f391.isFinished()) {
                            recyclerView.f391.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m219();
                        if (recyclerView.f393.isFinished()) {
                            recyclerView.f393.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (true) {
                    C1439 c1439 = recyclerView.f410;
                    int[] iArr4 = c1439.f5097;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c1439.f5098 = 0;
                }
            } else {
                m4507();
                RunnableC1441 runnableC1441 = recyclerView.f409;
                if (runnableC1441 != null) {
                    runnableC1441.m3137(recyclerView, i2, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC2484.m4445(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        C1790 c1792 = recyclerView.f369.f7945;
        if (c1792 != null && c1792.f5955) {
            c1792.m3527(0, 0);
        }
        this.f8002 = false;
        if (!this.f8003) {
            recyclerView.setScrollState(0);
            recyclerView.m260(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field = AbstractC3578.f11184;
            recyclerView.postOnAnimation(this);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4506(int i, int i2) {
        RecyclerView recyclerView = this.f8004;
        recyclerView.setScrollState(2);
        this.f7999 = 0;
        this.f7998 = 0;
        Interpolator interpolator = this.f8001;
        InterpolatorC1680 interpolatorC1680 = RecyclerView.f354;
        if (interpolator != interpolatorC1680) {
            this.f8001 = interpolatorC1680;
            this.f8000 = new OverScroller(recyclerView.getContext(), interpolatorC1680);
        }
        this.f8000.fling(0, 0, i, i2, -2147483648, 2147483647, -2147483648, 2147483647);
        m4507();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4507() {
        if (this.f8002) {
            this.f8003 = true;
            return;
        }
        RecyclerView recyclerView = this.f8004;
        recyclerView.removeCallbacks(this);
        Field field = AbstractC3578.f11184;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4508(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.f8004;
        if (i3 == -2147483648) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.f354;
        }
        if (this.f8001 != interpolator) {
            this.f8001 = interpolator;
            this.f8000 = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f7999 = 0;
        this.f7998 = 0;
        recyclerView.setScrollState(2);
        this.f8000.startScroll(0, 0, i, i2, i4);
        m4507();
    }
}
