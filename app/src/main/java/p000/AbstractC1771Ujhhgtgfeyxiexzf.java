package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1771Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final AbstractC2855feyxiexzfUjhhgtg f5944Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C3434feyxiexzfUjhhgtg f5945Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static Paint f5946Ujhhgtgfeyxiexzf;

    static {
        AbstractC1252feyxiexzfUjhhgtg.m2781Ujhhgtgfeyxiexzf("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f5944Ujhhgtgfeyxiexzf = new C1780feyxiexzfUjhhgtg();
        } else if (i >= 29) {
            f5944Ujhhgtgfeyxiexzf = new C1781feyxiexzfUjhhgtg();
        } else if (i >= 28) {
            f5944Ujhhgtgfeyxiexzf = new C1778feyxiexzfUjhhgtg();
        } else {
            f5944Ujhhgtgfeyxiexzf = new C1779feyxiexzfUjhhgtg();
        }
        f5945Ujhhgtgfeyxiexzf = new C3434feyxiexzfUjhhgtg(16);
        f5946Ujhhgtgfeyxiexzf = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static Typeface m3093Ujhhgtgfeyxiexzf(Context context, InterfaceC3631Ujhhgtgfeyxiexzf interfaceC3631Ujhhgtgfeyxiexzf, Resources resources, int i, String str, int i2, int i3, AbstractC1791feyxiexzfUjhhgtg abstractC1791feyxiexzfUjhhgtg, boolean z) {
        Typeface typefaceMo3104Ujhhgtgfeyxiexzf;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 3;
        int i5 = -3;
        if (interfaceC3631Ujhhgtgfeyxiexzf instanceof C3634feyxiexzfUjhhgtg) {
            C3634feyxiexzfUjhhgtg c3634feyxiexzfUjhhgtg = (C3634feyxiexzfUjhhgtg) interfaceC3631Ujhhgtgfeyxiexzf;
            String str2 = c3634feyxiexzfUjhhgtg.f11359Ujhhgtgfeyxiexzf;
            typefaceMo3104Ujhhgtgfeyxiexzf = null;
            int i6 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = m3095Ujhhgtgfeyxiexzf(str2)) == null) {
                ArrayList arrayList = c3634feyxiexzfUjhhgtg.f11356Ujhhgtgfeyxiexzf;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilderM4341Ujhhgtgfeyxiexzf = null;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < arrayList.size()) {
                                        C3624feyxiexzfUjhhgtg c3624feyxiexzfUjhhgtg = (C3624feyxiexzfUjhhgtg) arrayList.get(i8);
                                        if (i8 == arrayList.size() - 1 && TextUtils.isEmpty(c3624feyxiexzfUjhhgtg.f11325Ujhhgtgfeyxiexzf)) {
                                            customFallbackBuilderM4341Ujhhgtgfeyxiexzf.setSystemFallback(c3624feyxiexzfUjhhgtg.f11324Ujhhgtgfeyxiexzf);
                                        } else {
                                            String str3 = c3624feyxiexzfUjhhgtg.f11324Ujhhgtgfeyxiexzf;
                                            String str4 = c3624feyxiexzfUjhhgtg.f11325Ujhhgtgfeyxiexzf;
                                            Font fontM3096Ujhhgtgfeyxiexzf = m3096Ujhhgtgfeyxiexzf(m3095Ujhhgtgfeyxiexzf(str3));
                                            if (fontM3096Ujhhgtgfeyxiexzf == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + c3624feyxiexzfUjhhgtg.f11324Ujhhgtgfeyxiexzf + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = AbstractC2952feyxiexzfUjhhgtg.m4346Ujhhgtgfeyxiexzf(fontM3096Ujhhgtgfeyxiexzf).build();
                                                } else {
                                                    try {
                                                        AbstractC2952feyxiexzfUjhhgtg.m4351Ujhhgtgfeyxiexzf();
                                                        AbstractC2952feyxiexzfUjhhgtg.m4364feyxiexzfUjhhgtg();
                                                        fontFamilyBuild = AbstractC2952feyxiexzfUjhhgtg.m4346Ujhhgtgfeyxiexzf(AbstractC2666Ujhhgtgfeyxiexzf.m3993Ujhhgtgfeyxiexzf(fontM3096Ujhhgtgfeyxiexzf).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilderM4341Ujhhgtgfeyxiexzf == null) {
                                                    customFallbackBuilderM4341Ujhhgtgfeyxiexzf = AbstractC2952feyxiexzfUjhhgtg.m4341Ujhhgtgfeyxiexzf(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderM4341Ujhhgtgfeyxiexzf.addCustomFallback(fontFamilyBuild);
                                                }
                                                i8++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderM4341Ujhhgtgfeyxiexzf.build();
                                    break;
                                }
                            }
                            if (m3095Ujhhgtgfeyxiexzf(((C3624feyxiexzfUjhhgtg) arrayList.get(i7)).f11324Ujhhgtgfeyxiexzf) != null) {
                                i7++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = m3095Ujhhgtgfeyxiexzf(((C3624feyxiexzfUjhhgtg) arrayList.get(0)).f11324Ujhhgtgfeyxiexzf);
            }
            if (typefaceBuild != null) {
                if (abstractC1791feyxiexzfUjhhgtg != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC3468feyxiexzfUjhhgtg(abstractC1791feyxiexzfUjhhgtg, i4, typefaceBuild));
                }
                f5945Ujhhgtgfeyxiexzf.m4937Ujhhgtgfeyxiexzf(m3094Ujhhgtgfeyxiexzf(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr3 = !z ? abstractC1791feyxiexzfUjhhgtg != null : c3634feyxiexzfUjhhgtg.f11358Ujhhgtgfeyxiexzf != 0;
            int i9 = z ? c3634feyxiexzfUjhhgtg.f11357Ujhhgtgfeyxiexzf : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = new C0709Ujhhgtgfeyxiexzf();
            c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf = abstractC1791feyxiexzfUjhhgtg;
            ArrayList arrayList2 = c3634feyxiexzfUjhhgtg.f11356Ujhhgtgfeyxiexzf;
            ExecutorC0898feyxiexzfUjhhgtg executorC0898feyxiexzfUjhhgtg = new ExecutorC0898feyxiexzfUjhhgtg(handler);
            C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(c0709Ujhhgtgfeyxiexzf, 6, executorC0898feyxiexzfUjhhgtg);
            if (objArr3 != true) {
                String strM5269Ujhhgtgfeyxiexzf = AbstractC3630feyxiexzfUjhhgtg.m5269Ujhhgtgfeyxiexzf(i3, arrayList2);
                Typeface typeface = (Typeface) AbstractC3630feyxiexzfUjhhgtg.f11345Ujhhgtgfeyxiexzf.m4930Ujhhgtgfeyxiexzf(strM5269Ujhhgtgfeyxiexzf);
                if (typeface != null) {
                    executorC0898feyxiexzfUjhhgtg.execute(new RunnableC3003feyxiexzfUjhhgtg(c0709Ujhhgtgfeyxiexzf, typeface, i6, objArr2 == true ? 1 : 0));
                    typefaceMo3104Ujhhgtgfeyxiexzf = typeface;
                } else {
                    C3628feyxiexzfUjhhgtg c3628feyxiexzfUjhhgtg = new C3628feyxiexzfUjhhgtg(objArr == true ? 1 : 0, c2629Ujhhgtgfeyxiexzf);
                    synchronized (AbstractC3630feyxiexzfUjhhgtg.f11347Ujhhgtgfeyxiexzf) {
                        try {
                            C1044feyxiexzfUjhhgtg c1044feyxiexzfUjhhgtg = AbstractC3630feyxiexzfUjhhgtg.f11348Ujhhgtgfeyxiexzf;
                            ArrayList arrayList3 = (ArrayList) c1044feyxiexzfUjhhgtg.get(strM5269Ujhhgtgfeyxiexzf);
                            if (arrayList3 != null) {
                                arrayList3.add(c3628feyxiexzfUjhhgtg);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(c3628feyxiexzfUjhhgtg);
                                c1044feyxiexzfUjhhgtg.put(strM5269Ujhhgtgfeyxiexzf, arrayList4);
                                CallableC3627feyxiexzfUjhhgtg callableC3627feyxiexzfUjhhgtg = new CallableC3627feyxiexzfUjhhgtg(strM5269Ujhhgtgfeyxiexzf, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC3630feyxiexzfUjhhgtg.f11346Ujhhgtgfeyxiexzf;
                                C3628feyxiexzfUjhhgtg c3628feyxiexzfUjhhgtg2 = new C3628feyxiexzfUjhhgtg(i6, strM5269Ujhhgtgfeyxiexzf);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC0899feyxiexzfUjhhgtg runnableC0899feyxiexzfUjhhgtg = new RunnableC0899feyxiexzfUjhhgtg();
                                runnableC0899feyxiexzfUjhhgtg.f3457Ujhhgtgfeyxiexzf = callableC3627feyxiexzfUjhhgtg;
                                runnableC0899feyxiexzfUjhhgtg.f3458Ujhhgtgfeyxiexzf = c3628feyxiexzfUjhhgtg2;
                                runnableC0899feyxiexzfUjhhgtg.f3459Ujhhgtgfeyxiexzf = handler2;
                                threadPoolExecutor.execute(runnableC0899feyxiexzfUjhhgtg);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                C3624feyxiexzfUjhhgtg c3624feyxiexzfUjhhgtg2 = (C3624feyxiexzfUjhhgtg) arrayList2.get(0);
                C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg = AbstractC3630feyxiexzfUjhhgtg.f11345Ujhhgtgfeyxiexzf;
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(new Object[]{c3624feyxiexzfUjhhgtg2}[0]);
                String strM5269Ujhhgtgfeyxiexzf2 = AbstractC3630feyxiexzfUjhhgtg.m5269Ujhhgtgfeyxiexzf(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) AbstractC3630feyxiexzfUjhhgtg.f11345Ujhhgtgfeyxiexzf.m4930Ujhhgtgfeyxiexzf(strM5269Ujhhgtgfeyxiexzf2);
                if (typeface2 != null) {
                    executorC0898feyxiexzfUjhhgtg.execute(new RunnableC3003feyxiexzfUjhhgtg(c0709Ujhhgtgfeyxiexzf, typeface2, i6, z2));
                    typefaceMo3104Ujhhgtgfeyxiexzf = typeface2;
                } else if (i9 == -1) {
                    Object[] objArr4 = {c3624feyxiexzfUjhhgtg2};
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(objArr4[0]);
                    C3629Ujhhgtgfeyxiexzf c3629UjhhgtgfeyxiexzfM5270Ujhhgtgfeyxiexzf = AbstractC3630feyxiexzfUjhhgtg.m5270Ujhhgtgfeyxiexzf(strM5269Ujhhgtgfeyxiexzf2, context, Collections.unmodifiableList(arrayList6), i3);
                    c2629Ujhhgtgfeyxiexzf.m3950feyxiexzfUjhhgtg(c3629UjhhgtgfeyxiexzfM5270Ujhhgtgfeyxiexzf);
                    typefaceMo3104Ujhhgtgfeyxiexzf = c3629UjhhgtgfeyxiexzfM5270Ujhhgtgfeyxiexzf.f11343Ujhhgtgfeyxiexzf;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    C3629Ujhhgtgfeyxiexzf c3629Ujhhgtgfeyxiexzf = (C3629Ujhhgtgfeyxiexzf) AbstractC3630feyxiexzfUjhhgtg.f11346Ujhhgtgfeyxiexzf.submit(new CallableC3627feyxiexzfUjhhgtg(strM5269Ujhhgtgfeyxiexzf2, context, c3624feyxiexzfUjhhgtg2, i3, 0)).get(i9, TimeUnit.MILLISECONDS);
                                    c2629Ujhhgtgfeyxiexzf.m3950feyxiexzfUjhhgtg(c3629Ujhhgtgfeyxiexzf);
                                    typefaceMo3104Ujhhgtgfeyxiexzf = c3629Ujhhgtgfeyxiexzf.f11343Ujhhgtgfeyxiexzf;
                                } catch (TimeoutException unused2) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused3) {
                        ((ExecutorC0898feyxiexzfUjhhgtg) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf).execute(new RunnableC2474feyxiexzfUjhhgtg(i5, i6, (C0709Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf));
                    }
                }
            }
        } else {
            typefaceMo3104Ujhhgtgfeyxiexzf = f5944Ujhhgtgfeyxiexzf.mo3104Ujhhgtgfeyxiexzf(context, (C3632Ujhhgtgfeyxiexzf) interfaceC3631Ujhhgtgfeyxiexzf, resources, i3);
            if (abstractC1791feyxiexzfUjhhgtg != null) {
                if (typefaceMo3104Ujhhgtgfeyxiexzf != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC3468feyxiexzfUjhhgtg(abstractC1791feyxiexzfUjhhgtg, i4, typefaceMo3104Ujhhgtgfeyxiexzf));
                } else {
                    abstractC1791feyxiexzfUjhhgtg.m3161Ujhhgtgfeyxiexzf(-3);
                }
            }
        }
        if (typefaceMo3104Ujhhgtgfeyxiexzf != null) {
            f5945Ujhhgtgfeyxiexzf.m4937Ujhhgtgfeyxiexzf(m3094Ujhhgtgfeyxiexzf(resources, i, str, i2, i3), typefaceMo3104Ujhhgtgfeyxiexzf);
        }
        return typefaceMo3104Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static String m3094Ujhhgtgfeyxiexzf(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static Typeface m3095Ujhhgtgfeyxiexzf(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static Font m3096Ujhhgtgfeyxiexzf(Typeface typeface) {
        if (f5946Ujhhgtgfeyxiexzf == null) {
            f5946Ujhhgtgfeyxiexzf = new Paint();
        }
        f5946Ujhhgtgfeyxiexzf.setTextSize(10.0f);
        f5946Ujhhgtgfeyxiexzf.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f5946Ujhhgtgfeyxiexzf);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
