package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3231feyxiexzfUjhhgtg extends ListView {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Rect f10133Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f10134Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f10135Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f10136Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f10137Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f10138Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C3229feyxiexzfUjhhgtg f10139Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f10140Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final boolean f10141Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f10142Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public ViewOnTouchListenerC0254Ujhhgtgfeyxiexzf f10143Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public RunnableC3012feyxiexzfUjhhgtg f10144Ujhhgtgfeyxiexzf;

    public AbstractC3231feyxiexzfUjhhgtg(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f10133Ujhhgtgfeyxiexzf = new Rect();
        this.f10134Ujhhgtgfeyxiexzf = 0;
        this.f10135Ujhhgtgfeyxiexzf = 0;
        this.f10136Ujhhgtgfeyxiexzf = 0;
        this.f10137Ujhhgtgfeyxiexzf = 0;
        this.f10141Ujhhgtgfeyxiexzf = z;
        setCacheColorHint(0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f10133Ujhhgtgfeyxiexzf;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f10144Ujhhgtgfeyxiexzf != null) {
            return;
        }
        super.drawableStateChanged();
        C3229feyxiexzfUjhhgtg c3229feyxiexzfUjhhgtg = this.f10139Ujhhgtgfeyxiexzf;
        if (c3229feyxiexzfUjhhgtg != null) {
            c3229feyxiexzfUjhhgtg.f10132Ujhhgtgfeyxiexzf = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f10142Ujhhgtgfeyxiexzf && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f10141Ujhhgtgfeyxiexzf || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f10141Ujhhgtgfeyxiexzf || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f10141Ujhhgtgfeyxiexzf || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f10141Ujhhgtgfeyxiexzf && this.f10140Ujhhgtgfeyxiexzf) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f10144Ujhhgtgfeyxiexzf = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f10144Ujhhgtgfeyxiexzf == null) {
            RunnableC3012feyxiexzfUjhhgtg runnableC3012feyxiexzfUjhhgtg = new RunnableC3012feyxiexzfUjhhgtg(6, this);
            this.f10144Ujhhgtgfeyxiexzf = runnableC3012feyxiexzfUjhhgtg;
            post(runnableC3012feyxiexzfUjhhgtg);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !AbstractC3234feyxiexzfUjhhgtg.f10149Ujhhgtgfeyxiexzf) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC3234feyxiexzfUjhhgtg.f10146Ujhhgtgfeyxiexzf.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC3234feyxiexzfUjhhgtg.f10147Ujhhgtgfeyxiexzf.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC3234feyxiexzfUjhhgtg.f10148Ujhhgtgfeyxiexzf.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f10142Ujhhgtgfeyxiexzf && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f10138Ujhhgtgfeyxiexzf = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC3012feyxiexzfUjhhgtg runnableC3012feyxiexzfUjhhgtg = this.f10144Ujhhgtgfeyxiexzf;
        if (runnableC3012feyxiexzfUjhhgtg != null) {
            AbstractC3231feyxiexzfUjhhgtg abstractC3231feyxiexzfUjhhgtg = (AbstractC3231feyxiexzfUjhhgtg) runnableC3012feyxiexzfUjhhgtg.f9363Ujhhgtgfeyxiexzf;
            abstractC3231feyxiexzfUjhhgtg.f10144Ujhhgtgfeyxiexzf = null;
            abstractC3231feyxiexzfUjhhgtg.removeCallbacks(runnableC3012feyxiexzfUjhhgtg);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f10140Ujhhgtgfeyxiexzf = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C3229feyxiexzfUjhhgtg c3229feyxiexzfUjhhgtg = null;
        if (drawable != null) {
            C3229feyxiexzfUjhhgtg c3229feyxiexzfUjhhgtg2 = new C3229feyxiexzfUjhhgtg();
            Drawable drawable2 = c3229feyxiexzfUjhhgtg2.f10131Ujhhgtgfeyxiexzf;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c3229feyxiexzfUjhhgtg2.f10131Ujhhgtgfeyxiexzf = drawable;
            drawable.setCallback(c3229feyxiexzfUjhhgtg2);
            c3229feyxiexzfUjhhgtg2.f10132Ujhhgtgfeyxiexzf = true;
            c3229feyxiexzfUjhhgtg = c3229feyxiexzfUjhhgtg2;
        }
        this.f10139Ujhhgtgfeyxiexzf = c3229feyxiexzfUjhhgtg;
        super.setSelector(c3229feyxiexzfUjhhgtg);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f10134Ujhhgtgfeyxiexzf = rect.left;
        this.f10135Ujhhgtgfeyxiexzf = rect.top;
        this.f10136Ujhhgtgfeyxiexzf = rect.right;
        this.f10137Ujhhgtgfeyxiexzf = rect.bottom;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int m4737Ujhhgtgfeyxiexzf(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean m4738Ujhhgtgfeyxiexzf(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM4735Ujhhgtgfeyxiexzf;
        View childAt;
        View childAt2;
        ViewOnTouchListenerC0254Ujhhgtgfeyxiexzf viewOnTouchListenerC0254Ujhhgtgfeyxiexzf;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
            } else {
                z = false;
            }
            if (z || z2) {
                this.f10142Ujhhgtgfeyxiexzf = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f10138Ujhhgtgfeyxiexzf - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z) {
                if (this.f10143Ujhhgtgfeyxiexzf == null) {
                    this.f10143Ujhhgtgfeyxiexzf = new ViewOnTouchListenerC0254Ujhhgtgfeyxiexzf(this);
                }
                ViewOnTouchListenerC0254Ujhhgtgfeyxiexzf viewOnTouchListenerC0254Ujhhgtgfeyxiexzf2 = this.f10143Ujhhgtgfeyxiexzf;
                boolean z3 = viewOnTouchListenerC0254Ujhhgtgfeyxiexzf2.f1625Ujhhgtgfeyxiexzf;
                viewOnTouchListenerC0254Ujhhgtgfeyxiexzf2.f1625Ujhhgtgfeyxiexzf = true;
                viewOnTouchListenerC0254Ujhhgtgfeyxiexzf2.onTouch(this, motionEvent);
            } else {
                viewOnTouchListenerC0254Ujhhgtgfeyxiexzf = this.f10143Ujhhgtgfeyxiexzf;
                if (viewOnTouchListenerC0254Ujhhgtgfeyxiexzf != null) {
                    if (viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1625Ujhhgtgfeyxiexzf) {
                        viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.m1421Ujhhgtgfeyxiexzf();
                    }
                    viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1625Ujhhgtgfeyxiexzf = false;
                }
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z2 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f10142Ujhhgtgfeyxiexzf = true;
                int i2 = Build.VERSION.SDK_INT;
                AbstractC3233feyxiexzfUjhhgtg.m4739Ujhhgtgfeyxiexzf(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f10138Ujhhgtgfeyxiexzf;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f10138Ujhhgtgfeyxiexzf = iPointToPosition;
                AbstractC3233feyxiexzfUjhhgtg.m4739Ujhhgtgfeyxiexzf(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f10133Ujhhgtgfeyxiexzf;
                rect.set(left, top, right, bottom);
                rect.left -= this.f10134Ujhhgtgfeyxiexzf;
                rect.top -= this.f10135Ujhhgtgfeyxiexzf;
                rect.right += this.f10136Ujhhgtgfeyxiexzf;
                rect.bottom += this.f10137Ujhhgtgfeyxiexzf;
                if (i2 >= 33) {
                    zM4735Ujhhgtgfeyxiexzf = AbstractC3230feyxiexzfUjhhgtg.m4735Ujhhgtgfeyxiexzf(this);
                } else {
                    Field field = AbstractC3232feyxiexzfUjhhgtg.f10145Ujhhgtgfeyxiexzf;
                    if (field != null) {
                        try {
                            zM4735Ujhhgtgfeyxiexzf = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zM4735Ujhhgtgfeyxiexzf = false;
                        }
                    } else {
                        zM4735Ujhhgtgfeyxiexzf = false;
                    }
                }
                if (childAt3.isEnabled() != zM4735Ujhhgtgfeyxiexzf) {
                    boolean z5 = !zM4735Ujhhgtgfeyxiexzf;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC3230feyxiexzfUjhhgtg.m4736Ujhhgtgfeyxiexzf(this, z5);
                    } else {
                        Field field2 = AbstractC3232feyxiexzfUjhhgtg.f10145Ujhhgtgfeyxiexzf;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                C3229feyxiexzfUjhhgtg c3229feyxiexzfUjhhgtg = this.f10139Ujhhgtgfeyxiexzf;
                if (c3229feyxiexzfUjhhgtg != null) {
                    c3229feyxiexzfUjhhgtg.f10132Ujhhgtgfeyxiexzf = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            this.f10142Ujhhgtgfeyxiexzf = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f10138Ujhhgtgfeyxiexzf - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f10142Ujhhgtgfeyxiexzf = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f10138Ujhhgtgfeyxiexzf - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z) {
            if (this.f10143Ujhhgtgfeyxiexzf == null) {
                this.f10143Ujhhgtgfeyxiexzf = new ViewOnTouchListenerC0254Ujhhgtgfeyxiexzf(this);
            }
            ViewOnTouchListenerC0254Ujhhgtgfeyxiexzf viewOnTouchListenerC0254Ujhhgtgfeyxiexzf3 = this.f10143Ujhhgtgfeyxiexzf;
            boolean z6 = viewOnTouchListenerC0254Ujhhgtgfeyxiexzf3.f1625Ujhhgtgfeyxiexzf;
            viewOnTouchListenerC0254Ujhhgtgfeyxiexzf3.f1625Ujhhgtgfeyxiexzf = true;
            viewOnTouchListenerC0254Ujhhgtgfeyxiexzf3.onTouch(this, motionEvent);
        } else {
            viewOnTouchListenerC0254Ujhhgtgfeyxiexzf = this.f10143Ujhhgtgfeyxiexzf;
            if (viewOnTouchListenerC0254Ujhhgtgfeyxiexzf != null) {
                if (viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1625Ujhhgtgfeyxiexzf) {
                    viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.m1421Ujhhgtgfeyxiexzf();
                }
                viewOnTouchListenerC0254Ujhhgtgfeyxiexzf.f1625Ujhhgtgfeyxiexzf = false;
            }
        }
        return z;
    }
}
