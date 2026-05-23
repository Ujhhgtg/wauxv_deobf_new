package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class JSONPathCompilerReflect implements JSONFactory.JSONPathCompiler {
    static final JSONPathCompilerReflect INSTANCE = new JSONPathCompilerReflect();

    /* JADX INFO: compiled from: obf */
    public static class NameSegmentTyped extends JSONPathSegmentName {
        final FieldReader fieldReader;
        final FieldWriter fieldWriter;
        final Class objectClass;

        public NameSegmentTyped(Class cls, ObjectReader objectReader, FieldReader fieldReader, ObjectWriter objectWriter, FieldWriter fieldWriter, String str, long j) {
            super(str, j);
            this.objectClass = cls;
            this.fieldReader = fieldReader;
            this.fieldWriter = fieldWriter;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegmentName, com.alibaba.fastjson2.JSONPathSegment
        public /* bridge */ /* synthetic */ void accept(JSONReader jSONReader, JSONPath.Context context) {
            super.accept(jSONReader, context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegmentName, com.alibaba.fastjson2.JSONPathSegment
        public /* bridge */ /* synthetic */ boolean contains(JSONPath.Context context) {
            return super.contains(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegmentName
        public /* bridge */ /* synthetic */ boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegmentName, com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            FieldWriter fieldWriter = this.fieldWriter;
            if (fieldWriter == null) {
                throw new UnsupportedOperationException();
            }
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (obj == null) {
                return;
            }
            context.value = fieldWriter.getFieldValue(obj);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegmentName
        public /* bridge */ /* synthetic */ int hashCode() {
            return super.hashCode();
        }

        @Override // com.alibaba.fastjson2.JSONPathSegmentName, com.alibaba.fastjson2.JSONPathSegment
        public /* bridge */ /* synthetic */ boolean remove(JSONPath.Context context) {
            return super.remove(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegmentName, com.alibaba.fastjson2.JSONPathSegment
        public /* bridge */ /* synthetic */ void set(JSONPath.Context context, Object obj) {
            super.set(context, obj);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegmentName, com.alibaba.fastjson2.JSONPathSegment
        public /* bridge */ /* synthetic */ void setCallback(JSONPath.Context context, BiFunction biFunction) {
            super.setCallback(context, biFunction);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public /* bridge */ /* synthetic */ void setInt(JSONPath.Context context, int i) {
            super.setInt(context, i);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public /* bridge */ /* synthetic */ void setLong(JSONPath.Context context, long j) {
            super.setLong(context, j);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegmentName
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class TwoNameSegmentTypedPath extends JSONPathTwoSegment {
        final NameSegmentTyped first;
        final NameSegmentTyped second;

        public TwoNameSegmentTypedPath(String str, NameSegmentTyped nameSegmentTyped, NameSegmentTyped nameSegmentTyped2) {
            super(str, nameSegmentTyped, nameSegmentTyped2, new JSONPath.Feature[0]);
            this.first = nameSegmentTyped;
            this.second = nameSegmentTyped2;
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public /* bridge */ /* synthetic */ boolean contains(Object obj) {
            return super.contains(obj);
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public /* bridge */ /* synthetic */ boolean endsWithFilter() {
            return super.endsWithFilter();
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment
        public /* bridge */ /* synthetic */ boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public Object eval(Object obj) {
            Object fieldValue = this.first.fieldWriter.getFieldValue(obj);
            if (fieldValue == null) {
                return null;
            }
            return this.second.fieldWriter.getFieldValue(fieldValue);
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public /* bridge */ /* synthetic */ Object extract(JSONReader jSONReader) {
            return super.extract(jSONReader);
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public /* bridge */ /* synthetic */ String extractScalar(JSONReader jSONReader) {
            return super.extractScalar(jSONReader);
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public /* bridge */ /* synthetic */ JSONPath getParent() {
            return super.getParent();
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment
        public /* bridge */ /* synthetic */ int hashCode() {
            return super.hashCode();
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public /* bridge */ /* synthetic */ boolean isRef() {
            return super.isRef();
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public /* bridge */ /* synthetic */ boolean remove(Object obj) {
            return super.remove(obj);
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public /* bridge */ /* synthetic */ void set(Object obj, Object obj2, JSONReader.Feature[] featureArr) {
            super.set(obj, obj2, featureArr);
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public void setCallback(Object obj, BiFunction biFunction) {
            Object fieldValue;
            Object objApply;
            Object fieldValue2 = this.first.fieldWriter.getFieldValue(obj);
            if (fieldValue2 == null || (objApply = biFunction.apply(fieldValue2, (fieldValue = this.second.fieldWriter.getFieldValue(fieldValue2)))) == fieldValue) {
                return;
            }
            FieldReader fieldReader = this.second.fieldReader;
            if (fieldReader == null) {
                throw new UnsupportedOperationException();
            }
            fieldReader.accept(fieldValue2, objApply);
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public void setInt(Object obj, int i) {
            Object fieldValue = this.first.fieldWriter.getFieldValue(obj);
            if (fieldValue == null) {
                return;
            }
            this.second.fieldReader.accept(fieldValue, i);
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public void setLong(Object obj, long j) {
            Object fieldValue = this.first.fieldWriter.getFieldValue(obj);
            if (fieldValue == null) {
                return;
            }
            this.second.fieldReader.accept(fieldValue, j);
        }

        @Override // com.alibaba.fastjson2.JSONPathTwoSegment, com.alibaba.fastjson2.JSONPath
        public void set(Object obj, Object obj2) {
            Object fieldValue = this.first.fieldWriter.getFieldValue(obj);
            if (fieldValue == null) {
                return;
            }
            this.second.fieldReader.accept(fieldValue, obj2);
        }
    }

    @Override // com.alibaba.fastjson2.JSONFactory.JSONPathCompiler
    public JSONPath compile(Class cls, JSONPath jSONPath) {
        if (jSONPath instanceof JSONPathSingleName) {
            return compileSingleNamePath(cls, (JSONPathSingleName) jSONPath);
        }
        if (!(jSONPath instanceof JSONPathTwoSegment)) {
            return jSONPath;
        }
        JSONPathTwoSegment jSONPathTwoSegment = (JSONPathTwoSegment) jSONPath;
        JSONPathSegment jSONPathSegmentCompile = compile(cls, jSONPath, jSONPathTwoSegment.first, null);
        JSONPathSegment jSONPathSegmentCompile2 = compile(cls, jSONPath, jSONPathTwoSegment.second, jSONPathSegmentCompile);
        if (jSONPathSegmentCompile == jSONPathTwoSegment.first && jSONPathSegmentCompile2 == jSONPathTwoSegment.second) {
            return jSONPath;
        }
        return ((jSONPathSegmentCompile instanceof NameSegmentTyped) && (jSONPathSegmentCompile2 instanceof NameSegmentTyped)) ? new TwoNameSegmentTypedPath(jSONPathTwoSegment.path, (NameSegmentTyped) jSONPathSegmentCompile, (NameSegmentTyped) jSONPathSegmentCompile2) : new JSONPathTwoSegment(jSONPathTwoSegment.path, jSONPathSegmentCompile, jSONPathSegmentCompile2, new JSONPath.Feature[0]);
    }

    public JSONPath compileSingleNamePath(Class cls, JSONPathSingleName jSONPathSingleName) {
        String str = jSONPathSingleName.name;
        ObjectReader objectReader = jSONPathSingleName.getReaderContext().getObjectReader(cls);
        FieldReader fieldReader = objectReader.getFieldReader(str);
        ObjectWriter objectWriter = jSONPathSingleName.getWriterContext().getObjectWriter(cls);
        return new SingleNamePathTyped(jSONPathSingleName.path, cls, objectReader, fieldReader, objectWriter, objectWriter.getFieldWriter(str));
    }

    /* JADX INFO: compiled from: obf */
    public static class SingleNamePathTyped extends JSONPath {
        final FieldReader fieldReader;
        final FieldWriter fieldWriter;
        final Class objectClass;
        final ObjectReader objectReader;
        final ObjectWriter objectWriter;

        public SingleNamePathTyped(String str, Class cls, ObjectReader objectReader, FieldReader fieldReader, ObjectWriter objectWriter, FieldWriter fieldWriter) {
            super(str, new JSONPath.Feature[0]);
            this.objectClass = cls;
            this.objectReader = objectReader;
            this.fieldReader = fieldReader;
            this.objectWriter = objectWriter;
            this.fieldWriter = fieldWriter;
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public boolean contains(Object obj) {
            FieldWriter fieldWriter = this.fieldWriter;
            return (fieldWriter == null || fieldWriter.getFieldValue(obj) == null) ? false : true;
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public Object eval(Object obj) {
            FieldWriter fieldWriter = this.fieldWriter;
            if (fieldWriter != null) {
                return fieldWriter.getFieldValue(obj);
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public Object extract(JSONReader jSONReader) {
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public String extractScalar(JSONReader jSONReader) {
            throw new UnsupportedOperationException();
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
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void set(Object obj, Object obj2) {
            FieldReader fieldReader = this.fieldReader;
            if (fieldReader == null) {
                throw new UnsupportedOperationException();
            }
            fieldReader.accept(obj, obj2);
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void setCallback(Object obj, BiFunction biFunction) {
            FieldWriter fieldWriter = this.fieldWriter;
            if (fieldWriter == null) {
                throw new UnsupportedOperationException();
            }
            Object fieldValue = fieldWriter.getFieldValue(obj);
            Object objApply = biFunction.apply(obj, fieldValue);
            if (objApply == fieldValue) {
                return;
            }
            FieldReader fieldReader = this.fieldReader;
            if (fieldReader == null) {
                throw new UnsupportedOperationException();
            }
            fieldReader.accept(obj, objApply);
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void setInt(Object obj, int i) {
            FieldReader fieldReader = this.fieldReader;
            if (fieldReader == null) {
                throw new UnsupportedOperationException();
            }
            fieldReader.accept(obj, i);
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void setLong(Object obj, long j) {
            FieldReader fieldReader = this.fieldReader;
            if (fieldReader == null) {
                throw new UnsupportedOperationException();
            }
            fieldReader.accept(obj, j);
        }

        @Override // com.alibaba.fastjson2.JSONPath
        public void set(Object obj, Object obj2, JSONReader.Feature... featureArr) {
            FieldReader fieldReader = this.fieldReader;
            if (fieldReader != null) {
                fieldReader.accept(obj, obj2);
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    public JSONPathSegment compile(Class cls, JSONPath jSONPath, JSONPathSegment jSONPathSegment, JSONPathSegment jSONPathSegment2) {
        ObjectReader objectReader;
        FieldReader fieldReader;
        ObjectReader objectReader2;
        FieldReader fieldReader2;
        ObjectWriter objectWriter;
        FieldWriter fieldWriter;
        ObjectWriter objectWriter2;
        if (!(jSONPathSegment instanceof JSONPathSegmentName)) {
            return jSONPathSegment;
        }
        JSONPathSegmentName jSONPathSegmentName = (JSONPathSegmentName) jSONPathSegment;
        String str = jSONPathSegmentName.name;
        JSONReader.Context readerContext = jSONPath.getReaderContext();
        JSONWriter.Context writerContext = jSONPath.getWriterContext();
        if (jSONPathSegment2 == null) {
            objectReader2 = readerContext.getObjectReader(cls);
        } else {
            if (!(jSONPathSegment2 instanceof NameSegmentTyped) || (fieldReader = ((NameSegmentTyped) jSONPathSegment2).fieldReader) == null) {
                objectReader = null;
            } else {
                objectReader2 = readerContext.getObjectReader(fieldReader.fieldType);
            }
            if (objectReader != null) {
                fieldReader2 = objectReader.getFieldReader(str);
            } else {
                fieldReader2 = null;
            }
            if (jSONPathSegment2 == null) {
                objectWriter2 = writerContext.getObjectWriter(cls);
            } else {
                if ((jSONPathSegment2 instanceof NameSegmentTyped) || (fieldWriter = ((NameSegmentTyped) jSONPathSegment2).fieldWriter) == null) {
                    objectWriter = null;
                } else {
                    objectWriter2 = writerContext.getObjectWriter(fieldWriter.fieldClass);
                }
                return new NameSegmentTyped(cls, objectReader, fieldReader2, objectWriter, objectWriter != null ? objectWriter.getFieldWriter(str) : null, str, jSONPathSegmentName.nameHashCode);
            }
            objectWriter = objectWriter2;
            return new NameSegmentTyped(cls, objectReader, fieldReader2, objectWriter, objectWriter != null ? objectWriter.getFieldWriter(str) : null, str, jSONPathSegmentName.nameHashCode);
        }
        objectReader = objectReader2;
        if (objectReader != null) {
            fieldReader2 = objectReader.getFieldReader(str);
        } else {
            fieldReader2 = null;
        }
        if (jSONPathSegment2 == null) {
            objectWriter2 = writerContext.getObjectWriter(cls);
        } else {
            if (jSONPathSegment2 instanceof NameSegmentTyped) {
            }
            objectWriter = null;
            return new NameSegmentTyped(cls, objectReader, fieldReader2, objectWriter, objectWriter != null ? objectWriter.getFieldWriter(str) : null, str, jSONPathSegmentName.nameHashCode);
        }
        objectWriter = objectWriter2;
        return new NameSegmentTyped(cls, objectReader, fieldReader2, objectWriter, objectWriter != null ? objectWriter.getFieldWriter(str) : null, str, jSONPathSegmentName.nameHashCode);
    }
}
