package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᲁᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2438 extends AbstractC0592 implements InterfaceC1206, InterfaceC0767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f7744;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2427 f7745;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1744 f7746;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC2654 f7747;

    public C2438(C2427 c2427, C1744 c1744, InterfaceC2654 interfaceC2654) {
        super(1, false);
        this.f7744 = 5;
        this.f7745 = c2427;
        this.f7746 = c1744;
        this.f7747 = interfaceC2654;
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2242(InterfaceC2654 interfaceC2654) {
        int i = this.f2399;
        if (i >= 0) {
            if (i < 0) {
                throw new C1653("No tag in stack for requested element");
            }
            long[] jArr = (long[]) this.f2400;
            this.f2399 = i - 1;
            long j = jArr[i];
        }
        mo3942(interfaceC2654);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public InterfaceC0767 mo2796(InterfaceC2654 interfaceC2654) {
        AbstractC1460 abstractC1460Mo3472 = interfaceC2654.mo3472();
        boolean zM4087 = AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9112);
        C1744 c1744 = this.f7746;
        if (zM4087) {
            if (!AbstractC1459.m3193(interfaceC2654.mo3476(0)) || (m2018() & JSONWriter.MASK_IGNORE_NON_FIELD_GETTER) == 0) {
                return new C2548(m2018(), c1744, this.f7745, interfaceC2654);
            }
            return new C2313(m2018(), c1744, this.f7745, interfaceC2654);
        }
        if (!AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9111) && !AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9114) && !(abstractC1460Mo3472 instanceof AbstractC2375)) {
            if (AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9113)) {
                return new C1897(m2018(), c1744, this.f7745, interfaceC2654);
            }
            throw new C1653("This serial kind is not supported as structure: " + interfaceC2654);
        }
        long jM2018 = m2018();
        if (jM2018 == 19500 && interfaceC2654.equals(this.f7747)) {
            return this;
        }
        if (AbstractC1459.m3192(jM2018)) {
            return new C2290(this.f7745, c1744, interfaceC2654);
        }
        return new C2132(m2018(), c1744, this.f7745, interfaceC2654);
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2243(C2395 c2395, int i, double d) {
        m4398(mo3691(c2395, i), d);
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2797() {
        String str;
        int i = this.f7744;
        if (i != 1) {
            int iM4759 = AbstractC2784.m4759(i);
            if (iM4759 == 1) {
                str = "'null' is not supported for optional properties in ProtoBuf";
            } else if (iM4759 == 2) {
                str = "'null' is not supported as the value of collection types in ProtoBuf";
            } else if (iM4759 != 3) {
                str = iM4759 != 4 ? "'null' is not supported in ProtoBuf" : "'null' is not allowed for not-null properties";
            } else {
                str = "'null' is not supported as the value of a list element in ProtoBuf";
            }
            throw new C1653(str);
        }
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo2798(InterfaceC1743 interfaceC1743, Object obj) {
        if (interfaceC1743 instanceof C1799) {
            C2839 c2839 = C2839.f9108;
            C1717 c1717 = C1717.f5811;
            C1895 c1895 = new C1895(0);
            C0254 c0254 = new C0254((C2656) c1895.f6263, 2);
            Set setEntrySet = ((Map) obj).entrySet();
            int size = setEntrySet.size();
            InterfaceC0767 interfaceC0767Mo2809 = mo2809(c0254, size);
            Iterator it = setEntrySet.iterator();
            for (int i = 0; i < size; i++) {
                interfaceC0767Mo2809.mo2245(c0254, i, c1895, it.next());
            }
            interfaceC0767Mo2809.mo2242(c0254);
            return;
        }
        boolean zM4087 = AbstractC2207.m4087(interfaceC1743.mo1363(), C0524.f2211.f7659);
        EnumC2429 enumC2429 = EnumC2429.DEFAULT;
        C1744 c1744 = this.f7746;
        if (zM4087) {
            byte[] bArr = (byte[]) obj;
            long jM2023 = m2023();
            if (jM2023 == 19500) {
                c1744.m3494(bArr);
                return;
            }
            c1744.m3487((C0523) c1744.f5843, EnumC2434.SIZE_DELIMITED.m4388((int) (2147483647L & jM2023)), enumC2429);
            c1744.m3494(bArr);
            return;
        }
        if (!AbstractC2207.m4087(interfaceC1743.mo1363(), C3475.f10969.f7659)) {
            interfaceC1743.mo1542(this, obj);
            return;
        }
        byte[] bArr2 = ((C3473) obj).f10966;
        long jM2024 = m2023();
        if (jM2024 == 19500) {
            c1744.m3494(bArr2);
            return;
        }
        c1744.m3487((C0523) c1744.f5843, EnumC2434.SIZE_DELIMITED.m4388((int) (2147483647L & jM2024)), enumC2429);
        c1744.m3494(bArr2);
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo2799(double d) {
        m4398(m2023(), d);
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo2800(short s) {
        m4400(s, m2023());
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo2801(byte b) {
        m4400(b, m2023());
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final void mo2802(boolean z) {
        m4400(z ? 1 : 0, m2023());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public InterfaceC1206 mo2803(InterfaceC2654 interfaceC2654) {
        m2024(m2023());
        return this;
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final void mo2244(InterfaceC2654 interfaceC2654, int i, boolean z) {
        m4400(z ? 1 : 0, mo3691(interfaceC2654, i));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo2245(InterfaceC2654 interfaceC2654, int i, InterfaceC1743 interfaceC1743, Object obj) {
        int i2;
        if (interfaceC2654.mo3477(i)) {
            i2 = 2;
        } else {
            InterfaceC2654 interfaceC2654Mo3476 = interfaceC2654.mo3476(i);
            if (interfaceC2654Mo3476.mo3470()) {
                AbstractC1460 abstractC1460Mo3472 = interfaceC2654Mo3476.mo3472();
                if (AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9113)) {
                    i2 = 3;
                } else {
                    C2851 c2851 = C2851.f9112;
                    if (AbstractC2207.m4087(abstractC1460Mo3472, c2851)) {
                        i2 = 3;
                    } else {
                        i2 = AbstractC2207.m4087(interfaceC2654.mo3472(), c2851) ? 4 : 1;
                    }
                }
            } else {
                i2 = 5;
            }
        }
        this.f7744 = i2;
        m2024(mo3691(interfaceC2654, i));
        mo2798(interfaceC1743, obj);
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public final void mo2804(float f) {
        m4399(m2023(), f);
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final void mo2246(C2395 c2395, int i, byte b) {
        m4400(b, mo3691(c2395, i));
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final void mo2805(char c) {
        m4400(c, m2023());
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final void mo2247(C2395 c2395, int i, float f) {
        m4399(mo3691(c2395, i), f);
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2248(C2395 c2395, int i, short s) {
        m4400(s, mo3691(c2395, i));
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public final void mo2249(int i, int i2, InterfaceC2654 interfaceC2654) {
        m4400(i2, mo3691(interfaceC2654, i));
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final void mo2250(InterfaceC2654 interfaceC2654, int i, String str) {
        mo4158(mo3691(interfaceC2654, i), str);
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ */
    public final void mo2251(C2395 c2395, int i, char c) {
        m4400(c, mo3691(c2395, i));
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ */
    public final void mo2806(int i) {
        m4400(i, m2023());
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ */
    public final void mo2252(C2395 c2395, int i, long j) {
        m4401(mo3691(c2395, i), j);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ */
    public final void mo2253(InterfaceC2654 interfaceC2654, int i, InterfaceC1743 interfaceC1743, Object obj) {
        int i2;
        if (interfaceC2654.mo3477(i)) {
            i2 = 2;
        } else {
            AbstractC1460 abstractC1460Mo3472 = interfaceC2654.mo3476(i).mo3472();
            if (AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9113)) {
                i2 = 3;
            } else {
                C2851 c2851 = C2851.f9112;
                if (AbstractC2207.m4087(abstractC1460Mo3472, c2851)) {
                    i2 = 3;
                } else {
                    i2 = AbstractC2207.m4087(interfaceC2654.mo3472(), c2851) ? 4 : 1;
                }
            }
        }
        this.f7744 = i2;
        m2024(mo3691(interfaceC2654, i));
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
        m4401(m2023(), j);
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ */
    public final boolean mo2254() {
        this.f7745.getClass();
        return false;
    }

    @Override // p000.InterfaceC0767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public final InterfaceC1206 mo2255(C2395 c2395, int i) {
        long jMo3691 = mo3691(c2395, i);
        c2395.mo3476(i);
        m2024(jMo3691);
        return this;
    }

    @Override // p000.InterfaceC1206
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ */
    public final void mo2808(String str) {
        mo4158(m2023(), str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ */
    public InterfaceC0767 mo2809(InterfaceC2654 interfaceC2654, int i) {
        AbstractC1460 abstractC1460Mo3472 = interfaceC2654.mo3472();
        C2851 c2851 = C2851.f9112;
        boolean zM4087 = AbstractC2207.m4087(abstractC1460Mo3472, c2851);
        C1744 c1744 = this.f7746;
        if (!zM4087) {
            if (AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9113)) {
                return new C1897(((long[]) this.f2400)[this.f2399], c1744, this.f7745, interfaceC2654);
            }
            throw new C1653("This serial kind is not supported as collection: " + interfaceC2654);
        }
        long jM2018 = m2018();
        if ((JSONWriter.MASK_IGNORE_NON_FIELD_GETTER & jM2018) != 0 && AbstractC1459.m3193(interfaceC2654.mo3476(0))) {
            return new C2313(m2018(), c1744, this.f7745, interfaceC2654);
        }
        if (jM2018 == 19500) {
            c1744.m3487((C0523) c1744.f5843, i, EnumC2429.DEFAULT);
        }
        InterfaceC2654 interfaceC2655 = this.f7747;
        if (!AbstractC2207.m4087(interfaceC2655.mo3472(), c2851) || jM2018 == 19500 || interfaceC2655.equals(interfaceC2654)) {
            return new C2548(jM2018, c1744, this.f7745, interfaceC2654);
        }
        return new C2132(this.f7745, c1744, jM2018, interfaceC2654, new C0523());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
    public final void m4398(long j, double d) {
        C1744 c1744 = this.f7746;
        C0523 c0523 = (C0523) c1744.f5843;
        if (j == 19500) {
            c0523.m1850(Long.reverseBytes(Double.doubleToRawLongBits(d)));
            return;
        }
        c1744.m3487(c0523, EnumC2434.i64.m4388((int) (j & 2147483647L)), EnumC2429.DEFAULT);
        c0523.m1850(Long.reverseBytes(Double.doubleToRawLongBits(d)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ, reason: contains not printable characters */
    public final void m4399(long j, float f) {
        C1744 c1744 = this.f7746;
        C0523 c0523 = (C0523) c1744.f5843;
        if (j == 19500) {
            c0523.m1849(Integer.reverseBytes(Float.floatToRawIntBits(f)));
            return;
        }
        c1744.m3487(c0523, EnumC2434.i32.m4388((int) (j & 2147483647L)), EnumC2429.DEFAULT);
        c0523.m1849(Integer.reverseBytes(Float.floatToRawIntBits(f)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public final void m4400(int i, long j) {
        C1744 c1744 = this.f7746;
        C0523 c0523 = (C0523) c1744.f5843;
        EnumC2429 enumC2429 = EnumC2429.DEFAULT;
        if (j == 19500) {
            c1744.m3487(c0523, i, enumC2429);
            return;
        }
        int i2 = (int) (2147483647L & j);
        EnumC2429 enumC2429M3187 = AbstractC1459.m3187(j);
        c1744.m3487(c0523, (enumC2429M3187 == EnumC2429.FIXED ? EnumC2434.i32 : EnumC2434.VARINT).m4388(i2), enumC2429);
        c1744.m3487(c0523, i, enumC2429M3187);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public final void m4401(long j, long j2) {
        C1744 c1744 = this.f7746;
        C0523 c0523 = (C0523) c1744.f5843;
        EnumC2429 enumC2429 = EnumC2429.DEFAULT;
        if (j == 19500) {
            c1744.m3488(c0523, j2, enumC2429);
            return;
        }
        int i = (int) (2147483647L & j);
        EnumC2429 enumC2429M3187 = AbstractC1459.m3187(j);
        c1744.m3487(c0523, (enumC2429M3187 == EnumC2429.FIXED ? EnumC2434.i64 : EnumC2434.VARINT).m4388(i), enumC2429);
        c1744.m3488(c0523, j2, enumC2429M3187);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ */
    public void mo4158(long j, String str) {
        C1744 c1744 = this.f7746;
        if (j == 19500) {
            c1744.m3494(str.getBytes(AbstractC0599.f2413));
            return;
        }
        byte[] bytes = str.getBytes(AbstractC0599.f2413);
        c1744.m3487((C0523) c1744.f5843, EnumC2434.SIZE_DELIMITED.m4388((int) (j & 2147483647L)), EnumC2429.DEFAULT);
        c1744.m3494(bytes);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ */
    public long mo3691(InterfaceC2654 interfaceC2654, int i) {
        return AbstractC1459.m3181(interfaceC2654, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ */
    public void mo3942(InterfaceC2654 interfaceC2654) {
    }
}
