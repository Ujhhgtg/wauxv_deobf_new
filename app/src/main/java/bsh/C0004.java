package bsh;

import bsh.This;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import p000.AbstractC1194;
import p000.AbstractC1672;
import p000.AbstractC2784;
import p000.C0333;
import p000.C0339;
import p000.C0340;
import p000.C0345;
import p000.C0352;
import p000.C0356;
import p000.C0357;
import p000.C0359;
import p000.C0481;
import p000.C0482;
import p000.C0550;
import p000.C0702;
import p000.C0711;
import p000.C1007;
import p000.C1229;
import p000.C1669;
import p000.C1983;
import p000.C2000;
import p000.C3449;
import p000.C3523;
import p000.C3532;
import p000.EnumC0703;
import p000.InterfaceC2225;
import p000.RunnableC1668;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0004 {

    public static C0004 f472;

    public static Class m317(String str, C2000 c2000, Class[] clsArr, Class cls, C0333 c0333, EnumC0703 enumC0703, C0550 c0550, RunnableC1668 runnableC1668) {
        int i;
        String str2;
        int i2;
        C0711 c0711;
        String str3;
        int i3;
        String str4;
        String str5;
        Class cls2;
        Method method;
        String str6;
        C0005 c0005;
        char c;
        int i4;
        String str7;
        String str8;
        int i5;
        String str9;
        ArrayList arrayList;
        String str10;
        String strConcat;
        String str11;
        String str12;
        C0482 c0482;
        C0007 c0007;
        String str13;
        C0482 c0483;
        C0007 c0008;
        C0550 c0551 = c0550;
        C0007 c0007M1929 = c0551.m1929();
        String strM354 = c0007M1929.m354();
        String str14 = c0007M1929.f508 ? c0007M1929.f493 + "$" + str : str;
        String str15 = strM354 == null ? str14 : strM354 + "." + str14;
        C0482 c0482M346 = runnableC1668.f5634.m346();
        String str16 = null;
        C0007 c0009 = new C0007(c0007M1929, null, str14);
        c0009.f508 = true;
        c0551.m1927(c0009);
        c0333.m1449(c0551, runnableC1668, Boolean.TRUE, C0702.f2675);
        ArrayList arrayList2 = new ArrayList();
        int i6 = 0;
        while (i6 < c0333.m4710().length) {
            InterfaceC2225 interfaceC2225 = c0333.f8721[i6];
            if (interfaceC2225 instanceof C0002) {
                C0002 c0002 = (C0002) interfaceC2225;
                try {
                    try {
                        arrayList2.add(new C3532(c0002.f468, Enum.class, str16, c0002.f467));
                    } catch (C3523 unused) {
                    }
                } catch (C3523 unused2) {
                }
            } else {
                if (interfaceC2225 instanceof C0357) {
                    C0357 c0357 = (C0357) interfaceC2225;
                    C2000 c2001 = c0357.f1671;
                    C0359[] c0359ArrM1469 = c0357.m1469();
                    int length = c0359ArrM1469.length;
                    int i7 = 0;
                    while (true) {
                        str11 = str14;
                        if (i7 >= length) {
                            break;
                        }
                        String str17 = str15;
                        try {
                            c0483 = c0482M346;
                            try {
                                c0008 = c0009;
                                try {
                                    arrayList2.add(new C3532(c0359ArrM1469[i7].f1675, ((C0356) c0357.f8721[0]).m1467(c0551, runnableC1668), null, c2001));
                                } catch (C1229 | C3523 unused3) {
                                }
                            } catch (C1229 | C3523 unused4) {
                                c0008 = c0009;
                            }
                        } catch (C1229 | C3523 unused5) {
                            c0483 = c0482M346;
                        }
                        i7++;
                        str14 = str11;
                        str15 = str17;
                        c0482M346 = c0483;
                        c0009 = c0008;
                    }
                    str12 = str15;
                    c0482 = c0482M346;
                    c0007 = c0009;
                    str13 = null;
                }
                i6++;
                str16 = str13;
                str14 = str11;
                str15 = str12;
                c0482M346 = c0482;
                c0009 = c0007;
            }
            str11 = str14;
            str12 = str15;
            c0482 = c0482M346;
            c0007 = c0009;
            str13 = str16;
            i6++;
            str16 = str13;
            str14 = str11;
            str15 = str12;
            c0482M346 = c0482;
            c0009 = c0007;
        }
        String str18 = str14;
        String str19 = str15;
        C0482 c0484 = c0482M346;
        C0007 c00010 = c0009;
        String str20 = str16;
        C3532[] c3532Arr = (C3532[]) arrayList2.toArray(new C3532[arrayList2.size()]);
        ArrayList arrayList3 = new ArrayList();
        if (c0551.m1929().f493.indexOf("$anon") > -1) {
            String strM417 = AbstractC0010.m417(c0551.m1929().f493);
            C0481 c0481 = (C0481) C0482.f2092.m3641(cls);
            String name = cls.getName();
            ThreadLocal<Map<String, Object[]>> threadLocal = This.CONTEXT_ARGS;
            AbstractC1672 abstractC1672M1717 = c0481.m1717(name, AbstractC0010.m420(threadLocal.get().get(strM417)));
            C0007 c0007M19210 = c0551.m1929();
            C1007 c1007 = new C1007(strM417, C0356.m1466(abstractC1672M1717.mo2346()), null, new String[abstractC1672M1717.mo2889()], abstractC1672M1717.m3399(), null, new C0333(0), c0007M19210, null, abstractC1672M1717.mo2892(), null, null);
            c1007.f3675 = abstractC1672M1717;
            c1007.f2148 = new C2000(5);
            c1007.m1747().m3860("public");
            if (c1007.f2154 == null) {
                c1007.f2154 = new C2000[c1007.m1749()];
            }
            c0007M19210.mo313(c1007);
            c1007.f3676 = threadLocal.get().remove(strM417);
            arrayList3.add(c1007);
        }
        int i8 = 0;
        while (true) {
            if (i8 >= c0333.m4710().length) {
                break;
            }
            InterfaceC2225 interfaceC2226 = c0333.f8721[i8];
            if (interfaceC2226 instanceof C0345) {
                C0345 c0345 = (C0345) interfaceC2226;
                c0345.m1458();
                C2000 c2002 = c0345.f1641;
                String str21 = c0345.f1636;
                c0345.m1458();
                C0352 c0352 = c0345.f1637;
                String strM1468 = c0352 == null ? str20 : c0352.f1662 ? "V" : ((C0356) c0352.f8721[0]).m1468(runnableC1668, c0551, strM354);
                c0345.m1458();
                C0352 c0353 = c0345.f1637;
                C0340 c0340 = c0345.f1638;
                String[] strArr = c0340.f1622;
                if (strArr != null) {
                    str10 = strM1468;
                } else {
                    c0340.m1453();
                    strArr = new String[c0340.f1621];
                    int i9 = 0;
                    while (i9 < c0340.f1621) {
                        C0339 c0339 = (C0339) c0340.f8721[i9];
                        int i10 = i9;
                        if (c0339.m4710().length > 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(c0339.f1615 ? "[" : "");
                            sb.append(((C0356) c0339.f8721[0]).m1468(runnableC1668, c0551, strM354));
                            strConcat = sb.toString();
                        } else {
                            strConcat = (c0339.f1615 ? "[" : "").concat("Ljava/lang/Object;");
                        }
                        strArr[i10] = strConcat;
                        i9 = i10 + 1;
                        strM1468 = strM1468;
                    }
                    str10 = strM1468;
                    c0340.f1622 = strArr;
                }
                C0340 c0341 = c0345.f1638;
                c0341.m1453();
                arrayList = arrayList3;
                arrayList.add(new C1007(str21, str10, c0353, c0341.f1617, strArr, c0340, c0345.f1639, null, c2002, c0345.f1644, c0551, runnableC1668));
            } else {
                arrayList = arrayList3;
            }
            i8++;
            c0551 = c0550;
            arrayList3 = arrayList;
            c00010 = c00010;
            c0007M1929 = c0007M1929;
            strM354 = strM354;
            str19 = str19;
            c0484 = c0484;
            str20 = null;
        }
        String str22 = strM354;
        String str23 = str19;
        C0482 c0485 = c0484;
        C0007 c00011 = c00010;
        C0007 c00012 = c0007M1929;
        ArrayList arrayList4 = arrayList3;
        C1007[] c1007Arr = (C1007[]) arrayList4.toArray(new C1007[arrayList4.size()]);
        c0550.m1926();
        c00011.mo310(runnableC1668);
        EnumC0703 enumC0704 = enumC0703;
        C0007 c00013 = c00011;
        C0005 c0006 = new C0005(c2000, str18, str22, cls, clsArr, c3532Arr, c1007Arr, c00013, enumC0704);
        C1007[] c1007Arr2 = c0006.f481;
        try {
            c00013.mo314("" + This.Keys.BSHCLASSMODIFIERS, c2000, false);
            c00013.mo314("" + This.Keys.BSHCONSTRUCTORS, c1007Arr2, false);
            c00013.mo314("" + This.Keys.BSHINIT, c0333, false);
            String str24 = str23;
            Class clsMo299 = (Class) c0485.f2098.get(str24);
            if (clsMo299 == null) {
                Map<String, C0007> map = This.contextStore;
                String str25 = c0006.f476;
                C0007 c00014 = map.get(str25);
                int iM322 = C0005.m322(c2000);
                EnumC0703 enumC0705 = EnumC0703.f2680;
                EnumC0703 enumC0706 = EnumC0703.f2679;
                if (enumC0704 == enumC0706) {
                    i = iM322 | 1537;
                } else if (enumC0704 == enumC0705) {
                    i = iM322 | 16433;
                } else {
                    i = iM322 | 33;
                    if ((i & 1024) > 0) {
                        i -= 1024;
                    }
                }
                int i11 = i;
                Class[] clsArr2 = c0006.f479;
                String[] strArr2 = new String[clsArr2.length + 1];
                for (int i12 = 0; i12 < clsArr2.length; i12++) {
                    strArr2[i12] = C3449.m4978(clsArr2[i12]);
                    if (AbstractC0009.m401(clsArr2[i12])) {
                        C3532[] c3532ArrM396 = AbstractC0009.m396(AbstractC0009.m394(clsArr2[i12]));
                        int i13 = 0;
                        for (int length2 = c3532ArrM396.length; i13 < length2; length2 = length2) {
                            c00014.m368(c3532ArrM396[i13]);
                            i13++;
                        }
                    }
                }
                strArr2[clsArr2.length] = C3449.m4978(GeneratedClass.class);
                C0711 c0712 = new C0711();
                String str26 = c0006.f474;
                c0712.m2137(i11, c0006.f475, enumC0704 == enumC0705 ? AbstractC1194.m2785("Ljava/lang/Enum<", str26, ">;") : null, c0006.f478, strArr2);
                String str27 = "Lbsh/This;";
                if (enumC0704 != enumC0706) {
                    str2 = null;
                    c0712.m2138(1, This.Keys.BSHTHIS + str18, "Lbsh/This;", null);
                } else {
                    str2 = null;
                }
                c0712.m2138(25, This.Keys.BSHSTATIC + str18, "Lbsh/This;", str2);
                c0712.m2138(25, "UUID", "Ljava/lang/String;", str25);
                C3532[] c3532Arr2 = c0006.f480;
                int length3 = c3532Arr2.length;
                Object obj = "V";
                int i14 = 0;
                while (true) {
                    String str28 = "enum";
                    C3532[] c3532Arr3 = c3532Arr2;
                    String str29 = "private";
                    if (i14 < length3) {
                        int i15 = length3;
                        C3532 c3532 = c3532Arr3[i14];
                        boolean zM5125 = c3532.m5125("private");
                        int i16 = i14;
                        str7 = c3532.f11060;
                        if (zM5125) {
                            str8 = str27;
                        } else {
                            str8 = str27;
                            if (c3532.f11062 == null) {
                                Class<Object> cls3 = c3532.f11061;
                                if (cls3 == null) {
                                    cls3 = Object.class;
                                }
                                c3532.f11062 = C0356.m1466(cls3);
                            }
                            String str30 = c3532.f11062;
                            int iM323 = C0005.m322(c3532.m5123());
                            if (enumC0704 != enumC0706) {
                                if (enumC0704 == enumC0705 && c3532.m5125("enum")) {
                                    i5 = iM323 | 16400;
                                    str9 = str26;
                                } else {
                                    i5 = iM323;
                                    str9 = str30;
                                }
                                c0712.m2138(i5, str7, str9, null);
                            } else {
                                if (c3532.m5125("private") || c3532.m5125("protected")) {
                                    break;
                                }
                                c3532.m5123().f6669 = 25;
                                c00014.m368(c3532);
                            }
                            i14 = i16 + 1;
                            str27 = str8;
                            c3532Arr2 = c3532Arr3;
                            length3 = i15;
                        }
                        i14 = i16 + 1;
                        str27 = str8;
                        c3532Arr2 = c3532Arr3;
                        length3 = i15;
                    } else {
                        String str31 = str27;
                        String str32 = c0006.f475;
                        if (enumC0704 == enumC0705) {
                            C1983 c1983M2139 = c0712.m2139(9, "values", AbstractC2784.m4757("()[", str26), null, null);
                            C0005.m325(str32, str18, c1983M2139);
                            c1983M2139.m3845(182, "bsh/This", "enumValues", "()[Ljava/lang/Object;");
                            C0005.m321("[" + str26, c1983M2139);
                            c1983M2139.m3844();
                            C1983 c1983M21310 = c0712.m2139(9, "valueOf", "(Ljava/lang/String;)" + str26, null, null);
                            c1983M21310.m3843(C3449.m4979(0, str26.length(), str26));
                            c1983M21310.m3847(25, 0);
                            c1983M21310.m3845(184, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;");
                            C0005.m321(str26, c1983M21310);
                            c1983M21310.m3844();
                            C1983 c1983M21311 = c0712.m2139(2, "<init>", "(Ljava/lang/String;I)V", null, null);
                            c1983M21311.m3847(25, 0);
                            c1983M21311.m3847(25, 1);
                            c1983M21311.m3847(21, 2);
                            c1983M21311.m3845(183, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V");
                            c1983M21311.m3847(25, 0);
                            c1983M21311.m3843(str18);
                            C0005.m320(new String[0], false, c1983M21311);
                            c1983M21311.m3845(184, "bsh/This", "initInstance", "(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V");
                            c1983M21311.m3839(177);
                            c1983M21311.m3844();
                        }
                        C1983 c1983M21312 = c0712.m2139(8, "<clinit>", "()V", null, null);
                        C0711 c0713 = c0712;
                        c1983M21312.m3836(178, str32, "UUID", "Ljava/lang/String;");
                        c1983M21312.m3845(184, "bsh/This", "pullBshStatic", "(Ljava/lang/String;)Lbsh/This;");
                        c1983M21312.m3836(179, str32, This.Keys.BSHSTATIC + str18, str31);
                        if (enumC0704 == enumC0705) {
                            int length4 = c3532Arr3.length;
                            int i17 = 3;
                            int i18 = 0;
                            while (i18 < length4) {
                                C3532 c3533 = c3532Arr3[i18];
                                boolean zM5126 = c3533.m5125(str28);
                                String str33 = c3533.f11060;
                                if (zM5126) {
                                    c1983M21312.m3846(187, str32);
                                    c1983M21312.m3839(89);
                                    c1983M21312.m3843(str33);
                                    if (8 >= i17) {
                                        i4 = i17 + 1;
                                        c1983M21312.m3839(i17);
                                    } else {
                                        c1983M21312.m3840(16, i17 - 3);
                                        i4 = i17 + 1;
                                    }
                                    c1983M21312.m3845(183, str32, "<init>", "(Ljava/lang/String;I)V");
                                    c1983M21312.m3836(179, str32, str33, str26);
                                    i17 = i4;
                                    c = 179;
                                } else {
                                    c = 179;
                                }
                                i18++;
                                str28 = str28;
                            }
                        }
                        c1983M21312.m3843(C3449.m4979(0, str26.length(), str26));
                        c1983M21312.m3845(184, "bsh/This", "initStatic", "(Ljava/lang/Class;)V");
                        c1983M21312.m3839(177);
                        c1983M21312.m3844();
                        boolean z = false;
                        int i19 = 0;
                        while (i19 < c1007Arr2.length) {
                            String str34 = str29;
                            if (c1007Arr2[i19].m1753(str34)) {
                                c0005 = c0006;
                            } else {
                                int iM324 = C0005.m322(c1007Arr2[i19].m1747());
                                C1007 c1008 = c1007Arr2[i19];
                                AbstractC1672 abstractC1672 = c1008.f2156;
                                if (abstractC1672 == null ? c1008.f2159 : abstractC1672.mo2892()) {
                                    iM324 |= 128;
                                }
                                c0005 = c0006;
                                c0005.m326(i19, c1007Arr2[i19].f3670, iM324, c0713);
                                z = true;
                            }
                            i19++;
                            str29 = str34;
                            c0006 = c0005;
                        }
                        C0005 c00015 = c0006;
                        String str35 = str29;
                        if (enumC0704 == EnumC0703.f2678 && !z) {
                            c00015.m326(-1, new String[0], 1, c0713);
                        }
                        C1007[] c1007Arr3 = c00015.f482;
                        int length5 = c1007Arr3.length;
                        int i20 = 0;
                        while (i20 < length5) {
                            C1007 c1009 = c1007Arr3[i20];
                            boolean zM1753 = c1009.m1753(str35);
                            String str36 = c1009.f3668;
                            String[] strArr3 = c1009.f3670;
                            if (zM1753) {
                                c1007Arr3 = c1007Arr3;
                                i2 = length5;
                                str3 = str35;
                                i3 = i20;
                                c0711 = c0713;
                            } else {
                                enumC0706 = enumC0706;
                                if (enumC0704 == enumC0706 && !c1009.m1753("static") && !c1009.m1753("default") && !c1009.m1753("abstract")) {
                                    c1009.m1747().m3860("abstract");
                                }
                                int iM325 = C0005.m322(c1009.m1747());
                                AbstractC1672 abstractC1673 = c1009.f2156;
                                if (abstractC1673 == null ? c1009.f2159 : abstractC1673.mo2892()) {
                                    iM325 |= 128;
                                }
                                int i21 = iM325;
                                int i22 = i21 & 8;
                                boolean z2 = i22 > 0;
                                String strM1748 = c1009.m1748();
                                boolean z3 = i22 != 0;
                                i2 = length5;
                                String str37 = str36 == null ? "Ljava/lang/Object;" : str36;
                                c0711 = c0713;
                                C1983 c1983M21313 = c0711.m2139(i21, strM1748, C0005.m323(str37, strArr3), C0005.m324(strArr3), null);
                                str3 = str35;
                                i3 = i20;
                                if ((i21 & 1024) != 0) {
                                    enumC0706 = enumC0706;
                                    str36 = str36;
                                } else {
                                    if (z3 || enumC0704 == enumC0706) {
                                        C0005.m325(str32, str18, c1983M21313);
                                    } else {
                                        c1983M21313.m3847(25, 0);
                                        c1983M21313.m3836(180, str32, This.Keys.BSHTHIS + str18, str31);
                                    }
                                    c1983M21313.m3843(strM1748);
                                    C0005.m320(strArr3, z3, c1983M21313);
                                    c1983M21313.m3839(4);
                                    c1983M21313.m3845(182, "bsh/This", "invokeMethod", "(Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/Object;");
                                    obj = obj;
                                    if (str37.equals(obj)) {
                                        c1983M21313.m3839(87);
                                        c1983M21313.m3839(177);
                                    } else if (str37.length() == 1) {
                                        boolean zEquals = str37.equals("Z");
                                        int i23 = 172;
                                        if (zEquals) {
                                            str4 = "java/lang/Boolean";
                                            str5 = "booleanValue";
                                        } else if (str37.equals("C")) {
                                            str4 = "java/lang/Character";
                                            str5 = "charValue";
                                        } else if (str37.equals("B")) {
                                            str4 = "java/lang/Byte";
                                            str5 = "byteValue";
                                        } else if (str37.equals("S")) {
                                            str4 = "java/lang/Short";
                                            str5 = "shortValue";
                                        } else if (str37.equals("F")) {
                                            i23 = 174;
                                            str4 = "java/lang/Float";
                                            str5 = "floatValue";
                                        } else if (str37.equals("J")) {
                                            i23 = 173;
                                            str4 = "java/lang/Long";
                                            str5 = "longValue";
                                        } else if (str37.equals("D")) {
                                            i23 = 175;
                                            str4 = "java/lang/Double";
                                            str5 = "doubleValue";
                                        } else {
                                            str4 = "java/lang/Integer";
                                            str5 = "intValue";
                                        }
                                        String str38 = str5;
                                        c1983M21313.m3846(192, str4);
                                        c1983M21313.m3845(182, str4, str38, "()".concat(str37));
                                        c1983M21313.m3839(i23);
                                    } else {
                                        c1983M21313.m3846(192, C0005.m318(str37));
                                        c1983M21313.m3839(176);
                                    }
                                    c1983M21313.m3844();
                                }
                                String strM1749 = c1009.m1748();
                                Class cls4 = c00015.f477;
                                Class superclass = cls4;
                                while (true) {
                                    if (superclass == null) {
                                        cls2 = cls4;
                                        method = null;
                                        break;
                                    }
                                    Method[] declaredMethods = superclass.getDeclaredMethods();
                                    int length6 = declaredMethods.length;
                                    int i24 = 0;
                                    while (i24 < length6) {
                                        method = declaredMethods[i24];
                                        cls2 = cls4;
                                        if (method.getName().equals(strM1749)) {
                                            str6 = strM1749;
                                            if (strArr3.length == method.getParameterCount()) {
                                                Class<?>[] parameterTypes = method.getParameterTypes();
                                                int length7 = parameterTypes.length;
                                                String[] strArr4 = new String[length7];
                                                for (int i25 = 0; i25 < length7; i25++) {
                                                    strArr4[i25] = C0356.m1466(parameterTypes[i25]);
                                                }
                                                int i26 = 0;
                                                boolean zEquals2 = true;
                                                while (i26 < strArr3.length) {
                                                    int i27 = i26;
                                                    zEquals2 = strArr3[i26].equals(strArr4[i27]);
                                                    if (!zEquals2) {
                                                        break;
                                                    }
                                                    i26 = i27 + 1;
                                                }
                                                if (zEquals2) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            str6 = strM1749;
                                        }
                                        i24++;
                                        strM1749 = str6;
                                        cls4 = cls2;
                                    }
                                    superclass = superclass.getSuperclass();
                                }
                                if (method != null && !z2) {
                                    String strM17410 = c1009.m1748();
                                    String str39 = str36 == null ? "Ljava/lang/Object;" : str36;
                                    Class cls5 = cls2;
                                    String strM323 = C0005.m323(str39, strArr3);
                                    C1983 c1983M21314 = c0711.m2139(1, "_bshSuper" + cls5.getSimpleName() + strM17410, strM323, C0005.m324(strArr3), null);
                                    int i28 = 0;
                                    c1983M21314.m3847(25, 0);
                                    int length8 = strArr3.length;
                                    int i29 = 1;
                                    while (i28 < length8) {
                                        String str40 = str32;
                                        String str41 = strArr3[i28];
                                        int i30 = length8;
                                        if (str41.length() == 1) {
                                            c1983M21314.m3847(21, i29);
                                        } else {
                                            c1983M21314.m3847(25, i29);
                                        }
                                        i29 += (str41.equals("D") || str41.equals("J")) ? 2 : 1;
                                        i28++;
                                        str32 = str40;
                                        length8 = i30;
                                    }
                                    str32 = str32;
                                    c1983M21314.m3845(183, c00015.f478, strM17410, strM323);
                                    C0005.m321(str39, c1983M21314);
                                    c1983M21314.m3844();
                                }
                                i20 = i3 + 1;
                                enumC0704 = enumC0703;
                                c1007Arr3 = c1007Arr3;
                                length5 = i2;
                                str35 = str3;
                                c0713 = c0711;
                                str32 = str32;
                            }
                            i20 = i3 + 1;
                            enumC0704 = enumC0703;
                            c1007Arr3 = c1007Arr3;
                            length5 = i2;
                            str35 = str3;
                            c0713 = c0711;
                            str32 = str32;
                        }
                        byte[] bArrM2136 = c0713.m2136();
                        if ((System.getProperty("bsh.debugClasses") == null || System.getProperty("bsh.debugClasses").isEmpty()) ? false : true) {
                            ThreadLocal threadLocal2 = RunnableC1668.f5629;
                            String property = System.getProperty("bsh.debugClasses");
                            if (property != null) {
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(property + "/" + str18 + ".class");
                                    try {
                                        fileOutputStream.write(bArrM2136);
                                        fileOutputStream.close();
                                    } catch (Throwable th) {
                                        try {
                                            fileOutputStream.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        str24 = str24;
                        clsMo299 = c0485.mo299(str24, bArrM2136);
                        RunnableC1668.m3389("Define ", str24, " as ", clsMo299);
                    }
                }
                throw new IllegalArgumentException(AbstractC1194.m2785("Illegal modifier for interface field ", str7, ". Only public static & final are permitted."));
            }
            c00013 = c00013;
            c00012.mo311(str24.replace('$', '.'));
            C0007 c00016 = c00013;
            c00016.f511 = clsMo299;
            c00016.m359(clsMo299);
            RunnableC1668.m3389(c00016);
            return clsMo299;
        } catch (C3523 e2) {
            throw new C1669("Unable to init class static block: " + e2, e2);
        }
    }
}
