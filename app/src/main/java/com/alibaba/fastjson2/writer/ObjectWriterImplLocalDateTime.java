package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplLocalDateTime extends DateTimeCodec implements ObjectWriter {
    static final ObjectWriterImplLocalDateTime INSTANCE = new ObjectWriterImplLocalDateTime(null, null);

    public ObjectWriterImplLocalDateTime(String str, Locale locale) {
        super(str, locale);
    }

    public static ObjectWriterImplLocalDateTime of(String str, Locale locale) {
        return new ObjectWriterImplLocalDateTime(str, locale);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String str;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        JSONWriter.Context context = jSONWriter.context;
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (this.formatUnixTime || (this.format == null && context.isDateFormatUnixTime())) {
            jSONWriter.writeInt64(localDateTime.atZone(context.getZoneId()).toInstant().toEpochMilli() / 1000);
            return;
        }
        if (this.formatMillis || (this.format == null && context.isDateFormatMillis())) {
            jSONWriter.writeInt64(localDateTime.atZone(context.getZoneId()).toInstant().toEpochMilli());
            return;
        }
        int year = localDateTime.getYear();
        if (year >= 0 && year <= 9999) {
            if (this.formatISO8601 || (this.format == null && context.isDateFormatISO8601())) {
                jSONWriter.writeDateTimeISO8601(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano() / 1000000, context.getZoneId().getRules().getOffset(localDateTime).getTotalSeconds(), true);
                return;
            }
            if (this.yyyyMMddhhmmss19) {
                jSONWriter.writeDateTime19(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
                return;
            }
            if (this.yyyyMMddhhmmss14) {
                jSONWriter.writeDateTime14(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
                return;
            } else if (this.yyyyMMdd8) {
                jSONWriter.writeDateYYYMMDD8(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
                return;
            } else if (this.yyyyMMdd10) {
                jSONWriter.writeDateYYYMMDD10(year, localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
                return;
            }
        }
        DateTimeFormatter dateFormatter = getDateFormatter();
        if (dateFormatter == null) {
            dateFormatter = context.getDateFormatter();
        }
        if (dateFormatter == null) {
            jSONWriter.writeLocalDateTime(localDateTime);
            return;
        }
        if (this.useSimpleDateFormat) {
            str = new SimpleDateFormat(this.format).format(new Date(localDateTime.toInstant(jSONWriter.context.getZoneId().getRules().getOffset(localDateTime)).toEpochMilli()));
        } else {
            str = this.locale != null ? dateFormatter.format(ZonedDateTime.of(localDateTime, jSONWriter.context.getZoneId())) : dateFormatter.format(localDateTime);
        }
        jSONWriter.writeString(str);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (this.format != null) {
            write(jSONWriter, obj, obj2, type, j);
        } else {
            jSONWriter.writeLocalDateTime((LocalDateTime) obj);
        }
    }
}
