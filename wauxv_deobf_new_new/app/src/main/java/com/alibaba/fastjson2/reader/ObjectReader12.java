package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReader12<T> extends ObjectReaderAdapter<T> {
    protected final FieldReader fieldReader0;
    protected final FieldReader fieldReader1;
    protected final FieldReader fieldReader10;
    protected final FieldReader fieldReader11;
    protected final FieldReader fieldReader2;
    protected final FieldReader fieldReader3;
    protected final FieldReader fieldReader4;
    protected final FieldReader fieldReader5;
    protected final FieldReader fieldReader6;
    protected final FieldReader fieldReader7;
    protected final FieldReader fieldReader8;
    protected final FieldReader fieldReader9;
    final long hashCode0;
    final long hashCode0LCase;
    final long hashCode1;
    final long hashCode10;
    final long hashCode10LCase;
    final long hashCode11;
    final long hashCode11LCase;
    final long hashCode1LCase;
    final long hashCode2;
    final long hashCode2LCase;
    final long hashCode3;
    final long hashCode3LCase;
    final long hashCode4;
    final long hashCode4LCase;
    final long hashCode5;
    final long hashCode5LCase;
    final long hashCode6;
    final long hashCode6LCase;
    final long hashCode7;
    final long hashCode7LCase;
    final long hashCode8;
    final long hashCode8LCase;
    final long hashCode9;
    final long hashCode9LCase;
    protected ObjectReader objectReader0;
    protected ObjectReader objectReader1;
    protected ObjectReader objectReader10;
    protected ObjectReader objectReader11;
    protected ObjectReader objectReader2;
    protected ObjectReader objectReader3;
    protected ObjectReader objectReader4;
    protected ObjectReader objectReader5;
    protected ObjectReader objectReader6;
    protected ObjectReader objectReader7;
    protected ObjectReader objectReader8;
    protected ObjectReader objectReader9;

    public ObjectReader12(Class cls, String str, String str2, long j, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        this(cls, str, str2, j, null, supplier, function, fieldReaderArr);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReader(long j) {
        if (j == this.hashCode0) {
            return this.fieldReader0;
        }
        if (j == this.hashCode1) {
            return this.fieldReader1;
        }
        if (j == this.hashCode2) {
            return this.fieldReader2;
        }
        if (j == this.hashCode3) {
            return this.fieldReader3;
        }
        if (j == this.hashCode4) {
            return this.fieldReader4;
        }
        if (j == this.hashCode5) {
            return this.fieldReader5;
        }
        if (j == this.hashCode6) {
            return this.fieldReader6;
        }
        if (j == this.hashCode7) {
            return this.fieldReader7;
        }
        if (j == this.hashCode8) {
            return this.fieldReader8;
        }
        if (j == this.hashCode9) {
            return this.fieldReader9;
        }
        if (j == this.hashCode10) {
            return this.fieldReader10;
        }
        if (j == this.hashCode11) {
            return this.fieldReader11;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReaderLCase(long j) {
        if (j == this.hashCode0LCase) {
            return this.fieldReader0;
        }
        if (j == this.hashCode1LCase) {
            return this.fieldReader1;
        }
        if (j == this.hashCode2LCase) {
            return this.fieldReader2;
        }
        if (j == this.hashCode3LCase) {
            return this.fieldReader3;
        }
        if (j == this.hashCode4LCase) {
            return this.fieldReader4;
        }
        if (j == this.hashCode5LCase) {
            return this.fieldReader5;
        }
        if (j == this.hashCode6LCase) {
            return this.fieldReader6;
        }
        if (j == this.hashCode7LCase) {
            return this.fieldReader7;
        }
        if (j == this.hashCode8LCase) {
            return this.fieldReader8;
        }
        if (j == this.hashCode9LCase) {
            return this.fieldReader9;
        }
        if (j == this.hashCode10LCase) {
            return this.fieldReader10;
        }
        if (j == this.hashCode11LCase) {
            return this.fieldReader11;
        }
        return null;
    }

    public ObjectReader12(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        super(cls, str, str2, j, jSONSchema, supplier, function, fieldReaderArr);
        FieldReader fieldReader = fieldReaderArr[0];
        this.fieldReader0 = fieldReader;
        FieldReader fieldReader2 = fieldReaderArr[1];
        this.fieldReader1 = fieldReader2;
        FieldReader fieldReader3 = fieldReaderArr[2];
        this.fieldReader2 = fieldReader3;
        FieldReader fieldReader4 = fieldReaderArr[3];
        this.fieldReader3 = fieldReader4;
        FieldReader fieldReader5 = fieldReaderArr[4];
        this.fieldReader4 = fieldReader5;
        FieldReader fieldReader6 = fieldReaderArr[5];
        this.fieldReader5 = fieldReader6;
        FieldReader fieldReader7 = fieldReaderArr[6];
        this.fieldReader6 = fieldReader7;
        FieldReader fieldReader8 = fieldReaderArr[7];
        this.fieldReader7 = fieldReader8;
        FieldReader fieldReader9 = fieldReaderArr[8];
        this.fieldReader8 = fieldReader9;
        FieldReader fieldReader10 = fieldReaderArr[9];
        this.fieldReader9 = fieldReader10;
        FieldReader fieldReader11 = fieldReaderArr[10];
        this.fieldReader10 = fieldReader11;
        FieldReader fieldReader12 = fieldReaderArr[11];
        this.fieldReader11 = fieldReader12;
        this.hashCode0 = fieldReader.fieldNameHash;
        this.hashCode1 = fieldReader2.fieldNameHash;
        this.hashCode2 = fieldReader3.fieldNameHash;
        this.hashCode3 = fieldReader4.fieldNameHash;
        this.hashCode4 = fieldReader5.fieldNameHash;
        this.hashCode5 = fieldReader6.fieldNameHash;
        this.hashCode6 = fieldReader7.fieldNameHash;
        this.hashCode7 = fieldReader8.fieldNameHash;
        this.hashCode8 = fieldReader9.fieldNameHash;
        this.hashCode9 = fieldReader10.fieldNameHash;
        this.hashCode10 = fieldReader11.fieldNameHash;
        this.hashCode11 = fieldReader12.fieldNameHash;
        this.hashCode0LCase = fieldReader.fieldNameHashLCase;
        this.hashCode1LCase = fieldReader2.fieldNameHashLCase;
        this.hashCode2LCase = fieldReader3.fieldNameHashLCase;
        this.hashCode3LCase = fieldReader4.fieldNameHashLCase;
        this.hashCode4LCase = fieldReader5.fieldNameHashLCase;
        this.hashCode5LCase = fieldReader6.fieldNameHashLCase;
        this.hashCode6LCase = fieldReader7.fieldNameHashLCase;
        this.hashCode7LCase = fieldReader8.fieldNameHashLCase;
        this.hashCode8LCase = fieldReader9.fieldNameHashLCase;
        this.hashCode9LCase = fieldReader10.fieldNameHashLCase;
        this.hashCode10LCase = fieldReader11.fieldNameHashLCase;
        this.hashCode11LCase = fieldReader12.fieldNameHashLCase;
    }
}
