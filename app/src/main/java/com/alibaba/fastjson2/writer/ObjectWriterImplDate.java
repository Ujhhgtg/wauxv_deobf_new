package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.DateUtils;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplDate extends DateTimeCodec implements ObjectWriter {
    static final byte[] PREFIX_BYTES;
    static final byte[] PREFIX_BYTES_SQL;
    static final char[] PREFIX_CHARS_SQL;
    static final ObjectWriterImplDate INSTANCE = new ObjectWriterImplDate(null, null);
    static final char[] PREFIX_CHARS = "new Date(".toCharArray();

    static {
        Charset charset = StandardCharsets.UTF_8;
        PREFIX_BYTES = "new Date(".getBytes(charset);
        PREFIX_CHARS_SQL = "{\"@type\":\"java.sql.Date\",\"val\":".toCharArray();
        PREFIX_BYTES_SQL = "{\"@type\":\"java.sql.Date\",\"val\":".getBytes(charset);
    }

    public ObjectWriterImplDate(String str, Locale locale) {
        super(str, locale);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        int shanghaiZoneOffsetTotalSeconds;
        String dateFormat;
        ZoneId zoneId;
        JSONWriter.Context context;
        long j2;
        byte[] bArr;
        char[] cArr;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        JSONWriter.Context context2 = jSONWriter.context;
        Date date = (Date) obj;
        long time = date.getTime();
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            char c = '}';
            if (jSONWriter.utf16) {
                if ("java.sql.Date".equals(date.getClass().getName())) {
                    cArr = PREFIX_CHARS_SQL;
                } else {
                    cArr = PREFIX_CHARS;
                    c = ')';
                }
                jSONWriter.writeRaw(cArr, 0, cArr.length);
            } else {
                if ("java.sql.Date".equals(date.getClass().getName())) {
                    bArr = PREFIX_BYTES_SQL;
                } else {
                    bArr = PREFIX_BYTES;
                    c = ')';
                }
                jSONWriter.writeRaw(bArr);
            }
            jSONWriter.writeInt64(time);
            jSONWriter.writeRaw(c);
            return;
        }
        if (this.formatMillis || ((this.format == null && context2.isDateFormatMillis()) || (jSONWriter.getFeatures(j) & JSONWriter.Feature.WriterUtilDateAsMillis.mask) != 0)) {
            jSONWriter.writeInt64(time);
            return;
        }
        if (this.formatUnixTime || (this.format == null && context2.isDateFormatUnixTime())) {
            jSONWriter.writeInt64(time / 1000);
            return;
        }
        ZoneId zoneId2 = context2.getZoneId();
        ZoneId zoneId3 = DateUtils.SHANGHAI_ZONE_ID;
        if (zoneId2 == zoneId3 || zoneId2.getRules() == DateUtils.SHANGHAI_ZONE_RULES) {
            shanghaiZoneOffsetTotalSeconds = DateUtils.getShanghaiZoneOffsetTotalSeconds(Math.floorDiv(time, 1000L));
        } else {
            shanghaiZoneOffsetTotalSeconds = (zoneId2 == ZoneOffset.UTC || "UTC".equals(zoneId2.getId())) ? 0 : ZonedDateTime.ofInstant(Instant.ofEpochMilli(time), zoneId2).getOffset().getTotalSeconds();
        }
        boolean z = this.formatISO8601 || context2.isDateFormatISO8601();
        if (z) {
            dateFormat = null;
        } else {
            dateFormat = this.format;
            if (dateFormat == null) {
                dateFormat = context2.getDateFormat();
            }
        }
        if (dateFormat == null) {
            long jFloorDiv = Math.floorDiv(time, 1000L);
            long shanghaiZoneOffsetTotalSeconds2 = jFloorDiv + ((long) ((zoneId2 == zoneId3 || zoneId2.getRules() == DateUtils.SHANGHAI_ZONE_RULES) ? DateUtils.getShanghaiZoneOffsetTotalSeconds(jFloorDiv) : zoneId2.getRules().getOffset(Instant.ofEpochMilli(time)).getTotalSeconds()));
            long jFloorDiv2 = Math.floorDiv(shanghaiZoneOffsetTotalSeconds2, 86400L);
            int iFloorMod = (int) Math.floorMod(shanghaiZoneOffsetTotalSeconds2, 86400L);
            long j3 = jFloorDiv2 + 719468;
            if (j3 < 0) {
                long j4 = ((jFloorDiv2 + 719469) / 146097) - 1;
                j2 = j4 * 400;
                j3 += (-j4) * 146097;
            } else {
                j2 = 0;
            }
            long j5 = j3;
            long j6 = ((j5 * 400) + 591) / 146097;
            long jM4737 = AbstractC2784.m4737(j6, 400L, ((j6 / 4) + (j6 * 365)) - (j6 / 100), j5);
            if (jM4737 < 0) {
                j6--;
                jM4737 = AbstractC2784.m4737(j6, 400L, ((j6 / 4) + (365 * j6)) - (j6 / 100), j5);
            }
            int i = (int) jM4737;
            int i2 = ((i * 5) + 2) / Opcodes.IFEQ;
            int i3 = ((i2 + 2) % 12) + 1;
            int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
            long j7 = j6 + j2 + ((long) (i2 / 10));
            if (j7 < -999999999 || j7 > 999999999) {
                throw new DateTimeException(AbstractC2784.m4746(j7, "Invalid year "));
            }
            zoneId = zoneId2;
            int i5 = (int) j7;
            long j8 = iFloorMod;
            if (j8 < 0 || j8 > 86399) {
                throw new DateTimeException(AbstractC2784.m4746(j8, "Invalid secondOfDay "));
            }
            context = context2;
            int i6 = shanghaiZoneOffsetTotalSeconds;
            int i7 = (int) (j8 / 3600);
            long j9 = j8 - ((long) (i7 * 3600));
            int i8 = (int) (j9 / 60);
            int i9 = (int) (j9 - ((long) (i8 * 60)));
            if (i5 >= 0 && i5 <= 9999) {
                int iFloorMod2 = (int) Math.floorMod(time, 1000L);
                if (iFloorMod2 != 0 || z) {
                    jSONWriter.writeDateTimeISO8601(i5, i3, i4, i7, i8, i9, iFloorMod2, i6, z);
                    return;
                }
                if (i7 == 0 && i8 == 0 && i9 == 0 && "java.sql.Date".equals(date.getClass().getName())) {
                    jSONWriter.writeDateYYYMMDD10(i5, i3, i4);
                    return;
                } else {
                    jSONWriter.writeDateTime19(i5, i3, i4, i7, i8, i9);
                    return;
                }
            }
        } else {
            zoneId = zoneId2;
            context = context2;
        }
        jSONWriter.writeString((this.format != null ? getDateFormatter() : context.getDateFormatter()).format(ZonedDateTime.ofInstant(Instant.ofEpochMilli(time), zoneId)));
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.writeNull();
        } else {
            jSONWriter.writeMillis(((Date) obj).getTime());
        }
    }
}
