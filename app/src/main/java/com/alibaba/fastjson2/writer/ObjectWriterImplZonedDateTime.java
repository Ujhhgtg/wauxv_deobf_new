package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplZonedDateTime extends DateTimeCodec implements ObjectWriter {
    static final ObjectWriterImplZonedDateTime INSTANCE = new ObjectWriterImplZonedDateTime(null, null);
    private final Function function;

    public ObjectWriterImplZonedDateTime(String str, Locale locale) {
        this(str, locale, null);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        ZonedDateTime zonedDateTime;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        Function function = this.function;
        ZonedDateTime zonedDateTime2 = function != null ? (ZonedDateTime) function.apply(obj) : (ZonedDateTime) obj;
        JSONWriter.Context context = jSONWriter.context;
        if (this.formatUnixTime || (this.format == null && context.isDateFormatUnixTime())) {
            jSONWriter.writeInt64(zonedDateTime2.toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.formatMillis || (this.format == null && context.isDateFormatMillis() && context.provider.namingStrategy != PropertyNamingStrategy.CamelCase1x)) {
            jSONWriter.writeInt64(zonedDateTime2.toInstant().toEpochMilli());
            return;
        }
        ZonedDateTime zonedDateTime3 = zonedDateTime2;
        int year = zonedDateTime3.getYear();
        if (year < 0 || year > 9999) {
            zonedDateTime = zonedDateTime3;
        } else if (this.formatISO8601 || context.isDateFormatISO8601()) {
            jSONWriter.writeDateTimeISO8601(year, zonedDateTime3.getMonthValue(), zonedDateTime3.getDayOfMonth(), zonedDateTime3.getHour(), zonedDateTime3.getMinute(), zonedDateTime3.getSecond(), zonedDateTime3.getNano() / 1000000, zonedDateTime3.getOffset().getTotalSeconds(), true);
            return;
        } else if (this.yyyyMMddhhmmss19) {
            jSONWriter.writeDateTime19(year, zonedDateTime3.getMonthValue(), zonedDateTime3.getDayOfMonth(), zonedDateTime3.getHour(), zonedDateTime3.getMinute(), zonedDateTime3.getSecond());
            return;
        } else {
            if (this.yyyyMMddhhmmss14) {
                jSONWriter.writeDateTime14(year, zonedDateTime3.getMonthValue(), zonedDateTime3.getDayOfMonth(), zonedDateTime3.getHour(), zonedDateTime3.getMinute(), zonedDateTime3.getSecond());
                return;
            }
            zonedDateTime = zonedDateTime3;
        }
        DateTimeFormatter dateFormatter = getDateFormatter();
        if (dateFormatter == null) {
            dateFormatter = context.getDateFormatter();
        }
        if (dateFormatter == null) {
            jSONWriter.writeZonedDateTime(zonedDateTime);
        } else {
            jSONWriter.writeString(dateFormatter.format(zonedDateTime));
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Function function = this.function;
        jSONWriter.writeZonedDateTime(function != null ? (ZonedDateTime) function.apply(obj) : (ZonedDateTime) obj);
    }

    public ObjectWriterImplZonedDateTime(String str, Locale locale, Function function) {
        super(str, locale);
        this.function = function;
    }
}
