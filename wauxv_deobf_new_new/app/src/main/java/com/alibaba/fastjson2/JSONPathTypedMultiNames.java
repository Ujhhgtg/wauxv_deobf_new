package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReaderAdapter;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.time.ZoneId;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class JSONPathTypedMultiNames extends JSONPathTypedMulti {
    final FieldReader[] fieldReaders;
    final JSONPath[] namePaths;
    final String[] names;
    final ObjectReaderAdapter<Object[]> objectReader;
    final JSONPath prefix;

    public JSONPathTypedMultiNames(JSONPath[] jSONPathArr, JSONPath jSONPath, JSONPath[] jSONPathArr2, Type[] typeArr, String[] strArr, long[] jArr, ZoneId zoneId, long j) {
        super(jSONPathArr, typeArr, strArr, jArr, zoneId, j);
        this.prefix = jSONPath;
        this.namePaths = jSONPathArr2;
        this.names = new String[jSONPathArr.length];
        for (int i = 0; i < jSONPathArr.length; i++) {
            this.names[i] = ((JSONPathSingleName) jSONPathArr2[i]).name;
        }
        long[] jArr2 = new long[this.names.length];
        if (jArr != null) {
            for (int i2 = 0; i2 < jArr.length; i2++) {
                if ((jArr[i2] & JSONPath.Feature.NullOnError.mask) != 0) {
                    jArr2[i2] = jArr2[i2] | JSONReader.Feature.NullOnError.mask;
                }
            }
        }
        Type[] typeArr2 = (Type[]) typeArr.clone();
        for (int i3 = 0; i3 < typeArr2.length; i3++) {
            Type type = typeArr2[i3];
            if (type == Boolean.TYPE) {
                typeArr2[i3] = Boolean.class;
            } else if (type == Character.TYPE) {
                typeArr2[i3] = Character.class;
            } else if (type == Byte.TYPE) {
                typeArr2[i3] = Byte.class;
            } else if (type == Short.TYPE) {
                typeArr2[i3] = Short.class;
            } else if (type == Integer.TYPE) {
                typeArr2[i3] = Integer.class;
            } else if (type == Long.TYPE) {
                typeArr2[i3] = Long.class;
            } else if (type == Float.TYPE) {
                typeArr2[i3] = Float.class;
            } else if (type == Double.TYPE) {
                typeArr2[i3] = Double.class;
            }
        }
        final int length = this.names.length;
        ObjectReaderAdapter<Object[]> objectReaderAdapter = (ObjectReaderAdapter) JSONFactory.getDefaultObjectReaderProvider().createObjectReader(this.names, typeArr2, jArr2, new Supplier() { // from class: com.alibaba.fastjson2.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ
            @Override // java.util.function.Supplier
            public final Object get() {
                return JSONPathTypedMultiNames.lambda$new$0(length);
            }
        }, new C0025());
        this.objectReader = objectReaderAdapter;
        this.fieldReaders = objectReaderAdapter.getFieldReaders();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object[] lambda$new$0(int i) {
        return new Object[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(Object[] objArr, int i, Object obj) {
        objArr[i] = obj;
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public Object eval(Object obj) {
        Object fieldValue;
        Object[] objArr = new Object[this.paths.length];
        JSONPath jSONPath = this.prefix;
        if (jSONPath != null) {
            obj = jSONPath.eval(obj);
        }
        if (obj == null) {
            return new Object[this.paths.length];
        }
        if (obj instanceof Map) {
            return this.objectReader.createInstance((Map) obj, 0L);
        }
        ObjectWriter objectWriter = JSONFactory.defaultObjectWriterProvider.getObjectWriter((Class) obj.getClass());
        int i = 0;
        while (true) {
            String[] strArr = this.names;
            if (i >= strArr.length) {
                return objArr;
            }
            FieldWriter fieldWriter = objectWriter.getFieldWriter(strArr[i]);
            if (fieldWriter != null) {
                try {
                    fieldValue = fieldWriter.getFieldValue(obj);
                    Type type = this.types[i];
                    if (fieldValue != null && fieldValue.getClass() != type) {
                        if (type == Long.class) {
                            fieldValue = TypeUtils.toLong(fieldValue);
                        } else if (type == BigDecimal.class) {
                            fieldValue = TypeUtils.toBigDecimal(fieldValue);
                        } else {
                            fieldValue = type == String[].class ? TypeUtils.toStringArray(fieldValue) : TypeUtils.cast(fieldValue, type);
                        }
                    }
                } catch (Exception e) {
                    if (!ignoreError(i)) {
                        throw new JSONException("jsonpath eval path, path : " + this.paths[i] + ", msg : " + e.getMessage(), e);
                    }
                    fieldValue = null;
                }
                objArr[i] = fieldValue;
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public Object extract(JSONReader jSONReader) {
        if (this.prefix != null) {
            return eval(jSONReader.readAny());
        }
        if (jSONReader.nextIfNull()) {
            return new Object[this.paths.length];
        }
        if (jSONReader.nextIfObjectStart()) {
            return this.objectReader.readObject(jSONReader, null, null, 0L);
        }
        throw new JSONException(jSONReader.info("illegal input, expect '[', but " + jSONReader.current()));
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public boolean isRef() {
        return true;
    }
}
