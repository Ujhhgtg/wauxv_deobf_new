package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplMapString extends ObjectReaderImplMapTyped {
    public ObjectReaderImplMapString(Class cls, Class cls2, long j) {
        super(cls, cls2, null, String.class, j, null);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped, com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        JSONReader jSONReader2;
        Object objPut;
        JSONReader jSONReader3;
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j);
        }
        if (jSONReader.nextIfObjectStart()) {
            jSONReader2 = jSONReader;
        } else {
            if (jSONReader.current() == '[') {
                jSONReader.next();
                if (jSONReader.current() == '{') {
                    Object object = readObject(jSONReader, String.class, obj, j);
                    jSONReader3 = jSONReader;
                    if (jSONReader3.nextIfArrayEnd()) {
                        jSONReader3.nextIfComma();
                        return object;
                    }
                } else {
                    jSONReader3 = jSONReader;
                }
                throw new JSONException(jSONReader3.info("expect '{', but '['"));
            }
            jSONReader2 = jSONReader;
            if (jSONReader2.nextIfNullOrEmptyString() || jSONReader2.nextIfMatchIdent('\"', 'n', 'u', 'l', 'l', '\"')) {
                return null;
            }
        }
        JSONReader.Context context = jSONReader2.getContext();
        Map map = this.instanceType == HashMap.class ? new HashMap() : (Map) createInstance(context.getFeatures() | j);
        long features = j | context.getFeatures();
        int i = 0;
        while (!jSONReader2.nextIfObjectEnd()) {
            String fieldName = jSONReader2.readFieldName();
            if (this.multiValue && jSONReader2.nextIfArrayStart()) {
                JSONArray jSONArray = new JSONArray();
                while (!jSONReader2.nextIfArrayEnd()) {
                    jSONArray.add(jSONReader2.readString());
                }
                map.put(fieldName, jSONArray);
            } else {
                String string = jSONReader2.readString();
                if ((i != 0 || (JSONReader.Feature.SupportAutoType.mask & features) == 0 || !fieldName.equals(getTypeKey())) && ((string != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & features) == 0) && (objPut = map.put(fieldName, string)) != null && (JSONReader.Feature.DuplicateKeyValueAsArray.mask & features) != 0)) {
                    if (objPut instanceof Collection) {
                        ((Collection) objPut).add(string);
                        map.put(fieldName, objPut);
                    } else {
                        map.put(fieldName, JSONArray.of(objPut, (Object) string));
                    }
                }
            }
            i++;
        }
        jSONReader2.nextIfMatch(',');
        return map;
    }
}
