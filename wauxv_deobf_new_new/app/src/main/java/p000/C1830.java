package p000;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᛸᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1830 extends FrameLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public InterfaceC1433 f6086;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f6087;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6088;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ArrayList f6089;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final GradientDrawable f6090;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final GradientDrawable f6091;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f6092;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f6093;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f6094;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public float f6095;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public ValueAnimator f6096;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public ValueAnimator f6097;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C1826 f6098;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final FrameLayout f6099;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final View f6100;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final LinearLayout f6101;

    public C1830(Activity activity) {
        super(activity, null);
        this.f6089 = new ArrayList();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        this.f6090 = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        this.f6091 = gradientDrawable2;
        this.f6093 = -1.0f;
        this.f6094 = -1;
        C1826 c1826 = new C1826(this, activity);
        c1826.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f6098 = c1826;
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setPadding(m3726(2.0f), m3726(2.0f), m3726(2.0f), m3726(2.0f));
        frameLayout.setClipToPadding(true);
        frameLayout.setClipChildren(true);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new C1829());
        this.f6099 = frameLayout;
        View view = new View(activity);
        view.setBackground(gradientDrawable2);
        this.f6100 = view;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f6101 = linearLayout;
        setPadding(m3726(36.0f), 0, m3726(36.0f), 0);
        m3730();
        addView(frameLayout);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -1);
        layoutParams2.topMargin = m3726(4.0f);
        layoutParams2.bottomMargin = m3726(4.0f);
        frameLayout.addView(view, layoutParams2);
        frameLayout.addView(c1826);
        frameLayout.addView(linearLayout);
        if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1828(this, 1));
        } else {
            m3723(this);
            m3729(false);
        }
    }

    private final int getAccentColor() {
        return Color.parseColor(MagicFactory.get(m3728() ? -520361057712771L : -520395417451139L, AbstractC1471.f5234));
    }

    private final int getInactiveColor() {
        return Color.parseColor(MagicFactory.get(m3728() ? -520429777189507L : -520464136927875L, AbstractC1471.f5234));
    }

    private final void setPressProgress(float f) {
        float fM5327 = AbstractC3744.m5327(f, 0.0f, 1.0f);
        if (this.f6095 == fM5327) {
            return;
        }
        this.f6095 = fM5327;
        m3725();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m3722(C1830 c1830, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        "null cannot be cast to non-null type kotlin.Float";
        c1830.setPressProgress(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final void m3723(C1830 c1830) {
        int height;
        GradientDrawable gradientDrawable = c1830.f6090;
        FrameLayout frameLayout = c1830.f6099;
        gradientDrawable.setCornerRadius(frameLayout.getHeight() / 2.0f);
        int height2 = c1830.f6100.getHeight();
        Integer numValueOf = Integer.valueOf(height2);
        if (height2 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            height = numValueOf.intValue();
        } else {
            height = frameLayout.getHeight() - c1830.m3726(8.0f);
            if (height < 0) {
                height = 0;
            }
        }
        c1830.f6091.setCornerRadius(height / 2.0f);
    }

    public final InterfaceC1433 getOnTabSelected() {
        return this.f6086;
    }

    public final int getSelectedTabIndex() {
        return this.f6087;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3730();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f6096;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f6097;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        super.onDetachedFromWindow();
    }

    public final void setOnTabSelected(InterfaceC1433 interfaceC1433) {
        this.f6086 = interfaceC1433;
    }

    public final void setSelectedTabIndex(int i) {
        int i2 = this.f6088;
        int iM5328 = i2 <= 0 ? 0 : AbstractC3744.m5328(i, i2 - 1);
        if (this.f6087 == iM5328 || this.f6088 == 0) {
            return;
        }
        this.f6087 = iM5328;
        m3732();
        m3729(true);
        InterfaceC1433 interfaceC1433 = this.f6086;
        if (interfaceC1433 != null) {
            interfaceC1433.invoke(Integer.valueOf(iM5328));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3724(float f) {
        ValueAnimator valueAnimator = this.f6096;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f6095, f);
        valueAnimatorOfFloat.setDuration(f > this.f6095 ? 160L : 220L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C1823(this, i));
        valueAnimatorOfFloat.start();
        this.f6096 = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3725() {
        m3731();
        int i = 0;
        for (Object obj : this.f6089) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            C1827 c1827 = (C1827) obj;
            float f = i == this.f6094 ? this.f6095 : 0.0f;
            LinearLayout linearLayout = c1827.f6079;
            ImageView imageView = c1827.f6080;
            linearLayout.setScaleX(1.0f);
            c1827.f6079.setScaleY(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            c1827.f6081.setTranslationY((-m3727(0.5f)) * f);
            i = i2;
        }
        this.f6098.invalidate();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m3726(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final float m3727(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean m3728() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m3729(boolean z) {
        View childAt;
        int width;
        if (this.f6088 != 0) {
            LinearLayout linearLayout = this.f6101;
            if (linearLayout.getWidth() == 0 || (childAt = linearLayout.getChildAt(this.f6087)) == null || (width = childAt.getWidth()) <= 0) {
                return;
            }
            int iM3726 = m3726(4.0f);
            View view = this.f6100;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams";
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i = width - (iM3726 * 2);
            if (i < 0) {
                i = 0;
            }
            layoutParams2.width = i;
            view.setLayoutParams(layoutParams2);
            float left = childAt.getLeft() + iM3726;
            if (!z) {
                ValueAnimator valueAnimator = this.f6097;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f6092 = left;
                m3731();
                return;
            }
            ValueAnimator valueAnimator2 = this.f6097;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f6092, left);
            valueAnimatorOfFloat.setDuration(220L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new C1823(this, 1));
            valueAnimatorOfFloat.start();
            this.f6097 = valueAnimatorOfFloat;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3730() {
        String[] strArr = AbstractC1471.f5234;
        this.f6090.setColor(0);
        int color = Color.parseColor(MagicFactory.get(m3728() ? -520872158820995L : -520915108493955L, strArr));
        GradientDrawable gradientDrawable = this.f6091;
        gradientDrawable.setColor(color);
        gradientDrawable.setStroke(m3726(1.0f), Color.parseColor(MagicFactory.get(m3728() ? -520958058166915L : -521001007839875L, strArr)));
        m3731();
        this.f6098.invalidate();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m3731() {
        View view = this.f6100;
        float width = view.getWidth();
        if (width <= 0.0f) {
            view.setTranslationX(this.f6092);
            return;
        }
        float width2 = this.f6099.getWidth();
        float f = width / 2.0f;
        float f2 = this.f6092 + f;
        float f3 = this.f6093;
        float fM5327 = f3 >= 0.0f ? AbstractC3744.m5327((f3 - f2) / width, -1.0f, 1.0f) : 0.0f;
        float fM3727 = m3727(4.0f);
        float f4 = this.f6092;
        float f5 = 0.35f;
        if ((f4 > fM3727 || fM5327 >= 0.0f) && (f4 + width < width2 - fM3727 || fM5327 <= 0.0f)) {
            f5 = 1.0f;
        }
        float fAbs = ((Math.abs(fM5327) * (m3728() ? 0.11f : 0.16f) * f5) + (m3728() ? 0.045f : 0.065f)) * this.f6095;
        float fM3728 = (m3727(m3728() ? 7.0f : 10.0f) * fM5327 * this.f6095 * f5) + this.f6092;
        float f6 = (width2 - width) - fM3727;
        if (f6 < fM3727) {
            f6 = fM3727;
        }
        view.setPivotX(f);
        view.setPivotY(view.getHeight() / 2.0f);
        view.setTranslationX(AbstractC3744.m5327(fM3728, fM3727, f6));
        view.setTranslationY(0.0f);
        view.setScaleX(fAbs + 1.0f);
        view.setScaleY(1.0f - (this.f6095 * 0.015f));
        view.setAlpha((0.07999998f * this.f6095) + 0.92f);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m3732() {
        int i = 0;
        for (Object obj : this.f6089) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            C1827 c1827 = (C1827) obj;
            int i3 = this.f6087;
            boolean z = i == i3;
            int accentColor = i == i3 ? getAccentColor() : getInactiveColor();
            c1827.f6080.setImageResource(z ? c1827.f6082 : c1827.f6083);
            c1827.f6080.setColorFilter(accentColor);
            c1827.f6081.setTextColor(accentColor);
            c1827.f6079.setAlpha(1.0f);
            i = i2;
        }
    }
}
