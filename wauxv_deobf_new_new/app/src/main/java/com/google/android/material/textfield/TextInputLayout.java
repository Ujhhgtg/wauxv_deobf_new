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
import p000.AbstractC0172;
import p000.AbstractC0747;
import p000.AbstractC1018;
import p000.AbstractC1111;
import p000.AbstractC1469;
import p000.AbstractC1470;
import p000.AbstractC1471;
import p000.AbstractC1586;
import p000.AbstractC2240;
import p000.AbstractC2521;
import p000.AbstractC2844;
import p000.AbstractC2964;
import p000.AbstractC3497;
import p000.AbstractC3633;
import p000.AbstractC3638;
import p000.AbstractC3744;
import p000.C0060;
import p000.C0102;
import p000.C0226;
import p000.C0246;
import p000.C0253;
import p000.C0360;
import p000.C0393;
import p000.C0427;
import p000.C0533;
import p000.C0733;
import p000.C0951;
import p000.C0952;
import p000.C1124;
import p000.C1139;
import p000.C1212;
import p000.C1213;
import p000.C1266;
import p000.C1645;
import p000.C1646;
import p000.C1787;
import p000.C1947;
import p000.C1948;
import p000.C2425;
import p000.C2666;
import p000.C2737;
import p000.C2738;
import p000.C2870;
import p000.C2963;
import p000.C2967;
import p000.C2968;
import p000.C2970;
import p000.InterfaceC0873;
import p000.InterfaceC2969;
import p000.RunnableC0149;
import p000.RunnableC0541;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲈᲁ, reason: contains not printable characters */
    public static final int[][] f851 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final FrameLayout f852;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2870 f853;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1213 f854;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public EditText f855;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public CharSequence f856;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f857;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f858;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f859;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f860;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C1646 f861;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f862;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f863;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public boolean f864;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public InterfaceC2969 f865;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C0246 f866;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public int f867;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f868;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public CharSequence f869;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public boolean f870;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public C0246 f871;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public ColorStateList f872;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int f873;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public C1266 f874;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public C1266 f875;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public ColorStateList f876;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public ColorStateList f877;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public ColorStateList f878;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public ColorStateList f879;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public boolean f880;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public CharSequence f881;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public boolean f882;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public C1948 f883;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public C1948 f884;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public StateListDrawable f885;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public boolean f886;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public C1948 f887;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public C1948 f888;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public C2738 f889;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public boolean f890;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final int f891;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public int f892;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public int f893;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public int f894;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public int f895;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public int f896;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public int f897;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ, reason: contains not printable characters */
    public int f898;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ, reason: contains not printable characters */
    public final Rect f899;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ, reason: contains not printable characters */
    public final Rect f900;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ, reason: contains not printable characters */
    public final RectF f901;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ, reason: contains not printable characters */
    public Typeface f902;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲇᲀ, reason: contains not printable characters */
    public ColorDrawable f903;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ, reason: contains not printable characters */
    public int f904;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ, reason: contains not printable characters */
    public final LinkedHashSet f905;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ, reason: contains not printable characters */
    public ColorDrawable f906;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ, reason: contains not printable characters */
    public int f907;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᤞᲇ, reason: contains not printable characters */
    public Drawable f908;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ, reason: contains not printable characters */
    public ColorStateList f909;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
    public ColorStateList f910;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ, reason: contains not printable characters */
    public int f911;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public int f912;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public int f913;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public ColorStateList f914;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public int f915;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public int f916;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public int f917;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᤞᲇ, reason: contains not printable characters */
    public int f918;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ, reason: contains not printable characters */
    public int f919;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᤞᲀ, reason: contains not printable characters */
    public int f920;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᲀᤞ, reason: contains not printable characters */
    public boolean f921;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲁᲈ, reason: contains not printable characters */
    public final C0733 f922;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲀᲈᲁ, reason: contains not printable characters */
    public boolean f923;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲀᲈ, reason: contains not printable characters */
    public boolean f924;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲁᲈᲀ, reason: contains not printable characters */
    public ValueAnimator f925;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲀᲁ, reason: contains not printable characters */
    public boolean f926;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᤞᲈᲁᲀ, reason: contains not printable characters */
    public boolean f927;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲇᲀᤞᲁᲈ, reason: contains not printable characters */
    public boolean f928;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC1469.m3354(context, attributeSet, me.hd.wauxv.R.attr.textInputStyle, me.hd.wauxv.R.style.Widget_Design_TextInputLayout), attributeSet, me.hd.wauxv.R.attr.textInputStyle);
        this.f857 = -1;
        this.f858 = -1;
        this.f859 = -1;
        this.f860 = -1;
        this.f861 = new C1646(this);
        this.f865 = new C2425(15);
        this.f899 = new Rect();
        this.f900 = new Rect();
        this.f901 = new RectF();
        this.f905 = new LinkedHashSet();
        C0733 c0733 = new C0733(this);
        this.f922 = c0733;
        this.f928 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f852 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0172.f1253;
        c0733.f2809 = linearInterpolator;
        c0733.m2257(false);
        c0733.f2808 = linearInterpolator;
        c0733.m2257(false);
        if (c0733.f2773 != 8388659) {
            c0733.f2773 = 8388659;
            c0733.m2257(false);
        }
        C0253 c0253M4264 = AbstractC2240.m4264(context2, attributeSet, AbstractC2521.f8021, me.hd.wauxv.R.attr.textInputStyle, me.hd.wauxv.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        C2870 c2870 = new C2870(this, c0253M4264);
        this.f853 = c2870;
        TypedArray typedArray = (TypedArray) c0253M4264.f1478;
        this.f880 = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f924 = typedArray.getBoolean(47, true);
        this.f923 = typedArray.getBoolean(42, true);
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
        this.f889 = C2738.m4725(context2, attributeSet, me.hd.wauxv.R.attr.textInputStyle, me.hd.wauxv.R.style.Widget_Design_TextInputLayout).m4722();
        this.f891 = context2.getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f893 = typedArray.getDimensionPixelOffset(9, 0);
        this.f895 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f896 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f894 = this.f895;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        C2737 c2737M4728 = this.f889.m4728();
        if (dimension >= 0.0f) {
            c2737M4728.f8790 = new C0060(dimension);
        }
        if (dimension2 >= 0.0f) {
            c2737M4728.f8791 = new C0060(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c2737M4728.f8792 = new C0060(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c2737M4728.f8793 = new C0060(dimension4);
        }
        this.f889 = c2737M4728.m4722();
        ColorStateList colorStateListM3387 = AbstractC1471.m3387(context2, c0253M4264, 7);
        if (colorStateListM3387 != null) {
            int defaultColor = colorStateListM3387.getDefaultColor();
            this.f915 = defaultColor;
            this.f898 = defaultColor;
            if (colorStateListM3387.isStateful()) {
                this.f916 = colorStateListM3387.getColorForState(new int[]{-16842910}, -1);
                this.f917 = colorStateListM3387.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f918 = colorStateListM3387.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f917 = this.f915;
                ColorStateList colorStateListM3333 = AbstractC1469.m3333(context2, me.hd.wauxv.R.color.mtrl_filled_background_color);
                this.f916 = colorStateListM3333.getColorForState(new int[]{-16842910}, -1);
                this.f918 = colorStateListM3333.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f898 = 0;
            this.f915 = 0;
            this.f916 = 0;
            this.f917 = 0;
            this.f918 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListM1465 = c0253M4264.m1465(1);
            this.f910 = colorStateListM1465;
            this.f909 = colorStateListM1465;
        }
        ColorStateList colorStateListM3388 = AbstractC1471.m3387(context2, c0253M4264, 14);
        this.f913 = typedArray.getColor(14, 0);
        this.f911 = context2.getColor(me.hd.wauxv.R.color.mtrl_textinput_default_box_stroke_color);
        this.f919 = context2.getColor(me.hd.wauxv.R.color.mtrl_textinput_disabled_color);
        this.f912 = context2.getColor(me.hd.wauxv.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM3388 != null) {
            setBoxStrokeColorStateList(colorStateListM3388);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC1471.m3387(context2, c0253M4264, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.f878 = c0253M4264.m1465(24);
        this.f879 = c0253M4264.m1465(25);
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
        this.f868 = typedArray.getResourceId(22, 0);
        this.f867 = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f867);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f868);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(c0253M4264.m1465(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(c0253M4264.m1465(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(c0253M4264.m1465(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(c0253M4264.m1465(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(c0253M4264.m1465(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(c0253M4264.m1465(58));
        }
        C1213 c1213 = new C1213(this, c0253M4264);
        this.f854 = c1213;
        boolean z4 = typedArray.getBoolean(0, true);
        c0253M4264.m1475();
        setImportantForAccessibility(2);
        AbstractC3633.m5161(this, 1);
        frameLayout.addView(c2870);
        frameLayout.addView(c1213);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f855;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f883;
        }
        int iM3363 = AbstractC1470.m3363(this.f855, me.hd.wauxv.R.attr.colorControlHighlight);
        int i = this.f892;
        int[][] iArr = f851;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C1948 c1948 = this.f883;
            int i2 = this.f898;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC1470.m3368(iM3363, i2, 0.1f), i2}), c1948, c1948);
        }
        Context context = getContext();
        C1948 c1949 = this.f883;
        TypedValue typedValueM3347 = AbstractC1469.m3347(context, me.hd.wauxv.R.attr.colorSurface, "TextInputLayout");
        int i3 = typedValueM3347.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : typedValueM3347.data;
        C1948 c19410 = new C1948(c1949.f6437.f6419);
        int iM3368 = AbstractC1470.m3368(iM3363, color, 0.1f);
        c19410.m3914(new ColorStateList(iArr, new int[]{iM3368, 0}));
        c19410.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM3368, color});
        C1948 c19411 = new C1948(c1949.f6437.f6419);
        c19411.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c19410, c19411), c1949});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f885 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f885 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f885.addState(new int[0], m842(false));
        }
        return this.f885;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f884 == null) {
            this.f884 = m842(true);
        }
        return this.f884;
    }

    private void setEditText(EditText editText) {
        if (this.f855 != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f855 = editText;
        int i = this.f857;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f859);
        }
        int i2 = this.f858;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f860);
        }
        this.f886 = false;
        m845();
        setTextInputAccessibilityDelegate(new C2968(this));
        Typeface typeface = this.f855.getTypeface();
        C0733 c0733 = this.f922;
        c0733.m2262(typeface);
        float textSize = this.f855.getTextSize();
        if (c0733.f2774 != textSize) {
            c0733.f2774 = textSize;
            c0733.m2257(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f855.getLetterSpacing();
        if (c0733.f2815 != letterSpacing) {
            c0733.f2815 = letterSpacing;
            c0733.m2257(false);
        }
        int gravity = this.f855.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (c0733.f2773 != i4) {
            c0733.f2773 = i4;
            c0733.m2257(false);
        }
        if (c0733.f2772 != gravity) {
            c0733.f2772 = gravity;
            c0733.m2257(false);
        }
        Field field = AbstractC3638.f11333;
        this.f920 = editText.getMinimumHeight();
        this.f855.addTextChangedListener(new C2967(this, editText));
        if (this.f909 == null) {
            this.f909 = this.f855.getHintTextColors();
        }
        if (this.f880) {
            if (TextUtils.isEmpty(this.f881)) {
                CharSequence hint = this.f855.getHint();
                this.f856 = hint;
                setHint(hint);
                this.f855.setHint((CharSequence) null);
            }
            this.f882 = true;
        }
        if (i3 >= 29) {
            m851();
        }
        if (this.f866 != null) {
            m849(this.f855.getText());
        }
        m853();
        this.f861.m3513();
        this.f853.bringToFront();
        C1213 c1213 = this.f854;
        c1213.bringToFront();
        Iterator it = this.f905.iterator();
        while (it.hasNext()) {
            ((C1212) it.next()).m2935(this);
        }
        c1213.m2948();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m856(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f881)) {
            return;
        }
        this.f881 = charSequence;
        C0733 c0733 = this.f922;
        if (charSequence == null || !TextUtils.equals(c0733.f2793, charSequence)) {
            c0733.f2793 = charSequence;
            c0733.f2794 = null;
            Bitmap bitmap = c0733.f2797;
            if (bitmap != null) {
                bitmap.recycle();
                c0733.f2797 = null;
            }
            c0733.m2257(false);
        }
        if (this.f921) {
            return;
        }
        m846();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f870 == z) {
            return;
        }
        if (z) {
            C0246 c0246 = this.f871;
            if (c0246 != null) {
                this.f852.addView(c0246);
                this.f871.setVisibility(0);
            }
        } else {
            C0246 c0247 = this.f871;
            if (c0247 != null) {
                c0247.setVisibility(8);
            }
            this.f871 = null;
        }
        this.f870 = z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static void m836(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m836((ViewGroup) childAt, z);
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
        FrameLayout frameLayout = this.f852;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m855();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f855;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f856 != null) {
            boolean z = this.f882;
            this.f882 = false;
            CharSequence hint = editText.getHint();
            this.f855.setHint(this.f856);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f855.setHint(hint);
                this.f882 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f852;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f855) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f927 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f927 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C1948 c1948;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.f880;
        C0733 c0733 = this.f922;
        if (z) {
            TextPaint textPaint = c0733.f2806;
            RectF rectF = c0733.f2771;
            int iSave = canvas2.save();
            if (c0733.f2794 != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c0733.f2799);
                float f = c0733.f2782;
                float f2 = c0733.f2783;
                float f3 = c0733.f2798;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if (c0733.f2822 <= 1 || c0733.f2795) {
                    canvas2.translate(f, f2);
                    c0733.f2817.draw(canvas2);
                } else {
                    float lineStart = c0733.f2782 - c0733.f2817.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (c0733.f2820 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = c0733.f2800;
                        float f6 = c0733.f2801;
                        float f7 = c0733.f2802;
                        int i2 = c0733.f2803;
                        textPaint.setShadowLayer(f5, f6, f7, AbstractC0747.m2326(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    c0733.f2817.draw(canvas2);
                    textPaint.setAlpha((int) (c0733.f2819 * f4));
                    if (i >= 31) {
                        float f8 = c0733.f2800;
                        float f9 = c0733.f2801;
                        float f10 = c0733.f2802;
                        int i3 = c0733.f2803;
                        textPaint.setShadowLayer(f8, f9, f10, AbstractC0747.m2326(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = c0733.f2817.getLineBaseline(0);
                    CharSequence charSequence = c0733.f2821;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c0733.f2800, c0733.f2801, c0733.f2802, c0733.f2803);
                    }
                    String strTrim = c0733.f2821.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = AbstractC2844.m4778(1, 0, strTrim);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(c0733.f2817.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f888 == null || (c1948 = this.f887) == null) {
            return;
        }
        c1948.draw(canvas2);
        if (this.f855.isFocused()) {
            Rect bounds = this.f888.getBounds();
            Rect bounds2 = this.f887.getBounds();
            float f12 = c0733.f2768;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC0172.m1359(iCenterX, bounds2.left, f12);
            bounds.right = AbstractC0172.m1359(iCenterX, bounds2.right, f12);
            this.f888.draw(canvas2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.f926) {
            return;
        }
        this.f926 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0733 c0733 = this.f922;
        if (c0733 != null) {
            c0733.f2804 = drawableState;
            ColorStateList colorStateList2 = c0733.f2777;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c0733.f2776) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                c0733.m2257(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.f855 != null) {
            Field field = AbstractC3638.f11333;
            m856(isLaidOut() && isEnabled(), false);
        }
        m853();
        m859();
        if (z) {
            invalidate();
        }
        this.f926 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f855;
        if (editText == null) {
            return super.getBaseline();
        }
        return m839() + getPaddingTop() + editText.getBaseline();
    }

    public C1948 getBoxBackground() {
        int i = this.f892;
        if (i == 1 || i == 2) {
            return this.f883;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f898;
    }

    public int getBoxBackgroundMode() {
        return this.f892;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f893;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zM3399 = AbstractC1471.m3399(this);
        RectF rectF = this.f901;
        return zM3399 ? this.f889.f8805.mo1060(rectF) : this.f889.f8804.mo1060(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM3399 = AbstractC1471.m3399(this);
        RectF rectF = this.f901;
        return zM3399 ? this.f889.f8804.mo1060(rectF) : this.f889.f8805.mo1060(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM3399 = AbstractC1471.m3399(this);
        RectF rectF = this.f901;
        return zM3399 ? this.f889.f8802.mo1060(rectF) : this.f889.f8803.mo1060(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM3399 = AbstractC1471.m3399(this);
        RectF rectF = this.f901;
        return zM3399 ? this.f889.f8803.mo1060(rectF) : this.f889.f8802.mo1060(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f913;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f914;
    }

    public int getBoxStrokeWidth() {
        return this.f895;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f896;
    }

    public int getCounterMaxLength() {
        return this.f863;
    }

    public CharSequence getCounterOverflowDescription() {
        C0246 c0246;
        if (this.f862 && this.f864 && (c0246 = this.f866) != null) {
            return c0246.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f877;
    }

    public ColorStateList getCounterTextColor() {
        return this.f876;
    }

    public ColorStateList getCursorColor() {
        return this.f878;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f879;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f909;
    }

    public EditText getEditText() {
        return this.f855;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f854.f4354.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f854.f4354.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f854.f4360;
    }

    public int getEndIconMode() {
        return this.f854.f4356;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f854.f4361;
    }

    public CheckableImageButton getEndIconView() {
        return this.f854.f4354;
    }

    public CharSequence getError() {
        C1646 c1646 = this.f861;
        if (c1646.f5566) {
            return c1646.f5565;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f861.f5569;
    }

    public CharSequence getErrorContentDescription() {
        return this.f861.f5568;
    }

    public int getErrorCurrentTextColors() {
        C0246 c0246 = this.f861.f5567;
        if (c0246 != null) {
            return c0246.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f854.f4350.getDrawable();
    }

    public CharSequence getHelperText() {
        C1646 c1646 = this.f861;
        if (c1646.f5573) {
            return c1646.f5572;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0246 c0246 = this.f861.f5574;
        if (c0246 != null) {
            return c0246.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f880) {
            return this.f881;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f922.m2254();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0733 c0733 = this.f922;
        return c0733.m2255(c0733.f2777);
    }

    public ColorStateList getHintTextColor() {
        return this.f910;
    }

    public InterfaceC2969 getLengthCounter() {
        return this.f865;
    }

    public int getMaxEms() {
        return this.f858;
    }

    public int getMaxWidth() {
        return this.f860;
    }

    public int getMinEms() {
        return this.f857;
    }

    public int getMinWidth() {
        return this.f859;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f854.f4354.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f854.f4354.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f870) {
            return this.f869;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f873;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f872;
    }

    public CharSequence getPrefixText() {
        return this.f853.f9164;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f853.f9163.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f853.f9163;
    }

    public C2738 getShapeAppearanceModel() {
        return this.f889;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f853.f9165.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f853.f9165.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f853.f9168;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f853.f9169;
    }

    public CharSequence getSuffixText() {
        return this.f854.f4363;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f854.f4364.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f854.f4364;
    }

    public Typeface getTypeface() {
        return this.f902;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f922.m2256(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C1213 c1213 = this.f854;
        c1213.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f928 = false;
        if (this.f855 != null && this.f855.getMeasuredHeight() < (iMax = Math.max(c1213.getMeasuredHeight(), this.f853.getMeasuredHeight()))) {
            this.f855.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM852 = m852();
        if (z || zM852) {
            this.f855.post(new RunnableC0541(this, 8));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f855;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC1018.f3720;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f899;
            rect.set(0, 0, width, height);
            AbstractC1018.m2714(this, editText, rect);
            C1948 c1948 = this.f887;
            if (c1948 != null) {
                int i5 = rect.bottom;
                c1948.setBounds(rect.left, i5 - this.f895, rect.right, i5);
            }
            C1948 c1949 = this.f888;
            if (c1949 != null) {
                int i6 = rect.bottom;
                c1949.setBounds(rect.left, i6 - this.f896, rect.right, i6);
            }
            if (this.f880) {
                float textSize = this.f855.getTextSize();
                C0733 c0733 = this.f922;
                if (c0733.f2774 != textSize) {
                    c0733.f2774 = textSize;
                    c0733.m2257(false);
                }
                int gravity = this.f855.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c0733.f2773 != i7) {
                    c0733.f2773 = i7;
                    c0733.m2257(false);
                }
                if (c0733.f2772 != gravity) {
                    c0733.f2772 = gravity;
                    c0733.m2257(false);
                }
                if (this.f855 == null) {
                    throw new IllegalStateException();
                }
                boolean zM3399 = AbstractC1471.m3399(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f900;
                rect2.bottom = i8;
                int i9 = this.f892;
                if (i9 == 1) {
                    rect2.left = m843(rect.left, zM3399);
                    rect2.top = rect.top + this.f893;
                    rect2.right = m844(rect.right, zM3399);
                } else if (i9 != 2) {
                    rect2.left = m843(rect.left, zM3399);
                    rect2.top = getPaddingTop();
                    rect2.right = m844(rect.right, zM3399);
                } else {
                    rect2.left = this.f855.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m839();
                    rect2.right = rect.right - this.f855.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = c0733.f2770;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    c0733.f2805 = true;
                }
                if (this.f855 == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0733.f2807;
                textPaint.setTextSize(c0733.f2774);
                textPaint.setTypeface(c0733.f2787);
                textPaint.setLetterSpacing(c0733.f2815);
                float f = -textPaint.ascent();
                rect2.left = this.f855.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f892 != 1 || this.f855.getMinLines() > 1) ? rect.top + this.f855.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f855.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f892 != 1 || this.f855.getMinLines() > 1) ? rect.bottom - this.f855.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = c0733.f2769;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    c0733.f2805 = true;
                }
                c0733.m2257(false);
                if (!m841() || this.f921) {
                    return;
                }
                m846();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f928;
        C1213 c1213 = this.f854;
        if (!z) {
            c1213.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f928 = true;
        }
        if (this.f871 != null && (editText = this.f855) != null) {
            this.f871.setGravity(editText.getGravity());
            this.f871.setPadding(this.f855.getCompoundPaddingLeft(), this.f855.getCompoundPaddingTop(), this.f855.getCompoundPaddingRight(), this.f855.getCompoundPaddingBottom());
        }
        c1213.m2948();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2970)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2970 c2970 = (C2970) parcelable;
        super.onRestoreInstanceState(c2970.f1051);
        setError(c2970.f9527);
        if (c2970.f9528) {
            post(new RunnableC0149(this, 16));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f890) {
            InterfaceC0873 interfaceC0873 = this.f889.f8802;
            RectF rectF = this.f901;
            float fMo1060 = interfaceC0873.mo1060(rectF);
            float fMo1061 = this.f889.f8803.mo1060(rectF);
            float fMo1062 = this.f889.f8805.mo1060(rectF);
            float fMo1063 = this.f889.f8804.mo1060(rectF);
            C2738 c2738 = this.f889;
            AbstractC1471 abstractC1471 = c2738.f8798;
            AbstractC1471 abstractC1472 = c2738.f8799;
            AbstractC1471 abstractC1473 = c2738.f8801;
            AbstractC1471 abstractC1474 = c2738.f8800;
            C1139 c1139 = new C1139();
            C1139 c11310 = new C1139();
            C1139 c11311 = new C1139();
            C1139 c11312 = new C1139();
            C0060 c0060 = new C0060(fMo1061);
            C0060 c0061 = new C0060(fMo1060);
            C0060 c0062 = new C0060(fMo1063);
            C0060 c0063 = new C0060(fMo1062);
            C2738 c2739 = new C2738();
            c2739.f8798 = abstractC1472;
            c2739.f8799 = abstractC1471;
            c2739.f8800 = abstractC1473;
            c2739.f8801 = abstractC1474;
            c2739.f8802 = c0060;
            c2739.f8803 = c0061;
            c2739.f8804 = c0063;
            c2739.f8805 = c0062;
            c2739.f8806 = c1139;
            c2739.f8807 = c11310;
            c2739.f8808 = c11311;
            c2739.f8809 = c11312;
            this.f890 = z;
            setShapeAppearanceModel(c2739);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2970 c2970 = new C2970(super.onSaveInstanceState());
        if (m848()) {
            c2970.f9527 = getError();
        }
        C1213 c1213 = this.f854;
        c2970.f9528 = c1213.f4356 != 0 && c1213.f4354.f790;
        return c2970;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f898 != i) {
            this.f898 = i;
            this.f915 = i;
            this.f917 = i;
            this.f918 = i;
            m838();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f915 = defaultColor;
        this.f898 = defaultColor;
        this.f916 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f917 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f918 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m838();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f892) {
            return;
        }
        this.f892 = i;
        if (this.f855 != null) {
            m845();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f893 = i;
    }

    public void setBoxCornerFamily(int i) {
        C2737 c2737M4728 = this.f889.m4728();
        InterfaceC0873 interfaceC0873 = this.f889.f8802;
        c2737M4728.f8786 = AbstractC1586.m3474(i);
        c2737M4728.f8790 = interfaceC0873;
        InterfaceC0873 interfaceC0874 = this.f889.f8803;
        c2737M4728.f8787 = AbstractC1586.m3474(i);
        c2737M4728.f8791 = interfaceC0874;
        InterfaceC0873 interfaceC0875 = this.f889.f8805;
        c2737M4728.f8789 = AbstractC1586.m3474(i);
        c2737M4728.f8793 = interfaceC0875;
        InterfaceC0873 interfaceC0876 = this.f889.f8804;
        c2737M4728.f8788 = AbstractC1586.m3474(i);
        c2737M4728.f8792 = interfaceC0876;
        this.f889 = c2737M4728.m4722();
        m838();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f913 != i) {
            this.f913 = i;
            m859();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f911 = colorStateList.getDefaultColor();
            this.f919 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f912 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f913 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f913 != colorStateList.getDefaultColor()) {
            this.f913 = colorStateList.getDefaultColor();
        }
        m859();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f914 != colorStateList) {
            this.f914 = colorStateList;
            m859();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f895 = i;
        m859();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f896 = i;
        m859();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f862 != z) {
            C1646 c1646 = this.f861;
            if (z) {
                C0246 c0246 = new C0246(getContext(), null);
                this.f866 = c0246;
                c0246.setId(me.hd.wauxv.R.id.textinput_counter);
                Typeface typeface = this.f902;
                if (typeface != null) {
                    this.f866.setTypeface(typeface);
                }
                this.f866.setMaxLines(1);
                c1646.m3512(this.f866, 2);
                ((ViewGroup.MarginLayoutParams) this.f866.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.mtrl_textinput_counter_margin_start));
                m850();
                if (this.f866 != null) {
                    EditText editText = this.f855;
                    m849(editText != null ? editText.getText() : null);
                }
            } else {
                c1646.m3518(this.f866, 2);
                this.f866 = null;
            }
            this.f862 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f863 != i) {
            if (i > 0) {
                this.f863 = i;
            } else {
                this.f863 = -1;
            }
            if (!this.f862 || this.f866 == null) {
                return;
            }
            EditText editText = this.f855;
            m849(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f867 != i) {
            this.f867 = i;
            m850();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f877 != colorStateList) {
            this.f877 = colorStateList;
            m850();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f868 != i) {
            this.f868 = i;
            m850();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f876 != colorStateList) {
            this.f876 = colorStateList;
            m850();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f878 != colorStateList) {
            this.f878 = colorStateList;
            m851();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f879 != colorStateList) {
            this.f879 = colorStateList;
            if (m848() || (this.f866 != null && this.f864)) {
                m851();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f909 = colorStateList;
        this.f910 = colorStateList;
        if (this.f855 != null) {
            m856(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m836(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f854.f4354.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f854.f4354.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C1213 c1213 = this.f854;
        CharSequence text = i != 0 ? c1213.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c1213.f4354;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C1213 c1213 = this.f854;
        Drawable drawableM3667 = i != 0 ? C1787.m3667(c1213.getContext(), i) : null;
        TextInputLayout textInputLayout = c1213.f4348;
        CheckableImageButton checkableImageButton = c1213.f4354;
        checkableImageButton.setImageDrawable(drawableM3667);
        if (drawableM3667 != null) {
            AbstractC3744.m5323(textInputLayout, checkableImageButton, c1213.f4358, c1213.f4359);
            AbstractC3744.m5340(textInputLayout, checkableImageButton, c1213.f4358);
        }
    }

    public void setEndIconMinSize(int i) {
        C1213 c1213 = this.f854;
        if (i < 0) {
            c1213.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c1213.f4360) {
            c1213.f4360 = i;
            CheckableImageButton checkableImageButton = c1213.f4354;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c1213.f4350;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f854.m2942(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C1213 c1213 = this.f854;
        CheckableImageButton checkableImageButton = c1213.f4354;
        View.OnLongClickListener onLongClickListener = c1213.f4362;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC3744.m5346(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C1213 c1213 = this.f854;
        c1213.f4362 = onLongClickListener;
        CheckableImageButton checkableImageButton = c1213.f4354;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC3744.m5346(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C1213 c1213 = this.f854;
        c1213.f4361 = scaleType;
        c1213.f4354.setScaleType(scaleType);
        c1213.f4350.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C1213 c1213 = this.f854;
        if (c1213.f4358 != colorStateList) {
            c1213.f4358 = colorStateList;
            AbstractC3744.m5323(c1213.f4348, c1213.f4354, colorStateList, c1213.f4359);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C1213 c1213 = this.f854;
        if (c1213.f4359 != mode) {
            c1213.f4359 = mode;
            AbstractC3744.m5323(c1213.f4348, c1213.f4354, c1213.f4358, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f854.m2943(z);
    }

    public void setError(CharSequence charSequence) {
        C1646 c1646 = this.f861;
        if (!c1646.f5566) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c1646.m3517();
            return;
        }
        c1646.m3514();
        c1646.f5565 = charSequence;
        c1646.f5567.setText(charSequence);
        int i = c1646.f5563;
        if (i != 1) {
            c1646.f5564 = 1;
        }
        c1646.m3520(i, c1646.f5564, c1646.m3519(c1646.f5567, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C1646 c1646 = this.f861;
        c1646.f5569 = i;
        C0246 c0246 = c1646.f5567;
        if (c0246 != null) {
            Field field = AbstractC3638.f11333;
            c0246.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C1646 c1646 = this.f861;
        c1646.f5568 = charSequence;
        C0246 c0246 = c1646.f5567;
        if (c0246 != null) {
            c0246.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C1646 c1646 = this.f861;
        TextInputLayout textInputLayout = c1646.f5557;
        if (c1646.f5566 == z) {
            return;
        }
        c1646.m3514();
        if (z) {
            C0246 c0246 = new C0246(c1646.f5556, null);
            c1646.f5567 = c0246;
            c0246.setId(me.hd.wauxv.R.id.textinput_error);
            c1646.f5567.setTextAlignment(5);
            Typeface typeface = c1646.f5577;
            if (typeface != null) {
                c1646.f5567.setTypeface(typeface);
            }
            int i = c1646.f5570;
            c1646.f5570 = i;
            C0246 c0247 = c1646.f5567;
            if (c0247 != null) {
                c1646.f5557.m847(c0247, i);
            }
            ColorStateList colorStateList = c1646.f5571;
            c1646.f5571 = colorStateList;
            C0246 c0248 = c1646.f5567;
            if (c0248 != null && colorStateList != null) {
                c0248.setTextColor(colorStateList);
            }
            CharSequence charSequence = c1646.f5568;
            c1646.f5568 = charSequence;
            C0246 c0249 = c1646.f5567;
            if (c0249 != null) {
                c0249.setContentDescription(charSequence);
            }
            int i2 = c1646.f5569;
            c1646.f5569 = i2;
            C0246 c02410 = c1646.f5567;
            if (c02410 != null) {
                Field field = AbstractC3638.f11333;
                c02410.setAccessibilityLiveRegion(i2);
            }
            c1646.f5567.setVisibility(4);
            c1646.m3512(c1646.f5567, 0);
        } else {
            c1646.m3517();
            c1646.m3518(c1646.f5567, 0);
            c1646.f5567 = null;
            textInputLayout.m853();
            textInputLayout.m859();
        }
        c1646.f5566 = z;
    }

    public void setErrorIconDrawable(int i) {
        C1213 c1213 = this.f854;
        c1213.m2944(i != 0 ? C1787.m3667(c1213.getContext(), i) : null);
        AbstractC3744.m5340(c1213.f4348, c1213.f4350, c1213.f4351);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C1213 c1213 = this.f854;
        CheckableImageButton checkableImageButton = c1213.f4350;
        View.OnLongClickListener onLongClickListener = c1213.f4353;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC3744.m5346(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C1213 c1213 = this.f854;
        c1213.f4353 = onLongClickListener;
        CheckableImageButton checkableImageButton = c1213.f4350;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC3744.m5346(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C1213 c1213 = this.f854;
        if (c1213.f4351 != colorStateList) {
            c1213.f4351 = colorStateList;
            AbstractC3744.m5323(c1213.f4348, c1213.f4350, colorStateList, c1213.f4352);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C1213 c1213 = this.f854;
        if (c1213.f4352 != mode) {
            c1213.f4352 = mode;
            AbstractC3744.m5323(c1213.f4348, c1213.f4350, c1213.f4351, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C1646 c1646 = this.f861;
        c1646.f5570 = i;
        C0246 c0246 = c1646.f5567;
        if (c0246 != null) {
            c1646.f5557.m847(c0246, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C1646 c1646 = this.f861;
        c1646.f5571 = colorStateList;
        C0246 c0246 = c1646.f5567;
        if (c0246 == null || colorStateList == null) {
            return;
        }
        c0246.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f923 != z) {
            this.f923 = z;
            m856(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C1646 c1646 = this.f861;
        if (zIsEmpty) {
            if (c1646.f5573) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c1646.f5573) {
            setHelperTextEnabled(true);
        }
        c1646.m3514();
        c1646.f5572 = charSequence;
        c1646.f5574.setText(charSequence);
        int i = c1646.f5563;
        if (i != 2) {
            c1646.f5564 = 2;
        }
        c1646.m3520(i, c1646.f5564, c1646.m3519(c1646.f5574, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C1646 c1646 = this.f861;
        c1646.f5576 = colorStateList;
        C0246 c0246 = c1646.f5574;
        if (c0246 == null || colorStateList == null) {
            return;
        }
        c0246.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C1646 c1646 = this.f861;
        TextInputLayout textInputLayout = c1646.f5557;
        if (c1646.f5573 == z) {
            return;
        }
        c1646.m3514();
        if (z) {
            C0246 c0246 = new C0246(c1646.f5556, null);
            c1646.f5574 = c0246;
            c0246.setId(me.hd.wauxv.R.id.textinput_helper_text);
            c1646.f5574.setTextAlignment(5);
            Typeface typeface = c1646.f5577;
            if (typeface != null) {
                c1646.f5574.setTypeface(typeface);
            }
            c1646.f5574.setVisibility(4);
            c1646.f5574.setAccessibilityLiveRegion(1);
            int i = c1646.f5575;
            c1646.f5575 = i;
            C0246 c0247 = c1646.f5574;
            if (c0247 != null) {
                c0247.setTextAppearance(i);
            }
            ColorStateList colorStateList = c1646.f5576;
            c1646.f5576 = colorStateList;
            C0246 c0248 = c1646.f5574;
            if (c0248 != null && colorStateList != null) {
                c0248.setTextColor(colorStateList);
            }
            c1646.m3512(c1646.f5574, 1);
            c1646.f5574.setAccessibilityDelegate(new C1645(c1646));
        } else {
            c1646.m3514();
            int i2 = c1646.f5563;
            if (i2 == 2) {
                c1646.f5564 = 0;
            }
            c1646.m3520(i2, c1646.f5564, c1646.m3519(c1646.f5574, ""));
            c1646.m3518(c1646.f5574, 1);
            c1646.f5574 = null;
            textInputLayout.m853();
            textInputLayout.m859();
        }
        c1646.f5573 = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C1646 c1646 = this.f861;
        c1646.f5575 = i;
        C0246 c0246 = c1646.f5574;
        if (c0246 != null) {
            c0246.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f880) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f924 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f880) {
            this.f880 = z;
            if (z) {
                CharSequence hint = this.f855.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f881)) {
                        setHint(hint);
                    }
                    this.f855.setHint((CharSequence) null);
                }
                this.f882 = true;
            } else {
                this.f882 = false;
                if (!TextUtils.isEmpty(this.f881) && TextUtils.isEmpty(this.f855.getHint())) {
                    this.f855.setHint(this.f881);
                }
                setHintInternal(null);
            }
            if (this.f855 != null) {
                m855();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C0733 c0733 = this.f922;
        TextInputLayout textInputLayout = c0733.f2767;
        C2963 c2963 = new C2963(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c2963.f9507;
        if (colorStateList != null) {
            c0733.f2777 = colorStateList;
        }
        float f = c2963.f9508;
        if (f != 0.0f) {
            c0733.f2775 = f;
        }
        ColorStateList colorStateList2 = c2963.f9498;
        if (colorStateList2 != null) {
            c0733.f2813 = colorStateList2;
        }
        c0733.f2811 = c2963.f9502;
        c0733.f2812 = c2963.f9503;
        c0733.f2810 = c2963.f9504;
        c0733.f2814 = c2963.f9506;
        C0533 c0533 = c0733.f2791;
        if (c0533 != null) {
            c0533.f2239 = true;
        }
        C0102 c0102 = new C0102(c0733, 8);
        c2963.m4968();
        c0733.f2791 = new C0533(c0102, c2963.f9511);
        c2963.m4970(textInputLayout.getContext(), c0733.f2791);
        c0733.m2257(false);
        this.f910 = c0733.f2777;
        if (this.f855 != null) {
            m856(false, false);
            m855();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f910 != colorStateList) {
            if (this.f909 == null) {
                C0733 c0733 = this.f922;
                if (c0733.f2777 != colorStateList) {
                    c0733.f2777 = colorStateList;
                    c0733.m2257(false);
                }
            }
            this.f910 = colorStateList;
            if (this.f855 != null) {
                m856(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC2969 interfaceC2969) {
        this.f865 = interfaceC2969;
    }

    public void setMaxEms(int i) {
        this.f858 = i;
        EditText editText = this.f855;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f860 = i;
        EditText editText = this.f855;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f857 = i;
        EditText editText = this.f855;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f859 = i;
        EditText editText = this.f855;
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
        C1213 c1213 = this.f854;
        c1213.f4354.setContentDescription(i != 0 ? c1213.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C1213 c1213 = this.f854;
        c1213.f4354.setImageDrawable(i != 0 ? C1787.m3667(c1213.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C1213 c1213 = this.f854;
        if (z && c1213.f4356 != 1) {
            c1213.m2942(1);
        } else if (z) {
            c1213.getClass();
        } else {
            c1213.m2942(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C1213 c1213 = this.f854;
        c1213.f4358 = colorStateList;
        AbstractC3744.m5323(c1213.f4348, c1213.f4354, colorStateList, c1213.f4359);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C1213 c1213 = this.f854;
        c1213.f4359 = mode;
        AbstractC3744.m5323(c1213.f4348, c1213.f4354, c1213.f4358, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f871 == null) {
            C0246 c0246 = new C0246(getContext(), null);
            this.f871 = c0246;
            c0246.setId(me.hd.wauxv.R.id.textinput_placeholder);
            this.f871.setImportantForAccessibility(2);
            C1266 c1266M840 = m840();
            this.f874 = c1266M840;
            c1266M840.f10981 = 67L;
            this.f875 = m840();
            setPlaceholderTextAppearance(this.f873);
            setPlaceholderTextColor(this.f872);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f870) {
                setPlaceholderTextEnabled(true);
            }
            this.f869 = charSequence;
        }
        EditText editText = this.f855;
        m857(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f873 = i;
        C0246 c0246 = this.f871;
        if (c0246 != null) {
            c0246.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f872 != colorStateList) {
            this.f872 = colorStateList;
            C0246 c0246 = this.f871;
            if (c0246 == null || colorStateList == null) {
                return;
            }
            c0246.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C2870 c2870 = this.f853;
        c2870.getClass();
        c2870.f9164 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c2870.f9163.setText(charSequence);
        c2870.m4823();
    }

    public void setPrefixTextAppearance(int i) {
        this.f853.f9163.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f853.f9163.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C2738 c2738) {
        C1948 c1948 = this.f883;
        if (c1948 == null || c1948.f6437.f6419 == c2738) {
            return;
        }
        this.f889 = c2738;
        m838();
    }

    public void setStartIconCheckable(boolean z) {
        this.f853.f9165.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C1787.m3667(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C2870 c2870 = this.f853;
        if (i < 0) {
            c2870.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != c2870.f9168) {
            c2870.f9168 = i;
            CheckableImageButton checkableImageButton = c2870.f9165;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C2870 c2870 = this.f853;
        CheckableImageButton checkableImageButton = c2870.f9165;
        View.OnLongClickListener onLongClickListener = c2870.f9170;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC3744.m5346(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C2870 c2870 = this.f853;
        c2870.f9170 = onLongClickListener;
        CheckableImageButton checkableImageButton = c2870.f9165;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC3744.m5346(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C2870 c2870 = this.f853;
        c2870.f9169 = scaleType;
        c2870.f9165.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C2870 c2870 = this.f853;
        if (c2870.f9166 != colorStateList) {
            c2870.f9166 = colorStateList;
            AbstractC3744.m5323(c2870.f9162, c2870.f9165, colorStateList, c2870.f9167);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C2870 c2870 = this.f853;
        if (c2870.f9167 != mode) {
            c2870.f9167 = mode;
            AbstractC3744.m5323(c2870.f9162, c2870.f9165, c2870.f9166, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f853.m4821(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C1213 c1213 = this.f854;
        c1213.getClass();
        c1213.f4363 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c1213.f4364.setText(charSequence);
        c1213.m2949();
    }

    public void setSuffixTextAppearance(int i) {
        this.f854.f4364.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f854.f4364.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C2968 c2968) {
        EditText editText = this.f855;
        if (editText != null) {
            AbstractC3638.m5183(editText, c2968);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f902) {
            this.f902 = typeface;
            this.f922.m2262(typeface);
            C1646 c1646 = this.f861;
            if (typeface != c1646.f5577) {
                c1646.f5577 = typeface;
                C0246 c0246 = c1646.f5567;
                if (c0246 != null) {
                    c0246.setTypeface(typeface);
                }
                C0246 c0247 = c1646.f5574;
                if (c0247 != null) {
                    c0247.setTypeface(typeface);
                }
            }
            C0246 c0248 = this.f866;
            if (c0248 != null) {
                c0248.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m837(float f) {
        C0733 c0733 = this.f922;
        if (c0733.f2768 == f) {
            return;
        }
        if (this.f925 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f925 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC3744.m5342(getContext(), me.hd.wauxv.R.attr.motionEasingEmphasizedInterpolator, AbstractC0172.f1254));
            this.f925.setDuration(AbstractC3744.m5341(getContext(), me.hd.wauxv.R.attr.motionDurationMedium4, Opcodes.GOTO));
            this.f925.addUpdateListener(new C0360(this, 5));
        }
        this.f925.setFloatValues(c0733.f2768, f);
        this.f925.start();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m838() {
        int i;
        int i2;
        C1948 c1948 = this.f883;
        if (c1948 == null) {
            return;
        }
        C2738 c2738 = c1948.f6437.f6419;
        C2738 c2739 = this.f889;
        if (c2738 != c2739) {
            c1948.setShapeAppearanceModel(c2739);
        }
        if (this.f892 == 2 && (i = this.f894) > -1 && (i2 = this.f897) != 0) {
            C1948 c1949 = this.f883;
            c1949.f6437.f6428 = i;
            c1949.invalidateSelf();
            c1949.m3918(ColorStateList.valueOf(i2));
        }
        int iM2324 = this.f898;
        if (this.f892 == 1) {
            iM2324 = AbstractC0747.m2324(this.f898, AbstractC1470.m3362(getContext(), me.hd.wauxv.R.attr.colorSurface, 0));
        }
        this.f898 = iM2324;
        this.f883.m3914(ColorStateList.valueOf(iM2324));
        C1948 c19410 = this.f887;
        if (c19410 != null && this.f888 != null) {
            if (this.f894 > -1 && this.f897 != 0) {
                c19410.m3914(this.f855.isFocused() ? ColorStateList.valueOf(this.f911) : ColorStateList.valueOf(this.f897));
                this.f888.m3914(ColorStateList.valueOf(this.f897));
            }
            invalidate();
        }
        m854();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int m839() {
        float fM2254;
        if (!this.f880) {
            return 0;
        }
        int i = this.f892;
        C0733 c0733 = this.f922;
        if (i == 0) {
            fM2254 = c0733.m2254();
        } else {
            if (i != 2) {
                return 0;
            }
            fM2254 = c0733.m2254() / 2.0f;
        }
        return (int) fM2254;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1266 m840() {
        C1266 c1266 = new C1266();
        c1266.f10982 = AbstractC3744.m5341(getContext(), me.hd.wauxv.R.attr.motionDurationShort2, 87);
        c1266.f10983 = AbstractC3744.m5342(getContext(), me.hd.wauxv.R.attr.motionEasingLinearInterpolator, AbstractC0172.f1253);
        return c1266;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean m841() {
        return this.f880 && !TextUtils.isEmpty(this.f881) && (this.f883 instanceof C0952);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1948 m842(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(me.hd.wauxv.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C2666 c2666 = new C2666();
        C2666 c2667 = new C2666();
        C2666 c2668 = new C2666();
        C2666 c2669 = new C2666();
        C1139 c1139 = new C1139();
        C1139 c11310 = new C1139();
        C1139 c11311 = new C1139();
        C1139 c11312 = new C1139();
        C0060 c0060 = new C0060(f);
        C0060 c0061 = new C0060(f);
        C0060 c0062 = new C0060(dimensionPixelOffset);
        C0060 c0063 = new C0060(dimensionPixelOffset);
        C2738 c2738 = new C2738();
        c2738.f8798 = c2666;
        c2738.f8799 = c2667;
        c2738.f8800 = c2668;
        c2738.f8801 = c2669;
        c2738.f8802 = c0060;
        c2738.f8803 = c0061;
        c2738.f8804 = c0063;
        c2738.f8805 = c0062;
        c2738.f8806 = c1139;
        c2738.f8807 = c11310;
        c2738.f8808 = c11311;
        c2738.f8809 = c11312;
        Context context = getContext();
        Paint paint = C1948.f6436;
        TypedValue typedValueM3347 = AbstractC1469.m3347(context, me.hd.wauxv.R.attr.colorSurface, C1948.class.getSimpleName());
        int i = typedValueM3347.resourceId;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i != 0 ? context.getColor(i) : typedValueM3347.data);
        C1948 c1948 = new C1948();
        c1948.m3912(context);
        c1948.m3914(colorStateListValueOf);
        c1948.m3913(dimensionPixelOffset2);
        c1948.setShapeAppearanceModel(c2738);
        C1947 c1947 = c1948.f6437;
        if (c1947.f6425 == null) {
            c1947.f6425 = new Rect();
        }
        c1948.f6437.f6425.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        c1948.invalidateSelf();
        return c1948;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int m843(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.f855.getCompoundPaddingLeft() : this.f854.m2938();
        } else {
            compoundPaddingLeft = this.f853.m4819();
        }
        return compoundPaddingLeft + i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int m844(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.f855.getCompoundPaddingRight() : this.f853.m4819();
        } else {
            compoundPaddingRight = this.f854.m2938();
        }
        return i - compoundPaddingRight;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m845() {
        int i = this.f892;
        if (i == 0) {
            this.f883 = null;
            this.f887 = null;
            this.f888 = null;
        } else if (i == 1) {
            this.f883 = new C1948(this.f889);
            this.f887 = new C1948();
            this.f888 = new C1948();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(AbstractC2844.m4785(new StringBuilder(), this.f892, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f880 || (this.f883 instanceof C0952)) {
                this.f883 = new C1948(this.f889);
            } else {
                C2738 c2738 = this.f889;
                int i2 = C0952.f3480;
                if (c2738 == null) {
                    c2738 = new C2738();
                }
                C0951 c0951 = new C0951(c2738, new RectF());
                C0952 c0952 = new C0952(c0951);
                c0952.f3481 = c0951;
                this.f883 = c0952;
            }
            this.f887 = null;
            this.f888 = null;
        }
        m854();
        m859();
        if (this.f892 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f893 = getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC1471.m3398(getContext())) {
                this.f893 = getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f855 != null && this.f892 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f855;
                Field field = AbstractC3638.f11333;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f855.getPaddingEnd(), getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC1471.m3398(getContext())) {
                EditText editText2 = this.f855;
                Field field2 = AbstractC3638.f11333;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f855.getPaddingEnd(), getResources().getDimensionPixelSize(me.hd.wauxv.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f892 != 0) {
            m855();
        }
        EditText editText3 = this.f855;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f892;
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
    public final void m846() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (m841()) {
            int width = this.f855.getWidth();
            int gravity = this.f855.getGravity();
            C0733 c0733 = this.f922;
            boolean zM2252 = c0733.m2252(c0733.f2793);
            c0733.f2795 = zM2252;
            Rect rect = c0733.f2770;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM2252) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = c0733.f2818;
                    }
                } else if (zM2252) {
                    f = rect.right;
                    f2 = c0733.f2818;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.f901;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (c0733.f2818 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c0733.f2795) {
                        f5 = c0733.f2818;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (c0733.f2795) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = c0733.f2818;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c0733.m2254() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f891;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f894);
                C0952 c0952 = (C0952) this.f883;
                c0952.getClass();
                c0952.m2559(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c0733.f2818 / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.f901;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (c0733.f2818 / 2.0f);
            } else {
                f4 = (width / 2.0f) + (c0733.f2818 / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c0733.m2254() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m847(C0246 c0246, int i) {
        try {
            c0246.setTextAppearance(i);
            if (c0246.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0246.setTextAppearance(me.hd.wauxv.R.style.TextAppearance_AppCompat_Caption);
        c0246.setTextColor(getContext().getColor(me.hd.wauxv.R.color.design_error));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final boolean m848() {
        C1646 c1646 = this.f861;
        return (c1646.f5564 != 1 || c1646.f5567 == null || TextUtils.isEmpty(c1646.f5565)) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m849(Editable editable) {
        ((C2425) this.f865).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f864;
        int i = this.f863;
        if (i == -1) {
            this.f866.setText(String.valueOf(length));
            this.f866.setContentDescription(null);
            this.f864 = false;
        } else {
            this.f864 = length > i;
            Context context = getContext();
            this.f866.setContentDescription(context.getString(this.f864 ? me.hd.wauxv.R.string.character_counter_overflowed_content_description : me.hd.wauxv.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f863)));
            if (z != this.f864) {
                m850();
            }
            String str = C0393.f1930;
            C0393 c0393 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0393.f1933 : C0393.f1932;
            C0246 c0246 = this.f866;
            String string = getContext().getString(me.hd.wauxv.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f863));
            c0393.getClass();
            C0427 c0427 = AbstractC2964.f9512;
            c0246.setText(string != null ? c0393.m1719(string).toString() : null);
        }
        if (this.f855 == null || z == this.f864) {
            return;
        }
        m856(false, false);
        m859();
        m853();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m850() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0246 c0246 = this.f866;
        if (c0246 != null) {
            m847(c0246, this.f864 ? this.f867 : this.f868);
            if (!this.f864 && (colorStateList2 = this.f876) != null) {
                this.f866.setTextColor(colorStateList2);
            }
            if (!this.f864 || (colorStateList = this.f877) == null) {
                return;
            }
            this.f866.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final void m851() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f878;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueM3345 = AbstractC1469.m3345(context, me.hd.wauxv.R.attr.colorControlActivated);
            if (typedValueM3345 != null) {
                int i = typedValueM3345.resourceId;
                if (i != 0) {
                    colorStateListValueOf = AbstractC1469.m3333(context, i);
                } else {
                    int i2 = typedValueM3345.data;
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
        EditText editText = this.f855;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f855.getTextCursorDrawable().mutate();
        if ((m848() || (this.f866 != null && this.f864)) && (colorStateList = this.f879) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final boolean m852() {
        boolean z;
        if (this.f855 == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C2870 c2870 = this.f853;
            if (c2870.getMeasuredWidth() > 0) {
                int measuredWidth = c2870.getMeasuredWidth() - this.f855.getPaddingLeft();
                if (this.f903 == null || this.f904 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f903 = colorDrawable;
                    this.f904 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f855.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f903;
                if (drawable != colorDrawable2) {
                    this.f855.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.f903 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f855.getCompoundDrawablesRelative();
                this.f855.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f903 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.f903 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f855.getCompoundDrawablesRelative();
            this.f855.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f903 = null;
            z = true;
        } else {
            z = false;
        }
        C1213 c1213 = this.f854;
        if ((c1213.m2940() || ((c1213.f4356 != 0 && c1213.m2939()) || c1213.f4363 != null)) && c1213.getMeasuredWidth() > 0) {
            int measuredWidth2 = c1213.f4364.getMeasuredWidth() - this.f855.getPaddingRight();
            if (c1213.m2940()) {
                checkableImageButton = c1213.f4350;
            } else if (c1213.f4356 != 0 && c1213.m2939()) {
                checkableImageButton = c1213.f4354;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f855.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f906;
            if (colorDrawable3 != null && this.f907 != measuredWidth2) {
                this.f907 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f855.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f906, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f906 = colorDrawable4;
                this.f907 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.f906;
            if (drawable2 != colorDrawable5) {
                this.f908 = drawable2;
                this.f855.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.f906 != null) {
            Drawable[] compoundDrawablesRelative5 = this.f855.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f906) {
                this.f855.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f908, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.f906 = null;
            return z2;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final void m853() {
        Drawable background;
        C0246 c0246;
        EditText editText = this.f855;
        if (editText == null || this.f892 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1111.f4145;
        Drawable drawableMutate = background.mutate();
        if (m848()) {
            drawableMutate.setColorFilter(C0226.m1395(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f864 && (c0246 = this.f866) != null) {
            drawableMutate.setColorFilter(C0226.m1395(c0246.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f855.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m854() {
        EditText editText = this.f855;
        if (editText == null || this.f883 == null) {
            return;
        }
        if ((this.f886 || editText.getBackground() == null) && this.f892 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f855;
            Field field = AbstractC3638.f11333;
            editText2.setBackground(editTextBoxBackground);
            this.f886 = true;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final void m855() {
        if (this.f892 != 1) {
            FrameLayout frameLayout = this.f852;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM839 = m839();
            if (iM839 != layoutParams.topMargin) {
                layoutParams.topMargin = iM839;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m856(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C0246 c0246;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f855;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f855;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f909;
        C0733 c0733 = this.f922;
        if (colorStateList2 != null) {
            c0733.m2258(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f909;
            c0733.m2258(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f919) : this.f919));
        } else if (m848()) {
            C0246 c0247 = this.f861.f5567;
            c0733.m2258(c0247 != null ? c0247.getTextColors() : null);
        } else if (this.f864 && (c0246 = this.f866) != null) {
            c0733.m2258(c0246.getTextColors());
        } else if (z4 && (colorStateList = this.f910) != null && c0733.f2777 != colorStateList) {
            c0733.f2777 = colorStateList;
            c0733.m2257(false);
        }
        C1213 c1213 = this.f854;
        C2870 c2870 = this.f853;
        if (z3 || !this.f923 || (isEnabled() && z4)) {
            if (z2 || this.f921) {
                ValueAnimator valueAnimator = this.f925;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f925.cancel();
                }
                if (z && this.f924) {
                    m837(1.0f);
                } else {
                    c0733.m2260(1.0f);
                }
                this.f921 = false;
                if (m841()) {
                    m846();
                }
                EditText editText3 = this.f855;
                m857(editText3 != null ? editText3.getText() : null);
                c2870.f9171 = false;
                c2870.m4823();
                c1213.f4365 = false;
                c1213.m2949();
                return;
            }
            return;
        }
        if (z2 || !this.f921) {
            ValueAnimator valueAnimator2 = this.f925;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f925.cancel();
            }
            if (z && this.f924) {
                m837(0.0f);
            } else {
                c0733.m2260(0.0f);
            }
            if (m841() && !((C0952) this.f883).f3481.f3479.isEmpty() && m841()) {
                ((C0952) this.f883).m2559(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f921 = true;
            C0246 c0248 = this.f871;
            if (c0248 != null && this.f870) {
                c0248.setText((CharSequence) null);
                AbstractC3497.m5020(this.f852, this.f875);
                this.f871.setVisibility(4);
            }
            c2870.f9171 = true;
            c2870.m4823();
            c1213.f4365 = true;
            c1213.m2949();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final void m857(Editable editable) {
        ((C2425) this.f865).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f852;
        if (length != 0 || this.f921) {
            C0246 c0246 = this.f871;
            if (c0246 == null || !this.f870) {
                return;
            }
            c0246.setText((CharSequence) null);
            AbstractC3497.m5020(frameLayout, this.f875);
            this.f871.setVisibility(4);
            return;
        }
        if (this.f871 == null || !this.f870 || TextUtils.isEmpty(this.f869)) {
            return;
        }
        this.f871.setText(this.f869);
        AbstractC3497.m5020(frameLayout, this.f874);
        this.f871.setVisibility(0);
        this.f871.bringToFront();
        announceForAccessibility(this.f869);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void m858(boolean z, boolean z2) {
        int defaultColor = this.f914.getDefaultColor();
        int colorForState = this.f914.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f914.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f897 = colorForState2;
        } else if (z2) {
            this.f897 = colorForState;
        } else {
            this.f897 = defaultColor;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m859() {
        C0246 c0246;
        EditText editText;
        EditText editText2;
        if (this.f883 == null || this.f892 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f855) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f855) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f897 = this.f919;
        } else if (m848()) {
            if (this.f914 != null) {
                m858(z2, z);
            } else {
                this.f897 = getErrorCurrentTextColors();
            }
        } else if (!this.f864 || (c0246 = this.f866) == null) {
            if (z2) {
                this.f897 = this.f913;
            } else if (z) {
                this.f897 = this.f912;
            } else {
                this.f897 = this.f911;
            }
        } else if (this.f914 != null) {
            m858(z2, z);
        } else {
            this.f897 = c0246.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m851();
        }
        C1213 c1213 = this.f854;
        TextInputLayout textInputLayout = c1213.f4348;
        CheckableImageButton checkableImageButton = c1213.f4354;
        TextInputLayout textInputLayout2 = c1213.f4348;
        c1213.m2947();
        AbstractC3744.m5340(textInputLayout2, c1213.f4350, c1213.f4351);
        AbstractC3744.m5340(textInputLayout2, checkableImageButton, c1213.f4358);
        if (c1213.m2937() instanceof C1124) {
            if (!textInputLayout.m848() || checkableImageButton.getDrawable() == null) {
                AbstractC3744.m5323(textInputLayout, checkableImageButton, c1213.f4358, c1213.f4359);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        C2870 c2870 = this.f853;
        AbstractC3744.m5340(c2870.f9162, c2870.f9165, c2870.f9166);
        if (this.f892 == 2) {
            int i = this.f894;
            if (z2 && isEnabled()) {
                this.f894 = this.f896;
            } else {
                this.f894 = this.f895;
            }
            if (this.f894 != i && m841() && !this.f921) {
                if (m841()) {
                    ((C0952) this.f883).m2559(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m846();
            }
        }
        if (this.f892 == 1) {
            if (!isEnabled()) {
                this.f898 = this.f916;
            } else if (z && !z2) {
                this.f898 = this.f918;
            } else if (z2) {
                this.f898 = this.f917;
            } else {
                this.f898 = this.f915;
            }
        }
        m838();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f853.f9165;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f853.m4820(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f854.f4354.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f854.f4354.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f854.m2944(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f854.f4354;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C1213 c1213 = this.f854;
        TextInputLayout textInputLayout = c1213.f4348;
        CheckableImageButton checkableImageButton = c1213.f4354;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC3744.m5323(textInputLayout, checkableImageButton, c1213.f4358, c1213.f4359);
            AbstractC3744.m5340(textInputLayout, checkableImageButton, c1213.f4358);
        }
    }
}
