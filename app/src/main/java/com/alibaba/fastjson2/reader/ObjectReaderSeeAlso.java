package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderSeeAlso<T> extends ObjectReaderAdapter<T> {
    public ObjectReaderSeeAlso(Class cls, Supplier<T> supplier, String str, Class[] clsArr, String[] strArr, Class cls2, FieldReader... fieldReaderArr) {
        super(cls, str, null, JSONReader.Feature.SupportAutoType.mask, null, supplier, null, clsArr, strArr, cls2, fieldReaderArr);
    }

    public ObjectReaderSeeAlso addSubType(Class cls, String str) {
        JSONType jSONType;
        int i = 0;
        while (true) {
            Class[] clsArr = this.seeAlso;
            if (i >= clsArr.length) {
                Class[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length + 1);
                String[] strArr = this.seeAlsoNames;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
                clsArr2[clsArr2.length - 1] = cls;
                if (str == null && (jSONType = (JSONType) cls.getAnnotation(JSONType.class)) != null) {
                    str = jSONType.typeName();
                }
                if (str != null) {
                    strArr2[strArr2.length - 1] = str;
                }
                return new ObjectReaderSeeAlso(this.objectClass, this.creator, this.typeKey, clsArr2, strArr2, this.seeAlsoDefault, this.fieldReaders);
            }
            if (clsArr[i] == cls) {
                return this;
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(long j) {
        Supplier<T> supplier = this.creator;
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
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
        JSONReader.SavePoint savePointMark = jSONReader.mark();
        jSONReader.nextIfObjectStart();
        int i = 0;
        T tCreateInstance = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == this.typeKeyHashCode) {
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
                    if (i != 0) {
                        jSONReader.reset(savePointMark);
                    }
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

    /* JADX WARN: Code duplicated, block: B:118:0x020e A[PHI: r9
      0x020e: PHI (r9v2 com.alibaba.fastjson2.reader.ObjectReader) = 
      (r9v1 com.alibaba.fastjson2.reader.ObjectReader)
      (r9v7 com.alibaba.fastjson2.reader.ObjectReader)
      (r9v7 com.alibaba.fastjson2.reader.ObjectReader)
     binds: [B:112:0x01fb, B:114:0x0201, B:116:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x0211  */
    /* JADX WARN: Code duplicated, block: B:143:0x026b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0270  */
    /* JADX WARN: Code duplicated, block: B:149:0x0284 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0286  */
    /* JADX WARN: Code duplicated, block: B:152:0x028a  */
    /* JADX WARN: Code duplicated, block: B:158:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0159  */
    /* JADX WARN: Code duplicated, block: B:88:0x0175  */
    /* JADX WARN: Code duplicated, block: B:90:0x0185  */
    /* JADX WARN: Code duplicated, block: B:91:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x018b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0191  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a1  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Object obj2;
        Object string;
        int i;
        long j2;
        long j3;
        Object obj3;
        ObjectReader objectReaderAutoType;
        String string2;
        FieldReader fieldReader;
        FieldReader fieldReader2;
        Object obj4;
        T t;
        ObjectReader objectReaderAutoType2;
        Type type2;
        Class<?> clsApply;
        FieldReader fieldReader3;
        Class cls;
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j);
        }
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        Object obj5 = null;
        if (jSONReader.nextIfNull()) {
            jSONReader.nextIfComma();
            return null;
        }
        int i2 = 0;
        if (!jSONReader.isString()) {
            JSONReader.SavePoint savePointMark = jSONReader.mark();
            long jFeatures = jSONReader.features(getFeatures() | j);
            long j4 = 0;
            if (jSONReader.isArray()) {
                return (JSONReader.Feature.SupportArrayToBean.mask & jFeatures) != 0 ? readArrayMappingObject(jSONReader, type, obj, j) : processObjectInputSingleItemArray(jSONReader, type, obj, jFeatures);
            }
            if (!jSONReader.nextIfObjectStart()) {
                char cCurrent = jSONReader.current();
                if (cCurrent == 't' || cCurrent == 'f') {
                    jSONReader.readBoolValue();
                    return null;
                }
                if (cCurrent != '\"' && cCurrent != '\'' && cCurrent != '}') {
                    throw new JSONException(jSONReader.info());
                }
            }
            T tCreateInstance = null;
            LinkedHashMap linkedHashMap = null;
            while (!jSONReader.nextIfObjectEnd()) {
                JSONReader.Context context = jSONReader.getContext();
                long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
                if (fieldNameHashCode == getTypeKeyHash() || !((cls = this.seeAlsoDefault) == null || cls == Void.class)) {
                    long features = j | getFeatures() | context.getFeatures();
                    if ((features & JSONReader.Feature.SupportAutoType.mask) == j4 && contextAutoTypeBeforeHandler == null) {
                        fieldReader3 = getFieldReader(fieldNameHashCode);
                        if (fieldReader3 == null && jSONReader.isSupportSmartMatch(j | getFeatures())) {
                            fieldReader3 = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                        }
                        if (tCreateInstance == null) {
                            tCreateInstance = createInstance(jSONReader.getContext().getFeatures() | j);
                        }
                        if (fieldReader3 == null) {
                            processExtra(jSONReader, tCreateInstance);
                        } else if (tCreateInstance == null) {
                            Object fieldValue = fieldReader3.readFieldValue(jSONReader);
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                            }
                            linkedHashMap.put(Long.valueOf(fieldNameHashCode), fieldValue);
                        } else {
                            fieldReader3.readFieldValue(jSONReader, tCreateInstance);
                        }
                        i = i2;
                    } else {
                        long typeHashCode = jSONReader.readTypeHashCode();
                        if (typeHashCode == -1 && jSONReader.isNumber()) {
                            Object number = jSONReader.readNumber();
                            String string3 = number.toString();
                            obj2 = number;
                            string = string3;
                            typeHashCode = Fnv.hashCode64(string3);
                        } else {
                            obj2 = obj5;
                            string = obj2;
                        }
                        if (contextAutoTypeBeforeHandler != null) {
                            obj3 = obj2;
                            Class<?> clsApply2 = contextAutoTypeBeforeHandler.apply(typeHashCode, this.objectClass, features);
                            i = i2;
                            j2 = typeHashCode;
                            j3 = features;
                            if (clsApply2 == null && (clsApply = contextAutoTypeBeforeHandler.apply(jSONReader.getString(), this.objectClass, j3)) != null) {
                                objectReaderAutoType = context.getObjectReader(clsApply);
                            }
                            if (objectReaderAutoType == null || (objectReaderAutoType = autoType(context, j2)) == null || fieldNameHashCode == ObjectReader.HASH_TYPE) {
                                string2 = null;
                            } else {
                                string2 = jSONReader.getString();
                            }
                            if (objectReaderAutoType == null) {
                                string2 = jSONReader.getString();
                                objectReaderAutoType2 = context.getObjectReaderAutoType(string2, this.objectClass, j3);
                                if (objectReaderAutoType2 == null && (type2 = this.seeAlsoDefault) != null) {
                                    objectReaderAutoType2 = context.getObjectReader(type2);
                                }
                                objectReaderAutoType = objectReaderAutoType2;
                                if (objectReaderAutoType == null) {
                                    throw new JSONException(jSONReader.info("No suitable ObjectReader found for" + string2));
                                }
                            }
                            if (objectReaderAutoType == this) {
                                fieldReader = objectReaderAutoType.getFieldReader(fieldNameHashCode);
                                if (fieldReader == null && fieldNameHashCode != ObjectReader.HASH_TYPE) {
                                    fieldReader = objectReaderAutoType.getFieldReader(this.typeKey);
                                }
                                fieldReader2 = fieldReader;
                                if (fieldReader2 == null && string2 == null) {
                                    if (string == null) {
                                        string = jSONReader.getString();
                                    }
                                    obj4 = string;
                                } else {
                                    obj4 = string2;
                                }
                                if (i == 0 || fieldReader2 != null) {
                                    jSONReader.reset(savePointMark);
                                }
                                t = (T) objectReaderAutoType.readObject(jSONReader, type, obj, j | getFeatures());
                                if (fieldReader2 != null) {
                                    if (obj3 != null) {
                                        fieldReader2.accept(t, obj3);
                                        return t;
                                    }
                                    fieldReader2.accept(t, obj4);
                                }
                                return t;
                            }
                        } else {
                            i = i2;
                            j2 = typeHashCode;
                            j3 = features;
                            obj3 = obj2;
                        }
                        objectReaderAutoType = null;
                        if (objectReaderAutoType == null) {
                            string2 = null;
                        } else {
                            string2 = null;
                        }
                        if (objectReaderAutoType == null) {
                            string2 = jSONReader.getString();
                            objectReaderAutoType2 = context.getObjectReaderAutoType(string2, this.objectClass, j3);
                            if (objectReaderAutoType2 == null) {
                                objectReaderAutoType2 = context.getObjectReader(type2);
                            }
                            objectReaderAutoType = objectReaderAutoType2;
                            if (objectReaderAutoType == null) {
                                throw new JSONException(jSONReader.info("No suitable ObjectReader found for" + string2));
                            }
                        }
                        if (objectReaderAutoType == this) {
                            fieldReader = objectReaderAutoType.getFieldReader(fieldNameHashCode);
                            if (fieldReader == null) {
                                fieldReader = objectReaderAutoType.getFieldReader(this.typeKey);
                            }
                            fieldReader2 = fieldReader;
                            if (fieldReader2 == null) {
                                obj4 = string2;
                            } else {
                                obj4 = string2;
                            }
                            if (i == 0) {
                                jSONReader.reset(savePointMark);
                            } else {
                                jSONReader.reset(savePointMark);
                            }
                            t = (T) objectReaderAutoType.readObject(jSONReader, type, obj, j | getFeatures());
                            if (fieldReader2 != null) {
                                if (obj3 != null) {
                                    fieldReader2.accept(t, obj3);
                                    return t;
                                }
                                fieldReader2.accept(t, obj4);
                            }
                            return t;
                        }
                    }
                } else {
                    fieldReader3 = getFieldReader(fieldNameHashCode);
                    if (fieldReader3 == null) {
                        fieldReader3 = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                    }
                    if (tCreateInstance == null) {
                        tCreateInstance = createInstance(jSONReader.getContext().getFeatures() | j);
                    }
                    if (fieldReader3 == null) {
                        processExtra(jSONReader, tCreateInstance);
                    } else if (tCreateInstance == null) {
                        Object fieldValue2 = fieldReader3.readFieldValue(jSONReader);
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(Long.valueOf(fieldNameHashCode), fieldValue2);
                    } else {
                        fieldReader3.readFieldValue(jSONReader, tCreateInstance);
                    }
                    i = i2;
                }
                i2 = i + 1;
                obj5 = null;
                j4 = 0;
            }
            if (tCreateInstance == null) {
                tCreateInstance = createInstance(jSONReader.getContext().getFeatures() | j);
            }
            if (linkedHashMap != null) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    getFieldReader(((Long) entry.getKey()).longValue()).accept(tCreateInstance, entry.getValue());
                }
            }
            jSONReader.nextIfComma();
            Function buildFunction = getBuildFunction();
            if (buildFunction != null) {
                tCreateInstance = (T) buildFunction.apply(tCreateInstance);
            }
            JSONSchema jSONSchema = this.schema;
            if (jSONSchema != null) {
                jSONSchema.assertValidate(tCreateInstance);
            }
            return tCreateInstance;
        }
        long valueHashCode = jSONReader.readValueHashCode();
        while (true) {
            Class[] clsArr = this.seeAlso;
            if (i2 >= clsArr.length) {
                throw new JSONException(jSONReader.info("not support input " + jSONReader.getString()));
            }
            Class cls2 = clsArr[i2];
            if (Enum.class.isAssignableFrom(cls2)) {
                ObjectReader objectReader = jSONReader.getObjectReader(cls2);
                T t2 = objectReader instanceof ObjectReaderImplEnum ? (T) ((ObjectReaderImplEnum) objectReader).getEnumByHashCode(valueHashCode) : null;
                if (t2 != null) {
                    return t2;
                }
            }
            i2++;
        }
    }
}
