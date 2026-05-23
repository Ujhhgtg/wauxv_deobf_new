package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.umeng.analytics.pro.g;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class BooleanSchema extends JSONSchema {
    public BooleanSchema(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.Boolean;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONObject toJSONObject() {
        return JSONObject.of("type", (Object) "boolean");
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Object obj) {
        if (obj == null) {
            return JSONSchema.FAIL_INPUT_NULL;
        }
        return obj instanceof Boolean ? JSONSchema.SUCCESS : new ValidateResult(false, "expect type %s, but %s", JSONSchema.Type.Boolean, obj.getClass());
    }
}
