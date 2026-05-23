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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0389 extends View {

    public final Paint f1799;

    public final Paint f1800;

    public final Paint f1801;

    public final Paint f1802;

    public final Paint f1803;

    public final Paint f1804;

    public final Paint f1805;

    public final C0387 f1806;

    public final AccessibilityManager f1807;

    public RunnableC0386 f1808;

    public final int f1809;

    public final ArrayList f1810;

    public final ArrayList f1811;

    public final ArrayList f1812;

    public boolean f1813;

    public ValueAnimator f1814;

    public ValueAnimator f1815;

    public final int f1816;

    public final int f1817;

    public final int f1818;

    public final int f1819;

    public final int f1820;

    public final int f1821;

    public final int f1822;

    public final int f1823;

    public final int f1824;

    public int f1825;

    public int f1826;

    public int f1827;

    public int f1828;

    public int f1829;

    public int f1830;

    public int f1831;

    public int f1832;

    public int f1833;

    public int f1834;

    public int f1835;

    public int f1836;

    public final int f1837;

    public float f1838;

    public MotionEvent f1839;

    public boolean f1840;

    public float f1841;

    public float f1842;

    public ArrayList f1843;

    public int f1844;

    public int f1845;

    public float f1846;

    public float[] f1847;

    public boolean f1848;

    public int f1849;

    public int f1850;

    public int f1851;

    public boolean f1852;

    public boolean f1853;

    public ColorStateList f1854;

    public ColorStateList f1855;

    public ColorStateList f1856;

    public ColorStateList f1857;

    public ColorStateList f1858;

    public final Path f1859;

    public final RectF f1860;

    public final RectF f1861;

    public final C1917 f1862;

    public Drawable f1863;

    public List f1864;

    public float f1865;

    public int f1866;

    public final ViewTreeObserverOnScrollChangedListenerC0384 f1867;

    /* JADX WARN: Type inference failed for: r1v5, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤝᤞᲇᲁ] */
    public AbstractC0389(Context context, AttributeSet attributeSet) {
        super(AbstractC2665.m4673(context, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider), attributeSet, R.attr.sliderStyle);
        this.f1810 = new ArrayList();
        this.f1811 = new ArrayList();
        this.f1812 = new ArrayList();
        this.f1813 = false;
        this.f1833 = -1;
        this.f1834 = -1;
        this.f1840 = false;
        this.f1843 = new ArrayList();
        this.f1844 = -1;
        this.f1845 = -1;
        this.f1846 = 0.0f;
        this.f1848 = true;
        this.f1852 = false;
        this.f1859 = new Path();
        this.f1860 = new RectF();
        this.f1861 = new RectF();
        C1917 c1917 = new C1917();
        this.f1862 = c1917;
        this.f1864 = Collections.EMPTY_LIST;
        this.f1866 = 0;
        final Slider slider = (Slider) this;
        this.f1867 = new ViewTreeObserver.OnScrollChangedListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤝᤞᲇᲁ
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                slider.m1569();
            }
        };
        Context context2 = getContext();
        this.f1799 = new Paint();
        this.f1800 = new Paint();
        Paint paint = new Paint(1);
        this.f1801 = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f1802 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f1803 = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(Paint.Style.STROKE);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(Paint.Cap.ROUND);
        Paint paint4 = new Paint();
        this.f1804 = paint4;
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        Paint paint5 = new Paint();
        this.f1805 = paint5;
        paint5.setStyle(Paint.Style.FILL);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Resources resources = context2.getResources();
        this.f1824 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f1817 = dimensionPixelOffset;
        this.f1828 = dimensionPixelOffset;
        this.f1818 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f1819 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f1820 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f1821 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f1822 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.f1837 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        AbstractC3471.m5066(context2, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = AbstractC2467.f7865;
        AbstractC3471.m5067(context2, attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        this.f1809 = typedArrayObtainStyledAttributes.getResourceId(8, R.style.Widget_MaterialComponents_Tooltip);
        this.f1841 = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.f1842 = typedArrayObtainStyledAttributes.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.f1841));
        this.f1846 = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        this.f1823 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(9, (float) Math.ceil(AbstractC1459.m3180(getContext(), 48))));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(24);
        int i = zHasValue ? 24 : 26;
        int i2 = zHasValue ? 24 : 25;
        ColorStateList colorStateListM4995 = AbstractC3453.m4995(context2, typedArrayObtainStyledAttributes, i);
        setTrackInactiveTintList(colorStateListM4995 == null ? AbstractC2203.m4030(context2, R.color.material_slider_inactive_track_color) : colorStateListM4995);
        ColorStateList colorStateListM4996 = AbstractC3453.m4995(context2, typedArrayObtainStyledAttributes, i2);
        setTrackActiveTintList(colorStateListM4996 == null ? AbstractC2203.m4030(context2, R.color.material_slider_active_track_color) : colorStateListM4996);
        c1917.m3716(AbstractC3453.m4995(context2, typedArrayObtainStyledAttributes, 10));
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            setThumbStrokeColor(AbstractC3453.m4995(context2, typedArrayObtainStyledAttributes, 14));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(15, 0.0f));
        ColorStateList colorStateListM4997 = AbstractC3453.m4995(context2, typedArrayObtainStyledAttributes, 5);
        setHaloTintList(colorStateListM4997 == null ? AbstractC2203.m4030(context2, R.color.material_slider_halo_color) : colorStateListM4997);
        this.f1848 = typedArrayObtainStyledAttributes.getBoolean(23, true);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(18);
        int i3 = zHasValue2 ? 18 : 20;
        int i4 = zHasValue2 ? 18 : 19;
        ColorStateList colorStateListM4998 = AbstractC3453.m4995(context2, typedArrayObtainStyledAttributes, i3);
        setTickInactiveTintList(colorStateListM4998 == null ? AbstractC2203.m4030(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateListM4998);
        ColorStateList colorStateListM4999 = AbstractC3453.m4995(context2, typedArrayObtainStyledAttributes, i4);
        setTickActiveTintList(colorStateListM4999 == null ? AbstractC2203.m4030(context2, R.color.material_slider_active_tick_marks_color) : colorStateListM4999);
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
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(21, this.f1835 / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(22, this.f1835 / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(7, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        c1917.m3717();
        this.f1816 = ViewConfiguration.get(context2).getScaledTouchSlop();
        C0387 c0387 = new C0387(slider);
        this.f1806 = c0387;
        AbstractC3578.m5177(this, c0387);
        this.f1807 = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f1806.m2943(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1799.setColor(m1554(this.f1858));
        this.f1800.setColor(m1554(this.f1857));
        this.f1803.setColor(m1554(this.f1856));
        this.f1804.setColor(m1554(this.f1855));
        this.f1805.setColor(m1554(this.f1857));
        for (C3420 c3420 : this.f1810) {
            if (c3420.isStateful()) {
                c3420.setState(getDrawableState());
            }
        }
        C1917 c1917 = this.f1862;
        if (c1917.isStateful()) {
            c1917.setState(getDrawableState());
        }
        int iM1554 = m1554(this.f1854);
        Paint paint = this.f1802;
        paint.setColor(iM1554);
        paint.setAlpha(63);
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f1806.f4587;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public List<Float> getValues() {
        return new ArrayList(this.f1843);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f1867);
        for (C3420 c3420 : this.f1810) {
            ViewGroup viewGroupM3185 = AbstractC1459.m3185(this);
            if (viewGroupM3185 == null) {
                
            } else {
                
                int[] iArr = new int[2];
                viewGroupM3185.getLocationOnScreen(iArr);
                c3420.f10788 = iArr[0];
                viewGroupM3185.getWindowVisibleDisplayFrame(c3420.f10781);
                viewGroupM3185.addOnLayoutChangeListener(c3420.f10780);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        RunnableC0386 runnableC0386 = this.f1808;
        if (runnableC0386 != null) {
            removeCallbacks(runnableC0386);
        }
        this.f1813 = false;
        for (C3420 c3420 : this.f1810) {
            ViewGroup viewGroupM3185 = AbstractC1459.m3185(this);
            C1744 c1744 = viewGroupM3185 == null ? null : new C1744(viewGroupM3185);
            if (c1744 != null) {
                ((ViewOverlay) c1744.f5843).remove(c3420);
                ViewGroup viewGroupM3186 = AbstractC1459.m3185(this);
                if (viewGroupM3186 == null) {
                    
                } else {
                    viewGroupM3186.removeOnLayoutChangeListener(c3420.f10780);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f1867);
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
        AbstractC0389 abstractC0389 = this;
        Canvas canvas2 = canvas;
        if (abstractC0389.f1853) {
            abstractC0389.m1572();
            abstractC0389.m1558();
        }
        super.onDraw(canvas);
        int iM1548 = abstractC0389.m1548();
        int i3 = 0;
        float fFloatValue = ((Float) abstractC0389.f1843.get(0)).floatValue();
        ArrayList arrayList = abstractC0389.f1843;
        float fFloatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        float f3 = abstractC0389.f1842;
        RectF rectF = abstractC0389.f1860;
        if (fFloatValue2 < f3 || (abstractC0389.f1843.size() > 1 && fFloatValue > abstractC0389.f1841)) {
            int i4 = abstractC0389.f1851;
            float[] fArrM1553 = abstractC0389.m1553();
            int i5 = abstractC0389.f1828;
            float f4 = i4;
            float f5 = (fArrM1553[1] * f4) + i5;
            float f6 = i5 + i4;
            Paint paint = abstractC0389.f1799;
            if (f5 < f6) {
                int i6 = abstractC0389.f1832;
                if (i6 > 0) {
                    float f7 = f5 + i6;
                    float f8 = iM1548;
                    f = 2.0f;
                    float f9 = abstractC0389.f1827 / 2.0f;
                    rectF.set(f7, f8 - f9, i5 + i4 + f9, f9 + f8);
                    abstractC0389.m1570(canvas2, paint, rectF, 3);
                } else {
                    f = 2.0f;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f10 = iM1548;
                    canvas2.drawLine(f5, f10, abstractC0389.f1828 + i4, f10, paint);
                }
            } else {
                f = 2.0f;
            }
            int i7 = abstractC0389.f1828;
            float f11 = i7;
            float f12 = (fArrM1553[0] * f4) + f11;
            if (f12 > f11) {
                int i8 = abstractC0389.f1832;
                if (i8 > 0) {
                    float f13 = abstractC0389.f1827 / 2.0f;
                    float f14 = iM1548;
                    rectF.set(i7 - f13, f14 - f13, f12 - i8, f13 + f14);
                    abstractC0389.m1570(canvas2, paint, rectF, 2);
                } else {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f15 = iM1548;
                    canvas2.drawLine(abstractC0389.f1828, f15, f12, f15, paint);
                }
            }
        } else {
            i3 = 0;
            f = 2.0f;
        }
        if (fFloatValue2 > abstractC0389.f1841) {
            int i9 = abstractC0389.f1851;
            float[] fArrM1554 = abstractC0389.m1553();
            float f16 = abstractC0389.f1828;
            float f17 = i9;
            float fM1574 = (fArrM1554[1] * f17) + f16;
            float fM1575 = (fArrM1554[0] * f17) + f16;
            int i10 = abstractC0389.f1832;
            Paint paint2 = abstractC0389.f1800;
            if (i10 > 0) {
                int i11 = abstractC0389.f1843.size() == 1 ? abstractC0389.m1557() ? 3 : 2 : 4;
                for (int i12 = 0; i12 < abstractC0389.f1843.size(); i12++) {
                    if (abstractC0389.f1843.size() > 1) {
                        if (i12 > 0) {
                            fM1575 = abstractC0389.m1574(((Float) abstractC0389.f1843.get(i12 - 1)).floatValue());
                        }
                        fM1574 = abstractC0389.m1574(((Float) abstractC0389.f1843.get(i12)).floatValue());
                        if (abstractC0389.m1557()) {
                            fM1574 = fM1575;
                            fM1575 = fM1574;
                        }
                    }
                    int iM4759 = AbstractC2784.m4759(i11);
                    if (iM4759 != 1) {
                        if (iM4759 == 2) {
                            fM1575 += abstractC0389.f1832;
                            fM1574 = (abstractC0389.f1827 / 2.0f) + fM1574;
                        } else if (iM4759 == 3) {
                            f2 = abstractC0389.f1832;
                            fM1575 += f2;
                        }
                        if (fM1575 >= fM1574) {
                            float f18 = iM1548;
                            float f19 = abstractC0389.f1827 / 2.0f;
                            rectF.set(fM1575, f18 - f19, fM1574, f19 + f18);
                            abstractC0389.m1570(canvas2, paint2, rectF, i11);
                        }
                    } else {
                        fM1575 -= abstractC0389.f1827 / 2.0f;
                        f2 = abstractC0389.f1832;
                    }
                    fM1574 -= f2;
                    if (fM1575 >= fM1574) {
                        float f110 = iM1548;
                        float f111 = abstractC0389.f1827 / 2.0f;
                        rectF.set(fM1575, f110 - f111, fM1574, f111 + f110);
                        abstractC0389.m1570(canvas2, paint2, rectF, i11);
                    }
                }
            } else {
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeCap(Paint.Cap.ROUND);
                float f20 = iM1548;
                canvas2.drawLine(fM1575, f20, fM1574, f20, paint2);
            }
        }
        if (abstractC0389.f1848 && abstractC0389.f1846 > 0.0f) {
            float[] fArrM1555 = abstractC0389.m1553();
            int iCeil = (int) Math.ceil(((abstractC0389.f1847.length / 2.0f) - 1.0f) * fArrM1555[0]);
            int iFloor = (int) Math.floor(((abstractC0389.f1847.length / 2.0f) - 1.0f) * fArrM1555[1]);
            Paint paint3 = abstractC0389.f1803;
            if (iCeil > 0) {
                canvas2.drawPoints(abstractC0389.f1847, 0, iCeil * 2, paint3);
            }
            if (iCeil <= iFloor) {
                canvas2.drawPoints(abstractC0389.f1847, iCeil * 2, ((iFloor - iCeil) + 1) * 2, abstractC0389.f1804);
            }
            int i13 = (iFloor + 1) * 2;
            float[] fArr = abstractC0389.f1847;
            if (i13 < fArr.length) {
                canvas2.drawPoints(fArr, i13, fArr.length - i13, paint3);
            }
        }
        if (abstractC0389.f1835 <= 0) {
            i = 0;
        } else {
            int size = abstractC0389.f1843.size();
            Paint paint4 = abstractC0389.f1805;
            if (size >= 1) {
                ArrayList arrayList2 = abstractC0389.f1843;
                float fFloatValue3 = ((Float) arrayList2.get(arrayList2.size() - 1)).floatValue();
                float f21 = abstractC0389.f1842;
                if (fFloatValue3 < f21) {
                    canvas2.drawPoint(abstractC0389.m1574(f21), iM1548, paint4);
                }
            }
            if (abstractC0389.f1843.size() > 1) {
                i = 0;
                float fFloatValue4 = ((Float) abstractC0389.f1843.get(0)).floatValue();
                float f22 = abstractC0389.f1841;
                if (fFloatValue4 > f22) {
                    canvas2.drawPoint(abstractC0389.m1574(f22), iM1548, paint4);
                }
            } else {
                i = 0;
            }
        }
        if ((abstractC0389.f1840 || abstractC0389.isFocused()) && abstractC0389.isEnabled()) {
            int i14 = abstractC0389.f1851;
            if (!(abstractC0389.getBackground() instanceof RippleDrawable)) {
                int iM1561 = (int) ((abstractC0389.m1561(((Float) abstractC0389.f1843.get(abstractC0389.f1845)).floatValue()) * i14) + abstractC0389.f1828);
                if (Build.VERSION.SDK_INT < 28) {
                    int i15 = abstractC0389.f1831;
                    canvas2.clipRect(iM1561 - i15, iM1548 - i15, iM1561 + i15, i15 + iM1548, Region.Op.UNION);
                }
                canvas2.drawCircle(iM1561, iM1548, abstractC0389.f1831, abstractC0389.f1802);
            }
        }
        abstractC0389.m1569();
        int i16 = abstractC0389.f1851;
        while (i < abstractC0389.f1843.size()) {
            float fFloatValue5 = ((Float) abstractC0389.f1843.get(i)).floatValue();
            Drawable drawable = abstractC0389.f1863;
            if (drawable != null) {
                i2 = iM1548;
                abstractC0389.m1550(canvas2, i16, i2, fFloatValue5, drawable);
            } else {
                i2 = iM1548;
                if (i < abstractC0389.f1864.size()) {
                    abstractC0389.m1550(canvas, i16, i2, fFloatValue5, (Drawable) abstractC0389.f1864.get(i));
                } else {
                    if (!abstractC0389.isEnabled()) {
                        canvas.drawCircle((abstractC0389.m1561(fFloatValue5) * i16) + abstractC0389.f1828, i2, abstractC0389.getThumbRadius(), abstractC0389.f1801);
                    }
                    abstractC0389.m1550(canvas, i16, i2, fFloatValue5, abstractC0389.f1862);
                }
            }
            i++;
            abstractC0389 = this;
            canvas2 = canvas;
            iM1548 = i2;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C0387 c0387 = this.f1806;
        if (!z) {
            this.f1844 = -1;
            c0387.m2940(this.f1845);
            return;
        }
        if (i == 1) {
            m1559(2147483647);
        } else if (i == 2) {
            m1559(-2147483648);
        } else if (i == 17) {
            m1560(2147483647);
        } else if (i == 66) {
            m1560(-2147483648);
        }
        c0387.m2947(this.f1845);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f1843.size() == 1) {
            this.f1844 = 0;
        }
        Float fValueOf = null;
        Boolean boolValueOf = null;
        if (this.f1844 == -1) {
            if (i != 61) {
                if (i == 66) {
                    this.f1844 = this.f1845;
                    postInvalidate();
                    boolValueOf = Boolean.TRUE;
                } else if (i == 81) {
                    m1559(1);
                    boolValueOf = Boolean.TRUE;
                } else if (i == 69) {
                    m1559(-1);
                    boolValueOf = Boolean.TRUE;
                } else if (i != 70) {
                    switch (i) {
                        case 21 /* 21 */:
                            m1560(-1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 22 /* 22 */:
                            m1560(1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 23 /* 23 */:
                            this.f1844 = this.f1845;
                            postInvalidate();
                            boolValueOf = Boolean.TRUE;
                            break;
                    }
                } else {
                    m1559(1);
                    boolValueOf = Boolean.TRUE;
                }
            } else if (keyEvent.hasNoModifiers()) {
                boolValueOf = Boolean.valueOf(m1559(1));
            } else {
                boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(m1559(-1)) : Boolean.FALSE;
            }
            return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        boolean zIsLongPress = this.f1852 | keyEvent.isLongPress();
        this.f1852 = zIsLongPress;
        float fRound = 1.0f;
        if (zIsLongPress) {
            float f = this.f1846;
            fRound = f != 0.0f ? f : 1.0f;
            float f2 = (this.f1842 - this.f1841) / fRound;
            float f3 = 20;
            if (f2 > 20.0f) {
                fRound *= Math.round(f2 / 20.0f);
            }
        } else {
            float f4 = this.f1846;
            if (f4 != 0.0f) {
                fRound = f4;
            }
        }
        if (i == 21) {
            if (!m1557()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i == 22) {
            if (m1557()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i == 69) {
            fValueOf = Float.valueOf(-fRound);
        } else if (i == 70 || i == 81) {
            fValueOf = Float.valueOf(fRound);
        }
        if (fValueOf != null) {
            if (m1565(this.f1844, fValueOf.floatValue() + ((Float) this.f1843.get(this.f1844)).floatValue())) {
                m1568();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m1559(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m1559(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.f1844 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f1852 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f1825;
        int i4 = this.f1826;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + ((i4 == 1 || i4 == 3) ? ((C3420) this.f1810.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C0388 c0388 = (C0388) parcelable;
        super.onRestoreInstanceState(c0388.getSuperState());
        this.f1841 = c0388.f1794;
        this.f1842 = c0388.f1795;
        m1564(c0388.f1796);
        this.f1846 = c0388.f1797;
        if (c0388.f1798) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0388 c0388 = new C0388(super.onSaveInstanceState());
        c0388.f1794 = this.f1841;
        c0388.f1795 = this.f1842;
        c0388.f1796 = new ArrayList(this.f1843);
        c0388.f1797 = this.f1846;
        c0388.f1798 = hasFocus();
        return c0388;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f1851 = Math.max(i - (this.f1828 * 2), 0);
        m1558();
        m1568();
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
            float f2 = (x - this.f1828) / this.f1851;
            this.f1865 = f2;
            float fMax = Math.max(0.0f, f2);
            this.f1865 = fMax;
            this.f1865 = Math.min(1.0f, fMax);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                int i2 = this.f1816;
                if (actionMasked == 1) {
                    this.f1840 = false;
                    motionEvent2 = this.f1839;
                    if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                        f = i2;
                        if (Math.abs(this.f1839.getX() - motionEvent.getX()) <= f && Math.abs(this.f1839.getY() - motionEvent.getY()) <= f) {
                            slider = (Slider) this;
                            if (slider.getActiveThumbIndex() == -1) {
                                slider.setActiveThumbIndex(0);
                            }
                            m1562();
                        }
                    }
                    if (this.f1844 != -1) {
                        m1566();
                        m1568();
                        if (this.f1832 > 0 && (i = this.f1833) != -1 && this.f1834 != -1) {
                            setThumbWidth(i);
                            setThumbTrackGapSize(this.f1834);
                        }
                        this.f1844 = -1;
                        it = this.f1812.iterator();
                        if (it.hasNext()) {
                            throw AbstractC1194.m2777(it);
                        }
                    }
                    invalidate();
                } else if (actionMasked == 2) {
                    if (!this.f1840) {
                        if (!m1556(motionEvent) || Math.abs(x - this.f1838) >= i2) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            m1562();
                        }
                    }
                    Slider slider2 = (Slider) this;
                    if (slider2.getActiveThumbIndex() == -1) {
                        slider2.setActiveThumbIndex(0);
                    }
                    this.f1840 = true;
                    m1566();
                    m1568();
                    invalidate();
                } else if (actionMasked == 3) {
                    this.f1840 = false;
                    motionEvent2 = this.f1839;
                    if (motionEvent2 != null) {
                        f = i2;
                        if (Math.abs(this.f1839.getX() - motionEvent.getX()) <= f) {
                            slider = (Slider) this;
                            if (slider.getActiveThumbIndex() == -1) {
                                slider.setActiveThumbIndex(0);
                            }
                            m1562();
                        }
                    }
                    if (this.f1844 != -1) {
                        m1566();
                        m1568();
                        if (this.f1832 > 0) {
                            setThumbWidth(i);
                            setThumbTrackGapSize(this.f1834);
                        }
                        this.f1844 = -1;
                        it = this.f1812.iterator();
                        if (it.hasNext()) {
                            throw AbstractC1194.m2777(it);
                        }
                    }
                    invalidate();
                }
            } else {
                this.f1838 = x;
                if (!m1556(motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    Slider slider3 = (Slider) this;
                    if (slider3.getActiveThumbIndex() == -1) {
                        slider3.setActiveThumbIndex(0);
                    }
                    requestFocus();
                    this.f1840 = true;
                    m1566();
                    m1568();
                    int i3 = this.f1832;
                    if (i3 > 0) {
                        int i4 = this.f1829;
                        this.f1833 = i4;
                        this.f1834 = i3;
                        int iRound = Math.round(i4 * 0.5f);
                        int i5 = this.f1829 - iRound;
                        setThumbWidth(iRound);
                        setThumbTrackGapSize(this.f1832 - (i5 / 2));
                    }
                    invalidate();
                    m1562();
                }
            }
            setPressed(this.f1840);
            this.f1839 = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup viewGroupM3185 = AbstractC1459.m3185(this);
            C1744 c1744 = viewGroupM3185 == null ? null : new C1744(viewGroupM3185);
            if (c1744 == null) {
                return;
            }
            Iterator it = this.f1810.iterator();
            while (it.hasNext()) {
                ((ViewOverlay) c1744.f5843).remove((C3420) it.next());
            }
        }
    }

    public void setActiveThumbIndex(int i) {
        this.f1844 = i;
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
        this.f1866 = i;
        this.f1853 = true;
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
        m1564(arrayList);
    }

    public final void m1547(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f1829, this.f1830);
        } else {
            float fMax = Math.max(this.f1829, this.f1830) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final int m1548() {
        int i = this.f1825 / 2;
        int i2 = this.f1826;
        return i + ((i2 == 1 || i2 == 3) ? ((C3420) this.f1810.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator m1549(boolean z) {
        int iM3308;
        TimeInterpolator timeInterpolatorM3309;
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.f1815 : this.f1814;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        int i = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        if (z) {
            iM3308 = AbstractC1574.m3308(getContext(), R.attr.motionDurationMedium4, 83);
            timeInterpolatorM3309 = AbstractC1574.m3309(getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0164.f1189);
        } else {
            iM3308 = AbstractC1574.m3308(getContext(), R.attr.motionDurationShort3, 117);
            timeInterpolatorM3309 = AbstractC1574.m3309(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, AbstractC0164.f1187);
        }
        valueAnimatorOfFloat.setDuration(iM3308);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorM3309);
        valueAnimatorOfFloat.addUpdateListener(new C0385(0, this));
        return valueAnimatorOfFloat;
    }

    public final void m1550(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((this.f1828 + ((int) (m1561(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void m1551() {
        if (!this.f1813) {
            this.f1813 = true;
            ValueAnimator valueAnimatorM1549 = m1549(true);
            this.f1814 = valueAnimatorM1549;
            this.f1815 = null;
            valueAnimatorM1549.start();
        }
        ArrayList arrayList = this.f1810;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.f1843.size() && it.hasNext(); i++) {
            if (i != this.f1845) {
                m1563((C3420) it.next(), ((Float) this.f1843.get(i)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f1843.size())));
        }
        m1563((C3420) it.next(), ((Float) this.f1843.get(this.f1845)).floatValue());
    }

    public final void m1552() {
        if (this.f1813) {
            this.f1813 = false;
            ValueAnimator valueAnimatorM1549 = m1549(false);
            this.f1815 = valueAnimatorM1549;
            this.f1814 = null;
            valueAnimatorM1549.addListener(new C0123(2, this));
            this.f1815.start();
        }
    }

    public final float[] m1553() {
        float fFloatValue = ((Float) this.f1843.get(0)).floatValue();
        ArrayList arrayList = this.f1843;
        float fFloatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.f1843.size() == 1) {
            fFloatValue = this.f1841;
        }
        float fM1561 = m1561(fFloatValue);
        float fM1562 = m1561(fFloatValue2);
        return m1557() ? new float[]{fM1562, fM1561} : new float[]{fM1561, fM1562};
    }

    public final int m1554(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean m1555(double d) {
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.f1846)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean m1556(MotionEvent motionEvent) {
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

    public final boolean m1557() {
        Field field = AbstractC3578.f11184;
        return getLayoutDirection() == 1;
    }

    public final void m1558() {
        if (this.f1846 <= 0.0f) {
            return;
        }
        m1572();
        int iMin = Math.min((int) (((this.f1842 - this.f1841) / this.f1846) + 1.0f), (this.f1851 / this.f1822) + 1);
        float[] fArr = this.f1847;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f1847 = new float[iMin * 2];
        }
        float f = this.f1851 / (iMin - 1);
        for (int i = 0; i < iMin * 2; i += 2) {
            float[] fArr2 = this.f1847;
            fArr2[i] = ((i / 2.0f) * f) + this.f1828;
            fArr2[i + 1] = m1548();
        }
    }

    public final boolean m1559(int i) {
        int i2 = this.f1845;
        long j = ((long) i2) + ((long) i);
        long size = this.f1843.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.f1845 = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.f1844 != -1) {
            this.f1844 = i3;
        }
        m1568();
        postInvalidate();
        return true;
    }

    public final void m1560(int i) {
        if (m1557()) {
            i = i == -2147483648 ? 2147483647 : -i;
        }
        m1559(i);
    }

    public final float m1561(float f) {
        float f2 = this.f1841;
        float f3 = (f - f2) / (this.f1842 - f2);
        return m1557() ? 1.0f - f3 : f3;
    }

    public final void m1562() {
        Iterator it = this.f1812.iterator();
        if (it.hasNext()) {
            throw AbstractC1194.m2777(it);
        }
    }

    public final void m1563(C3420 c3420, float f) {
        String str = String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
        if (!TextUtils.equals(c3420.f10776, str)) {
            c3420.f10776 = str;
            c3420.f10779.f9353 = true;
            c3420.invalidateSelf();
        }
        int iM1561 = (this.f1828 + ((int) (m1561(f) * this.f1851))) - (c3420.getIntrinsicWidth() / 2);
        int iM1548 = m1548() - ((this.f1830 / 2) + this.f1837);
        c3420.setBounds(iM1561, iM1548 - c3420.getIntrinsicHeight(), c3420.getIntrinsicWidth() + iM1561, iM1548);
        Rect rect = new Rect(c3420.getBounds());
        AbstractC1015.m2590(AbstractC1459.m3185(this), this, rect);
        c3420.setBounds(rect);
        ViewGroup viewGroupM3185 = AbstractC1459.m3185(this);
        ((ViewOverlay) (viewGroupM3185 == null ? null : new C1744(viewGroupM3185)).f5843).add(c3420);
    }

    public final void m1564(ArrayList arrayList) {
        ViewGroup viewGroupM3185;
        int resourceId;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f1843.size() == arrayList.size() && this.f1843.equals(arrayList)) {
            return;
        }
        this.f1843 = arrayList;
        this.f1853 = true;
        this.f1845 = 0;
        m1568();
        ArrayList<C3420> arrayList2 = this.f1810;
        if (arrayList2.size() > this.f1843.size()) {
            List<C3420> listSubList = arrayList2.subList(this.f1843.size(), arrayList2.size());
            for (C3420 c3420 : listSubList) {
                Field field = AbstractC3578.f11184;
                if (isAttachedToWindow()) {
                    ViewGroup viewGroupM3186 = AbstractC1459.m3185(this);
                    C1744 c1744 = viewGroupM3186 == null ? null : new C1744(viewGroupM3186);
                    if (c1744 != null) {
                        ((ViewOverlay) c1744.f5843).remove(c3420);
                        ViewGroup viewGroupM3187 = AbstractC1459.m3185(this);
                        if (viewGroupM3187 == null) {
                            
                        } else {
                            viewGroupM3187.removeOnLayoutChangeListener(c3420.f10780);
                        }
                    }
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f1843.size()) {
            Context context = getContext();
            int i = this.f1809;
            C3420 c3421 = new C3420(context, i);
            TypedArray typedArrayM5082 = AbstractC3471.m5082(c3421.f10777, null, AbstractC2467.f7873, 0, i, new int[0]);
            Context context2 = c3421.f10777;
            c3421.f10787 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z = typedArrayM5082.getBoolean(8, true);
            c3421.f10786 = z;
            if (z) {
                C2021 c2021M4691 = c3421.f6332.f6314.m4691();
                c2021M4691.f6772 = c3421.m4937();
                c3421.setShapeAppearanceModel(c2021M4691.m3876());
            } else {
                c3421.f10787 = 0;
            }
            CharSequence text = typedArrayM5082.getText(6);
            boolean zEquals = TextUtils.equals(c3421.f10776, text);
            C2907 c2907 = c3421.f10779;
            if (!zEquals) {
                c3421.f10776 = text;
                c2907.f9353 = true;
                c3421.invalidateSelf();
            }
            C2904 c2904 = (!typedArrayM5082.hasValue(0) || (resourceId = typedArrayM5082.getResourceId(0, 0)) == 0) ? null : new C2904(context2, resourceId);
            if (c2904 != null && typedArrayM5082.hasValue(1)) {
                c2904.f9340 = AbstractC3453.m4995(context2, typedArrayM5082, 1);
            }
            c2907.m4915(c2904, context2);
            TypedValue typedValueM4111 = AbstractC2207.m4111(context2, R.attr.colorOnBackground, C3420.class.getCanonicalName());
            int i2 = typedValueM4111.resourceId;
            int color = i2 != 0 ? context2.getColor(i2) : typedValueM4111.data;
            TypedValue typedValueM4112 = AbstractC2207.m4111(context2, 16842801, C3420.class.getCanonicalName());
            int i3 = typedValueM4112.resourceId;
            c3421.m3716(ColorStateList.valueOf(typedArrayM5082.getColor(7, AbstractC0752.m2224(AbstractC0752.m2226(color, 153), AbstractC0752.m2226(i3 != 0 ? context2.getColor(i3) : typedValueM4112.data, 229)))));
            TypedValue typedValueM4113 = AbstractC2207.m4111(context2, R.attr.colorSurface, C3420.class.getCanonicalName());
            int i4 = typedValueM4113.resourceId;
            c3421.m3718(ColorStateList.valueOf(i4 != 0 ? context2.getColor(i4) : typedValueM4113.data));
            c3421.f10782 = typedArrayM5082.getDimensionPixelSize(2, 0);
            c3421.f10783 = typedArrayM5082.getDimensionPixelSize(4, 0);
            c3421.f10784 = typedArrayM5082.getDimensionPixelSize(5, 0);
            c3421.f10785 = typedArrayM5082.getDimensionPixelSize(3, 0);
            typedArrayM5082.recycle();
            arrayList2.add(c3421);
            Field field2 = AbstractC3578.f11184;
            if (isAttachedToWindow() && (viewGroupM3185 = AbstractC1459.m3185(this)) != null) {
                int[] iArr = new int[2];
                viewGroupM3185.getLocationOnScreen(iArr);
                c3421.f10788 = iArr[0];
                viewGroupM3185.getWindowVisibleDisplayFrame(c3421.f10781);
                viewGroupM3185.addOnLayoutChangeListener(c3421.f10780);
            }
        }
        int i5 = arrayList2.size() == 1 ? 0 : 1;
        for (C3420 c3422 : arrayList2) {
            c3422.f6332.f6323 = i5;
            c3422.invalidateSelf();
        }
        Iterator it = this.f1811.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Iterator it2 = this.f1843.iterator();
            if (it2.hasNext()) {
                
                throw null;
            }
        }
        postInvalidate();
    }

    public final boolean m1565(int i, float f) {
        this.f1845 = i;
        if (Math.abs(f - ((Float) this.f1843.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f1866 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = (minSeparation - this.f1828) / this.f1851;
                float f3 = this.f1841;
                minSeparation = ((f3 - this.f1842) * f2) + f3;
            }
        }
        if (m1557()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        float fFloatValue = i2 >= this.f1843.size() ? this.f1842 : ((Float) this.f1843.get(i2)).floatValue() - minSeparation;
        int i3 = i - 1;
        float fFloatValue2 = i3 < 0 ? this.f1841 : minSeparation + ((Float) this.f1843.get(i3)).floatValue();
        if (f < fFloatValue2) {
            f = fFloatValue2;
        } else if (f > fFloatValue) {
            f = fFloatValue;
        }
        this.f1843.set(i, Float.valueOf(f));
        Iterator it = this.f1811.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            
            throw null;
        }
        AccessibilityManager accessibilityManager = this.f1807;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.f1808;
            if (runnable == null) {
                this.f1808 = new RunnableC0386(this);
            } else {
                removeCallbacks(runnable);
            }
            RunnableC0386 runnableC0386 = this.f1808;
            runnableC0386.f1790 = i;
            postDelayed(runnableC0386, 200L);
        }
        return true;
    }

    public final void m1566() {
        double dRound;
        float f = this.f1865;
        float f2 = this.f1846;
        if (f2 > 0.0f) {
            int i = (int) ((this.f1842 - this.f1841) / f2);
            dRound = ((double) Math.round(f * i)) / ((double) i);
        } else {
            dRound = f;
        }
        if (m1557()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.f1842;
        float f4 = this.f1841;
        m1565(this.f1844, (float) ((dRound * ((double) (f3 - f4))) + ((double) f4)));
    }

    public final void m1567(int i, Rect rect) {
        int iM1561 = this.f1828 + ((int) (m1561(getValues().get(i).floatValue()) * this.f1851));
        int iM1548 = m1548();
        int iMax = Math.max(this.f1829 / 2, this.f1823 / 2);
        int iMax2 = Math.max(this.f1830 / 2, this.f1823 / 2);
        rect.set(iM1561 - iMax, iM1548 - iMax2, iM1561 + iMax, iM1548 + iMax2);
    }

    public final void m1568() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iM1561 = (int) ((m1561(((Float) this.f1843.get(this.f1845)).floatValue()) * this.f1851) + this.f1828);
            int iM1548 = m1548();
            int i = this.f1831;
            background.setHotspotBounds(iM1561 - i, iM1548 - i, iM1561 + i, iM1548 + i);
        }
    }

    public final void m1569() {
        int i = this.f1826;
        if (i == 0 || i == 1) {
            if (this.f1844 == -1 || !isEnabled()) {
                m1552();
                return;
            } else {
                m1551();
                return;
            }
        }
        if (i == 2) {
            m1552();
            return;
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.f1826);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            AbstractC1459.m3185(this).getHitRect(rect);
            if (getLocalVisibleRect(rect)) {
                m1551();
                return;
            }
        }
        m1552();
    }

    public final void m1570(Canvas canvas, Paint paint, RectF rectF, int i) {
        float f;
        float f2 = this.f1827 / 2.0f;
        int iM4759 = AbstractC2784.m4759(i);
        if (iM4759 == 1) {
            f = this.f1836;
        } else if (iM4759 != 2) {
            if (iM4759 == 3) {
                f2 = this.f1836;
            }
            f = f2;
        } else {
            f = f2;
            f2 = this.f1836;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        Path path = this.f1859;
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
        int iM47510 = AbstractC2784.m4759(i);
        RectF rectF2 = this.f1861;
        if (iM47510 == 1) {
            float f3 = rectF.left;
            rectF2.set(f3, rectF.top, (2.0f * fMax) + f3, rectF.bottom);
        } else if (iM47510 != 2) {
            rectF2.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            float f4 = rectF.right;
            rectF2.set(f4 - (2.0f * fMax), rectF.top, f4, rectF.bottom);
        }
        canvas.drawRoundRect(rectF2, fMax, fMax, paint);
        canvas.restore();
    }

    public final void m1571() {
        boolean z;
        int iMax = Math.max(this.f1824, Math.max(this.f1827 + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.f1830));
        boolean z2 = true;
        if (iMax == this.f1825) {
            z = false;
        } else {
            this.f1825 = iMax;
            z = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.f1829 / 2) - this.f1818, 0), Math.max((this.f1827 - this.f1819) / 2, 0)), Math.max(Math.max(this.f1849 - this.f1820, 0), Math.max(this.f1850 - this.f1821, 0))) + this.f1817;
        if (this.f1828 == iMax2) {
            z2 = false;
        } else {
            this.f1828 = iMax2;
            Field field = AbstractC3578.f11184;
            if (isLaidOut()) {
                this.f1851 = Math.max(getWidth() - (this.f1828 * 2), 0);
                m1558();
            }
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    public final void m1572() {
        if (this.f1853) {
            float f = this.f1841;
            float f2 = this.f1842;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + this.f1841 + ") must be smaller than valueTo(" + this.f1842 + ")");
            }
            if (f2 <= f) {
                throw new IllegalStateException("valueTo(" + this.f1842 + ") must be greater than valueFrom(" + this.f1841 + ")");
            }
            if (this.f1846 > 0.0f && !m1573(f2)) {
                throw new IllegalStateException("The stepSize(" + this.f1846 + ") must be 0, or a factor of the valueFrom(" + this.f1841 + ")-valueTo(" + this.f1842 + ") range");
            }
            for (Float f3 : this.f1843) {
                if (f3.floatValue() < this.f1841 || f3.floatValue() > this.f1842) {
                    throw new IllegalStateException("Slider value(" + f3 + ") must be greater or equal to valueFrom(" + this.f1841 + "), and lower or equal to valueTo(" + this.f1842 + ")");
                }
                if (this.f1846 > 0.0f && !m1573(f3.floatValue())) {
                    float f4 = this.f1841;
                    float f5 = this.f1846;
                    throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + f4 + ") plus a multiple of stepSize(" + f5 + ") when using stepSize(" + f5 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f6 = this.f1846;
            if (f6 > 0.0f && minSeparation > 0.0f) {
                if (this.f1866 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.f1846 + ")");
                }
                if (minSeparation < f6 || !m1555(minSeparation)) {
                    float f7 = this.f1846;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                }
            }
            float f8 = this.f1846;
            if (f8 != 0.0f) {
                if (((int) f8) != f8) {
                    Log.w("ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤞᤝᲁᲇ", "Floating point value used for stepSize(" + f8 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f9 = this.f1841;
                if (((int) f9) != f9) {
                    Log.w("ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤞᤝᲁᲇ", "Floating point value used for valueFrom(" + f9 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f10 = this.f1842;
                if (((int) f10) != f10) {
                    Log.w("ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤞᤝᲁᲇ", "Floating point value used for valueTo(" + f10 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.f1853 = false;
        }
    }

    public final boolean m1573(float f) {
        return m1555(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.f1841)), MathContext.DECIMAL64).doubleValue());
    }

    public final float m1574(float f) {
        return (m1561(f) * this.f1851) + this.f1828;
    }

    public void setValues(List<Float> list) {
        m1564(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f1863 = null;
        this.f1864 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f1864;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            m1547(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
