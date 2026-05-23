package bsh;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC1672;
import p000.AbstractC2202;
import p000.AbstractC2668;
import p000.AbstractC2784;
import p000.C0268;
import p000.C0482;
import p000.C0484;
import p000.C0501;
import p000.C0550;
import p000.C1229;
import p000.C1230;
import p000.C1326;
import p000.C1669;
import p000.C1751;
import p000.C2000;
import p000.C2518;
import p000.C3523;
import p000.C3532;
import p000.InterfaceC0480;
import p000.InterfaceC2225;
import p000.RunnableC1668;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0007 implements Serializable, InterfaceC0480, Cloneable {

    public static final C0007 f492;

    public final String f493;

    public C0007 f494;

    public HashMap f495 = new HashMap();

    public HashMap f496 = new HashMap();

    public HashMap f497 = new HashMap();

    public ArrayList f498 = new ArrayList();

    public ArrayList f499 = new ArrayList();

    public ArrayList f500 = new ArrayList();

    public ArrayList f501 = new ArrayList();

    public String f502;

    public transient C0482 f503;

    public This f504;

    public HashMap f505;

    public InterfaceC2225 f506;

    public boolean f507;

    public boolean f508;

    public boolean f509;

    public boolean f510;

    public Class f511;

    public Object f512;

    public final transient HashMap f513;

    static {
        C0007 c0007 = new C0007(null, null, "Called from compiled Java code.");
        f492 = c0007;
        c0007.f507 = true;
    }

    public C0007(C0007 c0007, C0482 c0482, String str) {
        new ArrayList();
        this.f505 = new HashMap();
        this.f513 = new HashMap();
        this.f493 = str;
        this.f494 = c0007;
        if (c0007 == null) {
            m363();
        }
        this.f503 = c0482;
        m346().mo296(this);
    }

    public static C3532 m340(Object obj, String str) {
        return new C3532(str, null, obj, null);
    }

    public static Object m341(C3532 c3532) {
        return c3532 == null ? Primitive.VOID : c3532.m5124();
    }

    public final void clear() {
        this.f495.clear();
        this.f496.clear();
        this.f497.clear();
        this.f498.clear();
        this.f499.clear();
        this.f500.clear();
        if (this.f494 == null) {
            m363();
        }
        this.f513.clear();
        this.f505.clear();
    }

    public final String toString() {
        String strM4752;
        StringBuilder sb = new StringBuilder("NameSpace: ");
        if (this.f493 == null) {
            strM4752 = super.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f493);
            sb2.append(" (");
            strM4752 = AbstractC2784.m4752(sb2, super.toString(), ")");
        }
        sb.append(strM4752);
        sb.append(this.f508 ? " (class) " : "");
        sb.append(this.f509 ? " (interface) " : "");
        sb.append(this.f510 ? " (enum) " : "");
        sb.append(this.f507 ? " (method) " : "");
        sb.append(this.f511 != null ? " (class static) " : "");
        sb.append(this.f512 != null ? " (class instance) " : "");
        return sb.toString();
    }

    public final C0007 m342() {
        try {
            C0007 c0007 = (C0007) clone();
            HashMap map = null;
            c0007.f504 = null;
            HashMap map2 = this.f495;
            c0007.f495 = map2 == null ? null : new HashMap(map2);
            HashMap map3 = this.f496;
            c0007.f496 = map3 == null ? null : new HashMap(map3);
            HashMap map4 = this.f497;
            c0007.f497 = map4 == null ? null : new HashMap(map4);
            ArrayList arrayList = this.f498;
            c0007.f498 = arrayList == null ? null : new ArrayList(arrayList);
            ArrayList arrayList2 = this.f499;
            c0007.f499 = arrayList2 == null ? null : new ArrayList(arrayList2);
            ArrayList arrayList3 = this.f500;
            c0007.f500 = arrayList3 == null ? null : new ArrayList(arrayList3);
            ArrayList arrayList4 = this.f501;
            c0007.f501 = arrayList4 == null ? null : new ArrayList(arrayList4);
            HashMap map5 = this.f505;
            if (map5 != null) {
                map = new HashMap(map5);
            }
            c0007.f505 = map;
            return c0007;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // p000.InterfaceC0480
    public final void mo343() {
        m365();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d A[EDGE_INSN: B:18:0x004d->B:30:0x0098 BREAK  A[LOOP:1: B:20:0x0055->B:65:?]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0107 A[RETURN] */
    public final Class m344(String str) {
        Class clsMo297;
        String strMo301;
        Class clsMo298;
        Class<?> clsLoadClass;
        HashMap map = this.f513;
        if (map.containsKey(str)) {
            clsMo297 = (Class) map.get(str);
        } else if (C0006.m329(str)) {
            clsMo297 = m346().mo297(str);
            if (clsMo297 == null) {
                RunnableC1668.m3389("getClass(): ", str, " not found in ", this);
                clsMo297 = null;
            }
        } else {
            String str2 = (String) this.f497.get(str);
            if (str2 == null) {
                Iterator it = this.f498.iterator();
                do {
                    if (!it.hasNext()) {
                        C0482 c0482M346 = m346();
                        if (c0482M346.mo303() && (strMo301 = c0482M346.mo301(str)) != null) {
                            clsMo298 = m346().mo297(strMo301);
                            break;
                        }
                        clsMo298 = null;
                        break;
                    }
                    clsMo298 = m346().mo297(((String) it.next()) + "." + str);
                } while (clsMo298 == null);
            } else {
                clsMo298 = m346().mo297(str2);
                if (clsMo298 == null) {
                    if (C0006.m329(str2)) {
                        try {
                            clsMo298 = m352(str2).m337();
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    RunnableC1668.m3389("imported unpackaged name not found:", str2);
                    if (clsMo298 == null) {
                        clsMo298 = null;
                        break;
                    }
                    m346().m1722(clsMo298, str2);
                }
            }
            Class clsMo299 = clsMo298 == null ? m346().mo297(str) : clsMo298;
            if (clsMo299 != null) {
                map.put(str, clsMo299);
                clsMo297 = clsMo299;
            } else {
                clsMo297 = m346().mo297(str);
                if (clsMo297 == null) {
                    RunnableC1668.m3389("getClass(): ", str, " not found in ", this);
                    clsMo297 = null;
                }
            }
        }
        if (clsMo297 != null) {
            return clsMo297;
        }
        C0007 c0007 = this.f494;
        if (c0007 != null) {
            return c0007.m344(str);
        }
        Iterator it2 = ((HashSet) this.f503.f2095.f1049).iterator();
        while (it2.hasNext()) {
            try {
                clsLoadClass = ((ClassLoader) it2.next()).loadClass(str);
                if (clsLoadClass != null) {
                    return clsLoadClass;
                }
                return null;
            } catch (ClassNotFoundException unused2) {
            }
        }
        System.err.println("[BeanShell] GetLoaderClass: " + str + " is null");
        clsLoadClass = null;
        if (false) {
            return clsLoadClass;
        }
        return null;
    }

    public final Object m345() throws C3523 {
        Object obj = this.f512;
        if (obj != null) {
            return obj;
        }
        if (this.f511 != null) {
            throw new C3523("Can't refer to class instance from static context.");
        }
        throw new C1669("Can't resolve class instance 'this' in: " + this);
    }

    public final C0482 m346() {
        C0482 c0482 = this.f503;
        if (c0482 != null) {
            return c0482;
        }
        C0007 c0007 = this.f494;
        if (c0007 != null && c0007 != f492) {
            return c0007.m346();
        }
        C0482 c0482M1721 = C0482.m1721(null);
        this.f503 = c0482M1721;
        return c0482M1721;
    }

    public final Object m347(String str, Class[] clsArr, RunnableC1668 runnableC1668) {
        String str2;
        Class[] clsArr2;
        RunnableC1668 runnableC1669;
        String strM4752;
        RunnableC1668.m3389("Get command: ", str);
        C0482 c0482M346 = runnableC1668.f5634.m346();
        for (String str3 : this.f499) {
            String str4 = str3.equals("/") ? "/" + str + ".bsh" : str3 + "/" + str + ".bsh";
            RunnableC1668.m3389(AbstractC2784.m4757("searching for script: ", str4));
            URL urlMo302 = c0482M346.mo302(str4);
            if (urlMo302 != null) {
                try {
                    str2 = str;
                    clsArr2 = clsArr;
                    runnableC1669 = runnableC1668;
                    try {
                        return m364((InputStream) urlMo302.getContent(), str2, clsArr2, str4, runnableC1669);
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    str2 = str;
                    clsArr2 = clsArr;
                    runnableC1669 = runnableC1668;
                }
            } else {
                str2 = str;
                clsArr2 = clsArr;
                runnableC1669 = runnableC1668;
            }
            if (str3.equals("/")) {
                strM4752 = str2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str3.substring(1).replace('/', '.'));
                strM4752 = AbstractC2784.m4752(sb, ".", str2);
            }
            RunnableC1668.m3389(AbstractC2784.m4757("searching for class: ", strM4752));
            Class clsMo297 = c0482M346.mo297(strM4752);
            if (clsMo297 != null) {
                return clsMo297;
            }
            str = str2;
            clsArr = clsArr2;
            runnableC1668 = runnableC1669;
        }
        String str5 = str;
        Class[] clsArr3 = clsArr;
        RunnableC1668 runnableC16610 = runnableC1668;
        C0007 c0007 = this.f494;
        if (c0007 != null) {
            return c0007.m347(str5, clsArr3, runnableC16610);
        }
        return null;
    }

    public final This m348(RunnableC1668 runnableC1668) {
        C0007 c0007 = this.f494;
        return c0007 != null ? c0007.m348(runnableC1668) : mo310(runnableC1668);
    }

    public final C0501 m349(String str, Class[] clsArr) {
        for (Object obj : this.f500) {
            AbstractC1672 abstractC1672M406 = AbstractC0009.m406(obj.getClass(), str, clsArr, false);
            if (abstractC1672M406 != null) {
                return new C0501(abstractC1672M406, obj);
            }
        }
        Iterator it = this.f501.iterator();
        while (it.hasNext()) {
            AbstractC1672 abstractC1672M407 = AbstractC0009.m406((Class) it.next(), str, clsArr, true);
            if (abstractC1672M407 != null) {
                return new C0501(abstractC1672M407, null);
            }
        }
        return null;
    }

    public final C0501 m350(String str, Class[] clsArr, boolean z) {
        C0007 c0007;
        RunnableC1668.m3389("Get method: ", str, " ", this);
        C0501 c0501M349 = (!this.f508 || this.f510 || z) ? null : m349(str, clsArr);
        if (c0501M349 == null && this.f496.containsKey(str)) {
            List list = (List) this.f496.get(str);
            Object[] objArr = AbstractC0009.f516;
            RunnableC1668.m3389("find most specific BshMethod for: " + Arrays.toString(clsArr));
            int iM378 = AbstractC0009.m378(clsArr, list);
            c0501M349 = iM378 != -1 ? (C0501) list.get(iM378) : null;
        }
        if (c0501M349 == null && !this.f508 && !z) {
            c0501M349 = m349(str, clsArr);
        }
        return (c0501M349 != null || z || (c0007 = this.f494) == null) ? c0501M349 : c0007.m350(str, clsArr, false);
    }

    public final C0501[] m351() {
        return (C0501[]) this.f496.values().stream().flatMap(new C0268(16)).toArray(new C0484(6));
    }

    public final C0006 m352(String str) {
        if (!this.f505.containsKey(str)) {
            HashMap map = this.f505;
            C0006 c0006 = new C0006();
            c0006.f484 = this;
            c0006.f485 = str;
            map.put(str, c0006);
        }
        return (C0006) this.f505.get(str);
    }

    public final InterfaceC2225 m353() {
        InterfaceC2225 interfaceC2225 = this.f506;
        if (interfaceC2225 != null) {
            return interfaceC2225;
        }
        C0007 c0007 = this.f494;
        if (c0007 != null) {
            return c0007.m353();
        }
        return null;
    }

    public final String m354() {
        String str = this.f502;
        if (str != null) {
            return str;
        }
        C0007 c0007 = this.f494;
        if (c0007 != null) {
            return c0007.m354();
        }
        return null;
    }

    public final Object m355(String str, RunnableC1668 runnableC1668) throws C3523 {
        String strM376 = AbstractC0009.m376("get", str);
        Class[] clsArr = AbstractC0009.f517;
        C0501 c0501M350 = m350(strM376, clsArr, false);
        try {
            if (c0501M350 != null) {
                return c0501M350.m1754(null, runnableC1668, null, null, false);
            }
            C0501 c0501M351 = m350(AbstractC0009.m376("is", str), clsArr, false);
            return (c0501M351 == null || c0501M351.mo1752() != Boolean.TYPE) ? Primitive.VOID : c0501M351.m1754(null, runnableC1668, null, null, false);
        } catch (C1229 e) {
            throw new C3523("'This' property accessor threw exception: " + e.getMessage(), e);
        }
    }

    public This mo309(RunnableC1668 runnableC1668) {
        Class cls;
        if (this.f508 && (cls = this.f511) != null) {
            Class superclass = cls.getSuperclass();
            if (AbstractC0009.m401(superclass)) {
                return AbstractC0009.m381(this.f512, superclass.getSimpleName());
            }
        }
        C0007 c0007 = this.f494;
        if (c0007 != null) {
            return c0007.f508 ? c0007.mo309(runnableC1668) : c0007.mo310(runnableC1668);
        }
        return mo310(runnableC1668);
    }

    public This mo310(RunnableC1668 runnableC1668) {
        if (this.f504 == null) {
            this.f504 = This.getThis(this, runnableC1668);
        }
        return this.f504;
    }

    public final Object m356(String str, boolean z) {
        C3532 c3532M357 = m357(str, z);
        RunnableC1668.m3389("Get variable: ", str, " = ", c3532M357);
        return m341(c3532M357);
    }

    public final C3532 m357(String str, boolean z) {
        AbstractC1672 abstractC1672M404;
        C0007 c0007;
        AbstractC1672 abstractC1672M405;
        This thisM381;
        if (this.f495.containsKey(str)) {
            return (C3532) this.f495.get(str);
        }
        Iterator it = this.f500.iterator();
        C3532 c3532 = null;
        C3532 c3533 = null;
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = this.f501.iterator();
                while (it2.hasNext()) {
                    try {
                        abstractC1672M404 = AbstractC0009.m404((Class) it2.next(), str, true);
                    } catch (C2518 unused) {
                        abstractC1672M404 = null;
                    }
                    if (abstractC1672M404 != null) {
                        c3533 = new C3532(str, abstractC1672M404.mo2346(), new C1751(abstractC1672M404));
                        this.f495.put(str, c3533);
                    }
                }
                break;
            }
            Object next = it.next();
            try {
                abstractC1672M405 = AbstractC0009.m404(next.getClass(), str, false);
            } catch (C2518 unused2) {
                abstractC1672M405 = null;
            }
            if (abstractC1672M405 != null) {
                c3533 = new C3532(str, abstractC1672M405.mo2346(), new C1751(abstractC1672M405, next));
            } else if (this.f508) {
                Class<?> superclass = next.getClass();
                while (true) {
                    superclass = superclass.getSuperclass();
                    if (!AbstractC0009.m401(superclass) || ((thisM381 = AbstractC0009.m381(next, superclass.getSimpleName())) != null && (c3533 = (C3532) thisM381.getNameSpace().f495.get(str)) != null)) {
                        break;
                    }
                }
            }
            if (c3533 != null) {
                this.f495.put(str, c3533);
            }
            c3532 = c3533;
            break;
        }
        return (z && c3532 == null && (c0007 = this.f494) != null) ? c0007.m357(str, true) : c3532;
    }

    public final C3532[] m358() {
        return (C3532[]) this.f495.values().stream().toArray(new C0484(4));
    }

    public void mo311(String str) {
        this.f497.put(C0006.m331(1, str), str);
        m365();
    }

    public void mo312(String str) {
        this.f498.remove(str);
        this.f498.add(0, str);
        m365();
    }

    public final void m359(Class cls) {
        this.f501.remove(cls);
        this.f501.add(0, cls);
        m365();
    }

    public final Object m360(String str, Object[] objArr, RunnableC1668 runnableC1668, C0550 c0550, InterfaceC2225 interfaceC2225, boolean z) throws C1229 {
        String str2;
        C0550 c0551;
        InterfaceC2225 interfaceC2226;
        Class[] clsArrM420 = AbstractC0010.m420(objArr);
        try {
            Object objM347 = m347(str, clsArrM420, runnableC1668);
            if (objM347 != null) {
                if (objM347 instanceof C0501) {
                    return ((C0501) objM347).m1754(objArr, runnableC1668, c0550, interfaceC2225, false);
                }
                try {
                    return AbstractC0009.m398((Class) objM347, objArr, runnableC1668, c0550, interfaceC2225);
                } catch (C3523 e) {
                    throw e.mo4644("Error invoking compiled command: ", interfaceC2225, c0550);
                }
            }
            if (z) {
                str2 = str;
                c0551 = c0550;
                interfaceC2226 = interfaceC2225;
            } else {
                boolean[] zArr = new boolean[1];
                str2 = str;
                Object objM361 = m361(str2, objArr, runnableC1668, c0550, interfaceC2225, zArr);
                c0551 = c0550;
                interfaceC2226 = interfaceC2225;
                if (zArr[0]) {
                    return objM361;
                }
            }
            throw new C1230("Command not found: " + AbstractC2202.m4011(str2, clsArrM420), interfaceC2226, c0551);
        } catch (C3523 e2) {
            throw e2.mo4644("Error loading command: ", interfaceC2225, c0550);
        }
    }

    public final Object m361(String str, Object[] objArr, RunnableC1668 runnableC1668, C0550 c0550, InterfaceC2225 interfaceC2225, boolean[] zArr) {
        try {
            C0501 c0501M350 = m350("invoke", new Class[]{null, null}, false);
            boolean z = c0501M350 != null;
            zArr[0] = z;
            if (z) {
                return c0501M350.m1754(new Object[]{str, objArr}, runnableC1668, c0550, interfaceC2225, false);
            }
            return null;
        } catch (C3523 e) {
            throw e.mo4644("Local method invocation", interfaceC2225, c0550);
        }
    }

    public final boolean m362(C0007 c0007) {
        C0007 c0008 = this.f494;
        if (c0008 != null) {
            return c0008.equals(c0007) || this.f494.m362(c0007);
        }
        return false;
    }

    public final void m363() {
        mo312("org.json");
        mo312("java.util.stream");
        mo312("java.util.regex");
        mo312("java.util.function");
        mo312("java.util");
        mo312("java.net");
        mo312("java.math");
        mo312("java.lang");
        mo312("java.io");
        mo312("android.widget");
        mo312("android.view");
        mo312("android.text");
        mo312("android.os");
        mo312("android.graphics");
        mo312("android.content");
        mo312("android.app");
        String strReplace = "/bsh/commands".replace('.', '/');
        if (!strReplace.startsWith("/")) {
            strReplace = "/".concat(strReplace);
        }
        if (strReplace.length() > 1 && strReplace.endsWith("/")) {
            strReplace = AbstractC2784.m4744(1, 0, strReplace);
        }
        this.f499.remove(strReplace);
        this.f499.add(0, strReplace);
        m365();
    }

    public final C0501 m364(InputStream inputStream, String str, Class[] clsArr, String str2, RunnableC1668 runnableC1668) throws C3523 {
        try {
            C1326 c1326 = new C1326(inputStream);
            try {
                runnableC1668.m3391(c1326, this, str2);
                c1326.close();
                return m350(str, clsArr, false);
            } catch (Throwable th) {
                try {
                    c1326.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | C1229 e) {
            RunnableC1668.m3389(e.toString());
            throw new C3523("Error loading script: " + e.getMessage(), e);
        }
    }

    public final void m365() {
        this.f513.clear();
        this.f505.clear();
    }

    public final void m366(Object obj) {
        this.f512 = obj;
        this.f500.remove(obj);
        this.f500.add(0, obj);
        m365();
    }

    public void mo313(C0501 c0501) {
        String strM1748 = c0501.m1748();
        if (!this.f496.containsKey(strM1748)) {
            this.f496.put(strM1748, new ArrayList(1));
        }
        ((List) this.f496.get(strM1748)).remove(c0501);
        ((List) this.f496.get(strM1748)).add(0, c0501);
    }

    public final void m367(String str, Class cls, Object obj, C2000 c2000) {
        Class cls2;
        C3532 c3532M357 = m357(str, false);
        if (c3532M357 == null || (cls2 = c3532M357.f11061) == null) {
            this.f495.put(str, new C3532(str, cls, obj, c2000));
            return;
        }
        if (cls2 != cls) {
            StringBuilder sbM4679 = AbstractC2668.m4679("Typed variable: ", str, " was previously declared with type: ");
            sbM4679.append(c3532M357.f11061);
            throw new C3523(sbM4679.toString());
        }
        if (c3532M357.f11064 == null) {
            c3532M357.f11064 = c2000;
        }
        c3532M357.m5126(0, obj);
    }

    public C3532 mo314(String str, Object obj, boolean z) {
        if (obj == null) {
            obj = Primitive.NULL;
        }
        C3532 c3532M357 = m357(str, z);
        if (c3532M357 != null) {
            c3532M357.m5126(1, obj);
            return c3532M357;
        }
        C3532 c3532M340 = m340(obj, str);
        this.f495.put(str, c3532M340);
        m365();
        return c3532M340;
    }

    public final void m368(C3532 c3532) {
        if (this.f495.containsKey(c3532.f11060)) {
            return;
        }
        this.f495.put(c3532.f11060, c3532);
    }

    public final void m369(String str, Object obj, boolean z, boolean z2) throws C3523 {
        if (obj == null) {
            throw new C1669("null variable value");
        }
        C3532 c3532M357 = m357(str, z2);
        if (c3532M357 != null) {
            try {
                c3532M357.m5126(1, obj);
                return;
            } catch (C3523 e) {
                StringBuilder sbM4679 = AbstractC2668.m4679("Variable assignment: ", str, ": ");
                sbM4679.append(e.getMessage());
                throw new C3523(sbM4679.toString(), e);
            }
        }
        if (z) {
            throw new C3523(AbstractC2784.m4757("(Strict Java mode) Assignment to undeclared variable: ", str));
        }
        This r10 = this.f504;
        RunnableC1668 runnableC1668 = r10 != null ? r10.declaringInterpreter : null;
        String strM376 = AbstractC0009.m376("set", str);
        Object objUnwrap = Primitive.unwrap(obj);
        if (m350(strM376, new Class[]{objUnwrap != null ? objUnwrap.getClass() : null}, false) == null) {
            this.f495.put(str, m340(obj, str));
            m365();
            return;
        }
        try {
            mo310(runnableC1668).invokeMethod(strM376, new Object[]{obj}, runnableC1668, null, null, false);
        } catch (C1229 e2) {
            throw new C3523("'This' property accessor threw exception: " + e2.getMessage(), e2);
        }
    }
}
