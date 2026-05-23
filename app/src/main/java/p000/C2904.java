package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᲇᤞᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2904 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ColorStateList f9331;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9332;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f9333;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f9334;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f9335;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final float f9336;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final float f9337;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f9338;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final float f9339;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ColorStateList f9340;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f9341;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int f9342;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f9343 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public Typeface f9344;

    public C2904(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC2467.f7869);
        this.f9341 = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f9340 = AbstractC3453.m4995(context, typedArrayObtainStyledAttributes, 3);
        AbstractC3453.m4995(context, typedArrayObtainStyledAttributes, 4);
        AbstractC3453.m4995(context, typedArrayObtainStyledAttributes, 5);
        this.f9333 = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f9334 = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f9342 = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f9332 = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f9331 = AbstractC3453.m4995(context, typedArrayObtainStyledAttributes, 6);
        this.f9335 = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f9336 = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f9337 = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC2467.f7855);
        this.f9338 = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f9339 = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4906() {
        String str;
        Typeface typeface = this.f9344;
        int i = this.f9333;
        if (typeface == null && (str = this.f9332) != null) {
            this.f9344 = Typeface.create(str, i);
        }
        if (this.f9344 == null) {
            int i2 = this.f9334;
            if (i2 == 1) {
                this.f9344 = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f9344 = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f9344 = Typeface.DEFAULT;
            } else {
                this.f9344 = Typeface.MONOSPACE;
            }
            this.f9344 = Typeface.create(this.f9344, i);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Typeface m4907(Context context) {
        if (this.f9343) {
            return this.f9344;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM4592 = AbstractC2582.m4592(context, this.f9342);
                this.f9344 = typefaceM4592;
                if (typefaceM4592 != null) {
                    this.f9344 = Typeface.create(typefaceM4592, this.f9333);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f9332, e);
            }
        }
        m4906();
        this.f9343 = true;
        return this.f9344;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4908(Context context, AbstractC2209 abstractC2209) {
        if (m4909(context)) {
            m4907(context);
        } else {
            m4906();
        }
        int i = this.f9342;
        if (i == 0) {
            this.f9343 = true;
        }
        if (this.f9343) {
            abstractC2209.mo1937(this.f9344, true);
            return;
        }
        try {
            C2902 c2902 = new C2902(this, abstractC2209);
            ThreadLocal threadLocal = AbstractC2582.f8187;
            if (context.isRestricted()) {
                c2902.m5342(-4);
            } else {
                AbstractC2582.m4593(context, i, new TypedValue(), 0, c2902, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f9343 = true;
            abstractC2209.mo1936(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f9332, e);
            this.f9343 = true;
            abstractC2209.mo1936(-3);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m4909(Context context) throws Exception {
        Typeface typefaceM4593 = null;
        int i = this.f9342;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC2582.f8187;
            if (!context.isRestricted()) {
                typefaceM4593 = AbstractC2582.m4593(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM4593 != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4910(Context context, TextPaint textPaint, AbstractC2209 abstractC2209) {
        m4911(context, textPaint, abstractC2209);
        ColorStateList colorStateList = this.f9340;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f9331;
        textPaint.setShadowLayer(this.f9337, this.f9335, this.f9336, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4911(Context context, TextPaint textPaint, AbstractC2209 abstractC2209) {
        if (m4909(context)) {
            m4912(context, textPaint, m4907(context));
            return;
        }
        m4906();
        m4912(context, textPaint, this.f9344);
        m4908(context, new C2903(this, context, textPaint, abstractC2209));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4912(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM4668 = AbstractC2665.m4668(context.getResources().getConfiguration(), typeface);
        if (typefaceM4668 != null) {
            typeface = typefaceM4668;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f9333;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f9341);
        if (this.f9338) {
            textPaint.setLetterSpacing(this.f9339);
        }
    }
}
