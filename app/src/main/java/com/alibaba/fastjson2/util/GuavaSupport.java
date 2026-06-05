package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.support.LambdaMiscCodec;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import p000.AbstractC3317feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class GuavaSupport {
    static Class CLASS_ARRAYLIST_MULTI_MAP;
    static Class CLASS_IMMUTABLE_LIST;
    static Class CLASS_IMMUTABLE_MAP;
    static Class CLASS_IMMUTABLE_SET;
    static Supplier FUNC_ARRAYLIST_MULTI_MAP_CREATE;
    static Function FUNC_IMMUTABLE_LIST_COPY_OF;
    static Supplier FUNC_IMMUTABLE_LIST_OF_0;
    static Function FUNC_IMMUTABLE_LIST_OF_1;
    static Function FUNC_IMMUTABLE_MAP_COPY_OF;
    static Supplier FUNC_IMMUTABLE_MAP_OF_0;
    static BiFunction FUNC_IMMUTABLE_MAP_OF_1;
    static Function FUNC_IMMUTABLE_SET_COPY_OF;
    static Supplier FUNC_IMMUTABLE_SET_OF_0;
    static Function FUNC_IMMUTABLE_SET_OF_1;
    static BiFunction FUNC_SINGLETON_IMMUTABLE_BIMAP;
    static volatile boolean METHOD_ARRAYLIST_MULTI_MAP_ERROR;
    static Method METHOD_ARRAYLIST_MULTI_MAP_PUT_ALL;

    /* JADX INFO: compiled from: obf */
    public static class ArrayListMultimapConvertFunction implements Function {
        final Supplier method;
        final Method putAllMethod;

        public ArrayListMultimapConvertFunction(Supplier supplier, Method method) {
            this.method = supplier;
            this.putAllMethod = method;
        }

        @Override // java.util.function.Function
        public Object apply(Object obj) {
            Object obj2 = this.method.get();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                try {
                    this.putAllMethod.invoke(obj2, entry.getKey(), (Iterable) entry.getValue());
                } catch (Throwable th) {
                    throw new JSONException("putAll ArrayListMultimap error", th);
                }
            }
            return obj2;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class AsMapWriter implements ObjectWriter {
        final Function asMap;
        final Class objectClass;
        final String typeName;
        final long typeNameHash;
        protected byte[] typeNameJSONB;

        public AsMapWriter(Class cls) {
            this.objectClass = cls;
            String typeName = TypeUtils.getTypeName(cls);
            this.typeName = typeName;
            this.typeNameHash = Fnv.hashCode64(typeName);
            try {
                this.asMap = LambdaMiscCodec.createFunction(cls.getMethod("asMap", null));
            } catch (NoSuchMethodException e) {
                throw new JSONException("create Guava AsMapWriter error", e);
            }
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            jSONWriter.write((Map<?, ?>) this.asMap.apply(obj));
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            if (jSONWriter.isWriteTypeInfo(obj, type, j)) {
                if (this.typeNameJSONB == null) {
                    this.typeNameJSONB = JSONB.toBytes(this.typeName);
                }
                jSONWriter.writeTypeName(this.typeNameJSONB, this.typeNameHash);
            }
            jSONWriter.write((Map<?, ?>) this.asMap.apply(obj));
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class ImmutableListConvertFunction implements Function {
        @Override // java.util.function.Function
        public Object apply(Object obj) {
            if (GuavaSupport.CLASS_IMMUTABLE_LIST == null) {
                GuavaSupport.CLASS_IMMUTABLE_LIST = TypeUtils.loadClass("com.google.common.collect.ImmutableList");
            }
            if (GuavaSupport.CLASS_IMMUTABLE_LIST == null) {
                throw new JSONException("class not found : com.google.common.collect.ImmutableList");
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                if (GuavaSupport.FUNC_IMMUTABLE_LIST_OF_0 == null) {
                    try {
                        GuavaSupport.FUNC_IMMUTABLE_LIST_OF_0 = LambdaMiscCodec.createSupplier(GuavaSupport.CLASS_IMMUTABLE_LIST.getMethod("of", null));
                    } catch (NoSuchMethodException e) {
                        throw new JSONException("method not found : com.google.common.collect.ImmutableList.of", e);
                    }
                }
                return GuavaSupport.FUNC_IMMUTABLE_LIST_OF_0.get();
            }
            if (list.size() != 1) {
                if (GuavaSupport.FUNC_IMMUTABLE_LIST_COPY_OF == null) {
                    try {
                        GuavaSupport.FUNC_IMMUTABLE_LIST_COPY_OF = LambdaMiscCodec.createFunction(GuavaSupport.CLASS_IMMUTABLE_LIST.getMethod("copyOf", Collection.class));
                    } catch (NoSuchMethodException e2) {
                        throw new JSONException("method not found : com.google.common.collect.ImmutableList.copyOf", e2);
                    }
                }
                return GuavaSupport.FUNC_IMMUTABLE_LIST_COPY_OF.apply(list);
            }
            if (GuavaSupport.FUNC_IMMUTABLE_LIST_OF_1 == null) {
                try {
                    GuavaSupport.FUNC_IMMUTABLE_LIST_OF_1 = LambdaMiscCodec.createFunction(GuavaSupport.CLASS_IMMUTABLE_LIST.getMethod("of", Object.class));
                } catch (NoSuchMethodException e3) {
                    throw new JSONException("method not found : com.google.common.collect.ImmutableList.of", e3);
                }
            }
            return GuavaSupport.FUNC_IMMUTABLE_LIST_OF_1.apply(list.get(0));
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class ImmutableSetConvertFunction implements Function {
        @Override // java.util.function.Function
        public Object apply(Object obj) {
            if (GuavaSupport.CLASS_IMMUTABLE_SET == null) {
                GuavaSupport.CLASS_IMMUTABLE_SET = TypeUtils.loadClass("com.google.common.collect.ImmutableSet");
            }
            if (GuavaSupport.CLASS_IMMUTABLE_SET == null) {
                throw new JSONException("class not found : com.google.common.collect.ImmutableSet");
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                if (GuavaSupport.FUNC_IMMUTABLE_SET_OF_0 == null) {
                    try {
                        GuavaSupport.FUNC_IMMUTABLE_SET_OF_0 = LambdaMiscCodec.createSupplier(GuavaSupport.CLASS_IMMUTABLE_SET.getMethod("of", null));
                    } catch (NoSuchMethodException e) {
                        throw new JSONException("method not found : com.google.common.collect.ImmutableSet.of", e);
                    }
                }
                return GuavaSupport.FUNC_IMMUTABLE_SET_OF_0.get();
            }
            if (list.size() != 1) {
                if (GuavaSupport.FUNC_IMMUTABLE_SET_COPY_OF == null) {
                    try {
                        GuavaSupport.FUNC_IMMUTABLE_SET_COPY_OF = LambdaMiscCodec.createFunction(GuavaSupport.CLASS_IMMUTABLE_SET.getMethod("copyOf", Collection.class));
                    } catch (NoSuchMethodException e2) {
                        throw new JSONException("method not found : com.google.common.collect.ImmutableSet.copyOf", e2);
                    }
                }
                return GuavaSupport.FUNC_IMMUTABLE_SET_COPY_OF.apply(list);
            }
            if (GuavaSupport.FUNC_IMMUTABLE_SET_OF_1 == null) {
                try {
                    GuavaSupport.FUNC_IMMUTABLE_SET_OF_1 = LambdaMiscCodec.createFunction(GuavaSupport.CLASS_IMMUTABLE_SET.getMethod("of", Object.class));
                } catch (NoSuchMethodException e3) {
                    throw new JSONException("method not found : com.google.common.collect.ImmutableSet.of", e3);
                }
            }
            return GuavaSupport.FUNC_IMMUTABLE_SET_OF_1.apply(list.get(0));
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class ImmutableSingletonMapConvertFunction implements Function {
        @Override // java.util.function.Function
        public Object apply(Object obj) {
            if (GuavaSupport.CLASS_IMMUTABLE_MAP == null) {
                GuavaSupport.CLASS_IMMUTABLE_MAP = TypeUtils.loadClass("com.google.common.collect.ImmutableMap");
            }
            if (GuavaSupport.CLASS_IMMUTABLE_MAP == null) {
                throw new JSONException("class not found : com.google.common.collect.ImmutableMap");
            }
            Map map = (Map) obj;
            if (map.size() == 0) {
                if (GuavaSupport.FUNC_IMMUTABLE_MAP_OF_0 == null) {
                    try {
                        GuavaSupport.FUNC_IMMUTABLE_MAP_OF_0 = LambdaMiscCodec.createSupplier(GuavaSupport.CLASS_IMMUTABLE_MAP.getMethod("of", null));
                    } catch (NoSuchMethodException e) {
                        throw new JSONException("method not found : com.google.common.collect.ImmutableMap.of", e);
                    }
                }
                return GuavaSupport.FUNC_IMMUTABLE_MAP_OF_0.get();
            }
            if (map.size() != 1) {
                if (GuavaSupport.FUNC_IMMUTABLE_MAP_COPY_OF == null) {
                    try {
                        GuavaSupport.FUNC_IMMUTABLE_MAP_COPY_OF = LambdaMiscCodec.createFunction(GuavaSupport.CLASS_IMMUTABLE_MAP.getMethod("copyOf", Map.class));
                    } catch (NoSuchMethodException e2) {
                        throw new JSONException("method not found : com.google.common.collect.ImmutableBiMap.copyOf", e2);
                    }
                }
                return GuavaSupport.FUNC_IMMUTABLE_MAP_COPY_OF.apply(map);
            }
            if (GuavaSupport.FUNC_IMMUTABLE_MAP_OF_1 == null) {
                try {
                    Method method = GuavaSupport.CLASS_IMMUTABLE_MAP.getMethod("of", Object.class, Object.class);
                    method.setAccessible(true);
                    GuavaSupport.FUNC_IMMUTABLE_MAP_OF_1 = LambdaMiscCodec.createBiFunction(method);
                } catch (NoSuchMethodException e3) {
                    throw new JSONException("method not found : com.google.common.collect.ImmutableBiMap.of", e3);
                }
            }
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            return GuavaSupport.FUNC_IMMUTABLE_MAP_OF_1.apply(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class SingletonImmutableBiMapConvertFunction implements Function {
        @Override // java.util.function.Function
        public Object apply(Object obj) {
            if (GuavaSupport.FUNC_SINGLETON_IMMUTABLE_BIMAP == null) {
                try {
                    GuavaSupport.FUNC_SINGLETON_IMMUTABLE_BIMAP = LambdaMiscCodec.createBiFunction(TypeUtils.loadClass("com.google.common.collect.SingletonImmutableBiMap").getDeclaredConstructor(Object.class, Object.class));
                } catch (NoSuchMethodException | SecurityException e) {
                    throw new JSONException("method not found : com.google.common.collect.SingletonImmutableBiMap(Object, Object)", e);
                }
            }
            Map.Entry entry = (Map.Entry) ((Map) obj).entrySet().iterator().next();
            return GuavaSupport.FUNC_SINGLETON_IMMUTABLE_BIMAP.apply(entry.getKey(), entry.getValue());
        }
    }

    public static ObjectWriter createAsMapWriter(Class cls) {
        return new AsMapWriter(cls);
    }

    public static Function createConvertFunction(Class cls) {
        Method method;
        if ("com.google.common.collect.ArrayListMultimap".equals(cls.getName())) {
            if (CLASS_ARRAYLIST_MULTI_MAP == null) {
                CLASS_ARRAYLIST_MULTI_MAP = cls;
            }
            if (!METHOD_ARRAYLIST_MULTI_MAP_ERROR && FUNC_ARRAYLIST_MULTI_MAP_CREATE == null) {
                try {
                    FUNC_ARRAYLIST_MULTI_MAP_CREATE = LambdaMiscCodec.createSupplier(CLASS_ARRAYLIST_MULTI_MAP.getMethod("create", null));
                } catch (Throwable unused) {
                    METHOD_ARRAYLIST_MULTI_MAP_ERROR = true;
                }
            }
            if (!METHOD_ARRAYLIST_MULTI_MAP_ERROR && METHOD_ARRAYLIST_MULTI_MAP_PUT_ALL == null) {
                try {
                    METHOD_ARRAYLIST_MULTI_MAP_PUT_ALL = CLASS_ARRAYLIST_MULTI_MAP.getMethod("putAll", Object.class, Iterable.class);
                } catch (Throwable unused2) {
                    METHOD_ARRAYLIST_MULTI_MAP_ERROR = true;
                }
            }
            Supplier supplier = FUNC_ARRAYLIST_MULTI_MAP_CREATE;
            if (supplier != null && (method = METHOD_ARRAYLIST_MULTI_MAP_PUT_ALL) != null) {
                return new ArrayListMultimapConvertFunction(supplier, method);
            }
        }
        throw new JSONException(AbstractC3317feyxiexzfUjhhgtg.m4798Ujhhgtgfeyxiexzf(cls, "create map error : "));
    }

    public static Function immutableListConverter() {
        return new ImmutableListConvertFunction();
    }

    public static Function immutableMapConverter() {
        return new ImmutableSingletonMapConvertFunction();
    }

    public static Function immutableSetConverter() {
        return new ImmutableSetConvertFunction();
    }

    public static Function singletonBiMapConverter() {
        return new SingletonImmutableBiMapConvertFunction();
    }
}
