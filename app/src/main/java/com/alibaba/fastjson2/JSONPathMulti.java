package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONPathFilter;
import com.alibaba.fastjson2.JSONPathSegment;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathMulti extends JSONPath {
    final boolean extractSupport;
    final boolean ref;
    final List<JSONPathSegment> segments;

    public JSONPathMulti(String str, List<JSONPathSegment> list, JSONPath.Feature... featureArr) {
        super(str, featureArr);
        this.segments = list;
        int size = list.size();
        boolean z = true;
        boolean z2 = true;
        for (int i = 0; i < size - 1; i++) {
            JSONPathSegment jSONPathSegment = list.get(i);
            if (!(jSONPathSegment instanceof JSONPathSegmentIndex)) {
                if (!(jSONPathSegment instanceof JSONPathSegmentName)) {
                    if (i > 0) {
                        JSONPathSegment jSONPathSegment2 = list.get(i - 1);
                        if ((jSONPathSegment2 instanceof JSONPathSegment.CycleNameSegment) && ((JSONPathSegment.CycleNameSegment) jSONPathSegment2).shouldRecursive() && (jSONPathSegment instanceof JSONPathFilter.NameFilter)) {
                            ((JSONPathFilter.NameFilter) jSONPathSegment).excludeArray();
                        }
                    }
                    z = false;
                    break;
                }
            } else if (((JSONPathSegmentIndex) jSONPathSegment).index < 0) {
                z2 = false;
            }
        }
        this.extractSupport = z2;
        this.ref = z;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean contains(Object obj) {
        int size = this.segments.size();
        if (size == 0) {
            return obj != null;
        }
        int i = 0;
        JSONPath.Context context = null;
        while (i < size) {
            JSONPathSegment jSONPathSegment = this.segments.get(i);
            int i2 = i + 1;
            JSONPath.Context context2 = new JSONPath.Context(this, context, jSONPathSegment, i2 < size ? this.segments.get(i2) : null, 0L);
            if (i == 0) {
                context2.root = obj;
            }
            if (i == size - 1) {
                return jSONPathSegment.contains(context2);
            }
            jSONPathSegment.eval(context2);
            context = context2;
            i = i2;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean endsWithFilter() {
        return this.segments.get(this.segments.size() - 1) instanceof JSONPathFilter;
    }

    public boolean equals(Object obj) {
        if (obj == null || JSONPathMulti.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.segments, ((JSONPathMulti) obj).segments);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public Object eval(Object obj) {
        int size = this.segments.size();
        if (size == 0) {
            return obj;
        }
        int i = 0;
        JSONPath.Context context = null;
        while (i < size) {
            JSONPathSegment jSONPathSegment = this.segments.get(i);
            int i2 = i + 1;
            JSONPath.Context context2 = new JSONPath.Context(this, context, jSONPathSegment, i2 < size ? this.segments.get(i2) : null, 0L);
            if (i == 0) {
                context2.root = obj;
            }
            if (i > 0) {
                JSONPathSegment jSONPathSegment2 = this.segments.get(i - 1);
                if ((jSONPathSegment2 instanceof JSONPathSegment.CycleNameSegment) && ((JSONPathSegment.CycleNameSegment) jSONPathSegment2).shouldRecursive() && (jSONPathSegment instanceof JSONPathFilter.NameFilter)) {
                    ((JSONPathFilter.NameFilter) jSONPathSegment).excludeArray();
                }
            }
            jSONPathSegment.eval(context2);
            context = context2;
            i = i2;
        }
        Object obj2 = context.value;
        if ((context.path.features & JSONPath.Feature.AlwaysReturnList.mask) == 0) {
            return obj2;
        }
        if (obj2 == null) {
            return new JSONArray();
        }
        return !(obj2 instanceof List) ? JSONArray.of(obj2) : obj2;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public Object extract(JSONReader jSONReader) {
        int size;
        JSONPathMulti jSONPathMulti;
        if (jSONReader == null || (size = this.segments.size()) == 0) {
            return null;
        }
        if (!this.extractSupport) {
            return eval(jSONReader.readAny());
        }
        int i = 0;
        JSONPath.Context context = null;
        boolean z = false;
        while (true) {
            if (i >= size) {
                jSONPathMulti = this;
                break;
            }
            JSONPathSegment jSONPathSegment = this.segments.get(i);
            i++;
            jSONPathMulti = this;
            JSONPath.Context context2 = new JSONPath.Context(jSONPathMulti, context, jSONPathSegment, i < size ? this.segments.get(i) : null, 0L);
            if (z) {
                jSONPathSegment.eval(context2);
            } else {
                jSONPathSegment.accept(jSONReader, context2);
            }
            if (context2.eval) {
                if (context2.value == null) {
                    context = context2;
                    break;
                }
                z = true;
            }
            context = context2;
        }
        Object obj = context.value;
        if (obj instanceof JSONPath.Sequence) {
            obj = ((JSONPath.Sequence) obj).values;
        }
        if ((jSONPathMulti.features & JSONPath.Feature.AlwaysReturnList.mask) == 0) {
            return obj;
        }
        if (obj == null) {
            return new JSONArray();
        }
        return !(obj instanceof List) ? JSONArray.of(obj) : obj;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public String extractScalar(JSONReader jSONReader) {
        int size = this.segments.size();
        if (size == 0) {
            return null;
        }
        int i = 0;
        JSONPath.Context context = null;
        boolean z = false;
        while (i < size) {
            JSONPathSegment jSONPathSegment = this.segments.get(i);
            i++;
            JSONPath.Context context2 = new JSONPath.Context(this, context, jSONPathSegment, i < size ? this.segments.get(i) : null, 0L);
            if (z) {
                jSONPathSegment.eval(context2);
            } else {
                jSONPathSegment.accept(jSONReader, context2);
            }
            if (context2.eval) {
                if (context2.value == null) {
                    context = context2;
                    break;
                }
                z = true;
            }
            context = context2;
        }
        return JSON.toJSONString(context.value);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public JSONPath getParent() {
        int size = this.segments.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return JSONPath.RootPath.INSTANCE;
        }
        if (size == 2) {
            return JSONPath.of(this.segments.get(0));
        }
        StringBuilder sb = new StringBuilder("$");
        int i = size - 1;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            JSONPathSegment jSONPathSegment = this.segments.get(i2);
            arrayList.add(jSONPathSegment);
            if (!(jSONPathSegment instanceof JSONPathSegmentIndex) && !(jSONPathSegment instanceof JSONPathSegment.MultiIndexSegment) && !(jSONPathSegment instanceof JSONPathFilter)) {
                sb.append('.');
            }
            sb.append(jSONPathSegment);
        }
        String string = sb.toString();
        if (size == 3) {
            new JSONPathTwoSegment(string, this.segments.get(0), this.segments.get(1), new JSONPath.Feature[0]);
        }
        return new JSONPathMulti(string, arrayList, new JSONPath.Feature[0]);
    }

    public int hashCode() {
        return Objects.hashCode(this.segments);
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean isRef() {
        return this.ref;
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public boolean remove(Object obj) {
        int size = this.segments.size();
        if (size == 0) {
            return false;
        }
        int i = 0;
        JSONPath.Context context = null;
        while (i < size) {
            JSONPathSegment jSONPathSegment = this.segments.get(i);
            int i2 = i + 1;
            JSONPath.Context context2 = new JSONPath.Context(this, context, jSONPathSegment, i2 < size ? this.segments.get(i2) : null, 0L);
            if (i == 0) {
                context2.root = obj;
            }
            if (i == size - 1) {
                return jSONPathSegment.remove(context2);
            }
            jSONPathSegment.eval(context2);
            if (context2.value == null) {
                return false;
            }
            context = context2;
            i = i2;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    @Override // com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2) {
        Class itemClass;
        Object objCreateInstance;
        FieldReader fieldReader;
        int size = this.segments.size();
        JSONPath.Context context = null;
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (i >= i2) {
                JSONPath.Context context2 = new JSONPath.Context(this, context, this.segments.get(0), null, 0L);
                context2.root = obj;
                this.segments.get(i2).set(context2, obj2);
                return;
            }
            JSONPathSegment jSONPathSegment = this.segments.get(i);
            int i3 = i + 1;
            JSONPathSegment jSONPathSegment2 = i3 < size ? this.segments.get(i3) : null;
            JSONPath.Context context3 = new JSONPath.Context(this, context, jSONPathSegment, jSONPathSegment2, 0L);
            if (i == 0) {
                context3.root = obj;
            }
            jSONPathSegment.eval(context3);
            if (context3.value == null && jSONPathSegment2 != null) {
                Object obj3 = i == 0 ? obj : context3.parent.value;
                if (jSONPathSegment2 instanceof JSONPathSegmentIndex) {
                    objCreateInstance = new JSONArray();
                } else {
                    if (!(jSONPathSegment2 instanceof JSONPathSegmentName)) {
                        return;
                    }
                    JSONPath.Context context4 = context3.parent;
                    if (context4 == null) {
                        context4 = context3;
                    }
                    JSONPath.Context context5 = context4.parent;
                    Object obj4 = context5 == null ? context4.root : context5.value;
                    if (obj4 != null) {
                        JSONPathSegment jSONPathSegment3 = context4.current;
                        if (jSONPathSegment3 instanceof JSONPathSegmentName) {
                            FieldReader fieldReader2 = getReaderContext().getObjectReader(obj4.getClass()).getFieldReader(((JSONPathSegmentName) jSONPathSegment3).name);
                            if (fieldReader2 != null) {
                                itemClass = fieldReader2.getItemClass();
                            } else {
                                itemClass = null;
                            }
                        } else {
                            itemClass = null;
                        }
                    } else {
                        itemClass = null;
                    }
                    objCreateInstance = itemClass != null ? this.readerContext.getObjectReader(itemClass).createInstance(0L) : new JSONObject();
                }
                context3.value = objCreateInstance;
                if ((obj3 instanceof Map) && (jSONPathSegment instanceof JSONPathSegmentName)) {
                    ((Map) obj3).put(((JSONPathSegmentName) jSONPathSegment).name, objCreateInstance);
                } else if ((obj3 instanceof List) && (jSONPathSegment instanceof JSONPathSegmentIndex)) {
                    List list = (List) obj3;
                    int i4 = ((JSONPathSegmentIndex) jSONPathSegment).index;
                    if (i4 >= list.size()) {
                        int size2 = i4 - list.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            list.add(null);
                        }
                        list.add(objCreateInstance);
                    } else {
                        list.set(i4, objCreateInstance);
                    }
                } else if (obj3 != null) {
                    Class<?> cls = obj3.getClass();
                    JSONReader.Context readerContext = getReaderContext();
                    ObjectReader objectReader = readerContext.getObjectReader(cls);
                    if ((jSONPathSegment instanceof JSONPathSegmentName) && (fieldReader = objectReader.getFieldReader(((JSONPathSegmentName) jSONPathSegment).nameHashCode)) != null) {
                        Object objCreateInstance2 = fieldReader.getObjectReader(readerContext).createInstance();
                        fieldReader.accept(obj3, objCreateInstance2);
                        context3.value = objCreateInstance2;
                    }
                }
            }
            context = context3;
            i = i3;
        }
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setCallback(Object obj, BiFunction biFunction) {
        int size = this.segments.size();
        JSONPath.Context context = null;
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (i >= i2) {
                JSONPath.Context context2 = new JSONPath.Context(this, context, this.segments.get(0), null, 0L);
                context2.root = obj;
                this.segments.get(i2).setCallback(context2, biFunction);
                return;
            }
            JSONPathSegment jSONPathSegment = this.segments.get(i);
            int i3 = i + 1;
            JSONPath.Context context3 = new JSONPath.Context(this, context, jSONPathSegment, i3 < size ? this.segments.get(i3) : null, 0L);
            if (i == 0) {
                context3.root = obj;
            }
            jSONPathSegment.eval(context3);
            context = context3;
            i = i3;
        }
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setInt(Object obj, int i) {
        set(obj, Integer.valueOf(i));
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void setLong(Object obj, long j) {
        set(obj, Long.valueOf(j));
    }

    @Override // com.alibaba.fastjson2.JSONPath
    public void set(Object obj, Object obj2, JSONReader.Feature... featureArr) {
        long j = 0;
        for (JSONReader.Feature feature : featureArr) {
            j |= feature.mask;
        }
        int size = this.segments.size();
        JSONPath.Context context = null;
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (i < i2) {
                JSONPathSegment jSONPathSegment = this.segments.get(i);
                int i3 = i + 1;
                JSONPath.Context context2 = new JSONPath.Context(this, context, jSONPathSegment, i3 < size ? this.segments.get(i3) : null, j);
                if (i == 0) {
                    context2.root = obj;
                }
                jSONPathSegment.eval(context2);
                i = i3;
                context = context2;
            } else {
                JSONPath.Context context3 = new JSONPath.Context(this, context, this.segments.get(0), null, j);
                context3.root = obj;
                this.segments.get(i2).set(context3, obj2);
                return;
            }
        }
    }
}
