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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᲇᲀᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2950 extends HorizontalScrollView {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public static final C2433 f9432 = new C2433(16);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f9433;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ArrayList f9434;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C2947 f9435;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2946 f9436;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f9437;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f9438;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f9439;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int f9440;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int f9441;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int f9442;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int f9443;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public ColorStateList f9444;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public ColorStateList f9445;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public ColorStateList f9446;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public Drawable f9447;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public int f9448;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final PorterDuff.Mode f9449;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final float f9450;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final float f9451;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final int f9452;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int f9453;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final int f9454;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final int f9455;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final int f9456;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final int f9457;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public int f9458;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final int f9459;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public int f9460;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public int f9461;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public boolean f9462;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public boolean f9463;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public int f9464;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public int f9465;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public boolean f9466;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public C2135 f9467;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final TimeInterpolator f9468;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public InterfaceC2943 f9469;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final ArrayList f9470;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public ValueAnimator f9471;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final C2432 f9472;

    public C2950(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC1469.m3354(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        this.f9433 = -1;
        this.f9434 = new ArrayList();
        this.f9443 = -1;
        this.f9448 = 0;
        this.f9453 = Integer.MAX_VALUE;
        this.f9464 = -1;
        this.f9470 = new ArrayList();
        this.f9472 = new C2432(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C2946 c2946 = new C2946(this, context2);
        this.f9436 = c2946;
        super.addView(c2946, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayM4263 = AbstractC2240.m4263(context2, attributeSet, AbstractC2521.f8018, i, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListM4170 = AbstractC2234.m4170(getBackground());
        if (colorStateListM4170 != null) {
            C1948 c1948 = new C1948();
            c1948.m3914(colorStateListM4170);
            c1948.m3912(context2);
            Field field = AbstractC3638.f11333;
            c1948.m3913(getElevation());
            setBackground(c1948);
        }
        setSelectedTabIndicator(AbstractC1471.m3390(context2, typedArrayM4263, 5));
        setSelectedTabIndicatorColor(typedArrayM4263.getColor(8, 0));
        c2946.m4939(typedArrayM4263.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayM4263.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayM4263.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayM4263.getBoolean(9, true));
        int dimensionPixelSize = typedArrayM4263.getDimensionPixelSize(16, 0);
        this.f9440 = dimensionPixelSize;
        this.f9439 = dimensionPixelSize;
        this.f9438 = dimensionPixelSize;
        this.f9437 = dimensionPixelSize;
        this.f9437 = typedArrayM4263.getDimensionPixelSize(19, dimensionPixelSize);
        this.f9438 = typedArrayM4263.getDimensionPixelSize(20, dimensionPixelSize);
        this.f9439 = typedArrayM4263.getDimensionPixelSize(18, dimensionPixelSize);
        this.f9440 = typedArrayM4263.getDimensionPixelSize(17, dimensionPixelSize);
        if (AbstractC1469.m3346(context2, R.attr.isMaterial3Theme, false)) {
            this.f9441 = R.attr.textAppearanceTitleSmall;
        } else {
            this.f9441 = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayM4263.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f9442 = resourceId;
        int[] iArr = AbstractC2523.f8044;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f9450 = dimensionPixelSize2;
            this.f9444 = AbstractC1471.m3388(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayM4263.hasValue(22)) {
                this.f9443 = typedArrayM4263.getResourceId(22, resourceId);
            }
            int i2 = this.f9443;
            if (i2 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i2, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListM3388 = AbstractC1471.m3388(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListM3388 != null) {
                        this.f9444 = m4949(this.f9444.getDefaultColor(), colorStateListM3388.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM3388.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayM4263.hasValue(25)) {
                this.f9444 = AbstractC1471.m3388(context2, typedArrayM4263, 25);
            }
            if (typedArrayM4263.hasValue(23)) {
                this.f9444 = m4949(this.f9444.getDefaultColor(), typedArrayM4263.getColor(23, 0));
            }
            this.f9445 = AbstractC1471.m3388(context2, typedArrayM4263, 3);
            this.f9449 = AbstractC1471.m3403(typedArrayM4263.getInt(4, -1), null);
            this.f9446 = AbstractC1471.m3388(context2, typedArrayM4263, 21);
            this.f9459 = typedArrayM4263.getInt(6, 300);
            this.f9468 = AbstractC3744.m5342(context2, R.attr.motionEasingEmphasizedInterpolator, AbstractC0172.f1254);
            this.f9454 = typedArrayM4263.getDimensionPixelSize(14, -1);
            this.f9455 = typedArrayM4263.getDimensionPixelSize(13, -1);
            this.f9452 = typedArrayM4263.getResourceId(0, 0);
            this.f9457 = typedArrayM4263.getDimensionPixelSize(1, 0);
            this.f9461 = typedArrayM4263.getInt(15, 1);
            this.f9458 = typedArrayM4263.getInt(2, 0);
            this.f9462 = typedArrayM4263.getBoolean(12, false);
            this.f9466 = typedArrayM4263.getBoolean(26, false);
            typedArrayM4263.recycle();
            Resources resources = getResources();
            this.f9451 = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f9456 = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            m4953();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f9434;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2947 c2947 = (C2947) arrayList.get(i);
            if (c2947 != null && c2947.f9411 != null && !TextUtils.isEmpty(c2947.f9412)) {
                return !this.f9462 ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.f9454;
        if (i != -1) {
            return i;
        }
        int i2 = this.f9461;
        if (i2 == 0 || i2 == 2) {
            return this.f9456;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f9436.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        C2946 c2946 = this.f9436;
        int childCount = c2946.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = c2946.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof C2949) {
                        ((C2949) childAt).m4947();
                    }
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static ColorStateList m4949(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        m4951(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C2947 c2947 = this.f9435;
        if (c2947 != null) {
            return c2947.f9414;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f9434.size();
    }

    public int getTabGravity() {
        return this.f9458;
    }

    public ColorStateList getTabIconTint() {
        return this.f9445;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f9465;
    }

    public int getTabIndicatorGravity() {
        return this.f9460;
    }

    public int getTabMaxWidth() {
        return this.f9453;
    }

    public int getTabMode() {
        return this.f9461;
    }

    public ColorStateList getTabRippleColor() {
        return this.f9446;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f9447;
    }

    public ColorStateList getTabTextColors() {
        return this.f9444;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1948) {
            AbstractC1586.m3489(this, (C1948) background);
        }
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C2949 c2949;
        Drawable drawable;
        int i = 0;
        while (true) {
            C2946 c2946 = this.f9436;
            if (i >= c2946.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = c2946.getChildAt(i);
            if ((childAt instanceof C2949) && (drawable = (c2949 = (C2949) childAt).f9429) != null) {
                drawable.setBounds(c2949.getLeft(), c2949.getTop(), c2949.getRight(), c2949.getBottom());
                c2949.f9429.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C0099.m1230(1, getTabCount(), 1).f1112);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(AbstractC1471.m3383(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iM3383 = this.f9455;
            if (iM3383 <= 0) {
                iM3383 = (int) (size - AbstractC1471.m3383(getContext(), 56));
            }
            this.f9453 = iM3383;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f9461;
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
        if (background instanceof C1948) {
            ((C1948) background).m3913(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.f9462 == z) {
            return;
        }
        this.f9462 = z;
        int i = 0;
        while (true) {
            C2946 c2946 = this.f9436;
            if (i >= c2946.getChildCount()) {
                m4953();
                return;
            }
            View childAt = c2946.getChildAt(i);
            if (childAt instanceof C2949) {
                C2949 c2949 = (C2949) childAt;
                c2949.setOrientation(!c2949.f9431.f9462 ? 1 : 0);
                TextView textView = c2949.f9427;
                if (textView == null && c2949.f9428 == null) {
                    c2949.m4948(c2949.f9422, c2949.f9423, true);
                } else {
                    c2949.m4948(textView, c2949.f9428, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC2944 interfaceC2944) {
        setOnTabSelectedListener((InterfaceC2943) interfaceC2944);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m4955();
        this.f9471.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f9447 = drawableMutate;
        int i = this.f9448;
        if (i != 0) {
            drawableMutate.setTint(i);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.f9464;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f9447.getIntrinsicHeight();
        }
        this.f9436.m4939(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f9448 = i;
        Drawable drawable = this.f9447;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        m4960(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f9460 != i) {
            this.f9460 = i;
            Field field = AbstractC3638.f11333;
            this.f9436.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f9464 = i;
        this.f9436.m4939(i);
    }

    public void setTabGravity(int i) {
        if (this.f9458 != i) {
            this.f9458 = i;
            m4953();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f9445 != colorStateList) {
            this.f9445 = colorStateList;
            ArrayList arrayList = this.f9434;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C2949 c2949 = ((C2947) arrayList.get(i)).f9417;
                if (c2949 != null) {
                    c2949.m4945();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(AbstractC1469.m3333(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f9465 = i;
        if (i == 0) {
            this.f9467 = new C2135(20);
            return;
        }
        if (i == 1) {
            this.f9467 = new C1140(0);
        } else {
            if (i == 2) {
                this.f9467 = new C1140(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f9463 = z;
        int i = C2946.f9408;
        C2946 c2946 = this.f9436;
        c2946.m4938(c2946.f9410.getSelectedTabPosition());
        Field field = AbstractC3638.f11333;
        c2946.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.f9461) {
            this.f9461 = i;
            m4953();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f9446 == colorStateList) {
            return;
        }
        this.f9446 = colorStateList;
        int i = 0;
        while (true) {
            C2946 c2946 = this.f9436;
            if (i >= c2946.getChildCount()) {
                return;
            }
            View childAt = c2946.getChildAt(i);
            if (childAt instanceof C2949) {
                Context context = getContext();
                int i2 = C2949.f9420;
                ((C2949) childAt).m4946(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(AbstractC1469.m3333(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f9444 != colorStateList) {
            this.f9444 = colorStateList;
            ArrayList arrayList = this.f9434;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C2949 c2949 = ((C2947) arrayList.get(i)).f9417;
                if (c2949 != null) {
                    c2949.m4945();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC2347 abstractC2347) {
        m4957();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f9466 == z) {
            return;
        }
        this.f9466 = z;
        int i = 0;
        while (true) {
            C2946 c2946 = this.f9436;
            if (i >= c2946.getChildCount()) {
                return;
            }
            View childAt = c2946.getChildAt(i);
            if (childAt instanceof C2949) {
                Context context = getContext();
                int i2 = C2949.f9420;
                ((C2949) childAt).m4946(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(AbstractC3649 abstractC3649) {
        m4957();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4950(C2947 c2947, boolean z) {
        ArrayList arrayList = this.f9434;
        int size = arrayList.size();
        if (c2947.f9416 != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        c2947.f9414 = size;
        arrayList.add(size, c2947);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((C2947) arrayList.get(i2)).f9414 == this.f9433) {
                i = i2;
            }
            ((C2947) arrayList.get(i2)).f9414 = i2;
        }
        this.f9433 = i;
        C2949 c2949 = c2947.f9417;
        c2949.setSelected(false);
        c2949.setActivated(false);
        int i3 = c2947.f9414;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f9461 == 1 && this.f9458 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f9436.addView(c2949, i3, layoutParams);
        if (z) {
            C2950 c2950 = c2947.f9416;
            if (c2950 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            c2950.m4958(c2947);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4951(View view) {
        if (!(view instanceof ModuleTabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        ModuleTabItem moduleTabItem = (ModuleTabItem) view;
        C2947 c2947M4956 = m4956();
        CharSequence charSequence = moduleTabItem.f1037;
        if (charSequence != null) {
            if (TextUtils.isEmpty(c2947M4956.f9413) && !TextUtils.isEmpty(charSequence)) {
                c2947M4956.f9417.setContentDescription(charSequence);
            }
            c2947M4956.f9412 = charSequence;
            C2949 c2949 = c2947M4956.f9417;
            if (c2949 != null) {
                c2949.m4945();
            }
        }
        Drawable drawable = moduleTabItem.f1038;
        if (drawable != null) {
            c2947M4956.f9411 = drawable;
            C2950 c2950 = c2947M4956.f9416;
            if (c2950.f9458 == 1 || c2950.f9461 == 2) {
                c2950.m4960(true);
            }
            C2949 c29410 = c2947M4956.f9417;
            if (c29410 != null) {
                c29410.m4945();
            }
        }
        int i = moduleTabItem.f1039;
        if (i != 0) {
            c2947M4956.f9415 = LayoutInflater.from(c2947M4956.f9417.getContext()).inflate(i, (ViewGroup) c2947M4956.f9417, false);
            C2949 c29411 = c2947M4956.f9417;
            if (c29411 != null) {
                c29411.m4945();
            }
        }
        if (!TextUtils.isEmpty(moduleTabItem.getContentDescription())) {
            c2947M4956.f9413 = moduleTabItem.getContentDescription();
            C2949 c29412 = c2947M4956.f9417;
            if (c29412 != null) {
                c29412.m4945();
            }
        }
        m4950(c2947M4956, this.f9434.isEmpty());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4952(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            Field field = AbstractC3638.f11333;
            if (isLaidOut()) {
                C2946 c2946 = this.f9436;
                int childCount = c2946.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (c2946.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iM4954 = m4954(i);
                if (scrollX != iM4954) {
                    m4955();
                    this.f9471.setIntValues(scrollX, iM4954);
                    this.f9471.start();
                }
                ValueAnimator valueAnimator = c2946.f9409;
                if (valueAnimator != null && valueAnimator.isRunning() && c2946.f9410.f9433 != i) {
                    c2946.f9409.cancel();
                }
                c2946.m4941(i, this.f9459, true);
                return;
            }
        }
        m4959(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4953() {
        int i = this.f9461;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.f9457 - this.f9437) : 0;
        Field field = AbstractC3638.f11333;
        C2946 c2946 = this.f9436;
        c2946.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.f9461;
        if (i2 == 0) {
            int i3 = this.f9458;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                c2946.setGravity(1);
            } else if (i3 == 2) {
            }
            c2946.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f9458 == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            c2946.setGravity(1);
        }
        m4960(true);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m4954(int i) {
        C2946 c2946;
        View childAt;
        int i2 = this.f9461;
        if ((i2 != 0 && i2 != 2) || (childAt = (c2946 = this.f9436).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < c2946.getChildCount() ? c2946.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * 0.0f);
        Field field = AbstractC3638.f11333;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4955() {
        if (this.f9471 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f9471 = valueAnimator;
            valueAnimator.setInterpolator(this.f9468);
            this.f9471.setDuration(this.f9459);
            this.f9471.addUpdateListener(new C0360(this, 4));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C2947 m4956() {
        C2947 c2947 = (C2947) f9432.mo1458();
        if (c2947 == null) {
            c2947 = new C2947();
            c2947.f9414 = -1;
        }
        c2947.f9416 = this;
        C2432 c2432 = this.f9472;
        C2949 c2949 = c2432 != null ? (C2949) c2432.mo1458() : null;
        if (c2949 == null) {
            c2949 = new C2949(this, getContext());
        }
        c2949.setTab(c2947);
        c2949.setFocusable(true);
        c2949.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c2947.f9413)) {
            c2949.setContentDescription(c2947.f9412);
        } else {
            c2949.setContentDescription(c2947.f9413);
        }
        c2947.f9417 = c2949;
        return c2947;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m4957() {
        C2946 c2946 = this.f9436;
        int childCount = c2946.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C2949 c2949 = (C2949) c2946.getChildAt(childCount);
            c2946.removeViewAt(childCount);
            if (c2949 != null) {
                c2949.setTab(null);
                c2949.setSelected(false);
                this.f9472.mo1457(c2949);
            }
            requestLayout();
        }
        Iterator it = this.f9434.iterator();
        while (it.hasNext()) {
            C2947 c2947 = (C2947) it.next();
            it.remove();
            c2947.f9416 = null;
            c2947.f9417 = null;
            c2947.f9411 = null;
            c2947.f9412 = null;
            c2947.f9413 = null;
            c2947.f9414 = -1;
            c2947.f9415 = null;
            f9432.mo1457(c2947);
        }
        this.f9435 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m4958(C2947 c2947) {
        C2947 c2948 = this.f9435;
        ArrayList arrayList = this.f9470;
        if (c2948 == c2947) {
            if (c2948 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((InterfaceC2943) arrayList.get(size)).mo2133(c2947);
                }
                m4952(c2947.f9414);
                return;
            }
            return;
        }
        int i = c2947.f9414;
        if ((c2948 == null || c2948.f9414 == -1) && i != -1) {
            m4959(i);
        } else {
            m4952(i);
        }
        if (i != -1) {
            setSelectedTabView(i);
        }
        this.f9435 = c2947;
        if (c2948 != null && c2948.f9416 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC2943) arrayList.get(size2)).getClass();
            }
        }
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            ((InterfaceC2943) arrayList.get(size3)).mo2134(c2947);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m4959(int i) {
        float f = i + 0.0f;
        int iRound = Math.round(f);
        if (iRound >= 0) {
            C2946 c2946 = this.f9436;
            if (iRound >= c2946.getChildCount()) {
                return;
            }
            c2946.f9410.f9433 = Math.round(f);
            ValueAnimator valueAnimator = c2946.f9409;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c2946.f9409.cancel();
            }
            c2946.m4940(c2946.getChildAt(i), c2946.getChildAt(i + 1), 0.0f);
            ValueAnimator valueAnimator2 = this.f9471;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f9471.cancel();
            }
            int iM4954 = m4954(i);
            int scrollX = getScrollX();
            if ((i >= getSelectedTabPosition() || iM4954 < scrollX) && (i <= getSelectedTabPosition() || iM4954 > scrollX)) {
                getSelectedTabPosition();
            }
            Field field = AbstractC3638.f11333;
            if (getLayoutDirection() == 1 && ((i >= getSelectedTabPosition() || iM4954 > scrollX) && (i <= getSelectedTabPosition() || iM4954 < scrollX))) {
                getSelectedTabPosition();
            }
            if (i < 0) {
                iM4954 = 0;
            }
            scrollTo(iM4954, 0);
            setSelectedTabView(iRound);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4960(boolean z) {
        int i = 0;
        while (true) {
            C2946 c2946 = this.f9436;
            if (i >= c2946.getChildCount()) {
                return;
            }
            View childAt = c2946.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f9461 == 1 && this.f9458 == 0) {
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
        m4951(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC2943 interfaceC2943) {
        InterfaceC2943 interfaceC2944 = this.f9469;
        ArrayList arrayList = this.f9470;
        if (interfaceC2944 != null) {
            arrayList.remove(interfaceC2944);
        }
        this.f9469 = interfaceC2943;
        if (interfaceC2943 == null || arrayList.contains(interfaceC2943)) {
            return;
        }
        arrayList.add(interfaceC2943);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m4951(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m4951(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C1787.m3667(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
