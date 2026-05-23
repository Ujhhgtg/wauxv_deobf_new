package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.time.ZoneId;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class JSONPathTypedMulti extends JSONPath {
    final String[] formats;
    final long[] pathFeatures;
    final JSONPath[] paths;
    final Type[] types;
    final ZoneId zoneId;

    public JSONPathTypedMulti(JSONPath[] jSONPathArr, Type[] typeArr, String[] strArr, long[] jArr, ZoneId zoneId, long j) {
        super(JSON.toJSONString(jSONPathArr), j);
        this.types = typeArr;
        this.paths = jSONPathArr;
        this.formats = strArr;
        this.pathFeatures = jArr;
        this.zoneId = zoneId;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean contains(Object obj) {
        for (JSONPath jSONPath : this.paths) {
            if (jSONPath.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public JSONReader.Context createContext() {
        JSONReader.Context contextCreateReadContext = JSONFactory.createReadContext(this.features);
        ZoneId zoneId = this.zoneId;
        if (zoneId != null && zoneId != DateUtils.DEFAULT_ZONE_ID) {
            contextCreateReadContext.zoneId = zoneId;
        }
        return contextCreateReadContext;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public Object eval(Object obj) {
        Object[] objArr = new Object[this.paths.length];
        int i = 0;
        while (true) {
            JSONPath[] jSONPathArr = this.paths;
            if (i >= jSONPathArr.length) {
                return objArr;
            }
            JSONPath jSONPath = jSONPathArr[i];
            try {
                objArr[i] = TypeUtils.cast(jSONPath.eval(obj), this.types[i]);
            } catch (Exception e) {
                if (!ignoreError(i)) {
                    throw new JSONException("jsonpath eval path, path : " + jSONPath + ", msg : " + e.getMessage(), e);
                }
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public Object extract(JSONReader jSONReader) {
        return eval(jSONReader.readAny());
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public String extractScalar(JSONReader jSONReader) {
        return JSON.toJSONString(extract(jSONReader));
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public JSONPath getParent() {
        return this.paths[0].getParent();
    }

    public final boolean ignoreError(int i) {
        long[] jArr = this.pathFeatures;
        return (jArr == null || i >= jArr.length || (jArr[i] & JSONPath.Feature.NullOnError.mask) == 0) ? false : true;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean isRef() {
        for (JSONPath jSONPath : this.paths) {
            if (!jSONPath.isRef()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean remove(Object obj) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setCallback(Object obj, BiFunction biFunction) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setInt(Object obj, int i) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setLong(Object obj, long j) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2, JSONReader.Feature... featureArr) {
        throw new JSONException("unsupported operation");
    }
}
