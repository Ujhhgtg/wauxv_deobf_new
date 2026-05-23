package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONPathSegment;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class JSONPathSegmentName extends JSONPathSegment {
    static final long HASH_NAME = Fnv.hashCode64("name");
    static final long HASH_ORDINAL = Fnv.hashCode64("ordinal");
    final String name;
    final long nameHashCode;

    public JSONPathSegmentName(String str, long j) {
        this.name = str;
        this.nameHashCode = j;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0150  */
    /* JADX WARN: Code duplicated, block: B:113:0x0173  */
    /* JADX WARN: Code duplicated, block: B:162:0x0212  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if ((r3 instanceof com.alibaba.fastjson2.JSONPathSegment.MultiIndexSegment) == false) goto L12;
     */
    @Override // com.alibaba.fastjson2.JSONPathSegment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(JSONReader jSONReader, JSONPath.Context context) {
        JSONPath.Context context2;
        Object string;
        Object string2;
        JSONPath.Context context3;
        JSONPath.Context context4 = context.parent;
        if (context4 != null) {
            if (!context4.eval) {
                JSONPathSegment jSONPathSegment = context4.current;
                if (!(jSONPathSegment instanceof JSONPathFilter)) {
                }
            }
            eval(context);
            return;
        }
        if (jSONReader.jsonb) {
            if (jSONReader.nextIfObjectStart()) {
                while (!jSONReader.nextIfObjectEnd()) {
                    long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                    if (fieldNameHashCode != 0) {
                        if (fieldNameHashCode == this.nameHashCode) {
                            if ((jSONReader.isArray() || jSONReader.isObject()) && context.next != null) {
                                return;
                            }
                            context.value = jSONReader.readAny();
                            context.eval = true;
                            return;
                        }
                        jSONReader.skipValue();
                    }
                }
                return;
            }
            if (!jSONReader.isArray() || (context3 = context.parent) == null || !(context3.current instanceof JSONPathSegment.AllSegment)) {
                throw new JSONException("TODO");
            }
            JSONArray jSONArray = new JSONArray();
            int iStartArray = jSONReader.startArray();
            for (int i = 0; i < iStartArray; i++) {
                if (jSONReader.nextIfMatch(-90)) {
                    while (!jSONReader.nextIfMatch(-91)) {
                        if (jSONReader.readFieldNameHashCode() != this.nameHashCode) {
                            jSONReader.skipValue();
                        } else if ((jSONReader.isArray() || jSONReader.isObject()) && context.next != null) {
                            break;
                        } else {
                            jSONArray.add(jSONReader.readAny());
                        }
                    }
                } else {
                    jSONReader.skipValue();
                }
            }
            context.value = jSONArray;
            context.eval = true;
            return;
        }
        char c = '}';
        char c2 = '{';
        if (jSONReader.nextIfObjectStart()) {
            if (jSONReader.ch == '}') {
                jSONReader.next();
                if (jSONReader.isEnd()) {
                    return;
                } else {
                    jSONReader.nextIfComma();
                }
            }
            while (!jSONReader.nextIfObjectEnd()) {
                if (jSONReader.readFieldNameHashCode() == this.nameHashCode) {
                    char c3 = jSONReader.ch;
                    if (c3 == '\"' || c3 == '\'') {
                        string2 = jSONReader.readString();
                    } else if (c3 == '+' || c3 == '-') {
                        jSONReader.readNumber0();
                        string2 = jSONReader.getNumber();
                    } else if (c3 == '[') {
                        JSONPathSegment jSONPathSegment2 = context.next;
                        if (jSONPathSegment2 != null && !(jSONPathSegment2 instanceof JSONPathSegment.EvalSegment) && !(jSONPathSegment2 instanceof JSONPathSegmentName) && !(jSONPathSegment2 instanceof JSONPathSegment.AllSegment)) {
                            return;
                        }
                        string2 = jSONReader.readArray();
                        context.eval = true;
                    } else if (c3 == 'f') {
                        string2 = Boolean.valueOf(jSONReader.readBoolValue());
                    } else if (c3 == 'n') {
                        jSONReader.readNull();
                        string2 = null;
                    } else if (c3 == 't') {
                        string2 = Boolean.valueOf(jSONReader.readBoolValue());
                    } else if (c3 != '{') {
                        switch (c3) {
                            case '0':
                            case '1':
                            case 50 /* 50 */:
                            case 51 /* 51 */:
                            case '4':
                            case 53 /* 53 */:
                            case 54 /* 54 */:
                            case 55 /* 55 */:
                            case 56 /* 56 */:
                            case 57 /* 57 */:
                                jSONReader.readNumber0();
                                string2 = jSONReader.getNumber();
                                break;
                            default:
                                throw new JSONException("TODO : " + jSONReader.ch);
                        }
                    } else {
                        JSONPathSegment jSONPathSegment3 = context.next;
                        if (jSONPathSegment3 != null && !(jSONPathSegment3 instanceof JSONPathSegment.EvalSegment) && !(jSONPathSegment3 instanceof JSONPathSegment.AllSegment)) {
                            return;
                        }
                        string2 = jSONReader.readObject();
                        context.eval = true;
                    }
                    context.value = string2;
                    return;
                }
                jSONReader.skipValue();
                if (jSONReader.ch == ',') {
                    jSONReader.next();
                }
            }
            jSONReader.next();
            return;
        }
        if (jSONReader.ch == '[' && (context2 = context.parent) != null && (context2.current instanceof JSONPathSegment.AllSegment)) {
            jSONReader.next();
            JSONArray jSONArray2 = new JSONArray();
            while (true) {
                char c4 = jSONReader.ch;
                if (c4 != 26) {
                    if (c4 == ']') {
                        jSONReader.next();
                    } else {
                        if (c4 == c2) {
                            jSONReader.next();
                            while (true) {
                                if (jSONReader.ch == c) {
                                    jSONReader.next();
                                } else {
                                    if (jSONReader.readFieldNameHashCode() == this.nameHashCode) {
                                        char c5 = jSONReader.ch;
                                        if (c5 == '\"' || c5 == '\'') {
                                            string = jSONReader.readString();
                                        } else {
                                            if (c5 != '+') {
                                                if (c5 != '[') {
                                                    if (c5 == 'f') {
                                                        string = Boolean.valueOf(jSONReader.readBoolValue());
                                                    } else if (c5 == 'n') {
                                                        jSONReader.readNull();
                                                        string = null;
                                                    } else if (c5 == 't') {
                                                        string = Boolean.valueOf(jSONReader.readBoolValue());
                                                    } else if (c5 != '{') {
                                                        if (c5 != '-' && c5 != '.') {
                                                            switch (c5) {
                                                                case '0':
                                                                case '1':
                                                                case 50 /* 50 */:
                                                                case 51 /* 51 */:
                                                                case '4':
                                                                case 53 /* 53 */:
                                                                case 54 /* 54 */:
                                                                case 55 /* 55 */:
                                                                case 56 /* 56 */:
                                                                case 57 /* 57 */:
                                                                    break;
                                                                default:
                                                                    throw new JSONException("TODO : " + jSONReader.ch);
                                                            }
                                                        }
                                                    } else if (context.next == null) {
                                                        string = jSONReader.readObject();
                                                    }
                                                } else if (context.next == null) {
                                                    string = jSONReader.readArray();
                                                }
                                            }
                                            jSONReader.readNumber0();
                                            string = jSONReader.getNumber();
                                        }
                                        jSONArray2.add(string);
                                    } else {
                                        jSONReader.skipValue();
                                        if (jSONReader.ch == ',') {
                                            jSONReader.next();
                                        }
                                    }
                                    c = '}';
                                }
                            }
                        } else {
                            jSONReader.skipValue();
                        }
                        if (jSONReader.ch == ',') {
                            jSONReader.next();
                        }
                        c = '}';
                        c2 = '{';
                    }
                }
            }
            context.value = jSONArray2;
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public boolean contains(JSONPath.Context context) {
        FieldWriter fieldWriter;
        FieldWriter fieldWriter2;
        FieldWriter fieldWriter3;
        FieldWriter fieldWriter4;
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(this.name);
        }
        if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                if (obj2 != null) {
                    if ((obj2 instanceof Map) && ((Map) obj2).get(this.name) != null) {
                        return true;
                    }
                    ObjectWriter objectWriter = context.path.getWriterContext().getObjectWriter(obj2.getClass());
                    if ((objectWriter instanceof ObjectWriterAdapter) && (fieldWriter4 = objectWriter.getFieldWriter(this.nameHashCode)) != null && fieldWriter4.getFieldValue(obj2) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (obj instanceof JSONPath.Sequence) {
            for (Object obj3 : ((JSONPath.Sequence) obj).values) {
                if (obj3 != null) {
                    if ((obj3 instanceof Map) && ((Map) obj3).get(this.name) != null) {
                        return true;
                    }
                    ObjectWriter objectWriter2 = context.path.getWriterContext().getObjectWriter(obj3.getClass());
                    if ((objectWriter2 instanceof ObjectWriterAdapter) && (fieldWriter3 = objectWriter2.getFieldWriter(this.nameHashCode)) != null && fieldWriter3.getFieldValue(obj3) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (obj instanceof Object[]) {
            for (Object obj4 : (Object[]) obj) {
                if (obj4 != null) {
                    if ((obj4 instanceof Map) && ((Map) obj4).get(this.name) != null) {
                        return true;
                    }
                    ObjectWriter objectWriter3 = context.path.getWriterContext().getObjectWriter(obj4.getClass());
                    if ((objectWriter3 instanceof ObjectWriterAdapter) && (fieldWriter2 = objectWriter3.getFieldWriter(this.nameHashCode)) != null && fieldWriter2.getFieldValue(obj4) != null) {
                        return true;
                    }
                }
            }
        }
        ObjectWriter objectWriter4 = context.path.getWriterContext().getObjectWriter(obj.getClass());
        return (!(objectWriter4 instanceof ObjectWriterAdapter) || (fieldWriter = objectWriter4.getFieldWriter(this.nameHashCode)) == null || fieldWriter.getFieldValue(obj) == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            JSONPathSegmentName jSONPathSegmentName = (JSONPathSegmentName) obj;
            if (this.nameHashCode == jSONPathSegmentName.nameHashCode && Objects.equals(this.name, jSONPathSegmentName.name)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void eval(JSONPath.Context context) {
        Object obj;
        JSONPath.Context context2 = context.parent;
        Object obj2 = context2 == null ? context.root : context2.value;
        if (obj2 == null) {
            return;
        }
        Collection jSONArray = null;
        Long lValueOf = null;
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object value = map.get(this.name);
            if (value == null) {
                boolean zIsNumber = IOUtils.isNumber(this.name);
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if ((key instanceof Enum) && ((Enum) key).name().equals(this.name)) {
                        value = entry.getValue();
                        break;
                    } else if (key instanceof Long) {
                        if (lValueOf == null && zIsNumber) {
                            lValueOf = Long.valueOf(Long.parseLong(this.name));
                        }
                        if (key.equals(lValueOf)) {
                            value = entry.getValue();
                            break;
                        }
                    }
                }
            }
            context.value = value;
            return;
        }
        if (obj2 instanceof Collection) {
            Collection collection = (Collection) obj2;
            int size = collection.size();
            for (Object obj3 : collection) {
                if ((obj3 instanceof Map) && (obj = ((Map) obj3).get(this.name)) != null) {
                    if (!(obj instanceof Collection)) {
                        if (jSONArray == null) {
                            jSONArray = new JSONArray(size);
                        }
                        jSONArray.add(obj);
                    } else if (size == 1) {
                        jSONArray = (Collection) obj;
                    } else {
                        if (jSONArray == null) {
                            jSONArray = new JSONArray(size);
                        }
                        jSONArray.addAll((Collection) obj);
                    }
                }
            }
            context.value = jSONArray;
            return;
        }
        if (obj2 instanceof JSONPath.Sequence) {
            List list = ((JSONPath.Sequence) obj2).values;
            JSONArray jSONArray2 = new JSONArray(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                context.value = it.next();
                JSONPath.Context context3 = context;
                JSONPath.Context context4 = new JSONPath.Context(context.path, context3, context.current, context.next, context.readerFeatures);
                eval(context4);
                Object obj4 = context4.value;
                if (obj4 != null || (context3.path.features & JSONPath.Feature.KeepNullValue.mask) != 0) {
                    if (obj4 instanceof Collection) {
                        jSONArray2.addAll((Collection) obj4);
                    } else {
                        jSONArray2.add(obj4);
                    }
                }
                context = context3;
            }
            JSONPath.Context context5 = context;
            if (context5.next != null) {
                context5.value = new JSONPath.Sequence(jSONArray2);
            } else {
                context5.value = jSONArray2;
            }
            context5.eval = true;
            return;
        }
        ObjectWriter objectWriter = context.path.getWriterContext().getObjectWriter(obj2.getClass());
        if (objectWriter instanceof ObjectWriterAdapter) {
            FieldWriter fieldWriter = objectWriter.getFieldWriter(this.nameHashCode);
            if (fieldWriter != null) {
                context.value = fieldWriter.getFieldValue(obj2);
                return;
            }
            return;
        }
        long j = this.nameHashCode;
        if (j == HASH_NAME && (obj2 instanceof Enum)) {
            context.value = ((Enum) obj2).name();
            return;
        }
        if (j == HASH_ORDINAL && (obj2 instanceof Enum)) {
            context.value = Integer.valueOf(((Enum) obj2).ordinal());
            return;
        }
        if (!(obj2 instanceof String)) {
            if (!(obj2 instanceof Number) && !(obj2 instanceof Boolean)) {
                throw new JSONException(AbstractC1194.m2783(obj2, new StringBuilder("not support : ")));
            }
            context.value = null;
            return;
        }
        String str = (String) obj2;
        if (str.isEmpty() || str.charAt(0) != '{') {
            context.value = null;
            return;
        }
        context.value = JSONPath.of("$." + this.name).extract(JSONReader.of(str));
    }

    public int hashCode() {
        return Objects.hash(this.name, Long.valueOf(this.nameHashCode));
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public boolean remove(JSONPath.Context context) {
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (obj instanceof Map) {
            ((Map) obj).remove(this.name);
            context.eval = true;
            return true;
        }
        if (!(obj instanceof Collection)) {
            FieldReader fieldReader = context.path.getReaderContext().getProvider().getObjectReader(obj.getClass()).getFieldReader(this.nameHashCode);
            if (fieldReader != null) {
                fieldReader.accept(obj, (Object) null);
            }
            context.eval = true;
            return true;
        }
        for (Object obj2 : (Collection) obj) {
            if (obj2 != null) {
                if (obj2 instanceof Map) {
                    ((Map) obj2).remove(this.name);
                } else {
                    FieldReader fieldReader2 = context.path.getReaderContext().getProvider().getObjectReader(obj2.getClass()).getFieldReader(this.nameHashCode);
                    if (fieldReader2 != null) {
                        fieldReader2.accept(obj2, (Object) null);
                    }
                }
            }
        }
        context.eval = true;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void set(JSONPath.Context context, Object obj) {
        Class<?> cls;
        Class<?> cls2;
        Function typeConvert;
        JSONPath.Context context2 = context.parent;
        Object obj2 = context2 == null ? context.root : context2.value;
        if (obj2 instanceof JSONPath.Sequence) {
            obj2 = ((JSONPath.Sequence) obj2).values;
        }
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object objPut = map.put(this.name, obj);
            if (objPut == null || (context.readerFeatures & JSONReader.Feature.DuplicateKeyValueAsArray.mask) == 0) {
                return;
            }
            if (!(objPut instanceof Collection)) {
                map.put(this.name, JSONArray.of(objPut, obj));
                return;
            } else {
                ((Collection) objPut).add(obj);
                map.put(this.name, obj);
                return;
            }
        }
        if (!(obj2 instanceof Collection)) {
            ObjectReaderProvider provider = context.path.getReaderContext().getProvider();
            FieldReader fieldReader = provider.getObjectReader(obj2.getClass()).getFieldReader(this.nameHashCode);
            if (fieldReader == null) {
                return;
            }
            if (obj != null && (cls = obj.getClass()) != (cls2 = fieldReader.fieldClass) && (typeConvert = provider.getTypeConvert(cls, cls2)) != null) {
                obj = typeConvert.apply(obj);
            }
            fieldReader.accept(obj2, obj);
            return;
        }
        for (Object obj3 : (Collection) obj2) {
            if (obj3 != null) {
                if (obj3 instanceof Map) {
                    Map map2 = (Map) obj3;
                    Object objPut2 = map2.put(this.name, obj);
                    if (objPut2 != null && (context.readerFeatures & JSONReader.Feature.DuplicateKeyValueAsArray.mask) != 0) {
                        if (objPut2 instanceof Collection) {
                            ((Collection) objPut2).add(obj);
                            map2.put(this.name, obj);
                        } else {
                            map2.put(this.name, JSONArray.of(objPut2, obj));
                        }
                    }
                } else {
                    FieldReader fieldReader2 = context.path.getReaderContext().getProvider().getObjectReader(obj3.getClass()).getFieldReader(this.nameHashCode);
                    if (fieldReader2 != null) {
                        fieldReader2.accept(obj3, obj);
                    }
                }
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void setCallback(JSONPath.Context context, BiFunction biFunction) {
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(this.name);
            if (obj2 != null) {
                map.put(this.name, biFunction.apply(map, obj2));
                return;
            }
            return;
        }
        ObjectReader objectReader = context.path.getReaderContext().getProvider().getObjectReader(obj.getClass());
        ObjectWriter objectWriter = context.path.getWriterContext().provider.getObjectWriter((Class) obj.getClass());
        FieldReader fieldReader = objectReader.getFieldReader(this.nameHashCode);
        FieldWriter fieldWriter = objectWriter.getFieldWriter(this.nameHashCode);
        if (fieldReader == null || fieldWriter == null) {
            return;
        }
        fieldReader.accept(obj, biFunction.apply(obj, fieldWriter.getFieldValue(obj)));
    }

    public String toString() {
        return this.name;
    }
}
