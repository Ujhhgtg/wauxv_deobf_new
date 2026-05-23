package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2327 implements ParameterizedType, Type {

    public final Class f7466;

    public final Type f7467;

    public final Type[] f7468;

    public C2327(Class cls, Type type, ArrayList arrayList) {
        this.f7466 = cls;
        this.f7467 = type;
        this.f7468 = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return AbstractC2207.m4087(this.f7466, parameterizedType.getRawType()) && AbstractC2207.m4087(this.f7467, parameterizedType.getOwnerType()) && Arrays.equals(this.f7468, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f7468;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f7467;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f7466;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f7466;
        Type type = this.f7467;
        if (type != null) {
            sb.append(AbstractC3471.m5062(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(AbstractC3471.m5062(cls));
        }
        Type[] typeArr = this.f7468;
        if (typeArr.length != 0) {
            AbstractC0270.m1386(typeArr, sb, ", ", "<", ">", C2326.f7465);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f7466.hashCode();
        Type type = this.f7467;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f7468);
    }

    public final String toString() {
        return getTypeName();
    }
}
