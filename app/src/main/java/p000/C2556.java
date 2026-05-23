package p000;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0020;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᤝᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2556 extends AbstractC0379 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final Context f8113;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final ComponentCallbacks2C2563 f8114;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final Class f8115;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final C1461 f8116;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public C1445 f8117;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public Object f8118;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public ArrayList f8119;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public C2556 f8120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public C2556 f8121;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f8122 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public boolean f8123;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public boolean f8124;

    static {
    }

    public C2556(ComponentCallbacks2C0020 componentCallbacks2C0020, ComponentCallbacks2C2563 componentCallbacks2C2563, Class cls, Context context) {
        C2565 c2565;
        this.f8114 = componentCallbacks2C2563;
        this.f8115 = cls;
        this.f8113 = context;
        C0264 c0264 = componentCallbacks2C2563.f8133.f539.f5210;
        C1445 c1445 = (C1445) c0264.get(cls);
        if (c1445 == null) {
            for (Map.Entry entry : (C0259) c0264.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c1445 = (C1445) entry.getValue();
                }
            }
        }
        this.f8117 = c1445 == null ? C1461.f5204 : c1445;
        this.f8116 = componentCallbacks2C0020.f539;
        Iterator it = componentCallbacks2C2563.f8141.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            m4568();
        }
        synchronized (componentCallbacks2C2563) {
            c2565 = componentCallbacks2C2563.f8142;
        }
        mo1526(c2565);
    }

    @Override // p000.AbstractC0379
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2556)) {
            return false;
        }
        C2556 c2556 = (C2556) obj;
        return super.equals(c2556) && Objects.equals(this.f8115, c2556.f8115) && this.f8117.equals(c2556.f8117) && Objects.equals(this.f8118, c2556.f8118) && Objects.equals(this.f8119, c2556.f8119) && Objects.equals(this.f8120, c2556.f8120) && Objects.equals(this.f8121, c2556.f8121) && this.f8122 == c2556.f8122 && this.f8123 == c2556.f8123;
    }

    @Override // p000.AbstractC0379
    public final int hashCode() {
        return AbstractC3522.m5110(this.f8123 ? 1 : 0, AbstractC3522.m5110(this.f8122 ? 1 : 0, AbstractC3522.m5111(AbstractC3522.m5111(AbstractC3522.m5111(AbstractC3522.m5111(AbstractC3522.m5111(AbstractC3522.m5111(AbstractC3522.m5111(super.hashCode(), this.f8115), this.f8117), this.f8118), this.f8119), this.f8120), this.f8121), null)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C2556 m4568() {
        if (this.f1778) {
            return clone().m4568();
        }
        m1534();
        return this;
    }

    @Override // p000.AbstractC0379
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C2556 mo1526(AbstractC0379 abstractC0379) {
        AbstractC1460.m3209(abstractC0379);
        return (C2556) super.mo1526(abstractC0379);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final InterfaceC2554 m4570(Object obj, InterfaceC2894 interfaceC2894, InterfaceC2558 interfaceC2558, C1445 c1445, EnumC2401 enumC2401, int i, int i2, AbstractC0379 abstractC0379) {
        InterfaceC2558 interfaceC2559;
        InterfaceC2558 c1226;
        AbstractC0379 abstractC03710;
        InterfaceC2554 c2708;
        EnumC2401 enumC2402;
        if (this.f8121 != null) {
            c1226 = new C1226(obj, interfaceC2558);
            interfaceC2559 = c1226;
        } else {
            interfaceC2559 = null;
            c1226 = interfaceC2558;
        }
        C2556 c2556 = this.f8120;
        if (c2556 == null) {
            Context context = this.f8113;
            C1461 c1461 = this.f8116;
            abstractC03710 = abstractC0379;
            c2708 = new C2708(context, c1461, obj, this.f8118, this.f8115, abstractC03710, i, i2, enumC2401, interfaceC2894, this.f8119, c1226, c1461.f5211, c1445.f5113);
        } else {
            if (this.f8124) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            C1445 c1446 = c2556.f8122 ? c1445 : c2556.f8117;
            if (AbstractC0379.m1525(c2556.f1766, 8)) {
                enumC2402 = this.f8120.f1768;
            } else {
                int iOrdinal = enumC2401.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    enumC2402 = EnumC2401.f7672;
                } else if (iOrdinal == 2) {
                    enumC2402 = EnumC2401.f7673;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f1768);
                    }
                    enumC2402 = EnumC2401.f7674;
                }
            }
            EnumC2401 enumC2403 = enumC2402;
            C2556 c2557 = this.f8120;
            int i3 = c2557.f1771;
            int i4 = c2557.f1770;
            if (AbstractC3522.m5112(i, i2)) {
                C2556 c2558 = this.f8120;
                if (!AbstractC3522.m5112(c2558.f1771, c2558.f1770)) {
                    i3 = abstractC0379.f1771;
                    i4 = abstractC0379.f1770;
                }
            }
            int i5 = i4;
            C2926 c2926 = new C2926(obj, c1226);
            Context context2 = this.f8113;
            C2926 c2927 = c2926;
            C1461 c1462 = this.f8116;
            C2708 c2709 = new C2708(context2, c1462, obj, this.f8118, this.f8115, abstractC0379, i, i2, enumC2401, interfaceC2894, this.f8119, c2927, c1462.f5211, c1445.f5113);
            this.f8124 = true;
            C2556 c2559 = this.f8120;
            InterfaceC2554 interfaceC2554M4570 = c2559.m4570(obj, interfaceC2894, c2927, c1446, enumC2403, i3, i5, c2559);
            this.f8124 = false;
            c2927.f9387 = c2709;
            c2927.f9388 = interfaceC2554M4570;
            abstractC03710 = abstractC0379;
            c2708 = c2927;
        }
        if (interfaceC2559 == null) {
            return c2708;
        }
        C2556 c25510 = this.f8121;
        int i6 = c25510.f1771;
        int i7 = c25510.f1770;
        if (AbstractC3522.m5112(i, i2)) {
            C2556 c25511 = this.f8121;
            if (!AbstractC3522.m5112(c25511.f1771, c25511.f1770)) {
                i6 = abstractC03710.f1771;
                i7 = abstractC03710.f1770;
            }
        }
        int i8 = i7;
        C2556 c25512 = this.f8121;
        C1226 c1227 = interfaceC2559;
        InterfaceC2554 interfaceC2554M4571 = c25512.m4570(obj, interfaceC2894, c1227, c25512.f8117, c25512.f1768, i6, i8, c25512);
        c1227.f4442 = c2708;
        c1227.f4443 = interfaceC2554M4571;
        return c1227;
    }

    @Override // p000.AbstractC0379
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C2556 clone() {
        C2556 c2556 = (C2556) super.clone();
        c2556.f8117 = c2556.f8117.clone();
        if (c2556.f8119 != null) {
            c2556.f8119 = new ArrayList(c2556.f8119);
        }
        C2556 c2557 = c2556.f8120;
        if (c2557 != null) {
            c2556.f8120 = c2557.clone();
        }
        C2556 c2558 = c2556.f8121;
        if (c2558 != null) {
            c2556.f8121 = c2558.clone();
        }
        return c2556;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m4572(InterfaceC2894 interfaceC2894, AbstractC0379 abstractC0379) {
        AbstractC1460.m3209(interfaceC2894);
        if (!this.f8123) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC2554 interfaceC2554M4570 = m4570(new Object(), interfaceC2894, null, this.f8117, abstractC0379.f1768, abstractC0379.f1771, abstractC0379.f1770, abstractC0379);
        InterfaceC2554 interfaceC2554Mo1624 = interfaceC2894.mo1624();
        if (interfaceC2554M4570.mo2849(interfaceC2554Mo1624) && (abstractC0379.f1769 || !interfaceC2554Mo1624.mo2858())) {
            AbstractC1460.m3210(interfaceC2554Mo1624, "Argument must not be null");
            if (interfaceC2554Mo1624.isRunning()) {
                return;
            }
            interfaceC2554Mo1624.mo2857();
            return;
        }
        this.f8114.m4575(interfaceC2894);
        interfaceC2894.mo1618(interfaceC2554M4570);
        ComponentCallbacks2C2563 componentCallbacks2C2563 = this.f8114;
        synchronized (componentCallbacks2C2563) {
            componentCallbacks2C2563.f8138.f9314.add(interfaceC2894);
            C2712 c2712 = componentCallbacks2C2563.f8136;
            ((Set) c2712.f8760).add(interfaceC2554M4570);
            if (c2712.f8759) {
                interfaceC2554M4570.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) c2712.f8761).add(interfaceC2554M4570);
            } else {
                interfaceC2554M4570.mo2857();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final C2556 m4573(Object obj) {
        if (this.f1778) {
            return clone().m4573(obj);
        }
        this.f8118 = obj;
        this.f8123 = true;
        m1534();
        return this;
    }
}
