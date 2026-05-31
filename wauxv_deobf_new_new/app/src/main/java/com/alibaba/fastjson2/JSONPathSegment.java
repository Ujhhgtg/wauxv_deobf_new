package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONPathSegment;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import p000.AbstractC1095;
import p000.C0456;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
abstract class JSONPathSegment {

    /* JADX INFO: compiled from: obf */
    public static final class AllSegment extends JSONPathSegment {
        static final AllSegment INSTANCE = new AllSegment(false);
        static final AllSegment INSTANCE_ARRAY = new AllSegment(true);
        final boolean array;

        public AllSegment(boolean z) {
            this.array = z;
        }

        /* JADX WARN: Code duplicated, block: B:69:0x00df  */
        /* JADX WARN: Code duplicated, block: B:74:0x00f5  */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            Object string;
            JSONPath.Context context2 = context.parent;
            if (context2 != null && context2.eval) {
                eval(context);
                return;
            }
            if (jSONReader.isEnd()) {
                context.eval = true;
                return;
            }
            if (jSONReader.jsonb) {
                JSONArray jSONArray = new JSONArray();
                if (!jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT)) {
                    if (!jSONReader.isArray() || context.next == null) {
                        throw new JSONException("TODO");
                    }
                    return;
                }
                while (!jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT_END)) {
                    if (jSONReader.skipName()) {
                        Object any = jSONReader.readAny();
                        if (this.array && (any instanceof Collection)) {
                            jSONArray.addAll((Collection) any);
                        } else {
                            jSONArray.add(any);
                        }
                    }
                }
                context.value = jSONArray;
                return;
            }
            boolean z = context.next == null && (context.path.features & JSONPath.Feature.AlwaysReturnList.mask) != 0;
            JSONArray jSONArray2 = new JSONArray();
            if (!jSONReader.nextIfObjectStart()) {
                if (jSONReader.ch == '[') {
                    jSONReader.next();
                    while (jSONReader.ch != ']') {
                        jSONArray2.add(jSONReader.readAny());
                        if (jSONReader.ch == ',') {
                            jSONReader.next();
                        }
                    }
                    jSONReader.next();
                    if (context.next != null) {
                        context.value = new JSONPath.Sequence(jSONArray2);
                    } else {
                        context.value = jSONArray2;
                    }
                    context.eval = true;
                    return;
                }
                return;
            }
            while (jSONReader.ch != '}') {
                jSONReader.skipName();
                char c = jSONReader.ch;
                if (c == '\"' || c == '\'') {
                    string = jSONReader.readString();
                } else if (c == '+' || c == '-') {
                    jSONReader.readNumber0();
                    string = jSONReader.getNumber();
                } else if (c == '[') {
                    string = jSONReader.readArray();
                } else {
                    if (c == ']') {
                        jSONReader.next();
                        context.value = jSONArray2;
                        context.eval = true;
                    }
                    if (c == 'f') {
                        string = Boolean.valueOf(jSONReader.readBoolValue());
                    } else if (c == 'n') {
                        jSONReader.readNull();
                        string = null;
                    } else if (c == 't') {
                        string = Boolean.valueOf(jSONReader.readBoolValue());
                    } else if (c != '{') {
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
                                jSONReader.readNumber0();
                                string = jSONReader.getNumber();
                                break;
                            default:
                                throw new JSONException("TODO : " + jSONReader.ch);
                        }
                    } else {
                        string = jSONReader.readObject();
                    }
                }
                if (!(string instanceof Collection) || z) {
                    jSONArray2.add(string);
                } else {
                    jSONArray2.addAll((Collection) string);
                }
                if (jSONReader.ch == ',') {
                    jSONReader.next();
                }
            }
            jSONReader.next();
            context.value = jSONArray2;
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                context.value = null;
                context.eval = true;
                return;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                JSONArray jSONArray = new JSONArray(map.size());
                for (Object obj2 : map.values()) {
                    if (this.array && (obj2 instanceof Collection)) {
                        jSONArray.addAll((Collection) obj2);
                    } else {
                        jSONArray.add(obj2);
                    }
                }
                if (context.next != null) {
                    context.value = new JSONPath.Sequence(jSONArray);
                } else {
                    context.value = jSONArray;
                }
                context.eval = true;
                return;
            }
            int i = 0;
            if (obj instanceof List) {
                List list = (List) obj;
                JSONArray jSONArray2 = new JSONArray(list.size());
                JSONPathSegment jSONPathSegment = context.next;
                if (jSONPathSegment != null || this.array) {
                    if (jSONPathSegment != null) {
                        context.value = new JSONPath.Sequence(list);
                    } else {
                        context.value = obj;
                    }
                    context.eval = true;
                    return;
                }
                while (i < list.size()) {
                    Object obj3 = list.get(i);
                    if (obj3 instanceof Map) {
                        jSONArray2.addAll(((Map) obj3).values());
                    } else {
                        jSONArray2.add(obj3);
                    }
                    i++;
                }
                context.value = jSONArray2;
                context.eval = true;
                return;
            }
            if (obj instanceof Collection) {
                context.value = obj;
                context.eval = true;
                return;
            }
            if (!(obj instanceof JSONPath.Sequence)) {
                List<FieldWriter> fieldWriters = context.path.getWriterContext().provider.getObjectWriter((Class) obj.getClass()).getFieldWriters();
                int size = fieldWriters.size();
                JSONArray jSONArray3 = new JSONArray(size);
                while (i < size) {
                    jSONArray3.add(fieldWriters.get(i).getFieldValue(obj));
                    i++;
                }
                context.value = jSONArray3;
                context.eval = true;
                return;
            }
            List list2 = ((JSONPath.Sequence) obj).values;
            JSONArray jSONArray4 = new JSONArray(list2.size());
            if (context.next != null) {
                context.value = new JSONPath.Sequence(list2);
                context.eval = true;
                return;
            }
            while (i < list2.size()) {
                Object obj4 = list2.get(i);
                if ((obj4 instanceof Map) && !this.array) {
                    jSONArray4.addAll(((Map) obj4).values());
                } else if (obj4 instanceof Collection) {
                    jSONArray4.addAll((Collection) obj4);
                } else {
                    jSONArray4.add(obj4);
                }
                i++;
            }
            context.value = jSONArray4;
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public boolean remove(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj instanceof Map) {
                ((Map) obj).clear();
                return true;
            }
            if (!(obj instanceof Collection)) {
                throw new JSONException(AbstractC1095.m2797(AllSegment.class, "UnsupportedOperation "));
            }
            ((Collection) obj).clear();
            return true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void set(JSONPath.Context context, Object obj) {
            JSONPath.Context context2 = context.parent;
            Object obj2 = context2 == null ? context.root : context2.value;
            if (obj2 instanceof Map) {
                Iterator it = ((Map) obj2).entrySet().iterator();
                while (it.hasNext()) {
                    ((Map.Entry) it.next()).setValue(obj);
                }
            } else {
                if (obj2 instanceof List) {
                    Collections.fill((List) obj2, obj);
                    return;
                }
                if (obj2 == null || !obj2.getClass().isArray()) {
                    throw new JSONException(AbstractC1095.m2797(AllSegment.class, "UnsupportedOperation "));
                }
                int length = Array.getLength(obj2);
                for (int i = 0; i < length; i++) {
                    Array.set(obj2, i, obj);
                }
            }
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object value = entry.getValue();
                    Object objApply = biFunction.apply(obj, value);
                    if (objApply != value) {
                        entry.setValue(objApply);
                    }
                }
                return;
            }
            int i = 0;
            if (obj instanceof List) {
                List list = (List) obj;
                while (i < list.size()) {
                    Object obj2 = list.get(i);
                    Object objApply2 = biFunction.apply(obj, obj2);
                    if (objApply2 != obj2) {
                        list.set(i, objApply2);
                    }
                    i++;
                }
                return;
            }
            if (obj == null || !obj.getClass().isArray()) {
                throw new JSONException(AbstractC1095.m2797(AllSegment.class, "UnsupportedOperation "));
            }
            int length = Array.getLength(obj);
            while (i < length) {
                Object obj3 = Array.get(obj, i);
                Object objApply3 = biFunction.apply(obj, obj3);
                if (objApply3 != obj3) {
                    Array.set(obj, i, objApply3);
                }
                i++;
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class EntrySetSegment extends JSONPathSegment implements EvalSegment {
        static final EntrySetSegment INSTANCE = new EntrySetSegment();

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            if (!jSONReader.isObject()) {
                throw new JSONException("TODO");
            }
            jSONReader.next();
            JSONArray jSONArray = new JSONArray();
            while (!jSONReader.nextIfObjectEnd()) {
                jSONArray.add(JSONObject.of("key", (Object) jSONReader.readFieldName(), "value", jSONReader.readAny()));
            }
            context.value = jSONArray;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof Map)) {
                throw new JSONException("TODO");
            }
            Map map = (Map) obj;
            JSONArray jSONArray = new JSONArray(map.size());
            for (Map.Entry entry : map.entrySet()) {
                jSONArray.add(JSONObject.of("key", entry.getKey(), "value", entry.getValue()));
            }
            context.value = jSONArray;
            context.eval = true;
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface EvalSegment {
    }

    /* JADX INFO: compiled from: obf */
    public static final class KeysSegment extends JSONPathSegment implements EvalSegment {
        static final KeysSegment INSTANCE = new KeysSegment();

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            if (!jSONReader.isObject()) {
                throw new JSONException("TODO");
            }
            jSONReader.next();
            JSONArray jSONArray = new JSONArray();
            while (!jSONReader.nextIfObjectEnd()) {
                jSONArray.add(jSONReader.readFieldName());
                jSONReader.skipValue();
            }
            context.value = jSONArray;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof Map)) {
                throw new JSONException("TODO");
            }
            context.value = new JSONArray(((Map) obj).keySet());
            context.eval = true;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class LengthSegment extends JSONPathSegment implements EvalSegment {
        static final LengthSegment INSTANCE = new LengthSegment();

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            if (context.parent == null) {
                context.root = jSONReader.readAny();
                context.eval = true;
            }
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            int size;
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                return;
            }
            if (obj instanceof Collection) {
                size = ((Collection) obj).size();
            } else if (obj.getClass().isArray()) {
                size = Array.getLength(obj);
            } else if (obj instanceof Map) {
                size = ((Map) obj).size();
            } else if (obj instanceof String) {
                size = ((String) obj).length();
            } else {
                size = obj instanceof JSONPath.Sequence ? ((JSONPath.Sequence) obj).values.size() : 1;
            }
            context.value = Integer.valueOf(size);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MaxSegment extends JSONPathSegment implements EvalSegment {
        static final MaxSegment INSTANCE = new MaxSegment();

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                return;
            }
            Object obj2 = null;
            if (obj instanceof Collection) {
                for (Object obj3 : (Collection) obj) {
                    if (obj3 != null && (obj2 == null || TypeUtils.compare(obj2, obj3) < 0)) {
                        obj2 = obj3;
                    }
                }
            } else if (obj instanceof Object[]) {
                for (Object obj4 : (Object[]) obj) {
                    if (obj4 != null && (obj2 == null || TypeUtils.compare(obj2, obj4) < 0)) {
                        obj2 = obj4;
                    }
                }
            } else {
                if (!(obj instanceof JSONPath.Sequence)) {
                    throw new UnsupportedOperationException();
                }
                for (Object obj5 : ((JSONPath.Sequence) obj).values) {
                    if (obj5 != null && (obj2 == null || TypeUtils.compare(obj2, obj5) < 0)) {
                        obj2 = obj5;
                    }
                }
            }
            context.value = obj2;
            context.eval = true;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MinSegment extends JSONPathSegment implements EvalSegment {
        static final MinSegment INSTANCE = new MinSegment();

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                return;
            }
            Object obj2 = null;
            if (obj instanceof Collection) {
                for (Object obj3 : (Collection) obj) {
                    if (obj3 != null && (obj2 == null || TypeUtils.compare(obj2, obj3) > 0)) {
                        obj2 = obj3;
                    }
                }
            } else if (obj instanceof Object[]) {
                for (Object obj4 : (Object[]) obj) {
                    if (obj4 != null && (obj2 == null || TypeUtils.compare(obj2, obj4) > 0)) {
                        obj2 = obj4;
                    }
                }
            } else {
                if (!(obj instanceof JSONPath.Sequence)) {
                    throw new UnsupportedOperationException();
                }
                for (Object obj5 : ((JSONPath.Sequence) obj).values) {
                    if (obj5 != null && (obj2 == null || TypeUtils.compare(obj2, obj5) > 0)) {
                        obj2 = obj5;
                    }
                }
            }
            context.value = obj2;
            context.eval = true;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MultiIndexSegment extends JSONPathSegment {
        final int[] indexes;

        public MultiIndexSegment(int[] iArr) {
            this.indexes = iArr;
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            Object string;
            JSONPath.Context context2 = context.parent;
            if (context2 != null && (context2.current instanceof CycleNameSegment) && context.next == null) {
                eval(context);
                return;
            }
            int i = 0;
            if (jSONReader.jsonb) {
                JSONArray jSONArray = new JSONArray();
                int iStartArray = jSONReader.startArray();
                while (i < iStartArray) {
                    if (Arrays.binarySearch(this.indexes, i) >= 0) {
                        jSONArray.add(jSONReader.readAny());
                    } else {
                        jSONReader.skipValue();
                    }
                    i++;
                }
                context.value = jSONArray;
                return;
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONReader.next();
            while (true) {
                char c = jSONReader.ch;
                if (c != 26) {
                    if (c == ']') {
                        jSONReader.next();
                    } else {
                        if (Arrays.binarySearch(this.indexes, i) >= 0) {
                            char c2 = jSONReader.ch;
                            if (c2 == '\"' || c2 == '\'') {
                                string = jSONReader.readString();
                            } else if (c2 == '+') {
                                jSONReader.readNumber0();
                                string = jSONReader.getNumber();
                            } else if (c2 == '[') {
                                string = jSONReader.readArray();
                            } else if (c2 == 'f') {
                                string = Boolean.valueOf(jSONReader.readBoolValue());
                            } else if (c2 == 'n') {
                                jSONReader.readNull();
                                string = null;
                            } else if (c2 == 't') {
                                string = Boolean.valueOf(jSONReader.readBoolValue());
                            } else if (c2 != '{') {
                                if (c2 != '-' && c2 != '.') {
                                    switch (c2) {
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
                                            throw new JSONException("TODO : " + jSONReader.ch);
                                    }
                                }
                                jSONReader.readNumber0();
                                string = jSONReader.getNumber();
                            } else {
                                string = jSONReader.readObject();
                            }
                            jSONArray2.add(string);
                        } else {
                            jSONReader.skipValue();
                            if (jSONReader.ch == ',') {
                                jSONReader.next();
                            }
                        }
                        i++;
                    }
                }
            }
            context.value = jSONArray2;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x008c  */
        /* JADX WARN: Code duplicated, block: B:42:0x0092  */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            Object obj;
            JSONPath.Context context2 = context.parent;
            Object obj2 = context2 == null ? context.root : context2.value;
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            if (obj2 instanceof JSONPath.Sequence) {
                List list = ((JSONPath.Sequence) obj2).values;
                int size = list.size();
                while (i < size) {
                    context.value = list.get(i);
                    JSONPath.Context context3 = context;
                    JSONPath.Context context4 = new JSONPath.Context(context.path, context3, context.current, context.next, context.readerFeatures);
                    eval(context4);
                    Object obj3 = context4.value;
                    if (obj3 instanceof Collection) {
                        jSONArray.addAll((Collection) obj3);
                    } else {
                        jSONArray.add(obj3);
                    }
                    i++;
                    context = context3;
                }
                context.value = jSONArray;
                return;
            }
            int[] iArr = this.indexes;
            int length = iArr.length;
            while (i < length) {
                int i2 = iArr[i];
                if (obj2 instanceof List) {
                    List list2 = (List) obj2;
                    if (i2 < 0) {
                        int size2 = list2.size() + i2;
                        if (size2 >= 0) {
                            obj = list2.get(size2);
                            if (obj instanceof Collection) {
                                jSONArray.addAll((Collection) obj);
                            } else {
                                jSONArray.add(obj);
                            }
                        }
                    } else if (i2 < list2.size()) {
                        obj = list2.get(i2);
                        if (obj instanceof Collection) {
                            jSONArray.addAll((Collection) obj);
                        } else {
                            jSONArray.add(obj);
                        }
                    }
                } else if (obj2 instanceof Object[]) {
                    Object[] objArr = (Object[]) obj2;
                    if (i2 < 0) {
                        int length2 = objArr.length + i2;
                        if (length2 >= 0) {
                            obj = objArr[length2];
                            if (obj instanceof Collection) {
                                jSONArray.addAll((Collection) obj);
                            } else {
                                jSONArray.add(obj);
                            }
                        }
                    } else if (i2 < objArr.length) {
                        obj = objArr[i2];
                        if (obj instanceof Collection) {
                            jSONArray.addAll((Collection) obj);
                        } else {
                            jSONArray.add(obj);
                        }
                    }
                }
                i++;
            }
            context.value = jSONArray;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void set(JSONPath.Context context, Object obj) {
            JSONPath.Context context2 = context.parent;
            Object obj2 = context2 == null ? context.root : context2.value;
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    for (int i2 : this.indexes) {
                        if (i2 == i) {
                            list.set(i, obj);
                        }
                    }
                }
                return;
            }
            if (obj2 == null || !obj2.getClass().isArray()) {
                throw new JSONException(AbstractC1095.m2797(MultiIndexSegment.class, "UnsupportedOperation "));
            }
            int length = Array.getLength(obj2);
            for (int i3 = 0; i3 < length; i3++) {
                for (int i4 : this.indexes) {
                    if (i4 == i3) {
                        Array.set(obj2, i3, obj);
                    }
                }
            }
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    for (int i2 : this.indexes) {
                        if (i2 == i) {
                            list.set(i, biFunction.apply(obj, list.get(i)));
                        }
                    }
                }
                return;
            }
            if (obj == null || !obj.getClass().isArray()) {
                throw new JSONException(AbstractC1095.m2797(MultiIndexSegment.class, "UnsupportedOperation "));
            }
            int length = Array.getLength(obj);
            for (int i3 = 0; i3 < length; i3++) {
                for (int i4 : this.indexes) {
                    if (i4 == i3) {
                        Array.set(obj, i3, biFunction.apply(obj, Array.get(obj, i3)));
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class MultiNameSegment extends JSONPathSegment {
        final long[] nameHashCodes;
        final Set<String> nameSet = new HashSet();
        final String[] names;

        public MultiNameSegment(String[] strArr) {
            this.names = strArr;
            this.nameHashCodes = new long[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                this.nameHashCodes[i] = Fnv.hashCode64(strArr[i]);
                this.nameSet.add(strArr[i]);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        
            if ((r0 instanceof com.alibaba.fastjson2.JSONPathSegment.MultiIndexSegment) == false) goto L12;
         */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            if (context2 != null) {
                if (!context2.eval) {
                    JSONPathSegment jSONPathSegment = context2.current;
                    if (!(jSONPathSegment instanceof JSONPathFilter)) {
                    }
                }
                eval(context);
                return;
            }
            Object any = jSONReader.readAny();
            if (any instanceof Map) {
                Map map = (Map) any;
                JSONArray jSONArray = new JSONArray(this.names.length);
                for (String str : this.names) {
                    jSONArray.add(map.get(str));
                }
                context.value = jSONArray;
                return;
            }
            if (!(any instanceof Collection)) {
                throw new JSONException(AbstractC1095.m2797(MultiNameSegment.class, "UnsupportedOperation "));
            }
            if (context.next != null) {
                context.value = any;
                return;
            }
            Collection collection = (Collection) any;
            JSONArray jSONArray2 = new JSONArray(collection.size());
            for (Object obj : collection) {
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    JSONArray jSONArray3 = new JSONArray(this.names.length);
                    for (String str2 : this.names) {
                        jSONArray3.add(map2.get(str2));
                    }
                    jSONArray2.add(jSONArray3);
                }
            }
            context.value = jSONArray2;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            int i = 0;
            if (obj instanceof Map) {
                Map map = (Map) obj;
                JSONArray jSONArray = new JSONArray(this.names.length);
                String[] strArr = this.names;
                int length = strArr.length;
                while (i < length) {
                    jSONArray.add(map.get(strArr[i]));
                    i++;
                }
                context.value = jSONArray;
                return;
            }
            if (obj instanceof Collection) {
                context.value = obj;
                return;
            }
            ObjectWriter objectWriter = context.path.getWriterContext().provider.getObjectWriter((Class) obj.getClass());
            JSONArray jSONArray2 = new JSONArray(this.names.length);
            while (i < this.names.length) {
                FieldWriter fieldWriter = objectWriter.getFieldWriter(this.nameHashCodes[i]);
                jSONArray2.add(fieldWriter != null ? fieldWriter.getFieldValue(obj) : null);
                i++;
            }
            context.value = jSONArray2;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public boolean remove(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj instanceof Map) {
                Map map = (Map) obj;
                int i = 0;
                for (String str : this.names) {
                    if (map.remove(str) != null) {
                        i++;
                    }
                }
                return i > 0;
            }
            ObjectReader objectReader = context.path.getReaderContext().provider.getObjectReader(obj.getClass());
            if (!(objectReader instanceof ObjectReaderBean)) {
                throw new JSONException(AbstractC1095.m2797(MultiNameSegment.class, "UnsupportedOperation "));
            }
            int i2 = 0;
            for (long j : this.nameHashCodes) {
                FieldReader fieldReader = objectReader.getFieldReader(j);
                if (fieldReader != null) {
                    fieldReader.accept(obj, (Object) null);
                    i2++;
                }
            }
            return i2 > 0;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void set(JSONPath.Context context, Object obj) {
            JSONPath.Context context2 = context.parent;
            Object obj2 = context2 == null ? context.root : context2.value;
            int i = 0;
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                String[] strArr = this.names;
                int length = strArr.length;
                while (i < length) {
                    map.put(strArr[i], obj);
                    i++;
                }
                return;
            }
            ObjectReader objectReader = context.path.getReaderContext().provider.getObjectReader(obj2.getClass());
            if (!(objectReader instanceof ObjectReaderBean)) {
                throw new JSONException(AbstractC1095.m2797(MultiNameSegment.class, "UnsupportedOperation "));
            }
            long[] jArr = this.nameHashCodes;
            int length2 = jArr.length;
            while (i < length2) {
                FieldReader fieldReader = objectReader.getFieldReader(jArr[i]);
                if (fieldReader != null) {
                    fieldReader.accept(obj2, obj);
                }
                i++;
            }
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            FieldReader fieldReader;
            Object fieldValue;
            Object objApply;
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            int i = 0;
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String[] strArr = this.names;
                int length = strArr.length;
                while (i < length) {
                    String str = strArr[i];
                    Object obj2 = map.get(str);
                    Object objApply2 = biFunction.apply(map, obj2);
                    if (objApply2 != obj2) {
                        map.put(str, objApply2);
                    }
                    i++;
                }
                return;
            }
            ObjectWriter objectWriter = context.path.getWriterContext().provider.getObjectWriter((Class) obj.getClass());
            if (objectWriter instanceof ObjectWriterAdapter) {
                ObjectReader objectReader = context.path.getReaderContext().provider.getObjectReader(obj.getClass());
                if (objectReader instanceof ObjectReaderBean) {
                    long[] jArr = this.nameHashCodes;
                    int length2 = jArr.length;
                    while (i < length2) {
                        long j = jArr[i];
                        FieldWriter fieldWriter = objectWriter.getFieldWriter(j);
                        if (fieldWriter != null && (fieldReader = objectReader.getFieldReader(j)) != null && (objApply = biFunction.apply(obj, (fieldValue = fieldWriter.getFieldValue(obj)))) != fieldValue) {
                            fieldReader.accept(obj, objApply);
                        }
                        i++;
                    }
                    return;
                }
            }
            throw new JSONException(AbstractC1095.m2797(MultiNameSegment.class, "UnsupportedOperation "));
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class RandomIndexSegment extends JSONPathSegment {
        public static final RandomIndexSegment INSTANCE = new RandomIndexSegment();
        Random random;

        /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            Object string;
            JSONPath.Context context2 = context.parent;
            if (context2 != null && (context2.eval || ((context2.current instanceof CycleNameSegment) && context.next == null))) {
                eval(context);
                return;
            }
            if (jSONReader.jsonb) {
                JSONArray jSONArray = new JSONArray();
                int iStartArray = jSONReader.startArray();
                for (int i = 0; i < iStartArray; i++) {
                    jSONArray.add(jSONReader.readAny());
                }
                if (this.random == null) {
                    this.random = new Random();
                }
                context.value = jSONArray.get(Math.abs(this.random.nextInt()) % jSONArray.size());
                context.eval = true;
                return;
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONReader.next();
            while (true) {
                char c = jSONReader.ch;
                if (c != 26) {
                    if (c == ']') {
                        jSONReader.next();
                    } else {
                        if (c == '\"' || c == '\'') {
                            string = jSONReader.readString();
                        } else if (c == '+') {
                            jSONReader.readNumber0();
                            string = jSONReader.getNumber();
                        } else if (c == '[') {
                            string = jSONReader.readArray();
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
                                        throw new JSONException("TODO : " + jSONReader.ch);
                                }
                            }
                            jSONReader.readNumber0();
                            string = jSONReader.getNumber();
                        } else {
                            string = jSONReader.readObject();
                        }
                        jSONArray2.add(string);
                    }
                }
            }
            if (this.random == null) {
                this.random = new Random();
            }
            context.value = jSONArray2.get(Math.abs(this.random.nextInt()) % jSONArray2.size());
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                if (this.random == null) {
                    this.random = new Random();
                }
                context.value = list.get(Math.abs(this.random.nextInt()) % list.size());
                context.eval = true;
                return;
            }
            if (!(obj instanceof Object[])) {
                throw new JSONException("TODO");
            }
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 0) {
                return;
            }
            if (this.random == null) {
                this.random = new Random();
            }
            context.value = objArr[this.random.nextInt() % objArr.length];
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof List)) {
                throw new JSONException("UnsupportedOperation ");
            }
            List list = (List) obj;
            if (this.random == null) {
                this.random = new Random();
            }
            int iAbs = Math.abs(this.random.nextInt()) % list.size();
            list.set(iAbs, biFunction.apply(list, list.get(iAbs)));
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class RangeIndexSegment extends JSONPathSegment {
        final int begin;
        final int end;

        public RangeIndexSegment(int i, int i2) {
            this.begin = i;
            this.end = i2;
        }

        /* JADX WARN: Code duplicated, block: B:77:0x00db  */
        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            Object string;
            JSONPath.Context context2 = context.parent;
            if (context2 != null && (context2.eval || ((context2.current instanceof CycleNameSegment) && context.next == null))) {
                eval(context);
                return;
            }
            int i = 0;
            if (jSONReader.jsonb) {
                JSONArray jSONArray = new JSONArray();
                int iStartArray = jSONReader.startArray();
                while (i < iStartArray) {
                    int i2 = this.begin;
                    if (i2 < 0 || (i >= i2 && i < this.end)) {
                        jSONArray.add(jSONReader.readAny());
                    } else {
                        jSONReader.skipValue();
                    }
                    i++;
                }
                if (this.begin < 0) {
                    int size = jSONArray.size();
                    for (int i3 = size - 1; i3 >= 0; i3--) {
                        int i4 = i3 - size;
                        if (i4 < this.begin || i4 >= this.end) {
                            jSONArray.remove(i3);
                        }
                    }
                }
                context.value = jSONArray;
                context.eval = true;
                return;
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONReader.next();
            while (true) {
                char c = jSONReader.ch;
                if (c != 26) {
                    if (c == ']') {
                        jSONReader.next();
                    } else {
                        int i5 = this.begin;
                        if (i5 < 0 || (i >= i5 && i < this.end)) {
                            if (c == '\"' || c == '\'') {
                                string = jSONReader.readString();
                            } else if (c == '+') {
                                jSONReader.readNumber0();
                                string = jSONReader.getNumber();
                            } else if (c == '[') {
                                string = jSONReader.readArray();
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
                                            throw new JSONException("TODO : " + jSONReader.ch);
                                    }
                                }
                                jSONReader.readNumber0();
                                string = jSONReader.getNumber();
                            } else {
                                string = jSONReader.readObject();
                            }
                            jSONArray2.add(string);
                        } else {
                            jSONReader.skipValue();
                            if (jSONReader.ch == ',') {
                                jSONReader.next();
                            }
                        }
                        i++;
                    }
                }
            }
            if (this.begin < 0) {
                int size2 = jSONArray2.size();
                for (int i6 = size2 - 1; i6 >= 0; i6--) {
                    int i7 = i6 - size2;
                    if (i7 < this.begin || i7 >= this.end) {
                        jSONArray2.remove(i6);
                    }
                }
            }
            context.value = jSONArray2;
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                while (i < size) {
                    int i2 = this.begin;
                    int i3 = i2 >= 0 ? i : i - size;
                    if (i3 >= i2 && i3 < this.end) {
                        jSONArray.add(list.get(i));
                    }
                    i++;
                }
                context.value = jSONArray;
                context.eval = true;
                return;
            }
            if (!(obj instanceof Object[])) {
                throw new JSONException("TODO");
            }
            Object[] objArr = (Object[]) obj;
            while (i < objArr.length) {
                int i4 = this.begin;
                if ((i >= i4 && i <= this.end) || (i - objArr.length > i4 && i - objArr.length <= this.end)) {
                    jSONArray.add(objArr[i]);
                }
                i++;
            }
            context.value = jSONArray;
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public boolean remove(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof List)) {
                throw new JSONException(AbstractC1095.m2797(RangeIndexSegment.class, "UnsupportedOperation "));
            }
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            for (int i2 = size - 1; i2 >= 0; i2--) {
                int i3 = this.begin;
                int i4 = i3 >= 0 ? i2 : i2 - size;
                if (i4 >= i3 && i4 < this.end) {
                    list.remove(i2);
                    i++;
                }
            }
            return i > 0;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void set(JSONPath.Context context, Object obj) {
            JSONPath.Context context2 = context.parent;
            Object obj2 = context2 == null ? context.root : context2.value;
            int i = 0;
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                while (i < size) {
                    int i2 = this.begin;
                    int i3 = i2 >= 0 ? i : i - size;
                    if (i3 >= i2 && i3 < this.end) {
                        list.set(i, obj);
                    }
                    i++;
                }
                return;
            }
            if (obj2 == null || !obj2.getClass().isArray()) {
                throw new JSONException(AbstractC1095.m2797(RangeIndexSegment.class, "UnsupportedOperation "));
            }
            int length = Array.getLength(obj2);
            while (i < length) {
                int i4 = this.begin;
                int i5 = i4 >= 0 ? i : i - length;
                if (i5 >= i4 && i5 < this.end) {
                    Array.set(obj2, i, obj);
                }
                i++;
            }
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            int i = 0;
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                while (i < size) {
                    int i2 = this.begin;
                    int i3 = i2 >= 0 ? i : i - size;
                    if (i3 >= i2 && i3 < this.end) {
                        list.set(i3, biFunction.apply(list, list.get(i)));
                    }
                    i++;
                }
                return;
            }
            if (obj == null || !obj.getClass().isArray()) {
                throw new JSONException(AbstractC1095.m2797(RangeIndexSegment.class, "UnsupportedOperation "));
            }
            int length = Array.getLength(obj);
            while (i < length) {
                int i4 = this.begin;
                int i5 = i4 >= 0 ? i : i - length;
                if (i5 >= i4 && i5 < this.end) {
                    Array.set(obj, i, biFunction.apply(obj, Array.get(obj, i)));
                }
                i++;
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class RootSegment extends JSONPathSegment {
        static final RootSegment INSTANCE = new RootSegment();

        private RootSegment() {
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            if (context.parent != null) {
                throw new JSONException("not support operation");
            }
            context.value = jSONReader.readAny();
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            context.value = context2 == null ? context.root : context2.root;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class SelfSegment extends JSONPathSegment {
        static final SelfSegment INSTANCE = new SelfSegment();

        private SelfSegment() {
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            context.value = jSONReader.readAny();
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            context.value = context2 == null ? context.root : context2.value;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class SumSegment extends JSONPathSegment implements EvalSegment {
        static final SumSegment INSTANCE = new SumSegment();

        public static Number add(Number number, Number number2) {
            boolean z = true;
            boolean z2 = (number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long);
            boolean z3 = (number2 instanceof Byte) || (number2 instanceof Short) || (number2 instanceof Integer) || (number2 instanceof Long);
            if (z2 && z3) {
                return Long.valueOf(number2.longValue() + number.longValue());
            }
            boolean z4 = (number instanceof Float) || (number instanceof Double);
            if (!(number2 instanceof Float) && !(number2 instanceof Double)) {
                z = false;
            }
            if (z4 || z) {
                return Double.valueOf(number2.doubleValue() + number.doubleValue());
            }
            if ((number instanceof BigDecimal) || (number2 instanceof BigDecimal)) {
                return TypeUtils.toBigDecimal(number).add(TypeUtils.toBigDecimal(number2));
            }
            if ((number instanceof BigInteger) || (number2 instanceof BigInteger)) {
                return TypeUtils.toBigInteger(number).add(TypeUtils.toBigInteger(number2));
            }
            throw new JSONException("not support operation");
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                return;
            }
            Number numberAdd = 0;
            if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    if (obj2 != null) {
                        numberAdd = add(numberAdd, (Number) obj2);
                    }
                }
            } else if (obj instanceof Object[]) {
                for (Object obj3 : (Object[]) obj) {
                    if (obj3 != null) {
                        numberAdd = add(numberAdd, (Number) obj3);
                    }
                }
            } else {
                if (!(obj instanceof JSONPath.Sequence)) {
                    throw new UnsupportedOperationException();
                }
                for (Object obj4 : ((JSONPath.Sequence) obj).values) {
                    if (obj4 != null) {
                        numberAdd = add(numberAdd, (Number) obj4);
                    }
                }
            }
            context.value = numberAdd;
            context.eval = true;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ValuesSegment extends JSONPathSegment implements EvalSegment {
        static final ValuesSegment INSTANCE = new ValuesSegment();

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                context.value = null;
                context.eval = true;
            } else {
                if (!(obj instanceof Map)) {
                    throw new JSONException("TODO");
                }
                context.value = new JSONArray((Collection<?>) ((Map) obj).values());
                context.eval = true;
            }
        }
    }

    public abstract void accept(JSONReader jSONReader, JSONPath.Context context);

    public boolean contains(JSONPath.Context context) {
        eval(context);
        return context.value != null;
    }

    public abstract void eval(JSONPath.Context context);

    public boolean remove(JSONPath.Context context) {
        throw new JSONException("UnsupportedOperation " + getClass());
    }

    public void set(JSONPath.Context context, Object obj) {
        throw new JSONException("UnsupportedOperation " + getClass());
    }

    public void setCallback(JSONPath.Context context, BiFunction biFunction) {
        throw new JSONException("UnsupportedOperation " + getClass());
    }

    public void setInt(JSONPath.Context context, int i) {
        set(context, Integer.valueOf(i));
    }

    public void setLong(JSONPath.Context context, long j) {
        set(context, Long.valueOf(j));
    }

    /* JADX INFO: compiled from: obf */
    public static final class CycleNameSegment extends JSONPathSegment {
        final String name;
        final long nameHashCode;
        static final long HASH_STAR = Fnv.hashCode64("*");
        static final long HASH_EMPTY = Fnv.hashCode64("");

        /* JADX INFO: compiled from: obf */
        public class LoopCallback {
            final BiFunction callback;
            final JSONPath.Context context;

            public LoopCallback(JSONPath.Context context, BiFunction biFunction) {
                this.context = context;
                this.callback = biFunction;
            }

            public void accept(Object obj) {
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        Object value = entry.getValue();
                        if (CycleNameSegment.this.name.equals(entry.getKey())) {
                            entry.setValue(this.callback.apply(obj, value));
                            this.context.eval = true;
                        } else if (value != null) {
                            accept(value);
                        }
                    }
                    return;
                }
                if (obj instanceof Collection) {
                    for (Object obj2 : (List) obj) {
                        if (obj2 != null) {
                            accept(obj2);
                        }
                    }
                    return;
                }
                Class<?> cls = obj.getClass();
                ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls);
                ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) cls);
                if (objectReader instanceof ObjectReaderBean) {
                    FieldReader fieldReader = objectReader.getFieldReader(CycleNameSegment.this.nameHashCode);
                    FieldWriter fieldWriter = objectWriter.getFieldWriter(CycleNameSegment.this.nameHashCode);
                    if (fieldWriter != null && fieldReader != null) {
                        fieldReader.accept(obj, this.callback.apply(obj, fieldWriter.getFieldValue(obj)));
                        this.context.eval = true;
                        return;
                    }
                }
                Iterator<FieldWriter> it = objectWriter.getFieldWriters().iterator();
                while (it.hasNext()) {
                    accept(it.next().getFieldValue(obj));
                }
            }
        }

        /* JADX INFO: compiled from: obf */
        public class LoopRemove {
            final JSONPath.Context context;

            public LoopRemove(JSONPath.Context context) {
                this.context = context;
            }

            public void accept(Object obj) {
                FieldReader fieldReader;
                if (obj instanceof Map) {
                    Iterator it = ((Map) obj).entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (CycleNameSegment.this.name.equals(entry.getKey())) {
                            it.remove();
                            this.context.eval = true;
                        } else {
                            Object value = entry.getValue();
                            if (value != null) {
                                accept(value);
                            }
                        }
                    }
                    return;
                }
                if (obj instanceof Collection) {
                    for (Object obj2 : (List) obj) {
                        if (obj2 != null) {
                            accept(obj2);
                        }
                    }
                    return;
                }
                Class<?> cls = obj.getClass();
                ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls);
                if ((objectReader instanceof ObjectReaderBean) && (fieldReader = objectReader.getFieldReader(CycleNameSegment.this.nameHashCode)) != null) {
                    fieldReader.accept(obj, (Object) null);
                    this.context.eval = true;
                } else {
                    Iterator<FieldWriter> it2 = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) cls).getFieldWriters().iterator();
                    while (it2.hasNext()) {
                        accept(it2.next().getFieldValue(obj));
                    }
                }
            }
        }

        /* JADX INFO: compiled from: obf */
        public class LoopSet {
            final JSONPath.Context context;
            final Object value;

            public LoopSet(JSONPath.Context context, Object obj) {
                this.context = context;
                this.value = obj;
            }

            public void accept(Object obj) {
                FieldReader fieldReader;
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (CycleNameSegment.this.name.equals(entry.getKey())) {
                            entry.setValue(this.value);
                            this.context.eval = true;
                        } else {
                            Object value = entry.getValue();
                            if (value != null) {
                                accept(value);
                            }
                        }
                    }
                    return;
                }
                if (obj instanceof Collection) {
                    for (Object obj2 : (List) obj) {
                        if (obj2 != null) {
                            accept(obj2);
                        }
                    }
                    return;
                }
                Class<?> cls = obj.getClass();
                ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls);
                if ((objectReader instanceof ObjectReaderBean) && (fieldReader = objectReader.getFieldReader(CycleNameSegment.this.nameHashCode)) != null) {
                    fieldReader.accept(obj, this.value);
                    this.context.eval = true;
                } else {
                    Iterator<FieldWriter> it = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) cls).getFieldWriters().iterator();
                    while (it.hasNext()) {
                        accept(it.next().getFieldValue(obj));
                    }
                }
            }
        }

        /* JADX INFO: compiled from: obf */
        public class MapRecursive implements Consumer {
            static final int maxLevel = 2048;
            final JSONPath.Context context;
            final int level;
            final List values;

            public MapRecursive(JSONPath.Context context, List list, int i) {
                this.context = context;
                this.values = list;
                this.level = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ Object lambda$recursive$0(Object obj, FieldWriter fieldWriter) {
                return fieldWriter.getFieldValue(obj);
            }

            private void recursive(final Object obj, List list, int i) {
                if (i >= maxLevel) {
                    throw new JSONException("level too large");
                }
                if (obj instanceof Map) {
                    Collection collectionValues = ((Map) obj).values();
                    long j = CycleNameSegment.this.nameHashCode;
                    if (j == CycleNameSegment.HASH_STAR) {
                        list.addAll(collectionValues);
                    } else if (j == CycleNameSegment.HASH_EMPTY) {
                        list.add(obj);
                    }
                    collectionValues.forEach(this);
                    return;
                }
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    long j2 = CycleNameSegment.this.nameHashCode;
                    if (j2 == CycleNameSegment.HASH_STAR) {
                        list.addAll(collection);
                    } else if (j2 == CycleNameSegment.HASH_EMPTY) {
                        list.add(obj);
                    }
                    collection.forEach(this);
                    return;
                }
                if (obj != null) {
                    ObjectWriter objectWriter = this.context.path.getWriterContext().getObjectWriter(obj.getClass());
                    if (objectWriter instanceof ObjectWriterAdapter) {
                        List<FieldWriter> fieldWriters = ((ObjectWriterAdapter) objectWriter).getFieldWriters();
                        recursive((fieldWriters == null || fieldWriters.isEmpty()) ? new ArrayList() : fieldWriters.stream().filter(new C0456(3)).map(new Function() { // from class: com.alibaba.fastjson2.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ
                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return JSONPathSegment.CycleNameSegment.MapRecursive.lambda$recursive$0(obj, (FieldWriter) obj2);
                            }
                        }).collect(Collectors.toList()), list, i + 1);
                    }
                }
            }

            @Override // java.util.function.Consumer
            public void accept(Object obj) {
                recursive(obj, this.values, this.level);
            }
        }

        public CycleNameSegment(String str, long j) {
            this.name = str;
            this.nameHashCode = j;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            JSONArray jSONArray = new JSONArray();
            accept(jSONReader, context, jSONArray);
            context.value = jSONArray;
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            JSONArray jSONArray = new JSONArray();
            (shouldRecursive() ? new MapRecursive(context, jSONArray, 0) : new MapLoop(context, jSONArray)).accept(obj);
            if (jSONArray.size() == 1 && (jSONArray.get(0) instanceof Collection)) {
                context.value = jSONArray.get(0);
            } else {
                context.value = jSONArray;
            }
            Object obj2 = context.value;
            if ((obj2 instanceof List) && (context.next instanceof JSONPathFilter)) {
                context.value = new JSONPath.Sequence((List) obj2);
            }
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public boolean remove(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            new LoopRemove(context).accept(context2 == null ? context.root : context2.value);
            context.eval = true;
            return true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void set(JSONPath.Context context, Object obj) {
            JSONPath.Context context2 = context.parent;
            new LoopSet(context, obj).accept(context2 == null ? context.root : context2.value);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            JSONPath.Context context2 = context.parent;
            new LoopCallback(context, biFunction).accept(context2 == null ? context.root : context2.value);
        }

        public boolean shouldRecursive() {
            long j = this.nameHashCode;
            return j == HASH_STAR || j == HASH_EMPTY;
        }

        public String toString() {
            return ".." + this.name;
        }

        /* JADX WARN: Code duplicated, block: B:133:0x0104 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:134:0x0126 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:140:0x00f8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:146:0x0085 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x00f6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:80:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:86:0x0119  */
        /* JADX WARN: Code duplicated, block: B:87:0x011f  */
        public void accept(JSONReader jSONReader, JSONPath.Context context, List<Object> list) {
            Object string;
            if (jSONReader.jsonb) {
                if (jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT)) {
                    while (!jSONReader.nextIfMatch(JSONB.Constants.BC_OBJECT_END)) {
                        long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                        if (fieldNameHashCode != 0) {
                            if (fieldNameHashCode == this.nameHashCode) {
                                if (jSONReader.isArray()) {
                                    list.addAll(jSONReader.readArray());
                                } else {
                                    list.add(jSONReader.readAny());
                                }
                            } else if (!jSONReader.isObject() && !jSONReader.isArray()) {
                                jSONReader.skipValue();
                            } else {
                                accept(jSONReader, context, list);
                            }
                        }
                    }
                    return;
                }
                if (jSONReader.isArray()) {
                    int iStartArray = jSONReader.startArray();
                    for (int i = 0; i < iStartArray; i++) {
                        if (!jSONReader.isObject() && !jSONReader.isArray()) {
                            jSONReader.skipValue();
                        } else {
                            accept(jSONReader, context, list);
                        }
                    }
                    return;
                }
                jSONReader.skipValue();
                return;
            }
            char c = jSONReader.ch;
            if (c != '{') {
                if (c == '[') {
                    jSONReader.next();
                    while (true) {
                        char c2 = jSONReader.ch;
                        if (c2 == ']') {
                            jSONReader.next();
                            break;
                        }
                        if (c2 != '{' && c2 != '[') {
                            jSONReader.skipValue();
                        } else {
                            accept(jSONReader, context, list);
                        }
                        if (jSONReader.ch == ',') {
                            jSONReader.next();
                            break;
                        }
                    }
                    if (jSONReader.ch == ',') {
                        jSONReader.next();
                        return;
                    }
                    return;
                }
                jSONReader.skipValue();
                return;
            }
            jSONReader.next();
            while (jSONReader.ch != '}') {
                boolean z = jSONReader.readFieldNameHashCode() == this.nameHashCode;
                char c3 = jSONReader.ch;
                if (!z && c3 != '{' && c3 != '[') {
                    jSONReader.skipValue();
                } else if (c3 != '\"' && c3 != '\'') {
                    if (c3 != '+' && c3 != '-') {
                        if (c3 != '[') {
                            if (c3 != 'f') {
                                if (c3 == 'n') {
                                    jSONReader.readNull();
                                    string = null;
                                } else if (c3 != 't') {
                                    if (c3 != '{') {
                                        switch (c3) {
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
                                                throw new JSONException("TODO : " + jSONReader.ch);
                                        }
                                    } else if (z) {
                                        accept(jSONReader, context, list);
                                    } else if (c3 == '[') {
                                        string = jSONReader.readArray();
                                    } else {
                                        string = jSONReader.readObject();
                                    }
                                }
                                if (string instanceof Collection) {
                                    list.addAll((Collection) string);
                                } else {
                                    list.add(string);
                                }
                                if (jSONReader.ch == ',') {
                                    jSONReader.next();
                                }
                            }
                            string = Boolean.valueOf(jSONReader.readBoolValue());
                            if (string instanceof Collection) {
                                list.addAll((Collection) string);
                            } else {
                                list.add(string);
                            }
                            if (jSONReader.ch == ',') {
                                jSONReader.next();
                            }
                        } else if (z) {
                            accept(jSONReader, context, list);
                        } else {
                            if (c3 == '[') {
                                string = jSONReader.readArray();
                            } else {
                                string = jSONReader.readObject();
                            }
                            if (string instanceof Collection) {
                                list.addAll((Collection) string);
                            } else {
                                list.add(string);
                            }
                            if (jSONReader.ch == ',') {
                                jSONReader.next();
                            }
                        }
                    }
                    jSONReader.readNumber0();
                    string = jSONReader.getNumber();
                    if (string instanceof Collection) {
                        list.addAll((Collection) string);
                    } else {
                        list.add(string);
                    }
                    if (jSONReader.ch == ',') {
                        jSONReader.next();
                    }
                } else {
                    string = jSONReader.readString();
                    if (string instanceof Collection) {
                        list.addAll((Collection) string);
                    } else {
                        list.add(string);
                    }
                    if (jSONReader.ch == ',') {
                        jSONReader.next();
                    }
                }
            }
            jSONReader.next();
            if (jSONReader.ch == ',') {
                jSONReader.next();
            }
        }

        /* JADX INFO: compiled from: obf */
        public class MapLoop implements BiConsumer, Consumer {
            final JSONPath.Context context;
            final List values;

            public MapLoop(JSONPath.Context context, List list) {
                this.context = context;
                this.values = list;
            }

            @Override // java.util.function.BiConsumer
            public void accept(Object obj, Object obj2) {
                if (CycleNameSegment.this.name.equals(obj)) {
                    this.values.add(obj2);
                }
                if (obj2 instanceof Map) {
                    ((Map) obj2).forEach(this);
                } else if (obj2 instanceof List) {
                    ((List) obj2).forEach(this);
                } else if (CycleNameSegment.this.nameHashCode == CycleNameSegment.HASH_STAR) {
                    this.values.add(obj2);
                }
            }

            @Override // java.util.function.Consumer
            public void accept(Object obj) {
                if (obj == null) {
                    return;
                }
                if (obj instanceof Map) {
                    ((Map) obj).forEach(this);
                    return;
                }
                if (obj instanceof List) {
                    ((List) obj).forEach(this);
                    return;
                }
                ObjectWriter objectWriter = this.context.path.getWriterContext().getObjectWriter(obj.getClass());
                if (!(objectWriter instanceof ObjectWriterAdapter)) {
                    if (CycleNameSegment.this.nameHashCode == CycleNameSegment.HASH_STAR) {
                        this.values.add(obj);
                        return;
                    }
                    return;
                }
                FieldWriter fieldWriter = objectWriter.getFieldWriter(CycleNameSegment.this.nameHashCode);
                if (fieldWriter != null) {
                    Object fieldValue = fieldWriter.getFieldValue(obj);
                    if (fieldValue != null) {
                        this.values.add(fieldValue);
                        return;
                    }
                    return;
                }
                for (int i = 0; i < objectWriter.getFieldWriters().size(); i++) {
                    accept(objectWriter.getFieldWriters().get(i).getFieldValue(obj));
                }
            }
        }
    }
}
