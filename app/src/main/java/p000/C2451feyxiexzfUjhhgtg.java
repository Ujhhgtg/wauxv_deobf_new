package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import me.hd.wauxv.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2451feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2452feyxiexzfUjhhgtg f7935Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2452feyxiexzfUjhhgtg f7936Ujhhgtgfeyxiexzf = new C2452feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final float f7937Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final float f7938Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final float f7939Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final float f7940Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final float f7941Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final float f7942Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int f7943Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int f7944Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final int f7945Ujhhgtgfeyxiexzf;

    public C2451feyxiexzfUjhhgtg(Context context, C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg2 = c2452feyxiexzfUjhhgtg == null ? new C2452feyxiexzfUjhhgtg() : c2452feyxiexzfUjhhgtg;
        int i = c2452feyxiexzfUjhhgtg2.f7946Ujhhgtgfeyxiexzf;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = attributeSetAsAttributeSet;
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayM2740Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2740Ujhhgtgfeyxiexzf(context, attributeSet, AbstractC0799feyxiexzfUjhhgtg.f3116Ujhhgtgfeyxiexzf, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f7937Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(4, -1);
        this.f7943Ujhhgtgfeyxiexzf = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f7944Ujhhgtgfeyxiexzf = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f7938Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(14, -1);
        this.f7939Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f7941Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f7940Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f7942Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f7945Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getInt(24, 1);
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg3 = this.f7936Ujhhgtgfeyxiexzf;
        int i2 = c2452feyxiexzfUjhhgtg2.f7954Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg3.f7954Ujhhgtgfeyxiexzf = i2 == -2 ? 255 : i2;
        int i3 = c2452feyxiexzfUjhhgtg2.f7956Ujhhgtgfeyxiexzf;
        if (i3 != -2) {
            c2452feyxiexzfUjhhgtg3.f7956Ujhhgtgfeyxiexzf = i3;
        } else if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(23)) {
            this.f7936Ujhhgtgfeyxiexzf.f7956Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getInt(23, 0);
        } else {
            this.f7936Ujhhgtgfeyxiexzf.f7956Ujhhgtgfeyxiexzf = -1;
        }
        String str = c2452feyxiexzfUjhhgtg2.f7955Ujhhgtgfeyxiexzf;
        if (str != null) {
            this.f7936Ujhhgtgfeyxiexzf.f7955Ujhhgtgfeyxiexzf = str;
        } else if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(7)) {
            this.f7936Ujhhgtgfeyxiexzf.f7955Ujhhgtgfeyxiexzf = typedArrayM2740Ujhhgtgfeyxiexzf.getString(7);
        }
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg4 = this.f7936Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg4.f7960Ujhhgtgfeyxiexzf = c2452feyxiexzfUjhhgtg2.f7960Ujhhgtgfeyxiexzf;
        CharSequence charSequence = c2452feyxiexzfUjhhgtg2.f7961Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg4.f7961Ujhhgtgfeyxiexzf = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg5 = this.f7936Ujhhgtgfeyxiexzf;
        int i4 = c2452feyxiexzfUjhhgtg2.f7962Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg5.f7962Ujhhgtgfeyxiexzf = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = c2452feyxiexzfUjhhgtg2.f7963Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg5.f7963Ujhhgtgfeyxiexzf = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = c2452feyxiexzfUjhhgtg2.f7965Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg5.f7965Ujhhgtgfeyxiexzf = Boolean.valueOf(bool == null || bool.booleanValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg6 = this.f7936Ujhhgtgfeyxiexzf;
        int i6 = c2452feyxiexzfUjhhgtg2.f7957Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg6.f7957Ujhhgtgfeyxiexzf = i6 == -2 ? typedArrayM2740Ujhhgtgfeyxiexzf.getInt(21, -2) : i6;
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg7 = this.f7936Ujhhgtgfeyxiexzf;
        int i7 = c2452feyxiexzfUjhhgtg2.f7958Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg7.f7958Ujhhgtgfeyxiexzf = i7 == -2 ? typedArrayM2740Ujhhgtgfeyxiexzf.getInt(22, -2) : i7;
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg8 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num = c2452feyxiexzfUjhhgtg2.f7950Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg8.f7950Ujhhgtgfeyxiexzf = Integer.valueOf(num == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg9 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num2 = c2452feyxiexzfUjhhgtg2.f7951Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg9.f7951Ujhhgtgfeyxiexzf = Integer.valueOf(num2 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(6, 0) : num2.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg10 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num3 = c2452feyxiexzfUjhhgtg2.f7952Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg10.f7952Ujhhgtgfeyxiexzf = Integer.valueOf(num3 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg11 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num4 = c2452feyxiexzfUjhhgtg2.f7953Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg11.f7953Ujhhgtgfeyxiexzf = Integer.valueOf(num4 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(16, 0) : num4.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg12 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num5 = c2452feyxiexzfUjhhgtg2.f7947Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg12.f7947Ujhhgtgfeyxiexzf = Integer.valueOf(num5 == null ? AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context, typedArrayM2740Ujhhgtgfeyxiexzf, 1).getDefaultColor() : num5.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg13 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num6 = c2452feyxiexzfUjhhgtg2.f7949Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg13.f7949Ujhhgtgfeyxiexzf = Integer.valueOf(num6 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = c2452feyxiexzfUjhhgtg2.f7948Ujhhgtgfeyxiexzf;
        if (num7 != null) {
            this.f7936Ujhhgtgfeyxiexzf.f7948Ujhhgtgfeyxiexzf = num7;
        } else if (typedArrayM2740Ujhhgtgfeyxiexzf.hasValue(9)) {
            this.f7936Ujhhgtgfeyxiexzf.f7948Ujhhgtgfeyxiexzf = Integer.valueOf(AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context, typedArrayM2740Ujhhgtgfeyxiexzf, 9).getDefaultColor());
        } else {
            int iIntValue = this.f7936Ujhhgtgfeyxiexzf.f7949Ujhhgtgfeyxiexzf.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, AbstractC0799feyxiexzfUjhhgtg.f3150feyxiexzfUjhhgtg);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListM4561Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context, typedArrayObtainStyledAttributes, 3);
            AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context, typedArrayObtainStyledAttributes, 4);
            AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i8 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i8, 0);
            typedArrayObtainStyledAttributes.getString(i8);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            AbstractC3085Ujhhgtgfeyxiexzf.m4561Ujhhgtgfeyxiexzf(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, AbstractC0799feyxiexzfUjhhgtg.f3136Ujhhgtgfeyxiexzf);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f7936Ujhhgtgfeyxiexzf.f7948Ujhhgtgfeyxiexzf = Integer.valueOf(colorStateListM4561Ujhhgtgfeyxiexzf.getDefaultColor());
        }
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg14 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num8 = c2452feyxiexzfUjhhgtg2.f7964Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg14.f7964Ujhhgtgfeyxiexzf = Integer.valueOf(num8 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getInt(2, 8388661) : num8.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg15 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num9 = c2452feyxiexzfUjhhgtg2.f7966Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg15.f7966Ujhhgtgfeyxiexzf = Integer.valueOf(num9 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg16 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num10 = c2452feyxiexzfUjhhgtg2.f7967Ujhhgtgfeyxiexzf;
        c2452feyxiexzfUjhhgtg16.f7967Ujhhgtgfeyxiexzf = Integer.valueOf(num10 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg17 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num11 = c2452feyxiexzfUjhhgtg2.f7968feyxiexzfUjhhgtg;
        c2452feyxiexzfUjhhgtg17.f7968feyxiexzfUjhhgtg = Integer.valueOf(num11 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelOffset(18, 0) : num11.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg18 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num12 = c2452feyxiexzfUjhhgtg2.f7969feyxiexzfUjhhgtg;
        c2452feyxiexzfUjhhgtg18.f7969feyxiexzfUjhhgtg = Integer.valueOf(num12 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelOffset(25, 0) : num12.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg19 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num13 = c2452feyxiexzfUjhhgtg2.f7970feyxiexzfUjhhgtg;
        c2452feyxiexzfUjhhgtg19.f7970feyxiexzfUjhhgtg = Integer.valueOf(num13 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelOffset(19, c2452feyxiexzfUjhhgtg19.f7968feyxiexzfUjhhgtg.intValue()) : num13.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg20 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num14 = c2452feyxiexzfUjhhgtg2.f7971feyxiexzfUjhhgtg;
        c2452feyxiexzfUjhhgtg20.f7971feyxiexzfUjhhgtg = Integer.valueOf(num14 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelOffset(26, c2452feyxiexzfUjhhgtg20.f7969feyxiexzfUjhhgtg.intValue()) : num14.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg21 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num15 = c2452feyxiexzfUjhhgtg2.f7974feyxiexzfUjhhgtg;
        c2452feyxiexzfUjhhgtg21.f7974feyxiexzfUjhhgtg = Integer.valueOf(num15 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getDimensionPixelOffset(20, 0) : num15.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg22 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num16 = c2452feyxiexzfUjhhgtg2.f7972feyxiexzfUjhhgtg;
        c2452feyxiexzfUjhhgtg22.f7972feyxiexzfUjhhgtg = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg23 = this.f7936Ujhhgtgfeyxiexzf;
        Integer num17 = c2452feyxiexzfUjhhgtg2.f7973feyxiexzfUjhhgtg;
        c2452feyxiexzfUjhhgtg23.f7973feyxiexzfUjhhgtg = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        C2452feyxiexzfUjhhgtg c2452feyxiexzfUjhhgtg24 = this.f7936Ujhhgtgfeyxiexzf;
        Boolean bool2 = c2452feyxiexzfUjhhgtg2.f7975feyxiexzfUjhhgtg;
        c2452feyxiexzfUjhhgtg24.f7975feyxiexzfUjhhgtg = Boolean.valueOf(bool2 == null ? typedArrayM2740Ujhhgtgfeyxiexzf.getBoolean(0, false) : bool2.booleanValue());
        typedArrayM2740Ujhhgtgfeyxiexzf.recycle();
        Locale locale = c2452feyxiexzfUjhhgtg2.f7959Ujhhgtgfeyxiexzf;
        if (locale == null) {
            this.f7936Ujhhgtgfeyxiexzf.f7959Ujhhgtgfeyxiexzf = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f7936Ujhhgtgfeyxiexzf.f7959Ujhhgtgfeyxiexzf = locale;
        }
        this.f7935Ujhhgtgfeyxiexzf = c2452feyxiexzfUjhhgtg2;
    }
}
