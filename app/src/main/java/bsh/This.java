package bsh;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import p000.AbstractC2202;
import p000.AbstractC2668;
import p000.AbstractC2707;
import p000.AbstractC2784;
import p000.C0267;
import p000.C0326;
import p000.C0327;
import p000.C0333;
import p000.C0335;
import p000.C0346;
import p000.C0413;
import p000.C0481;
import p000.C0482;
import p000.C0501;
import p000.C0550;
import p000.C0702;
import p000.C1007;
import p000.C1229;
import p000.C1230;
import p000.C1666;
import p000.C1669;
import p000.C2257;
import p000.C2260;
import p000.C2895;
import p000.C3523;
import p000.C3532;
import p000.InterfaceC2225;
import p000.RunnableC1668;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class This implements Serializable, Runnable {
    transient RunnableC1668 declaringInterpreter;
    private Map<Integer, Object> interfaces;
    private final InvocationHandler invocationHandler = new Handler();
    final C0007 namespace;
    public static final Map<String, C0007> contextStore = new ConcurrentHashMap();
    private static final ThreadLocal<C0007> CONTEXT_NAMESPACE = new ThreadLocal<>();
    private static final ThreadLocal<RunnableC1668> CONTEXT_INTERPRETER = new ThreadLocal<>();
    static final ThreadLocal<Map<String, Object[]>> CONTEXT_ARGS = ThreadLocal.withInitial(new C1666(2));

    /* JADX INFO: compiled from: obf */
    public class Handler implements InvocationHandler, Serializable {
        public Handler() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return invokeImpl(obj, method, objArr);
            } catch (C2895 e) {
                System.err.println("[BeanShell] TargetError in scripted interface: " + e);
                return null;
            } catch (C1229 e2) {
                System.err.println("[BeanShell] EvalError in scripted interface: " + e2);
                return null;
            }
        }

        public Object invokeImpl(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            C0501 c0501M389 = AbstractC0009.m389(This.this.namespace, "equals", new Class[]{Object.class}, true);
            if (name.equals("equals") && c0501M389 == null) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            C0501 c0501M3810 = AbstractC0009.m389(This.this.namespace, "toString", new Class[0], true);
            if (!name.equals("toString") || c0501M3810 != null) {
                return Primitive.unwrap(This.this.invokeMethod(name, Primitive.wrap(objArr, method.getParameterTypes())));
            }
            Class<?>[] interfaces = obj.getClass().getInterfaces();
            StringBuilder sb = new StringBuilder(This.this.toString() + "\nimplements:");
            for (Class<?> cls : interfaces) {
                StringBuilder sb2 = new StringBuilder(" ");
                sb2.append(cls.getName());
                sb2.append(interfaces.length > 1 ? "," : "");
                sb.append(sb2.toString());
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: obf */
    public static class Keys {
        public static final Keys BSHSTATIC = new AnonymousClass1();
        public static final Keys BSHTHIS = new AnonymousClass2();
        public static final Keys BSHSUPER = new AnonymousClass3();
        public static final Keys BSHINIT = new AnonymousClass4();
        public static final Keys BSHCONSTRUCTORS = new AnonymousClass5();
        public static final Keys BSHCLASSMODIFIERS = new AnonymousClass6();
        private static final /* synthetic */ Keys[] $VALUES = $values();

        /* JADX INFO: renamed from: bsh.This$Keys$1, reason: invalid class name */
        /* JADX INFO: compiled from: obf */
        public final enum AnonymousClass1 extends Keys {
            public /* synthetic */ AnonymousClass1() {
                this("BSHSTATIC", 0);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshStatic";
            }

            private AnonymousClass1(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$2, reason: invalid class name */
        /* JADX INFO: compiled from: obf */
        public final enum AnonymousClass2 extends Keys {
            public /* synthetic */ AnonymousClass2() {
                this("BSHTHIS", 1);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshThis";
            }

            private AnonymousClass2(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$3, reason: invalid class name */
        /* JADX INFO: compiled from: obf */
        public final enum AnonymousClass3 extends Keys {
            public /* synthetic */ AnonymousClass3() {
                this("BSHSUPER", 2);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshSuper";
            }

            private AnonymousClass3(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$4, reason: invalid class name */
        /* JADX INFO: compiled from: obf */
        public final enum AnonymousClass4 extends Keys {
            public /* synthetic */ AnonymousClass4() {
                this("BSHINIT", 3);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshInstanceInitializer";
            }

            private AnonymousClass4(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$5, reason: invalid class name */
        /* JADX INFO: compiled from: obf */
        public final enum AnonymousClass5 extends Keys {
            public /* synthetic */ AnonymousClass5() {
                this("BSHCONSTRUCTORS", 4);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshConstructors";
            }

            private AnonymousClass5(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$6, reason: invalid class name */
        /* JADX INFO: compiled from: obf */
        public final enum AnonymousClass6 extends Keys {
            public /* synthetic */ AnonymousClass6() {
                this("BSHCLASSMODIFIERS", 5);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshClassModifiers";
            }

            private AnonymousClass6(String str, int i) {
                super(str, i, 0);
            }
        }

        private static /* synthetic */ Keys[] $values() {
            return new Keys[]{BSHSTATIC, BSHTHIS, BSHSUPER, BSHINIT, BSHCONSTRUCTORS, BSHCLASSMODIFIERS};
        }

        public /* synthetic */ Keys(String str, int i, int i2) {
            this(str, i);
        }

        public static Keys valueOf(String str) {
            return (Keys) Enum.valueOf(Keys.class, str);
        }

        public static Keys[] values() {
            return (Keys[]) $VALUES.clone();
        }

        private Keys(String str, int i) {
            super(str, i);
        }
    }

    public This(C0007 c0007, RunnableC1668 runnableC1668) {
        this.namespace = c0007;
        this.declaringInterpreter = runnableC1668;
    }

    public static void bind(This r1, C0007 c0007, RunnableC1668 runnableC1668) {
        C0007 c0008 = r1.namespace;
        c0008.f494 = c0007;
        if (c0007 == null) {
            c0008.m363();
        }
        r1.declaringInterpreter = runnableC1668;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    public static ConstructorArgs getConstructorArgs(Class<?> cls, This r17, Object[] objArr, int i) {
        boolean z;
        String str;
        if (r17 == null) {
            throw new C1669("Unititialized class: no static");
        }
        if (i == -1) {
            return ConstructorArgs.DEFAULT;
        }
        try {
            Object objM356 = r17.getNameSpace().m356(Keys.BSHCONSTRUCTORS.toString(), true);
            if (objM356 == Primitive.VOID) {
                throw new C1669("Unable to find constructors array in class");
            }
            C1007[] c1007Arr = (C1007[]) objM356;
            C1007 c1007 = c1007Arr[i];
            C0333 c0333 = c1007.f2155;
            if (c1007.f3675 != null) {
                str = "super";
            } else if (c0333.m4710().length == 0) {
                str = null;
            } else {
                InterfaceC2225 interfaceC2225 = c0333.f8721[0];
                while (true) {
                    z = interfaceC2225 instanceof C0346;
                    if (z) {
                        break;
                    }
                    AbstractC2707 abstractC2707 = (AbstractC2707) interfaceC2225;
                    if (abstractC2707.m4710().length <= 0) {
                        break;
                    }
                    interfaceC2225 = abstractC2707.f8721[0];
                }
                if (z) {
                    C0346 c0346 = (C0346) interfaceC2225;
                    str = ((C0326) c0346.f8721[0]).f1577;
                    if (str.equals("super") || str.equals("this")) {
                        c1007.f3674 = (C0327) c0346.f8721[1];
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
            }
            if (str == null) {
                return ConstructorArgs.DEFAULT;
            }
            C0327 c0327 = c1007.f3674;
            C0007 c0007 = new C0007(r17.getNameSpace(), null, "consArgs");
            String[] strArrM1750 = c1007.m1750();
            Class[] clsArrMo1751 = c1007.mo1751();
            for (int i2 = 0; i2 < objArr.length; i2++) {
                try {
                    c0007.m367(strArrM1750[i2], clsArrMo1751[i2], objArr[i2], null);
                } catch (C3523 e) {
                    throw new C1669("err setting local cons arg:" + e, e);
                }
            }
            C0550 c0550 = new C0550();
            c0550.m1927(c0007);
            Object[] objArrM1434 = c1007.f3676;
            RunnableC1668 runnableC1668 = r17.declaringInterpreter;
            if (c0327 != null) {
                try {
                    objArrM1434 = c0327.m1434(c0550, runnableC1668);
                } catch (C1229 e2) {
                    throw new C1669("Error evaluating constructor args: " + e2, e2);
                }
            }
            Class[] clsArrM420 = AbstractC0010.m420(objArrM1434);
            Object[] objArrUnwrap = Primitive.unwrap(objArrM1434);
            if (str.equals("super")) {
                int iM379 = AbstractC0009.m379(clsArrM420, ((C0481) C0482.f2092.m3641(cls)).m1719(cls.getName()));
                if (iM379 != -1) {
                    return new ConstructorArgs(iM379, objArrUnwrap);
                }
                throw new C1669("can't find super constructor for args!");
            }
            int iM378 = AbstractC0009.m378(clsArrM420, Arrays.asList(c1007Arr));
            if (iM378 == -1) {
                throw new C1669("can't find this constructor for args!");
            }
            int size = ((C0481) C0482.f2092.m3641(cls)).m1719(cls.getName()).size();
            int i3 = iM378 + size;
            if (i3 != size + i) {
                return new ConstructorArgs(i3, objArrUnwrap);
            }
            throw new C1669("Recursive constructor call.");
        } catch (Exception e3) {
            throw new C1669("Unable to get instance initializers: " + e3, e3);
        }
    }

    public static This getThis(C0007 c0007, RunnableC1668 runnableC1668) {
        return new This(c0007, runnableC1668);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static This initClassInstanceThis(Object obj, String str) {
        This thisM381 = AbstractC0009.m381(obj, str);
        if (thisM381 != null) {
            return thisM381;
        }
        This thisM383 = AbstractC0009.m383(obj.getClass(), str);
        C0007 c0007M342 = thisM383.getNameSpace().m342();
        ThreadLocal<C0007> threadLocal = CONTEXT_NAMESPACE;
        if (threadLocal.get() != null) {
            C0007 c0007 = threadLocal.get();
            c0007M342.f494 = c0007;
            if (c0007 == null) {
                c0007M342.m363();
            }
        }
        ThreadLocal<RunnableC1668> threadLocal2 = CONTEXT_INTERPRETER;
        This thisMo310 = threadLocal2.get() != null ? c0007M342.mo310(threadLocal2.get()) : c0007M342.mo310(thisM383.declaringInterpreter);
        try {
            AbstractC0009.m387(obj, Keys.BSHTHIS + str).m3497(thisMo310, false);
            c0007M342.m366(obj);
            try {
                C0333 c0333 = (C0333) thisM383.getNameSpace().m356(Keys.BSHINIT.toString(), true);
                try {
                    C0550 c0550 = new C0550(c0007M342);
                    RunnableC1668 runnableC1668 = thisMo310.declaringInterpreter;
                    Boolean bool = Boolean.TRUE;
                    c0333.m1449(c0550, runnableC1668, bool, C0702.f2674);
                    c0333.m1449(new C0550(c0007M342), thisMo310.declaringInterpreter, bool, C0702.f2673);
                    return thisMo310;
                } catch (Exception e) {
                    throw new C1669("Error in class instance This initialization: " + e, e);
                }
            } catch (Exception e2) {
                throw new C1669("unable to get instance initializer: " + e2, e2);
            }
        } catch (Exception e3) {
            throw new C1669("Error in class gen setup: " + e3, e3);
        }
    }

    public static void initInstance(GeneratedClass generatedClass, String str, Object[] objArr) {
        try {
            This thisInitClassInstanceThis = initClassInstanceThis(generatedClass, str);
            C0007 nameSpace = thisInitClassInstanceThis.getNameSpace();
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = generatedClass.getClass(); superclass != null && !superclass.getSimpleName().equals(str); superclass = superclass.getSuperclass()) {
                arrayList.add(0, superclass.getSimpleName());
            }
            arrayList.forEach(new C0413(3, generatedClass));
            if (nameSpace.f510) {
                ThreadLocal<Map<String, Object[]>> threadLocal = CONTEXT_ARGS;
                if (threadLocal.get().containsKey(generatedClass.toString())) {
                    objArr = threadLocal.get().remove(generatedClass.toString());
                }
            }
            Object[] objArr2 = objArr;
            C0501 c0501M350 = nameSpace.m350(AbstractC0010.m417(str), AbstractC0010.m420(objArr2), true);
            if (objArr2.length > 0 && c0501M350 == null) {
                throw new C1669("Can't find constructor: " + AbstractC2202.m4011(str, AbstractC0010.m420(objArr2)));
            }
            if (c0501M350 != null) {
                c0501M350.m1754(objArr2, thisInitClassInstanceThis.declaringInterpreter, null, null, false);
            }
            for (C3532 c3532 : AbstractC0009.m396(AbstractC0009.m395(generatedClass))) {
                c3532.m5127(false);
            }
        } catch (Exception e) {
            Exception exc = e;
            if (exc instanceof C2895) {
                exc = (Exception) ((C2895) exc).m4900();
            }
            if (exc instanceof InvocationTargetException) {
                exc = (Exception) exc.getCause();
            }
            throw new C1669("Error in class instance initialization: " + exc, exc);
        }
    }

    public static void initStatic(Class<?> cls) throws C3523 {
        String simpleName = cls.getSimpleName();
        try {
            This thisM383 = AbstractC0009.m383(cls, simpleName);
            C0007 nameSpace = thisM383.getNameSpace();
            RunnableC1668 runnableC1668 = thisM383.declaringInterpreter;
            if (runnableC1668 == null) {
                throw new C3523("No namespace or interpreter for statitc This. Start interpreter for class not implemented yet.");
            }
            C0333 c0333 = (C0333) nameSpace.m356(Keys.BSHINIT.toString(), true);
            C0550 c0550 = new C0550(nameSpace);
            Boolean bool = Boolean.TRUE;
            c0333.m1449(c0550, runnableC1668, bool, C0702.f2672);
            c0333.m1449(c0550, runnableC1668, bool, C0702.f2671);
            for (C3532 c3532 : AbstractC0009.m396(nameSpace)) {
                c3532.m5127(true);
            }
        } catch (Exception e) {
            StringBuilder sbM4679 = AbstractC2668.m4679("Exception in static init block <clinit> for class ", simpleName, ". With message: ");
            sbM4679.append(e.getMessage());
            throw new C3523(sbM4679.toString(), e);
        }
    }

    public static boolean isExposedThisMethod(String str) {
        return str.equals("invokeMethod") || str.equals("getInterface") || str.equals("wait") || str.equals("notify") || str.equals("notifyAll");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$static$1() {
        return new HashMap();
    }

    public static This pullBshStatic(String str) {
        Map<String, C0007> map = contextStore;
        return map.containsKey(str) ? map.remove(str).mo310(null) : getThis(null, null);
    }

    public static void registerConstructorContext(C0550 c0550, RunnableC1668 runnableC1668) {
        if (c0550 != null) {
            CONTEXT_NAMESPACE.set(c0550.m1929());
        } else {
            CONTEXT_NAMESPACE.remove();
        }
        if (runnableC1668 != null) {
            CONTEXT_INTERPRETER.set(runnableC1668);
        } else {
            CONTEXT_INTERPRETER.remove();
        }
    }

    public Object cloneMethodImpl(InterfaceC2225 interfaceC2225, C0550 c0550) {
        return cloneMethodImpl(interfaceC2225, c0550, null);
    }

    public Object[] enumValues() {
        Class cls = getNameSpace().f511;
        Object[] objArr = AbstractC0009.f516;
        return Stream.of((Object[]) cls.getFields()).filter(new C2260(4, cls)).map(new C2257(27)).filter(new C0335(6)).toArray(new C0267(3, cls));
    }

    public Object getInterface(Class<?> cls) {
        return getInterface(new Class[]{cls});
    }

    public C0007 getNameSpace() {
        return this.namespace;
    }

    public Object invokeMethod(String str, Object[] objArr) {
        return invokeMethod(str, objArr, null, null, null, false);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            invokeMethod("run", AbstractC0009.f516);
        } catch (C1229 e) {
            this.declaringInterpreter.m3390("Exception in runnable:" + e);
        }
    }

    public String toString() {
        C0501 c0501M389 = AbstractC0009.m389(this.namespace, "toString", new Class[0], true);
        if (c0501M389 != null) {
            try {
                return (String) c0501M389.m1754(new Object[0], this.declaringInterpreter, null, null, false);
            } catch (C1229 unused) {
            }
        }
        return "'this' reference to Bsh object: " + this.namespace;
    }

    /* JADX INFO: compiled from: obf */
    public static class ConstructorArgs {
        public static final ConstructorArgs DEFAULT = new ConstructorArgs();
        int arg;
        Object[] args;
        public int selector;

        public ConstructorArgs() {
            this.selector = -1;
        }

        public boolean getBoolean() {
            return ((Boolean) next()).booleanValue();
        }

        public byte getByte() {
            return ((Number) next()).byteValue();
        }

        public char getChar() {
            return ((Character) next()).charValue();
        }

        public double getDouble() {
            return ((Number) next()).doubleValue();
        }

        public float getFloat() {
            return ((Number) next()).floatValue();
        }

        public int getInt() {
            return ((Number) next()).intValue();
        }

        public long getLong() {
            return ((Number) next()).longValue();
        }

        public Object getObject() {
            return next();
        }

        public short getShort() {
            return ((Number) next()).shortValue();
        }

        public Object next() {
            Object[] objArr = this.args;
            int i = this.arg;
            this.arg = i + 1;
            return objArr[i];
        }

        public ConstructorArgs(int i, Object[] objArr) {
            this.selector = i;
            this.args = objArr;
        }
    }

    public Object cloneMethodImpl(InterfaceC2225 interfaceC2225, C0550 c0550, Object obj) throws C1229 {
        C0007 c0007 = new C0007(this.namespace.f494, null, AbstractC2784.m4752(new StringBuilder(), this.namespace.f493, " clone"));
        if (obj == null) {
            try {
                Class cls = this.namespace.f511;
                if (cls == null) {
                    return c0007.mo310(this.declaringInterpreter);
                }
                obj = cls.getConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                e = e;
                throw new C1229("Unable to clone from This reference: " + e.getMessage(), interfaceC2225, c0550);
            } catch (IllegalArgumentException e2) {
                e = e2;
                throw new C1229("Unable to clone from This reference: " + e.getMessage(), interfaceC2225, c0550);
            } catch (InstantiationException e3) {
                e = e3;
                throw new C1229("Unable to clone from This reference: " + e.getMessage(), interfaceC2225, c0550);
            } catch (NoSuchMethodException e4) {
                e = e4;
                throw new C1229("Unable to clone from This reference: " + e.getMessage(), interfaceC2225, c0550);
            } catch (SecurityException e5) {
                e = e5;
                throw new C1229("Unable to clone from This reference: " + e.getMessage(), interfaceC2225, c0550);
            } catch (InvocationTargetException e6) {
                e = e6;
                throw new C1229("Unable to clone from This reference: " + e.getMessage(), interfaceC2225, c0550);
            } catch (C3523 e7) {
                throw e7.mo4644("Unable to assign clone instance This: " + e7.getMessage(), interfaceC2225, c0550);
            }
        }
        c0007.m366(obj);
        Class cls2 = this.namespace.f511;
        c0007.f511 = cls2;
        c0007.m359(cls2);
        c0007.f508 = true;
        c0007.f507 = true;
        for (C3532 c3532 : this.namespace.m358()) {
            c0007.m368(c3532);
        }
        C0007 c0008 = new C0007(c0007, null, null);
        c0008.m366(obj);
        Class cls3 = c0007.f511;
        c0008.f511 = cls3;
        c0008.m359(cls3);
        c0008.f508 = true;
        c0008.f507 = true;
        for (C0501 c0501 : this.namespace.m351()) {
            C0501 c0501M1746 = c0501.clone();
            c0501M1746.f2147 = c0008;
            c0007.mo313(c0501M1746);
        }
        AbstractC0009.m387(obj, Keys.BSHTHIS + c0007.f511.getSimpleName()).m3497(c0007.mo310(this.declaringInterpreter), false);
        return obj;
    }

    public Object getInterface(Class<?>[] clsArr) {
        if (this.interfaces == null) {
            this.interfaces = new HashMap();
        }
        int iHashCode = 21;
        for (Class<?> cls : clsArr) {
            iHashCode *= cls.hashCode() + 3;
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object obj = this.interfaces.get(numValueOf);
        if (obj != null) {
            return obj;
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(clsArr[0].getClassLoader(), clsArr, this.invocationHandler);
        this.interfaces.put(numValueOf, objNewProxyInstance);
        return objNewProxyInstance;
    }

    public Object invokeMethod(String str, Object[] objArr, boolean z) throws C1230 {
        C0550 c0550 = new C0550(this.namespace);
        InterfaceC2225 interfaceC2225M353 = this.namespace.m353();
        this.namespace.f506 = null;
        try {
            Object objInvokeMethod = invokeMethod(str, objArr, this.declaringInterpreter, c0550, interfaceC2225M353, z);
            return (!(objInvokeMethod instanceof Primitive) || objInvokeMethod == Primitive.VOID) ? objInvokeMethod : ((Primitive) objInvokeMethod).getValue();
        } catch (Exception e) {
            throw new C1230(e.getMessage(), interfaceC2225M353, c0550, e);
        }
    }

    public Object invokeMethod(String str, Object[] objArr, RunnableC1668 runnableC1668, C0550 c0550, InterfaceC2225 interfaceC2225, boolean z) throws C1230 {
        if (objArr == null) {
            objArr = AbstractC0009.f516;
        }
        Object[] objArr2 = objArr;
        if (runnableC1668 == null) {
            runnableC1668 = this.declaringInterpreter;
        }
        RunnableC1668 runnableC1669 = runnableC1668;
        if (runnableC1669.f5634 == null) {
            runnableC1669.m3395(this.namespace);
        }
        if (c0550 == null) {
            c0550 = new C0550(this.namespace);
        }
        C0550 c0551 = c0550;
        if (interfaceC2225 == null) {
            interfaceC2225 = InterfaceC2225.f7223;
        }
        InterfaceC2225 interfaceC2226 = interfaceC2225;
        Class[] clsArrM420 = AbstractC0010.m420(objArr2);
        C0501 c0501M389 = AbstractC0009.m389(this.namespace, str, clsArrM420, z);
        if (c0501M389 != null) {
            return c0501M389.m1754(objArr2, runnableC1669, c0551, interfaceC2226, false);
        }
        if (str.equals("getClass") && objArr2.length == 0) {
            return This.class;
        }
        if (str.equals("toString") && objArr2.length == 0) {
            return toString();
        }
        if (str.equals("hashCode") && objArr2.length == 0) {
            return Integer.valueOf(hashCode());
        }
        if (str.equals("equals") && objArr2.length == 1) {
            return this == objArr2[0] ? Boolean.TRUE : Boolean.FALSE;
        }
        if (str.equals("clone") && objArr2.length == 0) {
            return cloneMethodImpl(interfaceC2226, c0551);
        }
        boolean[] zArr = new boolean[1];
        Object objM361 = this.namespace.m361(str, objArr2, runnableC1669, c0551, interfaceC2226, zArr);
        if (zArr[0]) {
            return objM361;
        }
        try {
            return this.namespace.m360(str, objArr2, runnableC1669, c0551, interfaceC2226, true);
        } catch (C1229 e) {
            throw new C1230("Method " + AbstractC2202.m4011(str, clsArrM420) + " not found in bsh scripted object: " + this.namespace.f493, interfaceC2226, c0551, e);
        }
    }
}
