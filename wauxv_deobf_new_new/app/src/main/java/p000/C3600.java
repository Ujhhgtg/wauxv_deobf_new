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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᲀᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3600 extends AbstractC3591 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final PorterDuff.Mode f11270 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C3598 f11271;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public PorterDuffColorFilter f11272;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public ColorFilter f11273;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f11274;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f11275;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final float[] f11276;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Matrix f11277;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Rect f11278;

    public C3600() {
        this.f11275 = true;
        this.f11276 = new float[9];
        this.f11277 = new Matrix();
        this.f11278 = new Rect();
        C3598 c3598 = new C3598();
        c3598.f11259 = null;
        c3598.f11260 = f11270;
        c3598.f11258 = new C3597();
        this.f11271 = c3598;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f11215;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f11278;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f11273;
        if (colorFilter == null) {
            colorFilter = this.f11272;
        }
        Matrix matrix = this.f11277;
        canvas.getMatrix(matrix);
        float[] fArr = this.f11276;
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
        C3598 c3598 = this.f11271;
        Bitmap bitmap = c3598.f11262;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c3598.f11262.getHeight()) {
            c3598.f11262 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c3598.f11267 = true;
        }
        if (this.f11275) {
            C3598 c3599 = this.f11271;
            if (c3599.f11267 || c3599.f11263 != c3599.f11259 || c3599.f11264 != c3599.f11260 || c3599.f11266 != c3599.f11261 || c3599.f11265 != c3599.f11258.getRootAlpha()) {
                C3598 c35910 = this.f11271;
                c35910.f11262.eraseColor(0);
                Canvas canvas2 = new Canvas(c35910.f11262);
                C3597 c3597 = c35910.f11258;
                c3597.m5137(c3597.f11248, C3597.f11241, canvas2, iMin, iMin2);
                C3598 c35911 = this.f11271;
                c35911.f11263 = c35911.f11259;
                c35911.f11264 = c35911.f11260;
                c35911.f11265 = c35911.f11258.getRootAlpha();
                c35911.f11266 = c35911.f11261;
                c35911.f11267 = false;
            }
        } else {
            C3598 c35912 = this.f11271;
            c35912.f11262.eraseColor(0);
            Canvas canvas3 = new Canvas(c35912.f11262);
            C3597 c35913 = c35912.f11258;
            c35913.m5137(c35913.f11248, C3597.f11241, canvas3, iMin, iMin2);
        }
        C3598 c35914 = this.f11271;
        if (c35914.f11258.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c35914.f11268 == null) {
                Paint paint2 = new Paint();
                c35914.f11268 = paint2;
                paint2.setFilterBitmap(true);
            }
            c35914.f11268.setAlpha(c35914.f11258.getRootAlpha());
            c35914.f11268.setColorFilter(colorFilter);
            paint = c35914.f11268;
        }
        canvas.drawBitmap(c35914.f11262, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.getAlpha() : this.f11271.f11258.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11271.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.getColorFilter() : this.f11273;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f11215 != null) {
            return new C3599(this.f11215.getConstantState());
        }
        this.f11271.f11257 = getChangingConfigurations();
        return this.f11271;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f11271.f11258.f11250;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f11271.f11258.f11249;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.isAutoMirrored() : this.f11271.f11261;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C3598 c3598 = this.f11271;
        if (c3598 == null) {
            return false;
        }
        C3597 c3597 = c3598.f11258;
        if (c3597.f11255 == null) {
            c3597.f11255 = Boolean.valueOf(c3597.f11248.mo5134());
        }
        if (c3597.f11255.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f11271.f11259;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11274 && super.mutate() == this) {
            C3598 c3598 = this.f11271;
            C3598 c3599 = new C3598();
            c3599.f11259 = null;
            c3599.f11260 = f11270;
            if (c3598 != null) {
                c3599.f11257 = c3598.f11257;
                C3597 c3597 = new C3597(c3598.f11258);
                c3599.f11258 = c3597;
                if (c3598.f11258.f11246 != null) {
                    c3597.f11246 = new Paint(c3598.f11258.f11246);
                }
                if (c3598.f11258.f11245 != null) {
                    c3599.f11258.f11245 = new Paint(c3598.f11258.f11245);
                }
                c3599.f11259 = c3598.f11259;
                c3599.f11260 = c3598.f11260;
                c3599.f11261 = c3598.f11261;
            }
            this.f11271 = c3599;
            this.f11274 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f11215;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C3598 c3598 = this.f11271;
        ColorStateList colorStateList = c3598.f11259;
        if (colorStateList == null || (mode = c3598.f11260) == null) {
            z = false;
        } else {
            this.f11272 = m5138(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C3597 c3597 = c3598.f11258;
        if (c3597.f11255 == null) {
            c3597.f11255 = Boolean.valueOf(c3597.f11248.mo5134());
        }
        if (c3597.f11255.booleanValue()) {
            boolean zMo5135 = c3598.f11258.f11248.mo5135(iArr);
            c3598.f11267 |= zMo5135;
            if (zMo5135) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f11271.f11258.getRootAlpha() != i) {
            this.f11271.f11258.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f11271.f11261 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11273 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C3598 c3598 = this.f11271;
        if (c3598.f11259 != colorStateList) {
            c3598.f11259 = colorStateList;
            this.f11272 = m5138(colorStateList, c3598.f11260);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C3598 c3598 = this.f11271;
        if (c3598.f11260 != mode) {
            c3598.f11260 = mode;
            this.f11272 = m5138(c3598.f11259, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f11215;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final PorterDuffColorFilter m5138(ColorStateList colorStateList, PorterDuff.Mode mode) {
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
        Drawable drawable = this.f11215;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C3598 c3598 = this.f11271;
        c3598.f11258 = new C3597();
        TypedArray typedArrayM3402 = AbstractC1471.m3402(resources, theme, attributeSet, AbstractC1272.f4633);
        C3598 c3599 = this.f11271;
        C3597 c3597 = c3599.f11258;
        int i3 = !AbstractC1471.m3395(xmlPullParser, "tintMode") ? -1 : typedArrayM3402.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case Opcodes.DCONST_0 /* 14 */:
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
        c3599.f11260 = mode;
        ColorStateList colorStateListM2320 = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM3402.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateListM2320 = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM3402.getResources();
                int resourceId = typedArrayM3402.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0746.f2838;
                try {
                    colorStateListM2320 = AbstractC0746.m2320(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListM2320;
        if (colorStateList != null) {
            c3599.f11259 = colorStateList;
        }
        boolean z = c3599.f11261;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayM3402.getBoolean(5, z);
        }
        c3599.f11261 = z;
        float f = c3597.f11251;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM3402.getFloat(7, f);
        }
        c3597.f11251 = f;
        float f2 = c3597.f11252;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM3402.getFloat(8, f2);
        }
        c3597.f11252 = f2;
        if (c3597.f11251 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM3402.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            c3597.f11249 = typedArrayM3402.getDimension(3, c3597.f11249);
            float dimension = typedArrayM3402.getDimension(2, c3597.f11250);
            c3597.f11250 = dimension;
            if (c3597.f11249 <= 0.0f) {
                throw new XmlPullParserException(typedArrayM3402.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c3597.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayM3402.getFloat(4, alpha);
                }
                c3597.setAlpha(alpha);
                String string = typedArrayM3402.getString(0);
                if (string != null) {
                    c3597.f11254 = string;
                    c3597.f11256.put(string, c3597);
                }
                typedArrayM3402.recycle();
                c3598.f11257 = getChangingConfigurations();
                c3598.f11267 = true;
                C3598 c35910 = this.f11271;
                C3597 c35911 = c35910.f11258;
                ArrayDeque arrayDeque = new ArrayDeque();
                C3594 c3594 = c35911.f11248;
                C0274 c0274 = c35911.f11256;
                arrayDeque.push(c3594);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C3594 c3595 = (C3594) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            C3593 c3593 = new C3593();
                            c3593.f11217 = 0.0f;
                            c3593.f11219 = 1.0f;
                            c3593.f11220 = 1.0f;
                            c3593.f11221 = 0.0f;
                            c3593.f11222 = 1.0f;
                            c3593.f11223 = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c3593.f11224 = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            c3593.f11225 = join2;
                            c3593.f11226 = 4.0f;
                            TypedArray typedArrayM3403 = AbstractC1471.m3402(resources, theme, attributeSet, AbstractC1272.f4635);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayM3403.getString(0);
                                if (string2 != null) {
                                    c3593.f11239 = string2;
                                }
                                String string3 = typedArrayM3403.getString(2);
                                if (string3 != null) {
                                    c3593.f11238 = AbstractC1471.m3380(string3);
                                }
                                c3593.f11218 = AbstractC1471.m3391(typedArrayM3403, xmlPullParser, theme, "fillColor", 1);
                                float f3 = c3593.f11220;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = typedArrayM3403.getFloat(12, f3);
                                }
                                c3593.f11220 = f3;
                                int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM3403.getInt(8, -1) : -1;
                                Paint.Cap cap3 = c3593.f11224;
                                if (i6 == 0) {
                                    cap = cap2;
                                } else if (i6 != 1) {
                                    cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c3593.f11224 = cap;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM3403.getInt(9, -1) : -1;
                                Paint.Join join3 = c3593.f11225;
                                if (i7 == 0) {
                                    join = join2;
                                } else if (i7 != 1) {
                                    join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                c3593.f11225 = join;
                                float f4 = c3593.f11226;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = typedArrayM3403.getFloat(10, f4);
                                }
                                c3593.f11226 = f4;
                                c3593.f11216 = AbstractC1471.m3391(typedArrayM3403, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = c3593.f11219;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = typedArrayM3403.getFloat(11, f5);
                                }
                                c3593.f11219 = f5;
                                float f6 = c3593.f11217;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = typedArrayM3403.getFloat(4, f6);
                                }
                                c3593.f11217 = f6;
                                float f7 = c3593.f11222;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = typedArrayM3403.getFloat(6, f7);
                                }
                                c3593.f11222 = f7;
                                float f8 = c3593.f11223;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = typedArrayM3403.getFloat(7, f8);
                                }
                                c3593.f11223 = f8;
                                float f9 = c3593.f11221;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = typedArrayM3403.getFloat(5, f9);
                                }
                                c3593.f11221 = f9;
                                int i8 = c3593.f11240;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i8 = typedArrayM3403.getInt(13, i8);
                                }
                                c3593.f11240 = i8;
                            }
                            typedArrayM3403.recycle();
                            c3595.f11228.add(c3593);
                            if (c3593.getPathName() != null) {
                                c0274.put(c3593.getPathName(), c3593);
                            }
                            c35910.f11257 = c35910.f11257;
                            z2 = false;
                            c = '\b';
                        } else {
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                C3592 c3592 = new C3592();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayM3404 = AbstractC1471.m3402(resources, theme, attributeSet, AbstractC1272.f4636);
                                    String string4 = typedArrayM3404.getString(0);
                                    if (string4 != null) {
                                        c3592.f11239 = string4;
                                    }
                                    String string5 = typedArrayM3404.getString(1);
                                    if (string5 != null) {
                                        c3592.f11238 = AbstractC1471.m3380(string5);
                                    }
                                    c3592.f11240 = !AbstractC1471.m3395(xmlPullParser, "fillType") ? 0 : typedArrayM3404.getInt(2, 0);
                                    typedArrayM3404.recycle();
                                }
                                c3595.f11228.add(c3592);
                                if (c3592.getPathName() != null) {
                                    c0274.put(c3592.getPathName(), c3592);
                                }
                                c35910.f11257 = c35910.f11257;
                            } else if ("group".equals(name)) {
                                C3594 c3596 = new C3594();
                                TypedArray typedArrayM3405 = AbstractC1471.m3402(resources, theme, attributeSet, AbstractC1272.f4634);
                                float f10 = c3596.f11229;
                                if (AbstractC1471.m3395(xmlPullParser, "rotation")) {
                                    f10 = typedArrayM3405.getFloat(5, f10);
                                }
                                c3596.f11229 = f10;
                                c3596.f11230 = typedArrayM3405.getFloat(1, c3596.f11230);
                                c3596.f11231 = typedArrayM3405.getFloat(2, c3596.f11231);
                                float f11 = c3596.f11232;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = typedArrayM3405.getFloat(3, f11);
                                }
                                c3596.f11232 = f11;
                                float f12 = c3596.f11233;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = typedArrayM3405.getFloat(4, f12);
                                }
                                c3596.f11233 = f12;
                                float f13 = c3596.f11234;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = typedArrayM3405.getFloat(6, f13);
                                }
                                c3596.f11234 = f13;
                                float f14 = c3596.f11235;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = typedArrayM3405.getFloat(7, f14);
                                }
                                c3596.f11235 = f14;
                                String string6 = typedArrayM3405.getString(0);
                                if (string6 != null) {
                                    c3596.f11237 = string6;
                                }
                                c3596.m5136();
                                typedArrayM3405.recycle();
                                c3595.f11228.add(c3596);
                                arrayDeque.push(c3596);
                                if (c3596.getGroupName() != null) {
                                    c0274.put(c3596.getGroupName(), c3596);
                                }
                                c35910.f11257 = c35910.f11257;
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
                    i4 = i2;
                    depth = i;
                }
                if (!z2) {
                    this.f11272 = m5138(c3598.f11259, c3598.f11260);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM3402.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM3402.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C3600(C3598 c3598) {
        this.f11275 = true;
        this.f11276 = new float[9];
        this.f11277 = new Matrix();
        this.f11278 = new Rect();
        this.f11271 = c3598;
        this.f11272 = m5138(c3598.f11259, c3598.f11260);
    }
}
