package com.alibaba.fastjson2.modules;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface ObjectReaderModule {
    default ObjectReaderAnnotationProcessor getAnnotationProcessor() {
        return null;
    }

    default void getBeanInfo(BeanInfo beanInfo, Class<?> cls) {
        ObjectReaderAnnotationProcessor annotationProcessor = getAnnotationProcessor();
        if (annotationProcessor != null) {
            annotationProcessor.getBeanInfo(beanInfo, cls);
        }
    }

    default void getFieldInfo(FieldInfo fieldInfo, Class cls, Field field) {
        ObjectReaderAnnotationProcessor annotationProcessor = getAnnotationProcessor();
        if (annotationProcessor != null) {
            annotationProcessor.getFieldInfo(fieldInfo, cls, field);
        }
    }

    default ObjectReader getObjectReader(Type type) {
        return null;
    }

    default ObjectReaderProvider getProvider() {
        return null;
    }

    default ObjectReader getObjectReader(ObjectReaderProvider objectReaderProvider, Type type) {
        return getObjectReader(type);
    }

    default void init(ObjectReaderProvider objectReaderProvider) {
    }
}
