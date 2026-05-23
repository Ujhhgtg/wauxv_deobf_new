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
public class ObjectReader5<T> extends ObjectReaderAdapter<T> {
    protected final FieldReader fieldReader0;
    protected final FieldReader fieldReader1;
    protected final FieldReader fieldReader2;
    protected final FieldReader fieldReader3;
    protected final FieldReader fieldReader4;
    final long hashCode0;
    final long hashCode0LCase;
    final long hashCode1;
    final long hashCode1LCase;
    final long hashCode2;
    final long hashCode2LCase;
    final long hashCode3;
    final long hashCode3LCase;
    final long hashCode4;
    final long hashCode4LCase;
    protected ObjectReader objectReader0;
    protected ObjectReader objectReader1;
    protected ObjectReader objectReader2;
    protected ObjectReader objectReader3;
    protected ObjectReader objectReader4;

    public ObjectReader5(Class cls, Supplier<T> supplier, long j, JSONSchema jSONSchema, Function function, FieldReader fieldReader, FieldReader fieldReader2, FieldReader fieldReader3, FieldReader fieldReader4, FieldReader fieldReader5) {
        this(cls, null, null, j, jSONSchema, supplier, function, fieldReader, fieldReader2, fieldReader3, fieldReader4, fieldReader5);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReader(long j) {
        if (j == this.hashCode0) {
            return this.fieldReader0;
        }
        if (j == this.hashCode1) {
            return this.fieldReader1;
        }
        if (j == this.hashCode2) {
            return this.fieldReader2;
        }
        if (j == this.hashCode3) {
            return this.fieldReader3;
        }
        if (j == this.hashCode4) {
            return this.fieldReader4;
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
        if (j == this.hashCode2LCase) {
            return this.fieldReader2;
        }
        if (j == this.hashCode3LCase) {
            return this.fieldReader3;
        }
        if (j == this.hashCode4LCase) {
            return this.fieldReader4;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initDefaultValue(T t) {
        this.fieldReader0.acceptDefaultValue(t);
        this.fieldReader1.acceptDefaultValue(t);
        this.fieldReader2.acceptDefaultValue(t);
        this.fieldReader3.acceptDefaultValue(t);
        this.fieldReader4.acceptDefaultValue(t);
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
                if (iStartArray > 2) {
                    this.fieldReader2.readFieldValue(jSONReader, t);
                    if (iStartArray > 3) {
                        this.fieldReader3.readFieldValue(jSONReader, t);
                        if (iStartArray > 4) {
                            this.fieldReader4.readFieldValue(jSONReader, t);
                            for (int i = 5; i < iStartArray; i++) {
                                jSONReader.skipValue();
                            }
                        }
                    }
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
        if (jSONReader.isArray()) {
            T t2 = this.creator.get();
            int iStartArray = jSONReader.startArray();
            if (iStartArray > 0) {
                this.fieldReader0.readFieldValue(jSONReader, t2);
                if (iStartArray > 1) {
                    this.fieldReader1.readFieldValue(jSONReader, t2);
                    if (iStartArray > 2) {
                        this.fieldReader2.readFieldValue(jSONReader, t2);
                        if (iStartArray > 3) {
                            this.fieldReader3.readFieldValue(jSONReader, t2);
                            if (iStartArray > 4) {
                                this.fieldReader4.readFieldValue(jSONReader, t2);
                                for (int i = 5; i < iStartArray; i++) {
                                    jSONReader.skipValue();
                                }
                            }
                        }
                    }
                }
            }
            Function function = this.buildFunction;
            return function != null ? (T) function.apply(t2) : t2;
        }
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.objectClass, this.typeNameHash, this.features | j);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType.getObjectClass() != this.objectClass) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j);
        }
        if (!jSONReader.nextIfMatch(-90)) {
            throw new JSONException("expect object, but " + JSONB.typeName(jSONReader.getType()));
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
        while (!jSONReader.nextIfMatch(-91)) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode != 0) {
                if (fieldNameHashCode == this.hashCode0) {
                    this.fieldReader0.readFieldValue(jSONReader, t);
                } else if (fieldNameHashCode == this.hashCode1) {
                    this.fieldReader1.readFieldValue(jSONReader, t);
                } else if (fieldNameHashCode == this.hashCode2) {
                    this.fieldReader2.readFieldValue(jSONReader, t);
                } else if (fieldNameHashCode == this.hashCode3) {
                    this.fieldReader3.readFieldValue(jSONReader, t);
                } else if (fieldNameHashCode == this.hashCode4) {
                    this.fieldReader4.readFieldValue(jSONReader, t);
                } else if (jSONReader.isSupportSmartMatch(this.features | j)) {
                    long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
                    if (nameHashCodeLCase == this.hashCode0LCase) {
                        this.fieldReader0.readFieldValue(jSONReader, t);
                    } else if (nameHashCodeLCase == this.hashCode1LCase) {
                        this.fieldReader1.readFieldValue(jSONReader, t);
                    } else if (nameHashCodeLCase == this.hashCode2LCase) {
                        this.fieldReader2.readFieldValue(jSONReader, t);
                    } else if (nameHashCodeLCase == this.hashCode3LCase) {
                        this.fieldReader3.readFieldValue(jSONReader, t);
                    } else if (nameHashCodeLCase == this.hashCode4LCase) {
                        this.fieldReader4.readFieldValue(jSONReader, t);
                    } else {
                        processExtra(jSONReader, t);
                    }
                } else {
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
            jSONReader.nextIfArrayStart();
            T t = this.creator.get();
            if (this.hasDefaultValue) {
                initDefaultValue(t);
            }
            this.fieldReader0.readFieldValue(jSONReader, t);
            this.fieldReader1.readFieldValue(jSONReader, t);
            this.fieldReader2.readFieldValue(jSONReader, t);
            this.fieldReader3.readFieldValue(jSONReader, t);
            this.fieldReader4.readFieldValue(jSONReader, t);
            if (!jSONReader.nextIfArrayEnd()) {
                throw new JSONException(jSONReader.info("array to bean end error"));
            }
            jSONReader.nextIfComma();
            Function function = this.buildFunction;
            return function != null ? (T) function.apply(t) : t;
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
                0++;
            } else {
                if (fieldNameHashCode == -1) {
                    break;
                }
                if (fieldNameHashCode == this.hashCode0) {
                    this.fieldReader0.readFieldValue(jSONReader, t2);
                } else if (fieldNameHashCode == this.hashCode1) {
                    this.fieldReader1.readFieldValue(jSONReader, t2);
                } else if (fieldNameHashCode == this.hashCode2) {
                    this.fieldReader2.readFieldValue(jSONReader, t2);
                } else if (fieldNameHashCode == this.hashCode3) {
                    this.fieldReader3.readFieldValue(jSONReader, t2);
                } else if (fieldNameHashCode == this.hashCode4) {
                    this.fieldReader4.readFieldValue(jSONReader, t2);
                } else if (jSONReader.isSupportSmartMatch(this.features | j)) {
                    long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
                    if (nameHashCodeLCase == this.hashCode0LCase) {
                        this.fieldReader0.readFieldValue(jSONReader, t2);
                    } else if (nameHashCodeLCase == this.hashCode1LCase) {
                        this.fieldReader1.readFieldValue(jSONReader, t2);
                    } else if (nameHashCodeLCase == this.hashCode2LCase) {
                        this.fieldReader2.readFieldValue(jSONReader, t2);
                    } else if (nameHashCodeLCase == this.hashCode3LCase) {
                        this.fieldReader3.readFieldValue(jSONReader, t2);
                    } else if (nameHashCodeLCase == this.hashCode4LCase) {
                        this.fieldReader4.readFieldValue(jSONReader, t2);
                    } else {
                        processExtra(jSONReader, t2);
                    }
                } else {
                    processExtra(jSONReader, t2);
                }
                i++;
            }
        }
        jSONReader.nextIfComma();
        Function function2 = this.buildFunction;
        if (function2 != null) {
            t2 = (T) function2.apply(t2);
        }
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(t2);
        }
        return t2;
    }

