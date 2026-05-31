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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᲈᲀᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0242 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final TextView f1443;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C3461 f1444;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C3461 f1445;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C3461 f1446;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C3461 f1447;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C3461 f1448;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C3461 f1449;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C3461 f1450;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0250 f1451;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f1452 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f1453 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Typeface f1454;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f1455;

    public C0242(TextView textView) {
        this.f1443 = textView;
        this.f1451 = new C0250(textView);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C3461 m1435(Context context, C0226 c0226, int i) {
        ColorStateList colorStateListM4612;
        synchronized (c0226) {
            colorStateListM4612 = c0226.f1412.m4612(context, i);
        }
        if (colorStateListM4612 == null) {
            return null;
        }
        C3461 c3461 = new C3461();
        c3461.f10896 = true;
        c3461.f10893 = colorStateListM4612;
        return c3461;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static void m1436(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC0094.m1210(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC0094.m1210(editorInfo, text);
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
            C1787.m3677(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            C1787.m3677(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            C1787.m3677(editorInfo, text, i4, i2);
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
        C1787.m3677(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1437(Drawable drawable, C3461 c3461) {
        if (drawable == null || c3461 == null) {
            return;
        }
        C0226.m1397(drawable, c3461, this.f1443.getDrawableState());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1438() {
        C3461 c3461 = this.f1444;
        TextView textView = this.f1443;
        if (c3461 != null || this.f1445 != null || this.f1446 != null || this.f1447 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m1437(compoundDrawables[0], this.f1444);
            m1437(compoundDrawables[1], this.f1445);
            m1437(compoundDrawables[2], this.f1446);
            m1437(compoundDrawables[3], this.f1447);
        }
        if (this.f1448 == null && this.f1449 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m1437(compoundDrawablesRelative[0], this.f1448);
        m1437(compoundDrawablesRelative[2], this.f1449);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ColorStateList m1439() {
        C3461 c3461 = this.f1450;
        if (c3461 != null) {
            return c3461.f10893;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final PorterDuff.Mode m1440() {
        C3461 c3461 = this.f1450;
        if (c3461 != null) {
            return c3461.f10894;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m1441(AttributeSet attributeSet, int i) {
        C0226 c0226;
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
        int[] iArr = AbstractC2523.f8032;
        int[] iArr2 = AbstractC2523.f8044;
        C0250 c0250 = this.f1451;
        TextView textView = this.f1443;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0226.f1410;
        synchronized (C0226.class) {
            try {
                if (C0226.f1411 == null) {
                    C0226.m1396();
                }
                c0226 = C0226.f1411;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr3 = AbstractC2523.f8031;
        C0253 c0253M1453 = C0253.m1453(context, attributeSet, iArr3, i);
        TextView textView2 = this.f1443;
        AbstractC3638.m5182(textView2, textView2.getContext(), iArr3, attributeSet, (TypedArray) c0253M1453.f1478, i);
        TypedArray typedArray = (TypedArray) c0253M1453.f1478;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f1444 = m1435(context, c0226, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f1445 = m1435(context, c0226, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f1446 = m1435(context, c0226, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f1447 = m1435(context, c0226, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f1448 = m1435(context, c0226, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f1449 = m1435(context, c0226, typedArray.getResourceId(6, 0));
        }
        c0253M1453.m1475();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0253 c0253 = new C0253(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m1445(context, c0253);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c0253.m1475();
        } else {
            string = null;
            z = false;
            z2 = false;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0253 c0254 = new C0253(context, typedArrayObtainStyledAttributes2);
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
        m1445(context, c0254);
        c0254.m1475();
        if (!z3 && z) {
            this.f1443.setAllCaps(z4);
        }
        Typeface typeface = this.f1454;
        if (typeface != null) {
            if (this.f1453 == -1) {
                textView.setTypeface(typeface, this.f1452);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0240.m1433(textView, string);
        }
        if (string2 != null) {
            AbstractC0239.m1429(textView, AbstractC0239.m1428(string2));
        }
        Context context2 = c0250.f1472;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView3 = c0250.f1471;
        AbstractC3638.m5182(textView3, textView3.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0250.f1465 = typedArrayObtainStyledAttributes3.getInt(5, 0);
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
                int[] iArrM1449 = C0250.m1449(iArr4);
                c0250.f1469 = iArrM1449;
                int length2 = iArrM1449.length;
                boolean z5 = length2 > 0;
                c0250.f1470 = z5;
                if (z5) {
                    c0250.f1465 = 1;
                    c0250.f1467 = iArrM1449[0];
                    c0250.f1468 = iArrM1449[length2 - 1];
                    c0250.f1466 = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0250.m1450()) {
            c0250.f1465 = 0;
        } else if (c0250.f1465 == 1) {
            if (!c0250.f1470) {
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
                c0250.f1465 = 1;
                c0250.f1467 = dimension2;
                c0250.f1468 = dimension3;
                c0250.f1466 = dimension;
                c0250.f1470 = false;
            }
            if (c0250.m1450() && c0250.f1465 == 1 && (!c0250.f1470 || c0250.f1469.length == 0)) {
                int iFloor = ((int) Math.floor((c0250.f1468 - c0250.f1467) / c0250.f1466)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i7 = 0; i7 < iFloor; i7++) {
                    iArr5[i7] = Math.round((i7 * c0250.f1466) + c0250.f1467);
                }
                c0250.f1469 = C0250.m1449(iArr5);
            }
        }
        if (c0250.f1465 != 0) {
            int[] iArr6 = c0250.f1469;
            if (iArr6.length > 0) {
                if (AbstractC0240.m1430(textView) != -1.0f) {
                    AbstractC0240.m1431(textView, Math.round(c0250.f1467), Math.round(c0250.f1468), Math.round(c0250.f1466), 0);
                } else {
                    AbstractC0240.m1432(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM1398 = resourceId4 != -1 ? c0226.m1398(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM1399 = resourceId5 != -1 ? c0226.m1398(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM13910 = resourceId6 != -1 ? c0226.m1398(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM13911 = resourceId7 != -1 ? c0226.m1398(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM13912 = resourceId8 != -1 ? c0226.m1398(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM13913 = resourceId9 != -1 ? c0226.m1398(context, resourceId9) : null;
        if (drawableM13912 != null || drawableM13913 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM13912 == null) {
                drawableM13912 = compoundDrawablesRelative[0];
            }
            if (drawableM1399 == null) {
                drawableM1399 = compoundDrawablesRelative[1];
            }
            if (drawableM13913 == null) {
                drawableM13913 = compoundDrawablesRelative[2];
            }
            if (drawableM13911 == null) {
                drawableM13911 = compoundDrawablesRelative[r15];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM13912, drawableM1399, drawableM13913, drawableM13911);
        } else if (drawableM1398 != null || drawableM1399 != null || drawableM13910 != null || drawableM13911 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM1398 == null) {
                    drawableM1398 = compoundDrawables[0];
                }
                if (drawableM1399 == null) {
                    drawableM1399 = compoundDrawables[1];
                }
                if (drawableM13910 == null) {
                    drawableM13910 = compoundDrawables[2];
                }
                if (drawableM13911 == null) {
                    drawableM13911 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM1398, drawableM1399, drawableM13910, drawableM13911);
            } else {
                if (drawableM1399 == null) {
                    drawableM1399 = compoundDrawablesRelative2[1];
                }
                if (drawableM13911 == null) {
                    drawableM13911 = compoundDrawablesRelative2[r15];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM1399, compoundDrawablesRelative2[2], drawableM13911);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC1469.m3333(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC1111.m2825(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
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
            AbstractC0972.m2603(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i2) {
            AbstractC0972.m2604(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i3 == i2) {
                AbstractC0972.m2605(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0096.m1221(textView, i3, dimensionPixelSize);
            } else {
                AbstractC0972.m2605(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m1442(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC2523.f8044);
        C0253 c0253 = new C0253(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f1443;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m1445(context, c0253);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0240.m1433(textView, string);
        }
        c0253.m1475();
        Typeface typeface = this.f1454;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1452);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1443(ColorStateList colorStateList) {
        if (this.f1450 == null) {
            this.f1450 = new C3461();
        }
        C3461 c3461 = this.f1450;
        c3461.f10893 = colorStateList;
        c3461.f10896 = colorStateList != null;
        this.f1444 = c3461;
        this.f1445 = c3461;
        this.f1446 = c3461;
        this.f1447 = c3461;
        this.f1448 = c3461;
        this.f1449 = c3461;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m1444(PorterDuff.Mode mode) {
        if (this.f1450 == null) {
            this.f1450 = new C3461();
        }
        C3461 c3461 = this.f1450;
        c3461.f10894 = mode;
        c3461.f10895 = mode != null;
        this.f1444 = c3461;
        this.f1445 = c3461;
        this.f1446 = c3461;
        this.f1447 = c3461;
        this.f1448 = c3461;
        this.f1449 = c3461;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m1445(Context context, C0253 c0253) {
        String string;
        int i = this.f1452;
        TypedArray typedArray = (TypedArray) c0253.f1478;
        this.f1452 = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f1453 = i3;
            if (i3 != -1) {
                this.f1452 &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f1455 = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f1454 = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f1454 = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f1454 = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1454 = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f1453;
        int i7 = this.f1452;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM1467 = c0253.m1467(i5, this.f1452, new C0237(this, i6, i7, new WeakReference(this.f1443)));
                if (typefaceM1467 != null) {
                    if (i2 < 28 || this.f1453 == -1) {
                        this.f1454 = typefaceM1467;
                    } else {
                        this.f1454 = AbstractC0241.m1434(Typeface.create(typefaceM1467, 0), this.f1453, (this.f1452 & 2) != 0);
                    }
                }
                this.f1455 = this.f1454 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1454 != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1453 == -1) {
            this.f1454 = Typeface.create(string, this.f1452);
        } else {
            this.f1454 = AbstractC0241.m1434(Typeface.create(string, 0), this.f1453, (this.f1452 & 2) != 0);
        }
    }
}
