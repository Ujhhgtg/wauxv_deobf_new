package p000;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳ能不能ᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0818feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f3231Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f3232Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public OverScroller f3233Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Interpolator f3234Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f3235Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public boolean f3236Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f3237Ujhhgtgfeyxiexzf;

    public RunnableC0818feyxiexzfUjhhgtg(RecyclerView recyclerView) {
        this.f3237Ujhhgtgfeyxiexzf = recyclerView;
        InterpolatorC0700Ujhhgtgfeyxiexzf interpolatorC0700Ujhhgtgfeyxiexzf = RecyclerView.f355Ujhhgtgfeyxiexzf;
        this.f3234Ujhhgtgfeyxiexzf = interpolatorC0700Ujhhgtgfeyxiexzf;
        this.f3235Ujhhgtgfeyxiexzf = false;
        this.f3236Ujhhgtgfeyxiexzf = false;
        this.f3233Ujhhgtgfeyxiexzf = new OverScroller(recyclerView.getContext(), interpolatorC0700Ujhhgtgfeyxiexzf);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.f3237Ujhhgtgfeyxiexzf;
        int[] iArr = recyclerView.f424feyxiexzfUjhhgtg;
        if (recyclerView.f370Ujhhgtgfeyxiexzf == null) {
            recyclerView.removeCallbacks(this);
            this.f3233Ujhhgtgfeyxiexzf.abortAnimation();
            return;
        }
        this.f3236Ujhhgtgfeyxiexzf = false;
        this.f3235Ujhhgtgfeyxiexzf = true;
        recyclerView.m210Ujhhgtgfeyxiexzf();
        OverScroller overScroller = this.f3233Ujhhgtgfeyxiexzf;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f3231Ujhhgtgfeyxiexzf;
            int i7 = currY - this.f3232Ujhhgtgfeyxiexzf;
            this.f3231Ujhhgtgfeyxiexzf = currX;
            this.f3232Ujhhgtgfeyxiexzf = currY;
            int iM202Ujhhgtgfeyxiexzf = RecyclerView.m202Ujhhgtgfeyxiexzf(i6, recyclerView.f391feyxiexzfUjhhgtg, recyclerView.f393feyxiexzfUjhhgtg, recyclerView.getWidth());
            int iM202Ujhhgtgfeyxiexzf2 = RecyclerView.m202Ujhhgtgfeyxiexzf(i7, recyclerView.f392feyxiexzfUjhhgtg, recyclerView.f394feyxiexzfUjhhgtg, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f424feyxiexzfUjhhgtg;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.m216Ujhhgtgfeyxiexzf(iArr2, iM202Ujhhgtgfeyxiexzf, iM202Ujhhgtgfeyxiexzf2, 1, null)) {
                iM202Ujhhgtgfeyxiexzf -= iArr[0];
                iM202Ujhhgtgfeyxiexzf2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m209Ujhhgtgfeyxiexzf(iM202Ujhhgtgfeyxiexzf, iM202Ujhhgtgfeyxiexzf2);
            }
            if (recyclerView.f369Ujhhgtgfeyxiexzf != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.m252feyxiexzfUjhhgtg(iM202Ujhhgtgfeyxiexzf, iM202Ujhhgtgfeyxiexzf2, iArr);
                i2 = iArr[0];
                int i8 = iArr[1];
                int i9 = iM202Ujhhgtgfeyxiexzf - i2;
                int i10 = iM202Ujhhgtgfeyxiexzf2 - i8;
                C0069Ujhhgtgfeyxiexzf c0069Ujhhgtgfeyxiexzf = recyclerView.f370Ujhhgtgfeyxiexzf.f3264Ujhhgtgfeyxiexzf;
                if (c0069Ujhhgtgfeyxiexzf != null && !c0069Ujhhgtgfeyxiexzf.f1091Ujhhgtgfeyxiexzf && c0069Ujhhgtgfeyxiexzf.f1092Ujhhgtgfeyxiexzf) {
                    int iM2158Ujhhgtgfeyxiexzf = recyclerView.f412feyxiexzfUjhhgtg.m2158Ujhhgtgfeyxiexzf();
                    if (iM2158Ujhhgtgfeyxiexzf == 0) {
                        c0069Ujhhgtgfeyxiexzf.m1085Ujhhgtgfeyxiexzf();
                    } else if (c0069Ujhhgtgfeyxiexzf.f1088Ujhhgtgfeyxiexzf >= iM2158Ujhhgtgfeyxiexzf) {
                        c0069Ujhhgtgfeyxiexzf.f1088Ujhhgtgfeyxiexzf = iM2158Ujhhgtgfeyxiexzf - 1;
                        c0069Ujhhgtgfeyxiexzf.m1084Ujhhgtgfeyxiexzf(i2, i8);
                    } else {
                        c0069Ujhhgtgfeyxiexzf.m1084Ujhhgtgfeyxiexzf(i2, i8);
                    }
                }
                i3 = i9;
                i4 = i8;
                i = i10;
            } else {
                i = iM202Ujhhgtgfeyxiexzf2;
                i2 = 0;
                i3 = iM202Ujhhgtgfeyxiexzf;
                i4 = 0;
            }
            if (!recyclerView.f372Ujhhgtgfeyxiexzf.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f424feyxiexzfUjhhgtg;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m217Ujhhgtgfeyxiexzf(i2, i4, i3, i, null, 1, iArr3);
            int i11 = i3 - iArr[0];
            int i12 = i - iArr[1];
            if (i2 != 0 || i4 != 0) {
                recyclerView.m218Ujhhgtgfeyxiexzf(i2, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            C0069Ujhhgtgfeyxiexzf c0069Ujhhgtgfeyxiexzf2 = recyclerView.f370Ujhhgtgfeyxiexzf.f3264Ujhhgtgfeyxiexzf;
            if ((c0069Ujhhgtgfeyxiexzf2 == null || !c0069Ujhhgtgfeyxiexzf2.f1091Ujhhgtgfeyxiexzf) && z) {
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
                        recyclerView.m220Ujhhgtgfeyxiexzf();
                        if (recyclerView.f391feyxiexzfUjhhgtg.isFinished()) {
                            recyclerView.f391feyxiexzfUjhhgtg.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.m221feyxiexzfUjhhgtg();
                        if (recyclerView.f393feyxiexzfUjhhgtg.isFinished()) {
                            recyclerView.f393feyxiexzfUjhhgtg.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m222feyxiexzfUjhhgtg();
                        if (recyclerView.f392feyxiexzfUjhhgtg.isFinished()) {
                            recyclerView.f392feyxiexzfUjhhgtg.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m219Ujhhgtgfeyxiexzf();
                        if (recyclerView.f394feyxiexzfUjhhgtg.isFinished()) {
                            recyclerView.f394feyxiexzfUjhhgtg.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f353feyxiexzfUjhhgtg) {
                    C3570Ujhhgtgfeyxiexzf c3570Ujhhgtgfeyxiexzf = recyclerView.f411feyxiexzfUjhhgtg;
                    int[] iArr4 = c3570Ujhhgtgfeyxiexzf.f11093Ujhhgtgfeyxiexzf;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c3570Ujhhgtgfeyxiexzf.f11094Ujhhgtgfeyxiexzf = 0;
                }
            } else {
                m2162Ujhhgtgfeyxiexzf();
                RunnableC3565Ujhhgtgfeyxiexzf runnableC3565Ujhhgtgfeyxiexzf = recyclerView.f410feyxiexzfUjhhgtg;
                if (runnableC3565Ujhhgtgfeyxiexzf != null) {
                    runnableC3565Ujhhgtgfeyxiexzf.m5103Ujhhgtgfeyxiexzf(recyclerView, i2, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC0797feyxiexzfUjhhgtg.m2144Ujhhgtgfeyxiexzf(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        C0069Ujhhgtgfeyxiexzf c0069Ujhhgtgfeyxiexzf3 = recyclerView.f370Ujhhgtgfeyxiexzf.f3264Ujhhgtgfeyxiexzf;
        if (c0069Ujhhgtgfeyxiexzf3 != null && c0069Ujhhgtgfeyxiexzf3.f1091Ujhhgtgfeyxiexzf) {
            c0069Ujhhgtgfeyxiexzf3.m1084Ujhhgtgfeyxiexzf(0, 0);
        }
        this.f3235Ujhhgtgfeyxiexzf = false;
        if (!this.f3236Ujhhgtgfeyxiexzf) {
            recyclerView.setScrollState(0);
            recyclerView.m260feyxiexzfUjhhgtg(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            recyclerView.postOnAnimation(this);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2161Ujhhgtgfeyxiexzf(int i, int i2) {
        RecyclerView recyclerView = this.f3237Ujhhgtgfeyxiexzf;
        recyclerView.setScrollState(2);
        this.f3232Ujhhgtgfeyxiexzf = 0;
        this.f3231Ujhhgtgfeyxiexzf = 0;
        Interpolator interpolator = this.f3234Ujhhgtgfeyxiexzf;
        InterpolatorC0700Ujhhgtgfeyxiexzf interpolatorC0700Ujhhgtgfeyxiexzf = RecyclerView.f355Ujhhgtgfeyxiexzf;
        if (interpolator != interpolatorC0700Ujhhgtgfeyxiexzf) {
            this.f3234Ujhhgtgfeyxiexzf = interpolatorC0700Ujhhgtgfeyxiexzf;
            this.f3233Ujhhgtgfeyxiexzf = new OverScroller(recyclerView.getContext(), interpolatorC0700Ujhhgtgfeyxiexzf);
        }
        this.f3233Ujhhgtgfeyxiexzf.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m2162Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2162Ujhhgtgfeyxiexzf() {
        if (this.f3235Ujhhgtgfeyxiexzf) {
            this.f3236Ujhhgtgfeyxiexzf = true;
            return;
        }
        RecyclerView recyclerView = this.f3237Ujhhgtgfeyxiexzf;
        recyclerView.removeCallbacks(this);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m2163Ujhhgtgfeyxiexzf(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.f3237Ujhhgtgfeyxiexzf;
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
            interpolator = RecyclerView.f355Ujhhgtgfeyxiexzf;
        }
        if (this.f3234Ujhhgtgfeyxiexzf != interpolator) {
            this.f3234Ujhhgtgfeyxiexzf = interpolator;
            this.f3233Ujhhgtgfeyxiexzf = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f3232Ujhhgtgfeyxiexzf = 0;
        this.f3231Ujhhgtgfeyxiexzf = 0;
        recyclerView.setScrollState(2);
        this.f3233Ujhhgtgfeyxiexzf.startScroll(0, 0, i, i2, i4);
        m2162Ujhhgtgfeyxiexzf();
    }
}
