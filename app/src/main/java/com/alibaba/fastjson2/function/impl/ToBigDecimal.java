package com.alibaba.fastjson2.function.impl;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.TypeUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import p000.AbstractC3317feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ToBigDecimal implements Function {
    @Override // java.util.function.Function
    public Object apply(Object obj) {
        if (obj == null || (obj instanceof BigDecimal)) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong)) {
            return BigDecimal.valueOf(((Number) obj).longValue());
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return TypeUtils.toBigDecimal(((Number) obj).doubleValue());
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        if (obj instanceof String) {
            return new BigDecimal((String) obj);
        }
        throw new JSONException(AbstractC3317feyxiexzfUjhhgtg.m4799Ujhhgtgfeyxiexzf(obj, new StringBuilder("can not cast to BigDecimal ")));
    }
}
