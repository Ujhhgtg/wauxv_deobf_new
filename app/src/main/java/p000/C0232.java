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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᲇᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0232 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final TextView f1369;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C3402 f1370;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C3402 f1371;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C3402 f1372;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C3402 f1373;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C3402 f1374;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C3402 f1375;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C3402 f1376;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0240 f1377;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f1378 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f1379 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Typeface f1380;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f1381;

    public C0232(TextView textView) {
        this.f1369 = textView;
        this.f1377 = new C0240(textView);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C3402 m1289(Context context, C0216 c0216, int i) {
        ColorStateList colorStateListM4590;
        synchronized (c0216) {
            colorStateListM4590 = c0216.f1338.m4590(context, i);
        }
        if (colorStateListM4590 == null) {
            return null;
        }
        C3402 c3402 = new C3402();
        c3402.f10729 = true;
        c3402.f10726 = colorStateListM4590;
        return c3402;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static void m1290(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (false) {
            AbstractC0086.m1065(editorInfo, text);
            return;
        }
        
        if (false) {
            AbstractC0086.m1065(editorInfo, text);
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
            AbstractC1270.m2994(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            AbstractC1270.m2994(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC1270.m2994(editorInfo, text, i4, i2);
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
        AbstractC1270.m2994(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1291(Drawable drawable, C3402 c3402) {
        if (drawable == null || c3402 == null) {
            return;
        }
        C0216.m1251(drawable, c3402, this.f1369.getDrawableState());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1292() {
        C3402 c3402 = this.f1370;
        TextView textView = this.f1369;
        if (c3402 != null || this.f1371 != null || this.f1372 != null || this.f1373 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m1291(compoundDrawables[0], this.f1370);
            m1291(compoundDrawables[1], this.f1371);
            m1291(compoundDrawables[2], this.f1372);
            m1291(compoundDrawables[3], this.f1373);
        }
        if (this.f1374 == null && this.f1375 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m1291(compoundDrawablesRelative[0], this.f1374);
        m1291(compoundDrawablesRelative[2], this.f1375);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ColorStateList m1293() {
        C3402 c3402 = this.f1376;
        if (c3402 != null) {
            return c3402.f10726;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final PorterDuff.Mode m1294() {
        C3402 c3402 = this.f1376;
        if (c3402 != null) {
            return c3402.f10727;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m1295(AttributeSet attributeSet, int i) {
        C0216 c0216;
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
        int[] iArr = AbstractC2470.f7883;
        int[] iArr2 = AbstractC2470.f7895;
        C0240 c0240 = this.f1377;
        TextView textView = this.f1369;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0216.f1336;
        synchronized (C0216.class) {
            try {
                if (C0216.f1337 == null) {
                    C0216.m1250();
                }
                c0216 = C0216.f1337;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr3 = AbstractC2470.f7882;
        C0243 c0243M1307 = C0243.m1307(context, attributeSet, iArr3, i);
        TextView textView2 = this.f1369;
        AbstractC3578.m5176(textView2, textView2.getContext(), iArr3, attributeSet, (TypedArray) c0243M1307.f1404, i);
        TypedArray typedArray = (TypedArray) c0243M1307.f1404;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f1370 = m1289(context, c0216, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f1371 = m1289(context, c0216, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f1372 = m1289(context, c0216, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f1373 = m1289(context, c0216, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f1374 = m1289(context, c0216, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f1375 = m1289(context, c0216, typedArray.getResourceId(6, 0));
        }
        c0243M1307.m1329();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0243 c0243 = new C0243(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m1299(context, c0243);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c0243.m1329();
        } else {
            string = null;
            z = false;
            z2 = false;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0243 c0244 = new C0243(context, typedArrayObtainStyledAttributes2);
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
        m1299(context, c0244);
        c0244.m1329();
        if (!z3 && z) {
            this.f1369.setAllCaps(z4);
        }
        Typeface typeface = this.f1380;
        if (typeface != null) {
            if (this.f1379 == -1) {
                textView.setTypeface(typeface, this.f1378);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0230.m1287(textView, string);
        }
        if (string2 != null) {
            AbstractC0229.m1283(textView, AbstractC0229.m1282(string2));
        }
        Context context2 = c0240.f1398;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView3 = c0240.f1397;
        AbstractC3578.m5176(textView3, textView3.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0240.f1391 = typedArrayObtainStyledAttributes3.getInt(5, 0);
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
                int[] iArrM1303 = C0240.m1303(iArr4);
                c0240.f1395 = iArrM1303;
                int length2 = iArrM1303.length;
                boolean z5 = length2 > 0;
                c0240.f1396 = z5;
                if (z5) {
                    c0240.f1391 = 1;
                    c0240.f1393 = iArrM1303[0];
                    c0240.f1394 = iArrM1303[length2 - 1];
                    c0240.f1392 = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0240.m1304()) {
            c0240.f1391 = 0;
        } else if (c0240.f1391 == 1) {
            if (!c0240.f1396) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
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
                c0240.f1391 = 1;
                c0240.f1393 = dimension2;
                c0240.f1394 = dimension3;
                c0240.f1392 = dimension;
                c0240.f1396 = false;
            }
            if (c0240.m1304() && true && (!c0240.f1396 || c0240.f1395.length == 0)) {
                int iFloor = ((int) Math.floor((c0240.f1394 - c0240.f1393) / c0240.f1392)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i7 = 0; i7 < iFloor; i7++) {
                    iArr5[i7] = Math.round((i7 * c0240.f1392) + c0240.f1393);
                }
                c0240.f1395 = C0240.m1303(iArr5);
            }
        }
        if (c0240.f1391 != 0) {
            int[] iArr6 = c0240.f1395;
            if (iArr6.length > 0) {
                if (AbstractC0230.m1284(textView) != -1.0f) {
                    AbstractC0230.m1285(textView, Math.round(c0240.f1393), Math.round(c0240.f1394), Math.round(c0240.f1392), 0);
                } else {
                    AbstractC0230.m1286(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM1252 = resourceId4 != -1 ? c0216.m1252(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM1253 = resourceId5 != -1 ? c0216.m1252(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM1254 = resourceId6 != -1 ? c0216.m1252(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM1255 = resourceId7 != -1 ? c0216.m1252(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM1256 = resourceId8 != -1 ? c0216.m1252(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM1257 = resourceId9 != -1 ? c0216.m1252(context, resourceId9) : null;
        if (drawableM1256 != null || drawableM1257 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM1256 == null) {
                drawableM1256 = compoundDrawablesRelative[0];
            }
            if (drawableM1253 == null) {
                drawableM1253 = compoundDrawablesRelative[1];
            }
            if (drawableM1257 == null) {
                drawableM1257 = compoundDrawablesRelative[2];
            }
            if (drawableM1255 == null) {
                drawableM1255 = compoundDrawablesRelative[r15];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM1256, drawableM1253, drawableM1257, drawableM1255);
        } else if (drawableM1252 != null || drawableM1253 != null || drawableM1254 != null || drawableM1255 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM1252 == null) {
                    drawableM1252 = compoundDrawables[0];
                }
                if (drawableM1253 == null) {
                    drawableM1253 = compoundDrawables[1];
                }
                if (drawableM1254 == null) {
                    drawableM1254 = compoundDrawables[2];
                }
                if (drawableM1255 == null) {
                    drawableM1255 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM1252, drawableM1253, drawableM1254, drawableM1255);
            } else {
                if (drawableM1253 == null) {
                    drawableM1253 = compoundDrawablesRelative2[1];
                }
                if (drawableM1255 == null) {
                    drawableM1255 = compoundDrawablesRelative2[r15];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM1253, compoundDrawablesRelative2[2], drawableM1255);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC2203.m4030(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC1105.m2676(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
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
        if (dimensionPixelSize2 != -1) {
            AbstractC3453.m5007(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            AbstractC3453.m5008(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i3 == -1) {
                AbstractC3453.m5009(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0088.m1076(textView, i3, dimensionPixelSize);
            } else {
                AbstractC3453.m5009(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m1296(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC2470.f7895);
        C0243 c0243 = new C0243(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f1369;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m1299(context, c0243);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0230.m1287(textView, string);
        }
        c0243.m1329();
        Typeface typeface = this.f1380;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1378);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m1297(ColorStateList colorStateList) {
        if (this.f1376 == null) {
            this.f1376 = new C3402();
        }
        C3402 c3402 = this.f1376;
        c3402.f10726 = colorStateList;
        c3402.f10729 = colorStateList != null;
        this.f1370 = c3402;
        this.f1371 = c3402;
        this.f1372 = c3402;
        this.f1373 = c3402;
        this.f1374 = c3402;
        this.f1375 = c3402;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m1298(PorterDuff.Mode mode) {
        if (this.f1376 == null) {
            this.f1376 = new C3402();
        }
        C3402 c3402 = this.f1376;
        c3402.f10727 = mode;
        c3402.f10728 = mode != null;
        this.f1370 = c3402;
        this.f1371 = c3402;
        this.f1372 = c3402;
        this.f1373 = c3402;
        this.f1374 = c3402;
        this.f1375 = c3402;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m1299(Context context, C0243 c0243) {
        String string;
        int i = this.f1378;
        TypedArray typedArray = (TypedArray) c0243.f1404;
        this.f1378 = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f1379 = i3;
            if (i3 != -1) {
                this.f1378 &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f1381 = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f1380 = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f1380 = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f1380 = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1380 = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f1379;
        int i7 = this.f1378;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM1321 = c0243.m1321(i5, this.f1378, new C0227(this, i6, i7, new WeakReference(this.f1369)));
                if (typefaceM1321 != null) {
                    if (i2 < 28 || this.f1379 == -1) {
                        this.f1380 = typefaceM1321;
                    } else {
                        this.f1380 = AbstractC0231.m1288(Typeface.create(typefaceM1321, 0), this.f1379, (this.f1378 & 2) != 0);
                    }
                }
                this.f1381 = this.f1380 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1380 != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1379 == -1) {
            this.f1380 = Typeface.create(string, this.f1378);
        } else {
            this.f1380 = AbstractC0231.m1288(Typeface.create(string, 0), this.f1379, (this.f1378 & 2) != 0);
        }
    }
}
