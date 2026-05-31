package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.schema.UnresolvedReference;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import com.umeng.analytics.pro.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import p000.C0278;
import p000.C0387;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectSchema extends JSONSchema {
    final boolean additionalProperties;
    final JSONSchema additionalPropertySchema;
    final AllOf allOf;
    final AnyOf anyOf;
    final Map<String, JSONSchema> definitions;
    final Map<String, JSONSchema> defs;
    final Map<String, String[]> dependentRequired;
    final Map<Long, long[]> dependentRequiredHashCodes;
    final Map<String, JSONSchema> dependentSchemas;
    final Map<Long, JSONSchema> dependentSchemasHashMapping;
    final JSONSchema elseSchema;
    final boolean encoded;
    final JSONSchema ifSchema;
    final int maxProperties;
    final int minProperties;
    final OneOf oneOf;
    final PatternProperty[] patternProperties;
    final Map<String, JSONSchema> properties;
    final JSONSchema propertyNames;
    final Set<String> required;
    final long[] requiredHashCode;
    transient List<UnresolvedReference.ResolveTask> resolveTasks;
    final JSONSchema thenSchema;
    final boolean typed;

    /* JADX INFO: compiled from: obf */
    public static final class PatternProperty {
        final Pattern pattern;
        final JSONSchema schema;

        public PatternProperty(Pattern pattern, JSONSchema jSONSchema) {
            this.pattern = pattern;
            this.schema = jSONSchema;
        }
    }

    public ObjectSchema(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public void accept(Predicate<JSONSchema> predicate) {
        if (predicate.test(this)) {
            this.properties.values().forEach(new C0387(predicate, 2));
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public void addResolveTask(UnresolvedReference.ResolveTask resolveTask) {
        if (this.resolveTasks == null) {
            this.resolveTasks = new ArrayList();
        }
        this.resolveTasks.add(resolveTask);
    }

    public JSONSchema getDefs(String str) {
        return this.defs.get(str);
    }

    public Map<String, JSONSchema> getProperties() {
        return this.properties;
    }

    public JSONSchema getProperty(String str) {
        return this.properties.get(str);
    }

    public Set<String> getRequired() {
        return this.required;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.Object;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    @JSONField(true)
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(g.y, "object");
        String str = this.title;
        if (str != null) {
            jSONObject.put("title", str);
        }
        String str2 = this.description;
        if (str2 != null) {
            jSONObject.put("description", str2);
        }
        if (!this.definitions.isEmpty()) {
            jSONObject.put("definitions", this.definitions);
        }
        if (!this.defs.isEmpty()) {
            jSONObject.put("defs", this.defs);
        }
        if (!this.properties.isEmpty()) {
            jSONObject.put("properties", this.properties);
        }
        if (!this.required.isEmpty()) {
            jSONObject.put("required", this.required);
        }
        boolean z = this.additionalProperties;
        if (!z) {
            JSONSchema jSONSchema = this.additionalPropertySchema;
            if (jSONSchema != null) {
                jSONObject.put("additionalProperties", jSONSchema);
            } else {
                jSONObject.put("additionalProperties", Boolean.valueOf(z));
            }
        }
        PatternProperty[] patternPropertyArr = this.patternProperties;
        if (patternPropertyArr != null && patternPropertyArr.length != 0) {
            jSONObject.put("patternProperties", patternPropertyArr);
        }
        JSONSchema jSONSchema2 = this.propertyNames;
        if (jSONSchema2 != null) {
            jSONObject.put("propertyNames", jSONSchema2);
        }
        int i = this.minProperties;
        if (i != -1) {
            jSONObject.put("minProperties", Integer.valueOf(i));
        }
        int i2 = this.maxProperties;
        if (i2 != -1) {
            jSONObject.put("maxProperties", Integer.valueOf(i2));
        }
        Map<String, String[]> map = this.dependentRequired;
        if (map != null && !map.isEmpty()) {
            jSONObject.put("dependentRequired", this.dependentRequired);
        }
        Map<String, JSONSchema> map2 = this.dependentSchemas;
        if (map2 != null && !map2.isEmpty()) {
            jSONObject.put("dependentSchemas", this.dependentSchemas);
        }
        JSONSchema jSONSchema3 = this.ifSchema;
        if (jSONSchema3 != null) {
            jSONObject.put("if", jSONSchema3);
        }
        JSONSchema jSONSchema4 = this.thenSchema;
        if (jSONSchema4 != null) {
            jSONObject.put("then", jSONSchema4);
        }
        JSONSchema jSONSchema5 = this.elseSchema;
        if (jSONSchema5 != null) {
            jSONObject.put("else", jSONSchema5);
        }
        return JSONSchema.injectIfPresent(jSONObject, this.allOf, this.anyOf, this.oneOf);
    }

    public ValidateResult validate(Map map) {
        for (String str : this.required) {
            if (!map.containsKey(str)) {
                return new ValidateResult(false, "required %s", str);
            }
        }
        for (Map.Entry<String, JSONSchema> entry : this.properties.entrySet()) {
            String key = entry.getKey();
            JSONSchema value = entry.getValue();
            Object obj = map.get(key);
            if (obj != null || map.containsKey(key)) {
                ValidateResult validateResultValidate = value.validate(obj);
                if (!validateResultValidate.isSuccess()) {
                    return new ValidateResult(validateResultValidate, "property %s invalid", key);
                }
            }
        }
        for (PatternProperty patternProperty : this.patternProperties) {
            for (Map.Entry entry2 : map.entrySet()) {
                Object key2 = entry2.getKey();
                if (key2 instanceof String) {
                    if (patternProperty.pattern.matcher((String) key2).find()) {
                        ValidateResult validateResultValidate2 = patternProperty.schema.validate(entry2.getValue());
                        if (!validateResultValidate2.isSuccess()) {
                            return validateResultValidate2;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!this.additionalProperties) {
            for (Map.Entry entry3 : map.entrySet()) {
                Object key3 = entry3.getKey();
                if (!this.properties.containsKey(key3)) {
                    PatternProperty[] patternPropertyArr = this.patternProperties;
                    int length = patternPropertyArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            JSONSchema jSONSchema = this.additionalPropertySchema;
                            if (jSONSchema == null) {
                                return new ValidateResult(false, "add additionalProperties %s", key3);
                            }
                            ValidateResult validateResultValidate3 = jSONSchema.validate(entry3.getValue());
                            if (validateResultValidate3.isSuccess()) {
                                break;
                            }
                            return validateResultValidate3;
                        }
                        PatternProperty patternProperty2 = patternPropertyArr[i];
                        if (key3 instanceof String) {
                            if (patternProperty2.pattern.matcher((String) key3).find()) {
                                break;
                            }
                        }
                        i++;
                    }
                }
            }
        }
        if (this.propertyNames != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (!this.propertyNames.validate(it.next()).isSuccess()) {
                    return JSONSchema.FAIL_PROPERTY_NAME;
                }
            }
        }
        if (this.minProperties >= 0) {
            int size = map.size();
            int i2 = this.minProperties;
            if (size < i2) {
                return new ValidateResult(false, "minProperties not match, expect %s, but %s", Integer.valueOf(i2), Integer.valueOf(map.size()));
            }
        }
        if (this.maxProperties >= 0) {
            int size2 = map.size();
            int i3 = this.maxProperties;
            if (size2 > i3) {
                return new ValidateResult(false, "maxProperties not match, expect %s, but %s", Integer.valueOf(i3), Integer.valueOf(map.size()));
            }
        }
        Map<String, String[]> map2 = this.dependentRequired;
        if (map2 != null) {
            for (Map.Entry<String, String[]> entry4 : map2.entrySet()) {
                String key4 = entry4.getKey();
                if (map.get(key4) != null) {
                    for (String str2 : entry4.getValue()) {
                        if (!map.containsKey(str2)) {
                            return new ValidateResult(false, "property %s, dependentRequired property %s", key4, str2);
                        }
                    }
                }
            }
        }
        Map<String, JSONSchema> map3 = this.dependentSchemas;
        if (map3 != null) {
            for (Map.Entry<String, JSONSchema> entry5 : map3.entrySet()) {
                if (map.get(entry5.getKey()) != null) {
                    ValidateResult validateResultValidate4 = entry5.getValue().validate(map);
                    if (!validateResultValidate4.isSuccess()) {
                        return validateResultValidate4;
                    }
                }
            }
        }
        JSONSchema jSONSchema2 = this.ifSchema;
        if (jSONSchema2 != null) {
            if (jSONSchema2.validate(map) == JSONSchema.SUCCESS) {
                JSONSchema jSONSchema3 = this.thenSchema;
                if (jSONSchema3 != null) {
                    ValidateResult validateResultValidate5 = jSONSchema3.validate(map);
                    if (!validateResultValidate5.isSuccess()) {
                        return validateResultValidate5;
                    }
                }
            } else {
                JSONSchema jSONSchema4 = this.elseSchema;
                if (jSONSchema4 != null) {
                    ValidateResult validateResultValidate6 = jSONSchema4.validate(map);
                    if (!validateResultValidate6.isSuccess()) {
                        return validateResultValidate6;
                    }
                }
            }
        }
        AllOf allOf = this.allOf;
        if (allOf != null) {
            ValidateResult validateResultValidate7 = allOf.validate(map);
            if (!validateResultValidate7.isSuccess()) {
                return validateResultValidate7;
            }
        }
        AnyOf anyOf = this.anyOf;
        if (anyOf != null) {
            ValidateResult validateResultValidate8 = anyOf.validate(map);
            if (!validateResultValidate8.isSuccess()) {
                return validateResultValidate8;
            }
        }
        OneOf oneOf = this.oneOf;
        if (oneOf != null) {
            ValidateResult validateResultValidate9 = oneOf.validate(map);
            if (!validateResultValidate9.isSuccess()) {
                return validateResultValidate9;
            }
        }
        return JSONSchema.SUCCESS;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Object obj) {
        Object fieldValue;
        if (obj == null) {
            return this.typed ? JSONSchema.FAIL_INPUT_NULL : JSONSchema.SUCCESS;
        }
        if (this.encoded) {
            if (!(obj instanceof String)) {
                return JSONSchema.FAIL_INPUT_NOT_ENCODED;
            }
            try {
                obj = JSON.parseObject((String) obj);
            } catch (JSONException unused) {
                return JSONSchema.FAIL_INPUT_NOT_ENCODED;
            }
        }
        if (obj instanceof Map) {
            return validate((Map) obj);
        }
        Class<?> cls = obj.getClass();
        ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) cls);
        if (!(objectWriter instanceof ObjectWriterAdapter)) {
            return this.typed ? new ValidateResult(false, "expect type %s, but %s", JSONSchema.Type.Object, cls) : JSONSchema.SUCCESS;
        }
        int i = 0;
        while (true) {
            long[] jArr = this.requiredHashCode;
            String str = null;
            if (i >= jArr.length) {
                for (Map.Entry<String, JSONSchema> entry : this.properties.entrySet()) {
                    long jHashCode64 = Fnv.hashCode64(entry.getKey());
                    JSONSchema value = entry.getValue();
                    FieldWriter fieldWriter = objectWriter.getFieldWriter(jHashCode64);
                    if (fieldWriter != null && (fieldValue = fieldWriter.getFieldValue(obj)) != null) {
                        ValidateResult validateResultValidate = value.validate(fieldValue);
                        if (!validateResultValidate.isSuccess()) {
                            return validateResultValidate;
                        }
                    }
                }
                if (this.minProperties >= 0 || this.maxProperties >= 0) {
                    Iterator<FieldWriter> it = objectWriter.getFieldWriters().iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        if (it.next().getFieldValue(obj) != null) {
                            i2++;
                        }
                    }
                    int i3 = this.minProperties;
                    if (i3 >= 0 && i2 < i3) {
                        return new ValidateResult(false, "minProperties not match, expect %s, but %s", Integer.valueOf(i3), Integer.valueOf(i2));
                    }
                    int i4 = this.maxProperties;
                    if (i4 >= 0 && i2 > i4) {
                        return new ValidateResult(false, "maxProperties not match, expect %s, but %s", Integer.valueOf(i4), Integer.valueOf(i2));
                    }
                }
                Map<Long, long[]> map = this.dependentRequiredHashCodes;
                if (map != null) {
                    int i5 = 0;
                    for (Map.Entry<Long, long[]> entry2 : map.entrySet()) {
                        Long key = entry2.getKey();
                        long[] value2 = entry2.getValue();
                        if (objectWriter.getFieldWriter(key.longValue()).getFieldValue(obj) != null) {
                            for (int i6 = 0; i6 < value2.length; i6++) {
                                FieldWriter fieldWriter2 = objectWriter.getFieldWriter(value2[i6]);
                                if (fieldWriter2 == null || fieldWriter2.getFieldValue(obj) == null) {
                                    int i7 = 0;
                                    String str2 = null;
                                    for (Map.Entry<String, String[]> entry3 : this.dependentRequired.entrySet()) {
                                        if (i5 == i7) {
                                            String key2 = entry3.getKey();
                                            str2 = entry3.getValue()[i6];
                                            str = key2;
                                        }
                                        i7++;
                                    }
                                    return new ValidateResult(false, "property %s, dependentRequired property %s", str, str2);
                                }
                            }
                        }
                        i5++;
                    }
                }
                Map<Long, JSONSchema> map2 = this.dependentSchemasHashMapping;
                if (map2 != null) {
                    for (Map.Entry<Long, JSONSchema> entry4 : map2.entrySet()) {
                        FieldWriter fieldWriter3 = objectWriter.getFieldWriter(entry4.getKey().longValue());
                        if (fieldWriter3 != null && fieldWriter3.getFieldValue(obj) != null) {
                            ValidateResult validateResultValidate2 = entry4.getValue().validate(obj);
                            if (!validateResultValidate2.isSuccess()) {
                                return validateResultValidate2;
                            }
                        }
                    }
                }
                JSONSchema jSONSchema = this.ifSchema;
                if (jSONSchema != null) {
                    if (jSONSchema.validate(obj).isSuccess()) {
                        JSONSchema jSONSchema2 = this.thenSchema;
                        if (jSONSchema2 != null) {
                            ValidateResult validateResultValidate3 = jSONSchema2.validate(obj);
                            if (!validateResultValidate3.isSuccess()) {
                                return validateResultValidate3;
                            }
                        }
                    } else {
                        JSONSchema jSONSchema3 = this.elseSchema;
                        if (jSONSchema3 != null) {
                            ValidateResult validateResultValidate4 = jSONSchema3.validate(obj);
                            if (!validateResultValidate4.isSuccess()) {
                                return validateResultValidate4;
                            }
                        }
                    }
                }
                AllOf allOf = this.allOf;
                if (allOf != null) {
                    ValidateResult validateResultValidate5 = allOf.validate(obj);
                    if (!validateResultValidate5.isSuccess()) {
                        return validateResultValidate5;
                    }
                }
                AnyOf anyOf = this.anyOf;
                if (anyOf != null) {
                    ValidateResult validateResultValidate6 = anyOf.validate(obj);
                    if (!validateResultValidate6.isSuccess()) {
                        return validateResultValidate6;
                    }
                }
                OneOf oneOf = this.oneOf;
                if (oneOf != null) {
                    ValidateResult validateResultValidate7 = oneOf.validate(obj);
                    if (!validateResultValidate7.isSuccess()) {
                        return validateResultValidate7;
                    }
                }
                return JSONSchema.SUCCESS;
            }
            FieldWriter fieldWriter4 = objectWriter.getFieldWriter(jArr[i]);
            if ((fieldWriter4 != null ? fieldWriter4.getFieldValue(obj) : null) == null) {
                int i8 = 0;
                for (String str3 : this.required) {
                    if (i8 == i) {
                        str = str3;
                    }
                    i8++;
                }
                return new ValidateResult(false, "required property %s", str);
            }
            i++;
        }
    }

    public ObjectSchema(JSONObject jSONObject, JSONSchema jSONSchema) {
        JSONSchema jSONSchemaOf;
        super(jSONObject);
        this.typed = "object".equalsIgnoreCase(jSONObject.getString(g.y));
        this.properties = new LinkedHashMap();
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
            List<UnresolvedReference.ResolveTask> list = this.resolveTasks;
            if (list != null) {
                Iterator<UnresolvedReference.ResolveTask> it = list.iterator();
                while (it.hasNext()) {
                    it.next().resolve(this);
                }
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("properties");
        if (jSONObject4 != null) {
            for (Map.Entry<String, Object> entry3 : jSONObject4.entrySet()) {
                String key = entry3.getKey();
                Object value = entry3.getValue();
                if (value instanceof Boolean) {
                    jSONSchemaOf = ((Boolean) value).booleanValue() ? Any.INSTANCE : Any.NOT_ANY;
                } else if (value instanceof JSONSchema) {
                    jSONSchemaOf = (JSONSchema) value;
                } else {
                    jSONSchemaOf = JSONSchema.of((JSONObject) value, jSONSchema == null ? this : jSONSchema);
                }
                this.properties.put(key, jSONSchemaOf);
                if (jSONSchemaOf instanceof UnresolvedReference) {
                    (jSONSchema == null ? this : jSONSchema).addResolveTask(new UnresolvedReference.PropertyResolveTask(this.properties, key, ((UnresolvedReference) jSONSchemaOf).refName));
                }
            }
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("patternProperties");
        if (jSONObject5 != null) {
            this.patternProperties = new PatternProperty[jSONObject5.size()];
            int i = 0;
            for (Map.Entry<String, Object> entry4 : jSONObject5.entrySet()) {
                String key2 = entry4.getKey();
                Object value2 = entry4.getValue();
                this.patternProperties[i] = new PatternProperty(Pattern.compile(key2), value2 instanceof Boolean ? ((Boolean) value2).booleanValue() ? Any.INSTANCE : Any.NOT_ANY : JSONSchema.of((JSONObject) value2, jSONSchema == null ? this : jSONSchema));
                i++;
            }
        } else {
            this.patternProperties = new PatternProperty[0];
        }
        JSONArray jSONArray = jSONObject.getJSONArray("required");
        if (jSONArray == null || jSONArray.isEmpty()) {
            this.required = Collections.EMPTY_SET;
            this.requiredHashCode = new long[0];
        } else {
            this.required = new LinkedHashSet(jSONArray.size());
            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                this.required.add(jSONArray.getString(i2));
            }
            this.requiredHashCode = new long[this.required.size()];
            Iterator<String> it2 = this.required.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                this.requiredHashCode[i3] = Fnv.hashCode64(it2.next());
                i3++;
            }
        }
        Object obj = jSONObject.get("additionalProperties");
        if (obj instanceof Boolean) {
            this.additionalPropertySchema = null;
            this.additionalProperties = ((Boolean) obj).booleanValue();
        } else if (obj instanceof JSONObject) {
            this.additionalPropertySchema = JSONSchema.of((JSONObject) obj, jSONSchema);
            this.additionalProperties = false;
        } else {
            this.additionalPropertySchema = null;
            this.additionalProperties = true;
        }
        Object obj2 = jSONObject.get("propertyNames");
        if (obj2 == null) {
            this.propertyNames = null;
        } else if (obj2 instanceof Boolean) {
            this.propertyNames = ((Boolean) obj2).booleanValue() ? Any.INSTANCE : Any.NOT_ANY;
        } else {
            this.propertyNames = new StringSchema((JSONObject) obj2);
        }
        this.minProperties = jSONObject.getIntValue("minProperties", -1);
        this.maxProperties = jSONObject.getIntValue("maxProperties", -1);
        JSONObject jSONObject6 = jSONObject.getJSONObject("dependentRequired");
        if (jSONObject6 == null || jSONObject6.isEmpty()) {
            this.dependentRequired = null;
            this.dependentRequiredHashCodes = null;
        } else {
            this.dependentRequired = new LinkedHashMap(jSONObject6.size(), 1.0f);
            this.dependentRequiredHashCodes = new LinkedHashMap(jSONObject6.size(), 1.0f);
            for (String str : jSONObject6.keySet()) {
                String[] strArr = (String[]) jSONObject6.getObject(str, String[].class, new JSONReader.Feature[0]);
                long[] jArr = new long[strArr.length];
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    jArr[i4] = Fnv.hashCode64(strArr[i4]);
                }
                this.dependentRequired.put(str, strArr);
                this.dependentRequiredHashCodes.put(Long.valueOf(Fnv.hashCode64(str)), jArr);
            }
        }
        JSONObject jSONObject7 = jSONObject.getJSONObject("dependentSchemas");
        if (jSONObject7 == null || jSONObject7.isEmpty()) {
            this.dependentSchemas = null;
            this.dependentSchemasHashMapping = null;
        } else {
            this.dependentSchemas = new LinkedHashMap(jSONObject7.size(), 1.0f);
            this.dependentSchemasHashMapping = new LinkedHashMap(jSONObject7.size(), 1.0f);
            for (String str2 : jSONObject7.keySet()) {
                JSONSchema jSONSchema2 = (JSONSchema) jSONObject7.getObject(str2, new C0278(0));
                this.dependentSchemas.put(str2, jSONSchema2);
                this.dependentSchemasHashMapping.put(Long.valueOf(Fnv.hashCode64(str2)), jSONSchema2);
            }
        }
        this.ifSchema = (JSONSchema) jSONObject.getObject("if", new C0278(0));
        this.elseSchema = (JSONSchema) jSONObject.getObject("else", new C0278(0));
        this.thenSchema = (JSONSchema) jSONObject.getObject("then", new C0278(0));
        this.allOf = JSONSchema.allOf(jSONObject, null);
        this.anyOf = JSONSchema.anyOf(jSONObject, (Class) null);
        this.oneOf = JSONSchema.oneOf(jSONObject, (Class) null);
    }
}
