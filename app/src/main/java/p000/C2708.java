package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᲈᤝᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2708 implements InterfaceC2554, InterfaceC2717 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static final boolean f8725 = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f8726;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2812 f8727;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f8728;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2558 f8729;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1461 f8730;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f8731;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Class f8732;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC0379 f8733;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f8734;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int f8735;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final EnumC2401 f8736;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final InterfaceC2894 f8737;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final List f8738;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final C2102 f8739;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final ExecutorC1244 f8740;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public InterfaceC2568 f8741;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C0243 f8742;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public long f8743;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public volatile C1216 f8744;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public Drawable f8745;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public Drawable f8746;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public Drawable f8747;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public int f8748;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public int f8749;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public boolean f8750;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final RuntimeException f8751;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public int f8752;

    public C2708(Context context, C1461 c1461, Object obj, Object obj2, Class cls, AbstractC0379 abstractC0379, int i, int i2, EnumC2401 enumC2401, InterfaceC2894 interfaceC2894, ArrayList arrayList, InterfaceC2558 interfaceC2558, C1216 c1216, C2102 c2102) {
        ExecutorC1244 executorC1244 = AbstractC3453.f10924;
        this.f8726 = f8725 ? String.valueOf(hashCode()) : null;
        this.f8727 = new C2812();
        this.f8728 = obj;
        this.f8730 = c1461;
        this.f8731 = obj2;
        this.f8732 = cls;
        this.f8733 = abstractC0379;
        this.f8734 = i;
        this.f8735 = i2;
        this.f8736 = enumC2401;
        this.f8737 = interfaceC2894;
        this.f8738 = arrayList;
        this.f8729 = interfaceC2558;
        this.f8744 = c1216;
        this.f8739 = c2102;
        this.f8740 = executorC1244;
        this.f8752 = 1;
        if (this.f8751 == null && c1461.f5212.f5231.containsKey(AbstractC1459.class)) {
            this.f8751 = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // p000.InterfaceC2554
    public final void clear() {
        synchronized (this.f8728) {
            try {
                if (this.f8750) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f8727.m4791();
                if (this.f8752 == 6) {
                    return;
                }
                m4711();
                InterfaceC2568 interfaceC2568 = this.f8741;
                if (interfaceC2568 != null) {
                    this.f8741 = null;
                } else {
                    interfaceC2568 = null;
                }
                InterfaceC2558 interfaceC2558 = this.f8729;
                if (interfaceC2558 == null || interfaceC2558.mo2853(this)) {
                    this.f8737.mo1625(m4712());
                }
                this.f8752 = 6;
                if (interfaceC2568 != null) {
                    this.f8744.getClass();
                    C1216.m2833(interfaceC2568);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2554
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f8728) {
            int i = this.f8752;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f8728) {
            obj = this.f8731;
            cls = this.f8732;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    @Override // p000.InterfaceC2554
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo2848() {
        boolean z;
        synchronized (this.f8728) {
            z = this.f8752 == 4;
        }
        return z;
    }

    @Override // p000.InterfaceC2554
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo2849(InterfaceC2554 interfaceC2554) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC0379 abstractC0379;
        EnumC2401 enumC2401;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC0379 abstractC03710;
        EnumC2401 enumC2402;
        int size2;
        boolean zEquals;
        boolean zM1530;
        if (!(interfaceC2554 instanceof C2708)) {
            return false;
        }
        synchronized (this.f8728) {
            try {
                i = this.f8734;
                i2 = this.f8735;
                obj = this.f8731;
                cls = this.f8732;
                abstractC0379 = this.f8733;
                enumC2401 = this.f8736;
                List list = this.f8738;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        C2708 c2708 = (C2708) interfaceC2554;
        synchronized (c2708.f8728) {
            try {
                i3 = c2708.f8734;
                i4 = c2708.f8735;
                obj2 = c2708.f8731;
                cls2 = c2708.f8732;
                abstractC03710 = c2708.f8733;
                enumC2402 = c2708.f8736;
                List list2 = c2708.f8738;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = AbstractC3522.f11032;
            if (obj == null) {
                zEquals = obj2 == null;
            } else {
                zEquals = obj.equals(obj2);
            }
            if (zEquals && cls.equals(cls2)) {
                if (abstractC0379 == null) {
                    zM1530 = abstractC03710 == null;
                } else {
                    zM1530 = abstractC0379.m1530(abstractC03710);
                }
                if (zM1530 && enumC2401 == enumC2402 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4711() {
        if (this.f8750) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f8727.m4791();
        this.f8737.mo1616(this);
        C0243 c0243 = this.f8742;
        if (c0243 != null) {
            synchronized (((C1216) c0243.f1406)) {
                ((C1220) c0243.f1404).m2845((C2708) c0243.f1405);
            }
            this.f8742 = null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Drawable m4712() {
        if (this.f8746 == null) {
            this.f8733.getClass();
            this.f8746 = null;
        }
        return this.f8746;
    }

    @Override // p000.InterfaceC2554
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2852() {
        synchronized (this.f8728) {
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
    public final void m4713(String str) {
        StringBuilder sbM2788 = AbstractC1194.m2788(str, " this: ");
        sbM2788.append(this.f8726);
        Log.v("GlideRequest", sbM2788.toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m4714(C1463 c1463, int i) {
        Drawable drawableM4712;
        this.f8727.m4791();
        synchronized (this.f8728) {
            try {
                c1463.getClass();
                int i2 = this.f8730.f5213;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f8731 + "] with dimensions [" + this.f8748 + "x" + this.f8749 + "]", c1463);
                    if (i2 <= 4) {
                        c1463.m3233();
                    }
                }
                this.f8742 = null;
                this.f8752 = 5;
                InterfaceC2558 interfaceC2558 = this.f8729;
                if (interfaceC2558 != null) {
                    interfaceC2558.mo2850(this);
                }
                boolean z = true;
                this.f8750 = true;
                try {
                    List list = this.f8738;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            InterfaceC2558 interfaceC2559 = this.f8729;
                            if (interfaceC2559 == null) {
                                throw null;
                            }
                            interfaceC2559.getRoot().mo2848();
                            throw null;
                        }
                    }
                    InterfaceC2558 interfaceC25510 = this.f8729;
                    if (interfaceC25510 != null && !interfaceC25510.mo2854(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.f8731 == null) {
                            if (this.f8747 == null) {
                                this.f8733.getClass();
                                this.f8747 = null;
                            }
                            drawableM4712 = this.f8747;
                        } else {
                            drawableM4712 = null;
                        }
                        if (drawableM4712 == null) {
                            if (this.f8745 == null) {
                                this.f8733.getClass();
                                this.f8745 = null;
                            }
                            drawableM4712 = this.f8745;
                        }
                        if (drawableM4712 == null) {
                            drawableM4712 = m4712();
                        }
                        this.f8737.mo1621(drawableM4712);
                    }
                    this.f8750 = false;
                } catch (Throwable th) {
                    this.f8750 = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void m4715(InterfaceC2568 interfaceC2568, int i, boolean z) {
        this.f8727.m4791();
        InterfaceC2568 interfaceC2569 = null;
        try {
            synchronized (this.f8728) {
                try {
                    this.f8742 = null;
                    if (interfaceC2568 == null) {
                        m4714(new C1463("Expected to receive a Resource<R> with an object of " + this.f8732 + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC2568.get();
                    try {
                        if (obj == null || !this.f8732.isAssignableFrom(obj.getClass())) {
                            this.f8741 = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f8732);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC2568);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m4714(new C1463(sb.toString()), 5);
                        } else {
                            InterfaceC2558 interfaceC2558 = this.f8729;
                            if (interfaceC2558 == null || interfaceC2558.mo2855(this)) {
                                m4716(interfaceC2568, obj, i);
                                return;
                            } else {
                                this.f8741 = null;
                                this.f8752 = 4;
                            }
                        }
                        this.f8744.getClass();
                        C1216.m2833(interfaceC2568);
                    } catch (Throwable th) {
                        interfaceC2569 = interfaceC2568;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC2569 != null) {
                this.f8744.getClass();
                C1216.m2833(interfaceC2569);
            }
            throw th3;
        }
    }

    @Override // p000.InterfaceC2554
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final boolean mo2856() {
        boolean z;
        synchronized (this.f8728) {
            z = this.f8752 == 6;
        }
        return z;
    }

    @Override // p000.InterfaceC2554
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo2857() {
        synchronized (this.f8728) {
            try {
                if (this.f8750) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f8727.m4791();
                int i = AbstractC1853.f6168;
                this.f8743 = SystemClock.elapsedRealtimeNanos();
                if (this.f8731 == null) {
                    if (AbstractC3522.m5112(this.f8734, this.f8735)) {
                        this.f8748 = this.f8734;
                        this.f8749 = this.f8735;
                    }
                    if (this.f8747 == null) {
                        this.f8733.getClass();
                        this.f8747 = null;
                    }
                    m4714(new C1463("Received null model"), this.f8747 == null ? 5 : 3);
                    return;
                }
                int i2 = this.f8752;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    m4715(this.f8741, 5, false);
                    return;
                }
                List list = this.f8738;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.f8752 = 3;
                if (AbstractC3522.m5112(this.f8734, this.f8735)) {
                    m4717(this.f8734, this.f8735);
                } else {
                    this.f8737.mo1617(this);
                }
                int i3 = this.f8752;
                if (i3 == 2 || i3 == 3) {
                    InterfaceC2558 interfaceC2558 = this.f8729;
                    if (interfaceC2558 == null || interfaceC2558.mo2854(this)) {
                        this.f8737.mo1623(m4712());
                    }
                }
                if (f8725) {
                    m4713("finished run method in " + AbstractC1853.m3620(this.f8743));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC2554
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo2858() {
        boolean z;
        synchronized (this.f8728) {
            z = this.f8752 == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4716(InterfaceC2568 interfaceC2568, Object obj, int i) {
        InterfaceC2558 interfaceC2558 = this.f8729;
        if (interfaceC2558 != null) {
            interfaceC2558.getRoot().mo2848();
        }
        this.f8752 = 4;
        this.f8741 = interfaceC2568;
        if (this.f8730.f5213 <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + AbstractC2784.m4760(i) + " for " + this.f8731 + " with size [" + this.f8748 + "x" + this.f8749 + "] in " + AbstractC1853.m3620(this.f8743) + " ms");
        }
        if (interfaceC2558 != null) {
            interfaceC2558.mo2851(this);
        }
        this.f8750 = true;
        try {
            List list = this.f8738;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.f8739.getClass();
            this.f8737.mo1619(obj);
            this.f8750 = false;
        } catch (Throwable th) {
            this.f8750 = false;
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
    public final void m4717(int i, int i2) throws Throwable {
        Object obj;
        C2708 c2708 = this;
        int iRound = i;
        c2708.f8727.m4791();
        Object obj2 = c2708.f8728;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f8725;
                    if (z) {
                        c2708.m4713("Got onSizeReady in " + AbstractC1853.m3620(c2708.f8743));
                    }
                    if (c2708.f8752 == 3) {
                        c2708.f8752 = 2;
                        c2708.f8733.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        c2708.f8748 = iRound;
                        c2708.f8749 = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                        if (z) {
                            c2708.m4713("finished setup for calling load in " + AbstractC1853.m3620(c2708.f8743));
                        }
                        C1216 c1216 = c2708.f8744;
                        C1461 c1461 = c2708.f8730;
                        Object obj3 = c2708.f8731;
                        AbstractC0379 abstractC0379 = c2708.f8733;
                        InterfaceC1749 interfaceC1749 = abstractC0379.f1772;
                        try {
                            int i3 = c2708.f8748;
                            int i4 = c2708.f8749;
                            Class cls = abstractC0379.f1776;
                            try {
                                Class cls2 = c2708.f8732;
                                EnumC2401 enumC2401 = c2708.f8736;
                                C1063 c1063 = abstractC0379.f1767;
                                try {
                                    C0545 c0545 = abstractC0379.f1775;
                                    boolean z2 = abstractC0379.f1773;
                                    boolean z3 = abstractC0379.f1779;
                                    try {
                                        C2303 c2303 = abstractC0379.f1774;
                                        boolean z4 = abstractC0379.f1769;
                                        boolean z5 = abstractC0379.f1780;
                                        ExecutorC1244 executorC1244 = c2708.f8740;
                                        Object obj4 = obj2;
                                        try {
                                            c2708.f8742 = c1216.m2834(c1461, obj3, interfaceC1749, i3, i4, cls, cls2, enumC2401, c1063, c0545, z2, z3, c2303, z4, z5, c2708, executorC1244);
                                            if (c2708.f8752 != 2) {
                                                c2708.f8742 = null;
                                            }
                                            if (z) {
                                                c2708.m4713("finished onSizeReady in " + AbstractC1853.m3620(c2708.f8743));
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
                    obj = c2708;
                }
            } catch (Throwable th7) {
                th = th7;
                obj = obj2;
            }
        }
    }
}
