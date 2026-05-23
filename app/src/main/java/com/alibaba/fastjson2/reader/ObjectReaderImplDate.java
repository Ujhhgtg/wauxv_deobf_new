package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplDate extends DateTimeCodec implements ObjectReader {
    public static final ObjectReaderImplDate INSTANCE = new ObjectReaderImplDate(null, null);

    public ObjectReaderImplDate(String str, Locale locale) {
        super(str, locale);
    }

    public static ObjectReaderImplDate of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectReaderImplDate(str, locale);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ef  */
    /* JADX WARN: Multi-variable type inference failed */
    private Object readDate(JSONReader jSONReader) {
        long int64Value;
        JSONReader jSONReader2;
        long time;
        ZonedDateTime zonedDateTime;
        LocalDateTime localDateTimeOf;
        ZonedDateTime zonedDateTimeAtZone;
        long j;
        int i;
        ZonedDateTime zonedDateTime2;
        if (jSONReader.isInt()) {
            long int64Value2 = jSONReader.readInt64Value();
            if (this.formatUnixTime) {
                int64Value2 *= 1000;
            }
            return new Date(int64Value2);
        }
        if (jSONReader.readIfNull() || jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        if (jSONReader.current() == 'n') {
            return jSONReader.readNullOrNewDate();
        }
        if (this.useSimpleFormatter || this.locale != null) {
            String string = jSONReader.readString();
            try {
                return (this.locale != null ? new SimpleDateFormat(this.format, this.locale) : new SimpleDateFormat(this.format)).parse(string);
            } catch (ParseException e) {
                throw new JSONException(jSONReader.info("parse error : " + string), e);
            }
        }
        if ((this.formatUnixTime || this.formatMillis) && jSONReader.isString()) {
            int64Value = jSONReader.readInt64Value();
            if (this.formatUnixTime) {
                int64Value *= 1000;
            }
        } else if (this.format != null) {
            if (this.yyyyMMddhhmmss19) {
                long millisFromString = jSONReader.isSupportSmartMatch() ? jSONReader.readMillisFromString() : jSONReader.readMillis19();
                if (millisFromString != 0 || !jSONReader.wasNull()) {
                    return new Date(millisFromString);
                }
                zonedDateTime2 = jSONReader.readZonedDateTime();
            } else {
                DateTimeFormatter dateFormatter = getDateFormatter(jSONReader.getLocale());
                if (dateFormatter != null) {
                    String string2 = jSONReader.readString();
                    if (string2.isEmpty() || "null".equals(string2)) {
                        return null;
                    }
                    if (this.format.indexOf(45) != -1 && string2.indexOf(45) == -1 && TypeUtils.isInteger(string2)) {
                        return new Date(Long.parseLong(string2));
                    }
                    if (this.formatHasHour) {
                        if (string2.length() == 19 && (this.yyyyMMddhhmm16 || jSONReader.isEnabled(JSONReader.Feature.SupportSmartMatch) || "yyyy-MM-dd hh:mm:ss".equals(this.format))) {
                            localDateTimeOf = DateUtils.parseLocalDateTime(string2, 0, this.yyyyMMddhhmm16 ? 16 : 19);
                        } else if (this.formatHasDay) {
                            localDateTimeOf = LocalDateTime.parse(string2, dateFormatter);
                        } else {
                            localDateTimeOf = LocalDateTime.of(LocalDate.MIN, LocalTime.parse(string2, dateFormatter));
                        }
                    } else if (!this.formatHasDay) {
                        TemporalAccessor temporalAccessor = dateFormatter.parse(string2);
                        localDateTimeOf = LocalDateTime.of(LocalDate.of(temporalAccessor.get(ChronoField.YEAR), temporalAccessor.get(ChronoField.MONTH_OF_YEAR), 1), LocalTime.MIN);
                    } else if (string2.length() == 19 && jSONReader.isEnabled(JSONReader.Feature.SupportSmartMatch)) {
                        localDateTimeOf = DateUtils.parseLocalDateTime(string2, 0, string2.length());
                    } else {
                        localDateTimeOf = LocalDateTime.of((!this.yyyyMMdd10 || string2.length() <= 10) ? LocalDate.parse(string2, dateFormatter) : LocalDate.parse(string2.substring(0, 10), dateFormatter), LocalTime.MIN);
                    }
                    zonedDateTimeAtZone = localDateTimeOf.atZone(jSONReader.getContext().getZoneId());
                } else {
                    zonedDateTime = jSONReader.readZonedDateTime();
                }
            }
            if (false) {
                zonedDateTimeAtZone = zonedDateTime;
                zonedDateTimeAtZone = zonedDateTime2;
                return null;
            }
            zonedDateTimeAtZone = zonedDateTime;
            long epochSecond = zonedDateTimeAtZone.toEpochSecond();
            int nano = zonedDateTimeAtZone.toLocalTime().getNano();
            if (epochSecond >= 0 || nano <= 0) {
                zonedDateTimeAtZone = zonedDateTime2;
                j = epochSecond * 1000;
                i = nano / 1000000;
            } else {
                j = (epochSecond + 1) * 1000;
                i = (nano / 1000000) - 1000;
            }
            int64Value = j + ((long) i);
        } else {
            if (jSONReader.isDate()) {
                return jSONReader.readDate();
            }
            if (jSONReader.isTypeRedirect()) {
                jSONReader2 = jSONReader;
                if (jSONReader2.nextIfMatchIdent('\"', 'v', 'a', 'l', '\"')) {
                    jSONReader2.nextIfMatch(':');
                    time = jSONReader2.readInt64Value();
                    jSONReader2.nextIfObjectEnd();
                    jSONReader2.setTypeRedirect(false);
                }
                if (time != 0 && jSONReader2.wasNull()) {
                    return null;
                }
                if (this.formatUnixTime) {
                    int64Value = time * 1000;
                } else {
                    int64Value = time;
                }
            } else {
                jSONReader2 = jSONReader;
            }
            time = jSONReader2.isObject() ? jSONReader2.readDate().getTime() : jSONReader2.readMillisFromString();
            if (time != 0) {
            }
            if (this.formatUnixTime) {
                int64Value = time * 1000;
            } else {
                int64Value = time;
            }
        }
        return new Date(int64Value);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return Date.class;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        return readDate(jSONReader);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        return readDate(jSONReader);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Date createInstance(Map map, long j) {
        return TypeUtils.toDate(map);
    }
}
