package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONSchemaValidException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.reader.FieldReaderObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.time.temporal.Temporal;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import p000.AbstractC1225feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderObject<T> extends FieldReader<T> {
    protected ObjectReader initReader;

    public FieldReaderObject(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer) {
        this(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field, biConsumer, null, null);
    }

    public static void arrayToMap(final Map map, Collection collection, final String str, final PropertyNamingStrategy propertyNamingStrategy, final ObjectReader objectReader, final BiConsumer biConsumer) {
        collection.forEach(new Consumer() { // from class: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱfeyxiexzfᛱᛴ能不能ᛱUjhhgtgᛱᛲ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FieldReaderObject.lambda$arrayToMap$0(str, propertyNamingStrategy, objectReader, map, biConsumer, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void lambda$arrayToMap$0(String str, PropertyNamingStrategy propertyNamingStrategy, ObjectReader objectReader, Map map, BiConsumer biConsumer, Object obj) {
        Object fieldValue;
        boolean z = obj instanceof Map;
        if (z) {
            fieldValue = ((Map) obj).get(str);
        } else {
            if (obj == null) {
                throw new JSONException(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("key not found ", str));
            }
            fieldValue = JSONFactory.getObjectWriter(obj.getClass(), 0L).getFieldValue(obj, str);
        }
        if (propertyNamingStrategy != null && (fieldValue instanceof String)) {
            fieldValue = propertyNamingStrategy.fieldName((String) fieldValue);
        }
        if (!objectReader.getObjectClass().isInstance(obj)) {
            if (!z) {
                throw new JSONException("can not accept " + JSON.toJSONString(obj, JSONWriter.Feature.ReferenceDetection));
            }
            obj = objectReader.createInstance((Map) obj, new JSONReader.Feature[0]);
        }
        Object objPutIfAbsent = map.putIfAbsent(fieldValue, obj);
        if ((objPutIfAbsent != null) && (biConsumer != 0)) {
            biConsumer.accept(objPutIfAbsent, obj);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, boolean z) {
        this.propertyAccessor.setBooleanValue(t, z);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public BiConsumer getFunction() {
        return this.function;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getInitReader() {
        return this.initReader;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getObjectReader(JSONReader jSONReader) {
        ObjectReader objectReader = this.initReader;
        if (objectReader != null) {
            return objectReader;
        }
        if (this.reader != null) {
            return this.reader;
        }
        ObjectReader objectReaderCreateFormattedObjectReader = FieldReader.createFormattedObjectReader(this.fieldType, this.fieldClass, this.format, this.locale);
        if (objectReaderCreateFormattedObjectReader != null) {
            this.reader = objectReaderCreateFormattedObjectReader;
            return objectReaderCreateFormattedObjectReader;
        }
        Class cls = this.fieldClass;
        if (cls != null && Map.class.isAssignableFrom(cls)) {
            ObjectReader objectReaderOf = ObjectReaderImplMap.of(this.fieldType, this.fieldClass, this.features);
            this.reader = objectReaderOf;
            return objectReaderOf;
        }
        Class cls2 = this.fieldClass;
        if (cls2 == null || !Collection.class.isAssignableFrom(cls2)) {
            ObjectReader objectReader2 = jSONReader.getObjectReader(this.fieldType);
            this.reader = objectReader2;
            return objectReader2;
        }
        ObjectReader objectReaderOf2 = ObjectReaderImplList.of(this.fieldType, this.fieldClass, this.features);
        this.reader = objectReaderOf2;
        return objectReaderOf2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void processExtra(JSONReader jSONReader, Object obj) {
        if (this.initReader == null) {
            this.initReader = getObjectReader(jSONReader);
        }
        if ((this.initReader instanceof ObjectReaderBean) && this.field != null) {
            FieldReader fieldReader = this.initReader.getFieldReader(jSONReader.getFieldName());
            if (fieldReader != 0) {
                try {
                    Object objCreateInstance = this.field.get(obj);
                    if (objCreateInstance == null) {
                        objCreateInstance = this.initReader.createInstance(this.features);
                        accept(obj, objCreateInstance);
                    }
                    fieldReader.readFieldValue(jSONReader, objCreateInstance);
                    return;
                } catch (Exception e) {
                    throw new JSONException("read unwrapped field error", e);
                }
            }
        }
        jSONReader.skipValue();
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0139  */
    /* JADX WARN: Code duplicated, block: B:83:0x013e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0142  */
    /* JADX WARN: Code duplicated, block: B:86:0x0165  */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0142, please report this as an issue */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        Member member;
        String strM2706Ujhhgtgfeyxiexzf;
        if (!this.fieldClassSerializable) {
            long features = jSONReader.getContext().getFeatures();
            if ((JSONReader.Feature.IgnoreNoneSerializable.mask & features) != 0) {
                jSONReader.skipValue();
                return;
            } else if ((features & JSONReader.Feature.ErrorOnNoneSerializable.mask) != 0) {
                throw new JSONException("not support none-Serializable");
            }
        }
        ObjectReader objectReaderCreateFormattedObjectReader = this.initReader;
        if (objectReaderCreateFormattedObjectReader == null) {
            objectReaderCreateFormattedObjectReader = FieldReader.createFormattedObjectReader(this.fieldType, this.fieldClass, this.format, this.locale);
            if (objectReaderCreateFormattedObjectReader != null) {
                this.initReader = objectReaderCreateFormattedObjectReader;
            } else {
                objectReaderCreateFormattedObjectReader = jSONReader.getContext().getObjectReader(this.fieldType);
                this.initReader = objectReaderCreateFormattedObjectReader;
            }
        }
        ObjectReader objectReader = objectReaderCreateFormattedObjectReader;
        if (jSONReader.isReference()) {
            String reference = jSONReader.readReference();
            if ("..".equals(reference)) {
                accept(t, t);
                return;
            } else {
                addResolveTask(jSONReader, t, reference);
                return;
            }
        }
        Object object = null;
        try {
            char cCurrent = jSONReader.current();
            if (jSONReader.nextIfNullOrEmptyString()) {
                Object obj = this.defaultValue;
                if (obj != null) {
                    object = obj;
                } else {
                    Class cls = this.fieldClass;
                    if (cls == OptionalInt.class) {
                        object = OptionalInt.empty();
                    } else if (cls == OptionalLong.class) {
                        object = OptionalLong.empty();
                    } else if (cls == OptionalDouble.class) {
                        object = OptionalDouble.empty();
                    } else if (cls == Optional.class) {
                        object = Optional.empty();
                    } else if (cCurrent != 'n') {
                        if (Map.class.isAssignableFrom(cls) && this.fieldClass.equals(this.fieldType)) {
                            object = getObjectReader(jSONReader).createInstance();
                        } else if (!Temporal.class.isAssignableFrom(this.fieldClass)) {
                            object = this.fieldClass == byte[].class ? new byte[0] : "";
                        }
                    }
                }
            } else if (!jSONReader.jsonb) {
                object = objectReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features);
            } else if (this.fieldClass == Object.class) {
                ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(Object.class, 0L, this.features);
                object = objectReaderCheckAutoType != null ? objectReaderCheckAutoType.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features) : jSONReader.readAny();
            } else {
                object = objectReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features);
            }
        } catch (JSONSchemaValidException e) {
            throw e;
        } catch (Exception e2) {
            e = e2;
            if ((this.features & JSONReader.Feature.NullOnError.mask) == 0) {
                member = this.field;
                if (member == null) {
                    member = this.method;
                }
                if (member != null) {
                    strM2706Ujhhgtgfeyxiexzf = "read field '" + member.getDeclaringClass().getName() + "." + member.getName();
                } else {
                    strM2706Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("read field "), this.fieldName, " error");
                }
                throw new JSONException(jSONReader.info(strM2706Ujhhgtgfeyxiexzf), e);
            }
        } catch (IllegalAccessError e3) {
            e = e3;
            if ((this.features & JSONReader.Feature.NullOnError.mask) == 0) {
                member = this.field;
                if (member == null) {
                    member = this.method;
                }
                if (member != null) {
                    strM2706Ujhhgtgfeyxiexzf = "read field '" + member.getDeclaringClass().getName() + "." + member.getName();
                } else {
                    strM2706Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("read field "), this.fieldName, " error");
                }
                throw new JSONException(jSONReader.info(strM2706Ujhhgtgfeyxiexzf), e);
            }
        }
        accept(t, object);
        if (!this.noneStaticMemberClass || object == null) {
            return;
        }
        BeanUtils.setNoneStaticMemberClassParent(object, t);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValueJSONB(JSONReader jSONReader, T t) {
        if (!this.fieldClassSerializable && jSONReader.getType() != -110) {
            long features = jSONReader.getContext().getFeatures();
            if ((JSONReader.Feature.IgnoreNoneSerializable.mask & features) != 0) {
                jSONReader.skipValue();
                return;
            } else if ((features & JSONReader.Feature.ErrorOnNoneSerializable.mask) != 0 && (this.fieldClass != Object.class || jSONReader.isObject() || jSONReader.getType() == -110)) {
                throw new JSONException("not support none-Serializable");
            }
        }
        if (this.initReader == null) {
            this.initReader = jSONReader.getContext().getObjectReader(this.fieldType);
        }
        if (jSONReader.isReference()) {
            String reference = jSONReader.readReference();
            if ("..".equals(reference)) {
                accept(t, t);
                return;
            } else {
                addResolveTask(jSONReader, t, reference);
                return;
            }
        }
        Object jSONBObject = this.initReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features);
        if (jSONBObject == null && (jSONReader.features(this.features) & JSONReader.Feature.ErrorOnNullForPrimitives.mask) != 0 && this.fieldClass.isPrimitive()) {
            throw new JSONException(jSONReader.info("primitive value not support input null"));
        }
        accept(t, jSONBObject);
    }

    public FieldReaderObject(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer, ObjectReader objectReader) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field, biConsumer, null, null);
        this.initReader = objectReader;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, byte b) {
        this.propertyAccessor.setByteValue(t, b);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, short s) {
        this.propertyAccessor.setShortValue(t, s);
    }

    public FieldReaderObject(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer, String str3, Parameter parameter) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field, biConsumer, str3, parameter);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, int i) {
        this.propertyAccessor.setIntValue(t, i);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, long j) {
        this.propertyAccessor.setLongValue(t, j);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, float f) {
        this.propertyAccessor.setFloatValue(t, f);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, double d) {
        this.propertyAccessor.setDoubleValue(t, d);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, char c) {
        this.propertyAccessor.setCharValue(t, c);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        if (isParameter()) {
            return;
        }
        if (obj != null || (this.features & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            if (obj != null && !this.fieldClass.isInstance(obj)) {
                obj = TypeUtils.cast(obj, this.fieldType);
            }
            this.propertyAccessor.setObject(t, obj);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getObjectReader(JSONReader.Context context) {
        if (this.reader != null) {
            return this.reader;
        }
        ObjectReader objectReaderCreateFormattedObjectReader = FieldReader.createFormattedObjectReader(this.fieldType, this.fieldClass, this.format, this.locale);
        if (objectReaderCreateFormattedObjectReader != null) {
            this.reader = objectReaderCreateFormattedObjectReader;
            return objectReaderCreateFormattedObjectReader;
        }
        if (Map.class.isAssignableFrom(this.fieldClass)) {
            ObjectReader objectReaderOf = ObjectReaderImplMap.of(this.fieldType, this.fieldClass, this.features);
            this.reader = objectReaderOf;
            return objectReaderOf;
        }
        if (Collection.class.isAssignableFrom(this.fieldClass)) {
            ObjectReader objectReaderOf2 = ObjectReaderImplList.of(this.fieldType, this.fieldClass, this.features);
            this.reader = objectReaderOf2;
            return objectReaderOf2;
        }
        ObjectReader objectReader = context.getObjectReader(this.fieldType);
        this.reader = objectReader;
        return objectReader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        Object object;
        if (this.initReader == null) {
            this.initReader = getObjectReader(jSONReader);
        }
        if (jSONReader.jsonb) {
            object = this.initReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features);
        } else {
            object = this.initReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features);
        }
        Function buildFunction = this.initReader.getBuildFunction();
        return buildFunction != 0 ? buildFunction.apply(object) : object;
    }
}
