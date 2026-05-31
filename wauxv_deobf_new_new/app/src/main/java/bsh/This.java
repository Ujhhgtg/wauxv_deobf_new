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
import p000.AbstractC2240;
import p000.AbstractC2647;
import p000.AbstractC2844;
import p000.C0277;
import p000.C0387;
import p000.C0456;
import p000.C0457;
import p000.C0458;
import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.C1682;
import p000.C1684;
import p000.C2289;
import p000.C2292;
import p000.C2954;
import p000.C3581;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class This implements Serializable, Runnable {
    transient RunnableC0008 declaringInterpreter;
    private Map<Integer, Object> interfaces;
    private final InvocationHandler invocationHandler = new Handler();
    final C0012 namespace;
    public static final Map<String, C0012> contextStore = new ConcurrentHashMap();
    private static final ThreadLocal<C0012> CONTEXT_NAMESPACE = new ThreadLocal<>();
    private static final ThreadLocal<RunnableC0008> CONTEXT_INTERPRETER = new ThreadLocal<>();
    static final ThreadLocal<Map<String, Object[]>> CONTEXT_ARGS = ThreadLocal.withInitial(new C1682(2));

    /* JADX INFO: compiled from: obf */
    public class Handler implements InvocationHandler, Serializable {
        public Handler() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return invokeImpl(obj, method, objArr);
            } catch (C2954 e) {
                System.err.println("[BeanShell] TargetError in scripted interface: " + e);
                return null;
            } catch (C1231 e2) {
                System.err.println("[BeanShell] EvalError in scripted interface: " + e2);
                return null;
            }
        }

        public Object invokeImpl(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            BshMethod bshMethodM534 = AbstractC0016.m534(This.this.namespace, "equals", new Class[]{Object.class}, true);
            if (name.equals("equals") && bshMethodM534 == null) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            BshMethod bshMethodM535 = AbstractC0016.m534(This.this.namespace, "toString", new Class[0], true);
            if (!name.equals("toString") || bshMethodM535 != null) {
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
        public static final Keys BSHEXTENSIONMETHODRECEIVER = new AnonymousClass7();
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

        /* JADX INFO: renamed from: bsh.This$Keys$7, reason: invalid class name */
        /* JADX INFO: compiled from: obf */
        public final enum AnonymousClass7 extends Keys {
            public /* synthetic */ AnonymousClass7() {
                this("BSHEXTENSIONMETHODRECEIVER", 6);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshExtensionMethodReceiver";
            }

            private AnonymousClass7(String str, int i) {
                super(str, i, 0);
            }
        }

        private static /* synthetic */ Keys[] $values() {
            return new Keys[]{BSHSTATIC, BSHTHIS, BSHSUPER, BSHINIT, BSHCONSTRUCTORS, BSHCLASSMODIFIERS, BSHEXTENSIONMETHODRECEIVER};
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

    public This(C0012 c0012, RunnableC0008 runnableC0008) {
        this.namespace = c0012;
        this.declaringInterpreter = runnableC0008;
    }

    public static void bind(This r1, C0012 c0012, RunnableC0008 runnableC0008) {
        C0012 c0013 = r1.namespace;
        c0013.f521 = c0012;
        if (c0012 == null) {
            c0013.m383();
        }
        r1.declaringInterpreter = runnableC0008;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    public static ConstructorArgs getConstructorArgs(Class<?> cls, This r17, Object[] objArr, int i) {
        boolean z;
        String str;
        if (r17 == null) {
            throw new C1684("Unititialized class: no static");
        }
        if (i == -1) {
            return ConstructorArgs.DEFAULT;
        }
        try {
            Object objM376 = r17.getNameSpace().m376(Keys.BSHCONSTRUCTORS.toString(), true);
            if (objM376 == Primitive.VOID) {
                throw new C1684("Unable to find constructors array in class");
            }
            C0007[] c0007Arr = (C0007[]) objM376;
            C0007 c0007 = c0007Arr[i];
            if (c0007.f498 != null) {
                str = "super";
            } else if (c0007.methodBody.jjtGetNumChildren() == 0) {
                str = null;
            } else {
                Node nodeJjtGetChild = c0007.methodBody.jjtGetChild(0);
                while (true) {
                    z = nodeJjtGetChild instanceof BSHMethodInvocation;
                    if (z || nodeJjtGetChild.jjtGetNumChildren() <= 0) {
                        break;
                    }
                    nodeJjtGetChild = nodeJjtGetChild.jjtGetChild(0);
                }
                if (z) {
                    BSHMethodInvocation bSHMethodInvocation = (BSHMethodInvocation) nodeJjtGetChild;
                    str = bSHMethodInvocation.getNameNode().text;
                    if (str.equals("super") || str.equals("this")) {
                        c0007.f497 = bSHMethodInvocation.getArgsNode();
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
            BSHArguments bSHArguments = c0007.f497;
            C0012 c0012 = new C0012(r17.getNameSpace(), null, "consArgs");
            String[] parameterNames = c0007.getParameterNames();
            Class[] parameterTypes = c0007.getParameterTypes();
            for (int i2 = 0; i2 < objArr.length; i2++) {
                try {
                    c0012.m386(parameterNames[i2], parameterTypes[i2], objArr[i2], null);
                } catch (C3581 e) {
                    throw new C1684("err setting local cons arg:" + e, e);
                }
            }
            C0527 c0527 = new C0527();
            c0527.m2022(c0012);
            Object[] arguments = c0007.f499;
            RunnableC0008 runnableC0008 = r17.declaringInterpreter;
            if (bSHArguments != null) {
                try {
                    arguments = bSHArguments.getArguments(c0527, runnableC0008);
                } catch (C1231 e2) {
                    throw new C1684("Error evaluating constructor args: " + e2, e2);
                }
            }
            Class[] clsArrM564 = AbstractC0017.m564(arguments);
            Object[] objArrUnwrap = Primitive.unwrap(arguments);
            if (str.equals("super")) {
                int iM524 = AbstractC0016.m524(clsArrM564, ((C0457) C0458.f2065.m3819(cls)).m1827(cls.getName()));
                if (iM524 != -1) {
                    return new ConstructorArgs(iM524, objArrUnwrap);
                }
                throw new C1684("can't find super constructor for args!");
            }
            int iM523 = AbstractC0016.m523(clsArrM564, Arrays.asList(c0007Arr));
            if (iM523 == -1) {
                throw new C1684("can't find this constructor for args!");
            }
            int size = ((C0457) C0458.f2065.m3819(cls)).m1827(cls.getName()).size();
            int i3 = iM523 + size;
            if (i3 != size + i) {
                return new ConstructorArgs(i3, objArrUnwrap);
            }
            throw new C1684("Recursive constructor call.");
        } catch (Exception e3) {
            throw new C1684("Unable to get instance initializers: " + e3, e3);
        }
    }

    public static This getThis(C0012 c0012, RunnableC0008 runnableC0008) {
        return new This(c0012, runnableC0008);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static This initClassInstanceThis(Object obj, String str) {
        This thisM526 = AbstractC0016.m526(obj, str);
        if (thisM526 != null) {
            return thisM526;
        }
        This thisM528 = AbstractC0016.m528(obj.getClass(), str);
        C0012 c0012M362 = thisM528.getNameSpace().m362();
        ThreadLocal<C0012> threadLocal = CONTEXT_NAMESPACE;
        if (threadLocal.get() != null) {
            C0012 c0012 = threadLocal.get();
            c0012M362.f521 = c0012;
            if (c0012 == null) {
                c0012M362.m383();
            }
        }
        ThreadLocal<RunnableC0008> threadLocal2 = CONTEXT_INTERPRETER;
        This thisMo313 = threadLocal2.get() != null ? c0012M362.mo313(threadLocal2.get()) : c0012M362.mo313(thisM528.declaringInterpreter);
        try {
            AbstractC0016.m532(obj, Keys.BSHTHIS + str).assign(thisMo313, false);
            c0012M362.f539 = obj;
            c0012M362.f527.remove(obj);
            c0012M362.f527.add(0, obj);
            c0012M362.m385();
            try {
                BSHBlock bSHBlock = (BSHBlock) thisM528.getNameSpace().m376(Keys.BSHINIT.toString(), true);
                try {
                    C0527 c0527 = new C0527(c0012M362);
                    RunnableC0008 runnableC0008 = thisMo313.declaringInterpreter;
                    Boolean bool = Boolean.TRUE;
                    bSHBlock.evalBlock(c0527, runnableC0008, bool, C0004.f476);
                    bSHBlock.evalBlock(new C0527(c0012M362), thisMo313.declaringInterpreter, bool, C0004.f475);
                    return thisMo313;
                } catch (Exception e) {
                    throw new C1684("Error in class instance This initialization: " + e, e);
                }
            } catch (Exception e2) {
                throw new C1684("unable to get instance initializer: " + e2, e2);
            }
        } catch (Exception e3) {
            throw new C1684("Error in class gen setup: " + e3, e3);
        }
    }

    public static void initInstance(GeneratedClass generatedClass, String str, Object[] objArr) {
        try {
            This thisInitClassInstanceThis = initClassInstanceThis(generatedClass, str);
            C0012 nameSpace = thisInitClassInstanceThis.getNameSpace();
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = generatedClass.getClass(); superclass != null && !superclass.getSimpleName().equals(str); superclass = superclass.getSuperclass()) {
                arrayList.add(0, superclass.getSimpleName());
            }
            arrayList.forEach(new C0387(generatedClass, 3));
            if (nameSpace.f537) {
                ThreadLocal<Map<String, Object[]>> threadLocal = CONTEXT_ARGS;
                if (threadLocal.get().containsKey(generatedClass.toString())) {
                    objArr = threadLocal.get().remove(generatedClass.toString());
                }
            }
            BshMethod bshMethodM370 = nameSpace.m370(AbstractC0017.m561(str), AbstractC0017.m564(objArr), true);
            if (objArr.length > 0 && bshMethodM370 == null) {
                throw new C1684("Can't find constructor: " + AbstractC2240.m4261(str, AbstractC0017.m564(objArr)));
            }
            if (bshMethodM370 != null) {
                bshMethodM370.invoke(objArr, thisInitClassInstanceThis.declaringInterpreter);
            }
            for (Variable variable : AbstractC0016.m541(AbstractC0016.m540(generatedClass))) {
                variable.validateFinalIsSet(false);
            }
        } catch (Exception e) {
            e = e;
            if (e instanceof C2954) {
                e = (Exception) ((C2954) e).m4962();
            }
            if (e instanceof InvocationTargetException) {
                e = (Exception) e.getCause();
            }
            throw new C1684("Error in class instance initialization: " + e, e);
        }
    }

    public static void initStatic(Class<?> cls) throws C3581 {
        String simpleName = cls.getSimpleName();
        try {
            This thisM528 = AbstractC0016.m528(cls, simpleName);
            C0012 nameSpace = thisM528.getNameSpace();
            RunnableC0008 runnableC0008 = thisM528.declaringInterpreter;
            if (runnableC0008 == null) {
                throw new C3581("No namespace or interpreter for statitc This. Start interpreter for class not implemented yet.");
            }
            BSHBlock bSHBlock = (BSHBlock) nameSpace.m376(Keys.BSHINIT.toString(), true);
            C0527 c0527 = new C0527(nameSpace);
            Boolean bool = Boolean.TRUE;
            bSHBlock.evalBlock(c0527, runnableC0008, bool, C0004.f474);
            bSHBlock.evalBlock(c0527, runnableC0008, bool, C0004.f473);
            for (Variable variable : AbstractC0016.m541(nameSpace)) {
                variable.validateFinalIsSet(true);
            }
        } catch (Exception e) {
            StringBuilder sbM4625 = AbstractC2647.m4625("Exception in static init block <clinit> for class ", simpleName, ". With message: ");
            sbM4625.append(e.getMessage());
            throw new C3581(sbM4625.toString(), e);
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
        Map<String, C0012> map = contextStore;
        return map.containsKey(str) ? map.remove(str).mo313(null) : getThis(null, null);
    }

    public static void registerConstructorContext(C0527 c0527, RunnableC0008 runnableC0008) {
        if (c0527 != null) {
            CONTEXT_NAMESPACE.set(c0527.m2024());
        } else {
            CONTEXT_NAMESPACE.remove();
        }
        if (runnableC0008 != null) {
            CONTEXT_INTERPRETER.set(runnableC0008);
        } else {
            CONTEXT_INTERPRETER.remove();
        }
    }

    public Object cloneMethodImpl(Node node, C0527 c0527) {
        return cloneMethodImpl(node, c0527, null);
    }

    public Object[] enumValues() {
        Class cls = getNameSpace().f538;
        Object[] objArr = AbstractC0016.f568;
        return Stream.of((Object[]) cls.getFields()).filter(new C2292(cls, 4)).map(new C2289(23)).filter(new C0456(5)).toArray(new C0277(cls, 3));
    }

    public Object getInterface(Class<?> cls) {
        return getInterface(new Class[]{cls});
    }

    public C0012 getNameSpace() {
        return this.namespace;
    }

    public Object invokeMethod(String str, Object[] objArr) {
        return invokeMethod(str, objArr, null, null, null, false);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            invokeMethod("run", AbstractC0016.f568);
        } catch (C1231 e) {
            this.declaringInterpreter.m338("Exception in runnable:" + e);
        }
    }

    public String toString() {
        BshMethod bshMethodM534 = AbstractC0016.m534(this.namespace, "toString", new Class[0], true);
        if (bshMethodM534 != null) {
            try {
                return (String) bshMethodM534.invoke(new Object[0], this.declaringInterpreter);
            } catch (C1231 unused) {
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

    public Object cloneMethodImpl(Node node, C0527 c0527, Object obj) throws C1231 {
        C0012 c0012 = new C0012(this.namespace.f521, null, AbstractC2844.m4786(new StringBuilder(), this.namespace.f520, " clone"));
        if (obj == null) {
            try {
                Class cls = this.namespace.f538;
                if (cls == null) {
                    return c0012.mo313(this.declaringInterpreter);
                }
                obj = cls.getConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                e = e;
                throw new C1231("Unable to clone from This reference: " + e.getMessage(), node, c0527);
            } catch (IllegalArgumentException e2) {
                e = e2;
                throw new C1231("Unable to clone from This reference: " + e.getMessage(), node, c0527);
            } catch (InstantiationException e3) {
                e = e3;
                throw new C1231("Unable to clone from This reference: " + e.getMessage(), node, c0527);
            } catch (NoSuchMethodException e4) {
                e = e4;
                throw new C1231("Unable to clone from This reference: " + e.getMessage(), node, c0527);
            } catch (SecurityException e5) {
                e = e5;
                throw new C1231("Unable to clone from This reference: " + e.getMessage(), node, c0527);
            } catch (InvocationTargetException e6) {
                e = e6;
                throw new C1231("Unable to clone from This reference: " + e.getMessage(), node, c0527);
            } catch (C3581 e7) {
                throw e7.mo4678("Unable to assign clone instance This: " + e7.getMessage(), node, c0527);
            }
        }
        c0012.f539 = obj;
        c0012.f527.remove(obj);
        c0012.f527.add(0, obj);
        c0012.m385();
        Class cls2 = this.namespace.f538;
        c0012.f538 = cls2;
        c0012.m379(cls2);
        c0012.f535 = true;
        c0012.f534 = true;
        for (Variable variable : this.namespace.m378()) {
            c0012.m387(variable);
        }
        C0012 c0013 = new C0012(c0012, null, null);
        c0013.f539 = obj;
        c0013.f527.remove(obj);
        c0013.f527.add(0, obj);
        c0013.m385();
        Class cls3 = c0012.f538;
        c0013.f538 = cls3;
        c0013.m379(cls3);
        c0013.f535 = true;
        c0013.f534 = true;
        for (BshMethod bshMethod : this.namespace.m371()) {
            BshMethod bshMethodClone = bshMethod.m297clone();
            bshMethodClone.declaringNameSpace = c0013;
            c0012.mo316(bshMethodClone);
        }
        AbstractC0016.m532(obj, Keys.BSHTHIS + c0012.f538.getSimpleName()).assign(c0012.mo313(this.declaringInterpreter));
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

    public Object invokeMethod(String str, Object[] objArr, boolean z) throws C1232 {
        C0527 c0527 = new C0527(this.namespace);
        Node nodeM373 = this.namespace.m373();
        this.namespace.f533 = null;
        try {
            Object objInvokeMethod = invokeMethod(str, objArr, this.declaringInterpreter, c0527, nodeM373, z);
            return (!(objInvokeMethod instanceof Primitive) || objInvokeMethod == Primitive.VOID) ? objInvokeMethod : ((Primitive) objInvokeMethod).getValue();
        } catch (Exception e) {
            throw new C1232(e.getMessage(), nodeM373, c0527, e);
        }
    }

    public Object invokeMethod(String str, Object[] objArr, RunnableC0008 runnableC0008, C0527 c0527, Node node, boolean z) throws C1232 {
        if (objArr == null) {
            objArr = AbstractC0016.f568;
        }
        Object[] objArr2 = objArr;
        if (runnableC0008 == null) {
            runnableC0008 = this.declaringInterpreter;
        }
        RunnableC0008 runnableC0009 = runnableC0008;
        if (runnableC0009.f505 == null) {
            runnableC0009.m346(this.namespace);
        }
        if (c0527 == null) {
            c0527 = new C0527(this.namespace);
        }
        C0527 c0528 = c0527;
        if (node == null) {
            node = Node.JAVACODE;
        }
        Node node2 = node;
        Class[] clsArrM564 = AbstractC0017.m564(objArr2);
        BshMethod bshMethodM534 = AbstractC0016.m534(this.namespace, str, clsArrM564, z);
        if (bshMethodM534 != null) {
            return bshMethodM534.invoke(objArr2, runnableC0009, c0528, node2);
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
            return cloneMethodImpl(node2, c0528);
        }
        boolean[] zArr = new boolean[1];
        Object objM381 = this.namespace.m381(str, objArr2, runnableC0009, c0528, node2, zArr);
        if (zArr[0]) {
            return objM381;
        }
        try {
            return this.namespace.m380(str, objArr2, runnableC0009, c0528, node2, true);
        } catch (C1231 e) {
            throw new C1232("Method " + AbstractC2240.m4261(str, clsArrM564) + " not found in bsh scripted object: " + this.namespace.f520, node2, c0528, e);
        }
    }
}
