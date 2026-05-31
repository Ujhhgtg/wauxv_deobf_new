package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤞᤝᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2963 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ColorStateList f9498;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9499;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f9500;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f9501;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f9502;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final float f9503;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final float f9504;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f9505;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final float f9506;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ColorStateList f9507;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f9508;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int f9509;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f9510 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public Typeface f9511;

    public C2963(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC2521.f8019);
        this.f9508 = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f9507 = AbstractC1471.m3388(context, typedArrayObtainStyledAttributes, 3);
        AbstractC1471.m3388(context, typedArrayObtainStyledAttributes, 4);
        AbstractC1471.m3388(context, typedArrayObtainStyledAttributes, 5);
        this.f9500 = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f9501 = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f9509 = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f9499 = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f9498 = AbstractC1471.m3388(context, typedArrayObtainStyledAttributes, 6);
        this.f9502 = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f9503 = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f9504 = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC2521.f8005);
        this.f9505 = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f9506 = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4968() {
        String str;
        Typeface typeface = this.f9511;
        int i = this.f9500;
        if (typeface == null && (str = this.f9499) != null) {
            this.f9511 = Typeface.create(str, i);
        }
        if (this.f9511 == null) {
            int i2 = this.f9501;
            if (i2 == 1) {
                this.f9511 = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f9511 = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f9511 = Typeface.DEFAULT;
            } else {
                this.f9511 = Typeface.MONOSPACE;
            }
            this.f9511 = Typeface.create(this.f9511, i);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Typeface m4969(Context context) {
        if (this.f9510) {
            return this.f9511;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM4614 = AbstractC2638.m4614(context, this.f9509);
                this.f9511 = typefaceM4614;
                if (typefaceM4614 != null) {
                    this.f9511 = Typeface.create(typefaceM4614, this.f9500);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f9499, e);
            }
        }
        m4968();
        this.f9510 = true;
        return this.f9511;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4970(Context context, AbstractC0738 abstractC0738) {
        if (m4971(context)) {
            m4969(context);
        } else {
            m4968();
        }
        int i = this.f9509;
        if (i == 0) {
            this.f9510 = true;
        }
        if (this.f9510) {
            abstractC0738.mo2032(this.f9511, true);
            return;
        }
        try {
            C2961 c2961 = new C2961(this, abstractC0738);
            ThreadLocal threadLocal = AbstractC2638.f8340;
            if (context.isRestricted()) {
                c2961.m3357(-4);
            } else {
                AbstractC2638.m4615(context, i, new TypedValue(), 0, c2961, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f9510 = true;
            abstractC0738.mo2031(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f9499, e);
            this.f9510 = true;
            abstractC0738.mo2031(-3);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean m4971(Context context) throws Exception {
        Typeface typefaceM4615 = null;
        int i = this.f9509;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC2638.f8340;
            if (!context.isRestricted()) {
                typefaceM4615 = AbstractC2638.m4615(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM4615 != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m4972(Context context, TextPaint textPaint, AbstractC0738 abstractC0738) {
        m4973(context, textPaint, abstractC0738);
        ColorStateList colorStateList = this.f9507;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f9498;
        textPaint.setShadowLayer(this.f9504, this.f9502, this.f9503, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4973(Context context, TextPaint textPaint, AbstractC0738 abstractC0738) {
        if (m4971(context)) {
            m4974(context, textPaint, m4969(context));
            return;
        }
        m4968();
        m4974(context, textPaint, this.f9511);
        m4970(context, new C2962(this, context, textPaint, abstractC0738));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4974(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM4204 = AbstractC2235.m4204(context.getResources().getConfiguration(), typeface);
        if (typefaceM4204 != null) {
            typeface = typefaceM4204;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f9500;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f9508);
        if (this.f9505) {
            textPaint.setLetterSpacing(this.f9506);
        }
    }
}
