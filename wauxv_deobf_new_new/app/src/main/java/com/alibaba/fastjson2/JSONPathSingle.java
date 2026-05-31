package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONPathSegment;
import com.alibaba.fastjson2.JSONReader;
import java.util.Objects;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class JSONPathSingle extends JSONPath {
    final boolean extractSupport;
    final boolean ref;
    final JSONPathSegment segment;

    public JSONPathSingle(JSONPathSegment jSONPathSegment, String str, JSONPath.Feature... featureArr) {
        super(str, featureArr);
        this.segment = jSONPathSegment;
        boolean z = jSONPathSegment instanceof JSONPathSegmentIndex;
        boolean z2 = true;
        this.ref = z || (jSONPathSegment instanceof JSONPathSegmentName) || (jSONPathSegment instanceof JSONPathSegment.SelfSegment);
        if ((jSONPathSegment instanceof JSONPathSegment.EvalSegment) || ((z && ((JSONPathSegmentIndex) jSONPathSegment).index < 0) || ((jSONPathSegment instanceof JSONPathSegment.CycleNameSegment) && ((JSONPathSegment.CycleNameSegment) jSONPathSegment).shouldRecursive()))) {
            z2 = false;
        }
        this.extractSupport = z2;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean contains(Object obj) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.segment, null, 0L);
        context.root = obj;
        return this.segment.contains(context);
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.segment, ((JSONPathSingle) obj).segment);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public Object eval(Object obj) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.segment, null, 0L);
        context.root = obj;
        this.segment.eval(context);
        return context.value;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public Object extract(JSONReader jSONReader) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.segment, null, 0L);
        if (this.extractSupport) {
            this.segment.accept(jSONReader, context);
        } else {
            context.root = jSONReader.readAny();
            this.segment.eval(context);
        }
        return context.value;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public String extractScalar(JSONReader jSONReader) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.segment, null, 0L);
        this.segment.accept(jSONReader, context);
        return JSON.toJSONString(context.value);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public final JSONPath getParent() {
        return JSONPath.RootPath.INSTANCE;
    }

    public int hashCode() {
        return Objects.hashCode(this.segment);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean isRef() {
        return this.ref;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean remove(Object obj) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.segment, null, 0L);
        context.root = obj;
        return this.segment.remove(context);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.segment, null, 0L);
        context.root = obj;
        this.segment.set(context, obj2);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setCallback(Object obj, BiFunction biFunction) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.segment, null, 0L);
        context.root = obj;
        this.segment.setCallback(context, biFunction);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setInt(Object obj, int i) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.segment, null, 0L);
        context.root = obj;
        this.segment.setInt(context, i);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setLong(Object obj, long j) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.segment, null, 0L);
        context.root = obj;
        this.segment.setLong(context, j);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2, JSONReader.Feature... featureArr) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.segment, null, 0L);
        context.root = obj;
        this.segment.set(context, obj2);
    }
}
