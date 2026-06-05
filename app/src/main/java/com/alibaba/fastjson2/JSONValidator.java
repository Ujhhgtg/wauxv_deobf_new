package com.alibaba.fastjson2;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class JSONValidator {
    private final JSONReader jsonReader;
    private Type type;
    private Boolean validateResult;

    /* JADX INFO: compiled from: obf */
    public enum Type {
        Object,
        Array,
        Value
    }

    public JSONValidator(JSONReader jSONReader) {
        this.jsonReader = jSONReader;
    }

    public static JSONValidator from(String str) {
        return new JSONValidator(JSONReader.of(str));
    }

    public static JSONValidator fromUtf8(byte[] bArr) {
        return new JSONValidator(JSONReader.of(bArr));
    }

    public Type getType() {
        if (this.type == null) {
            validate();
        }
        return this.type;
    }

    public boolean validate() {
        Boolean bool = this.validateResult;
        try {
            if (bool != null) {
                return bool.booleanValue();
            }
            try {
                char cCurrent = this.jsonReader.current();
                this.jsonReader.skipValue();
                this.jsonReader.close();
                if (cCurrent == '{') {
                    this.type = Type.Object;
                } else if (cCurrent == '[') {
                    this.type = Type.Array;
                } else {
                    this.type = Type.Value;
                }
                boolean zIsEnd = this.jsonReader.isEnd();
                this.validateResult = Boolean.valueOf(zIsEnd);
                return zIsEnd;
            } catch (JSONException | ArrayIndexOutOfBoundsException unused) {
                this.validateResult = Boolean.FALSE;
                this.jsonReader.close();
                return false;
            }
        } catch (Throwable th) {
            this.jsonReader.close();
            throw th;
        }
    }

    public static JSONValidator from(JSONReader jSONReader) {
        return new JSONValidator(jSONReader);
    }
}
