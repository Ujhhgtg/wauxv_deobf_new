package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class JSONPathTyped extends JSONPath {
    final JSONPath jsonPath;
    final Type type;

    public JSONPathTyped(JSONPath jSONPath, Type type) {
        super(jSONPath.path, jSONPath.features);
        this.type = type;
        this.jsonPath = jSONPath;
    }

    public static JSONPath of(JSONPath jSONPath, Type type) {
        if (type == null || type == Object.class) {
            return jSONPath;
        }
        if ((jSONPath instanceof JSONPathTyped) && ((JSONPathTyped) jSONPath).type.equals(type)) {
            return jSONPath;
        }
        if (jSONPath instanceof JSONPathSingleName) {
            if (type == Integer.class) {
                return new JSONPathSingleNameInteger((JSONPathSingleName) jSONPath);
            }
            if (type == Long.class) {
                return new JSONPathSingleNameLong((JSONPathSingleName) jSONPath);
            }
            if (type == String.class) {
                return new JSONPathSingleNameString((JSONPathSingleName) jSONPath);
            }
            if (type == BigDecimal.class) {
                return new JSONPathSingleNameDecimal((JSONPathSingleName) jSONPath);
            }
        }
        return new JSONPathTyped(jSONPath, type);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean contains(Object obj) {
        return this.jsonPath.contains(obj);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public Object eval(Object obj) {
        return TypeUtils.cast(this.jsonPath.eval(obj), this.type);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public Object extract(JSONReader jSONReader) {
        return TypeUtils.cast(this.jsonPath.extract(jSONReader), this.type);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public String extractScalar(JSONReader jSONReader) {
        return this.jsonPath.extractScalar(jSONReader);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public JSONPath getParent() {
        return this.jsonPath.getParent();
    }

    public Type getType() {
        return this.type;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean isRef() {
        return this.jsonPath.isRef();
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean remove(Object obj) {
        return this.jsonPath.remove(obj);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2) {
        this.jsonPath.set(obj, obj2);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setCallback(Object obj, BiFunction biFunction) {
        this.jsonPath.setCallback(obj, biFunction);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setInt(Object obj, int i) {
        this.jsonPath.setInt(obj, i);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setLong(Object obj, long j) {
        this.jsonPath.setLong(obj, j);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2, JSONReader.Feature... featureArr) {
        this.jsonPath.set(obj, obj2, featureArr);
    }
}
