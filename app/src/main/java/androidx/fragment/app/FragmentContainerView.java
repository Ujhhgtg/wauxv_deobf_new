package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import me.hd.wauxv.R;
import p000.AbstractC0769feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf;
import p000.C2256feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ArrayList f288Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ArrayList f289Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public View.OnApplyWindowInsetsListener f290Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f291Ujhhgtgfeyxiexzf;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        this.f288Ujhhgtgfeyxiexzf = new ArrayList();
        this.f289Ujhhgtgfeyxiexzf = new ArrayList();
        this.f291Ujhhgtgfeyxiexzf = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0769feyxiexzfUjhhgtg.f3051Ujhhgtgfeyxiexzf, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf ? (AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf;
        C2256feyxiexzfUjhhgtg c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf2 = C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f290Ujhhgtgfeyxiexzf;
        if (onApplyWindowInsetsListener != null) {
            c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf = C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            WindowInsets windowInsetsM3453Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf2.m3453Ujhhgtgfeyxiexzf();
            if (windowInsetsM3453Ujhhgtgfeyxiexzf != null && !windowInsetsM3453Ujhhgtgfeyxiexzf.equals(windowInsetsM3453Ujhhgtgfeyxiexzf)) {
                c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf2 = C2256feyxiexzfUjhhgtg.m3450Ujhhgtgfeyxiexzf(this, windowInsetsM3453Ujhhgtgfeyxiexzf);
            }
            c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf = c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf2;
        }
        if (!c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf.f7334Ujhhgtgfeyxiexzf.mo3440Ujhhgtgfeyxiexzf()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                AbstractC1901feyxiexzfUjhhgtg.m3255Ujhhgtgfeyxiexzf(getChildAt(i), c2256feyxiexzfUjhhgtgM3450Ujhhgtgfeyxiexzf);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f291Ujhhgtgfeyxiexzf) {
            Iterator it = this.f288Ujhhgtgfeyxiexzf.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.f291Ujhhgtgfeyxiexzf) {
            ArrayList arrayList = this.f288Ujhhgtgfeyxiexzf;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        this.f289Ujhhgtgfeyxiexzf.remove(view);
        if (this.f288Ujhhgtgfeyxiexzf.remove(view)) {
            this.f291Ujhhgtgfeyxiexzf = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf> F getFragment() {
        AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf;
        View view = this;
        while (true) {
            abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf2 = tag instanceof AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf ? (AbstractComponentCallbacksC3532Ujhhgtgfeyxiexzf) tag : null;
            if (abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf2 != null) {
                abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf = abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf2;
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf != null) {
            throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC3532Ujhhgtgfeyxiexzf + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
        }
        throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            m95Ujhhgtgfeyxiexzf(getChildAt(childCount));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m95Ujhhgtgfeyxiexzf(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        m95Ujhhgtgfeyxiexzf(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m95Ujhhgtgfeyxiexzf(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m95Ujhhgtgfeyxiexzf(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m95Ujhhgtgfeyxiexzf(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f291Ujhhgtgfeyxiexzf = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f290Ujhhgtgfeyxiexzf = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.f289Ujhhgtgfeyxiexzf.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m95Ujhhgtgfeyxiexzf(View view) {
        if (this.f289Ujhhgtgfeyxiexzf.contains(view)) {
            this.f288Ujhhgtgfeyxiexzf.add(view);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }
}
