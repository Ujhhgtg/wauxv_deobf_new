package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler;
import com.alibaba.fastjson2.filter.ExtraProcessor;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.reader.ObjectReaderImplObject;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.reader.ValueConsumer;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.ReferenceKey;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.util.Wrapper;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import p000.AbstractC0924feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3317feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSONReader implements Closeable {
    static final byte[] CHAR1_ESCAPED;
    static final char EOI = 26;
    static final boolean[] INT_VALUE_END;
    static final byte JSON_TYPE_ARRAY = 7;
    static final byte JSON_TYPE_BIG_DEC = 8;
    static final byte JSON_TYPE_BOOL = 4;
    static final byte JSON_TYPE_DEC = 2;
    static final byte JSON_TYPE_DOUBLE = 13;
    static final byte JSON_TYPE_FLOAT = 12;
    static final byte JSON_TYPE_INT = 1;
    static final byte JSON_TYPE_INT16 = 10;
    static final byte JSON_TYPE_INT64 = 11;
    static final byte JSON_TYPE_INT8 = 9;
    static final byte JSON_TYPE_NULL = 5;
    static final byte JSON_TYPE_NaN = 14;
    static final byte JSON_TYPE_OBJECT = 6;
    static final byte JSON_TYPE_STRING = 3;
    protected static final long MASK_ALLOW_UN_QUOTED_FIELD_NAMES = 131072;
    protected static final long MASK_DISABLE_REFERENCE_DETECT = 8589934592L;
    protected static final long MASK_DISABLE_SINGLE_QUOTE = 2147483648L;
    protected static final long MASK_EMPTY_STRING_AS_NULL = 134217728;
    protected static final long MASK_ERROR_ON_NONE_SERIALIZABLE = 4;
    protected static final long MASK_FIELD_BASED = 1;
    protected static final long MASK_IGNORE_NONE_SERIALIZABLE = 2;
    protected static final long MASK_INIT_STRING_FIELD_AS_EMPTY = 16;
    protected static final long MASK_SUPPORT_ARRAY_TO_BEAN = 8;
    protected static final long MASK_SUPPORT_AUTO_TYPE = 32;
    protected static final long MASK_SUPPORT_SMART_MATCH = 64;
    protected static final long MASK_TRIM_STRING = 16384;
    static final int MAX_EXP = 2047;
    static final long SPACE = 4294981377L;
    protected boolean boolValue;
    protected char ch;
    protected boolean comma;
    protected Object complex;
    protected final Context context;
    protected byte[] doubleChars;
    protected short exponent;
    public final boolean jsonb;
    protected int level;
    protected int mag0;
    protected int mag1;
    protected int mag2;
    protected int mag3;
    protected int nameBegin;
    protected boolean nameEscape;
    protected boolean negative;
    protected int offset;
    List<ResolveTask> resolveTasks;
    protected short scale;
    protected String stringValue;
    protected boolean typeRedirect;
    public final boolean utf8;
    protected boolean valueEscape;
    protected byte valueType;
    protected boolean wasNull;

    /* JADX INFO: compiled from: obf */
    public interface AutoTypeBeforeHandler extends Filter {
        default Class<?> apply(long j, Class<?> cls, long j2) {
            return null;
        }

        Class<?> apply(String str, Class<?> cls, long j);
    }

    /* JADX INFO: compiled from: obf */
    public static final class BigIntegerCreator implements BiFunction<Integer, int[], BigInteger> {
        static final BiFunction<Integer, int[], BigInteger> BIG_INTEGER_CREATOR;

        static {
            BiFunction bigIntegerCreator;
            if (JDKUtils.ANDROID || JDKUtils.GRAAL) {
                bigIntegerCreator = null;
            } else {
                try {
                    MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(BigInteger.class);
                    MethodHandle methodHandleFindConstructor = lookupTrustedLookup.findConstructor(BigInteger.class, MethodType.methodType(Void.TYPE, Integer.TYPE, int[].class));
                    bigIntegerCreator = (BiFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", MethodType.methodType(BiFunction.class), methodHandleFindConstructor.type().generic(), methodHandleFindConstructor, MethodType.methodType(BigInteger.class, Integer.class, int[].class)).getTarget().invokeExact();
                } catch (Throwable unused) {
                    bigIntegerCreator = null;
                }
            }
            if (bigIntegerCreator == null) {
                bigIntegerCreator = new BigIntegerCreator();
            }
            BIG_INTEGER_CREATOR = bigIntegerCreator;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x004b  */
        @Override // java.util.function.BiFunction
        public BigInteger apply(Integer num, int[] iArr) {
            int length;
            int iIntValue = num.intValue();
            if (iArr.length == 0) {
                length = 0;
            } else {
                length = ((iArr.length - 1) << 5) + (32 - Integer.numberOfLeadingZeros(iArr[0]));
                if (iIntValue < 0) {
                    boolean z = Integer.bitCount(iArr[0]) == 1;
                    for (int i = 1; i < iArr.length && z; i++) {
                        z = iArr[i] == 0;
                    }
                    if (z) {
                        length--;
                    }
                }
            }
            int i2 = length / 8;
            byte[] bArr = new byte[i2 + 1];
            int i3 = 0;
            int i4 = 0;
            int i5 = 4;
            while (i2 >= 0) {
                if (i5 == 4) {
                    int i6 = i4 + 1;
                    if (i4 < 0) {
                        i3 = 0;
                    } else if (i4 < iArr.length) {
                        i3 = iArr[(iArr.length - i4) - 1];
                        if (iIntValue < 0) {
                            int length2 = iArr.length;
                            int i7 = length2 - 1;
                            while (i7 >= 0 && iArr[i7] == 0) {
                                i7--;
                            }
                            i3 = i4 <= (length2 - i7) - 1 ? -i3 : ~i3;
                        }
                    } else if (iIntValue < 0) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                    i4 = i6;
                    i5 = 1;
                } else {
                    i3 >>>= 8;
                    i5++;
                }
                bArr[i2] = (byte) i3;
                i2--;
            }
            return new BigInteger(bArr);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Context {
        Supplier<List> arraySupplier;
        AutoTypeBeforeHandler autoTypeBeforeHandler;
        int bufferSize;
        String dateFormat;
        DateTimeFormatter dateFormatter;
        ExtraProcessor extraProcessor;
        long features;
        boolean formatComplex;
        boolean formatHasDay;
        boolean formatHasHour;
        boolean formatISO8601;
        boolean formatMillis;
        boolean formatUnixTime;
        boolean formatyyyyMMdd8;
        boolean formatyyyyMMddhhmmss19;
        boolean formatyyyyMMddhhmmssT19;
        Locale locale;
        int maxLevel;
        Supplier<Map> objectSupplier;
        final ObjectReaderProvider provider;
        final SymbolTable symbolTable;
        TimeZone timeZone;
        boolean useSimpleFormatter;
        boolean yyyyMMddhhmm16;
        ZoneId zoneId;

        public Context(ObjectReaderProvider objectReaderProvider) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.objectSupplier = JSONFactory.defaultObjectSupplier;
            this.arraySupplier = JSONFactory.defaultArraySupplier;
            this.symbolTable = null;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
        }

        public void config(Feature... featureArr) {
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public Supplier<List> getArraySupplier() {
            return this.arraySupplier;
        }

        public int getBufferSize() {
            return this.bufferSize;
        }

        public AutoTypeBeforeHandler getContextAutoTypeBeforeHandler() {
            return this.autoTypeBeforeHandler;
        }

        public String getDateFormat() {
            return this.dateFormat;
        }

        public DateTimeFormatter getDateFormatter() {
            String str;
            if (this.dateFormatter == null && (str = this.dateFormat) != null && !this.formatMillis && !this.formatISO8601 && !this.formatUnixTime) {
                Locale locale = this.locale;
                this.dateFormatter = locale == null ? DateTimeFormatter.ofPattern(str) : DateTimeFormatter.ofPattern(str, locale);
            }
            return this.dateFormatter;
        }

        public ExtraProcessor getExtraProcessor() {
            return this.extraProcessor;
        }

        public long getFeatures() {
            return this.features;
        }

        public Locale getLocale() {
            return this.locale;
        }

        public int getMaxLevel() {
            return this.maxLevel;
        }

        public ObjectReader getObjectReader(Type type) {
            return this.provider.getObjectReader(type, (this.features & Feature.FieldBased.mask) != 0);
        }

        public ObjectReader getObjectReaderAutoType(long j) {
            return this.provider.getObjectReader(j);
        }

        public Supplier<Map> getObjectSupplier() {
            return this.objectSupplier;
        }

        public ObjectReaderProvider getProvider() {
            return this.provider;
        }

        public TimeZone getTimeZone() {
            return this.timeZone;
        }

        public ZoneId getZoneId() {
            if (this.zoneId == null) {
                this.zoneId = DateUtils.DEFAULT_ZONE_ID;
            }
            return this.zoneId;
        }

        public boolean isEnabled(Feature feature) {
            return (this.features & feature.mask) != 0;
        }

        public boolean isFormatHasHour() {
            return this.formatHasHour;
        }

        public boolean isFormatISO8601() {
            return this.formatISO8601;
        }

        public boolean isFormatMillis() {
            return this.formatMillis;
        }

        public boolean isFormatUnixTime() {
            return this.formatUnixTime;
        }

        public boolean isFormatyyyyMMdd8() {
            return this.formatyyyyMMdd8;
        }

        public boolean isFormatyyyyMMddhhmmss19() {
            return this.formatyyyyMMddhhmmss19;
        }

        public boolean isFormatyyyyMMddhhmmssT19() {
            return this.formatyyyyMMddhhmmssT19;
        }

        public void setArraySupplier(Supplier<List> supplier) {
            this.arraySupplier = supplier;
        }

        public Context setBufferSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("buffer size can not be less than zero");
            }
            this.bufferSize = i;
            return this;
        }

        public void setDateFormat(String str) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            if (str != null && str.isEmpty()) {
                str = null;
            }
            boolean z7 = false;
            if (str != null) {
                switch (str) {
                    case "yyyy-MM-dd HH:mm":
                        this.yyyyMMddhhmm16 = true;
                        z6 = false;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                        break;
                    case "millis":
                        z6 = false;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                        z2 = true;
                        break;
                    case "yyyyMMddHHmmssSSSZ":
                        z6 = false;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        z5 = true;
                        break;
                    case "unixtime":
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                        z6 = true;
                        break;
                    case "yyyyMMdd":
                    case "yyyy-MM-dd":
                        this.formatyyyyMMdd8 = true;
                        z6 = false;
                        z2 = false;
                        z4 = false;
                        z5 = false;
                        z3 = true;
                        break;
                    case "yyyy-MM-dd HH:mm:ss":
                    case "yyyy-MM-ddTHH:mm:ss":
                        this.formatyyyyMMddhhmmss19 = true;
                        z6 = false;
                        z2 = false;
                        z5 = false;
                        z3 = true;
                        z4 = true;
                        break;
                    case "yyyy-MM-dd'T'HH:mm:ss":
                        this.formatyyyyMMddhhmmssT19 = true;
                        z6 = false;
                        z2 = false;
                        z5 = false;
                        z3 = true;
                        z4 = true;
                        break;
                    case "iso8601":
                        z6 = false;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                        z7 = true;
                        break;
                    default:
                        z5 = false;
                        z3 = str.indexOf(100) != -1;
                        z4 = (str.indexOf(72) == -1 && str.indexOf(104) == -1 && str.indexOf(75) == -1 && str.indexOf(107) == -1) ? false : true;
                        z6 = false;
                        z2 = false;
                        break;
                }
                this.formatComplex = true ^ (((this.formatyyyyMMddhhmmss19 | this.formatyyyyMMddhhmmssT19) | this.formatyyyyMMdd8) | z7);
                boolean z8 = z6;
                z = z7;
                z7 = z8;
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            if (!Objects.equals(this.dateFormat, str)) {
                this.dateFormatter = null;
            }
            this.dateFormat = str;
            this.formatUnixTime = z7;
            this.formatMillis = z2;
            this.formatISO8601 = z;
            this.formatHasDay = z3;
            this.formatHasHour = z4;
            this.useSimpleFormatter = z5;
        }

        public void setDateFormatter(DateTimeFormatter dateTimeFormatter) {
            this.dateFormatter = dateTimeFormatter;
        }

        public void setExtraProcessor(ExtraProcessor extraProcessor) {
            this.extraProcessor = extraProcessor;
        }

        public void setFeatures(long j) {
            this.features = j;
        }

        public void setLocale(Locale locale) {
            this.locale = locale;
        }

        public void setMaxLevel(int i) {
            this.maxLevel = i;
        }

        public void setObjectSupplier(Supplier<Map> supplier) {
            this.objectSupplier = supplier;
        }

        public void setTimeZone(TimeZone timeZone) {
            this.timeZone = timeZone;
        }

        public void setZoneId(ZoneId zoneId) {
            this.zoneId = zoneId;
        }

        public ObjectReader getObjectReaderAutoType(String str, Class cls) {
            Class<?> clsApply;
            AutoTypeBeforeHandler autoTypeBeforeHandler = this.autoTypeBeforeHandler;
            if (autoTypeBeforeHandler == null || (clsApply = autoTypeBeforeHandler.apply(str, (Class<?>) cls, this.features)) == null) {
                return this.provider.getObjectReader(str, cls, this.features);
            }
            return this.provider.getObjectReader(clsApply, (this.features & Feature.FieldBased.mask) != 0);
        }

        public void config(Filter filter, Feature... featureArr) {
            if (filter instanceof AutoTypeBeforeHandler) {
                this.autoTypeBeforeHandler = (AutoTypeBeforeHandler) filter;
            }
            if (filter instanceof ExtraProcessor) {
                this.extraProcessor = (ExtraProcessor) filter;
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public ObjectReader getObjectReaderAutoType(String str, Class cls, long j) {
            Class<?> clsApply;
            AutoTypeBeforeHandler autoTypeBeforeHandler = this.autoTypeBeforeHandler;
            if (autoTypeBeforeHandler != null && (clsApply = autoTypeBeforeHandler.apply(str, (Class<?>) cls, j)) != null) {
                return this.provider.getObjectReader(clsApply, (Feature.FieldBased.mask & j) != 0);
            }
            return this.provider.getObjectReader(str, cls, j | this.features);
        }

        public void config(Filter filter) {
            if (filter instanceof AutoTypeBeforeHandler) {
                this.autoTypeBeforeHandler = (AutoTypeBeforeHandler) filter;
            }
            if (filter instanceof ExtraProcessor) {
                this.extraProcessor = (ExtraProcessor) filter;
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, long j) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = j;
            this.provider = objectReaderProvider;
            this.objectSupplier = JSONFactory.defaultObjectSupplier;
            this.arraySupplier = JSONFactory.defaultArraySupplier;
            this.symbolTable = null;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
        }

        public void config(Filter[] filterArr, Feature... featureArr) {
            for (Filter filter : filterArr) {
                if (filter instanceof AutoTypeBeforeHandler) {
                    this.autoTypeBeforeHandler = (AutoTypeBeforeHandler) filter;
                }
                if (filter instanceof ExtraProcessor) {
                    this.extraProcessor = (ExtraProcessor) filter;
                }
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public void config(Filter[] filterArr) {
            for (Filter filter : filterArr) {
                if (filter instanceof AutoTypeBeforeHandler) {
                    this.autoTypeBeforeHandler = (AutoTypeBeforeHandler) filter;
                }
                if (filter instanceof ExtraProcessor) {
                    this.extraProcessor = (ExtraProcessor) filter;
                }
            }
        }

        public Context(Feature... featureArr) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = JSONFactory.getDefaultObjectReaderProvider();
            this.objectSupplier = JSONFactory.defaultObjectSupplier;
            this.arraySupplier = JSONFactory.defaultArraySupplier;
            this.symbolTable = null;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public void config(Feature feature, boolean z) {
            if (z) {
                this.features = feature.mask | this.features;
            } else {
                this.features = (~feature.mask) & this.features;
            }
        }

        public Context(String str, Feature... featureArr) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = JSONFactory.getDefaultObjectReaderProvider();
            this.objectSupplier = JSONFactory.defaultObjectSupplier;
            this.arraySupplier = JSONFactory.defaultArraySupplier;
            this.symbolTable = null;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str2 = JSONFactory.defaultReaderFormat;
            if (str2 != null) {
                setDateFormat(str2);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
            setDateFormat(str);
        }

        public Context(ObjectReaderProvider objectReaderProvider, Feature... featureArr) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.objectSupplier = JSONFactory.defaultObjectSupplier;
            this.arraySupplier = JSONFactory.defaultArraySupplier;
            this.symbolTable = null;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, Filter filter, Feature... featureArr) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.objectSupplier = JSONFactory.defaultObjectSupplier;
            this.arraySupplier = JSONFactory.defaultArraySupplier;
            this.symbolTable = null;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            config(filter);
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, SymbolTable symbolTable) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.symbolTable = symbolTable;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, SymbolTable symbolTable, Feature... featureArr) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.symbolTable = symbolTable;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }

        public Context(ObjectReaderProvider objectReaderProvider, SymbolTable symbolTable, Filter[] filterArr, Feature... featureArr) {
            this.maxLevel = 2048;
            this.bufferSize = 524288;
            this.features = JSONFactory.defaultReaderFeatures;
            this.provider = objectReaderProvider;
            this.symbolTable = symbolTable;
            this.zoneId = JSONFactory.defaultReaderZoneId;
            config(filterArr);
            String str = JSONFactory.defaultReaderFormat;
            if (str != null) {
                setDateFormat(str);
            }
            for (Feature feature : featureArr) {
                this.features |= feature.mask;
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public enum Feature {
        FieldBased(1),
        IgnoreNoneSerializable(2),
        ErrorOnNoneSerializable(4),
        SupportArrayToBean(8),
        InitStringFieldAsEmpty(16),
        SupportAutoType(32),
        SupportSmartMatch(64),
        UseNativeObject(128),
        SupportClassForName(256),
        IgnoreSetNullValue(512),
        UseDefaultConstructorAsPossible(1024),
        UseBigDecimalForFloats(JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME),
        UseBigDecimalForDoubles(JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE),
        ErrorOnEnumNotMatch(JSONWriter.MASK_WRITE_ENUMS_USING_NAME),
        TrimString(16384),
        ErrorOnNotSupportAutoType(JSONWriter.MASK_IGNORE_ERROR_GETTER),
        DuplicateKeyValueAsArray(JSONWriter.MASK_PRETTY_FORMAT),
        AllowUnQuotedFieldNames(131072),
        NonStringKeyAsString(262144),
        Base64StringAsByteArray(JSONWriter.MASK_WRITE_BIG_DECIMAL_AS_PLAIN),
        IgnoreCheckClose(JSONWriter.MASK_USE_SINGLE_QUOTES),
        ErrorOnNullForPrimitives(2097152),
        NullOnError(JSONWriter.MASK_WRITE_NULL_LIST_AS_EMPTY),
        IgnoreAutoTypeNotMatch(JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY),
        NonZeroNumberCastToBooleanAsTrue(JSONWriter.MASK_WRITE_NULL_NUMBER_AS_ZERO),
        IgnoreNullPropertyValue(JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE),
        ErrorOnUnknownProperties(JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY),
        EmptyStringAsNull(134217728),
        NonErrorOnNumberOverflow(JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN),
        UseBigIntegerForInts(536870912),
        UseLongForInts(JSONWriter.MASK_ESCAPE_NONE_ASCII),
        DisableSingleQuote(JSONReader.MASK_DISABLE_SINGLE_QUOTE),
        UseDoubleForDecimals(JSONWriter.MASK_IGNORE_NON_FIELD_GETTER),
        DisableReferenceDetect(JSONReader.MASK_DISABLE_REFERENCE_DETECT),
        DisableStringArrayUnwrapping(JSONWriter.MASK_WRITE_LONG_AS_STRING);

        public final long mask;

        Feature(long j) {
            this.mask = j;
        }

        public static long of(Feature[] featureArr) {
            long j = 0;
            if (featureArr == null) {
                return 0L;
            }
            for (Feature feature : featureArr) {
                j |= feature.mask;
            }
            return j;
        }

        public boolean isEnabled(long j) {
            return (j & this.mask) != 0;
        }

        public static boolean isEnabled(long j, Feature feature) {
            return (j & feature.mask) != 0;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ResolveTask {
        final FieldReader fieldReader;
        final Object name;
        final Object object;
        final JSONPath reference;

        public ResolveTask(FieldReader fieldReader, Object obj, Object obj2, JSONPath jSONPath) {
            this.fieldReader = fieldReader;
            this.object = obj;
            this.name = obj2;
            this.reference = jSONPath;
        }

        public String toString() {
            return this.reference.toString();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class SavePoint {
        protected final int current;
        protected final int offset;

        public SavePoint(int i, int i2) {
            this.offset = i;
            this.current = i2;
        }
    }

    static {
        boolean[] zArr = new boolean[bc.e];
        INT_VALUE_END = zArr;
        Arrays.fill(zArr, true);
        char[] cArr = {'.', 'e', 'E', 't', 'f', 'n', '{', '[', '0', '1', '2', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < 19; i++) {
            INT_VALUE_END[cArr[i]] = false;
        }
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        byte[] bArr2 = {JSONB.Constants.BC_INT32_BYTE_MIN, 0, 49, 1, 50, 2, 51, 3, 52, 4, 53, 5, 54, 6, 55, 7, 98, 8, 116, 9, 110, 10, 118, 11, 102, 12, 70, 12, 114, 13, 34, 34, 39, 39, JSONB.Constants.BC_INT32_NUM_MAX, JSONB.Constants.BC_INT32_NUM_MAX, 46, 46, 92, 92, 35, 35, 38, 38, 91, 91, 93, 93, JSONB.Constants.BC_INT32_SHORT_MIN, JSONB.Constants.BC_INT32_SHORT_MIN, 40, 40, 41, 41, 95, 95, 44, 44, JSONB.Constants.BC_STR_GB18030, JSONB.Constants.BC_STR_GB18030, 32, 32};
        for (int i2 = 0; i2 < 62; i2 += 2) {
            bArr[bArr2[i2]] = bArr2[i2 + 1];
        }
        CHAR1_ESCAPED = bArr;
    }

    public JSONReader(Context context, boolean z, boolean z2) {
        this.context = context;
        this.jsonb = z;
        this.utf8 = z2;
    }

    private void add(List<Object> list, int i, Object obj) {
        if (!(obj instanceof JSONPath)) {
            list.add(obj);
        } else {
            addResolveTask(list, i, (JSONPath) obj);
            list.add(null);
        }
    }

    public static AutoTypeBeforeHandler autoTypeFilter(String... strArr) {
        return new ContextAutoTypeBeforeHandler(strArr);
    }

    public static char char2(int i, int i2) {
        int[] iArr = JSONFactory.DIGITS2;
        return (char) ((iArr[i] * 16) + iArr[i2]);
    }

    public static boolean isFirstIdentifier(int i) {
        if (i >= 65 && i <= 90) {
            return true;
        }
        if ((i >= 97 && i <= 122) || i == 95 || i == 36) {
            return true;
        }
        return (i >= 48 && i <= 57) || i > 127;
    }

    public static int newCapacity(int i, int i2) {
        int i3 = i2 + (i2 >> 1);
        if (i3 - i >= 0) {
            i = i3;
        }
        if (i >= 0) {
            return i;
        }
        throw new OutOfMemoryError();
    }

    public static JSONException numberError(int i, int i2) {
        StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "illegal number, offset ", ", char ");
        sbM4804Ujhhgtgfeyxiexzf.append((char) i2);
        return new JSONException(sbM4804Ujhhgtgfeyxiexzf.toString());
    }

    public static JSONReader of(byte[] bArr) {
        return of(bArr, 0, bArr.length, StandardCharsets.UTF_8, JSONFactory.createReadContext());
    }

    public static JSONReader ofJSONB(byte[] bArr) {
        return new JSONReaderJSONB(JSONFactory.createReadContext(), bArr, 0, bArr.length);
    }

    private static JSONReader ofUTF16(byte[] bArr, int i, int i2, Context context) {
        return new JSONReaderUTF16(context, bArr, i, i2);
    }

    private boolean readReference0(Collection collection, int i) {
        String reference = readReference();
        if ("..".equals(reference)) {
            collection.add(collection);
            return true;
        }
        addResolveTask(collection, i, JSONPath.of(reference));
        return true;
    }

    public static String stringValue(String str, long j) {
        if ((16384 & j) != 0) {
            str = str.trim();
        }
        if ((j & 134217728) == 0 || !str.isEmpty()) {
            return str;
        }
        return null;
    }

    public static JSONException syntaxError(int i) {
        return new JSONException("syntax error, expect ',', but '" + ((char) i) + "'");
    }

    public final void addResolveTask(FieldReader fieldReader, Object obj, JSONPath jSONPath) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        this.resolveTasks.add(new ResolveTask(fieldReader, obj, fieldReader.fieldName, jSONPath));
    }

    public final void bigInt(char[] cArr, int i, int i2) {
        int i3;
        long j;
        char c;
        long j2;
        int i4 = i2 - i;
        if (this.scale > 0) {
            i4--;
        }
        if (i4 > 38) {
            throw new JSONException("number too large : ".concat(new String(cArr, i, i4)));
        }
        int i5 = i4 % 9;
        int i6 = i + (i5 != 0 ? i5 : 9);
        int i7 = i + 1;
        char c2 = cArr[i];
        if (c2 == '.') {
            c2 = cArr[i7];
            i7 = i + 2;
            i3 = i6 + 1;
        } else {
            i3 = i6;
        }
        int i8 = c2 - '0';
        while (i7 < i6) {
            char c3 = cArr[i7];
            if (c3 == '.') {
                i7++;
                c3 = cArr[i7];
                i3++;
                if (i6 < i2) {
                    i6++;
                }
            }
            i8 = (i8 * 10) + (c3 - '0');
            i7++;
        }
        this.mag3 = i8;
        while (i3 < i2) {
            int i9 = i3 + 9;
            int i10 = i3 + 1;
            char c4 = cArr[i3];
            if (c4 == '.') {
                int i11 = i3 + 2;
                c4 = cArr[i10];
                i3 += 10;
                i10 = i11;
                i9 = i3;
            } else {
                i3 = i9;
            }
            int i12 = c4 - '0';
            while (i10 < i9) {
                char c5 = cArr[i10];
                if (c5 == '.') {
                    i10++;
                    c5 = cArr[i10];
                    i3++;
                    i9++;
                }
                i12 = (i12 * 10) + (c5 - '0');
                i10++;
            }
            long j3 = 0;
            for (int i13 = 3; i13 >= 0; i13--) {
                if (i13 == 0) {
                    c = ' ';
                    j2 = j3 + (1000000000 * (((long) this.mag0) & 4294967295L));
                    this.mag0 = (int) j2;
                } else if (i13 == 1) {
                    c = ' ';
                    j2 = j3 + (1000000000 * (((long) this.mag1) & 4294967295L));
                    this.mag1 = (int) j2;
                } else if (i13 == 2) {
                    c = ' ';
                    j2 = j3 + (1000000000 * (((long) this.mag2) & 4294967295L));
                    this.mag2 = (int) j2;
                } else {
                    if (i13 != 3) {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    c = ' ';
                    j2 = j3 + (1000000000 * (((long) this.mag3) & 4294967295L));
                    this.mag3 = (int) j2;
                }
                j3 = j2 >>> c;
            }
            long j4 = (((long) this.mag3) & 4294967295L) + (((long) i12) & 4294967295L);
            this.mag3 = (int) j4;
            long j5 = j4 >>> 32;
            for (int i14 = 2; i14 >= 0; i14--) {
                if (i14 == 0) {
                    j = (((long) this.mag0) & 4294967295L) + j5;
                    this.mag0 = (int) j;
                } else if (i14 == 1) {
                    j = (((long) this.mag1) & 4294967295L) + j5;
                    this.mag1 = (int) j;
                } else if (i14 == 2) {
                    j = (((long) this.mag2) & 4294967295L) + j5;
                    this.mag2 = (int) j;
                } else {
                    if (i14 != 3) {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j = (((long) this.mag3) & 4294967295L) + j5;
                    this.mag3 = (int) j;
                }
                j5 = j >>> 32;
            }
        }
    }

    public final char char1(int i) {
        byte b = CHAR1_ESCAPED[i & 127];
        if (b != -1) {
            return (char) b;
        }
        throw char1Error(i);
    }

    public JSONException char1Error(int i) {
        return new JSONException(info("unclosed.str '\\" + ((char) i)));
    }

    public ObjectReader checkAutoType(Class cls, long j, long j2) {
        return null;
    }

    public final boolean checkNameBegin(int i) {
        long j = this.context.features;
        if (i == 39 && (MASK_DISABLE_SINGLE_QUOTE & j) != 0) {
            throw notSupportName();
        }
        if (i == 34 || i == 39) {
            return false;
        }
        if ((j & 131072) == 0) {
            throw notSupportName();
        }
        readFieldNameHashCodeUnquote();
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public final char current() {
        return this.ch;
    }

    public final BigDecimal decimal(JSONObject jSONObject) {
        BigDecimal bigDecimal = jSONObject.getBigDecimal("value");
        if (bigDecimal == null) {
            bigDecimal = jSONObject.getBigDecimal("$numberDecimal");
        }
        if (bigDecimal != null) {
            return bigDecimal;
        }
        throw error("can not cast to decimal " + jSONObject);
    }

    public void endArray() {
        next();
    }

    public final JSONException error(String str) {
        return new JSONException(info(str));
    }

    public final void errorOnNoneSerializable(Class cls) {
        if ((this.context.features & 4) != 0 && !Serializable.class.isAssignableFrom(cls)) {
            throw new JSONException("not support none-Serializable, class ".concat(cls.getName()));
        }
    }

    public final long features(long j) {
        return j | this.context.features;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0115  */
    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    public final BigDecimal getBigDecimal() {
        int[] iArr;
        int i;
        BigDecimal bigDecimal;
        int[] iArr2;
        int[] iArr3;
        int i2;
        int i3;
        if (this.wasNull) {
            return null;
        }
        byte b = this.valueType;
        if (b == 1) {
            int i4 = this.mag1;
            if (i4 == 0 && this.mag2 == 0 && (i = this.mag3) >= 0) {
                return BigDecimal.valueOf(this.negative ? -i : i);
            }
            int i5 = this.mag0;
            if (i5 != 0) {
                iArr = new int[]{i5, i4, this.mag2, this.mag3};
            } else if (i4 == 0) {
                int i6 = this.mag3;
                long j = ((long) i6) & 4294967295L;
                int i7 = this.mag2;
                long j2 = 4294967295L & ((long) i7);
                if (j2 <= 2147483647L) {
                    long j3 = (j2 << 32) + j;
                    if (this.negative) {
                        j3 = -j3;
                    }
                    return BigDecimal.valueOf(j3);
                }
                iArr = new int[]{i7, i6};
            } else {
                iArr = new int[]{i4, this.mag2, this.mag3};
            }
            return new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : 1), iArr));
        }
        if (b != 2) {
            if (b == 3) {
                try {
                    return TypeUtils.toBigDecimal(this.stringValue);
                } catch (NumberFormatException e) {
                    throw new JSONException(info("read decimal error, value " + this.stringValue), e);
                }
            }
            if (b == 4) {
                return this.boolValue ? BigDecimal.ONE : BigDecimal.ZERO;
            }
            if (b != 6) {
                if (b == 8) {
                    return TypeUtils.toBigDecimal(this.stringValue);
                }
                throw new JSONException("TODO : " + ((int) this.valueType));
            }
            JSONObject jSONObject = (JSONObject) this.complex;
            BigDecimal bigDecimal2 = jSONObject.getBigDecimal("value");
            if (bigDecimal2 == null) {
                bigDecimal2 = jSONObject.getBigDecimal("$numberDecimal");
            }
            if (bigDecimal2 != null) {
                return bigDecimal2;
            }
            throw new JSONException("TODO : " + ((int) this.valueType));
        }
        if (this.exponent == 0 && this.mag0 == 0 && this.mag1 == 0) {
            int i8 = this.mag2;
            if (i8 != 0 || (i3 = this.mag3) < 0) {
                long j4 = ((long) this.mag3) & 4294967295L;
                long j5 = ((long) i8) & 4294967295L;
                if (j5 <= 2147483647L) {
                    long j6 = (j5 << 32) + j4;
                    if (this.negative) {
                        j6 = -j6;
                    }
                    bigDecimal = BigDecimal.valueOf(j6, this.scale);
                } else {
                    bigDecimal = null;
                }
            } else {
                if (this.negative) {
                    i3 = -i3;
                }
                bigDecimal = BigDecimal.valueOf(i3, this.scale);
            }
        } else {
            bigDecimal = null;
        }
        if (bigDecimal == null) {
            int i9 = this.mag0;
            if (i9 == 0) {
                int i10 = this.mag1;
                if (i10 == 0) {
                    int i11 = this.mag2;
                    if (i11 == 0) {
                        iArr3 = new int[]{this.mag3};
                    } else {
                        iArr2 = new int[]{i11, this.mag3};
                    }
                    if (this.negative) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    bigDecimal = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(i2), iArr3), this.scale);
                } else {
                    iArr2 = new int[]{i10, this.mag2, this.mag3};
                }
            } else {
                iArr2 = new int[]{i9, this.mag1, this.mag2, this.mag3};
            }
            iArr3 = iArr2;
            if (this.negative) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            bigDecimal = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(i2), iArr3), this.scale);
        }
        if (this.exponent == 0) {
            return bigDecimal;
        }
        return TypeUtils.toBigDecimal(Double.parseDouble(bigDecimal.toPlainString() + "E" + ((int) this.exponent)));
    }

    public final BigInteger getBigInteger() {
        Number number = getNumber();
        if (number == null) {
            return null;
        }
        return number instanceof BigInteger ? (BigInteger) number : BigInteger.valueOf(number.longValue());
    }

    public final Context getContext() {
        return this.context;
    }

    public final double getDoubleValue() {
        int i;
        switch (this.valueType) {
            case 1:
            case 9:
            case 10:
                if (this.mag1 == 0 && this.mag2 == 0 && (i = this.mag3) != Integer.MIN_VALUE) {
                    return this.negative ? -i : i;
                }
                return getNumber().doubleValue();
            case 2:
            case 11:
            case Opcodes.FCONST_1 /* 12 */:
            case 13:
                return getNumber().doubleValue();
            case 3:
                try {
                    return TypeUtils.toDoubleValue(this.stringValue);
                } catch (NumberFormatException e) {
                    throw new JSONException(info(e.getMessage()));
                }
            case 4:
                return this.boolValue ? 1.0d : 0.0d;
            case 5:
                if ((this.context.features & Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return 0.0d;
                }
                throw new JSONException(info("long value not support input null"));
            case 6:
                Map map = (Map) this.complex;
                if (map != null && !map.isEmpty()) {
                    return TypeUtils.toDoubleValue(map);
                }
                this.wasNull = true;
                return 0.0d;
            case 7:
                Collection collection = (Collection) this.complex;
                if (collection != null && !collection.isEmpty()) {
                    return TypeUtils.toDoubleValue(this.complex);
                }
                this.wasNull = true;
                return 0.0d;
            case 8:
                try {
                    return getBigDecimal().doubleValue();
                } catch (ArithmeticException unused) {
                    throw numberError();
                }
            case Opcodes.DCONST_0 /* 14 */:
                return Double.NaN;
            default:
                throw new JSONException("TODO : " + ((int) this.valueType));
        }
    }

    public abstract String getFieldName();

    public final float getFloatValue() {
        return (float) getDoubleValue();
    }

    public final int getInt32Value() {
        switch (this.valueType) {
            case 1:
            case 9:
            case 10:
                if (this.mag1 == 0 && this.mag2 == 0) {
                    if (this.negative) {
                        int i = this.mag3;
                        if (i == Integer.MIN_VALUE) {
                            return i;
                        }
                        if (i >= 0) {
                            return -i;
                        }
                    } else {
                        int i2 = this.mag3;
                        if (i2 >= 0) {
                            return i2;
                        }
                    }
                }
                Number number = getNumber();
                if (number instanceof Long) {
                    long jLongValue = number.longValue();
                    if (jLongValue >= -2147483648L && jLongValue <= 2147483647L) {
                        return (int) jLongValue;
                    }
                    throw new JSONException(info("integer overflow " + jLongValue));
                }
                if (!(number instanceof BigInteger)) {
                    return number.intValue();
                }
                BigInteger bigInteger = (BigInteger) number;
                if ((this.context.features & Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return bigInteger.intValue();
                }
                try {
                    return bigInteger.intValueExact();
                } catch (ArithmeticException unused) {
                    throw numberError();
                }
            case 2:
                return getNumber().intValue();
            case 3:
                return toInt32(this.stringValue);
            case 4:
                return this.boolValue ? 1 : 0;
            case 5:
                if ((this.context.features & Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return 0;
                }
                throw new JSONException(info("int value not support input null"));
            case 6:
                Number number2 = toNumber((Map) this.complex);
                if (number2 != null) {
                    return number2.intValue();
                }
                return 0;
            case 7:
                return toInt((List) this.complex);
            case 8:
                try {
                    return getBigDecimal().intValueExact();
                } catch (ArithmeticException unused2) {
                    throw numberError();
                }
            case 11:
            case Opcodes.FCONST_1 /* 12 */:
            case 13:
                long jLongValue2 = getNumber().longValue();
                if ((jLongValue2 >= -2147483648L && jLongValue2 <= 2147483647L) || (this.context.features & Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return (int) jLongValue2;
                }
                throw new JSONException(info("integer overflow " + jLongValue2));
            default:
                throw new JSONException("TODO : " + ((int) this.valueType));
        }
    }

    public final long getInt64Value() {
        switch (this.valueType) {
            case 1:
            case 9:
            case 10:
                if (this.mag1 == 0 && this.mag2 == 0) {
                    if (this.negative) {
                        int i = this.mag3;
                        if (i == Integer.MIN_VALUE) {
                            return i;
                        }
                        if (i >= 0) {
                            return -i;
                        }
                    } else {
                        int i2 = this.mag3;
                        if (i2 >= 0) {
                            return i2;
                        }
                    }
                }
                Number number = getNumber();
                if (!(number instanceof BigInteger)) {
                    return number.longValue();
                }
                BigInteger bigInteger = (BigInteger) number;
                if ((this.context.features & Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return bigInteger.longValue();
                }
                try {
                    return bigInteger.longValueExact();
                } catch (ArithmeticException unused) {
                    throw numberError();
                }
            case 2:
            case 11:
            case Opcodes.FCONST_1 /* 12 */:
            case 13:
                return getNumber().longValue();
            case 3:
                return toInt64(this.stringValue);
            case 4:
                return this.boolValue ? 1L : 0L;
            case 5:
                if ((this.context.features & Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    throw new JSONException(info("long value not support input null"));
                }
            case 6:
                return toLong((Map) this.complex);
            case 7:
                return toInt((List) this.complex);
            case 8:
                try {
                    return getBigDecimal().longValueExact();
                } catch (ArithmeticException unused2) {
                    throw numberError();
                }
            default:
                throw new JSONException("TODO : " + ((int) this.valueType));
        }
    }

    public final Locale getLocale() {
        return this.context.getLocale();
    }

    public abstract long getNameHashCodeLCase();

    /* JADX WARN: Code duplicated, block: B:116:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:123:0x0208  */
    /* JADX WARN: Code duplicated, block: B:127:0x021e  */
    /* JADX WARN: Code duplicated, block: B:130:0x023a  */
    /* JADX WARN: Code duplicated, block: B:137:0x025a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0270  */
    /* JADX WARN: Code duplicated, block: B:141:0x0286 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x0288  */
    /* JADX WARN: Code duplicated, block: B:144:0x028e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0291  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:150:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dc  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0095, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00bf, please report this as an issue */
    public final Number getNumber() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        BigDecimal bigDecimalValueOf;
        String plainString;
        int i4;
        int[] iArr2;
        int[] iArr3;
        BigDecimal bigDecimal;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr4;
        int[] iArr5;
        BigDecimal bigDecimal2;
        if (this.wasNull) {
            return null;
        }
        byte b = this.valueType;
        switch (b) {
            case 1:
            case 11:
                int i9 = this.mag0;
                if (i9 == 0 && this.mag1 == 0 && this.mag2 == 0 && (i = this.mag3) != Integer.MIN_VALUE) {
                    if (this.negative) {
                        if (i < 0) {
                            long j = -(((long) i) & 4294967295L);
                            return (this.context.features & Feature.UseBigIntegerForInts.mask) != 0 ? BigInteger.valueOf(j) : Long.valueOf(j);
                        }
                        i = -i;
                    } else if (i < 0) {
                        long j2 = ((long) i) & 4294967295L;
                        return (this.context.features & Feature.UseBigIntegerForInts.mask) != 0 ? BigInteger.valueOf(j2) : Long.valueOf(j2);
                    }
                    long j3 = this.context.features;
                    if ((Feature.UseBigIntegerForInts.mask & j3) != 0) {
                        return BigInteger.valueOf(i);
                    }
                    if ((j3 & Feature.UseLongForInts.mask) != 0) {
                        return Long.valueOf(i);
                    }
                    return b == 11 ? Long.valueOf(i) : Integer.valueOf(i);
                }
                if (i9 == 0) {
                    int i10 = this.mag1;
                    if (i10 == 0) {
                        int i11 = this.mag3;
                        long j4 = ((long) i11) & 4294967295L;
                        int i12 = this.mag2;
                        long j5 = ((long) i12) & 4294967295L;
                        if (j5 <= 2147483647L) {
                            long j6 = (j5 << 32) + j4;
                            if (this.negative) {
                                j6 = -j6;
                            }
                            return (this.context.features & Feature.UseBigIntegerForInts.mask) != 0 ? BigInteger.valueOf(j6) : Long.valueOf(j6);
                        }
                        iArr = new int[]{i12, i11};
                    } else {
                        iArr = new int[]{i10, this.mag2, this.mag3};
                    }
                } else {
                    iArr = new int[]{i9, this.mag1, this.mag2, this.mag3};
                }
                BigInteger bigIntegerApply = BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : 1), iArr);
                return (this.context.features & Feature.UseLongForInts.mask) != 0 ? Long.valueOf(bigIntegerApply.longValue()) : bigIntegerApply;
            case 2:
                if (this.mag0 == 0 && this.mag1 == 0) {
                    int i13 = this.mag2;
                    if (i13 != 0 || (i6 = this.mag3) < 0) {
                        i2 = 1;
                        long j7 = ((long) this.mag3) & 4294967295L;
                        long j8 = ((long) i13) & 4294967295L;
                        if (j8 <= 2147483647L) {
                            long j9 = (j8 << 32) + j7;
                            if (this.negative) {
                                j9 = -j9;
                            }
                            bigDecimalValueOf = BigDecimal.valueOf(j9, this.scale);
                        }
                        if (bigDecimalValueOf == null) {
                            i4 = this.mag0;
                            if (i4 == 0) {
                                i5 = this.mag1;
                                if (i5 == 0) {
                                    iArr3 = new int[2];
                                    iArr3[0] = this.mag2;
                                    iArr3[i2] = this.mag3;
                                } else {
                                    iArr2 = new int[3];
                                    iArr2[0] = i5;
                                    iArr2[i2] = this.mag2;
                                    iArr2[2] = this.mag3;
                                }
                                bigDecimal = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : i2), iArr3), this.scale - this.exponent);
                                if (this.exponent == 0 && (this.context.features & (Feature.UseBigDecimalForDoubles.mask | Feature.UseBigDecimalForFloats.mask)) == 0) {
                                    return Double.valueOf(bigDecimal.doubleValue());
                                }
                                bigDecimalValueOf = bigDecimal;
                            } else {
                                iArr2 = new int[4];
                                iArr2[0] = i4;
                                iArr2[i2] = this.mag1;
                                iArr2[2] = this.mag2;
                                iArr2[3] = this.mag3;
                            }
                            iArr3 = iArr2;
                            bigDecimal = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : i2), iArr3), this.scale - this.exponent);
                            if (this.exponent == 0) {
                            }
                            bigDecimalValueOf = bigDecimal;
                        }
                        if (this.exponent != 0) {
                            plainString = bigDecimalValueOf.toPlainString();
                            if ((this.context.features & (Feature.UseBigDecimalForDoubles.mask | Feature.UseBigDecimalForFloats.mask)) == 0) {
                                StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(plainString, "E");
                                sbM4805Ujhhgtgfeyxiexzf.append((int) this.exponent);
                                return Double.valueOf(Double.parseDouble(sbM4805Ujhhgtgfeyxiexzf.toString()));
                            }
                            if (i3 != 0) {
                                if (bigDecimalValueOf.signum() == 0) {
                                    return BigDecimal.ZERO;
                                }
                                StringBuilder sbM4805Ujhhgtgfeyxiexzf2 = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(plainString, "E");
                                sbM4805Ujhhgtgfeyxiexzf2.append((int) this.exponent);
                                return new BigDecimal(sbM4805Ujhhgtgfeyxiexzf2.toString());
                            }
                            if (bigDecimalValueOf.signum() == 0) {
                                return BigDecimal.ZERO;
                            }
                        } else if ((this.context.features & Feature.UseDoubleForDecimals.mask) != 0) {
                            return Double.valueOf(bigDecimalValueOf.doubleValue());
                        }
                        return bigDecimalValueOf;
                    }
                    if (this.negative) {
                        i6 = -i6;
                    }
                    i2 = 1;
                    bigDecimalValueOf = BigDecimal.valueOf(i6, this.scale);
                    i3 = i2;
                    if (bigDecimalValueOf == null) {
                        i4 = this.mag0;
                        if (i4 == 0) {
                            i5 = this.mag1;
                            if (i5 == 0) {
                                iArr3 = new int[2];
                                iArr3[0] = this.mag2;
                                iArr3[i2] = this.mag3;
                            } else {
                                iArr2 = new int[3];
                                iArr2[0] = i5;
                                iArr2[i2] = this.mag2;
                                iArr2[2] = this.mag3;
                            }
                            bigDecimal = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : i2), iArr3), this.scale - this.exponent);
                            if (this.exponent == 0) {
                            }
                            bigDecimalValueOf = bigDecimal;
                        } else {
                            iArr2 = new int[4];
                            iArr2[0] = i4;
                            iArr2[i2] = this.mag1;
                            iArr2[2] = this.mag2;
                            iArr2[3] = this.mag3;
                        }
                        iArr3 = iArr2;
                        bigDecimal = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : i2), iArr3), this.scale - this.exponent);
                        if (this.exponent == 0) {
                        }
                        bigDecimalValueOf = bigDecimal;
                    }
                    if (this.exponent != 0) {
                        plainString = bigDecimalValueOf.toPlainString();
                        if ((this.context.features & (Feature.UseBigDecimalForDoubles.mask | Feature.UseBigDecimalForFloats.mask)) == 0) {
                            StringBuilder sbM4805Ujhhgtgfeyxiexzf3 = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(plainString, "E");
                            sbM4805Ujhhgtgfeyxiexzf3.append((int) this.exponent);
                            return Double.valueOf(Double.parseDouble(sbM4805Ujhhgtgfeyxiexzf3.toString()));
                        }
                        if (i3 != 0) {
                            if (bigDecimalValueOf.signum() == 0) {
                                return BigDecimal.ZERO;
                            }
                            StringBuilder sbM4805Ujhhgtgfeyxiexzf4 = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(plainString, "E");
                            sbM4805Ujhhgtgfeyxiexzf4.append((int) this.exponent);
                            return new BigDecimal(sbM4805Ujhhgtgfeyxiexzf4.toString());
                        }
                        if (bigDecimalValueOf.signum() == 0) {
                            return BigDecimal.ZERO;
                        }
                    } else if ((this.context.features & Feature.UseDoubleForDecimals.mask) != 0) {
                        return Double.valueOf(bigDecimalValueOf.doubleValue());
                    }
                    return bigDecimalValueOf;
                }
                i2 = 1;
                i3 = 0;
                bigDecimalValueOf = null;
                if (bigDecimalValueOf == null) {
                    i4 = this.mag0;
                    if (i4 == 0) {
                        i5 = this.mag1;
                        if (i5 == 0) {
                            iArr3 = new int[2];
                            iArr3[0] = this.mag2;
                            iArr3[i2] = this.mag3;
                        } else {
                            iArr2 = new int[3];
                            iArr2[0] = i5;
                            iArr2[i2] = this.mag2;
                            iArr2[2] = this.mag3;
                        }
                        bigDecimal = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : i2), iArr3), this.scale - this.exponent);
                        if (this.exponent == 0) {
                        }
                        bigDecimalValueOf = bigDecimal;
                    } else {
                        iArr2 = new int[4];
                        iArr2[0] = i4;
                        iArr2[i2] = this.mag1;
                        iArr2[2] = this.mag2;
                        iArr2[3] = this.mag3;
                    }
                    iArr3 = iArr2;
                    bigDecimal = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : i2), iArr3), this.scale - this.exponent);
                    if (this.exponent == 0) {
                    }
                    bigDecimalValueOf = bigDecimal;
                }
                if (this.exponent != 0) {
                    plainString = bigDecimalValueOf.toPlainString();
                    if ((this.context.features & (Feature.UseBigDecimalForDoubles.mask | Feature.UseBigDecimalForFloats.mask)) == 0) {
                        StringBuilder sbM4805Ujhhgtgfeyxiexzf5 = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(plainString, "E");
                        sbM4805Ujhhgtgfeyxiexzf5.append((int) this.exponent);
                        return Double.valueOf(Double.parseDouble(sbM4805Ujhhgtgfeyxiexzf5.toString()));
                    }
                    if (i3 != 0) {
                        if (bigDecimalValueOf.signum() == 0) {
                            return BigDecimal.ZERO;
                        }
                        StringBuilder sbM4805Ujhhgtgfeyxiexzf6 = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(plainString, "E");
                        sbM4805Ujhhgtgfeyxiexzf6.append((int) this.exponent);
                        return new BigDecimal(sbM4805Ujhhgtgfeyxiexzf6.toString());
                    }
                    if (bigDecimalValueOf.signum() == 0) {
                        return BigDecimal.ZERO;
                    }
                } else if ((this.context.features & Feature.UseDoubleForDecimals.mask) != 0) {
                    return Double.valueOf(bigDecimalValueOf.doubleValue());
                }
                return bigDecimalValueOf;
            case 3:
                return Long.valueOf(toInt64(this.stringValue));
            case 4:
                return Integer.valueOf(this.boolValue ? 1 : 0);
            case 5:
                return null;
            case 6:
                return toNumber((Map) this.complex);
            case 7:
                return toNumber((List) this.complex);
            case 8:
                if (this.stringValue.indexOf(101) != -1 || this.stringValue.indexOf(69) != -1) {
                    return TypeUtils.toBigDecimal(this.stringValue);
                }
                short s = this.scale;
                if (s <= 0) {
                    return new BigInteger(this.stringValue);
                }
                if (s <= JSONFactory.defaultDecimalMaxScale) {
                    return TypeUtils.toBigDecimal(this.stringValue);
                }
                throw new JSONException("scale overflow : " + ((int) this.scale));
            case 9:
                if (this.mag0 != 0 || this.mag1 != 0 || this.mag2 != 0 || (i7 = this.mag3) < 0) {
                    throw new JSONException(info("shortValue overflow"));
                }
                if (this.negative) {
                    i7 = -i7;
                }
                return Byte.valueOf((byte) i7);
            case 10:
                if (this.mag0 != 0 || this.mag1 != 0 || this.mag2 != 0 || (i8 = this.mag3) < 0) {
                    throw new JSONException(info("shortValue overflow"));
                }
                if (this.negative) {
                    i8 = -i8;
                }
                return Short.valueOf((short) i8);
            case Opcodes.FCONST_1 /* 12 */:
            case 13:
                int i14 = this.mag0;
                if (i14 == 0) {
                    int i15 = this.mag1;
                    if (i15 == 0) {
                        int i16 = this.mag2;
                        if (i16 == 0) {
                            iArr5 = new int[]{this.mag3};
                        } else {
                            iArr4 = new int[]{i16, this.mag3};
                        }
                        bigDecimal2 = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : 1), iArr5), this.scale);
                        if (this.valueType == 12) {
                            if (this.exponent != 0) {
                                return Float.valueOf(bigDecimal2.floatValue());
                            }
                            return Float.valueOf(Float.parseFloat(bigDecimal2 + "E" + ((int) this.exponent)));
                        }
                        if (this.exponent != 0) {
                            return Double.valueOf(bigDecimal2.doubleValue());
                        }
                        return Double.valueOf(Double.parseDouble(bigDecimal2 + "E" + ((int) this.exponent)));
                    }
                    iArr4 = new int[]{i15, this.mag2, this.mag3};
                } else {
                    iArr4 = new int[]{i14, this.mag1, this.mag2, this.mag3};
                }
                iArr5 = iArr4;
                bigDecimal2 = new BigDecimal(BigIntegerCreator.BIG_INTEGER_CREATOR.apply(Integer.valueOf(this.negative ? -1 : 1), iArr5), this.scale);
                if (this.valueType == 12) {
                    if (this.exponent != 0) {
                        return Float.valueOf(bigDecimal2.floatValue());
                    }
                    return Float.valueOf(Float.parseFloat(bigDecimal2 + "E" + ((int) this.exponent)));
                }
                if (this.exponent != 0) {
                    return Double.valueOf(bigDecimal2.doubleValue());
                }
                return Double.valueOf(Double.parseDouble(bigDecimal2 + "E" + ((int) this.exponent)));
            default:
                throw new JSONException("TODO : " + ((int) this.valueType));
        }
    }

    public final ObjectReader getObjectReader(Type type) {
        Context context = this.context;
        return context.provider.getObjectReader(type, (context.features & 1) != 0);
    }

    public ObjectReader getObjectReaderAutoType(long j, Class cls, long j2) {
        Class<?> clsApply;
        ObjectReader objectReaderAutoType = this.context.getObjectReaderAutoType(j);
        if (objectReaderAutoType != null) {
            return objectReaderAutoType;
        }
        String string = getString();
        AutoTypeBeforeHandler autoTypeBeforeHandler = this.context.autoTypeBeforeHandler;
        if (autoTypeBeforeHandler != null && (clsApply = autoTypeBeforeHandler.apply(string, (Class<?>) cls, j2)) != null) {
            return this.context.provider.getObjectReader(clsApply, (j2 & Feature.FieldBased.mask) != 0);
        }
        Context context = this.context;
        return context.provider.getObjectReader(string, cls, j2 | context.features);
    }

    public final int getOffset() {
        return this.offset;
    }

    public abstract int getRawInt();

    public abstract long getRawLong();

    public abstract String getString();

    public abstract int getStringLength();

    public byte getType() {
        return (byte) -128;
    }

    public final ZoneId getZoneId() {
        return this.context.getZoneId();
    }

    public final void handleResolveTasks(Object obj) {
        List<ResolveTask> list = this.resolveTasks;
        if (list == null) {
            return;
        }
        Object objEval = null;
        for (ResolveTask resolveTask : list) {
            JSONPath jSONPath = resolveTask.reference;
            FieldReader fieldReader = resolveTask.fieldReader;
            if (!jSONPath.isPrevious()) {
                if (!jSONPath.isRef()) {
                    throw new JSONException("reference path invalid : " + jSONPath);
                }
                jSONPath.setReaderContext(this.context);
                if ((this.context.features & Feature.FieldBased.mask) != 0) {
                    JSONWriter.Context contextCreateWriteContext = JSONFactory.createWriteContext();
                    contextCreateWriteContext.features |= JSONWriter.Feature.FieldBased.mask;
                    jSONPath.setWriterContext(contextCreateWriteContext);
                }
                objEval = jSONPath.eval(obj);
            }
            Object obj2 = resolveTask.name;
            Object obj3 = resolveTask.object;
            if (obj2 != null) {
                if (obj3 instanceof Map) {
                    Map map = (Map) obj3;
                    if (!(obj2 instanceof ReferenceKey)) {
                        map.put(obj2, objEval);
                    } else if (map instanceof LinkedHashMap) {
                        int size = map.size();
                        if (size != 0) {
                            Object[] objArr = new Object[size];
                            Object[] objArr2 = new Object[size];
                            int i = 0;
                            for (Map.Entry entry : map.entrySet()) {
                                Object key = entry.getKey();
                                if (obj2 == key) {
                                    objArr[i] = objEval;
                                } else {
                                    objArr[i] = key;
                                }
                                objArr2[i] = entry.getValue();
                                i++;
                            }
                            map.clear();
                            for (int i2 = 0; i2 < size; i2++) {
                                map.put(objArr[i2], objArr2[i2]);
                            }
                        }
                    } else {
                        map.put(objEval, map.remove(obj2));
                    }
                } else if (obj2 instanceof Integer) {
                    if (obj3 instanceof List) {
                        int iIntValue = ((Integer) obj2).intValue();
                        List list2 = (List) obj3;
                        if (iIntValue == list2.size()) {
                            list2.add(objEval);
                        } else if (iIntValue >= list2.size() || list2.get(iIntValue) != null) {
                            list2.add(iIntValue, objEval);
                        } else {
                            list2.set(iIntValue, objEval);
                        }
                    } else if (obj3 instanceof Object[]) {
                        ((Object[]) obj3)[((Integer) obj2).intValue()] = objEval;
                    } else if (obj3 instanceof Collection) {
                        ((Collection) obj3).add(objEval);
                    }
                }
            }
            fieldReader.accept(obj3, objEval);
        }
    }

    public boolean hasAutoTypeBeforeHandler() {
        return this.context.autoTypeBeforeHandler != null;
    }

    public final boolean hasComma() {
        return this.comma;
    }

    public final String info() {
        return info(null);
    }

    public boolean isArray() {
        return this.ch == '[';
    }

    public boolean isBinary() {
        return false;
    }

    public boolean isBool() {
        char c = this.ch;
        return c == 't' || c == 'f';
    }

    public boolean isDate() {
        return false;
    }

    public final boolean isEnabled(Feature feature) {
        return (this.context.features & feature.mask) != 0;
    }

    public boolean isEnd() {
        return this.ch == 26;
    }

    public final boolean isIgnoreNoneSerializable() {
        return (this.context.features & 2) != 0;
    }

    public final boolean isInitStringFieldAsEmpty() {
        return (this.context.features & 16) != 0;
    }

    public boolean isInt() {
        char c = this.ch;
        if (c == '-' || c == '+') {
            return true;
        }
        return c >= '0' && c <= '9';
    }

    public final boolean isJSONB() {
        return this.jsonb;
    }

    public abstract boolean isNull();

    public boolean isNumber() {
        char c = this.ch;
        if (c == '+' || c == '-') {
            return true;
        }
        switch (c) {
            case '0':
            case '1':
            case Opcodes.AALOAD /* 50 */:
            case Opcodes.BALOAD /* 51 */:
            case '4':
            case Opcodes.SALOAD /* 53 */:
            case Opcodes.ISTORE /* 54 */:
            case Opcodes.LSTORE /* 55 */:
            case Opcodes.FSTORE /* 56 */:
            case Opcodes.DSTORE /* 57 */:
                return true;
            default:
                return false;
        }
    }

    public boolean isObject() {
        return this.ch == '{';
    }

    public abstract boolean isReference();

    public boolean isString() {
        char c = this.ch;
        return c == '\"' || c == '\'';
    }

    public final boolean isSupportAutoType(long j) {
        return ((j | this.context.features) & 32) != 0;
    }

    public final boolean isSupportAutoTypeOrHandler(long j) {
        Context context = this.context;
        return (((j | context.features) & 32) == 0 && context.autoTypeBeforeHandler == null) ? false : true;
    }

    public final boolean isSupportBeanArray() {
        return (this.context.features & 8) != 0;
    }

    public final boolean isSupportSmartMatch() {
        return (this.context.features & 64) != 0;
    }

    public final boolean isTypeRedirect() {
        return this.typeRedirect;
    }

    public SavePoint mark() {
        return new SavePoint(this.offset, this.ch);
    }

    public abstract void next();

    public abstract boolean nextIfArrayEnd();

    public abstract boolean nextIfArrayStart();

    public abstract boolean nextIfComma();

    public abstract boolean nextIfInfinity();

    public boolean nextIfMatch(byte b) {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract boolean nextIfMatch(char c);

    public abstract boolean nextIfMatchIdent(char c, char c2);

    public abstract boolean nextIfMatchIdent(char c, char c2, char c3);

    public abstract boolean nextIfMatchIdent(char c, char c2, char c3, char c4);

    public abstract boolean nextIfMatchIdent(char c, char c2, char c3, char c4, char c5);

    public abstract boolean nextIfMatchIdent(char c, char c2, char c3, char c4, char c5, char c6);

    public boolean nextIfMatchTypedAny() {
        throw new JSONException("UnsupportedOperation");
    }

    public abstract boolean nextIfName4Match10(long j);

    public abstract boolean nextIfName4Match11(long j);

    public abstract boolean nextIfName4Match12(long j, byte b);

    public abstract boolean nextIfName4Match13(long j, int i);

    public boolean nextIfName4Match14(long j, int i) {
        return false;
    }

    public boolean nextIfName4Match15(long j, int i) {
        return false;
    }

    public abstract boolean nextIfName4Match16(long j, int i, byte b);

    public abstract boolean nextIfName4Match17(long j, long j2);

    public abstract boolean nextIfName4Match18(long j, long j2);

    public boolean nextIfName4Match19(long j, long j2) {
        return false;
    }

    public abstract boolean nextIfName4Match2();

    public abstract boolean nextIfName4Match20(long j, long j2, byte b);

    public boolean nextIfName4Match21(long j, long j2, int i) {
        return false;
    }

    public abstract boolean nextIfName4Match22(long j, long j2, int i);

    public abstract boolean nextIfName4Match23(long j, long j2, int i);

    public abstract boolean nextIfName4Match24(long j, long j2, int i, byte b);

    public abstract boolean nextIfName4Match25(long j, long j2, long j3);

    public abstract boolean nextIfName4Match26(long j, long j2, long j3);

    public abstract boolean nextIfName4Match27(long j, long j2, long j3);

    public abstract boolean nextIfName4Match28(long j, long j2, long j3, byte b);

    public abstract boolean nextIfName4Match29(long j, long j2, long j3, int i);

    public abstract boolean nextIfName4Match3();

    public abstract boolean nextIfName4Match30(long j, long j2, long j3, int i);

    public abstract boolean nextIfName4Match31(long j, long j2, long j3, int i);

    public abstract boolean nextIfName4Match32(long j, long j2, long j3, int i, byte b);

    public abstract boolean nextIfName4Match33(long j, long j2, long j3, long j4);

    public abstract boolean nextIfName4Match34(long j, long j2, long j3, long j4);

    public abstract boolean nextIfName4Match35(long j, long j2, long j3, long j4);

    public abstract boolean nextIfName4Match36(long j, long j2, long j3, long j4, byte b);

    public abstract boolean nextIfName4Match37(long j, long j2, long j3, long j4, int i);

    public abstract boolean nextIfName4Match38(long j, long j2, long j3, long j4, int i);

    public abstract boolean nextIfName4Match39(long j, long j2, long j3, long j4, int i);

    public abstract boolean nextIfName4Match4(byte b);

    public abstract boolean nextIfName4Match40(long j, long j2, long j3, long j4, int i, byte b);

    public abstract boolean nextIfName4Match41(long j, long j2, long j3, long j4, long j5);

    public abstract boolean nextIfName4Match42(long j, long j2, long j3, long j4, long j5);

    public abstract boolean nextIfName4Match43(long j, long j2, long j3, long j4, long j5);

    public abstract boolean nextIfName4Match5(int i);

    public abstract boolean nextIfName4Match6(int i);

    public abstract boolean nextIfName4Match7(int i);

    public abstract boolean nextIfName4Match8(int i, byte b);

    public abstract boolean nextIfName4Match9(long j);

    public boolean nextIfName8Match0() {
        return false;
    }

    public boolean nextIfName8Match1() {
        return false;
    }

    public boolean nextIfName8Match2() {
        return false;
    }

    public abstract boolean nextIfNull();

    public abstract boolean nextIfNullOrEmptyString();

    public abstract boolean nextIfObjectEnd();

    public abstract boolean nextIfObjectStart();

    public abstract boolean nextIfSet();

    public boolean nextIfValue4Match10(long j) {
        return false;
    }

    public boolean nextIfValue4Match11(long j) {
        return false;
    }

    public boolean nextIfValue4Match2() {
        return false;
    }

    public boolean nextIfValue4Match3() {
        return false;
    }

    public boolean nextIfValue4Match4(byte b) {
        return false;
    }

    public boolean nextIfValue4Match5(byte b, byte b2) {
        return false;
    }

    public boolean nextIfValue4Match6(int i) {
        return false;
    }

    public boolean nextIfValue4Match7(int i) {
        return false;
    }

    public boolean nextIfValue4Match8(int i, byte b) {
        return false;
    }

    public boolean nextIfValue4Match9(int i, byte b, byte b2) {
        return false;
    }

    public void nextWithoutComment() {
        next();
    }

    public final JSONException notSupportName() {
        return new JSONException(info("not support unquoted name"));
    }

    public <T> T read(Type type) {
        Context context = this.context;
        return (T) context.provider.getObjectReader(type, (context.features & Feature.FieldBased.mask) != 0).readObject(this, null, null, 0L);
    }

    public Object readAny() {
        return read(Object.class);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 2081. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public java.util.List readArray(java.lang.reflect.Type r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONReader.readArray(java.lang.reflect.Type):java.util.List");
    }

    public byte[] readBase64() {
        int iIndexOf;
        int i;
        int iIndexOf2;
        String string = readString();
        if (string != null && string.startsWith("data:image/") && (iIndexOf = string.indexOf(59, 12)) != -1 && (iIndexOf2 = string.indexOf(44, (i = iIndexOf + 1))) != -1 && string.regionMatches(i, "base64", 0, 6)) {
            string = string.substring(iIndexOf2 + 1);
        }
        return string.isEmpty() ? new byte[0] : Base64.getDecoder().decode(string);
    }

    public abstract BigDecimal readBigDecimal();

    public BigInteger readBigInteger() {
        readNumber0();
        return getBigInteger();
    }

    public byte[] readBinary() {
        if (this.ch == 'x') {
            return readHex();
        }
        if (isString()) {
            String string = readString();
            if (string.isEmpty()) {
                return null;
            }
            if ((this.context.features & Feature.Base64StringAsByteArray.mask) != 0) {
                return Base64.getDecoder().decode(string);
            }
            throw new JSONException(info("not support input ".concat(string)));
        }
        if (!nextIfArrayStart()) {
            throw new JSONException(info("not support read binary"));
        }
        byte[] bArrCopyOf = new byte[64];
        int i = 0;
        while (this.ch != ']') {
            if (i == bArrCopyOf.length) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, length + (length >> 1));
            }
            bArrCopyOf[i] = (byte) readInt32Value();
            i++;
        }
        next();
        nextIfComma();
        return Arrays.copyOf(bArrCopyOf, i);
    }

    public Boolean readBool() {
        if (nextIfNull()) {
            return null;
        }
        this.wasNull = false;
        boolean boolValue = readBoolValue();
        if (boolValue || !this.wasNull) {
            return Boolean.valueOf(boolValue);
        }
        return null;
    }

    public abstract boolean readBoolValue();

    public Calendar readCalendar() {
        if (isString()) {
            long millisFromString = readMillisFromString();
            if (millisFromString == 0 && this.wasNull) {
                return null;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(millisFromString);
            return calendar;
        }
        if (readIfNull()) {
            return null;
        }
        long int64Value = readInt64Value();
        if (this.context.formatUnixTime) {
            int64Value *= 1000;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(int64Value);
        return calendar2;
    }

    public char readCharValue() {
        String string = readString();
        if (string != null && !string.isEmpty()) {
            return string.charAt(0);
        }
        this.wasNull = true;
        return (char) 0;
    }

    public Character readCharacter() {
        String string = readString();
        if (string != null && !string.isEmpty()) {
            return Character.valueOf(string.charAt(0));
        }
        this.wasNull = true;
        return (char) 0;
    }

    public Date readDate() {
        JSONReader jSONReader;
        long millisFromString;
        if (isInt()) {
            return new Date(readInt64Value());
        }
        if (readIfNull() || nextIfNullOrEmptyString()) {
            return null;
        }
        if (current() == 'n') {
            return readNullOrNewDate();
        }
        if (isTypeRedirect()) {
            jSONReader = this;
            if (jSONReader.nextIfMatchIdent('\"', 'v', 'a', 'l', '\"')) {
                nextIfMatch(':');
                millisFromString = readInt64Value();
                nextIfObjectEnd();
                setTypeRedirect(false);
            }
            if (millisFromString == 0 || !jSONReader.wasNull) {
                return new Date(millisFromString);
            }
            return null;
        }
        jSONReader = this;
        if (isObject()) {
            JSONObject jSONObject = readJSONObject();
            Object obj = jSONObject.get("$date");
            return obj instanceof String ? DateUtils.parseDate((String) obj, jSONReader.context.getZoneId()) : TypeUtils.toDate(jSONObject);
        }
        millisFromString = readMillisFromString();
        if (millisFromString == 0) {
        }
        return new Date(millisFromString);
    }

    public final Double readDouble() {
        if (nextIfNull()) {
            return null;
        }
        this.wasNull = false;
        double doubleValue = readDoubleValue();
        if (this.wasNull) {
            return null;
        }
        return Double.valueOf(doubleValue);
    }

    public abstract double readDoubleValue();

    public abstract String readFieldName();

    public abstract long readFieldNameHashCode();

    public long readFieldNameHashCode(int i, int i2, int i3) {
        return readFieldNameHashCode();
    }

    public long readFieldNameHashCodeE(int i, int i2, int i3) {
        return readFieldNameHashCode();
    }

    public final long readFieldNameHashCodeError(int i, int i2) {
        String strM4795Ujhhgtgfeyxiexzf;
        String fieldName;
        if ((this.context.features & 131072) != 0 && isFirstIdentifier(i2)) {
            return readFieldNameHashCodeUnquote();
        }
        if (i2 == 125 || nextIfNull()) {
            return -1L;
        }
        if (i2 != 91 || i <= 0 || (fieldName = getFieldName()) == null) {
            strM4795Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i2, "illegal fieldName input");
        } else {
            strM4795Ujhhgtgfeyxiexzf = "illegal fieldName input " + i2 + ", previous fieldName " + fieldName;
        }
        throw new JSONException(info(strM4795Ujhhgtgfeyxiexzf));
    }

    public abstract long readFieldNameHashCodeUnquote();

    public final String readFieldNameUnquote() {
        if (this.ch == '/') {
            skipComment();
        }
        readFieldNameHashCodeUnquote();
        String fieldName = getFieldName();
        if (fieldName == null || fieldName.isEmpty()) {
            throw new JSONException(info("illegal input"));
        }
        return fieldName;
    }

    public Float readFloat() {
        if (nextIfNull()) {
            return null;
        }
        this.wasNull = false;
        float floatValue = readFloatValue();
        if (this.wasNull) {
            return null;
        }
        return Float.valueOf(floatValue);
    }

    public abstract float readFloatValue();

    public abstract byte[] readHex();

    public abstract boolean readIfNull();

    public Instant readInstant() {
        if (nextIfNull()) {
            return null;
        }
        if (isNumber()) {
            long int64Value = readInt64Value();
            if (this.context.formatUnixTime) {
                int64Value *= 1000;
            }
            return Instant.ofEpochMilli(int64Value);
        }
        if (isObject()) {
            return (Instant) getObjectReader(Instant.class).createInstance(readObject(), 0L);
        }
        ZonedDateTime zonedDateTime = readZonedDateTime();
        if (zonedDateTime == null) {
            return null;
        }
        return Instant.ofEpochSecond(zonedDateTime.toEpochSecond(), zonedDateTime.toLocalTime().getNano());
    }

    public final Short readInt16() {
        Integer int32 = readInt32();
        if (int32 == null) {
            return null;
        }
        return Short.valueOf(int32.shortValue());
    }

    public short readInt16Value() {
        return (short) readInt32Value();
    }

    public abstract Integer readInt32();

    public abstract int readInt32Value();

    public int[] readInt32ValueArray() {
        if (nextIfNull()) {
            return null;
        }
        if (!nextIfArrayStart()) {
            if (!isString()) {
                throw new JSONException(info("TODO"));
            }
            String string = readString();
            if (string.isEmpty()) {
                return null;
            }
            throw new JSONException(info("not support input ".concat(string)));
        }
        int[] iArrCopyOf = new int[8];
        int i = 0;
        while (!nextIfArrayEnd()) {
            if (isEnd()) {
                throw new JSONException(info("input end"));
            }
            if (i == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length << 1);
            }
            iArrCopyOf[i] = readInt32Value();
            i++;
        }
        nextIfComma();
        return i == iArrCopyOf.length ? iArrCopyOf : Arrays.copyOf(iArrCopyOf, i);
    }

    public final int readInt32ValueOverflow() {
        readNumber0();
        return getInt32Value();
    }

    public abstract Long readInt64();

    public abstract long readInt64Value();

    public long[] readInt64ValueArray() {
        if (nextIfNull()) {
            return null;
        }
        if (!nextIfArrayStart()) {
            if (!isString()) {
                throw new JSONException(info("TODO"));
            }
            String string = readString();
            if (string.isEmpty()) {
                return null;
            }
            throw error("not support input ".concat(string));
        }
        long[] jArrCopyOf = new long[8];
        int i = 0;
        while (!nextIfArrayEnd()) {
            if (isEnd()) {
                throw new JSONException(info("input end"));
            }
            if (i == jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, jArrCopyOf.length << 1);
            }
            jArrCopyOf[i] = readInt64Value();
            i++;
        }
        return i == jArrCopyOf.length ? jArrCopyOf : Arrays.copyOf(jArrCopyOf, i);
    }

    public final long readInt64ValueOverflow() {
        readNumber0();
        return getInt64Value();
    }

    public final Byte readInt8() {
        Integer int32 = readInt32();
        if (int32 == null) {
            return null;
        }
        return Byte.valueOf(int32.byteValue());
    }

    public byte readInt8Value() {
        return (byte) readInt32Value();
    }

    public final JSONArray readJSONArray() {
        JSONArray jSONArray = new JSONArray();
        read((List) jSONArray);
        return jSONArray;
    }

    public final JSONObject readJSONObject() {
        JSONObject jSONObject = new JSONObject();
        read(jSONObject, 0L);
        return jSONObject;
    }

    public List readList(Type[] typeArr) {
        char c;
        if (nextIfNull()) {
            return null;
        }
        if (!nextIfArrayStart()) {
            throw new JSONException("syntax error : " + this.ch);
        }
        int length = typeArr.length;
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (!nextIfArrayEnd() && i < length) {
            int i2 = this.offset;
            int i3 = i + 1;
            Object obj = read(typeArr[i]);
            if (i2 == this.offset || (c = this.ch) == '}' || c == 26) {
                throw new JSONException("illegal input : " + this.ch + ", offset " + getOffset());
            }
            arrayList.add(obj);
            i = i3;
        }
        if (i != length) {
            throw new JSONException(info("element length mismatch"));
        }
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    public LocalDate readLocalDate() {
        LocalDateTime localDateTime19;
        if (nextIfNull()) {
            return null;
        }
        if (isInt()) {
            long int64Value = readInt64Value();
            if (this.context.formatUnixTime) {
                int64Value *= 1000;
            }
            return Instant.ofEpochMilli(int64Value).atZone(this.context.getZoneId()).toLocalDate();
        }
        Context context = this.context;
        if (context.dateFormat == null || context.formatyyyyMMddhhmmss19 || context.formatyyyyMMddhhmmssT19 || context.formatyyyyMMdd8 || context.formatISO8601) {
            int stringLength = getStringLength();
            if (stringLength == 19) {
                localDateTime19 = readLocalDateTime19();
            } else if (stringLength != 20) {
                switch (stringLength) {
                    case 8:
                        LocalDate localDate8 = readLocalDate8();
                        if (localDate8 != null) {
                            localDateTime19 = LocalDateTime.of(localDate8, LocalTime.MIN);
                        } else {
                            localDateTime19 = null;
                        }
                        break;
                    case 9:
                        LocalDate localDate9 = readLocalDate9();
                        if (localDate9 != null) {
                            localDateTime19 = LocalDateTime.of(localDate9, LocalTime.MIN);
                        } else {
                            localDateTime19 = null;
                        }
                        break;
                    case 10:
                        LocalDate localDate10 = readLocalDate10();
                        if (localDate10 != null) {
                            localDateTime19 = LocalDateTime.of(localDate10, LocalTime.MIN);
                        } else {
                            localDateTime19 = null;
                        }
                        break;
                    case 11:
                        LocalDate localDate11 = readLocalDate11();
                        if (localDate11 != null) {
                            localDateTime19 = LocalDateTime.of(localDate11, LocalTime.MIN);
                        } else {
                            localDateTime19 = null;
                        }
                        break;
                    default:
                        if (stringLength <= 20) {
                            localDateTime19 = null;
                        } else {
                            localDateTime19 = readLocalDateTimeX(stringLength);
                        }
                        break;
                }
            } else {
                localDateTime19 = readLocalDateTime20();
            }
            if (localDateTime19 != null) {
                return localDateTime19.toLocalDate();
            }
        }
        String string = readString();
        if (string.isEmpty() || "null".equals(string)) {
            return null;
        }
        DateTimeFormatter dateFormatter = this.context.getDateFormatter();
        if (dateFormatter != null) {
            return this.context.formatHasHour ? LocalDateTime.parse(string, dateFormatter).toLocalDate() : LocalDate.parse(string, dateFormatter);
        }
        if (IOUtils.isNumber(string)) {
            return Instant.ofEpochMilli(Long.parseLong(string)).atZone(this.context.getZoneId()).toLocalDate();
        }
        throw new JSONException("not support input : ".concat(string));
    }

    public abstract LocalDate readLocalDate10();

    public abstract LocalDate readLocalDate11();

    public abstract LocalDate readLocalDate8();

    public abstract LocalDate readLocalDate9();

    /* JADX WARN: Type inference failed for: r0v17, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.time.LocalDateTime] */
    public LocalDateTime readLocalDateTime() {
        JSONReader jSONReader;
        if (isInt()) {
            return Instant.ofEpochMilli(readInt64Value()).atZone(this.context.getZoneId()).toLocalDateTime();
        }
        if (isTypeRedirect()) {
            jSONReader = this;
            if (jSONReader.nextIfMatchIdent('\"', 'v', 'a', 'l', '\"')) {
                nextIfMatch(':');
                LocalDateTime localDateTime = readLocalDateTime();
                nextIfObjectEnd();
                setTypeRedirect(false);
                return localDateTime;
            }
        } else {
            jSONReader = this;
        }
        Context context = jSONReader.context;
        if (context.dateFormat == null || context.formatyyyyMMddhhmmss19 || context.formatyyyyMMddhhmmssT19 || context.formatyyyyMMdd8 || context.formatISO8601) {
            int stringLength = getStringLength();
            switch (stringLength) {
                case 8:
                    LocalDate localDate8 = readLocalDate8();
                    if (localDate8 == null) {
                        return null;
                    }
                    return LocalDateTime.of(localDate8, LocalTime.MIN);
                case 9:
                    LocalDate localDate9 = readLocalDate9();
                    if (localDate9 == null) {
                        return null;
                    }
                    return LocalDateTime.of(localDate9, LocalTime.MIN);
                case 10:
                    LocalDate localDate10 = readLocalDate10();
                    if (localDate10 == null) {
                        return null;
                    }
                    return LocalDateTime.of(localDate10, LocalTime.MIN);
                case 11:
                    LocalDate localDate11 = readLocalDate11();
                    if (localDate11 == null) {
                        return null;
                    }
                    return LocalDateTime.of(localDate11, LocalTime.MIN);
                case 16:
                    return readLocalDateTime16();
                case Opcodes.SIPUSH /* 17 */:
                    LocalDateTime localDateTime17 = readLocalDateTime17();
                    if (localDateTime17 != null) {
                        return localDateTime17;
                    }
                    break;
                case Opcodes.LDC /* 18 */:
                    LocalDateTime localDateTime18 = readLocalDateTime18();
                    if (localDateTime18 != null) {
                        return localDateTime18;
                    }
                    break;
                case 19:
                    LocalDateTime localDateTime19 = readLocalDateTime19();
                    if (localDateTime19 != null) {
                        return localDateTime19;
                    }
                    break;
                case 20:
                    LocalDateTime localDateTime20 = readLocalDateTime20();
                    if (localDateTime20 != null) {
                        return localDateTime20;
                    }
                    ZonedDateTime zonedDateTimeX = readZonedDateTimeX(stringLength);
                    if (zonedDateTimeX != null) {
                        return zonedDateTimeX.toLocalDateTime();
                    }
                    break;
                case Opcodes.ILOAD /* 21 */:
                case Opcodes.LLOAD /* 22 */:
                case Opcodes.FLOAD /* 23 */:
                case Opcodes.DLOAD /* 24 */:
                case Opcodes.ALOAD /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                    LocalDateTime localDateTimeX = readLocalDateTimeX(stringLength);
                    if (localDateTimeX != null) {
                        return localDateTimeX;
                    }
                    ZonedDateTime zonedDateTimeX2 = readZonedDateTimeX(stringLength);
                    if (zonedDateTimeX2 != null) {
                        ZoneId zoneId = jSONReader.context.getZoneId();
                        return !zonedDateTimeX2.getZone().equals(zoneId) ? zonedDateTimeX2.toInstant().atZone(zoneId).toLocalDateTime() : zonedDateTimeX2.toLocalDateTime();
                    }
                    break;
            }
        }
        String string = readString();
        if (string.isEmpty() || "null".equals(string)) {
            jSONReader.wasNull = true;
            return null;
        }
        DateTimeFormatter dateFormatter = jSONReader.context.getDateFormatter();
        if (dateFormatter != null) {
            return !jSONReader.context.formatHasHour ? LocalDateTime.of(LocalDate.parse(string, dateFormatter), LocalTime.MIN) : LocalDateTime.parse(string, dateFormatter);
        }
        if (IOUtils.isNumber(string)) {
            long j = Long.parseLong(string);
            if (jSONReader.context.formatUnixTime) {
                j *= 1000;
            }
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(j), jSONReader.context.getZoneId());
        }
        if (!string.startsWith("/Date(") || !string.endsWith(")/")) {
            if (!"0000-00-00 00:00:00".equals(string)) {
                throw new JSONException(info("read LocalDateTime error ".concat(string)));
            }
            jSONReader.wasNull = true;
            return null;
        }
        String strM2699Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(2, 6, string);
        int iIndexOf = strM2699Ujhhgtgfeyxiexzf.indexOf(43);
        if (iIndexOf == -1) {
            iIndexOf = strM2699Ujhhgtgfeyxiexzf.indexOf(45);
        }
        if (iIndexOf != -1) {
            strM2699Ujhhgtgfeyxiexzf = strM2699Ujhhgtgfeyxiexzf.substring(0, iIndexOf);
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(strM2699Ujhhgtgfeyxiexzf)), jSONReader.context.getZoneId());
    }

    public abstract LocalDateTime readLocalDateTime12();

    public abstract LocalDateTime readLocalDateTime14();

    public abstract LocalDateTime readLocalDateTime16();

    public abstract LocalDateTime readLocalDateTime17();

    public abstract LocalDateTime readLocalDateTime18();

    public abstract LocalDateTime readLocalDateTime19();

    public abstract LocalDateTime readLocalDateTime20();

    public abstract LocalDateTime readLocalDateTimeX(int i);

    public LocalTime readLocalTime() {
        if (nextIfNull()) {
            return null;
        }
        if (isInt()) {
            return Instant.ofEpochMilli(readInt64Value()).atZone(this.context.getZoneId()).toLocalTime();
        }
        switch (getStringLength()) {
            case 5:
                return readLocalTime5();
            case 6:
                return readLocalTime6();
            case 7:
                return readLocalTime7();
            case 8:
                return readLocalTime8();
            case 9:
                return readLocalTime9();
            case 10:
                return readLocalTime10();
            case 11:
                return readLocalTime11();
            case Opcodes.FCONST_1 /* 12 */:
                return readLocalTime12();
            case 13:
            case Opcodes.DCONST_0 /* 14 */:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            default:
                String string = readString();
                if (string.isEmpty() || "null".equals(string)) {
                    return null;
                }
                if (IOUtils.isNumber(string)) {
                    return Instant.ofEpochMilli(Long.parseLong(string)).atZone(this.context.getZoneId()).toLocalTime();
                }
                throw new JSONException("not support len : ".concat(string));
            case 15:
                return readLocalTime15();
            case Opcodes.LDC /* 18 */:
                return readLocalTime18();
            case 19:
                return readLocalDateTime19().toLocalTime();
            case 20:
                return readLocalDateTime20().toLocalTime();
        }
    }

    public abstract LocalTime readLocalTime10();

    public abstract LocalTime readLocalTime11();

    public abstract LocalTime readLocalTime12();

    public abstract LocalTime readLocalTime15();

    public abstract LocalTime readLocalTime18();

    public abstract LocalTime readLocalTime5();

    public abstract LocalTime readLocalTime6();

    public abstract LocalTime readLocalTime7();

    public abstract LocalTime readLocalTime8();

    public abstract LocalTime readLocalTime9();

    public abstract long readMillis19();

    public final long readMillisFromString() {
        LocalDateTime localDateTimeOf;
        this.wasNull = false;
        Context context = this.context;
        String str = context.dateFormat;
        if (str == null || context.formatyyyyMMddhhmmss19 || context.formatyyyyMMddhhmmssT19 || context.formatyyyyMMdd8 || context.formatISO8601) {
            int stringLength = getStringLength();
            ZonedDateTime zonedDateTime = null;
            switch (stringLength) {
                case 8:
                    LocalDate localDate8 = readLocalDate8();
                    if (localDate8 == null) {
                        throw new JSONException("TODO : " + readString());
                    }
                    localDateTimeOf = LocalDateTime.of(localDate8, LocalTime.MIN);
                    break;
                    break;
                case 9:
                    LocalDate localDate9 = readLocalDate9();
                    localDateTimeOf = localDate9 == null ? null : LocalDateTime.of(localDate9, LocalTime.MIN);
                    break;
                case 10:
                    LocalDate localDate10 = readLocalDate10();
                    if (localDate10 == null) {
                        String string = readString();
                        if ("0000-00-00".equals(string)) {
                            this.wasNull = true;
                            return 0L;
                        }
                        if (IOUtils.isNumber(string)) {
                            return Long.parseLong(string);
                        }
                        throw new JSONException(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("TODO : ", string));
                    }
                    localDateTimeOf = LocalDateTime.of(localDate10, LocalTime.MIN);
                    break;
                case 11:
                    LocalDate localDate11 = readLocalDate11();
                    localDateTimeOf = localDate11 == null ? null : LocalDateTime.of(localDate11, LocalTime.MIN);
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    localDateTimeOf = readLocalDateTime12();
                    break;
                case 13:
                case 15:
                default:
                    localDateTimeOf = null;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    localDateTimeOf = readLocalDateTime14();
                    break;
                case 16:
                    localDateTimeOf = readLocalDateTime16();
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    localDateTimeOf = readLocalDateTime17();
                    break;
                case Opcodes.LDC /* 18 */:
                    localDateTimeOf = readLocalDateTime18();
                    break;
                case 19:
                    long millis19 = readMillis19();
                    if (millis19 != 0 || !this.wasNull) {
                        return millis19;
                    }
                    localDateTimeOf = readLocalDateTime19();
                    break;
                    break;
                case 20:
                    localDateTimeOf = readLocalDateTime20();
                    break;
            }
            if (localDateTimeOf != null) {
                zonedDateTime = ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
            } else if (stringLength >= 20) {
                ZonedDateTime zonedDateTimeX = readZonedDateTimeX(stringLength);
                zonedDateTime = (zonedDateTimeX != null || stringLength < 32 || stringLength > 35) ? zonedDateTimeX : DateUtils.parseZonedDateTime(readString(), null);
            }
            if (zonedDateTime != null) {
                long epochSecond = zonedDateTime.toEpochSecond();
                int nano = zonedDateTime.toLocalTime().getNano();
                return (epochSecond >= 0 || nano <= 0) ? (epochSecond * 1000) + ((long) (nano / 1000000)) : ((epochSecond + 1) * 1000) + ((long) ((nano / 1000000) - 1000));
            }
        }
        String string2 = readString();
        if (string2.isEmpty() || "null".equals(string2)) {
            this.wasNull = true;
            return 0L;
        }
        Context context2 = this.context;
        if (context2.formatMillis || context2.formatUnixTime) {
            long j = Long.parseLong(string2);
            return this.context.formatUnixTime ? j * 1000 : j;
        }
        if (str != null && !str.isEmpty()) {
            if ("yyyy-MM-dd HH:mm:ss".equals(str)) {
                return ((string2.length() < 4 || string2.charAt(4) != '-') && IOUtils.isNumber(string2)) ? Long.parseLong(string2) : DateUtils.parseMillis19(string2, this.context.getZoneId());
            }
            if ("yyyy-MM-dd HH:mm:ss.SSS".equals(str) && string2.length() == 19 && string2.charAt(4) == '-' && string2.charAt(7) == '-' && string2.charAt(10) == ' ' && string2.charAt(13) == ':' && string2.charAt(16) == ':') {
                return DateUtils.parseMillis19(string2, this.context.getZoneId());
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            try {
                return simpleDateFormat.parse(string2).getTime();
            } catch (ParseException unused) {
                StringBuilder sbM2419Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2419Ujhhgtgfeyxiexzf("parse date error, ", string2, ", expect format ");
                sbM2419Ujhhgtgfeyxiexzf.append(simpleDateFormat.toPattern());
                throw new JSONException(sbM2419Ujhhgtgfeyxiexzf.toString());
            }
        }
        if ("0000-00-00T00:00:00".equals(string2) || "0001-01-01T00:00:00+08:00".equals(string2)) {
            return 0L;
        }
        if (string2.startsWith("/Date(") && string2.endsWith(")/")) {
            String strM2699Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(2, 6, string2);
            int iIndexOf = strM2699Ujhhgtgfeyxiexzf.indexOf(43);
            if (iIndexOf == -1) {
                iIndexOf = strM2699Ujhhgtgfeyxiexzf.indexOf(45);
            }
            if (iIndexOf != -1) {
                strM2699Ujhhgtgfeyxiexzf = strM2699Ujhhgtgfeyxiexzf.substring(0, iIndexOf);
            }
            return Long.parseLong(strM2699Ujhhgtgfeyxiexzf);
        }
        if (IOUtils.isNumber(string2)) {
            return Long.parseLong(string2);
        }
        throw new JSONException(info("format " + str + " not support, input " + string2));
    }

    public double readNaN() {
        throw new JSONException("not support");
    }

    public abstract void readNull();

    public abstract Date readNullOrNewDate();

    public Number readNumber() {
        readNumber0();
        return getNumber();
    }

    public abstract void readNumber0();

    public final void readObject(Object obj, Feature... featureArr) {
        long j = 0;
        for (Feature feature : featureArr) {
            j |= feature.mask;
        }
        readObject(obj, j);
    }

    public abstract OffsetDateTime readOffsetDateTime();

    public abstract OffsetTime readOffsetTime();

    public abstract String readPattern();

    public abstract String readReference();

    public final boolean readReference(List list, int i) {
        if (isReference()) {
            return readReference0(list, i);
        }
        return false;
    }

    public abstract String readString();

    public void readString(ValueConsumer valueConsumer, boolean z) {
        String string = readString();
        if (z) {
            valueConsumer.accept(JSON.toJSONString(string));
        } else {
            valueConsumer.accept(string);
        }
    }

    public String[] readStringArray() {
        String[] strArr = null;
        if (this.ch == 'n' && nextIfNull()) {
            return null;
        }
        if (!nextIfArrayStart()) {
            char c = this.ch;
            if (c != '\"' && c != '\'') {
                throw new JSONException(info("not support input"));
            }
            String string = readString();
            if (string.isEmpty()) {
                return null;
            }
            throw new JSONException(info("not support input ".concat(string)));
        }
        int i = 0;
        while (!nextIfArrayEnd()) {
            if (isEnd()) {
                throw new JSONException(info("input end"));
            }
            if (strArr == null) {
                strArr = new String[16];
            } else if (i == strArr.length) {
                strArr = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
            }
            strArr[i] = readString();
            i++;
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        return strArr.length == i ? strArr : (String[]) Arrays.copyOf(strArr, i);
    }

    public final String readStringNotMatch() {
        char c = this.ch;
        if (c != '+' && c != '-') {
            if (c == '[') {
                List array = readArray();
                if (array.size() == 1) {
                    Object obj = array.get(0);
                    if (obj == null) {
                        return null;
                    }
                    if ((this.context.features & Feature.DisableStringArrayUnwrapping.mask) == 0 && (obj instanceof String)) {
                        return obj.toString();
                    }
                }
                return toString(array);
            }
            if (c != 'f') {
                if (c == 'n') {
                    readNull();
                    return null;
                }
                if (c != 't') {
                    if (c == '{') {
                        return toString(readObject());
                    }
                    switch (c) {
                        case '0':
                        case '1':
                        case Opcodes.AALOAD /* 50 */:
                        case Opcodes.BALOAD /* 51 */:
                        case '4':
                        case Opcodes.SALOAD /* 53 */:
                        case Opcodes.ISTORE /* 54 */:
                        case Opcodes.LSTORE /* 55 */:
                        case Opcodes.FSTORE /* 56 */:
                        case Opcodes.DSTORE /* 57 */:
                            break;
                        default:
                            throw new JSONException(info("illegal input : " + this.ch));
                    }
                }
            }
            boolean boolValue = readBoolValue();
            this.boolValue = boolValue;
            return boolValue ? "true" : "false";
        }
        readNumber0();
        return getNumber().toString();
    }

    public long readTypeHashCode() {
        return readValueHashCode();
    }

    public abstract UUID readUUID();

    public abstract long readValueHashCode();

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    public ZonedDateTime readZonedDateTime() {
        LocalDateTime localDateTimeOf;
        if (isInt()) {
            long int64Value = readInt64Value();
            if (this.context.formatUnixTime) {
                int64Value *= 1000;
            }
            return Instant.ofEpochMilli(int64Value).atZone(this.context.getZoneId());
        }
        if (!isString()) {
            if (nextIfNull()) {
                return null;
            }
            throw new JSONException("TODO : " + this.ch);
        }
        Context context = this.context;
        if (context.dateFormat == null || context.formatyyyyMMddhhmmss19 || context.formatyyyyMMddhhmmssT19 || context.formatyyyyMMdd8 || context.formatISO8601) {
            int stringLength = getStringLength();
            switch (stringLength) {
                case 8:
                    LocalDate localDate8 = readLocalDate8();
                    if (localDate8 == null) {
                        localDateTimeOf = null;
                    } else {
                        localDateTimeOf = LocalDateTime.of(localDate8, LocalTime.MIN);
                    }
                    if (localDateTimeOf != null) {
                        return ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
                    }
                    break;
                case 9:
                    LocalDate localDate9 = readLocalDate9();
                    if (localDate9 == null) {
                        localDateTimeOf = null;
                    } else {
                        localDateTimeOf = LocalDateTime.of(localDate9, LocalTime.MIN);
                    }
                    if (localDateTimeOf != null) {
                        return ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
                    }
                    break;
                case 10:
                    LocalDate localDate10 = readLocalDate10();
                    if (localDate10 == null) {
                        localDateTimeOf = null;
                    } else {
                        localDateTimeOf = LocalDateTime.of(localDate10, LocalTime.MIN);
                    }
                    if (localDateTimeOf != null) {
                        return ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
                    }
                    break;
                case 11:
                    localDateTimeOf = LocalDateTime.of(readLocalDate11(), LocalTime.MIN);
                    if (localDateTimeOf != null) {
                        return ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
                    }
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                case 13:
                case Opcodes.DCONST_0 /* 14 */:
                case 15:
                default:
                    ZonedDateTime zonedDateTimeX = readZonedDateTimeX(stringLength);
                    if (zonedDateTimeX != null) {
                        return zonedDateTimeX;
                    }
                    localDateTimeOf = null;
                    if (localDateTimeOf != null) {
                        return ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
                    }
                    break;
                case 16:
                    localDateTimeOf = readLocalDateTime16();
                    if (localDateTimeOf != null) {
                        return ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
                    }
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    localDateTimeOf = readLocalDateTime17();
                    if (localDateTimeOf != null) {
                        return ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
                    }
                    break;
                case Opcodes.LDC /* 18 */:
                    localDateTimeOf = readLocalDateTime18();
                    if (localDateTimeOf != null) {
                        return ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
                    }
                    break;
                case 19:
                    localDateTimeOf = readLocalDateTime19();
                    if (localDateTimeOf != null) {
                        return ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
                    }
                    break;
                case 20:
                    localDateTimeOf = readLocalDateTime20();
                    if (localDateTimeOf != null) {
                        return ZonedDateTime.ofLocal(localDateTimeOf, this.context.getZoneId(), null);
                    }
                    break;
            }
        }
        String string = readString();
        if (string.isEmpty() || "null".equals(string)) {
            return null;
        }
        DateTimeFormatter dateFormatter = this.context.getDateFormatter();
        if (dateFormatter != null) {
            return !this.context.formatHasHour ? ZonedDateTime.of(LocalDate.parse(string, dateFormatter), LocalTime.MIN, this.context.getZoneId()) : ZonedDateTime.of(LocalDateTime.parse(string, dateFormatter), this.context.getZoneId());
        }
        if (!IOUtils.isNumber(string)) {
            return ZonedDateTime.parse(string);
        }
        long j = Long.parseLong(string);
        if (this.context.formatUnixTime) {
            j *= 1000;
        }
        return Instant.ofEpochMilli(j).atZone(this.context.getZoneId());
    }

    public abstract ZonedDateTime readZonedDateTimeX(int i);

    public void reset(SavePoint savePoint) {
        this.offset = savePoint.offset;
        this.ch = (char) savePoint.current;
    }

    public final void setTypeRedirect(boolean z) {
        this.typeRedirect = z;
    }

    public abstract void skipComment();

    public abstract boolean skipName();

    public abstract void skipValue();

    public int startArray() {
        if (nextIfArrayStart()) {
            return Integer.MAX_VALUE;
        }
        throw new JSONException(info("illegal input, expect '[', but " + this.ch));
    }

    public final int toInt(List list) {
        if (list.size() == 1) {
            Object obj = list.get(0);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
        }
        throw error("parseLong error, field : value " + list);
    }

    public final int toInt32(String str) {
        if (IOUtils.isNumber(str) || str.lastIndexOf(44) == str.length() - 4) {
            return TypeUtils.toIntValue(str);
        }
        throw error("parseInt error, value : ".concat(str));
    }

    public final long toInt64(String str) {
        if (IOUtils.isNumber(str) || str.lastIndexOf(44) == str.length() - 4) {
            return TypeUtils.toLongValue(str);
        }
        if (str.length() > 10 && str.length() < 40) {
            try {
                return DateUtils.parseMillis(str, this.context.zoneId);
            } catch (JSONException | NullPointerException | DateTimeException unused) {
            }
        }
        throw error("parseLong error, value : ".concat(str));
    }

    public final long toLong(Map map) {
        Object obj = map.get("val");
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        throw error("parseLong error, value : " + map);
    }

    public final Number toNumber(Map map) {
        Object obj = map.get("val");
        if (obj instanceof Number) {
            return (Number) obj;
        }
        return null;
    }

    public final String toString(List list) {
        JSONWriter jSONWriterOf = JSONWriter.of();
        jSONWriterOf.setRootObject(list);
        jSONWriterOf.write(list);
        return jSONWriterOf.toString();
    }

    public final JSONException valueError() {
        return new JSONException(info("illegal value"));
    }

    public boolean wasNull() {
        return this.wasNull;
    }

    public static AutoTypeBeforeHandler autoTypeFilter(boolean z, String... strArr) {
        return new ContextAutoTypeBeforeHandler(z, strArr);
    }

    @Deprecated
    public static JSONReader of(Context context, byte[] bArr) {
        return JSONReaderUTF8.of(bArr, 0, bArr.length, context);
    }

    private static JSONReader ofUTF16(String str, char[] cArr, int i, int i2, Context context) {
        return new JSONReaderUTF16(context, str, cArr, i, i2);
    }

    public static JSONException syntaxError(int i, int i2) {
        StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "syntax error, offset ", ", char ");
        sbM4804Ujhhgtgfeyxiexzf.append((char) i2);
        return new JSONException(sbM4804Ujhhgtgfeyxiexzf.toString());
    }

    public final JSONException error(String str, int i) {
        return new JSONException(info(str).concat(Integer.toString(i)));
    }

    public String info(String str) {
        if (str == null || str.isEmpty()) {
            return "offset " + this.offset;
        }
        StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(str, ", offset ");
        sbM4805Ujhhgtgfeyxiexzf.append(this.offset);
        return sbM4805Ujhhgtgfeyxiexzf.toString();
    }

    public final boolean isSupportBeanArray(long j) {
        return ((j | this.context.features) & 8) != 0;
    }

    public final boolean isSupportSmartMatch(long j) {
        return ((j | this.context.features) & 64) != 0;
    }

    public static AutoTypeBeforeHandler autoTypeFilter(Class... clsArr) {
        return new ContextAutoTypeBeforeHandler(clsArr);
    }

    public static JSONReader of(byte[] bArr, Context context) {
        return JSONReaderUTF8.of(bArr, 0, bArr.length, context);
    }

    @Deprecated
    public static JSONReader ofJSONB(Context context, byte[] bArr) {
        return new JSONReaderJSONB(context, bArr, 0, bArr.length);
    }

    public final JSONException error(String str, Exception exc) {
        return new JSONException(info(str), exc);
    }

    public void readNumber(ValueConsumer valueConsumer, boolean z) {
        readNumber0();
        valueConsumer.accept(getNumber());
    }

    public boolean readReference(Collection collection, int i) {
        if (isReference()) {
            return readReference0(collection, i);
        }
        return false;
    }

    public static AutoTypeBeforeHandler autoTypeFilter(boolean z, Class... clsArr) {
        return new ContextAutoTypeBeforeHandler(z, clsArr);
    }

    public static JSONReader of(char[] cArr) {
        return ofUTF16(null, cArr, 0, cArr.length, JSONFactory.createReadContext());
    }

    public static JSONReader ofJSONB(byte[] bArr, Context context) {
        return new JSONReaderJSONB(context, bArr, 0, bArr.length);
    }

    public final void addResolveTask(Map map, Object obj, JSONPath jSONPath) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        if (map instanceof LinkedHashMap) {
            map.put(obj, null);
        }
        this.resolveTasks.add(new ResolveTask(null, map, obj, jSONPath));
    }

    public final JSONException error() {
        throw new JSONValidException("error, offset " + this.offset + ", char " + this.ch);
    }

    public final void read(List list) {
        if (nextIfArrayStart()) {
            int i = this.level + 1;
            this.level = i;
            if (i < this.context.maxLevel) {
                while (!nextIfArrayEnd()) {
                    list.add(ObjectReaderImplObject.INSTANCE.readObject(this, null, null, 0L));
                    nextIfComma();
                }
                this.level--;
                nextIfComma();
                return;
            }
            throw new JSONException("level too large : " + this.level);
        }
        throw new JSONException("illegal input, offset " + this.offset + ", char " + this.ch);
    }

    public final void readObject(Object obj, long j) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Context context = this.context;
            ObjectReader objectReader = context.provider.getObjectReader(cls, ((context.features | j) & Feature.FieldBased.mask) != 0);
            if (objectReader instanceof ObjectReaderBean) {
                ((ObjectReaderBean) objectReader).readObject(this, obj, j);
                return;
            } else {
                if (obj instanceof Map) {
                    read((Map) obj, j);
                    return;
                }
                throw new JSONException("read object not support");
            }
        }
        throw new JSONException("object is null");
    }

    public final Number toNumber(List list) {
        if (list.size() != 1) {
            return null;
        }
        Object obj = list.get(0);
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return TypeUtils.toBigDecimal((String) obj);
        }
        return null;
    }

    public static JSONReader ofJSONB(InputStream inputStream, Context context) {
        return new JSONReaderJSONB(context, inputStream);
    }

    public final JSONException error(int i, int i2) {
        StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "error, offset ", ", char ");
        sbM4804Ujhhgtgfeyxiexzf.append((char) i2);
        throw new JSONValidException(sbM4804Ujhhgtgfeyxiexzf.toString());
    }

    public final String toString(Map map) {
        JSONWriter jSONWriterOf = JSONWriter.of();
        jSONWriterOf.setRootObject(map);
        jSONWriterOf.write((Map<?, ?>) map);
        return jSONWriterOf.toString();
    }

    public static JSONReader ofJSONB(byte[] bArr, Feature... featureArr) {
        Context contextCreateReadContext = JSONFactory.createReadContext();
        contextCreateReadContext.config(featureArr);
        return new JSONReaderJSONB(contextCreateReadContext, bArr, 0, bArr.length);
    }

    @Deprecated
    public static JSONReader of(Context context, char[] cArr) {
        return ofUTF16(null, cArr, 0, cArr.length, context);
    }

    public static JSONReader of(char[] cArr, Context context) {
        return ofUTF16(null, cArr, 0, cArr.length, context);
    }

    public JSONException numberError() {
        return new JSONException("illegal number, offset " + this.offset + ", char " + this.ch);
    }

    public static JSONReader of(byte[] bArr, int i, int i2, Charset charset) {
        Context contextCreateReadContext = JSONFactory.createReadContext();
        if (charset == StandardCharsets.UTF_8) {
            return JSONReaderUTF8.of(bArr, i, i2, contextCreateReadContext);
        }
        if (charset == StandardCharsets.UTF_16) {
            return ofUTF16(bArr, i, i2, contextCreateReadContext);
        }
        if (charset != StandardCharsets.US_ASCII && charset != StandardCharsets.ISO_8859_1) {
            throw new JSONException("not support charset " + charset);
        }
        return JSONReaderASCII.of(contextCreateReadContext, (String) null, bArr, i, i2);
    }

    public static JSONReader ofJSONB(byte[] bArr, int i, int i2) {
        return new JSONReaderJSONB(JSONFactory.createReadContext(), bArr, i, i2);
    }

    public final void addResolveTask(Collection collection, int i, JSONPath jSONPath) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        this.resolveTasks.add(new ResolveTask(null, collection, Integer.valueOf(i), jSONPath));
    }

    public static JSONReader ofJSONB(byte[] bArr, int i, int i2, Context context) {
        return new JSONReaderJSONB(context, bArr, i, i2);
    }

    public static JSONReader ofJSONB(byte[] bArr, int i, int i2, SymbolTable symbolTable) {
        return new JSONReaderJSONB(JSONFactory.createReadContext(symbolTable), bArr, i, i2);
    }

    public final void addResolveTask(Object[] objArr, int i, JSONPath jSONPath) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        this.resolveTasks.add(new ResolveTask(null, objArr, Integer.valueOf(i), jSONPath));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:114:0x01d7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x016a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0178  */
    /* JADX WARN: Code duplicated, block: B:86:0x0186  */
    /* JADX WARN: Code duplicated, block: B:94:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:95:0x01af  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b5  */
    public Map<String, Object> readObject() {
        Map jSONObject;
        Map innerMap;
        Object string;
        Object objPut;
        nextIfObjectStart();
        int i = this.level + 1;
        this.level = i;
        Context context = this.context;
        if (i < context.maxLevel) {
            Supplier<Map> supplier = context.objectSupplier;
            if (supplier == null) {
                if ((context.features & Feature.UseNativeObject.mask) != 0) {
                    jSONObject = new HashMap();
                } else {
                    jSONObject = new JSONObject();
                }
                innerMap = null;
            } else {
                jSONObject = supplier.get();
                innerMap = TypeUtils.getInnerMap(jSONObject);
            }
            int i2 = 0;
            while (true) {
                if (this.ch == '/') {
                    skipComment();
                }
                if (this.ch == '}') {
                    next();
                    boolean z = this.ch == ',';
                    this.comma = z;
                    if (z) {
                        next();
                    }
                    this.level--;
                    return jSONObject;
                }
                Object fieldName = readFieldName();
                if (fieldName == null) {
                    char c = this.ch;
                    if (c != 26) {
                        if (c == '-' || (c >= '0' && c <= '9')) {
                            readNumber0();
                            fieldName = getNumber();
                        } else if (c == '{') {
                            fieldName = readObject();
                        } else if (c == '[') {
                            fieldName = readArray();
                        } else {
                            fieldName = readFieldNameUnquote();
                        }
                        nextIfMatch(':');
                    } else {
                        throw new JSONException("input end");
                    }
                }
                if (i2 == 0 && (this.context.features & Feature.ErrorOnNotSupportAutoType.mask) != 0 && "@type".equals(fieldName)) {
                    throw new JSONException(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("autoType not support : ", readString()));
                }
                char c2 = this.ch;
                switch (c2) {
                    case '\"':
                    case '\'':
                        string = readString();
                        if ((string == null || (this.context.features & Feature.IgnoreNullPropertyValue.mask) == 0) && ((this.context.features & Feature.SupportAutoType.mask) == 0 || !fieldName.equals("@type") || !jSONObject.getClass().getName().equals(string))) {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null && (this.context.features & Feature.DuplicateKeyValueAsArray.mask) != 0) {
                                if (objPut instanceof Collection) {
                                    ((Collection) objPut).add(string);
                                    jSONObject.put(fieldName, objPut);
                                } else {
                                    jSONObject.put(fieldName, JSONArray.of(objPut, string));
                                }
                            }
                        }
                        i2++;
                        break;
                    case '+':
                    case '-':
                        readNumber0();
                        string = getNumber();
                        if (string == null) {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null) {
                            }
                        } else {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null) {
                            }
                        }
                        i2++;
                        break;
                    case 'I':
                        if (nextIfInfinity()) {
                            string = Double.valueOf(Double.POSITIVE_INFINITY);
                            if (string == null) {
                                if (innerMap != null) {
                                    objPut = innerMap.put(fieldName, string);
                                } else {
                                    objPut = jSONObject.put(fieldName, string);
                                }
                                if (objPut == null) {
                                }
                            } else {
                                if (innerMap != null) {
                                    objPut = innerMap.put(fieldName, string);
                                } else {
                                    objPut = jSONObject.put(fieldName, string);
                                }
                                if (objPut == null) {
                                }
                            }
                            i2++;
                        } else {
                            throw new JSONException(info("illegal input " + this.ch));
                        }
                        break;
                    case Opcodes.AASTORE /* 83 */:
                        if (nextIfSet()) {
                            string = read((Class<Object>) Set.class);
                            if (string == null) {
                                if (innerMap != null) {
                                    objPut = innerMap.put(fieldName, string);
                                } else {
                                    objPut = jSONObject.put(fieldName, string);
                                }
                                if (objPut == null) {
                                }
                            } else {
                                if (innerMap != null) {
                                    objPut = innerMap.put(fieldName, string);
                                } else {
                                    objPut = jSONObject.put(fieldName, string);
                                }
                                if (objPut == null) {
                                }
                            }
                            i2++;
                        } else {
                            throw new JSONException(info("illegal input " + this.ch));
                        }
                        break;
                    case '[':
                        string = readArray();
                        if (string == null) {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null) {
                            }
                        } else {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null) {
                            }
                        }
                        i2++;
                        break;
                    case 'f':
                    case Opcodes.INEG /* 116 */:
                        string = Boolean.valueOf(readBoolValue());
                        if (string == null) {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null) {
                            }
                        } else {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null) {
                            }
                        }
                        i2++;
                        break;
                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                        string = readNullOrNewDate();
                        if (string == null) {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null) {
                            }
                        } else {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null) {
                            }
                        }
                        i2++;
                        break;
                    case Opcodes.LSHR /* 123 */:
                        if (isReference()) {
                            addResolveTask(jSONObject, fieldName, JSONPath.of(readReference()));
                            string = null;
                        } else {
                            string = readObject();
                        }
                        if (string == null) {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null) {
                            }
                        } else {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null) {
                            }
                        }
                        i2++;
                        break;
                    default:
                        switch (c2) {
                            case '/':
                                skipComment();
                                continue;
                                i2++;
                                break;
                            case '0':
                            case '1':
                            case Opcodes.AALOAD /* 50 */:
                            case Opcodes.BALOAD /* 51 */:
                            case '4':
                            case Opcodes.SALOAD /* 53 */:
                            case Opcodes.ISTORE /* 54 */:
                            case Opcodes.LSTORE /* 55 */:
                            case Opcodes.FSTORE /* 56 */:
                            case Opcodes.DSTORE /* 57 */:
                                readNumber0();
                                string = getNumber();
                                break;
                            default:
                                throw new JSONException(info("illegal input " + this.ch));
                        }
                        if (string == null) {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null) {
                            }
                        } else {
                            if (innerMap != null) {
                                objPut = innerMap.put(fieldName, string);
                            } else {
                                objPut = jSONObject.put(fieldName, string);
                            }
                            if (objPut == null) {
                            }
                        }
                        i2++;
                        break;
                }
            }
        } else {
            throw new JSONException("level too large : " + this.level);
        }
    }

    public final void read(Collection collection) {
        if (nextIfArrayStart()) {
            int i = this.level + 1;
            this.level = i;
            if (i < this.context.maxLevel) {
                while (!nextIfArrayEnd()) {
                    collection.add(readAny());
                    nextIfComma();
                }
                this.level--;
                nextIfComma();
                return;
            }
            throw new JSONException("level too large : " + this.level);
        }
        throw new JSONException("illegal input, offset " + this.offset + ", char " + this.ch);
    }

    public static JSONReader of(byte[] bArr, int i, int i2, Charset charset, Context context) {
        if (charset == StandardCharsets.UTF_8) {
            return JSONReaderUTF8.of(bArr, i, i2, context);
        }
        if (charset == StandardCharsets.UTF_16) {
            return ofUTF16(bArr, i, i2, context);
        }
        if (charset != StandardCharsets.US_ASCII && charset != StandardCharsets.ISO_8859_1) {
            throw new JSONException("not support charset " + charset);
        }
        return JSONReaderASCII.of(context, (String) null, bArr, i, i2);
    }

    public final Object[] readArray(Type[] typeArr) {
        char c;
        if (nextIfNull()) {
            return null;
        }
        if (nextIfArrayStart()) {
            int length = typeArr.length;
            Object[] objArr = new Object[length];
            int i = 0;
            while (!nextIfArrayEnd() && i < length) {
                int i2 = this.offset;
                Object obj = read(typeArr[i]);
                if (i2 != this.offset && (c = this.ch) != '}' && c != 26) {
                    objArr[i] = obj;
                    i++;
                } else {
                    throw new JSONException("illegal input : " + this.ch + ", offset " + getOffset());
                }
            }
            if (i == length) {
                boolean z = this.ch == ',';
                this.comma = z;
                if (z) {
                    next();
                }
                return objArr;
            }
            throw new JSONException(info("element length mismatch"));
        }
        throw new JSONException(info("syntax error"));
    }

    public static JSONReader of(byte[] bArr, int i, int i2) {
        return of(bArr, i, i2, StandardCharsets.UTF_8, JSONFactory.createReadContext());
    }

    public static JSONReader of(byte[] bArr, int i, int i2, Context context) {
        return new JSONReaderUTF8(context, bArr, i, i2);
    }

    public static JSONReader of(char[] cArr, int i, int i2) {
        return ofUTF16(null, cArr, i, i2, JSONFactory.createReadContext());
    }

    public void read(Map map, ObjectReader objectReader, long j) {
        Object objPut;
        nextIfObjectStart();
        Map map2 = map instanceof Wrapper ? (Map) ((Wrapper) map).unwrap(Map.class) : map;
        long features = this.context.getFeatures() | j;
        int i = 0;
        while (true) {
            if (this.ch == '/') {
                skipComment();
            }
            if (nextIfObjectEnd()) {
                nextIfComma();
                return;
            }
            if (i != 0 && !this.comma) {
                throw new JSONException(info());
            }
            String fieldName = readFieldName();
            Object object = objectReader.readObject(this, objectReader.getObjectClass(), fieldName, j);
            if ((object != null || (Feature.IgnoreNullPropertyValue.mask & features) == 0) && (((Feature.SupportAutoType.mask & features) == 0 || !fieldName.equals("@type") || !map.getClass().getName().equals(object)) && (objPut = map2.put(fieldName, object)) != null && (Feature.DuplicateKeyValueAsArray.mask & features) != 0)) {
                if (objPut instanceof Collection) {
                    ((Collection) objPut).add(object);
                    map2.put(fieldName, objPut);
                } else {
                    map2.put(fieldName, JSONArray.of(objPut, object));
                }
            }
            i++;
        }
    }

    public static JSONReader of(char[] cArr, int i, int i2, Context context) {
        return ofUTF16(null, cArr, i, i2, context);
    }

    public static JSONReader of(URL url, Context context) throws IOException {
        InputStream inputStreamOpenStream = url.openStream();
        try {
            JSONReader jSONReaderOf = of(inputStreamOpenStream, StandardCharsets.UTF_8, context);
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
            return jSONReaderOf;
        } catch (Throwable th) {
            if (inputStreamOpenStream != null) {
                try {
                    inputStreamOpenStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static JSONReader of(InputStream inputStream, Charset charset) {
        return of(inputStream, charset, JSONFactory.createReadContext());
    }

    public static JSONReader of(InputStream inputStream, Charset charset, Context context) {
        if (inputStream != null) {
            if (charset != StandardCharsets.UTF_8 && charset != null) {
                if (charset == StandardCharsets.UTF_16) {
                    return new JSONReaderUTF16(context, inputStream);
                }
                if (charset == StandardCharsets.US_ASCII) {
                    return JSONReaderASCII.of(context, inputStream);
                }
                return of(new InputStreamReader(inputStream, charset), context);
            }
            return new JSONReaderUTF8(context, inputStream);
        }
        throw new JSONException("inputStream is null");
    }

    public final void bigInt(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        long j2;
        long j3;
        int i4 = i2 - i;
        if (this.scale > 0) {
            i4--;
        }
        if (i4 <= 38) {
            int i5 = i4 % 9;
            int i6 = i + (i5 != 0 ? i5 : 9);
            int i7 = i + 1;
            char c = (char) bArr[i];
            if (c == '.') {
                c = (char) bArr[i7];
                i7 = i + 2;
                i3 = i6 + 1;
            } else {
                i3 = i6;
            }
            int i8 = c - '0';
            while (i7 < i6) {
                char c2 = (char) bArr[i7];
                if (c2 == '.') {
                    i7++;
                    c2 = (char) bArr[i7];
                    i3++;
                    if (i6 < i2) {
                        i6++;
                    }
                }
                i8 = (i8 * 10) + (c2 - '0');
                i7++;
            }
            this.mag3 = i8;
            while (i3 < i2) {
                int i9 = i3 + 9;
                int i10 = i3 + 1;
                char c3 = (char) bArr[i3];
                if (c3 == '.') {
                    int i11 = i3 + 2;
                    c3 = (char) bArr[i10];
                    i3 += 10;
                    i10 = i11;
                    i9 = i3;
                } else {
                    i3 = i9;
                }
                int i12 = c3 - '0';
                while (i10 < i9) {
                    char c4 = (char) bArr[i10];
                    if (c4 == '.') {
                        i10++;
                        c4 = (char) bArr[i10];
                        i3++;
                        i9++;
                    }
                    i12 = (i12 * 10) + (c4 - '0');
                    i10++;
                }
                long j4 = 4294967295L;
                long j5 = ((long) i12) & 4294967295L;
                long j6 = 0;
                int i13 = 3;
                while (i13 >= 0) {
                    if (i13 == 0) {
                        j2 = j4;
                        j3 = (1000000000 * (((long) this.mag0) & j2)) + j6;
                        this.mag0 = (int) j3;
                    } else if (i13 == 1) {
                        j2 = j4;
                        j3 = (1000000000 * (((long) this.mag1) & j2)) + j6;
                        this.mag1 = (int) j3;
                    } else if (i13 == 2) {
                        j2 = j4;
                        j3 = (1000000000 * (((long) this.mag2) & j2)) + j6;
                        this.mag2 = (int) j3;
                    } else if (i13 == 3) {
                        j2 = j4;
                        j3 = (1000000000 * (((long) this.mag3) & j2)) + j6;
                        this.mag3 = (int) j3;
                    } else {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j6 = j3 >>> 32;
                    i13--;
                    j4 = j2;
                }
                long j7 = j4;
                long j8 = (((long) this.mag3) & j7) + j5;
                this.mag3 = (int) j8;
                long j9 = j8 >>> 32;
                for (int i14 = 2; i14 >= 0; i14--) {
                    if (i14 == 0) {
                        j = (((long) this.mag0) & j7) + j9;
                        this.mag0 = (int) j;
                    } else if (i14 == 1) {
                        j = (((long) this.mag1) & j7) + j9;
                        this.mag1 = (int) j;
                    } else if (i14 == 2) {
                        j = (((long) this.mag2) & j7) + j9;
                        this.mag2 = (int) j;
                    } else if (i14 == 3) {
                        j = (((long) this.mag3) & j7) + j9;
                        this.mag3 = (int) j;
                    } else {
                        throw new ArithmeticException("BigInteger would overflow supported range");
                    }
                    j9 = j >>> 32;
                }
            }
            return;
        }
        throw new JSONException("number too large : ".concat(new String(bArr, i, i4)));
    }

    public final void readArray(List list, Type type) {
        readArray((Collection) list, type);
    }

    public void readArray(Collection collection, Type type) {
        if (nextIfArrayStart()) {
            while (!nextIfArrayEnd()) {
                collection.add(read(type));
            }
            return;
        }
        if (isString()) {
            String string = readString();
            if (type != String.class) {
                Function typeConvert = this.context.getProvider().getTypeConvert(String.class, type);
                if (typeConvert != null) {
                    if (string.indexOf(44) != -1) {
                        for (String str : string.split(",")) {
                            collection.add(typeConvert.apply(str));
                        }
                    } else {
                        collection.add(typeConvert.apply(string));
                    }
                } else {
                    throw new JSONException(info("not support input " + string));
                }
            } else {
                collection.add(string);
            }
        } else {
            collection.add(read(type));
        }
        boolean z = this.ch == ',';
        this.comma = z;
        if (z) {
            next();
        }
    }

    public static JSONReader of(Reader reader) {
        return new JSONReaderUTF16(JSONFactory.createReadContext(), reader);
    }

    public static JSONReader of(Reader reader, Context context) {
        return new JSONReaderUTF16(context, reader);
    }

    public static JSONReader of(ByteBuffer byteBuffer, Charset charset) {
        Context contextCreateReadContext = JSONFactory.createReadContext();
        if (charset != StandardCharsets.UTF_8 && charset != null) {
            throw new JSONException("not support charset " + charset);
        }
        return new JSONReaderUTF8(contextCreateReadContext, byteBuffer);
    }

    public static JSONReader of(ByteBuffer byteBuffer, Charset charset, Context context) {
        if (charset != StandardCharsets.UTF_8 && charset != null) {
            throw new JSONException("not support charset " + charset);
        }
        return new JSONReaderUTF8(context, byteBuffer);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:131:0x0246  */
    /* JADX WARN: Code duplicated, block: B:134:0x0251  */
    /* JADX WARN: Code duplicated, block: B:137:0x025b  */
    /* JADX WARN: Code duplicated, block: B:150:0x028e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0298  */
    public void read(Map map, long j) {
        boolean z;
        boolean z2;
        Object fieldName;
        long j2;
        Object string;
        Object objPut;
        Map map2;
        char c = this.ch;
        long j3 = 0;
        if (c == '\'' && (this.context.features & Feature.DisableSingleQuote.mask) != 0) {
            throw notSupportName();
        }
        if ((c == '\"' || c == '\'') && !this.typeRedirect) {
            String string2 = readString();
            if (string2.isEmpty()) {
                return;
            }
            if (string2.charAt(0) == '{') {
                JSONReader jSONReaderOf = of(string2, this.context);
                try {
                    jSONReaderOf.readObject(map, j);
                    jSONReaderOf.close();
                    return;
                } catch (Throwable th) {
                    if (jSONReaderOf == null) {
                        throw th;
                    }
                    try {
                        jSONReaderOf.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        }
        boolean zNextIfObjectStart = nextIfObjectStart();
        if (zNextIfObjectStart) {
            z = false;
        } else {
            boolean zIsTypeRedirect = isTypeRedirect();
            if (zIsTypeRedirect) {
                setTypeRedirect(false);
                z = zIsTypeRedirect;
            } else {
                if (!isString() || !readString().isEmpty()) {
                    throw new JSONException(info());
                }
                return;
            }
        }
        Map map3 = map instanceof Wrapper ? (Map) ((Wrapper) map).unwrap(Map.class) : map;
        long features = j | this.context.getFeatures();
        int i = 0;
        while (true) {
            if (this.ch == '/') {
                skipComment();
            }
            if (nextIfObjectEnd()) {
                nextIfComma();
                return;
            }
            if (i != 0 && !this.comma) {
                throw new JSONException(info());
            }
            if (!zNextIfObjectStart && !z) {
                fieldName = getFieldName();
                z2 = true;
            } else {
                char c2 = this.ch;
                if ((c2 < '0' || c2 > '9') && c2 != '-') {
                    z2 = zNextIfObjectStart;
                    fieldName = readFieldName();
                } else {
                    z2 = zNextIfObjectStart;
                    fieldName = null;
                }
            }
            if (fieldName == null) {
                if (isNumber()) {
                    fieldName = readNumber();
                    j2 = j3;
                    if ((this.context.features & Feature.NonStringKeyAsString.mask) != j2) {
                        fieldName = fieldName.toString();
                    }
                    if (this.comma) {
                        throw new JSONException(info("syntax error, illegal key-value"));
                    }
                } else {
                    j2 = j3;
                    if ((this.context.features & Feature.AllowUnQuotedFieldNames.mask) != j2) {
                        fieldName = readFieldNameUnquote();
                    } else {
                        throw new JSONException(info("not allow unquoted fieldName"));
                    }
                }
                if (this.ch == ':') {
                    next();
                }
            } else {
                j2 = j3;
            }
            Object obj = fieldName;
            if (isReference()) {
                String reference = readReference();
                if ("..".equals(reference)) {
                    map2 = map3;
                } else {
                    try {
                        addResolveTask(map3, obj, JSONPath.of(reference));
                        map2 = null;
                    } catch (Exception unused) {
                        map3.put(obj, JSONObject.of("$ref", (Object) reference));
                    }
                }
                map3.put(obj, map2);
            } else {
                this.comma = false;
                char c3 = this.ch;
                switch (c3) {
                    case '\"':
                    case '\'':
                        string = readString();
                        if ((string == null || (Feature.IgnoreNullPropertyValue.mask & features) == j2) && (((Feature.SupportAutoType.mask & features) == j2 || !obj.equals("@type") || !map.getClass().getName().equals(string)) && (objPut = map3.put(obj, string)) != null && (Feature.DuplicateKeyValueAsArray.mask & features) != j2)) {
                            if (objPut instanceof Collection) {
                                ((Collection) objPut).add(string);
                                map3.put(obj, objPut);
                            } else {
                                map3.put(obj, JSONArray.of(objPut, string));
                            }
                        }
                        break;
                    case '+':
                        string = readNumber();
                        if (string == null) {
                            if (objPut instanceof Collection) {
                                ((Collection) objPut).add(string);
                                map3.put(obj, objPut);
                            } else {
                                map3.put(obj, JSONArray.of(objPut, string));
                            }
                        } else if (objPut instanceof Collection) {
                            ((Collection) objPut).add(string);
                            map3.put(obj, objPut);
                        } else {
                            map3.put(obj, JSONArray.of(objPut, string));
                        }
                        break;
                    case 'I':
                        if (nextIfInfinity()) {
                            string = Double.valueOf(Double.POSITIVE_INFINITY);
                            if (string == null) {
                                if (objPut instanceof Collection) {
                                    ((Collection) objPut).add(string);
                                    map3.put(obj, objPut);
                                } else {
                                    map3.put(obj, JSONArray.of(objPut, string));
                                }
                            } else if (objPut instanceof Collection) {
                                ((Collection) objPut).add(string);
                                map3.put(obj, objPut);
                            } else {
                                map3.put(obj, JSONArray.of(objPut, string));
                            }
                        } else {
                            throw new JSONException("FASTJSON2.0.61error, offset " + this.offset + ", char " + this.ch);
                        }
                        break;
                    case Opcodes.AASTORE /* 83 */:
                        if (nextIfSet()) {
                            string = read((Class<Object>) HashSet.class);
                            if (string == null) {
                                if (objPut instanceof Collection) {
                                    ((Collection) objPut).add(string);
                                    map3.put(obj, objPut);
                                } else {
                                    map3.put(obj, JSONArray.of(objPut, string));
                                }
                            } else if (objPut instanceof Collection) {
                                ((Collection) objPut).add(string);
                                map3.put(obj, objPut);
                            } else {
                                map3.put(obj, JSONArray.of(objPut, string));
                            }
                        } else {
                            throw new JSONException("FASTJSON2.0.61error, offset " + this.offset + ", char " + this.ch);
                        }
                        break;
                    case '[':
                        string = readArray();
                        if (string == null) {
                            if (objPut instanceof Collection) {
                                ((Collection) objPut).add(string);
                                map3.put(obj, objPut);
                            } else {
                                map3.put(obj, JSONArray.of(objPut, string));
                            }
                        } else if (objPut instanceof Collection) {
                            ((Collection) objPut).add(string);
                            map3.put(obj, objPut);
                        } else {
                            map3.put(obj, JSONArray.of(objPut, string));
                        }
                        break;
                    case 'f':
                    case Opcodes.INEG /* 116 */:
                        string = Boolean.valueOf(readBoolValue());
                        if (string == null) {
                            if (objPut instanceof Collection) {
                                ((Collection) objPut).add(string);
                                map3.put(obj, objPut);
                            } else {
                                map3.put(obj, JSONArray.of(objPut, string));
                            }
                        } else if (objPut instanceof Collection) {
                            ((Collection) objPut).add(string);
                            map3.put(obj, objPut);
                        } else {
                            map3.put(obj, JSONArray.of(objPut, string));
                        }
                        break;
                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                        string = readNullOrNewDate();
                        if (string == null) {
                            if (objPut instanceof Collection) {
                                ((Collection) objPut).add(string);
                                map3.put(obj, objPut);
                            } else {
                                map3.put(obj, JSONArray.of(objPut, string));
                            }
                        } else if (objPut instanceof Collection) {
                            ((Collection) objPut).add(string);
                            map3.put(obj, objPut);
                        } else {
                            map3.put(obj, JSONArray.of(objPut, string));
                        }
                        break;
                    case 'x':
                        string = readBinary();
                        if (string == null) {
                            if (objPut instanceof Collection) {
                                ((Collection) objPut).add(string);
                                map3.put(obj, objPut);
                            } else {
                                map3.put(obj, JSONArray.of(objPut, string));
                            }
                        } else if (objPut instanceof Collection) {
                            ((Collection) objPut).add(string);
                            map3.put(obj, objPut);
                        } else {
                            map3.put(obj, JSONArray.of(objPut, string));
                        }
                        break;
                    case Opcodes.LSHR /* 123 */:
                        if (z) {
                            string = ObjectReaderImplObject.INSTANCE.readObject(this, null, obj, j);
                        } else {
                            string = readObject();
                        }
                        if (string == null) {
                            if (objPut instanceof Collection) {
                                ((Collection) objPut).add(string);
                                map3.put(obj, objPut);
                            } else {
                                map3.put(obj, JSONArray.of(objPut, string));
                            }
                        } else if (objPut instanceof Collection) {
                            ((Collection) objPut).add(string);
                            map3.put(obj, objPut);
                        } else {
                            map3.put(obj, JSONArray.of(objPut, string));
                        }
                        break;
                    default:
                        switch (c3) {
                            case '-':
                            case Opcodes.IALOAD /* 46 */:
                            case '0':
                            case '1':
                            case Opcodes.AALOAD /* 50 */:
                            case Opcodes.BALOAD /* 51 */:
                            case '4':
                            case Opcodes.SALOAD /* 53 */:
                            case Opcodes.ISTORE /* 54 */:
                            case Opcodes.LSTORE /* 55 */:
                            case Opcodes.FSTORE /* 56 */:
                            case Opcodes.DSTORE /* 57 */:
                                string = readNumber();
                                break;
                            case '/':
                                next();
                                if (this.ch == '/') {
                                    skipComment();
                                    continue;
                                } else {
                                    throw new JSONException("FASTJSON2.0.61input not support " + this.ch + ", offset " + this.offset);
                                }
                                break;
                            default:
                                throw new JSONException("FASTJSON2.0.61error, offset " + this.offset + ", char " + this.ch);
                        }
                        if (string == null) {
                            if (objPut instanceof Collection) {
                                ((Collection) objPut).add(string);
                                map3.put(obj, objPut);
                            } else {
                                map3.put(obj, JSONArray.of(objPut, string));
                            }
                        } else if (objPut instanceof Collection) {
                            ((Collection) objPut).add(string);
                            map3.put(obj, objPut);
                        } else {
                            map3.put(obj, JSONArray.of(objPut, string));
                        }
                        break;
                }
            }
            i++;
            zNextIfObjectStart = z2;
            j3 = j2;
        }
    }

    @Deprecated
    public static JSONReader of(Context context, String str) {
        return of(str, context);
    }

    public static JSONReader of(String str) {
        return of(str, JSONFactory.createReadContext());
    }

    public static JSONReader of(String str, Context context) {
        char[] charArray;
        ToIntFunction<String> toIntFunction;
        if (str != null && context != null) {
            Function<String, byte[]> function = JDKUtils.STRING_VALUE;
            if (function != null && (toIntFunction = JDKUtils.STRING_CODER) != null) {
                try {
                    if (toIntFunction.applyAsInt(str) == 0) {
                        byte[] bArrApply = function.apply(str);
                        return JSONReaderASCII.of(context, str, bArrApply, 0, bArrApply.length);
                    }
                } catch (Exception unused) {
                    throw new JSONException("unsafe get String.coder error");
                }
            }
            int length = str.length();
            if (JDKUtils.JVM_VERSION == 8) {
                charArray = JDKUtils.getCharArray(str);
            } else {
                charArray = str.toCharArray();
            }
            return ofUTF16(str, charArray, 0, length, context);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:63:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e  */
    /* JADX WARN: Code duplicated, block: B:72:0x012d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public List readArray() {
        JSONArray jSONArray;
        ArrayList arrayList;
        List<Object> list;
        JSONReader jSONReader;
        Object string;
        Supplier<List> supplier;
        next();
        int i = this.level + 1;
        this.level = i;
        if (i >= this.context.maxLevel) {
            throw new JSONException("level too large : " + this.level);
        }
        List<Object> jSONArray2 = null;
        Object obj = null;
        Object obj2 = null;
        int i2 = 0;
        while (true) {
            char c = this.ch;
            switch (c) {
                case '\"':
                case '\'':
                    jSONReader = this;
                    string = readString();
                    if (i2 == 0) {
                        obj = string;
                    } else if (i2 == 1) {
                        obj2 = string;
                    } else if (i2 == 2) {
                        supplier = jSONReader.context.arraySupplier;
                        if (supplier != null) {
                            jSONArray2 = supplier.get();
                        } else {
                            jSONArray2 = new JSONArray();
                        }
                        add(jSONArray2, 0, obj);
                        add(jSONArray2, 1, obj2);
                        add(jSONArray2, i2, string);
                    } else {
                        add(jSONArray2, i2, string);
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                case '+':
                case '-':
                    jSONReader = this;
                    readNumber0();
                    string = getNumber();
                    if (i2 == 0) {
                        obj = string;
                    } else if (i2 == 1) {
                        obj2 = string;
                    } else if (i2 == 2) {
                        supplier = jSONReader.context.arraySupplier;
                        if (supplier != null) {
                            jSONArray2 = supplier.get();
                        } else {
                            jSONArray2 = new JSONArray();
                        }
                        add(jSONArray2, 0, obj);
                        add(jSONArray2, 1, obj2);
                        add(jSONArray2, i2, string);
                    } else {
                        add(jSONArray2, i2, string);
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                case 'N':
                    jSONReader = this;
                    string = Double.valueOf(readNaN());
                    if (i2 == 0) {
                        obj = string;
                    } else if (i2 == 1) {
                        obj2 = string;
                    } else if (i2 == 2) {
                        supplier = jSONReader.context.arraySupplier;
                        if (supplier != null) {
                            jSONArray2 = supplier.get();
                        } else {
                            jSONArray2 = new JSONArray();
                        }
                        add(jSONArray2, 0, obj);
                        add(jSONArray2, 1, obj2);
                        add(jSONArray2, i2, string);
                    } else {
                        add(jSONArray2, i2, string);
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                case Opcodes.AASTORE /* 83 */:
                    jSONReader = this;
                    if (nextIfSet()) {
                        string = read((Class<Object>) Set.class);
                        if (i2 == 0) {
                            obj = string;
                        } else if (i2 == 1) {
                            obj2 = string;
                        } else if (i2 == 2) {
                            supplier = jSONReader.context.arraySupplier;
                            if (supplier != null) {
                                jSONArray2 = supplier.get();
                            } else {
                                jSONArray2 = new JSONArray();
                            }
                            add(jSONArray2, 0, obj);
                            add(jSONArray2, 1, obj2);
                            add(jSONArray2, i2, string);
                        } else {
                            add(jSONArray2, i2, string);
                        }
                        i2++;
                        jSONArray2 = jSONArray2;
                    } else {
                        throw new JSONException(info());
                    }
                    break;
                case '[':
                    jSONReader = this;
                    string = readArray();
                    if (i2 == 0) {
                        obj = string;
                    } else if (i2 == 1) {
                        obj2 = string;
                    } else if (i2 == 2) {
                        supplier = jSONReader.context.arraySupplier;
                        if (supplier != null) {
                            jSONArray2 = supplier.get();
                        } else {
                            jSONArray2 = new JSONArray();
                        }
                        add(jSONArray2, 0, obj);
                        add(jSONArray2, 1, obj2);
                        add(jSONArray2, i2, string);
                    } else {
                        add(jSONArray2, i2, string);
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                case ']':
                    next();
                    List<Object> list2 = jSONArray2;
                    if (jSONArray2 == null) {
                        Context context = this.context;
                        Supplier<List> supplier2 = context.arraySupplier;
                        if (supplier2 != null) {
                            list = supplier2.get();
                        } else if (context.isEnabled(Feature.UseNativeObject)) {
                            if (i2 == 2) {
                                list = arrayList;
                                arrayList = new ArrayList(2);
                            } else {
                                list = arrayList;
                                arrayList = new ArrayList(1);
                            }
                        } else if (i2 == 2) {
                            list = jSONArray;
                            jSONArray = new JSONArray(2);
                        } else {
                            list = jSONArray;
                            jSONArray = new JSONArray(1);
                        }
                        List<Object> list3 = list;
                        list2 = list3;
                        if (i2 == 1) {
                            add(list3, 0, obj);
                            list2 = list3;
                        } else if (i2 == 2) {
                            add(list3, 0, obj);
                            add(list3, 1, obj2);
                            list2 = list3;
                        }
                    }
                    boolean z = this.ch == ',';
                    this.comma = z;
                    if (z) {
                        next();
                    }
                    this.level--;
                    return list2;
                case 'f':
                case Opcodes.INEG /* 116 */:
                    jSONReader = this;
                    string = Boolean.valueOf(readBoolValue());
                    if (i2 == 0) {
                        obj = string;
                    } else if (i2 == 1) {
                        obj2 = string;
                    } else if (i2 == 2) {
                        supplier = jSONReader.context.arraySupplier;
                        if (supplier != null) {
                            jSONArray2 = supplier.get();
                        } else {
                            jSONArray2 = new JSONArray();
                        }
                        add(jSONArray2, 0, obj);
                        add(jSONArray2, 1, obj2);
                        add(jSONArray2, i2, string);
                    } else {
                        add(jSONArray2, i2, string);
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    jSONReader = this;
                    readNull();
                    string = null;
                    if (i2 == 0) {
                        obj = string;
                    } else if (i2 == 1) {
                        obj2 = string;
                    } else if (i2 == 2) {
                        supplier = jSONReader.context.arraySupplier;
                        if (supplier != null) {
                            jSONArray2 = supplier.get();
                        } else {
                            jSONArray2 = new JSONArray();
                        }
                        add(jSONArray2, 0, obj);
                        add(jSONArray2, 1, obj2);
                        add(jSONArray2, i2, string);
                    } else {
                        add(jSONArray2, i2, string);
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                case Opcodes.LSHR /* 123 */:
                    Context context2 = this.context;
                    if (context2.autoTypeBeforeHandler == null && (context2.features & Feature.SupportAutoType.mask) == 0) {
                        if (isReference()) {
                            string = JSONPath.of(readReference());
                        } else {
                            string = readObject();
                        }
                        jSONReader = this;
                    } else {
                        JSONReader jSONReader2 = this;
                        string = ObjectReaderImplObject.INSTANCE.readObject(jSONReader2, null, null, 0L);
                        jSONReader = jSONReader2;
                    }
                    if (i2 == 0) {
                        obj = string;
                    } else if (i2 == 1) {
                        obj2 = string;
                    } else if (i2 == 2) {
                        supplier = jSONReader.context.arraySupplier;
                        if (supplier != null) {
                            jSONArray2 = supplier.get();
                        } else {
                            jSONArray2 = new JSONArray();
                        }
                        add(jSONArray2, 0, obj);
                        add(jSONArray2, 1, obj2);
                        add(jSONArray2, i2, string);
                    } else {
                        add(jSONArray2, i2, string);
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
                default:
                    switch (c) {
                        case '/':
                            skipComment();
                            i2--;
                            continue;
                            i2++;
                            jSONArray2 = jSONArray2;
                            break;
                        case '0':
                        case '1':
                        case Opcodes.AALOAD /* 50 */:
                        case Opcodes.BALOAD /* 51 */:
                        case '4':
                        case Opcodes.SALOAD /* 53 */:
                        case Opcodes.ISTORE /* 54 */:
                        case Opcodes.LSTORE /* 55 */:
                        case Opcodes.FSTORE /* 56 */:
                        case Opcodes.DSTORE /* 57 */:
                            jSONReader = this;
                            readNumber0();
                            string = getNumber();
                            break;
                        default:
                            throw new JSONException(info());
                    }
                    if (i2 == 0) {
                        obj = string;
                    } else if (i2 == 1) {
                        obj2 = string;
                    } else if (i2 == 2) {
                        supplier = jSONReader.context.arraySupplier;
                        if (supplier != null) {
                            jSONArray2 = supplier.get();
                        } else {
                            jSONArray2 = new JSONArray();
                        }
                        add(jSONArray2, 0, obj);
                        add(jSONArray2, 1, obj2);
                        add(jSONArray2, i2, string);
                    } else {
                        add(jSONArray2, i2, string);
                    }
                    i2++;
                    jSONArray2 = jSONArray2;
                    break;
            }
        }
    }

    public static JSONReader of(String str, int i, int i2) {
        return of(str, i, i2, JSONFactory.createReadContext());
    }

    public static JSONReader of(String str, int i, int i2, Context context) {
        char[] charArray;
        ToIntFunction<String> toIntFunction;
        if (str != null && context != null) {
            Function<String, byte[]> function = JDKUtils.STRING_VALUE;
            if (function != null && (toIntFunction = JDKUtils.STRING_CODER) != null) {
                try {
                    if (toIntFunction.applyAsInt(str) == 0) {
                        return JSONReaderASCII.of(context, str, function.apply(str), i, i2);
                    }
                } catch (Exception unused) {
                    throw new JSONException("unsafe get String.coder error");
                }
            }
            if (JDKUtils.JVM_VERSION == 8) {
                charArray = JDKUtils.getCharArray(str);
            } else {
                charArray = str.toCharArray();
            }
            return ofUTF16(str, charArray, i, i2, context);
        }
        throw null;
    }

    public final void read(Map map, Type type, Type type2, long j) {
        Object object;
        Object objPut;
        if (nextIfObjectStart()) {
            ObjectReader objectReader = this.context.getObjectReader(type);
            ObjectReader objectReader2 = this.context.getObjectReader(type2);
            long features = j | this.context.getFeatures();
            int i = 0;
            while (true) {
                if (this.ch == '/') {
                    skipComment();
                }
                if (nextIfObjectEnd()) {
                    nextIfComma();
                    return;
                }
                if (i != 0 && !this.comma) {
                    throw new JSONException(info());
                }
                if (type == String.class) {
                    object = readFieldName();
                } else {
                    object = objectReader.readObject(this, null, null, 0L);
                    nextIfMatch(':');
                }
                Object obj = object;
                ObjectReader objectReader3 = objectReader2;
                Object object2 = objectReader3.readObject(this, null, null, 0L);
                if ((object2 != null || (Feature.IgnoreNullPropertyValue.mask & features) == 0) && (((Feature.SupportAutoType.mask & features) == 0 || !obj.equals("@type") || !map.getClass().getName().equals(object2)) && (objPut = map.put(obj, object2)) != null && (Feature.DuplicateKeyValueAsArray.mask & features) != 0)) {
                    if (objPut instanceof Collection) {
                        ((Collection) objPut).add(object2);
                        map.put(obj, objPut);
                    } else {
                        map.put(obj, JSONArray.of(objPut, object2));
                    }
                }
                i++;
                objectReader2 = objectReader3;
                objectReader = objectReader;
            }
        } else {
            throw new JSONException("illegal input， offset " + this.offset + ", char " + this.ch);
        }
    }

    public <T> T read(Class<T> cls) {
        Context context = this.context;
        return (T) context.provider.getObjectReader(cls, (context.features & Feature.FieldBased.mask) != 0).readObject(this, null, null, 0L);
    }
}
