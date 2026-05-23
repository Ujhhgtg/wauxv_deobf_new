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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᛸᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3460 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final AbstractC1459 f10933;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C1316 f10934;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static Paint f10935;

    static {
        AbstractC0743.m2172("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f10933 = new C3464();
        } else if (i >= 29) {
            f10933 = new C3463();
        } else if (i >= 28) {
            f10933 = new C3462();
        } else {
            f10933 = new C3461();
        }
        f10934 = new C1316(16);
        f10935 = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Typeface m5045(Context context, InterfaceC1379 interfaceC1379, Resources resources, int i, String str, int i2, int i3, AbstractC3681 abstractC3681, boolean z) {
        Typeface typefaceMo3200;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 3;
        int i5 = -3;
        if (interfaceC1379 instanceof C1382) {
            C1382 c1382 = (C1382) interfaceC1379;
            String str2 = c1382.f4977;
            typefaceMo3200 = null;
            int i6 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = m5047(str2)) == null) {
                ArrayList arrayList = c1382.f4974;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i7 = 0;
                        while (true) {
                            if (0 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilderM1001 = null;
                                int i8 = 0;
                                while (true) {
                                    if (0 < arrayList.size()) {
                                        C1372 c1372 = (C1372) arrayList.get(i8);
                                        if (i8 == arrayList.size() - 1 && TextUtils.isEmpty(c1372.f4943)) {
                                            customFallbackBuilderM1001.setSystemFallback(c1372.f4942);
                                        } else {
                                            String str3 = c1372.f4942;
                                            String str4 = c1372.f4943;
                                            Font fontM5048 = m5048(m5047(str3));
                                            if (fontM5048 == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + c1372.f4942 + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = AbstractC0081.m1006(fontM5048).build();
                                                } else {
                                                    try {
                                                        AbstractC0081.m1011();
                                                        AbstractC0081.m1024();
                                                        fontFamilyBuild = AbstractC0081.m1006(AbstractC0451.m1654(fontM5048).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilderM1001 == null) {
                                                    customFallbackBuilderM1001 = AbstractC0081.m1001(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderM1001.addCustomFallback(fontFamilyBuild);
                                                }
                                                i8++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderM1001.build();
                                    break;
                                }
                            }
                            if (m5047(((C1372) arrayList.get(0)).f4942) != null) {
                                0++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = m5047(((C1372) arrayList.get(0)).f4942);
            }
            if (typefaceBuild != null) {
                if (abstractC3681 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1324(abstractC3681, 3, typefaceBuild));
                }
                f10934.m3040(m5046(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr3 = !z ? abstractC3681 != null : c1382.f4976 != 0;
            int i9 = z ? c1382.f4975 : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C1744 c1744 = new C1744();
            c1744.f5843 = abstractC3681;
            ArrayList arrayList2 = c1382.f4974;
            ExecutorC2560 executorC2560 = new ExecutorC2560(handler);
            C0542 c0542 = new C0542(c1744, 6, executorC2560);
            if (false) {
                String strM3095 = AbstractC1378.m3095(i3, arrayList2);
                Typeface typeface = (Typeface) AbstractC1378.f4963.m3033(strM3095);
                if (typeface != null) {
                    executorC2560.execute(new RunnableC0132(c1744, typeface, i6, objArr2 == true ? 1 : 0));
                    typefaceMo3200 = typeface;
                } else {
                    C1376 c1376 = new C1376(objArr == true ? 1 : 0, c0542);
                    synchronized (AbstractC1378.f4965) {
                        try {
                            C2705 c2705 = AbstractC1378.f4966;
                            ArrayList arrayList3 = (ArrayList) c2705.get(strM3095);
                            if (arrayList3 != null) {
                                arrayList3.add(c1376);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(c1376);
                                c2705.put(strM3095, arrayList4);
                                CallableC1375 callableC1375 = new CallableC1375(strM3095, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC1378.f4964;
                                C1376 c1377 = new C1376(i6, strM3095);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC2561 runnableC2561 = new RunnableC2561();
                                runnableC2561.f8127 = callableC1375;
                                runnableC2561.f8128 = c1377;
                                runnableC2561.f8129 = handler2;
                                threadPoolExecutor.execute(runnableC2561);
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
                C1372 c1373 = (C1372) arrayList2.get(0);
                C1316 c1316 = AbstractC1378.f4963;
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(new Object[]{c1373}[0]);
                String strM3096 = AbstractC1378.m3095(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) AbstractC1378.f4963.m3033(strM3096);
                if (typeface2 != null) {
                    executorC2560.execute(new RunnableC0132(c1744, typeface2, 1, false));
                    typefaceMo3200 = typeface2;
                } else if (i9 == -1) {
                    Object[] objArr4 = {c1373};
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(objArr4[0]);
                    C1377 c1377M3096 = AbstractC1378.m3096(strM3096, context, Collections.unmodifiableList(arrayList6), i3);
                    c0542.m1900(c1377M3096);
                    typefaceMo3200 = c1377M3096.f4961;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    C1377 c1378 = (C1377) AbstractC1378.f4964.submit(new CallableC1375(strM3096, context, c1373, i3, 0)).get(i9, TimeUnit.MILLISECONDS);
                                    c0542.m1900(c1378);
                                    typefaceMo3200 = c1378.f4961;
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
                        ((ExecutorC2560) c0542.f2253).execute(new RunnableC0386(-3, 1, (C1744) c0542.f2252));
                    }
                }
            }
        } else {
            typefaceMo3200 = f10933.mo3200(context, (C1380) interfaceC1379, resources, i3);
            if (abstractC3681 != null) {
                if (typefaceMo3200 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1324(abstractC3681, 3, typefaceMo3200));
                } else {
                    abstractC3681.m5342(-3);
                }
            }
        }
        if (typefaceMo3200 != null) {
            f10934.m3040(m5046(resources, i, str, i2, i3), typefaceMo3200);
        }
        return typefaceMo3200;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static String m5046(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static Typeface m5047(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static Font m5048(Typeface typeface) {
        if (f10935 == null) {
            f10935 = new Paint();
        }
        f10935.setTextSize(10.0f);
        f10935.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f10935);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
