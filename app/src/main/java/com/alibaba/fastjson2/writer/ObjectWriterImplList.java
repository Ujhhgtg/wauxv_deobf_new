package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplList extends ObjectWriterPrimitiveImpl {
    static final Class CLASS_SUBLIST;
    static final ObjectWriterImplList INSTANCE = new ObjectWriterImplList(null, null, null, null, 0);
    static final ObjectWriterImplList INSTANCE_JSON_ARRAY = new ObjectWriterImplList(JSONArray.class, null, null, null, 0);
    static final ObjectWriterImplList INSTANCE_JSON_ARRAY_1x;
    static final String TYPE_NAME_ARRAY_LIST;
    static final long TYPE_NAME_HASH_ARRAY_LIST;
    static final byte[] TYPE_NAME_JSONB_ARRAY_LIST;
    final Class defineClass;
    final Type defineType;
    final long features;
    final Class itemClass;
    final boolean itemClassRefDetect;
    volatile ObjectWriter itemClassWriter;
    final Type itemType;

    static {
        Class cls = TypeUtils.CLASS_JSON_ARRAY_1x;
        if (cls == null) {
            INSTANCE_JSON_ARRAY_1x = null;
        } else {
            INSTANCE_JSON_ARRAY_1x = new ObjectWriterImplList(cls, null, null, null, 0L);
        }
        CLASS_SUBLIST = new ArrayList().subList(0, 0).getClass();
        String typeName = TypeUtils.getTypeName(ArrayList.class);
        TYPE_NAME_ARRAY_LIST = typeName;
        TYPE_NAME_JSONB_ARRAY_LIST = JSONB.toBytes(typeName);
        TYPE_NAME_HASH_ARRAY_LIST = Fnv.hashCode64(typeName);
    }

    public ObjectWriterImplList(Class cls, Type type, Class cls2, Type type2, long j) {
        this.defineClass = cls;
        this.defineType = type;
        this.itemClass = cls2;
        this.itemType = type2;
        this.features = j;
        this.itemClassRefDetect = (cls2 == null || ObjectWriterProvider.isNotReferenceDetect(cls2)) ? false : true;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Class<?> cls;
        ObjectWriter objectWriter;
        boolean zIsRefDetect;
        boolean z;
        String path;
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        List list = TypeUtils.toList(obj);
        Class<?> cls2 = null;
        if (jSONWriter.jsonb) {
            jSONWriter.startArray(list.size());
            ObjectWriter objectWriter2 = null;
            for (int i = 0; i < list.size(); i++) {
                Object obj3 = list.get(i);
                if (obj3 == null) {
                    jSONWriter.writeNull();
                } else {
                    Class<?> cls3 = obj3.getClass();
                    if (cls3 != cls2) {
                        objectWriter2 = jSONWriter.getObjectWriter(cls3);
                        cls2 = cls3;
                    }
                    objectWriter2.writeJSONB(jSONWriter, obj3, Integer.valueOf(i), this.itemType, j);
                }
            }
            return;
        }
        JSONWriter.Context context = jSONWriter.context;
        ObjectWriterProvider objectWriterProvider = context.provider;
        int size = list.size();
        if (size == 0) {
            jSONWriter.writeRaw('[', ']');
            return;
        }
        jSONWriter.startArray();
        Class<?> cls4 = null;
        ObjectWriter objectWriter3 = null;
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                jSONWriter.writeComma();
            }
            Object obj4 = list.get(i2);
            if (obj4 == null) {
                jSONWriter.writeNull();
            } else {
                Class<?> cls5 = obj4.getClass();
                if (cls5 == String.class) {
                    jSONWriter.writeString((String) obj4);
                } else {
                    if (cls5 != Integer.class) {
                        cls = cls4;
                        if (cls5 == Long.class) {
                            if ((objectWriterProvider.userDefineMask & 4) == 0) {
                                jSONWriter.writeInt64((Long) obj4);
                            } else {
                                objectWriterProvider.getObjectWriter((Type) cls5, (Class) cls5, false).write(jSONWriter, obj4, Integer.valueOf(i2), Long.class, j);
                            }
                        } else if (cls5 == Boolean.class) {
                            if ((objectWriterProvider.userDefineMask & 2) == 0) {
                                jSONWriter.writeBool(((Boolean) obj4).booleanValue());
                            } else {
                                objectWriterProvider.getObjectWriter((Type) cls5, (Class) cls5, false).write(jSONWriter, obj4, Integer.valueOf(i2), Boolean.class, j);
                            }
                        } else if (cls5 != BigDecimal.class) {
                            if (cls5 != this.itemClass || this.itemClassWriter == null) {
                                if (cls5 == cls) {
                                    objectWriter = objectWriter3;
                                } else {
                                    if (cls5 == JSONObject.class) {
                                        objectWriter = ObjectWriterImplMap.INSTANCE;
                                        zIsRefDetect = jSONWriter.isRefDetect();
                                    } else if (cls5 == TypeUtils.CLASS_JSON_OBJECT_1x) {
                                        objectWriter = ObjectWriterImplMap.INSTANCE_1x;
                                        zIsRefDetect = jSONWriter.isRefDetect();
                                    } else if (cls5 == JSONArray.class) {
                                        objectWriter = INSTANCE_JSON_ARRAY;
                                        zIsRefDetect = jSONWriter.isRefDetect();
                                    } else if (cls5 == TypeUtils.CLASS_JSON_ARRAY_1x) {
                                        objectWriter = INSTANCE_JSON_ARRAY_1x;
                                        zIsRefDetect = jSONWriter.isRefDetect();
                                    } else {
                                        objectWriter = context.getObjectWriter(cls5);
                                        zIsRefDetect = jSONWriter.isRefDetect(obj4);
                                    }
                                    z2 = zIsRefDetect;
                                    if (cls5 == this.itemClass) {
                                        this.itemClassWriter = objectWriter;
                                    }
                                    objectWriter3 = objectWriter;
                                    cls = cls5;
                                }
                                z = z2;
                            } else {
                                objectWriter = this.itemClassWriter;
                                z = z2;
                                z2 = this.itemClassRefDetect && jSONWriter.isRefDetect();
                            }
                            if (!z2 || (path = jSONWriter.setPath(i2, obj4)) == null) {
                                objectWriter.write(jSONWriter, obj4, Integer.valueOf(i2), this.itemType, this.features);
                                if (z2) {
                                    jSONWriter.popPath(obj4);
                                }
                            } else {
                                jSONWriter.writeReference(path);
                                jSONWriter.popPath(obj4);
                            }
                            z2 = z;
                        } else if ((objectWriterProvider.userDefineMask & 8) == 0) {
                            jSONWriter.writeDecimal((BigDecimal) obj4, j, null);
                        } else {
                            objectWriterProvider.getObjectWriter((Type) cls5, (Class) cls5, false).write(jSONWriter, obj4, Integer.valueOf(i2), BigDecimal.class, j);
                        }
                    } else if ((objectWriterProvider.userDefineMask & 2) == 0) {
                        jSONWriter.writeInt32((Integer) obj4);
                    } else {
                        cls = cls4;
                        objectWriterProvider.getObjectWriter((Type) cls5, (Class) cls5, false).write(jSONWriter, obj4, Integer.valueOf(i2), Integer.class, j);
                    }
                    cls4 = cls;
                }
            }
            cls = cls4;
            cls4 = cls;
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl, com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        JSONWriter jSONWriter2;
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        List list = TypeUtils.toList(obj);
        jSONWriter.startArray(list.size());
        Class<?> cls = null;
        int i = 0;
        ObjectWriter objectWriter = null;
        while (i < list.size()) {
            Object obj3 = list.get(i);
            if (obj3 == null) {
                jSONWriter.writeNull();
                jSONWriter2 = jSONWriter;
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 != cls) {
                    objectWriter = jSONWriter.getObjectWriter(cls2);
                    cls = cls2;
                }
                ObjectWriter objectWriter2 = objectWriter;
                jSONWriter2 = jSONWriter;
                objectWriter2.writeArrayMappingJSONB(jSONWriter2, obj3, Integer.valueOf(i), this.itemType, this.features | j);
                objectWriter = objectWriter2;
            }
            i++;
            jSONWriter = jSONWriter2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0139  */
    /* JADX WARN: Code duplicated, block: B:103:0x0146  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0105  */
    /* JADX WARN: Code duplicated, block: B:83:0x0108  */
    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code duplicated, block: B:86:0x010f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0113  */
    /* JADX WARN: Code duplicated, block: B:89:0x0116  */
    /* JADX WARN: Code duplicated, block: B:91:0x011a  */
    /* JADX WARN: Code duplicated, block: B:92:0x011d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:98:0x012c  */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Class cls;
        Class cls2;
        Class<?> cls3;
        long j2;
        List list;
        int size;
        JSONWriter.Context context;
        ObjectWriter objectWriter;
        int i;
        Object obj3;
        Class<?> cls4;
        boolean zIsRefDetect;
        Class<?> cls5;
        String path0;
        ObjectWriter objectWriter2;
        Object obj4;
        Class<?> cls6;
        Class<?> cls7;
        Class cls8;
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        int i2 = 0;
        Class<?> cls9 = null;
        if (!(type instanceof Class)) {
            if (type == this.defineType) {
                cls = this.itemClass;
            } else if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    Type type2 = actualTypeArguments[0];
                    if (type2 instanceof Class) {
                        cls2 = (Class) type2;
                    } else {
                        cls2 = null;
                    }
                } else {
                    cls2 = null;
                }
                Type rawType = parameterizedType.getRawType();
                cls = rawType instanceof Class ? (Class) rawType : null;
            } else {
                cls = null;
                cls2 = null;
            }
            cls3 = obj.getClass();
            j2 = j;
            if (jSONWriter.isWriteTypeInfo(obj, cls, j2)) {
                if (cls3 != CLASS_SUBLIST || cls3 == ArrayList.class) {
                    jSONWriter.writeTypeName(TYPE_NAME_JSONB_ARRAY_LIST, TYPE_NAME_HASH_ARRAY_LIST);
                } else {
                    jSONWriter.writeTypeName(TypeUtils.getTypeName(cls3));
                }
            }
            list = TypeUtils.toList(obj);
            size = list.size();
            if (size == 0) {
                jSONWriter.writeRaw((byte) -108);
                return;
            }
            if (jSONWriter.isBeanToArray()) {
                jSONWriter.startArray(size);
                objectWriter2 = null;
                while (i2 < size) {
                    obj4 = list.get(i2);
                    if (obj4 == null) {
                        jSONWriter.writeNull();
                        cls7 = cls9;
                        cls8 = cls2;
                    } else {
                        cls6 = obj4.getClass();
                        if (cls6 == cls9) {
                            cls7 = cls9;
                        } else {
                            objectWriter2 = jSONWriter.getObjectWriter(cls6);
                            cls7 = cls6;
                        }
                        cls8 = cls2;
                        objectWriter2.writeArrayMappingJSONB(jSONWriter, obj4, Integer.valueOf(i2), cls8, j2);
                    }
                    i2++;
                    j2 = j;
                    cls2 = cls8;
                    cls9 = cls7;
                }
                jSONWriter.endArray();
                return;
            }
            context = jSONWriter.context;
            jSONWriter.startArray(size);
            objectWriter = null;
            for (i = 0; i < size; i++) {
                obj3 = list.get(i);
                if (obj3 == null) {
                    jSONWriter.writeNull();
                } else {
                    cls4 = obj3.getClass();
                    if (cls4 == String.class) {
                        jSONWriter.writeString((String) obj3);
                    } else {
                        if (cls4 == this.itemClass) {
                            zIsRefDetect = jSONWriter.isRefDetect(obj3);
                        } else if (this.itemClassRefDetect || !jSONWriter.isRefDetect()) {
                            zIsRefDetect = false;
                        } else {
                            zIsRefDetect = true;
                        }
                        if (cls4 == this.itemClass || this.itemClassWriter == null) {
                            if (cls4 != cls9) {
                                if (cls4 == JSONObject.class) {
                                    objectWriter = ObjectWriterImplMap.INSTANCE;
                                } else if (cls4 == TypeUtils.CLASS_JSON_OBJECT_1x) {
                                    objectWriter = ObjectWriterImplMap.INSTANCE_1x;
                                } else if (cls4 == JSONArray.class) {
                                    objectWriter = INSTANCE_JSON_ARRAY;
                                } else if (cls4 == TypeUtils.CLASS_JSON_ARRAY_1x) {
                                    objectWriter = INSTANCE_JSON_ARRAY_1x;
                                } else {
                                    objectWriter = context.getObjectWriter(cls4);
                                }
                                if (cls4 == this.itemClass) {
                                    this.itemClassWriter = objectWriter;
                                }
                                objectWriter = objectWriter;
                                cls5 = cls4;
                            }
                            if (zIsRefDetect || (path0 = jSONWriter.setPath0(i, obj3)) == null) {
                                objectWriter.writeJSONB(jSONWriter, obj3, Integer.valueOf(i), this.itemType, this.features);
                                if (zIsRefDetect) {
                                    jSONWriter.popPath0(obj3);
                                }
                            } else {
                                jSONWriter.writeReference(path0);
                                jSONWriter.popPath0(obj3);
                            }
                            objectWriter = objectWriter;
                            cls9 = cls5;
                        } else {
                            objectWriter = this.itemClassWriter;
                        }
                        cls5 = cls9;
                        if (zIsRefDetect) {
                            objectWriter.writeJSONB(jSONWriter, obj3, Integer.valueOf(i), this.itemType, this.features);
                            if (true) {
                                jSONWriter.popPath0(obj3);
                            }
                        } else {
                            objectWriter.writeJSONB(jSONWriter, obj3, Integer.valueOf(i), this.itemType, this.features);
                            if (false) {
                                jSONWriter.popPath0(obj3);
                            }
                        }
                        objectWriter = objectWriter;
                        cls9 = cls5;
                    }
                }
            }
            jSONWriter.endArray();
        }
        cls = (Class) type;
        cls2 = null;
        cls3 = obj.getClass();
        j2 = j;
        if (jSONWriter.isWriteTypeInfo(obj, cls, j2)) {
            if (cls3 != CLASS_SUBLIST) {
                jSONWriter.writeTypeName(TYPE_NAME_JSONB_ARRAY_LIST, TYPE_NAME_HASH_ARRAY_LIST);
            } else {
                jSONWriter.writeTypeName(TYPE_NAME_JSONB_ARRAY_LIST, TYPE_NAME_HASH_ARRAY_LIST);
            }
        }
        list = TypeUtils.toList(obj);
        size = list.size();
        if (size == 0) {
            jSONWriter.writeRaw((byte) -108);
            return;
        }
        if (jSONWriter.isBeanToArray()) {
            jSONWriter.startArray(size);
            objectWriter2 = null;
            while (i2 < size) {
                obj4 = list.get(i2);
                if (obj4 == null) {
                    jSONWriter.writeNull();
                    cls7 = cls9;
                    cls8 = cls2;
                } else {
                    cls6 = obj4.getClass();
                    if (cls6 == cls9) {
                        cls7 = cls9;
                    } else {
                        objectWriter2 = jSONWriter.getObjectWriter(cls6);
                        cls7 = cls6;
                    }
                    cls8 = cls2;
                    objectWriter2.writeArrayMappingJSONB(jSONWriter, obj4, Integer.valueOf(i2), cls8, j2);
                }
                i2++;
                j2 = j;
                cls2 = cls8;
                cls9 = cls7;
            }
            jSONWriter.endArray();
            return;
        }
        context = jSONWriter.context;
        jSONWriter.startArray(size);
        objectWriter = null;
        while (i < size) {
            obj3 = list.get(i);
            if (obj3 == null) {
                jSONWriter.writeNull();
            } else {
                cls4 = obj3.getClass();
                if (cls4 == String.class) {
                    jSONWriter.writeString((String) obj3);
                } else {
                    if (cls4 == this.itemClass) {
                        zIsRefDetect = jSONWriter.isRefDetect(obj3);
                    } else if (this.itemClassRefDetect) {
                        zIsRefDetect = false;
                    } else {
                        zIsRefDetect = false;
                    }
                    if (cls4 == this.itemClass) {
                        if (cls4 != cls9) {
                            cls5 = cls9;
                        } else {
                            if (cls4 == JSONObject.class) {
                                objectWriter = ObjectWriterImplMap.INSTANCE;
                            } else if (cls4 == TypeUtils.CLASS_JSON_OBJECT_1x) {
                                objectWriter = ObjectWriterImplMap.INSTANCE_1x;
                            } else if (cls4 == JSONArray.class) {
                                objectWriter = INSTANCE_JSON_ARRAY;
                            } else if (cls4 == TypeUtils.CLASS_JSON_ARRAY_1x) {
                                objectWriter = INSTANCE_JSON_ARRAY_1x;
                            } else {
                                objectWriter = context.getObjectWriter(cls4);
                            }
                            if (true) {
                                this.itemClassWriter = objectWriter;
                            }
                            objectWriter = objectWriter;
                            cls5 = cls4;
                        }
                    } else if (cls4 != cls9) {
                        cls5 = cls9;
                    } else {
                        if (cls4 == JSONObject.class) {
                            objectWriter = ObjectWriterImplMap.INSTANCE;
                        } else if (cls4 == TypeUtils.CLASS_JSON_OBJECT_1x) {
                            objectWriter = ObjectWriterImplMap.INSTANCE_1x;
                        } else if (cls4 == JSONArray.class) {
                            objectWriter = INSTANCE_JSON_ARRAY;
                        } else if (cls4 == TypeUtils.CLASS_JSON_ARRAY_1x) {
                            objectWriter = INSTANCE_JSON_ARRAY_1x;
                        } else {
                            objectWriter = context.getObjectWriter(cls4);
                        }
                        if (false) {
                            this.itemClassWriter = objectWriter;
                        }
                        objectWriter = objectWriter;
                        cls5 = cls4;
                    }
                    if (zIsRefDetect) {
                        objectWriter.writeJSONB(jSONWriter, obj3, Integer.valueOf(i), this.itemType, this.features);
                        if (true) {
                            jSONWriter.popPath0(obj3);
                        }
                    } else {
                        objectWriter.writeJSONB(jSONWriter, obj3, Integer.valueOf(i), this.itemType, this.features);
                        if (false) {
                            jSONWriter.popPath0(obj3);
                        }
                    }
                    objectWriter = objectWriter;
                    cls9 = cls5;
                }
            }
        }
        jSONWriter.endArray();
    }
}
