package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C0020;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᲈᤞᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3453 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final ExecutorC1244 f10924 = new ExecutorC1244(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final ExecutorC1244 f10925 = new ExecutorC1244(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final Object f10926 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static volatile boolean f10927 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static List m4983(Object obj) {
        if ((obj instanceof InterfaceC1737) && !(obj instanceof InterfaceC1738)) {
            m5010(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            AbstractC2207.m4114(e, AbstractC3453.class.getName());
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static boolean m4984(int i, Rect rect, Rect rect2, Rect rect3) {
        int iM5003;
        int i2;
        int i3;
        boolean zM4985 = m4985(i, rect, rect2);
        if (m4985(i, rect, rect3) || !zM4985) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (true) {
                            iM5003 = m5003(130, rect, rect2);
                            if (true) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i != 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i != 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iM5003 < Math.max(1, i2 - i3)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (true) {
                        iM5003 = m5003(66, rect, rect2);
                        if (true) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else {
                            if (i == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        }
                        if (iM5003 < Math.max(1, i2 - i3)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (true) {
                    iM5003 = m5003(33, rect, rect2);
                    if (true) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iM5003 < Math.max(1, i2 - i3)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (false) {
                iM5003 = m5003(i, rect, rect2);
                if (i != 17) {
                    i2 = rect.left;
                    i3 = rect3.left;
                } else if (i != 33) {
                    i2 = rect.top;
                    i3 = rect3.top;
                } else if (i != 66) {
                    i2 = rect3.right;
                    i3 = rect.right;
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = rect3.bottom;
                    i3 = rect.bottom;
                }
                if (iM5003 < Math.max(1, i2 - i3)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean m4985(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m4986(int i, Object obj) {
        int arity;
        if (obj != null) {
            if (obj instanceof InterfaceC1436) {
                if (obj instanceof InterfaceC1437) {
                    arity = ((InterfaceC1437) obj).getArity();
                } else if (obj instanceof InterfaceC1414) {
                    arity = 0;
                } else if (obj instanceof InterfaceC1425) {
                    arity = 1;
                } else if (obj instanceof InterfaceC1429) {
                    arity = 2;
                } else if (obj instanceof InterfaceC1430) {
                    arity = 3;
                } else {
                    arity = obj instanceof C2165 ? 4 : -1;
                }
                if (arity == i) {
                    return;
                }
            }
            m5010(obj, "kotlin.jvm.functions.Function" + i);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m4987(long j, C0504 c0504, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((C0539) arrayList4.get(i8)).mo1870() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0539 c0539 = (C0539) arrayList.get(i2);
        C0539 c05310 = (C0539) arrayList4.get(i3 - 1);
        if (i7 == c0539.mo1870()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            C0539 c05311 = (C0539) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            c0539 = c05311;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c0539.mo1873(i7) == c05310.mo1873(i7)) {
            int iMin = Math.min(c0539.mo1870(), c05310.mo1870());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && c0539.mo1873(i11) == c05310.mo1873(i11); i11++) {
                i10++;
            }
            long j3 = 4;
            long j4 = (c0504.f2172 / 4L) + j + ((long) 2) + ((long) i10) + 1;
            c0504.m1799(-i10);
            c0504.m1799(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                c0504.m1799(c0539.mo1873(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 != ((C0539) arrayList4.get(i4)).mo1870()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0504.m1799(((Number) arrayList5.get(i4)).intValue());
                return;
            } else {
                C0504 c0505 = new C0504();
                c0504.m1799(((int) ((c0505.f2172 / 4L) + j4)) * (-1));
                m4987(j4, c0505, i12, arrayList4, i4, i3, arrayList5);
                c0504.mo1769(c0505);
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((C0539) arrayList4.get(i14 - 1)).mo1873(i7) != ((C0539) arrayList4.get(i14)).mo1873(i7)) {
                i13++;
            }
        }
        long j5 = 4;
        long j6 = (c0504.f2172 / 4L) + j + ((long) 2) + ((long) (i13 * 2));
        c0504.m1799(i13);
        c0504.m1799(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iMo1873 = ((C0539) arrayList4.get(i15)).mo1873(i7);
            if (i15 == i4 || iMo1873 != ((C0539) arrayList4.get(i15 - 1)).mo1873(i7)) {
                c0504.m1799(iMo1873 & 255);
            }
        }
        C0504 c0506 = new C0504();
        int i16 = i4;
        while (i16 < i3) {
            byte bMo1873 = ((C0539) arrayList4.get(i16)).mo1873(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bMo1873 != ((C0539) arrayList4.get(i18)).mo1873(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((C0539) arrayList4.get(i16)).mo1870()) {
                c0504.m1799(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
            } else {
                c0504.m1799(((int) ((c0506.f2172 / 4L) + j6)) * (-1));
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
                m4987(j2, c0506, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j6 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        c0504.mo1769(c0506);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static C1982 m4988(String str) {
        C1982 c1982 = null;
        String str2 = "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_me_hd_wauxv" instanceof C2585 ? null : "com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_me_hd_wauxv";
        if (false) {
            str2 = "";
        }
        Class clsM2133 = AbstractC0710.m2133("com.highcapable.yukihookapi.hook.xposed.bridge.status.YukiXposedModuleStatus_Impl_Impl_me_hd_wauxv", null, 3);
        if (clsM2133 != null) {
            int i = 0;
            C1744 c1744M2483 = AbstractC0968.startMethodResolution(clsM2133);
            c1744M2483.m3493(true);
            MethodResolver c1973M3492 = c1744M2483.m3492();
            c1973M3492.f6370 = str;
            c1982 = (C1982) AbstractC0744.m2192(c1973M3492.m3799());
        }
        if (c1982 == null) {
            C3678.m5309("Failed to initialize YukiXposedModuleStatus");
        }
        return c1982;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static AbstractC3458 m4989(AbstractC3458 abstractC3458, C3448 c3448) {
        if (abstractC3458.getType().equals(c3448)) {
            return abstractC3458;
        }
        int i = c3448.f10905;
        if (i == 1) {
            return C0892.m2411(((C0903) abstractC3458).f3364);
        }
        if (i == 2) {
            int i2 = ((C0903) abstractC3458).f3364;
            byte b = (byte) i2;
            if (b == i2) {
                return new C0893(b);
            }
            throw new IllegalArgumentException(AbstractC1194.m2779(i2, "bogus byte value: "));
        }
        if (i == 3) {
            int i3 = ((C0903) abstractC3458).f3364;
            char c = (char) i3;
            if (c == i3) {
                return new C0896(c);
            }
            throw new IllegalArgumentException(AbstractC1194.m2779(i3, "bogus char value: "));
        }
        if (i == 8) {
            int i4 = ((C0903) abstractC3458).f3364;
            short s = (short) i4;
            if (s == i4) {
                return new C0916(s);
            }
            throw new IllegalArgumentException(AbstractC1194.m2779(i4, "bogus short value: "));
        }
        throw new UnsupportedOperationException("can't coerce " + abstractC3458 + " to " + c3448);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static C2529 m4990(ComponentCallbacks2C0020 componentCallbacks2C0020, ArrayList arrayList) {
        InterfaceC2571 c0419;
        InterfaceC2571 c0528;
        Class cls;
        InterfaceC0424 interfaceC0424 = componentCallbacks2C0020.f537;
        C1867 c1867 = componentCallbacks2C0020.f540;
        C1461 c1461 = componentCallbacks2C0020.f539;
        Context applicationContext = c1461.getApplicationContext();
        C1466 c1466 = c1461.f5212;
        C2529 c2529 = new C2529();
        C0989 c0989 = new C0989();
        C1209 c1209 = c2529.f8067;
        synchronized (c1209) {
            c1209.f4348.add(c0989);
        }
        int i = Build.VERSION.SDK_INT;
        C1252 c1252 = new C1252();
        C1209 c12010 = c2529.f8067;
        synchronized (c12010) {
            c12010.f4348.add(c1252);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListM4558 = c2529.m4558();
        C0531 c0531 = new C0531(applicationContext, arrayListM4558, interfaceC0424, c1867);
        C3553 c3553 = new C3553(interfaceC0424, new C3552());
        C1098 c1098 = new C1098(c2529.m4558(), resources.getDisplayMetrics(), interfaceC0424, c1867);
        if (i < 28 || !c1466.f5231.containsKey(AbstractC1458.class)) {
            C0527 c0527 = new C0527(c1098, 0);
            c0419 = new C0419(c1098, 2, c1867);
            c0528 = c0527;
        } else {
            C0528 c0529 = new C0528(1);
            c0528 = new C0528(0);
            c0419 = c0529;
        }
        if (i >= 28) {
            int i2 = 1;
            c2529.m4557("Animation", InputStream.class, Drawable.class, new C0159(new C0542(arrayListM4558, 1, c1867), 1));
            c2529.m4557("Animation", ByteBuffer.class, Drawable.class, new C0159(new C0542(arrayListM4558, 1, c1867), 0));
        }
        C2573 c2573 = new C2573(applicationContext);
        C0421 c0421 = new C0421(c1867);
        C0408 c0408 = new C0408((byte) 0, 1);
        C1227 c1227 = new C1227(12);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        c2529.m4554(ByteBuffer.class, new C0373(10));
        c2529.m4554(InputStream.class, new C1744(c1867));
        c2529.m4557("Bitmap", ByteBuffer.class, Bitmap.class, c0528);
        c2529.m4557("Bitmap", InputStream.class, Bitmap.class, c0419);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls = ParcelFileDescriptor.class;
        } else {
            cls = ParcelFileDescriptor.class;
            c2529.m4557("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C0527(c1098, 1));
        }
        c2529.m4557("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C3553(interfaceC0424, new C2102(27)));
        c2529.m4557("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c3553);
        C1133 c1133 = C1133.f4216;
        c2529.m4556(Bitmap.class, Bitmap.class, c1133);
        c2529.m4557("Bitmap", Bitmap.class, Bitmap.class, new C1319(1));
        c2529.m4555(Bitmap.class, c0421);
        c2529.m4557("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0419(resources, c0528));
        c2529.m4557("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0419(resources, c0419));
        c2529.m4557("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0419(resources, c3553));
        c2529.m4555(BitmapDrawable.class, new C0542(interfaceC0424, 5, c0421));
        c2529.m4557("Animation", InputStream.class, C1446.class, new C2826(arrayListM4558, c0531, c1867));
        c2529.m4557("Animation", ByteBuffer.class, C1446.class, c0531);
        c2529.m4555(C1446.class, new C1227(13));
        c2529.m4556(C2807.class, C2807.class, c1133);
        c2529.m4557("Bitmap", C2807.class, Bitmap.class, new C0422(interfaceC0424));
        c2529.m4557("legacy_append", Uri.class, Drawable.class, c2573);
        c2529.m4557("legacy_append", Uri.class, Bitmap.class, new C0419(c2573, 1, interfaceC0424));
        c2529.m4561(new C0532(0));
        c2529.m4556(File.class, ByteBuffer.class, new C0373(11));
        c2529.m4556(File.class, InputStream.class, new C1325(new C1227(7)));
        c2529.m4557("legacy_append", File.class, File.class, new C1319(0));
        c2529.m4556(File.class, ParcelFileDescriptor.class, new C1325(new C1227(6)));
        c2529.m4556(File.class, File.class, c1133);
        c2529.m4561(new C1644(c1867));
        if (!"robolectric".equals(str)) {
            c2529.m4561(new C0532(2));
        }
        C1044 c1044 = new C1044(applicationContext, 2);
        C1044 c1045 = new C1044(applicationContext, 0);
        C1044 c1046 = new C1044(applicationContext, 1);
        Class cls2 = Integer.TYPE;
        c2529.m4556(cls2, InputStream.class, c1044);
        c2529.m4556(Integer.class, InputStream.class, c1044);
        c2529.m4556(cls2, AssetFileDescriptor.class, c1045);
        c2529.m4556(Integer.class, AssetFileDescriptor.class, c1045);
        c2529.m4556(cls2, Drawable.class, c1046);
        c2529.m4556(Integer.class, Drawable.class, c1046);
        c2529.m4556(Uri.class, InputStream.class, new C1044(applicationContext, 9));
        c2529.m4556(Uri.class, AssetFileDescriptor.class, new C1044(applicationContext, 8));
        C0420 c0420 = new C0420(resources, 3);
        C0420 c0422 = new C0420(resources, 1);
        C0420 c0423 = new C0420(resources, 2);
        c2529.m4556(Integer.class, Uri.class, c0420);
        c2529.m4556(cls2, Uri.class, c0420);
        c2529.m4556(Integer.class, AssetFileDescriptor.class, c0422);
        c2529.m4556(cls2, AssetFileDescriptor.class, c0422);
        c2529.m4556(Integer.class, InputStream.class, c0423);
        c2529.m4556(cls2, InputStream.class, c0423);
        c2529.m4556(String.class, InputStream.class, new C0094(12));
        c2529.m4556(Uri.class, InputStream.class, new C0094(12));
        c2529.m4556(String.class, InputStream.class, new C2102(18));
        c2529.m4556(String.class, ParcelFileDescriptor.class, new C2102(17));
        c2529.m4556(String.class, AssetFileDescriptor.class, new C2102(16));
        c2529.m4556(Uri.class, InputStream.class, new C0273(applicationContext.getAssets(), 1));
        c2529.m4556(Uri.class, AssetFileDescriptor.class, new C0273(applicationContext.getAssets(), 0));
        c2529.m4556(Uri.class, InputStream.class, new C1044(applicationContext, 6));
        c2529.m4556(Uri.class, InputStream.class, new C1044(applicationContext, 7));
        if (i >= 29) {
            c2529.m4556(Uri.class, InputStream.class, new C2441(applicationContext, InputStream.class));
            c2529.m4556(Uri.class, ParcelFileDescriptor.class, new C2441(applicationContext, ParcelFileDescriptor.class));
        }
        boolean zContainsKey = c1466.f5231.containsKey(AbstractC2665.class);
        c2529.m4556(Uri.class, InputStream.class, new C3513(contentResolver, zContainsKey, 2));
        c2529.m4556(Uri.class, ParcelFileDescriptor.class, new C3513(contentResolver, zContainsKey, 1));
        c2529.m4556(Uri.class, AssetFileDescriptor.class, new C3513(contentResolver, zContainsKey, 0));
        c2529.m4556(Uri.class, InputStream.class, new C2102(24));
        c2529.m4556(URL.class, InputStream.class, new C2102(23));
        c2529.m4556(Uri.class, File.class, new C1044(applicationContext, 5));
        c2529.m4556(C1468.class, InputStream.class, new C0094(25));
        c2529.m4556(byte[].class, ByteBuffer.class, new C0373(7));
        c2529.m4556(byte[].class, InputStream.class, new C0373(9));
        c2529.m4556(Uri.class, Uri.class, c1133);
        c2529.m4556(Drawable.class, Drawable.class, c1133);
        c2529.m4557("legacy_append", Drawable.class, Drawable.class, new C1319(2));
        c2529.m4562(Bitmap.class, BitmapDrawable.class, new C0420(resources, 0));
        c2529.m4562(Bitmap.class, byte[].class, c0408);
        c2529.m4562(Drawable.class, byte[].class, new C0243(interfaceC0424, c0408, c1227, 7));
        c2529.m4562(C1446.class, byte[].class, c1227);
        C3553 c3554 = new C3553(interfaceC0424, new C2102(28));
        c2529.m4557("legacy_append", ByteBuffer.class, Bitmap.class, c3554);
        c2529.m4557("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0419(resources, c3554));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw AbstractC1194.m2777(it);
        }
        return c2529;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final void m4991(InterfaceC0877 interfaceC0877) {
        InterfaceC1698 interfaceC1698 = (InterfaceC1698) interfaceC0877.mo942(C1133.f4207);
        if (interfaceC1698 != null && !interfaceC1698.mo3437()) {
            throw interfaceC1698.mo3440();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final InterfaceC0877 m4992(InterfaceC0877 interfaceC0877, InterfaceC0877 interfaceC0878, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC0877.mo940(bool, new C0184(6))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC0878.mo940(bool, new C0184(6))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC0877.mo941(interfaceC0878);
        }
        C0184 c0184 = new C0184(4);
        C1187 c1187 = C1187.f4327;
        InterfaceC0877 interfaceC0879 = (InterfaceC0877) interfaceC0877.mo940(c1187, c0184);
        Object objMo940 = interfaceC0878;
        if (zBooleanValue2) {
            objMo940 = interfaceC0878.mo940(c1187, new C0184(5));
        }
        return interfaceC0879.mo941((InterfaceC0877) objMo940);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final void m4993(long j, int i, int i2, byte[] bArr, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = AbstractC1533.f5369[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static ColorStateList m4994(Context context, C0243 c0243, int i) {
        int resourceId;
        ColorStateList colorStateListM4030;
        TypedArray typedArray = (TypedArray) c0243.f1404;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM4030 = AbstractC2203.m4030(context, resourceId)) == null) ? c0243.m1319(i) : colorStateListM4030;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static ColorStateList m4995(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM4030;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM4030 = AbstractC2203.m4030(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM4030;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static Drawable m4996(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f10927) {
                return m5002(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f10927 = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC2582.f8187;
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static Drawable m4997(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM5076;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM5076 = AbstractC3471.m5076(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM5076;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static C2385 m4998(C0236 c0236) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C2385(AbstractC1076.m2644(c0236));
        }
        TextPaint textPaint = new TextPaint(c0236.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c0236.getBreakStrategy();
        int hyphenationFrequency = c0236.getHyphenationFrequency();
        if (c0236.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (true || (c0236.getInputType() & 15) != 3) {
            boolean z = c0236.getLayoutDirection() == 1;
            switch (c0236.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(AbstractC1076.m2638(DecimalFormatSymbols.getInstance(c0236.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C2385(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final InterfaceC1080 m4999(InterfaceC1698 interfaceC1698, boolean z, AbstractC1701 abstractC1701) {
        return interfaceC1698 instanceof C1705 ? ((C1705) interfaceC1698).m3458(z, abstractC1701) : interfaceC1698.mo3439(abstractC1701.mo2067(), z, new C1700(1, abstractC1701, AbstractC1701.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static boolean m5000(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static boolean m5001(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static Drawable m5002(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C0841 c0841 = new C0841(context);
            c0841.f3245 = theme;
            Configuration configuration = theme.getResources().getConfiguration();
            if (c0841.f3248 != null) {
                throw new IllegalStateException("getResources() or getAssets() has already been called");
            }
            if (c0841.f3247 != null) {
                throw new IllegalStateException("Override configuration has already been set");
            }
            c0841.f3247 = new Configuration(configuration);
            context = c0841;
        }
        return AbstractC3471.m5076(context, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static int m5003(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static int m5004(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static C2302 m5005(C0539... c0539Arr) {
        int i;
        int i2 = 0;
        if (c0539Arr.length == 0) {
            return new C2302(new C0539[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new C0253(c0539Arr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(c0539Arr.length);
        for (C0539 c0539 : c0539Arr) {
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] objArrCopyOf = Arrays.copyOf(numArr, numArr.length);
        ArrayList arrayList3 = objArrCopyOf.length == 0 ? new ArrayList() : new ArrayList(new C0253(objArrCopyOf, true));
        int length = c0539Arr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            C0539 c05310 = c0539Arr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (false) {
                throw new IllegalArgumentException(AbstractC1194.m2780(size, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (false) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i6 = size - 1;
            int i7 = 0;
            while (true) {
                if (i7 > i6) {
                    i = -(i7 + 1);
                    break;
                }
                i = (i7 + i6) >>> 1;
                int iM3291 = AbstractC1574.m3291((Comparable) arrayList.get(i), c05310);
                if (iM3291 >= 0) {
                    if (iM3291 <= 0) {
                        break;
                    }
                    i6 = i - 1;
                } else {
                    i7 = i + 1;
                }
            }
            arrayList3.set(i, Integer.valueOf(i4));
            i3++;
            i4 = i5;
        }
        if (((C0539) arrayList.get(0)).mo1870() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            C0539 c05311 = (C0539) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                C0539 c05312 = (C0539) arrayList.get(i10);
                
                if (!c05312.mo1874(c05311, c05311.mo1870())) {
                    break;
                }
                if (c05312.mo1870() == c05311.mo1870()) {
                    throw new IllegalArgumentException(("duplicate option: " + c05312).toString());
                }
                if (((Number) arrayList3.get(i10)).intValue() > ((Number) arrayList3.get(i8)).intValue()) {
                    arrayList.remove(i10);
                    arrayList3.remove(i10);
                } else {
                    i10++;
                }
            }
            i8 = i9;
        }
        C0504 c0504 = new C0504();
        m4987(0L, c0504, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (c0504.f2172 / ((long) 4))];
        while (!c0504.mo1766()) {
            iArr[i2] = c0504.readInt();
            i2++;
        }
        return new C2302((C0539[]) Arrays.copyOf(c0539Arr, c0539Arr.length), iArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static void m5006(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static void m5007(TextView textView, int i) {
        AbstractC2665.m4659(i);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC1076.m2645(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static void m5008(TextView textView, int i) {
        AbstractC2665.m4659(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static void m5009(TextView textView, int i) {
        AbstractC2665.m4659(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static void m5010(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC2207.m4114(classCastException, AbstractC3453.class.getName());
        throw classCastException;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static C0701 m5011(C0094 c0094, C1043 c1043, C0580 c0580, C0580 c0581, C1023 c1023) {
        C0165 c0165;
        C0215 c0215M4602;
        C0165 c0166;
        C2299 c2299 = (C2299) c0094.f1049;
        if (!c2299.f7411) {
            c2299.f7411 = true;
        }
        c1043.m2613();
        C0918 c0918 = c1043.f3800;
        c1043.m2613();
        int i = c1043.f3799 & (-33);
        c1043.m2612();
        AbstractC0369 abstractC0369M1644 = c1043.f3805.m1644("SourceFile");
        C0917 c0917 = abstractC0369M1644 instanceof C0297 ? ((C0297) abstractC0369M1644).f1508 : null;
        c1043.m2613();
        C0918 c0919 = c1043.f3801;
        c1043.m2613();
        C0701 c0701 = new C0701(c0918, i, c0919, c1043.f3802, c0917);
        c1043.m2613();
        C0918 c09110 = c1043.f3800;
        c1043.m2612();
        C0442 c0442 = c1043.f3805;
        C0177 c0177M3155 = AbstractC1458.m3155(c0442);
        C0286 c0286 = (C0286) c0442.m1644("EnclosingMethod");
        char c = 3;
        if (c0286 == null) {
            c0165 = null;
        } else {
            C0918 c09111 = c0286.f1500;
            C0914 c0914 = c0286.f1501;
            if (c0914 == null) {
                c0165 = new C0165(AbstractC0176.f1213, 3);
                c0165.m1217(new C2119(AbstractC0176.f1222, c09111));
                c0165.f6944 = false;
            } else {
                C0913 c0913 = new C0913(c09111, c0914);
                c0165 = new C0165(AbstractC0176.f1214, 3);
                c0165.m1217(new C2119(AbstractC0176.f1222, c0913));
                c0165.f6944 = false;
            }
        }
        try {
            C0177 c0177M3170 = AbstractC1458.m3170(c09110, c0442, c0165 == null);
            if (c0177M3170 != null) {
                C0177 c0177 = new C0177();
                c0177.m1229(c0177M3155);
                c0177.m1229(c0177M3170);
                c0177.f6944 = false;
                c0177M3155 = c0177;
            }
        } catch (C3629 e) {
            c0580.f2353.println("warning: " + e.getMessage());
        }
        if (c0165 != null) {
            c0177M3155 = C0177.m1227(c0177M3155, c0165);
        }
        c1043.m2613();
        if ((c1043.f3799 & 8192) != 0) {
            c1043.m2613();
            C0918 c09112 = c1043.f3800;
            c1043.m2612();
            C0442 c0443 = c1043.f3804;
            int length = c0443.f4836.length;
            C0165 c0167 = new C0165(c09112, 4);
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                InterfaceC1971 interfaceC1971 = (InterfaceC1971) c0443.m3062(i2);
                C0281 c0281 = (C0281) interfaceC1971.getAttributes().m1644("AnnotationDefault");
                if (c0281 != null) {
                    c0167.m1215(new C2119(interfaceC1971.mo2260().f3374, c0281.f1489));
                    z = true;
                }
            }
            if (z) {
                c0167.f6944 = false;
                c0166 = new C0165(AbstractC0176.f1212, 3);
                c0166.m1217(new C2119(AbstractC0176.f1222, new C0888(c0167)));
                c0166.f6944 = false;
            } else {
                c0166 = null;
            }
            if (c0166 != null) {
                c0177M3155 = C0177.m1227(c0177M3155, c0166);
            }
        }
        if (c0177M3155.f1224.size() != 0) {
            C0178 c0178 = c0701.f2670;
            if (c0178.f1225 != null) {
                throw new UnsupportedOperationException("class annotations already set");
            }
            c0178.f1225 = new C0174(c0177M3155, c1023);
        }
        C1301 c1301 = c1023.f3744;
        C1979 c1979 = c1023.f3745;
        C1977 c1977 = c1023.f3749;
        C0548 c0548 = c1023.f3748;
        c1043.m2613();
        C0918 c09113 = c1043.f3800;
        c1043.m2612();
        C0442 c0444 = c1043.f3803;
        int length2 = c0444.f4836.length;
        int i3 = 0;
        while (i3 < length2) {
            C2816 c2816 = (C2816) c0444.m3062(i3);
            char c2 = 3;
            C0442 c0445 = c2816.f9028;
            C0914 c0915 = c2816.f9027;
            try {
                C0899 c0899 = new C0899(c09113, c0915);
                int i4 = c2816.f9026;
                if ((i4 & 8) != 0) {
                    C0284 c0284 = (C0284) c0445.m1644("ConstantValue");
                    AbstractC3458 abstractC3458M4989 = c0284 == null ? null : c0284.f1498;
                    C1203 c1203 = new C1203(c0899, i4);
                    if (abstractC3458M4989 != null) {
                        abstractC3458M4989 = m4989(abstractC3458M4989, c0915.m2428());
                    }
                    C0699 c0699 = c0701.f2668;
                    if (c0699.f2661 != null) {
                        throw new UnsupportedOperationException("static fields already sorted");
                    }
                    c0699.f2656.add(c1203);
                    c0699.f2657.put(c1203, abstractC3458M4989);
                } else {
                    c0701.f2668.f2658.add(new C1203(c0899, i4));
                }
                C0177 c0177M3156 = AbstractC1458.m3155(c0445);
                if (c0177M3156.f1224.size() != 0) {
                    C0178 c0179 = c0701.f2670;
                    if (c0179.f1226 == null) {
                        c0179.f1226 = new ArrayList();
                    }
                    c0179.f1226.add(new C1298(c0899, new C0174(c0177M3156, c1023)));
                }
                c1023.f3744.m3018(c0899);
                i3++;
                c = 3;
                c09113 = c09113;
                c0444 = c0444;
            } catch (RuntimeException e2) {
                throw C1238.m2884("...while processing " + c0915.f3374.mo1214() + " " + c0915.f3375.mo1214(), e2);
            }
        }
        c1043.m2613();
        C0918 c09114 = c1043.f3800;
        c1043.m2612();
        C0442 c0446 = c1043.f3804;
        int length3 = c0446.f4836.length;
        int i5 = 0;
        while (i5 < length3) {
            InterfaceC1971 interfaceC1972 = (InterfaceC1971) c0446.m3062(i5);
            try {
                C0914 c0914Mo2260 = interfaceC1972.mo2260();
                C0913 c0916 = new C0913(c09114, c0914Mo2260);
                int iMo2259 = interfaceC1972.mo2259();
                boolean z2 = (iMo2259 & 8) != 0;
                boolean z3 = (iMo2259 & 2) != 0;
                int i6 = length3;
                boolean z4 = (iMo2259 & 256) != 0;
                boolean z5 = (iMo2259 & 1024) != 0;
                int i7 = i5;
                boolean z6 = c0914Mo2260.f3374.f3378.equals("<init>") || c0914Mo2260.f3374.f3378.equals("<clinit>");
                if (z4 || z5) {
                    z6 = z6;
                    c0215M4602 = null;
                } else {
                    C0662 c0662M4605 = C2596.m4605(new C0768(interfaceC1972, c1043), c0446, c0581);
                    C2440 c2440 = c0916.f3330;
                    if (!z2) {
                        if (c0916.f3331 == null) {
                            c0916.f3331 = c2440.m4423(c09114.f3401);
                        }
                        c2440 = c0916.f3331;
                    }
                    int iM4797 = c2440.f7756.m4797();
                    String str = c09114.f3401.f10904;
                    String str2 = interfaceC1972.getName().f3378;
                    c0215M4602 = C2592.m4602(c0662M4605, iM4797, c0581);
                }
                if ((iMo2259 & 32) != 0) {
                    iMo2259 |= 131072;
                    if (!z4) {
                        iMo2259 &= -33;
                    }
                }
                if (z6) {
                    iMo2259 |= 65536;
                }
                C0287 c0287 = (C0287) interfaceC1972.getAttributes().m1644("Exceptions");
                C1205 c1205 = new C1205(c0916, iMo2259, c0215M4602, c0287 == null ? C2819.f9030 : c0287.f1502);
                if (c0914Mo2260.f3374.f3378.equals("<init>") || c0914Mo2260.f3374.f3378.equals("<clinit>") || z2 || z3) {
                    c0701.f2668.f2659.add(c1205);
                } else {
                    c0701.f2668.f2660.add(c1205);
                }
                C0177 c0177M3157 = AbstractC1458.m3157(interfaceC1972);
                if (c0177M3157.f1224.size() != 0) {
                    C0178 c01710 = c0701.f2670;
                    if (c01710.f1227 == null) {
                        c01710.f1227 = new ArrayList();
                    }
                    c01710.f1227.add(new C1972(c0916, new C0174(c0177M3157, c1023)));
                }
                C0179 c0179M3159 = AbstractC1458.m3159(interfaceC1972);
                if (c0179M3159.f4836.length != 0) {
                    C0178 c01711 = c0701.f2670;
                    if (c01711.f1228 == null) {
                        c01711.f1228 = new ArrayList();
                    }
                    c01711.f1228.add(new C2324(c0916, c0179M3159, c1023));
                }
                c1023.f3745.m3815(c0916);
                i5 = i7 + 1;
                length3 = i6;
                c0446 = c0446;
            } catch (RuntimeException e3) {
                throw C1238.m2884("...while processing " + interfaceC1972.getName().mo1214() + " " + interfaceC1972.mo2256().mo1214(), e3);
            }
        }
        c1043.m2613();
        C2815 c2815 = c1043.f3798;
        int length4 = c2815.f9024.length;
        for (int i8 = 0; i8 < length4; i8++) {
            try {
                AbstractC0777 abstractC0777 = c2815.f9024[i8];
                if (abstractC0777 instanceof C0913) {
                    c1979.m3815((AbstractC0891) abstractC0777);
                } else if (abstractC0777 instanceof C0904) {
                    c1979.m3815(((C0904) abstractC0777).m2422());
                } else if (abstractC0777 instanceof C0899) {
                    c1301.m3018((C0899) abstractC0777);
                } else if (abstractC0777 instanceof C0898) {
                    c1301.m3018(((C0898) abstractC0777).m2412());
                } else if (abstractC0777 instanceof C0912) {
                    c1977.m3810((C0912) abstractC0777);
                } else {
                    if (abstractC0777 instanceof C0905) {
                        C0905 c0905 = (C0905) abstractC0777;
                        int i9 = c0905.f3357;
                        c1043.m2612();
                        C0282 c0282 = (C0282) c1043.f3805.m1644("BootstrapMethods");
                        C0443 c0447 = (C0443) (c0282 != null ? c0282.f1491 : C0444.f2012).m3062(i9);
                        C0912 c0912 = c0447.f2011;
                        C0914 c09115 = c0905.f3358;
                        C0442 c0448 = c0447.f2010;
                        if (c0912 == null) {
                            throw new NullPointerException("bootstrapMethodHandle == null");
                        }
                        if (c09115 == null) {
                            throw new NullPointerException("nat == null");
                        }
                        C0889 c0889 = new C0889(c0448.f4836.length + 3);
                        c0889.m3063(0, c0912);
                        c0889.m3063(1, c09115.f3374);
                        c0889.m3063(2, new C0915(C2440.m4419(c09115.f3375.f3378)));
                        for (int i10 = 0; i10 < c0448.f4836.length; i10++) {
                            c0889.m3063(i10 + 3, (AbstractC0777) c0448.m3062(i10));
                        }
                        c0889.f6944 = false;
                        C0894 c0894 = new C0894(c0889);
                        c1043.m2613();
                        C0918 c09116 = c1043.f3800;
                        if (c0905.f3360 != null) {
                            throw new IllegalArgumentException("already added declaring class");
                        }
                        if (c09116 == null) {
                            throw new NullPointerException("declaringClass == null");
                        }
                        c0905.f3360 = c09116;
                        if (c0905.f3361 != null) {
                            throw new IllegalArgumentException("already added call site");
                        }
                        c0905.f3361 = c0894;
                        for (C0895 c0895 : c0905.f3362) {
                            synchronized (c0548) {
                                if (c0895 == null) {
                                    throw new NullPointerException("cstRef");
                                }
                                c0548.m4638();
                                if (((C0547) c0548.f2261.get(c0895)) == null) {
                                    c0548.f2261.put(c0895, new C0547(c0895));
                                }
                                throw th;
                            }
                        }
                    }
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new C1238("invalid constant pool index ".concat(AbstractC1460.m3223(i8)), null);
            }
        }
        return c0701;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲇᤞᲈᲀᲁ] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲇᲁᤞᲀ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲇᲁᤞᲀ] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static final C3493 m5012(AbstractC0843 abstractC0843, InterfaceC0877 interfaceC0877, Object obj) {
        C3493 c3493 = null;
        if (false && interfaceC0877.mo942(C3494.f10994) != null) {
            while (!(abstractC0843 instanceof C1073) && (abstractC0843 = abstractC0843.mo1491()) != 0) {
                if (abstractC0843 instanceof C3493) {
                    c3493 = (C3493) abstractC0843;
                    break;
                }
            }
            if (c3493 != null) {
                c3493.m5094(interfaceC0877, obj);
            }
        }
        return c3493;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static final void m5013(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static ActionMode.Callback m5014(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof ActionModeCallbackC2913) || callback == null) ? callback : new ActionModeCallbackC2913(callback, textView);
    }
}
