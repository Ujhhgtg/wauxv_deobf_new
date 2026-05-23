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
import android.widget.LinearLayout;
import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᛸᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1803 extends FrameLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public InterfaceC1425 f6018;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6019;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f6020;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final ArrayList f6021;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final GradientDrawable f6022;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final GradientDrawable f6023;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final FrameLayout f6024;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final View f6025;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final LinearLayout f6026;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1803(Activity activity) {
        super(activity, null);
        String[] strArr = AbstractC1574.f5469;
        this.f6021 = new ArrayList();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor(MagicFactory.get(m3552() ? -498190436530868L : -498233386203828L, strArr)));
        this.f6022 = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(436207616);
        this.f6023 = gradientDrawable2;
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setPadding(m3551(2.0f), m3551(2.0f), m3551(2.0f), m3551(2.0f));
        frameLayout.setClipToPadding(true);
        frameLayout.setClipChildren(true);
        frameLayout.setClipToOutline(true);
        this.f6024 = frameLayout;
        View view = new View(activity);
        view.setBackground(gradientDrawable2);
        this.f6025 = view;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f6026 = linearLayout;
        setPadding(m3551(36.0f), 0, m3551(36.0f), 0);
        addView(frameLayout);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -1);
        layoutParams2.topMargin = m3551(4.0f);
        layoutParams2.bottomMargin = m3551(4.0f);
        frameLayout.addView(view, layoutParams2);
        frameLayout.addView(linearLayout);
        if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1802(this, 1));
        } else {
            m3550(this);
            m3553(false);
        }
    }

    private final int getAccentColor() {
        return Color.parseColor(MagicFactory.get(m3552() ? -498276335876788L : -498310695615156L, AbstractC1574.f5469));
    }

    private final int getContentColor() {
        return m3552() ? -1 : -16777216;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final void m3550(C1803 c1803) {
        int height;
        GradientDrawable gradientDrawable = c1803.f6022;
        FrameLayout frameLayout = c1803.f6024;
        gradientDrawable.setCornerRadius(frameLayout.getHeight() / 2.0f);
        int height2 = c1803.f6025.getHeight();
        Integer numValueOf = Integer.valueOf(height2);
        if (height2 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            height = numValueOf.intValue();
        } else {
            height = frameLayout.getHeight() - c1803.m3551(8.0f);
            if (height < 0) {
                height = 0;
            }
        }
        c1803.f6023.setCornerRadius(height / 2.0f);
    }

    public final InterfaceC1425 getOnTabSelected() {
        return this.f6018;
    }

    public final int getSelectedTabIndex() {
        return this.f6019;
    }

    public final void setOnTabSelected(InterfaceC1425 interfaceC1425) {
        this.f6018 = interfaceC1425;
    }

    public final void setSelectedTabIndex(int i) {
        int i2 = this.f6020;
        int iM4027 = i2 <= 0 ? 0 : AbstractC2203.m4027(i, i2 - 1);
        if (this.f6019 == iM4027 || this.f6020 == 0) {
            return;
        }
        this.f6019 = iM4027;
        m3554();
        m3553(true);
        InterfaceC1425 interfaceC1425 = this.f6018;
        if (interfaceC1425 != null) {
            interfaceC1425.invoke(Integer.valueOf(iM4027));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m3551(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean m3552() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3553(boolean z) {
        View childAt;
        int width;
        if (this.f6020 != 0) {
            LinearLayout linearLayout = this.f6026;
            if (linearLayout.getWidth() == 0 || (childAt = linearLayout.getChildAt(this.f6019)) == null || (width = childAt.getWidth()) <= 0) {
                return;
            }
            int iM3551 = m3551(4.0f);
            View view = this.f6025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i = width - (iM3551 * 2);
            if (i < 0) {
                i = 0;
            }
            layoutParams2.width = i;
            view.setLayoutParams(layoutParams2);
            float left = childAt.getLeft() + iM3551;
            if (!z) {
                view.setTranslationX(left);
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getTranslationX(), left);
            valueAnimatorOfFloat.setDuration(220L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new C1115(1, this));
            valueAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3554() {
        int i = 0;
        for (Object obj : this.f6021) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0745.m2213();
                throw null;
            }
            C1801 c1801 = (C1801) obj;
            int accentColor = i == this.f6019 ? getAccentColor() : getContentColor();
            c1801.f6014.setColorFilter(accentColor);
            c1801.f6015.setTextColor(accentColor);
            i = i2;
        }
    }
}
