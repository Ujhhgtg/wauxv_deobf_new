package com.alibaba.fastjson2.codec;

import com.alibaba.fastjson2.reader.ObjectReader;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FieldInfo {
    public static final long BACKR_REFERENCE = 2305843009213693952L;
    public static final long CONTENT_AS = Long.MIN_VALUE;
    public static final long DISABLE_ARRAY_MAPPING = 288230376151711744L;
    public static final long DISABLE_AUTO_TYPE = 576460752303423488L;
    public static final long DISABLE_JSONB = 1152921504606846976L;
    public static final long DISABLE_REFERENCE_DETECT = 144115188075855872L;
    public static final long DISABLE_SMART_MATCH = 9007199254740992L;
    public static final long DISABLE_UNSAFE = 36028797018963968L;
    public static final long FIELD_MASK = 4503599627370496L;
    public static final long JIT = 18014398509481984L;
    public static final long RAW_VALUE_MASK = 1125899906842624L;
    public static final long READ_ONLY = 72057594037927936L;
    public static final long READ_USING_MASK = 2251799813685248L;
    public static final long RECORD = 4611686018427387904L;
    public static final long UNWRAPPED_MASK = 562949953421312L;
    public static final long VALUE_MASK = 281474976710656L;
    public String[] alternateNames;
    public Class<?> arrayToMapDuplicateHandler;
    public String arrayToMapKey;
    public Class<?> contentAs;
    public String defaultValue;
    public long features;
    public boolean fieldClassMixIn;
    public String fieldName;
    public String format;
    public boolean ignore;
    public boolean isPrivate;
    public boolean isTransient;
    public Class<?> keyUsing;
    public String label;
    public Locale locale;
    public int ordinal;
    public Class<?> readUsing;
    public boolean required;
    public String schema;
    public boolean skipTransient;
    public Class<?> valueUsing;
    public Class<?> writeUsing;

    public BiConsumer getInitArrayToMapDuplicateHandler() {
        Class<?> cls = this.arrayToMapDuplicateHandler;
        if (cls != null && BiConsumer.class.isAssignableFrom(cls)) {
            try {
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return (BiConsumer) declaredConstructor.newInstance(null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public ObjectReader getInitReader() {
        Class<?> cls = this.readUsing;
        if (cls != null && ObjectReader.class.isAssignableFrom(cls)) {
            try {
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return (ObjectReader) declaredConstructor.newInstance(null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void init() {
        this.fieldName = null;
        this.format = null;
        this.label = null;
        this.ordinal = 0;
        this.features = 0L;
        this.ignore = false;
        this.alternateNames = null;
        this.writeUsing = null;
        this.keyUsing = null;
        this.valueUsing = null;
        this.readUsing = null;
        this.fieldClassMixIn = false;
        this.isTransient = false;
        this.skipTransient = true;
        this.isPrivate = true;
        this.defaultValue = null;
        this.locale = null;
        this.schema = null;
        this.required = false;
        this.arrayToMapKey = null;
        this.arrayToMapDuplicateHandler = null;
        this.contentAs = null;
    }
}
