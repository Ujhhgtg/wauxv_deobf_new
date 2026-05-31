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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᛸᲀᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3516 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final AbstractC1586 f11089;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C1317 f11090;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static Paint f11091;

    static {
        AbstractC1468.m3299("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f11089 = new C3520();
        } else if (i >= 29) {
            f11089 = new C3519();
        } else if (i >= 28) {
            f11089 = new C3518();
        } else {
            f11089 = new C3517();
        }
        f11090 = new C1317(16);
        f11091 = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Typeface m5070(Context context, InterfaceC1387 interfaceC1387, Resources resources, int i, String str, int i2, int i3, AbstractC1469 abstractC1469, boolean z) {
        Typeface typefaceMo3491;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 3;
        int i5 = -3;
        if (interfaceC1387 instanceof C1390) {
            C1390 c1390 = (C1390) interfaceC1387;
            String str2 = c1390.f5006;
            typefaceMo3491 = null;
            int i6 = 1;
            boolean z2 = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = m5072(str2)) == null) {
                ArrayList arrayList = c1390.f5003;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilderM1146 = null;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < arrayList.size()) {
                                        C1380 c1380 = (C1380) arrayList.get(i8);
                                        if (i8 == arrayList.size() - 1 && TextUtils.isEmpty(c1380.f4972)) {
                                            customFallbackBuilderM1146.setSystemFallback(c1380.f4971);
                                        } else {
                                            String str3 = c1380.f4971;
                                            String str4 = c1380.f4972;
                                            Font fontM5073 = m5073(m5072(str3));
                                            if (fontM5073 == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + c1380.f4971 + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = AbstractC0089.m1151(fontM5073).build();
                                                } else {
                                                    try {
                                                        AbstractC0089.m1156();
                                                        AbstractC0089.m1169();
                                                        fontFamilyBuild = AbstractC0089.m1151(AbstractC0426.m1760(fontM5073).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilderM1146 == null) {
                                                    customFallbackBuilderM1146 = AbstractC0089.m1146(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderM1146.addCustomFallback(fontFamilyBuild);
                                                }
                                                i8++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderM1146.build();
                                    break;
                                }
                            }
                            if (m5072(((C1380) arrayList.get(i7)).f4971) != null) {
                                i7++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = m5072(((C1380) arrayList.get(0)).f4971);
            }
            if (typefaceBuild != null) {
                if (abstractC1469 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1326(abstractC1469, i4, typefaceBuild));
                }
                f11090.m3143(m5071(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr3 = !z ? abstractC1469 != null : c1390.f5005 != 0;
            int i9 = z ? c1390.f5004 : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C1681 c1681 = new C1681();
            c1681.f5660 = abstractC1469;
            ArrayList arrayList2 = c1390.f5003;
            ExecutorC2616 executorC2616 = new ExecutorC2616(handler);
            C0519 c0519 = new C0519(c1681, 6, executorC2616);
            if (objArr3 != true) {
                String strM3203 = AbstractC1386.m3203(i3, arrayList2);
                Typeface typeface = (Typeface) AbstractC1386.f4992.m3136(strM3203);
                if (typeface != null) {
                    executorC2616.execute(new RunnableC0140(c1681, typeface, i6, objArr2 == true ? 1 : 0));
                    typefaceMo3491 = typeface;
                } else {
                    C1384 c1384 = new C1384(c0519, objArr == true ? 1 : 0);
                    synchronized (AbstractC1386.f4994) {
                        try {
                            C2767 c2767 = AbstractC1386.f4995;
                            ArrayList arrayList3 = (ArrayList) c2767.get(strM3203);
                            if (arrayList3 != null) {
                                arrayList3.add(c1384);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(c1384);
                                c2767.put(strM3203, arrayList4);
                                CallableC1383 callableC1383 = new CallableC1383(strM3203, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC1386.f4993;
                                C1384 c1385 = new C1384(strM3203, i6);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC2617 runnableC2617 = new RunnableC2617();
                                runnableC2617.f8280 = callableC1383;
                                runnableC2617.f8281 = c1385;
                                runnableC2617.f8282 = handler2;
                                threadPoolExecutor.execute(runnableC2617);
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
                C1380 c1381 = (C1380) arrayList2.get(0);
                C1317 c1317 = AbstractC1386.f4992;
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(new Object[]{c1381}[0]);
                String strM3204 = AbstractC1386.m3203(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) AbstractC1386.f4992.m3136(strM3204);
                if (typeface2 != null) {
                    executorC2616.execute(new RunnableC0140(c1681, typeface2, i6, z2));
                    typefaceMo3491 = typeface2;
                } else if (i9 == -1) {
                    Object[] objArr4 = {c1381};
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(objArr4[0]);
                    C1385 c1385M3204 = AbstractC1386.m3204(strM3204, context, Collections.unmodifiableList(arrayList6), i3);
                    c0519.m1994(c1385M3204);
                    typefaceMo3491 = c1385M3204.f4990;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    C1385 c1386 = (C1385) AbstractC1386.f4993.submit(new CallableC1383(strM3204, context, c1381, i3, 0)).get(i9, TimeUnit.MILLISECONDS);
                                    c0519.m1994(c1386);
                                    typefaceMo3491 = c1386.f4990;
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
                        ((ExecutorC2616) c0519.f2209).execute(new RunnableC0361(i5, i6, (C1681) c0519.f2208));
                    }
                }
            }
        } else {
            typefaceMo3491 = f11089.mo3491(context, (C1388) interfaceC1387, resources, i3);
            if (abstractC1469 != null) {
                if (typefaceMo3491 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1326(abstractC1469, i4, typefaceMo3491));
                } else {
                    abstractC1469.m3357(-3);
                }
            }
        }
        if (typefaceMo3491 != null) {
            f11090.m3143(m5071(resources, i, str, i2, i3), typefaceMo3491);
        }
        return typefaceMo3491;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static String m5071(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static Typeface m5072(String str) {
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
    public static Font m5073(Typeface typeface) {
        if (f11091 == null) {
            f11091 = new Paint();
        }
        f11091.setTextSize(10.0f);
        f11091.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f11091);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
