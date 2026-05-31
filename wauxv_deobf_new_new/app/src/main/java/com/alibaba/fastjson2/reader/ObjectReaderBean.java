package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.filter.ExtraProcessor;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectReaderBean<T> implements ObjectReader<T> {
    protected JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler;
    protected final Function buildFunction;
    protected final Supplier<T> creator;
    protected FieldReader extraFieldReader;
    protected final long features;
    protected boolean hasDefaultValue;
    protected final Class objectClass;
    protected final JSONSchema schema;
    protected final boolean serializable;
    protected final String typeName;
    protected final long typeNameHash;

    public ObjectReaderBean(Class cls, Supplier<T> supplier, String str, long j, JSONSchema jSONSchema, Function function) {
        if (str == null && cls != null) {
            str = TypeUtils.getTypeName(cls);
        }
        this.objectClass = cls;
        this.creator = supplier;
        this.buildFunction = function;
        this.features = j;
        this.typeName = str;
        this.typeNameHash = str != null ? Fnv.hashCode64(str) : 0L;
        this.schema = jSONSchema;
        this.serializable = cls != null && Serializable.class.isAssignableFrom(cls);
    }

    private JSONException auotypeError(JSONReader jSONReader) {
        return new JSONException(jSONReader.info("autoType not support"));
    }

    private JSONException notMatchError() {
        return new JSONException("type not match. " + this.typeName + " -> " + this.objectClass.getName());
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public void acceptExtra(Object obj, String str, Object obj2, long j) {
        FieldReader fieldReaderLCase;
        Class cls;
        FieldReader fieldReader = this.extraFieldReader;
        if (fieldReader != null && obj != null) {
            fieldReader.acceptExtra(obj, str, obj2);
            return;
        }
        if (str.startsWith("is") && (fieldReaderLCase = getFieldReaderLCase(Fnv.hashCode64LCase(str.substring(2)))) != null && ((cls = fieldReaderLCase.fieldClass) == Boolean.class || cls == Boolean.TYPE)) {
            fieldReaderLCase.accept(obj, obj2);
        } else if ((j & JSONReader.Feature.ErrorOnUnknownProperties.mask) != 0) {
            throw new JSONException("Unknown Property ".concat(str));
        }
    }

    @Deprecated
    public final ObjectReader checkAutoType(JSONReader jSONReader, Class cls, long j) {
        return checkAutoType(jSONReader, j);
    }

    public final ObjectReader checkAutoType0(JSONReader jSONReader, long j) {
        ObjectReader objectReaderAutoType;
        Class<?> cls = this.objectClass;
        long typeHashCode = jSONReader.readTypeHashCode();
        JSONReader.Context context = jSONReader.getContext();
        long jFeatures = jSONReader.features(this.features | j);
        JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
        if (contextAutoTypeBeforeHandler != null) {
            Class<?> clsApply = contextAutoTypeBeforeHandler.apply(typeHashCode, cls, j);
            if (clsApply != null || (clsApply = contextAutoTypeBeforeHandler.apply(jSONReader.getString(), cls, j)) == null || cls.isAssignableFrom(clsApply)) {
                cls = clsApply;
            } else if ((jSONReader.features(j) & JSONReader.Feature.IgnoreAutoTypeNotMatch.mask) == 0) {
                throw notMatchError();
            }
            objectReaderAutoType = context.getObjectReader(cls);
        } else {
            objectReaderAutoType = jSONReader.getObjectReaderAutoType(typeHashCode, cls, j);
            if (objectReaderAutoType == null) {
                throw auotypeError(jSONReader);
            }
            Class<?> objectClass = objectReaderAutoType.getObjectClass();
            if (cls == null || objectClass == null || cls.isAssignableFrom(objectClass)) {
                if (typeHashCode == this.typeNameHash || (JSONReader.Feature.SupportAutoType.mask & jFeatures) == 0) {
                    objectReaderAutoType = null;
                }
            } else {
                if ((JSONReader.Feature.IgnoreAutoTypeNotMatch.mask & jFeatures) == 0) {
                    throw notMatchError();
                }
                objectReaderAutoType = context.getObjectReader(cls);
            }
        }
        if (objectReaderAutoType == this || (objectReaderAutoType != null && objectReaderAutoType.getObjectClass() == this.objectClass)) {
            return null;
        }
        return objectReaderAutoType;
    }

    public JSONReader.AutoTypeBeforeHandler getAutoTypeBeforeHandler() {
        return this.autoTypeBeforeHandler;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class<T> getObjectClass() {
        return this.objectClass;
    }

    public void processExtra(JSONReader jSONReader, Object obj) {
        processExtra(jSONReader, obj, 0L);
    }

    public T processObjectInputSingleItemArray(JSONReader jSONReader, Type type, Object obj, long j) {
        String str = "expect {, but [, class " + this.typeName;
        if (obj != null) {
            str = str + ", parent fieldName " + obj;
        }
        String strInfo = jSONReader.info(str);
        if ((jSONReader.features(j) & JSONReader.Feature.SupportSmartMatch.mask) != 0) {
            if (type == null) {
                type = this.objectClass;
            }
            List array = jSONReader.readArray(type);
            if (array != null) {
                if (array.size() == 0) {
                    return null;
                }
                if (array.size() == 1) {
                    return (T) array.get(0);
                }
            }
        }
        throw new JSONException(strInfo);
    }

    public boolean readFieldValueWithLCase(JSONReader jSONReader, Object obj, long j, long j2) {
        FieldReader fieldReaderLCase;
        if (!jSONReader.isSupportSmartMatch(j2)) {
            return false;
        }
        long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
        if (nameHashCodeLCase == j || (fieldReaderLCase = getFieldReaderLCase(nameHashCodeLCase)) == null) {
            return false;
        }
        fieldReaderLCase.readFieldValue(jSONReader, obj);
        return true;
    }

    public void readObject(JSONReader jSONReader, Object obj, long j) {
        if (jSONReader.nextIfNull()) {
            jSONReader.nextIfComma();
            return;
        }
        if (!jSONReader.nextIfObjectStart()) {
            throw new JSONException(jSONReader.info());
        }
        while (!jSONReader.nextIfObjectEnd()) {
            FieldReader fieldReader = getFieldReader(jSONReader.readFieldNameHashCode());
            if (fieldReader == null && jSONReader.isSupportSmartMatch(getFeatures() | j)) {
                fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
            }
            if (fieldReader == null) {
                processExtra(jSONReader, obj);
            } else {
                fieldReader.readFieldValue(jSONReader, obj);
            }
        }
        jSONReader.nextIfComma();
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(obj);
        }
    }

    public void setAutoTypeBeforeHandler(JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler) {
        this.autoTypeBeforeHandler = autoTypeBeforeHandler;
    }

    public final ObjectReader checkAutoType(JSONReader jSONReader, long j) {
        if (jSONReader.nextIfMatchTypedAny()) {
            return checkAutoType0(jSONReader, j);
        }
        return null;
    }

    public void processExtra(JSONReader jSONReader, Object obj, long j) {
        FieldReader fieldReaderLCase;
        Class cls;
        if ((jSONReader.features(this.features | j) & JSONReader.Feature.SupportSmartMatch.mask) != 0) {
            String fieldName = jSONReader.getFieldName();
            if (fieldName.startsWith("is") && (fieldReaderLCase = getFieldReaderLCase(Fnv.hashCode64LCase(fieldName.substring(2)))) != null && obj != null && ((cls = fieldReaderLCase.fieldClass) == Boolean.class || cls == Boolean.TYPE)) {
                fieldReaderLCase.readFieldValue(jSONReader, obj);
                return;
            }
        }
        FieldReader fieldReader = this.extraFieldReader;
        if (fieldReader != null && obj != null) {
            fieldReader.processExtra(jSONReader, obj);
            return;
        }
        ExtraProcessor extraProcessor = jSONReader.getContext().getExtraProcessor();
        if (extraProcessor != null) {
            String fieldName2 = jSONReader.getFieldName();
            extraProcessor.processExtra(obj, fieldName2, jSONReader.read(extraProcessor.getType(fieldName2)));
        } else if ((jSONReader.features(j) & JSONReader.Feature.ErrorOnUnknownProperties.mask) == 0) {
            jSONReader.skipValue();
        } else {
            throw new JSONException("Unknown Property " + jSONReader.getFieldName());
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0193  */
    /* JADX WARN: Code duplicated, block: B:102:0x0197  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x0113  */
    /* JADX WARN: Code duplicated, block: B:76:0x0119  */
    /* JADX WARN: Code duplicated, block: B:81:0x013e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0141  */
    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    /* JADX WARN: Code duplicated, block: B:99:0x018f  */
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
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        T t;
        FieldReader fieldReader;
        T t2;
        long j2;
        long j3;
        ObjectReader objectReaderAutoType;
        String string;
        FieldReader fieldReader2;
        String str;
        T t3;
        Class<?> clsApply;
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j);
        }
        if (jSONReader.nextIfNullOrEmptyString()) {
            jSONReader.nextIfComma();
            return null;
        }
        long jFeatures = jSONReader.features(getFeatures() | j);
        long j4 = 0;
        if (jSONReader.isArray()) {
            if ((JSONReader.Feature.SupportArrayToBean.mask & jFeatures) != 0) {
                return readArrayMappingObject(jSONReader, type, obj, j);
            }
            return processObjectInputSingleItemArray(jSONReader, type, obj, jFeatures);
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
        int i = 0;
        T tCreateInstance = null;
        while (!jSONReader.nextIfObjectEnd()) {
            JSONReader.Context context = jSONReader.getContext();
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = this.autoTypeBeforeHandler;
            if (contextAutoTypeBeforeHandler == null) {
                contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
            }
            JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler = contextAutoTypeBeforeHandler;
            if (i == 0 && fieldNameHashCode == getTypeKeyHash()) {
                long features = j | getFeatures() | context.getFeatures();
                if ((features & JSONReader.Feature.SupportAutoType.mask) != j4 || autoTypeBeforeHandler != null) {
                    long typeHashCode = jSONReader.readTypeHashCode();
                    if (autoTypeBeforeHandler != null) {
                        Class<?> clsApply2 = autoTypeBeforeHandler.apply(typeHashCode, this.objectClass, features);
                        t2 = tCreateInstance;
                        j2 = typeHashCode;
                        j3 = features;
                        if (clsApply2 == null && (clsApply = autoTypeBeforeHandler.apply(jSONReader.getString(), this.objectClass, j3)) != null) {
                            objectReaderAutoType = context.getObjectReader(clsApply);
                        }
                        if (objectReaderAutoType == null) {
                            objectReaderAutoType = autoType(context, j2);
                        }
                        if (objectReaderAutoType == null) {
                            string = jSONReader.getString();
                            objectReaderAutoType = context.getObjectReaderAutoType(string, this.objectClass, j3);
                            if (objectReaderAutoType == null) {
                                throw new JSONException(jSONReader.info("No suitable ObjectReader found for " + string));
                            }
                        } else {
                            string = null;
                        }
                        if (objectReaderAutoType == this) {
                            fieldReader2 = objectReaderAutoType.getFieldReader(fieldNameHashCode);
                            if (fieldReader2 != null && string == null) {
                                string = jSONReader.getString();
                            }
                            str = string;
                            t3 = (T) objectReaderAutoType.readObject(jSONReader, null, null, j | getFeatures());
                            if (fieldReader2 != null) {
                                fieldReader2.accept(t3, str);
                            }
                            return t3;
                        }
                        tCreateInstance = t2;
                    } else {
                        t2 = tCreateInstance;
                        j2 = typeHashCode;
                        j3 = features;
                    }
                    objectReaderAutoType = null;
                    if (objectReaderAutoType == null) {
                        objectReaderAutoType = autoType(context, j2);
                    }
                    if (objectReaderAutoType == null) {
                        string = jSONReader.getString();
                        objectReaderAutoType = context.getObjectReaderAutoType(string, this.objectClass, j3);
                        if (objectReaderAutoType == null) {
                            throw new JSONException(jSONReader.info("No suitable ObjectReader found for " + string));
                        }
                    } else {
                        string = null;
                    }
                    if (objectReaderAutoType == this) {
                        fieldReader2 = objectReaderAutoType.getFieldReader(fieldNameHashCode);
                        if (fieldReader2 != null) {
                            string = jSONReader.getString();
                        }
                        str = string;
                        t3 = (T) objectReaderAutoType.readObject(jSONReader, null, null, j | getFeatures());
                        if (fieldReader2 != null) {
                            fieldReader2.accept(t3, str);
                        }
                        return t3;
                    }
                    tCreateInstance = t2;
                } else {
                    t = tCreateInstance;
                    fieldReader = getFieldReader(fieldNameHashCode);
                    if (fieldReader == null) {
                        fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                    }
                    if (t == null) {
                        tCreateInstance = createInstance(jSONReader.getContext().getFeatures() | j);
                    } else {
                        tCreateInstance = t;
                    }
                    if (fieldReader == null) {
                        processExtra(jSONReader, tCreateInstance);
                    } else {
                        fieldReader.readFieldValue(jSONReader, tCreateInstance);
                    }
                }
            } else {
                t = tCreateInstance;
                fieldReader = getFieldReader(fieldNameHashCode);
                if (fieldReader == null && jSONReader.isSupportSmartMatch(j | getFeatures())) {
                    fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                }
                if (t == null) {
                    tCreateInstance = createInstance(jSONReader.getContext().getFeatures() | j);
                } else {
                    tCreateInstance = t;
                }
                if (fieldReader == null) {
                    processExtra(jSONReader, tCreateInstance);
                } else {
                    fieldReader.readFieldValue(jSONReader, tCreateInstance);
                }
            }
            i++;
            j4 = 0;
        }
        if (tCreateInstance == null && (tCreateInstance = createInstance(jSONReader.getContext().getFeatures() | j)) != null && (jFeatures & JSONReader.Feature.InitStringFieldAsEmpty.mask) != j4) {
            initStringFieldAsEmpty(tCreateInstance);
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

    public void initDefaultValue(T t) {
    }

    public void initStringFieldAsEmpty(Object obj) {
    }
}
