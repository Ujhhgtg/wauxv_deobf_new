package p000;

import java.lang.annotation.Annotation;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᛸᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2889 implements InterfaceC1207, InterfaceC0765 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0427 f9245;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final AbstractC1725 f9246;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final EnumC3732 f9247;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2889[] f9248;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1732 f9249;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f9250;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public String f9251;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public String f9252;

    public C2889(C0427 c0427, AbstractC1725 abstractC1725, EnumC3732 enumC3732, C2889[] c2889Arr) {
        this.f9245 = c0427;
        this.f9246 = abstractC1725;
        this.f9247 = enumC3732;
        this.f9248 = c2889Arr;
        this.f9249 = abstractC1725.f5842;
        int iOrdinal = enumC3732.ordinal();
        if (c2889Arr != null) {
            C2889 c2889 = c2889Arr[iOrdinal];
            if (c2889 == null && c2889 == this) {
                return;
            }
            c2889Arr[iOrdinal] = this;
        }
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2343(InterfaceC2715 interfaceC2715) {
        C0427 c0427 = this.f9245;
        c0427.mo1790();
        c0427.mo1780();
        c0427.m1782(this.f9247.f11617);
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC0765 mo2918(InterfaceC2715 interfaceC2715) {
        C2889 c2889;
        AbstractC1725 abstractC1725 = this.f9246;
        EnumC3732 enumC3732M4237 = AbstractC2236.m4237(abstractC1725, interfaceC2715);
        char c = enumC3732M4237.f11616;
        C0427 c0427 = this.f9245;
        c0427.m1782(c);
        c0427.mo1777();
        String str = this.f9251;
        if (str != null) {
            String strMo1488 = this.f9252;
            if (strMo1488 == null) {
                strMo1488 = interfaceC2715.mo1488();
            }
            c0427.mo1779();
            mo2930(str);
            c0427.m1782(':');
            c0427.mo1789();
            mo2930(strMo1488);
            this.f9251 = null;
            this.f9252 = null;
        }
        if (this.f9247 == enumC3732M4237) {
            return this;
        }
        C2889[] c2889Arr = this.f9248;
        return (c2889Arr == null || (c2889 = c2889Arr[enumC3732M4237.ordinal()]) == null) ? new C2889(c0427, abstractC1725, enumC3732M4237, c2889Arr) : c2889;
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2344(C2448 c2448, int i, double d) {
        m4847(c2448, i);
        mo2921(d);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4847(InterfaceC2715 interfaceC2715, int i) {
        int iOrdinal = this.f9247.ordinal();
        C0427 c0427 = this.f9245;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!c0427.f1993) {
                c0427.m1782(',');
            }
            c0427.mo1779();
            return;
        }
        if (iOrdinal == 2) {
            if (c0427.f1993) {
                this.f9250 = true;
                c0427.mo1779();
                return;
            }
            if (i % 2 == 0) {
                c0427.m1782(',');
                c0427.mo1779();
            } else {
                c0427.m1782(':');
                c0427.mo1789();
                z = false;
            }
            this.f9250 = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!c0427.f1993) {
                c0427.m1782(',');
            }
            c0427.mo1779();
            AbstractC1467.m3281(this.f9246, interfaceC2715);
            mo2930(interfaceC2715.mo3642(i));
            c0427.m1782(':');
            c0427.mo1789();
            return;
        }
        if (i == 0) {
            this.f9250 = true;
        }
        if (i == 1) {
            c0427.m1782(',');
            c0427.mo1789();
            this.f9250 = false;
        }
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2919() {
        this.f9245.m1785("null");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:54:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[LOOP:0: B:18:0x0045->B:56:?, LOOP_END, SYNTHETIC] */
    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo2920(InterfaceC1767 interfaceC1767, Object obj) {
        Iterator it;
        String strDiscriminator;
        Annotation annotation;
        AbstractC1725 abstractC1725 = this.f9246;
        C1732 c1732 = abstractC1725.f5842;
        int i = c1732.f5866;
        boolean z = interfaceC1767 instanceof AbstractC0075;
        if (!z) {
            int iM4792 = AbstractC2844.m4792(i);
            if (iM4792 != 0) {
                if (iM4792 == 1) {
                    AbstractC2236 abstractC2236Mo3640 = interfaceC1767.mo1509().mo3640();
                    if (AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9280) || AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9283)) {
                        it = interfaceC1767.mo1509().getAnnotations().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                strDiscriminator = c1732.f5864;
                                break;
                            }
                            annotation = (Annotation) it.next();
                            if (annotation instanceof InterfaceC1731) {
                                strDiscriminator = ((InterfaceC1731) annotation).discriminator();
                                break;
                            }
                        }
                    }
                } else if (iM4792 != 2) {
                    throw new C0758();
                }
            }
            strDiscriminator = null;
        } else if (i != 1) {
            it = interfaceC1767.mo1509().getAnnotations().iterator();
            while (true) {
                if (it.hasNext()) {
                    strDiscriminator = c1732.f5864;
                    break;
                }
                annotation = (Annotation) it.next();
                if (annotation instanceof InterfaceC1731) {
                    strDiscriminator = ((InterfaceC1731) annotation).discriminator();
                    break;
                }
            }
        } else {
            strDiscriminator = null;
        }
        if (z) {
            AbstractC1095.m2807(interfaceC1767);
            obj.getClass();
            throw null;
        }
        if (strDiscriminator != null) {
            InterfaceC2715 interfaceC2715Mo1509 = interfaceC1767.mo1509();
            AbstractC1467.m3281(abstractC1725, interfaceC2715Mo1509);
            if (AbstractC1586.m3469(interfaceC2715Mo1509).contains(strDiscriminator)) {
                String strMo1488 = interfaceC1767.mo1509().mo1488();
                String strMo1489 = interfaceC1767.mo1509().mo1488();
                String strM4783 = (c1732.f5866 == 2 && AbstractC1469.m3322(strMo1488, strMo1489)) ? "in ALL_JSON_OBJECTS class discriminator mode" : AbstractC2844.m4783("as base class '", strMo1488, '\'');
                StringBuilder sb = new StringBuilder("Class '");
                sb.append(strMo1489);
                sb.append("' cannot be serialized ");
                sb.append(strM4783);
                sb.append(" because it has property name that conflicts with JSON class discriminator '");
                throw new C1734(AbstractC2844.m4786(sb, strDiscriminator, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            AbstractC2236 abstractC2236Mo3641 = interfaceC1767.mo1509().mo3640();
            if (abstractC2236Mo3641 instanceof C2719) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (abstractC2236Mo3641 instanceof AbstractC2451) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (abstractC2236Mo3641 instanceof AbstractC2428) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
            }
            String strMo14810 = interfaceC1767.mo1509().mo1488();
            this.f9251 = strDiscriminator;
            this.f9252 = strMo14810;
        }
        interfaceC1767.mo1648(this, obj);
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo2921(double d) {
        if (this.f9250) {
            mo2930(String.valueOf(d));
        } else {
            ((C0383) this.f9245.f1994).m1715(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new C1734(AbstractC2234.m4179(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo2922(short s) {
        if (this.f9250) {
            mo2930(String.valueOf((int) s));
        } else {
            this.f9245.mo1786(s);
        }
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo2923(byte b) {
        if (this.f9250) {
            mo2930(String.valueOf((int) b));
        } else {
            this.f9245.mo1781(b);
        }
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final void mo2924(boolean z) {
        if (this.f9250) {
            mo2930(String.valueOf(z));
        } else {
            ((C0383) this.f9245.f1994).m1715(String.valueOf(z));
        }
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final InterfaceC1207 mo2925(InterfaceC2715 interfaceC2715) {
        boolean zM4848 = AbstractC2890.m4848(interfaceC2715);
        EnumC3732 enumC3732 = this.f9247;
        AbstractC1725 abstractC1725 = this.f9246;
        C0427 c0761 = this.f9245;
        if (zM4848) {
            if (!(c0761 instanceof C0762)) {
                c0761 = new C0762((C0383) c0761.f1994, this.f9250);
            }
            return new C2889(c0761, abstractC1725, enumC3732, null);
        }
        if (interfaceC2715.mo3522() && interfaceC2715.equals(AbstractC1737.f5870)) {
            if (!(c0761 instanceof C0761)) {
                c0761 = new C0761((C0383) c0761.f1994, this.f9250);
            }
            return new C2889(c0761, abstractC1725, enumC3732, null);
        }
        if (this.f9251 != null) {
            this.f9252 = interfaceC2715.mo1488();
        }
        return this;
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final void mo2345(InterfaceC2715 interfaceC2715, int i, boolean z) {
        m4847(interfaceC2715, i);
        mo2924(z);
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo2346(InterfaceC2715 interfaceC2715, int i, InterfaceC1767 interfaceC1767, Object obj) {
        m4847(interfaceC2715, i);
        mo2920(interfaceC1767, obj);
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public final void mo2926(float f) {
        if (this.f9250) {
            mo2930(String.valueOf(f));
        } else {
            ((C0383) this.f9245.f1994).m1715(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new C1734(AbstractC2234.m4179(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final void mo2347(C2448 c2448, int i, byte b) {
        m4847(c2448, i);
        mo2923(b);
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final void mo2927(char c) {
        mo2930(String.valueOf(c));
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final void mo2348(C2448 c2448, int i, float f) {
        m4847(c2448, i);
        mo2926(f);
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2349(C2448 c2448, int i, short s) {
        m4847(c2448, i);
        mo2922(s);
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public final void mo2350(int i, int i2, InterfaceC2715 interfaceC2715) {
        m4847(interfaceC2715, i);
        mo2928(i2);
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final void mo2351(InterfaceC2715 interfaceC2715, int i, String str) {
        m4847(interfaceC2715, i);
        mo2930(str);
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ */
    public final void mo2352(C2448 c2448, int i, char c) {
        m4847(c2448, i);
        mo2927(c);
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ */
    public final void mo2928(int i) {
        if (this.f9250) {
            mo2930(String.valueOf(i));
        } else {
            this.f9245.mo1783(i);
        }
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ */
    public final void mo2353(C2448 c2448, int i, long j) {
        m4847(c2448, i);
        mo2929(j);
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ */
    public final void mo2354(InterfaceC2715 interfaceC2715, int i, InterfaceC1767 interfaceC1767, Object obj) {
        if (obj != null || this.f9249.f5862) {
            m4847(interfaceC2715, i);
            if (interfaceC1767.mo1509().mo3638()) {
                mo2920(interfaceC1767, obj);
            } else if (obj == null) {
                mo2919();
            } else {
                mo2920(interfaceC1767, obj);
            }
        }
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ */
    public final void mo2929(long j) {
        if (this.f9250) {
            mo2930(String.valueOf(j));
        } else {
            this.f9245.mo1784(j);
        }
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ */
    public final boolean mo2355() {
        return false;
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public final InterfaceC1207 mo2356(C2448 c2448, int i) {
        m4847(c2448, i);
        return mo2925(c2448.mo3644(i));
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ */
    public final void mo2930(String str) {
        this.f9245.mo1787(str);
    }
}
