package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONCreator;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.support.LambdaMiscCodec;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.lang.reflect.Type;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface ApacheLang3Support {

    /* JADX INFO: compiled from: obf */
    public static class PairReader implements ObjectReader {
        static final long LEFT = Fnv.hashCode64("left");
        static final long RIGHT = Fnv.hashCode64("right");
        final Type leftType;
        final Class objectClass;
        final BiFunction of;
        final Type rightType;

        public PairReader(Class cls, Type type, Type type2) {
            this.objectClass = cls;
            this.leftType = type;
            this.rightType = type2;
            try {
                this.of = LambdaMiscCodec.createBiFunction(cls.getMethod("of", Object.class, Object.class));
            } catch (NoSuchMethodException e) {
                throw new JSONException("Pair.of method not found", e);
            }
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
            Object obj2;
            Object fieldName = null;
            if (jSONReader.nextIfNull()) {
                return null;
            }
            if (jSONReader.nextIfMatch(-110)) {
                long typeHashCode = jSONReader.readTypeHashCode();
                if (typeHashCode != 4645080105124911238L && typeHashCode != -2802985644706367574L && typeHashCode != 8310287657375596772L) {
                    throw new JSONException("not support inputType : " + jSONReader.getString());
                }
            }
            if (jSONReader.nextIfObjectStart()) {
                obj2 = null;
                for (int i = 0; i < 100 && !jSONReader.nextIfObjectEnd(); i++) {
                    if (jSONReader.isString()) {
                        long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                        if (fieldNameHashCode == LEFT) {
                            fieldName = jSONReader.read(this.leftType);
                        } else if (fieldNameHashCode == RIGHT) {
                            obj2 = jSONReader.read(this.rightType);
                        } else if (i == 0) {
                            fieldName = jSONReader.getFieldName();
                            obj2 = jSONReader.read(this.rightType);
                        } else {
                            jSONReader.skipValue();
                        }
                    } else {
                        if (i != 0) {
                            throw new JSONException(jSONReader.info("not support input"));
                        }
                        fieldName = jSONReader.read(this.leftType);
                        obj2 = jSONReader.read(this.rightType);
                    }
                }
            } else {
                if (!jSONReader.isArray()) {
                    throw new JSONException(jSONReader.info("not support input"));
                }
                if (jSONReader.startArray() != 2) {
                    throw new JSONException(jSONReader.info("not support input"));
                }
                fieldName = jSONReader.read(this.leftType);
                obj2 = jSONReader.read(this.rightType);
            }
            return this.of.apply(fieldName, obj2);
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
            Object obj2;
            Object fieldName = null;
            if (jSONReader.nextIfNull()) {
                return null;
            }
            if (jSONReader.nextIfObjectStart()) {
                obj2 = null;
                for (int i = 0; i < 100 && !jSONReader.nextIfObjectEnd(); i++) {
                    if (jSONReader.isString()) {
                        long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                        if (fieldNameHashCode == LEFT) {
                            fieldName = jSONReader.read(this.leftType);
                        } else if (fieldNameHashCode == RIGHT) {
                            obj2 = jSONReader.read(this.rightType);
                        } else if (i == 0) {
                            fieldName = jSONReader.getFieldName();
                            jSONReader.nextIfMatch(':');
                            obj2 = jSONReader.read(this.rightType);
                        } else {
                            jSONReader.skipValue();
                        }
                    } else {
                        if (i != 0) {
                            throw new JSONException(jSONReader.info("not support input"));
                        }
                        fieldName = jSONReader.read(this.leftType);
                        jSONReader.nextIfMatch(':');
                        obj2 = jSONReader.read(this.rightType);
                    }
                }
            } else {
                if (!jSONReader.nextIfArrayStart()) {
                    throw new JSONException(jSONReader.info("not support input"));
                }
                fieldName = jSONReader.read(this.leftType);
                obj2 = jSONReader.read(this.rightType);
                if (!jSONReader.nextIfArrayEnd()) {
                    throw new JSONException(jSONReader.info("not support input"));
                }
            }
            return this.of.apply(fieldName, obj2);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class PairWriter implements ObjectWriter {
        static final byte[] leftName = JSONB.toBytes("left");
        static final byte[] rightName = JSONB.toBytes("right");
        Function left;
        final Class objectClass;
        Function right;
        final String typeName;
        final long typeNameHash;
        byte[] typeNameJSONB;

        public PairWriter(Class cls) {
            this.objectClass = cls;
            String name = cls.getName();
            this.typeName = name;
            this.typeNameHash = Fnv.hashCode64(name);
        }

        public Object getLeft(Object obj) {
            Class<?> cls = obj.getClass();
            if (this.left == null) {
                try {
                    this.left = LambdaMiscCodec.createFunction(cls.getMethod("getLeft", null));
                } catch (NoSuchMethodException e) {
                    throw new JSONException("getLeft method not found", e);
                }
            }
            return this.left.apply(obj);
        }

        public Object getRight(Object obj) {
            Class<?> cls = obj.getClass();
            if (this.right == null) {
                try {
                    this.right = LambdaMiscCodec.createFunction(cls.getMethod("getRight", null));
                } catch (NoSuchMethodException e) {
                    throw new JSONException("getRight method not found", e);
                }
            }
            return this.right.apply(obj);
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            if (obj == null) {
                jSONWriter.writeNull();
                return;
            }
            Object left = getLeft(obj);
            Object right = getRight(obj);
            jSONWriter.startObject();
            if ((jSONWriter.getFeatures(j) & JSONWriter.Feature.WritePairAsJavaBean.mask) != 0) {
                jSONWriter.writeName("left");
                jSONWriter.writeColon();
                jSONWriter.writeAny(left);
                jSONWriter.writeName("right");
            } else {
                jSONWriter.writeNameAny(left);
            }
            jSONWriter.writeColon();
            jSONWriter.writeAny(right);
            jSONWriter.endObject();
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            if (obj == null) {
                jSONWriter.writeNull();
                return;
            }
            if ((jSONWriter.getFeatures(j) & JSONWriter.Feature.WriteClassName.mask) != 0) {
                if (this.typeNameJSONB == null) {
                    this.typeNameJSONB = JSONB.toBytes(this.typeName);
                }
                jSONWriter.writeTypeName(this.typeNameJSONB, this.typeNameHash);
            }
            jSONWriter.startObject();
            Object left = getLeft(obj);
            Object right = getRight(obj);
            jSONWriter.writeNameRaw(leftName, PairReader.LEFT);
            jSONWriter.writeAny(left);
            jSONWriter.writeNameRaw(rightName, PairReader.RIGHT);
            jSONWriter.writeAny(right);
            jSONWriter.endObject();
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface TripleMixIn<L, M, R> {
        @JSONCreator
        static <L, M, R> Object of(L l, M m, R r) {
            return null;
        }
    }
}
