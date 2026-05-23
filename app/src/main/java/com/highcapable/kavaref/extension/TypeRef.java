package com.highcapable.kavaref.extension;

import com.highcapable.kavaref.extension.TypeRef;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p000.AbstractC0743;
import p000.AbstractC1270;
import p000.AbstractC2207;
import p000.AbstractC2519;
import p000.C2873;
import p000.InterfaceC1414;
import p000.InterfaceC1748;
import p000.InterfaceC1758;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1748
public abstract class TypeRef<T> {
    private final InterfaceC1758 rawType$delegate;
    private final InterfaceC1758 type$delegate;

    public TypeRef() {
        final int i = 0;
        this.type$delegate = new C2873(new InterfaceC1414(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᲈᲀᤞᛸ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ TypeRef f10930;

            {
                this.f10930 = this;
            }

            @Override // p000.InterfaceC1414
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(this.f10930);
                    default:
                        return TypeRef.rawType_delegate$lambda$1(this.f10930);
                }
            }
        });
        final int i2 = 1;
        this.rawType$delegate = new C2873(new InterfaceC1414(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᲈᲀᤞᛸ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
            public final /* synthetic */ TypeRef f10930;

            {
                this.f10930 = this;
            }

            @Override // p000.InterfaceC1414
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(this.f10930);
                    default:
                        return TypeRef.rawType_delegate$lambda$1(this.f10930);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class rawType_delegate$lambda$1(TypeRef typeRef) {
        return AbstractC1270.m2998(typeRef.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type type_delegate$lambda$0(TypeRef typeRef) {
        Type genericSuperclass = typeRef.getClass().getGenericSuperclass();
        Class<TypeRef> cls = TypeRef.class;
        if (!(genericSuperclass instanceof ParameterizedType)) {
            Class<TypeRef> clsM2183 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
            if (AbstractC2207.m4087(genericSuperclass, clsM2183 != null ? clsM2183 : TypeRef.class)) {
                throw new IllegalStateException("TypeRef must be created with a type argument: object : TypeRef<...>() {}.");
            }
            throw new IllegalStateException("Must only create direct subclasses of TypeRef.");
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type rawType = parameterizedType.getRawType();
        Class<TypeRef> clsM2184 = AbstractC0743.m2183(AbstractC2519.m4527(cls));
        if (!AbstractC2207.m4087(rawType, clsM2184 != null ? clsM2184 : TypeRef.class)) {
            throw new IllegalStateException("Must only create direct subclasses of TypeRef.");
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type type = actualTypeArguments.length == 0 ? null : actualTypeArguments[0];
        if (type != null) {
            return type;
        }
        throw new IllegalStateException("Type argument cannot be null.");
    }

    public boolean equals(Object obj) {
        return (obj instanceof TypeRef) && AbstractC2207.m4087(getType(), ((TypeRef) obj).getType());
    }

    public final Class<T> getRawType() {
        return (Class) this.rawType$delegate.getValue();
    }

    public final Type getType() {
        return (Type) this.type$delegate.getValue();
    }

    public int hashCode() {
        return getType().hashCode();
    }

    public String toString() {
        return getType().toString();
    }
}
