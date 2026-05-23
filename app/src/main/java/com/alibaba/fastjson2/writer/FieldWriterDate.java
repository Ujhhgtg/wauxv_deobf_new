package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.DateUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterDate<T> extends FieldWriter<T> {
    protected ObjectWriter dateWriter;
    final boolean formatISO8601;
    final boolean formatMillis;
    final boolean formatUnixTime;
    protected DateTimeFormatter formatter;
    final boolean formatyyyyMMdd8;
    final boolean formatyyyyMMddhhmmss14;
    final boolean formatyyyyMMddhhmmss19;

    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    public FieldWriterDate(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
        boolean z6 = false;
        if (str2 != null) {
            z2 = true;
            switch (str2) {
                case "millis":
                    z = false;
                    z3 = false;
                    z5 = false;
                    z4 = false;
                    z6 = true;
                    z2 = false;
                    break;
                case "unixtime":
                    z3 = false;
                    z5 = false;
                    z4 = false;
                    z = true;
                    z2 = false;
                    break;
                case "yyyyMMdd":
                    z = false;
                    z5 = false;
                    z4 = false;
                    z3 = true;
                    z2 = false;
                    break;
                case "yyyy-MM-dd HH:mm:ss":
                    z = false;
                    z3 = false;
                    z5 = false;
                    z4 = true;
                    z2 = false;
                    break;
                case "yyyyMMddHHmmss":
                    z = false;
                    z3 = false;
                    z4 = false;
                    z5 = true;
                    z2 = false;
                    break;
                case "iso8601":
                    z = false;
                    z3 = false;
                    z5 = false;
                    z4 = false;
                    break;
                default:
                    z = false;
                    z2 = false;
                    z3 = false;
                    z5 = false;
                    z4 = false;
                    break;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z5 = false;
            z4 = false;
        }
        this.formatMillis = z6;
        this.formatISO8601 = z2;
        this.formatUnixTime = z;
        this.formatyyyyMMdd8 = z3;
        this.formatyyyyMMddhhmmss14 = z5;
        this.formatyyyyMMddhhmmss19 = z4;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    public DateTimeFormatter getFormatter() {
        String str;
        if (this.formatter == null && (str = this.format) != null && !this.formatMillis && !this.formatISO8601 && !this.formatUnixTime) {
            this.formatter = DateTimeFormatter.ofPattern(str);
        }
        return this.formatter;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        if (cls != this.fieldClass) {
            return jSONWriter.getObjectWriter(cls);
        }
        ObjectWriterProvider objectWriterProvider = jSONWriter.context.provider;
        if (this.dateWriter == null) {
            if ((objectWriterProvider.userDefineMask & 16) == 0) {
                if (this.format == null) {
                    ObjectWriterImplDate objectWriterImplDate = ObjectWriterImplDate.INSTANCE;
                    this.dateWriter = objectWriterImplDate;
                    return objectWriterImplDate;
                }
                ObjectWriterImplDate objectWriterImplDate2 = new ObjectWriterImplDate(this.format, null);
                this.dateWriter = objectWriterImplDate2;
                return objectWriterImplDate2;
            }
            this.dateWriter = objectWriterProvider.getObjectWriter((Type) cls, cls, false);
        }
        return this.dateWriter;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean isDateFormatISO8601() {
        return this.formatISO8601;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean isDateFormatMillis() {
        return this.formatMillis;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        Date date = (Date) this.propertyAccessor.getObject(t);
        if (date != null) {
            writeDate(jSONWriter, date.getTime());
            return true;
        }
        if (((this.features | jSONWriter.getFeatures()) & 16) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeNull();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeDate(JSONWriter jSONWriter, long j) {
        long j2;
        int shanghaiZoneOffsetTotalSeconds;
        long jFloorDiv;
        long j3;
        long j4;
        long j5;
        long j6;
        long jM4737;
        long j7;
        int year;
        int year2;
        long j8 = j;
        if (jSONWriter.jsonb) {
            writeFieldName(jSONWriter);
            jSONWriter.writeMillis(j);
            return;
        }
        JSONWriter.Context context = jSONWriter.context;
        if (this.formatUnixTime || (this.format == null && context.isDateFormatUnixTime())) {
            writeFieldName(jSONWriter);
            jSONWriter.writeInt64(j8 / 1000);
            return;
        }
        if (this.formatMillis || ((this.format == null && context.isDateFormatMillis()) || (jSONWriter.getFeatures(this.features) & JSONWriter.Feature.WriterUtilDateAsMillis.mask) != 0)) {
            writeFieldName(jSONWriter);
            jSONWriter.writeInt64(j);
            return;
        }
        ZoneId zoneId = context.getZoneId();
        String dateFormat = this.format;
        if (dateFormat == null) {
            dateFormat = context.getDateFormat();
        }
        boolean z = this.formatyyyyMMddhhmmss19 || (context.isFormatyyyyMMddhhmmss19() && this.format == null);
        if (dateFormat == null || this.formatyyyyMMddhhmmss14 || z) {
            long jFloorDiv2 = Math.floorDiv(j8, 1000L);
            if (zoneId != DateUtils.SHANGHAI_ZONE_ID) {
                j2 = 0;
                if (zoneId.getRules() != DateUtils.SHANGHAI_ZONE_RULES) {
                    shanghaiZoneOffsetTotalSeconds = zoneId.getRules().getOffset(Instant.ofEpochMilli(j8)).getTotalSeconds();
                }
                long j9 = jFloorDiv2 + ((long) shanghaiZoneOffsetTotalSeconds);
                jFloorDiv = Math.floorDiv(j9, 86400L);
                int iFloorMod = (int) Math.floorMod(j9, 86400L);
                j3 = jFloorDiv + 719468;
                if (j3 < 0L) {
                    long j10 = ((jFloorDiv + 719469) / 146097) - 1;
                    j4 = j10 * 400;
                    j3 += (-j10) * 146097;
                } else {
                    j4 = 0L;
                }
                j5 = j3;
                j6 = ((j5 * 400) + 591) / 146097;
                jM4737 = AbstractC2784.m4737(j6, 400L, ((j6 / 4) + (j6 * 365)) - (j6 / 100), j5);
                if (jM4737 < 0L) {
                    j6--;
                    jM4737 = AbstractC2784.m4737(j6, 400L, ((j6 / 4) + (365 * j6)) - (j6 / 100), j5);
                }
                int i = (int) jM4737;
                int i2 = ((i * 5) + 2) / 153;
                int i3 = ((i2 + 2) % 12) + 1;
                int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
                j7 = j6 + j4 + ((long) (i2 / 10));
                if (j7 >= -999999999 || false) {
                    throw new DateTimeException(AbstractC2784.m4746(j7, "Invalid year "));
                }
                int i5 = (int) j7;
                long j11 = iFloorMod;
                if (j11 < 0L || j11 > 86399) {
                    throw new DateTimeException(AbstractC2784.m4746(j11, "Invalid secondOfDay "));
                }
                int i6 = (int) (j11 / 3600);
                long j12 = j11 - ((long) (i6 * 3600));
                int i7 = (int) (j12 / 60);
                int i8 = (int) (j12 - ((long) (i7 * 60)));
                if (i5 >= 0 && i5 <= 9999) {
                    if (this.formatyyyyMMddhhmmss14) {
                        writeFieldName(jSONWriter);
                        jSONWriter.writeDateTime14(i5, i3, i4, i6, i7, i8);
                        return;
                    }
                    if (z) {
                        writeFieldName(jSONWriter);
                        jSONWriter.writeDateTime19(i5, i3, i4, i6, i7, i8);
                        return;
                    }
                    int iFloorMod2 = (int) Math.floorMod(j, 1000L);
                    if (iFloorMod2 == 0) {
                        writeFieldName(jSONWriter);
                        jSONWriter.writeDateTime19(i5, i3, i4, i6, i7, i8);
                        return;
                    } else {
                        int totalSeconds = context.getZoneId().getRules().getOffset(Instant.ofEpochMilli(j)).getTotalSeconds();
                        writeFieldName(jSONWriter);
                        jSONWriter.writeDateTimeISO8601(i5, i3, i4, i6, i7, i8, iFloorMod2, totalSeconds, false);
                        return;
                    }
                }
                j8 = j;
            } else {
                j2 = 0;
            }
            shanghaiZoneOffsetTotalSeconds = DateUtils.getShanghaiZoneOffsetTotalSeconds(jFloorDiv2);
            long j13 = jFloorDiv2 + ((long) shanghaiZoneOffsetTotalSeconds);
            jFloorDiv = Math.floorDiv(j13, 86400L);
            int iFloorMod3 = (int) Math.floorMod(j13, 86400L);
            j3 = jFloorDiv + 719468;
            if (j3 < 0L) {
                long j14 = ((jFloorDiv + 719469) / 146097) - 1;
                j4 = j14 * 400;
                j3 += (-j14) * 146097;
            } else {
                j4 = 0L;
            }
            j5 = j3;
            j6 = ((j5 * 400) + 591) / 146097;
            jM4737 = AbstractC2784.m4737(j6, 400L, ((j6 / 4) + (j6 * 365)) - (j6 / 100), j5);
            if (jM4737 < 0L) {
                j6--;
                jM4737 = AbstractC2784.m4737(j6, 400L, ((j6 / 4) + (365 * j6)) - (j6 / 100), j5);
            }
            int i9 = (int) jM4737;
            int i10 = ((i9 * 5) + 2) / 153;
            int i11 = ((i10 + 2) % 12) + 1;
            int i12 = (i9 - (((i10 * 306) + 5) / 10)) + 1;
            j7 = j6 + j4 + ((long) (i10 / 10));
            if (j7 >= -999999999) {
            }
            throw new DateTimeException(AbstractC2784.m4746(j7, "Invalid year "));
        }
        writeFieldName(jSONWriter);
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j8), zoneId);
        if ((this.formatISO8601 || (context.isDateFormatISO8601() && this.format == null)) && (year = zonedDateTimeOfInstant.getYear()) >= 0 && year <= 9999) {
            jSONWriter.writeDateTimeISO8601(year, zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
            return;
        }
        if (this.formatyyyyMMdd8 && (year2 = zonedDateTimeOfInstant.getYear()) >= 0 && year2 <= 9999) {
            jSONWriter.writeDateYYYMMDD8(year2, zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth());
            return;
        }
        DateTimeFormatter formatter = getFormatter();
        if (formatter == null) {
            formatter = context.getDateFormatter();
        }
        if (formatter != null) {
            jSONWriter.writeString(formatter.format(zonedDateTimeOfInstant));
        } else {
            jSONWriter.writeZonedDateTime(zonedDateTimeOfInstant);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        Date date = (Date) this.propertyAccessor.getObject(t);
        if (date == null) {
            jSONWriter.writeNull();
        } else {
            writeDate(jSONWriter, false, date.getTime());
        }
    }
}
