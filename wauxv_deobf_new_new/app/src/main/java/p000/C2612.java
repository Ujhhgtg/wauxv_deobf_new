package p000;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0027;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᲇᛸᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2612 extends AbstractC0354 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final Context f8266;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final ComponentCallbacks2C2619 f8267;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final Class f8268;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final C1472 f8269;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public C1453 f8270;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public Object f8271;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public ArrayList f8272;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public C2612 f8273;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public C2612 f8274;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f8275 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public boolean f8276;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public boolean f8277;

    static {
    }

    public C2612(ComponentCallbacks2C0027 componentCallbacks2C0027, ComponentCallbacks2C2619 componentCallbacks2C2619, Class cls, Context context) {
        C2621 c2621;
        this.f8267 = componentCallbacks2C2619;
        this.f8268 = cls;
        this.f8266 = context;
        C0274 c0274 = componentCallbacks2C2619.f8286.f591.f5242;
        C1453 c1453 = (C1453) c0274.get(cls);
        if (c1453 == null) {
            for (Map.Entry entry : (C0269) c0274.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c1453 = (C1453) entry.getValue();
                }
            }
        }
        this.f8270 = c1453 == null ? C1472.f5236 : c1453;
        this.f8269 = componentCallbacks2C0027.f591;
        Iterator it = componentCallbacks2C2619.f8294.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            m4590();
        }
        synchronized (componentCallbacks2C2619) {
            c2621 = componentCallbacks2C2619.f8295;
        }
        mo1632(c2621);
    }

    @Override // p000.AbstractC0354
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2612)) {
            return false;
        }
        C2612 c2612 = (C2612) obj;
        return super.equals(c2612) && Objects.equals(this.f8268, c2612.f8268) && this.f8270.equals(c2612.f8270) && Objects.equals(this.f8271, c2612.f8271) && Objects.equals(this.f8272, c2612.f8272) && Objects.equals(this.f8273, c2612.f8273) && Objects.equals(this.f8274, c2612.f8274) && this.f8275 == c2612.f8275 && this.f8276 == c2612.f8276;
    }

    @Override // p000.AbstractC0354
    public final int hashCode() {
        return AbstractC3580.m5122(this.f8276 ? 1 : 0, AbstractC3580.m5122(this.f8275 ? 1 : 0, AbstractC3580.m5123(AbstractC3580.m5123(AbstractC3580.m5123(AbstractC3580.m5123(AbstractC3580.m5123(AbstractC3580.m5123(AbstractC3580.m5123(super.hashCode(), this.f8268), this.f8270), this.f8271), this.f8272), this.f8273), this.f8274), null)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C2612 m4590() {
        if (this.f1749) {
            return clone().m4590();
        }
        m1640();
        return this;
    }

    @Override // p000.AbstractC0354
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C2612 mo1632(AbstractC0354 abstractC0354) {
        AbstractC2727.m4692(abstractC0354);
        return (C2612) super.mo1632(abstractC0354);
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
    public final InterfaceC2610 m4592(Object obj, InterfaceC2953 interfaceC2953, InterfaceC2614 interfaceC2614, C1453 c1453, EnumC2454 enumC2454, int i, int i2, AbstractC0354 abstractC0354) {
        InterfaceC2614 interfaceC2615;
        InterfaceC2614 c1229;
        AbstractC0354 abstractC0355;
        InterfaceC2610 c2769;
        EnumC2454 enumC2455;
        if (this.f8274 != null) {
            c1229 = new C1229(obj, interfaceC2614);
            interfaceC2615 = c1229;
        } else {
            interfaceC2615 = null;
            c1229 = interfaceC2614;
        }
        C2612 c2612 = this.f8273;
        if (c2612 == null) {
            Context context = this.f8266;
            C1472 c1472 = this.f8269;
            abstractC0355 = abstractC0354;
            c2769 = new C2769(context, c1472, obj, this.f8271, this.f8268, abstractC0355, i, i2, enumC2454, interfaceC2953, this.f8272, c1229, c1472.f5243, c1453.f5142);
        } else {
            if (this.f8277) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            C1453 c1454 = c2612.f8275 ? c1453 : c2612.f8270;
            if (AbstractC0354.m1631(c2612.f1737, 8)) {
                enumC2455 = this.f8273.f1739;
            } else {
                int iOrdinal = enumC2454.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    enumC2455 = EnumC2454.f7816;
                } else if (iOrdinal == 2) {
                    enumC2455 = EnumC2454.f7817;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f1739);
                    }
                    enumC2455 = EnumC2454.f7818;
                }
            }
            EnumC2454 enumC2456 = enumC2455;
            C2612 c2613 = this.f8273;
            int i3 = c2613.f1742;
            int i4 = c2613.f1741;
            if (AbstractC3580.m5124(i, i2)) {
                C2612 c2614 = this.f8273;
                if (!AbstractC3580.m5124(c2614.f1742, c2614.f1741)) {
                    i3 = abstractC0354.f1742;
                    i4 = abstractC0354.f1741;
                }
            }
            int i5 = i4;
            C2985 c2985 = new C2985(obj, c1229);
            Context context2 = this.f8266;
            C2985 c2986 = c2985;
            C1472 c1473 = this.f8269;
            C2769 c27610 = new C2769(context2, c1473, obj, this.f8271, this.f8268, abstractC0354, i, i2, enumC2454, interfaceC2953, this.f8272, c2986, c1473.f5243, c1453.f5142);
            this.f8277 = true;
            C2612 c2615 = this.f8273;
            InterfaceC2610 interfaceC2610M4592 = c2615.m4592(obj, interfaceC2953, c2986, c1454, enumC2456, i3, i5, c2615);
            this.f8277 = false;
            c2986.f9554 = c27610;
            c2986.f9555 = interfaceC2610M4592;
            abstractC0355 = abstractC0354;
            c2769 = c2986;
        }
        if (interfaceC2615 == null) {
            return c2769;
        }
        C2612 c2616 = this.f8274;
        int i6 = c2616.f1742;
        int i7 = c2616.f1741;
        if (AbstractC3580.m5124(i, i2)) {
            C2612 c2617 = this.f8274;
            if (!AbstractC3580.m5124(c2617.f1742, c2617.f1741)) {
                i6 = abstractC0355.f1742;
                i7 = abstractC0355.f1741;
            }
        }
        int i8 = i7;
        C2612 c2618 = this.f8274;
        C1229 c12210 = interfaceC2615;
        InterfaceC2610 interfaceC2610M4593 = c2618.m4592(obj, interfaceC2953, c12210, c2618.f8270, c2618.f1739, i6, i8, c2618);
        c12210.f4442 = c2769;
        c12210.f4443 = interfaceC2610M4593;
        return c12210;
    }

    @Override // p000.AbstractC0354
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C2612 clone() {
        C2612 c2612 = (C2612) super.clone();
        c2612.f8270 = c2612.f8270.clone();
        if (c2612.f8272 != null) {
            c2612.f8272 = new ArrayList(c2612.f8272);
        }
        C2612 c2613 = c2612.f8273;
        if (c2613 != null) {
            c2612.f8273 = c2613.clone();
        }
        C2612 c2614 = c2612.f8274;
        if (c2614 != null) {
            c2612.f8274 = c2614.clone();
        }
        return c2612;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m4594(InterfaceC2953 interfaceC2953, AbstractC0354 abstractC0354) {
        AbstractC2727.m4692(interfaceC2953);
        if (!this.f8276) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC2610 interfaceC2610M4592 = m4592(new Object(), interfaceC2953, null, this.f8270, abstractC0354.f1739, abstractC0354.f1742, abstractC0354.f1741, abstractC0354);
        InterfaceC2610 interfaceC2610Mo1730 = interfaceC2953.mo1730();
        if (interfaceC2610M4592.mo2975(interfaceC2610Mo1730) && (abstractC0354.f1740 || !interfaceC2610Mo1730.mo2984())) {
            AbstractC2727.m4693(interfaceC2610Mo1730, "Argument must not be null");
            if (interfaceC2610Mo1730.isRunning()) {
                return;
            }
            interfaceC2610Mo1730.mo2983();
            return;
        }
        this.f8267.m4597(interfaceC2953);
        interfaceC2953.mo1724(interfaceC2610M4592);
        ComponentCallbacks2C2619 componentCallbacks2C2619 = this.f8267;
        synchronized (componentCallbacks2C2619) {
            componentCallbacks2C2619.f8291.f9481.add(interfaceC2953);
            C2773 c2773 = componentCallbacks2C2619.f8289;
            ((Set) c2773.f8923).add(interfaceC2610M4592);
            if (c2773.f8922) {
                interfaceC2610M4592.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) c2773.f8924).add(interfaceC2610M4592);
            } else {
                interfaceC2610M4592.mo2983();
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final C2612 m4595(Object obj) {
        if (this.f1749) {
            return clone().m4595(obj);
        }
        this.f8271 = obj;
        this.f8276 = true;
        m1640();
        return this;
    }
}
