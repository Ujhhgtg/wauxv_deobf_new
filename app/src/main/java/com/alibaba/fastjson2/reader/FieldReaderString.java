package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Locale;
import java.util.function.BiConsumer;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderString<T, V> extends FieldReader<T> {
    final boolean emptyToNull;
    final boolean trim;
    final boolean upper;

    public FieldReaderString(String str, Class<V> cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer<T, V> biConsumer, String str3, Parameter parameter) {
        super(str, cls, cls, i, j, str2, locale, obj, jSONSchema, method, field, biConsumer, str3, parameter);
        this.trim = "trim".equals(str2) || (j & JSONReader.Feature.TrimString.mask) != 0;
        this.upper = "upper".equals(str2);
        this.emptyToNull = (j & JSONReader.Feature.EmptyStringAsNull.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, int i) throws Exception {
        accept(t, Integer.toString(i));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t) throws Exception {
        String string = jSONReader.readString();
        if (string != null) {
            if (this.trim) {
                string = string.trim();
            }
            if (this.upper) {
                string = string.toUpperCase();
            }
            if (this.emptyToNull && string.isEmpty()) {
                string = null;
            }
        }
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(string);
        }
        try {
            this.propertyAccessor.setObject(t, string);
        } catch (Exception e) {
            if (e instanceof JSONException) {
                throw e;
            }
            throw new JSONException(jSONReader.info("set " + this.fieldName + " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValueJSONB(JSONReader jSONReader, T t) throws Exception {
        String string = jSONReader.readString();
        if (string != null) {
            if (this.trim) {
                string = string.trim();
            }
            if (this.upper) {
                string = string.toUpperCase();
            }
            if (this.emptyToNull && string.isEmpty()) {
                string = null;
            }
        }
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(string);
        }
        try {
            this.propertyAccessor.setObject(t, string);
        } catch (Exception e) {
            if (e instanceof JSONException) {
                throw e;
            }
            throw new JSONException(jSONReader.info("set " + this.fieldName + " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(Class cls) {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, long j) throws Exception {
        accept(t, Long.toString(j));
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t, Object obj) throws Exception {
        String upperCase;
        if (!(obj instanceof String) && obj != null) {
            upperCase = obj.toString();
        } else {
            upperCase = (String) obj;
        }
        if (upperCase != null) {
            if (this.trim) {
                upperCase = upperCase.trim();
            }
            if (this.upper) {
                upperCase = upperCase.toUpperCase();
            }
            if (this.emptyToNull && upperCase.isEmpty()) {
                upperCase = null;
            }
        }
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(upperCase);
        }
        try {
            this.propertyAccessor.setObject(t, upperCase);
        } catch (Exception e) {
            if (e instanceof JSONException) {
                throw e;
            }
            throw new JSONException(AbstractC2784.m4752(new StringBuilder("set "), this.fieldName, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        String string = jSONReader.readString();
        return (!this.trim || string == null) ? string : string.trim();
    }
}
