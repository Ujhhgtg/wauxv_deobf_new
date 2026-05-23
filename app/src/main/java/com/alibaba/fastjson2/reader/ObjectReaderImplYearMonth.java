package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.YearMonth;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplYearMonth extends ObjectReaderPrimitive<YearMonth> {
    static final ObjectReaderImplYearMonth INSTANCE = new ObjectReaderImplYearMonth();

    public ObjectReaderImplYearMonth() {
        super(YearMonth.class);
    }

    private static int parse2(String str, int i) {
        int iCharAt = str.charAt(i) - '0';
        int iCharAt2 = str.charAt(i + 1) - '0';
        if ((iCharAt | iCharAt2) < 0 || iCharAt > 9 || iCharAt2 > 9) {
            return -1;
        }
        return (iCharAt * 10) + iCharAt2;
    }

    private static int parse4(String str, int i) {
        int iCharAt = str.charAt(i) - '0';
        int iCharAt2 = str.charAt(i + 1) - '0';
        int iCharAt3 = str.charAt(i + 2) - '0';
        int iCharAt4 = str.charAt(i + 3) - '0';
        if ((iCharAt | iCharAt2 | iCharAt3 | iCharAt4) < 0 || iCharAt > 9 || iCharAt2 > 9 || iCharAt3 > 9 || iCharAt4 > 9) {
            return -1;
        }
        return AbstractC2784.m4736(iCharAt3, 10, (iCharAt2 * 100) + (iCharAt * 1000), iCharAt4);
    }

    private static YearMonth parseYearMonthString(JSONReader jSONReader, String str) {
        int i;
        int i2;
        int length = str.length();
        if (length == 0) {
            throw new JSONException(jSONReader.info("read YearMonth error"));
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = 1;
        if (cCharAt == '+' || cCharAt == '-') {
            i4 = cCharAt == '-' ? -1 : 1;
            i3 = 1;
        }
        int i5 = length - i3;
        if (i5 == 7 && str.charAt(i3 + 4) == '-') {
            i = parse4(str, i3);
            i2 = parse2(str, i3 + 5);
        } else {
            if (i5 != 6) {
                throw new JSONException(jSONReader.info("read YearMonth error"));
            }
            i = parse4(str, i3);
            i2 = parse2(str, i3 + 4);
        }
        if (i < 0 || i2 < 0) {
            throw new JSONException(jSONReader.info("read YearMonth error"));
        }
        try {
            return YearMonth.of(i * i4, i2);
        } catch (DateTimeException e) {
            throw new JSONException(jSONReader.info("read YearMonth error"), e);
        }
    }

    private static YearMonth readYearMonthFromNumber(JSONReader jSONReader) {
        int i;
        long int64Value = jSONReader.readInt64Value();
        if (int64Value < 0) {
            int64Value = -int64Value;
            i = -1;
        } else {
            i = 1;
        }
        if (int64Value < 100000 || int64Value > 999999) {
            throw new JSONException(jSONReader.info("read YearMonth error"));
        }
        try {
            return YearMonth.of(((int) (int64Value / 100)) * i, (int) (int64Value % 100));
        } catch (DateTimeException e) {
            throw new JSONException(jSONReader.info("read YearMonth error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public YearMonth readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.isInt()) {
            return readYearMonthFromNumber(jSONReader);
        }
        String string = jSONReader.readString();
        if (string == null || string.isEmpty()) {
            return null;
        }
        return parseYearMonthString(jSONReader, string);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public YearMonth readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.isInt()) {
            return readYearMonthFromNumber(jSONReader);
        }
        String string = jSONReader.readString();
        if (string == null) {
            return null;
        }
        return parseYearMonthString(jSONReader, string);
    }
}
