package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.time.ZoneId;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class JSONPathTypedMultiNamesPrefixName2 extends JSONPathTypedMultiNames {
    final String prefixName0;
    final String prefixName1;
    final long prefixNameHash0;
    final long prefixNameHash1;

    public JSONPathTypedMultiNamesPrefixName2(JSONPath[] jSONPathArr, JSONPath jSONPath, JSONPath[] jSONPathArr2, Type[] typeArr, String[] strArr, long[] jArr, ZoneId zoneId, long j) {
        super(jSONPathArr, jSONPath, jSONPathArr2, typeArr, strArr, jArr, zoneId, j);
        JSONPathTwoSegment jSONPathTwoSegment = (JSONPathTwoSegment) jSONPath;
        JSONPathSegment jSONPathSegment = jSONPathTwoSegment.first;
        this.prefixName0 = ((JSONPathSegmentName) jSONPathSegment).name;
        this.prefixNameHash0 = ((JSONPathSegmentName) jSONPathSegment).nameHashCode;
        JSONPathSegment jSONPathSegment2 = jSONPathTwoSegment.second;
        this.prefixName1 = ((JSONPathSegmentName) jSONPathSegment2).name;
        this.prefixNameHash1 = ((JSONPathSegmentName) jSONPathSegment2).nameHashCode;
    }

    private static JSONException error(JSONReader jSONReader) {
        return new JSONException(jSONReader.info("illegal input, expect '[', but " + jSONReader.current()));
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMultiNames, com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public /* bridge */ /* synthetic */ Object eval(Object obj) {
        return super.eval(obj);
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMultiNames, com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public Object extract(JSONReader jSONReader) {
        if (jSONReader.nextIfNull()) {
            return new Object[this.paths.length];
        }
        if (!jSONReader.nextIfObjectStart()) {
            throw error(jSONReader);
        }
        while (!jSONReader.nextIfObjectEnd()) {
            if (jSONReader.isEnd()) {
                throw error(jSONReader);
            }
            if (jSONReader.readFieldNameHashCode() == this.prefixNameHash0) {
                if (jSONReader.nextIfNull()) {
                    return new Object[this.paths.length];
                }
                if (!jSONReader.nextIfObjectStart()) {
                    throw error(jSONReader);
                }
                while (!jSONReader.nextIfObjectEnd()) {
                    if (jSONReader.isEnd()) {
                        throw error(jSONReader);
                    }
                    if (jSONReader.readFieldNameHashCode() == this.prefixNameHash1) {
                        return jSONReader.nextIfNull() ? new Object[this.paths.length] : this.objectReader.readObject(jSONReader);
                    }
                    jSONReader.skipValue();
                }
                return new Object[this.paths.length];
            }
            jSONReader.skipValue();
        }
        return new Object[this.paths.length];
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public /* bridge */ /* synthetic */ String extractScalar(JSONReader jSONReader) {
        return super.extractScalar(jSONReader);
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public /* bridge */ /* synthetic */ JSONPath getParent() {
        return super.getParent();
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMultiNames, com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public /* bridge */ /* synthetic */ boolean isRef() {
        return super.isRef();
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        super.set(obj, obj2);
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public /* bridge */ /* synthetic */ void setCallback(Object obj, BiFunction biFunction) {
        super.setCallback(obj, biFunction);
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public /* bridge */ /* synthetic */ void setInt(Object obj, int i) {
        super.setInt(obj, i);
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public /* bridge */ /* synthetic */ void setLong(Object obj, long j) {
        super.setLong(obj, j);
    }

    @Override // com.alibaba.fastjson2.JSONPathTypedMulti, com.alibaba.fastjson2.JSONPath
    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2, JSONReader.Feature[] featureArr) {
        super.set(obj, obj2, featureArr);
    }
}
