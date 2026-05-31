package p000;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲇᛸᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1849 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final int f6158 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0323 f6159;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AccelerateInterpolator f6160;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC1117 f6161;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public RunnableC0149 f6162;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final float[] f6163;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final float[] f6164;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f6165;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int f6166;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final float[] f6167;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final float[] f6168;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final float[] f6169;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f6170;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f6171;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f6172;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f6173;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f6174;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final AbstractC1117 f6175;

    public ViewOnTouchListenerC1849(AbstractC1117 abstractC1117) {
        C0323 c0323 = new C0323();
        c0323.f1620 = Long.MIN_VALUE;
        c0323.f1622 = -1L;
        c0323.f1621 = 0L;
        this.f6159 = c0323;
        this.f6160 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f6163 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6164 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f6167 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f6168 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6169 = fArr5;
        this.f6161 = abstractC1117;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f6165 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f6166 = f6158;
        c0323.f1616 = 500;
        c0323.f1617 = 500;
        this.f6175 = abstractC1117;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static float m3755(float f, float f2, float f3) {
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
        if (this.f6174) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = 2;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m3758();
                return false;
            }
            this.f6172 = true;
            this.f6170 = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            AbstractC1117 abstractC1117 = this.f6161;
            float fM3756 = m3756(0, x, width, abstractC1117.getWidth());
            float fM3757 = m3756(1, motionEvent.getY(), view.getHeight(), abstractC1117.getHeight());
            C0323 c0323 = this.f6159;
            c0323.f1618 = fM3756;
            c0323.f1619 = fM3757;
            if (!this.f6173 && m3759()) {
                if (this.f6162 == null) {
                    this.f6162 = new RunnableC0149(this, i2);
                }
                this.f6173 = true;
                this.f6171 = true;
                if (this.f6170 || (i = this.f6166) <= 0) {
                    this.f6162.run();
                } else {
                    RunnableC0149 runnableC0149 = this.f6162;
                    long j = i;
                    Field field = AbstractC3638.f11333;
                    abstractC1117.postOnAnimationDelayed(runnableC0149, j);
                }
                this.f6170 = true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final float m3756(int i, float f, float f2, float f3) {
        float fM3755;
        float interpolation;
        float fM3756 = m3755(this.f6163[i] * f2, 0.0f, this.f6164[i]);
        float fM3757 = m3757(f2 - f, fM3756) - m3757(f, fM3756);
        AccelerateInterpolator accelerateInterpolator = this.f6160;
        if (fM3757 >= 0.0f) {
            if (fM3757 > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM3757);
            } else {
                fM3755 = 0.0f;
            }
            if (fM3755 == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f6167[i];
            float f5 = this.f6168[i];
            float f6 = this.f6169[i];
            float f7 = f4 * f3;
            return fM3755 > 0.0f ? m3755(fM3755 * f7, f5, f6) : -m3755((-fM3755) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM3757);
        fM3755 = m3755(interpolation, -1.0f, 1.0f);
        if (fM3755 == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f6167[i];
        float f9 = this.f6168[i];
        float f10 = this.f6169[i];
        float f11 = f8 * f3;
        if (fM3755 > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final float m3757(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f6165;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f6173 && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3758() {
        int i = 0;
        if (this.f6171) {
            this.f6173 = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C0323 c0323 = this.f6159;
        int i2 = (int) (jCurrentAnimationTimeMillis - c0323.f1620);
        int i3 = c0323.f1617;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0323.f1624 = i;
        c0323.f1623 = c0323.m1552(jCurrentAnimationTimeMillis);
        c0323.f1622 = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean m3759() {
        AbstractC1117 abstractC1117;
        int count;
        C0323 c0323 = this.f6159;
        float f = c0323.f1619;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c0323.f1618);
        if (iAbs != 0 && (count = (abstractC1117 = this.f6175).getCount()) != 0) {
            int childCount = abstractC1117.getChildCount();
            int firstVisiblePosition = abstractC1117.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && abstractC1117.getChildAt(0).getTop() >= 0)) : !(i >= count && abstractC1117.getChildAt(childCount - 1).getBottom() <= abstractC1117.getHeight())) {
                return true;
            }
        }
        return false;
    }
}
