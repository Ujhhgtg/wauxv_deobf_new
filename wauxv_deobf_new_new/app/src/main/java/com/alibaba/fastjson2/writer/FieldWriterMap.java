package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.ParameterizedTypeImpl;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterMap extends FieldWriterObject {
    protected final Class<?> contentAs;
    protected Type contentAsFieldType;
    private final Type keyType;
    volatile ObjectWriter mapWriter;
    private final Type valueType;
    final boolean valueTypeRefDetect;
    volatile ObjectWriter valueWriter;

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public FieldWriterMap(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Function function, Class<?> cls2) {
        Class cls3;
        Class cls4;
        super(str, i, j, str2, locale, str3, type, cls, field, method, function);
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
                cls4 = actualTypeArguments[0];
                cls3 = actualTypeArguments[1];
            } else {
                cls3 = null;
                cls4 = null;
            }
        } else {
            cls3 = null;
            cls4 = null;
        }
        cls4 = cls4 == null ? Object.class : cls4;
        cls3 = cls3 == null ? Object.class : cls3;
        ParameterizedTypeImpl parameterizedTypeImpl = cls2 != null ? new ParameterizedTypeImpl(cls, String.class, cls2) : null;
        this.contentAs = cls2;
        this.contentAsFieldType = parameterizedTypeImpl;
        this.keyType = cls4;
        this.valueType = cls3;
        this.valueTypeRefDetect = !ObjectWriterProvider.isNotReferenceDetect(TypeUtils.getClass(cls3));
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        Class<?> cls2 = this.contentAs;
        if (cls2 == null || !this.fieldClass.isAssignableFrom(cls)) {
            return super.getObjectWriter(jSONWriter, cls);
        }
        ObjectWriter objectWriter = this.valueWriter;
        if (objectWriter != null) {
            return objectWriter;
        }
        long j = this.features;
        ObjectWriterImplMap objectWriterImplMap = new ObjectWriterImplMap(this.keyType, cls2, this.format, cls, this.contentAsFieldType, j | Long.MIN_VALUE);
        this.mapWriter = objectWriterImplMap;
        return objectWriterImplMap;
    }
}
