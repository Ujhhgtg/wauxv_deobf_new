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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2344Ujhhgtgfeyxiexzf implements InterfaceC1790feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f7648Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f7649Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Object f7650Ujhhgtgfeyxiexzf;

    public C2344Ujhhgtgfeyxiexzf(int i) {
        this(0, new byte[i]);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C2344Ujhhgtgfeyxiexzf m3534Ujhhgtgfeyxiexzf(Resources resources, int i, Resources.Theme theme) {
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
                ColorStateList colorStateListM4264Ujhhgtgfeyxiexzf = AbstractC2858Ujhhgtgfeyxiexzf.m4264Ujhhgtgfeyxiexzf(resources, xml, attributeSetAsAttributeSet, theme);
                return new C2344Ujhhgtgfeyxiexzf((Shader) null, colorStateListM4264Ujhhgtgfeyxiexzf, colorStateListM4264Ujhhgtgfeyxiexzf.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM4521Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4521Ujhhgtgfeyxiexzf(resources, theme, attributeSetAsAttributeSet, AbstractC0768feyxiexzfUjhhgtg.f3049Ujhhgtgfeyxiexzf);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayM4521Ujhhgtgfeyxiexzf.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM4521Ujhhgtgfeyxiexzf.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM4521Ujhhgtgfeyxiexzf.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM4521Ujhhgtgfeyxiexzf.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayM4521Ujhhgtgfeyxiexzf.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM4521Ujhhgtgfeyxiexzf.getFloat(4, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", g.y) != null ? typedArrayM4521Ujhhgtgfeyxiexzf.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM4521Ujhhgtgfeyxiexzf.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM4521Ujhhgtgfeyxiexzf.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayM4521Ujhhgtgfeyxiexzf.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayM4521Ujhhgtgfeyxiexzf.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM4521Ujhhgtgfeyxiexzf.getFloat(5, 0.0f) : 0.0f;
        typedArrayM4521Ujhhgtgfeyxiexzf.recycle();
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
                TypedArray typedArrayM4521Ujhhgtgfeyxiexzf2 = C3052Ujhhgtgfeyxiexzf.m4521Ujhhgtgfeyxiexzf(resources, theme, attributeSetAsAttributeSet, AbstractC0768feyxiexzfUjhhgtg.f3050Ujhhgtgfeyxiexzf);
                boolean zHasValue = typedArrayM4521Ujhhgtgfeyxiexzf2.hasValue(0);
                boolean zHasValue2 = typedArrayM4521Ujhhgtgfeyxiexzf2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM4521Ujhhgtgfeyxiexzf2.getColor(0, 0);
                float f11 = typedArrayM4521Ujhhgtgfeyxiexzf2.getFloat(1, 0.0f);
                typedArrayM4521Ujhhgtgfeyxiexzf2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = arrayList2.size() > 0 ? new C2629Ujhhgtgfeyxiexzf(arrayList2, arrayList) : null;
        if (c2629Ujhhgtgfeyxiexzf == null) {
            c2629Ujhhgtgfeyxiexzf = z ? new C2629Ujhhgtgfeyxiexzf(color, color2, color3) : new C2629Ujhhgtgfeyxiexzf(color, color3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int[] iArr = (int[]) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf;
                float[] fArr = (float[]) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf;
                if (i3 != 1) {
                    tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f4, f, f2, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf, (float[]) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf;
            float[] fArr2 = (float[]) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
        }
        return new C2344Ujhhgtgfeyxiexzf(radialGradient, (ColorStateList) null, 0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static int m3535Ujhhgtgfeyxiexzf(String str) {
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

    @Override // p000.InterfaceC1790feyxiexzfUjhhgtg
    public C1784feyxiexzfUjhhgtg getType(int i) {
        return ((C3057Ujhhgtgfeyxiexzf) ((C1132feyxiexzfUjhhgtg) this.f7650Ujhhgtgfeyxiexzf).m2601Ujhhgtgfeyxiexzf(((C2610Ujhhgtgfeyxiexzf) this.f7649Ujhhgtgfeyxiexzf).m3906Ujhhgtgfeyxiexzf(i * 2))).f9473Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC1790feyxiexzfUjhhgtg
    public int size() {
        return this.f7648Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m3536Ujhhgtgfeyxiexzf() {
        C1741Ujhhgtgfeyxiexzf c1741Ujhhgtgfeyxiexzf;
        ImageView imageView = (ImageView) this.f7649Ujhhgtgfeyxiexzf;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC3252feyxiexzfUjhhgtg.m4756Ujhhgtgfeyxiexzf(drawable);
        }
        if (drawable == null || (c1741Ujhhgtgfeyxiexzf = (C1741Ujhhgtgfeyxiexzf) this.f7650Ujhhgtgfeyxiexzf) == null) {
            return;
        }
        C2364Ujhhgtgfeyxiexzf.m3588Ujhhgtgfeyxiexzf(drawable, c1741Ujhhgtgfeyxiexzf, imageView.getDrawableState());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public synchronized String m3537Ujhhgtgfeyxiexzf(int i, int i2, byte[] bArr) {
        char[] cArr;
        int i3;
        int i4;
        try {
            cArr = (char[]) this.f7649Ujhhgtgfeyxiexzf;
            if (cArr == null) {
                cArr = i2 <= 256 ? new char[bc.e] : new char[2048];
                this.f7649Ujhhgtgfeyxiexzf = cArr;
            } else if (cArr.length < i2) {
                cArr = new char[2048];
                this.f7649Ujhhgtgfeyxiexzf = cArr;
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

    @Override // p000.InterfaceC1790feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public boolean mo3128Ujhhgtgfeyxiexzf() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public long m3538Ujhhgtgfeyxiexzf(int i, int i2) {
        long jM3541Ujhhgtgfeyxiexzf = 0;
        if (i2 <= 0) {
            return 0L;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            jM3541Ujhhgtgfeyxiexzf ^= m3541Ujhhgtgfeyxiexzf(i6);
            i6 += 8;
        }
        int i8 = i4 << 3;
        while (i5 < i8) {
            jM3541Ujhhgtgfeyxiexzf ^= (((long) ((byte[]) this.f7650Ujhhgtgfeyxiexzf)[i6]) & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i9 = (i & 7) << 3;
        return (jM3541Ujhhgtgfeyxiexzf >>> (64 - i9)) | (jM3541Ujhhgtgfeyxiexzf << i9);
    }

    @Override // p000.InterfaceC1790feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public InterfaceC1790feyxiexzfUjhhgtg mo2447Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int m3539Ujhhgtgfeyxiexzf() {
        byte[] bArr = (byte[]) this.f7650Ujhhgtgfeyxiexzf;
        int i = this.f7648Ujhhgtgfeyxiexzf;
        int i2 = i + 1;
        this.f7648Ujhhgtgfeyxiexzf = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f7648Ujhhgtgfeyxiexzf = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f7648Ujhhgtgfeyxiexzf = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f7648Ujhhgtgfeyxiexzf = i + 4;
        return (bArr[i6] << 24) | i7;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int m3540Ujhhgtgfeyxiexzf(int i) {
        byte[] bArr = (byte[]) this.f7650Ujhhgtgfeyxiexzf;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return (bArr[i + 3] << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public long m3541Ujhhgtgfeyxiexzf(int i) {
        byte[] bArr = (byte[]) this.f7650Ujhhgtgfeyxiexzf;
        int i2 = i + 6;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i2]) & 255) << 48) | (((long) bArr[i + 7]) << 56);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public short m3542Ujhhgtgfeyxiexzf() {
        byte[] bArr = (byte[]) this.f7650Ujhhgtgfeyxiexzf;
        int i = this.f7648Ujhhgtgfeyxiexzf;
        int i2 = i + 1;
        this.f7648Ujhhgtgfeyxiexzf = i2;
        int i3 = bArr[i] & 255;
        this.f7648Ujhhgtgfeyxiexzf = i + 2;
        return (short) ((bArr[i2] << 8) | i3);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public String m3543Ujhhgtgfeyxiexzf(int i) {
        String strM3537Ujhhgtgfeyxiexzf;
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        if (i > 2048) {
            strM3537Ujhhgtgfeyxiexzf = new String((byte[]) this.f7650Ujhhgtgfeyxiexzf, this.f7648Ujhhgtgfeyxiexzf, i, StandardCharsets.UTF_8);
        } else {
            strM3537Ujhhgtgfeyxiexzf = m3537Ujhhgtgfeyxiexzf(this.f7648Ujhhgtgfeyxiexzf, i, (byte[]) this.f7650Ujhhgtgfeyxiexzf);
        }
        this.f7648Ujhhgtgfeyxiexzf += i;
        return strM3537Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public String m3544Ujhhgtgfeyxiexzf(C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg, int i) {
        if (c2496feyxiexzfUjhhgtg == null || i <= 0) {
            return m3543Ujhhgtgfeyxiexzf(i);
        }
        byte[] bArr = (byte[]) this.f7650Ujhhgtgfeyxiexzf;
        int i2 = this.f7648Ujhhgtgfeyxiexzf;
        byte[] bArrM3776Ujhhgtgfeyxiexzf = c2496feyxiexzfUjhhgtg.m3776Ujhhgtgfeyxiexzf(Arrays.copyOfRange(bArr, i2, i2 + i));
        String str = bArrM3776Ujhhgtgfeyxiexzf.length > 2048 ? new String(bArrM3776Ujhhgtgfeyxiexzf, StandardCharsets.UTF_8) : m3537Ujhhgtgfeyxiexzf(0, bArrM3776Ujhhgtgfeyxiexzf.length, bArrM3776Ujhhgtgfeyxiexzf);
        this.f7648Ujhhgtgfeyxiexzf += i;
        return str;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public boolean m3545Ujhhgtgfeyxiexzf() {
        ColorStateList colorStateList;
        return ((Shader) this.f7649Ujhhgtgfeyxiexzf) == null && (colorStateList = (ColorStateList) this.f7650Ujhhgtgfeyxiexzf) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void m3546Ujhhgtgfeyxiexzf(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f7649Ujhhgtgfeyxiexzf;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0801feyxiexzfUjhhgtg.f3162Ujhhgtgfeyxiexzf;
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf = C2366Ujhhgtgfeyxiexzf.m3592Ujhhgtgfeyxiexzf(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        AbstractC1901feyxiexzfUjhhgtg.m3264Ujhhgtgfeyxiexzf(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC3252feyxiexzfUjhhgtg.m4756Ujhhgtgfeyxiexzf(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3601Ujhhgtgfeyxiexzf(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC3252feyxiexzfUjhhgtg.m4758Ujhhgtgfeyxiexzf(typedArray.getInt(3, -1), null));
            }
        } finally {
            c2366UjhhgtgfeyxiexzfM3592Ujhhgtgfeyxiexzf.m3611Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m3547Ujhhgtgfeyxiexzf(byte b) {
        byte[] bArr = (byte[]) this.f7650Ujhhgtgfeyxiexzf;
        int i = this.f7648Ujhhgtgfeyxiexzf;
        this.f7648Ujhhgtgfeyxiexzf = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public void m3548Ujhhgtgfeyxiexzf(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, (byte[]) this.f7650Ujhhgtgfeyxiexzf, this.f7648Ujhhgtgfeyxiexzf, length);
            this.f7648Ujhhgtgfeyxiexzf += length;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m3549Ujhhgtgfeyxiexzf(int i) {
        byte[] bArr = (byte[]) this.f7650Ujhhgtgfeyxiexzf;
        int i2 = this.f7648Ujhhgtgfeyxiexzf;
        int i3 = i2 + 1;
        this.f7648Ujhhgtgfeyxiexzf = i3;
        bArr[i2] = (byte) i;
        int i4 = i2 + 2;
        this.f7648Ujhhgtgfeyxiexzf = i4;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i2 + 3;
        this.f7648Ujhhgtgfeyxiexzf = i5;
        bArr[i4] = (byte) (i >> 16);
        this.f7648Ujhhgtgfeyxiexzf = i2 + 4;
        bArr[i5] = (byte) (i >> 24);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public void m3550Ujhhgtgfeyxiexzf(int i, int i2) {
        byte[] bArr = (byte[]) this.f7650Ujhhgtgfeyxiexzf;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public void m3551Ujhhgtgfeyxiexzf(int i, long j) {
        byte[] bArr = (byte[]) this.f7650Ujhhgtgfeyxiexzf;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public void m3552Ujhhgtgfeyxiexzf(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = (byte[]) this.f7650Ujhhgtgfeyxiexzf;
        int i = this.f7648Ujhhgtgfeyxiexzf;
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
        this.f7648Ujhhgtgfeyxiexzf = i;
    }

    public C2344Ujhhgtgfeyxiexzf(int i, byte[] bArr) {
        this.f7649Ujhhgtgfeyxiexzf = null;
        this.f7650Ujhhgtgfeyxiexzf = bArr;
        this.f7648Ujhhgtgfeyxiexzf = i;
    }

    public C2344Ujhhgtgfeyxiexzf(ImageView imageView) {
        this.f7648Ujhhgtgfeyxiexzf = 0;
        this.f7649Ujhhgtgfeyxiexzf = imageView;
    }

    public C2344Ujhhgtgfeyxiexzf(Shader shader, ColorStateList colorStateList, int i) {
        this.f7649Ujhhgtgfeyxiexzf = shader;
        this.f7650Ujhhgtgfeyxiexzf = colorStateList;
        this.f7648Ujhhgtgfeyxiexzf = i;
    }

    public C2344Ujhhgtgfeyxiexzf(int i, C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf, C2344Ujhhgtgfeyxiexzf c2344Ujhhgtgfeyxiexzf) {
        this.f7648Ujhhgtgfeyxiexzf = i;
        this.f7649Ujhhgtgfeyxiexzf = c0154Ujhhgtgfeyxiexzf;
        this.f7650Ujhhgtgfeyxiexzf = c2344Ujhhgtgfeyxiexzf;
    }

    public C2344Ujhhgtgfeyxiexzf(C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf, int i, int i2, C1132feyxiexzfUjhhgtg c1132feyxiexzfUjhhgtg) {
        if (i2 >= 0) {
            C2610Ujhhgtgfeyxiexzf c2610UjhhgtgfeyxiexzfM3914Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3914Ujhhgtgfeyxiexzf(i, (i2 * 2) + i);
            this.f7649Ujhhgtgfeyxiexzf = c2610UjhhgtgfeyxiexzfM3914Ujhhgtgfeyxiexzf;
            this.f7648Ujhhgtgfeyxiexzf = i2;
            this.f7650Ujhhgtgfeyxiexzf = c1132feyxiexzfUjhhgtg;
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
