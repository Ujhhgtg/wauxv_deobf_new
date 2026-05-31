package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᲁᛸᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2769 implements InterfaceC2610, InterfaceC2778 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final boolean f8888 = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f8889;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2872 f8890;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f8891;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2614 f8892;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1472 f8893;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f8894;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Class f8895;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC0354 f8896;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f8897;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int f8898;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final EnumC2454 f8899;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final InterfaceC2953 f8900;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final List f8901;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final C2135 f8902;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final ExecutorC1246 f8903;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public InterfaceC2624 f8904;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C0253 f8905;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public long f8906;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public volatile C1217 f8907;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public Drawable f8908;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public Drawable f8909;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public Drawable f8910;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int f8911;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int f8912;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public boolean f8913;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final RuntimeException f8914;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public int f8915;

    public C2769(Context context, C1472 c1472, Object obj, Object obj2, Class cls, AbstractC0354 abstractC0354, int i, int i2, EnumC2454 enumC2454, InterfaceC2953 interfaceC2953, ArrayList arrayList, InterfaceC2614 interfaceC2614, C1217 c1217, C2135 c2135) {
        ExecutorC1246 executorC1246 = AbstractC2240.f7301;
        this.f8889 = f8888 ? String.valueOf(hashCode()) : null;
        this.f8890 = new C2872();
        this.f8891 = obj;
        this.f8893 = c1472;
        this.f8894 = obj2;
        this.f8895 = cls;
        this.f8896 = abstractC0354;
        this.f8897 = i;
        this.f8898 = i2;
        this.f8899 = enumC2454;
        this.f8900 = interfaceC2953;
        this.f8901 = arrayList;
        this.f8892 = interfaceC2614;
        this.f8907 = c1217;
        this.f8902 = c2135;
        this.f8903 = executorC1246;
        this.f8915 = 1;
        if (this.f8914 == null && c1472.f5244.f5263.containsKey(AbstractC1468.class)) {
            this.f8914 = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // p000.InterfaceC2610
    public final void clear() {
        synchronized (this.f8891) {
            try {
                if (this.f8913) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f8890.m4824();
                if (this.f8915 == 6) {
                    return;
                }
                m4745();
                InterfaceC2624 interfaceC2624 = this.f8904;
                if (interfaceC2624 != null) {
                    this.f8904 = null;
                } else {
                    interfaceC2624 = null;
                }
                InterfaceC2614 interfaceC2614 = this.f8892;
                if (interfaceC2614 == null || interfaceC2614.mo2979(this)) {
                    this.f8900.mo1731(m4746());
                }
                this.f8915 = 6;
                if (interfaceC2624 != null) {
                    this.f8907.getClass();
                    C1217.m2955(interfaceC2624);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2610
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f8891) {
            int i = this.f8915;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f8891) {
            obj = this.f8894;
            cls = this.f8895;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo2974() {
        boolean z;
        synchronized (this.f8891) {
            z = this.f8915 == 4;
        }
        return z;
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo2975(InterfaceC2610 interfaceC2610) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC0354 abstractC0354;
        EnumC2454 enumC2454;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC0354 abstractC0355;
        EnumC2454 enumC2455;
        int size2;
        boolean zEquals;
        boolean zM1636;
        if (!(interfaceC2610 instanceof C2769)) {
            return false;
        }
        synchronized (this.f8891) {
            try {
                i = this.f8897;
                i2 = this.f8898;
                obj = this.f8894;
                cls = this.f8895;
                abstractC0354 = this.f8896;
                enumC2454 = this.f8899;
                List list = this.f8901;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        C2769 c2769 = (C2769) interfaceC2610;
        synchronized (c2769.f8891) {
            try {
                i3 = c2769.f8897;
                i4 = c2769.f8898;
                obj2 = c2769.f8894;
                cls2 = c2769.f8895;
                abstractC0355 = c2769.f8896;
                enumC2455 = c2769.f8899;
                List list2 = c2769.f8901;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = AbstractC3580.f11185;
            if (obj == null) {
                zEquals = obj2 == null;
            } else {
                zEquals = obj.equals(obj2);
            }
            if (zEquals && cls.equals(cls2)) {
                if (abstractC0354 == null) {
                    zM1636 = abstractC0355 == null;
                } else {
                    zM1636 = abstractC0354.m1636(abstractC0355);
                }
                if (zM1636 && enumC2454 == enumC2455 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4745() {
        if (this.f8913) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f8890.m4824();
        this.f8900.mo1722(this);
        C0253 c0253 = this.f8905;
        if (c0253 != null) {
            synchronized (((C1217) c0253.f1480)) {
                ((C1221) c0253.f1478).m2967((C2769) c0253.f1479);
            }
            this.f8905 = null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Drawable m4746() {
        if (this.f8909 == null) {
            this.f8896.getClass();
            this.f8909 = null;
        }
        return this.f8909;
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2978() {
        synchronized (this.f8891) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4747(String str) {
        StringBuilder sbM2803 = AbstractC1095.m2803(str, " this: ");
        sbM2803.append(this.f8889);
        Log.v("GlideRequest", sbM2803.toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4748(C1474 c1474, int i) {
        Drawable drawableM4746;
        this.f8890.m4824();
        synchronized (this.f8891) {
            try {
                c1474.getClass();
                int i2 = this.f8893.f5245;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f8894 + "] with dimensions [" + this.f8911 + "x" + this.f8912 + "]", c1474);
                    if (i2 <= 4) {
                        c1474.m3410();
                    }
                }
                this.f8905 = null;
                this.f8915 = 5;
                InterfaceC2614 interfaceC2614 = this.f8892;
                if (interfaceC2614 != null) {
                    interfaceC2614.mo2976(this);
                }
                boolean z = true;
                this.f8913 = true;
                try {
                    List list = this.f8901;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            InterfaceC2614 interfaceC2615 = this.f8892;
                            if (interfaceC2615 == null) {
                                throw null;
                            }
                            interfaceC2615.getRoot().mo2974();
                            throw null;
                        }
                    }
                    InterfaceC2614 interfaceC2616 = this.f8892;
                    if (interfaceC2616 != null && !interfaceC2616.mo2980(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.f8894 == null) {
                            if (this.f8910 == null) {
                                this.f8896.getClass();
                                this.f8910 = null;
                            }
                            drawableM4746 = this.f8910;
                        } else {
                            drawableM4746 = null;
                        }
                        if (drawableM4746 == null) {
                            if (this.f8908 == null) {
                                this.f8896.getClass();
                                this.f8908 = null;
                            }
                            drawableM4746 = this.f8908;
                        }
                        if (drawableM4746 == null) {
                            drawableM4746 = m4746();
                        }
                        this.f8900.mo1727(drawableM4746);
                    }
                    this.f8913 = false;
                } catch (Throwable th) {
                    this.f8913 = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m4749(InterfaceC2624 interfaceC2624, int i, boolean z) {
        this.f8890.m4824();
        InterfaceC2624 interfaceC2625 = null;
        try {
            synchronized (this.f8891) {
                try {
                    this.f8905 = null;
                    if (interfaceC2624 == null) {
                        m4748(new C1474("Expected to receive a Resource<R> with an object of " + this.f8895 + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC2624.get();
                    try {
                        if (obj == null || !this.f8895.isAssignableFrom(obj.getClass())) {
                            this.f8904 = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f8895);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC2624);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m4748(new C1474(sb.toString()), 5);
                        } else {
                            InterfaceC2614 interfaceC2614 = this.f8892;
                            if (interfaceC2614 == null || interfaceC2614.mo2981(this)) {
                                m4750(interfaceC2624, obj, i);
                                return;
                            } else {
                                this.f8904 = null;
                                this.f8915 = 4;
                            }
                        }
                        this.f8907.getClass();
                        C1217.m2955(interfaceC2624);
                    } catch (Throwable th) {
                        interfaceC2625 = interfaceC2624;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC2625 != null) {
                this.f8907.getClass();
                C1217.m2955(interfaceC2625);
            }
            throw th3;
        }
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final boolean mo2982() {
        boolean z;
        synchronized (this.f8891) {
            z = this.f8915 == 6;
        }
        return z;
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo2983() {
        synchronized (this.f8891) {
            try {
                if (this.f8913) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f8890.m4824();
                int i = AbstractC1879.f6242;
                this.f8906 = SystemClock.elapsedRealtimeNanos();
                if (this.f8894 == null) {
                    if (AbstractC3580.m5124(this.f8897, this.f8898)) {
                        this.f8911 = this.f8897;
                        this.f8912 = this.f8898;
                    }
                    if (this.f8910 == null) {
                        this.f8896.getClass();
                        this.f8910 = null;
                    }
                    m4748(new C1474("Received null model"), this.f8910 == null ? 5 : 3);
                    return;
                }
                int i2 = this.f8915;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    m4749(this.f8904, 5, false);
                    return;
                }
                List list = this.f8901;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.f8915 = 3;
                if (AbstractC3580.m5124(this.f8897, this.f8898)) {
                    m4751(this.f8897, this.f8898);
                } else {
                    this.f8900.mo1723(this);
                }
                int i3 = this.f8915;
                if (i3 == 2 || i3 == 3) {
                    InterfaceC2614 interfaceC2614 = this.f8892;
                    if (interfaceC2614 == null || interfaceC2614.mo2980(this)) {
                        this.f8900.mo1729(m4746());
                    }
                }
                if (f8888) {
                    m4747("finished run method in " + AbstractC1879.m3798(this.f8906));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2610
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo2984() {
        boolean z;
        synchronized (this.f8891) {
            z = this.f8915 == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4750(InterfaceC2624 interfaceC2624, Object obj, int i) {
        InterfaceC2614 interfaceC2614 = this.f8892;
        if (interfaceC2614 != null) {
            interfaceC2614.getRoot().mo2974();
        }
        this.f8915 = 4;
        this.f8904 = interfaceC2624;
        if (this.f8893.f5245 <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + AbstractC2844.m4793(i) + " for " + this.f8894 + " with size [" + this.f8911 + "x" + this.f8912 + "] in " + AbstractC1879.m3798(this.f8906) + " ms");
        }
        if (interfaceC2614 != null) {
            interfaceC2614.mo2977(this);
        }
        this.f8913 = true;
        try {
            List list = this.f8901;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.f8902.getClass();
            this.f8900.mo1725(obj);
            this.f8913 = false;
        } catch (Throwable th) {
            this.f8913 = false;
            throw th;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m4751(int i, int i2) throws Throwable {
        Object obj;
        C2769 c2769 = this;
        int iRound = i;
        c2769.f8890.m4824();
        Object obj2 = c2769.f8891;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f8888;
                    if (z) {
                        c2769.m4747("Got onSizeReady in " + AbstractC1879.m3798(c2769.f8906));
                    }
                    if (c2769.f8915 == 3) {
                        c2769.f8915 = 2;
                        c2769.f8896.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        c2769.f8911 = iRound;
                        c2769.f8912 = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                        if (z) {
                            c2769.m4747("finished setup for calling load in " + AbstractC1879.m3798(c2769.f8906));
                        }
                        C1217 c1217 = c2769.f8907;
                        C1472 c1472 = c2769.f8893;
                        Object obj3 = c2769.f8894;
                        AbstractC0354 abstractC0354 = c2769.f8896;
                        InterfaceC1772 interfaceC1772 = abstractC0354.f1743;
                        try {
                            int i3 = c2769.f8911;
                            int i4 = c2769.f8912;
                            Class cls = abstractC0354.f1747;
                            try {
                                Class cls2 = c2769.f8895;
                                EnumC2454 enumC2454 = c2769.f8899;
                                C1068 c1068 = abstractC0354.f1738;
                                try {
                                    C0522 c0522 = abstractC0354.f1746;
                                    boolean z2 = abstractC0354.f1744;
                                    boolean z3 = abstractC0354.f1750;
                                    try {
                                        C2336 c2336 = abstractC0354.f1745;
                                        boolean z4 = abstractC0354.f1740;
                                        boolean z5 = abstractC0354.f1751;
                                        ExecutorC1246 executorC1246 = c2769.f8903;
                                        Object obj4 = obj2;
                                        try {
                                            c2769.f8905 = c1217.m2956(c1472, obj3, interfaceC1772, i3, i4, cls, cls2, enumC2454, c1068, c0522, z2, z3, c2336, z4, z5, c2769, executorC1246);
                                            if (c2769.f8915 != 2) {
                                                c2769.f8905 = null;
                                            }
                                            if (z) {
                                                c2769.m4747("finished onSizeReady in " + AbstractC1879.m3798(c2769.f8906));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            obj = obj4;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj = obj2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj = obj2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    obj = c2769;
                }
            } catch (Throwable th7) {
                th = th7;
                obj = obj2;
            }
        }
    }
}
