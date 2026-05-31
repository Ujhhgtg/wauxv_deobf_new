package bsh;

import bsh.This;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import p000.AbstractC1095;
import p000.AbstractC1687;
import p000.C0457;
import p000.C0458;
import p000.C0527;
import p000.C0706;
import p000.C1231;
import p000.C1684;
import p000.C2014;
import p000.C3506;
import p000.C3581;
import p000.EnumC0698;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0005 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C0005 f480;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Class m323(String str, Modifiers modifiers, Class[] clsArr, Class cls, BSHBlock bSHBlock, EnumC0698 enumC0698, C0527 c0527, RunnableC0008 runnableC0008) {
        int i;
        int i2;
        String str2;
        String str3;
        C0007[] c0007Arr;
        String str4;
        EnumC0698 enumC0699;
        int i3;
        String str5;
        int i4;
        String str6;
        String str7;
        String str8;
        Method method;
        C0006 c0006;
        char c;
        int i5;
        int i6;
        String str9;
        int i7;
        ArrayList arrayList;
        String str10;
        String str11;
        C0458 c0458;
        C0012 c0012;
        Object obj;
        C0458 c0459;
        C0012 c0013;
        BSHBlock bSHBlock2 = bSHBlock;
        C0012 c0012M2024 = c0527.m2024();
        String strM374 = c0012M2024.m374();
        String str12 = c0012M2024.f535 ? c0012M2024.f520 + "$" + str : str;
        String str13 = strM374 == null ? str12 : strM374 + "." + str12;
        C0458 c0458M365 = runnableC0008.f505.m365();
        Object obj2 = null;
        C0012 c0014 = new C0012(c0012M2024, null, str12);
        c0014.f535 = true;
        c0527.m2022(c0014);
        bSHBlock2.evalBlock(c0527, runnableC0008, Boolean.TRUE, C0004.f477);
        ArrayList arrayList2 = new ArrayList();
        int i8 = 0;
        while (i8 < bSHBlock2.jjtGetNumChildren()) {
            Node nodeJjtGetChild = bSHBlock2.jjtGetChild(i8);
            if (nodeJjtGetChild instanceof BSHEnumConstant) {
                BSHEnumConstant bSHEnumConstant = (BSHEnumConstant) nodeJjtGetChild;
                try {
                    arrayList2.add(new Variable(bSHEnumConstant.getName(), bSHEnumConstant.getType(), obj2, bSHEnumConstant.mods));
                } catch (C3581 unused) {
                }
            } else {
                if (nodeJjtGetChild instanceof BSHTypedVariableDeclaration) {
                    BSHTypedVariableDeclaration bSHTypedVariableDeclaration = (BSHTypedVariableDeclaration) nodeJjtGetChild;
                    Modifiers modifiers2 = bSHTypedVariableDeclaration.modifiers;
                    BSHVariableDeclarator[] declarators = bSHTypedVariableDeclaration.getDeclarators();
                    int length = declarators.length;
                    int i9 = 0;
                    while (true) {
                        str10 = str12;
                        if (i9 >= length) {
                            break;
                        }
                        String str14 = str13;
                        try {
                            c0459 = c0458M365;
                            try {
                                c0013 = c0014;
                                try {
                                    arrayList2.add(new Variable(declarators[i9].name, bSHTypedVariableDeclaration.evalType(c0527, runnableC0008), (Object) null, modifiers2));
                                } catch (C1231 | C3581 unused2) {
                                }
                            } catch (C1231 | C3581 unused3) {
                                c0013 = c0014;
                            }
                        } catch (C1231 | C3581 unused4) {
                            c0459 = c0458M365;
                        }
                        i9++;
                        str12 = str10;
                        str13 = str14;
                        c0458M365 = c0459;
                        c0014 = c0013;
                    }
                    str11 = str13;
                    c0458 = c0458M365;
                    c0012 = c0014;
                    obj = null;
                }
                i8++;
                obj2 = obj;
                str12 = str10;
                str13 = str11;
                c0458M365 = c0458;
                c0014 = c0012;
            }
            str10 = str12;
            str11 = str13;
            c0458 = c0458M365;
            c0012 = c0014;
            obj = obj2;
            i8++;
            obj2 = obj;
            str12 = str10;
            str13 = str11;
            c0458M365 = c0458;
            c0014 = c0012;
        }
        String str15 = str12;
        String str16 = str13;
        C0458 c04510 = c0458M365;
        C0012 c0015 = c0014;
        Object obj3 = obj2;
        Variable[] variableArr = (Variable[]) arrayList2.toArray(new Variable[arrayList2.size()]);
        ArrayList arrayList3 = new ArrayList();
        byte b = -1;
        if (c0527.m2024().f520.indexOf("$anon") > -1) {
            String strM561 = AbstractC0017.m561(c0527.m2024().f520);
            C0457 c0457 = (C0457) C0458.f2065.m3819(cls);
            String name = cls.getName();
            ThreadLocal<Map<String, Object[]>> threadLocal = This.CONTEXT_ARGS;
            AbstractC1687 abstractC1687M1825 = c0457.m1825(name, AbstractC0017.m564(threadLocal.get().get(strM561)));
            C0012 c0012M2025 = c0527.m2024();
            i = 0;
            C0007 c0007 = new C0007(strM561, BSHType.getTypeDescriptor(abstractC1687M1825.mo2461()), null, new String[abstractC1687M1825.mo3008()], abstractC1687M1825.m3566(), null, new BSHBlock(0), c0012M2025, null, abstractC1687M1825.mo3011(), null, null);
            c0007.f498 = abstractC1687M1825;
            c0007.modifiers = new Modifiers(5);
            c0007.getModifiers().addModifier("public");
            c0007.getParameterModifiers();
            c0012M2025.mo316(c0007);
            c0007.f499 = threadLocal.get().remove(strM561);
            arrayList3.add(c0007);
        } else {
            i = 0;
        }
        int i10 = i;
        while (i10 < bSHBlock2.jjtGetNumChildren()) {
            Node nodeJjtGetChild2 = bSHBlock2.jjtGetChild(i10);
            if (nodeJjtGetChild2 instanceof BSHMethodDeclaration) {
                BSHMethodDeclaration bSHMethodDeclaration = (BSHMethodDeclaration) nodeJjtGetChild2;
                bSHMethodDeclaration.insureNodesParsed();
                Modifiers modifiers3 = bSHMethodDeclaration.modifiers;
                int i11 = i10;
                String str17 = bSHMethodDeclaration.name;
                String returnTypeDescriptor = bSHMethodDeclaration.getReturnTypeDescriptor(c0527, runnableC0008, strM374);
                BSHReturnType returnTypeNode = bSHMethodDeclaration.getReturnTypeNode();
                BSHFormalParameters bSHFormalParameters = bSHMethodDeclaration.paramsNode;
                i7 = i11;
                arrayList = arrayList3;
                C0007 c0008 = new C0007(str17, returnTypeDescriptor, returnTypeNode, bSHMethodDeclaration.paramsNode.getParamNames(), bSHFormalParameters.getTypeDescriptors(c0527, runnableC0008, strM374), bSHFormalParameters, bSHMethodDeclaration.blockNode, null, modifiers3, bSHMethodDeclaration.isVarArgs, c0527, runnableC0008);
                boolean z = bSHMethodDeclaration.isExtension;
                c0008.isExtension = z;
                if (z) {
                    c0008.receiverType = bSHMethodDeclaration.evalReceiverType(c0527, runnableC0008);
                }
                arrayList.add(c0008);
            } else {
                i7 = i10;
                arrayList = arrayList3;
            }
            i10 = i7 + 1;
            bSHBlock2 = bSHBlock;
            arrayList3 = arrayList;
            c0015 = c0015;
            c0012M2024 = c0012M2024;
            strM374 = strM374;
            str16 = str16;
            c04510 = c04510;
            b = -1;
            obj3 = null;
            i = 0;
        }
        String str18 = strM374;
        String str19 = str16;
        C0458 c04511 = c04510;
        C0012 c0016 = c0015;
        C0012 c0017 = c0012M2024;
        ArrayList arrayList4 = arrayList3;
        C0007[] c0007Arr2 = (C0007[]) arrayList4.toArray(new C0007[arrayList4.size()]);
        c0527.m2021();
        c0016.mo313(runnableC0008);
        C0012 c0018 = c0016;
        C0006 c0009 = new C0006(modifiers, str15, str18, cls, clsArr, variableArr, c0007Arr2, c0018, enumC0698);
        C0007[] c0007Arr3 = c0009.f489;
        try {
            c0018.mo317("" + This.Keys.BSHCLASSMODIFIERS, modifiers, false);
            c0018.mo317("" + This.Keys.BSHCONSTRUCTORS, c0007Arr3, false);
            c0018.mo317("" + This.Keys.BSHINIT, bSHBlock, false);
            String str20 = str19;
            Class clsMo305 = (Class) c04511.f2072.get(str20);
            if (clsMo305 == null) {
                Map<String, C0012> map = This.contextStore;
                String str21 = c0009.f484;
                C0012 c0019 = map.get(str21);
                int iM329 = C0006.m329(modifiers);
                EnumC0698 enumC06910 = EnumC0698.f2674;
                EnumC0698 enumC06911 = EnumC0698.f2673;
                if (enumC0698 == enumC06911) {
                    i2 = iM329 | 1537;
                } else if (enumC0698 == enumC06910) {
                    i2 = iM329 | 16433;
                } else {
                    i2 = iM329 | 33;
                    if ((i2 & 1024) > 0) {
                        i2 -= 1024;
                    }
                }
                int i12 = i2;
                Class[] clsArr2 = c0009.f487;
                String[] strArr = new String[clsArr2.length + 1];
                int i13 = 0;
                while (i13 < clsArr2.length) {
                    String[] strArr2 = strArr;
                    strArr2[i13] = clsArr2[i13].getName().replace('.', '/');
                    if (AbstractC0016.m546(clsArr2[i13])) {
                        Variable[] variableArrM541 = AbstractC0016.m541(AbstractC0016.m539(clsArr2[i13]));
                        int length2 = variableArrM541.length;
                        int i14 = 0;
                        while (i14 < length2) {
                            Variable[] variableArr2 = variableArrM541;
                            c0019.m387(variableArr2[i14]);
                            i14++;
                            variableArrM541 = variableArr2;
                        }
                    }
                    i13++;
                    strArr = strArr2;
                }
                String[] strArr3 = strArr;
                strArr3[clsArr2.length] = GeneratedClass.class.getName().replace('.', '/');
                C0706 c0706 = new C0706();
                String str22 = c0009.f482;
                c0706.m2230(i12, c0009.f483, enumC0698 == enumC06910 ? AbstractC1095.m2800("Ljava/lang/Enum<", str22, ">;") : null, c0009.f486, strArr3);
                C0706 c0707 = c0706;
                if (enumC0698 != enumC06911) {
                    str2 = null;
                    C0006.m326(This.Keys.BSHTHIS + str15, "Lbsh/This;", 1, null, c0707);
                } else {
                    str2 = null;
                }
                C0006.m326(This.Keys.BSHSTATIC + str15, "Lbsh/This;", 25, str2, c0707);
                C0006.m326("UUID", "Ljava/lang/String;", 25, str21, c0707);
                Variable[] variableArr3 = c0009.f488;
                int length3 = variableArr3.length;
                int i15 = 0;
                while (true) {
                    str3 = "enum";
                    c0007Arr = c0007Arr3;
                    str4 = "private";
                    if (i15 >= length3) {
                        break;
                    }
                    int i16 = i15;
                    Variable variable = variableArr3[i16];
                    if (!variable.hasModifier("private")) {
                        String typeDescriptor = variable.getTypeDescriptor();
                        int iM3210 = C0006.m329(variable.getModifiers());
                        if (enumC0698 == enumC06911) {
                            variable.setConstant();
                            c0019.m387(variable);
                        } else {
                            if (enumC0698 == enumC06910 && variable.hasModifier("enum")) {
                                i6 = iM3210 | 16400;
                                str9 = str22;
                            } else {
                                i6 = iM3210;
                                str9 = typeDescriptor;
                            }
                            C0006.m326(variable.getName(), str9, i6, null, c0707);
                        }
                    }
                    i15 = i16 + 1;
                    c0019 = c0019;
                    c0007Arr3 = c0007Arr;
                }
                String str23 = "bsh/This";
                EnumC0698 enumC06912 = enumC06911;
                String str24 = c0009.f483;
                if (enumC0698 == enumC06910) {
                    C2014 c2014M2231 = c0707.m2231(9, "values", "()[" + str22);
                    C0006.m331(str24, str15, c2014M2231);
                    c2014M2231.m4039(Opcodes.INVOKEVIRTUAL, "bsh/This", "enumValues", "()[Ljava/lang/Object;");
                    C0006.m328("[" + str22, c2014M2231);
                    c2014M2231.m4038();
                    C2014 c2014M2232 = c0707.m2231(9, "valueOf", "(Ljava/lang/String;)" + str22);
                    c2014M2232.m4037(C3506.m5038(0, str22.length(), str22));
                    c2014M2232.m4041(25, 0);
                    c2014M2232.m4039(Opcodes.INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;");
                    C0006.m328(str22, c2014M2232);
                    c2014M2232.m4038();
                    C2014 c2014M2233 = c0707.m2231(2, "<init>", "(Ljava/lang/String;I)V");
                    c2014M2233.m4041(25, 0);
                    c2014M2233.m4041(25, 1);
                    c2014M2233.m4041(21, 2);
                    c2014M2233.m4039(Opcodes.INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V");
                    c2014M2233.m4041(25, 0);
                    c2014M2233.m4037(str15);
                    C0006.m327(new String[0], false, c2014M2233);
                    c2014M2233.m4039(Opcodes.INVOKESTATIC, "bsh/This", "initInstance", "(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V");
                    c2014M2233.m4033(Opcodes.RETURN);
                    c2014M2233.m4038();
                }
                C2014 c2014M2234 = c0707.m2231(8, "<clinit>", "()V");
                c2014M2234.m4030(Opcodes.GETSTATIC, str24, "UUID", "Ljava/lang/String;");
                c2014M2234.m4039(Opcodes.INVOKESTATIC, "bsh/This", "pullBshStatic", "(Ljava/lang/String;)Lbsh/This;");
                c2014M2234.m4030(Opcodes.PUTSTATIC, str24, This.Keys.BSHSTATIC + str15, "Lbsh/This;");
                EnumC0698 enumC06913 = enumC0698;
                if (enumC06913 == enumC06910) {
                    Variable[] variableArr4 = variableArr3;
                    int length4 = variableArr4.length;
                    int i17 = 3;
                    int i18 = 0;
                    while (i18 < length4) {
                        Variable variable2 = variableArr4[i18];
                        String str25 = str3;
                        if (variable2.hasModifier(str25)) {
                            c2014M2234.m4040(Opcodes.NEW, str24);
                            c2014M2234.m4033(89);
                            c2014M2234.m4037(variable2.getName());
                            if (8 >= i17) {
                                i5 = i17 + 1;
                                c2014M2234.m4033(i17);
                            } else {
                                i5 = i17 + 1;
                                c2014M2234.m4034(16, i17 - 3);
                            }
                            c2014M2234.m4039(Opcodes.INVOKESPECIAL, str24, "<init>", "(Ljava/lang/String;I)V");
                            c = 179;
                            c2014M2234.m4030(Opcodes.PUTSTATIC, str24, variable2.getName(), str22);
                            i17 = i5;
                        } else {
                            c = 179;
                        }
                        i18++;
                        variableArr4 = variableArr4;
                        str3 = str25;
                    }
                }
                c2014M2234.m4037(C3506.m5038(0, str22.length(), str22));
                c2014M2234.m4039(Opcodes.INVOKESTATIC, "bsh/This", "initStatic", "(Ljava/lang/Class;)V");
                c2014M2234.m4033(Opcodes.RETURN);
                c2014M2234.m4038();
                boolean z2 = false;
                int i19 = 0;
                while (i19 < c0007Arr.length) {
                    String str26 = str4;
                    if (c0007Arr[i19].hasModifier(str26)) {
                        c0006 = c0009;
                    } else {
                        int iM3211 = C0006.m329(c0007Arr[i19].getModifiers());
                        if (c0007Arr[i19].isVarArgs()) {
                            iM3211 |= 128;
                        }
                        c0006 = c0009;
                        c0006.m332(i19, c0007Arr[i19].f493, iM3211, c0707);
                        z2 = true;
                    }
                    i19++;
                    str4 = str26;
                    c0009 = c0006;
                }
                C0006 c00010 = c0009;
                String str27 = str4;
                if (enumC06913 == EnumC0698.f2672 && !z2) {
                    c00010.m332(-1, new String[0], 1, c0707);
                }
                C0007[] c0007Arr4 = c00010.f490;
                int length5 = c0007Arr4.length;
                int i20 = 0;
                while (i20 < length5) {
                    C0007 c00011 = c0007Arr4[i20];
                    boolean z3 = c00011.isExtension;
                    String str28 = c00011.f491;
                    String[] strArr4 = c00011.f493;
                    if (z3 || c00011.hasModifier(str27)) {
                        c0007Arr4 = c0007Arr4;
                        i3 = length5;
                        str8 = str23;
                        str5 = str27;
                        i4 = i20;
                        enumC0699 = enumC06912;
                    } else {
                        enumC0699 = enumC06912;
                        if (enumC06913 == enumC0699 && !c00011.hasModifier("static") && !c00011.hasModifier("default") && !c00011.hasModifier("abstract")) {
                            c00011.getModifiers().addModifier("abstract");
                        }
                        int iM3212 = C0006.m329(c00011.getModifiers());
                        if (c00011.isVarArgs()) {
                            iM3212 |= 128;
                        }
                        int i21 = iM3212 & 8;
                        boolean z4 = i21 > 0;
                        i3 = length5;
                        String name2 = c00011.getName();
                        boolean z5 = i21 != 0;
                        str5 = str27;
                        String str29 = str28 == null ? "Ljava/lang/Object;" : str28;
                        C2014 c2014M2235 = c0707.m2231(iM3212, name2, C0006.m330(str29, strArr4));
                        i4 = i20;
                        if ((iM3212 & 1024) != 0) {
                            enumC0699 = enumC0699;
                        } else {
                            if (z5 || enumC06913 == enumC0699) {
                                C0006.m331(str24, str15, c2014M2235);
                            } else {
                                c2014M2235.m4041(25, 0);
                                c2014M2235.m4030(Opcodes.GETFIELD, str24, This.Keys.BSHTHIS + str15, "Lbsh/This;");
                            }
                            c2014M2235.m4037(name2);
                            C0006.m327(strArr4, z5, c2014M2235);
                            c2014M2235.m4033(4);
                            c2014M2235.m4039(Opcodes.INVOKEVIRTUAL, str23, "invokeMethod", "(Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/Object;");
                            if (str29.equals("V")) {
                                c2014M2235.m4033(87);
                                c2014M2235.m4033(Opcodes.RETURN);
                            } else if (str29.length() == 1) {
                                boolean zEquals = str29.equals("Z");
                                int i22 = Opcodes.IRETURN;
                                if (zEquals) {
                                    str6 = "java/lang/Boolean";
                                    str7 = "booleanValue";
                                } else if (str29.equals("C")) {
                                    str6 = "java/lang/Character";
                                    str7 = "charValue";
                                } else if (str29.equals("B")) {
                                    str6 = "java/lang/Byte";
                                    str7 = "byteValue";
                                } else if (str29.equals("S")) {
                                    str6 = "java/lang/Short";
                                    str7 = "shortValue";
                                } else if (str29.equals("F")) {
                                    i22 = Opcodes.FRETURN;
                                    str6 = "java/lang/Float";
                                    str7 = "floatValue";
                                } else if (str29.equals("J")) {
                                    i22 = Opcodes.LRETURN;
                                    str6 = "java/lang/Long";
                                    str7 = "longValue";
                                } else if (str29.equals("D")) {
                                    i22 = Opcodes.DRETURN;
                                    str6 = "java/lang/Double";
                                    str7 = "doubleValue";
                                } else {
                                    str6 = "java/lang/Integer";
                                    str7 = "intValue";
                                }
                                String str30 = str7;
                                c2014M2235.m4040(Opcodes.CHECKCAST, str6);
                                c2014M2235.m4039(Opcodes.INVOKEVIRTUAL, str6, str30, "()".concat(str29));
                                c2014M2235.m4033(i22);
                            } else {
                                c2014M2235.m4040(Opcodes.CHECKCAST, C0006.m324(str29));
                                c2014M2235.m4033(Opcodes.ARETURN);
                            }
                            c2014M2235.m4038();
                        }
                        String name3 = c00011.getName();
                        Class cls2 = c00010.f485;
                        Class superclass = cls2;
                        while (true) {
                            if (superclass == null) {
                                str8 = str23;
                                method = null;
                                break;
                            }
                            Method[] declaredMethods = superclass.getDeclaredMethods();
                            int length6 = declaredMethods.length;
                            int i23 = 0;
                            while (i23 < length6) {
                                method = declaredMethods[i23];
                                int i24 = i23;
                                if (method.getName().equals(name3)) {
                                    str8 = str23;
                                    if (strArr4.length == method.getParameterCount()) {
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        int length7 = parameterTypes.length;
                                        String[] strArr5 = new String[length7];
                                        for (int i25 = 0; i25 < length7; i25++) {
                                            strArr5[i25] = BSHType.getTypeDescriptor(parameterTypes[i25]);
                                        }
                                        int i26 = 0;
                                        boolean zEquals2 = true;
                                        while (i26 < strArr4.length) {
                                            int i27 = i26;
                                            zEquals2 = strArr4[i26].equals(strArr5[i27]);
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
                                    str8 = str23;
                                }
                                i23 = i24 + 1;
                                str23 = str8;
                            }
                            superclass = superclass.getSuperclass();
                        }
                        if (method != null && !z4) {
                            String name4 = c00011.getName();
                            if (str28 == null) {
                                str28 = "Ljava/lang/Object;";
                            }
                            String strM330 = C0006.m330(str28, strArr4);
                            int i28 = 1;
                            C2014 c2014M2236 = c0707.m2231(1, "_bshSuper" + cls2.getSimpleName() + name4, strM330);
                            int i29 = 0;
                            c2014M2236.m4041(25, 0);
                            int length8 = strArr4.length;
                            int i30 = 1;
                            while (i29 < length8) {
                                int i31 = length8;
                                String str31 = strArr4[i29];
                                C0706 c0708 = c0707;
                                if ((str31.length() == i28 ? i28 : 0) != 0) {
                                    c2014M2236.m4041(21, i30);
                                } else {
                                    c2014M2236.m4041(25, i30);
                                }
                                i30 += (str31.equals("D") || str31.equals("J")) ? 2 : 1;
                                i29++;
                                length8 = i31;
                                c0707 = c0708;
                                i28 = 1;
                            }
                            c0707 = c0707;
                            c2014M2236.m4039(Opcodes.INVOKESPECIAL, c00010.f486, name4, strM330);
                            C0006.m328(str28, c2014M2236);
                            c2014M2236.m4038();
                        }
                        i20 = i4 + 1;
                        enumC06913 = enumC0698;
                        c0007Arr4 = c0007Arr4;
                        length5 = i3;
                        c0707 = c0707;
                        str27 = str5;
                        enumC06912 = enumC0699;
                        str23 = str8;
                    }
                    i20 = i4 + 1;
                    enumC06913 = enumC0698;
                    c0007Arr4 = c0007Arr4;
                    length5 = i3;
                    c0707 = c0707;
                    str27 = str5;
                    enumC06912 = enumC0699;
                    str23 = str8;
                }
                byte[] bArrM2229 = c0707.m2229();
                if ((System.getProperty("bsh.debugClasses") == null || System.getProperty("bsh.debugClasses").isEmpty()) ? false : true) {
                    ThreadLocal threadLocal2 = RunnableC0008.f500;
                    String property = System.getProperty("bsh.debugClasses");
                    if (property != null) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(property + "/" + str15 + ".class");
                            try {
                                fileOutputStream.write(bArrM2229);
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
                str20 = str20;
                clsMo305 = c04511.mo305(str20, bArrM2229);
                RunnableC0008.m333("Define ", str20, " as ", clsMo305);
            } else {
                c0018 = c0018;
            }
            c0017.mo314(str20.replace('$', '.'));
            C0012 c00110 = c0018;
            c00110.f538 = clsMo305;
            c00110.m379(clsMo305);
            RunnableC0008.m333(c00110);
            return clsMo305;
        } catch (C3581 e2) {
            throw new C1684("Unable to init class static block: " + e2, e2);
        }
    }
}
