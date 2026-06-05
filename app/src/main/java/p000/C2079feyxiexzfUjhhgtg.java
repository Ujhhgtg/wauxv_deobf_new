package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能要点脸ᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2079feyxiexzfUjhhgtg extends LinearLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final /* synthetic */ int f6823Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public ValueAnimator f6824Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ C1981Ujhhgtgfeyxiexzf f6825Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2079feyxiexzfUjhhgtg(C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf, Context context) {
        super(context);
        this.f6825Ujhhgtgfeyxiexzf = c1981Ujhhgtgfeyxiexzf;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = this.f6825Ujhhgtgfeyxiexzf;
        int iHeight = c1981Ujhhgtgfeyxiexzf.f6519Ujhhgtgfeyxiexzf.getBounds().height();
        if (iHeight < 0) {
            iHeight = c1981Ujhhgtgfeyxiexzf.f6519Ujhhgtgfeyxiexzf.getIntrinsicHeight();
        }
        int i = c1981Ujhhgtgfeyxiexzf.f6532feyxiexzfUjhhgtg;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (c1981Ujhhgtgfeyxiexzf.f6519Ujhhgtgfeyxiexzf.getBounds().width() > 0) {
            Rect bounds = c1981Ujhhgtgfeyxiexzf.f6519Ujhhgtgfeyxiexzf.getBounds();
            c1981Ujhhgtgfeyxiexzf.f6519Ujhhgtgfeyxiexzf.setBounds(bounds.left, height, bounds.right, iHeight);
            c1981Ujhhgtgfeyxiexzf.f6519Ujhhgtgfeyxiexzf.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f6824Ujhhgtgfeyxiexzf;
        C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = this.f6825Ujhhgtgfeyxiexzf;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            m3383Ujhhgtgfeyxiexzf(c1981Ujhhgtgfeyxiexzf.getSelectedTabPosition(), -1, false);
            return;
        }
        if (c1981Ujhhgtgfeyxiexzf.f6505Ujhhgtgfeyxiexzf == -1) {
            c1981Ujhhgtgfeyxiexzf.f6505Ujhhgtgfeyxiexzf = c1981Ujhhgtgfeyxiexzf.getSelectedTabPosition();
        }
        m3380Ujhhgtgfeyxiexzf(c1981Ujhhgtgfeyxiexzf.f6505Ujhhgtgfeyxiexzf);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = this.f6825Ujhhgtgfeyxiexzf;
        boolean z = true;
        if (c1981Ujhhgtgfeyxiexzf.f6530feyxiexzfUjhhgtg == 1 || c1981Ujhhgtgfeyxiexzf.f6533feyxiexzfUjhhgtg == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) AbstractC1937feyxiexzfUjhhgtg.m3278Ujhhgtgfeyxiexzf(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                c1981Ujhhgtgfeyxiexzf.f6530feyxiexzfUjhhgtg = 0;
                c1981Ujhhgtgfeyxiexzf.m3329Ujhhgtgfeyxiexzf(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3380Ujhhgtgfeyxiexzf(int i) {
        C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = this.f6825Ujhhgtgfeyxiexzf;
        c1981Ujhhgtgfeyxiexzf.getClass();
        View childAt = getChildAt(i);
        C0420Ujhhgtgfeyxiexzf c0420Ujhhgtgfeyxiexzf = c1981Ujhhgtgfeyxiexzf.f6539feyxiexzfUjhhgtg;
        Drawable drawable = c1981Ujhhgtgfeyxiexzf.f6519Ujhhgtgfeyxiexzf;
        c0420Ujhhgtgfeyxiexzf.getClass();
        RectF rectFM1732Ujhhgtgfeyxiexzf = C0420Ujhhgtgfeyxiexzf.m1732Ujhhgtgfeyxiexzf(c1981Ujhhgtgfeyxiexzf, childAt);
        drawable.setBounds((int) rectFM1732Ujhhgtgfeyxiexzf.left, drawable.getBounds().top, (int) rectFM1732Ujhhgtgfeyxiexzf.right, drawable.getBounds().bottom);
        c1981Ujhhgtgfeyxiexzf.f6505Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3381Ujhhgtgfeyxiexzf(int i) {
        C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = this.f6825Ujhhgtgfeyxiexzf;
        Rect bounds = c1981Ujhhgtgfeyxiexzf.f6519Ujhhgtgfeyxiexzf.getBounds();
        c1981Ujhhgtgfeyxiexzf.f6519Ujhhgtgfeyxiexzf.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3382Ujhhgtgfeyxiexzf(View view, View view2, float f) {
        C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = this.f6825Ujhhgtgfeyxiexzf;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = c1981Ujhhgtgfeyxiexzf.f6519Ujhhgtgfeyxiexzf;
            drawable.setBounds(-1, drawable.getBounds().top, -1, c1981Ujhhgtgfeyxiexzf.f6519Ujhhgtgfeyxiexzf.getBounds().bottom);
        } else {
            c1981Ujhhgtgfeyxiexzf.f6539feyxiexzfUjhhgtg.mo1744Ujhhgtgfeyxiexzf(c1981Ujhhgtgfeyxiexzf, view, view2, f, c1981Ujhhgtgfeyxiexzf.f6519Ujhhgtgfeyxiexzf);
        }
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m3383Ujhhgtgfeyxiexzf(int i, int i2, boolean z) {
        C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = this.f6825Ujhhgtgfeyxiexzf;
        if (c1981Ujhhgtgfeyxiexzf.f6505Ujhhgtgfeyxiexzf == i) {
            return;
        }
        View childAt = getChildAt(c1981Ujhhgtgfeyxiexzf.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            m3380Ujhhgtgfeyxiexzf(c1981Ujhhgtgfeyxiexzf.getSelectedTabPosition());
            return;
        }
        c1981Ujhhgtgfeyxiexzf.f6505Ujhhgtgfeyxiexzf = i;
        C2078feyxiexzfUjhhgtg c2078feyxiexzfUjhhgtg = new C2078feyxiexzfUjhhgtg(this, childAt, childAt2);
        if (!z) {
            this.f6824Ujhhgtgfeyxiexzf.removeAllUpdateListeners();
            this.f6824Ujhhgtgfeyxiexzf.addUpdateListener(c2078feyxiexzfUjhhgtg);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f6824Ujhhgtgfeyxiexzf = valueAnimator;
        valueAnimator.setInterpolator(c1981Ujhhgtgfeyxiexzf.f6540feyxiexzfUjhhgtg);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(c2078feyxiexzfUjhhgtg);
        valueAnimator.start();
    }
}
