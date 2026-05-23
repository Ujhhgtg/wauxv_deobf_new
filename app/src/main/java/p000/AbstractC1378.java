package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲀᲇᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1378 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1316 f4963 = new C1316(16);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final ThreadPoolExecutor f4964;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final Object f4965;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C2705 f4966;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0142(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4964 = threadPoolExecutor;
        f4965 = new Object();
        f4966 = new C2705(0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m3095(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C1372) list.get(i2)).f4944);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C1377 m3096(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceMo3201;
        C1316 c1316 = f4963;
        AbstractC0743.m2172("getFontSync");
        try {
            Typeface typeface = (Typeface) c1316.m3033(str);
            if (typeface != null) {
                C1377 c1377 = new C1377(typeface);
                Trace.endSection();
                return c1377;
            }
            try {
                C0408 c0408M3090 = AbstractC1371.m3090(context, list);
                List list2 = (List) c0408M3090.f1922;
                int i3 = c0408M3090.f1921;
                if (i3 == 0) {
                    C1383[] c1383Arr = (C1383[]) list2.get(0);
                    if (c1383Arr == null || c1383Arr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = c1383Arr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = c1383Arr[i4].f4983;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    C1377 c1378 = new C1377(i2);
                    Trace.endSection();
                    return c1378;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    C1383[] c1383Arr2 = (C1383[]) list2.get(0);
                    AbstractC1459 abstractC1459 = AbstractC3460.f10933;
                    AbstractC0743.m2172("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceMo3201 = AbstractC3460.f10933.mo3201(context, c1383Arr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    AbstractC1459 abstractC14510 = AbstractC3460.f10933;
                    AbstractC0743.m2172("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceMo3201 = AbstractC3460.f10933.mo3202(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceMo3201 == null) {
                    C1377 c1379 = new C1377(-3);
                    Trace.endSection();
                    return c1379;
                }
                c1316.m3040(str, typefaceMo3201);
                C1377 c13710 = new C1377(typefaceMo3201);
                Trace.endSection();
                return c13710;
            } catch (PackageManager.NameNotFoundException unused) {
                C1377 c13711 = new C1377(-1);
                Trace.endSection();
                return c13711;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
