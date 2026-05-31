package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPObject;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplJSONP implements ObjectReader {
    private final Class objectClass;

    public ObjectReaderImplJSONP(Class cls) {
        this.objectClass = cls;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        JSONPObject jSONPObject;
        String fieldNameUnquote = jSONReader.readFieldNameUnquote();
        if (jSONReader.nextIfMatch('.')) {
            fieldNameUnquote = fieldNameUnquote + '.' + jSONReader.readFieldNameUnquote();
        }
        char cCurrent = jSONReader.current();
        if (cCurrent == '/' && jSONReader.nextIfMatchIdent('/', '*', '*', '/')) {
            cCurrent = jSONReader.current();
        }
        if (cCurrent != '(') {
            throw new JSONException(jSONReader.info("illegal jsonp input"));
        }
        jSONReader.next();
        Class cls = this.objectClass;
        if (cls == JSONObject.class) {
            jSONPObject = new JSONPObject(fieldNameUnquote);
        } else {
            try {
                jSONPObject = (JSONPObject) cls.newInstance();
                jSONPObject.setFunction(fieldNameUnquote);
            } catch (IllegalAccessException | InstantiationException e) {
                throw new JSONException("create jsonp instance error", e);
            }
        }
        while (!jSONReader.isEnd()) {
            if (jSONReader.nextIfMatch(')')) {
                jSONReader.nextIfMatch(';');
                jSONReader.nextIfMatchIdent('/', '*', '*', '/');
                return jSONPObject;
            }
            jSONPObject.addParameter(jSONReader.readAny());
        }
        throw new JSONException(jSONReader.info("illegal jsonp input"));
    }
}
