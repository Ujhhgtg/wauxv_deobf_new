package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterBool<T> extends FieldWriter<T> {
    final char[] utf16Value0;
    final char[] utf16Value1;
    final char[] utf16ValueFalse;
    final char[] utf16ValueTrue;
    final byte[] utf8Value0;
    final byte[] utf8Value1;
    final byte[] utf8ValueFalse;
    final byte[] utf8ValueTrue;

    public FieldWriterBool(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, obj);
        byte[] bArr = this.nameWithColonUTF8;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + 4);
        byte[] bArr2 = this.nameWithColonUTF8;
        bArrCopyOf[bArr2.length] = 116;
        bArrCopyOf[bArr2.length + 1] = 114;
        bArrCopyOf[bArr2.length + 2] = 117;
        bArrCopyOf[bArr2.length + 3] = 101;
        this.utf8ValueTrue = bArrCopyOf;
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length + 5);
        byte[] bArr3 = this.nameWithColonUTF8;
        bArrCopyOf2[bArr3.length] = 102;
        bArrCopyOf2[bArr3.length + 1] = 97;
        bArrCopyOf2[bArr3.length + 2] = 108;
        bArrCopyOf2[bArr3.length + 3] = 115;
        bArrCopyOf2[bArr3.length + 4] = 101;
        this.utf8ValueFalse = bArrCopyOf2;
        byte[] bArrCopyOf3 = Arrays.copyOf(bArr3, bArr3.length + 1);
        byte[] bArr4 = this.nameWithColonUTF8;
        bArrCopyOf3[bArr4.length] = 49;
        this.utf8Value1 = bArrCopyOf3;
        byte[] bArrCopyOf4 = Arrays.copyOf(bArr4, bArr4.length + 1);
        bArrCopyOf4[this.nameWithColonUTF8.length] = 48;
        this.utf8Value0 = bArrCopyOf4;
        char[] cArr = this.nameWithColonUTF16;
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length + 4);
        char[] cArr2 = this.nameWithColonUTF16;
        cArrCopyOf[cArr2.length] = 't';
        cArrCopyOf[cArr2.length + 1] = 'r';
        cArrCopyOf[cArr2.length + 2] = 'u';
        cArrCopyOf[cArr2.length + 3] = 'e';
        this.utf16ValueTrue = cArrCopyOf;
        char[] cArrCopyOf2 = Arrays.copyOf(cArr2, cArr2.length + 5);
        char[] cArr3 = this.nameWithColonUTF16;
        cArrCopyOf2[cArr3.length] = 'f';
        cArrCopyOf2[cArr3.length + 1] = 'a';
        cArrCopyOf2[cArr3.length + 2] = 'l';
        cArrCopyOf2[cArr3.length + 3] = 's';
        cArrCopyOf2[cArr3.length + 4] = 'e';
        this.utf16ValueFalse = cArrCopyOf2;
        char[] cArrCopyOf3 = Arrays.copyOf(cArr3, cArr3.length + 1);
        char[] cArr4 = this.nameWithColonUTF16;
        cArrCopyOf3[cArr4.length] = '1';
        this.utf16Value1 = cArrCopyOf3;
        char[] cArrCopyOf4 = Arrays.copyOf(cArr4, cArr4.length + 1);
        cArrCopyOf4[this.nameWithColonUTF16.length] = '0';
        this.utf16Value0 = cArrCopyOf4;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        return this.propertyAccessor.getObject(t);
    }

    public boolean getFieldValueBoolean(T t) {
        if (t != null) {
            return ((Boolean) this.propertyAccessor.getObject(t)).booleanValue();
        }
        throw new JSONException("field.get error, " + this.fieldName);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        return cls == this.fieldClass ? ObjectWriterImplBoolean.INSTANCE : jSONWriter.getObjectWriter(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) {
        long features = this.features | jSONWriter.getFeatures();
        try {
            Boolean bool = (Boolean) this.propertyAccessor.getObject(t);
            if (bool != null) {
                writeBool(jSONWriter, bool.booleanValue());
                return true;
            }
            if ((33554512 & features) == 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            if ((features & 33554432L) != 0) {
                jSONWriter.writeBool(false);
            } else {
                jSONWriter.writeBooleanNull();
            }
            return true;
        } catch (RuntimeException e) {
            if ((features & 32768L) != 0) {
                return false;
            }
            throw errorOnGet(e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeBool(JSONWriter jSONWriter, boolean z) {
        char[] cArr;
        byte[] bArr;
        long features = jSONWriter.getFeatures(this.features);
        if (z || (JSONWriter.Feature.NotWriteDefaultValue.mask & features) == 0 || this.defaultValue != null) {
            if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & features) != 0) {
                writeFieldName(jSONWriter);
                jSONWriter.writeString(z ? "true" : "false");
                return;
            }
            if (jSONWriter.utf8) {
                if ((features & JSONWriter.Feature.WriteBooleanAsNumber.mask) != 0) {
                    bArr = z ? this.utf8Value1 : this.utf8Value0;
                } else {
                    bArr = z ? this.utf8ValueTrue : this.utf8ValueFalse;
                }
                jSONWriter.writeNameRaw(bArr);
                return;
            }
            if (!jSONWriter.utf16) {
                writeFieldName(jSONWriter);
                jSONWriter.writeBool(z);
            } else {
                if ((features & JSONWriter.Feature.WriteBooleanAsNumber.mask) != 0) {
                    cArr = z ? this.utf16Value1 : this.utf16Value0;
                } else {
                    cArr = z ? this.utf16ValueTrue : this.utf16ValueFalse;
                }
                jSONWriter.writeNameRaw(cArr);
            }
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        Boolean bool = (Boolean) this.propertyAccessor.getObject(t);
        if (bool == null) {
            jSONWriter.writeNull();
        } else {
            jSONWriter.writeBool(bool.booleanValue());
        }
    }
}
