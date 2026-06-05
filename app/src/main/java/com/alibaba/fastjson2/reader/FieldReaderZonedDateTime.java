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
public class FieldReaderZonedDateTime<T> extends FieldReaderDateTimeCodec<T> {
    public FieldReaderZonedDateTime(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Field field, Method method, BiConsumer<T, ZonedDateTime> biConsumer) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field, biConsumer, ObjectReaderImplZonedDateTime.of(str2, locale));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        super.accept(obj, obj2);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void acceptNull(T t) {
        accept((Object) t, (ZonedDateTime) null);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(ZonedDateTime zonedDateTime) {
        return zonedDateTime;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final void readFieldValue(JSONReader jSONReader, T t) {
        accept((Object) t, (ZonedDateTime) this.dateReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final void readFieldValueJSONB(JSONReader jSONReader, T t) {
        accept((Object) t, jSONReader.readZonedDateTime());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ boolean supportAcceptType(Class cls) {
        return super.supportAcceptType(cls);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T t, Date date) {
        accept((Object) t, ZonedDateTime.ofInstant(date.toInstant(), DateUtils.DEFAULT_ZONE_ID));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(Date date) {
        return ZonedDateTime.ofInstant(date.toInstant(), DateUtils.DEFAULT_ZONE_ID);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(Instant instant) {
        return ZonedDateTime.ofInstant(instant, DateUtils.DEFAULT_ZONE_ID);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T t, Instant instant) {
        accept((Object) t, ZonedDateTime.ofInstant(instant, DateUtils.DEFAULT_ZONE_ID));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(long j) {
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(j), DateUtils.DEFAULT_ZONE_ID);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T t, LocalDateTime localDateTime) {
        accept((Object) t, ZonedDateTime.of(localDateTime, DateUtils.DEFAULT_ZONE_ID));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public Object apply(LocalDateTime localDateTime) {
        return localDateTime.atZone(DateUtils.DEFAULT_ZONE_ID);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, long j) {
        accept((Object) t, ZonedDateTime.ofInstant(Instant.ofEpochMilli(j), DateUtils.DEFAULT_ZONE_ID));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderDateTimeCodec
    public void accept(T t, ZonedDateTime zonedDateTime) {
        if (zonedDateTime != null || (this.features & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            this.propertyAccessor.setObject(t, zonedDateTime);
        }
    }
}
