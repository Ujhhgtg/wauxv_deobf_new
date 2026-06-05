package com.alibaba.fastjson2.modules;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface ObjectReaderAnnotationProcessor {
    default void getFieldInfo(FieldInfo fieldInfo, Class cls, Constructor constructor, int i, Parameter parameter) {
    }

    default void getFieldInfo(FieldInfo fieldInfo, Class cls, Field field) {
    }

    default void getFieldInfo(FieldInfo fieldInfo, Class cls, Method method) {
    }

    default void getFieldInfo(FieldInfo fieldInfo, Class cls, Method method, int i, Parameter parameter) {
    }

    default void getBeanInfo(BeanInfo beanInfo, Class<?> cls) {
    }
}
