package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛳᛴᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0866feyxiexzfUjhhgtg extends AbstractC2684Ujhhgtgfeyxiexzf implements InterfaceC3091Ujhhgtgfeyxiexzf, InterfaceC2876feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0858feyxiexzfUjhhgtg f3362Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0871feyxiexzfUjhhgtg f3363Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final InterfaceC1121feyxiexzfUjhhgtg f3364Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int[] f3365Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public HashMap f3366Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public HashMap f3367Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean f3368Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C3384feyxiexzfUjhhgtg f3369Ujhhgtgfeyxiexzf;

    public C0866feyxiexzfUjhhgtg(C0858feyxiexzfUjhhgtg c0858feyxiexzfUjhhgtg, C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        super(1, false);
        this.f3362Ujhhgtgfeyxiexzf = c0858feyxiexzfUjhhgtg;
        this.f3363Ujhhgtgfeyxiexzf = c0871feyxiexzfUjhhgtg;
        this.f3364Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg;
        this.f3369Ujhhgtgfeyxiexzf = new C3384feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, new C0115Ujhhgtgfeyxiexzf(2, this, C0866feyxiexzfUjhhgtg.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 0, 1));
        int iMo1120Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1120Ujhhgtgfeyxiexzf();
        if (iMo1120Ujhhgtgfeyxiexzf >= 32) {
            m2297Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, iMo1120Ujhhgtgfeyxiexzf);
            return;
        }
        int i = iMo1120Ujhhgtgfeyxiexzf + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        for (int i3 = 0; i3 < iMo1120Ujhhgtgfeyxiexzf; i3++) {
            int iM1322Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1322Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, i3);
            if (iM1322Ujhhgtgfeyxiexzf > iMo1120Ujhhgtgfeyxiexzf || iM1322Ujhhgtgfeyxiexzf == -2) {
                m2297Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, iMo1120Ujhhgtgfeyxiexzf);
                return;
            }
            iArr[iM1322Ujhhgtgfeyxiexzf] = i3;
        }
        this.f3365Ujhhgtgfeyxiexzf = iArr;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0071: MOVE (r14 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:114), block:B:32:0x0071 */
    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public InterfaceC2876feyxiexzfUjhhgtg mo2267Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg2;
        Integer num;
        InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg3 = this.f3364Ujhhgtgfeyxiexzf;
        try {
            AbstractC3611Ujhhgtgfeyxiexzf abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf();
            C1189feyxiexzfUjhhgtg c1189feyxiexzfUjhhgtg = C1189feyxiexzfUjhhgtg.f4475Ujhhgtgfeyxiexzf;
            boolean zM4512Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, c1189feyxiexzfUjhhgtg);
            C0858feyxiexzfUjhhgtg c0858feyxiexzfUjhhgtg = this.f3362Ujhhgtgfeyxiexzf;
            C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg = this.f3363Ujhhgtgfeyxiexzf;
            try {
                try {
                    if (zM4512Ujhhgtgfeyxiexzf) {
                        long jM4025Ujhhgtgfeyxiexzf = m4025Ujhhgtgfeyxiexzf();
                        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg3.mo1119Ujhhgtgfeyxiexzf(), c1189feyxiexzfUjhhgtg) || jM4025Ujhhgtgfeyxiexzf == 19500 || interfaceC1121feyxiexzfUjhhgtg3.equals(interfaceC1121feyxiexzfUjhhgtg)) {
                            return (c0871feyxiexzfUjhhgtg.f3386Ujhhgtgfeyxiexzf == EnumC0867feyxiexzfUjhhgtg.SIZE_DELIMITED && AbstractC0217Ujhhgtgfeyxiexzf.m1331feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(0))) ? new C1480feyxiexzfUjhhgtg(c0858feyxiexzfUjhhgtg, new C0871feyxiexzfUjhhgtg(c0871feyxiexzfUjhhgtg.m2307Ujhhgtgfeyxiexzf()), interfaceC1121feyxiexzfUjhhgtg) : new C0988feyxiexzfUjhhgtg(c0858feyxiexzfUjhhgtg, c0871feyxiexzfUjhhgtg, jM4025Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
                        }
                        C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtgM1307Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1307Ujhhgtgfeyxiexzf(c0871feyxiexzfUjhhgtg, jM4025Ujhhgtgfeyxiexzf);
                        c0871feyxiexzfUjhhgtgM1307Ujhhgtgfeyxiexzf.m2318Ujhhgtgfeyxiexzf();
                        return new C0988feyxiexzfUjhhgtg(c0858feyxiexzfUjhhgtg, c0871feyxiexzfUjhhgtgM1307Ujhhgtgfeyxiexzf, 1, interfaceC1121feyxiexzfUjhhgtg);
                    }
                    if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1189feyxiexzfUjhhgtg.f4474Ujhhgtgfeyxiexzf) && !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1189feyxiexzfUjhhgtg.f4477Ujhhgtgfeyxiexzf) && !(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf instanceof AbstractC1437feyxiexzfUjhhgtg)) {
                        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1189feyxiexzfUjhhgtg.f4476Ujhhgtgfeyxiexzf)) {
                            return new C0170Ujhhgtgfeyxiexzf(c0858feyxiexzfUjhhgtg, new C0871feyxiexzfUjhhgtg(m4025Ujhhgtgfeyxiexzf() == 19500 ? c0871feyxiexzfUjhhgtg.m2308Ujhhgtgfeyxiexzf() : c0871feyxiexzfUjhhgtg.m2307Ujhhgtgfeyxiexzf()), m4025Ujhhgtgfeyxiexzf(), interfaceC1121feyxiexzfUjhhgtg);
                        }
                        throw new C0670Ujhhgtgfeyxiexzf("Primitives are not supported at top-level");
                    }
                    long jM4025Ujhhgtgfeyxiexzf2 = m4025Ujhhgtgfeyxiexzf();
                    if (jM4025Ujhhgtgfeyxiexzf2 == 19500 && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg3, interfaceC1121feyxiexzfUjhhgtg)) {
                        return this;
                    }
                    if (!AbstractC0217Ujhhgtgfeyxiexzf.m1330Ujhhgtgfeyxiexzf(jM4025Ujhhgtgfeyxiexzf2)) {
                        return new C0866feyxiexzfUjhhgtg(c0858feyxiexzfUjhhgtg, AbstractC0217Ujhhgtgfeyxiexzf.m1307Ujhhgtgfeyxiexzf(c0871feyxiexzfUjhhgtg, jM4025Ujhhgtgfeyxiexzf2), interfaceC1121feyxiexzfUjhhgtg);
                    }
                    int i = ((int) (jM4025Ujhhgtgfeyxiexzf2 & 2147483647L)) - 1;
                    HashMap map = this.f3367Ujhhgtgfeyxiexzf;
                    if (map != null && (num = (Integer) map.get(Integer.valueOf(i))) != null) {
                        jM4025Ujhhgtgfeyxiexzf2 = (jM4025Ujhhgtgfeyxiexzf2 & 1152921500311879680L) | ((long) num.intValue());
                    }
                    return new C1459feyxiexzfUjhhgtg(c0858feyxiexzfUjhhgtg, c0871feyxiexzfUjhhgtg, jM4025Ujhhgtgfeyxiexzf2, interfaceC1121feyxiexzfUjhhgtg);
                } catch (C0874feyxiexzfUjhhgtg e) {
                    e = e;
                    throw new C0874feyxiexzfUjhhgtg("Fail to begin structure for " + interfaceC1121feyxiexzfUjhhgtg2.mo1117Ujhhgtgfeyxiexzf() + " in " + interfaceC1121feyxiexzfUjhhgtg3.mo1117Ujhhgtgfeyxiexzf() + " at proto number " + ((int) (m4025Ujhhgtgfeyxiexzf() & 2147483647L)), e);
                }
            } catch (C0874feyxiexzfUjhhgtg e2) {
                e = e2;
                throw new C0874feyxiexzfUjhhgtg("Fail to begin structure for " + interfaceC1121feyxiexzfUjhhgtg2.mo1117Ujhhgtgfeyxiexzf() + " in " + interfaceC1121feyxiexzfUjhhgtg3.mo1117Ujhhgtgfeyxiexzf() + " at proto number " + ((int) (m4025Ujhhgtgfeyxiexzf() & 2147483647L)), e);
            }
        } catch (C0874feyxiexzfUjhhgtg e3) {
            e = e3;
            interfaceC1121feyxiexzfUjhhgtg2 = interfaceC1121feyxiexzfUjhhgtg;
        }
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC3091Ujhhgtgfeyxiexzf mo2268Ujhhgtgfeyxiexzf(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i) {
        long jMo1222feyxiexzfUjhhgtg = mo1222feyxiexzfUjhhgtg(c0857feyxiexzfUjhhgtg, i);
        c0857feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(i);
        m4027feyxiexzfUjhhgtg(jMo1222feyxiexzfUjhhgtg);
        return this;
    }

    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean mo2269Ujhhgtgfeyxiexzf() {
        return m2289Ujhhgtgfeyxiexzf(m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final char mo2270Ujhhgtgfeyxiexzf() {
        return (char) m2292Ujhhgtgfeyxiexzf(m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Object mo2271Ujhhgtgfeyxiexzf(InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf) {
        return m2288Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf, null);
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public int mo1185Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        int iIntValue;
        HashMap map;
        C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg = this.f3363Ujhhgtgfeyxiexzf;
        while (true) {
            try {
                int iM2318Ujhhgtgfeyxiexzf = c0871feyxiexzfUjhhgtg.m2318Ujhhgtgfeyxiexzf();
                C3384feyxiexzfUjhhgtg c3384feyxiexzfUjhhgtg = this.f3369Ujhhgtgfeyxiexzf;
                if (iM2318Ujhhgtgfeyxiexzf == -1) {
                    return c3384feyxiexzfUjhhgtg.m4905Ujhhgtgfeyxiexzf();
                }
                if (iM2318Ujhhgtgfeyxiexzf == 0) {
                    throw new C0670Ujhhgtgfeyxiexzf("0 is not allowed as the protobuf field number in " + interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf() + ", the input bytes may have been corrupted");
                }
                int[] iArr = this.f3365Ujhhgtgfeyxiexzf;
                if (iArr != null) {
                    iIntValue = (iM2318Ujhhgtgfeyxiexzf < 0 || iM2318Ujhhgtgfeyxiexzf >= iArr.length) ? -1 : iArr[iM2318Ujhhgtgfeyxiexzf];
                } else {
                    Object obj = this.f3366Ujhhgtgfeyxiexzf.get(Integer.valueOf(iM2318Ujhhgtgfeyxiexzf));
                    if (obj == null) {
                        obj = -1;
                    }
                    iIntValue = ((Number) obj).intValue();
                }
                if (iIntValue != -1) {
                    if (AbstractC0217Ujhhgtgfeyxiexzf.m1330Ujhhgtgfeyxiexzf(AbstractC0217Ujhhgtgfeyxiexzf.m1321Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, iIntValue)) && (map = this.f3367Ujhhgtgfeyxiexzf) != null) {
                    }
                    c3384feyxiexzfUjhhgtg.m4904Ujhhgtgfeyxiexzf(iIntValue);
                    return iIntValue;
                }
                c0871feyxiexzfUjhhgtg.m2319Ujhhgtgfeyxiexzf();
            } catch (C0874feyxiexzfUjhhgtg e) {
                throw new C0874feyxiexzfUjhhgtg("Fail to get element index for " + interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf() + " in " + this.f3364Ujhhgtgfeyxiexzf.mo1117Ujhhgtgfeyxiexzf(), e);
            }
        }
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final double mo2272Ujhhgtgfeyxiexzf(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i) {
        return m2290feyxiexzfUjhhgtg(mo1222feyxiexzfUjhhgtg(c0857feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final char mo2273Ujhhgtgfeyxiexzf(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i) {
        return (char) m2292Ujhhgtgfeyxiexzf(mo1222feyxiexzfUjhhgtg(c0857feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final float mo2274Ujhhgtgfeyxiexzf(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i) {
        return m2291feyxiexzfUjhhgtg(mo1222feyxiexzfUjhhgtg(c0857feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final byte mo2275Ujhhgtgfeyxiexzf(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i) {
        return (byte) m2292Ujhhgtgfeyxiexzf(mo1222feyxiexzfUjhhgtg(c0857feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final String mo2276Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i) {
        return mo2294Ujhhgtgfeyxiexzf(mo1222feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ */
    public final int mo1186Ujhhgtgfeyxiexzf() {
        return m2292Ujhhgtgfeyxiexzf(m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public final short mo2277feyxiexzfUjhhgtg(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i) {
        return (short) m2292Ujhhgtgfeyxiexzf(mo1222feyxiexzfUjhhgtg(c0857feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC3091Ujhhgtgfeyxiexzf mo2278feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        m4027feyxiexzfUjhhgtg(m4026feyxiexzfUjhhgtg());
        return this;
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object mo2279feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i, InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf, Object obj) {
        m4027feyxiexzfUjhhgtg(mo1222feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, i));
        return m2288Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf, obj);
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int mo2280feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i) {
        return m2292Ujhhgtgfeyxiexzf(mo1222feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public final String mo2281feyxiexzfUjhhgtg() {
        return mo2294Ujhhgtgfeyxiexzf(m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ */
    public final long mo1187feyxiexzfUjhhgtg() {
        return m2293feyxiexzfUjhhgtg(m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final boolean mo2282feyxiexzfUjhhgtg() {
        return !this.f3368Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final Object mo2283feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i, InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf, Object obj) {
        m4027feyxiexzfUjhhgtg(mo1222feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, i));
        if (this.f3368Ujhhgtgfeyxiexzf) {
            return null;
        }
        return m2288Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf, obj);
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final long mo2284feyxiexzfUjhhgtg(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i) {
        return m2293feyxiexzfUjhhgtg(mo1222feyxiexzfUjhhgtg(c0857feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ, reason: contains not printable characters */
    public final boolean mo2285feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i) {
        return m2289Ujhhgtgfeyxiexzf(mo1222feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ */
    public final byte mo1188feyxiexzfUjhhgtg() {
        return (byte) m2292Ujhhgtgfeyxiexzf(m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ */
    public final short mo1189feyxiexzfUjhhgtg() {
        return (short) m2292Ujhhgtgfeyxiexzf(m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final float mo2286Ujhhgtgfeyxiexzf() {
        return m2291feyxiexzfUjhhgtg(m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC3091Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final double mo2287Ujhhgtgfeyxiexzf() {
        return m2290feyxiexzfUjhhgtg(m4026feyxiexzfUjhhgtg());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Object m2288Ujhhgtgfeyxiexzf(InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf, Object obj) {
        String string;
        C1189feyxiexzfUjhhgtg c1189feyxiexzfUjhhgtg = C1189feyxiexzfUjhhgtg.f4476Ujhhgtgfeyxiexzf;
        try {
            if (interfaceC0146Ujhhgtgfeyxiexzf instanceof C0073Ujhhgtgfeyxiexzf) {
                return m2296feyxiexzfUjhhgtg(interfaceC0146Ujhhgtgfeyxiexzf, obj);
            }
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf(), C2611feyxiexzfUjhhgtg.f8423Ujhhgtgfeyxiexzf.f3308Ujhhgtgfeyxiexzf)) {
                return m2295Ujhhgtgfeyxiexzf((byte[]) obj);
            }
            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf(), C1914Ujhhgtgfeyxiexzf.f6381Ujhhgtgfeyxiexzf.f3308Ujhhgtgfeyxiexzf)) {
                return interfaceC0146Ujhhgtgfeyxiexzf instanceof AbstractC2926Ujhhgtgfeyxiexzf ? ((AbstractC2926Ujhhgtgfeyxiexzf) interfaceC0146Ujhhgtgfeyxiexzf).m4295Ujhhgtgfeyxiexzf(this, obj) : interfaceC0146Ujhhgtgfeyxiexzf.mo1180Ujhhgtgfeyxiexzf(this);
            }
            C1919Ujhhgtgfeyxiexzf c1919Ujhhgtgfeyxiexzf = (C1919Ujhhgtgfeyxiexzf) obj;
            byte[] bArr = c1919Ujhhgtgfeyxiexzf != null ? c1919Ujhhgtgfeyxiexzf.f6388Ujhhgtgfeyxiexzf : null;
            return new C1919Ujhhgtgfeyxiexzf(m2295Ujhhgtgfeyxiexzf(bArr != null ? bArr : null));
        } catch (C0874feyxiexzfUjhhgtg e) {
            long jM4025Ujhhgtgfeyxiexzf = m4025Ujhhgtgfeyxiexzf();
            InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtgMo1106Ujhhgtgfeyxiexzf = interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf();
            InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg = this.f3364Ujhhgtgfeyxiexzf;
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, interfaceC1121feyxiexzfUjhhgtgMo1106Ujhhgtgfeyxiexzf)) {
                string = "Error while decoding " + interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf();
            } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf(), C1189feyxiexzfUjhhgtg.f4475Ujhhgtgfeyxiexzf) && !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf().mo1119Ujhhgtgfeyxiexzf(), c1189feyxiexzfUjhhgtg)) {
                StringBuilder sb = new StringBuilder("Error while decoding index ");
                sb.append(((int) (jM4025Ujhhgtgfeyxiexzf & 2147483647L)) - 1);
                sb.append(" in repeated field of ");
                sb.append(interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf().mo1117Ujhhgtgfeyxiexzf());
                string = sb.toString();
            } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf(), c1189feyxiexzfUjhhgtg)) {
                int i = ((int) (jM4025Ujhhgtgfeyxiexzf & 2147483647L)) - 1;
                int i2 = i / 2;
                string = "Error while decoding " + (i % 2 == 0 ? "key" : "value") + " of index " + i2 + " in map field of " + interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf().mo1117Ujhhgtgfeyxiexzf();
            } else {
                string = "Error while decoding " + interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf().mo1117Ujhhgtgfeyxiexzf() + " at proto number " + ((int) (jM4025Ujhhgtgfeyxiexzf & 2147483647L)) + " of " + interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf();
            }
            throw new C0874feyxiexzfUjhhgtg(string, e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m2289Ujhhgtgfeyxiexzf(long j) {
        int iM2292Ujhhgtgfeyxiexzf = m2292Ujhhgtgfeyxiexzf(j);
        if (iM2292Ujhhgtgfeyxiexzf == 0) {
            return false;
        }
        if (iM2292Ujhhgtgfeyxiexzf == 1) {
            return true;
        }
        throw new C0670Ujhhgtgfeyxiexzf(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(iM2292Ujhhgtgfeyxiexzf, "Unexpected boolean value: "));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final double m2290feyxiexzfUjhhgtg(long j) {
        C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg = this.f3363Ujhhgtgfeyxiexzf;
        try {
            return j == 19500 ? Double.longBitsToDouble(c0871feyxiexzfUjhhgtg.m2316Ujhhgtgfeyxiexzf()) : c0871feyxiexzfUjhhgtg.m2311Ujhhgtgfeyxiexzf();
        } catch (C0874feyxiexzfUjhhgtg e) {
            throw new C0874feyxiexzfUjhhgtg("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f3364Ujhhgtgfeyxiexzf.mo1117Ujhhgtgfeyxiexzf(), e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final float m2291feyxiexzfUjhhgtg(long j) {
        C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg = this.f3363Ujhhgtgfeyxiexzf;
        try {
            return j == 19500 ? Float.intBitsToFloat(c0871feyxiexzfUjhhgtg.m2314Ujhhgtgfeyxiexzf()) : c0871feyxiexzfUjhhgtg.m2312Ujhhgtgfeyxiexzf();
        } catch (C0874feyxiexzfUjhhgtg e) {
            throw new C0874feyxiexzfUjhhgtg("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f3364Ujhhgtgfeyxiexzf.mo1117Ujhhgtgfeyxiexzf(), e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m2292Ujhhgtgfeyxiexzf(long j) {
        C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg = this.f3363Ujhhgtgfeyxiexzf;
        try {
            return j == 19500 ? c0871feyxiexzfUjhhgtg.m2305Ujhhgtgfeyxiexzf(EnumC0860feyxiexzfUjhhgtg.DEFAULT) : c0871feyxiexzfUjhhgtg.m2313Ujhhgtgfeyxiexzf(AbstractC0217Ujhhgtgfeyxiexzf.m1327Ujhhgtgfeyxiexzf(j));
        } catch (C0874feyxiexzfUjhhgtg e) {
            throw new C0874feyxiexzfUjhhgtg("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f3364Ujhhgtgfeyxiexzf.mo1117Ujhhgtgfeyxiexzf(), e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final long m2293feyxiexzfUjhhgtg(long j) {
        C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg = this.f3363Ujhhgtgfeyxiexzf;
        try {
            return j == 19500 ? c0871feyxiexzfUjhhgtg.m2306Ujhhgtgfeyxiexzf(EnumC0860feyxiexzfUjhhgtg.DEFAULT) : c0871feyxiexzfUjhhgtg.m2315Ujhhgtgfeyxiexzf(AbstractC0217Ujhhgtgfeyxiexzf.m1327Ujhhgtgfeyxiexzf(j));
        } catch (C0874feyxiexzfUjhhgtg e) {
            throw new C0874feyxiexzfUjhhgtg("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f3364Ujhhgtgfeyxiexzf.mo1117Ujhhgtgfeyxiexzf(), e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public String mo2294Ujhhgtgfeyxiexzf(long j) {
        C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg = this.f3363Ujhhgtgfeyxiexzf;
        try {
            if (j != 19500) {
                return c0871feyxiexzfUjhhgtg.m2317Ujhhgtgfeyxiexzf();
            }
            int iM2305Ujhhgtgfeyxiexzf = c0871feyxiexzfUjhhgtg.m2305Ujhhgtgfeyxiexzf(EnumC0860feyxiexzfUjhhgtg.DEFAULT);
            C0871feyxiexzfUjhhgtg.m2304Ujhhgtgfeyxiexzf(iM2305Ujhhgtgfeyxiexzf);
            C2615feyxiexzfUjhhgtg c2615feyxiexzfUjhhgtg = c0871feyxiexzfUjhhgtg.f3384Ujhhgtgfeyxiexzf;
            byte[] bArr = c2615feyxiexzfUjhhgtg.f8434Ujhhgtgfeyxiexzf;
            int i = c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf;
            int i2 = i + iM2305Ujhhgtgfeyxiexzf;
            AbstractC3516feyxiexzfUjhhgtg.m5052Ujhhgtgfeyxiexzf(i, i2, bArr.length);
            String str = new String(bArr, i, i2 - i, AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
            c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf += iM2305Ujhhgtgfeyxiexzf;
            return str;
        } catch (C0874feyxiexzfUjhhgtg e) {
            throw new C0874feyxiexzfUjhhgtg("Error while decoding proto number " + ((int) (j & 2147483647L)) + " of " + this.f3364Ujhhgtgfeyxiexzf.mo1117Ujhhgtgfeyxiexzf(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [long] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v9, types: [byte[]] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final byte[] m2295Ujhhgtgfeyxiexzf(byte[] bArr) {
        byte[] bArrM2309Ujhhgtgfeyxiexzf;
        byte[] bArrM2310Ujhhgtgfeyxiexzf;
        long jM4025Ujhhgtgfeyxiexzf = m4025Ujhhgtgfeyxiexzf();
        C0871feyxiexzfUjhhgtg c0871feyxiexzfUjhhgtg = this.f3363Ujhhgtgfeyxiexzf;
        try {
            if (jM4025Ujhhgtgfeyxiexzf == 19500) {
                bArrM2310Ujhhgtgfeyxiexzf = c0871feyxiexzfUjhhgtg.m2310Ujhhgtgfeyxiexzf();
            } else {
                bArrM2309Ujhhgtgfeyxiexzf = c0871feyxiexzfUjhhgtg.m2309Ujhhgtgfeyxiexzf();
            }
            if (bArr == null) {
                jM4025Ujhhgtgfeyxiexzf = bArrM2309Ujhhgtgfeyxiexzf;
                jM4025Ujhhgtgfeyxiexzf = bArrM2310Ujhhgtgfeyxiexzf;
                return jM4025Ujhhgtgfeyxiexzf;
            }
            jM4025Ujhhgtgfeyxiexzf = bArrM2309Ujhhgtgfeyxiexzf;
            jM4025Ujhhgtgfeyxiexzf = bArrM2310Ujhhgtgfeyxiexzf;
            return AbstractC2391Ujhhgtgfeyxiexzf.m3652feyxiexzfUjhhgtg(bArr, jM4025Ujhhgtgfeyxiexzf);
        } catch (C0874feyxiexzfUjhhgtg e) {
            throw new C0874feyxiexzfUjhhgtg("Error while decoding proto number " + ((int) (jM4025Ujhhgtgfeyxiexzf & 2147483647L)) + " of " + this.f3364Ujhhgtgfeyxiexzf.mo1117Ujhhgtgfeyxiexzf(), e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final LinkedHashMap m2296feyxiexzfUjhhgtg(InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf, Object obj) {
        ((C0073Ujhhgtgfeyxiexzf) interfaceC0146Ujhhgtgfeyxiexzf).getClass();
        C1157feyxiexzfUjhhgtg c1157feyxiexzfUjhhgtg = C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf;
        C0117Ujhhgtgfeyxiexzf c0117Ujhhgtgfeyxiexzf = C0117Ujhhgtgfeyxiexzf.f1265Ujhhgtgfeyxiexzf;
        C0204Ujhhgtgfeyxiexzf c0204Ujhhgtgfeyxiexzf = new C0204Ujhhgtgfeyxiexzf(0);
        Map map = obj instanceof Map ? (Map) obj : null;
        Set<Map.Entry> set = (Set) new C2379Ujhhgtgfeyxiexzf(c0204Ujhhgtgfeyxiexzf).m4295Ujhhgtgfeyxiexzf(this, map != null ? map.entrySet() : null);
        int iM1280Ujhhgtgfeyxiexzf = AbstractC0202Ujhhgtgfeyxiexzf.m1280Ujhhgtgfeyxiexzf(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(set, 10));
        if (iM1280Ujhhgtgfeyxiexzf < 16) {
            iM1280Ujhhgtgfeyxiexzf = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM1280Ujhhgtgfeyxiexzf);
        for (Map.Entry entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ */
    public long mo1222feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i) {
        return AbstractC0217Ujhhgtgfeyxiexzf.m1321Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2297Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i) {
        HashMap map = new HashMap(i, 1.0f);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (AbstractC0217Ujhhgtgfeyxiexzf.m1322Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, i3) == -2) {
                List listM1324Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1324Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(i3));
                ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listM1324Ujhhgtgfeyxiexzf, 10));
                Iterator it = listM1324Ujhhgtgfeyxiexzf.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf((int) (AbstractC0217Ujhhgtgfeyxiexzf.m1321Ujhhgtgfeyxiexzf((InterfaceC1121feyxiexzfUjhhgtg) it.next(), 0) & 2147483647L)));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    map.put(Integer.valueOf(((Number) it2.next()).intValue()), Integer.valueOf(i3));
                }
                i2++;
            } else {
                map.put(Integer.valueOf(AbstractC0217Ujhhgtgfeyxiexzf.m1322Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, i3)), Integer.valueOf(i3));
            }
        }
        if (i2 > 0) {
            this.f3367Ujhhgtgfeyxiexzf = new HashMap(i2, 1.0f);
        }
        this.f3366Ujhhgtgfeyxiexzf = map;
    }

    @Override // p000.InterfaceC2876feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void mo2266Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
    }
}
