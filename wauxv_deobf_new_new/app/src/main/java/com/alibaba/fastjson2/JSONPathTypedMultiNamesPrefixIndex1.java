package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.time.ZoneId;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class JSONPathTypedMultiNamesPrefixIndex1 extends JSONPathTypedMultiNames {
    final int index;

    public JSONPathTypedMultiNamesPrefixIndex1(JSONPath[] jSONPathArr, JSONPathSingleIndex jSONPathSingleIndex, JSONPath[] jSONPathArr2, Type[] typeArr, String[] strArr, long[] jArr, ZoneId zoneId, long j) {
        super(jSONPathArr, jSONPathSingleIndex, jSONPathArr2, typeArr, strArr, jArr, zoneId, j);
        this.index = jSONPathSingleIndex.index;
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
        if (!jSONReader.nextIfArrayStart()) {
            throw new JSONException(jSONReader.info("illegal input, expect '[', but " + jSONReader.current()));
        }
        for (int i = 0; i < this.index; i++) {
            if (jSONReader.nextIfArrayEnd()) {
                return new Object[this.paths.length];
            }
            if (jSONReader.isEnd()) {
                throw new JSONException(jSONReader.info("illegal input, expect '[', but " + jSONReader.current()));
            }
            jSONReader.skipValue();
        }
        if (jSONReader.nextIfNull()) {
            return new Object[this.paths.length];
        }
        return jSONReader.nextIfArrayEnd() ? new Object[this.paths.length] : this.objectReader.readObject(jSONReader);
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
