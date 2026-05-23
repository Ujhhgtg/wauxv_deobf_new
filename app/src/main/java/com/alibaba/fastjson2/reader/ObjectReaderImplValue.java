package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplValue<I, T> implements ObjectReader<T> {
    final Constructor<T> constructor;
    final Object emptyVariantArgs;
    final Method factoryMethod;
    final long features;
    final Function<I, T> function;
    final JSONSchema schema;
    final Class<I> valueClass;
    ObjectReader valueReader;
    final Type valueType;

    public ObjectReaderImplValue(Class<T> cls, Type type, Class<I> cls2, long j, String str, Object obj, JSONSchema jSONSchema, Constructor<T> constructor, Method method, Function<I, T> function) {
        this.valueType = type;
        this.valueClass = cls2;
        this.features = j;
        this.schema = jSONSchema;
        this.constructor = constructor;
        this.factoryMethod = method;
        this.function = function;
        if (method == null || method.getParameterCount() != 2) {
            this.emptyVariantArgs = null;
        } else {
            this.emptyVariantArgs = Array.newInstance(method.getParameterTypes()[1].getComponentType(), 0);
        }
    }

    public static <I, T> ObjectReaderImplValue<I, T> of(Class<T> cls, Class<I> cls2, Method method) {
        return new ObjectReaderImplValue<>(cls, cls2, cls2, 0L, null, null, null, null, method, null);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        return readObject(jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (this.valueReader == null) {
            this.valueReader = jSONReader.getObjectReader(this.valueType);
        }
        Object object = this.valueReader.readObject(jSONReader, type, obj, j | this.features);
        if (object == null) {
            return null;
        }
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.validate(object);
        }
        Function<I, T> function = this.function;
        if (function != null) {
            try {
                return function.apply((I) object);
            } catch (Exception e) {
                throw new JSONException(jSONReader.info("create object error"), e);
            }
        }
        Constructor<T> constructor = this.constructor;
        if (constructor != null) {
            try {
                return constructor.newInstance(object);
            } catch (Exception e2) {
                throw new JSONException(jSONReader.info("create object error"), e2);
            }
        }
        Method method = this.factoryMethod;
        if (method == null) {
            throw new JSONException(jSONReader.info("create object error"));
        }
        try {
            Object obj2 = this.emptyVariantArgs;
            return obj2 != null ? (T) method.invoke(null, object, obj2) : (T) method.invoke(null, object);
        } catch (Exception e3) {
            throw new JSONException(jSONReader.info("create object error"), e3);
        }
    }

    public static <I, T> ObjectReaderImplValue<I, T> of(Class<T> cls, Class<I> cls2, Function<I, T> function) {
        return new ObjectReaderImplValue<>(cls, cls2, cls2, 0L, null, null, null, null, null, function);
    }
}
