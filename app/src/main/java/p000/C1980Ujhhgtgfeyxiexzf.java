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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1980Ujhhgtgfeyxiexzf extends LinearLayout {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final /* synthetic */ int f6492Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C2080Ujhhgtgfeyxiexzf f6493Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public TextView f6494Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public ImageView f6495Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public View f6496Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C2449feyxiexzfUjhhgtg f6497Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public View f6498Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public TextView f6499Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ImageView f6500Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public Drawable f6501Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f6502Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ C1981Ujhhgtgfeyxiexzf f6503Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1980Ujhhgtgfeyxiexzf(C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf, Context context) {
        super(context);
        this.f6503Ujhhgtgfeyxiexzf = c1981Ujhhgtgfeyxiexzf;
        this.f6502Ujhhgtgfeyxiexzf = 2;
        m3315Ujhhgtgfeyxiexzf(context);
        int i = c1981Ujhhgtgfeyxiexzf.f6509Ujhhgtgfeyxiexzf;
        int i2 = c1981Ujhhgtgfeyxiexzf.f6510Ujhhgtgfeyxiexzf;
        int i3 = c1981Ujhhgtgfeyxiexzf.f6511Ujhhgtgfeyxiexzf;
        int i4 = c1981Ujhhgtgfeyxiexzf.f6512Ujhhgtgfeyxiexzf;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!c1981Ujhhgtgfeyxiexzf.f6534feyxiexzfUjhhgtg ? 1 : 0);
        setClickable(true);
        AbstractC1895Ujhhgtgfeyxiexzf.m3230Ujhhgtgfeyxiexzf(this, PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private C2449feyxiexzfUjhhgtg getBadge() {
        return this.f6497Ujhhgtgfeyxiexzf;
    }

    private C2449feyxiexzfUjhhgtg getOrCreateBadge() {
        if (this.f6497Ujhhgtgfeyxiexzf == null) {
            this.f6497Ujhhgtgfeyxiexzf = new C2449feyxiexzfUjhhgtg(getContext(), null);
        }
        m3312Ujhhgtgfeyxiexzf();
        C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg = this.f6497Ujhhgtgfeyxiexzf;
        if (c2449feyxiexzfUjhhgtg != null) {
            return c2449feyxiexzfUjhhgtg;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6501Ujhhgtgfeyxiexzf;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f6501Ujhhgtgfeyxiexzf.setState(drawableState)) {
            invalidate();
            this.f6503Ujhhgtgfeyxiexzf.invalidate();
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.f6494Ujhhgtgfeyxiexzf, this.f6495Ujhhgtgfeyxiexzf, this.f6498Ujhhgtgfeyxiexzf};
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
        View[] viewArr = {this.f6494Ujhhgtgfeyxiexzf, this.f6495Ujhhgtgfeyxiexzf, this.f6498Ujhhgtgfeyxiexzf};
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

    public C2080Ujhhgtgfeyxiexzf getTab() {
        return this.f6493Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg = this.f6497Ujhhgtgfeyxiexzf;
        if (c2449feyxiexzfUjhhgtg != null && c2449feyxiexzfUjhhgtg.isVisible()) {
            accessibilityNodeInfo.setContentDescription(this.f6497Ujhhgtgfeyxiexzf.m3683Ujhhgtgfeyxiexzf());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C2962feyxiexzfUjhhgtg.m4429Ujhhgtgfeyxiexzf(0, 1, this.f6493Ujhhgtgfeyxiexzf.f6829Ujhhgtgfeyxiexzf, 1, isSelected()).f9271Ujhhgtgfeyxiexzf);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C2956feyxiexzfUjhhgtg.f9254Ujhhgtgfeyxiexzf.f9265Ujhhgtgfeyxiexzf);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = this.f6503Ujhhgtgfeyxiexzf;
        int tabMaxWidth = c1981Ujhhgtgfeyxiexzf.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(c1981Ujhhgtgfeyxiexzf.f6525Ujhhgtgfeyxiexzf, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f6494Ujhhgtgfeyxiexzf != null) {
            float f = c1981Ujhhgtgfeyxiexzf.f6522Ujhhgtgfeyxiexzf;
            int i3 = this.f6502Ujhhgtgfeyxiexzf;
            ImageView imageView = this.f6495Ujhhgtgfeyxiexzf;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f6494Ujhhgtgfeyxiexzf;
                if (textView != null && textView.getLineCount() > 1) {
                    f = c1981Ujhhgtgfeyxiexzf.f6523Ujhhgtgfeyxiexzf;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.f6494Ujhhgtgfeyxiexzf.getTextSize();
            int lineCount = this.f6494Ujhhgtgfeyxiexzf.getLineCount();
            int maxLines = this.f6494Ujhhgtgfeyxiexzf.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (c1981Ujhhgtgfeyxiexzf.f6533feyxiexzfUjhhgtg == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.f6494Ujhhgtgfeyxiexzf.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f6494Ujhhgtgfeyxiexzf.setTextSize(0, f);
                this.f6494Ujhhgtgfeyxiexzf.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f6493Ujhhgtgfeyxiexzf == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf = this.f6493Ujhhgtgfeyxiexzf;
        C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = c2080Ujhhgtgfeyxiexzf.f6831Ujhhgtgfeyxiexzf;
        if (c1981Ujhhgtgfeyxiexzf == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        c1981Ujhhgtgfeyxiexzf.m3327Ujhhgtgfeyxiexzf(c2080Ujhhgtgfeyxiexzf);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.f6494Ujhhgtgfeyxiexzf;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f6495Ujhhgtgfeyxiexzf;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f6498Ujhhgtgfeyxiexzf;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf) {
        if (c2080Ujhhgtgfeyxiexzf != this.f6493Ujhhgtgfeyxiexzf) {
            this.f6493Ujhhgtgfeyxiexzf = c2080Ujhhgtgfeyxiexzf;
            m3314Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3311Ujhhgtgfeyxiexzf() {
        if (this.f6497Ujhhgtgfeyxiexzf != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f6496Ujhhgtgfeyxiexzf;
            if (view != null) {
                C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg = this.f6497Ujhhgtgfeyxiexzf;
                if (c2449feyxiexzfUjhhgtg != null) {
                    if (c2449feyxiexzfUjhhgtg.m3684Ujhhgtgfeyxiexzf() != null) {
                        c2449feyxiexzfUjhhgtg.m3684Ujhhgtgfeyxiexzf().setForeground(null);
                    } else {
                        view.getOverlay().remove(c2449feyxiexzfUjhhgtg);
                    }
                }
                this.f6496Ujhhgtgfeyxiexzf = null;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3312Ujhhgtgfeyxiexzf() {
        C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf;
        if (this.f6497Ujhhgtgfeyxiexzf != null) {
            if (this.f6498Ujhhgtgfeyxiexzf != null) {
                m3311Ujhhgtgfeyxiexzf();
                return;
            }
            ImageView imageView = this.f6495Ujhhgtgfeyxiexzf;
            if (imageView != null && (c2080Ujhhgtgfeyxiexzf = this.f6493Ujhhgtgfeyxiexzf) != null && c2080Ujhhgtgfeyxiexzf.f6826Ujhhgtgfeyxiexzf != null) {
                if (this.f6496Ujhhgtgfeyxiexzf == imageView) {
                    m3313Ujhhgtgfeyxiexzf(imageView);
                    return;
                }
                m3311Ujhhgtgfeyxiexzf();
                ImageView imageView2 = this.f6495Ujhhgtgfeyxiexzf;
                if (this.f6497Ujhhgtgfeyxiexzf == null || imageView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg = this.f6497Ujhhgtgfeyxiexzf;
                Rect rect = new Rect();
                imageView2.getDrawingRect(rect);
                c2449feyxiexzfUjhhgtg.setBounds(rect);
                c2449feyxiexzfUjhhgtg.m3689Ujhhgtgfeyxiexzf(imageView2, null);
                if (c2449feyxiexzfUjhhgtg.m3684Ujhhgtgfeyxiexzf() != null) {
                    c2449feyxiexzfUjhhgtg.m3684Ujhhgtgfeyxiexzf().setForeground(c2449feyxiexzfUjhhgtg);
                } else {
                    imageView2.getOverlay().add(c2449feyxiexzfUjhhgtg);
                }
                this.f6496Ujhhgtgfeyxiexzf = imageView2;
                return;
            }
            TextView textView = this.f6494Ujhhgtgfeyxiexzf;
            if (textView == null || this.f6493Ujhhgtgfeyxiexzf == null) {
                m3311Ujhhgtgfeyxiexzf();
                return;
            }
            if (this.f6496Ujhhgtgfeyxiexzf == textView) {
                m3313Ujhhgtgfeyxiexzf(textView);
                return;
            }
            m3311Ujhhgtgfeyxiexzf();
            TextView textView2 = this.f6494Ujhhgtgfeyxiexzf;
            if (this.f6497Ujhhgtgfeyxiexzf == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
            }
            C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg2 = this.f6497Ujhhgtgfeyxiexzf;
            Rect rect2 = new Rect();
            textView2.getDrawingRect(rect2);
            c2449feyxiexzfUjhhgtg2.setBounds(rect2);
            c2449feyxiexzfUjhhgtg2.m3689Ujhhgtgfeyxiexzf(textView2, null);
            if (c2449feyxiexzfUjhhgtg2.m3684Ujhhgtgfeyxiexzf() != null) {
                c2449feyxiexzfUjhhgtg2.m3684Ujhhgtgfeyxiexzf().setForeground(c2449feyxiexzfUjhhgtg2);
            } else {
                textView2.getOverlay().add(c2449feyxiexzfUjhhgtg2);
            }
            this.f6496Ujhhgtgfeyxiexzf = textView2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3313Ujhhgtgfeyxiexzf(View view) {
        C2449feyxiexzfUjhhgtg c2449feyxiexzfUjhhgtg = this.f6497Ujhhgtgfeyxiexzf;
        if (c2449feyxiexzfUjhhgtg == null || view != this.f6496Ujhhgtgfeyxiexzf) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c2449feyxiexzfUjhhgtg.setBounds(rect);
        c2449feyxiexzfUjhhgtg.m3689Ujhhgtgfeyxiexzf(view, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m3314Ujhhgtgfeyxiexzf() {
        boolean z;
        m3316Ujhhgtgfeyxiexzf();
        C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf = this.f6493Ujhhgtgfeyxiexzf;
        if (c2080Ujhhgtgfeyxiexzf == null) {
            z = false;
        } else {
            C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = c2080Ujhhgtgfeyxiexzf.f6831Ujhhgtgfeyxiexzf;
            if (c1981Ujhhgtgfeyxiexzf == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = c1981Ujhhgtgfeyxiexzf.getSelectedTabPosition();
            if (selectedTabPosition == -1 || selectedTabPosition != c2080Ujhhgtgfeyxiexzf.f6829Ujhhgtgfeyxiexzf) {
                z = false;
            } else {
                z = true;
            }
        }
        setSelected(z);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m3315Ujhhgtgfeyxiexzf(Context context) {
        GradientDrawable gradientDrawable;
        C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = this.f6503Ujhhgtgfeyxiexzf;
        int i = c1981Ujhhgtgfeyxiexzf.f6524Ujhhgtgfeyxiexzf;
        if (i != 0) {
            Drawable drawableM2824Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(context, i);
            this.f6501Ujhhgtgfeyxiexzf = drawableM2824Ujhhgtgfeyxiexzf;
            if (drawableM2824Ujhhgtgfeyxiexzf != null && drawableM2824Ujhhgtgfeyxiexzf.isStateful()) {
                this.f6501Ujhhgtgfeyxiexzf.setState(getDrawableState());
            }
        } else {
            this.f6501Ujhhgtgfeyxiexzf = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (c1981Ujhhgtgfeyxiexzf.f6518Ujhhgtgfeyxiexzf != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateListM2423Ujhhgtgfeyxiexzf = AbstractC0925feyxiexzfUjhhgtg.m2423Ujhhgtgfeyxiexzf(c1981Ujhhgtgfeyxiexzf.f6518Ujhhgtgfeyxiexzf);
            boolean z = c1981Ujhhgtgfeyxiexzf.f6538feyxiexzfUjhhgtg;
            if (z) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateListM2423Ujhhgtgfeyxiexzf, gradientDrawable, z ? null : gradientDrawable3);
        }
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        setBackground(rippleDrawable);
        c1981Ujhhgtgfeyxiexzf.invalidate();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m3316Ujhhgtgfeyxiexzf() {
        int i;
        ViewParent parent;
        C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf = this.f6493Ujhhgtgfeyxiexzf;
        View view = c2080Ujhhgtgfeyxiexzf != null ? c2080Ujhhgtgfeyxiexzf.f6830Ujhhgtgfeyxiexzf : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f6498Ujhhgtgfeyxiexzf;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f6498Ujhhgtgfeyxiexzf);
                }
                addView(view);
            }
            this.f6498Ujhhgtgfeyxiexzf = view;
            TextView textView = this.f6494Ujhhgtgfeyxiexzf;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f6495Ujhhgtgfeyxiexzf;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f6495Ujhhgtgfeyxiexzf.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
            this.f6499Ujhhgtgfeyxiexzf = textView2;
            if (textView2 != null) {
                this.f6502Ujhhgtgfeyxiexzf = textView2.getMaxLines();
            }
            this.f6500Ujhhgtgfeyxiexzf = (ImageView) view.findViewById(android.R.id.icon);
        } else {
            View view3 = this.f6498Ujhhgtgfeyxiexzf;
            if (view3 != null) {
                removeView(view3);
                this.f6498Ujhhgtgfeyxiexzf = null;
            }
            this.f6499Ujhhgtgfeyxiexzf = null;
            this.f6500Ujhhgtgfeyxiexzf = null;
        }
        if (this.f6498Ujhhgtgfeyxiexzf == null) {
            if (this.f6495Ujhhgtgfeyxiexzf == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f6495Ujhhgtgfeyxiexzf = imageView2;
                addView(imageView2, 0);
            }
            if (this.f6494Ujhhgtgfeyxiexzf == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f6494Ujhhgtgfeyxiexzf = textView3;
                addView(textView3);
                this.f6502Ujhhgtgfeyxiexzf = this.f6494Ujhhgtgfeyxiexzf.getMaxLines();
            }
            TextView textView4 = this.f6494Ujhhgtgfeyxiexzf;
            C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = this.f6503Ujhhgtgfeyxiexzf;
            textView4.setTextAppearance(c1981Ujhhgtgfeyxiexzf.f6513Ujhhgtgfeyxiexzf);
            if (!isSelected() || (i = c1981Ujhhgtgfeyxiexzf.f6515Ujhhgtgfeyxiexzf) == -1) {
                this.f6494Ujhhgtgfeyxiexzf.setTextAppearance(c1981Ujhhgtgfeyxiexzf.f6514Ujhhgtgfeyxiexzf);
            } else {
                this.f6494Ujhhgtgfeyxiexzf.setTextAppearance(i);
            }
            ColorStateList colorStateList = c1981Ujhhgtgfeyxiexzf.f6516Ujhhgtgfeyxiexzf;
            if (colorStateList != null) {
                this.f6494Ujhhgtgfeyxiexzf.setTextColor(colorStateList);
            }
            m3317Ujhhgtgfeyxiexzf(this.f6494Ujhhgtgfeyxiexzf, this.f6495Ujhhgtgfeyxiexzf, true);
            m3312Ujhhgtgfeyxiexzf();
            ImageView imageView3 = this.f6495Ujhhgtgfeyxiexzf;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2081feyxiexzfUjhhgtg(this, imageView3));
            }
            TextView textView5 = this.f6494Ujhhgtgfeyxiexzf;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC2081feyxiexzfUjhhgtg(this, textView5));
            }
        } else {
            TextView textView6 = this.f6499Ujhhgtgfeyxiexzf;
            if (textView6 != null || this.f6500Ujhhgtgfeyxiexzf != null) {
                m3317Ujhhgtgfeyxiexzf(textView6, this.f6500Ujhhgtgfeyxiexzf, false);
            }
        }
        if (c2080Ujhhgtgfeyxiexzf == null || TextUtils.isEmpty(c2080Ujhhgtgfeyxiexzf.f6828Ujhhgtgfeyxiexzf)) {
            return;
        }
        setContentDescription(c2080Ujhhgtgfeyxiexzf.f6828Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m3317Ujhhgtgfeyxiexzf(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        Drawable drawable;
        C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf = this.f6493Ujhhgtgfeyxiexzf;
        Drawable drawableMutate = (c2080Ujhhgtgfeyxiexzf == null || (drawable = c2080Ujhhgtgfeyxiexzf.f6826Ujhhgtgfeyxiexzf) == null) ? null : drawable.mutate();
        C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf = this.f6503Ujhhgtgfeyxiexzf;
        if (drawableMutate != null) {
            drawableMutate.setTintList(c1981Ujhhgtgfeyxiexzf.f6517Ujhhgtgfeyxiexzf);
            PorterDuff.Mode mode = c1981Ujhhgtgfeyxiexzf.f6521Ujhhgtgfeyxiexzf;
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
        }
        C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf2 = this.f6493Ujhhgtgfeyxiexzf;
        CharSequence charSequence = c2080Ujhhgtgfeyxiexzf2 != null ? c2080Ujhhgtgfeyxiexzf2.f6827Ujhhgtgfeyxiexzf : null;
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
                this.f6493Ujhhgtgfeyxiexzf.getClass();
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
            int iM3278Ujhhgtgfeyxiexzf = (z2 && imageView.getVisibility() == 0) ? (int) AbstractC1937feyxiexzfUjhhgtg.m3278Ujhhgtgfeyxiexzf(getContext(), 8) : 0;
            if (c1981Ujhhgtgfeyxiexzf.f6534feyxiexzfUjhhgtg) {
                if (iM3278Ujhhgtgfeyxiexzf != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iM3278Ujhhgtgfeyxiexzf);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iM3278Ujhhgtgfeyxiexzf != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iM3278Ujhhgtgfeyxiexzf;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf3 = this.f6493Ujhhgtgfeyxiexzf;
        CharSequence charSequence2 = c2080Ujhhgtgfeyxiexzf3 != null ? c2080Ujhhgtgfeyxiexzf3.f6828Ujhhgtgfeyxiexzf : null;
        if (zIsEmpty) {
            charSequence = charSequence2;
        }
        AbstractC1763feyxiexzfUjhhgtg.m3059Ujhhgtgfeyxiexzf(this, charSequence);
    }
}
