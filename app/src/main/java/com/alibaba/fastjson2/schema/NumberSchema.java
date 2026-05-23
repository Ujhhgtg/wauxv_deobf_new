package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.umeng.analytics.pro.g;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NumberSchema extends JSONSchema {
    final boolean exclusiveMaximum;
    final boolean exclusiveMinimum;
    final BigDecimal maximum;
    final long maximumLongValue;
    final BigDecimal minimum;
    final long minimumLongValue;
    final BigDecimal multipleOf;
    final long multipleOfLongValue;
    final boolean typed;

    public NumberSchema(JSONObject jSONObject) {
        super(jSONObject);
        this.typed = "number".equals(jSONObject.get("type"));
        Object obj = jSONObject.get("exclusiveMinimum");
        BigDecimal bigDecimal = jSONObject.getBigDecimal("minimum");
        Boolean bool = Boolean.TRUE;
        if (obj == bool) {
            this.minimum = bigDecimal;
            this.exclusiveMinimum = true;
        } else if (obj instanceof Number) {
            this.minimum = jSONObject.getBigDecimal("exclusiveMinimum");
            this.exclusiveMinimum = true;
        } else {
            this.minimum = bigDecimal;
            this.exclusiveMinimum = false;
        }
        BigDecimal bigDecimal2 = this.minimum;
        if (bigDecimal2 == null || bigDecimal2.compareTo(BigDecimal.valueOf(bigDecimal2.longValue())) != 0) {
            this.minimumLongValue = -9223372036854775808L;
        } else {
            this.minimumLongValue = this.minimum.longValue();
        }
        BigDecimal bigDecimal3 = jSONObject.getBigDecimal("maximum");
        Object obj2 = jSONObject.get("exclusiveMaximum");
        if (obj2 == bool) {
            this.maximum = bigDecimal3;
            this.exclusiveMaximum = true;
        } else if (obj2 instanceof Number) {
            this.maximum = jSONObject.getBigDecimal("exclusiveMaximum");
            this.exclusiveMaximum = true;
        } else {
            this.maximum = bigDecimal3;
            this.exclusiveMaximum = false;
        }
        BigDecimal bigDecimal4 = this.maximum;
        if (bigDecimal4 == null || bigDecimal4.compareTo(BigDecimal.valueOf(bigDecimal4.longValue())) != 0) {
            this.maximumLongValue = -9223372036854775808L;
        } else {
            this.maximumLongValue = this.maximum.longValue();
        }
        BigDecimal bigDecimal5 = jSONObject.getBigDecimal("multipleOf");
        this.multipleOf = bigDecimal5;
        if (bigDecimal5 == null) {
            this.multipleOfLongValue = -9223372036854775808L;
            return;
        }
        long jLongValue = bigDecimal5.longValue();
        if (bigDecimal5.compareTo(BigDecimal.valueOf(jLongValue)) == 0) {
            this.multipleOfLongValue = jLongValue;
        } else {
            this.multipleOfLongValue = -9223372036854775808L;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.Number;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONObject toJSONObject() {
        JSONObject jSONObjectOf = JSONObject.of("type", (Object) "number");
        long j = this.minimumLongValue;
        if (j != -9223372036854775808L) {
            jSONObjectOf.put(this.exclusiveMinimum ? "exclusiveMinimum" : "minimum", Long.valueOf(j));
        } else {
            BigDecimal bigDecimal = this.minimum;
            if (bigDecimal != null) {
                jSONObjectOf.put(this.exclusiveMinimum ? "exclusiveMinimum" : "minimum", bigDecimal);
            }
        }
        long j2 = this.maximumLongValue;
        if (j2 != -9223372036854775808L) {
            jSONObjectOf.put(this.exclusiveMaximum ? "exclusiveMaximum" : "maximum", Long.valueOf(j2));
        } else {
            BigDecimal bigDecimal2 = this.maximum;
            if (bigDecimal2 != null) {
                jSONObjectOf.put(this.exclusiveMaximum ? "exclusiveMaximum" : "maximum", bigDecimal2);
            }
        }
        long j3 = this.multipleOfLongValue;
        if (j3 != -9223372036854775808L) {
            jSONObjectOf.put("multipleOf", Long.valueOf(j3));
            return jSONObjectOf;
        }
        BigDecimal bigDecimal3 = this.multipleOf;
        if (bigDecimal3 != null) {
            jSONObjectOf.put("multipleOf", bigDecimal3);
        }
        return jSONObjectOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0086, code lost:
    
        if (r4.exclusiveMaximum == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0088, code lost:
    
        r1 = "exclusiveMaximum not match, expect < %s, but %s";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008b, code lost:
    
        r1 = "maximum not match, expect <= %s, but %s";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0096, code lost:
    
        return new com.alibaba.fastjson2.schema.ValidateResult(false, r1, r4.maximum, r5);
     */
    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ValidateResult validateInternal(Object obj) {
        BigDecimal bigDecimal;
        if (obj == null) {
            return this.typed ? JSONSchema.FAIL_INPUT_NULL : JSONSchema.SUCCESS;
        }
        if (!(obj instanceof Number)) {
            return this.typed ? JSONSchema.FAIL_TYPE_NOT_MATCH : JSONSchema.SUCCESS;
        }
        Number number = (Number) obj;
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return validate(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return validate(number.doubleValue());
        }
        if (number instanceof BigInteger) {
            bigDecimal = new BigDecimal((BigInteger) number);
        } else {
            if (!(number instanceof BigDecimal)) {
                return new ValidateResult(false, "expect type %s, but %s", JSONSchema.Type.Number, obj.getClass());
            }
            bigDecimal = (BigDecimal) number;
        }
        BigDecimal bigDecimal2 = this.minimum;
        if (bigDecimal2 != null && (!this.exclusiveMinimum ? bigDecimal2.compareTo(bigDecimal) <= 0 : bigDecimal2.compareTo(bigDecimal) < 0)) {
            return new ValidateResult(false, this.exclusiveMinimum ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", this.minimum, obj);
        }
        BigDecimal bigDecimal3 = this.maximum;
        if (bigDecimal3 != null) {
            if (this.exclusiveMaximum) {
            }
        }
        BigDecimal bigDecimal4 = this.multipleOf;
        return (bigDecimal4 == null || bigDecimal.divideAndRemainder(bigDecimal4)[1].abs().compareTo(BigDecimal.ZERO) <= 0) ? JSONSchema.SUCCESS : new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", this.multipleOf, bigDecimal);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Integer num) {
        if (num == null) {
            return JSONSchema.SUCCESS;
        }
        return validate(num.longValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Float f) {
        if (f == null) {
            return JSONSchema.SUCCESS;
        }
        return validate(f.doubleValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Double d) {
        if (d == null) {
            return JSONSchema.SUCCESS;
        }
        return validate(d.doubleValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Long l) {
        if (l == null) {
            return JSONSchema.SUCCESS;
        }
        return validate(l.longValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        if (r7 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        r8 = "exclusiveMaximum not match, expect < %s, but %s";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        return new com.alibaba.fastjson2.schema.ValidateResult(false, r8, r4, java.lang.Long.valueOf(r11));
     */
    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ValidateResult validateInternal(long j) {
        BigDecimal bigDecimalValueOf;
        BigDecimal bigDecimal = this.minimum;
        if (bigDecimal != null) {
            long j2 = this.minimumLongValue;
            if (j2 != -9223372036854775808L) {
                boolean z = this.exclusiveMinimum;
                if (!z ? j < j2 : j <= j2) {
                    return new ValidateResult(false, z ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", bigDecimal, Long.valueOf(j));
                }
                bigDecimalValueOf = null;
            } else {
                bigDecimalValueOf = BigDecimal.valueOf(j);
                if (!this.exclusiveMinimum ? this.minimum.compareTo(bigDecimalValueOf) > 0 : this.minimum.compareTo(bigDecimalValueOf) >= 0) {
                    return new ValidateResult(false, this.exclusiveMinimum ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", this.minimum, Long.valueOf(j));
                }
            }
        } else {
            bigDecimalValueOf = null;
        }
        BigDecimal bigDecimal2 = this.maximum;
        if (bigDecimal2 != null) {
            long j3 = this.maximumLongValue;
            String str = "maximum not match, expect <= %s, but %s";
            if (j3 == -9223372036854775808L) {
                if (bigDecimalValueOf == null) {
                    bigDecimalValueOf = BigDecimal.valueOf(j);
                }
                if (!this.exclusiveMaximum ? this.maximum.compareTo(bigDecimalValueOf) < 0 : this.maximum.compareTo(bigDecimalValueOf) <= 0) {
                    return new ValidateResult(false, this.exclusiveMaximum ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", this.maximum, Long.valueOf(j));
                }
            } else if ((r7 = this.exclusiveMaximum)) {
            }
        }
        BigDecimal bigDecimal3 = this.multipleOf;
        if (bigDecimal3 != null) {
            long j4 = this.multipleOfLongValue;
            if (j4 != -9223372036854775808L && j % j4 != 0) {
                return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", bigDecimal3, bigDecimalValueOf);
            }
            if (bigDecimalValueOf == null) {
                bigDecimalValueOf = BigDecimal.valueOf(j);
            }
            if (bigDecimalValueOf.divideAndRemainder(this.multipleOf)[1].abs().compareTo(BigDecimal.ZERO) > 0) {
                return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", this.multipleOf, Long.valueOf(j));
            }
        }
        return JSONSchema.SUCCESS;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(double d) {
        BigDecimal bigDecimal = this.minimum;
        if (bigDecimal != null) {
            long j = this.minimumLongValue;
            if (j != -9223372036854775808L) {
                boolean z = this.exclusiveMinimum;
                double d2 = j;
                if (!z ? d < d2 : d <= d2) {
                    return new ValidateResult(false, z ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", bigDecimal, Double.valueOf(d));
                }
            } else {
                double dDoubleValue = bigDecimal.doubleValue();
                boolean z2 = this.exclusiveMinimum;
                if (!z2 ? d < dDoubleValue : d <= dDoubleValue) {
                    return new ValidateResult(false, z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", this.minimum, Double.valueOf(d));
                }
            }
        }
        BigDecimal bigDecimal2 = this.maximum;
        if (bigDecimal2 != null) {
            long j2 = this.maximumLongValue;
            if (j2 != -9223372036854775808L) {
                boolean z3 = this.exclusiveMaximum;
                double d3 = j2;
                if (!z3 ? d > d3 : d >= d3) {
                    return new ValidateResult(false, z3 ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", bigDecimal2, Double.valueOf(d));
                }
            } else {
                double dDoubleValue2 = bigDecimal2.doubleValue();
                boolean z4 = this.exclusiveMaximum;
                if (!z4 ? d > dDoubleValue2 : d >= dDoubleValue2) {
                    return new ValidateResult(false, z4 ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", this.maximum, Double.valueOf(d));
                }
            }
        }
        BigDecimal bigDecimal3 = this.multipleOf;
        if (bigDecimal3 != null) {
            long j3 = this.multipleOfLongValue;
            if (j3 != -9223372036854775808L && d % j3 != 0.0d) {
                return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", bigDecimal3, Double.valueOf(d));
            }
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
            if (bigDecimalValueOf.divideAndRemainder(this.multipleOf)[1].abs().compareTo(BigDecimal.ZERO) > 0) {
                return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", this.multipleOf, bigDecimalValueOf);
            }
        }
        return JSONSchema.SUCCESS;
    }
}
