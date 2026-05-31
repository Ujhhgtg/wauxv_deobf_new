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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲁᤝᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2157 extends FrameLayout implements InterfaceC1987 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static final int[] f7109 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static final C2135 f7110 = new C2135(3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static final C2156 f7111 = new C2156(3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f7112;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ColorStateList f7113;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Drawable f7114;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f7115;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f7116;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f7117;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f7118;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f7119;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f7120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f7121;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f7122;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final FrameLayout f7123;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final View f7124;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final ImageView f7125;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final ViewGroup f7126;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final TextView f7127;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final TextView f7128;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f7129;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public int f7130;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public MenuItemC1977 f7131;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public ColorStateList f7132;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public Drawable f7133;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public Drawable f7134;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public ValueAnimator f7135;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public C2135 f7136;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public float f7137;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public boolean f7138;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public int f7139;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public int f7140;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public boolean f7141;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int f7142;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public C0338 f7143;

    public AbstractC2157(Context context) {
        super(context);
        this.f7112 = false;
        this.f7129 = -1;
        this.f7130 = 0;
        this.f7136 = f7110;
        this.f7137 = 0.0f;
        this.f7138 = false;
        this.f7139 = 0;
        this.f7140 = 0;
        this.f7141 = false;
        this.f7142 = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f7123 = (FrameLayout) findViewById(me.hd.wauxv.R.id.navigation_bar_item_icon_container);
        this.f7124 = findViewById(me.hd.wauxv.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(me.hd.wauxv.R.id.navigation_bar_item_icon_view);
        this.f7125 = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(me.hd.wauxv.R.id.navigation_bar_item_labels_group);
        this.f7126 = viewGroup;
        TextView textView = (TextView) findViewById(me.hd.wauxv.R.id.navigation_bar_item_small_label_view);
        this.f7127 = textView;
        TextView textView2 = (TextView) findViewById(me.hd.wauxv.R.id.navigation_bar_item_large_label_view);
        this.f7128 = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f7115 = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f7116 = viewGroup.getPaddingBottom();
        this.f7117 = getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.m3_navigation_item_active_indicator_label_padding);
        Field field = AbstractC3638.f11333;
        int i = 2;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        m4118(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0420((C0421) this, i));
        }
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f7123;
        return frameLayout != null ? frameLayout : this.f7125;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof AbstractC2157) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        C0338 c0338 = this.f7143;
        int minimumWidth = c0338 == null ? 0 : c0338.getMinimumWidth() - this.f7143.f1661.f1701.f1692.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f7125.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m4114(TextView textView, int i) {
        int iRound;
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC2521.f8019);
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
    public static void m4115(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static void m4116(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static void m4117(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f7123;
        if (frameLayout != null && this.f7138) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f7124;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C0338 getBadge() {
        return this.f7143;
    }

    public int getItemBackgroundResId() {
        return me.hd.wauxv.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // p000.InterfaceC1987
    public MenuItemC1977 getItemData() {
        return this.f7131;
    }

    public int getItemDefaultMarginResId() {
        return me.hd.wauxv.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f7129;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f7126;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f7117 : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f7126;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemC1977 menuItemC1977 = this.f7131;
        if (menuItemC1977 != null && menuItemC1977.isCheckable() && this.f7131.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7109);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0338 c0338 = this.f7143;
        if (c0338 != null && c0338.isVisible()) {
            MenuItemC1977 menuItemC1977 = this.f7131;
            CharSequence charSequence = menuItemC1977.f6536;
            if (!TextUtils.isEmpty(menuItemC1977.f6548)) {
                charSequence = this.f7131.f6548;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f7143.m1582()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0099.m1231(0, 1, getItemVisiblePosition(), 1, isSelected()).f1112);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C0093.f1095.f1106);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(me.hd.wauxv.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new RunnableC0361(i, 3, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f7124;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        m4120();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.f7138 = z;
        m4120();
        View view = this.f7124;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f7140 = i;
        m4122(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f7117 != i) {
            this.f7117 = i;
            m4119();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f7142 = i;
        m4122(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f7141 = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f7139 = i;
        m4122(getWidth());
    }

    public void setBadge(C0338 c0338) {
        C0338 c0339 = this.f7143;
        if (c0339 == c0338) {
            return;
        }
        ImageView imageView = this.f7125;
        if (c0339 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f7143 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C0338 c03310 = this.f7143;
                if (c03310 != null) {
                    if (c03310.m1583() != null) {
                        c03310.m1583().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(c03310);
                    }
                }
                this.f7143 = null;
            }
        }
        this.f7143 = c0338;
        if (imageView == null || c0338 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        C0338 c03311 = this.f7143;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        c03311.setBounds(rect);
        c03311.m1588(imageView, null);
        if (c03311.m1583() != null) {
            c03311.m1583().setForeground(c03311);
        } else {
            imageView.getOverlay().add(c03311);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0095  */
    public void setChecked(boolean z) {
        TextView textView = this.f7128;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.f7127;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f = z ? 1.0f : 0.0f;
        if (this.f7138 && this.f7112) {
            Field field = AbstractC3638.f11333;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.f7135;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f7135 = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f7137, f);
                this.f7135 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new C2155(this, f));
                this.f7135.setInterpolator(AbstractC3744.m5342(getContext(), me.hd.wauxv.R.attr.motionEasingEmphasizedInterpolator, AbstractC0172.f1254));
                this.f7135.setDuration(AbstractC3744.m5341(getContext(), me.hd.wauxv.R.attr.motionDurationLong2, getResources().getInteger(me.hd.wauxv.R.integer.material_motion_duration_long_1)));
                this.f7135.start();
            } else {
                m4121(f, f);
            }
        } else {
            m4121(f, f);
        }
        int i = this.f7121;
        ViewGroup viewGroup = this.f7126;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m4116(getIconOrContainer(), this.f7115, 49);
                    m4117(viewGroup, this.f7116);
                    textView.setVisibility(0);
                } else {
                    m4116(getIconOrContainer(), this.f7115, 17);
                    m4117(viewGroup, 0);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i == 1) {
                m4117(viewGroup, this.f7116);
                if (z) {
                    m4116(getIconOrContainer(), (int) (this.f7115 + this.f7118), 49);
                    m4115(textView, 1.0f, 1.0f, 0);
                    float f2 = this.f7119;
                    m4115(textView2, f2, f2, 4);
                } else {
                    m4116(getIconOrContainer(), this.f7115, 49);
                    float f3 = this.f7120;
                    m4115(textView, f3, f3, 4);
                    m4115(textView2, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m4116(getIconOrContainer(), this.f7115, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.f7122) {
            if (z) {
                m4116(getIconOrContainer(), this.f7115, 49);
                m4117(viewGroup, this.f7116);
                textView.setVisibility(0);
            } else {
                m4116(getIconOrContainer(), this.f7115, 17);
                m4117(viewGroup, 0);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            m4117(viewGroup, this.f7116);
            if (z) {
                m4116(getIconOrContainer(), (int) (this.f7115 + this.f7118), 49);
                m4115(textView, 1.0f, 1.0f, 0);
                float f4 = this.f7119;
                m4115(textView2, f4, f4, 4);
            } else {
                m4116(getIconOrContainer(), this.f7115, 49);
                float f5 = this.f7120;
                m4115(textView, f5, f5, 4);
                m4115(textView2, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f7127.setEnabled(z);
        this.f7128.setEnabled(z);
        this.f7125.setEnabled(z);
        if (!z) {
            Field field = AbstractC3638.f11333;
            AbstractC3632.m5159(this, null);
        } else {
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            Field field2 = AbstractC3638.f11333;
            AbstractC3632.m5159(this, systemIcon);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f7133) {
            return;
        }
        this.f7133 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f7134 = drawable;
            ColorStateList colorStateList = this.f7132;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f7125.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.f7125;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f7132 = colorStateList;
        if (this.f7131 == null || (drawable = this.f7134) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f7134.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f7116 != i) {
            this.f7116 = i;
            m4119();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f7115 != i) {
            this.f7115 = i;
            m4119();
        }
    }

    public void setItemPosition(int i) {
        this.f7129 = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f7113 = colorStateList;
        m4120();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f7121 != i) {
            this.f7121 = i;
            if (this.f7141 && i == 2) {
                this.f7136 = f7111;
            } else {
                this.f7136 = f7110;
            }
            m4122(getWidth());
            m4119();
        }
    }

    public void setShifting(boolean z) {
        if (this.f7122 != z) {
            this.f7122 = z;
            m4119();
        }
    }

    public void setTextAppearanceActive(int i) {
        this.f7130 = i;
        TextView textView = this.f7128;
        m4114(textView, i);
        m4118(this.f7127.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        setTextAppearanceActive(this.f7130);
        TextView textView = this.f7128;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.f7127;
        m4114(textView, i);
        m4118(textView.getTextSize(), this.f7128.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f7127.setTextColor(colorStateList);
            this.f7128.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f7127.setText(charSequence);
        this.f7128.setText(charSequence);
        MenuItemC1977 menuItemC1977 = this.f7131;
        if (menuItemC1977 == null || TextUtils.isEmpty(menuItemC1977.f6548)) {
            setContentDescription(charSequence);
        }
        MenuItemC1977 menuItemC1978 = this.f7131;
        if (menuItemC1978 != null && !TextUtils.isEmpty(menuItemC1978.f6549)) {
            charSequence = this.f7131.f6549;
        }
        AbstractC3477.m4997(this, charSequence);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4118(float f, float f2) {
        this.f7118 = f - f2;
        this.f7119 = (f2 * 1.0f) / f;
        this.f7120 = (f * 1.0f) / f2;
    }

    @Override // p000.InterfaceC1987
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2(MenuItemC1977 menuItemC1977) {
        this.f7131 = menuItemC1977;
        setCheckable(menuItemC1977.isCheckable());
        setChecked(menuItemC1977.isChecked());
        setEnabled(menuItemC1977.isEnabled());
        setIcon(menuItemC1977.getIcon());
        setTitle(menuItemC1977.f6536);
        setId(menuItemC1977.f6532);
        if (!TextUtils.isEmpty(menuItemC1977.f6548)) {
            setContentDescription(menuItemC1977.f6548);
        }
        AbstractC3477.m4997(this, !TextUtils.isEmpty(menuItemC1977.f6549) ? menuItemC1977.f6549 : menuItemC1977.f6536);
        setVisibility(menuItemC1977.isVisible() ? 0 : 8);
        this.f7112 = true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4119() {
        MenuItemC1977 menuItemC1977 = this.f7131;
        if (menuItemC1977 != null) {
            setChecked(menuItemC1977.isChecked());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4120() {
        Drawable rippleDrawable = this.f7114;
        ColorStateList colorStateList = this.f7113;
        FrameLayout frameLayout = this.f7123;
        RippleDrawable rippleDrawable2 = null;
        boolean z = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f7138 && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(AbstractC2646.m4619(this.f7113), null, activeIndicatorDrawable);
                z = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(AbstractC2646.m4617(this.f7113), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable2);
        }
        Field field = AbstractC3638.f11333;
        setBackground(rippleDrawable);
        setDefaultFocusHighlightEnabled(z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4121(float f, float f2) {
        View view = this.f7124;
        if (view != null) {
            C2135 c2135 = this.f7136;
            c2135.getClass();
            view.setScaleX(AbstractC0172.m1357(0.4f, 1.0f, f));
            view.setScaleY(c2135.mo4083(f, f2));
            view.setAlpha(AbstractC0172.m1358(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        }
        this.f7137 = f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m4122(int i) {
        View view = this.f7124;
        if (view == null || i <= 0) {
            return;
        }
        int iMin = Math.min(this.f7139, i - (this.f7142 * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.f7141 && this.f7121 == 2) ? iMin : this.f7140;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f7114 = drawable;
        m4120();
    }
}
