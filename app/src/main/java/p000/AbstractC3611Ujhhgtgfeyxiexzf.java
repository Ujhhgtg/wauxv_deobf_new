package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.Base64;
import android.util.Xml;
import android.view.Display;
import android.view.RoundedCorner;
import dalvik.system.InMemoryDexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛳ能不能ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3611Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final float[][] f11228Ujhhgtgfeyxiexzf = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final float[][] f11229Ujhhgtgfeyxiexzf = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final float[] f11230Ujhhgtgfeyxiexzf = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final float[][] f11231Ujhhgtgfeyxiexzf = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final Object f11232Ujhhgtgfeyxiexzf = new Object();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f11233Ujhhgtgfeyxiexzf;

    public /* synthetic */ AbstractC3611Ujhhgtgfeyxiexzf(int i) {
        this.f11233Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m5209Ujhhgtgfeyxiexzf(C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf, C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf, C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf2, C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, String str, byte[] bArr) {
        C3159feyxiexzfUjhhgtg c3159feyxiexzfUjhhgtg = new C3159feyxiexzfUjhhgtg(str, bArr);
        c3159feyxiexzfUjhhgtg.f9788Ujhhgtgfeyxiexzf = C3382feyxiexzfUjhhgtg.f10567Ujhhgtgfeyxiexzf;
        try {
            C2813Ujhhgtgfeyxiexzf c2813UjhhgtgfeyxiexzfM5140Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5140Ujhhgtgfeyxiexzf(c2965Ujhhgtgfeyxiexzf, c3159feyxiexzfUjhhgtg, c2697Ujhhgtgfeyxiexzf, c2697Ujhhgtgfeyxiexzf2, c3268feyxiexzfUjhhgtg);
            C2635feyxiexzfUjhhgtg c2635feyxiexzfUjhhgtg = c3268feyxiexzfUjhhgtg.f10269Ujhhgtgfeyxiexzf;
            TreeMap treeMap = c2635feyxiexzfUjhhgtg.f8474Ujhhgtgfeyxiexzf;
            try {
                C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg = c2813UjhhgtgfeyxiexzfM5140Ujhhgtgfeyxiexzf.f8952Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf;
                c2635feyxiexzfUjhhgtg.m2564Ujhhgtgfeyxiexzf();
                if (treeMap.get(c1784feyxiexzfUjhhgtg) == null) {
                    treeMap.put(c1784feyxiexzfUjhhgtg, c2813UjhhgtgfeyxiexzfM5140Ujhhgtgfeyxiexzf);
                } else {
                    throw new IllegalArgumentException("already added: " + c1784feyxiexzfUjhhgtg);
                }
            } catch (NullPointerException unused) {
                throw new NullPointerException("clazz == null");
            }
        } catch (RuntimeException e) {
            throw C3355feyxiexzfUjhhgtg.m4860Ujhhgtgfeyxiexzf("...while processing " + c3159feyxiexzfUjhhgtg.f9777Ujhhgtgfeyxiexzf, e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static int m5210Ujhhgtgfeyxiexzf(C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf, C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf, C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf2, C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, FileInputStream fileInputStream) throws IOException {
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf2;
        C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf3;
        C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf4;
        C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg2;
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        int i = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return i;
                }
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    if (!name.endsWith(".class") || name.startsWith("META-INF/")) {
                        c2965Ujhhgtgfeyxiexzf2 = c2965Ujhhgtgfeyxiexzf;
                        c2697Ujhhgtgfeyxiexzf3 = c2697Ujhhgtgfeyxiexzf;
                        c2697Ujhhgtgfeyxiexzf4 = c2697Ujhhgtgfeyxiexzf2;
                        c3268feyxiexzfUjhhgtg2 = c3268feyxiexzfUjhhgtg;
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i2 = zipInputStream.read(bArr);
                            if (i2 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i2);
                        }
                        c2965Ujhhgtgfeyxiexzf2 = c2965Ujhhgtgfeyxiexzf;
                        c2697Ujhhgtgfeyxiexzf3 = c2697Ujhhgtgfeyxiexzf;
                        c2697Ujhhgtgfeyxiexzf4 = c2697Ujhhgtgfeyxiexzf2;
                        c3268feyxiexzfUjhhgtg2 = c3268feyxiexzfUjhhgtg;
                        m5209Ujhhgtgfeyxiexzf(c2965Ujhhgtgfeyxiexzf2, c2697Ujhhgtgfeyxiexzf3, c2697Ujhhgtgfeyxiexzf4, c3268feyxiexzfUjhhgtg2, name, byteArrayOutputStream.toByteArray());
                        i++;
                    }
                    c2965Ujhhgtgfeyxiexzf = c2965Ujhhgtgfeyxiexzf2;
                    c2697Ujhhgtgfeyxiexzf = c2697Ujhhgtgfeyxiexzf3;
                    c2697Ujhhgtgfeyxiexzf2 = c2697Ujhhgtgfeyxiexzf4;
                    c3268feyxiexzfUjhhgtg = c3268feyxiexzfUjhhgtg2;
                }
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final InterfaceC1121feyxiexzfUjhhgtg m5211Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, C0420Ujhhgtgfeyxiexzf c0420Ujhhgtgfeyxiexzf) {
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf(), C1099feyxiexzfUjhhgtg.f4181Ujhhgtgfeyxiexzf)) {
            return interfaceC1121feyxiexzfUjhhgtg.mo1184Ujhhgtgfeyxiexzf() ? m5211Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(0), c0420Ujhhgtgfeyxiexzf) : interfaceC1121feyxiexzfUjhhgtg;
        }
        AbstractC2855feyxiexzfUjhhgtg.m4209feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg);
        return interfaceC1121feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static int m5212Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static InMemoryDexClassLoader m5213Ujhhgtgfeyxiexzf(String str, byte[] bArr, ClassLoader classLoader) throws IOException {
        C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf = new C2697Ujhhgtgfeyxiexzf(1);
        C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf2 = new C2697Ujhhgtgfeyxiexzf(0);
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(19);
        String strM2703Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(str.replace('.', '/'), ".class");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg = new C3268feyxiexzfUjhhgtg(c2697Ujhhgtgfeyxiexzf);
            m5209Ujhhgtgfeyxiexzf(c2965Ujhhgtgfeyxiexzf, c2697Ujhhgtgfeyxiexzf2, c2697Ujhhgtgfeyxiexzf, c3268feyxiexzfUjhhgtg, strM2703Ujhhgtgfeyxiexzf, bArr);
            c3268feyxiexzfUjhhgtg.m4775Ujhhgtgfeyxiexzf(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return new InMemoryDexClassLoader(ByteBuffer.wrap(byteArray), classLoader);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static InMemoryDexClassLoader m5214Ujhhgtgfeyxiexzf(ClassLoader classLoader, String str) throws IOException {
        C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf = new C2697Ujhhgtgfeyxiexzf(1);
        C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf2 = new C2697Ujhhgtgfeyxiexzf(0);
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(19);
        C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg = new C3268feyxiexzfUjhhgtg(c2697Ujhhgtgfeyxiexzf);
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            int iM5210Ujhhgtgfeyxiexzf = m5210Ujhhgtgfeyxiexzf(c2965Ujhhgtgfeyxiexzf, c2697Ujhhgtgfeyxiexzf2, c2697Ujhhgtgfeyxiexzf, c3268feyxiexzfUjhhgtg, fileInputStream);
            fileInputStream.close();
            if (iM5210Ujhhgtgfeyxiexzf == 0) {
                throw new IOException(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("No class file found in jar ", str));
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c3268feyxiexzfUjhhgtg.m4775Ujhhgtgfeyxiexzf(byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return new InMemoryDexClassLoader(ByteBuffer.wrap(byteArray), classLoader);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String m5215Ujhhgtgfeyxiexzf(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str3)) {
            sb.append("\n" + str3);
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static C0942feyxiexzfUjhhgtg m5216Ujhhgtgfeyxiexzf(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(position, "Invalid position: "));
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new C0942feyxiexzfUjhhgtg(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final int m5217Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, InterfaceC1121feyxiexzfUjhhgtg[] interfaceC1121feyxiexzfUjhhgtgArr) {
        int iHashCode = (interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf().hashCode() * 31) + Arrays.hashCode(interfaceC1121feyxiexzfUjhhgtgArr);
        C2930Ujhhgtgfeyxiexzf c2930Ujhhgtgfeyxiexzf = new C2930Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg);
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!c2930Ujhhgtgfeyxiexzf.hasNext()) {
                break;
            }
            int i2 = i * 31;
            String strMo1117Ujhhgtgfeyxiexzf = ((InterfaceC1121feyxiexzfUjhhgtg) c2930Ujhhgtgfeyxiexzf.next()).mo1117Ujhhgtgfeyxiexzf();
            if (strMo1117Ujhhgtgfeyxiexzf != null) {
                iHashCode3 = strMo1117Ujhhgtgfeyxiexzf.hashCode();
            }
            i = i2 + iHashCode3;
        }
        C2930Ujhhgtgfeyxiexzf c2930Ujhhgtgfeyxiexzf2 = new C2930Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg);
        while (c2930Ujhhgtgfeyxiexzf2.hasNext()) {
            int i3 = iHashCode2 * 31;
            AbstractC3611Ujhhgtgfeyxiexzf abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf = ((InterfaceC1121feyxiexzfUjhhgtg) c2930Ujhhgtgfeyxiexzf2.next()).mo1119Ujhhgtgfeyxiexzf();
            iHashCode2 = i3 + (abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf != null ? abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf.hashCode() : 0);
        }
        return (((iHashCode * 31) + i) * 31) + iHashCode2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static int m5218Ujhhgtgfeyxiexzf(float f) {
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
        float[] fArr = f11230Ujhhgtgfeyxiexzf;
        return AbstractC2857Ujhhgtgfeyxiexzf.m4258Ujhhgtgfeyxiexzf(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static final void m5219Ujhhgtgfeyxiexzf(C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf, String str) {
        c3017Ujhhgtgfeyxiexzf.m4479Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf.f9376Ujhhgtgfeyxiexzf - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static /* synthetic */ void m5220Ujhhgtgfeyxiexzf(C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf) {
        m5219Ujhhgtgfeyxiexzf(c3017Ujhhgtgfeyxiexzf, "object");
        throw null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static float m5221Ujhhgtgfeyxiexzf(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static final CharSequence m5222Ujhhgtgfeyxiexzf(int i, CharSequence charSequence) {
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbM2707Ujhhgtgfeyxiexzf.append(charSequence.subSequence(i2, i3).toString());
                sbM2707Ujhhgtgfeyxiexzf.append(str2);
                return sbM2707Ujhhgtgfeyxiexzf.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String m5223Ujhhgtgfeyxiexzf(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, str != null ? AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011b A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x011f A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014c A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0150 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static InterfaceC3631Ujhhgtgfeyxiexzf m5224Ujhhgtgfeyxiexzf(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i;
        int i2;
        ?? r3;
        long j;
        Throwable th;
        ?? r4;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m5226Ujhhgtgfeyxiexzf(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0768feyxiexzfUjhhgtg.f3046Ujhhgtgfeyxiexzf);
        int i3 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0768feyxiexzfUjhhgtg.f3047Ujhhgtgfeyxiexzf);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m5226Ujhhgtgfeyxiexzf(xmlResourceParser);
                        }
                        arrayList.add(new C3633feyxiexzfUjhhgtg(string7, i5, z, string6, i7, resourceId2));
                    } else {
                        m5226Ujhhgtgfeyxiexzf(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C3632Ujhhgtgfeyxiexzf((C3633feyxiexzfUjhhgtg[]) arrayList.toArray(new C3633feyxiexzfUjhhgtg[0]));
        }
        List listM5225Ujhhgtgfeyxiexzf = m5225Ujhhgtgfeyxiexzf(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0768feyxiexzfUjhhgtg.f3048Ujhhgtgfeyxiexzf);
                    int i9 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i3);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            r3 = typedArrayObtainAttributes3;
                            j = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                m5226Ujhhgtgfeyxiexzf(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = typedArrayObtainAttributes3;
                                j = 1;
                            }
                        }
                        try {
                            r3 = typedArrayObtainAttributes3;
                            i2 = i9;
                            j = 1;
                            try {
                                C3624feyxiexzfUjhhgtg c3624feyxiexzfUjhhgtg = new C3624feyxiexzfUjhhgtg(string, string2, string8, listM5225Ujhhgtgfeyxiexzf, string9, string10);
                                if (r3 instanceof AutoCloseable) {
                                    ((AutoCloseable) r3).close();
                                } else if (r3 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r3;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z2 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService2.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r3.recycle();
                                }
                                arrayList2.add(c3624feyxiexzfUjhhgtg);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r3 = typedArrayObtainAttributes3;
                            j = 1;
                            th = th;
                            r4 = r3;
                            if (r4 != 0) {
                                throw th;
                            }
                            try {
                                if (!(r4 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r4).close();
                                    throw th;
                                }
                                if (r4 instanceof ExecutorService) {
                                    r4.recycle();
                                    throw th;
                                }
                                executorService = (ExecutorService) r4;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                        th = th3;
                    } catch (Throwable th6) {
                        th = th6;
                        r3 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r4 = r3;
                    if (r4 != 0) {
                        throw th;
                    }
                    if (!(r4 instanceof AutoCloseable)) {
                        ((AutoCloseable) r4).close();
                        throw th;
                    }
                    if (r4 instanceof ExecutorService) {
                        r4.recycle();
                        throw th;
                    }
                    executorService = (ExecutorService) r4;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th;
                    }
                    executorService.shutdown();
                    boolean z3 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j, TimeUnit.DAYS);
                        } catch (InterruptedException unused2) {
                            if (!z3) {
                                executorService.shutdownNow();
                                z3 = true;
                            }
                        }
                    }
                    if (!z3) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
                i2 = integer;
                m5226Ujhhgtgfeyxiexzf(xmlResourceParser);
                integer = i2;
                string3 = string3;
                string4 = string4;
                i = 2;
                i3 = 0;
                i4 = 3;
            }
        }
        int i10 = integer;
        String str = string3;
        String str2 = string4;
        if (!arrayList2.isEmpty()) {
            return new C3634feyxiexzfUjhhgtg(arrayList2, i10, integer2, string5);
        }
        if (str == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new C3624feyxiexzfUjhhgtg(string, string2, str, listM5225Ujhhgtgfeyxiexzf, null, null));
        if (str2 != null) {
            arrayList2.add(new C3624feyxiexzfUjhhgtg(string, string2, str2, listM5225Ujhhgtgfeyxiexzf, null, null));
        }
        return new C3634feyxiexzfUjhhgtg(arrayList2, i10, integer2, string5);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static List m5225Ujhhgtgfeyxiexzf(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static void m5226Ujhhgtgfeyxiexzf(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final EnumC2266Ujhhgtgfeyxiexzf m5227Ujhhgtgfeyxiexzf(AbstractC0728Ujhhgtgfeyxiexzf abstractC0728Ujhhgtgfeyxiexzf, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        AbstractC3611Ujhhgtgfeyxiexzf abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf();
        if (abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf instanceof AbstractC1437feyxiexzfUjhhgtg) {
            return EnumC2266Ujhhgtgfeyxiexzf.POLY_OBJ;
        }
        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1189feyxiexzfUjhhgtg.f4475Ujhhgtgfeyxiexzf)) {
            return EnumC2266Ujhhgtgfeyxiexzf.LIST;
        }
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1189feyxiexzfUjhhgtg.f4476Ujhhgtgfeyxiexzf)) {
            return EnumC2266Ujhhgtgfeyxiexzf.OBJ;
        }
        InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtgM5211Ujhhgtgfeyxiexzf = m5211Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(0), abstractC0728Ujhhgtgfeyxiexzf.f2998Ujhhgtgfeyxiexzf);
        AbstractC3611Ujhhgtgfeyxiexzf abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf2 = interfaceC1121feyxiexzfUjhhgtgM5211Ujhhgtgfeyxiexzf.mo1119Ujhhgtgfeyxiexzf();
        if ((abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf2 instanceof AbstractC0835feyxiexzfUjhhgtg) || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf2, C1098feyxiexzfUjhhgtg.f4180Ujhhgtgfeyxiexzf)) {
            return EnumC2266Ujhhgtgfeyxiexzf.MAP;
        }
        String str = "Value of type '" + interfaceC1121feyxiexzfUjhhgtgM5211Ujhhgtgfeyxiexzf.mo1117Ujhhgtgfeyxiexzf() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC1121feyxiexzfUjhhgtgM5211Ujhhgtgfeyxiexzf.mo1119Ujhhgtgfeyxiexzf() + '\'';
        interfaceC1121feyxiexzfUjhhgtgM5211Ujhhgtgfeyxiexzf.mo1117Ujhhgtgfeyxiexzf();
        throw new C0138Ujhhgtgfeyxiexzf(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final String m5228feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        return AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg(AbstractC1264feyxiexzfUjhhgtg.m2813feyxiexzfUjhhgtg(0, interfaceC1121feyxiexzfUjhhgtg.mo1120Ujhhgtgfeyxiexzf()), ", ", interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf() + '(', ")", new C2577Ujhhgtgfeyxiexzf(1, interfaceC1121feyxiexzfUjhhgtg), 24);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static byte[] m5229feyxiexzfUjhhgtg(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((C1918Ujhhgtgfeyxiexzf) it.next()).f6387Ujhhgtgfeyxiexzf;
            i++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static float m5230feyxiexzfUjhhgtg() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public int hashCode() {
        switch (this.f11233Ujhhgtgfeyxiexzf) {
            case 11:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f11233Ujhhgtgfeyxiexzf) {
            case 11:
                return AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(getClass()).m4165Ujhhgtgfeyxiexzf();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public abstract boolean mo4299Ujhhgtgfeyxiexzf(AbstractFutureC2945feyxiexzfUjhhgtg abstractFutureC2945feyxiexzfUjhhgtg, C2941feyxiexzfUjhhgtg c2941feyxiexzfUjhhgtg);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public abstract boolean mo4300Ujhhgtgfeyxiexzf(AbstractFutureC2945feyxiexzfUjhhgtg abstractFutureC2945feyxiexzfUjhhgtg, Object obj, Object obj2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public abstract boolean mo4301Ujhhgtgfeyxiexzf(AbstractFutureC2945feyxiexzfUjhhgtg abstractFutureC2945feyxiexzfUjhhgtg, C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg, C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ */
    public abstract void mo4302Ujhhgtgfeyxiexzf(C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg, C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ */
    public abstract void mo4303Ujhhgtgfeyxiexzf(C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg, Thread thread);
}
