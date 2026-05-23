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
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C0019;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᤝᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0243 implements InterfaceC2578, InterfaceC2378 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static volatile C0243 f1401;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final Object f1402 = new Object();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1403;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f1404;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f1405;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Object f1406;

    public /* synthetic */ C0243(int i) {
        this.f1403 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static boolean m1305(Editable editable, KeyEvent keyEvent, boolean z) {
        C3466[] c3466Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c3466Arr = (C3466[]) editable.getSpans(selectionStart, selectionEnd, C3466.class)) != null && c3466Arr.length > 0) {
                for (C3466 c3466 : c3466Arr) {
                    int spanStart = editable.getSpanStart(c3466);
                    int spanEnd = editable.getSpanEnd(c3466);
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
    public static C0243 m1306(Context context) {
        if (f1401 == null) {
            synchronized (f1402) {
                try {
                    if (f1401 == null) {
                        f1401 = new C0243(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1401;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static C0243 m1307(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0243(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static C0243 m1308(C0243 c0243, C1752 c1752, C1752 c1753) {
        if (c0243 == null) {
            return null;
        }
        C1752 c1754 = (C1752) c0243.f1404;
        C0243 c0243M1308 = m1308((C0243) c0243.f1406, c1752, c1753);
        c0243.f1406 = c0243M1308;
        int i = c1754.f5861;
        C1752 c1755 = (C1752) c0243.f1405;
        int i2 = c1755.f5861;
        int i3 = c1752.f5861;
        int i4 = c1753 == null ? Integer.MAX_VALUE : c1753.f5861;
        if (i3 >= i2 || i4 <= i) {
            return c0243;
        }
        if (i3 <= i) {
            return i4 >= i2 ? c0243M1308 : new C0243(c0243, c1753, c1755);
        }
        if (i4 >= i2) {
            return new C0243(c0243, c1754, c1752);
        }
        c0243.f1406 = new C0243(c0243, c1753, c1755);
        return new C0243(c0243, c1754, c1752);
    }

    @Override // p000.InterfaceC2378
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public boolean mo1311(Object obj) {
        if (obj instanceof InterfaceC1262) {
            ((InterfaceC1262) obj).mo2496().f9012 = true;
        }
        switch (((C1227) this.f1405).f4447) {
            case 3:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((C2380) this.f1406).mo1311(obj);
    }

    @Override // p000.InterfaceC2378
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Object mo1312() {
        Object objMo1312 = ((C2380) this.f1406).mo1312();
        if (objMo1312 == null) {
            objMo1312 = ((InterfaceC1261) this.f1404).mo1100();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objMo1312.getClass());
            }
        }
        if (objMo1312 instanceof InterfaceC1262) {
            ((InterfaceC1262) objMo1312).mo2496().f9012 = false;
        }
        return objMo1312;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public synchronized void m1313(InterfaceC1749 interfaceC1749, C1224 c1224) {
        C0143 c0143 = (C0143) ((HashMap) this.f1404).put(interfaceC1749, new C0143(interfaceC1749, c1224, (ReferenceQueue) this.f1405));
        if (c0143 != null) {
            c0143.f1140 = null;
            c0143.clear();
        }
    }

    @Override // p000.InterfaceC2578
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public InterfaceC2568 mo1314(InterfaceC2568 interfaceC2568, C2303 c2303) {
        Drawable drawable = (Drawable) interfaceC2568.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C0408) this.f1405).mo1314(C0425.m1628((InterfaceC0424) this.f1404, ((BitmapDrawable) drawable).getBitmap()), c2303);
        }
        if (drawable instanceof C1446) {
            return ((C1227) this.f1406).mo1314(interfaceC2568, c2303);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public void m1315(C0143 c0143) {
        InterfaceC2568 interfaceC2568;
        synchronized (this) {
            ((HashMap) this.f1404).remove(c0143.f1138);
            if (c0143.f1139 && (interfaceC2568 = c0143.f1140) != null) {
                ((C1216) this.f1406).m2837(c0143.f1138, new C1224(interfaceC2568, true, false, c0143.f1138, (C1216) this.f1406));
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Bitmap m1316(BitmapFactory.Options options) throws Throwable {
        switch (this.f1403) {
            case Opcodes.DCONST_0 /* 14 */:
                return AbstractC0968.m2471(new C0533(AbstractC0534.m1865((ByteBuffer) this.f1404)), options, this);
            case 15:
                C2479 c2479 = (C2479) ((C0094) this.f1404).f1049;
                c2479.reset();
                return AbstractC0968.m2471(c2479, options, this);
            default:
                FileDescriptor fileDescriptor = ((C0019) this.f1406).m609().getFileDescriptor();
                int i = Build.VERSION.SDK_INT;
                Bitmap bitmapM2485 = null;
                if (i == 34) {
                    if (((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) AbstractC3681.f11561.get()).booleanValue() : false) && AbstractC0968.m2476(this)) {
                        Bitmap.Config config = options.inPreferredConfig;
                        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                        AbstractC1460.m3208("", config == config2);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        try {
                            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                            if (bitmapDecodeFileDescriptor == null) {
                                if (bitmapDecodeFileDescriptor != null) {
                                }
                                options.inPreferredConfig = config2;
                                return bitmapM2485;
                            }
                            try {
                                bitmapM2485 = AbstractC0968.m2485(bitmapDecodeFileDescriptor);
                            } catch (Throwable th) {
                                th = th;
                                bitmapM2485 = bitmapDecodeFileDescriptor;
                                if (bitmapM2485 != null) {
                                    bitmapM2485.recycle();
                                }
                                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                throw th;
                            }
                            break;
                            bitmapDecodeFileDescriptor.recycle();
                            options.inPreferredConfig = config2;
                            return bitmapM2485;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public void m1317(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f1405;
        String string = ((Context) this.f1406).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC1636.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m1318((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0761(e);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public Object m1318(Class cls, HashSet hashSet) {
        boolean zBooleanValue;
        Object objMo93;
        HashMap map = (HashMap) this.f1404;
        if (Build.VERSION.SDK_INT >= 29) {
            zBooleanValue = AbstractC3421.m4938();
        } else {
            try {
                if (AbstractC0743.f2841 == null) {
                    AbstractC0743.f2840 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0743.f2841 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                zBooleanValue = ((Boolean) AbstractC0743.f2841.invoke(null, Long.valueOf(AbstractC0743.f2840))).booleanValue();
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
                AbstractC0743.m2172(cls.getSimpleName());
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
                InterfaceC1636 interfaceC1636 = (InterfaceC1636) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo92 = interfaceC1636.mo92();
                if (!listMo92.isEmpty()) {
                    for (Class cls2 : listMo92) {
                        if (!map.containsKey(cls2)) {
                            m1318(cls2, hashSet);
                        }
                    }
                }
                objMo93 = interfaceC1636.mo93((Context) this.f1406);
                hashSet.remove(cls);
                map.put(cls, objMo93);
            } catch (Throwable th2) {
                throw new C0761(th2);
            }
        }
        Trace.endSection();
        return objMo93;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ColorStateList m1319(int i) {
        int resourceId;
        ColorStateList colorStateListM4030;
        TypedArray typedArray = (TypedArray) this.f1404;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM4030 = AbstractC2203.m4030((Context) this.f1406, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM4030;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public Drawable m1320(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f1404;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC3471.m5076((Context) this.f1406, resourceId);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Typeface m1321(int i, int i2, C0227 c0227) {
        int resourceId = ((TypedArray) this.f1404).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f1405) == null) {
            this.f1405 = new TypedValue();
        }
        Context context = (Context) this.f1406;
        TypedValue typedValue = (TypedValue) this.f1405;
        ThreadLocal threadLocal = AbstractC2582.f8187;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC2582.m4593(context, resourceId, typedValue, i2, c0227, true, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public ImageHeaderParser$ImageType m1322() throws Throwable {
        switch (this.f1403) {
            case Opcodes.DCONST_0 /* 14 */:
                return AbstractC2201.m3973((List) this.f1405, AbstractC0534.m1865((ByteBuffer) this.f1404));
            case 15:
                List list = (List) this.f1406;
                C2479 c2479 = (C2479) ((C0094) this.f1404).f1049;
                c2479.reset();
                return AbstractC2201.m3972(list, c2479, (C1867) this.f1405);
            default:
                List list2 = (List) this.f1405;
                C0019 c0019 = (C0019) this.f1406;
                C1867 c1867 = (C1867) this.f1404;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC1607 interfaceC1607 = (InterfaceC1607) list2.get(i);
                    C2479 c24710 = null;
                    try {
                        C2479 c24711 = new C2479(new FileInputStream(c0019.m609().getFileDescriptor()), c1867);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2561 = interfaceC1607.mo2561(c24711);
                            c24711.m4432();
                            c0019.m609();
                            if (imageHeaderParser$ImageTypeMo2561 != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo2561;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c24710 = c24711;
                            if (c24710 != null) {
                                c24710.m4432();
                            }
                            c0019.m609();
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
    public Class m1323() {
        InterfaceC1414 interfaceC1414 = (InterfaceC1414) this.f1405;
        Object obj = this.f1404;
        if (((Class) this.f1406) == null) {
            if (!(obj instanceof String)) {
                throw new IllegalStateException(("Unknown lazy class type \"" + obj + "\"").toString());
            }
            this.f1406 = AbstractC0710.m2130(interfaceC1414 != null ? (ClassLoader) interfaceC1414.invoke() : null, (String) obj);
        }
        Class cls = (Class) this.f1406;
        if (cls != null) {
            return cls;
        }
        throw new IllegalStateException("Exception has been thrown above.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public boolean m1324(CharSequence charSequence, int i, int i2, C3465 c3465) {
        if ((c3465.f10951 & 3) == 0) {
            InterfaceC1139 interfaceC1139 = (InterfaceC1139) this.f1406;
            C1968 c1968M5061 = c3465.m5061();
            int iM3671 = c1968M5061.m3671(8);
            if (iM3671 != 0) {
                ((ByteBuffer) c1968M5061.f6241).getShort(iM3671 + c1968M5061.f6238);
            }
            C0986 c0986 = (C0986) interfaceC1139;
            c0986.getClass();
            ThreadLocal threadLocal = C0986.f3604;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = c0986.f3605.hasGlyph(sb.toString());
            int i3 = c3465.f10951 & 4;
            c3465.f10951 = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (c3465.f10951 & 3) == 2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean m1325() throws Throwable {
        switch (this.f1403) {
            case Opcodes.DCONST_0 /* 14 */:
                List list = (List) this.f1405;
                ByteBuffer byteBufferM1865 = AbstractC0534.m1865((ByteBuffer) this.f1404);
                C1867 c1867 = (C1867) this.f1406;
                if (byteBufferM1865 == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        boolean zMo2559 = ((InterfaceC1607) list.get(i)).mo2559(byteBufferM1865, c1867);
                        if (zMo2559) {
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return false;
            case 15:
                List list2 = (List) this.f1406;
                C2479 c2479 = (C2479) ((C0094) this.f1404).f1049;
                c2479.reset();
                C1867 c1868 = (C1867) this.f1405;
                c2479.mark(5242880);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        boolean zMo2563 = ((InterfaceC1607) list2.get(i2)).mo2563(c2479, c1868);
                        c2479.reset();
                        if (zMo2563) {
                            return true;
                        }
                    } catch (Throwable th2) {
                        c2479.reset();
                        throw th2;
                    }
                }
                return false;
            default:
                List list3 = (List) this.f1405;
                C0019 c0019 = (C0019) this.f1406;
                C1867 c1869 = (C1867) this.f1404;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC1607 interfaceC1607 = (InterfaceC1607) list3.get(i3);
                    C2479 c24710 = null;
                    try {
                        C2479 c24711 = new C2479(new FileInputStream(c0019.m609().getFileDescriptor()), c1869);
                        try {
                            boolean zMo2564 = interfaceC1607.mo2563(c24711, c1869);
                            c24711.m4432();
                            c0019.m609();
                            if (zMo2564) {
                                return true;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c24710 = c24711;
                            if (c24710 != null) {
                                c24710.m4432();
                            }
                            c0019.m609();
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
    public boolean m1326(C0784 c0784, C0793 c0793, int i) {
        C0407 c0407 = (C0407) this.f1405;
        int[] iArr = c0793.f3134;
        int[] iArr2 = c0793.f3086;
        c0407.f1910 = iArr[0];
        c0407.f1911 = iArr[1];
        c0407.f1912 = c0793.m2316();
        c0407.f1913 = c0793.m2313();
        c0407.f1918 = false;
        c0407.f1919 = i;
        boolean z = c0407.f1910 == 3;
        boolean z2 = c0407.f1911 == 3;
        boolean z3 = z && c0793.f3115 > 0.0f;
        boolean z4 = z2 && c0793.f3115 > 0.0f;
        if (z3 && iArr2[0] == 4) {
            c0407.f1910 = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c0407.f1911 = 1;
        }
        c0784.m2293(c0793, c0407);
        c0793.m2334(c0407.f1914);
        c0793.m2331(c0407.f1915);
        c0793.f3097 = c0407.f1917;
        c0793.m2328(c0407.f1916);
        c0407.f1919 = 0;
        return c0407.f1918;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public C0243 m1327(C0243 c0243, int i, int i2) {
        C1660 c1660 = (C1660) this.f1406;
        AbstractC1834 abstractC1834 = (AbstractC1834) this.f1404;
        C1835 c1835Mo3593 = abstractC1834.mo3593((AbstractC1834) c0243.f1404, i2);
        C1242 c1242 = (C1242) this.f1405;
        C1242 c1243 = (C1242) c0243.f1405;
        c1242.getClass();
        try {
            C1242 c1242M2987 = AbstractC1270.m2987(c1242, c1243);
            C1660 c1660M3385 = ((C1660) c0243.f1406).m3385();
            c1660M3385.m3382(i);
            c1660M3385.f6944 = false;
            if (c1835Mo3593 == abstractC1834 && c1242M2987 == c1242 && c1660.equals(c1660M3385)) {
                return this;
            }
            if (!c1660.equals(c1660M3385)) {
                if (c1660.f5610 <= c1660M3385.f5610) {
                    c1660 = c1660M3385;
                    c1660M3385 = c1660;
                }
                int i3 = c1660.f5610;
                int i4 = c1660M3385.f5610;
                for (int i5 = i4 - 1; i5 >= 0; i5--) {
                    if (c1660M3385.m3384(i5) != c1660.m3384((i3 - i4) + i5)) {
                        throw new RuntimeException("Incompatible merged subroutines");
                    }
                }
            }
            return new C0243(c1835Mo3593, c1242M2987, c1660);
        } catch (C2704 e) {
            e.m2885("underlay stack:");
            c1242.m2895(e);
            e.m2885("overlay stack:");
            c1243.m2895(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public Object m1328(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC1171 interfaceC1171) {
        int i4;
        char c;
        C0298 c0298 = new C0298((C1970) ((C2103) this.f1405).f6937);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMo1880 = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zMo1880) {
                    SparseArray sparseArray = ((C1970) c0298.f1513).f6539;
                    C1970 c1970 = sparseArray == null ? null : (C1970) sparseArray.get(iCodePointAt);
                    if (c0298.f1509 == 2) {
                        if (c1970 != null) {
                            c0298.f1513 = c1970;
                            c0298.f1511++;
                        } else {
                            if (iCodePointAt == 65038) {
                                c0298.m1404();
                            } else if (iCodePointAt != 65039) {
                                C1970 c1971 = (C1970) c0298.f1513;
                                if (c1971.f6540 != null) {
                                    if (c0298.f1511 != 1) {
                                        c0298.f1514 = c1971;
                                        c0298.m1404();
                                    } else if (c0298.m1405()) {
                                        c0298.f1514 = (C1970) c0298.f1513;
                                        c0298.m1404();
                                    } else {
                                        c0298.m1404();
                                    }
                                    c = 3;
                                } else {
                                    c0298.m1404();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (c1970 == null) {
                        c0298.m1404();
                        c = 1;
                    } else {
                        c0298.f1509 = 2;
                        c0298.f1513 = c1970;
                        c0298.f1511 = 1;
                        c = 2;
                    }
                    c0298.f1510 = iCodePointAt;
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
                        if (!z && m1324(charSequence, i4, iCharCount, ((C1970) c0298.f1514).f6540)) {
                            break;
                        }
                        zMo1880 = interfaceC1171.mo1880(charSequence, i4, iCharCount, ((C1970) c0298.f1514).f6540);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (c0298.f1509 == 2 && ((C1970) c0298.f1513).f6540 != null && ((c0298.f1511 > 1 || c0298.m1405()) && i5 < i3 && zMo1880 && (z || !m1324(charSequence, i4, iCharCount, ((C1970) c0298.f1513).f6540)))) {
            interfaceC1171.mo1880(charSequence, i4, iCharCount, ((C1970) c0298.f1513).f6540);
        }
        return interfaceC1171.getResult();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public void m1329() {
        ((TypedArray) this.f1404).recycle();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public void m1330(C0794 c0794, int i, int i2) {
        int i3 = c0794.f3120;
        int i4 = c0794.f3121;
        c0794.f3120 = 0;
        c0794.f3121 = 0;
        c0794.m2334(i);
        c0794.m2331(i2);
        if (i3 < 0) {
            c0794.f3120 = 0;
        } else {
            c0794.f3120 = i3;
        }
        if (i4 < 0) {
            c0794.f3121 = 0;
        } else {
            c0794.f3121 = i4;
        }
        ((C0794) this.f1406).m2342();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public void m1331(C0794 c0794) {
        ArrayList arrayList = (ArrayList) this.f1404;
        arrayList.clear();
        int size = c0794.f3135.size();
        for (int i = 0; i < size; i++) {
            C0793 c0793 = (C0793) c0794.f3135.get(i);
            int[] iArr = c0793.f3134;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0793);
            }
        }
        c0794.f3137.f3694 = true;
    }

    public /* synthetic */ C0243(Object obj, Object obj2, Object obj3, int i) {
        this.f1403 = i;
        this.f1404 = obj;
        this.f1405 = obj2;
        this.f1406 = obj3;
    }

    public C0243() {
        this.f1403 = 1;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0142(0));
        this.f1404 = new HashMap();
        this.f1405 = new ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new RunnableC0141(1, this));
    }

    public C0243(LinearLayout linearLayout, MaterialRadioButton materialRadioButton, MaterialRadioButton materialRadioButton2, RadioGroup radioGroup) {
        this.f1403 = 18;
        this.f1404 = materialRadioButton;
        this.f1405 = materialRadioButton2;
        this.f1406 = radioGroup;
    }

    public C0243(C0662 c0662) {
        this.f1403 = 3;
        C0404 c0404 = (C0404) c0662.f2530;
        int iM3506 = c0404.m3506();
        this.f1404 = new C0734[iM3506];
        this.f1405 = new C0734[iM3506];
        this.f1406 = new C0734[iM3506];
        int length = c0404.f4836.length;
        for (int i = 0; i < length; i++) {
            C0402 c0402 = (C0402) c0404.m3062(i);
            C0442 c0442 = c0402.f1898;
            int i2 = c0402.f1897;
            ((C0734[]) this.f1404)[i2] = new C0734(((AbstractC1649) c0442.m3062(0)).f5589, false);
            C2788 c2788 = c0442.m1645().f5589;
            ((C0734[]) this.f1405)[i2] = new C0734(c2788, false);
            ((C0734[]) this.f1406)[i2] = new C0734(c2788, false);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    private final void m1309() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    private final void m1310() {
    }

    public C0243(C0662 c0662, int[] iArr, C0243 c0243) {
        this.f1403 = 21;
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (c0243 != null) {
            this.f1404 = c0662;
            this.f1405 = iArr;
            this.f1406 = c0243;
            return;
        }
        throw new NullPointerException("addresses == null");
    }

    public C0243(LinearLayout linearLayout, MaterialButton materialButton, TextInputEditText textInputEditText, MaterialRadioButton materialRadioButton, MaterialRadioButton materialRadioButton2, RadioGroup radioGroup, RecyclerView recyclerView) {
        this.f1403 = 19;
        this.f1404 = textInputEditText;
        this.f1405 = materialRadioButton;
        this.f1406 = materialRadioButton2;
    }

    public C0243(AbstractC1834 abstractC1834, C1242 c1242, C1660 c1660) {
        this.f1403 = 12;
        if (abstractC1834 == null) {
            throw new NullPointerException("locals == null");
        }
        if (c1242 != null) {
            c1660.m3926();
            this.f1404 = abstractC1834;
            this.f1405 = c1242;
            this.f1406 = c1660;
            return;
        }
        throw new NullPointerException("stack == null");
    }

    public C0243(Context context, TypedArray typedArray) {
        this.f1403 = 22;
        this.f1406 = context;
        this.f1404 = typedArray;
    }

    public C0243(C0794 c0794) {
        this.f1403 = 2;
        this.f1404 = new ArrayList();
        this.f1405 = new C0407();
        this.f1406 = c0794;
    }

    public C0243(Context context) {
        this.f1403 = 0;
        this.f1406 = context.getApplicationContext();
        this.f1405 = new HashSet();
        this.f1404 = new HashMap();
    }

    public C0243(C0243 c0243, C1752 c1752, C1752 c1753) {
        this.f1403 = 13;
        c0243.getClass();
        this.f1404 = c1752;
        this.f1405 = c1753;
        this.f1406 = (C0243) c0243.f1406;
    }

    public C0243(String str, InterfaceC1414 interfaceC1414) {
        this.f1403 = 17;
        this.f1404 = str;
        this.f1405 = interfaceC1414;
    }

    public C0243(C2103 c2103, C0373 c0373, C0986 c0986, Set set) {
        this.f1403 = 8;
        this.f1404 = c0373;
        this.f1405 = c2103;
        this.f1406 = c0986;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m1328(str, 0, str.length(), 1, true, new C1172(str, 0));
        }
    }

    public C0243(C2380 c2380, InterfaceC1261 interfaceC1261, C1227 c1227) {
        this.f1403 = 10;
        this.f1406 = c2380;
        this.f1404 = interfaceC1261;
        this.f1405 = c1227;
    }

    public C0243(C1899 c1899, ArrayList arrayList, C1867 c1867) {
        this.f1403 = 15;
        AbstractC1460.m3210(c1867, "Argument must not be null");
        this.f1405 = c1867;
        AbstractC1460.m3210(arrayList, "Argument must not be null");
        this.f1406 = arrayList;
        this.f1404 = new C0094(c1899, c1867);
    }

    public C0243(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C1867 c1867) {
        this.f1403 = 16;
        AbstractC1460.m3210(c1867, "Argument must not be null");
        this.f1404 = c1867;
        AbstractC1460.m3210(arrayList, "Argument must not be null");
        this.f1405 = arrayList;
        this.f1406 = new C0019(parcelFileDescriptor);
    }

    public C0243(C1216 c1216, C2708 c2708, C1220 c1220) {
        this.f1403 = 9;
        this.f1406 = c1216;
        this.f1405 = c2708;
        this.f1404 = c1220;
    }
}
