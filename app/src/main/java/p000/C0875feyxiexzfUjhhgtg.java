package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛴ能不能ᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0875feyxiexzfUjhhgtg extends AbstractC2684Ujhhgtgfeyxiexzf implements InterfaceC3329Ujhhgtgfeyxiexzf, InterfaceC2875feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f3400Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0858feyxiexzfUjhhgtg f3401Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0709Ujhhgtgfeyxiexzf f3402Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC1121feyxiexzfUjhhgtg f3403Ujhhgtgfeyxiexzf;

    public C0875feyxiexzfUjhhgtg(C0858feyxiexzfUjhhgtg c0858feyxiexzfUjhhgtg, C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        super(1, false);
        this.f3400Ujhhgtgfeyxiexzf = 5;
        this.f3401Ujhhgtgfeyxiexzf = c0858feyxiexzfUjhhgtg;
        this.f3402Ujhhgtgfeyxiexzf = c0709Ujhhgtgfeyxiexzf;
        this.f3403Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void mo2322Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        int i = this.f8572Ujhhgtgfeyxiexzf;
        if (i >= 0) {
            if (i < 0) {
                throw new C0670Ujhhgtgfeyxiexzf("No tag in stack for requested element");
            }
            long[] jArr = (long[]) this.f8573Ujhhgtgfeyxiexzf;
            this.f8572Ujhhgtgfeyxiexzf = i - 1;
            long j = jArr[i];
        }
        mo1775feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public InterfaceC2875feyxiexzfUjhhgtg mo2323Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        AbstractC3611Ujhhgtgfeyxiexzf abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf();
        boolean zM4512Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1189feyxiexzfUjhhgtg.f4475Ujhhgtgfeyxiexzf);
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = this.f3402Ujhhgtgfeyxiexzf;
        if (zM4512Ujhhgtgfeyxiexzf) {
            if (!AbstractC0217Ujhhgtgfeyxiexzf.m1331feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(0)) || (m4025Ujhhgtgfeyxiexzf() & JSONWriter.MASK_IGNORE_NON_FIELD_GETTER) == 0) {
                return new C0989feyxiexzfUjhhgtg(m4025Ujhhgtgfeyxiexzf(), c0709Ujhhgtgfeyxiexzf, this.f3401Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
            }
            return new C1481feyxiexzfUjhhgtg(m4025Ujhhgtgfeyxiexzf(), c0709Ujhhgtgfeyxiexzf, this.f3401Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
        }
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1189feyxiexzfUjhhgtg.f4474Ujhhgtgfeyxiexzf) && !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1189feyxiexzfUjhhgtg.f4477Ujhhgtgfeyxiexzf) && !(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf instanceof AbstractC1437feyxiexzfUjhhgtg)) {
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1189feyxiexzfUjhhgtg.f4476Ujhhgtgfeyxiexzf)) {
                return new C0199Ujhhgtgfeyxiexzf(m4025Ujhhgtgfeyxiexzf(), c0709Ujhhgtgfeyxiexzf, this.f3401Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
            }
            throw new C0670Ujhhgtgfeyxiexzf("This serial kind is not supported as structure: " + interfaceC1121feyxiexzfUjhhgtg);
        }
        long jM4025Ujhhgtgfeyxiexzf = m4025Ujhhgtgfeyxiexzf();
        if (jM4025Ujhhgtgfeyxiexzf == 19500 && interfaceC1121feyxiexzfUjhhgtg.equals(this.f3403Ujhhgtgfeyxiexzf)) {
            return this;
        }
        if (AbstractC0217Ujhhgtgfeyxiexzf.m1330Ujhhgtgfeyxiexzf(jM4025Ujhhgtgfeyxiexzf)) {
            return new C1458feyxiexzfUjhhgtg(this.f3401Ujhhgtgfeyxiexzf, c0709Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
        }
        return new C0446Ujhhgtgfeyxiexzf(m4025Ujhhgtgfeyxiexzf(), c0709Ujhhgtgfeyxiexzf, this.f3401Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void mo2324Ujhhgtgfeyxiexzf(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i, double d) {
        m2350Ujhhgtgfeyxiexzf(mo1272Ujhhgtgfeyxiexzf(c0857feyxiexzfUjhhgtg, i), d);
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void mo2325Ujhhgtgfeyxiexzf() {
        String str;
        int i = this.f3400Ujhhgtgfeyxiexzf;
        if (i != 1) {
            int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(i);
            if (iM2713feyxiexzfUjhhgtg == 1) {
                str = "'null' is not supported for optional properties in ProtoBuf";
            } else if (iM2713feyxiexzfUjhhgtg == 2) {
                str = "'null' is not supported as the value of collection types in ProtoBuf";
            } else if (iM2713feyxiexzfUjhhgtg != 3) {
                str = iM2713feyxiexzfUjhhgtg != 4 ? "'null' is not supported in ProtoBuf" : "'null' is not allowed for not-null properties";
            } else {
                str = "'null' is not supported as the value of a list element in ProtoBuf";
            }
            throw new C0670Ujhhgtgfeyxiexzf(str);
        }
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final void mo2326Ujhhgtgfeyxiexzf(InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf, Object obj) {
        if (interfaceC0146Ujhhgtgfeyxiexzf instanceof C0073Ujhhgtgfeyxiexzf) {
            C1157feyxiexzfUjhhgtg c1157feyxiexzfUjhhgtg = C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf;
            C0117Ujhhgtgfeyxiexzf c0117Ujhhgtgfeyxiexzf = C0117Ujhhgtgfeyxiexzf.f1265Ujhhgtgfeyxiexzf;
            C0204Ujhhgtgfeyxiexzf c0204Ujhhgtgfeyxiexzf = new C0204Ujhhgtgfeyxiexzf(0);
            C2382Ujhhgtgfeyxiexzf c2382Ujhhgtgfeyxiexzf = new C2382Ujhhgtgfeyxiexzf((C1103feyxiexzfUjhhgtg) c0204Ujhhgtgfeyxiexzf.f1457Ujhhgtgfeyxiexzf, 2);
            Set setEntrySet = ((Map) obj).entrySet();
            int size = setEntrySet.size();
            InterfaceC2875feyxiexzfUjhhgtg interfaceC2875feyxiexzfUjhhgtgMo2349Ujhhgtgfeyxiexzf = mo2349Ujhhgtgfeyxiexzf(c2382Ujhhgtgfeyxiexzf, size);
            Iterator it = setEntrySet.iterator();
            for (int i = 0; i < size; i++) {
                interfaceC2875feyxiexzfUjhhgtgMo2349Ujhhgtgfeyxiexzf.mo2333Ujhhgtgfeyxiexzf(c2382Ujhhgtgfeyxiexzf, i, c0204Ujhhgtgfeyxiexzf, it.next());
            }
            interfaceC2875feyxiexzfUjhhgtgMo2349Ujhhgtgfeyxiexzf.mo2322Ujhhgtgfeyxiexzf(c2382Ujhhgtgfeyxiexzf);
            return;
        }
        boolean zM4512Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf(), C2611feyxiexzfUjhhgtg.f8423Ujhhgtgfeyxiexzf.f3308Ujhhgtgfeyxiexzf);
        EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtg = EnumC0860feyxiexzfUjhhgtg.DEFAULT;
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = this.f3402Ujhhgtgfeyxiexzf;
        if (zM4512Ujhhgtgfeyxiexzf) {
            byte[] bArr = (byte[]) obj;
            long jM4026feyxiexzfUjhhgtg = m4026feyxiexzfUjhhgtg();
            if (jM4026feyxiexzfUjhhgtg == 19500) {
                c0709Ujhhgtgfeyxiexzf.m2026Ujhhgtgfeyxiexzf(bArr);
                return;
            }
            c0709Ujhhgtgfeyxiexzf.m2019Ujhhgtgfeyxiexzf((C2612feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf, EnumC0867feyxiexzfUjhhgtg.SIZE_DELIMITED.m2298Ujhhgtgfeyxiexzf((int) (2147483647L & jM4026feyxiexzfUjhhgtg)), enumC0860feyxiexzfUjhhgtg);
            c0709Ujhhgtgfeyxiexzf.m2026Ujhhgtgfeyxiexzf(bArr);
            return;
        }
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf(), C1914Ujhhgtgfeyxiexzf.f6381Ujhhgtgfeyxiexzf.f3308Ujhhgtgfeyxiexzf)) {
            interfaceC0146Ujhhgtgfeyxiexzf.mo1107Ujhhgtgfeyxiexzf(this, obj);
            return;
        }
        byte[] bArr2 = ((C1919Ujhhgtgfeyxiexzf) obj).f6388Ujhhgtgfeyxiexzf;
        long jM4026feyxiexzfUjhhgtg2 = m4026feyxiexzfUjhhgtg();
        if (jM4026feyxiexzfUjhhgtg2 == 19500) {
            c0709Ujhhgtgfeyxiexzf.m2026Ujhhgtgfeyxiexzf(bArr2);
            return;
        }
        c0709Ujhhgtgfeyxiexzf.m2019Ujhhgtgfeyxiexzf((C2612feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf, EnumC0867feyxiexzfUjhhgtg.SIZE_DELIMITED.m2298Ujhhgtgfeyxiexzf((int) (2147483647L & jM4026feyxiexzfUjhhgtg2)), enumC0860feyxiexzfUjhhgtg);
        c0709Ujhhgtgfeyxiexzf.m2026Ujhhgtgfeyxiexzf(bArr2);
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo2327Ujhhgtgfeyxiexzf(double d) {
        m2350Ujhhgtgfeyxiexzf(m4026feyxiexzfUjhhgtg(), d);
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void mo2328Ujhhgtgfeyxiexzf(short s) {
        m2352feyxiexzfUjhhgtg(s, m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo2329Ujhhgtgfeyxiexzf(byte b) {
        m2352feyxiexzfUjhhgtg(b, m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void mo2330Ujhhgtgfeyxiexzf(boolean z) {
        m2352feyxiexzfUjhhgtg(z ? 1 : 0, m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public InterfaceC3329Ujhhgtgfeyxiexzf mo2331Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        m4027feyxiexzfUjhhgtg(m4026feyxiexzfUjhhgtg());
        return this;
    }

    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void mo2332Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i, boolean z) {
        m2352feyxiexzfUjhhgtg(z ? 1 : 0, mo1272Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, i));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void mo2333Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i, InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf, Object obj) {
        int i2;
        if (interfaceC1121feyxiexzfUjhhgtg.mo1124Ujhhgtgfeyxiexzf(i)) {
            i2 = 2;
        } else {
            InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtgMo1123Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(i);
            if (interfaceC1121feyxiexzfUjhhgtgMo1123Ujhhgtgfeyxiexzf.mo1183Ujhhgtgfeyxiexzf()) {
                AbstractC3611Ujhhgtgfeyxiexzf abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtgMo1123Ujhhgtgfeyxiexzf.mo1119Ujhhgtgfeyxiexzf();
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1189feyxiexzfUjhhgtg.f4476Ujhhgtgfeyxiexzf)) {
                    i2 = 3;
                } else {
                    C1189feyxiexzfUjhhgtg c1189feyxiexzfUjhhgtg = C1189feyxiexzfUjhhgtg.f4475Ujhhgtgfeyxiexzf;
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, c1189feyxiexzfUjhhgtg)) {
                        i2 = 3;
                    } else {
                        i2 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf(), c1189feyxiexzfUjhhgtg) ? 4 : 1;
                    }
                }
            } else {
                i2 = 5;
            }
        }
        this.f3400Ujhhgtgfeyxiexzf = i2;
        m4027feyxiexzfUjhhgtg(mo1272Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, i));
        mo2326Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf, obj);
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void mo2334Ujhhgtgfeyxiexzf(float f) {
        m2351Ujhhgtgfeyxiexzf(m4026feyxiexzfUjhhgtg(), f);
    }

    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void mo2335feyxiexzfUjhhgtg(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i, byte b) {
        m2352feyxiexzfUjhhgtg(b, mo1272Ujhhgtgfeyxiexzf(c0857feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void mo2336feyxiexzfUjhhgtg(char c) {
        m2352feyxiexzfUjhhgtg(c, m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final void mo2337feyxiexzfUjhhgtg(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i, float f) {
        m2351Ujhhgtgfeyxiexzf(mo1272Ujhhgtgfeyxiexzf(c0857feyxiexzfUjhhgtg, i), f);
    }

    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void mo2338feyxiexzfUjhhgtg(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i, short s) {
        m2352feyxiexzfUjhhgtg(s, mo1272Ujhhgtgfeyxiexzf(c0857feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void mo2339feyxiexzfUjhhgtg(int i, int i2, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        m2352feyxiexzfUjhhgtg(i2, mo1272Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final void mo2340feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i, String str) {
        mo2354Ujhhgtgfeyxiexzf(mo1272Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, i), str);
    }

    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final void mo2341feyxiexzfUjhhgtg(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i, char c) {
        m2352feyxiexzfUjhhgtg(c, mo1272Ujhhgtgfeyxiexzf(c0857feyxiexzfUjhhgtg, i));
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void mo2342feyxiexzfUjhhgtg(int i) {
        m2352feyxiexzfUjhhgtg(i, m4026feyxiexzfUjhhgtg());
    }

    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void mo2343feyxiexzfUjhhgtg(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i, long j) {
        m2353feyxiexzfUjhhgtg(mo1272Ujhhgtgfeyxiexzf(c0857feyxiexzfUjhhgtg, i), j);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ, reason: contains not printable characters */
    public final void mo2344feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i, InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf, Object obj) {
        int i2;
        if (interfaceC1121feyxiexzfUjhhgtg.mo1124Ujhhgtgfeyxiexzf(i)) {
            i2 = 2;
        } else {
            AbstractC3611Ujhhgtgfeyxiexzf abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(i).mo1119Ujhhgtgfeyxiexzf();
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1189feyxiexzfUjhhgtg.f4476Ujhhgtgfeyxiexzf)) {
                i2 = 3;
            } else {
                C1189feyxiexzfUjhhgtg c1189feyxiexzfUjhhgtg = C1189feyxiexzfUjhhgtg.f4475Ujhhgtgfeyxiexzf;
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, c1189feyxiexzfUjhhgtg)) {
                    i2 = 3;
                } else {
                    i2 = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf(), c1189feyxiexzfUjhhgtg) ? 4 : 1;
                }
            }
        }
        this.f3400Ujhhgtgfeyxiexzf = i2;
        m4027feyxiexzfUjhhgtg(mo1272Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, i));
        if (interfaceC0146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf().mo1183Ujhhgtgfeyxiexzf()) {
            mo2326Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf, obj);
        } else if (obj == null) {
            mo2325Ujhhgtgfeyxiexzf();
        } else {
            mo2326Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf, obj);
        }
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void mo2345feyxiexzfUjhhgtg(long j) {
        m2353feyxiexzfUjhhgtg(m4026feyxiexzfUjhhgtg(), j);
    }

    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final boolean mo2346feyxiexzfUjhhgtg() {
        this.f3401Ujhhgtgfeyxiexzf.getClass();
        return false;
    }

    @Override // p000.InterfaceC2875feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final InterfaceC3329Ujhhgtgfeyxiexzf mo2347Ujhhgtgfeyxiexzf(C0857feyxiexzfUjhhgtg c0857feyxiexzfUjhhgtg, int i) {
        long jMo1272Ujhhgtgfeyxiexzf = mo1272Ujhhgtgfeyxiexzf(c0857feyxiexzfUjhhgtg, i);
        c0857feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(i);
        m4027feyxiexzfUjhhgtg(jMo1272Ujhhgtgfeyxiexzf);
        return this;
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void mo2348Ujhhgtgfeyxiexzf(String str) {
        mo2354Ujhhgtgfeyxiexzf(m4026feyxiexzfUjhhgtg(), str);
    }

    @Override // p000.InterfaceC3329Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public InterfaceC2875feyxiexzfUjhhgtg mo2349Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i) {
        AbstractC3611Ujhhgtgfeyxiexzf abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf();
        C1189feyxiexzfUjhhgtg c1189feyxiexzfUjhhgtg = C1189feyxiexzfUjhhgtg.f4475Ujhhgtgfeyxiexzf;
        boolean zM4512Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, c1189feyxiexzfUjhhgtg);
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = this.f3402Ujhhgtgfeyxiexzf;
        if (!zM4512Ujhhgtgfeyxiexzf) {
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(abstractC3611UjhhgtgfeyxiexzfMo1119Ujhhgtgfeyxiexzf, C1189feyxiexzfUjhhgtg.f4476Ujhhgtgfeyxiexzf)) {
                return new C0199Ujhhgtgfeyxiexzf(((long[]) this.f8573Ujhhgtgfeyxiexzf)[this.f8572Ujhhgtgfeyxiexzf], c0709Ujhhgtgfeyxiexzf, this.f3401Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
            }
            throw new C0670Ujhhgtgfeyxiexzf("This serial kind is not supported as collection: " + interfaceC1121feyxiexzfUjhhgtg);
        }
        long jM4025Ujhhgtgfeyxiexzf = m4025Ujhhgtgfeyxiexzf();
        if ((JSONWriter.MASK_IGNORE_NON_FIELD_GETTER & jM4025Ujhhgtgfeyxiexzf) != 0 && AbstractC0217Ujhhgtgfeyxiexzf.m1331feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(0))) {
            return new C1481feyxiexzfUjhhgtg(m4025Ujhhgtgfeyxiexzf(), c0709Ujhhgtgfeyxiexzf, this.f3401Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
        }
        if (jM4025Ujhhgtgfeyxiexzf == 19500) {
            c0709Ujhhgtgfeyxiexzf.m2019Ujhhgtgfeyxiexzf((C2612feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf, i, EnumC0860feyxiexzfUjhhgtg.DEFAULT);
        }
        InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg2 = this.f3403Ujhhgtgfeyxiexzf;
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg2.mo1119Ujhhgtgfeyxiexzf(), c1189feyxiexzfUjhhgtg) || jM4025Ujhhgtgfeyxiexzf == 19500 || interfaceC1121feyxiexzfUjhhgtg2.equals(interfaceC1121feyxiexzfUjhhgtg)) {
            return new C0989feyxiexzfUjhhgtg(jM4025Ujhhgtgfeyxiexzf, c0709Ujhhgtgfeyxiexzf, this.f3401Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
        }
        return new C0446Ujhhgtgfeyxiexzf(this.f3401Ujhhgtgfeyxiexzf, c0709Ujhhgtgfeyxiexzf, jM4025Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg, new C2612feyxiexzfUjhhgtg());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m2350Ujhhgtgfeyxiexzf(long j, double d) {
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = this.f3402Ujhhgtgfeyxiexzf;
        C2612feyxiexzfUjhhgtg c2612feyxiexzfUjhhgtg = (C2612feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf;
        if (j == 19500) {
            c2612feyxiexzfUjhhgtg.m3918Ujhhgtgfeyxiexzf(Long.reverseBytes(Double.doubleToRawLongBits(d)));
            return;
        }
        c0709Ujhhgtgfeyxiexzf.m2019Ujhhgtgfeyxiexzf(c2612feyxiexzfUjhhgtg, EnumC0867feyxiexzfUjhhgtg.i64.m2298Ujhhgtgfeyxiexzf((int) (j & 2147483647L)), EnumC0860feyxiexzfUjhhgtg.DEFAULT);
        c2612feyxiexzfUjhhgtg.m3918Ujhhgtgfeyxiexzf(Long.reverseBytes(Double.doubleToRawLongBits(d)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2351Ujhhgtgfeyxiexzf(long j, float f) {
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = this.f3402Ujhhgtgfeyxiexzf;
        C2612feyxiexzfUjhhgtg c2612feyxiexzfUjhhgtg = (C2612feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf;
        if (j == 19500) {
            c2612feyxiexzfUjhhgtg.m3917Ujhhgtgfeyxiexzf(Integer.reverseBytes(Float.floatToRawIntBits(f)));
            return;
        }
        c0709Ujhhgtgfeyxiexzf.m2019Ujhhgtgfeyxiexzf(c2612feyxiexzfUjhhgtg, EnumC0867feyxiexzfUjhhgtg.i32.m2298Ujhhgtgfeyxiexzf((int) (j & 2147483647L)), EnumC0860feyxiexzfUjhhgtg.DEFAULT);
        c2612feyxiexzfUjhhgtg.m3917Ujhhgtgfeyxiexzf(Integer.reverseBytes(Float.floatToRawIntBits(f)));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final void m2352feyxiexzfUjhhgtg(int i, long j) {
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = this.f3402Ujhhgtgfeyxiexzf;
        C2612feyxiexzfUjhhgtg c2612feyxiexzfUjhhgtg = (C2612feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf;
        EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtg = EnumC0860feyxiexzfUjhhgtg.DEFAULT;
        if (j == 19500) {
            c0709Ujhhgtgfeyxiexzf.m2019Ujhhgtgfeyxiexzf(c2612feyxiexzfUjhhgtg, i, enumC0860feyxiexzfUjhhgtg);
            return;
        }
        int i2 = (int) (2147483647L & j);
        EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtgM1327Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1327Ujhhgtgfeyxiexzf(j);
        c0709Ujhhgtgfeyxiexzf.m2019Ujhhgtgfeyxiexzf(c2612feyxiexzfUjhhgtg, (enumC0860feyxiexzfUjhhgtgM1327Ujhhgtgfeyxiexzf == EnumC0860feyxiexzfUjhhgtg.FIXED ? EnumC0867feyxiexzfUjhhgtg.i32 : EnumC0867feyxiexzfUjhhgtg.VARINT).m2298Ujhhgtgfeyxiexzf(i2), enumC0860feyxiexzfUjhhgtg);
        c0709Ujhhgtgfeyxiexzf.m2019Ujhhgtgfeyxiexzf(c2612feyxiexzfUjhhgtg, i, enumC0860feyxiexzfUjhhgtgM1327Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m2353feyxiexzfUjhhgtg(long j, long j2) {
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = this.f3402Ujhhgtgfeyxiexzf;
        C2612feyxiexzfUjhhgtg c2612feyxiexzfUjhhgtg = (C2612feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf;
        EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtg = EnumC0860feyxiexzfUjhhgtg.DEFAULT;
        if (j == 19500) {
            c0709Ujhhgtgfeyxiexzf.m2020Ujhhgtgfeyxiexzf(c2612feyxiexzfUjhhgtg, j2, enumC0860feyxiexzfUjhhgtg);
            return;
        }
        int i = (int) (2147483647L & j);
        EnumC0860feyxiexzfUjhhgtg enumC0860feyxiexzfUjhhgtgM1327Ujhhgtgfeyxiexzf = AbstractC0217Ujhhgtgfeyxiexzf.m1327Ujhhgtgfeyxiexzf(j);
        c0709Ujhhgtgfeyxiexzf.m2019Ujhhgtgfeyxiexzf(c2612feyxiexzfUjhhgtg, (enumC0860feyxiexzfUjhhgtgM1327Ujhhgtgfeyxiexzf == EnumC0860feyxiexzfUjhhgtg.FIXED ? EnumC0867feyxiexzfUjhhgtg.i64 : EnumC0867feyxiexzfUjhhgtg.VARINT).m2298Ujhhgtgfeyxiexzf(i), enumC0860feyxiexzfUjhhgtg);
        c0709Ujhhgtgfeyxiexzf.m2020Ujhhgtgfeyxiexzf(c2612feyxiexzfUjhhgtg, j2, enumC0860feyxiexzfUjhhgtgM1327Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void mo2354Ujhhgtgfeyxiexzf(long j, String str) {
        C0709Ujhhgtgfeyxiexzf c0709Ujhhgtgfeyxiexzf = this.f3402Ujhhgtgfeyxiexzf;
        if (j == 19500) {
            c0709Ujhhgtgfeyxiexzf.m2026Ujhhgtgfeyxiexzf(str.getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf));
            return;
        }
        byte[] bytes = str.getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
        c0709Ujhhgtgfeyxiexzf.m2019Ujhhgtgfeyxiexzf((C2612feyxiexzfUjhhgtg) c0709Ujhhgtgfeyxiexzf.f2944Ujhhgtgfeyxiexzf, EnumC0867feyxiexzfUjhhgtg.SIZE_DELIMITED.m2298Ujhhgtgfeyxiexzf((int) (j & 2147483647L)), EnumC0860feyxiexzfUjhhgtg.DEFAULT);
        c0709Ujhhgtgfeyxiexzf.m2026Ujhhgtgfeyxiexzf(bytes);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ */
    public long mo1272Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, int i) {
        return AbstractC0217Ujhhgtgfeyxiexzf.m1321Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ */
    public void mo1775feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
    }
}
