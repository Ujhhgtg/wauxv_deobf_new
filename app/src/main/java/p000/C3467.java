package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3467 implements ParameterizedType {

    public final /* synthetic */ Type[] f10957;

    public final /* synthetic */ Type f10958;

    public C3467(Class cls, Type[] typeArr) {
        this.f10957 = typeArr;
        this.f10958 = cls;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f10957;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f10958;
    }
}
