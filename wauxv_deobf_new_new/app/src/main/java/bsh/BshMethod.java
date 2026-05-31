package bsh;

import bsh.This;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.IntStream;
import p000.AbstractC1687;
import p000.AbstractC2240;
import p000.C0278;
import p000.C0456;
import p000.C0461;
import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.C1684;
import p000.C1910;
import p000.C2011;
import p000.C2573;
import p000.C2954;
import p000.C3581;
import p000.InterfaceC0455;
import p000.InterfaceC0476;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class BshMethod implements Serializable, Cloneable, InterfaceC0455 {
    private static final long serialVersionUID = 1;
    private Class<?>[] cparamTypes;
    private Class<?> creturnType;
    C0012 declaringNameSpace;
    protected boolean isExtension;
    protected boolean isScriptedObject;
    protected boolean isVarArgs;
    private AbstractC1687 javaMethod;
    private Object javaObject;
    protected BSHBlock methodBody;
    private transient InterfaceC0476 methodCallback;
    Modifiers modifiers;
    private String name;
    private int paramCount;
    private Modifiers[] paramModifiers;
    private String[] paramNames;
    protected Class<?> receiverType;
    private boolean reload;

    public BshMethod(Method method, Object obj) {
        this(new C2011(method), obj);
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    private Object invokeImpl(Object[] objArr, RunnableC0008 runnableC0008, C0527 c0527, Node node, boolean z, Object obj) throws C1231 {
        C0012 c0012;
        Object objNewInstance;
        ReturnControl returnControl;
        This thisM526;
        Object obj2;
        C0527 c0528 = c0527;
        Node node2 = node;
        if (hasModifier("abstract")) {
            throw new C1231("Cannot invoke abstract method " + this.name, node2, c0528);
        }
        Class<?> returnType = getReturnType();
        Class<?>[] parameterTypes = getParameterTypes();
        if (c0528 == null) {
            c0528 = new C0527(this.declaringNameSpace);
        }
        C0527 c0529 = c0528;
        Object[] objArr2 = objArr == null ? AbstractC0016.f568 : objArr;
        if (!isVarArgs() && objArr2.length != getParameterCount()) {
            throw new C1231("Wrong number of arguments for local method: " + this.name, node2, c0529);
        }
        int i = 1;
        if (z) {
            c0012 = c0529.m2024();
        } else {
            c0012 = new C0012(this.declaringNameSpace, null, this.name);
            c0012.f534 = true;
        }
        if (this.isExtension && obj != null) {
            Object objUnwrap = Primitive.unwrap(obj);
            c0012.f527.remove(objUnwrap);
            c0012.f527.add(0, objUnwrap);
            c0012.m385();
            try {
                c0012.mo317("" + This.Keys.BSHEXTENSIONMETHODRECEIVER, obj, false);
            } catch (C3581 unused) {
            }
        }
        c0012.f533 = node2;
        int parameterCount = getParameterCount() - 1;
        if (isVarArgs()) {
            Class<?> cls = parameterTypes[parameterCount];
            if (!(getParameterCount() == objArr2.length && ((obj2 = objArr2[parameterCount]) == null || (obj2.getClass().isArray() && cls.getComponentType().isAssignableFrom(objArr2[parameterCount].getClass().getComponentType())))) && objArr2.length >= getParameterCount() - 1) {
                objNewInstance = Array.newInstance(parameterTypes[parameterCount].getComponentType(), objArr2.length - parameterCount);
            } else {
                objNewInstance = null;
            }
        } else {
            objNewInstance = null;
        }
        int i2 = 0;
        while (i2 < objArr2.length) {
            int i3 = i2 >= parameterCount ? parameterCount : i2;
            Class<?> componentType = (objNewInstance == null || i3 != parameterCount) ? parameterTypes[i3] : parameterTypes[i3].getComponentType();
            if (componentType != null) {
                try {
                    Object objM559 = AbstractC0017.m559(i, componentType, objArr2[i2]);
                    objArr2[i2] = objM559;
                    if (objNewInstance == null || i2 < parameterCount) {
                        c0012.m386(this.paramNames[i3], componentType, objM559, this.paramModifiers[i3]);
                    } else {
                        try {
                            Array.set(objNewInstance, i2 - i3, Primitive.unwrap(objM559));
                        } catch (C3581 e) {
                            throw e.mo4678("Typed method parameter assignment", node2, c0529);
                        }
                    }
                } catch (C3581 e2) {
                    throw new C1231("Invalid argument: `" + this.paramNames[i3] + "' for method: " + this.name + " : " + e2.getMessage(), node2, c0529);
                }
            } else {
                Object obj3 = objArr2[i2];
                if (obj3 == Primitive.VOID) {
                    throw new C1231("Undefined variable or class name, parameter: " + this.paramNames[i3] + " to method: " + this.name, node2, c0529);
                }
                try {
                    String str = this.paramNames[i3];
                    runnableC0008.getClass();
                    c0012.mo317(str, obj3, false);
                } catch (C3581 e3) {
                    throw e3.mo4678("Typed method parameter assignment", node2, c0529);
                }
            }
            i2++;
            i = 1;
        }
        if (objNewInstance != null) {
            try {
                c0012.m386(this.paramNames[parameterCount], parameterTypes[parameterCount], objNewInstance, this.paramModifiers[parameterCount]);
            } catch (C3581 e4) {
                throw e4.mo4678("Typed method parameter assignment", node2, c0529);
            }
        }
        if (!z) {
            c0529.m2022(c0012);
        }
        try {
            Object objEval = this.methodBody.eval(c0529, runnableC0008, Boolean.TRUE);
            C0527 c05210 = new C0527();
            c05210.f2221.addAll(c0529.f2221);
            if (!z) {
                c0529.m2021();
            }
            boolean z2 = objEval instanceof ReturnControl;
            Class<?> cls2 = Void.TYPE;
            if (z2) {
                returnControl = (ReturnControl) objEval;
                if (returnControl.kind != 47) {
                    throw new C1232("'continue' or 'break' in method body", returnControl.returnPoint, c05210);
                }
                objEval = returnControl.value;
                if (returnType == cls2 && objEval != Primitive.VOID) {
                    throw new C1232("Cannot return value from void method", returnControl.returnPoint, c05210);
                }
            } else {
                returnControl = null;
            }
            if (returnType != null) {
                if (returnType == cls2) {
                    return Primitive.VOID;
                }
                try {
                    objEval = AbstractC0017.m559(1, returnType, objEval);
                } catch (C3581 e5) {
                    if (returnControl != null) {
                        node2 = returnControl.returnPoint;
                    }
                    throw e5.mo4678("Incorrect type returned from method: " + this.name + e5.getMessage(), node2, c0529);
                }
            }
            return (!"clone".equals(getName()) || (thisM526 = AbstractC0016.m526(objEval, objEval.getClass().getSimpleName())) == null) ? objEval : thisM526.cloneMethodImpl(node2, c0529, objEval);
        } catch (Throwable th) {
            if (!z) {
                c0529.m2021();
            }
            throw th;
        }
    }

    private Object invokeMethodCallback(Object[] objArr, Node node, C0527 c0527) throws C1231 {
        if (objArr == null) {
            objArr = AbstractC0016.f568;
        }
        Class<?>[] parameterTypes = getParameterTypes();
        if (parameterTypes == null || parameterTypes.length == 0) {
            return this.methodCallback.mo1848(objArr);
        }
        String[] parameterNames = getParameterNames();
        for (int i = 0; i < objArr.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls != null) {
                try {
                    objArr[i] = Primitive.unwrap(AbstractC0017.m559(1, cls, objArr[i]));
                } catch (C3581 e) {
                    throw new C1231("Invalid argument: `" + parameterNames[i] + "' for method: " + this.name + " : " + e.getMessage(), node, c0527);
                }
            }
        }
        return this.methodCallback.mo1848(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getParameterNames$0(Integer num) {
        return String.valueOf((char) num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$getParameterNames$1(int i) {
        return new String[i];
    }

    private void reloadTypes() {
        if (!this.reload) {
            return;
        }
        int i = 0;
        try {
            this.reload = false;
            if (AbstractC0016.m546(this.creturnType)) {
                this.creturnType = this.declaringNameSpace.m363(this.creturnType.getName());
            }
            while (true) {
                Class<?>[] clsArr = this.cparamTypes;
                if (i >= clsArr.length) {
                    return;
                }
                if (AbstractC0016.m546(clsArr[i])) {
                    Class<?>[] clsArr2 = this.cparamTypes;
                    clsArr2[i] = this.declaringNameSpace.m363(clsArr2[i].getName());
                }
                i++;
            }
        } catch (C3581 unused) {
        }
    }

    @Override // p000.InterfaceC0455
    public void classLoaderChanged() {
        this.reload = AbstractC0016.m546(this.creturnType) || Arrays.asList(this.cparamTypes).stream().anyMatch(new C0456(2));
    }

    public boolean equals(Object obj) {
        boolean z;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        BshMethod bshMethod = (BshMethod) obj;
        if (!this.name.equals(bshMethod.name) || getParameterCount() != bshMethod.getParameterCount() || (z = this.isExtension) != bshMethod.isExtension) {
            return false;
        }
        if (z && !equal(this.receiverType, bshMethod.receiverType)) {
            return false;
        }
        for (int i = 0; i < getParameterCount(); i++) {
            if (!equal(getParameterTypes()[i], bshMethod.getParameterTypes()[i])) {
                return false;
            }
        }
        return true;
    }

    public Modifiers getModifiers() {
        if (this.modifiers == null) {
            this.modifiers = new Modifiers(2);
        }
        return this.modifiers;
    }

    public String getName() {
        AbstractC1687 abstractC1687 = this.javaMethod;
        return abstractC1687 == null ? this.name : abstractC1687.f5671;
    }

    public int getParameterCount() {
        AbstractC1687 abstractC1687 = this.javaMethod;
        return abstractC1687 == null ? this.paramCount : abstractC1687.mo3008();
    }

    public Modifiers[] getParameterModifiers() {
        if (this.paramModifiers == null) {
            this.paramModifiers = new Modifiers[getParameterCount()];
        }
        return this.paramModifiers;
    }

    public String[] getParameterNames() {
        if (this.paramNames == null) {
            this.paramNames = (String[]) IntStream.range(97, getParameterCount() + 97).boxed().map(new C0278(5)).toArray(new C0461(2));
        }
        return this.paramNames;
    }

    public Class<?>[] getParameterTypes() {
        AbstractC1687 abstractC1687 = this.javaMethod;
        if (abstractC1687 != null) {
            return abstractC1687.mo3009();
        }
        reloadTypes();
        return this.cparamTypes;
    }

    public Class<?> getReturnType() {
        AbstractC1687 abstractC1687 = this.javaMethod;
        if (abstractC1687 != null) {
            return abstractC1687.mo2461();
        }
        reloadTypes();
        return this.creturnType;
    }

    public boolean hasModifier(String str) {
        AbstractC1687 abstractC1687 = this.javaMethod;
        if (abstractC1687 == null) {
            Modifiers modifiers = this.modifiers;
            return modifiers != null && modifiers.hasModifier(str);
        }
        int i = abstractC1687.f5672;
        Object[] objArr = AbstractC0016.f568;
        return Modifier.toString(i).contains(str);
    }

    public int hashCode() {
        int iHashCode = (Boolean.hashCode(this.isExtension) + ((getClass().hashCode() + this.name.hashCode()) * 31)) * 31;
        Class<?> cls = this.receiverType;
        int iHashCode2 = iHashCode + (cls == null ? 0 : cls.hashCode());
        Class<?>[] parameterTypes = getParameterTypes();
        int length = parameterTypes.length;
        for (int i = 0; i < length; i++) {
            Class<?> cls2 = parameterTypes[i];
            iHashCode2 += (cls2 == null ? 0 : cls2.hashCode()) + 3;
        }
        return getParameterCount() + iHashCode2;
    }

    public Object invoke(Object[] objArr, RunnableC0008 runnableC0008) {
        return invoke(objArr, runnableC0008, null, null, false);
    }

    public boolean isVarArgs() {
        AbstractC1687 abstractC1687 = this.javaMethod;
        return abstractC1687 == null ? this.isVarArgs : abstractC1687.mo3011();
    }

    public String toString() {
        return "Method: " + AbstractC2240.m4260(this);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BshMethod m297clone() {
        try {
            return (BshMethod) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Object invoke(Object[] objArr, RunnableC0008 runnableC0008, C0527 c0527, Node node) {
        return invoke(objArr, runnableC0008, c0527, node, false);
    }

    public BshMethod(String str, Class<?> cls, String[] strArr, Class<?>[] clsArr, Modifiers[] modifiersArr, BSHBlock bSHBlock, C0012 c0012, Modifiers modifiers, boolean z) {
        this.isScriptedObject = false;
        this.isExtension = false;
        this.receiverType = null;
        this.reload = false;
        this.name = str;
        this.creturnType = cls;
        this.paramNames = strArr;
        this.paramModifiers = modifiersArr;
        if (strArr != null) {
            this.paramCount = strArr.length;
        } else if (clsArr != null) {
            this.paramCount = clsArr.length;
        }
        this.cparamTypes = clsArr;
        this.methodBody = bSHBlock;
        this.declaringNameSpace = c0012;
        this.modifiers = modifiers;
        this.isVarArgs = z;
    }

    public Object invoke(Object[] objArr, RunnableC0008 runnableC0008, C0527 c0527, Node node, boolean z, Object obj) throws C1231 {
        Object objM364;
        Object objInvokeImpl;
        RunnableC0008.m333("Bsh method invoke: ", this.name, " overrideNameSpace: ", Boolean.valueOf(z));
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    throw new Error("HERE!");
                }
            }
        }
        if (this.methodCallback != null) {
            return invokeMethodCallback(objArr, node, c0527);
        }
        AbstractC1687 abstractC1687 = this.javaMethod;
        if (abstractC1687 != null) {
            try {
                Object[] objArr2 = AbstractC0016.f568;
                if (Modifier.isStatic(abstractC1687.getModifiers())) {
                    C1910 c1910 = RunnableC0008.f502;
                    AbstractC1687 abstractC1688 = this.javaMethod;
                    c1910.m3845(abstractC1688.f5673, abstractC1688.f5671, objArr);
                } else {
                    RunnableC0008.f502.m3844(this.javaObject, this.javaMethod.f5671, objArr);
                }
                return this.javaMethod.mo3115(this.javaObject, objArr);
            } catch (InvocationTargetException e) {
                throw new C2954("Exception invoking imported object method.", e, node, c0527, true);
            } catch (C2573 e2) {
                throw new C1231("Error invoking Java method: " + e2, node, c0527);
            } catch (C3581 e3) {
                throw e3.mo4677(node, c0527);
            }
        }
        Modifiers modifiers = this.modifiers;
        if (modifiers != null && modifiers.hasModifier("synchronized")) {
            C0012 c0012 = this.declaringNameSpace;
            if (c0012.f535) {
                try {
                    objM364 = c0012.m364();
                } catch (C3581 unused) {
                    throw new C1684("Can't get class instance for synchronized method.");
                }
            } else {
                objM364 = c0012.mo313(runnableC0008);
            }
            synchronized (objM364) {
                objInvokeImpl = invokeImpl(objArr, runnableC0008, c0527, node, z, obj);
            }
            return objInvokeImpl;
        }
        return invokeImpl(objArr, runnableC0008, c0527, node, z, obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BshMethod(BSHMethodDeclaration bSHMethodDeclaration, C0012 c0012, Modifiers modifiers, boolean z) {
        String str = bSHMethodDeclaration.name;
        Class<?> cls = bSHMethodDeclaration.returnType;
        String[] paramNames = bSHMethodDeclaration.paramsNode.getParamNames();
        BSHFormalParameters bSHFormalParameters = bSHMethodDeclaration.paramsNode;
        this(str, cls, paramNames, bSHFormalParameters.paramTypes, bSHFormalParameters.getParamModifiers(), bSHMethodDeclaration.blockNode, c0012, modifiers, bSHMethodDeclaration.isVarArgs);
        this.isScriptedObject = z;
        this.isExtension = bSHMethodDeclaration.isExtension;
        this.receiverType = bSHMethodDeclaration.receiverType;
    }

    public BshMethod(AbstractC1687 abstractC1687, Object obj) {
        this(abstractC1687.f5671, abstractC1687.mo2461(), null, abstractC1687.mo3009(), null, null, null, null, abstractC1687.mo3011());
        this.javaMethod = abstractC1687;
        this.javaObject = obj;
    }

    public BshMethod(String str, Class<?>[] clsArr, InterfaceC0476 interfaceC0476) {
        this(str, null, null, clsArr, null, null, null, null, false);
        this.methodCallback = interfaceC0476;
    }

    public Object invoke(Object[] objArr, RunnableC0008 runnableC0008, C0527 c0527, Node node, boolean z) {
        return invoke(objArr, runnableC0008, c0527, node, z, null);
    }

    private Object invokeImpl(Object[] objArr, RunnableC0008 runnableC0008, C0527 c0527, Node node, boolean z) {
        return invokeImpl(objArr, runnableC0008, c0527, node, z, null);
    }
}
