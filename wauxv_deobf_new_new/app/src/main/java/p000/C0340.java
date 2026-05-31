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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᲈᲇᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0340 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0339 f1700;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0339 f1701 = new C0339();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final float f1702;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final float f1703;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final float f1704;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final float f1705;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final float f1706;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final float f1707;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f1708;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int f1709;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int f1710;

    public C0340(Context context, C0339 c0339) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        C0339 c03310 = c0339 == null ? new C0339() : c0339;
        int i = c03310.f1670;
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
        TypedArray typedArrayM4263 = AbstractC2240.m4263(context, attributeSet, AbstractC2521.f7985, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f1702 = typedArrayM4263.getDimensionPixelSize(4, -1);
        this.f1708 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f1709 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f1703 = typedArrayM4263.getDimensionPixelSize(14, -1);
        this.f1704 = typedArrayM4263.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f1706 = typedArrayM4263.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f1705 = typedArrayM4263.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f1707 = typedArrayM4263.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f1710 = typedArrayM4263.getInt(24, 1);
        C0339 c03311 = this.f1701;
        int i2 = c03310.f1678;
        c03311.f1678 = i2 == -2 ? 255 : i2;
        int i3 = c03310.f1680;
        if (i3 != -2) {
            c03311.f1680 = i3;
        } else if (typedArrayM4263.hasValue(23)) {
            this.f1701.f1680 = typedArrayM4263.getInt(23, 0);
        } else {
            this.f1701.f1680 = -1;
        }
        String str = c03310.f1679;
        if (str != null) {
            this.f1701.f1679 = str;
        } else if (typedArrayM4263.hasValue(7)) {
            this.f1701.f1679 = typedArrayM4263.getString(7);
        }
        C0339 c03312 = this.f1701;
        c03312.f1684 = c03310.f1684;
        CharSequence charSequence = c03310.f1685;
        c03312.f1685 = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C0339 c03313 = this.f1701;
        int i4 = c03310.f1686;
        c03313.f1686 = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = c03310.f1687;
        c03313.f1687 = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = c03310.f1689;
        c03313.f1689 = Boolean.valueOf(bool == null || bool.booleanValue());
        C0339 c03314 = this.f1701;
        int i6 = c03310.f1681;
        c03314.f1681 = i6 == -2 ? typedArrayM4263.getInt(21, -2) : i6;
        C0339 c03315 = this.f1701;
        int i7 = c03310.f1682;
        c03315.f1682 = i7 == -2 ? typedArrayM4263.getInt(22, -2) : i7;
        C0339 c03316 = this.f1701;
        Integer num = c03310.f1674;
        c03316.f1674 = Integer.valueOf(num == null ? typedArrayM4263.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        C0339 c03317 = this.f1701;
        Integer num2 = c03310.f1675;
        c03317.f1675 = Integer.valueOf(num2 == null ? typedArrayM4263.getResourceId(6, 0) : num2.intValue());
        C0339 c03318 = this.f1701;
        Integer num3 = c03310.f1676;
        c03318.f1676 = Integer.valueOf(num3 == null ? typedArrayM4263.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        C0339 c03319 = this.f1701;
        Integer num4 = c03310.f1677;
        c03319.f1677 = Integer.valueOf(num4 == null ? typedArrayM4263.getResourceId(16, 0) : num4.intValue());
        C0339 c03320 = this.f1701;
        Integer num5 = c03310.f1671;
        c03320.f1671 = Integer.valueOf(num5 == null ? AbstractC1471.m3388(context, typedArrayM4263, 1).getDefaultColor() : num5.intValue());
        C0339 c03321 = this.f1701;
        Integer num6 = c03310.f1673;
        c03321.f1673 = Integer.valueOf(num6 == null ? typedArrayM4263.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = c03310.f1672;
        if (num7 != null) {
            this.f1701.f1672 = num7;
        } else if (typedArrayM4263.hasValue(9)) {
            this.f1701.f1672 = Integer.valueOf(AbstractC1471.m3388(context, typedArrayM4263, 9).getDefaultColor());
        } else {
            int iIntValue = this.f1701.f1673.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, AbstractC2521.f8019);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListM3388 = AbstractC1471.m3388(context, typedArrayObtainStyledAttributes, 3);
            AbstractC1471.m3388(context, typedArrayObtainStyledAttributes, 4);
            AbstractC1471.m3388(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i8 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i8, 0);
            typedArrayObtainStyledAttributes.getString(i8);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            AbstractC1471.m3388(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, AbstractC2521.f8005);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f1701.f1672 = Integer.valueOf(colorStateListM3388.getDefaultColor());
        }
        C0339 c03322 = this.f1701;
        Integer num8 = c03310.f1688;
        c03322.f1688 = Integer.valueOf(num8 == null ? typedArrayM4263.getInt(2, 8388661) : num8.intValue());
        C0339 c03323 = this.f1701;
        Integer num9 = c03310.f1690;
        c03323.f1690 = Integer.valueOf(num9 == null ? typedArrayM4263.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        C0339 c03324 = this.f1701;
        Integer num10 = c03310.f1691;
        c03324.f1691 = Integer.valueOf(num10 == null ? typedArrayM4263.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        C0339 c03325 = this.f1701;
        Integer num11 = c03310.f1692;
        c03325.f1692 = Integer.valueOf(num11 == null ? typedArrayM4263.getDimensionPixelOffset(18, 0) : num11.intValue());
        C0339 c03326 = this.f1701;
        Integer num12 = c03310.f1693;
        c03326.f1693 = Integer.valueOf(num12 == null ? typedArrayM4263.getDimensionPixelOffset(25, 0) : num12.intValue());
        C0339 c03327 = this.f1701;
        Integer num13 = c03310.f1694;
        c03327.f1694 = Integer.valueOf(num13 == null ? typedArrayM4263.getDimensionPixelOffset(19, c03327.f1692.intValue()) : num13.intValue());
        C0339 c03328 = this.f1701;
        Integer num14 = c03310.f1695;
        c03328.f1695 = Integer.valueOf(num14 == null ? typedArrayM4263.getDimensionPixelOffset(26, c03328.f1693.intValue()) : num14.intValue());
        C0339 c03329 = this.f1701;
        Integer num15 = c03310.f1698;
        c03329.f1698 = Integer.valueOf(num15 == null ? typedArrayM4263.getDimensionPixelOffset(20, 0) : num15.intValue());
        C0339 c03330 = this.f1701;
        Integer num16 = c03310.f1696;
        c03330.f1696 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        C0339 c03331 = this.f1701;
        Integer num17 = c03310.f1697;
        c03331.f1697 = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        C0339 c03332 = this.f1701;
        Boolean bool2 = c03310.f1699;
        c03332.f1699 = Boolean.valueOf(bool2 == null ? typedArrayM4263.getBoolean(0, false) : bool2.booleanValue());
        typedArrayM4263.recycle();
        Locale locale = c03310.f1683;
        if (locale == null) {
            this.f1701.f1683 = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f1701.f1683 = locale;
        }
        this.f1700 = c03310;
    }
}
