package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2436 extends AbstractC0592 implements InterfaceC0974, InterfaceC0766 {

    public final C2427 f7736;

    public final C2439 f7737;

    public final InterfaceC2654 f7738;

    public final int[] f7739;

    public HashMap f7740;

    public HashMap f7741;

    public boolean f7742;

    public final C1135 f7743;

    public C2436(C2427 c2427, C2439 c2439, InterfaceC2654 interfaceC2654) {
        super(1, false);
        this.f7736 = c2427;
        this.f7737 = c2439;
        this.f7738 = interfaceC2654;
        this.f7743 = new C1135(interfaceC2654, new C2435(2, this, C2436.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 0));
        int iMo3473 = interfaceC2654.mo3473();
        if (iMo3473 >= 32) {
            m4397(interfaceC2654, iMo3473);
            return;
        }
        int i = iMo3473 + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        for (int i3 = 0; i3 < iMo3473; i3++) {
            int iM3182 = AbstractC1459.m3182(interfaceC2654, i3);
            if (iM3182 > iMo3473 || iM3182 == -2) {
                m4397(interfaceC2654, iMo3473);
                return;
            }
            iArr[iM3182] = i3;
        }
        this.f7739 = iArr;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0071: MOVE (r14 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:114), block:B:32:0x0071 */
    public InterfaceC0766 mo2512(InterfaceC2654 interfaceC2654) {
        InterfaceC2654 interfaceC2655;
        Integer num;
        InterfaceC2654 interfaceC2656 = this.f7738;
        try {
            AbstractC1460 abstractC1460Mo3472 = interfaceC2654.mo3472();
            C2851 c2851 = C2851.f9112;
            boolean zM4087 = AbstractC2207.m4087(abstractC1460Mo3472, c2851);
            C2427 c2427 = this.f7736;
            C2439 c2439 = this.f7737;
            try {
                try {
                    if (zM4087) {
                        long jM2018 = m2018();
                        if (!AbstractC2207.m4087(interfaceC2656.mo3472(), c2851) || jM2018 == 19500 || interfaceC2656.equals(interfaceC2654)) {
                            return (c2439.f7750 == EnumC2434.SIZE_DELIMITED && AbstractC1459.m3193(interfaceC2654.mo3476(0))) ? new C2312(c2427, new C2439(c2439.m4405()), interfaceC2654) : new C2547(c2427, c2439, jM2018, interfaceC2654);
                        }
                        C2439 c2439M3991 = AbstractC2202.m3991(c2439, jM2018);
                        c2439M3991.m4416();
                        return new C2547(c2427, c2439M3991, 1, interfaceC2654);
                    }
                    if (!AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9111) && !AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9114) && !(abstractC1460Mo3472 instanceof AbstractC2375)) {
                        if (AbstractC2207.m4087(abstractC1460Mo3472, C2851.f9113)) {
                            return new C1893(c2427, new C2439(m2018() == 19500 ? c2439.m4406() : c2439.m4405()), m2018(), interfaceC2654);
                        }
                        throw new C1653("Primitives are not supported at top-level");
                    }
                    long jM2019 = m2018();
                    if (jM2019 == 19500 && AbstractC2207.m4087(interfaceC2656, interfaceC2654)) {
                        return this;
                    }
                    if (!AbstractC1459.m3192(jM2019)) {
                        return new C2436(c2427, AbstractC2202.m3991(c2439, jM2019), interfaceC2654);
                    }
                    int i = ((int) (jM2019 & 2147483647L)) - 1;
                    HashMap map = this.f7741;
                    if (map != null && (num = (Integer) map.get(Integer.valueOf(i))) != null) {
                        jM2019 = (jM2019 & 1152921500311879680L) | ((long) num.intValue());
                    }
                    return new C2291(c2427, c2439, jM2019, interfaceC2654);
                } catch (C2437 e) {
                    e = e;
                    throw new C2437("Fail to begin structure for " + interfaceC2655.mo1342() + " in " + interfaceC2656.mo1342() + " at proto number " + ((int) (m2018() & 2147483647L)), e);
                }
            } catch (C2437 e2) {
                e = e2;
                throw new C2437("Fail to begin structure for " + interfaceC2655.mo1342() + " in " + interfaceC2656.mo1342() + " at proto number " + ((int) (m2018() & 2147483647L)), e);
            }
        } catch (C2437 e3) {
            e = e3;
            interfaceC2655 = interfaceC2654;
        }
    }

    @Override // p000.InterfaceC0766
    public final InterfaceC0974 mo2229(C2395 c2395, int i) {
        long jMo3689 = mo3689(c2395, i);
        c2395.mo3476(i);
        m2024(jMo3689);
        return this;
    }

    @Override // p000.InterfaceC0974
    public final boolean mo2513() {
        return m4390(m2023());
    }

    @Override // p000.InterfaceC0974
    public final char mo2514() {
        return (char) m4393(m2023());
    }

    @Override // p000.InterfaceC0974
    public final Object mo2515(InterfaceC1743 interfaceC1743) {
        return m4389(interfaceC1743, null);
    }

    public int mo2230(InterfaceC2654 interfaceC2654) {
        int iIntValue;
        HashMap map;
        C2439 c2439 = this.f7737;
        while (true) {
            try {
                int iM4416 = c2439.m4416();
                C1135 c1135 = this.f7743;
                if (iM4416 == -1) {
                    return c1135.m2733();
                }
                if (iM4416 == 0) {
                    throw new C1653("0 is not allowed as the protobuf field number in " + interfaceC2654.mo1342() + ", the input bytes may have been corrupted");
                }
                int[] iArr = this.f7739;
                if (iArr != null) {
                    iIntValue = (iM4416 < 0 || iM4416 >= iArr.length) ? -1 : iArr[iM4416];
                } else {
                    Object obj = this.f7740.get(Integer.valueOf(iM4416));
                    if (obj == null) {
                        obj = -1;
                    }
                    iIntValue = ((Number) obj).intValue();
                }
                if (iIntValue != -1) {
                    if (AbstractC1459.m3192(AbstractC1459.m3181(interfaceC2654, iIntValue)) && (map = this.f7741) != null) {
                    }
                    if (iIntValue < 64) {
                        c1135.f4223 |= 1 << iIntValue;
                    } else {
                        int i = (iIntValue >>> 6) - 1;
                        long[] jArr = c1135.f4224;
                        jArr[i] = (1 << (iIntValue & 63)) | jArr[i];
                    }
                    return iIntValue;
                }
                c2439.m4417();
            } catch (C2437 e) {
                throw new C2437("Fail to get element index for " + interfaceC2654.mo1342() + " in " + this.f7738.mo1342(), e);
            }
        }
    }

    @Override // p000.InterfaceC0766
    public final double mo2231(C2395 c2395, int i) {
        return m4391(mo3689(c2395, i));
    }

    @Override // p000.InterfaceC0766
    public final char mo2232(C2395 c2395, int i) {
        return (char) m4393(mo3689(c2395, i));
    }

    @Override // p000.InterfaceC0766
    public final float mo2233(C2395 c2395, int i) {
        return m4392(mo3689(c2395, i));
    }

    @Override // p000.InterfaceC0766
    public final byte mo2234(C2395 c2395, int i) {
        return (byte) m4393(mo3689(c2395, i));
    }

    @Override // p000.InterfaceC0766
    public final String mo2235(InterfaceC2654 interfaceC2654, int i) {
        return mo4159(mo3689(interfaceC2654, i));
    }

    @Override // p000.InterfaceC0974
    public final int mo2516() {
        return m4393(m2023());
    }

    @Override // p000.InterfaceC0766
    public final short mo2236(C2395 c2395, int i) {
        return (short) m4393(mo3689(c2395, i));
    }

    @Override // p000.InterfaceC0974
    public final InterfaceC0974 mo2517(InterfaceC2654 interfaceC2654) {
        m2024(m2023());
        return this;
    }

    @Override // p000.InterfaceC0766
    public final Object mo2237(InterfaceC2654 interfaceC2654, int i, InterfaceC1743 interfaceC1743, Object obj) {
        m2024(mo3689(interfaceC2654, i));
        return m4389(interfaceC1743, obj);
    }

    @Override // p000.InterfaceC0766
    public final int mo2238(InterfaceC2654 interfaceC2654, int i) {
        return m4393(mo3689(interfaceC2654, i));
    }

    @Override // p000.InterfaceC0974
    public final String mo2518() {
        return mo4159(m2023());
    }

    @Override // p000.InterfaceC0974
    public final long mo2519() {
        return m4394(m2023());
    }

    @Override // p000.InterfaceC0974
    public final boolean mo2520() {
        return !this.f7742;
    }

    @Override // p000.InterfaceC0766
    public final Object mo2239(InterfaceC2654 interfaceC2654, int i, InterfaceC1743 interfaceC1743, Object obj) {
        m2024(mo3689(interfaceC2654, i));
        if (this.f7742) {
            return null;
        }
        return m4389(interfaceC1743, obj);
    }

    @Override // p000.InterfaceC0766
    public final long mo2240(C2395 c2395, int i) {
        return m4394(mo3689(c2395, i));
    }

    @Override // p000.InterfaceC0766
    public final boolean mo2241(InterfaceC2654 interfaceC2654, int i) {
        return m4390(mo3689(interfaceC2654, i));
    }

    @Override // p000.InterfaceC0974
    public final byte mo2521() {
        return (byte) m4393(m2023());
    }

    @Override // p000.InterfaceC0974
    public final short mo2522() {
        return (short) m4393(m2023());
    }

    @Override // p000.InterfaceC0974
    public final float mo2523() {
        return m4392(m2023());
    }

    @Override // p000.InterfaceC0974
    public final double mo2524() {
        return m4391(m2023());
    }

    public final Object m4389(InterfaceC1743 interfaceC1743, Object obj) {
        String string;
        C2851 c2851 = C2851.f9113;
        try {
            if (interfaceC1743 instanceof C1799) {
                return m4396(interfaceC1743, obj);
            }
            if (AbstractC2207.m4087(interfaceC1743.mo1363(), C0524.f2211.f7659)) {
                return m4395((byte[]) obj);
            }
            if (!AbstractC2207.m4087(interfaceC1743.mo1363(), C3475.f10969.f7659)) {
                return interfaceC1743 instanceof AbstractC0056 ? ((AbstractC0056) interfaceC1743).m929(this, obj) : interfaceC1743.mo924(this);
            }
            C3473 c3473 = (C3473) obj;
            byte[] bArr = c3473 != null ? c3473.f10966 : null;
            return new C3473(m4395(bArr != null ? bArr : null));
        } catch (C2437 e) {
            long jM2018 = m2018();
            InterfaceC2654 interfaceC2654Mo1363 = interfaceC1743.mo1363();
            InterfaceC2654 interfaceC2654 = this.f7738;
            if (AbstractC2207.m4087(interfaceC2654, interfaceC2654Mo1363)) {
                string = "Error while decoding " + interfaceC2654.mo1342();
            } else if (AbstractC2207.m4087(interfaceC2654.mo3472(), C2851.f9112) && !AbstractC2207.m4087(interfaceC1743.mo1363().mo3472(), c2851)) {
                StringBuilder sb = new StringBuilder("Error while decoding index ");
                sb.append(((int) (jM2018 & 2147483647L)) - 1);
                sb.append(" in repeated field of ");
                sb.append(interfaceC1743.mo1363().mo1342());
                string = sb.toString();
            } else if (AbstractC2207.m4087(interfaceC2654.mo3472(), c2851)) {
                int i = ((int) (jM2018 & 2147483647L)) - 1;
                int i2 = i / 2;
                string = "Error while decoding " + (i % 2 == 0 ? "key" : "value") + " of index " + i2 + " in map field of " + interfaceC1743.mo1363().mo1342();
            } else {
                string = "Error while decoding " + interfaceC1743.mo1363().mo1342() + " at proto number " + ((int) (jM2018 & 2147483647L)) + " of " + interfaceC2654.mo1342();
            }
            throw new C2437(string, e);
        }
    }

    public final boolean m4390(long j) {
        int iM4393 = m4393(j);
        if (iM4393 == 0) {
            return false;
        }
        if (iM4393 == 1) {
            return true;
        }
        throw new C1653(AbstractC1194.m2779(iM4393, "Unexpected boolean value: "));
    }

    public final double m4391(long j) {
        C2439 c2439 = this.f7737;
        try {
            return j == 19500 ? Double.longBitsToDouble(c2439.m4414()) : c2439.m4409();
        } catch (C2437 e) {
            throw new C2437("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f7738.mo1342(), e);
        }
    }

    public final float m4392(long j) {
        C2439 c2439 = this.f7737;
        try {
            return j == 19500 ? Float.intBitsToFloat(c2439.m4412()) : c2439.m4410();
        } catch (C2437 e) {
            throw new C2437("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f7738.mo1342(), e);
        }
    }

    public final int m4393(long j) {
        C2439 c2439 = this.f7737;
        try {
            return j == 19500 ? c2439.m4403(EnumC2429.DEFAULT) : c2439.m4411(AbstractC1459.m3187(j));
        } catch (C2437 e) {
            throw new C2437("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f7738.mo1342(), e);
        }
    }

    public final long m4394(long j) {
        C2439 c2439 = this.f7737;
        try {
            return j == 19500 ? c2439.m4404(EnumC2429.DEFAULT) : c2439.m4413(AbstractC1459.m3187(j));
        } catch (C2437 e) {
            throw new C2437("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f7738.mo1342(), e);
        }
    }

    public String mo4159(long j) {
        C2439 c2439 = this.f7737;
        try {
            if (j != 19500) {
                return c2439.m4415();
            }
            int iM4403 = c2439.m4403(EnumC2429.DEFAULT);
            C2439.m4402(iM4403);
            C0521 c0521 = c2439.f7748;
            byte[] bArr = c0521.f2205;
            int i = c0521.f2204;
            int i2 = i + iM4403;
            AbstractC2665.m4660(i, i2, bArr.length);
            String str = new String(bArr, i, i2 - i, AbstractC0599.f2413);
            c0521.f2204 += iM4403;
            return str;
        } catch (C2437 e) {
            throw new C2437("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f7738.mo1342(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [long] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v9, types: [byte[]] */
    public final byte[] m4395(byte[] bArr) {
        byte[] bArrM4407;
        byte[] bArrM4408;
        long jM2018 = m2018();
        C2439 c2439 = this.f7737;
        try {
            if (jM2018 == 19500) {
                bArrM4408 = c2439.m4408();
            } else {
                bArrM4407 = c2439.m4407();
            }
            if (bArr == null) {
                jM2018 = bArrM4407;
                jM2018 = bArrM4408;
                return jM2018;
            }
            jM2018 = bArrM4407;
            jM2018 = bArrM4408;
            return AbstractC0270.m1388(bArr, jM2018);
        } catch (C2437 e) {
            throw new C2437("Error while decoding proto number " + ((int) (jM2018 & 2147483647L)) + " of " + this.f7738.mo1342(), e);
        }
    }

    public final LinkedHashMap m4396(InterfaceC1743 interfaceC1743, Object obj) {
        
        C2839 c2839 = C2839.f9108;
        C1717 c1717 = C1717.f5811;
        C1895 c1895 = new C1895(0);
        Map map = obj instanceof Map ? (Map) obj : null;
        Set<Map.Entry> set = (Set) new C0258(c1895).m929(this, map != null ? map.entrySet() : null);
        int iM3693 = AbstractC1898.m3693(AbstractC0746.m2214(set, 10));
        if (iM3693 < 16) {
            iM3693 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM3693);
        for (Map.Entry entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public long mo3689(InterfaceC2654 interfaceC2654, int i) {
        return AbstractC1459.m3181(interfaceC2654, i);
    }

    public final void m4397(InterfaceC2654 interfaceC2654, int i) {
        HashMap map = new HashMap(i, 1.0f);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (AbstractC1459.m3182(interfaceC2654, i3) == -2) {
                List listM3184 = AbstractC1459.m3184(interfaceC2654.mo3476(i3));
                ArrayList arrayList = new ArrayList(AbstractC0746.m2214(listM3184, 10));
                Iterator it = listM3184.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf((int) (AbstractC1459.m3181((InterfaceC2654) it.next(), 0) & 2147483647L)));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    map.put(Integer.valueOf(((Number) it2.next()).intValue()), Integer.valueOf(i3));
                }
                i2++;
            } else {
                map.put(Integer.valueOf(AbstractC1459.m3182(interfaceC2654, i3)), Integer.valueOf(i3));
            }
        }
        if (i2 > 0) {
            this.f7741 = new HashMap(i2, 1.0f);
        }
        this.f7740 = map;
    }

    @Override // p000.InterfaceC0766
    public final void mo2228(InterfaceC2654 interfaceC2654) {
    }
}
