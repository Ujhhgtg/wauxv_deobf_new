package bsh;

import bsh.This;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import p000.AbstractC1095;
import p000.AbstractC1687;
import p000.AbstractC2844;
import p000.C0458;
import p000.C0461;
import p000.C0527;
import p000.C0699;
import p000.C1231;
import p000.C1684;
import p000.C1910;
import p000.C2149;
import p000.C2573;
import p000.C3581;
import p000.C3582;
import p000.InterfaceC2706;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0010 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final Pattern f510 = Pattern.compile("eval|assert");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C0012 f511;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public String f512;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public String f513;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public String f514;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Object f515;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f516;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public Class f517;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public Class f518;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static int m348(String str) {
        if (str == null) {
            return 0;
        }
        return C2149.m4113(str).f7097;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C0012 m349(C0012 c0012) {
        C0012 c0013;
        if (c0012 == null) {
            return null;
        }
        if (c0012.f535) {
            return c0012;
        }
        if (c0012.f534 && (c0013 = c0012.f521) != null && c0013.f535) {
            return c0013;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static boolean m350(String str) {
        return m348(str) > 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static String m351(int i, String str) {
        if (str == null) {
            return null;
        }
        C2149 c2149M4113 = C2149.m4113(str);
        String[] strArr = c2149M4113.f7094;
        if (1 > i || c2149M4113.f7097 < i) {
            return null;
        }
        if (strArr[i] == null) {
            strArr[i] = String.join(".", c2149M4113.f7096.subList(0, i));
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static String m352(int i, String str) {
        int i2;
        if (str == null) {
            return null;
        }
        C2149 c2149M4113 = C2149.m4113(str);
        String[] strArr = c2149M4113.f7095;
        if (1 > i || (i2 = c2149M4113.f7097) < i) {
            return null;
        }
        if (strArr[i] == null) {
            strArr[i] = String.join(".", c2149M4113.f7096.subList(i2 - i, i2));
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static String m353(String str) {
        return m352(m348(str) - 1, str);
    }

    public final String toString() {
        return this.f512;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m354(String str, String str2, Object obj) {
        if (obj == null) {
            throw new C1684(AbstractC2844.m4790("lastEvalName = ", str));
        }
        this.f514 = str;
        this.f513 = str2;
        this.f515 = obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object m355(C0527 c0527, RunnableC0008 runnableC0008, boolean z, boolean z2) throws C3581 {
        Object objM357;
        String str = this.f512;
        C0012 c0012 = this.f511;
        Object objM538 = null;
        if (this.f515 == null && !m350(this.f513) && !z && (objM357 = m357(c0527, c0012, runnableC0008, this.f513, false)) != Primitive.VOID) {
            m354(this.f513, null, objM357);
            return objM357;
        }
        String strM351 = m351(1, this.f513);
        Object obj = this.f515;
        if ((obj == null || (obj instanceof This)) && !z) {
            Object objM358 = obj == null ? m357(c0527, c0012, runnableC0008, strM351, false) : m357(c0527, ((This) obj).namespace, runnableC0008, strM351, true);
            if (objM358 != Primitive.VOID) {
                m354(strM351, m353(this.f513), objM358);
                return objM358;
            }
        } else {
            c0012 = c0012;
        }
        if (this.f515 == null) {
            RunnableC0008.m333("trying class: ", this.f513);
            Class clsM363 = null;
            String strM352 = null;
            int i = 1;
            while (i <= m348(this.f513) && (clsM363 = c0012.m363((strM352 = m351(i, this.f513)))) == null) {
                i++;
            }
            if (clsM363 != null) {
                String str2 = this.f513;
                String strM353 = m352(m348(str2) - i, str2);
                C0699 c0699 = new C0699(clsM363);
                m354(strM352, strM353, c0699);
                return c0699;
            }
            RunnableC0008.m333("not a class, trying var prefix ", this.f513);
        }
        Object obj2 = this.f515;
        if ((obj2 == null || (obj2 instanceof This)) && !z && z2) {
            C0012 c0013 = obj2 == null ? c0012 : ((This) obj2).namespace;
            This thisMo313 = new C0012(c0013, null, AbstractC2844.m4790("auto: ", strM351)).mo313(runnableC0008);
            c0013.mo317(strM351, thisMo313, this.f515 == null);
            m354(strM351, m353(this.f513), thisMo313);
            return thisMo313;
        }
        if (obj2 == null) {
            if (m350(this.f513)) {
                throw new C3581("Class or variable not found: " + this.f513);
            }
            Object objM375 = c0012.m375(strM351, runnableC0008);
            m354(this.f513, null, objM375);
            return objM375;
        }
        if (obj2 == Primitive.NULL) {
            NullPointerException nullPointerException = new NullPointerException(AbstractC2844.m4790("Null Pointer while evaluating: ", str));
            throw new C3582(nullPointerException.getMessage(), nullPointerException);
        }
        if (obj2 == Primitive.VOID) {
            throw new C3581(AbstractC2844.m4790("Undefined variable or class name while evaluating: ", str));
        }
        if (obj2 instanceof Primitive) {
            throw new C3581(AbstractC2844.m4790("Can't treat primitive like an object. Error while evaluating: ", str));
        }
        if (!(obj2 instanceof C0699)) {
            if (z) {
                throw new C3581(AbstractC2844.m4782(str, " does not resolve to a class name."));
            }
            String strM354 = m351(1, this.f513);
            RunnableC0008.f502.m3842();
            if (strM354.equals("length") && this.f515.getClass().isArray()) {
                Primitive primitive = new Primitive(Array.getLength(this.f515));
                m354(strM354, m353(this.f513), primitive);
                return primitive;
            }
            try {
                Object objM536 = AbstractC0016.m536(this.f515, strM354);
                m354(strM354, m353(this.f513), objM536);
                return objM536;
            } catch (C2573 unused) {
                Object objM539 = AbstractC0016.m538(this.f515, strM354);
                m354(strM354, m353(this.f513), objM539);
                return objM539;
            }
        }
        Class<?> cls = ((C0699) obj2).f2676;
        String strM355 = m351(1, this.f513);
        if (strM355.equals("this")) {
            while (c0012 != null) {
                Object obj3 = c0012.f539;
                if (obj3 != null && obj3.getClass() == cls) {
                    String strM356 = m353(this.f513);
                    Object obj4 = c0012.f539;
                    m354(strM355, strM356, obj4);
                    return obj4;
                }
                c0012 = c0012.f521;
            }
            throw new C3581(AbstractC1095.m2797(cls, "Can't find enclosing 'this' instance of class: "));
        }
        RunnableC0008.f502.m3843(cls, strM355);
        try {
            RunnableC0008.m333("Name call to getStaticFieldValue, class: ", cls, ", field:", strM355);
            objM538 = AbstractC0016.m531(cls, null, strM355, true);
        } catch (C2573 e) {
            RunnableC0008.m333("field reflect error: ", e);
        }
        if (objM538 == null) {
            Class clsM364 = c0012.m363(cls.getName() + "$" + strM355);
            if (c0012.f539 == null && AbstractC0016.m546(clsM364) && !AbstractC0016.m527(clsM364).hasModifier("static")) {
                throw new C3581("an enclosing instance that contains " + cls.getName() + "." + strM355 + " is required");
            }
            if (clsM364 != null) {
                objM538 = new C0699(clsM364);
            }
        }
        if (objM538 == null) {
            objM538 = AbstractC0016.m538(cls, strM355);
        }
        m354(strM355, m353(this.f513), objM538);
        return objM538;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object m356(Object[] objArr, RunnableC0008 runnableC0008, C0527 c0527, Node node) throws C3581, C1231 {
        C0012 c0012M540;
        BshMethod bshMethodM370;
        C3581 c3581;
        C0527 c0528;
        Object obj;
        C0012 c0012 = this.f511;
        String str = this.f512;
        String strM352 = m352(1, str);
        C0458 c0458M365 = runnableC0008.f505.m365();
        C0012 c0012M2024 = c0527.m2024();
        Class cls = this.f518;
        if (cls != null) {
            RunnableC0008.f502.m3845(cls, strM352, objArr);
            return AbstractC0016.m545(c0458M365, this.f518, strM352, objArr, node);
        }
        if (m350(str)) {
            String strM351 = m351(m348(str) - 1, str);
            if (strM351.equals("super") && m348(str) == 2) {
                C0012 nameSpace = c0012M2024.mo313(runnableC0008).getNameSpace();
                nameSpace.f533 = node;
                C0012 c0012M349 = m349(nameSpace);
                if (c0012M349 != null) {
                    Object objM364 = c0012M349.m364();
                    Class cls2 = c0012M349.f538;
                    RunnableC0008.f502.m3844(objM364, strM352, objArr);
                    if (C0005.f480 == null) {
                        C0005.f480 = new C0005();
                    }
                    C0005.f480.getClass();
                    Class superclass = cls2.getSuperclass();
                    AbstractC1687 abstractC1687M551 = AbstractC0016.m551(objM364.getClass(), This.Keys.BSHSUPER + superclass.getSimpleName() + strM352, AbstractC0017.m564(objArr), false);
                    return abstractC1687M551 != null ? abstractC1687M551.mo3115(objM364, objArr) : AbstractC0016.m550(c0458M365, superclass, objM364, strM352, objArr, false).mo3115(objM364, objArr);
                }
            }
            C0010 c0010M372 = c0012M2024.m372(strM351);
            Object objM360 = c0010M372.m360(c0527, runnableC0008, false);
            if (objM360 == Primitive.VOID) {
                throw new C3581("Attempt to resolve method: " + strM352 + "() on undefined variable or class name: " + c0010M372);
            }
            if (objM360 instanceof C0699) {
                RunnableC0008.m333("invokeMethod: trying static - ", c0010M372);
                Class cls3 = ((C0699) objM360).f2676;
                this.f518 = cls3;
                RunnableC0008.f502.m3845(cls3, strM352, objArr);
                return AbstractC0016.m545(c0458M365, cls3, strM352, objArr, node);
            }
            if ((objM360 instanceof Primitive) && objM360 == Primitive.NULL) {
                NullPointerException nullPointerException = new NullPointerException("Null Pointer in Method Invocation of " + strM352 + "() on variable: " + c0010M372);
                throw new C3582(nullPointerException.getMessage(), nullPointerException);
            }
            if (objM360.getClass().isEnum() && (c0012M540 = AbstractC0016.m540(objM360)) != null && (bshMethodM370 = c0012M540.m370(strM352, AbstractC0017.m564(objArr), true)) != null) {
                return bshMethodM370.invoke(objArr, runnableC0008, c0527, node);
            }
            RunnableC0008.f502.m3844(objM360, strM352, objArr);
            return AbstractC0016.m544(objM360, strM352, objArr, runnableC0008, c0527, node);
        }
        RunnableC0008.m333("invokeLocalMethod: ", str);
        String str2 = this.f512;
        Class[] clsArrM564 = AbstractC0017.m564(objArr);
        try {
            C1910 c1910 = RunnableC0008.f502;
            c1910.getClass();
            Primitive.unwrap(objArr);
            Iterator it = c1910.f6304.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC2706) it.next()).getClass();
                } catch (C3581 e) {
                    c3581 = e;
                    throw c3581.mo4677(node, c0527);
                }
            }
            BshMethod bshMethodM367 = null;
            try {
                Object objM357 = m357(c0527, c0012, runnableC0008, "this", false);
                c0528 = c0527;
                try {
                    if (objM357 instanceof This) {
                        objM357 = Primitive.unwrap(objM357);
                    }
                    obj = objM357;
                } catch (C3581 unused) {
                    obj = null;
                }
            } catch (C3581 unused2) {
                c0528 = c0527;
            }
            if (obj != null) {
                try {
                    if (obj != Primitive.NULL && obj != Primitive.VOID) {
                        bshMethodM367 = c0012.m367(AbstractC0017.m563(obj, false), str2, clsArrM564);
                    }
                } catch (C3581 e2) {
                    throw e2.mo4678("Local method invocation", node, c0528);
                }
            }
            if (bshMethodM367 == null) {
                bshMethodM367 = c0012.m370(str2, clsArrM564, false);
            }
            BshMethod bshMethod = bshMethodM367;
            if (bshMethod != null) {
                return bshMethod.invoke(objArr, runnableC0008, c0528, node, (c0012.f534 || bshMethod.isScriptedObject || !c0012.m382(bshMethod.declaringNameSpace) || c0012.f521.f535 || f510.matcher(bshMethod.getName()).matches()) ? false : true, obj);
            }
            return c0012.m380(str2, objArr, runnableC0008, c0527, node, false);
        } catch (C3581 e3) {
            c3581 = e3;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object m357(C0527 c0527, C0012 c0012, RunnableC0008 runnableC0008, String str, boolean z) throws C3581 {
        Object objM376;
        if (str.equals("this")) {
            for (C0012 c0013 = c0012; c0013 != null; c0013 = c0013.f521) {
                Object objM377 = c0013.m376(This.Keys.BSHEXTENSIONMETHODRECEIVER.toString(), false);
                if (objM377 != Primitive.VOID && objM377 != Primitive.NULL) {
                    return objM377;
                }
                if (c0013.f535) {
                    break;
                }
            }
            if (z) {
                throw new C3581("Redundant to call .this on This type");
            }
            This thisMo313 = c0012.mo313(runnableC0008);
            C0012 c0012M349 = m349(thisMo313.getNameSpace());
            if (c0012M349 != null) {
                return m350(this.f513) ? c0012M349.mo313(runnableC0008) : c0012M349.m364();
            }
            return thisMo313;
        }
        if (str.equals("super")) {
            This thisMo312 = c0012.mo312(runnableC0008);
            C0012 nameSpace = thisMo312.getNameSpace();
            C0012 c0014 = nameSpace.f521;
            return (c0014 == null || !c0014.f535) ? thisMo312 : nameSpace.mo312(runnableC0008);
        }
        Object objM368 = str.equals("global") ? c0012.m368(runnableC0008) : null;
        if (objM368 == null && z) {
            if (str.equals("namespace")) {
                objM368 = c0012;
            } else if (str.equals("variables")) {
                objM368 = (String[]) c0012.f522.keySet().stream().toArray(new C0461(5));
            } else if (str.equals("methods")) {
                objM368 = (String[]) c0012.f523.keySet().stream().toArray(new C0461(7));
            } else if (str.equals("interpreter")) {
                if (!this.f514.equals("this")) {
                    throw new C3581("Can only call .interpreter on literal 'this'");
                }
                objM368 = runnableC0008;
            }
        }
        if (objM368 == null && z && str.equals("caller")) {
            if (!this.f514.equals("this") && !this.f514.equals("caller")) {
                throw new C3581("Can only call .caller on literal 'this' or literal '.caller'");
            }
            if (c0527 == null) {
                throw new C1684("no callstack");
            }
            int i = this.f516 + 1;
            this.f516 = i;
            Stack stack = c0527.f2221;
            int size = stack.size();
            return (i >= size ? C0012.f519 : ((C0012[]) stack.toArray(new C0012[size]))[(size - 1) - i]).mo313(runnableC0008);
        }
        if (objM368 == null && z && str.equals("callstack")) {
            if (!this.f514.equals("this")) {
                objM376 = c0527;
                throw new C3581("Can only call .callstack on literal 'this'");
            }
            if (c0527 == null) {
                throw new C1684("no callstack");
            }
        } else {
            objM376 = objM368;
        }
        if (objM376 == null) {
            objM376 = c0012.m376(str, this.f515 == null);
        }
        return objM376 == null ? Primitive.NULL : objM376;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final synchronized Class m358() {
        Class cls = this.f517;
        if (cls != null) {
            return cls;
        }
        String str = this.f512;
        this.f513 = str;
        Object objM360 = null;
        this.f515 = null;
        this.f516 = 0;
        if (!str.equals("var") && !this.f513.equals("val")) {
            Class clsM363 = this.f511.m363(this.f513);
            if (clsM363 == null) {
                try {
                    objM360 = m360(null, null, true);
                } catch (C3581 unused) {
                }
                if (objM360 instanceof C0699) {
                    clsM363 = ((C0699) objM360).f2676;
                }
            }
            if (clsM363 != null) {
                this.f517 = clsM363;
                return clsM363;
            }
            throw new ClassNotFoundException("Class: " + this.f512 + " not found in namespace");
        }
        this.f517 = null;
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final synchronized LHS m359(C0527 c0527, RunnableC0008 runnableC0008) {
        try {
            String str = this.f512;
            this.f513 = str;
            Object objM355 = null;
            this.f515 = null;
            this.f516 = 0;
            if (!m350(str)) {
                if (this.f513.equals("this")) {
                    throw new C3581("Can't assign to 'this'.");
                }
                C0012 c0012 = this.f511;
                return c0012.f535 ? new LHS(c0012, this.f513) : new LHS(c0012, this.f513, false);
            }
            while (true) {
                try {
                    String str2 = this.f513;
                    if (str2 == null || !m350(str2)) {
                        break;
                    }
                    objM355 = m355(c0527, runnableC0008, false, true);
                } catch (C3581 e) {
                    throw new C3581("LHS evaluation: " + e.getMessage(), e);
                }
            }
            String str3 = this.f513;
            if (str3 == null && (objM355 instanceof C0699)) {
                throw new C3581("Can't assign to class: " + this.f512);
            }
            if (objM355 == null) {
                throw new C3581("Error in LHS: " + this.f512);
            }
            if (!(objM355 instanceof This)) {
                if (str3 == null) {
                    throw new C1684("Internal error in lhs...");
                }
                try {
                    if (objM355 instanceof C0699) {
                        return AbstractC0016.m533(((C0699) objM355).f2676, str3);
                    }
                    return AbstractC0016.m532(objM355, str3);
                } catch (C2573 unused) {
                    return new LHS(objM355, this.f513);
                }
            }
            if (!str3.equals("namespace") && !this.f513.equals("variables") && !this.f513.equals("methods") && !this.f513.equals("caller")) {
                RunnableC0008.m333("found This reference evaluating LHS");
                return new LHS(((This) objM355).namespace, this.f513, !this.f514.equals("super"));
            }
            throw new C3581("Can't assign to special variable: " + this.f513);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final synchronized Object m360(C0527 c0527, RunnableC0008 runnableC0008, boolean z) {
        Object objM355;
        this.f513 = this.f512;
        objM355 = null;
        this.f515 = null;
        this.f516 = 0;
        while (this.f513 != null) {
            objM355 = m355(c0527, runnableC0008, z, false);
        }
        if (objM355 == null) {
            throw new C1684("null value in toObject()");
        }
        return objM355;
    }
}
