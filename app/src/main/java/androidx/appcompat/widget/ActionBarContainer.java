package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import me.hd.wauxv.R;
import p000.AbstractC0801feyxiexzfUjhhgtg;
import p000.AbstractC1083feyxiexzfUjhhgtg;
import p000.C2993Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f31Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public View f32Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public View f33Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Drawable f34Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Drawable f35Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public Drawable f36Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean f37Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f38Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int f39Ujhhgtgfeyxiexzf;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C2993Ujhhgtgfeyxiexzf(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0801feyxiexzfUjhhgtg.f3158Ujhhgtgfeyxiexzf);
        boolean z = false;
        this.f34Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f35Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f39Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f37Ujhhgtgfeyxiexzf = true;
            this.f36Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f37Ujhhgtgfeyxiexzf ? !(this.f34Ujhhgtgfeyxiexzf != null || this.f35Ujhhgtgfeyxiexzf != null) : this.f36Ujhhgtgfeyxiexzf == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f34Ujhhgtgfeyxiexzf;
        if (drawable != null && drawable.isStateful()) {
            this.f34Ujhhgtgfeyxiexzf.setState(getDrawableState());
        }
        Drawable drawable2 = this.f35Ujhhgtgfeyxiexzf;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f35Ujhhgtgfeyxiexzf.setState(getDrawableState());
        }
        Drawable drawable3 = this.f36Ujhhgtgfeyxiexzf;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f36Ujhhgtgfeyxiexzf.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f34Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f35Ujhhgtgfeyxiexzf;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f36Ujhhgtgfeyxiexzf;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f32Ujhhgtgfeyxiexzf = findViewById(R.id.action_bar);
        this.f33Ujhhgtgfeyxiexzf = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f31Ujhhgtgfeyxiexzf || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f37Ujhhgtgfeyxiexzf) {
            Drawable drawable = this.f36Ujhhgtgfeyxiexzf;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f34Ujhhgtgfeyxiexzf == null) {
                z2 = false;
            } else if (this.f32Ujhhgtgfeyxiexzf.getVisibility() == 0) {
                this.f34Ujhhgtgfeyxiexzf.setBounds(this.f32Ujhhgtgfeyxiexzf.getLeft(), this.f32Ujhhgtgfeyxiexzf.getTop(), this.f32Ujhhgtgfeyxiexzf.getRight(), this.f32Ujhhgtgfeyxiexzf.getBottom());
            } else {
                View view = this.f33Ujhhgtgfeyxiexzf;
                if (view == null || view.getVisibility() != 0) {
                    this.f34Ujhhgtgfeyxiexzf.setBounds(0, 0, 0, 0);
                } else {
                    this.f34Ujhhgtgfeyxiexzf.setBounds(this.f33Ujhhgtgfeyxiexzf.getLeft(), this.f33Ujhhgtgfeyxiexzf.getTop(), this.f33Ujhhgtgfeyxiexzf.getRight(), this.f33Ujhhgtgfeyxiexzf.getBottom());
                }
            }
            this.f38Ujhhgtgfeyxiexzf = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f32Ujhhgtgfeyxiexzf == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f39Ujhhgtgfeyxiexzf) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f32Ujhhgtgfeyxiexzf == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f34Ujhhgtgfeyxiexzf;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f34Ujhhgtgfeyxiexzf);
        }
        this.f34Ujhhgtgfeyxiexzf = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f32Ujhhgtgfeyxiexzf;
            if (view != null) {
                this.f34Ujhhgtgfeyxiexzf.setBounds(view.getLeft(), this.f32Ujhhgtgfeyxiexzf.getTop(), this.f32Ujhhgtgfeyxiexzf.getRight(), this.f32Ujhhgtgfeyxiexzf.getBottom());
            }
        }
        boolean z = false;
        if (!this.f37Ujhhgtgfeyxiexzf ? !(this.f34Ujhhgtgfeyxiexzf != null || this.f35Ujhhgtgfeyxiexzf != null) : this.f36Ujhhgtgfeyxiexzf == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f36Ujhhgtgfeyxiexzf;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f36Ujhhgtgfeyxiexzf);
        }
        this.f36Ujhhgtgfeyxiexzf = drawable;
        boolean z = this.f37Ujhhgtgfeyxiexzf;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f36Ujhhgtgfeyxiexzf) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f34Ujhhgtgfeyxiexzf != null || this.f35Ujhhgtgfeyxiexzf != null) : this.f36Ujhhgtgfeyxiexzf == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f35Ujhhgtgfeyxiexzf;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f35Ujhhgtgfeyxiexzf);
        }
        this.f35Ujhhgtgfeyxiexzf = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f38Ujhhgtgfeyxiexzf && this.f35Ujhhgtgfeyxiexzf != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f37Ujhhgtgfeyxiexzf ? !(this.f34Ujhhgtgfeyxiexzf != null || this.f35Ujhhgtgfeyxiexzf != null) : this.f36Ujhhgtgfeyxiexzf == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f31Ujhhgtgfeyxiexzf = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f34Ujhhgtgfeyxiexzf;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f35Ujhhgtgfeyxiexzf;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f36Ujhhgtgfeyxiexzf;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f34Ujhhgtgfeyxiexzf;
        boolean z = this.f37Ujhhgtgfeyxiexzf;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f35Ujhhgtgfeyxiexzf && this.f38Ujhhgtgfeyxiexzf) {
            return true;
        }
        return (drawable == this.f36Ujhhgtgfeyxiexzf && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(AbstractC1083feyxiexzfUjhhgtg abstractC1083feyxiexzfUjhhgtg) {
    }
}
