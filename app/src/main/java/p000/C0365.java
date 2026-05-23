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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0365 {

    public final C0364 f1729;

    public final C0364 f1730 = new C0364();

    public final float f1731;

    public final float f1732;

    public final float f1733;

    public final float f1734;

    public final float f1735;

    public final float f1736;

    public final int f1737;

    public final int f1738;

    public final int f1739;

    public C0365(Context context, C0364 c0364) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        C0364 c0365 = c0364 == null ? new C0364() : c0364;
        int i = c0365.f1699;
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
        TypedArray typedArrayM5082 = AbstractC3471.m5082(context, attributeSet, AbstractC2467.f7839, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f1731 = typedArrayM5082.getDimensionPixelSize(4, -1);
        this.f1737 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f1738 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f1732 = typedArrayM5082.getDimensionPixelSize(14, -1);
        this.f1733 = typedArrayM5082.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f1735 = typedArrayM5082.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f1734 = typedArrayM5082.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f1736 = typedArrayM5082.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f1739 = typedArrayM5082.getInt(24, 1);
        C0364 c0366 = this.f1730;
        int i2 = c0365.f1707;
        c0366.f1707 = i2 == -2 ? 255 : i2;
        int i3 = c0365.f1709;
        if (i3 != -2) {
            c0366.f1709 = i3;
        } else if (typedArrayM5082.hasValue(23)) {
            this.f1730.f1709 = typedArrayM5082.getInt(23, 0);
        } else {
            this.f1730.f1709 = -1;
        }
        String str = c0365.f1708;
        if (str != null) {
            this.f1730.f1708 = str;
        } else if (typedArrayM5082.hasValue(7)) {
            this.f1730.f1708 = typedArrayM5082.getString(7);
        }
        C0364 c0367 = this.f1730;
        c0367.f1713 = c0365.f1713;
        CharSequence charSequence = c0365.f1714;
        c0367.f1714 = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C0364 c0368 = this.f1730;
        int i4 = c0365.f1715;
        c0368.f1715 = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = c0365.f1716;
        c0368.f1716 = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = c0365.f1718;
        c0368.f1718 = Boolean.valueOf(bool == null || bool.booleanValue());
        C0364 c0369 = this.f1730;
        int i6 = c0365.f1710;
        c0369.f1710 = i6 == -2 ? typedArrayM5082.getInt(21, -2) : i6;
        C0364 c03610 = this.f1730;
        int i7 = c0365.f1711;
        c03610.f1711 = i7 == -2 ? typedArrayM5082.getInt(22, -2) : i7;
        C0364 c03611 = this.f1730;
        Integer num = c0365.f1703;
        c03611.f1703 = Integer.valueOf(num == null ? typedArrayM5082.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        C0364 c03612 = this.f1730;
        Integer num2 = c0365.f1704;
        c03612.f1704 = Integer.valueOf(num2 == null ? typedArrayM5082.getResourceId(6, 0) : num2.intValue());
        C0364 c03613 = this.f1730;
        Integer num3 = c0365.f1705;
        c03613.f1705 = Integer.valueOf(num3 == null ? typedArrayM5082.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        C0364 c03614 = this.f1730;
        Integer num4 = c0365.f1706;
        c03614.f1706 = Integer.valueOf(num4 == null ? typedArrayM5082.getResourceId(16, 0) : num4.intValue());
        C0364 c03615 = this.f1730;
        Integer num5 = c0365.f1700;
        c03615.f1700 = Integer.valueOf(num5 == null ? AbstractC3453.m4995(context, typedArrayM5082, 1).getDefaultColor() : num5.intValue());
        C0364 c03616 = this.f1730;
        Integer num6 = c0365.f1702;
        c03616.f1702 = Integer.valueOf(num6 == null ? typedArrayM5082.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = c0365.f1701;
        if (num7 != null) {
            this.f1730.f1701 = num7;
        } else if (typedArrayM5082.hasValue(9)) {
            this.f1730.f1701 = Integer.valueOf(AbstractC3453.m4995(context, typedArrayM5082, 9).getDefaultColor());
        } else {
            int iIntValue = this.f1730.f1702.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, AbstractC2467.f7869);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListM4995 = AbstractC3453.m4995(context, typedArrayObtainStyledAttributes, 3);
            AbstractC3453.m4995(context, typedArrayObtainStyledAttributes, 4);
            AbstractC3453.m4995(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i8 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i8, 0);
            typedArrayObtainStyledAttributes.getString(i8);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            AbstractC3453.m4995(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, AbstractC2467.f7855);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f1730.f1701 = Integer.valueOf(colorStateListM4995.getDefaultColor());
        }
        C0364 c03617 = this.f1730;
        Integer num8 = c0365.f1717;
        c03617.f1717 = Integer.valueOf(num8 == null ? typedArrayM5082.getInt(2, 8388661) : num8.intValue());
        C0364 c03618 = this.f1730;
        Integer num9 = c0365.f1719;
        c03618.f1719 = Integer.valueOf(num9 == null ? typedArrayM5082.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        C0364 c03619 = this.f1730;
        Integer num10 = c0365.f1720;
        c03619.f1720 = Integer.valueOf(num10 == null ? typedArrayM5082.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        C0364 c03620 = this.f1730;
        Integer num11 = c0365.f1721;
        c03620.f1721 = Integer.valueOf(num11 == null ? typedArrayM5082.getDimensionPixelOffset(18, 0) : num11.intValue());
        C0364 c03621 = this.f1730;
        Integer num12 = c0365.f1722;
        c03621.f1722 = Integer.valueOf(num12 == null ? typedArrayM5082.getDimensionPixelOffset(25, 0) : num12.intValue());
        C0364 c03622 = this.f1730;
        Integer num13 = c0365.f1723;
        c03622.f1723 = Integer.valueOf(num13 == null ? typedArrayM5082.getDimensionPixelOffset(19, c03622.f1721.intValue()) : num13.intValue());
        C0364 c03623 = this.f1730;
        Integer num14 = c0365.f1724;
        c03623.f1724 = Integer.valueOf(num14 == null ? typedArrayM5082.getDimensionPixelOffset(26, c03623.f1722.intValue()) : num14.intValue());
        C0364 c03624 = this.f1730;
        Integer num15 = c0365.f1727;
        c03624.f1727 = Integer.valueOf(num15 == null ? typedArrayM5082.getDimensionPixelOffset(20, 0) : num15.intValue());
        C0364 c03625 = this.f1730;
        Integer num16 = c0365.f1725;
        c03625.f1725 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        C0364 c03626 = this.f1730;
        Integer num17 = c0365.f1726;
        c03626.f1726 = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        C0364 c03627 = this.f1730;
        Boolean bool2 = c0365.f1728;
        c03627.f1728 = Boolean.valueOf(bool2 == null ? typedArrayM5082.getBoolean(0, false) : bool2.booleanValue());
        typedArrayM5082.recycle();
        Locale locale = c0365.f1712;
        if (locale == null) {
            this.f1730.f1712 = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f1730.f1712 = locale;
        }
        this.f1729 = c0365;
    }
}
