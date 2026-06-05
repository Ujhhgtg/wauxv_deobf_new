package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import p000.AbstractC0799feyxiexzfUjhhgtg;
import p000.AbstractC0925feyxiexzfUjhhgtg;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC1265feyxiexzfUjhhgtg;
import p000.AbstractC1901feyxiexzfUjhhgtg;
import p000.AbstractC1937feyxiexzfUjhhgtg;
import p000.AbstractC1968Ujhhgtgfeyxiexzf;
import p000.AbstractC2361Ujhhgtgfeyxiexzf;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3516feyxiexzfUjhhgtg;
import p000.AbstractC3612feyxiexzfUjhhgtg;
import p000.C0353Ujhhgtgfeyxiexzf;
import p000.C1017feyxiexzfUjhhgtg;
import p000.C1969Ujhhgtgfeyxiexzf;
import p000.C1970Ujhhgtgfeyxiexzf;
import p000.C2531feyxiexzfUjhhgtg;
import p000.C2667feyxiexzfUjhhgtg;
import p000.C2802Ujhhgtgfeyxiexzf;
import p000.C2817Ujhhgtgfeyxiexzf;
import p000.C2818Ujhhgtgfeyxiexzf;
import p000.C2819Ujhhgtgfeyxiexzf;
import p000.C2820Ujhhgtgfeyxiexzf;
import p000.C2962feyxiexzfUjhhgtg;
import p000.InterfaceC0227Ujhhgtgfeyxiexzf;
import p000.InterfaceC0228Ujhhgtgfeyxiexzf;
import p000.InterfaceC1006feyxiexzfUjhhgtg;
import p000.InterfaceC2801Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends AbstractC2361Ujhhgtgfeyxiexzf implements InterfaceC2801Ujhhgtgfeyxiexzf, InterfaceC1006feyxiexzfUjhhgtg, InterfaceC0228Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Rect f755feyxiexzfUjhhgtg = new Rect();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int[] f756feyxiexzfUjhhgtg = {R.attr.state_selected};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final int[] f757feyxiexzfUjhhgtg = {R.attr.state_checkable};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C2802Ujhhgtgfeyxiexzf f758Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public InsetDrawable f759Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public RippleDrawable f760Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public View.OnClickListener f761Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f762Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public InterfaceC0227Ujhhgtgfeyxiexzf f763Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean f764Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public boolean f765Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f766Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f767Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f768Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f769Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public int f770Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public CharSequence f771Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final C2820Ujhhgtgfeyxiexzf f772Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f773Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final Rect f774Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final RectF f775Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2818Ujhhgtgfeyxiexzf f776feyxiexzfUjhhgtg;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC3612feyxiexzfUjhhgtg.m5250Ujhhgtgfeyxiexzf(context, attributeSet, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, me.hd.wauxv.R.attr.chipStyle);
        this.f774Ujhhgtgfeyxiexzf = new Rect();
        this.f775Ujhhgtgfeyxiexzf = new RectF();
        this.f776feyxiexzfUjhhgtg = new C2818Ujhhgtgfeyxiexzf(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = new C2802Ujhhgtgfeyxiexzf(context2, attributeSet);
        Context context3 = c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg;
        int[] iArr = AbstractC0799feyxiexzfUjhhgtg.f3121Ujhhgtgfeyxiexzf;
        TypedArray typedArrayM2740Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2740Ujhhgtgfeyxiexzf(context3, attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c2802Ujhhgtgfeyxiexzf.f8908Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(37);
        Context context4 = c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg;
        ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context4, typedArrayM2740Ujhhgtgfeyxiexzf, 24);
        if (c2802Ujhhgtgfeyxiexzf.f8849feyxiexzfUjhhgtg != colorStateListM4561Ujhhgtgfeyxiexzf) {
            c2802Ujhhgtgfeyxiexzf.f8849feyxiexzfUjhhgtg = colorStateListM4561Ujhhgtgfeyxiexzf;
            c2802Ujhhgtgfeyxiexzf.onStateChange(c2802Ujhhgtgfeyxiexzf.getState());
        }
        ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf2 = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context4, typedArrayM2740Ujhhgtgfeyxiexzf, 11);
        if (c2802Ujhhgtgfeyxiexzf.f8850feyxiexzfUjhhgtg != colorStateListM4561Ujhhgtgfeyxiexzf2) {
            c2802Ujhhgtgfeyxiexzf.f8850feyxiexzfUjhhgtg = colorStateListM4561Ujhhgtgfeyxiexzf2;
            c2802Ujhhgtgfeyxiexzf.onStateChange(c2802Ujhhgtgfeyxiexzf.getState());
        }
        float dimension = typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(19, 0.0f);
        if (c2802Ujhhgtgfeyxiexzf.f8851feyxiexzfUjhhgtg != dimension) {
            c2802Ujhhgtgfeyxiexzf.f8851feyxiexzfUjhhgtg = dimension;
            c2802Ujhhgtgfeyxiexzf.invalidateSelf();
            c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
        }
        if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(12)) {
            c2802Ujhhgtgfeyxiexzf.m4105feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(12, 0.0f));
        }
        c2802Ujhhgtgfeyxiexzf.m4110feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context4, typedArrayM2740Ujhhgtgfeyxiexzf, 22));
        c2802Ujhhgtgfeyxiexzf.m4111feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(23, 0.0f));
        c2802Ujhhgtgfeyxiexzf.m4120feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context4, typedArrayM2740Ujhhgtgfeyxiexzf, 36));
        String text = typedArrayM2740Ujhhgtgfeyxiexzf.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(c2802Ujhhgtgfeyxiexzf.f8856feyxiexzfUjhhgtg, text);
        C1970Ujhhgtgfeyxiexzf c1970Ujhhgtgfeyxiexzf = c2802Ujhhgtgfeyxiexzf.f8888Ujhhgtgfeyxiexzf;
        if (!zEquals) {
            c2802Ujhhgtgfeyxiexzf.f8856feyxiexzfUjhhgtg = text;
            c1970Ujhhgtgfeyxiexzf.f6471Ujhhgtgfeyxiexzf = true;
            c2802Ujhhgtgfeyxiexzf.invalidateSelf();
            c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
        }
        C1969Ujhhgtgfeyxiexzf c1969Ujhhgtgfeyxiexzf = (!typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(0) || (resourceId3 = typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(0, 0)) == 0) ? null : new C1969Ujhhgtgfeyxiexzf(context4, resourceId3);
        c1969Ujhhgtgfeyxiexzf.f6463Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(1, c1969Ujhhgtgfeyxiexzf.f6463Ujhhgtgfeyxiexzf);
        c1970Ujhhgtgfeyxiexzf.m3310Ujhhgtgfeyxiexzf(c1969Ujhhgtgfeyxiexzf, context4);
        int i = typedArrayM2740Ujhhgtgfeyxiexzf.getInt(3, 0);
        if (i == 1) {
            c2802Ujhhgtgfeyxiexzf.f8905feyxiexzfUjhhgtg = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c2802Ujhhgtgfeyxiexzf.f8905feyxiexzfUjhhgtg = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c2802Ujhhgtgfeyxiexzf.f8905feyxiexzfUjhhgtg = TextUtils.TruncateAt.END;
        }
        c2802Ujhhgtgfeyxiexzf.m4109feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c2802Ujhhgtgfeyxiexzf.m4109feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(15, false));
        }
        c2802Ujhhgtgfeyxiexzf.m4106feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4562Ujhhgtgfeyxiexzf(context4, typedArrayM2740Ujhhgtgfeyxiexzf, 14));
        if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(17)) {
            c2802Ujhhgtgfeyxiexzf.m4108feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context4, typedArrayM2740Ujhhgtgfeyxiexzf, 17));
        }
        c2802Ujhhgtgfeyxiexzf.m4107feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(16, -1.0f));
        c2802Ujhhgtgfeyxiexzf.m4117feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c2802Ujhhgtgfeyxiexzf.m4117feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(26, false));
        }
        c2802Ujhhgtgfeyxiexzf.m4112feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4562Ujhhgtgfeyxiexzf(context4, typedArrayM2740Ujhhgtgfeyxiexzf, 25));
        c2802Ujhhgtgfeyxiexzf.m4116feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context4, typedArrayM2740Ujhhgtgfeyxiexzf, 30));
        c2802Ujhhgtgfeyxiexzf.m4114feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(28, 0.0f));
        c2802Ujhhgtgfeyxiexzf.m4101feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(6, false));
        c2802Ujhhgtgfeyxiexzf.m4104feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c2802Ujhhgtgfeyxiexzf.m4104feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(8, false));
        }
        c2802Ujhhgtgfeyxiexzf.m4102feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4562Ujhhgtgfeyxiexzf(context4, typedArrayM2740Ujhhgtgfeyxiexzf, 7));
        if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(9)) {
            c2802Ujhhgtgfeyxiexzf.m4103feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context4, typedArrayM2740Ujhhgtgfeyxiexzf, 9));
        }
        c2802Ujhhgtgfeyxiexzf.f8872Ujhhgtgfeyxiexzf = (!typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(39) || (resourceId2 = typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(39, 0)) == 0) ? null : C0353Ujhhgtgfeyxiexzf.m1539Ujhhgtgfeyxiexzf(context4, resourceId2);
        c2802Ujhhgtgfeyxiexzf.f8873Ujhhgtgfeyxiexzf = (!typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(33) || (resourceId = typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(33, 0)) == 0) ? null : C0353Ujhhgtgfeyxiexzf.m1539Ujhhgtgfeyxiexzf(context4, resourceId);
        float dimension2 = typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(21, 0.0f);
        if (c2802Ujhhgtgfeyxiexzf.f8874Ujhhgtgfeyxiexzf != dimension2) {
            c2802Ujhhgtgfeyxiexzf.f8874Ujhhgtgfeyxiexzf = dimension2;
            c2802Ujhhgtgfeyxiexzf.invalidateSelf();
            c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
        }
        c2802Ujhhgtgfeyxiexzf.m4119feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(35, 0.0f));
        c2802Ujhhgtgfeyxiexzf.m4118feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(34, 0.0f));
        float dimension3 = typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(41, 0.0f);
        if (c2802Ujhhgtgfeyxiexzf.f8877Ujhhgtgfeyxiexzf != dimension3) {
            c2802Ujhhgtgfeyxiexzf.f8877Ujhhgtgfeyxiexzf = dimension3;
            c2802Ujhhgtgfeyxiexzf.invalidateSelf();
            c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
        }
        float dimension4 = typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(40, 0.0f);
        if (c2802Ujhhgtgfeyxiexzf.f8878feyxiexzfUjhhgtg != dimension4) {
            c2802Ujhhgtgfeyxiexzf.f8878feyxiexzfUjhhgtg = dimension4;
            c2802Ujhhgtgfeyxiexzf.invalidateSelf();
            c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
        }
        c2802Ujhhgtgfeyxiexzf.m4115feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(29, 0.0f));
        c2802Ujhhgtgfeyxiexzf.m4113feyxiexzfUjhhgtg(typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(27, 0.0f));
        float dimension5 = typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(13, 0.0f);
        if (c2802Ujhhgtgfeyxiexzf.f8881feyxiexzfUjhhgtg != dimension5) {
            c2802Ujhhgtgfeyxiexzf.f8881feyxiexzfUjhhgtg = dimension5;
            c2802Ujhhgtgfeyxiexzf.invalidateSelf();
            c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
        }
        c2802Ujhhgtgfeyxiexzf.f8907feyxiexzfUjhhgtg = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM2740Ujhhgtgfeyxiexzf.recycle();
        AbstractC1243feyxiexzfUjhhgtg.m2730Ujhhgtgfeyxiexzf(context2, attributeSet, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1243feyxiexzfUjhhgtg.m2731Ujhhgtgfeyxiexzf(context2, attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        this.f768Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f770Ujhhgtgfeyxiexzf = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(AbstractC1937feyxiexzfUjhhgtg.m3278Ujhhgtgfeyxiexzf(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c2802Ujhhgtgfeyxiexzf);
        c2802Ujhhgtgfeyxiexzf.m1368Ujhhgtgfeyxiexzf(getElevation());
        AbstractC1243feyxiexzfUjhhgtg.m2730Ujhhgtgfeyxiexzf(context2, attributeSet, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1243feyxiexzfUjhhgtg.m2731Ujhhgtgfeyxiexzf(context2, attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, me.hd.wauxv.R.attr.chipStyle, me.hd.wauxv.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f772Ujhhgtgfeyxiexzf = new C2820Ujhhgtgfeyxiexzf(this, this);
        m819Ujhhgtgfeyxiexzf();
        if (!zHasValue) {
            setOutlineProvider(new C2819Ujhhgtgfeyxiexzf(0, this));
        }
        setChecked(this.f764Ujhhgtgfeyxiexzf);
        setText(c2802Ujhhgtgfeyxiexzf.f8856feyxiexzfUjhhgtg);
        setEllipsize(c2802Ujhhgtgfeyxiexzf.f8905feyxiexzfUjhhgtg);
        m822Ujhhgtgfeyxiexzf();
        if (!this.f758Ujhhgtgfeyxiexzf.f8906feyxiexzfUjhhgtg) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m821Ujhhgtgfeyxiexzf();
        if (this.f768Ujhhgtgfeyxiexzf) {
            setMinHeight(this.f770Ujhhgtgfeyxiexzf);
        }
        this.f769Ujhhgtgfeyxiexzf = getLayoutDirection();
        super.setOnCheckedChangeListener(new C2817Ujhhgtgfeyxiexzf(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f775Ujhhgtgfeyxiexzf;
        rectF.setEmpty();
        if (m818Ujhhgtgfeyxiexzf() && this.f761Ujhhgtgfeyxiexzf != null) {
            C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
            Rect bounds = c2802Ujhhgtgfeyxiexzf.getBounds();
            rectF.setEmpty();
            if (c2802Ujhhgtgfeyxiexzf.m4123Ujhhgtgfeyxiexzf()) {
                float f = c2802Ujhhgtgfeyxiexzf.f8881feyxiexzfUjhhgtg + c2802Ujhhgtgfeyxiexzf.f8880feyxiexzfUjhhgtg + c2802Ujhhgtgfeyxiexzf.f8866feyxiexzfUjhhgtg + c2802Ujhhgtgfeyxiexzf.f8879feyxiexzfUjhhgtg + c2802Ujhhgtgfeyxiexzf.f8878feyxiexzfUjhhgtg;
                if (c2802Ujhhgtgfeyxiexzf.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f774Ujhhgtgfeyxiexzf;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C1969Ujhhgtgfeyxiexzf getTextAppearance() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8888Ujhhgtgfeyxiexzf.f6473Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f766Ujhhgtgfeyxiexzf != z) {
            this.f766Ujhhgtgfeyxiexzf = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f765Ujhhgtgfeyxiexzf != z) {
            this.f765Ujhhgtgfeyxiexzf = z;
            refreshDrawableState();
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f773Ujhhgtgfeyxiexzf) {
            return this.f772Ujhhgtgfeyxiexzf.m5020Ujhhgtgfeyxiexzf(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        if (!this.f773Ujhhgtgfeyxiexzf) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C2820Ujhhgtgfeyxiexzf c2820Ujhhgtgfeyxiexzf = this.f772Ujhhgtgfeyxiexzf;
        c2820Ujhhgtgfeyxiexzf.getClass();
        boolean zM5022Ujhhgtgfeyxiexzf = false;
        int i2 = 0;
        zM5022Ujhhgtgfeyxiexzf = false;
        zM5022Ujhhgtgfeyxiexzf = false;
        zM5022Ujhhgtgfeyxiexzf = false;
        zM5022Ujhhgtgfeyxiexzf = false;
        zM5022Ujhhgtgfeyxiexzf = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case Opcodes.ILOAD /* 21 */:
                        case Opcodes.LLOAD /* 22 */:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = Opcodes.IXOR;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && c2820Ujhhgtgfeyxiexzf.m5022Ujhhgtgfeyxiexzf(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM5022Ujhhgtgfeyxiexzf = z;
                            }
                            break;
                        case Opcodes.FLOAD /* 23 */:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = c2820Ujhhgtgfeyxiexzf.f10916Ujhhgtgfeyxiexzf;
                                if (i != Integer.MIN_VALUE) {
                                    c2820Ujhhgtgfeyxiexzf.mo3730Ujhhgtgfeyxiexzf(i, 16, null);
                                }
                                zM5022Ujhhgtgfeyxiexzf = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = c2820Ujhhgtgfeyxiexzf.f10916Ujhhgtgfeyxiexzf;
                    if (i != Integer.MIN_VALUE) {
                        c2820Ujhhgtgfeyxiexzf.mo3730Ujhhgtgfeyxiexzf(i, 16, null);
                    }
                    zM5022Ujhhgtgfeyxiexzf = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM5022Ujhhgtgfeyxiexzf = c2820Ujhhgtgfeyxiexzf.m5022Ujhhgtgfeyxiexzf(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM5022Ujhhgtgfeyxiexzf = c2820Ujhhgtgfeyxiexzf.m5022Ujhhgtgfeyxiexzf(1, null);
            }
        }
        if (!zM5022Ujhhgtgfeyxiexzf || c2820Ujhhgtgfeyxiexzf.f10916Ujhhgtgfeyxiexzf == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p000.AbstractC2361Ujhhgtgfeyxiexzf, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        boolean zM4100feyxiexzfUjhhgtg = false;
        if (c2802Ujhhgtgfeyxiexzf != null && C2802Ujhhgtgfeyxiexzf.m4092feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf.f8863feyxiexzfUjhhgtg)) {
            C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf2 = this.f758Ujhhgtgfeyxiexzf;
            ?? IsEnabled = isEnabled();
            if (this.f767Ujhhgtgfeyxiexzf) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.f766Ujhhgtgfeyxiexzf) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.f765Ujhhgtgfeyxiexzf) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.f767Ujhhgtgfeyxiexzf) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f766Ujhhgtgfeyxiexzf) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f765Ujhhgtgfeyxiexzf) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(c2802Ujhhgtgfeyxiexzf2.f8902feyxiexzfUjhhgtg, iArr)) {
                c2802Ujhhgtgfeyxiexzf2.f8902feyxiexzfUjhhgtg = iArr;
                if (c2802Ujhhgtgfeyxiexzf2.m4123Ujhhgtgfeyxiexzf()) {
                    zM4100feyxiexzfUjhhgtg = c2802Ujhhgtgfeyxiexzf2.m4100feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf2.getState(), iArr);
                }
            }
        }
        if (zM4100feyxiexzfUjhhgtg) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f771Ujhhgtgfeyxiexzf)) {
            return this.f771Ujhhgtgfeyxiexzf;
        }
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null || !c2802Ujhhgtgfeyxiexzf.f8868feyxiexzfUjhhgtg) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f780Ujhhgtgfeyxiexzf.f9194Ujhhgtgfeyxiexzf) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f759Ujhhgtgfeyxiexzf;
        return insetDrawable == null ? this.f758Ujhhgtgfeyxiexzf : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8870feyxiexzfUjhhgtg;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8871feyxiexzfUjhhgtg;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8850feyxiexzfUjhhgtg;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return Math.max(0.0f, c2802Ujhhgtgfeyxiexzf.m4098Ujhhgtgfeyxiexzf());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f758Ujhhgtgfeyxiexzf;
    }

    public float getChipEndPadding() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8881feyxiexzfUjhhgtg;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null || (drawable = c2802Ujhhgtgfeyxiexzf.f8858feyxiexzfUjhhgtg) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8860feyxiexzfUjhhgtg;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8859feyxiexzfUjhhgtg;
        }
        return null;
    }

    public float getChipMinHeight() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8851feyxiexzfUjhhgtg;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8874Ujhhgtgfeyxiexzf;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8853feyxiexzfUjhhgtg;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8854feyxiexzfUjhhgtg;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null || (drawable = c2802Ujhhgtgfeyxiexzf.f8863feyxiexzfUjhhgtg) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8867feyxiexzfUjhhgtg;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8880feyxiexzfUjhhgtg;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8866feyxiexzfUjhhgtg;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8879feyxiexzfUjhhgtg;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8865feyxiexzfUjhhgtg;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8905feyxiexzfUjhhgtg;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f773Ujhhgtgfeyxiexzf) {
            C2820Ujhhgtgfeyxiexzf c2820Ujhhgtgfeyxiexzf = this.f772Ujhhgtgfeyxiexzf;
            if (c2820Ujhhgtgfeyxiexzf.f10916Ujhhgtgfeyxiexzf == 1 || c2820Ujhhgtgfeyxiexzf.f10915Ujhhgtgfeyxiexzf == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0353Ujhhgtgfeyxiexzf getHideMotionSpec() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8873Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    public float getIconEndPadding() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8876Ujhhgtgfeyxiexzf;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8875Ujhhgtgfeyxiexzf;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8855feyxiexzfUjhhgtg;
        }
        return null;
    }

    public C1017feyxiexzfUjhhgtg getShapeAppearanceModel() {
        return this.f758Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1506Ujhhgtgfeyxiexzf;
    }

    public C0353Ujhhgtgfeyxiexzf getShowMotionSpec() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8872Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    public float getTextEndPadding() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8878feyxiexzfUjhhgtg;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            return c2802Ujhhgtgfeyxiexzf.f8877Ujhhgtgfeyxiexzf;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC3516feyxiexzfUjhhgtg.m5072feyxiexzfUjhhgtg(this, this.f758Ujhhgtgfeyxiexzf);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f756feyxiexzfUjhhgtg);
        }
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null && c2802Ujhhgtgfeyxiexzf.f8868feyxiexzfUjhhgtg) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f757feyxiexzfUjhhgtg);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f773Ujhhgtgfeyxiexzf) {
            C2820Ujhhgtgfeyxiexzf c2820Ujhhgtgfeyxiexzf = this.f772Ujhhgtgfeyxiexzf;
            int i2 = c2820Ujhhgtgfeyxiexzf.f10916Ujhhgtgfeyxiexzf;
            if (i2 != Integer.MIN_VALUE) {
                c2820Ujhhgtgfeyxiexzf.m5017Ujhhgtgfeyxiexzf(i2);
            }
            if (z) {
                c2820Ujhhgtgfeyxiexzf.m5022Ujhhgtgfeyxiexzf(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(c2802Ujhhgtgfeyxiexzf != null && c2802Ujhhgtgfeyxiexzf.f8868feyxiexzfUjhhgtg);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (!chipGroup.f11309Ujhhgtgfeyxiexzf) {
                i = -1;
                break;
            }
            i = 0;
            while (true) {
                if (i2 >= chipGroup.getChildCount()) {
                    i = -1;
                    break;
                }
                View childAt = chipGroup.getChildAt(i2);
                if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                    if (((Chip) childAt) == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                i2++;
            }
            Object tag = getTag(me.hd.wauxv.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C2962feyxiexzfUjhhgtg.m4429Ujhhgtgfeyxiexzf(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, isChecked()).f9271Ujhhgtgfeyxiexzf);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f769Ujhhgtgfeyxiexzf != i) {
            this.f769Ujhhgtgfeyxiexzf = i;
            m821Ujhhgtgfeyxiexzf();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f765Ujhhgtgfeyxiexzf) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.f765Ujhhgtgfeyxiexzf) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f761Ujhhgtgfeyxiexzf;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f773Ujhhgtgfeyxiexzf) {
                        this.f772Ujhhgtgfeyxiexzf.m5025Ujhhgtgfeyxiexzf(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f771Ujhhgtgfeyxiexzf = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f760Ujhhgtgfeyxiexzf) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p000.AbstractC2361Ujhhgtgfeyxiexzf, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f760Ujhhgtgfeyxiexzf) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p000.AbstractC2361Ujhhgtgfeyxiexzf, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4101feyxiexzfUjhhgtg(z);
        }
    }

    public void setCheckableResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4101feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null) {
            this.f764Ujhhgtgfeyxiexzf = z;
        } else if (c2802Ujhhgtgfeyxiexzf.f8868feyxiexzfUjhhgtg) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4102feyxiexzfUjhhgtg(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4102feyxiexzfUjhhgtg(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4103feyxiexzfUjhhgtg(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4103feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4104feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null || c2802Ujhhgtgfeyxiexzf.f8850feyxiexzfUjhhgtg == colorStateList) {
            return;
        }
        c2802Ujhhgtgfeyxiexzf.f8850feyxiexzfUjhhgtg = colorStateList;
        c2802Ujhhgtgfeyxiexzf.onStateChange(c2802Ujhhgtgfeyxiexzf.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM4559Ujhhgtgfeyxiexzf;
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null || c2802Ujhhgtgfeyxiexzf.f8850feyxiexzfUjhhgtg == (colorStateListM4559Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg, i))) {
            return;
        }
        c2802Ujhhgtgfeyxiexzf.f8850feyxiexzfUjhhgtg = colorStateListM4559Ujhhgtgfeyxiexzf;
        c2802Ujhhgtgfeyxiexzf.onStateChange(c2802Ujhhgtgfeyxiexzf.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4105feyxiexzfUjhhgtg(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4105feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf2 = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf2 != c2802Ujhhgtgfeyxiexzf) {
            if (c2802Ujhhgtgfeyxiexzf2 != null) {
                c2802Ujhhgtgfeyxiexzf2.f8904feyxiexzfUjhhgtg = new WeakReference(null);
            }
            this.f758Ujhhgtgfeyxiexzf = c2802Ujhhgtgfeyxiexzf;
            c2802Ujhhgtgfeyxiexzf.f8906feyxiexzfUjhhgtg = false;
            c2802Ujhhgtgfeyxiexzf.f8904feyxiexzfUjhhgtg = new WeakReference(this);
            m817Ujhhgtgfeyxiexzf(this.f770Ujhhgtgfeyxiexzf);
        }
    }

    public void setChipEndPadding(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null || c2802Ujhhgtgfeyxiexzf.f8881feyxiexzfUjhhgtg == f) {
            return;
        }
        c2802Ujhhgtgfeyxiexzf.f8881feyxiexzfUjhhgtg = f;
        c2802Ujhhgtgfeyxiexzf.invalidateSelf();
        c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
    }

    public void setChipEndPaddingResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            float dimension = c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i);
            if (c2802Ujhhgtgfeyxiexzf.f8881feyxiexzfUjhhgtg != dimension) {
                c2802Ujhhgtgfeyxiexzf.f8881feyxiexzfUjhhgtg = dimension;
                c2802Ujhhgtgfeyxiexzf.invalidateSelf();
                c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4106feyxiexzfUjhhgtg(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4106feyxiexzfUjhhgtg(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg, i));
        }
    }

    public void setChipIconSize(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4107feyxiexzfUjhhgtg(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4107feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4108feyxiexzfUjhhgtg(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4108feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg, i));
        }
    }

    public void setChipIconVisible(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4109feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null || c2802Ujhhgtgfeyxiexzf.f8851feyxiexzfUjhhgtg == f) {
            return;
        }
        c2802Ujhhgtgfeyxiexzf.f8851feyxiexzfUjhhgtg = f;
        c2802Ujhhgtgfeyxiexzf.invalidateSelf();
        c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
    }

    public void setChipMinHeightResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            float dimension = c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i);
            if (c2802Ujhhgtgfeyxiexzf.f8851feyxiexzfUjhhgtg != dimension) {
                c2802Ujhhgtgfeyxiexzf.f8851feyxiexzfUjhhgtg = dimension;
                c2802Ujhhgtgfeyxiexzf.invalidateSelf();
                c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null || c2802Ujhhgtgfeyxiexzf.f8874Ujhhgtgfeyxiexzf == f) {
            return;
        }
        c2802Ujhhgtgfeyxiexzf.f8874Ujhhgtgfeyxiexzf = f;
        c2802Ujhhgtgfeyxiexzf.invalidateSelf();
        c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
    }

    public void setChipStartPaddingResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            float dimension = c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i);
            if (c2802Ujhhgtgfeyxiexzf.f8874Ujhhgtgfeyxiexzf != dimension) {
                c2802Ujhhgtgfeyxiexzf.f8874Ujhhgtgfeyxiexzf = dimension;
                c2802Ujhhgtgfeyxiexzf.invalidateSelf();
                c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4110feyxiexzfUjhhgtg(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4110feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4111feyxiexzfUjhhgtg(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4111feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4112feyxiexzfUjhhgtg(drawable);
        }
        m819Ujhhgtgfeyxiexzf();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null || c2802Ujhhgtgfeyxiexzf.f8867feyxiexzfUjhhgtg == charSequence) {
            return;
        }
        String str = C2531feyxiexzfUjhhgtg.f8244Ujhhgtgfeyxiexzf;
        C2531feyxiexzfUjhhgtg c2531feyxiexzfUjhhgtg = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C2531feyxiexzfUjhhgtg.f8247Ujhhgtgfeyxiexzf : C2531feyxiexzfUjhhgtg.f8246Ujhhgtgfeyxiexzf;
        c2531feyxiexzfUjhhgtg.getClass();
        C2667feyxiexzfUjhhgtg c2667feyxiexzfUjhhgtg = AbstractC1968Ujhhgtgfeyxiexzf.f6449Ujhhgtgfeyxiexzf;
        c2802Ujhhgtgfeyxiexzf.f8867feyxiexzfUjhhgtg = c2531feyxiexzfUjhhgtg.m3798Ujhhgtgfeyxiexzf(charSequence);
        c2802Ujhhgtgfeyxiexzf.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4113feyxiexzfUjhhgtg(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4113feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4112feyxiexzfUjhhgtg(AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg, i));
        }
        m819Ujhhgtgfeyxiexzf();
    }

    public void setCloseIconSize(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4114feyxiexzfUjhhgtg(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4114feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4115feyxiexzfUjhhgtg(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4115feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4116feyxiexzfUjhhgtg(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4116feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // p000.AbstractC2361Ujhhgtgfeyxiexzf, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p000.AbstractC2361Ujhhgtgfeyxiexzf, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m1368Ujhhgtgfeyxiexzf(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f758Ujhhgtgfeyxiexzf == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.f8905feyxiexzfUjhhgtg = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f768Ujhhgtgfeyxiexzf = z;
        m817Ujhhgtgfeyxiexzf(this.f770Ujhhgtgfeyxiexzf);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0353Ujhhgtgfeyxiexzf c0353Ujhhgtgfeyxiexzf) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.f8873Ujhhgtgfeyxiexzf = c0353Ujhhgtgfeyxiexzf;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.f8873Ujhhgtgfeyxiexzf = C0353Ujhhgtgfeyxiexzf.m1539Ujhhgtgfeyxiexzf(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg, i);
        }
    }

    public void setIconEndPadding(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4118feyxiexzfUjhhgtg(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4118feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4119feyxiexzfUjhhgtg(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4119feyxiexzfUjhhgtg(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i));
        }
    }

    @Override // p000.InterfaceC0228Ujhhgtgfeyxiexzf
    public void setInternalOnCheckedChangeListener(InterfaceC0227Ujhhgtgfeyxiexzf interfaceC0227Ujhhgtgfeyxiexzf) {
        this.f763Ujhhgtgfeyxiexzf = interfaceC0227Ujhhgtgfeyxiexzf;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f758Ujhhgtgfeyxiexzf == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.f8907feyxiexzfUjhhgtg = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f762Ujhhgtgfeyxiexzf = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f761Ujhhgtgfeyxiexzf = onClickListener;
        m819Ujhhgtgfeyxiexzf();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4120feyxiexzfUjhhgtg(colorStateList);
        }
        this.f758Ujhhgtgfeyxiexzf.getClass();
        m820Ujhhgtgfeyxiexzf();
    }

    public void setRippleColorResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4120feyxiexzfUjhhgtg(AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg, i));
            this.f758Ujhhgtgfeyxiexzf.getClass();
            m820Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.InterfaceC1006feyxiexzfUjhhgtg
    public void setShapeAppearanceModel(C1017feyxiexzfUjhhgtg c1017feyxiexzfUjhhgtg) {
        this.f758Ujhhgtgfeyxiexzf.setShapeAppearanceModel(c1017feyxiexzfUjhhgtg);
    }

    public void setShowMotionSpec(C0353Ujhhgtgfeyxiexzf c0353Ujhhgtgfeyxiexzf) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.f8872Ujhhgtgfeyxiexzf = c0353Ujhhgtgfeyxiexzf;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.f8872Ujhhgtgfeyxiexzf = C0353Ujhhgtgfeyxiexzf.m1539Ujhhgtgfeyxiexzf(c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c2802Ujhhgtgfeyxiexzf.f8906feyxiexzfUjhhgtg ? null : charSequence, bufferType);
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf2 = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf2 == null || TextUtils.equals(c2802Ujhhgtgfeyxiexzf2.f8856feyxiexzfUjhhgtg, charSequence)) {
            return;
        }
        c2802Ujhhgtgfeyxiexzf2.f8856feyxiexzfUjhhgtg = charSequence;
        c2802Ujhhgtgfeyxiexzf2.f8888Ujhhgtgfeyxiexzf.f6471Ujhhgtgfeyxiexzf = true;
        c2802Ujhhgtgfeyxiexzf2.invalidateSelf();
        c2802Ujhhgtgfeyxiexzf2.m4099feyxiexzfUjhhgtg();
    }

    public void setTextAppearance(C1969Ujhhgtgfeyxiexzf c1969Ujhhgtgfeyxiexzf) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.f8888Ujhhgtgfeyxiexzf.m3310Ujhhgtgfeyxiexzf(c1969Ujhhgtgfeyxiexzf, c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg);
        }
        m822Ujhhgtgfeyxiexzf();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null || c2802Ujhhgtgfeyxiexzf.f8878feyxiexzfUjhhgtg == f) {
            return;
        }
        c2802Ujhhgtgfeyxiexzf.f8878feyxiexzfUjhhgtg = f;
        c2802Ujhhgtgfeyxiexzf.invalidateSelf();
        c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
    }

    public void setTextEndPaddingResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            float dimension = c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i);
            if (c2802Ujhhgtgfeyxiexzf.f8878feyxiexzfUjhhgtg != dimension) {
                c2802Ujhhgtgfeyxiexzf.f8878feyxiexzfUjhhgtg = dimension;
                c2802Ujhhgtgfeyxiexzf.invalidateSelf();
                c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C1970Ujhhgtgfeyxiexzf c1970Ujhhgtgfeyxiexzf = c2802Ujhhgtgfeyxiexzf.f8888Ujhhgtgfeyxiexzf;
            C1969Ujhhgtgfeyxiexzf c1969Ujhhgtgfeyxiexzf = c1970Ujhhgtgfeyxiexzf.f6473Ujhhgtgfeyxiexzf;
            if (c1969Ujhhgtgfeyxiexzf != null) {
                c1969Ujhhgtgfeyxiexzf.f6463Ujhhgtgfeyxiexzf = fApplyDimension;
                c1970Ujhhgtgfeyxiexzf.f6467Ujhhgtgfeyxiexzf.setTextSize(fApplyDimension);
                c2802Ujhhgtgfeyxiexzf.mo1358Ujhhgtgfeyxiexzf();
            }
        }
        m822Ujhhgtgfeyxiexzf();
    }

    public void setTextStartPadding(float f) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null || c2802Ujhhgtgfeyxiexzf.f8877Ujhhgtgfeyxiexzf == f) {
            return;
        }
        c2802Ujhhgtgfeyxiexzf.f8877Ujhhgtgfeyxiexzf = f;
        c2802Ujhhgtgfeyxiexzf.invalidateSelf();
        c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
    }

    public void setTextStartPaddingResource(int i) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            float dimension = c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg.getResources().getDimension(i);
            if (c2802Ujhhgtgfeyxiexzf.f8877Ujhhgtgfeyxiexzf != dimension) {
                c2802Ujhhgtgfeyxiexzf.f8877Ujhhgtgfeyxiexzf = dimension;
                c2802Ujhhgtgfeyxiexzf.invalidateSelf();
                c2802Ujhhgtgfeyxiexzf.m4099feyxiexzfUjhhgtg();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m817Ujhhgtgfeyxiexzf(int i) {
        this.f770Ujhhgtgfeyxiexzf = i;
        if (!this.f768Ujhhgtgfeyxiexzf) {
            InsetDrawable insetDrawable = this.f759Ujhhgtgfeyxiexzf;
            if (insetDrawable == null) {
                int[] iArr = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
                m820Ujhhgtgfeyxiexzf();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f759Ujhhgtgfeyxiexzf = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
                    m820Ujhhgtgfeyxiexzf();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f758Ujhhgtgfeyxiexzf.f8851feyxiexzfUjhhgtg));
        int iMax2 = Math.max(0, i - this.f758Ujhhgtgfeyxiexzf.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f759Ujhhgtgfeyxiexzf;
            if (insetDrawable2 == null) {
                int[] iArr3 = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
                m820Ujhhgtgfeyxiexzf();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f759Ujhhgtgfeyxiexzf = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
                    m820Ujhhgtgfeyxiexzf();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f759Ujhhgtgfeyxiexzf != null) {
            Rect rect = new Rect();
            this.f759Ujhhgtgfeyxiexzf.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
                m820Ujhhgtgfeyxiexzf();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f759Ujhhgtgfeyxiexzf = new InsetDrawable((Drawable) this.f758Ujhhgtgfeyxiexzf, i2, i3, i2, i3);
        int[] iArr6 = AbstractC0925feyxiexzfUjhhgtg.f3743Ujhhgtgfeyxiexzf;
        m820Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean m818Ujhhgtgfeyxiexzf() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf == null) {
            return false;
        }
        Drawable drawable = c2802Ujhhgtgfeyxiexzf.f8863feyxiexzfUjhhgtg;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m819Ujhhgtgfeyxiexzf() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf;
        if (!m818Ujhhgtgfeyxiexzf() || (c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf) == null || !c2802Ujhhgtgfeyxiexzf.f8862feyxiexzfUjhhgtg || this.f761Ujhhgtgfeyxiexzf == null) {
            AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(this, null);
            this.f773Ujhhgtgfeyxiexzf = false;
        } else {
            AbstractC1901feyxiexzfUjhhgtg.m3265Ujhhgtgfeyxiexzf(this, this.f772Ujhhgtgfeyxiexzf);
            this.f773Ujhhgtgfeyxiexzf = true;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m820Ujhhgtgfeyxiexzf() {
        this.f760Ujhhgtgfeyxiexzf = new RippleDrawable(AbstractC0925feyxiexzfUjhhgtg.m2425Ujhhgtgfeyxiexzf(this.f758Ujhhgtgfeyxiexzf.f8855feyxiexzfUjhhgtg), getBackgroundDrawable(), null);
        this.f758Ujhhgtgfeyxiexzf.getClass();
        RippleDrawable rippleDrawable = this.f760Ujhhgtgfeyxiexzf;
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        setBackground(rippleDrawable);
        m821Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m821Ujhhgtgfeyxiexzf() {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf;
        if (TextUtils.isEmpty(getText()) || (c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf) == null) {
            return;
        }
        int iM4097Ujhhgtgfeyxiexzf = (int) (c2802Ujhhgtgfeyxiexzf.m4097Ujhhgtgfeyxiexzf() + c2802Ujhhgtgfeyxiexzf.f8881feyxiexzfUjhhgtg + c2802Ujhhgtgfeyxiexzf.f8878feyxiexzfUjhhgtg);
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf2 = this.f758Ujhhgtgfeyxiexzf;
        int iM4096Ujhhgtgfeyxiexzf = (int) (c2802Ujhhgtgfeyxiexzf2.m4096Ujhhgtgfeyxiexzf() + c2802Ujhhgtgfeyxiexzf2.f8874Ujhhgtgfeyxiexzf + c2802Ujhhgtgfeyxiexzf2.f8877Ujhhgtgfeyxiexzf);
        if (this.f759Ujhhgtgfeyxiexzf != null) {
            Rect rect = new Rect();
            this.f759Ujhhgtgfeyxiexzf.getPadding(rect);
            iM4096Ujhhgtgfeyxiexzf += rect.left;
            iM4097Ujhhgtgfeyxiexzf += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
        setPaddingRelative(iM4096Ujhhgtgfeyxiexzf, paddingTop, iM4097Ujhhgtgfeyxiexzf, paddingBottom);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void m822Ujhhgtgfeyxiexzf() {
        TextPaint paint = getPaint();
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            paint.drawableState = c2802Ujhhgtgfeyxiexzf.getState();
        }
        C1969Ujhhgtgfeyxiexzf textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m3305Ujhhgtgfeyxiexzf(getContext(), paint, this.f776feyxiexzfUjhhgtg);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4117feyxiexzfUjhhgtg(z);
        }
        m819Ujhhgtgfeyxiexzf();
    }

    public void setCheckedIconVisible(boolean z) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4104feyxiexzfUjhhgtg(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            c2802Ujhhgtgfeyxiexzf.m4109feyxiexzfUjhhgtg(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            Context context2 = c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg;
            c2802Ujhhgtgfeyxiexzf.f8888Ujhhgtgfeyxiexzf.m3310Ujhhgtgfeyxiexzf(new C1969Ujhhgtgfeyxiexzf(context2, i), context2);
        }
        m822Ujhhgtgfeyxiexzf();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C2802Ujhhgtgfeyxiexzf c2802Ujhhgtgfeyxiexzf = this.f758Ujhhgtgfeyxiexzf;
        if (c2802Ujhhgtgfeyxiexzf != null) {
            Context context = c2802Ujhhgtgfeyxiexzf.f8882feyxiexzfUjhhgtg;
            c2802Ujhhgtgfeyxiexzf.f8888Ujhhgtgfeyxiexzf.m3310Ujhhgtgfeyxiexzf(new C1969Ujhhgtgfeyxiexzf(context, i), context);
        }
        m822Ujhhgtgfeyxiexzf();
    }
}
