package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.DateUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class FieldReaderLocalDateTime<T> extends FieldReaderDateTimeCodec<T> {
    public FieldReaderLocalDateTime(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Field field, Method method, BiConsumer<T, ZonedDateTime> biConsumer) {
        Locale locale2;
        ObjectReaderImplLocalDateTime objectReaderImplLocalDateTime;
        if (str2 != null) {
            locale2 = locale;
            objectReaderImplLocalDateTime = new ObjectReaderImplLocalDateTime(str2, locale2);
        } else {
            locale2 = locale;
            objectReaderImplLocalDateTime = ObjectReaderImplLocalDateTime.INSTANCE;
        }
        super(str, type, cls, i, j, str2, locale2, obj, jSONSchema, method, field, biConsumer, objectReaderImplLocalDateTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        super.accept(obj, obj2);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void acceptNull(Object obj) {
        accept(obj, (LocalDateTime) null);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(LocalDateTime localDateTime) {
        return localDateTime;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, Object obj) {
        accept(obj, jSONReader.jsonb ? (LocalDateTime) this.dateReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features) : (LocalDateTime) this.dateReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec, com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(Class cls) {
        Class cls2 = this.fieldClass;
        return cls2 == Instant.class || cls2 == Long.class;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(Object obj, long j) {
        accept(obj, (LocalDateTime) Instant.ofEpochMilli(j).atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(Date date) {
        return date.toInstant().atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime();
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(Instant instant) {
        return instant.atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(Object obj, Date date) {
        accept(obj, (LocalDateTime) date.toInstant().atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(ZonedDateTime zonedDateTime) {
        return zonedDateTime.toLocalDateTime();
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(long j) {
        return Instant.ofEpochMilli(j).atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(Object obj, Instant instant) {
        accept(obj, (LocalDateTime) instant.atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.time.LocalDateTime] */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(Object obj, ZonedDateTime zonedDateTime) {
        accept(obj, (LocalDateTime) zonedDateTime.toLocalDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(Object obj, LocalDateTime localDateTime) {
        if (localDateTime != null || (this.features & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            this.propertyAccessor.setObject(obj, localDateTime);
        }
    }
}
