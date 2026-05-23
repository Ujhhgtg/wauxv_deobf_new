package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderAdapter<T> extends ObjectReaderBean<T> {
    final Constructor constructor;
    protected final FieldReader[] fieldReaders;
    final long[] hashCodes;
    final long[] hashCodesLCase;
    volatile boolean instantiationError;
    final short[] mapping;
    final short[] mappingLCase;
    final int parameterCount;
    final Class[] seeAlso;
    final Class seeAlsoDefault;
    final Map<Long, Class> seeAlsoMapping;
    final String[] seeAlsoNames;
    protected final String typeKey;
    protected final long typeKeyHashCode;

    public ObjectReaderAdapter(Class cls, Supplier<T> supplier, FieldReader... fieldReaderArr) {
        this(cls, null, null, 0L, null, supplier, null, fieldReaderArr);
    }

    public void apply(Consumer<FieldReader> consumer) {
        for (FieldReader fieldReader : this.fieldReaders) {
            try {
                consumer.accept(fieldReader);
            } catch (RuntimeException e) {
                if (!ignoreError(fieldReader)) {
                    throw e;
                }
            }
        }
    }

    public Object autoType(JSONReader jSONReader, Class cls, long j) {
        long typeHashCode = jSONReader.readTypeHashCode();
        JSONReader.Context context = jSONReader.getContext();
        ObjectReader objectReaderAutoType = jSONReader.isSupportAutoTypeOrHandler(j) ? context.getObjectReaderAutoType(typeHashCode) : null;
        if (objectReaderAutoType == null) {
            String string = jSONReader.getString();
            ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, cls, this.features | j | context.getFeatures());
            if (objectReaderAutoType2 != null) {
                objectReaderAutoType = objectReaderAutoType2;
            } else {
                if (cls != this.objectClass) {
                    throw new JSONException(jSONReader.info("autoType not support : " + string));
                }
                objectReaderAutoType = this;
            }
        }
        return objectReaderAutoType.readObject(jSONReader, null, null, j);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(Collection collection, long j) {
        T tCreateInstance = createInstance(0L);
        int i = 0;
        for (Object obj : collection) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i >= fieldReaderArr.length) {
                break;
            }
            fieldReaderArr[i].accept(tCreateInstance, obj);
            i++;
        }
        return tCreateInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object createInstance0(long j) {
        Constructor constructor;
        if ((j & JSONReader.Feature.UseDefaultConstructorAsPossible.mask) == 0 || (constructor = this.constructor) == null || this.parameterCount != 0) {
            Supplier<T> supplier = this.creator;
            if (supplier != null) {
                return supplier.get();
            }
            throw new JSONException("create instance error, " + this.objectClass);
        }
        try {
            Object objNewInstance = constructor.newInstance(null);
            if (this.hasDefaultValue) {
                initDefaultValue(objNewInstance);
            }
            return objNewInstance;
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new JSONException("create instance error, " + this.objectClass, e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final Function getBuildFunction() {
        return this.buildFunction;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final long getFeatures() {
        return this.features;
    }

    public int getFieldOrdinal(long j) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j);
        if (iBinarySearch < 0) {
            return -1;
        }
        return this.mapping[iBinarySearch];
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReader(long j) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.fieldReaders[this.mapping[iBinarySearch]];
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReaderLCase(long j) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodesLCase, j);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.fieldReaders[this.mappingLCase[iBinarySearch]];
    }

    public final FieldReader getFieldReaderUL(long j, JSONReader jSONReader, long j2) {
        FieldReader fieldReader = getFieldReader(j);
        return (fieldReader == null && jSONReader.isSupportSmartMatch(j2 | this.features)) ? getFieldReaderLCase(jSONReader.getNameHashCodeLCase()) : fieldReader;
    }

    public FieldReader[] getFieldReaders() {
        FieldReader[] fieldReaderArr = this.fieldReaders;
        return (FieldReader[]) Arrays.copyOf(fieldReaderArr, fieldReaderArr.length);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final String getTypeKey() {
        return this.typeKey;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final long getTypeKeyHash() {
        return this.typeKeyHashCode;
    }

    public final boolean ignoreError(FieldReader fieldReader) {
        return (fieldReader.features & JSONReader.Feature.NullOnError.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initDefaultValue(T t) {
        int i = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i >= fieldReaderArr.length) {
                return;
            }
            FieldReader fieldReader = fieldReaderArr[i];
            Object obj = fieldReader.defaultValue;
            if (obj != null) {
                fieldReader.accept(t, obj);
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initStringFieldAsEmpty(Object obj) {
        int i = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i >= fieldReaderArr.length) {
                return;
            }
            FieldReader fieldReader = fieldReaderArr[i];
            if (fieldReader.fieldClass == String.class) {
                fieldReader.accept(obj, "");
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        ObjectReader objectReaderCheckAutoType = checkAutoType(jSONReader, j);
        if (objectReaderCheckAutoType != null) {
            return (T) objectReaderCheckAutoType.readArrayMappingJSONBObject(jSONReader, type, obj, j);
        }
        T tCreateInstance = createInstance(0L);
        int iStartArray = jSONReader.startArray();
        if (iStartArray == this.fieldReaders.length) {
            int i = 0;
            while (true) {
                FieldReader[] fieldReaderArr = this.fieldReaders;
                if (i >= fieldReaderArr.length) {
                    break;
                }
                FieldReader fieldReader = fieldReaderArr[i];
                try {
                    fieldReader.readFieldValue(jSONReader, tCreateInstance);
                } catch (RuntimeException e) {
                    if (!ignoreError(fieldReader)) {
                        throw e;
                    }
                }
                i++;
            }
        } else {
            readArrayMappingJSONBObject0(jSONReader, tCreateInstance, iStartArray);
        }
        Function function = this.buildFunction;
        return function != null ? (T) function.apply(tCreateInstance) : tCreateInstance;
    }

    public void readArrayMappingJSONBObject0(JSONReader jSONReader, Object obj, int i) {
        int i2 = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i2 >= fieldReaderArr.length) {
                for (int length = fieldReaderArr.length; length < i; length++) {
                    jSONReader.skipValue();
                }
                return;
            }
            if (i2 < i) {
                FieldReader fieldReader = fieldReaderArr[i2];
                try {
                    fieldReader.readFieldValue(jSONReader, obj);
                } catch (RuntimeException e) {
                    if (!ignoreError(fieldReader)) {
                        throw e;
                    }
                }
            }
            i2++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.jsonb) {
            return readArrayMappingJSONBObject(jSONReader, type, obj, j);
        }
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        jSONReader.nextIfArrayStart();
        T t = this.creator.get();
        int i = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i >= fieldReaderArr.length) {
                if (!jSONReader.nextIfArrayEnd()) {
                    throw new JSONException(jSONReader.info("array to bean end error"));
                }
                jSONReader.nextIfComma();
                Function function = this.buildFunction;
                return function != null ? (T) function.apply(t) : t;
            }
            FieldReader fieldReader = fieldReaderArr[i];
            try {
                fieldReader.readFieldValue(jSONReader, t);
            } catch (RuntimeException e) {
                if (!ignoreError(fieldReader)) {
                    throw e;
                }
            }
            i++;
        }
    }

    public final Map<Long, Object> readFieldValue(long j, JSONReader jSONReader, long j2, Map<Long, Object> map) {
        FieldReader fieldReader = getFieldReader(j);
        if (fieldReader == null && jSONReader.isSupportSmartMatch(j2 | this.features)) {
            fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
        }
        if (fieldReader == null) {
            jSONReader.skipValue();
            return map;
        }
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        map.put(Long.valueOf(fieldReader.fieldNameHash), fieldReader.readFieldValue(jSONReader));
        return map;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.objectClass, this.typeNameHash, this.features | j);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType.getObjectClass() != this.objectClass) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j);
        }
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        if (jSONReader.isArray()) {
            if (jSONReader.isSupportBeanArray()) {
                return readArrayMappingJSONBObject(jSONReader, type, obj, j);
            }
            throw new JSONException(jSONReader.info("expect object, but " + JSONB.typeName(jSONReader.getType())));
        }
        jSONReader.nextIfObjectStart();
        int i = 0;
        T tCreateInstance = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == this.typeKeyHashCode && i == 0) {
                long valueHashCode = jSONReader.readValueHashCode();
                JSONReader.Context context = jSONReader.getContext();
                ObjectReader objectReaderAutoType = autoType(context, valueHashCode);
                if (objectReaderAutoType == null) {
                    String string = jSONReader.getString();
                    ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
                    if (objectReaderAutoType2 == null) {
                        throw new JSONException(jSONReader.info("autoType not support : " + string));
                    }
                    objectReaderAutoType = objectReaderAutoType2;
                }
                if (objectReaderAutoType != this) {
                    jSONReader.setTypeRedirect(true);
                    return (T) objectReaderAutoType.readJSONBObject(jSONReader, type, obj, j);
                }
            } else if (fieldNameHashCode != 0) {
                FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                if (fieldReader == null && jSONReader.isSupportSmartMatch(this.features | j)) {
                    fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                }
                if (fieldReader == null) {
                    processExtra(jSONReader, tCreateInstance);
                } else {
                    if (tCreateInstance == null) {
                        tCreateInstance = createInstance(jSONReader.getContext().getFeatures() | j);
                    }
                    fieldReader.readFieldValue(jSONReader, tCreateInstance);
                }
            }
            i++;
        }
        if (tCreateInstance == null) {
            tCreateInstance = createInstance(jSONReader.getContext().getFeatures() | j);
        }
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(tCreateInstance);
        }
        return tCreateInstance;
    }

    public ObjectReaderAdapter(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        this(cls, str, str2, j, jSONSchema, supplier, function, null, null, null, fieldReaderArr);
    }

    public ObjectReaderAdapter(Class cls, String str, String str2, long j, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        this(cls, str, str2, j, null, supplier, function, fieldReaderArr);
    }

    public ObjectReaderAdapter(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier<T> supplier, Function function, Class[] clsArr, String[] strArr, FieldReader... fieldReaderArr) {
        this(cls, str, str2, j, jSONSchema, supplier, function, clsArr, strArr, null, fieldReaderArr);
    }

    public ObjectReaderAdapter(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier<T> supplier, Function function, Class[] clsArr, String[] strArr, Class cls2, FieldReader... fieldReaderArr) {
        FieldReader fieldReader;
        super(cls, supplier, str2, j, jSONSchema, function);
        Constructor defaultConstructor = cls == null ? null : BeanUtils.getDefaultConstructor(cls, true);
        this.constructor = defaultConstructor;
        if (defaultConstructor != null) {
            defaultConstructor.setAccessible(true);
            this.parameterCount = defaultConstructor.getParameterCount();
        } else {
            this.parameterCount = -1;
        }
        if (str != null && !str.isEmpty()) {
            this.typeKey = str;
            this.typeKeyHashCode = Fnv.hashCode64(str);
        } else {
            this.typeKey = "@type";
            this.typeKeyHashCode = ObjectReader.HASH_TYPE;
        }
        this.fieldReaders = fieldReaderArr;
        int length = fieldReaderArr.length;
        long[] jArr = new long[length];
        int length2 = fieldReaderArr.length;
        long[] jArr2 = new long[length2];
        for (int i = 0; i < fieldReaderArr.length; i++) {
            FieldReader fieldReader2 = fieldReaderArr[i];
            jArr[i] = fieldReader2.fieldNameHash;
            jArr2[i] = fieldReader2.fieldNameHashLCase;
            if (fieldReader2.isUnwrapped() && ((fieldReader = this.extraFieldReader) == null || !(fieldReader instanceof FieldReaderAnySetter))) {
                this.extraFieldReader = fieldReader2;
            }
            if (fieldReader2.defaultValue != null) {
                this.hasDefaultValue = true;
            }
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.hashCodes = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.mapping = new short[jArrCopyOf.length];
        for (int i2 = 0; i2 < length; i2++) {
            this.mapping[Arrays.binarySearch(this.hashCodes, jArr[i2])] = (short) i2;
        }
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, length2);
        this.hashCodesLCase = jArrCopyOf2;
        Arrays.sort(jArrCopyOf2);
        this.mappingLCase = new short[jArrCopyOf2.length];
        for (int i3 = 0; i3 < length2; i3++) {
            this.mappingLCase[Arrays.binarySearch(this.hashCodesLCase, jArr2[i3])] = (short) i3;
        }
        this.seeAlso = clsArr;
        if (clsArr != null) {
            this.seeAlsoMapping = new HashMap(clsArr.length, 1.0f);
            this.seeAlsoNames = new String[clsArr.length];
            for (int i4 = 0; i4 < clsArr.length; i4++) {
                Class cls3 = clsArr[i4];
                String simpleName = (strArr == null || strArr.length < i4 + 1) ? null : strArr[i4];
                if (simpleName == null || simpleName.isEmpty()) {
                    simpleName = cls3.getSimpleName();
                }
                this.seeAlsoMapping.put(Long.valueOf(Fnv.hashCode64(simpleName)), cls3);
                this.seeAlsoNames[i4] = simpleName;
            }
        } else {
            this.seeAlsoMapping = null;
            this.seeAlsoNames = null;
        }
        this.seeAlsoDefault = cls2;
        int iMin = 0;
        int iMax = 0;
        for (FieldReader fieldReader3 : fieldReaderArr) {
            int length3 = fieldReader3.fieldName.length();
            iMin = 0;
            iMax = Math.max(iMax, length3);
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(long j) {
        Constructor constructor;
        if (this.instantiationError && (constructor = this.constructor) != null) {
            try {
                T t = (T) constructor.newInstance(null);
                if (this.hasDefaultValue) {
                    initDefaultValue(t);
                }
                return t;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                throw new JSONException("create instance error, " + this.objectClass, e);
            }
        }
        try {
            T t2 = (T) createInstance0(j);
            if (!this.hasDefaultValue) {
                return t2;
            }
            initDefaultValue(t2);
            return t2;
        } catch (Exception e2) {
            this.instantiationError = true;
            Constructor constructor2 = this.constructor;
            if (constructor2 != null) {
                try {
                    T t3 = (T) constructor2.newInstance(new Object[this.parameterCount]);
                    if (this.hasDefaultValue) {
                        initDefaultValue(t3);
                    }
                    return t3;
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
                    throw new JSONException("create instance error, " + this.objectClass, e3);
                }
            }
            throw new JSONException("create instance error, " + this.objectClass, e2);
        }
    }

    public final void readFieldValue(long j, JSONReader jSONReader, long j2, Object obj) {
        FieldReader fieldReader = getFieldReader(j);
        if (fieldReader == null && jSONReader.isSupportSmartMatch(j2 | this.features)) {
            fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
        }
        if (fieldReader != null) {
            if (jSONReader.jsonb) {
                fieldReader.readFieldValueJSONB(jSONReader, obj);
                return;
            } else {
                fieldReader.readFieldValue(jSONReader, obj);
                return;
            }
        }
        processExtra(jSONReader, obj);
    }

    public T autoType(JSONReader jSONReader) {
        ObjectReader objectReader;
        long typeHashCode = jSONReader.readTypeHashCode();
        JSONReader.Context context = jSONReader.getContext();
        ObjectReader objectReaderAutoType = autoType(context, typeHashCode);
        if (objectReaderAutoType == null) {
            String string = jSONReader.getString();
            ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
            if (objectReaderAutoType2 == null) {
                throw new JSONException(jSONReader.info("autoType not support : " + string));
            }
            objectReader = objectReaderAutoType2;
        } else {
            objectReader = objectReaderAutoType;
        }
        return (T) objectReader.readJSONBObject(jSONReader, null, null, this.features);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public ObjectReader autoType(ObjectReaderProvider objectReaderProvider, long j) {
        Map<Long, Class> map = this.seeAlsoMapping;
        if (map != null && map.size() > 0) {
            Class cls = this.seeAlsoMapping.get(Long.valueOf(j));
            if (cls == null) {
                return null;
            }
            return objectReaderProvider.getObjectReader(cls);
        }
        return objectReaderProvider.getObjectReader(j);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public ObjectReader autoType(JSONReader.Context context, long j) {
        Map<Long, Class> map = this.seeAlsoMapping;
        if (map != null && map.size() > 0) {
            Class cls = this.seeAlsoMapping.get(Long.valueOf(j));
            if (cls == null) {
                return null;
            }
            return context.getObjectReader(cls);
        }
        return context.getObjectReaderAutoType(j);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2 A[Catch: RuntimeException -> 0x00d8, TryCatch #0 {RuntimeException -> 0x00d8, blocks: (B:45:0x00b9, B:48:0x00c2, B:50:0x00c6, B:52:0x00ca, B:55:0x00da, B:59:0x00e2, B:60:0x00f0, B:61:0x00f4), top: B:91:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00da A[Catch: RuntimeException -> 0x00d8, TryCatch #0 {RuntimeException -> 0x00d8, blocks: (B:45:0x00b9, B:48:0x00c2, B:50:0x00c6, B:52:0x00ca, B:55:0x00da, B:59:0x00e2, B:60:0x00f0, B:61:0x00f4), top: B:91:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00de  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0 A[Catch: RuntimeException -> 0x00d8, TryCatch #0 {RuntimeException -> 0x00d8, blocks: (B:45:0x00b9, B:48:0x00c2, B:50:0x00c6, B:52:0x00ca, B:55:0x00da, B:59:0x00e2, B:60:0x00f0, B:61:0x00f4), top: B:91:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4 A[Catch: RuntimeException -> 0x00d8, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00d8, blocks: (B:45:0x00b9, B:48:0x00c2, B:50:0x00c6, B:52:0x00ca, B:55:0x00da, B:59:0x00e2, B:60:0x00f0, B:61:0x00f4), top: B:91:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(Map map, long j) {
        long j2;
        Class<?> cls;
        Type type;
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Object obj = map.get(this.typeKey);
        long defaultReaderFeatures = this.features | j | JSONFactory.getDefaultReaderFeatures();
        long j3 = 0;
        if (obj instanceof String) {
            String str = (String) obj;
            ObjectReader objectReaderAutoType = ((JSONReader.Feature.SupportAutoType.mask & j) != 0 || (this instanceof ObjectReaderSeeAlso)) ? autoType(defaultObjectReaderProvider, Fnv.hashCode64(str)) : null;
            if (objectReaderAutoType == null) {
                objectReaderAutoType = defaultObjectReaderProvider.getObjectReader(str, getObjectClass(), defaultReaderFeatures);
            }
            if (objectReaderAutoType != this && objectReaderAutoType != null) {
                return (T) objectReaderAutoType.createInstance(map, j);
            }
        }
        T tCreateInstance = createInstance(j);
        if (this.extraFieldReader == null && ((JSONReader.Feature.SupportSmartMatch.mask | JSONReader.Feature.ErrorOnUnknownProperties.mask) & defaultReaderFeatures) == 0) {
            int i = 0;
            boolean z = (JSONReader.Feature.FieldBased.mask & defaultReaderFeatures) != 0;
            while (true) {
                FieldReader[] fieldReaderArr = this.fieldReaders;
                if (i >= fieldReaderArr.length) {
                    break;
                }
                FieldReader fieldReader = fieldReaderArr[i];
                Object obj2 = map.get(fieldReader.fieldName);
                if (obj2 == null) {
                    j2 = 0L;
                    if ((JSONReader.Feature.IgnoreSetNullValue.mask & defaultReaderFeatures) != 0L || !map.containsKey(fieldReader.fieldName)) {
                    }
                    i++;
                    j3 = 0L;
                } else {
                    j2 = 0L;
                }
                Field field = fieldReader.field;
                if (field != null && Modifier.isFinal(field.getModifiers())) {
                    try {
                        Object objInvoke = fieldReader.method.invoke(tCreateInstance, null);
                        if (!(objInvoke instanceof Collection) || ((Collection) objInvoke).isEmpty()) {
                            if (obj2 != null) {
                                cls = obj2.getClass();
                                type = fieldReader.fieldType;
                                if (cls == type) {
                                    if (!(fieldReader instanceof FieldReaderList)) {
                                        if (!(obj2 instanceof JSONObject)) {
                                            fieldReader.acceptAny(tCreateInstance, obj2, j);
                                        } else {
                                            fieldReader.acceptAny(tCreateInstance, obj2, j);
                                        }
                                    } else if (!(obj2 instanceof JSONObject)) {
                                        fieldReader.acceptAny(tCreateInstance, obj2, j);
                                    } else {
                                        fieldReader.acceptAny(tCreateInstance, obj2, j);
                                    }
                                } else {
                                    fieldReader.accept(tCreateInstance, obj2);
                                }
                            } else {
                                fieldReader.accept(tCreateInstance, obj2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                } else if (obj2 != null) {
                    try {
                        cls = obj2.getClass();
                        type = fieldReader.fieldType;
                        if (cls == type) {
                            if (!(fieldReader instanceof FieldReaderList) && (obj2 instanceof JSONArray)) {
                                fieldReader.accept(tCreateInstance, fieldReader.getObjectReader(defaultObjectReaderProvider).createInstance((JSONArray) obj2, j));
                            } else if (!(obj2 instanceof JSONObject) && true) {
                                fieldReader.accept(tCreateInstance, defaultObjectReaderProvider.getObjectReader(type, z).createInstance((JSONObject) obj2, j));
                            } else {
                                fieldReader.acceptAny(tCreateInstance, obj2, j);
                            }
                        } else {
                            fieldReader.accept(tCreateInstance, obj2);
                        }
                    } catch (RuntimeException e) {
                        if (!ignoreError(fieldReader)) {
                            throw e;
                        }
                    }
                } else {
                    fieldReader.accept(tCreateInstance, obj2);
                }
                i++;
                j3 = 0L;
            }
        } else {
            for (Map.Entry entry : map.entrySet()) {
                String string = entry.getKey().toString();
                Object value = entry.getValue();
                FieldReader fieldReader2 = getFieldReader(string);
                if (fieldReader2 == null) {
                    acceptExtra(tCreateInstance, string, entry.getValue(), j);
                } else {
                    T t = tCreateInstance;
                    if (value != null && value.getClass() == fieldReader2.fieldType) {
                        fieldReader2.accept(t, value);
                    } else if (value != null && "com.alibaba.fastjson.JSONObject".equals(value.getClass().getName())) {
                        fieldReader2.accept(t, defaultObjectReaderProvider.getObjectReader(fieldReader2.fieldType).createInstance((Map) value, j));
                    } else {
                        fieldReader2.acceptAny(t, value, j);
                    }
                    tCreateInstance = t;
                }
            }
        }
        T t2 = tCreateInstance;
        Function function = this.buildFunction;
        return function != null ? (T) function.apply(t2) : t2;
    }
}
