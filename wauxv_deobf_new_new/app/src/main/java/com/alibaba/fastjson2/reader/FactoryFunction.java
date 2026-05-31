package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.support.LambdaMiscCodec;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FactoryFunction<T> implements Function<Map<Long, Object>, T> {
    final BiFunction biFunction;
    final Method factoryMethod;
    final Function function;
    final long[] hashCodes;
    final String[] paramNames;

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    public FactoryFunction(Method method, String... strArr) {
        BiFunction biFunctionCreateBiFunction;
        this.factoryMethod = method;
        Parameter[] parameters = method.getParameters();
        this.paramNames = new String[parameters.length];
        this.hashCodes = new long[parameters.length];
        int i = 0;
        while (i < parameters.length) {
            String name = i < strArr.length ? strArr[i] : parameters[i].getName();
            strArr[i] = name;
            this.hashCodes[i] = Fnv.hashCode64(name);
            i++;
        }
        Function functionCreateFunction = null;
        if (ObjectReaderCreator.JIT) {
            int parameterCount = method.getParameterCount();
            if (parameterCount == 1) {
                functionCreateFunction = LambdaMiscCodec.createFunction(method);
                biFunctionCreateBiFunction = null;
            } else if (parameterCount == 2) {
                biFunctionCreateBiFunction = LambdaMiscCodec.createBiFunction(method);
            } else {
                biFunctionCreateBiFunction = null;
            }
        } else {
            biFunctionCreateBiFunction = null;
        }
        this.function = functionCreateFunction;
        this.biFunction = biFunctionCreateBiFunction;
    }

    public T createInstance(Object[] objArr) {
        try {
            return (T) this.factoryMethod.invoke(null, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JSONException("invoke factoryMethod error", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public T apply(Map<Long, Object> map) {
        if (this.function != null) {
            return (T) this.function.apply(map.get(Long.valueOf(this.hashCodes[0])));
        }
        if (this.biFunction != null) {
            return (T) this.biFunction.apply(map.get(Long.valueOf(this.hashCodes[0])), map.get(Long.valueOf(this.hashCodes[1])));
        }
        int length = this.hashCodes.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            objArr[i] = map.get(Long.valueOf(this.hashCodes[i]));
        }
        return createInstance(objArr);
    }
}
