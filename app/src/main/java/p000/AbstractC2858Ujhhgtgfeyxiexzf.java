package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Array;
import me.hd.wauxv.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛲᛳᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2858Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final ThreadLocal f9117Ujhhgtgfeyxiexzf = new ThreadLocal();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static ColorStateList m4263Ujhhgtgfeyxiexzf(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m4264Ujhhgtgfeyxiexzf(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static ColorStateList m4264Ujhhgtgfeyxiexzf(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        int iM5218Ujhhgtgfeyxiexzf;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i = 0;
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = AbstractC0768feyxiexzfUjhhgtg.f3045Ujhhgtgfeyxiexzf;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i, i);
                int resourceId = ObtainAttributes.getResourceId(i, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f9117Ujhhgtgfeyxiexzf;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r4);
                    int i3 = typedValue.type;
                    if (i3 < 28 || i3 > 31) {
                        try {
                            color = m4263Ujhhgtgfeyxiexzf(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i, -65281);
                }
                if (ObtainAttributes.hasValue(r4)) {
                    f = ObtainAttributes.getFloat(r4, 1.0f);
                } else {
                    f = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r4;
                float f2 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i4 = i;
                int i5 = i4;
                while (i4 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i6 = i5 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i5] = attributeNameResource;
                        i5 = i6;
                    }
                    i4++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i5);
                float f3 = 100.0f;
                boolean z = (f2 < 0.0f || f2 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f != 1.0f || z) {
                    int iM5212Ujhhgtgfeyxiexzf = AbstractC3611Ujhhgtgfeyxiexzf.m5212Ujhhgtgfeyxiexzf((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                    if (z) {
                        C2641Ujhhgtgfeyxiexzf c2641UjhhgtgfeyxiexzfM3974Ujhhgtgfeyxiexzf = C2641Ujhhgtgfeyxiexzf.m3974Ujhhgtgfeyxiexzf(color);
                        float f4 = c2641UjhhgtgfeyxiexzfM3974Ujhhgtgfeyxiexzf.f8482Ujhhgtgfeyxiexzf;
                        float f5 = c2641UjhhgtgfeyxiexzfM3974Ujhhgtgfeyxiexzf.f8483Ujhhgtgfeyxiexzf;
                        C2313feyxiexzfUjhhgtg c2313feyxiexzfUjhhgtg = C2313feyxiexzfUjhhgtg.f7550Ujhhgtgfeyxiexzf;
                        if (f5 >= 1.0d && Math.round(f2) > 0.0d && Math.round(f2) < 100.0d) {
                            float fMin = f4 < 0.0f ? 0.0f : Math.min(360.0f, f4);
                            float f6 = 0.0f;
                            float f7 = f5;
                            boolean z2 = r16 == true ? 1 : 0;
                            C2641Ujhhgtgfeyxiexzf c2641Ujhhgtgfeyxiexzf = null;
                            while (true) {
                                if (Math.abs(f6 - f5) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (c2641Ujhhgtgfeyxiexzf != null) {
                                        iM5218Ujhhgtgfeyxiexzf = c2641Ujhhgtgfeyxiexzf.m3976Ujhhgtgfeyxiexzf(c2313feyxiexzfUjhhgtg);
                                        break;
                                    }
                                    iM5218Ujhhgtgfeyxiexzf = AbstractC3611Ujhhgtgfeyxiexzf.m5218Ujhhgtgfeyxiexzf(f2);
                                    break;
                                }
                                float f8 = 1000.0f;
                                float f9 = f3;
                                float f10 = 0.0f;
                                float f11 = 1000.0f;
                                C2641Ujhhgtgfeyxiexzf c2641Ujhhgtgfeyxiexzf2 = null;
                                while (true) {
                                    if (Math.abs(f10 - f9) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f3 = f3;
                                        break;
                                    }
                                    f3 = f3;
                                    float f12 = ((f9 - f10) / 2.0f) + f10;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iM3976Ujhhgtgfeyxiexzf = C2641Ujhhgtgfeyxiexzf.m3975Ujhhgtgfeyxiexzf(f12, f7, fMin).m3976Ujhhgtgfeyxiexzf(C2313feyxiexzfUjhhgtg.f7550Ujhhgtgfeyxiexzf);
                                    float fM5221Ujhhgtgfeyxiexzf = AbstractC3611Ujhhgtgfeyxiexzf.m5221Ujhhgtgfeyxiexzf(Color.red(iM3976Ujhhgtgfeyxiexzf));
                                    float fM5221Ujhhgtgfeyxiexzf2 = AbstractC3611Ujhhgtgfeyxiexzf.m5221Ujhhgtgfeyxiexzf(Color.green(iM3976Ujhhgtgfeyxiexzf));
                                    float fM5221Ujhhgtgfeyxiexzf3 = AbstractC3611Ujhhgtgfeyxiexzf.m5221Ujhhgtgfeyxiexzf(Color.blue(iM3976Ujhhgtgfeyxiexzf));
                                    float[] fArr = AbstractC3611Ujhhgtgfeyxiexzf.f11231Ujhhgtgfeyxiexzf[r16 == true ? 1 : 0];
                                    float f13 = ((fM5221Ujhhgtgfeyxiexzf3 * fArr[2]) + ((fM5221Ujhhgtgfeyxiexzf2 * fArr[r16 == true ? 1 : 0]) + (fM5221Ujhhgtgfeyxiexzf * fArr[0]))) / f3;
                                    float fCbrt = f13 <= 0.008856452f ? f13 * 903.2963f : (((float) Math.cbrt(f13)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f2 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        C2641Ujhhgtgfeyxiexzf c2641UjhhgtgfeyxiexzfM3974Ujhhgtgfeyxiexzf2 = C2641Ujhhgtgfeyxiexzf.m3974Ujhhgtgfeyxiexzf(iM3976Ujhhgtgfeyxiexzf);
                                        C2641Ujhhgtgfeyxiexzf c2641UjhhgtgfeyxiexzfM3975Ujhhgtgfeyxiexzf = C2641Ujhhgtgfeyxiexzf.m3975Ujhhgtgfeyxiexzf(c2641UjhhgtgfeyxiexzfM3974Ujhhgtgfeyxiexzf2.f8484Ujhhgtgfeyxiexzf, c2641UjhhgtgfeyxiexzfM3974Ujhhgtgfeyxiexzf2.f8483Ujhhgtgfeyxiexzf, fMin);
                                        float f14 = c2641UjhhgtgfeyxiexzfM3974Ujhhgtgfeyxiexzf2.f8485Ujhhgtgfeyxiexzf - c2641UjhhgtgfeyxiexzfM3975Ujhhgtgfeyxiexzf.f8485Ujhhgtgfeyxiexzf;
                                        float f15 = c2641UjhhgtgfeyxiexzfM3974Ujhhgtgfeyxiexzf2.f8486Ujhhgtgfeyxiexzf - c2641UjhhgtgfeyxiexzfM3975Ujhhgtgfeyxiexzf.f8486Ujhhgtgfeyxiexzf;
                                        float f16 = c2641UjhhgtgfeyxiexzfM3974Ujhhgtgfeyxiexzf2.f8487Ujhhgtgfeyxiexzf - c2641UjhhgtgfeyxiexzfM3975Ujhhgtgfeyxiexzf.f8487Ujhhgtgfeyxiexzf;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f16 * f16) + (f15 * f15) + (f14 * f14)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f11 = fPow;
                                            f8 = fAbs;
                                            c2641Ujhhgtgfeyxiexzf2 = c2641UjhhgtgfeyxiexzfM3974Ujhhgtgfeyxiexzf2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f8 == 0.0f && f11 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f2) {
                                        f10 = f12;
                                    } else {
                                        f9 = f12;
                                    }
                                    f3 = f3;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                C2641Ujhhgtgfeyxiexzf c2641Ujhhgtgfeyxiexzf3 = c2641Ujhhgtgfeyxiexzf2;
                                if (!z2) {
                                    if (c2641Ujhhgtgfeyxiexzf3 == null) {
                                        f5 = f7;
                                    } else {
                                        c2641Ujhhgtgfeyxiexzf = c2641Ujhhgtgfeyxiexzf3;
                                        f6 = f7;
                                    }
                                    f7 = ((f5 - f6) / 2.0f) + f6;
                                } else {
                                    if (c2641Ujhhgtgfeyxiexzf3 != null) {
                                        iM5218Ujhhgtgfeyxiexzf = c2641Ujhhgtgfeyxiexzf3.m3976Ujhhgtgfeyxiexzf(c2313feyxiexzfUjhhgtg);
                                        break;
                                    }
                                    f7 = ((f5 - f6) / 2.0f) + f6;
                                    z2 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iM5218Ujhhgtgfeyxiexzf = AbstractC3611Ujhhgtgfeyxiexzf.m5218Ujhhgtgfeyxiexzf(f2);
                        }
                        color = iM5218Ujhhgtgfeyxiexzf;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iM5212Ujhhgtgfeyxiexzf << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i7 = i2 + 1;
                if (i7 > iArr.length) {
                    int[] iArr4 = new int[i2 <= 4 ? 8 : i2 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i2);
                    iArr = iArr4;
                }
                iArr[i2] = color;
                if (i7 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2 > 4 ? i2 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i2);
                    objArr = objArr2;
                }
                objArr[i2] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i2 = i7;
                r4 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i = 0;
            } else {
                int i8 = depth2;
                r4 = r4 == true ? 1 : 0;
                depth2 = i8;
                i = 0;
            }
        }
        int[] iArr5 = new int[i2];
        int[][] iArr6 = new int[i2][];
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        System.arraycopy(objArr, 0, iArr6, 0, i2);
        return new ColorStateList(iArr6, iArr5);
    }
}
