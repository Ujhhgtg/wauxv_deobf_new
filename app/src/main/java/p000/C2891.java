package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import me.hd.wauxv.R;
import me.hd.wauxv.ui.setting.view.ModuleTabItem;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2891 extends HorizontalScrollView {

    public static final C2380 f9265 = new C2380(16);

    public int f9266;

    public final ArrayList f9267;

    public C2888 f9268;

    public final C2887 f9269;

    public final int f9270;

    public final int f9271;

    public final int f9272;

    public final int f9273;

    public final int f9274;

    public final int f9275;

    public final int f9276;

    public ColorStateList f9277;

    public ColorStateList f9278;

    public ColorStateList f9279;

    public Drawable f9280;

    public int f9281;

    public final PorterDuff.Mode f9282;

    public final float f9283;

    public final float f9284;

    public final int f9285;

    public int f9286;

    public final int f9287;

    public final int f9288;

    public final int f9289;

    public final int f9290;

    public int f9291;

    public final int f9292;

    public int f9293;

    public int f9294;

    public boolean f9295;

    public boolean f9296;

    public int f9297;

    public int f9298;

    public boolean f9299;

    public C2102 f9300;

    public final TimeInterpolator f9301;

    public InterfaceC2884 f9302;

    public final ArrayList f9303;

    public ValueAnimator f9304;

    public final C2379 f9305;

    public C2891(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC2665.m4673(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        this.f9266 = -1;
        this.f9267 = new ArrayList();
        this.f9276 = -1;
        this.f9281 = 0;
        this.f9286 = 2147483647;
        this.f9297 = -1;
        this.f9303 = new ArrayList();
        this.f9305 = new C2379(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C2887 c2887 = new C2887(this, context2);
        this.f9269 = c2887;
        super.addView(c2887, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayM5082 = AbstractC3471.m5082(context2, attributeSet, AbstractC2467.f7868, i, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListM5075 = AbstractC3471.m5075(getBackground());
        if (colorStateListM5075 != null) {
            C1917 c1917 = new C1917();
            c1917.m3716(colorStateListM5075);
            c1917.m3714(context2);
            Field field = AbstractC3578.f11184;
            c1917.m3715(getElevation());
            setBackground(c1917);
        }
        setSelectedTabIndicator(AbstractC3453.m4997(context2, typedArrayM5082, 5));
        setSelectedTabIndicatorColor(typedArrayM5082.getColor(8, 0));
        c2887.m4878(typedArrayM5082.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayM5082.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayM5082.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayM5082.getBoolean(9, true));
        int dimensionPixelSize = typedArrayM5082.getDimensionPixelSize(16, 0);
        this.f9273 = dimensionPixelSize;
        this.f9272 = dimensionPixelSize;
        this.f9271 = dimensionPixelSize;
        this.f9270 = dimensionPixelSize;
        this.f9270 = typedArrayM5082.getDimensionPixelSize(19, dimensionPixelSize);
        this.f9271 = typedArrayM5082.getDimensionPixelSize(20, dimensionPixelSize);
        this.f9272 = typedArrayM5082.getDimensionPixelSize(18, dimensionPixelSize);
        this.f9273 = typedArrayM5082.getDimensionPixelSize(17, dimensionPixelSize);
        if (AbstractC2207.m4110(context2, R.attr.isMaterial3Theme, false)) {
            this.f9274 = R.attr.textAppearanceTitleSmall;
        } else {
            this.f9274 = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayM5082.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f9275 = resourceId;
        int[] iArr = AbstractC2470.f7895;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f9283 = dimensionPixelSize2;
            this.f9277 = AbstractC3453.m4995(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayM5082.hasValue(22)) {
                this.f9276 = typedArrayM5082.getResourceId(22, resourceId);
            }
            int i2 = this.f9276;
            if (i2 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i2, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListM4995 = AbstractC3453.m4995(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListM4995 != null) {
                        this.f9277 = m4888(this.f9277.getDefaultColor(), colorStateListM4995.getColorForState(new int[]{16842913}, colorStateListM4995.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayM5082.hasValue(25)) {
                this.f9277 = AbstractC3453.m4995(context2, typedArrayM5082, 25);
            }
            if (typedArrayM5082.hasValue(23)) {
                this.f9277 = m4888(this.f9277.getDefaultColor(), typedArrayM5082.getColor(23, 0));
            }
            this.f9278 = AbstractC3453.m4995(context2, typedArrayM5082, 3);
            this.f9282 = AbstractC1459.m3195(typedArrayM5082.getInt(4, -1), null);
            this.f9279 = AbstractC3453.m4995(context2, typedArrayM5082, 21);
            this.f9292 = typedArrayM5082.getInt(6, 300);
            this.f9301 = AbstractC1574.m3309(context2, R.attr.motionEasingEmphasizedInterpolator, AbstractC0164.f1186);
            this.f9287 = typedArrayM5082.getDimensionPixelSize(14, -1);
            this.f9288 = typedArrayM5082.getDimensionPixelSize(13, -1);
            this.f9285 = typedArrayM5082.getResourceId(0, 0);
            this.f9290 = typedArrayM5082.getDimensionPixelSize(1, 0);
            this.f9294 = typedArrayM5082.getInt(15, 1);
            this.f9291 = typedArrayM5082.getInt(2, 0);
            this.f9295 = typedArrayM5082.getBoolean(12, false);
            this.f9299 = typedArrayM5082.getBoolean(26, false);
            typedArrayM5082.recycle();
            Resources resources = getResources();
            this.f9284 = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f9289 = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            m4891();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f9267;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2888 c2888 = (C2888) arrayList.get(i);
            if (c2888 != null && c2888.f9244 != null && !TextUtils.isEmpty(c2888.f9245)) {
                return !this.f9295 ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f9287;
        if (i != -1) {
            return i;
        }
        int i2 = this.f9294;
        if (i2 == 0 || i2 == 2) {
            return this.f9289;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f9269.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        C2887 c2887 = this.f9269;
        int childCount = c2887.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = c2887.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof C2890) {
                        ((C2890) childAt).m4886();
                    }
                }
                i2++;
            }
        }
    }

    public static ColorStateList m4888(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        m4889(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C2888 c2888 = this.f9268;
        if (c2888 != null) {
            return c2888.f9247;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f9267.size();
    }

    public int getTabGravity() {
        return this.f9291;
    }

    public ColorStateList getTabIconTint() {
        return this.f9278;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f9298;
    }

    public int getTabIndicatorGravity() {
        return this.f9293;
    }

    public int getTabMaxWidth() {
        return this.f9286;
    }

    public int getTabMode() {
        return this.f9294;
    }

    public ColorStateList getTabRippleColor() {
        return this.f9279;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f9280;
    }

    public ColorStateList getTabTextColors() {
        return this.f9277;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1917) {
            AbstractC3471.m5086(this, (C1917) background);
        }
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C2890 c2890;
        Drawable drawable;
        int i = 0;
        while (true) {
            C2887 c2887 = this.f9269;
            if (i >= c2887.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = c2887.getChildAt(i);
            if ((childAt instanceof C2890) && (drawable = (c2890 = (C2890) childAt).f9262) != null) {
                drawable.setBounds(c2890.getLeft(), c2890.getTop(), c2890.getRight(), c2890.getBottom());
                c2890.f9262.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(AbstractC1459.m3180(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != -2147483648) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iM3180 = this.f9288;
            if (iM3180 <= 0) {
                iM3180 = (int) (size - AbstractC1459.m3180(getContext(), 56));
            }
            this.f9286 = iM3180;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f9294;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C1917) {
            ((C1917) background).m3715(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.f9295 == z) {
            return;
        }
        this.f9295 = z;
        int i = 0;
        while (true) {
            C2887 c2887 = this.f9269;
            if (i >= c2887.getChildCount()) {
                m4891();
                return;
            }
            View childAt = c2887.getChildAt(i);
            if (childAt instanceof C2890) {
                C2890 c2890 = (C2890) childAt;
                c2890.setOrientation(!c2890.f9264.f9295 ? 1 : 0);
                TextView textView = c2890.f9260;
                if (textView == null && c2890.f9261 == null) {
                    c2890.m4887(c2890.f9255, c2890.f9256, true);
                } else {
                    c2890.m4887(textView, c2890.f9261, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC2885 interfaceC2885) {
        setOnTabSelectedListener((InterfaceC2884) interfaceC2885);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m4893();
        this.f9304.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f9280 = drawableMutate;
        int i = this.f9281;
        if (i != 0) {
            drawableMutate.setTint(i);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.f9297;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f9280.getIntrinsicHeight();
        }
        this.f9269.m4878(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f9281 = i;
        Drawable drawable = this.f9280;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        m4898(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f9293 != i) {
            this.f9293 = i;
            Field field = AbstractC3578.f11184;
            this.f9269.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f9297 = i;
        this.f9269.m4878(i);
    }

    public void setTabGravity(int i) {
        if (this.f9291 != i) {
            this.f9291 = i;
            m4891();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f9278 != colorStateList) {
            this.f9278 = colorStateList;
            ArrayList arrayList = this.f9267;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C2890 c2890 = ((C2888) arrayList.get(i)).f9250;
                if (c2890 != null) {
                    c2890.m4884();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(AbstractC2203.m4030(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f9298 = i;
        if (i == 0) {
            this.f9300 = new C2102(20);
            return;
        }
        if (i == 1) {
            this.f9300 = new C1134(0);
        } else {
            if (i == 2) {
                this.f9300 = new C1134(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f9296 = z;
        int i = 0;
        C2887 c2887 = this.f9269;
        c2887.m4877(c2887.f9243.getSelectedTabPosition());
        Field field = AbstractC3578.f11184;
        c2887.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.f9294) {
            this.f9294 = i;
            m4891();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f9279 == colorStateList) {
            return;
        }
        this.f9279 = colorStateList;
        int i = 0;
        while (true) {
            C2887 c2887 = this.f9269;
            if (i >= c2887.getChildCount()) {
                return;
            }
            View childAt = c2887.getChildAt(i);
            if (childAt instanceof C2890) {
                Context context = getContext();
                int i2 = 0;
                ((C2890) childAt).m4885(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(AbstractC2203.m4030(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f9277 != colorStateList) {
            this.f9277 = colorStateList;
            ArrayList arrayList = this.f9267;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C2890 c2890 = ((C2888) arrayList.get(i)).f9250;
                if (c2890 != null) {
                    c2890.m4884();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC2314 abstractC2314) {
        m4895();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f9299 == z) {
            return;
        }
        this.f9299 = z;
        int i = 0;
        while (true) {
            C2887 c2887 = this.f9269;
            if (i >= c2887.getChildCount()) {
                return;
            }
            View childAt = c2887.getChildAt(i);
            if (childAt instanceof C2890) {
                Context context = getContext();
                int i2 = 0;
                ((C2890) childAt).m4885(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(AbstractC3589 abstractC3589) {
        m4895();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void m4889(View view) {
        if (!(view instanceof ModuleTabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        ModuleTabItem moduleTabItem = (ModuleTabItem) view;
        C2888 c2888M4894 = m4894();
        CharSequence charSequence = moduleTabItem.f972;
        if (charSequence != null) {
            if (TextUtils.isEmpty(c2888M4894.f9246) && !TextUtils.isEmpty(charSequence)) {
                c2888M4894.f9250.setContentDescription(charSequence);
            }
            c2888M4894.f9245 = charSequence;
            C2890 c2890 = c2888M4894.f9250;
            if (c2890 != null) {
                c2890.m4884();
            }
        }
        Drawable drawable = moduleTabItem.f973;
        if (drawable != null) {
            c2888M4894.f9244 = drawable;
            C2891 c2891 = c2888M4894.f9249;
            if (c2891.f9291 == 1 || c2891.f9294 == 2) {
                c2891.m4898(true);
            }
            C2890 c2892 = c2888M4894.f9250;
            if (c2892 != null) {
                c2892.m4884();
            }
        }
        int i = moduleTabItem.f974;
        if (i != 0) {
            c2888M4894.f9248 = LayoutInflater.from(c2888M4894.f9250.getContext()).inflate(i, (ViewGroup) c2888M4894.f9250, false);
            C2890 c2893 = c2888M4894.f9250;
            if (c2893 != null) {
                c2893.m4884();
            }
        }
        if (!TextUtils.isEmpty(moduleTabItem.getContentDescription())) {
            c2888M4894.f9246 = moduleTabItem.getContentDescription();
            C2890 c2894 = c2888M4894.f9250;
            if (c2894 != null) {
                c2894.m4884();
            }
        }
        ArrayList arrayList = this.f9267;
        boolean zIsEmpty = arrayList.isEmpty();
        int size = arrayList.size();
        if (c2888M4894.f9249 != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        c2888M4894.f9247 = size;
        arrayList.add(size, c2888M4894);
        int size2 = arrayList.size();
        int i2 = -1;
        for (int i3 = size + 1; i3 < size2; i3++) {
            if (((C2888) arrayList.get(i3)).f9247 == this.f9266) {
                i2 = i3;
            }
            ((C2888) arrayList.get(i3)).f9247 = i3;
        }
        this.f9266 = i2;
        C2890 c2895 = c2888M4894.f9250;
        c2895.setSelected(false);
        c2895.setActivated(false);
        int i4 = c2888M4894.f9247;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f9294 == 1 && this.f9291 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f9269.addView(c2895, i4, layoutParams);
        if (zIsEmpty) {
            C2891 c2896 = c2888M4894.f9249;
            if (c2896 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            c2896.m4896(c2888M4894);
        }
    }

    public final void m4890(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            Field field = AbstractC3578.f11184;
            if (isLaidOut()) {
                C2887 c2887 = this.f9269;
                int childCount = c2887.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (c2887.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iM4892 = m4892(i);
                if (scrollX != iM4892) {
                    m4893();
                    this.f9304.setIntValues(scrollX, iM4892);
                    this.f9304.start();
                }
                ValueAnimator valueAnimator = c2887.f9242;
                if (valueAnimator != null && valueAnimator.isRunning() && c2887.f9243.f9266 != i) {
                    c2887.f9242.cancel();
                }
                c2887.m4880(i, this.f9292, true);
                return;
            }
        }
        m4897(i);
    }

    public final void m4891() {
        int i = this.f9294;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.f9290 - this.f9270) : 0;
        Field field = AbstractC3578.f11184;
        C2887 c2887 = this.f9269;
        c2887.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.f9294;
        if (i2 == 0) {
            int i3 = this.f9291;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                c2887.setGravity(1);
            } else if (i3 == 2) {
            }
            c2887.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f9291 == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            c2887.setGravity(1);
        }
        m4898(true);
    }

    public final int m4892(int i) {
        C2887 c2887;
        View childAt;
        int i2 = this.f9294;
        if ((i2 != 0 && i2 != 2) || (childAt = (c2887 = this.f9269).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < c2887.getChildCount() ? c2887.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * 0.0f);
        Field field = AbstractC3578.f11184;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void m4893() {
        if (this.f9304 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f9304 = valueAnimator;
            valueAnimator.setInterpolator(this.f9301);
            this.f9304.setDuration(this.f9292);
            this.f9304.addUpdateListener(new C0385(4, this));
        }
    }

    public final C2888 m4894() {
        C2888 c2888 = (C2888) f9265.mo1312();
        if (c2888 == null) {
            c2888 = new C2888();
            c2888.f9247 = -1;
        }
        c2888.f9249 = this;
        C2379 c2379 = this.f9305;
        C2890 c2890 = c2379 != null ? (C2890) c2379.mo1312() : null;
        if (c2890 == null) {
            c2890 = new C2890(this, getContext());
        }
        c2890.setTab(c2888);
        c2890.setFocusable(true);
        c2890.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c2888.f9246)) {
            c2890.setContentDescription(c2888.f9245);
        } else {
            c2890.setContentDescription(c2888.f9246);
        }
        c2888.f9250 = c2890;
        return c2888;
    }

    public final void m4895() {
        C2887 c2887 = this.f9269;
        int childCount = c2887.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C2890 c2890 = (C2890) c2887.getChildAt(childCount);
            c2887.removeViewAt(childCount);
            if (c2890 != null) {
                c2890.setTab(null);
                c2890.setSelected(false);
                this.f9305.mo1311(c2890);
            }
            requestLayout();
        }
        Iterator it = this.f9267.iterator();
        while (it.hasNext()) {
            C2888 c2888 = (C2888) it.next();
            it.remove();
            c2888.f9249 = null;
            c2888.f9250 = null;
            c2888.f9244 = null;
            c2888.f9245 = null;
            c2888.f9246 = null;
            c2888.f9247 = -1;
            c2888.f9248 = null;
            f9265.mo1311(c2888);
        }
        this.f9268 = null;
    }

    public final void m4896(C2888 c2888) {
        C2888 c2889 = this.f9268;
        ArrayList arrayList = this.f9303;
        if (c2889 == c2888) {
            if (c2889 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((InterfaceC2884) arrayList.get(size)).mo2029(c2888);
                }
                m4890(c2888.f9247);
                return;
            }
            return;
        }
        int i = c2888.f9247;
        if ((c2889 == null || c2889.f9247 == -1) && i != -1) {
            m4897(i);
        } else {
            m4890(i);
        }
        if (i != -1) {
            setSelectedTabView(i);
        }
        this.f9268 = c2888;
        if (c2889 != null && c2889.f9249 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                
            }
        }
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            ((InterfaceC2884) arrayList.get(size3)).mo2030(c2888);
        }
    }

    public final void m4897(int i) {
        float f = i + 0.0f;
        int iRound = Math.round(f);
        if (iRound >= 0) {
            C2887 c2887 = this.f9269;
            if (iRound >= c2887.getChildCount()) {
                return;
            }
            c2887.f9243.f9266 = Math.round(f);
            ValueAnimator valueAnimator = c2887.f9242;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c2887.f9242.cancel();
            }
            c2887.m4879(c2887.getChildAt(i), c2887.getChildAt(i + 1), 0.0f);
            ValueAnimator valueAnimator2 = this.f9304;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f9304.cancel();
            }
            int iM4892 = m4892(i);
            int scrollX = getScrollX();
            if ((i >= getSelectedTabPosition() || iM4892 < scrollX) && (i <= getSelectedTabPosition() || iM4892 > scrollX)) {
                getSelectedTabPosition();
            }
            Field field = AbstractC3578.f11184;
            if (getLayoutDirection() == 1 && ((i >= getSelectedTabPosition() || iM4892 > scrollX) && (i <= getSelectedTabPosition() || iM4892 < scrollX))) {
                getSelectedTabPosition();
            }
            if (i < 0) {
                iM4892 = 0;
            }
            scrollTo(iM4892, 0);
            setSelectedTabView(iRound);
        }
    }

    public final void m4898(boolean z) {
        int i = 0;
        while (true) {
            C2887 c2887 = this.f9269;
            if (i >= c2887.getChildCount()) {
                return;
            }
            View childAt = c2887.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f9294 == 1 && this.f9291 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        m4889(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC2884 interfaceC2884) {
        InterfaceC2884 interfaceC2885 = this.f9302;
        ArrayList arrayList = this.f9303;
        if (interfaceC2885 != null) {
            arrayList.remove(interfaceC2885);
        }
        this.f9302 = interfaceC2884;
        if (interfaceC2884 == null || arrayList.contains(interfaceC2884)) {
            return;
        }
        arrayList.add(interfaceC2884);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m4889(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m4889(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(AbstractC3471.m5076(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
