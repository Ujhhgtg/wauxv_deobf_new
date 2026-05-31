package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.support.LambdaMiscCodec;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class JodaSupport {
    static final long HASH_YEAR = Fnv.hashCode64("year");
    static final long HASH_MONTH = Fnv.hashCode64("month");
    static final long HASH_DAY = Fnv.hashCode64("day");
    static final long HASH_HOUR = Fnv.hashCode64("hour");
    static final long HASH_MINUTE = Fnv.hashCode64("minute");
    static final long HASH_SECOND = Fnv.hashCode64("second");
    static final long HASH_MILLIS = Fnv.hashCode64("millis");
    static final long HASH_CHRONOLOGY = Fnv.hashCode64("chronology");

    /* JADX INFO: compiled from: obf */
    public static class ChronologyReader implements ObjectReader {
        static final long HASH_ZONE_ID = Fnv.hashCode64("zoneId");
        final Class dateTimeZone;
        final Function forID;
        final Function getInstance;
        final Class gregorianChronology;
        final Class objectClass;
        final Object utc;

        public ChronologyReader(Class cls) {
            this.objectClass = cls;
            ClassLoader classLoader = cls.getClassLoader();
            try {
                Class<?> clsLoadClass = classLoader.loadClass("org.joda.time.chrono.GregorianChronology");
                this.gregorianChronology = clsLoadClass;
                Class<?> clsLoadClass2 = classLoader.loadClass("org.joda.time.DateTimeZone");
                this.dateTimeZone = clsLoadClass2;
                this.utc = clsLoadClass.getMethod("getInstanceUTC", null).invoke(null, null);
                this.forID = LambdaMiscCodec.createFunction(clsLoadClass2.getMethod("forID", String.class));
                this.getInstance = LambdaMiscCodec.createFunction(clsLoadClass.getMethod("getInstance", clsLoadClass2));
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new JSONException("create ChronologyReader error", e);
            }
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Class getObjectClass() {
            return this.objectClass;
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
            jSONReader.nextIfObjectStart();
            Integer numValueOf = null;
            String string = null;
            while (!jSONReader.nextIfObjectEnd()) {
                long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                if (fieldNameHashCode == 8244232525129275563L) {
                    numValueOf = Integer.valueOf(jSONReader.readInt32Value());
                } else {
                    if (fieldNameHashCode != HASH_ZONE_ID) {
                        throw new JSONException(jSONReader.info("not support fieldName " + jSONReader.getFieldName()));
                    }
                    string = jSONReader.readString();
                }
            }
            if (numValueOf != null) {
                throw new JSONException(jSONReader.info("not support"));
            }
            if ("UTC".equals(string)) {
                return this.utc;
            }
            return this.getInstance.apply(this.forID.apply(string));
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
            throw new JSONException(jSONReader.info("not support"));
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class DateTime2ZDT implements Function {
        static Class CLASS;
        static ToIntFunction DAY_OF_MONTH;
        static Function GET_ID;
        static Function GET_ZONE;
        static ToIntFunction HOUR;
        static ToIntFunction MILLIS;
        static ToIntFunction MINUTE;
        static ToIntFunction MONTH;
        static ToIntFunction SECOND;
        static ToIntFunction YEAR;

        @Override // java.util.function.Function
        public Object apply(Object obj) {
            try {
                if (CLASS == null) {
                    CLASS = Class.forName("org.joda.time.DateTime");
                }
                if (YEAR == null) {
                    YEAR = LambdaMiscCodec.createToIntFunction(CLASS.getMethod("getYear", null));
                }
                if (MONTH == null) {
                    MONTH = LambdaMiscCodec.createToIntFunction(CLASS.getMethod("getMonthOfYear", null));
                }
                if (DAY_OF_MONTH == null) {
                    DAY_OF_MONTH = LambdaMiscCodec.createToIntFunction(CLASS.getMethod("getDayOfMonth", null));
                }
                if (HOUR == null) {
                    HOUR = LambdaMiscCodec.createToIntFunction(CLASS.getMethod("getHourOfDay", null));
                }
                if (MINUTE == null) {
                    MINUTE = LambdaMiscCodec.createToIntFunction(CLASS.getMethod("getMinuteOfHour", null));
                }
                if (SECOND == null) {
                    SECOND = LambdaMiscCodec.createToIntFunction(CLASS.getMethod("getSecondOfMinute", null));
                }
                if (MILLIS == null) {
                    MILLIS = LambdaMiscCodec.createToIntFunction(CLASS.getMethod("getMillisOfSecond", null));
                }
                if (GET_ZONE == null) {
                    GET_ZONE = LambdaMiscCodec.createFunction(CLASS.getMethod("getZone", null));
                }
                if (GET_ID == null) {
                    GET_ID = LambdaMiscCodec.createFunction(Class.forName("org.joda.time.DateTimeZone").getMethod("getID", null));
                }
                return ZonedDateTime.of(YEAR.applyAsInt(obj), MONTH.applyAsInt(obj), DAY_OF_MONTH.applyAsInt(obj), HOUR.applyAsInt(obj), MINUTE.applyAsInt(obj), SECOND.applyAsInt(obj), MILLIS.applyAsInt(obj) * 1000000, ZoneId.of((String) GET_ID.apply(GET_ZONE.apply(obj))));
            } catch (Exception e) {
                throw new JSONException("convert joda org.joda.time.DateTime to java.time.ZonedDateTime error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class DateTimeFromZDT implements Function {
        static Constructor CONS;
        static Method FOR_ID;

        @Override // java.util.function.Function
        public Object apply(Object obj) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            try {
                if (FOR_ID == null) {
                    FOR_ID = Class.forName("org.joda.time.DateTimeZone").getMethod("forID", String.class);
                }
                if (CONS == null) {
                    Class<?> cls = Class.forName("org.joda.time.DateTime");
                    Class cls2 = Integer.TYPE;
                    CONS = cls.getConstructor(cls2, cls2, cls2, cls2, cls2, cls2, cls2, FOR_ID.getDeclaringClass());
                }
                String id = zonedDateTime.getZone().getId();
                if ("Z".equals(id)) {
                    id = "UTC";
                }
                return CONS.newInstance(Integer.valueOf(zonedDateTime.getYear()), Integer.valueOf(zonedDateTime.getMonthValue()), Integer.valueOf(zonedDateTime.getDayOfMonth()), Integer.valueOf(zonedDateTime.getHour()), Integer.valueOf(zonedDateTime.getMinute()), Integer.valueOf(zonedDateTime.getSecond()), Integer.valueOf(zonedDateTime.getNano() / 1000000), FOR_ID.invoke(null, id));
            } catch (Exception e) {
                throw new JSONException("build DateTime error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class GregorianChronologyWriter implements ObjectWriter {
        final Function getID;
        final ToIntFunction getMinimumDaysInFirstWeek;
        final Function getZone;
        final Class objectClass;

        public GregorianChronologyWriter(Class cls) {
            this.objectClass = cls;
            try {
                this.getMinimumDaysInFirstWeek = LambdaMiscCodec.createToIntFunction(cls.getMethod("getMinimumDaysInFirstWeek", null));
                Method method = cls.getMethod("getZone", null);
                this.getZone = LambdaMiscCodec.createFunction(method);
                this.getID = LambdaMiscCodec.createFunction(method.getReturnType().getMethod("getID", null));
            } catch (NoSuchMethodException e) {
                throw new JSONException("getMethod error", e);
            }
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            String str = (String) this.getID.apply(this.getZone.apply(obj));
            int iApplyAsInt = this.getMinimumDaysInFirstWeek.applyAsInt(obj);
            jSONWriter.startObject();
            jSONWriter.writeName("minimumDaysInFirstWeek");
            jSONWriter.writeInt32(iApplyAsInt);
            jSONWriter.writeName("zoneId");
            jSONWriter.writeString(str);
            jSONWriter.endObject();
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            String str = (String) this.getID.apply(this.getZone.apply(obj));
            int iApplyAsInt = this.getMinimumDaysInFirstWeek.applyAsInt(obj);
            jSONWriter.startObject();
            if (iApplyAsInt != 4) {
                jSONWriter.writeName("minimumDaysInFirstWeek");
                jSONWriter.writeInt32(iApplyAsInt);
            }
            jSONWriter.writeName("zoneId");
            jSONWriter.writeString(str);
            jSONWriter.endObject();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class ISOChronologyWriter implements ObjectWriter {
        final Function getID;
        final Function getZone;
        final Class objectClass;

        public ISOChronologyWriter(Class cls) {
            this.objectClass = cls;
            try {
                Method method = cls.getMethod("getZone", null);
                this.getZone = LambdaMiscCodec.createFunction(method);
                this.getID = LambdaMiscCodec.createFunction(method.getReturnType().getMethod("getID", null));
            } catch (NoSuchMethodException e) {
                throw new JSONException("getMethod error", e);
            }
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            String str = (String) this.getID.apply(this.getZone.apply(obj));
            jSONWriter.startObject();
            jSONWriter.writeName("zoneId");
            jSONWriter.writeString(str);
            jSONWriter.endObject();
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            String str = (String) this.getID.apply(this.getZone.apply(obj));
            jSONWriter.startObject();
            jSONWriter.writeName("zoneId");
            jSONWriter.writeString(str);
            jSONWriter.endObject();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class InstantReader implements ObjectReader {
        final LongFunction constructor;
        final Class objectClass;

        public InstantReader(Class cls) {
            this.objectClass = cls;
            try {
                this.constructor = LambdaMiscCodec.createLongFunction(cls.getConstructor(Long.TYPE));
            } catch (NoSuchMethodException e) {
                throw new JSONException("create joda instant reader error", e);
            }
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object createInstance(Map map, long j) {
            Long l = (Long) map.get("millis");
            if (l != null) {
                return createInstanceFromMillis(l.longValue());
            }
            Number number = (Number) map.get("epochSecond");
            if (number != null) {
                return createInstanceFromMillis(number.longValue() * 1000);
            }
            throw new JSONException("create joda instant error");
        }

        public Object createInstanceFromMillis(long j) {
            return this.constructor.apply(j);
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Class getObjectClass() {
            return this.objectClass;
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
            return readObject(jSONReader, type, obj, j);
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
            if (jSONReader.nextIfNull()) {
                return null;
            }
            if (jSONReader.isInt()) {
                return createInstanceFromMillis(jSONReader.readInt64Value());
            }
            if (!jSONReader.isString()) {
                if (jSONReader.isObject()) {
                    return createInstance(jSONReader.readObject(), j);
                }
                throw new JSONException(jSONReader.info("not support"));
            }
            Instant instant = jSONReader.readInstant();
            if (instant == null) {
                return null;
            }
            return createInstanceFromMillis(instant.toEpochMilli());
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class LocalDateReader implements ObjectReader {
        final Class classChronology;
        final Class classISOChronology;
        final Constructor constructor3;
        final Constructor constructor4;
        final Class objectClass;
        final Object utc;

        public LocalDateReader(Class cls) {
            this.objectClass = cls;
            try {
                ClassLoader classLoader = cls.getClassLoader();
                Class<?> clsLoadClass = classLoader.loadClass("org.joda.time.Chronology");
                this.classChronology = clsLoadClass;
                Class cls2 = Integer.TYPE;
                this.constructor3 = cls.getConstructor(cls2, cls2, cls2);
                this.constructor4 = cls.getConstructor(cls2, cls2, cls2, clsLoadClass);
                Class<?> clsLoadClass2 = classLoader.loadClass("org.joda.time.chrono.ISOChronology");
                this.classISOChronology = clsLoadClass2;
                this.utc = clsLoadClass2.getMethod("getInstance", null).invoke(null, null);
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                throw new JSONException("create LocalDateWriter error", e);
            }
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Class getObjectClass() {
            return this.objectClass;
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
            byte type2 = jSONReader.getType();
            if (type2 == -87) {
                LocalDate localDate = jSONReader.readLocalDate();
                try {
                    return this.constructor3.newInstance(Integer.valueOf(localDate.getYear()), Integer.valueOf(localDate.getMonthValue()), Integer.valueOf(localDate.getDayOfMonth()));
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                    throw new JSONException(jSONReader.info("read org.joda.time.LocalDate error"), e);
                }
            }
            if (!jSONReader.isObject()) {
                throw new JSONException(jSONReader.info("not support " + JSONB.typeName(type2)));
            }
            jSONReader.nextIfObjectStart();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            Object obj2 = null;
            while (!jSONReader.nextIfObjectEnd()) {
                long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                if (fieldNameHashCode == JodaSupport.HASH_YEAR) {
                    numValueOf = Integer.valueOf(jSONReader.readInt32Value());
                } else if (fieldNameHashCode == JodaSupport.HASH_MONTH) {
                    numValueOf2 = Integer.valueOf(jSONReader.readInt32Value());
                } else if (fieldNameHashCode == JodaSupport.HASH_DAY) {
                    numValueOf3 = Integer.valueOf(jSONReader.readInt32Value());
                } else {
                    if (fieldNameHashCode != JodaSupport.HASH_CHRONOLOGY) {
                        throw new JSONException(jSONReader.info("not support fieldName " + jSONReader.getFieldName()));
                    }
                    obj2 = jSONReader.read((Class<Object>) this.classChronology);
                }
            }
            try {
                return this.constructor4.newInstance(numValueOf, numValueOf2, numValueOf3, obj2);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                throw new JSONException(jSONReader.info("read org.joda.time.LocalDate error"), e2);
            }
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
            LocalDate localDate;
            if (jSONReader.nextIfNull() || (localDate = jSONReader.readLocalDate()) == null) {
                return null;
            }
            try {
                return this.constructor4.newInstance(Integer.valueOf(localDate.getYear()), Integer.valueOf(localDate.getMonthValue()), Integer.valueOf(localDate.getDayOfMonth()), null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                throw new JSONException(jSONReader.info("read org.joda.time.LocalDate error"), e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class LocalDateTimeReader implements ObjectReader {
        final Class classChronology;
        final Class classISOChronology;
        final Constructor constructor7;
        final Constructor constructor8;
        final Class objectClass;
        final Object utc;

        public LocalDateTimeReader(Class cls) {
            this.objectClass = cls;
            try {
                ClassLoader classLoader = cls.getClassLoader();
                Class<?> clsLoadClass = classLoader.loadClass("org.joda.time.Chronology");
                this.classChronology = clsLoadClass;
                Class cls2 = Integer.TYPE;
                this.constructor7 = cls.getConstructor(cls2, cls2, cls2, cls2, cls2, cls2, cls2);
                this.constructor8 = cls.getConstructor(cls2, cls2, cls2, cls2, cls2, cls2, cls2, clsLoadClass);
                Class<?> clsLoadClass2 = classLoader.loadClass("org.joda.time.chrono.ISOChronology");
                this.classISOChronology = clsLoadClass2;
                this.utc = clsLoadClass2.getMethod("getInstance", null).invoke(null, null);
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                throw new JSONException("create LocalDateWriter error", e);
            }
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Class getObjectClass() {
            return this.objectClass;
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
            byte type2 = jSONReader.getType();
            if (type2 == -87) {
                LocalDate localDate = jSONReader.readLocalDate();
                try {
                    return this.constructor7.newInstance(Integer.valueOf(localDate.getYear()), Integer.valueOf(localDate.getMonthValue()), Integer.valueOf(localDate.getDayOfMonth()), 0, 0, 0, 0);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                    throw new JSONException(jSONReader.info("read org.joda.time.LocalDate error"), e);
                }
            }
            if (type2 == -88) {
                LocalDateTime localDateTime = jSONReader.readLocalDateTime();
                try {
                    return this.constructor7.newInstance(Integer.valueOf(localDateTime.getYear()), Integer.valueOf(localDateTime.getMonthValue()), Integer.valueOf(localDateTime.getDayOfMonth()), Integer.valueOf(localDateTime.getHour()), Integer.valueOf(localDateTime.getMinute()), Integer.valueOf(localDateTime.getSecond()), Integer.valueOf(localDateTime.getNano() / 1000000));
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                    throw new JSONException(jSONReader.info("read org.joda.time.LocalDate error"), e2);
                }
            }
            if (!jSONReader.isObject()) {
                throw new JSONException(jSONReader.info("not support " + JSONB.typeName(type2)));
            }
            jSONReader.nextIfObjectStart();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            Integer numValueOf4 = null;
            Integer numValueOf5 = null;
            Integer numValueOf6 = null;
            Integer numValueOf7 = null;
            Object obj2 = null;
            while (!jSONReader.nextIfObjectEnd()) {
                long fieldNameHashCode = jSONReader.readFieldNameHashCode();
                if (fieldNameHashCode == JodaSupport.HASH_YEAR) {
                    numValueOf = Integer.valueOf(jSONReader.readInt32Value());
                } else if (fieldNameHashCode == JodaSupport.HASH_MONTH) {
                    numValueOf2 = Integer.valueOf(jSONReader.readInt32Value());
                } else if (fieldNameHashCode == JodaSupport.HASH_DAY) {
                    numValueOf3 = Integer.valueOf(jSONReader.readInt32Value());
                } else if (fieldNameHashCode == JodaSupport.HASH_HOUR) {
                    numValueOf4 = Integer.valueOf(jSONReader.readInt32Value());
                } else if (fieldNameHashCode == JodaSupport.HASH_MINUTE) {
                    numValueOf5 = Integer.valueOf(jSONReader.readInt32Value());
                } else if (fieldNameHashCode == JodaSupport.HASH_SECOND) {
                    numValueOf6 = Integer.valueOf(jSONReader.readInt32Value());
                } else if (fieldNameHashCode == JodaSupport.HASH_MILLIS) {
                    numValueOf7 = Integer.valueOf(jSONReader.readInt32Value());
                } else {
                    if (fieldNameHashCode != JodaSupport.HASH_CHRONOLOGY) {
                        throw new JSONException(jSONReader.info("not support fieldName " + jSONReader.getFieldName()));
                    }
                    obj2 = jSONReader.read((Class<Object>) this.classChronology);
                }
            }
            try {
                return this.constructor8.newInstance(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, obj2);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
                throw new JSONException(jSONReader.info("read org.joda.time.LocalDate error"), e3);
            }
        }

        @Override // com.alibaba.fastjson2.reader.ObjectReader
        public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
            if (!jSONReader.isString() && !jSONReader.isInt()) {
                throw new JSONException(jSONReader.info("not support"));
            }
            LocalDateTime localDateTime = jSONReader.readLocalDateTime();
            if (localDateTime == null) {
                return null;
            }
            try {
                return this.constructor7.newInstance(Integer.valueOf(localDateTime.getYear()), Integer.valueOf(localDateTime.getMonthValue()), Integer.valueOf(localDateTime.getDayOfMonth()), Integer.valueOf(localDateTime.getHour()), Integer.valueOf(localDateTime.getMinute()), Integer.valueOf(localDateTime.getSecond()), Integer.valueOf(localDateTime.getNano() / 1000000));
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                throw new JSONException(jSONReader.info("read org.joda.time.LocalDate error"), e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class LocalDateTimeWriter extends DateTimeCodec implements ObjectWriter {
        final Function getChronology;
        final Method getDayOfMonth;
        final ToIntFunction getHourOfDay;
        final ToIntFunction getMillisOfSecond;
        final ToIntFunction getMinuteOfHour;
        final Method getMonthOfYear;
        final ToIntFunction getSecondOfMinute;
        final Method getYear;
        final Class isoChronology;
        final Class objectClass;
        final Object utc;

        public LocalDateTimeWriter(Class cls, String str) {
            super(str);
            this.objectClass = cls;
            try {
                Class<?> clsLoadClass = cls.getClassLoader().loadClass("org.joda.time.chrono.ISOChronology");
                this.isoChronology = clsLoadClass;
                this.utc = clsLoadClass.getMethod("withUTC", null).invoke(clsLoadClass.getMethod("getInstance", null).invoke(null, null), null);
                this.getYear = cls.getMethod("getYear", null);
                this.getMonthOfYear = cls.getMethod("getMonthOfYear", null);
                this.getDayOfMonth = cls.getMethod("getDayOfMonth", null);
                this.getHourOfDay = LambdaMiscCodec.createToIntFunction(cls.getMethod("getHourOfDay", null));
                this.getMinuteOfHour = LambdaMiscCodec.createToIntFunction(cls.getMethod("getMinuteOfHour", null));
                this.getSecondOfMinute = LambdaMiscCodec.createToIntFunction(cls.getMethod("getSecondOfMinute", null));
                this.getMillisOfSecond = LambdaMiscCodec.createToIntFunction(cls.getMethod("getMillisOfSecond", null));
                this.getChronology = LambdaMiscCodec.createFunction(cls.getMethod("getChronology", null));
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                throw new JSONException("create LocalDateWriter error", e);
            }
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            try {
                int iIntValue = ((Integer) this.getYear.invoke(obj, null)).intValue();
                int iIntValue2 = ((Integer) this.getMonthOfYear.invoke(obj, null)).intValue();
                int iIntValue3 = ((Integer) this.getDayOfMonth.invoke(obj, null)).intValue();
                int iApplyAsInt = this.getHourOfDay.applyAsInt(obj);
                int iApplyAsInt2 = this.getMinuteOfHour.applyAsInt(obj);
                int iApplyAsInt3 = this.getSecondOfMinute.applyAsInt(obj);
                int iApplyAsInt4 = this.getMillisOfSecond.applyAsInt(obj);
                Object objApply = this.getChronology.apply(obj);
                if (jSONWriter.isWriteTypeInfo(obj, type, j)) {
                    jSONWriter.writeTypeName(TypeUtils.getTypeName(obj.getClass()));
                }
                if (objApply != this.utc && objApply != null) {
                    jSONWriter.startObject();
                    jSONWriter.writeName("year");
                    jSONWriter.writeInt32(iIntValue);
                    jSONWriter.writeName("month");
                    jSONWriter.writeInt32(iIntValue2);
                    jSONWriter.writeName("day");
                    jSONWriter.writeInt32(iIntValue3);
                    jSONWriter.writeName("hour");
                    jSONWriter.writeInt32(iApplyAsInt);
                    jSONWriter.writeName("minute");
                    jSONWriter.writeInt32(iApplyAsInt2);
                    jSONWriter.writeName("second");
                    jSONWriter.writeInt32(iApplyAsInt3);
                    jSONWriter.writeName("millis");
                    jSONWriter.writeInt32(iApplyAsInt4);
                    jSONWriter.writeName("chronology");
                    jSONWriter.writeAny(objApply);
                    jSONWriter.endObject();
                    return;
                }
                LocalDateTime localDateTimeOf = LocalDateTime.of(iIntValue, iIntValue2, iIntValue3, iApplyAsInt, iApplyAsInt2, iApplyAsInt3, iApplyAsInt4 * 1000000);
                DateTimeFormatter dateFormatter = getDateFormatter();
                if (dateFormatter == null) {
                    dateFormatter = jSONWriter.context.getDateFormatter();
                }
                if (dateFormatter == null) {
                    jSONWriter.writeLocalDateTime(localDateTimeOf);
                } else {
                    jSONWriter.writeString(dateFormatter.format(localDateTimeOf));
                }
            } catch (IllegalAccessException e) {
                e = e;
                throw new JSONException("write LocalDateWriter error", e);
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new JSONException("write LocalDateWriter error", e);
            }
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            try {
                int iIntValue = ((Integer) this.getYear.invoke(obj, null)).intValue();
                int iIntValue2 = ((Integer) this.getMonthOfYear.invoke(obj, null)).intValue();
                int iIntValue3 = ((Integer) this.getDayOfMonth.invoke(obj, null)).intValue();
                int iApplyAsInt = this.getHourOfDay.applyAsInt(obj);
                int iApplyAsInt2 = this.getMinuteOfHour.applyAsInt(obj);
                int iApplyAsInt3 = this.getSecondOfMinute.applyAsInt(obj);
                int iApplyAsInt4 = this.getMillisOfSecond.applyAsInt(obj);
                Object objApply = this.getChronology.apply(obj);
                if (jSONWriter.isWriteTypeInfo(obj, type, j)) {
                    jSONWriter.writeTypeName(TypeUtils.getTypeName(obj.getClass()));
                }
                if (objApply != this.utc && objApply != null) {
                    jSONWriter.startObject();
                    jSONWriter.writeName("year");
                    jSONWriter.writeInt32(iIntValue);
                    jSONWriter.writeName("month");
                    jSONWriter.writeInt32(iIntValue2);
                    jSONWriter.writeName("day");
                    jSONWriter.writeInt32(iIntValue3);
                    jSONWriter.writeName("hour");
                    jSONWriter.writeInt32(iApplyAsInt);
                    jSONWriter.writeName("minute");
                    jSONWriter.writeInt32(iApplyAsInt2);
                    jSONWriter.writeName("second");
                    jSONWriter.writeInt32(iApplyAsInt3);
                    jSONWriter.writeName("millis");
                    jSONWriter.writeInt32(iApplyAsInt4);
                    jSONWriter.writeName("chronology");
                    jSONWriter.writeAny(objApply);
                    jSONWriter.endObject();
                    return;
                }
                jSONWriter.writeLocalDateTime(LocalDateTime.of(iIntValue, iIntValue2, iIntValue3, iApplyAsInt, iApplyAsInt2, iApplyAsInt3, iApplyAsInt4 * 1000000));
            } catch (IllegalAccessException e) {
                e = e;
                throw new JSONException("write LocalDateWriter error", e);
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new JSONException("write LocalDateWriter error", e);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class LocalDateWriter extends DateTimeCodec implements ObjectWriter {
        final Function getChronology;
        final ToIntFunction getDayOfMonth;
        final ToIntFunction getMonthOfYear;
        final ToIntFunction getYear;
        final Class isoChronology;
        final Class objectClass;
        final Object utc;

        public LocalDateWriter(Class cls, String str) {
            super(str);
            this.objectClass = cls;
            try {
                Class<?> clsLoadClass = cls.getClassLoader().loadClass("org.joda.time.chrono.ISOChronology");
                this.isoChronology = clsLoadClass;
                this.utc = clsLoadClass.getMethod("withUTC", null).invoke(clsLoadClass.getMethod("getInstance", null).invoke(null, null), null);
                this.getYear = LambdaMiscCodec.createToIntFunction(cls.getMethod("getYear", null));
                this.getMonthOfYear = LambdaMiscCodec.createToIntFunction(cls.getMethod("getMonthOfYear", null));
                this.getDayOfMonth = LambdaMiscCodec.createToIntFunction(cls.getMethod("getDayOfMonth", null));
                this.getChronology = LambdaMiscCodec.createFunction(cls.getMethod("getChronology", null));
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                throw new JSONException("create LocalDateWriter error", e);
            }
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            int iApplyAsInt = this.getYear.applyAsInt(obj);
            int iApplyAsInt2 = this.getMonthOfYear.applyAsInt(obj);
            int iApplyAsInt3 = this.getDayOfMonth.applyAsInt(obj);
            Object objApply = this.getChronology.apply(obj);
            if (objApply == this.utc || objApply == null) {
                LocalDate localDateOf = LocalDate.of(iApplyAsInt, iApplyAsInt2, iApplyAsInt3);
                DateTimeFormatter dateFormatter = getDateFormatter();
                if (dateFormatter == null) {
                    dateFormatter = jSONWriter.context.getDateFormatter();
                }
                if (dateFormatter == null) {
                    jSONWriter.writeLocalDate(localDateOf);
                    return;
                } else {
                    jSONWriter.writeString(dateFormatter.format(localDateOf));
                    return;
                }
            }
            jSONWriter.startObject();
            jSONWriter.writeName("year");
            jSONWriter.writeInt32(iApplyAsInt);
            jSONWriter.writeName("month");
            jSONWriter.writeInt32(iApplyAsInt2);
            jSONWriter.writeName("day");
            jSONWriter.writeInt32(iApplyAsInt3);
            jSONWriter.writeName("chronology");
            jSONWriter.writeAny(objApply);
            jSONWriter.endObject();
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            int iApplyAsInt = this.getYear.applyAsInt(obj);
            int iApplyAsInt2 = this.getMonthOfYear.applyAsInt(obj);
            int iApplyAsInt3 = this.getDayOfMonth.applyAsInt(obj);
            Object objApply = this.getChronology.apply(obj);
            if (jSONWriter.isWriteTypeInfo(obj, type, j)) {
                jSONWriter.writeTypeName(TypeUtils.getTypeName(obj.getClass()));
            }
            if (objApply == this.utc || objApply == null) {
                jSONWriter.writeLocalDate(LocalDate.of(iApplyAsInt, iApplyAsInt2, iApplyAsInt3));
                return;
            }
            jSONWriter.startObject();
            jSONWriter.writeName("year");
            jSONWriter.writeInt32(iApplyAsInt);
            jSONWriter.writeName("month");
            jSONWriter.writeInt32(iApplyAsInt2);
            jSONWriter.writeName("day");
            jSONWriter.writeInt32(iApplyAsInt3);
            jSONWriter.writeName("chronology");
            jSONWriter.writeAny(objApply);
            jSONWriter.endObject();
        }
    }

    public static ObjectReader createChronologyReader(Class cls) {
        return new ChronologyReader(cls);
    }

    public static ObjectWriter createGregorianChronologyWriter(Class cls) {
        return new GregorianChronologyWriter(cls);
    }

    public static ObjectWriter createISOChronologyWriter(Class cls) {
        return new ISOChronologyWriter(cls);
    }

    public static ObjectReader createInstantReader(Class cls) {
        return new InstantReader(cls);
    }

    public static ObjectReader createLocalDateReader(Class cls) {
        return new LocalDateReader(cls);
    }

    public static ObjectReader createLocalDateTimeReader(Class cls) {
        return new LocalDateTimeReader(cls);
    }

    public static ObjectWriter createLocalDateTimeWriter(Class cls, String str) {
        return new LocalDateTimeWriter(cls, str);
    }

    public static ObjectWriter createLocalDateWriter(Class cls, String str) {
        return new LocalDateWriter(cls, str);
    }
}
