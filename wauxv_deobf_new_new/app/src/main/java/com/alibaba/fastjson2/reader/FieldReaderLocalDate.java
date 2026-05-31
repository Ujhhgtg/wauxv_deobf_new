package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderLocalDate extends FieldReaderObject {
    public FieldReaderLocalDate(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field, biConsumer);
        this.initReader = ObjectReaderImplLocalDate.of(str2, locale);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getObjectReader(JSONReader jSONReader) {
        return this.initReader;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, Object obj) {
        LocalDate localDate;
        if (jSONReader.jsonb) {
            localDate = (LocalDate) this.initReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features);
        } else {
            localDate = this.format != null ? (LocalDate) this.initReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features) : jSONReader.readLocalDate();
        }
        accept(obj, localDate);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getObjectReader(JSONReader.Context context) {
        return this.initReader;
    }
}
