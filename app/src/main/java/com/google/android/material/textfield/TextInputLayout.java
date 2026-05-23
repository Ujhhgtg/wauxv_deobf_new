package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.internal.CheckableImageButton;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import p000.AbstractC0164;
import p000.AbstractC0752;
import p000.AbstractC1015;
import p000.AbstractC1105;
import p000.AbstractC1459;
import p000.AbstractC1574;
import p000.AbstractC2203;
import p000.AbstractC2207;
import p000.AbstractC2209;
import p000.AbstractC2467;
import p000.AbstractC2665;
import p000.AbstractC2784;
import p000.AbstractC2905;
import p000.AbstractC3440;
import p000.AbstractC3453;
import p000.AbstractC3471;
import p000.AbstractC3573;
import p000.AbstractC3578;
import p000.C0053;
import p000.C0094;
import p000.C0216;
import p000.C0236;
import p000.C0243;
import p000.C0385;
import p000.C0418;
import p000.C0452;
import p000.C0556;
import p000.C0738;
import p000.C0948;
import p000.C0949;
import p000.C1118;
import p000.C1133;
import p000.C1211;
import p000.C1212;
import p000.C1264;
import p000.C1632;
import p000.C1633;
import p000.C1916;
import p000.C1917;
import p000.C2021;
import p000.C2373;
import p000.C2605;
import p000.C2677;
import p000.C2810;
import p000.C2904;
import p000.C2908;
import p000.C2909;
import p000.C2911;
import p000.InterfaceC0874;
import p000.InterfaceC2910;
import p000.RunnableC0141;
import p000.RunnableC0563;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᲁᤞᲈ, reason: contains not printable characters */
    public static final int[][] f785 = {new int[]{16842919}, new int[0]};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final FrameLayout f786;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2810 f787;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1212 f788;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public EditText f789;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public CharSequence f790;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f791;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f792;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f793;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f794;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C1633 f795;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f796;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f797;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean f798;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public InterfaceC2910 f799;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public C0236 f800;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f801;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public int f802;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public CharSequence f803;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public boolean f804;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public C0236 f805;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public ColorStateList f806;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public int f807;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public C1264 f808;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public C1264 f809;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public ColorStateList f810;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public ColorStateList f811;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public ColorStateList f812;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public ColorStateList f813;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public boolean f814;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public CharSequence f815;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public boolean f816;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public C1917 f817;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public C1917 f818;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public StateListDrawable f819;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public boolean f820;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public C1917 f821;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public C1917 f822;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public C2677 f823;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public boolean f824;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public final int f825;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public int f826;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public int f827;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public int f828;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public int f829;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public int f830;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public int f831;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public int f832;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public final Rect f833;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public final Rect f834;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public final RectF f835;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public Typeface f836;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public ColorDrawable f837;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public int f838;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public final LinkedHashSet f839;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public ColorDrawable f840;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
    public int f841;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ, reason: contains not printable characters */
    public Drawable f842;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
    public ColorStateList f843;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ, reason: contains not printable characters */
    public ColorStateList f844;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public int f845;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public int f846;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public int f847;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public ColorStateList f848;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public int f849;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public int f850;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᤞᲇ, reason: contains not printable characters */
    public int f851;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ, reason: contains not printable characters */
    public int f852;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᤞᲀ, reason: contains not printable characters */
    public int f853;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᲀᤞ, reason: contains not printable characters */
    public int f854;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲁᲈ, reason: contains not printable characters */
    public boolean f855;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ, reason: contains not printable characters */
    public final C0738 f856;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲀᲈ, reason: contains not printable characters */
    public boolean f857;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲈᲀ, reason: contains not printable characters */
    public boolean f858;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲀᲁ, reason: contains not printable characters */
    public ValueAnimator f859;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲁᲀ, reason: contains not printable characters */
    public boolean f860;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲁᲈ, reason: contains not printable characters */
    public boolean f861;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲈᲁ, reason: contains not printable characters */
    public boolean f862;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC2665.m4673(context, attributeSet, me.hd.wauxv.R.attr.textInputStyle, me.hd.wauxv.R.style.Widget_Design_TextInputLayout), attributeSet, me.hd.wauxv.R.attr.textInputStyle);
        this.f791 = -1;
        this.f792 = -1;
        this.f793 = -1;
        this.f794 = -1;
        this.f795 = new C1633(this);
        this.f799 = new C2373(23);
        this.f833 = new Rect();
        this.f834 = new Rect();
        this.f835 = new RectF();
        this.f839 = new LinkedHashSet();
        C0738 c0738 = new C0738(this);
        this.f856 = c0738;
        this.f862 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f786 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0164.f1185;
        c0738.f2815 = linearInterpolator;
        c0738.m2165(false);
        c0738.f2814 = linearInterpolator;
        c0738.m2165(false);
        if (c0738.f2779 != 8388659) {
            c0738.f2779 = 8388659;
            c0738.m2165(false);
        }
        C0243 c0243M5083 = AbstractC3471.m5083(context2, attributeSet, AbstractC2467.f7871, me.hd.wauxv.R.attr.textInputStyle, me.hd.wauxv.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        C2810 c2810 = new C2810(this, c0243M5083);
        this.f787 = c2810;
        TypedArray typedArray = (TypedArray) c0243M5083.f1404;
        this.f814 = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f858 = typedArray.getBoolean(47, true);
        this.f857 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f823 = C2677.m4688(context2, attributeSet, me.hd.wauxv.R.attr.textInputStyle, me.hd.wauxv.R.style.Widget_Design_TextInputLayout).m3876();
        this.f825 = context2.getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f827 = typedArray.getDimensionPixelOffset(9, 0);
        this.f829 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f830 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f828 = this.f829;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        C2021 c2021M4691 = this.f823.m4691();
        if (dimension >= 0.0f) {
            c2021M4691.f6766 = new C0053(dimension);
        }
        if (dimension2 >= 0.0f) {
            c2021M4691.f6767 = new C0053(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c2021M4691.f6768 = new C0053(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c2021M4691.f6769 = new C0053(dimension4);
        }
        this.f823 = c2021M4691.m3876();
        ColorStateList colorStateListM4994 = AbstractC3453.m4994(context2, c0243M5083, 7);
        if (colorStateListM4994 != null) {
            int defaultColor = colorStateListM4994.getDefaultColor();
            this.f849 = defaultColor;
            this.f832 = defaultColor;
            if (colorStateListM4994.isStateful()) {
                this.f850 = colorStateListM4994.getColorForState(new int[]{-16842910}, -1);
                this.f851 = colorStateListM4994.getColorForState(new int[]{16842908, 16842910}, -1);
                this.f852 = colorStateListM4994.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f851 = this.f849;
                ColorStateList colorStateListM4030 = AbstractC2203.m4030(context2, me.hd.wauxv.R.color.mtrl_filled_background_color);
                this.f850 = colorStateListM4030.getColorForState(new int[]{-16842910}, -1);
                this.f852 = colorStateListM4030.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.f832 = 0;
            this.f849 = 0;
            this.f850 = 0;
            this.f851 = 0;
            this.f852 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListM1319 = c0243M5083.m1319(1);
            this.f844 = colorStateListM1319;
            this.f843 = colorStateListM1319;
        }
        ColorStateList colorStateListM4995 = AbstractC3453.m4994(context2, c0243M5083, 14);
        this.f847 = typedArray.getColor(14, 0);
        this.f845 = context2.getColor(me.hd.wauxv.R.color.mtrl_textinput_default_box_stroke_color);
        this.f853 = context2.getColor(me.hd.wauxv.R.color.mtrl_textinput_disabled_color);
        this.f846 = context2.getColor(me.hd.wauxv.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM4995 != null) {
            setBoxStrokeColorStateList(colorStateListM4995);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC3453.m4994(context2, c0243M5083, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.f812 = c0243M5083.m1319(24);
        this.f813 = c0243M5083.m1319(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i = typedArray.getInt(34, 1);
        boolean z = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z2 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z3 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f802 = typedArray.getResourceId(22, 0);
        this.f801 = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f801);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f802);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(c0243M5083.m1319(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(c0243M5083.m1319(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(c0243M5083.m1319(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(c0243M5083.m1319(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(c0243M5083.m1319(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(c0243M5083.m1319(58));
        }
        C1212 c1212 = new C1212(this, c0243M5083);
        this.f788 = c1212;
        boolean z4 = typedArray.getBoolean(0, true);
        c0243M5083.m1329();
        setImportantForAccessibility(2);
        AbstractC3573.m5155(this, 1);
        frameLayout.addView(c2810);
        frameLayout.addView(c1212);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f789;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f817;
        }
        int iM4131 = AbstractC2209.m4131(this.f789, me.hd.wauxv.R.attr.colorControlHighlight);
        int i = this.f826;
        int[][] iArr = f785;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C1917 c1917 = this.f817;
            int i2 = this.f832;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC2209.m4137(iM4131, i2, 0.1f), i2}), c1917, c1917);
        }
        Context context = getContext();
        C1917 c1918 = this.f817;
        TypedValue typedValueM4111 = AbstractC2207.m4111(context, me.hd.wauxv.R.attr.colorSurface, "TextInputLayout");
        int i3 = typedValueM4111.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : typedValueM4111.data;
        C1917 c1919 = new C1917(c1918.f6332.f6314);
        int iM4137 = AbstractC2209.m4137(iM4131, color, 0.1f);
        c1919.m3716(new ColorStateList(iArr, new int[]{iM4137, 0}));
        c1919.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM4137, color});
        C1917 c19110 = new C1917(c1918.f6332.f6314);
        c19110.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c1919, c19110), c1918});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f819 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f819 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f819.addState(new int[0], m698(false));
        }
        return this.f819;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f818 == null) {
            this.f818 = m698(true);
        }
        return this.f818;
    }

    private void setEditText(EditText editText) {
        if (this.f789 != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f789 = editText;
        int i = this.f791;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f793);
        }
        int i2 = this.f792;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f794);
        }
        this.f820 = false;
        m701();
        setTextInputAccessibilityDelegate(new C2909(this));
        Typeface typeface = this.f789.getTypeface();
        C0738 c0738 = this.f856;
        c0738.m2170(typeface);
        float textSize = this.f789.getTextSize();
        if (c0738.f2780 != textSize) {
            c0738.f2780 = textSize;
            c0738.m2165(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f789.getLetterSpacing();
        if (c0738.f2821 != letterSpacing) {
            c0738.f2821 = letterSpacing;
            c0738.m2165(false);
        }
        int gravity = this.f789.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (c0738.f2779 != i4) {
            c0738.f2779 = i4;
            c0738.m2165(false);
        }
        if (c0738.f2778 != gravity) {
            c0738.f2778 = gravity;
            c0738.m2165(false);
        }
        Field field = AbstractC3578.f11184;
        this.f854 = editText.getMinimumHeight();
        this.f789.addTextChangedListener(new C2908(this, editText));
        if (this.f843 == null) {
            this.f843 = this.f789.getHintTextColors();
        }
        if (this.f814) {
            if (TextUtils.isEmpty(this.f815)) {
                CharSequence hint = this.f789.getHint();
                this.f790 = hint;
                setHint(hint);
                this.f789.setHint((CharSequence) null);
            }
            this.f816 = true;
        }
        if (i3 >= 29) {
            m707();
        }
        if (this.f800 != null) {
            m705(this.f789.getText());
        }
        m709();
        this.f795.m3349();
        this.f787.bringToFront();
        C1212 c1212 = this.f788;
        c1212.bringToFront();
        Iterator it = this.f839.iterator();
        while (it.hasNext()) {
            ((C1211) it.next()).m2813(this);
        }
        c1212.m2826();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m712(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f815)) {
            return;
        }
        this.f815 = charSequence;
        C0738 c0738 = this.f856;
        if (charSequence == null || !TextUtils.equals(c0738.f2799, charSequence)) {
            c0738.f2799 = charSequence;
            c0738.f2800 = null;
            Bitmap bitmap = c0738.f2803;
            if (bitmap != null) {
                bitmap.recycle();
                c0738.f2803 = null;
            }
            c0738.m2165(false);
        }
        if (this.f855) {
            return;
        }
        m702();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f804 == z) {
            return;
        }
        if (z) {
            C0236 c0236 = this.f805;
            if (c0236 != null) {
                this.f786.addView(c0236);
                this.f805.setVisibility(0);
            }
        } else {
            C0236 c0237 = this.f805;
            if (c0237 != null) {
                c0237.setVisibility(8);
            }
            this.f805 = null;
        }
        this.f804 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static void m692(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m692((ViewGroup) childAt, z);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f786;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m711();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f789;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f790 != null) {
            boolean z = this.f816;
            this.f816 = false;
            CharSequence hint = editText.getHint();
            this.f789.setHint(this.f790);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f789.setHint(hint);
                this.f816 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f786;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f789) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f861 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f861 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C1917 c1917;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.f814;
        C0738 c0738 = this.f856;
        if (z) {
            TextPaint textPaint = c0738.f2812;
            RectF rectF = c0738.f2777;
            int iSave = canvas2.save();
            if (c0738.f2800 != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c0738.f2805);
                float f = c0738.f2788;
                float f2 = c0738.f2789;
                float f3 = c0738.f2804;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if (true) {
                    canvas2.translate(f, f2);
                    c0738.f2823.draw(canvas2);
                } else {
                    float lineStart = c0738.f2788 - c0738.f2823.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (c0738.f2826 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = c0738.f2806;
                        float f6 = c0738.f2807;
                        float f7 = c0738.f2808;
                        int i2 = c0738.f2809;
                        textPaint.setShadowLayer(f5, f6, f7, AbstractC0752.m2226(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    c0738.f2823.draw(canvas2);
                    textPaint.setAlpha((int) (c0738.f2825 * f4));
                    if (i >= 31) {
                        float f8 = c0738.f2806;
                        float f9 = c0738.f2807;
                        float f10 = c0738.f2808;
                        int i3 = c0738.f2809;
                        textPaint.setShadowLayer(f8, f9, f10, AbstractC0752.m2226(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = c0738.f2823.getLineBaseline(0);
                    CharSequence charSequence = c0738.f2827;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c0738.f2806, c0738.f2807, c0738.f2808, c0738.f2809);
                    }
                    String strTrim = c0738.f2827.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = AbstractC2784.m4744(1, 0, strTrim);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(c0738.f2823.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f822 == null || (c1917 = this.f821) == null) {
            return;
        }
        c1917.draw(canvas2);
        if (this.f789.isFocused()) {
            Rect bounds = this.f822.getBounds();
            Rect bounds2 = this.f821.getBounds();
            float f12 = c0738.f2774;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC0164.m1213(iCenterX, bounds2.left, f12);
            bounds.right = AbstractC0164.m1213(iCenterX, bounds2.right, f12);
            this.f822.draw(canvas2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.f860) {
            return;
        }
        this.f860 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0738 c0738 = this.f856;
        if (c0738 != null) {
            c0738.f2810 = drawableState;
            ColorStateList colorStateList2 = c0738.f2783;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c0738.f2782) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                c0738.m2165(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.f789 != null) {
            Field field = AbstractC3578.f11184;
            m712(isLaidOut() && isEnabled(), false);
        }
        m709();
        m715();
        if (z) {
            invalidate();
        }
        this.f860 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f789;
        if (editText == null) {
            return super.getBaseline();
        }
        return m695() + getPaddingTop() + editText.getBaseline();
    }

    public C1917 getBoxBackground() {
        int i = this.f826;
        if (i == 1 || i == 2) {
            return this.f817;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f832;
    }

    public int getBoxBackgroundMode() {
        return this.f826;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f827;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zM3191 = AbstractC1459.m3191(this);
        RectF rectF = this.f835;
        return zM3191 ? this.f823.f8635.mo916(rectF) : this.f823.f8634.mo916(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM3191 = AbstractC1459.m3191(this);
        RectF rectF = this.f835;
        return zM3191 ? this.f823.f8634.mo916(rectF) : this.f823.f8635.mo916(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM3191 = AbstractC1459.m3191(this);
        RectF rectF = this.f835;
        return zM3191 ? this.f823.f8632.mo916(rectF) : this.f823.f8633.mo916(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM3191 = AbstractC1459.m3191(this);
        RectF rectF = this.f835;
        return zM3191 ? this.f823.f8633.mo916(rectF) : this.f823.f8632.mo916(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f847;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f848;
    }

    public int getBoxStrokeWidth() {
        return this.f829;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f830;
    }

    public int getCounterMaxLength() {
        return this.f797;
    }

    public CharSequence getCounterOverflowDescription() {
        C0236 c0236;
        if (this.f796 && this.f798 && (c0236 = this.f800) != null) {
            return c0236.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f811;
    }

    public ColorStateList getCounterTextColor() {
        return this.f810;
    }

    public ColorStateList getCursorColor() {
        return this.f812;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f813;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f843;
    }

    public EditText getEditText() {
        return this.f789;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f788.f4357.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f788.f4357.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f788.f4363;
    }

    public int getEndIconMode() {
        return this.f788.f4359;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f788.f4364;
    }

    public CheckableImageButton getEndIconView() {
        return this.f788.f4357;
    }

    public CharSequence getError() {
        C1633 c1633 = this.f795;
        if (c1633.f5532) {
            return c1633.f5531;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f795.f5535;
    }

    public CharSequence getErrorContentDescription() {
        return this.f795.f5534;
    }

    public int getErrorCurrentTextColors() {
        C0236 c0236 = this.f795.f5533;
        if (c0236 != null) {
            return c0236.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f788.f4353.getDrawable();
    }

    public CharSequence getHelperText() {
        C1633 c1633 = this.f795;
        if (c1633.f5539) {
            return c1633.f5538;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0236 c0236 = this.f795.f5540;
        if (c0236 != null) {
            return c0236.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f814) {
            return this.f815;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f856.m2162();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0738 c0738 = this.f856;
        return c0738.m2163(c0738.f2783);
    }

    public ColorStateList getHintTextColor() {
        return this.f844;
    }

    public InterfaceC2910 getLengthCounter() {
        return this.f799;
    }

    public int getMaxEms() {
        return this.f792;
    }

    public int getMaxWidth() {
        return this.f794;
    }

    public int getMinEms() {
        return this.f791;
    }

    public int getMinWidth() {
        return this.f793;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f788.f4357.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f788.f4357.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f804) {
            return this.f803;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f807;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f806;
    }

    public CharSequence getPrefixText() {
        return this.f787.f9002;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f787.f9001.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f787.f9001;
    }

    public C2677 getShapeAppearanceModel() {
        return this.f823;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f787.f9003.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f787.f9003.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f787.f9006;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f787.f9007;
    }

    public CharSequence getSuffixText() {
        return this.f788.f4366;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f788.f4367.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f788.f4367;
    }

    public Typeface getTypeface() {
        return this.f836;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f856.m2164(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C1212 c1212 = this.f788;
        c1212.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f862 = false;
        if (this.f789 != null && this.f789.getMeasuredHeight() < (iMax = Math.max(c1212.getMeasuredHeight(), this.f787.getMeasuredHeight()))) {
            this.f789.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM708 = m708();
        if (z || zM708) {
            this.f789.post(new RunnableC0563(8, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f789;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC1015.f3713;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f833;
            rect.set(0, 0, width, height);
            AbstractC1015.m2590(this, editText, rect);
            C1917 c1917 = this.f821;
            if (c1917 != null) {
                int i5 = rect.bottom;
                c1917.setBounds(rect.left, i5 - this.f829, rect.right, i5);
            }
            C1917 c1918 = this.f822;
            if (c1918 != null) {
                int i6 = rect.bottom;
                c1918.setBounds(rect.left, i6 - this.f830, rect.right, i6);
            }
            if (this.f814) {
                float textSize = this.f789.getTextSize();
                C0738 c0738 = this.f856;
                if (c0738.f2780 != textSize) {
                    c0738.f2780 = textSize;
                    c0738.m2165(false);
                }
                int gravity = this.f789.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c0738.f2779 != i7) {
                    c0738.f2779 = i7;
                    c0738.m2165(false);
                }
                if (c0738.f2778 != gravity) {
                    c0738.f2778 = gravity;
                    c0738.m2165(false);
                }
                if (this.f789 == null) {
                    throw new IllegalStateException();
                }
                boolean zM3191 = AbstractC1459.m3191(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f834;
                rect2.bottom = i8;
                int i9 = this.f826;
                if (i9 == 1) {
                    rect2.left = m699(rect.left, zM3191);
                    rect2.top = rect.top + this.f827;
                    rect2.right = m700(rect.right, zM3191);
                } else if (i9 != 2) {
                    rect2.left = m699(rect.left, zM3191);
                    rect2.top = getPaddingTop();
                    rect2.right = m700(rect.right, zM3191);
                } else {
                    rect2.left = this.f789.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m695();
                    rect2.right = rect.right - this.f789.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = c0738.f2776;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    c0738.f2811 = true;
                }
                if (this.f789 == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0738.f2813;
                textPaint.setTextSize(c0738.f2780);
                textPaint.setTypeface(c0738.f2793);
                textPaint.setLetterSpacing(c0738.f2821);
                float f = -textPaint.ascent();
                rect2.left = this.f789.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f826 != 1 || this.f789.getMinLines() > 1) ? rect.top + this.f789.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f789.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f826 != 1 || this.f789.getMinLines() > 1) ? rect.bottom - this.f789.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = c0738.f2775;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    c0738.f2811 = true;
                }
                c0738.m2165(false);
                if (!m697() || this.f855) {
                    return;
                }
                m702();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f862;
        C1212 c1212 = this.f788;
        if (!z) {
            c1212.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f862 = true;
        }
        if (this.f805 != null && (editText = this.f789) != null) {
            this.f805.setGravity(editText.getGravity());
            this.f805.setPadding(this.f789.getCompoundPaddingLeft(), this.f789.getCompoundPaddingTop(), this.f789.getCompoundPaddingRight(), this.f789.getCompoundPaddingBottom());
        }
        c1212.m2826();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2911)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2911 c2911 = (C2911) parcelable;
        super.onRestoreInstanceState(c2911.f986);
        setError(c2911.f9360);
        if (c2911.f9361) {
            post(new RunnableC0141(16, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f824) {
            InterfaceC0874 interfaceC0874 = this.f823.f8632;
            RectF rectF = this.f835;
            float fMo916 = interfaceC0874.mo916(rectF);
            float fMo917 = this.f823.f8633.mo916(rectF);
            float fMo918 = this.f823.f8635.mo916(rectF);
            float fMo919 = this.f823.f8634.mo916(rectF);
            C2677 c2677 = this.f823;
            AbstractC2207 abstractC2207 = c2677.f8628;
            AbstractC2207 abstractC2208 = c2677.f8629;
            AbstractC2207 abstractC2209 = c2677.f8631;
            AbstractC2207 abstractC22010 = c2677.f8630;
            C1133 c1133 = new C1133();
            C1133 c1134 = new C1133();
            C1133 c1135 = new C1133();
            C1133 c1136 = new C1133();
            C0053 c0053 = new C0053(fMo917);
            C0053 c0054 = new C0053(fMo916);
            C0053 c0055 = new C0053(fMo919);
            C0053 c0056 = new C0053(fMo918);
            C2677 c2678 = new C2677();
            c2678.f8628 = abstractC2208;
            c2678.f8629 = abstractC2207;
            c2678.f8630 = abstractC2209;
            c2678.f8631 = abstractC22010;
            c2678.f8632 = c0053;
            c2678.f8633 = c0054;
            c2678.f8634 = c0056;
            c2678.f8635 = c0055;
            c2678.f8636 = c1133;
            c2678.f8637 = c1134;
            c2678.f8638 = c1135;
            c2678.f8639 = c1136;
            this.f824 = z;
            setShapeAppearanceModel(c2678);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2911 c2911 = new C2911(super.onSaveInstanceState());
        if (m704()) {
            c2911.f9360 = getError();
        }
        C1212 c1212 = this.f788;
        c2911.f9361 = c1212.f4359 != 0 && c1212.f4357.f724;
        return c2911;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f832 != i) {
            this.f832 = i;
            this.f849 = i;
            this.f851 = i;
            this.f852 = i;
            m694();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f849 = defaultColor;
        this.f832 = defaultColor;
        this.f850 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f851 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f852 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m694();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f826) {
            return;
        }
        this.f826 = i;
        if (this.f789 != null) {
            m701();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f827 = i;
    }

    public void setBoxCornerFamily(int i) {
        C2021 c2021M4691 = this.f823.m4691();
        InterfaceC0874 interfaceC0874 = this.f823.f8632;
        c2021M4691.f6762 = AbstractC3471.m5071(i);
        c2021M4691.f6766 = interfaceC0874;
        InterfaceC0874 interfaceC0875 = this.f823.f8633;
        c2021M4691.f6763 = AbstractC3471.m5071(i);
        c2021M4691.f6767 = interfaceC0875;
        InterfaceC0874 interfaceC0876 = this.f823.f8635;
        c2021M4691.f6765 = AbstractC3471.m5071(i);
        c2021M4691.f6769 = interfaceC0876;
        InterfaceC0874 interfaceC0877 = this.f823.f8634;
        c2021M4691.f6764 = AbstractC3471.m5071(i);
        c2021M4691.f6768 = interfaceC0877;
        this.f823 = c2021M4691.m3876();
        m694();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f847 != i) {
            this.f847 = i;
            m715();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f845 = colorStateList.getDefaultColor();
            this.f853 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f846 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f847 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f847 != colorStateList.getDefaultColor()) {
            this.f847 = colorStateList.getDefaultColor();
        }
        m715();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f848 != colorStateList) {
            this.f848 = colorStateList;
            m715();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f829 = i;
        m715();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f830 = i;
        m715();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f796 != z) {
            C1633 c1633 = this.f795;
            if (z) {
                C0236 c0236 = new C0236(getContext(), null);
                this.f800 = c0236;
                c0236.setId(me.hd.wauxv.R.id.textinput_counter);
                Typeface typeface = this.f836;
                if (typeface != null) {
                    this.f800.setTypeface(typeface);
                }
                this.f800.setMaxLines(1);
                c1633.m3348(this.f800, 2);
                ((ViewGroup.MarginLayoutParams) this.f800.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.mtrl_textinput_counter_margin_start));
                m706();
                if (this.f800 != null) {
                    EditText editText = this.f789;
                    m705(editText != null ? editText.getText() : null);
                }
            } else {
                c1633.m3354(this.f800, 2);
                this.f800 = null;
            }
            this.f796 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f797 != i) {
            if (i > 0) {
                this.f797 = i;
            } else {
                this.f797 = -1;
            }
            if (!this.f796 || this.f800 == null) {
                return;
            }
            EditText editText = this.f789;
            m705(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f801 != i) {
            this.f801 = i;
            m706();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f811 != colorStateList) {
            this.f811 = colorStateList;
            m706();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f802 != i) {
            this.f802 = i;
            m706();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f810 != colorStateList) {
            this.f810 = colorStateList;
            m706();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f812 != colorStateList) {
            this.f812 = colorStateList;
            m707();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f813 != colorStateList) {
            this.f813 = colorStateList;
            if (m704() || (this.f800 != null && this.f798)) {
                m707();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f843 = colorStateList;
        this.f844 = colorStateList;
        if (this.f789 != null) {
            m712(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m692(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f788.f4357.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f788.f4357.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C1212 c1212 = this.f788;
        CharSequence text = i != 0 ? c1212.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c1212.f4357;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C1212 c1212 = this.f788;
        Drawable drawableM5076 = i != 0 ? AbstractC3471.m5076(c1212.getContext(), i) : null;
        TextInputLayout textInputLayout = c1212.f4351;
        CheckableImageButton checkableImageButton = c1212.f4357;
        checkableImageButton.setImageDrawable(drawableM5076);
        if (drawableM5076 != null) {
            AbstractC1574.m3289(textInputLayout, checkableImageButton, c1212.f4361, c1212.f4362);
            AbstractC1574.m3306(textInputLayout, checkableImageButton, c1212.f4361);
        }
    }

    public void setEndIconMinSize(int i) {
        C1212 c1212 = this.f788;
        if (i < 0) {
            
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c1212.f4363) {
            c1212.f4363 = i;
            CheckableImageButton checkableImageButton = c1212.f4357;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c1212.f4353;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f788.m2820(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C1212 c1212 = this.f788;
        CheckableImageButton checkableImageButton = c1212.f4357;
        View.OnLongClickListener onLongClickListener = c1212.f4365;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1574.m3311(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C1212 c1212 = this.f788;
        c1212.f4365 = onLongClickListener;
        CheckableImageButton checkableImageButton = c1212.f4357;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1574.m3311(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C1212 c1212 = this.f788;
        c1212.f4364 = scaleType;
        c1212.f4357.setScaleType(scaleType);
        c1212.f4353.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C1212 c1212 = this.f788;
        if (c1212.f4361 != colorStateList) {
            c1212.f4361 = colorStateList;
            AbstractC1574.m3289(c1212.f4351, c1212.f4357, colorStateList, c1212.f4362);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C1212 c1212 = this.f788;
        if (c1212.f4362 != mode) {
            c1212.f4362 = mode;
            AbstractC1574.m3289(c1212.f4351, c1212.f4357, c1212.f4361, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f788.m2821(z);
    }

    public void setError(CharSequence charSequence) {
        C1633 c1633 = this.f795;
        if (!c1633.f5532) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c1633.m3353();
            return;
        }
        c1633.m3350();
        c1633.f5531 = charSequence;
        c1633.f5533.setText(charSequence);
        int i = c1633.f5529;
        if (i != 1) {
            c1633.f5530 = 1;
        }
        c1633.m3356(i, c1633.f5530, c1633.m3355(c1633.f5533, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C1633 c1633 = this.f795;
        c1633.f5535 = i;
        C0236 c0236 = c1633.f5533;
        if (c0236 != null) {
            Field field = AbstractC3578.f11184;
            c0236.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C1633 c1633 = this.f795;
        c1633.f5534 = charSequence;
        C0236 c0236 = c1633.f5533;
        if (c0236 != null) {
            c0236.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C1633 c1633 = this.f795;
        TextInputLayout textInputLayout = c1633.f5523;
        if (c1633.f5532 == z) {
            return;
        }
        c1633.m3350();
        if (z) {
            C0236 c0236 = new C0236(c1633.f5522, null);
            c1633.f5533 = c0236;
            c0236.setId(me.hd.wauxv.R.id.textinput_error);
            c1633.f5533.setTextAlignment(5);
            Typeface typeface = c1633.f5543;
            if (typeface != null) {
                c1633.f5533.setTypeface(typeface);
            }
            int i = c1633.f5536;
            c1633.f5536 = i;
            C0236 c0237 = c1633.f5533;
            if (c0237 != null) {
                c1633.f5523.m703(c0237, i);
            }
            ColorStateList colorStateList = c1633.f5537;
            c1633.f5537 = colorStateList;
            C0236 c0238 = c1633.f5533;
            if (c0238 != null && colorStateList != null) {
                c0238.setTextColor(colorStateList);
            }
            CharSequence charSequence = c1633.f5534;
            c1633.f5534 = charSequence;
            C0236 c0239 = c1633.f5533;
            if (c0239 != null) {
                c0239.setContentDescription(charSequence);
            }
            int i2 = c1633.f5535;
            c1633.f5535 = i2;
            C0236 c02310 = c1633.f5533;
            if (c02310 != null) {
                Field field = AbstractC3578.f11184;
                c02310.setAccessibilityLiveRegion(i2);
            }
            c1633.f5533.setVisibility(4);
            c1633.m3348(c1633.f5533, 0);
        } else {
            c1633.m3353();
            c1633.m3354(c1633.f5533, 0);
            c1633.f5533 = null;
            textInputLayout.m709();
            textInputLayout.m715();
        }
        c1633.f5532 = z;
    }

    public void setErrorIconDrawable(int i) {
        C1212 c1212 = this.f788;
        c1212.m2822(i != 0 ? AbstractC3471.m5076(c1212.getContext(), i) : null);
        AbstractC1574.m3306(c1212.f4351, c1212.f4353, c1212.f4354);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C1212 c1212 = this.f788;
        CheckableImageButton checkableImageButton = c1212.f4353;
        View.OnLongClickListener onLongClickListener = c1212.f4356;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1574.m3311(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C1212 c1212 = this.f788;
        c1212.f4356 = onLongClickListener;
        CheckableImageButton checkableImageButton = c1212.f4353;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1574.m3311(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C1212 c1212 = this.f788;
        if (c1212.f4354 != colorStateList) {
            c1212.f4354 = colorStateList;
            AbstractC1574.m3289(c1212.f4351, c1212.f4353, colorStateList, c1212.f4355);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C1212 c1212 = this.f788;
        if (c1212.f4355 != mode) {
            c1212.f4355 = mode;
            AbstractC1574.m3289(c1212.f4351, c1212.f4353, c1212.f4354, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C1633 c1633 = this.f795;
        c1633.f5536 = i;
        C0236 c0236 = c1633.f5533;
        if (c0236 != null) {
            c1633.f5523.m703(c0236, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C1633 c1633 = this.f795;
        c1633.f5537 = colorStateList;
        C0236 c0236 = c1633.f5533;
        if (c0236 == null || colorStateList == null) {
            return;
        }
        c0236.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f857 != z) {
            this.f857 = z;
            m712(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C1633 c1633 = this.f795;
        if (zIsEmpty) {
            if (c1633.f5539) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c1633.f5539) {
            setHelperTextEnabled(true);
        }
        c1633.m3350();
        c1633.f5538 = charSequence;
        c1633.f5540.setText(charSequence);
        int i = c1633.f5529;
        if (i != 2) {
            c1633.f5530 = 2;
        }
        c1633.m3356(i, c1633.f5530, c1633.m3355(c1633.f5540, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C1633 c1633 = this.f795;
        c1633.f5542 = colorStateList;
        C0236 c0236 = c1633.f5540;
        if (c0236 == null || colorStateList == null) {
            return;
        }
        c0236.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C1633 c1633 = this.f795;
        TextInputLayout textInputLayout = c1633.f5523;
        if (c1633.f5539 == z) {
            return;
        }
        c1633.m3350();
        if (z) {
            C0236 c0236 = new C0236(c1633.f5522, null);
            c1633.f5540 = c0236;
            c0236.setId(me.hd.wauxv.R.id.textinput_helper_text);
            c1633.f5540.setTextAlignment(5);
            Typeface typeface = c1633.f5543;
            if (typeface != null) {
                c1633.f5540.setTypeface(typeface);
            }
            c1633.f5540.setVisibility(4);
            c1633.f5540.setAccessibilityLiveRegion(1);
            int i = c1633.f5541;
            c1633.f5541 = i;
            C0236 c0237 = c1633.f5540;
            if (c0237 != null) {
                c0237.setTextAppearance(i);
            }
            ColorStateList colorStateList = c1633.f5542;
            c1633.f5542 = colorStateList;
            C0236 c0238 = c1633.f5540;
            if (c0238 != null && colorStateList != null) {
                c0238.setTextColor(colorStateList);
            }
            c1633.m3348(c1633.f5540, 1);
            c1633.f5540.setAccessibilityDelegate(new C1632(c1633));
        } else {
            c1633.m3350();
            int i2 = c1633.f5529;
            if (i2 == 2) {
                c1633.f5530 = 0;
            }
            c1633.m3356(i2, c1633.f5530, c1633.m3355(c1633.f5540, ""));
            c1633.m3354(c1633.f5540, 1);
            c1633.f5540 = null;
            textInputLayout.m709();
            textInputLayout.m715();
        }
        c1633.f5539 = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C1633 c1633 = this.f795;
        c1633.f5541 = i;
        C0236 c0236 = c1633.f5540;
        if (c0236 != null) {
            c0236.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f814) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f858 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f814) {
            this.f814 = z;
            if (z) {
                CharSequence hint = this.f789.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f815)) {
                        setHint(hint);
                    }
                    this.f789.setHint((CharSequence) null);
                }
                this.f816 = true;
            } else {
                this.f816 = false;
                if (!TextUtils.isEmpty(this.f815) && TextUtils.isEmpty(this.f789.getHint())) {
                    this.f789.setHint(this.f815);
                }
                setHintInternal(null);
            }
            if (this.f789 != null) {
                m711();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C0738 c0738 = this.f856;
        TextInputLayout textInputLayout = c0738.f2773;
        C2904 c2904 = new C2904(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c2904.f9340;
        if (colorStateList != null) {
            c0738.f2783 = colorStateList;
        }
        float f = c2904.f9341;
        if (f != 0.0f) {
            c0738.f2781 = f;
        }
        ColorStateList colorStateList2 = c2904.f9331;
        if (colorStateList2 != null) {
            c0738.f2819 = colorStateList2;
        }
        c0738.f2817 = c2904.f9335;
        c0738.f2818 = c2904.f9336;
        c0738.f2816 = c2904.f9337;
        c0738.f2820 = c2904.f9339;
        C0556 c0556 = c0738.f2797;
        if (c0556 != null) {
            c0556.f2283 = true;
        }
        C0094 c0094 = new C0094(7, c0738);
        c2904.m4906();
        c0738.f2797 = new C0556(c0094, c2904.f9344);
        c2904.m4908(textInputLayout.getContext(), c0738.f2797);
        c0738.m2165(false);
        this.f844 = c0738.f2783;
        if (this.f789 != null) {
            m712(false, false);
            m711();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f844 != colorStateList) {
            if (this.f843 == null) {
                C0738 c0738 = this.f856;
                if (c0738.f2783 != colorStateList) {
                    c0738.f2783 = colorStateList;
                    c0738.m2165(false);
                }
            }
            this.f844 = colorStateList;
            if (this.f789 != null) {
                m712(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC2910 interfaceC2910) {
        this.f799 = interfaceC2910;
    }

    public void setMaxEms(int i) {
        this.f792 = i;
        EditText editText = this.f789;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f794 = i;
        EditText editText = this.f789;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f791 = i;
        EditText editText = this.f789;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f793 = i;
        EditText editText = this.f789;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C1212 c1212 = this.f788;
        c1212.f4357.setContentDescription(i != 0 ? c1212.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C1212 c1212 = this.f788;
        c1212.f4357.setImageDrawable(i != 0 ? AbstractC3471.m5076(c1212.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C1212 c1212 = this.f788;
        if (z && c1212.f4359 != 1) {
            c1212.m2820(1);
        } else if (z) {
            
        } else {
            c1212.m2820(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C1212 c1212 = this.f788;
        c1212.f4361 = colorStateList;
        AbstractC1574.m3289(c1212.f4351, c1212.f4357, colorStateList, c1212.f4362);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C1212 c1212 = this.f788;
        c1212.f4362 = mode;
        AbstractC1574.m3289(c1212.f4351, c1212.f4357, c1212.f4361, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f805 == null) {
            C0236 c0236 = new C0236(getContext(), null);
            this.f805 = c0236;
            c0236.setId(me.hd.wauxv.R.id.textinput_placeholder);
            this.f805.setImportantForAccessibility(2);
            C1264 c1264M696 = m696();
            this.f808 = c1264M696;
            c1264M696.f10821 = 67L;
            this.f809 = m696();
            setPlaceholderTextAppearance(this.f807);
            setPlaceholderTextColor(this.f806);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f804) {
                setPlaceholderTextEnabled(true);
            }
            this.f803 = charSequence;
        }
        EditText editText = this.f789;
        m713(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f807 = i;
        C0236 c0236 = this.f805;
        if (c0236 != null) {
            c0236.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f806 != colorStateList) {
            this.f806 = colorStateList;
            C0236 c0236 = this.f805;
            if (c0236 == null || colorStateList == null) {
                return;
            }
            c0236.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C2810 c2810 = this.f787;
        
        c2810.f9002 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c2810.f9001.setText(charSequence);
        c2810.m4790();
    }

    public void setPrefixTextAppearance(int i) {
        this.f787.f9001.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f787.f9001.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C2677 c2677) {
        C1917 c1917 = this.f817;
        if (c1917 == null || c1917.f6332.f6314 == c2677) {
            return;
        }
        this.f823 = c2677;
        m694();
    }

    public void setStartIconCheckable(boolean z) {
        this.f787.f9003.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC3471.m5076(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C2810 c2810 = this.f787;
        if (i < 0) {
            
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != c2810.f9006) {
            c2810.f9006 = i;
            CheckableImageButton checkableImageButton = c2810.f9003;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C2810 c2810 = this.f787;
        CheckableImageButton checkableImageButton = c2810.f9003;
        View.OnLongClickListener onLongClickListener = c2810.f9008;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1574.m3311(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C2810 c2810 = this.f787;
        c2810.f9008 = onLongClickListener;
        CheckableImageButton checkableImageButton = c2810.f9003;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1574.m3311(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C2810 c2810 = this.f787;
        c2810.f9007 = scaleType;
        c2810.f9003.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C2810 c2810 = this.f787;
        if (c2810.f9004 != colorStateList) {
            c2810.f9004 = colorStateList;
            AbstractC1574.m3289(c2810.f9000, c2810.f9003, colorStateList, c2810.f9005);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C2810 c2810 = this.f787;
        if (c2810.f9005 != mode) {
            c2810.f9005 = mode;
            AbstractC1574.m3289(c2810.f9000, c2810.f9003, c2810.f9004, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f787.m4788(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C1212 c1212 = this.f788;
        
        c1212.f4366 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c1212.f4367.setText(charSequence);
        c1212.m2827();
    }

    public void setSuffixTextAppearance(int i) {
        this.f788.f4367.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f788.f4367.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C2909 c2909) {
        EditText editText = this.f789;
        if (editText != null) {
            AbstractC3578.m5177(editText, c2909);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f836) {
            this.f836 = typeface;
            this.f856.m2170(typeface);
            C1633 c1633 = this.f795;
            if (typeface != c1633.f5543) {
                c1633.f5543 = typeface;
                C0236 c0236 = c1633.f5533;
                if (c0236 != null) {
                    c0236.setTypeface(typeface);
                }
                C0236 c0237 = c1633.f5540;
                if (c0237 != null) {
                    c0237.setTypeface(typeface);
                }
            }
            C0236 c0238 = this.f800;
            if (c0238 != null) {
                c0238.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m693(float f) {
        C0738 c0738 = this.f856;
        if (c0738.f2774 == f) {
            return;
        }
        if (this.f859 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f859 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC1574.m3309(getContext(), me.hd.wauxv.R.attr.motionEasingEmphasizedInterpolator, AbstractC0164.f1186));
            this.f859.setDuration(AbstractC1574.m3308(getContext(), me.hd.wauxv.R.attr.motionDurationMedium4, 167));
            this.f859.addUpdateListener(new C0385(5, this));
        }
        this.f859.setFloatValues(c0738.f2774, f);
        this.f859.start();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m694() {
        int i;
        int i2;
        C1917 c1917 = this.f817;
        if (c1917 == null) {
            return;
        }
        C2677 c2677 = c1917.f6332.f6314;
        C2677 c2678 = this.f823;
        if (c2677 != c2678) {
            c1917.setShapeAppearanceModel(c2678);
        }
        if (this.f826 == 2 && (i = this.f828) > -1 && (i2 = this.f831) != 0) {
            C1917 c1918 = this.f817;
            c1918.f6332.f6323 = i;
            c1918.invalidateSelf();
            c1918.m3718(ColorStateList.valueOf(i2));
        }
        int iM2224 = this.f832;
        if (this.f826 == 1) {
            iM2224 = AbstractC0752.m2224(this.f832, AbstractC2209.m4130(getContext(), me.hd.wauxv.R.attr.colorSurface, 0));
        }
        this.f832 = iM2224;
        this.f817.m3716(ColorStateList.valueOf(iM2224));
        C1917 c1919 = this.f821;
        if (c1919 != null && this.f822 != null) {
            if (this.f828 > -1 && this.f831 != 0) {
                c1919.m3716(this.f789.isFocused() ? ColorStateList.valueOf(this.f845) : ColorStateList.valueOf(this.f831));
                this.f822.m3716(ColorStateList.valueOf(this.f831));
            }
            invalidate();
        }
        m710();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m695() {
        float fM2162;
        if (!this.f814) {
            return 0;
        }
        int i = this.f826;
        C0738 c0738 = this.f856;
        if (i == 0) {
            fM2162 = c0738.m2162();
        } else {
            if (i != 2) {
                return 0;
            }
            fM2162 = c0738.m2162() / 2.0f;
        }
        return (int) fM2162;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1264 m696() {
        C1264 c1264 = new C1264();
        c1264.f10822 = AbstractC1574.m3308(getContext(), me.hd.wauxv.R.attr.motionDurationShort2, 87);
        c1264.f10823 = AbstractC1574.m3309(getContext(), me.hd.wauxv.R.attr.motionEasingLinearInterpolator, AbstractC0164.f1185);
        return c1264;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean m697() {
        return this.f814 && !TextUtils.isEmpty(this.f815) && (this.f817 instanceof C0949);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1917 m698(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C2605 c2605 = new C2605();
        C2605 c2606 = new C2605();
        C2605 c2607 = new C2605();
        C2605 c2608 = new C2605();
        C1133 c1133 = new C1133();
        C1133 c1134 = new C1133();
        C1133 c1135 = new C1133();
        C1133 c1136 = new C1133();
        C0053 c0053 = new C0053(f);
        C0053 c0054 = new C0053(f);
        C0053 c0055 = new C0053(dimensionPixelOffset);
        C0053 c0056 = new C0053(dimensionPixelOffset);
        C2677 c2677 = new C2677();
        c2677.f8628 = c2605;
        c2677.f8629 = c2606;
        c2677.f8630 = c2607;
        c2677.f8631 = c2608;
        c2677.f8632 = c0053;
        c2677.f8633 = c0054;
        c2677.f8634 = c0056;
        c2677.f8635 = c0055;
        c2677.f8636 = c1133;
        c2677.f8637 = c1134;
        c2677.f8638 = c1135;
        c2677.f8639 = c1136;
        Context context = getContext();
        Paint paint = C1917.f6331;
        TypedValue typedValueM4111 = AbstractC2207.m4111(context, me.hd.wauxv.R.attr.colorSurface, C1917.class.getSimpleName());
        int i = typedValueM4111.resourceId;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i != 0 ? context.getColor(i) : typedValueM4111.data);
        C1917 c1917 = new C1917();
        c1917.m3714(context);
        c1917.m3716(colorStateListValueOf);
        c1917.m3715(dimensionPixelOffset2);
        c1917.setShapeAppearanceModel(c2677);
        C1916 c1916 = c1917.f6332;
        if (c1916.f6320 == null) {
            c1916.f6320 = new Rect();
        }
        c1917.f6332.f6320.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        c1917.invalidateSelf();
        return c1917;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int m699(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.f789.getCompoundPaddingLeft() : this.f788.m2816();
        } else {
            compoundPaddingLeft = this.f787.m4786();
        }
        return compoundPaddingLeft + i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m700(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.f789.getCompoundPaddingRight() : this.f787.m4786();
        } else {
            compoundPaddingRight = this.f788.m2816();
        }
        return i - compoundPaddingRight;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m701() {
        int i = this.f826;
        if (i == 0) {
            this.f817 = null;
            this.f821 = null;
            this.f822 = null;
        } else if (i == 1) {
            this.f817 = new C1917(this.f823);
            this.f821 = new C1917();
            this.f822 = new C1917();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(AbstractC2784.m4751(new StringBuilder(), this.f826, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f814 || (this.f817 instanceof C0949)) {
                this.f817 = new C1917(this.f823);
            } else {
                C2677 c2677 = this.f823;
                int i2 = 0;
                if (c2677 == null) {
                    c2677 = new C2677();
                }
                C0948 c0948 = new C0948(c2677, new RectF());
                C0949 c0949 = new C0949(c0948);
                c0949.f3466 = c0948;
                this.f817 = c0949;
            }
            this.f821 = null;
            this.f822 = null;
        }
        m710();
        m715();
        if (this.f826 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f827 = getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC3453.m5001(getContext())) {
                this.f827 = getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f789 != null && this.f826 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f789;
                Field field = AbstractC3578.f11184;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f789.getPaddingEnd(), getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC3453.m5001(getContext())) {
                EditText editText2 = this.f789;
                Field field2 = AbstractC3578.f11184;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f789.getPaddingEnd(), getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f826 != 0) {
            m711();
        }
        EditText editText3 = this.f789;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f826;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m702() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (m697()) {
            int width = this.f789.getWidth();
            int gravity = this.f789.getGravity();
            C0738 c0738 = this.f856;
            boolean zM2160 = c0738.m2160(c0738.f2799);
            c0738.f2801 = zM2160;
            Rect rect = c0738.f2776;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM2160) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = c0738.f2824;
                    }
                } else if (zM2160) {
                    f = rect.right;
                    f2 = c0738.f2824;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.f835;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (true) {
                    f4 = (width / 2.0f) + (c0738.f2824 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c0738.f2801) {
                        f5 = c0738.f2824;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (c0738.f2801) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = c0738.f2824;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c0738.m2162() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f825;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f828);
                C0949 c0949 = (C0949) this.f817;
                
                c0949.m2440(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c0738.f2824 / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.f835;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (c0738.f2824 / 2.0f);
            } else {
                f4 = (width / 2.0f) + (c0738.f2824 / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c0738.m2162() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m703(C0236 c0236, int i) {
        try {
            c0236.setTextAppearance(i);
            if (c0236.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0236.setTextAppearance(me.hd.wauxv.R.style.TextAppearance_AppCompat_Caption);
        c0236.setTextColor(getContext().getColor(me.hd.wauxv.R.color.design_error));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final boolean m704() {
        C1633 c1633 = this.f795;
        return (c1633.f5530 != 1 || c1633.f5533 == null || TextUtils.isEmpty(c1633.f5531)) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m705(Editable editable) {
        
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f798;
        int i = this.f797;
        if (i == -1) {
            this.f800.setText(String.valueOf(length));
            this.f800.setContentDescription(null);
            this.f798 = false;
        } else {
            this.f798 = length > i;
            Context context = getContext();
            this.f800.setContentDescription(context.getString(this.f798 ? me.hd.wauxv.R.string.character_counter_overflowed_content_description : me.hd.wauxv.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f797)));
            if (z != this.f798) {
                m706();
            }
            String str = C0418.f1958;
            C0418 c0418 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0418.f1961 : C0418.f1960;
            C0236 c0236 = this.f800;
            String string = getContext().getString(me.hd.wauxv.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f797));
            
            C0452 c0452 = AbstractC2905.f9345;
            c0236.setText(true ? c0418.m1613(string).toString() : null);
        }
        if (this.f789 == null || z == this.f798) {
            return;
        }
        m712(false, false);
        m715();
        m709();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m706() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0236 c0236 = this.f800;
        if (c0236 != null) {
            m703(c0236, this.f798 ? this.f801 : this.f802);
            if (!this.f798 && (colorStateList2 = this.f810) != null) {
                this.f800.setTextColor(colorStateList2);
            }
            if (!this.f798 || (colorStateList = this.f811) == null) {
                return;
            }
            this.f800.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m707() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f812;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueM4109 = AbstractC2207.m4109(context, me.hd.wauxv.R.attr.colorControlActivated);
            if (typedValueM4109 != null) {
                int i = typedValueM4109.resourceId;
                if (i != 0) {
                    colorStateListValueOf = AbstractC2203.m4030(context, i);
                } else {
                    int i2 = typedValueM4109.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f789;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f789.getTextCursorDrawable().mutate();
        if ((m704() || (this.f800 != null && this.f798)) && (colorStateList = this.f813) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final boolean m708() {
        boolean z;
        if (this.f789 == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C2810 c2810 = this.f787;
            if (c2810.getMeasuredWidth() > 0) {
                int measuredWidth = c2810.getMeasuredWidth() - this.f789.getPaddingLeft();
                if (this.f837 == null || this.f838 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f837 = colorDrawable;
                    this.f838 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f789.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f837;
                if (drawable != colorDrawable2) {
                    this.f789.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.f837 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f789.getCompoundDrawablesRelative();
                this.f789.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f837 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.f837 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f789.getCompoundDrawablesRelative();
            this.f789.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f837 = null;
            z = true;
        } else {
            z = false;
        }
        C1212 c1212 = this.f788;
        if ((c1212.m2818() || ((c1212.f4359 != 0 && c1212.m2817()) || c1212.f4366 != null)) && c1212.getMeasuredWidth() > 0) {
            int measuredWidth2 = c1212.f4367.getMeasuredWidth() - this.f789.getPaddingRight();
            if (c1212.m2818()) {
                checkableImageButton = c1212.f4353;
            } else if (c1212.f4359 != 0 && c1212.m2817()) {
                checkableImageButton = c1212.f4357;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f789.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f840;
            if (colorDrawable3 != null && this.f841 != measuredWidth2) {
                this.f841 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f789.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f840, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f840 = colorDrawable4;
                this.f841 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.f840;
            if (drawable2 != colorDrawable5) {
                this.f842 = drawable2;
                this.f789.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.f840 != null) {
            Drawable[] compoundDrawablesRelative5 = this.f789.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f840) {
                this.f789.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f842, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.f840 = null;
            return z2;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m709() {
        Drawable background;
        C0236 c0236;
        EditText editText = this.f789;
        if (editText == null || this.f826 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1105.f4134;
        Drawable drawableMutate = background.mutate();
        if (m704()) {
            drawableMutate.setColorFilter(C0216.m1249(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f798 && (c0236 = this.f800) != null) {
            drawableMutate.setColorFilter(C0216.m1249(c0236.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f789.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m710() {
        EditText editText = this.f789;
        if (editText == null || this.f817 == null) {
            return;
        }
        if ((this.f820 || editText.getBackground() == null) && this.f826 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f789;
            Field field = AbstractC3578.f11184;
            editText2.setBackground(editTextBoxBackground);
            this.f820 = true;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void m711() {
        if (this.f826 != 1) {
            FrameLayout frameLayout = this.f786;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM695 = m695();
            if (iM695 != layoutParams.topMargin) {
                layoutParams.topMargin = iM695;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m712(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C0236 c0236;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f789;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f789;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f843;
        C0738 c0738 = this.f856;
        if (colorStateList2 != null) {
            c0738.m2166(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f843;
            c0738.m2166(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f853) : this.f853));
        } else if (m704()) {
            C0236 c0237 = this.f795.f5533;
            c0738.m2166(c0237 != null ? c0237.getTextColors() : null);
        } else if (this.f798 && (c0236 = this.f800) != null) {
            c0738.m2166(c0236.getTextColors());
        } else if (z4 && (colorStateList = this.f844) != null && c0738.f2783 != colorStateList) {
            c0738.f2783 = colorStateList;
            c0738.m2165(false);
        }
        C1212 c1212 = this.f788;
        C2810 c2810 = this.f787;
        if (z3 || !this.f857 || (isEnabled() && z4)) {
            if (z2 || this.f855) {
                ValueAnimator valueAnimator = this.f859;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f859.cancel();
                }
                if (z && this.f858) {
                    m693(1.0f);
                } else {
                    c0738.m2168(1.0f);
                }
                this.f855 = false;
                if (m697()) {
                    m702();
                }
                EditText editText3 = this.f789;
                m713(editText3 != null ? editText3.getText() : null);
                c2810.f9009 = false;
                c2810.m4790();
                c1212.f4368 = false;
                c1212.m2827();
                return;
            }
            return;
        }
        if (z2 || !this.f855) {
            ValueAnimator valueAnimator2 = this.f859;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f859.cancel();
            }
            if (z && this.f858) {
                m693(0.0f);
            } else {
                c0738.m2168(0.0f);
            }
            if (m697() && !((C0949) this.f817).f3466.f3464.isEmpty() && m697()) {
                ((C0949) this.f817).m2440(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f855 = true;
            C0236 c0238 = this.f805;
            if (c0238 != null && this.f804) {
                c0238.setText((CharSequence) null);
                AbstractC3440.m4958(this.f786, this.f809);
                this.f805.setVisibility(4);
            }
            c2810.f9009 = true;
            c2810.m4790();
            c1212.f4368 = true;
            c1212.m2827();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void m713(Editable editable) {
        
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f786;
        if (length != 0 || this.f855) {
            C0236 c0236 = this.f805;
            if (c0236 == null || !this.f804) {
                return;
            }
            c0236.setText((CharSequence) null);
            AbstractC3440.m4958(frameLayout, this.f809);
            this.f805.setVisibility(4);
            return;
        }
        if (this.f805 == null || !this.f804 || TextUtils.isEmpty(this.f803)) {
            return;
        }
        this.f805.setText(this.f803);
        AbstractC3440.m4958(frameLayout, this.f808);
        this.f805.setVisibility(0);
        this.f805.bringToFront();
        announceForAccessibility(this.f803);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void m714(boolean z, boolean z2) {
        int defaultColor = this.f848.getDefaultColor();
        int colorForState = this.f848.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f848.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f831 = colorForState2;
        } else if (z2) {
            this.f831 = colorForState;
        } else {
            this.f831 = defaultColor;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m715() {
        C0236 c0236;
        EditText editText;
        EditText editText2;
        if (this.f817 == null || this.f826 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f789) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f789) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f831 = this.f853;
        } else if (m704()) {
            if (this.f848 != null) {
                m714(z2, z);
            } else {
                this.f831 = getErrorCurrentTextColors();
            }
        } else if (!this.f798 || (c0236 = this.f800) == null) {
            if (z2) {
                this.f831 = this.f847;
            } else if (z) {
                this.f831 = this.f846;
            } else {
                this.f831 = this.f845;
            }
        } else if (this.f848 != null) {
            m714(z2, z);
        } else {
            this.f831 = c0236.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m707();
        }
        C1212 c1212 = this.f788;
        TextInputLayout textInputLayout = c1212.f4351;
        CheckableImageButton checkableImageButton = c1212.f4357;
        TextInputLayout textInputLayout2 = c1212.f4351;
        c1212.m2825();
        AbstractC1574.m3306(textInputLayout2, c1212.f4353, c1212.f4354);
        AbstractC1574.m3306(textInputLayout2, checkableImageButton, c1212.f4361);
        if (c1212.m2815() instanceof C1118) {
            if (!textInputLayout.m704() || checkableImageButton.getDrawable() == null) {
                AbstractC1574.m3289(textInputLayout, checkableImageButton, c1212.f4361, c1212.f4362);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        C2810 c2810 = this.f787;
        AbstractC1574.m3306(c2810.f9000, c2810.f9003, c2810.f9004);
        if (this.f826 == 2) {
            int i = this.f828;
            if (z2 && isEnabled()) {
                this.f828 = this.f830;
            } else {
                this.f828 = this.f829;
            }
            if (this.f828 != i && m697() && !this.f855) {
                if (m697()) {
                    ((C0949) this.f817).m2440(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m702();
            }
        }
        if (this.f826 == 1) {
            if (!isEnabled()) {
                this.f832 = this.f850;
            } else if (z && !z2) {
                this.f832 = this.f852;
            } else if (z2) {
                this.f832 = this.f851;
            } else {
                this.f832 = this.f849;
            }
        }
        m694();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f787.f9003;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f787.m4787(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f788.f4357.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f788.f4357.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f788.m2822(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f788.f4357;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C1212 c1212 = this.f788;
        TextInputLayout textInputLayout = c1212.f4351;
        CheckableImageButton checkableImageButton = c1212.f4357;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC1574.m3289(textInputLayout, checkableImageButton, c1212.f4361, c1212.f4362);
            AbstractC1574.m3306(textInputLayout, checkableImageButton, c1212.f4361);
        }
    }
}
