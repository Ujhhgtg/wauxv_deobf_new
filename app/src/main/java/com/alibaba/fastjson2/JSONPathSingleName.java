package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.reader.ValueConsumer;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathSingleName extends JSONPathSingle {
    final String name;
    final long nameHashCode;

    public JSONPathSingleName(String str, JSONPathSegmentName jSONPathSegmentName, JSONPath.Feature... featureArr) {
        super(jSONPathSegmentName, str, featureArr);
        this.name = jSONPathSegmentName.name;
        this.nameHashCode = jSONPathSegmentName.nameHashCode;
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public boolean contains(Object obj) {
        FieldWriter fieldWriter;
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(this.name);
        }
        if (obj instanceof List) {
            List list = (List) obj;
            return !list.isEmpty() && contains(list.get(0));
        }
        ObjectWriter objectWriter = getWriterContext().provider.getObjectWriter((Class) obj.getClass());
        return (objectWriter == null || (fieldWriter = objectWriter.getFieldWriter(this.nameHashCode)) == null || fieldWriter.getFieldValue(obj) == null) ? false : true;
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public Object eval(Object obj) {
        FieldWriter fieldWriter;
        Object fieldValue;
        Long lValueOf = null;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            fieldValue = map.get(this.name);
            if (fieldValue == null) {
                boolean zIsNumber = IOUtils.isNumber(this.name);
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if ((key instanceof Enum) && ((Enum) key).name().equals(this.name)) {
                        fieldValue = entry.getValue();
                        break;
                    }
                    if (key instanceof Long) {
                        if (lValueOf == null && zIsNumber) {
                            lValueOf = Long.valueOf(Long.parseLong(this.name));
                        }
                        if (key.equals(lValueOf)) {
                            fieldValue = entry.getValue();
                            break;
                        }
                    }
                }
            }
        } else {
            ObjectWriter objectWriter = getWriterContext().getObjectWriter(obj.getClass());
            if (objectWriter == null || (fieldWriter = objectWriter.getFieldWriter(this.nameHashCode)) == null) {
                return null;
            }
            fieldValue = fieldWriter.getFieldValue(obj);
        }
        if ((this.features & JSONPath.Feature.AlwaysReturnList.mask) != 0) {
            return fieldValue == null ? new JSONArray() : JSONArray.of(fieldValue);
        }
        return fieldValue;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public Object extract(JSONReader jSONReader) {
        Object string = null;
        if (jSONReader.jsonb) {
            if (jSONReader.nextIfObjectStart()) {
                while (!jSONReader.nextIfObjectEnd()) {
                    long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                    if (fieldNameHashCode != 0) {
                        if (fieldNameHashCode == this.nameHashCode || jSONReader.isObject() || jSONReader.isArray()) {
                            return jSONReader.readAny();
                        }
                        jSONReader.skipValue();
                    }
                }
            }
            if ((this.features & JSONPath.Feature.AlwaysReturnList.mask) != 0) {
                return new JSONArray();
            }
            return null;
        }
        if (jSONReader.nextIfObjectStart()) {
            while (!jSONReader.nextIfObjectEnd()) {
                if (jSONReader.readFieldNameHashCode() == this.nameHashCode) {
                    char c = jSONReader.ch;
                    if (c == '\"' || c == '\'') {
                        string = jSONReader.readString();
                    } else if (c == '+' || c == '-') {
                        string = jSONReader.readNumber();
                    } else if (c == '[') {
                        string = jSONReader.readArray();
                    } else if (c == 'f') {
                        string = Boolean.valueOf(jSONReader.readBoolValue());
                    } else if (c == 'n') {
                        jSONReader.readNull();
                    } else if (c == 't') {
                        string = Boolean.valueOf(jSONReader.readBoolValue());
                    } else if (c != '{') {
                        switch (c) {
                            case '0':
                            case '1':
                            case 50 /* 50 */:
                            case 51 /* 51 */:
                            case '4':
                            case 53 /* 53 */:
                            case 54 /* 54 */:
                            case 55 /* 55 */:
                            case 56 /* 56 */:
                            case 57 /* 57 */:
                                string = jSONReader.readNumber();
                                break;
                            default:
                                throw new JSONException("TODO : " + jSONReader.ch);
                        }
                    } else {
                        string = jSONReader.readObject();
                    }
                    if ((this.features & JSONPath.Feature.AlwaysReturnList.mask) != 0) {
                        return string == null ? new JSONArray() : JSONArray.of(string);
                    }
                    return string;
                }
                jSONReader.skipValue();
            }
        }
        if ((this.features & JSONPath.Feature.AlwaysReturnList.mask) != 0) {
            return new JSONArray();
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public int extractInt32Value(JSONReader jSONReader) {
        if (jSONReader.nextIfObjectStart()) {
            while (jSONReader.ch != '}') {
                if (jSONReader.readFieldNameHashCode() == this.nameHashCode) {
                    char c = jSONReader.ch;
                    if (c == '\"' || c == '\'') {
                        return Integer.parseInt(jSONReader.readString());
                    }
                    if (c != '+' && c != '-') {
                        if (c != ']') {
                            if (c != 'f') {
                                if (c == 'n') {
                                    jSONReader.readNull();
                                    jSONReader.wasNull = true;
                                    return 0;
                                }
                                if (c != 't') {
                                    switch (c) {
                                        case '0':
                                        case '1':
                                        case 50 /* 50 */:
                                        case 51 /* 51 */:
                                        case '4':
                                        case 53 /* 53 */:
                                        case 54 /* 54 */:
                                        case 55 /* 55 */:
                                        case 56 /* 56 */:
                                        case 57 /* 57 */:
                                            break;
                                        default:
                                            throw new JSONException("TODO : " + jSONReader.ch);
                                    }
                                }
                            }
                            return jSONReader.readBoolValue() ? 1 : 0;
                        }
                        jSONReader.next();
                    }
                    return jSONReader.readInt32Value();
                }
                jSONReader.skipValue();
            }
            jSONReader.wasNull = true;
            return 0;
        }
        jSONReader.wasNull = true;
        return 0;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public long extractInt64Value(JSONReader jSONReader) {
        if (jSONReader.nextIfObjectStart()) {
            while (jSONReader.ch != '}') {
                if (jSONReader.readFieldNameHashCode() == this.nameHashCode) {
                    char c = jSONReader.ch;
                    if (c == '\"' || c == '\'') {
                        return Long.parseLong(jSONReader.readString());
                    }
                    if (c != '+' && c != '-') {
                        if (c != '[') {
                            if (c != ']') {
                                if (c != 'f') {
                                    if (c == 'n') {
                                        jSONReader.readNull();
                                        jSONReader.wasNull = true;
                                        return 0L;
                                    }
                                    if (c != 't') {
                                        if (c != '{') {
                                            switch (c) {
                                                case '0':
                                                case '1':
                                                case 50 /* 50 */:
                                                case 51 /* 51 */:
                                                case '4':
                                                case 53 /* 53 */:
                                                case 54 /* 54 */:
                                                case 55 /* 55 */:
                                                case 56 /* 56 */:
                                                case 57 /* 57 */:
                                                    break;
                                                default:
                                                    throw new JSONException("TODO : " + jSONReader.ch);
                                            }
                                        }
                                    }
                                }
                                return jSONReader.readBoolValue() ? 1L : 0L;
                            }
                            jSONReader.next();
                        }
                        return jSONReader.toLong(jSONReader.readObject());
                    }
                    return jSONReader.readInt64Value();
                }
                jSONReader.skipValue();
            }
            jSONReader.wasNull = true;
            return 0L;
        }
        jSONReader.wasNull = true;
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public String extractScalar(JSONReader jSONReader) {
        Object string = null;
        if (jSONReader.nextIfObjectStart()) {
            while (jSONReader.ch != '}') {
                boolean z = jSONReader.readFieldNameHashCode() == this.nameHashCode;
                char c = jSONReader.ch;
                if (z || c == '{' || c == '[') {
                    if (c == '\"' || c == '\'') {
                        string = jSONReader.readString();
                    } else if (c == '+' || c == '-') {
                        string = jSONReader.readNumber();
                    } else if (c == '[') {
                        string = jSONReader.readArray();
                    } else if (c == 'f') {
                        string = Boolean.valueOf(jSONReader.readBoolValue());
                    } else if (c == 'n') {
                        jSONReader.readNull();
                    } else if (c == 't') {
                        string = Boolean.valueOf(jSONReader.readBoolValue());
                    } else if (c != '{') {
                        switch (c) {
                            case '0':
                            case '1':
                            case 50 /* 50 */:
                            case 51 /* 51 */:
                            case '4':
                            case 53 /* 53 */:
                            case 54 /* 54 */:
                            case 55 /* 55 */:
                            case 56 /* 56 */:
                            case 57 /* 57 */:
                                string = jSONReader.readNumber();
                                break;
                            default:
                                throw new JSONException("TODO : " + jSONReader.ch);
                        }
                    } else {
                        string = jSONReader.readObject();
                    }
                    return JSON.toJSONString(string);
                }
                jSONReader.skipValue();
            }
            jSONReader.next();
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public boolean isRef() {
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public boolean remove(Object obj) {
        FieldReader fieldReader;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).remove(this.name) != null;
        }
        ObjectReader objectReader = getReaderContext().getProvider().getObjectReader(obj.getClass());
        if (objectReader == null || (fieldReader = objectReader.getFieldReader(this.nameHashCode)) == null) {
            return false;
        }
        try {
            fieldReader.accept(obj, (Object) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2) {
        Function typeConvert;
        if (obj instanceof Map) {
            ((Map) obj).put(this.name, obj2);
            return;
        }
        ObjectReaderProvider provider = getReaderContext().getProvider();
        ObjectReader objectReader = provider.getObjectReader(obj.getClass());
        FieldReader fieldReader = objectReader.getFieldReader(this.nameHashCode);
        if (fieldReader == null) {
            if (objectReader instanceof ObjectReaderBean) {
                objectReader.acceptExtra(obj, this.name, obj2, 0L);
                return;
            }
            return;
        }
        if (obj2 != null) {
            Class<?> cls = obj2.getClass();
            Class cls2 = fieldReader.fieldClass;
            if (!fieldReader.supportAcceptType(cls) && (typeConvert = provider.getTypeConvert(cls, cls2)) != null) {
                obj2 = typeConvert.apply(obj2);
            }
        }
        fieldReader.accept(obj, obj2);
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public void setCallback(Object obj, BiFunction biFunction) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(this.name);
            if (obj2 != null || map.containsKey(this.name)) {
                map.put(this.name, biFunction.apply(map, obj2));
                return;
            }
            return;
        }
        Class<?> cls = obj.getClass();
        if (this.readerContext == null) {
            this.readerContext = JSONFactory.createReadContext();
        }
        FieldReader fieldReader = this.readerContext.provider.getObjectReader(cls).getFieldReader(this.nameHashCode);
        if (this.writerContext == null) {
            this.writerContext = JSONFactory.createWriteContext();
        }
        FieldWriter fieldWriter = this.writerContext.provider.getObjectWriter((Class) cls).getFieldWriter(this.nameHashCode);
        if (fieldReader == null || fieldWriter == null) {
            return;
        }
        fieldReader.accept(obj, biFunction.apply(obj, fieldWriter.getFieldValue(obj)));
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public void setInt(Object obj, int i) {
        if (obj instanceof Map) {
            ((Map) obj).put(this.name, Integer.valueOf(i));
        } else {
            getReaderContext().getProvider().getObjectReader(obj.getClass()).setFieldValue(obj, this.name, this.nameHashCode, i);
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public void setLong(Object obj, long j) {
        if (obj instanceof Map) {
            ((Map) obj).put(this.name, Long.valueOf(j));
        } else {
            getReaderContext().getProvider().getObjectReader(obj.getClass()).setFieldValue(obj, this.name, this.nameHashCode, j);
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2, JSONReader.Feature... featureArr) {
        Class<?> cls;
        Class<?> cls2;
        Function typeConvert;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object objPut = map.put(this.name, obj2);
            if (objPut != null) {
                for (JSONReader.Feature feature : featureArr) {
                    if (feature == JSONReader.Feature.DuplicateKeyValueAsArray) {
                        if (objPut instanceof Collection) {
                            ((Collection) objPut).add(obj2);
                            map.put(this.name, obj2);
                            return;
                        } else {
                            map.put(this.name, JSONArray.of(objPut, obj2));
                            return;
                        }
                    }
                }
                return;
            }
            return;
        }
        ObjectReaderProvider provider = getReaderContext().getProvider();
        FieldReader fieldReader = provider.getObjectReader(obj.getClass()).getFieldReader(this.nameHashCode);
        if (obj2 != null && (cls = obj2.getClass()) != (cls2 = fieldReader.fieldClass) && (typeConvert = provider.getTypeConvert(cls, cls2)) != null) {
            obj2 = typeConvert.apply(obj2);
        }
        fieldReader.accept(obj, obj2);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void extractScalar(JSONReader jSONReader, ValueConsumer valueConsumer) {
        if (jSONReader.nextIfObjectStart()) {
            while (jSONReader.ch != '}') {
                if (jSONReader.readFieldNameHashCode() == this.nameHashCode) {
                    char c = jSONReader.ch;
                    if (c != '\"' && c != '\'') {
                        if (c != '+' && c != '-') {
                            if (c == '[') {
                                valueConsumer.accept(jSONReader.readArray());
                                return;
                            }
                            if (c != ']') {
                                if (c != 'f') {
                                    if (c == 'n') {
                                        jSONReader.readNull();
                                        valueConsumer.acceptNull();
                                        return;
                                    } else if (c != 't') {
                                        if (c != '{') {
                                            switch (c) {
                                                case '0':
                                                case '1':
                                                case 50 /* 50 */:
                                                case 51 /* 51 */:
                                                case '4':
                                                case 53 /* 53 */:
                                                case 54 /* 54 */:
                                                case 55 /* 55 */:
                                                case 56 /* 56 */:
                                                case 57 /* 57 */:
                                                    break;
                                                default:
                                                    throw new JSONException("TODO : " + jSONReader.ch);
                                            }
                                        } else {
                                            valueConsumer.accept(jSONReader.readObject());
                                            return;
                                        }
                                    }
                                }
                                valueConsumer.accept(jSONReader.readBoolValue());
                                return;
                            }
                            jSONReader.next();
                        }
                        jSONReader.readNumber(valueConsumer, false);
                        return;
                    }
                    jSONReader.readString(valueConsumer, false);
                    return;
                }
                jSONReader.skipValue();
            }
            valueConsumer.acceptNull();
            return;
        }
        valueConsumer.acceptNull();
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void extract(JSONReader jSONReader, ValueConsumer valueConsumer) {
        if (jSONReader.nextIfObjectStart()) {
            while (jSONReader.ch != '}') {
                if (jSONReader.readFieldNameHashCode() == this.nameHashCode) {
                    char c = jSONReader.ch;
                    if (c != '\"' && c != '\'') {
                        if (c != '+' && c != '-') {
                            if (c != '[') {
                                if (c != 'f') {
                                    if (c == 'n') {
                                        jSONReader.readNull();
                                        valueConsumer.acceptNull();
                                        return;
                                    } else if (c != 't') {
                                        if (c != '{') {
                                            switch (c) {
                                                case '0':
                                                case '1':
                                                case 50 /* 50 */:
                                                case 51 /* 51 */:
                                                case '4':
                                                case 53 /* 53 */:
                                                case 54 /* 54 */:
                                                case 55 /* 55 */:
                                                case 56 /* 56 */:
                                                case 57 /* 57 */:
                                                    break;
                                                default:
                                                    throw new JSONException("TODO : " + jSONReader.ch);
                                            }
                                        } else {
                                            valueConsumer.accept(jSONReader.readObject());
                                            return;
                                        }
                                    }
                                }
                                valueConsumer.accept(jSONReader.readBoolValue());
                                return;
                            }
                            valueConsumer.accept(jSONReader.readArray());
                            return;
                        }
                        jSONReader.readNumber(valueConsumer, true);
                        return;
                    }
                    jSONReader.readString(valueConsumer, true);
                    return;
                }
                jSONReader.skipValue();
            }
            valueConsumer.acceptNull();
            return;
        }
        valueConsumer.acceptNull();
    }
}