    public ObjectReader5(Class cls, String str, String str2, long j, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        this(cls, str, str2, j, null, supplier, function, fieldReaderArr);
    }

    public ObjectReader5(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        super(cls, str, str2, j, jSONSchema, supplier, function, fieldReaderArr);
        FieldReader fieldReader = fieldReaderArr[0];
        this.fieldReader0 = fieldReader;
        FieldReader fieldReader2 = fieldReaderArr[1];
        this.fieldReader1 = fieldReader2;
        FieldReader fieldReader3 = fieldReaderArr[2];
        this.fieldReader2 = fieldReader3;
        FieldReader fieldReader4 = fieldReaderArr[3];
        this.fieldReader3 = fieldReader4;
        FieldReader fieldReader5 = fieldReaderArr[4];
        this.fieldReader4 = fieldReader5;
        this.hashCode0 = fieldReader.fieldNameHash;
        this.hashCode1 = fieldReader2.fieldNameHash;
        this.hashCode2 = fieldReader3.fieldNameHash;
        this.hashCode3 = fieldReader4.fieldNameHash;
        this.hashCode4 = fieldReader5.fieldNameHash;
        this.hashCode0LCase = fieldReader.fieldNameHashLCase;
        this.hashCode1LCase = fieldReader2.fieldNameHashLCase;
        this.hashCode2LCase = fieldReader3.fieldNameHashLCase;
        this.hashCode3LCase = fieldReader4.fieldNameHashLCase;
        this.hashCode4LCase = fieldReader5.fieldNameHashLCase;
        this.hasDefaultValue = (fieldReader.defaultValue == null && fieldReader2.defaultValue == null && fieldReader3.defaultValue == null && fieldReader4.defaultValue == null && fieldReader5.defaultValue == null) ? false : true;
    }
}
