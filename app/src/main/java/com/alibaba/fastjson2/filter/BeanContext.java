package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.codec.FieldInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class BeanContext {
    private final Class beanClass;
    private final long features;
    private final Field field;
    private final Class fieldClass;
    private final Type fieldType;
    private final String format;
    private final String label;
    private final Method method;
    private final String name;

    public BeanContext(Class cls, Method method, Field field, String str, String str2, Class cls2, Type type, long j, String str3) {
        this.beanClass = cls;
        this.method = method;
        this.field = field;
        this.name = str;
        this.label = str2;
        this.fieldClass = cls2;
        this.fieldType = type;
        this.features = j;
        this.format = str3;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        Field field;
        Method method = this.method;
        T t = method != null ? (T) method.getAnnotation(cls) : null;
        return (t != null || (field = this.field) == null) ? t : (T) field.getAnnotation(cls);
    }

    public Class<?> getBeanClass() {
        return this.beanClass;
    }

    public long getFeatures() {
        return this.features;
    }

    public Field getField() {
        return this.field;
    }

    public Class<?> getFieldClass() {
        return this.fieldClass;
    }

    public Type getFieldType() {
        return this.fieldType;
    }

    public String getFormat() {
        return this.format;
    }

    public String getLabel() {
        return this.label;
    }

    public Method getMethod() {
        return this.method;
    }

    public String getName() {
        return this.name;
    }

    public boolean isJsonDirect() {
        return (this.features & 1125899906842624L) != 0;
    }
}
