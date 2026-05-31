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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲁᤞᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1386 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1317 f4992 = new C1317(16);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final ThreadPoolExecutor f4993;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final Object f4994;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C2767 f4995;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0150(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4993 = threadPoolExecutor;
        f4994 = new Object();
        f4995 = new C2767(0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m3203(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C1380) list.get(i2)).f4973);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C1385 m3204(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceMo3492;
        C1317 c1317 = f4992;
        AbstractC1468.m3299("getFontSync");
        try {
            Typeface typeface = (Typeface) c1317.m3136(str);
            if (typeface != null) {
                C1385 c1385 = new C1385(typeface);
                Trace.endSection();
                return c1385;
            }
            try {
                C0383 c0383M3198 = AbstractC1379.m3198(context, list);
                List list2 = (List) c0383M3198.f1894;
                int i3 = c0383M3198.f1893;
                if (i3 == 0) {
                    C1391[] c1391Arr = (C1391[]) list2.get(0);
                    if (c1391Arr == null || c1391Arr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = c1391Arr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = c1391Arr[i4].f5012;
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
                    C1385 c1386 = new C1385(i2);
                    Trace.endSection();
                    return c1386;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    C1391[] c1391Arr2 = (C1391[]) list2.get(0);
                    AbstractC1586 abstractC1586 = AbstractC3516.f11089;
                    AbstractC1468.m3299("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceMo3492 = AbstractC3516.f11089.mo3492(context, c1391Arr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    AbstractC1586 abstractC1587 = AbstractC3516.f11089;
                    AbstractC1468.m3299("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceMo3492 = AbstractC3516.f11089.mo3493(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceMo3492 == null) {
                    C1385 c1387 = new C1385(-3);
                    Trace.endSection();
                    return c1387;
                }
                c1317.m3143(str, typefaceMo3492);
                C1385 c1388 = new C1385(typefaceMo3492);
                Trace.endSection();
                return c1388;
            } catch (PackageManager.NameNotFoundException unused) {
                C1385 c1389 = new C1385(-1);
                Trace.endSection();
                return c1389;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
