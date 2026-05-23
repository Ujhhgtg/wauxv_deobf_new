package p000;

import bsh.AbstractC0009;
import bsh.AbstractC0010;
import bsh.C0007;
import bsh.Primitive;
import bsh.This;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0501 implements Serializable, Cloneable, InterfaceC0480 {

    public C0007 f2147;

    public C2000 f2148;

    public final String f2149;

    public Class f2150;

    public String[] f2151;

    public final int f2152;

    public final Class[] f2153;

    public C2000[] f2154;

    public final C0333 f2155;

    public final AbstractC1672 f2156;

    public final Object f2157;

    public final transient InterfaceC0500 f2158;

    public final boolean f2159;

    public boolean f2160;

    public boolean f2161;

    public C0501(String str, Class cls, String[] strArr, Class[] clsArr, C2000[] c2000Arr, C0333 c0333, C0007 c0007, C2000 c2000, boolean z) {
        this.f2160 = false;
        this.f2161 = false;
        this.f2149 = str;
        this.f2150 = cls;
        this.f2151 = strArr;
        this.f2154 = c2000Arr;
        if (strArr != null) {
            this.f2152 = strArr.length;
        } else if (clsArr != null) {
            this.f2152 = clsArr.length;
        }
        this.f2153 = clsArr;
        this.f2155 = c0333;
        this.f2147 = c0007;
        this.f2148 = c2000;
        this.f2159 = z;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj.getClass() == getClass()) {
                    C0501 c0501 = (C0501) obj;
                    if (this.f2149.equals(c0501.f2149) && m1749() == c0501.m1749()) {
                        for (int i = 0; i < m1749(); i++) {
                            Class cls = mo1751()[i];
                            Class cls2 = c0501.mo1751()[i];
                            if (cls == null ? cls2 == null : cls.equals(cls2)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = getClass().hashCode() + this.f2149.hashCode();
        Class[] clsArrMo1751 = mo1751();
        int length = clsArrMo1751.length;
        for (int i = 0; i < length; i++) {
            Class cls = clsArrMo1751[i];
            iHashCode += (cls == null ? 0 : cls.hashCode()) + 3;
        }
        return m1749() + iHashCode;
    }

    public final String toString() {
        return "Method: " + AbstractC2202.m4010(this);
    }

    public final C0501 clone() {
        try {
            return (C0501) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // p000.InterfaceC0480
    public final void mo343() {
        this.f2161 = AbstractC0009.m401(this.f2150) || Arrays.asList(this.f2153).stream().anyMatch(new C0335(3));
    }

    public final C2000 m1747() {
        if (this.f2148 == null) {
            this.f2148 = new C2000(2);
        }
        return this.f2148;
    }

    public final String m1748() {
        AbstractC1672 abstractC1672 = this.f2156;
        return abstractC1672 == null ? this.f2149 : abstractC1672.f5644;
    }

    public final int m1749() {
        AbstractC1672 abstractC1672 = this.f2156;
        return abstractC1672 == null ? this.f2152 : abstractC1672.mo2889();
    }

    public final String[] m1750() {
        if (this.f2151 == null) {
            this.f2151 = (String[]) IntStream.range(97, m1749() + 97).boxed().map(new C0268(5)).toArray(new C0484(2));
        }
        return this.f2151;
    }

    public Class[] mo1751() {
        AbstractC1672 abstractC1672 = this.f2156;
        if (abstractC1672 != null) {
            return abstractC1672.mo2890();
        }
        m1756();
        return this.f2153;
    }

    public Class mo1752() {
        AbstractC1672 abstractC1672 = this.f2156;
        if (abstractC1672 != null) {
            return abstractC1672.mo2346();
        }
        m1756();
        return this.f2150;
    }

    public final boolean m1753(String str) {
        AbstractC1672 abstractC1672 = this.f2156;
        if (abstractC1672 == null) {
            C2000 c2000 = this.f2148;
            return c2000 != null && c2000.m3864(str);
        }
        int i = abstractC1672.f5645;
        Object[] objArr = AbstractC0009.f516;
        return Modifier.toString(i).contains(str);
    }

    public final Object m1754(Object[] objArr, RunnableC1668 runnableC1668, C0550 c0550, InterfaceC2225 interfaceC2225, boolean z) {
        Object objM345;
        Object objM1755;
        RunnableC1668.m3389("Bsh method invoke: ", this.f2149, " overrideNameSpace: ", Boolean.valueOf(z));
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj == null) {
                    throw new Error("HERE!");
                }
            }
        }
        InterfaceC0500 interfaceC0500 = this.f2158;
        if (interfaceC0500 != null) {
            if (objArr == null) {
                objArr = AbstractC0009.f516;
            }
            Class[] clsArrMo1751 = mo1751();
            if (clsArrMo1751 == null || clsArrMo1751.length == 0) {
                return interfaceC0500.mo1745(objArr);
            }
            String[] strArrM1750 = m1750();
            for (int i = 0; i < objArr.length; i++) {
                Class cls = clsArrMo1751[i];
                if (cls != null) {
                    try {
                        objArr[i] = Primitive.unwrap(AbstractC0010.m414(1, cls, objArr[i]));
                    } catch (C3523 e) {
                        throw new C1229("Invalid argument: `" + strArrM1750[i] + "' for method: " + this.f2149 + " : " + e.getMessage(), interfaceC2225, c0550);
                    }
                }
            }
            return interfaceC0500.mo1745(objArr);
        }
        AbstractC1672 abstractC1672 = this.f2156;
        if (abstractC1672 == null) {
            C2000 c2000 = this.f2148;
            if (c2000 == null || !c2000.m3864("synchronized")) {
                return m1755(objArr, runnableC1668, c0550, interfaceC2225, z);
            }
            C0007 c0007 = this.f2147;
            if (c0007.f508) {
                try {
                    objM345 = c0007.m345();
                } catch (C3523 unused) {
                    throw new C1669("Can't get class instance for synchronized method.");
                }
            } else {
                objM345 = c0007.mo310(runnableC1668);
            }
            synchronized (objM345) {
                objM1755 = m1755(objArr, runnableC1668, c0550, interfaceC2225, z);
            }
            return objM1755;
        }
        try {
            Object[] objArr2 = AbstractC0009.f516;
            if (Modifier.isStatic(abstractC1672.getModifiers())) {
                C1883 c1883 = RunnableC1668.f5631;
                AbstractC1672 abstractC1673 = this.f2156;
                c1883.m3667(abstractC1673.f5646, abstractC1673.f5644, objArr);
            } else {
                RunnableC1668.f5631.m3666(this.f2157, this.f2156.f5644, objArr);
            }
            return this.f2156.mo3012(this.f2157, objArr);
        } catch (InvocationTargetException e2) {
            throw new C2895("Exception invoking imported object method.", e2, interfaceC2225, c0550, true);
        } catch (C2518 e3) {
            throw new C1229("Error invoking Java method: " + e3, interfaceC2225, c0550);
        } catch (C3523 e4) {
            throw e4.mo4643(interfaceC2225, c0550);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    public final Object m1755(Object[] objArr, RunnableC1668 runnableC1668, C0550 c0550, InterfaceC2225 interfaceC2225, boolean z) throws C1229 {
        C0007 c0007;
        Object objNewInstance;
        C2588 c2588;
        This thisM381;
        Object obj;
        C0550 c0551 = c0550;
        InterfaceC2225 interfaceC2226 = interfaceC2225;
        boolean zM1753 = m1753("abstract");
        String str = this.f2149;
        if (zM1753) {
            throw new C1229(AbstractC2784.m4757("Cannot invoke abstract method ", str), interfaceC2226, c0551);
        }
        Class clsMo1752 = mo1752();
        Class<?>[] clsArrMo1751 = mo1751();
        if (c0551 == null) {
            c0551 = new C0550(this.f2147);
        }
        C0550 c0552 = c0551;
        Object[] objArr2 = objArr == null ? AbstractC0009.f516 : objArr;
        boolean zMo2892 = this.f2159;
        AbstractC1672 abstractC1672 = this.f2156;
        if (!(abstractC1672 == null ? zMo2892 : abstractC1672.mo2892()) && objArr2.length != m1749()) {
            throw new C1229(AbstractC2784.m4757("Wrong number of arguments for local method: ", str), interfaceC2226, c0552);
        }
        int i = 1;
        if (z) {
            c0007 = c0552.m1929();
        } else {
            c0007 = new C0007(this.f2147, null, str);
            c0007.f507 = true;
        }
        c0007.f506 = interfaceC2226;
        int iM1749 = m1749() - 1;
        if (abstractC1672 != null) {
            zMo2892 = abstractC1672.mo2892();
        }
        if (zMo2892) {
            Class<?> cls = clsArrMo1751[iM1749];
            if (!(m1749() == objArr2.length && ((obj = objArr2[iM1749]) == null || (obj.getClass().isArray() && cls.getComponentType().isAssignableFrom(objArr2[iM1749].getClass().getComponentType())))) && objArr2.length >= m1749() - 1) {
                objNewInstance = Array.newInstance(clsArrMo1751[iM1749].getComponentType(), objArr2.length - iM1749);
            } else {
                objNewInstance = null;
            }
        } else {
            objNewInstance = null;
        }
        int i2 = 0;
        while (i2 < objArr2.length) {
            int i3 = i2 >= iM1749 ? iM1749 : i2;
            Class<?> componentType = (objNewInstance == null || i3 != iM1749) ? clsArrMo1751[i3] : clsArrMo1751[i3].getComponentType();
            if (componentType != null) {
                try {
                    Object objM414 = AbstractC0010.m414(1, componentType, objArr2[i2]);
                    objArr2[i2] = objM414;
                    if (objNewInstance == null || i2 < iM1749) {
                        c0007.m367(this.f2151[i3], componentType, objM414, this.f2154[i3]);
                    } else {
                        try {
                            Array.set(objNewInstance, i2 - i3, Primitive.unwrap(objM414));
                        } catch (C3523 e) {
                            throw e.mo4644("Typed method parameter assignment", interfaceC2226, c0552);
                        }
                    }
                } catch (C3523 e2) {
                    throw new C1229("Invalid argument: `" + this.f2151[i3] + "' for method: " + str + " : " + e2.getMessage(), interfaceC2226, c0552);
                }
            } else {
                objArr2 = objArr2;
                Object obj2 = objArr2[i2];
                if (obj2 == Primitive.VOID) {
                    throw new C1229("Undefined variable or class name, parameter: " + this.f2151[i3] + " to method: " + str, interfaceC2226, c0552);
                }
                try {
                    String str2 = this.f2151[i3];
                    
                    c0007.mo314(str2, obj2, false);
                } catch (C3523 e3) {
                    throw e3.mo4644("Typed method parameter assignment", interfaceC2226, c0552);
                }
            }
            i2++;
            objArr2 = objArr2;
            i = 1;
        }
        if (objNewInstance != null) {
            try {
                c0007.m367(this.f2151[iM1749], clsArrMo1751[iM1749], objNewInstance, this.f2154[iM1749]);
            } catch (C3523 e4) {
                throw e4.mo4644("Typed method parameter assignment", interfaceC2226, c0552);
            }
        }
        if (!z) {
            c0552.m1927(c0007);
        }
        try {
            Object objM1448 = this.f2155.m1448(c0552, runnableC1668, Boolean.TRUE);
            C0550 c0553 = new C0550();
            c0553.f2265.addAll(c0552.f2265);
            if (!z) {
                c0552.m1926();
            }
            boolean z2 = objM1448 instanceof C2588;
            Class cls2 = Void.TYPE;
            if (z2) {
                c2588 = (C2588) objM1448;
                C0351 c0351 = c2588.f8197;
                if (c2588.f8194 != 49) {
                    throw new C1230("'continue' or 'break' in method body", c0351, c0553);
                }
                Object obj3 = c2588.f8196;
                if (clsMo1752 == cls2 && obj3 != Primitive.VOID) {
                    throw new C1230("Cannot return value from void method", c0351, c0553);
                }
                objM1448 = obj3;
            } else {
                c2588 = null;
            }
            if (clsMo1752 != null) {
                if (clsMo1752 == cls2) {
                    return Primitive.VOID;
                }
                try {
                    objM1448 = AbstractC0010.m414(1, clsMo1752, objM1448);
                } catch (C3523 e5) {
                    if (c2588 != null) {
                        interfaceC2226 = c2588.f8197;
                    }
                    throw e5.mo4644("Incorrect type returned from method: " + str + e5.getMessage(), interfaceC2226, c0552);
                }
            }
            return (!"clone".equals(m1748()) || (thisM381 = AbstractC0009.m381(objM1448, objM1448.getClass().getSimpleName())) == null) ? objM1448 : thisM381.cloneMethodImpl(interfaceC2226, c0552, objM1448);
        } catch (Throwable th) {
            if (!z) {
                c0552.m1926();
            }
            throw th;
        }
    }

    public final void m1756() {
        Class[] clsArr = this.f2153;
        if (this.f2161) {
            try {
                this.f2161 = false;
                if (AbstractC0009.m401(this.f2150)) {
                    this.f2150 = this.f2147.m344(this.f2150.getName());
                }
                for (int i = 0; i < clsArr.length; i++) {
                    if (AbstractC0009.m401(clsArr[i])) {
                        clsArr[i] = this.f2147.m344(clsArr[i].getName());
                    }
                }
            } catch (C3523 unused) {
            }
        }
    }

    public C0501(AbstractC1672 abstractC1672, Object obj) {
        this(abstractC1672.f5644, abstractC1672.mo2346(), null, abstractC1672.mo2890(), null, null, null, null, abstractC1672.mo2892());
        this.f2156 = abstractC1672;
        this.f2157 = obj;
    }

    public C0501(String str, Class[] clsArr, InterfaceC0500 interfaceC0500) {
        this(str, null, null, clsArr, null, null, null, null, false);
        this.f2158 = interfaceC0500;
    }
}
