package bsh;

import bsh.This;
import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000.AbstractC1687;
import p000.AbstractC2844;
import p000.C0457;
import p000.C0458;
import p000.C0493;
import p000.C0706;
import p000.C1317;
import p000.C1774;
import p000.C1893;
import p000.C2014;
import p000.C3506;
import p000.EnumC0698;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0006 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f481;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f482;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f483;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f484;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Class f485;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f486;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Class[] f487;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Variable[] f488;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0007[] f489;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0007[] f490;

    public C0006(Modifiers modifiers, String str, String str2, Class cls, Class[] clsArr, Variable[] variableArr, C0007[] c0007Arr, C0012 c0012, EnumC0698 enumC0698) {
        this.f481 = str;
        if (str2 != null) {
            this.f483 = str2.replace('.', '/') + "/" + str;
        } else {
            this.f483 = str;
        }
        this.f482 = "L" + this.f483.replace('.', '/') + ";";
        EnumC0698 enumC0699 = EnumC0698.f2674;
        Class cls2 = cls == null ? enumC0698 == enumC0699 ? Enum.class : Object.class : cls;
        this.f485 = cls2;
        this.f486 = cls2.getName().replace('.', '/');
        this.f487 = clsArr == null ? AbstractC0016.f569 : clsArr;
        this.f488 = variableArr;
        EnumC0698 enumC06910 = EnumC0698.f2673;
        c0012.f536 = enumC0698 == enumC06910;
        c0012.f537 = enumC0698 == enumC0699;
        Map<String, C0012> map = This.contextStore;
        String string = UUID.randomUUID().toString();
        this.f484 = string;
        map.put(string, c0012);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM561 = AbstractC0017.m561(str);
        for (C0007 c0007 : c0007Arr) {
            if (c0007.getName().equals(strM561)) {
                if (!c0007.modifiers.isAppliedContext(5)) {
                    c0007.modifiers.changeContext(5);
                }
                arrayList.add(c0007);
            } else {
                arrayList2.add(c0007);
            }
        }
        this.f489 = (C0007[]) arrayList.toArray(new C0007[arrayList.size()]);
        this.f490 = (C0007[]) arrayList2.toArray(new C0007[arrayList2.size()]);
        RunnableC0008.m333("Generate class ", enumC0698, " ", this.f483, " cons:", Integer.valueOf(arrayList.size()), " meths:", Integer.valueOf(arrayList2.size()), " vars:", Integer.valueOf(variableArr.length));
        if (enumC0698 == enumC06910 && !modifiers.hasModifier("abstract")) {
            modifiers.addModifier("abstract");
        }
        if (enumC0698 != enumC0699 || modifiers.hasModifier("static")) {
            return;
        }
        modifiers.addModifier("static");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m324(String str) {
        return (str.startsWith("[") || !str.startsWith("L")) ? str : AbstractC2844.m4778(1, 1, str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m325(int i, String str, String[] strArr, C1774 c1774, C1774[] c1774Arr, int i2, C2014 c2014) {
        String str2;
        c2014.m4036(c1774Arr[i]);
        c2014.m4041(25, 0);
        for (String str3 : strArr) {
            if (str3.equals("Z")) {
                str2 = "getBoolean";
            } else if (str3.equals("B")) {
                str2 = "getByte";
            } else if (str3.equals("C")) {
                str2 = "getChar";
            } else if (str3.equals("S")) {
                str2 = "getShort";
            } else if (str3.equals("I")) {
                str2 = "getInt";
            } else if (str3.equals("J")) {
                str2 = "getLong";
            } else if (str3.equals("D")) {
                str2 = "getDouble";
            } else {
                str2 = str3.equals("F") ? "getFloat" : "getObject";
            }
            c2014.m4041(25, i2);
            c2014.m4039(Opcodes.INVOKEVIRTUAL, "bsh/This$ConstructorArgs", str2, "()".concat(str2.equals("getObject") ? "Ljava/lang/Object;" : str3));
            if (str2.equals("getObject")) {
                c2014.m4040(Opcodes.CHECKCAST, m324(str3));
            }
        }
        c2014.m4039(Opcodes.INVOKESPECIAL, str, "<init>", m330("V", strArr));
        c2014.m4035(Opcodes.GOTO, c1774);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m326(String str, String str2, int i, String str3, C0706 c0706) {
        C1317 c1317 = new C1317(c0706.f2694, i, str, str2, str3);
        if (c0706.f2700 == null) {
            c0706.f2700 = c1317;
        } else {
            c0706.f2701.f4760 = c1317;
        }
        c0706.f2701 = c1317;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m327(String[] strArr, boolean z, C2014 c2014) {
        int i;
        c2014.m4034(17, strArr.length);
        c2014.m4040(Opcodes.ANEWARRAY, ASMUtils.TYPE_OBJECT);
        int i2 = !z ? 1 : 0;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str = strArr[i3];
            c2014.m4033(89);
            c2014.m4034(17, i3);
            if (str.length() == 1) {
                if (str.equals("F")) {
                    i = 23;
                } else if (str.equals("D")) {
                    i = 24;
                } else {
                    i = str.equals("J") ? 22 : 21;
                }
                c2014.m4040(Opcodes.NEW, "bsh/Primitive");
                c2014.m4033(89);
                c2014.m4041(i, i2);
                c2014.m4039(Opcodes.INVOKESPECIAL, "bsh/Primitive", "<init>", AbstractC2844.m4786(new StringBuilder("("), str, ")V"));
                c2014.m4033(83);
            } else {
                c2014.m4041(25, i2);
                C1774 c1774 = new C1774();
                c2014.m4035(Opcodes.IFNONNULL, c1774);
                c2014.m4030(Opcodes.GETSTATIC, "bsh/Primitive", "NULL", "Lbsh/Primitive;");
                c2014.m4033(83);
                C1774 c1775 = new C1774();
                c2014.m4035(Opcodes.GOTO, c1775);
                c2014.m4036(c1774);
                c2014.m4041(25, i2);
                c2014.m4033(83);
                c2014.m4036(c1775);
            }
            i2 += (str.equals("D") || str.equals("J")) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m328(String str, C2014 c2014) {
        int i;
        if (str.equals("V")) {
            c2014.m4033(Opcodes.RETURN);
            return;
        }
        if (str.length() != 1) {
            c2014.m4040(Opcodes.CHECKCAST, m324(str));
            c2014.m4033(Opcodes.ARETURN);
            return;
        }
        if (str.equals("D")) {
            i = Opcodes.DRETURN;
        } else if (str.equals("F")) {
            i = Opcodes.FRETURN;
        } else {
            i = str.equals("J") ? Opcodes.LRETURN : Opcodes.IRETURN;
        }
        c2014.m4033(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static int m329(Modifiers modifiers) {
        boolean zHasModifier = modifiers.hasModifier(1);
        ?? r1 = zHasModifier;
        if (modifiers.hasModifier(2)) {
            r1 = (zHasModifier ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (modifiers.hasModifier(4)) {
            r2 = (r1 == true ? 1 : 0) | 4;
        }
        ?? r3 = r2;
        if (modifiers.hasModifier(8)) {
            r3 = (r2 == true ? 1 : 0) | 8;
        }
        ?? r4 = r3;
        if (modifiers.hasModifier(32)) {
            r4 = (r3 == true ? 1 : 0) | 32;
        }
        ?? r5 = r4;
        if (modifiers.hasModifier(1024)) {
            r5 = (r4 == true ? 1 : 0) | 1024;
        }
        if ((modifiers.getModifiers() & 7) != 0) {
            return r5;
        }
        int i = r5 | 1;
        modifiers.addModifier(1);
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static String m330(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder("(");
        for (String str2 : strArr) {
            sb.append(str2);
        }
        sb.append(')');
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static void m331(String str, String str2, C2014 c2014) {
        c2014.m4030(Opcodes.GETSTATIC, str, This.Keys.BSHSTATIC + str2, "Lbsh/This;");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m332(int i, String[] strArr, int i2, C0706 c0706) {
        int length = strArr.length + 1;
        int length2 = strArr.length + 2;
        C2014 c2014M2231 = c0706.m2231(i2, "<init>", m330("V", strArr));
        m327(strArr, false, c2014M2231);
        c2014M2231.m4041(58, length);
        C1774 c1774 = new C1774();
        C1774 c1775 = new C1774();
        C1893 c1893 = C0458.f2065;
        Class cls = this.f485;
        List listM1827 = ((C0457) c1893.m3819(cls)).m1827(cls.getName());
        int size = listM1827.size();
        C0007[] c0007Arr = this.f489;
        int length3 = size + c0007Arr.length;
        C1774[] c1774Arr = new C1774[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            c1774Arr[i3] = new C1774();
        }
        String typeDescriptor = BSHType.getTypeDescriptor(cls);
        c2014M2231.m4037(C3506.m5038(0, typeDescriptor.length(), typeDescriptor));
        String str = this.f483;
        String str2 = this.f481;
        m331(str, str2, c2014M2231);
        c2014M2231.m4041(25, length);
        c2014M2231.m4034(16, i);
        c2014M2231.m4039(Opcodes.INVOKESTATIC, "bsh/This", "getConstructorArgs", "(Ljava/lang/Class;Lbsh/This;[Ljava/lang/Object;I)Lbsh/This$ConstructorArgs;");
        c2014M2231.m4041(58, length2);
        c2014M2231.m4041(25, length2);
        c2014M2231.m4030(Opcodes.GETFIELD, "bsh/This$ConstructorArgs", "selector", "I");
        C0493 c0493 = c2014M2231.f6681;
        c2014M2231.f6698 = c0493.f2147;
        c0493.m1915(Opcodes.TABLESWITCH);
        c0493.m1916((4 - (c0493.f2147 % 4)) % 4, null);
        boolean z = true;
        c1774.m3656(c0493, c2014M2231.f6698, true);
        c0493.m1917(0);
        c0493.m1917(length3 - 1);
        int i4 = 0;
        while (i4 < length3) {
            c1774Arr[i4].m3656(c0493, c2014M2231.f6698, z);
            i4++;
            z = true;
        }
        C1774 c1776 = c2014M2231.f6691;
        if (c1776 != null) {
            int i5 = c2014M2231.f6688;
            if (i5 == 4) {
                int i6 = 0;
                c1776.f5920.m3232(Opcodes.LOOKUPSWITCH, 0, null, null);
                c2014M2231.m4027(0, c1774);
                C1774 c1774M3654 = c1774.m3654();
                c1774M3654.f5913 = (short) (c1774M3654.f5913 | 2);
                int i7 = 0;
                while (i7 < length3) {
                    C1774 c1777 = c1774Arr[i7];
                    c2014M2231.m4027(i6, c1777);
                    C1774 c1774M3655 = c1777.m3654();
                    c1774M3655.f5913 = (short) (c1774M3655.f5913 | 2);
                    i7++;
                    i6 = 0;
                }
            } else if (i5 == 1) {
                int i8 = c2014M2231.f6692 - 1;
                c2014M2231.f6692 = i8;
                c2014M2231.m4027(i8, c1774);
                for (int i9 = 0; i9 < length3; i9++) {
                    c2014M2231.m4027(c2014M2231.f6692, c1774Arr[i9]);
                }
            }
            c2014M2231.m4028();
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < listM1827.size()) {
            m325(i11, this.f486, ((AbstractC1687) listM1827.get(i10)).m3566(), c1775, c1774Arr, length2, c2014M2231);
            i10++;
            i11++;
            str2 = str2;
        }
        String str3 = str2;
        int i12 = 0;
        while (i12 < c0007Arr.length) {
            m325(i11, this.f483, c0007Arr[i12].f493, c1775, c1774Arr, length2, c2014M2231);
            i12++;
            i11++;
        }
        c2014M2231.m4036(c1774);
        c2014M2231.m4041(25, 0);
        c2014M2231.m4039(Opcodes.INVOKESPECIAL, this.f486, "<init>", "()V");
        c2014M2231.m4036(c1775);
        c2014M2231.m4041(25, 0);
        c2014M2231.m4037(str3);
        c2014M2231.m4041(25, length);
        c2014M2231.m4039(Opcodes.INVOKESTATIC, "bsh/This", "initInstance", "(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V");
        c2014M2231.m4033(Opcodes.RETURN);
        c2014M2231.m4038();
    }
}
