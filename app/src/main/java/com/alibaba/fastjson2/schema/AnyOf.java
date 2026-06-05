package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class AnyOf extends JSONSchema {
    final JSONSchema[] items;

    public AnyOf(JSONSchema[] jSONSchemaArr) {
        super(null, null);
        this.items = jSONSchemaArr;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.AnyOf;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONObject toJSONObject() {
        return JSONObject.of("anyOf", (Object) this.items);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Object obj) {
        for (JSONSchema jSONSchema : this.items) {
            ValidateResult validateResultValidate = jSONSchema.validate(obj);
            ValidateResult validateResult = JSONSchema.SUCCESS;
            if (validateResultValidate == validateResult) {
                return validateResult;
            }
        }
        return JSONSchema.FAIL_ANY_OF;
    }

    public AnyOf(JSONObject jSONObject, JSONSchema jSONSchema) {
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("anyOf");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            this.items = new JSONSchema[jSONArray.size()];
            for (int i = 0; i < this.items.length; i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof Boolean) {
                    this.items[i] = ((Boolean) obj).booleanValue() ? Any.INSTANCE : Any.NOT_ANY;
                } else {
                    this.items[i] = JSONSchema.of((JSONObject) obj, jSONSchema);
                }
            }
            return;
        }
        throw new JSONException("anyOf not found");
    }
}
