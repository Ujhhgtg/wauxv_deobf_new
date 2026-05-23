package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.text.NumberFormat;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᤝᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0363 extends Drawable implements InterfaceC2906 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final WeakReference f1686;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1917 f1687;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2907 f1688;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Rect f1689;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0365 f1690;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f1691;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f1692;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int f1693;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public float f1694;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public float f1695;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public float f1696;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public WeakReference f1697;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public WeakReference f1698;

    public C0363(Context context, C0364 c0364) {
        C2904 c2904;
        WeakReference weakReference = new WeakReference(context);
        this.f1686 = weakReference;
        AbstractC3471.m5068(context, AbstractC3471.f10963, "Theme.MaterialComponents");
        this.f1689 = new Rect();
        C2907 c2907 = new C2907(this);
        this.f1688 = c2907;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = c2907.f9349;
        textPaint.setTextAlign(align);
        C0365 c0365 = new C0365(context, c0364);
        this.f1690 = c0365;
        boolean zM1480 = m1480();
        C0364 c0366 = c0365.f1730;
        C1917 c1917 = new C1917(C2677.m4687(context, zM1480 ? c0366.f1705.intValue() : c0366.f1703.intValue(), m1480() ? c0366.f1706.intValue() : c0366.f1704.intValue(), new C0053(0)).m3876());
        this.f1687 = c1917;
        m1482();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && c2907.f9355 != (c2904 = new C2904(context2, c0366.f1702.intValue()))) {
            c2907.m4915(c2904, context2);
            textPaint.setColor(c0366.f1701.intValue());
            invalidateSelf();
            m1484();
            invalidateSelf();
        }
        int i = c0366.f1710;
        if (i != -2) {
            this.f1693 = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.f1693 = c0366.f1711;
        }
        c2907.f9353 = true;
        m1484();
        invalidateSelf();
        c2907.f9353 = true;
        m1482();
        m1484();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(c0366.f1700.intValue());
        if (c1917.f6332.f6316 != colorStateListValueOf) {
            c1917.m3716(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(c0366.f1701.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f1697;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f1697.get();
            WeakReference weakReference3 = this.f1698;
            m1483(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        m1484();
        setVisible(c0366.f1718.booleanValue(), false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strM1476;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f1687.draw(canvas);
        if (!m1480() || (strM1476 = m1476()) == null) {
            return;
        }
        Rect rect = new Rect();
        C2907 c2907 = this.f1688;
        c2907.f9349.getTextBounds(strM1476, 0, strM1476.length(), rect);
        float fExactCenterY = this.f1692 - rect.exactCenterY();
        canvas.drawText(strM1476, this.f1691, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), c2907.f9349);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1690.f1730.f1707;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f1689.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f1689.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, p000.InterfaceC2906
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C0365 c0365 = this.f1690;
        c0365.f1729.f1707 = i;
        c0365.f1730.f1707 = i;
        this.f1688.f9349.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // p000.InterfaceC2906
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1475() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String m1476() {
        C0365 c0365 = this.f1690;
        C0364 c0364 = c0365.f1730;
        C0364 c0366 = c0365.f1730;
        String str = c0364.f1708;
        WeakReference weakReference = this.f1686;
        if (str == null) {
            if (!m1481()) {
                return null;
            }
            if (this.f1693 == -2 || m1479() <= this.f1693) {
                return NumberFormat.getInstance(c0366.f1712).format(m1479());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(c0366.f1712, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f1693), "+");
        }
        int i = c0364.f1710;
        if (i == -2 || str == null || str.length() <= i) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final CharSequence m1477() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        C0365 c0365 = this.f1690;
        C0364 c0364 = c0365.f1730;
        C0364 c0366 = c0365.f1730;
        if (c0364.f1708 != null) {
            CharSequence charSequence = c0364.f1713;
            return charSequence != null ? charSequence : c0365.f1730.f1708;
        }
        if (!m1481()) {
            return c0366.f1714;
        }
        if (c0366.f1715 == 0 || (context = (Context) this.f1686.get()) == null) {
            return null;
        }
        if (this.f1693 != -2) {
            int iM1479 = m1479();
            int i = this.f1693;
            if (iM1479 > i) {
                return context.getString(c0366.f1716, Integer.valueOf(i));
            }
        }
        return context.getResources().getQuantityString(c0366.f1715, m1479(), Integer.valueOf(m1479()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final FrameLayout m1478() {
        WeakReference weakReference = this.f1698;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m1479() {
        int i = this.f1690.f1730.f1709;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m1480() {
        return this.f1690.f1730.f1708 != null || m1481();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean m1481() {
        C0364 c0364 = this.f1690.f1730;
        return c0364.f1708 == null && c0364.f1709 != -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m1482() {
        Context context = (Context) this.f1686.get();
        if (context == null) {
            return;
        }
        boolean zM1480 = m1480();
        C0365 c0365 = this.f1690;
        this.f1687.setShapeAppearanceModel(C2677.m4687(context, zM1480 ? c0365.f1730.f1705.intValue() : c0365.f1730.f1703.intValue(), m1480() ? c0365.f1730.f1706.intValue() : c0365.f1730.f1704.intValue(), new C0053(0)).m3876());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1483(View view, FrameLayout frameLayout) {
        this.f1697 = new WeakReference(view);
        this.f1698 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m1484();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0239  */
    /* JADX WARN: Code duplicated, block: B:101:0x0251  */
    /* JADX WARN: Code duplicated, block: B:104:0x0256  */
    /* JADX WARN: Code duplicated, block: B:107:0x0263  */
    /* JADX WARN: Code duplicated, block: B:110:0x0270  */
    /* JADX WARN: Code duplicated, block: B:113:0x027d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0218  */
    /* JADX WARN: Code duplicated, block: B:97:0x0230  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m1484() {
        float y;
        float x;
        float y2;
        float x2;
        float height;
        float width;
        float f;
        WeakReference weakReference = this.f1686;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f1697;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f1689;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f1698;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zM1480 = m1480();
        C0365 c0365 = this.f1690;
        float f2 = zM1480 ? c0365.f1732 : c0365.f1731;
        this.f1694 = f2;
        if (f2 != -1.0f) {
            this.f1695 = f2;
            this.f1696 = f2;
        } else {
            this.f1695 = Math.round((m1480() ? c0365.f1735 : c0365.f1733) / 2.0f);
            this.f1696 = Math.round((m1480() ? c0365.f1736 : c0365.f1734) / 2.0f);
        }
        if (m1480()) {
            String strM1476 = m1476();
            float f3 = this.f1695;
            C2907 c2907 = this.f1688;
            this.f1695 = Math.max(f3, (c2907.m4913(strM1476) / 2.0f) + c0365.f1730.f1719.intValue());
            float f4 = this.f1696;
            if (c2907.f9353) {
                c2907.m4914(strM1476);
                f = c2907.f9352;
            } else {
                f = c2907.f9352;
            }
            float fMax = Math.max(f4, (f / 2.0f) + c0365.f1730.f1720.intValue());
            this.f1696 = fMax;
            this.f1695 = Math.max(this.f1695, fMax);
        }
        C0364 c0364 = c0365.f1730;
        C0364 c0366 = c0365.f1730;
        int i = c0365.f1739;
        int iIntValue = c0364.f1722.intValue();
        if (m1480()) {
            iIntValue = c0364.f1724.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = AbstractC0164.m1213(iIntValue, iIntValue - c0364.f1727.intValue(), AbstractC0164.m1212(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
            }
        }
        if (i == 0) {
            iIntValue -= Math.round(this.f1696);
        }
        int iIntValue2 = c0364.f1726.intValue() + iIntValue;
        int iIntValue3 = c0366.f1717.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f1692 = rect3.bottom - iIntValue2;
        } else {
            this.f1692 = rect3.top + iIntValue2;
        }
        int iIntValue4 = m1480() ? c0364.f1723.intValue() : c0366.f1721.intValue();
        if (i == 1) {
            iIntValue4 += m1480() ? c0365.f1738 : c0365.f1737;
        }
        int iIntValue5 = c0364.f1725.intValue() + iIntValue4;
        int iIntValue6 = c0366.f1717.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            Field field = AbstractC3578.f11184;
            this.f1691 = view.getLayoutDirection() == 0 ? (rect3.left - this.f1695) + iIntValue5 : (rect3.right + this.f1695) - iIntValue5;
        } else {
            Field field2 = AbstractC3578.f11184;
            this.f1691 = view.getLayoutDirection() == 0 ? (rect3.right + this.f1695) - iIntValue5 : (rect3.left - this.f1695) + iIntValue5;
        }
        if (c0364.f1728.booleanValue()) {
            View viewM1478 = m1478();
            if (viewM1478 != null) {
                FrameLayout frameLayoutM1478 = m1478();
                if (frameLayoutM1478 == null || frameLayoutM1478.getId() != R.id.mtrl_anchor_parent) {
                    y = 0.0f;
                    x = 0.0f;
                } else if (viewM1478.getParent() instanceof View) {
                    y = viewM1478.getY();
                    x = viewM1478.getX();
                    viewM1478 = (View) viewM1478.getParent();
                }
                y2 = viewM1478.getY() + (this.f1692 - this.f1696) + y;
                x2 = viewM1478.getX() + (this.f1691 - this.f1695) + x;
                if (viewM1478.getParent() instanceof View) {
                    height = ((this.f1692 + this.f1696) - (((View) viewM1478.getParent()).getHeight() - viewM1478.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewM1478.getParent() instanceof View) {
                    width = ((this.f1691 + this.f1695) - (((View) viewM1478.getParent()).getWidth() - viewM1478.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.f1692 = Math.abs(y2) + this.f1692;
                }
                if (x2 < 0.0f) {
                    this.f1691 = Math.abs(x2) + this.f1691;
                }
                if (height > 0.0f) {
                    this.f1692 -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f1691 -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y3 = view.getY();
                x = view.getX();
                View view2 = (View) view.getParent();
                y = y3;
                viewM1478 = view2;
                y2 = viewM1478.getY() + (this.f1692 - this.f1696) + y;
                x2 = viewM1478.getX() + (this.f1691 - this.f1695) + x;
                if (viewM1478.getParent() instanceof View) {
                    height = ((this.f1692 + this.f1696) - (((View) viewM1478.getParent()).getHeight() - viewM1478.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewM1478.getParent() instanceof View) {
                    width = ((this.f1691 + this.f1695) - (((View) viewM1478.getParent()).getWidth() - viewM1478.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.f1692 = Math.abs(y2) + this.f1692;
                }
                if (x2 < 0.0f) {
                    this.f1691 = Math.abs(x2) + this.f1691;
                }
                if (height > 0.0f) {
                    this.f1692 -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f1691 -= Math.abs(width);
                }
            }
        }
        float f5 = this.f1691;
        float f6 = this.f1692;
        float f7 = this.f1695;
        float f8 = this.f1696;
        rect2.set((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
        float f9 = this.f1694;
        C1917 c1917 = this.f1687;
        if (f9 != -1.0f) {
            C2021 c2021M4691 = c1917.f6332.f6314.m4691();
            c2021M4691.f6766 = new C0053(f9);
            c2021M4691.f6767 = new C0053(f9);
            c2021M4691.f6768 = new C0053(f9);
            c2021M4691.f6769 = new C0053(f9);
            c1917.setShapeAppearanceModel(c2021M4691.m3876());
        }
        if (rect.equals(rect2)) {
            return;
        }
        c1917.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
