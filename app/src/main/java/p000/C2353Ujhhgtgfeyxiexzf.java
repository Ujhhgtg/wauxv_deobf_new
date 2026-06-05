package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2353Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final TextView f7670Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public C1741Ujhhgtgfeyxiexzf f7671Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C1741Ujhhgtgfeyxiexzf f7672Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public C1741Ujhhgtgfeyxiexzf f7673Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C1741Ujhhgtgfeyxiexzf f7674Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C1741Ujhhgtgfeyxiexzf f7675Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C1741Ujhhgtgfeyxiexzf f7676Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public C1741Ujhhgtgfeyxiexzf f7677Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C2388Ujhhgtgfeyxiexzf f7678Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f7679Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f7680Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Typeface f7681Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public boolean f7682Ujhhgtgfeyxiexzf;

    public C2353Ujhhgtgfeyxiexzf(TextView textView) {
        this.f7670Ujhhgtgfeyxiexzf = textView;
        this.f7678Ujhhgtgfeyxiexzf = new C2388Ujhhgtgfeyxiexzf(textView);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C1741Ujhhgtgfeyxiexzf m3556Ujhhgtgfeyxiexzf(Context context, C2364Ujhhgtgfeyxiexzf c2364Ujhhgtgfeyxiexzf, int i) {
        ColorStateList colorStateListM2360Ujhhgtgfeyxiexzf;
        synchronized (c2364Ujhhgtgfeyxiexzf) {
            colorStateListM2360Ujhhgtgfeyxiexzf = c2364Ujhhgtgfeyxiexzf.f7709Ujhhgtgfeyxiexzf.m2360Ujhhgtgfeyxiexzf(context, i);
        }
        if (colorStateListM2360Ujhhgtgfeyxiexzf == null) {
            return null;
        }
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = new C1741Ujhhgtgfeyxiexzf();
        c1741Ujhhgtgfeyxiexzf.f5850Ujhhgtgfeyxiexzf = true;
        c1741Ujhhgtgfeyxiexzf.f5847Ujhhgtgfeyxiexzf = colorStateListM2360Ujhhgtgfeyxiexzf;
        return c1741Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static void m3557Ujhhgtgfeyxiexzf(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC2957feyxiexzfUjhhgtg.m4407Ujhhgtgfeyxiexzf(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC2957feyxiexzfUjhhgtg.m4407Ujhhgtgfeyxiexzf(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            AbstractC0217Ujhhgtgfeyxiexzf.m1343feyxiexzfUjhhgtg(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            AbstractC0217Ujhhgtgfeyxiexzf.m1343feyxiexzfUjhhgtg(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC0217Ujhhgtgfeyxiexzf.m1343feyxiexzfUjhhgtg(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        AbstractC0217Ujhhgtgfeyxiexzf.m1343feyxiexzfUjhhgtg(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3558Ujhhgtgfeyxiexzf(Drawable drawable, C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf) {
        if (drawable == null || c1741Ujhhgtgfeyxiexzf == null) {
            return;
        }
        C2364Ujhhgtgfeyxiexzf.m3588Ujhhgtgfeyxiexzf(drawable, c1741Ujhhgtgfeyxiexzf, this.f7670Ujhhgtgfeyxiexzf.getDrawableState());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3559Ujhhgtgfeyxiexzf() {
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = this.f7671Ujhhgtgfeyxiexzf;
        TextView textView = this.f7670Ujhhgtgfeyxiexzf;
        if (c1741Ujhhgtgfeyxiexzf != null || this.f7672Ujhhgtgfeyxiexzf != null || this.f7673Ujhhgtgfeyxiexzf != null || this.f7674Ujhhgtgfeyxiexzf != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m3558Ujhhgtgfeyxiexzf(compoundDrawables[0], this.f7671Ujhhgtgfeyxiexzf);
            m3558Ujhhgtgfeyxiexzf(compoundDrawables[1], this.f7672Ujhhgtgfeyxiexzf);
            m3558Ujhhgtgfeyxiexzf(compoundDrawables[2], this.f7673Ujhhgtgfeyxiexzf);
            m3558Ujhhgtgfeyxiexzf(compoundDrawables[3], this.f7674Ujhhgtgfeyxiexzf);
        }
        if (this.f7675Ujhhgtgfeyxiexzf == null && this.f7676Ujhhgtgfeyxiexzf == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m3558Ujhhgtgfeyxiexzf(compoundDrawablesRelative[0], this.f7675Ujhhgtgfeyxiexzf);
        m3558Ujhhgtgfeyxiexzf(compoundDrawablesRelative[2], this.f7676Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ColorStateList m3560Ujhhgtgfeyxiexzf() {
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = this.f7677Ujhhgtgfeyxiexzf;
        if (c1741Ujhhgtgfeyxiexzf != null) {
            return c1741Ujhhgtgfeyxiexzf.f5847Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final PorterDuff.Mode m3561Ujhhgtgfeyxiexzf() {
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = this.f7677Ujhhgtgfeyxiexzf;
        if (c1741Ujhhgtgfeyxiexzf != null) {
            return c1741Ujhhgtgfeyxiexzf.f5848Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m3562Ujhhgtgfeyxiexzf(AttributeSet attributeSet, int i) {
        C2364Ujhhgtgfeyxiexzf c2364Ujhhgtgfeyxiexzf;
        String string;
        boolean z;
        boolean z2;
        String string2;
        int i2;
        int i3;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        int[] iArr = AbstractC0801feyxiexzfUjhhgtg.f3164Ujhhgtgfeyxiexzf;
        int[] iArr2 = AbstractC0801feyxiexzfUjhhgtg.f3176Ujhhgtgfeyxiexzf;
        C2388Ujhhgtgfeyxiexzf c2388Ujhhgtgfeyxiexzf = this.f7678Ujhhgtgfeyxiexzf;
        TextView textView = this.f7670Ujhhgtgfeyxiexzf;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C2364Ujhhgtgfeyxiexzf.f7707Ujhhgtgfeyxiexzf;
        synchronized (C2364Ujhhgtgfeyxiexzf.class) {
            try {
                if (C2364Ujhhgtgfeyxiexzf.f7708Ujhhgtgfeyxiexzf == null) {
                    C2364Ujhhgtgfeyxiexzf.m3587Ujhhgtgfeyxiexzf();
                }
                c2364Ujhhgtgfeyxiexzf = C2364Ujhhgtgfeyxiexzf.f7708Ujhhgtgfeyxiexzf;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr3 = AbstractC0801feyxiexzfUjhhgtg.f3163Ujhhgtgfeyxiexzf;
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3592Ujhhgtgfeyxiexzf(context, attributeSet, iArr3, i);
        TextView textView2 = this.f7670Ujhhgtgfeyxiexzf;
        AbstractC1901feyxiexzfUjhhgtg.m3264Ujhhgtgfeyxiexzf(textView2, textView2.getContext(), iArr3, attributeSet, (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf, i);
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f7671Ujhhgtgfeyxiexzf = m3556Ujhhgtgfeyxiexzf(context, c2364Ujhhgtgfeyxiexzf, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f7672Ujhhgtgfeyxiexzf = m3556Ujhhgtgfeyxiexzf(context, c2364Ujhhgtgfeyxiexzf, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f7673Ujhhgtgfeyxiexzf = m3556Ujhhgtgfeyxiexzf(context, c2364Ujhhgtgfeyxiexzf, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f7674Ujhhgtgfeyxiexzf = m3556Ujhhgtgfeyxiexzf(context, c2364Ujhhgtgfeyxiexzf, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f7675Ujhhgtgfeyxiexzf = m3556Ujhhgtgfeyxiexzf(context, c2364Ujhhgtgfeyxiexzf, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f7676Ujhhgtgfeyxiexzf = m3556Ujhhgtgfeyxiexzf(context, c2364Ujhhgtgfeyxiexzf, typedArray.getResourceId(6, 0));
        }
        c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = new C2366Ujhhgtgfeyxiexzf(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m3566Ujhhgtgfeyxiexzf(context, c2366Ujhhgtgfeyxiexzf);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c2366Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        } else {
            string = null;
            z = false;
            z2 = false;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf2 = new C2366Ujhhgtgfeyxiexzf(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        int i5 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m3566Ujhhgtgfeyxiexzf(context, c2366Ujhhgtgfeyxiexzf2);
        c2366Ujhhgtgfeyxiexzf2.m3611Ujhhgtgfeyxiexzf();
        if (!z3 && z) {
            this.f7670Ujhhgtgfeyxiexzf.setAllCaps(z4);
        }
        Typeface typeface = this.f7681Ujhhgtgfeyxiexzf;
        if (typeface != null) {
            if (this.f7680Ujhhgtgfeyxiexzf == -1) {
                textView.setTypeface(typeface, this.f7679Ujhhgtgfeyxiexzf);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC2358Ujhhgtgfeyxiexzf.m3576Ujhhgtgfeyxiexzf(textView, string);
        }
        if (string2 != null) {
            AbstractC2357Ujhhgtgfeyxiexzf.m3572Ujhhgtgfeyxiexzf(textView, AbstractC2357Ujhhgtgfeyxiexzf.m3571Ujhhgtgfeyxiexzf(string2));
        }
        Context context2 = c2388Ujhhgtgfeyxiexzf.f7772Ujhhgtgfeyxiexzf;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView3 = c2388Ujhhgtgfeyxiexzf.f7771Ujhhgtgfeyxiexzf;
        AbstractC1901feyxiexzfUjhhgtg.m3264Ujhhgtgfeyxiexzf(textView3, textView3.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c2388Ujhhgtgfeyxiexzf.f7765Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = typedArrayObtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                int[] iArrM3639Ujhhgtgfeyxiexzf = C2388Ujhhgtgfeyxiexzf.m3639Ujhhgtgfeyxiexzf(iArr4);
                c2388Ujhhgtgfeyxiexzf.f7769Ujhhgtgfeyxiexzf = iArrM3639Ujhhgtgfeyxiexzf;
                int length2 = iArrM3639Ujhhgtgfeyxiexzf.length;
                boolean z5 = length2 > 0;
                c2388Ujhhgtgfeyxiexzf.f7770Ujhhgtgfeyxiexzf = z5;
                if (z5) {
                    c2388Ujhhgtgfeyxiexzf.f7765Ujhhgtgfeyxiexzf = 1;
                    c2388Ujhhgtgfeyxiexzf.f7767Ujhhgtgfeyxiexzf = iArrM3639Ujhhgtgfeyxiexzf[0];
                    c2388Ujhhgtgfeyxiexzf.f7768Ujhhgtgfeyxiexzf = iArrM3639Ujhhgtgfeyxiexzf[length2 - 1];
                    c2388Ujhhgtgfeyxiexzf.f7766Ujhhgtgfeyxiexzf = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c2388Ujhhgtgfeyxiexzf.m3640Ujhhgtgfeyxiexzf()) {
            c2388Ujhhgtgfeyxiexzf.f7765Ujhhgtgfeyxiexzf = 0;
        } else if (c2388Ujhhgtgfeyxiexzf.f7765Ujhhgtgfeyxiexzf == 1) {
            if (!c2388Ujhhgtgfeyxiexzf.f7770Ujhhgtgfeyxiexzf) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c2388Ujhhgtgfeyxiexzf.f7765Ujhhgtgfeyxiexzf = 1;
                c2388Ujhhgtgfeyxiexzf.f7767Ujhhgtgfeyxiexzf = dimension2;
                c2388Ujhhgtgfeyxiexzf.f7768Ujhhgtgfeyxiexzf = dimension3;
                c2388Ujhhgtgfeyxiexzf.f7766Ujhhgtgfeyxiexzf = dimension;
                c2388Ujhhgtgfeyxiexzf.f7770Ujhhgtgfeyxiexzf = false;
            }
            if (c2388Ujhhgtgfeyxiexzf.m3640Ujhhgtgfeyxiexzf() && c2388Ujhhgtgfeyxiexzf.f7765Ujhhgtgfeyxiexzf == 1 && (!c2388Ujhhgtgfeyxiexzf.f7770Ujhhgtgfeyxiexzf || c2388Ujhhgtgfeyxiexzf.f7769Ujhhgtgfeyxiexzf.length == 0)) {
                int iFloor = ((int) Math.floor((c2388Ujhhgtgfeyxiexzf.f7768Ujhhgtgfeyxiexzf - c2388Ujhhgtgfeyxiexzf.f7767Ujhhgtgfeyxiexzf) / c2388Ujhhgtgfeyxiexzf.f7766Ujhhgtgfeyxiexzf)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i7 = 0; i7 < iFloor; i7++) {
                    iArr5[i7] = Math.round((i7 * c2388Ujhhgtgfeyxiexzf.f7766Ujhhgtgfeyxiexzf) + c2388Ujhhgtgfeyxiexzf.f7767Ujhhgtgfeyxiexzf);
                }
                c2388Ujhhgtgfeyxiexzf.f7769Ujhhgtgfeyxiexzf = C2388Ujhhgtgfeyxiexzf.m3639Ujhhgtgfeyxiexzf(iArr5);
            }
        }
        if (c2388Ujhhgtgfeyxiexzf.f7765Ujhhgtgfeyxiexzf != 0) {
            int[] iArr6 = c2388Ujhhgtgfeyxiexzf.f7769Ujhhgtgfeyxiexzf;
            if (iArr6.length > 0) {
                if (AbstractC2358Ujhhgtgfeyxiexzf.m3573Ujhhgtgfeyxiexzf(textView) != -1.0f) {
                    AbstractC2358Ujhhgtgfeyxiexzf.m3574Ujhhgtgfeyxiexzf(textView, Math.round(c2388Ujhhgtgfeyxiexzf.f7767Ujhhgtgfeyxiexzf), Math.round(c2388Ujhhgtgfeyxiexzf.f7768Ujhhgtgfeyxiexzf), Math.round(c2388Ujhhgtgfeyxiexzf.f7766Ujhhgtgfeyxiexzf), 0);
                } else {
                    AbstractC2358Ujhhgtgfeyxiexzf.m3575Ujhhgtgfeyxiexzf(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM3589Ujhhgtgfeyxiexzf = resourceId4 != -1 ? c2364Ujhhgtgfeyxiexzf.m3589Ujhhgtgfeyxiexzf(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM3589Ujhhgtgfeyxiexzf2 = resourceId5 != -1 ? c2364Ujhhgtgfeyxiexzf.m3589Ujhhgtgfeyxiexzf(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM3589Ujhhgtgfeyxiexzf3 = resourceId6 != -1 ? c2364Ujhhgtgfeyxiexzf.m3589Ujhhgtgfeyxiexzf(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM3589Ujhhgtgfeyxiexzf4 = resourceId7 != -1 ? c2364Ujhhgtgfeyxiexzf.m3589Ujhhgtgfeyxiexzf(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM3589Ujhhgtgfeyxiexzf5 = resourceId8 != -1 ? c2364Ujhhgtgfeyxiexzf.m3589Ujhhgtgfeyxiexzf(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM3589Ujhhgtgfeyxiexzf6 = resourceId9 != -1 ? c2364Ujhhgtgfeyxiexzf.m3589Ujhhgtgfeyxiexzf(context, resourceId9) : null;
        if (drawableM3589Ujhhgtgfeyxiexzf5 != null || drawableM3589Ujhhgtgfeyxiexzf6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM3589Ujhhgtgfeyxiexzf5 == null) {
                drawableM3589Ujhhgtgfeyxiexzf5 = compoundDrawablesRelative[0];
            }
            if (drawableM3589Ujhhgtgfeyxiexzf2 == null) {
                drawableM3589Ujhhgtgfeyxiexzf2 = compoundDrawablesRelative[1];
            }
            if (drawableM3589Ujhhgtgfeyxiexzf6 == null) {
                drawableM3589Ujhhgtgfeyxiexzf6 = compoundDrawablesRelative[2];
            }
            if (drawableM3589Ujhhgtgfeyxiexzf4 == null) {
                drawableM3589Ujhhgtgfeyxiexzf4 = compoundDrawablesRelative[r15];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM3589Ujhhgtgfeyxiexzf5, drawableM3589Ujhhgtgfeyxiexzf2, drawableM3589Ujhhgtgfeyxiexzf6, drawableM3589Ujhhgtgfeyxiexzf4);
        } else if (drawableM3589Ujhhgtgfeyxiexzf != null || drawableM3589Ujhhgtgfeyxiexzf2 != null || drawableM3589Ujhhgtgfeyxiexzf3 != null || drawableM3589Ujhhgtgfeyxiexzf4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM3589Ujhhgtgfeyxiexzf == null) {
                    drawableM3589Ujhhgtgfeyxiexzf = compoundDrawables[0];
                }
                if (drawableM3589Ujhhgtgfeyxiexzf2 == null) {
                    drawableM3589Ujhhgtgfeyxiexzf2 = compoundDrawables[1];
                }
                if (drawableM3589Ujhhgtgfeyxiexzf3 == null) {
                    drawableM3589Ujhhgtgfeyxiexzf3 = compoundDrawables[2];
                }
                if (drawableM3589Ujhhgtgfeyxiexzf4 == null) {
                    drawableM3589Ujhhgtgfeyxiexzf4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM3589Ujhhgtgfeyxiexzf, drawableM3589Ujhhgtgfeyxiexzf2, drawableM3589Ujhhgtgfeyxiexzf3, drawableM3589Ujhhgtgfeyxiexzf4);
            } else {
                if (drawableM3589Ujhhgtgfeyxiexzf2 == null) {
                    drawableM3589Ujhhgtgfeyxiexzf2 = compoundDrawablesRelative2[1];
                }
                if (drawableM3589Ujhhgtgfeyxiexzf4 == null) {
                    drawableM3589Ujhhgtgfeyxiexzf4 = compoundDrawablesRelative2[r15];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM3589Ujhhgtgfeyxiexzf2, compoundDrawablesRelative2[2], drawableM3589Ujhhgtgfeyxiexzf4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC3252feyxiexzfUjhhgtg.m4758Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i2 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i3 = -1;
            } else {
                int i8 = typedValuePeekValue.data;
                int i9 = i8 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i8);
                i3 = i9;
                i2 = -1;
            }
        } else {
            i2 = -1;
            i3 = -1;
            dimensionPixelSize = -1.0f;
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i2) {
            AbstractC1265feyxiexzfUjhhgtg.m2835Ujhhgtgfeyxiexzf(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i2) {
            AbstractC1265feyxiexzfUjhhgtg.m2836Ujhhgtgfeyxiexzf(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i3 == i2) {
                AbstractC1265feyxiexzfUjhhgtg.m2837Ujhhgtgfeyxiexzf(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC2959feyxiexzfUjhhgtg.m4419Ujhhgtgfeyxiexzf(textView, i3, dimensionPixelSize);
            } else {
                AbstractC1265feyxiexzfUjhhgtg.m2837Ujhhgtgfeyxiexzf(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m3563Ujhhgtgfeyxiexzf(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0801feyxiexzfUjhhgtg.f3176Ujhhgtgfeyxiexzf);
        C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = new C2366Ujhhgtgfeyxiexzf(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f7670Ujhhgtgfeyxiexzf;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m3566Ujhhgtgfeyxiexzf(context, c2366Ujhhgtgfeyxiexzf);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC2358Ujhhgtgfeyxiexzf.m3576Ujhhgtgfeyxiexzf(textView, string);
        }
        c2366Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        Typeface typeface = this.f7681Ujhhgtgfeyxiexzf;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f7679Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m3564Ujhhgtgfeyxiexzf(ColorStateList colorStateList) {
        if (this.f7677Ujhhgtgfeyxiexzf == null) {
            this.f7677Ujhhgtgfeyxiexzf = new C1741Ujhhgtgfeyxiexzf();
        }
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = this.f7677Ujhhgtgfeyxiexzf;
        c1741Ujhhgtgfeyxiexzf.f5847Ujhhgtgfeyxiexzf = colorStateList;
        c1741Ujhhgtgfeyxiexzf.f5850Ujhhgtgfeyxiexzf = colorStateList != null;
        this.f7671Ujhhgtgfeyxiexzf = c1741Ujhhgtgfeyxiexzf;
        this.f7672Ujhhgtgfeyxiexzf = c1741Ujhhgtgfeyxiexzf;
        this.f7673Ujhhgtgfeyxiexzf = c1741Ujhhgtgfeyxiexzf;
        this.f7674Ujhhgtgfeyxiexzf = c1741Ujhhgtgfeyxiexzf;
        this.f7675Ujhhgtgfeyxiexzf = c1741Ujhhgtgfeyxiexzf;
        this.f7676Ujhhgtgfeyxiexzf = c1741Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3565Ujhhgtgfeyxiexzf(PorterDuff.Mode mode) {
        if (this.f7677Ujhhgtgfeyxiexzf == null) {
            this.f7677Ujhhgtgfeyxiexzf = new C1741Ujhhgtgfeyxiexzf();
        }
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf = this.f7677Ujhhgtgfeyxiexzf;
        c1741Ujhhgtgfeyxiexzf.f5848Ujhhgtgfeyxiexzf = mode;
        c1741Ujhhgtgfeyxiexzf.f5849Ujhhgtgfeyxiexzf = mode != null;
        this.f7671Ujhhgtgfeyxiexzf = c1741Ujhhgtgfeyxiexzf;
        this.f7672Ujhhgtgfeyxiexzf = c1741Ujhhgtgfeyxiexzf;
        this.f7673Ujhhgtgfeyxiexzf = c1741Ujhhgtgfeyxiexzf;
        this.f7674Ujhhgtgfeyxiexzf = c1741Ujhhgtgfeyxiexzf;
        this.f7675Ujhhgtgfeyxiexzf = c1741Ujhhgtgfeyxiexzf;
        this.f7676Ujhhgtgfeyxiexzf = c1741Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m3566Ujhhgtgfeyxiexzf(Context context, C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) {
        String string;
        int i = this.f7679Ujhhgtgfeyxiexzf;
        TypedArray typedArray = (TypedArray) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        this.f7679Ujhhgtgfeyxiexzf = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f7680Ujhhgtgfeyxiexzf = i3;
            if (i3 != -1) {
                this.f7679Ujhhgtgfeyxiexzf &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f7682Ujhhgtgfeyxiexzf = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f7681Ujhhgtgfeyxiexzf = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f7681Ujhhgtgfeyxiexzf = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f7681Ujhhgtgfeyxiexzf = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f7681Ujhhgtgfeyxiexzf = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f7680Ujhhgtgfeyxiexzf;
        int i7 = this.f7679Ujhhgtgfeyxiexzf;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM3603Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf.m3603Ujhhgtgfeyxiexzf(i5, this.f7679Ujhhgtgfeyxiexzf, new C2350Ujhhgtgfeyxiexzf(this, i6, i7, new WeakReference(this.f7670Ujhhgtgfeyxiexzf)));
                if (typefaceM3603Ujhhgtgfeyxiexzf != null) {
                    if (i2 < 28 || this.f7680Ujhhgtgfeyxiexzf == -1) {
                        this.f7681Ujhhgtgfeyxiexzf = typefaceM3603Ujhhgtgfeyxiexzf;
                    } else {
                        this.f7681Ujhhgtgfeyxiexzf = AbstractC2354Ujhhgtgfeyxiexzf.m3567Ujhhgtgfeyxiexzf(Typeface.create(typefaceM3603Ujhhgtgfeyxiexzf, 0), this.f7680Ujhhgtgfeyxiexzf, (this.f7679Ujhhgtgfeyxiexzf & 2) != 0);
                    }
                }
                this.f7682Ujhhgtgfeyxiexzf = this.f7681Ujhhgtgfeyxiexzf == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f7681Ujhhgtgfeyxiexzf != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f7680Ujhhgtgfeyxiexzf == -1) {
            this.f7681Ujhhgtgfeyxiexzf = Typeface.create(string, this.f7679Ujhhgtgfeyxiexzf);
        } else {
            this.f7681Ujhhgtgfeyxiexzf = AbstractC2354Ujhhgtgfeyxiexzf.m3567Ujhhgtgfeyxiexzf(Typeface.create(string, 0), this.f7680Ujhhgtgfeyxiexzf, (this.f7679Ujhhgtgfeyxiexzf & 2) != 0);
        }
    }
}
