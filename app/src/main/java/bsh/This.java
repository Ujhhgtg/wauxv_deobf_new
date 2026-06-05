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
import p000.AbstractC0924feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.C0710Ujhhgtgfeyxiexzf;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C1297feyxiexzfUjhhgtg;
import p000.C1298feyxiexzfUjhhgtg;
import p000.C1853Ujhhgtgfeyxiexzf;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C1985Ujhhgtgfeyxiexzf;
import p000.C2390Ujhhgtgfeyxiexzf;
import p000.C2570Ujhhgtgfeyxiexzf;
import p000.C2572Ujhhgtgfeyxiexzf;
import p000.C2574Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C2809Ujhhgtgfeyxiexzf;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;
import p000.InterfaceC3567Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class This implements Serializable, Runnable {
    transient RunnableC0026Ujhhgtgfeyxiexzf declaringInterpreter;
    private Map<Integer, Object> interfaces;
    private final InvocationHandler invocationHandler = new Handler();
    final C0029Ujhhgtgfeyxiexzf namespace;
    public static final Map<String, C0029Ujhhgtgfeyxiexzf> contextStore = new ConcurrentHashMap();
    private static final ThreadLocal<C0029Ujhhgtgfeyxiexzf> CONTEXT_NAMESPACE = new ThreadLocal<>();
    private static final ThreadLocal<RunnableC0026Ujhhgtgfeyxiexzf> CONTEXT_INTERPRETER = new ThreadLocal<>();
    static final ThreadLocal<Map<String, Object[]>> CONTEXT_ARGS = ThreadLocal.withInitial(new C0710Ujhhgtgfeyxiexzf(2));

    /* JADX INFO: compiled from: obf */
    public class Handler implements InvocationHandler, Serializable {
        public Handler() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return invokeImpl(obj, method, objArr);
            } catch (C1985Ujhhgtgfeyxiexzf e) {
                System.err.println("[BeanShell] TargetError in scripted interface: " + e);
                return null;
            } catch (C3353Ujhhgtgfeyxiexzf e2) {
                System.err.println("[BeanShell] EvalError in scripted interface: " + e2);
                return null;
            }
        }

        public Object invokeImpl(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            C0021Ujhhgtgfeyxiexzf c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m533Ujhhgtgfeyxiexzf(This.this.namespace, "equals", new Class[]{Object.class}, true);
            if (name.equals("equals") && c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf == null) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            C0021Ujhhgtgfeyxiexzf c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf2 = AbstractC0033Ujhhgtgfeyxiexzf.m533Ujhhgtgfeyxiexzf(This.this.namespace, "toString", new Class[0], true);
            if (!name.equals("toString") || c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf2 != null) {
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

    public This(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        this.namespace = c0029Ujhhgtgfeyxiexzf;
        this.declaringInterpreter = runnableC0026Ujhhgtgfeyxiexzf;
    }

    public static void bind(This r1, C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf2 = r1.namespace;
        c0029Ujhhgtgfeyxiexzf2.f535Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf;
        if (c0029Ujhhgtgfeyxiexzf == null) {
            c0029Ujhhgtgfeyxiexzf2.m382feyxiexzfUjhhgtg();
        }
        r1.declaringInterpreter = runnableC0026Ujhhgtgfeyxiexzf;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    public static ConstructorArgs getConstructorArgs(Class<?> cls, This r17, Object[] objArr, int i) {
        boolean z;
        String str;
        if (r17 == null) {
            throw new C0712Ujhhgtgfeyxiexzf("Unititialized class: no static");
        }
        if (i == -1) {
            return ConstructorArgs.DEFAULT;
        }
        try {
            Object objM375Ujhhgtgfeyxiexzf = r17.getNameSpace().m375Ujhhgtgfeyxiexzf(Keys.BSHCONSTRUCTORS.toString(), true);
            if (objM375Ujhhgtgfeyxiexzf == Primitive.VOID) {
                throw new C0712Ujhhgtgfeyxiexzf("Unable to find constructors array in class");
            }
            C0025Ujhhgtgfeyxiexzf[] c0025UjhhgtgfeyxiexzfArr = (C0025Ujhhgtgfeyxiexzf[]) objM375Ujhhgtgfeyxiexzf;
            C0025Ujhhgtgfeyxiexzf c0025Ujhhgtgfeyxiexzf = c0025UjhhgtgfeyxiexzfArr[i];
            BSHBlock bSHBlock = c0025Ujhhgtgfeyxiexzf.f475Ujhhgtgfeyxiexzf;
            if (c0025Ujhhgtgfeyxiexzf.f512feyxiexzfUjhhgtg != null) {
                str = "super";
            } else if (bSHBlock.jjtGetNumChildren() == 0) {
                str = null;
            } else {
                Node nodeJjtGetChild = bSHBlock.jjtGetChild(0);
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
                        c0025Ujhhgtgfeyxiexzf.f511feyxiexzfUjhhgtg = bSHMethodInvocation.getArgsNode();
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
            BSHArguments bSHArguments = c0025Ujhhgtgfeyxiexzf.f511feyxiexzfUjhhgtg;
            C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = new C0029Ujhhgtgfeyxiexzf(r17.getNameSpace(), null, "consArgs");
            String[] strArrM312Ujhhgtgfeyxiexzf = c0025Ujhhgtgfeyxiexzf.m312Ujhhgtgfeyxiexzf();
            Class[] clsArrMo313Ujhhgtgfeyxiexzf = c0025Ujhhgtgfeyxiexzf.mo313Ujhhgtgfeyxiexzf();
            for (int i2 = 0; i2 < objArr.length; i2++) {
                try {
                    c0029Ujhhgtgfeyxiexzf.m385feyxiexzfUjhhgtg(strArrM312Ujhhgtgfeyxiexzf[i2], clsArrMo313Ujhhgtgfeyxiexzf[i2], objArr[i2], null);
                } catch (C1863Ujhhgtgfeyxiexzf e) {
                    throw new C0712Ujhhgtgfeyxiexzf("err setting local cons arg:" + e, e);
                }
            }
            C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg = new C2637feyxiexzfUjhhgtg();
            c2637feyxiexzfUjhhgtg.m3971Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf);
            Object[] arguments = c0025Ujhhgtgfeyxiexzf.f513feyxiexzfUjhhgtg;
            RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf = r17.declaringInterpreter;
            if (bSHArguments != null) {
                try {
                    arguments = bSHArguments.getArguments(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                } catch (C3353Ujhhgtgfeyxiexzf e2) {
                    throw new C0712Ujhhgtgfeyxiexzf("Error evaluating constructor args: " + e2, e2);
                }
            }
            Class[] clsArrM563Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m563Ujhhgtgfeyxiexzf(arguments);
            Object[] objArrUnwrap = Primitive.unwrap(arguments);
            if (str.equals("super")) {
                int iM523Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m523Ujhhgtgfeyxiexzf(clsArrM563Ujhhgtgfeyxiexzf, ((C2570Ujhhgtgfeyxiexzf) C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls)).m3828Ujhhgtgfeyxiexzf(cls.getName()));
                if (iM523Ujhhgtgfeyxiexzf != -1) {
                    return new ConstructorArgs(iM523Ujhhgtgfeyxiexzf, objArrUnwrap);
                }
                throw new C0712Ujhhgtgfeyxiexzf("can't find super constructor for args!");
            }
            int iM522Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m522Ujhhgtgfeyxiexzf(clsArrM563Ujhhgtgfeyxiexzf, Arrays.asList(c0025UjhhgtgfeyxiexzfArr));
            if (iM522Ujhhgtgfeyxiexzf == -1) {
                throw new C0712Ujhhgtgfeyxiexzf("can't find this constructor for args!");
            }
            int size = ((C2570Ujhhgtgfeyxiexzf) C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls)).m3828Ujhhgtgfeyxiexzf(cls.getName()).size();
            int i3 = iM522Ujhhgtgfeyxiexzf + size;
            if (i3 != size + i) {
                return new ConstructorArgs(i3, objArrUnwrap);
            }
            throw new C0712Ujhhgtgfeyxiexzf("Recursive constructor call.");
        } catch (Exception e3) {
            throw new C0712Ujhhgtgfeyxiexzf("Unable to get instance initializers: " + e3, e3);
        }
    }

    public static This getThis(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        return new This(c0029Ujhhgtgfeyxiexzf, runnableC0026Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static This initClassInstanceThis(Object obj, String str) {
        This thisM525Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m525Ujhhgtgfeyxiexzf(obj, str);
        if (thisM525Ujhhgtgfeyxiexzf != null) {
            return thisM525Ujhhgtgfeyxiexzf;
        }
        This thisM527Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m527Ujhhgtgfeyxiexzf(obj.getClass(), str);
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf = thisM527Ujhhgtgfeyxiexzf.getNameSpace().m360Ujhhgtgfeyxiexzf();
        ThreadLocal<C0029Ujhhgtgfeyxiexzf> threadLocal = CONTEXT_NAMESPACE;
        if (threadLocal.get() != null) {
            C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = threadLocal.get();
            c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf.f535Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf;
            if (c0029Ujhhgtgfeyxiexzf == null) {
                c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf.m382feyxiexzfUjhhgtg();
            }
        }
        ThreadLocal<RunnableC0026Ujhhgtgfeyxiexzf> threadLocal2 = CONTEXT_INTERPRETER;
        This thisMo299Ujhhgtgfeyxiexzf = threadLocal2.get() != null ? c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf.mo299Ujhhgtgfeyxiexzf(threadLocal2.get()) : c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf.mo299Ujhhgtgfeyxiexzf(thisM527Ujhhgtgfeyxiexzf.declaringInterpreter);
        try {
            AbstractC0033Ujhhgtgfeyxiexzf.m531Ujhhgtgfeyxiexzf(obj, Keys.BSHTHIS + str).m1194Ujhhgtgfeyxiexzf(thisMo299Ujhhgtgfeyxiexzf, false);
            c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf.f553Ujhhgtgfeyxiexzf = obj;
            c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf.f541Ujhhgtgfeyxiexzf.remove(obj);
            c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf.f541Ujhhgtgfeyxiexzf.add(0, obj);
            c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf.m384feyxiexzfUjhhgtg();
            try {
                BSHBlock bSHBlock = (BSHBlock) thisM527Ujhhgtgfeyxiexzf.getNameSpace().m375Ujhhgtgfeyxiexzf(Keys.BSHINIT.toString(), true);
                try {
                    C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg = new C2637feyxiexzfUjhhgtg(c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf);
                    RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf = thisMo299Ujhhgtgfeyxiexzf.declaringInterpreter;
                    Boolean bool = Boolean.TRUE;
                    bSHBlock.evalBlock(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, bool, C0022Ujhhgtgfeyxiexzf.f487Ujhhgtgfeyxiexzf);
                    bSHBlock.evalBlock(new C2637feyxiexzfUjhhgtg(c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf), thisMo299Ujhhgtgfeyxiexzf.declaringInterpreter, bool, C0022Ujhhgtgfeyxiexzf.f486Ujhhgtgfeyxiexzf);
                    return thisMo299Ujhhgtgfeyxiexzf;
                } catch (Exception e) {
                    throw new C0712Ujhhgtgfeyxiexzf("Error in class instance This initialization: " + e, e);
                }
            } catch (Exception e2) {
                throw new C0712Ujhhgtgfeyxiexzf("unable to get instance initializer: " + e2, e2);
            }
        } catch (Exception e3) {
            throw new C0712Ujhhgtgfeyxiexzf("Error in class gen setup: " + e3, e3);
        }
    }

    public static void initInstance(InterfaceC3567Ujhhgtgfeyxiexzf interfaceC3567Ujhhgtgfeyxiexzf, String str, Object[] objArr) {
        try {
            This thisInitClassInstanceThis = initClassInstanceThis(interfaceC3567Ujhhgtgfeyxiexzf, str);
            C0029Ujhhgtgfeyxiexzf nameSpace = thisInitClassInstanceThis.getNameSpace();
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = interfaceC3567Ujhhgtgfeyxiexzf.getClass(); superclass != null && !superclass.getSimpleName().equals(str); superclass = superclass.getSuperclass()) {
                arrayList.add(0, superclass.getSimpleName());
            }
            arrayList.forEach(new C2572Ujhhgtgfeyxiexzf(1));
            if (nameSpace.f551Ujhhgtgfeyxiexzf) {
                ThreadLocal<Map<String, Object[]>> threadLocal = CONTEXT_ARGS;
                if (threadLocal.get().containsKey(interfaceC3567Ujhhgtgfeyxiexzf.toString())) {
                    objArr = threadLocal.get().remove(interfaceC3567Ujhhgtgfeyxiexzf.toString());
                }
            }
            Object[] objArr2 = objArr;
            C0021Ujhhgtgfeyxiexzf c0021UjhhgtgfeyxiexzfM369Ujhhgtgfeyxiexzf = nameSpace.m369Ujhhgtgfeyxiexzf(AbstractC0034Ujhhgtgfeyxiexzf.m560Ujhhgtgfeyxiexzf(str), AbstractC0034Ujhhgtgfeyxiexzf.m563Ujhhgtgfeyxiexzf(objArr2), true);
            if (objArr2.length > 0 && c0021UjhhgtgfeyxiexzfM369Ujhhgtgfeyxiexzf == null) {
                throw new C0712Ujhhgtgfeyxiexzf("Can't find constructor: " + AbstractC3594Ujhhgtgfeyxiexzf.m5187Ujhhgtgfeyxiexzf(str, AbstractC0034Ujhhgtgfeyxiexzf.m563Ujhhgtgfeyxiexzf(objArr2)));
            }
            if (c0021UjhhgtgfeyxiexzfM369Ujhhgtgfeyxiexzf != null) {
                c0021UjhhgtgfeyxiexzfM369Ujhhgtgfeyxiexzf.m316Ujhhgtgfeyxiexzf(objArr2, thisInitClassInstanceThis.declaringInterpreter, null, null, false, null);
            }
            for (C1853Ujhhgtgfeyxiexzf c1853Ujhhgtgfeyxiexzf : AbstractC0033Ujhhgtgfeyxiexzf.m540Ujhhgtgfeyxiexzf(AbstractC0033Ujhhgtgfeyxiexzf.m539Ujhhgtgfeyxiexzf(interfaceC3567Ujhhgtgfeyxiexzf))) {
                c1853Ujhhgtgfeyxiexzf.m3190Ujhhgtgfeyxiexzf(false);
            }
        } catch (Exception e) {
            Exception exc = e;
            if (exc instanceof C1985Ujhhgtgfeyxiexzf) {
                exc = (Exception) ((C1985Ujhhgtgfeyxiexzf) exc).m3339Ujhhgtgfeyxiexzf();
            }
            if (exc instanceof InvocationTargetException) {
                exc = (Exception) exc.getCause();
            }
            throw new C0712Ujhhgtgfeyxiexzf("Error in class instance initialization: " + exc, exc);
        }
    }

    public static void initStatic(Class<?> cls) throws C1863Ujhhgtgfeyxiexzf {
        String simpleName = cls.getSimpleName();
        try {
            This thisM527Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m527Ujhhgtgfeyxiexzf(cls, simpleName);
            C0029Ujhhgtgfeyxiexzf nameSpace = thisM527Ujhhgtgfeyxiexzf.getNameSpace();
            RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf = thisM527Ujhhgtgfeyxiexzf.declaringInterpreter;
            if (runnableC0026Ujhhgtgfeyxiexzf == null) {
                throw new C1863Ujhhgtgfeyxiexzf("No namespace or interpreter for statitc This. Start interpreter for class not implemented yet.");
            }
            BSHBlock bSHBlock = (BSHBlock) nameSpace.m375Ujhhgtgfeyxiexzf(Keys.BSHINIT.toString(), true);
            C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg = new C2637feyxiexzfUjhhgtg(nameSpace);
            Boolean bool = Boolean.TRUE;
            bSHBlock.evalBlock(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, bool, C0022Ujhhgtgfeyxiexzf.f485Ujhhgtgfeyxiexzf);
            bSHBlock.evalBlock(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, bool, C0022Ujhhgtgfeyxiexzf.f484Ujhhgtgfeyxiexzf);
            for (C1853Ujhhgtgfeyxiexzf c1853Ujhhgtgfeyxiexzf : AbstractC0033Ujhhgtgfeyxiexzf.m540Ujhhgtgfeyxiexzf(nameSpace)) {
                c1853Ujhhgtgfeyxiexzf.m3190Ujhhgtgfeyxiexzf(true);
            }
        } catch (Exception e) {
            StringBuilder sbM2419Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2419Ujhhgtgfeyxiexzf("Exception in static init block <clinit> for class ", simpleName, ". With message: ");
            sbM2419Ujhhgtgfeyxiexzf.append(e.getMessage());
            throw new C1863Ujhhgtgfeyxiexzf(sbM2419Ujhhgtgfeyxiexzf.toString(), e);
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
        Map<String, C0029Ujhhgtgfeyxiexzf> map = contextStore;
        return map.containsKey(str) ? map.remove(str).mo299Ujhhgtgfeyxiexzf(null) : getThis(null, null);
    }

    public static void registerConstructorContext(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        if (c2637feyxiexzfUjhhgtg != null) {
            CONTEXT_NAMESPACE.set(c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf());
        } else {
            CONTEXT_NAMESPACE.remove();
        }
        if (runnableC0026Ujhhgtgfeyxiexzf != null) {
            CONTEXT_INTERPRETER.set(runnableC0026Ujhhgtgfeyxiexzf);
        } else {
            CONTEXT_INTERPRETER.remove();
        }
    }

    public Object cloneMethodImpl(Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) {
        return cloneMethodImpl(node, c2637feyxiexzfUjhhgtg, null);
    }

    public Object[] enumValues() {
        Class cls = getNameSpace().f552Ujhhgtgfeyxiexzf;
        Object[] objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
        return Stream.of((Object[]) cls.getFields()).filter(new C1298feyxiexzfUjhhgtg(4, cls)).map(new C1297feyxiexzfUjhhgtg(23)).filter(new C2574Ujhhgtgfeyxiexzf(5)).toArray(new C2390Ujhhgtgfeyxiexzf(3, cls));
    }

    public Object getInterface(Class<?> cls) {
        return getInterface(new Class[]{cls});
    }

    public C0029Ujhhgtgfeyxiexzf getNameSpace() {
        return this.namespace;
    }

    public Object invokeMethod(String str, Object[] objArr) {
        return invokeMethod(str, objArr, null, null, null, false);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            invokeMethod("run", AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf);
        } catch (C3353Ujhhgtgfeyxiexzf e) {
            this.declaringInterpreter.m336Ujhhgtgfeyxiexzf("Exception in runnable:" + e);
        }
    }

    public String toString() {
        C0021Ujhhgtgfeyxiexzf c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m533Ujhhgtgfeyxiexzf(this.namespace, "toString", new Class[0], true);
        if (c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf != null) {
            try {
                return (String) c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf.m316Ujhhgtgfeyxiexzf(new Object[0], this.declaringInterpreter, null, null, false, null);
            } catch (C3353Ujhhgtgfeyxiexzf unused) {
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

    public Object cloneMethodImpl(Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, Object obj) throws C3353Ujhhgtgfeyxiexzf {
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = new C0029Ujhhgtgfeyxiexzf(this.namespace.f535Ujhhgtgfeyxiexzf, null, AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), this.namespace.f534Ujhhgtgfeyxiexzf, " clone"));
        if (obj == null) {
            try {
                Class cls = this.namespace.f552Ujhhgtgfeyxiexzf;
                if (cls == null) {
                    return c0029Ujhhgtgfeyxiexzf.mo299Ujhhgtgfeyxiexzf(this.declaringInterpreter);
                }
                obj = cls.getConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                e = e;
                throw new C3353Ujhhgtgfeyxiexzf("Unable to clone from This reference: " + e.getMessage(), node, c2637feyxiexzfUjhhgtg);
            } catch (IllegalArgumentException e2) {
                e = e2;
                throw new C3353Ujhhgtgfeyxiexzf("Unable to clone from This reference: " + e.getMessage(), node, c2637feyxiexzfUjhhgtg);
            } catch (InstantiationException e3) {
                e = e3;
                throw new C3353Ujhhgtgfeyxiexzf("Unable to clone from This reference: " + e.getMessage(), node, c2637feyxiexzfUjhhgtg);
            } catch (NoSuchMethodException e4) {
                e = e4;
                throw new C3353Ujhhgtgfeyxiexzf("Unable to clone from This reference: " + e.getMessage(), node, c2637feyxiexzfUjhhgtg);
            } catch (SecurityException e5) {
                e = e5;
                throw new C3353Ujhhgtgfeyxiexzf("Unable to clone from This reference: " + e.getMessage(), node, c2637feyxiexzfUjhhgtg);
            } catch (InvocationTargetException e6) {
                e = e6;
                throw new C3353Ujhhgtgfeyxiexzf("Unable to clone from This reference: " + e.getMessage(), node, c2637feyxiexzfUjhhgtg);
            } catch (C1863Ujhhgtgfeyxiexzf e7) {
                throw e7.mo2570Ujhhgtgfeyxiexzf("Unable to assign clone instance This: " + e7.getMessage(), node, c2637feyxiexzfUjhhgtg);
            }
        }
        c0029Ujhhgtgfeyxiexzf.f553Ujhhgtgfeyxiexzf = obj;
        c0029Ujhhgtgfeyxiexzf.f541Ujhhgtgfeyxiexzf.remove(obj);
        c0029Ujhhgtgfeyxiexzf.f541Ujhhgtgfeyxiexzf.add(0, obj);
        c0029Ujhhgtgfeyxiexzf.m384feyxiexzfUjhhgtg();
        Class cls2 = this.namespace.f552Ujhhgtgfeyxiexzf;
        c0029Ujhhgtgfeyxiexzf.f552Ujhhgtgfeyxiexzf = cls2;
        c0029Ujhhgtgfeyxiexzf.m378Ujhhgtgfeyxiexzf(cls2);
        c0029Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf = true;
        c0029Ujhhgtgfeyxiexzf.f548Ujhhgtgfeyxiexzf = true;
        for (C1853Ujhhgtgfeyxiexzf c1853Ujhhgtgfeyxiexzf : this.namespace.m377Ujhhgtgfeyxiexzf()) {
            c0029Ujhhgtgfeyxiexzf.m386feyxiexzfUjhhgtg(c1853Ujhhgtgfeyxiexzf);
        }
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf2 = new C0029Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf, null, null);
        c0029Ujhhgtgfeyxiexzf2.f553Ujhhgtgfeyxiexzf = obj;
        c0029Ujhhgtgfeyxiexzf2.f541Ujhhgtgfeyxiexzf.remove(obj);
        c0029Ujhhgtgfeyxiexzf2.f541Ujhhgtgfeyxiexzf.add(0, obj);
        c0029Ujhhgtgfeyxiexzf2.m384feyxiexzfUjhhgtg();
        Class cls3 = c0029Ujhhgtgfeyxiexzf.f552Ujhhgtgfeyxiexzf;
        c0029Ujhhgtgfeyxiexzf2.f552Ujhhgtgfeyxiexzf = cls3;
        c0029Ujhhgtgfeyxiexzf2.m378Ujhhgtgfeyxiexzf(cls3);
        c0029Ujhhgtgfeyxiexzf2.f549Ujhhgtgfeyxiexzf = true;
        c0029Ujhhgtgfeyxiexzf2.f548Ujhhgtgfeyxiexzf = true;
        for (C0021Ujhhgtgfeyxiexzf c0021Ujhhgtgfeyxiexzf : this.namespace.m370Ujhhgtgfeyxiexzf()) {
            C0021Ujhhgtgfeyxiexzf c0021UjhhgtgfeyxiexzfM308Ujhhgtgfeyxiexzf = c0021Ujhhgtgfeyxiexzf.clone();
            c0021UjhhgtgfeyxiexzfM308Ujhhgtgfeyxiexzf.f467Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf2;
            c0029Ujhhgtgfeyxiexzf.mo302feyxiexzfUjhhgtg(c0021UjhhgtgfeyxiexzfM308Ujhhgtgfeyxiexzf);
        }
        AbstractC0033Ujhhgtgfeyxiexzf.m531Ujhhgtgfeyxiexzf(obj, Keys.BSHTHIS + c0029Ujhhgtgfeyxiexzf.f552Ujhhgtgfeyxiexzf.getSimpleName()).m1194Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf.mo299Ujhhgtgfeyxiexzf(this.declaringInterpreter), false);
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

    public Object invokeMethod(String str, Object[] objArr, boolean z) throws C3354Ujhhgtgfeyxiexzf {
        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg = new C2637feyxiexzfUjhhgtg(this.namespace);
        Node nodeM372Ujhhgtgfeyxiexzf = this.namespace.m372Ujhhgtgfeyxiexzf();
        this.namespace.f547Ujhhgtgfeyxiexzf = null;
        try {
            Object objInvokeMethod = invokeMethod(str, objArr, this.declaringInterpreter, c2637feyxiexzfUjhhgtg, nodeM372Ujhhgtgfeyxiexzf, z);
            return (!(objInvokeMethod instanceof Primitive) || objInvokeMethod == Primitive.VOID) ? objInvokeMethod : ((Primitive) objInvokeMethod).getValue();
        } catch (Exception e) {
            throw new C3354Ujhhgtgfeyxiexzf(e.getMessage(), nodeM372Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, e);
        }
    }

    public Object invokeMethod(String str, Object[] objArr, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, Node node, boolean z) throws C3354Ujhhgtgfeyxiexzf {
        if (objArr == null) {
            objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
        }
        Object[] objArr2 = objArr;
        if (runnableC0026Ujhhgtgfeyxiexzf == null) {
            runnableC0026Ujhhgtgfeyxiexzf = this.declaringInterpreter;
        }
        RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf2 = runnableC0026Ujhhgtgfeyxiexzf;
        if (runnableC0026Ujhhgtgfeyxiexzf2.f519Ujhhgtgfeyxiexzf == null) {
            runnableC0026Ujhhgtgfeyxiexzf2.m344Ujhhgtgfeyxiexzf(this.namespace);
        }
        if (c2637feyxiexzfUjhhgtg == null) {
            c2637feyxiexzfUjhhgtg = new C2637feyxiexzfUjhhgtg(this.namespace);
        }
        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg2 = c2637feyxiexzfUjhhgtg;
        if (node == null) {
            node = Node.JAVACODE;
        }
        Node node2 = node;
        Class[] clsArrM563Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m563Ujhhgtgfeyxiexzf(objArr2);
        C0021Ujhhgtgfeyxiexzf c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m533Ujhhgtgfeyxiexzf(this.namespace, str, clsArrM563Ujhhgtgfeyxiexzf, z);
        if (c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf != null) {
            return c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf.m316Ujhhgtgfeyxiexzf(objArr2, runnableC0026Ujhhgtgfeyxiexzf2, c2637feyxiexzfUjhhgtg2, node2, false, null);
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
            return cloneMethodImpl(node2, c2637feyxiexzfUjhhgtg2);
        }
        boolean[] zArr = new boolean[1];
        Object objM380feyxiexzfUjhhgtg = this.namespace.m380feyxiexzfUjhhgtg(str, objArr2, runnableC0026Ujhhgtgfeyxiexzf2, c2637feyxiexzfUjhhgtg2, node2, zArr);
        if (zArr[0]) {
            return objM380feyxiexzfUjhhgtg;
        }
        try {
            return this.namespace.m379feyxiexzfUjhhgtg(str, objArr2, runnableC0026Ujhhgtgfeyxiexzf2, c2637feyxiexzfUjhhgtg2, node2, true);
        } catch (C3353Ujhhgtgfeyxiexzf e) {
            throw new C3354Ujhhgtgfeyxiexzf("Method " + AbstractC3594Ujhhgtgfeyxiexzf.m5187Ujhhgtgfeyxiexzf(str, clsArrM563Ujhhgtgfeyxiexzf) + " not found in bsh scripted object: " + this.namespace.f534Ujhhgtgfeyxiexzf, node2, c2637feyxiexzfUjhhgtg2, e);
        }
    }
}
