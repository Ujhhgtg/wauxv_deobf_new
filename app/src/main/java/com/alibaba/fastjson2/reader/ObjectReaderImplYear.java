package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.Year;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplYear extends ObjectReaderPrimitive<Year> {
    static final ObjectReaderImplYear INSTANCE = new ObjectReaderImplYear();

    public ObjectReaderImplYear() {
        super(Year.class);
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

    private static Year parseYearString(JSONReader jSONReader, String str) {
        int length = str.length();
        if (length == 0) {
            throw new JSONException(jSONReader.info("read Year error"));
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        int i2 = 1;
        if (cCharAt == '+' || cCharAt == '-') {
            i2 = cCharAt == '-' ? -1 : 1;
            i = 1;
        }
        if (length - i != 4) {
            throw new JSONException(jSONReader.info("read Year error"));
        }
        int i3 = parse4(str, i);
        if (i3 < 0) {
            throw new JSONException(jSONReader.info("read Year error"));
        }
        try {
            return Year.of(i3 * i2);
        } catch (DateTimeException e) {
            throw new JSONException(jSONReader.info("read Year error"), e);
        }
    }

    private static Year readYearFromNumber(JSONReader jSONReader) {
        long int64Value = jSONReader.readInt64Value();
        if (int64Value < -999999999 || int64Value > 999999999) {
            throw new JSONException(jSONReader.info("read Year error"));
        }
        return Year.of((int) int64Value);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Year readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.isInt()) {
            return readYearFromNumber(jSONReader);
        }
        String string = jSONReader.readString();
        if (string == null || string.isEmpty()) {
            return null;
        }
        return parseYearString(jSONReader, string);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Year readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.isInt()) {
            return readYearFromNumber(jSONReader);
        }
        String string = jSONReader.readString();
        if (string == null) {
            return null;
        }
        return parseYearString(jSONReader, string);
    }
}
