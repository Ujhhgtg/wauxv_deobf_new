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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴ能不能ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3630feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C3434feyxiexzfUjhhgtg f11345Ujhhgtgfeyxiexzf = new C3434feyxiexzfUjhhgtg(16);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final ThreadPoolExecutor f11346Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final Object f11347Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C1044feyxiexzfUjhhgtg f11348Ujhhgtgfeyxiexzf;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC3013Ujhhgtgfeyxiexzf(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f11346Ujhhgtgfeyxiexzf = threadPoolExecutor;
        f11347Ujhhgtgfeyxiexzf = new Object();
        f11348Ujhhgtgfeyxiexzf = new C1044feyxiexzfUjhhgtg(0);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m5269Ujhhgtgfeyxiexzf(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C3624feyxiexzfUjhhgtg) list.get(i2)).f11326Ujhhgtgfeyxiexzf);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C3629Ujhhgtgfeyxiexzf m5270Ujhhgtgfeyxiexzf(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceMo3105Ujhhgtgfeyxiexzf;
        C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg = f11345Ujhhgtgfeyxiexzf;
        AbstractC1252feyxiexzfUjhhgtg.m2781Ujhhgtgfeyxiexzf("getFontSync");
        try {
            Typeface typeface = (Typeface) c3434feyxiexzfUjhhgtg.m4930Ujhhgtgfeyxiexzf(str);
            if (typeface != null) {
                C3629Ujhhgtgfeyxiexzf c3629Ujhhgtgfeyxiexzf = new C3629Ujhhgtgfeyxiexzf(typeface);
                Trace.endSection();
                return c3629Ujhhgtgfeyxiexzf;
            }
            try {
                C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtgM5264Ujhhgtgfeyxiexzf = AbstractC3623feyxiexzfUjhhgtg.m5264Ujhhgtgfeyxiexzf(context, list);
                List list2 = (List) c2501feyxiexzfUjhhgtgM5264Ujhhgtgfeyxiexzf.f8171Ujhhgtgfeyxiexzf;
                int i3 = c2501feyxiexzfUjhhgtgM5264Ujhhgtgfeyxiexzf.f8170Ujhhgtgfeyxiexzf;
                if (i3 == 0) {
                    C3635Ujhhgtgfeyxiexzf[] c3635UjhhgtgfeyxiexzfArr = (C3635Ujhhgtgfeyxiexzf[]) list2.get(0);
                    if (c3635UjhhgtgfeyxiexzfArr == null || c3635UjhhgtgfeyxiexzfArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = c3635UjhhgtgfeyxiexzfArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = c3635UjhhgtgfeyxiexzfArr[i4].f11365Ujhhgtgfeyxiexzf;
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
                    C3629Ujhhgtgfeyxiexzf c3629Ujhhgtgfeyxiexzf2 = new C3629Ujhhgtgfeyxiexzf(i2);
                    Trace.endSection();
                    return c3629Ujhhgtgfeyxiexzf2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    C3635Ujhhgtgfeyxiexzf[] c3635UjhhgtgfeyxiexzfArr2 = (C3635Ujhhgtgfeyxiexzf[]) list2.get(0);
                    AbstractC2855feyxiexzfUjhhgtg abstractC2855feyxiexzfUjhhgtg = AbstractC1771Ujhhgtgfeyxiexzf.f5944Ujhhgtgfeyxiexzf;
                    AbstractC1252feyxiexzfUjhhgtg.m2781Ujhhgtgfeyxiexzf("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceMo3105Ujhhgtgfeyxiexzf = AbstractC1771Ujhhgtgfeyxiexzf.f5944Ujhhgtgfeyxiexzf.mo3105Ujhhgtgfeyxiexzf(context, c3635UjhhgtgfeyxiexzfArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    AbstractC2855feyxiexzfUjhhgtg abstractC2855feyxiexzfUjhhgtg2 = AbstractC1771Ujhhgtgfeyxiexzf.f5944Ujhhgtgfeyxiexzf;
                    AbstractC1252feyxiexzfUjhhgtg.m2781Ujhhgtgfeyxiexzf("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceMo3105Ujhhgtgfeyxiexzf = AbstractC1771Ujhhgtgfeyxiexzf.f5944Ujhhgtgfeyxiexzf.mo3112Ujhhgtgfeyxiexzf(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceMo3105Ujhhgtgfeyxiexzf == null) {
                    C3629Ujhhgtgfeyxiexzf c3629Ujhhgtgfeyxiexzf3 = new C3629Ujhhgtgfeyxiexzf(-3);
                    Trace.endSection();
                    return c3629Ujhhgtgfeyxiexzf3;
                }
                c3434feyxiexzfUjhhgtg.m4937Ujhhgtgfeyxiexzf(str, typefaceMo3105Ujhhgtgfeyxiexzf);
                C3629Ujhhgtgfeyxiexzf c3629Ujhhgtgfeyxiexzf4 = new C3629Ujhhgtgfeyxiexzf(typefaceMo3105Ujhhgtgfeyxiexzf);
                Trace.endSection();
                return c3629Ujhhgtgfeyxiexzf4;
            } catch (PackageManager.NameNotFoundException unused) {
                C3629Ujhhgtgfeyxiexzf c3629Ujhhgtgfeyxiexzf5 = new C3629Ujhhgtgfeyxiexzf(-1);
                Trace.endSection();
                return c3629Ujhhgtgfeyxiexzf5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
