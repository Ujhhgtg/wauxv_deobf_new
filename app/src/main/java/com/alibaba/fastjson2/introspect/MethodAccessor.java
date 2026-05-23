package com.alibaba.fastjson2.introspect;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class MethodAccessor implements PropertyAccessor {
    protected final Method getter;
    protected final String name;
    protected final Class<?> propertyClass;
    protected final Type propertyType;
    protected final Method setter;

    public MethodAccessor(String str, Type type, Class<?> cls, Method method, Method method2) {
        this.name = str;
        this.propertyType = type;
        this.propertyClass = cls;
        this.getter = method;
        this.setter = method2;
    }

    public final JSONException errorForGet(Throwable th) {
        Method method = this.getter;
        return new JSONException((method == null ? this.name : method.toString()).concat(" get error"), th);
    }

    public final JSONException errorForSet(Throwable th) {
        Method method = this.setter;
        return new JSONException((method == null ? this.name : method.toString()).concat(" set error"), th);
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
    public final String name() {
        return this.name;
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
    public final Class<?> propertyClass() {
        return this.propertyClass;
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
    public final Type propertyType() {
        return this.propertyType;
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
    public final boolean supportGet() {
        return this.getter != null;
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
    public final boolean supportSet() {
        return this.setter != null;
    }
}
