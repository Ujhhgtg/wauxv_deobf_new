package com.highcapable.kavaref.extension;

import com.highcapable.kavaref.extension.TypeRef;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p000.AbstractC0959feyxiexzfUjhhgtg;
import p000.AbstractC1937feyxiexzfUjhhgtg;
import p000.AbstractC3593Ujhhgtgfeyxiexzf;
import p000.C2065feyxiexzfUjhhgtg;
import p000.C3052Ujhhgtgfeyxiexzf;
import p000.InterfaceC0058Ujhhgtgfeyxiexzf;
import p000.InterfaceC0155Ujhhgtgfeyxiexzf;
import p000.InterfaceC3545feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC0155Ujhhgtgfeyxiexzf
public abstract class TypeRef<T> {
    private final InterfaceC0058Ujhhgtgfeyxiexzf rawType$delegate;
    private final InterfaceC0058Ujhhgtgfeyxiexzf type$delegate;

    public TypeRef() {
        final int i = 0;
        this.type$delegate = new C2065feyxiexzfUjhhgtg(new InterfaceC3545feyxiexzfUjhhgtg(this) { // from class: 上海高中ᛱ谢子非ᛱᛲᛳᛴᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱ要点脸

            /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
            public final /* synthetic */ TypeRef f5948Ujhhgtgfeyxiexzf;

            {
                this.f5948Ujhhgtgfeyxiexzf = this;
            }

            @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(this.f5948Ujhhgtgfeyxiexzf);
                    default:
                        return TypeRef.rawType_delegate$lambda$0(this.f5948Ujhhgtgfeyxiexzf);
                }
            }
        });
        final int i2 = 1;
        this.rawType$delegate = new C2065feyxiexzfUjhhgtg(new InterfaceC3545feyxiexzfUjhhgtg(this) { // from class: 上海高中ᛱ谢子非ᛱᛲᛳᛴᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱ要点脸

            /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
            public final /* synthetic */ TypeRef f5948Ujhhgtgfeyxiexzf;

            {
                this.f5948Ujhhgtgfeyxiexzf = this;
            }

            @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(this.f5948Ujhhgtgfeyxiexzf);
                    default:
                        return TypeRef.rawType_delegate$lambda$0(this.f5948Ujhhgtgfeyxiexzf);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class rawType_delegate$lambda$0(TypeRef typeRef) {
        return AbstractC1937feyxiexzfUjhhgtg.m3286Ujhhgtgfeyxiexzf(typeRef.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type type_delegate$lambda$0(TypeRef typeRef) {
        Type genericSuperclass = typeRef.getClass().getGenericSuperclass();
        Class<TypeRef> cls = TypeRef.class;
        if (!(genericSuperclass instanceof ParameterizedType)) {
            Class<TypeRef> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(genericSuperclass, clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : TypeRef.class)) {
                throw new IllegalStateException("TypeRef must be created with a type argument: object : TypeRef<...>() {}.");
            }
            throw new IllegalStateException("Must only create direct subclasses of TypeRef.");
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type rawType = parameterizedType.getRawType();
        Class<TypeRef> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(rawType, clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : TypeRef.class)) {
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
        return (obj instanceof TypeRef) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(getType(), ((TypeRef) obj).getType());
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
