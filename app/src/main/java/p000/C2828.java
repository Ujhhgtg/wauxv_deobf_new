package p000;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2828 extends AbstractC1459 implements InterfaceC0974, InterfaceC0766 {

    public final C1706 f9078;

    public final EnumC3672 f9079;

    public final C0146 f9080;

    public int f9081 = -1;

    public final C1227 f9082;

    public C2828(C1706 c1706, EnumC3672 enumC3672, C0146 c0146, InterfaceC2654 interfaceC2654) {
        this.f9078 = c1706;
        this.f9079 = enumC3672;
        this.f9080 = c0146;
        C1227 c1227 = c1706.f5799;
        this.f9082 = c1227;
        
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0766
    public final void mo2228(InterfaceC2654 interfaceC2654) {
        int iMo3473 = interfaceC2654.mo3473();
        C1706 c1706 = this.f9078;
        if (iMo3473 == 0 && AbstractC1459.m3190(c1706, interfaceC2654)) {
            while (mo2230(interfaceC2654) != -1) {
            }
        }
        C0146 c0146 = this.f9080;
        if (c0146.m1189()) {
            
            AbstractC3681.m5329(c0146, "");
            throw null;
        }
        c0146.m1161(this.f9079.f11468);
        C0662 c0662 = (C0662) c0146.f1151;
        int i = c0662.f2529;
        int[] iArr = (int[]) c0662.f2532;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            c0662.f2529 = i - 1;
        }
        int i2 = c0662.f2529;
        if (i2 != -1) {
            c0662.f2529 = i2 - 1;
        }
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final InterfaceC0766 mo2512(InterfaceC2654 interfaceC2654) {
        C1706 c1706 = this.f9078;
        EnumC3672 enumC3672M3987 = AbstractC2201.m3987(c1706, interfaceC2654);
        C0146 c0146 = this.f9080;
        C0662 c0662 = (C0662) c0146.f1151;
        int i = c0662.f2529 + 1;
        c0662.f2529 = i;
        if (i == ((Object[]) c0662.f2531).length) {
            c0662.m2060();
        }
        ((Object[]) c0662.f2531)[i] = interfaceC2654;
        c0146.m1161(enumC3672M3987.f11467);
        if (c0146.m1180() == 4) {
            C0146.m1152(c0146, "Unexpected leading comma", 0, 6);
            throw null;
        }
        int iOrdinal = enumC3672M3987.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new C2828(c1706, enumC3672M3987, c0146, interfaceC2654);
        }
        if (this.f9079 != enumC3672M3987) {
            return new C2828(c1706, enumC3672M3987, c0146, interfaceC2654);
        }
        
        return this;
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final boolean mo2513() {
        boolean z;
        boolean z2;
        C0146 c0146 = this.f9080;
        int iM1188 = c0146.m1188();
        String str = (String) c0146.f1154;
        if (iM1188 == str.length()) {
            C0146.m1152(c0146, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iM1188) == '\"') {
            iM1188++;
            z = true;
        } else {
            z = false;
        }
        int iM1183 = c0146.m1183(iM1188);
        if (iM1183 >= str.length() || iM1183 == -1) {
            C0146.m1152(c0146, "EOF", 0, 6);
            throw null;
        }
        int i = iM1183 + 1;
        int iCharAt = str.charAt(iM1183) | ' ';
        if (iCharAt == 102) {
            c0146.m1157(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                C0146.m1152(c0146, "Expected valid boolean literal prefix, but had '" + c0146.m1165() + '\'', 0, 6);
                throw null;
            }
            c0146.m1157(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (c0146.f1149 == str.length()) {
            C0146.m1152(c0146, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(c0146.f1149) == '\"') {
            c0146.f1149++;
            return z2;
        }
        C0146.m1152(c0146, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final char mo2514() {
        C0146 c0146 = this.f9080;
        String strM1165 = c0146.m1165();
        if (strM1165.length() == 1) {
            return strM1165.charAt(0);
        }
        C0146.m1152(c0146, AbstractC2784.m4749("Expected single char, but got '", strM1165, '\''), 0, 6);
        throw null;
    }

    @Override // p000.InterfaceC0974
    public final Object mo2515(InterfaceC1743 interfaceC1743) {
        try {
            if (!(interfaceC1743 instanceof AbstractC0067)) {
                return interfaceC1743.mo924(this);
            }
            
            AbstractC1194.m2791(interfaceC1743);
            throw null;
        } catch (C1985 e) {
            if (AbstractC2841.m4828(e.getMessage(), "at path", false)) {
                throw e;
            }
            throw new C1985(e.getMessage() + " at path: " + ((C0662) this.f9080.f1151).m2054(), e, e.f6595, e.f6596);
        }
    }

    @Override // p000.InterfaceC0766
    public final int mo2230(InterfaceC2654 interfaceC2654) throws Throwable {
        Throwable th;
        Object objInvoke;
        C1706 c1706 = this.f9078;
        C1227 c1227 = c1706.f5799;
        C0146 c0146 = this.f9080;
        C0662 c0662 = (C0662) c0146.f1151;
        EnumC3672 enumC3672 = this.f9079;
        int iOrdinal = enumC3672.ordinal();
        Throwable th2 = null;
        char c = ':';
        boolean zM1189 = false;
        int i = -1;
        if (iOrdinal == 0) {
            boolean zM11810 = c0146.m1189();
            while (true) {
                if (!c0146.m1155()) {
                    Throwable th3 = th2;
                    if (!zM11810) {
                        break;
                    }
                    
                    AbstractC3681.m5330(c0146);
                    throw th3;
                }
                
                String strM1158 = c0146.m1158();
                c0146.m1161(58);
                
                AbstractC1459.m3194(c1706, interfaceC2654);
                int iMo3471 = interfaceC2654.mo3471(strM1158);
                if (iMo3471 != -3) {
                    th = th2;
                } else {
                    
                    C0094 c0094 = c1706.f5801;
                    th = th2;
                    C0299 c0299 = new C0299(interfaceC2654, 2, c1706);
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0094.f1049;
                    Map map = (Map) concurrentHashMap.get(interfaceC2654);
                    C0373 c0373 = AbstractC1459.f5194;
                    Object obj = map != null ? map.get(c0373) : null;
                    Object obj2 = obj != null ? obj : null;
                    if (obj2 != null) {
                        objInvoke = obj2;
                    } else {
                        objInvoke = c0299.invoke();
                        Object concurrentHashMap2 = concurrentHashMap.get(interfaceC2654);
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(interfaceC2654, concurrentHashMap2);
                        }
                        ((Map) concurrentHashMap2).put(c0373, objInvoke);
                    }
                    Integer num = (Integer) ((Map) objInvoke).get(strM1158);
                    iMo3471 = num != null ? num.intValue() : -3;
                }
                if (iMo3471 != -3) {
                    i = iMo3471;
                    break;
                }
                if (!AbstractC1459.m3190(c1706, interfaceC2654)) {
                    int i2 = c0662.f2529;
                    int[] iArr = (int[]) c0662.f2532;
                    if (iArr[i2] == -2) {
                        iArr[i2] = -1;
                        c0662.f2529 = i2 - 1;
                    }
                    int i3 = c0662.f2529;
                    if (i3 != -1) {
                        c0662.f2529 = i3 - 1;
                    }
                    c0146.m1169(AbstractC2841.m4837(6, ((String) c0146.f1154).subSequence(0, c0146.f1149).toString(), strM1158), AbstractC2784.m4749("Encountered an unknown key '", strM1158, '\''), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                    throw th;
                }
                ArrayList arrayList = new ArrayList();
                byte bM1180 = c0146.m1180();
                if (bM1180 == 8 || bM1180 == 6) {
                    while (true) {
                        byte bM1181 = c0146.m1180();
                        if (bM1181 == 1) {
                            c0146.m1158();
                        } else {
                            if (bM1181 == 8 || bM1181 == 6) {
                                arrayList.add(Byte.valueOf(bM1181));
                            } else if (bM1181 == 9) {
                                if (((Number) AbstractC0744.m2197(arrayList)).byteValue() != 8) {
                                    C0146.m1152(c0146, "found ] instead of }", 0, 6);
                                    throw th;
                                }
                                AbstractC0750.m2219(arrayList);
                            } else if (bM1181 == 7) {
                                if (((Number) AbstractC0744.m2197(arrayList)).byteValue() != 6) {
                                    C0146.m1152(c0146, "found } instead of ]", 0, 6);
                                    throw th;
                                }
                                AbstractC0750.m2219(arrayList);
                            } else if (bM1181 == 10) {
                                C0146.m1152(c0146, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                throw th;
                            }
                            c0146.m1159();
                            if (arrayList.size() == 0) {
                                break;
                            }
                        }
                    }
                } else {
                    c0146.m1165();
                }
                zM11810 = c0146.m1189();
                th2 = th;
                c = ':';
            }
        } else if (iOrdinal != 2) {
            boolean zM11811 = c0146.m1189();
            if (c0146.m1155()) {
                int i4 = this.f9081;
                if (i4 != -1 && !zM11811) {
                    C0146.m1152(c0146, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i = i4 + 1;
                this.f9081 = i;
            } else if (zM11811) {
                
                AbstractC3681.m5329(c0146, "array");
                throw null;
            }
        } else {
            int i5 = this.f9081;
            boolean z = i5 % 2 != 0;
            if (!z) {
                c0146.m1161(':');
            } else if (i5 != -1) {
                zM1189 = c0146.m1189();
            }
            if (c0146.m1155()) {
                if (z) {
                    if (this.f9081 == -1) {
                        int i6 = c0146.f1149;
                        if (zM1189) {
                            C0146.m1152(c0146, "Unexpected leading comma", i6, 4);
                            throw null;
                        }
                    } else {
                        int i7 = c0146.f1149;
                        if (!zM1189) {
                            C0146.m1152(c0146, "Expected comma after the key-value pair", i7, 4);
                            throw null;
                        }
                    }
                }
                i = this.f9081 + 1;
                this.f9081 = i;
            } else if (zM1189) {
                
                AbstractC3681.m5330(c0146);
                throw null;
            }
        }
        if (enumC3672 != EnumC3672.MAP) {
            ((int[]) c0662.f2532)[c0662.f2529] = i;
        }
        return i;
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final int mo2516() {
        C0146 c0146 = this.f9080;
        long jM1162 = c0146.m1162();
        int i = (int) jM1162;
        if (jM1162 == i) {
            return i;
        }
        C0146.m1152(c0146, "Failed to parse int for input '" + jM1162 + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final InterfaceC0974 mo2517(InterfaceC2654 interfaceC2654) {
        return AbstractC2830.m4815(interfaceC2654) ? new C1712(this.f9080) : this;
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0766
    public final Object mo2237(InterfaceC2654 interfaceC2654, int i, InterfaceC1743 interfaceC1743, Object obj) {
        C0662 c0662 = (C0662) this.f9080.f1151;
        boolean z = this.f9079 == EnumC3672.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) c0662.f2532;
            int i2 = c0662.f2529;
            if (iArr[i2] == -2) {
                ((Object[]) c0662.f2531)[i2] = C1133.f4209;
            }
        }
        Object objMo2515 = mo2515(interfaceC1743);
        if (z) {
            int[] iArr2 = (int[]) c0662.f2532;
            int i3 = c0662.f2529;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                c0662.f2529 = i4;
                if (i4 == ((Object[]) c0662.f2531).length) {
                    c0662.m2060();
                }
            }
            Object[] objArr = (Object[]) c0662.f2531;
            int i5 = c0662.f2529;
            
            objArr[i5] = objMo2515;
            ((int[]) c0662.f2532)[i5] = -2;
        }
        return objMo2515;
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final String mo2518() {
        
        return this.f9080.m1164();
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final long mo2519() {
        return this.f9080.m1162();
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final boolean mo2520() {
        C0146 c0146 = this.f9080;
        int iM1183 = c0146.m1183(c0146.m1188());
        String str = (String) c0146.f1154;
        int length = str.length() - iM1183;
        boolean z = false;
        if (length >= 4 && iM1183 != -1) {
            for (int i = 0; i < 4; i++) {
                if ("null".charAt(i) == str.charAt(iM1183 + i)) {
                }
            }
            if (length <= 4 || AbstractC1460.m3207(str.charAt(iM1183 + 4)) != 0) {
                z = true;
                c0146.f1149 = iM1183 + 4;
            }
        }
        return !z;
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final byte mo2521() {
        C0146 c0146 = this.f9080;
        long jM1162 = c0146.m1162();
        byte b = (byte) jM1162;
        if (jM1162 == b) {
            return b;
        }
        C0146.m1152(c0146, "Failed to parse byte for input '" + jM1162 + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final short mo2522() {
        C0146 c0146 = this.f9080;
        long jM1162 = c0146.m1162();
        short s = (short) jM1162;
        if (jM1162 == s) {
            return s;
        }
        C0146.m1152(c0146, "Failed to parse short for input '" + jM1162 + '\'', 0, 6);
        throw null;
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final float mo2523() {
        C0146 c0146 = this.f9080;
        String strM1165 = c0146.m1165();
        try {
            float f = Float.parseFloat(strM1165);
            
            if (Math.abs(f) <= 3.4028235E38f) {
                return f;
            }
            C0146.m1152(c0146, AbstractC3681.m5334(Float.valueOf(f), null), 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0146.m1152(c0146, AbstractC2784.m4749("Failed to parse type 'float' for input '", strM1165, '\''), 0, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC1459, p000.InterfaceC0974
    public final double mo2524() {
        C0146 c0146 = this.f9080;
        String strM1165 = c0146.m1165();
        try {
            double d = Double.parseDouble(strM1165);
            
            if (Math.abs(d) <= 1.7976931348623157E308) {
                return d;
            }
            C0146.m1152(c0146, AbstractC3681.m5334(Double.valueOf(d), null), 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0146.m1152(c0146, AbstractC2784.m4749("Failed to parse type 'double' for input '", strM1165, '\''), 0, 6);
            throw null;
        }
    }

    public final AbstractC1715 m4812() {
        return new C0408(this.f9078.f5799, this.f9080).m1604();
    }

    public final C1706 m4813() {
        return this.f9078;
    }
}
