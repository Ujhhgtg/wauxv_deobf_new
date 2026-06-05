package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class OneOf extends JSONSchema {
    final JSONSchema[] items;

    public OneOf(JSONSchema[] jSONSchemaArr) {
        super(null, null);
        this.items = jSONSchemaArr;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.OneOf;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Object obj) {
        int i = 0;
        for (JSONSchema jSONSchema : this.items) {
            if (jSONSchema.validate(obj).isSuccess() && (i = i + 1) > 1) {
                return JSONSchema.FAIL_ONE_OF;
            }
        }
        return i != 1 ? JSONSchema.FAIL_ONE_OF : JSONSchema.SUCCESS;
    }

    public OneOf(JSONObject jSONObject, JSONSchema jSONSchema) {
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("oneOf");
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
        throw new JSONException("oneOf not found");
    }
}
