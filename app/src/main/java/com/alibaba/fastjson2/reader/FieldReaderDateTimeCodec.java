package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.IOUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.function.BiConsumer;
import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldReaderDateTimeCodec<T> extends FieldReader<T> {
    final ObjectReader dateReader;
    final boolean formatMillis;
    final boolean formatUnixTime;

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    public FieldReaderDateTimeCodec(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer, ObjectReader objectReader) {
        boolean z;
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field, biConsumer, null, null);
        this.dateReader = objectReader;
        boolean z2 = false;
        if (str2 != null) {
            z = true;
            if (!str2.equals("millis")) {
                if (str2.equals("unixtime")) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        this.formatUnixTime = z2;
        this.formatMillis = z;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) {
        if (obj == null) {
            acceptNull(t);
            return;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                acceptNull(t);
                return;
            }
            if ((this.format == null || this.formatUnixTime || this.formatMillis) && IOUtils.isNumber(str)) {
                long j = Long.parseLong(str);
                if (this.formatUnixTime) {
                    j *= 1000;
                }
                accept((Object) t, j);
                return;
            }
            obj = DateUtils.parseDate(str, this.format, DateUtils.DEFAULT_ZONE_ID);
        }
        if (obj instanceof Date) {
            accept((Object) t, (Date) obj);
            return;
        }
        if (obj instanceof Instant) {
            accept((Object) t, (Instant) obj);
            return;
        }
        if (obj instanceof Long) {
            accept((Object) t, ((Long) obj).longValue());
        } else if (obj instanceof LocalDateTime) {
            accept((Object) t, (LocalDateTime) obj);
        } else {
            if (!(obj instanceof ZonedDateTime)) {
                throw new JSONException(AbstractC1194.m2783(obj, new StringBuilder("not support value ")));
            }
            accept((Object) t, (ZonedDateTime) obj);
        }
    }

    public abstract void accept(T t, Instant instant);

    public abstract void accept(T t, LocalDateTime localDateTime);

    public abstract void accept(T t, ZonedDateTime zonedDateTime);

    public abstract void accept(T t, Date date);

    public abstract void acceptNull(T t);

    public abstract Object apply(long j);

    public abstract Object apply(Instant instant);

    public abstract Object apply(LocalDateTime localDateTime);

    public abstract Object apply(ZonedDateTime zonedDateTime);

    public abstract Object apply(Date date);

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final ObjectReader getObjectReader(JSONReader jSONReader) {
        return this.dateReader;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final Object readFieldValue(JSONReader jSONReader) {
        return this.dateReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(Class cls) {
        return cls == Date.class || cls == String.class;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public final ObjectReader getObjectReader(JSONReader.Context context) {
        return this.dateReader;
    }
}
