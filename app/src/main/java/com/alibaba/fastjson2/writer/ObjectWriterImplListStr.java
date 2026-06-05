package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplListStr extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplListStr INSTANCE = new ObjectWriterImplListStr();

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        List list = TypeUtils.toList(obj);
        jSONWriter.startArray();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                jSONWriter.writeComma();
            }
            String str = (String) list.get(i);
            if (str == null) {
                jSONWriter.writeNull();
            } else {
                jSONWriter.writeString(str);
            }
        }
        jSONWriter.endArray();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Class<List> cls;
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        if (type == TypeUtils.PARAM_TYPE_LIST_STR) {
            cls = List.class;
        } else if (type instanceof Class) {
            cls = (Class) type;
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                cls = (Class) rawType;
            } else {
                cls = null;
            }
        } else {
            cls = null;
        }
        Class<?> cls2 = obj.getClass();
        if (cls2 != ArrayList.class && jSONWriter.isWriteTypeInfo(obj, (Class) cls, j)) {
            if (cls2 == ObjectWriterImplList.CLASS_SUBLIST) {
                cls2 = ArrayList.class;
            }
            jSONWriter.writeTypeName(TypeUtils.getTypeName(cls2));
        }
        jSONWriter.writeString(TypeUtils.toList(obj));
    }
}
