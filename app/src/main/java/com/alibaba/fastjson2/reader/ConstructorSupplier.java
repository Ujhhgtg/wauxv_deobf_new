package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ConstructorSupplier implements Supplier {
    final Constructor constructor;
    final Class objectClass;
    final boolean useClassNewInstance;

    public ConstructorSupplier(Constructor constructor) {
        constructor.setAccessible(true);
        this.constructor = constructor;
        Class declaringClass = constructor.getDeclaringClass();
        this.objectClass = declaringClass;
        this.useClassNewInstance = constructor.getParameterCount() == 0 && Modifier.isPublic(constructor.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers());
    }

    @Override // java.util.function.Supplier
    public Object get() {
        try {
            if (this.useClassNewInstance) {
                return this.objectClass.newInstance();
            }
            return this.constructor.getParameterCount() == 1 ? this.constructor.newInstance(new Object[1]) : this.constructor.newInstance(null);
        } catch (Throwable th) {
            throw new JSONException("create instance error", th);
        }
    }
}
