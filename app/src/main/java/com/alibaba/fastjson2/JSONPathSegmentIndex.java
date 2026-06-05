package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONPathSegment;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathSegmentIndex extends JSONPathSegment {
    final int index;
    static final JSONPathSegmentIndex ZERO = new JSONPathSegmentIndex(0);
    static final JSONPathSegmentIndex ONE = new JSONPathSegmentIndex(1);
    static final JSONPathSegmentIndex TWO = new JSONPathSegmentIndex(2);
    static final JSONPathSegmentIndex LAST = new JSONPathSegmentIndex(-1);

    public JSONPathSegmentIndex(int i) {
        this.index = i;
    }

    public static JSONPathSegmentIndex of(int i) {
        if (i == 0) {
            return ZERO;
        }
        if (i == 1) {
            return ONE;
        }
        if (i == 2) {
            return TWO;
        }
        return i == -1 ? LAST : new JSONPathSegmentIndex(i);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void accept(JSONReader jSONReader, JSONPath.Context context) {
        Object string;
        JSONPath.Context context2 = context.parent;
        if (context2 != null && (context2.eval || ((context2.current instanceof JSONPathSegment.CycleNameSegment) && context.next == null))) {
            eval(context);
            return;
        }
        int i = 0;
        if (jSONReader.jsonb) {
            int iStartArray = jSONReader.startArray();
            while (i < iStartArray) {
                if (this.index == i) {
                    if ((jSONReader.isArray() || jSONReader.isObject()) && context.next != null) {
                        return;
                    }
                    context.value = jSONReader.readAny();
                    context.eval = true;
                    return;
                }
                jSONReader.skipValue();
                i++;
            }
            return;
        }
        if (jSONReader.ch == '{') {
            context.value = eval(jSONReader.readObject());
            context.eval = true;
            return;
        }
        jSONReader.next();
        while (true) {
            char c = jSONReader.ch;
            if (c == 26) {
                return;
            }
            if (c == ']') {
                jSONReader.next();
                context.eval = true;
                return;
            }
            int i2 = this.index;
            if (i2 == -1 || i2 == i) {
                if (c == '\"' || c == '\'') {
                    string = jSONReader.readString();
                } else if (c == '+') {
                    jSONReader.readNumber0();
                    string = jSONReader.getNumber();
                } else if (c == '[') {
                    JSONPathSegment jSONPathSegment = context.next;
                    if (jSONPathSegment != null && !(jSONPathSegment instanceof JSONPathSegment.EvalSegment)) {
                        return;
                    } else {
                        string = jSONReader.readArray();
                    }
                } else if (c == 'f') {
                    string = Boolean.valueOf(jSONReader.readBoolValue());
                } else if (c == 'n') {
                    jSONReader.readNull();
                    string = null;
                } else if (c == 't') {
                    string = Boolean.valueOf(jSONReader.readBoolValue());
                } else if (c != '{') {
                    if (c != '-' && c != '.') {
                        switch (c) {
                            case '0':
                            case '1':
                            case Opcodes.AALOAD /* 50 */:
                            case Opcodes.BALOAD /* 51 */:
                            case '4':
                            case Opcodes.SALOAD /* 53 */:
                            case Opcodes.ISTORE /* 54 */:
                            case Opcodes.LSTORE /* 55 */:
                            case Opcodes.FSTORE /* 56 */:
                            case Opcodes.DSTORE /* 57 */:
                                break;
                            default:
                                throw new JSONException(jSONReader.info("not support : " + jSONReader.ch));
                        }
                    }
                    jSONReader.readNumber0();
                    string = jSONReader.getNumber();
                } else {
                    JSONPathSegment jSONPathSegment2 = context.next;
                    if (jSONPathSegment2 != null && !(jSONPathSegment2 instanceof JSONPathSegment.EvalSegment)) {
                        return;
                    } else {
                        string = jSONReader.readObject();
                    }
                }
                if (this.index != -1) {
                    context.value = string;
                } else if (jSONReader.ch == ']') {
                    context.value = string;
                }
            } else {
                jSONReader.skipValue();
                if (jSONReader.ch == ',') {
                    jSONReader.next();
                }
            }
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void eval(JSONPath.Context context) {
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (obj == null) {
            context.eval = true;
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int i = this.index;
            if (i < 0) {
                int size = list.size() + this.index;
                if (size >= 0 && size < list.size()) {
                    context.value = list.get(size);
                }
            } else if (i < list.size()) {
                context.value = list.get(this.index);
            }
            context.eval = true;
            return;
        }
        if ((obj instanceof SortedSet) || (obj instanceof LinkedHashSet) || (obj instanceof Queue) || (this.index == 0 && (obj instanceof Collection) && ((Collection) obj).size() == 1)) {
            int i2 = 0;
            for (Object obj2 : (Collection) obj) {
                if (i2 == this.index) {
                    context.value = obj2;
                    break;
                }
                i2++;
            }
            context.eval = true;
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int i3 = this.index;
            if (i3 < 0) {
                int length = objArr.length + i3;
                if (length >= 0 && length < objArr.length) {
                    context.value = objArr[length];
                }
            } else if (i3 < objArr.length) {
                context.value = objArr[i3];
            }
            context.eval = true;
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            int length2 = Array.getLength(obj);
            int i4 = this.index;
            if (i4 < 0) {
                int i5 = i4 + length2;
                if (i5 >= 0 && i5 < length2) {
                    context.value = Array.get(obj, i5);
                }
            } else if (i4 < length2) {
                context.value = Array.get(obj, i4);
            }
            context.eval = true;
            return;
        }
        if (!(obj instanceof JSONPath.Sequence)) {
            if (Map.class.isAssignableFrom(cls)) {
                context.value = eval((Map) obj);
                context.eval = true;
                return;
            } else {
                if (this.index != 0) {
                    throw new JSONException("jsonpath not support operate : " + context.path + ", objectClass" + cls.getName());
                }
                context.value = obj;
                context.eval = true;
                return;
            }
        }
        List list2 = ((JSONPath.Sequence) obj).values;
        JSONArray jSONArray = new JSONArray(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            context.value = it.next();
            JSONPath.Context context3 = context;
            JSONPath.Context context4 = new JSONPath.Context(context.path, context3, context.current, context.next, context.readerFeatures);
            eval(context4);
            jSONArray.add(context4.value);
            context = context3;
        }
        JSONPath.Context context5 = context;
        if (context5.next != null) {
            context5.value = new JSONPath.Sequence(jSONArray);
        } else {
            context5.value = jSONArray;
        }
        context5.eval = true;
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public boolean remove(JSONPath.Context context) {
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (!(obj instanceof List)) {
            throw new JSONException("UnsupportedOperation");
        }
        List list = (List) obj;
        int i = this.index;
        if (i >= 0) {
            if (i >= list.size()) {
                return false;
            }
            list.remove(this.index);
            return true;
        }
        int size = list.size() + this.index;
        if (size < 0) {
            return false;
        }
        list.remove(size);
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void set(JSONPath.Context context, Object obj) {
        JSONPath.Context context2 = context.parent;
        Object obj2 = context2 == null ? context.root : context2.value;
        if (obj2 instanceof List) {
            List list = (List) obj2;
            int i = this.index;
            if (i < 0) {
                int size = list.size() + this.index;
                if (size >= 0) {
                    list.set(size, obj);
                    return;
                }
                return;
            }
            if (i > list.size()) {
                for (int size2 = list.size(); size2 < this.index; size2++) {
                    list.add(null);
                }
            }
            if (this.index < list.size()) {
                list.set(this.index, obj);
                return;
            } else {
                if (this.index <= list.size()) {
                    list.add(obj);
                    return;
                }
                return;
            }
        }
        if (obj2 instanceof Object[]) {
            Object[] objArr = (Object[]) obj2;
            int length = objArr.length;
            int i2 = this.index;
            if (i2 >= 0) {
                if (i2 < length) {
                    objArr[i2] = obj;
                    return;
                }
                return;
            } else {
                int i3 = i2 + length;
                if (i3 < 0 || i3 >= length) {
                    return;
                }
                objArr[i3] = obj;
                return;
            }
        }
        if (obj2 == null || !obj2.getClass().isArray()) {
            throw new JSONException("UnsupportedOperation");
        }
        int length2 = Array.getLength(obj2);
        int i4 = this.index;
        if (i4 >= 0) {
            if (i4 < length2) {
                Array.set(obj2, i4, obj);
            }
        } else {
            int i5 = i4 + length2;
            if (i5 < 0 || i5 >= length2) {
                return;
            }
            Array.set(obj2, i5, obj);
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void setCallback(JSONPath.Context context, BiFunction biFunction) {
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (obj instanceof List) {
            List list = (List) obj;
            int i = this.index;
            if (i >= 0) {
                if (i < list.size()) {
                    list.set(this.index, biFunction.apply(obj, list.get(this.index)));
                    return;
                }
                return;
            } else {
                int size = list.size() + this.index;
                if (size >= 0) {
                    list.set(size, biFunction.apply(obj, list.get(size)));
                    return;
                }
                return;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int i2 = this.index;
            if (i2 >= 0) {
                if (i2 < objArr.length) {
                    objArr[this.index] = biFunction.apply(obj, objArr[i2]);
                    return;
                }
                return;
            } else {
                int length = objArr.length + i2;
                if (length >= 0) {
                    objArr[length] = biFunction.apply(obj, objArr[length]);
                    return;
                }
                return;
            }
        }
        if (obj == null || !obj.getClass().isArray()) {
            throw new JSONException("UnsupportedOperation");
        }
        int length2 = Array.getLength(obj);
        int i3 = this.index;
        if (i3 >= 0) {
            if (i3 < length2) {
                Array.set(obj, this.index, biFunction.apply(obj, Array.get(obj, i3)));
            }
        } else {
            int i4 = length2 + i3;
            if (i4 >= 0) {
                Array.set(obj, i4, biFunction.apply(obj, Array.get(obj, i4)));
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void setInt(JSONPath.Context context, int i) {
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int i2 = this.index;
            if (i2 >= 0) {
                if (i2 < iArr.length) {
                    iArr[i2] = i;
                    return;
                }
                return;
            } else {
                int length = iArr.length + i2;
                if (length >= 0) {
                    iArr[length] = i;
                    return;
                }
                return;
            }
        }
        if (!(obj instanceof long[])) {
            set(context, Integer.valueOf(i));
            return;
        }
        long[] jArr = (long[]) obj;
        int i3 = this.index;
        if (i3 >= 0) {
            if (i3 < jArr.length) {
                jArr[i3] = i;
            }
        } else {
            int length2 = jArr.length + i3;
            if (length2 >= 0) {
                jArr[length2] = i;
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void setLong(JSONPath.Context context, long j) {
        JSONPath.Context context2 = context.parent;
        Object obj = context2 == null ? context.root : context2.value;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int i = this.index;
            if (i >= 0) {
                if (i < iArr.length) {
                    iArr[i] = (int) j;
                    return;
                }
                return;
            } else {
                int length = iArr.length + i;
                if (length >= 0) {
                    iArr[length] = (int) j;
                    return;
                }
                return;
            }
        }
        if (!(obj instanceof long[])) {
            set(context, Long.valueOf(j));
            return;
        }
        long[] jArr = (long[]) obj;
        int i2 = this.index;
        if (i2 >= 0) {
            if (i2 < jArr.length) {
                jArr[i2] = j;
            }
        } else {
            int length2 = jArr.length + i2;
            if (length2 >= 0) {
                jArr[length2] = j;
            }
        }
    }

    public String toString() {
        int i = this.index;
        int iStringSize = i < 0 ? IOUtils.stringSize(-i) + 1 : IOUtils.stringSize(i);
        byte[] bArr = new byte[iStringSize + 2];
        bArr[0] = 91;
        int i2 = iStringSize + 1;
        IOUtils.getChars(this.index, i2, bArr);
        bArr[i2] = 93;
        BiFunction<byte[], Byte, String> biFunction = JDKUtils.STRING_CREATOR_JDK11;
        return biFunction != null ? biFunction.apply(bArr, JDKUtils.LATIN1) : new String(bArr, StandardCharsets.ISO_8859_1);
    }

    private Object eval(Map map) {
        Object obj = map.get(Integer.valueOf(this.index));
        if (obj == null) {
            obj = map.get(Integer.toString(this.index));
        }
        if (obj == null) {
            int size = map.size();
            Iterator it = map.entrySet().iterator();
            int i = 0;
            if (size != 1 && !(map instanceof LinkedHashMap) && !(map instanceof SortedMap)) {
                while (i <= this.index && i < map.size() && it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if ((key instanceof Long) && key.equals(Long.valueOf(this.index))) {
                        return value;
                    }
                    i++;
                }
            } else {
                while (i <= this.index && i < size && it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    Object key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if (key2 instanceof Long) {
                        if (key2.equals(Long.valueOf(this.index))) {
                            return value2;
                        }
                    } else if (i == this.index) {
                        obj = value2;
                    }
                    i++;
                }
            }
        }
        return obj;
    }
}
