package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.TypeUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumSchema extends JSONSchema {
    final Set<Object> items;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.math.BigInteger] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Integer] */
    public EnumSchema(Object... objArr) {
        super(null, null);
        this.items = new LinkedHashSet(objArr.length);
        for (Object bigDecimal : objArr) {
            if (bigDecimal instanceof BigDecimal) {
                BigDecimal bigDecimal2 = (BigDecimal) bigDecimal;
                bigDecimal = bigDecimal2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal2.stripTrailingZeros();
                if (bigDecimal.scale() == 0) {
                    bigDecimal = bigDecimal.toBigInteger();
                    if (bigDecimal.compareTo(TypeUtils.BIGINT_INT32_MIN) >= 0 && bigDecimal.compareTo(TypeUtils.BIGINT_INT32_MAX) <= 0) {
                        bigDecimal = Integer.valueOf(bigDecimal.intValue());
                    } else if (bigDecimal.compareTo(TypeUtils.BIGINT_INT64_MIN) >= 0 && bigDecimal.compareTo(TypeUtils.BIGINT_INT64_MAX) <= 0) {
                        bigDecimal = Long.valueOf(bigDecimal.longValue());
                    }
                }
            }
            this.items.add(bigDecimal);
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.Enum;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Object obj) {
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
            long jLongValue = bigDecimal.longValue();
            if (bigDecimal.compareTo(BigDecimal.valueOf(jLongValue)) == 0) {
                obj = Long.valueOf(jLongValue);
            } else {
                obj = bigDecimal.scale() == 0 ? bigDecimal.unscaledValue() : bigDecimal2;
            }
        } else if (obj instanceof BigInteger) {
            BigInteger bigInteger = (BigInteger) obj;
            if (bigInteger.compareTo(TypeUtils.BIGINT_INT64_MIN) >= 0 && bigInteger.compareTo(TypeUtils.BIGINT_INT64_MAX) <= 0) {
                obj = Long.valueOf(bigInteger.longValue());
            }
        }
        if (obj instanceof Long) {
            long jLongValue2 = ((Long) obj).longValue();
            if (jLongValue2 >= -2147483648L && jLongValue2 <= 2147483647L) {
                obj = Integer.valueOf((int) jLongValue2);
            }
        }
        if (this.items.contains(obj)) {
            return JSONSchema.SUCCESS;
        }
        return obj == null ? JSONSchema.FAIL_INPUT_NULL : new ValidateResult(false, "expect type %s, but %s", JSONSchema.Type.Enum, obj.getClass());
    }
}
