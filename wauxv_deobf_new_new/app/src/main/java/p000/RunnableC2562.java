package p000;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᤝᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2562 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f8149;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f8150;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public OverScroller f8151;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Interpolator f8152;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f8153;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f8154;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f8155;

    public RunnableC2562(RecyclerView recyclerView) {
        this.f8155 = recyclerView;
        InterpolatorC1697 interpolatorC1697 = RecyclerView.f354;
        this.f8152 = interpolatorC1697;
        this.f8153 = false;
        this.f8154 = false;
        this.f8151 = new OverScroller(recyclerView.getContext(), interpolatorC1697);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.f8155;
        int[] iArr = recyclerView.f423;
        if (recyclerView.f369 == null) {
            recyclerView.removeCallbacks(this);
            this.f8151.abortAnimation();
            return;
        }
        this.f8154 = false;
        this.f8153 = true;
        recyclerView.m210();
        OverScroller overScroller = this.f8151;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f8149;
            int i7 = currY - this.f8150;
            this.f8149 = currX;
            this.f8150 = currY;
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
                C1813 c1813 = recyclerView.f369.f8096;
                if (c1813 != null && !c1813.f6011 && c1813.f6012) {
                    int iM4527 = recyclerView.f411.m4527();
                    if (iM4527 == 0) {
                        c1813.m3700();
                    } else if (c1813.f6008 >= iM4527) {
                        c1813.f6008 = iM4527 - 1;
                        c1813.m3699(i2, i8);
                    } else {
                        c1813.m3699(i2, i8);
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
            C1813 c1814 = recyclerView.f369.f8096;
            if ((c1814 == null || !c1814.f6011) && z) {
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
                if (RecyclerView.f352) {
                    C1447 c1447 = recyclerView.f410;
                    int[] iArr4 = c1447.f5126;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c1447.f5127 = 0;
                }
            } else {
                m4529();
                RunnableC1449 runnableC1449 = recyclerView.f409;
                if (runnableC1449 != null) {
                    runnableC1449.m3244(recyclerView, i2, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC2539.m4467(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        C1813 c1815 = recyclerView.f369.f8096;
        if (c1815 != null && c1815.f6011) {
            c1815.m3699(0, 0);
        }
        this.f8153 = false;
        if (!this.f8154) {
            recyclerView.setScrollState(0);
            recyclerView.m260(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field = AbstractC3638.f11333;
            recyclerView.postOnAnimation(this);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4528(int i, int i2) {
        RecyclerView recyclerView = this.f8155;
        recyclerView.setScrollState(2);
        this.f8150 = 0;
        this.f8149 = 0;
        Interpolator interpolator = this.f8152;
        InterpolatorC1697 interpolatorC1697 = RecyclerView.f354;
        if (interpolator != interpolatorC1697) {
            this.f8152 = interpolatorC1697;
            this.f8151 = new OverScroller(recyclerView.getContext(), interpolatorC1697);
        }
        this.f8151.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m4529();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4529() {
        if (this.f8153) {
            this.f8154 = true;
            return;
        }
        RecyclerView recyclerView = this.f8155;
        recyclerView.removeCallbacks(this);
        Field field = AbstractC3638.f11333;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4530(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.f8155;
        if (i3 == Integer.MIN_VALUE) {
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
        if (this.f8152 != interpolator) {
            this.f8152 = interpolator;
            this.f8151 = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f8150 = 0;
        this.f8149 = 0;
        recyclerView.setScrollState(2);
        this.f8151.startScroll(0, 0, i, i2, i4);
        m4529();
    }
}
