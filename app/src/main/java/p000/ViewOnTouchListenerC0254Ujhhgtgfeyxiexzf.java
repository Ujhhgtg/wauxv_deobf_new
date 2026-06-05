package p000;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ能不能要点脸ᛱfeyxiexzfᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0254Ujhhgtgfeyxiexzf implements View.OnTouchListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static final int f1609Ujhhgtgfeyxiexzf = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2441feyxiexzfUjhhgtg f1610Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final AccelerateInterpolator f1611Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final AbstractC3231feyxiexzfUjhhgtg f1612Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public RunnableC3012feyxiexzfUjhhgtg f1613Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final float[] f1614Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final float[] f1615Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int f1616Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f1617Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final float[] f1618Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final float[] f1619Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final float[] f1620Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public boolean f1621Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f1622Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f1623Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f1624Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f1625Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final AbstractC3231feyxiexzfUjhhgtg f1626Ujhhgtgfeyxiexzf;

    public ViewOnTouchListenerC0254Ujhhgtgfeyxiexzf(AbstractC3231feyxiexzfUjhhgtg abstractC3231feyxiexzfUjhhgtg) {
        C2441feyxiexzfUjhhgtg c2441feyxiexzfUjhhgtg = new C2441feyxiexzfUjhhgtg();
        c2441feyxiexzfUjhhgtg.f7899Ujhhgtgfeyxiexzf = Long.MIN_VALUE;
        c2441feyxiexzfUjhhgtg.f7901Ujhhgtgfeyxiexzf = -1L;
        c2441feyxiexzfUjhhgtg.f7900Ujhhgtgfeyxiexzf = 0L;
        this.f1610Ujhhgtgfeyxiexzf = c2441feyxiexzfUjhhgtg;
        this.f1611Ujhhgtgfeyxiexzf = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1614Ujhhgtgfeyxiexzf = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1615Ujhhgtgfeyxiexzf = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1618Ujhhgtgfeyxiexzf = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1619Ujhhgtgfeyxiexzf = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1620Ujhhgtgfeyxiexzf = fArr5;
        this.f1612Ujhhgtgfeyxiexzf = abstractC3231feyxiexzfUjhhgtg;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f1616Ujhhgtgfeyxiexzf = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1617Ujhhgtgfeyxiexzf = f1609Ujhhgtgfeyxiexzf;
        c2441feyxiexzfUjhhgtg.f7895Ujhhgtgfeyxiexzf = 500;
        c2441feyxiexzfUjhhgtg.f7896Ujhhgtgfeyxiexzf = 500;
        this.f1626Ujhhgtgfeyxiexzf = abstractC3231feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static float m1418Ujhhgtgfeyxiexzf(float f, float f2, float f3) {
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
        if (this.f1625Ujhhgtgfeyxiexzf) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = 2;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m1421Ujhhgtgfeyxiexzf();
                return false;
            }
            this.f1623Ujhhgtgfeyxiexzf = true;
            this.f1621Ujhhgtgfeyxiexzf = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            AbstractC3231feyxiexzfUjhhgtg abstractC3231feyxiexzfUjhhgtg = this.f1612Ujhhgtgfeyxiexzf;
            float fM1419Ujhhgtgfeyxiexzf = m1419Ujhhgtgfeyxiexzf(0, x, width, abstractC3231feyxiexzfUjhhgtg.getWidth());
            float fM1419Ujhhgtgfeyxiexzf2 = m1419Ujhhgtgfeyxiexzf(1, motionEvent.getY(), view.getHeight(), abstractC3231feyxiexzfUjhhgtg.getHeight());
            C2441feyxiexzfUjhhgtg c2441feyxiexzfUjhhgtg = this.f1610Ujhhgtgfeyxiexzf;
            c2441feyxiexzfUjhhgtg.f7897Ujhhgtgfeyxiexzf = fM1419Ujhhgtgfeyxiexzf;
            c2441feyxiexzfUjhhgtg.f7898Ujhhgtgfeyxiexzf = fM1419Ujhhgtgfeyxiexzf2;
            if (!this.f1624Ujhhgtgfeyxiexzf && m1422Ujhhgtgfeyxiexzf()) {
                if (this.f1613Ujhhgtgfeyxiexzf == null) {
                    this.f1613Ujhhgtgfeyxiexzf = new RunnableC3012feyxiexzfUjhhgtg(i2, this);
                }
                this.f1624Ujhhgtgfeyxiexzf = true;
                this.f1622Ujhhgtgfeyxiexzf = true;
                if (this.f1621Ujhhgtgfeyxiexzf || (i = this.f1617Ujhhgtgfeyxiexzf) <= 0) {
                    this.f1613Ujhhgtgfeyxiexzf.run();
                } else {
                    RunnableC3012feyxiexzfUjhhgtg runnableC3012feyxiexzfUjhhgtg = this.f1613Ujhhgtgfeyxiexzf;
                    long j = i;
                    Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                    abstractC3231feyxiexzfUjhhgtg.postOnAnimationDelayed(runnableC3012feyxiexzfUjhhgtg, j);
                }
                this.f1621Ujhhgtgfeyxiexzf = true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final float m1419Ujhhgtgfeyxiexzf(int i, float f, float f2, float f3) {
        float fM1418Ujhhgtgfeyxiexzf;
        float interpolation;
        float fM1418Ujhhgtgfeyxiexzf2 = m1418Ujhhgtgfeyxiexzf(this.f1614Ujhhgtgfeyxiexzf[i] * f2, 0.0f, this.f1615Ujhhgtgfeyxiexzf[i]);
        float fM1420Ujhhgtgfeyxiexzf = m1420Ujhhgtgfeyxiexzf(f2 - f, fM1418Ujhhgtgfeyxiexzf2) - m1420Ujhhgtgfeyxiexzf(f, fM1418Ujhhgtgfeyxiexzf2);
        AccelerateInterpolator accelerateInterpolator = this.f1611Ujhhgtgfeyxiexzf;
        if (fM1420Ujhhgtgfeyxiexzf >= 0.0f) {
            if (fM1420Ujhhgtgfeyxiexzf > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM1420Ujhhgtgfeyxiexzf);
            } else {
                fM1418Ujhhgtgfeyxiexzf = 0.0f;
            }
            if (fM1418Ujhhgtgfeyxiexzf == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f1618Ujhhgtgfeyxiexzf[i];
            float f5 = this.f1619Ujhhgtgfeyxiexzf[i];
            float f6 = this.f1620Ujhhgtgfeyxiexzf[i];
            float f7 = f4 * f3;
            return fM1418Ujhhgtgfeyxiexzf > 0.0f ? m1418Ujhhgtgfeyxiexzf(fM1418Ujhhgtgfeyxiexzf * f7, f5, f6) : -m1418Ujhhgtgfeyxiexzf((-fM1418Ujhhgtgfeyxiexzf) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM1420Ujhhgtgfeyxiexzf);
        fM1418Ujhhgtgfeyxiexzf = m1418Ujhhgtgfeyxiexzf(interpolation, -1.0f, 1.0f);
        if (fM1418Ujhhgtgfeyxiexzf == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f1618Ujhhgtgfeyxiexzf[i];
        float f9 = this.f1619Ujhhgtgfeyxiexzf[i];
        float f10 = this.f1620Ujhhgtgfeyxiexzf[i];
        float f11 = f8 * f3;
        if (fM1418Ujhhgtgfeyxiexzf > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final float m1420Ujhhgtgfeyxiexzf(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f1616Ujhhgtgfeyxiexzf;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f1624Ujhhgtgfeyxiexzf && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1421Ujhhgtgfeyxiexzf() {
        int i = 0;
        if (this.f1622Ujhhgtgfeyxiexzf) {
            this.f1624Ujhhgtgfeyxiexzf = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C2441feyxiexzfUjhhgtg c2441feyxiexzfUjhhgtg = this.f1610Ujhhgtgfeyxiexzf;
        int i2 = (int) (jCurrentAnimationTimeMillis - c2441feyxiexzfUjhhgtg.f7899Ujhhgtgfeyxiexzf);
        int i3 = c2441feyxiexzfUjhhgtg.f7896Ujhhgtgfeyxiexzf;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c2441feyxiexzfUjhhgtg.f7903Ujhhgtgfeyxiexzf = i;
        c2441feyxiexzfUjhhgtg.f7902Ujhhgtgfeyxiexzf = c2441feyxiexzfUjhhgtg.m3681Ujhhgtgfeyxiexzf(jCurrentAnimationTimeMillis);
        c2441feyxiexzfUjhhgtg.f7901Ujhhgtgfeyxiexzf = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean m1422Ujhhgtgfeyxiexzf() {
        AbstractC3231feyxiexzfUjhhgtg abstractC3231feyxiexzfUjhhgtg;
        int count;
        C2441feyxiexzfUjhhgtg c2441feyxiexzfUjhhgtg = this.f1610Ujhhgtgfeyxiexzf;
        float f = c2441feyxiexzfUjhhgtg.f7898Ujhhgtgfeyxiexzf;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c2441feyxiexzfUjhhgtg.f7897Ujhhgtgfeyxiexzf);
        if (iAbs != 0 && (count = (abstractC3231feyxiexzfUjhhgtg = this.f1626Ujhhgtgfeyxiexzf).getCount()) != 0) {
            int childCount = abstractC3231feyxiexzfUjhhgtg.getChildCount();
            int firstVisiblePosition = abstractC3231feyxiexzfUjhhgtg.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && abstractC3231feyxiexzfUjhhgtg.getChildAt(0).getTop() >= 0)) : !(i >= count && abstractC3231feyxiexzfUjhhgtg.getChildAt(childCount - 1).getBottom() <= abstractC3231feyxiexzfUjhhgtg.getHeight())) {
                return true;
            }
        }
        return false;
    }
}
