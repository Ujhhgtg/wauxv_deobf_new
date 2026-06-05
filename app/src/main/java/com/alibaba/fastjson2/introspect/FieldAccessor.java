package com.alibaba.fastjson2.introspect;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldAccessor implements PropertyAccessor {
    protected final Field field;
    protected final String fieldName;
    protected final Class<?> propertyClass;
    protected final Type propertyType;
    protected final boolean supportSet;

    public FieldAccessor(Field field) {
        this.field = field;
        this.propertyClass = field.getType();
        this.propertyType = field.getGenericType();
        this.fieldName = field.getName();
        this.supportSet = (field.getModifiers() & 16) == 0;
    }

    public final JSONException errorForGet(Throwable th) {
        return new JSONException(this.field.toString().concat(" get error"), th);
    }

    public final JSONException errorForSet(Throwable th) {
        return new JSONException(this.field.toString().concat(" set error"), th);
    }

    public final Field field() {
        return this.field;
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
    public final String name() {
        return this.fieldName;
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
        return true;
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessor
    public final boolean supportSet() {
        return this.supportSet;
    }

    public String toString() {
        return this.field.toString();
    }
}
