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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᲀᲇᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0231 implements InterfaceC3510 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f1425;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f1426;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f1427;

    public C0231(int i) {
        this(0, new byte[i]);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C0231 m1402(Resources resources, int i, Resources.Theme theme) {
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
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM2321 = AbstractC0746.m2321(resources, xml, attributeSetAsAttributeSet, theme);
                return new C0231((Shader) null, colorStateListM2321, colorStateListM2321.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM3402 = AbstractC1471.m3402(resources, theme, attributeSetAsAttributeSet, AbstractC2517.f7970);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayM3402.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM3402.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM3402.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM3402.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayM3402.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM3402.getFloat(4, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", g.y) != null ? typedArrayM3402.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM3402.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM3402.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayM3402.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayM3402.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM3402.getFloat(5, 0.0f) : 0.0f;
        typedArrayM3402.recycle();
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
                TypedArray typedArrayM3403 = AbstractC1471.m3402(resources, theme, attributeSetAsAttributeSet, AbstractC2517.f7971);
                boolean zHasValue = typedArrayM3403.hasValue(0);
                boolean zHasValue2 = typedArrayM3403.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM3403.getColor(0, 0);
                float f11 = typedArrayM3403.getFloat(1, 0.0f);
                typedArrayM3403.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        C0519 c0519 = arrayList2.size() > 0 ? new C0519(arrayList2, arrayList) : null;
        if (c0519 == null) {
            c0519 = z ? new C0519(color, color2, color3) : new C0519(color, color3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int[] iArr = (int[]) c0519.f2208;
                float[] fArr = (float[]) c0519.f2209;
                if (i3 != 1) {
                    tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f4, f, f2, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) c0519.f2208, (float[]) c0519.f2209);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) c0519.f2208;
            float[] fArr2 = (float[]) c0519.f2209;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
        }
        return new C0231(radialGradient, (ColorStateList) null, 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static int m1403(String str) {
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

    @Override // p000.InterfaceC3510
    public C3505 getType(int i) {
        return ((C0917) ((C2875) this.f1427).m4826(((C0493) this.f1426).m1911(i * 2))).f3408;
    }

    @Override // p000.InterfaceC3510
    public int size() {
        return this.f1425;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m1404() {
        C3461 c3461;
        ImageView imageView = (ImageView) this.f1426;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1111.m2823(drawable);
        }
        if (drawable == null || (c3461 = (C3461) this.f1427) == null) {
            return;
        }
        C0226.m1397(drawable, c3461, imageView.getDrawableState());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public synchronized String m1405(int i, int i2, byte[] bArr) {
        char[] cArr;
        int i3;
        int i4;
        try {
            cArr = (char[]) this.f1426;
            if (cArr == null) {
                cArr = i2 <= 256 ? new char[bc.e] : new char[2048];
                this.f1426 = cArr;
            } else if (cArr.length < i2) {
                cArr = new char[2048];
                this.f1426 = cArr;
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
                        cArr[i3] = (char) ((b2 & JSONB.Constants.BC_INT32_BYTE_MAX) | ((b & 31) << 6));
                    } else {
                        if (b >= -16) {
                            byte b3 = bArr[i6];
                            int i7 = i + 3;
                            byte b4 = bArr[i + 2];
                            i += 4;
                            byte b5 = bArr[i7];
                            if (b3 <= -65) {
                                if ((((b3 + 112) + (b << 28)) >> 30) == 0 && b4 <= -65 && b5 <= -65) {
                                    int i8 = ((b3 & JSONB.Constants.BC_INT32_BYTE_MAX) << 12) | ((b & 7) << 18) | ((b4 & JSONB.Constants.BC_INT32_BYTE_MAX) << 6) | (b5 & JSONB.Constants.BC_INT32_BYTE_MAX);
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
                        cArr[i3] = (char) (((b6 & JSONB.Constants.BC_INT32_BYTE_MAX) << 6) | ((b & ek.m) << 12) | (b7 & JSONB.Constants.BC_INT32_BYTE_MAX));
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

    @Override // p000.InterfaceC3510
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean mo1406() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public long m1407(int i, int i2) {
        long jM1411 = 0;
        if (i2 <= 0) {
            return 0L;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            jM1411 ^= m1411(i6);
            i6 += 8;
        }
        int i8 = i4 << 3;
        while (i5 < i8) {
            jM1411 ^= (((long) ((byte[]) this.f1427)[i6]) & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i9 = (i & 7) << 3;
        return (jM1411 >>> (64 - i9)) | (jM1411 << i9);
    }

    @Override // p000.InterfaceC3510
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public InterfaceC3510 mo1408(C3505 c3505) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int m1409() {
        byte[] bArr = (byte[]) this.f1427;
        int i = this.f1425;
        int i2 = i + 1;
        this.f1425 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f1425 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f1425 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f1425 = i + 4;
        return (bArr[i6] << 24) | i7;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int m1410(int i) {
        byte[] bArr = (byte[]) this.f1427;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return (bArr[i + 3] << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public long m1411(int i) {
        byte[] bArr = (byte[]) this.f1427;
        int i2 = i + 6;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i2]) & 255) << 48) | (((long) bArr[i + 7]) << 56);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public short m1412() {
        byte[] bArr = (byte[]) this.f1427;
        int i = this.f1425;
        int i2 = i + 1;
        this.f1425 = i2;
        int i3 = bArr[i] & 255;
        this.f1425 = i + 2;
        return (short) ((bArr[i2] << 8) | i3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public String m1413(int i) {
        String strM1405;
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        if (i > 2048) {
            strM1405 = new String((byte[]) this.f1427, this.f1425, i, StandardCharsets.UTF_8);
        } else {
            strM1405 = m1405(this.f1425, i, (byte[]) this.f1427);
        }
        this.f1425 += i;
        return strM1405;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public String m1414(C0378 c0378, int i) {
        if (c0378 == null || i <= 0) {
            return m1413(i);
        }
        byte[] bArr = (byte[]) this.f1427;
        int i2 = this.f1425;
        byte[] bArrM1698 = c0378.m1698(Arrays.copyOfRange(bArr, i2, i2 + i));
        String str = bArrM1698.length > 2048 ? new String(bArrM1698, StandardCharsets.UTF_8) : m1405(0, bArrM1698.length, bArrM1698);
        this.f1425 += i;
        return str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean m1415() {
        ColorStateList colorStateList;
        return ((Shader) this.f1426) == null && (colorStateList = (ColorStateList) this.f1427) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public void m1416(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1426;
        Context context = imageView.getContext();
        int[] iArr = AbstractC2523.f8030;
        C0253 c0253M1453 = C0253.m1453(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0253M1453.f1478;
        AbstractC3638.m5182(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0253M1453.f1478, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = C1787.m3667(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1111.m2823(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c0253M1453.m1465(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1111.m2825(typedArray.getInt(3, -1), null));
            }
        } finally {
            c0253M1453.m1475();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public void m1417(byte b) {
        byte[] bArr = (byte[]) this.f1427;
        int i = this.f1425;
        this.f1425 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public void m1418(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, (byte[]) this.f1427, this.f1425, length);
            this.f1425 += length;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public void m1419(int i) {
        byte[] bArr = (byte[]) this.f1427;
        int i2 = this.f1425;
        int i3 = i2 + 1;
        this.f1425 = i3;
        bArr[i2] = (byte) i;
        int i4 = i2 + 2;
        this.f1425 = i4;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i2 + 3;
        this.f1425 = i5;
        bArr[i4] = (byte) (i >> 16);
        this.f1425 = i2 + 4;
        bArr[i5] = (byte) (i >> 24);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public void m1420(int i, int i2) {
        byte[] bArr = (byte[]) this.f1427;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public void m1421(int i, long j) {
        byte[] bArr = (byte[]) this.f1427;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public void m1422(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = (byte[]) this.f1427;
        int i = this.f1425;
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
                bArr[i] = (byte) ((cCharAt >>> 6) | Opcodes.CHECKCAST);
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
        this.f1425 = i;
    }

    public C0231(int i, byte[] bArr) {
        this.f1426 = null;
        this.f1427 = bArr;
        this.f1425 = i;
    }

    public C0231(ImageView imageView) {
        this.f1425 = 0;
        this.f1426 = imageView;
    }

    public C0231(Shader shader, ColorStateList colorStateList, int i) {
        this.f1426 = shader;
        this.f1427 = colorStateList;
        this.f1425 = i;
    }

    public C0231(int i, C1774 c1774, C0231 c0231) {
        this.f1425 = i;
        this.f1426 = c1774;
        this.f1427 = c0231;
    }

    public C0231(C0493 c0493, int i, int i2, C2875 c2875) {
        if (i2 >= 0) {
            C0493 c0493M1919 = c0493.m1919(i, (i2 * 2) + i);
            this.f1426 = c0493M1919;
            this.f1425 = i2;
            this.f1427 = c2875;
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
