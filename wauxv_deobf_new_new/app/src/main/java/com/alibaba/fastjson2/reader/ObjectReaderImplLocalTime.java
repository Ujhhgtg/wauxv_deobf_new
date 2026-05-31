package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplLocalTime extends DateTimeCodec implements ObjectReader {
    static final ObjectReaderImplLocalTime INSTANCE = new ObjectReaderImplLocalTime(null, null);

    public ObjectReaderImplLocalTime(String str, Locale locale) {
        super(str, locale);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return LocalTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.readLocalTime();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        JSONReader.Context context = jSONReader.getContext();
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.isInt()) {
            long int64Value = jSONReader.readInt64Value();
            if (this.formatUnixTime) {
                int64Value *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(int64Value), context.getZoneId()).toLocalTime();
        }
        if (this.format == null || jSONReader.isNumber()) {
            return jSONReader.readLocalTime();
        }
        if (this.yyyyMMddhhmmss19 || this.formatISO8601) {
            return jSONReader.readLocalDateTime().toLocalTime();
        }
        String string = jSONReader.readString();
        if (string.isEmpty()) {
            return null;
        }
        if (!this.formatMillis && !this.formatUnixTime) {
            DateTimeFormatter dateFormatter = getDateFormatter(context.getLocale());
            return this.formatHasDay ? LocalDateTime.parse(string, dateFormatter).toLocalTime() : LocalTime.parse(string, dateFormatter);
        }
        long j2 = Long.parseLong(string);
        if (this.formatUnixTime) {
            j2 *= 1000;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), context.getZoneId()).toLocalTime();
    }
}
