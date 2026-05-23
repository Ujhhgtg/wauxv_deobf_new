package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderList<T, V> extends FieldReaderObject<T> {
    final long fieldClassHash;
    final long itemClassHash;
    final ObjectReader<V> itemObjectReader;
    final Supplier<List<V>> listCreator;

    public FieldReaderList(String str, Type type, Class cls, Type type2, Class cls2, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer, String str3, Parameter parameter, Supplier<List<V>> supplier, ObjectReader<V> objectReader) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field, biConsumer, str3, parameter);
        this.itemType = type2;
        this.itemClass = cls2;
        this.itemClassHash = cls2 == null ? 0L : Fnv.hashCode64(cls2.getName());
        this.fieldClassHash = cls != null ? Fnv.hashCode64(TypeUtils.getTypeName(cls)) : 0L;
        this.listCreator = supplier;
        this.itemObjectReader = objectReader;
        if (str2 == null || type2 != Date.class) {
            return;
        }
        this.itemReader = new ObjectReaderImplDate(str2, locale);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader checkObjectAutoType(JSONReader jSONReader) {
        if (!jSONReader.nextIfMatch(-110)) {
            return null;
        }
        long typeHashCode = jSONReader.readTypeHashCode();
        long jFeatures = jSONReader.features(this.features);
        JSONReader.Context context = jSONReader.getContext();
        JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
        if (contextAutoTypeBeforeHandler != null) {
            Class<?> clsApply = contextAutoTypeBeforeHandler.apply(typeHashCode, this.fieldClass, jFeatures);
            if (clsApply == null) {
                clsApply = contextAutoTypeBeforeHandler.apply(jSONReader.getString(), this.fieldClass, jFeatures);
            }
            if (clsApply != null) {
                return context.getObjectReader(this.fieldClass);
            }
        }
        if (!jSONReader.isSupportAutoType(jFeatures)) {
            if (jSONReader.isArray() && !jSONReader.isEnabled(JSONReader.Feature.ErrorOnNotSupportAutoType)) {
                return getObjectReader(jSONReader);
            }
            throw new JSONException(jSONReader.info("autoType not support input " + jSONReader.getString()));
        }
        ObjectReader objectReaderAutoType = jSONReader.getObjectReaderAutoType(typeHashCode, this.fieldClass, jFeatures);
        if (objectReaderAutoType instanceof ObjectReaderImplList) {
            ObjectReaderImplList objectReaderImplList = (ObjectReaderImplList) objectReaderAutoType;
            objectReaderAutoType = new ObjectReaderImplList(this.fieldType, this.fieldClass, objectReaderImplList.instanceType, this.itemType, objectReaderImplList.builder);
        }
        if (objectReaderAutoType != null) {
            return objectReaderAutoType;
        }
        throw new JSONException(jSONReader.info("autoType not support : " + jSONReader.getString()));
    }

    public Collection<V> createList(JSONReader.Context context) {
        Supplier<List<V>> supplier = this.listCreator;
        if (supplier != null) {
            return supplier.get();
        }
        Class cls = this.fieldClass;
        return (cls == List.class || cls == Collection.class || cls == ArrayList.class) ? new ArrayList() : (Collection) getObjectReader(context).createInstance(this.features);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public long getItemClassHash() {
        return this.itemClassHash;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) {
        Object object;
        JSONReader jSONReader2;
        if (jSONReader.jsonb) {
            readFieldValueJSONB(jSONReader, t);
            return;
        }
        Function buildFunction = null;
        if (jSONReader.nextIfNull()) {
            accept(t, (Object) null);
            return;
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
        JSONReader.Context context = jSONReader.getContext();
        ObjectReader objectReader = getObjectReader(context);
        ObjectReader objectReader2 = this.initReader;
        if (objectReader2 != null) {
            buildFunction = objectReader2.getBuildFunction();
        } else if (objectReader instanceof ObjectReaderImplList) {
            buildFunction = objectReader.getBuildFunction();
        }
        char cCurrent = jSONReader.current();
        if (cCurrent != '[') {
            if (cCurrent != '{' || !(getItemObjectReader(context) instanceof ObjectReaderBean)) {
                accept(t, false ? objectReader.readJSONBObject(jSONReader, null, null, this.features) : objectReader.readObject(jSONReader, null, null, this.features));
                return;
            }
            Object jSONBObject = false ? this.itemReader.readJSONBObject(jSONReader, null, null, this.features) : this.itemReader.readObject(jSONReader, null, null, this.features);
            Collection collection = (Collection) objectReader.createInstance(this.features);
            collection.add(jSONBObject);
            if (buildFunction != null) {
                collection = (Collection) buildFunction.apply(collection);
            }
            accept(t, collection);
            jSONReader.nextIfComma();
            return;
        }
        ObjectReader itemObjectReader = getItemObjectReader(context);
        Collection collectionCreateList = createList(context);
        jSONReader.next();
        int i = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.readReference(collectionCreateList, i)) {
                jSONReader2 = jSONReader;
            } else {
                if (jSONReader.isString() && (itemObjectReader instanceof ObjectReaderInterface)) {
                    object = jSONReader.readString();
                    jSONReader2 = jSONReader;
                } else {
                    JSONReader jSONReader3 = jSONReader;
                    object = itemObjectReader.readObject(jSONReader3, null, null, 0L);
                    jSONReader2 = jSONReader3;
                }
                collectionCreateList.add(object);
                jSONReader2.nextIfComma();
            }
            i++;
            jSONReader = jSONReader2;
        }
        if (buildFunction != null) {
            collectionCreateList = (Collection) buildFunction.apply(collectionCreateList);
        }
        accept(t, collectionCreateList);
        jSONReader.nextIfComma();
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        Function typeConvert;
        int i = 0;
        if (jSONReader.jsonb) {
            int iStartArray = jSONReader.startArray();
            if (iStartArray == -1) {
                return null;
            }
            Object[] objArr = new Object[iStartArray];
            ObjectReader itemObjectReader = getItemObjectReader(jSONReader.getContext());
            while (i < iStartArray) {
                JSONReader jSONReader2 = jSONReader;
                objArr[i] = itemObjectReader.readObject(jSONReader2, null, null, 0L);
                i++;
                jSONReader = jSONReader2;
            }
            return Arrays.asList(objArr);
        }
        if (jSONReader.current() == '[') {
            JSONReader.Context context = jSONReader.getContext();
            ObjectReader itemObjectReader2 = getItemObjectReader(context);
            Collection<V> collectionCreateList = createList(context);
            jSONReader.next();
            while (!jSONReader.nextIfArrayEnd()) {
                collectionCreateList.add(itemObjectReader2.readObject(jSONReader, this.fieldType, this.fieldName, 0L));
                jSONReader.nextIfComma();
                itemObjectReader2 = itemObjectReader2;
            }
            jSONReader.nextIfComma();
            return collectionCreateList;
        }
        if (jSONReader.isString()) {
            String string = jSONReader.readString();
            Type type = this.itemType;
            if ((type instanceof Class) && Number.class.isAssignableFrom((Class) type) && (typeConvert = jSONReader.getContext().getProvider().getTypeConvert(String.class, this.itemType)) != null) {
                Collection<V> collectionCreateList2 = createList(jSONReader.getContext());
                if (string.indexOf(44) != -1) {
                    String[] strArrSplit = string.split(",");
                    int length = strArrSplit.length;
                    while (i < length) {
                        collectionCreateList2.add(typeConvert.apply(strArrSplit[i]));
                        i++;
                    }
                }
                return collectionCreateList2;
            }
        }
        throw new JSONException(jSONReader.info("TODO : " + getClass()));
    }
}
