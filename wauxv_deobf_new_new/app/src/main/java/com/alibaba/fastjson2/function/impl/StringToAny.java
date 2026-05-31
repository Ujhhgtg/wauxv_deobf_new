package com.alibaba.fastjson2.function.impl;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.IOUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class StringToAny implements Function {
    final Object defaultValue;
    final Class targetClass;

    public StringToAny(Class cls, Object obj) {
        this.targetClass = cls;
        this.defaultValue = obj;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        String str = (String) obj;
        if (str == null || "null".equals(str) || str.isEmpty()) {
            return this.defaultValue;
        }
        Class cls = this.targetClass;
        if (cls == Byte.TYPE || cls == Byte.class) {
            return Byte.valueOf(Byte.parseByte(str));
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return Short.valueOf(Short.parseShort(str));
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return (IOUtils.isNumber(str) || str.length() != 19) ? Long.valueOf(Long.parseLong(str)) : Long.valueOf(DateUtils.parseMillis(str, DateUtils.DEFAULT_ZONE_ID));
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return Float.valueOf(Float.parseFloat(str));
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (cls == Character.TYPE || cls == Character.class) {
            return Character.valueOf(str.charAt(0));
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return Boolean.valueOf("true".equals(str));
        }
        if (cls == BigDecimal.class) {
            return new BigDecimal(str);
        }
        if (cls == BigInteger.class) {
            return new BigInteger(str);
        }
        if (cls == Collections.class || cls == List.class || cls == JSONArray.class) {
            if (str.charAt(0) == '[') {
                return JSON.parseObject(str, this.targetClass);
            }
            if (str.indexOf(44) != -1) {
                return Arrays.asList(str.split(","));
            }
        }
        throw new JSONException("can not convert to " + this.targetClass + ", value : " + str);
    }
}
