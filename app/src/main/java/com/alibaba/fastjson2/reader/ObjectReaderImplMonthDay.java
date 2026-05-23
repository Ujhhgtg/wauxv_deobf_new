package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.MonthDay;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplMonthDay extends ObjectReaderPrimitive<MonthDay> {
    static final ObjectReaderImplMonthDay INSTANCE = new ObjectReaderImplMonthDay();

    public ObjectReaderImplMonthDay() {
        super(MonthDay.class);
    }

    private static int parse2(String str, int i) {
        int iCharAt = str.charAt(i) - '0';
        int iCharAt2 = str.charAt(i + 1) - '0';
        if ((iCharAt | iCharAt2) < 0 || iCharAt > 9 || iCharAt2 > 9) {
            return -1;
        }
        return (iCharAt * 10) + iCharAt2;
    }

    private static MonthDay parseMonthDayString(JSONReader jSONReader, String str) {
        int i;
        int i2;
        int length = str.length();
        if (length == 0) {
            throw new JSONException(jSONReader.info("read MonthDay error"));
        }
        if (length == 7 && str.charAt(0) == '-' && str.charAt(1) == '-' && str.charAt(4) == '-') {
            i = parse2(str, 2);
            i2 = parse2(str, 5);
        } else {
            if (length != 5 || str.charAt(2) != '-') {
                throw new JSONException(jSONReader.info("read MonthDay error"));
            }
            i = parse2(str, 0);
            i2 = parse2(str, 3);
        }
        if (i < 0 || i2 < 0) {
            throw new JSONException(jSONReader.info("read MonthDay error"));
        }
        try {
            return MonthDay.of(i, i2);
        } catch (DateTimeException e) {
            throw new JSONException(jSONReader.info("read MonthDay error"), e);
        }
    }

    private static MonthDay readMonthDayFromNumber(JSONReader jSONReader) {
        long int64Value = jSONReader.readInt64Value();
        if (int64Value <= 0) {
            throw new JSONException(jSONReader.info("read MonthDay error"));
        }
        int i = (int) (int64Value / 100);
        int i2 = (int) (int64Value % 100);
        if (i == 0 || i2 == 0) {
            throw new JSONException(jSONReader.info("read MonthDay error"));
        }
        try {
            return MonthDay.of(i, i2);
        } catch (DateTimeException e) {
            throw new JSONException(jSONReader.info("read MonthDay error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public MonthDay readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.isInt()) {
            return readMonthDayFromNumber(jSONReader);
        }
        String string = jSONReader.readString();
        if (string == null || string.isEmpty()) {
            return null;
        }
        return parseMonthDayString(jSONReader, string);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public MonthDay readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.isInt()) {
            return readMonthDayFromNumber(jSONReader);
        }
        String string = jSONReader.readString();
        if (string == null) {
            return null;
        }
        return parseMonthDayString(jSONReader, string);
    }
}
