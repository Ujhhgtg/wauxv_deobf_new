package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0026;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲀᤝᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0253 implements InterfaceC2634, InterfaceC2431 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static volatile C0253 f1475;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final Object f1476 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1477;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f1478;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f1479;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f1480;

    public /* synthetic */ C0253(int i) {
        this.f1477 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static boolean m1451(Editable editable, KeyEvent keyEvent, boolean z) {
        C3522[] c3522Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c3522Arr = (C3522[]) editable.getSpans(selectionStart, selectionEnd, C3522.class)) != null && c3522Arr.length > 0) {
                for (C3522 c3522 : c3522Arr) {
                    int spanStart = editable.getSpanStart(c3522);
                    int spanEnd = editable.getSpanEnd(c3522);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static C0253 m1452(Context context) {
        if (f1475 == null) {
            synchronized (f1476) {
                try {
                    if (f1475 == null) {
                        f1475 = new C0253(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1475;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static C0253 m1453(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0253(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static C0253 m1454(C0253 c0253, C1774 c1774, C1774 c1775) {
        if (c0253 == null) {
            return null;
        }
        C1774 c1776 = (C1774) c0253.f1478;
        C0253 c0253M1454 = m1454((C0253) c0253.f1480, c1774, c1775);
        c0253.f1480 = c0253M1454;
        int i = c1776.f5914;
        C1774 c1777 = (C1774) c0253.f1479;
        int i2 = c1777.f5914;
        int i3 = c1774.f5914;
        int i4 = c1775 == null ? Integer.MAX_VALUE : c1775.f5914;
        if (i3 >= i2 || i4 <= i) {
            return c0253;
        }
        if (i3 <= i) {
            return i4 >= i2 ? c0253M1454 : new C0253(c0253, c1775, c1777);
        }
        if (i4 >= i2) {
            return new C0253(c0253, c1776, c1774);
        }
        c0253.f1480 = new C0253(c0253, c1775, c1777);
        return new C0253(c0253, c1776, c1774);
    }

    @Override // p000.InterfaceC2431
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean mo1457(Object obj) {
        if (obj instanceof InterfaceC1264) {
            ((InterfaceC1264) obj).mo2620().f9174 = true;
        }
        switch (((C1224) this.f1479).f4430) {
            case 4:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((C2433) this.f1480).mo1457(obj);
    }

    @Override // p000.InterfaceC2431
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Object mo1458() {
        Object objMo1458 = ((C2433) this.f1480).mo1458();
        if (objMo1458 == null) {
            objMo1458 = ((InterfaceC1263) this.f1478).mo1246();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objMo1458.getClass());
            }
        }
        if (objMo1458 instanceof InterfaceC1264) {
            ((InterfaceC1264) objMo1458).mo2620().f9174 = false;
        }
        return objMo1458;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public synchronized void m1459(InterfaceC1772 interfaceC1772, C1226 c1226) {
        C0151 c0151 = (C0151) ((HashMap) this.f1478).put(interfaceC1772, new C0151(interfaceC1772, c1226, (ReferenceQueue) this.f1479));
        if (c0151 != null) {
            c0151.f1208 = null;
            c0151.clear();
        }
    }

    @Override // p000.InterfaceC2634
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public InterfaceC2624 mo1460(InterfaceC2624 interfaceC2624, C2336 c2336) {
        Drawable drawable = (Drawable) interfaceC2624.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C0383) this.f1479).mo1460(C0400.m1734((InterfaceC0399) this.f1478, ((BitmapDrawable) drawable).getBitmap()), c2336);
        }
        if (drawable instanceof C1454) {
            return ((C1224) this.f1480).mo1460(interfaceC2624, c2336);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public void m1461(C0151 c0151) {
        InterfaceC2624 interfaceC2624;
        synchronized (this) {
            ((HashMap) this.f1478).remove(c0151.f1206);
            if (c0151.f1207 && (interfaceC2624 = c0151.f1208) != null) {
                ((C1217) this.f1480).m2959(c0151.f1206, new C1226(interfaceC2624, true, false, c0151.f1206, (C1217) this.f1480));
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Bitmap m1462(BitmapFactory.Options options) throws Throwable {
        switch (this.f1477) {
            case Opcodes.DCONST_0 /* 14 */:
                return AbstractC2236.m4228(new C0510(AbstractC0511.m1959((ByteBuffer) this.f1478)), options, this);
            case 15:
                C2534 c2534 = (C2534) ((C0102) this.f1478).f1117;
                c2534.reset();
                return AbstractC2236.m4228(c2534, options, this);
            default:
                FileDescriptor fileDescriptor = ((C0026) this.f1480).m752().getFileDescriptor();
                int i = Build.VERSION.SDK_INT;
                Bitmap bitmapM4236 = null;
                if (i == 34) {
                    if (((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) AbstractC3528.f11115.get()).booleanValue() : false) && AbstractC2236.m4234(this)) {
                        Bitmap.Config config = options.inPreferredConfig;
                        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                        AbstractC2727.m4691("", config == config2);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        try {
                            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                            if (bitmapDecodeFileDescriptor == null) {
                                if (bitmapDecodeFileDescriptor != null) {
                                }
                                options.inPreferredConfig = config2;
                                return bitmapM4236;
                            }
                            try {
                                bitmapM4236 = AbstractC2236.m4236(bitmapDecodeFileDescriptor);
                            } catch (Throwable th) {
                                th = th;
                                bitmapM4236 = bitmapDecodeFileDescriptor;
                                if (bitmapM4236 != null) {
                                    bitmapM4236.recycle();
                                }
                                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                throw th;
                            }
                            break;
                            bitmapDecodeFileDescriptor.recycle();
                            options.inPreferredConfig = config2;
                            return bitmapM4236;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public void m1463(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f1479;
        String string = ((Context) this.f1480).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC1650.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m1464((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0758(e);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public Object m1464(Class cls, HashSet hashSet) {
        boolean zBooleanValue;
        Object objMo93;
        HashMap map = (HashMap) this.f1478;
        if (Build.VERSION.SDK_INT >= 29) {
            zBooleanValue = AbstractC3479.m5000();
        } else {
            try {
                if (AbstractC1468.f5219 == null) {
                    AbstractC1468.f5218 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC1468.f5219 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                zBooleanValue = ((Boolean) AbstractC1468.f5219.invoke(null, Long.valueOf(AbstractC1468.f5218))).booleanValue();
            } catch (Exception e) {
                if (e instanceof InvocationTargetException) {
                    Throwable cause = e.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new RuntimeException(cause);
                }
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                zBooleanValue = false;
            }
        }
        if (zBooleanValue) {
            try {
                AbstractC1468.m3299(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo93 = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC1650 interfaceC1650 = (InterfaceC1650) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo92 = interfaceC1650.mo92();
                if (!listMo92.isEmpty()) {
                    for (Class cls2 : listMo92) {
                        if (!map.containsKey(cls2)) {
                            m1464(cls2, hashSet);
                        }
                    }
                }
                objMo93 = interfaceC1650.mo93((Context) this.f1480);
                hashSet.remove(cls);
                map.put(cls, objMo93);
            } catch (Throwable th2) {
                throw new C0758(th2);
            }
        }
        Trace.endSection();
        return objMo93;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ColorStateList m1465(int i) {
        int resourceId;
        ColorStateList colorStateListM3333;
        TypedArray typedArray = (TypedArray) this.f1478;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM3333 = AbstractC1469.m3333((Context) this.f1480, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM3333;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public Drawable m1466(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f1478;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : C1787.m3667((Context) this.f1480, resourceId);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Typeface m1467(int i, int i2, C0237 c0237) {
        int resourceId = ((TypedArray) this.f1478).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f1479) == null) {
            this.f1479 = new TypedValue();
        }
        Context context = (Context) this.f1480;
        TypedValue typedValue = (TypedValue) this.f1479;
        ThreadLocal threadLocal = AbstractC2638.f8340;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC2638.m4615(context, resourceId, typedValue, i2, c0237, true, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public ImageHeaderParser$ImageType m1468() throws Throwable {
        switch (this.f1477) {
            case Opcodes.DCONST_0 /* 14 */:
                return AbstractC0738.m2274((List) this.f1479, AbstractC0511.m1959((ByteBuffer) this.f1478));
            case 15:
                List list = (List) this.f1480;
                C2534 c2534 = (C2534) ((C0102) this.f1478).f1117;
                c2534.reset();
                return AbstractC0738.m2273(list, c2534, (C1893) this.f1479);
            default:
                List list2 = (List) this.f1479;
                C0026 c0026 = (C0026) this.f1480;
                C1893 c1893 = (C1893) this.f1478;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC1620 interfaceC1620 = (InterfaceC1620) list2.get(i);
                    C2534 c2535 = null;
                    try {
                        C2534 c2536 = new C2534(new FileInputStream(c0026.m752().getFileDescriptor()), c1893);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2685 = interfaceC1620.mo2685(c2536);
                            c2536.m4453();
                            c0026.m752();
                            if (imageHeaderParser$ImageTypeMo2685 != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo2685;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c2535 = c2536;
                            if (c2535 != null) {
                                c2535.m4453();
                            }
                            c0026.m752();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public Class m1469() {
        InterfaceC1422 interfaceC1422 = (InterfaceC1422) this.f1479;
        Object obj = this.f1478;
        if (((Class) this.f1480) == null) {
            if (!(obj instanceof String)) {
                throw new IllegalStateException(("Unknown lazy class type \"" + obj + "\"").toString());
            }
            this.f1480 = AbstractC0705.m2223(interfaceC1422 != null ? (ClassLoader) interfaceC1422.invoke() : null, (String) obj);
        }
        Class cls = (Class) this.f1480;
        if (cls != null) {
            return cls;
        }
        throw new IllegalStateException("Exception has been thrown above.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean m1470(CharSequence charSequence, int i, int i2, C3521 c3521) {
        if ((c3521.f11107 & 3) == 0) {
            InterfaceC1145 interfaceC1145 = (InterfaceC1145) this.f1480;
            C1999 c1999M5086 = c3521.m5086();
            int iM3849 = c1999M5086.m3849(8);
            if (iM3849 != 0) {
                ((ByteBuffer) c1999M5086.f6315).getShort(iM3849 + c1999M5086.f6312);
            }
            C0990 c0990 = (C0990) interfaceC1145;
            c0990.getClass();
            ThreadLocal threadLocal = C0990.f3620;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = c0990.f3621.hasGlyph(sb.toString());
            int i3 = c3521.f11107 & 4;
            c3521.f11107 = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (c3521.f11107 & 3) == 2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean m1471() throws Throwable {
        switch (this.f1477) {
            case Opcodes.DCONST_0 /* 14 */:
                List list = (List) this.f1479;
                ByteBuffer byteBufferM1959 = AbstractC0511.m1959((ByteBuffer) this.f1478);
                C1893 c1893 = (C1893) this.f1480;
                if (byteBufferM1959 == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        boolean zMo2683 = ((InterfaceC1620) list.get(i)).mo2683(byteBufferM1959, c1893);
                        if (zMo2683) {
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return false;
            case 15:
                List list2 = (List) this.f1480;
                C2534 c2534 = (C2534) ((C0102) this.f1478).f1117;
                c2534.reset();
                C1893 c1894 = (C1893) this.f1479;
                c2534.mark(5242880);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        boolean zMo2687 = ((InterfaceC1620) list2.get(i2)).mo2687(c2534, c1894);
                        c2534.reset();
                        if (zMo2687) {
                            return true;
                        }
                    } catch (Throwable th2) {
                        c2534.reset();
                        throw th2;
                    }
                }
                return false;
            default:
                List list3 = (List) this.f1479;
                C0026 c0026 = (C0026) this.f1480;
                C1893 c1895 = (C1893) this.f1478;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC1620 interfaceC1620 = (InterfaceC1620) list3.get(i3);
                    C2534 c2535 = null;
                    try {
                        C2534 c2536 = new C2534(new FileInputStream(c0026.m752().getFileDescriptor()), c1895);
                        try {
                            boolean zMo2688 = interfaceC1620.mo2687(c2536, c1895);
                            c2536.m4453();
                            c0026.m752();
                            if (zMo2688) {
                                return true;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c2535 = c2536;
                            if (c2535 != null) {
                                c2535.m4453();
                            }
                            c0026.m752();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean m1472(C0783 c0783, C0792 c0792, int i) {
        C0382 c0382 = (C0382) this.f1479;
        int[] iArr = c0792.f3141;
        int[] iArr2 = c0792.f3093;
        c0382.f1882 = iArr[0];
        c0382.f1883 = iArr[1];
        c0382.f1884 = c0792.m2431();
        c0382.f1885 = c0792.m2428();
        c0382.f1890 = false;
        c0382.f1891 = i;
        boolean z = c0382.f1882 == 3;
        boolean z2 = c0382.f1883 == 3;
        boolean z3 = z && c0792.f3122 > 0.0f;
        boolean z4 = z2 && c0792.f3122 > 0.0f;
        if (z3 && iArr2[0] == 4) {
            c0382.f1882 = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c0382.f1883 = 1;
        }
        c0783.m2408(c0792, c0382);
        c0792.m2449(c0382.f1886);
        c0792.m2446(c0382.f1887);
        c0792.f3104 = c0382.f1889;
        c0792.m2443(c0382.f1888);
        c0382.f1891 = 0;
        return c0382.f1890;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public C0253 m1473(C0253 c0253, int i, int i2) {
        C1676 c1676 = (C1676) this.f1480;
        AbstractC1861 abstractC1861 = (AbstractC1861) this.f1478;
        C1862 c1862Mo3771 = abstractC1861.mo3771((AbstractC1861) c0253.f1478, i2);
        C1244 c1244 = (C1244) this.f1479;
        C1244 c1245 = (C1244) c0253.f1479;
        c1244.getClass();
        try {
            C1244 c1244M4706 = AbstractC2727.m4706(c1244, c1245);
            C1676 c1676M3549 = ((C1676) c0253.f1480).m3549();
            c1676M3549.m3546(i);
            c1676M3549.f7068 = false;
            if (c1862Mo3771 == abstractC1861 && c1244M4706 == c1244 && c1676.equals(c1676M3549)) {
                return this;
            }
            if (!c1676.equals(c1676M3549)) {
                if (c1676.f5648 <= c1676M3549.f5648) {
                    c1676 = c1676M3549;
                    c1676M3549 = c1676;
                }
                int i3 = c1676.f5648;
                int i4 = c1676M3549.f5648;
                for (int i5 = i4 - 1; i5 >= 0; i5--) {
                    if (c1676M3549.m3548(i5) != c1676.m3548((i3 - i4) + i5)) {
                        throw new RuntimeException("Incompatible merged subroutines");
                    }
                }
            }
            return new C0253(c1862Mo3771, c1244M4706, c1676);
        } catch (C2766 e) {
            e.m3004("underlay stack:");
            c1244.m3014(e);
            e.m3004("overlay stack:");
            c1245.m3014(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public Object m1474(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC1173 interfaceC1173) {
        int i4;
        char c;
        C0308 c0308 = new C0308((C2001) ((C2136) this.f1479).f7061);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMo1974 = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zMo1974) {
                    SparseArray sparseArray = ((C2001) c0308.f1587).f6644;
                    C2001 c2001 = sparseArray == null ? null : (C2001) sparseArray.get(iCodePointAt);
                    if (c0308.f1583 == 2) {
                        if (c2001 != null) {
                            c0308.f1587 = c2001;
                            c0308.f1585++;
                        } else {
                            if (iCodePointAt == 65038) {
                                c0308.m1550();
                            } else if (iCodePointAt != 65039) {
                                C2001 c2002 = (C2001) c0308.f1587;
                                if (c2002.f6645 != null) {
                                    if (c0308.f1585 != 1) {
                                        c0308.f1588 = c2002;
                                        c0308.m1550();
                                    } else if (c0308.m1551()) {
                                        c0308.f1588 = (C2001) c0308.f1587;
                                        c0308.m1550();
                                    } else {
                                        c0308.m1550();
                                    }
                                    c = 3;
                                } else {
                                    c0308.m1550();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (c2001 == null) {
                        c0308.m1550();
                        c = 1;
                    } else {
                        c0308.f1583 = 2;
                        c0308.f1587 = c2001;
                        c0308.f1585 = 1;
                        c = 2;
                    }
                    c0308.f1584 = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && m1470(charSequence, i4, iCharCount, ((C2001) c0308.f1588).f6645)) {
                            break;
                        }
                        zMo1974 = interfaceC1173.mo1974(charSequence, i4, iCharCount, ((C2001) c0308.f1588).f6645);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (c0308.f1583 == 2 && ((C2001) c0308.f1587).f6645 != null && ((c0308.f1585 > 1 || c0308.m1551()) && i5 < i3 && zMo1974 && (z || !m1470(charSequence, i4, iCharCount, ((C2001) c0308.f1587).f6645)))) {
            interfaceC1173.mo1974(charSequence, i4, iCharCount, ((C2001) c0308.f1587).f6645);
        }
        return interfaceC1173.getResult();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public void m1475() {
        ((TypedArray) this.f1478).recycle();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public void m1476(C0793 c0793, int i, int i2) {
        int i3 = c0793.f3127;
        int i4 = c0793.f3128;
        c0793.f3127 = 0;
        c0793.f3128 = 0;
        c0793.m2449(i);
        c0793.m2446(i2);
        if (i3 < 0) {
            c0793.f3127 = 0;
        } else {
            c0793.f3127 = i3;
        }
        if (i4 < 0) {
            c0793.f3128 = 0;
        } else {
            c0793.f3128 = i4;
        }
        ((C0793) this.f1480).m2457();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public void m1477(C0793 c0793) {
        ArrayList arrayList = (ArrayList) this.f1478;
        arrayList.clear();
        int size = c0793.f3142.size();
        for (int i = 0; i < size; i++) {
            C0792 c0792 = (C0792) c0793.f3142.get(i);
            int[] iArr = c0792.f3141;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0792);
            }
        }
        c0793.f3144.f3701 = true;
    }

    public /* synthetic */ C0253(Object obj, Object obj2, Object obj3, int i) {
        this.f1477 = i;
        this.f1478 = obj;
        this.f1479 = obj2;
        this.f1480 = obj3;
    }

    public C0253() {
        this.f1477 = 1;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0150(0));
        this.f1478 = new HashMap();
        this.f1479 = new ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new RunnableC0149(this, 1));
    }

    public C0253(C0776 c0776) {
        this.f1477 = 3;
        C0379 c0379 = (C0379) c0776.f2879;
        int iM3658 = c0379.m3658();
        this.f1478 = new C0729[iM3658];
        this.f1479 = new C0729[iM3658];
        this.f1480 = new C0729[iM3658];
        int length = c0379.f4833.length;
        for (int i = 0; i < length; i++) {
            C0377 c0377 = (C0377) c0379.m3165(i);
            C0417 c0417 = c0377.f1870;
            int i2 = c0377.f1869;
            ((C0729[]) this.f1478)[i2] = new C0729(((AbstractC1663) c0417.m3165(0)).f5624, false);
            C2848 c2848 = c0417.m1751().f5624;
            ((C0729[]) this.f1479)[i2] = new C0729(c2848, false);
            ((C0729[]) this.f1480)[i2] = new C0729(c2848, false);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    private final void m1455() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    private final void m1456() {
    }

    public C0253(C0776 c0776, int[] iArr, C0253 c0253) {
        this.f1477 = 19;
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (c0253 != null) {
            this.f1478 = c0776;
            this.f1479 = iArr;
            this.f1480 = c0253;
            return;
        }
        throw new NullPointerException("addresses == null");
    }

    public C0253(AbstractC1861 abstractC1861, C1244 c1244, C1676 c1676) {
        this.f1477 = 12;
        if (abstractC1861 == null) {
            throw new NullPointerException("locals == null");
        }
        if (c1244 != null) {
            c1676.m4110();
            this.f1478 = abstractC1861;
            this.f1479 = c1244;
            this.f1480 = c1676;
            return;
        }
        throw new NullPointerException("stack == null");
    }

    public C0253(Context context, TypedArray typedArray) {
        this.f1477 = 20;
        this.f1480 = context;
        this.f1478 = typedArray;
    }

    public C0253(C0793 c0793) {
        this.f1477 = 2;
        this.f1478 = new ArrayList();
        this.f1479 = new C0382();
        this.f1480 = c0793;
    }

    public C0253(Context context) {
        this.f1477 = 0;
        this.f1480 = context.getApplicationContext();
        this.f1479 = new HashSet();
        this.f1478 = new HashMap();
    }

    public C0253(C0253 c0253, C1774 c1774, C1774 c1775) {
        this.f1477 = 13;
        c0253.getClass();
        this.f1478 = c1774;
        this.f1479 = c1775;
        this.f1480 = (C0253) c0253.f1480;
    }

    public C0253(String str, InterfaceC1422 interfaceC1422) {
        this.f1477 = 17;
        this.f1478 = str;
        this.f1479 = interfaceC1422;
    }

    public C0253(C2136 c2136, C0348 c0348, C0990 c0990, Set set) {
        this.f1477 = 8;
        this.f1478 = c0348;
        this.f1479 = c2136;
        this.f1480 = c0990;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m1474(str, 0, str.length(), 1, true, new C1174(str, 0));
        }
    }

    public C0253(C2433 c2433, InterfaceC1263 interfaceC1263, C1224 c1224) {
        this.f1477 = 10;
        this.f1480 = c2433;
        this.f1478 = interfaceC1263;
        this.f1479 = c1224;
    }

    public C0253(C1925 c1925, ArrayList arrayList, C1893 c1893) {
        this.f1477 = 15;
        AbstractC2727.m4693(c1893, "Argument must not be null");
        this.f1479 = c1893;
        AbstractC2727.m4693(arrayList, "Argument must not be null");
        this.f1480 = arrayList;
        this.f1478 = new C0102(c1925, c1893);
    }

    public C0253(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C1893 c1893) {
        this.f1477 = 16;
        AbstractC2727.m4693(c1893, "Argument must not be null");
        this.f1478 = c1893;
        AbstractC2727.m4693(arrayList, "Argument must not be null");
        this.f1479 = arrayList;
        this.f1480 = new C0026(parcelFileDescriptor);
    }

    public C0253(C1217 c1217, C2769 c2769, C1221 c1221) {
        this.f1477 = 9;
        this.f1480 = c1217;
        this.f1479 = c2769;
        this.f1478 = c1221;
    }
}
