package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3542 extends AbstractC3533 {

    public static final PorterDuff.Mode f11121 = PorterDuff.Mode.SRC_IN;

    public C3540 f11122;

    public PorterDuffColorFilter f11123;

    public ColorFilter f11124;

    public boolean f11125;

    public boolean f11126;

    public final float[] f11127;

    public final Matrix f11128;

    public final Rect f11129;

    public C3542() {
        this.f11126 = true;
        this.f11127 = new float[9];
        this.f11128 = new Matrix();
        this.f11129 = new Rect();
        C3540 c3540 = new C3540();
        c3540.f11110 = null;
        c3540.f11111 = f11121;
        c3540.f11109 = new C3539();
        this.f11122 = c3540;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f11066;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f11129;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f11124;
        if (colorFilter == null) {
            colorFilter = this.f11123;
        }
        Matrix matrix = this.f11128;
        canvas.getMatrix(matrix);
        float[] fArr = this.f11127;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C3540 c3540 = this.f11122;
        Bitmap bitmap = c3540.f11113;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c3540.f11113.getHeight()) {
            c3540.f11113 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c3540.f11118 = true;
        }
        if (this.f11126) {
            C3540 c3541 = this.f11122;
            if (c3541.f11118 || c3541.f11114 != c3541.f11110 || c3541.f11115 != c3541.f11111 || c3541.f11117 != c3541.f11112 || c3541.f11116 != c3541.f11109.getRootAlpha()) {
                C3540 c3542 = this.f11122;
                c3542.f11113.eraseColor(0);
                Canvas canvas2 = new Canvas(c3542.f11113);
                C3539 c3539 = c3542.f11109;
                c3539.m5131(c3539.f11099, C3539.f11092, canvas2, iMin, iMin2);
                C3540 c3543 = this.f11122;
                c3543.f11114 = c3543.f11110;
                c3543.f11115 = c3543.f11111;
                c3543.f11116 = c3543.f11109.getRootAlpha();
                c3543.f11117 = c3543.f11112;
                c3543.f11118 = false;
            }
        } else {
            C3540 c3544 = this.f11122;
            c3544.f11113.eraseColor(0);
            Canvas canvas3 = new Canvas(c3544.f11113);
            C3539 c35310 = c3544.f11109;
            c35310.m5131(c35310.f11099, C3539.f11092, canvas3, iMin, iMin2);
        }
        C3540 c3545 = this.f11122;
        if (c3545.f11109.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c3545.f11119 == null) {
                Paint paint2 = new Paint();
                c3545.f11119 = paint2;
                paint2.setFilterBitmap(true);
            }
            c3545.f11119.setAlpha(c3545.f11109.getRootAlpha());
            c3545.f11119.setColorFilter(colorFilter);
            paint = c3545.f11119;
        }
        canvas.drawBitmap(c3545.f11113, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.getAlpha() : this.f11122.f11109.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11122.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.getColorFilter() : this.f11124;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f11066 != null) {
            return new C3541(this.f11066.getConstantState());
        }
        this.f11122.f11108 = getChangingConfigurations();
        return this.f11122;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f11122.f11109.f11101;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f11122.f11109.f11100;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.isAutoMirrored() : this.f11122.f11112;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C3540 c3540 = this.f11122;
        if (c3540 == null) {
            return false;
        }
        C3539 c3539 = c3540.f11109;
        if (c3539.f11106 == null) {
            c3539.f11106 = Boolean.valueOf(c3539.f11099.mo5128());
        }
        if (c3539.f11106.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f11122.f11110;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11125 && super.mutate() == this) {
            C3540 c3540 = this.f11122;
            C3540 c3541 = new C3540();
            c3541.f11110 = null;
            c3541.f11111 = f11121;
            if (c3540 != null) {
                c3541.f11108 = c3540.f11108;
                C3539 c3539 = new C3539(c3540.f11109);
                c3541.f11109 = c3539;
                if (c3540.f11109.f11097 != null) {
                    c3539.f11097 = new Paint(c3540.f11109.f11097);
                }
                if (c3540.f11109.f11096 != null) {
                    c3541.f11109.f11096 = new Paint(c3540.f11109.f11096);
                }
                c3541.f11110 = c3540.f11110;
                c3541.f11111 = c3540.f11111;
                c3541.f11112 = c3540.f11112;
            }
            this.f11122 = c3541;
            this.f11125 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f11066;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C3540 c3540 = this.f11122;
        ColorStateList colorStateList = c3540.f11110;
        if (colorStateList == null || (mode = c3540.f11111) == null) {
            z = false;
        } else {
            this.f11123 = m5132(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C3539 c3539 = c3540.f11109;
        if (c3539.f11106 == null) {
            c3539.f11106 = Boolean.valueOf(c3539.f11099.mo5128());
        }
        if (c3539.f11106.booleanValue()) {
            boolean zMo5129 = c3540.f11109.f11099.mo5129(iArr);
            c3540.f11118 |= zMo5129;
            if (zMo5129) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f11122.f11109.getRootAlpha() != i) {
            this.f11122.f11109.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f11122.f11112 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11124 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C3540 c3540 = this.f11122;
        if (c3540.f11110 != colorStateList) {
            c3540.f11110 = colorStateList;
            this.f11123 = m5132(colorStateList, c3540.f11111);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C3540 c3540 = this.f11122;
        if (c3540.f11111 != mode) {
            c3540.f11111 = mode;
            this.f11123 = m5132(c3540.f11110, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f11066;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final PorterDuffColorFilter m5132(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c;
        int i2;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f11066;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C3540 c3540 = this.f11122;
        c3540.f11109 = new C3539();
        TypedArray typedArrayM3165 = AbstractC1458.m3165(resources, theme, attributeSet, AbstractC1270.f4634);
        C3540 c3541 = this.f11122;
        C3539 c3539 = c3541.f11109;
        int i3 = !AbstractC1458.m3160(xmlPullParser, "tintMode") ? -1 : typedArrayM3165.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14 /* 14 */:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c3541.f11111 = mode;
        ColorStateList colorStateListM2220 = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM3165.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateListM2220 = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM3165.getResources();
                int resourceId = typedArrayM3165.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0751.f2842;
                try {
                    colorStateListM2220 = AbstractC0751.m2220(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListM2220;
        if (colorStateList != null) {
            c3541.f11110 = colorStateList;
        }
        boolean z = c3541.f11112;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayM3165.getBoolean(5, z);
        }
        c3541.f11112 = z;
        float f = c3539.f11102;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM3165.getFloat(7, f);
        }
        c3539.f11102 = f;
        float f2 = c3539.f11103;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM3165.getFloat(8, f2);
        }
        c3539.f11103 = f2;
        if (c3539.f11102 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM3165.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            c3539.f11100 = typedArrayM3165.getDimension(3, c3539.f11100);
            float dimension = typedArrayM3165.getDimension(2, c3539.f11101);
            c3539.f11101 = dimension;
            if (c3539.f11100 <= 0.0f) {
                throw new XmlPullParserException(typedArrayM3165.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c3539.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayM3165.getFloat(4, alpha);
                }
                c3539.setAlpha(alpha);
                String string = typedArrayM3165.getString(0);
                if (string != null) {
                    c3539.f11105 = string;
                    c3539.f11107.put(string, c3539);
                }
                typedArrayM3165.recycle();
                c3540.f11108 = getChangingConfigurations();
                c3540.f11118 = true;
                C3540 c3542 = this.f11122;
                C3539 c35310 = c3542.f11109;
                ArrayDeque arrayDeque = new ArrayDeque();
                C3536 c3536 = c35310.f11099;
                C0264 c0264 = c35310.f11107;
                arrayDeque.push(c3536);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C3536 c3537 = (C3536) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            C3535 c3535 = new C3535();
                            c3535.f11068 = 0.0f;
                            c3535.f11070 = 1.0f;
                            c3535.f11071 = 1.0f;
                            c3535.f11072 = 0.0f;
                            c3535.f11073 = 1.0f;
                            c3535.f11074 = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c3535.f11075 = Paint.Cap.BUTT;
                            Paint.Join join2 = Paint.Join.MITER;
                            c3535.f11076 = Paint.Join.MITER;
                            c3535.f11077 = 4.0f;
                            TypedArray typedArrayM3166 = AbstractC1458.m3165(resources, theme, attributeSet, AbstractC1270.f4636);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayM3166.getString(0);
                                if (string2 != null) {
                                    c3535.f11090 = string2;
                                }
                                String string3 = typedArrayM3166.getString(2);
                                if (string3 != null) {
                                    c3535.f11089 = AbstractC3681.m5320(string3);
                                }
                                c3535.f11069 = AbstractC1458.m3158(typedArrayM3166, xmlPullParser, theme, "fillColor", 1);
                                float f3 = c3535.f11071;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = typedArrayM3166.getFloat(12, f3);
                                }
                                c3535.f11071 = f3;
                                int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM3166.getInt(8, -1) : -1;
                                Paint.Cap cap3 = c3535.f11075;
                                if (i6 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (i6 != 1) {
                                    cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c3535.f11075 = cap;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM3166.getInt(9, -1) : -1;
                                Paint.Join join3 = c3535.f11076;
                                if (i7 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (i7 != 1) {
                                    join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                c3535.f11076 = join;
                                float f4 = c3535.f11077;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = typedArrayM3166.getFloat(10, f4);
                                }
                                c3535.f11077 = f4;
                                c3535.f11067 = AbstractC1458.m3158(typedArrayM3166, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = c3535.f11070;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = typedArrayM3166.getFloat(11, f5);
                                }
                                c3535.f11070 = f5;
                                float f6 = c3535.f11068;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = typedArrayM3166.getFloat(4, f6);
                                }
                                c3535.f11068 = f6;
                                float f7 = c3535.f11073;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = typedArrayM3166.getFloat(6, f7);
                                }
                                c3535.f11073 = f7;
                                float f8 = c3535.f11074;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = typedArrayM3166.getFloat(7, f8);
                                }
                                c3535.f11074 = f8;
                                float f9 = c3535.f11072;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = typedArrayM3166.getFloat(5, f9);
                                }
                                c3535.f11072 = f9;
                                int i8 = c3535.f11091;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i8 = typedArrayM3166.getInt(13, i8);
                                }
                                c3535.f11091 = i8;
                            }
                            typedArrayM3166.recycle();
                            c3537.f11079.add(c3535);
                            if (c3535.getPathName() != null) {
                                c0264.put(c3535.getPathName(), c3535);
                            }
                            c3542.f11108 = c3542.f11108;
                            z2 = false;
                            c = '\b';
                        } else {
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                C3534 c3534 = new C3534();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayM3167 = AbstractC1458.m3165(resources, theme, attributeSet, AbstractC1270.f4637);
                                    String string4 = typedArrayM3167.getString(0);
                                    if (string4 != null) {
                                        c3534.f11090 = string4;
                                    }
                                    String string5 = typedArrayM3167.getString(1);
                                    if (string5 != null) {
                                        c3534.f11089 = AbstractC3681.m5320(string5);
                                    }
                                    c3534.f11091 = !AbstractC1458.m3160(xmlPullParser, "fillType") ? 0 : typedArrayM3167.getInt(2, 0);
                                    typedArrayM3167.recycle();
                                }
                                c3537.f11079.add(c3534);
                                if (c3534.getPathName() != null) {
                                    c0264.put(c3534.getPathName(), c3534);
                                }
                                c3542.f11108 = c3542.f11108;
                            } else if ("group".equals(name)) {
                                C3536 c3538 = new C3536();
                                TypedArray typedArrayM3168 = AbstractC1458.m3165(resources, theme, attributeSet, AbstractC1270.f4635);
                                float f10 = c3538.f11080;
                                if (AbstractC1458.m3160(xmlPullParser, "rotation")) {
                                    f10 = typedArrayM3168.getFloat(5, f10);
                                }
                                c3538.f11080 = f10;
                                c3538.f11081 = typedArrayM3168.getFloat(1, c3538.f11081);
                                c3538.f11082 = typedArrayM3168.getFloat(2, c3538.f11082);
                                float f11 = c3538.f11083;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = typedArrayM3168.getFloat(3, f11);
                                }
                                c3538.f11083 = f11;
                                float f12 = c3538.f11084;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = typedArrayM3168.getFloat(4, f12);
                                }
                                c3538.f11084 = f12;
                                float f13 = c3538.f11085;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = typedArrayM3168.getFloat(6, f13);
                                }
                                c3538.f11085 = f13;
                                float f14 = c3538.f11086;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = typedArrayM3168.getFloat(7, f14);
                                }
                                c3538.f11086 = f14;
                                String string6 = typedArrayM3168.getString(0);
                                if (string6 != null) {
                                    c3538.f11088 = string6;
                                }
                                c3538.m5130();
                                typedArrayM3168.recycle();
                                c3537.f11079.add(c3538);
                                arrayDeque.push(c3538);
                                if (c3538.getGroupName() != null) {
                                    c0264.put(c3538.getGroupName(), c3538);
                                }
                                c3542.f11108 = c3542.f11108;
                            }
                        }
                        i2 = 1;
                    } else {
                        i = depth;
                        c = '\b';
                        i2 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i4 = 1;
                    depth = i;
                }
                if (!z2) {
                    this.f11123 = m5132(c3540.f11110, c3540.f11111);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM3165.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM3165.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C3542(C3540 c3540) {
        this.f11126 = true;
        this.f11127 = new float[9];
        this.f11128 = new Matrix();
        this.f11129 = new Rect();
        this.f11122 = c3540;
        this.f11123 = m5132(c3540.f11110, c3540.f11111);
    }
}
