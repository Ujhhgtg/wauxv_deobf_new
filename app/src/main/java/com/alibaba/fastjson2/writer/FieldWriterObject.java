package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.Function;
import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FieldWriterObject<T> extends FieldWriter<T> {
    static final AtomicReferenceFieldUpdater<FieldWriterObject, Class> initValueClassUpdater = AtomicReferenceFieldUpdater.newUpdater(FieldWriterObject.class, Class.class, "initValueClass");
    final boolean array;
    volatile Class initValueClass;
    final boolean number;
    final boolean unwrapped;
    protected boolean writeUsing;

    public FieldWriterObject(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Function function) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, function);
        this.unwrapped = (j & 562949953421312L) != 0;
        if (cls == Currency.class) {
            this.initValueClass = Currency.class;
            this.initObjectWriter = ObjectWriterImplCurrency.INSTANCE_FOR_FIELD;
        }
        this.array = cls.isArray() || Collection.class.isAssignableFrom(cls) || cls == AtomicLongArray.class || cls == AtomicIntegerArray.class;
        this.number = Number.class.isAssignableFrom(cls);
    }

    private ObjectWriter getObjectWriterTypeMatch(JSONWriter jSONWriter, Class cls) {
        ObjectWriter objectWriter;
        if (Map.class.isAssignableFrom(cls)) {
            objectWriter = this.fieldClass.isAssignableFrom(cls) ? ObjectWriterImplMap.of(this.fieldType, cls) : ObjectWriterImplMap.of(cls);
        } else {
            objectWriter = jSONWriter.getObjectWriter(cls);
        }
        AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> atomicReferenceFieldUpdater = FieldWriter.initObjectWriterUpdater;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, objectWriter)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return objectWriter;
            }
        }
        return objectWriter;
    }

    private ObjectWriter getObjectWriterTypeNotMatch(JSONWriter jSONWriter, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return this.fieldClass.isAssignableFrom(cls) ? ObjectWriterImplMap.of(this.fieldType, cls) : ObjectWriterImplMap.of(cls);
        }
        String str = this.format;
        ObjectWriter objectWriter = str != null ? FieldWriter.getObjectWriter(this.fieldType, this.fieldClass, str, null, cls) : null;
        return objectWriter == null ? jSONWriter.getObjectWriter(cls) : objectWriter;
    }

    public static boolean typeMatch(Class cls, Class cls2) {
        if (cls == Integer.TYPE && cls2 == Integer.class) {
            return true;
        }
        if (cls == Long.TYPE && cls2 == Long.class) {
            return true;
        }
        if (cls == Boolean.TYPE && cls2 == Boolean.class) {
            return true;
        }
        if (cls == Short.TYPE && cls2 == Short.class) {
            return true;
        }
        if (cls == Byte.TYPE && cls2 == Byte.class) {
            return true;
        }
        if (cls == Float.TYPE && cls2 == Float.class) {
            return true;
        }
        if (cls == Double.TYPE && cls2 == Double.class) {
            return true;
        }
        return cls == Character.TYPE && cls2 == Character.class;
    }

    private boolean writeInternal(JSONWriter jSONWriter, T t) {
        Field field;
        long j;
        long features = jSONWriter.getFeatures();
        if (!this.fieldClassSerializable && (JSONWriter.Feature.IgnoreNoneSerializable.mask & features) != 0) {
            return false;
        }
        if (this.backReference && jSONWriter.containsReference(t)) {
            return false;
        }
        try {
            Object fieldValue = getFieldValue(t);
            if (fieldValue == null) {
                long j2 = JSONWriter.Feature.WriteNulls.mask;
                if (this.array) {
                    j2 |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                    j = JSONWriter.Feature.NullAsDefaultValue.mask;
                } else if (this.number) {
                    j2 |= JSONWriter.Feature.WriteNullNumberAsZero.mask;
                    j = JSONWriter.Feature.NullAsDefaultValue.mask;
                } else {
                    Class cls = this.fieldClass;
                    if (cls == Boolean.class) {
                        j2 |= JSONWriter.Feature.WriteNullBooleanAsFalse.mask;
                        j = JSONWriter.Feature.NullAsDefaultValue.mask;
                    } else if (cls == String.class) {
                        j2 |= JSONWriter.Feature.WriteNullStringAsEmpty.mask;
                        j = JSONWriter.Feature.NullAsDefaultValue.mask;
                    } else {
                        j = JSONWriter.Feature.NullAsDefaultValue.mask;
                    }
                }
                if (((j2 | j) & features) == 0) {
                    return false;
                }
                writeFieldName(jSONWriter);
                if (this.array) {
                    jSONWriter.writeArrayNull();
                } else if (this.number) {
                    Class cls2 = this.fieldClass;
                    if (cls2 == Float.class || cls2 == Double.class || cls2 == BigDecimal.class) {
                        jSONWriter.writeDecimalNull();
                    } else if (cls2 == Long.class) {
                        jSONWriter.writeInt64Null(features);
                    } else {
                        jSONWriter.writeNumberNull();
                    }
                } else {
                    Class<?> cls3 = this.fieldClass;
                    if (cls3 == Appendable.class || cls3 == StringBuffer.class || cls3 == StringBuilder.class) {
                        jSONWriter.writeStringNull();
                    } else if (cls3 == Boolean.class || cls3 == AtomicBoolean.class) {
                        jSONWriter.writeBooleanNull();
                    } else {
                        jSONWriter.writeObjectNull(cls3);
                    }
                }
                return true;
            }
            if (fieldValue == t && this.fieldClass == Throwable.class && (field = this.field) != null && field.getDeclaringClass() == Throwable.class) {
                return false;
            }
            if ((JSONWriter.Feature.IgnoreNoneSerializable.mask & features) != 0 && !(fieldValue instanceof Serializable)) {
                return false;
            }
            if ((JSONWriter.Feature.IgnoreEmpty.mask & features) != 0) {
                if ((fieldValue instanceof Collection) && ((Collection) fieldValue).isEmpty()) {
                    return false;
                }
                if ((fieldValue instanceof Map) && ((Map) fieldValue).isEmpty()) {
                    return false;
                }
            }
            boolean zIsRefDetect = jSONWriter.isRefDetect(fieldValue);
            if (zIsRefDetect) {
                if (fieldValue == t) {
                    writeFieldName(jSONWriter);
                    jSONWriter.writeReference("..");
                    return true;
                }
                String path = jSONWriter.setPath(this, fieldValue);
                if (path != null) {
                    writeFieldName(jSONWriter);
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(fieldValue);
                    return true;
                }
            } else if (this.fieldName.startsWith("this$")) {
                return false;
            }
            Class<?> cls4 = fieldValue.getClass();
            if (cls4 == byte[].class) {
                writeBinary(jSONWriter, (byte[]) fieldValue);
                return true;
            }
            ObjectWriter objectWriter = getObjectWriter(jSONWriter, cls4);
            if (objectWriter == null) {
                throw new JSONException(AbstractC1194.m2782(cls4, "get objectWriter error : "));
            }
            if (this.unwrapped && writeWithUnwrapped(jSONWriter, fieldValue, features, zIsRefDetect, objectWriter)) {
                fieldValue = fieldValue;
                return true;
            }
            fieldValue = fieldValue;
            writeFieldName(jSONWriter);
            boolean z = jSONWriter.jsonb;
            long j3 = this.features;
            if ((JSONWriter.Feature.BeanToArray.mask & j3) != 0) {
                if (z) {
                    objectWriter.writeArrayMappingJSONB(jSONWriter, fieldValue, this.fieldName, this.fieldType, j3);
                } else {
                    objectWriter.writeArrayMapping(jSONWriter, fieldValue, this.fieldName, this.fieldType, j3);
                }
            } else if (z) {
                objectWriter.writeJSONB(jSONWriter, fieldValue, this.fieldName, this.fieldType, j3);
            } else {
                objectWriter.write(jSONWriter, fieldValue, this.fieldName, this.fieldType, j3);
            }
            if (zIsRefDetect) {
                jSONWriter.popPath(fieldValue);
            }
            return true;
        } catch (RuntimeException e) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getInitWriter() {
        return this.initObjectWriter;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        Class cls2 = this.initValueClass;
        if (cls2 == null || this.initObjectWriter == ObjectWriterBaseModule.VoidObjectWriter.INSTANCE) {
            return getObjectWriterVoid(jSONWriter, cls);
        }
        boolean zTypeMatch = cls2 == cls || (this.writeUsing && cls2.isAssignableFrom(cls)) || ((cls2 == Map.class && Map.class.isAssignableFrom(cls)) || (cls2 == List.class && List.class.isAssignableFrom(cls)));
        if (!zTypeMatch && cls2.isPrimitive()) {
            zTypeMatch = typeMatch(cls2, cls);
        }
        if (zTypeMatch) {
            return this.initObjectWriter == null ? getObjectWriterTypeMatch(jSONWriter, cls) : this.initObjectWriter;
        }
        return getObjectWriterTypeNotMatch(jSONWriter, cls);
    }

    public final ObjectWriter getObjectWriterVoid(JSONWriter jSONWriter, Class cls) {
        ObjectWriter objectWriterImplDoubleValueArray;
        boolean z = false;
        if (BeanUtils.isExtendedMap(cls) && "$super$".equals(this.fieldName)) {
            JSONWriter.Context context = jSONWriter.context;
            ObjectWriter objectWriter = context.provider.getObjectWriter(this.fieldType, this.fieldClass, ((this.features | context.getFeatures()) & JSONWriter.Feature.FieldBased.mask) != 0);
            if (this.initObjectWriter == null) {
                AtomicReferenceFieldUpdater<FieldWriterObject, Class> atomicReferenceFieldUpdater = initValueClassUpdater;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cls)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> atomicReferenceFieldUpdater2 = FieldWriter.initObjectWriterUpdater;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, objectWriter)) {
                    if (atomicReferenceFieldUpdater2.get(this) != null) {
                        return objectWriter;
                    }
                }
                return objectWriter;
            }
            return objectWriter;
        }
        if (this.format == null) {
            JSONWriter.Context context2 = jSONWriter.context;
            objectWriterImplDoubleValueArray = context2.provider.getObjectWriterFromCache(cls, cls, ((this.features | context2.getFeatures()) & JSONWriter.Feature.FieldBased.mask) != 0);
        } else {
            objectWriterImplDoubleValueArray = null;
        }
        DecimalFormat decimalFormat = this.decimalFormat;
        if (cls == Float[].class) {
            objectWriterImplDoubleValueArray = decimalFormat != null ? new ObjectWriterArrayFinal(Float.class, decimalFormat) : ObjectWriterArrayFinal.FLOAT_ARRAY;
        } else if (cls == Double[].class) {
            objectWriterImplDoubleValueArray = decimalFormat != null ? new ObjectWriterArrayFinal(Double.class, decimalFormat) : ObjectWriterArrayFinal.DOUBLE_ARRAY;
        } else if (cls == float[].class) {
            objectWriterImplDoubleValueArray = decimalFormat != null ? new ObjectWriterImplFloatValueArray(decimalFormat) : ObjectWriterImplFloatValueArray.INSTANCE;
        } else if (cls == double[].class) {
            objectWriterImplDoubleValueArray = decimalFormat != null ? new ObjectWriterImplDoubleValueArray(decimalFormat) : ObjectWriterImplDoubleValueArray.INSTANCE;
        }
        if (objectWriterImplDoubleValueArray == null) {
            objectWriterImplDoubleValueArray = FieldWriter.getObjectWriter(this.fieldType, this.fieldClass, this.format, this.locale, cls);
        }
        if (objectWriterImplDoubleValueArray != null) {
            if (this.initObjectWriter == null) {
                AtomicReferenceFieldUpdater<FieldWriterObject, Class> atomicReferenceFieldUpdater3 = initValueClassUpdater;
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, null, cls)) {
                    if (atomicReferenceFieldUpdater3.get(this) != null) {
                    }
                }
                AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> atomicReferenceFieldUpdater4 = FieldWriter.initObjectWriterUpdater;
                while (!atomicReferenceFieldUpdater4.compareAndSet(this, null, objectWriterImplDoubleValueArray)) {
                    if (atomicReferenceFieldUpdater4.get(this) != null) {
                        return objectWriterImplDoubleValueArray;
                    }
                }
                return objectWriterImplDoubleValueArray;
            }
            return objectWriterImplDoubleValueArray;
        }
        AtomicReferenceFieldUpdater<FieldWriterObject, Class> atomicReferenceFieldUpdater5 = initValueClassUpdater;
        do {
            if (atomicReferenceFieldUpdater5.compareAndSet(this, null, cls)) {
                z = true;
                break;
            }
        } while (atomicReferenceFieldUpdater5.get(this) == null);
        ObjectWriter objectWriter2 = jSONWriter.getObjectWriter(cls);
        if (z) {
            AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> atomicReferenceFieldUpdater6 = FieldWriter.initObjectWriterUpdater;
            while (!atomicReferenceFieldUpdater6.compareAndSet(this, null, objectWriter2)) {
                if (atomicReferenceFieldUpdater6.get(this) != null) {
                }
            }
            return objectWriter2;
        }
        return objectWriter2;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean unwrapped() {
        return this.unwrapped;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        JSONWriter.Context context = jSONWriter.context;
        long features = context.getFeatures();
        context.setFeatures(this.features | features);
        boolean zWriteInternal = writeInternal(jSONWriter, t);
        context.setFeatures(features);
        return zWriteInternal;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeEnumJSONB(JSONWriter jSONWriter, Enum r11) {
        ObjectWriter objectWriter;
        if (r11 == null) {
            return;
        }
        writeFieldName(jSONWriter);
        Class<?> cls = r11.getClass();
        if (this.initValueClass == null) {
            this.initValueClass = cls;
            objectWriter = jSONWriter.getObjectWriter(cls);
            AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> atomicReferenceFieldUpdater = FieldWriter.initObjectWriterUpdater;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, objectWriter) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        } else {
            objectWriter = this.initValueClass == cls ? this.initObjectWriter : jSONWriter.getObjectWriter(cls);
        }
        ObjectWriter objectWriter2 = objectWriter;
        if (objectWriter2 == null) {
            throw new JSONException(AbstractC1194.m2782(cls, "get value writer error, valueType : "));
        }
        objectWriter2.writeJSONB(jSONWriter, r11, this.fieldName, this.fieldType, this.features);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        ObjectWriter objectWriter;
        JSONWriter jSONWriter2;
        Object fieldValue = getFieldValue(t);
        if (fieldValue == null) {
            jSONWriter.writeNull();
            return;
        }
        Class<?> cls = fieldValue.getClass();
        if (this.initValueClass == null) {
            this.initValueClass = cls;
            objectWriter = jSONWriter.getObjectWriter(cls);
            AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> atomicReferenceFieldUpdater = FieldWriter.initObjectWriterUpdater;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, objectWriter) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        } else {
            objectWriter = this.initValueClass == cls ? this.initObjectWriter : jSONWriter.getObjectWriter(cls);
        }
        if (objectWriter == null) {
            throw new JSONException(AbstractC1194.m2782(cls, "get value writer error, valueType : "));
        }
        boolean z = jSONWriter.isRefDetect() && !ObjectWriterProvider.isNotReferenceDetect(cls);
        if (z) {
            if (fieldValue == t) {
                jSONWriter.writeReference("..");
                return;
            }
            String path = jSONWriter.setPath(this.fieldName, fieldValue);
            if (path != null) {
                jSONWriter.writeReference(path);
                jSONWriter.popPath(fieldValue);
                return;
            }
        }
        if (!jSONWriter.jsonb) {
            ObjectWriter objectWriter2 = objectWriter;
            jSONWriter2 = jSONWriter;
            objectWriter2.write(jSONWriter2, fieldValue, this.fieldName, this.fieldClass, this.features);
        } else if (jSONWriter.isBeanToArray()) {
            ObjectWriter objectWriter3 = objectWriter;
            jSONWriter2 = jSONWriter;
            objectWriter3.writeArrayMappingJSONB(jSONWriter2, fieldValue, this.fieldName, this.fieldClass, this.features);
        } else {
            ObjectWriter objectWriter4 = objectWriter;
            jSONWriter2 = jSONWriter;
            objectWriter4.writeJSONB(jSONWriter2, fieldValue, this.fieldName, this.fieldClass, this.features);
        }
        if (z) {
            jSONWriter2.popPath(fieldValue);
        }
    }

    public final boolean writeWithUnwrapped(JSONWriter jSONWriter, Object obj, long j, boolean z, ObjectWriter objectWriter) {
        if (!(obj instanceof Map)) {
            if (!(objectWriter instanceof ObjectWriterAdapter)) {
                return false;
            }
            Iterator<FieldWriter> it = ((ObjectWriterAdapter) objectWriter).fieldWriters.iterator();
            while (it.hasNext()) {
                it.next().write(jSONWriter, obj);
            }
            return true;
        }
        boolean z2 = jSONWriter.jsonb;
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            if (value != null || (JSONWriter.Feature.WriteNulls.mask & j) != 0) {
                jSONWriter.writeName(string);
                if (!z2) {
                    jSONWriter.writeColon();
                }
                if (value == null) {
                    jSONWriter.writeNull();
                } else {
                    jSONWriter.getObjectWriter(value.getClass()).write(jSONWriter, value);
                }
            }
        }
        if (z) {
            jSONWriter.popPath(obj);
        }
        return true;
    }
}
