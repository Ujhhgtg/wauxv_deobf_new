package bsh;

import bsh.This;
import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000.AbstractC0695Ujhhgtgfeyxiexzf;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.C0154Ujhhgtgfeyxiexzf;
import p000.C0271Ujhhgtgfeyxiexzf;
import p000.C0299Ujhhgtgfeyxiexzf;
import p000.C1792Ujhhgtgfeyxiexzf;
import p000.C1853Ujhhgtgfeyxiexzf;
import p000.C2570Ujhhgtgfeyxiexzf;
import p000.C2610Ujhhgtgfeyxiexzf;
import p000.C2809Ujhhgtgfeyxiexzf;
import p000.C2843feyxiexzfUjhhgtg;
import p000.C3434feyxiexzfUjhhgtg;
import p000.EnumC2814Ujhhgtgfeyxiexzf;
import p000.InterfaceC3567Ujhhgtgfeyxiexzf;

/* JADX INFO: renamed from: bsh.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0024Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f492Ujhhgtgfeyxiexzf = C1792Ujhhgtgfeyxiexzf.m3171Ujhhgtgfeyxiexzf(InterfaceC3567Ujhhgtgfeyxiexzf.class);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f493Ujhhgtgfeyxiexzf = Primitive.class.getName().replace('.', '/');

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final String f494Ujhhgtgfeyxiexzf = C1792Ujhhgtgfeyxiexzf.m3171Ujhhgtgfeyxiexzf(Primitive.class);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f495Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f496Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f497Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f498Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Class f499Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final String f500Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Class[] f501Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C1853Ujhhgtgfeyxiexzf[] f502Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C0025Ujhhgtgfeyxiexzf[] f503Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C0025Ujhhgtgfeyxiexzf[] f504Ujhhgtgfeyxiexzf;

    public C0024Ujhhgtgfeyxiexzf(Modifiers modifiers, String str, String str2, Class cls, Class[] clsArr, C1853Ujhhgtgfeyxiexzf[] c1853UjhhgtgfeyxiexzfArr, C0025Ujhhgtgfeyxiexzf[] c0025UjhhgtgfeyxiexzfArr, C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, EnumC2814Ujhhgtgfeyxiexzf enumC2814Ujhhgtgfeyxiexzf) {
        this.f495Ujhhgtgfeyxiexzf = str;
        if (str2 != null) {
            this.f497Ujhhgtgfeyxiexzf = str2.replace('.', '/') + "/" + str;
        } else {
            this.f497Ujhhgtgfeyxiexzf = str;
        }
        this.f496Ujhhgtgfeyxiexzf = "L" + this.f497Ujhhgtgfeyxiexzf.replace('.', '/') + ";";
        EnumC2814Ujhhgtgfeyxiexzf enumC2814Ujhhgtgfeyxiexzf2 = EnumC2814Ujhhgtgfeyxiexzf.f8962Ujhhgtgfeyxiexzf;
        Class cls2 = cls == null ? enumC2814Ujhhgtgfeyxiexzf == enumC2814Ujhhgtgfeyxiexzf2 ? Enum.class : Object.class : cls;
        this.f499Ujhhgtgfeyxiexzf = cls2;
        this.f500Ujhhgtgfeyxiexzf = cls2.getName().replace('.', '/');
        this.f501Ujhhgtgfeyxiexzf = clsArr == null ? AbstractC0033Ujhhgtgfeyxiexzf.f583Ujhhgtgfeyxiexzf : clsArr;
        this.f502Ujhhgtgfeyxiexzf = c1853UjhhgtgfeyxiexzfArr;
        EnumC2814Ujhhgtgfeyxiexzf enumC2814Ujhhgtgfeyxiexzf3 = EnumC2814Ujhhgtgfeyxiexzf.f8961Ujhhgtgfeyxiexzf;
        c0029Ujhhgtgfeyxiexzf.f550Ujhhgtgfeyxiexzf = enumC2814Ujhhgtgfeyxiexzf == enumC2814Ujhhgtgfeyxiexzf3;
        c0029Ujhhgtgfeyxiexzf.f551Ujhhgtgfeyxiexzf = enumC2814Ujhhgtgfeyxiexzf == enumC2814Ujhhgtgfeyxiexzf2;
        Map<String, C0029Ujhhgtgfeyxiexzf> map = This.contextStore;
        String string = UUID.randomUUID().toString();
        this.f498Ujhhgtgfeyxiexzf = string;
        map.put(string, c0029Ujhhgtgfeyxiexzf);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM560Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m560Ujhhgtgfeyxiexzf(str);
        for (C0025Ujhhgtgfeyxiexzf c0025Ujhhgtgfeyxiexzf : c0025UjhhgtgfeyxiexzfArr) {
            if (c0025Ujhhgtgfeyxiexzf.m310Ujhhgtgfeyxiexzf().equals(strM560Ujhhgtgfeyxiexzf)) {
                if (!c0025Ujhhgtgfeyxiexzf.f468Ujhhgtgfeyxiexzf.isAppliedContext(5)) {
                    c0025Ujhhgtgfeyxiexzf.f468Ujhhgtgfeyxiexzf.changeContext(5);
                }
                arrayList.add(c0025Ujhhgtgfeyxiexzf);
            } else {
                arrayList2.add(c0025Ujhhgtgfeyxiexzf);
            }
        }
        this.f503Ujhhgtgfeyxiexzf = (C0025Ujhhgtgfeyxiexzf[]) arrayList.toArray(new C0025Ujhhgtgfeyxiexzf[arrayList.size()]);
        this.f504Ujhhgtgfeyxiexzf = (C0025Ujhhgtgfeyxiexzf[]) arrayList2.toArray(new C0025Ujhhgtgfeyxiexzf[arrayList2.size()]);
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Generate class ", enumC2814Ujhhgtgfeyxiexzf, " ", this.f497Ujhhgtgfeyxiexzf, " cons:", Integer.valueOf(arrayList.size()), " meths:", Integer.valueOf(arrayList2.size()), " vars:", Integer.valueOf(c1853UjhhgtgfeyxiexzfArr.length));
        if (enumC2814Ujhhgtgfeyxiexzf == enumC2814Ujhhgtgfeyxiexzf3 && !modifiers.hasModifier("abstract")) {
            modifiers.addModifier("abstract");
        }
        if (enumC2814Ujhhgtgfeyxiexzf != enumC2814Ujhhgtgfeyxiexzf2 || modifiers.hasModifier("static")) {
            return;
        }
        modifiers.addModifier("static");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m321Ujhhgtgfeyxiexzf(String str) {
        return (str.startsWith("[") || !str.startsWith("L")) ? str : AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(1, 1, str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m322Ujhhgtgfeyxiexzf(int i, String str, String[] strArr, C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf, C0154Ujhhgtgfeyxiexzf[] c0154UjhhgtgfeyxiexzfArr, int i2, C0299Ujhhgtgfeyxiexzf c0299Ujhhgtgfeyxiexzf) {
        String str2;
        c0299Ujhhgtgfeyxiexzf.m1521Ujhhgtgfeyxiexzf(c0154UjhhgtgfeyxiexzfArr[i]);
        c0299Ujhhgtgfeyxiexzf.m1526Ujhhgtgfeyxiexzf(25, 0);
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
            c0299Ujhhgtgfeyxiexzf.m1526Ujhhgtgfeyxiexzf(25, i2);
            c0299Ujhhgtgfeyxiexzf.m1524Ujhhgtgfeyxiexzf(Opcodes.INVOKEVIRTUAL, "bsh/This$ConstructorArgs", str2, "()".concat(str2.equals("getObject") ? "Ljava/lang/Object;" : str3));
            if (str2.equals("getObject")) {
                c0299Ujhhgtgfeyxiexzf.m1525Ujhhgtgfeyxiexzf(Opcodes.CHECKCAST, m321Ujhhgtgfeyxiexzf(str3));
            }
        }
        c0299Ujhhgtgfeyxiexzf.m1524Ujhhgtgfeyxiexzf(Opcodes.INVOKESPECIAL, str, "<init>", m327Ujhhgtgfeyxiexzf("V", strArr));
        c0299Ujhhgtgfeyxiexzf.m1520Ujhhgtgfeyxiexzf(Opcodes.GOTO, c0154Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static void m323Ujhhgtgfeyxiexzf(String str, String str2, int i, String str3, C2843feyxiexzfUjhhgtg c2843feyxiexzfUjhhgtg) {
        C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg = new C3434feyxiexzfUjhhgtg(c2843feyxiexzfUjhhgtg.f9030Ujhhgtgfeyxiexzf, i, str, str2, str3);
        if (c2843feyxiexzfUjhhgtg.f9036Ujhhgtgfeyxiexzf == null) {
            c2843feyxiexzfUjhhgtg.f9036Ujhhgtgfeyxiexzf = c3434feyxiexzfUjhhgtg;
        } else {
            c2843feyxiexzfUjhhgtg.f9037Ujhhgtgfeyxiexzf.f10706Ujhhgtgfeyxiexzf = c3434feyxiexzfUjhhgtg;
        }
        c2843feyxiexzfUjhhgtg.f9037Ujhhgtgfeyxiexzf = c3434feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m324Ujhhgtgfeyxiexzf(String[] strArr, boolean z, C0299Ujhhgtgfeyxiexzf c0299Ujhhgtgfeyxiexzf) {
        int i;
        c0299Ujhhgtgfeyxiexzf.m1519Ujhhgtgfeyxiexzf(17, strArr.length);
        c0299Ujhhgtgfeyxiexzf.m1525Ujhhgtgfeyxiexzf(Opcodes.ANEWARRAY, ASMUtils.TYPE_OBJECT);
        int i2 = !z ? 1 : 0;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str = strArr[i3];
            c0299Ujhhgtgfeyxiexzf.m1518Ujhhgtgfeyxiexzf(89);
            c0299Ujhhgtgfeyxiexzf.m1519Ujhhgtgfeyxiexzf(17, i3);
            int length = str.length();
            String str2 = f493Ujhhgtgfeyxiexzf;
            if (length == 1) {
                if (str.equals("F")) {
                    i = 23;
                } else if (str.equals("D")) {
                    i = 24;
                } else {
                    i = str.equals("J") ? 22 : 21;
                }
                c0299Ujhhgtgfeyxiexzf.m1525Ujhhgtgfeyxiexzf(Opcodes.NEW, str2);
                c0299Ujhhgtgfeyxiexzf.m1518Ujhhgtgfeyxiexzf(89);
                c0299Ujhhgtgfeyxiexzf.m1526Ujhhgtgfeyxiexzf(i, i2);
                c0299Ujhhgtgfeyxiexzf.m1524Ujhhgtgfeyxiexzf(Opcodes.INVOKESPECIAL, str2, "<init>", AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("("), str, ")V"));
                c0299Ujhhgtgfeyxiexzf.m1518Ujhhgtgfeyxiexzf(83);
            } else {
                c0299Ujhhgtgfeyxiexzf.m1526Ujhhgtgfeyxiexzf(25, i2);
                C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf = new C0154Ujhhgtgfeyxiexzf();
                c0299Ujhhgtgfeyxiexzf.m1520Ujhhgtgfeyxiexzf(Opcodes.IFNONNULL, c0154Ujhhgtgfeyxiexzf);
                c0299Ujhhgtgfeyxiexzf.m1515Ujhhgtgfeyxiexzf(Opcodes.GETSTATIC, str2, "NULL", f494Ujhhgtgfeyxiexzf);
                c0299Ujhhgtgfeyxiexzf.m1518Ujhhgtgfeyxiexzf(83);
                C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf2 = new C0154Ujhhgtgfeyxiexzf();
                c0299Ujhhgtgfeyxiexzf.m1520Ujhhgtgfeyxiexzf(Opcodes.GOTO, c0154Ujhhgtgfeyxiexzf2);
                c0299Ujhhgtgfeyxiexzf.m1521Ujhhgtgfeyxiexzf(c0154Ujhhgtgfeyxiexzf);
                c0299Ujhhgtgfeyxiexzf.m1526Ujhhgtgfeyxiexzf(25, i2);
                c0299Ujhhgtgfeyxiexzf.m1518Ujhhgtgfeyxiexzf(83);
                c0299Ujhhgtgfeyxiexzf.m1521Ujhhgtgfeyxiexzf(c0154Ujhhgtgfeyxiexzf2);
            }
            i2 += (str.equals("D") || str.equals("J")) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m325Ujhhgtgfeyxiexzf(String str, C0299Ujhhgtgfeyxiexzf c0299Ujhhgtgfeyxiexzf) {
        int i;
        if (str.equals("V")) {
            c0299Ujhhgtgfeyxiexzf.m1518Ujhhgtgfeyxiexzf(Opcodes.RETURN);
            return;
        }
        if (str.length() != 1) {
            c0299Ujhhgtgfeyxiexzf.m1525Ujhhgtgfeyxiexzf(Opcodes.CHECKCAST, m321Ujhhgtgfeyxiexzf(str));
            c0299Ujhhgtgfeyxiexzf.m1518Ujhhgtgfeyxiexzf(Opcodes.ARETURN);
            return;
        }
        if (str.equals("D")) {
            i = Opcodes.DRETURN;
        } else if (str.equals("F")) {
            i = Opcodes.FRETURN;
        } else {
            i = str.equals("J") ? Opcodes.LRETURN : Opcodes.IRETURN;
        }
        c0299Ujhhgtgfeyxiexzf.m1518Ujhhgtgfeyxiexzf(i);
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static int m326Ujhhgtgfeyxiexzf(Modifiers modifiers) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static String m327Ujhhgtgfeyxiexzf(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder("(");
        for (String str2 : strArr) {
            sb.append(str2);
        }
        sb.append(')');
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static void m328Ujhhgtgfeyxiexzf(String str, String str2, C0299Ujhhgtgfeyxiexzf c0299Ujhhgtgfeyxiexzf) {
        c0299Ujhhgtgfeyxiexzf.m1515Ujhhgtgfeyxiexzf(Opcodes.GETSTATIC, str, This.Keys.BSHSTATIC + str2, "Lbsh/This;");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m329Ujhhgtgfeyxiexzf(int i, String[] strArr, int i2, C2843feyxiexzfUjhhgtg c2843feyxiexzfUjhhgtg) {
        int length = strArr.length + 1;
        int length2 = strArr.length + 2;
        C0299Ujhhgtgfeyxiexzf c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf = c2843feyxiexzfUjhhgtg.m4175Ujhhgtgfeyxiexzf(i2, "<init>", m327Ujhhgtgfeyxiexzf("V", strArr));
        m324Ujhhgtgfeyxiexzf(strArr, false, c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1526Ujhhgtgfeyxiexzf(58, length);
        C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf = new C0154Ujhhgtgfeyxiexzf();
        C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf2 = new C0154Ujhhgtgfeyxiexzf();
        C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf;
        Class cls = this.f499Ujhhgtgfeyxiexzf;
        List listM3828Ujhhgtgfeyxiexzf = ((C2570Ujhhgtgfeyxiexzf) c0271Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls)).m3828Ujhhgtgfeyxiexzf(cls.getName());
        int size = listM3828Ujhhgtgfeyxiexzf.size();
        C0025Ujhhgtgfeyxiexzf[] c0025UjhhgtgfeyxiexzfArr = this.f503Ujhhgtgfeyxiexzf;
        int length3 = size + c0025UjhhgtgfeyxiexzfArr.length;
        C0154Ujhhgtgfeyxiexzf[] c0154UjhhgtgfeyxiexzfArr = new C0154Ujhhgtgfeyxiexzf[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            c0154UjhhgtgfeyxiexzfArr[i3] = new C0154Ujhhgtgfeyxiexzf();
        }
        String typeDescriptor = BSHType.getTypeDescriptor(cls);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1522Ujhhgtgfeyxiexzf(C1792Ujhhgtgfeyxiexzf.m3172Ujhhgtgfeyxiexzf(0, typeDescriptor.length(), typeDescriptor));
        String str = this.f497Ujhhgtgfeyxiexzf;
        String str2 = this.f495Ujhhgtgfeyxiexzf;
        m328Ujhhgtgfeyxiexzf(str, str2, c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1526Ujhhgtgfeyxiexzf(25, length);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1519Ujhhgtgfeyxiexzf(16, i);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1524Ujhhgtgfeyxiexzf(Opcodes.INVOKESTATIC, "bsh/This", "getConstructorArgs", "(Ljava/lang/Class;Lbsh/This;[Ljava/lang/Object;I)Lbsh/This$ConstructorArgs;");
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1526Ujhhgtgfeyxiexzf(58, length2);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1526Ujhhgtgfeyxiexzf(25, length2);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1515Ujhhgtgfeyxiexzf(Opcodes.GETFIELD, "bsh/This$ConstructorArgs", "selector", "I");
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.f1767Ujhhgtgfeyxiexzf;
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.f1784feyxiexzfUjhhgtg = c2610Ujhhgtgfeyxiexzf.f8422Ujhhgtgfeyxiexzf;
        c2610Ujhhgtgfeyxiexzf.m3910Ujhhgtgfeyxiexzf(Opcodes.TABLESWITCH);
        c2610Ujhhgtgfeyxiexzf.m3911Ujhhgtgfeyxiexzf((4 - (c2610Ujhhgtgfeyxiexzf.f8422Ujhhgtgfeyxiexzf % 4)) % 4, null);
        boolean z = true;
        c0154Ujhhgtgfeyxiexzf.m1201Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf, c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.f1784feyxiexzfUjhhgtg, true);
        c2610Ujhhgtgfeyxiexzf.m3912Ujhhgtgfeyxiexzf(0);
        c2610Ujhhgtgfeyxiexzf.m3912Ujhhgtgfeyxiexzf(length3 - 1);
        int i4 = 0;
        while (i4 < length3) {
            c0154UjhhgtgfeyxiexzfArr[i4].m1201Ujhhgtgfeyxiexzf(c2610Ujhhgtgfeyxiexzf, c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.f1784feyxiexzfUjhhgtg, z);
            i4++;
            z = true;
        }
        C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf3 = c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.f1777Ujhhgtgfeyxiexzf;
        if (c0154Ujhhgtgfeyxiexzf3 != null) {
            int i5 = c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.f1774Ujhhgtgfeyxiexzf;
            if (i5 == 4) {
                int i6 = 0;
                c0154Ujhhgtgfeyxiexzf3.f1325Ujhhgtgfeyxiexzf.m5093Ujhhgtgfeyxiexzf(Opcodes.LOOKUPSWITCH, 0, null, null);
                c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1512Ujhhgtgfeyxiexzf(0, c0154Ujhhgtgfeyxiexzf);
                C0154Ujhhgtgfeyxiexzf c0154UjhhgtgfeyxiexzfM1199Ujhhgtgfeyxiexzf = c0154Ujhhgtgfeyxiexzf.m1199Ujhhgtgfeyxiexzf();
                c0154UjhhgtgfeyxiexzfM1199Ujhhgtgfeyxiexzf.f1318Ujhhgtgfeyxiexzf = (short) (c0154UjhhgtgfeyxiexzfM1199Ujhhgtgfeyxiexzf.f1318Ujhhgtgfeyxiexzf | 2);
                int i7 = 0;
                while (i7 < length3) {
                    C0154Ujhhgtgfeyxiexzf c0154Ujhhgtgfeyxiexzf4 = c0154UjhhgtgfeyxiexzfArr[i7];
                    c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1512Ujhhgtgfeyxiexzf(i6, c0154Ujhhgtgfeyxiexzf4);
                    C0154Ujhhgtgfeyxiexzf c0154UjhhgtgfeyxiexzfM1199Ujhhgtgfeyxiexzf2 = c0154Ujhhgtgfeyxiexzf4.m1199Ujhhgtgfeyxiexzf();
                    c0154UjhhgtgfeyxiexzfM1199Ujhhgtgfeyxiexzf2.f1318Ujhhgtgfeyxiexzf = (short) (c0154UjhhgtgfeyxiexzfM1199Ujhhgtgfeyxiexzf2.f1318Ujhhgtgfeyxiexzf | 2);
                    i7++;
                    i6 = 0;
                }
            } else if (i5 == 1) {
                int i8 = c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.f1778Ujhhgtgfeyxiexzf - 1;
                c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.f1778Ujhhgtgfeyxiexzf = i8;
                c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1512Ujhhgtgfeyxiexzf(i8, c0154Ujhhgtgfeyxiexzf);
                for (int i9 = 0; i9 < length3; i9++) {
                    c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1512Ujhhgtgfeyxiexzf(c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.f1778Ujhhgtgfeyxiexzf, c0154UjhhgtgfeyxiexzfArr[i9]);
                }
            }
            c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1513Ujhhgtgfeyxiexzf();
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < listM3828Ujhhgtgfeyxiexzf.size()) {
            m322Ujhhgtgfeyxiexzf(i11, this.f500Ujhhgtgfeyxiexzf, ((AbstractC0695Ujhhgtgfeyxiexzf) listM3828Ujhhgtgfeyxiexzf.get(i10)).m1965Ujhhgtgfeyxiexzf(), c0154Ujhhgtgfeyxiexzf2, c0154UjhhgtgfeyxiexzfArr, length2, c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf);
            i10++;
            i11++;
            str2 = str2;
        }
        String str3 = str2;
        int i12 = 0;
        while (i12 < c0025UjhhgtgfeyxiexzfArr.length) {
            m322Ujhhgtgfeyxiexzf(i11, this.f497Ujhhgtgfeyxiexzf, c0025UjhhgtgfeyxiexzfArr[i12].f507Ujhhgtgfeyxiexzf, c0154Ujhhgtgfeyxiexzf2, c0154UjhhgtgfeyxiexzfArr, length2, c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf);
            i12++;
            i11++;
        }
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1521Ujhhgtgfeyxiexzf(c0154Ujhhgtgfeyxiexzf);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1526Ujhhgtgfeyxiexzf(25, 0);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1524Ujhhgtgfeyxiexzf(Opcodes.INVOKESPECIAL, this.f500Ujhhgtgfeyxiexzf, "<init>", "()V");
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1521Ujhhgtgfeyxiexzf(c0154Ujhhgtgfeyxiexzf2);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1526Ujhhgtgfeyxiexzf(25, 0);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1522Ujhhgtgfeyxiexzf(str3);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1526Ujhhgtgfeyxiexzf(25, length);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1524Ujhhgtgfeyxiexzf(Opcodes.INVOKESTATIC, "bsh/This", "initInstance", AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("("), f492Ujhhgtgfeyxiexzf, "Ljava/lang/String;[Ljava/lang/Object;)V"));
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1518Ujhhgtgfeyxiexzf(Opcodes.RETURN);
        c0299UjhhgtgfeyxiexzfM4175Ujhhgtgfeyxiexzf.m1523Ujhhgtgfeyxiexzf();
    }
}
