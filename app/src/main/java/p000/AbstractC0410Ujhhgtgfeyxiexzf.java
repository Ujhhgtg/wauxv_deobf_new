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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0410Ujhhgtgfeyxiexzf extends FrameLayout implements InterfaceC0367Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static final int[] f2198feyxiexzfUjhhgtg = {R.attr.state_checked};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static final C0420Ujhhgtgfeyxiexzf f2199feyxiexzfUjhhgtg = new C0420Ujhhgtgfeyxiexzf(3);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public static final C0409Ujhhgtgfeyxiexzf f2200feyxiexzfUjhhgtg = new C0409Ujhhgtgfeyxiexzf(3);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f2201Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public ColorStateList f2202Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Drawable f2203Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f2204Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f2205Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f2206Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public float f2207Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public float f2208Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public float f2209Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f2210Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean f2211Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final FrameLayout f2212Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final View f2213Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ImageView f2214Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final ViewGroup f2215Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final TextView f2216Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final TextView f2217Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public int f2218Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f2219Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public MenuItemC0357Ujhhgtgfeyxiexzf f2220Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public ColorStateList f2221Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Drawable f2222Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public Drawable f2223feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public ValueAnimator f2224feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public C0420Ujhhgtgfeyxiexzf f2225feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public float f2226feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f2227feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f2228feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public int f2229feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public boolean f2230feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public int f2231feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public C2449feyxiexzfUjhhgtg f2232feyxiexzfUjhhgtg;

    public AbstractC0410Ujhhgtgfeyxiexzf(Context context) {
        super(context);
        this.f2201Ujhhgtgfeyxiexzf = false;
        this.f2218Ujhhgtgfeyxiexzf = -1;
        this.f2219Ujhhgtgfeyxiexzf = 0;
        this.f2225feyxiexzfUjhhgtg = f2199feyxiexzfUjhhgtg;
        this.f2226feyxiexzfUjhhgtg = 0.0f;
        this.f2227feyxiexzfUjhhgtg = false;
        this.f2228feyxiexzfUjhhgtg = 0;
        this.f2229feyxiexzfUjhhgtg = 0;
        this.f2230feyxiexzfUjhhgtg = false;
        this.f2231feyxiexzfUjhhgtg = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f2212Ujhhgtgfeyxiexzf = (FrameLayout) findViewById(me.hd.wauxv.R.id.navigation_bar_item_icon_container);
        this.f2213Ujhhgtgfeyxiexzf = findViewById(me.hd.wauxv.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(me.hd.wauxv.R.id.navigation_bar_item_icon_view);
        this.f2214Ujhhgtgfeyxiexzf = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(me.hd.wauxv.R.id.navigation_bar_item_labels_group);
        this.f2215Ujhhgtgfeyxiexzf = viewGroup;
        TextView textView = (TextView) findViewById(me.hd.wauxv.R.id.navigation_bar_item_small_label_view);
        this.f2216Ujhhgtgfeyxiexzf = textView;
        TextView textView2 = (TextView) findViewById(me.hd.wauxv.R.id.navigation_bar_item_large_label_view);
        this.f2217Ujhhgtgfeyxiexzf = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f2204Ujhhgtgfeyxiexzf = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f2205Ujhhgtgfeyxiexzf = viewGroup.getPaddingBottom();
        this.f2206Ujhhgtgfeyxiexzf = getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.m3_navigation_item_active_indicator_label_padding);
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        int i = 2;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        m1693Ujhhgtgfeyxiexzf(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2660feyxiexzfUjhhgtg(i, (C2661feyxiexzfUjhhgtg) this));
        }
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f2212Ujhhgtgfeyxiexzf;
        return frameLayout != null ? frameLayout : this.f2214Ujhhgtgfeyxiexzf;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof AbstractC0410Ujhhgtgfeyxiexzf) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg = this.f2232feyxiexzfUjhhgtg;
        int minimumWidth = c2449feyxiexzfUjhhgtg == null ? 0 : c2449feyxiexzfUjhhgtg.getMinimumWidth() - this.f2232feyxiexzfUjhhgtg.f7921Ujhhgtgfeyxiexzf.f7936Ujhhgtgfeyxiexzf.f7968feyxiexzfUjhhgtg.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f2214Ujhhgtgfeyxiexzf.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m1689Ujhhgtgfeyxiexzf(TextView textView, int i) {
        int iRound;
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0799feyxiexzfUjhhgtg.f3150feyxiexzfUjhhgtg);
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m1690Ujhhgtgfeyxiexzf(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static void m1691Ujhhgtgfeyxiexzf(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m1692Ujhhgtgfeyxiexzf(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f2212Ujhhgtgfeyxiexzf;
        if (frameLayout != null && this.f2227feyxiexzfUjhhgtg) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f2213Ujhhgtgfeyxiexzf;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C2449feyxiexzfUjhhgtg getBadge() {
        return this.f2232feyxiexzfUjhhgtg;
    }

    public int getItemBackgroundResId() {
        return me.hd.wauxv.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // p000.InterfaceC0367Ujhhgtgfeyxiexzf
    public MenuItemC0357Ujhhgtgfeyxiexzf getItemData() {
        return this.f2220Ujhhgtgfeyxiexzf;
    }

    public int getItemDefaultMarginResId() {
        return me.hd.wauxv.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f2218Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f2215Ujhhgtgfeyxiexzf;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f2206Ujhhgtgfeyxiexzf : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f2215Ujhhgtgfeyxiexzf;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = this.f2220Ujhhgtgfeyxiexzf;
        if (menuItemC0357Ujhhgtgfeyxiexzf != null && menuItemC0357Ujhhgtgfeyxiexzf.isCheckable() && this.f2220Ujhhgtgfeyxiexzf.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2198feyxiexzfUjhhgtg);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg = this.f2232feyxiexzfUjhhgtg;
        if (c2449feyxiexzfUjhhgtg != null && c2449feyxiexzfUjhhgtg.isVisible()) {
            MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = this.f2220Ujhhgtgfeyxiexzf;
            CharSequence charSequence = menuItemC0357Ujhhgtgfeyxiexzf.f2028Ujhhgtgfeyxiexzf;
            if (!TextUtils.isEmpty(menuItemC0357Ujhhgtgfeyxiexzf.f2040Ujhhgtgfeyxiexzf)) {
                charSequence = this.f2220Ujhhgtgfeyxiexzf.f2040Ujhhgtgfeyxiexzf;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f2232feyxiexzfUjhhgtg.m3683Ujhhgtgfeyxiexzf()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C2962feyxiexzfUjhhgtg.m4429Ujhhgtgfeyxiexzf(0, 1, getItemVisiblePosition(), 1, isSelected()).f9271Ujhhgtgfeyxiexzf);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C2956feyxiexzfUjhhgtg.f9254Ujhhgtgfeyxiexzf.f9265Ujhhgtgfeyxiexzf);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(me.hd.wauxv.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new RunnableC2474feyxiexzfUjhhgtg(i, 3, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f2213Ujhhgtgfeyxiexzf;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        m1695Ujhhgtgfeyxiexzf();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.f2227feyxiexzfUjhhgtg = z;
        m1695Ujhhgtgfeyxiexzf();
        View view = this.f2213Ujhhgtgfeyxiexzf;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f2229feyxiexzfUjhhgtg = i;
        m1697Ujhhgtgfeyxiexzf(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f2206Ujhhgtgfeyxiexzf != i) {
            this.f2206Ujhhgtgfeyxiexzf = i;
            m1694Ujhhgtgfeyxiexzf();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f2231feyxiexzfUjhhgtg = i;
        m1697Ujhhgtgfeyxiexzf(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f2230feyxiexzfUjhhgtg = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f2228feyxiexzfUjhhgtg = i;
        m1697Ujhhgtgfeyxiexzf(getWidth());
    }

    public void setBadge(C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg) {
        C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg2 = this.f2232feyxiexzfUjhhgtg;
        if (c2449feyxiexzfUjhhgtg2 == c2449feyxiexzfUjhhgtg) {
            return;
        }
        ImageView imageView = this.f2214Ujhhgtgfeyxiexzf;
        if (c2449feyxiexzfUjhhgtg2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f2232feyxiexzfUjhhgtg != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg3 = this.f2232feyxiexzfUjhhgtg;
                if (c2449feyxiexzfUjhhgtg3 != null) {
                    if (c2449feyxiexzfUjhhgtg3.m3684Ujhhgtgfeyxiexzf() != null) {
                        c2449feyxiexzfUjhhgtg3.m3684Ujhhgtgfeyxiexzf().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(c2449feyxiexzfUjhhgtg3);
                    }
                }
                this.f2232feyxiexzfUjhhgtg = null;
            }
        }
        this.f2232feyxiexzfUjhhgtg = c2449feyxiexzfUjhhgtg;
        if (imageView == null || c2449feyxiexzfUjhhgtg == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg4 = this.f2232feyxiexzfUjhhgtg;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        c2449feyxiexzfUjhhgtg4.setBounds(rect);
        c2449feyxiexzfUjhhgtg4.m3689Ujhhgtgfeyxiexzf(imageView, null);
        if (c2449feyxiexzfUjhhgtg4.m3684Ujhhgtgfeyxiexzf() != null) {
            c2449feyxiexzfUjhhgtg4.m3684Ujhhgtgfeyxiexzf().setForeground(c2449feyxiexzfUjhhgtg4);
        } else {
            imageView.getOverlay().add(c2449feyxiexzfUjhhgtg4);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0095  */
    public void setChecked(boolean z) {
        TextView textView = this.f2217Ujhhgtgfeyxiexzf;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.f2216Ujhhgtgfeyxiexzf;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f = z ? 1.0f : 0.0f;
        if (this.f2227feyxiexzfUjhhgtg && this.f2201Ujhhgtgfeyxiexzf) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.f2224feyxiexzfUjhhgtg;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f2224feyxiexzfUjhhgtg = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f2226feyxiexzfUjhhgtg, f);
                this.f2224feyxiexzfUjhhgtg = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new C0413Ujhhgtgfeyxiexzf(this, f));
                this.f2224feyxiexzfUjhhgtg.setInterpolator(AbstractC1265feyxiexzfUjhhgtg.m2834Ujhhgtgfeyxiexzf(getContext(), me.hd.wauxv.R.attr.motionEasingEmphasizedInterpolator, AbstractC3036feyxiexzfUjhhgtg.f9413Ujhhgtgfeyxiexzf));
                this.f2224feyxiexzfUjhhgtg.setDuration(AbstractC1265feyxiexzfUjhhgtg.m2833Ujhhgtgfeyxiexzf(getContext(), me.hd.wauxv.R.attr.motionDurationLong2, getResources().getInteger(me.hd.wauxv.R.integer.material_motion_duration_long_1)));
                this.f2224feyxiexzfUjhhgtg.start();
            } else {
                m1696Ujhhgtgfeyxiexzf(f, f);
            }
        } else {
            m1696Ujhhgtgfeyxiexzf(f, f);
        }
        int i = this.f2210Ujhhgtgfeyxiexzf;
        ViewGroup viewGroup = this.f2215Ujhhgtgfeyxiexzf;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m1691Ujhhgtgfeyxiexzf(getIconOrContainer(), this.f2204Ujhhgtgfeyxiexzf, 49);
                    m1692Ujhhgtgfeyxiexzf(viewGroup, this.f2205Ujhhgtgfeyxiexzf);
                    textView.setVisibility(0);
                } else {
                    m1691Ujhhgtgfeyxiexzf(getIconOrContainer(), this.f2204Ujhhgtgfeyxiexzf, 17);
                    m1692Ujhhgtgfeyxiexzf(viewGroup, 0);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i == 1) {
                m1692Ujhhgtgfeyxiexzf(viewGroup, this.f2205Ujhhgtgfeyxiexzf);
                if (z) {
                    m1691Ujhhgtgfeyxiexzf(getIconOrContainer(), (int) (this.f2204Ujhhgtgfeyxiexzf + this.f2207Ujhhgtgfeyxiexzf), 49);
                    m1690Ujhhgtgfeyxiexzf(textView, 1.0f, 1.0f, 0);
                    float f2 = this.f2208Ujhhgtgfeyxiexzf;
                    m1690Ujhhgtgfeyxiexzf(textView2, f2, f2, 4);
                } else {
                    m1691Ujhhgtgfeyxiexzf(getIconOrContainer(), this.f2204Ujhhgtgfeyxiexzf, 49);
                    float f3 = this.f2209Ujhhgtgfeyxiexzf;
                    m1690Ujhhgtgfeyxiexzf(textView, f3, f3, 4);
                    m1690Ujhhgtgfeyxiexzf(textView2, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m1691Ujhhgtgfeyxiexzf(getIconOrContainer(), this.f2204Ujhhgtgfeyxiexzf, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.f2211Ujhhgtgfeyxiexzf) {
            if (z) {
                m1691Ujhhgtgfeyxiexzf(getIconOrContainer(), this.f2204Ujhhgtgfeyxiexzf, 49);
                m1692Ujhhgtgfeyxiexzf(viewGroup, this.f2205Ujhhgtgfeyxiexzf);
                textView.setVisibility(0);
            } else {
                m1691Ujhhgtgfeyxiexzf(getIconOrContainer(), this.f2204Ujhhgtgfeyxiexzf, 17);
                m1692Ujhhgtgfeyxiexzf(viewGroup, 0);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            m1692Ujhhgtgfeyxiexzf(viewGroup, this.f2205Ujhhgtgfeyxiexzf);
            if (z) {
                m1691Ujhhgtgfeyxiexzf(getIconOrContainer(), (int) (this.f2204Ujhhgtgfeyxiexzf + this.f2207Ujhhgtgfeyxiexzf), 49);
                m1690Ujhhgtgfeyxiexzf(textView, 1.0f, 1.0f, 0);
                float f4 = this.f2208Ujhhgtgfeyxiexzf;
                m1690Ujhhgtgfeyxiexzf(textView2, f4, f4, 4);
            } else {
                m1691Ujhhgtgfeyxiexzf(getIconOrContainer(), this.f2204Ujhhgtgfeyxiexzf, 49);
                float f5 = this.f2209Ujhhgtgfeyxiexzf;
                m1690Ujhhgtgfeyxiexzf(textView, f5, f5, 4);
                m1690Ujhhgtgfeyxiexzf(textView2, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f2216Ujhhgtgfeyxiexzf.setEnabled(z);
        this.f2217Ujhhgtgfeyxiexzf.setEnabled(z);
        this.f2214Ujhhgtgfeyxiexzf.setEnabled(z);
        if (!z) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            AbstractC1895Ujhhgtgfeyxiexzf.m3230Ujhhgtgfeyxiexzf(this, null);
        } else {
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            AbstractC1895Ujhhgtgfeyxiexzf.m3230Ujhhgtgfeyxiexzf(this, systemIcon);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f2222Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f2222Ujhhgtgfeyxiexzf = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f2223feyxiexzfUjhhgtg = drawable;
            ColorStateList colorStateList = this.f2221Ujhhgtgfeyxiexzf;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f2214Ujhhgtgfeyxiexzf.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.f2214Ujhhgtgfeyxiexzf;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f2221Ujhhgtgfeyxiexzf = colorStateList;
        if (this.f2220Ujhhgtgfeyxiexzf == null || (drawable = this.f2223feyxiexzfUjhhgtg) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f2223feyxiexzfUjhhgtg.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f2205Ujhhgtgfeyxiexzf != i) {
            this.f2205Ujhhgtgfeyxiexzf = i;
            m1694Ujhhgtgfeyxiexzf();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f2204Ujhhgtgfeyxiexzf != i) {
            this.f2204Ujhhgtgfeyxiexzf = i;
            m1694Ujhhgtgfeyxiexzf();
        }
    }

    public void setItemPosition(int i) {
        this.f2218Ujhhgtgfeyxiexzf = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f2202Ujhhgtgfeyxiexzf = colorStateList;
        m1695Ujhhgtgfeyxiexzf();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f2210Ujhhgtgfeyxiexzf != i) {
            this.f2210Ujhhgtgfeyxiexzf = i;
            if (this.f2230feyxiexzfUjhhgtg && i == 2) {
                this.f2225feyxiexzfUjhhgtg = f2200feyxiexzfUjhhgtg;
            } else {
                this.f2225feyxiexzfUjhhgtg = f2199feyxiexzfUjhhgtg;
            }
            m1697Ujhhgtgfeyxiexzf(getWidth());
            m1694Ujhhgtgfeyxiexzf();
        }
    }

    public void setShifting(boolean z) {
        if (this.f2211Ujhhgtgfeyxiexzf != z) {
            this.f2211Ujhhgtgfeyxiexzf = z;
            m1694Ujhhgtgfeyxiexzf();
        }
    }

    public void setTextAppearanceActive(int i) {
        this.f2219Ujhhgtgfeyxiexzf = i;
        TextView textView = this.f2217Ujhhgtgfeyxiexzf;
        m1689Ujhhgtgfeyxiexzf(textView, i);
        m1693Ujhhgtgfeyxiexzf(this.f2216Ujhhgtgfeyxiexzf.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        setTextAppearanceActive(this.f2219Ujhhgtgfeyxiexzf);
        TextView textView = this.f2217Ujhhgtgfeyxiexzf;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.f2216Ujhhgtgfeyxiexzf;
        m1689Ujhhgtgfeyxiexzf(textView, i);
        m1693Ujhhgtgfeyxiexzf(textView.getTextSize(), this.f2217Ujhhgtgfeyxiexzf.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f2216Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
            this.f2217Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f2216Ujhhgtgfeyxiexzf.setText(charSequence);
        this.f2217Ujhhgtgfeyxiexzf.setText(charSequence);
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = this.f2220Ujhhgtgfeyxiexzf;
        if (menuItemC0357Ujhhgtgfeyxiexzf == null || TextUtils.isEmpty(menuItemC0357Ujhhgtgfeyxiexzf.f2040Ujhhgtgfeyxiexzf)) {
            setContentDescription(charSequence);
        }
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf2 = this.f2220Ujhhgtgfeyxiexzf;
        if (menuItemC0357Ujhhgtgfeyxiexzf2 != null && !TextUtils.isEmpty(menuItemC0357Ujhhgtgfeyxiexzf2.f2041Ujhhgtgfeyxiexzf)) {
            charSequence = this.f2220Ujhhgtgfeyxiexzf.f2041Ujhhgtgfeyxiexzf;
        }
        AbstractC1763feyxiexzfUjhhgtg.m3059Ujhhgtgfeyxiexzf(this, charSequence);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m1693Ujhhgtgfeyxiexzf(float f, float f2) {
        this.f2207Ujhhgtgfeyxiexzf = f - f2;
        this.f2208Ujhhgtgfeyxiexzf = (f2 * 1.0f) / f;
        this.f2209Ujhhgtgfeyxiexzf = (f * 1.0f) / f2;
    }

    @Override // p000.InterfaceC0367Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo2Ujhhgtgfeyxiexzf(MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf) {
        this.f2220Ujhhgtgfeyxiexzf = menuItemC0357Ujhhgtgfeyxiexzf;
        setCheckable(menuItemC0357Ujhhgtgfeyxiexzf.isCheckable());
        setChecked(menuItemC0357Ujhhgtgfeyxiexzf.isChecked());
        setEnabled(menuItemC0357Ujhhgtgfeyxiexzf.isEnabled());
        setIcon(menuItemC0357Ujhhgtgfeyxiexzf.getIcon());
        setTitle(menuItemC0357Ujhhgtgfeyxiexzf.f2028Ujhhgtgfeyxiexzf);
        setId(menuItemC0357Ujhhgtgfeyxiexzf.f2024Ujhhgtgfeyxiexzf);
        if (!TextUtils.isEmpty(menuItemC0357Ujhhgtgfeyxiexzf.f2040Ujhhgtgfeyxiexzf)) {
            setContentDescription(menuItemC0357Ujhhgtgfeyxiexzf.f2040Ujhhgtgfeyxiexzf);
        }
        AbstractC1763feyxiexzfUjhhgtg.m3059Ujhhgtgfeyxiexzf(this, !TextUtils.isEmpty(menuItemC0357Ujhhgtgfeyxiexzf.f2041Ujhhgtgfeyxiexzf) ? menuItemC0357Ujhhgtgfeyxiexzf.f2041Ujhhgtgfeyxiexzf : menuItemC0357Ujhhgtgfeyxiexzf.f2028Ujhhgtgfeyxiexzf);
        setVisibility(menuItemC0357Ujhhgtgfeyxiexzf.isVisible() ? 0 : 8);
        this.f2201Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m1694Ujhhgtgfeyxiexzf() {
        MenuItemC0357Ujhhgtgfeyxiexzf menuItemC0357Ujhhgtgfeyxiexzf = this.f2220Ujhhgtgfeyxiexzf;
        if (menuItemC0357Ujhhgtgfeyxiexzf != null) {
            setChecked(menuItemC0357Ujhhgtgfeyxiexzf.isChecked());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1695Ujhhgtgfeyxiexzf() {
        Drawable rippleDrawable = this.f2203Ujhhgtgfeyxiexzf;
        ColorStateList colorStateList = this.f2202Ujhhgtgfeyxiexzf;
        FrameLayout frameLayout = this.f2212Ujhhgtgfeyxiexzf;
        RippleDrawable rippleDrawable2 = null;
        boolean z = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f2227feyxiexzfUjhhgtg && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(AbstractC0925feyxiexzfUjhhgtg.m2425Ujhhgtgfeyxiexzf(this.f2202Ujhhgtgfeyxiexzf), null, activeIndicatorDrawable);
                z = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(AbstractC0925feyxiexzfUjhhgtg.m2423Ujhhgtgfeyxiexzf(this.f2202Ujhhgtgfeyxiexzf), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable2);
        }
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        setBackground(rippleDrawable);
        setDefaultFocusHighlightEnabled(z);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m1696Ujhhgtgfeyxiexzf(float f, float f2) {
        View view = this.f2213Ujhhgtgfeyxiexzf;
        if (view != null) {
            C0420Ujhhgtgfeyxiexzf c0420Ujhhgtgfeyxiexzf = this.f2225feyxiexzfUjhhgtg;
            c0420Ujhhgtgfeyxiexzf.getClass();
            view.setScaleX(AbstractC3036feyxiexzfUjhhgtg.m4509Ujhhgtgfeyxiexzf(0.4f, 1.0f, f));
            view.setScaleY(c0420Ujhhgtgfeyxiexzf.mo1688Ujhhgtgfeyxiexzf(f, f2));
            view.setAlpha(AbstractC3036feyxiexzfUjhhgtg.m4510Ujhhgtgfeyxiexzf(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        }
        this.f2226feyxiexzfUjhhgtg = f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m1697Ujhhgtgfeyxiexzf(int i) {
        View view = this.f2213Ujhhgtgfeyxiexzf;
        if (view == null || i <= 0) {
            return;
        }
        int iMin = Math.min(this.f2228feyxiexzfUjhhgtg, i - (this.f2231feyxiexzfUjhhgtg * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.f2230feyxiexzfUjhhgtg && this.f2210Ujhhgtgfeyxiexzf == 2) ? iMin : this.f2229feyxiexzfUjhhgtg;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f2203Ujhhgtgfeyxiexzf = drawable;
        m1695Ujhhgtgfeyxiexzf();
    }
}
