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
import com.bumptech.glide.load.data.Ujhhgtgfeyxiexzf;
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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2366Ujhhgtgfeyxiexzf implements InterfaceC0891feyxiexzfUjhhgtg, InterfaceC1445feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static volatile C2366Ujhhgtgfeyxiexzf f7711Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final Object f7712Ujhhgtgfeyxiexzf = new Object();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7713Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f7714Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public Object f7715Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Object f7716Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2366Ujhhgtgfeyxiexzf(int i) {
        this.f7713Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static boolean m3590Ujhhgtgfeyxiexzf(Editable editable, KeyEvent keyEvent, boolean z) {
        C1777feyxiexzfUjhhgtg[] c1777feyxiexzfUjhhgtgArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c1777feyxiexzfUjhhgtgArr = (C1777feyxiexzfUjhhgtg[]) editable.getSpans(selectionStart, selectionEnd, C1777feyxiexzfUjhhgtg.class)) != null && c1777feyxiexzfUjhhgtgArr.length > 0) {
                for (C1777feyxiexzfUjhhgtg c1777feyxiexzfUjhhgtg : c1777feyxiexzfUjhhgtgArr) {
                    int spanStart = editable.getSpanStart(c1777feyxiexzfUjhhgtg);
                    int spanEnd = editable.getSpanEnd(c1777feyxiexzfUjhhgtg);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static C2366Ujhhgtgfeyxiexzf m3591Ujhhgtgfeyxiexzf(Context context) {
        if (f7711Ujhhgtgfeyxiexzf == null) {
            synchronized (f7712Ujhhgtgfeyxiexzf) {
                try {
                    if (f7711Ujhhgtgfeyxiexzf == null) {
                        f7711Ujhhgtgfeyxiexzf = new C2366Ujhhgtgfeyxiexzf(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7711Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static C2366Ujhhgtgfeyxiexzf m3592Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C2366Ujhhgtgfeyxiexzf(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static C2366Ujhhgtgfeyxiexzf m3593Ujhhgtgfeyxiexzf(C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf, C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf, C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf2) {
        if (c2366Ujhhgtgfeyxiexzf == null) {
            return null;
        }
        C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf3 = (C0154Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf;
        C2366Ujhhgtgfeyxiexzf c2366UjhhgtgfeyxiexzfM3593Ujhhgtgfeyxiexzf = m3593Ujhhgtgfeyxiexzf((C2366Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf, c0154Ujhhgtgfeyxiexzf, c0154Ujhhgtgfeyxiexzf2);
        c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf = c2366UjhhgtgfeyxiexzfM3593Ujhhgtgfeyxiexzf;
        int i = c0154Ujhhgtgfeyxiexzf3.f1319Ujhhgtgfeyxiexzf;
        C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf4 = (C0154Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7715Ujhhgtgfeyxiexzf;
        int i2 = c0154Ujhhgtgfeyxiexzf4.f1319Ujhhgtgfeyxiexzf;
        int i3 = c0154Ujhhgtgfeyxiexzf.f1319Ujhhgtgfeyxiexzf;
        int i4 = c0154Ujhhgtgfeyxiexzf2 == null ? Integer.MAX_VALUE : c0154Ujhhgtgfeyxiexzf2.f1319Ujhhgtgfeyxiexzf;
        if (i3 >= i2 || i4 <= i) {
            return c2366Ujhhgtgfeyxiexzf;
        }
        if (i3 <= i) {
            return i4 >= i2 ? c2366UjhhgtgfeyxiexzfM3593Ujhhgtgfeyxiexzf : new C2366Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, c0154Ujhhgtgfeyxiexzf2, c0154Ujhhgtgfeyxiexzf4);
        }
        if (i4 >= i2) {
            return new C2366Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, c0154Ujhhgtgfeyxiexzf3, c0154Ujhhgtgfeyxiexzf);
        }
        c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf = new C2366Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, c0154Ujhhgtgfeyxiexzf2, c0154Ujhhgtgfeyxiexzf4);
        return new C2366Ujhhgtgfeyxiexzf(c2366Ujhhgtgfeyxiexzf, c0154Ujhhgtgfeyxiexzf3, c0154Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC1445feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public boolean mo2932Ujhhgtgfeyxiexzf(Object obj) {
        if (obj instanceof InterfaceC3508feyxiexzfUjhhgtg) {
            ((InterfaceC3508feyxiexzfUjhhgtg) obj).mo1443Ujhhgtgfeyxiexzf().f4282Ujhhgtgfeyxiexzf = true;
        }
        switch (((C3339feyxiexzfUjhhgtg) this.f7715Ujhhgtgfeyxiexzf).f10440Ujhhgtgfeyxiexzf) {
            case 4:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((C1440feyxiexzfUjhhgtg) this.f7716Ujhhgtgfeyxiexzf).mo2932Ujhhgtgfeyxiexzf(obj);
    }

    @Override // p000.InterfaceC1445feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public Object mo2933Ujhhgtgfeyxiexzf() {
        Object objMo2933Ujhhgtgfeyxiexzf = ((C1440feyxiexzfUjhhgtg) this.f7716Ujhhgtgfeyxiexzf).mo2933Ujhhgtgfeyxiexzf();
        if (objMo2933Ujhhgtgfeyxiexzf == null) {
            objMo2933Ujhhgtgfeyxiexzf = ((InterfaceC3507feyxiexzfUjhhgtg) this.f7714Ujhhgtgfeyxiexzf).mo1740Ujhhgtgfeyxiexzf();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objMo2933Ujhhgtgfeyxiexzf.getClass());
            }
        }
        if (objMo2933Ujhhgtgfeyxiexzf instanceof InterfaceC3508feyxiexzfUjhhgtg) {
            ((InterfaceC3508feyxiexzfUjhhgtg) objMo2933Ujhhgtgfeyxiexzf).mo1443Ujhhgtgfeyxiexzf().f4282Ujhhgtgfeyxiexzf = false;
        }
        return objMo2933Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public synchronized void m3596Ujhhgtgfeyxiexzf(InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, C3368Ujhhgtgfeyxiexzf c3368Ujhhgtgfeyxiexzf) {
        C3014Ujhhgtgfeyxiexzf c3014Ujhhgtgfeyxiexzf = (C3014Ujhhgtgfeyxiexzf) ((HashMap) this.f7714Ujhhgtgfeyxiexzf).put(interfaceC0156Ujhhgtgfeyxiexzf, new C3014Ujhhgtgfeyxiexzf(interfaceC0156Ujhhgtgfeyxiexzf, c3368Ujhhgtgfeyxiexzf, (ReferenceQueue) this.f7715Ujhhgtgfeyxiexzf));
        if (c3014Ujhhgtgfeyxiexzf != null) {
            c3014Ujhhgtgfeyxiexzf.f9367Ujhhgtgfeyxiexzf = null;
            c3014Ujhhgtgfeyxiexzf.clear();
        }
    }

    @Override // p000.InterfaceC0891feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public InterfaceC0901feyxiexzfUjhhgtg mo2369Ujhhgtgfeyxiexzf(InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        Drawable drawable = (Drawable) interfaceC0901feyxiexzfUjhhgtg.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C2501feyxiexzfUjhhgtg) this.f7715Ujhhgtgfeyxiexzf).mo2369Ujhhgtgfeyxiexzf(C2511feyxiexzfUjhhgtg.m3790Ujhhgtgfeyxiexzf((InterfaceC2512feyxiexzfUjhhgtg) this.f7714Ujhhgtgfeyxiexzf, ((BitmapDrawable) drawable).getBitmap()), c1471feyxiexzfUjhhgtg);
        }
        if (drawable instanceof C3571feyxiexzfUjhhgtg) {
            return ((C3339feyxiexzfUjhhgtg) this.f7716Ujhhgtgfeyxiexzf).mo2369Ujhhgtgfeyxiexzf(interfaceC0901feyxiexzfUjhhgtg, c1471feyxiexzfUjhhgtg);
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public void m3597Ujhhgtgfeyxiexzf(C3014Ujhhgtgfeyxiexzf c3014Ujhhgtgfeyxiexzf) {
        InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg;
        synchronized (this) {
            ((HashMap) this.f7714Ujhhgtgfeyxiexzf).remove(c3014Ujhhgtgfeyxiexzf.f9365Ujhhgtgfeyxiexzf);
            if (c3014Ujhhgtgfeyxiexzf.f9366Ujhhgtgfeyxiexzf && (interfaceC0901feyxiexzfUjhhgtg = c3014Ujhhgtgfeyxiexzf.f9367Ujhhgtgfeyxiexzf) != null) {
                ((C3334feyxiexzfUjhhgtg) this.f7716Ujhhgtgfeyxiexzf).m4824Ujhhgtgfeyxiexzf(c3014Ujhhgtgfeyxiexzf.f9365Ujhhgtgfeyxiexzf, new C3368Ujhhgtgfeyxiexzf(interfaceC0901feyxiexzfUjhhgtg, true, false, c3014Ujhhgtgfeyxiexzf.f9365Ujhhgtgfeyxiexzf, (C3334feyxiexzfUjhhgtg) this.f7716Ujhhgtgfeyxiexzf));
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Bitmap m3598Ujhhgtgfeyxiexzf(BitmapFactory.Options options) throws Throwable {
        switch (this.f7713Ujhhgtgfeyxiexzf) {
            case Opcodes.DCONST_0 /* 14 */:
                return AbstractC3594Ujhhgtgfeyxiexzf.m5171Ujhhgtgfeyxiexzf(new C2647Ujhhgtgfeyxiexzf(AbstractC2648Ujhhgtgfeyxiexzf.m3980Ujhhgtgfeyxiexzf((ByteBuffer) this.f7714Ujhhgtgfeyxiexzf)), options, this);
            case 15:
                C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg = (C0790feyxiexzfUjhhgtg) ((C2965Ujhhgtgfeyxiexzf) this.f7714Ujhhgtgfeyxiexzf).f9276Ujhhgtgfeyxiexzf;
                c0790feyxiexzfUjhhgtg.reset();
                return AbstractC3594Ujhhgtgfeyxiexzf.m5171Ujhhgtgfeyxiexzf(c0790feyxiexzfUjhhgtg, options, this);
            default:
                FileDescriptor fileDescriptor = ((Ujhhgtgfeyxiexzf) this.f7716Ujhhgtgfeyxiexzf).m751Ujhhgtgfeyxiexzf().getFileDescriptor();
                int i = Build.VERSION.SDK_INT;
                Bitmap bitmapM5193feyxiexzfUjhhgtg = null;
                if (i == 34) {
                    if (((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) AbstractC1791feyxiexzfUjhhgtg.f6031Ujhhgtgfeyxiexzf.get()).booleanValue() : false) && AbstractC3594Ujhhgtgfeyxiexzf.m5181Ujhhgtgfeyxiexzf(this)) {
                        Bitmap.Config config = options.inPreferredConfig;
                        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                        AbstractC3593Ujhhgtgfeyxiexzf.m5149Ujhhgtgfeyxiexzf("", config == config2);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        try {
                            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                            if (bitmapDecodeFileDescriptor == null) {
                                if (bitmapDecodeFileDescriptor != null) {
                                }
                                options.inPreferredConfig = config2;
                                return bitmapM5193feyxiexzfUjhhgtg;
                            }
                            try {
                                bitmapM5193feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5193feyxiexzfUjhhgtg(bitmapDecodeFileDescriptor);
                            } catch (Throwable th) {
                                th = th;
                                bitmapM5193feyxiexzfUjhhgtg = bitmapDecodeFileDescriptor;
                                if (bitmapM5193feyxiexzfUjhhgtg != null) {
                                    bitmapM5193feyxiexzfUjhhgtg.recycle();
                                }
                                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                throw th;
                            }
                            break;
                            bitmapDecodeFileDescriptor.recycle();
                            options.inPreferredConfig = config2;
                            return bitmapM5193feyxiexzfUjhhgtg;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public void m3599Ujhhgtgfeyxiexzf(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f7715Ujhhgtgfeyxiexzf;
        String string = ((Context) this.f7716Ujhhgtgfeyxiexzf).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC0651Ujhhgtgfeyxiexzf.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m3600Ujhhgtgfeyxiexzf((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C2870Ujhhgtgfeyxiexzf(e);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public Object m3600Ujhhgtgfeyxiexzf(Class cls, HashSet hashSet) {
        boolean zBooleanValue;
        Object objMo93Ujhhgtgfeyxiexzf;
        HashMap map = (HashMap) this.f7714Ujhhgtgfeyxiexzf;
        if (Build.VERSION.SDK_INT >= 29) {
            zBooleanValue = AbstractC1758feyxiexzfUjhhgtg.m3052Ujhhgtgfeyxiexzf();
        } else {
            try {
                if (AbstractC1252feyxiexzfUjhhgtg.f4606Ujhhgtgfeyxiexzf == null) {
                    AbstractC1252feyxiexzfUjhhgtg.f4605Ujhhgtgfeyxiexzf = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC1252feyxiexzfUjhhgtg.f4606Ujhhgtgfeyxiexzf = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                zBooleanValue = ((Boolean) AbstractC1252feyxiexzfUjhhgtg.f4606Ujhhgtgfeyxiexzf.invoke(null, Long.valueOf(AbstractC1252feyxiexzfUjhhgtg.f4605Ujhhgtgfeyxiexzf))).booleanValue();
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
                AbstractC1252feyxiexzfUjhhgtg.m2781Ujhhgtgfeyxiexzf(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo93Ujhhgtgfeyxiexzf = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0651Ujhhgtgfeyxiexzf interfaceC0651Ujhhgtgfeyxiexzf = (InterfaceC0651Ujhhgtgfeyxiexzf) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo92Ujhhgtgfeyxiexzf = interfaceC0651Ujhhgtgfeyxiexzf.mo92Ujhhgtgfeyxiexzf();
                if (!listMo92Ujhhgtgfeyxiexzf.isEmpty()) {
                    for (Class cls2 : listMo92Ujhhgtgfeyxiexzf) {
                        if (!map.containsKey(cls2)) {
                            m3600Ujhhgtgfeyxiexzf(cls2, hashSet);
                        }
                    }
                }
                objMo93Ujhhgtgfeyxiexzf = interfaceC0651Ujhhgtgfeyxiexzf.mo93Ujhhgtgfeyxiexzf((Context) this.f7716Ujhhgtgfeyxiexzf);
                hashSet.remove(cls);
                map.put(cls, objMo93Ujhhgtgfeyxiexzf);
            } catch (Throwable th2) {
                throw new C2870Ujhhgtgfeyxiexzf(th2);
            }
        }
        Trace.endSection();
        return objMo93Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public ColorStateList m3601Ujhhgtgfeyxiexzf(int i) {
        int resourceId;
        ColorStateList colorStateListM4559Ujhhgtgfeyxiexzf;
        TypedArray typedArray = (TypedArray) this.f7714Ujhhgtgfeyxiexzf;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM4559Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4559Ujhhgtgfeyxiexzf((Context) this.f7716Ujhhgtgfeyxiexzf, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM4559Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public Drawable m3602Ujhhgtgfeyxiexzf(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f7714Ujhhgtgfeyxiexzf;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC1265feyxiexzfUjhhgtg.m2824Ujhhgtgfeyxiexzf((Context) this.f7716Ujhhgtgfeyxiexzf, resourceId);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Typeface m3603Ujhhgtgfeyxiexzf(int i, int i2, C2350Ujhhgtgfeyxiexzf c2350Ujhhgtgfeyxiexzf) {
        int resourceId = ((TypedArray) this.f7714Ujhhgtgfeyxiexzf).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f7715Ujhhgtgfeyxiexzf) == null) {
            this.f7715Ujhhgtgfeyxiexzf = new TypedValue();
        }
        Context context = (Context) this.f7716Ujhhgtgfeyxiexzf;
        TypedValue typedValue = (TypedValue) this.f7715Ujhhgtgfeyxiexzf;
        ThreadLocal threadLocal = AbstractC0888feyxiexzfUjhhgtg.f3430Ujhhgtgfeyxiexzf;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0888feyxiexzfUjhhgtg.m2367Ujhhgtgfeyxiexzf(context, resourceId, typedValue, i2, c2350Ujhhgtgfeyxiexzf, true, false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public ImageHeaderParser$ImageType m3604Ujhhgtgfeyxiexzf() throws Throwable {
        switch (this.f7713Ujhhgtgfeyxiexzf) {
            case Opcodes.DCONST_0 /* 14 */:
                return AbstractC1243feyxiexzfUjhhgtg.m2738Ujhhgtgfeyxiexzf((List) this.f7715Ujhhgtgfeyxiexzf, AbstractC2648Ujhhgtgfeyxiexzf.m3980Ujhhgtgfeyxiexzf((ByteBuffer) this.f7714Ujhhgtgfeyxiexzf));
            case 15:
                List list = (List) this.f7716Ujhhgtgfeyxiexzf;
                C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg = (C0790feyxiexzfUjhhgtg) ((C2965Ujhhgtgfeyxiexzf) this.f7714Ujhhgtgfeyxiexzf).f9276Ujhhgtgfeyxiexzf;
                c0790feyxiexzfUjhhgtg.reset();
                return AbstractC1243feyxiexzfUjhhgtg.m2737Ujhhgtgfeyxiexzf(list, c0790feyxiexzfUjhhgtg, (C0271Ujhhgtgfeyxiexzf) this.f7715Ujhhgtgfeyxiexzf);
            default:
                List list2 = (List) this.f7715Ujhhgtgfeyxiexzf;
                Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = (Ujhhgtgfeyxiexzf) this.f7716Ujhhgtgfeyxiexzf;
                C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = (C0271Ujhhgtgfeyxiexzf) this.f7714Ujhhgtgfeyxiexzf;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC0751Ujhhgtgfeyxiexzf interfaceC0751Ujhhgtgfeyxiexzf = (InterfaceC0751Ujhhgtgfeyxiexzf) list2.get(i);
                    C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg2 = null;
                    try {
                        C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg3 = new C0790feyxiexzfUjhhgtg(new FileInputStream(ujhhgtgfeyxiexzf.m751Ujhhgtgfeyxiexzf().getFileDescriptor()), c0271Ujhhgtgfeyxiexzf);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo2090Ujhhgtgfeyxiexzf = interfaceC0751Ujhhgtgfeyxiexzf.mo2090Ujhhgtgfeyxiexzf(c0790feyxiexzfUjhhgtg3);
                            c0790feyxiexzfUjhhgtg3.m2123Ujhhgtgfeyxiexzf();
                            ujhhgtgfeyxiexzf.m751Ujhhgtgfeyxiexzf();
                            if (imageHeaderParser$ImageTypeMo2090Ujhhgtgfeyxiexzf != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo2090Ujhhgtgfeyxiexzf;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c0790feyxiexzfUjhhgtg2 = c0790feyxiexzfUjhhgtg3;
                            if (c0790feyxiexzfUjhhgtg2 != null) {
                                c0790feyxiexzfUjhhgtg2.m2123Ujhhgtgfeyxiexzf();
                            }
                            ujhhgtgfeyxiexzf.m751Ujhhgtgfeyxiexzf();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public Class m3605Ujhhgtgfeyxiexzf() {
        InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg = (InterfaceC3545feyxiexzfUjhhgtg) this.f7715Ujhhgtgfeyxiexzf;
        Object obj = this.f7714Ujhhgtgfeyxiexzf;
        if (((Class) this.f7716Ujhhgtgfeyxiexzf) == null) {
            if (!(obj instanceof String)) {
                throw new IllegalStateException(("Unknown lazy class type \"" + obj + "\"").toString());
            }
            this.f7716Ujhhgtgfeyxiexzf = AbstractC2842feyxiexzfUjhhgtg.m4167Ujhhgtgfeyxiexzf(interfaceC3545feyxiexzfUjhhgtg != null ? (ClassLoader) interfaceC3545feyxiexzfUjhhgtg.invoke() : null, (String) obj);
        }
        Class cls = (Class) this.f7716Ujhhgtgfeyxiexzf;
        if (cls != null) {
            return cls;
        }
        throw new IllegalStateException("Exception has been thrown above.");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean m3606Ujhhgtgfeyxiexzf(CharSequence charSequence, int i, int i2, C1776feyxiexzfUjhhgtg c1776feyxiexzfUjhhgtg) {
        if ((c1776feyxiexzfUjhhgtg.f5955Ujhhgtgfeyxiexzf & 3) == 0) {
            InterfaceC3388feyxiexzfUjhhgtg interfaceC3388feyxiexzfUjhhgtg = (InterfaceC3388feyxiexzfUjhhgtg) this.f7716Ujhhgtgfeyxiexzf;
            C0379Ujhhgtgfeyxiexzf c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf = c1776feyxiexzfUjhhgtg.m3098Ujhhgtgfeyxiexzf();
            int iM1223Ujhhgtgfeyxiexzf = c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.m1223Ujhhgtgfeyxiexzf(8);
            if (iM1223Ujhhgtgfeyxiexzf != 0) {
                ((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).getShort(iM1223Ujhhgtgfeyxiexzf + c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf);
            }
            C3130Ujhhgtgfeyxiexzf c3130Ujhhgtgfeyxiexzf = (C3130Ujhhgtgfeyxiexzf) interfaceC3388feyxiexzfUjhhgtg;
            c3130Ujhhgtgfeyxiexzf.getClass();
            ThreadLocal threadLocal = C3130Ujhhgtgfeyxiexzf.f9722Ujhhgtgfeyxiexzf;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = c3130Ujhhgtgfeyxiexzf.f9723Ujhhgtgfeyxiexzf.hasGlyph(sb.toString());
            int i3 = c1776feyxiexzfUjhhgtg.f5955Ujhhgtgfeyxiexzf & 4;
            c1776feyxiexzfUjhhgtg.f5955Ujhhgtgfeyxiexzf = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (c1776feyxiexzfUjhhgtg.f5955Ujhhgtgfeyxiexzf & 3) == 2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean m3607Ujhhgtgfeyxiexzf() {
        switch (this.f7713Ujhhgtgfeyxiexzf) {
            case Opcodes.DCONST_0 /* 14 */:
                List list = (List) this.f7715Ujhhgtgfeyxiexzf;
                ByteBuffer byteBufferM3980Ujhhgtgfeyxiexzf = AbstractC2648Ujhhgtgfeyxiexzf.m3980Ujhhgtgfeyxiexzf((ByteBuffer) this.f7714Ujhhgtgfeyxiexzf);
                C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = (C0271Ujhhgtgfeyxiexzf) this.f7716Ujhhgtgfeyxiexzf;
                if (byteBufferM3980Ujhhgtgfeyxiexzf == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        boolean zMo2088Ujhhgtgfeyxiexzf = ((InterfaceC0751Ujhhgtgfeyxiexzf) list.get(i)).mo2088Ujhhgtgfeyxiexzf(byteBufferM3980Ujhhgtgfeyxiexzf, c0271Ujhhgtgfeyxiexzf);
                        if (zMo2088Ujhhgtgfeyxiexzf) {
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return false;
            case 15:
                List list2 = (List) this.f7716Ujhhgtgfeyxiexzf;
                C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg = (C0790feyxiexzfUjhhgtg) ((C2965Ujhhgtgfeyxiexzf) this.f7714Ujhhgtgfeyxiexzf).f9276Ujhhgtgfeyxiexzf;
                c0790feyxiexzfUjhhgtg.reset();
                C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf2 = (C0271Ujhhgtgfeyxiexzf) this.f7715Ujhhgtgfeyxiexzf;
                c0790feyxiexzfUjhhgtg.mark(5242880);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        boolean zMo2092Ujhhgtgfeyxiexzf = ((InterfaceC0751Ujhhgtgfeyxiexzf) list2.get(i2)).mo2092Ujhhgtgfeyxiexzf(c0790feyxiexzfUjhhgtg, c0271Ujhhgtgfeyxiexzf2);
                        c0790feyxiexzfUjhhgtg.reset();
                        if (zMo2092Ujhhgtgfeyxiexzf) {
                            return true;
                        }
                    } catch (Throwable th2) {
                        c0790feyxiexzfUjhhgtg.reset();
                        throw th2;
                    }
                }
                return false;
            default:
                List list3 = (List) this.f7715Ujhhgtgfeyxiexzf;
                Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = (Ujhhgtgfeyxiexzf) this.f7716Ujhhgtgfeyxiexzf;
                C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf3 = (C0271Ujhhgtgfeyxiexzf) this.f7714Ujhhgtgfeyxiexzf;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC0751Ujhhgtgfeyxiexzf interfaceC0751Ujhhgtgfeyxiexzf = (InterfaceC0751Ujhhgtgfeyxiexzf) list3.get(i3);
                    C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg2 = null;
                    try {
                        C0790feyxiexzfUjhhgtg c0790feyxiexzfUjhhgtg3 = new C0790feyxiexzfUjhhgtg(new FileInputStream(ujhhgtgfeyxiexzf.m751Ujhhgtgfeyxiexzf().getFileDescriptor()), c0271Ujhhgtgfeyxiexzf3);
                        try {
                            boolean zMo2092Ujhhgtgfeyxiexzf2 = interfaceC0751Ujhhgtgfeyxiexzf.mo2092Ujhhgtgfeyxiexzf(c0790feyxiexzfUjhhgtg3, c0271Ujhhgtgfeyxiexzf3);
                            c0790feyxiexzfUjhhgtg3.m2123Ujhhgtgfeyxiexzf();
                            ujhhgtgfeyxiexzf.m751Ujhhgtgfeyxiexzf();
                            if (zMo2092Ujhhgtgfeyxiexzf2) {
                                return true;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c0790feyxiexzfUjhhgtg2 = c0790feyxiexzfUjhhgtg3;
                            if (c0790feyxiexzfUjhhgtg2 != null) {
                                c0790feyxiexzfUjhhgtg2.m2123Ujhhgtgfeyxiexzf();
                            }
                            ujhhgtgfeyxiexzf.m751Ujhhgtgfeyxiexzf();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean m3608Ujhhgtgfeyxiexzf(C3646Ujhhgtgfeyxiexzf c3646Ujhhgtgfeyxiexzf, C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf, int i) {
        C2493feyxiexzfUjhhgtg c2493feyxiexzfUjhhgtg = (C2493feyxiexzfUjhhgtg) this.f7715Ujhhgtgfeyxiexzf;
        int[] iArr = c3655Ujhhgtgfeyxiexzf.f11631Ujhhgtgfeyxiexzf;
        int[] iArr2 = c3655Ujhhgtgfeyxiexzf.f11583Ujhhgtgfeyxiexzf;
        c2493feyxiexzfUjhhgtg.f8142Ujhhgtgfeyxiexzf = iArr[0];
        c2493feyxiexzfUjhhgtg.f8143Ujhhgtgfeyxiexzf = iArr[1];
        c2493feyxiexzfUjhhgtg.f8144Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf.m5329Ujhhgtgfeyxiexzf();
        c2493feyxiexzfUjhhgtg.f8145Ujhhgtgfeyxiexzf = c3655Ujhhgtgfeyxiexzf.m5326Ujhhgtgfeyxiexzf();
        c2493feyxiexzfUjhhgtg.f8150Ujhhgtgfeyxiexzf = false;
        c2493feyxiexzfUjhhgtg.f8151Ujhhgtgfeyxiexzf = i;
        boolean z = c2493feyxiexzfUjhhgtg.f8142Ujhhgtgfeyxiexzf == 3;
        boolean z2 = c2493feyxiexzfUjhhgtg.f8143Ujhhgtgfeyxiexzf == 3;
        boolean z3 = z && c3655Ujhhgtgfeyxiexzf.f11612feyxiexzfUjhhgtg > 0.0f;
        boolean z4 = z2 && c3655Ujhhgtgfeyxiexzf.f11612feyxiexzfUjhhgtg > 0.0f;
        if (z3 && iArr2[0] == 4) {
            c2493feyxiexzfUjhhgtg.f8142Ujhhgtgfeyxiexzf = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c2493feyxiexzfUjhhgtg.f8143Ujhhgtgfeyxiexzf = 1;
        }
        c3646Ujhhgtgfeyxiexzf.m5307Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf, c2493feyxiexzfUjhhgtg);
        c3655Ujhhgtgfeyxiexzf.m5347feyxiexzfUjhhgtg(c2493feyxiexzfUjhhgtg.f8146Ujhhgtgfeyxiexzf);
        c3655Ujhhgtgfeyxiexzf.m5344feyxiexzfUjhhgtg(c2493feyxiexzfUjhhgtg.f8147Ujhhgtgfeyxiexzf);
        c3655Ujhhgtgfeyxiexzf.f11594feyxiexzfUjhhgtg = c2493feyxiexzfUjhhgtg.f8149Ujhhgtgfeyxiexzf;
        c3655Ujhhgtgfeyxiexzf.m5341feyxiexzfUjhhgtg(c2493feyxiexzfUjhhgtg.f8148Ujhhgtgfeyxiexzf);
        c2493feyxiexzfUjhhgtg.f8151Ujhhgtgfeyxiexzf = 0;
        return c2493feyxiexzfUjhhgtg.f8150Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public C2366Ujhhgtgfeyxiexzf m3609Ujhhgtgfeyxiexzf(C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf, int i, int i2) {
        C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf = (C0684Ujhhgtgfeyxiexzf) this.f7716Ujhhgtgfeyxiexzf;
        AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf = (AbstractC0246Ujhhgtgfeyxiexzf) this.f7714Ujhhgtgfeyxiexzf;
        C0242Ujhhgtgfeyxiexzf c0242UjhhgtgfeyxiexzfMo1400Ujhhgtgfeyxiexzf = abstractC0246Ujhhgtgfeyxiexzf.mo1400Ujhhgtgfeyxiexzf((AbstractC0246Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7714Ujhhgtgfeyxiexzf, i2);
        C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg = (C3366feyxiexzfUjhhgtg) this.f7715Ujhhgtgfeyxiexzf;
        C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg2 = (C3366feyxiexzfUjhhgtg) c2366Ujhhgtgfeyxiexzf.f7715Ujhhgtgfeyxiexzf;
        c3366feyxiexzfUjhhgtg.getClass();
        try {
            C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtgM5184Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5184Ujhhgtgfeyxiexzf(c3366feyxiexzfUjhhgtg, c3366feyxiexzfUjhhgtg2);
            C0684Ujhhgtgfeyxiexzf c0684UjhhgtgfeyxiexzfM1945Ujhhgtgfeyxiexzf = ((C0684Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf).m1945Ujhhgtgfeyxiexzf();
            c0684UjhhgtgfeyxiexzfM1945Ujhhgtgfeyxiexzf.m1942Ujhhgtgfeyxiexzf(i);
            c0684UjhhgtgfeyxiexzfM1945Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf = false;
            if (c0242UjhhgtgfeyxiexzfMo1400Ujhhgtgfeyxiexzf == abstractC0246Ujhhgtgfeyxiexzf && c3366feyxiexzfUjhhgtgM5184Ujhhgtgfeyxiexzf == c3366feyxiexzfUjhhgtg && c0684Ujhhgtgfeyxiexzf.equals(c0684UjhhgtgfeyxiexzfM1945Ujhhgtgfeyxiexzf)) {
                return this;
            }
            if (!c0684Ujhhgtgfeyxiexzf.equals(c0684UjhhgtgfeyxiexzfM1945Ujhhgtgfeyxiexzf)) {
                if (c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf <= c0684UjhhgtgfeyxiexzfM1945Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf) {
                    c0684Ujhhgtgfeyxiexzf = c0684UjhhgtgfeyxiexzfM1945Ujhhgtgfeyxiexzf;
                    c0684UjhhgtgfeyxiexzfM1945Ujhhgtgfeyxiexzf = c0684Ujhhgtgfeyxiexzf;
                }
                int i3 = c0684Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf;
                int i4 = c0684UjhhgtgfeyxiexzfM1945Ujhhgtgfeyxiexzf.f2814Ujhhgtgfeyxiexzf;
                for (int i5 = i4 - 1; i5 >= 0; i5--) {
                    if (c0684UjhhgtgfeyxiexzfM1945Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf(i5) != c0684Ujhhgtgfeyxiexzf.m1944Ujhhgtgfeyxiexzf((i3 - i4) + i5)) {
                        throw new RuntimeException("Incompatible merged subroutines");
                    }
                }
            }
            return new C2366Ujhhgtgfeyxiexzf(c0242UjhhgtgfeyxiexzfMo1400Ujhhgtgfeyxiexzf, c3366feyxiexzfUjhhgtgM5184Ujhhgtgfeyxiexzf, c0684Ujhhgtgfeyxiexzf);
        } catch (C1045feyxiexzfUjhhgtg e) {
            e.m4861Ujhhgtgfeyxiexzf("underlay stack:");
            c3366feyxiexzfUjhhgtg.m4869Ujhhgtgfeyxiexzf(e);
            e.m4861Ujhhgtgfeyxiexzf("overlay stack:");
            c3366feyxiexzfUjhhgtg2.m4869Ujhhgtgfeyxiexzf(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public Object m3610Ujhhgtgfeyxiexzf(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC3294Ujhhgtgfeyxiexzf interfaceC3294Ujhhgtgfeyxiexzf) {
        int i4;
        char c;
        C2548feyxiexzfUjhhgtg c2548feyxiexzfUjhhgtg = new C2548feyxiexzfUjhhgtg((C0381Ujhhgtgfeyxiexzf) ((C0416Ujhhgtgfeyxiexzf) this.f7715Ujhhgtgfeyxiexzf).f2245Ujhhgtgfeyxiexzf);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMo3932Ujhhgtgfeyxiexzf = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zMo3932Ujhhgtgfeyxiexzf) {
                    SparseArray sparseArray = ((C0381Ujhhgtgfeyxiexzf) c2548feyxiexzfUjhhgtg.f8272Ujhhgtgfeyxiexzf).f2091Ujhhgtgfeyxiexzf;
                    C0381Ujhhgtgfeyxiexzf c0381Ujhhgtgfeyxiexzf = sparseArray == null ? null : (C0381Ujhhgtgfeyxiexzf) sparseArray.get(iCodePointAt);
                    if (c2548feyxiexzfUjhhgtg.f8268Ujhhgtgfeyxiexzf == 2) {
                        if (c0381Ujhhgtgfeyxiexzf != null) {
                            c2548feyxiexzfUjhhgtg.f8272Ujhhgtgfeyxiexzf = c0381Ujhhgtgfeyxiexzf;
                            c2548feyxiexzfUjhhgtg.f8270Ujhhgtgfeyxiexzf++;
                        } else {
                            if (iCodePointAt == 65038) {
                                c2548feyxiexzfUjhhgtg.m3800Ujhhgtgfeyxiexzf();
                            } else if (iCodePointAt != 65039) {
                                C0381Ujhhgtgfeyxiexzf c0381Ujhhgtgfeyxiexzf2 = (C0381Ujhhgtgfeyxiexzf) c2548feyxiexzfUjhhgtg.f8272Ujhhgtgfeyxiexzf;
                                if (c0381Ujhhgtgfeyxiexzf2.f2092Ujhhgtgfeyxiexzf != null) {
                                    if (c2548feyxiexzfUjhhgtg.f8270Ujhhgtgfeyxiexzf != 1) {
                                        c2548feyxiexzfUjhhgtg.f8273Ujhhgtgfeyxiexzf = c0381Ujhhgtgfeyxiexzf2;
                                        c2548feyxiexzfUjhhgtg.m3800Ujhhgtgfeyxiexzf();
                                    } else if (c2548feyxiexzfUjhhgtg.m3801Ujhhgtgfeyxiexzf()) {
                                        c2548feyxiexzfUjhhgtg.f8273Ujhhgtgfeyxiexzf = (C0381Ujhhgtgfeyxiexzf) c2548feyxiexzfUjhhgtg.f8272Ujhhgtgfeyxiexzf;
                                        c2548feyxiexzfUjhhgtg.m3800Ujhhgtgfeyxiexzf();
                                    } else {
                                        c2548feyxiexzfUjhhgtg.m3800Ujhhgtgfeyxiexzf();
                                    }
                                    c = 3;
                                } else {
                                    c2548feyxiexzfUjhhgtg.m3800Ujhhgtgfeyxiexzf();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (c0381Ujhhgtgfeyxiexzf == null) {
                        c2548feyxiexzfUjhhgtg.m3800Ujhhgtgfeyxiexzf();
                        c = 1;
                    } else {
                        c2548feyxiexzfUjhhgtg.f8268Ujhhgtgfeyxiexzf = 2;
                        c2548feyxiexzfUjhhgtg.f8272Ujhhgtgfeyxiexzf = c0381Ujhhgtgfeyxiexzf;
                        c2548feyxiexzfUjhhgtg.f8270Ujhhgtgfeyxiexzf = 1;
                        c = 2;
                    }
                    c2548feyxiexzfUjhhgtg.f8269Ujhhgtgfeyxiexzf = iCodePointAt;
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
                        if (!z && m3606Ujhhgtgfeyxiexzf(charSequence, i4, iCharCount, ((C0381Ujhhgtgfeyxiexzf) c2548feyxiexzfUjhhgtg.f8273Ujhhgtgfeyxiexzf).f2092Ujhhgtgfeyxiexzf)) {
                            break;
                        }
                        zMo3932Ujhhgtgfeyxiexzf = interfaceC3294Ujhhgtgfeyxiexzf.mo3932Ujhhgtgfeyxiexzf(charSequence, i4, iCharCount, ((C0381Ujhhgtgfeyxiexzf) c2548feyxiexzfUjhhgtg.f8273Ujhhgtgfeyxiexzf).f2092Ujhhgtgfeyxiexzf);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (c2548feyxiexzfUjhhgtg.f8268Ujhhgtgfeyxiexzf == 2 && ((C0381Ujhhgtgfeyxiexzf) c2548feyxiexzfUjhhgtg.f8272Ujhhgtgfeyxiexzf).f2092Ujhhgtgfeyxiexzf != null && ((c2548feyxiexzfUjhhgtg.f8270Ujhhgtgfeyxiexzf > 1 || c2548feyxiexzfUjhhgtg.m3801Ujhhgtgfeyxiexzf()) && i5 < i3 && zMo3932Ujhhgtgfeyxiexzf && (z || !m3606Ujhhgtgfeyxiexzf(charSequence, i4, iCharCount, ((C0381Ujhhgtgfeyxiexzf) c2548feyxiexzfUjhhgtg.f8272Ujhhgtgfeyxiexzf).f2092Ujhhgtgfeyxiexzf)))) {
            interfaceC3294Ujhhgtgfeyxiexzf.mo3932Ujhhgtgfeyxiexzf(charSequence, i4, iCharCount, ((C0381Ujhhgtgfeyxiexzf) c2548feyxiexzfUjhhgtg.f8272Ujhhgtgfeyxiexzf).f2092Ujhhgtgfeyxiexzf);
        }
        return interfaceC3294Ujhhgtgfeyxiexzf.getResult();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m3611Ujhhgtgfeyxiexzf() {
        ((TypedArray) this.f7714Ujhhgtgfeyxiexzf).recycle();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m3612Ujhhgtgfeyxiexzf(C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf, int i, int i2) {
        int i3 = c3656Ujhhgtgfeyxiexzf.f11617feyxiexzfUjhhgtg;
        int i4 = c3656Ujhhgtgfeyxiexzf.f11618Ujhhgtgfeyxiexzf;
        c3656Ujhhgtgfeyxiexzf.f11617feyxiexzfUjhhgtg = 0;
        c3656Ujhhgtgfeyxiexzf.f11618Ujhhgtgfeyxiexzf = 0;
        c3656Ujhhgtgfeyxiexzf.m5347feyxiexzfUjhhgtg(i);
        c3656Ujhhgtgfeyxiexzf.m5344feyxiexzfUjhhgtg(i2);
        if (i3 < 0) {
            c3656Ujhhgtgfeyxiexzf.f11617feyxiexzfUjhhgtg = 0;
        } else {
            c3656Ujhhgtgfeyxiexzf.f11617feyxiexzfUjhhgtg = i3;
        }
        if (i4 < 0) {
            c3656Ujhhgtgfeyxiexzf.f11618Ujhhgtgfeyxiexzf = 0;
        } else {
            c3656Ujhhgtgfeyxiexzf.f11618Ujhhgtgfeyxiexzf = i4;
        }
        ((C3656Ujhhgtgfeyxiexzf) this.f7716Ujhhgtgfeyxiexzf).m5354feyxiexzfUjhhgtg();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m3613feyxiexzfUjhhgtg(C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf) {
        ArrayList arrayList = (ArrayList) this.f7714Ujhhgtgfeyxiexzf;
        arrayList.clear();
        int size = c3656Ujhhgtgfeyxiexzf.f11632feyxiexzfUjhhgtg.size();
        for (int i = 0; i < size; i++) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = (C3655Ujhhgtgfeyxiexzf) c3656Ujhhgtgfeyxiexzf.f11632feyxiexzfUjhhgtg.get(i);
            int[] iArr = c3655Ujhhgtgfeyxiexzf.f11631Ujhhgtgfeyxiexzf;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c3655Ujhhgtgfeyxiexzf);
            }
        }
        c3656Ujhhgtgfeyxiexzf.f11634Ujhhgtgfeyxiexzf.f10217Ujhhgtgfeyxiexzf = true;
    }

    public /* synthetic */ C2366Ujhhgtgfeyxiexzf(Object obj, Object obj2, Object obj3, int i) {
        this.f7713Ujhhgtgfeyxiexzf = i;
        this.f7714Ujhhgtgfeyxiexzf = obj;
        this.f7715Ujhhgtgfeyxiexzf = obj2;
        this.f7716Ujhhgtgfeyxiexzf = obj3;
    }

    public C2366Ujhhgtgfeyxiexzf() {
        this.f7713Ujhhgtgfeyxiexzf = 1;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC3013Ujhhgtgfeyxiexzf(0));
        this.f7714Ujhhgtgfeyxiexzf = new HashMap();
        this.f7715Ujhhgtgfeyxiexzf = new ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new RunnableC3012feyxiexzfUjhhgtg(1, this));
    }

    public C2366Ujhhgtgfeyxiexzf(C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf) {
        this.f7713Ujhhgtgfeyxiexzf = 3;
        C2492feyxiexzfUjhhgtg c2492feyxiexzfUjhhgtg = (C2492feyxiexzfUjhhgtg) c3639Ujhhgtgfeyxiexzf.f11369Ujhhgtgfeyxiexzf;
        int iM1056Ujhhgtgfeyxiexzf = c2492feyxiexzfUjhhgtg.m1056Ujhhgtgfeyxiexzf();
        this.f7714Ujhhgtgfeyxiexzf = new C2866feyxiexzfUjhhgtg[iM1056Ujhhgtgfeyxiexzf];
        this.f7715Ujhhgtgfeyxiexzf = new C2866feyxiexzfUjhhgtg[iM1056Ujhhgtgfeyxiexzf];
        this.f7716Ujhhgtgfeyxiexzf = new C2866feyxiexzfUjhhgtg[iM1056Ujhhgtgfeyxiexzf];
        int length = c2492feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        for (int i = 0; i < length; i++) {
            C2495feyxiexzfUjhhgtg c2495feyxiexzfUjhhgtg = (C2495feyxiexzfUjhhgtg) c2492feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i);
            C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf = c2495feyxiexzfUjhhgtg.f8153Ujhhgtgfeyxiexzf;
            int i2 = c2495feyxiexzfUjhhgtg.f8152Ujhhgtgfeyxiexzf;
            ((C2866feyxiexzfUjhhgtg[]) this.f7714Ujhhgtgfeyxiexzf)[i2] = new C2866feyxiexzfUjhhgtg(((AbstractC0671Ujhhgtgfeyxiexzf) c2657Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(0)).f2787Ujhhgtgfeyxiexzf, false);
            C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg = c2657Ujhhgtgfeyxiexzf.m3984Ujhhgtgfeyxiexzf().f2787Ujhhgtgfeyxiexzf;
            ((C2866feyxiexzfUjhhgtg[]) this.f7715Ujhhgtgfeyxiexzf)[i2] = new C2866feyxiexzfUjhhgtg(c1234feyxiexzfUjhhgtg, false);
            ((C2866feyxiexzfUjhhgtg[]) this.f7716Ujhhgtgfeyxiexzf)[i2] = new C2866feyxiexzfUjhhgtg(c1234feyxiexzfUjhhgtg, false);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    private final void m3594feyxiexzfUjhhgtg() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    private final void m3595feyxiexzfUjhhgtg() {
    }

    public C2366Ujhhgtgfeyxiexzf(C3639Ujhhgtgfeyxiexzf c3639Ujhhgtgfeyxiexzf, int[] iArr, C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf) {
        this.f7713Ujhhgtgfeyxiexzf = 19;
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (c2366Ujhhgtgfeyxiexzf != null) {
            this.f7714Ujhhgtgfeyxiexzf = c3639Ujhhgtgfeyxiexzf;
            this.f7715Ujhhgtgfeyxiexzf = iArr;
            this.f7716Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf;
            return;
        }
        throw new NullPointerException("addresses == null");
    }

    public C2366Ujhhgtgfeyxiexzf(AbstractC0246Ujhhgtgfeyxiexzf abstractC0246Ujhhgtgfeyxiexzf, C3366feyxiexzfUjhhgtg c3366feyxiexzfUjhhgtg, C0684Ujhhgtgfeyxiexzf c0684Ujhhgtgfeyxiexzf) {
        this.f7713Ujhhgtgfeyxiexzf = 12;
        if (abstractC0246Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("locals == null");
        }
        if (c3366feyxiexzfUjhhgtg != null) {
            c0684Ujhhgtgfeyxiexzf.m1730Ujhhgtgfeyxiexzf();
            this.f7714Ujhhgtgfeyxiexzf = abstractC0246Ujhhgtgfeyxiexzf;
            this.f7715Ujhhgtgfeyxiexzf = c3366feyxiexzfUjhhgtg;
            this.f7716Ujhhgtgfeyxiexzf = c0684Ujhhgtgfeyxiexzf;
            return;
        }
        throw new NullPointerException("stack == null");
    }

    public C2366Ujhhgtgfeyxiexzf(Context context, TypedArray typedArray) {
        this.f7713Ujhhgtgfeyxiexzf = 20;
        this.f7716Ujhhgtgfeyxiexzf = context;
        this.f7714Ujhhgtgfeyxiexzf = typedArray;
    }

    public C2366Ujhhgtgfeyxiexzf(C3656Ujhhgtgfeyxiexzf c3656Ujhhgtgfeyxiexzf) {
        this.f7713Ujhhgtgfeyxiexzf = 2;
        this.f7714Ujhhgtgfeyxiexzf = new ArrayList();
        this.f7715Ujhhgtgfeyxiexzf = new C2493feyxiexzfUjhhgtg();
        this.f7716Ujhhgtgfeyxiexzf = c3656Ujhhgtgfeyxiexzf;
    }

    public C2366Ujhhgtgfeyxiexzf(Context context) {
        this.f7713Ujhhgtgfeyxiexzf = 0;
        this.f7716Ujhhgtgfeyxiexzf = context.getApplicationContext();
        this.f7715Ujhhgtgfeyxiexzf = new HashSet();
        this.f7714Ujhhgtgfeyxiexzf = new HashMap();
    }

    public C2366Ujhhgtgfeyxiexzf(C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf, C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf, C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf2) {
        this.f7713Ujhhgtgfeyxiexzf = 13;
        c2366Ujhhgtgfeyxiexzf.getClass();
        this.f7714Ujhhgtgfeyxiexzf = c0154Ujhhgtgfeyxiexzf;
        this.f7715Ujhhgtgfeyxiexzf = c0154Ujhhgtgfeyxiexzf2;
        this.f7716Ujhhgtgfeyxiexzf = (C2366Ujhhgtgfeyxiexzf) c2366Ujhhgtgfeyxiexzf.f7716Ujhhgtgfeyxiexzf;
    }

    public C2366Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf, C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg, C3130Ujhhgtgfeyxiexzf c3130Ujhhgtgfeyxiexzf, Set set) {
        this.f7713Ujhhgtgfeyxiexzf = 8;
        this.f7714Ujhhgtgfeyxiexzf = c2466feyxiexzfUjhhgtg;
        this.f7715Ujhhgtgfeyxiexzf = c0416Ujhhgtgfeyxiexzf;
        this.f7716Ujhhgtgfeyxiexzf = c3130Ujhhgtgfeyxiexzf;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m3610Ujhhgtgfeyxiexzf(str, 0, str.length(), 1, true, new C3290Ujhhgtgfeyxiexzf(str, 0));
        }
    }

    public C2366Ujhhgtgfeyxiexzf(String str, InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg) {
        this.f7713Ujhhgtgfeyxiexzf = 17;
        this.f7714Ujhhgtgfeyxiexzf = str;
        this.f7715Ujhhgtgfeyxiexzf = interfaceC3545feyxiexzfUjhhgtg;
    }

    public C2366Ujhhgtgfeyxiexzf(C1440feyxiexzfUjhhgtg c1440feyxiexzfUjhhgtg, InterfaceC3507feyxiexzfUjhhgtg interfaceC3507feyxiexzfUjhhgtg, C3339feyxiexzfUjhhgtg c3339feyxiexzfUjhhgtg) {
        this.f7713Ujhhgtgfeyxiexzf = 10;
        this.f7716Ujhhgtgfeyxiexzf = c1440feyxiexzfUjhhgtg;
        this.f7714Ujhhgtgfeyxiexzf = interfaceC3507feyxiexzfUjhhgtg;
        this.f7715Ujhhgtgfeyxiexzf = c3339feyxiexzfUjhhgtg;
    }

    public C2366Ujhhgtgfeyxiexzf(C0201Ujhhgtgfeyxiexzf c0201Ujhhgtgfeyxiexzf, ArrayList arrayList, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        this.f7713Ujhhgtgfeyxiexzf = 15;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(c0271Ujhhgtgfeyxiexzf, "Argument must not be null");
        this.f7715Ujhhgtgfeyxiexzf = c0271Ujhhgtgfeyxiexzf;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(arrayList, "Argument must not be null");
        this.f7716Ujhhgtgfeyxiexzf = arrayList;
        this.f7714Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(c0201Ujhhgtgfeyxiexzf, c0271Ujhhgtgfeyxiexzf);
    }

    public C2366Ujhhgtgfeyxiexzf(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        this.f7713Ujhhgtgfeyxiexzf = 16;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(c0271Ujhhgtgfeyxiexzf, "Argument must not be null");
        this.f7714Ujhhgtgfeyxiexzf = c0271Ujhhgtgfeyxiexzf;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(arrayList, "Argument must not be null");
        this.f7715Ujhhgtgfeyxiexzf = arrayList;
        this.f7716Ujhhgtgfeyxiexzf = new Ujhhgtgfeyxiexzf(parcelFileDescriptor);
    }

    public C2366Ujhhgtgfeyxiexzf(C3334feyxiexzfUjhhgtg c3334feyxiexzfUjhhgtg, C1046feyxiexzfUjhhgtg c1046feyxiexzfUjhhgtg, C3338Ujhhgtgfeyxiexzf c3338Ujhhgtgfeyxiexzf) {
        this.f7713Ujhhgtgfeyxiexzf = 9;
        this.f7716Ujhhgtgfeyxiexzf = c3334feyxiexzfUjhhgtg;
        this.f7715Ujhhgtgfeyxiexzf = c1046feyxiexzfUjhhgtg;
        this.f7714Ujhhgtgfeyxiexzf = c3338Ujhhgtgfeyxiexzf;
    }
}
