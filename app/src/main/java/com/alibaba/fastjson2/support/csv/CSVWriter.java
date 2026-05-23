package com.alibaba.fastjson2.support.csv;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class CSVWriter implements Closeable, Flushable {
    private long features;
    int off;
    final ZoneId zoneId;

    /* JADX INFO: compiled from: obf */
    public enum Feature {
        AlwaysQuoteStrings(1);

        public final long mask;

        Feature(long j) {
            this.mask = j;
        }
    }

    public CSVWriter(ZoneId zoneId, Feature... featureArr) {
        for (Feature feature : featureArr) {
            this.features |= feature.mask;
        }
        this.zoneId = zoneId;
    }

    public static CSVWriter of() {
        return of(new ByteArrayOutputStream(), new Feature[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    @Override // java.io.Flushable
    public abstract void flush();

    public void writeBigInteger(BigInteger bigInteger) {
        if (bigInteger == null) {
            return;
        }
        writeRaw(bigInteger.toString());
    }

    public abstract void writeBoolean(boolean z);

    public abstract void writeComma();

    public final void writeDate(Date date) {
        if (date == null) {
            return;
        }
        writeDate(date.getTime());
    }

    public abstract void writeDateTime19(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract void writeDateYYYMMDD10(int i, int i2, int i3);

    public abstract void writeDecimal(long j, int i);

    public abstract void writeDecimal(BigDecimal bigDecimal);

    public abstract void writeDouble(double d);

    public abstract void writeFloat(float f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.time.LocalDateTime] */
    public final void writeInstant(Instant instant) {
        if (instant == null) {
            return;
        }
        if (instant.getNano() % 1000000 == 0) {
            writeDate(instant.toEpochMilli());
            return;
        }
        if ((this.features & Feature.AlwaysQuoteStrings.mask) != 0) {
            writeQuote();
        }
        writeLocalDateTime(instant.atZone(this.zoneId).toLocalDateTime());
    }

    public abstract void writeInt32(int i);

    public abstract void writeInt64(long j);

    public abstract void writeLine();

    public final void writeLine(int i, IntFunction intFunction) {
        for (int i2 = 0; i2 < i; i2++) {
            Object objApply = intFunction.apply(i2);
            if (i2 != 0) {
                writeComma();
            }
            writeValue(objApply);
        }
        writeLine();
    }

    public final void writeLineObject(Object obj) {
        if (obj == null) {
            writeLine();
            return;
        }
        ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) obj.getClass());
        if (!(objectWriter instanceof ObjectWriterAdapter)) {
            writeLine(obj);
            return;
        }
        List<FieldWriter> fieldWriters = ((ObjectWriterAdapter) objectWriter).getFieldWriters();
        if (fieldWriters.size() == 1 && (fieldWriters.get(0).features & FieldInfo.VALUE_MASK) != 0) {
            writeLineObject(fieldWriters.get(0).getFieldValue(obj));
            return;
        }
        Object[] objArr = new Object[fieldWriters.size()];
        for (int i = 0; i < fieldWriters.size(); i++) {
            objArr[i] = fieldWriters.get(i).getFieldValue(obj);
        }
        writeLine(objArr);
    }

    public void writeLocalDate(LocalDate localDate) {
        if (localDate == null) {
            return;
        }
        writeRaw(DateTimeFormatter.ISO_LOCAL_DATE.format(localDate));
    }

    public abstract void writeLocalDateTime(LocalDateTime localDateTime);

    public abstract void writeQuote();

    public abstract void writeRaw(String str);

    public abstract void writeString(String str);

    public abstract void writeString(byte[] bArr);

    public void writeValue(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Optional) {
            Optional optional = (Optional) obj;
            if (!optional.isPresent()) {
                return;
            } else {
                obj = optional.get();
            }
        }
        if (obj instanceof Integer) {
            writeInt32(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writeInt64(((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            writeString((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            writeFloat(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            writeDouble(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Short) {
            writeInt32(((Short) obj).intValue());
            return;
        }
        if (obj instanceof Byte) {
            writeInt32(((Byte) obj).intValue());
            return;
        }
        if (obj instanceof BigDecimal) {
            writeDecimal((BigDecimal) obj);
            return;
        }
        if (obj instanceof BigInteger) {
            writeBigInteger((BigInteger) obj);
            return;
        }
        if (obj instanceof Date) {
            writeDate((Date) obj);
            return;
        }
        if (obj instanceof Instant) {
            writeInstant((Instant) obj);
            return;
        }
        if (obj instanceof LocalDate) {
            writeLocalDate((LocalDate) obj);
        } else if (obj instanceof LocalDateTime) {
            writeLocalDateTime((LocalDateTime) obj);
        } else {
            writeString(obj.toString());
        }
    }

    public static CSVWriter of(File file) {
        return of(new FileOutputStream(file), StandardCharsets.UTF_8);
    }

    public static CSVWriter of(File file, Charset charset) {
        return of(new FileOutputStream(file), charset);
    }

    public final void writeDate(long j) {
        int shanghaiZoneOffsetTotalSeconds;
        long j2;
        long j3;
        ZoneId zoneId = this.zoneId;
        long jFloorDiv = Math.floorDiv(j, 1000L);
        if (zoneId != DateUtils.SHANGHAI_ZONE_ID && zoneId.getRules() != DateUtils.SHANGHAI_ZONE_RULES) {
            shanghaiZoneOffsetTotalSeconds = zoneId.getRules().getOffset(Instant.ofEpochMilli(j)).getTotalSeconds();
        } else {
            shanghaiZoneOffsetTotalSeconds = DateUtils.getShanghaiZoneOffsetTotalSeconds(jFloorDiv);
        }
        long j4 = jFloorDiv + ((long) shanghaiZoneOffsetTotalSeconds);
        long jFloorDiv2 = Math.floorDiv(j4, 86400L);
        int iFloorMod = (int) Math.floorMod(j4, 86400L);
        long j5 = 719468 + jFloorDiv2;
        if (j5 < 0) {
            long j6 = ((jFloorDiv2 + 719469) / 146097) - 1;
            j2 = j5 + ((-j6) * 146097);
            j3 = j6 * 400;
        } else {
            j2 = j5;
            j3 = 0;
        }
        long j7 = ((j2 * 400) + 591) / 146097;
        long jM4737 = AbstractC2784.m4737(j7, 400L, ((j7 / 4) + (j7 * 365)) - (j7 / 100), j2);
        if (jM4737 < 0) {
            j7--;
            jM4737 = AbstractC2784.m4737(j7, 400L, ((j7 / 4) + (365 * j7)) - (j7 / 100), j2);
        }
        long j8 = j7 + j3;
        int i = (int) jM4737;
        int i2 = ((i * 5) + 2) / Opcodes.IFEQ;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j9 = j8 + ((long) (i2 / 10));
        if (j9 < -999999999 || j9 > 999999999) {
            throw new DateTimeException(AbstractC2784.m4746(j9, "Invalid year "));
        }
        int i5 = (int) j9;
        long j10 = iFloorMod;
        if (j10 >= 0 && j10 <= 86399) {
            int i6 = (int) (j10 / 3600);
            long j11 = j10 - ((long) (i6 * 3600));
            int i7 = (int) (j11 / 60);
            int i8 = (int) (j11 - ((long) (i7 * 60)));
            if (i5 < 0 || i5 > 9999 || ((int) Math.floorMod(j, 1000L)) != 0) {
                writeRaw(DateUtils.toString(j, false, zoneId));
                return;
            } else if (i6 == 0 && i7 == 0 && i8 == 0) {
                writeDateYYYMMDD10(i5, i3, i4);
                return;
            } else {
                writeDateTime19(i5, i3, i4, i6, i7, i8);
                return;
            }
        }
        throw new DateTimeException(AbstractC2784.m4746(j10, "Invalid secondOfDay "));
    }

    public static CSVWriter of(OutputStream outputStream, Feature... featureArr) {
        return new CSVWriterUTF8(outputStream, StandardCharsets.UTF_8, DateUtils.DEFAULT_ZONE_ID, featureArr);
    }

    public static CSVWriter of(OutputStream outputStream, Charset charset) {
        return of(outputStream, charset, DateUtils.DEFAULT_ZONE_ID);
    }

    public final void writeLine(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                writeComma();
            }
            writeValue(list.get(i));
        }
        writeLine();
    }

    public static CSVWriter of(OutputStream outputStream, Charset charset, ZoneId zoneId) {
        if (charset != StandardCharsets.UTF_16 && charset != StandardCharsets.UTF_16LE && charset != StandardCharsets.UTF_16BE) {
            if (charset == null) {
                charset = StandardCharsets.UTF_8;
            }
            return new CSVWriterUTF8(outputStream, charset, zoneId, new Feature[0]);
        }
        return of(new OutputStreamWriter(outputStream, charset), zoneId);
    }

    public final void writeLine(Object... objArr) {
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                writeComma();
            }
            writeValue(objArr[i]);
        }
        writeLine();
    }

    public static CSVWriter of(Writer writer) {
        return new CSVWriterUTF16(writer, DateUtils.DEFAULT_ZONE_ID, new Feature[0]);
    }

    public static CSVWriter of(Writer writer, ZoneId zoneId) {
        return new CSVWriterUTF16(writer, zoneId, new Feature[0]);
    }
}
