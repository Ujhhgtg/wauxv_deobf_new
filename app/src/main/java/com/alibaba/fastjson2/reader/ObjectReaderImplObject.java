package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplObject extends ObjectReaderPrimitive {
    public static final ObjectReaderImplObject INSTANCE = new ObjectReaderImplObject();

    public ObjectReaderImplObject() {
        super(Object.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        return collection;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        ObjectReader objectReaderCheckAutoType;
        byte type2 = jSONReader.getType();
        if (type2 >= 73 && type2 <= 125) {
            return jSONReader.readString();
        }
        if (type2 == -110 && (objectReaderCheckAutoType = jSONReader.checkAutoType(Object.class, 0L, j)) != null) {
            return objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j);
        }
        if (type2 != -81) {
            return jSONReader.readAny();
        }
        jSONReader.next();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        long fieldNameHashCode;
        Map map;
        Object fieldName;
        Object string;
        String str;
        String string2;
        ObjectReader objectReaderAutoType;
        Class objectClass;
        Class<?> clsLoadClass;
        if (jSONReader.jsonb) {
            return jSONReader.readAny();
        }
        JSONReader.Context context = jSONReader.getContext();
        long features = j | context.getFeatures();
        char c = '+';
        char c2 = '\'';
        if (!jSONReader.isObject()) {
            char cCurrent = jSONReader.current();
            if (cCurrent == '/') {
                jSONReader.skipComment();
                cCurrent = jSONReader.current();
            }
            if (cCurrent == '\"' || cCurrent == '\'') {
                return jSONReader.readString();
            }
            if (cCurrent != '+') {
                if (cCurrent == 'S') {
                    if (!jSONReader.nextIfSet()) {
                        throw new JSONException(jSONReader.info());
                    }
                    HashSet hashSet = new HashSet();
                    jSONReader.read(hashSet);
                    return hashSet;
                }
                if (cCurrent == '[') {
                    return jSONReader.readArray();
                }
                if (cCurrent != 'f') {
                    if (cCurrent == 'n') {
                        return jSONReader.readNullOrNewDate();
                    }
                    if (cCurrent != 't') {
                        if (cCurrent == 'x') {
                            return jSONReader.readBinary();
                        }
                        if (cCurrent != '-' && cCurrent != '.') {
                            switch (cCurrent) {
                                case '0':
                                case '1':
                                case Opcodes.AALOAD /* 50 */:
                                case Opcodes.BALOAD /* 51 */:
                                case '4':
                                case Opcodes.SALOAD /* 53 */:
                                case Opcodes.ISTORE /* 54 */:
                                case Opcodes.LSTORE /* 55 */:
                                case Opcodes.FSTORE /* 56 */:
                                case Opcodes.DSTORE /* 57 */:
                                    break;
                                default:
                                    throw new JSONException(jSONReader.info());
                            }
                        }
                    }
                }
                return Boolean.valueOf(jSONReader.readBoolValue());
            }
            return jSONReader.readNumber();
        }
        jSONReader.nextIfObjectStart();
        String str2 = null;
        if (jSONReader.isString()) {
            fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == ObjectReader.HASH_TYPE) {
                if (context.isEnabled(JSONReader.Feature.SupportAutoType)) {
                    objectReaderAutoType = context.getObjectReaderAutoType(jSONReader.readTypeHashCode());
                    if (objectReaderAutoType == null || (objectClass = objectReaderAutoType.getObjectClass()) == null) {
                        string2 = null;
                    } else {
                        ClassLoader classLoader = objectClass.getClassLoader();
                        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                        if (classLoader != contextClassLoader) {
                            string2 = jSONReader.getString();
                            if (contextClassLoader == null) {
                                try {
                                    contextClassLoader = ObjectReaderImplObject.class.getClassLoader();
                                } catch (ClassNotFoundException unused) {
                                    clsLoadClass = null;
                                }
                            }
                            clsLoadClass = contextClassLoader.loadClass(string2);
                            if (clsLoadClass != null && !objectClass.equals(clsLoadClass)) {
                                objectReaderAutoType = context.getObjectReader(clsLoadClass);
                            }
                        } else {
                            string2 = null;
                        }
                    }
                    if (objectReaderAutoType == null) {
                        string2 = jSONReader.getString();
                        objectReaderAutoType = context.getObjectReaderAutoType(string2, null);
                    }
                } else {
                    string2 = jSONReader.readString();
                    objectReaderAutoType = context.getObjectReaderAutoType(string2, null);
                    if (objectReaderAutoType == null && jSONReader.getContext().isEnabled(JSONReader.Feature.ErrorOnNotSupportAutoType)) {
                        throw new JSONException(jSONReader.info("autoType not support : " + string2));
                    }
                }
                str2 = string2;
                if (objectReaderAutoType != null) {
                    jSONReader.setTypeRedirect(true);
                    return objectReaderAutoType.readObject(jSONReader, type, obj, j);
                }
            }
        } else {
            fieldNameHashCode = 0;
        }
        Supplier<Map> objectSupplier = jSONReader.getContext().getObjectSupplier();
        if (objectSupplier != null) {
            map = objectSupplier.get();
        } else {
            map = ((j | context.getFeatures()) & JSONReader.Feature.UseNativeObject.mask) != 0 ? new HashMap() : (Map) ObjectReaderImplMap.INSTANCE_OBJECT.createInstance(jSONReader.features(j));
        }
        if (str2 != null) {
            if (!str2.equals("java.util.ImmutableCollections$Map1") && !str2.equals("java.util.ImmutableCollections$MapN")) {
                map.put("@type", str2);
            }
            fieldNameHashCode = 0;
        }
        int i = 0;
        while (!jSONReader.nextIfObjectEnd()) {
            if (jSONReader.current() == '/') {
                jSONReader.skipComment();
            }
            if (i == 0 && str2 == null && fieldNameHashCode != 0) {
                fieldName = jSONReader.getFieldName();
            } else if (jSONReader.isNumber()) {
                fieldName = jSONReader.readNumber();
                jSONReader.nextIfMatch(':');
            } else {
                fieldName = jSONReader.readFieldName();
            }
            if (fieldName == null) {
                char cCurrent2 = jSONReader.current();
                if (cCurrent2 == '{' || cCurrent2 == '[') {
                    fieldName = jSONReader.readAny();
                    if (!jSONReader.nextIfMatch(':')) {
                        throw new JSONException(jSONReader.info("illegal input"));
                    }
                } else {
                    fieldName = jSONReader.readFieldNameUnquote();
                    if (jSONReader.current() == ':') {
                        jSONReader.next();
                    }
                }
            }
            char cCurrent3 = jSONReader.current();
            if (cCurrent3 == '\"' || cCurrent3 == c2) {
                string = jSONReader.readString();
            } else {
                if (cCurrent3 == c) {
                    string = jSONReader.readNumber();
                } else if (cCurrent3 != 'S') {
                    if (cCurrent3 == '[') {
                        string = jSONReader.readArray();
                    } else if (cCurrent3 == 'f') {
                        string = Boolean.valueOf(jSONReader.readBoolValue());
                    } else if (cCurrent3 == 'n') {
                        string = jSONReader.readNullOrNewDate();
                    } else if (cCurrent3 == 't') {
                        string = Boolean.valueOf(jSONReader.readBoolValue());
                    } else if (cCurrent3 != '{') {
                        if (cCurrent3 != '-' && cCurrent3 != '.') {
                            switch (cCurrent3) {
                                case '0':
                                case '1':
                                case Opcodes.AALOAD /* 50 */:
                                case Opcodes.BALOAD /* 51 */:
                                case '4':
                                case Opcodes.SALOAD /* 53 */:
                                case Opcodes.ISTORE /* 54 */:
                                case Opcodes.LSTORE /* 55 */:
                                case Opcodes.FSTORE /* 56 */:
                                case Opcodes.DSTORE /* 57 */:
                                    break;
                                default:
                                    throw new JSONException(jSONReader.info());
                            }
                        }
                        string = jSONReader.readNumber();
                    } else if (jSONReader.isReference()) {
                        String reference = jSONReader.readReference();
                        if ("..".equals(reference)) {
                            string = map;
                        } else {
                            jSONReader.addResolveTask(map, fieldName, JSONPath.of(reference));
                            str = str2;
                        }
                    } else {
                        string = jSONReader.readObject();
                    }
                } else {
                    if (!jSONReader.nextIfSet()) {
                        throw new JSONException(jSONReader.info());
                    }
                    string = jSONReader.read((Class<Object>) HashSet.class);
                }
                i++;
                str2 = str;
                c = '+';
                c2 = '\'';
            }
            if (string == null) {
                str = str2;
                if ((JSONReader.Feature.IgnoreNullPropertyValue.mask & features) != 0) {
                }
                i++;
                str2 = str;
                c = '+';
                c2 = '\'';
            } else {
                str = str2;
            }
            Object objPut = map.put(fieldName, string);
            if (objPut != null && (JSONReader.Feature.DuplicateKeyValueAsArray.mask & features) != 0) {
                if (objPut instanceof Collection) {
                    ((Collection) objPut).add(string);
                    map.put(fieldName, objPut);
                } else {
                    map.put(fieldName, JSONArray.of(objPut, string));
                }
            }
            i++;
            str2 = str;
            c = '+';
            c2 = '\'';
        }
        jSONReader.nextIfComma();
        return map;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j) {
        return new JSONObject();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Map map, long j) {
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Object obj = map.get(getTypeKey());
        if (!(obj instanceof String)) {
            return map;
        }
        String str = (String) obj;
        ObjectReader objectReaderAutoType = (JSONReader.Feature.SupportAutoType.mask & j) != 0 ? autoType(defaultObjectReaderProvider, Fnv.hashCode64(str)) : null;
        if (objectReaderAutoType == null && (objectReaderAutoType = defaultObjectReaderProvider.getObjectReader(str, getObjectClass(), getFeatures() | j)) == null) {
            throw new JSONException("No suitable ObjectReader found for".concat(str));
        }
        return objectReaderAutoType != this ? objectReaderAutoType.createInstance(map, j) : map;
    }
}
