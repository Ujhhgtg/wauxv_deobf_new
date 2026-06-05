package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.TypeUtils;
import com.umeng.analytics.pro.g;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class IntegerSchema extends JSONSchema {
    final Long constValue;
    final boolean exclusiveMaximum;
    final boolean exclusiveMinimum;
    final long maximum;
    final long minimum;
    final long multipleOf;
    final boolean typed;

    public IntegerSchema(JSONObject jSONObject) {
        super(jSONObject);
        this.typed = "integer".equalsIgnoreCase(jSONObject.getString(g.y)) || jSONObject.getBooleanValue("required");
        Object obj = jSONObject.get("exclusiveMinimum");
        long longValue = jSONObject.getLongValue("minimum", Long.MIN_VALUE);
        Boolean bool = Boolean.TRUE;
        if (obj == bool) {
            this.exclusiveMinimum = true;
            this.minimum = longValue;
        } else if (obj instanceof Number) {
            this.exclusiveMinimum = true;
            this.minimum = jSONObject.getLongValue("exclusiveMinimum");
        } else {
            this.minimum = longValue;
            this.exclusiveMinimum = false;
        }
        long longValue2 = jSONObject.getLongValue("maximum", Long.MIN_VALUE);
        Object obj2 = jSONObject.get("exclusiveMaximum");
        if (obj2 == bool) {
            this.exclusiveMaximum = true;
            this.maximum = longValue2;
        } else if (obj2 instanceof Number) {
            this.exclusiveMaximum = true;
            this.maximum = jSONObject.getLongValue("exclusiveMaximum");
        } else {
            this.exclusiveMaximum = false;
            this.maximum = longValue2;
        }
        this.multipleOf = jSONObject.getLongValue("multipleOf", 0L);
        this.constValue = jSONObject.getLong("const");
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.Integer;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(g.y, "integer");
        long j = this.minimum;
        if (j != Long.MIN_VALUE) {
            jSONObject.put(this.exclusiveMinimum ? "exclusiveMinimum" : "minimum", Long.valueOf(j));
        }
        long j2 = this.maximum;
        if (j2 != Long.MIN_VALUE) {
            jSONObject.put(this.exclusiveMaximum ? "exclusiveMaximum" : "maximum", Long.valueOf(j2));
        }
        long j3 = this.multipleOf;
        if (j3 != 0) {
            jSONObject.put("multipleOf", Long.valueOf(j3));
        }
        Long l = this.constValue;
        if (l != null) {
            jSONObject.put("const", l);
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        if (r11.constValue.longValue() == java.lang.Long.parseLong(r1)) goto L68;
     */
    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ValidateResult validateInternal(Object obj) {
        boolean z;
        boolean z2;
        if (obj == null) {
            return this.typed ? JSONSchema.FAIL_INPUT_NULL : JSONSchema.SUCCESS;
        }
        Class<?> cls = obj.getClass();
        if (cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) {
            boolean zIsInt64 = cls == BigInteger.class ? TypeUtils.isInt64((BigInteger) obj) : true;
            long jLongValue = ((Number) obj).longValue();
            long j = this.minimum;
            if (j != Long.MIN_VALUE && (!(z2 = this.exclusiveMinimum) ? jLongValue >= j : jLongValue > j)) {
                return new ValidateResult(false, z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", Long.valueOf(j), obj);
            }
            long j2 = this.maximum;
            if (j2 != Long.MIN_VALUE && (!(z = this.exclusiveMaximum) ? jLongValue <= j2 : jLongValue < j2)) {
                return new ValidateResult(false, z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", Long.valueOf(j2), obj);
            }
            long j3 = this.multipleOf;
            if (j3 != 0 && jLongValue % j3 != 0) {
                return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", Long.valueOf(j3), obj);
            }
            Long l = this.constValue;
            return (l == null || (l.longValue() == jLongValue && zIsInt64)) ? JSONSchema.SUCCESS : new ValidateResult(false, "const not match, expect %s, but %s", this.constValue, obj);
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            if (TypeUtils.isInteger(bigDecimal)) {
                BigInteger bigInteger = bigDecimal.toBigInteger();
                return (this.constValue == null || (TypeUtils.isInt64(bigInteger) && this.constValue.longValue() == bigInteger.longValue())) ? JSONSchema.SUCCESS : new ValidateResult(false, "const not match, expect %s, but %s", this.constValue, obj);
            }
            Long l2 = this.constValue;
            if (l2 != null) {
                return new ValidateResult(false, "const not match, expect %s, but %s", l2, obj);
            }
        }
        if (this.constValue != null) {
            if (obj instanceof Float) {
                if (this.constValue.longValue() != ((Float) obj).floatValue()) {
                    return new ValidateResult(false, "const not match, expect %s, but %s", this.constValue, obj);
                }
            } else if (obj instanceof Double) {
                if (this.constValue.longValue() != ((Double) obj).doubleValue()) {
                    return new ValidateResult(false, "const not match, expect %s, but %s", this.constValue, obj);
                }
            } else if (obj instanceof String) {
                String str = (String) obj;
                if (TypeUtils.isInteger(str) && str.length() < 21) {
                }
                return new ValidateResult(false, "const not match, expect %s, but %s", this.constValue, obj);
            }
        }
        return this.typed ? new ValidateResult(false, "expect type %s, but %s", JSONSchema.Type.Integer, cls) : JSONSchema.SUCCESS;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(long j) {
        boolean z;
        boolean z2;
        long j2 = this.minimum;
        if (j2 != Long.MIN_VALUE && (!(z2 = this.exclusiveMinimum) ? j < j2 : j <= j2)) {
            return new ValidateResult(false, z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", Long.valueOf(j2), Long.valueOf(j));
        }
        long j3 = this.maximum;
        if (j3 != Long.MIN_VALUE && (!(z = this.exclusiveMaximum) ? j > j3 : j >= j3)) {
            return new ValidateResult(false, z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", Long.valueOf(j3), Long.valueOf(j));
        }
        long j4 = this.multipleOf;
        if (j4 != 0 && j % j4 != 0) {
            return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", Long.valueOf(j4), Long.valueOf(j));
        }
        Long l = this.constValue;
        if (l != null && l.longValue() != j) {
            return new ValidateResult(false, "const not match, expect %s, but %s", this.constValue, Long.valueOf(j));
        }
        return JSONSchema.SUCCESS;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Long l) {
        boolean z;
        boolean z2;
        if (l == null) {
            return this.typed ? JSONSchema.FAIL_INPUT_NULL : JSONSchema.SUCCESS;
        }
        long jLongValue = l.longValue();
        long j = this.minimum;
        if (j != Long.MIN_VALUE && (!(z2 = this.exclusiveMinimum) ? jLongValue < j : jLongValue <= j)) {
            return new ValidateResult(false, z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", Long.valueOf(j), l);
        }
        long j2 = this.maximum;
        if (j2 != Long.MIN_VALUE && (!(z = this.exclusiveMaximum) ? jLongValue > j2 : jLongValue >= j2)) {
            return new ValidateResult(false, z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", Long.valueOf(j2), l);
        }
        long j3 = this.multipleOf;
        if (j3 != 0 && jLongValue % j3 != 0) {
            return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", Long.valueOf(j3), l);
        }
        Long l2 = this.constValue;
        if (l2 != null && l2.longValue() != jLongValue) {
            return new ValidateResult(false, "const not match, expect %s, but %s", this.constValue, l);
        }
        return JSONSchema.SUCCESS;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Integer num) {
        boolean z;
        boolean z2;
        if (num == null) {
            return this.typed ? JSONSchema.FAIL_INPUT_NULL : JSONSchema.SUCCESS;
        }
        long jLongValue = num.longValue();
        long j = this.minimum;
        if (j != Long.MIN_VALUE && (!(z2 = this.exclusiveMinimum) ? jLongValue < j : jLongValue <= j)) {
            return new ValidateResult(false, z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", Long.valueOf(j), num);
        }
        long j2 = this.maximum;
        if (j2 != Long.MIN_VALUE && (!(z = this.exclusiveMaximum) ? jLongValue > j2 : jLongValue >= j2)) {
            return new ValidateResult(false, z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", Long.valueOf(j2), num);
        }
        long j3 = this.multipleOf;
        if (j3 != 0 && jLongValue % j3 != 0) {
            return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", Long.valueOf(j3), Long.valueOf(jLongValue));
        }
        Long l = this.constValue;
        if (l != null && l.longValue() != jLongValue) {
            return new ValidateResult(false, "const not match, expect %s, but %s", this.constValue, num);
        }
        return JSONSchema.SUCCESS;
    }
}
