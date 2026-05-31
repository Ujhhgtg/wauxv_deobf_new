package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2367 implements ParameterizedType, Type {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Class f7604;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Type f7605;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Type[] f7606;

    public C2367(Class cls, Type type, ArrayList arrayList) {
        this.f7604 = cls;
        this.f7605 = type;
        this.f7606 = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return AbstractC1469.m3322(this.f7604, parameterizedType.getRawType()) && AbstractC1469.m3322(this.f7605, parameterizedType.getOwnerType()) && Arrays.equals(this.f7606, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f7606;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f7605;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f7604;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f7604;
        Type type = this.f7605;
        if (type != null) {
            sb.append(AbstractC3528.m5088(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(AbstractC3528.m5088(cls));
        }
        Type[] typeArr = this.f7606;
        if (typeArr.length != 0) {
            AbstractC0280.m1532(typeArr, sb, ", ", "<", ">", C2366.f7603);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f7604.hashCode();
        Type type = this.f7605;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f7606);
    }

    public final String toString() {
        return getTypeName();
    }
}
