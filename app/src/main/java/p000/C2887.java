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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᤝᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2887 extends LinearLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f9241 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ValueAnimator f9242;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C2891 f9243;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2887(C2891 c2891, Context context) {
        super(context);
        this.f9243 = c2891;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        C2891 c2891 = this.f9243;
        int iHeight = c2891.f9280.getBounds().height();
        if (iHeight < 0) {
            iHeight = c2891.f9280.getIntrinsicHeight();
        }
        int i = c2891.f9293;
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
        if (c2891.f9280.getBounds().width() > 0) {
            Rect bounds = c2891.f9280.getBounds();
            c2891.f9280.setBounds(bounds.left, height, bounds.right, iHeight);
            c2891.f9280.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f9242;
        C2891 c2891 = this.f9243;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            m4880(c2891.getSelectedTabPosition(), -1, false);
            return;
        }
        if (c2891.f9266 == -1) {
            c2891.f9266 = c2891.getSelectedTabPosition();
        }
        m4877(c2891.f9266);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        C2891 c2891 = this.f9243;
        boolean z = true;
        if (c2891.f9291 == 1 || c2891.f9294 == 2) {
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
            if (iMax * childCount <= getMeasuredWidth() - (((int) AbstractC1459.m3180(getContext(), 16)) * 2)) {
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
                c2891.f9291 = 0;
                c2891.m4898(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4877(int i) {
        C2891 c2891 = this.f9243;
        c2891.getClass();
        View childAt = getChildAt(i);
        C2102 c2102 = c2891.f9300;
        Drawable drawable = c2891.f9280;
        c2102.getClass();
        RectF rectFM3894 = C2102.m3894(c2891, childAt);
        drawable.setBounds((int) rectFM3894.left, drawable.getBounds().top, (int) rectFM3894.right, drawable.getBounds().bottom);
        c2891.f9266 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4878(int i) {
        C2891 c2891 = this.f9243;
        Rect bounds = c2891.f9280.getBounds();
        c2891.f9280.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4879(View view, View view2, float f) {
        C2891 c2891 = this.f9243;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = c2891.f9280;
            drawable.setBounds(-1, drawable.getBounds().top, -1, c2891.f9280.getBounds().bottom);
        } else {
            c2891.f9300.mo2732(c2891, view, view2, f, c2891.f9280);
        }
        Field field = AbstractC3578.f11184;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4880(int i, int i2, boolean z) {
        C2891 c2891 = this.f9243;
        if (c2891.f9266 == i) {
            return;
        }
        View childAt = getChildAt(c2891.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            m4877(c2891.getSelectedTabPosition());
            return;
        }
        c2891.f9266 = i;
        C2886 c2886 = new C2886(this, childAt, childAt2);
        if (!z) {
            this.f9242.removeAllUpdateListeners();
            this.f9242.addUpdateListener(c2886);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f9242 = valueAnimator;
        valueAnimator.setInterpolator(c2891.f9301);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(c2886);
        valueAnimator.start();
    }
}
