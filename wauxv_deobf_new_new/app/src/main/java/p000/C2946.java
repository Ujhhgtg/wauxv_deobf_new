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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᲀᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2946 extends LinearLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ int f9408 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public ValueAnimator f9409;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2950 f9410;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2946(C2950 c2950, Context context) {
        super(context);
        this.f9410 = c2950;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        C2950 c2950 = this.f9410;
        int iHeight = c2950.f9447.getBounds().height();
        if (iHeight < 0) {
            iHeight = c2950.f9447.getIntrinsicHeight();
        }
        int i = c2950.f9460;
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
        if (c2950.f9447.getBounds().width() > 0) {
            Rect bounds = c2950.f9447.getBounds();
            c2950.f9447.setBounds(bounds.left, height, bounds.right, iHeight);
            c2950.f9447.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f9409;
        C2950 c2950 = this.f9410;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            m4941(c2950.getSelectedTabPosition(), -1, false);
            return;
        }
        if (c2950.f9433 == -1) {
            c2950.f9433 = c2950.getSelectedTabPosition();
        }
        m4938(c2950.f9433);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        C2950 c2950 = this.f9410;
        boolean z = true;
        if (c2950.f9458 == 1 || c2950.f9461 == 2) {
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
            if (iMax * childCount <= getMeasuredWidth() - (((int) AbstractC1471.m3383(getContext(), 16)) * 2)) {
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
                c2950.f9458 = 0;
                c2950.m4960(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4938(int i) {
        C2950 c2950 = this.f9410;
        c2950.getClass();
        View childAt = getChildAt(i);
        C2135 c2135 = c2950.f9467;
        Drawable drawable = c2950.f9447;
        c2135.getClass();
        RectF rectFM4077 = C2135.m4077(c2950, childAt);
        drawable.setBounds((int) rectFM4077.left, drawable.getBounds().top, (int) rectFM4077.right, drawable.getBounds().bottom);
        c2950.f9433 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4939(int i) {
        C2950 c2950 = this.f9410;
        Rect bounds = c2950.f9447.getBounds();
        c2950.f9447.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4940(View view, View view2, float f) {
        C2950 c2950 = this.f9410;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = c2950.f9447;
            drawable.setBounds(-1, drawable.getBounds().top, -1, c2950.f9447.getBounds().bottom);
        } else {
            c2950.f9467.mo2875(c2950, view, view2, f, c2950.f9447);
        }
        Field field = AbstractC3638.f11333;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4941(int i, int i2, boolean z) {
        C2950 c2950 = this.f9410;
        if (c2950.f9433 == i) {
            return;
        }
        View childAt = getChildAt(c2950.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            m4938(c2950.getSelectedTabPosition());
            return;
        }
        c2950.f9433 = i;
        C2945 c2945 = new C2945(this, childAt, childAt2);
        if (!z) {
            this.f9409.removeAllUpdateListeners();
            this.f9409.addUpdateListener(c2945);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f9409 = valueAnimator;
        valueAnimator.setInterpolator(c2950.f9468);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(c2945);
        valueAnimator.start();
    }
}
