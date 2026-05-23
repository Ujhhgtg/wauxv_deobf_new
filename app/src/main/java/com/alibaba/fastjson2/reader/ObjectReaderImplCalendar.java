package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplCalendar extends DateTimeCodec implements ObjectReader {
    static final ObjectReaderImplCalendar INSTANCE = new ObjectReaderImplCalendar(null, null);

    public ObjectReaderImplCalendar(String str, Locale locale) {
        super(str, locale);
    }

    public static ObjectReaderImplCalendar of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectReaderImplCalendar(str, locale);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return Calendar.class;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.isInt()) {
            long int64Value = jSONReader.readInt64Value();
            if (this.formatUnixTime) {
                int64Value *= 1000;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(int64Value);
            return calendar;
        }
        if (jSONReader.readIfNull()) {
            return null;
        }
        long millisFromString = jSONReader.readMillisFromString();
        if (this.formatUnixTime) {
            millisFromString *= 1000;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(millisFromString);
        return calendar2;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        DateTimeFormatter dateFormatter;
        if (!jSONReader.isString()) {
            if (jSONReader.readIfNull()) {
                return null;
            }
            long int64Value = jSONReader.readInt64Value();
            if (this.formatUnixTime || jSONReader.getContext().isFormatUnixTime()) {
                int64Value *= 1000;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(int64Value);
            return calendar;
        }
        if (this.format != null && (dateFormatter = getDateFormatter()) != null) {
            String string = jSONReader.readString();
            if (string.isEmpty()) {
                return null;
            }
            long epochMilli = ZonedDateTime.of(LocalDateTime.parse(string, dateFormatter), jSONReader.getContext().getZoneId()).toInstant().toEpochMilli();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(epochMilli);
            return calendar2;
        }
        long millisFromString = jSONReader.readMillisFromString();
        if (millisFromString == 0 && jSONReader.wasNull()) {
            return null;
        }
        if (this.formatUnixTime) {
            millisFromString *= 1000;
        }
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(millisFromString);
        return calendar3;
    }
}
