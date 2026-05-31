package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᛸᤝᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2888 extends AbstractC1272 implements InterfaceC0978, InterfaceC0764 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final AbstractC1725 f9240;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final EnumC3732 f9241;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C0154 f9242;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public int f9243 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final C1739 f9244;

    public C2888(AbstractC1725 abstractC1725, EnumC3732 enumC3732, C0154 c0154, InterfaceC2715 interfaceC2715) {
        this.f9240 = abstractC1725;
        this.f9241 = enumC3732;
        this.f9242 = c0154;
        this.f9244 = abstractC1725.f5842.f5862 ? null : new C1739(interfaceC2715);
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2329(InterfaceC2715 interfaceC2715) {
        if (interfaceC2715.mo3641() == 0 && AbstractC1467.m3273(this.f9240, interfaceC2715)) {
            while (mo2331(interfaceC2715) != -1) {
            }
        }
        C0154 c0154 = this.f9242;
        if (c0154.m1335()) {
            AbstractC2234.m4174(c0154, "");
            throw null;
        }
        c0154.m1307(this.f9241.f11617);
        C0776 c0776 = (C0776) c0154.f1219;
        int i = c0776.f2878;
        int[] iArr = (int[]) c0776.f2881;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            c0776.f2878 = i - 1;
        }
        int i2 = c0776.f2878;
        if (i2 != -1) {
            c0776.f2878 = i2 - 1;
        }
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC0764 mo2636(InterfaceC2715 interfaceC2715) {
        AbstractC1725 abstractC1725 = this.f9240;
        EnumC3732 enumC3732M4237 = AbstractC2236.m4237(abstractC1725, interfaceC2715);
        C0154 c0154 = this.f9242;
        C0776 c0776 = (C0776) c0154.f1219;
        int i = c0776.f2878 + 1;
        c0776.f2878 = i;
        if (i == ((Object[]) c0776.f2880).length) {
            c0776.m2384();
        }
        ((Object[]) c0776.f2880)[i] = interfaceC2715;
        c0154.m1307(enumC3732M4237.f11616);
        if (c0154.m1326() == 4) {
            C0154.m1298(c0154, "Unexpected leading comma", 0, 6);
            throw null;
        }
        int iOrdinal = enumC3732M4237.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new C2888(abstractC1725, enumC3732M4237, c0154, interfaceC2715);
        }
        return (this.f9241 == enumC3732M4237 && abstractC1725.f5842.f5862) ? this : new C2888(abstractC1725, enumC3732M4237, c0154, interfaceC2715);
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final boolean mo2637() {
        boolean z;
        boolean z2;
        C0154 c0154 = this.f9242;
        int iM1334 = c0154.m1334();
        String str = (String) c0154.f1222;
        if (iM1334 == str.length()) {
            C0154.m1298(c0154, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iM1334) == '\"') {
            iM1334++;
            z = true;
        } else {
            z = false;
        }
        int iM1329 = c0154.m1329(iM1334);
        if (iM1329 >= str.length() || iM1329 == -1) {
            C0154.m1298(c0154, "EOF", 0, 6);
            throw null;
        }
        int i = iM1329 + 1;
        int iCharAt = str.charAt(iM1329) | ' ';
        if (iCharAt == 102) {
            c0154.m1303(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                C0154.m1298(c0154, "Expected valid boolean literal prefix, but had '" + c0154.m1311() + '\'', 0, 6);
                throw null;
            }
            c0154.m1303(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (c0154.f1217 == str.length()) {
            C0154.m1298(c0154, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(c0154.f1217) == '\"') {
            c0154.f1217++;
            return z2;
        }
        C0154.m1298(c0154, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final char mo2638() {
        C0154 c0154 = this.f9242;
        String strM1311 = c0154.m1311();
        if (strM1311.length() == 1) {
            return strM1311.charAt(0);
        }
        C0154.m1298(c0154, AbstractC2844.m4783("Expected single char, but got '", strM1311, '\''), 0, 6);
        throw null;
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final Object mo2639(InterfaceC1767 interfaceC1767) {
        try {
            if (!(interfaceC1767 instanceof AbstractC0075)) {
                return interfaceC1767.mo1068(this);
            }
            AbstractC1095.m2807(interfaceC1767);
            throw null;
        } catch (C2016 e) {
            if (AbstractC2901.m4861(e.getMessage(), "at path", false)) {
                throw e;
            }
            throw new C2016(e.getMessage() + " at path: " + ((C0776) this.f9242.f1219).m2379(), e, e.f6700, e.f6701);
        }
    }

    @Override // p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final int mo2331(InterfaceC2715 interfaceC2715) {
        C0154 c0154 = this.f9242;
        C0776 c0776 = (C0776) c0154.f1219;
        EnumC3732 enumC3732 = this.f9241;
        int iOrdinal = enumC3732.ordinal();
        boolean zM1335 = false;
        int iM2877 = -1;
        if (iOrdinal == 0) {
            boolean zM1336 = c0154.m1335();
            while (true) {
                boolean zM1301 = c0154.m1301();
                C1739 c1739 = this.f9244;
                if (!zM1301) {
                    if (!zM1336) {
                        if (c1739 == null) {
                            break;
                        }
                        iM2877 = c1739.f5872.m2877();
                        break;
                    }
                    AbstractC2234.m4175(c0154);
                    throw null;
                }
                String strM1304 = c0154.m1304();
                c0154.m1307(':');
                AbstractC1725 abstractC1725 = this.f9240;
                int iM3272 = AbstractC1467.m3272(interfaceC2715, abstractC1725, strM1304);
                if (iM3272 != -3) {
                    if (c1739 != null) {
                        c1739.f5872.m2876(iM3272);
                    }
                    iM2877 = iM3272;
                    break;
                }
                if (!AbstractC1467.m3273(abstractC1725, interfaceC2715)) {
                    int i = c0776.f2878;
                    int[] iArr = (int[]) c0776.f2881;
                    if (iArr[i] == -2) {
                        iArr[i] = -1;
                        c0776.f2878 = i - 1;
                    }
                    int i2 = c0776.f2878;
                    if (i2 != -1) {
                        c0776.f2878 = i2 - 1;
                    }
                    c0154.m1315(AbstractC2901.m4870(6, ((String) c0154.f1222).subSequence(0, c0154.f1217).toString(), strM1304), AbstractC2844.m4783("Encountered an unknown key '", strM1304, '\''), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                    throw null;
                }
                ArrayList arrayList = new ArrayList();
                byte bM1326 = c0154.m1326();
                if (bM1326 == 8 || bM1326 == 6) {
                    while (true) {
                        byte bM1327 = c0154.m1326();
                        if (bM1327 == 1) {
                            c0154.m1304();
                        } else {
                            if (bM1327 == 8 || bM1327 == 6) {
                                arrayList.add(Byte.valueOf(bM1327));
                            } else if (bM1327 == 9) {
                                if (((Number) AbstractC0739.m2296(arrayList)).byteValue() != 8) {
                                    C0154.m1298(c0154, "found ] instead of }", 0, 6);
                                    throw null;
                                }
                                AbstractC0745.m2319(arrayList);
                            } else if (bM1327 == 7) {
                                if (((Number) AbstractC0739.m2296(arrayList)).byteValue() != 6) {
                                    C0154.m1298(c0154, "found } instead of ]", 0, 6);
                                    throw null;
                                }
                                AbstractC0745.m2319(arrayList);
                            } else if (bM1327 == 10) {
                                C0154.m1298(c0154, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                throw null;
                            }
                            c0154.m1305();
                            if (arrayList.size() == 0) {
                                break;
                            }
                        }
                    }
                } else {
                    c0154.m1311();
                }
                zM1336 = c0154.m1335();
            }
        } else if (iOrdinal != 2) {
            boolean zM1337 = c0154.m1335();
            if (c0154.m1301()) {
                int i3 = this.f9243;
                if (i3 != -1 && !zM1337) {
                    C0154.m1298(c0154, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                iM2877 = i3 + 1;
                this.f9243 = iM2877;
            } else if (zM1337) {
                AbstractC2234.m4174(c0154, "array");
                throw null;
            }
        } else {
            int i4 = this.f9243;
            boolean z = i4 % 2 != 0;
            if (!z) {
                c0154.m1307(':');
            } else if (i4 != -1) {
                zM1335 = c0154.m1335();
            }
            if (c0154.m1301()) {
                if (z) {
                    if (this.f9243 == -1) {
                        int i5 = c0154.f1217;
                        if (zM1335) {
                            C0154.m1298(c0154, "Unexpected leading comma", i5, 4);
                            throw null;
                        }
                    } else {
                        int i6 = c0154.f1217;
                        if (!zM1335) {
                            C0154.m1298(c0154, "Expected comma after the key-value pair", i6, 4);
                            throw null;
                        }
                    }
                }
                iM2877 = this.f9243 + 1;
                this.f9243 = iM2877;
            } else if (zM1335) {
                AbstractC2234.m4175(c0154);
                throw null;
            }
        }
        if (enumC3732 != EnumC3732.MAP) {
            ((int[]) c0776.f2881)[c0776.f2878] = iM2877;
        }
        return iM2877;
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ */
    public final int mo2640() {
        C0154 c0154 = this.f9242;
        long jM1308 = c0154.m1308();
        int i = (int) jM1308;
        if (jM1308 == i) {
            return i;
        }
        C0154.m1298(c0154, "Failed to parse int for input '" + jM1308 + '\'', 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final AbstractC1736 m4845() {
        return new C0383(this.f9240.f5842, this.f9242).m1710();
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ */
    public final InterfaceC0978 mo2641(InterfaceC2715 interfaceC2715) {
        return AbstractC2890.m4848(interfaceC2715) ? new C1733(this.f9242) : this;
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0764
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ */
    public final Object mo2338(InterfaceC2715 interfaceC2715, int i, InterfaceC1767 interfaceC1767, Object obj) {
        C0776 c0776 = (C0776) this.f9242.f1219;
        boolean z = this.f9241 == EnumC3732.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) c0776.f2881;
            int i2 = c0776.f2878;
            if (iArr[i2] == -2) {
                ((Object[]) c0776.f2880)[i2] = C1139.f4221;
            }
        }
        Object objMo2639 = mo2639(interfaceC1767);
        if (z) {
            int[] iArr2 = (int[]) c0776.f2881;
            int i3 = c0776.f2878;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                c0776.f2878 = i4;
                if (i4 == ((Object[]) c0776.f2880).length) {
                    c0776.m2384();
                }
            }
            Object[] objArr = (Object[]) c0776.f2880;
            int i5 = c0776.f2878;
            objArr[i5] = ((C1732) c0776.f2879).f5867 ? objMo2639 : C1139.f4220;
            ((int[]) c0776.f2881)[i5] = -2;
        }
        return objMo2639;
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ */
    public final String mo2642() {
        return this.f9242.m1310();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final AbstractC1725 m4846() {
        return this.f9240;
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final long mo2643() {
        return this.f9242.m1308();
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final boolean mo2644() {
        C1739 c1739 = this.f9244;
        if (!(c1739 != null ? c1739.f5873 : false)) {
            C0154 c0154 = this.f9242;
            int iM1329 = c0154.m1329(c0154.m1334());
            String str = (String) c0154.f1222;
            int length = str.length() - iM1329;
            boolean z = false;
            if (length >= 4 && iM1329 != -1) {
                for (int i = 0; i < 4; i++) {
                    if ("null".charAt(i) == str.charAt(iM1329 + i)) {
                    }
                }
                if (length <= 4 || AbstractC1467.m3264(str.charAt(iM1329 + 4)) != 0) {
                    z = true;
                    c0154.f1217 = iM1329 + 4;
                }
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲁᲇᤞ */
    public final byte mo2645() {
        C0154 c0154 = this.f9242;
        long jM1308 = c0154.m1308();
        byte b = (byte) jM1308;
        if (jM1308 == b) {
            return b;
        }
        C0154.m1298(c0154, "Failed to parse byte for input '" + jM1308 + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᲇᤞᲁ */
    public final short mo2646() {
        C0154 c0154 = this.f9242;
        long jM1308 = c0154.m1308();
        short s = (short) jM1308;
        if (jM1308 == s) {
            return s;
        }
        C0154.m1298(c0154, "Failed to parse short for input '" + jM1308 + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲀᲈᲇ */
    public final float mo2647() {
        C0154 c0154 = this.f9242;
        String strM1311 = c0154.m1311();
        try {
            float f = Float.parseFloat(strM1311);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            C0154.m1298(c0154, AbstractC2234.m4179(Float.valueOf(f), null), 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0154.m1298(c0154, AbstractC2844.m4783("Failed to parse type 'float' for input '", strM1311, '\''), 0, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC1272, p000.InterfaceC0978
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᤞᲇᲈᲀ */
    public final double mo2648() {
        C0154 c0154 = this.f9242;
        String strM1311 = c0154.m1311();
        try {
            double d = Double.parseDouble(strM1311);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            C0154.m1298(c0154, AbstractC2234.m4179(Double.valueOf(d), null), 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0154.m1298(c0154, AbstractC2844.m4783("Failed to parse type 'double' for input '", strM1311, '\''), 0, 6);
            throw null;
        }
    }
}
