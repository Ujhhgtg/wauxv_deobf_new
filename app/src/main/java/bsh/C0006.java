package bsh;

import bsh.This;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import p000.AbstractC1194;
import p000.AbstractC1672;
import p000.AbstractC2784;
import p000.C0346;
import p000.C0482;
import p000.C0484;
import p000.C0501;
import p000.C0550;
import p000.C0704;
import p000.C1229;
import p000.C1669;
import p000.C1751;
import p000.C1883;
import p000.C2116;
import p000.C2518;
import p000.C3523;
import p000.C3524;
import p000.InterfaceC2645;
import p000.RunnableC1668;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0006 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final Pattern f483 = Pattern.compile("eval|assert");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C0007 f484;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public String f485;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public String f486;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public String f487;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Object f488;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f489;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public Class f490;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public Class f491;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static int m327(String str) {
        if (str == null) {
            return 0;
        }
        return C2116.m3929(str).f6973;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C0007 m328(C0007 c0007) {
        C0007 c0008;
        if (c0007 == null) {
            return null;
        }
        if (c0007.f508) {
            return c0007;
        }
        if (c0007.f507 && (c0008 = c0007.f494) != null && c0008.f508) {
            return c0008;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static boolean m329(String str) {
        return m327(str) > 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static String m330(int i, String str) {
        if (str == null) {
            return null;
        }
        C2116 c2116M3929 = C2116.m3929(str);
        String[] strArr = c2116M3929.f6970;
        if (1 > i || c2116M3929.f6973 < i) {
            return null;
        }
        if (strArr[i] == null) {
            strArr[i] = String.join(".", c2116M3929.f6972.subList(0, i));
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static String m331(int i, String str) {
        int i2;
        if (str == null) {
            return null;
        }
        C2116 c2116M3929 = C2116.m3929(str);
        String[] strArr = c2116M3929.f6971;
        if (1 > i || (i2 = c2116M3929.f6973) < i) {
            return null;
        }
        if (strArr[i] == null) {
            strArr[i] = String.join(".", c2116M3929.f6972.subList(i2 - i, i2));
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static String m332(String str) {
        return m331(m327(str) - 1, str);
    }

    public final String toString() {
        return this.f485;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m333(String str, String str2, Object obj) {
        if (obj == null) {
            throw new C1669(AbstractC2784.m4757("lastEvalName = ", str));
        }
        this.f487 = str;
        this.f486 = str2;
        this.f488 = obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object m334(C0550 c0550, RunnableC1668 runnableC1668, boolean z, boolean z2) throws C3523 {
        Object objM336;
        String str = this.f485;
        C0007 c0007 = this.f484;
        Object objM393 = null;
        if (this.f488 == null && !m329(this.f486) && !z && (objM336 = m336(c0550, c0007, runnableC1668, this.f486, false)) != Primitive.VOID) {
            m333(this.f486, null, objM336);
            return objM336;
        }
        String strM330 = m330(1, this.f486);
        Object obj = this.f488;
        if ((obj == null || (obj instanceof This)) && !z) {
            Object objM337 = obj == null ? m336(c0550, c0007, runnableC1668, strM330, false) : m336(c0550, ((This) obj).namespace, runnableC1668, strM330, true);
            if (objM337 != Primitive.VOID) {
                m333(strM330, m332(this.f486), objM337);
                return objM337;
            }
        } else {
            c0007 = c0007;
        }
        if (this.f488 == null) {
            RunnableC1668.m3389("trying class: ", this.f486);
            Class clsM344 = null;
            String strM331 = null;
            int i = 1;
            while (i <= m327(this.f486) && (clsM344 = c0007.m344((strM331 = m330(i, this.f486)))) == null) {
                i++;
            }
            if (clsM344 != null) {
                String str2 = this.f486;
                String strM332 = m331(m327(str2) - i, str2);
                C0704 c0704 = new C0704(clsM344);
                m333(strM331, strM332, c0704);
                return c0704;
            }
            RunnableC1668.m3389("not a class, trying var prefix ", this.f486);
        }
        Object obj2 = this.f488;
        if ((obj2 == null || (obj2 instanceof This)) && !z && z2) {
            C0007 c0008 = obj2 == null ? c0007 : ((This) obj2).namespace;
            This thisMo310 = new C0007(c0008, null, AbstractC2784.m4757("auto: ", strM330)).mo310(runnableC1668);
            c0008.mo314(strM330, thisMo310, this.f488 == null);
            m333(strM330, m332(this.f486), thisMo310);
            return thisMo310;
        }
        if (obj2 == null) {
            if (m329(this.f486)) {
                throw new C3523("Class or variable not found: " + this.f486);
            }
            Object objM355 = c0007.m355(strM330, runnableC1668);
            m333(this.f486, null, objM355);
            return objM355;
        }
        if (obj2 == Primitive.NULL) {
            NullPointerException nullPointerException = new NullPointerException(AbstractC2784.m4757("Null Pointer while evaluating: ", str));
            throw new C3524(nullPointerException.getMessage(), nullPointerException);
        }
        if (obj2 == Primitive.VOID) {
            throw new C3523(AbstractC2784.m4757("Undefined variable or class name while evaluating: ", str));
        }
        if (obj2 instanceof Primitive) {
            throw new C3523(AbstractC2784.m4757("Can't treat primitive like an object. Error while evaluating: ", str));
        }
        if (!(obj2 instanceof C0704)) {
            if (z) {
                throw new C3523(AbstractC2784.m4748(str, " does not resolve to a class name."));
            }
            String strM333 = m330(1, this.f486);
            RunnableC1668.f5631.m3664();
            if (strM333.equals("length") && this.f488.getClass().isArray()) {
                Primitive primitive = new Primitive(Array.getLength(this.f488));
                m333(strM333, m332(this.f486), primitive);
                return primitive;
            }
            try {
                Object objM391 = AbstractC0009.m391(this.f488, strM333);
                m333(strM333, m332(this.f486), objM391);
                return objM391;
            } catch (C2518 unused) {
                Object objM394 = AbstractC0009.m393(this.f488, strM333);
                m333(strM333, m332(this.f486), objM394);
                return objM394;
            }
        }
        Class<?> cls = ((C0704) obj2).f2682;
        String strM334 = m330(1, this.f486);
        if (strM334.equals("this")) {
            while (c0007 != null) {
                Object obj3 = c0007.f512;
                if (obj3 != null && obj3.getClass() == cls) {
                    String strM335 = m332(this.f486);
                    Object obj4 = c0007.f512;
                    m333(strM334, strM335, obj4);
                    return obj4;
                }
                c0007 = c0007.f494;
            }
            throw new C3523(AbstractC1194.m2782(cls, "Can't find enclosing 'this' instance of class: "));
        }
        RunnableC1668.f5631.m3665(cls, strM334);
        try {
            RunnableC1668.m3389("Name call to getStaticFieldValue, class: ", cls, ", field:", strM334);
            objM393 = AbstractC0009.m386(cls, null, strM334, true);
        } catch (C2518 e) {
            RunnableC1668.m3389("field reflect error: ", e);
        }
        if (objM393 == null) {
            Class clsM345 = c0007.m344(cls.getName() + "$" + strM334);
            if (c0007.f512 == null && AbstractC0009.m401(clsM345) && !AbstractC0009.m382(clsM345).m3864("static")) {
                throw new C3523("an enclosing instance that contains " + cls.getName() + "." + strM334 + " is required");
            }
            if (clsM345 != null) {
                objM393 = new C0704(clsM345);
            }
        }
        if (objM393 == null) {
            objM393 = AbstractC0009.m393(cls, strM334);
        }
        m333(strM334, m332(this.f486), objM393);
        return objM393;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object m335(RunnableC1668 runnableC1668, Object[] objArr, C0550 c0550, C0346 c0346) throws C1229, C3523 {
        C0007 c0007M395;
        C0501 c0501M350;
        C3523 c3523;
        C0007 c0007 = this.f484;
        String str = this.f485;
        String strM331 = m331(1, str);
        C0482 c0482M346 = runnableC1668.f5634.m346();
        C0007 c0007M1929 = c0550.m1929();
        Class cls = this.f491;
        if (cls != null) {
            RunnableC1668.f5631.m3667(cls, strM331, objArr);
            return AbstractC0009.m400(c0482M346, this.f491, strM331, objArr, c0346);
        }
        if (m329(str)) {
            String strM330 = m330(m327(str) - 1, str);
            if (strM330.equals("super") && m327(str) == 2) {
                C0007 nameSpace = c0007M1929.mo310(runnableC1668).getNameSpace();
                nameSpace.f506 = c0346;
                C0007 c0007M328 = m328(nameSpace);
                if (c0007M328 != null) {
                    Object objM345 = c0007M328.m345();
                    Class cls2 = c0007M328.f511;
                    RunnableC1668.f5631.m3666(objM345, strM331, objArr);
                    if (C0004.f472 == null) {
                        C0004.f472 = new C0004();
                    }
                    C0004.f472.getClass();
                    Class superclass = cls2.getSuperclass();
                    AbstractC1672 abstractC1672M406 = AbstractC0009.m406(objM345.getClass(), This.Keys.BSHSUPER + superclass.getSimpleName() + strM331, AbstractC0010.m420(objArr), false);
                    return abstractC1672M406 != null ? abstractC1672M406.mo3012(objM345, objArr) : AbstractC0009.m405(c0482M346, superclass, objM345, strM331, objArr, false).mo3012(objM345, objArr);
                }
            }
            C0006 c0006M352 = c0007M1929.m352(strM330);
            Object objM339 = c0006M352.m339(c0550, runnableC1668, false);
            if (objM339 == Primitive.VOID) {
                throw new C3523("Attempt to resolve method: " + strM331 + "() on undefined variable or class name: " + c0006M352);
            }
            if (objM339 instanceof C0704) {
                RunnableC1668.m3389("invokeMethod: trying static - ", c0006M352);
                Class cls3 = ((C0704) objM339).f2682;
                this.f491 = cls3;
                RunnableC1668.f5631.m3667(cls3, strM331, objArr);
                return AbstractC0009.m400(c0482M346, cls3, strM331, objArr, c0346);
            }
            if ((objM339 instanceof Primitive) && objM339 == Primitive.NULL) {
                NullPointerException nullPointerException = new NullPointerException("Null Pointer in Method Invocation of " + strM331 + "() on variable: " + c0006M352);
                throw new C3524(nullPointerException.getMessage(), nullPointerException);
            }
            if (objM339.getClass().isEnum() && (c0007M395 = AbstractC0009.m395(objM339)) != null && (c0501M350 = c0007M395.m350(strM331, AbstractC0010.m420(objArr), true)) != null) {
                return c0501M350.m1754(objArr, runnableC1668, c0550, c0346, false);
            }
            RunnableC1668.f5631.m3666(objM339, strM331, objArr);
            return AbstractC0009.m399(objM339, strM331, objArr, runnableC1668, c0550, c0346);
        }
        RunnableC1668.m3389("invokeLocalMethod: ", str);
        String str2 = this.f485;
        Class[] clsArrM420 = AbstractC0010.m420(objArr);
        try {
            C1883 c1883 = RunnableC1668.f5631;
            c1883.getClass();
            Primitive.unwrap(objArr);
            Iterator it = c1883.f6229.iterator();
            while (it.hasNext()) {
                try {
                    try {
                        ((InterfaceC2645) it.next()).getClass();
                    } catch (C3523 e) {
                        c3523 = e;
                        throw c3523.mo4643(c0346, c0550);
                    }
                } catch (C3523 e2) {
                    c3523 = e2;
                }
            }
            try {
                C0501 c0501M351 = c0007.m350(str2, clsArrM420, false);
                if (c0501M351 != null) {
                    return c0501M351.m1754(objArr, runnableC1668, c0550, c0346, (c0007.f507 || c0501M351.f2160 || !c0007.m362(c0501M351.f2147) || c0007.f494.f508 || f483.matcher(c0501M351.m1748()).matches()) ? false : true);
                }
                return c0007.m360(str2, objArr, runnableC1668, c0550, c0346, false);
            } catch (C3523 e3) {
                throw e3.mo4644("Local method invocation", c0346, c0550);
            }
        } catch (C3523 e4) {
            c3523 = e4;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object m336(C0550 c0550, C0007 c0007, RunnableC1668 runnableC1668, String str, boolean z) throws C3523 {
        Object objM356;
        if (str.equals("this")) {
            if (z) {
                throw new C3523("Redundant to call .this on This type");
            }
            This thisMo310 = c0007.mo310(runnableC1668);
            C0007 c0007M328 = m328(thisMo310.getNameSpace());
            if (c0007M328 != null) {
                return m329(this.f486) ? c0007M328.mo310(runnableC1668) : c0007M328.m345();
            }
            return thisMo310;
        }
        if (str.equals("super")) {
            This thisMo309 = c0007.mo309(runnableC1668);
            C0007 nameSpace = thisMo309.getNameSpace();
            C0007 c0008 = nameSpace.f494;
            return (c0008 == null || !c0008.f508) ? thisMo309 : nameSpace.mo309(runnableC1668);
        }
        Object objM348 = str.equals("global") ? c0007.m348(runnableC1668) : null;
        if (objM348 == null && z) {
            if (str.equals("namespace")) {
                objM348 = c0007;
            } else if (str.equals("variables")) {
                objM348 = (String[]) c0007.f495.keySet().stream().toArray(new C0484(5));
            } else if (str.equals("methods")) {
                objM348 = (String[]) c0007.f496.keySet().stream().toArray(new C0484(7));
            } else if (str.equals("interpreter")) {
                if (!this.f487.equals("this")) {
                    throw new C3523("Can only call .interpreter on literal 'this'");
                }
                objM348 = runnableC1668;
            }
        }
        if (objM348 == null && z && str.equals("caller")) {
            if (!this.f487.equals("this") && !this.f487.equals("caller")) {
                throw new C3523("Can only call .caller on literal 'this' or literal '.caller'");
            }
            if (c0550 == null) {
                throw new C1669("no callstack");
            }
            int i = this.f489 + 1;
            this.f489 = i;
            Stack stack = c0550.f2265;
            int size = stack.size();
            return (i >= size ? C0007.f492 : ((C0007[]) stack.toArray(new C0007[size]))[(size - 1) - i]).mo310(runnableC1668);
        }
        if (objM348 != null || !z || !str.equals("callstack")) {
            objM356 = objM348;
        } else {
            if (!this.f487.equals("this")) {
                objM356 = c0550;
                throw new C3523("Can only call .callstack on literal 'this'");
            }
            if (c0550 == null) {
                throw new C1669("no callstack");
            }
        }
        if (objM356 == null) {
            objM356 = c0007.m356(str, this.f488 == null);
        }
        return objM356 == null ? Primitive.NULL : objM356;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final synchronized Class m337() {
        Class cls = this.f490;
        if (cls != null) {
            return cls;
        }
        String str = this.f485;
        this.f486 = str;
        Object objM339 = null;
        this.f488 = null;
        this.f489 = 0;
        if (!str.equals("var") && !this.f486.equals("val")) {
            Class clsM344 = this.f484.m344(this.f486);
            if (clsM344 == null) {
                try {
                    objM339 = m339(null, null, true);
                } catch (C3523 unused) {
                }
                if (objM339 instanceof C0704) {
                    clsM344 = ((C0704) objM339).f2682;
                }
            }
            if (clsM344 != null) {
                this.f490 = clsM344;
                return clsM344;
            }
            throw new ClassNotFoundException("Class: " + this.f485 + " not found in namespace");
        }
        this.f490 = null;
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final synchronized C1751 m338(C0550 c0550, RunnableC1668 runnableC1668) {
        try {
            String str = this.f485;
            this.f486 = str;
            Object objM334 = null;
            this.f488 = null;
            this.f489 = 0;
            if (!m329(str)) {
                if (this.f486.equals("this")) {
                    throw new C3523("Can't assign to 'this'.");
                }
                C0007 c0007 = this.f484;
                return c0007.f508 ? new C1751(c0007, this.f486) : new C1751(c0007, this.f486, false);
            }
            while (true) {
                try {
                    String str2 = this.f486;
                    if (str2 == null || !m329(str2)) {
                        break;
                    }
                    objM334 = m334(c0550, runnableC1668, false, true);
                } catch (C3523 e) {
                    throw new C3523("LHS evaluation: " + e.getMessage(), e);
                }
            }
            String str3 = this.f486;
            if (str3 == null && (objM334 instanceof C0704)) {
                throw new C3523("Can't assign to class: " + this.f485);
            }
            if (objM334 == null) {
                throw new C3523("Error in LHS: " + this.f485);
            }
            if (!(objM334 instanceof This)) {
                if (str3 == null) {
                    throw new C1669("Internal error in lhs...");
                }
                try {
                    if (objM334 instanceof C0704) {
                        return AbstractC0009.m388(((C0704) objM334).f2682, str3);
                    }
                    return AbstractC0009.m387(objM334, str3);
                } catch (C2518 unused) {
                    return new C1751(objM334, this.f486);
                }
            }
            if (!str3.equals("namespace") && !this.f486.equals("variables") && !this.f486.equals("methods") && !this.f486.equals("caller")) {
                RunnableC1668.m3389("found This reference evaluating LHS");
                return new C1751(((This) objM334).namespace, this.f486, !this.f487.equals("super"));
            }
            throw new C3523("Can't assign to special variable: " + this.f486);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final synchronized Object m339(C0550 c0550, RunnableC1668 runnableC1668, boolean z) {
        Object objM334;
        this.f486 = this.f485;
        objM334 = null;
        this.f488 = null;
        this.f489 = 0;
        while (this.f486 != null) {
            objM334 = m334(c0550, runnableC1668, z, false);
        }
        if (objM334 == null) {
            throw new C1669("null value in toObject()");
        }
        return objM334;
    }
}
