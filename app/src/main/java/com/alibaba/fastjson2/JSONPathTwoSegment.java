package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONPathFilter;
import com.alibaba.fastjson2.JSONPathSegment;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class JSONPathTwoSegment extends JSONPath {
    final boolean extractSupport;
    final JSONPathSegment first;
    final boolean ref;
    final JSONPathSegment second;

    public JSONPathTwoSegment(String str, JSONPathSegment jSONPathSegment, JSONPathSegment jSONPathSegment2, JSONPath.Feature... featureArr) {
        super(str, featureArr);
        this.first = jSONPathSegment;
        this.second = jSONPathSegment2;
        boolean z = jSONPathSegment instanceof JSONPathSegmentIndex;
        boolean z2 = true;
        this.ref = (z || (jSONPathSegment instanceof JSONPathSegmentName)) && ((jSONPathSegment2 instanceof JSONPathSegmentIndex) || (jSONPathSegment2 instanceof JSONPathSegmentName));
        if ((jSONPathSegment instanceof JSONPathSegment.EvalSegment) || ((z && ((JSONPathSegmentIndex) jSONPathSegment).index < 0) || (jSONPathSegment2 instanceof JSONPathSegment.EvalSegment) || ((jSONPathSegment2 instanceof JSONPathSegmentIndex) && ((JSONPathSegmentIndex) jSONPathSegment2).index < 0))) {
            z2 = false;
        }
        this.extractSupport = z2;
        if ((jSONPathSegment instanceof JSONPathSegment.CycleNameSegment) && ((JSONPathSegment.CycleNameSegment) jSONPathSegment).shouldRecursive() && (jSONPathSegment2 instanceof JSONPathFilter.NameFilter)) {
            ((JSONPathFilter.NameFilter) jSONPathSegment2).excludeArray();
        }
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean contains(Object obj) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.first, this.second, 0L);
        context.root = obj;
        this.first.eval(context);
        if (context.value == null) {
            return false;
        }
        return this.second.contains(new JSONPath.Context(this, context, this.second, null, 0L));
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean endsWithFilter() {
        return this.second instanceof JSONPathFilter;
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            JSONPathTwoSegment jSONPathTwoSegment = (JSONPathTwoSegment) obj;
            if (this.first.equals(jSONPathTwoSegment.first) && this.second.equals(jSONPathTwoSegment.second)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public Object eval(Object obj) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.first, this.second, 0L);
        context.root = obj;
        this.first.eval(context);
        if (context.value == null) {
            return null;
        }
        JSONPathSegment jSONPathSegment = this.first;
        if ((jSONPathSegment instanceof JSONPathSegment.CycleNameSegment) && ((JSONPathSegment.CycleNameSegment) jSONPathSegment).shouldRecursive()) {
            JSONPathSegment jSONPathSegment2 = this.second;
            if (jSONPathSegment2 instanceof JSONPathFilter.NameFilter) {
                ((JSONPathFilter.NameFilter) jSONPathSegment2).excludeArray();
            }
        }
        JSONPath.Context context2 = new JSONPath.Context(this, context, this.second, null, 0L);
        this.second.eval(context2);
        Object obj2 = context2.value;
        if ((this.features & JSONPath.Feature.AlwaysReturnList.mask) == 0) {
            return obj2;
        }
        if (obj2 == null) {
            return new JSONArray();
        }
        return !(obj2 instanceof List) ? JSONArray.of(obj2) : obj2;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public Object extract(JSONReader jSONReader) {
        if (jSONReader == null) {
            return null;
        }
        if (!this.extractSupport) {
            return eval(jSONReader.readAny());
        }
        JSONPath.Context context = new JSONPath.Context(this, null, this.first, this.second, 0L);
        this.first.accept(jSONReader, context);
        JSONPath.Context context2 = new JSONPath.Context(this, context, this.second, null, 0L);
        if (context.eval) {
            this.second.eval(context2);
        } else {
            this.second.accept(jSONReader, context2);
        }
        Object objOf = context2.value;
        if ((this.features & JSONPath.Feature.AlwaysReturnList.mask) != 0) {
            if (objOf == null) {
                objOf = new JSONArray();
            } else if (!(objOf instanceof List)) {
                objOf = JSONArray.of(objOf);
            }
        }
        return objOf instanceof JSONPath.Sequence ? ((JSONPath.Sequence) objOf).values : objOf;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public String extractScalar(JSONReader jSONReader) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.first, this.second, 0L);
        this.first.accept(jSONReader, context);
        JSONPath.Context context2 = new JSONPath.Context(this, context, this.second, null, 0L);
        this.second.accept(jSONReader, context2);
        return JSON.toJSONString(context2.value);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public JSONPath getParent() {
        return JSONPath.of(this.first);
    }

    public int hashCode() {
        return this.second.hashCode() + (this.first.hashCode() * 31);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean isRef() {
        return this.ref;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean remove(Object obj) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.first, this.second, 0L);
        context.root = obj;
        this.first.eval(context);
        if (context.value == null) {
            return false;
        }
        return this.second.remove(new JSONPath.Context(this, context, this.second, null, 0L));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    @Override // com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2) {
        Object jSONObject;
        Supplier<Map> supplier;
        JSONReader.Context readerContext;
        JSONPathSegment jSONPathSegment;
        FieldReader fieldReader;
        JSONPathSegment jSONPathSegment2;
        Supplier<List> supplier2;
        JSONPath.Context context = new JSONPath.Context(this, null, this.first, this.second, 0L);
        context.root = obj;
        this.first.eval(context);
        if (context.value == null) {
            JSONPathSegment jSONPathSegment3 = this.second;
            if (jSONPathSegment3 instanceof JSONPathSegmentIndex) {
                JSONReader.Context context2 = this.readerContext;
                jSONObject = (context2 == null || (supplier2 = context2.arraySupplier) == null) ? new JSONArray() : supplier2.get();
            } else {
                if (!(jSONPathSegment3 instanceof JSONPathSegmentName)) {
                    return;
                }
                JSONReader.Context context3 = this.readerContext;
                jSONObject = (context3 == null || (supplier = context3.objectSupplier) == null) ? new JSONObject() : supplier.get();
            }
            context.value = jSONObject;
            if (obj instanceof Map) {
                JSONPathSegment jSONPathSegment4 = this.first;
                if (jSONPathSegment4 instanceof JSONPathSegmentName) {
                    ((Map) obj).put(((JSONPathSegmentName) jSONPathSegment4).name, jSONObject);
                } else if (obj instanceof List) {
                    jSONPathSegment2 = this.first;
                    if (jSONPathSegment2 instanceof JSONPathSegmentIndex) {
                        ((List) obj).set(((JSONPathSegmentIndex) jSONPathSegment2).index, jSONObject);
                    } else if (true) {
                        Class<?> cls = obj.getClass();
                        readerContext = getReaderContext();
                        ObjectReader objectReader = readerContext.getObjectReader(cls);
                        jSONPathSegment = this.first;
                        if ((false) && (fieldReader = objectReader.getFieldReader(((JSONPathSegmentName) jSONPathSegment).nameHashCode)) != null) {
                            Object objCreateInstance = fieldReader.getObjectReader(readerContext).createInstance();
                            fieldReader.accept(obj, objCreateInstance);
                            context.value = objCreateInstance;
                        }
                    }
                } else if (true) {
                    Class<?> cls2 = obj.getClass();
                    readerContext = getReaderContext();
                    ObjectReader objectReader2 = readerContext.getObjectReader(cls2);
                    jSONPathSegment = this.first;
                    if (false) {
                        Object objCreateInstance2 = fieldReader.getObjectReader(readerContext).createInstance();
                        fieldReader.accept(obj, objCreateInstance2);
                        context.value = objCreateInstance2;
                    }
                }
            } else if (obj instanceof List) {
                jSONPathSegment2 = this.first;
                if (jSONPathSegment2 instanceof JSONPathSegmentIndex) {
                    ((List) obj).set(((JSONPathSegmentIndex) jSONPathSegment2).index, jSONObject);
                } else if (true) {
                    Class<?> cls3 = obj.getClass();
                    readerContext = getReaderContext();
                    ObjectReader objectReader3 = readerContext.getObjectReader(cls3);
                    jSONPathSegment = this.first;
                    if (jSONPathSegment instanceof JSONPathSegmentName) {
                        Object objCreateInstance3 = fieldReader.getObjectReader(readerContext).createInstance();
                        fieldReader.accept(obj, objCreateInstance3);
                        context.value = objCreateInstance3;
                    }
                }
            } else if (obj != null) {
                Class<?> cls4 = obj.getClass();
                readerContext = getReaderContext();
                ObjectReader objectReader4 = readerContext.getObjectReader(cls4);
                jSONPathSegment = this.first;
                if (jSONPathSegment instanceof JSONPathSegmentName) {
                    Object objCreateInstance4 = fieldReader.getObjectReader(readerContext).createInstance();
                    fieldReader.accept(obj, objCreateInstance4);
                    context.value = objCreateInstance4;
                }
            }
        }
        this.second.set(new JSONPath.Context(this, context, this.second, null, 0L), obj2);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setCallback(Object obj, BiFunction biFunction) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.first, this.second, 0L);
        context.root = obj;
        this.first.eval(context);
        if (context.value == null) {
            return;
        }
        this.second.setCallback(new JSONPath.Context(this, context, this.second, null, 0L), biFunction);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setInt(Object obj, int i) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.first, this.second, 0L);
        context.root = obj;
        this.first.eval(context);
        if (context.value == null) {
            return;
        }
        this.second.setInt(new JSONPath.Context(this, context, this.second, null, 0L), i);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setLong(Object obj, long j) {
        JSONPath.Context context = new JSONPath.Context(this, null, this.first, this.second, 0L);
        context.root = obj;
        this.first.eval(context);
        if (context.value == null) {
            return;
        }
        this.second.setLong(new JSONPath.Context(this, context, this.second, null, 0L), j);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2, JSONReader.Feature... featureArr) {
        long j = 0;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
        }
        JSONPath.Context context = new JSONPath.Context(this, null, this.first, this.second, j);
        context.root = obj;
        this.first.eval(context);
        if (context.value == null) {
            return;
        }
        this.second.set(new JSONPath.Context(this, context, this.second, null, j), obj2);
    }
}
