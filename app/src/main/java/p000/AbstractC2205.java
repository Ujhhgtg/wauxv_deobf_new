package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.alibaba.fastjson2.JSONB;
import com.umeng.analytics.pro.ek;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲇᲁᲀᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2205 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1099 f7170 = new C1099(3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final byte[] f7171 = {112, 114, 111, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final byte[] f7172 = {112, 114, JSONB.Constants.BC_STR_ASCII_FIX_36, 0};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static boolean f7173 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m4047(AbstractC1351 abstractC1351) {
        int iM4903 = ((C2896) abstractC1351).m4903();
        return iM4903 == ((short) iM4903) ? AbstractC1460.m3219(iM4903) : AbstractC1460.m3220(iM4903);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m4048(AbstractC1351 abstractC1351) {
        int iM2442 = ((C2896) abstractC1351).f9313.m2442();
        return iM2442 == ((char) iM2442) ? AbstractC1460.m3223(iM2442) : AbstractC1460.m3224(iM2442);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static short m4049(int i, int i2) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((i2 & 255) == i2) {
            return (short) (i | (i2 << 8));
        }
        throw new IllegalArgumentException("high out of range 0..255");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static short m4050(int i, int i2, int i3, int i4) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("n0 out of range 0..15");
        }
        if ((i2 & 15) != i2) {
            throw new IllegalArgumentException("n1 out of range 0..15");
        }
        if ((i3 & 15) != i3) {
            throw new IllegalArgumentException("n2 out of range 0..15");
        }
        if ((i4 & 15) == i4) {
            return (short) (i | (i2 << 4) | (i3 << 8) | (i4 << 12));
        }
        throw new IllegalArgumentException("n3 out of range 0..15");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static C0425 m4051(InterfaceC0424 interfaceC0424, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC3429.f10802;
                    lock.lock();
                    Bitmap bitmapMo1513 = interfaceC0424.mo1513(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo1513);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo1513;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
                z = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            interfaceC0424 = f7170;
        }
        return C0425.m1628(interfaceC0424, bitmap);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static byte[] m4052(C1027[] c1027Arr, byte[] bArr) throws IOException {
        int length = 0;
        for (C1027 c1027 : c1027Arr) {
            length += ((((c1027.f3768 * 2) + 7) & (-8)) / 8) + (c1027.f3766 * 2) + m4053(c1027.f3762, c1027.f3763, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c1027.f3767;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, AbstractC2207.f7178)) {
            for (C1027 c1028 : c1027Arr) {
                m4083(byteArrayOutputStream, c1028, m4053(c1028.f3762, c1028.f3763, bArr));
                m4085(byteArrayOutputStream, c1028);
                int[] iArr = c1028.f3769;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    AbstractC1574.m3319(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                m4084(byteArrayOutputStream, c1028);
            }
        } else {
            for (C1027 c1029 : c1027Arr) {
                m4083(byteArrayOutputStream, c1029, m4053(c1029.f3762, c1029.f3763, bArr));
            }
            for (C1027 c10210 : c1027Arr) {
                m4085(byteArrayOutputStream, c10210);
                int[] iArr2 = c10210.f3769;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    AbstractC1574.m3319(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                m4084(byteArrayOutputStream, c10210);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static String m4053(String str, String str2, byte[] bArr) {
        byte[] bArr2 = AbstractC2207.f7179;
        byte[] bArr3 = AbstractC2207.f7180;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC2784.m4752(AbstractC2784.m4753(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static C0152 m4054() {
        return (C0152) C0152.f1159.getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String m4055(File file) throws NoSuchAlgorithmException, IOException {
        String[] strArr = AbstractC1574.f5469;
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = fileInputStream.read(bArr, 0, 1024);
            if (i == -1) {
                break;
            }
            messageDigest.update(bArr, 0, i);
        }
        fileInputStream.close();
        byte[] bArrDigest = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArrDigest) {
            String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.getDefault());
            "toUpperCase(...)";
            if (upperCase.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(upperCase);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC1743 m4056(InterfaceC1743 interfaceC1743) {
        return interfaceC1743.mo1363().mo3470() ? interfaceC1743 : new C2241(interfaceC1743);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static void m4057(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m4060(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m4060(b3) && !m4060(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & JSONB.Constants.BC_INT32_BYTE_MAX) << 12) | ((b3 & JSONB.Constants.BC_INT32_BYTE_MAX) << 6) | (b4 & JSONB.Constants.BC_INT32_BYTE_MAX);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static void m4058(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m4060(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m4060(b3)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i] = (char) (((b & ek.m) << 12) | ((b2 & JSONB.Constants.BC_INT32_BYTE_MAX) << 6) | (b3 & JSONB.Constants.BC_INT32_BYTE_MAX));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static void m4059(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (m4060(b2)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & JSONB.Constants.BC_INT32_BYTE_MAX));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static boolean m4060(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static boolean m4061(C2526 c2526) {
        int length = c2526.f4836.length;
        if (length < 2) {
            return true;
        }
        int iM4540 = ((C2525) c2526.m3062(0)).f8055;
        for (int i = 0; i < length; i++) {
            C2525 c2525 = (C2525) c2526.m3062(i);
            if (c2525.f8055 != iM4540) {
                return false;
            }
            iM4540 += c2525.m4540();
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static CharSequence m4062(CharSequence charSequence) {
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static String m4063(AbstractC0909 abstractC0909, int i) {
        StringBuilder sb = new StringBuilder(20);
        sb.append("#");
        long jMo2424 = abstractC0909 instanceof AbstractC0908 ? ((AbstractC0908) abstractC0909).f3365 : abstractC0909.mo2424();
        if (i == 4) {
            sb.append(new String(new char[]{Character.forDigit(((int) jMo2424) & 15, 16)}));
        } else if (i == 8) {
            sb.append(AbstractC1460.m3222((int) jMo2424));
        } else if (i == 16) {
            sb.append(AbstractC1460.m3223((int) jMo2424));
        } else if (i == 32) {
            sb.append(AbstractC1460.m3224((int) jMo2424));
        } else {
            if (i != 64) {
                throw new RuntimeException("shouldn't happen");
            }
            sb.append(AbstractC1460.m3225(jMo2424));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static String m4064(AbstractC0909 abstractC0909) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (abstractC0909 instanceof C0906) {
            sb.append("null");
        } else {
            sb.append(abstractC0909.mo2269());
            sb.append(' ');
            sb.append(abstractC0909.mo1214());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static int m4065(int i, int i2) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("low out of range 0..15");
        }
        if ((i2 & 15) == i2) {
            return i | (i2 << 4);
        }
        throw new IllegalArgumentException("high out of range 0..15");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static short m4066(AbstractC0950 abstractC0950, int i) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("arg out of range 0..255");
        }
        int i2 = abstractC0950.f3468.f3926;
        if ((i2 & 255) == i2) {
            return (short) (i2 | (i << 8));
        }
        throw new IllegalArgumentException("opcode out of range 0..255");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static int[] m4067(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM3305 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM3305 += (int) AbstractC1574.m3305(byteArrayInputStream, 2);
            iArr[i2] = iM3305;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static C1027[] m4068(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C1027[] c1027Arr) throws IOException {
        byte[] bArr3 = AbstractC2207.f7181;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, AbstractC2207.f7182)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM3305 = (int) AbstractC1574.m3305(fileInputStream, 2);
            byte[] bArrM3304 = AbstractC1574.m3304(fileInputStream, (int) AbstractC1574.m3305(fileInputStream, 4), (int) AbstractC1574.m3305(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM3304);
            try {
                C1027[] c1027ArrM4070 = m4070(byteArrayInputStream, bArr2, iM3305, c1027Arr);
                byteArrayInputStream.close();
                return c1027ArrM4070;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(AbstractC2207.f7176, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM3306 = (int) AbstractC1574.m3305(fileInputStream, 1);
        byte[] bArrM3305 = AbstractC1574.m3304(fileInputStream, (int) AbstractC1574.m3305(fileInputStream, 4), (int) AbstractC1574.m3305(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM3305);
        try {
            C1027[] c1027ArrM4069 = m4069(byteArrayInputStream2, iM3306, c1027Arr);
            byteArrayInputStream2.close();
            return c1027ArrM4069;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static C1027[] m4069(ByteArrayInputStream byteArrayInputStream, int i, C1027[] c1027Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1027[0];
        }
        if (i != c1027Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM3305 = (int) AbstractC1574.m3305(byteArrayInputStream, 2);
            iArr[i2] = (int) AbstractC1574.m3305(byteArrayInputStream, 2);
            strArr[i2] = new String(AbstractC1574.m3303(byteArrayInputStream, iM3305), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C1027 c1027 = c1027Arr[i3];
            if (!c1027.f3763.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c1027.f3766 = i4;
            c1027.f3769 = m4067(byteArrayInputStream, i4);
        }
        return c1027Arr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static C1027[] m4070(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C1027[] c1027Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1027[0];
        }
        if (i != c1027Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC1574.m3305(byteArrayInputStream, 2);
            String str = new String(AbstractC1574.m3303(byteArrayInputStream, (int) AbstractC1574.m3305(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM3305 = AbstractC1574.m3305(byteArrayInputStream, 4);
            int iM3305 = (int) AbstractC1574.m3305(byteArrayInputStream, 2);
            C1027 c1027 = null;
            if (c1027Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < c1027Arr.length; i3++) {
                    if (c1027Arr[i3].f3763.equals(strSubstring)) {
                        c1027 = c1027Arr[i3];
                        break;
                    }
                }
            }
            if (c1027 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c1027.f3765 = jM3305;
            int[] iArrM4067 = m4067(byteArrayInputStream, iM3305);
            if (Arrays.equals(bArr, AbstractC2207.f7180)) {
                c1027.f3766 = iM3305;
                c1027.f3769 = iArrM4067;
            }
        }
        return c1027Arr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static C1027[] m4071(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC2207.f7177)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM3305 = (int) AbstractC1574.m3305(fileInputStream, 1);
        byte[] bArrM3304 = AbstractC1574.m3304(fileInputStream, (int) AbstractC1574.m3305(fileInputStream, 4), (int) AbstractC1574.m3305(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM3304);
        try {
            C1027[] c1027ArrM4072 = m4072(byteArrayInputStream, str, iM3305);
            byteArrayInputStream.close();
            return c1027ArrM4072;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public static C1027[] m4072(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C1027[0];
        }
        C1027[] c1027Arr = new C1027[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM3305 = (int) AbstractC1574.m3305(byteArrayInputStream, 2);
            int iM3306 = (int) AbstractC1574.m3305(byteArrayInputStream, 2);
            c1027Arr[i3] = new C1027(str, new String(AbstractC1574.m3303(byteArrayInputStream, iM3305), StandardCharsets.UTF_8), AbstractC1574.m3305(byteArrayInputStream, 4), iM3306, (int) AbstractC1574.m3305(byteArrayInputStream, 4), (int) AbstractC1574.m3305(byteArrayInputStream, 4), new int[iM3306], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C1027 c1027 = c1027Arr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c1027.f3767;
            int i6 = c1027.f3768;
            TreeMap treeMap = c1027.f3770;
            int i7 = iAvailable - i5;
            int iM3307 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM3307 += (int) AbstractC1574.m3305(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3307), 1);
                int iM3308 = (int) AbstractC1574.m3305(byteArrayInputStream, 2);
                while (iM3308 > 0) {
                    AbstractC1574.m3305(byteArrayInputStream, 2);
                    int iM3309 = (int) AbstractC1574.m3305(byteArrayInputStream, 1);
                    if (iM3309 != 6 && iM3309 != 7) {
                        while (iM3309 > 0) {
                            AbstractC1574.m3305(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM33010 = (int) AbstractC1574.m3305(byteArrayInputStream, 1); iM33010 > 0; iM33010--) {
                                AbstractC1574.m3305(byteArrayInputStream, 2);
                            }
                            iM3309--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM3308--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c1027.f3769 = m4067(byteArrayInputStream, c1027.f3766);
            BitSet bitSetValueOf = BitSet.valueOf(AbstractC1574.m3303(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return c1027Arr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public static String m4073(C2526 c2526) {
        int length = c2526.f4836.length;
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        sb.append('{');
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(((C2525) c2526.m3062(i)).m4542());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public static String m4074(C2526 c2526) {
        int length = c2526.f4836.length;
        StringBuilder sb = new StringBuilder(30);
        sb.append("{");
        if (length != 0) {
            if (length != 1) {
                C2525 c2525M4544 = (C2525) c2526.m3062(length - 1);
                if (c2525M4544.m4540() == 2) {
                    c2525M4544 = c2525M4544.m4544(c2525M4544.f8055 + 1);
                }
                sb.append(((C2525) c2526.m3062(0)).m4542());
                sb.append("..");
                sb.append(c2525M4544.m4542());
            } else {
                sb.append(((C2525) c2526.m3062(0)).m4542());
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public static final long m4075(String str, long j, long j2, long j3) {
        String property;
        int i = AbstractC2883.f9237;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM4854 = AbstractC2848.m4854(property);
        if (lM4854 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM4854.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static int m4076(int i, int i2, String str) {
        return (int) m4075(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static Class m4077(String str) {
        Object c2585;
        String str2 = "[" + str + "][" + ((Object) null) + "]";
        LinkedHashMap linkedHashMap = AbstractC2521.f8047;
        Class cls = (Class) linkedHashMap.get(str2);
        if (cls != null) {
            return cls;
        }
        try {
            C0251.f1415.getClass();
            c2585 = Class.forName(str, false, C0251.m1336());
            linkedHashMap.put(str2, c2585);
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        Class cls2 = (Class) (c2585 instanceof C2585 ? null : c2585);
        if (cls2 != null) {
            return cls2;
        }
        C0251.f1415.getClass();
        ClassLoader classLoaderM1336 = C0251.m1336();
        String[] strArr = {AbstractC1194.m2785("name:[", str, "]")};
        String str3 = "";
        String strM4748 = "";
        int i = 0;
        while (true) {
            strM4748 = AbstractC2784.m4748(strM4748, " ");
            if (i == 30) {
                break;
            }
            i++;
        }
        String strM4749 = AbstractC2784.m4748(strM4748, " -> ");
        String str4 = strArr[0];
        if (!AbstractC2841.m4836(str4)) {
            str3 = "" + strM4749 + str4 + "\n";
        }
        throw new NoClassDefFoundError("Can't find this Class in [" + classLoaderM1336 + "]:\n" + ((Object) str3) + "Generated by YukiHookAPI#ReflectionTool");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public static final Class m4078(Class cls) {
        boolean zM4087 = AbstractC2207.m4087(cls, C3497.class);
        Class cls2 = Void.TYPE;
        if (!zM4087 && !AbstractC2207.m4087(cls, Void.class)) {
            if (!AbstractC2207.m4087(cls, cls2 == null ? m4077("void") : cls2)) {
                boolean zM4088 = AbstractC2207.m4087(cls, Boolean.class);
                Class cls3 = Boolean.TYPE;
                if (!zM4088) {
                    if (!AbstractC2207.m4087(cls, cls3 == null ? m4077("boolean") : cls3)) {
                        boolean zM4089 = AbstractC2207.m4087(cls, Integer.class);
                        Class cls4 = Integer.TYPE;
                        if (!zM4089) {
                            if (!AbstractC2207.m4087(cls, cls4 == null ? m4077("int") : cls4)) {
                                boolean zM40810 = AbstractC2207.m4087(cls, Float.class);
                                Class cls5 = Float.TYPE;
                                if (!zM40810) {
                                    if (!AbstractC2207.m4087(cls, cls5 == null ? m4077("float") : cls5)) {
                                        boolean zM40811 = AbstractC2207.m4087(cls, Double.class);
                                        Class cls6 = Double.TYPE;
                                        if (!zM40811) {
                                            if (!AbstractC2207.m4087(cls, cls6 == null ? m4077("double") : cls6)) {
                                                boolean zM40812 = AbstractC2207.m4087(cls, Long.class);
                                                Class cls7 = Long.TYPE;
                                                if (!zM40812) {
                                                    if (!AbstractC2207.m4087(cls, cls7 == null ? m4077("long") : cls7)) {
                                                        boolean zM40813 = AbstractC2207.m4087(cls, Short.class);
                                                        Class cls8 = Short.TYPE;
                                                        if (!zM40813) {
                                                            if (!AbstractC2207.m4087(cls, cls8 == null ? m4077("short") : cls8)) {
                                                                boolean zM40814 = AbstractC2207.m4087(cls, Character.class);
                                                                Class cls9 = Character.TYPE;
                                                                if (!zM40814) {
                                                                    if (!AbstractC2207.m4087(cls, cls9 == null ? m4077("char") : cls9)) {
                                                                        boolean zM40815 = AbstractC2207.m4087(cls, Byte.class);
                                                                        Class cls10 = Byte.TYPE;
                                                                        if (!zM40815) {
                                                                            if (!AbstractC2207.m4087(cls, cls10 == null ? m4077("byte") : cls10)) {
                                                                                return cls;
                                                                            }
                                                                        }
                                                                        return cls10 == null ? m4077("byte") : cls10;
                                                                    }
                                                                }
                                                                return cls9 == null ? m4077("char") : cls9;
                                                            }
                                                        }
                                                        return cls8 == null ? m4077("short") : cls8;
                                                    }
                                                }
                                                return cls7 == null ? m4077("long") : cls7;
                                            }
                                        }
                                        return cls6 == null ? m4077("double") : cls6;
                                    }
                                }
                                return cls5 == null ? m4077("float") : cls5;
                            }
                        }
                        return cls4 == null ? m4077("int") : cls4;
                    }
                }
                return cls3 == null ? m4077("boolean") : cls3;
            }
        }
        return cls2 == null ? m4077("void") : cls2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public static boolean m4079(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C1027[] c1027Arr) throws IOException {
        long j;
        int length;
        byte[] bArr2 = AbstractC2207.f7180;
        byte[] bArr3 = AbstractC2207.f7179;
        byte[] bArr4 = AbstractC2207.f7176;
        int i = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                AbstractC1574.m3319(byteArrayOutputStream2, c1027Arr.length);
                int i2 = 2;
                int i3 = 2;
                for (C1027 c1027 : c1027Arr) {
                    AbstractC1574.m3318(byteArrayOutputStream2, c1027.f3764, 4);
                    AbstractC1574.m3318(byteArrayOutputStream2, c1027.f3765, 4);
                    AbstractC1574.m3318(byteArrayOutputStream2, c1027.f3768, 4);
                    String strM4053 = m4053(c1027.f3762, c1027.f3763, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strM4053.getBytes(charset).length;
                    AbstractC1574.m3319(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(strM4053.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
                }
                C3671 c3671 = new C3671(byteArray, 1, false);
                byteArrayOutputStream2.close();
                arrayList.add(c3671);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i4 = 0;
                int i5 = 0;
                while (i4 < c1027Arr.length) {
                    try {
                        C1027 c1028 = c1027Arr[i4];
                        AbstractC1574.m3319(byteArrayOutputStream3, i4);
                        AbstractC1574.m3319(byteArrayOutputStream3, c1028.f3766);
                        i5 = i5 + 4 + (c1028.f3766 * i2);
                        int[] iArr = c1028.f3769;
                        int length3 = iArr.length;
                        int i6 = i;
                        int i7 = i2;
                        int i8 = i6;
                        while (i8 < length3) {
                            int i9 = iArr[i8];
                            AbstractC1574.m3319(byteArrayOutputStream3, i9 - i6);
                            i8++;
                            i6 = i9;
                        }
                        i4++;
                        i2 = i7;
                        i = 0;
                    } catch (Throwable th) {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i5 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                C3671 c3672 = new C3671(byteArray2, 3, true);
                byteArrayOutputStream3.close();
                arrayList.add(c3672);
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < c1027Arr.length) {
                    try {
                        C1027 c1029 = c1027Arr[i10];
                        Iterator it = c1029.f3770.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                        try {
                            m4084(byteArrayOutputStream5, c1029);
                            byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                            byteArrayOutputStream5.close();
                            ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                            try {
                                m4085(byteArrayOutputStream6, c1029);
                                byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                                byteArrayOutputStream6.close();
                                AbstractC1574.m3319(byteArrayOutputStream4, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i11 + 6;
                                int i13 = i10;
                                AbstractC1574.m3318(byteArrayOutputStream4, length4, 4);
                                AbstractC1574.m3319(byteArrayOutputStream4, iIntValue);
                                byteArrayOutputStream4.write(byteArray3);
                                byteArrayOutputStream4.write(byteArray4);
                                i11 = i12 + length4;
                                i10 = i13 + 1;
                            } catch (Throwable th3) {
                                try {
                                    byteArrayOutputStream6.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                byteArrayOutputStream5.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            byteArrayOutputStream4.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
                if (i11 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                }
                C3671 c3673 = new C3671(byteArray5, 4, true);
                byteArrayOutputStream4.close();
                arrayList.add(c3673);
                long j2 = 4;
                long size = j2 + j2 + 4 + ((long) (arrayList.size() * 16));
                AbstractC1574.m3318(byteArrayOutputStream, arrayList.size(), 4);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    C3671 c3674 = (C3671) arrayList.get(i14);
                    int i15 = c3674.f11458;
                    byte[] bArr5 = c3674.f11459;
                    if (i15 == 1) {
                        j = 0;
                    } else if (i15 == 2) {
                        j = 1;
                    } else if (i15 == 3) {
                        j = 2;
                    } else if (i15 == 4) {
                        j = 3;
                    } else {
                        if (i15 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                    AbstractC1574.m3318(byteArrayOutputStream, j, 4);
                    AbstractC1574.m3318(byteArrayOutputStream, size, 4);
                    if (c3674.f11460) {
                        long length5 = bArr5.length;
                        byte[] bArrM3292 = AbstractC1574.m3292(bArr5);
                        arrayList2.add(bArrM3292);
                        AbstractC1574.m3318(byteArrayOutputStream, bArrM3292.length, 4);
                        AbstractC1574.m3318(byteArrayOutputStream, length5, 4);
                        length = bArrM3292.length;
                    } else {
                        arrayList2.add(bArr5);
                        AbstractC1574.m3318(byteArrayOutputStream, bArr5.length, 4);
                        AbstractC1574.m3318(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += (long) length;
                }
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i16));
                }
            } catch (Throwable th9) {
                try {
                    byteArrayOutputStream2.close();
                    throw th9;
                } catch (Throwable th10) {
                    th9.addSuppressed(th10);
                    throw th9;
                }
            }
        } else {
            byte[] bArr6 = AbstractC2207.f7177;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM4052 = m4052(c1027Arr, bArr6);
                AbstractC1574.m3318(byteArrayOutputStream, c1027Arr.length, 1);
                AbstractC1574.m3318(byteArrayOutputStream, bArrM4052.length, 4);
                byte[] bArrM3293 = AbstractC1574.m3292(bArrM4052);
                AbstractC1574.m3318(byteArrayOutputStream, bArrM3293.length, 4);
                byteArrayOutputStream.write(bArrM3293);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                AbstractC1574.m3318(byteArrayOutputStream, c1027Arr.length, 1);
                for (C1027 c10210 : c1027Arr) {
                    int size2 = c10210.f3770.size() * 4;
                    String strM4054 = m4053(c10210.f3762, c10210.f3763, bArr3);
                    Charset charset2 = StandardCharsets.UTF_8;
                    AbstractC1574.m3319(byteArrayOutputStream, strM4054.getBytes(charset2).length);
                    AbstractC1574.m3319(byteArrayOutputStream, c10210.f3769.length);
                    AbstractC1574.m3318(byteArrayOutputStream, size2, 4);
                    AbstractC1574.m3318(byteArrayOutputStream, c10210.f3764, 4);
                    byteArrayOutputStream.write(strM4054.getBytes(charset2));
                    Iterator it2 = c10210.f3770.keySet().iterator();
                    while (it2.hasNext()) {
                        AbstractC1574.m3319(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        AbstractC1574.m3319(byteArrayOutputStream, 0);
                    }
                    for (int i17 : c10210.f3769) {
                        AbstractC1574.m3319(byteArrayOutputStream, i17);
                    }
                }
            } else {
                byte[] bArr7 = AbstractC2207.f7178;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrM4053 = m4052(c1027Arr, bArr7);
                    AbstractC1574.m3318(byteArrayOutputStream, c1027Arr.length, 1);
                    AbstractC1574.m3318(byteArrayOutputStream, bArrM4053.length, 4);
                    byte[] bArrM3294 = AbstractC1574.m3292(bArrM4053);
                    AbstractC1574.m3318(byteArrayOutputStream, bArrM3294.length, 4);
                    byteArrayOutputStream.write(bArrM3294);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                AbstractC1574.m3319(byteArrayOutputStream, c1027Arr.length);
                for (C1027 c10211 : c1027Arr) {
                    String str = c10211.f3762;
                    TreeMap treeMap = c10211.f3770;
                    String strM4055 = m4053(str, c10211.f3763, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    AbstractC1574.m3319(byteArrayOutputStream, strM4055.getBytes(charset3).length);
                    AbstractC1574.m3319(byteArrayOutputStream, treeMap.size());
                    AbstractC1574.m3319(byteArrayOutputStream, c10211.f3769.length);
                    AbstractC1574.m3318(byteArrayOutputStream, c10211.f3764, 4);
                    byteArrayOutputStream.write(strM4055.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        AbstractC1574.m3319(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i18 : c10211.f3769) {
                        AbstractC1574.m3319(byteArrayOutputStream, i18);
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public static boolean m4080(int i) {
        return i == (i & 255);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ, reason: contains not printable characters */
    public static boolean m4081(int i) {
        return i == (i & 15);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ, reason: contains not printable characters */
    public static boolean m4082(int i) {
        return i == (65535 & i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ, reason: contains not printable characters */
    public static void m4083(ByteArrayOutputStream byteArrayOutputStream, C1027 c1027, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC1574.m3319(byteArrayOutputStream, str.getBytes(charset).length);
        AbstractC1574.m3319(byteArrayOutputStream, c1027.f3766);
        AbstractC1574.m3318(byteArrayOutputStream, c1027.f3767, 4);
        AbstractC1574.m3318(byteArrayOutputStream, c1027.f3764, 4);
        AbstractC1574.m3318(byteArrayOutputStream, c1027.f3768, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ, reason: contains not printable characters */
    public static void m4084(ByteArrayOutputStream byteArrayOutputStream, C1027 c1027) throws IOException {
        byte[] bArr = new byte[(((c1027.f3768 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c1027.f3770.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + c1027.f3768;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ, reason: contains not printable characters */
    public static void m4085(ByteArrayOutputStream byteArrayOutputStream, C1027 c1027) {
        int i = 0;
        for (Map.Entry entry : c1027.f3770.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC1574.m3319(byteArrayOutputStream, iIntValue - i);
                AbstractC1574.m3319(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public boolean mo3108(C2896 c2896) {
        return this instanceof C1397;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public abstract int mo3109();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public BitSet mo3110(AbstractC0950 abstractC0950) {
        return new BitSet();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public abstract int[] mo3725();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public abstract String mo3111(AbstractC1351 abstractC1351);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public abstract String mo3112(AbstractC1351 abstractC1351);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public abstract boolean mo3113(AbstractC0950 abstractC0950);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public abstract int mo3726(boolean z);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public abstract AbstractC2203 mo3727();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public abstract void mo3114(C0519 c0519, AbstractC1351 abstractC1351);
}
