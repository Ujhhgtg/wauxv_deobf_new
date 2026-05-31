package bsh;

import java.io.Serializable;
import p000.AbstractC2240;
import p000.AbstractC2844;
import p000.C3581;
import p000.InterfaceC0455;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Variable implements Serializable, InterfaceC0455, Cloneable {
    public static final int ASSIGNMENT = 1;
    public static final int DECLARATION = 0;
    LHS lhs;
    Modifiers modifiers;
    String name;
    Class<?> type;
    String typeDescriptor;
    Object value;

    public Variable(String str, Class<?> cls, LHS lhs) {
        this.name = str;
        this.lhs = lhs;
        this.type = cls;
    }

    private void setModifiers(Modifiers modifiers) {
        this.modifiers = modifiers;
    }

    @Override // p000.InterfaceC0455
    public void classLoaderChanged() {
        if (AbstractC0016.m546(this.type)) {
            try {
                this.type = AbstractC0016.m539(this.type).m363(this.type.getName());
            } catch (C3581 unused) {
            }
        }
    }

    public Modifiers getModifiers() {
        if (this.modifiers == null) {
            setModifiers(new Modifiers(3));
        }
        return this.modifiers;
    }

    public String getName() {
        return this.name;
    }

    public Class<?> getType() {
        return this.type;
    }

    public String getTypeDescriptor() {
        if (this.typeDescriptor == null) {
            Class<?> cls = this.type;
            if (cls == null) {
                cls = Object.class;
            }
            this.typeDescriptor = BSHType.getTypeDescriptor(cls);
        }
        return this.typeDescriptor;
    }

    public Object getValue() {
        LHS lhs = this.lhs;
        if (lhs != null) {
            return this.type == null ? lhs.getValue() : Primitive.wrap(lhs.getValue(), this.type);
        }
        return this.value;
    }

    public boolean hasModifier(String str) {
        return getModifiers().hasModifier(str);
    }

    public void setConstant() {
        if (!hasModifier("private") && !hasModifier("protected")) {
            getModifiers().setConstant();
            return;
        }
        throw new IllegalArgumentException("Illegal modifier for interface field " + getName() + ". Only public static & final are permitted.");
    }

    public void setValue(Object obj, int i) {
        if (hasModifier("final")) {
            if (this.value != null) {
                throw new C3581(AbstractC2844.m4786(new StringBuilder("Cannot re-assign final variable "), this.name, "."));
            }
            if (obj == null) {
                return;
            }
        }
        Class<?> cls = this.type;
        if (cls != null && cls != Object.class && obj != null) {
            obj = AbstractC0017.m559(i == 0 ? 0 : 1, cls, obj);
            this.value = obj;
        }
        this.value = obj;
        if (obj == null && i != 0) {
            this.value = Primitive.getDefaultValue(this.type);
        }
        LHS lhs = this.lhs;
        if (lhs != null) {
            this.value = lhs.assign(this.value, false);
        }
    }

    public String toString() {
        return "Variable: " + AbstractC2240.m4270(this) + ", value:" + this.value + ", lhs = " + this.lhs;
    }

    public void validateFinalIsSet(boolean z) {
        if (hasModifier("final") && this.value == null && z == hasModifier("static")) {
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "Static f" : "F");
            sb.append("inal variable ");
            throw new RuntimeException(AbstractC2844.m4786(sb, this.name, " is not initialized."));
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Variable m301clone() {
        try {
            Variable variable = (Variable) super.clone();
            Modifiers modifiers = variable.modifiers;
            variable.modifiers = modifiers != null ? modifiers.m298clone() : null;
            return variable;
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public Variable(String str, Object obj, Modifiers modifiers) {
        this(str, (Class<?>) null, obj, modifiers);
    }

    public Variable(String str, String str2, Object obj, Modifiers modifiers) {
        this(str, (Class<?>) null, obj, modifiers);
        this.typeDescriptor = str2;
    }

    public Variable(String str, Class<?> cls, Object obj, Modifiers modifiers) {
        this.name = str;
        this.type = cls;
        setModifiers(modifiers);
        setValue(obj, 0);
    }
}
