package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderInterface<T> extends ObjectReaderAdapter<T> {
    public ObjectReaderInterface(Class cls, String str, String str2, long j, Supplier supplier, Function function, FieldReader[] fieldReaderArr) {
        super(cls, str, str2, j, null, supplier, function, fieldReaderArr);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(long j) {
        return (T) TypeUtils.newProxyInstance(this.objectClass, new JSONObject());
    }

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
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.objectClass, this.typeNameHash, this.features | j);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType.getObjectClass() != this.objectClass) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j);
        }
        if (jSONReader.isArray()) {
            if (jSONReader.isSupportBeanArray()) {
                return readArrayMappingJSONBObject(jSONReader, type, obj, j);
            }
            throw new JSONException(jSONReader.info("expect object, but " + JSONB.typeName(jSONReader.getType())));
        }
        jSONReader.nextIfObjectStart();
        JSONObject jSONObject = new JSONObject();
        int i = 0;
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
                    jSONObject.put(jSONReader.getFieldName(), jSONReader.readAny());
                } else {
                    jSONObject.put(fieldReader.fieldName, fieldReader.readFieldValue(jSONReader));
                }
            }
            i++;
        }
        T t = (T) TypeUtils.newProxyInstance(this.objectClass, jSONObject);
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(t);
        }
        return t;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0129  */
    /* JADX WARN: Code duplicated, block: B:84:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x0151  */
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
        FieldReader fieldReader;
        String string;
        Class<?> clsApply;
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j);
        }
        if (jSONReader.nextIfNull()) {
            jSONReader.nextIfComma();
            return null;
        }
        if (jSONReader.isArray() && jSONReader.isSupportBeanArray(getFeatures() | j)) {
            return readArrayMappingObject(jSONReader, type, obj, j);
        }
        JSONObject jSONObject = new JSONObject();
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
        int i = 0;
        while (!jSONReader.nextIfObjectEnd()) {
            JSONReader.Context context = jSONReader.getContext();
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
            if (i == 0 && fieldNameHashCode == getTypeKeyHash()) {
                long features = j | getFeatures() | context.getFeatures();
                if ((JSONReader.Feature.SupportAutoType.mask & features) == 0 && contextAutoTypeBeforeHandler == null) {
                    fieldReader = getFieldReader(fieldNameHashCode);
                    if (fieldReader == null) {
                        fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                    }
                    if (fieldReader == null) {
                        jSONObject.put(jSONReader.getFieldName(), jSONReader.readAny());
                    } else {
                        jSONObject.put(fieldReader.fieldName, fieldReader.readFieldValue(jSONReader));
                    }
                } else {
                    long typeHashCode = jSONReader.readTypeHashCode();
                    ObjectReader objectReader = (contextAutoTypeBeforeHandler == null || contextAutoTypeBeforeHandler.apply(typeHashCode, this.objectClass, features) != null || (clsApply = contextAutoTypeBeforeHandler.apply(jSONReader.getString(), this.objectClass, features)) == null) ? null : context.getObjectReader(clsApply);
                    if (objectReader == null) {
                        objectReader = autoType(context, typeHashCode);
                    }
                    if (objectReader == null) {
                        String string2 = jSONReader.getString();
                        ObjectReader objectReaderAutoType = context.getObjectReaderAutoType(string2, this.objectClass, features);
                        if (objectReaderAutoType == null) {
                            throw new JSONException(jSONReader.info("No suitable ObjectReader found for" + string2));
                        }
                        objectReader = objectReaderAutoType;
                        string = string2;
                    } else {
                        string = null;
                    }
                    if (objectReader != this) {
                        FieldReader fieldReader2 = objectReader.getFieldReader(fieldNameHashCode);
                        if (fieldReader2 != null && string == null) {
                            string = jSONReader.getString();
                        }
                        String str = string;
                        T t = (T) objectReader.readObject(jSONReader, null, null, j | getFeatures());
                        if (fieldReader2 != null) {
                            fieldReader2.accept(t, str);
                        }
                        return t;
                    }
                }
            } else {
                fieldReader = getFieldReader(fieldNameHashCode);
                if (fieldReader == null && jSONReader.isSupportSmartMatch(j | getFeatures())) {
                    fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                }
                if (fieldReader == null) {
                    jSONObject.put(jSONReader.getFieldName(), jSONReader.readAny());
                } else {
                    jSONObject.put(fieldReader.fieldName, fieldReader.readFieldValue(jSONReader));
                }
            }
            i++;
        }
        jSONReader.nextIfComma();
        T t2 = (T) TypeUtils.newProxyInstance(this.objectClass, jSONObject);
        Function buildFunction = getBuildFunction();
        if (buildFunction != null) {
            t2 = (T) buildFunction.apply(t2);
        }
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(t2);
        }
        return t2;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(Map map, long j) {
        JSONObject jSONObject;
        if (map instanceof JSONObject) {
            jSONObject = (JSONObject) map;
        } else {
            jSONObject = new JSONObject(map);
        }
        for (FieldReader fieldReader : this.fieldReaders) {
            Object obj = jSONObject.get(fieldReader.fieldName);
            if (obj instanceof Map) {
                ObjectReader objectReader = fieldReader.getObjectReader(JSONFactory.getDefaultObjectReaderProvider());
                if (objectReader instanceof ObjectReaderAdapter) {
                    if (jSONObject == map) {
                        jSONObject = new JSONObject(map);
                    }
                    jSONObject.put(fieldReader.fieldName, objectReader.createInstance((Map) obj, j));
                }
            }
        }
        return (T) TypeUtils.newProxyInstance(this.objectClass, jSONObject);
    }
}
