package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplLocalDate extends DateTimeCodec implements ObjectReader {
    static final ObjectReaderImplLocalDate INSTANCE = new ObjectReaderImplLocalDate(null, null);

    public ObjectReaderImplLocalDate(String str, Locale locale) {
        super(str, locale);
    }

    public static ObjectReaderImplLocalDate of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectReaderImplLocalDate(str, locale);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return LocalDate.class;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.readLocalDate();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j);
        }
        JSONReader.Context context = jSONReader.getContext();
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (this.format == null || this.yyyyMMddhhmmss19 || this.formatISO8601 || jSONReader.isNumber()) {
            return jSONReader.readLocalDate();
        }
        String string = jSONReader.readString();
        if (string.isEmpty() || "null".equals(string)) {
            return null;
        }
        if (this.formatMillis || this.formatUnixTime) {
            long j2 = Long.parseLong(string);
            if (this.formatUnixTime) {
                j2 *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), context.getZoneId()).toLocalDate();
        }
        DateTimeFormatter dateFormatter = getDateFormatter(context.getLocale());
        if (this.formatHasHour) {
            return !this.formatHasDay ? LocalDate.of(1970, 1, 1) : LocalDateTime.parse(string, dateFormatter).toLocalDate();
        }
        return LocalDate.parse(string, dateFormatter);
    }
}
