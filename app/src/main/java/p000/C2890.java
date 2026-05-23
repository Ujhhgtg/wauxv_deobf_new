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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᤝᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2890 extends LinearLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int f9253 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C2888 f9254;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public TextView f9255;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public ImageView f9256;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public View f9257;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C0363 f9258;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public View f9259;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public TextView f9260;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ImageView f9261;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Drawable f9262;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public int f9263;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2891 f9264;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2890(C2891 c2891, Context context) {
        super(context);
        this.f9264 = c2891;
        this.f9263 = 2;
        m4885(context);
        int i = c2891.f9270;
        int i2 = c2891.f9271;
        int i3 = c2891.f9272;
        int i4 = c2891.f9273;
        Field field = AbstractC3578.f11184;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!c2891.f9295 ? 1 : 0);
        setClickable(true);
        AbstractC3572.m5153(this, PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private C0363 getBadge() {
        return this.f9258;
    }

    private C0363 getOrCreateBadge() {
        if (this.f9258 == null) {
            this.f9258 = new C0363(getContext(), null);
        }
        m4882();
        C0363 c0363 = this.f9258;
        if (c0363 != null) {
            return c0363;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9262;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f9262.setState(drawableState)) {
            invalidate();
            this.f9264.invalidate();
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.f9255, this.f9256, this.f9259};
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
        View[] viewArr = {this.f9255, this.f9256, this.f9259};
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

    public C2888 getTab() {
        return this.f9254;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0363 c0363 = this.f9258;
        if (c0363 != null && c0363.isVisible()) {
            accessibilityNodeInfo.setContentDescription(this.f9258.m1477());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0091.m1085(0, 1, this.f9254.f9247, 1, isSelected()).f1044);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C0085.f1027.f1038);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        C2891 c2891 = this.f9264;
        int tabMaxWidth = c2891.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(c2891.f9286, -2147483648);
        }
        super.onMeasure(i, i2);
        if (this.f9255 != null) {
            float f = c2891.f9283;
            int i3 = this.f9263;
            ImageView imageView = this.f9256;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f9255;
                if (textView != null && textView.getLineCount() > 1) {
                    f = c2891.f9284;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.f9255.getTextSize();
            int lineCount = this.f9255.getLineCount();
            int maxLines = this.f9255.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (c2891.f9294 == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.f9255.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f9255.setTextSize(0, f);
                this.f9255.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f9254 == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        C2888 c2888 = this.f9254;
        C2891 c2891 = c2888.f9249;
        if (c2891 == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        c2891.m4896(c2888);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.f9255;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f9256;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f9259;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C2888 c2888) {
        if (c2888 != this.f9254) {
            this.f9254 = c2888;
            m4884();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4881() {
        if (this.f9258 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f9257;
            if (view != null) {
                C0363 c0363 = this.f9258;
                if (c0363 != null) {
                    if (c0363.m1478() != null) {
                        c0363.m1478().setForeground(null);
                    } else {
                        view.getOverlay().remove(c0363);
                    }
                }
                this.f9257 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4882() {
        C2888 c2888;
        if (this.f9258 != null) {
            if (this.f9259 != null) {
                m4881();
                return;
            }
            ImageView imageView = this.f9256;
            if (imageView != null && (c2888 = this.f9254) != null && c2888.f9244 != null) {
                if (this.f9257 == imageView) {
                    m4883(imageView);
                    return;
                }
                m4881();
                ImageView imageView2 = this.f9256;
                if (this.f9258 == null || imageView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                C0363 c0363 = this.f9258;
                Rect rect = new Rect();
                imageView2.getDrawingRect(rect);
                c0363.setBounds(rect);
                c0363.m1483(imageView2, null);
                if (c0363.m1478() != null) {
                    c0363.m1478().setForeground(c0363);
                } else {
                    imageView2.getOverlay().add(c0363);
                }
                this.f9257 = imageView2;
                return;
            }
            TextView textView = this.f9255;
            if (textView == null || this.f9254 == null) {
                m4881();
                return;
            }
            if (this.f9257 == textView) {
                m4883(textView);
                return;
            }
            m4881();
            TextView textView2 = this.f9255;
            if (this.f9258 == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
            }
            C0363 c0364 = this.f9258;
            Rect rect2 = new Rect();
            textView2.getDrawingRect(rect2);
            c0364.setBounds(rect2);
            c0364.m1483(textView2, null);
            if (c0364.m1478() != null) {
                c0364.m1478().setForeground(c0364);
            } else {
                textView2.getOverlay().add(c0364);
            }
            this.f9257 = textView2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4883(View view) {
        C0363 c0363 = this.f9258;
        if (c0363 == null || view != this.f9257) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c0363.setBounds(rect);
        c0363.m1483(view, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4884() {
        boolean z;
        m4886();
        C2888 c2888 = this.f9254;
        if (c2888 == null) {
            z = false;
        } else {
            C2891 c2891 = c2888.f9249;
            if (c2891 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = c2891.getSelectedTabPosition();
            if (selectedTabPosition == -1 || selectedTabPosition != c2888.f9247) {
                z = false;
            } else {
                z = true;
            }
        }
        setSelected(z);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4885(Context context) {
        GradientDrawable gradientDrawable;
        C2891 c2891 = this.f9264;
        int i = c2891.f9285;
        if (i != 0) {
            Drawable drawableM5076 = AbstractC3471.m5076(context, i);
            this.f9262 = drawableM5076;
            if (drawableM5076 != null && drawableM5076.isStateful()) {
                this.f9262.setState(getDrawableState());
            }
        } else {
            this.f9262 = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (c2891.f9279 != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateListM4595 = AbstractC2589.m4595(c2891.f9279);
            boolean z = c2891.f9299;
            if (z) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateListM4595, gradientDrawable, z ? null : gradientDrawable3);
        }
        Field field = AbstractC3578.f11184;
        setBackground(rippleDrawable);
        c2891.invalidate();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4886() {
        int i;
        ViewParent parent;
        C2888 c2888 = this.f9254;
        View view = c2888 != null ? c2888.f9248 : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f9259;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f9259);
                }
                addView(view);
            }
            this.f9259 = view;
            TextView textView = this.f9255;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f9256;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f9256.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(16908308);
            this.f9260 = textView2;
            if (textView2 != null) {
                this.f9263 = textView2.getMaxLines();
            }
            this.f9261 = (ImageView) view.findViewById(16908294);
        } else {
            View view3 = this.f9259;
            if (view3 != null) {
                removeView(view3);
                this.f9259 = null;
            }
            this.f9260 = null;
            this.f9261 = null;
        }
        if (this.f9259 == null) {
            if (this.f9256 == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f9256 = imageView2;
                addView(imageView2, 0);
            }
            if (this.f9255 == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f9255 = textView3;
                addView(textView3);
                this.f9263 = this.f9255.getMaxLines();
            }
            TextView textView4 = this.f9255;
            C2891 c2891 = this.f9264;
            textView4.setTextAppearance(c2891.f9274);
            if (!isSelected() || (i = c2891.f9276) == -1) {
                this.f9255.setTextAppearance(c2891.f9275);
            } else {
                this.f9255.setTextAppearance(i);
            }
            ColorStateList colorStateList = c2891.f9277;
            if (colorStateList != null) {
                this.f9255.setTextColor(colorStateList);
            }
            m4887(this.f9255, this.f9256, true);
            m4882();
            ImageView imageView3 = this.f9256;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2889(this, imageView3));
            }
            TextView textView5 = this.f9255;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2889(this, textView5));
            }
        } else {
            TextView textView6 = this.f9260;
            if (textView6 != null || this.f9261 != null) {
                m4887(textView6, this.f9261, false);
            }
        }
        if (c2888 == null || TextUtils.isEmpty(c2888.f9246)) {
            return;
        }
        setContentDescription(c2888.f9246);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4887(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        Drawable drawable;
        C2888 c2888 = this.f9254;
        Drawable drawableMutate = (c2888 == null || (drawable = c2888.f9244) == null) ? null : drawable.mutate();
        C2891 c2891 = this.f9264;
        if (drawableMutate != null) {
            drawableMutate.setTintList(c2891.f9278);
            PorterDuff.Mode mode = c2891.f9282;
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
        }
        C2888 c2889 = this.f9254;
        CharSequence charSequence = c2889 != null ? c2889.f9245 : null;
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
            int iM3180 = (z2 && imageView.getVisibility() == 0) ? (int) AbstractC1459.m3180(getContext(), 8) : 0;
            if (c2891.f9295) {
                if (iM3180 != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iM3180);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iM3180 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iM3180;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        C2888 c28810 = this.f9254;
        CharSequence charSequence2 = c28810 != null ? c28810.f9246 : null;
        if (zIsEmpty) {
            charSequence = charSequence2;
        }
        AbstractC3419.m4935(this, charSequence);
    }
}
