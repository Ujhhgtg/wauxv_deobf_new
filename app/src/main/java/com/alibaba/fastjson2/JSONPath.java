package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPathFilter;
import com.alibaba.fastjson2.JSONPathFunction;
import com.alibaba.fastjson2.JSONPathSegment;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ValueConsumer;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import p000.AbstractC1194;
import p000.AbstractC2784;
import p000.C0268;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSONPath {
    static final JSONReader.Context PARSE_CONTEXT = JSONFactory.createReadContext();
    final long features;
    final String path;
    JSONReader.Context readerContext;
    JSONWriter.Context writerContext;

    /* JADX INFO: compiled from: obf */
    public static final class Context {
        final JSONPathSegment current;
        boolean eval;
        final JSONPathSegment next;
        final Context parent;
        final JSONPath path;
        final long readerFeatures;
        Object root;
        Object value;

        public Context(JSONPath jSONPath, Context context, JSONPathSegment jSONPathSegment, JSONPathSegment jSONPathSegment2, long j) {
            this.path = jSONPath;
            this.current = jSONPathSegment;
            this.next = jSONPathSegment2;
            this.parent = context;
            this.readerFeatures = j;
        }
    }

    /* JADX INFO: compiled from: obf */
    public enum Feature {
        AlwaysReturnList(1),
        NullOnError(2),
        KeepNullValue(4),
        DisableStringArrayUnwrapping(8);

        public final long mask;

        Feature(long j) {
            this.mask = j;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PreviousPath extends JSONPath {
        static final PreviousPath INSTANCE = new PreviousPath("#-1");

        public PreviousPath(String str) {
            super(str, new Feature[0]);
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean contains(Object obj) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public Object eval(Object obj) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public Object extract(JSONReader jSONReader) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public String extractScalar(JSONReader jSONReader) {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public JSONPath getParent() {
            throw new JSONException("unsupported operation");
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean isPrevious() {
            return true;
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean isRef() {
            throw new JSONException("unsupported operation");
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

    /* JADX INFO: compiled from: obf */
    public static final class RootPath extends JSONPath {
        static final RootPath INSTANCE = new RootPath();

        private RootPath() {
            super("$", new Feature[0]);
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean contains(Object obj) {
            return false;
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public Object extract(JSONReader jSONReader) {
            if (jSONReader == null) {
                return null;
            }
            return jSONReader.readAny();
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public String extractScalar(JSONReader jSONReader) {
            return JSON.toJSONString(jSONReader.readAny());
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public JSONPath getParent() {
            return null;
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean isRef() {
            return true;
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean remove(Object obj) {
            return false;
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

        @Override // com.alibaba.fastjson2.JSONPath
        public Object eval(Object obj) {
            return obj;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class Sequence {
        final List values;

        public Sequence(List list) {
            this.values = list;
        }
    }

    public JSONPath(String str, Feature... featureArr) {
        this.path = str;
        long j = 0;
        for (Feature feature : featureArr) {
            j |= feature.mask;
        }
        this.features = j;
    }

    @Deprecated
    public static JSONPath compile(String str) {
        return of(str);
    }

    public static boolean contains(Object obj, String str) {
        if (obj == null) {
            return false;
        }
        return of(str).contains(obj);
    }

    public static Object eval(String str, String str2) {
        return extract(str, str2);
    }

    public static Object extract(String str, String str2) {
        return of(str2).extract(JSONReader.of(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$of$0(JSONPath jSONPath) {
        return new ArrayList();
    }

    public static JSONPathSingle of(JSONPathSegment jSONPathSegment) {
        StringBuilder sbM4753 = AbstractC2784.m4753(((jSONPathSegment instanceof JSONPathSegment.MultiIndexSegment) || (jSONPathSegment instanceof JSONPathSegmentIndex)) ? "$" : "$.");
        sbM4753.append(jSONPathSegment.toString());
        String string = sbM4753.toString();
        return jSONPathSegment instanceof JSONPathSegmentName ? new JSONPathSingleName(string, (JSONPathSegmentName) jSONPathSegment, new Feature[0]) : new JSONPathSingle(jSONPathSegment, string, new Feature[0]);
    }

    public static JSONPathFilter.Operator parseOperator(JSONReader jSONReader) {
        switch (jSONReader.ch) {
            case '!':
                jSONReader.next();
                if (jSONReader.ch == '=') {
                    jSONReader.next();
                    return JSONPathFilter.Operator.NE;
                }
                throw new JSONException("not support operator : !" + jSONReader.ch);
            case '<':
                jSONReader.next();
                char c = jSONReader.ch;
                if (c == '=') {
                    jSONReader.next();
                    return JSONPathFilter.Operator.LE;
                }
                if (c != '>') {
                    return JSONPathFilter.Operator.LT;
                }
                jSONReader.next();
                return JSONPathFilter.Operator.NE;
            case '=':
                jSONReader.next();
                char c2 = jSONReader.ch;
                if (c2 == '~') {
                    jSONReader.nextWithoutComment();
                    return JSONPathFilter.Operator.REG_MATCH;
                }
                if (c2 != '=') {
                    return JSONPathFilter.Operator.EQ;
                }
                jSONReader.next();
                return JSONPathFilter.Operator.EQ;
            case '>':
                jSONReader.next();
                if (jSONReader.ch != '=') {
                    return JSONPathFilter.Operator.GT;
                }
                jSONReader.next();
                return JSONPathFilter.Operator.GE;
            case 'B':
            case 'b':
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName = jSONReader.getFieldName();
                if ("between".equalsIgnoreCase(fieldName)) {
                    return JSONPathFilter.Operator.BETWEEN;
                }
                throw new JSONException(AbstractC2784.m4757("not support operator : ", fieldName));
            case 'E':
            case 'e':
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName2 = jSONReader.getFieldName();
                if ("ends".equalsIgnoreCase(fieldName2)) {
                    jSONReader.readFieldNameHashCodeUnquote();
                    String fieldName3 = jSONReader.getFieldName();
                    if (!"with".equalsIgnoreCase(fieldName3)) {
                        throw new JSONException(AbstractC2784.m4757("not support operator : ", fieldName3));
                    }
                } else if (!"endsWith".equalsIgnoreCase(fieldName2)) {
                    throw new JSONException(AbstractC2784.m4757("not support operator : ", fieldName2));
                }
                return JSONPathFilter.Operator.ENDS_WITH;
            case 'I':
            case 'i':
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName4 = jSONReader.getFieldName();
                if ("in".equalsIgnoreCase(fieldName4)) {
                    return JSONPathFilter.Operator.IN;
                }
                if ("is".equalsIgnoreCase(fieldName4)) {
                    return JSONPathFilter.Operator.EQ;
                }
                throw new JSONException(AbstractC2784.m4757("not support operator : ", fieldName4));
            case 'L':
            case 108 /* 108 */:
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName5 = jSONReader.getFieldName();
                if ("like".equalsIgnoreCase(fieldName5)) {
                    return JSONPathFilter.Operator.LIKE;
                }
                throw new JSONException(AbstractC2784.m4757("not support operator : ", fieldName5));
            case 'N':
            case 110 /* 110 */:
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName6 = jSONReader.getFieldName();
                if ("nin".equalsIgnoreCase(fieldName6)) {
                    return JSONPathFilter.Operator.NOT_IN;
                }
                if (!"not".equalsIgnoreCase(fieldName6)) {
                    throw new JSONException(AbstractC2784.m4757("not support operator : ", fieldName6));
                }
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName7 = jSONReader.getFieldName();
                if ("like".equalsIgnoreCase(fieldName7)) {
                    return JSONPathFilter.Operator.NOT_LIKE;
                }
                if ("rlike".equalsIgnoreCase(fieldName7)) {
                    return JSONPathFilter.Operator.NOT_RLIKE;
                }
                if ("in".equalsIgnoreCase(fieldName7)) {
                    return JSONPathFilter.Operator.NOT_IN;
                }
                if ("between".equalsIgnoreCase(fieldName7)) {
                    return JSONPathFilter.Operator.NOT_BETWEEN;
                }
                throw new JSONException(AbstractC2784.m4757("not support operator : ", fieldName7));
            case 'R':
            case 114 /* 114 */:
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName8 = jSONReader.getFieldName();
                if ("rlike".equalsIgnoreCase(fieldName8)) {
                    return JSONPathFilter.Operator.RLIKE;
                }
                throw new JSONException(AbstractC2784.m4757("not support operator : ", fieldName8));
            case 83 /* 83 */:
            case 's':
                jSONReader.readFieldNameHashCodeUnquote();
                String fieldName9 = jSONReader.getFieldName();
                if ("starts".equalsIgnoreCase(fieldName9)) {
                    jSONReader.readFieldNameHashCodeUnquote();
                    String fieldName10 = jSONReader.getFieldName();
                    if (!"with".equalsIgnoreCase(fieldName10)) {
                        throw new JSONException(AbstractC2784.m4757("not support operator : ", fieldName10));
                    }
                } else if (!"startsWith".equalsIgnoreCase(fieldName9)) {
                    throw new JSONException(AbstractC2784.m4757("not support operator : ", fieldName9));
                }
                return JSONPathFilter.Operator.STARTS_WITH;
            default:
                jSONReader.readFieldNameHashCodeUnquote();
                throw new JSONException("not support operator : " + jSONReader.getFieldName());
        }
    }

    public static Map<String, Object> paths(Object obj) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RootPath.INSTANCE.paths(identityHashMap, linkedHashMap, "$", obj);
        return linkedHashMap;
    }

    public static String remove(String str, String str2) {
        Object obj = JSON.parse(str);
        of(str2).remove(obj);
        return JSON.toJSONString(obj);
    }

    public static String set(String str, String str2, Object obj) {
        Object obj2 = JSON.parse(str);
        of(str2).set(obj2, obj);
        return JSON.toJSONString(obj2);
    }

    public static Object setCallback(Object obj, String str, Function function) {
        of(str).setCallback(obj, function);
        return obj;
    }

    public void arrayAdd(Object obj, Object... objArr) {
        Object objEval = eval(obj);
        if (objEval == null) {
            set(obj, JSONArray.of(objArr));
        } else if (objEval instanceof Collection) {
            ((Collection) objEval).addAll(Arrays.asList(objArr));
        }
    }

    public abstract boolean contains(Object obj);

    public JSONReader.Context createContext() {
        return JSONFactory.createReadContext();
    }

    public boolean endsWithFilter() {
        return false;
    }

    public abstract Object eval(Object obj);

    public abstract Object extract(JSONReader jSONReader);

    public Integer extractInt32(JSONReader jSONReader) {
        int iExtractInt32Value = extractInt32Value(jSONReader);
        if (jSONReader.wasNull) {
            return null;
        }
        return Integer.valueOf(iExtractInt32Value);
    }

    public int extractInt32Value(JSONReader jSONReader) {
        Object objExtract = extract(jSONReader);
        if (objExtract == null) {
            jSONReader.wasNull = true;
            return 0;
        }
        if (objExtract instanceof Number) {
            return ((Number) objExtract).intValue();
        }
        Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objExtract.getClass(), Integer.TYPE);
        if (typeConvert != null) {
            return ((Integer) typeConvert.apply(objExtract)).intValue();
        }
        throw new JSONException("can not convert to int : " + objExtract);
    }

    public Long extractInt64(JSONReader jSONReader) {
        long jExtractInt64Value = extractInt64Value(jSONReader);
        if (jSONReader.wasNull) {
            return null;
        }
        return Long.valueOf(jExtractInt64Value);
    }

    public long extractInt64Value(JSONReader jSONReader) {
        Object objExtract = extract(jSONReader);
        if (objExtract == null) {
            jSONReader.wasNull = true;
            return 0L;
        }
        if (objExtract instanceof Number) {
            return ((Number) objExtract).longValue();
        }
        Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objExtract.getClass(), Long.TYPE);
        if (typeConvert != null) {
            return ((Long) typeConvert.apply(objExtract)).longValue();
        }
        throw new JSONException("can not convert to long : " + objExtract);
    }

    public abstract String extractScalar(JSONReader jSONReader);

    public void extractScalar(JSONReader jSONReader, ValueConsumer valueConsumer) {
        String strExtractScalar = extractScalar(jSONReader);
        if (strExtractScalar == null) {
            valueConsumer.acceptNull();
        } else {
            valueConsumer.accept(strExtractScalar.toString());
        }
    }

    public abstract JSONPath getParent();

    public JSONReader.Context getReaderContext() {
        if (this.readerContext == null) {
            this.readerContext = JSONFactory.createReadContext();
        }
        return this.readerContext;
    }

    public JSONWriter.Context getWriterContext() {
        if (this.writerContext == null) {
            this.writerContext = JSONFactory.createWriteContext();
        }
        return this.writerContext;
    }

    public boolean isPrevious() {
        return false;
    }

    public abstract boolean isRef();

    public abstract boolean remove(Object obj);

    public abstract void set(Object obj, Object obj2);

    public abstract void set(Object obj, Object obj2, JSONReader.Feature... featureArr);

    public abstract void setCallback(Object obj, BiFunction biFunction);

    public abstract void setInt(Object obj, int i);

    public abstract void setLong(Object obj, long j);

    public JSONPath setReaderContext(JSONReader.Context context) {
        this.readerContext = context;
        return this;
    }

    public JSONPath setWriterContext(JSONWriter.Context context) {
        this.writerContext = context;
        return this;
    }

    public final String toString() {
        return this.path;
    }

    public static JSONPath compile(String str, Class cls) {
        return JSONFactory.getDefaultJSONPathCompiler().compile(cls, of(str));
    }

    public static Object eval(Object obj, String str) {
        return of(str).eval(obj);
    }

    public static Object setCallback(Object obj, String str, BiFunction biFunction) {
        of(str).setCallback(obj, biFunction);
        return obj;
    }

    public static Object extract(String str, String str2, Feature... featureArr) {
        return of(str2, featureArr).extract(JSONReader.of(str));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ae A[PHI: r10
      0x00ae: PHI (r10v4 ??) = (r10v3 ??), (r10v8 ??) binds: [B:31:0x0066, B:40:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    public void paths(Map<Object, String> map, Map map2, String str, Object obj) {
        String strM2786;
        Class<?> cls;
        if (obj == null) {
            return;
        }
        if (map.put(obj, str) == null || (cls = obj.getClass()) == String.class || cls == Boolean.class || cls == Character.class || cls == UUID.class || (obj instanceof Enum) || (obj instanceof Number) || (obj instanceof Date)) {
            map2.put(str, obj);
            int i = 0;
            if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (key instanceof String) {
                        String str2 = (String) key;
                        ?? IsEmpty = str2.isEmpty();
                        if (IsEmpty == 0) {
                            char cCharAt = str2.charAt(0);
                            IsEmpty = ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_') ? 1 : 0;
                            if (IsEmpty == 0) {
                                int i2 = 1;
                                IsEmpty = IsEmpty;
                                while (i2 < str2.length()) {
                                    char cCharAt2 = str2.charAt(i2);
                                    IsEmpty = ((cCharAt2 < 'a' || cCharAt2 > 'z') && (cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_')) ? 1 : 0;
                                    if (IsEmpty != 0) {
                                        break;
                                    }
                                    i2++;
                                    IsEmpty = IsEmpty;
                                }
                            }
                        }
                        if (IsEmpty != 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append('[');
                            strM2786 = AbstractC1194.m2786(sb, JSON.toJSONString(str2, JSONWriter.Feature.UseSingleQuotes), ']');
                        } else {
                            strM2786 = str + "." + str2;
                        }
                        paths(map, map2, strM2786, entry.getValue());
                    }
                    i = 0;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    paths(map, map2, str + "[" + i3 + "]", it.next());
                    i3++;
                }
                return;
            }
            Class<?> cls2 = obj.getClass();
            if (cls2.isArray()) {
                int length = Array.getLength(obj);
                for (int i4 = 0; i4 < length; i4++) {
                    paths(map, map2, str + "[" + i4 + "]", Array.get(obj, i4));
                }
                return;
            }
            if (ObjectWriterProvider.isPrimitiveOrEnum(cls2)) {
                return;
            }
            ObjectWriter objectWriter = getWriterContext().getObjectWriter(cls2);
            if (objectWriter instanceof ObjectWriterAdapter) {
                try {
                    for (Map.Entry<String, Object> entry2 : ((ObjectWriterAdapter) objectWriter).toMap(obj).entrySet()) {
                        String key2 = entry2.getKey();
                        if (key2 != null) {
                            paths(map, map2, str + "." + key2, entry2.getValue());
                        }
                    }
                } catch (Exception e) {
                    throw new JSONException("toJSON error", e);
                }
            }
        }
    }

    public static void remove(Object obj, String str) {
        of(str).remove(obj);
    }

    public static Object set(Object obj, String str, Object obj2) {
        of(str).set(obj, obj2);
        return obj;
    }

    public void setCallback(Object obj, Function function) {
        setCallback(obj, new JSONPathFunction.BiFunctionAdapter(function));
    }

    public JSONPath(String str, long j) {
        this.path = str;
        this.features = j;
    }

    public Object extract(String str) {
        if (str == null) {
            return null;
        }
        JSONReader jSONReaderOf = JSONReader.of(str, createContext());
        try {
            Object objExtract = extract(jSONReaderOf);
            if (jSONReaderOf != null) {
                jSONReaderOf.close();
            }
            return objExtract;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Object extract(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        JSONReader jSONReaderOf = JSONReader.of(bArr, createContext());
        try {
            Object objExtract = extract(jSONReaderOf);
            if (true) {
                jSONReaderOf.close();
            }
            return objExtract;
        } catch (Throwable th) {
            if (true) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static JSONPath of(String str) {
        if ("#-1".equals(str)) {
            return PreviousPath.INSTANCE;
        }
        return new JSONPathParser(str).parse(new Feature[0]);
    }

    public Object extract(byte[] bArr, int i, int i2, Charset charset) {
        if (bArr == null) {
            return null;
        }
        JSONReader jSONReaderOf = JSONReader.of(bArr, i, i2, charset, createContext());
        try {
            Object objExtract = extract(jSONReaderOf);
            if (jSONReaderOf != null) {
                jSONReaderOf.close();
            }
            return objExtract;
        } catch (Throwable th) {
            if (jSONReaderOf != null) {
                try {
                    jSONReaderOf.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static JSONPath of(String str, Type type) {
        return JSONPathTyped.of(of(str), type);
    }

    public static JSONPath of(String str, Type type, Feature... featureArr) {
        return JSONPathTyped.of(of(str, featureArr), type);
    }

    public void extract(JSONReader jSONReader, ValueConsumer valueConsumer) {
        Object objExtract = extract(jSONReader);
        if (objExtract == null) {
            valueConsumer.acceptNull();
            return;
        }
        if (objExtract instanceof Number) {
            valueConsumer.accept((Number) objExtract);
            return;
        }
        if (objExtract instanceof String) {
            valueConsumer.accept((String) objExtract);
            return;
        }
        if (objExtract instanceof Boolean) {
            valueConsumer.accept(((Boolean) objExtract).booleanValue());
        } else if (objExtract instanceof Map) {
            valueConsumer.accept((Map) objExtract);
        } else {
            if (objExtract instanceof List) {
                valueConsumer.accept((List) objExtract);
                return;
            }
            throw new JSONException(AbstractC1194.m2783(objExtract, new StringBuilder("TODO : ")));
        }
    }

    public static JSONPath of(String[] strArr, Type[] typeArr) {
        return of(strArr, typeArr, null, null, null, new JSONReader.Feature[0]);
    }

    public static JSONPath of(String[] strArr, Type[] typeArr, JSONReader.Feature... featureArr) {
        return of(strArr, typeArr, null, null, null, featureArr);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
    public static JSONPath of(String[] strArr, Type[] typeArr, String[] strArr2, long[] jArr, ZoneId zoneId, JSONReader.Feature... featureArr) {
        Type[] typeArr2;
        boolean z;
        JSONPathSegment jSONPathSegment;
        JSONPath jSONPathSingleIndex;
        LinkedHashMap linkedHashMap;
        if (strArr.length != 0) {
            if (typeArr == null) {
                Type[] typeArr3 = new Type[strArr.length];
                Arrays.fill(typeArr3, Object.class);
                typeArr2 = typeArr3;
            } else {
                typeArr2 = typeArr;
            }
            if (typeArr2.length == strArr.length) {
                int length = strArr.length;
                JSONPath[] jSONPathArr = new JSONPath[length];
                for (int i = 0; i < strArr.length; i++) {
                    jSONPathArr[i] = of(strArr[i]);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int i2 = 0;
                boolean z2 = true;
                boolean z3 = true;
                JSONPathMulti jSONPathMulti = null;
                boolean z4 = true;
                boolean z5 = true;
                boolean z6 = true;
                boolean z7 = true;
                while (i2 < length) {
                    JSONPath jSONPath = jSONPathArr[i2];
                    ((List) linkedHashMap2.computeIfAbsent(jSONPath, new C0268(15))).add(Integer.valueOf(i2));
                    if (i2 == 0) {
                        if (jSONPath instanceof JSONPathMulti) {
                            jSONPathMulti = (JSONPathMulti) jSONPath;
                        } else {
                            z2 = false;
                        }
                    } else if (z2 && (jSONPath instanceof JSONPathMulti) && ((JSONPathMulti) jSONPath).segments.size() != jSONPathMulti.segments.size()) {
                        z2 = false;
                    }
                    if (z3 && !(jSONPath instanceof JSONPathSingleName)) {
                        z3 = false;
                    }
                    if (z4 && (!(jSONPath instanceof JSONPathSingleIndex) || ((JSONPathSingleIndex) jSONPath).index < 0)) {
                        z4 = false;
                    }
                    if (z5 && (!(jSONPath instanceof JSONPathTwoSegment) || !(((JSONPathTwoSegment) jSONPath).second instanceof JSONPathSegmentName))) {
                        z5 = false;
                    }
                    if (z6) {
                        if (jSONPath instanceof JSONPathTwoSegment) {
                            JSONPathSegment jSONPathSegment2 = ((JSONPathTwoSegment) jSONPath).second;
                            if (!(jSONPathSegment2 instanceof JSONPathSegmentIndex) || ((JSONPathSegmentIndex) jSONPathSegment2).index < 0) {
                                z6 = false;
                            }
                        } else {
                            z6 = false;
                        }
                    }
                    if (!z7) {
                        linkedHashMap = linkedHashMap2;
                    } else if (jSONPath instanceof JSONPathMulti) {
                        JSONPathMulti jSONPathMulti2 = (JSONPathMulti) jSONPath;
                        if (jSONPathMulti2.segments.size() == 3) {
                            JSONPathSegment jSONPathSegment3 = jSONPathMulti2.segments.get(2);
                            linkedHashMap = linkedHashMap2;
                            if ((jSONPathMulti2.segments.get(0) instanceof JSONPathSegment.AllSegment) || (jSONPathMulti2.segments.get(1) instanceof JSONPathSegment.AllSegment) || !(jSONPathSegment3 instanceof JSONPathSegmentName)) {
                            }
                        } else {
                            linkedHashMap = linkedHashMap2;
                        }
                        z7 = false;
                    } else {
                        linkedHashMap = linkedHashMap2;
                        z7 = false;
                    }
                    i2++;
                    linkedHashMap2 = linkedHashMap;
                }
                boolean z8 = linkedHashMap2.size() != length;
                long jOf = JSONReader.Feature.of(featureArr);
                if (z3 && !z8) {
                    return new JSONPathTypedMultiNames(jSONPathArr, null, jSONPathArr, typeArr2, strArr2, jArr, zoneId, jOf);
                }
                JSONPathMulti jSONPathMulti3 = jSONPathMulti;
                if (z4) {
                    return new JSONPathTypedMultiIndexes(jSONPathArr, null, jSONPathArr, typeArr2, strArr2, jArr, zoneId, jOf);
                }
                if ((z5 && !z8) || z6) {
                    JSONPathSegment jSONPathSegment4 = ((JSONPathTwoSegment) jSONPathArr[0]).first;
                    int i3 = 1;
                    while (true) {
                        if (i3 < length) {
                            if (!jSONPathSegment4.equals(((JSONPathTwoSegment) jSONPathArr[i3]).first)) {
                                break;
                            }
                            i3++;
                        } else {
                            JSONPath jSONPath2 = jSONPathArr[0];
                            if (z5) {
                                JSONPathSingleName[] jSONPathSingleNameArr = new JSONPathSingleName[length];
                                int i4 = 0;
                                while (i4 < length) {
                                    JSONPathSegmentName jSONPathSegmentName = (JSONPathSegmentName) ((JSONPathTwoSegment) jSONPathArr[i4]).second;
                                    jSONPathSingleNameArr[i4] = new JSONPathSingleName("$." + jSONPathSegmentName, jSONPathSegmentName, new Feature[0]);
                                    i4++;
                                    jSONPathArr = jSONPathArr;
                                    typeArr2 = typeArr2;
                                }
                                JSONPath[] jSONPathArr2 = jSONPathArr;
                                Type[] typeArr4 = typeArr2;
                                String str = jSONPath2.path;
                                String strSubstring = str.substring(0, (str.length() - jSONPathSingleNameArr[0].name.length()) - 1);
                                if (jSONPathSegment4 instanceof JSONPathSegmentName) {
                                    return new JSONPathTypedMultiNamesPrefixName1(jSONPathArr2, new JSONPathSingleName(strSubstring, (JSONPathSegmentName) jSONPathSegment4, new Feature[0]), jSONPathSingleNameArr, typeArr4, strArr2, jArr, zoneId, jOf);
                                }
                                typeArr2 = typeArr4;
                                if (jSONPathSegment4 instanceof JSONPathSegmentIndex) {
                                    JSONPathSegmentIndex jSONPathSegmentIndex = (JSONPathSegmentIndex) jSONPathSegment4;
                                    if (jSONPathSegmentIndex.index >= 0) {
                                        return new JSONPathTypedMultiNamesPrefixIndex1(jSONPathArr2, new JSONPathSingleIndex(strSubstring, jSONPathSegmentIndex, new Feature[0]), jSONPathSingleNameArr, typeArr2, strArr2, jArr, zoneId, jOf);
                                    }
                                }
                                jSONPathArr = jSONPathArr2;
                                break;
                            }
                            JSONPathSingleIndex[] jSONPathSingleIndexArr = new JSONPathSingleIndex[length];
                            int i5 = 0;
                            while (i5 < length) {
                                JSONPathSegmentIndex jSONPathSegmentIndex2 = (JSONPathSegmentIndex) ((JSONPathTwoSegment) jSONPathArr[i5]).second;
                                jSONPathSingleIndexArr[i5] = new JSONPathSingleIndex("$" + jSONPathSegmentIndex2, jSONPathSegmentIndex2, new Feature[0]);
                                i5++;
                                jSONPathArr = jSONPathArr;
                            }
                            JSONPath[] jSONPathArr3 = jSONPathArr;
                            if (jSONPathSegment4 instanceof JSONPathSegmentName) {
                                JSONPathSegmentName jSONPathSegmentName2 = (JSONPathSegmentName) jSONPathSegment4;
                                jSONPathSingleIndex = new JSONPathSingleName("$." + jSONPathSegmentName2.name, jSONPathSegmentName2, new Feature[0]);
                            } else if (jSONPathSegment4 instanceof JSONPathSegmentIndex) {
                                JSONPathSegmentIndex jSONPathSegmentIndex3 = (JSONPathSegmentIndex) jSONPathSegment4;
                                jSONPathSingleIndex = new JSONPathSingleIndex(AbstractC2784.m4751(new StringBuilder("$["), jSONPathSegmentIndex3.index, "]"), jSONPathSegmentIndex3, new Feature[0]);
                            } else {
                                jSONPathSingleIndex = null;
                            }
                            if (jSONPathSingleIndex == null) {
                                jSONPathArr = jSONPathArr3;
                                break;
                            }
                            return new JSONPathTypedMultiIndexes(jSONPathArr3, jSONPathSingleIndex, jSONPathSingleIndexArr, typeArr2, strArr2, jArr, zoneId, jOf);
                        }
                    }
                } else if (false) {
                    int i6 = 0;
                    JSONPathSegment jSONPathSegment5 = ((JSONPathMulti) jSONPathArr[0]).segments.get(0);
                    JSONPathSegment jSONPathSegment6 = ((JSONPathMulti) jSONPathArr[0]).segments.get(1);
                    int i7 = 1;
                    while (true) {
                        if (i7 < length) {
                            JSONPathMulti jSONPathMulti4 = (JSONPathMulti) jSONPathArr[i7];
                            if (!jSONPathSegment5.equals(jSONPathMulti4.segments.get(i6)) || !jSONPathSegment6.equals(jSONPathMulti4.segments.get(1))) {
                                break;
                            }
                            i7++;
                            i6 = 0;
                        } else {
                            JSONPathSingleName[] jSONPathSingleNameArr2 = new JSONPathSingleName[length];
                            for (int i8 = 0; i8 < length; i8++) {
                                JSONPathSegmentName jSONPathSegmentName3 = (JSONPathSegmentName) ((JSONPathMulti) jSONPathArr[i8]).segments.get(2);
                                jSONPathSingleNameArr2[i8] = new JSONPathSingleName("$." + jSONPathSegmentName3, jSONPathSegmentName3, new Feature[0]);
                            }
                            String str2 = jSONPathArr[0].path;
                            JSONPathTwoSegment jSONPathTwoSegment = new JSONPathTwoSegment(str2.substring(0, (str2.length() - jSONPathSingleNameArr2[0].name.length()) - 1), jSONPathSegment5, jSONPathSegment6, new Feature[0]);
                            if ((jSONPathSegment5 instanceof JSONPathSegmentName) && (jSONPathSegment6 instanceof JSONPathSegmentName)) {
                                return new JSONPathTypedMultiNamesPrefixName2(jSONPathArr, jSONPathTwoSegment, jSONPathSingleNameArr2, typeArr2, strArr2, jArr, zoneId, jOf);
                            }
                            return new JSONPathTypedMultiNames(jSONPathArr, jSONPathTwoSegment, jSONPathSingleNameArr2, typeArr2, strArr2, jArr, zoneId, jOf);
                        }
                    }
                }
                if (z2 && strArr.length > 1) {
                    int size = jSONPathMulti3.segments.size();
                    int i9 = size - 1;
                    JSONPathSegment jSONPathSegment7 = jSONPathMulti3.segments.get(i9);
                    boolean z9 = true;
                    for (int i10 = 0; i10 < i9; i10++) {
                        JSONPathSegment jSONPathSegment8 = jSONPathMulti3.segments.get(i10);
                        for (int i11 = 1; i11 < strArr.length; i11++) {
                            JSONPath jSONPath3 = jSONPathArr[i11];
                            if (jSONPath3 instanceof JSONPathMulti) {
                                jSONPathSegment = ((JSONPathMulti) jSONPath3).segments.get(i10);
                            } else if (jSONPath3 instanceof JSONPathSingleName) {
                                jSONPathSegment = ((JSONPathSingleName) jSONPath3).segment;
                            } else {
                                jSONPathSegment = jSONPath3 instanceof JSONPathSingleIndex ? ((JSONPathSingleIndex) jSONPath3).segment : null;
                            }
                            if (!jSONPathSegment8.equals(jSONPathSegment)) {
                                z9 = false;
                                break;
                            }
                        }
                        if (!z9) {
                            break;
                        }
                    }
                    if (z9) {
                        int i12 = 1;
                        while (true) {
                            if (i12 >= strArr.length) {
                                z = true;
                                break;
                            }
                            if (!jSONPathSegment7.getClass().equals(((JSONPathMulti) jSONPathArr[i12]).segments.get(i9).getClass())) {
                                z = false;
                                break;
                            }
                            i12++;
                        }
                        if (z) {
                            List<JSONPathSegment> listSubList = jSONPathMulti3.segments.subList(0, size - 2);
                            int iLastIndexOf = jSONPathMulti3.path.lastIndexOf(46);
                            String strSubstring2 = iLastIndexOf != -1 ? jSONPathMulti3.path.substring(0, iLastIndexOf - 1) : null;
                            if (strSubstring2 != null) {
                                JSONPathMulti jSONPathMulti5 = new JSONPathMulti(strSubstring2, listSubList, new Feature[0]);
                                if (jSONPathSegment7 instanceof JSONPathSegmentIndex) {
                                    JSONPath[] jSONPathArr4 = new JSONPath[strArr.length];
                                    for (int i13 = 0; i13 < length; i13++) {
                                        JSONPathSegmentIndex jSONPathSegmentIndex4 = (JSONPathSegmentIndex) ((JSONPathMulti) jSONPathArr[i13]).segments.get(i9);
                                        jSONPathArr4[i13] = new JSONPathSingleIndex(jSONPathSegmentIndex4.toString(), jSONPathSegmentIndex4, new Feature[0]);
                                    }
                                    return new JSONPathTypedMultiIndexes(jSONPathArr, jSONPathMulti5, jSONPathArr4, typeArr2, strArr2, jArr, zoneId, jOf);
                                }
                            }
                        }
                    }
                }
                return new JSONPathTypedMulti(jSONPathArr, typeArr2, strArr2, jArr, zoneId, jOf);
            }
            throw new JSONException("types.length not equals paths.length");
        }
        throw new JSONException("illegal paths, not support 0 length");
    }

    public static JSONPath of(String str, Feature... featureArr) {
        if ("#-1".equals(str)) {
            return PreviousPath.INSTANCE;
        }
        return new JSONPathParser(str).parse(featureArr);
    }
}
