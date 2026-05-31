package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Field;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᲇᤞᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2949 extends LinearLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f9420 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C2947 f9421;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public TextView f9422;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ImageView f9423;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public View f9424;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0338 f9425;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public View f9426;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public TextView f9427;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ImageView f9428;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public Drawable f9429;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f9430;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2950 f9431;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2949(C2950 c2950, Context context) {
        super(context);
        this.f9431 = c2950;
        this.f9430 = 2;
        m4946(context);
        int i = c2950.f9437;
        int i2 = c2950.f9438;
        int i3 = c2950.f9439;
        int i4 = c2950.f9440;
        Field field = AbstractC3638.f11333;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!c2950.f9462 ? 1 : 0);
        setClickable(true);
        AbstractC3632.m5159(this, PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private C0338 getBadge() {
        return this.f9425;
    }

    private C0338 getOrCreateBadge() {
        if (this.f9425 == null) {
            this.f9425 = new C0338(getContext(), null);
        }
        m4943();
        C0338 c0338 = this.f9425;
        if (c0338 != null) {
            return c0338;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9429;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f9429.setState(drawableState)) {
            invalidate();
            this.f9431.invalidate();
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.f9422, this.f9423, this.f9426};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f9422, this.f9423, this.f9426};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public C2947 getTab() {
        return this.f9421;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0338 c0338 = this.f9425;
        if (c0338 != null && c0338.isVisible()) {
            accessibilityNodeInfo.setContentDescription(this.f9425.m1582());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0099.m1231(0, 1, this.f9421.f9414, 1, isSelected()).f1112);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C0093.f1095.f1106);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        C2950 c2950 = this.f9431;
        int tabMaxWidth = c2950.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(c2950.f9453, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f9422 != null) {
            float f = c2950.f9450;
            int i3 = this.f9430;
            ImageView imageView = this.f9423;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f9422;
                if (textView != null && textView.getLineCount() > 1) {
                    f = c2950.f9451;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.f9422.getTextSize();
            int lineCount = this.f9422.getLineCount();
            int maxLines = this.f9422.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (c2950.f9461 == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.f9422.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f9422.setTextSize(0, f);
                this.f9422.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f9421 == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        C2947 c2947 = this.f9421;
        C2950 c2950 = c2947.f9416;
        if (c2950 == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        c2950.m4958(c2947);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.f9422;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f9423;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f9426;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C2947 c2947) {
        if (c2947 != this.f9421) {
            this.f9421 = c2947;
            m4945();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4942() {
        if (this.f9425 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f9424;
            if (view != null) {
                C0338 c0338 = this.f9425;
                if (c0338 != null) {
                    if (c0338.m1583() != null) {
                        c0338.m1583().setForeground(null);
                    } else {
                        view.getOverlay().remove(c0338);
                    }
                }
                this.f9424 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4943() {
        C2947 c2947;
        if (this.f9425 != null) {
            if (this.f9426 != null) {
                m4942();
                return;
            }
            ImageView imageView = this.f9423;
            if (imageView != null && (c2947 = this.f9421) != null && c2947.f9411 != null) {
                if (this.f9424 == imageView) {
                    m4944(imageView);
                    return;
                }
                m4942();
                ImageView imageView2 = this.f9423;
                if (this.f9425 == null || imageView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                C0338 c0338 = this.f9425;
                Rect rect = new Rect();
                imageView2.getDrawingRect(rect);
                c0338.setBounds(rect);
                c0338.m1588(imageView2, null);
                if (c0338.m1583() != null) {
                    c0338.m1583().setForeground(c0338);
                } else {
                    imageView2.getOverlay().add(c0338);
                }
                this.f9424 = imageView2;
                return;
            }
            TextView textView = this.f9422;
            if (textView == null || this.f9421 == null) {
                m4942();
                return;
            }
            if (this.f9424 == textView) {
                m4944(textView);
                return;
            }
            m4942();
            TextView textView2 = this.f9422;
            if (this.f9425 == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
            }
            C0338 c0339 = this.f9425;
            Rect rect2 = new Rect();
            textView2.getDrawingRect(rect2);
            c0339.setBounds(rect2);
            c0339.m1588(textView2, null);
            if (c0339.m1583() != null) {
                c0339.m1583().setForeground(c0339);
            } else {
                textView2.getOverlay().add(c0339);
            }
            this.f9424 = textView2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4944(View view) {
        C0338 c0338 = this.f9425;
        if (c0338 == null || view != this.f9424) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c0338.setBounds(rect);
        c0338.m1588(view, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4945() {
        boolean z;
        m4947();
        C2947 c2947 = this.f9421;
        if (c2947 == null) {
            z = false;
        } else {
            C2950 c2950 = c2947.f9416;
            if (c2950 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = c2950.getSelectedTabPosition();
            if (selectedTabPosition == -1 || selectedTabPosition != c2947.f9414) {
                z = false;
            } else {
                z = true;
            }
        }
        setSelected(z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4946(Context context) {
        GradientDrawable gradientDrawable;
        C2950 c2950 = this.f9431;
        int i = c2950.f9452;
        if (i != 0) {
            Drawable drawableM3667 = C1787.m3667(context, i);
            this.f9429 = drawableM3667;
            if (drawableM3667 != null && drawableM3667.isStateful()) {
                this.f9429.setState(getDrawableState());
            }
        } else {
            this.f9429 = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (c2950.f9446 != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateListM4617 = AbstractC2646.m4617(c2950.f9446);
            boolean z = c2950.f9466;
            if (z) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateListM4617, gradientDrawable, z ? null : gradientDrawable3);
        }
        Field field = AbstractC3638.f11333;
        setBackground(rippleDrawable);
        c2950.invalidate();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4947() {
        int i;
        ViewParent parent;
        C2947 c2947 = this.f9421;
        View view = c2947 != null ? c2947.f9415 : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f9426;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f9426);
                }
                addView(view);
            }
            this.f9426 = view;
            TextView textView = this.f9422;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f9423;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f9423.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
            this.f9427 = textView2;
            if (textView2 != null) {
                this.f9430 = textView2.getMaxLines();
            }
            this.f9428 = (ImageView) view.findViewById(android.R.id.icon);
        } else {
            View view3 = this.f9426;
            if (view3 != null) {
                removeView(view3);
                this.f9426 = null;
            }
            this.f9427 = null;
            this.f9428 = null;
        }
        if (this.f9426 == null) {
            if (this.f9423 == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f9423 = imageView2;
                addView(imageView2, 0);
            }
            if (this.f9422 == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f9422 = textView3;
                addView(textView3);
                this.f9430 = this.f9422.getMaxLines();
            }
            TextView textView4 = this.f9422;
            C2950 c2950 = this.f9431;
            textView4.setTextAppearance(c2950.f9441);
            if (!isSelected() || (i = c2950.f9443) == -1) {
                this.f9422.setTextAppearance(c2950.f9442);
            } else {
                this.f9422.setTextAppearance(i);
            }
            ColorStateList colorStateList = c2950.f9444;
            if (colorStateList != null) {
                this.f9422.setTextColor(colorStateList);
            }
            m4948(this.f9422, this.f9423, true);
            m4943();
            ImageView imageView3 = this.f9423;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2948(this, imageView3));
            }
            TextView textView5 = this.f9422;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2948(this, textView5));
            }
        } else {
            TextView textView6 = this.f9427;
            if (textView6 != null || this.f9428 != null) {
                m4948(textView6, this.f9428, false);
            }
        }
        if (c2947 == null || TextUtils.isEmpty(c2947.f9413)) {
            return;
        }
        setContentDescription(c2947.f9413);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4948(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        Drawable drawable;
        C2947 c2947 = this.f9421;
        Drawable drawableMutate = (c2947 == null || (drawable = c2947.f9411) == null) ? null : drawable.mutate();
        C2950 c2950 = this.f9431;
        if (drawableMutate != null) {
            drawableMutate.setTintList(c2950.f9445);
            PorterDuff.Mode mode = c2950.f9449;
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
        }
        C2947 c2948 = this.f9421;
        CharSequence charSequence = c2948 != null ? c2948.f9412 : null;
        if (imageView != null) {
            if (drawableMutate != null) {
                imageView.setImageDrawable(drawableMutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                z2 = false;
            } else {
                this.f9421.getClass();
                z2 = true;
            }
            textView.setText(!zIsEmpty ? charSequence : null);
            textView.setVisibility(z2 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iM3383 = (z2 && imageView.getVisibility() == 0) ? (int) AbstractC1471.m3383(getContext(), 8) : 0;
            if (c2950.f9462) {
                if (iM3383 != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iM3383);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iM3383 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iM3383;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        C2947 c2949 = this.f9421;
        CharSequence charSequence2 = c2949 != null ? c2949.f9413 : null;
        if (zIsEmpty) {
            charSequence = charSequence2;
        }
        AbstractC3477.m4997(this, charSequence);
    }
}
