package p000;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1822 implements View.OnTouchListener {

    public static final int f6083 = ViewConfiguration.getTapTimeout();

    public final C0311 f6084;

    public final AccelerateInterpolator f6085;

    public final AbstractC1111 f6086;

    public RunnableC0141 f6087;

    public final float[] f6088;

    public final float[] f6089;

    public final int f6090;

    public final int f6091;

    public final float[] f6092;

    public final float[] f6093;

    public final float[] f6094;

    public boolean f6095;

    public boolean f6096;

    public boolean f6097;

    public boolean f6098;

    public boolean f6099;

    public final AbstractC1111 f6100;

    public ViewOnTouchListenerC1822(AbstractC1111 abstractC1111) {
        C0311 c0311 = new C0311();
        c0311.f1544 = -9223372036854775808L;
        c0311.f1546 = -1L;
        c0311.f1545 = 0L;
        this.f6084 = c0311;
        this.f6085 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f6088 = fArr;
        float[] fArr2 = {3.4028235E38f, 3.4028235E38f};
        this.f6089 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f6092 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f6093 = fArr4;
        float[] fArr5 = {3.4028235E38f, 3.4028235E38f};
        this.f6094 = fArr5;
        this.f6086 = abstractC1111;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f6090 = 1;
        fArr2[0] = 3.4028235E38f;
        fArr2[1] = 3.4028235E38f;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f6091 = f6083;
        c0311.f1540 = 500;
        c0311.f1541 = 500;
        this.f6100 = abstractC1111;
    }

    public static float m3577(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f6099) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = 2;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m3580();
                return false;
            }
            this.f6097 = true;
            this.f6095 = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            AbstractC1111 abstractC1111 = this.f6086;
            float fM3578 = m3578(0, x, width, abstractC1111.getWidth());
            float fM3579 = m3578(1, motionEvent.getY(), view.getHeight(), abstractC1111.getHeight());
            C0311 c0311 = this.f6084;
            c0311.f1542 = fM3578;
            c0311.f1543 = fM3579;
            if (!this.f6098 && m3581()) {
                if (this.f6087 == null) {
                    this.f6087 = new RunnableC0141(2, this);
                }
                this.f6098 = true;
                this.f6096 = true;
                if (this.f6095 || (i = this.f6091) <= 0) {
                    this.f6087.run();
                } else {
                    RunnableC0141 runnableC0141 = this.f6087;
                    long j = i;
                    Field field = AbstractC3578.f11184;
                    abstractC1111.postOnAnimationDelayed(runnableC0141, j);
                }
                this.f6095 = true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float m3578(int i, float f, float f2, float f3) {
        float fM3577;
        float interpolation;
        float fM3578 = m3577(this.f6088[i] * f2, 0.0f, this.f6089[i]);
        float fM3579 = m3579(f2 - f, fM3578) - m3579(f, fM3578);
        AccelerateInterpolator accelerateInterpolator = this.f6085;
        if (fM3579 >= 0.0f) {
            if (fM3579 > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM3579);
            } else {
                fM3577 = 0.0f;
            }
            if (fM3577 == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f6092[i];
            float f5 = this.f6093[i];
            float f6 = this.f6094[i];
            float f7 = f4 * f3;
            return fM3577 > 0.0f ? m3577(fM3577 * f7, f5, f6) : -m3577((-fM3577) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM3579);
        fM3577 = m3577(interpolation, -1.0f, 1.0f);
        if (fM3577 == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f6092[i];
        float f9 = this.f6093[i];
        float f10 = this.f6094[i];
        float f11 = f8 * f3;
        if (fM3577 > 0.0f) {
        }
    }

    public final float m3579(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f6090;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f6098 && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void m3580() {
        int i = 0;
        if (this.f6096) {
            this.f6098 = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C0311 c0311 = this.f6084;
        int i2 = (int) (jCurrentAnimationTimeMillis - c0311.f1544);
        int i3 = c0311.f1541;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0311.f1548 = i;
        c0311.f1547 = c0311.m1406(jCurrentAnimationTimeMillis);
        c0311.f1546 = jCurrentAnimationTimeMillis;
    }

    public final boolean m3581() {
        AbstractC1111 abstractC1111;
        int count;
        C0311 c0311 = this.f6084;
        float f = c0311.f1543;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c0311.f1542);
        if (iAbs != 0 && (count = (abstractC1111 = this.f6100).getCount()) != 0) {
            int childCount = abstractC1111.getChildCount();
            int firstVisiblePosition = abstractC1111.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(false || (firstVisiblePosition <= 0 && abstractC1111.getChildAt(0).getTop() >= 0)) : !(i >= count && abstractC1111.getChildAt(childCount - 1).getBottom() <= abstractC1111.getHeight())) {
                return true;
            }
        }
        return false;
    }
}
