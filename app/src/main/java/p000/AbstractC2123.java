package p000;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲁᛸᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2123 extends FrameLayout implements InterfaceC1956 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static final int[] f6985 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static final C2102 f6986 = new C2102(3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static final C2122 f6987 = new C2122(3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f6988;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ColorStateList f6989;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Drawable f6990;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f6991;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f6992;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f6993;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f6994;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f6995;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public float f6996;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f6997;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f6998;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final FrameLayout f6999;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final View f7000;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final ImageView f7001;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final ViewGroup f7002;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final TextView f7003;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final TextView f7004;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int f7005;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public int f7006;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public MenuItemC1946 f7007;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public ColorStateList f7008;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public Drawable f7009;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public Drawable f7010;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public ValueAnimator f7011;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public C2102 f7012;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public float f7013;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public boolean f7014;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public int f7015;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public int f7016;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public boolean f7017;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public int f7018;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public C0363 f7019;

    public AbstractC2123(Context context) {
        super(context);
        this.f6988 = false;
        this.f7005 = -1;
        this.f7006 = 0;
        this.f7012 = f6986;
        this.f7013 = 0.0f;
        this.f7014 = false;
        this.f7015 = 0;
        this.f7016 = 0;
        this.f7017 = false;
        this.f7018 = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f6999 = (FrameLayout) findViewById(me.hd.wauxv.R.id.navigation_bar_item_icon_container);
        this.f7000 = findViewById(me.hd.wauxv.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(me.hd.wauxv.R.id.navigation_bar_item_icon_view);
        this.f7001 = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(me.hd.wauxv.R.id.navigation_bar_item_labels_group);
        this.f7002 = viewGroup;
        TextView textView = (TextView) findViewById(me.hd.wauxv.R.id.navigation_bar_item_small_label_view);
        this.f7003 = textView;
        TextView textView2 = (TextView) findViewById(me.hd.wauxv.R.id.navigation_bar_item_large_label_view);
        this.f7004 = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f6991 = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f6992 = viewGroup.getPaddingBottom();
        this.f6993 = getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.m3_navigation_item_active_indicator_label_padding);
        Field field = AbstractC3578.f11184;
        int i = 2;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        m3934(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0445(i, (C0446) this));
        }
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f6999;
        return frameLayout != null ? frameLayout : this.f7001;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof AbstractC2123) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        C0363 c0363 = this.f7019;
        int minimumWidth = c0363 == null ? 0 : c0363.getMinimumWidth() - this.f7019.f1690.f1730.f1721.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f7001.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m3930(TextView textView, int i) {
        int iRound;
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC2467.f7869);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                iRound = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m3931(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static void m3932(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static void m3933(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f6999;
        if (frameLayout != null && this.f7014) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f7000;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C0363 getBadge() {
        return this.f7019;
    }

    public int getItemBackgroundResId() {
        return me.hd.wauxv.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // p000.InterfaceC1956
    public MenuItemC1946 getItemData() {
        return this.f7007;
    }

    public int getItemDefaultMarginResId() {
        return me.hd.wauxv.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f7005;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f7002;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f6993 : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f7002;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemC1946 menuItemC1946 = this.f7007;
        if (menuItemC1946 != null && menuItemC1946.isCheckable() && this.f7007.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6985);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0363 c0363 = this.f7019;
        if (c0363 != null && c0363.isVisible()) {
            MenuItemC1946 menuItemC1946 = this.f7007;
            CharSequence charSequence = menuItemC1946.f6431;
            if (!TextUtils.isEmpty(menuItemC1946.f6443)) {
                charSequence = this.f7007.f6443;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f7019.m1477()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0091.m1085(0, 1, getItemVisiblePosition(), 1, isSelected()).f1044);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C0085.f1027.f1038);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(me.hd.wauxv.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new RunnableC0386(i, 3, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f7000;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        m3936();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.f7014 = z;
        m3936();
        View view = this.f7000;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f7016 = i;
        m3938(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f6993 != i) {
            this.f6993 = i;
            m3935();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f7018 = i;
        m3938(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f7017 = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f7015 = i;
        m3938(getWidth());
    }

    public void setBadge(C0363 c0363) {
        C0363 c0364 = this.f7019;
        if (c0364 == c0363) {
            return;
        }
        ImageView imageView = this.f7001;
        if (c0364 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f7019 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C0363 c0365 = this.f7019;
                if (c0365 != null) {
                    if (c0365.m1478() != null) {
                        c0365.m1478().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(c0365);
                    }
                }
                this.f7019 = null;
            }
        }
        this.f7019 = c0363;
        if (imageView == null || c0363 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        C0363 c0366 = this.f7019;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        c0366.setBounds(rect);
        c0366.m1483(imageView, null);
        if (c0366.m1478() != null) {
            c0366.m1478().setForeground(c0366);
        } else {
            imageView.getOverlay().add(c0366);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0095  */
    public void setChecked(boolean z) {
        TextView textView = this.f7004;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.f7003;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f = z ? 1.0f : 0.0f;
        if (this.f7014 && this.f6988) {
            Field field = AbstractC3578.f11184;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.f7011;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f7011 = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f7013, f);
                this.f7011 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new C2121(this, f));
                this.f7011.setInterpolator(AbstractC1574.m3309(getContext(), me.hd.wauxv.R.attr.motionEasingEmphasizedInterpolator, AbstractC0164.f1186));
                this.f7011.setDuration(AbstractC1574.m3308(getContext(), me.hd.wauxv.R.attr.motionDurationLong2, getResources().getInteger(me.hd.wauxv.R.integer.material_motion_duration_long_1)));
                this.f7011.start();
            } else {
                m3937(f, f);
            }
        } else {
            m3937(f, f);
        }
        int i = this.f6997;
        ViewGroup viewGroup = this.f7002;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m3932(getIconOrContainer(), this.f6991, 49);
                    m3933(viewGroup, this.f6992);
                    textView.setVisibility(0);
                } else {
                    m3932(getIconOrContainer(), this.f6991, 17);
                    m3933(viewGroup, 0);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i == 1) {
                m3933(viewGroup, this.f6992);
                if (z) {
                    m3932(getIconOrContainer(), (int) (this.f6991 + this.f6994), 49);
                    m3931(textView, 1.0f, 1.0f, 0);
                    float f2 = this.f6995;
                    m3931(textView2, f2, f2, 4);
                } else {
                    m3932(getIconOrContainer(), this.f6991, 49);
                    float f3 = this.f6996;
                    m3931(textView, f3, f3, 4);
                    m3931(textView2, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m3932(getIconOrContainer(), this.f6991, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.f6998) {
            if (z) {
                m3932(getIconOrContainer(), this.f6991, 49);
                m3933(viewGroup, this.f6992);
                textView.setVisibility(0);
            } else {
                m3932(getIconOrContainer(), this.f6991, 17);
                m3933(viewGroup, 0);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            m3933(viewGroup, this.f6992);
            if (z) {
                m3932(getIconOrContainer(), (int) (this.f6991 + this.f6994), 49);
                m3931(textView, 1.0f, 1.0f, 0);
                float f4 = this.f6995;
                m3931(textView2, f4, f4, 4);
            } else {
                m3932(getIconOrContainer(), this.f6991, 49);
                float f5 = this.f6996;
                m3931(textView, f5, f5, 4);
                m3931(textView2, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f7003.setEnabled(z);
        this.f7004.setEnabled(z);
        this.f7001.setEnabled(z);
        if (!z) {
            Field field = AbstractC3578.f11184;
            AbstractC3572.m5153(this, null);
        } else {
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            Field field2 = AbstractC3578.f11184;
            AbstractC3572.m5153(this, systemIcon);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f7009) {
            return;
        }
        this.f7009 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f7010 = drawable;
            ColorStateList colorStateList = this.f7008;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f7001.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.f7001;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f7008 = colorStateList;
        if (this.f7007 == null || (drawable = this.f7010) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f7010.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f6992 != i) {
            this.f6992 = i;
            m3935();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f6991 != i) {
            this.f6991 = i;
            m3935();
        }
    }

    public void setItemPosition(int i) {
        this.f7005 = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f6989 = colorStateList;
        m3936();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f6997 != i) {
            this.f6997 = i;
            if (this.f7017 && i == 2) {
                this.f7012 = f6987;
            } else {
                this.f7012 = f6986;
            }
            m3938(getWidth());
            m3935();
        }
    }

    public void setShifting(boolean z) {
        if (this.f6998 != z) {
            this.f6998 = z;
            m3935();
        }
    }

    public void setTextAppearanceActive(int i) {
        this.f7006 = i;
        TextView textView = this.f7004;
        m3930(textView, i);
        m3934(this.f7003.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        setTextAppearanceActive(this.f7006);
        TextView textView = this.f7004;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.f7003;
        m3930(textView, i);
        m3934(textView.getTextSize(), this.f7004.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f7003.setTextColor(colorStateList);
            this.f7004.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f7003.setText(charSequence);
        this.f7004.setText(charSequence);
        MenuItemC1946 menuItemC1946 = this.f7007;
        if (menuItemC1946 == null || TextUtils.isEmpty(menuItemC1946.f6443)) {
            setContentDescription(charSequence);
        }
        MenuItemC1946 menuItemC1947 = this.f7007;
        if (menuItemC1947 != null && !TextUtils.isEmpty(menuItemC1947.f6444)) {
            charSequence = this.f7007.f6444;
        }
        AbstractC3419.m4935(this, charSequence);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3934(float f, float f2) {
        this.f6994 = f - f2;
        this.f6995 = (f2 * 1.0f) / f;
        this.f6996 = (f * 1.0f) / f2;
    }

    @Override // p000.InterfaceC1956
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2(MenuItemC1946 menuItemC1946) {
        this.f7007 = menuItemC1946;
        setCheckable(menuItemC1946.isCheckable());
        setChecked(menuItemC1946.isChecked());
        setEnabled(menuItemC1946.isEnabled());
        setIcon(menuItemC1946.getIcon());
        setTitle(menuItemC1946.f6431);
        setId(menuItemC1946.f6427);
        if (!TextUtils.isEmpty(menuItemC1946.f6443)) {
            setContentDescription(menuItemC1946.f6443);
        }
        AbstractC3419.m4935(this, !TextUtils.isEmpty(menuItemC1946.f6444) ? menuItemC1946.f6444 : menuItemC1946.f6431);
        setVisibility(menuItemC1946.isVisible() ? 0 : 8);
        this.f6988 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3935() {
        MenuItemC1946 menuItemC1946 = this.f7007;
        if (menuItemC1946 != null) {
            setChecked(menuItemC1946.isChecked());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3936() {
        Drawable rippleDrawable = this.f6990;
        ColorStateList colorStateList = this.f6989;
        FrameLayout frameLayout = this.f6999;
        RippleDrawable rippleDrawable2 = null;
        boolean z = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f7014 && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(AbstractC2589.m4597(this.f6989), null, activeIndicatorDrawable);
                z = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(AbstractC2589.m4595(this.f6989), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable2);
        }
        Field field = AbstractC3578.f11184;
        setBackground(rippleDrawable);
        setDefaultFocusHighlightEnabled(z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3937(float f, float f2) {
        View view = this.f7000;
        if (view != null) {
            C2102 c2102 = this.f7012;
            c2102.getClass();
            view.setScaleX(AbstractC0164.m1211(0.4f, 1.0f, f));
            view.setScaleY(c2102.mo3900(f, f2));
            view.setAlpha(AbstractC0164.m1212(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        }
        this.f7013 = f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m3938(int i) {
        View view = this.f7000;
        if (view == null || i <= 0) {
            return;
        }
        int iMin = Math.min(this.f7015, i - (this.f7018 * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.f7017 && this.f6997 == 2) ? iMin : this.f7016;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f6990 = drawable;
        m3936();
    }
}
