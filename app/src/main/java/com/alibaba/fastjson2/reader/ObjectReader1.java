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
public class ObjectReader1<T> extends ObjectReaderAdapter<T> {
    protected final FieldReader fieldReader0;
    final long hashCode0;
    final long hashCode0LCase;
    protected ObjectReader objectReader0;

    public ObjectReader1(Class cls, long j, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader fieldReader) {
        this(cls, null, null, j, jSONSchema, supplier, function, fieldReader);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter
    public int getFieldOrdinal(long j) {
        return j == this.hashCode0 ? 0 : -1;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReader(long j) {
        if (j == this.hashCode0) {
            return this.fieldReader0;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReaderLCase(long j) {
        if (j == this.hashCode0LCase) {
            return this.fieldReader0;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initDefaultValue(T t) {
        this.fieldReader0.acceptDefaultValue(t);
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
            for (int i = 1; i < iStartArray; i++) {
                jSONReader.skipValue();
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
        ObjectReader objectReaderAutoType;
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        ObjectReader objectReaderCheckAutoType = checkAutoType(jSONReader, j);
        if (objectReaderCheckAutoType != null) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j);
        }
        if (jSONReader.isArray()) {
            T t2 = this.creator.get();
            int iStartArray = jSONReader.startArray();
            if (iStartArray > 0) {
                this.fieldReader0.readFieldValue(jSONReader, t2);
                for (int i = 1; i < iStartArray; i++) {
                    jSONReader.skipValue();
                }
            }
            Function function = this.buildFunction;
            return function != null ? (T) function.apply(t2) : t2;
        }
        int i2 = 0;
        if (!jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT)) {
            if (!jSONReader.isTypeRedirect()) {
                throw new JSONException(jSONReader.info("expect object, but " + JSONB.typeName(jSONReader.getType())));
            }
            jSONReader.setTypeRedirect(false);
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
        while (!jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT_END)) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == getTypeKeyHash() && i2 == 0) {
                long typeHashCode = jSONReader.readTypeHashCode();
                JSONReader.Context context = jSONReader.getContext();
                ObjectReader objectReaderAutoType2 = autoType(context, typeHashCode);
                if (objectReaderAutoType2 == null) {
                    String string = jSONReader.getString();
                    objectReaderAutoType = context.getObjectReaderAutoType(string, null);
                    if (objectReaderAutoType == null) {
                        throw new JSONException(jSONReader.info("autoType not support : " + string));
                    }
                } else {
                    objectReaderAutoType = objectReaderAutoType2;
                }
                if (objectReaderAutoType != this) {
                    return (T) objectReaderAutoType.readJSONBObject(jSONReader, type, obj, j);
                }
            } else if (fieldNameHashCode != 0) {
                if (fieldNameHashCode == this.hashCode0) {
                    this.fieldReader0.readFieldValueJSONB(jSONReader, t);
                } else if (jSONReader.isSupportSmartMatch(this.features | j) && jSONReader.getNameHashCodeLCase() == this.hashCode0LCase) {
                    this.fieldReader0.readFieldValue(jSONReader, t);
                } else {
                    processExtra(jSONReader, t);
                }
            }
            i2++;
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

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public boolean setFieldValue(Object obj, String str, long j, int i) {
        if (this.hashCode0 != j) {
            return false;
        }
        this.fieldReader0.accept(obj, i);
        return true;
    }

    public ObjectReader1(Class cls, String str, String str2, long j, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        this(cls, str, str2, j, null, supplier, function, fieldReaderArr);
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
    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        ObjectReader objectReader;
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        T t = null;
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        long jFeatures = jSONReader.features(this.features | j);
        if (jSONReader.isArray()) {
            if ((JSONReader.Feature.SupportArrayToBean.mask & jFeatures) == 0) {
                return processObjectInputSingleItemArray(jSONReader, type, obj, jFeatures);
            }
            jSONReader.next();
            T t2 = this.creator.get();
            this.fieldReader0.readFieldValue(jSONReader, t2);
            if (jSONReader.nextIfArrayEnd()) {
                jSONReader.nextIfComma();
                Function function = this.buildFunction;
                return function != null ? (T) function.apply(t2) : t2;
            }
            throw new JSONException(jSONReader.info("array to bean end error, " + jSONReader.current()));
        }
        jSONReader.nextIfObjectStart();
        Supplier<T> supplier = this.creator;
        if (supplier != null) {
            t = supplier.get();
        }
        if (this.hasDefaultValue) {
            initDefaultValue(t);
        }
        if (t != null && (jFeatures & JSONReader.Feature.InitStringFieldAsEmpty.mask) != 0) {
            initStringFieldAsEmpty(t);
        }
        int i = 0;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (i == 0 && fieldNameHashCode == ObjectReader.HASH_TYPE) {
                long typeHashCode = jSONReader.readTypeHashCode();
                JSONReader.Context context = jSONReader.getContext();
                ObjectReader objectReaderAutoType = context.getObjectReaderAutoType(typeHashCode);
                if ((objectReaderAutoType != null || (objectReaderAutoType = context.getObjectReaderAutoType(jSONReader.getString(), this.objectClass)) != null) && (objectReader = objectReaderAutoType) != this) {
                    t = (T) objectReader.readObject(jSONReader, type, obj, j);
                    break;
                }
            } else if (fieldNameHashCode == this.hashCode0) {
                this.fieldReader0.readFieldValue(jSONReader, t);
            } else if (jSONReader.isSupportSmartMatch(this.features | j) && jSONReader.getNameHashCodeLCase() == this.hashCode0LCase) {
                this.fieldReader0.readFieldValue(jSONReader, t);
            } else {
                processExtra(jSONReader, t);
            }
            i++;
        }
        jSONReader.nextIfComma();
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

    public ObjectReader1(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        super(cls, str, str2, j, jSONSchema, supplier, function, fieldReaderArr);
        FieldReader fieldReader = fieldReaderArr[0];
        this.fieldReader0 = fieldReader;
        this.hashCode0 = fieldReader.fieldNameHash;
        this.hashCode0LCase = fieldReader.fieldNameHashLCase;
        this.hasDefaultValue = fieldReader.defaultValue != null;
    }
}
