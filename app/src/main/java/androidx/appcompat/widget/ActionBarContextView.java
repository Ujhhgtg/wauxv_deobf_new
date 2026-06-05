package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.hd.wauxv.R;
import p000.AbstractC0801feyxiexzfUjhhgtg;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f40Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f41Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f42Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public CharSequence f43Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public CharSequence f44Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public View f45Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public LinearLayout f46Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public TextView f47Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public TextView f48Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f49Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final int f50Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public boolean f51Ujhhgtgfeyxiexzf;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0801feyxiexzfUjhhgtg.f3161Ujhhgtgfeyxiexzf, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context, resourceId));
        this.f49Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f50Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f40Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static int m7Ujhhgtgfeyxiexzf(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f40Ujhhgtgfeyxiexzf;
    }

    public CharSequence getSubtitle() {
        return this.f44Ujhhgtgfeyxiexzf;
    }

    public CharSequence getTitle() {
        return this.f43Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0801feyxiexzfUjhhgtg.f3158Ujhhgtgfeyxiexzf, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f42Ujhhgtgfeyxiexzf = false;
        }
        if (!this.f42Ujhhgtgfeyxiexzf) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f42Ujhhgtgfeyxiexzf = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f42Ujhhgtgfeyxiexzf = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f46Ujhhgtgfeyxiexzf;
        if (linearLayout != null && this.f45Ujhhgtgfeyxiexzf == null && linearLayout.getVisibility() != 8) {
            paddingRight += m7Ujhhgtgfeyxiexzf(this.f46Ujhhgtgfeyxiexzf, paddingRight, paddingTop, paddingTop2, z2);
        }
        View view = this.f45Ujhhgtgfeyxiexzf;
        if (view != null) {
            m7Ujhhgtgfeyxiexzf(view, paddingRight, paddingTop, paddingTop2, z2);
        }
        if (z2) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f40Ujhhgtgfeyxiexzf;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f46Ujhhgtgfeyxiexzf;
        if (linearLayout != null && this.f45Ujhhgtgfeyxiexzf == null) {
            if (this.f51Ujhhgtgfeyxiexzf) {
                this.f46Ujhhgtgfeyxiexzf.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f46Ujhhgtgfeyxiexzf.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f46Ujhhgtgfeyxiexzf.setVisibility(z ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), iMakeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f45Ujhhgtgfeyxiexzf;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f45Ujhhgtgfeyxiexzf.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f40Ujhhgtgfeyxiexzf > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f41Ujhhgtgfeyxiexzf = false;
        }
        if (!this.f41Ujhhgtgfeyxiexzf) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f41Ujhhgtgfeyxiexzf = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f41Ujhhgtgfeyxiexzf = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f40Ujhhgtgfeyxiexzf = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f45Ujhhgtgfeyxiexzf;
        if (view2 != null) {
            removeView(view2);
        }
        this.f45Ujhhgtgfeyxiexzf = view;
        if (view != null && (linearLayout = this.f46Ujhhgtgfeyxiexzf) != null) {
            removeView(linearLayout);
            this.f46Ujhhgtgfeyxiexzf = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f44Ujhhgtgfeyxiexzf = charSequence;
        m8Ujhhgtgfeyxiexzf();
    }

    public void setTitle(CharSequence charSequence) {
        this.f43Ujhhgtgfeyxiexzf = charSequence;
        m8Ujhhgtgfeyxiexzf();
        AbstractC1901feyxiexzfUjhhgtg.m3266Ujhhgtgfeyxiexzf(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f51Ujhhgtgfeyxiexzf) {
            requestLayout();
        }
        this.f51Ujhhgtgfeyxiexzf = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m8Ujhhgtgfeyxiexzf() {
        if (this.f46Ujhhgtgfeyxiexzf == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f46Ujhhgtgfeyxiexzf = linearLayout;
            this.f47Ujhhgtgfeyxiexzf = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f48Ujhhgtgfeyxiexzf = (TextView) this.f46Ujhhgtgfeyxiexzf.findViewById(R.id.action_bar_subtitle);
            int i = this.f49Ujhhgtgfeyxiexzf;
            if (i != 0) {
                this.f47Ujhhgtgfeyxiexzf.setTextAppearance(getContext(), i);
            }
            int i2 = this.f50Ujhhgtgfeyxiexzf;
            if (i2 != 0) {
                this.f48Ujhhgtgfeyxiexzf.setTextAppearance(getContext(), i2);
            }
        }
        this.f47Ujhhgtgfeyxiexzf.setText(this.f43Ujhhgtgfeyxiexzf);
        this.f48Ujhhgtgfeyxiexzf.setText(this.f44Ujhhgtgfeyxiexzf);
        boolean zIsEmpty = TextUtils.isEmpty(this.f43Ujhhgtgfeyxiexzf);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f44Ujhhgtgfeyxiexzf);
        this.f48Ujhhgtgfeyxiexzf.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f46Ujhhgtgfeyxiexzf.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f46Ujhhgtgfeyxiexzf.getParent() == null) {
            addView(this.f46Ujhhgtgfeyxiexzf);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
        }
    }
}
