package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplLocalDateTime extends DateTimeCodec implements ObjectReader {
    static final ObjectReaderImplLocalDateTime INSTANCE = new ObjectReaderImplLocalDateTime(null, null);

    public ObjectReaderImplLocalDateTime(String str, Locale locale) {
        super(str, locale);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return LocalDateTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.readLocalDateTime();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        DateTimeFormatter dateFormatter;
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j);
        }
        JSONReader.Context context = jSONReader.getContext();
        if (jSONReader.isInt()) {
            if (!this.yyyyMMddhhmmss19 && !this.formatMillis && !this.formatISO8601 && !this.formatUnixTime && (dateFormatter = getDateFormatter()) != null) {
                return LocalDateTime.parse(jSONReader.readString(), dateFormatter);
            }
            long int64Value = jSONReader.readInt64Value();
            if (this.formatUnixTime) {
                int64Value *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(int64Value), context.getZoneId());
        }
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (this.format == null || this.yyyyMMdd8 || this.yyyyMMdd10 || this.yyyyMMddhhmmss19 || this.formatISO8601) {
            return jSONReader.readLocalDateTime();
        }
        String string = jSONReader.readString();
        if (string.isEmpty()) {
            return null;
        }
        if (this.formatMillis || this.formatUnixTime) {
            long j2 = Long.parseLong(string);
            if (this.formatUnixTime) {
                j2 *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), context.getZoneId());
        }
        DateTimeFormatter dateFormatter2 = getDateFormatter(context.getLocale());
        if (this.formatHasHour) {
            return !this.formatHasDay ? LocalDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(string, dateFormatter2)) : LocalDateTime.parse(string, dateFormatter2);
        }
        return LocalDateTime.of(LocalDate.parse(string, dateFormatter2), LocalTime.MIN);
    }
}
