package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.umeng.analytics.pro.g;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class AllOf extends JSONSchema {
    final JSONSchema[] items;

    /* JADX INFO: renamed from: com.alibaba.fastjson2.schema.AllOf$1, reason: invalid class name */
    /* JADX INFO: compiled from: obf */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type;

        static {
            int[] iArr = new int[JSONSchema.Type.values().length];
            $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type = iArr;
            try {
                iArr[JSONSchema.Type.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[JSONSchema.Type.Integer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[JSONSchema.Type.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[JSONSchema.Type.Boolean.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[JSONSchema.Type.Array.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[JSONSchema.Type.Object.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public AllOf(JSONSchema[] jSONSchemaArr) {
        super(null, null);
        this.items = jSONSchemaArr;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.AllOf;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Object obj) {
        for (JSONSchema jSONSchema : this.items) {
            ValidateResult validateResultValidate = jSONSchema.validate(obj);
            if (!validateResultValidate.isSuccess()) {
                return validateResultValidate;
            }
        }
        return JSONSchema.SUCCESS;
    }

    public AllOf(JSONObject jSONObject, JSONSchema jSONSchema) {
        JSONSchema jSONSchemaOf;
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("allOf");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            this.items = new JSONSchema[jSONArray.size()];
            int i = 0;
            JSONSchema.Type type = null;
            while (i < this.items.length) {
                Object obj = jSONArray.get(i);
                if (obj instanceof Boolean) {
                    jSONSchemaOf = ((Boolean) obj).booleanValue() ? Any.INSTANCE : Any.NOT_ANY;
                } else {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.containsKey("$ref") && !jSONObject2.containsKey(g.y) && type != null) {
                        switch (AnonymousClass1.$SwitchMap$com$alibaba$fastjson2$schema$JSONSchema$Type[type.ordinal()]) {
                            case 1:
                                jSONSchemaOf = new StringSchema(jSONObject2);
                                break;
                            case 2:
                                jSONSchemaOf = new IntegerSchema(jSONObject2);
                                break;
                            case 3:
                                jSONSchemaOf = new NumberSchema(jSONObject2);
                                break;
                            case 4:
                                jSONSchemaOf = new BooleanSchema(jSONObject2);
                                break;
                            case 5:
                                jSONSchemaOf = new ArraySchema(jSONObject2, null);
                                break;
                            case 6:
                                jSONSchemaOf = new ObjectSchema(jSONObject2);
                                break;
                            default:
                                jSONSchemaOf = null;
                                break;
                        }
                    } else {
                        jSONSchemaOf = null;
                    }
                    if (jSONSchemaOf == null) {
                        jSONSchemaOf = JSONSchema.of(jSONObject2, jSONSchema);
                    }
                }
                JSONSchema.Type type2 = jSONSchemaOf.getType();
                this.items[i] = jSONSchemaOf;
                i++;
                type = type2;
            }
            return;
        }
        throw new JSONException("allOf not found");
    }
}
