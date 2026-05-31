package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectArrayReader extends ObjectReaderPrimitive {
    public static final ObjectArrayReader INSTANCE = new ObjectArrayReader();
    public static final long TYPE_HASH_CODE = Fnv.hashCode64("[O");

    public ObjectArrayReader() {
        super(Object[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Object createInstance(long j) {
        return super.createInstance(j);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Object objValueOf;
        ObjectReader objectReaderCheckAutoType;
        if (jSONReader.getType() == -110 && (objectReaderCheckAutoType = jSONReader.checkAutoType(Object[].class, TYPE_HASH_CODE, j)) != this) {
            return objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j);
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Object[] objArr = new Object[iStartArray];
        for (int i = 0; i < iStartArray; i++) {
            byte type2 = jSONReader.getType();
            if (type2 >= 73 && type2 <= 125) {
                objValueOf = jSONReader.readString();
            } else if (type2 == -110) {
                ObjectReader objectReaderCheckAutoType2 = jSONReader.checkAutoType(Object.class, 0L, j);
                objValueOf = objectReaderCheckAutoType2 != null ? objectReaderCheckAutoType2.readJSONBObject(jSONReader, null, null, j) : jSONReader.readAny();
            } else if (type2 == -81) {
                jSONReader.next();
                objValueOf = null;
            } else if (type2 == -79) {
                jSONReader.next();
                objValueOf = Boolean.TRUE;
            } else if (type2 == -80) {
                jSONReader.next();
                objValueOf = Boolean.FALSE;
            } else {
                objValueOf = type2 == -66 ? Long.valueOf(jSONReader.readInt64Value()) : jSONReader.readAny();
            }
            objArr[i] = objValueOf;
        }
        return objArr;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Object string;
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            if (jSONReader.current() == '{') {
                jSONReader.next();
                if (jSONReader.readFieldNameHashCode() == ObjectReader.HASH_TYPE) {
                    jSONReader.readString();
                }
            }
            if (jSONReader.isString()) {
                String string2 = jSONReader.readString();
                if (string2 == null || string2.isEmpty()) {
                    return null;
                }
                if (ObjectReader.VALUE_NAME.equals(string2)) {
                    jSONReader.next();
                    Object object = readObject(jSONReader, type, obj, j);
                    jSONReader.nextIfObjectEnd();
                    return object;
                }
            }
            throw new JSONException(jSONReader.info("TODO"));
        }
        Object[] objArrCopyOf = new Object[16];
        int i = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            int i2 = i + 1;
            if (i2 - objArrCopyOf.length > 0) {
                int length = objArrCopyOf.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            }
            char cCurrent = jSONReader.current();
            if (cCurrent == '\"') {
                string = jSONReader.readString();
            } else if (cCurrent == '+') {
                string = jSONReader.readNumber();
            } else if (cCurrent != 'S') {
                if (cCurrent == '[') {
                    string = jSONReader.readArray();
                } else if (cCurrent == 'f') {
                    string = Boolean.valueOf(jSONReader.readBoolValue());
                } else if (cCurrent == 'n') {
                    jSONReader.readNull();
                    string = null;
                } else if (cCurrent == 't') {
                    string = Boolean.valueOf(jSONReader.readBoolValue());
                } else if (cCurrent != '{') {
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
                    string = jSONReader.readNumber();
                } else {
                    string = jSONReader.read((Class<Object>) Object.class);
                }
            } else {
                if (!jSONReader.nextIfSet()) {
                    throw new JSONException("Expected Set format but parsing failed: " + jSONReader.info());
                }
                string = jSONReader.read((Class<Object>) HashSet.class);
            }
            objArrCopyOf[i] = string;
            i = i2;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(objArrCopyOf, i);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object[] createInstance(Collection collection, long j) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }
}
