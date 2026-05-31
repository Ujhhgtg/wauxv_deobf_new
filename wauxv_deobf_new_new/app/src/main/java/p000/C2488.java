package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲁᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2488 extends AbstractC0573 implements InterfaceC0978, InterfaceC0764 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2480 f7880;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2491 f7881;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC2715 f7882;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int[] f7883;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public HashMap f7884;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public HashMap f7885;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean f7886;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C1141 f7887;

    public C2488(C2480 c2480, C2491 c2491, InterfaceC2715 interfaceC2715) {
        super(1, false);
        this.f7880 = c2480;
        this.f7881 = c2491;
        this.f7882 = interfaceC2715;
        this.f7887 = new C1141(interfaceC2715, new C1738(2, this, C2488.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 0, 1));
        int iMo3641 = interfaceC2715.mo3641();
        if (iMo3641 >= 32) {
            m4418(interfaceC2715, iMo3641);
            return;
        }
        int i = iMo3641 + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        for (int i3 = 0; i3 < iMo3641; i3++) {
            int iM4247 = AbstractC2240.m4247(interfaceC2715, i3);
            if (iM4247 > iMo3641 || iM4247 == -2) {
                m4418(interfaceC2715, iMo3641);
                return;
            }
            iArr[iM4247] = i3;
        }
        this.f7883 = iArr;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0071: MOVE (r14 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:114), block:B:32:0x0071 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public InterfaceC0764 mo2636(InterfaceC2715 interfaceC2715) {
        InterfaceC2715 interfaceC2716;
        Integer num;
        InterfaceC2715 interfaceC2717 = this.f7882;
        try {
            AbstractC2236 abstractC2236Mo3640 = interfaceC2715.mo3640();
            C2911 c2911 = C2911.f9281;
            boolean zM3322 = AbstractC1469.m3322(abstractC2236Mo3640, c2911);
            C2480 c2480 = this.f7880;
            C2491 c2491 = this.f7881;
            try {
                try {
                    if (zM3322) {
                        long jM2115 = m2115();
                        if (!AbstractC1469.m3322(interfaceC2717.mo3640(), c2911) || jM2115 == 19500 || interfaceC2717.equals(interfaceC2715)) {
                            return (c2491.f7894 == EnumC2487.SIZE_DELIMITED && AbstractC2240.m4258(interfaceC2715.mo3644(0))) ? new C2345(c2480, new C2491(c2491.m4426()), interfaceC2715) : new C2603(c2480, c2491, jM2115, interfaceC2715);
                        }
                        C2491 c2491M5087 = AbstractC3528.m5087(c2491, jM2115);
                        c2491M5087.m4437();
                        return new C2603(c2480, c2491M5087, 1, interfaceC2715);
                    }
                    if (!AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9280) && !AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9283) && !(abstractC2236Mo3640 instanceof AbstractC2428)) {
                        if (AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9282)) {
                            return new C1919(c2480, new C2491(m2115() == 19500 ? c2491.m4427() : c2491.m4426()), m2115(), interfaceC2715);
                        }
                        throw new C1667("Primitives are not supported at top-level");
                    }
                    long jM2116 = m2115();
                    if (jM2116 == 19500 && AbstractC1469.m3322(interfaceC2717, interfaceC2715)) {
                        return this;
                    }
                    if (!AbstractC2240.m4257(jM2116)) {
                        return new C2488(c2480, AbstractC3528.m5087(c2491, jM2116), interfaceC2715);
                    }
                    int i = ((int) (jM2116 & 2147483647L)) - 1;
                    HashMap map = this.f7885;
                    if (map != null && (num = (Integer) map.get(Integer.valueOf(i))) != null) {
                        jM2116 = (jM2116 & 1152921500311879680L) | ((long) num.intValue());
                    }
                    return new C2324(c2480, c2491, jM2116, interfaceC2715);
                } catch (C2489 e) {
                    e = e;
                    throw new C2489("Fail to begin structure for " + interfaceC2716.mo1488() + " in " + interfaceC2717.mo1488() + " at proto number " + ((int) (m2115() & 2147483647L)), e);
                }
            } catch (C2489 e2) {
                e = e2;
                throw new C2489("Fail to begin structure for " + interfaceC2716.mo1488() + " in " + interfaceC2717.mo1488() + " at proto number " + ((int) (m2115() & 2147483647L)), e);
            }
        } catch (C2489 e3) {
            e = e3;
            interfaceC2716 = interfaceC2715;
        }
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final InterfaceC0978 mo2330(C2448 c2448, int i) {
        long jMo3868 = mo3868(c2448, i);
        c2448.mo3644(i);
        m2121(jMo3868);
        return this;
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo2637() {
        return m4411(m2120());
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final char mo2638() {
        return (char) m4414(m2120());
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final Object mo2639(InterfaceC1767 interfaceC1767) {
        return m4410(interfaceC1767, null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public int mo2331(InterfaceC2715 interfaceC2715) {
        int iIntValue;
        HashMap map;
        C2491 c2491 = this.f7881;
        while (true) {
            try {
                int iM4437 = c2491.m4437();
                C1141 c1141 = this.f7887;
                if (iM4437 == -1) {
                    return c1141.m2877();
                }
                if (iM4437 == 0) {
                    throw new C1667("0 is not allowed as the protobuf field number in " + interfaceC2715.mo1488() + ", the input bytes may have been corrupted");
                }
                int[] iArr = this.f7883;
                if (iArr != null) {
                    iIntValue = (iM4437 < 0 || iM4437 >= iArr.length) ? -1 : iArr[iM4437];
                } else {
                    Object obj = this.f7884.get(Integer.valueOf(iM4437));
                    if (obj == null) {
                        obj = -1;
                    }
                    iIntValue = ((Number) obj).intValue();
                }
                if (iIntValue != -1) {
                    if (AbstractC2240.m4257(AbstractC2240.m4246(interfaceC2715, iIntValue)) && (map = this.f7885) != null) {
                    }
                    c1141.m2876(iIntValue);
                    return iIntValue;
                }
                c2491.m4438();
            } catch (C2489 e) {
                throw new C2489("Fail to get element index for " + interfaceC2715.mo1488() + " in " + this.f7882.mo1488(), e);
            }
        }
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final double mo2332(C2448 c2448, int i) {
        return m4412(mo3868(c2448, i));
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final char mo2333(C2448 c2448, int i) {
        return (char) m4414(mo3868(c2448, i));
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ */
    public final float mo2334(C2448 c2448, int i) {
        return m4413(mo3868(c2448, i));
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public final byte mo2335(C2448 c2448, int i) {
        return (byte) m4414(mo3868(c2448, i));
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final String mo2336(InterfaceC2715 interfaceC2715, int i) {
        return mo4288(mo3868(interfaceC2715, i));
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public final int mo2640() {
        return m4414(m2120());
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public final short mo2337(C2448 c2448, int i) {
        return (short) m4414(mo3868(c2448, i));
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ */
    public final InterfaceC0978 mo2641(InterfaceC2715 interfaceC2715) {
        m2121(m2120());
        return this;
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public final Object mo2338(InterfaceC2715 interfaceC2715, int i, InterfaceC1767 interfaceC1767, Object obj) {
        m2121(mo3868(interfaceC2715, i));
        return m4410(interfaceC1767, obj);
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final int mo2339(InterfaceC2715 interfaceC2715, int i) {
        return m4414(mo3868(interfaceC2715, i));
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ */
    public final String mo2642() {
        return mo4288(m2120());
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final long mo2643() {
        return m4415(m2120());
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final boolean mo2644() {
        return !this.f7886;
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ */
    public final Object mo2340(InterfaceC2715 interfaceC2715, int i, InterfaceC1767 interfaceC1767, Object obj) {
        m2121(mo3868(interfaceC2715, i));
        if (this.f7886) {
            return null;
        }
        return m4410(interfaceC1767, obj);
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ */
    public final long mo2341(C2448 c2448, int i) {
        return m4415(mo3868(c2448, i));
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲇᲁ */
    public final boolean mo2342(InterfaceC2715 interfaceC2715, int i) {
        return m4411(mo3868(interfaceC2715, i));
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ */
    public final byte mo2645() {
        return (byte) m4414(m2120());
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ */
    public final short mo2646() {
        return (short) m4414(m2120());
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public final float mo2647() {
        return m4413(m2120());
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ */
    public final double mo2648() {
        return m4412(m2120());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
    public final Object m4410(InterfaceC1767 interfaceC1767, Object obj) {
        String string;
        C2911 c2911 = C2911.f9282;
        try {
            if (interfaceC1767 instanceof C1822) {
                return m4417(interfaceC1767, obj);
            }
            if (AbstractC1469.m3322(interfaceC1767.mo1509(), C0501.f2167.f7803)) {
                return m4416((byte[]) obj);
            }
            if (!AbstractC1469.m3322(interfaceC1767.mo1509(), C3532.f11121.f7803)) {
                return interfaceC1767 instanceof AbstractC0063 ? ((AbstractC0063) interfaceC1767).m1073(this, obj) : interfaceC1767.mo1068(this);
            }
            C3530 c3530 = (C3530) obj;
            byte[] bArr = c3530 != null ? c3530.f11118 : null;
            return new C3530(m4416(bArr != null ? bArr : null));
        } catch (C2489 e) {
            long jM2115 = m2115();
            InterfaceC2715 interfaceC2715Mo1509 = interfaceC1767.mo1509();
            InterfaceC2715 interfaceC2715 = this.f7882;
            if (AbstractC1469.m3322(interfaceC2715, interfaceC2715Mo1509)) {
                string = "Error while decoding " + interfaceC2715.mo1488();
            } else if (AbstractC1469.m3322(interfaceC2715.mo3640(), C2911.f9281) && !AbstractC1469.m3322(interfaceC1767.mo1509().mo3640(), c2911)) {
                StringBuilder sb = new StringBuilder("Error while decoding index ");
                sb.append(((int) (jM2115 & 2147483647L)) - 1);
                sb.append(" in repeated field of ");
                sb.append(interfaceC1767.mo1509().mo1488());
                string = sb.toString();
            } else if (AbstractC1469.m3322(interfaceC2715.mo3640(), c2911)) {
                int i = ((int) (jM2115 & 2147483647L)) - 1;
                int i2 = i / 2;
                string = "Error while decoding " + (i % 2 == 0 ? "key" : "value") + " of index " + i2 + " in map field of " + interfaceC1767.mo1509().mo1488();
            } else {
                string = "Error while decoding " + interfaceC1767.mo1509().mo1488() + " at proto number " + ((int) (jM2115 & 2147483647L)) + " of " + interfaceC2715.mo1488();
            }
            throw new C2489(string, e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ, reason: contains not printable characters */
    public final boolean m4411(long j) {
        int iM4414 = m4414(j);
        if (iM4414 == 0) {
            return false;
        }
        if (iM4414 == 1) {
            return true;
        }
        throw new C1667(AbstractC1095.m2794(iM4414, "Unexpected boolean value: "));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public final double m4412(long j) {
        C2491 c2491 = this.f7881;
        try {
            return j == 19500 ? Double.longBitsToDouble(c2491.m4435()) : c2491.m4430();
        } catch (C2489 e) {
            throw new C2489("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f7882.mo1488(), e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public final float m4413(long j) {
        C2491 c2491 = this.f7881;
        try {
            return j == 19500 ? Float.intBitsToFloat(c2491.m4433()) : c2491.m4431();
        } catch (C2489 e) {
            throw new C2489("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f7882.mo1488(), e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public final int m4414(long j) {
        C2491 c2491 = this.f7881;
        try {
            return j == 19500 ? c2491.m4424(EnumC2482.DEFAULT) : c2491.m4432(AbstractC2240.m4252(j));
        } catch (C2489 e) {
            throw new C2489("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f7882.mo1488(), e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public final long m4415(long j) {
        C2491 c2491 = this.f7881;
        try {
            return j == 19500 ? c2491.m4425(EnumC2482.DEFAULT) : c2491.m4434(AbstractC2240.m4252(j));
        } catch (C2489 e) {
            throw new C2489("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f7882.mo1488(), e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ */
    public String mo4288(long j) {
        C2491 c2491 = this.f7881;
        try {
            if (j != 19500) {
                return c2491.m4436();
            }
            int iM4424 = c2491.m4424(EnumC2482.DEFAULT);
            C2491.m4423(iM4424);
            C0498 c0498 = c2491.f7892;
            byte[] bArr = c0498.f2161;
            int i = c0498.f2160;
            int i2 = i + iM4424;
            AbstractC1468.m3300(i, i2, bArr.length);
            String str = new String(bArr, i, i2 - i, AbstractC0580.UTF_8);
            c0498.f2160 += iM4424;
            return str;
        } catch (C2489 e) {
            throw new C2489("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f7882.mo1488(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [long] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v9, types: [byte[]] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public final byte[] m4416(byte[] bArr) {
        byte[] bArrM4428;
        byte[] bArrM4429;
        long jM2115 = m2115();
        C2491 c2491 = this.f7881;
        try {
            if (jM2115 == 19500) {
                bArrM4429 = c2491.m4429();
            } else {
                bArrM4428 = c2491.m4428();
            }
            if (bArr == null) {
                jM2115 = bArrM4428;
                jM2115 = bArrM4429;
                return jM2115;
            }
            jM2115 = bArrM4428;
            jM2115 = bArrM4429;
            return AbstractC0280.m1534(bArr, jM2115);
        } catch (C2489 e) {
            throw new C2489("Error while decoding proto number " + ((int) (jM2115 & 2147483647L)) + " of " + this.f7882.mo1488(), e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᤞᲇ, reason: contains not printable characters */
    public final LinkedHashMap m4417(InterfaceC1767 interfaceC1767, Object obj) {
        ((C1822) interfaceC1767).getClass();
        C2899 c2899 = C2899.f9270;
        C1740 c1740 = C1740.f5874;
        C1921 c1921 = new C1921(0);
        Map map = obj instanceof Map ? (Map) obj : null;
        Set<Map.Entry> set = (Set) new C0268(c1921).m1073(this, map != null ? map.entrySet() : null);
        int iM3872 = AbstractC1924.m3872(AbstractC0741.m2313(set, 10));
        if (iM3872 < 16) {
            iM3872 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM3872);
        for (Map.Entry entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲀᲇᤞ */
    public long mo3868(InterfaceC2715 interfaceC2715, int i) {
        return AbstractC2240.m4246(interfaceC2715, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᲇᤞᲀ, reason: contains not printable characters */
    public final void m4418(InterfaceC2715 interfaceC2715, int i) {
        HashMap map = new HashMap(i, 1.0f);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (AbstractC2240.m4247(interfaceC2715, i3) == -2) {
                List listM4249 = AbstractC2240.m4249(interfaceC2715.mo3644(i3));
                ArrayList arrayList = new ArrayList(AbstractC0741.m2313(listM4249, 10));
                Iterator it = listM4249.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf((int) (AbstractC2240.m4246((InterfaceC2715) it.next(), 0) & 2147483647L)));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    map.put(Integer.valueOf(((Number) it2.next()).intValue()), Integer.valueOf(i3));
                }
                i2++;
            } else {
                map.put(Integer.valueOf(AbstractC2240.m4247(interfaceC2715, i3)), Integer.valueOf(i3));
            }
        }
        if (i2 > 0) {
            this.f7885 = new HashMap(i2, 1.0f);
        }
        this.f7884 = map;
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2329(InterfaceC2715 interfaceC2715) {
    }
}
