package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.JDKUtils;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReader2<T> extends ObjectReaderAdapter<T> {
    protected final FieldReader fieldReader0;
    protected final FieldReader fieldReader1;
    protected final long hashCode0;
    protected final long hashCode0LCase;
    protected final long hashCode1;
    protected final long hashCode1LCase;
    protected ObjectReader objectReader0;
    protected ObjectReader objectReader1;

    public ObjectReader2(Class cls, long j, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader fieldReader, FieldReader fieldReader2) {
        this(cls, null, null, j, jSONSchema, supplier, function, fieldReader, fieldReader2);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReader(long j) {
        if (j == this.hashCode0) {
            return this.fieldReader0;
        }
        if (j == this.hashCode1) {
            return this.fieldReader1;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReaderLCase(long j) {
        if (j == this.hashCode0LCase) {
            return this.fieldReader0;
        }
        if (j == this.hashCode1LCase) {
            return this.fieldReader1;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initDefaultValue(T t) {
        this.fieldReader0.acceptDefaultValue(t);
        this.fieldReader1.acceptDefaultValue(t);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        ObjectReader objectReaderCheckAutoType = checkAutoType(jSONReader, j);
        if (objectReaderCheckAutoType != null) {
            return (T) objectReaderCheckAutoType.readArrayMappingJSONBObject(jSONReader, type, obj, j);
        }
        T t = this.creator.get();
        int iStartArray = jSONReader.startArray();
        if (iStartArray > 0) {
            this.fieldReader0.readFieldValue(jSONReader, t);
            if (iStartArray > 1) {
                this.fieldReader1.readFieldValue(jSONReader, t);
                for (int i = 2; i < iStartArray; i++) {
                    jSONReader.skipValue();
                }
            }
        }
        Function function = this.buildFunction;
        return function != null ? (T) function.apply(t) : t;
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
        T t;
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.objectClass, this.typeNameHash, this.features | j);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType.getObjectClass() != this.objectClass) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j);
        }
        if (jSONReader.isArray()) {
            T t2 = this.creator.get();
            if (this.hasDefaultValue) {
                initDefaultValue(t2);
            }
            int iStartArray = jSONReader.startArray();
            if (iStartArray > 0) {
                this.fieldReader0.readFieldValue(jSONReader, t2);
                if (iStartArray > 1) {
                    this.fieldReader1.readFieldValue(jSONReader, t2);
                    for (int i = 2; i < iStartArray; i++) {
                        jSONReader.skipValue();
                    }
                }
            }
            Function function = this.buildFunction;
            return function != null ? (T) function.apply(t2) : t2;
        }
        if (!jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT)) {
            throw new JSONException(jSONReader.info("expect object, but " + JSONB.typeName(jSONReader.getType())));
        }
        Supplier<T> supplier = this.creator;
        if (supplier != null) {
            t = supplier.get();
        } else if (((jSONReader.getContext().getFeatures() | j) & JSONReader.Feature.FieldBased.mask) != 0) {
            try {
                t = (T) JDKUtils.UNSAFE.allocateInstance(this.objectClass);
            } catch (InstantiationException e) {
                throw new JSONException(jSONReader.info("create instance error"), e);
            }
        } else {
            t = null;
        }
        if (t != null && this.hasDefaultValue) {
            initDefaultValue(t);
        }
        if (t != null && jSONReader.isInitStringFieldAsEmpty()) {
            initStringFieldAsEmpty(t);
        }
        while (!jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT_END)) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode != 0) {
                if (fieldNameHashCode == this.hashCode0) {
                    this.fieldReader0.readFieldValue(jSONReader, t);
                } else if (fieldNameHashCode == this.hashCode1) {
                    this.fieldReader1.readFieldValueJSONB(jSONReader, t);
                } else {
                    if (jSONReader.isSupportSmartMatch(this.features | j)) {
                        long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
                        if (nameHashCodeLCase == this.hashCode0LCase) {
                            this.fieldReader0.readFieldValueJSONB(jSONReader, t);
                        } else if (nameHashCodeLCase == this.hashCode1LCase) {
                            this.fieldReader1.readFieldValueJSONB(jSONReader, t);
                        }
                    }
                    processExtra(jSONReader, t);
                }
            }
        }
        Function function2 = this.buildFunction;
        if (function2 != null) {
            t = (T) function2.apply(t);
        }
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(t);
        }
        return t;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader) {
        return readObject(jSONReader, null, null, this.features);
    }

    public ObjectReader2(Class cls, String str, String str2, long j, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        this(cls, str, str2, j, null, supplier, function, fieldReaderArr);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x012f  */
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
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j);
        }
        if (jSONReader.nextIfNull()) {
            jSONReader.nextIfComma();
            return null;
        }
        long jFeatures = jSONReader.features(this.features | j);
        if (jSONReader.isArray()) {
            if ((JSONReader.Feature.SupportArrayToBean.mask & jFeatures) == 0) {
                return processObjectInputSingleItemArray(jSONReader, type, obj, jFeatures);
            }
            jSONReader.next();
            T t = this.creator.get();
            if (this.hasDefaultValue) {
                initDefaultValue(t);
            }
            this.fieldReader0.readFieldValue(jSONReader, t);
            this.fieldReader1.readFieldValue(jSONReader, t);
            if (jSONReader.current() != ']') {
                throw new JSONException(jSONReader.info("array to bean end error"));
            }
            jSONReader.next();
            return t;
        }
        jSONReader.nextIfObjectStart();
        T t2 = this.creator.get();
        if (this.hasDefaultValue) {
            initDefaultValue(t2);
        }
        if (t2 != null && (JSONReader.Feature.InitStringFieldAsEmpty.mask & jFeatures) != 0) {
            initStringFieldAsEmpty(t2);
        }
        int i = 0;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (i == 0 && fieldNameHashCode == ObjectReader.HASH_TYPE) {
                long typeHashCode = jSONReader.readTypeHashCode();
                JSONReader.Context context = jSONReader.getContext();
                ObjectReader objectReaderAutoType = context.getObjectReaderAutoType(typeHashCode);
                if ((objectReaderAutoType != null || (objectReaderAutoType = context.getObjectReaderAutoType(jSONReader.getString(), this.objectClass)) != null) && objectReaderAutoType != this) {
                    t2 = (T) objectReaderAutoType.readObject(jSONReader, type, obj, j);
                    break;
                }
            } else if (fieldNameHashCode == this.hashCode0) {
                this.fieldReader0.readFieldValue(jSONReader, t2);
            } else if (fieldNameHashCode == this.hashCode1) {
                this.fieldReader1.readFieldValue(jSONReader, t2);
            } else if (jSONReader.isSupportSmartMatch(this.features | j)) {
                long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
                if (nameHashCodeLCase == this.hashCode0LCase) {
                    this.fieldReader0.readFieldValue(jSONReader, t2);
                } else if (nameHashCodeLCase == this.hashCode1LCase) {
                    this.fieldReader1.readFieldValue(jSONReader, t2);
                } else {
                    processExtra(jSONReader, t2);
                }
            } else {
                processExtra(jSONReader, t2);
            }
            i++;
        }
        jSONReader.nextIfMatch(',');
        Function function = this.buildFunction;
        if (function != null) {
            try {
                t2 = (T) function.apply(t2);
            } catch (IllegalStateException e) {
                throw new JSONException(jSONReader.info("build object error"), e);
            }
        }
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(t2);
        }
        return t2;
    }

    public ObjectReader2(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        super(cls, str, str2, j, jSONSchema, supplier, function, fieldReaderArr);
        FieldReader fieldReader = fieldReaderArr[0];
        this.fieldReader0 = fieldReader;
        FieldReader fieldReader2 = fieldReaderArr[1];
        this.fieldReader1 = fieldReader2;
        this.hashCode0 = fieldReader.fieldNameHash;
        this.hashCode0LCase = fieldReader.fieldNameHashLCase;
        this.hashCode1 = fieldReader2.fieldNameHash;
        this.hashCode1LCase = fieldReader2.fieldNameHashLCase;
        this.hasDefaultValue = (fieldReader.defaultValue == null && fieldReader2.defaultValue == null) ? false : true;
    }
}
