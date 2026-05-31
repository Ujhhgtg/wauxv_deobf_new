package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.slider.Slider;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲈᲇᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0364 extends View {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Paint f1770;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Paint f1771;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Paint f1772;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Paint f1773;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Paint f1774;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Paint f1775;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Paint f1776;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0362 f1777;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final AccessibilityManager f1778;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public RunnableC0361 f1779;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final int f1780;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final ArrayList f1781;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final ArrayList f1782;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final ArrayList f1783;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f1784;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public ValueAnimator f1785;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public ValueAnimator f1786;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final int f1787;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final int f1788;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final int f1789;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final int f1790;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final int f1791;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final int f1792;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final int f1793;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final int f1794;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final int f1795;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public int f1796;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public int f1797;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public int f1798;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public int f1799;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public int f1800;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public int f1801;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public int f1802;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public int f1803;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public int f1804;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public int f1805;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public int f1806;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public int f1807;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final int f1808;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public float f1809;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public MotionEvent f1810;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public boolean f1811;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public float f1812;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public float f1813;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public ArrayList f1814;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public int f1815;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public int f1816;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public float f1817;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public float[] f1818;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public boolean f1819;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public int f1820;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public int f1821;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public int f1822;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public boolean f1823;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public boolean f1824;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public ColorStateList f1825;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
    public ColorStateList f1826;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ, reason: contains not printable characters */
    public ColorStateList f1827;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
    public ColorStateList f1828;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ, reason: contains not printable characters */
    public ColorStateList f1829;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public final Path f1830;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public final RectF f1831;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public final RectF f1832;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public final C1948 f1833;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public Drawable f1834;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public List f1835;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᤞᲇ, reason: contains not printable characters */
    public float f1836;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ, reason: contains not printable characters */
    public int f1837;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᤞᲀ, reason: contains not printable characters */
    public final ViewTreeObserverOnScrollChangedListenerC0359 f1838;

    /* JADX WARN: Type inference failed for: r1v5, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲇᲈᤞᤝ] */
    public AbstractC0364(Context context, AttributeSet attributeSet) {
        super(AbstractC1469.m3354(context, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider), attributeSet, R.attr.sliderStyle);
        this.f1781 = new ArrayList();
        this.f1782 = new ArrayList();
        this.f1783 = new ArrayList();
        this.f1784 = false;
        this.f1804 = -1;
        this.f1805 = -1;
        this.f1811 = false;
        this.f1814 = new ArrayList();
        this.f1815 = -1;
        this.f1816 = -1;
        this.f1817 = 0.0f;
        this.f1819 = true;
        this.f1823 = false;
        this.f1830 = new Path();
        this.f1831 = new RectF();
        this.f1832 = new RectF();
        C1948 c1948 = new C1948();
        this.f1833 = c1948;
        this.f1835 = Collections.EMPTY_LIST;
        this.f1837 = 0;
        final Slider slider = (Slider) this;
        this.f1838 = new ViewTreeObserver.OnScrollChangedListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲇᲈᤞᤝ
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                slider.m1675();
            }
        };
        Context context2 = getContext();
        this.f1770 = new Paint();
        this.f1771 = new Paint();
        Paint paint = new Paint(1);
        this.f1772 = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f1773 = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f1774 = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f1775 = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f1776 = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.f1795 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f1788 = dimensionPixelOffset;
        this.f1799 = dimensionPixelOffset;
        this.f1789 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f1790 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f1791 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f1792 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f1793 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.f1808 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        AbstractC2240.m4241(context2, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = AbstractC2521.f8015;
        AbstractC2240.m4243(context2, attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        this.f1780 = typedArrayObtainStyledAttributes.getResourceId(8, R.style.Widget_MaterialComponents_Tooltip);
        this.f1812 = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.f1813 = typedArrayObtainStyledAttributes.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.f1812));
        this.f1817 = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        this.f1794 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(9, (float) Math.ceil(AbstractC1471.m3383(getContext(), 48))));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(24);
        int i = zHasValue ? 24 : 26;
        int i2 = zHasValue ? 24 : 25;
        ColorStateList colorStateListM3388 = AbstractC1471.m3388(context2, typedArrayObtainStyledAttributes, i);
        setTrackInactiveTintList(colorStateListM3388 == null ? AbstractC1469.m3333(context2, R.color.material_slider_inactive_track_color) : colorStateListM3388);
        ColorStateList colorStateListM3389 = AbstractC1471.m3388(context2, typedArrayObtainStyledAttributes, i2);
        setTrackActiveTintList(colorStateListM3389 == null ? AbstractC1469.m3333(context2, R.color.material_slider_active_track_color) : colorStateListM3389);
        c1948.m3914(AbstractC1471.m3388(context2, typedArrayObtainStyledAttributes, 10));
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            setThumbStrokeColor(AbstractC1471.m3388(context2, typedArrayObtainStyledAttributes, 14));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(15, 0.0f));
        ColorStateList colorStateListM33810 = AbstractC1471.m3388(context2, typedArrayObtainStyledAttributes, 5);
        setHaloTintList(colorStateListM33810 == null ? AbstractC1469.m3333(context2, R.color.material_slider_halo_color) : colorStateListM33810);
        this.f1819 = typedArrayObtainStyledAttributes.getBoolean(23, true);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(18);
        int i3 = zHasValue2 ? 18 : 20;
        int i4 = zHasValue2 ? 18 : 19;
        ColorStateList colorStateListM33811 = AbstractC1471.m3388(context2, typedArrayObtainStyledAttributes, i3);
        setTickInactiveTintList(colorStateListM33811 == null ? AbstractC1469.m3333(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateListM33811);
        ColorStateList colorStateListM33812 = AbstractC1471.m3388(context2, typedArrayObtainStyledAttributes, i4);
        setTickActiveTintList(colorStateListM33812 == null ? AbstractC1469.m3333(context2, R.color.material_slider_active_tick_marks_color) : colorStateListM33812);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(29, 0));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(28, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(11, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(27, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(21, this.f1806 / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(22, this.f1806 / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(7, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        c1948.m3917();
        this.f1787 = ViewConfiguration.get(context2).getScaledTouchSlop();
        C0362 c0362 = new C0362(slider);
        this.f1777 = c0362;
        AbstractC3638.m5183(this, c0362);
        this.f1778 = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f1777.m3062(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1770.setColor(m1660(this.f1829));
        this.f1771.setColor(m1660(this.f1828));
        this.f1774.setColor(m1660(this.f1827));
        this.f1775.setColor(m1660(this.f1826));
        this.f1776.setColor(m1660(this.f1828));
        for (C3478 c3478 : this.f1781) {
            if (c3478.isStateful()) {
                c3478.setState(getDrawableState());
            }
        }
        C1948 c1948 = this.f1833;
        if (c1948.isStateful()) {
            c1948.setState(getDrawableState());
        }
        int iM1660 = m1660(this.f1825);
        Paint paint = this.f1773;
        paint.setColor(iM1660);
        paint.setAlpha(63);
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f1777.f4586;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public List<Float> getValues() {
        return new ArrayList(this.f1814);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f1838);
        for (C3478 c3478 : this.f1781) {
            ViewGroup viewGroupM3389 = AbstractC1471.m3389(this);
            if (viewGroupM3389 == null) {
                c3478.getClass();
            } else {
                c3478.getClass();
                int[] iArr = new int[2];
                viewGroupM3389.getLocationOnScreen(iArr);
                c3478.f10949 = iArr[0];
                viewGroupM3389.getWindowVisibleDisplayFrame(c3478.f10942);
                viewGroupM3389.addOnLayoutChangeListener(c3478.f10941);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        RunnableC0361 runnableC0361 = this.f1779;
        if (runnableC0361 != null) {
            removeCallbacks(runnableC0361);
        }
        this.f1784 = false;
        for (C3478 c3478 : this.f1781) {
            ViewGroup viewGroupM3389 = AbstractC1471.m3389(this);
            C1681 c1681 = viewGroupM3389 == null ? null : new C1681(viewGroupM3389);
            if (c1681 != null) {
                ((ViewOverlay) c1681.f5660).remove(c3478);
                ViewGroup viewGroupM33810 = AbstractC1471.m3389(this);
                if (viewGroupM33810 == null) {
                    c3478.getClass();
                } else {
                    viewGroupM33810.removeOnLayoutChangeListener(c3478.f10941);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f1838);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        float f2;
        AbstractC0364 abstractC0364 = this;
        Canvas canvas2 = canvas;
        if (abstractC0364.f1824) {
            abstractC0364.m1678();
            abstractC0364.m1664();
        }
        super.onDraw(canvas);
        int iM1654 = abstractC0364.m1654();
        int i3 = 0;
        float fFloatValue = ((Float) abstractC0364.f1814.get(0)).floatValue();
        ArrayList arrayList = abstractC0364.f1814;
        float fFloatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        float f3 = abstractC0364.f1813;
        RectF rectF = abstractC0364.f1831;
        if (fFloatValue2 < f3 || (abstractC0364.f1814.size() > 1 && fFloatValue > abstractC0364.f1812)) {
            int i4 = abstractC0364.f1822;
            float[] fArrM1659 = abstractC0364.m1659();
            int i5 = abstractC0364.f1799;
            float f4 = i4;
            float f5 = (fArrM1659[1] * f4) + i5;
            float f6 = i5 + i4;
            Paint paint = abstractC0364.f1770;
            if (f5 < f6) {
                int i6 = abstractC0364.f1803;
                if (i6 > 0) {
                    float f7 = f5 + i6;
                    float f8 = iM1654;
                    f = 2.0f;
                    float f9 = abstractC0364.f1798 / 2.0f;
                    rectF.set(f7, f8 - f9, i5 + i4 + f9, f9 + f8);
                    abstractC0364.m1676(canvas2, paint, rectF, 3);
                } else {
                    f = 2.0f;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f10 = iM1654;
                    canvas2.drawLine(f5, f10, abstractC0364.f1799 + i4, f10, paint);
                }
            } else {
                f = 2.0f;
            }
            int i7 = abstractC0364.f1799;
            float f11 = i7;
            float f12 = (fArrM1659[i3] * f4) + f11;
            if (f12 > f11) {
                int i8 = abstractC0364.f1803;
                if (i8 > 0) {
                    float f13 = abstractC0364.f1798 / f;
                    float f14 = iM1654;
                    rectF.set(i7 - f13, f14 - f13, f12 - i8, f13 + f14);
                    abstractC0364.m1676(canvas2, paint, rectF, 2);
                } else {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f15 = iM1654;
                    canvas2.drawLine(abstractC0364.f1799, f15, f12, f15, paint);
                }
            }
        } else {
            i3 = 0;
            f = 2.0f;
        }
        if (fFloatValue2 > abstractC0364.f1812) {
            int i9 = abstractC0364.f1822;
            float[] fArrM16510 = abstractC0364.m1659();
            float f16 = abstractC0364.f1799;
            float f17 = i9;
            float fM1680 = (fArrM16510[1] * f17) + f16;
            float fM1681 = (fArrM16510[i3] * f17) + f16;
            int i10 = abstractC0364.f1803;
            Paint paint2 = abstractC0364.f1771;
            if (i10 > 0) {
                int i11 = abstractC0364.f1814.size() == 1 ? abstractC0364.m1663() ? 3 : 2 : 4;
                for (int i12 = i3; i12 < abstractC0364.f1814.size(); i12++) {
                    if (abstractC0364.f1814.size() > 1) {
                        if (i12 > 0) {
                            fM1681 = abstractC0364.m1680(((Float) abstractC0364.f1814.get(i12 - 1)).floatValue());
                        }
                        fM1680 = abstractC0364.m1680(((Float) abstractC0364.f1814.get(i12)).floatValue());
                        if (abstractC0364.m1663()) {
                            fM1680 = fM1681;
                            fM1681 = fM1680;
                        }
                    }
                    int iM4792 = AbstractC2844.m4792(i11);
                    if (iM4792 != 1) {
                        if (iM4792 == 2) {
                            fM1681 += abstractC0364.f1803;
                            fM1680 = (abstractC0364.f1798 / f) + fM1680;
                        } else if (iM4792 == 3) {
                            f2 = abstractC0364.f1803;
                            fM1681 += f2;
                        }
                        if (fM1681 >= fM1680) {
                            float f18 = iM1654;
                            float f19 = abstractC0364.f1798 / f;
                            rectF.set(fM1681, f18 - f19, fM1680, f19 + f18);
                            abstractC0364.m1676(canvas2, paint2, rectF, i11);
                        }
                    } else {
                        fM1681 -= abstractC0364.f1798 / f;
                        f2 = abstractC0364.f1803;
                    }
                    fM1680 -= f2;
                    if (fM1681 >= fM1680) {
                        float f110 = iM1654;
                        float f111 = abstractC0364.f1798 / f;
                        rectF.set(fM1681, f110 - f111, fM1680, f111 + f110);
                        abstractC0364.m1676(canvas2, paint2, rectF, i11);
                    }
                }
            } else {
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeCap(Paint.Cap.ROUND);
                float f20 = iM1654;
                canvas2.drawLine(fM1681, f20, fM1680, f20, paint2);
            }
        }
        if (abstractC0364.f1819 && abstractC0364.f1817 > 0.0f) {
            float[] fArrM16511 = abstractC0364.m1659();
            int iCeil = (int) Math.ceil(((abstractC0364.f1818.length / f) - 1.0f) * fArrM16511[i3]);
            int iFloor = (int) Math.floor(((abstractC0364.f1818.length / f) - 1.0f) * fArrM16511[1]);
            Paint paint3 = abstractC0364.f1774;
            if (iCeil > 0) {
                canvas2.drawPoints(abstractC0364.f1818, i3, iCeil * 2, paint3);
            }
            if (iCeil <= iFloor) {
                canvas2.drawPoints(abstractC0364.f1818, iCeil * 2, ((iFloor - iCeil) + 1) * 2, abstractC0364.f1775);
            }
            int i13 = (iFloor + 1) * 2;
            float[] fArr = abstractC0364.f1818;
            if (i13 < fArr.length) {
                canvas2.drawPoints(fArr, i13, fArr.length - i13, paint3);
            }
        }
        if (abstractC0364.f1806 <= 0) {
            i = 0;
        } else {
            int size = abstractC0364.f1814.size();
            Paint paint4 = abstractC0364.f1776;
            if (size >= 1) {
                ArrayList arrayList2 = abstractC0364.f1814;
                float fFloatValue3 = ((Float) arrayList2.get(arrayList2.size() - 1)).floatValue();
                float f21 = abstractC0364.f1813;
                if (fFloatValue3 < f21) {
                    canvas2.drawPoint(abstractC0364.m1680(f21), iM1654, paint4);
                }
            }
            if (abstractC0364.f1814.size() > 1) {
                i = 0;
                float fFloatValue4 = ((Float) abstractC0364.f1814.get(0)).floatValue();
                float f22 = abstractC0364.f1812;
                if (fFloatValue4 > f22) {
                    canvas2.drawPoint(abstractC0364.m1680(f22), iM1654, paint4);
                }
            } else {
                i = 0;
            }
        }
        if ((abstractC0364.f1811 || abstractC0364.isFocused()) && abstractC0364.isEnabled()) {
            int i14 = abstractC0364.f1822;
            if (!(abstractC0364.getBackground() instanceof RippleDrawable)) {
                int iM1667 = (int) ((abstractC0364.m1667(((Float) abstractC0364.f1814.get(abstractC0364.f1816)).floatValue()) * i14) + abstractC0364.f1799);
                if (Build.VERSION.SDK_INT < 28) {
                    int i15 = abstractC0364.f1802;
                    canvas2.clipRect(iM1667 - i15, iM1654 - i15, iM1667 + i15, i15 + iM1654, Region.Op.UNION);
                }
                canvas2.drawCircle(iM1667, iM1654, abstractC0364.f1802, abstractC0364.f1773);
            }
        }
        abstractC0364.m1675();
        int i16 = abstractC0364.f1822;
        while (i < abstractC0364.f1814.size()) {
            float fFloatValue5 = ((Float) abstractC0364.f1814.get(i)).floatValue();
            Drawable drawable = abstractC0364.f1834;
            if (drawable != null) {
                i2 = iM1654;
                abstractC0364.m1656(canvas2, i16, i2, fFloatValue5, drawable);
            } else {
                i2 = iM1654;
                if (i < abstractC0364.f1835.size()) {
                    abstractC0364.m1656(canvas, i16, i2, fFloatValue5, (Drawable) abstractC0364.f1835.get(i));
                } else {
                    if (!abstractC0364.isEnabled()) {
                        canvas.drawCircle((abstractC0364.m1667(fFloatValue5) * i16) + abstractC0364.f1799, i2, abstractC0364.getThumbRadius(), abstractC0364.f1772);
                    }
                    abstractC0364.m1656(canvas, i16, i2, fFloatValue5, abstractC0364.f1833);
                }
            }
            i++;
            abstractC0364 = this;
            canvas2 = canvas;
            iM1654 = i2;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C0362 c0362 = this.f1777;
        if (!z) {
            this.f1815 = -1;
            c0362.m3059(this.f1816);
            return;
        }
        if (i == 1) {
            m1665(Integer.MAX_VALUE);
        } else if (i == 2) {
            m1665(Integer.MIN_VALUE);
        } else if (i == 17) {
            m1666(Integer.MAX_VALUE);
        } else if (i == 66) {
            m1666(Integer.MIN_VALUE);
        }
        c0362.m3066(this.f1816);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f1814.size() == 1) {
            this.f1815 = 0;
        }
        Float fValueOf = null;
        Boolean boolValueOf = null;
        if (this.f1815 == -1) {
            if (i != 61) {
                if (i == 66) {
                    this.f1815 = this.f1816;
                    postInvalidate();
                    boolValueOf = Boolean.TRUE;
                } else if (i == 81) {
                    m1665(1);
                    boolValueOf = Boolean.TRUE;
                } else if (i == 69) {
                    m1665(-1);
                    boolValueOf = Boolean.TRUE;
                } else if (i != 70) {
                    switch (i) {
                        case Opcodes.ILOAD /* 21 */:
                            m1666(-1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case Opcodes.LLOAD /* 22 */:
                            m1666(1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case Opcodes.FLOAD /* 23 */:
                            this.f1815 = this.f1816;
                            postInvalidate();
                            boolValueOf = Boolean.TRUE;
                            break;
                    }
                } else {
                    m1665(1);
                    boolValueOf = Boolean.TRUE;
                }
            } else if (keyEvent.hasNoModifiers()) {
                boolValueOf = Boolean.valueOf(m1665(1));
            } else {
                boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(m1665(-1)) : Boolean.FALSE;
            }
            return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        boolean zIsLongPress = this.f1823 | keyEvent.isLongPress();
        this.f1823 = zIsLongPress;
        float fRound = 1.0f;
        if (zIsLongPress) {
            float f = this.f1817;
            fRound = f != 0.0f ? f : 1.0f;
            float f2 = (this.f1813 - this.f1812) / fRound;
            float f3 = 20;
            if (f2 > f3) {
                fRound *= Math.round(f2 / f3);
            }
        } else {
            float f4 = this.f1817;
            if (f4 != 0.0f) {
                fRound = f4;
            }
        }
        if (i == 21) {
            if (!m1663()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i == 22) {
            if (m1663()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i == 69) {
            fValueOf = Float.valueOf(-fRound);
        } else if (i == 70 || i == 81) {
            fValueOf = Float.valueOf(fRound);
        }
        if (fValueOf != null) {
            if (m1671(this.f1815, fValueOf.floatValue() + ((Float) this.f1814.get(this.f1815)).floatValue())) {
                m1674();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m1665(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m1665(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.f1815 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f1823 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f1796;
        int i4 = this.f1797;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + ((i4 == 1 || i4 == 3) ? ((C3478) this.f1781.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C0363 c0363 = (C0363) parcelable;
        super.onRestoreInstanceState(c0363.getSuperState());
        this.f1812 = c0363.f1765;
        this.f1813 = c0363.f1766;
        m1670(c0363.f1767);
        this.f1817 = c0363.f1768;
        if (c0363.f1769) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0363 c0363 = new C0363(super.onSaveInstanceState());
        c0363.f1765 = this.f1812;
        c0363.f1766 = this.f1813;
        c0363.f1767 = new ArrayList(this.f1814);
        c0363.f1768 = this.f1817;
        c0363.f1769 = hasFocus();
        return c0363;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f1822 = Math.max(i - (this.f1799 * 2), 0);
        m1664();
        m1674();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        Iterator it;
        int i;
        float f;
        Slider slider;
        if (isEnabled()) {
            float x = motionEvent.getX();
            float f2 = (x - this.f1799) / this.f1822;
            this.f1836 = f2;
            float fMax = Math.max(0.0f, f2);
            this.f1836 = fMax;
            this.f1836 = Math.min(1.0f, fMax);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                int i2 = this.f1787;
                if (actionMasked == 1) {
                    this.f1811 = false;
                    motionEvent2 = this.f1810;
                    if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                        f = i2;
                        if (Math.abs(this.f1810.getX() - motionEvent.getX()) <= f && Math.abs(this.f1810.getY() - motionEvent.getY()) <= f) {
                            slider = (Slider) this;
                            if (slider.getActiveThumbIndex() == -1) {
                                slider.setActiveThumbIndex(0);
                            }
                            m1668();
                        }
                    }
                    if (this.f1815 != -1) {
                        m1672();
                        m1674();
                        if (this.f1803 > 0 && (i = this.f1804) != -1 && this.f1805 != -1) {
                            setThumbWidth(i);
                            setThumbTrackGapSize(this.f1805);
                        }
                        this.f1815 = -1;
                        it = this.f1783.iterator();
                        if (it.hasNext()) {
                            throw AbstractC1095.m2792(it);
                        }
                    }
                    invalidate();
                } else if (actionMasked == 2) {
                    if (!this.f1811) {
                        if (!m1662(motionEvent) || Math.abs(x - this.f1809) >= i2) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            m1668();
                        }
                    }
                    Slider slider2 = (Slider) this;
                    if (slider2.getActiveThumbIndex() == -1) {
                        slider2.setActiveThumbIndex(0);
                    }
                    this.f1811 = true;
                    m1672();
                    m1674();
                    invalidate();
                } else if (actionMasked == 3) {
                    this.f1811 = false;
                    motionEvent2 = this.f1810;
                    if (motionEvent2 != null) {
                        f = i2;
                        if (Math.abs(this.f1810.getX() - motionEvent.getX()) <= f) {
                            slider = (Slider) this;
                            if (slider.getActiveThumbIndex() == -1) {
                                slider.setActiveThumbIndex(0);
                            }
                            m1668();
                        }
                    }
                    if (this.f1815 != -1) {
                        m1672();
                        m1674();
                        if (this.f1803 > 0) {
                            setThumbWidth(i);
                            setThumbTrackGapSize(this.f1805);
                        }
                        this.f1815 = -1;
                        it = this.f1783.iterator();
                        if (it.hasNext()) {
                            throw AbstractC1095.m2792(it);
                        }
                    }
                    invalidate();
                }
            } else {
                this.f1809 = x;
                if (!m1662(motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    Slider slider3 = (Slider) this;
                    if (slider3.getActiveThumbIndex() == -1) {
                        slider3.setActiveThumbIndex(0);
                    }
                    requestFocus();
                    this.f1811 = true;
                    m1672();
                    m1674();
                    int i3 = this.f1803;
                    if (i3 > 0) {
                        int i4 = this.f1800;
                        this.f1804 = i4;
                        this.f1805 = i3;
                        int iRound = Math.round(i4 * 0.5f);
                        int i5 = this.f1800 - iRound;
                        setThumbWidth(iRound);
                        setThumbTrackGapSize(this.f1803 - (i5 / 2));
                    }
                    invalidate();
                    m1668();
                }
            }
            setPressed(this.f1811);
            this.f1810 = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup viewGroupM3389 = AbstractC1471.m3389(this);
            C1681 c1681 = viewGroupM3389 == null ? null : new C1681(viewGroupM3389);
            if (c1681 == null) {
                return;
            }
            Iterator it = this.f1781.iterator();
            while (it.hasNext()) {
                ((ViewOverlay) c1681.f5660).remove((C3478) it.next());
            }
        }
    }

    public void setActiveThumbIndex(int i) {
        this.f1815 = i;
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public void setSeparationUnit(int i) {
        this.f1837 = i;
        this.f1824 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f);

    public abstract void setThumbHeight(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f);

    public abstract void setThumbTrackGapSize(int i);

    public abstract void setThumbWidth(int i);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i);

    public abstract void setTrackStopIndicatorSize(int i);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        m1670(arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1653(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f1800, this.f1801);
        } else {
            float fMax = Math.max(this.f1800, this.f1801) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m1654() {
        int i = this.f1796 / 2;
        int i2 = this.f1797;
        return i + ((i2 == 1 || i2 == 3) ? ((C3478) this.f1781.get(0)).getIntrinsicHeight() : 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ValueAnimator m1655(boolean z) {
        int iM5341;
        TimeInterpolator timeInterpolatorM5342;
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.f1786 : this.f1785;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        int i = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        if (z) {
            iM5341 = AbstractC3744.m5341(getContext(), R.attr.motionDurationMedium4, 83);
            timeInterpolatorM5342 = AbstractC3744.m5342(getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0172.f1257);
        } else {
            iM5341 = AbstractC3744.m5341(getContext(), R.attr.motionDurationShort3, Opcodes.LNEG);
            timeInterpolatorM5342 = AbstractC3744.m5342(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, AbstractC0172.f1255);
        }
        valueAnimatorOfFloat.setDuration(iM5341);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorM5342);
        valueAnimatorOfFloat.addUpdateListener(new C0360(this, i));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m1656(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((this.f1799 + ((int) (m1667(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m1657() {
        if (!this.f1784) {
            this.f1784 = true;
            ValueAnimator valueAnimatorM1655 = m1655(true);
            this.f1785 = valueAnimatorM1655;
            this.f1786 = null;
            valueAnimatorM1655.start();
        }
        ArrayList arrayList = this.f1781;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.f1814.size() && it.hasNext(); i++) {
            if (i != this.f1816) {
                m1669((C3478) it.next(), ((Float) this.f1814.get(i)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f1814.size())));
        }
        m1669((C3478) it.next(), ((Float) this.f1814.get(this.f1816)).floatValue());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m1658() {
        if (this.f1784) {
            this.f1784 = false;
            ValueAnimator valueAnimatorM1655 = m1655(false);
            this.f1786 = valueAnimatorM1655;
            this.f1785 = null;
            valueAnimatorM1655.addListener(new C0131(this, 2));
            this.f1786.start();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final float[] m1659() {
        float fFloatValue = ((Float) this.f1814.get(0)).floatValue();
        ArrayList arrayList = this.f1814;
        float fFloatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.f1814.size() == 1) {
            fFloatValue = this.f1812;
        }
        float fM1667 = m1667(fFloatValue);
        float fM1668 = m1667(fFloatValue2);
        return m1663() ? new float[]{fM1668, fM1667} : new float[]{fM1667, fM1668};
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m1660(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean m1661(double d) {
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.f1817)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean m1662(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m1663() {
        Field field = AbstractC3638.f11333;
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m1664() {
        if (this.f1817 <= 0.0f) {
            return;
        }
        m1678();
        int iMin = Math.min((int) (((this.f1813 - this.f1812) / this.f1817) + 1.0f), (this.f1822 / this.f1793) + 1);
        float[] fArr = this.f1818;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f1818 = new float[iMin * 2];
        }
        float f = this.f1822 / (iMin - 1);
        for (int i = 0; i < iMin * 2; i += 2) {
            float[] fArr2 = this.f1818;
            fArr2[i] = ((i / 2.0f) * f) + this.f1799;
            fArr2[i + 1] = m1654();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final boolean m1665(int i) {
        int i2 = this.f1816;
        long j = ((long) i2) + ((long) i);
        long size = this.f1814.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.f1816 = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.f1815 != -1) {
            this.f1815 = i3;
        }
        m1674();
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m1666(int i) {
        if (m1663()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        m1665(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final float m1667(float f) {
        float f2 = this.f1812;
        float f3 = (f - f2) / (this.f1813 - f2);
        return m1663() ? 1.0f - f3 : f3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m1668() {
        Iterator it = this.f1783.iterator();
        if (it.hasNext()) {
            throw AbstractC1095.m2792(it);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final void m1669(C3478 c3478, float f) {
        String str = String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
        if (!TextUtils.equals(c3478.f10937, str)) {
            c3478.f10937 = str;
            c3478.f10940.f9520 = true;
            c3478.invalidateSelf();
        }
        int iM1667 = (this.f1799 + ((int) (m1667(f) * this.f1822))) - (c3478.getIntrinsicWidth() / 2);
        int iM1654 = m1654() - ((this.f1801 / 2) + this.f1808);
        c3478.setBounds(iM1667, iM1654 - c3478.getIntrinsicHeight(), c3478.getIntrinsicWidth() + iM1667, iM1654);
        Rect rect = new Rect(c3478.getBounds());
        AbstractC1018.m2714(AbstractC1471.m3389(this), this, rect);
        c3478.setBounds(rect);
        ViewGroup viewGroupM3389 = AbstractC1471.m3389(this);
        ((ViewOverlay) (viewGroupM3389 == null ? null : new C1681(viewGroupM3389)).f5660).add(c3478);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m1670(ArrayList arrayList) {
        ViewGroup viewGroupM3389;
        int resourceId;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f1814.size() == arrayList.size() && this.f1814.equals(arrayList)) {
            return;
        }
        this.f1814 = arrayList;
        this.f1824 = true;
        this.f1816 = 0;
        m1674();
        ArrayList<C3478> arrayList2 = this.f1781;
        if (arrayList2.size() > this.f1814.size()) {
            List<C3478> listSubList = arrayList2.subList(this.f1814.size(), arrayList2.size());
            for (C3478 c3478 : listSubList) {
                Field field = AbstractC3638.f11333;
                if (isAttachedToWindow()) {
                    ViewGroup viewGroupM33810 = AbstractC1471.m3389(this);
                    C1681 c1681 = viewGroupM33810 == null ? null : new C1681(viewGroupM33810);
                    if (c1681 != null) {
                        ((ViewOverlay) c1681.f5660).remove(c3478);
                        ViewGroup viewGroupM33811 = AbstractC1471.m3389(this);
                        if (viewGroupM33811 == null) {
                            c3478.getClass();
                        } else {
                            viewGroupM33811.removeOnLayoutChangeListener(c3478.f10941);
                        }
                    }
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f1814.size()) {
            Context context = getContext();
            int i = this.f1780;
            C3478 c3479 = new C3478(context, i);
            TypedArray typedArrayM4263 = AbstractC2240.m4263(c3479.f10938, null, AbstractC2521.f8023, 0, i, new int[0]);
            Context context2 = c3479.f10938;
            c3479.f10948 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z = typedArrayM4263.getBoolean(8, true);
            c3479.f10947 = z;
            if (z) {
                C2737 c2737M4728 = c3479.f6437.f6419.m4728();
                c2737M4728.f8796 = c3479.m4999();
                c3479.setShapeAppearanceModel(c2737M4728.m4722());
            } else {
                c3479.f10948 = 0;
            }
            CharSequence text = typedArrayM4263.getText(6);
            boolean zEquals = TextUtils.equals(c3479.f10937, text);
            C2966 c2966 = c3479.f10940;
            if (!zEquals) {
                c3479.f10937 = text;
                c2966.f9520 = true;
                c3479.invalidateSelf();
            }
            C2963 c2963 = (!typedArrayM4263.hasValue(0) || (resourceId = typedArrayM4263.getResourceId(0, 0)) == 0) ? null : new C2963(context2, resourceId);
            if (c2963 != null && typedArrayM4263.hasValue(1)) {
                c2963.f9507 = AbstractC1471.m3388(context2, typedArrayM4263, 1);
            }
            c2966.m4977(c2963, context2);
            TypedValue typedValueM3347 = AbstractC1469.m3347(context2, R.attr.colorOnBackground, C3478.class.getCanonicalName());
            int i2 = typedValueM3347.resourceId;
            int color = i2 != 0 ? context2.getColor(i2) : typedValueM3347.data;
            TypedValue typedValueM3348 = AbstractC1469.m3347(context2, android.R.attr.colorBackground, C3478.class.getCanonicalName());
            int i3 = typedValueM3348.resourceId;
            c3479.m3914(ColorStateList.valueOf(typedArrayM4263.getColor(7, AbstractC0747.m2324(AbstractC0747.m2326(color, Opcodes.IFEQ), AbstractC0747.m2326(i3 != 0 ? context2.getColor(i3) : typedValueM3348.data, 229)))));
            TypedValue typedValueM3349 = AbstractC1469.m3347(context2, R.attr.colorSurface, C3478.class.getCanonicalName());
            int i4 = typedValueM3349.resourceId;
            c3479.m3918(ColorStateList.valueOf(i4 != 0 ? context2.getColor(i4) : typedValueM3349.data));
            c3479.f10943 = typedArrayM4263.getDimensionPixelSize(2, 0);
            c3479.f10944 = typedArrayM4263.getDimensionPixelSize(4, 0);
            c3479.f10945 = typedArrayM4263.getDimensionPixelSize(5, 0);
            c3479.f10946 = typedArrayM4263.getDimensionPixelSize(3, 0);
            typedArrayM4263.recycle();
            arrayList2.add(c3479);
            Field field2 = AbstractC3638.f11333;
            if (isAttachedToWindow() && (viewGroupM3389 = AbstractC1471.m3389(this)) != null) {
                int[] iArr = new int[2];
                viewGroupM3389.getLocationOnScreen(iArr);
                c3479.f10949 = iArr[0];
                viewGroupM3389.getWindowVisibleDisplayFrame(c3479.f10942);
                viewGroupM3389.addOnLayoutChangeListener(c3479.f10941);
            }
        }
        int i5 = arrayList2.size() == 1 ? 0 : 1;
        for (C3478 c34710 : arrayList2) {
            c34710.f6437.f6428 = i5;
            c34710.invalidateSelf();
        }
        Iterator it = this.f1782.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Iterator it2 = this.f1814.iterator();
            if (it2.hasNext()) {
                ((Float) it2.next()).getClass();
                throw null;
            }
        }
        postInvalidate();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final boolean m1671(int i, float f) {
        this.f1816 = i;
        if (Math.abs(f - ((Float) this.f1814.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f1837 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = (minSeparation - this.f1799) / this.f1822;
                float f3 = this.f1812;
                minSeparation = ((f3 - this.f1813) * f2) + f3;
            }
        }
        if (m1663()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        float fFloatValue = i2 >= this.f1814.size() ? this.f1813 : ((Float) this.f1814.get(i2)).floatValue() - minSeparation;
        int i3 = i - 1;
        float fFloatValue2 = i3 < 0 ? this.f1812 : minSeparation + ((Float) this.f1814.get(i3)).floatValue();
        if (f < fFloatValue2) {
            f = fFloatValue2;
        } else if (f > fFloatValue) {
            f = fFloatValue;
        }
        this.f1814.set(i, Float.valueOf(f));
        Iterator it = this.f1782.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            ((Float) this.f1814.get(i)).getClass();
            throw null;
        }
        AccessibilityManager accessibilityManager = this.f1778;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.f1779;
            if (runnable == null) {
                this.f1779 = new RunnableC0361(this);
            } else {
                removeCallbacks(runnable);
            }
            RunnableC0361 runnableC0361 = this.f1779;
            runnableC0361.f1761 = i;
            postDelayed(runnableC0361, 200L);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void m1672() {
        double dRound;
        float f = this.f1836;
        float f2 = this.f1817;
        if (f2 > 0.0f) {
            int i = (int) ((this.f1813 - this.f1812) / f2);
            dRound = ((double) Math.round(f * i)) / ((double) i);
        } else {
            dRound = f;
        }
        if (m1663()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.f1813;
        float f4 = this.f1812;
        m1671(this.f1815, (float) ((dRound * ((double) (f3 - f4))) + ((double) f4)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m1673(int i, Rect rect) {
        int iM1667 = this.f1799 + ((int) (m1667(getValues().get(i).floatValue()) * this.f1822));
        int iM1654 = m1654();
        int iMax = Math.max(this.f1800 / 2, this.f1794 / 2);
        int iMax2 = Math.max(this.f1801 / 2, this.f1794 / 2);
        rect.set(iM1667 - iMax, iM1654 - iMax2, iM1667 + iMax, iM1654 + iMax2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void m1674() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iM1667 = (int) ((m1667(((Float) this.f1814.get(this.f1816)).floatValue()) * this.f1822) + this.f1799);
            int iM1654 = m1654();
            int i = this.f1802;
            background.setHotspotBounds(iM1667 - i, iM1654 - i, iM1667 + i, iM1654 + i);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void m1675() {
        int i = this.f1797;
        if (i == 0 || i == 1) {
            if (this.f1815 == -1 || !isEnabled()) {
                m1658();
                return;
            } else {
                m1657();
                return;
            }
        }
        if (i == 2) {
            m1658();
            return;
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.f1797);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            AbstractC1471.m3389(this).getHitRect(rect);
            if (getLocalVisibleRect(rect)) {
                m1657();
                return;
            }
        }
        m1658();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m1676(Canvas canvas, Paint paint, RectF rectF, int i) {
        float f;
        float f2 = this.f1798 / 2.0f;
        int iM4792 = AbstractC2844.m4792(i);
        if (iM4792 == 1) {
            f = this.f1807;
        } else if (iM4792 != 2) {
            if (iM4792 == 3) {
                f2 = this.f1807;
            }
            f = f2;
        } else {
            f = f2;
            f2 = this.f1807;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        Path path = this.f1830;
        path.reset();
        if (rectF.width() >= f2 + f) {
            path.addRoundRect(rectF, new float[]{f2, f2, f, f, f, f, f2, f2}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin = Math.min(f2, f);
        float fMax = Math.max(f2, f);
        canvas.save();
        path.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
        canvas.clipPath(path);
        int iM4793 = AbstractC2844.m4792(i);
        RectF rectF2 = this.f1832;
        if (iM4793 == 1) {
            float f3 = rectF.left;
            rectF2.set(f3, rectF.top, (2.0f * fMax) + f3, rectF.bottom);
        } else if (iM4793 != 2) {
            rectF2.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            float f4 = rectF.right;
            rectF2.set(f4 - (2.0f * fMax), rectF.top, f4, rectF.bottom);
        }
        canvas.drawRoundRect(rectF2, fMax, fMax, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final void m1677() {
        boolean z;
        int iMax = Math.max(this.f1795, Math.max(this.f1798 + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.f1801));
        boolean z2 = true;
        if (iMax == this.f1796) {
            z = false;
        } else {
            this.f1796 = iMax;
            z = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.f1800 / 2) - this.f1789, 0), Math.max((this.f1798 - this.f1790) / 2, 0)), Math.max(Math.max(this.f1820 - this.f1791, 0), Math.max(this.f1821 - this.f1792, 0))) + this.f1788;
        if (this.f1799 == iMax2) {
            z2 = false;
        } else {
            this.f1799 = iMax2;
            Field field = AbstractC3638.f11333;
            if (isLaidOut()) {
                this.f1822 = Math.max(getWidth() - (this.f1799 * 2), 0);
                m1664();
            }
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final void m1678() {
        if (this.f1824) {
            float f = this.f1812;
            float f2 = this.f1813;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + this.f1812 + ") must be smaller than valueTo(" + this.f1813 + ")");
            }
            if (f2 <= f) {
                throw new IllegalStateException("valueTo(" + this.f1813 + ") must be greater than valueFrom(" + this.f1812 + ")");
            }
            if (this.f1817 > 0.0f && !m1679(f2)) {
                throw new IllegalStateException("The stepSize(" + this.f1817 + ") must be 0, or a factor of the valueFrom(" + this.f1812 + ")-valueTo(" + this.f1813 + ") range");
            }
            for (Float f3 : this.f1814) {
                if (f3.floatValue() < this.f1812 || f3.floatValue() > this.f1813) {
                    throw new IllegalStateException("Slider value(" + f3 + ") must be greater or equal to valueFrom(" + this.f1812 + "), and lower or equal to valueTo(" + this.f1813 + ")");
                }
                if (this.f1817 > 0.0f && !m1679(f3.floatValue())) {
                    float f4 = this.f1812;
                    float f5 = this.f1817;
                    throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + f4 + ") plus a multiple of stepSize(" + f5 + ") when using stepSize(" + f5 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f6 = this.f1817;
            if (f6 > 0.0f && minSeparation > 0.0f) {
                if (this.f1837 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.f1817 + ")");
                }
                if (minSeparation < f6 || !m1661(minSeparation)) {
                    float f7 = this.f1817;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                }
            }
            float f8 = this.f1817;
            if (f8 != 0.0f) {
                if (((int) f8) != f8) {
                    Log.w("ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲈᲇᤝᤞ", "Floating point value used for stepSize(" + f8 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f9 = this.f1812;
                if (((int) f9) != f9) {
                    Log.w("ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲈᲇᤝᤞ", "Floating point value used for valueFrom(" + f9 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f10 = this.f1813;
                if (((int) f10) != f10) {
                    Log.w("ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲈᲇᤝᤞ", "Floating point value used for valueTo(" + f10 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.f1824 = false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final boolean m1679(float f) {
        return m1661(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.f1812)), MathContext.DECIMAL64).doubleValue());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final float m1680(float f) {
        return (m1667(f) * this.f1822) + this.f1799;
    }

    public void setValues(List<Float> list) {
        m1670(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f1834 = null;
        this.f1835 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f1835;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            m1653(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
