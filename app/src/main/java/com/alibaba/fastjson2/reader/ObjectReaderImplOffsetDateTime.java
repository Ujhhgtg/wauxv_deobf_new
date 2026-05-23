package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplOffsetDateTime extends DateTimeCodec implements ObjectReader {
    static final ObjectReaderImplOffsetDateTime INSTANCE = new ObjectReaderImplOffsetDateTime(null, null);

    public ObjectReaderImplOffsetDateTime(String str, Locale locale) {
        super(str, locale);
    }

    public static ObjectReaderImplOffsetDateTime of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectReaderImplOffsetDateTime(str, locale);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return OffsetDateTime.class;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        return readObject(jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        JSONReader.Context context = jSONReader.getContext();
        if (jSONReader.isInt()) {
            long int64Value = jSONReader.readInt64Value();
            if (this.formatUnixTime || context.isFormatUnixTime()) {
                int64Value *= 1000;
            }
            Instant instantOfEpochMilli = Instant.ofEpochMilli(int64Value);
            ZoneId zoneId = context.getZoneId();
            return OffsetDateTime.of(LocalDateTime.ofInstant(instantOfEpochMilli, zoneId), zoneId.getRules().getOffset(instantOfEpochMilli));
        }
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (this.format == null || this.yyyyMMddhhmmss19 || this.formatISO8601) {
            return jSONReader.readOffsetDateTime();
        }
        String string = jSONReader.readString();
        ZoneId zoneId2 = context.getZoneId();
        if (this.formatMillis || this.formatUnixTime) {
            long j2 = Long.parseLong(string);
            if (this.formatUnixTime) {
                j2 *= 1000;
            }
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(j2);
            return OffsetDateTime.of(LocalDateTime.ofInstant(instantOfEpochMilli2, zoneId2), zoneId2.getRules().getOffset(instantOfEpochMilli2));
        }
        DateTimeFormatter dateFormatter = getDateFormatter(jSONReader.getLocale());
        if (!this.formatHasHour) {
            LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.parse(string, dateFormatter), LocalTime.MIN);
            return OffsetDateTime.of(localDateTimeOf, zoneId2.getRules().getOffset(localDateTimeOf));
        }
        if (!this.formatHasDay) {
            return ZonedDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.parse(string, dateFormatter), zoneId2).toOffsetDateTime();
        }
        LocalDateTime localDateTime = LocalDateTime.parse(string, dateFormatter);
        return OffsetDateTime.of(localDateTime, zoneId2.getRules().getOffset(localDateTime));
    }
}
