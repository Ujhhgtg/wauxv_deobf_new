package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.umeng.analytics.pro.g;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import p000.C2389Ujhhgtgfeyxiexzf;
import p000.C2390Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ArraySchema extends JSONSchema {
    final JSONSchema additionalItem;
    final boolean additionalItems;
    final AllOf allOf;
    final AnyOf anyOf;
    final JSONSchema contains;
    final Map<String, JSONSchema> definitions;
    final Map<String, JSONSchema> defs;
    final boolean encoded;
    JSONSchema itemSchema;
    final int maxContains;
    final int maxLength;
    final int minContains;
    final int minLength;
    final OneOf oneOf;
    final JSONSchema[] prefixItems;
    final boolean typed;
    final boolean uniqueItems;

    /* JADX WARN: Code duplicated, block: B:42:0x0102  */
    /* JADX WARN: Code duplicated, block: B:44:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:47:0x0111  */
    /* JADX WARN: Code duplicated, block: B:49:0x0115  */
    /* JADX WARN: Code duplicated, block: B:50:0x011e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:69:0x0150  */
    /* JADX WARN: Code duplicated, block: B:71:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:76:0x0164  */
    public ArraySchema(JSONObject jSONObject, JSONSchema jSONSchema) {
        boolean zBooleanValue;
        JSONSchema jSONSchema2;
        Object obj;
        JSONSchema jSONSchema3;
        JSONSchema jSONSchemaOf;
        JSONSchema jSONSchema4;
        super(jSONObject);
        this.typed = "array".equals(jSONObject.get(g.y));
        this.definitions = new LinkedHashMap();
        this.defs = new LinkedHashMap();
        this.encoded = jSONObject.getBooleanValue("encoded", false);
        JSONObject jSONObject2 = jSONObject.getJSONObject("definitions");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                this.definitions.put(entry.getKey(), JSONSchema.of((JSONObject) entry.getValue(), jSONSchema == null ? this : jSONSchema));
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("$defs");
        if (jSONObject3 != null) {
            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                this.defs.put(entry2.getKey(), JSONSchema.of((JSONObject) entry2.getValue(), jSONSchema == null ? this : jSONSchema));
            }
        }
        this.minLength = jSONObject.getIntValue("minItems", -1);
        this.maxLength = jSONObject.getIntValue("maxItems", -1);
        Object obj2 = jSONObject.get("items");
        Object obj3 = jSONObject.get("additionalItems");
        JSONArray jSONArray = jSONObject.getJSONArray("prefixItems");
        boolean z = true;
        if (obj2 != null) {
            if (obj2 instanceof Boolean) {
                zBooleanValue = ((Boolean) obj2).booleanValue();
                this.itemSchema = null;
            } else if (!(obj2 instanceof JSONArray)) {
                this.itemSchema = JSONSchema.of((JSONObject) obj2, jSONSchema != null ? jSONSchema : this);
            } else {
                if (jSONArray != null) {
                    throw new JSONException("schema error, items : " + obj2);
                }
                jSONArray = (JSONArray) obj2;
                this.itemSchema = null;
            }
            if (obj3 instanceof JSONObject) {
                JSONObject jSONObject4 = (JSONObject) obj3;
                if (jSONSchema == null) {
                    jSONSchema4 = this;
                } else {
                    jSONSchema4 = jSONSchema;
                }
                this.additionalItem = JSONSchema.of(jSONObject4, jSONSchema4);
                zBooleanValue = true;
            } else if (obj3 instanceof Boolean) {
                zBooleanValue = ((Boolean) obj3).booleanValue();
                this.additionalItem = null;
            } else {
                this.additionalItem = null;
            }
            jSONSchema2 = this.itemSchema;
            if ((jSONSchema2 != null || (jSONSchema2 instanceof Any)) && (jSONArray != null || (obj2 instanceof Boolean))) {
            }
            this.additionalItems = z;
            if (jSONArray == null) {
                this.prefixItems = new JSONSchema[0];
            } else {
                this.prefixItems = new JSONSchema[jSONArray.size()];
                for (int i = 0; i < jSONArray.size(); i++) {
                    obj = jSONArray.get(i);
                    if (obj instanceof Boolean) {
                        JSONObject jSONObject5 = (JSONObject) obj;
                        if (jSONSchema == null) {
                            jSONSchema3 = this;
                        } else {
                            jSONSchema3 = jSONSchema;
                        }
                        jSONSchemaOf = JSONSchema.of(jSONObject5, jSONSchema3);
                    } else if (((Boolean) obj).booleanValue()) {
                        jSONSchemaOf = Any.INSTANCE;
                    } else {
                        jSONSchemaOf = Any.NOT_ANY;
                    }
                    this.prefixItems[i] = jSONSchemaOf;
                }
            }
            this.contains = (JSONSchema) jSONObject.getObject("contains", new C2389Ujhhgtgfeyxiexzf(0));
            this.minContains = jSONObject.getIntValue("minContains", -1);
            this.maxContains = jSONObject.getIntValue("maxContains", -1);
            this.uniqueItems = jSONObject.getBooleanValue("uniqueItems");
            this.allOf = JSONSchema.allOf(jSONObject, null);
            this.anyOf = JSONSchema.anyOf(jSONObject, (Class) null);
            this.oneOf = JSONSchema.oneOf(jSONObject, (Class) null);
        }
        this.itemSchema = null;
        zBooleanValue = true;
        if (obj3 instanceof JSONObject) {
            JSONObject jSONObject6 = (JSONObject) obj3;
            if (jSONSchema == null) {
                jSONSchema4 = this;
            } else {
                jSONSchema4 = jSONSchema;
            }
            this.additionalItem = JSONSchema.of(jSONObject6, jSONSchema4);
            zBooleanValue = true;
        } else if (obj3 instanceof Boolean) {
            zBooleanValue = ((Boolean) obj3).booleanValue();
            this.additionalItem = null;
        } else {
            this.additionalItem = null;
        }
        jSONSchema2 = this.itemSchema;
        z = jSONSchema2 != null ? zBooleanValue : zBooleanValue;
        this.additionalItems = z;
        if (jSONArray == null) {
            this.prefixItems = new JSONSchema[0];
        } else {
            this.prefixItems = new JSONSchema[jSONArray.size()];
            while (i < jSONArray.size()) {
                obj = jSONArray.get(i);
                if (obj instanceof Boolean) {
                    JSONObject jSONObject7 = (JSONObject) obj;
                    if (jSONSchema == null) {
                        jSONSchema3 = this;
                    } else {
                        jSONSchema3 = jSONSchema;
                    }
                    jSONSchemaOf = JSONSchema.of(jSONObject7, jSONSchema3);
                } else if (((Boolean) obj).booleanValue()) {
                    jSONSchemaOf = Any.INSTANCE;
                } else {
                    jSONSchemaOf = Any.NOT_ANY;
                }
                this.prefixItems[i] = jSONSchemaOf;
            }
        }
        this.contains = (JSONSchema) jSONObject.getObject("contains", new C2389Ujhhgtgfeyxiexzf(0));
        this.minContains = jSONObject.getIntValue("minContains", -1);
        this.maxContains = jSONObject.getIntValue("maxContains", -1);
        this.uniqueItems = jSONObject.getBooleanValue("uniqueItems");
        this.allOf = JSONSchema.allOf(jSONObject, null);
        this.anyOf = JSONSchema.anyOf(jSONObject, (Class) null);
        this.oneOf = JSONSchema.oneOf(jSONObject, (Class) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$validateInternal$0(Object[] objArr, int i) {
        return objArr[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$validateInternal$2(Iterator it, int i) {
        return it.next();
    }

    private ValidateResult validateItems(Object obj, int i, IntFunction<Object> intFunction) {
        JSONSchema jSONSchema;
        int i2 = this.minLength;
        if (i2 >= 0 && i < i2) {
            return new ValidateResult(false, "minLength not match, expect >= %s, but %s", Integer.valueOf(i2), Integer.valueOf(i));
        }
        int i3 = this.maxLength;
        if (i3 >= 0 && i > i3) {
            return new ValidateResult(false, "maxLength not match, expect <= %s, but %s", Integer.valueOf(i3), Integer.valueOf(i));
        }
        if (!this.additionalItems) {
            JSONSchema[] jSONSchemaArr = this.prefixItems;
            if (i > jSONSchemaArr.length) {
                return new ValidateResult(false, "additional items not match, max size %s, but %s", Integer.valueOf(jSONSchemaArr.length), Integer.valueOf(i));
            }
        }
        boolean z = obj instanceof Collection;
        HashSet hashSet = null;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object objApply = intFunction.apply(i5);
            JSONSchema[] jSONSchemaArr2 = this.prefixItems;
            if (i5 < jSONSchemaArr2.length) {
                ValidateResult validateResultValidate = jSONSchemaArr2[i5].validate(objApply);
                if (!validateResultValidate.isSuccess()) {
                    return validateResultValidate;
                }
            } else {
                if (z && this.itemSchema == null && (jSONSchema = this.additionalItem) != null) {
                    ValidateResult validateResultValidate2 = jSONSchema.validate(objApply);
                    if (!validateResultValidate2.isSuccess()) {
                        return validateResultValidate2;
                    }
                }
                JSONSchema jSONSchema2 = this.itemSchema;
                if (jSONSchema2 != null) {
                    ValidateResult validateResultValidate3 = jSONSchema2.validate(objApply);
                    if (!validateResultValidate3.isSuccess()) {
                        return validateResultValidate3;
                    }
                }
            }
            JSONSchema jSONSchema3 = this.contains;
            if (jSONSchema3 != null && ((this.minContains > 0 || this.maxContains > 0 || i4 == 0) && jSONSchema3.validate(objApply) == JSONSchema.SUCCESS)) {
                i4++;
            }
            if (this.uniqueItems) {
                if (hashSet == null) {
                    hashSet = new HashSet(i, 1.0f);
                }
                if (objApply instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) objApply;
                    objApply = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
                }
                if (!hashSet.add(objApply)) {
                    return JSONSchema.UNIQUE_ITEMS_NOT_MATCH;
                }
            }
        }
        if (!z || this.contains != null) {
            int i6 = this.minContains;
            if (i6 >= 0 && i4 < i6) {
                return new ValidateResult(false, "minContains not match, expect %s, but %s", Integer.valueOf(i6), Integer.valueOf(i4));
            }
            if (z) {
                if (i4 == 0 && i6 != 0) {
                    return JSONSchema.CONTAINS_NOT_MATCH;
                }
            } else if (this.contains != null && i4 == 0) {
                return JSONSchema.CONTAINS_NOT_MATCH;
            }
            int i7 = this.maxContains;
            if (i7 >= 0 && i4 > i7) {
                return new ValidateResult(false, "maxContains not match, expect %s, but %s", Integer.valueOf(i7), Integer.valueOf(i4));
            }
        }
        AllOf allOf = this.allOf;
        if (allOf != null) {
            ValidateResult validateResultValidate4 = allOf.validate(obj);
            if (!validateResultValidate4.isSuccess()) {
                return validateResultValidate4;
            }
        }
        AnyOf anyOf = this.anyOf;
        if (anyOf != null) {
            ValidateResult validateResultValidate5 = anyOf.validate(obj);
            if (!validateResultValidate5.isSuccess()) {
                return validateResultValidate5;
            }
        }
        OneOf oneOf = this.oneOf;
        if (oneOf != null) {
            ValidateResult validateResultValidate6 = oneOf.validate(obj);
            if (!validateResultValidate6.isSuccess()) {
                return validateResultValidate6;
            }
        }
        return JSONSchema.SUCCESS;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public void accept(Predicate<JSONSchema> predicate) {
        JSONSchema jSONSchema;
        if (!predicate.test(this) || (jSONSchema = this.itemSchema) == null) {
            return;
        }
        jSONSchema.accept(predicate);
    }

    public JSONSchema getItemSchema() {
        return this.itemSchema;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.Array;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(g.y, "array");
        int i = this.maxLength;
        if (i != -1) {
            jSONObject.put("maxLength", Integer.valueOf(i));
        }
        int i2 = this.minLength;
        if (i2 != -1) {
            jSONObject.put("minLength", Integer.valueOf(i2));
        }
        JSONSchema jSONSchema = this.itemSchema;
        if (jSONSchema != null) {
            jSONObject.put("items", jSONSchema);
        }
        JSONSchema[] jSONSchemaArr = this.prefixItems;
        if (jSONSchemaArr != null && jSONSchemaArr.length != 0) {
            jSONObject.put("prefixItems", jSONSchemaArr);
        }
        boolean z = this.additionalItems;
        if (!z) {
            jSONObject.put("additionalItems", Boolean.valueOf(z));
        }
        JSONSchema jSONSchema2 = this.additionalItem;
        if (jSONSchema2 != null) {
            jSONObject.put("additionalItem", jSONSchema2);
        }
        JSONSchema jSONSchema3 = this.contains;
        if (jSONSchema3 != null) {
            jSONObject.put("contains", jSONSchema3);
        }
        int i3 = this.minContains;
        if (i3 != -1) {
            jSONObject.put("minContains", Integer.valueOf(i3));
        }
        int i4 = this.maxContains;
        if (i4 != -1) {
            jSONObject.put("maxContains", Integer.valueOf(i4));
        }
        boolean z2 = this.uniqueItems;
        if (z2) {
            jSONObject.put("uniqueItems", Boolean.valueOf(z2));
        }
        return JSONSchema.injectIfPresent(jSONObject, this.allOf, this.anyOf, this.oneOf);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Object obj) {
        if (obj == null) {
            return this.typed ? JSONSchema.FAIL_INPUT_NULL : JSONSchema.SUCCESS;
        }
        if (this.encoded) {
            if (!(obj instanceof String)) {
                return JSONSchema.FAIL_INPUT_NOT_ENCODED;
            }
            try {
                obj = JSON.parseArray((String) obj);
            } catch (JSONException unused) {
                return JSONSchema.FAIL_INPUT_NOT_ENCODED;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            return validateItems(obj, objArr.length, new C2390Ujhhgtgfeyxiexzf(0, objArr));
        }
        if (obj.getClass().isArray()) {
            return validateItems(obj, Array.getLength(obj), new C2390Ujhhgtgfeyxiexzf(1, obj));
        }
        if (!(obj instanceof Collection)) {
            return this.typed ? JSONSchema.FAIL_TYPE_NOT_MATCH : JSONSchema.SUCCESS;
        }
        Collection collection = (Collection) obj;
        return validateItems(obj, collection.size(), new C2390Ujhhgtgfeyxiexzf(2, collection.iterator()));
    }
}
