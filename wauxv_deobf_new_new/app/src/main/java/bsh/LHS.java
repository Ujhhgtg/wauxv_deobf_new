package bsh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC1468;
import p000.AbstractC1687;
import p000.C0457;
import p000.C0458;
import p000.C1684;
import p000.C1910;
import p000.C2573;
import p000.C3524;
import p000.C3581;
import p000.C3582;
import p000.InterfaceC2374;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class LHS implements InterfaceC2374, Serializable {
    static final int FIELD = 1;
    static final int INDEX = 3;
    static final int LOOSETYPE_FIELD = 5;
    static final int MAP_ENTRY = 6;
    static final int METHOD_EVAL = 4;
    static final int PROPERTY = 2;
    static final int VARIABLE = 0;
    private static final long serialVersionUID = 1;
    AbstractC1687 field;
    int index;
    boolean localVar;
    C0012 nameSpace;
    Object object;
    Object propName;
    int type;
    Variable var;
    String varName;

    public LHS(C0012 c0012, String str, boolean z) {
        this.type = 0;
        this.localVar = z;
        this.varName = str;
        this.nameSpace = c0012;
    }

    private Object getValueImpl() throws C3581 {
        int i = this.type;
        if (i == 0) {
            C0012 c0012 = this.nameSpace;
            String str = this.varName;
            Object objM376 = c0012.m376(str, true);
            return objM376 == Primitive.VOID ? c0012.m375(str, null) : objM376;
        }
        if (i == 1) {
            try {
                return this.field.mo3115(this.object, new Object[0]);
            } catch (ReflectiveOperationException e) {
                throw new C3581("Can't read field: " + this.field, e);
            }
        }
        if (i == 2) {
            try {
                return AbstractC0016.m537(this.object, this.propName);
            } catch (C2573 e2) {
                RunnableC0008.m333(e2.getMessage());
                throw new C3581("No such property: " + this.propName, e2);
            }
        }
        if (i != 3) {
            if (i == 5) {
                return this.nameSpace.m376(this.varName, true);
            }
            throw new C1684("LHS type");
        }
        try {
            return AbstractC1468.m3309(this.index, this.object);
        } catch (Exception e3) {
            throw new C3581("Array access: " + e3, e3);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object obj = this.object;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        Object obj2 = this.object;
        if (obj2 instanceof Class) {
            cls = (Class) obj2;
        }
        C0457 c0457 = (C0457) C0458.f2065.m3819(cls);
        String str = this.varName;
        ConcurrentHashMap concurrentHashMap = c0457.f2064;
        this.field = !concurrentHashMap.containsKey(str) ? null : (AbstractC1687) concurrentHashMap.get(str);
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            AbstractC1687 abstractC1687 = this.field;
            if (abstractC1687 != null) {
                this.object = abstractC1687.f5673;
                this.varName = abstractC1687.f5671;
                this.field = null;
            }
            objectOutputStream.defaultWriteObject();
        } catch (Throwable th) {
            throw th;
        }
    }

    public Object assign(Object obj) {
        return assign(obj, false);
    }

    public String getName() {
        AbstractC1687 abstractC1687 = this.field;
        if (abstractC1687 != null) {
            return abstractC1687.f5671;
        }
        Variable variable = this.var;
        return variable != null ? variable.getName() : this.varName;
    }

    public Class<?> getType() {
        AbstractC1687 abstractC1687 = this.field;
        if (abstractC1687 != null) {
            return abstractC1687.mo2461();
        }
        if (getVariable() != null) {
            return this.var.getType();
        }
        try {
            return AbstractC0017.m563(getValueImpl(), false);
        } catch (C3581 unused) {
            return null;
        }
    }

    public Object getValue() {
        if (this.type == 1) {
            AbstractC1687 abstractC1687 = this.field;
            Object[] objArr = AbstractC0016.f568;
            if (Modifier.isStatic(abstractC1687.getModifiers())) {
                C1910 c1910 = RunnableC0008.f502;
                AbstractC1687 abstractC1688 = this.field;
                c1910.m3843(abstractC1688.f5673, abstractC1688.f5671);
            } else {
                C1910 c1911 = RunnableC0008.f502;
                String str = this.field.f5671;
                c1911.m3842();
            }
        }
        return getValueImpl();
    }

    public Variable getVariable() {
        Variable variable = this.var;
        if (variable != null) {
            return variable;
        }
        C0012 c0012 = this.nameSpace;
        Variable variableM377 = null;
        if (c0012 != null) {
            String name = getName();
            Object[] objArr = AbstractC0016.f568;
            try {
                variableM377 = c0012.m377(name, false);
            } catch (Exception unused) {
            }
            this.var = variableM377;
        } else if (isStatic()) {
            if (AbstractC0016.m546(this.field.f5673)) {
                Class cls = this.field.f5673;
                String name2 = getName();
                C0012 c0012M539 = AbstractC0016.m539(cls);
                if (c0012M539 != null) {
                    try {
                        variableM377 = c0012M539.m377(name2, false);
                    } catch (Exception unused2) {
                    }
                }
                this.var = variableM377;
            } else {
                AbstractC1687 abstractC1687 = this.field;
                this.var = new Variable(abstractC1687.f5671, (Class<?>) abstractC1687.mo2461(), this);
            }
        } else if (AbstractC0016.m546(this.object.getClass())) {
            Object obj = this.object;
            String name3 = getName();
            C0012 c0012M540 = AbstractC0016.m540(obj);
            if (c0012M540 != null) {
                try {
                    variableM377 = c0012M540.m377(name3, false);
                } catch (Exception unused3) {
                }
            }
            this.var = variableM377;
        } else {
            AbstractC1687 abstractC1688 = this.field;
            if (abstractC1688 != null) {
                this.var = new Variable(abstractC1688.f5671, (Class<?>) abstractC1688.mo2461(), this);
            }
        }
        return this.var;
    }

    public boolean isFinal() {
        if (getVariable() == null) {
            return false;
        }
        return this.var.hasModifier("final");
    }

    public boolean isStatic() {
        AbstractC1687 abstractC1687 = this.field;
        if (abstractC1687 != null) {
            return abstractC1687.mo2463();
        }
        Variable variable = this.var;
        if (variable == null) {
            return false;
        }
        return variable.hasModifier("static");
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LHS: ");
        String str3 = "";
        if (this.field != null) {
            str = "field = " + this.field.f5670;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.varName != null) {
            str2 = " varName = " + this.varName;
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.nameSpace != null) {
            str3 = " nameSpace = " + this.nameSpace.toString();
        }
        sb.append(str3);
        return sb.toString();
    }

    public Object assign(Object obj, boolean z) {
        int i = this.type;
        if (i == 0) {
            if (this.localVar) {
                this.nameSpace.m388(this.varName, obj, z, false);
            } else {
                this.nameSpace.m388(this.varName, obj, z, true);
            }
            return getValueImpl();
        }
        if (i == 1) {
            try {
                AbstractC1687 abstractC1687 = this.field;
                Object[] objArr = AbstractC0016.f568;
                if (Modifier.isStatic(abstractC1687.getModifiers())) {
                    C1910 c1910 = RunnableC0008.f502;
                    AbstractC1687 abstractC1688 = this.field;
                    c1910.m3847(obj, abstractC1688.f5673, abstractC1688.f5671);
                } else {
                    RunnableC0008.f502.m3846(this.object, this.field.f5671, obj);
                }
                this.field.mo3115(this.object, obj);
                return getValueImpl();
            } catch (ReflectiveOperationException e) {
                throw new C3581("LHS (" + this.field.f5671 + ") can't access field: " + e, e);
            }
        }
        if (i == 2) {
            try {
                Object obj2 = this.propName;
                if (!(obj2 instanceof String)) {
                    return AbstractC0016.m552(this.object, obj2, obj);
                }
                Object obj3 = this.object;
                String str = (String) obj2;
                Object[] objArr2 = AbstractC0016.f568;
                Map map = AbstractC0017.f574;
                return ((obj3 instanceof Map.Entry) && (str.equals("val") || str.equals("value"))) ? ((Map.Entry) obj3).setValue(obj) : AbstractC0016.m552(obj3, str, obj);
            } catch (C2573 e2) {
                RunnableC0008.m333("Assignment: " + e2.getMessage());
                throw new C3581("No such property: " + this.propName, e2);
            }
        }
        if (i != 3) {
            if (i != 5) {
                if (i != 6) {
                    throw new C1684("unknown lhs type");
                }
                Object obj4 = this.object;
                return obj4 instanceof Map.Entry ? ((Map.Entry) obj4).setValue(obj) : new C3524(this.object, obj);
            }
            Modifiers modifiers = new Modifiers(3);
            modifiers.addModifier("public");
            if (this.nameSpace.f536) {
                modifiers.setConstant();
            }
            this.nameSpace.m386(this.varName, AbstractC0017.m563(obj, false), obj, modifiers);
            return obj;
        }
        try {
            if (this.object.getClass().isArray() && obj != null) {
                try {
                    obj = AbstractC0017.m559(1, AbstractC0017.m557(this.object.getClass()), obj);
                } catch (Exception unused) {
                }
            }
            AbstractC1468.m3314(this.object, this.index, obj);
            return obj;
        } catch (C3582 e3) {
            if (!IndexOutOfBoundsException.class.isAssignableFrom(e3.getCause().getClass())) {
                throw e3;
            }
            throw new C3581("Error array set index: " + e3.getMessage(), e3);
        } catch (Exception e4) {
            throw new C3581("Assignment: " + e4.getMessage(), e4);
        }
    }

    public LHS(C0012 c0012, String str) {
        this.type = 5;
        this.varName = str;
        this.nameSpace = c0012;
    }

    public LHS(AbstractC1687 abstractC1687) {
        this.type = 1;
        this.object = abstractC1687.f5673;
        this.field = abstractC1687;
        this.varName = abstractC1687.f5671;
    }

    public LHS(Object obj, AbstractC1687 abstractC1687) {
        if (obj != null) {
            this.type = 1;
            this.object = obj;
            this.field = abstractC1687;
            if (abstractC1687 != null) {
                this.varName = abstractC1687.f5671;
                return;
            }
            return;
        }
        throw new NullPointerException("constructed empty LHS");
    }

    public LHS(Object obj, Object obj2) {
        if (obj != null) {
            this.type = 2;
            this.object = obj;
            this.propName = obj2;
            return;
        }
        throw new NullPointerException("constructed empty LHS");
    }

    public LHS(Object obj) {
        this.type = 6;
        this.object = obj;
    }

    public LHS(Object obj, int i) {
        this.type = 3;
        this.object = obj;
        this.index = i;
    }
}
