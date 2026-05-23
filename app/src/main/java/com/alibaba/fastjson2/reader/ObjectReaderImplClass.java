package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplClass extends ObjectReaderPrimitive {
    static final ObjectReaderImplClass INSTANCE = new ObjectReaderImplClass();
    static final long TYPE_HASH = Fnv.hashCode64("java.lang.Class");

    public ObjectReaderImplClass() {
        super(Class.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!jSONReader.nextIfMatch(-110) || jSONReader.readTypeHashCode() == TYPE_HASH) {
            return readObject(jSONReader, type, obj, j);
        }
        throw new JSONException(jSONReader.info("not support autoType : " + jSONReader.getString()));
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        long j2;
        long valueHashCode = jSONReader.readValueHashCode();
        JSONReader.Context context = jSONReader.getContext();
        JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
        if (contextAutoTypeBeforeHandler != null) {
            j2 = j;
            Class<?> clsApply = contextAutoTypeBeforeHandler.apply(valueHashCode, Class.class, j2);
            if (clsApply == null) {
                clsApply = contextAutoTypeBeforeHandler.apply(jSONReader.getString(), Class.class, j2);
            }
            if (clsApply != null) {
                return clsApply;
            }
        } else {
            j2 = j;
        }
        String string = jSONReader.getString();
        if (((context.getFeatures() | j2) & JSONReader.Feature.SupportClassForName.mask) == 0) {
            throw new JSONException(jSONReader.info("not support ClassForName : " + string + ", you can config 'JSONReader.Feature.SupportClassForName'"));
        }
        Class mapping = TypeUtils.getMapping(string);
        if (mapping != null) {
            return mapping;
        }
        Class<?> clsCheckAutoType = context.getProvider().checkAutoType(string, null, JSONReader.Feature.SupportAutoType.mask);
        if (clsCheckAutoType != null) {
            return clsCheckAutoType;
        }
        throw new JSONException(jSONReader.info("class not found " + string));
    }
}
