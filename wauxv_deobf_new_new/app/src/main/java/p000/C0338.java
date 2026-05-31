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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᲈᲁᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0338 extends Drawable implements InterfaceC2965 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final WeakReference f1657;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1948 f1658;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2966 f1659;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Rect f1660;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0340 f1661;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public float f1662;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f1663;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int f1664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f1665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public float f1666;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public float f1667;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public WeakReference f1668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public WeakReference f1669;

    public C0338(Context context, C0339 c0339) {
        C2963 c2963;
        WeakReference weakReference = new WeakReference(context);
        this.f1657 = weakReference;
        AbstractC2240.m4244(context, AbstractC2240.f7304, "Theme.MaterialComponents");
        this.f1660 = new Rect();
        C2966 c2966 = new C2966(this);
        this.f1659 = c2966;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = c2966.f9516;
        textPaint.setTextAlign(align);
        C0340 c0340 = new C0340(context, c0339);
        this.f1661 = c0340;
        boolean zM1585 = m1585();
        C0339 c03310 = c0340.f1701;
        C1948 c1948 = new C1948(C2738.m4724(context, zM1585 ? c03310.f1676.intValue() : c03310.f1674.intValue(), m1585() ? c03310.f1677.intValue() : c03310.f1675.intValue(), new C0060(0)).m4722());
        this.f1658 = c1948;
        m1587();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && c2966.f9522 != (c2963 = new C2963(context2, c03310.f1673.intValue()))) {
            c2966.m4977(c2963, context2);
            textPaint.setColor(c03310.f1672.intValue());
            invalidateSelf();
            m1589();
            invalidateSelf();
        }
        int i = c03310.f1681;
        if (i != -2) {
            this.f1664 = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.f1664 = c03310.f1682;
        }
        c2966.f9520 = true;
        m1589();
        invalidateSelf();
        c2966.f9520 = true;
        m1587();
        m1589();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(c03310.f1671.intValue());
        if (c1948.f6437.f6421 != colorStateListValueOf) {
            c1948.m3914(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(c03310.f1672.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f1668;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f1668.get();
            WeakReference weakReference3 = this.f1669;
            m1588(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        m1589();
        setVisible(c03310.f1689.booleanValue(), false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strM1581;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f1658.draw(canvas);
        if (!m1585() || (strM1581 = m1581()) == null) {
            return;
        }
        Rect rect = new Rect();
        C2966 c2966 = this.f1659;
        c2966.f9516.getTextBounds(strM1581, 0, strM1581.length(), rect);
        float fExactCenterY = this.f1663 - rect.exactCenterY();
        canvas.drawText(strM1581, this.f1662, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), c2966.f9516);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1661.f1701.f1678;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f1660.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f1660.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, p000.InterfaceC2965
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C0340 c0340 = this.f1661;
        c0340.f1700.f1678 = i;
        c0340.f1701.f1678 = i;
        this.f1659.f9516.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // p000.InterfaceC2965
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1580() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String m1581() {
        C0340 c0340 = this.f1661;
        C0339 c0339 = c0340.f1701;
        C0339 c03310 = c0340.f1701;
        String str = c0339.f1679;
        WeakReference weakReference = this.f1657;
        if (str == null) {
            if (!m1586()) {
                return null;
            }
            if (this.f1664 == -2 || m1584() <= this.f1664) {
                return NumberFormat.getInstance(c03310.f1683).format(m1584());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(c03310.f1683, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f1664), "+");
        }
        int i = c0339.f1681;
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
    public final CharSequence m1582() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        C0340 c0340 = this.f1661;
        C0339 c0339 = c0340.f1701;
        C0339 c03310 = c0340.f1701;
        if (c0339.f1679 != null) {
            CharSequence charSequence = c0339.f1684;
            return charSequence != null ? charSequence : c0340.f1701.f1679;
        }
        if (!m1586()) {
            return c03310.f1685;
        }
        if (c03310.f1686 == 0 || (context = (Context) this.f1657.get()) == null) {
            return null;
        }
        if (this.f1664 != -2) {
            int iM1584 = m1584();
            int i = this.f1664;
            if (iM1584 > i) {
                return context.getString(c03310.f1687, Integer.valueOf(i));
            }
        }
        return context.getResources().getQuantityString(c03310.f1686, m1584(), Integer.valueOf(m1584()));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final FrameLayout m1583() {
        WeakReference weakReference = this.f1669;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m1584() {
        int i = this.f1661.f1701.f1680;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean m1585() {
        return this.f1661.f1701.f1679 != null || m1586();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean m1586() {
        C0339 c0339 = this.f1661.f1701;
        return c0339.f1679 == null && c0339.f1680 != -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m1587() {
        Context context = (Context) this.f1657.get();
        if (context == null) {
            return;
        }
        boolean zM1585 = m1585();
        C0340 c0340 = this.f1661;
        this.f1658.setShapeAppearanceModel(C2738.m4724(context, zM1585 ? c0340.f1701.f1676.intValue() : c0340.f1701.f1674.intValue(), m1585() ? c0340.f1701.f1677.intValue() : c0340.f1701.f1675.intValue(), new C0060(0)).m4722());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1588(View view, FrameLayout frameLayout) {
        this.f1668 = new WeakReference(view);
        this.f1669 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m1589();
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
    public final void m1589() {
        float y;
        float x;
        float y2;
        float x2;
        float height;
        float width;
        float f;
        WeakReference weakReference = this.f1657;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f1668;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f1660;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f1669;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zM1585 = m1585();
        C0340 c0340 = this.f1661;
        float f2 = zM1585 ? c0340.f1703 : c0340.f1702;
        this.f1665 = f2;
        if (f2 != -1.0f) {
            this.f1666 = f2;
            this.f1667 = f2;
        } else {
            this.f1666 = Math.round((m1585() ? c0340.f1706 : c0340.f1704) / 2.0f);
            this.f1667 = Math.round((m1585() ? c0340.f1707 : c0340.f1705) / 2.0f);
        }
        if (m1585()) {
            String strM1581 = m1581();
            float f3 = this.f1666;
            C2966 c2966 = this.f1659;
            this.f1666 = Math.max(f3, (c2966.m4975(strM1581) / 2.0f) + c0340.f1701.f1690.intValue());
            float f4 = this.f1667;
            if (c2966.f9520) {
                c2966.m4976(strM1581);
                f = c2966.f9519;
            } else {
                f = c2966.f9519;
            }
            float fMax = Math.max(f4, (f / 2.0f) + c0340.f1701.f1691.intValue());
            this.f1667 = fMax;
            this.f1666 = Math.max(this.f1666, fMax);
        }
        C0339 c0339 = c0340.f1701;
        C0339 c03310 = c0340.f1701;
        int i = c0340.f1710;
        int iIntValue = c0339.f1693.intValue();
        if (m1585()) {
            iIntValue = c0339.f1695.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = AbstractC0172.m1359(iIntValue, iIntValue - c0339.f1698.intValue(), AbstractC0172.m1358(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
            }
        }
        if (i == 0) {
            iIntValue -= Math.round(this.f1667);
        }
        int iIntValue2 = c0339.f1697.intValue() + iIntValue;
        int iIntValue3 = c03310.f1688.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f1663 = rect3.bottom - iIntValue2;
        } else {
            this.f1663 = rect3.top + iIntValue2;
        }
        int iIntValue4 = m1585() ? c0339.f1694.intValue() : c03310.f1692.intValue();
        if (i == 1) {
            iIntValue4 += m1585() ? c0340.f1709 : c0340.f1708;
        }
        int iIntValue5 = c0339.f1696.intValue() + iIntValue4;
        int iIntValue6 = c03310.f1688.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            Field field = AbstractC3638.f11333;
            this.f1662 = view.getLayoutDirection() == 0 ? (rect3.left - this.f1666) + iIntValue5 : (rect3.right + this.f1666) - iIntValue5;
        } else {
            Field field2 = AbstractC3638.f11333;
            this.f1662 = view.getLayoutDirection() == 0 ? (rect3.right + this.f1666) - iIntValue5 : (rect3.left - this.f1666) + iIntValue5;
        }
        if (c0339.f1699.booleanValue()) {
            View viewM1583 = m1583();
            if (viewM1583 != null) {
                FrameLayout frameLayoutM1583 = m1583();
                if (frameLayoutM1583 == null || frameLayoutM1583.getId() != R.id.mtrl_anchor_parent) {
                    y = 0.0f;
                    x = 0.0f;
                } else if (viewM1583.getParent() instanceof View) {
                    y = viewM1583.getY();
                    x = viewM1583.getX();
                    viewM1583 = (View) viewM1583.getParent();
                }
                y2 = viewM1583.getY() + (this.f1663 - this.f1667) + y;
                x2 = viewM1583.getX() + (this.f1662 - this.f1666) + x;
                if (viewM1583.getParent() instanceof View) {
                    height = ((this.f1663 + this.f1667) - (((View) viewM1583.getParent()).getHeight() - viewM1583.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewM1583.getParent() instanceof View) {
                    width = ((this.f1662 + this.f1666) - (((View) viewM1583.getParent()).getWidth() - viewM1583.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.f1663 = Math.abs(y2) + this.f1663;
                }
                if (x2 < 0.0f) {
                    this.f1662 = Math.abs(x2) + this.f1662;
                }
                if (height > 0.0f) {
                    this.f1663 -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f1662 -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y3 = view.getY();
                x = view.getX();
                View view2 = (View) view.getParent();
                y = y3;
                viewM1583 = view2;
                y2 = viewM1583.getY() + (this.f1663 - this.f1667) + y;
                x2 = viewM1583.getX() + (this.f1662 - this.f1666) + x;
                if (viewM1583.getParent() instanceof View) {
                    height = ((this.f1663 + this.f1667) - (((View) viewM1583.getParent()).getHeight() - viewM1583.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewM1583.getParent() instanceof View) {
                    width = ((this.f1662 + this.f1666) - (((View) viewM1583.getParent()).getWidth() - viewM1583.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.f1663 = Math.abs(y2) + this.f1663;
                }
                if (x2 < 0.0f) {
                    this.f1662 = Math.abs(x2) + this.f1662;
                }
                if (height > 0.0f) {
                    this.f1663 -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f1662 -= Math.abs(width);
                }
            }
        }
        float f5 = this.f1662;
        float f6 = this.f1663;
        float f7 = this.f1666;
        float f8 = this.f1667;
        rect2.set((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
        float f9 = this.f1665;
        C1948 c1948 = this.f1658;
        if (f9 != -1.0f) {
            C2737 c2737M4728 = c1948.f6437.f6419.m4728();
            c2737M4728.m4723(f9);
            c1948.setShapeAppearanceModel(c2737M4728.m4722());
        }
        if (rect.equals(rect2)) {
            return;
        }
        c1948.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
