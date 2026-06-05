package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.hd.wauxv.R;
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC0800feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.C2962feyxiexzfUjhhgtg;
import p000.C3649Ujhhgtgfeyxiexzf;
import p000.C3650Ujhhgtgfeyxiexzf;
import p000.C3654Ujhhgtgfeyxiexzf;
import p000.InterfaceC2836feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends AbstractC0800feyxiexzfUjhhgtg implements InterfaceC2836feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final ClockHandView f945Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Rect f946Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final RectF f947feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Rect f948feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final SparseArray f949feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0040Ujhhgtgfeyxiexzf f950feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int[] f951feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final float[] f952feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public final int f953feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final int f954feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final int f955feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int f956feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final String[] f957feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public float f958feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final ColorStateList f959feyxiexzfUjhhgtg;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f946Ujhhgtgfeyxiexzf = new Rect();
        this.f947feyxiexzfUjhhgtg = new RectF();
        this.f948feyxiexzfUjhhgtg = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f949feyxiexzfUjhhgtg = sparseArray;
        this.f952feyxiexzfUjhhgtg = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3123Ujhhgtgfeyxiexzf, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context, typedArrayObtainStyledAttributes, 1);
        this.f959feyxiexzfUjhhgtg = colorStateListM4561Ujhhgtgfeyxiexzf;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f945Ujhhgtgfeyxiexzf = clockHandView;
        this.f953feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM4561Ujhhgtgfeyxiexzf.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM4561Ujhhgtgfeyxiexzf.getDefaultColor());
        this.f951feyxiexzfUjhhgtg = new int[]{colorForState, colorForState, colorStateListM4561Ujhhgtgfeyxiexzf.getDefaultColor()};
        clockHandView.f962Ujhhgtgfeyxiexzf.add(this);
        int defaultColor = AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf2 = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM4561Ujhhgtgfeyxiexzf2 != null ? colorStateListM4561Ujhhgtgfeyxiexzf2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0039Ujhhgtgfeyxiexzf(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f950feyxiexzfUjhhgtg = new C0040Ujhhgtgfeyxiexzf(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f957feyxiexzfUjhhgtg = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.f957feyxiexzfUjhhgtg.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f957feyxiexzfUjhhgtg.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f957feyxiexzfUjhhgtg[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(textView, this.f950feyxiexzfUjhhgtg);
                textView.setTextColor(this.f959feyxiexzfUjhhgtg);
            }
        }
        ClockHandView clockHandView2 = this.f945Ujhhgtgfeyxiexzf;
        if (clockHandView2.f961Ujhhgtgfeyxiexzf && !z) {
            clockHandView2.f972Ujhhgtgfeyxiexzf = 1;
        }
        clockHandView2.f961Ujhhgtgfeyxiexzf = z;
        clockHandView2.invalidate();
        this.f954feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f955feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f956feyxiexzfUjhhgtg = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C2962feyxiexzfUjhhgtg.m4428Ujhhgtgfeyxiexzf(1, this.f957feyxiexzfUjhhgtg.length, 1).f9271Ujhhgtgfeyxiexzf);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m862Ujhhgtgfeyxiexzf();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f956feyxiexzfUjhhgtg / Math.max(Math.max(this.f954feyxiexzfUjhhgtg / displayMetrics.heightPixels, this.f955feyxiexzfUjhhgtg / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // p000.AbstractC0800feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void mo861Ujhhgtgfeyxiexzf() {
        C3654Ujhhgtgfeyxiexzf c3654Ujhhgtgfeyxiexzf = new C3654Ujhhgtgfeyxiexzf();
        c3654Ujhhgtgfeyxiexzf.m5317Ujhhgtgfeyxiexzf(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f3156Ujhhgtgfeyxiexzf * 0.66f) : this.f3156Ujhhgtgfeyxiexzf;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = c3654Ujhhgtgfeyxiexzf.f11569Ujhhgtgfeyxiexzf;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new C3649Ujhhgtgfeyxiexzf());
                }
                C3650Ujhhgtgfeyxiexzf c3650Ujhhgtgfeyxiexzf = ((C3649Ujhhgtgfeyxiexzf) map2.get(Integer.valueOf(id))).f11478Ujhhgtgfeyxiexzf;
                c3650Ujhhgtgfeyxiexzf.f11504Ujhhgtgfeyxiexzf = R.id.circle_center;
                c3650Ujhhgtgfeyxiexzf.f11505Ujhhgtgfeyxiexzf = iRound;
                c3650Ujhhgtgfeyxiexzf.f11506feyxiexzfUjhhgtg = size;
                size += 360.0f / list.size();
            }
        }
        c3654Ujhhgtgfeyxiexzf.m5316Ujhhgtgfeyxiexzf(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f949feyxiexzfUjhhgtg;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m862Ujhhgtgfeyxiexzf() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f945Ujhhgtgfeyxiexzf.f966Ujhhgtgfeyxiexzf;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f949feyxiexzfUjhhgtg;
            int size = sparseArray.size();
            rect = this.f946Ujhhgtgfeyxiexzf;
            rectF = this.f947feyxiexzfUjhhgtg;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f948feyxiexzfUjhhgtg;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f951feyxiexzfUjhhgtg, this.f952feyxiexzfUjhhgtg, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }
}
