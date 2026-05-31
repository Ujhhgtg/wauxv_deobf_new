package com.highcapable.kavaref.extension;

import com.highcapable.kavaref.extension.TypeRef;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p000.AbstractC1469;
import p000.AbstractC1470;
import p000.AbstractC2236;
import p000.AbstractC2574;
import p000.C2933;
import p000.InterfaceC1422;
import p000.InterfaceC1771;
import p000.InterfaceC1780;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1771
public abstract class TypeRef<T> {
    private final InterfaceC1780 rawType$delegate;
    private final InterfaceC1780 type$delegate;

    public TypeRef() {
        final int i = 0;
        this.type$delegate = new C2933(new InterfaceC1422(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᛸᤝᤞᲀ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ TypeRef f11086;

            {
                this.f11086 = this;
            }

            @Override // p000.InterfaceC1422
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(this.f11086);
                    default:
                        return TypeRef.rawType_delegate$lambda$1(this.f11086);
                }
            }
        });
        final int i2 = 1;
        this.rawType$delegate = new C2933(new InterfaceC1422(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᛸᤝᤞᲀ

            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ TypeRef f11086;

            {
                this.f11086 = this;
            }

            @Override // p000.InterfaceC1422
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(this.f11086);
                    default:
                        return TypeRef.rawType_delegate$lambda$1(this.f11086);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class rawType_delegate$lambda$1(TypeRef typeRef) {
        return AbstractC1470.m3373(typeRef.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type type_delegate$lambda$0(TypeRef typeRef) {
        Type genericSuperclass = typeRef.getClass().getGenericSuperclass();
        Class<TypeRef> cls = TypeRef.class;
        if (!(genericSuperclass instanceof ParameterizedType)) {
            Class<TypeRef> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
            if (AbstractC1469.m3322(genericSuperclass, clsM4232 != null ? clsM4232 : TypeRef.class)) {
                throw new IllegalStateException("TypeRef must be created with a type argument: object : TypeRef<...>() {}.");
            }
            throw new IllegalStateException("Must only create direct subclasses of TypeRef.");
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type rawType = parameterizedType.getRawType();
        Class<TypeRef> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
        if (!AbstractC1469.m3322(rawType, clsM4233 != null ? clsM4233 : TypeRef.class)) {
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
        return (obj instanceof TypeRef) && AbstractC1469.m3322(getType(), ((TypeRef) obj).getType());
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
