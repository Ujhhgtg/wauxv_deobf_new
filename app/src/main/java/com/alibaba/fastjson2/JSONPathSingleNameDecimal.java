package com.alibaba.fastjson2;

import java.math.BigDecimal;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathSingleNameDecimal extends JSONPathTyped {
    final String name;
    final long nameHashCode;

    public JSONPathSingleNameDecimal(JSONPathSingleName jSONPathSingleName) {
        super(jSONPathSingleName, BigDecimal.class);
        this.nameHashCode = jSONPathSingleName.nameHashCode;
        this.name = jSONPathSingleName.name;
    }

    @Override // com.alibaba.fastjson2.JSONPathTyped, com.alibaba.fastjson2.JSONPath
    public Object extract(JSONReader jSONReader) {
        if (!jSONReader.jsonb) {
            if (!jSONReader.nextIfObjectStart()) {
                return null;
            }
            while (!jSONReader.nextIfObjectEnd()) {
                if (jSONReader.readFieldNameHashCode() == this.nameHashCode) {
                    return jSONReader.readBigDecimal();
                }
                jSONReader.skipValue();
            }
            return null;
        }
        if (!jSONReader.isObject()) {
            return null;
        }
        jSONReader.nextIfObjectStart();
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode != 0) {
                if (fieldNameHashCode == this.nameHashCode || jSONReader.isObject() || jSONReader.isArray()) {
                    return jSONReader.readBigDecimal();
                }
                jSONReader.skipValue();
            }
        }
        return null;
    }
}
