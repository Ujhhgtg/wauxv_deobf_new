package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.ek;
import com.umeng.analytics.pro.g;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0221 implements InterfaceC3454 {

    public int f1351;

    public Object f1352;

    public Object f1353;

    public C0221(int i) {
        this(0, new byte[i]);
    }

    public static C0221 m1256(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM2221 = AbstractC0751.m2221(resources, xml, attributeSetAsAttributeSet, theme);
                return new C0221((Shader) null, colorStateListM2221, colorStateListM2221.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM3165 = AbstractC1458.m3165(resources, theme, attributeSetAsAttributeSet, AbstractC2463.f7824);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayM3165.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM3165.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM3165.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM3165.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayM3165.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM3165.getFloat(4, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayM3165.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM3165.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM3165.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayM3165.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayM3165.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM3165.getFloat(5, 0.0f) : 0.0f;
        typedArrayM3165.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f2 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM3166 = AbstractC1458.m3165(resources, theme, attributeSetAsAttributeSet, AbstractC2463.f7825);
                boolean zHasValue = typedArrayM3166.hasValue(0);
                boolean zHasValue2 = typedArrayM3166.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM3166.getColor(0, 0);
                float f11 = typedArrayM3166.getFloat(1, 0.0f);
                typedArrayM3166.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        C0542 c0542 = arrayList2.size() > 0 ? new C0542(arrayList2, arrayList) : null;
        if (c0542 == null) {
            c0542 = z ? new C0542(color, color2, color3) : new C0542(color, color3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int[] iArr = (int[]) c0542.f2252;
                float[] fArr = (float[]) c0542.f2253;
                if (i3 != 1) {
                    tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f4, f, f2, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) c0542.f2252, (float[]) c0542.f2253);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) c0542.f2252;
            float[] fArr2 = (float[]) c0542.f2253;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
        }
        return new C0221(radialGradient, (ColorStateList) null, 0);
    }

    public static int m1257(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                i2++;
            } else if (cCharAt < 2048) {
                i2 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i2 += 3;
            } else {
                i += 2;
                i2 += 4;
            }
            i = i3;
        }
        return i2;
    }

    @Override // p000.InterfaceC3454
    public C3448 getType(int i) {
        return ((C0918) ((C2815) this.f1353).m4793(((C0516) this.f1352).m1817(i * 2))).f3401;
    }

    @Override // p000.InterfaceC3454
    public int size() {
        return this.f1351;
    }

    public void m1258() {
        C3402 c3402;
        ImageView imageView = (ImageView) this.f1352;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1105.m2674(drawable);
        }
        if (drawable == null || (c3402 = (C3402) this.f1353) == null) {
            return;
        }
        C0216.m1251(drawable, c3402, imageView.getDrawableState());
    }

    public synchronized String m1259(int i, int i2, byte[] bArr) {
        char[] cArr;
        int i3;
        int i4;
        try {
            cArr = (char[]) this.f1352;
            if (cArr == null) {
                cArr = i2 <= 256 ? new char[256] : new char[2048];
                this.f1352 = cArr;
            } else if (cArr.length < i2) {
                cArr = new char[2048];
                this.f1352 = cArr;
            }
            int i5 = i2 + i;
            i3 = 0;
            while (i < i5) {
                int i6 = i + 1;
                byte b = bArr[i];
                if (b > 0) {
                    cArr[i3] = (char) b;
                    i3++;
                    i = i6;
                } else {
                    if (b < -32) {
                        i += 2;
                        byte b2 = bArr[i6];
                        if (b < -62 || b2 > -65) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i4 = i3 + 1;
                        cArr[i3] = (char) ((b2 & 63) | ((b & 31) << 6));
                    } else {
                        if (b >= -16) {
                            byte b3 = bArr[i6];
                            int i7 = i + 3;
                            byte b4 = bArr[i + 2];
                            i += 4;
                            byte b5 = bArr[i7];
                            if (b3 <= -65) {
                                if ((((b3 + 112) + (b << 28)) >> 30) == 0 && b4 <= -65 && b5 <= -65) {
                                    int i8 = ((b3 & 63) << 12) | ((b & 7) << 18) | ((b4 & 63) << 6) | (b5 & 63);
                                    int i9 = i3 + 1;
                                    cArr[i3] = (char) ((i8 >>> 10) + 55232);
                                    i3 += 2;
                                    cArr[i9] = (char) ((i8 & 1023) + 56320);
                                }
                            }
                            throw new IllegalArgumentException("Invalid String");
                        }
                        int i10 = i + 2;
                        byte b6 = bArr[i6];
                        i += 3;
                        byte b7 = bArr[i10];
                        if ((b == -32 && b6 < -96) || ((b == -19 && b6 >= -96) || b6 > -65 || b7 > -65)) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i4 = i3 + 1;
                        cArr[i3] = (char) (((b6 & 63) << 6) | ((b & 15) << 12) | (b7 & 63));
                    }
                    i3 = i4;
                }
            }
            if (i > i5) {
                throw new IllegalArgumentException("Invalid String");
            }
        } catch (Throwable th) {
            throw th;
        }
        return new String(cArr, 0, i3);
    }

    @Override // p000.InterfaceC3454
    public boolean mo1260() {
        return false;
    }

    public long m1261(int i, int i2) {
        long jM1265 = 0;
        if (i2 <= 0) {
            return 0L;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            jM1265 ^= m1265(i6);
            i6 += 8;
        }
        int i8 = i4 << 3;
        while (i5 < i8) {
            jM1265 ^= (((long) ((byte[]) this.f1353)[i6]) & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i9 = (i & 7) << 3;
        return (jM1265 >>> (64 - i9)) | (jM1265 << i9);
    }

    @Override // p000.InterfaceC3454
    public InterfaceC3454 mo1262(C3448 c3448) {
        throw new UnsupportedOperationException("unsupported");
    }

    public int m1263() {
        byte[] bArr = (byte[]) this.f1353;
        int i = this.f1351;
        int i2 = i + 1;
        this.f1351 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f1351 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f1351 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f1351 = i + 4;
        return (bArr[i6] << 24) | i7;
    }

    public int m1264(int i) {
        byte[] bArr = (byte[]) this.f1353;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return (bArr[i + 3] << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    public long m1265(int i) {
        byte[] bArr = (byte[]) this.f1353;
        int i2 = i + 6;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i2]) & 255) << 48) | (((long) bArr[i + 7]) << 56);
    }

    public short m1266() {
        byte[] bArr = (byte[]) this.f1353;
        int i = this.f1351;
        int i2 = i + 1;
        this.f1351 = i2;
        int i3 = bArr[i] & 255;
        this.f1351 = i + 2;
        return (short) ((bArr[i2] << 8) | i3);
    }

    public String m1267(int i) {
        String strM1259;
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        if (i > 2048) {
            strM1259 = new String((byte[]) this.f1353, this.f1351, i, StandardCharsets.UTF_8);
        } else {
            strM1259 = m1259(this.f1351, i, (byte[]) this.f1353);
        }
        this.f1351 += i;
        return strM1259;
    }

    public String m1268(C0403 c0403, int i) {
        if (c0403 == null || i <= 0) {
            return m1267(i);
        }
        byte[] bArr = (byte[]) this.f1353;
        int i2 = this.f1351;
        byte[] bArrM1592 = c0403.m1592(Arrays.copyOfRange(bArr, i2, i2 + i));
        String str = bArrM1592.length > 2048 ? new String(bArrM1592, StandardCharsets.UTF_8) : m1259(0, bArrM1592.length, bArrM1592);
        this.f1351 += i;
        return str;
    }

    public boolean m1269() {
        ColorStateList colorStateList;
        return ((Shader) this.f1352) == null && (colorStateList = (ColorStateList) this.f1353) != null && colorStateList.isStateful();
    }

    public void m1270(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1352;
        Context context = imageView.getContext();
        int[] iArr = AbstractC2470.f7881;
        C0243 c0243M1307 = C0243.m1307(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0243M1307.f1404;
        AbstractC3578.m5176(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0243M1307.f1404, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC3471.m5076(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1105.m2674(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c0243M1307.m1319(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1105.m2676(typedArray.getInt(3, -1), null));
            }
        } finally {
            c0243M1307.m1329();
        }
    }

    public void m1271(byte b) {
        byte[] bArr = (byte[]) this.f1353;
        int i = this.f1351;
        this.f1351 = i + 1;
        bArr[i] = b;
    }

    public void m1272(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, (byte[]) this.f1353, this.f1351, length);
            this.f1351 += length;
        }
    }

    public void m1273(int i) {
        byte[] bArr = (byte[]) this.f1353;
        int i2 = this.f1351;
        int i3 = i2 + 1;
        this.f1351 = i3;
        bArr[i2] = (byte) i;
        int i4 = i2 + 2;
        this.f1351 = i4;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i2 + 3;
        this.f1351 = i5;
        bArr[i4] = (byte) (i >> 16);
        this.f1351 = i2 + 4;
        bArr[i5] = (byte) (i >> 24);
    }

    public void m1274(int i, int i2) {
        byte[] bArr = (byte[]) this.f1353;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    public void m1275(int i, long j) {
        byte[] bArr = (byte[]) this.f1353;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    public void m1276(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = (byte[]) this.f1353;
        int i = this.f1351;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
                int i4 = i + 1;
                bArr[i] = (byte) ((cCharAt >>> 6) | 192);
                i += 2;
                bArr[i4] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i] = (byte) ((cCharAt >>> '\f') | 224);
                int i5 = i + 2;
                bArr[i + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                i += 3;
                bArr[i5] = (byte) ((cCharAt & '?') | 128);
            } else {
                i2 += 2;
                int iCharAt = ((cCharAt << '\n') + str.charAt(i3)) - 56613888;
                bArr[i] = (byte) ((iCharAt >>> 18) | 240);
                bArr[i + 1] = (byte) (((iCharAt >>> 12) & 63) | 128);
                int i6 = i + 3;
                bArr[i + 2] = (byte) (((iCharAt >>> 6) & 63) | 128);
                i += 4;
                bArr[i6] = (byte) ((iCharAt & 63) | 128);
            }
            i2 = i3;
        }
        this.f1351 = i;
    }

    public C0221(int i, byte[] bArr) {
        this.f1352 = null;
        this.f1353 = bArr;
        this.f1351 = i;
    }

    public C0221(ImageView imageView) {
        this.f1351 = 0;
        this.f1352 = imageView;
    }

    public C0221(Shader shader, ColorStateList colorStateList, int i) {
        this.f1352 = shader;
        this.f1353 = colorStateList;
        this.f1351 = i;
    }

    public C0221(int i, C1752 c1752, C0221 c0221) {
        this.f1351 = i;
        this.f1352 = c1752;
        this.f1353 = c0221;
    }

    public C0221(C0516 c0516, int i, int i2, C2815 c2815) {
        if (i2 >= 0) {
            C0516 c0516M1825 = c0516.m1825(i, (i2 * 2) + i);
            this.f1352 = c0516M1825;
            this.f1351 = i2;
            this.f1353 = c2815;
            for (int i3 = 0; i3 < i2; i3++) {
                try {
                } catch (ClassCastException e) {
                    throw new RuntimeException("bogus class cpi", e);
                }
            }
            return;
        }
        throw new IllegalArgumentException("size < 0");
    }
}
