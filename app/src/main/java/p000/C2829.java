package p000;

import com.umeng.analytics.pro.g;
import java.lang.annotation.Annotation;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᛸᲇᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2829 implements InterfaceC1206, InterfaceC0767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0452 f9083;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1706 f9084;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final EnumC3672 f9085;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2829[] f9086;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1227 f9087;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f9088;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public String f9089;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public String f9090;

    public C2829(C0452 c0452, C1706 c1706, EnumC3672 enumC3672, C2829[] c2829Arr) {
        this.f9083 = c0452;
        this.f9084 = c1706;
        this.f9085 = enumC3672;
        this.f9086 = c2829Arr;
        this.f9087 = c1706.f5799;
        int iOrdinal = enumC3672.ordinal();
        if (c2829Arr != null) {
            C2829 c2829 = c2829Arr[iOrdinal];
            if (c2829 == null && c2829 == this) {
                return;
            }
            c2829Arr[iOrdinal] = this;
        }
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2242(InterfaceC2654 interfaceC2654) {
        C0452 c0452 = this.f9083;
        c0452.getClass();
        c0452.f2021 = false;
        c0452.m1674(this.f9085.f11468);
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC0767 mo2796(InterfaceC2654 interfaceC2654) {
        C2829 c2829;
        C1706 c1706 = this.f9084;
        EnumC3672 enumC3672M3987 = AbstractC2201.m3987(c1706, interfaceC2654);
        char c = enumC3672M3987.f11467;
        C0452 c0452 = this.f9083;
        c0452.m1674(c);
        c0452.f2021 = true;
        String str = this.f9089;
        if (str != null) {
            String strMo1342 = this.f9090;
            if (strMo1342 == null) {
                strMo1342 = interfaceC2654.mo1342();
            }
            c0452.m1672();
            mo2808(str);
            c0452.m1674(':');
            mo2808(strMo1342);
            this.f9089 = null;
            this.f9090 = null;
        }
        if (this.f9085 == enumC3672M3987) {
            return this;
        }
        C2829[] c2829Arr = this.f9086;
        return (c2829Arr == null || (c2829 = c2829Arr[enumC3672M3987.ordinal()]) == null) ? new C2829(c0452, c1706, enumC3672M3987, c2829Arr) : c2829;
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2243(C2395 c2395, int i, double d) {
        m4814(c2395, i);
        mo2799(d);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4814(InterfaceC2654 interfaceC2654, int i) {
        int iOrdinal = this.f9085.ordinal();
        C0452 c0452 = this.f9083;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!c0452.f2021) {
                c0452.m1674(',');
            }
            c0452.m1672();
            return;
        }
        if (iOrdinal == 2) {
            if (c0452.f2021) {
                this.f9088 = true;
                c0452.m1672();
                return;
            }
            if (i % 2 == 0) {
                c0452.m1674(',');
                c0452.m1672();
            } else {
                c0452.m1674(':');
                c0452.m1681();
                z = false;
            }
            this.f9088 = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!c0452.f2021) {
                c0452.m1674(',');
            }
            c0452.m1672();
            AbstractC1459.m3194(this.f9084, interfaceC2654);
            mo2808(interfaceC2654.mo3474(i));
            c0452.m1674(':');
            c0452.m1681();
            return;
        }
        if (i == 0) {
            this.f9088 = true;
        }
        if (i == 1) {
            c0452.m1674(',');
            c0452.m1681();
            this.f9088 = false;
        }
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2797() {
        this.f9083.m1677("null");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:49:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:19:0x0045->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo2798(InterfaceC1743 interfaceC1743, Object obj) {
        Iterator it;
        String strDiscriminator;
        Annotation annotation;
        C1706 c1706 = this.f9084;
        C1227 c1227 = c1706.f5799;
        c1227.getClass();
        boolean z = interfaceC1743 instanceof AbstractC0067;
        if (z) {
            it = interfaceC1743.mo1363().getAnnotations().iterator();
            while (true) {
                if (it.hasNext()) {
                    c1227.getClass();
                    strDiscriminator = g.y;
                    break;
                } else {
                    annotation = (Annotation) it.next();
                    if (annotation instanceof InterfaceC1711) {
                        strDiscriminator = ((InterfaceC1711) annotation).discriminator();
                        break;
                    }
                }
            }
        } else {
            int iM4759 = AbstractC2784.m4759(3);
            if (iM4759 != 0) {
                if (iM4759 == 1) {
                    AbstractC1460 abstractC1460Mo3472 = interfaceC1743.mo1363().mo3472();
                    if (AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9111) || AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9114)) {
                        it = interfaceC1743.mo1363().getAnnotations().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                c1227.getClass();
                                strDiscriminator = g.y;
                                break;
                            } else {
                                annotation = (Annotation) it.next();
                                if (annotation instanceof InterfaceC1711) {
                                    strDiscriminator = ((InterfaceC1711) annotation).discriminator();
                                    break;
                                }
                            }
                        }
                    }
                } else if (iM4759 != 2) {
                    throw new C0761();
                }
            }
            strDiscriminator = null;
        }
        if (z) {
            AbstractC1194.m2791(interfaceC1743);
            obj.getClass();
            throw null;
        }
        if (strDiscriminator != null) {
            InterfaceC2654 interfaceC2654Mo1363 = interfaceC1743.mo1363();
            AbstractC1459.m3194(c1706, interfaceC2654Mo1363);
            if (AbstractC2202.m3995(interfaceC2654Mo1363).contains(strDiscriminator)) {
                String strMo1342 = interfaceC1743.mo1363().mo1342();
                String strMo1343 = interfaceC1743.mo1363().mo1342();
                c1227.getClass();
                String strM4749 = AbstractC2784.m4749("as base class '", strMo1342, '\'');
                StringBuilder sb = new StringBuilder("Class '");
                sb.append(strMo1343);
                sb.append("' cannot be serialized ");
                sb.append(strM4749);
                sb.append(" because it has property name that conflicts with JSON class discriminator '");
                throw new C1713(AbstractC2784.m4752(sb, strDiscriminator, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            AbstractC1460 abstractC1460Mo3473 = interfaceC1743.mo1363().mo3472();
            if (abstractC1460Mo3473 instanceof C2658) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (abstractC1460Mo3473 instanceof AbstractC2398) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (abstractC1460Mo3473 instanceof AbstractC2375) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
            }
            String strMo1344 = interfaceC1743.mo1363().mo1342();
            this.f9089 = strDiscriminator;
            this.f9090 = strMo1344;
        }
        interfaceC1743.mo1542(this, obj);
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo2799(double d) {
        if (this.f9088) {
            mo2808(String.valueOf(d));
        } else {
            ((C0408) this.f9083.f2022).m1609(String.valueOf(d));
        }
        this.f9087.getClass();
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new C1713(AbstractC3681.m5334(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo2800(short s) {
        if (this.f9088) {
            mo2808(String.valueOf((int) s));
        } else {
            this.f9083.mo1678(s);
        }
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo2801(byte b) {
        if (this.f9088) {
            mo2808(String.valueOf((int) b));
        } else {
            this.f9083.mo1673(b);
        }
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final void mo2802(boolean z) {
        if (this.f9088) {
            mo2808(String.valueOf(z));
        } else {
            ((C0408) this.f9083.f2022).m1609(String.valueOf(z));
        }
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final InterfaceC1206 mo2803(InterfaceC2654 interfaceC2654) {
        boolean zM4815 = AbstractC2830.m4815(interfaceC2654);
        EnumC3672 enumC3672 = this.f9085;
        C1706 c1706 = this.f9084;
        C0452 c0764 = this.f9083;
        if (zM4815) {
            if (!(c0764 instanceof C0765)) {
                c0764 = new C0765((C0408) c0764.f2022, this.f9088);
            }
            return new C2829(c0764, c1706, enumC3672, null);
        }
        if (interfaceC2654.mo3358() && interfaceC2654.equals(AbstractC1716.f5810)) {
            if (!(c0764 instanceof C0764)) {
                c0764 = new C0764((C0408) c0764.f2022, this.f9088);
            }
            return new C2829(c0764, c1706, enumC3672, null);
        }
        if (this.f9089 != null) {
            this.f9090 = interfaceC2654.mo1342();
        }
        return this;
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final void mo2244(InterfaceC2654 interfaceC2654, int i, boolean z) {
        m4814(interfaceC2654, i);
        mo2802(z);
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo2245(InterfaceC2654 interfaceC2654, int i, InterfaceC1743 interfaceC1743, Object obj) {
        m4814(interfaceC2654, i);
        mo2798(interfaceC1743, obj);
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public final void mo2804(float f) {
        if (this.f9088) {
            mo2808(String.valueOf(f));
        } else {
            ((C0408) this.f9083.f2022).m1609(String.valueOf(f));
        }
        this.f9087.getClass();
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new C1713(AbstractC3681.m5334(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final void mo2246(C2395 c2395, int i, byte b) {
        m4814(c2395, i);
        mo2801(b);
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final void mo2805(char c) {
        mo2808(String.valueOf(c));
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final void mo2247(C2395 c2395, int i, float f) {
        m4814(c2395, i);
        mo2804(f);
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2248(C2395 c2395, int i, short s) {
        m4814(c2395, i);
        mo2800(s);
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public final void mo2249(int i, int i2, InterfaceC2654 interfaceC2654) {
        m4814(interfaceC2654, i);
        mo2806(i2);
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final void mo2250(InterfaceC2654 interfaceC2654, int i, String str) {
        m4814(interfaceC2654, i);
        mo2808(str);
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ */
    public final void mo2251(C2395 c2395, int i, char c) {
        m4814(c2395, i);
        mo2805(c);
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ */
    public final void mo2806(int i) {
        if (this.f9088) {
            mo2808(String.valueOf(i));
        } else {
            this.f9083.mo1675(i);
        }
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ */
    public final void mo2252(C2395 c2395, int i, long j) {
        m4814(c2395, i);
        mo2807(j);
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ */
    public final void mo2253(InterfaceC2654 interfaceC2654, int i, InterfaceC1743 interfaceC1743, Object obj) {
        if (obj == null) {
            this.f9087.getClass();
        }
        m4814(interfaceC2654, i);
        if (interfaceC1743.mo1363().mo3470()) {
            mo2798(interfaceC1743, obj);
        } else if (obj == null) {
            mo2797();
        } else {
            mo2798(interfaceC1743, obj);
        }
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ */
    public final void mo2807(long j) {
        if (this.f9088) {
            mo2808(String.valueOf(j));
        } else {
            this.f9083.mo1676(j);
        }
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ */
    public final boolean mo2254() {
        this.f9087.getClass();
        return false;
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public final InterfaceC1206 mo2255(C2395 c2395, int i) {
        m4814(c2395, i);
        return mo2803(c2395.mo3476(i));
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ */
    public final void mo2808(String str) {
        this.f9083.mo1679(str);
    }
}
