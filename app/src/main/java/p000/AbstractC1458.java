package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1458 {

    public static final C1172 f5185;

    public static final C1172 f5186;

    public static final C1172 f5187;

    public static final C1172 f5188;

    public static final C1172 f5189;

    public static C0542 f5192;

    public static final float[][] f5181 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    public static final float[][] f5182 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    public static final float[] f5183 = {95.047f, 100.0f, 108.883f};

    public static final float[][] f5184 = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static final C1185 f5190 = new C1185(false);

    public static final C1185 f5191 = new C1185(true);

    static {
        int i = 1;
        f5185 = new C1172("COMPLETING_ALREADY", 1);
        f5186 = new C1172("COMPLETING_WAITING_CHILDREN", 1);
        f5187 = new C1172("COMPLETING_RETRY", 1);
        f5188 = new C1172("TOO_LATE_TO_CANCEL", 1);
        f5189 = new C1172("SEALED", 1);
    }

    public static final void m3154(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC2202.m3992(th, th2);
            }
        }
    }

    public static C0177 m3155(C0442 c0442) {
        C0177 c0177M1227;
        C0165 c0165;
        C0293 c0293 = (C0293) c0442.m1644("RuntimeVisibleAnnotations");
        C0291 c0291 = (C0291) c0442.m1644("RuntimeInvisibleAnnotations");
        if (c0293 == null) {
            c0177M1227 = c0291 == null ? C0177.f1223 : (C0177) c0291.f1749;
        } else {
            c0177M1227 = (C0177) c0293.f1749;
            if (c0291 != null) {
                C0177 c0177 = (C0177) c0291.f1749;
                C0177 c0178 = new C0177();
                c0178.m1229(c0177M1227);
                c0178.m1229(c0177);
                c0178.f6944 = false;
                c0177M1227 = c0178;
            }
        }
        C0295 c0295 = (C0295) c0442.m1644("Signature");
        C0165 c0166 = null;
        if (c0295 == null) {
            c0165 = null;
        } else {
            C0917 c0917 = c0295.f1506;
            c0165 = new C0165(AbstractC0176.f1217, 3);
            String str = c0917.f3378;
            int length = str.length();
            ArrayList arrayList = new ArrayList(20);
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (str.charAt(i) == 'L') {
                    while (i2 < length) {
                        char cCharAt = str.charAt(i2);
                        if (cCharAt == ';') {
                            i2++;
                            break;
                        }
                        if (cCharAt == '<') {
                            break;
                        }
                        i2++;
                    }
                } else {
                    while (i2 < length && str.charAt(i2) != 'L') {
                        i2++;
                    }
                }
                arrayList.add(str.substring(i, i2));
                i = i2;
            }
            int size = arrayList.size();
            C0889 c0889 = new C0889(size);
            for (int i3 = 0; i3 < size; i3++) {
                c0889.m3063(i3, new C0917((String) arrayList.get(i3)));
            }
            c0889.f6944 = false;
            c0165.m1217(new C2119(AbstractC0176.f1222, new C0890(c0889)));
            c0165.f6944 = false;
        }
        C0296 c0296 = (C0296) c0442.m1644("SourceDebugExtension");
        if (c0296 != null) {
            C0917 c0918 = c0296.f1507;
            c0166 = new C0165(AbstractC0176.f1218, 3);
            c0166.m1217(new C2119(AbstractC0176.f1222, c0918));
            c0166.f6944 = false;
        }
        if (c0165 != null) {
            c0177M1227 = C0177.m1227(c0177M1227, c0165);
        }
        return c0166 != null ? C0177.m1227(c0177M1227, c0166) : c0177M1227;
    }

    public static int m3156(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static C0177 m3157(InterfaceC1971 interfaceC1971) {
        C0177 c0177M3155 = m3155(interfaceC1971.getAttributes());
        C0287 c0287 = (C0287) interfaceC1971.getAttributes().m1644("Exceptions");
        InterfaceC3454 interfaceC3454 = c0287 == null ? C2819.f9030 : c0287.f1502;
        if (interfaceC3454.size() == 0) {
            return c0177M3155;
        }
        C0890 c0890M1226 = AbstractC0176.m1226(interfaceC3454);
        C0165 c0165 = new C0165(AbstractC0176.f1219, 3);
        c0165.m1217(new C2119(AbstractC0176.f1222, c0890M1226));
        c0165.f6944 = false;
        return C0177.m1227(c0177M3155, c0165);
    }

    public static C0221 m3158(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C0221 c0221M1256;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C0221((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c0221M1256 = C0221.m1256(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c0221M1256 = null;
            }
            if (c0221M1256 != null) {
                return c0221M1256;
            }
        }
        return new C0221((Shader) null, (ColorStateList) null, 0);
    }

    public static C0179 m3159(InterfaceC1971 interfaceC1971) {
        C0442 attributes = interfaceC1971.getAttributes();
        C0294 c0294 = (C0294) attributes.m1644("RuntimeVisibleParameterAnnotations");
        C0292 c0292 = (C0292) attributes.m1644("RuntimeInvisibleParameterAnnotations");
        if (c0294 == null) {
            return c0292 == null ? C0179.f1229 : (C0179) c0292.f1749;
        }
        C0179 c0179 = (C0179) c0294.f1749;
        if (c0292 == null) {
            return c0179;
        }
        C0179 c01710 = (C0179) c0292.f1749;
        C0179 c01711 = C0179.f1229;
        int length = c0179.f4836.length;
        if (length != c01710.f4836.length) {
            throw new IllegalArgumentException("list1.size() != list2.size()");
        }
        C0179 c01712 = new C0179(length);
        for (int i = 0; i < length; i++) {
            C0177 c0177 = (C0177) c0179.m3062(i);
            C0177 c0178 = (C0177) c01710.m3062(i);
            C0177 c01713 = new C0177();
            c01713.m1229(c0177);
            c01713.m1229(c0178);
            c01713.f6944 = false;
            c01713.m3926();
            c01712.m3063(i, c01713);
        }
        c01712.f6944 = false;
        return c01712;
    }

    public static boolean m3160(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final int m3161(InterfaceC2654 interfaceC2654, InterfaceC2654[] interfaceC2654Arr) {
        int iHashCode = (interfaceC2654.mo1342().hashCode() * 31) + Arrays.hashCode(interfaceC2654Arr);
        C0060 c0060 = new C0060(interfaceC2654);
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!c0060.hasNext()) {
                break;
            }
            int i2 = i * 31;
            String strMo1342 = ((InterfaceC2654) c0060.next()).mo1342();
            if (strMo1342 != null) {
                iHashCode3 = strMo1342.hashCode();
            }
            i = i2 + iHashCode3;
        }
        C0060 c0061 = new C0060(interfaceC2654);
        while (c0061.hasNext()) {
            int i3 = iHashCode2 * 31;
            AbstractC1460 abstractC1460Mo3472 = ((InterfaceC2654) c0061.next()).mo3472();
            iHashCode2 = i3 + (abstractC1460Mo3472 != null ? abstractC1460Mo3472.hashCode() : 0);
        }
        return (((iHashCode * 31) + i) * 31) + iHashCode2;
    }

    public static int m3162(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f5183;
        return AbstractC0752.m2222(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static InterfaceC1758 m3163(InterfaceC1414 interfaceC1414) {
        C1133 c1133 = C1133.f4215;
        int iM4759 = AbstractC2784.m4759(2);
        if (iM4759 == 0) {
            return new C2873(interfaceC1414);
        }
        if (iM4759 == 1) {
            C2623 c2623 = new C2623();
            c2623.f8511 = interfaceC1414;
            c2623.f8512 = c1133;
            return c2623;
        }
        if (iM4759 != 2) {
            throw new C0761();
        }
        C3505 c3505 = new C3505();
        c3505.f11006 = interfaceC1414;
        c3505.f11007 = c1133;
        return c3505;
    }

    public static float m3164(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray m3165(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final void m3166(Object obj, InterfaceC1425 interfaceC1425) {
        ((Handler) AbstractC1472.f5245.getValue()).post(new RunnableC1509(interfaceC1425, obj, 1));
    }

    public static C1969 m3167(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    C1969 c1969 = new C1969();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c1969.f6241 = byteBufferDuplicate;
                    c1969.f6238 = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c1969.f6239 = i6;
                    c1969.f6240 = ((ByteBuffer) c1969.f6241).getShort(i6);
                    return c1969;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public static final int m3168(C2649 c2649, int i) {
        int i2;
        int[] iArr = c2649.f8552;
        int i3 = i + 1;
        int length = c2649.f8551.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) >>> 1;
            int i5 = iArr[i2];
            if (i5 < i3) {
                i4 = i2 + 1;
            } else {
                if (i5 <= i3) {
                    if (true) {
                        return i2;
                    }
                    return ~i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static final String m3169(InterfaceC2654 interfaceC2654) {
        return AbstractC0744.m2196(AbstractC2203.m4044(0, interfaceC2654.mo3473()), ", ", interfaceC2654.mo1342() + '(', ")", new C0464(1, interfaceC2654), 24);
    }

    public static C0177 m3170(C0918 c0918, C0442 c0442, boolean z) {
        C0288 c0288 = (C0288) c0442.m1644("InnerClasses");
        if (c0288 != null) {
            C0442 c0443 = c0288.f1503;
            int length = c0443.f4836.length;
            ArrayList arrayList = new ArrayList();
            C1641 c1641 = null;
            for (int i = 0; i < length; i++) {
                C1641 c1642 = (C1641) c0443.m3062(i);
                C0918 c0919 = c1642.f5573;
                if (c0919.equals(c0918)) {
                    c1641 = c1642;
                } else if (c0918.equals(c1642.f5574)) {
                    arrayList.add(c0919.f3401);
                }
            }
            int size = arrayList.size();
            if (c1641 != null || size != 0) {
                C0177 c0177 = new C0177();
                if (c1641 != null) {
                    AbstractC0777 abstractC0777 = c1641.f5575;
                    int i2 = c1641.f5576;
                    C0165 c0165 = new C0165(AbstractC0176.f1215, 3);
                    if (abstractC0777 == null) {
                        abstractC0777 = C0906.f3363;
                    }
                    c0165.m1217(new C2119(AbstractC0176.f1221, abstractC0777));
                    c0165.m1217(new C2119(AbstractC0176.f1220, C0903.m2420(i2)));
                    c0165.f6944 = false;
                    c0177.m1228(c0165);
                    if (z) {
                        C0918 c09110 = c1641.f5574;
                        if (c09110 == null) {
                            throw new C3629("Ignoring InnerClasses attribute for an anonymous inner class\n(" + c0918.f3401.mo1214() + ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class.");
                        }
                        C0165 c0166 = new C0165(AbstractC0176.f1213, 3);
                        c0166.m1217(new C2119(AbstractC0176.f1222, c09110));
                        c0166.f6944 = false;
                        c0177.m1228(c0166);
                    }
                }
                if (size != 0) {
                    C2819 c2819 = new C2819(size);
                    for (int i3 = 0; i3 < size; i3++) {
                        c2819.m3063(i3, (C3448) arrayList.get(i3));
                    }
                    c2819.f6944 = false;
                    C0890 c0890M1226 = AbstractC0176.m1226(c2819);
                    C0165 c0167 = new C0165(AbstractC0176.f1216, 3);
                    c0167.m1217(new C2119(AbstractC0176.f1222, c0890M1226));
                    c0167.f6944 = false;
                    c0177.m1228(c0167);
                }
                c0177.f6944 = false;
                return c0177;
            }
        }
        return null;
    }

    public static final Object m3171(Object obj) {
        InterfaceC1624 interfaceC1624;
        C1625 c1625 = obj instanceof C1625 ? (C1625) obj : null;
        return (c1625 == null || (interfaceC1624 = c1625.f5497) == null) ? obj : interfaceC1624;
    }

    public static float m3172() {
        return ((float) Math.pow(0.5689655172413793, 3.0d)) * 100.0f;
    }

    public abstract void mo2734(Throwable th);

    public abstract void mo2735(C2103 c2103);
}
