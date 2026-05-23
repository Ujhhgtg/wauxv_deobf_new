package bsh;

import bsh.This;
import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000.AbstractC1672;
import p000.AbstractC2784;
import p000.C0356;
import p000.C0481;
import p000.C0482;
import p000.C0516;
import p000.C0711;
import p000.C1007;
import p000.C1752;
import p000.C1867;
import p000.C1983;
import p000.C2000;
import p000.C3449;
import p000.C3532;
import p000.EnumC0703;
import p000.RunnableC1668;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0005 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f473;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f474;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f475;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f476;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Class f477;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f478;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Class[] f479;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C3532[] f480;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C1007[] f481;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C1007[] f482;

    public C0005(C2000 c2000, String str, String str2, Class cls, Class[] clsArr, C3532[] c3532Arr, C1007[] c1007Arr, C0007 c0007, EnumC0703 enumC0703) {
        this.f473 = str;
        if (str2 != null) {
            this.f475 = str2.replace('.', '/') + "/" + str;
        } else {
            this.f475 = str;
        }
        this.f474 = "L" + this.f475.replace('.', '/') + ";";
        EnumC0703 enumC0704 = EnumC0703.f2680;
        Class cls2 = cls == null ? enumC0703 == enumC0704 ? Enum.class : Object.class : cls;
        this.f477 = cls2;
        this.f478 = C3449.m4978(cls2);
        this.f479 = clsArr == null ? AbstractC0009.f517 : clsArr;
        this.f480 = c3532Arr;
        EnumC0703 enumC0705 = EnumC0703.f2679;
        c0007.f509 = enumC0703 == enumC0705;
        c0007.f510 = enumC0703 == enumC0704;
        Map<String, C0007> map = This.contextStore;
        String string = UUID.randomUUID().toString();
        this.f476 = string;
        map.put(string, c0007);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM417 = AbstractC0010.m417(str);
        int length = c1007Arr.length;
        int i = 0;
        while (i < length) {
            C1007 c1007 = c1007Arr[i];
            if (c1007.m1748().equals(strM417)) {
                C2000 c2001 = c1007.f2148;
                if (c2001.f6668 != 5) {
                    int i2 = c2001.f6669;
                    c2001.f6669 = 0;
                    c2001.m3861(5);
                    for (int i3 = 1; i3 <= i2; i3 *= 2) {
                        if ((i2 & i3) != 0) {
                            c2001.m3859(i3);
                        }
                    }
                }
                arrayList.add(c1007);
            } else {
                strM417 = strM417;
                arrayList2.add(c1007);
            }
            i++;
            strM417 = strM417;
        }
        this.f481 = (C1007[]) arrayList.toArray(new C1007[arrayList.size()]);
        this.f482 = (C1007[]) arrayList2.toArray(new C1007[arrayList2.size()]);
        RunnableC1668.m3389("Generate class ", enumC0703, " ", this.f475, " cons:", Integer.valueOf(arrayList.size()), " meths:", Integer.valueOf(arrayList2.size()), " vars:", Integer.valueOf(c3532Arr.length));
        if (enumC0703 == enumC0705 && !c2000.m3864("abstract")) {
            c2000.m3860("abstract");
        }
        if (enumC0703 != enumC0704 || c2000.m3864("static")) {
            return;
        }
        c2000.m3860("static");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m318(String str) {
        return (str.startsWith("[") || !str.startsWith("L")) ? str : AbstractC2784.m4744(1, 1, str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m319(int i, String str, String[] strArr, C1752 c1752, C1752[] c1752Arr, int i2, C1983 c1983) {
        String str2;
        c1983.m3842(c1752Arr[i]);
        c1983.m3847(25, 0);
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
            c1983.m3847(25, i2);
            c1983.m3845(Opcodes.INVOKEVIRTUAL, "bsh/This$ConstructorArgs", str2, "()".concat(str2.equals("getObject") ? "Ljava/lang/Object;" : str3));
            if (str2.equals("getObject")) {
                c1983.m3846(Opcodes.CHECKCAST, m318(str3));
            }
        }
        c1983.m3845(Opcodes.INVOKESPECIAL, str, "<init>", m323("V", strArr));
        c1983.m3841(Opcodes.GOTO, c1752);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static void m320(String[] strArr, boolean z, C1983 c1983) {
        int i;
        c1983.m3840(17, strArr.length);
        c1983.m3846(Opcodes.ANEWARRAY, ASMUtils.TYPE_OBJECT);
        int i2 = !z ? 1 : 0;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str = strArr[i3];
            c1983.m3839(89);
            c1983.m3840(17, i3);
            if (str.length() == 1) {
                if (str.equals("F")) {
                    i = 23;
                } else if (str.equals("D")) {
                    i = 24;
                } else {
                    i = str.equals("J") ? 22 : 21;
                }
                c1983.m3846(Opcodes.NEW, "bsh/Primitive");
                c1983.m3839(89);
                c1983.m3847(i, i2);
                c1983.m3845(Opcodes.INVOKESPECIAL, "bsh/Primitive", "<init>", AbstractC2784.m4752(new StringBuilder("("), str, ")V"));
                c1983.m3839(83);
            } else {
                c1983.m3847(25, i2);
                C1752 c1752 = new C1752();
                c1983.m3841(Opcodes.IFNONNULL, c1752);
                c1983.m3836(Opcodes.GETSTATIC, "bsh/Primitive", "NULL", "Lbsh/Primitive;");
                c1983.m3839(83);
                C1752 c1753 = new C1752();
                c1983.m3841(Opcodes.GOTO, c1753);
                c1983.m3842(c1752);
                c1983.m3847(25, i2);
                c1983.m3839(83);
                c1983.m3842(c1753);
            }
            i2 += (str.equals("D") || str.equals("J")) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static void m321(String str, C1983 c1983) {
        int i;
        if (str.equals("V")) {
            c1983.m3839(Opcodes.RETURN);
            return;
        }
        if (str.length() != 1) {
            c1983.m3846(Opcodes.CHECKCAST, m318(str));
            c1983.m3839(Opcodes.ARETURN);
            return;
        }
        if (str.equals("D")) {
            i = Opcodes.DRETURN;
        } else if (str.equals("F")) {
            i = Opcodes.FRETURN;
        } else {
            i = str.equals("J") ? Opcodes.LRETURN : Opcodes.IRETURN;
        }
        c1983.m3839(i);
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static int m322(C2000 c2000) {
        boolean zM3863 = c2000.m3863(1);
        ?? r1 = zM3863;
        if (c2000.m3863(2)) {
            r1 = (zM3863 ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (c2000.m3863(4)) {
            r2 = (r1 == true ? 1 : 0) | 4;
        }
        ?? r3 = r2;
        if (c2000.m3863(8)) {
            r3 = (r2 == true ? 1 : 0) | 8;
        }
        ?? r4 = r3;
        if (c2000.m3863(32)) {
            r4 = (r3 == true ? 1 : 0) | 32;
        }
        ?? r5 = r4;
        if (c2000.m3863(1024)) {
            r5 = (r4 == true ? 1 : 0) | 1024;
        }
        if ((c2000.f6669 & 7) != 0) {
            return r5;
        }
        int i = r5 | 1;
        c2000.m3859(1);
        return i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static String m323(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder("(");
        for (String str2 : strArr) {
            sb.append(str2);
        }
        sb.append(')');
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static String m324(String[] strArr) {
        StringBuilder sb = new StringBuilder("<");
        for (String str : strArr) {
            sb.append(str);
            sb.append(":");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static void m325(String str, String str2, C1983 c1983) {
        c1983.m3836(Opcodes.GETSTATIC, str, This.Keys.BSHSTATIC + str2, "Lbsh/This;");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m326(int i, String[] strArr, int i2, C0711 c0711) {
        int length = strArr.length + 1;
        int length2 = strArr.length + 2;
        C1983 c1983M2139 = c0711.m2139(i2, "<init>", m323("V", strArr), m324(strArr), null);
        m320(strArr, false, c1983M2139);
        c1983M2139.m3847(58, length);
        C1752 c1752 = new C1752();
        C1752 c1753 = new C1752();
        C1867 c1867 = C0482.f2092;
        Class cls = this.f477;
        List listM1719 = ((C0481) c1867.m3641(cls)).m1719(cls.getName());
        int size = listM1719.size();
        C1007[] c1007Arr = this.f481;
        int length3 = size + c1007Arr.length;
        C1752[] c1752Arr = new C1752[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            c1752Arr[i3] = new C1752();
        }
        String strM1466 = C0356.m1466(cls);
        c1983M2139.m3843(C3449.m4979(0, strM1466.length(), strM1466));
        String str = this.f475;
        String str2 = this.f473;
        m325(str, str2, c1983M2139);
        c1983M2139.m3847(25, length);
        c1983M2139.m3840(16, i);
        String str3 = "bsh/This";
        c1983M2139.m3845(Opcodes.INVOKESTATIC, "bsh/This", "getConstructorArgs", "(Ljava/lang/Class;Lbsh/This;[Ljava/lang/Object;I)Lbsh/This$ConstructorArgs;");
        c1983M2139.m3847(58, length2);
        c1983M2139.m3847(25, length2);
        c1983M2139.m3836(Opcodes.GETFIELD, "bsh/This$ConstructorArgs", "selector", "I");
        C0516 c0516 = c1983M2139.f6576;
        c1983M2139.f6593 = c0516.f2191;
        c0516.m1821(Opcodes.TABLESWITCH);
        c0516.m1822((4 - (c0516.f2191 % 4)) % 4, null);
        boolean z = true;
        c1752.m3504(c0516, c1983M2139.f6593, true);
        c0516.m1823(0);
        c0516.m1823(length3 - 1);
        int i4 = 0;
        while (i4 < length3) {
            c1752Arr[i4].m3504(c0516, c1983M2139.f6593, z);
            i4++;
            z = true;
        }
        C1752 c1754 = c1983M2139.f6586;
        if (c1754 != null) {
            int i5 = c1983M2139.f6583;
            if (i5 == 4) {
                int i6 = 0;
                c1754.f5867.m3124(Opcodes.LOOKUPSWITCH, 0, null, null);
                c1983M2139.m3833(0, c1752);
                C1752 c1752M3502 = c1752.m3502();
                c1752M3502.f5860 = (short) (c1752M3502.f5860 | 2);
                int i7 = 0;
                while (i7 < length3) {
                    C1752 c1755 = c1752Arr[i7];
                    c1983M2139.m3833(i6, c1755);
                    C1752 c1752M3503 = c1755.m3502();
                    c1752M3503.f5860 = (short) (c1752M3503.f5860 | 2);
                    i7++;
                    i6 = 0;
                }
            } else if (i5 == 1) {
                int i8 = c1983M2139.f6587 - 1;
                c1983M2139.f6587 = i8;
                c1983M2139.m3833(i8, c1752);
                for (int i9 = 0; i9 < length3; i9++) {
                    c1983M2139.m3833(c1983M2139.f6587, c1752Arr[i9]);
                }
            }
            c1983M2139.m3834();
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < listM1719.size()) {
            m319(i11, this.f478, ((AbstractC1672) listM1719.get(i10)).m3399(), c1753, c1752Arr, length2, c1983M2139);
            i10++;
            i11++;
            str3 = str3;
        }
        String str4 = str3;
        int i12 = 0;
        while (i12 < c1007Arr.length) {
            m319(i11, this.f475, c1007Arr[i12].f3670, c1753, c1752Arr, length2, c1983M2139);
            i12++;
            i11++;
        }
        c1983M2139.m3842(c1752);
        c1983M2139.m3847(25, 0);
        c1983M2139.m3845(Opcodes.INVOKESPECIAL, this.f478, "<init>", "()V");
        c1983M2139.m3842(c1753);
        c1983M2139.m3847(25, 0);
        c1983M2139.m3843(str2);
        c1983M2139.m3847(25, length);
        c1983M2139.m3845(Opcodes.INVOKESTATIC, str4, "initInstance", "(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V");
        c1983M2139.m3839(Opcodes.RETURN);
        c1983M2139.m3844();
    }
}
