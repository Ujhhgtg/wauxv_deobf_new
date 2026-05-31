package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲁᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2490 extends AbstractC0573 implements InterfaceC1207, InterfaceC0765 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f7888;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2480 f7889;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1681 f7890;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC2715 f7891;

    public C2490(C2480 c2480, C1681 c1681, InterfaceC2715 interfaceC2715) {
        super(1, false);
        this.f7888 = 5;
        this.f7889 = c2480;
        this.f7890 = c1681;
        this.f7891 = interfaceC2715;
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2343(InterfaceC2715 interfaceC2715) {
        int i = this.f2365;
        if (i >= 0) {
            if (i < 0) {
                throw new C1667("No tag in stack for requested element");
            }
            long[] jArr = (long[]) this.f2366;
            this.f2365 = i - 1;
            long j = jArr[i];
        }
        mo4126(interfaceC2715);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public InterfaceC0765 mo2918(InterfaceC2715 interfaceC2715) {
        AbstractC2236 abstractC2236Mo3640 = interfaceC2715.mo3640();
        boolean zM3322 = AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9281);
        C1681 c1681 = this.f7890;
        if (zM3322) {
            if (!AbstractC2240.m4258(interfaceC2715.mo3644(0)) || (m2115() & JSONWriter.MASK_IGNORE_NON_FIELD_GETTER) == 0) {
                return new C2604(m2115(), c1681, this.f7889, interfaceC2715);
            }
            return new C2346(m2115(), c1681, this.f7889, interfaceC2715);
        }
        if (!AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9280) && !AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9283) && !(abstractC2236Mo3640 instanceof AbstractC2428)) {
            if (AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9282)) {
                return new C1923(m2115(), c1681, this.f7889, interfaceC2715);
            }
            throw new C1667("This serial kind is not supported as structure: " + interfaceC2715);
        }
        long jM2115 = m2115();
        if (jM2115 == 19500 && interfaceC2715.equals(this.f7891)) {
            return this;
        }
        if (AbstractC2240.m4257(jM2115)) {
            return new C2323(this.f7889, c1681, interfaceC2715);
        }
        return new C2166(m2115(), c1681, this.f7889, interfaceC2715);
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo2344(C2448 c2448, int i, double d) {
        m4419(mo3870(c2448, i), d);
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2919() {
        String str;
        int i = this.f7888;
        if (i != 1) {
            int iM4792 = AbstractC2844.m4792(i);
            if (iM4792 == 1) {
                str = "'null' is not supported for optional properties in ProtoBuf";
            } else if (iM4792 == 2) {
                str = "'null' is not supported as the value of collection types in ProtoBuf";
            } else if (iM4792 != 3) {
                str = iM4792 != 4 ? "'null' is not supported in ProtoBuf" : "'null' is not allowed for not-null properties";
            } else {
                str = "'null' is not supported as the value of a list element in ProtoBuf";
            }
            throw new C1667(str);
        }
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final void mo2920(InterfaceC1767 interfaceC1767, Object obj) {
        if (interfaceC1767 instanceof C1822) {
            C2899 c2899 = C2899.f9270;
            C1740 c1740 = C1740.f5874;
            C1921 c1921 = new C1921(0);
            C0264 c0264 = new C0264((C2717) c1921.f6337, 2);
            Set setEntrySet = ((Map) obj).entrySet();
            int size = setEntrySet.size();
            InterfaceC0765 interfaceC0765Mo2931 = mo2931(c0264, size);
            Iterator it = setEntrySet.iterator();
            for (int i = 0; i < size; i++) {
                interfaceC0765Mo2931.mo2346(c0264, i, c1921, it.next());
            }
            interfaceC0765Mo2931.mo2343(c0264);
            return;
        }
        boolean zM3322 = AbstractC1469.m3322(interfaceC1767.mo1509(), C0501.f2167.f7803);
        EnumC2482 enumC2482 = EnumC2482.DEFAULT;
        C1681 c1681 = this.f7890;
        if (zM3322) {
            byte[] bArr = (byte[]) obj;
            long jM2120 = m2120();
            if (jM2120 == 19500) {
                c1681.m3562(bArr);
                return;
            }
            c1681.m3556((C0500) c1681.f5660, EnumC2487.SIZE_DELIMITED.m4409((int) (2147483647L & jM2120)), enumC2482);
            c1681.m3562(bArr);
            return;
        }
        if (!AbstractC1469.m3322(interfaceC1767.mo1509(), C3532.f11121.f7803)) {
            interfaceC1767.mo1648(this, obj);
            return;
        }
        byte[] bArr2 = ((C3530) obj).f11118;
        long jM2121 = m2120();
        if (jM2121 == 19500) {
            c1681.m3562(bArr2);
            return;
        }
        c1681.m3556((C0500) c1681.f5660, EnumC2487.SIZE_DELIMITED.m4409((int) (2147483647L & jM2121)), enumC2482);
        c1681.m3562(bArr2);
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final void mo2921(double d) {
        m4419(m2120(), d);
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo2922(short s) {
        m4421(s, m2120());
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final void mo2923(byte b) {
        m4421(b, m2120());
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final void mo2924(boolean z) {
        m4421(z ? 1 : 0, m2120());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public InterfaceC1207 mo2925(InterfaceC2715 interfaceC2715) {
        m2121(m2120());
        return this;
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public final void mo2345(InterfaceC2715 interfaceC2715, int i, boolean z) {
        m4421(z ? 1 : 0, mo3870(interfaceC2715, i));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ */
    public final void mo2346(InterfaceC2715 interfaceC2715, int i, InterfaceC1767 interfaceC1767, Object obj) {
        int i2;
        if (interfaceC2715.mo3645(i)) {
            i2 = 2;
        } else {
            InterfaceC2715 interfaceC2715Mo3644 = interfaceC2715.mo3644(i);
            if (interfaceC2715Mo3644.mo3638()) {
                AbstractC2236 abstractC2236Mo3640 = interfaceC2715Mo3644.mo3640();
                if (AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9282)) {
                    i2 = 3;
                } else {
                    C2911 c2911 = C2911.f9281;
                    if (AbstractC1469.m3322(abstractC2236Mo3640, c2911)) {
                        i2 = 3;
                    } else {
                        i2 = AbstractC1469.m3322(interfaceC2715.mo3640(), c2911) ? 4 : 1;
                    }
                }
            } else {
                i2 = 5;
            }
        }
        this.f7888 = i2;
        m2121(mo3870(interfaceC2715, i));
        mo2920(interfaceC1767, obj);
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public final void mo2926(float f) {
        m4420(m2120(), f);
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final void mo2347(C2448 c2448, int i, byte b) {
        m4421(b, mo3870(c2448, i));
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final void mo2927(char c) {
        m4421(c, m2120());
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final void mo2348(C2448 c2448, int i, float f) {
        m4420(mo3870(c2448, i), f);
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2349(C2448 c2448, int i, short s) {
        m4421(s, mo3870(c2448, i));
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ */
    public final void mo2350(int i, int i2, InterfaceC2715 interfaceC2715) {
        m4421(i2, mo3870(interfaceC2715, i));
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ */
    public final void mo2351(InterfaceC2715 interfaceC2715, int i, String str) {
        mo4287(mo3870(interfaceC2715, i), str);
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ */
    public final void mo2352(C2448 c2448, int i, char c) {
        m4421(c, mo3870(c2448, i));
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ */
    public final void mo2928(int i) {
        m4421(i, m2120());
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ */
    public final void mo2353(C2448 c2448, int i, long j) {
        m4422(mo3870(c2448, i), j);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ */
    public final void mo2354(InterfaceC2715 interfaceC2715, int i, InterfaceC1767 interfaceC1767, Object obj) {
        int i2;
        if (interfaceC2715.mo3645(i)) {
            i2 = 2;
        } else {
            AbstractC2236 abstractC2236Mo3640 = interfaceC2715.mo3644(i).mo3640();
            if (AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9282)) {
                i2 = 3;
            } else {
                C2911 c2911 = C2911.f9281;
                if (AbstractC1469.m3322(abstractC2236Mo3640, c2911)) {
                    i2 = 3;
                } else {
                    i2 = AbstractC1469.m3322(interfaceC2715.mo3640(), c2911) ? 4 : 1;
                }
            }
        }
        this.f7888 = i2;
        m2121(mo3870(interfaceC2715, i));
        if (interfaceC1767.mo1509().mo3638()) {
            mo2920(interfaceC1767, obj);
        } else if (obj == null) {
            mo2919();
        } else {
            mo2920(interfaceC1767, obj);
        }
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᤞᲇ */
    public final void mo2929(long j) {
        m4422(m2120(), j);
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᲁᤞ */
    public final boolean mo2355() {
        this.f7889.getClass();
        return false;
    }

    @Override // p000.InterfaceC0765
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲇᲈ */
    public final InterfaceC1207 mo2356(C2448 c2448, int i) {
        long jMo3870 = mo3870(c2448, i);
        c2448.mo3644(i);
        m2121(jMo3870);
        return this;
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲀᲈ */
    public final void mo2930(String str) {
        mo4287(m2120(), str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲈᲀᲇ */
    public InterfaceC0765 mo2931(InterfaceC2715 interfaceC2715, int i) {
        AbstractC2236 abstractC2236Mo3640 = interfaceC2715.mo3640();
        C2911 c2911 = C2911.f9281;
        boolean zM3322 = AbstractC1469.m3322(abstractC2236Mo3640, c2911);
        C1681 c1681 = this.f7890;
        if (!zM3322) {
            if (AbstractC1469.m3322(abstractC2236Mo3640, C2911.f9282)) {
                return new C1923(((long[]) this.f2366)[this.f2365], c1681, this.f7889, interfaceC2715);
            }
            throw new C1667("This serial kind is not supported as collection: " + interfaceC2715);
        }
        long jM2115 = m2115();
        if ((JSONWriter.MASK_IGNORE_NON_FIELD_GETTER & jM2115) != 0 && AbstractC2240.m4258(interfaceC2715.mo3644(0))) {
            return new C2346(m2115(), c1681, this.f7889, interfaceC2715);
        }
        if (jM2115 == 19500) {
            c1681.m3556((C0500) c1681.f5660, i, EnumC2482.DEFAULT);
        }
        InterfaceC2715 interfaceC2716 = this.f7891;
        if (!AbstractC1469.m3322(interfaceC2716.mo3640(), c2911) || jM2115 == 19500 || interfaceC2716.equals(interfaceC2715)) {
            return new C2604(jM2115, c1681, this.f7889, interfaceC2715);
        }
        return new C2166(this.f7889, c1681, jM2115, interfaceC2715, new C0500());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
    public final void m4419(long j, double d) {
        C1681 c1681 = this.f7890;
        C0500 c0500 = (C0500) c1681.f5660;
        if (j == 19500) {
            c0500.m1944(Long.reverseBytes(Double.doubleToRawLongBits(d)));
            return;
        }
        c1681.m3556(c0500, EnumC2487.i64.m4409((int) (j & 2147483647L)), EnumC2482.DEFAULT);
        c0500.m1944(Long.reverseBytes(Double.doubleToRawLongBits(d)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲈᲀ, reason: contains not printable characters */
    public final void m4420(long j, float f) {
        C1681 c1681 = this.f7890;
        C0500 c0500 = (C0500) c1681.f5660;
        if (j == 19500) {
            c0500.m1943(Integer.reverseBytes(Float.floatToRawIntBits(f)));
            return;
        }
        c1681.m3556(c0500, EnumC2487.i32.m4409((int) (j & 2147483647L)), EnumC2482.DEFAULT);
        c0500.m1943(Integer.reverseBytes(Float.floatToRawIntBits(f)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᤞᲈ, reason: contains not printable characters */
    public final void m4421(int i, long j) {
        C1681 c1681 = this.f7890;
        C0500 c0500 = (C0500) c1681.f5660;
        EnumC2482 enumC2482 = EnumC2482.DEFAULT;
        if (j == 19500) {
            c1681.m3556(c0500, i, enumC2482);
            return;
        }
        int i2 = (int) (2147483647L & j);
        EnumC2482 enumC2482M4252 = AbstractC2240.m4252(j);
        c1681.m3556(c0500, (enumC2482M4252 == EnumC2482.FIXED ? EnumC2487.i32 : EnumC2487.VARINT).m4409(i2), enumC2482);
        c1681.m3556(c0500, i, enumC2482M4252);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲀᲈᤞ, reason: contains not printable characters */
    public final void m4422(long j, long j2) {
        C1681 c1681 = this.f7890;
        C0500 c0500 = (C0500) c1681.f5660;
        EnumC2482 enumC2482 = EnumC2482.DEFAULT;
        if (j == 19500) {
            c1681.m3557(c0500, j2, enumC2482);
            return;
        }
        int i = (int) (2147483647L & j);
        EnumC2482 enumC2482M4252 = AbstractC2240.m4252(j);
        c1681.m3556(c0500, (enumC2482M4252 == EnumC2482.FIXED ? EnumC2487.i64 : EnumC2487.VARINT).m4409(i), enumC2482);
        c1681.m3557(c0500, j2, enumC2482M4252);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ */
    public void mo4287(long j, String str) {
        C1681 c1681 = this.f7890;
        if (j == 19500) {
            c1681.m3562(str.getBytes(AbstractC0580.UTF_8));
            return;
        }
        byte[] bytes = str.getBytes(AbstractC0580.UTF_8);
        c1681.m3556((C0500) c1681.f5660, EnumC2487.SIZE_DELIMITED.m4409((int) (j & 2147483647L)), EnumC2482.DEFAULT);
        c1681.m3562(bytes);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ */
    public long mo3870(InterfaceC2715 interfaceC2715, int i) {
        return AbstractC2240.m4246(interfaceC2715, i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ */
    public void mo4126(InterfaceC2715 interfaceC2715) {
    }
}
