package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.reflect.Field;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳ要点脸ᛲᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2505feyxiexzfUjhhgtg extends FrameLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final ViewOnTouchListenerC2504feyxiexzfUjhhgtg f8176Ujhhgtgfeyxiexzf = new ViewOnTouchListenerC2504feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1017feyxiexzfUjhhgtg f8177Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f8178Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final float f8179Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final float f8180Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int f8181Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f8182Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public ColorStateList f8183Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public PorterDuff.Mode f8184Ujhhgtgfeyxiexzf;

    public AbstractC2505feyxiexzfUjhhgtg(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3147feyxiexzfUjhhgtg);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            setElevation(dimensionPixelSize);
        }
        this.f8178Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f8177Ujhhgtgfeyxiexzf = C1017feyxiexzfUjhhgtg.m2511Ujhhgtgfeyxiexzf(context2, attributeSet, 0, 0).m2507Ujhhgtgfeyxiexzf();
        }
        this.f8179Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC1937feyxiexzfUjhhgtg.m3284Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f8180Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f8181Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f8182Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f8176Ujhhgtgfeyxiexzf);
        setFocusable(true);
        if (getBackground() == null) {
            int iM4216feyxiexzfUjhhgtg = AbstractC2855feyxiexzfUjhhgtg.m4216feyxiexzfUjhhgtg(AbstractC2855feyxiexzfUjhhgtg.m4211feyxiexzfUjhhgtg(this, R.attr.colorSurface), AbstractC2855feyxiexzfUjhhgtg.m4211feyxiexzfUjhhgtg(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg = this.f8177Ujhhgtgfeyxiexzf;
            if (c1017feyxiexzfUjhhgtg != null) {
                int i = AbstractC2506feyxiexzfUjhhgtg.f8185Ujhhgtgfeyxiexzf;
                C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf(c1017feyxiexzfUjhhgtg);
                c0226Ujhhgtgfeyxiexzf.m1369Ujhhgtgfeyxiexzf(ColorStateList.valueOf(iM4216feyxiexzfUjhhgtg));
                drawable = c0226Ujhhgtgfeyxiexzf;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC2506feyxiexzfUjhhgtg.f8185Ujhhgtgfeyxiexzf;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM4216feyxiexzfUjhhgtg);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f8183Ujhhgtgfeyxiexzf;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f8180Ujhhgtgfeyxiexzf;
    }

    public int getAnimationMode() {
        return this.f8178Ujhhgtgfeyxiexzf;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f8179Ujhhgtgfeyxiexzf;
    }

    public int getMaxInlineActionWidth() {
        return this.f8182Ujhhgtgfeyxiexzf;
    }

    public int getMaxWidth() {
        return this.f8181Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f8181Ujhhgtgfeyxiexzf;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f8178Ujhhgtgfeyxiexzf = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f8183Ujhhgtgfeyxiexzf != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f8183Ujhhgtgfeyxiexzf);
            drawable.setTintMode(this.f8184Ujhhgtgfeyxiexzf);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f8183Ujhhgtgfeyxiexzf = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f8184Ujhhgtgfeyxiexzf);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f8184Ujhhgtgfeyxiexzf = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f8176Ujhhgtgfeyxiexzf);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC2506feyxiexzfUjhhgtg abstractC2506feyxiexzfUjhhgtg) {
    }
}
